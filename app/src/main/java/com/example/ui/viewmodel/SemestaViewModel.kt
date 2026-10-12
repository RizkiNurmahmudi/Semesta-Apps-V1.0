package com.example.ui.viewmodel

import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.CurriculumData
import com.example.data.local.SemestaDatabase
import com.example.data.local.entity.ConceptProgressEntity
import com.example.data.local.entity.UserBadgeEntity
import com.example.data.local.entity.UserProfileEntity
import com.example.data.diagnostic.DiagnosticResult
import com.example.data.export.StudentAcademicReport
import com.example.data.model.BadgeItem
import com.example.data.model.ConceptItem
import com.example.data.model.DepthLevel
import com.example.data.model.Domain
import com.example.data.model.LessonData
import com.example.data.model.UIMode
import com.example.data.repository.SemestaRepository
import com.example.util.pdf.PdfDocumentManager
import java.io.File
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

sealed class ScreenDestination {
    object Catalog : ScreenDestination()
    object SkillMap : ScreenDestination()
    object Progress : ScreenDestination()
    object Profiles : ScreenDestination()
    data class Lesson(val conceptId: String) : ScreenDestination()
    data class SimulationLab(val simId: String, val title: String) : ScreenDestination()
    object PlacementTest : ScreenDestination()
}

class SemestaViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: SemestaRepository

    // Navigation State
    private val _currentScreen = MutableStateFlow<ScreenDestination>(ScreenDestination.Catalog)
    val currentScreen: StateFlow<ScreenDestination> = _currentScreen.asStateFlow()

    // Active Profile ID
    private val _activeProfileId = MutableStateFlow("profile-kirana")
    val activeProfileId: StateFlow<String> = _activeProfileId.asStateFlow()

    // Filter states for catalog
    val searchQuery = MutableStateFlow("")
    val selectedDomain = MutableStateFlow<Domain?>(null)
    val selectedLevel = MutableStateFlow<DepthLevel?>(null)

    // Current lesson step index
    val lessonStepIndex = MutableStateFlow(0)

    // Quiz answering state
    val quizAnswers = MutableStateFlow<Map<String, String>>(emptyMap())
    val quizHintsUsed = MutableStateFlow<Map<String, Int>>(emptyMap())
    val quizSubmitted = MutableStateFlow(false)
    val quizLastScore = MutableStateFlow(0f)
    val quizMasteryGained = MutableStateFlow(0)

    // Gamification & Newly Unlocked Badge Celebration State
    val newlyUnlockedBadge = MutableStateFlow<BadgeItem?>(null)

    init {
        val db = SemestaDatabase.getInstance(application)
        repository = SemestaRepository(db.semestaDao(), db.lessonProgressDao())
        viewModelScope.launch {
            repository.ensureDefaultDataSeeded()
        }
    }

    val allProfiles: StateFlow<List<UserProfileEntity>> = repository.allProfiles
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val activeProfile: StateFlow<UserProfileEntity?> = combine(
        repository.allProfiles,
        _activeProfileId
    ) { profiles, activeId ->
        profiles.find { it.id == activeId } ?: profiles.firstOrNull()
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    val conceptProgressList: StateFlow<List<ConceptProgressEntity>> = combine(
        _activeProfileId,
        allProfiles
    ) { activeId, _ ->
        activeId
    }.combine(repository.allProfiles) { activeId, _ ->
        activeId
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), "profile-kirana")
        .let { activeIdFlow ->
            repository.getProgressForProfile("profile-kirana")
                .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())
        }

    val completedLessons = repository.getCompletedLessons("profile-kirana")
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val completedLessonIds: StateFlow<Set<String>> = repository.getCompletedLessons("profile-kirana")
        .map { list -> list.filter { it.isCompleted }.map { it.lessonId }.toSet() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptySet())

    val averageQuizScore = repository.getAverageQuizScore("profile-kirana")
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    val recentQuizScores = repository.getRecentQuizScores("profile-kirana")
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    @OptIn(ExperimentalCoroutinesApi::class)
    val earnedBadges: StateFlow<List<UserBadgeEntity>> = _activeProfileId
        .flatMapLatest { id -> repository.getBadgesForProfile(id) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun navigateTo(destination: ScreenDestination) {
        if (destination is ScreenDestination.Lesson) {
            lessonStepIndex.value = 0
            quizAnswers.value = emptyMap()
            quizHintsUsed.value = emptyMap()
            quizSubmitted.value = false
        }
        _currentScreen.value = destination
    }

    fun switchProfile(profileId: String) {
        _activeProfileId.value = profileId
    }

    fun createNewProfile(name: String, ageGroup: String, defaultMode: String, avatar: String) {
        viewModelScope.launch {
            repository.createProfile(name, ageGroup, defaultMode, avatar)
        }
    }

    fun deleteProfile(profileId: String) {
        viewModelScope.launch {
            repository.deleteProfile(profileId)
            val remaining = allProfiles.value.filter { it.id != profileId }
            if (remaining.isNotEmpty()) {
                _activeProfileId.value = remaining.first().id
            }
        }
    }

    fun updateProfileMode(newMode: UIMode) {
        val current = activeProfile.value ?: return
        viewModelScope.launch {
            repository.updateProfile(current.copy(defaultMode = newMode.name))
        }
    }

    fun recordQuizHint(questionId: String) {
        val current = quizHintsUsed.value[questionId] ?: 0
        quizHintsUsed.value = quizHintsUsed.value + (questionId to (current + 1))
    }

    fun recordQuizAnswer(questionId: String, answer: String) {
        quizAnswers.value = quizAnswers.value + (questionId to answer)
    }

    fun submitQuiz(lesson: LessonData) {
        val totalQuestions = lesson.quizQuestions.size
        if (totalQuestions == 0) return

        var correctCount = 0
        var totalHints = 0
        lesson.quizQuestions.forEach { q ->
            val ans = quizAnswers.value[q.id] ?: ""
            val hints = quizHintsUsed.value[q.id] ?: 0
            totalHints += hints

            if (q.type == "numeric") {
                val userFloat = ans.replace(",", ".").toFloatOrNull()
                val targetFloat = q.correctAnswer.replace(",", ".").toFloatOrNull()
                if (userFloat != null && targetFloat != null) {
                    val tol = q.tolerance ?: 0.5f
                    if (kotlin.math.abs(userFloat - targetFloat) <= tol) {
                        correctCount++
                    }
                }
            } else {
                if (ans.equals(q.correctAnswer, ignoreCase = true)) {
                    correctCount++
                }
            }
        }

        val rawScore = correctCount.toFloat() / totalQuestions
        val penalty = (totalHints * 0.05f).coerceAtMost(0.2f)
        val finalScore = (rawScore - penalty).coerceIn(0f, 1f)

        quizLastScore.value = finalScore
        quizSubmitted.value = true

        viewModelScope.launch {
            val (newMastery, _, newBadges) = repository.saveQuizResult(
                profileId = _activeProfileId.value,
                conceptId = lesson.conceptId,
                levelCode = lesson.level.code,
                score = finalScore,
                hintsUsed = totalHints
            )
            quizMasteryGained.value = newMastery
            if (newBadges.isNotEmpty()) {
                newlyUnlockedBadge.value = newBadges.first()
            }
        }
    }

    fun dismissBadgeCelebration() {
        newlyUnlockedBadge.value = null
    }

    fun onHomeLabVerified(conceptId: String) {
        viewModelScope.launch {
            val newBadges = repository.verifyHomeLabCompleted(_activeProfileId.value, conceptId)
            if (newBadges.isNotEmpty()) {
                newlyUnlockedBadge.value = newBadges.first()
            }
        }
    }

    fun applyPlacementDiagnosticResult(result: DiagnosticResult) {
        selectedLevel.value = result.overallLevel
        viewModelScope.launch {
            val newBadges = repository.completePlacementTest(
                profileId = _activeProfileId.value,
                recommendedLevelCode = result.overallLevel.code,
                bonusXp = 50
            )
            if (newBadges.isNotEmpty()) {
                newlyUnlockedBadge.value = newBadges.first()
            }
        }
    }

    suspend fun getAcademicReport(): StudentAcademicReport {
        return repository.getStudentAcademicReport(_activeProfileId.value)
    }

    fun exportAndShareCertificate(context: Context) {
        viewModelScope.launch {
            val report = repository.getStudentAcademicReport(_activeProfileId.value)
            val file = PdfDocumentManager.generateCertificatePdf(context, report)
            PdfDocumentManager.sharePdf(
                context,
                file,
                "Sertifikat Penghargaan Sains Semesta - ${report.studentName}"
            )
        }
    }

    fun exportAndShareReportCard(context: Context) {
        viewModelScope.launch {
            val report = repository.getStudentAcademicReport(_activeProfileId.value)
            val file = PdfDocumentManager.generateReportCardPdf(context, report)
            PdfDocumentManager.sharePdf(
                context,
                file,
                "Raport Evaluasi Akademik Sains Semesta - ${report.studentName}"
            )
        }
    }

    fun exportAndViewCertificate(context: Context) {
        viewModelScope.launch {
            val report = repository.getStudentAcademicReport(_activeProfileId.value)
            val file = PdfDocumentManager.generateCertificatePdf(context, report)
            PdfDocumentManager.viewPdf(context, file)
        }
    }

    fun exportAndViewReportCard(context: Context) {
        viewModelScope.launch {
            val report = repository.getStudentAcademicReport(_activeProfileId.value)
            val file = PdfDocumentManager.generateReportCardPdf(context, report)
            PdfDocumentManager.viewPdf(context, file)
        }
    }
}

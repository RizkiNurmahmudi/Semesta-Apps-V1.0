package com.example.data.repository

import com.example.data.CurriculumData
import com.example.data.local.dao.LessonProgressDao
import com.example.data.local.dao.SemestaDao
import com.example.data.local.entity.ConceptProgressEntity
import com.example.data.local.entity.LessonProgressEntity
import com.example.data.local.entity.QuizAttemptEntity
import com.example.data.local.entity.UserBadgeEntity
import com.example.data.local.entity.UserProfileEntity
import com.example.data.export.DomainAcademicReport
import com.example.data.export.StudentAcademicReport
import com.example.data.model.ConceptItem
import com.example.data.model.ConceptStatus
import com.example.data.model.Domain
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.math.roundToInt

class SemestaRepository(
    private val dao: SemestaDao,
    private val lessonProgressDao: LessonProgressDao
) {

    val achievementEngine = com.example.data.achievement.AchievementEngine(dao, lessonProgressDao)

    val allProfiles: Flow<List<UserProfileEntity>> = dao.getAllProfiles()

    fun getProfile(profileId: String): Flow<UserProfileEntity?> = dao.getProfileById(profileId)

    fun getProgressForProfile(profileId: String): Flow<List<ConceptProgressEntity>> =
        dao.getProgressForProfile(profileId)

    fun getBadgesForProfile(profileId: String): Flow<List<UserBadgeEntity>> =
        dao.getBadgesForProfile(profileId)

    fun getQuizAttempts(profileId: String): Flow<List<QuizAttemptEntity>> =
        dao.getAttemptsForProfile(profileId)

    // Lesson Progress Tracking methods
    fun getAllLessonProgress(profileId: String): Flow<List<LessonProgressEntity>> =
        lessonProgressDao.getAllProgressForProfile(profileId)

    fun getCompletedLessons(profileId: String): Flow<List<LessonProgressEntity>> =
        lessonProgressDao.getCompletedLessons(profileId)

    fun getCompletedTopicIds(profileId: String): Flow<List<String>> =
        lessonProgressDao.getCompletedTopicIds(profileId)

    fun getLessonProgress(profileId: String, lessonId: String): Flow<LessonProgressEntity?> =
        lessonProgressDao.getProgressByLessonIdFlow(profileId, lessonId)

    fun getAverageQuizScore(profileId: String): Flow<Float?> =
        lessonProgressDao.getAverageQuizScore(profileId)

    fun getCompletedLessonsCount(profileId: String): Flow<Int> =
        lessonProgressDao.getCompletedLessonsCount(profileId)

    fun getRecentQuizScores(profileId: String, limit: Int = 10): Flow<List<LessonProgressEntity>> =
        lessonProgressDao.getRecentQuizScores(profileId, limit)

    suspend fun saveLessonProgress(progress: LessonProgressEntity) =
        lessonProgressDao.insertOrUpdate(progress)

    suspend fun markLessonCompleted(profileId: String, lessonId: String) =
        lessonProgressDao.markCompleted(profileId, lessonId)

    suspend fun ensureDefaultDataSeeded() {
        val existing = dao.getAllProfiles().firstOrNull()
        if (existing.isNullOrEmpty()) {
            val initialProfiles = listOf(
                UserProfileEntity(
                    id = "profile-kirana",
                    name = "Kirana",
                    avatarEmoji = "🚀",
                    defaultMode = "PENJELAJAH",
                    ageGroup = "8–12 thn",
                    totalXp = 240,
                    currentStreak = 5
                ),
                UserProfileEntity(
                    id = "profile-dimas",
                    name = "Dimas",
                    avatarEmoji = "🔬",
                    defaultMode = "PELAJAR",
                    ageGroup = "13–18 thn",
                    totalXp = 480,
                    currentStreak = 12
                ),
                UserProfileEntity(
                    id = "profile-bua-ratna",
                    name = "Bu Ratna",
                    avatarEmoji = "📚",
                    defaultMode = "PELAJAR",
                    ageGroup = "35–55 thn",
                    totalXp = 310,
                    currentStreak = 3
                ),
                UserProfileEntity(
                    id = "profile-arya",
                    name = "Arya",
                    avatarEmoji = "🔭",
                    defaultMode = "AHLI",
                    ageGroup = "18–30 thn",
                    totalXp = 620,
                    currentStreak = 18
                )
            )
            for (p in initialProfiles) {
                dao.insertProfile(p)
            }

            // Seed initial concept progress for Kirana
            dao.insertOrUpdateProgress(
                ConceptProgressEntity(
                    profileId = "profile-kirana",
                    conceptId = "fis-gerak-parabola",
                    levelCode = "L2",
                    status = ConceptStatus.SEDANG.name,
                    masteryPercent = 60,
                    lastReviewedTimestamp = System.currentTimeMillis() - 86400000L,
                    nextReviewEpochDay = (System.currentTimeMillis() / 86400000L) + 1,
                    leitnerBox = 2
                )
            )
            dao.insertOrUpdateProgress(
                ConceptProgressEntity(
                    profileId = "profile-kirana",
                    conceptId = "fis-gerak-lurus",
                    levelCode = "L2",
                    status = ConceptStatus.DIKUASAI.name,
                    masteryPercent = 92,
                    lastReviewedTimestamp = System.currentTimeMillis() - 172800000L,
                    nextReviewEpochDay = (System.currentTimeMillis() / 86400000L) + 5,
                    leitnerBox = 4
                )
            )
            dao.insertOrUpdateProgress(
                ConceptProgressEntity(
                    profileId = "profile-kirana",
                    conceptId = "mat-pecahan-rasio",
                    levelCode = "L2",
                    status = ConceptStatus.DIKUASAI.name,
                    masteryPercent = 78,
                    lastReviewedTimestamp = System.currentTimeMillis() - 259200000L,
                    nextReviewEpochDay = (System.currentTimeMillis() / 86400000L) + 2,
                    leitnerBox = 3
                )
            )

            // Seed initial lesson_progress for Kirana
            lessonProgressDao.insertOrUpdate(
                LessonProgressEntity(
                    profileId = "profile-kirana",
                    lessonId = "fis-gerak-lurus",
                    topicId = "Kinematika",
                    title = "Gerak Lurus (GLB & GLBB)",
                    domain = "FISIKA",
                    levelCode = "L2",
                    isCompleted = true,
                    completedAt = System.currentTimeMillis() - 172800000L,
                    highestQuizScore = 1.0f,
                    latestQuizScore = 1.0f,
                    quizAttemptsCount = 2,
                    timeSpentSeconds = 900,
                    masteryPercent = 92
                )
            )
            lessonProgressDao.insertOrUpdate(
                LessonProgressEntity(
                    profileId = "profile-kirana",
                    lessonId = "mat-pecahan-rasio",
                    topicId = "Bilangan & Operasi",
                    title = "Pecahan & Rasio",
                    domain = "MATEMATIKA",
                    levelCode = "L2",
                    isCompleted = true,
                    completedAt = System.currentTimeMillis() - 259200000L,
                    highestQuizScore = 0.85f,
                    latestQuizScore = 0.85f,
                    quizAttemptsCount = 1,
                    timeSpentSeconds = 720,
                    masteryPercent = 78
                )
            )
            lessonProgressDao.insertOrUpdate(
                LessonProgressEntity(
                    profileId = "profile-kirana",
                    lessonId = "fis-gerak-parabola",
                    topicId = "Kinematika 2D",
                    title = "Gerak Parabola",
                    domain = "FISIKA",
                    levelCode = "L2",
                    isCompleted = false,
                    highestQuizScore = 0.67f,
                    latestQuizScore = 0.67f,
                    quizAttemptsCount = 1,
                    timeSpentSeconds = 1080,
                    masteryPercent = 60
                )
            )

            // Seed badges
            dao.insertBadge(UserBadgeEntity(profileId = "profile-kirana", badgeId = "badge-streak-7"))
            dao.insertBadge(UserBadgeEntity(profileId = "profile-kirana", badgeId = "badge-mastery-3"))
        }
    }

    suspend fun saveQuizResult(
        profileId: String,
        conceptId: String,
        levelCode: String,
        score: Float,
        hintsUsed: Int
    ): Triple<Int, String, List<com.example.data.model.BadgeItem>> {
        // Record attempt
        dao.insertQuizAttempt(
            QuizAttemptEntity(
                profileId = profileId,
                conceptId = conceptId,
                levelCode = levelCode,
                score = score,
                hintsUsed = hintsUsed
            )
        )

        // Read or init progress
        val existingProgress = dao.getConceptProgress(profileId, conceptId)
        val oldMastery = existingProgress?.masteryPercent ?: 0
        val oldBox = existingProgress?.leitnerBox ?: 1

        // Exponential Moving Average (EMA) formula:
        val targetMastery = (score * 100).toInt()
        val newMastery = (oldMastery + 0.4f * (targetMastery - oldMastery)).roundToInt().coerceIn(0, 100)

        // Leitner Box progression
        val newBox = when {
            score >= 0.8f -> (oldBox + 1).coerceAtMost(5)
            score < 0.6f -> 1
            else -> oldBox
        }

        val reviewIntervalDays = when (newBox) {
            1 -> 1L
            2 -> 3L
            3 -> 7L
            4 -> 14L
            else -> 30L
        }
        val currentEpochDay = System.currentTimeMillis() / (24 * 60 * 60 * 1000)
        val nextReviewDay = currentEpochDay + reviewIntervalDays

        val newStatus = when {
            newMastery >= 80 -> ConceptStatus.DIKUASAI.name
            newMastery > 0 -> ConceptStatus.SEDANG.name
            else -> ConceptStatus.TERSEDIA.name
        }

        dao.insertOrUpdateProgress(
            ConceptProgressEntity(
                id = existingProgress?.id ?: 0,
                profileId = profileId,
                conceptId = conceptId,
                levelCode = levelCode,
                status = newStatus,
                masteryPercent = newMastery,
                lastReviewedTimestamp = System.currentTimeMillis(),
                nextReviewEpochDay = nextReviewDay,
                leitnerBox = newBox
            )
        )

        // Also track in lesson_progress
        val conceptItem = CurriculumData.allConcepts.find { it.id == conceptId }
        val existingLessonProgress = lessonProgressDao.getProgressByLessonId(profileId, conceptId)
        val isNowCompleted = (existingLessonProgress?.isCompleted == true) || (score >= 0.7f)
        val completedTimestamp = if (isNowCompleted) (existingLessonProgress?.completedAt ?: System.currentTimeMillis()) else null

        val highestScore = maxOf(existingLessonProgress?.highestQuizScore ?: 0f, score)
        val attempts = (existingLessonProgress?.quizAttemptsCount ?: 0) + 1

        lessonProgressDao.insertOrUpdate(
            LessonProgressEntity(
                id = existingLessonProgress?.id ?: 0,
                profileId = profileId,
                lessonId = conceptId,
                topicId = conceptItem?.topic ?: "Topik",
                title = conceptItem?.title ?: conceptId,
                domain = conceptItem?.domain?.name ?: "FISIKA",
                levelCode = levelCode,
                isCompleted = isNowCompleted,
                completedAt = completedTimestamp,
                lastAccessedAt = System.currentTimeMillis(),
                highestQuizScore = highestScore,
                latestQuizScore = score,
                quizAttemptsCount = attempts,
                timeSpentSeconds = (existingLessonProgress?.timeSpentSeconds ?: 0) + 300,
                masteryPercent = newMastery
            )
        )

        // Update profile XP & streak
        val profile = dao.getProfileById(profileId).firstOrNull()
        if (profile != null) {
            val xpGain = 20 + (score * 30).toInt()
            val lastActive = profile.lastActiveEpochDay
            val streakBonus = if (currentEpochDay > lastActive) {
                if (currentEpochDay - lastActive <= 2) profile.currentStreak + 1 else 1
            } else profile.currentStreak

            dao.updateProfile(
                profile.copy(
                    totalXp = profile.totalXp + xpGain,
                    currentStreak = streakBonus,
                    lastActiveEpochDay = currentEpochDay
                )
            )

            // Dynamic badge evaluation via AchievementEngine
            val newBadges = achievementEngine.evaluateBadges(
                profileId = profileId,
                currentConceptId = conceptId,
                quizScore = score,
                hintsUsed = hintsUsed
            )
            return Triple(newMastery, newStatus, newBadges)
        }

        return Triple(newMastery, newStatus, emptyList())
    }

    suspend fun verifyHomeLabCompleted(profileId: String, conceptId: String): List<com.example.data.model.BadgeItem> {
        return achievementEngine.evaluateBadges(
            profileId = profileId,
            currentConceptId = conceptId,
            isHomeLabDone = true
        )
    }

    suspend fun completePlacementTest(profileId: String, recommendedLevelCode: String, bonusXp: Int = 50): List<com.example.data.model.BadgeItem> {
        val profile = dao.getProfileById(profileId).firstOrNull()
        if (profile != null) {
            dao.updateProfile(profile.copy(totalXp = profile.totalXp + bonusXp))
        }
        val diagnosticBadgeId = "badge-diagnostic-tested"
        val existingBadges = dao.getBadgesForProfile(profileId).firstOrNull() ?: emptyList()
        val newlyUnlocked = mutableListOf<com.example.data.model.BadgeItem>()
        if (existingBadges.none { it.badgeId == diagnosticBadgeId }) {
            dao.insertBadge(UserBadgeEntity(profileId = profileId, badgeId = diagnosticBadgeId))
            com.example.data.achievement.BadgeRegistry.getBadgeById(diagnosticBadgeId)?.let {
                newlyUnlocked.add(it)
            }
        }
        return newlyUnlocked
    }

    suspend fun createProfile(name: String, ageGroup: String, defaultMode: String, avatar: String) {
        val newId = "profile-" + System.currentTimeMillis()
        dao.insertProfile(
            UserProfileEntity(
                id = newId,
                name = name,
                avatarEmoji = avatar,
                defaultMode = defaultMode,
                ageGroup = ageGroup,
                totalXp = 0,
                currentStreak = 1
            )
        )
    }

    suspend fun deleteProfile(profileId: String) {
        dao.deleteProfile(profileId)
        lessonProgressDao.deleteAllForProfile(profileId)
    }

    suspend fun updateProfile(profile: UserProfileEntity) {
        dao.updateProfile(profile)
    }

    suspend fun getStudentAcademicReport(profileId: String): StudentAcademicReport {
        val profile = dao.getProfileById(profileId).firstOrNull() ?: UserProfileEntity(
            id = profileId,
            name = "Siswa Semesta",
            avatarEmoji = "🚀",
            ageGroup = "10–14 thn",
            defaultMode = "PELAJAR",
            totalXp = 100,
            currentStreak = 1
        )

        val allProgress = lessonProgressDao.getAllProgressForProfile(profileId).firstOrNull() ?: emptyList()
        val badges = dao.getBadgesForProfile(profileId).firstOrNull() ?: emptyList()
        val allConcepts = CurriculumData.allConcepts

        // 4 Domain Reports
        val domainReports = Domain.values().map { domain ->
            val domainConcepts = allConcepts.filter { it.domain == domain }
            val domainProgress = allProgress.filter { it.domain.equals(domain.name, ignoreCase = true) }
            val completedInDomain = domainProgress.count { it.isCompleted }
            val avgMastery = if (domainProgress.isNotEmpty()) {
                domainProgress.map { it.masteryPercent }.average().toInt()
            } else 0

            val gradeLetter = when {
                avgMastery >= 90 -> "A+"
                avgMastery >= 80 -> "A"
                avgMastery >= 70 -> "B+"
                avgMastery >= 60 -> "B"
                avgMastery >= 50 -> "C"
                else -> if (completedInDomain > 0) "C" else "-"
            }

            val topMastered = domainProgress.maxByOrNull { it.masteryPercent }?.title ?: "Konsep Pengantar"

            DomainAcademicReport(
                domain = domain,
                domainTitle = domain.name.lowercase().replaceFirstChar { it.uppercase() },
                completedCount = completedInDomain,
                totalCount = domainConcepts.size,
                averageMasteryPercent = avgMastery,
                gradeLetter = gradeLetter,
                topMasteredTopic = topMastered
            )
        }

        val totalCompleted = allProgress.count { it.isCompleted }
        val homeLabsDone = badges.count { it.badgeId == "badge-home-lab-champion" }

        val dateFormat = SimpleDateFormat("dd MMMM yyyy", Locale("id", "ID"))
        val dateString = dateFormat.format(Date())

        val certNumber = "SEM-2026-${profile.id.takeLast(4).uppercase()}-${profile.name.take(4).uppercase()}"

        val adviceText = when {
            profile.totalXp >= 300 -> "Prestasi luar biasa! Siswa mendemonstrasikan penguasaan sains analitis yang mendalam lintas pilar ilmu. Pertahankan rasa ingin tahu ilmiah untuk tantangan kalkulus dan fisika tingkat lanjut!"
            profile.totalXp >= 150 -> "Kemajuan belajar sangat baik dan konsisten. Siswa memiliki pemahaman konsep yang kokoh dan aktif dalam eksplorasi laboratorium simulasi. Disarankan memperbanyak variasi kuis formatif untuk memantapkan intuisi rumus."
            else -> "Langkah awal yang menjanjikan. Siswa mulai mengenal konsep-konsep dasar sains dengan antusias. Disarankan untuk terus rutin belajar setiap hari dan mencoba eksperimen praktikum rumahan (Home Lab) untuk mengaitkan teori dengan fenomena nyata di sekeliling."
        }

        return StudentAcademicReport(
            profileId = profileId,
            studentName = profile.name,
            avatarEmoji = profile.avatarEmoji,
            ageGroup = profile.ageGroup,
            defaultMode = profile.defaultMode,
            totalXp = profile.totalXp,
            streakDays = profile.currentStreak,
            totalCompletedLessons = totalCompleted,
            totalConceptsCount = allConcepts.size,
            homeLabsVerifiedCount = if (homeLabsDone > 0) 1 else 0,
            badgesEarnedCount = badges.size,
            reportDateString = dateString,
            certificateId = certNumber,
            domainReports = domainReports,
            overallEvaluationText = adviceText
        )
    }
}

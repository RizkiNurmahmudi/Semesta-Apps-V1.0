package com.example.data.achievement

import com.example.data.local.dao.LessonProgressDao
import com.example.data.local.dao.SemestaDao
import com.example.data.local.entity.UserBadgeEntity
import com.example.data.model.BadgeItem
import kotlinx.coroutines.flow.firstOrNull

class AchievementEngine(
    private val dao: SemestaDao,
    private val lessonProgressDao: LessonProgressDao
) {

    /**
     * Mengevaluasi seluruh kriteria lencana secara reaktif dan menyimpan lencana baru yang berhasil diraih.
     * Mengembalikan daftar BadgeItem yang baru pertama kali dibuka untuk memicu perayaan.
     */
    suspend fun evaluateBadges(
        profileId: String,
        currentConceptId: String? = null,
        quizScore: Float? = null,
        hintsUsed: Int? = null,
        isHomeLabDone: Boolean = false
    ): List<BadgeItem> {
        val alreadyEarnedIds = dao.getBadgesForProfile(profileId).firstOrNull()
            ?.map { it.badgeId }?.toSet() ?: emptySet()

        val allLessonProgress = lessonProgressDao.getAllProgressForProfile(profileId).firstOrNull() ?: emptyList()
        val profile = dao.getProfileById(profileId).firstOrNull()

        val completedLessons = allLessonProgress.filter { it.isCompleted }
        val completedConceptIds = completedLessons.map { it.lessonId }.toMutableSet()
        if (currentConceptId != null && (quizScore ?: 0f) >= 0.7f) {
            completedConceptIds.add(currentConceptId)
        }

        val physicsCompleted = completedLessons.count { it.domain.equals("FISIKA", ignoreCase = true) }
        val mathCompleted = completedLessons.count { it.domain.equals("MATEMATIKA", ignoreCase = true) }
        val chemistryCompleted = completedLessons.count { it.domain.equals("KIMIA", ignoreCase = true) }
        val biologyCompleted = completedLessons.count { it.domain.equals("BIOLOGI", ignoreCase = true) }
        val streak = profile?.currentStreak ?: 1

        val newlyEarned = mutableListOf<BadgeItem>()

        for (detailedBadge in BadgeRegistry.allDetailedBadges) {
            val badge = detailedBadge.item
            if (alreadyEarnedIds.contains(badge.id)) continue

            val isQualified = when (badge.id) {
                // Spesial & Langkah Awal
                "badge-scientist-first" -> completedConceptIds.isNotEmpty()
                "badge-home-lab-champion" -> isHomeLabDone
                "badge-scholar-5" -> completedConceptIds.size >= 5
                "badge-polymath-10" -> physicsCompleted >= 1 && mathCompleted >= 1 && chemistryCompleted >= 1 && biologyCompleted >= 1

                // Pilar Fisika
                "badge-parabola" -> (currentConceptId == "fis-gerak-parabola" && (quizScore ?: 0f) >= 0.75f) ||
                        completedConceptIds.contains("fis-gerak-parabola")
                "badge-newton" -> (currentConceptId?.contains("newton") == true) ||
                        completedConceptIds.any { it.contains("newton") }
                "badge-circuit" -> (currentConceptId?.contains("listrik") == true || currentConceptId?.contains("ohm") == true) ||
                        completedConceptIds.any { it.contains("listrik") || it.contains("ohm") }
                "badge-quantum-phys" -> (currentConceptId?.contains("kuantum") == true || currentConceptId?.contains("modern") == true) ||
                        completedConceptIds.any { it.contains("kuantum") || it.contains("modern") }

                // Pilar Matematika
                "badge-fraction" -> completedConceptIds.contains("mat-pecahan-rasio") || currentConceptId == "mat-pecahan-rasio"
                "badge-math-wizard" -> completedConceptIds.contains("mat-trigonometri-dasar") || currentConceptId == "mat-trigonometri-dasar"
                "badge-calculus" -> completedConceptIds.any { it.contains("limit") || it.contains("turunan") || it.contains("integral") } ||
                        (currentConceptId?.contains("turunan") == true)
                "badge-matrix" -> completedConceptIds.any { it.contains("matriks") || it.contains("vektor") } ||
                        (currentConceptId?.contains("matriks") == true)

                // Pilar Kimia
                "badge-alchemist" -> completedConceptIds.contains("kim-asam-basa") || currentConceptId == "kim-asam-basa"
                "badge-stoichiometry" -> completedConceptIds.any { it.contains("stoikiometri") || it.contains("reaksi") } ||
                        (currentConceptId?.contains("stoikiometri") == true)
                "badge-bohr-atom" -> completedConceptIds.any { it.contains("atom") || it.contains("bohr") } ||
                        (currentConceptId?.contains("atom") == true)
                "badge-gas-laws" -> completedConceptIds.any { it.contains("gas") || it.contains("termo") } ||
                        (currentConceptId?.contains("gas") == true)

                // Pilar Biologi
                "badge-bio-botanist" -> completedConceptIds.contains("bio-fotosintesis") || currentConceptId == "bio-fotosintesis"
                "badge-mendel" -> completedConceptIds.any { it.contains("mendel") || it.contains("genetika") } ||
                        (currentConceptId?.contains("mendel") == true)
                "badge-ecology" -> completedConceptIds.any { it.contains("ekologi") || it.contains("ekosistem") } ||
                        (currentConceptId?.contains("ekologi") == true)
                "badge-bio-molecular" -> completedConceptIds.any { it.contains("sel") || it.contains("biomolekul") } ||
                        (currentConceptId?.contains("sel") == true)

                // Mastery & Kuis
                "badge-perfect-score" -> (quizScore ?: 0f) >= 0.99f
                "badge-independent-thinker" -> (quizScore ?: 0f) >= 0.75f && (hintsUsed ?: 0) == 0
                "badge-mastery-3" -> allLessonProgress.count { it.masteryPercent >= 80 } >= 3

                // Konsistensi & Streak
                "badge-streak-3" -> streak >= 3
                "badge-streak-7" -> streak >= 7

                else -> false
            }

            if (isQualified) {
                dao.insertBadge(
                    UserBadgeEntity(
                        profileId = profileId,
                        badgeId = badge.id,
                        earnedTimestamp = System.currentTimeMillis()
                    )
                )
                newlyEarned.add(badge)
            }
        }

        return newlyEarned
    }
}

package com.example.data

import com.example.data.curriculum.BiologyCurriculum
import com.example.data.curriculum.ChemistryCurriculum
import com.example.data.curriculum.MathCurriculum
import com.example.data.curriculum.PhysicsCurriculum
import com.example.data.model.BadgeItem
import com.example.data.model.ConceptItem
import com.example.data.model.LessonData

object CurriculumData {

    val allConcepts: List<ConceptItem> = listOf(
        // FISIKA
        PhysicsCurriculum.concepts,
        // MATEMATIKA
        MathCurriculum.concepts,
        // KIMIA
        ChemistryCurriculum.concepts,
        // BIOLOGI
        BiologyCurriculum.concepts
    ).flatten()

    val allBadges: List<BadgeItem>
        get() = com.example.data.achievement.BadgeRegistry.allBadges

    fun getLesson(conceptId: String): LessonData {
        return PhysicsCurriculum.getLesson(conceptId)
            ?: MathCurriculum.getLesson(conceptId)
            ?: ChemistryCurriculum.getLesson(conceptId)
            ?: BiologyCurriculum.getLesson(conceptId)
            ?: PhysicsCurriculum.getLesson("fis-gerak-parabola")!!
    }
}

package com.example.data.curriculum

import com.example.data.model.ConceptItem
import com.example.data.model.LessonData

object BiologyCurriculum {

    val concepts: List<ConceptItem> = listOf(
        BiologyLevel1Curriculum.concepts,
        BiologyLevel2Curriculum.concepts,
        BiologyLevel3Curriculum.concepts,
        BiologyLevel4Curriculum.concepts,
        BiologyLevel5Curriculum.concepts,
        BiologyLevel6Curriculum.concepts,
        BiologyLevel7Curriculum.concepts
    ).flatten()

    fun getLesson(conceptId: String): LessonData? {
        return BiologyLevel1Curriculum.getLesson(conceptId)
            ?: BiologyLevel2Curriculum.getLesson(conceptId)
            ?: BiologyLevel3Curriculum.getLesson(conceptId)
            ?: BiologyLevel4Curriculum.getLesson(conceptId)
            ?: BiologyLevel5Curriculum.getLesson(conceptId)
            ?: BiologyLevel6Curriculum.getLesson(conceptId)
            ?: BiologyLevel7Curriculum.getLesson(conceptId)
    }
}

package com.example.data.curriculum

import com.example.data.model.ConceptItem
import com.example.data.model.LessonData

object MathCurriculum {

    val concepts: List<ConceptItem> = listOf(
        MathLevel1Curriculum.concepts,
        MathLevel2Curriculum.concepts,
        MathLevel3Curriculum.concepts,
        MathLevel4Curriculum.concepts,
        MathLevel5Curriculum.concepts,
        MathLevel6Curriculum.concepts,
        MathLevel7Curriculum.concepts,
        MathLevel8Curriculum.concepts
    ).flatten()

    fun getLesson(conceptId: String): LessonData? {
        return MathLevel1Curriculum.getLesson(conceptId)
            ?: MathLevel2Curriculum.getLesson(conceptId)
            ?: MathLevel3Curriculum.getLesson(conceptId)
            ?: MathLevel4Curriculum.getLesson(conceptId)
            ?: MathLevel5Curriculum.getLesson(conceptId)
            ?: MathLevel6Curriculum.getLesson(conceptId)
            ?: MathLevel7Curriculum.getLesson(conceptId)
            ?: MathLevel8Curriculum.getLesson(conceptId)
    }
}

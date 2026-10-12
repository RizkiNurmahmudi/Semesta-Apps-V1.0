package com.example.data.curriculum

import com.example.data.model.ConceptItem
import com.example.data.model.LessonData

object ChemistryCurriculum {

    val concepts: List<ConceptItem> = listOf(
        ChemistryLevel1Curriculum.concepts,
        ChemistryLevel2Curriculum.concepts,
        ChemistryLevel3Curriculum.concepts,
        ChemistryLevel4Curriculum.concepts,
        ChemistryLevel5Curriculum.concepts,
        ChemistryLevel6Curriculum.concepts,
        ChemistryLevel7Curriculum.concepts
    ).flatten()

    fun getLesson(conceptId: String): LessonData? {
        return ChemistryLevel1Curriculum.getLesson(conceptId)
            ?: ChemistryLevel2Curriculum.getLesson(conceptId)
            ?: ChemistryLevel3Curriculum.getLesson(conceptId)
            ?: ChemistryLevel4Curriculum.getLesson(conceptId)
            ?: ChemistryLevel5Curriculum.getLesson(conceptId)
            ?: ChemistryLevel6Curriculum.getLesson(conceptId)
            ?: ChemistryLevel7Curriculum.getLesson(conceptId)
    }
}

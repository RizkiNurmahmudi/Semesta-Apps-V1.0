package com.example.data.curriculum

import com.example.data.model.ConceptItem
import com.example.data.model.LessonData

object PhysicsCurriculum {

    val concepts: List<ConceptItem> = listOf(
        PhysicsLevel1Curriculum.concepts,
        PhysicsLevel2Curriculum.concepts,
        PhysicsLevel3Curriculum.concepts,
        PhysicsLevel4Curriculum.concepts,
        PhysicsLevel5Curriculum.concepts,
        PhysicsLevel6Curriculum.concepts,
        PhysicsLevel7Curriculum.concepts
    ).flatten()

    fun getLesson(conceptId: String): LessonData? {
        return PhysicsLevel1Curriculum.getLesson(conceptId)
            ?: PhysicsLevel2Curriculum.getLesson(conceptId)
            ?: PhysicsLevel3Curriculum.getLesson(conceptId)
            ?: PhysicsLevel4Curriculum.getLesson(conceptId)
            ?: PhysicsLevel5Curriculum.getLesson(conceptId)
            ?: PhysicsLevel6Curriculum.getLesson(conceptId)
            ?: PhysicsLevel7Curriculum.getLesson(conceptId)
    }
}

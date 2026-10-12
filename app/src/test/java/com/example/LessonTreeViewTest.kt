package com.example

import com.example.data.CurriculumData
import com.example.data.model.DepthLevel
import com.example.data.model.Domain
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class LessonTreeViewTest {

    @Test
    fun testAllFourDomainsPresentInCurriculum() {
        val domainsInCurriculum = CurriculumData.allConcepts.map { it.domain }.toSet()
        assertTrue("Physics must be present", domainsInCurriculum.contains(Domain.FISIKA))
        assertTrue("Math must be present", domainsInCurriculum.contains(Domain.MATEMATIKA))
        assertTrue("Chemistry must be present", domainsInCurriculum.contains(Domain.KIMIA))
        assertTrue("Biology must be present", domainsInCurriculum.contains(Domain.BIOLOGI))
        assertEquals(4, domainsInCurriculum.size)
    }

    @Test
    fun testConceptsGroupedByLevel() {
        val grouped = CurriculumData.allConcepts.groupBy { it.level }
        assertTrue("Level L0 should have concepts", (grouped[DepthLevel.L0]?.size ?: 0) >= 2)
        assertTrue("Level L1 should have concepts", (grouped[DepthLevel.L1]?.size ?: 0) >= 2)
        assertTrue("Level L2 should have concepts", (grouped[DepthLevel.L2]?.size ?: 0) >= 4)
        assertTrue("Level L3 should have concepts", (grouped[DepthLevel.L3]?.size ?: 0) >= 3)
        assertTrue("Level L4 should have concepts", (grouped[DepthLevel.L4]?.size ?: 0) >= 30)
        assertTrue("Level L5 should have concepts", (grouped[DepthLevel.L5]?.size ?: 0) >= 40)
        assertTrue("Level L6 should have concepts", (grouped[DepthLevel.L6]?.size ?: 0) >= 25)
        assertTrue("Level L7 should have concepts", (grouped[DepthLevel.L7]?.size ?: 0) >= 30)
        assertTrue("Level L8 should have concepts", (grouped[DepthLevel.L8]?.size ?: 0) >= 8)
    }

    @Test
    fun testEachLevelContainsCorrectDomainConcepts() {
        // L2 contains Physics (Parabola, Gerak Lurus), Math (Pecahan, Trigonometri, Persamaan Linear),
        // Chemistry (Asam Basa, Struktur Atom), and Biology (Sel, Fotosintesis)
        val l2Concepts = CurriculumData.allConcepts.filter { it.level == DepthLevel.L2 }
        val l2Domains = l2Concepts.map { it.domain }.toSet()
        assertEquals(4, l2Domains.size)
        assertTrue(l2Domains.contains(Domain.FISIKA))
        assertTrue(l2Domains.contains(Domain.MATEMATIKA))
        assertTrue(l2Domains.contains(Domain.KIMIA))
        assertTrue(l2Domains.contains(Domain.BIOLOGI))
    }

    @Test
    fun testLessonDataRetrievalForBiologyAndChemistry() {
        val acidBaseLesson = CurriculumData.getLesson("kim-asam-basa")
        assertNotNull(acidBaseLesson)
        assertEquals("kim-asam-basa", acidBaseLesson.conceptId)
        assertEquals("sim-acid-base", acidBaseLesson.simId)

        val photoLesson = CurriculumData.getLesson("bio-fotosintesis")
        assertNotNull(photoLesson)
        assertEquals("bio-fotosintesis", photoLesson.conceptId)
        assertEquals("sim-photosynthesis", photoLesson.simId)
    }

    @Test
    fun testLevelCompletionCalculation() {
        val l2Concepts = CurriculumData.allConcepts.filter { it.level == DepthLevel.L2 }
        val totalCount = l2Concepts.size
        assertTrue(totalCount > 0)

        // Mock 2 completed lessons from Room
        val mockCompletedFromRoom = setOf(l2Concepts[0].id, l2Concepts[1].id)
        val completedCount = l2Concepts.count { mockCompletedFromRoom.contains(it.id) }
        assertEquals(2, completedCount)

        val progressFraction = completedCount.toFloat() / totalCount
        assertTrue(progressFraction > 0f && progressFraction < 1f)

        // Mock all completed
        val allCompleted = l2Concepts.map { it.id }.toSet()
        val allCompletedCount = l2Concepts.count { allCompleted.contains(it.id) }
        assertEquals(totalCount, allCompletedCount)
        assertEquals(1.0f, allCompletedCount.toFloat() / totalCount)
    }

    @Test
    fun testAllConceptsHaveUniqueAndCompleteLessonData() {
        assertEquals(261, CurriculumData.allConcepts.size)
        assertEquals(68, CurriculumData.allConcepts.count { it.domain == Domain.MATEMATIKA })
        assertEquals(62, CurriculumData.allConcepts.count { it.domain == Domain.FISIKA })
        assertEquals(64, CurriculumData.allConcepts.count { it.domain == Domain.KIMIA })
        assertEquals(67, CurriculumData.allConcepts.count { it.domain == Domain.BIOLOGI })

        for (concept in CurriculumData.allConcepts) {
            val lesson = CurriculumData.getLesson(concept.id)
            assertNotNull("Lesson for ${concept.id} should not be null", lesson)
            assertEquals("Lesson conceptId must match", concept.id, lesson.conceptId)
            assertTrue("Story panels should not be empty for ${concept.id}", lesson.storyPanels.isNotEmpty())
            assertTrue("Intuition body should not be blank for ${concept.id}", lesson.intuitionBody.isNotBlank())
            assertNotNull("Case study should be defined for ${concept.id}", lesson.caseStudy)
            assertNotNull("Home lab should be defined for ${concept.id}", lesson.homeLab)
            assertTrue("Quiz questions should not be empty for ${concept.id}", lesson.quizQuestions.isNotEmpty())
        }
    }
}

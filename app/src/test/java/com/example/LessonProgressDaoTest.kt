package com.example

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.example.data.local.SemestaDatabase
import com.example.data.local.dao.LessonProgressDao
import com.example.data.local.entity.LessonProgressEntity
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class LessonProgressDaoTest {

    private lateinit var database: SemestaDatabase
    private lateinit var dao: LessonProgressDao

    @Before
    fun setup() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        database = Room.inMemoryDatabaseBuilder(context, SemestaDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        dao = database.lessonProgressDao()
    }

    @After
    fun tearDown() {
        database.close()
    }

    @Test
    fun insertAndRetrieveLessonProgress() = runBlocking {
        val progress = LessonProgressEntity(
            profileId = "user-1",
            lessonId = "fis-gerak-parabola",
            topicId = "Kinematika 2D",
            title = "Gerak Parabola",
            domain = "FISIKA",
            levelCode = "L2",
            isCompleted = false,
            highestQuizScore = 0.75f,
            latestQuizScore = 0.75f,
            quizAttemptsCount = 1,
            timeSpentSeconds = 600,
            masteryPercent = 60
        )
        dao.insertOrUpdate(progress)

        val retrieved = dao.getProgressByLessonId("user-1", "fis-gerak-parabola")
        assertNotNull(retrieved)
        assertEquals("Gerak Parabola", retrieved?.title)
        assertEquals(0.75f, retrieved?.highestQuizScore ?: 0f, 0.001f)
        assertFalse(retrieved?.isCompleted ?: true)
    }

    @Test
    fun markTopicCompleted() = runBlocking {
        val progress = LessonProgressEntity(
            profileId = "user-1",
            lessonId = "mat-pecahan-rasio",
            topicId = "Bilangan & Operasi",
            title = "Pecahan & Rasio",
            domain = "MATEMATIKA",
            levelCode = "L2",
            isCompleted = false
        )
        dao.insertOrUpdate(progress)

        dao.markCompleted("user-1", "mat-pecahan-rasio", 123456789L)

        val completedList = dao.getCompletedLessons("user-1").first()
        assertEquals(1, completedList.size)
        assertTrue(completedList.first().isCompleted)
        assertEquals(123456789L, completedList.first().completedAt)

        val completedTopicIds = dao.getCompletedTopicIds("user-1").first()
        assertTrue(completedTopicIds.contains("Bilangan & Operasi"))
    }

    @Test
    fun recordQuizScoreUpdatesHighestAndAttempts() = runBlocking {
        val progress = LessonProgressEntity(
            profileId = "user-1",
            lessonId = "fis-newton",
            topicId = "Dinamika",
            title = "Gaya & Hukum Newton",
            domain = "FISIKA",
            levelCode = "L3",
            highestQuizScore = 0.6f,
            latestQuizScore = 0.6f,
            quizAttemptsCount = 1
        )
        dao.insertOrUpdate(progress)

        // Record a higher score (0.9)
        dao.recordQuizScore("user-1", "fis-newton", 0.9f)

        val updated = dao.getProgressByLessonId("user-1", "fis-newton")
        assertEquals(0.9f, updated?.highestQuizScore ?: 0f, 0.001f)
        assertEquals(0.9f, updated?.latestQuizScore ?: 0f, 0.001f)
        assertEquals(2, updated?.quizAttemptsCount)

        // Record a lower score (0.7) -> highest should remain 0.9
        dao.recordQuizScore("user-1", "fis-newton", 0.7f)
        val afterLower = dao.getProgressByLessonId("user-1", "fis-newton")
        assertEquals(0.9f, afterLower?.highestQuizScore ?: 0f, 0.001f)
        assertEquals(0.7f, afterLower?.latestQuizScore ?: 0f, 0.001f)
        assertEquals(3, afterLower?.quizAttemptsCount)
    }

    @Test
    fun averageQuizScoreCalculation() = runBlocking {
        dao.insertOrUpdate(
            LessonProgressEntity(
                profileId = "user-1",
                lessonId = "l1",
                topicId = "T1",
                title = "Lesson 1",
                domain = "FISIKA",
                levelCode = "L2",
                highestQuizScore = 0.8f,
                quizAttemptsCount = 1
            )
        )
        dao.insertOrUpdate(
            LessonProgressEntity(
                profileId = "user-1",
                lessonId = "l2",
                topicId = "T1",
                title = "Lesson 2",
                domain = "FISIKA",
                levelCode = "L2",
                highestQuizScore = 1.0f,
                quizAttemptsCount = 1
            )
        )

        val avg = dao.getAverageQuizScore("user-1").first()
        assertNotNull(avg)
        assertEquals(0.9f, avg!!, 0.01f)
    }
}

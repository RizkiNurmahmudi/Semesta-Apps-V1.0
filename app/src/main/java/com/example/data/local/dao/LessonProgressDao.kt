package com.example.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.data.local.entity.LessonProgressEntity
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object (DAO) for managing lesson progress tracking,
 * completed topics, and quiz score performance.
 */
@Dao
interface LessonProgressDao {

    @Query("SELECT * FROM lesson_progress WHERE profileId = :profileId ORDER BY lastAccessedAt DESC")
    fun getAllProgressForProfile(profileId: String): Flow<List<LessonProgressEntity>>

    @Query("SELECT * FROM lesson_progress WHERE profileId = :profileId AND isCompleted = 1 ORDER BY completedAt DESC")
    fun getCompletedLessons(profileId: String): Flow<List<LessonProgressEntity>>

    @Query("SELECT DISTINCT topicId FROM lesson_progress WHERE profileId = :profileId AND isCompleted = 1")
    fun getCompletedTopicIds(profileId: String): Flow<List<String>>

    @Query("SELECT * FROM lesson_progress WHERE profileId = :profileId AND lessonId = :lessonId LIMIT 1")
    fun getProgressByLessonIdFlow(profileId: String, lessonId: String): Flow<LessonProgressEntity?>

    @Query("SELECT * FROM lesson_progress WHERE profileId = :profileId AND lessonId = :lessonId LIMIT 1")
    suspend fun getProgressByLessonId(profileId: String, lessonId: String): LessonProgressEntity?

    @Query("SELECT AVG(highestQuizScore) FROM lesson_progress WHERE profileId = :profileId AND quizAttemptsCount > 0")
    fun getAverageQuizScore(profileId: String): Flow<Float?>

    @Query("SELECT COUNT(*) FROM lesson_progress WHERE profileId = :profileId AND isCompleted = 1")
    fun getCompletedLessonsCount(profileId: String): Flow<Int>

    @Query("SELECT * FROM lesson_progress WHERE profileId = :profileId AND quizAttemptsCount > 0 ORDER BY lastAccessedAt DESC LIMIT :limit")
    fun getRecentQuizScores(profileId: String, limit: Int = 10): Flow<List<LessonProgressEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(progress: LessonProgressEntity): Long

    @Update
    suspend fun update(progress: LessonProgressEntity)

    @Query("""
        UPDATE lesson_progress 
        SET isCompleted = 1, 
            completedAt = :timestamp, 
            lastAccessedAt = :timestamp 
        WHERE profileId = :profileId AND lessonId = :lessonId
    """)
    suspend fun markCompleted(
        profileId: String,
        lessonId: String,
        timestamp: Long = System.currentTimeMillis()
    )

    @Query("""
        UPDATE lesson_progress 
        SET latestQuizScore = :score,
            highestQuizScore = CASE WHEN :score > highestQuizScore THEN :score ELSE highestQuizScore END,
            quizAttemptsCount = quizAttemptsCount + 1,
            lastAccessedAt = :timestamp
        WHERE profileId = :profileId AND lessonId = :lessonId
    """)
    suspend fun recordQuizScore(
        profileId: String,
        lessonId: String,
        score: Float,
        timestamp: Long = System.currentTimeMillis()
    )

    @Query("DELETE FROM lesson_progress WHERE profileId = :profileId")
    suspend fun deleteAllForProfile(profileId: String)
}

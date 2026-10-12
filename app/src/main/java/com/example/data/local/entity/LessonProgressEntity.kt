package com.example.data.local.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Entity to track detailed progress for lessons/topics,
 * including completion status, quiz scores, and mastery metrics.
 */
@Entity(
    tableName = "lesson_progress",
    indices = [
        Index(value = ["profileId", "lessonId"], unique = true),
        Index(value = ["profileId", "isCompleted"]),
        Index(value = ["topicId"])
    ]
)
data class LessonProgressEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val profileId: String,
    val lessonId: String,             // e.g. "fis-gerak-parabola"
    val topicId: String,              // e.g. "Kinematika 2D"
    val title: String,                // e.g. "Gerak Parabola"
    val domain: String,               // "FISIKA" or "MATEMATIKA"
    val levelCode: String,            // "L0", "L1", "L2", "L3", "L4", "L5"
    val isCompleted: Boolean = false,
    val completedAt: Long? = null,
    val lastAccessedAt: Long = System.currentTimeMillis(),
    val highestQuizScore: Float = 0f, // 0.0 .. 1.0 (e.g. 0.85 = 85%)
    val latestQuizScore: Float = 0f,  // 0.0 .. 1.0
    val quizAttemptsCount: Int = 0,
    val timeSpentSeconds: Long = 0,
    val masteryPercent: Int = 0       // 0 .. 100
)

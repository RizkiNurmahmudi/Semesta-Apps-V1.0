package com.example.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_profiles")
data class UserProfileEntity(
    @PrimaryKey val id: String,
    val name: String,
    val avatarEmoji: String = "🚀",
    val defaultMode: String = "PELAJAR",
    val ageGroup: String = "10–14 thn",
    val totalXp: Int = 120,
    val currentStreak: Int = 5,
    val lastActiveEpochDay: Long = System.currentTimeMillis() / (24 * 60 * 60 * 1000)
)

@Entity(tableName = "concept_progress")
data class ConceptProgressEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val profileId: String,
    val conceptId: String,
    val levelCode: String,
    val status: String, // TERSEDIA, SEDANG, DIKUASAI, PERLU_DIULANG
    val masteryPercent: Int, // 0..100
    val lastReviewedTimestamp: Long,
    val nextReviewEpochDay: Long,
    val leitnerBox: Int = 1 // 1..5
)

@Entity(tableName = "quiz_attempts")
data class QuizAttemptEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val profileId: String,
    val conceptId: String,
    val levelCode: String,
    val score: Float, // 0.0..1.0
    val hintsUsed: Int,
    val timestamp: Long = System.currentTimeMillis()
)

@Entity(tableName = "user_badges")
data class UserBadgeEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val profileId: String,
    val badgeId: String,
    val earnedTimestamp: Long = System.currentTimeMillis()
)

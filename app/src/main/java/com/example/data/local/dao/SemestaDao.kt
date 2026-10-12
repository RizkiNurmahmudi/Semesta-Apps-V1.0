package com.example.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.data.local.entity.ConceptProgressEntity
import com.example.data.local.entity.QuizAttemptEntity
import com.example.data.local.entity.UserBadgeEntity
import com.example.data.local.entity.UserProfileEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SemestaDao {

    // User Profiles
    @Query("SELECT * FROM user_profiles ORDER BY name ASC")
    fun getAllProfiles(): Flow<List<UserProfileEntity>>

    @Query("SELECT * FROM user_profiles WHERE id = :profileId LIMIT 1")
    fun getProfileById(profileId: String): Flow<UserProfileEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProfile(profile: UserProfileEntity)

    @Update
    suspend fun updateProfile(profile: UserProfileEntity)

    @Query("DELETE FROM user_profiles WHERE id = :profileId")
    suspend fun deleteProfile(profileId: String)

    // Concept Progress
    @Query("SELECT * FROM concept_progress WHERE profileId = :profileId")
    fun getProgressForProfile(profileId: String): Flow<List<ConceptProgressEntity>>

    @Query("SELECT * FROM concept_progress WHERE profileId = :profileId AND conceptId = :conceptId LIMIT 1")
    suspend fun getConceptProgress(profileId: String, conceptId: String): ConceptProgressEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateProgress(progress: ConceptProgressEntity)

    // Quiz Attempts
    @Query("SELECT * FROM quiz_attempts WHERE profileId = :profileId ORDER BY timestamp DESC")
    fun getAttemptsForProfile(profileId: String): Flow<List<QuizAttemptEntity>>

    @Insert
    suspend fun insertQuizAttempt(attempt: QuizAttemptEntity)

    // Badges
    @Query("SELECT * FROM user_badges WHERE profileId = :profileId")
    fun getBadgesForProfile(profileId: String): Flow<List<UserBadgeEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBadge(badge: UserBadgeEntity)
}

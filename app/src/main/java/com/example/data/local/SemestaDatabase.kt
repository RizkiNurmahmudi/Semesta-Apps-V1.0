package com.example.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.local.dao.LessonProgressDao
import com.example.data.local.dao.SemestaDao
import com.example.data.local.entity.ConceptProgressEntity
import com.example.data.local.entity.LessonProgressEntity
import com.example.data.local.entity.QuizAttemptEntity
import com.example.data.local.entity.UserBadgeEntity
import com.example.data.local.entity.UserProfileEntity

@Database(
    entities = [
        UserProfileEntity::class,
        ConceptProgressEntity::class,
        QuizAttemptEntity::class,
        UserBadgeEntity::class,
        LessonProgressEntity::class
    ],
    version = 2,
    exportSchema = false
)
abstract class SemestaDatabase : RoomDatabase() {

    abstract fun semestaDao(): SemestaDao
    abstract fun lessonProgressDao(): LessonProgressDao

    companion object {
        @Volatile
        private var INSTANCE: SemestaDatabase? = null

        fun getInstance(context: Context): SemestaDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SemestaDatabase::class.java,
                    "semesta_database.db"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                instance
            }
        }
    }
}

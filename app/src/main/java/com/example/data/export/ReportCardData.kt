package com.example.data.export

import com.example.data.model.Domain

/**
 * Data model for individual science domain performance in the academic report.
 */
data class DomainAcademicReport(
    val domain: Domain,
    val domainTitle: String,
    val completedCount: Int,
    val totalCount: Int,
    val averageMasteryPercent: Int,
    val gradeLetter: String, // e.g. "A+", "A", "B", "C"
    val topMasteredTopic: String
)

/**
 * Comprehensive student academic report card data for official PDF generation.
 */
data class StudentAcademicReport(
    val profileId: String,
    val studentName: String,
    val avatarEmoji: String,
    val ageGroup: String,
    val defaultMode: String,
    val totalXp: Int,
    val streakDays: Int,
    val totalCompletedLessons: Int,
    val totalConceptsCount: Int,
    val homeLabsVerifiedCount: Int,
    val badgesEarnedCount: Int,
    val reportDateString: String,
    val certificateId: String,
    val domainReports: List<DomainAcademicReport>,
    val overallEvaluationText: String
)

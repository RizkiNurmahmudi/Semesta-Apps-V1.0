package com.example.data.model

enum class Domain(val displayName: String, val iconLabel: String) {
    FISIKA("Fisika", "⚛️"),
    MATEMATIKA("Matematika", "📐"),
    KIMIA("Kimia", "🧪"),
    BIOLOGI("Biologi", "🌿")
}

enum class DepthLevel(
    val code: String,
    val title: String,
    val targetAge: String,
    val description: String
) {
    L0("L0", "Penjelajah", "4–8 thn", "Intuisi & rasa ingin tahu tanpa rumus"),
    L1("L1", "Dasar", "9–12 thn", "Konkret, operasi dasar, dan satuan"),
    L2("L2", "Menengah", "13–15 thn", "Konsep, rumus dasar & studi kasus"),
    L3("L3", "Lanjut", "16–18 thn", "Model kuantitatif & kalkulus dasar"),
    L4("L4", "PT Dasar", "Awal Kuliah", "Rigorous, kalkulus, dan analisis kuantitatif"),
    L5("L5", "Sarjana Inti", "Tingkat Sarjana", "Percabangan sub-bidang utama & pemodelan"),
    L6("L6", "Pra-Pasca", "Akhir Sarjana", "Sintesis multidisiplin & metode komputasi numerik"),
    L7("L7", "Spesialisasi", "Riset Mahir", "Formulasi teoretis tinggi & teknologi mutakhir"),
    L8("L8", "Riset Lanjut", "Pascasarjana", "Fondasi matematika murni & teknologi perbatasan")
}

enum class ConceptStatus(val label: String) {
    TERSEDIA("Tersedia"),
    SEDANG("Sedang Belajar"),
    DIKUASAI("Dikuasai"),
    PERLU_DIULANG("Perlu Diulang")
}

enum class UIMode(val displayName: String, val description: String) {
    PENJELAJAH("Penjelajah", "Huruf besar, visual ceria, penjelasan intuitif"),
    PELAJAR("Pelajar", "Seimbang teks, rumus, grafik & simulasi"),
    AHLI("Ahli", "Rumus teknis, derivasi penuh & data numerik")
}

data class ConceptItem(
    val id: String,
    val domain: Domain,
    val topic: String,
    val title: String,
    val description: String,
    val level: DepthLevel,
    val estMinutes: Int,
    val prerequisites: List<String> = emptyList(),
    val hasStory: Boolean = true,
    val hasSimulation: Boolean = true,
    val hasCaseStudy: Boolean = true,
    val hasHomeLab: Boolean = true
)

data class StoryPanel(
    val id: String,
    val panelNumber: Int,
    val title: String,
    val caption: String,
    val dialogueSpeaker: String? = null,
    val dialogueText: String? = null,
    val sceneVisualEmoji: String = "✨",
    val sceneDescription: String = "",
    val decisionPrompt: String? = null,
    val decisionOptions: List<String>? = null,
    val chosenOption: String? = null
)

data class FormulaCard(
    val symbol: String,
    val equation: String,
    val meaning: String,
    val units: String,
    val applicationNote: String
)

data class CaseStudyData(
    val title: String,
    val context: String,
    val engineeringProblem: String,
    val physicalConceptUsed: String,
    val mathematicalModel: String,
    val realWorldImpact: String,
    val relatedCareers: List<String>,
    val verifiedSource: String
)

data class HomeLabData(
    val title: String,
    val safetyLevel: String, // "Mandiri (Aman)" or "Dampingi Orang Dewasa"
    val materials: List<String>,
    val steps: List<String>,
    val observationGoal: String,
    val connectionToSimulation: String
)

data class QuizQuestion(
    val id: String,
    val prompt: String,
    val type: String = "multiple_choice", // "multiple_choice" or "numeric"
    val options: List<String>? = null,
    val correctAnswer: String,
    val tolerance: Float = 0.5f,
    val unit: String = "",
    val hints: List<String>,
    val explanation: String,
    val misconception: String? = null
)

data class LessonData(
    val conceptId: String,
    val level: DepthLevel,
    val storyPanels: List<StoryPanel>,
    val intuitionTitle: String,
    val intuitionBody: String,
    val intuitionPoints: List<String>,
    val simId: String,
    val formulas: List<FormulaCard>,
    val caseStudy: CaseStudyData,
    val homeLab: HomeLabData,
    val quizQuestions: List<QuizQuestion>
)

data class BadgeItem(
    val id: String,
    val title: String,
    val iconEmoji: String,
    val description: String,
    val isEarned: Boolean = false,
    val earnedDate: String? = null
)

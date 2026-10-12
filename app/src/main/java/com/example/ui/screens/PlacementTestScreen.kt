package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CurriculumData
import com.example.data.diagnostic.DiagnosticQuestion
import com.example.data.diagnostic.DiagnosticResult
import com.example.data.diagnostic.DomainProficiency
import com.example.data.diagnostic.PlacementTestData
import com.example.data.model.ConceptItem
import com.example.data.model.DepthLevel
import com.example.data.model.Domain
import com.example.ui.theme.CosmicAmberAccent
import com.example.ui.theme.CosmicCyanSecondary
import com.example.ui.theme.CosmicEmeraldSuccess
import com.example.ui.theme.CosmicIndigoDark
import com.example.ui.theme.CosmicIndigoPrimary
import com.example.ui.theme.MathPurple
import com.example.ui.theme.PhysicsBlue
import com.example.ui.viewmodel.ScreenDestination
import com.example.ui.viewmodel.SemestaViewModel
import com.example.util.feedback.LocalSemestaFeedback

enum class DiagnosticStage {
    INTRO,
    IN_PROGRESS,
    RESULT
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlacementTestScreen(
    viewModel: SemestaViewModel,
    modifier: Modifier = Modifier
) {
    var stage by remember { mutableStateOf(DiagnosticStage.INTRO) }
    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    val answers = remember { mutableStateMapOf<Int, Int>() }
    var diagnosticResult by remember { mutableStateOf<DiagnosticResult?>(null) }
    var selectedDomainFilter by remember { mutableStateOf<Domain?>(null) }

    val feedback = LocalSemestaFeedback.current

    val allQuestions = PlacementTestData.questions
    val currentQuestion = allQuestions.getOrNull(currentQuestionIndex) ?: allQuestions.first()

    BackHandler {
        when (stage) {
            DiagnosticStage.INTRO -> viewModel.navigateTo(ScreenDestination.Catalog)
            DiagnosticStage.IN_PROGRESS -> {
                stage = DiagnosticStage.INTRO
            }
            DiagnosticStage.RESULT -> viewModel.navigateTo(ScreenDestination.Catalog)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = when (stage) {
                            DiagnosticStage.INTRO -> "Tes Penempatan Jalur Belajar"
                            DiagnosticStage.IN_PROGRESS -> "Diagnostik Adaptif (${answers.size}/${allQuestions.size})"
                            DiagnosticStage.RESULT -> "Hasil & Rekomendasi Jalur Belajar"
                        },
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            feedback.playClick()
                            when (stage) {
                                DiagnosticStage.INTRO -> viewModel.navigateTo(ScreenDestination.Catalog)
                                DiagnosticStage.IN_PROGRESS -> { stage = DiagnosticStage.INTRO }
                                DiagnosticStage.RESULT -> viewModel.navigateTo(ScreenDestination.Catalog)
                            }
                        }
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Kembali")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.surface)
            )
        }
    ) { innerPadding ->
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (stage) {
                DiagnosticStage.INTRO -> {
                    DiagnosticIntroView(
                        onStartTest = {
                            feedback.playClick()
                            currentQuestionIndex = 0
                            answers.clear()
                            stage = DiagnosticStage.IN_PROGRESS
                        }
                    )
                }

                DiagnosticStage.IN_PROGRESS -> {
                    DiagnosticQuizView(
                        questions = allQuestions,
                        currentIndex = currentQuestionIndex,
                        currentQuestion = currentQuestion,
                        answers = answers,
                        selectedDomainFilter = selectedDomainFilter,
                        onSelectDomainFilter = {
                            feedback.playClick()
                            selectedDomainFilter = it
                        },
                        onSelectQuestion = {
                            feedback.playClick()
                            currentQuestionIndex = it
                        },
                        onAnswerSelected = { qIndex, optIndex ->
                            feedback.playClick()
                            answers[qIndex] = optIndex
                        },
                        onPrevious = {
                            feedback.playClick()
                            if (currentQuestionIndex > 0) currentQuestionIndex--
                        },
                        onNext = {
                            feedback.playClick()
                            if (currentQuestionIndex < allQuestions.size - 1) currentQuestionIndex++
                        },
                        onSubmit = {
                            feedback.playCorrect()
                            val result = PlacementTestData.evaluate(answers)
                            diagnosticResult = result
                            stage = DiagnosticStage.RESULT
                        }
                    )
                }

                DiagnosticStage.RESULT -> {
                    val result = diagnosticResult ?: PlacementTestData.evaluate(answers)
                    DiagnosticResultView(
                        result = result,
                        onApplyLevel = {
                            feedback.playBadgeFanfare()
                            viewModel.applyPlacementDiagnosticResult(result)
                            viewModel.navigateTo(ScreenDestination.Catalog)
                        },
                        onSelectLesson = { conceptId ->
                            feedback.playClick()
                            viewModel.applyPlacementDiagnosticResult(result)
                            viewModel.navigateTo(ScreenDestination.Lesson(conceptId))
                        },
                        onRetakeTest = {
                            feedback.playClick()
                            answers.clear()
                            currentQuestionIndex = 0
                            stage = DiagnosticStage.INTRO
                        }
                    )
                }
            }
        }
    }
}

// =========================================================================
// 1. TAMPILAN INTRO
// =========================================================================

@Composable
private fun DiagnosticIntroView(
    onStartTest: () -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(16.dp))
            // Cosmic Icon
            Box(
                modifier = Modifier
                    .size(88.dp)
                    .background(
                        brush = Brush.radialGradient(
                            colors = listOf(CosmicIndigoPrimary.copy(alpha = 0.35f), Color.Transparent)
                        ),
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "🧭", fontSize = 48.sp)
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Pemetaan Jalur Belajar Adaptif",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Temukan titik awal belajar yang paling nyaman & terukur sesuai pemahaman sains unikmu.",
                fontSize = 13.sp,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(horizontal = 12.dp)
            )
        }

        item {
            // Feature Highlights
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    Text(
                        text = "Struktur Tes Diagnostik:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = CosmicIndigoPrimary
                    )

                    PillarInfoRow(emoji = "📐", title = "5 Soal Matematika", desc = "Pecahan, Pythagoras, Kalkulus, hingga Aljabar Linear")
                    PillarInfoRow(emoji = "⚛️", title = "5 Soal Fisika", desc = "Kalor, Kinematika, Dinamika Newton, Induksi & Mekanika")
                    PillarInfoRow(emoji = "🧪", title = "5 Soal Kimia", desc = "Asam Basa, Struktur Atom, Mol Stoikiometri, hingga Mekanisme SN2")
                    PillarInfoRow(emoji = "🌿", title = "5 Soal Biologi", desc = "Ekosistem, Organel Fotosintesis, Hukum Mendel & Rekayasa CRISPR")
                }
            }
        }

        item {
            // Bonus Reward Card
            Surface(
                color = CosmicAmberAccent.copy(alpha = 0.12f),
                shape = RoundedCornerShape(14.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, CosmicAmberAccent.copy(alpha = 0.4f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("🌟", fontSize = 28.sp)
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = "Bonus Penyelesaian: +50 XP & Lencana Eksklusif",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = CosmicAmberAccent
                        )
                        Text(
                            text = "Dapatkan lencana 'Pemeta Jalur Semesta' 🧭 langsung pada profil Anda.",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = onStartTest,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .testTag("start_placement_test_button"),
                colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                shape = RoundedCornerShape(14.dp)
            ) {
                Icon(Icons.Default.Explore, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Mulai Tes Diagnostik (20 Soal)",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun PillarInfoRow(emoji: String, title: String, desc: String) {
    Row(verticalAlignment = Alignment.Top) {
        Text(emoji, fontSize = 18.sp)
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(title, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
            Text(desc, fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}

// =========================================================================
// 2. TAMPILAN QUIZ IN PROGRESS
// =========================================================================

@Composable
private fun DiagnosticQuizView(
    questions: List<DiagnosticQuestion>,
    currentIndex: Int,
    currentQuestion: DiagnosticQuestion,
    answers: Map<Int, Int>,
    selectedDomainFilter: Domain?,
    onSelectDomainFilter: (Domain?) -> Unit,
    onSelectQuestion: (Int) -> Unit,
    onAnswerSelected: (Int, Int) -> Unit,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    onSubmit: () -> Unit
) {
    val scrollState = rememberScrollState()
    val progress = answers.size.toFloat() / questions.size.toFloat()

    Column(modifier = Modifier.fillMaxSize()) {
        // Linear Progress Bar
        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 6.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Progress: ${answers.size} dari ${questions.size} dijawab",
                    fontSize = 12.sp,
                    color = CosmicIndigoPrimary,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "${(progress * 100).toInt()}%",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .clip(RoundedCornerShape(3.dp)),
                color = CosmicIndigoPrimary,
                trackColor = CosmicIndigoPrimary.copy(alpha = 0.15f)
            )
        }

        // Domain Filter Tabs
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                selected = selectedDomainFilter == null,
                onClick = { onSelectDomainFilter(null) },
                label = { Text("Semua (20)") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = CosmicIndigoPrimary.copy(alpha = 0.18f),
                    selectedLabelColor = CosmicIndigoPrimary
                )
            )
            Domain.values().forEach { dom ->
                val domCount = questions.count { it.domain == dom }
                val answeredInDom = questions.filterIndexed { idx, q -> q.domain == dom && answers.containsKey(idx) }.size
                val domColor = getDomainThemeColor(dom)
                FilterChip(
                    selected = selectedDomainFilter == dom,
                    onClick = {
                        onSelectDomainFilter(if (selectedDomainFilter == dom) null else dom)
                        // Lompat ke soal pertama domain ini jika dipilih
                        val firstInDom = questions.indexOfFirst { it.domain == dom }
                        if (firstInDom >= 0) onSelectQuestion(firstInDom)
                    },
                    label = {
                        Text("${dom.name.lowercase().replaceFirstChar { it.uppercase() }} ($answeredInDom/$domCount)")
                    },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = domColor.copy(alpha = 0.2f),
                        selectedLabelColor = domColor
                    )
                )
            }
        }

        // Quick Jump Number Grid Strip (Horizontal)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(scrollState)
                .padding(horizontal = 16.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            questions.forEachIndexed { qIdx, q ->
                val isAnswered = answers.containsKey(qIdx)
                val isCurrent = qIdx == currentIndex
                val isFiltered = selectedDomainFilter == null || q.domain == selectedDomainFilter

                if (isFiltered) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(
                                when {
                                    isCurrent -> CosmicIndigoPrimary
                                    isAnswered -> CosmicEmeraldSuccess.copy(alpha = 0.25f)
                                    else -> MaterialTheme.colorScheme.surfaceVariant
                                }
                            )
                            .border(
                                width = if (isCurrent) 2.dp else 1.dp,
                                color = if (isCurrent) CosmicIndigoDark else if (isAnswered) CosmicEmeraldSuccess else Color.Transparent,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .clickable { onSelectQuestion(qIdx) },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${qIdx + 1}",
                            fontSize = 12.sp,
                            fontWeight = if (isCurrent) FontWeight.Bold else FontWeight.Medium,
                            color = when {
                                isCurrent -> Color.White
                                isAnswered -> CosmicEmeraldSuccess
                                else -> MaterialTheme.colorScheme.onSurfaceVariant
                            }
                        )
                    }
                }
            }
        }

        // Question Details & Interactive Card (Scrollable)
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            item {
                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                    modifier = Modifier
                        .fillMaxWidth()
                        .animateContentSize()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        // Header Badges
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                color = getDomainThemeColor(currentQuestion.domain).copy(alpha = 0.15f),
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Text(
                                    text = "${getDomainEmoji(currentQuestion.domain)} ${currentQuestion.domain.name}",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = getDomainThemeColor(currentQuestion.domain),
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }

                            Surface(
                                color = CosmicIndigoPrimary.copy(alpha = 0.12f),
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Text(
                                    text = "Target ${currentQuestion.targetLevel.code} • Soal ${currentIndex + 1}/20",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = CosmicIndigoPrimary,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        // Question Prompt
                        Text(
                            text = currentQuestion.prompt,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 15.sp,
                            lineHeight = 22.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        // Options
                        val selectedOpt = answers[currentIndex]
                        currentQuestion.options.forEachIndexed { optIdx, optText ->
                            val isSelected = selectedOpt == optIdx
                            Surface(
                                color = if (isSelected) CosmicIndigoPrimary.copy(alpha = 0.12f) else MaterialTheme.colorScheme.surface,
                                shape = RoundedCornerShape(12.dp),
                                border = androidx.compose.foundation.BorderStroke(
                                    width = if (isSelected) 1.5.dp else 1.dp,
                                    color = if (isSelected) CosmicIndigoPrimary else MaterialTheme.colorScheme.outline.copy(alpha = 0.2f)
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 4.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .clickable { onAnswerSelected(currentIndex, optIdx) }
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    RadioButton(
                                        selected = isSelected,
                                        onClick = { onAnswerSelected(currentIndex, optIdx) },
                                        colors = RadioButtonDefaults.colors(selectedColor = CosmicIndigoPrimary)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = optText,
                                        fontSize = 13.sp,
                                        color = if (isSelected) CosmicIndigoPrimary else MaterialTheme.colorScheme.onSurface,
                                        fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Normal
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // Bottom Spacing inside LazyColumn
            item {
                Spacer(modifier = Modifier.height(8.dp))
            }
        }

        // Bottom Controls Bar
        Surface(
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = 4.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedButton(
                    onClick = onPrevious,
                    enabled = currentIndex > 0,
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Sebelumnya", fontSize = 12.sp)
                }

                if (answers.size == questions.size || currentIndex == questions.size - 1) {
                    Button(
                        onClick = onSubmit,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (answers.size == questions.size) CosmicEmeraldSuccess else CosmicIndigoPrimary
                        ),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.testTag("submit_placement_test_button")
                    ) {
                        Icon(Icons.Default.CheckCircle, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = if (answers.size == questions.size) "Analisis Hasil Adaptif" else "Selesai (${answers.size}/20)",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                } else {
                    Button(
                        onClick = onNext,
                        colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text("Berikutnya", fontSize = 12.sp)
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(16.dp))
                    }
                }
            }
        }
    }
}

// =========================================================================
// 3. TAMPILAN RESULT HASIL DIAGNOSTIK ADAPTIF
// =========================================================================

@Composable
private fun DiagnosticResultView(
    result: DiagnosticResult,
    onApplyLevel: () -> Unit,
    onSelectLesson: (String) -> Unit,
    onRetakeTest: () -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(8.dp))
            // Big Cosmic Header Badge
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(72.dp)
                            .background(CosmicEmeraldSuccess.copy(alpha = 0.2f), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("🧭", fontSize = 40.sp)
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Rekomendasi Jalur Pembelajaran",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Text(
                        text = "${result.overallLevel.code} — ${result.overallLevel.title}",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = CosmicIndigoPrimary,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Surface(
                        color = CosmicEmeraldSuccess.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "Akurasi: ${result.totalCorrect} dari ${result.totalQuestions} Soal Benar (${(result.totalCorrect * 100 / result.totalQuestions)}%)",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = CosmicEmeraldSuccess,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Surface(
                        color = MaterialTheme.colorScheme.surface,
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "💡 ${result.personalizedAdvice}",
                            fontSize = 12.sp,
                            lineHeight = 18.sp,
                            modifier = Modifier.padding(14.dp),
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }
        }

        // Domain Breakdown (4 Pilar Sains)
        item {
            Text(
                text = "📊 Penguasaan 4 Pilar Sains:",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.height(8.dp))

            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                result.domainProficiencies.forEach { prof ->
                    DomainProficiencyCard(prof = prof)
                }
            }
        }

        // 4 Recommended Starting Modules
        item {
            Text(
                text = "🚀 Rekomendasi 4 Modul Awal Adaptif:",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )
            Text(
                text = "Pilih materi di bawah ini untuk langsung memulai eksplorasi interaktif:",
                fontSize = 11.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.height(8.dp))

            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                result.recommendedConceptIds.forEach { conceptId ->
                    val concept = CurriculumData.allConcepts.find { it.id == conceptId }
                    if (concept != null) {
                        RecommendedConceptCard(concept = concept, onStart = { onSelectLesson(concept.id) })
                    }
                }
            }
        }

        // Action Buttons
        item {
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = onApplyLevel,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .testTag("apply_placement_level_button"),
                colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                shape = RoundedCornerShape(12.dp)
            ) {
                Icon(Icons.Default.AutoAwesome, contentDescription = null, tint = CosmicAmberAccent)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Terapkan ${result.overallLevel.code} & Ambil +50 XP 🌟",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedButton(
                onClick = onRetakeTest,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(46.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Icon(Icons.Default.Refresh, contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text("Ulangi Tes Diagnostik", fontSize = 13.sp)
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun DomainProficiencyCard(prof: DomainProficiency) {
    val themeColor = getDomainThemeColor(prof.domain)
    val ratio = prof.score.toFloat() / prof.total.toFloat()

    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(themeColor.copy(alpha = 0.18f), RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(getDomainEmoji(prof.domain), fontSize = 20.sp)
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = prof.domain.name.lowercase().replaceFirstChar { it.uppercase() },
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "${prof.score}/${prof.total} Benar (${prof.recommendedLevel.code})",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = themeColor
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))

                LinearProgressIndicator(
                    progress = { ratio },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = themeColor,
                    trackColor = themeColor.copy(alpha = 0.15f)
                )
            }
        }
    }
}

@Composable
private fun RecommendedConceptCard(
    concept: ConceptItem,
    onStart: () -> Unit
) {
    val themeColor = getDomainThemeColor(concept.domain)

    Card(
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .padding(14.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .background(themeColor.copy(alpha = 0.18f), RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(getDomainEmoji(concept.domain), fontSize = 22.sp)
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        color = themeColor.copy(alpha = 0.15f),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = concept.level.code,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = themeColor,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = concept.topic,
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = concept.title,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            IconButton(
                onClick = onStart,
                modifier = Modifier
                    .size(36.dp)
                    .background(CosmicIndigoPrimary, CircleShape)
            ) {
                Icon(
                    Icons.Default.PlayArrow,
                    contentDescription = "Mulai Belajar",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

// =========================================================================
// HELPER FUNCTIONS
// =========================================================================

private fun getDomainThemeColor(domain: Domain): Color {
    return when (domain) {
        Domain.FISIKA -> PhysicsBlue
        Domain.MATEMATIKA -> MathPurple
        Domain.KIMIA -> CosmicCyanSecondary
        Domain.BIOLOGI -> CosmicEmeraldSuccess
    }
}

private fun getDomainEmoji(domain: Domain): String {
    return when (domain) {
        Domain.FISIKA -> "⚛️"
        Domain.MATEMATIKA -> "📐"
        Domain.KIMIA -> "🧪"
        Domain.BIOLOGI -> "🌿"
    }
}

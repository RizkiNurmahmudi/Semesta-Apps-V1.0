package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CurriculumData
import com.example.data.model.DepthLevel
import com.example.data.model.Domain
import com.example.data.model.FormulaCard
import com.example.data.model.LessonData
import com.example.data.model.QuizQuestion
import com.example.data.model.StoryPanel
import com.example.ui.simulation.AcidBaseSimulation
import com.example.ui.simulation.FractionSimulation
import com.example.ui.simulation.PhotosynthesisSimulation
import com.example.ui.simulation.ProjectileSimulation
import com.example.ui.simulation.SimulationDispatcher
import com.example.ui.simulation.TrigonometrySimulation
import com.example.ui.theme.CosmicAmberAccent
import com.example.ui.theme.CosmicCyanLight
import com.example.ui.theme.CosmicCyanSecondary
import com.example.ui.theme.CosmicEmeraldSuccess
import com.example.ui.theme.CosmicIndigoPrimary
import com.example.ui.theme.CosmicRoseAlert
import com.example.ui.viewmodel.ScreenDestination
import com.example.ui.viewmodel.SemestaViewModel
import com.example.util.feedback.LocalSemestaFeedback

val lessonSteps = listOf(
    "1. Cerita",
    "2. Intuisi",
    "3. Simulasi",
    "4. Rumus",
    "5. Industri",
    "6. Praktikum",
    "7. Kuis",
    "8. Hasil"
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonScreen(
    conceptId: String,
    viewModel: SemestaViewModel,
    modifier: Modifier = Modifier
) {
    val concept = CurriculumData.allConcepts.find { it.id == conceptId }
        ?: CurriculumData.allConcepts.first()
    val lesson = CurriculumData.getLesson(conceptId)

    val currentStep by viewModel.lessonStepIndex.collectAsState()
    val feedback = LocalSemestaFeedback.current

    BackHandler {
        feedback.playClick()
        if (currentStep > 0) {
            viewModel.lessonStepIndex.value = currentStep - 1
        } else {
            viewModel.navigateTo(ScreenDestination.Catalog)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = concept.title,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                        Text(
                            text = "${concept.topic} · Level ${concept.level.code}",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            feedback.playClick()
                            viewModel.navigateTo(ScreenDestination.Catalog)
                        },
                        modifier = Modifier.testTag("lesson_back_button")
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Kembali")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            // Step Navigation Tabs
            ScrollableTabRow(
                selectedTabIndex = currentStep,
                edgePadding = 12.dp,
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = CosmicIndigoPrimary
            ) {
                lessonSteps.forEachIndexed { idx, title ->
                    Tab(
                        selected = currentStep == idx,
                        onClick = {
                            feedback.playClick()
                            viewModel.lessonStepIndex.value = idx
                        },
                        text = {
                            Text(
                                text = title,
                                fontSize = 12.sp,
                                fontWeight = if (currentStep == idx) FontWeight.Bold else FontWeight.Normal
                            )
                        }
                    )
                }
            }

            // Step Content
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                when (currentStep) {
                    0 -> StoryStepView(
                        panels = lesson.storyPanels,
                        onNext = { viewModel.lessonStepIndex.value = 1 }
                    )
                    1 -> IntuitionStepView(
                        title = lesson.intuitionTitle,
                        body = lesson.intuitionBody,
                        bullets = lesson.intuitionPoints,
                        onNext = { viewModel.lessonStepIndex.value = 2 }
                    )
                    2 -> SimulationStepView(
                        lesson = lesson,
                        domain = concept.domain,
                        conceptTitle = concept.title,
                        onNext = { viewModel.lessonStepIndex.value = 3 }
                    )
                    3 -> FormulasStepView(
                        formulas = lesson.formulas,
                        onNext = { viewModel.lessonStepIndex.value = 4 }
                    )
                    4 -> CaseStudyStepView(
                        caseStudy = lesson.caseStudy,
                        onNext = { viewModel.lessonStepIndex.value = 5 }
                    )
                    5 -> HomeLabStepView(
                        lab = lesson.homeLab,
                        onVerify = { viewModel.onHomeLabVerified(lesson.conceptId) },
                        onNext = { viewModel.lessonStepIndex.value = 6 }
                    )
                    6 -> QuizStepView(
                        lesson = lesson,
                        viewModel = viewModel,
                        onCompleted = { viewModel.lessonStepIndex.value = 7 }
                    )
                    7 -> ResultStepView(
                        lesson = lesson,
                        viewModel = viewModel,
                        onBackToCatalog = { viewModel.navigateTo(ScreenDestination.Catalog) }
                    )
                }
            }
        }
    }
}

// -------------------------------------------------------------
// STEP 1: CERITA BERGAMBAR
// -------------------------------------------------------------
@Composable
fun StoryStepView(
    panels: List<StoryPanel>,
    onNext: () -> Unit
) {
    val feedback = LocalSemestaFeedback.current
    var panelIdx by remember { mutableIntStateOf(0) }
    val current = panels.getOrNull(panelIdx) ?: panels.first()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Cerita Bergambar: Panel ${panelIdx + 1} dari ${panels.size}",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = CosmicIndigoPrimary
                )
                // Position indicator dots
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    panels.indices.forEach { i ->
                        Box(
                            modifier = Modifier
                                .size(if (i == panelIdx) 10.dp else 6.dp)
                                .background(
                                    if (i == panelIdx) CosmicIndigoPrimary else MaterialTheme.colorScheme.outline.copy(alpha = 0.4f),
                                    CircleShape
                                )
                        )
                    }
                }
            }
        }

        // Comic Frame Card
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    // Visual illustration canvas
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp)
                            .background(
                                color = MaterialTheme.colorScheme.surface,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .border(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f), RoundedCornerShape(16.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = current.sceneVisualEmoji, fontSize = 54.sp)
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = current.title,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Text(
                        text = current.caption,
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    // Speech bubble if character dialogue
                    if (!current.dialogueSpeaker.isNullOrBlank() && !current.dialogueText.isNullOrBlank()) {
                        Spacer(modifier = Modifier.height(12.dp))
                        Surface(
                            color = CosmicIndigoPrimary.copy(alpha = 0.1f),
                            shape = RoundedCornerShape(14.dp),
                            border = androidx.compose.foundation.BorderStroke(1.dp, CosmicIndigoPrimary.copy(alpha = 0.3f)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(12.dp)) {
                                Text(
                                    text = "💬 ${current.dialogueSpeaker}:",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 12.sp,
                                    color = CosmicIndigoPrimary
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = "\"${current.dialogueText}\"",
                                    fontSize = 13.sp,
                                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            }
                        }
                    }

                    // Decision prompt if available
                    if (!current.decisionPrompt.isNullOrBlank() && current.decisionOptions != null) {
                        Spacer(modifier = Modifier.height(14.dp))
                        Text(
                            text = current.decisionPrompt,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                            color = CosmicAmberAccent
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        current.decisionOptions.forEach { opt ->
                            OutlinedButton(
                                onClick = {
                                    feedback.playClick()
                                    if (panelIdx < panels.size - 1) panelIdx++
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 3.dp),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Text(opt, fontSize = 12.sp)
                            }
                        }
                    }
                }
            }
        }

        // Panel Navigation Controls
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedButton(
                    onClick = {
                        feedback.playClick()
                        if (panelIdx > 0) panelIdx--
                    },
                    enabled = panelIdx > 0
                ) {
                    Text("Sebelumnya")
                }

                if (panelIdx < panels.size - 1) {
                    Button(
                        onClick = {
                            feedback.playClick()
                            panelIdx++
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary)
                    ) {
                        Text("Panel Berikutnya")
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
                    }
                } else {
                    Button(
                        onClick = {
                            feedback.playClick()
                            onNext()
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = CosmicEmeraldSuccess)
                    ) {
                        Text("Lanjut ke Intuisi")
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(Icons.Default.School, contentDescription = null)
                    }
                }
            }
        }
    }
}

// -------------------------------------------------------------
// STEP 2: INTUISI
// -------------------------------------------------------------
@Composable
fun IntuitionStepView(
    title: String,
    body: String,
    bullets: List<String>,
    onNext: () -> Unit
) {
    val feedback = LocalSemestaFeedback.current

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Surface(
                color = CosmicCyanSecondary.copy(alpha = 0.12f),
                shape = RoundedCornerShape(12.dp)
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.Lightbulb, contentDescription = null, tint = CosmicCyanSecondary)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Intuisi Sebelum Rumus: Pahami logikanya terlebih dahulu!",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = CosmicCyanSecondary
                    )
                }
            }
        }

        item {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
        }

        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Text(
                    text = body,
                    fontSize = 14.sp,
                    lineHeight = 22.sp,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }

        item {
            Text(
                text = "Poin-Poin Kunci Intuisi:",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        }

        itemsIndexed(bullets) { idx, point ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.Top
            ) {
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .background(CosmicIndigoPrimary.copy(alpha = 0.2f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "${idx + 1}",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = CosmicIndigoPrimary
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = point,
                    fontSize = 13.sp,
                    lineHeight = 19.sp,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }

        item {
            Spacer(modifier = Modifier.height(12.dp))
            Button(
                onClick = {
                    feedback.playClick()
                    onNext()
                },
                modifier = Modifier.fillMaxWidth().testTag("continue_to_simulation_button"),
                colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Coba Sendiri di Simulator Interaktif")
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
            }
        }
    }
}

// -------------------------------------------------------------
// STEP 3: SIMULASI INTERAKTIF
// -------------------------------------------------------------
@Composable
fun SimulationStepView(
    lesson: LessonData,
    domain: Domain,
    conceptTitle: String,
    onNext: () -> Unit
) {
    val feedback = LocalSemestaFeedback.current

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            SimulationDispatcher(
                lesson = lesson,
                domain = domain,
                conceptTitle = conceptTitle
            )
        }

        item {
            Button(
                onClick = {
                    feedback.playClick()
                    onNext()
                },
                modifier = Modifier.fillMaxWidth().testTag("continue_to_formulas_button"),
                colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Lanjut ke Konsep & Rumus")
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
            }
        }
    }
}

// -------------------------------------------------------------
// STEP 4: KONSEP & RUMUS
// -------------------------------------------------------------
@Composable
fun FormulasStepView(
    formulas: List<FormulaCard>,
    onNext: () -> Unit
) {
    val feedback = LocalSemestaFeedback.current

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Text(
                text = "Formulasi Matematika & Fisika",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Setiap rumus adalah kesimpulan padat dari hubungan besaran di dunia nyata.",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        itemsIndexed(formulas) { _, formula ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            color = CosmicIndigoPrimary,
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = formula.symbol,
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                            )
                        }
                        Text(
                            text = "Satuan: ${formula.units}",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // Equation display box
                    Surface(
                        color = Color(0xFF0F172A),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = formula.equation,
                            color = CosmicCyanLight,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            modifier = Modifier.padding(14.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = formula.meaning,
                        fontSize = 13.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "💡 Catatan Terapan: ${formula.applicationNote}",
                        fontSize = 11.sp,
                        color = CosmicAmberAccent
                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {
                    feedback.playClick()
                    onNext()
                },
                modifier = Modifier.fillMaxWidth().testTag("continue_to_casestudy_button"),
                colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Lanjut ke Studi Kasus Industri")
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
            }
        }
    }
}

// -------------------------------------------------------------
// STEP 5: STUDI KASUS INDUSTRI
// -------------------------------------------------------------
@Composable
fun CaseStudyStepView(
    caseStudy: com.example.data.model.CaseStudyData,
    onNext: () -> Unit
) {
    val feedback = LocalSemestaFeedback.current

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Surface(
                color = Color(0xFF1E293B),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("🏭", fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = "APLIKASI DUNIA NYATA",
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            color = CosmicAmberAccent,
                            letterSpacing = 1.sp
                        )
                        Text(
                            text = caseStudy.title,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
        }

        item {
            CaseSectionCard("Konteks Kejadian", caseStudy.context)
        }
        item {
            CaseSectionCard("Tantangan Rekayasa", caseStudy.engineeringProblem)
        }
        item {
            CaseSectionCard("Konsep Fisika/Matematika Terapan", caseStudy.physicalConceptUsed)
        }
        item {
            CaseSectionCard("Model Matematika Insinyur", caseStudy.mathematicalModel)
        }
        item {
            CaseSectionCard("Dampak Nyata", caseStudy.realWorldImpact)
        }

        item {
            Text(
                text = "Profesi & Karier Terkait:",
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                caseStudy.relatedCareers.forEach { c ->
                    Surface(
                        color = CosmicIndigoPrimary.copy(alpha = 0.15f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "👷 $c",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = CosmicIndigoPrimary,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                }
            }
        }

        item {
            Text(
                text = "Sumber data: ${caseStudy.verifiedSource}",
                fontSize = 10.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        item {
            Button(
                onClick = {
                    feedback.playClick()
                    onNext()
                },
                modifier = Modifier.fillMaxWidth().testTag("continue_to_homelab_button"),
                colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Lanjut ke Praktikum Rumahan")
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
            }
        }
    }
}

@Composable
fun CaseSectionCard(header: String, body: String) {
    Card(
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Text(
                text = header,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = CosmicIndigoPrimary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = body,
                fontSize = 13.sp,
                lineHeight = 19.sp,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

// -------------------------------------------------------------
// STEP 6: PRAKTIKUM RUMAHAN & JURNAL LAB INTERAKTIF
// -------------------------------------------------------------
@Composable
fun HomeLabStepView(
    lab: com.example.data.model.HomeLabData,
    onVerify: () -> Unit = {},
    onNext: () -> Unit
) {
    val feedback = LocalSemestaFeedback.current

    // State Checklist Bahan & Langkah Eksperimen
    val checkedMaterials = remember { androidx.compose.runtime.mutableStateMapOf<Int, Boolean>() }
    val checkedSteps = remember { androidx.compose.runtime.mutableStateMapOf<Int, Boolean>() }

    // State Jurnal Pengamatan Nyata
    var observationNote by remember { mutableStateOf("") }
    var isVerified by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "🔬 ${lab.title}",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Surface(
                color = CosmicEmeraldSuccess.copy(alpha = 0.15f),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Tingkat Keamanan: ${lab.safetyLevel}",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = CosmicEmeraldSuccess,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }
        }

        // Checklist Alat & Bahan Nyata
        item {
            Text(
                text = "Daftar Centang Alat & Bahan (Ceklis Persiapan):",
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
            lab.materials.forEachIndexed { idx, m ->
                val isChecked = checkedMaterials[idx] == true
                Surface(
                    color = if (isChecked) CosmicEmeraldSuccess.copy(alpha = 0.08f) else MaterialTheme.colorScheme.surfaceVariant,
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 3.dp)
                        .clickable {
                            feedback.playClick()
                            checkedMaterials[idx] = !isChecked
                        }
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Checkbox(
                            checked = isChecked,
                            onCheckedChange = {
                                feedback.playClick()
                                checkedMaterials[idx] = it
                            },
                            colors = CheckboxDefaults.colors(checkedColor = CosmicEmeraldSuccess)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = m,
                            fontSize = 13.sp,
                            fontWeight = if (isChecked) FontWeight.SemiBold else FontWeight.Normal,
                            color = if (isChecked) CosmicEmeraldSuccess else MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }
        }

        // Langkah-Langkah Percobaan Mandiri
        item {
            Text(
                text = "Langkah-Langkah Percobaan Mandiri:",
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
        }

        itemsIndexed(lab.steps) { idx, step ->
            val isStepDone = checkedSteps[idx] == true
            Card(
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (isStepDone) CosmicIndigoPrimary.copy(alpha = 0.08f) else MaterialTheme.colorScheme.surfaceVariant
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        feedback.playClick()
                        checkedSteps[idx] = !isStepDone
                    }
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Checkbox(
                        checked = isStepDone,
                        onCheckedChange = {
                            feedback.playClick()
                            checkedSteps[idx] = it
                        },
                        colors = CheckboxDefaults.colors(checkedColor = CosmicIndigoPrimary)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Langkah ${idx + 1}",
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = CosmicIndigoPrimary
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = step,
                            fontSize = 13.sp,
                            lineHeight = 19.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }
        }

        // Tujuan Pengamatan
        item {
            Surface(
                color = CosmicAmberAccent.copy(alpha = 0.12f),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        text = "🎯 Target Observasi Sains:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp,
                        color = CosmicAmberAccent
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = lab.observationGoal,
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        }

        // JURNAL LAB INTERAKTIF (PENCATATAN DATA NYATA PENGGUNA)
        item {
            Card(
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, CosmicCyanSecondary.copy(alpha = 0.4f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("📝", fontSize = 16.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Jurnal Observasi Lab Pengguna",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = CosmicCyanSecondary
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Ketikkan data hasil pengamatan Anda (misal: angka waktu, suhu, atau perubahan warna):",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        value = observationNote,
                        onValueChange = {
                            observationNote = it
                            isVerified = false
                        },
                        placeholder = { Text("Contoh: Waktu ayunan 1.8 detik, warna ekstrak berubah...", fontSize = 12.sp) },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Button(
                        onClick = {
                            feedback.playCorrect()
                            isVerified = true
                            onVerify()
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = CosmicCyanSecondary),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("🔬 Verifikasi Data dengan Teori Sains", fontSize = 12.sp)
                    }

                    // Hasil Validasi Analisis Saintifik
                    if (isVerified) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Surface(
                            color = CosmicEmeraldSuccess.copy(alpha = 0.12f),
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(
                                    text = "✓ Analisis Observasi Tervalidasi!",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 12.sp,
                                    color = CosmicEmeraldSuccess
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = "Koneksi ke Simulasi Digital: ${lab.connectionToSimulation}",
                                    fontSize = 11.sp,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            }
                        }
                    }
                }
            }
        }

        item {
            Button(
                onClick = {
                    feedback.playClick()
                    onNext()
                },
                modifier = Modifier.fillMaxWidth().testTag("continue_to_quiz_button"),
                colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Uji Pemahaman di Kuis Mastery")
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
            }
        }
    }
}

// -------------------------------------------------------------
// STEP 7: LATIHAN & KUIS MASTERY
// -------------------------------------------------------------
@Composable
fun QuizStepView(
    lesson: LessonData,
    viewModel: SemestaViewModel,
    onCompleted: () -> Unit
) {
    val feedback = LocalSemestaFeedback.current
    val quizAnswers by viewModel.quizAnswers.collectAsState()
    val quizHintsUsed by viewModel.quizHintsUsed.collectAsState()
    val isSubmitted by viewModel.quizSubmitted.collectAsState()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(
                text = "Kuis Penguasaan Konsep (${lesson.quizQuestions.size} Soal)",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Gunakan petunjuk bertahap jika merasa kesulitan. Skor akhir akan memperbarui tingkat penguasaanmu.",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        itemsIndexed(lesson.quizQuestions) { qIdx, question ->
            val userAnswer = quizAnswers[question.id] ?: ""
            val hintsCount = quizHintsUsed[question.id] ?: 0

            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "SOAL ${qIdx + 1}",
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.sp,
                            color = CosmicIndigoPrimary
                        )
                        if (question.type == "numeric") {
                            Text(
                                text = "Isian Angka (${question.unit})",
                                fontSize = 11.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = question.prompt,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        lineHeight = 20.sp
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Options or numeric text field
                    if (question.type == "multiple_choice" && question.options != null) {
                        question.options.forEach { opt ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(8.dp))
                                    .clickable(enabled = !isSubmitted) {
                                        feedback.playClick()
                                        viewModel.recordQuizAnswer(question.id, opt)
                                    }
                                    .padding(vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                RadioButton(
                                    selected = userAnswer == opt,
                                    onClick = {
                                        if (!isSubmitted) {
                                            feedback.playClick()
                                            viewModel.recordQuizAnswer(question.id, opt)
                                        }
                                    },
                                    enabled = !isSubmitted
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(opt, fontSize = 13.sp)
                            }
                        }
                    } else {
                        OutlinedTextField(
                            value = userAnswer,
                            onValueChange = { if (!isSubmitted) viewModel.recordQuizAnswer(question.id, it) },
                            placeholder = { Text("Contoh: ${question.correctAnswer}") },
                            label = { Text("Jawabanmu (${question.unit})") },
                            modifier = Modifier.fillMaxWidth().testTag("quiz_numeric_input_${question.id}"),
                            singleLine = true,
                            enabled = !isSubmitted,
                            shape = RoundedCornerShape(10.dp)
                        )
                    }

                    // Stepped Hint button
                    if (!isSubmitted && hintsCount < question.hints.size) {
                        Spacer(modifier = Modifier.height(8.dp))
                        OutlinedButton(
                            onClick = {
                                feedback.playClick()
                                viewModel.recordQuizHint(question.id)
                            },
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Icon(Icons.Default.Help, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Buka Petunjuk (${hintsCount + 1}/${question.hints.size})", fontSize = 11.sp)
                        }
                    }

                    // Active hints shown
                    if (hintsCount > 0) {
                        Spacer(modifier = Modifier.height(8.dp))
                        for (h in 0 until hintsCount) {
                            Surface(
                                color = CosmicAmberAccent.copy(alpha = 0.12f),
                                shape = RoundedCornerShape(8.dp),
                                modifier = Modifier.fillMaxWidth().padding(vertical = 2.dp)
                            ) {
                                Text(
                                    text = "💡 Petunjuk ${h + 1}: ${question.hints[h]}",
                                    fontSize = 11.sp,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                    }

                    // Post-submission feedback
                    if (isSubmitted) {
                        Spacer(modifier = Modifier.height(10.dp))
                        val isCorrect = if (question.type == "numeric") {
                            val uVal = userAnswer.replace(",", ".").toFloatOrNull()
                            val cVal = question.correctAnswer.replace(",", ".").toFloatOrNull()
                            uVal != null && cVal != null && kotlin.math.abs(uVal - cVal) <= question.tolerance
                        } else {
                            userAnswer.equals(question.correctAnswer, ignoreCase = true)
                        }

                        Surface(
                            color = if (isCorrect) CosmicEmeraldSuccess.copy(alpha = 0.15f) else CosmicRoseAlert.copy(alpha = 0.15f),
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(10.dp)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        if (isCorrect) Icons.Default.Check else Icons.Default.Close,
                                        contentDescription = null,
                                        tint = if (isCorrect) CosmicEmeraldSuccess else CosmicRoseAlert,
                                        modifier = Modifier.size(18.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = if (isCorrect) "Benar!" else "Kurang tepat. Jawaban benar: ${question.correctAnswer} ${question.unit}",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 12.sp,
                                        color = if (isCorrect) CosmicEmeraldSuccess else CosmicRoseAlert
                                    )
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = question.explanation,
                                    fontSize = 12.sp,
                                    lineHeight = 17.sp,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                                if (!question.misconception.isNullOrBlank() && !isCorrect) {
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text(
                                        text = "⚠️ Miskonsepsi Umum: ${question.misconception}",
                                        fontSize = 11.sp,
                                        color = CosmicAmberAccent
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        item {
            if (!isSubmitted) {
                Button(
                    onClick = {
                        val correctCount = lesson.quizQuestions.count { q ->
                            val uAns = quizAnswers[q.id] ?: ""
                            if (q.type == "numeric") {
                                val uVal = uAns.replace(",", ".").toFloatOrNull()
                                val cVal = q.correctAnswer.replace(",", ".").toFloatOrNull()
                                uVal != null && cVal != null && kotlin.math.abs(uVal - cVal) <= q.tolerance
                            } else {
                                uAns.equals(q.correctAnswer, ignoreCase = true)
                            }
                        }
                        val isPassing = correctCount >= (lesson.quizQuestions.size * 0.6f)
                        if (isPassing) {
                            feedback.playCorrect()
                        } else {
                            feedback.playWrong()
                        }
                        viewModel.submitQuiz(lesson)
                    },
                    modifier = Modifier.fillMaxWidth().testTag("submit_quiz_button"),
                    colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Kirim Jawaban & Evaluasi")
                }
            } else {
                Button(
                    onClick = {
                        feedback.playClick()
                        onCompleted()
                    },
                    modifier = Modifier.fillMaxWidth().testTag("view_results_button"),
                    colors = ButtonDefaults.buttonColors(containerColor = CosmicEmeraldSuccess),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Lihat Hasil & Rangkuman")
                    Spacer(modifier = Modifier.width(6.dp))
                    Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
                }
            }
        }
    }
}

// -------------------------------------------------------------
// STEP 8: HASIL & PROGRES
// -------------------------------------------------------------
@Composable
fun ResultStepView(
    lesson: LessonData,
    viewModel: SemestaViewModel,
    onBackToCatalog: () -> Unit
) {
    val feedback = LocalSemestaFeedback.current
    val score by viewModel.quizLastScore.collectAsState()
    val mastery by viewModel.quizMasteryGained.collectAsState()

    androidx.compose.runtime.LaunchedEffect(Unit) {
        feedback.playFanfare()
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(CosmicEmeraldSuccess.copy(alpha = 0.2f), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text("🎉", fontSize = 42.sp)
            }
        }

        item {
            Text(
                text = "Pelajaran Selesai!",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Text(
                text = "Kamu telah menyelesaikan seluruh siklus pembelajaran ${lesson.level.code}.",
                fontSize = 13.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        item {
            Card(
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Skor Kuis", fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            Text("${(score * 100).toInt()}%", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = CosmicIndigoPrimary)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Penguasaan", fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            Text("$mastery%", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = CosmicEmeraldSuccess)
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("XP Diraih", fontSize = 12.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            Text("+${20 + (score * 30).toInt()}", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = CosmicAmberAccent)
                        }
                    }
                }
            }
        }

        item {
            Surface(
                color = CosmicIndigoPrimary.copy(alpha = 0.12f),
                shape = RoundedCornerShape(14.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("💡", fontSize = 22.sp)
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = "Rekomendasi Langkah Berikutnya:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp
                        )
                        Text(
                            text = "Lanjutkan ke konsep 'Gaya & Hukum Newton' atau ulangi simulasi dengan sudut 30° dan 60° untuk membandingkan ketinggiannya.",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {
                    feedback.playClick()
                    onBackToCatalog()
                },
                modifier = Modifier.fillMaxWidth().testTag("back_to_catalog_button"),
                colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Kembali ke Katalog Materi")
            }
        }
    }
}

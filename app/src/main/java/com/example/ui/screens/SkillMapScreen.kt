package com.example.ui.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import com.example.ui.components.LessonTreeView
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CurriculumData
import com.example.data.model.ConceptItem
import com.example.data.model.Domain
import com.example.ui.theme.CosmicAmberAccent
import com.example.ui.theme.CosmicCyanLight
import com.example.ui.theme.CosmicEmeraldSuccess
import com.example.ui.theme.CosmicIndigoPrimary
import com.example.ui.viewmodel.ScreenDestination
import com.example.ui.viewmodel.SemestaViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SkillMapScreen(
    viewModel: SemestaViewModel,
    modifier: Modifier = Modifier
) {
    val progressList by viewModel.conceptProgressList.collectAsState()
    val completedLessonIds by viewModel.completedLessonIds.collectAsState()
    val progressMap = remember(progressList) {
        progressList.associateBy { it.conceptId }
    }

    var selectedConcept by remember { mutableStateOf<ConceptItem?>(null) }
    val sheetState = rememberModalBottomSheetState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(12.dp))

        // Title and Legend with SemestaAtomLogo
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Peta Keterampilan (Skill Tree)",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = "Jalur keterkaitan prasyarat konsep Matematika, Fisika, Kimia & Biologi dari nol sampai mahir.",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            com.example.ui.components.SemestaAtomLogo(size = 38.dp)
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Legend row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            LegendItem("Dikuasai (≥80%)", CosmicEmeraldSuccess)
            LegendItem("Sedang Belajar", CosmicAmberAccent)
            LegendItem("Tersedia", CosmicCyanLight)
        }

        Spacer(modifier = Modifier.height(12.dp))

        var viewMode by remember { mutableStateOf(0) }

        TabRow(
            selectedTabIndex = viewMode,
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = CosmicIndigoPrimary,
            modifier = Modifier.fillMaxWidth().testTag("skillmap_view_mode_tabs")
        ) {
            Tab(
                selected = viewMode == 0,
                onClick = { viewMode = 0 },
                text = { Text("🌳 Pohon Berjenjang", fontSize = 12.sp, fontWeight = if (viewMode == 0) FontWeight.Bold else FontWeight.Normal) },
                modifier = Modifier.testTag("tab_tree_view")
            )
            Tab(
                selected = viewMode == 1,
                onClick = { viewMode = 1 },
                text = { Text("🗺️ Jalur Subjek", fontSize = 12.sp, fontWeight = if (viewMode == 1) FontWeight.Bold else FontWeight.Normal) },
                modifier = Modifier.testTag("tab_track_view")
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        if (viewMode == 0) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                item {
                    val progressIntMap = remember(progressMap) {
                        progressMap.mapValues { it.value.masteryPercent }
                    }
                    LessonTreeView(
                        concepts = CurriculumData.allConcepts,
                        progressMap = progressIntMap,
                        completedLessonIds = completedLessonIds,
                        onConceptClick = { selectedConcept = it }
                    )
                }
                item {
                    Spacer(modifier = Modifier.height(30.dp))
                }
            }
        } else {
            // Interactive Node List organized by learning paths
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
            item {
                TrackHeader("JALUR MATEMATIKA", "📐", Color(0xFFA855F7))
            }

            items(CurriculumData.allConcepts.filter { it.domain == Domain.MATEMATIKA }.size) { idx ->
                val concept = CurriculumData.allConcepts.filter { it.domain == Domain.MATEMATIKA }[idx]
                val mastery = progressMap[concept.id]?.masteryPercent ?: 0
                SkillNodeCard(
                    concept = concept,
                    mastery = mastery,
                    onClick = { selectedConcept = concept }
                )
            }

            item {
                Spacer(modifier = Modifier.height(8.dp))
                // Visual Cross-Domain Bridge Banner
                Surface(
                    color = CosmicIndigoPrimary.copy(alpha = 0.12f),
                    shape = RoundedCornerShape(12.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, CosmicIndigoPrimary.copy(alpha = 0.3f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("⚡", fontSize = 18.sp)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Jembatan Konsep: Pecahan & Trigonometri Dasar menjadi fondasi mutlak untuk memahami Gerak Lurus & Gerak Parabola di Fisika!",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
            }

            item {
                TrackHeader("JALUR FISIKA", "⚛️", Color(0xFF38BDF8))
            }

            items(CurriculumData.allConcepts.filter { it.domain == Domain.FISIKA }.size) { idx ->
                val concept = CurriculumData.allConcepts.filter { it.domain == Domain.FISIKA }[idx]
                val mastery = progressMap[concept.id]?.masteryPercent ?: 0
                SkillNodeCard(
                    concept = concept,
                    mastery = mastery,
                    onClick = { selectedConcept = concept }
                )
            }

            item {
                Spacer(modifier = Modifier.height(10.dp))
                TrackHeader("JALUR KIMIA", "🧪", Color(0xFF10B981))
            }

            items(CurriculumData.allConcepts.filter { it.domain == Domain.KIMIA }.size) { idx ->
                val concept = CurriculumData.allConcepts.filter { it.domain == Domain.KIMIA }[idx]
                val mastery = progressMap[concept.id]?.masteryPercent ?: 0
                SkillNodeCard(
                    concept = concept,
                    mastery = mastery,
                    onClick = { selectedConcept = concept }
                )
            }

            item {
                Spacer(modifier = Modifier.height(10.dp))
                TrackHeader("JALUR BIOLOGI", "🌿", Color(0xFF059669))
            }

            items(CurriculumData.allConcepts.filter { it.domain == Domain.BIOLOGI }.size) { idx ->
                val concept = CurriculumData.allConcepts.filter { it.domain == Domain.BIOLOGI }[idx]
                val mastery = progressMap[concept.id]?.masteryPercent ?: 0
                SkillNodeCard(
                    concept = concept,
                    mastery = mastery,
                    onClick = { selectedConcept = concept }
                )
            }

            item {
                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }

    // Modal Bottom Sheet on Node Click
    if (selectedConcept != null) {
        val concept = selectedConcept!!
        val mastery = progressMap[concept.id]?.masteryPercent ?: 0
        val prereqs = concept.prerequisites.mapNotNull { prereqId ->
            CurriculumData.allConcepts.find { it.id == prereqId }
        }
        val allPrereqsMet = prereqs.all { (progressMap[it.id]?.masteryPercent ?: 0) >= 60 }

        ModalBottomSheet(
            onDismissRequest = { selectedConcept = null },
            sheetState = sheetState
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = if (concept.domain == Domain.FISIKA) CosmicCyanLight.copy(alpha = 0.2f) else CosmicAmberAccent.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "${concept.domain.displayName} · ${concept.level.code}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = if (concept.domain == Domain.FISIKA) CosmicCyanLight else CosmicAmberAccent,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                    Text(
                        text = "Penguasaan: $mastery%",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (mastery >= 80) CosmicEmeraldSuccess else MaterialTheme.colorScheme.onSurface
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = concept.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Text(
                    text = concept.description,
                    fontSize = 13.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Spacer(modifier = Modifier.height(14.dp))

                // Prerequisites Checklist
                if (prereqs.isNotEmpty()) {
                    Text(
                        text = "Prasyarat Konsep:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    prereqs.forEach { p ->
                        val pMastery = progressMap[p.id]?.masteryPercent ?: 0
                        val isMet = pMastery >= 60
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(vertical = 2.dp)
                        ) {
                            Icon(
                                if (isMet) Icons.Default.Check else Icons.Default.Warning,
                                contentDescription = null,
                                tint = if (isMet) CosmicEmeraldSuccess else CosmicAmberAccent,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "${p.title} (${pMastery}%)",
                                fontSize = 12.sp,
                                color = if (isMet) MaterialTheme.colorScheme.onSurface else CosmicAmberAccent
                            )
                        }
                    }
                    if (!allPrereqsMet) {
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "💡 Disarankan menyelesaikan prasyarat terlebih dahulu untuk pemahaman optimal.",
                            fontSize = 11.sp,
                            color = CosmicAmberAccent
                        )
                    }
                } else {
                    Text(
                        text = "✨ Tanpa prasyarat — kamu bisa langsung mulai!",
                        fontSize = 12.sp,
                        color = CosmicEmeraldSuccess
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = {
                        selectedConcept = null
                        viewModel.navigateTo(ScreenDestination.Lesson(concept.id))
                    },
                    modifier = Modifier.fillMaxWidth().testTag("start_lesson_from_skillmap_button"),
                    colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Icon(Icons.Default.PlayArrow, contentDescription = "Mulai")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Buka Pelajaran Sekarang")
                }
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}
}

@Composable
fun TrackHeader(title: String, icon: String, color: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Text(icon, fontSize = 18.sp)
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            color = color,
            letterSpacing = 1.sp
        )
    }
}

@Composable
fun SkillNodeCard(
    concept: ConceptItem,
    mastery: Int,
    onClick: () -> Unit
) {
    val borderColor = when {
        mastery >= 80 -> CosmicEmeraldSuccess
        mastery > 0 -> CosmicAmberAccent
        else -> MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .border(1.5.dp, borderColor, RoundedCornerShape(14.dp)),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(
            modifier = Modifier.padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .background(borderColor.copy(alpha = 0.15f), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                if (mastery >= 80) {
                    Icon(Icons.Default.Check, contentDescription = "Selesai", tint = CosmicEmeraldSuccess, modifier = Modifier.size(20.dp))
                } else {
                    Text(
                        text = "${mastery}%",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (mastery > 0) CosmicAmberAccent else MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = concept.title,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Surface(
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text(
                            text = concept.level.code,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                        )
                    }
                }
                Text(
                    text = "${concept.topic} · ±${concept.estMinutes} mnt",
                    fontSize = 11.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            Icon(
                Icons.Default.Info,
                contentDescription = "Detail",
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f),
                modifier = Modifier.size(18.dp)
            )
        }
    }
}

@Composable
fun LegendItem(label: String, color: Color) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(10.dp)
                .background(color, CircleShape)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = label, fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}

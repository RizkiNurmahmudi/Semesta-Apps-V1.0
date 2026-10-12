package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.UnfoldLess
import androidx.compose.material.icons.filled.UnfoldMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.ConceptItem
import com.example.data.model.DepthLevel
import com.example.data.model.Domain
import com.example.ui.theme.CosmicAmberAccent
import com.example.ui.theme.CosmicCyanLight
import com.example.ui.theme.CosmicCyanSecondary
import com.example.ui.theme.CosmicEmeraldSuccess
import com.example.ui.theme.CosmicIndigoPrimary

/**
 * Hierarchical tree view displaying learning levels (L0 to L5) and their
 * respective modules across Physics, Math, Chemistry, and Biology.
 * Allows users to collapse or expand each level individually or in bulk.
 */
@Composable
fun LessonTreeView(
    concepts: List<ConceptItem>,
    progressMap: Map<String, Int> = emptyMap(),
    completedLessonIds: Set<String> = emptySet(),
    onConceptClick: (ConceptItem) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedDomainFilter by remember { mutableStateOf<Domain?>(null) }

    // Map tracking expansion state for each level; L1 and L2 expanded by default
    val expandedStates = remember {
        mutableStateMapOf<DepthLevel, Boolean>().apply {
            DepthLevel.values().forEach { lvl ->
                this[lvl] = (lvl == DepthLevel.L1 || lvl == DepthLevel.L2)
            }
        }
    }

    val filteredConcepts = remember(concepts, selectedDomainFilter) {
        if (selectedDomainFilter == null) concepts
        else concepts.filter { it.domain == selectedDomainFilter }
    }

    // Group filtered concepts by level
    val conceptsByLevel = remember(filteredConcepts) {
        filteredConcepts.groupBy { it.level }
    }

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Controls Row: Domain Filters & Expand/Collapse All
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Hierarki Kurikulum",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                OutlinedButton(
                    onClick = {
                        DepthLevel.values().forEach { lvl -> expandedStates[lvl] = true }
                    },
                    shape = RoundedCornerShape(8.dp),
                    contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 8.dp, vertical = 4.dp),
                    modifier = Modifier.testTag("expand_all_button")
                ) {
                    Icon(Icons.Default.UnfoldMore, contentDescription = null, modifier = Modifier.size(14.dp))
                    Spacer(modifier = Modifier.width(3.dp))
                    Text("Buka", fontSize = 11.sp)
                }

                OutlinedButton(
                    onClick = {
                        DepthLevel.values().forEach { lvl -> expandedStates[lvl] = false }
                    },
                    shape = RoundedCornerShape(8.dp),
                    contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 8.dp, vertical = 4.dp),
                    modifier = Modifier.testTag("collapse_all_button")
                ) {
                    Icon(Icons.Default.UnfoldLess, contentDescription = null, modifier = Modifier.size(14.dp))
                    Spacer(modifier = Modifier.width(3.dp))
                    Text("Tutup", fontSize = 11.sp)
                }
            }
        }

        // Domain Filter Chips (Semua, Fisika, Matematika, Kimia, Biologi)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            FilterChip(
                selected = selectedDomainFilter == null,
                onClick = { selectedDomainFilter = null },
                label = { Text("Semua Subjek (4)") },
                modifier = Modifier.testTag("tree_filter_domain_all")
            )
            Domain.values().forEach { dom ->
                FilterChip(
                    selected = selectedDomainFilter == dom,
                    onClick = {
                        selectedDomainFilter = if (selectedDomainFilter == dom) null else dom
                    },
                    label = { Text("${dom.iconLabel} ${dom.displayName}") },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = getDomainColor(dom).copy(alpha = 0.2f),
                        selectedLabelColor = getDomainColor(dom)
                    ),
                    modifier = Modifier.testTag("tree_filter_domain_${dom.name}")
                )
            }
        }

        Spacer(modifier = Modifier.height(4.dp))

        // Level Nodes
        DepthLevel.values().forEach { level ->
            val levelModules = conceptsByLevel[level] ?: emptyList()
            val isExpanded = expandedStates[level] == true
            val levelRotation by animateFloatAsState(
                targetValue = if (isExpanded) 90f else 0f,
                label = "chevron_rotate"
            )

            val levelMasteryAvg = if (levelModules.isNotEmpty()) {
                val sum = levelModules.sumOf { progressMap[it.id] ?: 0 }
                sum / levelModules.size
            } else 0

            val completedInLevel = levelModules.count { completedLessonIds.contains(it.id) || (progressMap[it.id] ?: 0) >= 80 }
            val totalInLevel = levelModules.size
            val progressFraction = if (totalInLevel > 0) completedInLevel.toFloat() / totalInLevel else 0f
            val animatedProgress by animateFloatAsState(
                targetValue = progressFraction,
                label = "progress_bar_${level.code}"
            )

            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("level_node_${level.code}")
                    .border(
                        1.dp,
                        if (isExpanded) CosmicIndigoPrimary.copy(alpha = 0.5f) else MaterialTheme.colorScheme.outline.copy(alpha = 0.25f),
                        RoundedCornerShape(16.dp)
                    )
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    // Level Header (Collapsible trigger)
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                expandedStates[level] = !isExpanded
                            }
                            .padding(14.dp)
                            .testTag("level_header_${level.code}")
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.weight(1f)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.ChevronRight,
                                    contentDescription = if (isExpanded) "Tutup" else "Buka",
                                    modifier = Modifier
                                        .size(20.dp)
                                        .rotate(levelRotation),
                                    tint = CosmicIndigoPrimary
                                )

                                Spacer(modifier = Modifier.width(8.dp))

                                Surface(
                                    color = CosmicIndigoPrimary.copy(alpha = 0.15f),
                                    shape = RoundedCornerShape(8.dp)
                                ) {
                                    Text(
                                        text = level.code,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = CosmicIndigoPrimary,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.width(10.dp))

                                Column {
                                    Text(
                                        text = level.title,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        text = "${level.targetAge} · ${levelModules.size} materi",
                                        fontSize = 11.sp,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }

                            // Progress percentage / completion badge
                            if (levelModules.isNotEmpty()) {
                                if (progressFraction >= 1.0f) {
                                    Surface(
                                        color = CosmicEmeraldSuccess.copy(alpha = 0.15f),
                                        shape = RoundedCornerShape(8.dp)
                                    ) {
                                        Row(
                                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Icon(
                                                Icons.Default.Check,
                                                contentDescription = "Tuntas",
                                                tint = CosmicEmeraldSuccess,
                                                modifier = Modifier.size(14.dp)
                                            )
                                            Spacer(modifier = Modifier.width(4.dp))
                                            Text(
                                                text = "Tuntas",
                                                fontSize = 11.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = CosmicEmeraldSuccess
                                            )
                                        }
                                    }
                                } else {
                                    Text(
                                        text = "${(progressFraction * 100).toInt()}%",
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = if (completedInLevel > 0) CosmicAmberAccent else MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }
                        }

                        // Dynamic Visual Progress Bar next to Level
                        if (levelModules.isNotEmpty()) {
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                LinearProgressIndicator(
                                    progress = { animatedProgress },
                                    modifier = Modifier
                                        .weight(1f)
                                        .height(7.dp)
                                        .clip(RoundedCornerShape(4.dp))
                                        .testTag("level_progress_bar_${level.code}"),
                                    color = if (progressFraction >= 1.0f) CosmicEmeraldSuccess else CosmicIndigoPrimary,
                                    trackColor = MaterialTheme.colorScheme.surfaceVariant
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = "$completedInLevel/$totalInLevel selesai",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = if (progressFraction >= 1.0f) CosmicEmeraldSuccess else MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }

                    // Collapsible Children: Module items inside level
                    AnimatedVisibility(
                        visible = isExpanded,
                        enter = expandVertically() + fadeIn(),
                        exit = shrinkVertically() + fadeOut()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f))
                                .padding(horizontal = 14.dp, vertical = 10.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            if (levelModules.isEmpty()) {
                                Text(
                                    text = "Belum ada materi untuk subjek yang dipilih pada level ini.",
                                    fontSize = 12.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    modifier = Modifier.padding(vertical = 8.dp)
                                )
                            } else {
                                levelModules.forEach { concept ->
                                    val mastery = progressMap[concept.id] ?: 0
                                    val isCompleted = completedLessonIds.contains(concept.id) || mastery >= 80
                                    TreeModuleItemCard(
                                        concept = concept,
                                        mastery = mastery,
                                        isCompleted = isCompleted,
                                        onClick = { onConceptClick(concept) }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun TreeModuleItemCard(
    concept: ConceptItem,
    mastery: Int,
    isCompleted: Boolean,
    onClick: () -> Unit
) {
    val domainColor = getDomainColor(concept.domain)

    Surface(
        shape = RoundedCornerShape(12.dp),
        color = MaterialTheme.colorScheme.surface,
        border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)),
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .testTag("tree_concept_${concept.id}")
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                // Domain tag dot
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(domainColor.copy(alpha = 0.15f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = concept.domain.iconLabel, fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = concept.title,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 13.sp
                        )
                    }
                    Text(
                        text = "${concept.domain.displayName} · ${concept.topic} · ±${concept.estMinutes} mnt",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            // Mastery badge & completion checkmark
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (isCompleted) {
                    Surface(
                        color = CosmicEmeraldSuccess.copy(alpha = 0.15f),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Default.Check,
                                contentDescription = "Selesai",
                                tint = CosmicEmeraldSuccess,
                                modifier = Modifier.size(12.dp)
                            )
                            Spacer(modifier = Modifier.width(3.dp))
                            Text(
                                text = "Selesai",
                                color = CosmicEmeraldSuccess,
                                fontWeight = FontWeight.Bold,
                                fontSize = 11.sp
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(6.dp))
                }

                if (mastery > 0) {
                    Surface(
                        color = if (mastery >= 80) CosmicEmeraldSuccess.copy(alpha = 0.15f) else CosmicAmberAccent.copy(alpha = 0.15f),
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = "$mastery%",
                            color = if (mastery >= 80) CosmicEmeraldSuccess else CosmicAmberAccent,
                            fontWeight = FontWeight.Bold,
                            fontSize = 11.sp,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                } else if (!isCompleted) {
                    Icon(
                        Icons.Default.PlayArrow,
                        contentDescription = "Mulai",
                        tint = CosmicIndigoPrimary,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
    }
}

private fun getDomainColor(domain: Domain): Color {
    return when (domain) {
        Domain.FISIKA -> Color(0xFF38BDF8)
        Domain.MATEMATIKA -> Color(0xFFA855F7)
        Domain.KIMIA -> Color(0xFF10B981)
        Domain.BIOLOGI -> Color(0xFF059669)
    }
}

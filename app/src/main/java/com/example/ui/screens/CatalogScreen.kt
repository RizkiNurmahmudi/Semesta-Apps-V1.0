package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.data.CurriculumData
import com.example.data.model.DepthLevel
import com.example.data.model.Domain
import com.example.ui.components.ConceptVectorIcon
import com.example.ui.components.ProfileAvatar
import com.example.ui.components.ProgressRing
import com.example.ui.theme.SemestaAmber
import com.example.ui.theme.SemestaBabyBlue
import com.example.ui.theme.SemestaDeepBlue
import com.example.ui.theme.SemestaGreen
import com.example.ui.theme.SemestaSoftCyan
import com.example.ui.viewmodel.ScreenDestination
import com.example.ui.viewmodel.SemestaViewModel
import com.example.util.feedback.LocalSemestaFeedback

@Composable
fun CatalogScreen(
    viewModel: SemestaViewModel,
    modifier: Modifier = Modifier
) {
    val feedback = LocalSemestaFeedback.current
    val activeProfile by viewModel.activeProfile.collectAsState()
    val progressList by viewModel.conceptProgressList.collectAsState()
    val searchQuery by viewModel.searchQuery.collectAsState()
    val selectedDomain by viewModel.selectedDomain.collectAsState()
    val selectedLevel by viewModel.selectedLevel.collectAsState()

    var showWelcomeDialog by remember { mutableStateOf(false) }
    var activeQuickFilter by remember { mutableStateOf("Semua") }
    val quickFilterList = listOf("Semua", "Fisika", "Matematika", "L0", "L1", "L2", "L3", "L4", "L5")

    val progressMap = remember(progressList) {
        progressList.associateBy { it.conceptId }
    }

    val filteredConcepts = remember(searchQuery, selectedDomain, selectedLevel, activeQuickFilter) {
        CurriculumData.allConcepts.filter { c ->
            // Domain & Level from quick filter or explicit filter
            val matchQuick = when (activeQuickFilter) {
                "Semua" -> true
                "Fisika" -> c.domain == Domain.FISIKA
                "Matematika" -> c.domain == Domain.MATEMATIKA
                "L0" -> c.level == DepthLevel.L0
                "L1" -> c.level == DepthLevel.L1
                "L2" -> c.level == DepthLevel.L2
                "L3" -> c.level == DepthLevel.L3
                "L4" -> c.level == DepthLevel.L4
                "L5" -> c.level == DepthLevel.L5
                else -> true
            }
            val matchDomain = selectedDomain == null || c.domain == selectedDomain
            val matchLevel = selectedLevel == null || c.level == selectedLevel
            val matchSearch = searchQuery.isBlank() ||
                    c.title.contains(searchQuery, ignoreCase = true) ||
                    c.topic.contains(searchQuery, ignoreCase = true) ||
                    c.description.contains(searchQuery, ignoreCase = true)
            matchQuick && matchDomain && matchLevel && matchSearch
        }
    }

    val avatarKey = activeProfile?.name?.lowercase() ?: "kirana"

    if (showWelcomeDialog) {
        com.example.ui.components.SemestaWelcomeDialog(
            onDismiss = { showWelcomeDialog = false },
            onStartLearning = {
                showWelcomeDialog = false
                viewModel.navigateTo(ScreenDestination.PlacementTest)
            }
        )
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(6.dp))

            // 1. TOP GREETING & STREAK BAR (Sesuai Desain GitHub Desain-Semesta-Mobile)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable {
                        feedback.playClick()
                        showWelcomeDialog = true
                    }
                ) {
                    ProfileAvatar(
                        avatarKey = avatarKey,
                        size = 46.dp
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = "Halo, ${activeProfile?.name ?: "Kirana"}!",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 18.sp,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                        Text(
                            text = "Jalur ${activeProfile?.defaultMode ?: "Pelajar Dasar · SD"}",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                // Streak Flame Badge Button
                Surface(
                    onClick = {
                        feedback.playClick()
                        viewModel.navigateTo(ScreenDestination.Progress)
                    },
                    color = SemestaAmber.copy(alpha = 0.2f),
                    shape = RoundedCornerShape(18.dp),
                    border = BorderStroke(1.dp, SemestaAmber)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("🔥", fontSize = 13.sp)
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "${activeProfile?.currentStreak ?: 5} hari",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                }
            }
        }

        // 2. SEARCH BAR "Cari konsep..."
        item {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { viewModel.searchQuery.value = it },
                placeholder = { Text("Cari konsep fisika atau matematika...", fontSize = 13.sp) },
                leadingIcon = {
                    Icon(
                        Icons.Default.Search,
                        contentDescription = "Cari",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                },
                trailingIcon = {
                    if (searchQuery.isNotEmpty()) {
                        IconButton(onClick = {
                            feedback.playClick()
                            viewModel.searchQuery.value = ""
                        }) {
                            Icon(Icons.Default.Close, contentDescription = "Hapus")
                        }
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("catalog_search_bar"),
                shape = RoundedCornerShape(20.dp),
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = SemestaDeepBlue,
                    unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f),
                    focusedContainerColor = MaterialTheme.colorScheme.surface,
                    unfocusedContainerColor = MaterialTheme.colorScheme.surface
                )
            )
        }

        // 3. "LANJUTKAN BELAJAR" HERO CARD (Gradient Deep Blue ke Cyan + Play Button Amber)
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        feedback.playClick()
                        viewModel.navigateTo(ScreenDestination.Lesson("fis-gerak-parabola"))
                    }
                    .testTag("resume_learning_card"),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            brush = Brush.linearGradient(
                                listOf(SemestaDeepBlue, Color(0xFF2980B9), Color(0xFF52B2E8))
                            )
                        )
                        .padding(18.dp)
                ) {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.Top
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Lanjutkan belajar",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = SemestaAmber
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = "Gerak Parabola · L2",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.White
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = "Bagian 2: Menemukan sudut lemparan terjauh",
                                    fontSize = 12.sp,
                                    color = SemestaSoftCyan
                                )
                            }

                            // Play Button in Warm Amber
                            Box(
                                modifier = Modifier
                                    .size(48.dp)
                                    .background(SemestaAmber, RoundedCornerShape(16.dp))
                                    .clickable {
                                        feedback.playClick()
                                        viewModel.navigateTo(ScreenDestination.Lesson("fis-gerak-parabola"))
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    Icons.Default.PlayArrow,
                                    contentDescription = "Mulai Belajar",
                                    tint = Color(0xFF1E293B),
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        // Progress Bar 60%
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Progres Bab",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = SemestaSoftCyan
                            )
                            Text(
                                text = "60%",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = SemestaSoftCyan
                            )
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(8.dp)
                                .clip(RoundedCornerShape(4.dp))
                                .background(Color.White.copy(alpha = 0.25f))
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(0.6f)
                                    .height(8.dp)
                                    .clip(RoundedCornerShape(4.dp))
                                    .background(SemestaAmber)
                            )
                        }
                    }
                }
            }
        }

        // 4. DISCOVERY ARTWORK BANNER (Karya Seni Sains Generatif Google Imagen)
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        feedback.playClick()
                        viewModel.navigateTo(ScreenDestination.PlacementTest)
                    },
                shape = RoundedCornerShape(22.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = BorderStroke(1.dp, SemestaBabyBlue.copy(alpha = 0.35f))
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.semesta_hero_banner),
                            contentDescription = "Laboratorium Sains Semesta",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    Brush.verticalGradient(
                                        listOf(Color.Transparent, Color(0xFF0F172A).copy(alpha = 0.75f))
                                    )
                                )
                        )
                        Row(
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                color = SemestaDeepBlue,
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Text(
                                    text = "🔬 Laboratorium Terapan",
                                    color = Color.White,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Tes Jalur Belajar Adaptif",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = "Asesmen diagnostik 5 menit untuk menentukan materi idealmu.",
                                fontSize = 11.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "Mulai",
                            tint = SemestaDeepBlue,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }

        // 5. HORIZONTAL QUICK FILTER CHIPS (Semua, Fisika, Matematika, L0, L1, L2, L3)
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                quickFilterList.forEach { chip ->
                    val isSelected = activeQuickFilter == chip
                    Surface(
                        onClick = {
                            feedback.playClick()
                            activeQuickFilter = chip
                        },
                        shape = RoundedCornerShape(16.dp),
                        color = if (isSelected) SemestaDeepBlue else MaterialTheme.colorScheme.surface,
                        border = if (isSelected) null else BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f))
                    ) {
                        Text(
                            text = chip,
                            fontSize = 12.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                            color = if (isSelected) Color.White else MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp)
                        )
                    }
                }
            }
        }

        // 6. SECTION HEADER KATALOG
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Katalog Konsep (${filteredConcepts.size})",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = "Dari Nol Sampai Ahli",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        // 7. CONCEPT CARDS LIST (DENGAN VECTOR ICON & PROGRESS RING)
        items(filteredConcepts, key = { it.id }) { concept ->
            val prog = progressMap[concept.id]
            val mastery = prog?.masteryPercent ?: 0
            val iconKey = getConceptIconKey(concept.id, concept.topic)

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        feedback.playClick()
                        viewModel.navigateTo(ScreenDestination.Lesson(concept.id))
                    }
                    .testTag("concept_card_${concept.id}"),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.25f)),
                elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Concept Vector Icon
                    ConceptVectorIcon(
                        iconKey = iconKey,
                        size = 46.dp
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    // Text Details
                    Column(modifier = Modifier.weight(1f)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Surface(
                                color = if (concept.domain == Domain.FISIKA) SemestaSoftCyan else SemestaAmber.copy(alpha = 0.2f),
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text(
                                    text = "${concept.domain.iconLabel} ${concept.domain.displayName}",
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (concept.domain == Domain.FISIKA) SemestaDeepBlue else SemestaAmber,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(6.dp))
                            Surface(
                                color = MaterialTheme.colorScheme.surfaceVariant,
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text(
                                    text = concept.level.code,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = concept.title,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            color = MaterialTheme.colorScheme.onSurface
                        )

                        Text(
                            text = concept.description,
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    // Progress Ring Indicator
                    ProgressRing(
                        percent = mastery,
                        size = 38.dp
                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

private fun getConceptIconKey(conceptId: String, topic: String): String {
    val lowerId = conceptId.lowercase()
    val lowerTopic = topic.lowercase()
    return when {
        lowerId.contains("parabola") || lowerTopic.contains("parabola") -> "parabola"
        lowerId.contains("momentum") || lowerTopic.contains("momentum") -> "momentum"
        lowerId.contains("newton") || lowerTopic.contains("gaya") || lowerTopic.contains("newton") -> "newton"
        lowerId.contains("persen") || lowerTopic.contains("pecahan") || lowerTopic.contains("persen") -> "persen"
        lowerId.contains("geometri") || lowerTopic.contains("trigonometri") || lowerTopic.contains("geometri") -> "geometri"
        else -> "energi"
    }
}

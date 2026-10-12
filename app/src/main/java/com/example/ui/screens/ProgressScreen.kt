package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CurriculumData
import com.example.data.model.Domain
import com.example.ui.components.ConceptVectorIcon
import com.example.ui.components.ProgressRing
import com.example.ui.components.SemestaAtomLogo
import com.example.ui.theme.CosmicAmberAccent
import com.example.ui.theme.CosmicCyanLight
import com.example.ui.theme.CosmicCyanSecondary
import com.example.ui.theme.CosmicEmeraldSuccess
import com.example.ui.theme.CosmicIndigoPrimary
import com.example.ui.theme.SemestaAmber
import com.example.ui.theme.SemestaBabyBlue
import com.example.ui.theme.SemestaDeepBlue
import com.example.ui.theme.SemestaGreen
import com.example.ui.theme.SemestaSoftCyan
import com.example.ui.viewmodel.SemestaViewModel
import com.example.util.feedback.LocalSemestaFeedback

@Composable
fun ProgressScreen(
    viewModel: SemestaViewModel,
    modifier: Modifier = Modifier
) {
    val activeProfile by viewModel.activeProfile.collectAsState()
    val progressList by viewModel.conceptProgressList.collectAsState()
    val earnedBadges by viewModel.earnedBadges.collectAsState()

    val progressMap = remember(progressList) {
        progressList.associateBy { it.conceptId }
    }
    val earnedBadgeIds = remember(earnedBadges) {
        earnedBadges.map { it.badgeId }.toSet()
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Progres & Statistik Belajar",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                    Text(
                        text = "Pantau peta kemajuan, konsistensi harian, dan lencana pencapaianmu.",
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                SemestaAtomLogo(size = 38.dp)
            }
        }

        // Summary Hero Card
        item {
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier.fillMaxWidth().testTag("progress_summary_card")
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = "LEVEL 6",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = CosmicIndigoPrimary,
                                letterSpacing = 1.sp
                            )
                            Text(
                                text = "Penjelajah Kosmis",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Surface(
                            color = CosmicAmberAccent.copy(alpha = 0.2f),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Default.Star, contentDescription = null, tint = CosmicAmberAccent, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "${activeProfile?.totalXp ?: 120} XP",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 13.sp,
                                    color = CosmicAmberAccent
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        MetricItem("Waktu Belajar", "2j 15m", Icons.Default.Schedule, CosmicCyanLight)
                        MetricItem("Streak Harian", "${activeProfile?.currentStreak ?: 5} hari", Icons.Default.LocalFireDepartment, CosmicAmberAccent)
                        MetricItem("Konsep Dikuasai", "${progressList.count { it.masteryPercent >= 80 }} topik", Icons.Default.CheckCircle, CosmicEmeraldSuccess)
                    }
                }
            }
        }

        // Weekly Streak Tracker (Forgiving Rest Day)
        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Konsistensi 7 Hari Terakhir",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp
                        )
                        Text(
                            text = "1 hari libur/minggu pemaaf",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    val days = listOf("Sen", "Sel", "Rab", "Kam", "Jum", "Sab", "Min")
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        days.forEachIndexed { idx, day ->
                            val isCompleted = idx < 5
                            val isToday = idx == 4
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(day, fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                                Spacer(modifier = Modifier.height(6.dp))
                                Box(
                                    modifier = Modifier
                                        .size(34.dp)
                                        .background(
                                            if (isCompleted) CosmicAmberAccent else MaterialTheme.colorScheme.surfaceVariant,
                                            CircleShape
                                        )
                                        .border(
                                            if (isToday) 2.dp else 0.dp,
                                            if (isToday) CosmicIndigoPrimary else Color.Transparent,
                                            CircleShape
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    if (isCompleted) {
                                        Text("🔥", fontSize = 14.sp)
                                    } else {
                                        Text("○", fontSize = 14.sp, color = MaterialTheme.colorScheme.outline)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Leitner Spaced Repetition (SRS) Box Overview
        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Pengulangan Berjarak (Kotak Leitner SRS)",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "Konsep yang berhasil diulang naik ke kotak berikutnya untuk ingatan jangka panjang.",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        for (box in 1..5) {
                            val count = progressList.count { it.leitnerBox == box }
                            Surface(
                                color = MaterialTheme.colorScheme.surfaceVariant,
                                shape = RoundedCornerShape(10.dp),
                                modifier = Modifier.weight(1f).padding(horizontal = 2.dp)
                            ) {
                                Column(
                                    modifier = Modifier.padding(vertical = 8.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text("Kotak $box", fontSize = 10.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                                    Text("$count", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = CosmicIndigoPrimary)
                                }
                            }
                        }
                    }
                }
            }
        }

        // Concept Mastery List
        item {
            Text(
                text = "Tingkat Penguasaan per Konsep",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        items(CurriculumData.allConcepts, key = { it.id }) { concept ->
            val prog = progressMap[concept.id]
            val mastery = prog?.masteryPercent ?: 0
            val leitnerBox = prog?.leitnerBox ?: 1

            val iconKey = when {
                concept.id.contains("parabola") || concept.topic.contains("Parabola", ignoreCase = true) -> "parabola"
                concept.id.contains("momentum") || concept.topic.contains("Momentum", ignoreCase = true) -> "momentum"
                concept.id.contains("newton") || concept.topic.contains("Gaya", ignoreCase = true) || concept.topic.contains("Newton", ignoreCase = true) -> "newton"
                concept.id.contains("persen") || concept.topic.contains("Pecahan", ignoreCase = true) || concept.topic.contains("Persen", ignoreCase = true) -> "persen"
                concept.id.contains("geometri") || concept.topic.contains("Trigonometri", ignoreCase = true) || concept.topic.contains("Geometri", ignoreCase = true) -> "geometri"
                else -> "energi"
            }

            Card(
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.25f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ConceptVectorIcon(iconKey = iconKey, size = 42.dp)
                    Spacer(modifier = Modifier.width(12.dp))
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
                                    text = "SRS $leitnerBox",
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
                            fontSize = 14.sp
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    ProgressRing(percent = mastery, size = 36.dp)
                }
            }
        }

        // Earned Badges Section
        item {
            Text(
                text = "Lencana Pencapaian",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        item {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(CurriculumData.allBadges) { badge ->
                    val isEarned = earnedBadgeIds.contains(badge.id)
                    Surface(
                        color = if (isEarned) CosmicAmberAccent.copy(alpha = 0.15f) else MaterialTheme.colorScheme.surfaceVariant,
                        shape = RoundedCornerShape(14.dp),
                        border = androidx.compose.foundation.BorderStroke(
                            1.dp,
                            if (isEarned) CosmicAmberAccent else MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
                        ),
                        modifier = Modifier.width(140.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(12.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(badge.iconEmoji, fontSize = 28.sp)
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = badge.title,
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp,
                                maxLines = 1
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = if (isEarned) "Telah Diraih" else "Terkunci",
                                fontSize = 10.sp,
                                color = if (isEarned) CosmicAmberAccent else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@Composable
fun MetricItem(label: String, value: String, icon: androidx.compose.ui.graphics.vector.ImageVector, iconColor: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(icon, contentDescription = null, tint = iconColor, modifier = Modifier.size(20.dp))
        Spacer(modifier = Modifier.height(4.dp))
        Text(value, fontWeight = FontWeight.Bold, fontSize = 14.sp)
        Text(label, fontSize = 10.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}

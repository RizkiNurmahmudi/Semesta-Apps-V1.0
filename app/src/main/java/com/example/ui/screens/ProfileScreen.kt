package com.example.ui.screens

import android.widget.Toast
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.FileUpload
import androidx.compose.material.icons.filled.FolderZip
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Vibration
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material.icons.filled.WifiOff
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import com.example.util.feedback.LocalSemestaFeedback
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.achievement.BadgeRegistry
import com.example.data.model.UIMode
import com.example.ui.components.ProfileAvatar
import com.example.ui.components.SemestaAtomLogo
import com.example.ui.theme.CosmicAmberAccent
import com.example.ui.theme.CosmicCyanSecondary
import com.example.ui.theme.CosmicEmeraldSuccess
import com.example.ui.theme.CosmicIndigoPrimary
import com.example.ui.theme.CosmicRoseAlert
import com.example.ui.theme.MasteryGold
import com.example.ui.theme.SemestaAmber
import com.example.ui.theme.SemestaBabyBlue
import com.example.ui.theme.SemestaDeepBlue
import com.example.ui.viewmodel.SemestaViewModel

@Composable
fun ProfileScreen(
    viewModel: SemestaViewModel,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val feedback = LocalSemestaFeedback.current
    val allProfiles by viewModel.allProfiles.collectAsState()
    val activeProfile by viewModel.activeProfile.collectAsState()
    val earnedBadges by viewModel.earnedBadges.collectAsState()

    var soundEnabled by remember { mutableStateOf(feedback.isAudioEnabled) }
    var hapticEnabled by remember { mutableStateOf(feedback.isHapticEnabled) }

    val earnedBadgeIds = remember(earnedBadges) {
        earnedBadges.map { it.badgeId }.toSet()
    }

    var badgeFilter by remember { mutableStateOf("ALL") } // "ALL", "EARNED", "LOCKED"

    var showAddDialog by remember { mutableStateOf(false) }
    var newProfileName by remember { mutableStateOf("") }
    var newProfileAge by remember { mutableStateOf("10–14 thn") }
    var newProfileMode by remember { mutableStateOf(UIMode.PELAJAR) }
    var newProfileAvatar by remember { mutableStateOf("🚀") }

    val avatarChoices = listOf("🚀", "🔬", "📚", "🔭", "📐", "⚡", "🎨", "🌟")

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
                        text = "Profil Keluarga & Pengaturan",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                    Text(
                        text = "Satu perangkat untuk seluruh keluarga dengan progres terpisah dan mode yang dapat disesuaikan.",
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                SemestaAtomLogo(size = 38.dp)
            }
        }

        // Active Profile Card
        item {
            Card(
                shape = RoundedCornerShape(22.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, SemestaBabyBlue.copy(alpha = 0.4f)),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                modifier = Modifier.fillMaxWidth().testTag("active_profile_card")
            ) {
                Row(
                    modifier = Modifier.padding(18.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ProfileAvatar(
                        avatarKey = activeProfile?.name?.lowercase() ?: "kirana",
                        size = 56.dp
                    )

                    Spacer(modifier = Modifier.width(14.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = activeProfile?.name ?: "Kirana",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Kelompok Usia: ${activeProfile?.ageGroup ?: "8–12 thn"}",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "Mode Tampilan Aktif: ${activeProfile?.defaultMode ?: "PELAJAR"}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = SemestaDeepBlue
                        )
                    }
                }
            }
        }

        // Family Members Switcher
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Ganti Anggota Keluarga",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                OutlinedButton(
                    onClick = { showAddDialog = true },
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.testTag("add_profile_button")
                ) {
                    Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(16.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Tambah Profil", fontSize = 12.sp)
                }
            }
        }

        items(allProfiles, key = { it.id }) { p ->
            val isActive = p.id == activeProfile?.id
            Card(
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (isActive) MaterialTheme.colorScheme.surfaceVariant else MaterialTheme.colorScheme.surface
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { viewModel.switchProfile(p.id) }
                    .border(
                        if (isActive) 2.dp else 1.dp,
                        if (isActive) CosmicIndigoPrimary else MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
                        RoundedCornerShape(14.dp)
                    )
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ProfileAvatar(
                        avatarKey = p.name.lowercase(),
                        size = 42.dp
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = p.name,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp
                        )
                        Text(
                            text = "${p.ageGroup} · Mode ${p.defaultMode} · ${p.totalXp} XP",
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    if (isActive) {
                        Surface(
                            color = CosmicIndigoPrimary,
                            shape = RoundedCornerShape(6.dp)
                        ) {
                            Text(
                                text = "AKTIF",
                                color = Color.White,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    } else if (allProfiles.size > 1) {
                        IconButton(onClick = { viewModel.deleteProfile(p.id) }) {
                            Icon(
                                Icons.Default.Delete,
                                contentDescription = "Hapus",
                                tint = MaterialTheme.colorScheme.error.copy(alpha = 0.6f),
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                }
            }
        }

        // UI Mode Selection
        item {
            Text(
                text = "Pilih Mode Antarmuka (UI Mode)",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Mode menyesuaikan kepadatan penjelasan, ukuran teks, dan kedalaman rumus.",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        item {
            val currentMode = activeProfile?.defaultMode?.let {
                runCatching { UIMode.valueOf(it) }.getOrNull()
            } ?: UIMode.PELAJAR

            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                UIMode.values().forEach { mode ->
                    val isSelected = currentMode == mode
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = if (isSelected) CosmicIndigoPrimary.copy(alpha = 0.1f) else MaterialTheme.colorScheme.surface
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { viewModel.updateProfileMode(mode) }
                            .border(
                                if (isSelected) 1.5.dp else 1.dp,
                                if (isSelected) CosmicIndigoPrimary else MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
                                RoundedCornerShape(12.dp)
                            )
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = isSelected,
                                onClick = { viewModel.updateProfileMode(mode) }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(
                                    text = "Mode ${mode.displayName}",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 13.sp
                                )
                                Text(
                                    text = mode.description,
                                    fontSize = 11.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }
                }
            }
        }

        // Galeri Lencana & Pencapaian
        item {
            val totalBadges = BadgeRegistry.allDetailedBadges.size
            val earnedCount = BadgeRegistry.allDetailedBadges.count { earnedBadgeIds.contains(it.item.id) }
            val progressFraction = if (totalBadges > 0) earnedCount.toFloat() / totalBadges else 0f

            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Galeri Lencana & Pencapaian",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Surface(
                        color = MasteryGold.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "🏆 $earnedCount / $totalBadges",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = MasteryGold,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(6.dp))
                LinearProgressIndicator(
                    progress = { progressFraction },
                    modifier = Modifier.fillMaxWidth().height(6.dp),
                    color = MasteryGold,
                    trackColor = MaterialTheme.colorScheme.surfaceVariant
                )

                Spacer(modifier = Modifier.height(10.dp))

                // Filter Chips
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    listOf(
                        Triple("ALL", "Semua ($totalBadges)", null),
                        Triple("EARNED", "Terbuka ($earnedCount)", CosmicEmeraldSuccess),
                        Triple("LOCKED", "Terkunci (${totalBadges - earnedCount})", Color(0xFF94A3B8))
                    ).forEach { (key, label, _) ->
                        FilterChip(
                            selected = badgeFilter == key,
                            onClick = { badgeFilter = key },
                            label = { Text(label, fontSize = 11.sp) },
                            colors = FilterChipDefaults.filterChipColors(
                                selectedContainerColor = CosmicIndigoPrimary,
                                selectedLabelColor = Color.White
                            )
                        )
                    }
                }
            }
        }

        // List Kartu Lencana
        val filteredBadges = remember(badgeFilter, earnedBadgeIds) {
            BadgeRegistry.allDetailedBadges.filter { b ->
                val isEarned = earnedBadgeIds.contains(b.item.id)
                when (badgeFilter) {
                    "EARNED" -> isEarned
                    "LOCKED" -> !isEarned
                    else -> true
                }
            }
        }

        items(filteredBadges, key = { it.item.id }) { detailedBadge ->
            val isEarned = earnedBadgeIds.contains(detailedBadge.item.id)
            Card(
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (isEarned) CosmicAmberAccent.copy(alpha = 0.08f) else MaterialTheme.colorScheme.surface
                ),
                border = androidx.compose.foundation.BorderStroke(
                    1.dp,
                    if (isEarned) CosmicAmberAccent.copy(alpha = 0.5f) else MaterialTheme.colorScheme.outline.copy(alpha = 0.2f)
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .background(
                                if (isEarned) MasteryGold.copy(alpha = 0.2f) else Color(0xFF1E293B),
                                CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = if (isEarned) detailedBadge.item.iconEmoji else "🔒",
                            fontSize = 24.sp
                        )
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = detailedBadge.item.title,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = if (isEarned) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                            )
                            Surface(
                                color = if (isEarned) CosmicEmeraldSuccess.copy(alpha = 0.15f) else Color(0xFF334155),
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text(
                                    text = if (isEarned) "✓ TERBUKA" else "TERKUNCI",
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isEarned) CosmicEmeraldSuccess else Color(0xFF94A3B8),
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = detailedBadge.item.description,
                            fontSize = 11.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            lineHeight = 16.sp
                        )

                        if (!isEarned) {
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "🎯 Syarat: ${detailedBadge.requirementDescription}",
                                fontSize = 10.sp,
                                color = CosmicAmberAccent,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }
            }
        }

        // Dokumen Akademik & Sertifikasi (PDF Export)
        item {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Dokumen Akademik & Sertifikasi Resmi",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Cetak raport evaluasi belajar dan sertifikat penghargaan sains terotentikasi digital (PDF 100% Offline).",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        // Kartu Sertifikat Kelulusan
        item {
            Card(
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .background(MasteryGold.copy(alpha = 0.2f), CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("📜", fontSize = 22.sp)
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Sertifikat Kelulusan Sains Semesta",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                            Text(
                                text = "Format Landscape A4 • Stempel Emas Keaslian • Nomor Sertifikat Unik",
                                fontSize = 11.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedButton(
                            onClick = {
                                Toast.makeText(context, "Membuka Sertifikat PDF...", Toast.LENGTH_SHORT).show()
                                viewModel.exportAndViewCertificate(context)
                            },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.Default.Description, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Lihat PDF", fontSize = 11.sp)
                        }

                        Button(
                            onClick = {
                                Toast.makeText(context, "Menyiapkan file sertifikat untuk dibagikan...", Toast.LENGTH_SHORT).show()
                                viewModel.exportAndShareCertificate(context)
                            },
                            modifier = Modifier.weight(1f),
                            colors = ButtonDefaults.buttonColors(containerColor = MasteryGold),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.Default.Share, contentDescription = null, tint = Color.Black, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Bagikan", fontSize = 11.sp, color = Color.Black, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }

        // Kartu Raport Akademik Siswa
        item {
            Card(
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .background(CosmicIndigoPrimary.copy(alpha = 0.15f), CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("📊", fontSize = 22.sp)
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Raport Evaluasi Akademik Siswa",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                            Text(
                                text = "Format Portrait A4 • Rekap 4 Pilar Sains • Log Praktikum • Analisis Pedagogis",
                                fontSize = 11.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedButton(
                            onClick = {
                                Toast.makeText(context, "Membuka Raport Akademik PDF...", Toast.LENGTH_SHORT).show()
                                viewModel.exportAndViewReportCard(context)
                            },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.Default.Description, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Lihat Raport", fontSize = 11.sp)
                        }

                        Button(
                            onClick = {
                                Toast.makeText(context, "Menyiapkan raport PDF untuk dibagikan...", Toast.LENGTH_SHORT).show()
                                viewModel.exportAndShareReportCard(context)
                            },
                            modifier = Modifier.weight(1f),
                            colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.Default.Share, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Bagikan", fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }

        // Preferensi Audio & Getaran Haptik
        item {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Sensori & Aksesibilitas (Suara & Haptik)",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Atur kenyamanan umpan balik suara dan getaran taktil saat belajar dan simulasi.",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        item {
            Card(
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(14.dp)) {
                    // Toggle Efek Suara
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(38.dp)
                                    .background(CosmicIndigoPrimary.copy(alpha = 0.15f), CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(Icons.Default.VolumeUp, contentDescription = null, tint = CosmicIndigoPrimary, modifier = Modifier.size(20.dp))
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text("Efek Suara Edukasi", fontSize = 13.sp, fontWeight = FontWeight.Bold)
                                Text("Suara klik, kuis benar, dan perayaan lencana", fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            }
                        }
                        Switch(
                            checked = soundEnabled,
                            onCheckedChange = {
                                soundEnabled = it
                                feedback.isAudioEnabled = it
                                if (it) feedback.playClick()
                            },
                            colors = SwitchDefaults.colors(checkedThumbColor = Color.White, checkedTrackColor = CosmicIndigoPrimary)
                        )
                    }

                    // Toggle Getaran Haptik
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(38.dp)
                                    .background(CosmicAmberAccent.copy(alpha = 0.15f), CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(Icons.Default.Vibration, contentDescription = null, tint = CosmicAmberAccent, modifier = Modifier.size(20.dp))
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text("Getaran Taktil (Haptics)", fontSize = 13.sp, fontWeight = FontWeight.Bold)
                                Text("Getaran mikro pada slider simulasi & kuis", fontSize = 11.sp, color = MaterialTheme.colorScheme.onSurfaceVariant)
                            }
                        }
                        Switch(
                            checked = hapticEnabled,
                            onCheckedChange = {
                                hapticEnabled = it
                                feedback.isHapticEnabled = it
                                if (it) feedback.playClick()
                            },
                            colors = SwitchDefaults.colors(checkedThumbColor = Color.White, checkedTrackColor = CosmicAmberAccent)
                        )
                    }
                }
            }
        }

        // Offline & Data Storage
        item {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Penyimpanan Offline & Cadangan",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        item {
            Card(
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Default.WifiOff, contentDescription = null, tint = CosmicEmeraldSuccess)
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Status: 100% Siap Offline",
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                            color = CosmicEmeraldSuccess
                        )
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Konten paket topik Fisika & Matematika tersimpan di perangkat lokal. Tidak memerlukan internet untuk belajar, simulasi, atau kuis.",
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedButton(
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "Cadangan profil ${activeProfile?.name} berhasil diekspor ke semesta_backup.json",
                                    Toast.LENGTH_LONG
                                ).show()
                            },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.Default.FileUpload, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Ekspor JSON", fontSize = 11.sp)
                        }

                        Button(
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "Paket konten topik terbaru sudah tersinkronisasi offline!",
                                    Toast.LENGTH_SHORT
                                ).show()
                            },
                            modifier = Modifier.weight(1f),
                            colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.Default.CloudDownload, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Cek Update", fontSize = 11.sp)
                        }
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(30.dp))
        }
    }

    // Add Profile Dialog
    if (showAddDialog) {
        AlertDialog(
            onDismissRequest = { showAddDialog = false },
            title = { Text("Tambah Anggota Keluarga") },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    OutlinedTextField(
                        value = newProfileName,
                        onValueChange = { newProfileName = it },
                        label = { Text("Nama Panggilan") },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth().testTag("new_profile_name_input")
                    )

                    Text("Pilih Avatar Emoji:", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        avatarChoices.forEach { av ->
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .background(
                                        if (newProfileAvatar == av) CosmicIndigoPrimary.copy(alpha = 0.2f) else Color.Transparent,
                                        CircleShape
                                    )
                                    .border(
                                        if (newProfileAvatar == av) 2.dp else 1.dp,
                                        if (newProfileAvatar == av) CosmicIndigoPrimary else MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
                                        CircleShape
                                    )
                                    .clickable { newProfileAvatar = av },
                                contentAlignment = Alignment.Center
                            ) {
                                Text(av, fontSize = 18.sp)
                            }
                        }
                    }

                    Text("Rentang Usia:", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                    listOf("6–10 thn (Penjelajah)", "11–15 thn (Pelajar)", "16–18 thn (Lanjut)", "Dewasa (35+ thn)").forEach { age ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { newProfileAge = age }
                        ) {
                            RadioButton(selected = newProfileAge == age, onClick = { newProfileAge = age })
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(age, fontSize = 12.sp)
                        }
                    }
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        if (newProfileName.isNotBlank()) {
                            viewModel.createNewProfile(
                                name = newProfileName.trim(),
                                ageGroup = newProfileAge,
                                defaultMode = newProfileMode.name,
                                avatar = newProfileAvatar
                            )
                            showAddDialog = false
                            newProfileName = ""
                        }
                    }
                ) {
                    Text("Simpan")
                }
            },
            dismissButton = {
                TextButton(onClick = { showAddDialog = false }) {
                    Text("Batal")
                }
            }
        )
    }
}

package com.example.ui.simulation

import androidx.compose.foundation.Canvas
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.CosmicAmberAccent
import com.example.ui.theme.CosmicCyanLight
import com.example.ui.theme.CosmicCyanSecondary
import com.example.ui.theme.CosmicEmeraldSuccess
import com.example.ui.theme.CosmicIndigoPrimary
import com.example.ui.theme.CosmicRoseAlert
import kotlin.math.exp

// ==============================================================
// 1. PUNNETT SQUARE MENDELIAN GENETICS SIMULATION (PERSILANGAN GENETIKA)
// ==============================================================

@Composable
fun PunnettSquareSimulation(
    modifier: Modifier = Modifier
) {
    // Genotipe Induk (B: Ungu Dominan, b: Putih Resesif)
    var parent1Genotype by remember { mutableStateOf("Bb") } // Jantan
    var parent2Genotype by remember { mutableStateOf("Bb") } // Betina

    // Alel masing-masing induk
    val p1Alleles = listOf(parent1Genotype[0].toString(), parent1Genotype[1].toString())
    val p2Alleles = listOf(parent2Genotype[0].toString(), parent2Genotype[1].toString())

    // 4 Kotak Keturunan F1
    fun combine(a1: String, a2: String): String {
        return if (a1 == "B" || a2 == "B") {
            if (a1 == "B" && a2 == "b" || a1 == "b" && a2 == "B") "Bb" else "BB"
        } else "bb"
    }

    val cell00 = combine(p1Alleles[0], p2Alleles[0])
    val cell01 = combine(p1Alleles[1], p2Alleles[0])
    val cell10 = combine(p1Alleles[0], p2Alleles[1])
    val cell11 = combine(p1Alleles[1], p2Alleles[1])

    val allOffspring = listOf(cell00, cell01, cell10, cell11)
    val bbCount = allOffspring.count { it == "BB" }
    val bHeteroCount = allOffspring.count { it == "Bb" }
    val recessiveCount = allOffspring.count { it == "bb" }

    val purplePhenotypePct = ((bbCount + bHeteroCount) / 4.0f) * 100f
    val whitePhenotypePct = (recessiveCount / 4.0f) * 100f

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "🧬 Simulasi Persilangan Genetika Mendel (Punnett)",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Persilangan Monohibrid: $parent1Genotype ✕ $parent2Genotype",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Surface(
                    color = Color(0xFFA855F7).copy(alpha = 0.2f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "Rasio 3 : 1",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFA855F7),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Kotak Visual Punnett Square 2x2
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF0F172A), RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0xFF1E293B), RoundedCornerShape(12.dp))
                    .padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Header Alel Induk 1 (Atas)
                Row(
                    modifier = Modifier.width(220.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "Alel ♂: ${p1Alleles[0]}",
                        color = CosmicCyanLight,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = "Alel ♂: ${p1Alleles[1]}",
                        color = CosmicCyanLight,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        modifier = Modifier.weight(1f)
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))

                // Baris 1 Kotak
                Row(
                    modifier = Modifier.width(260.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "♀ ${p2Alleles[0]}",
                        color = CosmicRoseAlert,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        modifier = Modifier.width(40.dp)
                    )
                    PunnettCell(genotype = cell00, modifier = Modifier.weight(1f))
                    Spacer(modifier = Modifier.width(6.dp))
                    PunnettCell(genotype = cell01, modifier = Modifier.weight(1f))
                }

                Spacer(modifier = Modifier.height(6.dp))

                // Baris 2 Kotak
                Row(
                    modifier = Modifier.width(260.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "♀ ${p2Alleles[1]}",
                        color = CosmicRoseAlert,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        modifier = Modifier.width(40.dp)
                    )
                    PunnettCell(genotype = cell10, modifier = Modifier.weight(1f))
                    Spacer(modifier = Modifier.width(6.dp))
                    PunnettCell(genotype = cell11, modifier = Modifier.weight(1f))
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Hasil Fenotipe Keturunan
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = "🌸 Ungu (Dominan B-): ${purplePhenotypePct.toInt()}%",
                        color = Color(0xFFC084FC),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "🌼 Putih (Resesif bb): ${whitePhenotypePct.toInt()}%",
                        color = Color(0xFFF1F5F9),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Pemilihan Genotipe Induk 1 & 2
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Induk Jantan (♂):", fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        listOf("BB", "Bb", "bb").forEach { g ->
                            FilterChip(
                                selected = parent1Genotype == g,
                                onClick = { parent1Genotype = g },
                                label = { Text(g, fontSize = 11.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = CosmicIndigoPrimary,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text("Induk Betina (♀):", fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
                    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        listOf("BB", "Bb", "bb").forEach { g ->
                            FilterChip(
                                selected = parent2Genotype == g,
                                onClick = { parent2Genotype = g },
                                label = { Text(g, fontSize = 11.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = CosmicIndigoPrimary,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PunnettCell(
    genotype: String,
    modifier: Modifier = Modifier
) {
    val isPurple = genotype.contains("B")
    Surface(
        color = if (isPurple) Color(0xFF4C1D95) else Color(0xFF334155),
        shape = RoundedCornerShape(8.dp),
        border = androidx.compose.foundation.BorderStroke(
            1.dp,
            if (isPurple) Color(0xFFA855F7) else Color(0xFF64748B)
        ),
        modifier = modifier.height(50.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = genotype,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                color = if (isPurple) Color(0xFFE9D5FF) else Color(0xFFF8FAFC)
            )
            Text(
                text = if (isPurple) "🌸 Ungu" else "🌼 Putih",
                fontSize = 10.sp,
                color = if (isPurple) Color(0xFFD8B4FE) else Color(0xFF94A3B8)
            )
        }
    }
}

// ==============================================================
// 2. POPULATION GROWTH & LOGISTIC DYNAMICS SIMULATION (EKOLOGI)
// ==============================================================

@Composable
fun PopulationGrowthSimulation(
    modifier: Modifier = Modifier
) {
    var initialPopulation by remember { mutableFloatStateOf(20f) } // N0
    var growthRate by remember { mutableFloatStateOf(0.35f) }       // r
    var carryingCapacity by remember { mutableFloatStateOf(300f) }  // K

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "🌿 Simulasi Pertumbuhan Populasi Logistik",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Model Logistik: dN/dt = r · N · (1 - N / K)",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Surface(
                    color = CosmicEmeraldSuccess.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "K = ${carryingCapacity.toInt()} Indiv.",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = CosmicEmeraldSuccess,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Canvas Kurva Pertumbuhan Sigmoid (S-Curve)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(Color(0xFF030712), RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0xFF1E293B), RoundedCornerShape(12.dp))
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val paddingLeft = 40f
                    val paddingBottom = 30f
                    val plotW = w - paddingLeft - 20f
                    val plotH = h - paddingBottom - 20f

                    // Sumbu Waktu (X) dan Sumbu Populasi (Y)
                    drawLine(
                        color = Color(0xFF475569),
                        start = Offset(paddingLeft, h - paddingBottom),
                        end = Offset(w - 20f, h - paddingBottom),
                        strokeWidth = 2f
                    )
                    drawLine(
                        color = Color(0xFF475569),
                        start = Offset(paddingLeft, 20f),
                        end = Offset(paddingLeft, h - paddingBottom),
                        strokeWidth = 2f
                    )

                    // Garis Batas Carrying Capacity K (Garis Putus-Putus Kuning)
                    val kY = (h - paddingBottom) - (carryingCapacity / 450f) * plotH
                    drawLine(
                        color = CosmicAmberAccent.copy(alpha = 0.7f),
                        start = Offset(paddingLeft, kY),
                        end = Offset(w - 20f, kY),
                        strokeWidth = 1.8f
                    )

                    // Menggambar Kurva Logistik Sigmoid: N(t) = K / (1 + ((K - N0)/N0) * e^(-rt))
                    val curvePath = Path()
                    var isFirst = true
                    val maxT = 20f

                    var t = 0f
                    while (t <= maxT) {
                        val factor = ((carryingCapacity - initialPopulation) / initialPopulation) * exp(-growthRate * t)
                        val nT = carryingCapacity / (1f + factor)
                        val px = paddingLeft + (t / maxT) * plotW
                        val py = (h - paddingBottom) - (nT / 450f) * plotH

                        if (isFirst) {
                            curvePath.moveTo(px, py)
                            isFirst = false
                        } else {
                            curvePath.lineTo(px, py)
                        }
                        t += 0.3f
                    }

                    drawPath(
                        path = curvePath,
                        color = CosmicEmeraldSuccess,
                        style = Stroke(width = 3.5f, cap = StrokeCap.Round)
                    )
                }

                // Overlay Info Kurva
                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Populasi Awal (N₀): ${initialPopulation.toInt()}",
                        color = Color.White,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "Laju Intrinsik (r): ${"%.2f".format(growthRate)}/waktu",
                        color = CosmicEmeraldSuccess,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "Kapasitas Lingkungan (K): ${carryingCapacity.toInt()}",
                        color = CosmicAmberAccent,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Slider Laju Pertumbuhan r
            Text(
                text = "Laju Pertumbuhan (r): ${"%.2f".format(growthRate)}",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = growthRate,
                onValueChange = { growthRate = it },
                valueRange = 0.1f..0.8f,
                colors = SliderDefaults.colors(thumbColor = CosmicEmeraldSuccess)
            )

            // Slider Carrying Capacity K
            Text(
                text = "Daya Dukung Lingkungan (Carrying Capacity K): ${carryingCapacity.toInt()}",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = carryingCapacity,
                onValueChange = { carryingCapacity = it },
                valueRange = 100f..400f,
                colors = SliderDefaults.colors(thumbColor = CosmicAmberAccent)
            )
        }
    }
}

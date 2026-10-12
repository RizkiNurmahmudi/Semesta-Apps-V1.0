package com.example.ui.simulation

import androidx.compose.animation.core.animateFloatAsState
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
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
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

// ==============================================================
// 1. REACTION BALANCER & STOICHIOMETRY SIMULATION (PENYETARAAN REAKSI)
// ==============================================================

@Composable
fun ReactionBalancerSimulation(
    modifier: Modifier = Modifier
) {
    // Reaksi: a CH4 + b O2 -> c CO2 + d H2O
    var a by remember { mutableIntStateOf(1) }
    var b by remember { mutableIntStateOf(1) }
    var c by remember { mutableIntStateOf(1) }
    var d by remember { mutableIntStateOf(1) }

    // Hitung jumlah atom kiri dan kanan
    val cLeft = a * 1
    val cRight = c * 1

    val hLeft = a * 4
    val hRight = d * 2

    val oLeft = b * 2
    val oRight = c * 2 + d * 1

    val isBalanced = (cLeft == cRight) && (hLeft == hRight) && (oLeft == oRight)
    val totalLeftAtoms = cLeft + hLeft + oLeft
    val totalRightAtoms = cRight + hRight + oRight

    // Neraca visual: kemiringan timbangan (derajat)
    val tiltAngle = ((totalLeftAtoms - totalRightAtoms) * 2.5f).coerceIn(-18f, 18f)

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
                        text = "⚖️ Penyetaraan Reaksi Kimia (Stoikiometri)",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Pembakaran Gas Metana: CH₄ + O₂ → CO₂ + H₂O",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Surface(
                    color = if (isBalanced) CosmicEmeraldSuccess.copy(alpha = 0.2f) else CosmicRoseAlert.copy(alpha = 0.2f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = if (isBalanced) "✓ SETARA!" else "Belum Setara",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isBalanced) CosmicEmeraldSuccess else CosmicRoseAlert,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Canvas Neraca Timbangan Massa Atom Kimia
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
                    .background(Color(0xFF0F172A), RoundedCornerShape(12.dp))
                    .border(
                        1.dp,
                        if (isBalanced) CosmicEmeraldSuccess else Color(0xFF1E293B),
                        RoundedCornerShape(12.dp)
                    )
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val fulcrumX = w / 2f
                    val fulcrumY = h * 0.58f
                    val armLength = w * 0.38f

                    // Menggambar Tiang Timbangan
                    drawLine(
                        color = Color(0xFF64748B),
                        start = Offset(fulcrumX, fulcrumY),
                        end = Offset(fulcrumX, h - 20f),
                        strokeWidth = 5f,
                        cap = StrokeCap.Round
                    )
                    // Basis tiang
                    drawLine(
                        color = Color(0xFF64748B),
                        start = Offset(fulcrumX - 35f, h - 20f),
                        end = Offset(fulcrumX + 35f, h - 20f),
                        strokeWidth = 6f,
                        cap = StrokeCap.Round
                    )

                    // Lengan Timbangan Berotasi
                    val rad = (tiltAngle * PI / 180f).toFloat()
                    val leftPanX = fulcrumX - armLength * cos(rad)
                    val leftPanY = fulcrumY - armLength * sin(rad)
                    val rightPanX = fulcrumX + armLength * cos(rad)
                    val rightPanY = fulcrumY + armLength * sin(rad)

                    drawLine(
                        color = if (isBalanced) CosmicEmeraldSuccess else Color(0xFFCBD5E1),
                        start = Offset(leftPanX, leftPanY),
                        end = Offset(rightPanX, rightPanY),
                        strokeWidth = 4.5f,
                        cap = StrokeCap.Round
                    )

                    // Piringan Timbangan Kiri (Reaktan)
                    drawRoundRect(
                        color = CosmicCyanLight,
                        topLeft = Offset(leftPanX - 32f, leftPanY + 16f),
                        size = Size(64f, 8f),
                        cornerRadius = androidx.compose.ui.geometry.CornerRadius(4f, 4f)
                    )
                    drawLine(
                        color = Color(0xFF94A3B8),
                        start = Offset(leftPanX, leftPanY),
                        end = Offset(leftPanX - 25f, leftPanY + 16f),
                        strokeWidth = 1.5f
                    )
                    drawLine(
                        color = Color(0xFF94A3B8),
                        start = Offset(leftPanX, leftPanY),
                        end = Offset(leftPanX + 25f, leftPanY + 16f),
                        strokeWidth = 1.5f
                    )

                    // Piringan Timbangan Kanan (Produk)
                    drawRoundRect(
                        color = CosmicAmberAccent,
                        topLeft = Offset(rightPanX - 32f, rightPanY + 16f),
                        size = Size(64f, 8f),
                        cornerRadius = androidx.compose.ui.geometry.CornerRadius(4f, 4f)
                    )
                    drawLine(
                        color = Color(0xFF94A3B8),
                        start = Offset(rightPanX, rightPanY),
                        end = Offset(rightPanX - 25f, rightPanY + 16f),
                        strokeWidth = 1.5f
                    )
                    drawLine(
                        color = Color(0xFF94A3B8),
                        start = Offset(rightPanX, rightPanY),
                        end = Offset(rightPanX + 25f, rightPanY + 16f),
                        strokeWidth = 1.5f
                    )

                    // Partikel Atom di Piringan Kiri
                    val leftAtomCount = totalLeftAtoms.coerceAtMost(16)
                    for (i in 0 until leftAtomCount) {
                        val pOffset = Offset(leftPanX - 22f + (i % 6) * 8f, leftPanY + 12f - (i / 6) * 7f)
                        drawCircle(color = CosmicCyanLight, center = pOffset, radius = 3.5f)
                    }

                    // Partikel Atom di Piringan Kanan
                    val rightAtomCount = totalRightAtoms.coerceAtMost(16)
                    for (i in 0 until rightAtomCount) {
                        val pOffset = Offset(rightPanX - 22f + (i % 6) * 8f, rightPanY + 12f - (i / 6) * 7f)
                        drawCircle(color = CosmicAmberAccent, center = pOffset, radius = 3.5f)
                    }
                }

                // Status Perhitungan Atom di Bawah
                Row(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "Atom C: $cLeft vs $cRight ${if (cLeft == cRight) "✓" else "✗"}",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (cLeft == cRight) CosmicEmeraldSuccess else CosmicRoseAlert
                    )
                    Text(
                        text = "Atom H: $hLeft vs $hRight ${if (hLeft == hRight) "✓" else "✗"}",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (hLeft == hRight) CosmicEmeraldSuccess else CosmicRoseAlert
                    )
                    Text(
                        text = "Atom O: $oLeft vs $oRight ${if (oLeft == oRight) "✓" else "✗"}",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (oLeft == oRight) CosmicEmeraldSuccess else CosmicRoseAlert
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Baris Input Koefisien: [a] CH4 + [b] O2 -> [c] CO2 + [d] H2O
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                CoefficientStepper(label = "CH₄", value = a, onValueChange = { a = it })
                Text("+", fontWeight = FontWeight.Bold)
                CoefficientStepper(label = "O₂", value = b, onValueChange = { b = it })
                Text("→", fontWeight = FontWeight.Bold, color = CosmicIndigoPrimary)
                CoefficientStepper(label = "CO₂", value = c, onValueChange = { c = it })
                Text("+", fontWeight = FontWeight.Bold)
                CoefficientStepper(label = "H₂O", value = d, onValueChange = { d = it })
            }
        }
    }
}

@Composable
fun CoefficientStepper(
    label: String,
    value: Int,
    onValueChange: (Int) -> Unit
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Surface(
            color = MaterialTheme.colorScheme.surface,
            shape = RoundedCornerShape(8.dp),
            border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(2.dp)
            ) {
                IconButton(
                    onClick = { if (value > 1) onValueChange(value - 1) },
                    modifier = Modifier.size(24.dp)
                ) {
                    Icon(Icons.Default.Remove, contentDescription = null, modifier = Modifier.size(14.dp))
                }
                Text(
                    text = "$value",
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(horizontal = 4.dp)
                )
                IconButton(
                    onClick = { if (value < 6) onValueChange(value + 1) },
                    modifier = Modifier.size(24.dp)
                ) {
                    Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(14.dp))
                }
            }
        }
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = label, fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
    }
}

// ==============================================================
// 2. BOHR ATOM & QUANTUM TRANSITION SIMULATION (MODEL ATOM BOHR)
// ==============================================================

@Composable
fun BohrAtomSimulation(
    modifier: Modifier = Modifier
) {
    var nFrom by remember { mutableIntStateOf(3) } // Orbit awal
    var nTo by remember { mutableIntStateOf(2) }   // Orbit tujuan (Balmer H-alpha)

    val deltaE = if (nFrom != nTo) -13.6f * (1f / (nTo * nTo) - 1f / (nFrom * nFrom)) else 0f
    val isEmission = deltaE < 0f // de-eksitasi melepas foton
    val photonEnergyEv = abs(deltaE)
    val wavelengthNm = if (photonEnergyEv > 0f) 1240f / photonEnergyEv else 0f

    // Warna spektrum gelombang foton
    val photonColor = when {
        wavelengthNm < 380f -> Color(0xFFC084FC) // UV
        wavelengthNm in 380f..450f -> Color(0xFF818CF8) // Ungu-Nila
        wavelengthNm in 450f..495f -> CosmicCyanLight // Biru
        wavelengthNm in 495f..570f -> CosmicEmeraldSuccess // Hijau
        wavelengthNm in 570f..590f -> CosmicAmberAccent // Kuning
        wavelengthNm in 590f..750f -> CosmicRoseAlert // Merah (H-alpha 656nm!)
        else -> Color(0xFFFB7185) // IR
    }

    // Animasi elektron mengelilingi orbit
    var orbitAngle by remember { mutableFloatStateOf(0f) }
    LaunchedEffect(Unit) {
        val startTime = System.nanoTime()
        while (true) {
            withFrameNanos { now ->
                val elapsed = (now - startTime) / 1_000_000_000f
                orbitAngle = (elapsed * 2.2f) % (2f * PI.toFloat())
            }
        }
    }

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
                        text = "⚛️ Simulasi Model Atom Bohr & Transisi Foton",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Loncatan Kuantum: n = $nFrom → n = $nTo",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Surface(
                    color = photonColor.copy(alpha = 0.2f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "λ = ${"%.0f".format(wavelengthNm)} nm",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = photonColor,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Canvas Orbit Atom Bohr
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFF030712), RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0xFF1E293B), RoundedCornerShape(12.dp))
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val centerX = w / 2f
                    val centerY = h / 2f
                    val baseRadius = 18f

                    // Menggambar Cincin Orbit Energi n=1 hingga n=5
                    for (n in 1..4) {
                        val r = baseRadius + n * 20f
                        drawCircle(
                            color = if (n == nTo) CosmicCyanLight.copy(alpha = 0.6f) else Color(0xFF1F2937),
                            center = Offset(centerX, centerY),
                            radius = r,
                            style = Stroke(width = if (n == nTo) 2f else 1.2f)
                        )
                    }

                    // Inti Atom Positif (Nukleus Proton/Neutron) di Pusat
                    drawCircle(
                        brush = Brush.radialGradient(
                            colors = listOf(CosmicRoseAlert, Color(0xFF991B1B)),
                            center = Offset(centerX, centerY),
                            radius = 12f
                        ),
                        center = Offset(centerX, centerY),
                        radius = 10f
                    )

                    // Elektron di Orbit nTo
                    val electronRadius = baseRadius + nTo * 20f
                    val elX = centerX + electronRadius * cos(orbitAngle)
                    val elY = centerY + electronRadius * sin(orbitAngle)

                    drawCircle(
                        color = CosmicCyanLight,
                        center = Offset(elX, elY),
                        radius = 4.5f
                    )

                    // Gelombang Foton yang Terpancar (Emisi) atau Terserap (Absorpsi)
                    if (photonEnergyEv > 0f) {
                        val waveStartX = centerX + baseRadius + nTo * 20f
                        val waveEndX = centerX + baseRadius + 4 * 20f + 35f
                        drawLine(
                            color = photonColor,
                            start = Offset(waveStartX, centerY),
                            end = Offset(waveEndX, centerY),
                            strokeWidth = 3f,
                            cap = StrokeCap.Round
                        )
                    }
                }

                // Overlay Info Foton
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Energi Transisi (ΔE): ${"%.2f".format(photonEnergyEv)} eV",
                        color = Color.White,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = if (isEmission) "Tipe: Emisi Foton (Cahaya Dipancarkan)" else "Tipe: Absorpsi Foton (Energi Diserap)",
                        color = photonColor,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Pilihan Orbit n_awal dan n_akhir
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Orbit Awal (n_awal): $nFrom", fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
                    Slider(
                        value = nFrom.toFloat(),
                        onValueChange = { nFrom = it.toInt() },
                        valueRange = 1f..4f,
                        steps = 2,
                        colors = SliderDefaults.colors(thumbColor = CosmicAmberAccent)
                    )
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text("Orbit Tujuan (n_akhir): $nTo", fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
                    Slider(
                        value = nTo.toFloat(),
                        onValueChange = { nTo = it.toInt() },
                        valueRange = 1f..4f,
                        steps = 2,
                        colors = SliderDefaults.colors(thumbColor = CosmicCyanLight)
                    )
                }
            }
        }
    }
}

// ==============================================================
// 3. GAS EQUILIBRIUM & PISTON SIMULATION (KESETIMBANGAN GAS IDEAL)
// ==============================================================

@Composable
fun GasEquilibriumSimulation(
    modifier: Modifier = Modifier
) {
    var temperatureKelvin by remember { mutableFloatStateOf(300f) }
    var volumeLiters by remember { mutableFloatStateOf(2.0f) }
    var molesOfGas by remember { mutableFloatStateOf(1.0f) }

    val R = 0.0821f // L atm / (mol K)
    val pressureAtm = if (volumeLiters > 0f) (molesOfGas * R * temperatureKelvin) / volumeLiters else 1f

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
                        text = "💨 Simulasi Gas Ideal & Piston Silinder",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Hukum Gas Ideal: P · V = n · R · T",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Surface(
                    color = CosmicAmberAccent.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "P = ${"%.2f".format(pressureAtm)} atm",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = CosmicAmberAccent,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Canvas Bejana Silinder Piston
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp)
                    .background(Color(0xFF0F172A), RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0xFF1E293B), RoundedCornerShape(12.dp))
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val cylinderLeft = w * 0.15f
                    val cylinderRight = w * 0.85f
                    val cylinderTop = 20f
                    val cylinderBottom = h - 20f

                    // Dinding silinder
                    drawLine(color = Color(0xFF64748B), start = Offset(cylinderLeft, cylinderTop), end = Offset(cylinderLeft, cylinderBottom), strokeWidth = 5f)
                    drawLine(color = Color(0xFF64748B), start = Offset(cylinderRight, cylinderTop), end = Offset(cylinderRight, cylinderBottom), strokeWidth = 5f)
                    drawLine(color = Color(0xFF64748B), start = Offset(cylinderLeft, cylinderBottom), end = Offset(cylinderRight, cylinderBottom), strokeWidth = 5f)

                    // Posisi Piston bergerak berdasarkan Volume
                    val normVolume = (volumeLiters / 4.0f).coerceIn(0.25f, 0.95f)
                    val pistonY = cylinderBottom - (cylinderBottom - cylinderTop) * normVolume

                    // Piston Plate & Rod
                    drawRect(
                        color = Color(0xFF94A3B8),
                        topLeft = Offset(cylinderLeft + 4f, pistonY),
                        size = Size(cylinderRight - cylinderLeft - 8f, 12f)
                    )
                    drawLine(
                        color = Color(0xFFCBD5E1),
                        start = Offset((cylinderLeft + cylinderRight) / 2f, cylinderTop - 10f),
                        end = Offset((cylinderLeft + cylinderRight) / 2f, pistonY),
                        strokeWidth = 6f
                    )

                    // Partikel Gas Memantul di dalam Ruang Silinder
                    val numParticles = (molesOfGas * 18).toInt().coerceIn(10, 45)
                    for (i in 0 until numParticles) {
                        val px = cylinderLeft + 15f + ((i * 37) % (cylinderRight - cylinderLeft - 30f).toInt())
                        val py = pistonY + 16f + ((i * 53) % (cylinderBottom - pistonY - 24f).coerceAtLeast(10f).toInt())
                        drawCircle(
                            color = CosmicCyanLight,
                            center = Offset(px, py),
                            radius = 3.5f
                        )
                    }
                }

                // Overlay Info Gas
                Text(
                    text = "T: ${temperatureKelvin.toInt()} K | V: ${"%.1f".format(volumeLiters)} L | n: ${"%.1f".format(molesOfGas)} mol",
                    color = Color.White,
                    fontSize = 11.sp,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 6.dp)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Slider Suhu T
            Text(
                text = "Suhu Gas (T): ${temperatureKelvin.toInt()} K",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = temperatureKelvin,
                onValueChange = { temperatureKelvin = it },
                valueRange = 150f..600f,
                colors = SliderDefaults.colors(thumbColor = CosmicAmberAccent)
            )

            // Slider Volume Silinder V
            Text(
                text = "Volume Ruang Silinder (V): ${"%.1f".format(volumeLiters)} Liter",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = volumeLiters,
                onValueChange = { volumeLiters = it },
                valueRange = 1.0f..4.0f,
                colors = SliderDefaults.colors(thumbColor = CosmicCyanLight)
            )
        }
    }
}

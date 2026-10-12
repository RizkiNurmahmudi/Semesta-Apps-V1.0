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
import androidx.compose.material.icons.filled.ElectricBolt
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Waves
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
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
import com.example.ui.theme.PhysicsBlue
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

// ==============================================================
// 1. NEWTON MOTION & FRICTION SIMULATOR (HUKUM NEWTON & GESEKAN)
// ==============================================================

@Composable
fun NewtonMotionSimulation(
    modifier: Modifier = Modifier
) {
    var massKg by remember { mutableFloatStateOf(5.0f) }
    var appliedForceN by remember { mutableFloatStateOf(35.0f) }
    var frictionCoeff by remember { mutableFloatStateOf(0.25f) } // mu_k

    var isRunning by remember { mutableStateOf(false) }
    var positionMeters by remember { mutableFloatStateOf(0.0f) }
    var velocityMs by remember { mutableFloatStateOf(0.0f) }

    val g = 9.8f
    val normalForceN = massKg * g
    val frictionForceN = (frictionCoeff * normalForceN).coerceAtMost(appliedForceN)
    val netForceN = (appliedForceN - frictionForceN).coerceAtLeast(0f)
    val acceleration = if (massKg > 0f) netForceN / massKg else 0f

    // Animasi loop gerakan balok
    LaunchedEffect(isRunning) {
        if (isRunning) {
            val startTime = System.nanoTime()
            val initialPos = positionMeters
            val initialVel = velocityMs
            while (isRunning) {
                withFrameNanos { now ->
                    val dt = ((now - startTime) / 1_000_000_000f)
                    val currentV = initialVel + acceleration * dt
                    val currentX = initialPos + (initialVel * dt + 0.5f * acceleration * dt * dt)
                    velocityMs = currentV
                    positionMeters = currentX % 40f // wrap around untuk animasi berkelanjutan
                }
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
                        text = "🛷 Simulasi Hukum Gerak Newton & Gesekan",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Eksplorasi F = m · a dan f_gesek = μ · N",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Surface(
                    color = PhysicsBlue.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "a = ${"%.2f".format(acceleration)} m/s²",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = PhysicsBlue,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Canvas Gerakan Balok & Vektor Gaya
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(Color(0xFF0F172A), RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0xFF1E293B), RoundedCornerShape(12.dp))
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val groundY = h * 0.75f

                    // Menggambar lantai berseluncur
                    drawLine(
                        color = Color(0xFF334155),
                        start = Offset(0f, groundY),
                        end = Offset(w, groundY),
                        strokeWidth = 3f
                    )

                    // Tekstur lantai (garis miring gesekan)
                    var stripeX = 0f
                    while (stripeX < w) {
                        drawLine(
                            color = Color(0xFF1E293B),
                            start = Offset(stripeX, groundY),
                            end = Offset(stripeX - 10f, groundY + 12f),
                            strokeWidth = 1.5f
                        )
                        stripeX += 16f
                    }

                    // Posisi balok di layar
                    val boxSize = (40f + massKg * 2.5f).coerceIn(40f, 75f)
                    val normX = (positionMeters % 40f) / 40f
                    val boxLeft = 20f + normX * (w - boxSize - 100f)
                    val boxTop = groundY - boxSize

                    // Gambar Balok
                    drawRoundRect(
                        color = PhysicsBlue,
                        topLeft = Offset(boxLeft, boxTop),
                        size = Size(boxSize, boxSize),
                        cornerRadius = androidx.compose.ui.geometry.CornerRadius(6f, 6f)
                    )

                    // Label massa di dalam balok
                    // Gambar Vektor Gaya Dorong (Kanan - Hijau)
                    val forceArrowLength = (appliedForceN * 0.8f).coerceIn(15f, 90f)
                    val arrowStartX = boxLeft + boxSize
                    val arrowCenterY = boxTop + boxSize / 2f
                    drawLine(
                        color = CosmicEmeraldSuccess,
                        start = Offset(arrowStartX, arrowCenterY),
                        end = Offset(arrowStartX + forceArrowLength, arrowCenterY),
                        strokeWidth = 3f,
                        cap = StrokeCap.Round
                    )
                    // Kepala panah dorong
                    drawLine(
                        color = CosmicEmeraldSuccess,
                        start = Offset(arrowStartX + forceArrowLength, arrowCenterY),
                        end = Offset(arrowStartX + forceArrowLength - 6f, arrowCenterY - 5f),
                        strokeWidth = 3f
                    )
                    drawLine(
                        color = CosmicEmeraldSuccess,
                        start = Offset(arrowStartX + forceArrowLength, arrowCenterY),
                        end = Offset(arrowStartX + forceArrowLength - 6f, arrowCenterY + 5f),
                        strokeWidth = 3f
                    )

                    // Gambar Vektor Gaya Gesek (Kiri - Merah)
                    val frictionArrowLength = (frictionForceN * 0.8f).coerceIn(10f, 75f)
                    val fStartX = boxLeft
                    drawLine(
                        color = CosmicRoseAlert,
                        start = Offset(fStartX, arrowCenterY),
                        end = Offset(fStartX - frictionArrowLength, arrowCenterY),
                        strokeWidth = 3f,
                        cap = StrokeCap.Round
                    )
                    drawLine(
                        color = CosmicRoseAlert,
                        start = Offset(fStartX - frictionArrowLength, arrowCenterY),
                        end = Offset(fStartX - frictionArrowLength + 6f, arrowCenterY - 5f),
                        strokeWidth = 3f
                    )
                    drawLine(
                        color = CosmicRoseAlert,
                        start = Offset(fStartX - frictionArrowLength, arrowCenterY),
                        end = Offset(fStartX - frictionArrowLength + 6f, arrowCenterY + 5f),
                        strokeWidth = 3f
                    )
                }

                // Status Overlay
                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Kecepatan (v): ${"%.1f".format(velocityMs)} m/s",
                        color = CosmicCyanLight,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "Gaya Netto (ΣF): ${"%.1f".format(netForceN)} N",
                        color = Color.White,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "Gesekan (f_k): ${"%.1f".format(frictionForceN)} N",
                        color = CosmicRoseAlert,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Slider Kontrol Gaya Dorong F
            Text(
                text = "Gaya Dorong F: ${appliedForceN.toInt()} N",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = appliedForceN,
                onValueChange = { appliedForceN = it },
                valueRange = 0f..120f,
                colors = SliderDefaults.colors(
                    thumbColor = CosmicEmeraldSuccess,
                    activeTrackColor = CosmicEmeraldSuccess
                )
            )

            // Slider Massa m
            Text(
                text = "Massa Beban m: ${massKg.toInt()} kg",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = massKg,
                onValueChange = { massKg = it },
                valueRange = 1f..25f,
                colors = SliderDefaults.colors(
                    thumbColor = PhysicsBlue,
                    activeTrackColor = PhysicsBlue
                )
            )

            // Preset Koefisien Gesek μ
            Text(
                text = "Permukaan Landasan (Koefisien Gesek μ):",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                listOf(
                    Pair("Es Licin (0.05)", 0.05f),
                    Pair("Kayu (0.25)", 0.25f),
                    Pair("Karet Kasar (0.65)", 0.65f)
                ).forEach { (label, coeff) ->
                    FilterChip(
                        selected = frictionCoeff == coeff,
                        onClick = { frictionCoeff = coeff },
                        label = { Text(label, fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = CosmicIndigoPrimary,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Tombol Aksi
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = { isRunning = !isRunning },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isRunning) CosmicRoseAlert else CosmicIndigoPrimary
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Icon(
                        if (isRunning) Icons.Default.Refresh else Icons.Default.PlayArrow,
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(if (isRunning) "Jeda Simulasi" else "Mulai Dorong")
                }

                OutlinedButton(
                    onClick = {
                        isRunning = false
                        positionMeters = 0f
                        velocityMs = 0f
                    },
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("Reset Posisi")
                }
            }
        }
    }
}

// ==============================================================
// 2. RANGKAIAN LISTRIK & HUKUM OHM SIMULATOR (CIRCUIT SIMULATION)
// ==============================================================

@Composable
fun CircuitSimulation(
    modifier: Modifier = Modifier
) {
    var voltageVolts by remember { mutableFloatStateOf(12.0f) }
    var resistanceOhms by remember { mutableFloatStateOf(4.0f) }
    var isSwitchClosed by remember { mutableStateOf(true) }

    val currentAmperes = if (isSwitchClosed && resistanceOhms > 0f) voltageVolts / resistanceOhms else 0f
    val powerWatts = currentAmperes * voltageVolts

    // Animasi aliran partikel elektron
    var electronPhase by remember { mutableFloatStateOf(0f) }
    LaunchedEffect(isSwitchClosed, currentAmperes) {
        if (isSwitchClosed && currentAmperes > 0f) {
            val startTime = System.nanoTime()
            while (isSwitchClosed) {
                withFrameNanos { now ->
                    val elapsed = (now - startTime) / 1_000_000_000f
                    electronPhase = (elapsed * currentAmperes * 1.5f) % 1.0f
                }
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
                        text = "⚡ Simulasi Rangkaian Listrik & Hukum Ohm",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "V = I · R dan Daya Lampu P = V · I",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Surface(
                    color = CosmicAmberAccent.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "I = ${"%.2f".format(currentAmperes)} A",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = CosmicAmberAccent,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Canvas Sirkuit Listrik Interaktif
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFF0B132B), RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0xFF1C2541), RoundedCornerShape(12.dp))
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height

                    val left = 40f
                    val right = w - 40f
                    val top = 30f
                    val bottom = h - 30f

                    // Jalur Kabel Loop Persegi
                    val wirePath = Path().apply {
                        moveTo(left, top)
                        lineTo(right, top)
                        lineTo(right, bottom)
                        lineTo(left, bottom)
                        close()
                    }
                    drawPath(
                        path = wirePath,
                        color = if (isSwitchClosed) Color(0xFF3A86FF) else Color(0xFF334155),
                        style = Stroke(width = 4f, cap = StrokeCap.Round)
                    )

                    // Baterai di sisi Kiri
                    val batteryCenterY = (top + bottom) / 2f
                    drawRect(
                        color = Color(0xFF1E293B),
                        topLeft = Offset(left - 12f, batteryCenterY - 24f),
                        size = Size(24f, 48f)
                    )
                    drawLine(
                        color = CosmicRoseAlert,
                        start = Offset(left - 18f, batteryCenterY - 14f),
                        end = Offset(left + 18f, batteryCenterY - 14f),
                        strokeWidth = 4f
                    )
                    drawLine(
                        color = CosmicCyanLight,
                        start = Offset(left - 10f, batteryCenterY + 14f),
                        end = Offset(left + 10f, batteryCenterY + 14f),
                        strokeWidth = 4f
                    )

                    // Resistor di sisi Bawah
                    val resistorCenterX = (left + right) / 2f
                    drawRoundRect(
                        color = Color(0xFF475569),
                        topLeft = Offset(resistorCenterX - 28f, bottom - 10f),
                        size = Size(56f, 20f),
                        cornerRadius = androidx.compose.ui.geometry.CornerRadius(4f, 4f)
                    )

                    // Lampu Pijar di sisi Kanan
                    val bulbCenterY = (top + bottom) / 2f
                    val bulbRadius = 22f
                    val bulbGlowAlpha = (powerWatts / 100f).coerceIn(0.1f, 1.0f)
                    if (isSwitchClosed && powerWatts > 0f) {
                        drawCircle(
                            brush = Brush.radialGradient(
                                colors = listOf(
                                    CosmicAmberAccent.copy(alpha = bulbGlowAlpha),
                                    Color.Transparent
                                ),
                                center = Offset(right, bulbCenterY),
                                radius = 55f
                            ),
                            center = Offset(right, bulbCenterY),
                            radius = 55f
                        )
                    }
                    drawCircle(
                        color = if (isSwitchClosed && powerWatts > 0f) CosmicAmberAccent else Color(0xFF64748B),
                        center = Offset(right, bulbCenterY),
                        radius = bulbRadius
                    )

                    // Saklar di sisi Atas
                    val switchCenterX = (left + right) / 2f
                    if (isSwitchClosed) {
                        drawLine(
                            color = CosmicEmeraldSuccess,
                            start = Offset(switchCenterX - 18f, top),
                            end = Offset(switchCenterX + 18f, top),
                            strokeWidth = 5f
                        )
                    } else {
                        drawLine(
                            color = CosmicRoseAlert,
                            start = Offset(switchCenterX - 18f, top),
                            end = Offset(switchCenterX + 10f, top - 20f),
                            strokeWidth = 5f
                        )
                    }

                    // Elektron Partikel Mengalir di Kabel
                    if (isSwitchClosed && currentAmperes > 0f) {
                        val numElectrons = 16
                        val totalPerimeter = 2f * (right - left) + 2f * (bottom - top)
                        for (i in 0 until numElectrons) {
                            val dist = ((i.toFloat() / numElectrons + electronPhase) % 1.0f) * totalPerimeter
                            val pos = when {
                                dist < (right - left) -> Offset(left + dist, top)
                                dist < (right - left) + (bottom - top) -> Offset(right, top + (dist - (right - left)))
                                dist < 2f * (right - left) + (bottom - top) -> Offset(right - (dist - (right - left + bottom - top)), bottom)
                                else -> Offset(left, bottom - (dist - (2f * (right - left) + (bottom - top))))
                            }
                            drawCircle(
                                color = Color(0xFF67E8F9),
                                center = pos,
                                radius = 3.5f
                            )
                        }
                    }
                }

                // Overlay Hasil Kalkulasi Sirkuit
                Row(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        text = "V: ${voltageVolts.toInt()} V",
                        color = Color.White,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "R: ${resistanceOhms.toInt()} Ω",
                        color = Color.White,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "Daya: ${"%.1f".format(powerWatts)} W",
                        color = CosmicAmberAccent,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Saklar Toggle
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = if (isSwitchClosed) "🔌 Saklar: Tertutup (Arus Mengalir)" else "⭕ Saklar: Terbuka (Arus Terputus)",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp,
                    color = if (isSwitchClosed) CosmicEmeraldSuccess else CosmicRoseAlert
                )
                Switch(
                    checked = isSwitchClosed,
                    onCheckedChange = { isSwitchClosed = it },
                    colors = SwitchDefaults.colors(checkedThumbColor = CosmicEmeraldSuccess)
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Slider Tegangan Baterai V
            Text(
                text = "Tegangan Sumber (V): ${voltageVolts.toInt()} Volt",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = voltageVolts,
                onValueChange = { voltageVolts = it },
                valueRange = 1f..24f,
                colors = SliderDefaults.colors(
                    thumbColor = PhysicsBlue,
                    activeTrackColor = PhysicsBlue
                )
            )

            // Slider Hambatan R
            Text(
                text = "Hambatan Resistor (R): ${resistanceOhms.toInt()} Ohm (Ω)",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = resistanceOhms,
                onValueChange = { resistanceOhms = it },
                valueRange = 1f..20f,
                colors = SliderDefaults.colors(
                    thumbColor = CosmicAmberAccent,
                    activeTrackColor = CosmicAmberAccent
                )
            )
        }
    }
}

// ==============================================================
// 3. GELOMBANG & OSILASI SIMULATOR (WAVE & OSCILLATION ENGINE)
// ==============================================================

@Composable
fun WaveOscillationSimulation(
    modifier: Modifier = Modifier
) {
    var amplitude by remember { mutableFloatStateOf(35f) }
    var frequencyHz by remember { mutableFloatStateOf(1.5f) }
    var waveSpeedMs by remember { mutableFloatStateOf(60f) }

    var timePhase by remember { mutableFloatStateOf(0f) }

    LaunchedEffect(Unit) {
        val startTime = System.nanoTime()
        while (true) {
            withFrameNanos { now ->
                val elapsed = (now - startTime) / 1_000_000_000f
                timePhase = elapsed * frequencyHz * 2f * PI.toFloat()
            }
        }
    }

    val wavelengthPixels = if (frequencyHz > 0f) waveSpeedMs * 3.5f / frequencyHz else 100f

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
                        text = "🌊 Simulasi Gelombang & Osilasi Harmonik",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "y(x, t) = A · sin(kx - ωt), v = λ · f",
                        fontSize = 11.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Surface(
                    color = CosmicCyanSecondary.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "f = ${"%.1f".format(frequencyHz)} Hz",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = CosmicCyanSecondary,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Canvas Gelombang Berjalan Real-time
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(Color(0xFF030712), RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0xFF1F2937), RoundedCornerShape(12.dp))
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val centerY = h / 2f

                    // Garis sumbu netral
                    drawLine(
                        color = Color(0xFF1F2937),
                        start = Offset(0f, centerY),
                        end = Offset(w, centerY),
                        strokeWidth = 1.5f
                    )

                    // Menggambar Kurva Gelombang
                    val path = Path()
                    var first = true
                    var x = 0f
                    val k = (2f * PI.toFloat()) / wavelengthPixels.coerceAtLeast(20f)

                    while (x <= w) {
                        val y = centerY - amplitude * sin(k * x - timePhase)
                        if (first) {
                            path.moveTo(x, y)
                            first = false
                        } else {
                            path.lineTo(x, y)
                        }
                        x += 4f
                    }

                    drawPath(
                        path = path,
                        color = CosmicCyanLight,
                        style = Stroke(width = 3.5f, cap = StrokeCap.Round)
                    )

                    // Partikel Tali Bergerak Naik Turun
                    var particleX = 40f
                    while (particleX < w) {
                        val pY = centerY - amplitude * sin(k * particleX - timePhase)
                        drawCircle(
                            color = CosmicAmberAccent,
                            center = Offset(particleX, pY),
                            radius = 4.5f
                        )
                        particleX += wavelengthPixels / 2f
                    }
                }

                // Overlay Info Gelombang
                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Amplitudo (A): ${amplitude.toInt()} px",
                        color = Color.White,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "Panjang Gelombang (λ): ${wavelengthPixels.toInt()} px",
                        color = CosmicCyanLight,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Slider Amplitudo
            Text(
                text = "Amplitudo Simpangan (A): ${amplitude.toInt()}",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = amplitude,
                onValueChange = { amplitude = it },
                valueRange = 10f..65f,
                colors = SliderDefaults.colors(
                    thumbColor = CosmicCyanLight,
                    activeTrackColor = CosmicCyanLight
                )
            )

            // Slider Frekuensi f
            Text(
                text = "Frekuensi (f): ${"%.1f".format(frequencyHz)} Hz",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = frequencyHz,
                onValueChange = { frequencyHz = it },
                valueRange = 0.5f..4.0f,
                colors = SliderDefaults.colors(
                    thumbColor = CosmicAmberAccent,
                    activeTrackColor = CosmicAmberAccent
                )
            )
        }
    }
}

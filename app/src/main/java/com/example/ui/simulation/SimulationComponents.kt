package com.example.ui.simulation

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Speed
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateListOf
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
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.CosmicAmberAccent
import com.example.ui.theme.CosmicCyanLight
import com.example.ui.theme.CosmicCyanSecondary
import com.example.ui.theme.CosmicEmeraldSuccess
import com.example.ui.theme.CosmicIndigoPrimary
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

// ==========================================
// 1. GERAK PARABOLA (PROJECTILE SIMULATION)
// ==========================================

data class GravityPreset(val name: String, val g: Float)

val gravityOptions = listOf(
    GravityPreset("Bumi (9,8)", 9.8f),
    GravityPreset("Bulan (1,6)", 1.6f),
    GravityPreset("Mars (3,7)", 3.7f)
)

data class TrajectoryPoint(val x: Float, val y: Float)

@Composable
fun ProjectileSimulation(
    modifier: Modifier = Modifier,
    targetDistanceMeters: Float = 40.8f,
    onTargetHit: () -> Unit = {}
) {
    var angleDeg by remember { mutableFloatStateOf(45f) }
    var speedMs by remember { mutableFloatStateOf(20f) }
    var selectedGravity by remember { mutableStateOf(gravityOptions[0]) }

    var isSimulating by remember { mutableStateOf(false) }
    var currentTimeSec by remember { mutableFloatStateOf(0f) }
    var hasHitTarget by remember { mutableStateOf(false) }

    // Ghost traces from past shots
    val previousPaths = remember { mutableStateListOf<List<TrajectoryPoint>>() }
    val currentTrace = remember { mutableStateListOf<TrajectoryPoint>() }

    val rad = (angleDeg * PI / 180f).toFloat()
    val g = selectedGravity.g
    val v0x = speedMs * cos(rad)
    val v0y = speedMs * sin(rad)
    val totalTime = (2f * v0y / g).coerceAtLeast(0.1f)
    val theoreticalRange = (speedMs * speedMs * sin(2f * rad) / g)
    val maxTheoreticalHeight = (v0y * v0y / (2f * g))

    // Animation frame tick
    LaunchedEffect(isSimulating) {
        if (isSimulating) {
            val startTime = System.nanoTime()
            val initialCurrentTime = currentTimeSec
            while (isSimulating) {
                withFrameNanos { now ->
                    val elapsed = (now - startTime) / 1_000_000_000f
                    val t = initialCurrentTime + elapsed * 1.2f // slightly accelerated for snappy feel
                    if (t >= totalTime) {
                        currentTimeSec = totalTime
                        isSimulating = false
                        // Check target hit
                        if (kotlin.math.abs(theoreticalRange - targetDistanceMeters) <= 1.8f) {
                            hasHitTarget = true
                            onTargetHit()
                        }
                        if (currentTrace.isNotEmpty()) {
                            previousPaths.add(currentTrace.toList())
                            if (previousPaths.size > 3) previousPaths.removeAt(0)
                        }
                    } else {
                        currentTimeSec = t
                        val currentX = v0x * t
                        val currentY = (v0y * t - 0.5f * g * t * t).coerceAtLeast(0f)
                        currentTrace.add(TrajectoryPoint(currentX, currentY))
                    }
                }
            }
        }
    }

    val currentBallX = v0x * currentTimeSec
    val currentBallY = (v0y * currentTimeSec - 0.5f * g * currentTimeSec * currentTimeSec).coerceAtLeast(0f)

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Target Challenge banner
            Surface(
                color = if (hasHitTarget) CosmicEmeraldSuccess.copy(alpha = 0.15f) else CosmicAmberAccent.copy(alpha = 0.15f),
                shape = RoundedCornerShape(12.dp),
                border = androidx.compose.foundation.BorderStroke(
                    1.dp,
                    if (hasHitTarget) CosmicEmeraldSuccess else CosmicAmberAccent
                ),
                modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp)
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = if (hasHitTarget) "🎯 TARGET TERCAPAI!" else "🎯 TANTANGAN MISI",
                        fontWeight = FontWeight.Bold,
                        color = if (hasHitTarget) CosmicEmeraldSuccess else CosmicAmberAccent,
                        fontSize = 13.sp
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = if (hasHitTarget)
                            "Hebat! Lemparan 45° pada 20 m/s tepat sasaran!"
                        else
                            "Atur sudut & kecepatan agar mendarat di $targetDistanceMeters m!",
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
            }

            // Canvas view
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(Color(0xFF0F172A), Color(0xFF1E293B), Color(0xFF0F172A))
                        ),
                        shape = RoundedCornerShape(16.dp)
                    )
                    .border(1.dp, Color(0xFF334155), RoundedCornerShape(16.dp))
                    .padding(8.dp)
            ) {
                Canvas(modifier = Modifier.fillMaxSize().testTag("projectile_canvas")) {
                    val w = size.width
                    val h = size.height
                    val groundY = h - 24f
                    val scaleX = (w - 60f) / 60f // scale 60 meters max
                    val scaleY = (h - 40f) / 25f // scale 25 meters max height

                    // Ground line
                    drawLine(
                        color = Color(0xFF22C55E),
                        start = Offset(20f, groundY),
                        end = Offset(w - 10f, groundY),
                        strokeWidth = 3f
                    )

                    // Target marker at 40.8m
                    val targetX = 20f + targetDistanceMeters * scaleX
                    drawLine(
                        color = Color(0xFFEF4444),
                        start = Offset(targetX, groundY),
                        end = Offset(targetX, groundY - 30f),
                        strokeWidth = 3f
                    )
                    // Target basket ring
                    drawCircle(
                        color = Color(0xFFF59E0B),
                        radius = 8f,
                        center = Offset(targetX, groundY - 30f),
                        style = Stroke(width = 3f)
                    )

                    // Ghost traces from past shots
                    previousPaths.forEach { pathPoints ->
                        if (pathPoints.size > 1) {
                            val path = Path()
                            val first = pathPoints.first()
                            path.moveTo(20f + first.x * scaleX, groundY - first.y * scaleY)
                            for (p in pathPoints) {
                                path.lineTo(20f + p.x * scaleX, groundY - p.y * scaleY)
                            }
                            drawPath(
                                path = path,
                                color = Color(0xFF64748B),
                                style = Stroke(width = 1.5f, cap = StrokeCap.Round)
                            )
                        }
                    }

                    // Active shot path
                    if (currentTrace.isNotEmpty()) {
                        val path = Path()
                        val first = currentTrace.first()
                        path.moveTo(20f + first.x * scaleX, groundY - first.y * scaleY)
                        for (p in currentTrace) {
                            path.lineTo(20f + p.x * scaleX, groundY - p.y * scaleY)
                        }
                        drawPath(
                            path = path,
                            color = CosmicCyanLight,
                            style = Stroke(width = 2.5f, cap = StrokeCap.Round)
                        )
                    }

                    // Current Ball
                    val ballCanvasX = 20f + currentBallX * scaleX
                    val ballCanvasY = groundY - currentBallY * scaleY
                    drawCircle(
                        color = Color(0xFFF97316),
                        radius = 8f,
                        center = Offset(ballCanvasX, ballCanvasY)
                    )
                    drawCircle(
                        color = Color.White,
                        radius = 3.5f,
                        center = Offset(ballCanvasX, ballCanvasY)
                    )

                    // Launcher Cannon indicator
                    val cannonAngleRad = angleDeg * PI.toFloat() / 180f
                    val cannonLen = 22f
                    drawLine(
                        color = Color(0xFF38BDF8),
                        start = Offset(20f, groundY),
                        end = Offset(20f + cannonLen * cos(cannonAngleRad), groundY - cannonLen * sin(cannonAngleRad)),
                        strokeWidth = 5f,
                        cap = StrokeCap.Round
                    )
                }

                // Live Telemetry HUD Overlay
                Surface(
                    color = Color(0xCC000000),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(4.dp)
                ) {
                    Column(modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)) {
                        Text(
                            text = "R : ${"%.1f".format(theoreticalRange)} m",
                            color = CosmicCyanLight,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace
                        )
                        Text(
                            text = "H : ${"%.1f".format(maxTheoreticalHeight)} m",
                            color = CosmicAmberAccent,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace
                        )
                        Text(
                            text = "t : ${"%.2f".format(currentTimeSec)} / ${"%.2f".format(totalTime)} s",
                            color = Color.White,
                            fontSize = 11.sp,
                            fontFamily = FontFamily.Monospace
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Parameter Sliders
            Text(
                text = "Sudut Elevasi (θ): ${angleDeg.toInt()}°",
                fontWeight = FontWeight.SemiBold,
                fontSize = 13.sp
            )
            Slider(
                value = angleDeg,
                onValueChange = {
                    angleDeg = it
                    currentTimeSec = 0f
                    hasHitTarget = false
                },
                valueRange = 10f..85f,
                steps = 74,
                modifier = Modifier.testTag("angle_slider"),
                colors = SliderDefaults.colors(thumbColor = CosmicIndigoPrimary, activeTrackColor = CosmicIndigoPrimary)
            )

            Text(
                text = "Kecepatan Awal (v₀): ${speedMs.toInt()} m/s",
                fontWeight = FontWeight.SemiBold,
                fontSize = 13.sp
            )
            Slider(
                value = speedMs,
                onValueChange = {
                    speedMs = it
                    currentTimeSec = 0f
                    hasHitTarget = false
                },
                valueRange = 5f..35f,
                steps = 29,
                modifier = Modifier.testTag("velocity_slider"),
                colors = SliderDefaults.colors(thumbColor = CosmicCyanSecondary, activeTrackColor = CosmicCyanSecondary)
            )

            // Gravity preset selector
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Gravitasi:", fontSize = 12.sp, fontWeight = FontWeight.Medium)
                gravityOptions.forEach { preset ->
                    FilterChip(
                        selected = selectedGravity == preset,
                        onClick = {
                            selectedGravity = preset
                            currentTimeSec = 0f
                            hasHitTarget = false
                        },
                        label = { Text(preset.name, fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = CosmicIndigoPrimary.copy(alpha = 0.2f),
                            selectedLabelColor = CosmicIndigoPrimary
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Controls Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Button(
                    onClick = {
                        currentTimeSec = 0f
                        currentTrace.clear()
                        isSimulating = true
                        hasHitTarget = false
                    },
                    modifier = Modifier.weight(1f).testTag("fire_button"),
                    colors = ButtonDefaults.buttonColors(containerColor = CosmicIndigoPrimary)
                ) {
                    Icon(Icons.Default.PlayArrow, contentDescription = "Tembak")
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("Tembak Proyektil")
                }

                OutlinedButton(
                    onClick = {
                        isSimulating = false
                        currentTimeSec = 0f
                        currentTrace.clear()
                        previousPaths.clear()
                        hasHitTarget = false
                    },
                    modifier = Modifier.testTag("reset_button")
                ) {
                    Icon(Icons.Default.Refresh, contentDescription = "Reset")
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Reset")
                }
            }
        }
    }
}

// ==========================================
// 2. PECAHAN & RASIO (FRACTION SIMULATION)
// ==========================================

@Composable
fun FractionSimulation(modifier: Modifier = Modifier) {
    var numeratorA by remember { mutableFloatStateOf(1f) }
    var denominatorA by remember { mutableFloatStateOf(2f) }

    var numeratorB by remember { mutableFloatStateOf(2f) }
    var denominatorB by remember { mutableFloatStateOf(4f) }

    val valA = numeratorA / denominatorA
    val valB = numeratorB / denominatorB
    val isEquivalent = kotlin.math.abs(valA - valB) < 0.001f

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Eksplorasi Pecahan Senilai",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = "Bandingkan dua pecahan secara visual dan perhatikan bagian yang diarsir.",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Fraction Bars Visualization
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF0F172A), RoundedCornerShape(14.dp))
                    .padding(14.dp)
            ) {
                // Fraction A Bar
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Pecahan A: ${numeratorA.toInt()}/${denominatorA.toInt()} (${"%.2f".format(valA)})",
                        color = CosmicCyanLight,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(34.dp)
                        .background(Color(0xFF334155), RoundedCornerShape(8.dp))
                ) {
                    val denIntA = denominatorA.toInt()
                    val numIntA = numeratorA.toInt()
                    for (i in 0 until denIntA) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxSize()
                                .padding(1.dp)
                                .background(
                                    if (i < numIntA) CosmicCyanSecondary else Color.Transparent,
                                    RoundedCornerShape(4.dp)
                                )
                                .border(1.dp, Color(0xFF64748B), RoundedCornerShape(4.dp))
                        )
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Fraction B Bar
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Pecahan B: ${numeratorB.toInt()}/${denominatorB.toInt()} (${"%.2f".format(valB)})",
                        color = CosmicAmberAccent,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(34.dp)
                        .background(Color(0xFF334155), RoundedCornerShape(8.dp))
                ) {
                    val denIntB = denominatorB.toInt()
                    val numIntB = numeratorB.toInt()
                    for (i in 0 until denIntB) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxSize()
                                .padding(1.dp)
                                .background(
                                    if (i < numIntB) CosmicAmberAccent else Color.Transparent,
                                    RoundedCornerShape(4.dp)
                                )
                                .border(1.dp, Color(0xFF64748B), RoundedCornerShape(4.dp))
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Equivalence badge
                Surface(
                    color = if (isEquivalent) CosmicEmeraldSuccess.copy(alpha = 0.2f) else Color(0xFF1E293B),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(8.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = if (isEquivalent) "✨ Pecahan Senilai! (${numeratorA.toInt()}/${denominatorA.toInt()} = ${numeratorB.toInt()}/${denominatorB.toInt()})"
                            else if (valA > valB) "Pecahan A lebih besar dari Pecahan B"
                            else "Pecahan B lebih besar dari Pecahan A",
                            color = if (isEquivalent) CosmicEmeraldSuccess else Color.White,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 12.sp
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Sliders for Fraction A
            Text("Atur Pembilang A: ${numeratorA.toInt()}", fontSize = 12.sp)
            Slider(
                value = numeratorA,
                onValueChange = { numeratorA = it.coerceAtMost(denominatorA) },
                valueRange = 1f..denominatorA,
                steps = (denominatorA - 2).toInt().coerceAtLeast(0)
            )
            Text("Atur Penyebut A: ${denominatorA.toInt()}", fontSize = 12.sp)
            Slider(
                value = denominatorA,
                onValueChange = {
                    denominatorA = it
                    if (numeratorA > it) numeratorA = it
                },
                valueRange = 2f..10f,
                steps = 7
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Sliders for Fraction B
            Text("Atur Pembilang B: ${numeratorB.toInt()}", fontSize = 12.sp)
            Slider(
                value = numeratorB,
                onValueChange = { numeratorB = it.coerceAtMost(denominatorB) },
                valueRange = 1f..denominatorB,
                steps = (denominatorB - 2).toInt().coerceAtLeast(0)
            )
            Text("Atur Penyebut B: ${denominatorB.toInt()}", fontSize = 12.sp)
            Slider(
                value = denominatorB,
                onValueChange = {
                    denominatorB = it
                    if (numeratorB > it) numeratorB = it
                },
                valueRange = 2f..12f,
                steps = 9
            )
        }
    }
}

// ==========================================
// 3. TRIGONOMETRI DASAR (TRIANGLE SIMULATION)
// ==========================================

@Composable
fun TrigonometrySimulation(modifier: Modifier = Modifier) {
    var angleDeg by remember { mutableFloatStateOf(30f) }

    val rad = (angleDeg * PI / 180f).toFloat()
    val sinVal = sin(rad)
    val cosVal = cos(rad)
    val tanVal = (sinVal / cosVal.coerceAtLeast(0.001f))

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Segitiga Siku-Siku Interaktif",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = "Geser sudut untuk melihat perbandingan rasio Sinus, Cosinus, dan Tangen secara langsung.",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(14.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(Color(0xFF0F172A), RoundedCornerShape(16.dp))
                    .padding(12.dp)
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val originX = 40f
                    val originY = h - 30f
                    val hypPixels = (w - 100f).coerceAtMost(h - 50f) * 1.1f

                    val adjPixels = hypPixels * cosVal
                    val oppPixels = hypPixels * sinVal

                    // Draw Triangle
                    val cornerX = originX + adjPixels
                    val cornerY = originY
                    val peakX = originX + adjPixels
                    val peakY = originY - oppPixels

                    // Adjacent line (Samping)
                    drawLine(
                        color = Color(0xFF38BDF8),
                        start = Offset(originX, originY),
                        end = Offset(cornerX, cornerY),
                        strokeWidth = 4f
                    )

                    // Opposite line (Depan)
                    drawLine(
                        color = Color(0xFFEF4444),
                        start = Offset(cornerX, cornerY),
                        end = Offset(peakX, peakY),
                        strokeWidth = 4f
                    )

                    // Hypotenuse line (Miring)
                    drawLine(
                        color = Color(0xFFF59E0B),
                        start = Offset(originX, originY),
                        end = Offset(peakX, peakY),
                        strokeWidth = 4f
                    )

                    // Right angle square indicator
                    drawRect(
                        color = Color(0xFF94A3B8),
                        topLeft = Offset(cornerX - 16f, cornerY - 16f),
                        size = Size(16f, 16f),
                        style = Stroke(width = 2f)
                    )
                }

                // Values HUD
                Surface(
                    color = Color(0xCC000000),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.align(Alignment.TopEnd).padding(4.dp)
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text("sin(${"%.0f".format(angleDeg)}°) = ${"%.3f".format(sinVal)}", color = Color(0xFFEF4444), fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        Text("cos(${"%.0f".format(angleDeg)}°) = ${"%.3f".format(cosVal)}", color = Color(0xFF38BDF8), fontSize = 11.sp, fontWeight = FontWeight.Bold)
                        Text("tan(${"%.0f".format(angleDeg)}°) = ${"%.3f".format(tanVal)}", color = Color(0xFFF59E0B), fontSize = 11.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            Text("Sudut Elevasi (θ): ${angleDeg.toInt()}°", fontWeight = FontWeight.SemiBold, fontSize = 13.sp)
            Slider(
                value = angleDeg,
                onValueChange = { angleDeg = it },
                valueRange = 15f..75f,
                steps = 59,
                colors = SliderDefaults.colors(thumbColor = CosmicIndigoPrimary, activeTrackColor = CosmicIndigoPrimary)
            )

            // Preset angle chips
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                listOf(30f, 45f, 60f).forEach { presetAngle ->
                    FilterChip(
                        selected = angleDeg == presetAngle,
                        onClick = { angleDeg = presetAngle },
                        label = { Text("${presetAngle.toInt()}° (Istimewa)", fontSize = 11.sp) }
                    )
                }
            }
        }
    }
}

// ==========================================
// 4. ASAM, BASA & pH (CHEMISTRY SIMULATION)
// ==========================================

@Composable
fun AcidBaseSimulation(modifier: Modifier = Modifier) {
    var phValue by remember { mutableFloatStateOf(7.0f) }

    val liquidColor = when {
        phValue < 2.5f -> Color(0xFFDC2626) // Merah tua (Asam Kuat)
        phValue < 4.5f -> Color(0xFFEA580C) // Oranye (Asam Sedang)
        phValue < 6.5f -> Color(0xFFEAB308) // Kuning (Asam Lemah)
        phValue in 6.5f..7.5f -> Color(0xFF10B981) // Hijau Zamrud (Netral)
        phValue < 9.5f -> Color(0xFF06B6D4) // Sian / Biru Muda (Basa Lemah)
        phValue < 11.5f -> Color(0xFF2563EB) // Biru Pekat (Basa Sedang)
        else -> Color(0xFF7C3AED) // Ungu / Violet (Basa Kuat)
    }

    val solutionLabel = when {
        phValue < 3.0f -> "Asam Sangat Kuat (mis. Asam Lambung / Air Aki)"
        phValue < 6.0f -> "Asam Lemah (mis. Perasan Lemon / Kopi)"
        phValue in 6.0f..7.5f -> "Netral (mis. Air Murni / Darah Sehat)"
        phValue < 10.0f -> "Basa Lemah (mis. Sabun Mandi / Air Laut)"
        else -> "Basa Sangat Kuat (mis. Pemutih / Pembersih Saluran)"
    }

    val isNeutral = kotlin.math.abs(phValue - 7.0f) <= 0.15f

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Laboratorium pH & Titrasi Kimia",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = "Amati perubahan warna indikator universal dan konsentrasi ion H⁺ vs OH⁻ saat larutan diubah.",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Beaker & Digital pH Meter Canvas View
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFF0F172A), RoundedCornerShape(16.dp))
                    .padding(12.dp)
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height

                    // Beaker Glass outline
                    val beakerLeft = w * 0.28f
                    val beakerRight = w * 0.72f
                    val beakerTop = h * 0.22f
                    val beakerBottom = h * 0.88f
                    val beakerRadius = 16f

                    // Beaker Liquid Fill
                    val liquidTop = beakerTop + (beakerBottom - beakerTop) * 0.35f
                    val liquidPath = Path().apply {
                        moveTo(beakerLeft + 4f, liquidTop)
                        lineTo(beakerRight - 4f, liquidTop)
                        lineTo(beakerRight - 4f, beakerBottom - beakerRadius)
                        quadraticTo(beakerRight - 4f, beakerBottom - 4f, beakerRight - beakerRadius, beakerBottom - 4f)
                        lineTo(beakerLeft + beakerRadius, beakerBottom - 4f)
                        quadraticTo(beakerLeft + 4f, beakerBottom - 4f, beakerLeft + 4f, beakerBottom - beakerRadius)
                        close()
                    }
                    drawPath(path = liquidPath, color = liquidColor.copy(alpha = 0.82f))

                    // Glass border & graduation markings
                    val glassPath = Path().apply {
                        moveTo(beakerLeft - 8f, beakerTop)
                        lineTo(beakerLeft, beakerTop)
                        lineTo(beakerLeft, beakerBottom - beakerRadius)
                        quadraticTo(beakerLeft, beakerBottom, beakerLeft + beakerRadius, beakerBottom)
                        lineTo(beakerRight - beakerRadius, beakerBottom)
                        quadraticTo(beakerRight, beakerBottom, beakerRight, beakerBottom - beakerRadius)
                        lineTo(beakerRight, beakerTop)
                        lineTo(beakerRight + 8f, beakerTop)
                    }
                    drawPath(path = glassPath, color = Color(0xFF94A3B8), style = Stroke(width = 3.5f))

                    // Graduations lines (100ml, 200ml, 300ml)
                    for (i in 1..3) {
                        val markY = beakerBottom - i * ((beakerBottom - beakerTop) * 0.22f)
                        drawLine(
                            color = Color(0x99FFFFFF),
                            start = Offset(beakerLeft + 6f, markY),
                            end = Offset(beakerLeft + 24f, markY),
                            strokeWidth = 2f
                        )
                    }

                    // Electrode / pH Probe dipping into liquid
                    drawLine(
                        color = Color(0xFF475569),
                        start = Offset(w * 0.5f, 10f),
                        end = Offset(w * 0.5f, liquidTop + 45f),
                        strokeWidth = 6f,
                        cap = StrokeCap.Round
                    )
                    drawCircle(
                        color = Color(0xFF38BDF8),
                        radius = 6f,
                        center = Offset(w * 0.5f, liquidTop + 45f)
                    )
                }

                // Digital pH Meter HUD
                Surface(
                    color = Color(0xDD000000),
                    shape = RoundedCornerShape(10.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF334155)),
                    modifier = Modifier.align(Alignment.TopEnd)
                ) {
                    Column(
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = "pH ${"%.1f".format(phValue)}",
                            color = liquidColor,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace
                        )
                        Text(
                            text = if (phValue < 7f) "[H⁺] > [OH⁻]" else if (phValue > 7f) "[OH⁻] > [H⁺]" else "[H⁺] = [OH⁻]",
                            color = Color.White,
                            fontSize = 10.sp,
                            fontFamily = FontFamily.Monospace
                        )
                    }
                }

                // Status chip at bottom
                Surface(
                    color = if (isNeutral) CosmicEmeraldSuccess.copy(alpha = 0.25f) else Color(0x99000000),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 4.dp)
                ) {
                    Text(
                        text = if (isNeutral) "✨ NETRAL SEMPURNA (pH 7,0)" else solutionLabel,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = if (isNeutral) CosmicEmeraldSuccess else Color.White,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // pH Slider
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Skala pH: ${"%.1f".format(phValue)}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = liquidColor
                )
                Text(
                    text = if (phValue < 7f) "Sifat Asam" else if (phValue > 7f) "Sifat Basa" else "Netral",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            Slider(
                value = phValue,
                onValueChange = { phValue = it },
                valueRange = 0f..14f,
                steps = 139,
                colors = SliderDefaults.colors(
                    thumbColor = liquidColor,
                    activeTrackColor = liquidColor
                )
            )

            // Dropper Quick Titration Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedButton(
                    onClick = { phValue = (phValue - 1.0f).coerceAtLeast(0f) },
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("+ Asam (HCl)", fontSize = 11.sp, color = Color(0xFFDC2626))
                }

                Button(
                    onClick = { phValue = 7.0f },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(containerColor = CosmicEmeraldSuccess),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("Netralkan", fontSize = 11.sp)
                }

                OutlinedButton(
                    onClick = { phValue = (phValue + 1.0f).coerceAtMost(14f) },
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("+ Basa (NaOH)", fontSize = 11.sp, color = Color(0xFF2563EB))
                }
            }
        }
    }
}

// ==========================================
// 5. FOTOSINTESIS & DAUN (BIOLOGY SIMULATION)
// ==========================================

@Composable
fun PhotosynthesisSimulation(modifier: Modifier = Modifier) {
    var lightIntensity by remember { mutableFloatStateOf(70f) }
    var co2Level by remember { mutableFloatStateOf(60f) }
    var waterLevel by remember { mutableFloatStateOf(80f) }

    // Limiting factor principle (Hukum Liebig / Blackman)
    // Rate is limited by the scarcest resource
    val effectiveRate = minOf(lightIntensity, co2Level, waterLevel)
    val isOptimal = effectiveRate >= 85f

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Laboratorium Fotosintesis & Kloroplas",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = "Atur intensitas cahaya matahari, kadar CO₂, dan air untuk melihat laju produksi Oksigen (O₂) dan Glukosa.",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Canvas Leaf Chamber
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFF0F172A), RoundedCornerShape(16.dp))
                    .padding(12.dp)
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height

                    // Sunlight Rays from top left
                    val rayAlpha = (lightIntensity / 100f).coerceIn(0.1f, 0.9f)
                    val sunColor = Color(0xFFFDE047).copy(alpha = rayAlpha)
                    for (i in 0..4) {
                        drawLine(
                            color = sunColor,
                            start = Offset(20f + i * 25f, 0f),
                            end = Offset(w * 0.4f + i * 20f, h * 0.55f),
                            strokeWidth = 3f + (lightIntensity / 25f)
                        )
                    }

                    // Stylized Plant Leaf Cross Section in Center
                    val leafCenterY = h * 0.65f
                    val leafPath = Path().apply {
                        moveTo(w * 0.15f, leafCenterY)
                        quadraticTo(w * 0.5f, leafCenterY - 60f, w * 0.85f, leafCenterY)
                        quadraticTo(w * 0.5f, leafCenterY + 50f, w * 0.15f, leafCenterY)
                        close()
                    }
                    val leafGreen = Color(0xFF16A34A).copy(alpha = 0.85f)
                    drawPath(path = leafPath, color = leafGreen)
                    drawPath(path = leafPath, color = Color(0xFF22C55E), style = Stroke(width = 3f))

                    // Leaf Veins
                    drawLine(
                        color = Color(0xFF15803D),
                        start = Offset(w * 0.15f, leafCenterY),
                        end = Offset(w * 0.85f, leafCenterY),
                        strokeWidth = 3f
                    )

                    // Oxygen (O2) Bubbles rising from leaf
                    val bubbleCount = (effectiveRate / 15f).toInt()
                    for (b in 0 until bubbleCount) {
                        val bx = w * 0.35f + b * 22f
                        val by = leafCenterY - 40f - (b * 12f)
                        drawCircle(
                            color = Color(0xFF38BDF8).copy(alpha = 0.8f),
                            radius = 6f + (b % 3),
                            center = Offset(bx, by)
                        )
                        drawCircle(
                            color = Color.White,
                            radius = 2.5f,
                            center = Offset(bx - 2f, by - 2f)
                        )
                    }

                    // Water droplet at root/stem
                    val waterAlpha = (waterLevel / 100f).coerceIn(0.2f, 1f)
                    drawCircle(
                        color = Color(0xFF0284C7).copy(alpha = waterAlpha),
                        radius = 10f,
                        center = Offset(w * 0.18f, leafCenterY + 15f)
                    )
                }

                // Digital HUD Dashboard
                Surface(
                    color = Color(0xDD000000),
                    shape = RoundedCornerShape(10.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF334155)),
                    modifier = Modifier.align(Alignment.TopEnd)
                ) {
                    Column(
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = "Laju O₂: ${"%.0f".format(effectiveRate)}%",
                            color = if (isOptimal) CosmicEmeraldSuccess else CosmicCyanLight,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace
                        )
                        Text(
                            text = if (isOptimal) "Panen Glukosa Maksimal!" else "Faktor Pembatas Aktif",
                            color = if (isOptimal) CosmicEmeraldSuccess else CosmicAmberAccent,
                            fontSize = 10.sp
                        )
                    }
                }

                // Chemical Equation Banner at Bottom
                Surface(
                    color = Color(0xB3000000),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 4.dp)
                ) {
                    Text(
                        text = "6 CO₂ + 6 H₂O + Cahaya ➔ C₆H₁₂O₆ + 6 O₂",
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontFamily = FontFamily.Monospace,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Sunlight Slider
            Text(
                text = "☀️ Intensitas Cahaya Matahari: ${lightIntensity.toInt()}%",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = lightIntensity,
                onValueChange = { lightIntensity = it },
                valueRange = 0f..100f,
                colors = SliderDefaults.colors(
                    thumbColor = Color(0xFFFBBF24),
                    activeTrackColor = Color(0xFFFBBF24)
                )
            )

            // CO2 Slider
            Text(
                text = "💨 Konsentrasi Karbon Dioksida (CO₂): ${co2Level.toInt()}%",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = co2Level,
                onValueChange = { co2Level = it },
                valueRange = 0f..100f,
                colors = SliderDefaults.colors(
                    thumbColor = Color(0xFF94A3B8),
                    activeTrackColor = Color(0xFF94A3B8)
                )
            )

            // Water Slider
            Text(
                text = "💧 Ketersediaan Air (H₂O): ${waterLevel.toInt()}%",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = waterLevel,
                onValueChange = { waterLevel = it },
                valueRange = 0f..100f,
                colors = SliderDefaults.colors(
                    thumbColor = Color(0xFF38BDF8),
                    activeTrackColor = Color(0xFF38BDF8)
                )
            )

            // Quick Preset Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedButton(
                    onClick = {
                        lightIntensity = 30f
                        co2Level = 50f
                        waterLevel = 40f
                    },
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("Mendung", fontSize = 11.sp)
                }

                Button(
                    onClick = {
                        lightIntensity = 95f
                        co2Level = 90f
                        waterLevel = 90f
                    },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(containerColor = CosmicEmeraldSuccess),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("Optimal (95%)", fontSize = 11.sp)
                }

                OutlinedButton(
                    onClick = {
                        lightIntensity = 90f
                        co2Level = 20f
                        waterLevel = 90f
                    },
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("Krisis CO₂", fontSize = 11.sp)
                }
            }
        }
    }
}



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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Functions
import androidx.compose.material.icons.filled.Transform
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.geometry.Size
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
import com.example.ui.theme.MathPurple
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

// ==============================================================
// 1. CALCULUS & FUNCTION PLOTTER SIMULATION (TURUNAN & INTEGRAL)
// ==============================================================

@Composable
fun CalculusPlotterSimulation(
    modifier: Modifier = Modifier
) {
    // Parameter fungsi kuadrat: f(x) = a*x^2 + b*x + c
    var a by remember { mutableFloatStateOf(0.5f) }
    var b by remember { mutableFloatStateOf(-0.5f) }
    var c by remember { mutableFloatStateOf(-2.0f) }
    var x0 by remember { mutableFloatStateOf(1.5f) } // Titik evaluasi turunan

    // Batas integral tentu [xStart, xEnd]
    var xStart by remember { mutableFloatStateOf(-1.0f) }
    var xEnd by remember { mutableFloatStateOf(2.5f) }

    // Kalkulasi nilai fungsi dan turunan di x0
    val fx0 = a * x0 * x0 + b * x0 + c
    val derivative = 2f * a * x0 + b // f'(x0)

    // Kalkulasi integral tentu analitis: F(x) = (a/3)*x^3 + (b/2)*x^2 + c*x
    fun antiDerivative(x: Float): Float = (a / 3f) * x * x * x + (b / 2f) * x * x + c * x
    val definiteIntegral = antiDerivative(xEnd) - antiDerivative(xStart)

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
                        text = "📈 Simulasi Kalkulus: Kurva, Turunan & Integral",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "f(x) = ${"%.1f".format(a)}x² + ${"%.1f".format(b)}x + ${"%.1f".format(c)}",
                        fontSize = 12.sp,
                        color = MathPurple,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold
                    )
                }
                Surface(
                    color = MathPurple.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "f'(${ "%.1f".format(x0) }) = ${"%.2f".format(derivative)}",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = MathPurple,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Canvas Kurva Grafik Kartesius
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFF0A0F1D), RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0xFF1E293B), RoundedCornerShape(12.dp))
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val originX = w / 2f
                    val originY = h / 2f
                    val scale = 22f // piksel per unit matematis

                    // Garis kisi-kisi (Grid)
                    for (i in -10..10) {
                        val gx = originX + i * scale
                        if (gx in 0f..w) {
                            drawLine(
                                color = Color(0xFF1E293B),
                                start = Offset(gx, 0f),
                                end = Offset(gx, h),
                                strokeWidth = 1f
                            )
                        }
                        val gy = originY - i * scale
                        if (gy in 0f..h) {
                            drawLine(
                                color = Color(0xFF1E293B),
                                start = Offset(0f, gy),
                                end = Offset(w, gy),
                                strokeWidth = 1f
                            )
                        }
                    }

                    // Sumbu X dan Sumbu Y Utama
                    drawLine(
                        color = Color(0xFF64748B),
                        start = Offset(0f, originY),
                        end = Offset(w, originY),
                        strokeWidth = 2f
                    )
                    drawLine(
                        color = Color(0xFF64748B),
                        start = Offset(originX, 0f),
                        end = Offset(originX, h),
                        strokeWidth = 2f
                    )

                    // Menggambar Luas Arsiran Integral Tentu [xStart, xEnd]
                    val integralPath = Path()
                    val startX = (xStart.coerceAtMost(xEnd))
                    val endX = (xStart.coerceAtLeast(xEnd))
                    var isFirstInt = true

                    var curX = startX
                    while (curX <= endX) {
                        val mathY = a * curX * curX + b * curX + c
                        val px = originX + curX * scale
                        val py = originY - mathY * scale
                        if (isFirstInt) {
                            integralPath.moveTo(originX + startX * scale, originY)
                            integralPath.lineTo(px, py)
                            isFirstInt = false
                        } else {
                            integralPath.lineTo(px, py)
                        }
                        curX += 0.1f
                    }
                    integralPath.lineTo(originX + endX * scale, originY)
                    integralPath.close()

                    drawPath(
                        path = integralPath,
                        color = CosmicAmberAccent.copy(alpha = 0.28f)
                    )

                    // Menggambar Kurva Fungsi f(x)
                    val curvePath = Path()
                    var firstCurve = true
                    var plotX = -7f
                    while (plotX <= 7f) {
                        val mathY = a * plotX * plotX + b * plotX + c
                        val px = originX + plotX * scale
                        val py = originY - mathY * scale
                        if (firstCurve) {
                            curvePath.moveTo(px, py)
                            firstCurve = false
                        } else {
                            curvePath.lineTo(px, py)
                        }
                        plotX += 0.15f
                    }

                    drawPath(
                        path = curvePath,
                        color = MathPurple,
                        style = Stroke(width = 3.5f, cap = StrokeCap.Round)
                    )

                    // Menggambar Titik Evaluasi (x0, f(x0))
                    val pX0 = originX + x0 * scale
                    val pY0 = originY - fx0 * scale
                    drawCircle(
                        color = CosmicCyanLight,
                        center = Offset(pX0, pY0),
                        radius = 5.5f
                    )

                    // Menggambar Garis Singgung Turunan f'(x0) di Titik (x0, f(x0))
                    // y - y0 = m * (x - x0) => y = m * (x - x0) + y0
                    val deltaX = 2.5f
                    val tangentStartX = x0 - deltaX
                    val tangentEndX = x0 + deltaX
                    val tangentStartY = fx0 + derivative * (-deltaX)
                    val tangentEndY = fx0 + derivative * deltaX

                    drawLine(
                        color = CosmicCyanLight,
                        start = Offset(originX + tangentStartX * scale, originY - tangentStartY * scale),
                        end = Offset(originX + tangentEndX * scale, originY - tangentEndY * scale),
                        strokeWidth = 2.5f
                    )
                }

                // Overlay Info Nilai
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Titik: (${ "%.1f".format(x0) }, ${ "%.1f".format(fx0) })",
                        color = Color.White,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "Gradien Singgung (m): ${ "%.2f".format(derivative) }",
                        color = CosmicCyanLight,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Luas Integral [${ "%.1f".format(xStart) }, ${ "%.1f".format(xEnd) }]: ${ "%.2f".format(definiteIntegral) }",
                        color = CosmicAmberAccent,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Slider Titik Evaluasi x0
            Text(
                text = "Geser Titik Singgung (x₀): ${"%.1f".format(x0)}",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = x0,
                onValueChange = { x0 = it },
                valueRange = -3.5f..3.5f,
                colors = SliderDefaults.colors(
                    thumbColor = CosmicCyanLight,
                    activeTrackColor = CosmicCyanLight
                )
            )

            // Slider Koefisien Kurva a
            Text(
                text = "Kelengkungan Kurva (a): ${"%.2f".format(a)}",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = a,
                onValueChange = { a = it },
                valueRange = -1.5f..1.5f,
                colors = SliderDefaults.colors(
                    thumbColor = MathPurple,
                    activeTrackColor = MathPurple
                )
            )

            // Slider Batas Integral [xStart, xEnd]
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Batas Awal Integral (x₁): ${"%.1f".format(xStart)}", fontSize = 11.sp)
                    Slider(
                        value = xStart,
                        onValueChange = { xStart = it },
                        valueRange = -3.5f..1.0f,
                        colors = SliderDefaults.colors(thumbColor = CosmicAmberAccent)
                    )
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text("Batas Akhir Integral (x₂): ${"%.1f".format(xEnd)}", fontSize = 11.sp)
                    Slider(
                        value = xEnd,
                        onValueChange = { xEnd = it },
                        valueRange = 0.0f..3.5f,
                        colors = SliderDefaults.colors(thumbColor = CosmicAmberAccent)
                    )
                }
            }
        }
    }
}

// ==============================================================
// 2. VECTOR & MATRIX 2D TRANSFORMATION SIMULATION
// ==============================================================

@Composable
fun VectorMatrixSimulation(
    modifier: Modifier = Modifier
) {
    // Matriks Transformasi M = [ [m00, m01], [m10, m11] ]
    var m00 by remember { mutableFloatStateOf(1.0f) }
    var m01 by remember { mutableFloatStateOf(0.0f) }
    var m10 by remember { mutableFloatStateOf(0.0f) }
    var m11 by remember { mutableFloatStateOf(1.0f) }

    // Determinan matriks det(M) = m00*m11 - m01*m10
    val determinant = m00 * m11 - m01 * m10

    // Vektor Basis yang ditransformasikan
    // i_hat = (1, 0) -> T(i_hat) = (m00, m10)
    // j_hat = (0, 1) -> T(j_hat) = (m01, m11)
    val iTransformedX = m00
    val iTransformedY = m10
    val jTransformedX = m01
    val jTransformedY = m11

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
                        text = "📐 Simulasi Vektor & Transformasi Matriks 2D",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "M = [[${"%.1f".format(m00)}, ${"%.1f".format(m01)}], [${"%.1f".format(m10)}, ${"%.1f".format(m11)}]]",
                        fontSize = 12.sp,
                        color = CosmicIndigoPrimary,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold
                    )
                }
                Surface(
                    color = CosmicIndigoPrimary.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "det(M) = ${"%.2f".format(determinant)}",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = CosmicIndigoPrimary,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Canvas Transformasi Ruang 2D
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color(0xFF090D16), RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0xFF1E293B), RoundedCornerShape(12.dp))
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val originX = w / 2f
                    val originY = h / 2f
                    val scale = 38f // piksel per unit matematis

                    // Gambar Grid Terdeformasi berdasarkan Matriks Transformasi
                    for (u in -4..4) {
                        // Garis grid sejajar dengan vektor basis j (u konstan)
                        val startP = Offset(
                            originX + (u * m00 - 4f * m01) * scale,
                            originY - (u * m10 - 4f * m11) * scale
                        )
                        val endP = Offset(
                            originX + (u * m00 + 4f * m01) * scale,
                            originY - (u * m10 + 4f * m11) * scale
                        )
                        drawLine(
                            color = Color(0xFF1E293B),
                            start = startP,
                            end = endP,
                            strokeWidth = 1f
                        )

                        // Garis grid sejajar dengan vektor basis i (v konstan)
                        val startH = Offset(
                            originX + (-4f * m00 + u * m01) * scale,
                            originY - (-4f * m10 + u * m11) * scale
                        )
                        val endH = Offset(
                            originX + (4f * m00 + u * m01) * scale,
                            originY - (4f * m10 + u * m11) * scale
                        )
                        drawLine(
                            color = Color(0xFF1E293B),
                            start = startH,
                            end = endH,
                            strokeWidth = 1f
                        )
                    }

                    // Sumbu Asli Transparan (Referensi)
                    drawLine(
                        color = Color(0xFF334155),
                        start = Offset(0f, originY),
                        end = Offset(w, originY),
                        strokeWidth = 1.5f
                    )
                    drawLine(
                        color = Color(0xFF334155),
                        start = Offset(originX, 0f),
                        end = Offset(originX, h),
                        strokeWidth = 1.5f
                    )

                    // Area Parallelogram Satuan Basis yang Ditransformasikan (Skala Luas Determinan)
                    val polyPath = Path().apply {
                        moveTo(originX, originY)
                        lineTo(originX + iTransformedX * scale, originY - iTransformedY * scale)
                        lineTo(
                            originX + (iTransformedX + jTransformedX) * scale,
                            originY - (iTransformedY + jTransformedY) * scale
                        )
                        lineTo(originX + jTransformedX * scale, originY - jTransformedY * scale)
                        close()
                    }
                    drawPath(
                        path = polyPath,
                        color = CosmicIndigoPrimary.copy(alpha = 0.35f)
                    )

                    // Gambar Vektor Basis i-hat (Merah / Rose Alert)
                    val iEndX = originX + iTransformedX * scale
                    val iEndY = originY - iTransformedY * scale
                    drawLine(
                        color = CosmicRoseAlert,
                        start = Offset(originX, originY),
                        end = Offset(iEndX, iEndY),
                        strokeWidth = 4f,
                        cap = StrokeCap.Round
                    )
                    drawCircle(color = CosmicRoseAlert, center = Offset(iEndX, iEndY), radius = 5f)

                    // Gambar Vektor Basis j-hat (Hijau / Emerald Success)
                    val jEndX = originX + jTransformedX * scale
                    val jEndY = originY - jTransformedY * scale
                    drawLine(
                        color = CosmicEmeraldSuccess,
                        start = Offset(originX, originY),
                        end = Offset(jEndX, jEndY),
                        strokeWidth = 4f,
                        cap = StrokeCap.Round
                    )
                    drawCircle(color = CosmicEmeraldSuccess, center = Offset(jEndX, jEndY), radius = 5f)
                }

                // Overlay Info Vektor
                Column(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "T(î) = (${"%.2f".format(iTransformedX)}, ${"%.2f".format(iTransformedY)})",
                        color = CosmicRoseAlert,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "T(ĵ) = (${"%.2f".format(jTransformedX)}, ${"%.2f".format(jTransformedY)})",
                        color = CosmicEmeraldSuccess,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Preset Tombol Transformasi Cepat
            Text(
                text = "Preset Transformasi Linear Geometris:",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                listOf(
                    Triple("Identitas", 1.0f, 1.0f),
                    Triple("Rotasi 45°", (cos(PI / 4)).toFloat(), (sin(PI / 4)).toFloat()),
                    Triple("Skala 1.5x", 1.5f, 1.5f),
                    Triple("Geser (Shear)", 1.0f, 1.0f)
                ).forEach { (label, valA, valB) ->
                    FilterChip(
                        selected = when (label) {
                            "Identitas" -> m00 == 1f && m01 == 0f && m10 == 0f && m11 == 1f
                            "Skala 1.5x" -> m00 == 1.5f && m01 == 0f && m10 == 0f && m11 == 1.5f
                            "Geser (Shear)" -> m00 == 1f && m01 == 1f && m10 == 0f && m11 == 1f
                            else -> false
                        },
                        onClick = {
                            when (label) {
                                "Identitas" -> {
                                    m00 = 1f; m01 = 0f; m10 = 0f; m11 = 1f
                                }
                                "Rotasi 45°" -> {
                                    val r = (PI / 4).toFloat()
                                    m00 = cos(r); m01 = -sin(r); m10 = sin(r); m11 = cos(r)
                                }
                                "Skala 1.5x" -> {
                                    m00 = 1.5f; m01 = 0f; m10 = 0f; m11 = 1.5f
                                }
                                "Geser (Shear)" -> {
                                    m00 = 1.0f; m01 = 1.0f; m10 = 0.0f; m11 = 1.0f
                                }
                            }
                        },
                        label = { Text(label, fontSize = 11.sp) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = CosmicIndigoPrimary,
                            selectedLabelColor = Color.White
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Slider Kontrol Manual Elemen Matriks
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("M[0,0] (Skala X): ${"%.2f".format(m00)}", fontSize = 11.sp)
                    Slider(
                        value = m00,
                        onValueChange = { m00 = it },
                        valueRange = -2.0f..2.0f,
                        colors = SliderDefaults.colors(thumbColor = CosmicIndigoPrimary)
                    )
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text("M[0,1] (Shear X): ${"%.2f".format(m01)}", fontSize = 11.sp)
                    Slider(
                        value = m01,
                        onValueChange = { m01 = it },
                        valueRange = -2.0f..2.0f,
                        colors = SliderDefaults.colors(thumbColor = CosmicIndigoPrimary)
                    )
                }
            }
        }
    }
}

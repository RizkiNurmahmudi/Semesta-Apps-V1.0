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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Science
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
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
import com.example.data.model.Domain
import com.example.data.model.FormulaCard
import com.example.ui.theme.CosmicAmberAccent
import com.example.ui.theme.CosmicCyanLight
import com.example.ui.theme.CosmicCyanSecondary
import com.example.ui.theme.CosmicEmeraldSuccess
import com.example.ui.theme.CosmicIndigoPrimary
import com.example.ui.theme.CosmicRoseAlert
import com.example.ui.theme.MathPurple
import com.example.ui.theme.PhysicsBlue
import com.example.util.feedback.LocalSemestaFeedback
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sin

/**
 * Universal Interactive Formula Sandbox:
 * Menyediakan laboratorium interaktif berbasis parameter untuk seluruh konsep kurikulum
 * yang memetakan variabel dari FormulaCard menjadi slider dinamis dan visualisasi respon real-time.
 */
@Composable
fun UniversalFormulaSandbox(
    conceptTitle: String,
    domain: Domain,
    formulas: List<FormulaCard>,
    modifier: Modifier = Modifier
) {
    val primaryFormula = formulas.firstOrNull() ?: FormulaCard(
        symbol = "Ψ",
        equation = "y = f(x)",
        meaning = "Fungsi Respon Sistem Sains",
        units = "SI Terpadu",
        applicationNote = "Model dinamis interdisipliner"
    )

    // Slider kontrol variabel dinamis
    var paramScaleX by remember { mutableFloatStateOf(1.0f) } // Variabel bebas 1 (faktor 0.2x .. 3.0x)
    var paramScaleZ by remember { mutableFloatStateOf(1.0f) } // Variabel bebas 2 (faktor 0.2x .. 3.0x)

    // Menentukan jenis hubungan fisis matematis berdasarkan persamaan
    val isInverse = primaryFormula.equation.contains("/")
    val isQuadratic = primaryFormula.equation.contains("^2") || primaryFormula.equation.contains("²")

    // Nilai respon fisis
    val responseFactor = when {
        isInverse && isQuadratic -> (paramScaleX * paramScaleX) / (paramScaleZ * paramScaleZ).coerceAtLeast(0.1f)
        isInverse -> paramScaleX / paramScaleZ.coerceAtLeast(0.1f)
        isQuadratic -> paramScaleX * paramScaleX * paramScaleZ
        else -> paramScaleX * paramScaleZ
    }

    // Warna aksen domain
    val domainAccentColor = when (domain) {
        Domain.FISIKA -> PhysicsBlue
        Domain.MATEMATIKA -> MathPurple
        Domain.KIMIA -> CosmicCyanSecondary
        Domain.BIOLOGI -> CosmicEmeraldSuccess
    }

    val feedback = LocalSemestaFeedback.current
    var lastHapticX by remember { mutableFloatStateOf(paramScaleX) }
    var lastHapticZ by remember { mutableFloatStateOf(paramScaleZ) }

    // Animasi fase waktu untuk dinamika osilasi / partikel
    var animationPhase by remember { mutableFloatStateOf(0f) }
    LaunchedEffect(Unit) {
        val startTime = System.nanoTime()
        while (true) {
            withFrameNanos { now ->
                val elapsed = (now - startTime) / 1_000_000_000f
                animationPhase = (elapsed * (1.5f + responseFactor * 0.8f)) % (2f * PI.toFloat())
            }
        }
    }

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Header Lab Interaktif
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "🔬 Lab Dinamika Respon Rumus Interaktif",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "$conceptTitle • ${domain.name}",
                        fontSize = 11.sp,
                        color = domainAccentColor,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Surface(
                    color = domainAccentColor.copy(alpha = 0.15f),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "Respon: ${"%.2f".format(responseFactor)}x",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = domainAccentColor,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Kotak Persamaan Rumus Formal
            Surface(
                color = Color(0xFF0B0F19),
                shape = RoundedCornerShape(10.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, domainAccentColor.copy(alpha = 0.35f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = primaryFormula.equation,
                        fontFamily = FontFamily.Monospace,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = CosmicCyanLight
                    )
                    Text(
                        text = "Satuan: ${primaryFormula.units}",
                        fontSize = 10.sp,
                        color = Color(0xFF94A3B8)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Canvas Visualisasi Respon Sistem Sains
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
                    val centerY = h / 2f
                    val centerX = w * 0.3f

                    // 1. Indikator Gauge Melengkung / Meteran Respon Digital
                    val gaugeRadius = 55f
                    drawArc(
                        color = Color(0xFF1F2937),
                        startAngle = 135f,
                        sweepAngle = 270f,
                        useCenter = false,
                        topLeft = Offset(centerX - gaugeRadius, centerY - gaugeRadius),
                        size = Size(gaugeRadius * 2, gaugeRadius * 2),
                        style = Stroke(width = 8f, cap = StrokeCap.Round)
                    )

                    val sweepAngle = (responseFactor / 4.0f).coerceIn(0.05f, 1.0f) * 270f
                    drawArc(
                        brush = Brush.sweepGradient(
                            colors = listOf(domainAccentColor, CosmicAmberAccent)
                        ),
                        startAngle = 135f,
                        sweepAngle = sweepAngle,
                        useCenter = false,
                        topLeft = Offset(centerX - gaugeRadius, centerY - gaugeRadius),
                        size = Size(gaugeRadius * 2, gaugeRadius * 2),
                        style = Stroke(width = 8f, cap = StrokeCap.Round)
                    )

                    // Nilai di tengah gauge
                    drawCircle(
                        color = Color(0xFF111827),
                        center = Offset(centerX, centerY),
                        radius = gaugeRadius - 10f
                    )

                    // 2. Kurva Respon Kontinu di Sisi Kanan
                    val plotStartX = w * 0.55f
                    val plotEndX = w - 20f
                    val plotW = plotEndX - plotStartX

                    // Grid Plot Sumbu
                    drawLine(
                        color = Color(0xFF1F2937),
                        start = Offset(plotStartX, centerY),
                        end = Offset(plotEndX, centerY),
                        strokeWidth = 1.5f
                    )
                    drawLine(
                        color = Color(0xFF1F2937),
                        start = Offset(plotStartX, 20f),
                        end = Offset(plotStartX, h - 20f),
                        strokeWidth = 1.5f
                    )

                    // Gelombang / Kurva Respon Real-time
                    val wavePath = Path()
                    var isFirst = true
                    var plotStepX = plotStartX
                    while (plotStepX <= plotEndX) {
                        val normX = (plotStepX - plotStartX) / plotW
                        val amp = (responseFactor * 12f).coerceIn(4f, 45f)
                        val freq = (paramScaleX * 3f).coerceIn(1f, 8f)
                        val pY = centerY - amp * sin(normX * freq * 2f * PI.toFloat() - animationPhase)

                        if (isFirst) {
                            wavePath.moveTo(plotStepX, pY)
                            isFirst = false
                        } else {
                            wavePath.lineTo(plotStepX, pY)
                        }
                        plotStepX += 3f
                    }

                    drawPath(
                        path = wavePath,
                        color = domainAccentColor,
                        style = Stroke(width = 3f, cap = StrokeCap.Round)
                    )

                    // Partikel operasi dinamis
                    val operatingX = plotStartX + (paramScaleX / 3.0f) * plotW
                    val opAmp = (responseFactor * 12f).coerceIn(4f, 45f)
                    val operatingY = centerY - opAmp * sin(((operatingX - plotStartX) / plotW) * (paramScaleX * 3f) * 2f * PI.toFloat() - animationPhase)
                    drawCircle(
                        color = CosmicAmberAccent,
                        center = Offset(operatingX, operatingY),
                        radius = 5.5f
                    )
                }

                // Overlay Info Meteran
                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Variabel Bebas (X₁): ${"%.2f".format(paramScaleX)}x",
                        color = Color.White,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = "Variabel Lingkungan (X₂): ${"%.2f".format(paramScaleZ)}x",
                        color = CosmicCyanLight,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Slider Parameter Input 1
            Text(
                text = "Parameter Variabel Primer (Skala): ${"%.2f".format(paramScaleX)}x",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = paramScaleX,
                onValueChange = {
                    paramScaleX = it
                    if (abs(it - lastHapticX) >= 0.15f) {
                        feedback.playSliderTick()
                        lastHapticX = it
                    }
                },
                valueRange = 0.2f..3.0f,
                colors = SliderDefaults.colors(
                    thumbColor = domainAccentColor,
                    activeTrackColor = domainAccentColor
                )
            )

            // Slider Parameter Input 2
            Text(
                text = "Parameter Variabel Sekunder (Kondisi Sistem): ${"%.2f".format(paramScaleZ)}x",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold
            )
            Slider(
                value = paramScaleZ,
                onValueChange = {
                    paramScaleZ = it
                    if (abs(it - lastHapticZ) >= 0.15f) {
                        feedback.playSliderTick()
                        lastHapticZ = it
                    }
                },
                valueRange = 0.2f..3.0f,
                colors = SliderDefaults.colors(
                    thumbColor = CosmicAmberAccent,
                    activeTrackColor = CosmicAmberAccent
                )
            )

            Spacer(modifier = Modifier.height(6.dp))

            // Catatan Pedagogis Perilaku Rumus
            Surface(
                color = domainAccentColor.copy(alpha = 0.08f),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "💡 Perilaku Fisis: " + if (isInverse) {
                        "Ketika parameter sekunder diperbesar, nilai keluaran sistem mengecil secara terbalik (invers)."
                    } else if (isQuadratic) {
                        "Penggandaan variabel primer menghasilkan lonjakan respon kuadratik (eksponensial non-linear)."
                    } else {
                        "Respon sistem bertumbuh secara proporsional linier terhadap perubahan variabel masukan."
                    },
                    fontSize = 11.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }
}

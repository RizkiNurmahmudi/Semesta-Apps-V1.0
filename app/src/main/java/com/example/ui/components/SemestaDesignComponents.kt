package com.example.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.SemestaAmber
import com.example.ui.theme.SemestaAmberDark
import com.example.ui.theme.SemestaBabyBlue
import com.example.ui.theme.SemestaDeepBlue
import com.example.ui.theme.SemestaGreen
import com.example.ui.theme.SemestaRose
import com.example.ui.theme.SemestaSoftCyan

// ---------------------------------------------------------------------------
// 1. SEMESTA ATOM LOGO (TRANSLASI VEKTOR RESMI DESAIN GITHUB)
// ---------------------------------------------------------------------------
@Composable
fun SemestaAtomLogo(
    modifier: Modifier = Modifier,
    size: Dp = 96.dp
) {
    Canvas(modifier = modifier.size(size)) {
        val w = this.size.width
        val h = this.size.height
        val scale = w / 120f

        // Base rounded rect (x:6, y:6, w:108, h:108, rx:32)
        drawRoundRect(
            color = SemestaDeepBlue,
            topLeft = Offset(6f * scale, 6f * scale),
            size = Size(108f * scale, 108f * scale),
            cornerRadius = CornerRadius(32f * scale, 32f * scale)
        )

        // Inner border stroke (x:10, y:10, w:100, h:100, rx:28, stroke:2)
        drawRoundRect(
            color = SemestaBabyBlue.copy(alpha = 0.35f),
            topLeft = Offset(10f * scale, 10f * scale),
            size = Size(100f * scale, 100f * scale),
            cornerRadius = CornerRadius(28f * scale, 28f * scale),
            style = Stroke(width = 2f * scale)
        )

        // Decorative glow circle (cx:60, cy:60, r:36)
        drawCircle(
            color = SemestaBabyBlue.copy(alpha = 0.15f),
            radius = 36f * scale,
            center = Offset(60f * scale, 60f * scale)
        )

        // Orbit 1: Tilted -32 deg
        rotate(degrees = -32f, pivot = Offset(60f * scale, 60f * scale)) {
            // Ellipse (cx:60, cy:60, rx:42, ry:17)
            drawOval(
                color = SemestaBabyBlue,
                topLeft = Offset((60f - 42f) * scale, (60f - 17f) * scale),
                size = Size(84f * scale, 34f * scale),
                style = Stroke(width = 4f * scale, cap = StrokeCap.Round)
            )
            // Amber electron at right (cx:102, cy:60, r:6.5)
            drawCircle(
                color = SemestaAmber,
                radius = 6.5f * scale,
                center = Offset(102f * scale, 60f * scale)
            )
            drawCircle(
                color = SemestaDeepBlue,
                radius = 6.5f * scale,
                center = Offset(102f * scale, 60f * scale),
                style = Stroke(width = 2f * scale)
            )
        }

        // Orbit 2: Tilted +32 deg
        rotate(degrees = 32f, pivot = Offset(60f * scale, 60f * scale)) {
            drawOval(
                color = SemestaBabyBlue,
                topLeft = Offset((60f - 42f) * scale, (60f - 17f) * scale),
                size = Size(84f * scale, 34f * scale),
                style = Stroke(width = 4f * scale, cap = StrokeCap.Round)
            )
            // White electron at left (cx:18, cy:60, r:6)
            drawCircle(
                color = Color.White,
                radius = 6f * scale,
                center = Offset(18f * scale, 60f * scale)
            )
            drawCircle(
                color = SemestaBabyBlue,
                radius = 6f * scale,
                center = Offset(18f * scale, 60f * scale),
                style = Stroke(width = 2.5f * scale)
            )
        }

        // Central Nucleus in Warm Amber (cx:60, cy:60, r:12)
        drawCircle(
            color = SemestaAmber,
            radius = 12f * scale,
            center = Offset(60f * scale, 60f * scale)
        )
        // Highlight speck (cx:56, cy:56, r:4)
        drawCircle(
            color = Color(0xFFFFFBEB).copy(alpha = 0.85f),
            radius = 4f * scale,
            center = Offset(56f * scale, 56f * scale)
        )

        // Sparkle accents
        drawCircle(color = SemestaAmber, radius = 3f * scale, center = Offset(28f * scale, 28f * scale))
        drawCircle(color = SemestaBabyBlue, radius = 2.5f * scale, center = Offset(92f * scale, 30f * scale))
        drawCircle(color = SemestaAmber, radius = 3f * scale, center = Offset(88f * scale, 92f * scale))
    }
}

// ---------------------------------------------------------------------------
// 2. PROFILE AVATAR (KIRANA, DIMAS, RATNA, ARYA) DARI DESAIN GITHUB
// ---------------------------------------------------------------------------
@Composable
fun ProfileAvatar(
    avatarKey: String,
    modifier: Modifier = Modifier,
    size: Dp = 48.dp
) {
    Canvas(modifier = modifier.size(size)) {
        val s = this.size.width / 80f

        when (avatarKey.lowercase()) {
            "kirana" -> drawKiranaAvatar(s)
            "dimas" -> drawDimasAvatar(s)
            "ratna" -> drawRatnaAvatar(s)
            "arya" -> drawAryaAvatar(s)
            else -> drawDefaultExplorerAvatar(s)
        }
    }
}

private fun DrawScope.drawKiranaAvatar(s: Float) {
    // Background circle
    drawCircle(color = Color(0xFFE1F4FD), radius = 38f * s, center = Offset(40f * s, 40f * s))
    drawCircle(color = SemestaBabyBlue, radius = 38f * s, center = Offset(40f * s, 40f * s), style = Stroke(2.5f * s))

    // Pigtails
    drawCircle(color = Color(0xFF1E293B), radius = 10f * s, center = Offset(17f * s, 42f * s))
    drawCircle(color = Color(0xFF1E293B), radius = 10f * s, center = Offset(63f * s, 42f * s))

    // Hair back
    drawCircle(color = Color(0xFF1E293B), radius = 21f * s, center = Offset(40f * s, 36f * s))

    // Shoulders
    val shoulderPath = Path().apply {
        moveTo(20f * s, 72f * s)
        cubicTo(22f * s, 60f * s, 30f * s, 56f * s, 40f * s, 56f * s)
        cubicTo(50f * s, 56f * s, 58f * s, 60f * s, 60f * s, 72f * s)
        close()
    }
    drawPath(shoulderPath, color = SemestaDeepBlue)

    // Collar Amber
    val collarPath = Path().apply {
        moveTo(33f * s, 56f * s)
        lineTo(40f * s, 64f * s)
        lineTo(47f * s, 56f * s)
        close()
    }
    drawPath(collarPath, color = SemestaAmber)

    // Face
    drawCircle(color = Color(0xFFF6C89F), radius = 16f * s, center = Offset(40f * s, 40f * s))

    // Bangs
    val bangsPath = Path().apply {
        moveTo(23f * s, 36f * s)
        cubicTo(24f * s, 24f * s, 32f * s, 20f * s, 40f * s, 20f * s)
        cubicTo(48f * s, 20f * s, 56f * s, 24f * s, 57f * s, 36f * s)
        cubicTo(52f * s, 31f * s, 46f * s, 30f * s, 40f * s, 32f * s)
        cubicTo(34f * s, 30f * s, 28f * s, 31f * s, 23f * s, 36f * s)
        close()
    }
    drawPath(bangsPath, color = Color(0xFF1E293B))

    // Eyes
    drawCircle(color = Color(0xFF1E293B), radius = 2.3f * s, center = Offset(34f * s, 40f * s))
    drawCircle(color = Color(0xFF1E293B), radius = 2.3f * s, center = Offset(46f * s, 40f * s))

    // Cheeks
    drawCircle(color = Color(0xFFF43F5E).copy(alpha = 0.3f), radius = 3f * s, center = Offset(31f * s, 44f * s))
    drawCircle(color = Color(0xFFF43F5E).copy(alpha = 0.3f), radius = 3f * s, center = Offset(49f * s, 44f * s))

    // Smile
    val smilePath = Path().apply {
        moveTo(35f * s, 46f * s)
        cubicTo(36.8f * s, 48.5f * s, 43.2f * s, 48.5f * s, 45f * s, 46f * s)
    }
    drawPath(smilePath, color = Color(0xFF1E293B), style = Stroke(width = 2.2f * s, cap = StrokeCap.Round))

    // Star hairclip in Warm Amber
    drawCircle(color = SemestaAmber, radius = 4.5f * s, center = Offset(52f * s, 28f * s))
}

private fun DrawScope.drawDimasAvatar(s: Float) {
    // Dimas: Teen with glasses & hoodie
    drawCircle(color = Color(0xFFFEF3C7), radius = 38f * s, center = Offset(40f * s, 40f * s))
    drawCircle(color = SemestaAmber, radius = 38f * s, center = Offset(40f * s, 40f * s), style = Stroke(2.5f * s))

    // Hoodie
    val hoodiePath = Path().apply {
        moveTo(18f * s, 73f * s)
        cubicTo(20f * s, 60f * s, 28f * s, 56f * s, 40f * s, 56f * s)
        cubicTo(52f * s, 56f * s, 60f * s, 60f * s, 62f * s, 73f * s)
        close()
    }
    drawPath(hoodiePath, color = SemestaDeepBlue)

    val innerHoodie = Path().apply {
        moveTo(31f * s, 56f * s)
        lineTo(49f * s, 56f * s)
        lineTo(45f * s, 67f * s)
        lineTo(35f * s, 67f * s)
        close()
    }
    drawPath(innerHoodie, color = SemestaBabyBlue)

    // Face
    drawCircle(color = Color(0xFFF2BE91), radius = 16f * s, center = Offset(40f * s, 40f * s))

    // Wavy hair
    val hairPath = Path().apply {
        moveTo(23f * s, 35f * s)
        cubicTo(22f * s, 23f * s, 30f * s, 17f * s, 41f * s, 18f * s)
        cubicTo(51f * s, 18f * s, 58f * s, 24f * s, 57f * s, 35f * s)
        cubicTo(54f * s, 29f * s, 48f * s, 27f * s, 40f * s, 28f * s)
        cubicTo(33f * s, 27f * s, 26f * s, 30f * s, 23f * s, 35f * s)
        close()
    }
    drawPath(hairPath, color = Color(0xFF1E293B))

    // Glasses
    drawRoundRect(
        color = Color.White.copy(alpha = 0.5f),
        topLeft = Offset(28f * s, 36f * s),
        size = Size(10f * s, 8f * s),
        cornerRadius = CornerRadius(3f * s, 3f * s)
    )
    drawRoundRect(
        color = SemestaDeepBlue,
        topLeft = Offset(28f * s, 36f * s),
        size = Size(10f * s, 8f * s),
        cornerRadius = CornerRadius(3f * s, 3f * s),
        style = Stroke(2f * s)
    )
    drawRoundRect(
        color = Color.White.copy(alpha = 0.5f),
        topLeft = Offset(42f * s, 36f * s),
        size = Size(10f * s, 8f * s),
        cornerRadius = CornerRadius(3f * s, 3f * s)
    )
    drawRoundRect(
        color = SemestaDeepBlue,
        topLeft = Offset(42f * s, 36f * s),
        size = Size(10f * s, 8f * s),
        cornerRadius = CornerRadius(3f * s, 3f * s),
        style = Stroke(2f * s)
    )
    drawLine(color = SemestaDeepBlue, start = Offset(38f * s, 40f * s), end = Offset(42f * s, 40f * s), strokeWidth = 2f * s)

    // Eyes & Smile
    drawCircle(color = Color(0xFF1E293B), radius = 1.8f * s, center = Offset(33f * s, 40f * s))
    drawCircle(color = Color(0xFF1E293B), radius = 1.8f * s, center = Offset(47f * s, 40f * s))

    val dimasSmile = Path().apply {
        moveTo(35f * s, 47.5f * s)
        cubicTo(37f * s, 50f * s, 43f * s, 50f * s, 45f * s, 47.5f * s)
    }
    drawPath(dimasSmile, color = Color(0xFF1E293B), style = Stroke(width = 2.2f * s, cap = StrokeCap.Round))
}

private fun DrawScope.drawRatnaAvatar(s: Float) {
    // Bu Ratna: Warm mother with hijab motif
    drawCircle(color = Color(0xFFE0F2FE), radius = 38f * s, center = Offset(40f * s, 40f * s))
    drawCircle(color = SemestaBabyBlue, radius = 38f * s, center = Offset(40f * s, 40f * s), style = Stroke(2.5f * s))

    // Hijab
    val hijabPath = Path().apply {
        moveTo(17f * s, 72f * s)
        cubicTo(17f * s, 50f * s, 24f * s, 19f * s, 40f * s, 19f * s)
        cubicTo(56f * s, 19f * s, 63f * s, 50f * s, 63f * s, 72f * s)
        close()
    }
    drawPath(hijabPath, color = SemestaDeepBlue)

    val innerScarf = Path().apply {
        moveTo(22f * s, 68f * s)
        cubicTo(25f * s, 56f * s, 32f * s, 53f * s, 40f * s, 53f * s)
        cubicTo(48f * s, 53f * s, 55f * s, 56f * s, 58f * s, 68f * s)
        close()
    }
    drawPath(innerScarf, color = SemestaBabyBlue)

    // Face
    drawCircle(color = Color(0xFFF5C69C), radius = 14.5f * s, center = Offset(40f * s, 40f * s))

    // Amber inner trim
    val trimPath = Path().apply {
        moveTo(26f * s, 35f * s)
        cubicTo(29f * s, 27f * s, 34f * s, 25f * s, 40f * s, 25f * s)
        cubicTo(46f * s, 25f * s, 51f * s, 27f * s, 54f * s, 35f * s)
    }
    drawPath(trimPath, color = SemestaAmber, style = Stroke(width = 3f * s, cap = StrokeCap.Round))

    // Eyes & Smile
    drawCircle(color = Color(0xFF1E293B), radius = 2f * s, center = Offset(34.5f * s, 39.5f * s))
    drawCircle(color = Color(0xFF1E293B), radius = 2f * s, center = Offset(45.5f * s, 39.5f * s))

    val smilePath = Path().apply {
        moveTo(35f * s, 45.5f * s)
        cubicTo(37f * s, 48f * s, 43f * s, 48f * s, 45f * s, 45.5f * s)
    }
    drawPath(smilePath, color = Color(0xFF1E293B), style = Stroke(width = 2.2f * s, cap = StrokeCap.Round))

    // Brooch
    drawCircle(color = SemestaAmber, radius = 3.5f * s, center = Offset(40f * s, 58f * s))
}

private fun DrawScope.drawAryaAvatar(s: Float) {
    // Arya: Older brother with neat hair
    drawCircle(color = Color(0xFFE0E7FF), radius = 38f * s, center = Offset(40f * s, 40f * s))
    drawCircle(color = SemestaDeepBlue, radius = 38f * s, center = Offset(40f * s, 40f * s), style = Stroke(2.2f * s))

    // Jacket
    val jacketPath = Path().apply {
        moveTo(18f * s, 73f * s)
        cubicTo(20f * s, 59f * s, 29f * s, 55f * s, 40f * s, 55f * s)
        cubicTo(51f * s, 55f * s, 60f * s, 59f * s, 62f * s, 73f * s)
        close()
    }
    drawPath(jacketPath, color = Color(0xFF1E293B))

    val collarPath = Path().apply {
        moveTo(33f * s, 55f * s)
        lineTo(40f * s, 67f * s)
        lineTo(47f * s, 55f * s)
        close()
    }
    drawPath(collarPath, color = SemestaAmber)

    // Face
    drawCircle(color = Color(0xFFF0BE95), radius = 15.5f * s, center = Offset(40f * s, 39f * s))

    // Hair
    val hairPath = Path().apply {
        moveTo(24f * s, 34f * s)
        cubicTo(24f * s, 22f * s, 31f * s, 17f * s, 40f * s, 17f * s)
        cubicTo(50f * s, 17f * s, 56f * s, 22f * s, 56f * s, 34f * s)
        cubicTo(52f * s, 28f * s, 45f * s, 26f * s, 40f * s, 26f * s)
        cubicTo(33f * s, 26f * s, 28f * s, 29f * s, 24f * s, 34f * s)
        close()
    }
    drawPath(hairPath, color = Color(0xFF1E293B))

    // Eyebrows & Eyes
    drawLine(color = Color(0xFF1E293B), start = Offset(31f * s, 35f * s), end = Offset(37f * s, 35f * s), strokeWidth = 2f * s, cap = StrokeCap.Round)
    drawLine(color = Color(0xFF1E293B), start = Offset(43f * s, 35f * s), end = Offset(49f * s, 35f * s), strokeWidth = 2f * s, cap = StrokeCap.Round)
    drawCircle(color = Color(0xFF1E293B), radius = 2f * s, center = Offset(34f * s, 39.5f * s))
    drawCircle(color = Color(0xFF1E293B), radius = 2f * s, center = Offset(46f * s, 39.5f * s))

    val smilePath = Path().apply {
        moveTo(35.5f * s, 46f * s)
        cubicTo(37.5f * s, 48f * s, 42.5f * s, 48f * s, 44.5f * s, 46f * s)
    }
    drawPath(smilePath, color = Color(0xFF1E293B), style = Stroke(width = 2.2f * s, cap = StrokeCap.Round))
}

private fun DrawScope.drawDefaultExplorerAvatar(s: Float) {
    drawCircle(color = Color(0xFFE1F4FD), radius = 38f * s, center = Offset(40f * s, 40f * s))
    drawCircle(color = SemestaDeepBlue, radius = 38f * s, center = Offset(40f * s, 40f * s), style = Stroke(2.5f * s))
    drawCircle(color = SemestaDeepBlue, radius = 12f * s, center = Offset(40f * s, 34f * s))

    val bodyPath = Path().apply {
        moveTo(22f * s, 66f * s)
        cubicTo(24f * s, 54f * s, 31f * s, 50f * s, 40f * s, 50f * s)
        cubicTo(49f * s, 50f * s, 56f * s, 54f * s, 58f * s, 66f * s)
        close()
    }
    drawPath(bodyPath, color = SemestaBabyBlue)
    drawCircle(color = SemestaAmber, radius = 5f * s, center = Offset(54f * s, 24f * s))
}

// ---------------------------------------------------------------------------
// 3. PROGRESS RING (CIRCULAR PROGRESS PERCENTAGE)
// ---------------------------------------------------------------------------
@Composable
fun ProgressRing(
    percent: Int,
    modifier: Modifier = Modifier,
    size: Dp = 38.dp,
    strokeWidth: Dp = 3.5.dp
) {
    val strokeColor = when {
        percent >= 100 -> SemestaGreen
        percent >= 50 -> SemestaDeepBlue
        percent > 0 -> SemestaAmber
        else -> Color(0xFFCBD5E1)
    }

    Box(
        modifier = modifier.size(size),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.size(size)) {
            val sw = strokeWidth.toPx()
            val radius = (this.size.width - sw) / 2f

            // Background circle track
            drawCircle(
                color = Color(0xFFE2E8F0),
                radius = radius,
                style = Stroke(width = sw)
            )

            // Foreground progress arc (start from -90 deg / top)
            if (percent > 0) {
                drawArc(
                    color = strokeColor,
                    startAngle = -90f,
                    sweepAngle = (percent.coerceIn(0, 100) / 100f) * 360f,
                    useCenter = false,
                    style = Stroke(width = sw, cap = StrokeCap.Round)
                )
            }
        }

        Text(
            text = "$percent%",
            fontSize = 9.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF1E293B)
        )
    }
}

// ---------------------------------------------------------------------------
// 4. CONCEPT VECTOR ICON (PARABOLA, MOMENTUM, PERSEN, NEWTON, DLL)
// ---------------------------------------------------------------------------
@Composable
fun ConceptVectorIcon(
    iconKey: String,
    modifier: Modifier = Modifier,
    size: Dp = 44.dp
) {
    Canvas(modifier = modifier.size(size)) {
        val s = this.size.width / 48f

        when (iconKey.lowercase()) {
            "parabola" -> {
                drawRoundRect(
                    color = Color(0xFFE1F4FD),
                    size = Size(48f * s, 48f * s),
                    cornerRadius = CornerRadius(14f * s, 14f * s)
                )
                val arcPath = Path().apply {
                    moveTo(8f * s, 36f * s)
                    cubicTo(16f * s, 12f * s, 30f * s, 12f * s, 40f * s, 36f * s)
                }
                drawPath(arcPath, color = SemestaDeepBlue, style = Stroke(width = 3f * s, cap = StrokeCap.Round))
                drawCircle(color = SemestaAmber, radius = 5.5f * s, center = Offset(24f * s, 18f * s))
                drawCircle(color = SemestaDeepBlue, radius = 5.5f * s, center = Offset(24f * s, 18f * s), style = Stroke(2f * s))
                drawCircle(color = SemestaGreen, radius = 3.5f * s, center = Offset(39f * s, 36f * s))
            }
            "momentum" -> {
                drawRoundRect(
                    color = Color(0xFFFEF3C7),
                    size = Size(48f * s, 48f * s),
                    cornerRadius = CornerRadius(14f * s, 14f * s)
                )
                drawCircle(color = SemestaDeepBlue, radius = 7f * s, center = Offset(17f * s, 24f * s))
                drawCircle(color = SemestaAmber, radius = 7f * s, center = Offset(31f * s, 24f * s))
                drawCircle(color = SemestaDeepBlue, radius = 7f * s, center = Offset(31f * s, 24f * s), style = Stroke(2f * s))
                drawLine(color = SemestaAmberDark, start = Offset(24f * s, 14f * s), end = Offset(26f * s, 19f * s), strokeWidth = 2.5f * s, cap = StrokeCap.Round)
                drawLine(color = SemestaAmberDark, start = Offset(24f * s, 34f * s), end = Offset(26f * s, 29f * s), strokeWidth = 2.5f * s, cap = StrokeCap.Round)
            }
            "persen" -> {
                drawRoundRect(
                    color = Color(0xFFFEF3C7),
                    size = Size(48f * s, 48f * s),
                    cornerRadius = CornerRadius(14f * s, 14f * s)
                )
                drawLine(color = SemestaDeepBlue, start = Offset(15f * s, 33f * s), end = Offset(33f * s, 15f * s), strokeWidth = 3.2f * s, cap = StrokeCap.Round)
                drawCircle(color = SemestaAmber, radius = 4.5f * s, center = Offset(17f * s, 17f * s))
                drawCircle(color = SemestaDeepBlue, radius = 4.5f * s, center = Offset(17f * s, 17f * s), style = Stroke(2f * s))
                drawCircle(color = SemestaBabyBlue, radius = 4.5f * s, center = Offset(31f * s, 31f * s))
                drawCircle(color = SemestaDeepBlue, radius = 4.5f * s, center = Offset(31f * s, 31f * s), style = Stroke(2f * s))
            }
            "newton" -> {
                drawRoundRect(
                    color = Color(0xFFDCFCE7),
                    size = Size(48f * s, 48f * s),
                    cornerRadius = CornerRadius(14f * s, 14f * s)
                )
                drawCircle(color = SemestaGreen, radius = 9f * s, center = Offset(24f * s, 27f * s))
                val stem = Path().apply {
                    moveTo(24f * s, 18f * s)
                    cubicTo(24f * s, 14f * s, 27f * s, 12f * s, 30f * s, 12f * s)
                }
                drawPath(stem, color = SemestaDeepBlue, style = Stroke(width = 2.5f * s, cap = StrokeCap.Round))
                drawLine(color = SemestaAmber, start = Offset(12f * s, 27f * s), end = Offset(20f * s, 27f * s), strokeWidth = 3f * s, cap = StrokeCap.Round)
            }
            "geometri" -> {
                drawRoundRect(
                    color = Color(0xFFE0F2FE),
                    size = Size(48f * s, 48f * s),
                    cornerRadius = CornerRadius(14f * s, 14f * s)
                )
                val poly = Path().apply {
                    moveTo(24f * s, 10f * s)
                    lineTo(37f * s, 34f * s)
                    lineTo(11f * s, 34f * s)
                    close()
                }
                drawPath(poly, color = SemestaBabyBlue)
                drawPath(poly, color = SemestaDeepBlue, style = Stroke(width = 2.5f * s, join = StrokeJoin.Round))
                drawCircle(color = SemestaAmber, radius = 4f * s, center = Offset(24f * s, 27f * s))
            }
            else -> { // "energi"
                drawRoundRect(
                    color = Color(0xFFE1F4FD),
                    size = Size(48f * s, 48f * s),
                    cornerRadius = CornerRadius(14f * s, 14f * s)
                )
                val lightning = Path().apply {
                    moveTo(26f * s, 10f * s)
                    lineTo(14f * s, 26f * s)
                    lineTo(24f * s, 26f * s)
                    lineTo(22f * s, 38f * s)
                    lineTo(34f * s, 22f * s)
                    lineTo(24f * s, 22f * s)
                    close()
                }
                drawPath(lightning, color = SemestaAmber)
                drawPath(lightning, color = SemestaDeepBlue, style = Stroke(width = 2.2f * s, join = StrokeJoin.Round))
            }
        }
    }
}

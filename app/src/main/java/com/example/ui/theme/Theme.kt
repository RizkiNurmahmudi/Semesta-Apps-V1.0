package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = CosmicCyanLight,
    onPrimary = Color(0xFF0F172A),
    primaryContainer = CosmicIndigoDark,
    onPrimaryContainer = Color(0xFFE0E7FF),
    secondary = CosmicCyanSecondary,
    onSecondary = Color(0xFF0F172A),
    secondaryContainer = Color(0xFF164E63),
    onSecondaryContainer = Color(0xFFCFFAFE),
    tertiary = CosmicAmberAccent,
    onTertiary = Color(0xFF0F172A),
    background = CosmicDarkBackground,
    onBackground = TextPrimaryDark,
    surface = CosmicDarkSurface,
    onSurface = TextPrimaryDark,
    surfaceVariant = CosmicDarkSurfaceVariant,
    onSurfaceVariant = TextSecondaryDark,
    outline = CosmicDarkBorder,
    error = CosmicRoseAlert
)

private val LightColorScheme = lightColorScheme(
    primary = CosmicIndigoPrimary,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFEEF2FF),
    onPrimaryContainer = Color(0xFF1E1B4B),
    secondary = CosmicCyanSecondary,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFE0F2FE),
    onSecondaryContainer = Color(0xFF0C4A6E),
    tertiary = CosmicAmberAccent,
    onTertiary = Color.White,
    background = CosmicLightBackground,
    onBackground = TextPrimaryLight,
    surface = CosmicLightSurface,
    onSurface = TextPrimaryLight,
    surfaceVariant = CosmicLightSurfaceVariant,
    onSurfaceVariant = TextSecondaryLight,
    outline = CosmicLightBorder,
    error = CosmicRoseAlert
)

@Composable
fun SemestaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Use our handcrafted cosmic theme for brand consistency
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Hub
import androidx.compose.material.icons.filled.Insights
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.components.CelebrationBadgeDialog
import com.example.ui.screens.CatalogScreen
import com.example.ui.screens.LessonScreen
import com.example.ui.screens.PlacementTestScreen
import com.example.ui.screens.ProfileScreen
import com.example.ui.screens.ProgressScreen
import com.example.ui.screens.SkillMapScreen
import com.example.ui.theme.CosmicIndigoPrimary
import com.example.ui.theme.SemestaTheme
import com.example.ui.viewmodel.ScreenDestination
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import com.example.ui.viewmodel.SemestaViewModel
import com.example.util.feedback.LocalSemestaFeedback
import com.example.util.feedback.SemestaFeedbackManager

class MainActivity : ComponentActivity() {
    private var feedbackManager: SemestaFeedbackManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val manager = SemestaFeedbackManager(this)
        feedbackManager = manager

        setContent {
            CompositionLocalProvider(LocalSemestaFeedback provides manager) {
                SemestaTheme {
                    val viewModel: SemestaViewModel = viewModel()
                    SemestaApp(viewModel = viewModel)
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        feedbackManager?.release()
    }
}

@Composable
fun SemestaApp(viewModel: SemestaViewModel) {
    val currentScreen by viewModel.currentScreen.collectAsState()
    val newlyUnlockedBadge by viewModel.newlyUnlockedBadge.collectAsState()
    val feedback = LocalSemestaFeedback.current

    LaunchedEffect(newlyUnlockedBadge) {
        if (newlyUnlockedBadge != null) {
            feedback.playBadgeFanfare()
        }
    }

    val showBottomBar = currentScreen is ScreenDestination.Catalog ||
            currentScreen is ScreenDestination.SkillMap ||
            currentScreen is ScreenDestination.Progress ||
            currentScreen is ScreenDestination.Profiles

    val navItemColors = NavigationBarItemDefaults.colors(
        selectedIconColor = com.example.ui.theme.SemestaDeepBlue,
        selectedTextColor = com.example.ui.theme.SemestaDeepBlue,
        indicatorColor = com.example.ui.theme.SemestaSoftCyan,
        unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
        unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            if (showBottomBar) {
                NavigationBar(
                    containerColor = MaterialTheme.colorScheme.surface,
                    contentColor = com.example.ui.theme.SemestaDeepBlue
                ) {
                    NavigationBarItem(
                        selected = currentScreen is ScreenDestination.Catalog,
                        onClick = {
                            feedback.playClick()
                            viewModel.navigateTo(ScreenDestination.Catalog)
                        },
                        icon = { Icon(Icons.Default.MenuBook, contentDescription = "Katalog") },
                        label = { Text("Katalog", fontWeight = FontWeight.SemiBold) },
                        colors = navItemColors,
                        modifier = Modifier.testTag("nav_catalog")
                    )
                    NavigationBarItem(
                        selected = currentScreen is ScreenDestination.SkillMap,
                        onClick = {
                            feedback.playClick()
                            viewModel.navigateTo(ScreenDestination.SkillMap)
                        },
                        icon = { Icon(Icons.Default.Hub, contentDescription = "Peta") },
                        label = { Text("Peta", fontWeight = FontWeight.SemiBold) },
                        colors = navItemColors,
                        modifier = Modifier.testTag("nav_skillmap")
                    )
                    NavigationBarItem(
                        selected = currentScreen is ScreenDestination.Progress,
                        onClick = {
                            feedback.playClick()
                            viewModel.navigateTo(ScreenDestination.Progress)
                        },
                        icon = { Icon(Icons.Default.Insights, contentDescription = "Progres") },
                        label = { Text("Progres", fontWeight = FontWeight.SemiBold) },
                        colors = navItemColors,
                        modifier = Modifier.testTag("nav_progress")
                    )
                    NavigationBarItem(
                        selected = currentScreen is ScreenDestination.Profiles,
                        onClick = {
                            feedback.playClick()
                            viewModel.navigateTo(ScreenDestination.Profiles)
                        },
                        icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profil") },
                        label = { Text("Profil", fontWeight = FontWeight.SemiBold) },
                        colors = navItemColors,
                        modifier = Modifier.testTag("nav_profiles")
                    )
                }
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (val dest = currentScreen) {
                is ScreenDestination.Catalog -> CatalogScreen(viewModel = viewModel)
                is ScreenDestination.SkillMap -> SkillMapScreen(viewModel = viewModel)
                is ScreenDestination.Progress -> ProgressScreen(viewModel = viewModel)
                is ScreenDestination.Profiles -> ProfileScreen(viewModel = viewModel)
                is ScreenDestination.Lesson -> LessonScreen(
                    conceptId = dest.conceptId,
                    viewModel = viewModel
                )
                is ScreenDestination.PlacementTest -> PlacementTestScreen(viewModel = viewModel)
                is ScreenDestination.SimulationLab -> LessonScreen(
                    conceptId = "fis-gerak-parabola",
                    viewModel = viewModel
                )
            }
        }

        // Global Celebration Modal Dialog when badge unlocked
        newlyUnlockedBadge?.let { badge ->
            CelebrationBadgeDialog(
                badge = badge,
                onDismiss = { viewModel.dismissBadgeCelebration() }
            )
        }
    }
}

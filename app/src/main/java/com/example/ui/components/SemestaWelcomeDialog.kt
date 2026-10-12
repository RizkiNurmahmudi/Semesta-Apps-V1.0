package com.example.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.R
import com.example.ui.theme.SemestaAmber
import com.example.ui.theme.SemestaBabyBlue
import com.example.ui.theme.SemestaDeepBlue
import com.example.ui.theme.SemestaSoftCyan
import com.example.util.feedback.LocalSemestaFeedback

@Composable
fun SemestaWelcomeDialog(
    onDismiss: () -> Unit,
    onStartLearning: () -> Unit
) {
    val feedback = LocalSemestaFeedback.current

    Dialog(onDismissRequest = onDismiss) {
        Card(
            shape = RoundedCornerShape(28.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Header Atom Logo + Badge
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    SemestaAtomLogo(size = 40.dp)
                    Surface(
                        color = SemestaSoftCyan,
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(
                            text = "Keluarga Indonesia",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = SemestaDeepBlue,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // High Definition Generative Art (Nano Banana / Google Imagen)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .clip(RoundedCornerShape(18.dp))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.semesta_discovery_lab),
                        contentDescription = "Petualangan Sains Semesta",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "Selamat Datang di Semesta!",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colorScheme.onSurface,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "Dari nol sampai ahli, dalam satu tempat. Cerita bergambar, simulasi interaktif, dan jurnal praktikum sains untuk seluruh keluarga.",
                    fontSize = 12.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center,
                    lineHeight = 18.sp
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Family Avatars Row
                Text(
                    text = "Karakter Pendamping Belajar:",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = SemestaDeepBlue
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    FamilyAvatarMini("Kirana", "kirana")
                    FamilyAvatarMini("Dimas", "dimas")
                    FamilyAvatarMini("Bu Ratna", "ratna")
                    FamilyAvatarMini("Arya", "arya")
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Primary CTA Button
                Button(
                    onClick = {
                        feedback.playClick()
                        onStartLearning()
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = SemestaDeepBlue)
                ) {
                    Text(
                        text = "Mulai Petualangan Sains 🚀",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(vertical = 4.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun FamilyAvatarMini(name: String, key: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        ProfileAvatar(avatarKey = key, size = 38.dp)
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = name,
            fontSize = 10.sp,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

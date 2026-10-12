# 🚀 PANDUAN KOLABORASI UI/UX & MULTIMEDIA (CHATGPT + MCP HIGGSFIELD / EKOSISTEM GOOGLE)
**Proyek**: Semesta — Kosmos Edukasi Sains & Matematika Interaktif (Native Android Jetpack Compose)  
**Catatan Pembaruan Strategis**: Untuk Versi 1.0 menuju Google Play Store, pengembang telah menyelesaikan blueprint antarmuka di [Desain-Semesta-Mobile (GitHub)](https://github.com/RizkiNurmahmudi/Desain-Semesta-Mobile.git) dan menggunakan image generation bawaan ekosistem Google/Nano Banana secara bebas biaya. Panduan eksekusi bebas biaya lengkap dapat dilihat di [PANDUAN_DESAIN_DAN_EKOSISTEM_GOOGLE.md](./PANDUAN_DESAIN_DAN_EKOSISTEM_GOOGLE.md). Dokumen ini tetap disimpan sebagai referensi bila kelak berlangganan ChatGPT Plus & Higgsfield untuk Versi 2.0.

---

## 📌 Ringkasan Eksekutif Proyek
**Semesta** adalah aplikasi edukasi sains komprehensif berbasis **Android Native** yang dirancang dengan filosofi *Cosmic Sci-Fi Education*. Aplikasi ini menggabungkan intuisi visual, simulasi interaktif matematika/fisika/kimia/biologi, praktikum nyata (*Home Lab*), serta gamifikasi bertaraf internasional.

- **Stack Teknologi**: Kotlin 2.0+, Android Jetpack Compose, Material 3, Room SQLite Database (Offline-First), Android Native Graphics & PDF Document Engine.
- **Arsitektur**: MVVM (Model-View-ViewModel) + Clean Architecture Repository Pattern.
- **Kondisi Offline**: 100% materi, kuis, simulasi, dan generator raport/sertifikat berjalan lokal tanpa internet.

---

## 🧭 Status Proyek Terkini (Backend & Logika: 100% Tuntas)

Hingga saat ini, 4 fase fondasi utama telah diselesaikan secara penuh:
1. **✅ Fase 1: 261 Konsep Kurikulum & Simulasi 3-Tingkat**:
   - 261 materi sains terstruktur (68 Matematika, 62 Fisika, 64 Kimia, 67 Biologi).
   - Laboratorium simulasi 3-tingkat: *Dedicated Visual Labs*, *Modular Domain Engines* (Calculus Plotter, Wave Oscillator, Particle Equilibrium, Population Growth), dan *Universal Interactive Formula Sandbox*.
   - Jurnal praktikum nyata (*Interactive Home Lab Notebook*) dengan daftar cek alat/bahan, data logger pengamatan, dan verifikasi teori.
2. **✅ Fase 2: Sistem Gamifikasi & Achievement Engine**:
   - 25 Lencana Prestasi (`BadgeRegistry.kt`) lintas 7 kategori.
   - Mesin evaluasi reaktif otomatis (`AchievementEngine.kt`) saat menyelesaikan modul, kuis, atau Home Lab.
   - Dialog perayaan kosmik animasi (`CelebrationBadgeDialog.kt`).
3. **✅ Fase 3: Placement Test & Diagnostik Adaptif**:
   - 20 Soal diagnostik berjenjang (L1 - L5) untuk 4 pilar sains (`PlacementTestData.kt`).
   - Algoritma scoring adaptif, radar kemampuan domain, dan rekomendasi 4 modul awal (`PlacementTestScreen.kt`).
4. **✅ Fase 4: Generator Dokumen Resmi PDF**:
   - Mesin pembuat PDF native (`PdfDocumentManager.kt`) beresolusi tinggi.
   - Sertifikat Kelulusan Emas (*Landscape A4*) dengan stempel digital otentik & nomor registrasi unik.
   - Raport Akademik Siswa (*Portrait A4*) dengan rekap 4 pilar sains & analisis pedagogis.
   - Integrasi `androidx.core.content.FileProvider` untuk berbagi cepat ke WhatsApp, Google Drive, dsb.

---

## 🎯 Tugas Utama untuk ChatGPT + MCP Higgsfield

Bagian logika dan data telah selesai dan teruji bebas bug. Tugas ChatGPT berfokus pada **Penyempurnaan Pengalaman Sensorik, Aset Multimedia, dan Desain UI/UX (Fase 5 & Fase 6)**:

```
┌────────────────────────────────────────────────────────┐
│               TUGAS CHATGPT + HIGGSFIELD               │
├──────────────────────────┬─────────────────────────────┤
│ 1. Generasi Aset Visual  │ - Hero Banner Tiap Materi   │
│    (MCP Higgsfield Img)  │ - App Icon & Feature Play   │
│                          │ - 25 Badge Icons Vektor/PNG │
├──────────────────────────┼─────────────────────────────┤
│ 2. Audio & Sound FX      │ - Efek Suara Haptik & Kuis  │
│    (MCP Higgsfield Aud)  │ - Fanfare Kemenangan Lencana│
│                          │ - Ambient Kosmik Lembut     │
├──────────────────────────┼─────────────────────────────┤
│ 3. Animasi & Video Loop  │ - Splash Screen Animation   │
│    (MCP Higgsfield Vid)  │ - Background Kosmik Bergerak│
│                          │ - Efek Partikel Kemenangan  │
├──────────────────────────┼─────────────────────────────┤
│ 4. Polesan UI/UX         │ - Glassmorphism & M3 Polish │
│    (Jetpack Compose)     │ - Dark Mode & Light Mode    │
│                          │ - Micro-interactions Halus  │
└──────────────────────────┴─────────────────────────────┘
```

---

## 🎨 1. Panduan Prompt MCP Higgsfield

Gunakan template prompt berikut di ChatGPT untuk mengeksekusi MCP Higgsfield:

### A. Prompt Generasi Gambar (Images)
#### 1. App Icon Resmi (512x512 PNG)
> **Prompt Higgsfield**:
> *"App icon for an educational science app named Semesta. A glowing futuristic celestial telescope and an atom nucleus swirling with golden mathematical orbits, cosmic deep indigo background (#0B0F19), vibrant cyan (#06B6D4) and glowing amber (#F59E0B) rim lighting, ultra high resolution 3D render, minimalist modern app icon style, square with rounded squircle mask."*

#### 2. Feature Graphic Google Play Store (1024x500 PNG)
> **Prompt Higgsfield**:
> *"Google Play Store Feature Graphic (1024x500) for 'Semesta - Kosmos Edukasi Sains & Matematika'. Wide cinematic composition of a young student exploring a holographic solar system, mathematical calculus curves, and chemical molecules glowing in mid-air. Deep cosmic nebula background, neon cyan and violet highlights, clean typography space for title on left side, 8k render, Unreal Engine 5 aesthetic, family-friendly educational sci-fi."*

#### 3. Paket Lencana Prestasi (Badge Icons)
> **Prompt Higgsfield**:
> *"Game achievement badge medal icon, floating metallic cosmic seal with golden laurel wreath and a glowing holographic prism in the center, dark indigo translucent background, 3D glossy game asset, isometric view, transparent background PNG, vibrant gold and cosmic emerald accents."*

---

### B. Prompt Generasi Efek Suara (Audio SFX)
#### 1. Tactile Click (Sentuhan Taktil)
> **Prompt Higgsfield Audio**:
> *"Short modern UI subtle tick sound, warm tactile wooden click with high-frequency crisp snap, duration 80 milliseconds, no reverb, clean UI interface sound."*

#### 2. Jawaban Kuis Benar (Positive Chime)
> **Prompt Higgsfield Audio**:
> *"Inspiring scientific success sound, two-tone crystal celestial chime ascending (C to G note), gentle sparkle tail, duration 1.2 seconds, warm melodic acoustic bell."*

#### 3. Kemenangan Lencana / Level Up (Fanfare Achievement)
> **Prompt Higgsfield Audio**:
> *"Majestic cosmic achievement fanfare, orchestral brass swell with celestial harps and futuristic synthesized star dust shimmer, triumph victory celebration sound, duration 3.5 seconds, uplifting and motivating."*

#### 4. Ambient Background Musik Lembut (Loopable BGM)
> **Prompt Higgsfield Audio**:
> *"Calm ambient study music, deep space meditative pad synth, gentle piano arpeggios, 60 BPM, relaxing, educational, binaural focus frequency, loopable 60 seconds."*

---

### C. Prompt Generasi Video & Animasi (Videos / Loops)
#### 1. Loop Background Kosmik (Splash / Hero Header)
> **Prompt Higgsfield Video**:
> *"Slow seamless loop of a deep space cosmic nebula, drifting glowing star dust and soft purple-blue aurora rays, subtle camera drift, 1080x1920 portrait aspect ratio, peaceful scientific exploration atmosphere, 10 seconds seamless loop."*

#### 2. Animasi Konfeti Perayaan Lencana
> **Prompt Higgsfield Video**:
> *"Celebratory explosion of glowing golden stars and cosmic geometric crystals, bursting outward from center and gently falling down with alpha transparency, magical achievement celebration, 4 seconds duration."*

---

## 🛠️ 2. Panduan Integrasi ke Kode Kotlin Jetpack Compose

Ketika ChatGPT menghasilkan kode untuk Fase 5 (Audio & Haptik) dan Fase 6 (UI Polish), berikut adalah konvensi arsitektur yang harus diikuti:

### A. Lokasi Penyimpanan Aset
- **Audio (.mp3 / .wav)**: Simpan di folder `app/src/main/res/raw/`
  - `click_tick.mp3`
  - `quiz_correct.mp3`
  - `quiz_wrong.mp3`
  - `badge_unlock.mp3`
  - `ambient_focus.mp3`
- **Gambar (.png / .webp / .svg)**: Simpan di folder `app/src/main/res/drawable/`
  - `ic_launcher_foreground.xml`
  - `badge_*.png`
- **Animasi Lottie (.json)**: Simpan di `app/src/main/res/raw/` (jika menggunakan Lottie).

### B. Arsitektur Audio Player (`SemestaAudioPlayer.kt`)
Buat class utilitas di `com.example.util.audio.SemestaAudioPlayer`:
```kotlin
package com.example.util.audio

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool
import com.example.R

class SemestaAudioPlayer(context: Context) {
    private val soundPool: SoundPool
    private val soundMap = mutableMapOf<SoundType, Int>()
    var isMuted: Boolean = false

    enum class SoundType {
        CLICK, CORRECT, WRONG, BADGE_UNLOCKED
    }

    init {
        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()
        soundPool = SoundPool.Builder()
            .setMaxStreams(5)
            .setAudioAttributes(audioAttributes)
            .build()

        // Load sound pool references from res/raw
        // soundMap[SoundType.CLICK] = soundPool.load(context, R.raw.click_tick, 1)
        // soundMap[SoundType.CORRECT] = soundPool.load(context, R.raw.quiz_correct, 1)
        // soundMap[SoundType.BADGE_UNLOCKED] = soundPool.load(context, R.raw.badge_unlock, 1)
    }

    fun playSound(type: SoundType) {
        if (isMuted) return
        val soundId = soundMap[type] ?: return
        soundPool.play(soundId, 1f, 1f, 1, 0, 1f)
    }

    fun release() {
        soundPool.release()
    }
}
```

### C. Arsitektur Umpan Balik Getaran Haptik (`SemestaHaptics.kt`)
Buat class utilitas di `com.example.util.haptics.SemestaHaptics`:
```kotlin
package com.example.util.haptics

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager

class SemestaHaptics(context: Context) {
    private val vibrator: Vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val manager = context.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
        manager.defaultVibrator
    } else {
        @Suppress("DEPRECATION")
        context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }

    var isHapticEnabled: Boolean = true

    fun subtleTick() {
        if (!isHapticEnabled || !vibrator.hasVibrator()) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            vibrator.vibrate(VibrationEffect.createPredefined(VibrationEffect.EFFECT_TICK))
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(20)
        }
    }

    fun successPulse() {
        if (!isHapticEnabled || !vibrator.hasVibrator()) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val timings = longArrayOf(0, 50, 60, 100)
            val amplitudes = intArrayOf(0, 180, 0, 255)
            vibrator.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(120)
        }
    }
}
```

### D. Penataan UI/UX (Fase 6: Material 3, Dark & Light Mode, Glassmorphism)
1. **Palet Warna Kosmik Resmi**:
   - `CosmicIndigoPrimary`: `Color(0xFF4F46E5)`
   - `CosmicCyanSecondary`: `Color(0xFF06B6D4)`
   - `CosmicAmberAccent`: `Color(0xFFF59E0B)`
   - `CosmicEmeraldSuccess`: `Color(0xFF10B981)`
   - `MasteryGold`: `Color(0xFFFBBF24)`
   - `CosmicDarkBackground`: `Color(0xFF0B0F19)`
   - `CosmicDarkSurfaceCard`: `Color(0xFF1F2937)`
2. **Glassmorphism**: Gunakan `Modifier.background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.75f)).border(1.dp, Color.White.copy(alpha = 0.12f), RoundedCornerShape(16.dp))`.
3. **Tipografi**: Pastikan kontras teks `onSurface` dan `onSurfaceVariant` tetap terbaca optimal di kedua mode (Dark & Light).

---

## 📋 Checklist Pekerjaan Selanjutnya untuk ChatGPT

- [ ] **1. Audio & Haptics Engine (Fase 5)**:
  - Bangun `SemestaAudioPlayer.kt` dan `SemestaHaptics.kt`.
  - Hubungkan ke event: geser slider simulasi, submit kuis, perolehan lencana di `CelebrationBadgeDialog.kt`.
  - Tambahkan toggle preferensi suara & getaran di `ProfileScreen.kt`.
- [ ] **2. Aset Higgsfield MCP**:
  - Jalankan prompt Higgsfield untuk App Icon (512x512) & Feature Graphic (1024x500).
  - Generate audio efek suara (klik, kuis benar, perayaan lencana).
  - Generate visual lencana 25 badge items untuk galeri profil.
- [ ] **3. UI/UX Polish (Fase 6)**:
  - Poles `HomeScreen.kt` / `CatalogScreen.kt` dengan kartu materi glassmorphic, visual indicator level, dan transisi animasi mulus.
  - Sempurnakan kontras Light & Dark Mode.
- [ ] **4. Testing & Release (Fase 7 & 8)**:
  - Jalankan build test release dan persiapan rilis Google Play Store.

---
*Dokumen ini dibuat otomatis sebagai panduan handoff resmi bagi pengembangan UI/UX dan aset multimedia Semesta.*

package com.example.util.feedback

import android.content.Context
import androidx.compose.runtime.compositionLocalOf
import com.example.util.audio.SemestaAudioEngine
import com.example.util.haptics.SemestaHaptics

/**
 * Manajer Tunggal (Unified Facade) untuk Audio & Getaran Haptik Semesta.
 * Mengontrol preferensi pengguna dan menyimpan statusnya di SharedPreferences.
 */
class SemestaFeedbackManager(context: Context) {

    private val prefs = context.getSharedPreferences("semesta_feedback_prefs", Context.MODE_PRIVATE)
    private val audioEngine = SemestaAudioEngine(context)
    private val haptics = SemestaHaptics(context)

    var isAudioEnabled: Boolean
        get() = prefs.getBoolean("audio_enabled", true)
        set(value) {
            prefs.edit().putBoolean("audio_enabled", value).apply()
            audioEngine.isAudioEnabled = value
        }

    var isHapticEnabled: Boolean
        get() = prefs.getBoolean("haptic_enabled", true)
        set(value) {
            prefs.edit().putBoolean("haptic_enabled", value).apply()
            haptics.isHapticEnabled = value
        }

    init {
        audioEngine.isAudioEnabled = isAudioEnabled
        haptics.isHapticEnabled = isHapticEnabled
    }

    /**
     * Umpan balik klik tombol antarmuka standar.
     */
    fun playClick() {
        audioEngine.play(SemestaAudioEngine.SoundType.CLICK, volume = 0.8f)
        haptics.click()
    }

    /**
     * Umpan balik mikro saat menggeser slider nilai simulasi fisika/matematika.
     */
    fun playSliderTick() {
        audioEngine.play(SemestaAudioEngine.SoundType.SLIDER_TICK, volume = 0.45f)
        haptics.tick()
    }

    /**
     * Umpan balik saat menjawab kuis dengan benar atau menyelesaikan tugas praktikum.
     */
    fun playCorrect() {
        audioEngine.play(SemestaAudioEngine.SoundType.CORRECT, volume = 0.9f)
        haptics.successPulse()
    }

    /**
     * Umpan balik saat jawaban kuis salah atau input di luar rentang.
     */
    fun playWrong() {
        audioEngine.play(SemestaAudioEngine.SoundType.WRONG, volume = 0.7f)
        haptics.wrongPulse()
    }

    /**
     * Umpan balik selebrasi kosmik saat lencana prestasi baru berhasil dibuka.
     */
    fun playBadgeFanfare() {
        audioEngine.play(SemestaAudioEngine.SoundType.FANFARE, volume = 1.0f)
        haptics.fanfarePulse()
    }

    fun release() {
        audioEngine.release()
    }
}

val LocalSemestaFeedback = compositionLocalOf<SemestaFeedbackManager> {
    error("SemestaFeedbackManager belum disediakan di CompositionLocalProvider!")
}

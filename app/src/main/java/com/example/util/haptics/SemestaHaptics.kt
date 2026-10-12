package com.example.util.haptics

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager

/**
 * Mesin Umpan Balik Getaran Taktil (Haptics) untuk meningkatkan pengalaman sensorik pengguna.
 * Kompatibel dari Android API 24 hingga API 34+.
 */
class SemestaHaptics(context: Context) {

    private val vibrator: Vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val manager = context.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as? VibratorManager
        manager?.defaultVibrator ?: (context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator)
    } else {
        @Suppress("DEPRECATION")
        context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    }

    var isHapticEnabled: Boolean = true

    /**
     * Getaran mikro sangat lembut (15 ms), optimal saat slider simulasi bergeser.
     */
    fun tick() {
        if (!isHapticEnabled || !vibrator.hasVibrator()) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            vibrator.vibrate(VibrationEffect.createPredefined(VibrationEffect.EFFECT_TICK))
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrator.vibrate(VibrationEffect.createOneShot(15, 80))
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(15)
        }
    }

    /**
     * Getaran klik tombol standar (25 ms).
     */
    fun click() {
        if (!isHapticEnabled || !vibrator.hasVibrator()) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            vibrator.vibrate(VibrationEffect.createPredefined(VibrationEffect.EFFECT_CLICK))
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrator.vibrate(VibrationEffect.createOneShot(25, 140))
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(25)
        }
    }

    /**
     * Getaran ganda ritmis untuk konfirmasi jawaban kuis benar atau verifikasi laboratorium.
     */
    fun successPulse() {
        if (!isHapticEnabled || !vibrator.hasVibrator()) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val timings = longArrayOf(0, 40, 50, 70)
            val amplitudes = intArrayOf(0, 150, 0, 240)
            vibrator.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(longArrayOf(0, 40, 50, 70), -1)
        }
    }

    /**
     * Getaran peringatan halus saat jawaban kuis belum tepat.
     */
    fun wrongPulse() {
        if (!isHapticEnabled || !vibrator.hasVibrator()) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val timings = longArrayOf(0, 35, 40, 35)
            val amplitudes = intArrayOf(0, 100, 0, 100)
            vibrator.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(longArrayOf(0, 35, 40, 35), -1)
        }
    }

    /**
     * Getaran selebrasi megah saat lencana baru berhasil diraih.
     */
    fun fanfarePulse() {
        if (!isHapticEnabled || !vibrator.hasVibrator()) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val timings = longArrayOf(0, 45, 40, 45, 50, 120)
            val amplitudes = intArrayOf(0, 140, 0, 180, 0, 255)
            vibrator.vibrate(VibrationEffect.createWaveform(timings, amplitudes, -1))
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(longArrayOf(0, 45, 40, 45, 50, 120), -1)
        }
    }
}

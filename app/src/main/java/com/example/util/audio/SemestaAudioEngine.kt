package com.example.util.audio

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool
import java.io.File
import java.io.FileOutputStream
import java.io.RandomAccessFile
import kotlin.math.PI
import kotlin.math.exp
import kotlin.math.sin

/**
 * Mesin Audio Sintetis Berkinerja Tinggi (Zero-Dependency & Zero-Asset Size).
 * Menghasilkan efek audio gelombang digital presisi langsung ke memori/cache lokal
 * dan dimuat ke SoundPool native untuk latensi 0 ms.
 */
class SemestaAudioEngine(private val context: Context) {

    enum class SoundType {
        CLICK,
        SLIDER_TICK,
        CORRECT,
        WRONG,
        FANFARE
    }

    private var soundPool: SoundPool? = null
    private val soundMap = mutableMapOf<SoundType, Int>()
    var isAudioEnabled: Boolean = true

    init {
        initializeSoundPool()
    }

    private fun initializeSoundPool() {
        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()

        soundPool = SoundPool.Builder()
            .setMaxStreams(6)
            .setAudioAttributes(audioAttributes)
            .build()

        generateAndLoadSounds()
    }

    private fun generateAndLoadSounds() {
        val cacheDir = File(context.cacheDir, "audio_sfx").apply { if (!exists()) mkdirs() }

        // 1. Click Sound (Tick tajam, hangat, 40ms)
        val clickFile = File(cacheDir, "sfx_click.wav")
        if (!clickFile.exists() || clickFile.length() == 0L) {
            createWavFile(clickFile, generateTone(frequency = 1400.0, durationMs = 35, decayRate = 70.0))
        }
        soundMap[SoundType.CLICK] = soundPool?.load(clickFile.absolutePath, 1) ?: 0

        // 2. Slider Tick (Mikro klik sangat lembut, 15ms)
        val sliderFile = File(cacheDir, "sfx_slider.wav")
        if (!sliderFile.exists() || sliderFile.length() == 0L) {
            createWavFile(sliderFile, generateTone(frequency = 950.0, durationMs = 20, decayRate = 120.0, amplitude = 0.5))
        }
        soundMap[SoundType.SLIDER_TICK] = soundPool?.load(sliderFile.absolutePath, 1) ?: 0

        // 3. Correct Chime (2 Nada Ascending Harmonis C6 -> G6)
        val correctFile = File(cacheDir, "sfx_correct.wav")
        if (!correctFile.exists() || correctFile.length() == 0L) {
            createWavFile(correctFile, generateMelody(listOf(Pair(1046.5, 120), Pair(1567.9, 320))))
        }
        soundMap[SoundType.CORRECT] = soundPool?.load(correctFile.absolutePath, 1) ?: 0

        // 4. Wrong Alert (Nada lembut turun F4 -> D4)
        val wrongFile = File(cacheDir, "sfx_wrong.wav")
        if (!wrongFile.exists() || wrongFile.length() == 0L) {
            createWavFile(wrongFile, generateMelody(listOf(Pair(349.2, 120), Pair(293.6, 200)), isSoft = true))
        }
        soundMap[SoundType.WRONG] = soundPool?.load(wrongFile.absolutePath, 1) ?: 0

        // 5. Fanfare Achievement (Arpeggio Kosmik Selebrasi C5 -> E5 -> G5 -> C6)
        val fanfareFile = File(cacheDir, "sfx_fanfare.wav")
        if (!fanfareFile.exists() || fanfareFile.length() == 0L) {
            createWavFile(
                fanfareFile,
                generateMelody(
                    listOf(
                        Pair(523.25, 90),
                        Pair(659.25, 90),
                        Pair(783.99, 110),
                        Pair(1046.50, 450)
                    )
                )
            )
        }
        soundMap[SoundType.FANFARE] = soundPool?.load(fanfareFile.absolutePath, 1) ?: 0
    }

    fun play(type: SoundType, volume: Float = 1.0f) {
        if (!isAudioEnabled) return
        val soundId = soundMap[type] ?: return
        if (soundId != 0) {
            soundPool?.play(soundId, volume, volume, 1, 0, 1.0f)
        }
    }

    fun release() {
        soundPool?.release()
        soundPool = null
        soundMap.clear()
    }

    // =========================================================================
    // SINTESIS AUDIO DIGITAL (PCM WAV GENERATOR)
    // =========================================================================

    private fun generateTone(
        frequency: Double,
        durationMs: Int,
        decayRate: Double = 30.0,
        amplitude: Double = 0.8
    ): ByteArray {
        val sampleRate = 22050
        val numSamples = (durationMs * sampleRate) / 1000
        val buffer = ByteArray(numSamples * 2)

        for (i in 0 until numSamples) {
            val t = i.toDouble() / sampleRate
            val envelope = exp(-decayRate * t)
            val sample = (sin(2.0 * PI * frequency * t) * envelope * amplitude * 32767.0).toInt().coerceIn(-32768, 32767)
            buffer[i * 2] = (sample and 0xFF).toByte()
            buffer[i * 2 + 1] = ((sample shr 8) and 0xFF).toByte()
        }
        return buffer
    }

    private fun generateMelody(
        notes: List<Pair<Double, Int>>,
        isSoft: Boolean = false
    ): ByteArray {
        val sampleRate = 22050
        val totalDurationMs = notes.sumOf { it.second }
        val numSamples = (totalDurationMs * sampleRate) / 1000
        val buffer = ByteArray(numSamples * 2)

        var sampleOffset = 0
        for ((freq, durationMs) in notes) {
            val noteSamples = (durationMs * sampleRate) / 1000
            for (i in 0 until noteSamples) {
                val t = i.toDouble() / sampleRate
                val noteT = i.toDouble() / noteSamples
                val envelope = (1.0 - noteT).coerceIn(0.0, 1.0)
                val amp = if (isSoft) 0.5 else 0.75

                // Tambahkan harmonik kedua untuk suara kristal kosmik
                val wave = sin(2.0 * PI * freq * t) + 0.25 * sin(4.0 * PI * freq * t)
                val sample = (wave * envelope * amp * 32767.0 / 1.25).toInt().coerceIn(-32768, 32767)

                val idx = (sampleOffset + i) * 2
                if (idx + 1 < buffer.size) {
                    buffer[idx] = (sample and 0xFF).toByte()
                    buffer[idx + 1] = ((sample shr 8) and 0xFF).toByte()
                }
            }
            sampleOffset += noteSamples
        }
        return buffer
    }

    private fun createWavFile(file: File, pcmData: ByteArray) {
        val sampleRate = 22050
        val channels = 1
        val bitsPerSample = 16
        val byteRate = sampleRate * channels * (bitsPerSample / 8)
        val blockAlign = channels * (bitsPerSample / 8)
        val subChunk2Size = pcmData.size
        val chunkSize = 36 + subChunk2Size

        FileOutputStream(file).use { out ->
            // RIFF header
            out.write("RIFF".toByteArray())
            out.write(intToByteArray(chunkSize))
            out.write("WAVE".toByteArray())

            // fmt subchunk
            out.write("fmt ".toByteArray())
            out.write(intToByteArray(16)) // Subchunk1Size for PCM
            out.write(shortToByteArray(1.toShort())) // AudioFormat 1 = PCM
            out.write(shortToByteArray(channels.toShort()))
            out.write(intToByteArray(sampleRate))
            out.write(intToByteArray(byteRate))
            out.write(shortToByteArray(blockAlign.toShort()))
            out.write(shortToByteArray(bitsPerSample.toShort()))

            // data subchunk
            out.write("data".toByteArray())
            out.write(intToByteArray(subChunk2Size))
            out.write(pcmData)
        }
    }

    private fun intToByteArray(value: Int): ByteArray = byteArrayOf(
        (value and 0xFF).toByte(),
        ((value shr 8) and 0xFF).toByte(),
        ((value shr 16) and 0xFF).toByte(),
        ((value shr 24) and 0xFF).toByte()
    )

    private fun shortToByteArray(value: Short): ByteArray = byteArrayOf(
        (value.toInt() and 0xFF).toByte(),
        ((value.toInt() shr 8) and 0xFF).toByte()
    )
}

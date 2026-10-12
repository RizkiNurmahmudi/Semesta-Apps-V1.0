package com.example.util.pdf

import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.graphics.Typeface
import android.graphics.pdf.PdfDocument
import androidx.core.content.FileProvider
import com.example.data.export.StudentAcademicReport
import java.io.File
import java.io.FileOutputStream
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object PdfDocumentManager {

    /**
     * Menghasilkan dokumen PDF Sertifikat Kelulusan Resmi Semesta (Format Landscape A4: 842 x 595 pt).
     */
    fun generateCertificatePdf(context: Context, report: StudentAcademicReport): File {
        val document = PdfDocument()
        val pageInfo = PdfDocument.PageInfo.Builder(842, 595, 1).create()
        val page = document.startPage(pageInfo)
        val canvas = page.canvas

        drawCertificateContent(canvas, report)

        document.finishPage(page)

        val outputDir = File(context.cacheDir, "reports").apply { if (!exists()) mkdirs() }
        val sanitizedName = report.studentName.replace("[^a-zA-Z0-9]".toRegex(), "_")
        val outputFile = File(outputDir, "Sertifikat_Semesta_${sanitizedName}.pdf")

        FileOutputStream(outputFile).use { out ->
            document.writeTo(out)
        }
        document.close()

        return outputFile
    }

    /**
     * Menghasilkan dokumen PDF Raport Akademik Siswa (Format Portrait A4: 595 x 842 pt).
     */
    fun generateReportCardPdf(context: Context, report: StudentAcademicReport): File {
        val document = PdfDocument()
        val pageInfo = PdfDocument.PageInfo.Builder(595, 842, 1).create()
        val page = document.startPage(pageInfo)
        val canvas = page.canvas

        drawReportCardContent(canvas, report)

        document.finishPage(page)

        val outputDir = File(context.cacheDir, "reports").apply { if (!exists()) mkdirs() }
        val sanitizedName = report.studentName.replace("[^a-zA-Z0-9]".toRegex(), "_")
        val outputFile = File(outputDir, "Raport_Sains_Semesta_${sanitizedName}.pdf")

        FileOutputStream(outputFile).use { out ->
            document.writeTo(out)
        }
        document.close()

        return outputFile
    }

    /**
     * Membagikan file PDF melalui Android Share Intent (misal WhatsApp, Gmail, Drive).
     */
    fun sharePdf(context: Context, file: File, subject: String) {
        val uri = FileProvider.getUriForFile(
            context,
            "${context.packageName}.provider",
            file
        )

        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "application/pdf"
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_STREAM, uri)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }

        context.startActivity(Intent.createChooser(intent, "Bagikan Dokumen via"))
    }

    /**
     * Membuka file PDF di aplikasi PDF viewer yang terinstal.
     */
    fun viewPdf(context: Context, file: File) {
        val uri = FileProvider.getUriForFile(
            context,
            "${context.packageName}.provider",
            file
        )

        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(uri, "application/pdf")
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }

        context.startActivity(Intent.createChooser(intent, "Buka Dokumen PDF"))
    }

    // =========================================================================
    // LOGIKA PENGGAMBARAN SERTIFIKAT (LANDSCAPE A4: 842 x 595)
    // =========================================================================

    private fun drawCertificateContent(canvas: Canvas, report: StudentAcademicReport) {
        val width = 842f
        val height = 595f

        // 1. Background Cream / Kosmik Lembut
        val bgPaint = Paint().apply {
            color = Color.rgb(253, 252, 248)
            style = Paint.Style.FILL
        }
        canvas.drawRect(0f, 0f, width, height, bgPaint)

        // 2. Double Ornamental Border
        val outerBorderPaint = Paint().apply {
            color = Color.rgb(49, 46, 129) // Cosmic Indigo Dark
            style = Paint.Style.STROKE
            strokeWidth = 6f
            isAntiAlias = true
        }
        canvas.drawRect(24f, 24f, width - 24f, height - 24f, outerBorderPaint)

        val innerBorderPaint = Paint().apply {
            color = Color.rgb(217, 119, 6) // Gold Amber Accent
            style = Paint.Style.STROKE
            strokeWidth = 2f
            isAntiAlias = true
        }
        canvas.drawRect(34f, 34f, width - 34f, height - 34f, innerBorderPaint)

        // Sudut Ornamen
        drawCornerOrnaments(canvas, 34f, 34f, width - 34f, height - 34f)

        // 3. Header Text
        val subHeaderPaint = Paint().apply {
            color = Color.rgb(79, 70, 229) // Indigo
            textSize = 11f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
            letterSpacing = 0.2f
        }
        canvas.drawText("SEMESTA • KOSMOS EDUKASI SAINS & MATEMATIKA", width / 2f, 85f, subHeaderPaint)

        val titlePaint = Paint().apply {
            color = Color.rgb(30, 27, 75) // Dark Indigo
            textSize = 28f
            typeface = Typeface.create(Typeface.SERIF, Typeface.BOLD)
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
        canvas.drawText("SERTIFIKAT PENGHARGAAN & KELULUSAN", width / 2f, 130f, titlePaint)

        val engTitlePaint = Paint().apply {
            color = Color.rgb(100, 116, 139)
            textSize = 12f
            typeface = Typeface.create(Typeface.SERIF, Typeface.ITALIC)
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
        canvas.drawText("Certificate of Science Mastery & Scientific Excellence", width / 2f, 150f, engTitlePaint)

        // Garis Pembatas Emas Bawah Judul
        val dividerPaint = Paint().apply {
            color = Color.rgb(245, 158, 11)
            strokeWidth = 2f
            isAntiAlias = true
        }
        canvas.drawLine(width / 2f - 160f, 168f, width / 2f + 160f, 168f, dividerPaint)

        // 4. Salutation Text
        val salutationPaint = Paint().apply {
            color = Color.rgb(71, 85, 105)
            textSize = 13f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL)
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
        canvas.drawText("Dengan bangga dan apresiasi tertinggi dianugerahkan kepada:", width / 2f, 215f, salutationPaint)

        // 5. Nama Siswa (Besar & Menonjol)
        val namePaint = Paint().apply {
            color = Color.rgb(79, 70, 229) // Cosmic Indigo Primary
            textSize = 34f
            typeface = Typeface.create(Typeface.SERIF, Typeface.BOLD)
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
        canvas.drawText(report.studentName, width / 2f, 265f, namePaint)

        // Garis dekoratif bawah nama
        val nameLinePaint = Paint().apply {
            color = Color.rgb(217, 119, 6)
            strokeWidth = 2f
            isAntiAlias = true
        }
        val nameWidth = namePaint.measureText(report.studentName)
        canvas.drawLine(width / 2f - (nameWidth / 2f + 25f), 280f, width / 2f + (nameWidth / 2f + 25f), 280f, nameLinePaint)

        // 6. Narasi Pencapaian
        val descPaint = Paint().apply {
            color = Color.rgb(51, 65, 85)
            textSize = 12.5f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL)
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
        canvas.drawText(
            "Atas dedikasi, ketelitian logika analitis, dan ketuntasan penguasaan 4 Pilar Sains Semesta",
            width / 2f,
            320f,
            descPaint
        )
        canvas.drawText(
            "(Fisika, Matematika, Kimia, dan Biologi) melalui Laboratorium Simulasi Interaktif & Praktikum Nyata.",
            width / 2f,
            340f,
            descPaint
        )

        // 7. Kotak Metrik Prestasi di Tengah Bawah
        val metricBgPaint = Paint().apply {
            color = Color.rgb(241, 245, 249)
            style = Paint.Style.FILL
            isAntiAlias = true
        }
        val metricRect = RectF(width / 2f - 240f, 370f, width / 2f + 240f, 425f)
        canvas.drawRoundRect(metricRect, 10f, 10f, metricBgPaint)

        val metricTextPaint = Paint().apply {
            color = Color.rgb(30, 41, 59)
            textSize = 11.5f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
        canvas.drawText(
            "⚡ Total Skor: ${report.totalXp} XP   |   📚 Modul Selesai: ${report.totalCompletedLessons} Topik   |   🏆 Lencana Diraih: ${report.badgesEarnedCount}",
            width / 2f,
            403f,
            metricTextPaint
        )

        // 8. Bagian Kaki: Nomor Sertifikat, Stempel Emas, & Tanda Tangan
        // Kiri: ID Sertifikat
        val footerLeftPaint = Paint().apply {
            color = Color.rgb(100, 116, 139)
            textSize = 10f
            typeface = Typeface.create(Typeface.MONOSPACE, Typeface.NORMAL)
            textAlign = Paint.Align.LEFT
            isAntiAlias = true
        }
        canvas.drawText("No. Registrasi: ${report.certificateId}", 60f, 495f, footerLeftPaint)
        canvas.drawText("Tanggal Terbit : ${report.reportDateString}", 60f, 512f, footerLeftPaint)
        canvas.drawText("Verifikasi      : Otentikasi Digital Semesta", 60f, 529f, footerLeftPaint)

        // Tengah: Stempel Keaslian Digital Semesta (Gold Seal)
        drawGoldDigitalSeal(canvas, width / 2f, 495f)

        // Kanan: Tanda Tangan Dewan Pembina
        val signLinePaint = Paint().apply {
            color = Color.rgb(71, 85, 105)
            strokeWidth = 1.5f
            isAntiAlias = true
        }
        canvas.drawLine(width - 240f, 505f, width - 60f, 505f, signLinePaint)

        val signTextPaint = Paint().apply {
            color = Color.rgb(30, 41, 59)
            textSize = 11f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
        canvas.drawText("Dr. Tim Kurikulum Semesta", width - 150f, 523f, signTextPaint)

        val signSubTextPaint = Paint().apply {
            color = Color.rgb(100, 116, 139)
            textSize = 9.5f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL)
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
        canvas.drawText("Komite Standar Sains & Pembelajaran", width - 150f, 537f, signSubTextPaint)
    }

    private fun drawCornerOrnaments(canvas: Canvas, left: Float, top: Float, right: Float, bottom: Float) {
        val cornerPaint = Paint().apply {
            color = Color.rgb(217, 119, 6)
            strokeWidth = 2f
            style = Paint.Style.STROKE
            isAntiAlias = true
        }
        val size = 18f
        // Top-left
        canvas.drawLine(left, top + size, left + size, top, cornerPaint)
        // Top-right
        canvas.drawLine(right - size, top, right, top + size, cornerPaint)
        // Bottom-left
        canvas.drawLine(left, bottom - size, left + size, bottom, cornerPaint)
        // Bottom-right
        canvas.drawLine(right - size, bottom, right, bottom - size, cornerPaint)
    }

    private fun drawGoldDigitalSeal(canvas: Canvas, cx: Float, cy: Float) {
        val sealBg = Paint().apply {
            color = Color.rgb(254, 243, 199)
            style = Paint.Style.FILL
            isAntiAlias = true
        }
        canvas.drawCircle(cx, cy, 32f, sealBg)

        val sealBorder = Paint().apply {
            color = Color.rgb(217, 119, 6)
            style = Paint.Style.STROKE
            strokeWidth = 2f
            isAntiAlias = true
        }
        canvas.drawCircle(cx, cy, 32f, sealBorder)
        canvas.drawCircle(cx, cy, 28f, sealBorder)

        val sealText = Paint().apply {
            color = Color.rgb(180, 83, 9)
            textSize = 7.5f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            textAlign = Paint.Align.CENTER
            isAntiAlias = true
        }
        canvas.drawText("SEMESTA", cx, cy - 8f, sealText)
        canvas.drawText("VERIFIED", cx, cy + 3f, sealText)
        canvas.drawText("★ 2026 ★", cx, cy + 14f, sealText)
    }

    // =========================================================================
    // LOGIKA PENGGAMBARAN RAPORT AKADEMIK (PORTRAIT A4: 595 x 842)
    // =========================================================================

    private fun drawReportCardContent(canvas: Canvas, report: StudentAcademicReport) {
        val width = 595f
        val height = 842f

        // 1. Background Bersih
        val bgPaint = Paint().apply {
            color = Color.WHITE
            style = Paint.Style.FILL
        }
        canvas.drawRect(0f, 0f, width, height, bgPaint)

        // 2. Banner Header Atas
        val headerBg = Paint().apply {
            color = Color.rgb(79, 70, 229) // Cosmic Indigo
            style = Paint.Style.FILL
            isAntiAlias = true
        }
        canvas.drawRect(0f, 0f, width, 100f, headerBg)

        // Ornamen Aksen Kuning pada Header
        val headerAccent = Paint().apply {
            color = Color.rgb(245, 158, 11)
            style = Paint.Style.FILL
        }
        canvas.drawRect(0f, 96f, width, 100f, headerAccent)

        val headerTitle = Paint().apply {
            color = Color.WHITE
            textSize = 20f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            isAntiAlias = true
        }
        canvas.drawText("RAPORT AKADEMIK SAINS & MATEMATIKA", 36f, 48f, headerTitle)

        val headerSub = Paint().apply {
            color = Color.rgb(224, 231, 255)
            textSize = 10.5f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL)
            isAntiAlias = true
        }
        canvas.drawText("Evaluasi Kemajuan Belajar, Pemahaman Konsep & Ekplorasi Praktikum", 36f, 68f, headerSub)

        val headerLogo = Paint().apply {
            color = Color.WHITE
            textSize = 11f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            textAlign = Paint.Align.RIGHT
            isAntiAlias = true
        }
        canvas.drawText("SEMESTA EDU", width - 36f, 54f, headerLogo)

        // 3. Kartu Identitas Siswa
        val infoBoxPaint = Paint().apply {
            color = Color.rgb(248, 250, 252)
            style = Paint.Style.FILL
            isAntiAlias = true
        }
        canvas.drawRoundRect(RectF(36f, 116f, width - 36f, 210f), 8f, 8f, infoBoxPaint)

        val infoBorder = Paint().apply {
            color = Color.rgb(226, 232, 240)
            style = Paint.Style.STROKE
            strokeWidth = 1f
            isAntiAlias = true
        }
        canvas.drawRoundRect(RectF(36f, 116f, width - 36f, 210f), 8f, 8f, infoBorder)

        val labelPaint = Paint().apply {
            color = Color.rgb(100, 116, 139)
            textSize = 10f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL)
            isAntiAlias = true
        }
        val valPaint = Paint().apply {
            color = Color.rgb(15, 23, 42)
            textSize = 11.5f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            isAntiAlias = true
        }

        // Kolom 1
        canvas.drawText("NAMA SISWA", 52f, 140f, labelPaint)
        canvas.drawText(report.studentName, 52f, 158f, valPaint)

        canvas.drawText("KELOMPOK USIA", 52f, 180f, labelPaint)
        canvas.drawText(report.ageGroup, 52f, 198f, valPaint)

        // Kolom 2
        canvas.drawText("MODE BELAJAR", 220f, 140f, labelPaint)
        canvas.drawText(report.defaultMode, 220f, 158f, valPaint)

        canvas.drawText("STREAK BELAJAR", 220f, 180f, labelPaint)
        canvas.drawText("${report.streakDays} Hari Beruntun 🔥", 220f, 198f, valPaint)

        // Kolom 3
        canvas.drawText("TOTAL SKOR XP", 400f, 140f, labelPaint)
        canvas.drawText("${report.totalXp} XP ⚡", 400f, 158f, valPaint)

        canvas.drawText("TANGGAL RAPORT", 400f, 180f, labelPaint)
        canvas.drawText(report.reportDateString, 400f, 198f, valPaint)

        // 4. Tabel Capaian 4 Pilar Sains
        val sectionTitlePaint = Paint().apply {
            color = Color.rgb(30, 41, 59)
            textSize = 13f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            isAntiAlias = true
        }
        canvas.drawText("I. REKAPITULASI PENGUASAAN 4 PILAR SAINS", 36f, 240f, sectionTitlePaint)

        var tableY = 255f
        val tableLeft = 36f
        val tableRight = width - 36f

        // Table Header Row
        val thBg = Paint().apply {
            color = Color.rgb(241, 245, 249)
            style = Paint.Style.FILL
        }
        canvas.drawRect(tableLeft, tableY, tableRight, tableY + 26f, thBg)

        val thText = Paint().apply {
            color = Color.rgb(71, 85, 105)
            textSize = 10f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            isAntiAlias = true
        }
        canvas.drawText("BIDANG ILMU", tableLeft + 12f, tableY + 17f, thText)
        canvas.drawText("MODUL TUNTAS", tableLeft + 140f, tableY + 17f, thText)
        canvas.drawText("RATA-RATA PENGUASAAN", tableLeft + 250f, tableY + 17f, thText)
        canvas.drawText("NILAI", tableLeft + 410f, tableY + 17f, thText)
        canvas.drawText("STATUS", tableLeft + 465f, tableY + 17f, thText)

        tableY += 26f

        // Table Rows
        val rowLinePaint = Paint().apply {
            color = Color.rgb(226, 232, 240)
            strokeWidth = 1f
        }
        val tdText = Paint().apply {
            color = Color.rgb(30, 41, 59)
            textSize = 11f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL)
            isAntiAlias = true
        }
        val tdGrade = Paint().apply {
            color = Color.rgb(79, 70, 229)
            textSize = 11f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            isAntiAlias = true
        }
        val tdStatus = Paint().apply {
            color = Color.rgb(16, 185, 129)
            textSize = 10f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
            isAntiAlias = true
        }

        report.domainReports.forEach { d ->
            canvas.drawLine(tableLeft, tableY, tableRight, tableY, rowLinePaint)
            val rowCenterY = tableY + 22f

            canvas.drawText(d.domainTitle, tableLeft + 12f, rowCenterY, tdText)
            canvas.drawText("${d.completedCount} / ${d.totalCount}", tableLeft + 140f, rowCenterY, tdText)
            canvas.drawText("${d.averageMasteryPercent}%", tableLeft + 250f, rowCenterY, tdText)
            canvas.drawText(d.gradeLetter, tableLeft + 410f, rowCenterY, tdGrade)

            val statusText = if (d.averageMasteryPercent >= 75) "Dikuasai" else if (d.completedCount > 0) "Sedang Aktif" else "Tersedia"
            canvas.drawText(statusText, tableLeft + 465f, rowCenterY, tdStatus)

            tableY += 32f
        }
        canvas.drawLine(tableLeft, tableY, tableRight, tableY, rowLinePaint)

        // 5. Bagian II: Ringkasan Praktikum & Penghargaan
        tableY += 26f
        canvas.drawText("II. RINGKASAN PRAKTIKUM & PRESTASI", 36f, tableY, sectionTitlePaint)

        tableY += 14f
        val statCardBg = Paint().apply {
            color = Color.rgb(248, 250, 252)
            style = Paint.Style.FILL
            isAntiAlias = true
        }

        // 3 Kartu Statistik Horisontal
        val cardW = (width - 72f - 24f) / 3f

        // Card 1: Modul
        val r1 = RectF(36f, tableY, 36f + cardW, tableY + 68f)
        canvas.drawRoundRect(r1, 8f, 8f, statCardBg)
        canvas.drawRoundRect(r1, 8f, 8f, infoBorder)
        canvas.drawText("📚 Modul Pembelajaran", 48f, tableY + 24f, labelPaint)
        canvas.drawText("${report.totalCompletedLessons} Tuntas", 48f, tableY + 48f, valPaint)

        // Card 2: Home Lab
        val r2 = RectF(36f + cardW + 12f, tableY, 36f + 2 * cardW + 12f, tableY + 68f)
        canvas.drawRoundRect(r2, 8f, 8f, statCardBg)
        canvas.drawRoundRect(r2, 8f, 8f, infoBorder)
        canvas.drawText("🥼 Home Lab Nyata", 36f + cardW + 24f, tableY + 24f, labelPaint)
        canvas.drawText("${report.homeLabsVerifiedCount} Diverifikasi", 36f + cardW + 24f, tableY + 48f, valPaint)

        // Card 3: Lencana
        val r3 = RectF(36f + 2 * cardW + 24f, tableY, width - 36f, tableY + 68f)
        canvas.drawRoundRect(r3, 8f, 8f, statCardBg)
        canvas.drawRoundRect(r3, 8f, 8f, infoBorder)
        canvas.drawText("🏆 Lencana Prestasi", 36f + 2 * cardW + 36f, tableY + 24f, labelPaint)
        canvas.drawText("${report.badgesEarnedCount} Penghargaan", 36f + 2 * cardW + 36f, tableY + 48f, valPaint)

        // 6. Bagian III: Analisis Evaluasi Pedagogis & Saran Penguatan
        tableY += 92f
        canvas.drawText("III. ANALISIS PEDAGOGIS & REKOMENDASI BELAJAR", 36f, tableY, sectionTitlePaint)

        tableY += 14f
        val noteRect = RectF(36f, tableY, width - 36f, tableY + 110f)
        canvas.drawRoundRect(noteRect, 8f, 8f, statCardBg)
        canvas.drawRoundRect(noteRect, 8f, 8f, infoBorder)

        val noteTextPaint = Paint().apply {
            color = Color.rgb(51, 65, 85)
            textSize = 10.5f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL)
            isAntiAlias = true
        }

        // Tampilkan teks analisis pedagogis multi-line
        val adviceLines = splitTextIntoLines(
            report.overallEvaluationText,
            noteTextPaint,
            width - 72f - 30f
        )
        var adviceY = tableY + 24f
        for (line in adviceLines.take(5)) {
            canvas.drawText(line, 52f, adviceY, noteTextPaint)
            adviceY += 16f
        }

        // 7. Footer & Stempel Keaslian
        val footerY = height - 50f
        canvas.drawLine(36f, footerY - 15f, width - 36f, footerY - 15f, rowLinePaint)

        val footerText = Paint().apply {
            color = Color.rgb(148, 163, 184)
            textSize = 9f
            typeface = Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL)
            isAntiAlias = true
        }
        canvas.drawText(
            "Dokumen ini sah dan diterbitkan secara digital oleh Sistem Semesta. ID Registrasi: ${report.certificateId}",
            36f,
            footerY,
            footerText
        )
        canvas.drawText(
            "Halaman 1 dari 1 • Laporan Kemajuan Siswa",
            width - 36f - 180f,
            footerY,
            footerText
        )
    }

    private fun splitTextIntoLines(text: String, paint: Paint, maxWidth: Float): List<String> {
        val words = text.split(" ")
        val lines = mutableListOf<String>()
        var currentLine = StringBuilder()

        for (word in words) {
            val testLine = if (currentLine.isEmpty()) word else "$currentLine $word"
            if (paint.measureText(testLine) <= maxWidth) {
                currentLine = StringBuilder(testLine)
            } else {
                if (currentLine.isNotEmpty()) {
                    lines.add(currentLine.toString())
                }
                currentLine = StringBuilder(word)
            }
        }
        if (currentLine.isNotEmpty()) {
            lines.add(currentLine.toString())
        }
        return lines
    }
}

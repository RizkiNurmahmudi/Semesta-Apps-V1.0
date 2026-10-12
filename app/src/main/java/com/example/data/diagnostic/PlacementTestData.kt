package com.example.data.diagnostic

import com.example.data.model.DepthLevel
import com.example.data.model.Domain

data class DiagnosticQuestion(
    val id: String,
    val prompt: String,
    val domain: Domain,
    val targetLevel: DepthLevel,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String,
    val conceptIdRef: String
)

data class DomainProficiency(
    val domain: Domain,
    val score: Int, // 0..5
    val total: Int, // 5
    val recommendedLevel: DepthLevel
)

data class DiagnosticResult(
    val overallLevel: DepthLevel,
    val domainProficiencies: List<DomainProficiency>,
    val totalCorrect: Int,
    val totalQuestions: Int,
    val recommendedConceptIds: List<String>,
    val personalizedAdvice: String
)

object PlacementTestData {

    val questions: List<DiagnosticQuestion> = listOf(
        // ==================== MATEMATIKA ====================
        DiagnosticQuestion(
            id = "diag-mat-1",
            prompt = "Ibu membagi martabak menjadi 8 potong sama besar. Dimas memakan 2 potong dan Kirana memakan 2 potong. Berapa bagian martabak yang tersisa?",
            domain = Domain.MATEMATIKA,
            targetLevel = DepthLevel.L1,
            options = listOf("1/2 bagian (4/8)", "1/4 bagian", "3/8 bagian", "3/4 bagian"),
            correctIndex = 0,
            explanation = "Dimas + Kirana memakan 2/8 + 2/8 = 4/8 potong. Sisa martabak adalah 8/8 - 4/8 = 4/8 = 1/2 bagian.",
            conceptIdRef = "mat-pecahan-rasio"
        ),
        DiagnosticQuestion(
            id = "diag-mat-2",
            prompt = "Sebuah segitiga siku-siku memiliki panjang sisi tegak 3 cm dan sisi alas 4 cm. Berapakah panjang sisi miringnya menurut Teorema Pythagoras?",
            domain = Domain.MATEMATIKA,
            targetLevel = DepthLevel.L2,
            options = listOf("5 cm", "6 cm", "7 cm", "12 cm"),
            correctIndex = 0,
            explanation = "c² = a² + b² = 3² + 4² = 9 + 16 = 25. c = √25 = 5 cm.",
            conceptIdRef = "mat-pythagoras"
        ),
        DiagnosticQuestion(
            id = "diag-mat-3",
            prompt = "Berapakah turunan pertama dari fungsi kuadrat f(x) = 3x² - 5x + 4 terhadap x?",
            domain = Domain.MATEMATIKA,
            targetLevel = DepthLevel.L3,
            options = listOf("f'(x) = 6x - 5", "f'(x) = 3x - 5", "f'(x) = 6x² - 5", "f'(x) = 6x + 4"),
            correctIndex = 0,
            explanation = "Aturan turunan d/dx [a·x^n] = n·a·x^(n-1). d/dx[3x²] = 6x, d/dx[-5x] = -5, d/dx[4] = 0. Jadi f'(x) = 6x - 5.",
            conceptIdRef = "mat-turunan-integral"
        ),
        DiagnosticQuestion(
            id = "diag-mat-4",
            prompt = "Matriks 2x2 M = [[2, 1], [4, 3]]. Berapakah nilai determinan dari matriks M?",
            domain = Domain.MATEMATIKA,
            targetLevel = DepthLevel.L4,
            options = listOf("2", "6", "10", "-2"),
            correctIndex = 0,
            explanation = "det(M) = (a·d - b·c) = (2·3 - 1·4) = 6 - 4 = 2.",
            conceptIdRef = "mat-matriks-determinan"
        ),
        DiagnosticQuestion(
            id = "diag-mat-5",
            prompt = "Pada aljabar linear, jika M·v = λ·v dengan v ≠ 0, apakah sebutan untuk skalar λ dan vektor v?",
            domain = Domain.MATEMATIKA,
            targetLevel = DepthLevel.L5,
            options = listOf(
                "Nilai Eigen (Eigenvalue) dan Vektor Eigen (Eigenvector)",
                "Determinan dan Invers Matriks",
                "Gradien dan Divergensi Medan",
                "Kernel dan Peta Ortogonal"
            ),
            correctIndex = 0,
            explanation = "Persamaan M·v = λ·v mendefinisikan vektor eigen v yang tidak berubah arah saat ditransformasikan, hanya diskalakan oleh nilai eigen λ.",
            conceptIdRef = "mat-eigen-nilai-vektor"
        ),

        // ==================== FISIKA ====================
        DiagnosticQuestion(
            id = "diag-fis-1",
            prompt = "Ketika memasukkan sendok logam ke dalam cangkir teh panas, ujung sendok terasa hangat setelah beberapa saat. Peristiwa perpindahan panas ini disebut:",
            domain = Domain.FISIKA,
            targetLevel = DepthLevel.L1,
            options = listOf("Konduksi", "Konveksi", "Radiasi", "Evaporasi"),
            correctIndex = 0,
            explanation = "Konduksi adalah perpindahan kalor melalui zat padat tanpa disertai perpindahan partikel zat tersebut.",
            conceptIdRef = "fis-suhu-kalor"
        ),
        DiagnosticQuestion(
            id = "diag-fis-2",
            prompt = "Sebuah mobil bergerak lurus dengan kecepatan konstan 20 m/s selama 15 detik. Berapakah jarak tempuhnya?",
            domain = Domain.FISIKA,
            targetLevel = DepthLevel.L2,
            options = listOf("300 meter", "200 meter", "150 meter", "35 meter"),
            correctIndex = 0,
            explanation = "Pada Gerak Lurus Beraturan (GLB): s = v · t = 20 m/s · 15 s = 300 meter.",
            conceptIdRef = "fis-gerak-lurus"
        ),
        DiagnosticQuestion(
            id = "diag-fis-3",
            prompt = "Balok bermassa 5 kg ditarik gaya mendatar 25 N di atas lantai licin tanpa gesekan. Berapakah percepatan balok (Hukum II Newton: a = F/m)?",
            domain = Domain.FISIKA,
            targetLevel = DepthLevel.L3,
            options = listOf("5 m/s²", "10 m/s²", "20 m/s²", "125 m/s²"),
            correctIndex = 0,
            explanation = "Berdasarkan Hukum II Newton: a = F / m = 25 N / 5 kg = 5 m/s².",
            conceptIdRef = "fis-newton"
        ),
        DiagnosticQuestion(
            id = "diag-fis-4",
            prompt = "Fluks magnetik yang menembus suatu kumparan berubah sebesar 0,4 Weber dalam waktu 0,1 detik. Berdasarkan Hukum Faraday (ε = -ΔΦ/Δt), berapa GGL induksi yang timbul?",
            domain = Domain.FISIKA,
            targetLevel = DepthLevel.L4,
            options = listOf("4 Volt", "0,04 Volt", "40 Volt", "0,4 Volt"),
            correctIndex = 0,
            explanation = "Besar GGL induksi |ε| = ΔΦ / Δt = 0,4 Wb / 0,1 s = 4 Volt.",
            conceptIdRef = "fis-induksi-faraday-lenz"
        ),
        DiagnosticQuestion(
            id = "diag-fis-5",
            prompt = "Dalam formulasi mekanika analitik, fungsi Lagrangian L didefinisikan sebagai selisih antara besaran fisis apa?",
            domain = Domain.FISIKA,
            targetLevel = DepthLevel.L5,
            options = listOf(
                "Energi Kinetik (T) dan Energi Potensial (V): L = T - V",
                "Energi Total (E) dan Entropi (S): L = E - TS",
                "Momentum (p) dan Posisi (q): L = p · q",
                "Medan Listrik (E) dan Medan Magnet (B): L = E - B"
            ),
            correctIndex = 0,
            explanation = "Lagrangian klasik adalah L = T - V (Energi Kinetik dikurangi Energi Potensial), yang mematuhi Prinsip Aksi Terkecil Hamilton.",
            conceptIdRef = "fis-mekanika-lagrangian-hamiltonian"
        ),

        // ==================== KIMIA ====================
        DiagnosticQuestion(
            id = "diag-kim-1",
            prompt = "Berdasarkan sifat keasaman, air perasan jeruk nipis terasa masam dan mengubah lakmus biru menjadi merah. Larutan ini bersifat:",
            domain = Domain.KIMIA,
            targetLevel = DepthLevel.L1,
            options = listOf("Asam (pH < 7)", "Basa (pH > 7)", "Netral (pH = 7)", "Logam"),
            correctIndex = 0,
            explanation = "Jeruk mengandung asam sitrat dengan pH < 7 yang mengubah kertas lakmus biru menjadi merah.",
            conceptIdRef = "kim-asam-basa-dasar"
        ),
        DiagnosticQuestion(
            id = "diag-kim-2",
            prompt = "Partikel subatomik yang bermuatan negatif dan bergerak mengitari inti atom disebut:",
            domain = Domain.KIMIA,
            targetLevel = DepthLevel.L2,
            options = listOf("Elektron", "Proton", "Neutron", "Positron"),
            correctIndex = 0,
            explanation = "Elektron bermuatan negatif (-1) dan berada pada kulit atom di luar inti proton dan neutron.",
            conceptIdRef = "kim-struktur-atom"
        ),
        DiagnosticQuestion(
            id = "diag-kim-3",
            prompt = "Massa molar air (H₂O) adalah 18 g/mol (Ar H=1, O=16). Jika terdapat 36 gram air murni, berapa jumlah mol air tersebut (n = m/Mr)?",
            domain = Domain.KIMIA,
            targetLevel = DepthLevel.L3,
            options = listOf("2 mol", "1 mol", "0,5 mol", "18 mol"),
            correctIndex = 0,
            explanation = "Jumlah mol n = massa / Mr = 36 g / 18 g/mol = 2 mol.",
            conceptIdRef = "kim-stoikiometri"
        ),
        DiagnosticQuestion(
            id = "diag-kim-4",
            prompt = "Jika suatu reaksi kimia memiliki laju reaksi v = k · [A]² · [B], berapakah orde total dari reaksi tersebut?",
            domain = Domain.KIMIA,
            targetLevel = DepthLevel.L4,
            options = listOf("3 (Orde Tiga)", "2 (Orde Dua)", "1 (Orde Satu)", "0 (Orde Nol)"),
            correctIndex = 0,
            explanation = "Orde reaksi total adalah penjumlahan eksponen konsentrasi: 2 (dari A) + 1 (dari B) = 3.",
            conceptIdRef = "kim-kinetika-arrhenius"
        ),
        DiagnosticQuestion(
            id = "diag-kim-5",
            prompt = "Mekanisme substitusi nukleofilik bimolekuler (SN2) pada senyawa alkil halida memiliki ciri khas mekanisme:",
            domain = Domain.KIMIA,
            targetLevel = DepthLevel.L5,
            options = listOf(
                "Satu tahap serempak (concerted) dengan inversi konfigurasi ruang (Walden inversion)",
                "Dua tahap melalui pembentukan zat antara karbokation planar",
                "Reaksi rantai radikal bebas dengan katalis cahaya",
                "Reaksi eliminasi yang menghasilkan ikatan rangkap dua"
            ),
            correctIndex = 0,
            explanation = "Reaksi SN2 terjadi secara serentak (serangan nukleofil dari arah belakang saat gugus pergi lepas), menyebabkan pembalikan konfigurasi ruang Walden.",
            conceptIdRef = "kim-organik-sn1-sn2-e1-e2"
        ),

        // ==================== BIOLOGI ====================
        DiagnosticQuestion(
            id = "diag-bio-1",
            prompt = "Dalam sebuah ekosistem sawah: Rumput → Belalang → Katak → Ular. Organisme yang berperan sebagai produsen adalah:",
            domain = Domain.BIOLOGI,
            targetLevel = DepthLevel.L1,
            options = listOf("Rumput", "Belalang", "Katak", "Ular"),
            correctIndex = 0,
            explanation = "Rumput adalah tumbuhan hijau yang memproduksi makanannya sendiri melalui fotosintesis sehingga berperan sebagai produsen.",
            conceptIdRef = "bio-rantai-makanan"
        ),
        DiagnosticQuestion(
            id = "diag-bio-2",
            prompt = "Organel sel tumbuhan yang mengandung klorofil dan berfungsi sebagai tempat terjadinya fotosintesis adalah:",
            domain = Domain.BIOLOGI,
            targetLevel = DepthLevel.L2,
            options = listOf("Kloroplas", "Mitokondria", "Ribosom", "Vakuola"),
            correctIndex = 0,
            explanation = "Kloroplas mengandung pigmen klorofil yang menangkap foton cahaya untuk fotosintesis.",
            conceptIdRef = "bio-fotosintesis"
        ),
        DiagnosticQuestion(
            id = "diag-bio-3",
            prompt = "Pada persilangan monohibrid kacang ercis bergalur murni (biji bulat BB ✕ biji keriput bb), seluruh keturunan F1 memiliki genotipe:",
            domain = Domain.BIOLOGI,
            targetLevel = DepthLevel.L3,
            options = listOf("Bb (Heterozigot, biji bulat)", "BB (Homozigot dominan)", "bb (Homozigot resesif)", "BBbb"),
            correctIndex = 0,
            explanation = "Gamet B dari induk 1 dan b dari induk 2 bersatu membentuk 100% genotipe Bb yang mengekspresikan fenotipe bulat dominan.",
            conceptIdRef = "bio-genetika-mendel"
        ),
        DiagnosticQuestion(
            id = "diag-bio-4",
            prompt = "Pada respirasi seluler aerobik, tahapan metabolik yang menghasilkan molekul ATP paling banyak melalui gradien proton kemiosmosis adalah:",
            domain = Domain.BIOLOGI,
            targetLevel = DepthLevel.L4,
            options = listOf(
                "Fosforilasi Oksidatif (Rantai Transpor Elektron)",
                "Glikolisis di Sitoplasma",
                "Dekarboksilasi Oksidatif",
                "Siklus Asam Sitrat (Krebs)"
            ),
            correctIndex = 0,
            explanation = "Rantai transpor elektron dan ATP sintase pada krista mitokondria menghasilkan sekitar 28-34 ATP per molekul glukosa.",
            conceptIdRef = "bio-metabolisme-energi-respirasi"
        ),
        DiagnosticQuestion(
            id = "diag-bio-5",
            prompt = "Teknologi penyuntingan genom presisi CRISPR-Cas9 menggunakan komponen molekuler pemandu untuk mencari sekuens DNA target berupa:",
            domain = Domain.BIOLOGI,
            targetLevel = DepthLevel.L5,
            options = listOf(
                "Single Guide RNA (sgRNA)",
                "Enzim Restriksi EcoRI",
                "Antibodi Monoklonal",
                "Plasmid Rekombinan Primer"
            ),
            correctIndex = 0,
            explanation = "Sistem CRISPR-Cas9 diarahkan oleh molekul RNA pemandu tunggal (sgRNA) yang berkomplemen dengan urutan target DNA genom.",
            conceptIdRef = "bio-rekayasa-genetika-crispr"
        )
    )

    fun evaluate(answers: Map<Int, Int>): DiagnosticResult {
        var correctTotal = 0
        val proficiencies = mutableListOf<DomainProficiency>()

        Domain.values().forEach { dom ->
            val domQuestions = questions.filter { it.domain == dom }
            var domCorrect = 0
            domQuestions.forEach { q ->
                val qIndex = questions.indexOf(q)
                if (answers[qIndex] == q.correctIndex) {
                    domCorrect++
                }
            }
            correctTotal += domCorrect

            val recommendedLevel = when (domCorrect) {
                5 -> DepthLevel.L5
                4 -> DepthLevel.L4
                3 -> DepthLevel.L3
                2 -> DepthLevel.L2
                else -> DepthLevel.L1
            }

            proficiencies.add(
                DomainProficiency(
                    domain = dom,
                    score = domCorrect,
                    total = domQuestions.size,
                    recommendedLevel = recommendedLevel
                )
            )
        }

        // Tentukan Level Umum Keseluruhan
        val overallLevel = when {
            correctTotal >= 17 -> DepthLevel.L5
            correctTotal >= 13 -> DepthLevel.L4
            correctTotal >= 9 -> DepthLevel.L3
            correctTotal >= 5 -> DepthLevel.L2
            else -> DepthLevel.L1
        }

        // Rekomendasi 4 konsep awal yang pas
        val recommendedConcepts = when (overallLevel) {
            DepthLevel.L5 -> listOf("mat-eigen-nilai-vektor", "fis-mekanika-lagrangian-hamiltonian", "kim-organik-sn1-sn2-e1-e2", "bio-rekayasa-genetika-crispr")
            DepthLevel.L4 -> listOf("mat-matriks-determinan", "fis-induksi-faraday-lenz", "kim-kinetika-arrhenius", "bio-metabolisme-energi-respirasi")
            DepthLevel.L3 -> listOf("mat-turunan-integral", "fis-newton", "kim-stoikiometri", "bio-genetika-mendel")
            DepthLevel.L2 -> listOf("mat-pythagoras", "fis-gerak-lurus", "kim-struktur-atom", "bio-fotosintesis")
            else -> listOf("mat-pecahan-rasio", "fis-suhu-kalor", "kim-asam-basa-dasar", "bio-rantai-makanan")
        }

        val advice = when (overallLevel) {
            DepthLevel.L5 -> "Kemampuan sains analitis Anda sangat tinggi di tingkat perguruan tinggi! Anda siap menjelajah pemodelan formal, kalkulus multivariabel, dan teknologi mutakhir."
            DepthLevel.L4 -> "Fondasi pemahaman matematika & sains tingkat menengah Anda sangat solid. Level 4 (Dasar Perguruan Tinggi) adalah tempat terbaik untuk mengasah ketajaman kuantitatif."
            DepthLevel.L3 -> "Anda memiliki pemahaman konsep SMA yang baik. Mulailah dari Level 3 untuk memperdalam model kalkulus dasar, hukum alam, dan reaksi kimia."
            DepthLevel.L2 -> "Pemahaman konsep sains kontekstual sehari-hari Anda siap untuk masuk ke perumusan rumus dan studi kasus teknik di Level 2."
            else -> "Langkah awal yang hebat! Mulailah dengan cerita, intuisi visual, dan eksperimen rumahan di Level 1 untuk membangun intuisi sains yang kokoh."
        }

        return DiagnosticResult(
            overallLevel = overallLevel,
            domainProficiencies = proficiencies,
            totalCorrect = correctTotal,
            totalQuestions = questions.size,
            recommendedConceptIds = recommendedConcepts,
            personalizedAdvice = advice
        )
    }
}

package com.example.data.curriculum

import com.example.data.model.CaseStudyData
import com.example.data.model.ConceptItem
import com.example.data.model.DepthLevel
import com.example.data.model.Domain
import com.example.data.model.FormulaCard
import com.example.data.model.HomeLabData
import com.example.data.model.LessonData
import com.example.data.model.QuizQuestion
import com.example.data.model.StoryPanel

object MathLevel1Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "mat-membilang",
            domain = Domain.MATEMATIKA,
            topic = "Bilangan & Operasi",
            title = "Membilang & Membandingkan",
            description = "Mengenal jumlah, urutan 1–20, serta konsep lebih banyak, lebih sedikit, dan sama dengan.",
            level = DepthLevel.L0,
            estMinutes = 7,
            prerequisites = emptyList()
        ),
        ConceptItem(
            id = "mat-fpb-kpk",
            domain = Domain.MATEMATIKA,
            topic = "Faktor & Kelipatan",
            title = "Faktor, Kelipatan, FPB & KPK",
            description = "Bilangan prima, faktorisasi prima, pembagian merata (FPB), dan keselarasan waktu periodik (KPK).",
            level = DepthLevel.L1,
            estMinutes = 12,
            prerequisites = listOf("mat-membilang")
        ),
        ConceptItem(
            id = "mat-desimal-persen",
            domain = Domain.MATEMATIKA,
            topic = "Pecahan & Desimal",
            title = "Pecahan Desimal & Persen",
            description = "Nilai tempat persepuluhan, perseratusan, persen (per seratus), dan konversi antar-bentuk bilangan.",
            level = DepthLevel.L1,
            estMinutes = 11,
            prerequisites = listOf("mat-membilang")
        ),
        ConceptItem(
            id = "mat-perbandingan-skala",
            domain = Domain.MATEMATIKA,
            topic = "Rasio & Skala",
            title = "Perbandingan & Skala Peta",
            description = "Konsep rasio dua besaran, perbandingan senilai, perbandingan berbalik nilai, dan membaca skala peta.",
            level = DepthLevel.L1,
            estMinutes = 13,
            prerequisites = listOf("mat-membilang")
        ),
        ConceptItem(
            id = "mat-satuan-ukuran",
            domain = Domain.MATEMATIKA,
            topic = "Pengukuran",
            title = "Satuan Ukuran, Waktu & Debit",
            description = "Tangga konversi metrik panjang (km-mm), massa (kg-mg), waktu, serta debit aliran volume per waktu.",
            level = DepthLevel.L1,
            estMinutes = 12,
            prerequisites = listOf("mat-membilang")
        ),
        ConceptItem(
            id = "mat-bangun-datar-ruang",
            domain = Domain.MATEMATIKA,
            topic = "Geometri Dasar",
            title = "Bangun Datar & Bangun Ruang Sederhana",
            description = "Keliling dan luas persegi, segitiga, lingkaran, serta volume kubus, balok, dan tabung.",
            level = DepthLevel.L1,
            estMinutes = 14,
            prerequisites = listOf("mat-membilang")
        ),
        ConceptItem(
            id = "mat-statistika-dasar",
            domain = Domain.MATEMATIKA,
            topic = "Statistika Dasar",
            title = "Statistika: Tabel, Diagram & Nilai Rata-rata",
            description = "Penyajian data tabel frekuensi, diagram batang, serta ukuran pemusatan mean, median, dan modus.",
            level = DepthLevel.L1,
            estMinutes = 11,
            prerequisites = listOf("mat-membilang")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "mat-membilang" -> membilangLesson
            "mat-fpb-kpk" -> fpbKpkLesson
            "mat-desimal-persen" -> desimalPersenLesson
            "mat-perbandingan-skala" -> perbandinganSkalaLesson
            "mat-satuan-ukuran" -> satuanUkuranLesson
            "mat-bangun-datar-ruang" -> bangunDatarRuangLesson
            "mat-statistika-dasar" -> statistikaDasarLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. LESSON: MEMBILANG & MEMBANDINGKAN (L0 — Penjelajah)
    // =========================================================================
    private val membilangLesson = LessonData(
        conceptId = "mat-membilang",
        level = DepthLevel.L0,
        storyPanels = listOf(
            StoryPanel(
                id = "pmb1",
                panelNumber = 1,
                title = "Menghitung Buah di Pasar",
                caption = "Kirana menemani Bu Ratna belanja ke pasar pagi. Ada begitu banyak buah warna-warni di kios Pak Hasan!",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ibu, aku ingin menghitung semua jeruk di keranjang itu! Satu, dua, tiga, empat...",
                sceneVisualEmoji = "🍊",
                sceneDescription = "Keranjang penuh jeruk segar di kios buah pasar tradisional."
            ),
            StoryPanel(
                id = "pmb2",
                panelNumber = 2,
                title = "Membandingkan Jumlah",
                caption = "Kirana melihat dua keranjang: satu berisi 5 apel merah dan satunya berisi 8 apel hijau.",
                dialogueSpeaker = "Bu Ratna",
                dialogueText = "Coba perhatikan, Kirana. Keranjang mana yang isinya LEBIH BANYAK? Yang 5 buah atau yang 8 buah?",
                sceneVisualEmoji = "🍎",
                sceneDescription = "Dua keranjang berdampingan — apel merah lebih sedikit dari apel hijau."
            ),
            StoryPanel(
                id = "pmb3",
                panelNumber = 3,
                title = "Garis Bilangan Ajaib",
                caption = "Kakek menggambar deretan angka 0 sampai 20 di tanah dengan tongkatnya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ini namanya garis bilangan! Semakin ke kanan, angkanya semakin besar. Angka 8 ada di sebelah kanan angka 5, jadi 8 LEBIH BESAR dari 5.",
                sceneVisualEmoji = "📏",
                sceneDescription = "Garis bilangan sederhana dari 0 sampai 20 di tanah berpasir."
            ),
            StoryPanel(
                id = "pmb4",
                panelNumber = 4,
                title = "Sama Banyak!",
                caption = "Kirana membagikan 6 permen kepada Dimas dan dirinya, masing-masing 3 buah.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Aku punya 3, Dimas punya 3. Jumlahnya SAMA! Kalau dijumlah jadi 3 + 3 = 6 permen!",
                sceneVisualEmoji = "🍬",
                sceneDescription = "Dua genggaman permen dengan jumlah yang sama."
            )
        ),
        intuitionTitle = "Angka Adalah Bahasa untuk Menghitung",
        intuitionBody = "Bilangan adalah cara manusia menghitung jumlah benda di sekitar kita.\n\n" +
                "• Membilang: Menyebut satu per satu dari 1, 2, 3, ... berurutan.\n" +
                "• Membandingkan: Menentukan mana yang lebih banyak (>), lebih sedikit (<), atau sama (=).\n" +
                "• Garis bilangan: Deretan angka teratur yang membantu kita melihat urutan dan posisi bilangan.\n\n" +
                "Empat operasi dasar:\n" +
                "• Penjumlahan (+): Menggabungkan dua kelompok benda.\n" +
                "• Pengurangan (−): Mengambil sebagian dari kelompok benda.\n" +
                "• Perkalian (×): Penjumlahan berulang (3 × 4 = 4 + 4 + 4).\n" +
                "• Pembagian (÷): Membagi rata ke dalam kelompok sama besar.",
        intuitionPoints = listOf(
            "Angka 0 berarti 'tidak ada satupun'. Nol adalah bilangan terkecil di garis bilangan cacah.",
            "Penjumlahan bersifat komutatif: 3 + 5 sama dengan 5 + 3. Hasilnya selalu sama!",
            "Perkalian adalah cara cepat menghitung penjumlahan berulang."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "a + b",
                equation = "a + b = b + a",
                meaning = "Sifat komutatif penjumlahan — urutan tidak mengubah hasil.",
                units = "Bilangan cacah",
                applicationNote = "Contoh: 3 + 5 = 5 + 3 = 8."
            ),
            FormulaCard(
                symbol = "a × b",
                equation = "a \\times b = b \\times a",
                meaning = "Sifat komutatif perkalian — urutan tidak mengubah hasil.",
                units = "Bilangan cacah",
                applicationNote = "Contoh: 4 × 3 = 3 × 4 = 12."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sistem Kasir & Barcode Supermarket Indonesia",
            context = "Kasir di Indomaret dan Alfamart memindai barcode setiap produk. Komputer menghitung jumlah barang dan total harga secara otomatis.",
            engineeringProblem = "Bagaimana komputer kasir bisa menghitung total belanjaan ratusan barang tanpa salah?",
            physicalConceptUsed = "Komputer menggunakan operasi penjumlahan dan perkalian bilangan ribuan kali per detik untuk menjumlahkan harga semua barang.",
            mathematicalModel = "Total = (Harga₁ × Jumlah₁) + (Harga₂ × Jumlah₂) + ... untuk semua item belanjaan.",
            realWorldImpact = "Sistem ini mengurangi kesalahan hitung manusia dan mempercepat antrian kasir dari 5 menit menjadi 30 detik per transaksi.",
            relatedCareers = listOf("Programmer Sistem POS (Point of Sale)", "Akuntan Ritel", "Analis Data Penjualan"),
            verifiedSource = "Sistem POS Indomaret & Alfamart Indonesia."
        ),
        homeLab = HomeLabData(
            title = "Menghitung dan Mengelompokkan Benda di Rumah",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Kancing baju beraneka warna (atau tutup botol, kelereng, biji-bijian)",
                "3 cangkir atau mangkuk kecil",
                "Kertas dan pensil"
            ),
            steps = listOf(
                "Langkah 1: Kumpulkan 20 kancing baju (atau benda kecil lain) dari kotak jahit.",
                "Langkah 2: Hitung jumlah totalnya satu per satu. Tulis angkanya di kertas.",
                "Langkah 3: Pisahkan berdasarkan warna ke mangkuk berbeda. Hitung masing-masing mangkuk.",
                "Langkah 4: Bandingkan: mangkuk mana yang paling banyak? Paling sedikit? Ada yang sama?"
            ),
            observationGoal = "Melatih kemampuan membilang, mengelompokkan, dan membandingkan jumlah secara konkret.",
            connectionToSimulation = "Bayangkan kancing-kancing ini seperti angka-angka di garis bilangan!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-bil-1",
                prompt = "Manakah yang LEBIH BESAR: 7 atau 4?",
                type = "multiple_choice",
                options = listOf("7", "4", "Sama besar", "Tidak bisa ditentukan"),
                correctAnswer = "7",
                hints = listOf(
                    "Bayangkan garis bilangan: 0, 1, 2, 3, 4, 5, 6, 7, ...",
                    "Angka yang lebih ke kanan selalu lebih besar."
                ),
                explanation = "Di garis bilangan, angka 7 berada di sebelah kanan angka 4, sehingga 7 > 4 (7 lebih besar dari 4).",
                misconception = "Mengira bilangan yang disebutkan lebih dulu selalu lebih besar."
            ),
            QuizQuestion(
                id = "q-bil-2",
                prompt = "Berapakah hasil dari 3 + 5?",
                type = "numeric",
                correctAnswer = "8",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Mulai dari angka 3, lalu lompat 5 langkah ke kanan di garis bilangan.",
                    "3 → 4 → 5 → 6 → 7 → 8"
                ),
                explanation = "3 + 5 = 8. Kita mulai dari 3 dan menghitung 5 langkah ke depan.",
                misconception = "Lupa menambahkan angka awal."
            )
        )
    )

    // =========================================================================
    // 2. LESSON: FAKTOR, KELIPATAN, FPB & KPK (L1 — Dasar)
    // =========================================================================
    private val fpbKpkLesson = LessonData(
        conceptId = "mat-fpb-kpk",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pfk1",
                panelNumber = 1,
                title = "Membagikan Kue Ultah Merata",
                caption = "Kirana memiliki 12 kue bolu cokelat dan 18 onde-onde manis. Ia ingin memasukkannya ke dalam kotak bingkisan hadiah untuk teman-temannya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ibu, aku ingin setiap kotak berisi jumlah kue bolu dan onde-onde yang SAMA PERSIS tanpa ada satu pun yang tersisa. Berapa kotak terbanyak yang bisa aku buat?",
                sceneVisualEmoji = "🧁",
                sceneDescription = "Piring penuh kue bolu dan onde-onde siap dikemas ke dalam kotak bingkisan."
            ),
            StoryPanel(
                id = "pfk2",
                panelNumber = 2,
                title = "FPB Sang Pembagi Adil",
                caption = "Bu Ratna tersenyum dan mengambil kertas untuk menghitung faktor bilangan.",
                dialogueSpeaker = "Bu Ratna",
                dialogueText = "Itulah gunanya FPB (Faktor Persekutuan Terbesar)! Faktor dari 12 adalah 1, 2, 3, 4, 6, 12. Faktor dari 18 adalah 1, 2, 3, 6, 9, 18. Angka pembagi terbesar yang sama adalah 6! Jadi kamu bisa membuat tepat 6 kotak!",
                sceneVisualEmoji = "📦",
                sceneDescription = "6 kotak bingkisan masing-masing berisi 2 bolu dan 3 onde-onde secara pas dan adil."
            ),
            StoryPanel(
                id = "pfk3",
                panelNumber = 3,
                title = "Lampu Mercusuar Berkedip Bersama",
                caption = "Malam hari di dermaga pelabuhan, Dimas mengamati dua lampu suar navigasi kapal laut.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kakek, lampu merah menyala setiap 4 detik, dan lampu hijau menyala setiap 6 detik. Kapan kedua lampu itu akan menyala KELAP-KELIP BERSAMAAN?",
                sceneVisualEmoji = "🚨",
                sceneDescription = "Dua lampu mercusuar merah dan hijau di tepi laut menyala pada interval waktu berbeda."
            ),
            StoryPanel(
                id = "pfk4",
                panelNumber = 4,
                title = "KPK: Pertemuan Periode Waktu",
                caption = "Kakek menunjuk detik ke-12 pada jam tangan antiknya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Lampu merah menyala di detik 4, 8, 12, 16... Lampu hijau menyala di detik 6, 12, 18... Keduanya bertemu di detik ke-12! Angka 12 adalah KPK (Kelipatan Persekutuan Terkecil) dari 4 dan 6!",
                sceneVisualEmoji = "⏱️",
                sceneDescription = "Jarum detik jam tangan berdetak tepat di angka 12 saat kedua lampu menyala serentak."
            )
        ),
        intuitionTitle = "Pohon Faktor, Bilangan Prima & Harmoni Kelipatan",
        intuitionBody = "Faktor dan kelipatan adalah kunci memahami struktur bilangan bulat.\n\n" +
                "1. Bilangan Prima:\n" +
                "   Bilangan bulat lebih dari 1 yang HANYA memiliki 2 faktor pembagi: angka 1 dan dirinya sendiri (2, 3, 5, 7, 11, 13, 17, 19, ...). Angka 2 adalah satu-satunya bilangan prima yang genap!\n\n" +
                "2. FPB (Faktor Persekutuan Terbesar):\n" +
                "   • Digunakan untuk masalah PEMBAGIAN MERATA ke dalam kelompok terbanyak tanpa sisa.\n" +
                "   • Cara Pohon Faktor: Ambil faktor prima yang SAMA dengan pangkat TERKECIL.\n\n" +
                "3. KPK (Kelipatan Persekutuan Terkecil):\n" +
                "   • Digunakan untuk masalah KESELARASAN WAKTU PERIODIK (jadwal ronda bersama, lampu berkedip bareng, rotasi roda gigi).\n" +
                "   • Cara Pohon Faktor: Ambil SEMUA faktor prima, dan untuk faktor yang sama pilih pangkat TERBESAR.",
        intuitionPoints = listOf(
            "Jika dua bilangan dikalikan, hasilnya selalu sama dengan hasil kali FPB dan KPK-nya: a × b = FPB(a, b) × KPK(a, b).",
            "FPB dari dua bilangan prima yang berbeda selalu sama dengan 1 (contoh: FPB 7 dan 11 = 1).",
            "KPK dari dua bilangan prima adalah hasil kali langsung keduanya (contoh: KPK 3 dan 5 = 15)."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Hubungan FPB-KPK}",
                equation = "a \\times b = \\text{FPB}(a, b) \\times \\text{KPK}(a, b)",
                meaning = "Hasil kali dua bilangan sama dengan perkalian FPB dan KPK kedua bilangan tersebut.",
                units = "Bilangan bulat",
                applicationNote = "Jika tahu FPB(12, 18) = 6, maka KPK = (12 × 18) / 6 = 216 / 6 = 36."
            ),
            FormulaCard(
                symbol = "\\text{Faktorisasi Prima}",
                equation = "n = p_1^{a_1} \\times p_2^{a_2} \\times \\dots \\times p_k^{a_k}",
                meaning = "Teorema Fundamental Aritmetika: setiap bilangan dapat diurai unik menjadi perkalian prima.",
                units = "Perkalian faktor prima",
                applicationNote = "Contoh: 12 = 2² × 3 , 18 = 2 × 3²."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sinkronisasi Lampu Lalu Lintas Cerdas (ATCS) Simpang Lima Semarang",
            context = "Dinas Perhubungan Kota Semarang mengatur durasi siklus lampu hijau dan merah pada 5 persimpangan jalan padat di kawasan Simpang Lima.",
            engineeringProblem = "Jika siklus lampu jalan tidak disinkronkan, kendaraan yang baru jalan di satu lampu akan langsung terkena lampu merah di simpang berikutnya, menimbulkan kemacetan mengular.",
            physicalConceptUsed = "Prinsip KPK (Kelipatan Persekutuan Terkecil) waktu siklus untuk menciptakan gelombang hijau (Green Wave Coordination).",
            mathematicalModel = "Insinyur lalu lintas menyetel durasi siklus persimpangan utama pada kelipatan persekutuan terkecil waktu tempuh rata-rata gelombang kendaraan (siklus 60 detik, 90 detik, dan 120 detik dengan KPK 360 detik).",
            realWorldImpact = "Mengurangi waktu tunggu antrean kendaraan di Simpang Lima hingga 42% dan menurunkan emisi gas buang karbon knalpot secara signifikan.",
            relatedCareers = listOf("Insinyur Sistem Transportasi Cerdas", "Programmer Smart City ATCS", "Analis Manajemen Lalu Lintas"),
            verifiedSource = "Dinas Perhubungan Kota Semarang / Sistem ATCS Kementerian Perhubungan RI."
        ),
        homeLab = HomeLabData(
            title = "Membagi Permen & Biskuit Menggunakan Konsep FPB",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "12 butir permen (atau kelereng)",
                "8 keping biskuit (atau kancing baju)",
                "Piring kecil atau mangkuk plastik"
            ),
            steps = listOf(
                "Langkah 1: Siapkan 12 permen dan 8 biskuit di atas meja.",
                "Langkah 2: Cari faktor dari 12: 1, 2, 3, 4, 6, 12. Cari faktor dari 8: 1, 2, 4, 8.",
                "Langkah 3: Temukan faktor persekutuan terbesar (FPB): angka terbesar yang ada di kedua daftar adalah 4!",
                "Langkah 4: Siapkan 4 piring kecil. Bagi 12 permen ke 4 piring (masing-masing 3 permen).",
                "Langkah 5: Bagi 8 biskuit ke 4 piring (masing-masing 2 biskuit). Amati: semua piring memiliki isi yang sama rata tanpa ada sisa satu pun!"
            ),
            observationGoal = "Membuktikan secara fisik bahwa FPB menentukan jumlah wadah maksimum untuk pembagian merata tanpa sisa.",
            connectionToSimulation = "Bandingkan pohon faktor ini dengan diagram interaktif bilangan di simulator!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-fpb-1",
                prompt = "Berapakah Kelipatan Persekutuan Terkecil (KPK) dari angka 4 dan 6?",
                type = "numeric",
                correctAnswer = "12",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Kelipatan 4: 4, 8, 12, 16, 20...",
                    "Kelipatan 6: 6, 12, 18, 24...",
                    "Angka kelipatan pertama yang SAMA adalah...?"
                ),
                explanation = "Kelipatan 4 adalah 4, 8, 12, 16... dan kelipatan 6 adalah 6, 12, 18... Kelipatan terkecil yang sama dari keduanya adalah 12.",
                misconception = "Mengalikan 4 × 6 = 24 tanpa mencari kelipatan yang paling kecil (12)."
            ),
            QuizQuestion(
                id = "q-fpb-2",
                prompt = "Manakah di antara bilangan berikut yang merupakan BILANGAN PRIMA?",
                type = "multiple_choice",
                options = listOf("9", "13", "15", "21"),
                correctAnswer = "13",
                hints = listOf(
                    "Bilangan prima hanya bisa dibagi oleh angka 1 dan dirinya sendiri.",
                    "9 = 3 × 3, 15 = 3 × 5, 21 = 3 × 7."
                ),
                explanation = "13 adalah bilangan prima karena hanya memiliki dua faktor pembagi yaitu 1 dan 13. Angka 9, 15, dan 21 adalah bilangan komposit yang bisa dibagi 3.",
                misconception = "Mengira semua bilangan ganjil otomatis adalah bilangan prima."
            )
        )
    )

    // =========================================================================
    // 3. LESSON: PECAHAN DESIMAL & PERSEN (L1 — Dasar)
    // =========================================================================
    private val desimalPersenLesson = LessonData(
        conceptId = "mat-desimal-persen",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pdp1",
                panelNumber = 1,
                title = "Diskon Cuci Gudang Toko Sepatu",
                caption = "Kirana dan Bu Ratna melihat papan diskon besar warna merah di etalase toko sepatu: 'DISKON 50% + 20%'!",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ibu! 50% ditambah 20% berarti 70% kan? Mengapa kasirnya bilang potongan harganya dihitung bertahap?",
                sceneVisualEmoji = "🏷️",
                sceneDescription = "Etalase toko dengan spanduk diskon bertuliskan persentase potongan harga."
            ),
            StoryPanel(
                id = "pdp2",
                panelNumber = 2,
                title = "Persen Adalah Per Seratus",
                caption = "Kakek menggambar kotak berpetak 10 baris dan 10 kolom (total 100 petak kecil) di kertas bergaris.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kata 'persen' artinya 'per seratus' (%). 50% berarti 50 kotak dari 100 kotak diarsir, persis bernilai setengah (1/2) atau dalam desimal ditulis 0,50!",
                sceneVisualEmoji = "🟩",
                sceneDescription = "Kotak persegi 100 petak diarsir separuh menunjukkan nilai 50% atau 0,5."
            ),
            StoryPanel(
                id = "pdp3",
                panelNumber = 3,
                title = "Nilai Tempat di Belakang Koma",
                caption = "Dimas memperlihatkan pita meteran gulung yang memiliki garis milimeter.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Angka di belakang koma menunjukkan pecahan desimal: 1 angka di belakang koma adalah persepuluhan (0,1 = 1/10), 2 angka adalah perseratusan (0,01 = 1/100)!",
                sceneVisualEmoji = "📏",
                sceneDescription = "Pita meteran memperlihatkan skala centimeter dan milimeter desimal."
            ),
            StoryPanel(
                id = "pdp4",
                panelNumber = 4,
                title = "Tiga Wajah Satu Nilai",
                caption = "Kirana tersenyum menyadari pecahan, desimal, dan persen hanyalah 3 cara berbeda menuliskan nilai yang sama.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Aha! 1/4 bagian kue = 0,25 bagian kue = 25% kue! Semuanya bernilai sama persis!",
                sceneVisualEmoji = "🍰",
                sceneDescription = "Satu potong kue dari 4 potong dihubungkan dengan angka 1/4, 0,25, dan 25%."
            )
        ),
        intuitionTitle = "Tiga Wajah Nilai Pecahan: Biasa, Desimal & Persen",
        intuitionBody = "Pecahan desimal dan persen adalah bentuk lain dari pecahan untuk menyatakan bagian dari suatu keseluruhan.\n\n" +
                "1. Nilai Tempat Desimal:\n" +
                "   • Angka di kiri tanda koma: satuan, puluhan, ratusan.\n" +
                "   • Angka pertama di kanan koma: persepuluhan (1/10).\n" +
                "   • Angka kedua di kanan koma: perseratusan (1/100).\n" +
                "   • Angka ketiga di kanan koma: perseribuan (1/1000).\n\n" +
                "2. Konsep Persen (%):\n" +
                "   • Persen berasal dari bahasa Latin per centum (per seratus).\n" +
                "   • P% = P / 100 (contoh: 25% = 25/100 = 1/4 = 0,25).\n\n" +
                "3. Jembatan Konversi:\n" +
                "   • Pecahan ke Desimal: Bagi pembilang dengan penyebut (1 ÷ 2 = 0,5).\n" +
                "   • Desimal ke Persen: Kalikan dengan 100% (0,75 × 100% = 75%).\n" +
                "   • Persen ke Pecahan Biasa: Jadikan per 100 lalu sederhanakan (40% = 40/100 = 2/5).",
        intuitionPoints = listOf(
            "Menambah angka nol di ujung paling kanan desimal tidak mengubah nilainya (0,5 = 0,50 = 0,500).",
            "Saat menjumlahkan atau mengurangkan bilangan desimal, tanda koma HARUS diluruskan vertikal sejajar.",
            "Diskon bertahap 50% + 20% BUKAN 70%, melainkan harga dipotong 50% dulu, lalu sisa harganya dipotong lagi 20% (potongan riil adalah 60%)."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "P\\%",
                equation = "P\\% = \\frac{P}{100} = 0{,}01 \\times P",
                meaning = "Definisi persentase sebagai pecahan per seratus.",
                units = "persen (%)",
                applicationNote = "Contoh: 15% dari Rp 100.000 = (15/100) × 100.000 = Rp 15.000."
            ),
            FormulaCard(
                symbol = "\\text{Harga Akhir Diskon}",
                equation = "\\text{Harga Akhir} = \\text{Harga Awal} \\times (1 - d\\%)",
                meaning = "Menghitung harga barang setelah dipotong diskon d%.",
                units = "Rupiah (Rp)",
                applicationNote = "Baju Rp 200.000 diskon 30%: Harga Akhir = 200.000 × (1 - 0,30) = 200.000 × 0,70 = Rp 140.000."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Penerapan PPN 11% & Sistem Pembayaran Pajak Digital Tokopedia / Shopee",
            context = "Setiap transaksi belanja online di platform marketplace Indonesia dikenakan Pajak Pertambahan Nilai (PPN) resmi sebesar 11% sesuai UU Harmonisasi Perpajakan.",
            engineeringProblem = "Server e-commerce memproses jutaan transaksi per detik dengan nominal harga bervariasi ganjil. Bagaimana menghitung potongan PPN 11% dengan pembulatan rupiah yang sah secara hukum?",
            physicalConceptUsed = "Algoritma aritmatika desimal presisi tinggi (Fixed-Point Decimal Arithmetic) untuk menghindari galat pembulatan floating point komputer.",
            mathematicalModel = "Total Bayar = Subtotal + (Subtotal × 0,11). Jika barang berharga Rp 45.000, maka PPN = 45.000 × 0,11 = Rp 4.950, sehingga total bayar Rp 49.950.",
            realWorldImpact = "Menjamin penerimaan kas negara senilai ratusan triliun rupiah per tahun untuk pembangunan jalan, jembatan, dan subsidi pendidikan BOS tanpa selisih 1 rupiah pun.",
            relatedCareers = listOf("Software Engineer Sistem Pembayaran", "Konsultan Pajak Digital", "Akuntan Forensik FinTech"),
            verifiedSource = "Direktorat Jenderal Pajak (DJP) Kementerian Keuangan RI."
        ),
        homeLab = HomeLabData(
            title = "Membuktikan Nilai Persen dengan Papan 100 Kotak",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 lembar kertas kotak-kotak matematika (kertas milimeter/buku strimin)",
                "Pensil warna atau spidol",
                "Penggaris"
            ),
            steps = listOf(
                "Langkah 1: Gambar kotak besar berukuran 10 cm × 10 cm, bagi menjadi 100 kotak kecil sama besar (10 baris × 10 kolom).",
                "Langkah 2: Warnai 25 kotak dengan pensil merah. Hitung: 25 dari 100 kotak = 25/100 = 1/4 bagian = 25% = 0,25.",
                "Langkah 3: Warnai lagi 50 kotak lain dengan pensil biru. Hitung: 50 kotak = 50% = separuh penuh = 0,5.",
                "Langkah 4: Hitung sisa kotak yang belum diwarnai: 100 - (25 + 50) = 25 kotak (25%).",
                "Langkah 5: Buktikan bahwa total semua bagian selalu berjumlah 100% atau 1,0 utuh!"
            ),
            observationGoal = "Memahami secara visual bahwa desimal dan persen adalah representasi grafis bagian dari 100 petak utuh.",
            connectionToSimulation = "Bandingkan arsiran kotak ini dengan simulator pecahan interaktif!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-des-1",
                prompt = "Bentuk pecahan desimal dari pecahan biasa 3/4 adalah...",
                type = "multiple_choice",
                options = listOf("0,25", "0,50", "0,75", "0,34"),
                correctAnswer = "0,75",
                hints = listOf(
                    "Bagi angka 3 dengan angka 4 (3 ÷ 4).",
                    "Atau jadikan penyebutnya per seratus: 3/4 = (3 × 25) / (4 × 25) = 75/100."
                ),
                explanation = "3/4 sama dengan 75/100, yang dalam bentuk pecahan desimal ditulis sebagai 0,75.",
                misconception = "Menulis langsung angka pembilang dan penyebut menjadi 0,34."
            ),
            QuizQuestion(
                id = "q-des-2",
                prompt = "Sebuah baju seharga Rp 100.000 mendapat diskon sebesar 20%. Berapakah uang yang harus dibayarkan?",
                type = "numeric",
                correctAnswer = "80000",
                tolerance = 100f,
                unit = "Rupiah",
                hints = listOf(
                    "Hitung potongan diskon: 20% dari 100.000 = (20/100) × 100.000 = Rp 20.000.",
                    "Kurangkan harga awal dengan diskon: 100.000 - 20.000 = ...?"
                ),
                explanation = "Potongan diskon = 20% × 100.000 = Rp 20.000. Harga yang harus dibayar = Rp 100.000 - Rp 20.000 = Rp 80.000.",
                misconception = "Mengira harga akhirnya adalah Rp 20.000 (menyamakan harga akhir dengan besaran potongan diskon)."
            )
        )
    )

    // =========================================================================
    // 4. LESSON: PERBANDINGAN & SKALA PETA (L1 — Dasar)
    // =========================================================================
    private val perbandinganSkalaLesson = LessonData(
        conceptId = "mat-perbandingan-skala",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pps1",
                panelNumber = 1,
                title = "Membuka Atlas Peta Indonesia",
                caption = "Kirana dan Kakek membuka lembaran peta Pulau Jawa di buku Atlas. Di pojok bawah tertulis angka 'Skala 1 : 1.000.000'.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kakek, jarak kota Jakarta ke Bandung di peta ini hanya 15 centimeter dengan penggarisku! Mengapa aslinya kita butuh berjam-jam naik mobil?",
                sceneVisualEmoji = "🗺️",
                sceneDescription = "Kirana mengukur jarak dua kota pada peta pulau Jawa menggunakan penggaris."
            ),
            StoryPanel(
                id = "pps2",
                panelNumber = 2,
                title = "Kunci Rahasia Skala Peta",
                caption = "Kakek menjelaskan arti angka perbandingan skala pada peta.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Skala 1 : 1.000.000 artinya setiap 1 cm di peta mewakili 1.000.000 cm di bumi nyata! Karena 100.000 cm = 1 km, maka 1 cm di peta mewakili 10 km jarak jalan tol sesungguhnya!",
                sceneVisualEmoji = "🔍",
                sceneDescription = "Diagram perbesaran perbandingan 1 cm di kertas dengan bentang 10 km di daratan nyata."
            ),
            StoryPanel(
                id = "pps3",
                panelNumber = 3,
                title = "Bensin vs Jarak (Perbandingan Senilai)",
                caption = "Dimas menghitung konsumsi bahan bakar mobil keluarga saat berhenti di SPBU.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika 1 liter bensin bisa menempuh 10 km, maka 5 liter bensin bisa menempuh 50 km! Semakin banyak bensin, semakin jauh jaraknya. Ini adalah Perbandingan Senilai!",
                sceneVisualEmoji = "⛽",
                sceneDescription = "Pengisian bensin di SPBU mengilustrasikan perbandingan senilai volume dan jarak."
            ),
            StoryPanel(
                id = "pps4",
                panelNumber = 4,
                title = "Tukang Bangunan (Perbandingan Berbalik Nilai)",
                caption = "Pak Hasan merenovasi pagar rumah dan menjelaskan waktu pengerjaan.",
                dialogueSpeaker = "Pak Hasan",
                dialogueText = "Tetapi jika 2 pekerja butuh 6 hari membuat pagar, maka 4 pekerja hanya butuh 3 hari! Semakin BANYAK pekerjanya, waktu yang dibutuhkan justru semakin SEDIKIT! Ini Perbandingan Berbalik Nilai!",
                sceneVisualEmoji = "👷",
                sceneDescription = "Empat pekerja bangunan bekerja sama membuat pekerjaan selesai dua kali lebih cepat."
            )
        ),
        intuitionTitle = "Rasio Dua Besaran: Skala, Senilai & Berbalik Nilai",
        intuitionBody = "Perbandingan (rasio) adalah hubungan matematis antara dua besaran yang sejenis.\n\n" +
                "1. Skala Peta & Gambar Miniatur:\n" +
                "   • Skala = Jarak pada Peta / Jarak Sebenarnya (dalam satuan cm yang sama).\n" +
                "   • Contoh: Skala 1 : 500.000 artinya 1 cm di peta = 500.000 cm = 5 km di lapangan.\n\n" +
                "2. Perbandingan Senilai (Direct Proportion):\n" +
                "   • Terjadi ketika pertambahan nilai satu besaran menyebabkan besaran lain ikut BERTAMBAH secara proporsional.\n" +
                "   • Rumus: a₁ / b₁ = a₂ / b₂ (atau a₁ × b₂ = a₂ × b₁).\n" +
                "   • Contoh: Banyak barang vs total harga, liter bensin vs jarak tempuh.\n\n" +
                "3. Perbandingan Berbalik Nilai (Inverse Proportion):\n" +
                "   • Terjadi ketika pertambahan nilai satu besaran menyebabkan besaran lain MENURUN.\n" +
                "   • Rumus: a₁ × b₁ = a₂ × b₂ (hasil kali kedua variabel selalu konstan).\n" +
                "   • Contoh: Kecepatan kendaraan vs waktu tempuh, jumlah pekerja vs lama hari penyelesaian proyek.",
        intuitionPoints = listOf(
            "Sebelum menghitung skala, satuan jarak sebenarnya (km atau meter) WAJIB diubah dulu ke centimeter (cm): 1 km = 100.000 cm.",
            "Pada perbandingan senilai, grafik hubungannya berupa garis lurus menanjak melewati titik asal (0,0).",
            "Pada perbandingan berbalik nilai, grafiknya melengkung hiperbolik turun mendekati sumbu."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "S",
                equation = "S = \\frac{J_p}{J_s}",
                meaning = "Skala adalah perbandingan jarak peta (Jp) terhadap jarak sebenarnya (Js) dalam satuan cm.",
                units = "Rasio murni (contoh: 1 : 250.000)",
                applicationNote = "Jarak sebenarnya Js = Jp / S = Jp × faktor skala."
            ),
            FormulaCard(
                symbol = "\\text{Senilai}",
                equation = "\\frac{a_1}{b_1} = \\frac{a_2}{b_2} \\implies a_1 \\cdot b_2 = a_2 \\cdot b_1",
                meaning = "Perbandingan senilai: perkalian silang bernilai sama.",
                units = "Proporsi",
                applicationNote = "3 buku = Rp 15.000, maka 7 buku = (7/3) × 15.000 = Rp 35.000."
            ),
            FormulaCard(
                symbol = "\\text{Berbalik Nilai}",
                equation = "a_1 \\cdot b_1 = a_2 \\cdot b_2 \\implies b_2 = \\frac{a_1 \\cdot b_1}{a_2}",
                meaning = "Perbandingan berbalik nilai: hasil kali kedua variabel selalu tetap.",
                units = "Invers proporsi",
                applicationNote = "Kecepatan 60 km/jam butuh 2 jam (hasil kali 120), jika kecepatan 80 km/jam butuh 120/80 = 1,5 jam."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemetaan Digital Geospasial Pembangunan Jalan Tol Trans-Sumatera",
            context = "Badan Informasi Geospasial (BIG) dan PT Hutama Karya memetakan bentang lahan hutan dan bukit sepanjang 2.800 km untuk trase Jalan Tol Trans-Sumatera.",
            engineeringProblem = "Bagaimana mengubah foto udara satelit beresolusi tinggi menjadi denah teknik konstruksi pembebasan lahan dengan akurasi sentimeter?",
            physicalConceptUsed = "Prinsip skala ortofoto dan perbandingan trigonometrik fotogrametri udara.",
            mathematicalModel = "Peta ortofoto skala 1 : 5.000 dikalibrasi dengan Ground Control Point (GCP) GPS geodetik: 1 cm di peta digital mewakili tepat 50 meter batas kepemilikan tanah warga di darat.",
            realWorldImpact = "Mencegah sengketa tanah batas kepemilikan dan mempercepat pembangunan jalan tol yang memangkas waktu logistik antar-provinsi di Sumatera hingga 50%.",
            relatedCareers = listOf("Surveyor Geodesi & Kartografer", "Ahli Sistem Informasi Geografis (SIG)", "Insinyur Perencanaan Wilayah"),
            verifiedSource = "Badan Informasi Geospasial (BIG) RI & PT Hutama Karya (Persero)."
        ),
        homeLab = HomeLabData(
            title = "Membuat Denah Kamar Tidur Berdasarkan Skala 1 : 50",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Pita meteran gulung atau penggaris panjang 30 cm",
                "Kertas HVS putih dan pensil",
                "Penghapus"
            ),
            steps = listOf(
                "Langkah 1: Gunakan meteran untuk mengukur panjang dan lebar kamar tidurmu (misalnya: panjang 3 meter = 300 cm, lebar 2 meter = 200 cm).",
                "Langkah 2: Tentukan skala 1 : 50 (artinya setiap 50 cm di kamar digambar sebagai 1 cm di kertas).",
                "Langkah 3: Hitung ukuran di kertas: Panjang gambar = 300 ÷ 50 = 6 cm. Lebar gambar = 200 ÷ 50 = 4 cm.",
                "Langkah 4: Gambar persegi panjang 6 cm × 4 cm di kertas menggunakan penggaris.",
                "Langkah 5: Ukur kasur dan mejamu, konversikan dengan membaginya 50, lalu gambarkan posisinya di dalam denah kamar!"
            ),
            observationGoal = "Memahami penerapan nyata skala reduksi ukuran dunia nyata ke lembar kertas gambar teknik.",
            connectionToSimulation = "Bandingkan skala denah kamarmu dengan peta digital interaktif!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-skala-1",
                prompt = "Pada peta dengan skala 1 : 200.000, jarak antara Kota A dan Kota B adalah 5 cm. Berapakah jarak sebenarnya antara kedua kota tersebut?",
                type = "numeric",
                correctAnswer = "10",
                tolerance = 0.1f,
                unit = "km",
                hints = listOf(
                    "Jarak sebenarnya = 5 cm × 200.000 = 1.000.000 cm.",
                    "Ubah centimeter ke kilometer: bagi dengan 100.000.",
                    "1.000.000 ÷ 100.000 = ... km."
                ),
                explanation = "Jarak sebenarnya = 5 cm × 200.000 = 1.000.000 cm. Karena 1 km = 100.000 cm, maka 1.000.000 cm = 10 km.",
                misconception = "Lupa membagi dengan 100.000 untuk konversi ke kilometer."
            ),
            QuizQuestion(
                id = "q-skala-2",
                prompt = "Sebuah pekerjaan renovasi rumah dapat diselesaikan oleh 3 orang pekerja dalam waktu 12 hari. Jika dikerjakan oleh 6 orang pekerja, berapa harikah renovasi tersebut akan selesai?",
                type = "numeric",
                correctAnswer = "6",
                tolerance = 0.1f,
                unit = "hari",
                hints = listOf(
                    "Ini adalah perbandingan berbalik nilai: semakin banyak pekerja, waktu semakin singkat.",
                    "Rumus: a₁ × b₁ = a₂ × b₂.",
                    "3 × 12 = 6 × ...?",
                    "36 ÷ 6 = ... hari."
                ),
                explanation = "Perbandingan berbalik nilai: 3 pekerja × 12 hari = 36 hari-orang. Jika ada 6 pekerja, waktu yang dibutuhkan = 36 ÷ 6 = 6 hari.",
                misconception = "Menghitung sebagai perbandingan senilai (mengira pekerja ditambah waktu malah jadi 24 hari)."
            )
        )
    )

    // =========================================================================
    // 5. LESSON: SATUAN UKURAN, WAKTU & DEBIT (L1 — Dasar)
    // =========================================================================
    private val satuanUkuranLesson = LessonData(
        conceptId = "mat-satuan-ukuran",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "psu1",
                panelNumber = 1,
                title = "Mengisi Bak Mandi Rumah",
                caption = "Kirana membuka keran air untuk mengisi bak mandi bervolume 120 liter. Air mengalir deras bergemuruh.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dimas, bak mandi ini butuh berapa lama ya sampai terisi penuh? Kerannya mengalir sekitar 10 liter setiap menit!",
                sceneVisualEmoji = "🚰",
                sceneDescription = "Keran air mengalir deras mengisi bak mandi rumah."
            ),
            StoryPanel(
                id = "psu2",
                panelNumber = 2,
                title = "Debit: Aliran Volume per Waktu",
                caption = "Dimas melihat jam dinding dan menghitung dengan cepat.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Itu namanya DEBIT (Q)! Debit = Volume dibagi Waktu. Jika bak 120 liter dan debit keran 10 liter/menit, maka waktu yang dibutuhkan adalah 120 ÷ 10 = 12 menit saja!",
                sceneVisualEmoji = "⏳",
                sceneDescription = "Stopwatch mengukur waktu pengisian air bak mandi."
            ),
            StoryPanel(
                id = "psu3",
                panelNumber = 3,
                title = "Tangga Ajaib Satuan Metrik",
                caption = "Kakek menggambar tangga 7 anak tangga di papan tulis: km, hm, dam, m, dm, cm, mm.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ingat aturan tangga metrik: Setiap turun 1 anak tangga, kalikan 10! Setiap naik 1 anak tangga, bagilah dengan 10! Jembatan keledainya: Kucing Hitam Dalam Mobil Desi Centil Mandi-mandi!",
                sceneVisualEmoji = "🪜",
                sceneDescription = "Tangga konversi satuan metrik panjang dari km hingga mm."
            ),
            StoryPanel(
                id = "psu4",
                panelNumber = 4,
                title = "Pintu Air Manggarai Bersiap",
                caption = "Kakek menunjukkan siaran berita pemantauan Pintu Air Manggarai saat musim hujan lebat.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Petugas pintu air memantau debit sungai dalam satuan meter kubik per detik (m³/s). Jika debit melebihi 500 m³/s, pintu air segera dialirkan ke Kanal Banjir Barat untuk melindungi Jakarta!",
                sceneVisualEmoji = "🌊",
                sceneDescription = "Pintu air bendungan besar mengalirkan debit banjir air bah secara terukur."
            )
        ),
        intuitionTitle = "Dunia Pengukuran: Tangga Satuan Metrik, Kalender & Debit",
        intuitionBody = "Sains dan matematika membutuhkan standar pengukuran baku internasional (Sistem Metrik SI) agar pengukuran di seluruh dunia bernilai konsisten.\n\n" +
                "1. Tangga Satuan Panjang & Massa:\n" +
                "   • Panjang: km – hm – dam – m – dm – cm – mm (turun 1 tangga × 10, naik 1 tangga ÷ 10).\n" +
                "   • Massa: kg – hg (ons) – dag – g – dg – cg – mg (1 ton = 1.000 kg, 1 kuintal = 100 kg).\n" +
                "   • Luas: Tangga kuadrat (m²), setiap turun 1 tangga dikali 100 (1 hektar = 10.000 m²).\n" +
                "   • Volume: Tangga kubik (m³), setiap turun 1 tangga dikali 1.000. Hubungan penting: 1 liter = 1 dm³ = 1.000 cm³ (cc/ml).\n\n" +
                "2. Konversi Waktu:\n" +
                "   • 1 jam = 60 menit = 3.600 detik.\n" +
                "   • 1 hari = 24 jam. 1 tahun = 365 hari (366 hari pada tahun kabisat kelipatan 4).\n\n" +
                "3. Debit Aliran Fluida (Q):\n" +
                "   • Debit adalah banyaknya volume cairan yang mengalir melalui suatu penampang per satuan waktu.\n" +
                "   • Rumus Segitiga Debit: Volume = Q × t  |  Debit Q = V / t  |  Waktu t = V / Q.",
        intuitionPoints = listOf(
            "1 liter air bersih memiliki volume tepat 1 dm³ dan memiliki massa tepat 1 kilogram.",
            "Tahun kabisat terjadi setiap 4 tahun sekali ketika bulan Februari memiliki 29 hari (contoh: tahun 2024, 2028).",
            "Debit aliran berbanding lurus dengan luas penampang pipa dan kecepatan aliran air (Q = A × v)."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "Q",
                equation = "Q = \\frac{V}{t}",
                meaning = "Debit aliran zat cair: volume cairan yang mengalir per satuan waktu.",
                units = "liter/menit atau m³/detik",
                applicationNote = "Volume = Debit × Waktu. Waktu = Volume / Debit."
            ),
            FormulaCard(
                symbol = "1 \\text{ dm}^3",
                equation = "1 \\text{ dm}^3 = 1 \\text{ Liter} = 1.000 \\text{ mL} = 1.000 \\text{ cm}^3",
                meaning = "Kesetaraan emas antara satuan metrik kubik dan satuan volume liter.",
                units = "Kesetaraan volume",
                applicationNote = "Kunci konversi soal debit dan volume dari dm³ ke liter dan sebaliknya."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengendalian Debit Banjir Kanal Banjir Barat Pintu Air Manggarai Jakarta",
            context = "Hujan ekstrem di kawasan Puncak Bogor mengirimkan jutaan meter kubik air melalui Sungai Ciliwung menuju jantung ibu kota Jakarta.",
            engineeringProblem = "Jika Sungai Ciliwung di pusat kota meluap melebihi kapasitas debit aman 200 m³/detik, kawasan pemukiman dan perkantoran Sudirman-Thamrin akan tenggelam banjir.",
            physicalConceptUsed = "Hukum kontinuitas fluida dan perhitungan debit tampungan debit hidrologi Q = V / t.",
            mathematicalModel = "Operator Balai Besar Wilayah Sungai Ciliwung Cisadane (BBWSCC) memantau tinggi muka air di Katulampa dan Depok. Saat debit terukur mencapai 450 m³/s (Siaga 2), pintu air Manggarai dibuka penuh untuk membelokkan 350 m³/s aliran ke Kanal Banjir Barat langsung menuju Laut Jawa.",
            realWorldImpact = "Menyelamatkan pusat ekonomi nasional dari potensi kerugian bencana banjir senilai triliunan rupiah setiap musim hujan.",
            relatedCareers = listOf("Insinyur Hidrologi & Sumber Daya Air", "Operator Pintu Air Bendungan", "Pakar Mitigasi Bencana BNPB"),
            verifiedSource = "Balai Besar Wilayah Sungai Ciliwung Cisadane (BBWSCC) Kementerian PUPR."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Debit Keran Air Kamar Mandi Rumah Sendiri",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 botol plastik bekas air mineral 1 liter (1.000 ml)",
                "Stopwatch di smartphone",
                "Keran air wastafel atau kamar mandi"
            ),
            steps = listOf(
                "Langkah 1: Siapkan botol kosong 1 liter di bawah keran air.",
                "Langkah 2: Buka keran air secara penuh dan serentak mulai nyalakan stopwatch HP.",
                "Langkah 3: Tepat ketika air mengisi botol hingga batas leher 1 liter penuh, matikan stopwatch.",
                "Langkah 4: Catat waktu yang tertera di stopwatch (misalnya terisi penuh dalam 5 detik).",
                "Langkah 5: Hitung debit keran airmu: Debit Q = 1 liter ÷ 5 detik = 0,2 liter/detik (atau 0,2 × 60 = 12 liter/menit)!"
            ),
            observationGoal = "Mengukur secara empiris debit aliran fluida nyata di rumah menggunakan stopwatch dan botol bervolume baku.",
            connectionToSimulation = "Bandingkan hasil debit keran rumahmu dengan pipa aliran di simulator fisika!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sat-1",
                prompt = "Sebuah bak penampungan air bervolume 60 liter diisi melalui selang air dengan debit 15 liter per menit. Berapa menitkah waktu yang dibutuhkan hingga bak tersebut terisi penuh?",
                type = "numeric",
                correctAnswer = "4",
                tolerance = 0.1f,
                unit = "menit",
                hints = listOf(
                    "Gunakan rumus: Waktu = Volume / Debit.",
                    "Volume = 60 liter, Debit = 15 liter/menit.",
                    "Hitung 60 dibagi 15."
                ),
                explanation = "Waktu = Volume / Debit = 60 liter / (15 liter/menit) = 4 menit.",
                misconception = "Mengalikan volume dengan debit alih-alih membaginya."
            ),
            QuizQuestion(
                id = "q-sat-2",
                prompt = "Panjang sebuah lintasan lari adalah 2,5 kilometer (km). Berapakah panjang lintasan tersebut jika dinyatakan dalam satuan meter (m)?",
                type = "numeric",
                correctAnswer = "2500",
                tolerance = 1f,
                unit = "meter",
                hints = listOf(
                    "Ingat tangga metrik: 1 kilometer = 1.000 meter.",
                    "Kalikan 2,5 dengan 1.000.",
                    "2,5 × 1.000 = ...?"
                ),
                explanation = "1 km = 1.000 m. Maka 2,5 km = 2,5 × 1.000 m = 2.500 meter.",
                misconception = "Mengalikan dengan 100 sehingga mendapat 250 meter."
            )
        )
    )

    // =========================================================================
    // 6. LESSON: BANGUN DATAR & BANGUN RUANG SEDERHANA (L1 — Dasar)
    // =========================================================================
    private val bangunDatarRuangLesson = LessonData(
        conceptId = "mat-bangun-datar-ruang",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pbd1",
                panelNumber = 1,
                title = "Memasang Ubin Lantai Ruang Tamu",
                caption = "Keluarga Kirana sedang merenovasi lantai ruang tamu berukuran panjang 6 meter dan lebar 4 meter. Pak Tukang membawa kardus ubin keramik persegi 40 cm × 40 cm.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ayah, berapa banyak ubin keramik yang harus kita beli agar seluruh lantai ruang tamu tertutup rapi?",
                sceneVisualEmoji = "🏠",
                sceneDescription = "Lantai ruang tamu sedang dipasangi ubin keramik persegi."
            ),
            StoryPanel(
                id = "pbd2",
                panelNumber = 2,
                title = "Keliling vs Luas",
                caption = "Kakek mengambil kapur dan menggambar batas tepi ruangan di lantai.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Keliling adalah panjang pagar mengitari tepinya (2 × [panjang + lebar]), sedangkan Luas adalah seluruh daerah permukaan di dalamnya (panjang × lebar)! Luas ruangan kita adalah 6 m × 4 m = 24 meter persegi!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Perbedaan garis keliling tepi ruangan dengan luas permukaan ubin di dalamnya."
            ),
            StoryPanel(
                id = "pbd3",
                panelNumber = 3,
                title = "Misteri Konstanta Pi (π) pada Lingkaran",
                caption = "Dimas memegang roda sepeda dan mengukur keliling serta garis tengah diameternya.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Tahukah kamu, jika keliling lingkaran roda apa pun dibagi dengan diameternya, hasilnya SELALU mendekati angka ajaib 3,14 atau 22/7! Inilah konstanta Pi (π)!",
                sceneVisualEmoji = "🚲",
                sceneDescription = "Roda sepeda berputar menunjukkan rasio keliling terhadap diameter bernilai pi."
            ),
            StoryPanel(
                id = "pbd4",
                panelNumber = 4,
                title = "Menembus Ruang Tiga Dimensi: Volume",
                caption = "Kirana menyusun balok-balok mainan kubus kayu menjadi sebuah balok besar berongga.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jika bangun datar hanya punya panjang dan lebar, bangun ruang punya TINGGI! Volume balok = Luas Alas × Tinggi (panjang × lebar × tinggi)!",
                sceneVisualEmoji = "🧊",
                sceneDescription = "Balok kubus kayu mainan 3 dimensi memperlihatkan konsep isi kapasitas volume."
            )
        ),
        intuitionTitle = "Dunia Geometri: Dimensi Dua (Luas) & Dimensi Tiga (Volume)",
        intuitionBody = "Geometri adalah cabang matematika yang mempelajari sifat-sifat garis, sudut, bangun datar 2D, dan bangun ruang 3D.\n\n" +
                "1. Bangun Datar 2D (Keliling & Luas):\n" +
                "   • Persegi: Sisi sama panjang (s). Keliling = 4s | Luas = s².\n" +
                "   • Persegi Panjang: Panjang (p) dan lebar (l). Keliling = 2(p + l) | Luas = p × l.\n" +
                "   • Segitiga: Alas (a) dan tinggi tegak lurus (t). Luas = 1/2 × a × t.\n" +
                "   • Lingkaran: Jari-jari (r), diameter (d = 2r). Keliling = 2πr = πd | Luas = πr² (dengan π ≈ 22/7 atau 3,14).\n\n" +
                "2. Bangun Ruang 3D (Volume & Luas Permukaan):\n" +
                "   • Kubus: Sisi rusuk (s). Volume = s³ | Luas Permukaan = 6s².\n" +
                "   • Balok: Rusuk p, l, t. Volume = p × l × t | Luas Permukaan = 2(pl + pt + lt).\n" +
                "   • Tabung (Silinder): Alas lingkaran jari-jari r, tinggi t. Volume = πr²t.",
        intuitionPoints = listOf(
            "Tinggi segitiga harus selalu TEGAK LURUS (membentuk sudut 90°) terhadap sisi alasnya, bukan sisi miringnya.",
            "Keliling menggunakan satuan panjang biasa (cm, m), Luas menggunakan satuan persegi (cm², m²), dan Volume menggunakan satuan kubik (cm³, m³, liter).",
            "Segitiga adalah separuh dari persegi panjang, itu sebabnya rumusnya dikalikan 1/2 (setengah alas dikali tinggi)."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "L_{\\text{lingkaran}}",
                equation = "L = \\pi r^2 \\quad , \\quad K = 2\\pi r",
                meaning = "Rumus luas dan keliling lingkaran dengan jari-jari r dan konstanta pi (π ≈ 22/7 atau 3,14).",
                units = "cm² / m² (Luas) dan cm / m (Keliling)",
                applicationNote = "Jika jari-jari kelipatan 7 (7, 14, 21), gunakan π = 22/7 untuk mempermudah perhitungan."
            ),
            FormulaCard(
                symbol = "V_{\\text{balok}}",
                equation = "V = p \\times l \\times t",
                meaning = "Volume ruang balok dengan panjang p, lebar l, dan tinggi t.",
                units = "m³ atau cm³ (mL)",
                applicationNote = "Volume balok 2 m × 1 m × 0,5 m = 1 m³ = 1.000 liter air."
            ),
            FormulaCard(
                symbol = "V_{\\text{tabung}}",
                equation = "V = \\pi r^2 t",
                meaning = "Volume tabung silinder: luas alas lingkaran dikalikan tinggi tabung.",
                units = "satuan volume kubik",
                applicationNote = "Digunakan untuk menghitung kapasitas tangki drum minyak atau pipa silinder."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Perhitungan Kubikasi Beton Fondasi Candi Borobudur & Monas Jakarta",
            context = "Kementerian Pekerjaan Umum dan Perumahan Rakyat (PUPR) merestorasi sistem drainase dan fondasi struktur monumen bersejarah nasional.",
            engineeringProblem = "Bagaimana menghitung volume kebutuhan semen cor beton cair secara akurat agar fondasi cakar ayam tidak kekurangan material di tengah pengecoran?",
            physicalConceptUsed = "Prinsip volume prisma, balok bertingkat, dan silinder tiang pancang (Pancang Bored Pile).",
            mathematicalModel = "Volume total beton = Σ (Panjang × Lebar × Tebal Fondasi) + n × (π × r² × kedalaman tiang silinder). Ditambahkan faktor toleransi penyusutan cor 5%.",
            realWorldImpact = "Menghindari kegagalan struktural bangunan dan menghemat biaya pengadaan semen truk mixer molen hingga ratusan juta rupiah per proyek.",
            relatedCareers = listOf("Insinyur Sipil Struktur Gedung", "Estimator Biaya Konstruksi (Quantity Surveyor)", "Arsitek Pelestarian Cagar Budaya"),
            verifiedSource = "Balai Konservasi Borobudur & Standar Tata Cara Perhitungan Struktur Beton SNI."
        ),
        homeLab = HomeLabData(
            title = "Menemukan Nilai Pi (π) dari Benda Melingkar di Rumah",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "3 benda berbentuk lingkaran: tutup toples, mangkuk, atau kaleng biskuit",
                "Benang jahit atau tali kasur 50 cm",
                "Penggaris panjang 30 cm",
                "Kertas dan pulpen"
            ),
            steps = listOf(
                "Langkah 1: Lilitkan benang tepat satu putaran mengelilingi tepi bibir kaleng biskuit.",
                "Langkah 2: Rentangkan benang di atas penggaris untuk mengukur panjang Kelilingnya (K).",
                "Langkah 3: Gunakan penggaris untuk mengukur garis tengah terpanjang kaleng (Diameter d).",
                "Langkah 4: Bagi nilai keliling dengan diameternya menggunakan kalkulator: Nilai = K ÷ d.",
                "Langkah 5: Ulangi pada tutup toples dan mangkuk. Amati: semua hasilnya akan selalu mendekati angka 3,14!"
            ),
            observationGoal = "Membuktikan secara langsung bahwa rasio keliling terhadap diameter pada setiap lingkaran di alam semesta selalu konstan bernilai Pi (π).",
            connectionToSimulation = "Bandingkan lingkaran yang kamu ukur dengan simulator geometri interaktif!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-geo-1",
                prompt = "Sebuah kolam renang berbentuk balok memiliki panjang 10 meter, lebar 4 meter, dan kedalaman (tinggi) 2 meter. Berapakah volume air maksimum yang dapat ditampung kolam tersebut?",
                type = "numeric",
                correctAnswer = "80",
                tolerance = 0.1f,
                unit = "m³",
                hints = listOf(
                    "Gunakan rumus volume balok: V = panjang × lebar × tinggi.",
                    "V = 10 × 4 × 2.",
                    "Hitung 10 × 4 = 40, lalu 40 × 2 = ...?"
                ),
                explanation = "Volume balok = p × l × t = 10 m × 4 m × 2 m = 80 meter kubik (m³), setara dengan 80.000 liter air.",
                misconception = "Menjumlahkan ketiga sisinya alih-alih mengalikannya."
            ),
            QuizQuestion(
                id = "q-geo-2",
                prompt = "Berapakah luas sebuah segitiga yang memiliki panjang sisi alas 8 cm dan tinggi 6 cm?",
                type = "numeric",
                correctAnswer = "24",
                tolerance = 0.1f,
                unit = "cm²",
                hints = listOf(
                    "Rumus luas segitiga = 1/2 × alas × tinggi.",
                    "Luas = 1/2 × 8 × 6.",
                    "Hitung 8 × 6 = 48, lalu bagi 2."
                ),
                explanation = "Luas segitiga = 1/2 × alas × tinggi = 1/2 × 8 cm × 6 cm = 24 cm².",
                misconception = "Lupa mengalikan dengan 1/2 (sehingga menjawab 48 cm² seperti luas persegi panjang)."
            )
        )
    )

    // =========================================================================
    // 7. LESSON: STATISTIKA DASAR: TABEL, DIAGRAM & RATA-RATA (L1 — Dasar)
    // =========================================================================
    private val statistikaDasarLesson = LessonData(
        conceptId = "mat-statistika-dasar",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "psd1",
                panelNumber = 1,
                title = "Survei Buah Kesukaan Kelas Kirana",
                caption = "Kirana menjadi ketua regu yang ditugaskan mencatat buah kesukaan 20 teman sekelasnya untuk pesta perpisahan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ada yang suka mangga, jeruk, semangka, dan pisang. Catatanku berantakan sekali! Bagaimana cara merapikannya agar mudah dibaca Ibu Guru?",
                sceneVisualEmoji = "📝",
                sceneDescription = "Daftar coretan nama buah hasil wawancara teman sekelas di atas buku tulis."
            ),
            StoryPanel(
                id = "psd2",
                panelNumber = 2,
                title = "Tabel Frekuensi & Diagram Batang",
                caption = "Kakek mengajari Kirana membuat tanda turus (tally) dan menggambar diagram batang warna-warni.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kelompokkan ke dalam Tabel Frekuensi! Buat tiang batang tegak sesuai jumlah penyukanya. Batang yang paling tinggi adalah Modus — buah yang paling disukai mayoritas temanmu!",
                sceneVisualEmoji = "📊",
                sceneDescription = "Diagram batang warna-warni menampilkan frekuensi masing-masing buah kesukaan."
            ),
            StoryPanel(
                id = "psd3",
                panelNumber = 3,
                title = "Mean: Nilai Rata-rata Ujian",
                caption = "Dimas memperlihatkan 4 nilai kuis matematikanya minggu ini: 80, 90, 85, dan 85.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Berapa nilai rata-rataku? Jumlahkan semua nilaiku: 80 + 90 + 85 + 85 = 340. Lalu bagi dengan banyaknya kuis (4): 340 ÷ 4 = 85! Rata-rata nilaiku adalah 85!",
                sceneVisualEmoji = "📈",
                sceneDescription = "Perhitungan nilai rata-rata kuis matematika di buku rapor Dimas."
            ),
            StoryPanel(
                id = "psd4",
                panelNumber = 4,
                title = "Median: Angka di Tengah Barisan",
                caption = "Kirana menyusun 5 orang temannya berbaris urut dari yang paling pendek hingga paling tinggi.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jika datanya diurutkan dari terkecil ke terbesar, angka yang berada persis di tengah-tengah adalah Median! Median membagi data menjadi dua kelompok yang sama banyak!",
                sceneVisualEmoji = "🧍",
                sceneDescription = "Deretan anak berbaris berurutan tinggi badan menunjukkan posisi anak di tengah sebagai median."
            )
        ),
        intuitionTitle = "Membaca Cerita di Balik Data: Mean, Median & Modus",
        intuitionBody = "Statistika adalah ilmu mengumpulkan, mengolah, menyajikan, dan menarik kesimpulan cerdas dari sekumpulan data.\n\n" +
                "1. Penyajian Data:\n" +
                "   • Tabel Frekuensi: Menyusun data acak menjadi kelompok baris dengan jumlah kemunculan (frekuensi).\n" +
                "   • Diagram Batang: Memvisualisasikan data kategori dengan tinggi batang proporsional terhadap frekuensinya.\n" +
                "   • Diagram Garis: Menampilkan perkembangan data berkelanjutan terhadap waktu (tren naik/turun).\n" +
                "   • Diagram Lingkaran: Menampilkan persentase bagian dari keseluruhan 100% atau 360°.\n\n" +
                "2. Tiga Ukuran Pemusatan Data:\n" +
                "   • Mean (Rata-rata): Jumlah seluruh nilai data dibagi banyaknya data. Rumus: x̄ = (Σx) / n.\n" +
                "   • Median: Nilai tengah setelah seluruh data DIURUTKAN dari terkecil ke terbesar.\n" +
                "     - Jika banyak data ganjil, median tepat satu angka di tengah.\n" +
                "     - Jika banyak data genap, median adalah rata-rata dari dua angka di tengah.\n" +
                "   • Modus: Nilai atau kategori yang PALING SERING MUNCUL (memiliki frekuensi tertinggi).",
        intuitionPoints = listOf(
            "Sebelum menentukan Median, data WAJIB diurutkan terlebih dahulu dari nilai terkecil ke terbesar.",
            "Modus bisa lebih dari satu (bimodal) jika ada dua nilai yang memiliki frekuensi kemunculan terbanyak yang sama.",
            "Mean sangat dipengaruhi oleh angka ekstrem (outlier), sedangkan Median lebih stabil terhadap data pencilan."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "\\bar{x} \\text{ (Mean)}",
                equation = "\\bar{x} = \\frac{\\sum x_i}{n} = \\frac{x_1 + x_2 + \\dots + x_n}{n}",
                meaning = "Nilai rata-rata hitung (mean): jumlah seluruh nilai dibagi jumlah total data n.",
                units = "Satuan data asal",
                applicationNote = "Rata-rata nilai ulangan 7, 8, 9 adalah (7 + 8 + 9) / 3 = 24 / 3 = 8."
            ),
            FormulaCard(
                symbol = "\\text{Median}",
                equation = "\\text{Med} = x_{\\frac{n+1}{2}} \\quad (\\text{untuk } n \\text{ ganjil})",
                meaning = "Nilai data yang menempati posisi tepat di tengah setelah data diurutkan.",
                units = "Satuan data asal",
                applicationNote = "Data terurut: 4, 5, 7, 8, 9 (n=5). Median adalah data ke-(5+1)/2 = ke-3, yaitu 7."
            ),
            FormulaCard(
                symbol = "\\text{Modus}",
                equation = "\\text{Modus} = \\text{Data dengan frekuensi maksimum } (f_{\\max})",
                meaning = "Nilai yang paling sering muncul di dalam kumpulan data.",
                units = "Satuan data asal",
                applicationNote = "Data: 6, 7, 8, 8, 9, 8, 7. Modus = 8 (muncul 3 kali)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sensus Penduduk & Analisis Piramida Penduduk BPS Indonesia",
            context = "Badan Pusat Statistik (BPS) mengolah data sensus ratusan juta penduduk Indonesia untuk merencanakan pembangunan sekolah, rumah sakit, dan lapangan kerja.",
            engineeringProblem = "Bagaimana meringkas data usia 278 juta penduduk Indonesia agar pemerintah tahu prioritas subsidi kesehatan balita vs lansia?",
            physicalConceptUsed = "Ukuran pemusatan data statistika deskriptif (Mean, Median, Modus) dan visualisasi Piramida Penduduk.",
            mathematicalModel = "BPS menghitung Median Usia Penduduk Indonesia (~30,5 tahun). Karena median berada pada usia produktif muda, Indonesia menikmati era Bonus Demografi di mana jumlah usia kerja melampaui usia non-produktif.",
            realWorldImpact = "Menjadi dasar penentuan anggaran APBN ratusan triliun rupiah untuk program Kartu Indonesia Pintar, beasiswa LPDP, dan ketahanan pangan nasional.",
            relatedCareers = listOf("Statistisi Ahli Badan Pusat Statistik", "Data Analyst / Data Scientist", "Demograf & Perencana Kebijakan Publik"),
            verifiedSource = "Badan Pusat Statistik (BPS) RI / Laporan Hasil Sensus Penduduk."
        ),
        homeLab = HomeLabData(
            title = "Survei & Menggambar Diagram Batang Ukuran Sepatu Keluarga",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Buku catatan dan pulpen",
                "Penggaris",
                "Spidol warna-warni"
            ),
            steps = listOf(
                "Langkah 1: Tanyakan dan catat ukuran sepatu 5–8 orang di rumahmu (anggota keluarga dan teman dekat). Contoh data: 36, 40, 38, 40, 42, 38, 40.",
                "Langkah 2: Urutkan data dari terkecil ke terbesar: 36, 38, 38, 40, 40, 40, 42.",
                "Langkah 3: Cari Nilai Modus: ukuran berapa yang paling banyak dipakai? (Contoh: 40 muncul 3 kali).",
                "Langkah 4: Cari Nilai Median: angka mana yang berada persis di posisi tengah barisan?",
                "Langkah 5: Hitung Nilai Rata-rata (Mean): jumlahkan semua ukuran sepatu lalu bagi dengan jumlah orang yang disurvei.",
                "Langkah 6: Gambarkan diagram batang ukuran sepatu tersebut secara rapi di buku catatanmu!"
            ),
            observationGoal = "Mempraktikkan seluruh siklus statistika dasar: pengumpulan data, pengurutan, penentuan mean-median-modus, dan pembuatan diagram batang.",
            connectionToSimulation = "Bandingkan grafik buatanmu dengan diagram batang digital pada simulator!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-stat-1",
                prompt = "Diberikan data nilai ulangan matematika Kirana: 7, 8, 9, 8, 6, 8, 10. Berapakah nilai MODUS dari data tersebut?",
                type = "numeric",
                correctAnswer = "8",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Modus adalah nilai yang paling sering muncul.",
                    "Nilai 6 muncul 1 kali, 7 muncul 1 kali, 8 muncul 3 kali, 9 muncul 1 kali, 10 muncul 1 kali.",
                    "Nilai mana yang frekuensinya paling banyak?"
                ),
                explanation = "Nilai 8 muncul sebanyak 3 kali (paling sering dibandingkan nilai lainnya), sehingga modusnya adalah 8.",
                misconception = "Menjawab frekuensinya (3) alih-alih nilainya (8)."
            ),
            QuizQuestion(
                id = "q-stat-2",
                prompt = "Berapakah nilai rata-rata (mean) dari lima bilangan berikut: 6, 7, 8, 9, 10?",
                type = "numeric",
                correctAnswer = "8",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Jumlahkan semua angka: 6 + 7 + 8 + 9 + 10 = 40.",
                    "Bagi hasil penjumlahan dengan banyaknya angka (5).",
                    "40 ÷ 5 = ...?"
                ),
                explanation = "Rata-rata = (6 + 7 + 8 + 9 + 10) / 5 = 40 / 5 = 8.",
                misconception = "Lupa membagi dengan banyaknya bilangan."
            )
        )
    )
}

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

object ChemistryLevel2Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "kim-struktur-atom",
            domain = Domain.KIMIA,
            topic = "Struktur Materi",
            title = "Struktur Atom & Partikel Subatomik",
            description = "Partikel proton, neutron, elektron, nomor atom (Z), nomor massa (A), isotop, dan pembentukan ion positif (kation) serta negatif (anion).",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("kim-materi-sifat", "kim-unsur-senyawa")
        ),
        ConceptItem(
            id = "kim-tabel-periodik",
            domain = Domain.KIMIA,
            topic = "Sistem Periodik",
            title = "Tabel Periodik: Golongan & Periode",
            description = "Penyusunan tabel periodik berdasarkan kenaikan nomor atom, pembagian baris periode dan kolom golongan, serta pengelompokan logam, nonlogam, dan gas mulia.",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("kim-struktur-atom")
        ),
        ConceptItem(
            id = "kim-ikatan-kimia-dasar",
            domain = Domain.KIMIA,
            topic = "Ikatan Kimia",
            title = "Ikatan Ionik & Kovalen Dasar",
            description = "Kestabilan kaidah oktet dan duplet gas mulia, serah terima elektron (ikatan ionik garam), dan pemakaian pasangan elektron bersama (ikatan kovalen).",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("kim-struktur-atom", "kim-tabel-periodik")
        ),
        ConceptItem(
            id = "kim-rumus-persamaan-reaksi",
            domain = Domain.KIMIA,
            topic = "Persamaan Reaksi",
            title = "Rumus Kimia & Penyetaraan Reaksi",
            description = "Penulisan rumus molekul, identifikasi zat reaktan dan produk, serta teknik penyetaraan koefisien reaksi kimia sesuai Hukum Kekekalan Massa Lavoisier.",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("kim-unsur-senyawa", "mat-persamaan-linear")
        ),
        ConceptItem(
            id = "kim-asam-basa",
            domain = Domain.KIMIA,
            topic = "Larutan Asam & Basa",
            title = "Larutan Asam, Basa & Skala pH",
            description = "Kekuatan asam-basa, konsentrasi ion H⁺ dan OH⁻, larutan elektrolit penghantar arus, skala derajat keasaman pH (0–14), dan indikator universal.",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("kim-asam-basa-dasar")
        ),
        ConceptItem(
            id = "kim-reaksi-kehidupan",
            domain = Domain.KIMIA,
            topic = "Reaksi Kimia Terapan",
            title = "Reaksi Kimia Sehari-hari & Korosi",
            description = "Reaksi pembakaran hidrokarbon elpiji, mekanisme elektrokimia perkaratan besi serta teknik proteksi katodik/pelapisan, dan biokimia fotosintesis/respirasi.",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("kim-rumus-persamaan-reaksi")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "kim-struktur-atom" -> strukturAtomLesson
            "kim-tabel-periodik" -> tabelPeriodikLesson
            "kim-ikatan-kimia-dasar" -> ikatanKimiaDasarLesson
            "kim-rumus-persamaan-reaksi" -> rumusPersamaanReaksiLesson
            "kim-asam-basa" -> acidBaseLesson
            "kim-reaksi-kehidupan" -> reaksiKehidupanLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. STRUKTUR ATOM & PARTIKEL SUBATOMIK
    // =========================================================================
    private val strukturAtomLesson = LessonData(
        conceptId = "kim-struktur-atom",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pat1",
                panelNumber = 1,
                title = "Menembus Ruang Hampa Atom",
                caption = "Kakek menunjukkan poster besar Tabel Periodik Unsur yang tertempel di dinding ruang belajar.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Seandainya inti atom sebesar kelereng di tengah stadion Gelora Bung Karno, elektronnya berputar di tribun paling atas! Sebagian besar isi atom adalah ruang hampa!",
                sceneVisualEmoji = "🏟️",
                sceneDescription = "Visualisasi perbandingan kelereng di tengah stadion bola dengan elektron di tribun terluar."
            ),
            StoryPanel(
                id = "pat2",
                panelNumber = 2,
                title = "Tiga Sekawan Subatomik",
                caption = "Kirana menggambar lingkaran inti atom yang berisi proton dan neutron.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Proton bermuatan positif (+), neutron netral tanpa muatan, dan elektron bermuatan negatif (-) melesat lincah di kulit luar atom!",
                sceneVisualEmoji = "⚛️",
                sceneDescription = "Diagram atom Rutherford-Bohr dengan inti padat dan lintasan kulit elektron."
            ),
            StoryPanel(
                id = "pat3",
                panelNumber = 3,
                title = "Nomor Identitas KTP Atom",
                caption = "Dimas menunjuk ke kotak nomor 6 pada tabel periodik: Karbon (C).",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jumlah proton adalah nomor atom (Z)! Jumlah proton inilah yang menentukan identitas unsur: jika ada 6 proton pasti Karbon, jika 8 proton pasti Oksigen!",
                sceneVisualEmoji = "🏷️",
                sceneDescription = "Kotak unsur Karbon menampilkan nomor atom 6, lambang C, dan nomor massa 12."
            )
        ),
        intuitionTitle = "Arsitektur Atom: Blok Pembangun Segala Zat",
        intuitionBody = "Seluruh materi di alam semesta tersusun dari partikel dasar bernama ATOM:\n\n" +
                "1. Struktur Inti Atom (Nukleus):\n" +
                "   • Terletak di pusat atom, berukuran amat kecil namun menyimpan 99,9% massa seluruh atom.\n" +
                "   • Tersusun dari Proton (muatan +1, massa ~1 sma) dan Neutron (muatan 0, massa ~1 sma).\n" +
                "   • Gaya Nuklir Kuat mengikat proton-proton agar tidak saling tolak-menolak di inti.\n\n" +
                "2. Kulit Elektron & Model Bohr:\n" +
                "   • Elektron (muatan -1, massa 1/1836 sma) mengitari inti pada tingkat energi/kulit tertentu (K, L, M, N).\n" +
                "   • Kapasitas maksimum kulit ke-n mengikuti rumus Bohr: 2n² (Kulit K = 2, L = 8, M = 18).\n\n" +
                "3. Notasi Atom, Isotop & Ion:\n" +
                "   • Nomor Atom (Z) = Jumlah proton = Jumlah elektron (pada atom netral).\n" +
                "   • Nomor Massa (A) = Jumlah Proton (Z) + Jumlah Neutron (N).\n" +
                "   • Isotop: Atom seunsur (Z sama) beda jumlah neutron N (Karbon-12 dan Karbon-14).\n" +
                "   • Ion Kation (+): Melepas elektron (Na → Na⁺ + e⁻). Ion Anion (-): Menangkap elektron (Cl + e⁻ → Cl⁻).",
        intuitionPoints = listOf(
            "Atom netral selalu memiliki jumlah proton positif yang sama banyak dengan jumlah elektron negatifnya.",
            "Massa elektron sangat ringan (hampir 2.000 kali lebih ringan dari proton) sehingga massa atom praktis hanya ditentukan oleh inti proton dan neutron.",
            "Pembentukan ion terjadi HANYA melalui perpindahan elektron di kulit terluar; jumlah proton di dalam inti TIDAK PERNAH berubah pada reaksi kimia biasa."
        ),
        simId = "sim-atom",
        formulas = listOf(
            FormulaCard(
                symbol = "A & Z",
                equation = "A = Z + N \\implies N = A - Z",
                meaning = "Nomor massa A = nomor atom Z (proton) + jumlah neutron N.",
                units = "sma (satuan massa atom)",
                applicationNote = "Contoh: Natrium ²³₁₁Na memiliki 11 proton, 11 elektron, dan 23 - 11 = 12 neutron."
            ),
            FormulaCard(
                symbol = "2n^2",
                equation = "\\text{Kapasitas Kulit Maksimum} = 2n^2",
                meaning = "Jumlah elektron maksimal yang dapat ditampung kulit ke-n model Bohr.",
                units = "elektron",
                applicationNote = "Kulit ke-1 (K) = 2, kulit ke-2 (L) = 8, kulit ke-3 (M) = 18 elektron."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Penanggalan Radiokarbon C-14 Fosil Manusia Purba Sangiran Solo",
            context = "Situs Manusia Purba Sangiran di Jawa Tengah merupakan Situs Warisan Dunia UNESCO yang menyimpan lebih dari 100 fosil Homo erectus.",
            engineeringProblem = "Bagaimana arkeolog dapat mengetahui secara tepat bahwa fosil tengkorak manusia purba yang terkubur di lapisan tanah telah berusia puluhan ribu tahun?",
            physicalConceptUsed = "Sifat isotop radioaktif atom Karbon-14 (Z = 6, neutron = 8) yang meluruh secara teratur dengan waktu paruh t_½ = 5.730 tahun.",
            mathematicalModel = "Selama hidup, makhluk hidup menyerap rasio tetap C-14/C-12 dari atmosfer. Saat mati, asupan terhenti dan C-14 meluruh sesuai rumus eksponensial N(t) = N₀ · (½)^(t / 5.730). Mengukur rasio C-14 sisa pada tulang fosil mengungkap usia kematian spesimen.",
            realWorldImpact = "Merekonstruksi garis evolusi manusia purba di pulau Jawa dan menempatkan Indonesia sebagai pusat riset paleoantropologi terkemuka di dunia.",
            relatedCareers = listOf("Arkeometris Nuklir", "Paleoantropolog Peneliti", "Spesialis Spektrometri Massa Akselerator (AMS)"),
            verifiedSource = "Balai Pelestarian Situs Manusia Purba (BPSMP) Sangiran / Badan Riset dan Inovasi Nasional (BRIN)."
        ),
        homeLab = HomeLabData(
            title = "Merangkai Diagram Kulit Elektron Atom Bohr Menggunakan Kancing Baju & Piring",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 piring plastik putih ceper (sebagai bidang atom)",
                "Kancing baju kecil berwarna merah (proton) dan biru (elektron)",
                "Kertas bulat kecil bertuliskan lambang atom (misal: Karbon Z=6, Natrium Z=11)"
            ),
            steps = listOf(
                "Pilih unsur Karbon (Z = 6, A = 12). Letakkan 6 kancing merah di pusat piring sebagai INTI ATOM (6 proton).",
                "Karbon memiliki 6 elektron. Gambar lingkaran lingkaran kulit pertama (K) mengitari inti: letakkan maksimal 2 kancing biru pada kulit K.",
                "Sisa 4 kancing biru diletakkan pada lingkaran kulit kedua (L). Amati bahwa kulit terluar memiliki 4 elektron valensi!",
                "Sekarang coba ganti dengan unsur Natrium (Z = 11): 11 proton di inti, 2 elektron di kulit K, 8 elektron di kulit L, dan 1 elektron tersisa di kulit M!",
                "Amati 1 elektron di kulit M itulah yang mudah dilepas Natrium untuk membentuk ion Na⁺!"
            ),
            observationGoal = "Memvisualisasikan konfigurasi kulit elektron Bohr dan memahami asal-usul terbentuknya elektron valensi penentu sifat kimia unsur.",
            connectionToSimulation = "Bandingkan konfigurasi kulit kancingmu dengan simulator atom interaktif Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sa-1",
                prompt = "Sebuah atom unsur Klorin memiliki notasi ³⁵₁₇Cl. Berapakah jumlah proton, elektron, dan neutron pada atom netral tersebut berturut-turut?",
                type = "multiple_choice",
                options = listOf(
                    "17 proton, 17 elektron, dan 18 neutron",
                    "17 proton, 18 elektron, dan 35 neutron",
                    "35 proton, 17 elektron, dan 17 neutron",
                    "18 proton, 17 elektron, dan 17 neutron"
                ),
                correctAnswer = "17 proton, 17 elektron, dan 18 neutron",
                hints = listOf(
                    "Angka bawah 17 adalah nomor atom Z = proton = elektron.",
                    "Angka atas 35 adalah nomor massa A.",
                    "Jumlah neutron = A - Z = 35 - 17 = ...?"
                ),
                explanation = "Z = 17 berarti jumlah proton = 17 dan elektron = 17 (netral). Jumlah neutron = A - Z = 35 - 17 = 18 neutron.",
                misconception = "Mengira nomor massa 35 adalah jumlah neutron."
            ),
            QuizQuestion(
                id = "q-sa-2",
                prompt = "Jika atom Magnesium (nomor atom 12) melepaskan 2 buah elektron terluarnya, ion apakah yang akan terbentuk?",
                type = "multiple_choice",
                options = listOf("Ion Mg²⁺ (kation bermuatan positif 2)", "Ion Mg²⁻ (anion bermuatan negatif 2)", "Atom Mg netral tanpa muatan", "Molekul Mg₂"),
                correctAnswer = "Ion Mg²⁺ (kation bermuatan positif 2)",
                hints = listOf("Elektron bermuatan negatif (-).", "Kehilangan 2 muatan negatif membuat atom kelebihan 2 muatan positif."),
                explanation = "Karena kehilangan 2 elektron negatif, atom memiliki 12 proton (+) dan hanya 10 elektron (-), menghasilkan muatan netto +2 (ion Mg²⁺).",
                misconception = "Mengira melepas elektron membuat muatan menjadi negatif."
            )
        )
    )

    // =========================================================================
    // 2. TABEL PERIODIK: GOLONGAN & PERIODE
    // =========================================================================
    private val tabelPeriodikLesson = LessonData(
        conceptId = "kim-tabel-periodik",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "ptp1",
                panelNumber = 1,
                title = "Kembang Api Tahun Baru di Bundaran HI",
                caption = "Pesta kembang api di Bundaran HI Jakarta menerangi langit malam dengan ledakan warna merah menyala, hijau zamrud, dan kuning emas.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Indah sekali! Bagaimana kembang api bisa menghasilkan warna-warni yang berbeda begitu?",
                sceneVisualEmoji = "🎆",
                sceneDescription = "Kembang api meledak memancarkan aneka warna di langit malam bundaran HI."
            ),
            StoryPanel(
                id = "ptp2",
                panelNumber = 2,
                title = "Uji Nyala Garam Golongan Logam",
                caption = "Kakek menjelaskan asal-usul warna kembang api dari unsur-unsur tabel periodik.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Warna merah berasal dari garam Stronsium (golongan alkali tanah IIA), warna kuning dari Natrium (golongan alkali IA), dan warna hijau dari Barium! Unsur-unsur dalam satu golongan memiliki sifat kimia serupa karena elektron valensinya sama!",
                sceneVisualEmoji = "🔥",
                sceneDescription = "Nyala api bunsen berubah warna sesuai unsur garam logam yang dibakar."
            ),
            StoryPanel(
                id = "ptp3",
                panelNumber = 3,
                title = "Peta Periodik Dmitri Mendeleev",
                caption = "Kirana menelusuri susunan kotak tabel periodik modern.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Baris horizontal disebut PERIODE (jumlah kulit elektron), kolom vertikal disebut GOLONGAN (elektron valensi). Sisi kiri penuh dengan Logam konduktor mengkilap, dan sisi kanan adalah Nonlogam serta Gas Mulia yang stabil!",
                sceneVisualEmoji = "🗺️",
                sceneDescription = "Peta tabel periodik dengan pembagian zona logam, metaloid, dan nonlogam."
            )
        ),
        intuitionTitle = "Peta Agung Materi: Keteraturan Tabel Periodik Unsur",
        intuitionBody = "Tabel Periodik Unsur menyusun 118 unsur kimia berdasarkan keteraturan kenaikan nomor atom dan konfigurasi elektron:\n\n" +
                "1. Baris Horizontal (Periode 1 sampai 7):\n" +
                "   • Menunjukkan jumlah kulit elektron yang dimiliki atom.\n" +
                "   • Contoh: Natrium (Na) memiliki 3 kulit terisi (2, 8, 1) sehingga berada di Periode 3.\n\n" +
                "2. Kolom Vertikal (Golongan Utama IA sampai VIIIA):\n" +
                "   • Menunjukkan jumlah elektron valensi di kulit terluar.\n" +
                "   • Golongan IA (Logam Alkali: Li, Na, K): 1 elektron valensi, sangat reaktif dengan air.\n" +
                "   • Golongan IIA (Logam Alkali Tanah: Mg, Ca, Ba): 2 elektron valensi.\n" +
                "   • Golongan VIIA (Halogen: F, Cl, Br, I): 7 elektron valensi, pembentuk garam aktif.\n" +
                "   • Golongan VIIIA (Gas Mulia: He, Ne, Ar, Kr, Xe): 8 elektron valensi (He = 2), sangat stabil dan sukar bereaksi.\n\n" +
                "3. Pembagian Karakteristik Unsur:\n" +
                "   • Logam (Mayoritas di kiri-tengah): Mengkilap, konduktor listrik dan panas baik, mudah melepas elektron.\n" +
                "   • Nonlogam (Kanan atas): Isolator, rapuh, cenderung menangkap elektron.\n" +
                "   • Metaloid (Batas tangga diagonal: Si, Ge): Bersifat semikonduktor (bahan dasar chip komputer).",
        intuitionPoints = listOf(
            "Unsur-unsur dalam SATU GOLONGAN yang sama memiliki sifat kimia yang sangat mirip karena jumlah elektron valensi kulit terluarnya sama.",
            "Semakin ke kanan dalam satu periode, jari-jari atom cenderung mengecil karena tarikan muatan positif inti terhadap elektron semakin kuat.",
            "Gas Mulia (Helium, Neon, Argon) tidak beracun dan tidak mudah terbakar sehingga Helium aman digunakan untuk mengisi balon terbang menggantikan hidrogen."
        ),
        simId = "sim-periodic-table",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Periode & Golongan}",
                equation = "\\text{Nomor Periode} = n_{\\text{kulit}} \\quad , \\quad \\text{Nomor Golongan} = e_{\\text{valensi}}",
                meaning = "Penentuan posisi unsur golongan utama dari konfigurasi elektron kulit.",
                units = "-",
                applicationNote = "Kalium (2, 8, 8, 1): 4 kulit -> Periode 4, 1 elektron valensi -> Golongan IA."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Hilirisasi Nikel (Ni) Baterai Kendaraan Listrik di Morowali Sulawesi Tengah",
            context = "Indonesia memiliki cadangan tambang bijih nikel laterit terbesar di dunia yang terkonsentrasi di Sulawesi Tenggara, Sulawesi Tengah, dan Maluku Utara.",
            engineeringProblem = "Nikel adalah unsur logam transisi periode 4 (nomor atom 28) yang memiliki sifat tahan korosi dan densitas energi tinggi, namun bijih tambang mentahnya bernilai jual rendah jika hanya diekspor mentah.",
            physicalConceptUsed = "Metalurgi ekstraksi pirometalurgi (smelter RKEF) dan hidrometalurgi High Pressure Acid Leach (HPAL) untuk memurnikan senyawa nikel sulfat (NiSO₄).",
            mathematicalModel = "Pengolahan HPAL memisahkan nikel murni dari ikatan oksida limonit besi untuk menghasilkan Mixed Hydroxide Precipitate (MHP) berkadar nikel > 37% sebagai bahan baku katoda baterai NMC lithium-ion.",
            realWorldImpact = "Mendorong Indonesia menjadi pemain rantai pasok global industri mobil listrik hijau terintegrasi dari tambang hingga baterai.",
            relatedCareers = listOf("Insinyur Kimia Ekstraksi Nikel", "Metalurgis Smelter Industri", "Spesialis Bahan Baku Baterai Listrik"),
            verifiedSource = "Kementerian ESDM RI / Neraca Sumber Daya Mineral Nikel Nasional."
        ),
        homeLab = HomeLabData(
            title = "Menjelajah Unsur Rumah Tangga pada Tabel Periodik Interaktif",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Poster atau aplikasi tabel periodik unsur di HP",
                "5 barang rumah tangga: kabel tembaga (Cu), wajan aluminium (Al), baterai lithium (Li), garam dapur natrium klorida (Na & Cl), pensil grafit karbon (C)",
                "Buku catatan untuk klasifikasi"
            ),
            steps = listOf(
                "Cari letak masing-masing unsur barang rumah tanggamu di tabel periodik.",
                "Catat golongan dan periode masing-masing unsur:\n• Karbon (C): Golongan IVA, Periode 2 (Nonlogam)\n• Aluminium (Al): Golongan IIIA, Periode 3 (Logam)\n• Tembaga (Cu): Golongan IB / Golongan 11 (Logam Transisi)\n• Natrium (Na): Golongan IA, Periode 3 (Logam Alkali)\n• Klorin (Cl): Golongan VIIA, Periode 3 (Halogen)",
                "Amati sifat fisiknya: tembaga dan aluminium mengkilap serta menghantarkan listrik, grafit pensil hitam tidak mengkilap.",
                "Perhatikan letak logam selalu di sebelah kiri garis batas tangga, dan nonlogam di sebelah kanan!"
            ),
            observationGoal = "Mengaitkan benda nyata di lingkungan sekitar dengan letak dan klasifikasi unsur dalam tabel periodik modern.",
            connectionToSimulation = "Bandingkan sifat unsur rumah tanggamu di simulator tabel periodik interaktif Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-tp-1",
                prompt = "Unsur Magnesium memiliki nomor atom 12 dengan konfigurasi elektron kulit (2, 8, 2). Di manakah letak unsur Magnesium dalam tabel periodik?",
                type = "multiple_choice",
                options = listOf(
                    "Golongan IIA dan Periode 3",
                    "Golongan IIIA dan Periode 2",
                    "Golongan IIA dan Periode 2",
                    "Golongan VIIIA dan Periode 3"
                ),
                correctAnswer = "Golongan IIA dan Periode 3",
                hints = listOf(
                    "Jumlah kulit elektron = nomor periode (ada 3 kulit: 2, 8, 2).",
                    "Jumlah elektron valensi terluar = nomor golongan (kulit terluar ada 2 elektron)."
                ),
                explanation = "Magnesium memiliki 3 kulit elektron yang terisi sehingga berada di Periode 3, dan memiliki 2 elektron valensi di kulit terluar sehingga berada di Golongan IIA (Logam Alkali Tanah).",
                misconception = "Tertukar antara pengertian periode (kulit) dan golongan (elektron valensi)."
            ),
            QuizQuestion(
                id = "q-tp-2",
                prompt = "Kelompok unsur yang terletak di Golongan VIIIA yang memiliki konfigurasi elektron kulit terluar penuh (stabil) dan sangat sukar bereaksi dinamakan...",
                type = "multiple_choice",
                options = listOf("Gas Mulia", "Logam Alkali", "Halogen", "Logam Transisi"),
                correctAnswer = "Gas Mulia",
                hints = listOf("Contohnya adalah Helium, Neon, Argon.", "Dinamakan 'mulia' karena keengganannya bereaksi dengan zat lain."),
                explanation = "Gas Mulia (Golongan VIIIA) memiliki susunan 8 elektron valensi (oktet) yang sangat stabil sehingga sukar bereaksi membentuk senyawa dengan unsur lain.",
                misconception = "Tertukar dengan golongan Halogen (Golongan VIIA) yang justru sangat reaktif."
            )
        )
    )

    // =========================================================================
    // 3. IKATAN KIMIA DASAR (IONIK & KOVALEN)
    // =========================================================================
    private val ikatanKimiaDasarLesson = LessonData(
        conceptId = "kim-ikatan-kimia-dasar",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pikd1",
                panelNumber = 1,
                title = "Mengapa Atom Ingin Bersatu?",
                caption = "Dimas memperhatikan kristal garam dapur di bawah kaca pembesar. Kristalnya berbentuk kubus-kubus kecil yang sangat teratur.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kek, kenapa atom-atom tidak hidup menyendiri saja? Kenapa mereka saling mengikat membentuk molekul dan kristal?",
                sceneVisualEmoji = "🧂",
                sceneDescription = "Kristal kubus garam dapur NaCl terlihat kokoh dan teratur di bawah lup."
            ),
            StoryPanel(
                id = "pikd2",
                panelNumber = 2,
                title = "Mengejar Kestabilan Kaidah Oktet",
                caption = "Kakek menjelaskan filosofi kestabilan elektron gas mulia.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Semua atom di alam mengejar satu impian: ingin stabil seperti Gas Mulia dengan 8 elektron valensi (Kaidah Oktet)! Ada yang mencapainya dengan SERAH TERIMA elektron (Ikatan Ion), dan ada yang mencapainya dengan BERBAGI / patungan elektron bersama (Ikatan Kovalen)!",
                sceneVisualEmoji = "🤝",
                sceneDescription = "Dua atom saling berjabat tangan menyatukan elektron valensi untuk mencapai kestabilan 8 elektron."
            ),
            StoryPanel(
                id = "pikd3",
                panelNumber = 3,
                title = "Garam vs Air: Dua Cara Mengikat",
                caption = "Kirana menggambar diagram serah terima elektron NaCl dan pemakaian bersama H₂O.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Natrium memberikan 1 elektronnya ke Klorin: terbentuk ion Na⁺ dan Cl⁻ yang saling tarik kuat lewat gaya elektrostatik (Ikatan Ion)! Sedangkan pada air (H₂O), atom Oksigen dan Hidrogen sama-sama patungan memakai pasangan elektron (Ikatan Kovalen)!",
                sceneVisualEmoji = "💧",
                sceneDescription = "Diagram transfer elektron ikatan ionik NaCl vs pasangan elektron bersama ikatan kovalen H2O."
            )
        ),
        intuitionTitle = "Lem Perekat Atom: Serah Terima vs Berbagi Bersama",
        intuitionBody = "Ikatan kimia adalah gaya tarik yang menyatukan atom-atom untuk mencapai konfigurasi elektron stabil:\n\n" +
                "1. Kaidah Oktet & Duplet Gilbert N. Lewis:\n" +
                "   • Atom cenderung memiliki 8 elektron valensi di kulit terluar (oktet), atau 2 elektron seperti Helium (duplet).\n\n" +
                "2. Ikatan Ionik (Elektrovalen):\n" +
                "   • Terjadi antara unsur Logam (mudah melepas elektron) dengan Nonlogam (mudah menangkap elektron).\n" +
                "   • Terjadi perpindahan (serah terima) elektron membentuk kation (+) dan anion (-).\n" +
                "   • Gaya tarik elektrostatik antar-ion menghasilkan kisi kristal padat yang keras dengan titik leleh tinggi (contoh: NaCl, MgO, CaCl₂).\n" +
                "   • Larutan atau lelehan senyawa ionik DAPAT MENGHANTARKAN LISTRIK (elektrolit).\n\n" +
                "3. Ikatan Kovalen:\n" +
                "   • Terjadi antara sesama unsur Nonlogam.\n" +
                "   • Karena keduanya sama-sama ingin menangkap elektron, mereka berbagi pasangan elektron ikatan (PEI).\n" +
                "   • Ikatan Tunggal (H-H, H-Cl, H-O-H), Ikatan Rangkap Dua (O=O, O=C=O), Ikatan Rangkap Tiga (N≡N).\n" +
                "   • Senyawa kovalen umumnya memiliki titik leleh lebih rendah dan wujud beragam (gas, cair, padat lunak).",
        intuitionPoints = listOf(
            "Air garam menghantarkan listrik karena ion Na⁺ dan Cl⁻ dapat bergerak bebas dalam air, sedangkan larutan gula kovalen tidak menghantarkan listrik.",
            "Gas nitrogen (N₂) di udara sangat stabil dan sulit bereaksi karena diikat oleh ikatan kovalen rangkap tiga (N≡N) yang luar biasa kuat.",
            "Rumus kimia senyawa ionik mencerminkan rasio ion netral (contoh: Mg²⁺ + 2 Cl⁻ → MgCl₂)."
        ),
        simId = "sim-chemical-bonding",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Ikatan Ion}",
                equation = "\\text{Na} \\rightarrow \\text{Na}^+ + e^- \\quad , \\quad \\text{Cl} + e^- \\rightarrow \\text{Cl}^- \\implies \\text{NaCl}",
                meaning = "Mekanisme serah terima elektron membentuk ikatan ionik natrium klorida.",
                units = "-",
                applicationNote = "Logam alkali IA berpasangan 1:1 dengan halogen VIIA."
            ),
            FormulaCard(
                symbol = "\\text{Ikatan Kovalen}",
                equation = "\\text{H}\\cdot + \\cdot\\text{O}\\cdot + \\cdot\\text{H} \\rightarrow \\text{H}-\\text{O}-\\text{H}",
                meaning = "Pembentukan dua ikatan kovalen tunggal pemakaian pasangan elektron bersama pada air.",
                units = "-",
                applicationNote = "Setiap garis ikatan (-) mewakili sepasang (2 buah) elektron yang dipakai bersama."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Produksi Klor-Alkali PT Asahimas Chemical Cilegon Banten",
            context = "Kawasan industri kimia Cilegon memproduksi soda api (NaOH) dan gas klorin (Cl₂) dari garam dapur NaCl sebagai bahan baku industri sabun, kertas, dan plastik pipa PVC nasional.",
            engineeringProblem = "Ikatan ionik kristal garam dapur NaCl sangat kuat dengan energi kisi 787 kJ/mol sehingga garam padat tidak menghantarkan listrik dan sulit diurai jika tidak dilarutkan.",
            physicalConceptUsed = "Disosiasi ikatan ionik dalam pelarut air menjadi ion bebas Na⁺ dan Cl⁻ terhidrasi yang memungkinkan elektrolisis sel membran chlor-alkali.",
            mathematicalModel = "Arus listrik DC mengalirkan elektron menguraikan ion: 2 NaCl + 2 H₂O → 2 NaOH + Cl₂ + H₂. Ion Cl⁻ melepaskan elektron di anoda menjadi gas klorin, sementara air tereduksi di katoda menghasilkan gas hidrogen dan ion hidroksida NaOH.",
            realWorldImpact = "Memasok 500.000 ton soda api dan klorin per tahun yang menjadi fondasi utama industri petrokimia dan manufaktur Indonesia.",
            relatedCareers = listOf("Insinyur Pabrik Klor-Alkali", "Teknisi Sel Elektrolisis Industri", "Analis Proses Petrokimia"),
            verifiedSource = "PT Asahimas Chemical Cilegon / Laporan Keberlanjutan Proses Kimia Industri."
        ),
        homeLab = HomeLabData(
            title = "Uji Daya Hantar Listrik Larutan Garam Ionik vs Larutan Gula Kovalen",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 baterai 9 Volt",
                "1 lampu LED kecil",
                "2 utas kabel dengan penjepit buaya atau kawat tembaga terbuka",
                "Gelas A: Air keran + 2 sendok garam dapur (senyawa ionik)",
                "Gelas B: Air keran + 2 sendok gula pasir (senyawa kovalen)"
            ),
            steps = listOf(
                "Rangkai sirkuit penguji: sambungkan kutub positif baterai ke salah satu kaki lampu LED dengan kabel.",
                "Sambungkan kabel lain dari kaki LED lainnya dan kutub negatif baterai sehingga ada dua ujung kawat bebas terbuka.",
                "Uji coba sentuhkan kedua ujung kawat: lampu LED menyala terang (alat uji siap).",
                "Celupkan kedua ujung kawat ke dalam Gelas A (air garam) tanpa saling bersentuhan. Amati: LAMPU LED MENYALA TERANG dan timbul gelembung gas kecil di kawat! (Senyawa ionik melepaskan ion bebas penghantar listrik).",
                "Bilas kawat, lalu celupkan ke dalam Gelas B (air gula). Amati: LAMPU LED TETAP MATI! (Senyawa kovalen larut sebagai molekul netral tanpa ion)."
            ),
            observationGoal = "Membuktikan perbedaan sifat hantaran listrik larutan elektrolit ionik vs larutan non-elektrolit kovalen.",
            connectionToSimulation = "Bandingkan aliran ion di air garam dengan simulator konduktivitas larutan Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ikd-1",
                prompt = "Ikatan yang terbentuk karena adanya gaya tarik elektrostatik antara ion positif (kation) dan ion negatif (anion) akibat serah terima elektron disebut...",
                type = "multiple_choice",
                options = listOf("Ikatan Ionik", "Ikatan Kovalen", "Ikatan Hidrogen", "Ikatan Logam"),
                correctAnswer = "Ikatan Ionik",
                hints = listOf("Terjadi antara logam dan nonlogam.", "Contohnya adalah ikatan pada garam dapur NaCl."),
                explanation = "Ikatan ionik terjadi melalui proses serah terima elektron dari atom logam ke atom nonlogam sehingga terbentuk kation dan anion yang saling tarik-menarik elektrostatik.",
                misconception = "Tertukar dengan ikatan kovalen yang memakai pasangan elektron bersama."
            ),
            QuizQuestion(
                id = "q-ikd-2",
                prompt = "Pada molekul gas oksigen (O₂), kedua atom oksigen saling berbagi 2 pasang elektron (4 elektron bersama). Jenis ikatan kovalen apakah yang terbentuk?",
                type = "multiple_choice",
                options = listOf("Ikatan Kovalen Rangkap Dua", "Ikatan Kovalen Tunggal", "Ikatan Kovalen Rangkap Tiga", "Ikatan Ionik"),
                correctAnswer = "Ikatan Kovalen Rangkap Dua",
                hints = listOf("Ada 2 pasang elektron yang dipakai bersama (O=O).", "Dua garis ikatan."),
                explanation = "Pemakaian bersama dua pasang elektron ikatan menghasilkan ikatan kovalen rangkap dua (O=O).",
                misconception = "Mengira ikatan pada O₂ adalah ikatan kovalen tunggal."
            )
        )
    )

    // =========================================================================
    // 4. RUMUS KIMIA & PENYETARAAN REAKSI SEDERHANA
    // =========================================================================
    private val rumusPersamaanReaksiLesson = LessonData(
        conceptId = "kim-rumus-persamaan-reaksi",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "prp1",
                panelNumber = 1,
                title = "Membakar Gas Elpiji di Kompor Dapur",
                caption = "Kirana menyalakan kompor gas dapur saat membantu Ibu memasak nasi goreng. Api biru menyala bersih dan tenang.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Gas elpiji di tabung melon 3 kg itu isinya propana (C₃H₈). Bagaimana kita menuliskan reaksi gas elpiji yang terbakar habis?",
                sceneVisualEmoji = "🍳",
                sceneDescription = "Kompor gas menyala dengan lidah api biru stabil membakar gas propana."
            ),
            StoryPanel(
                id = "prp2",
                panelNumber = 2,
                title = "Hukum Kekekalan Massa Lavoisier",
                caption = "Kakek menuliskan persamaan reaksi di papan tulis kecil di samping dapur.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Antoine Lavoisier membuktikan: Atom tidak dapat diciptakan atau dimusnahkan dalam reaksi kimia! Jumlah atom di ruas kiri (Reaktan) HARUS SAMA PERSIS dengan jumlah atom di ruas kanan (Produk). Itulah mengapa kita harus menyetarakan koefisien reaksinya!",
                sceneVisualEmoji = "⚖️",
                sceneDescription = "Timbangan neraca seimbang antara jumlah atom reaktan di kiri dan produk di kanan."
            ),
            StoryPanel(
                id = "prp3",
                panelNumber = 3,
                title = "Menyetarakan Jumlah Atom",
                caption = "Kirana menghitung jumlah atom karbon, hidrogen, dan oksigen di kedua sisi tanda panah.",
                dialogueSpeaker = "Kirana",
                dialogueText = "C₃H₈ + 5 O₂ → 3 CO₂ + 4 H₂O! Ada 3 atom C di kiri dan kanan, 8 atom H di kiri dan kanan, serta 10 atom O di kiri dan kanan! Reaksi kini telah setara seimbang sempurna!",
                sceneVisualEmoji = "✍️",
                sceneDescription = "Persamaan reaksi setara dengan angka koefisien berwarna kontras."
            )
        ),
        intuitionTitle = "Neraca Atom: Bahasa Penyetaraan Reaksi Kimia",
        intuitionBody = "Persamaan reaksi kimia adalah bahasa universal ilmuwan untuk mendokumentasikan perubahan materi:\n\n" +
                "1. Struktur Persamaan Reaksi:\n" +
                "   Reaktan (Zat Pereaksi) → Produk (Zat Hasil Reaksi).\n" +
                "   • Fase Wujud Zat: (s) = padat (solid), (l) = cair murni (liquid), (g) = gas, (aq) = larutan dalam air (aqueous).\n\n" +
                "2. Angka Indeks vs Angka Koefisien:\n" +
                "   • Angka Indeks (angka kecil di bawah): Menunjukkan jumlah atom dalam 1 molekul (H₂O artinya ada 2 atom H dan 1 atom O). ANGKA INDEKS TIDAK BOLEH DIUBAH SAMA SEKALI saat menyetarakan reaksi!\n" +
                "   • Angka Koefisien (angka besar di depan molekul): Menunjukkan perbandingan jumlah molekul (2 H₂O artinya ada 2 molekul air = total 4 atom H dan 2 atom O). Menyetarakan reaksi HANYA DILAKUKAN DENGAN MENGUBAH ANGKA KOEFISIEN!\n\n" +
                "3. Tahapan Menyetarakan Reaksi:\n" +
                "   • Setarakan atom logam terlebih dahulu.\n" +
                "   • Setarakan atom nonlogam (selain H dan O).\n" +
                "   • Setarakan atom Hidrogen (H).\n" +
                "   • Terakhir, setarakan atom Oksigen (O).",
        intuitionPoints = listOf(
            "Mengubah angka indeks rumus kimia sama saja dengan mengubah zat menjadi zat lain yang berbeda sama sekali (misal mengubah H₂O menjadi H₂O₂ yang merupakan zat pemutih beracun!).",
            "Koefisien 1 biasanya tidak perlu ditulis dalam persamaan kimia.",
            "Perbandingan koefisien reaksi yang setara juga mewakili perbandingan jumlah partikel dan perbandingan volume gas pada suhu dan tekanan yang sama (Hukum Gay-Lussac)."
        ),
        simId = "sim-balancing-equations",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Reaksi Setara}",
                equation = "\\text{C}_3\\text{H}_8(g) + 5\\text{O}_2(g) \\rightarrow 3\\text{CO}_2(g) + 4\\text{H}_2\\text{O}(g)",
                meaning = "Persamaan pembakaran sempurna gas propana yang telah setara seimbang.",
                units = "Perbandingan mol molekul 1 : 5 : 3 : 4",
                applicationNote = "Jumlah atom sebelum dan sesudah reaksi kekal: 3C, 8H, 10O."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pabrik Pupuk Urea PT Pupuk Kujang Cikampek Jawa Barat",
            context = "PT Pupuk Kujang memproduksi jutaan ton pupuk urea (CO(NH₂)₂) per tahun untuk menjamin ketahanan pangan pertanian padi nasional.",
            engineeringProblem = "Reaksi sintesis gas amonia dan karbondioksida menjadi pupuk urea harus dihitung secara akurat agar tidak ada gas amonia beracun yang terbuang percuma ke udara bebas.",
            physicalConceptUsed = "Hukum Penyetaraan Reaksi Kimia dan stoikiometri sintesis urea industri: 2 NH₃(g) + CO₂(g) → CO(NH₂)₂(s) + H₂O(l).",
            mathematicalModel = "Reaktor tekanan tinggi 150 atmosfer menyuplai gas amonia dan CO₂ tepat dengan rasio molar stoikiometri 2 : 1. Ketidakseimbangan rasio koefisien memicu penurunan konversi reaksi hingga 25% dan kerugian miliaran rupiah bahan baku.",
            realWorldImpact = "Menjamin pasokan pupuk urea terjangkau bagi jutaan petani sawah di seluruh pulau Jawa dan Sumatera.",
            relatedCareers = listOf("Insinyur Reaktor Pabrik Pupuk", "Operator Kendali Proses Petrokimia", "Analis Efisiensi Bahan Baku Kimia"),
            verifiedSource = "PT Pupuk Kujang Cikampek / Laporan Tahunan Operasional Pabrik Kujang 1B."
        ),
        homeLab = HomeLabData(
            title = "Menyetarakan Model Reaksi Kimia Menggunakan Tutup Botol Warna-Warni",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Tutup botol plastik aneka warna (atau kancing baju):\n• 10 tutup botol Merah (Atom Oksigen)\n• 10 tutup botol Putih (Atom Hidrogen)",
                "Selembar kertas besar bertuliskan tanda panah reaksi: H₂ + O₂ → H₂O"
            ),
            steps = listOf(
                "Buat reaktan di ruas kiri: 1 pasang tutup putih (molekul H₂) dan 1 pasang tutup merah (molekul O₂).",
                "Buat produk di ruas kanan: 1 molekul air H₂O (2 tutup putih menempel pada 1 tutup merah).",
                "Hitung jumlah tutup botol di kiri vs kanan:\n• Hidrogen: kiri ada 2, kanan ada 2 (cocok!)\n• Oksigen: kiri ada 2, kanan HANYA ADA 1 (belum seimbang!).",
                "Tambahkan 1 molekul air lagi di kanan (sekarang ada 2 H₂O = 4 putih, 2 merah).",
                "Sekarang oksigen sudah seimbang (2 di kiri, 2 di kanan). Tapi hidrogen di kanan ada 4, sedangkan di kiri baru 2!",
                "Tambahkan 1 molekul H₂ lagi di kiri. Sekarang di kiri ada 2 molekul H₂ (4 putih) dan 1 molekul O₂ (2 merah).",
                "SEIMBANG! Tulis koefisiennya: 2 H₂ + O₂ → 2 H₂O!"
            ),
            observationGoal = "Memahami secara visual bahwa menyetarakan reaksi dilakukan dengan menambah jumlah utuh molekul (koefisien), bukan memotong atau memecah atom.",
            connectionToSimulation = "Bandingkan penyetaraan tutup botolmu dengan neraca timbangan di simulator reaksi Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-rpr-1",
                prompt = "Perhatikan persamaan reaksi belum setara berikut: a N₂(g) + b H₂(g) → c NH₃(g). Berapakah nilai koefisien a, b, dan c berturut-turut agar reaksi tersebut setara?",
                type = "multiple_choice",
                options = listOf("1, 3, dan 2", "2, 3, dan 1", "1, 2, dan 2", "2, 6, dan 4"),
                correctAnswer = "1, 3, dan 2",
                hints = listOf(
                    "Di kiri ada 2 atom N (N₂), sehingga di kanan harus ada 2 molekul NH₃ (c = 2).",
                    "Jika c = 2, maka di kanan ada 2 × 3 = 6 atom H.",
                    "Agar di kiri ada 6 atom H dari H₂, maka koefisien b haruslah 6 / 2 = ...?"
                ),
                explanation = "N₂ + 3 H₂ → 2 NH₃. Jumlah atom N di kiri = 2, di kanan = 2. Jumlah atom H di kiri = 3 × 2 = 6, di kanan = 2 × 3 = 6. Reaksi setara dengan a = 1, b = 3, dan c = 2.",
                misconception = "Mengubah rumus NH₃ menjadi NH₂ agar koefisiennya sama (mengubah indeks adalah kesalahan fatal!)."
            ),
            QuizQuestion(
                id = "q-rpr-2",
                prompt = "Hukum dasar kimia yang menjadi landasan wajibnya penyetaraan jumlah atom pada persamaan reaksi kimia adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Hukum Kekekalan Massa Lavoisier",
                    "Hukum Gravitasi Newton",
                    "Hukum Ohm",
                    "Hukum Pascal"
                ),
                correctAnswer = "Hukum Kekekalan Massa Lavoisier",
                hints = listOf("Menyatakan bahwa massa zat sebelum dan sesudah reaksi kimia selalu sama.", "Dikemukakan oleh Antoine Lavoisier."),
                explanation = "Hukum Kekekalan Massa menyatakan bahwa massa total zat sebelum dan sesudah reaksi kimia tidak berubah karena atom-atom hanya mengatur ulang ikatannya tanpa ada atom yang musnah atau tercipta baru.",
                misconception = "Mengira penyetaraan reaksi hanyalah aturan matematika tanpa dasar hukum fisis nyata."
            )
        )
    )

    // =========================================================================
    // 5. LARUTAN ASAM, BASA & SKALA pH
    // =========================================================================
    private val acidBaseLesson = LessonData(
        conceptId = "kim-asam-basa",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pk1",
                panelNumber = 1,
                title = "Misteri Teh Lemon & Air Sabun",
                caption = "Kirana sedang minum teh manis hangat di dapur. Bu Ratna sedang mencuci piring dengan air sabun di sampingnya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ibu! Saat aku tetesi perasan lemon, warna teh cokelat gelap ini mendadak berubah menjadi kuning terang keemasan!",
                sceneVisualEmoji = "🍋",
                sceneDescription = "Cangkir teh berubah warna saat ditetesi asam sitrat dari perasan lemon."
            ),
            StoryPanel(
                id = "pk2",
                panelNumber = 2,
                title = "Indikator Asam & Basa",
                caption = "Kakek tersenyum dan mengambil sepotong rimpang kunyit parut serta air sabun.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Banyak senyawa di alam adalah indikator alami! Asam melepas ion hidrogen H⁺ dan memberi rasa masam, sedangkan basa melepas ion hidroksida OH⁻, terasa licin, dan mengubah warna kunyit menjadi merah bata.",
                sceneVisualEmoji = "🧪",
                sceneDescription = "Perubahan warna cairan kunyit kuning menjadi merah tua saat terkena sabun basa."
            ),
            StoryPanel(
                id = "pk3",
                panelNumber = 3,
                title = "Skala pH: Rahasia Angka 7",
                caption = "Dimas memperlihatkan alat pH meter digital portabel dan mencelupkannya ke gelas.",
                dialogueSpeaker = "Dimas",
                dialogueText = "pH 7 adalah titik netral seimbang air murni. Di bawah 7 sifatnya asam, di atas 7 sifatnya basa. Setiap selisih 1 angka pH mewakili perbedaan kepekatan 10 KALI LIPAT!",
                sceneVisualEmoji = "📊",
                sceneDescription = "Skala pH pelangi dari angka 0 (merah asam) hingga 14 (ungu basa)."
            ),
            StoryPanel(
                id = "pk4",
                panelNumber = 4,
                title = "Reaksi Netralisasi Ajaib",
                caption = "Kirana meneteskan air lemon asam ke dalam air soda kue basa secara perlahan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lihat ada gelembung gas dan buih kecil! Saat asam dan basa bercampur seimbang, mereka saling menetralkan menjadi garam dan air murni!",
                sceneVisualEmoji = "✨",
                sceneDescription = "Reaksi netralisasi asam basa menghasilkan air murni dan garam netral."
            )
        ),
        intuitionTitle = "Pertarungan Ion H⁺ vs Ion OH⁻",
        intuitionBody = "Sifat asam dan basa di tingkat partikel mikroskopis ditentukan oleh konsentrasi ion:\n\n" +
                "• ASAM: Menghasilkan kelebihan ion hidrogen [H⁺] (atau hidronium H₃O⁺). Rasa masam, korosif pada logam, mengubah lakmus biru menjadi merah.\n" +
                "• BASA: Menghasilkan kelebihan ion hidroksida [OH⁻]. Terasa licin seperti sabun, pahit, mengubah lakmus merah menjadi biru.\n" +
                "• NETRAL (pH = 7,0): Jumlah ion [H⁺] tepat sama banyak dengan ion [OH⁻], seperti pada air murni (H₂O = H⁺ + OH⁻).",
        intuitionPoints = listOf(
            "Skala pH bersifat logaritmik: larutan pH 3 memiliki ion H⁺ sepuluh kali (10×) lebih banyak dibanding larutan pH 4!",
            "Reaksi Asam + Basa → Garam + Air dinamakan Reaksi Netralisasi.",
            "Indikator universal dan pH meter digital membaca kekuatan pH secara kuantitatif 0–14."
        ),
        simId = "sim-acid-base",
        formulas = listOf(
            FormulaCard(
                symbol = "pH",
                equation = "\\text{pH} = -\\log[H^+]",
                meaning = "Derajat keasaman larutan dari konsentrasi ion hidrogen.",
                units = "Skala tanpa satuan (0 .. 14)",
                applicationNote = "pH < 7 asam, pH = 7 netral, pH > 7 basa."
            ),
            FormulaCard(
                symbol = "K_w",
                equation = "[H^+][OH^-] = 10^{-14} \\quad (\\text{pada } 25^\\circ\\text{C})",
                meaning = "Konstanta hasil kali ion air pada suhu ruang.",
                units = "M² (Molar kuadrat)",
                applicationNote = "Jika [H⁺] = 10⁻³ M (pH 3), maka [OH⁻] otomatis 10⁻¹¹ M (pOH 11)."
            ),
            FormulaCard(
                symbol = "Netralisasi",
                equation = "\\text{HCl} + \\text{NaOH} \\rightarrow \\text{NaCl} + \\text{H}_2\\text{O}",
                meaning = "Asam kuat + Basa kuat bereaksi sempurna menjadi garam dapur dan air netral.",
                units = "Persamaan stoikiometri reaksi",
                applicationNote = "Prinsip dasar titrasi asam basa di laboratorium dan industri."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Netralisasi Air Limbah Industri Tekstil & Penjernihan PDAM",
            context = "Instalasi Pengolahan Air Limbah (IPAL) pabrik pencelupan kain di Majalaya membuang limbah cair bersifat basa kuat (pH ≈ 11,5) ke anak Sungai Citarum Jawa Barat.",
            engineeringProblem = "Air dengan pH di atas 9 merusak ekosistem sungai dan membunuh populasi ikan serta mikroorganisme air. Sebelum dibuang, limbah wajib dinetralkan ke kisaran aman baku mutu pH 6,0–8,5.",
            physicalConceptUsed = "Prinsip titrasi penetralan asam-basa industri otomatis dan koagulasi flokulasi.",
            mathematicalModel = "Sensor probe pH mengatur debit injeksi asam sulfat encer H₂SO₄ secara proporsional otomatis menggunakan algoritma PID controller untuk mencapai kesetimbangan netral.",
            realWorldImpact = "Menyelamatkan ribuan hektar sawah dari kontaminasi kimia dan menjamin baku mutu air baku pengolahan air minum warga Jawa Barat.",
            relatedCareers = listOf("Insinyur Kimia Lingkungan", "Operator IPAL Industri", "Analis Laboratorium Kualitas Air"),
            verifiedSource = "Kementerian Lingkungan Hidup dan Kehutanan (KLHK) RI / Program Citarum Harum."
        ),
        homeLab = HomeLabData(
            title = "Uji Indikator Alami Air Kunyit & Ekstrak Bunga Telang",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 ruas kunyit diparut dan dilarutkan dalam 3 sendok air hangat",
                "1 cangkir perasan jeruk nipis atau cuka dapur (Asam)",
                "1 cangkir air sabun mandi atau deterjen (Basa)",
                "1 cangkir air putih murni (Netral)",
                "3 gelas plastik bening dan sendok teh"
            ),
            steps = listOf(
                "Langkah 1: Masukkan 1 sendok teh larutan kunyit kuning ke dalam gelas asam (air cuka). Amati: warna tetap kuning terang keemasan!",
                "Langkah 2: Masukkan 1 sendok teh larutan kunyit ke dalam gelas netral (air murni). Warnanya kuning oranye stabil.",
                "Langkah 3: Masukkan 1 sendok teh larutan kunyit ke dalam gelas basa (air sabun). Amati: warna seketika berubah merah bata tua pekat!",
                "Langkah 4: Teteskan cuka kembali ke gelas sabun yang berwarna merah bata sampai warnanya kembali kuning (Netralisasi terjadi!)."
            ),
            observationGoal = "Membuktikan bahwa pigmen alami kurkumin pada kunyit bertindak sebagai indikator asam-basa alami yang peka terhadap ion H⁺ dan OH⁻.",
            connectionToSimulation = "Bandingkan perubahan warna cairan kunyit dengan bejana kimia pada simulator interaktif di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kim-1",
                prompt = "Berapakah nilai pH dari air murni netral pada suhu ruang 25°C?",
                type = "numeric",
                correctAnswer = "7.0",
                tolerance = 0.2f,
                unit = "pH",
                hints = listOf(
                    "Air murni memiliki jumlah ion [H⁺] sama persis dengan ion [OH⁻].",
                    "Konsentrasi ionnya adalah 10⁻⁷ M.",
                    "pH = -log(10⁻⁷) = ...?"
                ),
                explanation = "Air murni memiliki pH tepat 7,0 karena konsentrasi [H⁺] = 10⁻⁷ M, sehingga pH = -log(10⁻⁷) = 7,0.",
                misconception = "Mengira netral adalah 0. Padahal pH 0 adalah asam yang luar biasa pekat!"
            ),
            QuizQuestion(
                id = "q-kim-2",
                prompt = "Larutan A memiliki pH = 2 dan Larutan B memiliki pH = 4. Berapa kali lipat ion H⁺ pada Larutan A lebih banyak dibanding Larutan B?",
                type = "multiple_choice",
                options = listOf("2 kali lipat", "10 kali lipat", "100 kali lipat", "1.000 kali lipat"),
                correctAnswer = "100 kali lipat",
                hints = listOf(
                    "Ingat bahwa skala pH bersifat logaritmik basis 10.",
                    "Selisih 1 angka pH = beda 10 kali lipat.",
                    "Selisih 2 angka pH (4 - 2 = 2) = beda 10² = ...?"
                ),
                explanation = "Karena skala logaritma basis 10, selisih 2 skala pH berarti konsentrasi ion H⁺ berbeda 10² = 100 kali lipat.",
                misconception = "Mengira selisihnya hanya 2 kali lipat secara aritmatika biasa."
            )
        )
    )

    // =========================================================================
    // 6. REAKSI KIMIA SEHARI-HARI & KOROSI
    // =========================================================================
    private val reaksiKehidupanLesson = LessonData(
        conceptId = "kim-reaksi-kehidupan",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "prk1",
                panelNumber = 1,
                title = "Pagar Besi Rumah Tepi Pantai",
                caption = "Pagar besi rumah Kakek di pesisir Pantai Anyer berkarat merah kecokelatan rapuh hanya dalam waktu beberapa bulan.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Pagar ini padahal tebal dan kokoh, tapi kenapa cepat sekali keropos berkarat dibanding pagar rumah kita di Jakarta?",
                sceneVisualEmoji = "⚓",
                sceneDescription = "Pagar besi pantai berkarat keropos akibat hembusan uap garam air laut."
            ),
            StoryPanel(
                id = "prk2",
                panelNumber = 2,
                title = "Korosi: Reaksi Redoks Perkaratan",
                caption = "Kakek menjelaskan proses elektrokimia perkaratan besi.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Perkaratan adalah reaksi kimia Oksidasi! Besi (Fe) bereaksi dengan gas Oksigen (O₂) dan uap air (H₂O) membentuk senyawa karat besi terhidrasi Fe₂O₃·xH₂O. Ion garam di udara pantai bertindak sebagai elektrolit yang mempercepat aliran elektron korosi berkali-kali lipat!",
                sceneVisualEmoji = "🔬",
                sceneDescription = "Diagram sel mikroskopis perkaratan besi dengan anoda Fe dan katoda reduksi oksigen."
            ),
            StoryPanel(
                id = "prk3",
                panelNumber = 3,
                title = "Mencegah Karat & Reaksi Pembakaran",
                caption = "Kirana memperhatikan tiang lampu dermaga yang dilapisi cat tebal dan lapisan seng galvanis.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kita bisa mencegah perkaratan dengan melapisi besi! Mengecat, melumuri oli, atau proses galvanisasi (pelapisan seng Zn) melindungi permukaan besi agar tidak bersentuhan langsung dengan udara basah!",
                sceneVisualEmoji = "🛡️",
                sceneDescription = "Pelapisan seng galvanis melindungi baja dari kontak langsung dengan udara lembap."
            )
        ),
        intuitionTitle = "Reaksi di Sekeliling Kita: Pembakaran, Korosi & Kehidupan",
        intuitionBody = "Reaksi kimia berlangsung tanpa henti di alam sekitar kita:\n\n" +
                "1. Reaksi Pembakaran (Combustion):\n" +
                "   • Reaksi cepat senyawa bahan bakar hidrokarbon dengan gas oksigen (O₂) yang melepaskan energi panas (eksoterm) dan cahaya.\n" +
                "   • Pembakaran Sempurna: Menghasilkan gas CO₂ dan uap H₂O tanpa asap (api biru).\n" +
                "   • Pembakaran Tidak Sempurna: Terjadi jika oksigen terbatas, menghasilkan gas Karbon Monoksida (CO) beracun dan jelaga hitam (C) yang berbahaya.\n\n" +
                "2. Reaksi Korosi (Perkaratan Besi):\n" +
                "   • Besi teroksidasi: 4 Fe + 3 O₂ + 2x H₂O → 2 Fe₂O₃·xH₂O (karat besi).\n" +
                "   • Faktor percepat korosi: Kelembaban air, gas asam (hujan asam SO₂/NOx), dan elektrolit garam.\n" +
                "   • Cara Pencegahan Korosi: Pengecatan, pelumuran oli/gemuk, pelapisan krom/timah, galvanisasi (lapisan seng), dan proteksi katodik (mengorbankan logam magnesium Mg).\n\n" +
                "3. Reaksi Biokimia Kehidupan:\n" +
                "   • Fotosintesis (Tumbuhan): 6 CO₂ + 6 H₂O + Cahaya → C₆H₁₂O₆ (glukosa) + 6 O₂.\n" +
                "   • Respirasi Seluler (Hewan & Manusia): C₆H₁₂O₆ + 6 O₂ → 6 CO₂ + 6 H₂O + Energi ATP.",
        intuitionPoints = listOf(
            "Gas Karbon Monoksida (CO) hasil knalpot kendaraan bermotor sangat berbahaya karena berikatan 200 kali lebih kuat dengan hemoglobin darah dibanding oksigen.",
            "Aluminium (Al) sebenarnya juga mengalami korosi di udara, namun lapisan tipis oksida Al₂O₃ yang terbentuk justru bersifat rapat dan melindungi lapisan dalam aluminium dari korosi lebih lanjut!",
            "Reaksi fotosintesis dan respirasi membentuk siklus tertutup sempurna yang menjaga keseimbangan kadar oksigen dan karbondioksida di atmosfer bumi."
        ),
        simId = "sim-chemical-reactions",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Korosi Besi}",
                equation = "4\\text{Fe}(s) + 3\\text{O}_2(g) + 2x\\text{H}_2\\text{O}(l) \\rightarrow 2\\text{Fe}_2\\text{O}_3\\cdot x\\text{H}_2\\text{O}(s)",
                meaning = "Persamaan pembentukan karat besi terhidrasi berwarna cokelat kemerahan.",
                units = "-",
                applicationNote = "Membutuhkan keberadaan air dan oksigen secara simultan."
            ),
            FormulaCard(
                symbol = "\\text{Fotosintesis}",
                equation = "6\\text{CO}_2 + 6\\text{H}_2\\text{O} \\xrightarrow{\\text{klorofil/cahaya}} \\text{C}_6\\text{H}_{12}\\text{O}_6 + 6\\text{O}_2",
                meaning = "Reaksi biokimia pembentukan glukosa makanan dan gas oksigen oleh tumbuhan hijau.",
                units = "-",
                applicationNote = "Kebalikan langsung dari reaksi pembakaran respirasi seluler."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Proteksi Katodik Anoda Korban Jembatan Nasional Suramadu Jawa Timur",
            context = "Jembatan Suramadu membentang 5,4 km melintasi Selat Madura dengan pilar tiang pancang baja yang tertancap di air laut asin berkadar garam tinggi.",
            engineeringProblem = "Air laut Selat Madura yang kaya ion klorida mempercepat laju korosi tiang pancang baja hingga 5 kali lipat yang dapat meruntuhkan fondasi jembatan dalam 15 tahun jika tanpa proteksi.",
            physicalConceptUsed = "Sistem Proteksi Katodik Anoda Korban (Sacrificial Anode Cathodic Protection / SACP) menggunakan logam dengan potensial reduksi lebih negatif.",
            mathematicalModel = "Blok logam Paduan Aluminium-Seng-Indium (Al-Zn-In) dilas mengitari tiang pancang baja bawah laut. Logam anoda korban mengorbankan dirinya teroksidasi lebih dahulu melepaskan elektron, menjaga potensial baja tetap di bawah -850 mV (kondisi imun katodik aman).",
            realWorldImpact = "Menjamin usia pakai struktur Jembatan Suramadu mencapai desain umur 100 tahun tanpa risiko runtuh akibat korosi air laut.",
            relatedCareers = listOf("Insinyur Korosi & Material Maritim", "Inspektur NDT Bawah Laut", "Konsultan Pemeliharaan Infrastruktur"),
            verifiedSource = "Kementerian PUPR Balai Besar Pelaksanaan Jalan Nasional Jawa Timur / Dokumen Pemeliharaan Suramadu."
        ),
        homeLab = HomeLabData(
            title = "Menguji Faktor Penyebab Karat pada Paku Besi dalam 4 Kondisi",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "4 buah paku besi baru yang masih mengkilap tanpa karat",
                "4 gelas plastik kecil bening bertutup plastik (atau ditutup plastik wrap)",
                "Air keran biasa, air garam, minyak goreng dapur, dan sedikit beras/kapur kering"
            ),
            steps = listOf(
                "Gelas 1 (Air + Udara): Masukkan paku ke dalam setengah gelas air keran terbuka.",
                "Gelas 2 (Air Garam + Udara): Masukkan paku ke dalam air keran yang dilarutkan 1 sendok garam dapur.",
                "Gelas 3 (Hanya Minyak Goreng - Tanpa Air & Udara): Masukkan paku terendam seluruhnya di dalam minyak goreng.",
                "Gelas 4 (Hanya Udara Kering): Masukkan paku ke dalam gelas kering tertutup rapat bersama segenggam beras/silika pengering.",
                "Diamkan selama 3-4 hari di tempat aman. Amati paku mana yang paling cepat berkarat!",
                "Hasil: Paku di air garam berkarat paling parah dan cepat, paku di air biasa berkarat sedang, sedangkan paku di minyak goreng dan udara kering TETAP MENGKILAP TANPA KARAT!"
            ),
            observationGoal = "Membuktikan bahwa perkaratan besi membutuhkan AIR DAN OKSIGEN sekaligus, dan garam mempercepat laju reaksi korosi.",
            connectionToSimulation = "Bandingkan laju reaksi paku dengan simulator korosi elektrokimia Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-rk-1",
                prompt = "Dua faktor utama di lingkungan yang WAJIB ada secara bersamaan agar logam besi dapat mengalami perkaratan (korosi) adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Oksigen dan Air (kelembaban)",
                    "Minyak dan Gas Nitrogen",
                    "Cahaya matahari dan Karbondioksida",
                    "Suhu panas dan Garam dapur"
                ),
                correctAnswer = "Oksigen dan Air (kelembaban)",
                hints = listOf("Besi yang direndam dalam minyak tanpa udara tidak berkarat.", "Besi di udara kering tanpa uap air juga tidak berkarat."),
                explanation = "Perkaratan besi adalah reaksi elektrokimia yang memerlukan kehadiran oksigen (sebagai penerima elektron di katoda) dan air/kelembaban (sebagai medium elektrolit).",
                misconception = "Mengira besi bisa berkarat hanya karena terkena udara kering tanpa air."
            ),
            QuizQuestion(
                id = "q-rk-2",
                prompt = "Mengapa pembakaran tidak sempurna pada kompor atau knalpot kendaraan yang menghasilkan gas Karbon Monoksida (CO) sangat berbahaya bagi kesehatan manusia?",
                type = "multiple_choice",
                options = listOf(
                    "Karena gas CO mengikat hemoglobin darah jauh lebih kuat dibanding oksigen sehingga tubuh kekurangan oksigen",
                    "Karena gas CO membuat mata perih dan berair",
                    "Karena gas CO memiliki bau busuk yang menyengat",
                    "Karena gas CO langsung merusak lapisan ozon di paru-paru"
                ),
                correctAnswer = "Karena gas CO mengikat hemoglobin darah jauh lebih kuat dibanding oksigen sehingga tubuh kekurangan oksigen",
                hints = listOf("Gas CO tidak berwarna dan tidak berbau (silent killer).", "Hemoglobin darah lebih suka mengikat CO daripada O₂."),
                explanation = "Gas CO memiliki afinitas pengikatan terhadap hemoglobin darah sekitar 200–250 kali lebih kuat dibanding oksigen. Akibatnya darah tidak mampu mengangkut oksigen ke otak dan organ vital, yang berakibat lemas hingga kematian.",
                misconception = "Mengira gas CO berbahaya karena memiliki bau yang menyengat, padahal gas CO tidak berbau sama sekali."
            )
        )
    )
}

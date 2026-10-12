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

object BiologyLevel1Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "bio-ciri-hidup",
            domain = Domain.BIOLOGI,
            topic = "Dasar Kehidupan",
            title = "Ciri-Ciri Makhluk Hidup",
            description = "Mengenal 8 ciri esensial kehidupan: bernapas, butuh nutrisi, bergerak, tumbuh kembang, bereproduksi, peka rangsang (iritabilitas), ekskresi, dan adaptasi.",
            level = DepthLevel.L1,
            estMinutes = 11,
            prerequisites = emptyList()
        ),
        ConceptItem(
            id = "bio-klasifikasi-dasar",
            domain = Domain.BIOLOGI,
            topic = "Keanekaragaman Hayati",
            title = "Klasifikasi Hewan & Tumbuhan Sederhana",
            description = "Membedakan hewan bertulang belakang (vertebrata) vs tak bertulang (avertebrata), tumbuhan berkeping satu (monokotil) vs dua (dikotil), jamur, dan mikroba.",
            level = DepthLevel.L1,
            estMinutes = 12,
            prerequisites = listOf("bio-ciri-hidup")
        ),
        ConceptItem(
            id = "bio-bagian-tubuh",
            domain = Domain.BIOLOGI,
            topic = "Morfologi Makhluk Hidup",
            title = "Bagian Tubuh Tumbuhan & Hewan",
            description = "Fungsi akar penopang, batang pengangkut, daun klorofil, bunga pembiak, biji, serta alat gerak adaptif hewan di darat, air, dan udara.",
            level = DepthLevel.L1,
            estMinutes = 12,
            prerequisites = listOf("bio-ciri-hidup")
        ),
        ConceptItem(
            id = "bio-rantai-makanan",
            domain = Domain.BIOLOGI,
            topic = "Ekologi Dasar",
            title = "Habitat & Rantai Makanan Alami",
            description = "Aliran energi dari sinar matahari ke produsen autotrof, konsumen bertingkat (herbivora, karnivora, predator), hingga pengurai dekomposer.",
            level = DepthLevel.L1,
            estMinutes = 12,
            prerequisites = listOf("bio-bagian-tubuh")
        ),
        ConceptItem(
            id = "bio-panca-indera",
            domain = Domain.BIOLOGI,
            topic = "Anatomi Manusia Dasar",
            title = "Panca Indera & Kesehatan Tubuh",
            description = "Fungsi lima indera pelindung tubuh (mata, telinga, hidung, lidah, kulit), mekanisme penerimaan rangsang lingkungan, dan kebiasaan hidup bersih higienis.",
            level = DepthLevel.L1,
            estMinutes = 11,
            prerequisites = listOf("bio-ciri-hidup")
        ),
        ConceptItem(
            id = "bio-daur-hidup",
            domain = Domain.BIOLOGI,
            topic = "Perkembangan Hewan",
            title = "Daur Hidup & Metamorfosis Hewan",
            description = "Metamorfosis sempurna (telur-larva-pupa-imago pada kupu-kupu dan katak) vs metamorfosis tidak sempurna (telur-nimfa-dewasa pada belalang), serta siklus mamalia.",
            level = DepthLevel.L1,
            estMinutes = 12,
            prerequisites = listOf("bio-ciri-hidup")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "bio-ciri-hidup" -> ciriHidupLesson
            "bio-klasifikasi-dasar" -> klasifikasiDasarLesson
            "bio-bagian-tubuh" -> bagianTubuhLesson
            "bio-rantai-makanan" -> rantaiMakananLesson
            "bio-panca-indera" -> pancaInderaLesson
            "bio-daur-hidup" -> daurHidupLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. CIRI-CIRI MAKHLUK HIDUP
    // =========================================================================
    private val ciriHidupLesson = LessonData(
        conceptId = "bio-ciri-hidup",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pch1",
                panelNumber = 1,
                title = "Putri Malu yang Menguncup",
                caption = "Kirana dan Dimas berjalan di pematang kebun Kakek. Ujung sepatu Dimas tak sengaja menyenggol tanaman putri malu.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Wah, ajaib! Daun putri malu ini langsung menguncup rapat begitu kusentuh! Apakah tanaman ini bisa merasakan sentuhan?",
                sceneVisualEmoji = "🌿",
                sceneDescription = "Daun putri malu (Mimosa pudica) menguncup seketika saat disentuh jari."
            ),
            StoryPanel(
                id = "pch2",
                panelNumber = 2,
                title = "Iritabilitas: Peka Terhadap Rangsang",
                caption = "Kakek tersenyum memperhatikan ketakjuban cucu-cucunya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itu bukti tanaman adalah MAKHLUK HIDUP! Makhluk hidup memiliki ciri iritabilitas: peka dan menanggapi rangsang dari lingkungan, baik berupa sentuhan, cahaya matahari, atau air!",
                sceneVisualEmoji = "💡",
                sceneDescription = "Tanaman bertumbuh condong ke arah jendela cahaya matahari (fototropisme)."
            ),
            StoryPanel(
                id = "pch3",
                panelNumber = 3,
                title = "Delapan Tanda Kehidupan",
                caption = "Kirana mencatat delapan ciri yang membedakan makhluk hidup dari batu dan benda mati.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Batu tidak bernapas, tidak butuh makan, dan tidak tumbuh besar. Tetapi kucing, burung, pohon mangga, dan kita bernapas, mencerna nutrisi, bergerak, bertumbuh, bereproduksi menghasilkan keturunan, mengeluarkan zat sisa, dan beradaptasi!",
                sceneVisualEmoji = "🌱",
                sceneDescription = "Ilustrasi bibit tanaman bertumbuh menjadi pohon rindang dan berbuah lebat."
            )
        ),
        intuitionTitle = "Denyut Kehidupan: 8 Ciri Utama Organisme Hidup",
        intuitionBody = "Di seluruh planet bumi, semua makhluk hidup—dari bakteri mikroskopis hingga paus biru raksasa—memiliki ciri kehidupan bersama:\n\n" +
                "1. Bernapas (Respirasi): Menghirup oksigen untuk membakar nutrisi dan melepaskan gas karbondioksida serta energi.\n" +
                "2. Memerlukan Makanan & Nutrisi: Tumbuhan memproduksi makanan sendiri (autotrof), hewan memakan makhluk lain (heterotrof).\n" +
                "3. Bergerak: Gerak aktif berpindah tempat pada hewan, atau gerak pasif lentik pada tumbuhan (bunga mekar, sulur membelit).\n" +
                "4. Tumbuh & Berkembang: Tumbuh bertambah ukuran fisik volume dan tinggi; berkembang menuju kedewasaan fungsi organ.\n" +
                "5. Berkembang Biak (Reproduksi): Menghasilkan keturunan agar spesiesnya tidak punah dari muka bumi.\n" +
                "6. Peka Terhadap Rangsang (Iritabilitas): Menanggapi perubahan lingkungan seperti cahaya, suhu, gravitasi, sentuhan, dan zat kimia.\n" +
                "7. Mengeluarkan Zat Sisa (Ekskresi): Membuang racun sisa metabolisme (keringat, urin, hembusan nafas CO₂).\n" +
                "8. Beradaptasi: Menyesuaikan bentuk tubuh dan perilaku agar mampu bertahan di habitatnya.",
        intuitionPoints = listOf(
            "Robot atau mobil bisa bergerak dan membutuhkan bahan bakar, tetapi bukan makhluk hidup karena tidak dapat tumbuh, bereproduksi, dan tidak tersusun dari sel.",
            "Tumbuhan juga bergerak meskipun tidak berpindah tempat: akar merambat mencari air di tanah dan ujung batang meliuk condong ke arah cahaya matahari.",
            "Tumbuh bersifat kuantitatif tak dapat balik (irreversibel): tinggi badan manusia bertambah dan tidak bisa menciut kembali menjadi bayi."
        ),
        simId = "sim-life-traits",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Respirasi}",
                equation = "\\text{C}_6\\text{H}_{12}\\text{O}_6 + 6\\text{O}_2 \\rightarrow 6\\text{CO}_2 + 6\\text{H}_2\\text{O} + \\text{Energi ATP}",
                meaning = "Reaksi respirasi seluler pembakar nutrisi menjadi energi hidup.",
                units = "-",
                applicationNote = "Terjadi pada semua sel tumbuhan, hewan, dan manusia siang maupun malam."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Adaptasi Fisiologi Badak Jawa Cula Satu di Taman Nasional Ujung Kulon Banten",
            context = "Badak Jawa (Rhinoceros sondaicus) adalah salah satu mamalia terlangka di dunia dengan populasi tersisa sekitar 75 ekor di semenanjung Ujung Kulon.",
            engineeringProblem = "Badak Jawa memiliki kulit tebal berlipat namun tidak memiliki banyak kelenjar keringat, sehingga rentan mengalami stres panas (heat stress) dan gigitan parasit serangga hutan tropis.",
            physicalConceptUsed = "Ciri adaptasi tingkah laku dan fisiologi termoregulasi: kebiasaan berkubang di lumpur rawa selama berjam-jam setiap siang hari.",
            mathematicalModel = "Lapisan lumpur basah tebal 1 cm di kulit menguap perlahan menurunkan suhu tubuh badak hingga 3°C lebih sejuk dan membentuk perisai fisik anti gigitan lalat pikat serta kutu hutan.",
            realWorldImpact = "Menyelamatkan spesies langka warisan dunia dari kepunahan total melalui pemantauan kamera trap 24 jam dan perlindungan habitat rawa berkubang alami.",
            relatedCareers = listOf("Polisi Kehutanan Konservasi Badak", "Dokter Hewan Satwa Liar", "Peneliti Ekologi Mamalia Besar"),
            verifiedSource = "Balai Taman Nasional Ujung Kulon (TNUK) / Yayasan Badak Indonesia (YABI)."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Gerak Fototropisme Tanaman Tauge Kacang Hijau Mencari Cahaya",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "10 butir biji kacang hijau",
                "2 gelas plastik bekas air mineral",
                "Kapas basah secukupnya",
                "1 kotak kardus bekas sepatu yang dilubangi salah satu sisi sampingnya (diameter lubang 3 cm)"
            ),
            steps = listOf(
                "Alasi dasar kedua gelas plastik dengan kapas basah.",
                "Letakkan 5 butir biji kacang hijau di masing-masing gelas, siram sedikit air.",
                "Gelas A: Letakkan di tempat terbuka di dekat jendela yang terkena cahaya matahari merata.",
                "Gelas B: Masukkan ke dalam kotak kardus tertutup yang HANYA MEMILIKI SATU LUBANG KECIL DI SISI KANANNYA.",
                "Biarkan selama 3-4 hari sambil tetap menjaga kapas tetap lembap.",
                "AMATI HASILNYA:\n• Tauge di Gelas A tumbuh tegak lurus ke atas.\n• Tauge di Gelas B MELENGKUNG MEMBELOK TAJAM MENUJU LUBANG KARDUS DI MANA CAHAYA MASUK (Gerak Fototropisme)!"
            ),
            observationGoal = "Membuktikan bahwa tumbuhan memiliki ciri makhluk hidup: peka terhadap rangsang cahaya (iritabilitas) dan bergerak menyesuaikan arah datangnya sinar matahari.",
            connectionToSimulation = "Bandingkan sudut pembelokan batang tauge dengan simulator tropisme tumbuhan Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ch-1",
                prompt = "Peristiwa daun putri malu yang mengatupkan daunnya seketika saat disentuh oleh jari tangan merupakan bukti bahwa makhluk hidup memiliki ciri...",
                type = "multiple_choice",
                options = listOf(
                    "Peka terhadap rangsang (Iritabilitas)",
                    "Memerlukan makanan dan nutrisi",
                    "Mengeluarkan zat sisa (Ekskresi)",
                    "Berkembang biak secara generatif"
                ),
                correctAnswer = "Peka terhadap rangsang (Iritabilitas)",
                hints = listOf(
                    "Sentuhan jari tangan adalah rangsangan mekanik dari luar.",
                    "Daun memberikan respon tanggapan terhadap sentuhan tersebut."
                ),
                explanation = "Iritabilitas adalah kemampuan organisme menanggapi rangsangan dari lingkungan sekitar. Menguncupnya daun putri malu akibat sentuhan mekanik adalah contoh nyata iritabilitas tumbuhan.",
                misconception = "Mengira putri malu menguncup karena layu kekurangan air."
            ),
            QuizQuestion(
                id = "q-ch-2",
                prompt = "Manakah dari pernyataan berikut yang membedakan pertambahan tinggi tubuh makhluk hidup dengan penambahan tinggi bukit pasir?",
                type = "multiple_choice",
                options = listOf(
                    "Tumbuh kembang makhluk hidup berasal dari pembelahan sel internal dan bersifat tak dapat balik (irreversibel)",
                    "Bukit pasir memerlukan makanan untuk bertambah tinggi",
                    "Makhluk hidup bertambah tinggi hanya karena tertiup angin",
                    "Tidak ada perbedaan sama sekali antara keduanya"
                ),
                correctAnswer = "Tumbuh kembang makhluk hidup berasal dari pembelahan sel internal dan bersifat tak dapat balik (irreversibel)",
                hints = listOf(
                    "Pertumbuhan makhluk hidup terjadi dari dalam tubuh melalui pembelahan sel-sel baru.",
                    "Manusia yang sudah dewasa tidak bisa menciut kembali menjadi bayi."
                ),
                explanation = "Pertumbuhan pada makhluk hidup bersifat biologis internal (pembelahan dan perbesaran sel hidup) serta bersifat tak dapat balik (irreversibel), sedangkan penambahan tinggi bukit pasir hanya penumpukan materi luar fisik akibat angin.",
                misconception = "Mengira semua penambahan ukuran benda di alam merupakan pertumbuhan makhluk hidup."
            )
        )
    )

    // =========================================================================
    // 2. KLASIFIKASI HEWAN & TUMBUHAN SEDERHANA
    // =========================================================================
    private val klasifikasiDasarLesson = LessonData(
        conceptId = "bio-klasifikasi-dasar",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pkd1",
                panelNumber = 1,
                title = "Koleksi Serangga & Ikan di Akuarium",
                caption = "Dimas memperhatikan capung di udara dan ikan mas koki yang berenang lincah di kolam taman.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Ikan punya tulang duri di dalam tubuhnya, tapi capung dan semut tidak punya tulang sama sekali!",
                sceneVisualEmoji = "🐟",
                sceneDescription = "Ikan mas bertulang punggung berenang di samping capung berangka luar kitin."
            ),
            StoryPanel(
                id = "pkd2",
                panelNumber = 2,
                title = "Vertebrata vs Avertebrata",
                caption = "Kakek menjelaskan pengelompokan besar dunia hewan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Tepat sekali, Dimas! Hewan bertulang belakang kita sebut VERTEBRATA: ada Ikan (Pisces), Katak (Amfibi), Kadal (Reptil), Burung (Aves), dan Mamalia menyusui. Sedangkan hewan tanpa tulang belakang adalah AVERTEBRATA: serangga, cacing, laba-laba, dan gurita!",
                sceneVisualEmoji = "🦎",
                sceneDescription = "Diagram percabangan hewan bertulang belakang vertebrata vs hewan lunak avertebrata."
            ),
            StoryPanel(
                id = "pkd3",
                panelNumber = 3,
                title = "Monokotil vs Dikotil di Dapur",
                caption = "Kirana membelah biji jagung manis dan biji kacang tanah di dapur.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lihat Kakek! Biji jagung hanya punya 1 keping daun lembaga (Monokotil) dengan akar serabut dan daun sejajar. Sedangkan biji kacang tanah bisa dibelah dua menjadi 2 keping (Dikotil) dengan akar tunggang kokoh dan daun menyirip!",
                sceneVisualEmoji = "🌽",
                sceneDescription = "Perbandingan anatomi kecambah biji monokotil jagung vs dikotil kacang tanah."
            )
        ),
        intuitionTitle = "Merapikan Keanekaragaman: Pengelompokan Hewan & Tumbuhan",
        intuitionBody = "Jutaan spesies di bumi dikelompokkan berdasarkan kemiripan struktur tubuh agar mudah dipelajari:\n\n" +
                "1. Klasifikasi Hewan Berdasarkan Tulang Belakang:\n" +
                "   • Hewan Vertebrata (Bertulang Belakang):\n" +
                "     - Pisces (Ikan): Bernapas dengan insang, bersisik, berdarah dingin (poikiloterm).\n" +
                "     - Amfibia (Katak, Salamander): Hidup di air dan darat, kulit basah berlendir.\n" +
                "     - Reptilia (Ular, Buaya, Komodo): Kulit kering bersisik keras, bertelur bercangkang.\n" +
                "     - Aves (Burung): Tubuh berbulu, bersayap, berdarah panas (homoioterm).\n" +
                "     - Mamalia (Sapi, Kucing, Paus, Manusia): Memiliki kelenjar susu, berambut, melahirkan anak.\n" +
                "   • Hewan Avertebrata (Tak Bertulang Belakang):\n" +
                "     - Arthropoda (Serangga, udang, kepiting): Rangka luar dari zat kitin keras.\n" +
                "     - Mollusca (Siput, cumi-cumi, gurita): Tubuh lunak terlindung cangkang.\n" +
                "     - Annelida (Cacing tanah beruas-ruas).\n\n" +
                "2. Klasifikasi Tumbuhan Berbiji (Spermatophyta):\n" +
                "   • Monokotil (Berkeping Satu): Biji tidak membelah, akar serabut, batang tidak berkambium (tidak membesar), tulang daun sejajar/melengkung (contoh: Padi, Jagung, Kelapa, Pisang, Rumput).\n" +
                "   • Dikotil (Berkeping Dua): Biji membelah dua, akar tunggang dalam, batang berkambium (bisa tumbuh kayu besar bercabang), tulang daun menyirip/menjari (contoh: Mangga, Jati, Rambutan, Kacang tanah, Cabai).",
        intuitionPoints = listOf(
            "Paus dan lumba-lumba BUKAN IKAN melainkan MAMALIA laut yang bernapas dengan paru-paru dan melahirkan anak!",
            "Kelelawar adalah mamalia bersayap yang melahirkan dan menyusui anaknya, bukan burung.",
            "Jamur (Fungi) BUKAN TUMBUHAN karena jamur tidak memiliki klorofil dan tidak dapat berfotosintesis; jamur hidup sebagai pengurai materi organik."
        ),
        simId = "sim-classification",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Ciri Dikotil}",
                equation = "\\text{Biji } 2 \\, | \\, \\text{Akar Tunggang} \\, | \\, \\text{Kambium Ada} \\, | \\, \\text{Daun Menyirip/Menjari}",
                meaning = "Karakteristik anatomi pembeda utama tumbuhan berkeping dua (dikotil).",
                units = "-",
                applicationNote = "Contoh pohon mangga, beringin, dan durian."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Perlindungan Spesies Endemik Kadal Purba Komodo di Nusa Tenggara Timur",
            context = "Taman Nasional Komodo di Kepulauan Komodo NTT melindungi reptil kadal terbesar di dunia (Varanus komodoensis) yang panjangnya mencapai 3 meter.",
            engineeringProblem = "Komodo adalah vertebrata reptil ektotermik (berdarah dingin) karnivora yang bergantung pada ketersediaan rusa timor dan babi hutan sebagai mangsa utama.",
            physicalConceptUsed = "Taksonomi reptil ordo Squamata karnivora puncak dan keseimbangan piramida rantai makanan pulau terisolasi.",
            mathematicalModel = "Survei sensus populasi menggunakan penandaan microchip PIT tag memonitor stabilitas 3.000 ekor komodo agar tidak mengalami perkawinan sedarah (inbreeding depression) di pulau seluas 1.800 km².",
            realWorldImpact = "Menjaga warisan evolusi purba sejak zaman dinosaurus dan menarik devisa pariwisata ekowisata berkelanjutan kelas dunia.",
            relatedCareers = listOf("Herpetologis Spesialis Reptil", "Ranger Taman Nasional Komodo", "Pakar Biogeografi Kepulauan"),
            verifiedSource = "Balai Taman Nasional Komodo Kementerian LHK / Komodo Survival Program (KSP)."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Tulang Daun & Struktur Biji di Halaman Rumah (Monokotil vs Dikotil)",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 helai daun rumput atau daun jagung/pisang (Monokotil)",
                "1 helai daun mangga, jambu, atau daun singkong (Dikotil)",
                "1 butir biji jagung manis rebus & 1 butir kacang tanah kupas",
                "Kaca pembesar (lup) jika ada"
            ),
            steps = listOf(
                "Amati daun rumput atau daun jagung di bawah cahaya: perhatikan pola urat tulangnya yang MEMANJANG SEJAJAR DARI PANGKAL KE UJUNG DAUN.",
                "Amati daun mangga atau jambu: perhatikan tulang daun utamanya yang BERCABANG-CABANG MENYIRIP SEPERTI DURI IKAN.",
                "Ambil biji jagung: coba belah dengan kuku jari. Biji jagung padat utuh berkeping satu tidak bisa dibelah dua secara simetris (Monokotil).",
                "Ambil biji kacang tanah: tekan sedikit dengan jari. Biji kacang TANAH LANGSUNG TERBELAH DUA DENGAN MUDAH menjadi dua keping simetris (Dikotil)!",
                "Catat perbedaan ciri-ciri kedua kelompok tumbuhan tersebut di buku catatan."
            ),
            observationGoal = "Mengidentifikasi secara langsung perbedaan morfologi tumbuhan monokotil dan dikotil dari organ daun dan biji.",
            connectionToSimulation = "Bandingkan anatomi daunmu dengan simulator taksonomi tumbuhan Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kd-1",
                prompt = "Manakah dari kelompok hewan berikut yang SELURUHNYA termasuk ke dalam kelompok hewan bertulang belakang (Vertebrata)?",
                type = "multiple_choice",
                options = listOf(
                    "Ikan mas, Katak pohon, Burung elang, dan Kucing",
                    "Cacing tanah, Ubur-ubur, Kucing, dan Kepiting",
                    "Capung, Kupu-kupu, Semut, dan Laba-laba",
                    "Siput, Gurita, Belalang, dan Ikan hiu"
                ),
                correctAnswer = "Ikan mas, Katak pohon, Burung elang, dan Kucing",
                hints = listOf(
                    "Vertebrata memiliki susunan tulang belakang di sepanjang punggungnya.",
                    "Serangga, cacing, dan siput adalah avertebrata (tak bertulang belakang)."
                ),
                explanation = "Ikan mas (Pisces), katak pohon (Amfibi), burung elang (Aves), dan kucing (Mamalia) semuanya memiliki rangka dalam dan tulang belakang sejati (Vertebrata).",
                misconception = "Mengira kepiting bertulang belakang karena memiliki cangkang luar keras (cangkang adalah rangka luar kitin, bukan tulang belakang)."
            ),
            QuizQuestion(
                id = "q-kd-2",
                prompt = "Pohon mangga dan pohon rambutan digolongkan ke dalam kelompok tumbuhan DIKOTIL karena memiliki ciri khas...",
                type = "multiple_choice",
                options = listOf(
                    "Biji berkeping dua, akar tunggang, dan batang berkambium",
                    "Biji berkeping satu, akar serabut, dan daun sejajar",
                    "Tidak memiliki bunga dan tidak berbuah",
                    "Daunnya selalu berbentuk jarum"
                ),
                correctAnswer = "Biji berkeping dua, akar tunggang, dan batang berkambium",
                hints = listOf(
                    "Awalan 'Di' berarti dua.",
                    "Pohon dikotil memiliki batang kayu besar yang bercabang-cabang."
                ),
                explanation = "Tumbuhan dikotil memiliki biji berkeping dua, sistem perakaran tunggang kokoh menancap dalam, batang memiliki kambium sehingga bisa membesar membentuk kayu, dan pertulangan daun menyirip atau menjari.",
                misconception = "Tertukar dengan ciri monokotil (seperti padi dan kelapa)."
            )
        )
    )

    // =========================================================================
    // 3. BAGIAN TUBUH TUMBUHAN & HEWAN
    // =========================================================================
    private val bagianTubuhLesson = LessonData(
        conceptId = "bio-bagian-tubuh",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pbt1",
                panelNumber = 1,
                title = "Pohon Beringin di Alun-Alun Keraton",
                caption = "Kirana dan Kakek berteduh di bawah pohon beringin raksasa di Alun-Alun Kidul Yogyakarta.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Pohon beringin ini tinggi besar sekali! Mengapa badai angin kencang kemarin tidak sanggup menumbangkannya?",
                sceneVisualEmoji = "🌳",
                sceneDescription = "Pohon beringin tua raksasa dengan akar gantung kokoh menancap ke bumi."
            ),
            StoryPanel(
                id = "pbt2",
                panelNumber = 2,
                title = "Akar, Batang & Daun: Tim Pabrik Mandiri",
                caption = "Kakek menunjuk akar gantung beringin yang kokoh menancap di tanah.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Akar menancap kuat mengikat tanah sekaligus menyerap air dan mineral hara! Batang bertindak sebagai pipa jalan raya pengangkut, dan Daun yang hijau adalah dapur pabrik fotosintesis pembuat makanan!",
                sceneVisualEmoji = "🌿",
                sceneDescription = "Diagram penampang akar penyerap hara, batang pipa vaskular, dan daun hijau penangkap sinar."
            ),
            StoryPanel(
                id = "pbt3",
                panelNumber = 3,
                title = "Adaptasi Alat Gerak Hewan",
                caption = "Dimas mengamati burung wallet terbang meliuk cepat menyambar serangga di udara.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Burung punya sayap aerodinamis untuk terbang, ikan punya sirip dan ekor kemudi untuk berenang di air, dan kuda punya kaki berotot kuat untuk berlari kencang! Setiap bagian tubuh hewan dirancang sempurna untuk bertahan hidup!",
                sceneVisualEmoji = "🦅",
                sceneDescription = "Berbagai ragam alat gerak hewan: sayap burung, sirip lumba-lumba, dan kaki lari cheetah."
            )
        ),
        intuitionTitle = "Organ Kehidupan: Struktur & Fungsi Pendukung Hidup",
        intuitionBody = "Organ tumbuhan dan anggota tubuh hewan bekerja sama secara harmonis untuk kelangsungan hidup:\n\n" +
                "1. Lima Organ Pokok Tumbuhan:\n" +
                "   • Akar: Menancapkan tumbuhan di tanah, menyerap air dan garam mineral, pada tanaman tertentu berfungsi sebagai penyimpan cadangan makanan (wortel, singkong).\n" +
                "   • Batang: Menopang tubuh tumbuhan tegak, menyalurkan air dari akar ke daun (lewat pembuluh xilem) dan menyalurkan hasil fotosintesis dari daun ke seluruh tubuh (lewat floem).\n" +
                "   • Daun: Tempat fotosintesis utama karena kaya klorofil hijau, serta tempat terjadinya pernapasan dan penguapan air (transpirasi via stomata).\n" +
                "   • Bunga: Organ reproduksi generatif yang memiliki benang sari (alat kelamin jantan) dan putik (alat kelamin betina).\n" +
                "   • Buah & Biji: Membungkus dan melindungi calon individu baru serta membantu penyebaran biji oleh angin, air, atau hewan.\n\n" +
                "2. Bagian Tubuh Hewan & Fungsinya:\n" +
                "   • Penutup Tubuh: Sisik ikan/reptil mencegah kehilangan air; bulu burung penahan panas dan aerodinamis; rambut mamalia penghangat tubuh.\n" +
                "   • Alat Gerak: Sirip mendayung air, sayap menghasilkan gaya angkat Bernoulli di udara, cakar mencengkeram mangsa dan memanjat pohon.\n" +
                "   • Alat Pertahanan Diri: Duri landak, cangkang kura-kura, sengat lebah, bisa ular, cairan tinta cumi-cumi.",
        intuitionPoints = listOf(
            "Stomata di daun dapat membuka dan menutup seperti pintu gerbang otomatis untuk mengatur keluar masuknya gas CO₂ dan uap air.",
            "Warna mahkota bunga yang mencolok cerah dan wangi manis nektar berfungsi memikat serangga lebah untuk membantu proses penyerbukan silang.",
            "Bulu burung tersusun dari zat keratin yang sangat ringan namun luar biasa kokoh menahan hembusan angin kencang."
        ),
        simId = "sim-plant-anatomy",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Xilem vs Floem}",
                equation = "\\text{Xilem: Akar } \\rightarrow \\text{ Daun (Air)} \\quad , \\quad \\text{Floem: Daun } \\rightarrow \\text{ Seluruh Tubuh (Gula)}",
                meaning = "Fungsi dua jaringan pembuluh pengangkut utama tumbuhan vaskular.",
                units = "-",
                applicationNote = "Xilem membawa getah air mineral naik, floem membawa glukosa fotosintat ke buah dan akar."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Struktur Akar Napas (Pneumatofor) Pohon Bakau Avicennia di Suaka Margasatwa Muara Angke Jakarta",
            context = "Hutan mangrove Muara Angke di pesisir teluk Jakarta tergenang lumpur pantai berkadar oksigen sangat rendah (anaerob).",
            engineeringProblem = "Akar pohon daratan biasa akan membusuk mati lemas jika terendam air lumpur tanpa pasokan oksigen tanah.",
            physicalConceptUsed = "Modifikasi anatomi organ akar: pembentukan akar napas pensil (pneumatofor) yang menjulang tegak ke atas permukaan lumpur.",
            mathematicalModel = "Ribuan akar pensil Avicennia setinggi 20–30 cm memiliki pori-pori lentisel yang menyerap gas oksigen langsung dari atmosfer saat air laut surut, menyalurkannya ke jaringan aerenkim berongga akar bawah tanah.",
            realWorldImpact = "Menjaga hutan mangrove tetap hidup bertahan sebagai benteng alami pemecah gelombang rob tsunami dan paru-paru hijau ibukota Jakarta.",
            relatedCareers = listOf("Ahli Anatomi Fisiologi Tumbuhan", "Pengelola Kawasan Konservasi Mangrove", "Arsitek Lanskap Rawa Terpadu"),
            verifiedSource = "Balai Konservasi Sumber Daya Alam (BKSDA) DKI Jakarta / Suaka Margasatwa Muara Angke."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Pembuluh Pengangkut Xilem Batang Seledri / Sawi Putih dengan Pewarna Makanan",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 batang seledri segar yang masih berdaun (atau 1 helai daun sawi putih segar)",
                "1 gelas bening berisi air setengah penuh",
                "Pewarna makanan cair merah atau biru tua pekat (5–10 tetes)"
            ),
            steps = listOf(
                "Teteskan pewarna makanan merah atau biru pekat ke dalam gelas air hingga berwarna sangat gelap.",
                "Potong bagian pangkal bawah batang seledri sekitar 1 cm secara melintang agar saluran pembuluhnya terbuka bersih.",
                "Masukkan batang seledri tegak ke dalam gelas air berwarna.",
                "Diamkan selama 3 hingga 6 jam (atau semalaman) di atas meja.",
                "AMATI PERUBAHAN AJAIBNYA:\nWarna merah/biru merambat naik menembus batang hingga ke urat-urat daun seledri! Helai daun seledri berubah warna menjadi merah kemerahan!",
                "Iris batang seledri secara melintang: amati titik-titik merah bintik kecil di penampang batang (itulah pipa pembuluh Xilem)!"
            ),
            observationGoal = "Membuktikan secara nyata fungsi pembuluh xilem dalam mengangkut air dan zat hara dari bawah menuju ke daun melalui daya kapilaritas dan tarikan transpirasi.",
            connectionToSimulation = "Bandingkan saluran warna batang seledri dengan simulasi vaskular xilem di Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-bt-1",
                prompt = "Bagian organ tumbuhan yang bertindak sebagai tempat utama berlangsungnya proses pembuatan makanan (fotosintesis) adalah...",
                type = "multiple_choice",
                options = listOf("Daun", "Akar", "Batang", "Biji"),
                correctAnswer = "Daun",
                hints = listOf(
                    "Berwarna hijau karena mengandung banyak klorofil.",
                    "Menangkap sinar matahari dan menyerap gas CO₂ melalui stomata."
                ),
                explanation = "Daun adalah organ utama fotosintesis pada tumbuhan karena memiliki lapisan jaringan tiang (palisade) yang kaya kloroplas berisi zat hijau daun klorofil.",
                misconception = "Mengira fotosintesis terjadi di akar karena akar menyerap air tanah."
            ),
            QuizQuestion(
                id = "q-bt-2",
                prompt = "Pembuluh pengangkut pada tumbuhan yang bertugas membawa air dan unsur hara dari dalam tanah menuju ke daun dinamakan pembuluh...",
                type = "multiple_choice",
                options = listOf("Xilem (Pembuluh Kayu)", "Floem (Pembuluh Tapis)", "Kambium", "Stomata"),
                correctAnswer = "Xilem (Pembuluh Kayu)",
                hints = listOf(
                    "Xilem mengangkut air dari bawah ke atas.",
                    "Floem mengangkut hasil fotosintesis dari daun ke seluruh tubuh."
                ),
                explanation = "Pembuluh xilem bertugas mengangkut air dan garam mineral yang diserap akar menuju ke daun. Sedangkan pembuluh floem mengedarkan hasil fotosintesis dari daun ke seluruh organ tumbuhan.",
                misconception = "Tertukar fungsi antara pembuluh xilem dan pembuluh floem."
            )
        )
    )

    // =========================================================================
    // 4. HABITAT & RANTAI MAKANAN ALAMI
    // =========================================================================
    private val rantaiMakananLesson = LessonData(
        conceptId = "bio-rantai-makanan",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "prm1",
                panelNumber = 1,
                title = "Menjelajah Padang Rumput Ujung Kulon",
                caption = "Kirana dan Dimas diajak Kakek berpatroli di padang rumput Cidaon, Taman Nasional Ujung Kulon.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lihat Kakek! Kawanan banteng dan rusa jawa sedang asyik memakan rumput hijau yang segar di padang!",
                sceneVisualEmoji = "🦌",
                sceneDescription = "Padang rumput hijau luas dengan kawanan rusa dan banteng jawa makan rumput."
            ),
            StoryPanel(
                id = "prm2",
                panelNumber = 2,
                title = "Aliran Energi Sang Surya",
                caption = "Kakek menunjuk matahari pagi yang bersinar hangat menyinari rerumputan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Semua energi di padang ini berasal dari matahari! Rumput menangkap cahaya itu sebagai Produsen, lalu dimakan rusa sebagai Konsumen Pertama (Herbivora).",
                sceneVisualEmoji = "☀️",
                sceneDescription = "Sinar matahari memberi energi pada rumput hijau sebagai produsen primer ekosistem."
            ),
            StoryPanel(
                id = "prm3",
                panelNumber = 3,
                title = "Predator Puncak & Keseimbangan Alam",
                caption = "Dimas melihat seekor Elang Jawa bertengger gagah di pucuk pohon mengincar ular sawah.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Elang memakan ular, ular memakan katak, katak memakan belalang! Jika ular punah, populasi katak meledak dan tanaman habis dimakan serangga!",
                sceneVisualEmoji = "🦅",
                sceneDescription = "Elang Jawa sebagai predator puncak mengawasi jaring-jaring makanan di bawah pohon."
            ),
            StoryPanel(
                id = "prm4",
                panelNumber = 4,
                title = "Pahlawan Pengurai: Jamur & Bakteri",
                caption = "Kirana melihat jamur payung putih tumbuh di atas batang pohon tumbang yang mulai lapuk.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jamur dan cacing tanah adalah Dekomposer! Mereka mengurai sisa makhluk hidup menjadi zat hara penyubur tanah, agar rumput baru bisa tumbuh subur kembali. Daur hidup berputar sempurna!",
                sceneVisualEmoji = "🍄",
                sceneDescription = "Jamur pengurai mendaur ulang materi organik menjadi tanah humus kaya nutrisi."
            )
        ),
        intuitionTitle = "Daur Energi Biosfer: Rantai Makanan & Jaring Ekologi",
        intuitionBody = "Tidak ada satu pun makhluk hidup di bumi yang dapat hidup sendirian tanpa terhubung dengan makhluk lainnya:\n\n" +
                "1. Tingkatan Trofik Ekosistem:\n" +
                "   • Tingkat 1 (Produsen Autotrof): Tumbuhan hijau dan alga yang memproduksi makanannya sendiri via fotosintesis.\n" +
                "   • Tingkat 2 (Konsumen Primer / Herbivora): Hewan pemakan tumbuhan (contoh: belalang, rusa, ulat).\n" +
                "   • Tingkat 3 (Konsumen Sekunder / Karnivora Kecil): Hewan pemakan herbivora (contoh: katak, burung pemakan serangga).\n" +
                "   • Tingkat 4 (Konsumen Tersier / Predator Puncak): Pemangsa puncak rantai (contoh: elang, harimau, hiu).\n" +
                "   • Pengurai (Dekomposer): Bakteri dan fungi/jamur yang memecah sisa materi organik mati menjadi mineral hara anorganik untuk diserap kembali oleh akar tumbuhan.\n\n" +
                "2. Hukum 10% Aliran Energi (Hukum Lindeman):\n" +
                "   Hanya sekitar 10% energi kimia dari satu tingkatan trofik yang berhasil diserap dan disimpan menjadi biomassa oleh tingkatan trofik berikutnya. Sisanya 90% terbuang sebagai panas respirasi tubuh dan kotoran sisa metabolisme.",
        intuitionPoints = listOf(
            "Aliran energi di alam bersifat SEARAH (Matahari → Produsen → Konsumen → Panas terbuang), sedangkan siklus materi (karbon, air, nitrogen) berputar berulang.",
            "Jaring-jaring makanan adalah kumpulan rantai makanan yang saling bertaut rumit; semakin banyak cabang jaring makanan, ekosistem semakin stabil terhadap gangguan.",
            "Punahnya satu spesies predator kunci (keystone species) dapat menyebabkan efek domino keruntuhan seluruh ekosistem."
        ),
        simId = "sim-food-chain",
        formulas = listOf(
            FormulaCard(
                symbol = "\\eta_{\\text{trofik}}",
                equation = "\\eta = \\frac{E_{n}}{E_{n-1}} \\times 100\\% \\approx 10\\%",
                meaning = "Efisiensi transfer energi ekologis antar tingkatan trofik (Hukum Lindeman 10%).",
                units = "% (persentase)",
                applicationNote = "Jika produsen menghasilkan 10.000 kkal energi, herbivora hanya menerima ~1.000 kkal, dan karnivora puncak hanya mendapat ~10 kkal."
            ),
            FormulaCard(
                symbol = "Biomassa",
                equation = "\\text{Piramida: } B_{\\text{produsen}} > B_{\\text{herbivora}} > B_{\\text{karnivora}}",
                meaning = "Keseimbangan piramida biomassa di ekosistem daratan yang sehat.",
                units = "kg biomassa / m²",
                applicationNote = "Massa total tumbuhan hijau di hutan selalu jauh melampaui total massa hewan pemangsanya."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Restorasi Ekosistem Mangrove & Konservasi Kepiting Bakau di Pantai Utara Jawa",
            context = "Hutan mangrove pesisir Pantura Jawa mengalami kerusakan akibat pembabatan tambak liar, memicu abrasi pantai parah dan hilangnya bibit ikan.",
            engineeringProblem = "Rantai makanan pesisir terputus: tanpa serasah daun mangrove yang gugur, plankton dan kepiting bakau mati, menyebabkan nelayan kehilangan tangkapan ikan bandeng dan kakap.",
            physicalConceptUsed = "Prinsip jaring-jaring makanan estuaria dan fungsi mangrove sebagai produsen serasah detritus nutrisi perairan payau.",
            mathematicalModel = "Reboisasi 50.000 bibit Rhizophora mucronata menghasilkan 12 ton serasah daun per hektar per tahun, memulihkan 100% populasi mikroba dekomposer dan larva udang dalam 24 bulan.",
            realWorldImpact = "Mencegah abrasi daratan sepanjang 15 km garis pantai dan meningkatkan penghasilan nelayan budidaya kepiting soka hingga 300%.",
            relatedCareers = listOf("Biolog Kelautan & Konservasi Pesisir", "Manajer Restorasi Mangrove", "Penyuluh Kehutanan Ekosistem"),
            verifiedSource = "Kementerian Kelautan dan Perikanan (KKP) RI / Badan Restorasi Gambut dan Mangrove (BRGM)."
        ),
        homeLab = HomeLabData(
            title = "Membuat Terarium Ekosistem Mini Botol Tertutup",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 toples kaca bening bermulut lebar dengan tutup kedap udara (atau botol selai bekas)",
                "Kerikil kecil untuk lapisan drainase bawah (2 cm)",
                "Segenggam arang kayu tumbuk halus (penyaring bau & jamur jahat)",
                "Tanah humus subur (3-4 cm)",
                "Tumbuhan kecil berakar: lumut hijau segar dan tanaman fittonia mini",
                "Sedikit semprotan air bersih"
            ),
            steps = listOf(
                "Langkah 1: Masukkan kerikil di dasar toples, lalu taburkan selapis arang kayu di atasnya.",
                "Langkah 2: Tambahkan tanah humus gembur dan buat lubang kecil dengan jari.",
                "Langkah 3: Tanam lumut hijau dan tanaman kecil fittonia secara rapi dengan pinset.",
                "Langkah 4: Semprotkan 5–6 semprotan air bersih ke dinding toples (jangan sampai becek menggenang).",
                "Langkah 5: Tutup toples kaca rapat-rapat dan letakkan di dekat jendela yang terkena sinar matahari tidak langsung. Amati selama berminggu-minggu: embun air akan menguap dan jatuh kembali menyiram tanaman tanpa perlu disiram lagi!"
            ),
            observationGoal = "Menyaksikan ekosistem mandiri yang seimbang: tumbuhan berfotosintesis menghasilkan O₂ di siang hari, menggunakan air dalam daur tertutup, dan tanah mendaur ulang nutrisi secara abadi.",
            connectionToSimulation = "Bandingkan aliran energi terarium dengan simulator rantai makanan interaktif di Semesta!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-rantai-1",
                prompt = "Dalam sebuah ekosistem padang rumput, jika produsen rumput menghasilkan energi kimia sebesar 10.000 kalori, berapakah perkiraan energi yang berhasil diserap oleh belalang (konsumen I) menurut Hukum 10% Lindeman?",
                type = "numeric",
                correctAnswer = "1000",
                tolerance = 50f,
                unit = "kalori",
                hints = listOf(
                    "Hanya 10% dari energi tingkat sebelumnya yang diteruskan.",
                    "Hitung 10% dari 10.000 kalori.",
                    "10.000 × 0,10 = ...?"
                ),
                explanation = "Menurut efisiensi trofik Lindeman (~10%), energi yang berpindah ke konsumen I adalah 10% × 10.000 kalori = 1.000 kalori. Sisanya 9.000 kalori hilang sebagai panas respirasi dan kotoran.",
                misconception = "Mengira seluruh energi 10.000 kalori berpindah utuh ke pemakan rumput."
            ),
            QuizQuestion(
                id = "q-rantai-2",
                prompt = "Organisme yang bertugas menguraikan sisa-sisa jasad makhluk hidup mati menjadi zat hara tanah dinamakan...",
                type = "multiple_choice",
                options = listOf("Dekomposer (Pengurai)", "Produsen Primer", "Konsumen Puncak", "Herbivora"),
                correctAnswer = "Dekomposer (Pengurai)",
                hints = listOf(
                    "Contohnya adalah jamur dan bakteri pengurai tanah.",
                    "Kata kuncinya: menguraikan sisa zat organik."
                ),
                explanation = "Dekomposer (pengurai) seperti jamur saprofit dan bakteri menguraikan materi organik dari bangkai atau sisa tanaman menjadi unsur hara yang menyuburkan kembali tanah bagi produsen.",
                misconception = "Menyamakan dekomposer dengan konsumen pemakan rumput."
            )
        )
    )

    // =========================================================================
    // 5. PANCA INDERA & KESEHATAN TUBUH
    // =========================================================================
    private val pancaInderaLesson = LessonData(
        conceptId = "bio-panca-indera",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "ppi1",
                panelNumber = 1,
                title = "Menikmati Semangkuk Bakso Hangat",
                caption = "Keluarga Kirana menikmati semangkuk bakso kuah hangat di warung tenda Solo.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Mata kita melihat kuah bakso mengepul, hidung mencium aroma wangi bawang goreng, telinga mendengar kuah mendidih, lidah merasakan kuah gurih sedap, dan kulit merasakan mangkok yang hangat!",
                sceneVisualEmoji = "🍲",
                sceneDescription = "Menikmati semangkuk bakso melibatkan kerja harmonis kelima indera manusia."
            ),
            StoryPanel(
                id = "ppi2",
                panelNumber = 2,
                title = "Lima Jendela Penjaga Tubuh",
                caption = "Kakek menjelaskan bagaimana panca indera menyelamatkan manusia dari bahaya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Panca indera adalah reseptor penerima sinyal dunia luar! Mata (fotoreseptor cahaya), Telinga (fonoreseptor bunyi), Hidung (kemoreseptor bau gas), Lidah (kemoreseptor rasa cair), dan Kulit (tangoreseptor sentuhan, panas, dingin, dan nyeri)! Mereka mengirim sinyal kilat ke otak agar kita terhindar dari bahaya!",
                sceneVisualEmoji = "🧠",
                sceneDescription = "Sinyal dari kelima organ indera diteruskan melalui saraf ke pusat sensorik otak."
            ),
            StoryPanel(
                id = "ppi3",
                panelNumber = 3,
                title = "Menjaga Kesehatan Indera",
                caption = "Kirana mematikan lampu kamar dan menaruh ponsel jauh dari tempat tidur.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Mata kita harus dijaga dengan tidak menatap layar ponsel terlalu dekat di ruangan gelap, telinga tidak mendengarkan earphone terlalu bising, dan mencuci tangan bersih dengan sabun sebelum makan!",
                sceneVisualEmoji = "👁️",
                sceneDescription = "Menjaga jarak baca aman dan pola hidup bersih sehat."
            )
        ),
        intuitionTitle = "Jendela Informasi: Panca Indera & Reseptor Saraf Tubuh",
        intuitionBody = "Panca indera adalah organ khusus yang dilengkapi sel-sel reseptor sensorik penghubung tubuh dengan lingkungan luar:\n\n" +
                "1. Mata (Indera Penglihatan / Fotoreseptor):\n" +
                "   • Kornea menerima cahaya → Pupil mengatur intensitas cahaya → Lensa mata mencembung/memipih memfokuskan bayangan → Retina (sel batang hitam-putih dan sel kerucut warna) menangkap bayangan nyata terbalik → Saraf optik mengirim sinyal ke otak.\n\n" +
                "2. Telinga (Indera Pendengaran & Keseimbangan / Fonoreseptor):\n" +
                "   • Daun telinga menangkap gelombang bunyi → Saluran telinga → Gendang telinga bergetar → Tiga tulang pendengaran (martil, landasan, sanggurdi) memperkuat getaran → Rumah siput (koklea) mengubah getaran cairan menjadi impuls saraf.\n" +
                "   • Saluran setengah lingkaran (kanalis semisirkularis) menjaga keseimbangan posisi tubuh saat bergerak.\n\n" +
                "3. Hidung (Indera Penciuman / Kemoreseptor Gas):\n" +
                "   • Sel saraf olfaktori di rongga hidung atas mendeteksi partikel uap zat kimia gas.\n\n" +
                "4. Lidah (Indera Pengecap / Kemoreseptor Cairan):\n" +
                "   • Papila lidah memiliki ribuan kuncup pengecap untuk 5 rasa dasar: Manis, Asin, Asam, Pahit, dan Gurih (Umami).\n\n" +
                "5. Kulit (Indera Peraba & Suhu / Mekanoreseptor & Termoreseptor):\n" +
                "   • Memiliki reseptor sentuhan ringan (Meissner), tekanan kuat (Pacini), panas (Ruffini), dingin (Krause), dan ujung saraf bebas pendeteksi rasa sakit/nyeri.",
        intuitionPoints = listOf(
            "Rasa lezat makanan yang kita santap sebenarnya adalah kombinasi 80% indera penciuman hidung dan 20% indera pengecap lidah (saat pilek flu, makanan terasa hambar karena hidung tersumbat!).",
            "Mendengarkan musik melalui earphone melebihi volume 85 desibel dalam waktu lama dapat merusak rambut getar koklea secara permanen (tuli kebisingan).",
            "Kulit adalah organ terbesar di tubuh manusia yang berfungsi melindungi organ dalam dari bakteri serta mengatur suhu tubuh lewat keluarnya keringat."
        ),
        simId = "sim-senses",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Panca Indera}",
                equation = "\\text{Mata (Cahaya)} \\, | \\, \\text{Telinga (Bunyi)} \\, | \\, \\text{Hidung (Bau)} \\, | \\, \\text{Lidah (Rasa)} \\, | \\, \\text{Kulit (Sentuh)}",
                meaning = "Pemetaan lima sistem reseptor sensorik tubuh manusia.",
                units = "-",
                applicationNote = "Sinyal reseptor diubah menjadi potensial aksi listrik saraf menuju otak."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pencegahan Gangguan Pendengaran Bising Pabrik Peleburan Baja PT Krakatau Steel Cilegon",
            context = "Pabrik peleburan baja blast furnace Cilegon mengoperasikan mesin rolling mill raksasa yang menghasilkan tingkat kebisingan di atas 95 desibel (dB).",
            engineeringProblem = "Paparan suara bising konstan > 85 dB merusak sel-sel rambut halus organ korti koklea telinga dalam pekerja yang tidak bisa beregenerasi (Noise-Induced Hearing Loss / NIHL).",
            physicalConceptUsed = "Akustik gelombang bunyi dan perlindungan membran pendengaran panca indera.",
            mathematicalModel = "Penerapan batas paparan kebisingan harian OSHA: maksimal 8 jam pada 85 dB, dan hanya 2 jam pada 91 dB. Pekerja diwajibkan memakai penutup telinga ear-muff yang memiliki Noise Reduction Rating (NRR) 28 dB untuk meredam intensitas bunyi masuk ke telinga di bawah 70 dB.",
            realWorldImpact = "Melindungi ribuan pekerja industri baja dari ketulian permanen masa tua dan menjaga kepatuhan standar K3 keselamatan kerja internasional.",
            relatedCareers = listOf("Audiologis Industri", "Dokter Spesialis Okupasi Kerja", "Inspektur K3 Higiene Lingkungan Industri"),
            verifiedSource = "Buku Panduan K3 PT Krakatau Steel (Persero) Tbk / Standar Permenaker No. 5 Tahun 2018."
        ),
        homeLab = HomeLabData(
            title = "Uji Pengaruh Penciuman Hidung terhadap Sensasi Rasa Makanan",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "2 potong buah yang teksturnya mirip (misal: 1 potong kecil buah apel dan 1 potong kecil kentang mentah atau buah pir manis)",
                "Penutup mata (kain slayer) dan penutup hidung (jepit hidung atau dipencet dua jari tangan)"
            ),
            steps = listOf(
                "Tutup matamu dengan kain slayer rapat-rapat.",
                "Pencet hidungmu dengan rapat menggunakan tangan sehingga kamu sama sekali tidak bisa mencium bau udara.",
                "Minta saudara atau temanmu menyuapkan salah satu potongan buah (jangan beri tahu buah apa).",
                "Kunyah perlahan di mulut dengan hidung TETAP TERTUTUP RAPAT: perhatikan bahwa kamu hanya merasakan sensasi manis berair atau hambar, namun SANGAT SULIT MENEBAK APAKAH ITU APEL ATAU PIR!",
                "Sekarang lepaskan jepitan hidungmu sambil tetap mengunyah: SEKETIKA AROMA KHAS BUAH MASUK KE RONGGA HIDUNG DAN KAMU LANGSUNG BISA MENEBAK NAMA BUAH ITU SECARA TEPAT!"
            ),
            observationGoal = "Membuktikan bahwa apa yang kita anggap sebagai 'rasa makanan' sebenarnya adalah kombinasi kerjasama antara kuncup pengecap lidah dan indera penciuman olfaktori hidung.",
            connectionToSimulation = "Bandingkan interaksi reseptor lidah dan hidung pada simulator panca indera Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-pi-1",
                prompt = "Bagian organ mata yang bertindak mengatur banyak sedikitnya intensitas cahaya yang masuk ke dalam bola mata adalah...",
                type = "multiple_choice",
                options = listOf("Pupil", "Retina", "Kornea", "Lensa mata"),
                correctAnswer = "Pupil",
                hints = listOf(
                    "Pupil akan membesar di tempat gelap agar cahaya masuk lebih banyak.",
                    "Pupil akan mengecil saat berada di bawah terik matahari yang silau."
                ),
                explanation = "Pupil adalah celah lingkaran hitam di tengah iris yang bekerja bagaikan diafragma kamera: mengecil saat cahaya terlalu terang dan membesar saat ruangan gelap untuk mengatur intensitas cahaya masuk.",
                misconception = "Tertukar dengan retina yang berfungsi sebagai layar penerima bayangan fotoreseptor."
            ),
            QuizQuestion(
                id = "q-pi-2",
                prompt = "Mengapa saat kita sedang menderita sakit flu pilek parah, makanan yang kita santap terasa hambar tidak senikmat biasanya?",
                type = "multiple_choice",
                options = listOf(
                    "Karena rongga hidung tersumbat lendir sehingga saraf penciuman tidak dapat mendeteksi aroma makanan",
                    "Karena seluruh kuncup pengecap di lidah mendadak mati rasa",
                    "Karena suhu tubuh yang panas mematikan rasa manis makanan",
                    "Karena gigi menjadi sensitif terhadap makanan"
                ),
                correctAnswer = "Karena rongga hidung tersumbat lendir sehingga saraf penciuman tidak dapat mendeteksi aroma makanan",
                hints = listOf(
                    "Sensasi kelezatan makanan 80% disumbang oleh aroma yang dicium hidung.",
                    "Lendir flu menutupi saraf olfaktori hidung."
                ),
                explanation = "Sebagian besar sensasi kelezatan makanan berasal dari aroma yang dideteksi oleh indera penciuman di rongga hidung. Saat flu, lendir menghalangi molekul bau mencapai saraf olfaktori sehingga makanan terasa hambar.",
                misconception = "Mengira lidah kehilangan kemampuan mengecap rasa secara total saat flu."
            )
        )
    )

    // =========================================================================
    // 6. DAUR HIDUP & METAMORFOSIS HEWAN
    // =========================================================================
    private val daurHidupLesson = LessonData(
        conceptId = "bio-daur-hidup",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pdh1",
                panelNumber = 1,
                title = "Ulat Bulu di Pohon Jeruk",
                caption = "Dimas terkejut melihat seekor ulat hijau rakus memakan daun pohon jeruk purut di halaman rumah.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Ih, ulat bulu ini gemuk sekali dan rakus makan daun! Tapi kata Kakek, ulat ini nanti akan berubah menjadi kupu-kupu yang sangat cantik?",
                sceneVisualEmoji = "🐛",
                sceneDescription = "Ulat hijau rakus memakan helai daun jeruk di pekarangan rumah."
            ),
            StoryPanel(
                id = "pdh2",
                panelNumber = 2,
                title = "Keajaiban Kepompong Metamorfosis Sempurna",
                caption = "Kakek menunjuk sebuah kepompong (pupa) emas yang tergantung diam di balik ranting dahan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itulah Metamorfosis Sempurna! Telur menetas menjadi Ulat (Larva) yang rakus makan, lalu ulat membungkus dirinya menjadi Kepompong (Pupa) yang diam berpuasa. Di dalam kepompong, tubuhnya dirombak total hingga keluarlah Kupu-Kupu Indah bersayap (Imago)!",
                sceneVisualEmoji = "🦋",
                sceneDescription = "Tahapan siklus metamorfosis: telur, ulat, kepompong, hingga kupu-kupu terbang mekar."
            ),
            StoryPanel(
                id = "pdh3",
                panelNumber = 3,
                title = "Metamorfosis Tidak Sempurna Belalang",
                caption = "Kirana menangkap seekor anak belalang kecil (nimfa) di rerumputan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Berbeda dengan kupu-kupu, anak belalang bentuknya sudah mirip belalang dewasa sejak menetas dari telur, hanya saja ukurannya mini dan belum punya sayap! Tanpa fase kepompong, ini dinamakan Metamorfosis Tidak Sempurna!",
                sceneVisualEmoji = "🦗",
                sceneDescription = "Anak belalang (nimfa) mirip belalang dewasa bertumbuh berganti kulit tanpa kepompong."
            )
        ),
        intuitionTitle = "Transformasi Bentuk: Daur Hidup & Metamorfosis Hewan",
        intuitionBody = "Daur hidup adalah tahapan pertumbuhan dan perkembangan makhluk hidup sejak lahir hingga dewasa dan mampu berkembang biak kembali:\n\n" +
                "1. Metamorfosis Sempurna (Holometabola):\n" +
                "   • Mengalami 4 fase perubahan bentuk tubuh yang SANGAT BERBEDA di setiap tahap:\n" +
                "     Telur → Larva (Ulat/Kecebong) → Pupa (Kepompong) → Imago (Dewasa).\n" +
                "   • Contoh: Kupu-kupu, Nyamuk (jentik-jentik), Lalat (belatung), Lebah madu, Katak (berudu berekor berubah jadi katak berkaki).\n\n" +
                "2. Metamorfosis Tidak Sempurna (Hemimetabola):\n" +
                "   • Mengalami 3 fase tanpa fase kepompong (bentuk anak mirip dewasa):\n" +
                "     Telur → Nimfa (hewan muda belum bersayap) → Imago (Dewasa).\n" +
                "   • Pertumbuhan disertai pergantian kulit luar (ekdisis/molting).\n" +
                "   • Contoh: Belalang, Jangkrik, Capung, Kecoak, Rayap.\n\n" +
                "3. Daur Hidup Tanpa Metamorfosis (Ametabola):\n" +
                "   • Sejak lahir bentuk tubuhnya sama persis dengan induknya, hanya bertambah besar ukuran tubuhnya.\n" +
                "   • Contoh: Kucing, Sapi, Ayam, Bebek, Ikan, Manusia.",
        intuitionPoints = listOf(
            "Ulat kupu-kupu memakan daun tumbuhan, sedangkan kupu-kupu dewasa meminum cairan nektar bunga; perbedaan makanan ini mencegah persaingan makan antara anak dan induk!",
            "Katak adalah vertebrata unik yang mengalami metamorfosis: berudu bernapas dengan insang dan hidup di air, saat dewasa memiliki kaki dan bernapas dengan paru-paru serta kulit di darat.",
            "Nyamuk menaruh telurnya di air tergenang; memutus daur hidup nyamuk demam berdarah paling efektif dilakukan dengan menguras dan menutup bak air sebelum jentik berubah jadi nyamuk dewasa."
        ),
        simId = "sim-metamorphosis",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Sempurna}",
                equation = "\\text{Telur} \\rightarrow \\text{Larva (Ulat)} \\rightarrow \\text{Pupa (Kepompong)} \\rightarrow \\text{Imago (Dewasa)}",
                meaning = "Urutan empat fase siklus hidup metamorfosis sempurna serangga.",
                units = "-",
                applicationNote = "Contoh: Kupu-kupu, lebah, nyamuk, katak."
            ),
            FormulaCard(
                symbol = "\\text{Tidak Sempurna}",
                equation = "\\text{Telur} \\rightarrow \\text{Nimfa (Muda)} \\rightarrow \\text{Imago (Dewasa)}",
                meaning = "Urutan tiga fase siklus metamorfosis tidak sempurna tanpa kepompong.",
                units = "-",
                applicationNote = "Contoh: Belalang, jangkrik, kecoak, capung."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengendalian Vektor Nyamuk Aedes aegypti dengan Bakteri Wolbachia di Yogyakarta",
            context = "Kota Yogyakarta menjadi pelopor program penanggulangan demam berdarah dengue (DBD) dunia melalui pelepasan nyamuk Aedes aegypti ber-Wolbachia oleh World Mosquito Program (WMP) bersama UGM.",
            engineeringProblem = "Penyemprotan insektisida kimia fogging hanya membunuh nyamuk dewasa dan memicu resistensi racun, sementara telur dan jentik nyamuk di air tetap menetas berkembang biak.",
            physicalConceptUsed = "Manipulasi daur hidup dan biologi reproduksi serangga: bakteri alami Wolbachia menghambat replikasi virus dengue di tubuh nyamuk dan memicu ketidakcocokan sitoplasma (cytoplasmic incompatibility).",
            mathematicalModel = "Ketika nyamuk jantan ber-Wolbachia kawin dengan nyamuk betina liar lokal, telur yang dihasilkan tidak dapat menetas menembus fase larva (menetas 0%). Populasi nyamuk penular DBD merosot drastis secara alami.",
            realWorldImpact = "Menurunkan kasus penularan demam berdarah hingga 77% dan memangkas angka rawat inap rumah sakit pasien anak hingga 86% di Daerah Istimewa Yogyakarta.",
            relatedCareers = listOf("Entomolog Medis Peneliti Nyamuk", "Epidemiolog Penyakit Menular Tropis", "Teknisi Laboratorium Kultur Vektor"),
            verifiedSource = "Pusat Kedokteran Tropis Universitas Gadjah Mada (UGM) / Kementerian Kesehatan RI."
        ),
        homeLab = HomeLabData(
            title = "Memelihara Ulat Daun Jeruk Menjadi Kupu-Kupu Cantik di Toples Berventilasi",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 ekor ulat daun kecil (biasanya ditemukan di pohon jeruk nipis/jeruk purut halaman rumah)",
                "1 toples plastik besar bening",
                "Kain kasa atau kain jaring halus dan karet gelang (sebagai penutup toples berventilasi udara segar)",
                "Ranting kayu kecil disandarkan di dalam toples",
                "Daun jeruk segar setiap hari sebagai pakan ulat"
            ),
            steps = listOf(
                "Masukkan ranting kayu kecil berdiri miring di dalam toples.",
                "Letakkan ulat daun jeruk di atas ranting, beri 2-3 helai daun jeruk segar.",
                "Tutup toples dengan kain kasa berpori dan ikat dengan karet gelang agar udara bebas mengalir.",
                "Beri makan daun jeruk segar setiap pagi dan bersihkan kotoran ulat di dasar toples.",
                "Setelah 5–7 hari makan rakus, ulat akan memanjat ranting kayu dan menggantung diam membentuk KEPOMPONG (Pupa) yang mengeras!",
                "Biarkan kepompong tergantung tenang di tempat teduh selama 7–10 hari.",
                "AMATI SAAT KEPOMPONG TERBELAH: KELUARLAH KUPU-KUPU INDAH BERSAYAP MEKAR! Lepaskan kupu-kupu tersebut terbang bebas ke taman bunga pekarangan rumahmu!"
            ),
            observationGoal = "Menyaksikan secara langsung seluruh siklus keajaiban metamorfosis sempurna serangga dari ulat rakus menjadi kupu-kupu bersayap.",
            connectionToSimulation = "Bandingkan tahapan ulatmu dengan simulator metamorfosis interaktif Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-dh-1",
                prompt = "Urutan tahapan metamorfosis SEMPURNA pada daur hidup kupu-kupu yang BENAR adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Telur → Ulat (Larva) → Kepompong (Pupa) → Kupu-kupu (Imago)",
                    "Telur → Nimfa → Kepompong → Kupu-kupu",
                    "Telur → Kupu-kupu muda → Kepompong → Dewasa",
                    "Ulat → Telur → Kepompong → Kupu-kupu"
                ),
                correctAnswer = "Telur → Ulat (Larva) → Kepompong (Pupa) → Kupu-kupu (Imago)",
                hints = listOf(
                    "Dimulai dari telur yang ditaruh induk di daun.",
                    "Telur menetas jadi ulat rakus makan, lalu berpuasa jadi kepompong sebelum keluar bersayap."
                ),
                explanation = "Metamorfosis sempurna serangga terdiri dari 4 fase: Telur → Larva (ulat) → Pupa (kepompong) → Imago (kupu-kupu dewasa).",
                misconception = "Melewatkan fase kepompong atau tertukar urutan larva dan pupa."
            ),
            QuizQuestion(
                id = "q-dh-2",
                prompt = "Ciri utama yang membedakan metamorfosis TIDAK SEMPURNA (seperti pada belalang) dari metamorfosis sempurna adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Tidak mengalami fase kepompong (pupa) dan bentuk muda (nimfa) mirip dewasa",
                    "Tidak melalui fase telur sama sekali",
                    "Bentuk tubuh anak jauh berbeda dari induknya",
                    "Mengalami fase ulat yang sangat rakus makan"
                ),
                correctAnswer = "Tidak mengalami fase kepompong (pupa) dan bentuk muda (nimfa) mirip dewasa",
                hints = listOf(
                    "Belalang menetas dari telur langsung berbentuk belalang kecil (nimfa).",
                    "Tidak ada fase istirahat membungkus diri."
                ),
                explanation = "Metamorfosis tidak sempurna (seperti belalang, kecoak, jangkrik) hanya memiliki 3 tahap (telur → nimfa → imago) tanpa fase kepompong (pupa), dan bentuk nimfa muda sudah mirip bentuk dewasanya.",
                misconception = "Mengira belalang juga membungkus diri menjadi kepompong sebelum dewasa."
            )
        )
    )
}

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

object MathLevel3Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "mat-kuadrat",
            domain = Domain.MATEMATIKA,
            topic = "Aljabar Kuadrat",
            title = "Persamaan & Fungsi Kuadrat",
            description = "Bentuk umum ax² + bx + c = 0, rumus abc, diskriminan (D = b² - 4ac), serta kurva parabola dan sumbu simetri.",
            level = DepthLevel.L3,
            estMinutes = 16,
            prerequisites = listOf("mat-persamaan-linear", "mat-bilangan-pangkat-akar")
        ),
        ConceptItem(
            id = "mat-eksponen-logaritma",
            domain = Domain.MATEMATIKA,
            topic = "Eksponen & Logaritma",
            title = "Fungsi Eksponen & Logaritma",
            description = "Fungsi pertumbuhan/peluruhan eksponensial, definisi logaritma sebagai invers pangkat, dan sifat-sifat logaritma.",
            level = DepthLevel.L3,
            estMinutes = 16,
            prerequisites = listOf("mat-bilangan-pangkat-akar")
        ),
        ConceptItem(
            id = "mat-barisan-deret",
            domain = Domain.MATEMATIKA,
            topic = "Barisan & Deret",
            title = "Barisan & Deret (Aritmetika & Geometri)",
            description = "Pola bilangan selisih tetap (aritmetika), rasio berlipat (geometri), deret tak hingga konvergen, dan notasi sigma.",
            level = DepthLevel.L3,
            estMinutes = 15,
            prerequisites = listOf("mat-pecahan-rasio")
        ),
        ConceptItem(
            id = "mat-trigonometri-lanjut",
            domain = Domain.MATEMATIKA,
            topic = "Trigonometri Lanjut",
            title = "Trigonometri Analitik & Sudut Berelasi",
            description = "Lingkaran satuan 4 kuadran, aturan sinus dan kosinus pada segitiga sembarang, serta identitas sudut rangkap.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("mat-trigonometri-dasar")
        ),
        ConceptItem(
            id = "mat-polinomial",
            domain = Domain.MATEMATIKA,
            topic = "Polinomial",
            title = "Polinomial & Teorema Sisa",
            description = "Suku banyak berderajat tinggi, pembagian bersusun dan skema Horner, Teorema Sisa, dan Teorema Faktor.",
            level = DepthLevel.L3,
            estMinutes = 16,
            prerequisites = listOf("mat-kuadrat")
        ),
        ConceptItem(
            id = "mat-matriks",
            domain = Domain.MATEMATIKA,
            topic = "Aljabar Matriks",
            title = "Matriks, Determinan & Invers",
            description = "Operasi baris dan kolom matriks, determinan matriks 2x2 dan 3x3, invers matriks, dan pemecahan sistem persamaan.",
            level = DepthLevel.L3,
            estMinutes = 17,
            prerequisites = listOf("mat-spldv")
        ),
        ConceptItem(
            id = "mat-vektor",
            domain = Domain.MATEMATIKA,
            topic = "Vektor",
            title = "Vektor Geometris & Aljabar (2D & 3D)",
            description = "Besaran berarah pada ruang 2D dan 3D, panjang vektor, perkalian titik (dot product), dan sudut antar-vektor.",
            level = DepthLevel.L3,
            estMinutes = 16,
            prerequisites = listOf("mat-trigonometri-dasar", "mat-pythagoras")
        ),
        ConceptItem(
            id = "mat-geometri-analitik",
            domain = Domain.MATEMATIKA,
            topic = "Geometri Analitik",
            title = "Geometri Analitik & Irisan Kerucut",
            description = "Persamaan lingkaran, garis singgung lingkaran, serta pengenalan kurva irisan kerucut parabola, elips, dan hiperbola.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("mat-kuadrat", "mat-pythagoras")
        ),
        ConceptItem(
            id = "mat-komposisi-invers",
            domain = Domain.MATEMATIKA,
            topic = "Fungsi Lanjut",
            title = "Fungsi Komposisi & Fungsi Invers",
            description = "Operasi aljabar fungsi, komposisi fungsi (f o g)(x), syarat fungsi bijektif, dan menentukan rumus fungsi balikan invers.",
            level = DepthLevel.L3,
            estMinutes = 15,
            prerequisites = listOf("mat-fungsi-grafik")
        ),
        ConceptItem(
            id = "mat-limit",
            domain = Domain.MATEMATIKA,
            topic = "Pengantar Kalkulus",
            title = "Limit Fungsi Aljabar & Trigonometri",
            description = "Konsep pendekatan nilai limit intuitif, teknik pemfaktoran dan kali sekawan, limit di tak hingga, dan limit dasar trigonometri.",
            level = DepthLevel.L3,
            estMinutes = 17,
            prerequisites = listOf("mat-fungsi-grafik", "mat-trigonometri-lanjut")
        ),
        ConceptItem(
            id = "mat-turunan-integral",
            domain = Domain.MATEMATIKA,
            topic = "Kalkulus Dasar",
            title = "Turunan & Integral Dasar",
            description = "Konsep laju perubahan turunan f'(x), gradien garis singgung kurva, nilai stasioner maks/min, serta antiturunan integral luas.",
            level = DepthLevel.L3,
            estMinutes = 20,
            prerequisites = listOf("mat-limit")
        ),
        ConceptItem(
            id = "mat-statistika-peluang",
            domain = Domain.MATEMATIKA,
            topic = "Kombinatorika & Peluang",
            title = "Kombinatorika, Permutasi & Peluang Majemuk",
            description = "Aturan perkalian, faktorial, permutasi dan kombinasi, peluang kejadian saling lepas dan bebas, serta simpangan baku.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("mat-peluang-dasar")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "mat-kuadrat" -> kuadratLesson
            "mat-eksponen-logaritma" -> eksponenLogaritmaLesson
            "mat-barisan-deret" -> barisanDeretLesson
            "mat-trigonometri-lanjut" -> trigonometriLanjutLesson
            "mat-polinomial" -> polinomialLesson
            "mat-matriks" -> matriksLesson
            "mat-vektor" -> vektorLesson
            "mat-geometri-analitik" -> geometriAnalitikLesson
            "mat-komposisi-invers" -> komposisiInversLesson
            "mat-limit" -> limitLesson
            "mat-turunan-integral" -> turunanIntegralLesson
            "mat-statistika-peluang" -> statistikaPeluangLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. LESSON: PERSAMAAN & FUNGSI KUADRAT
    // =========================================================================
    private val kuadratLesson = LessonData(
        conceptId = "mat-kuadrat",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pkd1",
                panelNumber = 1,
                title = "Lengkungan Semburan Air Mancur",
                caption = "Kirana dan Dimas duduk di tepi kolam air mancur Bundaran HI Jakarta. Semburan air membentuk kurva lengkung simetris yang memukau.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Air mancur ini memancar naik cepat, melambat di puncak ketinggian tertinggi, lalu melengkung jatuh kembali ke kolam. Bentuk kurva apakah ini?",
                sceneVisualEmoji = "⛲",
                sceneDescription = "Semburan air mancur kolam bundaran kota membentuk kurva parabola simetris."
            ),
            StoryPanel(
                id = "pkd2",
                panelNumber = 2,
                title = "Kurva Parabola & Fungsi Kuadrat",
                caption = "Kakek membuka buku sketsa dan menggambar persamaan f(x) = ax² + bx + c.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Lengkungan itu adalah PARABOLA dari Fungsi Kuadrat! Karena koefisien a bernilai negatif (gravitasi menarik ke bawah), parabolanya membuka ke bawah dan memiliki Titik Puncak Maksimum!",
                sceneVisualEmoji = "📉",
                sceneDescription = "Grafik fungsi kuadrat parabola membuka ke bawah dengan titik puncak puncak tertinggi."
            ),
            StoryPanel(
                id = "pkd3",
                panelNumber = 3,
                title = "Rumus Sakti ABC & Diskriminan",
                caption = "Dimas menuliskan rumus penentu akar persamaan kuadrat di buku.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Untuk mencari di mana air menyentuh tanah (f(x) = 0), kita cari akar-akarnya pakai Rumus ABC: x = [-b ± √(b² - 4ac)] / (2a)! Nilai di dalam akar b² - 4ac disebut Diskriminan (D)!",
                sceneVisualEmoji = "🧮",
                sceneDescription = "Rumus kuadratik abc ditulis lengkap bersama simbol diskriminan D."
            ),
            StoryPanel(
                id = "pkd4",
                panelNumber = 4,
                title = "Misteri Tiga Wajah Diskriminan",
                caption = "Kirana meneliti arti nilai Diskriminan D terhadap posisi kurva.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jika D > 0, kurva memotong sumbu X di 2 titik berbeda. Jika D = 0, kurva hanya menyinggung sumbu X di 1 titik kembar. Dan jika D < 0, kurva melayang tanpa pernah menyentuh sumbu X sama sekali!",
                sceneVisualEmoji = "✨",
                sceneDescription = "Tiga kemungkinan posisi kurva parabola terhadap sumbu X berdasarkan nilai D."
            )
        ),
        intuitionTitle = "Simetri Parabola: Titik Ekstrem, Sumbu Simetri & Diskriminan",
        intuitionBody = "Persamaan dan fungsi kuadrat melibatkan variabel berpangkat dua sebagai pangkat tertingginya.\n\n" +
                "1. Bentuk Umum:\n" +
                "   • Persamaan Kuadrat: ax² + bx + c = 0 (dengan a ≠ 0).\n" +
                "   • Fungsi Kuadrat: f(x) = ax² + bx + c.\n\n" +
                "2. Menentukan Akar-Akar Persamaan Kuadrat:\n" +
                "   • Pemfaktoran: (x - x₁)(x - x₂) = 0.\n" +
                "   • Melengkapkan Kuadrat Sempurna.\n" +
                "   • Rumus ABC: x₁,₂ = [-b ± √(b² - 4ac)] / (2a).\n\n" +
                "3. Karakteristik Kurva Parabola:\n" +
                "   • Jika a > 0: Parabola membuka ke atas (memiliki titik balik minimum).\n" +
                "   • Jika a < 0: Parabola membuka ke bawah (memiliki titik balik maksimum).\n" +
                "   • Sumbu Simetri: x = -b / (2a).\n" +
                "   • Nilai Puncak Ekstrem: y = -D / (4a), dengan D = b² - 4ac.\n\n" +
                "4. Makna Geometris Diskriminan D = b² - 4ac:\n" +
                "   • D > 0: Memotong sumbu X di dua titik berlainan (dua akar real berbeda).\n" +
                "   • D = 0: Menyinggung sumbu X di satu titik (akar kembar / satu akar real).\n" +
                "   • D < 0: Tidak memotong sumbu X sama sekali (akar imajiner/kompleks).",
        intuitionPoints = listOf(
            "Sumbu simetri x = -b/(2a) selalu membelah kurva parabola menjadi dua bagian yang simetris persis seperti cermin.",
            "Hubungan akar-akar Vieta: x₁ + x₂ = -b/a dan x₁ · x₂ = c/a.",
            "Semua lintasan benda yang dilempar di udara bumi (gerak parabola) dimodelkan secara matematis oleh fungsi kuadrat terhadap waktu t."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "x_{1,2} \\text{ (Rumus ABC)}",
                equation = "x_{1,2} = \\frac{-b \\pm \\sqrt{b^2 - 4ac}}{2a}",
                meaning = "Rumus kuadratik universal untuk mencari akar penyelesaian ax² + bx + c = 0.",
                units = "Nilai akar real",
                applicationNote = "Diskriminan D = b² - 4ac menentukan jenis akar penyelesaian."
            ),
            FormulaCard(
                symbol = "(x_p, y_p)",
                equation = "x_p = -\\frac{b}{2a} \\quad , \\quad y_p = -\\frac{D}{4a}",
                meaning = "Koordinat titik puncak ekstrem (maksimum atau minimum) kurva parabola.",
                units = "Koordinat Kartesius",
                applicationNote = "Digunakan dalam persoalan optimasi biaya minimum atau ketinggian maksimum roket."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Optimasi Ketinggian Roket Peluncur Satelit LAPAN / BRIN",
            context = "Pusat Teknologi Roket BRIN merancang roket uji muatan sonda atmosfer yang diluncurkan dari Stasiun Peluncuran Pameungpeuk Garut.",
            engineeringProblem = "Ketinggian roket terhadap waktu dinyatakan fungsi kuadrat h(t) = 120t - 5t² meter. Kapan roket mencapai ketinggian maksimum dan berapa meter ketinggian puncaknya sebelum parasut terbuka?",
            physicalConceptUsed = "Penentuan titik puncak maksimum fungsi kuadrat parabola vertikal.",
            mathematicalModel = "Sumbu simetri waktu puncak t_p = -b / (2a) = -120 / (2 × -5) = 12 detik. Ketinggian maksimum h_max = h(12) = 120(12) - 5(12²) = 1.440 - 720 = 720 meter.",
            realWorldImpact = "Menentukan waktu pemicu elektronik parasut pendaratan secara presisi milidetik agar badan roket tidak hancur jatuh menghantam laut.",
            relatedCareers = listOf("Insinyur Aerodinamika Roket", "Ahli Sistem Kontrol Kedirgantaraan", "Fisikawan Propulsi Ruang Angkasa"),
            verifiedSource = "Pusat Riset Teknologi Roket BRIN & LAPAN Indonesia."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Kurva Parabola Tali Gantung Kendur (Katenari vs Parabola)",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("Seutas tali tambang atau rantai kalung 1 meter", "Kertas karton besar dan spidol", "2 penjepit jemuran"),
            steps = listOf(
                "Langkah 1: Tempelkan kertas karton di dinding datar.",
                "Langkah 2: Gantungkan kedua ujung tali dengan penjepit jemuran pada ketinggian yang sama berjarak 60 cm horizontal.",
                "Langkah 3: Biarkan bagian tengah tali menggelayut kendur membentuk lengkungan alami gravitasi.",
                "Langkah 4: Jiplak bentuk lengkungan tali tersebut dengan spidol di atas kertas karton.",
                "Langkah 5: Ukur jarak titik puncak terbawahnya dan bandingkan dengan lengkungan parabola: bentuk inilah yang menjadi prinsip kabel gantung Jembatan Suramadu!"
            ),
            observationGoal = "Menyaksikan bagaimana gravitasi secara alami menghasilkan kurva simetris yang dimodelkan oleh persamaan aljabar tingkat dua.",
            connectionToSimulation = "Bandingkan kurva jiplakanmu dengan kurva parabola simulator kuadrat!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kua-1",
                prompt = "Berapakah nilai Diskriminan (D) dari persamaan kuadrat: x² - 6x + 9 = 0?",
                type = "numeric",
                correctAnswer = "0",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Identifikasi nilai a, b, dan c: a = 1, b = -6, c = 9.",
                    "Gunakan rumus D = b² - 4ac.",
                    "D = (-6)² - 4(1)(9) = 36 - 36 = ...?"
                ),
                explanation = "D = b² - 4ac = (-6)² - 4(1)(9) = 36 - 36 = 0. Karena D = 0, persamaan ini memiliki akar kembar real x = 3.",
                misconception = "Lupa mengkuadratkan tanda negatif pada (-6)² sehingga menghitung -36."
            ),
            QuizQuestion(
                id = "q-kua-2",
                prompt = "Sebuah fungsi kuadrat memiliki rumus f(x) = -x² + 4x + 5. Berapakah koordinat x pada sumbu simetri kurva parabola tersebut?",
                type = "numeric",
                correctAnswer = "2",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Gunakan rumus sumbu simetri: x = -b / (2a).",
                    "Di sini a = -1 dan b = 4.",
                    "x = -4 / (2 × -1) = -4 / -2 = ...?"
                ),
                explanation = "Sumbu simetri x = -b / (2a) = -4 / (2 × -1) = -4 / -2 = 2.",
                misconception = "Lupa tanda minus di depan b sehingga mendapat nilai -2."
            )
        )
    )

    // =========================================================================
    // 2. LESSON: FUNGSI EKSPONEN & LOGARITMA
    // =========================================================================
    private val eksponenLogaritmaLesson = LessonData(
        conceptId = "mat-eksponen-logaritma",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pel1",
                panelNumber = 1,
                title = "Pertumbuhan Bunga Majemuk Bank",
                caption = "Kakek menunjukkan buku tabungan deposito bank kepada Kirana dan Dimas.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jika kita menabung uang dengan bunga majemuk 10% per tahun, bunganya akan berbunga lagi di tahun berikutnya! Uang kita bertumbuh secara eksponensial mengikuti rumus bunga majemuk!",
                sceneVisualEmoji = "💰",
                sceneDescription = "Kurva grafik saldo tabungan uang bertambah secara eksponensial melengkung ke atas."
            ),
            StoryPanel(
                id = "pel2",
                panelNumber = 2,
                title = "Memutar Balik Pertanyaan: Logaritma",
                caption = "Dimas bertanya balik kepada Kakek sambil memegang kalkulator.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika 2³ = 8, pertanyaannya dibalik: '2 dipangkatkan berapa agar hasilnya 8?' Jawabannya adalah 3! Operasi memutar balik pencari pangkat ini dinamakan LOGARITMA: ²log 8 = 3!",
                sceneVisualEmoji = "🔄",
                sceneDescription = "Diagram inversi pangkat menjadi logaritma: basis pangkat menjadi basis logaritma."
            ),
            StoryPanel(
                id = "pel3",
                panelNumber = 3,
                title = "Sifat Ajaib Perkalian Jadi Penjumlahan",
                caption = "Kirana mencatat sifat-sifat logaritma John Napier abad ke-17.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Luar biasa! Logaritma mengubah perkalian rumit menjadi penjumlahan sederhana: ᵃlog(b × c) = ᵃlog b + ᵃlog c! Dulu para astronom menghitung orbit planet jutaan kilometer dengan tabel logaritma ini!",
                sceneVisualEmoji = "📜",
                sceneDescription = "Tabel kuno logaritma menyederhanakan perhitungan perkalian angka raksasa."
            ),
            StoryPanel(
                id = "pel4",
                panelNumber = 4,
                title = "Skala Desibel & Derajat Keasaman pH",
                caption = "Kakek menunjukkan bahwa suara keras dan larutan kimia diukur dengan logaritma.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Skala keasaman pH kimia [pH = -log H⁺] dan intensitas desibel telinga manusia semuanya memakai logaritma karena indera manusia merespons rangsang secara logaritmik!",
                sceneVisualEmoji = "🔊",
                sceneDescription = "Pengukur intensitas suara desibel dan alat pH meter berbasis skala logaritmik."
            )
        ),
        intuitionTitle = "Inversi Pertumbuhan: Eksponensial Melawan Logaritma",
        intuitionBody = "Fungsi eksponen dan logaritma adalah dua fungsi yang saling berkebalikan (invers) satu sama lain.\n\n" +
                "1. Definisi Logaritma:\n" +
                "   ᵃlog b = c  jika dan hanya jika  aᶜ = b\n" +
                "   Syarat: Basis a > 0 dan a ≠ 1; Numerus b > 0 (numerus wajib positif!).\n" +
                "   Notasi internasional sering menuliskan log_a(b).\n\n" +
                "2. Sifat-Sifat Pokok Logaritma:\n" +
                "   • ᵃlog 1 = 0  (karena a⁰ = 1)\n" +
                "   • ᵃlog a = 1  (karena a¹ = a)\n" +
                "   • ᵃlog(b × c) = ᵃlog b + ᵃlog c\n" +
                "   • ᵃlog(b / c) = ᵃlog b - ᵃlog c\n" +
                "   • ᵃlog(bⁿ) = n × ᵃlog b\n" +
                "   • Ganti Basis: ᵃlog b = (ᶜlog b) / (ᶜlog a)\n" +
                "   • Perkalian Rantai: ᵃlog b × ᵇlog c = ᵃlog c\n\n" +
                "3. Bilangan Euler (e ≈ 2,71828) & Logaritma Natural (ln):\n" +
                "   Logaritma dengan basis e ditulis sebagai ln(x) (dibaca 'lon x'). Digunakan dalam peluruhan radioaktif dan pemodelan biologi populasi.",
        intuitionPoints = listOf(
            "Numerus logaritma TIDAK PERNAH boleh bernilai nol atau negatif (grafik y = log x tidak pernah menyentuh atau melintasi sumbu Y).",
            "Fungsi f(x) = aˣ dan g(x) = ᵃlog x adalah cermin simetris sempurna terhadap garis diagonal y = x.",
            "Logaritma basis 10 biasa ditulis cukup 'log x' tanpa menuliskan angka 10 di atasnya."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "^a\\log b = c",
                equation = "^a\\log b = c \\iff a^c = b \\quad (a > 0, a \\ne 1, b > 0)",
                meaning = "Definisi fundamental logaritma sebagai operasi invers pencari eksponen pangkat.",
                units = "Hubungan ekuivalensi",
                applicationNote = "Contoh: ³log 81 = 4 karena 3⁴ = 81."
            ),
            FormulaCard(
                symbol = "N(t)",
                equation = "N(t) = N_0 \\cdot e^{kt} \\quad \\text{atau} \\quad N(t) = N_0 \\left(\\frac{1}{2}\\right)^{t/T_{1/2}}",
                meaning = "Model pertumbuhan populasi biologis dan peluruhan zat radioaktif isotop (waktu paruh).",
                units = "Jumlah populasi / massa",
                applicationNote = "Digunakan pada penanggalan fosil purbakala Karbon-14 arkeologi."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Penanggalan Radiokarbon Karbon-14 Fosil Manusia Purba Sangiran Solo",
            context = "Balai Pelestarian Situs Manusia Purba Sangiran Jawa Tengah meneliti usia tulang fosil Homo erectus yang terkubur di lapisan tanah purba.",
            engineeringProblem = "Bagaimana arkeolog mengetahui fosil telah terkubur 50.000 tahun yang lalu hanya dari sisa atom tulang?",
            physicalConceptUsed = "Hukum peluruhan eksponensial radioaktif isotop Karbon-14 dengan waktu paruh T = 5.730 tahun dan penyelesaian waktu via logaritma natural ln.",
            mathematicalModel = "Persamaan N(t) = N₀ · e^(-λt). Dengan mengukur sisa rasio isotop C-14 sebesar 0,2% dari tulang hidup, usia fosil dihitung: t = -ln(N/N₀) / λ ≈ 51.500 tahun yang lalu.",
            realWorldImpact = "Menempatkan situs Sangiran sebagai Warisan Budaya Dunia UNESCO yang membuktikan sejarah evolusi peradaban manusia nusantara.",
            relatedCareers = listOf("Arkeolog Arkeometri", "Fisikawan Nuklir Spektrometri Massa", "Peneliti Paleontologi BRIN"),
            verifiedSource = "Balai Pelestarian Situs Manusia Purba (BPSMP) Sangiran Kemendikbudristek."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Penurunan Suhu Kopi Panas (Hukum Pendinginan Newton)",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf("1 cangkir air teh/kopi panas", "Termometer makanan/dapur", "Stopwatch HP", "Kertas dan pulpen"),
            steps = listOf(
                "Langkah 1: Ukur suhu air panas saat pertama kali diseduh (misalnya: 80°C) dan ukur suhu ruangan (misal: 30°C).",
                "Langkah 2: Nyalakan stopwatch dan catat penurunan suhu air setiap 5 menit selama 20 menit.",
                "Langkah 3: Amati laju penurunannya: pada 5 menit pertama suhu turun drastis (misal turun 15°C), namun pada 5 menit terakhir suhu hanya turun sedikit (misal turun 3°C).",
                "Langkah 4: Buat grafiknya di kertas: kurva penurunan suhu ini melandai asimtotik mendekati suhu kamar secara eksponensial!"
            ),
            observationGoal = "Menyaksikan fenomena peluruhan eksponensial alami pada perpindahan panas fluida.",
            connectionToSimulation = "Bandingkan kurva pendinginan teh dengan simulator fungsi eksponen!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-log-1",
                prompt = "Berapakah nilai dari ²log 32?",
                type = "numeric",
                correctAnswer = "5",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Cari nilai x sedemikian rupa sehingga 2ˣ = 32.",
                    "2¹ = 2, 2² = 4, 2³ = 8, 2⁴ = 16, 2⁵ = ...?",
                    "Maka ²log 32 = ...?"
                ),
                explanation = "²log 32 = 5 karena 2⁵ = 32.",
                misconception = "Membagi 32 dengan 2 menghasilkan 16."
            ),
            QuizQuestion(
                id = "q-log-2",
                prompt = "Jika diketahui log 2 = 0,301 dan log 3 = 0,477, berapakah nilai dari log 6?",
                type = "numeric",
                correctAnswer = "0.778",
                tolerance = 0.01f,
                unit = "",
                hints = listOf(
                    "Faktorkan angka 6: 6 = 2 × 3.",
                    "Gunakan sifat perkalian logaritma: log(2 × 3) = log 2 + log 3.",
                    "Hitung 0,301 + 0,477 = ...?"
                ),
                explanation = "log 6 = log(2 × 3) = log 2 + log 3 = 0,301 + 0,477 = 0,778.",
                misconception = "Mengalikan nilai logaritmanya alih-alih menjumlahkannya."
            )
        )
    )

    // =========================================================================
    // 3. LESSON: BARISAN & DERET (ARITMETIKA & GEOMETRI)
    // =========================================================================
    private val barisanDeretLesson = LessonData(
        conceptId = "mat-barisan-deret",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pbd-s1",
                panelNumber = 1,
                title = "Susunan Kursi Stadion Gelora Bung Karno",
                caption = "Kirana dan Ayah menonton pertandingan sepak bola di Stadion GBK Jakarta. Kursi penonton berderet bertingkat mengelilingi lapangan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Baris paling depan ada 20 kursi, baris kedua ada 24 kursi, baris ketiga ada 28 kursi... Pola penambahannya selalu bertambah 4 kursi di setiap baris!",
                sceneVisualEmoji = "🏟️",
                sceneDescription = "Tribun stadion sepak bola bertingkat dengan jumlah kursi bertambah teratur di tiap baris."
            ),
            StoryPanel(
                id = "pbd-s2",
                panelNumber = 2,
                title = "Barisan Aritmetika: Selisih Beda Tetap",
                caption = "Kakek menjelaskan rumus suku ke-n barisan aritmetika.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ini adalah Barisan Aritmetika dengan suku pertama a = 20 dan beda b = 4! Suku ke-n dirumuskan: Un = a + (n - 1)b! Untuk baris ke-10: U₁₀ = 20 + 9(4) = 56 kursi!",
                sceneVisualEmoji = "💺",
                sceneDescription = "Pola penambahan selisih beda konstan pada barisan aritmetika."
            ),
            StoryPanel(
                id = "pbd-s3",
                panelNumber = 3,
                title = "Trik Jenius Carl Friedrich Gauss",
                caption = "Dimas menceritakan kisah Gauss kecil saat diminta menjumlahkan 1 sampai 100 oleh gurunya.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Gauss tidak menghitung satu per satu! Dia memasangkan ujung depan dan belakang: 1+100=101, 2+99=101... Ada 50 pasang 101, sehingga totalnya 50 × 101 = 5.050! Inilah rumus deret Sn = n/2 (a + Un)!",
                sceneVisualEmoji = "💡",
                sceneDescription = "Metode pasangan Gauss menjumlahkan deret bilangan dengan cepat."
            ),
            StoryPanel(
                id = "pbd-s4",
                panelNumber = 4,
                title = "Deret Geometri Tak Hingga Bola Membal",
                caption = "Kirana menjatuhkan bola tenis dari ketinggian 4 meter. Setiap kali membal, tingginya menjadi separuh (1/2) tinggi sebelumnya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Tinggi pantulan: 4 m, 2 m, 1 m, 0,5 m, 0,25 m... Bola membal tanpa henti secara teoretis, tetapi total seluruh panjang lintasannya berhingga karena rasionya |r| < 1 konvergen!",
                sceneVisualEmoji = "🎾",
                sceneDescription = "Pantulan bola tenis yang semakin mengecil menunjukkan deret geometri tak hingga konvergen."
            )
        ),
        intuitionTitle = "Pola Keteraturan: Barisan Aritmetika, Geometri & Deret Tak Hingga",
        intuitionBody = "Barisan adalah daftar bilangan berurutan yang mengikuti pola aturan tertentu, sedangkan Deret adalah penjumlahan dari suku-suku barisan tersebut.\n\n" +
                "1. Barisan & Deret Aritmetika (Pola Selisih Beda b Tetap):\n" +
                "   • Beda: b = Uₙ - Uₙ₋₁.\n" +
                "   • Suku ke-n: Uₙ = a + (n - 1)b.\n" +
                "   • Jumlah n suku pertama (Deret): Sₙ = n/2 (a + Uₙ) = n/2 [2a + (n - 1)b].\n\n" +
                "2. Barisan & Deret Geometri (Pola Rasio Pengali r Tetap):\n" +
                "   • Rasio: r = Uₙ / Uₙ₋₁.\n" +
                "   • Suku ke-n: Uₙ = a · rⁿ⁻¹.\n" +
                "   • Jumlah n suku pertama: Sₙ = a(1 - rⁿ) / (1 - r) untuk r < 1.\n\n" +
                "3. Deret Geometri Tak Hingga (S_∞):\n" +
                "   Jika rasio berada dalam rentang konvergen -1 < r < 1 (|r| < 1), maka deret tak hingga dapat dijumlahkan menjadi nilai berhingga:\n" +
                "   S_∞ = a / (1 - r).",
        intuitionPoints = listOf(
            "Rumus suku tengah barisan aritmetika untuk n ganjil adalah Ut = (a + Un) / 2.",
            "Jika rasio |r| ≥ 1, deret geometri tak hingga bersifat Divergen (hasil jumlahnya menuju tak hingga ∞).",
            "Lintasan total bola membal yang dijatuhkan dari ketinggian h dengan rasio pantul a/b dirumuskan praktis: S_total = h × (b + a) / (b - a)."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "U_n \\& S_n \\text{ (Aritmetika)}",
                equation = "U_n = a + (n - 1)b \\quad , \\quad S_n = \\frac{n}{2}\\left(2a + (n - 1)b\\right)",
                meaning = "Rumus suku ke-n dan jumlah n suku pertama deret aritmetika.",
                units = "Bilangan real",
                applicationNote = "Suku pertama a, beda b, banyak suku n."
            ),
            FormulaCard(
                symbol = "S_\\infty \\text{ (Geometri)}",
                equation = "S_\\infty = \\frac{a}{1 - r} \\quad (-1 < r < 1)",
                meaning = "Jumlah deret geometri tak hingga yang konvergen mendekati limit terhingga.",
                units = "Limit jumlah",
                applicationNote = "Deret 1 + 1/2 + 1/4 + 1/8 + ... = 1 / (1 - 1/2) = 1 / 0,5 = 2."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Perhitungan Anuitas Kredit Usaha Rakyat (KUR) Bank BRI",
            context = "Bank Rakyat Indonesia (BRI) menyalurkan Kredit Usaha Rakyat (KUR) berbunga subsidi ringan 6% efektif per tahun kepada jutaan pedagang kecil.",
            engineeringProblem = "Bagaimana sistem perbankan menghitung porsi cicilan pokok dan porsi bunga setiap bulan agar angsuran nasabah bernilai tepat sama setiap bulannya?",
            physicalConceptUsed = "Aplikasi deret geometri anuitas diskonto waktu nilai uang (Present Value of Annuity).",
            mathematicalModel = "Cicilan bulanan A dihitung menggunakan rumus deret geometri terdiskonto: A = (P × i) / [1 - (1 + i)⁻ⁿ], di mana P adalah pokok pinjaman dan i suku bunga per periode.",
            realWorldImpact = "Memberikan kepastian angsuran bulanan yang terjangkau bagi jutaan pedagang bakso, warung kelontong, dan petani di pelosok desa Nusantara.",
            relatedCareers = listOf("Credit Risk Analyst Perbankan", "Aktuaris Keuangan Mikro", "Software Engineer Core Banking"),
            verifiedSource = "PT Bank Rakyat Indonesia (Persero) Tbk / Pedoman Kredit Usaha Rakyat Kemenko Perekonomian."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Rasio Pantulan Bola Karet (Deret Geometri)",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("1 bola tenis atau bola bekel karet", "Pita meteran tegak di dinding", "Kamera smartphone video slow-motion"),
            steps = listOf(
                "Langkah 1: Tempelkan pita meteran tegak di dinding dari lantai hingga tinggi 100 cm.",
                "Langkah 2: Lepaskan bola tenis dari ketinggian tepat h₀ = 100 cm tanpa didorong.",
                "Langkah 3: Amati tinggi pantulan pertama h₁ (misalnya: 64 cm). Rasio pantul r = 64 / 100 = 0,64.",
                "Langkah 4: Rekam pantulan kedua h₂ (misalnya: 41 cm). Perhatikan bahwa 41 / 64 ≈ 0,64 (rasio r tetap konstan!).",
                "Langkah 5: Hitung total jarak lintasan naik-turun bola hingga berhenti menggunakan rumus deret geometri tak hingga!"
            ),
            observationGoal = "Melihat secara langsung fenomena fisika nyata yang membentuk deret geometri konvergen.",
            connectionToSimulation = "Bandingkan pantulan bolamu dengan simulator barisan deret!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-deret-1",
                prompt = "Diketahui barisan aritmetika: 5, 8, 11, 14, ... Berapakah nilai suku ke-10 (U₁₀)?",
                type = "numeric",
                correctAnswer = "32",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Suku pertama a = 5.",
                    "Beda b = 8 - 5 = 3.",
                    "Gunakan rumus Uₙ = a + (n - 1)b.",
                    "U₁₀ = 5 + (10 - 1) × 3 = 5 + 9 × 3 = ...?"
                ),
                explanation = "a = 5, b = 3. U₁₀ = a + 9b = 5 + 9(3) = 5 + 27 = 32.",
                misconception = "Lupa mengurangkan n dengan 1 sehingga menghitung 5 + 10(3) = 35."
            ),
            QuizQuestion(
                id = "q-deret-2",
                prompt = "Berapakah jumlah deret geometri tak hingga dengan suku pertama a = 12 dan rasio r = 1/3?",
                type = "numeric",
                correctAnswer = "18",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Gunakan rumus deret tak hingga: S_∞ = a / (1 - r).",
                    "a = 12, r = 1/3.",
                    "1 - r = 1 - 1/3 = 2/3.",
                    "12 ÷ (2/3) = 12 × (3/2) = ...?"
                ),
                explanation = "S_∞ = a / (1 - r) = 12 / (1 - 1/3) = 12 / (2/3) = 12 × 3/2 = 18.",
                misconception = "Membagi a dengan r alih-alih dengan (1 - r)."
            )
        )
    )

    // =========================================================================
    // 4. LESSON: TRIGONOMETRI ANALITIK & SUDUT BERELASI
    // =========================================================================
    private val trigonometriLanjutLesson = LessonData(
        conceptId = "mat-trigonometri-lanjut",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "ptr-l1",
                panelNumber = 1,
                title = "Empat Kuadran Lingkaran Satuan",
                caption = "Kakek menggambar lingkaran berjari-jari r = 1 yang berpusat di titik (0, 0) pada bidang Kartesius.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Trigonometri tidak hanya terbatas pada segitiga siku-siku di bawah 90 derajat! Dengan Lingkaran Satuan, sudut bisa berputar hingga 360 derajat melintasi 4 kuadran!",
                sceneVisualEmoji = "🧭",
                sceneDescription = "Lingkaran satuan dibagi menjadi 4 kuadran: Kuadran I, II, III, dan IV."
            ),
            StoryPanel(
                id = "ptr-l2",
                panelNumber = 2,
                title = "Jembatan Keledai Tanda Kuadran",
                caption = "Kirana mencatat tanda positif trigonometri di setiap kuadran.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Hafalan mudahnya: 'Semua Sindikat Tangan Kosong'! Kuadran I (Semua positif), Kuadran II (Sinus positif), Kuadran III (Tangen positif), Kuadran IV (Cosinus positif)!",
                sceneVisualEmoji = "✨",
                sceneDescription = "Diagram 4 kuadran dengan label ASTC (All, Sin, Tan, Cos) bertanda positif."
            ),
            StoryPanel(
                id = "ptr-l3",
                panelNumber = 3,
                title = "Aturan Sinus & Kosinus Segitiga Sembarang",
                caption = "Dimas mengukur tanah kebun berbentuk segitiga sembarang tanpa ada sudut siku-sikunya sama sekali.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika segitiga tidak punya sudut 90°, kita gunakan Aturan Sinus [a / sin A = b / sin B = c / sin C] atau Aturan Kosinus [c² = a² + b² - 2ab cos C]! Teorema Pythagoras adalah kasus khusus aturan kosinus saat sudutnya 90°!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Segitiga sembarang dengan sudut A, B, C dan sisi a, b, c."
            ),
            StoryPanel(
                id = "ptr-l4",
                panelNumber = 4,
                title = "Identitas Sudut Rangkap Gelombang",
                caption = "Kirana melihat osilasi gelombang arus bolak-balik PLN.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Rumus sudut rangkap sin(2x) = 2 sin x cos x dan cos(2x) = cos²x - sin²x adalah kunci modulasi frekuensi radio dan transmisi sinyal listrik AC!",
                sceneVisualEmoji = "〰️",
                sceneDescription = "Grafik gelombang sinusoidal sinus dan cosinus saling berosilasi harmonis."
            )
        ),
        intuitionTitle = "Lingkaran Satuan: Perluasan Trigonometri ke Segala Arah",
        intuitionBody = "Trigonometri analitik memperluas perbandingan sudut dari segitiga siku-siku ke seluruh sudut lingkaran 360°.\n\n" +
                "1. Tanda Fungsi pada Lingkaran Satuan:\n" +
                "   • Kuadran I (0°–90°): Semua positif (sin, cos, tan > 0).\n" +
                "   • Kuadran II (90°–180°): Hanya Sinus positif (sin(180°-θ) = sin θ ; cos(180°-θ) = -cos θ).\n" +
                "   • Kuadran III (180°–270°): Hanya Tangen positif (tan(180°+θ) = tan θ).\n" +
                "   • Kuadran IV (270°–360°): Hanya Cosinus positif (cos(360°-θ) = cos θ).\n\n" +
                "2. Aturan Segitiga Sembarang:\n" +
                "   • Aturan Sinus: a / sin A = b / sin B = c / sin C = 2R (dipakai jika diketahui 1 sisi dan 2 sudut, atau 2 sisi dan 1 sudut hadap).\n" +
                "   • Aturan Kosinus: c² = a² + b² - 2ab cos C (dipakai jika diketahui 2 sisi dan sudut apit, atau diketahui ketiga sisinya).\n\n" +
                "3. Identitas Trigonometri Pokok:\n" +
                "   • sin²x + cos²x = 1\n" +
                "   • sin(2x) = 2 sin x cos x\n" +
                "   • cos(2x) = cos²x - sin²x = 2cos²x - 1 = 1 - 2sin²x\n" +
                "   • Luas Segitiga Sembarang: L = 1/2 × a × b × sin C.",
        intuitionPoints = listOf(
            "Nilai fungsi sinus dan cosinus selalu berada dalam rentang -1 ≤ sin x ≤ 1 dan -1 ≤ cos x ≤ 1.",
            "Periode gelombang f(x) = sin x dan cos x adalah 360° (2π radian), sedangkan tan x berulang setiap 180° (π radian).",
            "Aturan kosinus adalah generalisasi sempurna Teorema Pythagoras: saat sudut C = 90°, cos 90° = 0 sehingga rumus kembali menjadi c² = a² + b²."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Aturan Sinus \\& Kosinus}",
                equation = "\\frac{a}{\\sin A} = \\frac{b}{\\sin B} = \\frac{c}{\\sin C} \\quad , \\quad c^2 = a^2 + b^2 - 2ab\\cos C",
                meaning = "Hukum sinus dan kosinus untuk menyelesaikan sisi dan sudut segitiga sembarang.",
                units = "Relasi geometri",
                applicationNote = "Dipakai dalam pemetaan navigasi maritim dan survei tanah."
            ),
            FormulaCard(
                symbol = "\\sin(2x) \\& \\cos(2x)",
                equation = "\\sin(2x) = 2\\sin x\\cos x \\quad , \\quad \\cos(2x) = \\cos^2 x - \\sin^2 x",
                meaning = "Rumus sudut rangkap ganda trigonometri analitik.",
                units = "Identitas analitik",
                applicationNote = "Digunakan untuk penyederhanaan integral kalkulus dan sinyal gelombang radio."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sistem Navigasi Radar Kapal Patroli Bakamla di Laut Natuna Utara",
            context = "Kapal patroli Badan Keamanan Laut (Bakamla) mendeteksi koordinat kapal nelayan asing di perairan Laut Natuna Utara.",
            engineeringProblem = "Dua pos radar pantai terpisah sejauh c = 40 km mendeteksi posisi kapal yang sama dengan sudut elevasi bantalan A = 45° dan B = 60°. Berapakah jarak kapal ke masing-masing stasiun radar?",
            physicalConceptUsed = "Triangulasi radio navigasi menggunakan Aturan Sinus segitiga sembarang.",
            mathematicalModel = "Sudut ketiga C = 180° - (45° + 60°) = 75°. Jarak kapal ke pos A dihitung: b = (c × sin B) / sin C = (40 × sin 60°) / sin 75° ≈ 35,8 km.",
            realWorldImpact = "Memandu kapal patroli mencegat kapal pelanggar kedaulatan laut secara presisi menghemat bahan bakar dan menjaga wilayah teritorial NKRI.",
            relatedCareers = listOf("Perwira Navigasi Bahari", "Insinyur Sistem Radar Maritim", "Spesialis Telekomunikasi Militer"),
            verifiedSource = "Badan Keamanan Laut (Bakamla) RI / Peta Hidro-Oseanografi TNI AL."
        ),
        homeLab = HomeLabData(
            title = "Menguji Luas Segitiga Sembarang Menggunakan Busur & Rumus Sinus",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("1 lembar kertas", "Penggaris panjang", "Busur derajat plastik", "Kalkulator scientific"),
            steps = listOf(
                "Langkah 1: Gambar segitiga sembarang miring acak di atas kertas (jangan buat siku-siku).",
                "Langkah 2: Ukur panjang dua sisi yang berdekatan: a (misal 8 cm) dan b (misal 10 cm).",
                "Langkah 3: Ukur sudut apit di antara kedua sisi tersebut dengan busur derajat (misal sudut C = 30°).",
                "Langkah 4: Hitung luas segitiga menggunakan rumus: Luas = 1/2 × a × b × sin C = 1/2 × 8 × 10 × sin 30° = 40 × 0,5 = 20 cm².",
                "Langkah 5: Buktikan dengan mengukur tinggi tegak manual t = b × sin C dan menghitung 1/2 × a × t: hasilnya tepat sama!"
            ),
            observationGoal = "Membuktikan rumus luas segitiga sembarang tanpa perlu repot mencari garis tinggi tegaknya.",
            connectionToSimulation = "Bandingkan sudut segitigamu dengan simulator trigonometri lingkaran satuan!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-trig-l1",
                prompt = "Berapakah nilai dari sin 150°?",
                type = "numeric",
                correctAnswer = "0.5",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "Sudut 150° berada di Kuadran II (nilai sinus positif).",
                    "Gunakan rumus relasi Kuadran II: sin(180° - θ) = sin θ.",
                    "sin 150° = sin(180° - 30°) = sin 30° = ...?"
                ),
                explanation = "sin 150° = sin(180° - 30°) = sin 30° = 1/2 = 0,5.",
                misconception = "Memberikan tanda negatif karena mengira sudut tumpul selalu bernilai negatif."
            ),
            QuizQuestion(
                id = "q-trig-l2",
                prompt = "Pada segitiga ABC, panjang sisi a = 6 cm, b = 10 cm, dan sudut apit C = 60°. Berapakah luas segitiga tersebut? (sin 60° = 1/2 √3 ≈ 0,866)",
                type = "numeric",
                correctAnswer = "25.98",
                tolerance = 0.5f,
                unit = "cm²",
                hints = listOf(
                    "Rumus luas = 1/2 × a × b × sin C.",
                    "Luas = 1/2 × 6 × 10 × sin 60°.",
                    "Luas = 30 × (1/2 √3) = 15√3 ≈ 15 × 1,732 = ...?"
                ),
                explanation = "Luas = 1/2 × 6 × 10 × sin 60° = 30 × (1/2 √3) = 15√3 ≈ 25,98 cm².",
                misconception = "Lupa mengalikan dengan 1/2."
            )
        )
    )

    // =========================================================================
    // 5. LESSON: POLINOMIAL & TEOREMA SISA
    // =========================================================================
    private val polinomialLesson = LessonData(
        conceptId = "mat-polinomial",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "ppol1",
                panelNumber = 1,
                title = "Suku Banyak Berderajat Tinggi",
                caption = "Dimas memperhatikan persamaan matematika berderajat tinggi di buku aljabar: P(x) = 2x³ - 5x² + 4x - 7.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kakek, jika persamaan kuadrat pangkatnya cuma 2, bagaimana cara membagi dan mencari akar persamaan yang pangkatnya 3, 4, atau lebih?",
                sceneVisualEmoji = "📜",
                sceneDescription = "Persamaan suku banyak polinomial berderajat tiga."
            ),
            StoryPanel(
                id = "ppol2",
                panelNumber = 2,
                title = "Skema Horner yang Lincah",
                caption = "Kakek menggambar bagan perkalian dan penjumlahan bersusun yang disebut Metode Horner.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Daripada membagi bersusun panjang yang melelahkan, ahli matematika William Horner membuat skema sintetis Horner! Cukup tuliskan koefisiennya, lalu kalikan dan jumlahkan ke bawah secara berantai!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Skema pembagian sintetis Horner baris demi baris yang efisien."
            ),
            StoryPanel(
                id = "ppol3",
                panelNumber = 3,
                title = "Teorema Sisa: Menembus Tanpa Membagi",
                caption = "Kirana menemukan rahasia Teorema Sisa.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jika polinomial P(x) dibagi oleh (x - k), maka SISA pembagiannya langsung sama dengan nilai fungsi P(k)! Kita tidak perlu membagi habis sampai bawah!",
                sceneVisualEmoji = "🎯",
                sceneDescription = "Teorema Sisa memperlihatkan Sisa = P(k) secara instan."
            ),
            StoryPanel(
                id = "ppol4",
                panelNumber = 4,
                title = "Teorema Faktor: Membuka Kunci Akar",
                caption = "Dimas mengangguk paham saat sisa pembagian bernilai nol.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Dan jika sisa P(k) = 0, artinya (x - k) adalah FAKTOR bulat dari polinomial itu, dan k adalah salah satu akar persamaan!",
                sceneVisualEmoji = "🗝️",
                sceneDescription = "Kunci membuka faktor-faktor suku banyak polinomial."
            )
        ),
        intuitionTitle = "Dunia Suku Banyak: Algoritma Pembagian & Teorema Sisa",
        intuitionBody = "Polinomial (suku banyak) adalah bentuk aljabar yang memuat variabel berpangkat bilangan bulat non-negatif: P(x) = aₙxⁿ + aₙ₋₁xⁿ⁻¹ + ... + a₁x + a₀.\n\n" +
                "1. Algoritma Pembagian Polinomial:\n" +
                "   P(x) = Q(x) · H(x) + S(x)\n" +
                "   (Yang Dibagi = Pembagi × Hasil Bagi + Sisa Pembagian).\n" +
                "   Derajat sisa pembagian S(x) selalu lebih kecil dari derajat pembagi Q(x).\n\n" +
                "2. Teorema Sisa (Remainder Theorem):\n" +
                "   • Jika P(x) dibagi oleh (x - k), maka Sisanya adalah S = P(k).\n" +
                "   • Jika P(x) dibagi oleh (ax - b), maka Sisanya adalah S = P(b/a).\n\n" +
                "3. Teorema Faktor (Factor Theorem):\n" +
                "   (x - k) merupakan faktor dari P(x) JIKA DAN HANYA JIKA P(k) = 0 (sisa pembagian bernilai nol).",
        intuitionPoints = listOf(
            "Skema Horner jauh lebih cepat dan minim risiko kesalahan tanda dibanding pembagian bersusun panjang biasa.",
            "Jumlah akar-akar polinomial berderajat n mengikuti Teorema Vieta: x₁ + x₂ + ... + xₙ = -aₙ₋₁ / aₙ.",
            "Polinomial derajat n memiliki paling banyak n akar penyelesaian real."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "S = P(k)",
                equation = "P(x) = (x - k) \\cdot H(x) + P(k)",
                meaning = "Teorema Sisa: sisa pembagian suku banyak P(x) oleh (x - k) sama dengan nilai P(k).",
                units = "Nilai skalar sisa",
                applicationNote = "Sisa pembagian x³ - 2x + 5 oleh (x - 2) adalah P(2) = 2³ - 2(2) + 5 = 8 - 4 + 5 = 9."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Koreksi Galat Kode Reed-Solomon Barcode QR Code & Siaran TV Digital DVB-T2",
            context = "Siaran TV digital nasional dan pemindaian QRIS menggunakan algoritma koreksi kesalahan berbasis suku banyak polinomial Galois Field.",
            engineeringProblem = "Bagaimana QR Code yang kotor tergores atau sinyal antena TV yang terganggu hujan tetap bisa terbaca sempurna tanpa cacat gambar?",
            physicalConceptUsed = "Kode Polinomial Reed-Solomon (pembagian polinomial suku banyak berderajat 8 hingga 32).",
            mathematicalModel = "Data biner dienkode sebagai koefisien suku banyak P(x). Sisa pembagian polinomial oleh generator G(x) disematkan sebagai bit paritas koreksi galat.",
            realWorldImpact = "Memungkinkan stiker QRIS UMKM yang robek hingga 30% tetap terbaca mulus oleh kamera smartphone dan menjamin siaran TV digital nasional jernih tanpa semut.",
            relatedCareers = listOf("Insinyur Teori Informasi & Pengkodean", "Spesialis Kriptografi Digital", "Pengembang Protokol Nirkabel 5G"),
            verifiedSource = "Standar QR Code ISO/IEC 18004 & Balai Monitoring Frekuensi Kominfo RI."
        ),
        homeLab = HomeLabData(
            title = "Membuktikan Teorema Sisa Horner Menggunakan Kertas Berpetak",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("Kertas bergaris dan pulpen"),
            steps = listOf(
                "Langkah 1: Tulis suku banyak P(x) = x³ - 4x² + 2x + 7.",
                "Langkah 2: Kita ingin mencari sisa jika dibagi (x - 3). Berarti k = 3.",
                "Langkah 3: Hitung dengan substitusi biasa: P(3) = 3³ - 4(3²) + 2(3) + 7 = 27 - 36 + 6 + 7 = 4.",
                "Langkah 4: Sekarang buat bagan Horner: tulis baris koefisien [1, -4, 2, 7] dan taruh angka 3 di kiri.",
                "Langkah 5: Turunkan 1. Kalikan 3 jadi 3, jumlahkan dengan -4 jadi -1. Kalikan 3 jadi -3, jumlahkan dengan 2 jadi -1. Kalikan 3 jadi -3, jumlahkan dengan 7 jadi 4!",
                "Langkah 6: Cocokkan: kedua cara menghasilkan angka 4 yang sama persis dalam waktu 10 detik!"
            ),
            observationGoal = "Membuktikan kecepatan dan keakuratan skema Horner dibandingkan substitusi rumus biasa.",
            connectionToSimulation = "Bandingkan bagan Hornermu dengan kalkulator polinomial interaktif!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-pol-1",
                prompt = "Berapakah sisa pembagian dari suku banyak P(x) = 2x³ - 3x² + x - 5 jika dibagi oleh (x - 2)?",
                type = "numeric",
                correctAnswer = "1",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Gunakan Teorema Sisa: Sisa = P(2).",
                    "P(2) = 2(2³) - 3(2²) + 2 - 5.",
                    "P(2) = 2(8) - 3(4) + 2 - 5 = 16 - 12 + 2 - 5 = ...?"
                ),
                explanation = "Menurut Teorema Sisa, sisa pembagian oleh (x - 2) adalah P(2) = 2(8) - 3(4) + 2 - 5 = 16 - 12 + 2 - 5 = 1.",
                misconception = "Memasukkan nilai -2 alih-alih +2."
            )
        )
    )

    // =========================================================================
    // 6. LESSON: MATRIKS, DETERMINAN & INVERS
    // =========================================================================
    private val matriksLesson = LessonData(
        conceptId = "mat-matriks",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pmat1",
                panelNumber = 1,
                title = "Tabel Kotak Angka Persegi",
                caption = "Dimas mengamati susunan data stok barang gudang di layar laptop yang tersusun dalam baris dan kolom persegi.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kakek, komputer mengelompokkan ribuan data angka dalam bentuk tabel persegi berkurung siku [ ]! Ini disebut matriks kan?",
                sceneVisualEmoji = "📊",
                sceneDescription = "Susunan bilangan persegi panjang dalam kurung siku membentuk matriks."
            ),
            StoryPanel(
                id = "pmat2",
                panelNumber = 2,
                title = "Aturan Perkalian Baris Kali Kolom",
                caption = "Kakek memperagakan cara mengalikan dua buah matriks.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Perkalian matriks punya aturan unik: Baris dikalikan Kolom! Baris matriks pertama meluncur mendatar, kolom matriks kedua meluncur menurun, lalu hasilnya dijumlahkan!",
                sceneVisualEmoji = "✖️",
                sceneDescription = "Visualisasi perkalian baris matriks A dengan kolom matriks B."
            ),
            StoryPanel(
                id = "pmat3",
                panelNumber = 3,
                title = "Determinan: Skalar Karakteristik Matriks",
                caption = "Kirana menghitung perkalian silang diagonal matriks 2x2.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Untuk matriks 2x2 [a b ; c d], Determinannya adalah perkalian diagonal utama dikurang diagonal samping: det = ad - bc! Determinan menyatakan faktor perubahan luas bidang!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Perkalian silang ad - bc menghitung determinan matriks 2x2."
            ),
            StoryPanel(
                id = "pmat4",
                panelNumber = 4,
                title = "Invers Matriks & Dekripsi Kode Rahasia",
                caption = "Dimas memecahkan pesan rahasia terenkripsi menggunakan invers matriks A⁻¹.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika matriks A mengunci pesan rahasia, maka Invers Matriks A⁻¹ adalah kunci pembukanya! A × A⁻¹ = I (Matriks Identitas)! Pesan rahasia kembali terbaca jelas!",
                sceneVisualEmoji = "🔐",
                sceneDescription = "Matriks invers membuka sandi enkripsi menjadi teks asli yang dapat dibaca."
            )
        ),
        intuitionTitle = "Aljabar Linear Matriks: Bahasa Pengolah Citra & Grafika Komputer",
        intuitionBody = "Matriks adalah susunan skalar bilangan yang diatur dalam baris horizontal dan kolom vertikal berbentuk persegi panjang berordo m × n.\n\n" +
                "1. Operasi Aljabar Matriks:\n" +
                "   • Penjumlahan & Pengurangan: Hanya bisa dilakukan jika kedua matriks memiliki ORDO YANG PERSIS SAMA (elemen seletak dijumlahkan/dikurangkan).\n" +
                "   • Perkalian Skalar: Setiap elemen dikalikan dengan konstanta k.\n" +
                "   • Perkalian Dua Matriks (A × B): Syaratnya jumlah KOLOM matriks A harus SAMA DENGAN jumlah BARIS matriks B. Berlaku sifat TIDAK KOMUTATIF (A × B ≠ B × A).\n\n" +
                "2. Determinan Matriks 2×2:\n" +
                "   Untuk A = [a b ; c d] ⟹ det(A) = |A| = ad - bc.\n" +
                "   Jika det(A) = 0, matriks disebut Matriks Singular (tidak memiliki invers).\n\n" +
                "3. Invers Matriks 2×2 (A⁻¹):\n" +
                "   A⁻¹ = 1 / (ad - bc) × [d -b ; -c a]   (dengan syarat ad - bc ≠ 0).\n" +
                "   Sifat: A × A⁻¹ = A⁻¹ × A = I (Matriks Identitas).",
        intuitionPoints = listOf(
            "Perkalian matriks pada umumnya TIDAK komutatif: A × B tidak sama dengan B × A.",
            "Matriks identitas I = [1 0 ; 0 1] bertindak seperti angka 1 dalam perkalian biasa: A × I = A.",
            "Sistem Persamaan Linear ax + by = p dan cx + dy = q dapat diselesaikan elegan dengan X = A⁻¹ × B."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "A^{-1}",
                equation = "A^{-1} = \\frac{1}{ad - bc} \\begin{pmatrix} d & -b \\\\ -c & a \\end{pmatrix} \\quad (ad - bc \\ne 0)",
                meaning = "Rumus invers matriks ordo 2x2 berbanding terbalik dengan determinannya.",
                units = "Matriks invers",
                applicationNote = "Tukar posisi diagonal utama (a dan d), beri tanda minus pada diagonal samping (-b dan -c)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Enkripsi Kriptografi Kripto Hill Cipher Bank Indonesia",
            context = "Layanan BI-FAST Bank Indonesia mentransfer miliaran rupiah antar-bank setiap detik dengan enkripsi berlapis.",
            engineeringProblem = "Bagaimana mengacak karakter nomor rekening nasabah dan PIN menjadi ciphertext acak yang tidak bisa dibobol hacker di jaringan internet?",
            physicalConceptUsed = "Kriptografi Hill Cipher berbasis perkalian matriks modular aritmetika modulo 26.",
            mathematicalModel = "Pesan teks diubah menjadi vektor P. Enkripsi: C = (K × P) mod 26. Bank penerima mendekripsi pesan dengan matriks invers kunci: P = (K⁻¹ × C) mod 26.",
            realWorldImpact = "Mengamankan transaksi sistem keuangan nasional senilai ribuan triliun rupiah per tahun dari ancaman serangan cybercrime.",
            relatedCareers = listOf("Cryptographer Ahli Keamanan Informasi", "Cyber Security Engineer FinTech", "Data Encryption Specialist"),
            verifiedSource = "Pusat Riset Siber Bank Indonesia & Standar Enkripsi NIST."
        ),
        homeLab = HomeLabData(
            title = "Membuat Pesan Rahasia Sandi Kriptografi Matriks 2x2",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("Kertas catatan dan pulpen", "Tabel alfabet angka A=1, B=2, C=3, ... Z=26"),
            steps = listOf(
                "Langkah 1: Tulis kata rahasia 4 huruf, misal 'K O P I'. Ganti huruf jadi angka: K=11, O=15, P=16, I=9.",
                "Langkah 2: Susun jadi matriks 2x2: P = [11 15 ; 16 9].",
                "Langkah 3: Buat matriks kunci pengacak rahasiamu, misal K = [2 1 ; 1 1]. (det K = 2(1) - 1(1) = 1).",
                "Langkah 4: Kalikan K × P untuk mengenkripsi: hasilnya adalah kode acak yang tidak bisa dibaca orang lain!",
                "Langkah 5: Cari invers K⁻¹ = [1 -1 ; -1 2], lalu kalikan kembali ke kode acak: taraaa, kata 'KOPI' muncul kembali!"
            ),
            observationGoal = "Mempraktikkan langsung peran perkalian matriks dan inversnya dalam teknologi sandi rahasia.",
            connectionToSimulation = "Bandingkan perkalian matriksmu dengan simulator aljabar linear!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mat-1",
                prompt = "Berapakah determinan dari matriks A = [4  2 ; 3  5]?",
                type = "numeric",
                correctAnswer = "14",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Gunakan rumus determinan matriks 2x2: det(A) = ad - bc.",
                    "a = 4, b = 2, c = 3, d = 5.",
                    "det(A) = (4 × 5) - (2 × 3) = 20 - 6 = ...?"
                ),
                explanation = "det(A) = ad - bc = (4 × 5) - (2 × 3) = 20 - 6 = 14.",
                misconception = "Menjumlahkan alih-alih mengurangkan diagonal samping."
            )
        )
    )

    // =========================================================================
    // 7. LESSON: VEKTOR GEOMETRIS & ALJABAR (2D & 3D)
    // =========================================================================
    private val vektorLesson = LessonData(
        conceptId = "mat-vektor",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pvek1",
                panelNumber = 1,
                title = "Pesawat Terbang Ditiup Angin Silang",
                caption = "Pesawat Garuda Indonesia hendak mendarat di Bandara Soekarno-Hatta. Angin kencang bertiup dari samping kiri badan pesawat.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Pesawat melaju ke depan 200 km/jam, tapi angin mendorong dari samping 50 km/jam! Pesawat bergeser miring melintasi landasan!",
                sceneVisualEmoji = "✈️",
                sceneDescription = "Pesawat terbang mengalami resultan arah gerak akibat dorongan angin silang."
            ),
            StoryPanel(
                id = "pvek2",
                panelNumber = 2,
                title = "Vektor: Punya Nilai & Punya Arah",
                caption = "Kakek menggambar anak panah berarah di atas peta navigasi penerbangan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Besaran fisika ada dua jenis: Skalar (hanya punya nilai, seperti suhu atau massa) dan VEKTOR (punya nilai BESAR dan punya ARAH panah, seperti kecepatan dan gaya)!",
                sceneVisualEmoji = "🏹",
                sceneDescription = "Anak panah vektor dengan titik pangkal, panjang magnitudo, dan arah mata panah."
            ),
            StoryPanel(
                id = "pvek3",
                panelNumber = 3,
                title = "Penjumlahan Vektor Metode Jajar Genjang",
                caption = "Kirana menggambar resultan dua panah kecepatan menggunakan metode jajar genjang.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Panah kecepatan pesawat digabung dengan panah angin menggunakan aturan jajar genjang. Garis diagonalnya adalah Vektor Resultan (R) gerak sesungguhnya!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Resultan vektor dibentuk melalui diagonal jajar genjang dua panah komponen."
            ),
            StoryPanel(
                id = "pvek4",
                panelNumber = 4,
                title = "Perkalian Titik (Dot Product)",
                caption = "Dimas menghitung usaha gaya dengan perkalian skalar dot product.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Perkalian titik dua vektor u · v = |u| |v| cos θ! Jika dua vektor saling tegak lurus membentuk sudut 90°, hasil dot product-nya SELALU NOL karena cos 90° = 0!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Dua vektor tegak lurus ortogonal memiliki hasil perkalian dot product nol."
            )
        ),
        intuitionTitle = "Anak Panah Ruang: Magnitudo, Komponen & Dot Product",
        intuitionBody = "Vektor adalah besaran matematika yang memiliki panjang (magnitudo) dan arah pada ruang 2D maupun 3D.\n\n" +
                "1. Notasi & Komponen Vektor:\n" +
                "   • Vektor 2D: v = [v_x, v_y] = v_x i + v_y j.\n" +
                "   • Vektor 3D: v = [v_x, v_y, v_z] = v_x i + v_y j + v_z k.\n" +
                "   • Panjang (Panjang/Magnitudo Vektor): |v| = √(v_x² + v_y² + v_z²).\n\n" +
                "2. Perkalian Titik (Dot Product / Perkalian Skalar):\n" +
                "   • Bentuk Aljabar: u · v = (u_x · v_x) + (u_y · v_y) + (u_z · v_z).\n" +
                "   • Bentuk Geometri: u · v = |u| · |v| · cos θ.\n" +
                "   • Menentukan Sudut Antar-Vektor: cos θ = (u · v) / (|u| · |v|).\n\n" +
                "3. Dua Vektor Saling Ortogonal (Tegak Lurus):\n" +
                "   Dua vektor saling tegak lurus (θ = 90°) JIKA DAN HANYA JIKA u · v = 0.",
        intuitionPoints = listOf(
            "Vektor satuan adalah vektor yang panjang magnitudonya tepat sama dengan 1: u_topi = v / |v|.",
            "Perkalian dot product menghasilkan bilangan skalar biasa, BUKAN vektor.",
            "Usaha fisika W = F · s adalah perkalian dot product antara vektor gaya F dan vektor perpindahan s."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "\\mathbf{u} \\cdot \\mathbf{v}",
                equation = "\\mathbf{u} \\cdot \\mathbf{v} = u_x v_x + u_y v_y + u_z v_z = |\\mathbf{u}||\\mathbf{v}|\\cos\\theta",
                meaning = "Perkalian skalar (dot product) dua vektor dan penentuan sudut apit θ.",
                units = "Bilangan skalar",
                applicationNote = "Jika dot product bernilai nol (u · v = 0), kedua vektor saling tegak lurus 90°."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Koreksi Vektor Angin Silang (Crosswind Landing) Bandara Internasional Ngurah Rai Bali",
            context = "Landasan pacu Bandara Ngurah Rai menjorok ke Samudra Hindia yang kerap dilanda angin silang monsun barat daya berkecepatan 30 knot.",
            engineeringProblem = "Pesawat komersial Airbus A330 yang mendarat lurus akan terhempas keluar tepi landasan jika tidak mengoreksi vektor drift angin.",
            physicalConceptUsed = "Penjumlahan vektor kecepatan pesawat (v_air) dan vektor kecepatan angin (v_wind) menghasilkan vektor lintasan darat (v_ground).",
            mathematicalModel = "Pilot menggunakan teknik Crab Landing: hidung pesawat dibelokkan menyudut sebesar sudut drift θ = arcsin(v_crosswind / v_air) sehingga resultan vektor tanah tetap sejajar tepat dengan garis tengah landasan pacu.",
            realWorldImpact = "Menjamin pendaratan mulus jutaan wisatawan mancanegara setiap tahun di Pulau Dewata dengan tingkat keselamatan 100%.",
            relatedCareers = listOf("Pilot Maskapai Penerbangan", "Air Traffic Controller (ATC) AirNav", "Insinyur Sistem Avionik Pesawat"),
            verifiedSource = "AirNav Indonesia & Panduan Operasional Penerbangan ICAO."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Perahu Menyeberangi Arus Sungai di Atas Kertas",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("Kertas milimeter/berpetak", "Penggaris dan busur derajat", "Pulpen 2 warna berbeda"),
            steps = listOf(
                "Langkah 1: Gambar garis tepi sungai selebar 12 cm mendatar di kertas.",
                "Langkah 2: Gambar panah vektor kecepatan perahu menyeberang tegak lurus ke utara sepanjang 8 cm (v_perahu = 8 cm).",
                "Langkah 3: Dari ujung panah perahu, sambungkan panah vektor arus air ke timur sepanjang 6 cm (v_arus = 6 cm).",
                "Langkah 4: Tarik garis lurus dari pangkal awal perahu ke ujung panah arus (Vektor Resultan R).",
                "Langkah 5: Ukur panjang R dengan penggaris: tepat 10 cm! (Karena √(8² + 6²) = √100 = 10 cm)!"
            ),
            observationGoal = "Membuktikan penjumlahan vektor secara grafis geometri dan aljabar Pythagoras.",
            connectionToSimulation = "Bandingkan vektor perahu dengan simulator vektor gaya interaktif!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-vek-1",
                prompt = "Diberikan dua vektor 2D: u = [3, 4] dan v = [2, -1]. Berapakah nilai perkalian titik (dot product) u · v?",
                type = "numeric",
                correctAnswer = "2",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Gunakan rumus dot product: u · v = (u_x × v_x) + (u_y × v_y).",
                    "u_x × v_x = 3 × 2 = 6.",
                    "u_y × v_y = 4 × (-1) = -4.",
                    "Hitung 6 + (-4) = ...?"
                ),
                explanation = "u · v = (3 × 2) + (4 × -1) = 6 - 4 = 2.",
                misconception = "Mengalikan silang atau menjumlahkan komponen yang tidak seletak."
            )
        )
    )

    // =========================================================================
    // 8. LESSON: GEOMETRI ANALITIK & IRISAN KERUCUT
    // =========================================================================
    private val geometriAnalitikLesson = LessonData(
        conceptId = "mat-geometri-analitik",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pga1",
                panelNumber = 1,
                title = "Antena Parabola Pemancar Satelit",
                caption = "Di stasiun bumi satelit Palapa Indosat Jatiluhur, Dimas mengamati piringan antena parabola raksasa berdiameter 30 meter.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kakek, piringan antena ini bentuknya cekung melengkung. Di depannya ada tanduk penerima sinyal tepat di satu titik melayang!",
                sceneVisualEmoji = "📡",
                sceneDescription = "Antena parabola stasiun bumi pemancar sinyal satelit antariksa."
            ),
            StoryPanel(
                id = "pga2",
                panelNumber = 2,
                title = "Titik Api Fokus: Rahasia Irisan Kerucut",
                caption = "Kakek menjelaskan sifat refleksi fokus kurva irisan kerucut.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Titik melayang itu adalah Titik Fokus (F)! Sifat optik kurva parabola: semua gelombang radio sejajar dari satelit yang menabrak piringan parabola akan DIPANTULKAN SEMPURNA memusat ke satu titik fokus tersebut!",
                sceneVisualEmoji = "💡",
                sceneDescription = "Sinar gelombang sejajar memantul dan terkonsentrasi di titik fokus parabola."
            ),
            StoryPanel(
                id = "pga3",
                panelNumber = 3,
                title = "Empat Saudara Irisan Kerucut",
                caption = "Kirana menggambar sebuah kerucut es krim ganda yang diiris oleh bidang datar di berbagai sudut kemiringan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jika kerucut diiris mendatar menghasilkan Lingkaran, diiris miring menghasilkan Elips (orbit planet), diiris sejajar selimut menghasilkan Parabola, dan diiris tegak menghasilkan Hiperbola!",
                sceneVisualEmoji = "🍦",
                sceneDescription = "Irisan geometri kerucut menghasilkan lingkaran, elips, parabola, dan hiperbola."
            ),
            StoryPanel(
                id = "pga4",
                panelNumber = 4,
                title = "Persamaan Lingkaran Pusat (a, b)",
                caption = "Dimas menuliskan persamaan lingkaran di bidang koordinat Kartesius.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Lingkaran berpusat di (a, b) dengan jari-jari r dirumuskan: (x - a)² + (y - b)² = r²! Diturunkan langsung dari Teorema Pythagoras jarak titik ke pusat!",
                sceneVisualEmoji = "⭕",
                sceneDescription = "Kurva lingkaran dengan titik pusat (a, b) dan garis jari-jari r."
            )
        ),
        intuitionTitle = "Keluarga Irisan Kerucut: Lingkaran, Elips, Parabola & Hiperbola",
        intuitionBody = "Irisan kerucut (conic sections) adalah kurva yang terbentuk dari perpotongan sebuah kerucut lingkaran tegak dengan suatu bidang datar.\n\n" +
                "1. Persamaan Lingkaran:\n" +
                "   • Pusat di O(0, 0), jari-jari r: x² + y² = r².\n" +
                "   • Pusat di (a, b), jari-jari r: (x - a)² + (y - b)² = r².\n" +
                "   • Bentuk Umum: x² + y² + Ax + By + C = 0, dengan Pusat (-A/2, -B/2) dan r = √[(A/2)² + (B/2)² - C].\n\n" +
                "2. Kurva Parabola Fokus (p, 0):\n" +
                "   y² = 4px (p = jarak dari puncak ke titik fokus).\n\n" +
                "3. Kurva Elips (Orbit Planet):\n" +
                "   x² / a² + y² / b² = 1 (dengan sumbu mayor a dan sumbu minor b).\n\n" +
                "4. Garis Singgung Lingkaran:\n" +
                "   Garis singgung lingkaran x² + y² = r² di titik (x₁, y₁) dirumuskan: x₁x + y₁y = r².",
        intuitionPoints = listOf(
            "Lingkaran adalah bentuk khusus dari elips di mana kedua titik fokusnya berimpit menjadi satu di titik pusat (a = b).",
            "Hukum I Kepler membuktikan bahwa semua planet di tata surya mengitari matahari pada lintasan elips dengan matahari berada di salah satu titik fokusnya.",
            "Lampu sorot mobil dan senter menggunakan cermin parabola agar cahaya lampu bohlam di titik fokus dipancarkan keluar menjadi berkas sinar lurus sejajar."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "(x-a)^2 + (y-b)^2 = r^2",
                equation = "(x - a)^2 + (y - b)^2 = r^2",
                meaning = "Persamaan kanonik lingkaran dengan titik pusat (a, b) dan jari-jari r.",
                units = "Persamaan geometri analitik",
                applicationNote = "Lingkaran pusat (2, -3) jari-jari 5: (x - 2)² + (y + 3)² = 25."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Jangkauan Sinyal Seluler BTS Telkomsel 4G/5G Berbentuk Lingkaran",
            context = "PT Telkomsel menempatkan Base Transceiver Station (BTS) menara telekomunikasi untuk menjangkau pengguna smartphone di wilayah pedesaan.",
            engineeringProblem = "Menara BTS berlokasi di koordinat (4, 3) pada peta digital dengan daya pancar radio menjangkau radius 5 km. Apakah pengguna di koordinat (7, 7) masih menerima sinyal 4G?",
            physicalConceptUsed = "Persamaan lingkaran jangkauan radiasi gelombang radio (x - a)² + (y - b)² ≤ r².",
            mathematicalModel = "Jarak kuadrat pengguna ke menara = (7 - 4)² + (7 - 3)² = 3² + 4² = 9 + 16 = 25. Karena nilai 25 ≤ r² (5² = 25), pengguna berada tepat di batas terluar lingkaran sinyal dan tetap terhubung!",
            realWorldImpact = "Mengoptimalkan penempatan menara BTS tanpa titik buta sinyal (blank spot) di seluruh penjuru kepulauan Indonesia.",
            relatedCareers = listOf("Radio Frequency (RF) Planning Engineer", "Network Optimization Specialist", "Arsitek Jaringan Telekomunikasi"),
            verifiedSource = "PT Telkomsel & Balai Monitor Spektrum Frekuensi Radio Kominfo."
        ),
        homeLab = HomeLabData(
            title = "Menggambar Kurva Elips Sempurna dengan 2 Paku & Seutas Benang",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf("1 lembar kardus bekas tebal", "2 paku payung / push pin", "Benang kasur 20 cm yang diikat melingkar", "Pensil"),
            steps = listOf(
                "Langkah 1: Tancapkan 2 paku payung pada kardus berjarak 8 cm (kedua paku ini adalah titik fokus F₁ dan F₂).",
                "Langkah 2: Kalungkan lingkaran benang melingkari kedua paku payung.",
                "Langkah 3: Masukkan ujung pensil ke dalam benang dan tarik kencang hingga benang membentuk segitiga tegang.",
                "Langkah 4: Gerakkan pensil mengelilingi kedua paku sambil menjaga benang tetap tegang kencang.",
                "Langkah 5: Amati: pensil akan menggambar kurva elips oval yang sempurna di atas kardus! Jumlah jarak ke dua paku selalu konstan!"
            ),
            observationGoal = "Membuktikan definisi geometris elips sebagai himpunan titik yang jumlah jaraknya ke dua titik fokus selalu konstan.",
            connectionToSimulation = "Bandingkan elips benangmu dengan simulator orbit planet elips!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-geoan-1",
                prompt = "Berapakah titik pusat dan jari-jari dari lingkaran dengan persamaan: (x - 3)² + (y + 5)² = 49?",
                type = "multiple_choice",
                options = listOf("Pusat (3, -5) dan r = 7", "Pusat (-3, 5) dan r = 7", "Pusat (3, -5) dan r = 49", "Pusat (-3, -5) dan r = 7"),
                correctAnswer = "Pusat (3, -5) dan r = 7",
                hints = listOf(
                    "Bentuk baku lingkaran: (x - a)² + (y - b)² = r².",
                    "a = 3, b = -5 (karena y - (-5) = y + 5).",
                    "r² = 49 ⟹ r = √49 = 7."
                ),
                explanation = "Pusat lingkaran adalah (a, b) = (3, -5) dan jari-jari r = √49 = 7.",
                misconception = "Salah tanda pada koordinat pusat atau lupa mengakar kuadratkan nilai r²."
            )
        )
    )

    // =========================================================================
    // 9. LESSON: FUNGSI KOMPOSISI & FUNGSI INVERS
    // =========================================================================
    private val komposisiInversLesson = LessonData(
        conceptId = "mat-komposisi-invers",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pfk-i1",
                panelNumber = 1,
                title = "Pabrik Kertas Bertingkat",
                caption = "Kirana dan Dimas mengunjungi pabrik kertas ramah lingkungan di Mojokerto Jawa Timur.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kayu gelondongan (x) dimasukkan ke Mesin 1 menghasilkan bubur pulp (m). Lalu bubur pulp dimasukkan ke Mesin 2 menghasilkan kertas jadi (y)!",
                sceneVisualEmoji = "🏭",
                sceneDescription = "Proses pabrik bertingkat: kayu gelondongan diproses dua mesin berurutan menjadi kertas."
            ),
            StoryPanel(
                id = "pfk-i2",
                panelNumber = 2,
                title = "Fungsi Komposisi: Menggabung Dua Mesin",
                caption = "Kakek menjelaskan penggabungan dua fungsi dalam matematika.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jika Mesin 1 adalah fungsi f(x) dan Mesin 2 adalah fungsi g(m), maka proses gabungannya adalah FUNGSI KOMPOSISI (g o f)(x) = g(f(x))! Hasil keluaran mesin pertama langsung menjadi masukan bagi mesin kedua!",
                sceneVisualEmoji = "⚙️",
                sceneDescription = "Diagram mesin komposisi fungsi berantai dari x menuju f(x) lalu ke g(f(x))."
            ),
            StoryPanel(
                id = "pfk-i3",
                panelNumber = 3,
                title = "Fungsi Invers: Mesin Pemutar Waktu",
                caption = "Dimas memegang segelas jus jeruk dan berandai-andai.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika fungsi f mengubah buah menjadi jus, bisakah ada fungsi pembalik f⁻¹ yang mengubah jus kembali menjadi buah utuh? Itulah FUNGSI INVERS!",
                sceneVisualEmoji = "⏪",
                sceneDescription = "Panah berbalik arah melambangkan pemetaan invers fungsi balikan."
            ),
            StoryPanel(
                id = "pfk-i4",
                panelNumber = 4,
                title = "Syarat Bijektif & Cermin Diagonal",
                caption = "Kirana menyimpulkan syarat keberadaan fungsi invers.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Fungsi invers hanya ada jika fungsinya Satu-Satu dan Pada (Bijektif)! Pada grafik, kurva f(x) dan kurva f⁻¹(x) selalu merupakan cermin simetris sempurna terhadap garis diagonal y = x!",
                sceneVisualEmoji = "🪞",
                sceneDescription = "Grafik fungsi f(x) dan inversnya f-1(x) bercermin simetris di garis y = x."
            )
        ),
        intuitionTitle = "Aljabar Pemetaan: Mesin Berantai & Pembalik Arah",
        intuitionBody = "Fungsi komposisi dan fungsi invers adalah operasi tingkat lanjut pada aljabar fungsi pemetaan.\n\n" +
                "1. Fungsi Komposisi ((f ∘ g)(x)):\n" +
                "   • (f ∘ g)(x) = f(g(x)) ⟹ Fungsi g dikerjakan terlebih dahulu, lalu hasilnya dimasukkan ke fungsi f.\n" +
                "   • Sifat: TIDAK KOMUTATIF ((f ∘ g)(x) ≠ (g ∘ f)(x)).\n" +
                "   • Asosiatif: (f ∘ (g ∘ h))(x) = ((f ∘ g) ∘ h)(x).\n\n" +
                "2. Fungsi Invers (f⁻¹(x)):\n" +
                "   • Jika f(x) = y, maka f⁻¹(y) = x.\n" +
                "   • Syarat Keberadaan Invers: Fungsi f harus bersifat BIJEKTIF (korespondensi satu-satu: setiap elemen domain punya pasangan unik di kodomain dan tidak ada elemen kawan yang menganggur).\n" +
                "   • Rumus Cepat Invers Fungsi Pecahan Linear:\n" +
                "     f(x) = (ax + b) / (cx + d)  ⟹  f⁻¹(x) = (-dx + b) / (cx - a).\n\n" +
                "3. Komposisi dengan Invers:\n" +
                "   (f ∘ f⁻¹)(x) = (f⁻¹ ∘ f)(x) = x  (menghasilkan fungsi identitas I(x) = x).",
        intuitionPoints = listOf(
            "Urutan membaca fungsi komposisi: (f ∘ g)(x) dibaca 'f bundaran g', fungsi g di kanan bekerja duluan!",
            "Invers dari fungsi kuadrat menghasilkan dua cabang akar (±√x) sehingga fungsi kuadrat harus dibatasi domainnya agar memiliki invers sah.",
            "Rumus cepat invers pecahan linear: tukar posisi a dan d, lalu ubah tandanya menjadi lawannya (-d dan -a)."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "(f \\circ g)(x)",
                equation = "(f \\circ g)(x) = f(g(x))",
                meaning = "Fungsi komposisi berantai: evaluasi g(x) terlebih dahulu lalu substitusi ke f.",
                units = "Aljabar fungsi",
                applicationNote = "Jika f(x) = 2x + 1 dan g(x) = x², maka (f ∘ g)(x) = 2(x²) + 1 = 2x² + 1."
            ),
            FormulaCard(
                symbol = "f^{-1}(x) \\text{ (Pecahan)}",
                equation = "f(x) = \\frac{ax + b}{cx + d} \\implies f^{-1}(x) = \\frac{-dx + b}{cx - a}",
                meaning = "Rumus cepat fungsi invers pecahan linear.",
                units = "Fungsi invers",
                applicationNote = "f(x) = (2x + 3) / (4x - 5) ⟹ f⁻¹(x) = (5x + 3) / (4x - 2)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Konversi Mata Uang Otomatis Dompet Digital DANA / GoPay Luar Negeri",
            context = "Wisatawan Indonesia di Singapura berbelanja menggunakan QRIS lintas negara (Cross-Border QRIS).",
            engineeringProblem = "Harga barang dalam Dolar Singapura (SGD) harus dikonversi ke kurs referensi Dolar AS (USD) terlebih dahulu oleh sistem kliring Bank Sentral, lalu dikonversi ke Rupiah (IDR) di saldo rekening nasabah.",
            physicalConceptUsed = "Komposisi dua fungsi konversi mata uang berurutan (f ∘ g)(x).",
            mathematicalModel = "Fungsi kurs USD: g(x) = 0,74x. Fungsi kurs IDR: f(m) = 15.500m. Fungsi komposisi langsung (f ∘ g)(x) = 15.500(0,74x) = 11.470x. Potongan saldo Rupiah langsung dihitung dalam 1 langkah instan.",
            realWorldImpact = "Memungkinkan pembayaran transaksi QRIS instan kurang dari 2 detik bagi jutaan pelancong Indonesia di Singapura, Thailand, dan Malaysia.",
            relatedCareers = listOf("FinTech Software Architect", "Analis Sistem Pembayaran Bank Sentral", "Financial Quantitative Developer"),
            verifiedSource = "Bank Indonesia / Asosiasi Sistem Pembayaran Indonesia (ASPI)."
        ),
        homeLab = HomeLabData(
            title = "Membuat Permainan Tebak Angka Pikiran Menggunakan Fungsi Invers",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("Kertas catatan dan kalkulator"),
            steps = listOf(
                "Langkah 1: Mintalah temanmu memikirkan satu angka rahasia bulat x (misal dia memilih 7, jangan diberitahukan kepadamu).",
                "Langkah 2: Perintahkan fungsi bertahap: 'Kalikan angkamu dengan 3, lalu tambahkan 5' (f(x) = 3x + 5). Temanmu menghitung: 3(7) + 5 = 26.",
                "Langkah 3: Minta temanmu menyebutkan hasil akhirnya: '26'.",
                "Langkah 4: Terapkan fungsi invers di kepalamu: f⁻¹(y) = (y - 5) / 3. Hitung: (26 - 5) / 3 = 21 / 3 = 7!",
                "Langkah 5: Tebak dengan percaya diri: 'Angka rahasia di pikiranmu adalah 7!'. Temanmu akan takjub mengira kamu bisa membaca pikiran!"
            ),
            observationGoal = "Memahami bahwa fungsi invers membalikkan urutan operasi hitung untuk mengungkap kembali nilai input awal.",
            connectionToSimulation = "Bandingkan mesin tebak angka ini dengan simulator fungsi komposisi!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-komp-1",
                prompt = "Diketahui fungsi f(x) = 2x + 3 dan g(x) = x - 1. Berapakah rumus fungsi komposisi (f ∘ g)(x)?",
                type = "multiple_choice",
                options = listOf("2x + 1", "2x + 2", "2x - 1", "2x + 5"),
                correctAnswer = "2x + 1",
                hints = listOf(
                    "Gunakan rumus: (f ∘ g)(x) = f(g(x)).",
                    "Gantikan variabel x pada f(x) dengan (x - 1).",
                    "f(g(x)) = 2(x - 1) + 3 = 2x - 2 + 3 = ...?"
                ),
                explanation = "(f ∘ g)(x) = f(g(x)) = 2(x - 1) + 3 = 2x - 2 + 3 = 2x + 1.",
                misconception = "Menghitung terbalik (g ∘ f)(x) = (2x + 3) - 1 = 2x + 2."
            )
        )
    )

    // =========================================================================
    // 10. LESSON: LIMIT FUNGSI ALJABAR & TRIGONOMETRI
    // =========================================================================
    private val limitLesson = LessonData(
        conceptId = "mat-limit",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "plim1",
                panelNumber = 1,
                title = "Lubang Lubang Tak Tentu 0/0",
                caption = "Dimas menghitung nilai pecahan aljabar f(x) = (x² - 4) / (x - 2) saat nilai x = 2.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kakek, jika aku masukkan x = 2 langsung, hasilnya adalah (4 - 4) / (2 - 2) = 0/0! Pembagian nol per nol ini tidak terdefinisi! Apakah grafiknya bolong?",
                sceneVisualEmoji = "🕳️",
                sceneDescription = "Grafik fungsi memiliki lubang kosong di titik x = 2 akibat bentuk tak tentu 0/0."
            ),
            StoryPanel(
                id = "plim2",
                panelNumber = 2,
                title = "Mendekati Sedekat-Dekatnya",
                caption = "Kakek tersenyum dan membuka gerbang menuju kalkulus modern.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Inilah keajaiban konsep LIMIT! Kita tidak peduli apa yang terjadi persis DI titik x = 2, kita melihat ke mana nilainya MENDEKATI saat x mendekati 2 dari kiri (1,999) dan dari kanan (2,001)!",
                sceneVisualEmoji = "🎯",
                sceneDescription = "Dua panah mendekati angka 2 dari kiri dan kanan menuju nilai limit yang sama."
            ),
            StoryPanel(
                id = "plim3",
                panelNumber = 3,
                title = "Trik Pemfaktoran Mencoret Pembuat Nol",
                caption = "Kirana memfaktorkan selisih kuadrat di pembilang.",
                dialogueSpeaker = "Kirana",
                dialogueText = "x² - 4 bisa difaktorkan menjadi (x - 2)(x + 2)! Karena x hanya mendekati 2 (x ≠ 2), faktor pembuat nol (x - 2) boleh kita coret! Tersisa lim (x + 2) = 2 + 2 = 4!",
                sceneVisualEmoji = "✨",
                sceneDescription = "Pencoretan faktor pembuat nol aljabar menghasilkan nilai limit 4."
            ),
            StoryPanel(
                id = "plim4",
                panelNumber = 4,
                title = "Limit Trigonometri Dasar",
                caption = "Kakek menunjukkan rasio kelengkungan busur lingkaran terhadap tali busur.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Dan untuk sudut mendekati nol, busur lengkung dan garis sinus saling berimpit: lim (x→0) [sin x / x] = 1! Ini adalah batu pondasi seluruh turunan fungsi trigonometri!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Sudut juring sangat kecil memperlihatkan garis sinus dan busur x berimpit tepat sama panjang."
            )
        ),
        intuitionTitle = "Fondasi Kalkulus: Filosofi Pendekatan Tanpa Menyentuh",
        intuitionBody = "Limit fungsi mendeskripsikan perilaku nilai f(x) ketika variabel x bergerak mendekati suatu titik acuan c (baik dari arah kiri maupun kanan), tanpa harus bernilai persis di c.\n\n" +
                "1. Definisi Intuitif:\n" +
                "   lim (x → c) f(x) = L\n" +
                "   Artinya nilai f(x) dapat dibuat sedekat mungkin ke bilangan L dengan syarat x cukup dekat ke c.\n\n" +
                "2. Bentuk Tak Tentu (0/0):\n" +
                "   Jika substitusi langsung menghasilkan 0/0, hilangkan pembuat nolnya melalui:\n" +
                "   • Metode Pemfaktoran: Faktorkan pembilang dan penyebut lalu coret faktor pembuat nol (x - c).\n" +
                "   • Metode Perkalian Akar Sekawan: Jika memuat bentuk akar, kalikan dengan sekawannya agar rasional.\n\n" +
                "3. Limit di Tak Hingga (x → ∞):\n" +
                "   • Untuk fungsi pecahan polinomial P(x)/Q(x): Cukup perhatikan pangkat tertinggi pembilang dan penyebut.\n" +
                "     - Pangkat sama: Nilai limit = rasio koefisien pangkat tertinggi.\n" +
                "     - Pangkat pembilang lebih kecil: Nilai limit = 0.\n" +
                "     - Pangkat pembilang lebih besar: Nilai limit = ∞.\n\n" +
                "4. Limit Dasar Trigonometri:\n" +
                "   lim (x → 0) [sin(ax) / (bx)] = a/b  dan  lim (x → 0) [tan(ax) / (bx)] = a/b.",
        intuitionPoints = listOf(
            "Nilai limit ada JIKA DAN HANYA JIKA limit kiri sama dengan limit kanan: lim (x→c⁻) f(x) = lim (x→c⁺) f(x).",
            "Aturan L'Hôpital (turunan atas dibagi turunan bawah) dapat digunakan untuk menyelesaikan bentuk tak tentu 0/0 atau ∞/∞.",
            "Jangan pernah membagi dengan nol secara langsung, limit adalah cara sah matematika melompati lubang singularitas."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "\\lim_{x \\to 0} \\frac{\\sin x}{x}",
                equation = "\\lim_{x \\to 0} \\frac{\\sin(ax)}{bx} = \\frac{a}{b} \\quad , \\quad \\lim_{x \\to 0} \\frac{\\tan(ax)}{bx} = \\frac{a}{b}",
                meaning = "Teorema limit trigonometri fundamental untuk x mendekati nol.",
                units = "Nilai limit rasio",
                applicationNote = "Contoh: lim (x→0) [sin 3x / 2x] = 3/2."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kecepatan Sesaat Speedometer Mobil Listrik Wuling / Hyundai",
            context = "Speedometer digital pada mobil listrik menampilkan pembacaan kecepatan kendaraan secara real-time setiap milidetik di layar dasbor.",
            engineeringProblem = "Kecepatan rata-rata butuh selang waktu Δt (v = Δs/Δt). Namun saat Δt mendekati 0 detik, rumus menjadi 0/0. Bagaimana speedometer membaca kecepatan pada satu titik detik yang persis?",
            physicalConceptUsed = "Konsep Limit Kecepatan Sesaat (Instantaneous Velocity): v(t) = lim (Δt → 0) [Δs / Δt].",
            mathematicalModel = "Sensor Hall Effect pada roda membaca pulsa putaran roda pada interval waktu mikrodetik Δt = 0,001 detik. Chip mikroprosesor menghitung limit rasio jarak per waktu secara kontinu.",
            realWorldImpact = "Menyediakan data kecepatan instan yang mengaktifkan sistem pengereman darurat otomatis (Autonomous Emergency Braking) demi mencegah tabrakan fatal.",
            relatedCareers = listOf("Automotive Embedded Systems Engineer", "Sensor Calibration Specialist", "Insinyur Sistem Kendali Kendaraan Otonom"),
            verifiedSource = "Pusat Riset Mekatronika Cerdas BRIN & Standar Keselamatan Kendaraan ISO 26262."
        ),
        homeLab = HomeLabData(
            title = "Menghitung Pendekatan Nilai Limit Menggunakan Kalkulator HP",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("Kalkulator di smartphone", "Kertas catatan"),
            steps = listOf(
                "Langkah 1: Kita ingin mencari nilai limit f(x) = (x² - 9) / (x - 3) saat x mendekati 3.",
                "Langkah 2: Jika dimasukkan x = 3, kalkulator akan error karena pembagian 0/0.",
                "Langkah 3: Masukkan nilai x dari arah kiri yang sangat dekat dengan 3: coba x = 2,9; 2,99; 2,999.",
                "Langkah 4: Hitung: f(2,99) = (2,99² - 9) / (2,99 - 3) = 5,99. Untuk x = 2,999 didapat 5,999!",
                "Langkah 5: Masukkan nilai x dari arah kanan: x = 3,001 menghasilkan f(3,001) = 6,001!",
                "Langkah 6: Simpulkan dengan mata kepalamu sendiri: kedua arah mendekati angka bulat 6! Maka nilai limitnya adalah 6!"
            ),
            observationGoal = "Memahami konsep limit secara numerik empiris melalui pendekatan nilai yang semakin dekat.",
            connectionToSimulation = "Bandingkan tabel angkamu dengan simulator limit fungsi!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-lim-1",
                prompt = "Berapakah nilai dari limit: lim (x → 2) [(x² - 4) / (x - 2)]?",
                type = "numeric",
                correctAnswer = "4",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Faktorkan pembilang: x² - 4 = (x - 2)(x + 2).",
                    "Coret faktor pembuat nol (x - 2).",
                    "Substitusikan x = 2 ke sisa ekspresi (x + 2): 2 + 2 = ...?"
                ),
                explanation = "lim (x → 2) [(x - 2)(x + 2) / (x - 2)] = lim (x → 2) (x + 2) = 2 + 2 = 4.",
                misconception = "Menjawab tidak terdefinisi karena langsung mensubstitusikan x = 2 menghasilkan 0/0."
            ),
            QuizQuestion(
                id = "q-lim-2",
                prompt = "Berapakah nilai dari: lim (x → 0) [sin(4x) / (2x)]?",
                type = "numeric",
                correctAnswer = "2",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Gunakan rumus limit trigonometri dasar: lim (x → 0) [sin(ax) / (bx)] = a / b.",
                    "Di sini a = 4 dan b = 2.",
                    "Hitung 4 dibagi 2."
                ),
                explanation = "lim (x → 0) [sin(4x) / (2x)] = 4 / 2 = 2.",
                misconception = "Membagi x dengan x lalu menjawab sin(2)."
            )
        )
    )

    // =========================================================================
    // 11. LESSON: TURUNAN & INTEGRAL DASAR
    // =========================================================================
    private val turunanIntegralLesson = LessonData(
        conceptId = "mat-turunan-integral",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "ptk1",
                panelNumber = 1,
                title = "Garis Singgung Tanjakan Roller Coaster",
                caption = "Kirana dan Dimas menatap rel wahana Halilintar di Dufan Ancol yang meliuk naik turun bergelombang cepat.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Pada setiap detik, kemiringan rel kereta selalu berubah-ubah! Di puncak tertinggi, relnya mendatar sesaat sebelum menukik curam ke bawah!",
                sceneVisualEmoji = "🎢",
                sceneDescription = "Rel roller coaster melengkung dengan garis singgung kemiringan yang berubah di tiap titik."
            ),
            StoryPanel(
                id = "ptk2",
                panelNumber = 2,
                title = "Turunan (Diferensial): Laju Perubahan Sesaat",
                caption = "Kakek menjelaskan konsep agung Sir Isaac Newton dan Gottfried Leibniz.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Turunan f'(x) atau dy/dx adalah limit gradien kemiringan garis singgung kurva! Jika f(x) = xⁿ, maka turunannya f'(x) = n · xⁿ⁻¹! Di titik puncak stasioner, kemiringannya tepat mendatar: f'(x) = 0!",
                sceneVisualEmoji = "📉",
                sceneDescription = "Garis singgung kurva dengan gradien nol di titik puncak ekstrem."
            ),
            StoryPanel(
                id = "ptk3",
                panelNumber = 3,
                title = "Integral (Antiturunan): Menjumlahkan Irisan Tipis",
                caption = "Dimas memotong kue bolu berbentuk kurva tak beraturan menjadi ribuan irisan sangat tipis.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika turunan memecah kurva menjadi laju kemiringan, INTEGRAL (∫) adalah kebalikannya: menjumlahkan jutaan irisan persegi panjang tipis di bawah kurva untuk menghitung LUAS DAERAH yang tak beraturan!",
                sceneVisualEmoji = "🍰",
                sceneDescription = "Jumlah Riemann irisan batang tipis di bawah kurva membentuk luas integral."
            ),
            StoryPanel(
                id = "ptk4",
                panelNumber = 4,
                title = "Teorema Dasar Kalkulus: Dua Sisi Koin yang Sama",
                caption = "Kirana takjub melihat keindahan hubungan turunan dan integral.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dua cabang matematika ini ternyata saling membatalkan: Turunan dari Integral mengembalikan fungsi asal! Kalkulus adalah bahasa universal fisika, kimia, dan teknik modern!",
                sceneVisualEmoji = "⚛️",
                sceneDescription = "Simbol integral dan turunan bersatu melambangkan Teorema Dasar Kalkulus."
            )
        ),
        intuitionTitle = "Mahakarya Newton & Leibniz: Laju Turunan & Akumulasi Integral",
        intuitionBody = "Kalkulus diferensial dan integral adalah puncak matematika terapan yang memodelkan gerak, perubahan laju, dan akumulasi materi di alam semesta.\n\n" +
                "1. Turunan Fungsi Aljabar (Diferensial):\n" +
                "   • Definisi Limit: f'(x) = lim (h → 0) [f(x + h) - f(x)] / h.\n" +
                "   • Rumus Aturan Pangkat: f(x) = a · xⁿ ⟹ f'(x) = a · n · xⁿ⁻¹.\n" +
                "   • Turunan Konstanta: f(x) = c ⟹ f'(x) = 0.\n" +
                "   • Aplikasi Geometri: Gradien garis singgung kurva di x₁ adalah m = f'(x₁).\n" +
                "   • Titik Stasioner (Maksimum / Minimum): Terjadi saat f'(x) = 0.\n\n" +
                "2. Integral Tak Tentu (Antiturunan):\n" +
                "   • Kebalikan dari operasi turunan: ∫ a · xⁿ dx = [a / (n + 1)] · xⁿ⁺¹ + C (untuk n ≠ -1).\n" +
                "   • Huruf C adalah konstanta integrasi sembarang.\n\n" +
                "3. Integral Tentu & Luas Daerah (Teorema Dasar Kalkulus):\n" +
                "   • ∫ [a ke b] f(x) dx = F(b) - F(a), di mana F'(x) = f(x).\n" +
                "   • Menghitung luas eksak bidang di bawah kurva f(x) di atas sumbu X dari interval x = a sampai x = b.",
        intuitionPoints = listOf(
            "Hubungan Kinematika Fisika: Posisi s(t) diturunkan menghasilkan Kecepatan v(t) = s'(t), dan kecepatan diturunkan menghasilkan Percepatan a(t) = v'(t)!",
            "Sebaliknya dalam fisika: Percepatan diintegralkan menghasilkan Kecepatan, dan kecepatan diintegralkan menghasilkan Posisi Jarak tempuh.",
            "Untuk mencari laba maksimum atau biaya produksi minimum dalam ekonomi, selalu cari saat turunan pertama bernilai nol: f'(x) = 0."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "\\frac{d}{dx}[x^n]",
                equation = "\\frac{d}{dx}[a \\cdot x^n] = a \\cdot n \\cdot x^{n-1} \\quad , \\quad m = f'(x_1)",
                meaning = "Aturan turunan fungsi pangkat aljabar dan gradien garis singgung kurva.",
                units = "Laju perubahan",
                applicationNote = "Jika f(x) = 3x² + 5x, maka f'(x) = 6x + 5."
            ),
            FormulaCard(
                symbol = "\\int x^n dx",
                equation = "\\int x^n dx = \\frac{1}{n+1} x^{n+1} + C \\quad (n \\ne -1)",
                meaning = "Integral tak tentu sebagai antiturunan fungsi aljabar.",
                units = "Antiturunan",
                applicationNote = "∫ 6x² dx = (6/3)x³ + C = 2x³ + C."
            ),
            FormulaCard(
                symbol = "\\text{Luas } L",
                equation = "L = \\int_{a}^{b} f(x) \\, dx = F(b) - F(a)",
                meaning = "Teorema Dasar Kalkulus: Luas bidang di bawah kurva dari x = a hingga x = b.",
                units = "Satuan luas",
                applicationNote = "Menghitung luas daerah di bawah kurva tanpa batas perkiraan."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Optimasi Luas Penampang Kanal Banjir Timur (KBT) DKI Jakarta",
            context = "Dinas Sumber Daya Air merancang profil tanggul Kanal Banjir Timur untuk mengalirkan debit banjir luapan Sungai Cipinang, Sunter, dan Buaran.",
            engineeringProblem = "Bahan beton dinding tanggul sangat terbatas. Bagaimana menentukan bentuk lengkung penampang kanal agar menampung luas penampang air maksimum dengan keliling dinding minimum?",
            physicalConceptUsed = "Optimasi nilai ekstrem stasioner menggunakan turunan pertama f'(x) = 0 dan integral tentu luas basah hidrolika.",
            mathematicalModel = "Luas penampang hidrolis A(h) dimodelkan sebagai fungsi tinggi air h. Dengan menetapkan dA/dh = 0, insinyur menentukan sudut talud kemiringan optimal 45° yang memaksimalkan kapasitas aliran debit hingga 390 m³/detik.",
            realWorldImpact = "Melindungi kawasan pemukiman padat Jakarta Timur dan Jakarta Utara seluas 207 km² dari ancaman banjir musiman.",
            relatedCareers = listOf("Insinyur Hidrolika & Sungai", "Perencana Struktur Bangunan Air PUPR", "Analis Optimasi Matematika Terapan"),
            verifiedSource = "Balai Besar Wilayah Sungai Ciliwung Cisadane / Proyek Kanal Banjir Timur."
        ),
        homeLab = HomeLabData(
            title = "Mendekati Luas Telapak Kaki Menggunakan Penjumlahan Kotak Riemann",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("1 lembar kertas kotak-kotak milimeter blok", "Pensil warna dan pulpen"),
            steps = listOf(
                "Langkah 1: Letakkan telapak kakimu di atas kertas berpetak 1 cm × 1 cm, lalu jiplak batas tepinya dengan pensil.",
                "Langkah 2: Telapak kaki memiliki bentuk kurva organik tak beraturan yang tidak punya rumus luas biasa.",
                "Langkah 3: Hitung semua kotak 1 cm² yang berada PENUH di dalam garis jiplakan (Jumlah Bawah Riemann).",
                "Langkah 4: Hitung semua kotak yang tersentuh garis tepi (Jumlah Atas Riemann).",
                "Langkah 5: Rata-ratakan kedua angka tersebut untuk mendapatkan luas telapak kakimu!",
                "Langkah 6: Bayangkan jika ukuran kotak diperkecil menjadi mikrometer: itulah persis prinsip kerja Integral Luas!"
            ),
            observationGoal = "Memahami secara visual bagaimana integral tentu menghitung luas daerah tak beraturan melalui limit penjumlahan pias-pias kecil.",
            connectionToSimulation = "Bandingkan luas telapak kakimu dengan simulator integral Riemann!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kalk-1",
                prompt = "Berapakah turunan pertama f'(x) dari fungsi f(x) = 3x² - 5x + 7 pada titik x = 2?",
                type = "numeric",
                correctAnswer = "7",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Turunkan fungsinya terlebih dahulu: f'(x) = d/dx [3x² - 5x + 7].",
                    "f'(x) = 2(3)x - 5 = 6x - 5.",
                    "Substitusikan x = 2: f'(2) = 6(2) - 5 = 12 - 5 = ...?"
                ),
                explanation = "f'(x) = 6x - 5. Pada x = 2, f'(2) = 6(2) - 5 = 12 - 5 = 7.",
                misconception = "Lupa menurunkan suku -5x menjadi -5 (mengira tetap ada x)."
            ),
            QuizQuestion(
                id = "q-kalk-2",
                prompt = "Berapakah hasil dari integral tentu: ∫ [0 ke 3] 2x dx?",
                type = "numeric",
                correctAnswer = "9",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Cari antiturunannya: ∫ 2x dx = x².",
                    "Evaluasi batas atas dan batas bawah: [x²] dari 0 sampai 3.",
                    "F(3) - F(0) = 3² - 0² = ...?"
                ),
                explanation = "∫ [0 ke 3] 2x dx = [x²] dari 0 sampai 3 = 3² - 0² = 9 - 0 = 9.",
                misconception = "Lupa mengintegralkan fungsi sebelum memasukkan batas angka."
            )
        )
    )

    // =========================================================================
    // 12. LESSON: KOMBINATORIKA, PERMUTASI & PELUANG MAJEMUK
    // =========================================================================
    private val statistikaPeluangLesson = LessonData(
        conceptId = "mat-statistika-peluang",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pkom1",
                panelNumber = 1,
                title = "Kombinasi Nomor Plat Kendaraan Polisi",
                caption = "Di jalan raya, Kirana dan Dimas memperhatikan plat nomor kendaraan bermotor wilayah Jakarta (plat B dengan 4 angka dan 3 huruf).",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ada jutaan sepeda motor dan mobil di Jakarta! Berapa banyak variasi plat nomor berbeda yang bisa dibuat polisi tanpa ada yang kembar?",
                sceneVisualEmoji = "🚗",
                sceneDescription = "Deretan plat nomor kendaraan bermotor di jalan raya kota metropolitan."
            ),
            StoryPanel(
                id = "pkom2",
                panelNumber = 2,
                title = "Kaidah Perkalian & Faktorial (!)",
                caption = "Kakek menuliskan aturan pengisian tempat (Slot Filling) dan simbol tanda seru faktorial.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jika ada k pilihan berurutan, kalikan semua kemungkinannya! Dan untuk menyusun n benda berjajar, kita gunakan Faktorial n! = n × (n - 1) × ... × 1!",
                sceneVisualEmoji = "❗",
                sceneDescription = "Notasi faktorial n! melipatgandakan jumlah kemungkinan susunan."
            ),
            StoryPanel(
                id = "pkom3",
                panelNumber = 3,
                title = "Permutasi (Urutan Penting) vs Kombinasi",
                caption = "Dimas membedakan pemilihan ketua kelas dengan pemilihan tim cerdas cermat.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika URUTAN DIPERHATIKAN (Juara 1, 2, 3 atau Ketua, Sekretaris, Bendahara), gunakan PERMUTASI! Tetapi jika urutan TIDAK penting (memilih 3 orang anggota regu piket tanpa jabatan), gunakan KOMBINASI!",
                sceneVisualEmoji = "🏆",
                sceneDescription = "Perbedaan podium juara berurutan (permutasi) dengan kelompok lingkaran anggota (kombinasi)."
            ),
            StoryPanel(
                id = "pkom4",
                panelNumber = 4,
                title = "Peluang Bersyarat & Seleksi UTBK",
                caption = "Kirana menghitung peluang majemuk lolos seleksi masuk perguruan tinggi negeri impian.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Peluang majemuk P(A ∩ B) = P(A) × P(B|A)! Dengan memahami kombinatorika dan probabilitas, kita bisa menganalisis peluang persaingan kuota secara realistis dan menyusun strategi terbaik!",
                sceneVisualEmoji = "🎓",
                sceneDescription = "Siswa bersemangat menghadapi seleksi ujian masuk universitas dengan persiapan matang."
            )
        ),
        intuitionTitle = "Kaidah Pencacahan: Permutasi, Kombinasi & Peluang Bersyarat",
        intuitionBody = "Kombinatorika adalah cabang matematika yang mempelajari metode menghitung banyaknya susunan, formasi, atau pemilihan objek dari suatu himpunan tanpa harus mendaftarnya satu per satu.\n\n" +
                "1. Kaidah Pencacahan Dasar:\n" +
                "   • Kaidah Penjumlahan: Digunakan untuk pilihan yang bersifat SALING LEPAS / ALTERNATIF (opsi A ATAU opsi B).\n" +
                "   • Kaidah Perkalian: Digunakan untuk kejadian yang terjadi BERSAMAAN / BERTAHAP (tahap 1 DAN tahap 2).\n" +
                "   • Faktorial: n! = n × (n - 1) × (n - 2) × ... × 1, dengan definisi khusus 0! = 1.\n\n" +
                "2. Permutasi (Urutan Diperhatikan: AB ≠ BA):\n" +
                "   Banyaknya susunan r unsur berbeda dari n unsur yang tersedia:\n" +
                "   P(n, r) = n! / (n - r)!\n" +
                "   Contoh: Memilih Juara 1, 2, 3; susunan huruf kata sandi password.\n\n" +
                "3. Kombinasi (Urutan TIDAK Diperhatikan: AB = BA):\n" +
                "   Banyaknya cara memilih kelompok r anggota dari n anggota tanpa memedulikan urutan:\n" +
                "   C(n, r) = n! / [r! (n - r)!]\n" +
                "   Contoh: Memilih delegasi tim, jabat tangan antara n orang, mengambil kelereng sekaligus.\n\n" +
                "4. Peluang Kejadian Majemuk:\n" +
                "   • Saling Lepas (A atau B): P(A ∪ B) = P(A) + P(B).\n" +
                "   • Saling Bebas (A dan B): P(A ∩ B) = P(A) × P(B).\n" +
                "   • Peluang Bersyarat: P(B|A) = P(A ∩ B) / P(A).",
        intuitionPoints = listOf(
            "Kunci membedakan Permutasi vs Kombinasi: tanyakan pada dirimu, 'Apakah jika posisinya dibalik maknanya berubah?' Jika ya = Permutasi, jika tidak = Kombinasi.",
            "Banyaknya jabat tangan yang terjadi antara n orang selalu dihitung dengan C(n, 2) = n(n - 1) / 2.",
            "Segitiga Pascal memuat koefisien ekspansi binomial (a + b)ⁿ yang nilainya tepat sama dengan kombinasi C(n, r)."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "P(n, r) \\& C(n, r)",
                equation = "P(n, r) = \\frac{n!}{(n - r)!} \\quad , \\quad C(n, r) = \\frac{n!}{r!(n - r)!}",
                meaning = "Rumus permutasi (urutan diperhatikan) dan kombinasi (urutan bebas).",
                units = "Banyaknya cara susunan",
                applicationNote = "C(5, 2) = 5! / (2! 3!) = (5 × 4) / (2 × 1) = 10 cara."
            ),
            FormulaCard(
                symbol = "P(A \\cap B)",
                equation = "P(A \\cap B) = P(A) \\times P(B) \\quad (\\text{kejadian saling bebas})",
                meaning = "Peluang dua kejadian independen terjadi secara serentak bersamaan.",
                units = "Peluang gabungan",
                applicationNote = "Peluang keluar angka 6 pada dadu DAN gambar pada koin = 1/6 × 1/2 = 1/12."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kekuatan Enkripsi Kata Sandi PIN ATM 6 Digit & Keamanan Cyber Perbankan",
            context = "Nasabah bank diwajibkan menggunakan PIN (Personal Identification Number) 6 angka numerik untuk transaksi kartu debit di mesin ATM.",
            engineeringProblem = "Berapa banyak kombinasi PIN 6 digit yang mungkin dibentuk, dan berapa lama waktu yang dibutuhkan komputer pencuri (Brute Force Attack) jika bank membatasi percobaan maksimal 3 kali salah?",
            physicalConceptUsed = "Kaidah perkalian permutasi dengan pengulangan: 10⁶ kombinasi.",
            mathematicalModel = "Setiap digit punya 10 opsi (angka 0–9). Total kombinasi = 10 × 10 × 10 × 10 × 10 × 10 = 10⁶ = 1.000.000 kemungkinan PIN. Peluang menebak benar dalam 3 kali percobaan adalah 3 / 1.000.000 = 0,000003 (sangat mustahil).",
            realWorldImpact = "Melindungi tabungan puluhan juta nasabah perbankan dari risiko pembobolan kartu ATM hilang.",
            relatedCareers = listOf("Cyber Security Operations Analyst", "Sistem Arsitek Perbankan", "Ethical Hacker / Penetration Tester"),
            verifiedSource = "Standar Keamanan Kartu Pembayaran PCI-DSS & Bank Indonesia."
        ),
        homeLab = HomeLabData(
            title = "Menghitung Jumlah Jabat Tangan Acara Keluarga (Kombinasi C(n, 2))",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("5 orang anggota keluarga atau teman di rumah", "Kertas catatan dan pulpen"),
            steps = listOf(
                "Langkah 1: Kumpulkan 5 orang di ruangan (kamu dan 4 orang lainnya, n = 5).",
                "Langkah 2: Minta setiap orang saling berjabat tangan satu sama lain tepat satu kali.",
                "Langkah 3: Hitung total berapa kali jabat tangan terjadi secara nyata (setiap ada 2 tangan bertemu, catat 1 garis turus di kertas).",
                "Langkah 4: Hitung dengan rumus matematika kombinasi: C(5, 2) = 5! / (2! × 3!) = (5 × 4) / 2 = 10 kali jabat tangan!",
                "Langkah 5: Cocokkan: jumlah turus yang kamu catat pasti pas berjumlah 10 kali!"
            ),
            observationGoal = "Membuktikan rumus kombinasi C(n, 2) pada interaksi fisik nyata.",
            connectionToSimulation = "Bandingkan kombinasi jabat tangan dengan simulator peluang majemuk!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-komb-1",
                prompt = "Dari 7 orang siswa pengurus OSIS, akan dipilih 3 orang untuk mengikuti seminar. Berapakah banyaknya cara memilih ketiga siswa tersebut?",
                type = "numeric",
                correctAnswer = "35",
                tolerance = 0.1f,
                unit = "cara",
                hints = listOf(
                    "Karena tidak ada jabatan juara/ketua (urutan tidak penting), gunakan Kombinasi C(7, 3).",
                    "C(7, 3) = 7! / [3! × (7 - 3)!] = (7 × 6 × 5) / (3 × 2 × 1).",
                    "Hitung (7 × 6 × 5) / 6 = 7 × 5 = ...?"
                ),
                explanation = "C(7, 3) = (7 × 6 × 5) / (3 × 2 × 1) = 210 / 6 = 35 cara.",
                misconception = "Menggunakan permutasi P(7, 3) = 210 cara karena mengira urutan diperhatikan."
            ),
            QuizQuestion(
                id = "q-komb-2",
                prompt = "Berapakah banyaknya susunan juara 1, 2, dan 3 yang dapat terjadi jika ada 5 peserta lari di babak final?",
                type = "numeric",
                correctAnswer = "60",
                tolerance = 0.1f,
                unit = "susunan",
                hints = listOf(
                    "Di sini posisi juara 1, 2, dan 3 berbeda (urutan penting), gunakan Permutasi P(5, 3).",
                    "P(5, 3) = 5 × 4 × 3.",
                    "Hitung 5 × 4 × 3 = ...?"
                ),
                explanation = "P(5, 3) = 5! / (5 - 3)! = 5 × 4 × 3 = 60 susunan berbeda.",
                misconception = "Menggunakan kombinasi sehingga hanya menjawab 10 susunan."
            )
        )
    )
}

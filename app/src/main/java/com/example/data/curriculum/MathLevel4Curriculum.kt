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

object MathLevel4Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "mat-kalkulus-limit-kontinu",
            domain = Domain.MATEMATIKA,
            topic = "Kalkulus Diferensial Formal",
            title = "Limit Presisi Epsilon-Delta & Kekontinuan",
            description = "Definisi analitis limit formal epsilon-delta, limit sepihak, kekontinuan pada interval, dan Teorema Nilai Antara (IVT).",
            level = DepthLevel.L4,
            estMinutes = 18,
            prerequisites = listOf("mat-limit")
        ),
        ConceptItem(
            id = "mat-kalkulus-turunan-lanjut",
            domain = Domain.MATEMATIKA,
            topic = "Kalkulus Diferensial Formal",
            title = "Turunan Tingkat Tinggi, Teorema Nilai Rata-rata & L'Hôpital",
            description = "Aturan rantai bertingkat, diferensiasi implisit, Teorema Nilai Rata-rata (MVT), aturan L'Hôpital bentuk tak tentu, dan analisis laju terkait.",
            level = DepthLevel.L4,
            estMinutes = 20,
            prerequisites = listOf("mat-kalkulus-limit-kontinu", "mat-turunan-integral")
        ),
        ConceptItem(
            id = "mat-kalkulus-integral-teknik",
            domain = Domain.MATEMATIKA,
            topic = "Kalkulus Integral Formal",
            title = "Teknik Integrasi Lanjut & Teorema Dasar Kalkulus",
            description = "Jumlah Riemann, Teorema Dasar Kalkulus I & II, integrasi parsial, substitusi trigonometri, pecahan parsial, integral tak wajar, dan volume benda putar.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("mat-kalkulus-turunan-lanjut")
        ),
        ConceptItem(
            id = "mat-kalkulus-deret-taylor",
            domain = Domain.MATEMATIKA,
            topic = "Analisis Deret",
            title = "Barisan, Deret Tak Hingga & Ekspansi Taylor",
            description = "Uji konvergensi (integral, rasio, Leibniz), deret kuasa, interval konvergensi, serta ekspansi deret Taylor dan Maclaurin fungsi analitik.",
            level = DepthLevel.L4,
            estMinutes = 20,
            prerequisites = listOf("mat-kalkulus-integral-teknik")
        ),
        ConceptItem(
            id = "mat-kalkulus-multivariabel",
            domain = Domain.MATEMATIKA,
            topic = "Kalkulus Multivariabel",
            title = "Turunan Parsial, Gradien & Integral Lipat",
            description = "Fungsi multivariabel, turunan parsial, vektor gradien, bidang singgung, pengali Lagrange, serta integral lipat dua dan tiga (polar, silinder, bola).",
            level = DepthLevel.L4,
            estMinutes = 24,
            prerequisites = listOf("mat-kalkulus-turunan-lanjut", "mat-vektor")
        ),
        ConceptItem(
            id = "mat-kalkulus-vektor",
            domain = Domain.MATEMATIKA,
            topic = "Kalkulus Vektor",
            title = "Kalkulus Vektor: Teorema Green, Stokes & Gauss",
            description = "Medan vektor, divergensi, curl, medan konservatif, integral garis, integral permukaan, Teorema Green, Teorema Stokes, dan Teorema Divergensi Gauss.",
            level = DepthLevel.L4,
            estMinutes = 24,
            prerequisites = listOf("mat-kalkulus-multivariabel")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "mat-kalkulus-limit-kontinu" -> limitKontinuLesson
            "mat-kalkulus-turunan-lanjut" -> turunanLanjutLesson
            "mat-kalkulus-integral-teknik" -> integralTeknikLesson
            "mat-kalkulus-deret-taylor" -> deretTaylorLesson
            "mat-kalkulus-multivariabel" -> multivariabelLesson
            "mat-kalkulus-vektor" -> kalkulusVektorLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. LIMIT PRESISI EPSILON-DELTA & KEKONTINUAN
    // =========================================================================
    private val limitKontinuLesson = LessonData(
        conceptId = "mat-kalkulus-limit-kontinu",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pml1",
                panelNumber = 1,
                title = "Toleransi Presisi di Pabrik Semikonduktor",
                caption = "Dimas dan Kirana magang di laboratorium mikroelektronika BRIN Bandung mengamati fabrikasi microchip.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Di pabrik chip, mesin laser harus memotong silikon dengan ketelitian nanometer. Jika kita ingin toleransi galat output kurang dari epsilon, seberapa presisi delta input yang harus diatur?",
                sceneVisualEmoji = "🔬",
                sceneDescription = "Mesin laser fotolitografi presisi tinggi memproses wafer silikon dengan toleransi nanometer."
            ),
            StoryPanel(
                id = "pml2",
                panelNumber = 2,
                title = "Definisi Formal Cauchy: Epsilon & Delta",
                caption = "Profesor Matematika menuliskan definisi limit analitis murni di papan tulis.",
                dialogueSpeaker = "Profesor",
                dialogueText = "Limit f(x) mendekati L saat x mendekati c berarti: untuk setiap epsilon positif sekecil apa pun yang ditantang lawan, kita selalu dapat menemukan delta positif sehingga jika jarak x ke c kurang dari delta, jarak f(x) ke L pasti kurang dari epsilon!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Diagram pita horizontal pita epsilon dan pita vertikal delta pada grafik fungsi kontinu."
            ),
            StoryPanel(
                id = "pml3",
                panelNumber = 3,
                title = "Kekontinuan: Menembus Tanpa Melompat",
                caption = "Kirana menganalisis syarat suatu kurva tidak terputus di titik c.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Fungsi f kontinu di titik c jika dan hanya jika tiga syarat terpenuhi: f(c) terdefinisi, limit f(x) saat x mendekati c ada, dan nilai limitnya sama persis dengan f(c)!",
                sceneVisualEmoji = "📈",
                sceneDescription = "Kurva mulus tanpa lubang atau loncatan vertikal melintasi selang koordinat."
            ),
            StoryPanel(
                id = "pml4",
                panelNumber = 4,
                title = "Teorema Nilai Antara (IVT) Menjamin Solusi",
                caption = "Dimas membuktikan keberadaan akar persamaan rumit tanpa harus menyelesaikannya secara analitis.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika fungsi kontinu bergerak dari nilai negatif f(a) < 0 ke nilai positif f(b) > 0, kurva pasti memotong sumbu-x di suatu titik c di antara a dan b! Inilah jaminan keberadaan akar persamaan!",
                sceneVisualEmoji = "🎯",
                sceneDescription = "Garis fungsi kontinu melintasi sumbu horizontal menjamin adanya perpotongan nol."
            )
        ),
        intuitionTitle = "Fondasi Rigor Kalkulus: Dari Intuitif Menuju Keabsahan Analisis Real",
        intuitionBody = "Kalkulus modern dibangun di atas fondasi limit analitis formal yang dirumuskan oleh Augustin-Louis Cauchy dan Karl Weierstrass untuk menyingkirkan paradoks konsep 'bilangan tak hingga kecil' (infinitesimal).\n\n" +
                "1. Definisi Presisi Limit Epsilon-Delta (ε-δ):\n" +
                "   Dikatakan \${'$'}\\lim_{x \\to c} f(x) = L\${'$'} jika dan hanya jika:\n" +
                "   \${'$'}\${'$'}\\forall \\epsilon > 0, \\; \\exists \\delta > 0 \\; \\text{sehingga} \\; 0 < |x - c| < \\delta \\implies |f(x) - L| < \\epsilon\${'$'}\${'$'}\n" +
                "   • Makna Intuitif: Anda dapat membuat \${'$'}f(x)\${'$'} sedekat mungkin ke target \${'$'}L\${'$'} (dalam radius \${'$'}\\epsilon\${'$'}) cukup dengan memilih \${'$'}x\${'$'} yang cukup dekat ke \${'$'}c\${'$'} (dalam radius \${'$'}\\delta\${'$'}).\n\n" +
                "2. Kekontinuan Fungsi pada Interval:\n" +
                "   Fungsi \${'$'}f\${'$'} kontinu di titik \${'$'}c\${'$'} jika \${'$'}\\lim_{x \\to c} f(x) = f(c)\${'$'}.\n" +
                "   • Syarat 1: \${'$'}f(c)\${'$'} terdefinisi (tidak ada lubang pada domain).\n" +
                "   • Syarat 2: Limit kiri \${'$'}\\lim_{x \\to c^-} f(x)\${'$'} sama dengan limit kanan \${'$'}\\lim_{x \\to c^+} f(x)\${'$'} (tidak ada loncatan/asuransi vertikal).\n" +
                "   • Syarat 3: Nilai limit sama dengan nilai fungsi.\n\n" +
                "3. Teorema Nilai Antara (Intermediate Value Theorem / IVT):\n" +
                "   Jika \${'$'}f\${'$'} kontinu pada selang tertutup \${'$'}[a, b]\${'$'} dan \${'$'}u\${'$'} adalah sembarang nilai di antara \${'$'}f(a)\${'$'} dan \${'$'}f(b)\${'$'}, maka terdapat setidaknya satu nilai \${'$'}c \\in (a, b)\${'$'} sedemikian rupa sehingga \${'$'}f(c) = u\${'$'}.\n" +
                "   • Teorema Bolzano (Pencarian Akar): Jika \${'$'}f(a) \\cdot f(b) < 0\${'$'}, maka terdapat setidaknya satu akar riil \${'$'}c \\in (a, b)\${'$'} di mana \${'$'}f(c) = 0\${'$'}. Teorema ini menjadi dasar algoritma komputasi Biseksi.",
        intuitionPoints = listOf(
            "Nilai delta (δ) selalu bergantung pada pilihan epsilon (ε) yang diberikan dan titik c (δ = δ(ε, c)).",
            "Fungsi Dirichlet f(x) = 1 jika x rasional dan f(x) = 0 jika x irasional adalah contoh fungsi yang tidak kontinu di SETIAP titik garis bilangan riil!",
            "Teorema Nilai Antara membuktikan bahwa pada setiap saat, selalu ada setidaknya dua titik yang berseberangan di khatulistiwa bumi yang memiliki suhu temperatur persis sama."
        ),
        simId = "sim-epsilon-delta",
        formulas = listOf(
            FormulaCard(
                symbol = "\\lim_{x \\to c} f(x) = L",
                equation = "\\forall \\epsilon > 0, \\; \\exists \\delta > 0 : 0 < |x - c| < \\delta \\implies |f(x) - L| < \\epsilon",
                meaning = "Definisi analitis presisi limit fungsi Cauchy-Weierstrass.",
                units = "Pernyataan logika predikat analitis",
                applicationNote = "Untuk membuktikan limit linear f(x) = mx + k, nilai delta dapat dipilih langsung δ = ε / |m|."
            ),
            FormulaCard(
                symbol = "\\text{Teorema IVT}",
                equation = "f(a) < u < f(b) \\implies \\exists c \\in (a, b) : f(c) = u",
                meaning = "Teorema Nilai Antara untuk fungsi kontinu pada interval tertutup [a, b].",
                units = "Eksistensi nilai riil c",
                applicationNote = "Menjamin keberadaan solusi persamaan f(x) = 0 saat f(a) dan f(b) berlainan tanda."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Validasi Sistem Pengereman Otomatis Kereta Cepat Whoosh Berbasis Teorema Nilai Antara",
            context = "Kereta Cepat Whoosh melaju pada kecepatan 350 km/jam antara Stasiun Halim dan Padalarang dan harus melambat hingga berhenti sempurna di peron stasiun.",
            engineeringProblem = "Memastikan sistem pengereman otomatis regeneratif mampu menurunkan kecepatan secara kontinu tanpa lonjakan perlambatan (jerk) yang membahayakan penumpang.",
            physicalConceptUsed = "Prinsip kekontinuan fungsi kecepatan v(t) dan penerapan Teorema Nilai Antara: karena v(t) kontinu dari 350 km/jam ke 0 km/jam, setiap target kecepatan penurunan pasti terlewati pada waktu tertentu.",
            mathematicalModel = "Profil perlambatan dimodelkan dengan fungsi kontinu diferensiabel C² untuk menjamin nilai batas delta waktu respon pengereman memenuhi toleransi epsilon jarak henti stasiun (< 5 cm).",
            realWorldImpact = "Menjamin keselamatan ratusan ribu perjalanan kereta cepat dengan presisi henti peron otomatis 100% tanpa hentakan mendadak.",
            relatedCareers = listOf("Insinyur Sistem Kontrol Avionik/Kereta", "Analis Keselamatan Transportasi", "Matematikawan Terapan"),
            verifiedSource = "PT Kereta Cepat Indonesia China (KCIC) & Balai Pengujian Perkeretaapian Kemenhub."
        ),
        homeLab = HomeLabData(
            title = "Menemukan Akar Persamaan Kubik Menggunakan Algoritma Biseksi Kertas & Kalkulator",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Kertas HVS dan bolpoin",
                "Kalkulator smartphone (mode scientific)",
                "Fungsi uji polinomial: f(x) = x³ - 3x - 1 = 0"
            ),
            steps = listOf(
                "Langkah 1: Hitung nilai f(1) = 1³ - 3(1) - 1 = -3 (negatif).",
                "Langkah 2: Hitung nilai f(2) = 2³ - 3(2) - 1 = 8 - 6 - 1 = +1 (positif).",
                "Langkah 3: Karena f(1) < 0 dan f(2) > 0 serta f(x) polinomial kontinu, Teorema Nilai Antara menjamin ada akar c di antara interval [1, 2].",
                "Langkah 4: Hitung titik tengah x_mid = (1 + 2)/2 = 1,5. Hitung f(1,5) = 1,5³ - 3(1,5) - 1 = 3,375 - 4,5 - 1 = -2,125 (negatif). Maka interval akar baru menyempit ke [1,5 ; 2].",
                "Langkah 5: Ulangi langkah biseksi hingga 4 iterasi untuk mendekati akar c ≈ 1,879 dengan galat kurang dari 0,05!"
            ),
            observationGoal = "Mengamati secara numerik bagaimana Teorema Nilai Antara mendasari algoritma pencarian akar komputer digital.",
            connectionToSimulation = "Bandingkan iterasi biseksimu dengan pita delta-epsilon pada simulator kalkulus di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kalk-lim-1",
                prompt = "Berdasarkan definisi formal limit epsilon-delta, jika f(x) = 4x - 5 dan kita ingin membuktikan bahwa lim (x->3) f(x) = 7 dengan toleransi epsilon = 0,08, berapakah nilai delta maksimum yang dapat kita pilih?",
                type = "numeric",
                correctAnswer = "0.02",
                tolerance = 0.001f,
                unit = "delta",
                hints = listOf(
                    "Bentuk pertidaksamaan: |f(x) - L| = |(4x - 5) - 7| = |4x - 12| = 4|x - 3|.",
                    "Kita menginginkan 4|x - 3| < epsilon.",
                    "Maka |x - 3| < epsilon / 4 = 0,08 / 4 = ...?"
                ),
                explanation = "|(4x - 5) - 7| = |4x - 12| = 4|x - 3| < epsilon. Agar syarat terpenuhi, kita membutuhkan |x - 3| < epsilon / 4. Dengan epsilon = 0,08, maka delta = 0,08 / 4 = 0,02.",
                misconception = "Mengalikan epsilon dengan 4 alih-alih membaginya dengan gradien kemiringan fungsi."
            ),
            QuizQuestion(
                id = "q-kalk-lim-2",
                prompt = "Manakah pernyataan berikut yang paling tepat mengenai Teorema Nilai Antara (IVT)?",
                type = "multiple_choice",
                options = listOf(
                    "Jika fungsi f kontinu pada selang tertutup [a, b], maka f mencapai setiap nilai di antara f(a) dan f(b) setidaknya satu kali",
                    "Fungsi f pasti memiliki turunan pertama bernilai nol di dalam selang",
                    "Teorema ini berlaku untuk semua fungsi meskipun terputus atau memiliki asimtot tegak",
                    "Nilai f(a) dan f(b) harus selalu bertanda positif"
                ),
                correctAnswer = "Jika fungsi f kontinu pada selang tertutup [a, b], maka f mencapai setiap nilai di antara f(a) dan f(b) setidaknya satu kali",
                hints = listOf(
                    "Kekontinuan menjamin kurva tidak melompati nilai apa pun di antaranya.",
                    "Syarat kuncinya: f harus kontinu pada interval tertutup [a, b]."
                ),
                explanation = "Teorema Nilai Antara menyatakan bahwa jika fungsi kontinu pada interval tertutup [a, b], maka untuk setiap nilai u di antara f(a) dan f(b), terdapat setidaknya satu nilai c di dalam interval (a, b) sedemikian sehingga f(c) = u.",
                misconception = "Menyamakan IVT dengan Teorema Rolle (yang mensyaratkan turunan bernilai nol)."
            )
        )
    )

    // =========================================================================
    // 2. TURUNAN TINGKAT TINGGI, TEOREMA NILAI RATA-RATA & L'HÔPITAL
    // =========================================================================
    private val turunanLanjutLesson = LessonData(
        conceptId = "mat-kalkulus-turunan-lanjut",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pmt1",
                panelNumber = 1,
                title = "Kamera Tilang Elektronik & Teorema Nilai Rata-rata",
                caption = "Dimas dan Kakek melintas di jalan tol Trans-Jawa melewati dua gerbang tol berjarak 100 km.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Ayah masuk gerbang tol pukul 08.00 dan keluar gerbang berikutnya pukul 08.50. Polisi tilang elektronik menyatakan mobil kita melanggar batas kecepatan 100 km/jam! Dari mana polisi tahu?",
                sceneVisualEmoji = "📷",
                sceneDescription = "Kamera ETLE gerbang tol menghitung waktu tempuh kendaraan antar ruas jalan bebas hambatan."
            ),
            StoryPanel(
                id = "pmt2",
                panelNumber = 2,
                title = "Teorema Nilai Rata-rata (MVT) Lagrange",
                caption = "Kakek menjelaskan Teorema Nilai Rata-rata (Mean Value Theorem).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kecepatan rata-rata mobil adalah 100 km / (50/60 jam) = 120 km/jam! Menurut Teorema MVT, pasti ada setidaknya satu momen di mana kecepatan sesaat spidometer mobil tepat menyamai 120 km/jam!",
                sceneVisualEmoji = "🚗",
                sceneDescription = "Garis singgung kurva sejajar sempurna dengan garis tali busur rata-rata kecepatan."
            ),
            StoryPanel(
                id = "pmt3",
                panelNumber = 3,
                title = "Menembus Bentuk Tak Tentu dengan Aturan L'Hôpital",
                caption = "Kirana memecahkan limit pecahan yang menghasilkan bentuk 0/0.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Saat limit pecahan pembilang dan penyebut sama-sama mendekati nol, kita gunakan Aturan L'Hôpital: turunkan pembilang dan penyebut secara terpisah! Rasio turunan f'(x)/g'(x) membuka nilai limit aslinya!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Grafik limit bentuk tak tentu 0/0 dihitung melalui perbandingan kemiringan turunan."
            ),
            StoryPanel(
                id = "pmt4",
                panelNumber = 4,
                title = "Laju Terkait dalam Rekayasa Teknik",
                caption = "Dimas menghitung laju kenaikan permukaan air di tangki berbentuk kerucut terbalik.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Dengan aturan rantai dV/dt = (dV/dh) * (dh/dt), kita bisa memprediksi laju kenaikan tinggi air seketika dari debit pompa air! Kalkulus diferensial adalah bahasa pergerakan alam!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Tangki air kerucut terisi air dengan diagram variabel laju perubahan volume dan tinggi."
            )
        ),
        intuitionTitle = "Dinamika Laju Perubahan Lanjut: Teori Diferensial Analitis",
        intuitionBody = "Kalkulus diferensial formal melampaui aturan turunan dasar aljabar dengan menyajikan teorema-teorema keberadaan analitis serta teknik evaluasi limit tak tentu.\n\n" +
                "1. Teorema Nilai Rata-Rata (Mean Value Theorem / MVT):\n" +
                "   Jika fungsi \${'$'}f\${'$'} kontinu pada \${'$'}[a, b]\${'$'} dan terturunkan (*differentiable*) pada \${'$'}(a, b)\${'$'}, maka terdapat setidaknya satu nilai \${'$'}c \\in (a, b)\${'$'} sedemikian rupa sehingga:\n" +
                "   \${'$'}\${'$'}f'(c) = \\frac{f(b) - f(a)}{b - a}\${'$'}\${'$'}\n" +
                "   • Interpretasi Geometri: Terdapat titik \${'$'}c\${'$'} di mana garis singgung kurva sejajar persis dengan garis sekan yang menghubungkan titik ujung \${'$'}(a, f(a))\${'$'} dan \${'$'}(b, f(b))\${'$'}.\n" +
                "   • Teorema Rolle (Kasus Khusus): Jika \${'$'}f(a) = f(b)\${'$'}, maka terdapat \${'$'}c \\in (a, b)\${'$'} dengan \${'$'}f'(c) = 0\${'$'}.\n\n" +
                "2. Aturan L'Hôpital untuk Bentuk Tak Tentu:\n" +
                "   Jika \${'$'}\\lim_{x \\to c} \\frac{f(x)}{g(x)}\${'$'} menghasilkan bentuk tak tentu \${'$'}\\frac{0}{0}\${'$'} atau \${'$'}\\frac{\\pm \\infty}{\\pm \\infty}\${'$'}, dan \${'$'}\\lim_{x \\to c} \\frac{f'(x)}{g'(x)}\${'$'} ada, maka:\n" +
                "   \${'$'}\${'$'}\\lim_{x \\to c} \\frac{f(x)}{g(x)} = \\lim_{x \\to c} \\frac{f'(x)}{g'(x)}\${'$'}\${'$'}\n" +
                "   *Catatan:* Bentuk tak tentu lain (\${'$'}0 \\cdot \\infty\${'$'}, \${'$'}\\infty - \\infty\${'$'}, \${'$'}1^\\infty\${'$'}, \${'$'}0^0\${'$'}, \${'$'}\\infty^0\${'$'}) harus diubah terlebih dahulu ke bentuk \${'$'}\\frac{0}{0}\${'$'} atau \${'$'}\\frac{\\infty}{\\infty}\${'$'} via manipulasi aljabar atau logaritma natural \${'$'}\\ln\${'$'}.\n\n" +
                "3. Turunan Implisit & Laju yang Berkaitan (*Related Rates*):\n" +
                "   Banyak persamaan fisika tidak berbentuk eksplisit \${'$'}y = f(x)\${'$'}, melainkan \${'$'}F(x, y) = 0\${'$'} (contoh: lingkaran \${'$'}x^2 + y^2 = r^2\${'$'}). Dengan menerapkan aturan rantai diferensiasi terhadap variabel bebas waktu \${'$'}t\${'$'}:\n" +
                "   \${'$'}\${'$'}2x \\frac{dx}{dt} + 2y \\frac{dy}{dt} = 0 \\implies \\frac{dy}{dt} = -\\frac{x}{y} \\frac{dx}{dt}\${'$'}\${'$'}",
        intuitionPoints = listOf(
            "Aturan L'Hôpital BUKAN turunan hasil bagi (Quotient Rule); Anda menurunkan pembilang sendiri dan menurunkan penyebut sendiri secara terpisah!",
            "Uji Turunan Kedua f''(c) menentukan kecekungan kurva: jika f''(c) > 0 kurva cekung ke atas (titik minimum lokal), jika f''(c) < 0 kurva cekung ke bawah (titik maksimum lokal).",
            "Teorema MVT adalah dasar pembuktian bahwa fungsi dengan turunan nol pada interval (f'(x) = 0) pasti berupa fungsi konstan."
        ),
        simId = "sim-mvt-lhopital",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Teorema MVT}",
                equation = "f'(c) = \\frac{f(b) - f(a)}{b - a} \\quad (c \\in (a, b))",
                meaning = "Teorema Nilai Rata-rata Kalkulus Diferensial Lagrange.",
                units = "Laju perubahan sesaat = laju rata-rata",
                applicationNote = "Menjamin adanya momen di mana kecepatan sesaat menyamai kecepatan rata-rata perjalanan."
            ),
            FormulaCard(
                symbol = "\\text{Aturan L'Hôpital}",
                equation = "\\lim_{x \\to c} \\frac{f(x)}{g(x)} = \\lim_{x \\to c} \\frac{f'(x)}{g'(x)} \\quad \\left( \\text{untuk } \\frac{0}{0} \\text{ atau } \\frac{\\infty}{\\infty} \\right)",
                meaning = "Penyelesaian limit bentuk tak tentu melalui rasio turunan pertama.",
                units = "Nilai limit analitis",
                applicationNote = "Dapat diterapkan berulang jika turunan pertama masih menghasilkan bentuk tak tentu."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Optimasi Geometri Lengkung Lambung Kapal Cepat Rudal KCR-60M di PT PAL Indonesia",
            context = "Kapal perang cepat rudal memerlukan bentuk lambung (hull form) hidrodinamis yang meminimalkan hambatan gelombang air laut saat berkecepatan 28 knot.",
            engineeringProblem = "Menentukan titik belok (inflection point) dan gradien kecekungan garis lengkung lambung agar turbulensi aliran air diminimalkan.",
            physicalConceptUsed = "Analisis turunan kedua f''(x) = 0 untuk mendeteksi titik belok kelengkungan dan optimasi diferensial hambatan gelombang kavitasi.",
            mathematicalModel = "Profil kurva lambung didefinisikan secara parametrik; metode turunan implisit dan Lagrange menentukan kelengkungan minimum dengan kendala kapasitas muat senjata rudal.",
            realWorldImpact = "Menghemat konsumsi bahan bakar kapal hingga 14% dan meningkatkan stabilitas manuver taktis di perairan laut lepas.",
            relatedCareers = listOf("Arsitek Perkapalan (Naval Architect)", "Insinyur Hidrodinamika Fluida Komputasi", "Analis Optimasi Struktur"),
            verifiedSource = "PT PAL Indonesia (Persero) Surabaya & Jurusan Teknik Perkapalan ITS."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Laju Terkait (Related Rates): Pengosongan Air Corong Botol Kerucut",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 botol plastik bekas 1,5 Liter yang dipotong bagian corong atasnya menyerupai kerucut",
                "Paku kecil dipanaskan untuk melubangi tutup botol (lubang 3 mm - dibantu orang dewasa)",
                "Penggaris dan stopwatch smartphone",
                "Wadah penampung air di bawah corong"
            ),
            steps = listOf(
                "Langkah 1: Pasang tutup botol berlubang, lalu posisikan corong botol terbalik (ujung sempit menghadap ke bawah). Tandai garis ketinggian h = 10 cm, 8 cm, 6 cm, 4 cm, 2 cm.",
                "Langkah 2: Isi air hingga ketinggian 10 cm sambil menyumbat lubang bawah dengan jari.",
                "Langkah 3: Lepaskan jari dan jalankan stopwatch: ukur waktu yang dibutuhkan permukaan air untuk turun dari 10 cm ke 8 cm, lalu dari 4 cm ke 2 cm.",
                "Langkah 4: Perhatikan bahwa laju penurunan tinggi air (dh/dt) semakin cepat saat air mendekati ujung bawah kerucut!",
                "Langkah 5: Buktikan dengan kalkulus laju terkait: karena Volume V = (1/3) * pi * r² * h dan r sebanding h, maka dV/dt = k * h² * (dh/dt); saat h mengecil, dh/dt harus membesar untuk mengalirkan debit lubang bawah!"
            ),
            observationGoal = "Menyaksikan fenomena fisis laju terkait di mana penurunan ketinggian air tidak konstan melainkan bergantung pada geometri penampang wadah.",
            connectionToSimulation = "Bandingkan data laju kerucutmu dengan simulator turunan terkait di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kalk-tur-1",
                prompt = "Berapakah nilai limit dari lim (x -> 0) [sin(5x) / (2x)] dengan menerapkan Aturan L'Hôpital?",
                type = "numeric",
                correctAnswer = "2.5",
                tolerance = 0.05f,
                unit = "nilai limit",
                hints = listOf(
                    "Substitusi x = 0 menghasilkan bentuk tak tentu 0/0.",
                    "Turunan pembilang d/dx [sin(5x)] = 5 cos(5x).",
                    "Turunan penyebut d/dx [2x] = 2.",
                    "Hitung nilai rasio turunan saat x = 0: [5 cos(0)] / 2 = ...?"
                ),
                explanation = "Karena menghasilkan bentuk 0/0, gunakan aturan L'Hôpital: lim (x->0) [sin(5x) / 2x] = lim (x->0) [5 cos(5x) / 2] = [5 * cos(0)] / 2 = 5 * 1 / 2 = 2,5.",
                misconception = "Lupa mengalikan turunan dalam 5x sehingga hanya menjawab 1/2."
            ),
            QuizQuestion(
                id = "q-kalk-tur-2",
                prompt = "Sebuah mobil menempuh jarak total 180 km dalam waktu tepat 2 jam di jalan tol bebas hambatan. Menurut Teorema Nilai Rata-rata (MVT), kesimpulan manakah yang PASTI benar mengenai kecepatan mobil tersebut?",
                type = "multiple_choice",
                options = listOf(
                    "Setidaknya ada satu momen di mana jarum spidometer mobil menunjukkan tepat 90 km/jam",
                    "Mobil selalu melaju dengan kecepatan konstan 90 km/jam sepanjang perjalanan",
                    "Mobil tidak pernah melaju lebih dari 90 km/jam",
                    "Mobil pasti berhenti setidaknya satu kali di rest area"
                ),
                correctAnswer = "Setidaknya ada satu momen di mana jarum spidometer mobil menunjukkan tepat 90 km/jam",
                hints = listOf(
                    "Kecepatan rata-rata = jarak / waktu = 180 km / 2 jam = 90 km/jam.",
                    "Teorema MVT menjamin f'(c) = (b - a)/t setidaknya pada satu titik c."
                ),
                explanation = "Kecepatan rata-rata mobil adalah 180 km / 2 jam = 90 km/jam. Teorema Nilai Rata-rata menjamin bahwa pada fungsi perpindahan kontinu dan terdiferensialkan, terdapat setidaknya satu waktu c di mana kecepatan sesaat sama persis dengan kecepatan rata-rata (90 km/jam).",
                misconception = "Mengasumsikan mobil harus selalu melaju konstan 90 km/jam setiap saat."
            )
        )
    )

    // =========================================================================
    // 3. TEKNIK INTEGRASI LANJUT & TEOREMA DASAR KALKULUS
    // =========================================================================
    private val integralTeknikLesson = LessonData(
        conceptId = "mat-kalkulus-integral-teknik",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pmi_t1",
                panelNumber = 1,
                title = "Menghitung Kapasitas Waduk Jatigede",
                caption = "Kirana dan Dimas diajak meninjau bendungan raksasa Waduk Jatigede di Sumedang Jawa Barat.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lembah waduk ini bentuknya tidak beraturan, melengkung dan berkelok. Bagaimana insinyur sipil menghitung kapasitas daya tampung air bendungan hingga miliaran meter kubik?",
                sceneVisualEmoji = "🌊",
                sceneDescription = "Waduk air raksasa berlatar pegunungan dengan struktur bendungan beton masif."
            ),
            StoryPanel(
                id = "pmi_t2",
                panelNumber = 2,
                title = "Jumlah Riemann & Teorema Dasar Kalkulus",
                caption = "Kakek menjelaskan jembatan emas penghubung turunan dan integral.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Luas di bawah kurva adalah limit penjumlahan jutaan batang persegi panjang tipis Riemann! Dan Teorema Dasar Kalkulus membuktikan antiturunan F'(x) = f(x) menghitung luas itu dalam sekejap tanpa menjumlahkan jutaan batang manual!",
                sceneVisualEmoji = "📊",
                sceneDescription = "Batang-batang persegi panjang partisi Riemann menyatu membentuk luas bidang kontinu mulus."
            ),
            StoryPanel(
                id = "pmi_t3",
                panelNumber = 3,
                title = "Gudang Senjata Teknik Integrasi",
                caption = "Dimas membedah integrasi parsial dan substitusi trigonometri.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Untuk integral perkalian fungsi ∫ u dv = uv - ∫ v du (Integrasi Parsial)! Untuk bentuk akar √(a² - x²) kita gunakan substitusi segitiga x = a sin(θ)! Dan pecahan rasional dipecah jadi Pecahan Parsial!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Diagram segitiga siku-siku substitusi trigonometri x = a sin(theta)."
            ),
            StoryPanel(
                id = "pmi_t4",
                panelNumber = 4,
                title = "Memutar Kurva: Metode Kulit Tabung",
                caption = "Kirana memutar kurva fungsi mengelilingi sumbu putar.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kurva diputar mengelilingi sumbu-y menghasilkan volume benda putar! Dengan metode Kulit Tabung Silinder V = 2π ∫ x f(x) dx, kita bisa menghitung volume tangki dan kubah beton rumit secara presisi!",
                sceneVisualEmoji = "🏺",
                sceneDescription = "Kurva 2D diputar 360 derajat membentuk objek benda pejal 3 dimensi berongga silinder."
            )
        ),
        intuitionTitle = "Arsitektur Akumulasi Kontinu: Teori Integral & Geometri Benda Pejal",
        intuitionBody = "Kalkulus integral adalah mesin matematika untuk menghitung akumulasi total kuantitas kontinu dari laju perubahan lokalnya, menghubungkan geometri luas dengan konsep antiturunan.\n\n" +
                "1. Teorema Dasar Kalkulus (Fundamental Theorem of Calculus / FTC):\n" +
                "   • FTC Bagian 1 (Diferensiasi Akumulasi):\n" +
                "     Jika \${'$'}f\${'$'} kontinu pada \${'$'}[a, b]\${'$'} dan \${'$'}g(x) = \\int_a^x f(t)\\, dt\${'$'}, maka \${'$'}g'(x) = f(x)\${'$'}. Integrasi dan diferensiasi adalah operasi balikan (*invers*).\n" +
                "   • FTC Bagian 2 (Evaluasi Nilai Tentu):\n" +
                "     \${'$'}\${'$'}\\int_a^b f(x)\\, dx = F(b) - F(a) \\quad \\text{di mana } F'(x) = f(x)\${'$'}\${'$'}\n\n" +
                "2. Kotak Alat Teknik Integrasi Mahir:\n" +
                "   • Integrasi Parsial (Integration by Parts): Diturunkan dari aturan perkalian turunan:\n" +
                "     \${'$'}\${'$'}\\int u\\, dv = u v - \\int v\\, du\${'$'}\${'$'}\n" +
                "     *Panduan LIATE* untuk memilih \${'$'}u\${'$'}: Logaritmik, Invers trigonometri, Aljabar, Trigonometri, Eksponensial.\n" +
                "   • Substitusi Trigonometri:\n" +
                "     - Bentuk \${'$'}\\sqrt{a^2 - x^2} \\implies x = a \\sin\\theta\${'$'}\n" +
                "     - Bentuk \${'$'}\\sqrt{a^2 + x^2} \\implies x = a \\tan\\theta\${'$'}\n" +
                "     - Bentuk \${'$'}\\sqrt{x^2 - a^2} \\implies x = a \\sec\\theta\${'$'}\n" +
                "   • Dekomposisi Pecahan Parsial: Mengurai fungsi rasional \${'$'}\\frac{P(x)}{Q(x)}\${'$'} menjadi suku-suku sederhana \${'$'}\\frac{A}{x - r} + \\frac{Bx + C}{x^2 + k}\${'$'}.\n" +
                "   • Integral Tak Wajar (*Improper Integrals*): Batas integrasi tak hingga \${'$'}\\int_a^\\infty f(x)\\, dx = \\lim_{t \\to \\infty} \\int_a^t f(x)\\, dx\${'$'} atau diskontinuitas vertikal tak hingga.\n\n" +
                "3. Aplikasi Fisik & Geometri Benda Putar:\n" +
                "   • Volume Metode Cakram/Cincin (Putar sumbu-x): \${'$'}V = \\pi \\int_a^b [R(x)^2 - r(x)^2]\\, dx\${'$'}.\n" +
                "   • Volume Metode Kulit Tabung Silinder (Putar sumbu-y): \${'$'}V = 2\\pi \\int_a^b x f(x)\\, dx\${'$'}.\n" +
                "   • Panjang Busur Kurva: \${'$'}L = \\int_a^b \\sqrt{1 + [f'(x)]^2}\\, dx\${'$'}.",
        intuitionPoints = listOf(
            "Integral tak wajar integral dari 1 ke tak hingga (1/x) dx divergen tak hingga, tetapi integral dari 1 ke tak hingga (1/x²) dx konvergen tepat bernilai 1!",
            "Trompet Gabriel (Gabriel's Horn) adalah benda putar dari y = 1/x untuk x >= 1 yang memiliki volume berhingga (pi satuan volume) tetapi luas permukaan tak terhingga!",
            "Metode kulit tabung sering kali jauh lebih mudah diselesaikan daripada metode cakram karena tidak memerlukan inversi fungsi x = g(y)."
        ),
        simId = "sim-integration-techniques",
        formulas = listOf(
            FormulaCard(
                symbol = "\\int u\\, dv",
                equation = "\\int u\\, dv = uv - \\int v\\, du",
                meaning = "Rumus integrasi parsial (Integration by Parts).",
                units = "Nilai integral akumulasi",
                applicationNote = "Sangat ampuh untuk menyelesaikan integral perkalian seperti ∫ x e^x dx atau ∫ x ln(x) dx."
            ),
            FormulaCard(
                symbol = "V_{\\text{kulit}}",
                equation = "V = 2\\pi \\int_a^b x \\cdot f(x)\\, dx",
                meaning = "Volume benda putar metode kulit tabung silinder (rotasi terhadap sumbu-y).",
                units = "satuan volume kubik",
                applicationNote = "x adalah jari-jari tabung, f(x) adalah tinggi silinder, dx adalah ketebalan selongsong."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kalkulasi Profil Kapasitas Tampung Waduk Jatigede Sumedang oleh Ditjen Sumber Daya Air",
            context = "Waduk Jatigede menampung 979 juta meter kubik air Sungai Cimanuk untuk mengairi 90.000 hektar sawah dan menggerakkan PLTA 110 MW.",
            engineeringProblem = "Menghitung kurva hubungan elevasi muka air waduk terhadap volume tampungan efektif (Elevasi-Volume Curve) untuk panduan pelepasan pintu air banjir.",
            physicalConceptUsed = "Integrasi numerik metode Simpson penampang kontur batimetri dan integrasi volume cakram irisan horizontal air waduk.",
            mathematicalModel = "Data sonar kedalaman sungai diintegrasikan terhadap kenaikan ketinggian muka air h; integral V(h) = integral dari 0 ke h A(z) dz menghasilkan kapasitas tampung terverifikasi.",
            realWorldImpact = "Menghindarkan bencana banjir bandang di Indramayu dan Cirebon saat musim hujan serta menjamin suplai air irigasi sepanjang musim kemarau.",
            relatedCareers = listOf("Insinyur Hidrologi Sumber Daya Air", "Analis Batimetri Pemetaan", "Perancang Struktur Bendungan"),
            verifiedSource = "Kementerian Pekerjaan Umum dan Perumahan Rakyat (PUPR) & Balai Besar Wilayah Sungai (BBWS) Cimanuk-Cisanggarung."
        ),
        homeLab = HomeLabData(
            title = "Menghitung Volume Gelas Kaca Melengkung Menggunakan Partisi Irisan Kertas Milimeter",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 buah gelas kaca berbentuk melengkung (seperti gelas piala atau gelas bulat)",
                "Penggaris dan jangka sorong (atau pita ukur meteran kain)",
                "Air putih dan gelas ukur takar dapur bertanda mililiter (mL)",
                "Kertas kalkulasi dan bolpoin"
            ),
            steps = listOf(
                "Langkah 1: Ukur tinggi total gelas kaca (misal: h = 10 cm). Bagi tinggi menjadi 5 irisan cakram setebal delta_h = 2 cm (pada z = 0, 2, 4, 6, 8, 10 cm).",
                "Langkah 2: Ukur keliling gelas di setiap ketinggian z menggunakan pita ukur, lalu hitung jari-jari r(z) = Keliling / (2*pi).",
                "Langkah 3: Hitung volume masing-masing cakram dengan rumus silinder V_i = pi * [r(z)]² * delta_h.",
                "Langkah 4: Jumlahkan seluruh volume irisan (Jumlah Riemann): V_total = V1 + V2 + V3 + V4 + V5.",
                "Langkah 5: Isi gelas dengan air hingga penuh tumpah, lalu tuang ke gelas ukur takar dapur: bandingkan volume air riil dengan hasil kalkulasi integral cakrammu (galat biasanya < 5%)!"
            ),
            observationGoal = "Membuktikan secara langsung bahwa prinsip integrasi Riemann irisan cakram mampu menghitung volume fisik objek melengkung dunia nyata.",
            connectionToSimulation = "Bandingkan irisan cakram gelasmu dengan simulator benda putar di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kalk-int-1",
                prompt = "Berapakah hasil dari integral tentu ∫ (dari 0 ke 1) x · e^x dx dengan menggunakan teknik integrasi parsial?",
                type = "numeric",
                correctAnswer = "1",
                tolerance = 0.05f,
                unit = "nilai integral",
                hints = listOf(
                    "Gunakan integrasi parsial: u = x (maka du = dx) dan dv = e^x dx (maka v = e^x).",
                    "Rumus: ∫ u dv = u·v - ∫ v du = x·e^x - ∫ e^x dx = x·e^x - e^x.",
                    "Evaluasi dari 0 ke 1: [ (1·e¹ - e¹) - (0·e⁰ - e⁰) ] = [ (e - e) - (0 - 1) ] = ...?"
                ),
                explanation = "Dengan u = x dan dv = e^x dx, diperoleh antiderivatif [x·e^x - e^x]. Dievaluasi pada batas x=1 menghasilkan (e - e) = 0. Dievaluasi pada batas x=0 menghasilkan (0 - e⁰) = -1. Maka nilainya = 0 - (-1) = 1.",
                misconception = "Lupa bahwa e pangkat 0 bernilai 1 (bukan 0)."
            ),
            QuizQuestion(
                id = "q-kalk-int-2",
                prompt = "Berdasarkan Teorema Dasar Kalkulus I, jika g(x) = ∫ (dari 2 ke x) [t³ / (1 + t²)] dt, berapakah nilai turunan g'(x)?",
                type = "multiple_choice",
                options = listOf(
                    "x³ / (1 + x²)",
                    "[3x²(1 + x²) - 2x(x³)] / (1 + x²)²",
                    "x³ / (1 + x²) - 8/5",
                    "3x² / (2x)"
                ),
                correctAnswer = "x³ / (1 + x²)",
                hints = listOf(
                    "FTC Bagian 1 menyatakan d/dx [ ∫ (dari a ke x) f(t) dt ] = f(x).",
                    "Cukup gantikan variabel t dengan variabel x secara langsung."
                ),
                explanation = "Menurut Teorema Dasar Kalkulus I, diferensiasi membatalkan integrasi: turunan dari fungsi akumulasi ∫_a^x f(t) dt terhadap x adalah f(x) itu sendiri. Jadi g'(x) = x³ / (1 + x²).",
                misconception = "Mencoba mengintegralkan f(t) terlebih dahulu lalu menurunkannya secara rumit."
            )
        )
    )

    // =========================================================================
    // 4. BARISAN, DERET TAK HINGGA & EKSPANSI TAYLOR
    // =========================================================================
    private val deretTaylorLesson = LessonData(
        conceptId = "mat-kalkulus-deret-taylor",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pm_d1",
                panelNumber = 1,
                title = "Di Balik Tombol Sinus Kalkulator",
                caption = "Dimas menekan tombol sin(0,35) pada kalkulator dan seketika muncul angka 0,3428978.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Chip mikroprosesor kalkulator hanya bisa melakukan operasi aritmetika dasar: tambah, kurang, kali, dan bagi. Bagaimana kalkulator bisa menghitung nilai fungsi trigonometri rumit secepat kilat?",
                sceneVisualEmoji = "💻",
                sceneDescription = "Layar kalkulator menampilkan fungsi sinus dengan representasi sirkuit biner aritmetika."
            ),
            StoryPanel(
                id = "pm_d2",
                panelNumber = 2,
                title = "Keajaiban Polinomial Taylor & Maclaurin",
                caption = "Kakek menuliskan deret suku polinomial tak hingga.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Brook Taylor dan Colin Maclaurin membuktikan bahwa fungsi mulus apa pun bisa dinyatakan sebagai penjumlahan suku polinomial tak hingga: sin(x) = x - x³/3! + x⁵/5! - x⁷/7! + ... Cukup hitung 4 suku pertama, akurasinya sudah 99,9999%!",
                sceneVisualEmoji = "📜",
                sceneDescription = "Kurva polinomial Taylor bertingkat derajat 1, 3, 5, 7 semakin menempel rapat pada kurva sinus."
            ),
            StoryPanel(
                id = "pm_d3",
                panelNumber = 3,
                title = "Uji Konvergensi: Menjamin Jumlah Berhingga",
                caption = "Kirana menguji apakah deret tak hingga meledak ke tak hingga atau memusat ke satu angka.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kita tidak boleh sembarangan menjumlahkan suku tak hingga! Uji Rasio d'Alembert lim |a_(n+1)/a_n| < 1 menjamin deret konvergen mutlak di dalam radius konvergensi R!",
                sceneVisualEmoji = "⚖️",
                sceneDescription = "Uji konvergensi membedakan deret yang stabil memusat dari deret divergen yang meledak liar."
            ),
            StoryPanel(
                id = "pm_d4",
                panelNumber = 4,
                title = "Persamaan Terindah Euler: e^(i*pi) + 1 = 0",
                caption = "Dimas menyatukan deret Taylor eksponen, kosinus, dan sinus.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Saat Leonhard Euler memasukkan bilangan imajiner i ke dalam deret Taylor e^x, ia menemukan rumus ajaib e^(ix) = cos(x) + i sin(x)! Menyandingkan lima konstanta terpenting alam semesta: 0, 1, e, pi, dan i!",
                sceneVisualEmoji = "✨",
                sceneDescription = "Persamaan identitas Euler e^(i*pi) + 1 = 0 berkilau memadukan analisis riil dan kompleks."
            )
        ),
        intuitionTitle = "Aproksimasi Polinomial: Menjinakkan Fungsi Rumit dengan Deret Taylor",
        intuitionBody = "Deret Taylor adalah salah satu pencapaian intelektual terbesar dalam matematika, memungkinkan kita merepresentasikan fungsi transenden rumit (seperti eksponensial, logaritma, dan trigonometri) sebagai suku-suku polinomial tak hingga yang mudah dihitung.\n\n" +
                "1. Barisan & Uji Konvergensi Deret Tak Hingga:\n" +
                "   Deret \${'$'}\\sum_{n=1}^\\infty a_n\${'$'} konvergen ke jumlah \${'$'}S\${'$'} jika barisan jumlah parsial \${'$'}S_k = \\sum_{n=1}^k a_n\${'$'} memiliki limit berhingga saat \${'$'}k \\to \\infty\${'$'}.\n" +
                "   • Uji Divergensi: Jika \${'$'}\\lim_{n \\to \\infty} a_n \\neq 0\${'$'}, deret pasti divergen.\n" +
                "   • Uji Rasio d'Alembert (Sangat berguna untuk faktorial dan eksponen):\n" +
                "     \${'$'}\${'$'}L = \\lim_{n \\to \\infty} \\left| \\frac{a_{n+1}}{a_n} \\right|\${'$'}\${'$'}\n" +
                "     - Jika \${'$'}L < 1\${'$'}: Konvergen mutlak.\n" +
                "     - Jika \${'$'}L > 1\${'$'}: Divergen.\n" +
                "     - Jika \${'$'}L = 1\${'$'}: Uji tidak dapat disimpulkan (butuh uji lain).\n" +
                "   • Uji Deret Berganti Tanda (Leibniz): Deret \${'$'}\\sum (-1)^{n-1} b_n\${'$'} konvergen jika \${'$'}b_{n+1} \\le b_n\${'$'} dan \${'$'}\\lim b_n = 0\${'$'}.\n\n" +
                "2. Deret Kuasa & Jari-Jari Konvergensi:\n" +
                "   Deret berbentuk \${'$'}\\sum_{n=0}^\\infty c_n (x - a)^n\${'$'} konvergen pada interval \${'$'}|x - a| < R\${'$'}, di mana \${'$'}R\${'$'} adalah Jari-jari Konvergensi (\${'$'}R = 1/L\${'$'}).\n\n" +
                "3. Rumus Deret Taylor & Maclaurin:\n" +
                "   Jika fungsi \${'$'}f\${'$'} memiliki turunan di semua tingkat di sekitar titik pusat \${'$'}a\${'$'}, maka:\n" +
                "   \${'$'}\${'$'}f(x) = \\sum_{n=0}^\\infty \\frac{f^{(n)}(a)}{n!} (x - a)^n = f(a) + f'(a)(x-a) + \\frac{f''(a)}{2!}(x-a)^2 + \\frac{f'''(a)}{3!}(x-a)^3 + \\dots\${'$'}\${'$'}\n" +
                "   *Deret Maclaurin* adalah deret Taylor dengan pusat titik nol (\${'$'}a = 0\${'$'}):\n" +
                "   • \${'$'}e^x = 1 + x + \\frac{x^2}{2!} + \\frac{x^3}{3!} + \\dots = \\sum_{n=0}^\\infty \\frac{x^n}{n!} \\quad (R = \\infty)\${'$'}\n" +
                "   • \${'$'}\\sin x = x - \\frac{x^3}{3!} + \\frac{x^5}{5!} - \\frac{x^7}{7!} + \\dots = \\sum_{n=0}^\\infty (-1)^n \\frac{x^{2n+1}}{(2n+1)!} \\quad (R = \\infty)\${'$'}\n" +
                "   • \${'$'}\\cos x = 1 - \\frac{x^2}{2!} + \\frac{x^4}{4!} - \\frac{x^6}{6!} + \\dots = \\sum_{n=0}^\\infty (-1)^n \\frac{x^{2n}}{(2n)!} \\quad (R = \\infty)\${'$'}\n" +
                "   • \${'$'}\\frac{1}{1 - x} = 1 + x + x^2 + x^3 + \\dots \\quad (|x| < 1)\${'$'}",
        intuitionPoints = listOf(
            "Teorema Sisa Taylor Lagrange (Taylor's Remainder Theorem) memberikan batas galat mutlak |R_n(x)| saat polinomial dipotong pada derajat n, esensial untuk perhitungan komputasi berakurasi tinggi.",
            "Deret Taylor adalah dasar metode numerik Runge-Kutta (RK4) untuk menyelesaikan persamaan diferensial gerak satelit antariksa dan simulasi cuaca BMKG.",
            "Identitas Euler e^(i*pi) + 1 = 0 diperoleh secara langsung dari substitusi x = pi ke dalam rumus e^(ix) = cos(x) + i sin(x)."
        ),
        simId = "sim-taylor-series",
        formulas = listOf(
            FormulaCard(
                symbol = "f(x)",
                equation = "f(x) = \\sum_{n=0}^\\infty \\frac{f^{(n)}(a)}{n!} (x - a)^n",
                meaning = "Ekspansi deret Taylor fungsi analitik f(x) di sekitar titik pusat x = a.",
                units = "Deret polinomial tak hingga",
                applicationNote = "Suku ke-n melibatkan turunan ke-n f^(n)(a) dibagi n faktorial."
            ),
            FormulaCard(
                symbol = "L_{\\text{rasio}}",
                equation = "L = \\lim_{n \\to \\infty} \\left| \\frac{a_{n+1}}{a_n} \\right| < 1",
                meaning = "Uji rasio d'Alembert untuk konvergensi mutlak deret tak hingga.",
                units = "Kriteria konvergensi",
                applicationNote = "Jika L < 1 maka deret pasti konvergen; jari-jari konvergensi R = 1 / L."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Aproksimasi Polinomial Taylor pada Komputer Avionik Pesawat N219 PT Dirgantara Indonesia",
            context = "Sistem kendali terbang digital (Fly-by-Wire) pesawat N219 buatan Bandung harus mengeksekusi kalkulasi trigonometri aerodinamika ribuan kali per detik secara real-time.",
            engineeringProblem = "Instruksi matematika floating-point sinus dan kosinus perangkat keras membutuhkan waktu komputasi terlalu lama jika dihitung via pendekatan geometris murni.",
            physicalConceptUsed = "Penggunaan Polinomial Taylor derajat 5 (T5(x) = x - x³/6 + x⁵/120) teroptimasi tabel CORDIC yang diprogram langsung pada mikroprosesor avionik RTOS.",
            mathematicalModel = "Analisis batas sisa galat Lagrange membuktikan untuk sudut serang aerodinamika |x| < 0,5 radian, galat aproksimasi kurang dari 10⁻⁷, jauh di bawah batas toleransi keselamatan penerbangan.",
            realWorldImpact = "Menjamin respon kendali autopilot stabil seketika dalam menghadapi turbulensi cuaca tropis ekstrem pegunungan Papua.",
            relatedCareers = listOf("Insinyur Perangkat Lunak Avionik", "Spesialis Komputasi Sistem Tertanam", "Matematikawan Algoritma Numerik"),
            verifiedSource = "PT Dirgantara Indonesia (PTDI) Bandung & Pusat Riset Teknologi Penerbangan BRIN."
        ),
        homeLab = HomeLabData(
            title = "Menghitung Nilai Konstanta e Menggunakan Deret Maclaurin pada Spreadsheet",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Komputer / smartphone dengan aplikasi spreadsheet (Microsoft Excel / Google Sheets)",
                "Kalkulator smartphone untuk pembanding"
            ),
            steps = listOf(
                "Langkah 1: Buka lembar kerja spreadsheet baru. Buat Kolom A untuk nilai suku n (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10).",
                "Langkah 2: Di Kolom B, buat rumus faktorial: B2 = FAKTORIAL(A2) atau FACT(A2).",
                "Langkah 3: Di Kolom C, hitung suku deret: C2 = 1 / B2. Suku pertama adalah 1/0! = 1, suku kedua 1/1! = 1, suku ketiga 1/2! = 0,5, suku keempat 1/6! = 0,166667, dst.",
                "Langkah 4: Di Kolom D, buat akumulasi jumlah parsial: D2 = C2, D3 = D2 + C3, lalu salin ke bawah.",
                "Langkah 5: Perhatikan pada baris n = 8: nilai akumulasi sudah mencapai 2,71827877... Cocokkan dengan nilai sejati e = 2,718281828...: akurat hingga 5 angka desimal hanya dengan 8 suku pertama!"
            ),
            observationGoal = "Membuktikan secara empiris kecepatan konvergensi deret faktorial Taylor dalam memprediksi konstanta fundamental alam.",
            connectionToSimulation = "Bandingkan suku-suku spreadsheetmu dengan grafik deret Taylor interaktif di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kalk-der-1",
                prompt = "Berapakah koefisien dari suku x² pada ekspansi deret Maclaurin untuk fungsi f(x) = e^(3x)?",
                type = "numeric",
                correctAnswer = "4.5",
                tolerance = 0.05f,
                unit = "koefisien",
                hints = listOf(
                    "Deret dasar: e^u = 1 + u + u²/2! + ...",
                    "Gantikan u dengan (3x).",
                    "Suku berderajat 2 adalah (3x)² / 2! = 9x² / 2 = ...?"
                ),
                explanation = "Ekspansi deret Maclaurin untuk e^u adalah 1 + u + u²/2! + ... Dengan u = 3x, suku kedua adalah (3x)² / 2! = 9x² / 2 = 4,5 x². Jadi koefisiennya adalah 4,5.",
                misconception = "Lupa membagi dengan 2! sehingga menjawab 9 alih-alih 4,5."
            ),
            QuizQuestion(
                id = "q-kalk-der-2",
                prompt = "Suatu deret kuasa tak hingga dinyatakan oleh rumus sum [ (x - 2)^n / (3^n * n) ]. Berapakah nilai jari-jari konvergensi (R) dari deret kuasa tersebut?",
                type = "numeric",
                correctAnswer = "3",
                tolerance = 0.05f,
                unit = "jari-jari R",
                hints = listOf(
                    "Gunakan uji rasio: L = lim |a_(n+1) / a_n|.",
                    "L = lim | (x-2)^(n+1) / (3^(n+1)*(n+1)) * (3^n * n) / (x-2)^n | = |x - 2| / 3 * lim [n/(n+1)] = |x - 2| / 3.",
                    "Agar konvergen mutlak, kita butuh L < 1, yaitu |x - 2| / 3 < 1, sehingga |x - 2| < ...?"
                ),
                explanation = "Berdasarkan uji rasio d'Alembert, rasio suku berurutan memberikan |x - 2| / 3 < 1, yang menghasilkan |x - 2| < 3. Jadi jari-jari konvergensi R = 3 (interval konvergensi terpusat di x = 2 dengan lebar radius 3).",
                misconception = "Menjawab R = 1/3 karena terbalik meletakkan penyebut 3^n."
            )
        )
    )

    // =========================================================================
    // 5. TURUNAN PARSIAL, GRADIEN & INTEGRAL LIPAT
    // =========================================================================
    private val multivariabelLesson = LessonData(
        conceptId = "mat-kalkulus-multivariabel",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pm_m1",
                panelNumber = 1,
                title = "Mendaki Gunung Merapi & Garis Kontur",
                caption = "Dimas dan Kirana mempelajari peta topografi lereng Gunung Merapi sebelum memulai ekspedisi geologi.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Peta kontur ini menunjukkan ketinggian z sebagai fungsi dari posisi bujur (x) dan lintang (y): z = f(x, y). Ke arah manakah kita harus melangkah agar menanjak paling curam?",
                sceneVisualEmoji = "🌋",
                sceneDescription = "Peta topografi kontur melingkar lereng Gunung Merapi dengan kurva ketinggian rapat."
            ),
            StoryPanel(
                id = "pm_m2",
                panelNumber = 2,
                title = "Vektor Gradien Menunjuk Tanjakan Tercuram",
                caption = "Kakek menjelaskan konsep operator del gradien multivariabel.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Vektor Gradien ∇f = (∂f/∂x, ∂f/∂y) selalu menunjuk tepat ke arah tanjakan paling curam, dan tegak lurus sempurna terhadap garis kontur datar ketinggian!",
                sceneVisualEmoji = "🧭",
                sceneDescription = "Anak panah vektor gradien menunjuk tegak lurus melintasi garis-garis kontur ketinggian."
            ),
            StoryPanel(
                id = "pm_m3",
                panelNumber = 3,
                title = "Pengali Lagrange: Optimasi Berkendala",
                caption = "Kirana memecahkan masalah efisiensi biaya produksi kaleng minuman silinder.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kita ingin meminimalkan luas bahan kaleng f(r, h) dengan syarat volume g(r, h) = 330 mL! Di titik optimum berkendala, gradien fungsi tujuan sejajar dengan gradien fungsi kendala: ∇f = λ ∇g!",
                sceneVisualEmoji = "🥫",
                sceneDescription = "Kaleng silinder dengan vektor normal gradien yang bersinggungan di titik ekstrem optimum."
            ),
            StoryPanel(
                id = "pm_m4",
                panelNumber = 4,
                title = "Integral Lipat: Menghitung Massa Bumi",
                caption = "Dimas mengintegrasikan massa benda pejal 3 dimensi.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Untuk benda pejal yang kerapatan massanya bervariasi, kita gunakan Integral Lipat Tiga ∭ ρ(x,y,z) dV dalam koordinat bola! Matematika multivariabel memungkinkan kita memodelkan seluruh alam semesta!",
                sceneVisualEmoji = "🌐",
                sceneDescription = "Elemen volume diferensial dV dalam koordinat bola (rho, phi, theta) membelah bola bumi."
            )
        ),
        intuitionTitle = "Dunia Nyata Berdimensi Banyak: Kalkulus Diferensial & Integral Multivariabel",
        intuitionBody = "Di dunia nyata, hampir tidak ada fenomena yang hanya bergantung pada satu variabel tunggal; suhu ruangan bergantung pada koordinat ruang $(x, y, z)$ dan waktu \${'$'}t\${'$'}, keuntungan ekonomi bergantung pada harga dan biaya produksi.\n\n" +
                "1. Turunan Parsial & Bidang Singgung:\n" +
                "   Untuk fungsi \${'$'}z = f(x, y)$, turunan parsial $\\frac{\\partial f}{\\partial x}$ mengukur laju perubahan \${'$'}z$ terhadap \${'$'}x$ dengan MENGANGGAP \${'$'}y$ SEBAGAI KONSTANTA tetap.\n" +
                "   • Persamaan Bidang Singgung di titik $(x_0, y_0, z_0)$:\n" +
                "     \${'$'}\${'$'}z - z_0 = f_x(x_0, y_0)(x - x_0) + f_y(x_0, y_0)(y - y_0)\${'$'}\${'$'}\n\n" +
                "2. Vektor Gradien & Turunan Berarah:\n" +
                "   Vektor gradien adalah vektor turunan parsial:\n" +
                "   $$\\nabla f(x, y) = \\left( \\frac{\\partial f}{\\partial x}, \\; \\frac{\\partial f}{\\partial y} \\right)$$\n" +
                "   • Properti Utama Gradien:\n" +
                "     1. Gradien menunjuk ke arah laju peningkatan nilai fungsi TERCEPAT (tanjakan tercuram).\n" +
                "     2. Besar magnitudo $\\|\\nabla f\\|$ adalah laju peningkatan maksimum tersebut.\n" +
                "     3. Vektor gradien selalu ortogonal (tegak lurus) terhadap kurva ketinggian (*level curve* / garis kontur \${'$'}f(x, y) = k$).\n\n" +
                "3. Optimasi Berkendala: Metode Pengali Lagrange (*Lagrange Multipliers*):\n" +
                "   Untuk mencari nilai maksimum atau minimum dari fungsi \${'$'}f(x, y)$ dengan kendala kurva \${'$'}g(x, y) = k$, selesaikan sistem persamaan:\n" +
                "   $$\\nabla f = \\lambda \\nabla g \\quad \\text{dan} \\quad g(x, y) = k$$\n" +
                "   di mana $\\lambda$ adalah skalar pengali Lagrange.\n\n" +
                "4. Integral Lipat Dua & Tiga:\n" +
                "   • Integral Lipat Dua (Luas & Volume di bawah permukaan): $\\iint_R f(x, y)\\, dA$.\n" +
                "     - Dalam koordinat polar: \${'$'}dA = r\\, dr\\, d\\theta$.\n" +
                "   • Integral Lipat Tiga (Massa & Pusat Massa): $\\iiint_E f(x, y, z)\\, dV$.\n" +
                "     - Dalam koordinat silinder: \${'$'}dV = r\\, dr\\, d\\theta\\, dz$.\n" +
                "     - Dalam koordinat bola: \${'$'}dV = \\rho^2 \\sin\\phi\\, d\\rho\\, d\\phi\\, d\\theta$.",
        intuitionPoints = listOf(
            "Mengapa faktor diferensial polar memuat pengali r (dA = r dr dθ)? Karena semakin jauh dari pusat (r besar), panjang busur lingkaran semakin melebar sebanding r!",
            "Metode Gradient Descent dalam kecerdasan buatan (Machine Learning) bekerja melangkah menuruni gradien negatif (-∇f) dari fungsi kerugian (Loss Function) untuk melatih model AI.",
            "Uji Turunan Kedua untuk fungsi dua variabel menggunakan Determinan Hessian D = f_xx * f_yy - (f_xy)²: jika D > 0 dan f_xx > 0 titik minimum; jika D < 0 titik pelana (saddle point)."
        ),
        simId = "sim-multivariable",
        formulas = listOf(
            FormulaCard(
                symbol = "\\nabla f",
                equation = "\\nabla f = \\left( \\frac{\\partial f}{\\partial x}, \\; \\frac{\\partial f}{\\partial y}, \\; \\frac{\\partial f}{\\partial z} \\right)",
                meaning = "Vektor gradien operator del penunjuk arah laju perubahan maksimum.",
                units = "vektor gradien turunan spasial",
                applicationNote = "Arah tanjakan tercuram selalu searah ∇f; turunan berarah pada arah vektor satuan u adalah Du f = ∇f · u."
            ),
            FormulaCard(
                symbol = "\\text{Pengali Lagrange}",
                equation = "\\nabla f = \\lambda \\nabla g \\quad \\text{dengan kendala } g(\\mathbf{x}) = k",
                meaning = "Metode penentuan titik optimum fungsi dengan kendala kesetaraan.",
                units = "Sistem persamaan vektor multivariabel",
                applicationNote = "Di titik optimum berkendala, kontur fungsi tujuan bersinggungan mulus dengan kurva kendala."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemetaan Potensi Ladang Angin Pesisir Pandansimo Bantul Menggunakan Vektor Gradien Medan Kontur",
            context = "Pembangkit Listrik Tenaga Bayu (PLTB) di pesisir selatan Yogyakarta memerlukan penempatan turbin angin pada titik kecepatan angin mikro-spasial tertinggi.",
            engineeringProblem = "Variasi bukit pasir gumuk pasir dan garis pantai menciptakan gradien kecepatan angin non-linear yang sangat bervariasi antar-titik koordinat.",
            physicalConceptUsed = "Analisis medan potensial kecepatan angin v(x, y): perhitungan turunan parsial spasial dan vektor gradien kemiringan tekanan udara delta_P(x,y).",
            mathematicalModel = "Mengintegrasikan fungsi densitas daya angin menggunakan integral lipat dua pada area sapuan rotor turbin wind farm seluas 5 km² untuk menentukan koordinat instalasi optimum.",
            realWorldImpact = "Meningkatkan produksi energi listrik tahunan sebesar 22% dan memperpanjang umur kelelahan mekanik bilah turbin angin akibat turbulensi geser.",
            relatedCareers = listOf("Insinyur Energi Terbarukan", "Analis Meteorologi Spasial", "Matematikawan Pemodelan GIS"),
            verifiedSource = "Pusat Riset Teknologi Hidrodinamika BRIN & Dinas ESDM DIY."
        ),
        homeLab = HomeLabData(
            title = "Membuat Peta Topografi Garis Kontur & Vektor Gradien pada Umbi Kentang Rebus",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 buah kentang/ubi berukuran besar dan lonjong tidak simetris",
                "Spidol permanen tahan air",
                "Baskom datar berisi air dangkal",
                "Penggaris dan bolpoin",
                "Kertas grafik milimeter blok"
            ),
            steps = listOf(
                "Langkah 1: Letakkan kentang tegak mendatar di dalam baskom. Tuangkan air setinggi 1 cm.",
                "Langkah 2: Gunakan spidol untuk menggambar garis melingkari kentang tepat pada garis batas permukaan air (Garis Kontur Ketinggian 1 cm).",
                "Langkah 3: Tambahkan air lagi hingga tinggi air 2 cm, lalu gambar garis melingkar lagi (Garis Kontur 2 cm). Ulangi pada tinggi 3 cm, 4 cm, dan puncak kentang.",
                "Langkah 4: Angkat kentang dan amati dari atas: di sisi kentang yang curam, garis-garis kontur saling merapat berdekatan; di sisi yang landai, garis kontur berjauhan!",
                "Langkah 5: Gambar tanda panah pendek dari garis kontur 2 cm menuju 3 cm yang tegak lurus memotong garis: itulah visualisasi Vektor Gradien ∇f penunjuk arah tanjakan tercuram!"
            ),
            observationGoal = "Memvisualisasikan secara konkret hubungan geometris antara kurva ketinggian fungsi multivariabel dan arah vektor gradien tegak lurus.",
            connectionToSimulation = "Bandingkan kontur kentangmu dengan permukaan 3D interaktif pada simulator multivariabel di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kalk-multi-1",
                prompt = "Diberikan fungsi skalar f(x, y) = 3x²y + 2y³. Berapakah vektor gradien ∇f pada titik koordinat (1, 2)?",
                type = "multiple_choice",
                options = listOf(
                    "(12, 27)",
                    "(6, 24)",
                    "(12, 12)",
                    "(27, 12)"
                ),
                correctAnswer = "(12, 27)",
                hints = listOf(
                    "Turunan parsial terhadap x: ∂f/∂x = 6xy.",
                    "Turunan parsial terhadap y: ∂f/∂y = 3x² + 6y².",
                    "Substitusikan x = 1 dan y = 2.",
                    "∂f/∂x = 6(1)(2) = 12. ∂f/∂y = 3(1)² + 6(2)² = 3 + 24 = 27."
                ),
                explanation = "Turunan parsial ∂f/∂x = 6xy. Pada titik (1, 2), nilainya = 6(1)(2) = 12. Turunan parsial ∂f/∂y = 3x² + 6y². Pada titik (1, 2), nilainya = 3(1)² + 6(2)² = 3 + 24 = 27. Jadi vektor gradien ∇f(1, 2) = (12, 27).",
                misconception = "Lupa menganggap x sebagai konstanta saat menurunkan terhadap y."
            ),
            QuizQuestion(
                id = "q-kalk-multi-2",
                prompt = "Pada pengubahan integral lipat dua dari koordinat Kartesius ke koordinat polar, elemen diferensial luas dA = dx dy berubah menjadi...",
                type = "multiple_choice",
                options = listOf(
                    "r dr dθ",
                    "dr dθ",
                    "r² dr dθ",
                    "dr / r dθ"
                ),
                correctAnswer = "r dr dθ",
                hints = listOf(
                    "Faktor pengali jacobian determinan transformasi polar adalah r.",
                    "Elemen luas polar berbentuk potongan juring kecil r · dθ dikalikan dr."
                ),
                explanation = "Dalam transformasi koordinat Kartesius ke polar (x = r cos θ, y = r sin θ), determinan matriks Jacobian bernilai J = r. Oleh karena itu, elemen diferensial luas dA = dx dy bertransformasi menjadi r dr dθ.",
                misconception = "Lupa menyertakan faktor pengali jacobian r."
            )
        )
    )

    // =========================================================================
    // 6. KALKULUS VEKTOR: TEOREMA GREEN, STOKES & GAUSS
    // =========================================================================
    private val kalkulusVektorLesson = LessonData(
        conceptId = "mat-kalkulus-vektor",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pm_v1",
                panelNumber = 1,
                title = "Aliran Arus Pintu Air Manggarai Jakarta",
                caption = "Dimas dan Kirana mengamati pusaran air sungai Ciliwung di Pintu Air Manggarai Jakarta Pusat.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Air mengalir deras dengan kecepatan berbeda di setiap titik, bahkan membentuk pusaran berputar di tepi pilar beton. Bagaimana memodelkan fluida yang mengalir dan berputar ini secara matematis?",
                sceneVisualEmoji = "🌊",
                sceneDescription = "Aliran air sungai melintasi pintu air bendung dengan vektor kecepatan yang berpusar."
            ),
            StoryPanel(
                id = "pm_v2",
                panelNumber = 2,
                title = "Dua Karakter Medan: Divergensi & Curl",
                caption = "Profesor memperkenalkan dua operasi diferensial vektor utama.",
                dialogueSpeaker = "Profesor",
                dialogueText = "Divergensi (∇ · F) mengukur laju pemuaian massa atau kebocoran sumber fluida di suatu titik! Sedangkan Curl (∇ × F) mengukur kecenderungan partikel untuk berotasi atau berpusar mengelilingi sumbu!",
                sceneVisualEmoji = "🌪️",
                sceneDescription = "Diagram vektor memancar keluar (divergensi positif) dan vektor melingkar berputar (curl)."
            ),
            StoryPanel(
                id = "pm_v3",
                panelNumber = 3,
                title = "Teorema Green & Teorema Stokes",
                caption = "Kirana menghubungkan integral garis kurva tertutup dengan integral permukaan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Teorema Green dan Stokes adalah jembatan ajaib! Alih-alih menghitung sirkulasi rumit di sepanjang garis batas keliling C, kita cukup menghitung integral fluks Curl melintasi seluruh permukaan di dalamnya!",
                sceneVisualEmoji = "🔄",
                sceneDescription = "Kurva tertutup melingkari permukaan berorientasi memperlihatkan sirkulasi Stokes."
            ),
            StoryPanel(
                id = "pm_v4",
                panelNumber = 4,
                title = "Teorema Divergensi Gauss: Segel Fluks Volume",
                caption = "Dimas merangkum teorema pamungkas kalkulus vektor.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Total fluks medan vektor yang keluar menembus seluruh kulit permukaan tertutup sama persis dengan total penjumlahan divergensi di dalam seluruh isi volumenya! Teorema Gauss ini menjadi pondasi seluruh hukum elektromagnetik!",
                sceneVisualEmoji = "🌐",
                sceneDescription = "Permukaan tertutup melingkupi volume pejal dengan panah fluks medan menembus keluar."
            )
        ),
        intuitionTitle = "Simfoni Kalkulus Vektor: Menyatukan Medan, Sirkulasi & Fluks Ruang Tiga Dimensi",
        intuitionBody = "Kalkulus vektor adalah puncak dari kalkulus analitis perguruan tinggi, menyediakan bahasa matematika fundamental untuk mendeskripsikan hidrodinamika fluida, gravitasi antariksa, dan teori medan elektromagnetik Maxwell.\n\n" +
                "1. Medan Vektor & Operator Del (∇):\n" +
                "   Medan vektor di $\\mathbb{R}^3$ didefinisikan sebagai $\\mathbf{F}(x, y, z) = P\\,\\mathbf{i} + Q\\,\\mathbf{j} + R\\,\\mathbf{k}$.\n" +
                "   • Divergensi (Fluks per satuan volume / Skalar):\n" +
                "     $$\\nabla \\cdot \\mathbf{F} = \\frac{\\partial P}{\\partial x} + \\frac{\\partial Q}{\\partial y} + \\frac{\\partial R}{\\partial z}$$\n" +
                "     - $\\nabla \\cdot \\mathbf{F} > 0$: Titik bertindak sebagai Sumber (*Source* / memancar keluar).\n" +
                "     - $\\nabla \\cdot \\mathbf{F} < 0$: Titik bertindak sebagai Muara (*Sink* / menyerap ke dalam).\n" +
                "     - $\\nabla \\cdot \\mathbf{F} = 0$: Medan Solenoidal (tak termampatkan / inkompresibel).\n" +
                "   • Curl / Rotasi (Sirkulasi per satuan luas / Vektor):\n" +
                "     $$\\nabla \\times \\mathbf{F} = \\det \\begin{pmatrix} \\mathbf{i} & \\mathbf{j} & \\mathbf{k} \\\\ \\frac{\\partial}{\\partial x} & \\frac{\\partial}{\\partial y} & \\frac{\\partial}{\\partial z} \\\\ P & Q & R \\end{pmatrix}$$\n" +
                "     - $\\nabla \\times \\mathbf{F} = \\mathbf{0}$: Medan Irotasional (Konservatif $\\mathbf{F} = \\nabla \\phi$).\n\n" +
                "2. Tiga Teorema Integral Fundamental Kalkulus Vektor:\n" +
                "   • Teorema Green (Bidang 2 Dimensi):\n" +
                "     Menghubungkan integral garis tertutup $\\oint_C$ dengan integral lipat dua area \${'$'}D$:\n" +
                "     $$\\oint_C (P\\, dx + Q\\, dy) = \\iint_D \\left( \\frac{\\partial Q}{\\partial x} - \\frac{\\partial P}{\\partial y} \\right) dA$$\n" +
                "   • Teorema Stokes (Permukaan 3 Dimensi Terbuka):\n" +
                "     Sirkulasi medan di sepanjang kurva batas tertutup \${'$'}C = \\partial S$ sama dengan fluks curl menembus permukaan \${'$'}S$:\n" +
                "     $$\\oint_C \\mathbf{F} \\cdot d\\mathbf{r} = \\iint_S (\\nabla \\times \\mathbf{F}) \\cdot d\\mathbf{S}$$\n" +
                "   • Teorema Divergensi Gauss (Permukaan 3 Dimensi Tertutup Melingkupi Volume):\n" +
                "     Fluks total yang keluar menembus kulit tertutup \${'$'}S = \\partial V$ sama dengan integral volume divergensi di dalam \${'$'}V$:\n" +
                "     $$\\oiint_S \\mathbf{F} \\cdot d\\mathbf{S} = \\iiint_V (\\nabla \\cdot \\mathbf{F})\\, dV$$",
        intuitionPoints = listOf(
            "Teorema Dasar Kalkulus, Teorema Green, Teorema Stokes, dan Teorema Gauss semuanya adalah kasus khusus dari satu teorema universal tunggal: Teorema Stokes Umum untuk Bentuk Diferensial (∫_∂Ω ω = ∫_Ω dω)!",
            "Jika medan gaya konservatif (curl nol), maka usaha kerja sepanjang lintasan tertutup selalu bernilai nol (∮ F · dr = 0), dan usaha antara dua titik bebas dari bentuk lintasan (hanya bergantung titik awal dan akhir).",
            "Hukum Gauss untuk elektrostatik (fluks listrik = muatan netto / ε0) adalah aplikasi langsung dari Teorema Divergensi Gauss pada medan gaya kuadrat terbalik Coulomb."
        ),
        simId = "sim-vector-calculus",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Teorema Gauss}",
                equation = "\\oiint_S \\mathbf{F} \\cdot d\\mathbf{S} = \\iiint_V (\\nabla \\cdot \\mathbf{F})\\, dV",
                meaning = "Teorema Divergensi Gauss menghubungkan fluks permukaan tertutup dengan divergensi volume.",
                units = "Fluks medan total",
                applicationNote = "Mengubah integral permukaan 2D yang rumit menjadi integral volume 3D yang sering kali simetris dan mudah dievaluasi."
            ),
            FormulaCard(
                symbol = "\\text{Teorema Stokes}",
                equation = "\\oint_C \\mathbf{F} \\cdot d\\mathbf{r} = \\iint_S (\\nabla \\times \\mathbf{F}) \\cdot d\\mathbf{S}",
                meaning = "Teorema Stokes menghubungkan sirkulasi garis tertutup dengan fluks curl pada permukaan.",
                units = "Sirkulasi kerja vektor",
                applicationNote = "C adalah kurva batas tertutup yang membatasi orientasi permukaan S."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemodelan Debit Aliran Air dan Pusaran Hidrolik di Pintu Air Manggarai Jakarta",
            context = "Pintu Air Manggarai bertindak sebagai pengendali utama debit banjir Sungai Ciliwung menuju Kanal Banjir Barat Jakarta dengan kapasitas alir 500 m³/detik.",
            engineeringProblem = "Pusaran air (vortex) di sekitar pilar beton pintu air berpotensi menimbulkan erosi gerusan dasar sungai (scouring) yang melemahkan pondasi struktur.",
            physicalConceptUsed = "Kalkulus vektor fluida: perhitungan medan kecepatan v(x,y,z), analisis vortisitas curl (∇ × v) pusaran di pilar, dan perhitungan fluks debit netto menggunakan Teorema Divergensi Gauss.",
            mathematicalModel = "Persamaan kontinuitas fluida inkompresibel (∇ · v = 0) diverifikasi dengan sensor Acoustic Doppler Current Profiler (ADCP) untuk mendeteksi deviasi debit aktual.",
            realWorldImpact = "Mengoptimalkan pembukaan 3 pintu hidrolik otomatis secara bertahap, mencegah gerusan pondasi bendung dan menyelamatkan kawasan pusat bisnis Jakarta dari luapan banjir.",
            relatedCareers = listOf("Insinyur Hidro-Mekanikal Pintu Air", "Pemodel Aliran Sungai DAS", "Peneliti Dinamika Fluida Geofisika"),
            verifiedSource = "Balai Besar Wilayah Sungai Ciliwung-Cisadane (BBWSCC) & Dinas Sumber Daya Air DKI Jakarta."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Pusaran Vektor Curl Menggunakan Pelampung Kertas di Air Berputar",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Wastafel atau ember berisi air penuh dengan lubang pembuangan di dasar",
                "Kertas karton kecil yang dipotong membentuk baling-baling plus (+) berukuran 2 cm",
                "1 buah tusuk gigi yang ditancapkan tegak di tengah baling-baling kertas sebagai poros indikator",
                "Sendok pengaduk"
            ),
            steps = listOf(
                "Langkah 1: Isi ember dengan air tenang, lalu buka sumbat pembuangan bawah sehingga air mulai mengalir keluar membentuk pusaran berputar alami.",
                "Langkah 2: Letakkan baling-baling kertas plus (+) mengapung di permukaan air di dekat pusaran.",
                "Langkah 3: Amati gerakannya: baling-baling kertas tidak hanya hanyut bergerak melingkar (translasi), tetapi juga BERPUTAR PADA POROSNYA SENDIRI!",
                "Langkah 4: Perputaran baling-baling pada porosnya sendiri membuktikan secara visual bahwa medan kecepatan air memiliki nilai Rotasi / Curl (∇ × v) yang tidak nol!",
                "Langkah 5: Bandingkan jika air dialirkan lurus tenang: pelampung bergerak lurus tanpa berputar pada porosnya (Curl = 0 / aliran irotasional)!"
            ),
            observationGoal = "Memahami secara fisik perbedaan antara gerak translasi medan vektor dan komponen rotasi lokal (Curl).",
            connectionToSimulation = "Bandingkan pusaran airmu dengan simulator medan vektor divergensi dan curl di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kalk-vek-1",
                prompt = "Diberikan medan vektor F(x, y, z) = (2x) i + (3y) j + (5z) k. Berapakah nilai divergensi (∇ · F) dari medan vektor tersebut di sembarang titik?",
                type = "numeric",
                correctAnswer = "10",
                tolerance = 0.1f,
                unit = "nilai divergensi",
                hints = listOf(
                    "Divergensi dihitung dengan rumus: ∇ · F = ∂P/∂x + ∂Q/∂y + ∂R/∂z.",
                    "∂(2x)/∂x = 2.",
                    "∂(3y)/∂y = 3.",
                    "∂(5z)/∂z = 5.",
                    "Jumlahkan: 2 + 3 + 5 = ...?"
                ),
                explanation = "Divergensi dihitung dengan menjumlahkan turunan parsial komponennya: ∇ · F = ∂(2x)/∂x + ∂(3y)/∂y + ∂(5z)/∂z = 2 + 3 + 5 = 10. Nilai konstan positif ini menunjukkan bahwa medan bertindak sebagai sumber pemancar di seluruh ruang.",
                misconception = "Menghitung hasil kali silang vektor alih-alih hasil kali titik skalar diferensial."
            ),
            QuizQuestion(
                id = "q-kalk-vek-2",
                prompt = "Teorema kalkulus vektor yang menyatakan bahwa fluks medan vektor total yang menembus suatu permukaan tertutup sama dengan integral lipat tiga dari divergensi medan tersebut di dalam seluruh volume yang dilingkupinya adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Teorema Divergensi Gauss",
                    "Teorema Stokes",
                    "Teorema Green",
                    "Teorema Dasar Kalkulus"
                ),
                correctAnswer = "Teorema Divergensi Gauss",
                hints = listOf(
                    "Melibatkan permukaan tertutup yang membatasi volume 3D pejal.",
                    "Mengubah integral permukaan menjadi integral divergensi volume."
                ),
                explanation = "Teorema Divergensi Gauss menyatakan bahwa integral permukaan tertutup ∬_S F · dS sama dengan integral volume ∭_V (∇ · F) dV untuk volume V yang dilingkupi oleh kulit permukaan tertutup S.",
                misconception = "Menyamakan dengan Teorema Stokes (Teorema Stokes menghubungkan sirkulasi garis tertutup dengan fluks curl pada permukaan terbuka)."
            )
        )
    )
}

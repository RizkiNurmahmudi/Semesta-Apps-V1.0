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

object PhysicsLevel4Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "fis-mekanika-vektor",
            domain = Domain.FISIKA,
            topic = "Mekanika Analitis Dasar",
            title = "Mekanika Klasik Vektor & Gaya Hambat Fluida",
            description = "Kinematika dan dinamika partikel berbasis kalkulus vektor, koordinat Kartesius dan polar, serta gerak partikel dengan gaya hambat fluida.",
            level = DepthLevel.L4,
            estMinutes = 20,
            prerequisites = listOf("fis-newton", "mat-kalkulus-turunan-lanjut")
        ),
        ConceptItem(
            id = "fis-kerja-energi-potensial",
            domain = Domain.FISIKA,
            topic = "Mekanika Analitis Dasar",
            title = "Medan Gaya Konservatif & Analisis Kurva Potensial",
            description = "Kerja sebagai integral garis medan vektor, gaya konservatif sebagai gradien potensial, analisis ekuilibrium kurva U(x), dan aproksimasi osilasi harmonik.",
            level = DepthLevel.L4,
            estMinutes = 20,
            prerequisites = listOf("fis-mekanika-vektor")
        ),
        ConceptItem(
            id = "fis-sistem-partikel-momentum",
            domain = Domain.FISIKA,
            topic = "Mekanika Sistem",
            title = "Sistem Partikel, Pusat Massa & Persamaan Roket",
            description = "Pusat massa distribusi kontinu, torsi eksternal dan momentum sudut sistem, serta dinamika massa variabel persamaan roket Tsiolkovsky.",
            level = DepthLevel.L4,
            estMinutes = 20,
            prerequisites = listOf("fis-mekanika-vektor")
        ),
        ConceptItem(
            id = "fis-osilasi-teredam-paksa",
            domain = Domain.FISIKA,
            topic = "Osilasi & Resonansi",
            title = "Osilasi Harmonik Teredam, Paksa & Faktor Kualitas Q",
            description = "Persamaan diferensial osilator teredam (underdamped, critically damped, overdamped), resonansi osilasi paksa sinusoidal, dan faktor kualitas Q.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("fis-kerja-energi-potensial")
        ),
        ConceptItem(
            id = "fis-persamaan-gelombang-kontinu",
            domain = Domain.FISIKA,
            topic = "Fisika Gelombang",
            title = "Persamaan Diferensial Gelombang & Solusi d'Alembert",
            description = "Penurunan persamaan gelombang kontinu 1D dari hukum tegangan dawai, solusi d'Alembert, impedansi gelombang, refleksi transmisi medium, dan daya gelombang.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("fis-osilasi-teredam-paksa")
        ),
        ConceptItem(
            id = "fis-termodinamika-statistik-dasar",
            domain = Domain.FISIKA,
            topic = "Termodinamika Formal",
            title = "Termodinamika Formal, Gas van der Waals & Entropi Boltzmann",
            description = "Formulasi diferensial termodinamika, persamaan gas riil van der Waals, Teorema Clausius, relasi timbal balik Maxwell, dan interpretasi mikroskopis entropi Boltzmann.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("fis-termodinamika", "mat-kalkulus-multivariabel")
        ),
        ConceptItem(
            id = "fis-medan-elektromagnetik-maxwell-dasar",
            domain = Domain.FISIKA,
            topic = "Elektromagnetika Diferensial",
            title = "Elektromagnetika Diferensial & Arus Pergeseran Maxwell",
            description = "Hukum Gauss, Ampere, dan Faraday dalam bentuk diferensial dan integral, persamaan Poisson/Laplace, serta arus pergeseran penuntas simetri Maxwell.",
            level = DepthLevel.L4,
            estMinutes = 24,
            prerequisites = listOf("fis-listrik-statis", "mat-kalkulus-vektor")
        ),
        ConceptItem(
            id = "fis-gelombang-em-poynting",
            domain = Domain.FISIKA,
            topic = "Elektrodinamika Gelombang",
            title = "Persamaan Gelombang Maxwell & Vektor Poynting",
            description = "Unifikasi gelombang elektromagnetik berkecepatan cahaya dari ruang hampa, sifat transversa, Vektor Poynting fluks energi radiasi, dan tekanan radiasi foton.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("fis-medan-elektromagnetik-maxwell-dasar")
        ),
        ConceptItem(
            id = "fis-optik-fisis-interferometer",
            domain = Domain.FISIKA,
            topic = "Optika Gelombang Lanjut",
            title = "Prinsip Fermat, Matriks ABCD & Interferometer Michelson",
            description = "Prinsip Fermat waktu tempuh tersingkat, formulasi matriks optik ABCD, difraksi Fraunhofer dan Fresnel, serta prinsip pengukuran presisi Interferometer Michelson.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("fis-gelombang-em-poynting")
        ),
        ConceptItem(
            id = "fis-pengantar-kuantum-schrodinger",
            domain = Domain.FISIKA,
            topic = "Pengantar Fisika Kuantum",
            title = "Keruntuhan Fisika Klasik & Persamaan Schrödinger 1D",
            description = "Bencana ultraviolet, prinsip ketidakpastian Heisenberg, interpretasi probabilistik Born fungsi gelombang, dan persamaan Schrödinger 1D partikel dalam kotak.",
            level = DepthLevel.L4,
            estMinutes = 24,
            prerequisites = listOf("fis-persamaan-gelombang-kontinu", "fis-fisika-modern")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "fis-mekanika-vektor" -> mekanikaVektorLesson
            "fis-kerja-energi-potensial" -> kerjaEnergiLesson
            "fis-sistem-partikel-momentum" -> sistemPartikelLesson
            "fis-osilasi-teredam-paksa" -> osilasiTeredamLesson
            "fis-persamaan-gelombang-kontinu" -> gelombangKontinuLesson
            "fis-termodinamika-statistik-dasar" -> termodinamikaFormalLesson
            "fis-medan-elektromagnetik-maxwell-dasar" -> elektromagnetikDiferensialLesson
            "fis-gelombang-em-poynting" -> gelombangEmPoyntingLesson
            "fis-optik-fisis-interferometer" -> optikInterferometerLesson
            "fis-pengantar-kuantum-schrodinger" -> pengantarKuantumLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. MEKANIKA KLASIK VEKTOR & GAYA HAMBAT FLUIDA
    // =========================================================================
    private val mekanikaVektorLesson = LessonData(
        conceptId = "fis-mekanika-vektor",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pfm1",
                panelNumber = 1,
                title = "Peluncuran Roket RX-450 LAPAN di Pameungpeuk",
                caption = "Dimas dan Kirana menyaksikan uji terbang roket eksperimental RX-450 di pesisir pantai Pameungpeuk Garut.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Roket itu melesat membelah atmosfer! Di kecepatan supersonik, hambatan udara tidak lagi konstan, melainkan meningkat drastis sebanding kuadrat kecepatan!",
                sceneVisualEmoji = "🚀",
                sceneDescription = "Roket eksperimental membubung tinggi menembus lapisan atmosfer dengan jejak asap gas buang."
            ),
            StoryPanel(
                id = "pfm2",
                panelNumber = 2,
                title = "Dinamika Partikel Vektor Berbasis Kalkulus",
                caption = "Insinyur balistika merumuskan persamaan gerak diferensial.",
                dialogueSpeaker = "Insinyur",
                dialogueText = "Gaya total F(t, r, v) = m * d²r/dt²! Kita harus menyelesaikan persamaan diferensial vektor dalam koordinat lengkung polar untuk memprediksi lintasan trajektori presisi!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Diagram trajektori peluru parabola melengkung akibat gaya gravitasi dan hambatan udara aerodinamis."
            ),
            StoryPanel(
                id = "pfm3",
                panelNumber = 3,
                title = "Dua Rezim Hambatan: Laminer vs Turbulen",
                caption = "Kirana membandingkan gaya hambat Stokes dan gaya hambat fluida kuadratik.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Untuk benda mikroskopis bergerak lambat, gaya hambat sebanding kecepatan (F_drag = -b v). Tetapi untuk roket dan penerjun cepat, gaya hambat kuadratik (F_drag = -1/2 * C_d * rho * A * v²)! ",
                sceneVisualEmoji = "💨",
                sceneDescription = "Aliran garis fluida laminer mulus di sekitar bola kecil vs pusaran turbulen di belakang roket."
            ),
            StoryPanel(
                id = "pfm4",
                panelNumber = 4,
                title = "Mencapai Kecepatan Terminal",
                caption = "Dimas mencatat titik di mana percepatan roket atau penerjun menjadi nol.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Saat gaya hambat ke atas tepat mengimbangi gaya gravitasi berat ke bawah, gaya netto menjadi nol dan benda melaju pada Kecepatan Terminal v_t yang konstan!",
                sceneVisualEmoji = "🪂",
                sceneDescription = "Penerjun payung melayang stabil pada kecepatan terminal di mana gaya berat setara gaya hambat."
            )
        ),
        intuitionTitle = "Mekanika Analitis Vektor: Menyelesaikan Gerak Dinamis Riil di Bawah Gesekan Fluida",
        intuitionBody = "Mekanika klasik di perguruan tinggi melangkah dari rumus kinematika konstan menuju formulasi kalkulus diferensial vektor umum di mana gaya bergantung pada posisi $\\mathbf{r}$, kecepatan $\\mathbf{v}$, dan waktu $t$.\n\n" +
                "1. Persamaan Diferensial Gerak Partikel:\n" +
                "   Hukum II Newton dalam bentuk persamaan diferensial vektor orde dua:\n" +
                "   $$\\mathbf{F}(t, \\mathbf{r}, \\mathbf{v}) = m \\frac{d^2 \\mathbf{r}}{dt^2} = m \\ddot{\\mathbf{r}}$$\n" +
                "   • Dalam Koordinat Polar $(r, \\theta)$:\n" +
                "     Percepatan memiliki komponen radial dan transversal:\n" +
                "     $$\\mathbf{a} = (\\ddot{r} - r\\dot{\\theta}^2)\\,\\hat{\\mathbf{r}} + (r\\ddot{\\theta} + 2\\dot{r}\\dot{\\theta})\\,\\hat{\\boldsymbol{\\theta}}$$\n" +
                "     Suku $2\\dot{r}\\dot{\\theta}$ adalah percepatan Coriolis kinematik.\n\n" +
                "2. Model Gaya Hambat Fluida (Drag Force):\n" +
                "   A. Hambatan Linear (Bilangan Reynolds Rendah / Rezim Viskos Stokes):\n" +
                "      $$F_{\\text{drag}} = -b v \\implies m \\frac{dv}{dt} = mg - bv$$\n" +
                "      Solusi kecepatan sebagai fungsi waktu:\n" +
                "      $$v(t) = v_t \\left( 1 - e^{-t/\\tau} \\right) \\quad \\text{dengan } v_t = \\frac{mg}{b} \\; \\text{dan } \\tau = \\frac{m}{b}$$\n" +
                "   B. Hambatan Kuadratik (Bilangan Reynolds Tinggi / Rezim Aerodinamika Turbulen):\n" +
                "      $$F_{\\text{drag}} = -\\frac{1}{2} C_d \\rho A v^2$$\n" +
                "      Kecepatan Terminal ($a = 0 \\implies F_{\\text{drag}} = mg$):\n" +
                "      $$v_t = \\sqrt{\\frac{2mg}{C_d \\rho A}}$$",
        intuitionPoints = listOf(
            "Mengapa tetesan air hujan dari awan setinggi 2.000 meter tidak melubangi kepala kita seperti peluru timah? Karena tetes air hujan dihambat udara hingga mencapai kecepatan terminal yang aman (~9 m/s atau 32 km/jam)!",
            "Konstanta waktu tau = m/b menunjukkan bahwa benda yang lebih berat (m besar) membutuhkan waktu lebih lama untuk mencapai kecepatan terminalnya.",
            "Koefisien drag C_d adalah bilangan tak berdimensi yang mencerminkan tingkat aerodinamis bentuk geometri benda (C_d bola mulus ~0,47; C_d mobil balap F1 ~0,7; C_d peluru lancip ~0,04)."
        ),
        simId = "sim-fluid-drag",
        formulas = listOf(
            FormulaCard(
                symbol = "v_t",
                equation = "v_t = \\sqrt{\\frac{2mg}{C_d \\rho A}}",
                meaning = "Kecepatan terminal benda jatuh bebas dalam fluida dengan hambatan kuadratik.",
                units = "m/s",
                applicationNote = "m adalah massa benda, Cd koefisien drag, rho massa jenis fluida udara, A luas penampang proyeksi."
            ),
            FormulaCard(
                symbol = "\\mathbf{a}_{\\text{polar}}",
                equation = "\\mathbf{a} = (\\ddot{r} - r\\dot{\\theta}^2)\\hat{\\mathbf{r}} + (r\\ddot{\\theta} + 2\\dot{r}\\dot{\\theta})\\hat{\\boldsymbol{\\theta}}",
                meaning = "Percepatan vektor partikel dalam koordinat polar dua dimensi.",
                units = "m/s²",
                applicationNote = "Suku r theta_dot² adalah percepatan sentripetal, 2 r_dot theta_dot adalah percepatan Coriolis."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Analisis Aerodinamika Trajektori Roket Eksperimental RX-450 di Pusat Riset Roket BRIN",
            context = "Roket sonik RX-450 dengan diameter 450 mm dirancang untuk membawa muatan ilmiah atmosferik hingga ketinggian apogee 100 kilometer (batas luar angkasa Karman).",
            engineeringProblem = "Variasi massa jenis udara rho(z) yang berkurang secara eksponensial terhadap ketinggian z menyebabkan gaya hambat berubah dinamis sepanjang lintasan terbang.",
            physicalConceptUsed = "Integrasi numerik ODE balistika 3D: gaya dorong motor propelan padat, gaya gravitasi non-konstan, dan gaya hambat aerodinamika kuadratik.",
            mathematicalModel = "Metode Runge-Kutta orde 4 (RK4) memecahkan sistem 6 persamaan diferensial gerak translasi dan rotasi roket untuk memprediksi titik jatuh impak di Samudra Hindia.",
            realWorldImpact = "Menghasilkan akurasi prediksi zona pendaratan roket dalam radius 1,5 km, menjamin keselamatan pelayaran nelayan di selatan Pulau Jawa.",
            relatedCareers = listOf("Insinyur Propulsi Roket", "Analis Balistika Atmosferik", "Spesialis Aerodinamika Komputasi"),
            verifiedSource = "Pusat Riset Teknologi Roket BRIN Tarogong & Pameungpeuk Garut."
        ),
        homeLab = HomeLabData(
            title = "Menentukan Kecepatan Terminal Kertas Cupcake / Filter Kopi Menggunakan Video Smartphone",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "4–6 buah wadah kertas kue cupcake kecil (atau kertas saring kopi bulat)",
                "Penggaris panjang atau meteran kain yang ditempel vertikal di dinding sebagai skala acuan",
                "Smartphone dengan kamera fitur gerak lambat (slow-motion 120/240 fps)"
            ),
            steps = listOf(
                "Langkah 1: Tempelkan pita meteran di dinding dari lantai hingga ketinggian 2 meter.",
                "Langkah 2: Jatuhkan 1 wadah kertas cupcake dari ketinggian 2 meter sambil merekam jatuhnya dengan kamera gerak lambat smartphone sejajar meteran.",
                "Langkah 3: Amati video: perhatikan bahwa setelah jatuh sejauh ~30 cm, kertas cupcake bergerak dengan kecepatan yang sangat konstan (kecepatan terminal v_t)!",
                "Langkah 4: Hitung kecepatan terminal v_t1 = delta_y / delta_t.",
                "Langkah 5: Tumpuk 4 wadah kertas cupcake menjadi satu (massa bertambah 4 kali lipat, tetapi bentuk penampang A tetap sama), lalu jatuhkan. Hitung kecepatan terminalnya v_t4: buktikan bahwa v_t4 mendekati 2 kali lipat dari v_t1 (karena v_t sebanding akar kuadrat massa m)!"
            ),
            observationGoal = "Membuktikan hubungan kuantitatif bahwa kecepatan terminal aerodinamis sebanding dengan akar kuadrat massa benda (v_t ∝ √m).",
            connectionToSimulation = "Bandingkan kurva kecepatan terminalmu dengan simulator dinamika fluida di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mek-vek-1",
                prompt = "Sebuah partikel bermassa 0,2 kg jatuh dari keadaan diam dalam suatu medium cair kental dengan gaya hambat linear F_drag = -b v, di mana b = 0,4 N·s/m. Berapakah nilai kecepatan terminal partikel tersebut (anggap g = 9,8 m/s²)?",
                type = "numeric",
                correctAnswer = "4.9",
                tolerance = 0.1f,
                unit = "m/s",
                hints = listOf(
                    "Pada kecepatan terminal, percepatan partikel a = 0.",
                    "Syarat kesetimbangan gaya: mg = b · v_t.",
                    "v_t = (m · g) / b = (0,2 · 9,8) / 0,4 = ...?"
                ),
                explanation = "Pada kecepatan terminal, gaya hambat tepat menyamai gaya gravitasi berat: mg - b v_t = 0. Sehingga v_t = (m · g) / b = (0,2 · 9,8) / 0,4 = 1,96 / 0,4 = 4,9 m/s.",
                misconception = "Mengalikan massa dengan b alih-alih membaginya."
            ),
            QuizQuestion(
                id = "q-mek-vek-2",
                prompt = "Jika dua buah benda penerjun memiliki luas penampang dan bentuk aerodinamis yang identik, tetapi penerjun B memiliki massa total 4 kali lebih berat daripada penerjun A, bagaimanakah perbandingan kecepatan terminal penerjun B terhadap penerjun A pada rezim hambatan kuadratik?",
                type = "multiple_choice",
                options = listOf(
                    "Penerjun B memiliki kecepatan terminal 2 kali lebih cepat daripada penerjun A",
                    "Penerjun B memiliki kecepatan terminal 4 kali lebih cepat daripada penerjun A",
                    "Penerjun B memiliki kecepatan terminal yang sama persis dengan penerjun A",
                    "Penerjun B memiliki kecepatan terminal setengah dari penerjun A"
                ),
                correctAnswer = "Penerjun B memiliki kecepatan terminal 2 kali lebih cepat daripada penerjun A",
                hints = listOf(
                    "Rumus kecepatan terminal: v_t = akar(2mg / (Cd · rho · A)).",
                    "v_t sebanding dengan akar kuadrat massa (v_t ∝ √m).",
                    "Jika massa menjadi 4 kali lipat, maka kecepatannya menjadi akar(4) = ...?"
                ),
                explanation = "Karena kecepatan terminal kuadratik berbanding lurus dengan akar massa (v_t ∝ √m), peningkatan massa sebesar 4 kali lipat akan melipatgandakan kecepatan terminal sebesar √4 = 2 kali lebih cepat.",
                misconception = "Mengira kecepatan terminal sebanding linear dengan massa (sehingga salah menjawab 4 kali)."
            )
        )
    )

    // =========================================================================
    // 2. MEDAN GAYA KONSERVATIF & ANALISIS KURVA POTENSIAL
    // =========================================================================
    private val kerjaEnergiLesson = LessonData(
        conceptId = "fis-kerja-energi-potensial",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pfk1",
                panelNumber = 1,
                title = "Roller Coaster Halilintar & Lembah Potensial",
                caption = "Kirana dan Dimas mengamati kereta Halilintar di Dunia Fantasi Ancol meluncur menuruni lintasan rel curam.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kereta meluncur turun cepat di lembah lalu melambat saat menaiki bukit berikutnya. Di titik puncak, energi kinetiknya nyaris habis tapi energi potensialnya maksimal!",
                sceneVisualEmoji = "🎢",
                sceneDescription = "Kereta roller coaster meluncur melintasi puncak dan lembah lintasan rel baja."
            ),
            StoryPanel(
                id = "pfk2",
                panelNumber = 2,
                title = "Gaya Konservatif: Gradien Negatif Potensial",
                caption = "Kakek menjelaskan definisi matematis medan gaya konservatif.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Medan gaya F dikatakan konservatif jika curl-nya nol (∇ × F = 0)! Dalam hal ini, gaya selalu mengalir menuruni lereng gradien energi potensial: F = -dU/dx!",
                sceneVisualEmoji = "📉",
                sceneDescription = "Grafik kurva energi potensial U(x) memperlihatkan gaya menunjuk ke arah kemiringan negatif."
            ),
            StoryPanel(
                id = "pfk3",
                panelNumber = 3,
                title = "Titik Ekuilibrium: Stabil, Labil, & Netral",
                caption = "Dimas menganalisis titik di mana turunan pertama bernilai nol dU/dx = 0.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Di dasar mangkuk lembah potensial, turunan kedua U''(x) > 0: ini Ekuilibrium Stabil! Benda yang diganggu sedikit akan berosilasi harmonik kembali ke titik setimbang!",
                sceneVisualEmoji = "🥣",
                sceneDescription = "Kelereng di dasar mangkuk cekung (stabil) vs kelereng di puncak bukit cembung (labil)."
            ),
            StoryPanel(
                id = "pfk4",
                panelNumber = 4,
                title = "Aproksimasi Osilasi Harmonik Sederhana",
                caption = "Kirana mengekspansi kurva potensial dengan deret Taylor di sekitar titik minimum.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Di sekitar titik kesetimbangan stabil x₀, kurva apa pun bisa didekati dengan parabola kuadratik U(x) ≈ 1/2 k_eff (x - x₀)²! Konstanta pegas efektifnya adalah kelengkungan turunan kedua k_eff = U''(x₀)!",
                sceneVisualEmoji = "〰️",
                sceneDescription = "Parabola aproksimasi kuadratik menempel sempurna pada dasar sumur potensial acak."
            )
        ),
        intuitionTitle = "Lanskap Energi Alam: Analisis Kualitatif Stabilitas Sistem Fisis",
        intuitionBody = "Pemetaan kurva energi potensial $U(x)$ adalah salah satu teknik analitis paling elegan dalam fisika untuk memahami dinamika gerak sistem tanpa harus menyelesaikan persamaan diferensial gerak secara eksplisit.\n\n" +
                "1. Definisi Formal Gaya Konservatif:\n" +
                "   Gaya $\\mathbf{F}$ bersifat konservatif jika kerja yang dilakukannya sepanjang lintasan tertutup bernilai nol ($\\oint \\mathbf{F} \\cdot d\\mathbf{r} = 0$), yang setara dengan syarat irrotasional:\n" +
                "   $$\\nabla \\times \\mathbf{F} = \\mathbf{0} \\iff \\mathbf{F} = -\\nabla U$$\n" +
                "   • Untuk 1 Dimensi: $F(x) = -\\frac{dU}{dx}$.\n" +
                "   • Partikel selalu mengalami gaya dorong menuju ke arah energi potensial yang lebih rendah.\n\n" +
                "2. Klasifikasi Titik Ekuilibrium ($F(x_0) = -U'(x_0) = 0$):\n" +
                "   • Ekuilibrium Stabil: $\\frac{d^2 U}{dx^2}(x_0) > 0$ (Titik Minimum Lokal Lembah). Partikel yang digeser sedikit akan mengalami gaya pemulih (*restoring force*) yang mengembalikannya ke $x_0$.\n" +
                "   • Ekuilibrium Tidak Stabil / Labil: $\\frac{d^2 U}{dx^2}(x_0) < 0$ (Titik Maksimum Lokal Bukit). Gangguan sekecil apa pun akan mendorong partikel menjauh tak kembali.\n" +
                "   • Ekuilibrium Netral: $\\frac{d^2 U}{dx^2}(x_0) = 0$ (Dataran Datar). Partikel tetap diam di posisi baru.\n\n" +
                "3. Aproksimasi Osilasi Harmonik di Sekitar Minimum:\n" +
                "   Dengan mengekspansi $U(x)$ menggunakan Deret Taylor di sekitar titik minimum stabil $x_0$:\n" +
                "   $$U(x) = U(x_0) + U'(x_0)(x - x_0) + \\frac{1}{2} U''(x_0)(x - x_0)^2 + \\dots$$\n" +
                "   Karena $U'(x_0) = 0$, untuk simpangan kecil $(x - x_0)$:\n" +
                "   $$U(x) \\approx \\frac{1}{2} k_{\\text{eff}} (x - x_0)^2 \\quad \\text{di mana } k_{\\text{eff}} = U''(x_0)$$\n" +
                "   Partikel akan berosilasi harmonik sederhana dengan frekuensi sudut alamiah:\n" +
                "   $$\\omega_0 = \\sqrt{\\frac{k_{\\text{eff}}}{m}} = \\sqrt{\\frac{U''(x_0)}{m}}$$",
        intuitionPoints = listOf(
            "Hampir SEMUA getaran di alam semesta (getaran ikatan kimia molekul, getaran dawai musik, osilasi atom kristal) adalah osilasi harmonik sederhana karena dasar sumur potensial mulus apa pun selalu menyerupai parabola kuadratik!",
            "Titik balik (*turning points*) adalah posisi di mana kurva energi potensial tepat menyamai energi total sistem (U(x) = E), di mana energi kinetik menjadi nol dan partikel membalikkan arah geraknya.",
            "Gaya gesek non-konservatif tidak dapat dinyatakan sebagai gradien fungsi potensial karena energi mekanik terdisipasi menjadi panas tak terbalikkan."
        ),
        simId = "sim-potential-well",
        formulas = listOf(
            FormulaCard(
                symbol = "F(x)",
                equation = "F(x) = -\\frac{dU}{dx}",
                meaning = "Hubungan gaya konservatif 1 dimensi dengan gradien energi potensial.",
                units = "Newton (N)",
                applicationNote = "Gaya berarah positif jika kurva potensial menurun miring ke bawah, berarah negatif jika menanjak."
            ),
            FormulaCard(
                symbol = "\\omega_0",
                equation = "\\omega_0 = \\sqrt{\\frac{U''(x_0)}{m}}",
                meaning = "Frekuensi sudut osilasi harmonik simpangan kecil di sekitar titik minimum potensial x0.",
                units = "rad/s",
                applicationNote = "U''(x0) adalah turunan kedua energi potensial yang bertindak sebagai konstanta pegas efektif keff."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Desain Penstabil Dinamis Bantalan Magnetik Kereta Maglev di BRIN Tenaga Listrik",
            context = "Kereta Maglev melayang di atas rel pemandu menggunakan gaya tolak levitasi magnetik superkonduktor tanpa kontak gesek mekanis.",
            engineeringProblem = "Menurut Teorema Earnshaw, sistem muatan atau kutub magnetik statis murni tidak pernah bisa mencapai kesetimbangan stabil di semua arah (selalu memiliki titik pelana labil).",
            physicalConceptUsed = "Pemetaan medan potensial magnetik U(x, y, z): perancangan umpan balik elektromagnetik aktif elektromagnet yang mengubah lanskap potensial secara dinamis agar turunan kedua U''(x) dan U''(z) bernilai positif stabil.",
            mathematicalModel = "Sensor celah optik mendeteksi perpindahan 10 mikrometer dan mengatur arus kumparan elektromagnetik pada frekuensi kontrol 2 kHz menjaga titik minimum potensial di tengah.",
            realWorldImpact = "Menghasilkan levitasi stabil sempurna pada celah 15 mm bahkan saat kereta melaju kencang menembus terowongan berangin kencang.",
            relatedCareers = listOf("Insinyur Sistem Levitas Magnetik", "Spesialis Kontrol Dinamika Kendaraan", "Fisikawan Elektromagnetik"),
            verifiedSource = "Pusat Riset Tenaga Listrik dan Mekatronika BRIN Bandung."
        ),
        homeLab = HomeLabData(
            title = "Menyelidiki Stabilitas Titik Ekuilibrium Kelereng dalam Mangkuk Cekung vs Cembung",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 buah mangkuk kaca/keramik berbentuk setengah bola cekung",
                "1 butir kelereng kaca bulat",
                "Stopwatch smartphone dan penggaris"
            ),
            steps = listOf(
                "Langkah 1: Letakkan mangkuk dalam posisi normal (cekung menghadap ke atas) di atas meja datar. Letakkan kelereng di dasar mangkuk.",
                "Langkah 2: Berikan dorongan kecil pada kelereng: amati kelereng berosilasi bolak-balik di sekitar dasar sebelum berhenti kembali ke titik awal (Ekuilibrium Stabil, U''(x) > 0).",
                "Langkah 3: Ukur periode ayunan osilasi kelereng untuk simpangan kecil menggunakan stopwatch.",
                "Langkah 4: Balikkan mangkuk (posisi cembung menghadap ke atas). Coba seimbangkan kelereng di puncak lengkungan kubah teratas (Titik Ekuilibrium Labil / Tidak Stabil, U''(x) < 0).",
                "Langkah 5: Perhatikan betapa mustahilnya menjaga kelereng tetap di puncak cembung: hembusan napas terkecil seketika membuat kelereng jatuh menggelinding menjauh!"
            ),
            observationGoal = "Memahami secara visual dan fisik perbedaan mendasar antara titik kesetimbangan stabil turunan kedua positif dan kesetimbangan labil turunan kedua negatif.",
            connectionToSimulation = "Bandingkan kurva mangkukmu dengan lanskap sumur potensial pada simulator di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kerja-pot-1",
                prompt = "Diberikan suatu fungsi energi potensial satu dimensi U(x) = 2x³ - 6x. Tentukan pada posisi manakah sistem berada dalam kondisi Ekuilibrium Stabil?",
                type = "multiple_choice",
                options = listOf(
                    "x = +1",
                    "x = -1",
                    "x = 0",
                    "x = +3"
                ),
                correctAnswer = "x = +1",
                hints = listOf(
                    "Titik ekuilibrium terjadi saat dU/dx = 0.",
                    "dU/dx = 6x² - 6 = 0  =>  6(x² - 1) = 0  =>  x = +1 atau x = -1.",
                    "Uji turunan kedua: d²U/dx² = 12x.",
                    "Stabil mensyaratkan d²U/dx² > 0 (positif)."
                ),
                explanation = "Turunan pertama dU/dx = 6x² - 6 = 0 menghasilkan titik stasioner x = +1 dan x = -1. Turunan kedua d²U/dx² = 12x. Pada x = +1, turunan kedua bernilai 12(+1) = +12 > 0 (minimum lokal / ekuilibrium stabil). Pada x = -1, nilainya -12 < 0 (maksimum lokal / labil).",
                misconception = "Memilih x = -1 karena mengira nilai negatif selalu berarti stabil."
            ),
            QuizQuestion(
                id = "q-kerja-pot-2",
                prompt = "Suatu partikel bermassa 0,5 kg berada di sekitar titik minimum potensial stabil yang memiliki kelengkungan turunan kedua d²U/dx² = 8 N/m. Berapakah frekuensi sudut alami (omega) dari osilasi simpangan kecil partikel tersebut?",
                type = "numeric",
                correctAnswer = "4",
                tolerance = 0.1f,
                unit = "rad/s",
                hints = listOf(
                    "Konstanta pegas efektif k_eff = d²U/dx² = 8 N/m.",
                    "Rumus frekuensi sudut: omega = akar(k_eff / m).",
                    "omega = akar(8 / 0,5) = akar(16) = ...?"
                ),
                explanation = "Konstanta pegas efektif kurva di titik minimum adalah k_eff = U''(x0) = 8 N/m. Frekuensi sudut osilasi harmonik adalah omega = √(k_eff / m) = √(8 / 0,5) = √16 = 4 rad/s.",
                misconception = "Lupa menarik akar kuadrat dari rasio k/m."
            )
        )
    )

    // =========================================================================
    // 3. SISTEM PARTIKEL, PUSAT MASSA & PERSAMAAN ROKET
    // =========================================================================
    private val sistemPartikelLesson = LessonData(
        conceptId = "fis-sistem-partikel-momentum",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "psp_m1",
                panelNumber = 1,
                title = "Peluncuran Satelit SATRIA-1 Menembus Angkasa",
                caption = "Dimas dan Kirana menonton siaran langsung roket pembawa Satelit SATRIA-1 meluncur ke orbit antariksa.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Roket itu menyemburkan gas api berkecepatan ribuan meter per detik ke belakang! Massa roket terus berkurang drastis setiap detik seiring terbakarnya bahan bakar!",
                sceneVisualEmoji = "🛰️",
                sceneDescription = "Roket antariksa bertahap melepaskan tabung bahan bakar seiring akselerasi ke orbit geostasioner."
            ),
            StoryPanel(
                id = "psp_m2",
                panelNumber = 2,
                title = "Hukum Gerak Massa Variabel Tsiolkovsky",
                caption = "Kakek menjelaskan fisika sistem dengan massa yang berubah terhadap waktu.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Konstantin Tsiolkovsky merumuskan: saat massa berkurang, dorongan semburan gas memacu roket semakin ringan dan semakin kencang! Penambahan kecepatan delta_v sebanding dengan logaritma rasio massa awal terhadap massa akhir!",
                sceneVisualEmoji = "📝",
                sceneDescription = "Persamaan roket Tsiolkovsky delta_v = v_e * ln(m0 / mf) menghubungkan massa dan kecepatan gas."
            ),
            StoryPanel(
                id = "psp_m3",
                panelNumber = 3,
                title = "Pusat Massa Distribusi Kontinu",
                caption = "Kirana menghitung titik pusat massa benda pejal berbentuk baji kerucut.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Untuk benda pejal, pusat massa bukan lagi rata-rata titik partikel diskrit, melainkan integral volume kontinu r_cm = (1/M) ∫ r dm! Di titik inilah resultan gravitasi bumi bekerja seolah-olah seluruh massa terkonsentrasi di satu titik!",
                sceneVisualEmoji = "⚖️",
                sceneDescription = "Diagram benda tidak simetris seimbang sempurna saat ditopang tepat di titik pusat massa r_cm."
            ),
            StoryPanel(
                id = "psp_m4",
                panelNumber = 4,
                title = "Kekekalan Momentum Sudut Sistem",
                caption = "Dimas mengamati bagaimana atlet loncat indah melipat tubuhnya di udara.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Tanpa torsi eksternal luar, momentum sudut total sistem L = I * omega kekal abadi! Saat atlet melipat tubuh mengecilkan momen inersia I, kecepatan putarannya melonjak berputar cepat!",
                sceneVisualEmoji = "🤸",
                sceneDescription = "Atlet loncat indah berputar cepat saat melipat tubuh dan melambat saat merentang."
            )
        ),
        intuitionTitle = "Dinamika Benda Banyak: Pusat Massa Kontinu & Sistem Massa Variabel",
        intuitionBody = "Ketika menganalisis benda pejal riil atau wahana antariksa, kita tidak dapat lagi mengasumsikan objek sebagai partikel titik tunggal bermassa konstan.\n\n" +
                "1. Pusat Massa Distribusi Kontinu:\n" +
                "   Untuk benda pejal bervolume dengan densitas massa $\\rho(\\mathbf{r})$:\n" +
                "   $$\\mathbf{r}_{\\text{cm}} = \\frac{1}{M} \\int \\mathbf{r}\\, dm = \\frac{1}{M} \\iiint_V \\mathbf{r}\\, \\rho(\\mathbf{r})\\, dV$$\n" +
                "   di mana massa total $M = \\int dm = \\iiint_V \\rho\\, dV$.\n" +
                "   • Teorema Gerak Pusat Massa: Gerak translasi keseluruhan sistem partikel memenuhi $\\mathbf{F}_{\\text{ext, net}} = M \\mathbf{a}_{\\text{cm}}$, terlepas dari gaya internal antar-partikel di dalam sistem.\n\n" +
                "2. Dinamika Sistem Massa Variabel (Persamaan Roket Tsiolkovsky):\n" +
                "   Pada roket yang menyemburkan gas buang dengan laju alir massa $\\frac{dm}{dt} < 0$ dan kecepatan buang relatif $v_e$:\n" +
                "   $$m \\frac{dv}{dt} = -v_e \\frac{dm}{dt} \\implies dv = -v_e \\frac{dm}{m}$$\n" +
                "   Dengan mengintegralkan dari massa awal $m_0$ ke massa akhir $m_f$:\n" +
                "   $$\\Delta v = v_f - v_0 = v_e \\ln \\left( \\frac{m_0}{m_f} \\right)$$\n" +
                "   • Gaya Dorong Roket (*Thrust*): $T = v_e \\left| \\frac{dm}{dt} \\right|$.\n\n" +
                "3. Momentum Sudut Sistem Partikel:\n" +
                "   $$\\mathbf{L}_{\\text{total}} = \\sum_{i} \\mathbf{r}_i \\times \\mathbf{p}_i = \\mathbf{r}_{\\text{cm}} \\times \\mathbf{P}_{\\text{total}} + \\mathbf{L}_{\\text{spin}}$$\n" +
                "   • Laju perubahan momentum sudut total sama persis dengan total torsi eksternal netto: $\\frac{d\\mathbf{L}}{dt} = \\boldsymbol{\\tau}_{\\text{ext}}$. Jika $\\boldsymbol{\\tau}_{\\text{ext}} = \\mathbf{0}$, maka $\\mathbf{L}$ kekal konstan.",
        intuitionPoints = listOf(
            "Mengapa roket bertingkat (multi-stage rocket) mutlak diperlukan untuk ke antariksa? Karena roket satu tingkat memerlukan rasio bahan bakar m0/mf yang sangat besar secara eksponensial; membuang tangki kosong bekas mengurangi massa akhir mf secara drastis!",
            "Ledakan kembang api di langit malam: serpihan kembang api terpental ke segala arah tak beraturan, tetapi Pusat Massa dari seluruh serpihan tetap meluncur mulus mengikuti lintasan parabola gravitasi sempurna!",
            "Semburan roket bekerja SAMA BAIKNYA (bahkan lebih efisien) di ruang hampa udara antariksa karena roket terdorong oleh momentum semburan gasnya sendiri, bukan dengan 'mendorong udara di belakangnya'."
        ),
        simId = "sim-rocket-thrust",
        formulas = listOf(
            FormulaCard(
                symbol = "\\Delta v",
                equation = "\\Delta v = v_e \\ln\\left(\\frac{m_0}{m_f}\\right)",
                meaning = "Persamaan roket Tsiolkovsky untuk pertambahan kecepatan wahana massa variabel.",
                units = "m/s",
                applicationNote = "ve adalah kecepatan gas buang relatif, m0 massa awal roket terisi bahan bakar, mf massa akhir struktur."
            ),
            FormulaCard(
                symbol = "\\mathbf{r}_{\\text{cm}}",
                equation = "\\mathbf{r}_{\\text{cm}} = \\frac{1}{M} \\int \\mathbf{r}\\, dm",
                meaning = "Posisi vektor pusat massa untuk distribusi massa kontinu kontinu.",
                units = "meter (m)",
                applicationNote = "dm dapat diganti lambda dl (kawat 1D), sigma dA (plat 2D), atau rho dV (benda pejal 3D)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Perhitungan Manuver Transfer Orbit Geostasioner Satelit SATRIA-1 oleh Pasukan Kendali Misi",
            context = "Satelit internet broadband nasional SATRIA-1 berbobot basah 4,6 ton diluncurkan menuju slot orbit 146 derajat Bujur Timur di atas pulau Papua.",
            engineeringProblem = "Menghitung kebutuhan bahan bakar propelan gas xenon pendorong ion elektrik untuk menaikkan orbit satelit dari orbit transfer GTO ke orbit lingkaran geostasioner GEO (ketinggian 35.786 km).",
            physicalConceptUsed = "Aplikasi persamaan roket Tsiolkovsky: pendorong ion Hall-effect menghasilkan kecepatan buang spesifik sangat tinggi (ve ≈ 30.000 m/s / Isp 3.000 detik) dengan konsumsi massa sangat irit.",
            mathematicalModel = "Total delta_v transfer orbit sebesar 1.800 m/s membutuhkan rasio massa exp(1800 / 30000) = exp(0,06) ≈ 1,0619, sehingga hanya memerlukan ~270 kg bahan bakar xenon.",
            realWorldImpact = "Menghemat bobot peluncuran hingga 2 ton dibandingkan pendorong roket kimiawi konvensional, memungkinkan satelit beroperasi menyediakan internet untuk 150.000 titik sekolah dan puskesmas di daerah 3T selama 15 tahun.",
            relatedCareers = listOf("Insinyur Astrodinamika Satelit", "Operator Stasiun Kendali Bumi Orbit", "Spesialis Propulsi Elektrik"),
            verifiedSource = "Badan Aksesibilitas Telekomunikasi dan Informasi (BAKTI) Kominfo & Thales Alenia Space."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Dorongan Roket Air Sederhana Mengamati Kekekalan Momentum Semburan Massa",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 botol plastik bekas 1,5 Liter yang kuat",
                "Sumbat gabus atau karet yang pas di mulut botol",
                "Pompa sepeda dengan jarum pentil ban",
                "Air putih bersih (isi 1/3 volume botol)",
                "Lapangan terbuka bebas orang"
            ),
            steps = listOf(
                "Langkah 1: Lubangi sumbat gabus secara presisi untuk memasukkan jarum pentil pompa sepeda.",
                "Langkah 2: Isi botol dengan air sebanyak 1/3 volume (sekitar 500 mL). Air bertindak sebagai massa reaksi semburan yang berat.",
                "Langkah 3: Pasang sumbat gabus rapat-rapat pada mulut botol, posisikan botol mengarah miring 45 derajat ke arah lapangan terbuka yang aman.",
                "Langkah 4: Pompa udara masuk ke dalam botol: udara tertekan di dalam botol bertindak sebagai penyimpan energi potensial pegas pneumatik.",
                "Langkah 5: Saat tekanan udara melampaui gesekan gabus, gabus terlepas: semburan air bermassa berat meluncur deras ke belakang mendorong botol melesat kencang puluhan meter ke depan membuktikan aksi-reaksi momentum massa variabel!"
            ),
            observationGoal = "Membuktikan secara nyata prinsip dorongan roket bahwa semburan fluida bermassa menghasilkan momentum dorong maju pada badan wahana.",
            connectionToSimulation = "Bandingkan jarak roket airmu dengan simulasi persamaan Tsiolkovsky di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sistem-part-1",
                prompt = "Sebuah roket antariksa memiliki kecepatan gas buang relatif konstan v_e = 2.500 m/s. Jika roket ingin meningkatkan kecepatannya sebesar Delta_v = 5.000 m/s, berapakah perbandingan rasio massa awal terhadap massa akhir (m_0 / m_f) yang dibutuhkan? (Diketahui e ≈ 2,718)",
                type = "numeric",
                correctAnswer = "7.39",
                tolerance = 0.2f,
                unit = "rasio",
                hints = listOf(
                    "Gunakan persamaan Tsiolkovsky: Delta_v = v_e · ln(m_0 / m_f).",
                    "ln(m_0 / m_f) = Delta_v / v_e = 5.000 / 2.500 = 2.",
                    "Maka m_0 / m_f = e² = (2,718)² = ...?"
                ),
                explanation = "Berdasarkan persamaan Tsiolkovsky: Delta_v / v_e = ln(m_0 / m_f) = 5.000 / 2.500 = 2. Mengambil eksponensial di kedua sisi menghasilkan m_0 / m_f = e² ≈ 7,389. Artinya massa awal roket harus ~7,4 kali bobot struktur kosongnya.",
                misconception = "Lupa meng-eksponensialkan nilai 2 sehingga menjawab rasio 2 alih-alih e²."
            ),
            QuizQuestion(
                id = "q-sistem-part-2",
                prompt = "Sebuah batang silinder homogen kawat tipis sepanjang L = 2 meter memiliki kerapatan massa linear seragam lambda. Di manakah letak titik pusat massa batang tersebut diukur dari ujung kirinya?",
                type = "numeric",
                correctAnswer = "1",
                tolerance = 0.05f,
                unit = "meter",
                hints = listOf(
                    "Batang bersifat homogen (kerapatan seragam).",
                    "Pusat massa benda homogen simetris selalu berada tepat di tengah-tengah geometrisnya.",
                    "x_cm = L / 2 = 2 / 2 = ...?"
                ),
                explanation = "Untuk batang homogen satu dimensi berdensitas konstan, x_cm = (1/M) ∫_0^L x λ dx = (λ/M) [x²/2]_0^L = (λ/M) (L²/2). Karena M = λ L, maka x_cm = L / 2 = 2 / 2 = 1 meter dari ujung kiri.",
                misconception = "Mengira pusat massa bergantung pada besar nilai massa total M."
            )
        )
    )

    // =========================================================================
    // 4. OSILASI HARMONIK TEREDAM, PAKSA & FAKTOR KUALITAS Q
    // =========================================================================
    private val osilasiTeredamLesson = LessonData(
        conceptId = "fis-osilasi-teredam-paksa",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pfo1",
                panelNumber = 1,
                title = "Peredam Gempa Tuned Mass Damper Menara Astra",
                caption = "Dimas dan Kirana diajak insinyur struktur melihat bola pendulum raksasa penyeimbang di lantai teratas gedung pencakar langit Menara Astra Jakarta.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Gedung setinggi 260 meter ini bisa bergoyang tertiup angin topan atau gempa bumi. Tapi pendulum raksasa ratusan ton di puncak gedung bergerak berlawanan arah meredam goyangan!",
                sceneVisualEmoji = "🏢",
                sceneDescription = "Pendulum baja raksasa peredam massa tertala tergantung di lantai puncak gedung pencakar langit."
            ),
            StoryPanel(
                id = "pfo2",
                panelNumber = 2,
                title = "Tiga Rezim Redaman Osilasi",
                caption = "Kakek menuliskan persamaan diferensial gerak osilator teredam.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Gesekan fluida peredam memunculkan suku redaman 2*gamma*v! Jika redaman kecil (Underdamped), benda berayun dengan amplitudo menyusut eksponensial. Jika redaman pas (Critically Damped), benda kembali ke titik nol paling cepat tanpa berayun sama sekali!",
                sceneVisualEmoji = "📉",
                sceneDescription = "Tiga kurva osilasi memperlihatkan underdamped berayun, critically damped pulih kilat, dan overdamped lambat."
            ),
            StoryPanel(
                id = "pfo3",
                panelNumber = 3,
                title = "Resonansi Osilasi Paksa: Bencana & Manfaat",
                caption = "Kirana memutar simulasi jembatan Tacoma Narrows yang runtuh akibat resonansi angin tahun 1940.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Saat frekuensi gaya dorong luar tepat menyamai frekuensi alami sistem (omega = omega_0), amplitudo melonjak dahsyat mencapai Resonansi! Ini bisa meruntuhkan jembatan, tapi juga prinsip kerja antena radio menangkap siaran!",
                sceneVisualEmoji = "🌉",
                sceneDescription = "Kurva kurva resonansi tajam memperlihatkan lonjakan amplitudo ekstrem pada frekuensi alami."
            ),
            StoryPanel(
                id = "pfo4",
                panelNumber = 4,
                title = "Faktor Kualitas Q: Ketajaman Nada",
                caption = "Dimas memukul garpu tala laboratorium fisika yang berdenging merdu.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Faktor Kualitas Q mengukur seberapa efisien osilator menyimpan energi sebelum hilang teredam! Semakin tinggi nilai Q, semakin lambat redamannya dan semakin tajam selektivitas resonansinya!",
                sceneVisualEmoji = "🎛️",
                sceneDescription = "Garpu tala berdengung lama dengan puncak spektrum resonansi frekuensi yang sangat tajam dan sempit."
            )
        ),
        intuitionTitle = "Dinamika Getaran Riil: Persamaan Diferensial Osilasi Teredam & Resonansi",
        intuitionBody = "Di alam nyata, tidak ada osilator harmonik abadi tanpa gesekan; energi mekanik selalu terdisipasi secara bertahap oleh hambatan viskos fluida menjadi energi termal panas.\n\n" +
                "1. Persamaan Diferensial Osilator Harmonik Teredam:\n" +
                "   Berdasarkan Hukum II Newton dengan gaya pemulih pegas $-kx$ dan gaya redaman viskos $-b\\dot{x}$:\n" +
                "   $$m \\ddot{x} + b \\dot{x} + kx = 0 \\iff \\ddot{x} + 2\\gamma \\dot{x} + \\omega_0^2 x = 0$$\n" +
                "   di mana $\\omega_0 = \\sqrt{\\frac{k}{m}}$ adalah frekuensi sudut alami tak teredam dan $\\gamma = \\frac{b}{2m}$ adalah parameter redaman.\n\n" +
                "2. Tiga Rezim Karakteristik Solusi Gerak:\n" +
                "   Persamaan karakteristik $r^2 + 2\\gamma r + \\omega_0^2 = 0 \\implies r = -\\gamma \\pm \\sqrt{\\gamma^2 - \\omega_0^2}$:\n" +
                "   • Redaman Kurang (*Underdamped*, $\\gamma < \\omega_0$):\n" +
                "     Akar kompleks, partikel berosilasi dengan amplitudo menyusut eksponensial:\n" +
                "     $$x(t) = A e^{-\\gamma t} \\cos(\\omega_d t + \\phi) \\quad \\text{dengan } \\omega_d = \\sqrt{\\omega_0^2 - \\gamma^2}$$\n" +
                "   • Redaman Kritis (*Critically Damped*, $\\gamma = \\omega_0$):\n" +
                "     Partikel kembali ke titik kesetimbangan dalam waktu tercepat tanpa pernah berosilasi berbalik arah ($x(t) = (A + Bt)e^{-\\gamma t}$). Sangat ideal untuk peredam kejut shockbreaker mobil dan pintu otomatis!\n" +
                "   • Redaman Lebih (*Overdamped*, $\\gamma > \\omega_0$):\n" +
                "     Redaman sangat kental pekat sehingga sistem kembali ke titik nol secara lambat merangkak tanpa osilasi.\n\n" +
                "3. Osilasi Paksa Sinusoidal & Fenomena Resonansi:\n" +
                "   Jika diberi gaya dorong periodik luar $F(t) = F_0 \\cos(\\omega t)$:\n" +
                "   $$\\ddot{x} + 2\\gamma \\dot{x} + \\omega_0^2 x = \\frac{F_0}{m} \\cos(\\omega t)$$\n" +
                "   Amplitudo keadaan tunak (*steady-state*):\n" +
                "   $$A(\\omega) = \\frac{F_0 / m}{\\sqrt{(\\omega_0^2 - \\omega^2)^2 + 4\\gamma^2 \\omega^2}}$$\n" +
                "   • Resonansi terjadi saat frekuensi dorong luar mendekati $\\omega = \\sqrt{\\omega_0^2 - 2\\gamma^2} \\approx \\omega_0$, di mana amplitudo melonjak mencapai nilai puncak maksimum.\n\n" +
                "4. Faktor Kualitas (*Quality Factor* / $Q$):\n" +
                "   Mengukur rasio energi tersimpan terhadap energi yang terdisipasi per radian siklus:\n" +
                "   $$Q = \\frac{\\omega_0}{2\\gamma} = \\frac{\\omega_0}{\\Delta \\omega}$$\n" +
                "   di mana $\\Delta \\omega$ adalah lebar pita setengah daya (*bandwidth FWHM*).",
        intuitionPoints = listOf(
            "Shockbreaker suspensi mobil dirancang sengaja pada kondisi Redaman Kritis (gamma = omega0); jika underdamped mobil akan terus memantul-mantul sehabis melewati polisi tidur, jika overdamped suspensi terasa keras kaku membanting penumpang!",
            "Pencitraan Medis MRI (Magnetic Resonance Imaging) di rumah sakit memanfaatkan resonansi magnetik inti atom hidrogen di dalam tubuh pasien untuk menghasilkan citra detail organ tanpa radiasi sinar-X.",
            "Semakin tinggi nilai Q osilator, semakin tajam dan selektif respons frekuensinya (kristal kuarsa jam tangan memiliki Q ~ 100.000 sehingga sangat presisi tidak meleset)."
        ),
        simId = "sim-damped-resonance",
        formulas = listOf(
            FormulaCard(
                symbol = "\\omega_d",
                equation = "\\omega_d = \\sqrt{\\omega_0^2 - \\gamma^2} \\quad \\left( \\gamma = \\frac{b}{2m} \\right)",
                meaning = "Frekuensi sudut osilator teredam kurang (underdamped).",
                units = "rad/s",
                applicationNote = "Adanya gesekan fluida redaman menurunkan frekuensi ayunan getaran menjadi lebih rendah daripada frekuensi alami tak teredam."
            ),
            FormulaCard(
                symbol = "Q",
                equation = "Q = \\frac{\\omega_0}{2\\gamma} = \\frac{\\omega_0}{\\Delta \\omega}",
                meaning = "Faktor Kualitas osilator mengukur ketajaman puncak resonansi dan persistensi energi.",
                units = "bilangan tanpa dimensi",
                applicationNote = "Q tinggi menunjukkan laju disipasi energi yang sangat lambat."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Aplikasi Tuned Mass Damper Seismik Mencegah Resonansi Gempa Megathrust di Gedung Menara Astra Jakarta",
            context = "Jakarta berada pada zona sedimentasi lunak yang rawan mengalami amplifikasi gelombang seismik periode panjang akibat potensi gempa megathrust Selat Sunda.",
            engineeringProblem = "Mencegah fenomena resonansi getaran harmonik tingkat tinggi pada struktur gedung setinggi 260 meter saat diguncang gempa frekuensi 0,2 Hz.",
            physicalConceptUsed = "Sistem osilator tertala ganda: pendulum peredam massa sekunder berbobot 300 ton ditala frekuensi alaminya persis sama dengan frekuensi ragam pertama gedung dengan redaman kritis hidrolik viskos.",
            mathematicalModel = "Persamaan diferensial terkopel dua derajat kebebasan (2-DOF) dipecahkan untuk memindahkan energi kinetik getaran gedung menuju disipasi viskos silinder peredam hidrolik.",
            realWorldImpact = "Mengurangi simpangan ayunan lateral puncak gedung hingga 45%, melindungi integritas kaca fasad dan kenyamanan penghuni saat gempa melanda.",
            relatedCareers = listOf("Insinyur Dinamika Struktur Seismik", "Konsultan Pengendali Getaran Gedung", "Geofisikawan Rekayasa"),
            verifiedSource = "Pusat Riset Gempa Bumi BRIN & Himpunan Ahli Konstruksi Indonesia (HAKI)."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Tiga Rezim Redaman Osilasi Penggaris Plastik dalam Udara vs Air",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 buah penggaris plastik lentur panjang 30 cm",
                "Meja kokoh dan buku tebal sebagai penjepit",
                "Baskom berisi air penuh",
                "Stopwatch smartphone"
            ),
            steps = listOf(
                "Langkah 1: Jepit ujung penggaris 10 cm di tepi meja dengan buku tebal, biarkan 20 cm menggantung bebas di udara.",
                "Langkah 2: Tekan ujung bebas ke bawah lalu lepaskan: amati getarannya di udara (Rezim Underdamped Redaman Rendah: berayun puluhan kali sebelum berhenti perlahan). Hitung frekuensinya.",
                "Langkah 3: Letakkan baskom air di bawah penggaris sehingga ujung penggaris yang bergetar tercelup sekitar 2 cm ke dalam air.",
                "Langkah 4: Tekan ujung penggaris dan lepaskan: amati perbedaannya! Air memberikan gaya hambat viskositas besar sehingga getaran terhenti hanya dalam 1–2 ayunan singkat!",
                "Langkah 5: Celupkan seluruh bilah penggaris lebih dalam ke air: penggaris kembali ke posisi netral tanpa berayun sama sekali (Rezim Redaman Kritis / Overdamped)!"
            ),
            observationGoal = "Membandingkan secara visual transisi dari osilasi teredam ringan di udara menuju kondisi redaman kritis di dalam fluida cair bergesekan tinggi.",
            connectionToSimulation = "Bandingkan ayunan penggarismu dengan kurva redaman pada simulator osilasi di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-osilasi-ter-1",
                prompt = "Kondisi redaman di mana sebuah sistem mekanik yang diberi simpangan awal dapat kembali ke posisi kesetimbangan nol dalam waktu PALING CEPAT tanpa mengalami osilasi bolak-balik dinamakan...",
                type = "multiple_choice",
                options = [
                    "Redaman Kritis (Critically Damped)",
                    "Redaman Kurang (Underdamped)",
                    "Redaman Lebih (Overdamped)",
                    "Osilasi Tak Teredam Bebas"
                ],
                correctAnswer = "Redaman Kritis (Critically Damped)",
                hints = listOf(
                    "Terjadi ketika parameter redaman gamma sama persis dengan frekuensi alami omega_0.",
                    "Sangat diinginkan pada shockbreaker kendaraan bermotor."
                ),
                explanation = "Redaman kritis (Critically Damped, gamma = omega_0) adalah batas ambang di mana sistem kembali ke posisi setimbang secepat mungkin tanpa mengalami pembalikan arah atau osilasi bolak-balik.",
                misconception = "Menjawab overdamped (overdamped kembali ke titik setimbang dengan lambat karena gesekan fluida yang terlalu kental)."
            ),
            QuizQuestion(
                id = "q-osilasi-ter-2",
                prompt = "Sebuah sistem osilator mekanik memiliki frekuensi alami sudut omega_0 = 100 rad/s dan konstanta redaman gamma = 0,5 rad/s. Berapakah nilai Faktor Kualitas (Q) dari osilator tersebut?",
                type = "numeric",
                correctAnswer = "100",
                tolerance = 1f,
                unit = "faktor Q",
                hints = listOf(
                    "Rumus faktor kualitas: Q = omega_0 / (2 · gamma).",
                    "Q = 100 / (2 · 0,5) = 100 / 1 = ...?"
                ),
                explanation = "Faktor Kualitas dihitung dengan rumus Q = omega_0 / (2 · gamma). Dengan omega_0 = 100 rad/s dan gamma = 0,5 rad/s, diperoleh Q = 100 / (2 · 0,5) = 100 / 1 = 100.",
                misconception = "Lupa mengalikan gamma dengan 2 di penyebut."
            )
        )
    )

    // =========================================================================
    // 5. PERSAMAAN DIFERENSIAL GELOMBANG & SOLUSI D'ALEMBERT
    // =========================================================================
    private val gelombangKontinuLesson = LessonData(
        conceptId = "fis-persamaan-gelombang-kontinu",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pfg_k1",
                panelNumber = 1,
                title = "Goncangan Gelombang Tali Kapal di Dermaga",
                caption = "Dimas mengamati tali tambat kapal feri di Pelabuhan Merak yang ditepuk kencang oleh petugas dermaga.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Gundukan pulsa gelombang melesat cepat sepanjang tali tambat baja yang tegang! Bagaimana menurunkan kecepatan rambat gelombang ini murni dari tegangan tali T dan massa jenis talinya?",
                sceneVisualEmoji = "🚢",
                sceneDescription = "Tali tambat baja tebal terbentang kencang di dermaga pelabuhan pelayaran feri."
            ),
            StoryPanel(
                id = "pfg_k2",
                panelNumber = 2,
                title = "Penurunan Persamaan Diferensial Gelombang 1D",
                caption = "Kakek menganalisis segmen diferensial tali dx menggunakan Hukum II Newton.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Perbedaan kemiringan tegangan tali di kedua ujung segmen menghasilkan gaya netto ke atas T * (d²y/dx²)! Disamakan dengan massa segmen dm * (d²y/dt²), lahirlah Persamaan Gelombang Kontinu d²y/dx² = (1/v²) d²y/dt²!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Diagram segmen tali diferensial melengkung dengan vektor tegangan T di kedua ujungnya."
            ),
            StoryPanel(
                id = "pfg_k3",
                panelNumber = 3,
                title = "Solusi Elegan d'Alembert: Maju & Mundur",
                caption = "Kirana menyimak pembuktian matematis fisikawan Jean le Rond d'Alembert.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Solusi umum persamaan gelombang selalu berupa superposisi dua bentuk fungsi sembarang: f(x - vt) yang merambat maju ke kanan dan g(x + vt) yang merambat mundur ke kiri tanpa berubah bentuk!",
                sceneVisualEmoji = "〰️",
                sceneDescription = "Dua paket pulsa gelombang berpapasan saling menembus tanpa saling merusak bentuk."
            ),
            StoryPanel(
                id = "pfg_k4",
                panelNumber = 4,
                title = "Batas Medium & Impedansi Mekanik",
                caption = "Dimas mengamati gelombang saat tali tipis disambung dengan tali tambat tebal.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Saat gelombang menabrak sambungan medium berdensitas beda, sebagian energi diteruskan dan sebagian dipantulkan balik! Perilakunya ditentukan oleh rasio Impedansi Mekanik Z = mu * v!",
                sceneVisualEmoji = "🪢",
                sceneDescription = "Pulsa gelombang terbagi menjadi gelombang pantul terbalik dan gelombang transmisi tegak."
            )
        ),
        intuitionTitle = "Mekanika Kontinum Gelombang: Persamaan Diferensial Parsial & Transmisi Impedansi",
        intuitionBody = "Gelombang mekanik adalah perambatan gangguan energi kinetik dan potensial yang terdistribusi secara kontinu melintasi medium elastis tanpa disertai perpindahan massa materi secara permanen.\n\n" +
                "1. Penurunan Persamaan Diferensial Parsial Gelombang 1 Dimensi:\n" +
                "   Tinjau elemen tali bermassa $dm = \\mu\\, dx$ di bawah tegangan $T$. Komponen gaya vertikal netto pada sudut kemiringan kecil $\\theta$:\n" +
                "   $$F_y = T \\sin(\\theta + d\\theta) - T \\sin\\theta \\approx T \\left( \\frac{\\partial y}{\\partial x}_{x+dx} - \\frac{\\partial y}{\\partial x}_x \\right) = T \\frac{\\partial^2 y}{\\partial x^2}\\, dx$$\n" +
                "   Berdasarkan Hukum II Newton $F_y = dm \\frac{\\partial^2 y}{\\partial t^2} = (\\mu\\, dx) \\frac{\\partial^2 y}{\\partial t^2}$:\n" +
                "   $$\\frac{\\partial^2 y}{\\partial x^2} = \\frac{1}{v^2} \\frac{\\partial^2 y}{\\partial t^2} \\quad \\text{dengan } v = \\sqrt{\\frac{T}{\\mu}}$$\n\n" +
                "2. Solusi Umum d'Alembert:\n" +
                "   Solusi umum persamaan gelombang 1D adalah superposisi dua gelombang sembarang:\n" +
                "   $$y(x, t) = f(x - vt) + g(x + vt)$$\n" +
                "   • $f(x - vt)$: Gelombang merambat ke arah sumbu-$x$ positif (maju).\n" +
                "   • $g(x + vt)$: Gelombang merambat ke arah sumbu-$x$ negatif (mundur).\n\n" +
                "3. Refleksi & Transmisi pada Batas Medium (Impedansi Gelombang $Z = \\mu v = \\sqrt{T \\mu}$):\n" +
                "   Ketika gelombang datang dari medium 1 menuju batas sambungan medium 2:\n" +
                "   • Koefisien Refleksi Amplitudo: $r = \\frac{A_r}{A_i} = \\frac{Z_1 - Z_2}{Z_1 + Z_2} = \\frac{v_2 - v_1}{v_2 + v_1}$.\n" +
                "     - Jika medium 2 lebih rapat/kaku ($Z_2 > Z_1$ / ujung terikat): $r < 0$ (terjadi pembalikan fase $\\pi$ / $180^\\circ$).\n" +
                "     - Jika medium 2 lebih ringan ($Z_2 < Z_1$ / ujung bebas): $r > 0$ (fase gelombang pantul tetap sama).\n" +
                "   • Koefisien Transmisi Amplitudo: $t = \\frac{A_t}{A_i} = \\frac{2 Z_1}{Z_1 + Z_2} = \\frac{2 v_2}{v_1 + v_2}$ (selalu sefase positif).\n\n" +
                "4. Transmisi Daya & Energi Gelombang:\n" +
                "   Daya rata-rata yang ditransmisikan oleh gelombang sinusoidal berfrekuensi $\\omega$ dan amplitudo $A$:\n" +
                "   $$P_{\\text{avg}} = \\frac{1}{2} \\mu v \\omega^2 A^2 = \\frac{1}{2} Z \\omega^2 A^2$$",
        intuitionPoints = listOf(
            "Pencocokan Impedansi (Impedance Matching, Z1 = Z2) menghasilkan koefisien refleksi nol (r = 0), artinya 100% daya gelombang terserap dan tertransmisikan tanpa ada energi yang terpantul balik!",
            "Gelombang berdiri (Standing Waves) adalah hasil interferensi superposisi antara gelombang datang dan gelombang pantul yang beramplitudo sama merambat berlawanan arah.",
            "Persamaan gelombang ini berbentuk linier, sehingga memenuhi Prinsip Superposisi: jika y1 dan y2 adalah solusi, maka kombinasi linier c1 y1 + c2 y2 juga pasti merupakan solusi yang sah."
        ),
        simId = "sim-wave-equation",
        formulas = listOf(
            FormulaCard(
                symbol = "\\frac{\\partial^2 y}{\\partial x^2}",
                equation = "\\frac{\\partial^2 y}{\\partial x^2} = \\frac{1}{v^2} \\frac{\\partial^2 y}{\\partial t^2} \\quad \\left( v = \\sqrt{\\frac{T}{\\mu}} \\right)",
                meaning = "Persamaan diferensial parsial gelombang kontinu 1 dimensi.",
                units = "m⁻¹",
                applicationNote = "T adalah tegangan mekanik tali dalam Newton, mu adalah massa linear per satuan panjang dalam kg/m."
            ),
            FormulaCard(
                symbol = "r_{\\text{refleksi}}",
                equation = "r = \\frac{Z_1 - Z_2}{Z_1 + Z_2}",
                meaning = "Koefisien refleksi amplitudo gelombang mekanik pada antarmuka dua medium.",
                units = "rasio tanpa dimensi",
                applicationNote = "Jika Z2 > Z1 (ujung lebih kaku), r bernilai negatif menandakan pembalikan fase 180 derajat."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Analisis Pantulan Gelombang Seismik Refleksi Survei Minyak Bumi Pertamina di Blok Cepu",
            context = "Eksplorasi cadangan minyak dan gas bumi di Blok Cepu Jawa Timur menggunakan truk vibroseis yang menghentakkan gelombang getaran akustik ke dalam lapisan kerak bumi.",
            engineeringProblem = "Mengidentifikasi batas antarmuka lapisan batuan perangkap hidrokarbon (reservoir batugamping) dari rekaman sensor geofon di permukaan tanah.",
            physicalConceptUsed = "Hukum refleksi gelombang kontinu impedansi akustik Z = rho * v: lapisan minyak dan gas memiliki impedansi akustik yang jauh lebih rendah daripada batuan padat sekitarnya.",
            mathematicalModel = "Mengukur koefisien refleksi r = (Z2 - Z1) / (Z2 + Z1) dan waktu tempuh gelombang pantul dua arah (Two-Way Travel Time / TWT) untuk merekonstruksi citra penampang seismik 3D bawah tanah.",
            realWorldImpact = "Menemukan cadangan minyak mentah raksasa ratusan juta barel di Lapangan Banyu Urip yang menopang 25% produksi minyak nasional Indonesia.",
            relatedCareers = listOf("Geofisikawan Seismik Refleksi", "Pemroses Data Seismik Migas", "Analis Interpretasi Reservoir"),
            verifiedSource = "Pusat Riset Geoteknologi BRIN & PT Pertamina EP Cepu."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Pembalikan Fase Gelombang Pantul pada Ujung Terikat vs Ujung Bebas Tali",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 utas tali tambang jemuran plastik atau tali nilon panjang 3–4 meter",
                "Tiang pintu atau pegangan tangga kokoh untuk mengikat ujung tali",
                "Benang jahit tipis atau cincin gantungan kunci (untuk simulasi ujung bebas)"
            ),
            steps = listOf(
                "Langkah 1: Ikat salah satu ujung tali secara mati kencang pada tiang pegangan tangga (Ujung Terikat Sempurna). Rentangkan tali lurus mendatar.",
                "Langkah 2: Sentakkan ujung tali di tanganmu ke atas dengan cepat satu kali untuk membuat pulsa gelombang tunggal mengarah ke atas.",
                "Langkah 3: Amati saat pulsa gelombang menabrak ikatan tiang: pulsa terpantul balik ke arahmu dalam posisi TERBALIK MENGHADAP KE BAWAH (Pembalikan Fase 180° / r < 0)!",
                "Langkah 4: Sekarang ganti ikatan ujung tiang: pasang cincin gantungan kunci pada tiang vertikal sehingga ujung tali bisa meluncur naik-turun bebas tanpa gesekan (Ujung Bebas).",
                "Langkah 5: Kirimkan pulsa gelombang ke atas lagi: amati saat menabrak tiang, cincin meluncur ke atas dan pulsa terpantul balik TETAP MENGHADAP KE ATAS (Tanpa Pembalikan Fase / r > 0)!"
            ),
            observationGoal = "Menyaksikan secara langsung perbedaan kondisi batas gelombang mekanik antara pembalikan fase ujung terikat dan pemeliharaan fase ujung bebas.",
            connectionToSimulation = "Bandingkan pantulan talimu dengan simulator persamaan gelombang d'Alembert di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-gel-kont-1",
                prompt = "Sebuah dawai kawat baja memiliki tegangan T = 200 N dan kerapatan massa per satuan panjang mu = 0,02 kg/m. Berapakah cepat rambat gelombang transversal yang merambat pada dawai tersebut?",
                type = "numeric",
                correctAnswer = "100",
                tolerance = 1f,
                unit = "m/s",
                hints = listOf(
                    "Gunakan rumus cepat rambat gelombang dawai: v = akar(T / mu).",
                    "v = akar(200 / 0,02) = akar(10.000) = ...?"
                ),
                explanation = "Cepat rambat gelombang transversal pada dawai adalah v = √(T / μ) = √(200 / 0,02) = √10.000 = 100 m/s.",
                misconception = "Mengalikan tegangan dengan massa linier alih-alih membaginya."
            ),
            QuizQuestion(
                id = "q-gel-kont-2",
                prompt = "Sebuah pulsa gelombang transversal pada tali merambat menuju sambungan dengan tali kedua yang memiliki impedansi mekanik jauh lebih besar (Z2 > Z1). Bagaimanakah karakteristik fase gelombang yang dipantulkan kembali ke medium pertama?",
                type = "multiple_choice",
                options = [
                    "Gelombang pantul mengalami pembalikan fase sebesar 180 derajat (terbalik)",
                    "Gelombang pantul mempertahankan fase yang sama persis (tidak terbalik)",
                    "Gelombang pantul berhenti total dan energinya lenyap seketika",
                    "Frekuensi gelombang pantul meningkat menjadi dua kali lipat"
                ],
                correctAnswer = "Gelombang pantul mengalami pembalikan fase sebesar 180 derajat (terbalik)",
                hints = listOf(
                    "Rumus koefisien refleksi: r = (Z1 - Z2) / (Z1 + Z2).",
                    "Karena Z2 > Z1, pembilang (Z1 - Z2) bernilai negatif.",
                    "Tanda negatif pada amplitudo gelombang berarti pembalikan fase pi (180°)."
                ),
                explanation = "Ketika gelombang merambat dari medium berimpedansi rendah ke medium berimpedansi lebih tinggi (Z2 > Z1), koefisien refleksi r bernilai negatif (r < 0). Tanda negatif ini menandakan bahwa pulsa gelombang mengalami pembalikan fase sebesar 180° (setara ujung terikat).",
                misconception = "Mengira gelombang pantul selalu sefase dengan gelombang datang."
            )
        )
    )

    // =========================================================================
    // 6. TERMODINAMIKA FORMAL, GAS VAN DER WAALS & ENTROPI BOLTZMANN
    // =========================================================================
    private val termodinamikaFormalLesson = LessonData(
        conceptId = "fis-termodinamika-statistik-dasar",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pft1",
                panelNumber = 1,
                title = "Turbin Uap Superkritis PLTU Jawa-7 Serang",
                caption = "Kirana dan Dimas diajak studi lapangan ke Pembangkit Listrik Tenaga Uap Jawa-7 di Bojonegara Serang Banten.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Turbin raksasa PLTU ini beroperasi pada tekanan uap ekstrem 24 MPa dan suhu 600°C di atas titik kritis air! Pada kondisi ini, uap air bukan lagi gas ideal biasa!",
                sceneVisualEmoji = "🏭",
                sceneDescription = "Kompleks turbin uap superkritis bertekanan raksasa pembangkit listrik modern."
            ),
            StoryPanel(
                id = "pft2",
                panelNumber = 2,
                title = "Persamaan Gas Riil van der Waals",
                caption = "Kakek menjelaskan koreksi molekuler Johannes Diderik van der Waals.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Molekul gas riil bukan partikel titik hampa: mereka memiliki volume fisik sendiri (faktor b) dan saling tarik-menarik gaya van der Waals (faktor a)! Persamaan (P + a/V²)(V - b) = RT memprediksi kondensasi uap menjadi cair secara akurat!",
                sceneVisualEmoji = "⚛️",
                sceneDescription = "Molekul-molekul gas riil bervolume saling bertumbukan dan berinteraksi gaya tarik antar-molekul."
            ),
            StoryPanel(
                id = "pft3",
                panelNumber = 3,
                title = "Empat Potensial Termodinamika & Relasi Maxwell",
                caption = "Dimas mencatat jembatan matematika fungsi keadaan termodinamika.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Energi Dalam U, Entalpi H, Helmholtz F, dan Energi Bebas Gibbs G dihubungkan oleh Relasi Simetri Maxwell! Dari turunan parsial volume dan suhu, kita bisa mengetahui perubahan entropi tanpa harus mengukurnya langsung!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Diagram bujur sangkar termodinamika Born menghubungkan potensial U, H, F, G dan variabel S, V, P, T."
            ),
            StoryPanel(
                id = "pft4",
                panelNumber = 4,
                title = "Misteri Entropi Ludwig Boltzmann: S = k * ln(W)",
                caption = "Kakek menunjukkan batu nisan Ludwig Boltzmann di Wina yang terpahat rumus abadi.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Entropi bukan sekadar kalor dibagi suhu! Entropi adalah ukuran peluang mikroskopis: S = k_B * ln(Omega)! Alam semesta selalu bergerak menuju keadaan dengan jumlah susunan mikro (Omega) terbanyak: itulah panah waktu termodinamika!",
                sceneVisualEmoji = "🌌",
                sceneDescription = "Partikel-partikel gas menyebar acak memenuhi ruang mencerminkan peningkatan entropi semesta."
            )
        ),
        intuitionTitle = "Termodinamika Analitis & Statistik: Dari Siklus Makroskopis ke Peluang Mikroskopis",
        intuitionBody = "Termodinamika formal di perguruan tinggi memadukan kalkulus diferensial multivariabel dengan interpretasi probabilitas statistik atomik untuk menjelaskan arah spontanitas alam semesta.\n\n" +
                "1. Persamaan Keadaan Gas Riil van der Waals:\n" +
                "   Gas ideal mengabaikan volume molekul dan gaya antar-molekul. Johannes Diderik van der Waals memperhitungkan keduanya:\n" +
                "   $$\\left( P + \\frac{a}{V_m^2} \\right) (V_m - b) = RT$$\n" +
                "   • Parameter $a$: Mengoreksi gaya tarik-menarik antar-molekul (menurunkan tekanan yang menumbuk dinding wadah).\n" +
                "   • Parameter $b$: Volume eksklusi efektif yang ditempati oleh 1 mol molekul gas itu sendiri ($b \\approx 4 \\times \\text{volume molekul}$).\\n" +
                "   • Titik Kritis Gas: Titik di mana gas dan cairan tidak dapat dibedakan: $T_c = \\frac{8a}{27Rb}$, $P_c = \\frac{a}{27b^2}$, $V_c = 3b$.\n\n" +
                "2. Empat Potensial Termodinamika & Relasi Maxwell:\n" +
                "   Persamaan fundamental termodinamika mengintegrasikan Hukum I dan II ($dU = T dS - P dV$):\n" +
                "   • Energi Dalam: $dU = T dS - P dV$\n" +
                "   • Entalpi: $H = U + PV \\implies dH = T dS + V dP$\n" +
                "   • Energi Bebas Helmholtz: $F = U - TS \\implies dF = -S dT - P dV$ (Sistem volume konstan)\n" +
                "   • Energi Bebas Gibbs: $G = H - TS \\implies dG = -S dT + V dP$ (Sistem tekanan & suhu konstan)\n" +
                "   • Relasi Maxwell (Berdasarkan kesamaan turunan campuran parsial Schwartz $\\frac{\\partial^2 f}{\\partial x \\partial y} = \\frac{\\partial^2 f}{\\partial y \\partial x}$):\n" +
                "     $$\\left( \\frac{\\partial T}{\\partial V} \\right)_S = -\\left( \\frac{\\partial P}{\\partial S} \\right)_V \\quad , \\quad \\left( \\frac{\\partial S}{\\partial V} \\right)_T = \\left( \\frac{\\partial P}{\\partial T} \\right)_V$$\n\n" +
                "3. Fondasi Statistik Entropi Ludwig Boltzmann:\n" +
                "   Entropi makroskopis $dS = \\frac{đQ_{\\text{rev}}}{T}$ terhubung ke dunia atomik melalui rumus Boltzmann:\n" +
                "   $$S = k_B \\ln \\Omega$$\n" +
                "   di mana $k_B = 1,3806 \\times 10^{-23}$ J/K dan $\\Omega$ adalah jumlah konfigurasi keadaan mikro (*microstates*) yang bersesuaian dengan keadaan makro sistem. Sistem selalu berevolusi menuju keadaan dengan $\\Omega$ maksimum (peluang terbesar).",
        intuitionPoints = listOf(
            "Mengapa gas yang mengembang bebas ke ruang hampa mengalami peningkatan entropi padahal tidak ada kalor yang diserap (Q = 0)? Karena volume yang membesar memberikan jumlah posisi mikro (Omega) yang berlipat ganda jauh lebih banyak!",
            "Kriteria spontanitas proses pada suhu dan tekanan konstan (kondisi bumi sehari-hari) adalah penurunan Energi Bebas Gibbs (dG < 0); kesetimbangan tercapai saat G berada pada titik minimum mutlak.",
            "Hukum Ketiga Termodinamika (Nernst): Pada suhu nol mutlak (T = 0 Kelvin), kristal murni sempurna hanya memiliki satu keadaan mikro tunggal (Omega = 1), sehingga entropinya tepat bernilai nol (S = kB ln 1 = 0)."
        ),
        simId = "sim-entropy-vanderwaals",
        formulas = listOf(
            FormulaCard(
                symbol = "S",
                equation = "S = k_B \\ln \\Omega",
                meaning = "Persamaan Entropi Statistik Ludwig Boltzmann.",
                units = "Joule/Kelvin (J/K)",
                applicationNote = "kB adalah konstanta Boltzmann, Omega adalah cacah jumlah keadaan mikro kompatibel sistem."
            ),
            FormulaCard(
                symbol = "\\left(\\frac{\\partial S}{\\partial V}\\right)_T",
                equation = "\\left( \\frac{\\partial S}{\\partial V} \\right)_T = \\left( \\frac{\\partial P}{\\partial T} \\right)_V",
                meaning = "Salah satu Relasi Simetri Termodinamika Maxwell.",
                units = "J/(K·m³)",
                applicationNote = "Menghubungkan perubahan entropi terhadap volume yang sulit diukur dengan laju perubahan tekanan terhadap suhu yang mudah diukur."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Analisis Efisiensi Termal Turbin Uap Superkritis PLTU Jawa-7 Serang Banten",
            context = "PLTU Jawa-7 berkapasitas 2 x 1.000 MW menggunakan teknologi boiler batubara ultra-supercritical (USC) untuk menyuplai 10% kebutuhan listrik sistem interkoneksi Jawa-Bali.",
            engineeringProblem = "Mengoptimalkan siklus Rankine pemanasan ulang ganda (double reheat) mendekati efisiensi teoritis Carnot pada tekanan uap 24,1 MPa.",
            physicalConceptUsed = "Termodinamika uap air non-ideal persamaan formulasi IAPWS-IF97: analisis entalpi h dan energi bebas Gibbs g uap lewat jenuh pada turbin tekanan tinggi.",
            mathematicalModel = "Menghitung neraca entropi generator pembangkit: laju pembentukan entropi irreversibilitas (S_gen) diminimalkan pada kondensor pendingin air laut Teluk Banten.",
            realWorldImpact = "Mencapai efisiensi termal neto 42,5% (jauh di atas PLTU subkritis biasa 33%), menghemat 1,2 juta ton konsumsi batubara per tahun dan memangkas jutaan ton emisi gas CO₂.",
            relatedCareers = listOf("Insinyur Termodinamika Pembangkit Listrik", "Spesialis Efisiensi Energi Termal", "Auditor Siklus Panas Industri"),
            verifiedSource = "PT Shenhua Guohua Pembangkitan Jawa Bali (SGPJB) & PT PLN (Persero) Puslitbang."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Penurunan Suhu Akibat Ekspansi Gas Kaleng Semprot (Efek Joule-Thomson Sederhana)",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 kaleng aerosol terkompresi (seperti semprotan pembersih debu komputer / air duster, atau deodoran semprot)",
                "Termometer digital inframerah (atau termometer badan/ruangan)",
                "Kain lap kering"
            ),
            steps = listOf(
                "Langkah 1: Ukur suhu awal permukaan badan kaleng aerosol pada suhu ruangan kamar (misal: 28°C).",
                "Langkah 2: Semprotkan gas keluar secara kontinu selama 10–15 detik ke arah ruang kosong yang aman.",
                "Langkah 3: Raba badan kaleng: kaleng seketika terasa sangat dingin menggigit seperti es batu! Ukur suhunya dengan termometer: suhu bisa anjlok hingga 10°C atau bahkan mendekati 0°C!",
                "Langkah 4: Fenomena pendinginan ini disebut Efek Joule-Thomson: saat gas riil berekspansi cepat melalui nosel katup, molekul gas saling menjauh melawan gaya tarik van der Waals antar-molekul.",
                "Langkah 5: Karena kerja pemisahan molekul ini dilakukan tanpa input kalor luar (adiabatik q = 0), energi kinetik rata-rata molekul berkurang drastis sehingga suhu makroskopis gas anjlok dingin!"
            ),
            observationGoal = "Menyaksikan bukti fisik keberadaan gaya tarik antar-molekul gas riil van der Waals yang memicu penurunan suhu saat ekspansi bebas adiabatik.",
            connectionToSimulation = "Bandingkan pendinginan kalengmu dengan kurva inversi Joule-Thomson pada simulator termodinamika di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-termo-form-1",
                prompt = "Pada persamaan gas riil van der Waals (P + a/V²)(V - b) = RT, parameter koreksi 'a' secara fisis merepresentasikan...",
                type = "multiple_choice",
                options = [
                    "Koreksi terhadap gaya tarik-menarik antar-molekul gas",
                    "Volume fisik yang ditempati oleh molekul-molekul gas itu sendiri",
                    "Laju pemuaian termal gas pada tekanan tetap",
                    "Kecepatan rata-rata molekul gas saat bertumbukan"
                ],
                correctAnswer = "Koreksi terhadap gaya tarik-menarik antar-molekul gas",
                hints = listOf(
                    "Parameter a ditambahkan ke tekanan P.",
                    "Gaya tarik antar-molekul menarik partikel ke dalam sehingga sedikit mengurangi tekanan tumbukan dinding wadah."
                ),
                explanation = "Parameter a pada persamaan van der Waals mengoreksi gaya tarik-menarik (interaksi kohesif) antar molekul gas riil, sedangkan parameter b mengoreksi volume eksklusi efektif yang ditempati oleh materi molekul itu sendiri.",
                misconception = "Tertukar antara parameter a (gaya tarik) dan parameter b (volume fisik molekul)."
            ),
            QuizQuestion(
                id = "q-termo-form-2",
                prompt = "Jika suatu sistem termodinamika mikroskopis memiliki jumlah keadaan mikro konfigurasi Omega = 1 (hanya memiliki 1 kemungkinan susunan partikel tunggal pada kristal murni suhu 0 K), berapakah nilai entropi statistik Boltzmann sistem tersebut?",
                type = "numeric",
                correctAnswer = "0",
                tolerance = 0.01f,
                unit = "J/K",
                hints = listOf(
                    "Gunakan rumus Boltzmann: S = k_B · ln(Omega).",
                    "Omega = 1.",
                    "ln(1) = ...?"
                ),
                explanation = "Berdasarkan persamaan Ludwig Boltzmann S = k_B · ln(Omega), jika Omega = 1, maka S = k_B · ln(1) = k_B · 0 = 0 J/K. Inilah fondasi matematis Hukum Ketiga Termodinamika Nernst.",
                misconception = "Mengira hasilnya bernilai konstanta k_B (lupa bahwa logaritma natural dari 1 bernilai nol)."
            )
        )
    )

    // =========================================================================
    // 7. ELEKTROMAGNETIKA DIFERENSIAL & ARUS PERGESERAN MAXWELL
    // =========================================================================
    private val elektromagnetikDiferensialLesson = LessonData(
        conceptId = "fis-medan-elektromagnetik-maxwell-dasar",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pfe_d1",
                panelNumber = 1,
                title = "Gardu Induk Tegangan Ekstra Tinggi 500 kV",
                caption = "Kirana dan Dimas mengunjungi Gardu Induk PLN Cawang Jakarta yang menyalurkan listrik SUTET 500.000 Volt.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kabel transmisi raksasa ini berdengung keras dan dikelilingi medan listrik serta medan magnet tak kasat mata. Bagaimana menghitung medan di setiap koordinat ruang tiga dimensi secara presisi?",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Trafo daya raksasa dan konduktor kawat bertegangan tinggi di gardu induk transmisi listrik."
            ),
            StoryPanel(
                id = "pfe_d2",
                panelNumber = 2,
                title = "Hukum Gauss & Persamaan Poisson",
                caption = "Kakek menuliskan bentuk diferensial medan elektrostatik.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Bentuk diferensial Hukum Gauss adalah ∇ · E = rho / epsilon_0! Hubungan medan dengan potensial E = -∇V melahirkan Persamaan Poisson: ∇²V = -rho / epsilon_0! Persamaan diferensial parsial inilah yang memetakan seluruh tegangan listrik!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Garis-garis fluks medan listrik memancar simetris keluar dari kumpulan muatan ruang rapat rho."
            ),
            StoryPanel(
                id = "pfe_d3",
                panelNumber = 3,
                title = "Paradoks Pengisian Kapasitor Ampere",
                caption = "Dimas menganalisis Hukum Ampere pada celah di antara dua keping kapasitor.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Tunggu! Hukum Ampere lama ∇ × B = mu_0 * J menyatakan medan magnet hanya tercipta oleh arus kawat. Tapi di celah ruang hampa antar-keping kapasitor, tidak ada arus kawat yang mengalir, padahal jarum kompas tetap menyimpang!",
                sceneVisualEmoji = "🧩",
                sceneDescription = "Arus kawat terputus pada celah kapasitor keping sejajar tetapi medan magnet tetap melingkar terdeteksi."
            ),
            StoryPanel(
                id = "pfe_d4",
                panelNumber = 4,
                title = "Sentuhan Jenius Maxwell: Arus Pergeseran",
                caption = "Kirana tersenyum menjelaskan kontribusi terbesar James Clerk Maxwell tahun 1861.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Maxwell menyadari bahwa MEDAN LISTRIK YANG BERUBAH TERHADAP WAKTU (dE/dt) bertindak persis seperti arus listrik nyata! Arus Pergeseran J_D = epsilon_0 * dE/dt inilah yang melengkapi simetri alam semesta!",
                sceneVisualEmoji = "✨",
                sceneDescription = "Empat persamaan diferensial Maxwell terpahat megah menyatukan medan listrik dan magnet."
            )
        ),
        intuitionTitle = "Fondasi Klasik Elektromagnetika: Bentuk Diferensial Persamaan Maxwell",
        intuitionBody = "Elektromagnetika klasik mencapai unifikasi sempurna ketika James Clerk Maxwell merumuskan empat persamaan diferensial vektor parsial yang merangkum seluruh hukum kelistrikan dan kemagnetan.\n\n" +
                "1. Bentuk Diferensial Medan Elektrostatik & Magnetostatik:\n" +
                "   • Hukum I: Hukum Gauss untuk Elektrostatik:\n" +
                "     $$\\nabla \\cdot \\mathbf{E} = \\frac{\\rho}{\\epsilon_0}$$\n" +
                "     Muatan listrik $\\rho$ adalah sumber divergensi medan listrik. Menggabungkannya dengan hubungan $\\mathbf{E} = -\\nabla V$ menghasilkan Persamaan Poisson:\n" +
                "     $$\\nabla^2 V = -\\frac{\\rho}{\\epsilon_0} \\quad (\\text{Persamaan Laplace } \\nabla^2 V = 0 \\text{ di ruang hampa})$$\n" +
                "   • Hukum II: Hukum Gauss untuk Magnetisme:\n" +
                "     $$\\nabla \\cdot \\mathbf{B} = 0$$\n" +
                "     Tidak ada monopol magnetik di alam (garis medan magnet selalu berupa loop tertutup tanpa titik awal/akhir).\n" +
                "   • Hukum III: Hukum Induksi Faraday:\n" +
                "     $$\\nabla \\times \\mathbf{E} = -\\frac{\\partial \\mathbf{B}}{\\partial t}$$\n" +
                "     Perubahan fluks medan magnet terhadap waktu menginduksi pusaran rotasi medan listrik non-konservatif.\n\n" +
                "2. Paradoks Hukum Ampere & Arus Pergeseran Maxwell:\n" +
                "   Hukum Ampere klasik $\\nabla \\times \\mathbf{B} = \\mu_0 \\mathbf{J}$ memiliki kelemahan matematis fatal: jika kedua sisi dikenai operasi divergensi, sisi kiri bernilai nol identitas $\\nabla \\cdot (\\nabla \\times \\mathbf{B}) = 0$, tetapi sisi kanan $\\nabla \\cdot \\mathbf{J} = -\\frac{\\partial \\rho}{\\partial t} \\neq 0$ melanggar Persamaan Kontinuitas Muatan pada arus bolak-balik!\n" +
                "   • Solusi Maxwell: Menambahkan suku Arus Pergeseran (*Displacement Current*):\n" +
                "     $$\\mathbf{J}_D = \\epsilon_0 \\frac{\\partial \\mathbf{E}}{\\partial t}$$\n" +
                "   • Hukum Ampere-Maxwell Lengkap:\n" +
                "     $$\\nabla \\times \\mathbf{B} = \\mu_0 \\mathbf{J} + \\mu_0 \\epsilon_0 \\frac{\\partial \\mathbf{E}}{\\partial t}$$\n\n" +
                "3. Medan dalam Material Dielektrik & Magnetik:\n" +
                "   • Vektor Perpindahan Listrik $\\mathbf{D} = \\epsilon_0 \\mathbf{E} + \\mathbf{P}$ (menghilangkan pengaruh muatan terikat polarisasi $\\rho_b$ sehingga $\\nabla \\cdot \\mathbf{D} = \\rho_f$).\n" +
                "   • Medan Magnetik Pembantu $\\mathbf{H} = \\frac{1}{\\mu_0}\\mathbf{B} - \\mathbf{M}$ (sehingga $\\nabla \\times \\mathbf{H} = \\mathbf{J}_f$).",
        intuitionPoints = listOf(
            "Persamaan Laplace ∇²V = 0 memiliki Sifat Nilai Rata-rata: nilai potensial di suatu titik selalu sama persis dengan nilai rata-rata potensial pada bola yang melingkupinya; tidak ada titik maksimum atau minimum lokal di dalam ruang bebas muatan!",
            "Arus pergeseran Maxwell BUKAN pergerakan fisik muatan elektron, melainkan laju perubahan fluks listrik yang menghasilkan medan magnet melingkar persis seperti kawat berarus nyata.",
            "Persamaan Maxwell dalam bentuk diferensial bersifat lokal: nilai turunan di suatu titik ruang hanya ditentukan oleh kerapatan muatan dan laju perubahan medan tepat di titik tersebut."
        ),
        simId = "sim-maxwell-equations",
        formulas = listOf(
            FormulaCard(
                symbol = "\\nabla \\cdot \\mathbf{E}",
                equation = "\\nabla \\cdot \\mathbf{E} = \\frac{\\rho}{\\epsilon_0} \\quad \\iff \\quad \\nabla^2 V = -\\frac{\\rho}{\\epsilon_0}",
                meaning = "Hukum Gauss diferensial dan Persamaan Poisson elektrostatik.",
                units = "V/m²",
                applicationNote = "Persamaan Poisson menentukan profil potensial elektrostatik dari distribusi muatan ruang rho."
            ),
            FormulaCard(
                symbol = "\\nabla \\times \\mathbf{B}",
                equation = "\\nabla \\times \\mathbf{B} = \\mu_0 \\mathbf{J} + \\mu_0 \\epsilon_0 \\frac{\\partial \\mathbf{E}}{\\partial t}",
                meaning = "Hukum Ampere-Maxwell lengkap memuat suku arus pergeseran.",
                units = "Tesla / meter",
                applicationNote = "Menjamin kekekalan muatan kontinuitas dan memprediksi keberadaan gelombang elektromagnetik."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Desain Perisai Sangkar Faraday dan Sensor Pembumian SUTET 500 kV PLN Jawa-Bali",
            context = "Saluran Udara Tegangan Ekstra Tinggi (SUTET) 500 kV mengalirkan daya listrik gigawatt melintasi permukiman penduduk dengan batas aman medan listrik < 5 kV/m.",
            engineeringProblem = "Menghitung distribusi medan listrik dan arus induksi kapasitif pada struktur menara transmisi baja dan bangunan warga di bawah konduktor fasa.",
            physicalConceptUsed = "Solusi numerik Persamaan Laplace ∇²V = 0 metode elemen hingga (Finite Element Method / FEM) dengan syarat batas Dirichlet potensial konduktor 500 kV dan tanah nol volt.",
            mathematicalModel = "Mengintegrasikan fluks perpindahan listrik D pada permukaan atap seng bangunan membuktikan efektivitas kawat pelindung tanah (ground wire) mereduksi medan listrik hingga 90%.",
            realWorldImpact = "Menjamin kepatuhan standar keselamatan radiasi medan elektromagnetik WHO dan Kementerian Kesehatan bagi jutaan masyarakat di koridor transmisi nasional.",
            relatedCareers = listOf("Insinyur Sistem Tegangan Ekstra Tinggi", "Analis Kompatibilitas Elektromagnetik (EMC)", "Spesialis Proteksi Petir Gardu Induk"),
            verifiedSource = "PT PLN (Persero) Pusat Penyaluran dan Pengatur Beban (P2B) Jawa Bali."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Sifat Proteksi Sangkar Faraday Menggunakan Smartphone & Kertas Aluminium Foil",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "2 buah smartphone (Ponsel A dan Ponsel B)",
                "1 lembar kertas aluminium foil dapur (lebar ~30 x 30 cm)"
            ),
            steps = listOf(
                "Langkah 1: Letakkan Ponsel A di atas meja dalam kondisi sinyal seluler dan WiFi menyala normal.",
                "Langkah 2: Hubungi nomor telepon Ponsel A menggunakan Ponsel B: Ponsel A berdering normal menerima gelombang EM.",
                "Langkah 3: Sekarang bungkus rapat seluruh badan Ponsel A dengan 2 lapis kertas aluminium foil dapur hingga tertutup rapat tanpa celah.",
                "Langkah 4: Hubungi kembali nomor Ponsel A menggunakan Ponsel B: operator akan langsung menjawab 'Nomor yang Anda tuju sedang berada di luar jangkauan'!",
                "Langkah 5: Buka bungkus foil: Ponsel A seketika mendapat sinyal kembali! Ini membuktikan Hukum Gauss diferensial: muatan bebas pada konduktor aluminium mengatur diri seketika meniadakan medan listrik di rongga dalamnya (E_dalam = 0 / Sangkar Faraday)!"
            ),
            observationGoal = "Membuktikan konsekuensi fisis Hukum Gauss bahwa medan listrik dan gelombang elektromagnetik tidak dapat menembus rongga di dalam konduktor tertutup sempurna.",
            connectionToSimulation = "Bandingkan peluruhan medan ponselmu dengan simulator sangkar Faraday di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-em-dif-1",
                prompt = "Manakah dari modifikasi berikut yang ditambahkan oleh James Clerk Maxwell ke dalam Hukum Ampere sehingga melahirkan persamaan Ampere-Maxwell yang utuh dan simetris?",
                type = "multiple_choice",
                options = [
                    "Suku arus pergeseran (mu_0 * epsilon_0 * dE/dt) yang dipicu oleh perubahan medan listrik terhadap waktu",
                    "Suku muatan monopol magnetik",
                    "Suku gaya gesek mekanik fluida",
                    "Suku potensial gravitasi Newton"
                ],
                correctAnswer = "Suku arus pergeseran (mu_0 * epsilon_0 * dE/dt) yang dipicu oleh perubahan medan listrik terhadap waktu",
                hints = listOf(
                    "Suku ini mengatasi pelanggaran kontinuitas arus pada kapasitor.",
                    "Berkaitan dengan turunan parsial medan listrik terhadap waktu."
                ),
                explanation = "Maxwell menambahkan suku arus pergeseran mu_0 * epsilon_0 * (∂E/∂t) pada persamaan rotasi medan magnet ∇ × B untuk menjamin kekekalan muatan (persamaan kontinuitas) ketika medan listrik bervariasi terhadap waktu.",
                misconception = "Mengira Maxwell menemukan monopol magnetik (padahal ∇ · B = 0 tetap menyatakan tidak ada monopol magnet)."
            ),
            QuizQuestion(
                id = "q-em-dif-2",
                prompt = "Persamaan diferensial parsial elektrostatik yang menyatakan bahwa laplacian potensial listrik bernilai nol (∇²V = 0) pada seluruh wilayah ruang yang bebas dari muatan listrik dinamakan...",
                type = "multiple_choice",
                options = [
                    "Persamaan Laplace",
                    "Persamaan Poisson",
                    "Persamaan Navier-Stokes",
                    "Persamaan Schrödinger"
                ],
                correctAnswer = "Persamaan Laplace",
                hints = listOf(
                    "Bentuk khusus dari Persamaan Poisson saat massa jenis muatan rho = 0.",
                    "Dinamai dari matematikawan Prancis Pierre-Simon Laplace."
                ),
                explanation = "Persamaan Poisson ∇²V = -rho / epsilon_0 bertransformasi menjadi Persamaan Laplace ∇²V = 0 ketika tidak ada muatan bebas (rho = 0) di dalam ruang yang ditinjau.",
                misconception = "Tertukar antara Persamaan Laplace (rho = 0) dan Persamaan Poisson (rho ≠ 0)."
            )
        )
    )

    // =========================================================================
    // 8. PERSAMAAN GELOMBANG MAXWELL & VEKTOR POYNTING
    // =========================================================================
    private val gelombangEmPoyntingLesson = LessonData(
        conceptId = "fis-gelombang-em-poynting",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pfe_p1",
                panelNumber = 1,
                title = "Misteri Kecepatan Cahaya di Ruang Hampa",
                caption = "Kakek menunjukkan manuskrip kalkulasi Maxwell tahun 1865.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ketika Maxwell menggabungkan curl dari persamaan induksinya di ruang hampa tanpa muatan, ia memperoleh persamaan gelombang murni! Dan cepat rambat gelombangnya v = 1 / akar(epsilon_0 * mu_0) menghasilkan tepat 300.000 km/detik: persis kecepatan cahaya!",
                sceneVisualEmoji = "💡",
                sceneDescription = "Persamaan gelombang elektromagnetik bersinar terang memperlihatkan hubungan konstanta kelistrikan dan cahaya."
            ),
            StoryPanel(
                id = "pfe_p2",
                panelNumber = 2,
                title = "Tarian Medan E dan B yang Saling Melahirkan",
                caption = "Dimas mengamati animasi 3D gelombang elektromagnetik transversal.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Perubahan medan E melahirkan medan B, dan perubahan medan B melahirkan medan E! Keduanya merambat saling tegak lurus sefase bersama-sama menembus kehampaan angkasa luar tanpa membutuhkan medium zat perantara!",
                sceneVisualEmoji = "🌊",
                sceneDescription = "Medan listrik E vertikal dan medan magnet B horizontal merambat saling tegak lurus ke arah sumbu z."
            ),
            StoryPanel(
                id = "pfe_p3",
                panelNumber = 3,
                title = "Aliran Energi: Vektor Poynting S",
                caption = "Kirana menghitung energi radiasi sinar matahari yang jatuh di panel surya atap rumah.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Vektor Poynting S = (1/mu_0) * (E × B) menunjukkan arah dan laju aliran daya gelombang EM per meter persegi! Di khatulistiwa Indonesia, intensitas Vektor Poynting matahari mencapai 1.000 Watt per meter persegi!",
                sceneVisualEmoji = "☀️",
                sceneDescription = "Sinar matahari membawa fluks daya vektor Poynting menyinari modul panel surya silikon."
            ),
            StoryPanel(
                id = "pfe_p4",
                panelNumber = 4,
                title = "Tekanan Radiasi & Layar Surya Antariksa",
                caption = "Dimas membayangkan wahana antariksa bertenaga layar surya (Solar Sail).",
                dialogueSpeaker = "Dimas",
                dialogueText = "Cahaya tidak bermassa diam, tapi cahaya membawa momentum p = E/c! Tekanan radiasi foton ini mampu mendorong wahana antariksa berlayar melintasi tata surya tanpa setetes pun bahan bakar kimia!",
                sceneVisualEmoji = "⛵",
                sceneDescription = "Wahana antariksa membentangkan layar reflektif raksasa didorong tekanan radiasi foton matahari."
            )
        ),
        intuitionTitle = "Cahaya Adalah Gelombang Elektromagnetik: Unifikasi Terbesar Fisika Abad 19",
        intuitionBody = "Penemuan terbesar James Clerk Maxwell adalah membuktikan bahwa cahaya tampak, sinar-X, gelombang radio, dan inframerah semuanya adalah manifestasi tunggal dari gelombang elektromagnetik yang merambat sendiri (*self-propagating*).\n\n" +
                "1. Penurunan Persamaan Gelombang Elektromagnetik di Ruang Hampa:\n" +
                "   Di ruang hampa tanpa muatan ($\\rho = 0$) dan tanpa arus ($\\mathbf{J} = \\mathbf{0}$):\n" +
                "   1. $\\nabla \\cdot \\mathbf{E} = 0$\n" +
                "   2. $\\nabla \\cdot \\mathbf{B} = 0$\n" +
                "   3. $\\nabla \\times \\mathbf{E} = -\\frac{\\partial \\mathbf{B}}{\\partial t}$\n" +
                "   4. $\\nabla \\times \\mathbf{B} = \\mu_0 \\epsilon_0 \\frac{\\partial \\mathbf{E}}{\\partial t}$\n" +
                "   Ambil curl dari persamaan (3):\n" +
                "   $$\\nabla \\times (\\nabla \\times \\mathbf{E}) = \\nabla(\\nabla \\cdot \\mathbf{E}) - \\nabla^2 \\mathbf{E} = -\\frac{\\partial}{\\partial t}(\\nabla \\times \\mathbf{B})$$\n" +
                "   Karena $\\nabla \\cdot \\mathbf{E} = 0$, substitusikan persamaan (4):\n" +
                "   $$-\\nabla^2 \\mathbf{E} = -\\frac{\\partial}{\\partial t}\\left( \\mu_0 \\epsilon_0 \\frac{\\partial \\mathbf{E}}{\\partial t} \\right) \\implies \\nabla^2 \\mathbf{E} = \\mu_0 \\epsilon_0 \\frac{\\partial^2 \\mathbf{E}}{\\partial t^2}$$\n" +
                "   Ini adalah persamaan diferensial gelombang 3 dimensi $\\nabla^2 \\mathbf{E} = \\frac{1}{c^2} \\frac{\\partial^2 \\mathbf{E}}{\\partial t^2}$ dengan kecepatan rambat:\n" +
                "   $$c = \\frac{1}{\\sqrt{\\mu_0 \\epsilon_0}} = \\frac{1}{\\sqrt{(4\\pi \\times 10^{-7})(8,854 \\times 10^{-12})}} \\approx 2,998 \\times 10^8 \\text{ m/s}$$\n\n" +
                "2. Sifat Gelombang Elektromagnetik Transversal:\n" +
                "   • Medan $\\mathbf{E}$ dan medan $\\mathbf{B}$ saling tegak lurus satu sama lain dan keduanya tegak lurus terhadap arah rambat $\\mathbf{k}$ (Gelombang Transversal).\n" +
                "   • Hubungan amplitudo medan pada setiap saat: $E = c B$.\n\n" +
                "3. Aliran Energi & Vektor Poynting:\n" +
                "   Fluks daya energi gelombang elektromagnetik per satuan luas dinyatakan oleh Vektor Poynting $\\mathbf{S}$:\n" +
                "   $$\\mathbf{S} = \\frac{1}{\\mu_0} (\\mathbf{E} \\times \\mathbf{B})$$\n" +
                "   • Satuan: $\\text{Watt/m}^2$.\n" +
                "   • Intensitas rata-rata gelombang sinusoidal: $I = \\langle S \\rangle = \\frac{E_{\\text{max}} B_{\\text{max}}}{2\\mu_0} = \\frac{E_{\\text{max}}^2}{2\\mu_0 c} = \\frac{1}{2} c \\epsilon_0 E_{\\text{max}}^2$.\n\n" +
                "4. Tekanan Radiasi (*Radiation Pressure*):\n" +
                "   Gelombang elektromagnetik membawa momentum linear $p = \\frac{U}{c}$.\n" +
                "   • Penyerapan Sempurna (*Blackbody*): $P_{\\text{rad}} = \\frac{I}{c}$.\n" +
                "   • Pemantulan Sempurna (*Cermin*): $P_{\\text{rad}} = \\frac{2I}{c}$.",
        intuitionPoints = listOf(
            "Cahaya matahari membawa daya 1.360 W/m² di orbit bumi, menghasilkan gaya dorong tekanan radiasi sekitar 9 mikroNewton per meter persegi pada layar cermin reflektif.",
            "Konstanta permitivitas vakum ε0 dan permeabilitas vakum μ0 yang diukur dari eksperimen listrik statis dan magnet kawat secara ajaib memprediksi kecepatan cahaya mutlak di ruang angkasa!",
            "Ekor komet selalu menjauh dari matahari terlepas dari arah gerak lintasannya karena terdorong oleh tekanan radiasi foton dan angin partikel matahari."
        ),
        simId = "sim-poynting-vector",
        formulas = listOf(
            FormulaCard(
                symbol = "c",
                equation = "c = \\frac{1}{\\sqrt{\\mu_0 \\epsilon_0}} \\approx 3 \\times 10^8 \\text{ m/s}",
                meaning = "Kecepatan perambatan gelombang elektromagnetik dalam ruang hampa menurut unifikasi Maxwell.",
                units = "m/s",
                applicationNote = "Menghubungkan konstanta elektrostatik permitivitas dan magnetostatik permeabilitas dengan laju cahaya."
            ),
            FormulaCard(
                symbol = "\\mathbf{S}",
                equation = "\\mathbf{S} = \\frac{1}{\\mu_0} (\\mathbf{E} \\times \\mathbf{B}) \\quad , \\quad I = \\frac{E_0^2}{2 \\mu_0 c}",
                meaning = "Vektor Poynting kerapatan fluks daya radiasi gelombang elektromagnetik.",
                units = "Watt/m²",
                applicationNote = "Arah vektor S menunjukkan arah perambatan energi gelombang (aturan tangan kanan E ke B)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kalkulasi Daya Fluks Vektor Poynting Antena Pemancar Satelit Komunikasi Telkom-4 Merah Putih",
            context = "Satelit geostasioner Telkom-4 Merah Putih di ketinggian 36.000 km memancarkan sinyal gelombang mikro pita C-band daya 60 transponder untuk konektivitas internet Nusantara.",
            engineeringProblem = "Menentukan intensitas daya minimum Vektor Poynting (Power Flux Density / PFD) yang diterima stasiun bumi parabola di pulau terluar agar rasio Carrier-to-Noise (C/N) memenuhi batas ambang penerimaan.",
            physicalConceptUsed = "Hukum perambatan gelombang elektromagnetik dan diversitas vektor Poynting bebas hambatan: atenuasi ruang bebas (Free Space Path Loss) FSPL = (4*pi*d / lambda)².",
            mathematicalModel = "Daya isotropis terpancar ekuivalen (EIRP) 42 dBW pada jarak 36.000 km menghasilkan fluks daya Vektor Poynting I ≈ 10⁻¹¹ W/m² di permukaan tanah yang diamplifikasi antena parabola LNB.",
            realWorldImpact = "Menjamin kestabilan koneksi perbankan ATM, komunikasi seluler 4G, dan jaringan pertahanan radar maritim di seluruh pelosok pulau Indonesia.",
            relatedCareers = listOf("Insinyur Sistem Transmisi Satelit RF", "Spesialis Propagasi Gelombang Mikro", "Perancang Antena Telekomunikasi"),
            verifiedSource = "PT Telkom Indonesia (Persero) Tbk & Stasiun Pengendali Utama Satelit Cibinong."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Atenuasi Intensitas Fluks Cahaya terhadap Jarak Menggunakan Sensor Lux Smartphone",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 smartphone yang memiliki aplikasi pengukur cahaya Lux Meter (banyak tersedia gratis di Play Store)",
                "1 lampu senter LED kecil (sumber radiasi mendekati titik)",
                "Penggaris atau meteran kain 2 meter",
                "Ruangan gelap di malam hari"
            ),
            steps = listOf(
                "Langkah 1: Matikan lampu ruangan kamar agar kondisi gelap total.",
                "Langkah 2: Nyalakan lampu senter LED dan posisikan meteran di depannya.",
                "Langkah 3: Tempatkan sensor cahaya smartphone (biasanya berada di dekat kamera depan atas) pada jarak r = 20 cm dari senter. Catat nilai intensitas fluks cahaya (dalam Lux).",
                "Langkah 4: Mundurkan smartphone ke jarak r = 40 cm (jarak menjadi 2 kali lipat). Catat nilai Lux baru: amati nilainya anjlok menjadi sekitar 1/4 dari nilai awal!",
                "Langkah 5: Mundurkan lagi ke jarak r = 60 cm (3 kali lipat): nilai Lux anjlok menjadi sekitar 1/9! Eksperimen ini membuktikan Hukum Kuadrat Terbalik Vektor Poynting (I ∝ 1/r²)!"
            ),
            observationGoal = "Membuktikan secara empiris hukum kuadrat terbalik perambatan fluks daya gelombang elektromagnetik dari sumber radiasi titik.",
            connectionToSimulation = "Bandingkan data sensor lux-mu dengan simulasi vektor Poynting di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-em-poynt-1",
                prompt = "Sebuah gelombang elektromagnetik bidang merambat di ruang hampa memiliki amplitudo medan listrik E_max = 600 V/m. Berapakah amplitudo medan magnet B_max yang bersesuaian? (Diketahui c = 3 × 10⁸ m/s)",
                type = "numeric",
                correctAnswer = "0.000002",
                tolerance = 0.0000002f,
                unit = "Tesla",
                hints = listOf(
                    "Gunakan hubungan amplitudo gelombang elektromagnetik: E_max = c · B_max.",
                    "B_max = E_max / c = 600 / (3 × 10⁸).",
                    "600 / (300.000.000) = 2 × 10⁻⁶ Tesla (atau 0,000002 T)."
                ),
                explanation = "Amplitudo medan magnet dihubungkan oleh rumus B_max = E_max / c = 600 / (3 × 10⁸) = 2 × 10⁻⁶ Tesla = 2 mikroTesla (0,000002 T).",
                misconception = "Mengalikan E dengan c alih-alih membaginya."
            ),
            QuizQuestion(
                id = "q-em-poynt-2",
                prompt = "Arah aliran daya energi gelombang elektromagnetik yang dinyatakan oleh Vektor Poynting S = (1/mu_0) (E × B) adalah...",
                type = "multiple_choice",
                options = [
                    "Searah dengan arah perambatan gelombang elektromagnetik (tegak lurus terhadap E dan B)",
                    "Selalu sejajar dengan medan listrik E",
                    "Selalu sejajar dengan medan magnet B",
                    "Berlawanan arah dengan arah perambatan gelombang"
                ],
                correctAnswer = "Searah dengan arah perambatan gelombang elektromagnetik (tegak lurus terhadap E dan B)",
                hints = listOf(
                    "Operasi perkalian silang (E × B) menghasilkan vektor yang tegak lurus terhadap bidang E dan B.",
                    "Energi mengalir ke arah gelombang itu bergerak."
                ),
                explanation = "Vektor Poynting S didefinisikan sebagai hasil kali silang (1/mu_0)(E × B). Berdasarkan aturan tangan kanan, vektor hasil perkalian silang ini menunjuk tegak lurus terhadap bidang medan E dan B, searah persis dengan vektor gelombang k (arah perambatan energi).",
                misconception = "Mengira energi mengalir sejajar dengan getaran medan listrik E."
            )
        )
    )

    // =========================================================================
    // 9. PRINSIP FERMAT, MATRIKS ABCD & INTERFEROMETER MICHELSON
    // =========================================================================
    private val optikInterferometerLesson = LessonData(
        conceptId = "fis-optik-fisis-interferometer",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pfo_i1",
                panelNumber = 1,
                title = "Pengukuran Laser Sub-Mikrometer di BRIN Metrologi",
                caption = "Kirana mengamati meja optik pneumatik isolasi getaran di Balai Standardisasi Metrologi Nasional BRIN Serpong.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Penggaris mekanis terbaik hanya mampu mengukur milimeter. Bagaimana ilmuwan mengukur pergeseran ukuran yang lebih kecil dari panjang gelombang cahaya?",
                sceneVisualEmoji = "🔬",
                sceneDescription = "Meja optik laser isolasi getaran dengan cermin pembagi berkas dan pola cincin interferensi."
            ),
            StoryPanel(
                id = "pfo_i2",
                panelNumber = 2,
                title = "Prinsip Fermat: Waktu Tempuh Tersingkat",
                caption = "Kakek menjelaskan prinsip variasional optika Pierre de Fermat tahun 1662.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Cahaya tidak selalu mengambil jarak lintasan terpendek, melainkan lintasan dengan WAKTU TEMPUH TERSINGKAT! Dari prinsip waktu ekstrem inilah Hukum Pemantulan dan Hukum Pembiasan Snellius diturunkan secara murni!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Sinar cahaya membelok di batas udara-kaca memilih jalur waktu tercepat Fermat."
            ),
            StoryPanel(
                id = "pfo_i3",
                panelNumber = 3,
                title = "Matriks Transfer Berkas Sinar ABCD",
                caption = "Dimas menghitung sistem lensa optik majemuk menggunakan aljabar matriks 2x2.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Alih-alih melacak sinar secara manual berulang-ulang, setiap lensa dan ruang bebas dinyatakan oleh Matriks ABCD! Cukup kalikan matriks-matriksnya untuk mengetahui posisi dan sudut sinar di ujung kamera!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Diagram aljabar transfer matriks berkas sinar melintasi beberapa elemen lensa okuler dan objektif."
            ),
            StoryPanel(
                id = "pfo_i4",
                panelNumber = 4,
                title = "Interferometer Michelson: Cincin Cahaya Presisi",
                caption = "Kirana memutar mikrometer pada cermin interferometer Michelson.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Satu berkas laser dipecah menjadi dua oleh Beam Splitter lalu disatukan kembali! Pergeseran cermin sejauh setengah panjang gelombang (lambda / 2 ≈ 300 nanometer) menggeser satu garis cincin terang gelap! Ketelitiannya tingkat atomik!",
                sceneVisualEmoji = "🎯",
                sceneDescription = "Pola lingkaran cincin interferensi konsentris terang-gelap bergeser saat cermin digerakkan."
            )
        ),
        intuitionTitle = "Optika Analitis & Gelombang Koheren: Dari Matriks Sinar ke Interferometri Laser",
        intuitionBody = "Optika modern menyatukan pendekatan geometris sinar melalui prinsip variasional Fermat dan formulasi matriks dengan teori gelombang koheren interferensi pembagian amplitudo.\n\n" +
                "1. Prinsip Fermat (Principle of Least Time):\n" +
                "   Berkas cahaya yang merambat antara dua titik mengambil jalur optik yang membutuhkan waktu tempuh stasioner (ekstrem/tersingkat):\n" +
                "   $$\\delta \\int_{A}^{B} n(\\mathbf{r})\\, ds = 0$$\n" +
                "   • Dari prinsip ini, Hukum Pembiasan Snellius ($n_1 \\sin\\theta_1 = n_2 \\sin\\theta_2$) diturunkan langsung dari minimisasi waktu tempuh $t = \\frac{s_1}{v_1} + \\frac{s_2}{v_2}$.\n\n" +
                "2. Optik Matriks Transfer Berkas (Ray Transfer Matrix / Matriks ABCD):\n" +
                "   Sinar paraksial pada jarak ketinggian $y$ dan sudut kemiringan $\\theta$ direpresentasikan oleh vektor kolom $\\begin{pmatrix} y \\\\ \\theta \\end{pmatrix}$.\n" +
                "   Transformasi melewati sistem optik dinyatakan oleh matriks $2 \\times 2$:\n" +
                "   $$\\begin{pmatrix} y_2 \\\\ \\theta_2 \\end{pmatrix} = \\begin{pmatrix} A & B \\\\ C & D \\end{pmatrix} \\begin{pmatrix} y_1 \\\\ \\theta_1 \\end{pmatrix}$$\n" +
                "   • Ruang Bebas Berjarak $d$: $M_{\\text{ruang}} = \\begin{pmatrix} 1 & d \\\\ 0 & 1 \\end{pmatrix}$\n" +
                "   • Lensa Tipis Berkekuatan Fokus $f$: $M_{\\text{lensa}} = \\begin{pmatrix} 1 & 0 \\\\ -1/f & 1 \\end{pmatrix}$\n" +
                "   • Determinan matriks transfer selalu bernilai satu: $\\det(M) = AD - BC = 1$.\n\n" +
                "3. Interferometer Michelson (Albert A. Michelson 1881):\n" +
                "   Alat ukur interferensi pembagian amplitudo paling presisi di dunia:\n" +
                "   • Berkas cahaya koheren dari laser mengenai Cermin Pemecah Berkas (*Beam Splitter*) 50:50; berkas 1 menuju Cermin Tetap $M_1$ dan berkas 2 menuju Cermin Bergerak $M_2$.\n" +
                "   • Kedua berkas dipantulkan kembali dan berinterferensi di detektor/layar.\n" +
                "   • Jika cermin bergerak digeser sejauh $\\Delta d$, beda lintasan optik berubah sebesar $2 \\Delta d$. Hubungan dengan jumlah pergeseran rumbai cincin $m$:\n" +
                "     $$2 \\Delta d = m \\lambda \\implies \\Delta d = m \\frac{\\lambda}{2}$$\n" +
                "   • Instrumen ini digunakan dalam eksperimen bersejarah Michelson-Morley (membuktikan eter tidak ada) dan menjadi basis detektor gelombang gravitasi modern LIGO!",
        intuitionPoints = listOf(
            "Interferometer LIGO (Laser Interferometer Gravitational-Wave Observatory) mampu mendeteksi pergeseran cermin sejauh 10⁻¹⁸ meter (seperseribu diameter proton!) menggunakan prinsip Interferometer Michelson berlengan 4 kilometer.",
            "Koherensi Temporal menentukan panjang koherensi gelombang (panjang lintasan di mana gelombang masih bisa berinterferensi; laser gas memiliki panjang koherensi bermeter-meter, lampu pijar hanya beberapa mikrometer).",
            "Matriks ABCD menyederhanakan perhitungan teleskop dan mikroskop majemuk ratusan lensa menjadi sekadar perkalian matriks 2x2 sederhana tanpa gambar sinar manual."
        ),
        simId = "sim-michelson-interferometer",
        formulas = listOf(
            FormulaCard(
                symbol = "\\Delta d",
                equation = "\\Delta d = m \\frac{\\lambda}{2}",
                meaning = "Pergeseran posisi cermin interferometer Michelson terhadap jumlah pergeseran m rumbai cincin.",
                units = "meter (m)",
                applicationNote = "lambda adalah panjang gelombang laser sumber cahaya monokromatis."
            ),
            FormulaCard(
                symbol = "M_{\\text{lensa}}",
                equation = "M = \\begin{pmatrix} 1 & 0 \\\\ -1/f & 1 \\end{pmatrix} \\quad , \\quad \\det(M) = 1",
                meaning = "Matriks transfer sinar ABCD paraksial untuk lensa tipis dengan panjang fokus f.",
                units = "Matriks transformasi linier 2x2",
                applicationNote = "f positif untuk lensa cembung konvergen, f negatif untuk lensa cekung divergen."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kalibrasi Standar Metrologi Panjang Meter Nasional di BRIN Menggunakan Interferometri Laser",
            context = "Definisi 1 meter standar di Indonesia dikelola oleh Laboratorium Pengukuran Standar Nasional Satuan Ukuran (SNSU) BRIN untuk menjamin ketertelusuran industri alat ukur nasional.",
            engineeringProblem = "Mengkalibrasi balok ukur presisi (gauge blocks) kelas industri dengan ketidakpastian pengukuran kurang dari 20 nanometer.",
            physicalConceptUsed = "Interferometri optik laser Helium-Neon (He-Ne) terstabilkan frekuensi iodine (panjang gelombang vakum lambda = 632,99139822 nm) dengan Interferometer Michelson termodulasi fase.",
            mathematicalModel = "Mengukur fraksi pergeseran fase rumbai interferensi dengan interpolasi detektor fotodioda kuadratur menghasilkan resolusi jarak sub-nanometer.",
            realWorldImpact = "Menjadi acuan standar nasional bagi industri kalibrasi alat ukur komponen mesin pesawat, mikroskop elektron, dan komponen presisi otomotif Indonesia.",
            relatedCareers = listOf("Metrologis Optik Standar Nasional", "Insinyur Kalibrasi Laser Presisi", "Spesialis Fotonika Instrumentasi"),
            verifiedSource = "Direktorat Standar Nasional Satuan Ukuran (SNSU) BRIN Serpong & BIPM."
        ),
        homeLab = HomeLabData(
            title = "Membuat Pola Difraksi & Interferensi Laser Celah Sehelai Rambut di Dinding Kamar",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 buah laser pointer merah atau hijau (daya aman < 5 mW)",
                "1 helai rambut kepalamu sendiri yang bersih",
                "Selotip bening",
                "Meteran kain dan penggaris milimeter",
                "Dinding kamar datar berwarna putih"
            ),
            steps = listOf(
                "Langkah 1: Tempelkan sehelai rambut melintang tepat di tengah lubang moncong laser pointer menggunakan selotip bening (rambut bertindak sebagai penghalang celah tunggal Babinet).",
                "Langkah 2: Letakkan laser di atas meja dengan jarak L = 2 meter dari dinding putih.",
                "Langkah 3: Sorotkan laser ke dinding di ruangan gelap: perhatikan titik laser melebar menjadi deretan garis bintik-bintik terang-gelap terputus yang panjang di dinding!",
                "Langkah 4: Ukur jarak antara titik terang pusat ke titik gelap pertama (y) dengan penggaris milimeter.",
                "Langkah 5: Hitung ketebalan diameter rambutmu menggunakan rumus difraksi Fraunhofer: d = (lambda * L) / y. Dengan lambda laser merah = 650 nm (6,5 x 10⁻⁷ m), kamu bisa mengukur diameter rambutmu (~60–80 mikrometer) tanpa mikroskop!"
            ),
            observationGoal = "Membuktikan fenomena difraksi dan interferensi gelombang cahaya koheren serta mengukur ketebalan mikroskopis benda menggunakan panjang gelombang optik.",
            connectionToSimulation = "Bandingkan rumbai rambutmu dengan interferometer Michelson pada simulator di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-opt-inter-1",
                prompt = "Pada sebuah eksperimen Interferometer Michelson menggunakan laser He-Ne berpanjang gelombang lambda = 600 nm, cermin bergerak digeser secara perlahan sehingga teramati 100 rumbai cincin terang-gelap bergeser melintasi detektor. Berapakah jarak pergeseran cermin tersebut?",
                type = "numeric",
                correctAnswer = "0.03",
                tolerance = 0.002f,
                unit = "milimeter (mm)",
                hints = listOf(
                    "Gunakan rumus pergeseran interferometer Michelson: Delta_d = m · (lambda / 2).",
                    "m = 100 rumbai, lambda = 600 nm = 600 × 10⁻⁶ mm.",
                    "Delta_d = 100 · (600 × 10⁻⁶ mm / 2) = 100 · 300 × 10⁻⁶ mm = 30.000 × 10⁻⁶ mm = ...?"
                ),
                explanation = "Jarak pergeseran cermin dihitung dengan Delta_d = m · (lambda / 2) = 100 · (600 nm / 2) = 100 · 300 nm = 30.000 nm = 30 mikrometer = 0,03 milimeter.",
                misconception = "Lupa membagi panjang gelombang dengan 2 (lupa bahwa berkas cahaya menempuh jarak bolak-balik 2 kali)."
            ),
            QuizQuestion(
                id = "q-opt-inter-2",
                prompt = "Prinsip Fermat dalam optika geometris dan gelombang menyatakan bahwa berkas cahaya merambat antara dua titik melalui lintasan yang...",
                type = "multiple_choice",
                options = [
                    "Memerlukan waktu tempuh paling stasioner/tersingkat",
                    "Memiliki jarak geometri lintasan paling pendek secara garis lurus",
                    "Memiliki energi foton paling besar",
                    "Selalu menembus medium yang paling rapat terlebih dahulu"
                ],
                correctAnswer = "Memerlukan waktu tempuh paling stasioner/tersingkat",
                hints = listOf(
                    "Fermat merumuskan prinsip waktu terkecil (Principle of Least Time).",
                    "Bukan jarak terpendek, melainkan waktu tersingkat."
                ),
                explanation = "Prinsip Fermat menyatakan bahwa berkas cahaya merambat mengikuti jalur yang memerlukan waktu tempuh ekstrem (stasioner atau tersingkat). Hal ini menjelaskan mengapa cahaya membelok saat memasuki medium yang lebih lambat untuk meminimalkan waktu perjalanan total.",
                misconception = "Mengira cahaya selalu menempuh jarak geometris terpendek (garis lurus)."
            )
        )
    )

    // =========================================================================
    // 10. KERUNTUHAN FISIKA KLASIK & PERSAMAAN SCHRÖDINGER 1D
    // =========================================================================
    private val pengantarKuantumLesson = LessonData(
        conceptId = "fis-pengantar-kuantum-schrodinger",
        level = DepthLevel.L4,
        storyPanels = listOf(
            StoryPanel(
                id = "pfq_s1",
                panelNumber = 1,
                title = "Bencana Ultraviolet & Foton Kuantum",
                caption = "Dimas dan Kirana mempelajari sejarah awal tahun 1900 di mana hukum fisika klasik Newton dan Maxwell gagal total.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Fisika klasik memprediksi radiasi benda hitam memancarkan energi tak hingga di frekuensi ultraviolet (Bencana Ultraviolet)! Alam semesta seharusnya musnah terbakar jika fisika klasik benar!",
                sceneVisualEmoji = "💥",
                sceneDescription = "Grafik radiasi klasik Rayleigh-Jeans meledak ke tak hingga vs kurva Planck yang melengkung turun."
            ),
            StoryPanel(
                id = "pfq_s2",
                panelNumber = 2,
                title = "Ketidakpastian Mutlak Heisenberg",
                caption = "Kakek menjelaskan prinsip ketidakpastian Werner Heisenberg.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Di dunia subatomik, kita tidak bisa mengetahui posisi x dan momentum p partikel secara bersamaan dengan ketelitian mutlak! delta_x * delta_p >= h_bar / 2! Ini bukan kelemahan alat ukur, melainkan sifat alami gelombang materi!",
                sceneVisualEmoji = "🌫️",
                sceneDescription = "Awan probabilitas elektron menyebar memperlihatkan ketidakpastian posisi dan momentum."
            ),
            StoryPanel(
                id = "pfq_s3",
                panelNumber = 3,
                title = "Persamaan Gelombang Erwin Schrödinger",
                caption = "Kirana menuliskan persamaan diferensial mekanika kuantum Schrödinger 1926.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Partikel digantikan oleh Fungsi Gelombang psi(x, t)! Persamaan Schrödinger -hbar²/2m * (d²psi/dx²) + U(x) psi = E psi memprediksi tingkat-tingkat energi diskrit atom secara eksak!",
                sceneVisualEmoji = "🌊",
                sceneDescription = "Fungsi gelombang harmonik berlekuk psi(x) berdiam di dalam sumur potensial tak hingga."
            ),
            StoryPanel(
                id = "pfq_s4",
                panelNumber = 4,
                title = "Interpretasi Born: Probabilitas & Terobosan Kuantum",
                caption = "Dimas mengamati elektron yang mampu menembus dinding penghalang potensial.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kuadrat fungsi gelombang |psi(x)|² adalah Kerapatan Probabilitas menemukan partikel! Dan partikel kuantum bisa menembus dinding energi yang secara klasik mustahil (Quantum Tunneling)! Inilah rahasia bekerjanya memori flash smartphone kita!",
                sceneVisualEmoji = "🚪",
                sceneDescription = "Fungsi gelombang eksponensial menembus sawar penghalang potensial (quantum tunneling)."
            )
        ),
        intuitionTitle = "Revolusi Subatomik: Mekanika Gelombang Kuantum & Probabilitas Born",
        intuitionBody = "Mekanika kuantum menggantikan kepastian mekanistik deterministik Newton dengan formulasi probabilistik fungsi gelombang yang mengatur perilaku elektron, atom, dan semikonduktor.\n\n" +
                "1. Keruntuhan Fisika Klasik & Dualisme Gelombang-Partikel:\n" +
                "   • Masalah Radiasi Benda Hitam: Diselesaikan Max Planck (1900) dengan mempostulatkan kuantisasi energi $E = n h \\nu$.\n" +
                "   • Efek Fotoelektrik Einstein (1905): Membuktikan cahaya tersusun dari paket foton terkuantisasi $E = h\\nu = \\hbar \\omega$.\n" +
                "   • Gelombang Materi Louis de Broglie (1924): Partikel bermassa memiliki panjang gelombang materi $\\lambda = \\frac{h}{p}$.\n\n" +
                "2. Prinsip Ketidakpastian Heisenberg (1927):\n" +
                "   Kuantitas yang tidak komutatif tidak dapat diukur secara bersamaan dengan presisi tak terbatas:\n" +
                "   $$\\Delta x \\cdot \\Delta p_x \\ge \\frac{\\hbar}{2} \\quad \\text{dan} \\quad \\Delta E \\cdot \\Delta t \\ge \\frac{\\hbar}{2}$$\n" +
                "   di mana $\\hbar = \\frac{h}{2\\pi} = 1,05457 \\times 10^{-34}$ J·s.\n\n" +
                "3. Postulat Fungsi Gelombang & Interpretasi Born:\n" +
                "   Keadaan kuantum suatu partikel dideskripsikan sepenuhnya oleh fungsi gelombang kompleks $\\psi(x, t)$.\n" +
                "   • Interpretasi Probabilitas Max Born: Probabilitas menemukan partikel pada selang $x$ hingga $x + dx$ adalah:\n" +
                "     $$P(x)\\, dx = |\\psi(x, t)|^2\\, dx = \\psi^*(x, t) \\psi(x, t)\\, dx$$\n" +
                "   • Syarat Normalisasi (Kepastian 100% menemukan partikel di alam semesta):\n" +
                "     $$\\int_{-\\infty}^{\\infty} |\\psi(x, t)|^2\\, dx = 1$$\n\n" +
                "4. Persamaan Schrödinger Bebas Waktu 1 Dimensi (Time-Independent Schrödinger Equation / TISE):\n" +
                "   Untuk keadaan stasioner berenergi $E$ di dalam medan potensial $U(x)$:\n" +
                "   $$-\\frac{\\hbar^2}{2m} \\frac{d^2 \\psi(x)}{dx^2} + U(x) \\psi(x) = E \\psi(x)$$\n" +
                "   • Kasus Klasik: Partikel dalam Sumur Potensial Tak Hingga Lebar $L$ ($U = 0$ untuk $0 < x < L$, $U = \\infty$ di luar):\n" +
                "     $$\\psi_n(x) = \\sqrt{\\frac{2}{L}} \\sin\\left( \\frac{n\\pi x}{L} \\right) \\quad (n = 1, 2, 3, \\dots)$$\n" +
                "     Tingkat energi terkuantisasi diskrit:\n" +
                "     $$E_n = \\frac{n^2 \\pi^2 \\hbar^2}{2m L^2} = \\frac{n^2 h^2}{8m L^2}$$\n" +
                "     Energi titik nol terendah (keadaan dasar $n=1$) tidak nol ($E_1 > 0$), membuktikan partikel kuantum tidak pernah bisa diam total!\n" +
                "   • Efek Terobosan Kuantum (*Quantum Tunneling*): Jika partikel membentur sawar potensial berhingga $U_0 > E$, fungsi gelombang tidak seketika nol melainkan meluruh secara eksponensial $e^{-\\kappa x}$, menghasilkan peluang transmisi menembus sawar yang tidak nol!",
        intuitionPoints = listOf(
            "Matahari bersinar karena Efek Terobosan Kuantum: suhu inti matahari sebenarnya terlalu dingin menurut fisika klasik untuk memicu fusi proton; hanya berkat tunneling kuantum proton dapat menembus sawar tolak-menolak Coulomb untuk berfusi!",
            "Memori Flash SSD smartphone dan laptop bekerja dengan menyuntikkan elektron menembus lapisan isolator oksida silikon melalui terobosan kuantum Fowler-Nordheim.",
            "Kucing Schrödinger adalah eksperimen pikiran untuk mengilustrasikan paradoks superposisi keadaan kuantum sebelum dilakukan pengukuran (kolaps fungsi gelombang)."
        ),
        simId = "sim-schrodinger-particle-box",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{TISE}",
                equation = "-\\frac{\\hbar^2}{2m} \\frac{d^2 \\psi}{dx^2} + U(x) \\psi = E \\psi",
                meaning = "Persamaan Schrödinger 1 dimensi bebas waktu untuk keadaan stasioner energi E.",
                units = "Joule · psi",
                applicationNote = "Operator Hamilton H_topi = -hbar²/(2m) d²/dx² + U bertindak pada fungsi gelombang menghasilkan nilai eigen energi E."
            ),
            FormulaCard(
                symbol = "E_n",
                equation = "E_n = \\frac{n^2 h^2}{8 m L^2} = \\frac{n^2 \\pi^2 \\hbar^2}{2 m L^2} \\quad (n = 1, 2, 3, \\dots)",
                meaning = "Tingkat-tingkat energi terkuantisasi partikel di dalam sumur potensial tak hingga satu dimensi.",
                units = "Joule (J) atau elektronvolt (eV)",
                applicationNote = "Tingkat energi terendah keadaan dasar (ground state n=1) membuktikan adanya energi titik nol non-nol."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Karakterisasi Arus Terobosan Kuantum Dioda Resonant Tunneling di Laboratorium BRIN",
            context = "Komponen semikonduktor berkecepatan terahertz (THz) untuk komunikasi 6G membutuhkan saklar osilasi sub-pikodetik yang melampaui batas kecepatan transistor silikon konvensional.",
            engineeringProblem = "Merancang struktur heterojunction lapis tipis semikonduktor GaAs/AlGaAs agar elektron dapat menembus sawar potensial nanometer secara terobosan resonansi.",
            physicalConceptUsed = "Solusi persamaan Schrödinger pada sumur potensial ganda: transmisi kuantum melonjak hingga 100% ketika tingkat energi Fermi elektron sejajar dengan tingkat energi terkuantisasi sub-pita sumur kuantum (Negative Differential Resistance / NDR).",
            mathematicalModel = "Metode matriks transfer 1D memodelkan transmisi koefisien T(E) untuk memaksimalkan rasio arus puncak terhadap lembah (Peak-to-Valley Current Ratio / PVCR > 10).",
            realWorldImpact = "Menghasilkan prototipe osilator terahertz lokal berdaya rendah untuk radar pencitraan keamanan dan deteksi spektroskopi gas beracun.",
            relatedCareers = listOf("Fisikawan Semikonduktor Kuantum", "Insinyur Nanofabrikasi Epitaksi", "Spesialis Fotonika Gelombang Terahertz"),
            verifiedSource = "Pusat Riset Fotonika BRIN Kawasan Sains Serpong & ITB."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Konstanta Planck Sederhana Menggunakan Lampu LED Berbagai Warna (Tegangan Nyala eV = h*nu)",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "4 buah lampu LED berbeda warna (Merah, Kuning, Hijau, Biru)",
                "1 buah potensiometer / trimpot 10 kOhm dan resistor 1 kOhm",
                "1 baterai 9 Volt dan kabel klip buaya",
                "Multimeter digital (skala Voltmeter DC)",
                "Tabel panjang gelombang rata-rata: Merah 650 nm, Kuning 590 nm, Hijau 525 nm, Biru 470 nm"
            ),
            steps = listOf(
                "Langkah 1: Rangkai baterai 9V melalui potensiometer dan resistor ke lampu LED Merah dan multimeter pengukur tegangan.",
                "Langkah 2: Putar potensiometer perlahan dari tegangan 0 Volt hingga tepat saat lampu LED Merah mulai memancarkan cahaya redup pertama kalinya (Tegangan Nyala Ambang Batas / Turn-on Voltage V_0). Catat nilai V_0 (misal: 1,85 V).",
                "Langkah 3: Ulangi pengukuran untuk LED Kuning (~2,1 V), Hijau (~2,3 V), dan Biru (~2,8 V).",
                "Langkah 4: Energi ambang nyala elektron e * V_0 tepat menyamai energi foton kuantum h * nu = h * c / lambda.",
                "Langkah 5: Buat grafik V_0 terhadap (1 / lambda): kemiringan garis gradien m adalah m = (h * c) / e. Hitung konstanta Planck h = (m * e) / c: nilainya akan sangat mendekati ~6,6 x 10⁻³⁴ J·s!"
            ),
            observationGoal = "Mengamati secara empiris hubungan kuantisasi energi foton Planck-Einstein dan mengukur konstanta fundamental mekanika kuantum.",
            connectionToSimulation = "Bandingkan nilai konstanta Planck eksperimenmu dengan simulator partikel kuantum di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kuantum-sch-1",
                prompt = "Berdasarkan prinsip ketidakpastian Heisenberg delta_x * delta_p >= hbar / 2, jika posisi sebuah elektron diketahui dengan kepastian mutlak yang sempurna (delta_x = 0), berapakah nilai ketidakpastian momentum (delta_p) elektron tersebut?",
                type = "multiple_choice",
                options = [
                    "Tak terhingga (tidak dapat diketahui sama sekali)",
                    "Nol (diketahui pasti)",
                    "Sama dengan konstanta Planck h",
                    "Sama dengan kecepatan cahaya c"
                ],
                correctAnswer = "Tak terhingga (tidak dapat diketahui sama sekali)",
                hints = listOf(
                    "Pertidaksamaan Heisenberg: delta_p >= hbar / (2 · delta_x).",
                    "Jika penyebut delta_x mendekati nol, maka nilai pecahannya menjadi...?"
                ),
                explanation = "Berdasarkan relasi Heisenberg delta_p >= hbar / (2 · delta_x), jika posisi diketahui dengan kepastian mutlak (delta_x = 0), maka pembagian dengan nol menghasilkan ketidakpastian momentum tak terhingga (delta_p = tak hingga). Momentumnya menjadi sama sekali tidak terdefinisi.",
                misconception = "Mengira jika posisi diketahui pasti maka momentumnya juga bisa diketahui pasti nol."
            ),
            QuizQuestion(
                id = "q-kuantum-sch-2",
                prompt = "Sebuah elektron terkurung di dalam sumur potensial tak hingga satu dimensi dengan lebar L. Berapakah rasio perbandingan energi tingkat eksitasi pertama (n = 2) terhadap energi keadaan dasar (n = 1)?",
                type = "numeric",
                correctAnswer = "4",
                tolerance = 0.1f,
                unit = "kali lipat",
                hints = listOf(
                    "Rumus tingkat energi sumur potensial tak hingga: E_n = n² · E_1.",
                    "Untuk n = 2, E_2 = 2² · E_1 = 4 · E_1.",
                    "Rasio E_2 / E_1 = ...?"
                ),
                explanation = "Tingkat energi partikel dalam sumur potensial tak hingga sebanding dengan kuadrat bilangan kuantum utama (E_n ∝ n²). Untuk tingkat n = 2, energinya adalah E_2 = 2² E_1 = 4 E_1, sehingga rasionya adalah 4 kali lipat energi keadaan dasar.",
                misconception = "Mengira energi sebanding linear dengan n sehingga menjawab 2 kali lipat."
            )
        )
    )
}

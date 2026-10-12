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

object PhysicsLevel3Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "fis-vektor-dimensi",
            domain = Domain.FISIKA,
            topic = "Metode Matematika Fisika",
            title = "Vektor Analitik & Analisis Dimensi",
            description = "Komponen vektor 2D/3D sumbu Kartesius, perkalian titik (dot product), perkalian silang (cross product), dan verifikasi hukum fisis dengan analisis dimensi.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("mat-vektor", "fis-gerak-lurus")
        ),
        ConceptItem(
            id = "fis-gerak-melingkar",
            domain = Domain.FISIKA,
            topic = "Kinematika Rotasional",
            title = "Gerak Melingkar (GMB & GMBB)",
            description = "Kecepatan sudut ω, percepatan sentripetal as = v²/R, percepatan sudut α, tegangan tali pada ayunan konis, dan dinamika tikungan miring bergesekan.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("fis-gerak-lurus", "fis-gerak-parabola")
        ),
        ConceptItem(
            id = "fis-newton",
            domain = Domain.FISIKA,
            topic = "Dinamika Lanjut",
            title = "Gaya, Dinamika Newton & Gesekan",
            description = "Diagram Benda Bebas (FBD) bidang miring bergesekan (statis vs kinetis), katrol bertingkat, hukum aksi-reaksi, dan inersia kelembaman.",
            level = DepthLevel.L3,
            estMinutes = 20,
            prerequisites = listOf("fis-gerak-lurus", "fis-vektor-dimensi")
        ),
        ConceptItem(
            id = "fis-momentum-impuls",
            domain = Domain.FISIKA,
            topic = "Kekekalan Momentum",
            title = "Momentum, Impuls & Tumbukan",
            description = "Vektor momentum linear p = mv, teorema impuls-momentum J = Δp, hukum kekekalan momentum, tumbukan lenting sempurna/sebagian/tak lenting, dan roket pendorong.",
            level = DepthLevel.L3,
            estMinutes = 19,
            prerequisites = listOf("fis-newton", "fis-usaha-energi-daya")
        ),
        ConceptItem(
            id = "fis-gravitasi-kepler",
            domain = Domain.FISIKA,
            topic = "Gravitasi & Astrofisika",
            title = "Gravitasi Universal Newton & Hukum Kepler",
            description = "Gaya tarik gravitasi universal F = G·M·m/r², kuat medan gravitasi, energi potensial gravitasi, kecepatan lepas orbit, dan 3 Hukum Kepler orbit elips.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("fis-gerak-melingkar", "fis-tata-surya")
        ),
        ConceptItem(
            id = "fis-elastisitas-hooke",
            domain = Domain.FISIKA,
            topic = "Mekanika Material",
            title = "Elastisitas Bahan & Hukum Hooke",
            description = "Tegangan (stress), regangan (strain), Modulus Young, batas elastisitas bahan, Hukum Hooke pegas F = -kx, susunan pegas seri/paralel, dan energi potensial pegas.",
            level = DepthLevel.L3,
            estMinutes = 17,
            prerequisites = listOf("fis-newton")
        ),
        ConceptItem(
            id = "fis-rotasi",
            domain = Domain.FISIKA,
            topic = "Dinamika Benda Tegar",
            title = "Dinamika Rotasi & Kesetimbangan Benda Tegar",
            description = "Momen gaya (torsi τ = r × F), momen inersia I, Teorema Sumbu Sejajar, hukum II Newton rotasi Στ = Iα, momentum sudut L, energi menggelinding murni, dan kesetimbangan statis.",
            level = DepthLevel.L3,
            estMinutes = 22,
            prerequisites = listOf("fis-newton", "fis-gerak-melingkar")
        ),
        ConceptItem(
            id = "fis-fluida",
            domain = Domain.FISIKA,
            topic = "Mekanika Fluida Lanjut",
            title = "Fluida Statis & Dinamis (Asas Bernoulli)",
            description = "Tegangan permukaan, viskositas hukum Stokes, debit dan persamaan kontinuitas A1·v1 = A2·v2, Asas Bernoulli, venturimeter, tabung pitot, dan gaya angkat sayap pesawat.",
            level = DepthLevel.L3,
            estMinutes = 20,
            prerequisites = listOf("fis-tekanan", "fis-usaha-energi-daya")
        ),
        ConceptItem(
            id = "fis-termodinamika",
            domain = Domain.FISIKA,
            topic = "Termodinamika Lanjut",
            title = "Teori Kinetik Gas & Hukum Termodinamika",
            description = "Persamaan gas ideal PV = nRT, laju v_rms partikel gas, hukum I Termodinamika ΔU = Q - W (isobarik, isotermal, isokhorik, adiabatik), entropi hukum II, dan efisiensi mesin Carnot.",
            level = DepthLevel.L3,
            estMinutes = 21,
            prerequisites = listOf("fis-usaha-energi-daya")
        ),
        ConceptItem(
            id = "fis-gelombang-mekanik",
            domain = Domain.FISIKA,
            topic = "Gelombang Fisik & Optik Fisik",
            title = "Gelombang Berjalan, Efek Doppler & Difraksi",
            description = "Persamaan gelombang sinusoidal berjalan y = A sin(ωt ± kx), gelombang stasioner dawai/pipa, taraf intensitas desibel, efek Doppler akustik, dan interferensi celah ganda Young.",
            level = DepthLevel.L3,
            estMinutes = 21,
            prerequisites = listOf("fis-getaran-gelombang-bunyi", "fis-optik-dasar")
        ),
        ConceptItem(
            id = "fis-listrik-statis",
            domain = Domain.FISIKA,
            topic = "Elektrostatika Lanjut",
            title = "Medan Listrik, Hukum Gauss & Kapasitor",
            description = "Hukum Coulomb vektor, kuat medan listrik, fluks listrik Hukum Gauss, potensial elektrostatik, kapasitor keping sejajar C = ε·A/d, dielektrik, dan energi kapasitor.",
            level = DepthLevel.L3,
            estMinutes = 19,
            prerequisites = listOf("fis-listrik-ohm", "fis-vektor-dimensi")
        ),
        ConceptItem(
            id = "fis-listrik-dinamis",
            domain = Domain.FISIKA,
            topic = "Sirkuit Listrik Kompleks",
            title = "Rangkaian DC Multiloop & Transien RC",
            description = "Analisis sirkuit multiloop menggunakan Hukum I & II Kirchhoff, jembatan Wheatstone presisi, tahanan dalam baterai GGL, serta pengisian dan pengosongan muatan kapasitor RC.",
            level = DepthLevel.L3,
            estMinutes = 20,
            prerequisites = listOf("fis-listrik-ohm")
        ),
        ConceptItem(
            id = "fis-medan-magnet",
            domain = Domain.FISIKA,
            topic = "Elektrodinamika & Arus Bolak-Balik",
            title = "Medan Magnet, Induksi Faraday & RLC",
            description = "Hukum Biot-Savart kawat lurus/melingkar/toroida, gaya Lorentz antar-kawat sejajar, hukum Faraday-Lenz GGL induksi, induktansi L, dan sirkuit AC seri RLC resonansi.",
            level = DepthLevel.L3,
            estMinutes = 22,
            prerequisites = listOf("fis-kemagnetan-induksi", "fis-listrik-dinamis")
        ),
        ConceptItem(
            id = "fis-fisika-modern",
            domain = Domain.FISIKA,
            topic = "Fisika Modern & Kuantum Awal",
            title = "Relativitas Khusus, Efek Fotoelektrik & Radioaktivitas",
            description = "Postulat Einstein (dilatasi waktu, kontraksi panjang, E = mc²), foton kuantum Planck, efek fotoelektrik, panjang gelombang de Broglie materi, model atom Bohr, dan peluruhan radioaktif.",
            level = DepthLevel.L3,
            estMinutes = 22,
            prerequisites = listOf("fis-momentum-impuls", "fis-gelombang-mekanik")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "fis-vektor-dimensi" -> vektorDimensiLesson
            "fis-gerak-melingkar" -> gerakMelingkarLesson
            "fis-newton" -> newtonLesson
            "fis-momentum-impuls" -> momentumImpulsLesson
            "fis-gravitasi-kepler" -> gravitasiKeplerLesson
            "fis-elastisitas-hooke" -> elastisitasHookeLesson
            "fis-rotasi" -> rotasiLesson
            "fis-fluida" -> fluidaLesson
            "fis-termodinamika" -> termodinamikaLesson
            "fis-gelombang-mekanik" -> gelombangMekanikLesson
            "fis-listrik-statis" -> listrikStatisLesson
            "fis-listrik-dinamis" -> listrikDinamisLesson
            "fis-medan-magnet" -> medanMagnetLesson
            "fis-fisika-modern" -> fisikaModernLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. VEKTOR ANALITIK & ANALISIS DIMENSI
    // =========================================================================
    private val vektorDimensiLesson = LessonData(
        conceptId = "fis-vektor-dimensi",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pvd1",
                panelNumber = 1,
                title = "Navigasi Pesawat Garuda Melintasi Angin Silang",
                caption = "Pesawat Boeing 737 terbang dari Jakarta menuju Denpasar menghadapi tiupan angin silang (crosswind) kencang dari arah barat laut.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Pesawat diarahkan lurus ke timur, tapi angin meniup dari samping. Ke mana arah gerak sebenarnya?",
                sceneVisualEmoji = "✈️",
                sceneDescription = "Pesawat terbang meluncur membentuk sudut hembusan akibat resultan vektor kecepatan pesawat dan kecepatan angin."
            ),
            StoryPanel(
                id = "pvd2",
                panelNumber = 2,
                title = "Penguraian Komponen Kartesius",
                caption = "Kakek menunjukkan peta navigasi penerbangan dengan sistem sumbu koordinat tegak lurus.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Vektor kecepatan harus diuraikan ke sumbu-X (timur-barat) dan sumbu-Y (utara-selatan). Dengan trigonometri sinus dan cosinus, kita jumlahkan komponen-komponennya untuk mencari resultan vektor dan sudut haluan kemudi yang tepat!",
                sceneVisualEmoji = "🧭",
                sceneDescription = "Diagram penguraian vektor ke komponen mendatar Vx dan komponen tegak Vy."
            ),
            StoryPanel(
                id = "pvd3",
                panelNumber = 3,
                title = "Kekuatan Analisis Dimensi",
                caption = "Kirana memeriksa satuan suatu rumus fisika baru yang diturunkan di kelas.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Analisis dimensi adalah detektor kesalahan terbaik! Jika ruas kiri memiliki dimensi [M][L][T]⁻² (Newton) maka ruas kanan wajib memiliki dimensi yang persis sama. Jika berbeda, rumusnya pasti salah!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Papan tulis memuat pengujian dimensi massa [M], panjang [L], dan waktu [T]."
            )
        ),
        intuitionTitle = "Bahasa Vektor: Arah, Komponen & Konsistensi Dimensi",
        intuitionBody = "Fisika adalah sains besaran terarah. Banyak besaran fundamental (kecepatan, percepatan, gaya, momentum, medan magnet) tidak dapat dijelaskan hanya dengan satu angka tunggal:\n\n" +
                "1. Notasi Vektor Satuan: v = v_x î + v_y ĵ + v_z k̂.\n" +
                "   • Besar Vektor: |v| = √(v_x² + v_y² + v_z²).\n" +
                "   • Arah Vektor 2D: θ = arctan(v_y / v_x).\n\n" +
                "2. Perkalian Vektor:\n" +
                "   • Perkalian Titik (Dot Product): A · B = |A||B| cos θ (menghasilkan SKALAR, contoh Usaha W = F · s).\n" +
                "   • Perkalian Silang (Cross Product): A × B = (|A||B| sin θ) n̂ (menghasilkan VEKTOR tegak lurus, contoh Torsi τ = r × F).\n\n" +
                "3. Analisis Dimensi:\n" +
                "   • 7 Dimensi Pokok: Panjang [L], Massa [M], Waktu [T], Arus Listrik [I], Suhu [θ], Jumlah Zat [N], Intensitas Cahaya [J].\n" +
                "   • Prinsip Homogenitas: Semua suku dalam penjumlahan fisis harus memiliki dimensi identik.",
        intuitionPoints = listOf(
            "Dua vektor yang saling tegak lurus memiliki nilai perkalian titik A · B = 0 (karena cos 90° = 0).",
            "Dua vektor yang sejajar memiliki nilai perkalian silang A × B = 0 (karena sin 0° = 0).",
            "Analisis dimensi dapat digunakan untuk menebak bentuk ketergantungan suatu hukum fisis sebelum eksperimen laboratorium dilakukan."
        ),
        simId = "sim-vectors",
        formulas = listOf(
            FormulaCard(
                symbol = "\\mathbf{R}",
                equation = "R_x = \\sum A_x \\quad , \\quad R_y = \\sum A_y \\quad , \\quad |\\mathbf{R}| = \\sqrt{R_x^2 + R_y^2}",
                meaning = "Resultan vektor analitis dengan metode penjumlahan komponen.",
                units = "Sesuai besaran fisis",
                applicationNote = "A_x = |A| cos θ dan A_y = |A| sin θ."
            ),
            FormulaCard(
                symbol = "\\mathbf{A} \\cdot \\mathbf{B}",
                equation = "\\mathbf{A} \\cdot \\mathbf{B} = |\\mathbf{A}||\\mathbf{B}| \\cos\\theta = A_x B_x + A_y B_y + A_z B_z",
                meaning = "Perkalian skalar (dot product). Menghasilkan besaran skalar.",
                units = "Perkalian satuan A dan B",
                applicationNote = "Jika θ = 90°, hasil dot product selalu bernilai 0."
            ),
            FormulaCard(
                symbol = "[F]",
                equation = "[F] = [M][L][T]^{-2}",
                meaning = "Dimensi gaya Newton (kg · m / s²).",
                units = "kg·m/s² = Newton",
                applicationNote = "Digunakan untuk memvalidasi rumus gravitasi, gesekan, dan elastisitas."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Koreksi Vektor Drift Angin Sistem Autopilot Pesawat N219 Nurtanio PT Dirgantara Indonesia",
            context = "Pesawat perintis karya anak bangsa N219 terbang melayani rute pegunungan Papua dengan landasan sempit di lembah terjal.",
            engineeringProblem = "Hembusan angin lembah transversal berkecepatan 30 knot dapat mendorong hidung pesawat bergeser (drift) puluhan meter keluar dari garis tengah landasan pacu saat mendarat.",
            physicalConceptUsed = "Penjumlahan vektor kecepatan analitik v_ground = v_airspeed + v_wind.",
            mathematicalModel = "Komputer penerbangan (FMS) menghitung sudut koreksi arah (crabbing angle) θ = arcsin(v_wind_cross / v_airspeed) agar vektor kecepatan darat pesawat tepat segaris dengan sumbu runway.",
            realWorldImpact = "Menjamin pendaratan selamat ribuan penerbangan perintis di pedalaman pulau tanpa tergelincir dari landasan pacu sempit.",
            relatedCareers = listOf("Insinyur Avionik Pesawat", "Pilot Uji Terbang (Test Pilot)", "Perancang Sistem Kendali Terbang"),
            verifiedSource = "PT Dirgantara Indonesia (PTDI) / Manual Operasi Penerbangan Pesawat N219 Nurtanio."
        ),
        homeLab = HomeLabData(
            title = "Membuktikan Resultan Gaya Vektor Menggunakan 3 Buah Karet Gelang & Busur Derajat",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "3 buah karet gelang identik",
                "1 cincin gantungan kunci kecil atau klip kertas sebagai simpul pusat",
                "1 lembar kertas milimeter blok atau HVS",
                "Busur derajat dan penggaris"
            ),
            steps = listOf(
                "Ikatkan ketiga karet gelang pada cincin pusat kecil.",
                "Tarik dua ujung karet pertama ke arah yang membentuk sudut 90° (misal gaya tarik F1 dan F2 diukur dari panjang regangan karet).",
                "Tarik karet ketiga sedemikian rupa sehingga cincin berada diam seimbang di tengah (resultan ketiga gaya nol).",
                "Tandai garis ketiga karet pada kertas dan ukur panjang serta sudutnya dengan busur derajat.",
                "Hitung apakah besar gaya karet ketiga persis sama dengan √(F1² + F2²)!"
            ),
            observationGoal = "Membuktikan secara visual hukum penjumlahan vektor gaya segitiga dan kesetimbangan titik simpul.",
            connectionToSimulation = "Bandingkan sudut tarikan karet dengan diagram benda bebas di simulator vektor."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-vd-1",
                prompt = "Dua buah vektor gaya F1 = 6 N (ke timur) dan F2 = 8 N (ke utara) bekerja pada sebuah benda. Berapakah besar resultan gaya total yang dialami benda tersebut?",
                type = "numeric",
                correctAnswer = "10",
                tolerance = 0.1f,
                unit = "Newton",
                hints = listOf("Karena timur dan utara tegak lurus (90°), gunakan teorema Pythagoras: R = √(F1² + F2²).", "R = √(6² + 8²) = √(36 + 64)."),
                explanation = "R = √(6² + 8²) = √(36 + 64) = √100 = 10 Newton.",
                misconception = "Menjumlahkan langsung secara skalar 6 + 8 = 14 N tanpa memperhitungkan sudut tegak lurus."
            ),
            QuizQuestion(
                id = "q-vd-2",
                prompt = "Besaran usaha (W = F · s) memiliki dimensi manakah berikut ini?",
                type = "multiple_choice",
                options = listOf("[M][L]²[T]⁻²", "[M][L][T]⁻²", "[M][L]²[T]⁻¹", "[M][L]⁻¹[T]⁻²"),
                correctAnswer = "[M][L]²[T]⁻²",
                hints = listOf("Usaha = Gaya × Jarak.", "Dimensi gaya adalah [M][L][T]⁻² dan jarak adalah [L]."),
                explanation = "W = F · s = [M][L][T]⁻² × [L] = [M][L]²[T]⁻². Satuan SI-nya adalah Joule (kg·m²/s²).",
                misconception = "Lupa mengalikan [L] dari perpindahan sehingga tertukar dengan dimensi gaya."
            )
        )
    )

    // =========================================================================
    // 2. GERAK MELINGKAR (GMB & GMBB)
    // =========================================================================
    private val gerakMelingkarLesson = LessonData(
        conceptId = "fis-gerak-melingkar",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pgm1",
                panelNumber = 1,
                title = "Bermain Bianglala di Dufan Ancol",
                caption = "Kirana dan Dimas menaiki bianglala raksasa di Dunia Fantasi Ancol. Bianglala berputar konstan dengan kecepatan sudut tenang.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Laju putaran bianglala stabil, tapi kenapa tubuh kita selalu terasa terdorong ke arah luar kurva putaran?",
                sceneVisualEmoji = "🎡",
                sceneDescription = "Bianglala raksasa berputar teratur di taman hiburan Ancol."
            ),
            StoryPanel(
                id = "pgm2",
                panelNumber = 2,
                title = "Percepatan Sentripetal: Belok Terus Menerus",
                caption = "Kakek menjelaskan konsep percepatan sentripetal pada gerak melingkar beraturan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Walaupun besar kelajuanmu konstan, ARAH gerakmu terus berubah setiap detik! Perubahan arah ini membutuhkan percepatan yang selalu mengarah ke PUSAT lingkaran: namanya Percepatan Sentripetal (as = v² / R)!",
                sceneVisualEmoji = "🎯",
                sceneDescription = "Diagram vektor kecepatan tangensial v tegak lurus terhadap vektor percepatan sentripetal as menuju pusat."
            ),
            StoryPanel(
                id = "pgm3",
                panelNumber = 3,
                title = "Tikungan Miring Sirkuit Mandalika",
                caption = "Di Sirkuit Internasional Mandalika Lombok, pembalap MotoGP melibas tikungan tajam pada kecepatan 200 km/jam tanpa terpeleset keluar aspal.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Luar biasa! Tikungan sirkuit dibuat miring (banked turn) sehingga komponen gaya normal ikut menyediakan gaya sentripetal bersama gaya gesek ban!",
                sceneVisualEmoji = "🏍️",
                sceneDescription = "Pembalap motor miring menikung tajam di lintasan aspal bersudut kemiringan khusus."
            )
        ),
        intuitionTitle = "Dinamika Putar: Menuju Pusat vs Inersia Melecut",
        intuitionBody = "Gerak melingkar adalah gerak periodik pada lintasan lingkaran:\n\n" +
                "1. Gerak Melingkar Beraturan (GMB):\n" +
                "   • Kecepatan Sudut (ω = 2π / T = 2π f): Konstan, diukur dalam rad/s.\n" +
                "   • Kecepatan Tangensial: v = ω · R (semakin jauh titik dari poros, semakin kencang kelajuan liniernya!).\n" +
                "   • Percepatan Sentripetal: a_s = v² / R = ω² · R (selalu mengarah tegak lurus ke pusat lingkaran).\n" +
                "   • Gaya Sentripetal: F_s = m · a_s = m · v² / R.\n\n" +
                "2. Gerak Melingkar Berubah Beraturan (GMBB):\n" +
                "   • Mengalami percepatan sudut α = dω/dt (rad/s²).\n" +
                "   • Percepatan Total: a_tot = √(a_t² + a_s²), di mana a_t = α · R adalah percepatan tangensial.",
        intuitionPoints = listOf(
            "'Gaya Sentrifugal' sebenarnya adalah gaya fiktif/semu akibat inersia tubuh pengamat yang berada dalam kerangka acuan non-inersial (berputar).",
            "Pada tikungan jalan datar tanpa kemiringan, satu-satunya penyedia gaya sentripetal adalah GAYA GESEK STATIS ban kendaraan: v_maks = √(μ_s · g · R).",
            "Kemiringan tikungan ideal tanpa mengandalkan gesekan ban: tan θ = v² / (g · R)."
        ),
        simId = "sim-circular-motion",
        formulas = listOf(
            FormulaCard(
                symbol = "a_s",
                equation = "a_s = \\frac{v^2}{R} = \\omega^2 R",
                meaning = "Percepatan sentripetal yang mengarah ke pusat lingkaran.",
                units = "m/s²",
                applicationNote = "v dalam m/s, ω dalam rad/s, dan R dalam meter."
            ),
            FormulaCard(
                symbol = "F_s",
                equation = "F_s = m \\cdot a_s = \\frac{m v^2}{R}",
                meaning = "Gaya sentripetal netto yang diperlukan untuk mempertahankan lintasan melingkar.",
                units = "Newton (N)",
                applicationNote = "Disediakan oleh tegangan tali, gravitasi satelit, gaya gesek ban, atau gaya Lorentz."
            ),
            FormulaCard(
                symbol = "v_{maks} (\\text{Tikungan})",
                equation = "v_{maks} = \\sqrt{\\mu_s \\cdot g \\cdot R}",
                meaning = "Kelajuan aman maksimum melintasi tikungan jalan datar berjari-jari R.",
                units = "m/s",
                applicationNote = "Jika ban melaju melebihi v_maks, gaya gesek tak mampu menahan dan kendaraan akan selip keluar jalan."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Desain Kemiringan Tikungan 10 Sirkuit Internasional Mandalika Lombok",
            context = "Tikungan 10 Pertamina Mandalika International Street Circuit adalah tikungan cepat kecepatan tinggi yang dilintasi motor MotoGP berkekuatan 300 HP.",
            engineeringProblem = "Jika tikungan dibuat mendatar, gaya sentripetal hanya bertumpu pada grip gesekan kompon ban ban slick yang sangat rentan aus dan licin saat hujan deras tropis melanda.",
            physicalConceptUsed = "Dinamika tikungan miring bergesekan: N sin θ + fs cos θ = m v² / R.",
            mathematicalModel = "Insinyur sirkuit menghitung sudut kemiringan (camber/banking) θ = 6° hingga 8° pada radius R = 110 meter sehingga komponen horizontal gaya normal N sin θ menopang sebagian besar gaya sentripetal yang dibutuhkan pada kecepatan 160 km/jam.",
            realWorldImpact = "Mencegah tabrakan fatal high-side para pembalap kelas dunia dan meningkatkan rekor waktu putaran lap time sirkuit.",
            relatedCareers = listOf("Insinyur Desain Sirkuit Motorsport", "Data Analis Telemetri Balap", "Teknisi Geometris Jalan Raya"),
            verifiedSource = "Fédération Internationale de Motocyclisme (FIM) / Mandalika Circuit Homologation Grade A Report."
        ),
        homeLab = HomeLabData(
            title = "Memutar Ember Berisi Air Tanpa Tumpah Terbalik",
            safetyLevel = "Mandiri (Halaman Terbuka)",
            materials = listOf(
                "1 ember kecil beralas kokoh bertangkai kuat",
                "Air bersih secukupnya (isi 1/4 ember)",
                "Tali tambang plastik jika ingin memanjangkan ayunan",
                "Halaman terbuka beralas rumput"
            ),
            steps = listOf(
                "Isi ember dengan sedikit air (jangan terlalu penuh).",
                "Pegang pegangan ember dengan kuat di halaman terbuka.",
                "Ayunkan ember bolak-balik dari samping ke depan.",
                "Begitu cukup momentum, putar ember membentuk LINGKARAN PENUH SECARA VERTIKAL dengan cepat dan mantap.",
                "Amati saat ember berada persis di puncak tertinggi dalam keadaan terbalik: AIR TIDAK TUMPAH MENETES KE KEPALAMU!",
                "Perlambat putaran perlahan sebelum menghentikannya."
            ),
            observationGoal = "Membuktikan bahwa pada kecepatan putar minimum tertentu (v ≥ √(g · R)), gaya normal dasar ember dan inersia air mengalahkan tarikan gravitasi bumi sehingga air tetap menempel di dasar ember.",
            connectionToSimulation = "Bandingkan kecepatan kritis air di puncak dengan simulator gerak melingkar vertikal."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-gm-1",
                prompt = "Sebuah mobil mainan bermassa 0,5 kg meluncur di lintasan melingkar beradius 2 meter dengan kelajuan konstan 4 m/s. Berapakah gaya sentripetal yang bekerja pada mobil?",
                type = "numeric",
                correctAnswer = "4",
                tolerance = 0.1f,
                unit = "Newton",
                hints = listOf("Gunakan rumus Fs = m × v² / R.", "Fs = 0,5 × (4²) / 2.", "Fs = 0,5 × 16 / 2 = 8 / 2."),
                explanation = "Fs = m · v² / R = 0,5 kg × (4 m/s)² / 2 m = 0,5 × 16 / 2 = 4 Newton.",
                misconception = "Lupa mengkuadratkan kelajuan v (hanya menghitung 0,5 × 4 / 2)."
            ),
            QuizQuestion(
                id = "q-gm-2",
                prompt = "Jika jari-jari putaran lingkaran digandakan menjadi 2 kali lipat pada kecepatan linier v yang tetap sama, bagaimana perubahan percepatan sentripetalnya?",
                type = "multiple_choice",
                options = listOf(
                    "Menjadi setengah (1/2) kali semula",
                    "Menjadi dua (2) kali semula",
                    "Menjadi seperempat (1/4) kali semula",
                    "Tetap sama tidak berubah"
                ),
                correctAnswer = "Menjadi setengah (1/2) kali semula",
                hints = listOf("Lihat rumus as = v² / R.", "R berada di posisi penyebut (pembagi)."),
                explanation = "Karena as = v² / R, jika R membesar 2 kali sementara v tetap, maka as berbanding terbalik dengan R dan nilainya menjadi 1/2 kali semula.",
                misconception = "Mengira percepatan sentripetal selalu bertambah seiring membesarnya lingkaran."
            )
        )
    )

    // =========================================================================
    // 3. HUKUM NEWTON LANJUT & GESEKAN (L3)
    // =========================================================================
    private val newtonLesson = LessonData(
        conceptId = "fis-newton",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pn1",
                panelNumber = 1,
                title = "Truk Logistik Menanjak di Cadas Pangeran",
                caption = "Truk gandeng bermuatan semen melintasi tanjakan terjal Cadas Pangeran Sumedang saat hujan gerimis.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Truk ini mendaki pelan sekali. Sopir menjaga agar ban tidak selip di aspal licin.",
                sceneVisualEmoji = "🚛",
                sceneDescription = "Truk berat mendaki tanjakan jalan pegunungan yang licin diguyur hujan."
            ),
            StoryPanel(
                id = "pn2",
                panelNumber = 2,
                title = "Diagram Benda Bebas (FBD)",
                caption = "Kakek menggambar diagram gaya bebas di atas kertas memo.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Inilah rahasia analisis mekanika: Diagram Benda Bebas! Berat truk w = mg diuraikan menjadi w sin θ sejajar bidang dan w cos θ tegak lurus bidang. Gaya normal N = mg cos θ menentukan gaya gesek statis maksimum fs_maks = μs N yang menahan truk agar tidak merosot!",
                sceneVisualEmoji = "📊",
                sceneDescription = "Free Body Diagram menampilkan uraian gaya normal, gaya berat komponen, dan gaya gesek."
            ),
            StoryPanel(
                id = "pn3",
                panelNumber = 3,
                title = "Statis vs Kinetis",
                caption = "Kirana mengingat perbedaan mendasar antara gesekan sebelum dan sesudah bergerak.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Koefisien gesek statis selalu lebih besar dari kinetis (μs > μk)! Begitu ban mulai selip dan tergelincir, cengkeraman gesekannya langsung anjlok. Itulah mengapa rem ABS mobil sangat penting mencegah roda terkunci!",
                sceneVisualEmoji = "🛑",
                sceneDescription = "Grafik gaya gesek vs gaya tarik menunjukkan lonjakan puncak statis sebelum turun ke kinetis."
            )
        ),
        intuitionTitle = "Dinamika Vektor: Mengurai Gaya Benda Bebas",
        intuitionBody = "Dinamika analitis Newton menyelesaikan gerak benda dalam ruang 2D/3D melalui Diagram Benda Bebas (FBD):\n\n" +
                "1. Hukum I Newton: Σ F = 0 (benda dalam kesetimbangan statis atau bergerak lurus beraturan GLB).\n" +
                "2. Hukum II Newton: Σ F = m · a (percepatan terjadi searah dengan resultan gaya total).\n" +
                "3. Hukum III Newton: F_aksi = -F_reaksi (dua gaya sama besar, berlawanan arah, bekerja pada DUA BENDA BERBEDA).\n\n" +
                "Hukum Friksi (Gesekan):\n" +
                "• Gesek Statis: Bekerja saat benda belum bergerak (0 ≤ f_s ≤ μ_s · N). Nilai f_s mengimbangi gaya tarik tepat hingga ambang batas maksimum.\n" +
                "• Gesek Kinetis: Bekerja saat benda sudah meluncur relatif (f_k = μ_k · N). Selalu lebih kecil dari f_s maksimum.",
        intuitionPoints = listOf(
            "Gaya Normal (N) tidak selalu sama dengan gaya berat (w). Pada bidang miring N = mg cos θ, dan jika ada tarikan vertikal N = mg - F sin θ.",
            "Tegangan tali (T) pada katrol tanpa gesekan bernilai sama di sepanjang bentangan tali yang sama.",
            "Sistem rem ABS (Anti-lock Braking System) memanfaatkan hukum friksi: menjaga ban tetap dalam rezim gesek statis maksimum (tanpa selip meluncur) saat pengereman darurat."
        ),
        simId = "sim-newton",
        formulas = listOf(
            FormulaCard(
                symbol = "\\Sigma \\mathbf{F}",
                equation = "\\Sigma F_x = m \\cdot a_x \\quad , \\quad \\Sigma F_y = m \\cdot a_y",
                meaning = "Hukum II Newton dalam komponen Kartesius.",
                units = "Newton (N = kg·m/s²)",
                applicationNote = "Gunakan sumbu-X sejajar bidang gerak dan sumbu-Y tegak lurus bidang gerak."
            ),
            FormulaCard(
                symbol = "f_s^{\\text{maks}} & f_k",
                equation = "f_s^{\\text{maks}} = \\mu_s \\cdot N \\quad , \\quad f_k = \\mu_k \\cdot N",
                meaning = "Gaya gesek statis maksimum dan gaya gesek kinetis meluncur.",
                units = "Newton (N)",
                applicationNote = "μs dan μk adalah koefisien tanpa satuan. Biasanya μs > μk."
            ),
            FormulaCard(
                symbol = "a (\\text{Bidang Miring})",
                equation = "a = g (\\sin\\theta - \\mu_k \\cos\\theta)",
                meaning = "Percepatan luncur benda bermassa m menuruni bidang miring kasar bersudut θ.",
                units = "m/s²",
                applicationNote = "Percepatan tidak bergantung pada massa benda m!"
            )
        ),
        caseStudy = CaseStudyData(
            title = "Zona Benturan (Crumple Zone) & Sistem Rem ABS Mobil Listrik Nasional",
            context = "Mobil penumpang di Indonesia wajib memenuhi standar keselamatan tabrak ASEAN NCAP dan sistem pengereman ABS untuk mencegah selip di musim hujan.",
            engineeringProblem = "Saat roda terkunci (locking) pada pengereman mendadak, gaya gesek ban berubah dari statis ke kinetis yang lebih rendah dan pengemudi kehilangan kendali setir kemudi.",
            physicalConceptUsed = "Hukum friksi statis vs kinetis (fs_maks = μs N > fk = μk N) dan hukum II Newton F = m · a.",
            mathematicalModel = "Sensor ABS memantau putaran roda dan memodulasi tekanan fluida rem hidrolik hingga 15 kali per detik agar ban berada persis di puncak koefisien gesek statis maksimum (μs ≈ 0,8 dibanding μk ≈ 0,55 di aspal basah).",
            realWorldImpact = "Memperpendek jarak pengereman darurat hingga 30% dan mempertahankan daya kendali kemudi untuk menghindari tabrakan beruntun.",
            relatedCareers = listOf("Insinyur Dinamika Kendaraan", "Perancang Crash Safety Otomotif", "Spesialis Kalibrasi ABS/ESP"),
            verifiedSource = "ASEAN NCAP Safety Standards / Panduan Uji Tabrak Balai Pengujian Laik Jalan Kemenhub."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Koefisien Gesek Statis Menggunakan Buku Tebal & HP",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 buku bersampul keras tebal (hardcover) sebagai bidang miring",
                "1 benda kecil berkaki karet/plastik (misal penghapus, kotak korek, atau koin)",
                "Aplikasi waterpass/pengukur sudut di smartphone atau busur derajat"
            ),
            steps = listOf(
                "Letakkan buku hardcover mendatar di atas meja.",
                "Taruh penghapus karet di atas sampul buku.",
                "Angkat salah satu sisi sampul buku perlahan-lahan ke atas membentuk sudut tanjakan θ.",
                "Perhatikan sudut persis saat penghapus mulai MELUNCUR pertama kali ke bawah. Tahan dan catat sudut kritis θ tersebut menggunakan aplikasi inclinometer di HP.",
                "Hitung koefisien gesek statis: μs = tan θ!"
            ),
            observationGoal = "Membuktikan secara matematis bahwa saat benda tepat akan meluncur di bidang miring, mg sin θ = fs_maks = μs mg cos θ, sehingga μs = tan θ.",
            connectionToSimulation = "Bandingkan sudut kritis hasil eksperimenmu dengan slider koefisien gesek di simulator Newton."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-newt-1",
                prompt = "Balok bermassa 4 kg berada di atas lantai mendatar kasar dengan μs = 0,4 dan μk = 0,2 (g = 10 m/s²). Jika balok ditarik dengan gaya mendatar F = 10 N, berapakah gaya gesek yang bekerja pada balok?",
                type = "numeric",
                correctAnswer = "10",
                tolerance = 0.1f,
                unit = "Newton",
                hints = listOf("Hitung dulu gaya gesek statis maksimum: fs_maks = μs × N = 0,4 × (4 × 10) = 16 N.", "Apakah gaya tarik 10 N mampu mengalahkan 16 N?", "Jika benda belum bergerak, berapa besar gaya gesek statisnya?"),
                explanation = "Gaya gesek statis maksimum fs_maks = 0,4 × 40 N = 16 N. Karena gaya tarik F = 10 N lebih kecil dari fs_maks, balok tetap DIAM dan gaya gesek statis yang bekerja mengimbangi tepat sebesar gaya tariknya, yaitu f_s = 10 Newton.",
                misconception = "Langsung mengalikan rumus kinetis atau mengira gaya gesek selalu bernilai maksimum 16 N padahal benda belum bergerak."
            ),
            QuizQuestion(
                id = "q-newt-2",
                prompt = "Sebuah balok meluncur menuruni bidang miring licin tanpa gesekan bersudut kemiringan 30 derajat terhadap horizontal. Jika g = 10 m/s², berapakah percepatan luncur balok tersebut?",
                type = "numeric",
                correctAnswer = "5",
                tolerance = 0.1f,
                unit = "m/s²",
                hints = listOf("Gunakan rumus percepatan bidang miring licin: a = g × sin θ.", "Hitung 10 × sin(30°).", "Nilai sin(30°) = 0,5."),
                explanation = "a = g · sin θ = 10 m/s² · sin 30° = 10 · 0,5 = 5 m/s².",
                misconception = "Menggunakan cosinus alih-alih sinus untuk komponen percepatan sejajar bidang miring."
            )
        )
    )

    // =========================================================================
    // 4. MOMENTUM, IMPULS & TUMBUKAN
    // =========================================================================
    private val momentumImpulsLesson = LessonData(
        conceptId = "fis-momentum-impuls",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pmi1",
                panelNumber = 1,
                title = "Tendangan Penalti Pratama Arhan",
                caption = "Pemain timnas sepak bola Indonesia melepaskan tendangan gledek ke sudut gawang lawan.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kaki Arhan hanya menyentuh bola selama sepersekian detik, tapi bola melesat kencang bagai roket!",
                sceneVisualEmoji = "⚽",
                sceneDescription = "Kaki menendang bola saat tumbukan sangat singkat mendistorsi bentuk bola."
            ),
            StoryPanel(
                id = "pmi2",
                panelNumber = 2,
                title = "Teorema Impuls-Momentum",
                caption = "Kakek menjelaskan apa yang terjadi dalam rentang waktu kontak milidetik tersebut.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Gaya kontak besar yang bekerja dalam selang waktu sangat singkat (Δt) disebut IMPULS (J = F · Δt). Impuls inilah yang mengubah momentum bola dari diam menjadi memiliki kecepatan tinggi (J = Δp = m·vt - m·v0)!",
                sceneVisualEmoji = "💥",
                sceneDescription = "Grafik gaya kontak tumbukan F terhadap waktu kontak t yang sangat sempit."
            ),
            StoryPanel(
                id = "pmi3",
                panelNumber = 3,
                title = "Hukum Kekekalan Momentum",
                caption = "Kirana mengamati dua perahu getek yang saling bertabrakan di dermaga sungai Musi.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Tanpa adanya gaya luar, jumlah total momentum sebelum dan sesudah tumbukan selalu kekal: p1 + p2 = p1' + p2'! Prinsip yang sama membuat roket meluncur naik saat menyemburkan gas buang ke bawah.",
                sceneVisualEmoji = "🚀",
                sceneDescription = "Roket melesat ke atas karena semburan gas berkecepatan tinggi ke arah berlawanan."
            )
        ),
        intuitionTitle = "Hukum Kekekalan Momentum & Fisika Tumbukan",
        intuitionBody = "Momentum linear (p = m · v) adalah ukuran kesukaran menghentikan benda yang sedang bergerak:\n\n" +
                "1. Impuls (J = ∫ F dt ≈ F_rata · Δt): Menyebabkan perubahan momentum benda (J = Δp).\n" +
                "   • Untuk mengurangi gaya tumbukan fatal F, kita harus memperpanjang waktu kontak Δt (alasan adanya helm, matras lompat tinggi, dan airbag).\n\n" +
                "2. Hukum Kekekalan Momentum Linear: Jika gaya luar netto nol (ΣF_ext = 0), momentum total sistem konstan:\n" +
                "   m₁ v₁ + m₂ v₂ = m₁ v₁' + m₂ v₂'.\n\n" +
                "3. Tiga Jenis Tumbukan (Koefisien Restitusi e = - (v₁' - v₂') / (v₁ - v₂)):\n" +
                "   • Lenting Sempurna (e = 1): Momentum kekal dan Energi Kinetik kekal.\n" +
                "   • Lenting Sebagian (0 < e < 1): Momentum kekal, tetapi sebagian energi kinetik berubah jadi panas/bunyi.\n" +
                "   • Tidak Lenting Sama Sekali (e = 0): Benda menyatu dan bergerak bersama dengan kecepatan akhir sama (v₁' = v₂').",
        intuitionPoints = listOf(
            "Prinsip Roket & Senapan: Mundurnya senapan saat peluru ditembakkan adalah konsekuensi langsung hukum kekekalan momentum total yang semula nol.",
            "Tumbukan tidak lenting sama sekali (e = 0) mengalami kehilangan energi kinetik paling maksimal.",
            "Pusat massa sistem terisolasi selalu bergerak dengan kecepatan konstan, tidak peduli ledakan internal atau tumbukan di dalamnya."
        ),
        simId = "sim-collisions",
        formulas = listOf(
            FormulaCard(
                symbol = "\\mathbf{p} & \\mathbf{J}",
                equation = "\\mathbf{p} = m \\mathbf{v} \\quad , \\quad \\mathbf{J} = \\mathbf{F}_{\\text{rata}} \\cdot \\Delta t = \\Delta \\mathbf{p}",
                meaning = "Vektor momentum linear dan teorema impuls-momentum.",
                units = "kg·m/s atau N·s",
                applicationNote = "Arah vektor harus diperhatikan secara ketat (misal kanan +, kiri -)."
            ),
            FormulaCard(
                symbol = "\\Sigma p",
                equation = "m_1 v_1 + m_2 v_2 = m_1 v_1' + m_2 v_2'",
                meaning = "Hukum kekekalan momentum linear total pada tumbukan.",
                units = "kg·m/s",
                applicationNote = "Berlaku untuk semua jenis tumbukan asalkan tidak ada gaya luar netto."
            ),
            FormulaCard(
                symbol = "e",
                equation = "e = - \\frac{v_1' - v_2'}{v_1 - v_2}",
                meaning = "Koefisien restitusi tumbukan.",
                units = "Tanpa satuan (0 \\le e \\le 1)",
                applicationNote = "Untuk pantulan bola di lantai: e = √(h' / h)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pendorong Roket Sonda Uji RX-450 LAPAN / BRIN Pameungpeuk",
            context = "Pusat Teknologi Roket LAPAN (kini BRIN) mengembangkan roket sonda dua tingkat RX-450 di Pameungpeuk Garut untuk penelitian atmosfer atas Indonesia.",
            engineeringProblem = "Bagaimana roket seberat 1,5 ton dapat mempercepat dirinya di ruang hampa udara di mana tidak ada udara untuk 'didorong' baling-baling?",
            physicalConceptUsed = "Hukum Kekekalan Momentum Semburan Gas Dorong: m_roket · dv = - v_gas · dm.",
            mathematicalModel = "Persamaan Roket Tsiolkovsky: Δv = v_exhaust · ln(m_awal / m_akhir). Laju semburan gas pembakaran propelan padat v_exhaust = 2.400 m/s melontarkan gas ke bawah dengan debit massal dm/dt tinggi, menghasilkan gaya dorong dorongan (thrust) F = v_exhaust · (dm/dt) = 50.000 Newton.",
            realWorldImpact = "Membangun kemandirian teknologi peluncuran satelit nano karya ilmuwan Indonesia ke orbit rendah bumi.",
            relatedCareers = listOf("Insinyur Propulsi Roket", "Ahli Aerodinamika Balistika", "Spesialis Penginderaan Jauh Dirgantara"),
            verifiedSource = "Pusat Teknologi Roket BRIN / Laporan Uji Terbang Roket Sonda RX-450."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Koefisien Restitusi Bola Tenis Meja yang Memantul",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 bola tenis meja (pingpong) atau bola tenis lapangan",
                "Lantai ubin/keramik datar yang keras",
                "Meteran pita atau penggaris panjang (1 meter)"
            ),
            steps = listOf(
                "Tempelkan meteran penggaris tegak lurus di dinding ubin.",
                "Pegang bola tenis meja pada ketinggian awal tepat h = 100 cm (1 meter).",
                "Lepas bola tanpa didorong ke bawah (jatuh bebas murni).",
                "Perhatikan dan catat tinggi pantulan puncak pertama bola dari lantai (h'). Ulangi 3 kali untuk akurasi.",
                "Hitung koefisien restitusi tumbukan: e = √(h' / h). Misal jika h' = 64 cm, maka e = √(0,64) = 0,80!"
            ),
            observationGoal = "Membuktikan bahwa tumbukan bola dengan lantai keramik adalah lenting sebagian (0 < e < 1), di mana sebagian energi mekanik berubah menjadi gelombang bunyi denting bola.",
            connectionToSimulation = "Bandingkan nilai e hasil ujimu dengan simulator tumbukan elastis Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mi-1",
                prompt = "Sebuah bola bermassa 0,2 kg melaju dengan kecepatan 10 m/s ke kanan membentur dinding dan memantul kembali ke kiri dengan kecepatan 8 m/s. Berapakah besar perubahan momentum (impuls) yang dialami bola?",
                type = "numeric",
                correctAnswer = "3.6",
                tolerance = 0.1f,
                unit = "N·s",
                hints = listOf("Ingat bahwa momentum adalah vektor! Ke kanan bernilai (+10), ke kiri bernilai (-8).", "Δp = m × (v_akhir - v_awal).", "Δp = 0,2 × (-8 - 10) = 0,2 × (-18)."),
                explanation = "Δp = m · (v' - v) = 0,2 kg · (-8 m/s - 10 m/s) = 0,2 · (-18) = -3,6 kg·m/s (besar impulsnya adalah 3,6 N·s ke arah kiri).",
                misconception = "Mengurangkan nilai skalar 10 - 8 = 2 m/s sehingga salah menghitung perubahan momentum."
            ),
            QuizQuestion(
                id = "q-mi-2",
                prompt = "Dua gerbong kereta masing-masing bermassa 2.000 kg. Gerbong A melaju dengan kelajuan 6 m/s menabrak gerbong B yang diam. Setelah tabrakan, kedua gerbong bergandengan dan meluncur bersama. Berapakah kelajuan bersama kedua gerbong setelah tabrakan?",
                type = "numeric",
                correctAnswer = "3",
                tolerance = 0.1f,
                unit = "m/s",
                hints = listOf("Ini adalah tumbukan tidak lenting sama sekali (e = 0).", "m1 · v1 + m2 · v2 = (m1 + m2) · v'.", "(2.000 × 6) + 0 = (2.000 + 2.000) × v'."),
                explanation = "12.000 = 4.000 · v', sehingga v' = 12.000 / 4.000 = 3 m/s.",
                misconception = "Mengira kelajuan berkurang menjadi nol setelah bertabrakan."
            )
        )
    )

    // =========================================================================
    // 5. GRAVITASI UNIVERSAL NEWTON & HUKUM KEPLER
    // =========================================================================
    private val gravitasiKeplerLesson = LessonData(
        conceptId = "fis-gravitasi-kepler",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pgk1",
                panelNumber = 1,
                title = "Peluncuran Satelit Merah Putih 2",
                caption = "Dimas dan Kirana menonton siaran langsung roket Falcon 9 meluncurkan Satelit Merah Putih 2 Telkomsat ke orbit geostasioner.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Satelit itu melayang di ketinggian 36.000 km di atas khatulistiwa Indonesia. Kenapa satelit tidak jatuh ke bumi?",
                sceneVisualEmoji = "🛰️",
                sceneDescription = "Satelit komunikasi mengorbit bumi biru di atas kepulauan nusantara."
            ),
            StoryPanel(
                id = "pgk2",
                panelNumber = 2,
                title = "Jatuh Tanpa Pernah Menyentuh Tanah",
                caption = "Kakek tersenyum dan menganalogikan orbit satelit dengan eksperimen pikiran meriam Newton.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Satelit itu SEBENARNYA SEDANG JATUH setiap detik, Dimas! Tetapi karena kecepatan mendatarnya sangat tinggi (v ≈ 3,1 km/s), kelengkungan bumi melengkung menjauh dengan laju yang persis sama dengan jatuhnya satelit! Satelit terus jatuh mengitari bumi tanpa pernah menyentuh tanah!",
                sceneVisualEmoji = "🌍",
                sceneDescription = "Ilustrasi peluru meriam Newton mengorbit bumi jika ditembakkan dengan kecepatan orbit tepat."
            ),
            StoryPanel(
                id = "pgk3",
                panelNumber = 3,
                title = "Tiga Hukum Johannes Kepler",
                caption = "Kirana membuka buku astronomi tentang pergerakan planet mengitari matahari.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kepler membuktikan orbit planet berbentuk ELIPS dengan matahari di salah satu titik fokusnya. Saat planet mendekati perihelion, ia bergerak lebih cepat menyapu luas juring yang sama dalam waktu yang sama!",
                sceneVisualEmoji = "🪐",
                sceneDescription = "Orbit elips planet dengan garis hubung menyapu luasan yang sama dalam interval waktu sama."
            )
        ),
        intuitionTitle = "Gravitasi Universal: Tali Gaib Pengikat Alam Semesta",
        intuitionBody = "Isaac Newton menyadari bahwa gaya tarik yang menjatuhkan apel dari pohon adalah gaya yang PERSIS SAMA dengan gaya yang mengikat bulan mengitari bumi:\n\n" +
                "1. Hukum Gravitasi Universal: F = G · (M · m) / r².\n" +
                "   • Tetapan Gravitasi Universal: G = 6,674 × 10⁻¹¹ N·m²/kg².\n" +
                "   • Kuat Medan Gravitasi (Percepatan Gravitasi): g = G · M / r².\n" +
                "   • Energi Potensial Gravitasi: U = - G · M · m / r (bernilai negatif dan nol di tak hingga).\n\n" +
                "2. Kecepatan Orbit & Kecepatan Lepas:\n" +
                "   • Kecepatan Orbit Lingkaran Rendah: v_orbit = √(G·M / r) ≈ 7,9 km/s di bumi.\n" +
                "   • Kecepatan Lepas (Escape Velocity): v_lepas = √(2·G·M / r) ≈ 11,2 km/s (kecepatan minimum lepas total dari gravitasi bumi).\n\n" +
                "3. Tiga Hukum Kepler:\n" +
                "   • Hukum I: Semua planet bergerak pada orbit elips dengan matahari di salah satu fokus.\n" +
                "   • Hukum II: Garis hubung matahari-planet menyapu luas juring area yang sama dalam selang waktu yang sama (dA/dt = konstan).\n" +
                "   • Hukum III: T² / a³ = konstan untuk seluruh satelit yang mengitari induk yang sama.",
        intuitionPoints = listOf(
            "Astronot di ISS stasiun luar angkasa tampak melayang 'tanpa bobot' bukan karena tidak ada gravitasi (di sana gravitasi masih 90% bumi), melainkan karena mereka dan stasiun sama-sama berada dalam keadaan JATUH BEBAS terus-menerus.",
            "Orbit Geostasioner (GEO) memiliki periode revolusi tepat 24 jam sehingga satelit tampak diam melayang di atas titik yang sama di khatulistiwa.",
            "Jika jarak dua planet didekatkan menjadi separuh semula (1/2 r), gaya gravitasi meningkat menjadi 4 kali lipat!"
        ),
        simId = "sim-gravity",
        formulas = listOf(
            FormulaCard(
                symbol = "F_{grav}",
                equation = "F = G \\frac{m_1 m_2}{r^2}",
                meaning = "Hukum gravitasi universal Newton.",
                units = "Newton (N)",
                applicationNote = "r diukur dari pusat massa benda 1 ke pusat massa benda 2."
            ),
            FormulaCard(
                symbol = "g(r)",
                equation = "g = G \\frac{M}{r^2} = g_0 \\left(\\frac{R}{R + h}\\right)^2",
                meaning = "Percepatan gravitasi pada ketinggian h di atas permukaan planet berjari-jari R.",
                units = "m/s²",
                applicationNote = "Semakin tinggi dari bumi, nilai g semakin mengecil."
            ),
            FormulaCard(
                symbol = "v_{\\text{orbit}} & v_{\\text{lepas}}",
                equation = "v_{\\text{orbit}} = \\sqrt{\\frac{GM}{r}} \\quad , \\quad v_{\\text{lepas}} = \\sqrt{\\frac{2GM}{r}} = \\sqrt{2} \\, v_{\\text{orbit}}",
                meaning = "Kecepatan orbit melingkar dan kecepatan lepas gravitasi.",
                units = "m/s",
                applicationNote = "Kecepatan lepas selalu √2 (sekitar 1,414) kali lebih besar dari kecepatan orbit lingkaran."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Posisi Slot Orbit Geostasioner 113° Bujur Timur Satelit Nusantara Satu",
            context = "Indonesia sebagai negara kepulauan membutuhkan satelit komunikasi high-throughput untuk pemerataan akses internet di pulau-pulau 3T (Terdepan, Terluar, Tertinggal).",
            engineeringProblem = "Antena parabola stasiun bumi di pelosok Maluku atau Papua tidak boleh berputar mengikuti satelit; antena harus tetap membidik satu titik langit yang diam sepanjang hari tanpa tracking bermotor mahal.",
            physicalConceptUsed = "Hukum III Kepler dan dinamika gravitasi orbit geostasioner: T_satelit = T_rotasi_bumi = 86.164 detik (1 hari sideris).",
            mathematicalModel = "r = ∛(G · M_bumi · T² / (4π²)) = 42.164 km dari pusat bumi (atau ketinggian h = 35.786 km di atas khatulistiwa) dengan kecepatan orbit v = 3.075 m/s.",
            realWorldImpact = "Menyediakan layanan internet pita lebar bagi 150.000 titik sekolah, puskesmas, dan kantor desa di pelosok Nusantara.",
            relatedCareers = listOf("Insinyur Sistem Satelit Antariksa", "Ahli Astrodinamika Penerbangan", "Manajer Stasiun Pengendali Bumi"),
            verifiedSource = "PT Pasifik Satelit Nusantara (PSN) / Spesifikasi Teknis Satelit Nusantara Satu."
        ),
        homeLab = HomeLabData(
            title = "Menggambar Orbit Elips Menggunakan Dua Paku Pin & Benang",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 papan gabus, kardus tebal, atau styrofoam",
                "2 paku pin payung / jarum pentul (sebagai dua titik fokus F1 dan F2)",
                "Seutas benang kasur sepanjang 25 cm yang kedua ujungnya diikat melingkar (loop)",
                "1 pensil dan selembar kertas HVS putih"
            ),
            steps = listOf(
                "Tusukkan kedua paku pin pada kertas di atas kardus berjarak sekitar 8-10 cm (satu paku mewakili Matahari).",
                "Kaitkan lingkaran benang melingkari kedua paku pin.",
                "Selipkan ujung mata pensil di dalam ikatan benang, tarik keluar hingga benang membentuk segitiga kencang.",
                "Gerakkan pensil mengitari kedua paku pin dengan menjaga benang SELALU TEGANG.",
                "Amati bentuk kurva yang tergambar di kertas: sebuah kurva ELIPS SEMPURNA (Hukum I Kepler)!",
                "Ubah jarak kedua paku pin (eksentrisitas orbit) dan amati bagaimana elips mendekati lingkaran saat kedua paku pin bersatu."
            ),
            observationGoal = "Memahami secara fisik definisi geometris orbit elips Kepler: tempat kedudukan titik-titik yang jumlah jaraknya ke dua fokus selalu konstan (d1 + d2 = 2a).",
            connectionToSimulation = "Bandingkan elips benangmu dengan simulasi orbit planet mengitari matahari di Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-gk-1",
                prompt = "Jika massa bumi M dan jari-jari bumi R, berapakah percepatan gravitasi pada ketinggian h = R (satu jari-jari bumi di atas permukaan) dibanding gravitasi di permukaan bumi (g0)?",
                type = "multiple_choice",
                options = listOf("1/4 g0", "1/2 g0", "1/8 g0", "2 g0"),
                correctAnswer = "1/4 g0",
                hints = listOf("Ingat bahwa r diukur dari PUSAT bumi, bukan dari permukaan!", "Jarak dari pusat bumi adalah r = R + h = R + R = 2R.", "Gunakan rumus g = GM / r²."),
                explanation = "r = R + R = 2R. Maka g = GM / (2R)² = GM / (4R²) = 1/4 (GM/R²) = 1/4 g0. Gravitasi menyusut menjadi seperempat kali semula.",
                misconception = "Mengira jarak r = R sehingga salah menyimpulkan gravitasinya menjadi 1/2 kali."
            ),
            QuizQuestion(
                id = "q-gk-2",
                prompt = "Dua planet A dan B mengitari matahari. Jika perbandingan jarak rata-rata planet A dan B ke matahari adalah RA : RB = 1 : 4, berapakah perbandingan periode orbitnya (TA : TB)?",
                type = "multiple_choice",
                options = listOf("1 : 8", "1 : 2", "1 : 4", "1 : 16"),
                correctAnswer = "1 : 8",
                hints = listOf("Gunakan Hukum III Kepler: (TA / TB)² = (RA / RB)³.", "Hitung (1/4)³ = 1/64.", "Akar kuadratkan: √(1/64) = 1/8."),
                explanation = "(TA / TB)² = (RA / RB)³ = (1/4)³ = 1/64. Maka TA / TB = √(1/64) = 1/8.",
                misconception = "Langsung membandingkan kuadrat tanpa mempangkat tigakan jarak terlebih dahulu."
            )
        )
    )

    // =========================================================================
    // 6. ELASTISITAS BAHAN & HUKUM HOOKE
    // =========================================================================
    private val elastisitasHookeLesson = LessonData(
        conceptId = "fis-elastisitas-hooke",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "peh1",
                panelNumber = 1,
                title = "Suspensi Truk Sawit di Jalan Bergelombang",
                caption = "Truk tronton bermuatan kelapa sawit melintasi jalan tanah perkebunan Riau yang bergelombang penuh lubang.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Guncangannya diredam oleh tumpukan lempeng pegas baja di atas as roda. Mobil tidak sampai terbalik!",
                sceneVisualEmoji = "🛞",
                sceneDescription = "Pegas daun baja tebal (leaf spring) tertekan meredam getaran beban muatan truk."
            ),
            StoryPanel(
                id = "peh2",
                panelNumber = 2,
                title = "Hukum Hooke & Tegangan-Regangan",
                caption = "Kakek menjelaskan batas keelastisan bahan logam baja.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Robert Hooke menemukan bahwa pertambahan panjang pegas sebanding dengan gaya yang menariknya (F = k · Δx). Namun bila gaya melebihi Batas Elastis, kawat baja akan mengalami deformasi plastis permanen dan tidak bisa kembali ke bentuk semula!",
                sceneVisualEmoji = "🔩",
                sceneDescription = "Grafik tegangan-regangan menunjukkan daerah elastis linier, batas luluh, dan titik putus patah."
            ),
            StoryPanel(
                id = "peh3",
                panelNumber = 3,
                title = "Energi Potensial Pegas Busur Panah",
                caption = "Kirana menarik tali busur panah tradisional Papua dengan tenaga lengannya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Usaha yang kuberikan untuk meregangkan busur tersimpan menjadi Energi Potensial Elastis pegas (Ep = ½ k x²). Begitu tali kulepas, seluruh energi seketika beralih menjadi energi kinetik lesatan anak panah!",
                sceneVisualEmoji = "🏹",
                sceneDescription = "Busur panah melengkung menyimpan energi potensial elastis pegas tinggi."
            )
        ),
        intuitionTitle = "Mekanika Deformasi: Modulus Young & Resiliensi Pegas",
        intuitionBody = "Semua benda padat memiliki derajat elastisitas (kelenturan) tertentu saat menerima gaya luar:\n\n" +
                "1. Tegangan (Stress, σ = F / A): Gaya internal per satuan luas penampang material (satuan N/m² atau Pascal).\n" +
                "2. Regangan (Strain, ε = ΔL / L₀): Fraksi pertambahan panjang relatif tanpa satuan.\n" +
                "3. Modulus Young (E = σ / ε): Derajat kekakuan elastisitas material (Baja memiliki E ≈ 200 GPa, sangat kaku dibanding karet yang E ≈ 0,01 GPa).\n\n" +
                "Hukum Hooke pada Pegas:\n" +
                "• F_pemulih = - k · x (gaya berlawanan arah dengan simpangan x).\n" +
                "• Susunan Seri Pegas: 1/k_s = 1/k₁ + 1/k₂ (pegas gabungan menjadi LEBIH LENTUR, k mengecil).\n" +
                "• Susunan Paralel Pegas: k_p = k₁ + k₂ (pegas gabungan menjadi LEBIH KAKU, k bertambah).\n" +
                "• Energi Potensial Pegas: Ep = ½ k x² = ½ F x.",
        intuitionPoints = listOf(
            "Batas Elastis vs Titik Putus: Melewati batas elastis terjadi deformasi plastis (permanen), dan melewati tegangan ultimat material akan patah patah retak.",
            "Luas daerah di bawah kurva grafik F-x mewakili Usaha atau Energi Potensial Pegas (Ep = ½ k x²).",
            "Shock absorber kendaraan memadukan pegas spiral baja dengan fluida oli hidrolik untuk meredam osilasi getaran berlebih."
        ),
        simId = "sim-springs",
        formulas = listOf(
            FormulaCard(
                symbol = "F = k \\cdot \\Delta x",
                equation = "F = k \\cdot \\Delta x",
                meaning = "Hukum Hooke: Gaya pemulih sebanding dengan pertambahan panjang pegas.",
                units = "k dalam N/m, x dalam meter",
                applicationNote = "Tetapan pegas k mengukur kekakuan pegas."
            ),
            FormulaCard(
                symbol = "E (\\text{Modulus})",
                equation = "E = \\frac{\\sigma}{\\epsilon} = \\frac{F \\cdot L_0}{A \\cdot \\Delta L}",
                meaning = "Modulus Elastisitas Young bahan kawat/batang.",
                units = "Pascal (N/m²)",
                applicationNote = "Sifat intrinsik material, tidak bergantung pada panjang atau luas batang."
            ),
            FormulaCard(
                symbol = "E_p (\\text{Pegas})",
                equation = "E_p = \\frac{1}{2} k (\\Delta x)^2",
                meaning = "Energi potensial elastis yang tersimpan dalam pegas tertekan atau teregang.",
                units = "Joule (J)",
                applicationNote = "Jika regangan x diperpanjang 2 kali lipat, energi tersimpan melompat jadi 4 kali lipat!"
            )
        ),
        caseStudy = CaseStudyData(
            title = "Bantalan Elastomer Jembatan Merah Putih Ambon Peredam Gempa Bumi",
            context = "Jembatan Merah Putih membentang di Teluk Ambon di wilayah zona patahan gempa tektonik aktif Maluku.",
            engineeringProblem = "Getaran gempa bumi berkekuatan M 6,5 dapat meremukkan pilar beton jembatan jika dek jembatan diikat kaku dengan pilar penyangga.",
            physicalConceptUsed = "Elastisitas modulus geser bantalan karet elastomer berlapis pelat baja (Lead Rubber Bearing / LRB) yang mengikuti prinsip deformasi elastis Hukum Hooke.",
            mathematicalModel = "Bantalan karet bertindak sebagai pegas paralel raksasa berfrekuensi alami rendah f = (1/2π) √(k / M) yang menggeser periode getar jembatan menjauhi periode dominan gelombang gempa tanah.",
            realWorldImpact = "Menyelamatkan struktur bentang tengah jembatan sepanjang 300 meter dari kehancuran fatal saat gempa bumi mengguncang pulau Ambon.",
            relatedCareers = listOf("Insinyur Rekayasa Struktur Gempa", "Ahli Teknologi Material Polimer", "Konsultan Pengawasan Jembatan Bina Marga"),
            verifiedSource = "Kementerian PUPR Balai Jembatan / Laporan Desain Seismik Jembatan Merah Putih Ambon."
        ),
        homeLab = HomeLabData(
            title = "Menguji Hukum Hooke & Menghitung Konstanta Karet Gelang",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 buah karet gelang elastis",
                "1 cangkir plastik kecil atau kantong plastik sebagai wadah beban",
                "Koin logam sejenis (misal koin Rp1.000 logam bermassa ± 4,5 gram) sebagai anak timbangan",
                "Penggaris dan paku/gantungan baju"
            ),
            steps = listOf(
                "Gantungkan salah satu ujung karet gelang pada paku dinding atau gantungan baju.",
                "Gantungkan gelas plastik kosong di ujung bawah karet, lalu ukur panjang awal karet L0 dengan penggaris.",
                "Masukkan 5 keping koin ke dalam gelas. Ukur pertambahan panjangnya Δx1.",
                "Tambahkan 5 koin lagi (total 10 koin), ukur pertambahan panjang Δx2.",
                "Tambahkan lagi hingga 15 koin dan 20 koin. Catat tabel hubungan jumlah koin (gaya F) terhadap Δx.",
                "Plot grafik F terhadap Δx. Amati bahwa titik-titik membentuk garis lurus linier yang kemiringannya adalah tetapan k!"
            ),
            observationGoal = "Membuktikan keabsahan Hukum Hooke bahwa pertambahan panjang berbanding lurus secara linier dengan gaya beban yang diberikan.",
            connectionToSimulation = "Bandingkan grafik linier koinmu dengan kurva osilasi pegas di simulator Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-eh-1",
                prompt = "Sebuah pegas bertambah panjang 4 cm saat ditarik dengan gaya 20 N. Berapakah energi potensial elastis yang tersimpan dalam pegas tersebut?",
                type = "numeric",
                correctAnswer = "0.4",
                tolerance = 0.05f,
                unit = "Joule",
                hints = listOf("Ingat satuan panjang harus diubah ke meter: Δx = 4 cm = 0,04 m.", "Gunakan rumus Ep = 1/2 × F × Δx.", "Ep = 0,5 × 20 N × 0,04 m."),
                explanation = "Ep = 1/2 · F · Δx = 0,5 · 20 N · 0,04 m = 0,4 Joule. (Atau cari k = 20 / 0,04 = 500 N/m, lalu Ep = 1/2 · 500 · 0,04² = 0,4 J).",
                misconception = "Lupa mengonversi satuan centimeter ke meter sehingga hasil perhitungan meleset 100 kali lipat."
            ),
            QuizQuestion(
                id = "q-eh-2",
                prompt = "Dua pegas identik masing-masing memiliki konstanta pegas k = 200 N/m disusun secara PARALEL. Berapakah konstanta pegas pengganti gabungan keduanya?",
                type = "numeric",
                correctAnswer = "400",
                tolerance = 1.0f,
                unit = "N/m",
                hints = listOf("Pada susunan paralel, konstanta pegas dijumlahkan langsung: kp = k1 + k2.", "Hitung 200 + 200."),
                explanation = "kp = k1 + k2 = 200 N/m + 200 N/m = 400 N/m. Susunan paralel membuat pegas menjadi lebih kaku.",
                misconception = "Menggunakan rumus kebalikan 1/k (yang merupakan rumus susunan seri)."
            )
        )
    )

    // =========================================================================
    // 7. DINAMIKA ROTASI & KESETIMBANGAN BENDA TEGAR
    // =========================================================================
    private val rotasiLesson = LessonData(
        conceptId = "fis-rotasi",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "prt1",
                panelNumber = 1,
                title = "Membuka Baut Roda Bus yang Macet",
                caption = "Mekanik bengkel di Terminal Tirtonadi Solo berusaha membuka baut roda bus yang macet dengan kunci pas pendek.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bautnya macet sekali! Mekanik tidak kuat memutarnya meski sudah bertumpu dengan seluruh berat badannya.",
                sceneVisualEmoji = "🔧",
                sceneDescription = "Mekanik memasang pipa besi panjang menyambung kunci pas untuk membuka baut roda bus."
            ),
            StoryPanel(
                id = "prt2",
                panelNumber = 2,
                title = "Momen Gaya (Torsi): τ = r × F",
                caption = "Kakek memperhatikan mekanik mengambil sebatang pipa besi panjang sepanjang 1,5 meter untuk menyambung gagang kunci.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Momen gaya (Torsi τ = r · F · sin θ) adalah penyebab benda berputar! Dengan menyambung pipa, lengan torsi (r) menjadi 3 kali lebih panjang. Dengan gaya tekan yang sama, torsi pemutarnya melompat 3 kali lipat sehingga baut langsung berputar longgar!",
                sceneVisualEmoji = "💪",
                sceneDescription = "Diagram torsi memperlihatkan perpanjangan lengan gaya r mempermudah putaran poros baut."
            ),
            StoryPanel(
                id = "prt3",
                panelNumber = 3,
                title = "Inersia Berputar Atlet Loncat Indah",
                caption = "Kirana menonton atlet loncat indah PON melipat tubuhnya rapat-rapat saat berputar di udara.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Saat atlet menekuk lutut dan memeluk dadanya, momen inersianya (I) mengecil drastis. Karena momentum sudut kekal (L = I · ω), kecepatan putarannya (ω) seketika melesat kencang!",
                sceneVisualEmoji = "🤸",
                sceneDescription = "Atlet loncat indah berputar cepat saat melipat tubuh dan melambat saat merentangkan badan."
            )
        ),
        intuitionTitle = "Dunia Berputar: Torsi, Inersia & Momentum Sudut",
        intuitionBody = "Dinamika rotasi adalah analogi rotasional dari gerak translasi linier:\n\n" +
                "• Posisi linier x  ⇄  Sudut putar θ\n" +
                "• Kecepatan linier v  ⇄  Kecepatan sudut ω\n" +
                "• Massa m (kemalasan translasi)  ⇄  Momen Inersia I = Σ m r² (kemalasan berputar)\n" +
                "• Gaya F  ⇄  Momen Gaya / Torsi τ = r · F · sin θ\n" +
                "• Hukum II Newton: Σ F = m a  ⇄  Σ τ = I · α\n" +
                "• Momentum linier p = m v  ⇄  Momentum Sudut L = I · ω\n\n" +
                "Gerak Menggelinding Murni (Rolling Without Slipping):\n" +
                "Benda menggelinding memiliki DUA energi kinetik sekaligus: Energi Kinetik Translasi dan Rotasi:\n" +
                "Ek_total = ½ m v² + ½ I ω² = ½ m v² (1 + k_bentuk).\n\n" +
                "Syarat Kesetimbangan Statis Benda Tegar:\n" +
                "1. Kesetimbangan Translasi: Σ Fx = 0 dan Σ Fy = 0.\n" +
                "2. Kesetimbangan Rotasi: Σ τ = 0 di sembarang titik poros tumpuan.",
        intuitionPoints = listOf(
            "Silinder pejal menggelinding di lereng lebih cepat daripada silinder berongga karena momen inersianya lebih kecil (I_pejal = ½ mR² < I_rongga = mR²).",
            "Teorema Sumbu Sejajar: I = I_pm + m d² (menghitung momen inersia jika poros putar digeser sejauh d dari pusat massa).",
            "Gasing yang berputar kencang mempertahankan porosnya tegak karena prinsip kekekalan momentum sudut (giroskop navigasi pesawat)."
        ),
        simId = "sim-rotation",
        formulas = listOf(
            FormulaCard(
                symbol = "\\boldsymbol{\\tau}",
                equation = "\\tau = r \\cdot F \\sin\\theta = I \\cdot \\alpha",
                meaning = "Torsi (momen gaya) = lengan gaya × komponen gaya tegak lurus = momen inersia × percepatan sudut.",
                units = "N·m",
                applicationNote = "Torsi bernilai maksimum saat gaya tegak lurus lengan (θ = 90°)."
            ),
            FormulaCard(
                symbol = "I (\\text{Inersia})",
                equation = "I_{\\text{bola pejal}} = \\frac{2}{5}mR^2 \\quad , \\quad I_{\\text{silinder pejal}} = \\frac{1}{2}mR^2",
                meaning = "Momen inersia berbagai benda tegar simetris terhadap sumbu pusat massa.",
                units = "kg·m²",
                applicationNote = "Semakin jauh distribusi massa dari poros putar, semakin besar momen inersianya."
            ),
            FormulaCard(
                symbol = "L (\\text{Sudut})",
                equation = "L = I \\cdot \\omega = \\text{konstan} \\implies I_1 \\omega_1 = I_2 \\omega_2",
                meaning = "Hukum kekekalan momentum sudut jika torsi luar total nol (Στ_ext = 0).",
                units = "kg·m²/s",
                applicationNote = "Dasar manuver putaran pesenam lantai, atlet loncat indah, dan bintang neutron pulsar."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kesetimbangan Statis Tower Crane Proyek Gedung Pencakar Langit Jakarta",
            context = "Tower crane setinggi 150 meter di kawasan SCBD Sudirman Jakarta mengangkat balok baja seberat 8 ton untuk konstruksi lantai puncak gedung.",
            engineeringProblem = "Bagaimana lengan derek horizontal sepanjang 60 meter tidak patah atau crane tidak terjungkal ke depan saat menjulurkan beban seberat 8 ton di ujung boom?",
            physicalConceptUsed = "Hukum Kesetimbangan Statis Benda Tegar Σ F = 0 dan Σ τ = 0 terhadap poros tiang mast utama.",
            mathematicalModel = "Insinyur struktur menempatkan blok beton penyeimbang (counterweight) bermassa M seberat puluhan ton di lengan belakang (jib pendek) sedemikian rupa sehingga torsi beban Σ τ = (M_counter · g · r_counter) - (m_beban · g · r_beban) = 0 pada rentang operasional aman.",
            realWorldImpact = "Mencegah runtuhnya tower crane di tengah kawasan padat lalu lintas ibu kota dan menjamin keselamatan ratusan pekerja konstruksi.",
            relatedCareers = listOf("Insinyur Peralatan Angkat Berat", "Konsultan Struktur Konstruksi Gedung", "Operator Tower Crane Bersertifikat"),
            verifiedSource = "Permenaker No. 8 Tahun 2020 tentang K3 Pesawat Angkat dan Angkut / Manual Crane Liebherr."
        ),
        homeLab = HomeLabData(
            title = "Balapan Menggelinding: Kaleng Berisi Cairan vs Kaleng Kosong",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 kaleng susu kental manis atau kaleng soda yang masih penuh tertutup rapat",
                "1 kaleng bekas sejenis yang sudah kosong (atau botol berisi air penuh vs botol kosong)",
                "1 papan kardus panjang datar sebagai lintasan miring",
                "Beberapa buku tebal sebagai pengganjal bidang miring"
            ),
            steps = listOf(
                "Buat lereng bidang miring dengan mengganjal salah satu ujung papan kardus setinggi 15 cm.",
                "Posisikan kaleng penuh dan kaleng kosong sejajar di garis start puncak papan.",
                "Tahan keduanya dengan penggaris secara bersamaan.",
                "Angkat penggaris secara serentak sehingga kedua kaleng menggelinding turun bebas menuruni lereng.",
                "Amati dengan seksama kaleng mana yang menyentuh garis finish terlebih dahulu!",
                "Ulangi 3 kali untuk membuktikan konsistensi pemenangnya."
            ),
            observationGoal = "Melihat secara nyata pengaruh distribusi momen inersia: kaleng isi berputar lebih cepat karena cairan di dalamnya tidak ikut berputar penuh, sehingga energi kinetik translasi lebih besar dibanding kaleng kosong.",
            connectionToSimulation = "Bandingkan balapan kaleng dengan simulasi balapan silinder vs bola di simulator rotasi."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-rot-1",
                prompt = "Sebuah gaya F = 50 N bekerja tegak lurus pada ujung kunci inggris sepanjang 30 cm (0,3 meter) dari poros baut. Berapakah besar momen gaya (torsi) yang dihasilkan?",
                type = "numeric",
                correctAnswer = "15",
                tolerance = 0.1f,
                unit = "N·m",
                hints = listOf("Gunakan rumus torsi: τ = r × F × sin θ.", "Karena tegak lurus, sin 90° = 1.", "τ = 0,3 m × 50 N."),
                explanation = "τ = r · F · sin 90° = 0,3 m · 50 N · 1 = 15 N·m.",
                misconception = "Lupa mengubah satuan 30 cm menjadi 0,3 meter."
            ),
            QuizQuestion(
                id = "q-rot-2",
                prompt = "Seorang penari balet berputar dengan lengan terentang memiliki momen inersia I1 = 4 kg·m² dan kecepatan sudut ω1 = 2 rad/s. Saat ia merapatkan kedua lengannya ke dada, momen inersianya mengecil menjadi I2 = 1 kg·m². Berapakah kecepatan sudut putarannya sekarang?",
                type = "numeric",
                correctAnswer = "8",
                tolerance = 0.1f,
                unit = "rad/s",
                hints = listOf("Gunakan hukum kekekalan momentum sudut: I1 × ω1 = I2 × ω2.", "4 × 2 = 1 × ω2.", "ω2 = 8 / 1."),
                explanation = "I1 · ω1 = I2 · ω2 => 4 kg·m² · 2 rad/s = 1 kg·m² · ω2 => ω2 = 8 rad/s. Kecepatan putarannya meningkat 4 kali lipat!",
                misconception = "Mengira energi kinetik rotasi selalu kekal, padahal penari melakukan usaha otot saat menarik lengannya ke dada."
            )
        )
    )

    // =========================================================================
    // 8. FLUIDA STATIS & DINAMIS (ASAS BERNOULLI)
    // =========================================================================
    private val fluidaLesson = LessonData(
        conceptId = "fis-fluida",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pfl1",
                panelNumber = 1,
                title = "Lepas Landas Pesawat di Bandara Soekarno-Hatta",
                caption = "Pesawat Airbus A330 Garuda Indonesia bermassa 200 ton berakselerasi di landasan pacu lalu terangkat mulus ke angkasa.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Pesawat seberat ratusan ton baja dan bahan bakar ini bisa melayang di udara tipis! Gaya apa yang mengangkatnya ke atas?",
                sceneVisualEmoji = "🛫",
                sceneDescription = "Pesawat berbadan lebar lepas landas memperlihatkan profil kelengkungan sayap airfoil aerodinamis."
            ),
            StoryPanel(
                id = "pfl2",
                panelNumber = 2,
                title = "Profil Sayap Airfoil & Asas Bernoulli",
                caption = "Kakek menggambar penampang melintang sayap pesawat (aerofoil) di selembar tiket.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sayap pesawat dirancang melengkung cembung di bagian atas dan relatif datar di bawah. Udara yang melintas di atas sayap bergerak LEBIH CEPAT (v_atas > v_bawah). Menurut Asas Bernoulli, semakin cepat aliran fluida, TEKANANNYA SEMAKIN RENDAH (P_atas < P_bawah). Beda tekanan ini menghasilkan Gaya Angkat Sayap (Lift) yang mengangkat pesawat!",
                sceneVisualEmoji = "💨",
                sceneDescription = "Garis arus fluida melengkung di atas sayap berkecepatan tinggi dengan tekanan rendah."
            ),
            StoryPanel(
                id = "pfl3",
                panelNumber = 3,
                title = "Hukum Kontinuitas Aliran Sungai",
                caption = "Kirana memperhatikan aliran Sungai Ciliwung yang menyempit di bawah pilar jembatan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Persamaan Kontinuitas A1 · v1 = A2 · v2 membuktikannya! Saat penampang sungai menyempit, laju aliran air seketika melompat deras untuk menjaga debit fluida tetap konstan!",
                sceneVisualEmoji = "🌊",
                sceneDescription = "Arus sungai yang menyempit mengalir deras melewati celah bebatuan."
            )
        ),
        intuitionTitle = "Dinamika Aliran: Kontinuitas, Tekanan & Energi Fluida",
        intuitionBody = "Fluida dinamis ideal diasumsikan inkompresibel (tak termampatkan) dan non-viskos (tanpa gesekan kental internal):\n\n" +
                "1. Persamaan Kontinuitas (Kekekalan Massa):\n" +
                "   • Debit Aliran (Q = A · v = V / t): Konstan di setiap penampang.\n" +
                "   • A₁ · v₁ = A₂ · v₂ (pipa menyempit membuat laju fluida meningkat).\n\n" +
                "2. Persamaan Bernoulli (Kekekalan Energi Mekanik Fluida):\n" +
                "   P + ½ ρ v² + ρ g h = konstan di sepanjang garis arus (streamline).\n" +
                "   • Tekanan Statis P + Tekanan Dinamis (½ ρ v²) + Tekanan Hidrostatis (ρ g h) = konstan.\n" +
                "   • Jika kecepatan v bertambah pada ketinggian sama, tekanan statis P HARUS turun!\n\n" +
                "3. Penerapan Nyata Asas Bernoulli:\n" +
                "   • Gaya angkat sayap pesawat (F_angkat = ½ ρ A (v_atas² - v_bawah²)).\n" +
                "   • Tabung Pitot: Mengukur kecepatan pesawat di udara.\n" +
                "   • Venturimeter: Mengukur laju aliran cairan di dalam pipa kilang minyak.\n" +
                "   • Semprotan parfum / racun nyamuk dan karburator motor.",
        intuitionPoints = listOf(
            "Gaya Torricelli: Kecepatan semburan air dari lubang bocor kecil pada tangki setinggi h dari permukaan adalah v = √(2 g h), persis sama dengan kecepatan jatuh bebas!",
            "Viskositas (Kekentalan) Fluida Sejati: Menghasilkan gaya hambat gesek Stokes F_s = 6 π η r v pada partikel yang bergerak di dalam cairan kental.",
            "Efek Magnus: Bola tenis atau bola sepak yang berputar melengkung di udara (tendangan pisang) terjadi karena perbedaan kecepatan udara Bernoulli di kedua sisi bola."
        ),
        simId = "sim-fluids",
        formulas = listOf(
            FormulaCard(
                symbol = "Q",
                equation = "Q = A_1 v_1 = A_2 v_2",
                meaning = "Persamaan kontinuitas debit fluida inkompresibel.",
                units = "m³/s",
                applicationNote = "A dalam m² dan v dalam m/s. Jika diameter pipa mengecil 1/2 kali, kecepatan v melonjak 4 kali!"
            ),
            FormulaCard(
                symbol = "\\text{Bernoulli}",
                equation = "P_1 + \\frac{1}{2}\\rho v_1^2 + \\rho g h_1 = P_2 + \\frac{1}{2}\\rho v_2^2 + \\rho g h_2",
                meaning = "Persamaan hukum kekekalan energi fluida Bernoulli.",
                units = "Pascal (Pa)",
                applicationNote = "ρ adalah massa jenis fluida (kg/m³)."
            ),
            FormulaCard(
                symbol = "F_{\\text{angkat}}",
                equation = "F_{\\text{angkat}} = \\frac{1}{2} \\rho A (v_{\\text{atas}}^2 - v_{\\text{bawah}}^2)",
                meaning = "Gaya angkat aerodinamis sayap pesawat seluas A.",
                units = "Newton (N)",
                applicationNote = "Pesawat terangkat saat F_angkat melebihi berat total pesawat (W = mg)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Tabung Pitot Pengukur Kecepatan Udara Pesawat Terbang BMKG & Maskapai Indonesia",
            context = "Kecelakaan penerbangan sering dipicu oleh pembacaan kecepatan udara (airspeed) yang salah saat tabung pitot tertutup es beku di awan badai kumulonimbus.",
            engineeringProblem = "Bagaimana mengukur kecepatan laju pesawat terbang relatif terhadap udara sekitar pada ketinggian 10.000 meter tanpa roda yang menyentuh tanah?",
            physicalConceptUsed = "Asas Bernoulli pada titik stagnasi tabung Pitot: P_total = P_statis + ½ ρ v².",
            mathematicalModel = "Tabung pitot membandingkan tekanan total ujung moncong dengan tekanan statis lubang samping port. Komputer udara menghitung kelajuan pesawat: v = √((2 · (P_total - P_statis)) / ρ_udara).",
            realWorldImpact = "Dilengkapi pemanas listrik bimetal anti-es (pitot heat) untuk menjamin pilot dan autopilot mendapatkan data kecepatan yang akurat di tengah badai tropis khatulistiwa.",
            relatedCareers = listOf("Insinyur Instrumentasi Avionik", "Teknisi Pemeliharaan Pesawat (A/P Mechanic)", "Meteorolog Penerbangan BMKG"),
            verifiedSource = "Buku Pedoman Kelaikudaraan CASR Part 25 Ditjen Perhubungan Udara Kemenhub."
        ),
        homeLab = HomeLabData(
            title = "Meniup Selembar Kertas HVS & Bola Pingpong Melayang di Corong",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 lembar kertas HVS atau kertas buku biasa",
                "1 corong minyak plastik kecil (atau leher botol plastik yang dipotong)",
                "1 bola tenis meja (pingpong)"
            ),
            steps = listOf(
                "Pegang ujung selembar kertas HVS di bawah bibir bawahmu, biarkan ujung kertas lainnya melengkung terkulai ke bawah.",
                "Tiuplah dengan kencang tepat di ATAS permukaan kertas yang melengkung.",
                "Amati: kertas justru TERANGKAT NAIK KE ATAS mendatar, bukan tertekan ke bawah! (Asas Bernoulli: aliran udara cepat di atas menurunkan tekanan, tekanan udara tinggi di bawah mendorong kertas naik).",
                "Sekarang masukkan bola pingpong ke dalam corong plastik yang menghadap ke atas. Tiup lubang corong dari bawah sekuat tenaga. Amati bola pingpong tidak terlempar melainkan berputar tertahan di corong!"
            ),
            observationGoal = "Membuktikan secara langsung bahwa peningkatan kecepatan aliran udara menghasilkan penurunan tekanan statis fluida (Asas Bernoulli).",
            connectionToSimulation = "Bandingkan fenomena kertas dengan penampang sayap aerofoil di simulator fluida Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-flu-1",
                prompt = "Air mengalir melalui pipa berdiameter penampang besar D1 = 10 cm dengan kelajuan 2 m/s. Pipa tersebut menyempit menjadi penampang kecil berdiameter D2 = 5 cm. Berapakah kelajuan air di penampang pipa kecil tersebut?",
                type = "numeric",
                correctAnswer = "8",
                tolerance = 0.1f,
                unit = "m/s",
                hints = listOf("Gunakan persamaan kontinuitas: A1 × v1 = A2 × v2.", "Luas penampang lingkaran sebanding dengan kuadrat diameter: A = 1/4 π D².", "v2 = v1 × (D1 / D2)² = 2 × (10 / 5)²."),
                explanation = "v2 = v1 · (D1 / D2)² = 2 m/s · (10 / 5)² = 2 · (2)² = 2 · 4 = 8 m/s. Karena diameter mengecil setengah, luas menyusut seperempat, maka kecepatan melompat 4 kali lipat.",
                misconception = "Lupa mengkuadratkan rasio diameter (hanya mengalikan 2 × 2 = 4 m/s)."
            ),
            QuizQuestion(
                id = "q-flu-2",
                prompt = "Menurut Asas Bernoulli, jika laju aliran udara di atas sayap pesawat dibuat lebih besar daripada di bawah sayap (v_atas > v_bawah), apa yang terjadi pada tekanan udaranya?",
                type = "multiple_choice",
                options = listOf(
                    "Tekanan udara di atas sayap lebih kecil daripada di bawah sayap (P_atas < P_bawah)",
                    "Tekanan udara di atas sayap lebih besar daripada di bawah sayap (P_atas > P_bawah)",
                    "Tekanan udara di kedua sisi sayap sama besar",
                    "Tekanan udara di atas sayap menjadi nol mutlak"
                ),
                correctAnswer = "Tekanan udara di atas sayap lebih kecil daripada di bawah sayap (P_atas < P_bawah)",
                hints = listOf("Asas Bernoulli menyatakan: kelajuan fluida tinggi berpasangan dengan tekanan rendah.", "Beda tekanan inilah yang mendorong sayap ke atas."),
                explanation = "Di mana kecepatan fluida bertambah tinggi, tekanan statisnya berkurang. Sehingga v_atas > v_bawah menyebabkan P_atas < P_bawah, menghasilkan gaya angkat ke atas (F = ΔP · A).",
                misconception = "Mengira angin yang kencang justru menekan benda lebih kuat ke bawah."
            )
        )
    )

    // =========================================================================
    // 9. TEORI KINETIK GAS & HUKUM TERMODINAMIKA
    // =========================================================================
    private val termodinamikaLesson = LessonData(
        conceptId = "fis-termodinamika",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "ptm1",
                panelNumber = 1,
                title = "Memompa Ban Sepeda Motor di Siang Terik",
                caption = "Dimas memompa ban motornya yang kempes di siang hari terik di kota Surabaya. Setelah selesai, tabung pompa terasa panas menyengat di tangan.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Lho! Pompa ini tidak dekat api kompor, tapi kenapa tabung besinya terasa panas setelah memompa beberapa kali?",
                sceneVisualEmoji = "🚲",
                sceneDescription = "Tabung pompa ban manual memanas akibat kompresi adiabatik udara di dalamnya."
            ),
            StoryPanel(
                id = "ptm2",
                panelNumber = 2,
                title = "Hukum I Termodinamika: Usaha Jadi Panas",
                caption = "Kakek menjelaskan konversi energi pada kompresi udara.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itu bukti Hukum I Termodinamika (ΔU = Q - W)! Saat kamu menekan tuas pompa dengan cepat, kamu melakukan Usaha mekanik (-W) pada gas. Karena panas belum sempat keluar ke lingkungan, energi usaha itu langsung menaikkan Energi Dalam (ΔU) gas, sehingga suhu udara melonjak naik dan memanaskan tabung!",
                sceneVisualEmoji = "🔥",
                sceneDescription = "Diagram partikel gas bertumbukan semakin rapat dan cepat menaikkan energi kinetik termal."
            ),
            StoryPanel(
                id = "ptm3",
                panelNumber = 3,
                title = "Batas Efisiensi Siklus Mesin Carnot",
                caption = "Kirana mempelajari diagram siklus mesin pembangkit listrik tenaga uap PLTU Paiton.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Hukum II Termodinamika menyatakan tidak ada mesin kalor di alam semesta yang memiliki efisiensi 100%! Selalu ada energi panas buang yang dilepas ke tandon dingin (reservoir suhu rendah). Mesin ideal Carnot menetapkan batas efisiensi maksimum teoritis: η_maks = 1 - (T_rendah / T_tinggi)!",
                sceneVisualEmoji = "🏭",
                sceneDescription = "Siklus termodinamika Carnot pada diagram P-V dengan dua garis isotermal dan dua adiabatik."
            )
        ),
        intuitionTitle = "Mikroskopis ke Makroskopis: Gas Ideal & Siklus Panas",
        intuitionBody = "Termodinamika menghubungkan gerakan acak triliunan atom mikroskopis dengan besaran makroskopis terukur:\n\n" +
                "1. Persamaan Gas Ideal: P · V = n · R · T = N · k_B · T.\n" +
                "   • Tekanan Gas berasal dari tumbukan momentum miliaran partikel pada dinding wadah.\n" +
                "   • Energi Kinetik Rata-rata Partikel: Ek = 3/2 k_B T (Suhu mutlak Kelvin adalah ukuran langsung dari energi kinetik rata-rata partikel!).\n" +
                "   • Kecepatan Efektif: v_rms = √(3 k_B T / m) = √(3 R T / M_r).\n\n" +
                "2. Hukum I Termodinamika (Kekekalan Energi): ΔU = Q - W.\n" +
                "   • Usaha Gas: W = ∫ P dV.\n" +
                "   • Isobarik (Tekanan Tetap): W = P · ΔV.\n" +
                "   • Isokhorik / Isometrik (Volume Tetap): ΔV = 0 => W = 0 => Q = ΔU.\n" +
                "   • Isotermal (Suhu Tetap): ΔT = 0 => ΔU = 0 => Q = W = nRT ln(V₂/V₁).\n" +
                "   • Adiabatik (Tanpa Pertukaran Kalor): Q = 0 => ΔU = - W.\n\n" +
                "3. Hukum II Termodinamika & Siklus Carnot:\n" +
                "   • Kalor mengalir secara spontan HANYA dari suhu tinggi ke suhu rendah.\n" +
                "   • Efisiensi Mesin Kalor: η = W / Q_in = 1 - (Q_out / Q_in).\n" +
                "   • Efisiensi Maksimum Carnot: η_Carnot = 1 - (T_C / T_H) dengan suhu dalam KELVIN.",
        intuitionPoints = listOf(
            "Suhu dalam semua rumus termodinamika WAJIB dinyatakan dalam skala mutlak KELVIN (T_K = T_C + 273).",
            "Entropi alam semesta selalu meningkat dalam setiap proses spontan ireversibel nyata.",
            "Kulkas dan AC adalah mesin kalor terbalik (pompa kalor) yang membutuhkan usaha listrik dari luar untuk memindahkan panas dari ruangan dingin ke luar yang panas."
        ),
        simId = "sim-thermodynamics",
        formulas = listOf(
            FormulaCard(
                symbol = "PV = nRT",
                equation = "P \\cdot V = n \\cdot R \\cdot T",
                meaning = "Persamaan keadaan gas ideal.",
                units = "P (Pa), V (m³), T (Kelvin)",
                applicationNote = "R = 8,314 J/(mol·K). 1 atm = 101.325 Pa, 1 liter = 10⁻³ m³."
            ),
            FormulaCard(
                symbol = "\\Delta U = Q - W",
                equation = "\\Delta U = Q - W",
                meaning = "Hukum I Termodinamika. Q (+) jika sistem menyerap kalor, W (+) jika sistem melakukan usaha memuai.",
                units = "Joule (J)",
                applicationNote = "Untuk gas monoatomik ideal: ΔU = 3/2 n R ΔT."
            ),
            FormulaCard(
                symbol = "\\eta_{\\text{Carnot}}",
                equation = "\\eta = 1 - \\frac{T_C}{T_H} = \\frac{T_H - T_C}{T_H}",
                meaning = "Efisiensi maksimum mesin kalor teoritis siklus Carnot.",
                units = "Tanpa satuan (dikalikan 100%)",
                applicationNote = "Suhu T_H (reservoir panas) dan T_C (reservoir dingin) WAJIB dalam Kelvin."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Siklus Rankine Turbin Uap Pembangkit Listrik Tenaga Panas Bumi (PLTP) Kamojang Jawa Barat",
            context = "PLTP Kamojang memanfaatkan uap panas bumi alami bertekanan tinggi dari perut bumi Gunung Guntur untuk memutar turbin listrik generator.",
            engineeringProblem = "Bagaimana memaksimalkan efisiensi konversi termal uap bumi geotermal menjadi listrik dan membuang panas sisa tanpa merusak ekosistem hutan lindung?",
            physicalConceptUsed = "Hukum II Termodinamika dan siklus tenaga uap Rankine dengan kondensor pendingin sirkulasi tertutup.",
            mathematicalModel = "Uap geotermal masuk turbin pada suhu T_H = 240°C (513 K) dan keluar ke kondensor pada suhu T_C = 45°C (318 K). Efisiensi Carnot teoritis maksimum η = 1 - (318 / 513) ≈ 38%, dengan efisiensi riil turbin sekitar 30%. Air kondensat diinjeksikan kembali ke perut bumi.",
            realWorldImpact = "Menyediakan listrik hijau bersih terbarukan 235 MW yang beroperasi stabil 24 jam sehari selama lebih dari 40 tahun tanpa emisi karbon.",
            relatedCareers = listOf("Insinyur Panas Bumi (Geothermal Engineer)", "Spesialis Termodinamika Pembangkit", "Teknisi Operasi Turbin Uap"),
            verifiedSource = "PT Pertamina Geothermal Energy (PGE) / Laporan Kinerja Operasi PLTP Kamojang Unit 1-5."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Kompresi Kaleng Minuman Panas Menciut Dingin",
            safetyLevel = "Dengan Pengawasan Orang Tua",
            materials = listOf(
                "1 kaleng minuman aluminium bekas yang bersih",
                "1 mangkok besar berisi air dingin dan bongkahan es batu",
                "Kompor gas dapur dan capit penjepit kaleng tahan panas",
                "1 sendok makan air bersih"
            ),
            steps = listOf(
                "Masukkan 1 sendok makan air ke dalam kaleng aluminium kosong.",
                "Pegang kaleng dengan capit tahan panas di atas api kecil kompor hingga air di dalam kaleng mendidih dan uap air mengepul keluar dari mulut kaleng selama 1 menit (seluruh udara terusir digantikan uap air).",
                "Siapkan mangkok besar berisi air es di samping kompor.",
                "Dengan cepat dan mantap menggunakan capit, ANGKAT DAN BALIKKAN KALENG sehingga mulut kaleng langsung tercelup ke dalam air es dingin.",
                "DUARR! Dalam sekejap mata, KALENG ALUMINIUM MENCIUT RINGSEK REMUK DENGAN SUARA KERAS!"
            ),
            observationGoal = "Membuktikan Hukum Gas Ideal: uap air di dalam kaleng mendadak mengembun saat didinginkan drastis, menyebabkan tekanan di dalam kaleng anjlok mendekati nol sehingga tekanan atmosfer luar meremukkan kaleng seketika.",
            connectionToSimulation = "Bandingkan perubahan tekanan kaleng dengan diagram P-T gas ideal di simulator termodinamika."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-tm-1",
                prompt = "Sebuah mesin kalor Carnot beroperasi di antara reservoir suhu tinggi 500 Kelvin dan reservoir suhu rendah 300 Kelvin. Berapakah efisiensi maksimum mesin tersebut?",
                type = "numeric",
                correctAnswer = "40",
                tolerance = 0.5f,
                unit = "persen (%)",
                hints = listOf("Gunakan rumus efisiensi Carnot: η = (1 - TC / TH) × 100%.", "η = (1 - 300 / 500) × 100%.", "η = (1 - 0,6) × 100% = 0,4 × 100%."),
                explanation = "η = (1 - TC / TH) × 100% = (1 - 300 / 500) × 100% = (200 / 500) × 100% = 40%.",
                misconception = "Lupa mengalikan dengan 100% atau terbalik membagi TH dengan TC."
            ),
            QuizQuestion(
                id = "q-tm-2",
                prompt = "Suatu gas ideal menyerap kalor sebesar 500 Joule dari lingkungan dan pada saat yang sama melakukan usaha memuai sebesar 200 Joule ke lingkungan. Berapakah perubahan energi dalam (ΔU) gas tersebut?",
                type = "numeric",
                correctAnswer = "300",
                tolerance = 1.0f,
                unit = "Joule",
                hints = listOf("Gunakan Hukum I Termodinamika: ΔU = Q - W.", "Q menyerap kalor bertanda positif (+500 J).", "W melakukan usaha bertanda positif (+200 J)."),
                explanation = "ΔU = Q - W = (+500 J) - (+200 J) = +300 Joule. Energi dalam gas bertambah 300 Joule sehingga suhunya meningkat.",
                misconception = "Tertukar tanda positif dan negatif pada usaha atau kalor."
            )
        )
    )

    // =========================================================================
    // 10. GELOMBANG MEKANIK, EFEK DOPPLER & DIFRAKSI
    // =========================================================================
    private val gelombangMekanikLesson = LessonData(
        conceptId = "fis-gelombang-mekanik",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pgm10",
                panelNumber = 1,
                title = "Sirine Ambulans di Jalur Pantura",
                caption = "Sebuah mobil ambulans melaju kencang membunyikan sirine mendahului sepeda motor Dimas di jalur Pantura Brebes.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Saat ambulans mendekat, nada sirine terdengar melengking tinggi (frekuensi tinggi). Begitu ambulans lewat dan menjauh, nadanya mendadak anjlok terdengar lebih rendah bass! Kenapa bisa berubah begitu?",
                sceneVisualEmoji = "🚑",
                sceneDescription = "Ambulans bergerak memampatkan muka gelombang bunyi di depan dan merenggangkan di belakang."
            ),
            StoryPanel(
                id = "pgm20",
                panelNumber = 2,
                title = "Efek Doppler Akustik",
                caption = "Kakek menjelaskan fenomena perubahan frekuensi akibat gerak relatif sumber bunyi.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itulah Efek Doppler! Saat sumber mendekat, mobil 'mengejar' gelombang bunyinya sendiri sehingga muka gelombang termampatkan lebih rapat (panjang gelombang λ mengecil, frekuensi terdengar fp naik). Rumusnya: fp = ((v ± vp) / (v ∓ vs)) · fs!",
                sceneVisualEmoji = "📡",
                sceneDescription = "Muka gelombang bunyi lingkaran yang rapat di depan mobil dan renggang di belakang mobil."
            ),
            StoryPanel(
                id = "pgm30",
                panelNumber = 3,
                title = "Interferensi Celah Ganda Thomas Young",
                caption = "Kirana menyinari dua celah sempit dengan sinar laser merah di laboratorium sekolah.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Cahaya bukan sekadar partikel lurus, cahaya adalah gelombang! Di layar muncul pola garis terang-gelap selang-seling akibat interferensi konstruktif dan destruktif dua gelombang celah.",
                sceneVisualEmoji = "🌈",
                sceneDescription = "Pola interferensi berkas garis terang dan gelap pada layar uji celah ganda Young."
            )
        ),
        intuitionTitle = "Harmoni Gelombang: Superposisi, Doppler & Sifat Optis Gelombang",
        intuitionBody = "Gelombang mekanik dan elektromagnetik mematuhi prinsip superposisi linear:\n\n" +
                "1. Persamaan Gelombang Berjalan Sinusoidal:\n" +
                "   y(x,t) = A · sin(ω t ∓ k x + φ₀).\n" +
                "   • Amplitudo A, Frekuensi Sudut ω = 2π f, Bilangan Gelombang k = 2π / λ.\n" +
                "   • Tanda minus (-kx) artinya gelombang merambat ke arah KANAN (+x).\n\n" +
                "2. Efek Doppler Bunyi:\n" +
                "   fp = ((v ± vp) / (v ∓ vs)) · fs.\n" +
                "   • Pendengar mendekati sumber: vp bernilai (+).\n" +
                "   • Sumber mendekati pendengar: vs bernilai (-).\n\n" +
                "3. Gelombang Stasioner (Tegak):\n" +
                "   • Dawai & Pipa Organa: Terbentuk simpul (amplitudo nol) dan perut (amplitudo maksimal).\n" +
                "   • Taraf Intensitas Bunyi: TI = 10 log(I / I₀) dalam desibel (dB) dengan intensitas ambang I₀ = 10⁻¹² W/m².\n\n" +
                "4. Optika Gelombang (Interferensi & Difraksi):\n" +
                "   • Interferensi Celah Ganda Young: d · sin θ = m · λ (pola garis terang ke-m).\n" +
                "   • Kisi Difraksi: d = 1 / N (N = jumlah garis per cm).",
        intuitionPoints = listOf(
            "Setiap kenaikan 10 dB pada taraf intensitas bunyi berarti intensitas fisik gelombang meningkat 10 KALI LIPAT (skala logaritmik). Kenaikan 20 dB berarti 100 kali lipat!",
            "Efek Doppler juga berlaku pada gelombang cahaya galaksi: pergeseran merah (redshift) membuktikan bahwa alam semesta kita sedang mengembang!",
            "Warna-warni kemilau pada sayap kupu-kupu atau piringan CD adalah fenomena interferensi difraksi cahaya, bukan pigmen cat warna."
        ),
        simId = "sim-wave-mechanics",
        formulas = listOf(
            FormulaCard(
                symbol = "y(x,t)",
                equation = "y = A \\sin(\\omega t \\pm k x) \\quad , \\quad k = \\frac{2\\pi}{\\lambda} \\quad , \\quad \\omega = 2\\pi f",
                meaning = "Persamaan gelombang sinusoidal berjalan harmonik.",
                units = "meter",
                applicationNote = "Laju rambat gelombang v = ω / k = λ · f."
            ),
            FormulaCard(
                symbol = "f_p (\\text{Doppler})",
                equation = "f_p = \\left( \\frac{v \\pm v_p}{v \\mp v_s} \\right) f_s",
                meaning = "Persamaan Efek Doppler pergeseran frekuensi bunyi.",
                units = "Hertz (Hz)",
                applicationNote = "v = cepat rambat bunyi di udara (≈ 340 m/s). vp = kecepatan pendengar, vs = kecepatan sumber."
            ),
            FormulaCard(
                symbol = "TI",
                equation = "TI = 10 \\log_{10}\\left(\\frac{I}{I_0}\\right) \\quad , \\quad TI_n = TI_1 + 10 \\log_{10}(n)",
                meaning = "Taraf intensitas bunyi n sumber identik yang berbunyi serempak.",
                units = "desibel (dB)",
                applicationNote = "I0 = 10⁻¹² W/m² (ambang pendengaran manusia normal)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Radar Cuaca Doppler BMKG & Sistem Peringatan Dini InaTEWS",
            context = "Badan Meteorologi, Klimatologi, dan Geofisika (BMKG) mengoperasikan puluhan radar cuaca maritim Doppler C-band di seluruh kepulauan Indonesia.",
            engineeringProblem = "Bagaimana mendeteksi kecepatan pusaran angin puting beliung di dalam awan badai gelap dari jarak 150 km sebelum menyapu pemukiman?",
            physicalConceptUsed = "Efek Doppler gelombang mikro elektromagnetik: pulsa gelombang mikro dipantulkan oleh butir tetes hujan yang sedang bergerak.",
            mathematicalModel = "Pergeseran frekuensi Doppler Δf = 2 · v_radial · (f₀ / c) mendeteksi kecepatan dan arah angin puting beliung (mendekat ditandai hijau/biru, menjauh ditandai merah).",
            realWorldImpact = "Memberikan peringatan dini evakuasi 30 menit sebelum bencana angin puting beliung dan banjir bandang melanda warga.",
            relatedCareers = listOf("Radar Engineer BMKG", "Meteorolog Operasional Cuaca Ekstrem", "Spesialis Pengolahan Sinyal Digital"),
            verifiedSource = "BMKG Pusat Meteorologi Penerbangan & Maritim / Standar Operasional Radar Cuaca Doppler."
        ),
        homeLab = HomeLabData(
            title = "Melihat Pola Difraksi Kisi Cahaya Menggunakan Keping CD Bekas & Senter HP",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 keping CD atau DVD bekas yang permukaannya bersih",
                "1 senter lampu kilat (flash) smartphone",
                "Ruangan kamar yang agak gelap",
                "Dinding putih polos sebagai layar pantul"
            ),
            steps = listOf(
                "Matikan lampu kamar agar ruangan temaram.",
                "Pegang keping CD dengan sisi mengkilap menghadap ke dinding putih.",
                "Nyalakan senter HP dan sinari permukaan keping CD dengan sudut miring sekitar 45°.",
                "Arahkan pantulan cahaya dari keping CD ke dinding putih polos.",
                "Amati di dinding: muncul pelangi spektrum warna-warni yang terpisah rapi (merah, jingga, kuning, hijau, biru, ungu)!",
                "Ubah sudut kemiringan senter dan amati pergeseran posisi garis-garis pelangi difraksi."
            ),
            observationGoal = "Membuktikan bahwa jalur trek spiral mikroskopis pada keping CD (lebar antar trek d ≈ 1,6 mikrometer) bertindak sebagai kisi difraksi pemantul alami yang memisahkan spektrum panjang gelombang cahaya putih.",
            connectionToSimulation = "Bandingkan jarak antar pita warna pelangi dengan simulator celah difraksi Young."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-gm10-1",
                prompt = "Sebuah mobil ambulans membunyikan sirine dengan frekuensi 680 Hz melaju dengan kecepatan 20 m/s mendekati seorang pejalan kaki yang diam di tepi jalan. Jika cepat rambat bunyi di udara 340 m/s, berapakah frekuensi sirine yang didengar oleh pejalan kaki tersebut?",
                type = "numeric",
                correctAnswer = "722.5",
                tolerance = 1.0f,
                unit = "Hz",
                hints = listOf("Gunakan rumus Efek Doppler: fp = ((v + vp) / (v - vs)) × fs.", "vp = 0 (pejalan kaki diam), vs = 20 m/s (sumber mendekat bertanda minus di penyebut).", "fp = (340 / (340 - 20)) × 680 = (340 / 320) × 680."),
                explanation = "fp = (340 / (340 - 20)) × 680 Hz = (340 / 320) × 680 = 1,0625 × 680 = 722,5 Hz. Nada terdengar lebih tinggi dari aslinya.",
                misconception = "Menggunakan tanda plus di penyebut padahal sumber mendekati pendengar."
            ),
            QuizQuestion(
                id = "q-gm10-2",
                prompt = "Sebuah mesin pabrik menghasilkan taraf intensitas bunyi 70 dB. Jika 100 buah mesin identik dinyalakan bersamaan, berapakah taraf intensitas bunyi totalnya?",
                type = "numeric",
                correctAnswer = "90",
                tolerance = 0.5f,
                unit = "dB",
                hints = listOf("Gunakan rumus: TIn = TI1 + 10 log10(n).", "n = 100 mesin, maka log10(100) = 2.", "TIn = 70 + (10 × 2)."),
                explanation = "TIn = 70 dB + 10 log10(100) = 70 + (10 × 2) = 70 + 20 = 90 dB.",
                misconception = "Mengalikan 70 dB dengan 100 (mengira hasilnya 7.000 dB)."
            )
        )
    )

    // =========================================================================
    // 11. LISTRIK STATIS, MEDAN, POTENSIAL & KAPASITOR
    // =========================================================================
    private val listrikStatisLesson = LessonData(
        conceptId = "fis-listrik-statis",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pls1",
                panelNumber = 1,
                title = "Sambaran Petir di Puncak Monas",
                caption = "Kilatan petir dahsyat menyambar ujung penangkal petir tembaga di puncak tugu Monumen Nasional (Monas) Jakarta.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Petir itu memancarkan kilatan raksasa yang memekakkan telinga! Dari mana muatan listrik sebesar itu berasal?",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Kilatan petir menyambar ujung runcing penangkal petir tugu Monas di langit mendung malam."
            ),
            StoryPanel(
                id = "pls2",
                panelNumber = 2,
                title = "Hukum Coulomb & Medan Listrik",
                caption = "Kakek menjelaskan akumulasi muatan awan kumulonimbus.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Gesekan kristal es di dalam awan memisahkan muatan positif dan negatif. Muatan raksasa ini menciptakan Medan Listrik E = F / q yang sangat kuat di udara. Begitu kuat medan melampaui batas tembus dielektrik udara (3 juta Volt/meter), udara terionisasi menjadi plasma dan mengalirkan loncatan muatan petir ke tanah!",
                sceneVisualEmoji = "🌩️",
                sceneDescription = "Garis-garis medan listrik pekat antara dasar awan bermuatan negatif dan permukaan tanah."
            ),
            StoryPanel(
                id = "pls3",
                panelNumber = 3,
                title = "Penyimpan Energi Kapasitor",
                caption = "Kirana membongkar sirkuit lampu blitz kamera saku lama.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lampu kilat kamera ditenagai oleh Kapasitor! Kapasitor keping sejajar (C = ε A / d) menyimpan energi elektrostatik (U = ½ C V²) secara perlahan dari baterai kecil, lalu melepaskannya dalam satu kilatan cahaya dahsyat sekejap milidetik!",
                sceneVisualEmoji = "📸",
                sceneDescription = "Komponen kapasitor silinder di papan sirkuit menyimpan energi pelepasan cepat lampu kilat."
            )
        ),
        intuitionTitle = "Elektrostatika Analitis: Muatan, Fluks Gauss & Dielektrik",
        intuitionBody = "Elektrostatika mengkaji interaksi muatan-muatan listrik dalam keadaan diam:\n\n" +
                "1. Hukum Coulomb: F = k · (|q₁ q₂| / r²) dengan tetapan Coulomb k = 1 / (4πε₀) ≈ 8,99 × 10⁹ N·m²/C².\n\n" +
                "2. Kuat Medan Listrik (E = F / q₀): Arah medan keluar dari muatan positif dan masuk ke muatan negatif.\n" +
                "   • Untuk muatan titik: E = k · q / r².\n" +
                "   • Hukum Gauss: Fluks listrik Φ = ∮ E · dA = Q_enclosed / ε₀ (sangat ampuh menghitung medan pada bola, silinder kawat, dan pelat datar simetris).\n\n" +
                "3. Potensial Listrik (V) & Hubungan Gradien Medan:\n" +
                "   • Potensial skalar: V = k · q / r (satuan Volt = Joule/Coulomb).\n" +
                "   • Medan listrik seragam: E = ΔV / d.\n\n" +
                "4. Kapasitor Keping Sejajar:\n" +
                "   • Kapasitansi: C = Q / V = ε_r · ε₀ · (A / d).\n" +
                "   • Dielektrik: Bahan isolator disisipkan memperbesar kapasitas sebanyak faktor dielektrik ε_r (karena polarisasi atom mereduksi medan internal).\n" +
                "   • Energi Tersimpan: U = ½ Q V = ½ C V² = ½ Q² / C.",
        intuitionPoints = listOf(
            "Di dalam rongga konduktor tertutup (Sangkar Faraday), medan listrik SELALU NOL (E = 0) karena seluruh muatan tersebar di kulit luar konduktor.",
            "Potensial listrik adalah besaran SKALAR, sehingga jika ada banyak muatan, potensial total cukup dijumlahkan secara aljabar biasa tanpa mengurai vektor!",
            "Menghubungkan kapasitor secara seri: 1/Cs = 1/C1 + 1/C2 (tegangan terbagi). Paralel: Cp = C1 + C2 (muatan bertambah)."
        ),
        simId = "sim-electrostatics",
        formulas = listOf(
            FormulaCard(
                symbol = "F & E",
                equation = "F = \\frac{1}{4\\pi\\epsilon_0}\\frac{|q_1 q_2|}{r^2} \\quad , \\quad \\mathbf{E} = \\frac{\\mathbf{F}}{q_0}",
                meaning = "Hukum Coulomb dan definisi vektor kuat medan listrik.",
                units = "Newton (N) & N/C (atau V/m)",
                applicationNote = "ε₀ = 8,854 × 10⁻¹² C²/(N·m²)."
            ),
            FormulaCard(
                symbol = "C (\\text{Kapasitor})",
                equation = "C = \\kappa \\epsilon_0 \\frac{A}{d} \\quad , \\quad Q = C \\cdot V",
                meaning = "Kapasitansi keping sejajar dengan konstanta dielektrik κ.",
                units = "Farad (F)",
                applicationNote = "1 Farad adalah satuan sangat besar, biasanya digunakan mikrofarad (μF) atau pikofarad (pF)."
            ),
            FormulaCard(
                symbol = "U (\\text{Energi})",
                equation = "U = \\frac{1}{2} C V^2 = \\frac{1}{2} \\frac{Q^2}{C}",
                meaning = "Energi potensial elektrostatik yang tersimpan di dalam medan listrik kapasitor.",
                units = "Joule (J)",
                applicationNote = "Energi ini tersimpan di dalam ruang medan listrik antara kedua keping pelat."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sistem Proteksi Penangkal Petir Sangkar Faraday Gedung Pencakar Langit Jakarta",
            context = "Jakarta dan wilayah Bogor dinobatkan sebagai salah satu wilayah dengan hari guruh (thunderstorm days) tertinggi di dunia, mencapai lebih dari 200 hari badai petir per tahun.",
            engineeringProblem = "Bagaimana melindungi ribuan server komputer dan penghuni di dalam gedung perkantoran tinggi dari sambaran petir berarus 50.000 Ampere?",
            physicalConceptUsed = "Prinsip Sangkar Faraday konduktor tertutup dan hukum elektrostatik muatan pada ujung runcing (tegangan tembus medan E = V/r pada r kecil).",
            mathematicalModel = "Jaringan konduktor tembaga diatap gedung membentuk jala pelindung Faraday dengan elektroda terminasi runcing Franklin yang menyalurkan arus surja petir ke sistem pembumian (grounding) dengan resistansi tanah R_tanah < 1 Ohm.",
            realWorldImpact = "Melindungi instalasi perbankan nasional dan mencegah korsleting fatal pada pusat data komputasi awan.",
            relatedCareers = listOf("Insinyur Sistem Proteksi Petir", "Auditor K3 Kelistrikan Industri", "Perancang Instalasi Grounding"),
            verifiedSource = "Standar Nasional Indonesia (SNI 03-7015-2004) tentang Sistem Proteksi Petir pada Bangunan Gedung."
        ),
        homeLab = HomeLabData(
            title = "Membuat Elektroskop Sederhana Pendeteksi Muatan Listrik",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 toples kaca bening dengan tutup plastik",
                "Kawat tembaga atau klip kertas logam dibuka lurus",
                "Kertas aluminium foil tipis (potong 2 helai kecil ukuran 1 × 3 cm)",
                "Sedotan plastik atau penggaris mika",
                "Kain wol atau rambut kering"
            ),
            steps = listOf(
                "Lubangi tutup toples plastik, masukkan kawat tembaga sehingga bagian atas membentuk spiral bundar dan bagian bawah membentuk kait 'J'.",
                "Gantungkan kedua lembar daun aluminium foil berdampingan pada kait 'J' di dalam toples, lalu tutup toples rapat-rapat.",
                "Gosokkan sedotan plastik atau penggaris mika ke rambut keringmu berkali-kali hingga bermuatan listrik statis.",
                "Dekatkan sedotan bermuatan ke kepala kawat spiral di atas toples (tanpa menyentuhnya).",
                "Amati kedua daun aluminium foil di dalam toples: KEDUA DAUN SEKETIKA MEKAR SALING MENOLAK!",
                "Jauhkan sedotan, daun menguncup kembali. Sentuh kepala kawat dengan jarimu untuk menetralkan muatan."
            ),
            observationGoal = "Membuktikan adanya gaya tolak-menolak elektrostatik Coulomb antara dua muatan yang sejenis pada daun elektroskop.",
            connectionToSimulation = "Bandingkan sudut bukaan daun foil dengan simulator muatan elektrostatik Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ls-1",
                prompt = "Dua muatan titik masing-masing q1 = +2 μC dan q2 = +8 μC terpisah pada jarak 20 cm di udara (k = 9 × 10⁹ N·m²/C²). Berapakah besar gaya tolak-menolak Coulomb antara kedua muatan tersebut?",
                type = "numeric",
                correctAnswer = "3.6",
                tolerance = 0.1f,
                unit = "Newton",
                hints = listOf("Konversikan satuan: q1 = 2 × 10⁻⁶ C, q2 = 8 × 10⁻⁶ C, dan r = 0,2 m.", "F = k × q1 × q2 / r².", "F = (9 × 10⁹ × 16 × 10⁻¹²) / (0,2)² = 0,144 / 0,04."),
                explanation = "F = (9 × 10⁹ · 2 × 10⁻⁶ · 8 × 10⁻⁶) / (0,2)² = 0,144 / 0,04 = 3,6 Newton.",
                misconception = "Lupa mengonversi jarak centimeter ke meter (0,2 meter dikuadratkan = 0,04)."
            ),
            QuizQuestion(
                id = "q-ls-2",
                prompt = "Sebuah kapasitor keping sejajar memiliki kapasitas 10 μF dihubungkan ke sumber tegangan baterai 20 Volt. Berapakah energi elektrostatik yang tersimpan di dalam kapasitor tersebut?",
                type = "numeric",
                correctAnswer = "0.002",
                tolerance = 0.0002f,
                unit = "Joule",
                hints = listOf("Gunakan rumus U = 1/2 × C × V².", "C = 10 μF = 10 × 10⁻⁶ F = 10⁻⁵ F.", "U = 0,5 × 10⁻⁵ × (20)² = 0,5 × 10⁻⁵ × 400 = 200 × 10⁻⁵ = 0,002 Joule (atau 2 mJ)."),
                explanation = "U = 1/2 · C · V² = 0,5 · 10⁻⁵ F · 400 V² = 2 × 10⁻³ Joule = 0,002 Joule (2 mJ).",
                misconception = "Lupa mengkuadratkan tegangan V."
            )
        )
    )

    // =========================================================================
    // 12. RANGKAIAN DC MULTILOOP & TRANSIEN RC
    // =========================================================================
    private val listrikDinamisLesson = LessonData(
        conceptId = "fis-listrik-dinamis",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pld1",
                panelNumber = 1,
                title = "Panel Surya Rumah Mandiri Energi",
                caption = "Keluarga Kirana memasang sistem Pembangkit Listrik Tenaga Surya (PLTS) Atap dengan 2 baterai penyimpan dan inverter.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Rangkaian kabelnya bercabang rumit ke banyak loop: ada sumber dari panel surya, dari baterai aki, dan dari jaringan PLN!",
                sceneVisualEmoji = "☀️",
                sceneDescription = "Diagram sistem PLTS atap dengan inverter, baterai bank, dan beban rumah tangga multiloop."
            ),
            StoryPanel(
                id = "pld2",
                panelNumber = 2,
                title = "Hukum II Kirchhoff: Keliling Loop",
                caption = "Kakek mengajarkan cara menelusuri sirkuit multiloop menggunakan Hukum Kirchhoff.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jangan bingung, gunakan Hukum II Kirchhoff (Σ ε + Σ I·R = 0)! Dalam suatu lintasan tertutup (loop), jumlah aljabar gaya gerak listrik (GGL) dan penurunan tegangan selalu sama dengan nol karena energi potensial harus kembali ke nilai awalnya!",
                sceneVisualEmoji = "🔄",
                sceneDescription = "Diagram sirkuit dua loop bertingkat dengan arah arus dan tanda kutub sumber tegangan."
            ),
            StoryPanel(
                id = "pld3",
                panelNumber = 3,
                title = "Transien Pengisian Kapasitor RC",
                caption = "Kirana memperhatikan grafik pengisian muatan pada osiloskop laboratorium.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kapasitor tidak terisi seketika, melainkan mengikuti kurva eksponensial q(t) = Q_maks (1 - e^(-t/RC)). Konstanta waktu τ = R·C menentukan seberapa cepat rangkaian bereaksi!",
                sceneVisualEmoji = "📈",
                sceneDescription = "Kurva eksponensial transien pengisian dan pengosongan tegangan kapasitor terhadap waktu."
            )
        ),
        intuitionTitle = "Analisis Sirkuit Kompleks: Kirchhoff, Jembatan & Rangkaian RC",
        intuitionBody = "Ketika rangkaian listrik memiliki lebih dari satu sumber tegangan dan banyak percabangan rumit, hukum Ohm sederhana tidak lagi cukup:\n\n" +
                "1. Hukum I Kirchhoff (Titik Percabangan / KCL):\n" +
                "   Σ I_masuk = Σ I_keluar (prinsip kekekalan muatan listrik).\n\n" +
                "2. Hukum II Kirchhoff (Loop Tertutup / KVL):\n" +
                "   Σ ε + Σ (I · R) = 0 (prinsip kekekalan energi listrik).\n" +
                "   • Kaidah Tanda: Saat menelusuri loop searah jarum jam, jika menemui kutub positif sumber terlebih dahulu maka GGL bertanda positif (+ε), jika searah arus maka penurunan tegangan bertanda (+I·R).\n\n" +
                "3. Jembatan Wheatstone:\n" +
                "   • Dipakai mengukur nilai hambatan yang belum diketahui dengan presisi ultra tinggi.\n" +
                "   • Kondisi Seimbang (jarum galvanometer nol): R₁ · R₄ = R₂ · R₃.\n\n" +
                "4. Transien Rangkaian RC:\n" +
                "   • Pengisian: V_C(t) = ε · (1 - e^(-t / τ)) dengan konstanta waktu τ = R · C.\n" +
                "   • Pada t = τ, kapasitor terisi sekitar 63,2% dari kapasitas maksimumnya.",
        intuitionPoints = listOf(
            "Tegangan jepit baterai nyata (V_jepit = ε - I·r) selalu LEBIH KECIL dari nilai GGL tertera (ε) saat baterai mengalirkan arus karena adanya hambatan dalam r di dalam cairan elektrolit baterai.",
            "Saat kapasitor baru mulai diisi (t = 0), kapasitor bertindak seperti kawat hubung singkat (short circuit, R_C = 0). Saat sudah penuh (t → ∞), kapasitor bertindak seperti kawat terputus (open circuit, arus I = 0).",
            "Jembatan Wheatstone banyak digunakan dalam sensor regangan jembatan (strain gauge) dan sensor suhu RTD."
        ),
        simId = "sim-dc-circuits",
        formulas = listOf(
            FormulaCard(
                symbol = "\\Sigma \\mathcal{E}",
                equation = "\\Sigma \\mathcal{E} + \\Sigma (I \\cdot R) = 0",
                meaning = "Hukum II Kirchhoff untuk loop tertutup tegangan.",
                units = "Volt (V)",
                applicationNote = "Terapkan sistem persamaan linear dua variabel (SPLDV) untuk menyelesaikan arus di setiap cabang."
            ),
            FormulaCard(
                symbol = "V_{\\text{jepit}}",
                equation = "V_{\\text{jepit}} = \\mathcal{E} - I \\cdot r = I \\cdot R_{\\text{luar}}",
                meaning = "Tegangan jepit baterai berhambatan dalam r yang menyuplai beban luar R.",
                units = "Volt (V)",
                applicationNote = "I = ε / (R_luar + r)."
            ),
            FormulaCard(
                symbol = "\\tau (\\text{Konstanta})",
                equation = "\\tau = R \\cdot C \\quad , \\quad q(t) = Q_0 \\left(1 - e^{-t/\\tau}\\right)",
                meaning = "Konstanta waktu respon transien pengisian rangkaian RC seri.",
                units = "Sekon (detik)",
                applicationNote = "Setelah selang waktu 5τ, kapasitor dianggap telah terisi penuh 99,3%."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sistem Manajemen Baterai (BMS) Mobil Listrik Hyundai Ioniq 5 Indonesia",
            context = "Mobil listrik yang dirakit di Cikarang Jawa Barat ini memiliki paket baterai lithium-ion 800 Volt yang tersusun dari ribuan sel baterai seri dan paralel.",
            engineeringProblem = "Jika salah satu sel baterai mengalami penurunan kapasitas atau suhu panas berlebih, ketidakseimbangan tegangan sel dapat merusak seluruh paket baterai.",
            physicalConceptUsed = "Hukum I & II Kirchhoff multiloop dan pemantauan jembatan resistansi presisi tinggi.",
            mathematicalModel = "Komputer BMS secara aktif membaca tegangan jepit V_jepit = ε_i - I · r_i setiap modul sel hingga ketelitian 1 milivolt dan mengalihkan arus penyeimbang (active balancing) melintasi percabangan loop.",
            realWorldImpact = "Mencegah kebakaran thermal runaway dan memperpanjang umur pakai baterai hingga lebih dari 10 tahun pemakaian harian.",
            relatedCareers = listOf("Insinyur Sistem Manajemen Baterai", "Arsitek Sistem Kendaraan Listrik", "Teknisi Pengujian Sel Lithium"),
            verifiedSource = "Buku Manual Teknis Sistem Kelistrikan Kendaraan Listrik Hyundai Ioniq 5."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Efek Transien Lampu LED Padam Lambat dengan Kapasitor",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 baterai 9 Volt",
                "1 buah kapasitor elektrolit (elko) ukuran besar (1.000 μF atau 470 μF, 16V)",
                "1 lampu LED kecil",
                "1 resistor 1.000 Ohm (1 kΩ) sebagai pembatas arus",
                "Kabel jumper penjepit buaya"
            ),
            steps = listOf(
                "Hubungkan kutub positif baterai ke kaki positif kapasitor (kaki panjang) dan negatif baterai ke kaki negatif kapasitor (tanda garis putih).",
                "Tahan selama 5 detik agar kapasitor terisi penuh muatan listrik.",
                "Lepaskan baterai sepenuhnya dari rangkaian (sekarang kapasitor berdiri sendiri sebagai sumber listrik mandiri).",
                "Hubungkan kedua kaki kapasitor ke lampu LED melalui resistor 1 kΩ (perhatikan kutub LED tidak boleh terbalik).",
                "Amati lampu LED: LAMPU MENYALA TERANG LALU MEREDUP PERLAHAN-LAHAN SECARA EKSPONENSIAL SELAMA BEBERAPA DETIK SEBELUM PADAM TOTAL!",
                "Hitung lama waktu lampu meredup: τ = R × C = 1.000 Ω × 0,001 F = 1 detik!"
            ),
            observationGoal = "Melihat secara langsung fenomena transien pengosongan muatan kapasitor melintasi resistor penghambat.",
            connectionToSimulation = "Bandingkan grafik peluruhan tegangan kapasitormu dengan osiloskop simulator RC Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ld-1",
                prompt = "Sebuah baterai memiliki GGL 12 Volt dan hambatan dalam r = 0,5 Ohm. Jika baterai tersebut dihubungkan ke lampu luar berhambatan R = 5,5 Ohm, berapakah kuat arus listrik yang mengalir dalam rangkaian?",
                type = "numeric",
                correctAnswer = "2",
                tolerance = 0.1f,
                unit = "Ampere",
                hints = listOf("Gunakan rumus I = ε / (R + r).", "Jumlahkan hambatan luar dan dalam: 5,5 + 0,5 = 6 Ohm.", "Bagi 12 Volt dengan 6 Ohm."),
                explanation = "I = ε / (R + r) = 12 V / (5,5 Ω + 0,5 Ω) = 12 / 6 = 2 Ampere.",
                misconception = "Mengabaikan nilai hambatan dalam baterai (hanya membagi 12 / 5,5)."
            ),
            QuizQuestion(
                id = "q-ld-2",
                prompt = "Rangkaian RC seri terdiri dari resistor R = 200 kΩ (200.000 Ohm) dan kapasitor C = 5 μF (5 × 10⁻⁶ Farad). Berapakah konstanta waktu (τ) pengisian rangkaian tersebut?",
                type = "numeric",
                correctAnswer = "1",
                tolerance = 0.05f,
                unit = "sekon (detik)",
                hints = listOf("Gunakan rumus konstanta waktu: τ = R × C.", "Kalikan 200.000 Ohm dengan 5 × 10⁻⁶ Farad.", "200.000 × 5 = 1.000.000 × 10⁻⁶."),
                explanation = "τ = R · C = 2 × 10⁵ Ω × 5 × 10⁻⁶ F = 1,0 sekon.",
                misconception = "Lupa mengalikan prefix kilo (10³) dan mikro (10⁻⁶)."
            )
        )
    )

    // =========================================================================
    // 13. MEDAN MAGNET, INDUKSI FARADAY & SIRKUIT RLC
    // =========================================================================
    private val medanMagnetLesson = LessonData(
        conceptId = "fis-medan-magnet",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pmm1",
                panelNumber = 1,
                title = "Dengungan Trafo Gardu PLN Malam Hari",
                caption = "Saat berjalan di dekat gardu distribusi listrik tegangan tinggi PLN, terdengar bunyi dengungan konstan berfrekuensi 50 Hz.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kek, kenapa gardu trafo itu berbunyi mendengung teratur seperti lebah raksasa?",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Transformator daya tegangan tinggi gardu PLN bersenandung frekuensi 50 Hz."
            ),
            StoryPanel(
                id = "pmm2",
                panelNumber = 2,
                title = "Induksi Faraday & Hukum Lenz",
                caption = "Kakek menjelaskan fenomena getaran magnetostriksi pada inti besi trafo AC.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Listrik PLN adalah Arus Bolak-Balik (AC) berfrekuensi 50 Hz. Sesuai Hukum Induksi Faraday (ε = -N dΦ/dt), fluks magnet berubah bolak-balik 50 kali tiap detik! Hukum Lenz menyatakan arah arus induksi selalu MENENTANG perubahan penyebabnya. Inti besi trafo memuai-menyusut bolak-balik menciptakan bunyi dengung itu!",
                sceneVisualEmoji = "🧲",
                sceneDescription = "Diagram fluks magnet bolak-balik menginduksi tegangan sekunder pada inti besi transformator."
            ),
            StoryPanel(
                id = "pmm3",
                panelNumber = 3,
                title = "Resonansi Sirkuit RLC Radio Komunikasi",
                caption = "Kirana memutar kenop tuning tuner pada radio penerima gelombang AM/FM.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Tepat di frekuensi pemancar radio favoritku, suaranya jernih tanpa derau! Pada frekuensi resonansi f = 1 / (2π √(LC)), reaktansi induktif XL saling meniadakan reaktansi kapasitif XC sehingga impedansi sirkuit mencapai titik terendah (Z = R) dan arus sinyal melonjak maksimal!",
                sceneVisualEmoji = "📻",
                sceneDescription = "Kurva resonansi sirkuit RLC menunjukkan puncak arus sinyal yang sangat tajam pada frekuensi resonansi."
            )
        ),
        intuitionTitle = "Elektrodinamika Lanjut: Biot-Savart, Faraday-Lenz & Resonansi AC",
        intuitionBody = "Elektrodinamika James Clerk Maxwell menggabungkan kelistrikan dan kemagnetan dalam kerangka matematis yang terpadu:\n\n" +
                "1. Hukum Biot-Savart & Hukum Ampere:\n" +
                "   • Kawat lurus panjang berarus I: B = (μ₀ · I) / (2π · a).\n" +
                "   • Solenoida panjang di pusat: B = μ₀ · n · I (dengan n = N/L lilitan per meter).\n" +
                "   • Gaya Lorentz Antar-Dua Kawat Sejajar: F/L = (μ₀ I₁ I₂) / (2π d) (arus searah tarik-menarik, arus berlawanan tolak-menolak).\n\n" +
                "2. Hukum Induksi Faraday & Hukum Lenz:\n" +
                "   • Fluks Magnet: Φ_B = B · A · cos θ.\n" +
                "   • GGL Induksi: ε = - N (dΦ_B / dt). Tanda minus melambangkan Hukum Lenz: arus induksi menghasilkan medan magnet perlawanan yang menentang perubahan fluks mula-mula.\n" +
                "   • Induktansi Diri: ε = - L (dI / dt).\n\n" +
                "3. Rangkaian AC Seri RLC & Diagram Fasor:\n" +
                "   • Reaktansi Induktif: X_L = ω · L.\n" +
                "   • Reaktansi Kapasitif: X_C = 1 / (ω · C).\n" +
                "   • Impedansi Total: Z = √[R² + (X_L - X_C)²].\n" +
                "   • Resonansi AC: Terjadi saat X_L = X_C => ω_res = 1 / √(L·C) => Z_min = R (arus I_maks).",
        intuitionPoints = listOf(
            "Definisi resmi 1 Ampere dalam fisika klasik diturunkan dari gaya magnetik antar dua kawat sejajar berarus berjarak 1 meter yang menghasilkan gaya 2 × 10⁻⁷ N/m.",
            "Pengereman Magnetik (Eddy Current Brake): Kereta cepat Whoosh menggunakan induksi arus Eddy pada piringan logam untuk pengereman mulus tanpa gesekan aus.",
            "Faktor Daya (cos φ = R / Z): Mengukur efisiensi pemanfaatan daya nyata pada sirkuit AC industri."
        ),
        simId = "sim-electrodynamics",
        formulas = listOf(
            FormulaCard(
                symbol = "B (\\text{Kawat Lurus})",
                equation = "B = \\frac{\\mu_0 \\cdot I}{2\\pi \\cdot a}",
                meaning = "Kuat medan magnet pada jarak a dari kawat lurus panjang berarus I.",
                units = "Tesla (T)",
                applicationNote = "μ₀ = 4π × 10⁻⁷ T·m/A (permeabilitas ruang hampa)."
            ),
            FormulaCard(
                symbol = "\\mathcal{E} (\\text{Faraday})",
                equation = "\\mathcal{E} = - N \\frac{d\\Phi_B}{dt} = - N \\frac{\\Delta (B \\cdot A \\cos\\theta)}{\\Delta t}",
                meaning = "Hukum induksi elektromagnetik Faraday-Lenz.",
                units = "Volt (V)",
                applicationNote = "GGL timbul jika ada perubahan B, perubahan luas loop A, atau perubahan orientasi sudut θ."
            ),
            FormulaCard(
                symbol = "f_{\\text{res}} (\\text{RLC})",
                equation = "f_{\\text{res}} = \\frac{1}{2\\pi\\sqrt{L \\cdot C}} \\quad , \\quad Z = \\sqrt{R^2 + (X_L - X_C)^2}",
                meaning = "Frekuensi resonansi sirkuit AC seri RLC dan impedansi total.",
                units = "Hz & Ohm (\\Omega)",
                applicationNote = "Saat resonansi, sifat rangkaian murni resistif (faktor daya cos φ = 1)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Rem Arus Eddy (Eddy Current Brake) Kereta Cepat Jakarta-Bandung KCIC Whoosh",
            context = "Kereta cepat KCIC Whoosh CR400AF melaju pada kecepatan 350 km/jam di jalur pegunungan curam Padalarang.",
            engineeringProblem = "Kampas rem mekanis konvensional akan meleleh dan aus dalam hitungan detik jika dipaksa menyerap energi kinetik raksasa kereta seberat 450 ton pada kecepatan 350 km/jam.",
            physicalConceptUsed = "Hukum Induksi Faraday dan Hukum Lenz Arus Eddy (arus pusar Foucault).",
            mathematicalModel = "Elektromagnet berdaya tinggi diaktifkan di dekat rel baja. Pergerakan kereta melintasi medan magnet menginduksi arus pusar Eddy raksasa di dalam rel baja yang menghasilkan gaya Lorentz perlawanan terbalik F_hambat = σ · v · B² · V yang memperlambat laju kereta secara mulus tanpa kontak sentuh aus.",
            realWorldImpact = "Menghilangkan risiko rem blong akibat panas berlebih dan menghemat miliaran rupiah biaya penggantian kampas rem tahunan.",
            relatedCareers = listOf("Insinyur Sistem Pengereman Kereta Cepat", "Spesialis Elektromagnetika Daya", "Teknisi Pemeliharaan Sarana KCIC"),
            verifiedSource = "Buku Panduan Pemeliharaan Sarana Kereta Cepat CR400AF / KCIC Engineering Standards."
        ),
        homeLab = HomeLabData(
            title = "Memperlambat Jatuhnya Magnet Neodimium di Dalam Pipa Tembaga (Hukum Lenz)",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 batang pipa tembaga tebal atau pipa aluminium sepanjang 50-100 cm (bukan besi!)",
                "1 buah magnet neodimium kuat berbentuk silinder kecil yang pas masuk ke pipa",
                "1 kelereng kaca atau batu kecil berukuran sama dengan magnet sebagai pembanding",
                "Stopwatch di smartphone"
            ),
            steps = listOf(
                "Pegang pipa tembaga secara tegak lurus vertikal.",
                "Jatuhkan kelereng kaca menembus pipa dari ujung atas. Hitung waktu jatuh bebasnya (hanya butuh waktu sekitar 0,3 detik, jatuh sekejap!).",
                "Sekarang jatuhkan magnet neodimium silinder menembus lubang pipa tembaga yang sama.",
                "Lihat ke dalam pipa: MAGNET MELAYANG TURUN DENGAN SANGAT LAMBAT BAGAIKAN TERAPUNG DI DALAM MINYAK KENTAL (butuh waktu 4-5 detik untuk keluar di dasar pipa)!",
                "Ulangi dan amati bahwa tembaga sama sekali tidak menarik magnet saat diam, perlambatan HANYA terjadi saat magnet sedang bergerak!"
            ),
            observationGoal = "Membuktikan secara visual Hukum Lenz: gerakan magnet memicu arus pusar induksi pada dinding pipa tembaga, yang menghasilkan medan magnet tandingan menolak jatuh bebasnya magnet.",
            connectionToSimulation = "Bandingkan perlambatan magnet dengan simulator GGL induksi Faraday di Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mm-1",
                prompt = "Sebuah kumparan kawat memiliki 200 lilitan mengalami perubahan fluks magnetik dari 0,05 Weber menjadi 0,01 Weber dalam selang waktu 0,1 detik. Berapakah besar GGL induksi rata-rata yang timbul pada kumparan tersebut?",
                type = "numeric",
                correctAnswer = "80",
                tolerance = 1.0f,
                unit = "Volt",
                hints = listOf("Gunakan Hukum Faraday: ε = -N × (ΔΦ / Δt).", "ΔΦ = 0,01 - 0,05 = -0,04 Weber.", "ε = -200 × (-0,04 / 0,1) = 200 × 0,4."),
                explanation = "ε = -N · (ΔΦ / Δt) = -200 · (-0,04 Wb / 0,1 s) = 200 · 0,4 = 80 Volt.",
                misconception = "Lupa membagi dengan interval waktu Δt."
            ),
            QuizQuestion(
                id = "q-mm-2",
                prompt = "Rangkaian seri RLC memiliki R = 30 Ohm, reaktansi induktif XL = 80 Ohm, dan reaktansi kapasitif XC = 40 Ohm. Berapakah nilai impedansi total (Z) rangkaian tersebut?",
                type = "numeric",
                correctAnswer = "50",
                tolerance = 0.5f,
                unit = "Ohm",
                hints = listOf("Gunakan rumus impedansi: Z = √[R² + (XL - XC)²].", "XL - XC = 80 - 40 = 40 Ohm.", "Z = √(30² + 40²) = √(900 + 1.600) = √2.500."),
                explanation = "Z = √[R² + (XL - XC)²] = √[30² + (40)²] = √[900 + 1.600] = √2.500 = 50 Ohm.",
                misconception = "Menjumlahkan langsung ketiga komponen tanpa memperhitungkan selisih fasor reaktansi."
            )
        )
    )

    // =========================================================================
    // 14. FISIKA MODERN: RELATIVITAS, FOTOELEKTRIK & RADIOAKTIVITAS
    // =========================================================================
    private val fisikaModernLesson = LessonData(
        conceptId = "fis-fisika-modern",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pfm1",
                panelNumber = 1,
                title = "Koreksi Relativitas Satelit Navigasi GPS",
                caption = "Dimas menggunakan Google Maps di smartphone untuk mencari rute tercepat ke kawasan Kota Tua Jakarta.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Titik lokasiku akurat sampai beberapa meter! Apakah satelit GPS di angkasa juga menggunakan teori relativitas Albert Einstein?",
                sceneVisualEmoji = "🛰️",
                sceneDescription = "Konstelasi satelit GPS memancarkan sinyal gelombang mikro terkalibrasi waktu presisi ke permukaan bumi."
            ),
            StoryPanel(
                id = "pfm2",
                panelNumber = 2,
                title = "Waktu yang Melar: Dilatasi Waktu",
                caption = "Kakek menjelaskan konsekuensi postulat kecepatan cahaya Einstein.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Benar sekali, Dimas! Jam atom di satelit GPS bergerak sangat cepat (Relativitas Khusus: waktu melambat 7 mikrodetik/hari) dan berada di gravitasi lebih lemah (Relativitas Umum: waktu berjalan lebih cepat 45 mikrodetik/hari). Jika ilmuwan tidak mengoreksi efek relativitas sebesar +38 mikrodetik tiap hari, akurasi GPS akan meleset hingga 11 km setiap harinya!",
                sceneVisualEmoji = "⏳",
                sceneDescription = "Jam atomik relativistik berdetik pada kecepatan berbeda akibat gravitasi dan kecepatan laju orbit."
            ),
            StoryPanel(
                id = "pfm3",
                panelNumber = 3,
                title = "Efek Fotoelektrik & Dualisme Cahaya",
                caption = "Kirana mengamati panel surya silikon yang menghasilkan listrik dari sinar matahari.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Tahun 1905 Einstein menjelaskan Efek Fotoelektrik: cahaya bukan hanya gelombang, tetapi paket-paket energi terkuantisasi (foton) E = h·f! Jika satu foton memiliki energi melebihi fungsi kerja logam (W0), elektron seketika terpental keluar menghasilkan arus listrik!",
                sceneVisualEmoji = "💡",
                sceneDescription = "Foton cahaya menumbuk permukaan pelat logam melepaskan elektron foto berkecepatan kinetik tinggi."
            )
        ),
        intuitionTitle = "Keruntuhan Fisika Klasik: Relativitas & Fajar Era Kuantum",
        intuitionBody = "Di awal abad ke-20, fisika klasik Newton gagal menjelaskan fenomena pada kecepatan mendekati cahaya dan skala atomik:\n\n" +
                "1. Relativitas Khusus Einstein (1905):\n" +
                "   • Postulat I: Hukum fisika sama di semua kerangka acuan inersial.\n" +
                "   • Postulat II: Kecepatan cahaya di ruang hampa (c ≈ 3 × 10⁸ m/s) konstan bagi semua pengamat, tidak peduli gerak sumber atau pengamat!\n" +
                "   • Faktor Lorentz: γ = 1 / √(1 - v²/c²).\n" +
                "   • Dilatasi Waktu (Δt = γ Δt₀): Jam yang bergerak berdetik lebih lambat dibanding jam diam.\n" +
                "   • Kontraksi Panjang (L = L₀ / γ): Panjang benda memendek searah gerak.\n" +
                "   • Kesetaraan Massa-Energi: E = m c² = γ m₀ c².\n\n" +
                "2. Teori Foton & Efek Fotoelektrik:\n" +
                "   • Energi Foton Planck: E = h · f (dengan tetapan Planck h = 6,626 × 10⁻³⁴ J·s).\n" +
                "   • Persamaan Efek Fotoelektrik: Ek_maks = h f - W₀ = h f - h f₀ (W₀ adalah fungsi kerja logam).\n" +
                "   • Hipotesis de Broglie: Materi juga memiliki sifat gelombang dengan panjang gelombang λ = h / p = h / (m v).\n\n" +
                "3. Fisika Inti & Radioaktivitas:\n" +
                "   • Peluruhan radioaktif: N(t) = N₀ · (½)^(t / T_setengah).\n" +
                "   • Tiga radiasi nuklir: Partikel Alpha (α = inti He), Beta (β = elektron/positron), dan Gamma (γ = foton energi tinggi).",
        intuitionPoints = listOf(
            "Efek fotoelektrik membuktikan bahwa pelepasan elektron HANYA bergantung pada FREKUENSI cahaya (bukan intensitas/terangnya cahaya). Cahaya merah redup atau terang tak mampu melepas elektron jika frekuensinya di bawah ambang f₀.",
            "Panjang gelombang de Broglie menjelaskan mengapa elektron dalam mikroskop elektron mampu melihat virus berukuran nanometer yang tidak bisa dilihat mikroskop cahaya.",
            "Waktu Paruh (T_½) adalah waktu yang dibutuhkan oleh separuh dari jumlah inti radioaktif sampel untuk meluruh secara acak."
        ),
        simId = "sim-modern-physics",
        formulas = listOf(
            FormulaCard(
                symbol = "\\gamma & \\Delta t",
                equation = "\\gamma = \\frac{1}{\\sqrt{1 - v^2/c^2}} \\quad , \\quad \\Delta t = \\gamma \\cdot \\Delta t_0",
                meaning = "Faktor Lorentz dan persamaan dilatasi waktu relativitas khusus.",
                units = "γ tanpa satuan (γ \\ge 1), waktu dalam sekon",
                applicationNote = "Δt₀ adalah waktu sejati (proper time) yang diukur pengamat yang diam terhadap peristiwa."
            ),
            FormulaCard(
                symbol = "E_k (\\text{Fotoelektrik})",
                equation = "E_{k\\text{,maks}} = h f - W_0 = e \\cdot V_{\\text{henti}}",
                meaning = "Persamaan efek fotoelektrik Einstein peraih Nobel Fisika 1921.",
                units = "Joule (J) atau Elektron-Volt (eV)",
                applicationNote = "1 eV = 1,6 × 10⁻¹⁹ Joule. h = 6,626 × 10⁻³⁴ J·s."
            ),
            FormulaCard(
                symbol = "N(t) (\\text{Peluruhan})",
                equation = "N(t) = N_0 \\left(\\frac{1}{2}\\right)^{\\frac{t}{T_{1/2}}} = N_0 e^{-\\lambda t}",
                meaning = "Hukum peluruhan radioaktif dengan waktu paruh T_½.",
                units = "Jumlah inti atau laju cacah (Bq)",
                applicationNote = "Tetapan peluruhan λ = ln(2) / T_½ ≈ 0,693 / T_½."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Reaktor Nuklir Riset TRIGA Mark II BATAN / BRIN Bandung",
            context = "Reaktor riset pertama di Indonesia ini diresmikan Presiden Soekarno tahun 1965 di pusat kota Bandung untuk memproduksi radioisotop medis kedokteran nuklir.",
            engineeringProblem = "Bagaimana mendeteksi sel kanker ganas yang bermetastasis di dalam tulang pasien tanpa operasi bedah terbuka yang berbahaya?",
            physicalConceptUsed = "Produksi radioisotop medis Teknesium-99m (Tc-99m) yang meluruh memancarkan sinar gamma murni dengan waktu paruh T_½ = 6 jam.",
            mathematicalModel = "Hukum peluruhan radioaktif N(t) = N₀ (1/2)^(t/6 jam). Waktu paruh 6 jam cukup panjang untuk dipindai kamera gamma SPECT rumah sakit, namun cukup singkat untuk meluruh habis sehingga tidak meninggalkan radiasi berbahaya di tubuh pasien.",
            realWorldImpact = "Menyelamatkan nyawa puluhan ribu pasien kanker di berbagai rumah sakit rujukan nasional Indonesia setiap tahunnya.",
            relatedCareers = listOf("Fisikawan Medis Rumah Sakit", "Operator Reaktor Nuklir BRIN", "Radiografer Kedokteran Nuklir"),
            verifiedSource = "Pusat Riset Teknologi Reaktor Nuklir BRIN / Dokumentasi Reaktor TRIGA Mark II Bandung."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Peluruhan Waktu Paruh Radioaktif Menggunakan 50 Keping Koin",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "50 butir koin sejenis (atau 50 kancing baju dua warna)",
                "1 kotak sepatu atau wadah plastik bertutup",
                "Kertas dan pulpen untuk mencatat tabel peluruhan"
            ),
            steps = listOf(
                "Masukkan seluruh 50 koin ke dalam kotak kardus sepatu. Sisi angka mewakili 'inti aktif' (N0 = 50), sisi gambar mewakili 'inti yang telah meluruh'.",
                "Tutup kotak dan kocok kuat-kuat selama 5 detik (mensimulasikan selang waktu 1 waktu paruh T_½).",
                "Buka kotak, pisahkan dan KELUARKAN semua koin yang menunjukkan sisi gambar (sudah meluruh).",
                "Hitung jumlah koin yang masih menunjukkan sisi angka (inti aktif N1). Catat hasilnya.",
                "Masukkan kembali koin yang tersisa, kocok lagi untuk siklus waktu paruh ke-2, lalu pisahkan koin gambar lagi. Ulangi hingga 5 siklus.",
                "Buat grafik jumlah koin aktif terhadap siklus lemparan. Perhatikan kurva eksponensial khas peluruhan radioaktif!"
            ),
            observationGoal = "Memahami konsep probabilitas kuantum waktu paruh: meskipun peluruhan satu inti tunggal bersifat acak, populasi inti dalam jumlah banyak meluruh mengikuti fungsi eksponensial teratur (N = N0 · (1/2)^n).",
            connectionToSimulation = "Bandingkan grafik koinmu dengan kurva peluruhan radioaktif di simulator fisika modern Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-fm-1",
                prompt = "Sebuah pesawat antariksa bergerak dengan kecepatan v = 0,6 c relatif terhadap bumi. Jika astronot di dalam pesawat mengukur waktu makan siang berlangsung selama 20 menit (waktu sejati Δt0), berapa lama waktu makan tersebut menurut pengamat di bumi?",
                type = "numeric",
                correctAnswer = "25",
                tolerance = 0.5f,
                unit = "menit",
                hints = listOf("Hitung faktor Lorentz: γ = 1 / √(1 - (v/c)²).", "γ = 1 / √(1 - 0,6²) = 1 / √(1 - 0,36) = 1 / √(0,64) = 1 / 0,8 = 1,25.", "Δt = γ × Δt0 = 1,25 × 20 menit."),
                explanation = "γ = 1 / √(1 - 0,36) = 1 / 0,8 = 1,25. Waktu pengamat bumi Δt = γ · Δt0 = 1,25 · 20 menit = 25 menit. Terjadi dilatasi waktu (waktu melar bagi pengamat bumi).",
                misconception = "Mengalikan dengan 0,8 alih-alih membaginya sehingga salah menyimpulkan waktu menjadi lebih pendek (16 menit)."
            ),
            QuizQuestion(
                id = "q-fm-2",
                prompt = "Sampel zat radioaktif memiliki waktu paruh 4 hari. Jika mula-mula massa sampel tersebut adalah 80 gram, berapakah massa sampel yang tersisa setelah 12 hari?",
                type = "numeric",
                correctAnswer = "10",
                tolerance = 0.1f,
                unit = "gram",
                hints = listOf("Hitung berapa kali waktu paruh yang telah terlewati: n = t / T_setengah = 12 / 4 = 3 siklus.", "Gunakan rumus N = N0 × (1/2)^n.", "N = 80 × (1/2)³ = 80 × 1/8."),
                explanation = "n = 12 hari / 4 hari = 3 siklus waktu paruh. Massa tersisa N = 80 g · (1/2)³ = 80 · 1/8 = 10 gram.",
                misconception = "Membagi langsung massa dengan 3 siklus alih-alih membagi dua secara berulang 3 kali (80 -> 40 -> 20 -> 10)."
            )
        )
    )
}

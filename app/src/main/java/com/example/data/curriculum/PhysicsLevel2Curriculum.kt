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

object PhysicsLevel2Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "fis-gerak-lurus",
            domain = Domain.FISIKA,
            topic = "Kinematika",
            title = "Gerak Lurus (GLB & GLBB)",
            description = "Memahami hubungan kecepatan konstan, percepatan, waktu, dan jarak tempuh.",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("fis-besaran-satuan", "mat-pecahan-rasio")
        ),
        ConceptItem(
            id = "fis-gerak-parabola",
            domain = Domain.FISIKA,
            topic = "Kinematika 2D",
            title = "Gerak Parabola",
            description = "Kombinasi gerak lurus horizontal dan jatuh bebas gravitasi vertikal yang membentuk lintasan melengkung.",
            level = DepthLevel.L2,
            estMinutes = 18,
            prerequisites = listOf("fis-gerak-lurus", "mat-trigonometri-dasar")
        ),
        ConceptItem(
            id = "fis-usaha-energi-daya",
            domain = Domain.FISIKA,
            topic = "Energi Mekanik",
            title = "Usaha, Energi & Daya",
            description = "Konsep usaha W = F·s, energi kinetik, energi potensial gravitasi, hukum kekekalan energi mekanik, dan laju daya listrik/mekanik.",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("fis-gerak-lurus")
        ),
        ConceptItem(
            id = "fis-pesawat-sederhana",
            domain = Domain.FISIKA,
            topic = "Mekanika Terapan",
            title = "Pesawat Sederhana & Keuntungan Mekanis",
            description = "Meringankan kerja manusia dengan tuas (pengungkit jenis I, II, III), katrol tetap/bebas/majemuk, bidang miring, dan roda bergandar.",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("fis-usaha-energi-daya")
        ),
        ConceptItem(
            id = "fis-tekanan",
            domain = Domain.FISIKA,
            topic = "Fluida Statis Dasar",
            title = "Tekanan Zat Padat, Hidrostatis & Archimedes",
            description = "Tekanan P = F/A, tekanan hidrostatis zat cair, prinsip bejana berhubungan hukum Pascal, dan gaya apung Archimedes.",
            level = DepthLevel.L2,
            estMinutes = 17,
            prerequisites = listOf("fis-usaha-energi-daya")
        ),
        ConceptItem(
            id = "fis-getaran-gelombang-bunyi",
            domain = Domain.FISIKA,
            topic = "Gelombang & Akustik",
            title = "Getaran, Gelombang & Bunyi",
            description = "Osilasi pegas dan bandul, periode dan frekuensi, gelombang transversal/longitudinal, hubungan v = λ·f, resonansi, gaung dan gema.",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("fis-gerak-lurus")
        ),
        ConceptItem(
            id = "fis-optik-dasar",
            domain = Domain.FISIKA,
            topic = "Optika Geometri",
            title = "Cahaya, Cermin & Lensa",
            description = "Hukum pemantulan cermin datar/cekung/cembung, pembiasan Snellius, pembentukan bayangan pada lensa, dan prinsip alat optik kacamata/lup/mikroskop.",
            level = DepthLevel.L2,
            estMinutes = 17,
            prerequisites = listOf("fis-getaran-gelombang-bunyi")
        ),
        ConceptItem(
            id = "fis-listrik-ohm",
            domain = Domain.FISIKA,
            topic = "Kelistrikan Dinamis",
            title = "Arus Listrik, Hukum Ohm & Rangkaian",
            description = "Aliran muatan listrik, beda potensial, Hukum Ohm V = I·R, hambatan seri-paralel, dan Hukum I Kirchhoff titik percabangan.",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("fis-usaha-energi-daya")
        ),
        ConceptItem(
            id = "fis-kemagnetan-induksi",
            domain = Domain.FISIKA,
            topic = "Elektromagnetisme Dasar",
            title = "Kemagnetan & Induksi Elektromagnetik",
            description = "Medan magnet di sekitar arus listrik (Oersted), elektromagnet, gaya Lorentz dasar, induksi Faraday (GGL), dan prinsip transformator.",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("fis-listrik-ohm")
        ),
        ConceptItem(
            id = "fis-tata-surya",
            domain = Domain.FISIKA,
            topic = "Astronomi & Kebumian",
            title = "Sistem Tata Surya & Gerak Bumi-Bulan",
            description = "Karakteristik planet, rotasi dan revolusi bumi, perubahan musim, fase bulan, gerhana matahari/bulan, serta pasang surut air laut gravitasi.",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("fis-gerak-lurus")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "fis-gerak-lurus" -> linearMotionLesson
            "fis-gerak-parabola" -> parabolaLesson
            "fis-usaha-energi-daya" -> usahaEnergiLesson
            "fis-pesawat-sederhana" -> pesawatSederhanaLesson
            "fis-tekanan" -> tekananLesson
            "fis-getaran-gelombang-bunyi" -> getaranGelombangLesson
            "fis-optik-dasar" -> optikDasarLesson
            "fis-listrik-ohm" -> listrikOhmLesson
            "fis-kemagnetan-induksi" -> kemagnetanInduksiLesson
            "fis-tata-surya" -> tataSuryaLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. GERAK LURUS (GLB & GLBB)
    // =========================================================================
    private val linearMotionLesson = LessonData(
        conceptId = "fis-gerak-lurus",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pl1",
                panelNumber = 1,
                title = "Kereta Cepat Whoosh Meluncur",
                caption = "Keluarga Kirana hendak bepergian ke Bandung naik kereta cepat Whoosh dari stasiun Halim.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kereta ini melaju kencang sekali! Dari layar kabin kecepatannya stabil di 350 km/jam. Kapan kita sampai di Padalarang?",
                sceneVisualEmoji = "🚄",
                sceneDescription = "Kereta cepat Whoosh melaju mulus di atas rel beton berkecepatan tinggi."
            ),
            StoryPanel(
                id = "pl2",
                panelNumber = 2,
                title = "GLB: Kecepatan Tetap",
                caption = "Saat melaju di jalur terbuka, speedometer kereta menunjukkan angka konstan 350 km/jam tanpa getaran.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ketika kelajuan tetap konstan dan lintasannya lurus, kita menyebutnya Gerak Lurus Beraturan (GLB). Jarak tempuh cukup dihitung s = v · t, percepatannya nol!",
                sceneVisualEmoji = "⏱️",
                sceneDescription = "Grafik kecepatan terhadap waktu berupa garis mendatar datar yang stabil."
            ),
            StoryPanel(
                id = "pl3",
                panelNumber = 3,
                title = "GLBB: Percepatan dan Pengereman",
                caption = "Saat mendekati stasiun tujuan, Whoosh mulai mengerem secara bertahap dan teratur.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kecepatannya berkurang secara teratur dari 350 km/jam hingga berhenti total. Ini pasti GLBB diperlambat!",
                sceneVisualEmoji = "🛑",
                sceneDescription = "Kereta melambat mulus menuju peron stasiun akhir."
            )
        ),
        intuitionTitle = "GLB vs GLBB: Kapan Kecepatan Berubah?",
        intuitionBody = "Gerak lurus terbagi dua keluarga besar:\n\n" +
                "1. Gerak Lurus Beraturan (GLB): Kecepatan v konstan, percepatan a = 0. Jarak bertambah secara proporsional dengan waktu (s = v · t).\n\n" +
                "2. Gerak Lurus Berubah Beraturan (GLBB): Kecepatan bertambah (dipercepat) atau berkurang (diperlambat) secara teratur karena ada percepatan a konstan. Benda yang jatuh bebas di bumi adalah contoh GLBB alami akibat gravitasi g ≈ 9,8 m/s².",
        intuitionPoints = listOf(
            "Luas daerah di bawah kurva grafik kecepatan-waktu (v-t) selalu sama dengan Jarak Tempuh total benda!",
            "Kemiringan (gradien) dari grafik posisi-waktu (x-t) mewakili Kecepatan sesaat benda.",
            "Perlambatan sebenarnya adalah percepatan yang bernilai negatif (berlawanan arah gerak)."
        ),
        simId = "sim-linear-motion",
        formulas = listOf(
            FormulaCard(
                symbol = "s (GLB)",
                equation = "s = v \\cdot t",
                meaning = "Jarak tempuh pada gerak dengan kecepatan tetap.",
                units = "meter (m)",
                applicationNote = "Kecepatan v dalam m/s dan waktu t dalam sekon."
            ),
            FormulaCard(
                symbol = "v_t (GLBB)",
                equation = "v_t = v_0 + a \\cdot t",
                meaning = "Kecepatan akhir setelah mengalami percepatan konstan a selama waktu t.",
                units = "m/s",
                applicationNote = "Jika diperlambat hingga berhenti, v_t = 0 dan a bertanda minus."
            ),
            FormulaCard(
                symbol = "s (GLBB)",
                equation = "s = v_0 t + \\frac{1}{2} a t^2",
                meaning = "Jarak tempuh benda dengan kecepatan awal v₀ dan percepatan a.",
                units = "meter (m)",
                applicationNote = "Bila mulai dari keadaan diam (v₀ = 0), rumusnya menyederhanakan jadi s = ½ a t²."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Jarak Pengereman Kereta Cepat Jakarta-Bandung Whoosh",
            context = "Kereta cepat beroperasi pada kecepatan operasional 350 km/jam (≈ 97,2 m/s). Menjelang stasiun, sistem persinyalan otomatis (ATP) harus memulai pengereman teratur.",
            engineeringProblem = "Percepatan deselerasi maksimum yang nyaman bagi penumpang dibatasi tidak lebih dari -1,2 m/s² agar penumpang tidak terhempas ke depan.",
            physicalConceptUsed = "Hukum GLBB perlambatan konstan: v_t² = v₀² + 2 a s.",
            mathematicalModel = "Jarak pengereman aman s = (0 - v₀²) / (2 · a) = (97,2²) / (2 · 1,2) ≈ 3.936 meter (hampir 4 km sebelum stasiun!).",
            realWorldImpact = "Sistem otomatis ATP wajib memonitor sensor jalur dan mengunci sinyal darurat dari jarak minimal 4 km untuk mencegah tabrakan fatal.",
            relatedCareers = listOf("Insinyur Sistem Persinyalan Rel", "Masinis Kereta Cepat", "Spesialis Ergonomi Transportasi"),
            verifiedSource = "Buku Spesifikasi Teknis Kereta Cepat KCIC / Standar Keamanan Kereta Cepat CR400AF."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Percepatan Kelereng di Papan Luncur Kardus",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 kelereng atau mobil mainan roda lancar",
                "1 papan kardus panjang (± 1 meter) sebagai bidang miring",
                "Penggaris atau pita meteran",
                "Stopwatch di smartphone"
            ),
            steps = listOf(
                "Ganjal salah satu ujung kardus setinggi 10 cm dengan tumpukan buku.",
                "Tandai titik start di puncak dan titik finish di ujung bawah kardus (panjang s = 100 cm = 1 m).",
                "Lepas kelereng dari posisi diam (v₀ = 0) tanpa didorong, serentak dengan menekan tombol mulai stopwatch.",
                "Hentikan stopwatch tepat saat kelereng menyentuh garis finish. Ulangi 3 kali dan hitung rata-rata waktu t.",
                "Hitung percepatan: a = 2·s / t²."
            ),
            observationGoal = "Membuktikan bahwa benda yang meluncur di lereng mengalami percepatan konstan: waktu meluncur kuadratik terhadap jarak.",
            connectionToSimulation = "Bandingkan grafik percepatan kelerengmu dengan grafik percepatan pada simulator GLBB!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-lin-1",
                prompt = "Sebuah mobil mainan melaju dengan kecepatan konstan 4 m/s selama 5 detik. Berapakah jarak yang ditempuhnya?",
                type = "numeric",
                correctAnswer = "20",
                tolerance = 0.1f,
                unit = "meter",
                hints = listOf("Gunakan rumus jarak GLB: s = v × t.", "Kalikan 4 m/s dengan 5 detik."),
                explanation = "Pada GLB, s = v × t = 4 m/s × 5 s = 20 meter.",
                misconception = "Lupa bahwa kecepatan harus tetap konstan tanpa percepatan."
            ),
            QuizQuestion(
                id = "q-lin-2",
                prompt = "Benda diam dilepas dari ketinggian dan jatuh bebas tanpa kecepatan awal. Jika gravitasi bumi 10 m/s², berapa kecepatannya setelah jatuh 3 detik?",
                type = "numeric",
                correctAnswer = "30",
                tolerance = 0.1f,
                unit = "m/s",
                hints = listOf("Gunakan rumus GLBB: v_t = v₀ + a·t.", "Karena jatuh bebas dari diam, v₀ = 0 dan a = g = 10 m/s²."),
                explanation = "v_t = 0 + (10 m/s² × 3 s) = 30 m/s.",
                misconception = "Mengira kecepatan jatuh bebas selalu tetap konstan sejak awal dilepas."
            )
        )
    )

    // =========================================================================
    // 2. GERAK PARABOLA
    // =========================================================================
    private val parabolaLesson = LessonData(
        conceptId = "fis-gerak-parabola",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "p1",
                panelNumber = 1,
                title = "Di Lapangan Basket",
                caption = "Kirana berdiri di lapangan membawa bola basket baru. Kakek memperhatikan dari pinggir bangku taman.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kakek, kenapa tembakanku sering membentur bibir depan ring dan tidak melengkung masuk?",
                sceneVisualEmoji = "🏀",
                sceneDescription = "Kirana memegang bola basket menatap ring yang tingginya 3,05 meter."
            ),
            StoryPanel(
                id = "p2",
                panelNumber = 2,
                title = "Dua Gerak Sekaligus",
                caption = "Kakek menjelaskan rahasia lemparan bola melengkung di udara.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Bola yang melayang melakukan DUA gerak mandiri bersamaan: mendatar bergerak konstan (GLB) dan vertikal ditarik jatuh oleh gravitasi bumi (GLBB)!",
                sceneVisualEmoji = "✨",
                sceneDescription = "Diagram panah vektor kecepatan mendatar vx dan kecepatan vertikal vy."
            ),
            StoryPanel(
                id = "p3",
                panelNumber = 3,
                title = "Sudut Emas 45 Derajat",
                caption = "Kirana membidik dengan sudut elevasi 45 derajat dan mengayunkan tangan secara mulus.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Swish! Bolanya melengkung indah dan masuk tanpa menyentuh ring! Parabola berhasil!",
                sceneVisualEmoji = "🎯",
                sceneDescription = "Bola masuk bersih ke dalam keranjang basket membentuk busur kurva sempurna."
            )
        ),
        intuitionTitle = "Dua Dimensi yang Saling Bebas",
        intuitionBody = "Keajaiban gerak parabola adalah sumbu horizontal (X) dan sumbu vertikal (Y) tidak saling mengganggu:\n\n" +
                "1. Sumbu Mendatar (X): Tidak ada gaya yang mendorong atau menahan (abaikan angin), sehingga bola bergerak dengan Kecepatan Konstan (GLB: v_x = v₀ cos θ).\n\n" +
                "2. Sumbu Vertikal (Y): Bekerja gaya gravitasi bumi konstan g ke arah bawah. Bola melambat saat melambung naik, berhenti sesaat di titik puncak tertinggi, lalu dipercepat turun ke tanah (GLBB).",
        intuitionPoints = listOf(
            "Di titik puncak tertinggi, kecepatan vertikal (v_y) bernilai nol, tetapi kecepatan horizontal (v_x) tetap ada.",
            "Sudut elevasi 45° menghasilkan jarak lemparan horizontal terjauh pada permukaan tanah datar.",
            "Dua sudut berbeda yang bila dijumlahkan bernilai 90° (misal 30° dan 60°) akan mencapai jarak mendatar yang persis sama!"
        ),
        simId = "sim-projectile",
        formulas = listOf(
            FormulaCard(
                symbol = "v_x & v_{0y}",
                equation = "v_x = v_0 \\cos\\theta \\quad , \\quad v_{0y} = v_0 \\sin\\theta",
                meaning = "Penguraian vektor kecepatan awal ke arah mendatar dan tegak.",
                units = "m/s",
                applicationNote = "Sudut θ diukur terhadap garis horizontal."
            ),
            FormulaCard(
                symbol = "R",
                equation = "R = \\frac{v_0^2 \\sin(2\\theta)}{g}",
                meaning = "Jangkauan mendatar maksimum sampai bola kembali ke tanah.",
                units = "meter (m)",
                applicationNote = "Jangkauan terjauh terjadi saat sin(2θ) = 1, yaitu ketika θ = 45°."
            ),
            FormulaCard(
                symbol = "H_{max}",
                equation = "H_{max} = \\frac{v_0^2 \\sin^2\\theta}{2g}",
                meaning = "Ketinggian maksimum puncak lintasan parabola dari tanah.",
                units = "meter (m)",
                applicationNote = "Di titik puncak ini, vy = 0."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Nozzle Meriam Air Pemadam Kebakaran DKI Jakarta",
            context = "Armada mobil Bronto Skylift Damkar DKI Jakarta harus menyemprotkan air bertekanan tinggi untuk memadamkan kebakaran lantai atas ruko bertingkat.",
            engineeringProblem = "Petugas Damkar berada 30 meter dari gedung dan harus mengarahkan aliran air agar mencapai jendela setinggi 15 meter tanpa tersapu angin kencang.",
            physicalConceptUsed = "Semburan air berupa rentetan partikel fluida yang mengikuti kurva gerak parabola teratur dengan gravitasi g = 9,8 m/s².",
            mathematicalModel = "Operator nozzle menyesuaikan sudut elevasi θ dan tekanan pompa P agar kurva lintasan y(x) = x tan θ - (g x²) / (2 v₀² cos² θ) tepat menembus target sasaran.",
            realWorldImpact = "Akurasi sudut semprotan menghemat ribuan liter air tangki dan mempercepat pemadaman api sebelum struktur beton runtuh.",
            relatedCareers = listOf("Petugas Penyelamat Kebakaran", "Insinyur Hidrolika & Fluida", "Desainer Sistem Proteksi Gedung"),
            verifiedSource = "Buku Pedoman Teknis Pemadaman Api & Penyelamatan Dinas Gulkarmat DKI Jakarta."
        ),
        homeLab = HomeLabData(
            title = "Membuktikan Lintasan Parabola dengan Semprotan Selang Air Taman",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Selang air taman atau botol air mineral dengan tutup yang dilubangi kecil",
                "Meteran pita atau penggaris",
                "Halaman terbuka atau kamar mandi"
            ),
            steps = listOf(
                "Buka keran air sampai semprotan selang memancarkan air dengan kecepatan konstan.",
                "Arahkan moncong selang mendatar (0°). Amati bahwa air langsung menukik jatuh ke tanah membentuk setengah kurva.",
                "Ubah sudut semprotan ke atas perlahan (30°, 45°, 75°). Perhatikan bagaimana pancaran air membentuk kurva parabola simetris.",
                "Ukur jarak jatuh air di tanah. Amati pada sudut berapakah semprotan air jatuh paling jauh!"
            ),
            observationGoal = "Melihat secara langsung bentuk kurva lengkung parabola air akibat tarikan gravitasi bumi yang konstan ke bawah.",
            connectionToSimulation = "Bandingkan bentuk pancuran air dengan lintasan bola proyektil di simulator Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-par-1",
                prompt = "Pada sudut elevasi berapakah lemparan peluru di tanah datar akan mencapai jarak mendatar terjauh?",
                type = "multiple_choice",
                options = listOf("30 derajat", "45 derajat", "60 derajat", "90 derajat"),
                correctAnswer = "45 derajat",
                hints = listOf("Ingat rumus jarak R = (v₀² sin 2θ) / g.", "Nilai sin maksimum bernilai 1 saat sudutnya 90 derajat."),
                explanation = "Jangkauan terjauh terjadi saat sin(2θ) bernilai maksimum 1, yang tercapai ketika 2θ = 90° atau θ = 45°.",
                misconception = "Mengira sudut 90° paling jauh, padahal sudut 90° hanya membuat bola melambung tegak lurus ke atas lalu jatuh di tempat semula."
            ),
            QuizQuestion(
                id = "q-par-2",
                prompt = "Ketika proyektil mencapai titik tertingginya, pernyataan manakah yang BENAR?",
                type = "multiple_choice",
                options = listOf(
                    "Kecepatan vertikal vy bernilai 0, kecepatan horizontal vx tetap ada",
                    "Kecepatan total proyektil bernilai 0",
                    "Percepatan gravitasi bernilai 0",
                    "Kecepatan horizontal vx bernilai 0"
                ),
                correctAnswer = "Kecepatan vertikal vy bernilai 0, kecepatan horizontal vx tetap ada",
                hints = listOf("Benda berhenti naik sebelum mulai turun kembali.", "Apakah benda berhenti bergerak maju ke depan?"),
                explanation = "Di puncak ketinggian, benda berhenti naik sesaat sehingga vy = 0. Namun benda tetap meluncur ke depan karena vx konstan.",
                misconception = "Banyak yang mengira kecepatan total di puncak nol, padahal masih bergerak maju dengan laju vx."
            )
        )
    )

    // =========================================================================
    // 3. USAHA, ENERGI & DAYA
    // =========================================================================
    private val usahaEnergiLesson = LessonData(
        conceptId = "fis-usaha-energi-daya",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pue1",
                panelNumber = 1,
                title = "Menarik Timba di Sumur Tua",
                caption = "Dimas membantu Kakek menimba air dari sumur sedalam 8 meter di pekarangan rumah.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Fuih! Menarik ember berisi 10 liter air dari dasar sumur ke atas butuh tenaga besar, Kek!",
                sceneVisualEmoji = "🪣",
                sceneDescription = "Dimas menarik tali katrol sumur mengangkat ember air berkapasitas 10 liter."
            ),
            StoryPanel(
                id = "pue2",
                panelNumber = 2,
                title = "Usaha Fisika vs Usaha Bahasa",
                caption = "Kakek tersenyum sambil menjelaskan arti kata Usaha dalam sains fisika.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Dalam fisika, kamu baru melakukan Usaha (W) jika gaya tarikmu berhasil MEMINDAHKAN ember itu (W = F · s). Kalau kamu mendorong dinding beton sekuat tenaga tapi dinding tidak bergeser, usahamu nol!",
                sceneVisualEmoji = "💡",
                sceneDescription = "Ilustrasi gaya dorong dengan perpindahan vs gaya dorong tanpa perpindahan."
            ),
            StoryPanel(
                id = "pue3",
                panelNumber = 3,
                title = "Energi yang Berubah Wujud",
                caption = "Air yang sudah di bibir sumur kini memiliki energi potensial tinggi yang siap mengalir.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Benar! Usaha yang Dimas berikan tersimpan menjadi Energi Potensial di atas sumur. Bila ember itu jatuh, energinya berubah menjadi Energi Kinetik yang cepat!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Konversi energi dari potensial ketinggian menjadi kinetik kecepatan saat jatuh."
            )
        ),
        intuitionTitle = "Energi Tidak Pernah Hilang, Hanya Berganti Wajah",
        intuitionBody = "Hukum Kekekalan Energi menyatakan bahwa energi tidak dapat diciptakan atau dimusnahkan, melainkan hanya berpindah bentuk:\n\n" +
                "• Usaha (W = F · s): Pengalihan energi akibat gaya yang menyebabkan perpindahan searah gaya.\n" +
                "• Energi Kinetik (Ek = ½ m v²): Energi yang dimiliki setiap benda yang bergerak karena memiliki kelajuan v.\n" +
                "• Energi Potensial Gravitasi (Ep = m g h): Energi simpanan benda karena posisinya berada di ketinggian h.\n" +
                "• Daya (P = W / t): Kecepatan melakukan usaha atau laju konsumsi energi tiap detik, diukur dalam Watt (Joule/sekon).",
        intuitionPoints = listOf(
            "Jika gaya tegak lurus dengan arah gerak (sudut 90°), maka usaha gaya tersebut adalah NOL (contoh: gaya gravitasi bumi pada satelit orbit lingkaran).",
            "Pada lintasan tanpa gesekan (roller coaster), jumlah energi mekanik Em = Ek + Ep selalu konstan di setiap titik!",
            "1 Watt sama dengan usaha 1 Joule yang diselesaikan dalam waktu 1 sekon."
        ),
        simId = "sim-energy",
        formulas = listOf(
            FormulaCard(
                symbol = "W",
                equation = "W = F \\cdot s",
                meaning = "Usaha oleh gaya konstan F yang searah dengan perpindahan s.",
                units = "Joule (J = N·m)",
                applicationNote = "Jika gaya membentuk sudut θ terhadap perpindahan, W = F · s · cos θ."
            ),
            FormulaCard(
                symbol = "E_k",
                equation = "E_k = \\frac{1}{2} m v^2",
                meaning = "Energi kinetik gerak benda bermassa m dengan laju v.",
                units = "Joule (J)",
                applicationNote = "Jika kelajuan v dilipatgandakan menjadi 2 kali, energi kinetik melompat menjadi 4 kali lipat!"
            ),
            FormulaCard(
                symbol = "E_p",
                equation = "E_p = m \\cdot g \\cdot h",
                meaning = "Energi potensial gravitasi pada ketinggian h.",
                units = "Joule (J)",
                applicationNote = "Massa m dalam kg, g ≈ 9,8 atau 10 m/s², dan h dalam meter."
            ),
            FormulaCard(
                symbol = "P",
                equation = "P = \\frac{W}{t}",
                meaning = "Daya = usaha per satuan waktu.",
                units = "Watt (W = J/s)",
                applicationNote = "1 Daya Kuda (Horsepower / HP) setara dengan sekitar 746 Watt."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pembangkit Listrik Tenaga Air (PLTA) Cirata Jawa Barat",
            context = "PLTA Cirata memanfaatkan waduk waduk raksasa di Sungai Citarum untuk memasok listrik jaringan interkoneksi Jawa-Madura-Bali.",
            engineeringProblem = "Bagaimana mengubah energi gravitasi jutaan ton air waduk yang tenang menjadi ribuan Megawatt listrik secara andal?",
            physicalConceptUsed = "Hukum Kekekalan Energi Mekanik: Energi potensial air waduk diubah menjadi energi kinetik semburan di pipa pesat (penstock), memutar turbin (energi mekanik), dan dikonversi alternator generator menjadi daya listrik P = η · ρ · Q · g · h.",
            mathematicalModel = "Dengan debit air Q = 100 m³/s dan ketinggian jatuh efektif h = 112 m, daya potensial air teoritis P = 1.000 × 100 × 9,8 × 112 ≈ 109,7 MW per unit turbin.",
            realWorldImpact = "Menyediakan listrik bersih terbarukan berkapasitas 1.008 MW yang stabil tanpa emisi gas buang batubara.",
            relatedCareers = listOf("Insinyur Pembangkit Listrik", "Teknisi Turbin Air", "Ahli Sumber Daya Air"),
            verifiedSource = "PT PLN Nusantara Power / Profil Teknis Operasional PLTA Cirata."
        ),
        homeLab = HomeLabData(
            title = "Menghitung Daya Otot Kaki Saat Menaiki Tangga Rumah",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Tangga rumah dengan minimal 10 anak tangga",
                "Timbangan berat badan (untuk mengukur massa tubuh)",
                "Penggaris atau meteran untuk mengukur tinggi satu anak tangga",
                "Stopwatch di smartphone"
            ),
            steps = listOf(
                "Timbang massa tubuhmu m (misal 50 kg). Gaya berat F = m × 9,8 N (misal 490 N).",
                "Ukur tinggi satu anak tangga (misal 18 cm = 0,18 m) dan kalikan jumlah anak tangga (10 tangga = h = 1,8 m).",
                "Hitung usaha menaiki tangga: W = F × h = 490 N × 1,8 m = 882 Joule.",
                "Nyalakan stopwatch dan naiki tangga dengan langkah santai. Catat waktu t (misal 4 detik).",
                "Hitung dayamu: P = W / t = 882 / 4 = 220,5 Watt!"
            ),
            observationGoal = "Memahami bahwa semakin cepat kamu menaiki tangga yang sama, usahanya tetap sama tetapi daya yang dikeluarkan semakin besar.",
            connectionToSimulation = "Bandingkan usahamu dengan daya motor listrik pada simulator energi."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ue-1",
                prompt = "Benda bermassa 2 kg berada di puncak meja setinggi 1,5 meter. Berapakah energi potensial gravitasi benda tersebut jika g = 10 m/s²?",
                type = "numeric",
                correctAnswer = "30",
                tolerance = 0.1f,
                unit = "Joule",
                hints = listOf("Gunakan rumus Ep = m × g × h.", "Kalikan 2 kg × 10 m/s² × 1,5 m."),
                explanation = "Ep = 2 kg × 10 m/s² × 1,5 m = 30 Joule.",
                misconception = "Lupa mengalikan dengan percepatan gravitasi bumi."
            ),
            QuizQuestion(
                id = "q-ue-2",
                prompt = "Seseorang mendorong mobil mogok dengan gaya 500 N, namun mobil sama sekali tidak bergerak sejengkal pun. Berapakah usaha yang dilakukan orang tersebut?",
                type = "numeric",
                correctAnswer = "0",
                tolerance = 0.01f,
                unit = "Joule",
                hints = listOf("Ingat definisi usaha dalam fisika: W = F × s.", "Berapa jarak perpindahan s jika mobil tidak bergerak?"),
                explanation = "Karena perpindahan s = 0 meter, maka W = 500 N × 0 m = 0 Joule. Meskipun tubuh mengeluarkan keringat, secara fisika tidak ada usaha mekanik yang terjadi.",
                misconception = "Mengira lelahnya otot manusia selalu berarti ada usaha secara fisis matematis."
            )
        )
    )

    // =========================================================================
    // 4. PESAWAT SEDERHANA
    // =========================================================================
    private val pesawatSederhanaLesson = LessonData(
        conceptId = "fis-pesawat-sederhana",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pps1",
                panelNumber = 1,
                title = "Batu Besar di Kebun Kakek",
                caption = "Sebuah bongkahan batu besar menghalangi saluran irigasi di kebun sayur Kakek.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Batu ini berat sekali, Kakek! Aku dorong sekuat tenaga tidak bergeming sedikit pun.",
                sceneVisualEmoji = "🪨",
                sceneDescription = "Bongkahan batu besar menyumbat parit kebun sayuran."
            ),
            StoryPanel(
                id = "pps2",
                panelNumber = 2,
                title = "Linggis Sebagai Pengungkit",
                caption = "Kakek mengambil sebatang linggis besi panjang dan sebutir batu kecil sebagai tumpuan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jangan gunakan tenaga buta, gunakan tuas pengungkit! Dengan meletakkan batu kecil dekat beban, lengan kuasa kita jadi jauh lebih panjang dari lengan beban. Batu seberat ini terangkat dengan satu tangan!",
                sceneVisualEmoji = "🪵",
                sceneDescription = "Kakek menyelipkan linggis di bawah batu dengan ganjalan batu kecil sebagai titik tumpu."
            ),
            StoryPanel(
                id = "pps3",
                panelNumber = 3,
                title = "Keuntungan Mekanis",
                caption = "Batu besar tergeser dengan mudah berkat pesawat sederhana pengungkit jenis I.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Hebat! Pesawat sederhana tidak mengurangi usaha total, tetapi melipatgandakan gaya kuasa kita sehingga terasa sangat ringan!",
                sceneVisualEmoji = "⚙️",
                sceneDescription = "Diagram tuas seimbang dengan beban, titik tumpu, dan gaya kuasa."
            )
        ),
        intuitionTitle = "Bekerja Cerdas dengan Keuntungan Mekanis",
        intuitionBody = "Pesawat sederhana adalah alat mekanis dasar yang membantu mempermudah pekerjaan manusia dengan cara melipatgandakan gaya kuasa atau mengubah arah gaya:\n\n" +
                "1. Tuas / Pengungkit: Memiliki titik tumpu (T), titik beban (B), dan titik kuasa (K). Hubungan seimbangnya: F_kuasa · l_kuasa = W_beban · l_beban.\n" +
                "   • Jenis I: Titik tumpu di tengah (gunting, linggis, jungkat-jungkit).\n" +
                "   • Jenis II: Beban di tengah (gerobak dorong roda satu, pemecah kemiri).\n" +
                "   • Jenis III: Kuasa di tengah (pinset, stapler, sapu, tangan memegang mangkok).\n\n" +
                "2. Bidang Miring: Menanjak pelan lebih hemat tenaga daripada mengangkat tegak lurus (KM = s / h).\n\n" +
                "3. Katrol: Katrol tetap (KM = 1, mengubah arah tarikan), katrol bebas (KM = 2), dan sistem katrol majemuk takal (KM = jumlah tali yang menopang beban).",
        intuitionPoints = listOf(
            "Pesawat sederhana TIDAK PERNAH mengurangi jumlah usaha total (W_masuk = W_keluar), melainkan memperpanjang jarak tempuh agar gaya yang dibutuhkan lebih kecil.",
            "Keuntungan Mekanis (KM = Beban / Kuasa): Angka yang menunjukkan berapa kali lipat gayamu digandakan.",
            "Jalan berkelok-kelok (kelok sembilan di Sumbar) adalah contoh nyata penerapan bidang miring raksasa di pegunungan."
        ),
        simId = "sim-simple-machines",
        formulas = listOf(
            FormulaCard(
                symbol = "KM (Tuas)",
                equation = "KM = \\frac{w}{F} = \\frac{l_k}{l_b}",
                meaning = "Keuntungan mekanis tuas = rasio lengan kuasa terhadap lengan beban.",
                units = "Tanpa satuan (rasio)",
                applicationNote = "Semakin panjang lengan kuasa l_k dibanding l_b, gaya kuasa F semakin kecil."
            ),
            FormulaCard(
                symbol = "KM (Bidang Miring)",
                equation = "KM = \\frac{s}{h}",
                meaning = "Keuntungan mekanis bidang miring = panjang lintasan miring s dibagi tinggi tanjakan h.",
                units = "Tanpa satuan",
                applicationNote = "F = w · (h / s). Lereng landai membutuhkan gaya dorong lebih kecil."
            ),
            FormulaCard(
                symbol = "KM (Katrol Bebas)",
                equation = "KM = 2 \\implies F = \\frac{1}{2} w",
                meaning = "Katrol bergerak menggandakan keuntungan mekanis menjadi 2 kali.",
                units = "Tanpa satuan",
                applicationNote = "Beban 100 N cukup diangkat dengan gaya 50 N."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Jalan Berkelok Kelok Sembilan Sumatera Barat",
            context = "Jalan lintas Sumatera yang menghubungkan Payakumbuh dan Pekanbaru melintasi perbukitan Bukit Barisan dengan perbedaan elevasi terjal.",
            engineeringProblem = "Truk tronton bermuatan kelapa sawit seberat puluhan ton tidak memiliki torsi mesin yang cukup untuk mendaki tanjakan curam jika jalan dibuat lurus tegak ke atas bukit.",
            physicalConceptUsed = "Prinsip bidang miring: Dengan memperpanjang jarak lintasan s melalui jembatan layang berkelok sembilan, gaya dorong mesin yang dibutuhkan F = w · (h / s) mengecil secara drastis.",
            mathematicalModel = "Bila beda tinggi bukit h = 60 meter dan jalan dibuat lurus sejauh s = 100 m, kemiringan 60% akan membakar kopling mesin. Dengan kelok sembilan sepanjang s = 1.500 m, kemiringan turun menjadi 4% yang aman dilewati truk.",
            realWorldImpact = "Mencegah kecelakaan truk meluncur mundur dan memperlancar urat nadi logistik ekonomi Sumatera.",
            relatedCareers = listOf("Insinyur Geoteknik Jalan Tol", "Perancang Jembatan Bina Marga", "Ahli Logistik Transportasi Berat"),
            verifiedSource = "Kementerian PUPR Ditjen Bina Marga / Dokumentasi Mega Proyek Kelok Sembilan."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Membuka Tutup Kaleng Cat dengan Sendok",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 kaleng biskuit atau kaleng cat bekas bertutup rapat",
                "1 sendok makan logam tebal",
                "1 penggaris pendek sebagai pembanding"
            ),
            steps = listOf(
                "Coba buka tutup kaleng biskuit menggunakan kuku jari tanganmu langsung. Rasakan betapa sakit dan mustahilnya!",
                "Sekarang selipkan ujung sendok makan di sela bibir kaleng. Jadikan bibir kaleng sebagai titik tumpu (T).",
                "Pegang ujung gagang sendok dan tekan ke bawah. Perhatikan betapa ringannya tutup kaleng terbuka!",
                "Sekarang coba pegang sendok sangat dekat ke bibir kaleng (lengan kuasa pendek). Rasakan perbedaannya!"
            ),
            observationGoal = "Membuktikan bahwa tuas jenis I melipatgandakan gaya secara drastis saat lengan kuasa semakin panjang.",
            connectionToSimulation = "Bandingkan posisi titik tumpu sendok dengan simulator tuas pengungkit."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ps-1",
                prompt = "Sebuah batu seberat 600 N diangkat menggunakan tuas. Jika panjang lengan beban 0,5 meter dan panjang lengan kuasa 1,5 meter, berapakah gaya kuasa minimum yang diperlukan?",
                type = "numeric",
                correctAnswer = "200",
                tolerance = 1.0f,
                unit = "Newton",
                hints = listOf("Gunakan kesetimbangan tuas: F × l_k = w × l_b.", "F × 1,5 = 600 × 0,5.", "F = 300 / 1,5."),
                explanation = "F = (w × l_b) / l_k = (600 N × 0,5 m) / 1,5 m = 300 / 1,5 = 200 Newton.",
                misconception = "Tertukar antara lengan beban dan lengan kuasa dalam perhitungan."
            ),
            QuizQuestion(
                id = "q-ps-2",
                prompt = "Manakah dari alat-alat berikut yang termasuk ke dalam tuas golongan ketiga (kuasa berada di tengah)?",
                type = "multiple_choice",
                options = listOf("Pinset dan stapler", "Gunting dan jungkat-jungkit", "Gerobak dorong roda satu", "Linggis pembongkar kayu"),
                correctAnswer = "Pinset dan stapler",
                hints = listOf("Pada tuas jenis III, tanganmu menjepit di bagian tengah alat.", "Titik tumpu berada di ujung sendi belakang."),
                explanation = "Pinset dan stapler memiliki titik tumpu di engsel belakang, kuasa di tengah (ditekan jari), dan beban di ujung depan.",
                misconception = "Mengira gunting jenis III, padahal gunting adalah tuas jenis I (tumpu di tengah engsel)."
            )
        )
    )

    // =========================================================================
    // 5. TEKANAN ZAT PADAT, HIDROSTATIS & ARCHIMEDES
    // =========================================================================
    private val tekananLesson = LessonData(
        conceptId = "fis-tekanan",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pt1",
                panelNumber = 1,
                title = "Berjalan di Pematang Becek",
                caption = "Dimas memakai sepatu beralas sempit berhak kecil, sementara Kakek memakai sepatu bot sawah beralas lebar.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Aduh, Kakek! Sepatuku amblas sedalam mata kaki ke dalam lumpur sawah, kenapa sepatu bot Kakek tidak tenggelam?",
                sceneVisualEmoji = "🥾",
                sceneDescription = "Sepatu beralas sempit terperosok dalam ke lumpur, sedangkan bot lebar tetap di permukaan."
            ),
            StoryPanel(
                id = "pt2",
                panelNumber = 2,
                title = "Tekanan: Gaya Dibagi Luas",
                caption = "Kakek menunjuk telapak sol sepatunya yang lebar.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Berat badan kita sama-sama menekan tanah (F). Tapi karena alas bot kakek luas (A), tekanan ke tanah (P = F / A) jadi kecil! Semakin runcing atau sempit ujung benda, tekanannya melompat tinggi!",
                sceneVisualEmoji = "⚖️",
                sceneDescription = "Diagram distribusi berat pada luas penampang kecil vs luas penampang lebar."
            ),
            StoryPanel(
                id = "pt3",
                panelNumber = 3,
                title = "Kapal Baja yang Mengapung",
                caption = "Di dermaga penyeberangan Merak-Bakauheni, Kirana takjub melihat kapal feri baja raksasa bermuatan ratusan mobil tetap mengapung.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Baja tenggelam di air, tapi kenapa kapal feri mengapung? Karena lambung kapal berongga udara besar sehingga volume air yang dipindahkan sangat banyak, menghasilkan Gaya Apung Archimedes yang mengimbangi seluruh berat kapal!",
                sceneVisualEmoji = "🚢",
                sceneDescription = "Kapal feri penyeberangan mengapung megah di laut Selat Sunda."
            )
        ),
        intuitionTitle = "Dunia Fluida: Tekanan, Pascal & Archimedes",
        intuitionBody = "Zat padat menyalurkan tekanan ke arah gaya, sedangkan fluida (cair & gas) menekan ke segala arah sama besar:\n\n" +
                "1. Tekanan Padat (P = F / A): Semakin kecil luas permukaan A (misal mata jarum, pisau tajam), tekanan P semakin dahsyat menusuk.\n\n" +
                "2. Tekanan Hidrostatis (P_h = ρ · g · h): Semakin dalam kamu menyelam di bawah permukaan air laut (h makin besar), tekanan air pada gendang telingamu makin kuat karena menahan berat kolom air di atasnya.\n\n" +
                "3. Hukum Pascal: Tekanan yang diberikan pada fluida di ruang tertutup diteruskan ke segala arah tanpa berkurang (dasar rem hidrolik mobil dan dongkrak cuci mobil).\n\n" +
                "4. Hukum Archimedes: Benda yang dicelupkan ke dalam zat cair mengalami gaya apung ke atas sebesar berat zat cair yang dipindahkan (Fa = ρ_fluida · V_celup · g).",
        intuitionPoints = listOf(
            "Kondisi Apung, Melayang, Tenggelam: Benda mengapung jika massa jenis rata-rata benda < massa jenis zat cair; melayang jika sama; dan tenggelam jika lebih besar.",
            "Tekanan udara atmosfer di permukaan laut bernilai sekitar 1 atm (101.300 Pascal = 76 cmHg).",
            "Dongkrak hidrolik memungkinkan anak kecil mengangkat mobil seberat 2 ton hanya dengan menekan piston kecil!"
        ),
        simId = "sim-pressure",
        formulas = listOf(
            FormulaCard(
                symbol = "P",
                equation = "P = \\frac{F}{A}",
                meaning = "Tekanan = gaya tegak lurus dibagi luas bidang kontak.",
                units = "Pascal (Pa = N/m²)",
                applicationNote = "1 bar = 100.000 Pa. Jarum jahit memiliki luas A sangat mini sehingga tekanannya sangat besar."
            ),
            FormulaCard(
                symbol = "P_h",
                equation = "P_h = \\rho \\cdot g \\cdot h",
                meaning = "Tekanan hidrostatis zat cair pada kedalaman h dari permukaan.",
                units = "Pascal (Pa)",
                applicationNote = "ρ adalah massa jenis fluida (air tawar = 1.000 kg/m³, air laut ≈ 1.025 kg/m³)."
            ),
            FormulaCard(
                symbol = "Pascal",
                equation = "\\frac{F_1}{A_1} = \\frac{F_2}{A_2}",
                meaning = "Kesetaraan tekanan pada sistem hidrolik tertutup hukum Pascal.",
                units = "-",
                applicationNote = "F_2 = F_1 · (A_2 / A_1). Luas piston kedua yang 50x lebih besar melipatgandakan gaya 50x."
            ),
            FormulaCard(
                symbol = "F_a",
                equation = "F_a = \\rho_f \\cdot V_{bf} \\cdot g",
                meaning = "Gaya apung Archimedes ke atas = massa jenis fluida × volume benda tercelup × g.",
                units = "Newton (N)",
                applicationNote = "Jika Fa = w_benda, benda akan mengapung seimbang di permukaan."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Desain Dinding Bendungan Waduk Jatiluhur Jawa Barat",
            context = "Waduk Jatiluhur membendung Sungai Citarum dengan kapasitas tampung 3 miliar meter kubik air untuk irigasi dan pembangkit listrik.",
            engineeringProblem = "Mengapa dinding beton penahan bendungan selalu dibuat sangat tebal di bagian bawah dan semakin tipis di bagian atas?",
            physicalConceptUsed = "Hukum Tekanan Hidrostatis Ph = ρ · g · h.",
            mathematicalModel = "Pada kedalaman h = 100 meter di dasar waduk, tekanan hidrostatis air mencapai Ph = 1.000 × 9,8 × 100 = 980.000 Pa (hampir 10 atmosfer!). Dinding dasar menerima beban gaya 10 kali lebih dahsyat dibanding dinding dekat permukaan air.",
            realWorldImpact = "Bentuk dinding trapesium menebal di bawah mencegah bendungan jebol yang dapat menenggelamkan ribuan hektar pemukiman hilir.",
            relatedCareers = listOf("Insinyur Sipil Bendungan & Waduk", "Teknisi Struktur Hidrolik", "Spesialis Geoteknik Air"),
            verifiedSource = "Buku Pedoman Perencanaan Bendungan Beton Ditjen Sumber Daya Air Kementerian PUPR."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Telur Mengapung dalam Larutan Air Garam Dapur",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 butir telur ayam mentah",
                "1 gelas bening berisi air keran biasa",
                "Garam dapur halus (5-6 sendok makan)",
                "Sendok pengaduk"
            ),
            steps = listOf(
                "Masukkan telur mentah ke dalam gelas air keran biasa. Amati: telur langsung TENGGELAM ke dasar gelas karena massa jenis telur > massa jenis air tawar.",
                "Keluarkan telur, masukkan 3 sendok makan garam ke dalam air lalu aduk hingga larut sempurna.",
                "Masukkan kembali telur. Amati apakah telur mulai MELAYANG di tengah air?",
                "Tambahkan 2 sendok makan garam lagi dan aduk. Sekarang telur MENGAPUNG sebagian di atas permukaan!",
                "Catat mengapa penambahan garam mengubah kondisi mengapung telur."
            ),
            observationGoal = "Membuktikan Hukum Archimedes: melarutkan garam meningkatkan massa jenis fluida (ρ_f), memperbesar gaya apung hingga mampu menopang berat telur.",
            connectionToSimulation = "Bandingkan massa jenis larutan garam dengan slider densitas fluida di simulator Archimedes."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-tek-1",
                prompt = "Berapakah tekanan hidrostatis yang dialami seorang penyelam pada kedalaman 10 meter di bawah danau air tawar (massa jenis air = 1.000 kg/m³, g = 10 m/s²)?",
                type = "numeric",
                correctAnswer = "100000",
                tolerance = 100.0f,
                unit = "Pascal",
                hints = listOf("Gunakan rumus Ph = ρ × g × h.", "Kalikan 1.000 × 10 × 10."),
                explanation = "Ph = ρ × g × h = 1.000 kg/m³ × 10 m/s² × 10 m = 100.000 Pascal (atau 100 kPa / ≈ 1 atm).",
                misconception = "Lupa bahwa kedalaman h diukur dari permukaan air ke bawah, bukan dari dasar ke atas."
            ),
            QuizQuestion(
                id = "q-tek-2",
                prompt = "Sebuah dongkrak hidrolik memiliki penampang kecil A1 = 2 cm² dan penampang besar A2 = 100 cm². Jika penampang kecil ditekan dengan gaya 50 N, berapakah gaya angkat pada penampang besar?",
                type = "numeric",
                correctAnswer = "2500",
                tolerance = 5.0f,
                unit = "Newton",
                hints = listOf("Gunakan Hukum Pascal: F1 / A1 = F2 / A2.", "F2 = F1 × (A2 / A1).", "F2 = 50 × (100 / 2)."),
                explanation = "F2 = F1 × (A2 / A1) = 50 N × (100 cm² / 2 cm²) = 50 × 50 = 2.500 Newton.",
                misconception = "Membagi gaya dengan rasio luas alih-alih mengalikannya."
            )
        )
    )

    // =========================================================================
    // 6. GETARAN, GELOMBANG & BUNYI
    // =========================================================================
    private val getaranGelombangLesson = LessonData(
        conceptId = "fis-getaran-gelombang-bunyi",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pgg1",
                panelNumber = 1,
                title = "Petikan Senar Gitar Akustik",
                caption = "Dimas memetik senar gitar akustik nomor satu. Senar bergetar begitu cepat hingga terlihat kabur.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Petikan senar membuat udara di sekitar bergetar dan menghasilkan suara merdu di telinga kita!",
                sceneVisualEmoji = "🎸",
                sceneDescription = "Senar gitar bergetar bolak-balik menghasilkan gelombang tekanan bunyi di udara."
            ),
            StoryPanel(
                id = "pgg2",
                panelNumber = 2,
                title = "Gelombang Merambatkan Energi, Bukan Materi",
                caption = "Kakek melemparkan kerikil ke permukaan kolam ikan yang tenang. Daun kering yang terapung hanya bergoyang naik-turun di tempat.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Lihat daun itu, Kirana! Riak gelombang merambat menjauhi kerikil, tetapi daunnya tidak ikut terbawa ke pinggir kolam. Gelombang merambatkan ENERGI, bukan partikel airnya!",
                sceneVisualEmoji = "🌊",
                sceneDescription = "Riak lingkaran gelombang air kolam dengan daun kering terapung bergoyang naik turun."
            ),
            StoryPanel(
                id = "pgg3",
                panelNumber = 3,
                title = "Gaung dan Gema di Tebing Gua",
                caption = "Saat berteriak di depan tebing batu curam, suara Kirana terdengar memantul kembali setelah beberapa saat.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Halo... Halo! Suaraku memantul kembali dari tebing! Ini bukti bahwa gelombang bunyi dapat dipantulkan seperti cahaya.",
                sceneVisualEmoji = "⛰️",
                sceneDescription = "Pantulan gelombang bunyi dari dinding tebing batu kapur menghasilkan gema."
            )
        ),
        intuitionTitle = "Osilasi, Frekuensi & Gelombang yang Merambat",
        intuitionBody = "Getaran adalah gerak bolak-balik secara teratur melewati titik kesetimbangan:\n\n" +
                "• Periode (T): Waktu yang dibutuhkan untuk melakukan 1 kali getaran penuh (detik).\n" +
                "• Frekuensi (f = 1 / T): Banyaknya getaran yang terjadi dalam 1 detik, diukur dalam Hertz (Hz).\n\n" +
                "Gelombang adalah getaran yang merambat melalui medium:\n" +
                "1. Gelombang Transversal: Arah rambat tegak lurus arah getar, membentuk bukit dan lembah (contoh: gelombang tali, riak air, cahaya).\n" +
                "2. Gelombang Longitudinal: Arah rambat sejajar arah getar, membentuk rapatan dan renggangan (contoh: gelombang bunyi di udara, pegas slinki ditekan).\n" +
                "3. Hubungan Cepat Rambat: v = λ · f (panjang gelombang dikali frekuensi).",
        intuitionPoints = listOf(
            "Gelombang bunyi adalah gelombang mekanik: BUNYI TIDAK DAPAT MERAMBAT DI RUANG HAMPA UDARA (antariksa senyap tanpa suara!).",
            "Telinga manusia normal hanya mampu mendengar bunyi audiosonik dengan frekuensi antara 20 Hz hingga 20.000 Hz.",
            "Gema adalah bunyi pantul yang terdengar jelas SETELAH bunyi asli selesai (terjadi pada tebing jauh), sedangkan gaung terdengar hampir bersamaan sehingga suara menjadi kabur (pada ruangan tertutup)."
        ),
        simId = "sim-waves",
        formulas = listOf(
            FormulaCard(
                symbol = "f & T",
                equation = "f = \\frac{1}{T} \\quad , \\quad T = \\frac{1}{f}",
                meaning = "Hubungan timbal balik antara frekuensi f (Hz) dan periode T (sekon).",
                units = "Hertz (Hz = 1/s) & Sekon (s)",
                applicationNote = "Jika bandul bergetar 50 kali dalam 10 detik, frekuensinya f = 5 Hz dan T = 0,2 s."
            ),
            FormulaCard(
                symbol = "v",
                equation = "v = \\lambda \\cdot f = \\frac{\\lambda}{T}",
                meaning = "Cepat rambat gelombang = panjang gelombang λ dikali frekuensi f.",
                units = "m/s",
                applicationNote = "Panjang gelombang λ dalam meter (jarak 1 bukit + 1 lembah lengkap)."
            ),
            FormulaCard(
                symbol = "s (Gema)",
                equation = "s = \\frac{v \\cdot t}{2}",
                meaning = "Jarak dinding pemantul atau kedalaman laut dengan metode gema bunyi (SONAR).",
                units = "meter (m)",
                applicationNote = "Waktu t dibagi 2 karena bunyi harus menempuh perjalanan bolak-balik (pergi dan pulang)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "SONAR Echosounder Pemetaan Palung Laut KRI Rigel TNI-AL",
            context = "Kapal survei hidrografi KRI Rigel-933 milik TNI Angkatan Laut bertugas memetakan kontur kedalaman laut dan mencari objek karam di perairan Indonesia.",
            engineeringProblem = "Bagaimana mengukur kedalaman palung laut sedalam 3.000 meter di mana cahaya matahari tidak mampu menembus?",
            physicalConceptUsed = "Prinsip pemantulan gelombang bunyi ultrasonik di dalam air laut (v_air ≈ 1.500 m/s).",
            mathematicalModel = "Transduser kapal memancarkan pulsa ultrasonik ke dasar laut dan menerima pantulannya t = 4 detik kemudian. Kedalaman dasar laut dihitung s = (v · t) / 2 = (1.500 × 4) / 2 = 3.000 meter.",
            realWorldImpact = "Menghasilkan peta navigasi laut yang aman bagi kapal niaga dan menemukan lokasi kotak hitam (black box) pesawat yang jatuh di laut nusantara.",
            relatedCareers = listOf("Hidrografer Kelautan", "Operator Sonar Angkatan Laut", "Ahli Geofisika Kelautan"),
            verifiedSource = "Pusat Hidro-Oseanografi TNI Angkatan Laut (Pushidrosal) / Spesifikasi Teknis KRI Rigel-933."
        ),
        homeLab = HomeLabData(
            title = "Membuat Telepon Kaleng Benang Klasik",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "2 gelas plastik atau kaleng susu bekas bersih",
                "Benang kasur atau benang wol sepanjang 5-10 meter",
                "1 paku kecil atau tusuk gigi untuk melubangi dasar gelas",
                "Teman atau saudara untuk diajak berbicara"
            ),
            steps = listOf(
                "Lubangi bagian tengah bawah kedua gelas plastik dengan paku kecil.",
                "Masukkan ujung benang kasur ke dalam lubang dan ikat pada sepotong lidi atau tusuk gigi agar tidak terlepas.",
                "Pegang satu gelas dan minta temanmu memegang gelas lainnya. Mundurlah hingga benang kasur TERENTANG KENCANG TANPA KENDUR.",
                "Dekatkan gelas ke telinga temanmu saat kamu berbisik pelan ke dalam gelasmu. Pastikan benang tidak menyentuh baju atau benda lain.",
                "Rasakan getaran benang dengan jarimu secara lembut saat temanmu berbicara!"
            ),
            observationGoal = "Membuktikan bahwa bunyi merambat lebih efektif melalui medium padat (benang kencang) dibanding udara bebas.",
            connectionToSimulation = "Bandingkan rambatan getaran benang dengan gelombang longitudinal pada simulator gelombang."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ggb-1",
                prompt = "Sebuah gelombang air memiliki frekuensi 5 Hz dan panjang gelombang 0,4 meter. Berapakah cepat rambat gelombang tersebut?",
                type = "numeric",
                correctAnswer = "2",
                tolerance = 0.1f,
                unit = "m/s",
                hints = listOf("Gunakan rumus v = λ × f.", "Kalikan 0,4 meter dengan 5 Hz."),
                explanation = "v = λ × f = 0,4 m × 5 Hz = 2 m/s.",
                misconception = "Membagi frekuensi dengan panjang gelombang alih-alih mengalikannya."
            ),
            QuizQuestion(
                id = "q-ggb-2",
                prompt = "Mengapa astronot di luar angkasa tidak dapat berbicara langsung mendengar suara rekannya tanpa bantuan radio komunikasi?",
                type = "multiple_choice",
                options = listOf(
                    "Karena ruang angkasa hampa udara sehingga gelombang bunyi tidak memiliki medium merambat",
                    "Karena gravitasi di luar angkasa terlalu lemah untuk menarik suara",
                    "Karena suhu luar angkasa terlalu dingin membekukan bunyi",
                    "Karena frekuensi suara manusia berubah menjadi ultrasonik di angkasa"
                ),
                correctAnswer = "Karena ruang angkasa hampa udara sehingga gelombang bunyi tidak memiliki medium merambat",
                hints = listOf("Bunyi adalah gelombang mekanik yang memerlukan partikel zat untuk merambat.", "Apakah ada udara di ruang antariksa?"),
                explanation = "Bunyi membutuhkan medium materi (padat, cair, atau gas) untuk merambat. Di ruang hampa antariksa tidak ada partikel udara untuk menjalarkan getaran bunyi.",
                misconception = "Mengira gelombang bunyi bisa merambat menembus ruang hampa seperti cahaya."
            )
        )
    )

    // =========================================================================
    // 7. CAHAYA, PEMANTULAN, PEMBIASAN, LENSA & CERMIN
    // =========================================================================
    private val optikDasarLesson = LessonData(
        conceptId = "fis-optik-dasar",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pod1",
                panelNumber = 1,
                title = "Pensil Patah di Gelas Air",
                caption = "Kirana mencelupkan sedotan plastik ke dalam segelas es teh manis bening.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lihat, Dimas! Sedotan plastiknya tampak patah dan membesar di perbatasan air dan udara. Apakah sedotannya rusak?",
                sceneVisualEmoji = "🥤",
                sceneDescription = "Sedotan dalam gelas kaca berisi air terlihat patah dan bergeser di batas permukaan air."
            ),
            StoryPanel(
                id = "pod2",
                panelNumber = 2,
                title = "Pembiasan Cahaya Snellius",
                caption = "Kakek menjelaskan mengapa sedotan terlihat patah.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itu peristiwa PEMBIASAN (refraksi) cahaya! Laju cahaya melambat ketika berpindah dari medium udara yang renggang ke air yang lebih rapat, sehingga berkas cahaya berbelok arah!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Diagram sinar pembiasan membelok mendekati garis normal saat masuk ke air."
            ),
            StoryPanel(
                id = "pod3",
                panelNumber = 3,
                title = "Cermin Tikungan Jalan Raya",
                caption = "Di tikungan tajam jalan pegunungan, Dimas melihat cermin cembung bundar besar terpasang di tiang pinggir jalan.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Cermin cembung ini membuat mobil di balik tikungan terlihat kecil tapi area pandangannya luas sekali! Sangat berguna mencegah tabrakan.",
                sceneVisualEmoji = "🪞",
                sceneDescription = "Cermin cembung lalu lintas menampilkan pandangan lebar seluruh tikungan jalan raya."
            )
        ),
        intuitionTitle = "Matahari, Cermin, Lensa & Cahaya yang Menembus",
        intuitionBody = "Cahaya merambat lurus dengan laju fantastis 300.000 km/detik di ruang hampa. Ketika mengenai batas antar materi, cahaya mengalami dua perilaku utama:\n\n" +
                "1. Hukum Pemantulan (Refleksi):\n" +
                "   • Sudut datang sama dengan sudut pantul (θ_i = θ_r).\n" +
                "   • Cermin Datar: Bayangan maya, tegak, sama besar (jarak bayangan s' = -s).\n" +
                "   • Cermin Cekung: Mengumpulkan sinar (konvergen), fokus positif (f > 0).\n" +
                "   • Cermin Cembung: Menyebarkan sinar (divergen), fokus negatif (f < 0), bayangan SELALU maya, tegak, dan diperkecil (cocok untuk spion).\n\n" +
                "2. Hukum Pembiasan (Refraksi):\n" +
                "   • Sinar dari medium kurang rapat ke lebih rapat (udara ke kaca) dibiaskan MENDEKATI garis normal.\n" +
                "   • Rumus Dasar Lensa & Cermin: 1/f = 1/s + 1/s'.",
        intuitionPoints = listOf(
            "Bayangan Nyata dapat ditangkap pada layar (terbalik), sedangkan Bayangan Maya TIDAK DAPAT ditangkap layar dan selalu tegak.",
            "Lensa Cembung bersifat konvergen (mengumpulkan cahaya, fokus positif) dan digunakan pada kacamata penderita rabun dekat (hipermetropi) dan lup.",
            "Lensa Cekung bersifat divergen (menyebarkan cahaya, fokus negatif) dan digunakan untuk kacamata penderita rabun jauh (miopi)."
        ),
        simId = "sim-optics",
        formulas = listOf(
            FormulaCard(
                symbol = "1/f",
                equation = "\\frac{1}{f} = \\frac{1}{s} + \\frac{1}{s'}",
                meaning = "Rumus Gauss untuk cermin lengkung dan lensa tipis.",
                units = "cm atau m",
                applicationNote = "f = jarak fokus (f = R/2 untuk cermin). s = jarak benda, s' = jarak bayangan (tanda minus jika maya)."
            ),
            FormulaCard(
                symbol = "M",
                equation = "M = \\left| \\frac{s'}{s} \\right| = \\left| \\frac{h'}{h} \\right|",
                meaning = "Perbesaran bayangan = rasio jarak atau tinggi bayangan terhadap benda.",
                units = "Kali (rasio)",
                applicationNote = "Jika M > 1 bayangan diperbesar, jika M < 1 bayangan diperkecil."
            ),
            FormulaCard(
                symbol = "P (Lensa)",
                equation = "P = \\frac{100}{f \\text{ (cm)}}",
                meaning = "Kekuatan lensa kacamata.",
                units = "Dioptri (D)",
                applicationNote = "Lensa cembung bernilai positif (+), lensa cekung bernilai negatif (-)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kaca Spion Cembung Bus TransJakarta",
            context = "Bus gandeng TransJakarta memiliki panjang 18 meter dengan blind spot (titik buta) yang sangat rawan bagi pengendara motor di samping bus.",
            engineeringProblem = "Bagaimana pengemudi bus dapat memantau area samping dan belakang bus yang sangat panjang hanya dengan melirik satu cermin kaca spion samping?",
            physicalConceptUsed = "Sifat optis cermin cembung yang selalu menghasilkan bayangan maya, tegak, dan diperkecil dengan jangkauan sudut pandang (field of view) sangat lebar.",
            mathematicalModel = "Dengan jari-jari kelengkungan R = -120 cm (fokus f = -60 cm), benda di jarak s = 6 meter menghasilkan bayangan s' = -54,5 cm dengan perbesaran M = 0,09 (diperkecil 11 kali lipat) sehingga seluruh badan jalan muat dalam bingkai cermin.",
            realWorldImpact = "Mengurangi angka kecelakaan tabrak samping pengendara motor di jalur busway padat ibukota.",
            relatedCareers = listOf("Insinyur Sistem Optik Otomotif", "Spesialis Keselamatan Jalan Transportasi", "Optometris"),
            verifiedSource = "Standar Kelayakan Kendaraan Bermotor Dishub DKI Jakarta / Regulasi Spion UNECE R46."
        ),
        homeLab = HomeLabData(
            title = "Membakar Kertas Kering Menggunakan Kaca Pembesar (Lup)",
            safetyLevel = "Dengan Pengawasan Orang Tua",
            materials = listOf(
                "1 kaca pembesar (lup) lensa cembung",
                "1 helai daun kering atau kertas koran bekas",
                "Sinar matahari terik siang hari",
                "Tempat terbuka beralas tanah atau semen aman dari kebakaran"
            ),
            steps = listOf(
                "Bawa kaca pembesar dan daun kering ke halaman terbuka di bawah terik matahari.",
                "Pegang kaca pembesar menghadap matahari di atas daun kering.",
                "Naik-turunkan posisi kaca pembesar perlahan hingga berkas cahaya matahari terkonsentrasi menjadi satu TITIK BINTIK CAHAYA KECIL YANG SANGAT TERANG.",
                "Titik bintik kecil tersebut adalah titik fokus lensa (jarak dari lup ke daun = f). Tahan selama 15-30 detik.",
                "Amati asap kecil mulai keluar dari daun kering karena panas energi cahaya terfokus!"
            ),
            observationGoal = "Membuktikan bahwa lensa cembung bersifat mengumpulkan (konvergen) seluruh berkas sinar sejajar ke satu titik fokus tunggal.",
            connectionToSimulation = "Bandingkan titik fokus kaca pembesar dengan jalannya sinar di simulator optik Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-opt-1",
                prompt = "Benda diletakkan 15 cm di depan cermin cekung yang memiliki titik fokus 10 cm. Berapakah jarak bayangan (s') yang terbentuk?",
                type = "numeric",
                correctAnswer = "30",
                tolerance = 0.5f,
                unit = "cm",
                hints = listOf("Gunakan rumus 1/f = 1/s + 1/s'.", "1/10 = 1/15 + 1/s'.", "1/s' = 1/10 - 1/15 = (3 - 2)/30 = 1/30."),
                explanation = "1/s' = 1/10 - 1/15 = 3/30 - 2/30 = 1/30, sehingga s' = 30 cm. Karena s' bertanda positif, bayangannya nyata dan terbalik.",
                misconception = "Lupa menyamakan penyebut pecahan saat mengurangkan 1/10 dengan 1/15."
            ),
            QuizQuestion(
                id = "q-opt-2",
                prompt = "Sifat bayangan yang SELALU dihasilkan oleh cermin cembung dan cermin spion kendaraan adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Maya, tegak, diperkecil",
                    "Nyata, terbalik, diperbesar",
                    "Nyata, tegak, sama besar",
                    "Maya, terbalik, diperkecil"
                ),
                correctAnswer = "Maya, tegak, diperkecil",
                hints = listOf("Cermin cembung membuat benda tampak lebih kecil agar bidang pandang luas.", "Bayangannya tidak terbalik (tetap tegak ke atas)."),
                explanation = "Cermin cembung selalu menghasilkan bayangan yang bersifat maya, tegak, dan diperkecil di mana pun posisi bendanya berada.",
                misconception = "Mengira bayangan cermin cembung bisa nyata dan terbalik seperti cermin cekung."
            )
        )
    )

    // =========================================================================
    // 8. LISTRIK STATIS & DINAMIS, RANGKAIAN, HUKUM OHM
    // =========================================================================
    private val listrikOhmLesson = LessonData(
        conceptId = "fis-listrik-ohm",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "plo1",
                panelNumber = 1,
                title = "Lampu Pohon Natal yang Padam",
                caption = "Dimas dan Kirana merangkai lampu hias LED di ruang tamu. Saat satu bohlam dicabut, seluruh lampu ikut padam total!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Lho, kok semuanya mati? Padahal bohlam yang rusak cuma satu!",
                sceneVisualEmoji = "💡",
                sceneDescription = "Untaian lampu hias padam seketika saat satu lampu di rangkaian seri dicabut."
            ),
            StoryPanel(
                id = "plo2",
                panelNumber = 2,
                title = "Rangkaian Seri vs Paralel",
                caption = "Kakek datang membawa multimeter digital dan menjelaskan jenis sambungan listrik.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Lampu hias itu dirangkai SERI: hanya ada satu jalur kabel tunggal. Kalau satu putus, arus listrik terhenti untuk semuanya! Di rumah kita, instalasi lampu dirangkai PARALEL: setiap lampu punya jalurnya sendiri sehingga lampu kamar tetap nyala walau lampu dapur dimatikan.",
                sceneVisualEmoji = "🔌",
                sceneDescription = "Diagram perbandingan percabangan kabel paralel versus jalur tunggal seri."
            ),
            StoryPanel(
                id = "plo3",
                panelNumber = 3,
                title = "Hukum Ohm: V = I × R",
                caption = "Kirana mengukur voltase baterai 9 Volt yang dihubungkan ke resistor pembatas arus.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Hukum Ohm menjelaskan semuanya: Semakin besar hambatan kabel (R), arus yang mengalir (I) semakin kecil pada beda potensial (V) yang sama!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Ilustrasi tegangan mendorong arus melewati hambatan pipa resistor."
            )
        ),
        intuitionTitle = "Aliran Muatan Listrik & Hukum Fondasi Ohm",
        intuitionBody = "Arus listrik adalah aliran muatan elektron negatif yang mengalir melalui konduktor akibat adanya beda potensial (tegangan):\n\n" +
                "• Kuat Arus Listrik (I = Q / t): Banyaknya muatan elektron yang melintas per detik (satuan Ampere).\n" +
                "• Tegangan / Beda Potensial (V): 'Tekanan listrik' yang mendorong elektron bergerak (satuan Volt).\n" +
                "• Hambatan Listrik (R): Derajat perlawanan material terhadap aliran arus (satuan Ohm, Ω).\n\n" +
                "Hukum Ohm menyatakan: V = I · R.\n\n" +
                "Karakteristik Rangkaian:\n" +
                "• Seri: Arus I sama di setiap hambatan (I_total = I₁ = I₂), hambatan total bertambah (R_tot = R₁ + R₂).\n" +
                "• Paralel: Tegangan V sama di setiap cabang (V_total = V₁ = V₂), arus terbagi menurut Hukum I Kirchhoff (I_masuk = I_keluar), hambatan total mengecil (1/R_tot = 1/R₁ + 1/R₂).",
        intuitionPoints = listOf(
            "Hukum I Kirchhoff: Jumlah kuat arus yang masuk ke suatu titik percabangan sama dengan jumlah kuat arus yang keluar (prinsip kekekalan muatan).",
            "Menghubungkan hambatan secara paralel menghasilkan hambatan gabungan yang LEBIH KECIL daripada nilai hambatan terkecilnya.",
            "Daya listrik P = V · I: Mengukur laju pemakaian energi listrik tiap detik dalam Watt."
        ),
        simId = "sim-circuits",
        formulas = listOf(
            FormulaCard(
                symbol = "V",
                equation = "V = I \\cdot R",
                meaning = "Hukum Ohm: Beda potensial = Kuat arus × Hambatan.",
                units = "Volt (V = A·Ω)",
                applicationNote = "I = V / R. Jika tegangan dilipat 2 pada resistor tetap, arus menjadi 2 kali lipat."
            ),
            FormulaCard(
                symbol = "R_{seri}",
                equation = "R_s = R_1 + R_2 + R_3",
                meaning = "Hambatan pengganti susunan seri.",
                units = "Ohm (\\Omega)",
                applicationNote = "Arus sama di setiap komponen: I_1 = I_2 = I_total."
            ),
            FormulaCard(
                symbol = "R_{paralel}",
                equation = "\\frac{1}{R_p} = \\frac{1}{R_1} + \\frac{1}{R_2}",
                meaning = "Hambatan pengganti susunan paralel.",
                units = "Ohm (\\Omega)",
                applicationNote = "Tegangan sama di setiap cabang: V_1 = V_2 = V_sumber."
            ),
            FormulaCard(
                symbol = "P (Listrik)",
                equation = "P = V \\cdot I = I^2 R = \\frac{V^2}{R}",
                meaning = "Daya listrik = laju energi listrik yang diubah menjadi panas/cahaya.",
                units = "Watt (W)",
                applicationNote = "Daya 1.000 Watt yang menyala selama 1 jam mengonsumsi energi 1 kWh."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Instalasi Sekring Miniatur MCB Listrik Rumah Tangga PLN",
            context = "Setiap rumah pelanggan PLN di Indonesia dilengkapi Miniature Circuit Breaker (MCB) pada kWh-meter dengan daya 900 VA, 1.300 VA, atau 2.200 VA.",
            engineeringProblem = "Jika terjadi korsleting (hubung singkat) di mana kabel fasa bersentuhan langsung dengan kabel netral tanpa hambatan (R ≈ 0), arus listrik akan melonjak tak terhingga dan membakar kabel instalasi rumah.",
            physicalConceptUsed = "Hukum Ohm I = V / R dan disipasi panas Joule Q = I² · R · t.",
            mathematicalModel = "Pada tegangan V = 220 Volt, jika hambatan kabel drop menjadi R = 0,05 Ohm, arus melonjak menjadi I = 220 / 0,05 = 4.400 Ampere! MCB bimetal mendeteksi lonjakan arus ini dan memutus saklar dalam hitungan milidetik.",
            realWorldImpact = "Melindungi jutaan rumah tinggal dari bencana kebakaran maut akibat korsleting arus listrik.",
            relatedCareers = listOf("Teknisi Instalasi Listrik Gedung", "Inspektur Keamanan Ketenagalistrikan PLN", "Insinyur Sistem Proteksi Daya"),
            verifiedSource = "Persyaratan Umum Instalasi Listrik (PUIL 2011) / Standar PLN Ketenagalistrikan."
        ),
        homeLab = HomeLabData(
            title = "Menguji Konduktor dan Isolator dengan Baterai & Lampu Senter",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 baterai AA atau 9V",
                "1 lampu senter kecil atau bohlam LED",
                "2 utas kabel kecil dengan ujung terkupas",
                "Benda uji: paku besi, sendok logam, penghapus karet, pensil kayu (ujung grafit), plastik sedotan, air garam"
            ),
            steps = listOf(
                "Sambungkan kutub negatif baterai ke salah satu kaki lampu dengan kabel.",
                "Sambungkan kabel lain ke kutub positif baterai, tetapi biarkan kedua ujung kabel penguji terpisah (saklar terbuka).",
                "Sentuhkan kedua ujung kabel terbuka ke benda uji (misal paku besi). Apakah lampu menyala terang? (Konduktor kuat).",
                "Sentuhkan ke penghapus karet atau sedotan plastik. Apakah lampu mati? (Isolator).",
                "Sentuhkan kedua kabel ke isi batang hitam grafit pensil. Amati lampu menyala redup karena grafit adalah semi-konduktor alami!"
            ),
            observationGoal = "Membuktikan perbedaan sifat hambatan jenis material: logam mengalirkan elektron bebas dengan mudah, sedangkan karet menahan elektron.",
            connectionToSimulation = "Bandingkan nilai resistansi material pada simulator sirkuit listrik."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-lo-1",
                prompt = "Sebuah lampu pijar memiliki hambatan 40 Ohm dihubungkan ke sumber tegangan baterai 12 Volt. Berapakah kuat arus listrik yang mengalir melalui lampu tersebut?",
                type = "numeric",
                correctAnswer = "0.3",
                tolerance = 0.05f,
                unit = "Ampere",
                hints = listOf("Gunakan Hukum Ohm: I = V / R.", "Bagi 12 Volt dengan 40 Ohm."),
                explanation = "I = V / R = 12 V / 40 Ω = 0,3 Ampere (atau 300 mA).",
                misconception = "Mengalikan tegangan dengan hambatan alih-alih membaginya."
            ),
            QuizQuestion(
                id = "q-lo-2",
                prompt = "Dua buah hambatan masing-masing bernilai R1 = 6 Ohm dan R2 = 3 Ohm dirangkai secara paralel. Berapakah hambatan pengganti total rangkaian tersebut?",
                type = "numeric",
                correctAnswer = "2",
                tolerance = 0.1f,
                unit = "Ohm",
                hints = listOf("Gunakan rumus paralel: 1/Rp = 1/R1 + 1/R2.", "1/Rp = 1/6 + 1/3 = 1/6 + 2/6 = 3/6.", "Maka Rp = 6 / 3."),
                explanation = "1/Rp = 1/6 + 1/3 = 3/6 = 1/2. Sehingga Rp = 2 Ohm. Perhatikan bahwa hambatan total paralel selalu lebih kecil dari hambatan cabang terkecil.",
                misconception = "Menjumlahkan langsung 6 + 3 = 9 Ohm (itu rumus rangkaian seri, bukan paralel)."
            )
        )
    )

    // =========================================================================
    // 9. KEMAGNETAN & INDUKSI ELEKTROMAGNETIK DASAR
    // =========================================================================
    private val kemagnetanInduksiLesson = LessonData(
        conceptId = "fis-kemagnetan-induksi",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pki1",
                panelNumber = 1,
                title = "Jarum Kompas yang Menyimpang",
                caption = "Kakek meletakkan sebuah kompas navigasi di atas meja kayu. Ketika kabel beraliran arus baterai didekatkan, jarum kompas berputar menyimpang!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Lho! Tidak ada magnet di dekatnya, hanya kabel baterai. Kenapa jarum kompas bisa berbelok ke samping?",
                sceneVisualEmoji = "🧭",
                sceneDescription = "Percobaan Hans Christian Oersted: jarum kompas menyimpang di dekat kawat berarus listrik."
            ),
            StoryPanel(
                id = "pki2",
                panelNumber = 2,
                title = "Kelahiran Elektromagnet",
                caption = "Kakek melilitkan kawat tembaga pada sebatang paku besi besar lalu menghubungkannya ke baterai.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Tahun 1820, fisikawan Oersted menemukan rahasia alam: arus listrik MENGHASILKAN medan magnet di sekelilingnya! Sekarang paku ini berubah menjadi magnet buatan (elektromagnet) yang bisa menarik puluhan klip kertas!",
                sceneVisualEmoji = "🧲",
                sceneDescription = "Paku besi terlilit kawat berarus mampu mengangkat klip kertas logam seperti magnet kuat."
            ),
            StoryPanel(
                id = "pki3",
                panelNumber = 3,
                title = "Induksi Faraday: Gerak Jadi Listrik",
                caption = "Kirana memutar engkol dinamo lampu sepeda ontel milik Kakek.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Sebaliknya, Michael Faraday membuktikan bahwa menggerakkan magnet di dalam kumparan kawat akan MEMICU aliran arus listrik (GGL Induksi). Inilah rahasia bagaimana dinamo sepeda dan generator raksasa PLN bekerja!",
                sceneVisualEmoji = "🚲",
                sceneDescription = "Dinamo sepeda ontel yang berputar menyalakan lampu depan sepeda."
            )
        ),
        intuitionTitle = "Dua Sisi Koin: Listrik Menghasilkan Magnet, Magnet Menghasilkan Listrik",
        intuitionBody = "Kelistrikan dan kemagnetan adalah dua wajah dari satu fenomena terpadu: Elektromagnetisme:\n\n" +
                "1. Arus Menghasilkan Magnet (Percobaan Oersted):\n" +
                "   • Kawat beraliran arus listrik dilingkari oleh medan magnet konsentris sesuai Kaidah Tangan Kanan.\n" +
                "   • Elektromagnet: Kumparan kawat (solenoida) yang diperkuat inti besi lunak, kekuatannya dapat diatur dengan memperbanyak lilitan atau memperbesar arus listrik.\n\n" +
                "2. Gaya Lorentz: Kawat beraliran arus di dalam medan magnet luar akan terdorong oleh gaya mekanik (prinsip motor listrik dan kipas angin).\n\n" +
                "3. Magnet Menghasilkan Listrik (Induksi Faraday):\n" +
                "   • Perubahan jumlah garis gaya magnet (fluks magnet) yang menembus kumparan menghasilkan Gaya Gerak Listrik (GGL Induksi).\n" +
                "   • Transformator (Trafo): Menaikkan (step-up) atau menurunkan (step-down) tegangan listrik bolak-balik (AC) berdasarkan perbandingan jumlah lilitan: Vp / Vs = Np / Ns.",
        intuitionPoints = listOf(
            "Elektromagnet memiliki keunggulan dibanding magnet permanen: sifat magnetnya bisa dinyalakan dan dimatikan kapan saja lewat saklar listrik!",
            "Kaidah Tangan Kanan Gaya Lorentz: Ibu jari = arah arus (I), empat jari telunjuk = arah medan magnet (B), telapak tangan = arah dorongan gaya Lorentz (F).",
            "Transformator HANYA dapat bekerja pada arus bolak-balik (AC) karena membutuhkan fluks magnet yang terus berubah-ubah secara periodik."
        ),
        simId = "sim-magnetism",
        formulas = listOf(
            FormulaCard(
                symbol = "F (Lorentz)",
                equation = "F = B \\cdot I \\cdot L \\cdot \\sin\\theta",
                meaning = "Gaya Lorentz pada kawat berarus I sepanjang L di dalam medan magnet B.",
                units = "Newton (N)",
                applicationNote = "Maksimum ketika kawat tegak lurus arah medan magnet (θ = 90°, sin 90° = 1)."
            ),
            FormulaCard(
                symbol = "\\text{Trafo}",
                equation = "\\frac{V_p}{V_s} = \\frac{N_p}{N_s} = \\frac{I_s}{I_p}",
                meaning = "Persamaan transformator ideal tanpa rugi daya (Daya primer = Daya sekunder).",
                units = "-",
                applicationNote = "Trafo step-up: Ns > Np (tegangan naik). Trafo step-down: Ns < Np (tegangan turun)."
            ),
            FormulaCard(
                symbol = "\\eta (\\text{Efisiensi})",
                equation = "\\eta = \\frac{P_s}{P_p} \\times 100\\%",
                meaning = "Efisiensi transformator nyata = perbandingan daya keluar sekunder terhadap daya masuk primer.",
                units = "Persen (%)",
                applicationNote = "Hilang energi pada trafo biasanya berubah menjadi panas disipasi pada inti besi (arus Eddy)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Transformator Distribusi Gardu Induk PLN Jawa-Bali",
            context = "Listrik dari PLTA/PLTU dibangkitkan pada tegangan 11 kV, lalu dinaikkan menjadi Saluran Udara Tegangan Ekstra Tinggi (SUTET) 500 kV untuk transmisi antarkota, sebelum diturunkan kembali ke 220 V di rumah.",
            engineeringProblem = "Mengapa listrik harus ditransmisikan pada tegangan super tinggi 500.000 Volt alih-alih langsung 220 Volt?",
            physicalConceptUsed = "Hukum Joule P_hilang = I² · R dan persamaan trafo P = V · I.",
            mathematicalModel = "Untuk menyalurkan daya 500 MW, jika ditransmisikan pada 220 V arusnya mencapai I = 2,27 juta Ampere yang akan melelehkan kabel seketika. Dengan trafo step-up dinaikkan ke 500 kV, arus menyusut drastis menjadi I = 1.000 Ampere sehingga rugi disipasi daya di kabel kawat (I²R) berkurang hingga jutaan kali lipat!",
            realWorldImpact = "Memungkinkan transmisi listrik ribuan kilometer melintasi pulau Jawa dengan efisiensi tinggi tanpa mati daya di jalan.",
            relatedCareers = listOf("Insinyur Sistem Tenaga Listrik PLN", "Teknisi Pemeliharaan Gardu Induk", "Desainer Transformator Daya"),
            verifiedSource = "PT PLN (Persero) / Panduan Transmisi & Distribusi Tenaga Listrik Nasional."
        ),
        homeLab = HomeLabData(
            title = "Membuat Elektromagnet Paku Pengangkat Klip Kertas",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 paku besi besar (panjang 7-10 cm)",
                "Kawat tembaga berisolasi (email) sepanjang 1 meter",
                "1 baterai ukuran D atau AA baru (1,5V)",
                "Beberapa klip kertas logam kecil",
                "Amplop atau isolasi untuk menahan ujung kawat"
            ),
            steps = listOf(
                "Kupas lapisan isolasi di kedua ujung kawat tembaga sepanjang 2 cm dengan gunting atau ampelas.",
                "Lilitkan kawat tembaga mengitari paku besi secara rapat dan searah sebanyak 30-50 lilitan.",
                "Hubungkan kedua ujung kawat ke kutub positif dan negatif baterai.",
                "Dekatkan ujung paku ke tumpukan klip kertas. Amati paku berubah menjadi magnet kuat yang mengangkat klip kertas!",
                "Lepas salah satu kawat dari baterai. Perhatikan klip kertas langsung rontok jatuh karena medan magnet padam."
            ),
            observationGoal = "Membuktikan bahwa arus listrik menciptakan medan magnet dan elektromagnet dapat dimatikan seketika saat arus diputus.",
            connectionToSimulation = "Bandingkan jumlah lilitan kawat dengan kekuatan medan B di simulator elektromagnet."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ki-1",
                prompt = "Sebuah transformator step-down memiliki 1.000 lilitan pada kumparan primer dan 100 lilitan pada kumparan sekunder. Jika tegangan primer 220 Volt, berapakah tegangan sekunder yang dihasilkan?",
                type = "numeric",
                correctAnswer = "22",
                tolerance = 0.5f,
                unit = "Volt",
                hints = listOf("Gunakan rumus trafo: Vp / Vs = Np / Ns.", "Vs = Vp × (Ns / Np).", "Vs = 220 × (100 / 1.000)."),
                explanation = "Vs = Vp × (Ns / Np) = 220 V × (100 / 1.000) = 22 Volt. Karena Ns < Np, trafo ini menurunkan tegangan (step-down).",
                misconception = "Terbalik mengalikan rasio lilitan (mengira hasilnya naik menjadi 2.200 V)."
            ),
            QuizQuestion(
                id = "q-ki-2",
                prompt = "Alat manakah berikut ini yang bekerja berdasarkan prinsip GAYA LORENTZ mengubah energi listrik menjadi energi kinetik putar?",
                type = "multiple_choice",
                options = listOf("Motor listrik pada kipas angin", "Generator pembangkit listrik", "Transformator tiang listrik", "Setrika listrik pemanas"),
                correctAnswer = "Motor listrik pada kipas angin",
                hints = listOf("Alat ini berputar saat dialiri arus listrik.", "Gaya Lorentz mendorong kawat berarus di dalam medan magnet tetap."),
                explanation = "Motor listrik bekerja berdasarkan gaya Lorentz: kumparan kawat berarus yang diletakkan di dalam medan magnet akan mengalami torsi gaya putar.",
                misconception = "Tertukar antara motor listrik (listrik jadi gerak) dan generator (gerak jadi listrik)."
            )
        )
    )

    // =========================================================================
    // 10. SISTEM TATA SURYA & GERAK BUMI-BULAN
    // =========================================================================
    private val tataSuryaLesson = LessonData(
        conceptId = "fis-tata-surya",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pts1",
                panelNumber = 1,
                title = "Matahari Terbit di Selat Bali",
                caption = "Keluarga Kirana menyeberang naik kapal feri saat fajar menyingsing di atas Selat Bali.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Matahari tampak bergerak naik dari ufuk timur ke barat setiap hari. Apakah matahari yang mengitari bumi kita?",
                sceneVisualEmoji = "🌅",
                sceneDescription = "Matahari pagi terbit di cakrawala laut Selat Bali."
            ),
            StoryPanel(
                id = "pts2",
                panelNumber = 2,
                title = "Rotasi vs Revolusi Bumi",
                caption = "Kakek mengeluarkan sebuah bola bumi tiruan (globe) dan senter saku.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itu adalah gerak semu harian, Dimas! Bumi kita yang berputar pada porosnya dari barat ke timur (Rotasi 24 jam), menyebabkan pergantian siang dan malam. Sementara perjalanan bumi mengitari matahari selama 365¼ hari (Revolusi) bersama kemiringan poros 23,5° menghasilkan perubahan musim dan perbedaan panjang siang-malam!",
                sceneVisualEmoji = "🌍",
                sceneDescription = "Model globe bumi miring berputar disinari senter matahari."
            ),
            StoryPanel(
                id = "pts3",
                panelNumber = 3,
                title = "Gravitasi Bulan & Pasang Surut Laut",
                caption = "Di tepi pantai, perahu nelayan yang tadinya terapung kini terdampar di atas pasir saat air laut surut jauh ke tengah.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Air laut surut karena ditarik oleh gravitasi Bulan! Saat posisi Bulan dan Matahari sejajar di bulan purnama, gaya gravitasi bergabung menciptakan pasang surut purnama tertinggi.",
                sceneVisualEmoji = "🌊",
                sceneDescription = "Pantai saat air laut surut memperlihatkan hamparan terumbu karang dan pasir."
            )
        ),
        intuitionTitle = "Mekanika Kosmis: Tata Surya, Orbit Gravitasi & Fenomena Alam",
        intuitionBody = "Tata Surya kita berpusat pada Matahari (bintang berukuran sedang) yang mengikat 8 planet utama dengan gaya gravitasi raksasanya:\n\n" +
                "1. Anggota Tata Surya:\n" +
                "   • Planet Terestrial (Batuan): Merkurius, Venus, Bumi, Mars.\n" +
                "   • Planet Jovian (Raksasa Gas/Es): Yupiter, Saturnus, Uranus, Neptunus.\n" +
                "   • Sabuk Asteroid (antara Mars & Yupiter), Sabuk Kuiper, dan komet berekor es.\n\n" +
                "2. Fenomena Akibat Gerak Bumi & Bulan:\n" +
                "   • Rotasi Bumi (24 jam): Siang & malam, gerak semu harian benda langit, perbedaan zona waktu (WIB, WITA, WIT), pembelokan arah angin (gaya Coriolis).\n" +
                "   • Revolusi Bumi (365,25 hari) + Kemiringan 23,5°: Pergantian 4 musim di subtropis, gerak semu tahunan matahari, perubahan rasi bintang.\n" +
                "   • Gerhana Matahari: Terjadi saat posisi Matahari - BULAN - Bumi sejajar (siang hari tertutup bayang umbra bulan).\n" +
                "   • Gerhana Bulan: Terjadi saat Matahari - BUMI - Bulan sejajar pada fase bulan purnama (bulan masuk bayang umbra bumi).",
        intuitionPoints = listOf(
            "Pasang Purnama (Spring Tide) terjadi saat Bulan Baru dan Bulan Purnama ketika gravitasi Matahari dan Bulan saling memperkuat.",
            "Bulan tidak memiliki atmosfer sehingga langitnya selalu hitam pekat di siang hari dan suhu ekstrem bervariasi drastis (-170°C hingga +120°C).",
            "Massa gravitasi matahari mencapai 99,8% dari total seluruh massa tata surya kita!"
        ),
        simId = "sim-solar-system",
        formulas = listOf(
            FormulaCard(
                symbol = "F_{gravitasi}",
                equation = "F = G \\frac{M \\cdot m}{r^2}",
                meaning = "Hukum gravitasi universal Newton yang mengikat orbit seluruh planet mengitari matahari.",
                units = "Newton (N)",
                applicationNote = "Jika jarak planet dilipatgandakan menjadi 2r, gaya tarikan gravitasi menyusut menjadi 1/4 kali."
            ),
            FormulaCard(
                symbol = "T^2 / R^3",
                equation = "\\frac{T_1^2}{R_1^3} = \\frac{T_2^2}{R_2^3}",
                meaning = "Hukum III Kepler: Kuadrat periode orbit sebanding dengan pangkat tiga jarak rata-rata ke matahari.",
                units = "Tahun & AU",
                applicationNote = "Semakin jauh orbit sebuah planet dari matahari, semakin lambat laju orbitnya dan semakin panjang tahunnya."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Jadwal Pelayaran Kapal Nelayan Tradisional Bugis & Pasang Surut Air Laut",
            context = "Pelabuhan Paotere di Makassar melayani kapal pinisi tradisional yang keluar-masuk membawa hasil bumi antar-pulau di Nusantara.",
            engineeringProblem = "Kapal pinisi bertonase besar rawan kandas pada karang dangkal jika nakhoda salah memperkirakan jam pasang surut laut pelabuhan.",
            physicalConceptUsed = "Hukum gravitasi diferensial Bulan dan Matahari yang menyebabkan osilasi pasang surut air laut semi-diurnal (dua kali pasang dan dua kali surut tiap 24 jam 50 menit).",
            mathematicalModel = "Pusat Hidrografi TNI-AL memodelkan persamaan harmonik pasang surut h(t) = h₀ + Σ A_i cos(ω_i t - φ_i) untuk memprediksi ketinggian air laut dengan akurasi sentimeter hingga 1 tahun ke depan.",
            realWorldImpact = "Menghindarkan kapal pinisi dan kapal kargo modern dari bahaya kandas serta mengoptimalkan jadwal bongkar muat logistik dermaga.",
            relatedCareers = listOf("Oseanografer Fisik", "Nakhoda Kapal Pelayaran Samudera", "Perencana Pelabuhan Laut"),
            verifiedSource = "Tabel Pasang Surut Kepulauan Indonesia / Pushidrosal TNI Angkatan Laut."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Gerhana Matahari & Gerhana Bulan dengan Bola dan Senter",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 senter HP atau senter biasa (sebagai Matahari)",
                "1 buah jeruk atau bola kasti (sebagai Bumi)",
                "1 kelereng kecil atau bola bekel (sebagai Bulan)",
                "Ruangan kamar gelap tanpa lampu"
            ),
            steps = listOf(
                "Nyalakan senter di atas meja dalam ruangan gelap.",
                "Letakkan bola kasti (Bumi) di depan senter sejauh 50 cm. Amati separuh bola terang (siang) dan separuh bola gelap (malam).",
                "Gerakkan kelereng (Bulan) di antara senter dan bola kasti. Amati bayangan kelereng jatuh di permukaan bola kasti (Simulasi Gerhana Matahari!).",
                "Sekarang pindahkan kelereng ke belakang bola kasti, tepat di dalam kerucut bayangan gelap bumi. Kelereng menjadi gelap gulita (Simulasi Gerhana Bulan!)."
            ),
            observationGoal = "Memahami susunan geometris benda langit saat terjadi gerhana matahari dan gerhana bulan.",
            connectionToSimulation = "Bandingkan sudut pandang gerhana dengan simulator orbit 3D Tata Surya Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ts-1",
                prompt = "Peristiwa manakah yang disebabkan langsung oleh gerakan ROTASI bumi pada porosnya?",
                type = "multiple_choice",
                options = listOf(
                    "Terjadinya pergantian siang dan malam",
                    "Pergantian empat musim di benua Eropa",
                    "Perubahan penampakan rasi bintang sepanjang tahun",
                    "Perbedaan panjang waktu siang di kutub utara"
                ),
                correctAnswer = "Terjadinya pergantian siang dan malam",
                hints = listOf("Rotasi bumi berlangsung selama 24 jam sekali putaran.", "Pikirkan apa yang terjadi setiap 24 jam di tempat tinggalmu."),
                explanation = "Rotasi bumi pada porosnya selama 24 jam menyebabkan pergantian siang dan malam serta gerak semu harian matahari dari timur ke barat. Sedangkan pergantian musim disebabkan oleh revolusi bumi mengitari matahari.",
                misconception = "Tertukar antara akibat rotasi (24 jam) dan akibat revolusi (1 tahun)."
            ),
            QuizQuestion(
                id = "q-ts-2",
                prompt = "Pada fase bulan apakah gerhana matahari total HANYA dapat terjadi?",
                type = "multiple_choice",
                options = listOf(
                    "Fase Bulan Baru (Mati)",
                    "Fase Bulan Purnama",
                    "Fase Bulan Separuh (Kuartir Awal)",
                    "Fase Bulan Sabit Akhir"
                ),
                correctAnswer = "Fase Bulan Baru (Mati)",
                hints = listOf("Saat gerhana matahari, Bulan harus berada di antara Matahari dan Bumi.", "Pada posisi ini, sisi bulan yang menghadap bumi tidak terkena sinar matahari (gelap)."),
                explanation = "Gerhana matahari hanya dapat terjadi saat Bulan berada persis di antara Matahari dan Bumi, yaitu saat fase Bulan Baru (New Moon). Sebaliknya, gerhana bulan hanya terjadi saat fase Bulan Purnama.",
                misconception = "Mengira gerhana matahari terjadi saat bulan purnama."
            )
        )
    )
}

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

object ChemistryLevel3Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "kim-kuantum-atom",
            domain = Domain.KIMIA,
            topic = "Mekanika Kuantum Atom",
            title = "Model Atom Kuantum & Bilangan Kuantum",
            description = "Empat bilangan kuantum (n, l, m, s), bentuk orbital s/p/d/f, aturan Aufbau, larangan Pauli, aturan Hund, dan konfigurasi elektron gas mulia.",
            level = DepthLevel.L3,
            estMinutes = 20,
            prerequisites = listOf("kim-struktur-atom")
        ),
        ConceptItem(
            id = "kim-sifat-periodik",
            domain = Domain.KIMIA,
            topic = "Tren Periodisitas",
            title = "Sifat Periodik Unsur & Blok Orbital",
            description = "Tren periodisitas jari-jari atom/ion, energi ionisasi bertingkat, afinitas elektron, keelektronegatifan skala Pauling, dan sifat kelogaman blok s/p/d/f.",
            level = DepthLevel.L3,
            estMinutes = 19,
            prerequisites = listOf("kim-kuantum-atom", "kim-tabel-periodik")
        ),
        ConceptItem(
            id = "kim-ikatan-kimia",
            domain = Domain.KIMIA,
            topic = "Struktur Molekul 3D",
            title = "Ikatan Kimia, Bentuk VSEPR & Gaya Antarmolekul",
            description = "Struktur Lewis, muatan formal, geometri molekul 3D VSEPR, hibridisasi orbital sp/sp²/sp³, momen dipol polaritas, dan gaya antarmolekul Van der Waals / ikatan hidrogen.",
            level = DepthLevel.L3,
            estMinutes = 22,
            prerequisites = listOf("kim-sifat-periodik", "kim-ikatan-kimia-dasar")
        ),
        ConceptItem(
            id = "kim-stoikiometri",
            domain = Domain.KIMIA,
            topic = "Perhitungan Kimia Kuantitatif",
            title = "Stoikiometri, Konsep Mol & Pereaksi Pembatas",
            description = "Bilangan Avogadro, massa molar Mr, volume molar gas STP/RTP, konsentrasi M/m/X, pereaksi pembatas reaksi, persen hasil, dan rumus empiris/molekul.",
            level = DepthLevel.L3,
            estMinutes = 20,
            prerequisites = listOf("kim-rumus-persamaan-reaksi")
        ),
        ConceptItem(
            id = "kim-hukum-dasar-kimia",
            domain = Domain.KIMIA,
            topic = "Fondasi Hukum Kimia",
            title = "Hukum-Hukum Dasar Kimia & Gas",
            description = "Hukum Lavoisier (kekekalan massa), Hukum Proust (perbandingan tetap), Hukum Dalton (kelipatan berganda), Hukum Gay-Lussac (volume gas), dan Hipotesis Avogadro.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("kim-stoikiometri")
        ),
        ConceptItem(
            id = "kim-termokimia",
            domain = Domain.KIMIA,
            topic = "Energi Reaksi Kimia",
            title = "Termokimia, Entalpi & Hukum Hess",
            description = "Sistem dan lingkungan, reaksi eksoterm (ΔH < 0) vs endoterm (ΔH > 0), kalorimetri q = mcΔT, Hukum Hess siklus penjumlahan kalor, entalpi pembentukan standar ΔHf°, dan energi ikatan.",
            level = DepthLevel.L3,
            estMinutes = 21,
            prerequisites = listOf("kim-stoikiometri", "fis-suhu-kalor")
        ),
        ConceptItem(
            id = "kim-laju-reaksi",
            domain = Domain.KIMIA,
            topic = "Kinetika Kimia",
            title = "Laju Reaksi & Teori Tumbukan",
            description = "Teori tumbukan efektif dan energi aktivasi Ea, faktor penentu laju (konsentrasi, luas permukaan, suhu, katalis), penentuan orde reaksi eksperimental, dan persamaan laju.",
            level = DepthLevel.L3,
            estMinutes = 20,
            prerequisites = listOf("kim-stoikiometri")
        ),
        ConceptItem(
            id = "kim-kesetimbangan",
            domain = Domain.KIMIA,
            topic = "Kesetimbangan Dinamis",
            title = "Kesetimbangan Kimia & Azas Le Chatelier",
            description = "Reaksi reversibel dinamis, tetapan kesetimbangan Kc dan Kp, pergeseran kesetimbangan azas Le Chatelier (konsentrasi, volume, tekanan, suhu), dan sintesis industri amonia Haber-Bosch.",
            level = DepthLevel.L3,
            estMinutes = 21,
            prerequisites = listOf("kim-laju-reaksi", "kim-termokimia")
        ),
        ConceptItem(
            id = "kim-asam-basa-lanjut",
            domain = Domain.KIMIA,
            topic = "Kesetimbangan Larutan Asam-Basa",
            title = "Teori Asam-Basa, Buffer & Hidrolisis Garam",
            description = "Teori Arrhenius, Brønsted-Lowry, dan Lewis, tetapan ionisasi Ka/Kb, larutan penyangga buffer darah Henderson-Hasselbalch, hidrolisis garam, dan kurva titrasi asam-basa.",
            level = DepthLevel.L3,
            estMinutes = 22,
            prerequisites = listOf("kim-asam-basa", "kim-kesetimbangan")
        ),
        ConceptItem(
            id = "kim-kelarutan-ksp",
            domain = Domain.KIMIA,
            topic = "Kesetimbangan Kelarutan",
            title = "Kelarutan & Hasil Kali Kelarutan (Ksp)",
            description = "Tetapan hasil kali kelarutan Ksp, kelarutan molar s, pengaruh ion sejenis (common ion effect), pengaruh pH larutan, dan prediksi pengendapan selektif (Qsp vs Ksp).",
            level = DepthLevel.L3,
            estMinutes = 19,
            prerequisites = listOf("kim-kesetimbangan", "kim-asam-basa-lanjut")
        ),
        ConceptItem(
            id = "kim-koligatif",
            domain = Domain.KIMIA,
            topic = "Larutan Sejati",
            title = "Sifat Koligatif Larutan & Hukum Raoult",
            description = "Penurunan tekanan uap jenuh (Hukum Raoult), kenaikan titik didih ΔTb, penurunan titik beku ΔTf, tekanan osmotik larutan Π, dan faktor van 't Hoff i elektrolit.",
            level = DepthLevel.L3,
            estMinutes = 20,
            prerequisites = listOf("kim-stoikiometri", "fis-tekanan")
        ),
        ConceptItem(
            id = "kim-redoks-elektrokimia",
            domain = Domain.KIMIA,
            topic = "Elektrokimia Lanjut",
            title = "Redoks, Sel Volta & Sel Elektrolisis",
            description = "Penyetaraan reaksi redoks metode PBO dan ion-elektron, potensial sel standar E°sel dan deret Volta, sel baterai komersial, hukum Faraday elektrolisis w = eIt/96.500, dan elektroplating.",
            level = DepthLevel.L3,
            estMinutes = 22,
            prerequisites = listOf("kim-reaksi-kehidupan", "fis-listrik-ohm")
        ),
        ConceptItem(
            id = "kim-kimia-unsur",
            domain = Domain.KIMIA,
            topic = "Deskripsi Anorganik",
            title = "Kimia Unsur & Senyawa Kompleks Koordinasi",
            description = "Karakteristik unsur halogen, gas mulia, logam alkali/alkali tanah, sifat magnetik dan aneka warna kation unsur transisi periode 4, serta struktur ion kompleks ligan.",
            level = DepthLevel.L3,
            estMinutes = 21,
            prerequisites = listOf("kim-sifat-periodik", "kim-redoks-elektrokimia")
        ),
        ConceptItem(
            id = "kim-kimia-organik",
            domain = Domain.KIMIA,
            topic = "Kimia Karbon & Organik",
            title = "Hidrokarbon, Gugus Fungsi & Isomer",
            description = "Kekhasan atom karbon, tata nama IUPAC alkana/alkena/alkuna, gugus fungsi turunan (alkohol, eter, aldehida, keton, asam karboksilat, ester), isomer posisi/fungsi/optis, dan benzena.",
            level = DepthLevel.L3,
            estMinutes = 23,
            prerequisites = listOf("kim-ikatan-kimia")
        ),
        ConceptItem(
            id = "kim-biomolekul-polimer",
            domain = Domain.KIMIA,
            topic = "Biokimia & Polimer Sintetis",
            title = "Biomolekul (Karbohidrat, Protein, Lipid) & Polimer",
            description = "Polimerisasi adisi vs kondensasi (plastik PE, PVC, nilon), struktur dan uji karbohidrat (glukosa, amilum), asam amino ikatan peptida protein, dan reaksi saponifikasi lipid sabun.",
            level = DepthLevel.L3,
            estMinutes = 22,
            prerequisites = listOf("kim-kimia-organik")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "kim-kuantum-atom" -> kuantumAtomLesson
            "kim-sifat-periodik" -> sifatPeriodikLesson
            "kim-ikatan-kimia" -> ikatanKimiaLesson
            "kim-stoikiometri" -> stoikiometriLesson
            "kim-hukum-dasar-kimia" -> hukumDasarKimiaLesson
            "kim-termokimia" -> termokimiaLesson
            "kim-laju-reaksi" -> lajuReaksiLesson
            "kim-kesetimbangan" -> kesetimbanganLesson
            "kim-asam-basa-lanjut" -> asamBasaLanjutLesson
            "kim-kelarutan-ksp" -> kelarutanKspLesson
            "kim-koligatif" -> koligatifLesson
            "kim-redoks-elektrokimia" -> redoksElektrokimiaLesson
            "kim-kimia-unsur" -> kimiaUnsurLesson
            "kim-kimia-organik" -> kimiaOrganikLesson
            "kim-biomolekul-polimer" -> biomolekulPolimerLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. MODEL ATOM KUANTUM & BILANGAN KUANTUM
    // =========================================================================
    private val kuantumAtomLesson = LessonData(
        conceptId = "kim-kuantum-atom",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pka1",
                panelNumber = 1,
                title = "Awan Peluang Elektron",
                caption = "Kirana memandangi bilah kipas angin yang berputar sangat kencang di langit-langit ruang belajar.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Saat kipas berputar kencang, bilah-bilahnya tampak seperti kabut awan yang mengisi seluruh lingkaran! Kita tidak bisa menunjuk pasti di mana bilah kipas berada pada detik tertentu.",
                sceneVisualEmoji = "🌀",
                sceneDescription = "Bilah kipas angin berputar kencang membentuk kabut awan blur."
            ),
            StoryPanel(
                id = "pka2",
                panelNumber = 2,
                title = "Prinsip Ketidakpastian & Orbital",
                caption = "Kakek tersenyum dan membuka buku mekanika kuantum Erwin Schrödinger.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Persis seperti itulah elektron di dalam atom! Menurut Heisenberg dan Schrödinger, kita tidak bisa melacak lintasan pasti elektron layaknya planet. Kita hanya bisa memetakan ORBITAL: daerah ruang dengan peluang (probabilitas) terbesar menemukan elektron!",
                sceneVisualEmoji = "☁️",
                sceneDescription = "Awan kerapatan probabilitas elektron orbital bola s dan orbital balon terpilin p."
            ),
            StoryPanel(
                id = "pka3",
                panelNumber = 3,
                title = "Empat Alamat Rumah Elektron",
                caption = "Dimas menuliskan empat koordinat bilangan kuantum: n, l, m, dan s.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Setiap elektron di alam semesta memiliki 'alamat KTP kuantum' unik: nomor kulit utama (n), bentuk subkulit (l = s, p, d, f), orientasi magnetik (m), dan arah spin putaran elektron (s = +½ atau -½)! Tidak ada dua elektron yang boleh berpasangan dengan keempat bilangan kuantum sama!",
                sceneVisualEmoji = "🏷️",
                sceneDescription = "Diagram tingkat energi orbital Aufbau dengan anak panah spin elektron berlawanan arah."
            )
        ),
        intuitionTitle = "Arsitektur Kuantum: Orbital, Aturan Aufbau & Kestabilan Subkulit",
        intuitionBody = "Mekanika kuantum modern menggantikan orbit lingkaran kaku Bohr dengan orbital peluang probabilistik:\n\n" +
                "1. Empat Bilangan Kuantum:\n" +
                "   • Utama (n = 1, 2, 3...): Menentukan ukuran orbital dan tingkat energi kulit utama.\n" +
                "   • Azimut / Momentum Sudut (l = 0 sampai n-1): Menentukan bentuk orbital (l=0 adalah orbital s bola; l=1 adalah orbital p balon terpilin; l=2 adalah d; l=3 adalah f).\n" +
                "   • Magnetik (m = -l sampai +l): Menentukan orientasi spasial orbital dalam ruang 3D (orbital p punya 3 kotak: px, py, pz).\n" +
                "   • Spin (s = +½ atau -½): Menentukan arah putaran intrinsik elektron searah atau berlawanan jarum jam.\n\n" +
                "2. Tiga Kaidah Pengisian Elektron:\n" +
                "   • Prinsip Aufbau: Pengisian elektron dimulai dari tingkat energi terendah (1s → 2s → 2p → 3s → 3p → 4s → 3d...).\n" +
                "   • Larangan Pauli: Tidak boleh ada dua elektron dalam satu atom yang memiliki keempat bilangan kuantum yang sama (satu kotak orbital maksimal berisi 2 elektron ber-spin berlawanan).\n" +
                "   • Aturan Hund: Pada orbital berenergi sama (degenerat), elektron mengisi kotak sendiri-sendiri dengan spin sejajar terlebih dahulu sebelum berpasangan.",
        intuitionPoints = listOf(
            "Anomali konfigurasi elektron pada Kromium (²⁴Cr = [Ar] 4s¹ 3d⁵) dan Tembaga (²⁹Cu = [Ar] 4s¹ 3d¹⁰) terjadi karena susunan subkulit d setengah penuh (d⁵) dan penuh (d¹⁰) memiliki kestabilan simetri kuantum ekstra tinggi.",
            "Elektron valensi yang menentukan sifat reaksi kimia unsur adalah elektron-elektron yang berada di subkulit terluar (blok s, p, atau d terluar).",
            "Satu orbital tunggal hanya mampu menampung maksimal 2 buah elektron dengan arah spin berlawanan."
        ),
        simId = "sim-quantum-atom",
        formulas = listOf(
            FormulaCard(
                symbol = "n, l, m_l, m_s",
                equation = "n \\ge 1 \\quad , \\quad 0 \\le l \\le n-1 \\quad , \\quad -l \\le m_l \\le +l \\quad , \\quad m_s = \\pm \\frac{1}{2}",
                meaning = "Aturan matematis penetapan 4 bilangan kuantum elektron.",
                units = "-",
                applicationNote = "Elektron terakhir atom besi ²⁶Fe: n = 3, l = 2 (subkulit d), ml = -2, ms = -½."
            ),
            FormulaCard(
                symbol = "\\text{Kapasitas Subkulit}",
                equation = "s=2 \\quad , \\quad p=6 \\quad , \\quad d=10 \\quad , \\quad f=14",
                meaning = "Jumlah elektron maksimum yang dapat ditampung oleh masing-masing subkulit.",
                units = "elektron",
                applicationNote = "Dihitung dari 2 × (2l + 1) buah elektron."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Katalisator Oksidasi Logam Transisi Kompleks PT Chandra Asri Petrochemical Cilegon",
            context = "Pabrik petrokimia terintegrasi terbesar di Indonesia ini memproduksi jutaan ton etilena dan polietilena dari nafta minyak bumi.",
            engineeringProblem = "Polimerisasi gas etilena membutuhkan katalis Ziegler-Natta berbasis Titanium (Ti, Z=22) yang memiliki orbital d kosong untuk mengikat ikatan rangkap alkena secara stereospesifik.",
            physicalConceptUsed = "Konfigurasi elektron subkulit d tidak penuh pada unsur transisi [Ar] 4s² 3d² yang menyediakan orbital hibrida koordinasi penerima pasangan elektron.",
            mathematicalModel = "Insinyur katalis memodelkan interaksi medan ligan orbital Ti(IV) d⁰ yang berkoordinasi dengan alkil aluminium untuk menurunkan energi aktivasi reaksi polimerisasi dari 150 kJ/mol menjadi 45 kJ/mol.",
            realWorldImpact = "Menghasilkan resin plastik bermutu tinggi berdensitas tinggi (HDPE) untuk pipa air bersih dan kemasan pangan medis nasional.",
            relatedCareers = listOf("Ahli Kimia Katalisis Polimer", "Insinyur Proses Polietilena", "Spesialis Karakterisasi Material X-Ray"),
            verifiedSource = "PT Chandra Asri Petrochemical Tbk / Publikasi Teknologi Katalis Polimerisasi Polietilena."
        ),
        homeLab = HomeLabData(
            title = "Mengisi Kotak Orbital Elektron dengan Kelereng Dua Warna",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 lembar kertas karton digambar kotak-kotak diagram orbital: 1s (1 kotak), 2s (1 kotak), 2p (3 kotak berdampingan), 3s (1 kotak)",
                "Kancing baju atau kelereng dengan tanda panah atas (↑) dan panah bawah (↓)",
                "Unsur uji: Oksigen (Z = 8)"
            ),
            steps = listOf(
                "Untuk Oksigen (8 elektron): isi 2 elektron pertama di kotak 1s (1 panah atas ↑ dan 1 panah bawah ↓).",
                "Isi 2 elektron berikutnya di kotak 2s (↑ dan ↓) sesuai prinsip Aufbau.",
                "Tersisa 4 elektron untuk 3 kotak 2p: terapkan Aturan Hund! Masukkan 1 panah atas ↑ di kotak pertama, 1 panah atas ↑ di kotak kedua, dan 1 panah atas ↑ di kotak ketiga (jangan dipasangkan dulu!).",
                "Elektron ke-8 (terakhir) baru dipasangkan dengan panah bawah ↓ di kotak 2p pertama.",
                "Amati hasilnya: terdapat 2 elektron tunggal tanpa pasangan di subkulit 2p! Itulah mengapa molekul gas oksigen O₂ bersifat paramagnetik tertarik medan magnet!"
            ),
            observationGoal = "Mempraktikkan secara visual dan runut aturan Aufbau, larangan Pauli, dan aturan Hund dalam penulisan konfigurasi elektron.",
            connectionToSimulation = "Bandingkan diagram orbital kartonmu dengan simulator konfigurasi kuantum Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ka-1",
                prompt = "Konfigurasi elektron atom unsur Besi (nomor atom Z = 26) pada keadaan dasar adalah...",
                type = "multiple_choice",
                options = listOf(
                    "[Ar] 4s² 3d⁶",
                    "[Ar] 4s¹ 3d⁷",
                    "[Ar] 3d⁸",
                    "[Ar] 4s² 3d⁵ 4p¹"
                ),
                correctAnswer = "[Ar] 4s² 3d⁶",
                hints = listOf(
                    "Argon [Ar] memiliki nomor atom 18.",
                    "Sisa elektron = 26 - 18 = 8 elektron.",
                    "Subkulit 4s diisi penuh 2 elektron terlebih dahulu sebelum subkulit 3d diisi 6 elektron."
                ),
                explanation = "Konfigurasi elektron ²⁶Fe adalah 1s² 2s² 2p⁶ 3s² 3p⁶ 4s² 3d⁶ atau disingkat [Ar] 4s² 3d⁶.",
                misconception = "Mengisi 3d terlebih dahulu sebelum 4s padahal energi 4s lebih rendah dari 3d pada pengisian Aufbau."
            ),
            QuizQuestion(
                id = "q-ka-2",
                prompt = "Berapakah jumlah orbital (kotak) yang terdapat pada subkulit d (l = 2)?",
                type = "numeric",
                correctAnswer = "5",
                tolerance = 0.01f,
                unit = "orbital",
                hints = listOf(
                    "Nilai m berkisar dari -l sampai +l.",
                    "Untuk l = 2, nilai m adalah: -2, -1, 0, +1, +2.",
                    "Hitung berapa banyak nilai m tersebut."
                ),
                explanation = "Subkulit d memiliki l = 2, sehingga nilai bilangan kuantum magnetik m yang mungkin adalah -2, -1, 0, +1, +2 (total 5 orbital). Setiap orbital dapat menampung 2 elektron, sehingga kapasitas maksimumnya adalah 10 elektron.",
                misconception = "Tertukar antara jumlah orbital (5) dengan kapasitas maksimum elektron (10)."
            )
        )
    )

    // =========================================================================
    // 2. SISTEM PERIODIK & SIFAT PERIODIK UNSUR
    // =========================================================================
    private val sifatPeriodikLesson = LessonData(
        conceptId = "kim-sifat-periodik",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "psp1",
                panelNumber = 1,
                title = "Ledakan Logam Natrium di Air",
                caption = "Guru kimia mendemonstrasikan memasukkan sebutir kecil logam Natrium (Na) ke dalam baskom berisi air di balik pelindung kaca.",
                dialogueSpeaker = "Dimas",
                dialogueText = "DUARR! Butiran natrium itu meluncur kencang di permukaan air lalu meledak memercikkan bunga api kuning terang!",
                sceneVisualEmoji = "💥",
                sceneDescription = "Logam natrium meledak hebat bereaksi eksotermik dengan air melepaskan gas hidrogen."
            ),
            StoryPanel(
                id = "psp2",
                panelNumber = 2,
                title = "Energi Ionisasi: Merebut Elektron",
                caption = "Kakek menjelaskan mengapa logam golongan alkali sangat reaktif meledak.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Natrium memiliki 1 elektron valensi yang letaknya sangat jauh dari inti atom. Energi Ionisasinya (energi yang dibutuhkan untuk melepas elektron) sangat rendah! Begitu bersentuhan dengan air, elektron itu langsung lepas seketika memicu ledakan!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Elektron valensi terluar terlepas dengan mudah akibat tarikan muatan inti yang lemah."
            ),
            StoryPanel(
                id = "psp3",
                panelNumber = 3,
                title = "Keelektronegatifan & Tarikan Inti",
                caption = "Kirana membandingkan tabel periodik dari kiri ke kanan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Semakin ke kanan dalam satu periode, muatan proton inti bertambah kuat menarik kulit elektron: jari-jari atom mengecil dan Keelektronegatifan (daya tarik elektron) melonjak tinggi! Unsur Fluorin di pojok kanan atas adalah 'pencuri elektron' terkuat di alam semesta!",
                sceneVisualEmoji = "🧲",
                sceneDescription = "Grafik tren keelektronegatifan meningkat menuju Fluorin di pojok kanan atas tabel."
            )
        ),
        intuitionTitle = "Tren Periodisitas: Kekuatan Inti vs Jarak Kulit",
        intuitionBody = "Seluruh sifat fisik dan kimia unsur berulang secara periodik mengikuti dua faktor fundamental: Muatan Inti Efektif (Z_eff) dan Jumlah Kulit Elektron (n):\n\n" +
                "1. Jari-Jari Atom:\n" +
                "   • Dalam Satu Golongan (Atas ke Bawah): Jari-jari MAKIN BESAR karena jumlah kulit elektron bertambah.\n" +
                "   • Dalam Satu Periode (Kiri ke Kanan): Jari-jari MAKIN KECIL karena jumlah proton bertambah sehingga tarikan inti makin kuat merapatkan kulit elektron.\n\n" +
                "2. Energi Ionisasi (EI):\n" +
                "   • Energi minimum yang dibutuhkan untuk melepaskan 1 elektron terluar dari atom gas netral.\n" +
                "   • Kiri ke Kanan: Cenderung MAKIN BESAR (makin sulit melepas elektron).\n" +
                "   • Atas ke Bawah: Cenderung MAKIN KECIL (elektron makin jauh dari inti, makin mudah lepas).\n\n" +
                "3. Afinitas Elektron & Keelektronegatifan (Skala Pauling):\n" +
                "   • Keelektronegatifan mengukur kemampuan atom menarik pasangan elektron ikatan ke arah dirinya.\n" +
                "   • Unsur paling elektronegatif adalah Fluorin (skala 4,0), diikuti Oksigen (3,5), Nitrogen (3,0), dan Klorin (3,0).\n" +
                "   • Unsur paling elektropositif (mudah melepas elektron) adalah Fransium dan Cesium di pojok kiri bawah.",
        intuitionPoints = listOf(
            "Jari-jari kation positif selalu LEBIH KECIL dari atom netralnya (karena kehilangan kulit terluar dan tarikan inti makin kuat pada sisa elektron).",
            "Jari-jari anion negatif selalu LEBIH BESAR dari atom netralnya (karena tolakan antar-elektron meningkat saat menangkap elektron baru).",
            "Unsur Golongan IIA dan VA memiliki energi ionisasi yang sedikit lebih tinggi dari tren tetangganya karena konfigurasi subkulit penuh (s²) dan setengah penuh (p³) yang stabil."
        ),
        simId = "sim-periodicity",
        formulas = listOf(
            FormulaCard(
                symbol = "Z_{\\text{eff}}",
                equation = "Z_{\\text{eff}} = Z - S",
                meaning = "Muatan inti efektif yang dirasakan elektron valensi setelah dikurangi efek perisai (screening constant S) elektron kulit dalam.",
                units = "muatan proton",
                applicationNote = "Semakin besar Z_eff, semakin kuat tarikan inti dan semakin kecil jari-jari atom."
            ),
            FormulaCard(
                symbol = "\\text{EI}_1",
                equation = "\\text{X}(g) + \\text{EI}_1 \\rightarrow \\text{X}^+(g) + e^-",
                meaning = "Persamaan energi ionisasi pertama pelepasan elektron dari atom fase gas.",
                units = "kJ/mol",
                applicationNote = "EI kedua selalu lebih besar dari EI pertama (EI2 > EI1)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemisahan Unsur Tanah Jarang (Rare Earth Elements) Monasit di Bangka Belitung",
            context = "Penambangan timah PT Timah di kepulauan Bangka Belitung menghasilkan mineral sampingan pasir monasit yang kaya akan unsur Logam Tanah Jarang (Lantanida) seperti Neodimium (Nd), Cerium (Ce), dan Lantanum (La).",
            engineeringProblem = "Semua unsur deret Lantanida memiliki jari-jari atom dan sifat kimia yang hampir identik karena pengisian elektron berlangsung di subkulit dalam 4f (fenomena Kontraksi Lantanida), sehingga sangat sulit dipisahkan satu sama lain.",
            physicalConceptUsed = "Perbedaan tren jari-jari ion lantanida (r_ion mengecil bertahap dari La³⁺ 103 pm ke Lu³⁺ 86 pm) dan perbedaan konstanta pembentukan kompleks ligan kelat ekstraksi pelarut bertingkat.",
            mathematicalModel = "Pemisahan menggunakan ekstraktan organofosfat (TBP / D2EHPA) pada baterai mixer-settler 60 tahap memanfaatkan perbedaan koefisien distribusi D yang sangat tipis (rasio pemisahan β ≈ 1,5 antar-elemen tetangga).",
            realWorldImpact = "Menghasilkan oksida neodimium murni 99,9% untuk magnet permanen motor penggerak mobil listrik nasional dan generator kincir angin turbin PLTB.",
            relatedCareers = listOf("Insinyur Kimia Ekstraksi Lantanida", "Pakar Hidrometalurgi Logam Strategis", "Analis Spektroskopi ICP-MS"),
            verifiedSource = "Pusat Riset Teknologi Bahan Nuklir dan Limbah Radioaktif BRIN / PT Timah Tbk."
        ),
        homeLab = HomeLabData(
            title = "Membuat Grafik Tren Jari-Jari Atom Periode 3 Menggunakan Spreadsheet / Kertas",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Kertas milimeter blok atau aplikasi spreadsheet Excel/Google Sheets",
                "Tabel data jari-jari atom unsur Periode 3 (dalam pikometer / pm):\n• Na: 186 pm\n• Mg: 160 pm\n• Al: 143 pm\n• Si: 118 pm\n• P: 110 pm\n• S: 103 pm\n• Cl: 99 pm\n• Ar: 98 pm"
            ),
            steps = listOf(
                "Buat sumbu horizontal X untuk nomor atom unsur (Na=11 sampai Ar=18).",
                "Buat sumbu vertikal Y untuk panjang jari-jari atom (skala 50 sampai 200 pm).",
                "Plot titik-titik data jari-jari untuk setiap unsur dari Na hingga Ar.",
                "Hubungkan titik-titik tersebut menjadi satu garis kurva.",
                "Amati bentuk grafiknya: KURVA MENURUN SECARA TERATUR DARI KIRI KE KANAN!",
                "Simpulkan mengapa atom klorin yang punya 17 proton justru jauh lebih kecil ukurannya dibanding natrium yang hanya punya 11 proton!"
            ),
            observationGoal = "Membuktikan secara visual konsep muatan inti efektif Z_eff: penambahan proton tanpa penambahan kulit baru menarik awan elektron semakin rapat ke inti.",
            connectionToSimulation = "Bandingkan grafik buatanmu dengan visualisasi 3D jari-jari atom di simulator periodisitas Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sp-1",
                prompt = "Di antara unsur-unsur berikut, manakah yang memiliki jari-jari atom PALING BESAR?",
                type = "multiple_choice",
                options = listOf("Natrium (Na)", "Klorin (Cl)", "Magnesium (Mg)", "Fosfor (P)"),
                correctAnswer = "Natrium (Na)",
                hints = listOf(
                    "Keempat unsur ini berada dalam periode yang sama (Periode 3).",
                    "Dalam satu periode, jari-jari atom paling besar berada di sebelah paling kiri."
                ),
                explanation = "Dalam satu periode, dari kiri ke kanan jari-jari atom semakin mengecil karena muatan inti bertambah kuat. Natrium (Na) terletak paling kiri pada Periode 3, sehingga memiliki jari-jari atom paling besar.",
                misconception = "Mengira atom Klorin paling besar karena memiliki nomor atom 17 (paling banyak elektronnya)."
            ),
            QuizQuestion(
                id = "q-sp-2",
                prompt = "Unsur yang memiliki nilai keelektronegatifan PALING TINGGI (paling kuat menarik elektron ikatan) dalam tabel periodik adalah...",
                type = "multiple_choice",
                options = listOf("Fluorin (F)", "Fransium (Fr)", "Oksigen (O)", "Helium (He)"),
                correctAnswer = "Fluorin (F)",
                hints = listOf(
                    "Terletak di pojok kanan atas tabel periodik (di luar gas mulia).",
                    "Memiliki nilai skala Pauling 4,0 (tertinggi dari semua unsur)."
                ),
                explanation = "Fluorin (F) memiliki keelektronegatifan tertinggi di alam semesta (4,0 pada skala Pauling) karena jari-jarinya sangat kecil dan muatan intinya sangat kuat menarik elektron.",
                misconception = "Memilih gas mulia Helium, padahal gas mulia tidak memiliki keelektronegatifan ikatan karena tidak membentuk ikatan kovalen biasa."
            )
        )
    )

    // =========================================================================
    // 3. IKATAN KIMIA, BENTUK VSEPR & GAYA ANTARMOLEKUL
    // =========================================================================
    private val ikatanKimiaLesson = LessonData(
        conceptId = "kim-ikatan-kimia",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pik1",
                panelNumber = 1,
                title = "Garam Dapur vs Lilin Parafin",
                caption = "Kirana membandingkan sebongkah kristal garam dapur (NaCl) dengan lilin parafin di meja laboratorium.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lilin meleleh begitu mudah di atas air hangat, tapi kristal garam dapur kokoh sekali dan baru meleleh pada suhu di atas 800°C! Kenapa ikatannya beda jauh?",
                sceneVisualEmoji = "🧂",
                sceneDescription = "Kristal garam berkilau keras berdampingan dengan lilin parafin yang lunak."
            ),
            StoryPanel(
                id = "pik2",
                panelNumber = 2,
                title = "Geometri 3D Teori VSEPR",
                caption = "Kakek menyusun balon-balon gas mainan yang diikat di satu titik simpul pusat.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Domain elektron saling tolak-menolak sekuat tenaga (Valence Shell Electron Pair Repulsion / VSEPR). Empat pasang elektron di sekitar atom pusat akan membentuk geometri tetrahedral 109,5°. Tetapi pada molekul air H₂O, dua Pasangan Elektron Bebas (PEB) menolak lebih kuat sehingga sudut ikatannya menyempit jadi 104,5°!",
                sceneVisualEmoji = "🎈",
                sceneDescription = "Balon terikat menggambarkan orientasi tolakan ruang geometri domain elektron."
            ),
            StoryPanel(
                id = "pik3",
                panelNumber = 3,
                title = "Ikatan Hidrogen: Keajaiban Air Mengapung",
                caption = "Kirana melihat bongkahan es batu terapung di atas air minum dingin.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Normalnya zat padat lebih padat dari cairannya dan tenggelam. Tetapi es batu terapung di air! Ini keajaiban IKATAN HIDROGEN antar-molekul air yang membentuk kisi berongga heksagonal saat membeku!",
                sceneVisualEmoji = "🧊",
                sceneDescription = "Kisi kristal es heksagonal berongga yang ditopang oleh ikatan hidrogen antarmolekul."
            )
        ),
        intuitionTitle = "Arsitektur Molekul: VSEPR, Hibridisasi & Gaya Antarmolekul",
        intuitionBody = "Bentuk 3D molekul dan kekuatan ikatan menentukan seluruh sifat fisika zat di alam:\n\n" +
                "1. Teori Domain Elektron VSEPR & Hibridisasi:\n" +
                "   • Jumlah Domain = Pasangan Elektron Ikatan (PEI) + Pasangan Elektron Bebas (PEB).\n" +
                "   • 2 Domain (sp): Geometri Linier 180° (CO₂, BeCl₂).\n" +
                "   • 3 Domain (sp²): Segitiga Datar 120° (BF₃) atau Huruf V bengkok (SO₂).\n" +
                "   • 4 Domain (sp³): Tetrahedral 109,5° (CH₄), Piramida Trigonal 107° (NH₃), Bengkok/V 104,5° (H₂O).\n" +
                "   • Kekuatan Tolakan: PEB-PEB > PEB-PEI > PEI-PEI.\n\n" +
                "2. Kepolaran Molekul:\n" +
                "   • Ditentukan oleh beda keelektronegatifan dan SIMETRI bentuk molekul.\n" +
                "   • Molekul simetris tanpa PEB (seperti CO₂ dan CCl₄) bersifat NONPOLAR (momen dipol μ = 0).\n" +
                "   • Molekul asimetris dengan PEB (seperti H₂O dan NH₃) bersifat POLAR (momen dipol μ > 0).\n\n" +
                "3. Gaya Antarmolekul (Intermolekuler):\n" +
                "   • Gaya London (Dispersi): Terjadi pada semua molekul, dominan pada nonpolar akibat dipol sesaat.\n" +
                "   • Gaya Dipol-Dipol: Tarik-menarik kutub permanen pada molekul polar (HCl, SO₂).\n" +
                "   • Ikatan Hidrogen: Gaya antarmolekul terkuat, terjadi saat atom H terikat langsung pada atom super-elektronegatif N, O, atau F (H₂O, HF, NH₃, DNA).",
        intuitionPoints = listOf(
            "Ikatan hidrogen bertanggung jawab atas titik didih air yang anomali sangat tinggi (100°C) dibanding senyawa hidrida segolongannya (H₂S hanya -60°C).",
            "Prinsip 'Like Dissolves Like': Senyawa polar larut dalam pelarut polar (alkohol larut dalam air), senyawa nonpolar larut dalam pelarut nonpolar (minyak larut dalam bensin).",
            "Ikatan logam dimodelkan sebagai lautan elektron terdelokalisasi yang bebas mengalir mengitari kation logam, menjelaskan mengapa logam lentur bisa ditempa dan konduktor listrik ulung."
        ),
        simId = "sim-chemical-bonding",
        formulas = listOf(
            FormulaCard(
                symbol = "\\mu (\\text{Dipol})",
                equation = "\\boldsymbol{\\mu} = \\sum q_i \\mathbf{r}_i",
                meaning = "Vektor momen dipol total molekul.",
                units = "Debye (D)",
                applicationNote = "Jika resultan vektor Σμ = 0, molekul bersifat nonpolar (contoh: CO2 linier)."
            ),
            FormulaCard(
                symbol = "\\text{Tipe VSEPR}",
                equation = "\\text{AX}_m\\text{E}_n \\quad (m = \\text{PEI}, \\, n = \\text{PEB})",
                meaning = "Notasi rumus domain elektron penentu bentuk geometri molekul.",
                units = "-",
                applicationNote = "Air H2O bertipe AX2E2 -> bentuk bengkok sudut 104,5°."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Inovasi Bioplastik Polimer Biodegradable dari Pati Singkong Indonesia",
            context = "Indonesia menghadapi darurat sampah plastik sekali pakai polietilena non-polar sintetis yang butuh 500 tahun untuk terurai di alam liar.",
            engineeringProblem = "Plastik konvensional tersusun dari rantai kovalen karbon-karbon jenuh yang kedap air dan tidak dapat dicerna oleh enzim bakteri pengurai tanah.",
            physicalConceptUsed = "Rekayasa ikatan kimia: memanfaatkan makromolekul pati singkong (amilosa dan amilopektin) yang kaya ikatan kovalen polar hidrofilik C-O-C dan ikatan hidrogen antarrantai.",
            mathematicalModel = "Insinyur biomaterial menambahkan zat pemplastis (plasticizer) gliserol pada rasio 25% berat untuk menyisip di antara ikatan hidrogen rantai pati, menurunkan kristalinitas dan meningkatkan fleksibilitas mekanik hingga kekuatan tarik 15 MPa.",
            realWorldImpact = "Kantong bioplastik singkong karya anak bangsa dapat larut di air panas dalam hitungan detik dan terurai sempurna menjadi kompos organik ramah lingkungan dalam waktu kurang dari 90 hari di tanah.",
            relatedCareers = listOf("Ilmuwan Kimia Polimer & Biomaterial", "Insinyur Kemasan Berkelanjutan", "Peneliti Bioekonomi Sirkular"),
            verifiedSource = "Pusat Riset Kimia Maju BRIN / Inovasi Industri Bioplastik Nusantara."
        ),
        homeLab = HomeLabData(
            title = "Membelokkan Aliran Air Keran Menggunakan Penggaris Bermuatan (Uji Kepolaran Air)",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 penggaris mika plastik panjang atau balon karet",
                "Kain wol atau rambut kering bersih",
                "Keran air wastafel / kamar mandi"
            ),
            steps = listOf(
                "Buka keran air wastafel sangat kecil sehingga menghasilkan aliran benang air yang mengalir lurus, tipis, halus tanpa putus.",
                "Gosokkan penggaris mika ke rambut keringmu berkali-kali secara cepat selama 20 detik hingga bermuatan listrik statis.",
                "Dekatkan penggaris bermuatan ke dekat aliran benang air tipis (jarak 1-2 cm, jangan sampai menyentuh air).",
                "AMATI DENGAN SEKSAMA: ALIRAN BENANG AIR SEKETIKA MEMBELOK MELENGKUNG MENDEKATI PENGGARIS MIKA!",
                "Sekarang coba ganti aliran air dengan minyak goreng. Aliran minyak goreng nonpolar TIDAK MEMBELOK sama sekali!"
            ),
            observationGoal = "Membuktikan bahwa molekul air (H₂O) bersifat POLAR permanen yang memiliki momen dipol listrik sehingga kutub-kutub molekulnya langsung tertarik oleh muatan listrik luar.",
            connectionToSimulation = "Bandingkan sudut pembelokan molekul air dengan simulator polaritas molekul Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ik-1",
                prompt = "Molekul metana (CH₄) memiliki 4 pasangan elektron ikatan (PEI) dan 0 pasangan elektron bebas (PEB) pada atom pusat karbon. Bentuk geometri molekul CH₄ menurut teori VSEPR adalah...",
                type = "multiple_choice",
                options = listOf("Tetrahedral", "Segitiga Datar", "Linier", "Oktahedral"),
                correctAnswer = "Tetrahedral",
                hints = listOf(
                    "Tipe molekulnya adalah AX₄.",
                    "Empat ikatan saling menjauh simetris di ruang 3 dimensi dengan sudut ikatan 109,5°."
                ),
                explanation = "Molekul dengan 4 domain ikatan tanpa pasangan elektron bebas (AX₄) memiliki bentuk geometri tetrahedral sempurna dengan sudut ikatan 109,5°.",
                misconception = "Mengira bentuknya bujur sangkar datar 90° karena digambar datar di kertas buku."
            ),
            QuizQuestion(
                id = "q-ik-2",
                prompt = "Jenis gaya antarmolekul PALING KUAT yang menyebabkan titik didih air (H₂O) jauh lebih tinggi dibanding hidrogen sulfida (H₂S) adalah...",
                type = "multiple_choice",
                options = listOf("Ikatan Hidrogen", "Gaya Dispersi London", "Gaya Dipol-Dipol Induksian", "Ikatan Kovalen Nonpolar"),
                correctAnswer = "Ikatan Hidrogen",
                hints = listOf(
                    "Terjadi ketika atom H terikat langsung pada atom O yang sangat elektronegatif.",
                    "Gaya tarik intermolekul yang sangat kokoh."
                ),
                explanation = "Air memiliki ikatan hidrogen antar-molekulnya karena atom H terikat langsung pada atom Oksigen yang sangat elektronegatif. Ikatan hidrogen jauh lebih kuat daripada gaya dipol-dipol biasa pada H₂S.",
                misconception = "Mengira ikatan kovalen di dalam molekul air yang putus saat air mendidih (yang putus adalah ikatan hidrogen antarmolekul)."
            )
        )
    )

    // =========================================================================
    // 4. STOIKIOMETRI, KONSEP MOL & PEREAKSI PEMBATAS
    // =========================================================================
    private val stoikiometriLesson = LessonData(
        conceptId = "kim-stoikiometri",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pst1",
                panelNumber = 1,
                title = "Menghitung Butir Pasir di Pantai",
                caption = "Kirana dan Dimas duduk di tepi pantai pasir putih. Kirana mencoba menghitung butiran pasir di telapak tangannya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Satu sendok pasir saja ada jutaan butir! Bagaimana mungkin para kimiawan menimbang dan menghitung jumlah atom yang ukurannya semilyar kali lebih kecil?",
                sceneVisualEmoji = "🏖️",
                sceneDescription = "Genggaman pasir pantai mengilustrasikan jumlah partikel renik yang teramat banyak."
            ),
            StoryPanel(
                id = "pst2",
                panelNumber = 2,
                title = "Lusin Versi Kimia: Satuan Mol",
                caption = "Kakek tersenyum dan mengambil buku catatan berisi tetapan Avogadro.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jika penjual telur memakai '1 lusin = 12 butir', ahli kimia memakai '1 mol = 6,022 × 10²³ partikel'! Angka fantastis ini dinamakan Bilangan Avogadro.",
                sceneVisualEmoji = "📦",
                sceneDescription = "Analogi 1 lusin telur dengan 1 mol partikel atom yang dikemas dalam satuan praktis."
            ),
            StoryPanel(
                id = "pst3",
                panelNumber = 3,
                title = "Resep Kue & Pereaksi Pembatas",
                caption = "Bu Ratna menjelaskan analogi membuat kue bolu di dapur.",
                dialogueSpeaker = "Bu Ratna",
                dialogueText = "Jika kamu punya 10 butir telur tapi tepungnya cuma cukup untuk 2 kue, maka kuemu hanya jadi 2 loyang! Tepung adalah 'Pereaksi Pembatas' yang membatasi hasil maksimal reaksimu!",
                sceneVisualEmoji = "🎂",
                sceneDescription = "Bahan baku kue mengilustrasikan bahan yang habis duluan membatasi produk maksimal."
            )
        ),
        intuitionTitle = "Stoikiometri: Matematika Reaksi Kimia Kuantitatif",
        intuitionBody = "Stoikiometri adalah seni menghitung kuantitas reaktan dan produk dalam reaksi kimia secara kuantitatif:\n\n" +
                "1. Jembatan Emas Konversi Mol (The Mole Bridge):\n" +
                "   • Dari Massa (gram) ↔ Mol: n = massa / M_r.\n" +
                "   • Dari Jumlah Partikel (X) ↔ Mol: n = X / (6,022 × 10²³).\n" +
                "   • Dari Volume Gas STP (0°C, 1 atm) ↔ Mol: n = V / 22,4 Liter.\n" +
                "   • Dari Gas Kondisi Ruang RTP (25°C, 1 atm) ↔ Mol: n = V / 24,0 Liter.\n" +
                "   • Dari Gas Non-Standar Ideal: P · V = n · R · T.\n\n" +
                "2. Satuan Konsentrasi Larutan:\n" +
                "   • Molaritas (M): mol zat terlarut per Liter larutan total (M = n / V).\n" +
                "   • Molalitas (m): mol zat terlarut per kilogram pelarut murni (m = n / p_kg).\n" +
                "   • Fraksi Mol (X): rasio mol zat terhadap mol total larutan (X_A = n_A / n_total).\n\n" +
                "3. Pereaksi Pembatas (Limiting Reactant):\n" +
                "   • Zat yang memiliki rasio (mol / koefisien reaksi) TERKECIL.\n" +
                "   • Zat ini habis bereaksi terlebih dahulu dan menghentikan jalannya reaksi, menentukan jumlah produk maksimal secara teoritis.\n" +
                "   • Persen Hasil Reaksi (% Yield) = (Hasil Nyata Eksperimen / Hasil Teoritis Stoikiometri) × 100%.",
        intuitionPoints = listOf(
            "Persamaan reaksi kimia WAJIB disetarakan terlebih dahulu sebelum melakukan perbandingan mol stoikiometri.",
            "Koefisien reaksi adalah perbandingan jumlah partikel dan perbandingan mol, BUKAN perbandingan gram massa zat!",
            "Rumus Empiris adalah perbandingan mol paling sederhana antar-atom dalam senyawa, sedangkan Rumus Molekul adalah kelipatan bulat dari rumus empiris (RM = (RE)_n).",
            "Massa molar zat dalam satuan gram/mol memiliki angka yang persis sama dengan massa rumus relatif Mr-nya."
        ),
        simId = "sim-stoichiometry",
        formulas = listOf(
            FormulaCard(
                symbol = "n = \\frac{m}{M_r}",
                equation = "n = \\frac{m}{M_r} = \\frac{N}{N_A} = \\frac{V_{\\text{STP}}}{22{,}4} = M \\cdot V",
                meaning = "Rumus konversi terpadu jembatan mol kimia.",
                units = "mol",
                applicationNote = "NA = 6,022 × 10²³ partikel/mol."
            ),
            FormulaCard(
                symbol = "\\% \\text{ Hasil}",
                equation = "\\% \\text{ Yield} = \\frac{\\text{Massa Hasil Nyata}}{\\text{Massa Hasil Teoritis}} \\times 100\\%",
                meaning = "Efisiensi rendemen pembentukan produk reaksi kimia industri.",
                units = "Persen (%)",
                applicationNote = "Hasil nyata di pabrik biasanya lebih rendah dari teoritis karena reaksi samping atau kehilangan saat pemurnian."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Optimalisasi Sintesis Amonia Pabrik Pupuk PT Pupuk Kujang Cikampek",
            context = "Pabrik amonia PT Pupuk Kujang memproduksi ribuan ton pupuk urea setiap hari untuk mendukung ketahanan pangan nasional Indonesia.",
            engineeringProblem = "Reaksi Haber-Bosch gas nitrogen dan hidrogen N₂ + 3H₂ ⇌ 2NH₃ membutuhkan rasio stoikiometri yang sangat presisi pada suhu 450°C dan tekanan 200 atm.",
            physicalConceptUsed = "Hukum perbandingan stoikiometri Gay-Lussac dan Avogadro serta perhitungan pereaksi pembatas reaksi alir kontinu.",
            mathematicalModel = "Insinyur proses mengumpankan gas N₂ dan H₂ dengan rasio mol tepat 1 : 3. Jika rasio melenceng menjadi 1 : 2, gas N₂ berlebih yang berharga miliaran rupiah akan terbuang percuma tanpa bereaksi dan merusak efisiensi katalis besi.",
            realWorldImpact = "Menghemat konsumsi gas alam senilai puluhan miliar rupiah per tahun dan menghasilkan pupuk urea bersubsidi bermutu tinggi bagi jutaan petani di Jawa Barat.",
            relatedCareers = listOf("Insinyur Rekayasa Proses Kimia", "Ahli Termodinamika & Kinetika Reaktor", "Manajer Efisiensi Energi Pabrik"),
            verifiedSource = "PT Pupuk Indonesia (Persero) Holding Company."
        ),
        homeLab = HomeLabData(
            title = "Menemukan Pereaksi Pembatas pada Balon Cuka & Soda Kue",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "3 botol plastik bekas 330 ml yang sama (diberi label A, B, C)",
                "Cuka dapur dengan takaran sama: 50 ml di setiap botol",
                "Soda kue (NaHCO₃): 1 sendok teh untuk botol A, 2 sendok teh untuk botol B, 4 sendok teh untuk botol C",
                "3 balon karet dengan ukuran sama"
            ),
            steps = listOf(
                "Langkah 1: Isi botol A, B, dan C masing-masing dengan 50 ml cuka dapur.",
                "Langkah 2: Masukkan soda kue ke dalam masing-masing balon: Balon A (1 sendok), Balon B (2 sendok), Balon C (4 sendok).",
                "Langkah 3: Pasang ketiga balon ke mulut botol masing-masing, lalu tumpahkan soda kue secara bersamaan.",
                "Langkah 4: Amati volume balon: Balon B mengembang lebih besar dari Balon A.",
                "Langkah 5: Perhatikan Balon C: mengapa ukurannya hampir sama dengan Balon B padahal diberi soda kue dua kali lebih banyak? Karena di botol C, cuka sudah habis bereaksi (cuka menjadi pereaksi pembatas)!"
            ),
            observationGoal = "Melihat secara langsung fenomena pereaksi pembatas: menambah salah satu bahan tanpa menambah bahan pasangannya tidak akan menambah produk gas yang dihasilkan.",
            connectionToSimulation = "Gunakan simulator stoikiometri di bawah untuk menghitung mol pereaksi pembatas secara digital!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-stok-1",
                prompt = "Berapakah jumlah mol dari 36 gram air (H₂O)? Diketahui massa atom relatif Ar H = 1 dan O = 16.",
                type = "numeric",
                correctAnswer = "2.0",
                tolerance = 0.1f,
                unit = "mol",
                hints = listOf(
                    "Hitung massa molar Mr H₂O = (2 × 1) + 16 = 18 g/mol.",
                    "Gunakan rumus n = massa / Mr.",
                    "Hitung 36 dibagi 18."
                ),
                explanation = "Mr H₂O = 2(1) + 16 = 18 g/mol. Jumlah mol n = 36 g / 18 g/mol = 2,0 mol.",
                misconception = "Lupa mengalikan massa hidrogen dengan 2 karena ada 2 atom H dalam molekul air."
            ),
            QuizQuestion(
                id = "q-stok-2",
                prompt = "Pada reaksi: N₂ + 3H₂ → 2NH₃, jika direaksikan 1 mol gas N₂ dengan 6 mol gas H₂, manakah zat yang menjadi Pereaksi Pembatas?",
                type = "multiple_choice",
                options = listOf("Gas Nitrogen (N₂)", "Gas Hidrogen (H₂)", "Gas Amonia (NH₃)", "Keduanya habis bersamaan"),
                correctAnswer = "Gas Nitrogen (N₂)",
                hints = listOf(
                    "Bagi mol masing-masing zat dengan koefisien reaksinya.",
                    "Untuk N₂: 1 / 1 = 1.",
                    "Untuk H₂: 6 / 3 = 2.",
                    "Nilai bagi yang paling kecil adalah pereaksi pembatas!"
                ),
                explanation = "Rasio mol/koefisien N₂ adalah 1/1 = 1, sedangkan H₂ adalah 6/3 = 2. Karena 1 < 2, maka N₂ habis bereaksi lebih dulu dan menjadi pereaksi pembatas.",
                misconception = "Mengira zat dengan jumlah mol lebih sedikit pasti selalu jadi pereaksi pembatas tanpa membaginya dengan koefisien reaksi."
            )
        )
    )

    // =========================================================================
    // 5. HUKUM-HUKUM DASAR KIMIA & GAS
    // =========================================================================
    private val hukumDasarKimiaLesson = LessonData(
        conceptId = "kim-hukum-dasar-kimia",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "phdk1",
                panelNumber = 1,
                title = "Neraca Tertutup Antoine Lavoisier",
                caption = "Tahun 1789, Antoine Lavoisier mereaksikan cairan fosfor merah di dalam tabung kaca tertutup rapat yang diletakkan di atas neraca timbang.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Fosfor terbakar hebat menjadi asap putih pekat, tapi jarum neraca timbangannya sama sekali tidak bergerak seujung kuku pun!",
                sceneVisualEmoji = "⚖️",
                sceneDescription = "Tabung reaksi tertutup di atas neraca timbang menunjukkan jarum timbangan tetap seimbang sempurna sebelum dan sesudah pembakaran."
            ),
            StoryPanel(
                id = "phdk2",
                panelNumber = 2,
                title = "Resep Abadi Hukum Proust",
                caption = "Kakek menunjukkan perbandingan massa air mineral pegunungan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Joseph Proust membuktikan Hukum Perbandingan Tetap: di mana pun air diambil—dari salju puncak Jayawijaya, air sumur Yogya, atau air zam-zam—perbandingan massa Hidrogen terhadap Oksigen SELALU tepat 1 banding 8! Jika kamu mencampur 2 gram H dengan 8 gram O, maka 1 gram H akan tersisa tanpa bereaksi!",
                sceneVisualEmoji = "💧",
                sceneDescription = "Neraca perbandingan massa hidrogen dan oksigen 1 : 8 membentuk air murni."
            ),
            StoryPanel(
                id = "phdk3",
                panelNumber = 3,
                title = "Hukum Gas Gay-Lussac & Avogadro",
                caption = "Kirana menggambar perbandingan volume gas yang bereaksi membentuk uap air.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Pada suhu dan tekanan sama, perbandingan volume gas-gas yang bereaksi adalah bilangan bulat sederhana yang SAMA PERSIS dengan perbandingan koefisien molekulnya! 2 liter gas H₂ bereaksi dengan 1 liter gas O₂ menghasilkan tepat 2 liter uap air H₂O!",
                sceneVisualEmoji = "🎈",
                sceneDescription = "Balon-balon gas bervolume sebanding dengan angka koefisien reaksi."
            )
        ),
        intuitionTitle = "Lima Pilar Fondasi Kimia Modern",
        intuitionBody = "Seluruh ilmu kimia analitik ditegakkan di atas 5 hukum dasar penemuan para pionir sains:\n\n" +
                "1. Hukum Kekekalan Massa (Lavoisier, 1789):\n" +
                "   • Massa total zat sebelum reaksi = massa total zat setelah reaksi dalam sistem tertutup.\n\n" +
                "2. Hukum Perbandingan Tetap (Proust, 1799):\n" +
                "   • Perbandingan massa unsur-unsur penyusun suatu senyawa kimia selalu tetap dan tertentu.\n" +
                "   • Contoh H₂O: massa H : massa O = 2(1) : 16 = 1 : 8.\n" +
                "   • Contoh CO₂: massa C : massa O = 12 : 2(16) = 12 : 32 = 3 : 8.\n\n" +
                "3. Hukum Kelipatan Berganda (Dalton, 1803):\n" +
                "   • Jika dua unsur dapat membentuk lebih dari satu senyawa (misal CO dan CO₂), dan massa salah satu unsur dibuat sama (massa C sama), maka perbandingan massa unsur kedua (Oksigen) merupakan bilangan bulat dan sederhana (massa O pada CO : CO₂ = 1 : 2).\n\n" +
                "4. Hukum Perbandingan Volume (Gay-Lussac, 1808):\n" +
                "   • Pada suhu dan tekanan sama (T, P sama), volume gas-gas yang bereaksi dan gas hasil reaksi berbanding sebagai bilangan bulat sederhana (perbandingan volume = perbandingan koefisien).\n\n" +
                "5. Hipotesis Avogadro (1811):\n" +
                "   • Pada suhu dan tekanan sama, gas-gas yang memiliki volume yang sama mengandung jumlah molekul yang sama banyak.",
        intuitionPoints = listOf(
            "Hukum Gay-Lussac dan Avogadro HANYA BERLAKU untuk zat yang berfase GAS, tidak berlaku untuk zat padat atau cairan murni.",
            "Hukum Dalton membuktikan secara tak terbantahkan keberadaan atom sebagai partikel diskrit yang bergabung dalam rasio utuh bulat.",
            "Jika dalam soal kimia disebutkan 'pada suhu dan tekanan yang sama', kamu bisa langsung menyamakan perbandingan volume gas dengan perbandingan koefisien reaksinya!"
        ),
        simId = "sim-gas-laws",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Gay-Lussac}",
                equation = "\\frac{V_1}{V_2} = \\frac{\\text{Koefisien}_1}{\\text{Koefisien}_2} = \\frac{n_1}{n_2}",
                meaning = "Perbandingan volume gas pada kondisi P dan T yang sama setara dengan rasio koefisien dan mol.",
                units = "Liter (L)",
                applicationNote = "Contoh: 1 L N2 + 3 L H2 -> 2 L NH3 gas."
            ),
            FormulaCard(
                symbol = "\\text{Proust}",
                equation = "\\frac{m_A}{m_B} = \\frac{x \\cdot A_r(A)}{y \\cdot A_r(B)} = \\text{konstan}",
                meaning = "Hukum perbandingan massa tetap pada senyawa AxBy.",
                units = "rasio gram",
                applicationNote = "Sisa pereaksi = massa awal - massa yang bereaksi sesuai rasio tetap."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pencampuran Gas Injeksi Kilang Minyak Balongan Indramayu Jawa Barat",
            context = "Kilang Balongan mengoperasikan unit Residual Catalytic Cracking (RCC) untuk mengolah minyak residu berat menjadi bensin pertamax dan LPG.",
            engineeringProblem = "Pembakaran kokas pada katalis membutuhkan pasokan gas oksigen dan udara bertekanan dengan volume yang tepat agar pembakaran karbon sempurna menjadi CO₂ tanpa menyisakan gas CO yang meledak.",
            physicalConceptUsed = "Hukum Gay-Lussac dan Avogadro perbandingan volume gas pada reaktor alir bertekanan.",
            mathematicalModel = "Insinyur proses mengontrol laju alir volume gas: C(s) + O₂(g) → CO₂(g). Setiap 100 Nm³/jam gas oksigen yang diinjeksikan tepat mengonsumsi kokas karbon padat dan menghasilkan 100 Nm³/jam gas buang CO₂ pada suhu dan tekanan reaktor terkontrol.",
            realWorldImpact = "Mencegah ledakan reaktor katalis dan meningkatkan yield produksi bensin ramah lingkungan standar Euro-4.",
            relatedCareers = listOf("Insinyur Reaktor Kilang Balongan", "Spesialis Instrumentasi Gas Alir", "Analis Keselamatan Proses Kimia"),
            verifiedSource = "PT Kilang Pertamina Internasional RU VI Balongan."
        ),
        homeLab = HomeLabData(
            title = "Membuktikan Hukum Kekekalan Massa Lavoisier Menggunakan Botol Tertutup & Cuka",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 timbangan dapur digital (ketelitian 1 gram atau 0,1 gram)",
                "1 botol air mineral plastik kecil bertutup rapat",
                "3 sendok makan cuka dapur",
                "1 sendok teh soda kue dimasukkan ke dalam plastik klip kecil terbuka / sedotan"
            ),
            steps = listOf(
                "Masukkan 3 sendok cuka ke dalam botol.",
                "Masukkan soda kue ke dalam potongan sedotan atau kantong plastik kecil agar tidak langsung bercampur dengan cuka.",
                "Masukkan kantong soda kue ke dalam botol secara hati-hati, lalu TUTUP BOTOL DENGAN SANGAT RAPAT KEDAP UDARA.",
                "Letakkan botol di atas timbangan digital. Catat massa total sistem sebelum reaksi (misal tepat 124,5 gram).",
                "Kocok dan miringkan botol sehingga cuka bercampur dengan soda kue. BUIH GAS CO₂ MEREBAK HEBAT DAN BOTOL MENGEMBUNG KERAS!",
                "Amati angka di layar timbangan digital: ANGKA MASSA TETAP PERSIS 124,5 GRAM TANPA BERKURANG SEDIKIT PUN!",
                "Buka tutup botol perlahan (gas berdesis keluar), lalu timbang kembali: sekarang massanya berkurang karena gas CO₂ terbang ke atmosfer."
            ),
            observationGoal = "Membuktikan Hukum Lavoisier: dalam sistem tertutup di mana gas tidak bisa kabur, massa sebelum dan sesudah reaksi kimia selalu sama persis.",
            connectionToSimulation = "Bandingkan neraca timbangan botolmu dengan simulator hukum kekekalan massa Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-hdk-1",
                prompt = "Sebanyak 10 gram gas hidrogen (H₂) direaksikan dengan 64 gram gas oksigen (O₂) membentuk air (H₂O). Jika perbandingan massa H : O dalam air adalah 1 : 8, berapakah massa air yang terbentuk dan apakah ada zat yang tersisa?",
                type = "multiple_choice",
                options = listOf(
                    "Terbentuk 72 gram air dan tersisa 2 gram gas hidrogen",
                    "Terbentuk 74 gram air tanpa ada zat yang tersisa",
                    "Terbentuk 64 gram air dan tersisa 10 gram gas hidrogen",
                    "Terbentuk 80 gram air dan tersisa gas oksigen"
                ),
                correctAnswer = "Terbentuk 72 gram air dan tersisa 2 gram gas hidrogen",
                hints = listOf(
                    "Perbandingan massa H : O = 1 : 8.",
                    "Oksigen yang tersedia = 64 gram. Maka hidrogen yang dibutuhkan = 64 / 8 = 8 gram.",
                    "Hidrogen mula-mula ada 10 gram, jadi tersisa 10 - 8 = 2 gram.",
                    "Massa air = massa H bereaksi (8 g) + massa O bereaksi (64 g)."
                ),
                explanation = "Sesuai hukum Proust (H : O = 1 : 8), 64 gram oksigen membutuhkan 8 gram hidrogen untuk bereaksi sempurna menghasilkan 8 + 64 = 72 gram air. Karena hidrogen mula-mula ada 10 gram, maka tersisa 2 gram gas hidrogen.",
                misconception = "Menjumlahkan langsung 10 + 64 = 74 gram tanpa mengecek perbandingan tetap Proust."
            ),
            QuizQuestion(
                id = "q-hdk-2",
                prompt = "Pada suhu dan tekanan yang sama, 4 liter gas propana (C₃H₈) dibakar sempurna menurut reaksi: C₃H₈(g) + 5 O₂(g) → 3 CO₂(g) + 4 H₂O(g). Berapakah volume gas oksigen (O₂) yang dibutuhkan?",
                type = "numeric",
                correctAnswer = "20",
                tolerance = 0.1f,
                unit = "Liter",
                hints = listOf(
                    "Gunakan Hukum Gay-Lussac: perbandingan volume = perbandingan koefisien.",
                    "Volume O₂ = (koefisien O₂ / koefisien C₃H₈) × volume C₃H₈.",
                    "Hitung (5 / 1) × 4 liter."
                ),
                explanation = "Menurut Hukum Gay-Lussac, Volume O₂ = (koefisien O₂ / koefisien C₃H₈) × Volume C₃H₈ = (5 / 1) × 4 Liter = 20 Liter.",
                misconception = "Membagi volume dengan koefisien alih-alih mengalikannya."
            )
        )
    )

    // =========================================================================
    // 6. TERMOKIMIA, ENTALPI & HUKUM HESS
    // =========================================================================
    private val termokimiaLesson = LessonData(
        conceptId = "kim-termokimia",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "ptmk1",
                panelNumber = 1,
                title = "Sensasi Dingin Kompres Instan",
                caption = "Dimas mengalami cedera pergelangan kaki saat bermain basket. Petugas PMR meremas kantong kompres dingin instan (cold pack) dan menempelkannya ke kaki Dimas.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Brrr! Kantong kompres ini tidak disimpan di kulkas, tapi begitu diremas mendadak dingin membeku seperti es! Bagaimana bisa?",
                sceneVisualEmoji = "🧊",
                sceneDescription = "Kantong kompres dingin instan membeku saat kristal amonium nitrat larut menyerap kalor."
            ),
            StoryPanel(
                id = "ptmk2",
                panelNumber = 2,
                title = "Eksoterm vs Endoterm",
                caption = "Kakek menjelaskan konsep aliran kalor antara sistem dan lingkungan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kantong dingin itu reaksi ENDOTERM (ΔH > 0): zat amonium nitrat menyerap kalor dari lingkungan sekitarnya sehingga suhu turun drastis! Sebaliknya, api unggun pembakaran kayu adalah reaksi EKSOTERM (ΔH < 0): sistem melepas energi panas ke lingkungan sehingga menghangatkan tubuh kita!",
                sceneVisualEmoji = "🔥",
                sceneDescription = "Diagram tingkat energi reaksi eksoterm melepaskan kalor vs endoterm menyerap kalor."
            ),
            StoryPanel(
                id = "ptmk3",
                panelNumber = 3,
                title = "Hukum Hess: Jalan Pintas Termokimia",
                caption = "Kirana menggambar siklus diagram Hess di buku catatan kimianya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Germain Henri Hess membuktikan: Perubahan Entalpi (ΔH) adalah fungsi keadaan! Nilai ΔH HANYA bergantung pada keadaan awal reaktan dan keadaan akhir produk, tidak peduli apakah reaksi berlangsung satu langkah langsung atau berputar lewat sepuluh tahap reaksi perantara!",
                sceneVisualEmoji = "🔄",
                sceneDescription = "Siklus diagram Hess memperlihatkan penjumlahan entalpi rute langsung sama dengan rute bertingkat."
            )
        ),
        intuitionTitle = "Dinamika Kalor Reaksi: Entalpi, Kalorimetri & Siklus Hess",
        intuitionBody = "Termokimia mempelajari pertukaran energi panas (kalor) yang menyertai reaksi kimia:\n\n" +
                "1. Entalpi (H) & Perubahan Entalpi (ΔH = H_produk - H_reaktan):\n" +
                "   • Reaksi Eksoterm: Melepas kalor ke lingkungan (ΔH bernilai negatif, suhu lingkungan NAIK, contoh: pembakaran, netralisasi asam-basa, respirasi).\n" +
                "   • Reaksi Endoterm: Menyerap kalor dari lingkungan (ΔH bernilai positif, suhu lingkungan TURUN, contoh: fotosintesis, pelarutan urea/amonium nitrat, penguraian kapur).\n\n" +
                "2. Kalorimetri (Pengukuran Kalor di Laboratorium):\n" +
                "   • q_larutan = m · c · ΔT.\n" +
                "   • q_reaksi = - (q_larutan + C_kalorimeter · ΔT).\n" +
                "   • ΔH = q_reaksi / mol pereaksi.\n\n" +
                "3. Tiga Metode Menghitung ΔH Reaksi:\n" +
                "   • Hukum Hess: ΔH total = ΔH₁ + ΔH₂ + ΔH₃ (reaksi dapat dijumlahkan, dibalik tandanya jika arah dibalik, dikalikan jika koefisien dikalikan).\n" +
                "   • Data Entalpi Pembentukan Standar (ΔHf°):\n" +
                "     ΔH_reaksi = Σ (n · ΔHf°_produk) - Σ (m · ΔHf°_reaktan).\n" +
                "     (Catatan: ΔHf° unsur bebas murni seperti O₂, N₂, Fe, C_grafit SELALU NOL).\n" +
                "   • Data Energi Ikatan Rata-Rata (D):\n" +
                "     ΔH_reaksi = Σ Energi Pemutusan Ikatan (Kiri) - Σ Energi Pembentukan Ikatan (Kanan).",
        intuitionPoints = listOf(
            "Ingat rumus energi ikatan terbalik dengan rumus ΔHf°: energi ikatan menghitung (KIRI reaktan diputus - KANAN produk dibentuk).",
            "Makin besar energi ikatan, makin kokoh molekul tersebut dan makin banyak kalor yang dibutuhkan untuk memutuskannya.",
            "Reaksi pembakaran bahan bakar fosil selalu eksotermik tinggi karena ikatan C=O pada CO₂ dan O-H pada H₂O yang terbentuk sangat stabil melepaskan energi raksasa."
        ),
        simId = "sim-thermochemistry",
        formulas = listOf(
            FormulaCard(
                symbol = "q",
                equation = "q = m \\cdot c \\cdot \\Delta T",
                meaning = "Jumlah kalor yang diserap atau dilepas larutan bermassa m dengan kalor jenis c.",
                units = "Joule (J) atau kJ",
                applicationNote = "c air = 4,184 J/(g·°C). ΔT = T_akhir - T_awal."
            ),
            FormulaCard(
                symbol = "\\Delta H_r^\\circ",
                equation = "\\Delta H_r^\\circ = \\sum n \\Delta H_f^\\circ(\\text{produk}) - \\sum m \\Delta H_f^\\circ(\\text{reaktan})",
                meaning = "Perhitungan perubahan entalpi reaksi standar dari data entalpi pembentukan standar.",
                units = "kJ/mol",
                applicationNote = "ΔHf° unsur bebas dalam bentuk standarnya bernilai 0 kJ/mol."
            ),
            FormulaCard(
                symbol = "\\Delta H (\\text{Ikatan})",
                equation = "\\Delta H = \\sum D_{\\text{pemutusan (reaktan)}} - \\sum D_{\\text{pembentukan (produk)}}",
                meaning = "Perhitungan entalpi reaksi menggunakan data energi ikatan rata-rata.",
                units = "kJ/mol",
                applicationNote = "Gunakan struktur ikatan Lewis untuk menghitung jumlah ikatan yang putus dan terbentuk."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Nilai Kalor Pembakaran Biodiesel Sawit B35 PT Pertamina",
            context = "Indonesia sukses menerapkan mandatori bahan bakar B35 (campuran 35% ester minyak sawit FAME dengan 65% solar murni) untuk menekan impor solar migas.",
            engineeringProblem = "Biodiesel fatty acid methyl ester (FAME) memiliki kandungan oksigen terikat di dalam molekulnya sehingga nilai kalor entalpi pembakarannya sedikit berbeda dari solar fosil murni.",
            physicalConceptUsed = "Hukum Termokimia dan pengukuran nilai kalor entalpi pembakaran menggunakan bomb calorimeter adiabatik standar ASTM D240.",
            mathematicalModel = "Kalor pembakaran FAME diukur sebesar ΔHc° ≈ -37,5 MJ/kg dibanding solar murni -42,5 MJ/kg. Insinyur mesin menyesuaikan timing injeksi bahan bakar dan rasio kompresi mesin diesel common rail untuk menjaga torsi tenaga mesin tetap optimal.",
            realWorldImpact = "Menghemat devisa negara lebih dari Rp 160 triliun per tahun dan memangkas jutaan ton emisi gas rumah kaca sektor transportasi darat.",
            relatedCareers = listOf("Insinyur Bioenergi Terbarukan", "Analis Kalorimetri Bahan Bakar", "Spesialis Pengujian Mesin Otomotif"),
            verifiedSource = "Kementerian ESDM Ditjen EBTKE / Panduan Teknis Implementasi Bahan Bakar B35."
        ),
        homeLab = HomeLabData(
            title = "Membuat Kalorimeter Sederhana dari Gelas Kopi Styrofoam",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "2 buah gelas kopi styrofoam (insulator panas yang sangat baik)",
                "1 buah termometer ruangan/badan atau termometer digital dapur",
                "100 ml air keran biasa",
                "1 sendok makan soda kue (reaksi endoterm) ATAU 1 sendok deterjen bubuk (reaksi eksoterm)",
                "Sendok pengaduk plastik"
            ),
            steps = listOf(
                "Tumpuk dua gelas styrofoam untuk meningkatkan insulasi penahan panas.",
                "Tuangkan 100 ml air ke dalam gelas styrofoam, ukur suhu awal air T1 dengan termometer (misal 28°C).",
                "Uji 1 (Eksoterm): Masukkan 1 sendok deterjen bubuk ke dalam air, aduk cepat lalu tutup bagian atas gelas.",
                "Amati termometer: SUHU AIR NAIK MENJADI 34°C! (Reaksi eksotermik pelarutan melepaskan kalor ke air).",
                "Bilas gelas, isi 100 ml air baru (suhu 28°C).",
                "Uji 2 (Endoterm): Masukkan 1 sendok pupuk urea atau soda kue + cuka. Aduk dan amati termometer: SUHU AIR TURUN ANJLOK MENJADI 23°C! (Reaksi endotermik menyerap kalor dari air).",
                "Hitung kalor yang dilepas: q = m · c · ΔT = 100 g × 4,184 J/(g°C) × 6°C = 2.510 Joule!"
            ),
            observationGoal = "Mengukur secara kuantitatif perubahan suhu dan memahami konsep aliran kalor eksoterm vs endoterm pada kalorimeter sederhana.",
            connectionToSimulation = "Bandingkan grafik suhu kalorimetermu dengan simulator termokimia Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-tmk-1",
                prompt = "Diketahui data entalpi pembentukan standar: ΔHf° CO₂(g) = -394 kJ/mol, ΔHf° H₂O(g) = -242 kJ/mol, dan ΔHf° C₃H₈(g) = -104 kJ/mol. Berapakah perubahan entalpi reaksi pembakaran gas propana: C₃H₈(g) + 5 O₂(g) → 3 CO₂(g) + 4 H₂O(g)?",
                type = "numeric",
                correctAnswer = "-2046",
                tolerance = 2.0f,
                unit = "kJ",
                hints = listOf(
                    "ΔH = Σ ΔHf°(produk) - Σ ΔHf°(reaktan).",
                    "Produk = 3 × (-394) + 4 × (-242) = -1.182 - 968 = -2.150 kJ.",
                    "Reaktan = 1 × (-104) + 5 × (0) = -104 kJ.",
                    "ΔH = -2.150 - (-104) = -2.150 + 104 = ...?"
                ),
                explanation = "ΔH = [3(-394) + 4(-242)] - [-104 + 5(0)] = [-1.182 - 968] - [-104] = -2.150 + 104 = -2.046 kJ. Tanda negatif menunjukkan reaksi pembakaran eksotermik dahsyat.",
                misconception = "Lupa mengalikan ΔHf° dengan koefisien reaksi masing-masing molekul."
            ),
            QuizQuestion(
                id = "q-tmk-2",
                prompt = "Pernyataan manakah yang BENAR mengenai reaksi ENDOTERM?",
                type = "multiple_choice",
                options = listOf(
                    "Sistem menyerap kalor dari lingkungan sehingga nilai ΔH bernilai positif (+)",
                    "Sistem melepas kalor ke lingkungan sehingga suhu wadah terasa panas",
                    "Nilai entalpi produk lebih rendah daripada entalpi reaktan (ΔH < 0)",
                    "Reaksi selalu berlangsung sangat cepat meledak"
                ),
                correctAnswer = "Sistem menyerap kalor dari lingkungan sehingga nilai ΔH bernilai positif (+)",
                hints = listOf(
                    "Awalan 'endo' berarti masuk / ke dalam.",
                    "Kalor diserap masuk ke dalam sistem kimia sehingga entalpi sistem bertambah."
                ),
                explanation = "Pada reaksi endoterm, sistem menyerap energi kalor dari lingkungan (H_produk > H_reaktan) sehingga perubahan entalpi bertanda positif (ΔH > 0) dan suhu lingkungan mengalami penurunan.",
                misconception = "Tertukar antara eksoterm (melepas kalor, ΔH < 0) dan endoterm (menyerap kalor, ΔH > 0)."
            )
        )
    )

    // =========================================================================
    // 7. LAJU REAKSI & TEORI TUMBUKAN
    // =========================================================================
    private val lajuReaksiLesson = LessonData(
        conceptId = "kim-laju-reaksi",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "plr1",
                panelNumber = 1,
                title = "Gula Pasir vs Gula Batu di Cangkir Teh",
                caption = "Kakek memasukkan 1 sendok gula pasir halus ke cangkir teh Kirana, dan sebongkah gula batu padat ke cangkirnya sendiri.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Gula pasirku diaduk tiga kali langsung larut lenyap! Tapi gula batu Kakek masih keras dan butuh waktu lama untuk larut.",
                sceneVisualEmoji = "🫖",
                sceneDescription = "Gula butiran halus cepat larut dibanding bongkahan gula batu besar."
            ),
            StoryPanel(
                id = "plr2",
                panelNumber = 2,
                title = "Teori Tumbukan Efektif",
                caption = "Kakek menjelaskan konsep laju reaksi di tingkat partikel mikroskopis.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Makin halus butiran gula pasir, LUAS PERMUKAAN sentuhnya makin raksasa! Semakin luas bidang sentuh, peluang terjadinya TUMBUKAN EFEKTIF antar-molekul per detik melonjak drastis, sehingga reaksi berlangsung jauh lebih cepat!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Partikel-partikel bertumbukan dengan orientasi tepat dan energi kinetik cukup."
            ),
            StoryPanel(
                id = "plr3",
                panelNumber = 3,
                title = "Katalis: Terowongan Penembus Gunung",
                caption = "Dimas menganalogikan energi aktivasi dengan jalur terowongan kereta Whoosh menembus bukit.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Energi Aktivasi (Ea) seperti bukit tinggi yang harus didaki molekul agar bisa bereaksi. KATALISATOR bertindak bagaikan terowongan jalan pintas yang menurunkan bukit Ea tersebut, sehingga reaksi melesat jutaan kali lebih cepat tanpa katalis ikut habis terkonsumsi!",
                sceneVisualEmoji = "⛰️",
                sceneDescription = "Grafik profil energi menunjukkan katalis menurunkan puncak bukit energi aktivasi Ea."
            )
        ),
        intuitionTitle = "Kinetika Reaksi: Tumbukan, Energi Aktivasi & Hukum Laju",
        intuitionBody = "Laju reaksi kimia mengukur berkurangnya konsentrasi reaktan atau bertambahnya konsentrasi produk per satuan waktu (v = -d[R]/dt = +d[P]/dt):\n\n" +
                "1. Teori Tumbukan Efektif:\n" +
                "   • Reaksi terjadi HANYA JIKA partikel bertumbukan dengan:\n" +
                "     a) Orientasi posisi tumbukan yang tepat.\n" +
                "     b) Energi kinetik yang cukup untuk melampaui Energi Aktivasi (E_a).\n\n" +
                "2. Empat Faktor Penentu Laju Reaksi:\n" +
                "   • Konsentrasi: Makin pekat larutan, partikel makin rapat, frekuensi tumbukan makin tinggi.\n" +
                "   • Luas Permukaan Bidang Sentuh: Bentuk serbuk/halus bereaksi jauh lebih cepat dibanding kepingan padat.\n" +
                "   • Suhu: Setiap kenaikan suhu 10°C, laju reaksi umumnya meningkat 2 hingga 3 kali lipat (karena fraksi molekul berenergi ≥ Ea bertambah banyak).\n" +
                "   • Katalis: Menurunkan energi aktivasi (Ea) dengan menyediakan mekanisme alternatif.\n\n" +
                "3. Persamaan Laju Reaksi & Orde Reaksi:\n" +
                "   v = k · [A]^m · [B]^n.\n" +
                "   • Orde Reaksi (m, n) HANYA DAPAT DITENTUKAN LEWAT EKSPERIMEN laboratorium, BUKAN dari koefisien reaksi setara!\n" +
                "   • Orde 0: Laju tidak bergantung pada konsentrasi reaktan (v = k).\n" +
                "   • Orde 1: Konsentrasi dilipat 2×, laju ikut naik 2×.\n" +
                "   • Orde 2: Konsentrasi dilipat 2×, laju melompat naik 4× (2²).",
        intuitionPoints = listOf(
            "Menyimpan makanan di kulkas memperlambat pembusukan karena suhu dingin menurunkan laju reaksi oksidasi dan enzim bakteri.",
            "Katalisator tidak mengubah nilai perubahan entalpi reaksi (ΔH) sama sekali; katalis hanya mempercepat laju pencapaian kesetimbangan.",
            "Katalis konverter knalpot mobil menggunakan platinum dan paladium untuk mengubah gas beracun CO dan NOx menjadi CO₂ dan N₂ aman dalam sekejap milidetik."
        ),
        simId = "sim-reaction-rates",
        formulas = listOf(
            FormulaCard(
                symbol = "v = k[A]^m[B]^n",
                equation = "v = k [A]^m [B]^n",
                meaning = "Persamaan hukum laju reaksi dengan konstanta laju k dan orde reaksi m dan n.",
                units = "M/s (molar per detik)",
                applicationNote = "Orde total reaksi = m + n. Satuan k bergantung pada orde total."
            ),
            FormulaCard(
                symbol = "v_T (\\text{Aturan 10}^\\circ\\text{C})",
                equation = "v_{T_2} = v_{T_1} \\times 2^{\\frac{T_2 - T_1}{10}} \\quad , \\quad t_{T_2} = t_{T_1} \\times \\left(\\frac{1}{2}\\right)^{\\frac{T_2 - T_1}{10}}",
                meaning = "Peningkatan laju reaksi dan pemendekan waktu reaksi akibat kenaikan suhu.",
                units = "Laju (M/s) & Waktu (sekon)",
                applicationNote = "Jika laju naik n kali, maka waktu tempuh reaksi t menyusut 1/n kali."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Katalitik Konverter Gas Buang Motor Standar Emisi Euro 4 Indonesia",
            context = "Sejak 2021, pemerintah Indonesia mewajibkan semua sepeda motor baru lolos uji emisi Euro-4 untuk menekan polusi udara perkotaan.",
            engineeringProblem = "Gas buang knalpot mengandung karbon monoksida (CO) dan hidrokarbon sisa pembakaran yang membutuhkan waktu berjam-jam untuk terurai di udara bebas.",
            physicalConceptUsed = "Katalisis heterogen permukaan logam mulia Platinum-Rhodium (Pt-Rh) pada sarang lebah keramik knalpot.",
            mathematicalModel = "Permukaan katalis menurunkan energi aktivasi reaksi oksidasi: 2 CO + O₂ → 2 CO₂ dari 240 kJ/mol menjadi hanya 40 kJ/mol, sehingga konversi gas beracun berlangsung tuntas dalam waktu kontak gas hanya 0,05 detik saat melintasi knalpot.",
            realWorldImpact = "Memangkas emisi gas beracun knalpot kendaraan bermotor hingga 80% dan membersihkan langit Jakarta.",
            relatedCareers = listOf("Insinyur Sistem Emisi Gas Buang", "Ahli Rekayasa Katalis Otomotif", "Inspektur Uji Emisi Transportasi"),
            verifiedSource = "Kementerian Perindustrian RI / Regulasi Standar Emisi Euro 4 Kendaraan Bermotor."
        ),
        homeLab = HomeLabData(
            title = "Uji Pengaruh Suhu & Luas Permukaan pada Laju Reaksi Tablet Effervescent (Vitamin C)",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "3 tablet vitamin C effervescent (misal CDR atau Redoxon)",
                "3 gelas bening berisi volume air sama (150 ml)",
                "Gelas 1: Air es dingin (suhu ~10°C)\n• Gelas 2: Air keran suhu ruang (~28°C)\n• Gelas 3: Air hangat (~50°C)",
                "Stopwatch di smartphone"
            ),
            steps = listOf(
                "Uji Pengaruh Suhu: Masukkan 1 tablet utuh ke Gelas 1 (air dingin) dan nyalakan stopwatch. Catat waktu hingga gelembung effervescent berhenti total (misal 95 detik).",
                "Ulangi untuk Gelas 2 (air ruang): amati waktu larut lebih cepat (misal 50 detik).",
                "Ulangi untuk Gelas 3 (air hangat): amati tablet mendesis sangat kencang dan larut tuntas sekejap (misal 22 detik)! (Suhu tinggi melipatgandakan laju reaksi).",
                "Uji Pengaruh Luas Permukaan: Ambil 1 tablet baru, tumbuk halus menjadi serbuk.",
                "Masukkan serbuk ke segelas air keran: amati serbuk larut 3 kali lebih cepat dibanding tablet utuh padat!"
            ),
            observationGoal = "Membuktikan secara nyata pengaruh faktor suhu dan luas bidang sentuh permukaan terhadap laju reaksi kimia.",
            connectionToSimulation = "Bandingkan grafik waktu larut tabletmu dengan kurva kinetika di simulator laju reaksi Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-lr-1",
                prompt = "Pada suatu reaksi kimia, setiap kenaikan suhu 10°C laju reaksi menjadi 2 kali lebih cepat. Jika pada suhu 30°C suatu reaksi membutuhkan waktu 80 detik, berapakah waktu yang dibutuhkan reaksi tersebut pada suhu 50°C?",
                type = "numeric",
                correctAnswer = "20",
                tolerance = 0.5f,
                unit = "detik",
                hints = listOf(
                    "Hitung kenaikan suhu: ΔT = 50°C - 30°C = 20°C.",
                    "Kenaikan suhu terjadi sebanyak: n = 20 / 10 = 2 kali.",
                    "Laju naik 2² = 4 kali lipat, maka waktu reaksi menyusut menjadi: t = 80 / 4 = ...?"
                ),
                explanation = "Kenaikan suhu ΔT = 20°C berarti terjadi 2 kali kenaikan 10°C. Laju reaksi meningkat 2² = 4 kali lipat. Karena waktu berbanding terbalik dengan laju, maka waktu reaksi t = 80 detik / 4 = 20 detik.",
                misconception = "Mengalikan waktu dengan 4 (mengira waktu bertambah lama saat dipanaskan)."
            ),
            QuizQuestion(
                id = "q-lr-2",
                prompt = "Peran utama suatu KATALISATOR dalam mempercepat jalannya suatu reaksi kimia adalah dengan cara...",
                type = "multiple_choice",
                options = listOf(
                    "Menurunkan energi aktivasi (Ea) reaksi",
                    "Menaikkan nilai perubahan entalpi (ΔH) reaksi",
                    "Memperbesar konsentrasi zat reaktan",
                    "Meningkatkan suhu sistem reaksi secara drastis"
                ),
                correctAnswer = "Menurunkan energi aktivasi (Ea) reaksi",
                hints = listOf(
                    "Katalis menyediakan jalan pintas alternatif.",
                    "Mengurangi tinggi bukit energi yang harus dilewati molekul."
                ),
                explanation = "Katalisator mempercepat reaksi dengan cara menyediakan jalur mekanisme reaksi alternatif yang memiliki energi aktivasi (Ea) lebih rendah, sehingga lebih banyak molekul yang mampu bereaksi.",
                misconception = "Mengira katalis mengubah nilai ΔH atau ikut habis bereaksi menjadi produk."
            )
        )
    )

    // =========================================================================
    // 8. KESETIMBANGAN KIMIA & AZAS LE CHATELIER
    // =========================================================================
    private val kesetimbanganLesson = LessonData(
        conceptId = "kim-kesetimbangan",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pks1",
                panelNumber = 1,
                title = "Jalan Tol Dua Arah yang Ramai",
                caption = "Dimas memperhatikan gerbang tol Cikampek Utama di mana mobil melintas ke timur dan ke barat dengan jumlah yang sama banyak tiap menit.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Lalu lintasnya ramai sekali bergerak bolak-balik, tapi jumlah total mobil di Jakarta dan di Bandung tampak stabil seimbang!",
                sceneVisualEmoji = "🛣️",
                sceneDescription = "Gerbang tol dengan arus kendaraan dua arah yang seimbang dan dinamis."
            ),
            StoryPanel(
                id = "pks2",
                panelNumber = 2,
                title = "Kesetimbangan Dinamis Kimia",
                caption = "Kakek menjelaskan konsep kesetimbangan kimia reversibel (bolak-balik).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kesetimbangan kimia BUKAN berarti reaksi berhenti! Molekul reaktan terus berubah menjadi produk, dan pada saat yang sama molekul produk terurai kembali menjadi reaktan dengan LAJU YANG PERSIS SAMA (v_maju = v_balik). Secara kasat mata konsentrasi zat tampak konstan, tapi di tingkat partikel mereka menari tanpa henti!",
                sceneVisualEmoji = "⚖️",
                sceneDescription = "Dua panah bolak-balik berkecepatan identik melambangkan kesetimbangan dinamis."
            ),
            StoryPanel(
                id = "pks3",
                panelNumber = 3,
                title = "Azas Perlawanan Le Chatelier",
                caption = "Kirana mengingat prinsip pergeseran kesetimbangan kimia industri.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Henri Le Chatelier merumuskan azas kelembaman kimia: 'Bila suatu sistem kesetimbangan diberikan aksi gangguan dari luar, sistem akan bergeser untuk MEMINIMALKAN efek gangguan tersebut!' Jika suhu dinaikkan, ia bergeser ke pihak endoterm untuk menyerap panas!",
                sceneVisualEmoji = "🔄",
                sceneDescription = "Timbangan kesetimbangan bergeser ke kanan untuk mengimbangi penambahan beban di sisi kiri."
            )
        ),
        intuitionTitle = "Keseimbangan Dinamis: Tetapan Kc/Kp & Respon Le Chatelier",
        intuitionBody = "Banyak reaksi kimia di alam bersifat reversibel (dapat balik) dan mencapai kesetimbangan dinamis:\n\n" +
                "1. Karakteristik Kesetimbangan Dinamis:\n" +
                "   • Reaksi berlangsung dua arah berlawanan dalam sistem tertutup.\n" +
                "   • Laju pembentukan produk sama dengan laju pembentukan reaktan (v_maju = v_balik).\n" +
                "   • Konsentrasi masing-masing komponen tetap konstan tidak berubah terhadap waktu.\n\n" +
                "2. Tetapan Kesetimbangan (Kc dan Kp):\n" +
                "   Untuk reaksi: a A(g) + b B(g) ⇌ c C(g) + d D(g)\n" +
                "   • Kc = ([C]^c · [D]^d) / ([A]^a · [B]^b).\n" +
                "   • HANYA ZAT BERFASE GAS (g) DAN LARUTAN (aq) yang masuk rumus Kc! Zat padat murni (s) dan cairan murni (l) DIABAIKAN (konsentrasi efektifnya 1).\n" +
                "   • Kp = (P_C^c · P_D^d) / (P_A^a · P_B^b) dengan hubungan Kp = Kc · (RT)^Δn (Δn = selisih koefisien gas kanan - kiri).\n\n" +
                "3. Azas Le Chatelier (Faktor Pergeseran Kesetimbangan):\n" +
                "   • Konsentrasi: Ditambah reaktan → bergeser ke arah PRODUK (kanan). Diambil reaktan → bergeser ke arah REAKTAN (kiri).\n" +
                "   • Tekanan & Volume: Tekanan DIPERBESAR (Volume mengecil) → bergeser ke arah KOEFISIEN GAS PALING KECIL.\n" +
                "   • Suhu: Suhu DINAIKKAN → bergeser ke arah REAKSI ENDOTERM (+ΔH). Suhu DITURUNKAN → bergeser ke arah EKSOTERM (-ΔH).",
        intuitionPoints = listOf(
            "Nilai tetapan kesetimbangan Kc HANYA DAPAT BERUBAH jika SUHU DIUBAH. Perubahan konsentrasi, tekanan, volume, atau penambahan katalis TIDAK MENGUBAH nilai Kc!",
            "Katalisator HANYA mempercepat tercapainya kondisi kesetimbangan, tetapi tidak menggeser posisi kesetimbangan sedikit pun.",
            "Jika nilai Kc >> 1 (sangat besar), berarti pada kesetimbangan campuran didominasi oleh produk (reaksi sangat condong ke kanan)."
        ),
        simId = "sim-equilibrium",
        formulas = listOf(
            FormulaCard(
                symbol = "K_c",
                equation = "K_c = \\frac{[\\text{Produk}]^\\text{koef}}{[\\text{Reaktan}]^\\text{koef}}",
                meaning = "Hukum aksi massa kesetimbangan konsentrasi fase gas dan aqueous.",
                units = "Bergantung selisih koefisien",
                applicationNote = "Zat padat murni (s) dan cair murni (l) tidak dimasukkan ke rumus Kc."
            ),
            FormulaCard(
                symbol = "K_p = K_c(RT)^{\\Delta n}",
                equation = "K_p = K_c (R \\cdot T)^{\\Delta n} \\quad , \\quad \\Delta n = \\Sigma \\text{koef gas kanan} - \\Sigma \\text{koef gas kiri}",
                meaning = "Hubungan tetapan kesetimbangan tekanan parsial Kp dengan Kc.",
                units = "-",
                applicationNote = "R = 0,08206 L·atm/(mol·K). T dalam Kelvin."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Aplikasi Azas Le Chatelier pada Sintesis Amonia Pabrik Pupuk Sriwidjaja (Pusri) Palembang",
            context = "PT Pupuk Sriwidjaja Palembang mengoperasikan reaktor Haber-Bosch untuk memproduksi gas amonia: N₂(g) + 3 H₂(g) ⇌ 2 NH₃(g) ΔH = -92 kJ.",
            engineeringProblem = "Reaksi bersifat eksotermik (melepas panas) dan menghasilkan penurunan mol gas (4 mol reaktan gas menjadi 2 mol produk gas). Suhu terlalu tinggi menggeser reaksi ke kiri (amonia terurai), namun suhu terlalu rendah membuat laju reaksi sangat lambat membeku.",
            physicalConceptUsed = "Optimasi kompromi Azas Le Chatelier: Tekanan super tinggi 200–300 atm untuk mendorong kesetimbangan ke arah kanan (koefisien gas kecil), suhu moderat 450°C, serta penambahan katalis besi promoted Fe/K₂O.",
            mathematicalModel = "Insinyur proses secara kontinu mengkondensasikan gas amonia cair NH₃ keluar dari siklus reaksi untuk menjaga konsentrasi produk tetap rendah, sehingga kesetimbangan terus terdorong memproduksi amonia tanpa henti.",
            realWorldImpact = "Menghasilkan lebih dari 2 juta ton pupuk urea berkualitas tinggi per tahun yang menopang ketahanan pangan beras di seluruh Sumatera.",
            relatedCareers = listOf("Insinyur Desain Reaktor Kimia", "Operator Panel DCS Pabrik Amonia", "Pakar Optimasi Termodinamika Industri"),
            verifiedSource = "PT Pupuk Sriwidjaja (Pusri) Palembang / Laporan Keberlanjutan Proses Pabrik Pusri-IIB."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Pergeseran Kesetimbangan dengan 2 Gelas & Sedotan Plastik",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "2 gelas plastik bening: Gelas A (Reaktan) diisi 200 ml air berwarna sirup, Gelas B (Produk) kosong",
                "2 buah sedotan minuman plastik berdiameter sama",
                "Penggaris untuk mengukur ketinggian air di kedua gelas"
            ),
            steps = listOf(
                "Celupkan sedotan 1 ke Gelas A, tutup ujung atas sedotan dengan jari telunjuk, lalu pindahkan air yang terperangkap ke Gelas B (simulasi reaksi maju A → B).",
                "Bersamaan dengan itu, celupkan sedotan 2 ke Gelas B, tutup dengan jari, lalu pindahkan air yang terperangkap kembali ke Gelas A (simulasi reaksi balik B → A).",
                "Ulangi siklus pemindahan bolak-balik ini secara teratur sebanyak 25 kali.",
                "Amati ketinggian air di kedua gelas: mula-mula air di Gelas B bertambah banyak. Tetapi setelah sekitar 15 siklus, KETINGGIAN AIR DI KEDUA GELAS MENCAPAI ANGKA KONSTAN YANG TIDAK BERUBAH LAGI!",
                "Sekarang simulasikan 'Gangguan Le Chatelier': tambahkan 50 ml air ke Gelas A. Ulangi siklus 10 kali lagi: amati air otomatis terdistribusi menggeser kesetimbangan ke Gelas B!"
            ),
            observationGoal = "Memahami konsep kesetimbangan dinamis: meskipun perpindahan air terus berlangsung bolak-balik, volume di kedua wadah tetap konstan.",
            connectionToSimulation = "Bandingkan volume air sedotan dengan kurva konsentrasi di simulator kesetimbangan Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ks-1",
                prompt = "Perhatikan reaksi kesetimbangan endoterm berikut: 2 SO₃(g) ⇌ 2 SO₂(g) + O₂(g)  ΔH = +198 kJ. Perlakuan manakah yang akan menggeser kesetimbangan ke arah KANAN (menghasilkan lebih banyak gas SO₂)?",
                type = "multiple_choice",
                options = listOf(
                    "Menaikkan suhu sistem",
                    "Memperbesar tekanan sistem",
                    "Menambahkan gas oksigen (O₂)",
                    "Menurunkan suhu sistem"
                ),
                correctAnswer = "Menaikkan suhu sistem",
                hints = listOf(
                    "Reaksi ke kanan memiliki nilai ΔH positif (endoterm).",
                    "Menurut Azas Le Chatelier, menaikkan suhu akan menggeser kesetimbangan ke arah reaksi endoterm."
                ),
                explanation = "Karena reaksi ke kanan bersifat endoterm (ΔH = +198 kJ), menaikkan suhu akan memicu sistem menyerap kelebihan panas dengan bergeser ke arah endoterm, yaitu ke arah kanan menghasilkan lebih banyak produk.",
                misconception = "Mengira menaikkan tekanan menggeser ke kanan, padahal di kanan ada 3 mol gas sedangkan di kiri hanya 2 mol gas."
            ),
            QuizQuestion(
                id = "q-ks-2",
                prompt = "Rumus tetapan kesetimbangan konsentrasi (Kc) yang BENAR untuk reaksi heterogen: CaCO₃(s) ⇌ CaO(s) + CO₂(g) adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Kc = [CO₂]",
                    "Kc = ([CaO] · [CO₂]) / [CaCO₃]",
                    "Kc = [CaO] / [CaCO₃]",
                    "Kc = [CaCO₃] / [CO₂]"
                ),
                correctAnswer = "Kc = [CO₂]",
                hints = listOf(
                    "Ingat aturan emas Kc: zat padat murni (solid / s) TIDAK BOLEH dimasukkan ke rumus Kc!",
                    "CaCO₃ dan CaO berfase padat (s)."
                ),
                explanation = "Zat berfase padat murni (s) memiliki konsentrasi efektif konstan bernilai 1 sehingga tidak dimasukkan ke dalam persamaan Kc. Oleh karena itu, Kc hanya bergantung pada konsentrasi gas CO₂, yaitu Kc = [CO₂].",
                misconception = "Memasukkan zat padat CaCO₃ dan CaO ke dalam rumus Kc."
            )
        )
    )

    // =========================================================================
    // 9. TEORI ASAM-BASA, BUFFER & HIDROLISIS GARAM
    // =========================================================================
    private val asamBasaLanjutLesson = LessonData(
        conceptId = "kim-asam-basa-lanjut",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pabl1",
                panelNumber = 1,
                title = "Benteng Pertahanan Darah Manusia",
                caption = "Dimas minum sebotol minuman bersoda yang sangat asam (pH ≈ 2,5) setelah berolahraga lari.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Minuman ini sangat asam, tapi kenapa pH darah di tubuh kita tetap stabil di angka 7,4 dan kita tidak jatuh pingsan?",
                sceneVisualEmoji = "🩸",
                sceneDescription = "Sistem peredaran darah manusia mempertahankan pH stabil 7,35 - 7,45."
            ),
            StoryPanel(
                id = "pabl2",
                panelNumber = 2,
                title = "Sistem Penyangga (Buffer) Karbonat",
                caption = "Kakek menjelaskan mekanisme larutan penyangga (buffer) bikarbonat di dalam plasma darah.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Darah kita memiliki Sistem Buffer Karbonat (H₂CO₃ / HCO₃⁻)! Jika ada asam masuk, ion bikarbonat HCO₃⁻ langsung menyerap kelebihan ion H⁺. Jika ada basa masuk, asam karbonat H₂CO₃ langsung menetralkannya! Perubahan pH diredam secara ajaib!",
                sceneVisualEmoji = "🛡️",
                sceneDescription = "Diagram kesetimbangan asam lemah dan basa konjugasi meredam lonjakan asam basa."
            ),
            StoryPanel(
                id = "pabl3",
                panelNumber = 3,
                title = "Hidrolisis Garam & Kurva Titrasi",
                caption = "Kirana melakukan titrasi asam cuka dengan larutan standar NaOH di laboratorium.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Saat titik ekuivalen tercapai, larutan garam natrium asetat (CH₃COONa) yang terbentuk ternyata memiliki pH > 7 (bersifat basa)! Ini karena anion asetat CH₃COO⁻ terhidrolisis oleh air menghasilkan ion OH⁻!",
                sceneVisualEmoji = "📊",
                sceneDescription = "Kurva titrasi sigmoid dengan titik ekuivalen pada pH 8,7 akibat hidrolisis parsial garam basa."
            )
        ),
        intuitionTitle = "Kimia Larutan Lanjut: Buffer, Hidrolisis & Tiga Teori Asam-Basa",
        intuitionBody = "Pemahaman modern tentang asam dan basa melampaui sekadar rasa asam di lidah:\n\n" +
                "1. Tiga Teori Fondasi Asam-Basa:\n" +
                "   • Teori Arrhenius: Asam melepas H⁺ dalam air; Basa melepas OH⁻ dalam air.\n" +
                "   • Teori Brønsted-Lowry: Asam adalah Donor Proton (H⁺); Basa adalah Akseptor Proton (H⁺). Membentuk Pasangan Asam-Basa Konjugasi (contoh: NH₃ basa + H₂O asam ⇌ NH₄⁺ asam konjugasi + OH⁻ basa konjugasi).\n" +
                "   • Teori Lewis: Asam adalah Akseptor Pasangan Elektron Bebas; Basa adalah Donor Pasangan Elektron Bebas (menjelaskan reaksi tanpa proton seperti BF₃ + NH₃).\n\n" +
                "2. Larutan Penyangga (Buffer):\n" +
                "   • Mampu mempertahankan pH larutan saat ditambah sedikit asam kuat, basa kuat, atau diencerkan.\n" +
                "   • Buffer Asam: Campuran Asam Lemah + Basa Konjugasinya (CH₃COOH + CH₃COO⁻Na⁺) => [H⁺] = Ka · (mol asam / mol garam).\n" +
                "   • Buffer Basa: Campuran Basa Lemah + Asam Konjugasinya (NH₃ + NH₄Cl) => [OH⁻] = Kb · (mol basa / mol garam).\n\n" +
                "3. Hidrolisis Garam (Reaksi Ion Garam dengan Air):\n" +
                "   • Asam Kuat + Basa Kuat (NaCl): Tidak terhidrolisis, pH = 7,0 (Netral).\n" +
                "   • Asam Lemah + Basa Kuat (CH₃COONa): Anion terhidrolisis, menghasilkan OH⁻, pH > 7 (Basa).\n" +
                "   • Asam Kuat + Basa Lemah (NH₄Cl): Kation terhidrolisis, menghasilkan H⁺, pH < 7 (Asam).\n" +
                "   • Asam Lemah + Basa Lemah (CH₃COONH₄): Terhidrolisis total, sifat pH bergantung perbandingan Ka vs Kb.",
        intuitionPoints = listOf(
            "Persamaan Henderson-Hasselbalch: pH = pKa + log([Basa Konjugasi] / [Asam Lemah]).",
            "Kapasitas buffer paling maksimal terjadi ketika mol asam lemah sama dengan mol basa konjugasinya (pH = pKa).",
            "Titik Ekuivalen titrasi asam lemah dengan basa kuat TIDAK berada di pH 7, melainkan berada di pH > 7 (antara 8–9) akibat peristiwa hidrolisis garam."
        ),
        simId = "sim-acid-base",
        formulas = listOf(
            FormulaCard(
                symbol = "[H^+] (\\text{Buffer})",
                equation = "[H^+] = K_a \\times \\frac{n_{\\text{asam}}}{n_{\\text{garam}}} \\quad \\implies \\text{pH} = \\text{p}K_a + \\log\\frac{n_{\\text{garam}}}{n_{\\text{asam}}}",
                meaning = "Persamaan Henderson-Hasselbalch larutan penyangga asam.",
                units = "Molar (M) & pH",
                applicationNote = "n adalah mol komponen asam lemah dan garam basa konjugasi."
            ),
            FormulaCard(
                symbol = "[OH^-] (\\text{Hidrolisis})",
                equation = "[OH^-] = \\sqrt{\\frac{K_w}{K_a} \\times M_{\\text{anion}}}",
                meaning = "Konsentrasi ion hidroksida akibat hidrolisis garam dari asam lemah dan basa kuat.",
                units = "Molar (M)",
                applicationNote = "Kw = 10⁻¹⁴ pada 25°C. Manion adalah konsentrasi ion terhidrolisis."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sistem Dialisis Hemodialisa Cuci Darah Pasien Gagal Ginjal RS Cipto Mangunkusumo (RSCM)",
            context = "Pasien gagal ginjal kronis di RSCM Jakarta menjalani terapi cuci darah rutin untuk membuang racun metabolik ureum dan asam berlebih.",
            engineeringProblem = "Tubuh pasien memproduksi ion asam H⁺ hasil metabolisme setiap detik. Jika ginjal rusak, asidosis metabolik fatal (pH darah drop < 7,1) dapat menyebabkan koma dan henti jantung.",
            physicalConceptUsed = "Prinsip larutan penyangga bikarbonat dan kesetimbangan difusi dialisis membran semipermeabel.",
            mathematicalModel = "Mesin dialisis mengalirkan cairan dialisat yang diperkaya natrium bikarbonat (NaHCO₃ konsentrasi 35 mmol/L). Ion bikarbonat berdifusi menembus membran kapiler ke dalam darah pasien, memulihkan sistem buffer karbonat alami dan menstabilkan pH darah pada 7,38.",
            realWorldImpact = "Menyelamatkan nyawa puluhan ribu pasien gagal ginjal terminal di seluruh Indonesia dan mempertahankan kualitas hidup aktif harian.",
            relatedCareers = listOf("Nefrologis Konsultan Ginjal", "Insinyur Biomedis Mesin Dialisis", "Perawat Mahir Hemodialisa"),
            verifiedSource = "Perhimpunan Nefrologi Indonesia (PERNEFRI) / Pedoman Layanan Dialisis RSCM."
        ),
        homeLab = HomeLabData(
            title = "Menguji Ketahanan pH Larutan Penyangga vs Air Biasa Saat Ditetesi Cuka",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Gelas 1 (Air Biasa): 100 ml air keran biasa",
                "Gelas 2 (Larutan Penyangga Rumah Tangga): 50 ml cuka dapur + 1 sendok teh soda kue (membentuk buffer CH₃COOH / CH₃COO⁻Na)",
                "Indikator alami ekstrak kunyit atau air kol ungu",
                "Cuka dapur tambahan untuk pengujian dan pipet/sendok tetes"
            ),
            steps = listOf(
                "Tambahkan 1 sendok ekstrak kunyit atau kol ungu ke dalam Gelas 1 dan Gelas 2.",
                "Teteskan 5 tetes cuka ke Gelas 1 (air biasa). Amati: warna langsung berubah drastis seketika karena air biasa tidak punya penyangga peredam pH!",
                "Sekarang teteskan 5 tetes cuka ke Gelas 2 (larutan buffer). Amati: WARNA SAMA SEKALI TIDAK BERUBAH!",
                "Tambahkan lagi 10 tetes cuka ke Gelas 2: warna tetap bertahan stabil tidak bergeming!",
                "Simpulkan bagaimana campuran asam cuka dan soda kue bertindak sebagai larutan penyangga meredam lonjakan asam."
            ),
            observationGoal = "Menyaksikan secara visual kehebatan larutan buffer dalam mempertahankan kestabilan pH dibanding air biasa yang pH-nya langsung anjlok saat ditambah asam.",
            connectionToSimulation = "Bandingkan kurva ketahanan pH dengan simulator titrasi buffer Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-abl-1",
                prompt = "Pasangan senyawa berikut yang dapat membentuk LARUTAN PENYANGGA (BUFFER) bersifat asam adalah...",
                type = "multiple_choice",
                options = listOf(
                    "CH₃COOH (asam asetat) dan CH₃COONa (natrium asetat)",
                    "HCl (asam klorida) dan NaCl (natrium klorida)",
                    "NaOH (natrium hidroksida) dan NaCl",
                    "NH₃ (amonia) dan NH₄Cl (amonium klorida)"
                ),
                correctAnswer = "CH₃COOH (asam asetat) dan CH₃COONa (natrium asetat)",
                hints = listOf(
                    "Buffer asam terdiri dari campuran ASAM LEMAH dan BASA KONJUGASINYA (garamnya).",
                    "HCl adalah asam kuat (tidak bisa membentuk buffer).",
                    "NH₃ dan NH₄Cl membentuk buffer basa."
                ),
                explanation = "Larutan penyangga asam terbentuk dari campuran asam lemah (CH₃COOH) dan basa konjugasinya dari garamnya (CH₃COO⁻ dari CH₃COONa). HCl adalah asam kuat sehingga tidak dapat membentuk larutan penyangga.",
                misconception = "Mengira campuran asam kuat dengan garamnya (seperti HCl + NaCl) dapat membentuk larutan penyangga."
            ),
            QuizQuestion(
                id = "q-abl-2",
                prompt = "Suatu larutan penyangga mengandung 0,1 mol asam asetat (Ka = 10⁻⁵) dan 0,1 mol natrium asetat dalam 1 liter air. Berapakah nilai pH larutan penyangga tersebut?",
                type = "numeric",
                correctAnswer = "5",
                tolerance = 0.1f,
                unit = "pH",
                hints = listOf(
                    "Gunakan rumus [H⁺] = Ka × (mol asam / mol garam).",
                    "[H⁺] = 10⁻⁵ × (0,1 / 0,1) = 10⁻⁵ × 1 = 10⁻⁵ M.",
                    "pH = -log[H⁺] = -log(10⁻⁵) = ...?"
                ),
                explanation = "[H⁺] = Ka · (nasam / ngaram) = 10⁻⁵ · (0,1 / 0,1) = 10⁻⁵ M. Maka pH = -log(10⁻⁵) = 5. Saat mol asam sama dengan mol garam, pH = pKa.",
                misconception = "Lupa bahwa log(1) = 0 sehingga pH sama persis dengan pKa."
            )
        )
    )

    // =========================================================================
    // 10. KELARUTAN & HASIL KALI KELARUTAN (Ksp)
    // =========================================================================
    private val kelarutanKspLesson = LessonData(
        conceptId = "kim-kelarutan-ksp",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pksp1",
                panelNumber = 1,
                title = "Stalaktit Gua Maharani Lamongan",
                caption = "Keluarga Kirana menyusuri keindahan stalaktit dan stalagmit kristal kapur yang menggantung megah di atap Gua Maharani Jawa Timur.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Batu-batu kristal kapur ini tumbuh perlahan menetes dari langit-langit gua selama ribuan tahun! Dari mana batuan kristal ini berasal?",
                sceneVisualEmoji = "🪨",
                sceneDescription = "Stalaktit kapur berkilau menggantung di langit-langit gua terbentuk dari tetesan kalsium karbonat."
            ),
            StoryPanel(
                id = "pksp2",
                panelNumber = 2,
                title = "Batas Jenuh & Tetapan Ksp",
                caption = "Kakek menjelaskan konsep kesetimbangan kelarutan garam sukar larut.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Air hujan melarutkan batu kapur CaCO₃. Di dalam gua, air menguap sehingga hasil kali konsentrasi ion [Ca²⁺][CO₃²⁻] melampaui batas jenuhnya: Tetapan Hasil Kali Kelarutan (Ksp)! Begitu Qsp > Ksp, ion-ion kapur mengendap memadat membentuk batuan stalaktit!",
                sceneVisualEmoji = "💧",
                sceneDescription = "Tetesan air kapur mengendap membentuk butiran kristal padat saat melampaui Ksp."
            ),
            StoryPanel(
                id = "pksp3",
                panelNumber = 3,
                title = "Pengaruh Ion Sejenis (Common Ion)",
                caption = "Kirana melakukan percobaan di laboratorium kimia sekolah.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jika ke dalam larutan jenuh garam perak klorida (AgCl) kita tambahkan sedikit garam dapur NaCl, endapan putih AgCl mendadak muncul semakin banyak! Ion sejenis Cl⁻ menggeser kesetimbangan ke arah padatan dan MEMPERKECIL kelarutannya!",
                sceneVisualEmoji = "🧪",
                sceneDescription = "Endapan putih AgCl mengendap di dasar tabung reaksi saat ditambah ion sejenis Cl-."
            )
        ),
        intuitionTitle = "Batas Kejenuhan Larutan: Ksp, Ion Sejenis & Pengendapan",
        intuitionBody = "Ksp (Solubility Product Constant) mengukur batas kejenuhan garam yang sukar larut dalam air:\n\n" +
                "1. Hubungan Kelarutan Molar (s) dan Tetapan Ksp:\n" +
                "   Untuk garam biner A_x B_y(s) ⇌ x A^{y+}(aq) + y B^{x-}(aq)\n" +
                "   • Ksp = [A^{y+}]^x · [B^{x-}]^y = (x·s)^x · (y·s)^y = x^x · y^y · s^{x+y}.\n" +
                "   • Garam 1 : 1 (AgCl, BaSO₄): Ksp = s² => s = √Ksp.\n" +
                "   • Garam 1 : 2 (CaF₂, Ag₂CrO₄): Ksp = 4 s³ => s = ∛(Ksp / 4).\n" +
                "   • Garam 1 : 3 (Al(OH)₃): Ksp = 27 s⁴.\n\n" +
                "2. Pengaruh Ion Sejenis (Common Ion Effect):\n" +
                "   • Adanya ion sejenis di dalam pelarut akan MENURUNKAN kelarutan garam secara drastis (menggeser kesetimbangan ke kiri sesuai Le Chatelier).\n" +
                "   • Contoh: Kelarutan AgCl dalam larutan NaCl jauh lebih kecil dibanding dalam air murni.\n\n" +
                "3. Prediksi Terbentuknya Endapan (Kriteria Qsp vs Ksp):\n" +
                "   • Qsp < Ksp: Larutan BELUM JENUH (tidak ada endapan terbentuk, zat masih bisa larut).\n" +
                "   • Qsp = Ksp: Larutan TEPAT JENUH (titik batas mulai terbentuk endapan).\n" +
                "   • Qsp > Ksp: Larutan LEWAT JENUH (terjadi PENGENDAPAN padatan kristal).",
        intuitionPoints = listOf(
            "Kelarutan s dinyatakan dalam satuan mol/Liter atau gram/Liter.",
            "Garam hidroksida seperti Fe(OH)₃ dan Mg(OH)₂ kelarutannya sangat dipengaruhi oleh pH: pada pH tinggi (suasana basa kaya ion OH⁻), garam hidroksida makin mudah mengendap.",
            "Metode Pengendapan Selektif banyak dipakai di industri pertambangan untuk memisahkan ion logam berharga dari pengotor bijih tambang."
        ),
        simId = "sim-solubility",
        formulas = listOf(
            FormulaCard(
                symbol = "K_{sp}",
                equation = "K_{sp} = [A^{y+}]^x [B^{x-}]^y = x^x y^y s^{x+y}",
                meaning = "Persamaan tetapan hasil kali kelarutan garam AxBy dengan kelarutan molar s.",
                units = "M^{(x+y)}",
                applicationNote = "Untuk AgCl (x=1, y=1) -> Ksp = s². Untuk CaF2 (x=1, y=2) -> Ksp = 4s³."
            ),
            FormulaCard(
                symbol = "Q_{sp}",
                equation = "Q_{sp} > K_{sp} \\implies \\text{Terbentuk Endapan}",
                meaning = "Kriteria termodinamika terjadinya pengendapan kristal padat.",
                units = "-",
                applicationNote = "Qsp dihitung dari perkalian konsentrasi ion sesaat setelah pencampuran larutan."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengolahan Air Asam Tambang (Acid Mine Drainage) Batubara Bukit Asam Tanjung Enim",
            context = "Aktivitas tambang batubara terbuka PT Bukit Asam menghasilkan air asam tambang beracun yang kaya akan ion besi terlarut Fe³⁺ dan ion sulfat.",
            engineeringProblem = "Ion besi terlarut Fe³⁺ mencemari Sungai Enim dan meracuni biota air jika tidak diendapkan sebelum dialirkan ke lingkungan umum.",
            physicalConceptUsed = "Prinsip hasil kali kelarutan Ksp hidroksida Fe(OH)₃ yang sangat kecil (Ksp = 10⁻³⁸) dan pengendapan selektif berbasis kontrol pH kapur tohor.",
            mathematicalModel = "Insinyur lingkungan menambahkan kapur tohor Ca(OH)₂ ke kolam pengendapan untuk menaikkan pH dari 3,0 menjadi 7,5. Pada pH 7,5 konsentrasi [OH⁻] = 10⁻⁶'⁵ M sehingga Qsp ion besi Fe³⁺ melampaui Ksp hingga jutaan kali lipat, mengendapkan 99,8% ion besi sebagai lumpur padat Fe(OH)₃ merah bata.",
            realWorldImpact = "Menjaga air Sungai Enim tetap jernih dan aman digunakan sebagai sumber air baku pertanian dan konsumsi masyarakat Sumatera Selatan.",
            relatedCareers = listOf("Insinyur Pengelolaan Lingkungan Tambang", "Ahli Geokimia Air Asam Tambang", "Operator Instalasi Penjernihan Air"),
            verifiedSource = "PT Bukit Asam Tbk / Laporan Pengelolaan Lingkungan Hidup AMDAL Tambang Tanjung Enim."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Reaksi Pengendapan Kapur Menggunakan Air Kapur Sirih & Hembusan Nafas",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 sendok makan kapur sirih (kalsium hidroksida Ca(OH)₂)",
                "1 botol air bening (200 ml) dan saringan kain/kertas tisu",
                "1 gelas bening kecil",
                "1 sedotan minuman plastik"
            ),
            steps = listOf(
                "Larutkan kapur sirih ke dalam air, aduk lalu biarkan mengendap selama 1 jam hingga cairan di atasnya BENING JERNIH (Air Kapur jenuh).",
                "Saring air kapur jenuh bening tersebut ke dalam gelas plastik kecil transparan.",
                "Ambil sedotan minuman, celupkan ke dalam air kapur bening.",
                "Tiuplah air kapur perlahan-lahan menggunakan hembusan nafasmu (hembusan nafas kita kaya gas CO₂) selama 30-60 detik.",
                "AMATI: AIR KAPUR YANG SEMULA BENING BERUBAH MENJADI KERUH PUTIH SUSU PENUH ENDAPAN!",
                "Penjelasan: Reaksi Ca(OH)₂ + CO₂ → CaCO₃(s) + H₂O. Kalsium karbonat memiliki Ksp sangat mini sehingga seketika mengkristal putih keruh!"
            ),
            observationGoal = "Menyaksikan secara visual pembentukan endapan saat hasil kali ion Qsp melampaui tetapan kelarutan Ksp.",
            connectionToSimulation = "Bandingkan endapan kapurmu dengan simulator kejenuhan garam Ksp Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ksp-1",
                prompt = "Suatu garam biner AgCl memiliki tetapan hasil kali kelarutan Ksp = 1 × 10⁻¹⁰. Berapakah kelarutan molar (s) garam AgCl dalam air murni?",
                type = "numeric",
                correctAnswer = "0.00001",
                tolerance = 0.000001f,
                unit = "mol/L",
                hints = listOf(
                    "AgCl terurai menjadi 1 ion Ag⁺ dan 1 ion Cl⁻ (tipe 1 : 1).",
                    "Ksp = s × s = s².",
                    "s = √Ksp = √(1 × 10⁻¹⁰) = 1 × 10⁻⁵ mol/L = 0,00001 mol/L."
                ),
                explanation = "Untuk garam AgCl: Ksp = s². Maka kelarutan s = √(Ksp) = √(1 × 10⁻¹⁰) = 1 × 10⁻⁵ mol/L (0,00001 mol/L).",
                misconception = "Lupa mengakar kuadratkan nilai Ksp."
            ),
            QuizQuestion(
                id = "q-ksp-2",
                prompt = "Bagaimanakah pengaruh penambahan garam dapur (NaCl) ke dalam larutan jenuh perak klorida (AgCl)?",
                type = "multiple_choice",
                options = listOf(
                    "Kelarutan AgCl semakin mengecil dan endapan bertambah banyak",
                    "Kelarutan AgCl semakin membesar dan larutan semakin jernih",
                    "Nilai tetapan Ksp AgCl ikut meningkat drastis",
                    "Tidak ada pengaruh sama sekali pada larutan"
                ),
                correctAnswer = "Kelarutan AgCl semakin mengecil dan endapan bertambah banyak",
                hints = listOf(
                    "NaCl menyumbangkan ion sejenis Cl⁻ ke dalam larutan.",
                    "Menurut azas kesetimbangan, penambahan ion sejenis menggeser reaksi ke arah padatan."
                ),
                explanation = "Penambahan ion sejenis Cl⁻ dari NaCl akan menggeser kesetimbangan ke arah pembentukan padatan AgCl (efek ion sejenis), sehingga kelarutan molar AgCl semakin mengecil dan endapan bertambah.",
                misconception = "Mengira penambahan garam lain akan selalu memperbesar kelarutan."
            )
        )
    )

    // =========================================================================
    // 11. SIFAT KOLIGATIF LARUTAN & HUKUM RAOULT
    // =========================================================================
    private val koligatifLesson = LessonData(
        conceptId = "kim-koligatif",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pklg1",
                panelNumber = 1,
                title = "Membuat Es Puter Tradisional",
                caption = "Penjual es puter keliling di Malioboro Yogyakarta memutar tabung logam berisi adonan santan di dalam ember kayu berisi es batu.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Penjual itu menaburkan berbungkus-bungkus garam kasar ke atas es batu di sekeliling tabung. Kenapa es batu harus diberi garam banyak?",
                sceneVisualEmoji = "🍨",
                sceneDescription = "Penjual es puter menaburkan garam kasar ke tumpukan es batu untuk menurunkan titik beku."
            ),
            StoryPanel(
                id = "pklg2",
                panelNumber = 2,
                title = "Penurunan Titik Beku Cairan",
                caption = "Kakek menjelaskan fenomena koligatif penurunan titik beku air.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itulah Sifat Koligatif! Partikel garam yang larut mengganggu molekul air membentuk kristal es. Titik beku es turun anjlok dari 0°C menjadi minus 10°C (-10°C)! Suhu super dingin inilah yang membekukan adonan santan menjadi es puter lembut!",
                sceneVisualEmoji = "❄️",
                sceneDescription = "Partikel garam terlarut menghalangi penyusunan kisi kristal es menurunkan titik beku."
            ),
            StoryPanel(
                id = "pklg3",
                panelNumber = 3,
                title = "Empat Sifat Koligatif Larutan",
                caption = "Kirana mencatat empat sifat larutan yang hanya bergantung pada JUMLAH partikel terlarut.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Sifat koligatif tidak peduli apakah partikel itu gula, garam, atau urea; yang penting adalah BANYAKNYA partikel: Penurunan Tekanan Uap (Raoult), Kenaikan Titik Didih, Penurunan Titik Beku, dan Tekanan Osmotik!",
                sceneVisualEmoji = "📈",
                sceneDescription = "Diagram fase P-T memperlihatkan pelebaran rentang cair akibat penambahan zat terlarut."
            )
        ),
        intuitionTitle = "Kekuatan Jumlah Partikel: Empat Sifat Koligatif Larutan",
        intuitionBody = "Sifat koligatif adalah sifat fisis larutan yang HANYA BERGANTUNG pada JUMLAH BUTIR partikel zat terlarut, dan tidak bergantung pada jenis atau sifat kimia zat tersebut:\n\n" +
                "1. Penurunan Tekanan Uap Jenuh (Hukum Raoult):\n" +
                "   • Molekul zat terlarut non-volatil menghalangi molekul pelarut menguap di permukaan.\n" +
                "   • P = X_pelarut · P°  =>  ΔP = X_terlarut · P°.\n\n" +
                "2. Kenaikan Titik Didih (ΔTb) & Penurunan Titik Beku (ΔTf):\n" +
                "   • ΔTb = m · Kb · i   (Titik didih larutan Tb = Tb° + ΔTb).\n" +
                "   • ΔTf = m · Kf · i   (Titik beku larutan Tf = Tf° - ΔTf).\n" +
                "   • Molalitas (m) = (gram_terlarut / Mr) × (1.000 / gram_pelarut).\n\n" +
                "3. Tekanan Osmotik (Hukum Van 't Hoff):\n" +
                "   • Tekanan yang dibutuhkan untuk menghentikan aliran spontan pelarut menembus membran semipermeabel.\n" +
                "   • Π = M · R · T · i.\n\n" +
                "4. Faktor Van 't Hoff (i) untuk Larutan Elektrolit:\n" +
                "   • i = 1 + (n - 1) α, di mana n adalah jumlah ion hasil ionisasi dan α derajat ionisasi.\n" +
                "   • Elektrolit Kuat (NaCl n=2, CaCl₂ n=3, α=1): nilai i = n (efek koligatif berlipat ganda!).\n" +
                "   • Nonelektrolit (Gula, Urea): nilai i = 1.",
        intuitionPoints = listOf(
            "Larutan garam dapur NaCl (elektrolit, i=2) memiliki kenaikan titik didih dua kali lebih besar dibanding larutan gula (nonelektrolit, i=1) pada konsentrasi molal yang sama.",
            "Teknologi Desalinasi Osmosis Balik (Reverse Osmosis / RO) menerapkan tekanan luar melebihi tekanan osmotik air laut untuk memeras air tawar murni menembus membran.",
            "Infus cairan medis rumah sakit harus bersifat ISOTONIK (tekanan osmotik sama dengan sel darah merah, setara larutan NaCl 0,9%) agar sel darah tidak pecah (hemolisis) atau mengkerut (krenasi)."
        ),
        simId = "sim-colligative",
        formulas = listOf(
            FormulaCard(
                symbol = "\\Delta T_b & \\Delta T_f",
                equation = "\\Delta T_b = m \\cdot K_b \\cdot i \\quad , \\quad \\Delta T_f = m \\cdot K_f \\cdot i",
                meaning = "Persamaan kenaikan titik didih dan penurunan titik beku larutan.",
                units = "°C",
                applicationNote = "Kb air = 0,52 °C/m, Kf air = 1,86 °C/m."
            ),
            FormulaCard(
                symbol = "\\Pi (\\text{Osmotik})",
                equation = "\\Pi = M \\cdot R \\cdot T \\cdot i",
                meaning = "Persamaan tekanan osmotik van 't Hoff.",
                units = "atmosfer (atm)",
                applicationNote = "R = 0,08206 L·atm/(mol·K). Suhu T dalam Kelvin."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pabrik Desalinasi Air Laut Reverse Osmosis (SWRO) Pulau Mandeh Sumatera Barat",
            context = "Kawasan wisata kepulauan Teluk Mandeh di Pesisir Selatan Sumatera Barat terisolasi dari jaringan pipa air tawar daratan.",
            engineeringProblem = "Air laut memiliki tekanan osmotik alami Π ≈ 27 atmosfer akibat kadar garam NaCl 3,5%. Bagaimana menghasilkan air tawar layak minum dari air laut secara massal?",
            physicalConceptUsed = "Prinsip Osmosis Balik (Reverse Osmosis): memberikan tekanan mekanik pompa hidrolik tekanan tinggi melebihi tekanan osmotik air laut (P_pompa ≈ 60–70 atm).",
            mathematicalModel = "Pompa bertekanan tinggi 65 atm memaksa molekul H₂O murni menembus membran semipermeabel poliamida berpori 0,1 nanometer, menahan 99,5% ion garam Na⁺ dan Cl⁻ terbuang sebagai air garam pekat reject.",
            realWorldImpact = "Menyediakan 500 meter kubik air minum bersih per hari bagi ribuan warga kepulauan terpencil dan industri pariwisata bahari.",
            relatedCareers = listOf("Insinyur Sistem Desalinasi Membran", "Operator Pabrik SWRO", "Teknisi Pemeliharaan Pompa Tekanan Tinggi"),
            verifiedSource = "Kementerian PUPR Balai Wilayah Sungai Sumatera V / Dokumentasi Instalasi SWRO Mandeh."
        ),
        homeLab = HomeLabData(
            title = "Membuat Es Krim Puter Sendiri Menggunakan Kaleng Biskuit & Garam",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 kaleng biskuit logam bekas bertutup rapat",
                "1 baskom plastik besar (wadah kaleng biskuit)",
                "Bongkahan es batu (1 baskom penuh)",
                "1 bungkus garam dapur kasar (garam krosok)",
                "Bahan es krim: 200 ml susu UHT manis atau santan manis aneka rasa"
            ),
            steps = listOf(
                "Tuangkan susu manis atau santan ke dalam kaleng biskuit logam, lalu tutup rapat-rapat.",
                "Letakkan kaleng di tengah baskom besar, kelilingi kaleng dengan tumpukan es batu.",
                "Taburkan seluruh garam dapur kasar ke atas tumpukan es batu secara merata.",
                "Putar kaleng biskuit bolak-balik menggunakan kedua tanganmu secara terus menerus selama 15 menit.",
                "Amati es batu mulai mencair namun suhunya menjadi super beku dingin menusuk tulang!",
                "Buka tutup kaleng: SUSU CAIR TELAH MEMBEKU MENJADI ES KRIM LEMBUT YANG NIKMAT SIAP DISANTAP!"
            ),
            observationGoal = "Membuktikan secara langsung fenomena penurunan titik beku (ΔTf) larutan garam yang mampu mencapai suhu di bawah 0°C untuk membekukan adonan es krim.",
            connectionToSimulation = "Bandingkan penurunan suhu kaleng es dengan diagram titik beku koligatif di simulator Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-klg-1",
                prompt = "Berapakah titik beku larutan glukosa (nonelektrolit) yang dibuat dengan melarutkan 18 gram glukosa (Mr = 180 g/mol) ke dalam 500 gram air? (Kf air = 1,86 °C/molal)",
                type = "numeric",
                correctAnswer = "-0.372",
                tolerance = 0.02f,
                unit = "°C",
                hints = listOf(
                    "Hitung mol glukosa: n = 18 / 180 = 0,1 mol.",
                    "Molalitas m = 0,1 mol / 0,5 kg = 0,2 molal.",
                    "Penurunan titik beku: ΔTf = m × Kf × i = 0,2 × 1,86 × 1 = 0,372°C.",
                    "Titik beku larutan Tf = 0°C - ΔTf = -0,372°C."
                ),
                explanation = "m = (18 / 180) × (1.000 / 500) = 0,1 × 2 = 0,2 m. ΔTf = m · Kf · 1 = 0,2 · 1,86 = 0,372°C. Maka titik beku larutan Tf = 0 - 0,372 = -0,372°C.",
                misconception = "Menuliskan nilai positif 0,372°C padahal titik beku larutan berada di bawah nol derajat Celcius."
            ),
            QuizQuestion(
                id = "q-klg-2",
                prompt = "Manakah dari larutan berikut pada konsentrasi molaritas yang sama (0,1 M) yang akan memiliki TEKANAN OSMOTIK PALING BESAR?",
                type = "multiple_choice",
                options = listOf(
                    "Larutan Aluminium Klorida (AlCl₃)",
                    "Larutan Natrium Klorida (NaCl)",
                    "Larutan Glukosa (C₆H₁₂O₆)",
                    "Larutan Magnesium Sulfat (MgSO₄)"
                ),
                correctAnswer = "Larutan Aluminium Klorida (AlCl₃)",
                hints = listOf(
                    "Tekanan osmotik berbanding lurus dengan jumlah ion (faktor van 't Hoff i).",
                    "AlCl₃ terurai menjadi 1 ion Al³⁺ + 3 ion Cl⁻ (total 4 ion, i = 4).",
                    "NaCl menghasilkan 2 ion (i = 2), Glukosa non-elektrolit (i = 1)."
                ),
                explanation = "AlCl₃ terdisosiasi sempurna menjadi 4 ion (1 Al³⁺ dan 3 Cl⁻, i = 4). Karena nilai faktor van 't Hoff i paling besar, AlCl₃ menghasilkan jumlah partikel terbanyak dan tekanan osmotik paling tinggi.",
                misconception = "Mengira semua larutan 0,1 M memiliki tekanan osmotik yang sama tanpa menghitung ionisasi elektrolit."
            )
        )
    )

    // =========================================================================
    // 12. REDOKS, SEL VOLTA & SEL ELEKTROLISIS
    // =========================================================================
    private val redoksElektrokimiaLesson = LessonData(
        conceptId = "kim-redoks-elektrokimia",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pre1",
                panelNumber = 1,
                title = "Baterai Aki Basah Sepeda Motor",
                caption = "Mekanik bengkel motor menuangkan cairan asam sulfat (H₂SO₄) ke dalam aki basah timbal-asam.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Cairan asam dan pelat timbal ini bisa menghasilkan tegangan listrik 12 Volt untuk menyalakan starter mesin motor!",
                sceneVisualEmoji = "🔋",
                sceneDescription = "Aki timbal-asam memicu reaksi kimia spontan menghasilkan aliran arus listrik DC."
            ),
            StoryPanel(
                id = "pre2",
                panelNumber = 2,
                title = "Sel Volta vs Sel Elektrolisis",
                caption = "Kakek menjelaskan dua cabang utama elektrokimia yang saling berkebalikan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sel Volta mengubah REAKSI KIMIA SPONTAN MENJADI ENERGI LISTRIK (seperti baterai dan aki). Sebaliknya, Sel Elektrolisis menggunakan ENERGI LISTRIK LUAR UNTUK MEMAKSA REAKSI KIMIA BERJALAN (seperti penyepuhan emas dan pemurnian logam aluminium)!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Perbandingan sel Volta menghasilkan listrik vs sel elektrolisis menggunakan arus listrik."
            ),
            StoryPanel(
                id = "pre3",
                panelNumber = 3,
                title = "Hukum Faraday Penyepuhan Logam",
                caption = "Kirana memperhatikan proses pelapisan sendok tembaga dengan logam perak berkilau.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Hukum I Faraday membuktikan: Massa logam perak yang mengendap melapisi sendok berbanding lurus dengan kuat arus listrik dan lama waktu penyepuhan: w = (e · I · t) / 96.500!",
                sceneVisualEmoji = "🥄",
                sceneDescription = "Sendok logam dilapisi endapan perak mengkilap di bak sel elektroplating."
            )
        ),
        intuitionTitle = "Dunia Aliran Elektron: Redoks, Potensial Sel & Hukum Faraday",
        intuitionBody = "Elektrokimia mempelajari keterkaitan antara reaksi reduksi-oksidasi (redoks) dengan energi listrik:\n\n" +
                "1. Konsep Redoks:\n" +
                "   • Oksidasi: Pelepasan elektron, kenaikan bilangan oksidasi (terjadi di ANODA).\n" +
                "   • Reduksi: Penangkapan elektron, penurunan bilangan oksidasi (terjadi di KATODA).\n" +
                "   • Jembatan Keledai: KRAO (Katoda Reduksi, Anoda Oksidasi).\n\n" +
                "2. Sel Volta (Galvani):\n" +
                "   • Menghasilkan arus listrik spontan (E°sel > 0).\n" +
                "   • Potensial Sel Standar: E°sel = E°katoda (reduksi) - E°anoda (oksidasi).\n" +
                "   • Deret Volta (K-Ba-Ca-Na-Mg-Al-Zn-Cr-Fe-Ni-Sn-Pb-[H]-Cu-Hg-Ag-Pt-Au): Logam di sebelah kiri lebih mudah teroksidasi (reduktor kuat, E° lebih negatif) dan mendesak ion logam di sebelah kanannya.\n\n" +
                "3. Sel Elektrolisis:\n" +
                "   • Membutuhkan arus listrik DC searah untuk reaksi non-spontan.\n" +
                "   • Katoda bermuatan negatif (-) menarik kation, Anoda bermuatan positif (+) menarik anion.\n" +
                "   • Hukum I Faraday: w = (e · I · t) / F = (Ar / valensi) · (I · t / 96.500).\n" +
                "   • Hukum II Faraday: w₁ / e₁ = w₂ / e₂ untuk sel yang dirangkai seri.",
        intuitionPoints = listOf(
            "1 Faraday setara dengan muatan 1 mol elektron = 96.485 Coulomb (dibulatkan 96.500 C).",
            "Pada elektrolisis larutan dengan elektroda inert, kation logam aktif (IA, IIA, Al, Mn) TIDAK AKAN tereduksi di katoda, melainkan AIR yang tereduksi menghasilkan gas H₂ dan OH⁻.",
            "Penyepuhan logam (elektroplating): Benda yang ingin disepuh SELALU dijadikan KATODA, dan logam pelapis dijadikan ANODA."
        ),
        simId = "sim-electrochemistry",
        formulas = listOf(
            FormulaCard(
                symbol = "E^\\circ_{\\text{sel}}",
                equation = "E^\\circ_{\\text{sel}} = E^\\circ_{\\text{katoda}} - E^\\circ_{\\text{anoda}} = E^\\circ_{\\text{reduksi}} - E^\\circ_{\\text{oksidasi}}",
                meaning = "Potensial sel standar sel Volta.",
                units = "Volt (V)",
                applicationNote = "Reaksi berlangsung spontan jika E°sel bernilai positif (+)."
            ),
            FormulaCard(
                symbol = "w (\\text{Faraday})",
                equation = "w = \\frac{e \\cdot I \\cdot t}{96.500} = \\frac{A_r}{n} \\cdot \\frac{I \\cdot t}{96.500}",
                meaning = "Hukum I Faraday massa endapan elektrolisis logam pada katoda.",
                units = "gram (g)",
                applicationNote = "I dalam Ampere, t dalam sekon, n = perubahan biloks muatan ion."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Smelter Pemurnian Tembaga Elektrolisis PT Freeport Indonesia di Manyar Gresik",
            context = "Smelter Manyar di Kawasan Ekonomi Khusus Java Integrated Industrial and Port Estate (JIIPE) Gresik merupakan smelter tembaga single-line terbesar di dunia.",
            engineeringProblem = "Konsentrat tembaga hasil tambang Grasberg Papua masih mengandung 1% pengotor emas, perak, dan besi yang harus dimurnikan hingga kemurnian 99,99% untuk kabel industri elektronika.",
            physicalConceptUsed = "Proses electro-refining (pemurnian elektrolitik) menggunakan sel tembaga sulfat CuSO₄.",
            mathematicalModel = "Anoda tembaga kotor (blister copper) dihubungkan ke kutub positif, katoda tembaga murni ke kutub negatif. Arus listrik ribuan Ampere melarutkan tembaga anoda: Cu(s) → Cu²⁺ + 2e⁻, dan mengendapkannya murni di katoda. Logam mulia emas dan perak mengendap di dasar sel sebagai lumpur anoda (anode slime).",
            realWorldImpact = "Memproduksi 600.000 ton katoda tembaga murni dan 50 ton emas murni batangan per tahun yang memperkuat kedaulatan hilirisasi mineral Indonesia.",
            relatedCareers = listOf("Insinyur Elektrorefining Logam", "Analis Kimia Analitik Smelter", "Teknisi Sel Elektrolisis Tegangan Tinggi"),
            verifiedSource = "PT Freeport Indonesia / Spesifikasi Teknis Smelter Manyar Gresik."
        ),
        homeLab = HomeLabData(
            title = "Membuat Baterai Basah Sel Volta Alami dari Buah Jeruk Nipis / Lemon",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "4 buah jeruk nipis atau lemon segar",
                "4 keping koin tembaga uang Rp1.000 (kutub positif Katoda)",
                "4 buah paku seng atau paku besi galvanis (kutub negatif Anoda)",
                "5 utas kabel kecil dengan penjepit buaya",
                "1 lampu LED kecil (1,5–3 Volt)"
            ),
            steps = listOf(
                "Pijat-pijat buah jeruk nipis di atas meja agar sari asam sitrat di dalamnya keluar tanpa merusak kulit.",
                "Tancapkan 1 koin tembaga dan 1 paku seng pada setiap buah jeruk nipis berjarak 2 cm (jangan sampai bersentuhan di dalam).",
                "Hubungkan keempat buah jeruk nipis secara SERI menggunakan kabel penjepit buaya: koin tembaga jeruk 1 ke paku seng jeruk 2, koin tembaga jeruk 2 ke paku seng jeruk 3, dan seterusnya.",
                "Hubungkan ujung kabel terakhir ke kaki lampu LED (koin tembaga ke anoda LED, paku seng ke katoda LED).",
                "AMATI: LAMPU LED MENYALA TERANG DITENAGAI OLEH BATERAI BUAH JERUK NIPIS!",
                "Ukur tegangannya dengan voltmeter: setiap buah jeruk menghasilkan sekitar 0,9 Volt (total 4 jeruk ≈ 3,6 Volt)!"
            ),
            observationGoal = "Membuktikan secara nyata prinsip Sel Volta: beda potensial reduksi antara logam tembaga dan seng dalam elektrolit asam menghasilkan energi listrik spontan.",
            connectionToSimulation = "Bandingkan tegangan baterai jerukmu dengan simulator sel Volta di Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-re-1",
                prompt = "Diketahui potensial reduksi standar: E° Zn²⁺/Zn = -0,76 Volt dan E° Cu²⁺/Cu = +0,34 Volt. Berapakah potensial sel standar (E°sel) yang dihasilkan oleh sel Volta Zn-Cu tersebut?",
                type = "numeric",
                correctAnswer = "1.1",
                tolerance = 0.05f,
                unit = "Volt",
                hints = listOf(
                    "Gunakan rumus E°sel = E°katoda - E°anoda.",
                    "Logam dengan E° lebih positif mengalami reduksi di Katoda (Cu = +0,34 V).",
                    "Logam dengan E° lebih negatif mengalami oksidasi di Anoda (Zn = -0,76 V).",
                    "E°sel = (+0,34) - (-0,76) = 0,34 + 0,76 = ...?"
                ),
                explanation = "Cu bertindak sebagai katoda (E° = +0,34 V) dan Zn sebagai anoda (E° = -0,76 V). E°sel = E°katoda - E°anoda = +0,34 V - (-0,76 V) = +1,10 Volt. Karena E°sel positif, reaksi berlangsung spontan.",
                misconception = "Mengurangkan terbalik atau lupa bahwa minus ketemu minus menjadi plus."
            ),
            QuizQuestion(
                id = "q-re-2",
                prompt = "Arus listrik sebesar 10 Ampere dialirkan ke dalam larutan AgNO₃ selama 965 detik. Berapakah massa perak (Ag) yang mengendap di katoda? (Ar Ag = 108, muatan ion Ag⁺, 1 F = 96.500 C)",
                type = "numeric",
                correctAnswer = "10.8",
                tolerance = 0.2f,
                unit = "gram",
                hints = listOf(
                    "Gunakan Hukum I Faraday: w = (e × I × t) / 96.500.",
                    "Untuk Ag⁺, valensi n = 1, sehingga e = Ar / 1 = 108.",
                    "w = (108 × 10 × 965) / 96.500 = (108 × 9.650) / 96.500 = 108 / 10."
                ),
                explanation = "w = (Ar / n) · (I · t / 96.500) = (108 / 1) · (10 · 965 / 96.500) = 108 · (9.650 / 96.500) = 108 · 0,1 = 10,8 gram perak.",
                misconception = "Lupa mengalikan waktu dalam sekon atau salah menghitung angka pembagian 96.500."
            )
        )
    )

    // =========================================================================
    // 13. KIMIA UNSUR & SENYAWA KOMPLEKS KOORDINASI
    // =========================================================================
    private val kimiaUnsurLesson = LessonData(
        conceptId = "kim-kimia-unsur",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pku1",
                panelNumber = 1,
                title = "Warna-Warni Larutan Logam Transisi",
                caption = "Kirana menatap takjub deretan tabung reaksi berisi larutan garam logam transisi di laboratorium: Tembaga Cu²⁺ berwarna biru laut, Nikel Ni²⁺ hijau zamrud, Krom Cr³⁺ ungu, dan Besi Fe³⁺ kuning jingga.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Luar biasa! Mengapa larutan garam logam transisi memiliki warna-warna yang sangat cerah, sedangkan garam dapur NaCl selalu bening?",
                sceneVisualEmoji = "🌈",
                sceneDescription = "Deretan larutan garam transisi berwarna biru, hijau, ungu, dan kuning cerah."
            ),
            StoryPanel(
                id = "pku2",
                panelNumber = 2,
                title = "Eksitasi Orbital d & Medan Ligan",
                caption = "Kakek menjelaskan asal-usul warna kation logam transisi.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Logam transisi periode 4 memiliki subkulit 3d yang belum terisi penuh! Saat molekul air atau ligan mengelilingi ion logam, orbital d terbelah energinya. Elektron melompat menyerap panjang gelombang cahaya tampak tertentu dan memantulkan warna komplementernya ke mata kita!",
                sceneVisualEmoji = "💎",
                sceneDescription = "Pemisahan tingkat energi orbital d menghasilkan transisi elektronik penyerap cahaya."
            ),
            StoryPanel(
                id = "pku3",
                panelNumber = 3,
                title = "Ion Kompleks Koordinasi",
                caption = "Dimas menuliskan rumus senyawa koordinasi [Cu(NH₃)₄]SO₄ berwarna biru tua pekat.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Empat molekul amonia bertindak sebagai LIGAN yang mendonorkan pasangan elektron bebas ke ion pusat Cu²⁺ membentuk ikatan kovalen koordinasi! Kompleks koordinasi inilah yang menjadi fondasi zat hijau daun klorofil (kompleks Mg) dan hemoglobin darah (kompleks Fe)!",
                sceneVisualEmoji = "🔬",
                sceneDescription = "Struktur oktahedral senyawa kompleks koordinasi dengan ligan mengitari ion pusat."
            )
        ),
        intuitionTitle = "Kimia Anorganik Deskriptif: Halogen, Logam & Kompleks Koordinasi",
        intuitionBody = "Karakteristik unsur kimia golongan utama dan transisi memperlihatkan keunikan sifat materi:\n\n" +
                "1. Golongan Halogen (VIIA - F, Cl, Br, I):\n" +
                "   • Unsur nonlogam paling elektronegatif, selalu berbentuk molekul diatomik (F₂ gas kuning, Cl₂ gas hijau, Br₂ cairan cokelat merah, I₂ padatan ungu menyublim).\n" +
                "   • Oksidator kuat: F₂ > Cl₂ > Br₂ > I₂ (halogen atas dapat mendesak ion halida bawahnya).\n\n" +
                "2. Golongan Alkali (IA) & Alkali Tanah (IIA):\n" +
                "   • Logam sangat lunak, reaktif, reduktor kuat, disimpan dalam minyak tanah.\n" +
                "   • Uji Nyala Garam: Li (merah), Na (kuning terang), K (ungu lilac), Ca (merah bata), Ba (hijau apel).\n\n" +
                "3. Unsur Logam Transisi Periode 4 (Sc, Ti, V, Cr, Mn, Fe, Co, Ni, Cu, Zn):\n" +
                "   • Memiliki berbagai tingkat bilangan oksidasi (contoh: Mn memiliki biloks dari +2 hingga +7 pada KMnO₄).\n" +
                "   • Senyawanya berwarna-warni akibat transisi elektronik orbital d yang belum penuh.\n" +
                "   • Memiliki sifat paramagnetik (tertarik magnet) karena ada elektron yang tidak berpasangan.\n" +
                "   • Seng (Zn) senyawanya tidak berwarna dan diamagnetik karena subkulit 3d¹⁰ sudah terisi penuh.\n\n" +
                "4. Senyawa Kompleks Koordinasi:\n" +
                "   • Terdiri dari Ion Logam Pusat (akseptor elektron) dan Ligan netral/anionik (donor PEB).\n" +
                "   • Bilangan Koordinasi = jumlah ikatan koordinasi yang diterima ion pusat (biasanya 4 atau 6).\n" +
                "   • Tatanama: Sebutkan jumlah ligan (mono, di, tri, tetra, heksa) + nama ligan + nama logam pusat.",
        intuitionPoints = listOf(
            "Klorofil pada daun tumbuhan adalah senyawa kompleks koordinasi alami dengan ion pusat Magnesium (Mg²⁺), sedangkan Hemoglobin darah berpusat pada ion Besi (Fe²⁺).",
            "Gas Mulia (Helium, Neon, Argon) dapat bersinar terang dengan aneka warna saat dialiri listrik tegangan tinggi di dalam tabung reklame neon.",
            "Iodin (I₂) dipakai sebagai antiseptik luka (betadine) dan uji identifikasi kandungan amilum pati pada bahan makanan (menghasilkan warna biru kehitaman pekat)."
        ),
        simId = "sim-inorganic-chemistry",
        formulas = listOf(
            FormulaCard(
                symbol = "[\\text{M}(\\text{L})_n]^{m+}",
                equation = "[\\text{Cu}(\\text{NH}_3)_4]^{2+} \\quad , \\quad [\\text{Fe}(\\text{CN})_6]^{4-}",
                meaning = "Rumus ion kompleks koordinasi kation dan anion.",
                units = "-",
                applicationNote = "[Cu(NH3)4]²⁺ memiliki ion pusat Cu²⁺, 4 ligan amonia, dan bilangan koordinasi 4."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Katalis Homogen Kompleks Kobalt Sintesis PTA Kilang Pertamina Plaju Palembang",
            context = "Kilang Pertamina Plaju Sumatera Selatan memproduksi Purified Terephthalic Acid (PTA) sebagai bahan baku serat kain poliester dan tekstil nasional.",
            engineeringProblem = "Oksidasi senyawa para-xilena menjadi asam tereftalat membutuhkan katalis yang mampu mengikat oksigen dan berganti tingkat bilangan oksidasi secara reversibel pada suhu 200°C.",
            physicalConceptUsed = "Sifat multivalensi logam transisi Kobalt-Mangan (Co-Mn) dan pembentukan intermediet senyawa kompleks radikal aktif.",
            mathematicalModel = "Ion Kobalt berganti biloks bolak-balik Co(II) ⇌ Co(III) + e⁻ dengan laju transfer elektron kilat, mengarahkan oksidasi selektif gugus metil menjadi karboksilat dengan rendemen hasil reaksi > 98%.",
            realWorldImpact = "Menyediakan bahan baku kemandirian industri tekstil nasional dan mengurangi ketergantungan impor serat sintetis pakaian.",
            relatedCareers = listOf("Insinyur Kimia Senyawa Koordinasi", "Spesialis Sintesis Petrokimia PTA", "Teknisi Kontrol Mutu Polimer"),
            verifiedSource = "PT Kilang Pertamina Internasional RU III Plaju / Profil Produk Petrokimia."
        ),
        homeLab = HomeLabData(
            title = "Uji Nyala Warna Garam Dapur (Natrium) & Garam Kalium di Api Lilin",
            safetyLevel = "Dengan Pengawasan Orang Tua",
            materials = listOf(
                "1 lilin atau kompor gas dapur",
                "1 tusuk gigi kayu atau kawat klip kertas dibakar bersih",
                "Garam dapur meja (NaCl mengandung natrium)",
                "Sedikit pupuk NPK / garam kalium atau tetesan air rebusan pisang (mengandung kalium)",
                "Sedikit air untuk membasahi ujung tusuk gigi"
            ),
            steps = listOf(
                "Basahi ujung tusuk gigi kayu dengan sedikit air bersih.",
                "Tempelkan ujung basah tersebut ke butiran garam dapur NaCl hingga menempel beberapa butir kristal.",
                "Dekatkan ujung tusuk gigi ke dasar api lilin atau api biru kompor gas.",
                "AMATI: API SEKETIKA MENYALA KUNING KEEMASAN SANGAT TERANG! (Warna khas emisi spektral unsur Natrium Golongan IA).",
                "Ganti tusuk gigi baru, tempelkan sedikit pupuk kalium atau abu kulit pisang ke api: amati kilatan nyala api berwarna UNGU LILAC pucat khas Kalium!"
            ),
            observationGoal = "Menyaksikan fenomena uji nyala spektrum emisi atom logam alkali saat elektron tereksitasi kembali ke tingkat energi dasar melepaskan foton cahaya berwarna.",
            connectionToSimulation = "Bandingkan warna nyala api dengan simulator spektroskopi emisi unsur Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ku-1",
                prompt = "Ion kompleks [Fe(CN)₆]⁴⁻ memiliki ion pusat, ligan, dan bilangan koordinasi berturut-turut adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Ion pusat Fe²⁺, ligan CN⁻, dan bilangan koordinasi 6",
                    "Ion pusat Fe³⁺, ligan CN⁻, dan bilangan koordinasi 4",
                    "Ion pusat Fe²⁺, ligan CN⁻, dan bilangan koordinasi 4",
                    "Ion pusat Fe³⁺, ligan Fe²⁺, dan bilangan koordinasi 6"
                ),
                correctAnswer = "Ion pusat Fe²⁺, ligan CN⁻, dan bilangan koordinasi 6",
                hints = listOf(
                    "Jumlah ligan CN⁻ adalah 6 (heksa), sehingga bilangan koordinasi = 6.",
                    "Setiap ligan CN memiliki muatan -1. Total muatan 6 ligan = -6.",
                    "Muatan total ion kompleks = -4. Maka muatan Fe + (-6) = -4 => muatan Fe = +2."
                ),
                explanation = "Muatan total = -4. Karena ligan CN bermuatan -1 (total 6 CN⁻ = -6), maka ion pusat Fe memiliki biloks +2 (Fe²⁺). Jumlah ligan yang terikat adalah 6, sehingga bilangan koordinasinya adalah 6.",
                misconception = "Salah menghitung bilangan oksidasi ion pusat karena lupa memperhitungkan muatan ligan."
            ),
            QuizQuestion(
                id = "q-ku-2",
                prompt = "Mengapa larutan senyawa Seng seperti ZnSO₄ tidak berwarna (bening) dan bersifat diamagnetik, berbeda dari senyawa logam transisi periode 4 lainnya?",
                type = "multiple_choice",
                options = listOf(
                    "Karena subkulit 3d pada ion Zn²⁺ sudah terisi penuh (3d¹⁰) tanpa ada elektron tunggal",
                    "Karena seng bukan merupakan unsur logam",
                    "Karena seng tidak memiliki proton di dalam inti atomnya",
                    "Karena ion seng tidak dapat mengikat air"
                ),
                correctAnswer = "Karena subkulit 3d pada ion Zn²⁺ sudah terisi penuh (3d¹⁰) tanpa ada elektron tunggal",
                hints = listOf(
                    "Seng (Z = 30) memiliki konfigurasi [Ar] 4s² 3d¹⁰.",
                    "Saat membentuk ion Zn²⁺, 2 elektron 4s dilepas sehingga tersisa 3d¹⁰ yang penuh.",
                    "Transisi d-d tidak bisa terjadi jika semua orbital d sudah penuh."
                ),
                explanation = "Ion Zn²⁺ memiliki konfigurasi elektron [Ar] 3d¹⁰. Karena seluruh orbital d telah terisi penuh berpasangan, tidak ada elektron tunggal yang memicu sifat paramagnetik dan tidak ada ruang untuk transisi elektron d-d penyerap cahaya tampak, sehingga senyawanya tidak berwarna (bening).",
                misconception = "Mengira seng memiliki sifat yang sama persis dengan besi dan tembaga."
            )
        )
    )

    // =========================================================================
    // 14. KIMIA ORGANIK DASAR: HIDROKARBON, GUGUS FUNGSI & ISOMER
    // =========================================================================
    private val kimiaOrganikLesson = LessonData(
        conceptId = "kim-kimia-organik",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pko1",
                panelNumber = 1,
                title = "Aroma Harum Buah Pisang Ambon",
                caption = "Kirana mencium aroma wangi manis buah pisang ambon matang di meja makan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Aroma wangi pisang ini khas sekali! Apakah wangi buah alami ini juga merupakan molekul senyawa kimia?",
                sceneVisualEmoji = "🍌",
                sceneDescription = "Buah pisang matang menebarkan molekul ester beraroma harum manis."
            ),
            StoryPanel(
                id = "pko2",
                panelNumber = 2,
                title = "Gugus Fungsi: Kepribadian Molekul Karbon",
                caption = "Kakek menjelaskan keajaiban cabang kimia organik turunan hidrokarbon.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Wangi pisang itu adalah senyawa ESTER (isoamil asetat)! Atom Karbon memiliki keistimewaan 4 elektron valensi yang dapat berikatan rantai panjang tak terbatas membentuk cincin dan cabang. Penambahan GUGUS FUNGSI seperti alkohol (-OH), asam karboksilat (-COOH), atau ester (-COO-) memberikan kepribadian dan aroma khas pada setiap molekul!",
                sceneVisualEmoji = "🧪",
                sceneDescription = "Rantai hidrokarbon dengan aneka gugus fungsi: alkohol, keton, dan ester."
            ),
            StoryPanel(
                id = "pko3",
                panelNumber = 3,
                title = "Kembar Tapi Beda: Isomeri Molekul",
                caption = "Dimas memegang botol alkohol pembersih luka (etanol) dan mempelajari rumus kimianya.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Etanol (alkohol cair obat luka) dan Dimetil Eter (gas anestesi) memiliki rumus molekul yang PERSIS SAMA: C₂H₆O! Tetapi susunan atomnya berbeda: satu berakhiran -OH dan satu berpusat -O-. Fenomena ini dinamakan ISOMER!",
                sceneVisualEmoji = "🧬",
                sceneDescription = "Dua struktur molekul berumus molekul C2H6O yang sama namun memiliki struktur berbeda."
            )
        ),
        intuitionTitle = "Keajaiban Rantai Karbon: Tata Nama, Gugus Fungsi & Isomer",
        intuitionBody = "Kimia organik adalah sains yang mempelajari triliunan senyawa berbasis rantai atom karbon (C):\n\n" +
                "1. Hidrokarbon Alifatik Dasar:\n" +
                "   • Alkana (C_n H_{2n+2}): Ikatan tunggal jenuh (metana, etana, propana, butana).\n" +
                "   • Alkena (C_n H_{2n}): Memiliki ikatan rangkap dua C=C tak jenuh (etena, propena).\n" +
                "   • Alkuna (C_n H_{2n-2}): Memiliki ikatan rangkap tiga C≡C (etuna / gas asetilena las karbit).\n\n" +
                "2. Keluarga Gugus Fungsi Turunan Alkana:\n" +
                "   • Alkohol (Alkanol, R-OH): Antiseptik, pelarut polar, titik didih tinggi karena ikatan hidrogen.\n" +
                "   • Eter (Alkoksi Alkana, R-O-R'): Obat bius, pelarut nonpolar, titik didih rendah.\n" +
                "   • Aldehida (Alkanal, R-CHO): Mengandung karbonil di ujung rantai, mereduksi pereaksi Fehling/Tollens (formalin, wangi almond).\n" +
                "   • Keton (Alkanon, R-CO-R'): Mengandung karbonil di tengah rantai, tidak mereduksi Tollens (aseton pembersih cat kuku).\n" +
                "   • Asam Karboksilat (Asam Alkanoat, R-COOH): Memerahkan lakmus, rasa asam (asam cuka/asetat, asam semut/format).\n" +
                "   • Ester (Alkil Alkanoat, R-COO-R'): Beraroma wangi buah-buahan harum (esens parfum, minyak goreng).\n\n" +
                "3. Isomeri:\n" +
                "   • Rumus molekul sama, susunan struktur berbeda.\n" +
                "   • Isomer Gugus Fungsi Berpasangan: Alkohol berisomer fungsi dengan Eter (C_n H_{2n+2} O); Aldehida berisomer fungsi dengan Keton (C_n H_{2n} O); Asam Karboksilat berisomer fungsi dengan Ester (C_n H_{2n} O₂).\n\n" +
                "4. Benzena (C₆H₆) & Senyawa Aromatik:\n" +
                "   • Cincin 6 karbon dengan ikatan rangkap terkonjugasi terdelokalisasi (resonansi cincin stabil).\n" +
                "   • Turunan: Toluena (bahan TNT), Fenol (antiseptik karbol), Anilina, Asam Benzoat (pengawet makanan).",
        intuitionPoints = listOf(
            "Reaksi Esterifikasi: Asam Karboksilat + Alkohol ⇌ Ester + Air (dengan katalis asam pekat H₂SO₄) dipakai di industri makanan untuk memproduksi esens perisa buah buatan.",
            "Gas asetilena / etuna (C₂H₂) menghasilkan nyala api las bersuhu di atas 3.000°C yang mampu memotong dan menyambung pelat baja tebal kapal laut.",
            "Atom karbon memiliki 4 tangan ikatan kovalen yang memungkinkannya membentuk rantai lurus, bercabang, cincin siklik, hingga makromolekul polimer DNA raksasa."
        ),
        simId = "sim-organic-chemistry",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Esterifikasi}",
                equation = "\\text{R}-\\text{COOH} + \\text{R}'-\\text{OH} \\xrightleftharpoons{\\text{H}^+} \\text{R}-\\text{COO}-\\text{R}' + \\text{H}_2\\text{O}",
                meaning = "Reaksi sintesis senyawa ester beraroma buah dari asam karboksilat dan alkohol.",
                units = "-",
                applicationNote = "Contoh: Asam asetat + Etanol -> Etil asetat (aroma pisang/lem) + Air."
            ),
            FormulaCard(
                symbol = "\\text{Isomer Pasangan}",
                equation = "\\text{Alkohol} \\leftrightarrow \\text{Eter} \\quad , \\quad \\text{Aldehida} \\leftrightarrow \\text{Keton} \\quad , \\quad \\text{Asam} \\leftrightarrow \\text{Ester}",
                meaning = "Tiga pasang isomer gugus fungsi turunan alkana.",
                units = "-",
                applicationNote = "Pasangan isomer memiliki rumus umum molekul yang identik."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sintesis Vanilin Aromatik Alami dari Minyak Cengkeh di Purwokerto Jawa Tengah",
            context = "Indonesia adalah produsen minyak cengkeh terbesar di dunia yang diekstraksi dari daun dan bunga cengkeh perkebunan rakyat.",
            engineeringProblem = "Minyak cengkeh mentah mengandung senyawa fenolik eugenol yang bernilai ekonomi rendah jika tidak dimurnikan menjadi kristal perisa makanan vanilin bernilai tinggi.",
            physicalConceptUsed = "Transformasi gugus fungsi organik: isomerisasi gugus alil eugenol menjadi isoeugenol, diikuti reaksi oksidasi ikatan rangkap alkena menjadi gugus aldehida (-CHO) vanilin.",
            mathematicalModel = "Reaksi terkendali menggunakan ozonolisis menghasilkan kristal 4-hidroksi-3-metoksibenzaldehida (vanilin) dengan kemurnian > 99% berstandar farmasi internasional USP.",
            realWorldImpact = "Meningkatkan nilai tambah ekspor minyak cengkeh petani Indonesia hingga 5 kali lipat untuk pasokan industri es krim, biskuit, dan parfum global.",
            relatedCareers = listOf("Kimiawan Sintesis Organik Bahan Alam", "Flavourist & Perfumer Industri Pangan", "Insinyur Proses Fraksinasi Minyak Atsiri"),
            verifiedSource = "Pusat Riset Kimia Terapan BRIN / Laporan Hilirisasi Minyak Atsiri Cengkeh Nasional."
        ),
        homeLab = HomeLabData(
            title = "Membuat Aroma Pisang Esterifikasi Sederhana dari Cuka & Alkohol Pembersih Luka",
            safetyLevel = "Dengan Pengawasan Orang Tua",
            materials = listOf(
                "3 sendok makan cuka dapur pekat (asam asetat CH₃COOH)",
                "3 sendok makan alkohol medis 70% atau isopropil alkohol (R-OH)",
                "1 cangkir keramik tahan panas",
                "Air mendidih panas dalam mangkok (sebagai penangas air warm water bath)"
            ),
            steps = listOf(
                "Campurkan cuka dapur dan alkohol ke dalam cangkir keramik kecil.",
                "Letakkan cangkir keramik tersebut mengapung di dalam mangkok besar berisi air mendidih (pemanasan tidak langsung dengan penangas air, jangan dipanaskan langsung di atas api kompor!).",
                "Aduk campuran secara perlahan selama 5 menit hingga terasa hangat menguap.",
                "Kibaskan uap yang keluar dari cangkir ke arah hidungmu secara lembut.",
                "AMATI PERUBAHAN AROMANYA: Bau asam menyengat dari cuka dapur dan bau tajam alkohol perlahan berganti menjadi AROMA WANGI MANIS BUAH SEPERTI AROMA CAT KUKU / PERISA BUAH BUATAN (senyawa Ester telah terbentuk)!"
            ),
            observationGoal = "Menyaksikan secara langsung sintesis reaksi esterifikasi organik pembentuk senyawa ester beraroma buah.",
            connectionToSimulation = "Bandingkan struktur molekul ester buatanmu dengan pemodel 3D organik di simulator Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ko-1",
                prompt = "Pasangan senyawa turunan alkana berikut yang berisomer gugus fungsi (memiliki rumus molekul sama tetapi gugus fungsi berbeda) adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Etanol (alkohol) dan Dimetil eter (eter)",
                    "Metana (alkana) dan Etena (alkena)",
                    "Asam asetat (asam karboksilat) dan Aseton (keton)",
                    "Glukosa dan Sukrosa"
                ),
                correctAnswer = "Etanol (alkohol) dan Dimetil eter (eter)",
                hints = listOf(
                    "Alkohol berisomer gugus fungsi dengan eter (keduanya berumus CnH2n+2O).",
                    "Etanol (C₂H₅OH) dan Dimetil eter (CH₃-O-CH₃) sama-sama berumus C₂H₆O."
                ),
                explanation = "Etanol dan dimetil eter sama-sama memiliki rumus molekul C₂H₆O, tetapi etanol memiliki gugus fungsi alkohol (-OH) sedangkan dimetil eter memiliki gugus fungsi eter (-O-). Keduanya adalah pasangan isomer gugus fungsi.",
                misconception = "Mengira asam asetat berisomer dengan aseton, padahal asam asetat berisomer dengan ester."
            ),
            QuizQuestion(
                id = "q-ko-2",
                prompt = "Reaksi antara asam karboksilat (asam asetat) dengan alkohol (etanol) dengan bantuan katalis asam pekat menghasilkan air dan senyawa beraroma wangi harum yang tergolong...",
                type = "multiple_choice",
                options = listOf("Ester (Alkil Alkanoat)", "Eter (Alkoksi Alkana)", "Aldehida", "Alkana"),
                correctAnswer = "Ester (Alkil Alkanoat)",
                hints = listOf(
                    "Reaksi ini dinamakan reaksi esterifikasi.",
                    "Senyawa yang dihasilkan memiliki gugus fungsi -COO- dan beraroma buah harum."
                ),
                explanation = "Reaksi antara asam karboksilat dan alkohol menghasilkan senyawa ester dan air (reaksi esterifikasi). Senyawa ester banyak dimanfaatkan sebagai esens perisa makanan karena aromanya yang wangi manis.",
                misconception = "Tertukar antara ester (-COO-) dan eter (-O-)."
            )
        )
    )

    // =========================================================================
    // 15. BIOMOLEKUL & POLIMER SINTETIS
    // =========================================================================
    private val biomolekulPolimerLesson = LessonData(
        conceptId = "kim-biomolekul-polimer",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pbp1",
                panelNumber = 1,
                title = "Membuat Sabun Tradisional dari Minyak Kelapa",
                caption = "Bu Ratna membuat sabun mandi herbal alami dari minyak kelapa murni (VCO) yang dicampur larutan soda api (NaOH) di baskom stainless steel.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Minyak kelapa yang licin cair mendadak mengental memadat menjadi busa sabun wangi! Reaksi apa yang terjadi, Ibu?",
                sceneVisualEmoji = "🧼",
                sceneDescription = "Reaksi saponifikasi minyak nabati menjadi sabun mandi padat berbusa lembut."
            ),
            StoryPanel(
                id = "pbp2",
                panelNumber = 2,
                title = "Reaksi Saponifikasi & Makromolekul Lemak",
                caption = "Kakek menjelaskan hidrolisis basa trigliserida lipid.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Minyak dan lemak adalah trigliserida (ester gliserol dengan 3 rantai asam lemak panjang). Saat direaksikan dengan basa kuat NaOH, ikatannya terhidrolisis menghasilkan Gliserol pelembab kulit dan Garam Asam Lemak yang kita kenal sebagai SABUN! Proses ini dinamakan Saponifikasi (Penyabunan)!",
                sceneVisualEmoji = "🧴",
                sceneDescription = "Molekul trigliserida terurai menjadi gliserol dan molekul sabun berkepala polar berekor nonpolar."
            ),
            StoryPanel(
                id = "pbp3",
                panelNumber = 3,
                title = "Rantai Raksasa Polimer Plastik",
                caption = "Kirana memegang tali tambang nilon yang sangat kuat dan kantong kresek polietilena.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Plastik, nilon, amilum nasi, bahkan protein otot kita semuanya adalah POLIMER! Ribuan monomer molekul kecil dirangkai sambung-menyambung lewat reaksi polimerisasi adisi atau kondensasi menjadi rantai raksasa makromolekul!",
                sceneVisualEmoji = "🧵",
                sceneDescription = "Rantai monomer-monomer kecil tersambung membentuk untaian makromolekul polimer panjang."
            )
        ),
        intuitionTitle = "Makromolekul Semesta: Karbohidrat, Protein, Lipid & Polimer",
        intuitionBody = "Kehidupan biologis dan teknologi material modern ditopang oleh senyawa makromolekul raksasa:\n\n" +
                "1. Karbohidrat (Polisakarida):\n" +
                "   • Tersusun dari unit monomer monosakarida (glukosa, fruktosa, galaktosa) yang terhubung oleh Ikatan Glikosida.\n" +
                "   • Uji Fehling / Benedict: Menguji gula pereduksi (glukosa) menghasilkan endapan merah bata Cu₂O.\n" +
                "   • Uji Iodin: Menguji amilum pati menghasilkan warna biru kehitaman pekat.\n\n" +
                "2. Protein (Polipeptida):\n" +
                "   • Polimer alami dari 20 jenis Asam Amino yang terikat oleh Ikatan Peptida (-CO-NH-).\n" +
                "   • Setiap asam amino memiliki gugus amina (-NH₂) yang bersifat basa dan gugus karboksilat (-COOH) yang bersifat asam (bersifat amfoter membentuk zwitter-ion).\n" +
                "   • Uji Biuret: Menghasilkan warna ungu (deteksi ikatan peptida).\n" +
                "   • Uji Xantoproteat: Menghasilkan warna kuning jingga (deteksi cincin benzena asam amino aromatik).\n\n" +
                "3. Lipid & Lemak:\n" +
                "   • Senyawa ester trigliserida (gliserol + 3 asam lemak).\n" +
                "   • Reaksi Saponifikasi: Trigliserida + 3 NaOH → Gliserol + 3 Sabun (R-COONa).\n" +
                "   • Molekul sabun memiliki kepala polar hidrofilik (larut air) dan ekor nonpolar hidrofobik (mengikat kotoran minyak).\n\n" +
                "4. Polimer Sintetis:\n" +
                "   • Polimerisasi Adisi: Pemutusan ikatan rangkap alkena tanpa melepaskan molekul kecil (Polietilena kantong plastik, PVC pipa pipa, Teflon anti lengket).\n" +
                "   • Polimerisasi Kondensasi: Penggabungan monomer dengan melepaskan molekul kecil sampingan seperti H₂O (Nilon serat kain, Poliester PET botol minum).",
        intuitionPoints = listOf(
            "Denaturasi protein: Panas merebus telur merusak struktur lipatan 3D protein putih telur (albumin) secara permanen dari cairan bening menjadi padatan putih kenyal.",
            "Struktur amfoter asam amino memungkinkannya bertindak sebagai penyangga pH alami di dalam jaringan sel hidup.",
            "Teflon (Politetrafluoroetilena / PTFE) sangat tahan panas dan licin anti-lengket karena ikatan kovalen C-F di dalamnya adalah ikatan tunggal terkuat dalam kimia organik."
        ),
        simId = "sim-polymers",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Saponifikasi}",
                equation = "\\text{Trigliserida} + 3\\text{NaOH} \\rightarrow \\text{Gliserol} + 3\\text{Sabun (R-COONa)}",
                meaning = "Reaksi hidrolisis basa lemak menghasilkan sabun cuci dan gliserol.",
                units = "-",
                applicationNote = "NaOH menghasilkan sabun batangan keras, KOH menghasilkan sabun cair lembut."
            ),
            FormulaCard(
                symbol = "\\text{Ikatan Peptida}",
                equation = "\\text{R}_1\\text{-COOH} + \\text{H}_2\\text{N-R}_2 \\rightarrow \\text{R}_1\\text{-CO-NH-R}_2 + \\text{H}_2\\text{O}",
                meaning = "Reaksi polimerisasi kondensasi dua asam amino membentuk ikatan peptida protein.",
                units = "-",
                applicationNote = "Melepaskan satu molekul air (H2O) pada setiap pembentukan sambungan peptida."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Industri Oleokimia Fraksinasi Minyak Sawit PT Musim Mas Medan Sumatera Utara",
            context = "Indonesia adalah produsen minyak kelapa sawit mentah (Crude Palm Oil / CPO) terbesar di dunia yang mengolah jutaan ton tandan buah segar perkebunan.",
            engineeringProblem = "Minyak sawit mentah bernilai ekonomi rendah jika hanya dijual sebagai minyak goreng curahan tanpa dihilirisasi menjadi produk oleokimia bernilai tambah tinggi.",
            physicalConceptUsed = "Reaksi transesterifikasi dan hidrolisis asam lemak sawit menghasilkan Fatty Alcohol, Metil Ester, Asam Stearat, dan Gliserol murni farmasi.",
            mathematicalModel = "Pabrik memisahkan fraksi trigliserida olein cair dan stearin padat melalui kristalisasi fraksional suhu terkontrol, lalu mereaksikan asam stearat dengan kalium hidroksida KOH menghasilkan sabun kosmetik dan bahan baku sampo berstandar ekspor.",
            realWorldImpact = "Menyerap ratusan ribu tenaga kerja industri hilir sawit dan memposisikan Indonesia sebagai episentrum industri oleokimia dan surfaktan global.",
            relatedCareers = listOf("Insinyur Kimia Oleokimia Sawit", "Formulator Produk Kosmetik & Surfaktan", "Manajer Pengendalian Mutu Biokimia"),
            verifiedSource = "Pusat Penelitian Kelapa Sawit (PPKS) Medan / Gabungan Pengusaha Kelapa Sawit Indonesia (GAPKI)."
        ),
        homeLab = HomeLabData(
            title = "Uji Amilum Karbohidrat pada Nasi Menggunakan Obat Luka Betadine (Uji Iodin)",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 piring kecil berisi 1 sendok nasi putih matang",
                "1 potong kecil tahu putih atau putih telur rebus (protein)",
                "Cairan obat luka antiseptik Betadine (mengandung povidone iodine)"
            ),
            steps = listOf(
                "Letakkan sesendok nasi putih dan sepotong tahu putih berdampingan di atas piring.",
                "Teteskan 2-3 tetes cairan obat luka Betadine (berwarna cokelat kemerahan) ke atas nasi putih.",
                "Teteskan juga 2-3 tetes Betadine ke atas potongan tahu putih.",
                "AMATI PERUBAHAN WARNANYA PADA NASI:\nDalam hitungan detik, tetesan Betadine cokelat pada nasi putih BERUBAH MENJADI BIRU KEHITAMAN GELAP PEKAT! (Uji Iodin positif membuktikan kandungan polisakarida amilum karbohidrat).",
                "Amati pada tahu putih: cairan Betadine TETAP BERWARNA COKELAT KUNING (negatif amilum, karena tahu mengandung protein bukan amilum)!"
            ),
            observationGoal = "Memahami prinsip uji spesifik biomolekul: molekul iodin menyelinap ke dalam struktur heliks amilosa karbohidrat menghasilkan kompleks warna biru kehitaman yang khas.",
            connectionToSimulation = "Bandingkan struktur heliks amilum dengan simulator makromolekul polimer Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-bp-1",
                prompt = "Bahan makanan yang ditetesi larutan Biuret menghasilkan perubahan warna menjadi UNGU. Hal ini membuktikan bahwa bahan makanan tersebut mengandung...",
                type = "multiple_choice",
                options = listOf("Protein (ikatan peptida)", "Glukosa (gula sederhana)", "Amilum (karbohidrat)", "Lemak jenuh"),
                correctAnswer = "Protein (ikatan peptida)",
                hints = listOf(
                    "Uji Biuret menggunakan larutan CuSO₄ encer dalam suasana basa.",
                    "Warna ungu muncul karena terbentuknya kompleks koordinasi Cu²⁺ dengan ikatan peptida (-CO-NH-)."
                ),
                explanation = "Uji Biuret spesifik digunakan untuk mengidentifikasi keberadaan ikatan peptida pada molekul protein. Reaksi ion Cu²⁺ dalam suasana basa dengan ikatan peptida menghasilkan kompleks berwarna ungu.",
                misconception = "Tertukar dengan uji Benedict/Fehling yang menghasilkan warna merah bata untuk gula pereduksi."
            ),
            QuizQuestion(
                id = "q-bp-2",
                prompt = "Polimer sintetis seperti Polietilena (plastik kantong kresek) dan PVC (pipa paralon) terbentuk melalui jenis reaksi polimerisasi...",
                type = "multiple_choice",
                options = listOf(
                    "Polimerisasi Adisi (pemutusan ikatan rangkap tanpa melepaskan molekul kecil)",
                    "Polimerisasi Kondensasi (dengan melepaskan molekul air)",
                    "Polimerisasi Oksidasi reduksi",
                    "Polimerisasi Saponifikasi"
                ),
                correctAnswer = "Polimerisasi Adisi (pemutusan ikatan rangkap tanpa melepaskan molekul kecil)",
                hints = listOf(
                    "Monomernya adalah etena yang memiliki ikatan rangkap dua C=C.",
                    "Ikatan rangkap membuka dan menyambung tanpa ada atom yang dibuang keluar."
                ),
                explanation = "Polietilena dan PVC terbentuk melalui polimerisasi adisi, di mana ikatan rangkap dua C=C pada monomer alkena membuka dan saling menyambung membentuk rantai jenuh panjang tanpa melepaskan molekul sampingan.",
                misconception = "Mengira semua plastik dibuat melalui polimerisasi kondensasi seperti nilon."
            )
        )
    )
}

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

object MathLevel2Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "mat-pecahan-rasio",
            domain = Domain.MATEMATIKA,
            topic = "Bilangan & Operasi",
            title = "Pecahan & Rasio",
            description = "Membagi keseluruhan menjadi bagian yang sama, menyederhanakan, dan membandingkan perbandingan.",
            level = DepthLevel.L2,
            estMinutes = 12,
            prerequisites = listOf("mat-membilang")
        ),
        ConceptItem(
            id = "mat-trigonometri-dasar",
            domain = Domain.MATEMATIKA,
            topic = "Geometri & Trigonometri",
            title = "Trigonometri Dasar",
            description = "Rasio sinus, cosinus, dan tangen pada segitiga siku-siku untuk mengukur jarak tak langsung.",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("mat-pecahan-rasio")
        ),
        ConceptItem(
            id = "mat-persamaan-linear",
            domain = Domain.MATEMATIKA,
            topic = "Aljabar",
            title = "Persamaan Linear Satu Variabel",
            description = "Menemukan nilai misteri dengan menjaga kedua sisi timbangan aljabar tetap seimbang.",
            level = DepthLevel.L2,
            estMinutes = 14,
            prerequisites = listOf("mat-pecahan-rasio")
        ),
        ConceptItem(
            id = "mat-bilangan-pangkat-akar",
            domain = Domain.MATEMATIKA,
            topic = "Pangkat & Akar",
            title = "Bilangan Berpangkat & Bentuk Akar",
            description = "Sifat perkalian/pembagian pangkat, bilangan pangkat nol dan negatif, serta menyederhanakan bentuk akar kuadrat.",
            level = DepthLevel.L2,
            estMinutes = 14,
            prerequisites = listOf("mat-pecahan-rasio")
        ),
        ConceptItem(
            id = "mat-pertidaksamaan",
            domain = Domain.MATEMATIKA,
            topic = "Aljabar",
            title = "Pertidaksamaan Linear Satu Variabel",
            description = "Konsep selang ketidaksamaan, aturan pembalikan tanda saat perkalian/pembagian negatif, dan grafik garis bilangan.",
            level = DepthLevel.L2,
            estMinutes = 13,
            prerequisites = listOf("mat-persamaan-linear")
        ),
        ConceptItem(
            id = "mat-spldv",
            domain = Domain.MATEMATIKA,
            topic = "Sistem Aljabar",
            title = "Sistem Persamaan Linear Dua Variabel (SPLDV)",
            description = "Menyelesaikan dua persamaan simultan dengan metode grafik, substitusi, eliminasi, dan metode campuran.",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("mat-persamaan-linear")
        ),
        ConceptItem(
            id = "mat-fungsi-grafik",
            domain = Domain.MATEMATIKA,
            topic = "Fungsi & Koordinat",
            title = "Fungsi, Koordinat Kartesius & Gradien",
            description = "Relasi, fungsi, domain-kodomain-range, persamaan garis lurus y = mx + c, serta gradien kemiringan.",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("mat-persamaan-linear")
        ),
        ConceptItem(
            id = "mat-pythagoras",
            domain = Domain.MATEMATIKA,
            topic = "Geometri Segitiga",
            title = "Teorema Pythagoras",
            description = "Hubungan kuadrat sisi siku-siku dan hipotenusa a² + b² = c², tripel Pythagoras, dan jarak dua titik.",
            level = DepthLevel.L2,
            estMinutes = 14,
            prerequisites = listOf("mat-bilangan-pangkat-akar")
        ),
        ConceptItem(
            id = "mat-kesebangunan",
            domain = Domain.MATEMATIKA,
            topic = "Geometri Lanjut",
            title = "Kesebangunan & Kekongruenan",
            description = "Syarat kekongruenan bangun datar dan perbandingan senilai sisi segitiga sebangun untuk mengukur tinggi tak terjangkau.",
            level = DepthLevel.L2,
            estMinutes = 14,
            prerequisites = listOf("mat-pythagoras")
        ),
        ConceptItem(
            id = "mat-transformasi",
            domain = Domain.MATEMATIKA,
            topic = "Transformasi Geometri",
            title = "Transformasi Geometri (Translasi, Refleksi, Rotasi, Dilatasi)",
            description = "Pergeseran vektor, pencerminan sumbu koordinat, perputaran sudut pusat, dan perbesaran faktor skala.",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("mat-fungsi-grafik")
        ),
        ConceptItem(
            id = "mat-peluang-dasar",
            domain = Domain.MATEMATIKA,
            topic = "Peluang & Probabilitas",
            title = "Peluang Dasar & Ruang Sampel",
            description = "Ruang sampel titik kejadian, frekuensi relatif, peluang teoretis kejadian tunggal, dan komplemen peluang.",
            level = DepthLevel.L2,
            estMinutes = 13,
            prerequisites = listOf("mat-pecahan-rasio")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "mat-pecahan-rasio" -> fractionLesson
            "mat-trigonometri-dasar" -> trigonometryLesson
            "mat-persamaan-linear" -> persamaanLinearLesson
            "mat-bilangan-pangkat-akar" -> pangkatAkarLesson
            "mat-pertidaksamaan" -> pertidaksamaanLesson
            "mat-spldv" -> spldvLesson
            "mat-fungsi-grafik" -> fungsiGrafikLesson
            "mat-pythagoras" -> pythagorasLesson
            "mat-kesebangunan" -> kesebangunanLesson
            "mat-transformasi" -> transformasiLesson
            "mat-peluang-dasar" -> peluangDasarLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. LESSON: PECAHAN & RASIO
    // =========================================================================
    private val fractionLesson = LessonData(
        conceptId = "mat-pecahan-rasio",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pfr1",
                panelNumber = 1,
                title = "Memotong Martabak Manis",
                caption = "Kirana membeli martabak manis keju-cokelat yang dipotong menjadi 8 bagian sama besar oleh penjualnya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jika aku makan 2 potong dan Dimas makan 2 potong, berapa bagian martabak yang sudah kami makan bersama?",
                sceneVisualEmoji = "🥞",
                sceneDescription = "Martabak manis bulat dipotong menjadi 8 juring lingkaran yang sama rata."
            ),
            StoryPanel(
                id = "pfr2",
                panelNumber = 2,
                title = "Menemukan Pecahan Senilai",
                caption = "Kakek menunjuk loyang martabak yang kini tersisa separuh persis.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kalian makan 4 potong dari 8 potong (4/8). Perhatikan loyang: 4/8 itu luasnya SAMA PERSIS dengan setengah loyang penuh (1/2)! Inilah pecahan senilai!",
                sceneVisualEmoji = "💡",
                sceneDescription = "Visualisasi 4/8 disederhanakan menjadi 1/2 dengan luas daerah arsiran yang identik."
            ),
            StoryPanel(
                id = "pfr3",
                panelNumber = 3,
                title = "Rasio Sirup Manis",
                caption = "Bu Ratna sedang meracik es sirup coco pandan untuk hidangan berbuka puasa.",
                dialogueSpeaker = "Bu Ratna",
                dialogueText = "Resepnya: 1 gelas sirup kental dicampur 4 gelas air putih. Rasio sirup terhadap air adalah 1 : 4. Kalau mau buat 10 gelas minuman, berapa gelas sirup yang dibutuhkan?",
                sceneVisualEmoji = "🍹",
                sceneDescription = "Gelas ukur memperlihatkan perbandingan konsentrasi sirup merah dan air bening."
            ),
            StoryPanel(
                id = "pfr4",
                panelNumber = 4,
                title = "Pecahan Campuran & Persen",
                caption = "Dimas memperlihatkan baterai tablet yang terisi 75%.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Aha! 75% baterai itu artinya 75 per 100, atau setara dengan 3/4 penuh! Semua konsep ini saling bersaudara!",
                sceneVisualEmoji = "🔋",
                sceneDescription = "Indikator baterai 75% dihubungkan dengan diagram lingkaran 3/4."
            )
        ),
        intuitionTitle = "Membagi Adil: Konsep Pembilang & Penyebut",
        intuitionBody = "Pecahan a/b menyatakan a bagian dari keseluruhan b bagian yang sama besar.\n\n" +
                "• Pembilang (a): Berapa bagian yang kita miliki atau bicarakan.\n" +
                "• Penyebut (b): Menjadi berapa bagian keseluruhan benda itu dibagi sama rata.\n" +
                "• Pecahan Senilai: Mengalikan atau membagi pembilang dan penyebut dengan angka yang sama tidak mengubah nilai pecahan (contoh: 2/4 = 1/2).\n" +
                "• Penjumlahan/Pengurangan Pecahan: Hanya bisa dilakukan jika penyebutnya sudah SAMA. Jika beda, samakan dengan mencari KPK penyebutnya!",
        intuitionPoints = listOf(
            "Penyebut pecahan TIDAK BOLEH bernilai nol (0) karena pembagian dengan nol tidak terdefinisi.",
            "Mengalikan dua pecahan dilakukan langsung: pembilang × pembilang, penyebut × penyebut.",
            "Membagi dengan pecahan sama dengan mengalikan dengan kebalikannya: (a/b) ÷ (c/d) = (a/b) × (d/c)."
        ),
        simId = "sim-fraction",
        formulas = listOf(
            FormulaCard(
                symbol = "\\frac{a}{b} \\pm \\frac{c}{d}",
                equation = "\\frac{a}{b} + \\frac{c}{d} = \\frac{ad + bc}{bd}",
                meaning = "Penjumlahan dua pecahan dengan menyamakan penyebut via perkalian silang / KPK.",
                units = "Pecahan murni",
                applicationNote = "Contoh: 1/2 + 1/3 = (3 + 2)/6 = 5/6."
            ),
            FormulaCard(
                symbol = "\\text{Rasio } a : b",
                equation = "\\text{Rasio} = \\frac{a}{b}",
                meaning = "Perbandingan kuantitatif antara besaran a dan besaran b.",
                units = "Tanpa satuan (skalar murni)",
                applicationNote = "Digunakan pada skala peta, perbandingan resep makanan, dan rasio roda gigi transmisi."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Perbandingan Rasio Semen, Pasir, dan Kerikil Konstruksi Bendungan",
            context = "Pembangunan Bendungan Sepaku Semoi di IKN membutuhkan campuran beton cor mutu tinggi (K-350) yang kokoh menahan tekanan air waduk jutaan meter kubik.",
            engineeringProblem = "Campuran semen terlalu encer membuat beton retak rembes air, sedangkan semen berlebih memboroskan anggaran proyek puluhan miliar.",
            physicalConceptUsed = "Rasio stoikiometri campuran agregat padat beton standar SNI.",
            mathematicalModel = "Insinyur sipil menerapkan rasio berat semen : pasir : kerikil tepat 1 : 1,5 : 2,5 dengan rasio air-semen (water-cement ratio) maksimal 0,45.",
            realWorldImpact = "Menghasilkan dinding bendungan kedap air dengan kuat tekan 35 MPa yang mampu bertahan gempa hingga 100 tahun.",
            relatedCareers = listOf("Insinyur Sipil Material", "Quality Control Konstruksi", "Teknisi Laboratorium Beton"),
            verifiedSource = "Balai Jasa Konstruksi Kementerian PUPR / Standar Konstruksi Beton Indonesia."
        ),
        homeLab = HomeLabData(
            title = "Membuat Es Sirup dengan Berbagai Variasi Rasio Konsentrasi",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 botol sirup merah",
                "3 gelas plastik transparan yang sama (beri label A, B, C)",
                "Air putih bersih",
                "1 sendok makan untuk takaran"
            ),
            steps = listOf(
                "Langkah 1: Masukkan 1 sendok sirup ke Gelas A, 2 sendok ke Gelas B, dan 3 sendok ke Gelas C.",
                "Langkah 2: Tambahkan 5 sendok air putih ke masing-masing gelas. Aduk rata.",
                "Langkah 3: Amati kepekatan warna merah pada ketiga gelas dari atas meja.",
                "Langkah 4: Hitung rasio sirup:air masing-masing: Gelas A (1:5), Gelas B (2:5), Gelas C (3:5).",
                "Langkah 5: Cicipi setetes airnya: rasio sirup yang lebih tinggi menghasilkan rasa manis dan warna merah yang lebih pekat!"
            ),
            observationGoal = "Memahami hubungan langsung antara angka rasio fraksi dengan konsentrasi fisik larutan.",
            connectionToSimulation = "Bandingkan gelas sirup dengan simulator pecahan interaktif di aplikasi!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-frac-1",
                prompt = "Berapakah hasil dari penjumlahan pecahan 1/3 + 1/6?",
                type = "multiple_choice",
                options = listOf("1/2", "2/9", "2/6", "5/6"),
                correctAnswer = "1/2",
                hints = listOf(
                    "Samakan penyebutnya menjadi 6.",
                    "1/3 sama nilainya dengan 2/6.",
                    "2/6 + 1/6 = 3/6. Sederhanakan 3/6!"
                ),
                explanation = "1/3 = 2/6. Maka 2/6 + 1/6 = 3/6. Disederhanakan dengan membagi pembilang dan penyebut dengan 3 menghasilkan 1/2.",
                misconception = "Menjumlahkan langsung pembilang dan penyebut (1+1)/(3+6) = 2/9."
            )
        )
    )

    // =========================================================================
    // 2. LESSON: TRIGONOMETRI DASAR
    // =========================================================================
    private val trigonometryLesson = LessonData(
        conceptId = "mat-trigonometri-dasar",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "ptr1",
                panelNumber = 1,
                title = "Mengukur Tinggi Pohon Kelapa",
                caption = "Dimas berdiri 12 meter dari sebatang pohon kelapa yang menjulang tinggi di pinggir pantai.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kakek, bagaimana cara mengetahui tinggi puncak pohon itu tanpa harus memanjatnya dengan meteran?",
                sceneVisualEmoji = "🌴",
                sceneDescription = "Dimas mengamati puncak pohon kelapa dari jarak horizontal 12 meter."
            ),
            StoryPanel(
                id = "ptr2",
                panelNumber = 2,
                title = "Klinometer Sederhana",
                caption = "Kakek mengeluarkan busur derajat berbandul sedotan yang disebut klinometer.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Arahkan sedotan ke pucuk pohon! Sudut kemiringan pandangan matamu terhadap garis mendatar disebut Sudut Elevasi (θ). Sudut ini terbaca 45 derajat!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Klinometer busur derajat dengan benang pemberat mengukur sudut kemiringan 45 derajat."
            ),
            StoryPanel(
                id = "ptr3",
                panelNumber = 3,
                title = "Rasio Sisi Segitiga Ajaib",
                caption = "Kirana menggambar segitiga siku-siku besar di atas pasir pantai.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Trigonometri adalah bahasa perbandingan segitiga siku-siku! Sisi Depan, Sisi Samping, dan Sisi Miring (Hipotenusa). Sinus = Depan/Miring, Cosinus = Samping/Miring, Tangen = Depan/Samping!",
                sceneVisualEmoji = "🔺",
                sceneDescription = "Segitiga siku-siku dengan label jelas sisi depan, samping, dan miring."
            ),
            StoryPanel(
                id = "ptr4",
                panelNumber = 4,
                title = "Tinggi Pohon Terpecahkan!",
                caption = "Dimas mengalikan jarak horizontal dengan nilai Tangen 45 derajat (tan 45° = 1).",
                dialogueSpeaker = "Dimas",
                dialogueText = "Tinggi = Jarak × Tan 45° = 12 × 1 = 12 meter! Ditambah tinggi mataku 1,5 meter, tinggi total pohon adalah 13,5 meter! Ajaib sekali!",
                sceneVisualEmoji = "🎉",
                sceneDescription = "Dimas dan Kakek tersenyum berhasil mengukur tinggi pohon tanpa memanjat."
            )
        ),
        intuitionTitle = "Triangulasi: Mengukur Jagat Raya Tanpa Menyentuhnya",
        intuitionBody = "Trigonometri (dari bahasa Yunani trigonon = segitiga, metron = ukuran) menghubungkan sudut dengan perbandingan panjang sisi segitiga siku-siku.\n\n" +
                "Jembatan keledai populer bahasa Indonesia: 'Sindemi, Cossami, Tandesa':\n" +
                "• Sinus (θ) = DEpan / MIlir (Sin-De-Mi)\n" +
                "• Cosinus (θ) = SAmpi / MIlir (Cos-Sa-Mi)\n" +
                "• Tangen (θ) = DEpan / SAmpi (Tan-De-Sa) = Sin(θ) / Cos(θ)\n\n" +
                "Sudut Istimewa Wajib Ingat:\n" +
                "• 0°: sin=0, cos=1, tan=0\n" +
                "• 30°: sin=1/2, cos=1/2√3, tan=1/3√3\n" +
                "• 45°: sin=1/2√2, cos=1/2√2, tan=1\n" +
                "• 60°: sin=1/2√3, cos=1/2, tan=√3\n" +
                "• 90°: sin=1, cos=0, tan=tak terdefinisi",
        intuitionPoints = listOf(
            "Hipotenusa (sisi miring) selalu merupakan sisi terpanjang pada segitiga siku-siku, berada tepat di depan sudut 90°.",
            "Teorema Pythagoras selalu berlaku: (Depan)² + (Samping)² = (Miring)², yang melahirkan identitas sin²θ + cos²θ = 1.",
            "Tangen bernilai 1 tepat pada sudut 45°, yang artinya sisi depan dan sisi samping memiliki panjang yang SAMA PERSIS."
        ),
        simId = "sim-trigonometry",
        formulas = listOf(
            FormulaCard(
                symbol = "\\sin, \\cos, \\tan",
                equation = "\\sin\\theta = \\frac{y}{r} \\quad , \\quad \\cos\\theta = \\frac{x}{r} \\quad , \\quad \\tan\\theta = \\frac{y}{x}",
                meaning = "Rasio dasar trigonometri segitiga siku-siku pada koordinat Kartesius.",
                units = "Rasio murni",
                applicationNote = "Sin²θ + Cos²θ = 1 untuk sudut θ berapapun."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Survei Topografi & Pembangunan Jembatan Selat Sunda / IKN",
            context = "Insinyur geodesi mengukur kontur jurang dan bukit di Ibu Kota Nusantara (IKN) sebelum fondasi tiang jembatan ditancapkan.",
            engineeringProblem = "Pita meteran fisik tidak mungkin dibentangkan menyeberangi jurang sedalam 80 meter yang curam dan berbatu.",
            physicalConceptUsed = "Triangulasi optik menggunakan alat Theodolite / Total Station dengan laser distance meter dan sudut vertikal-horizontal.",
            mathematicalModel = "Jarak seberang d = L · cos(θ) dan selisih ketinggian h = L · sin(θ).",
            realWorldImpact = "Presisi sudut hingga 1/3600 derajat menjamin dua ujung jembatan yang dibangun dari dua bukit berbeda bertemu dengan deviasi kurang dari 5 mm.",
            relatedCareers = listOf("Surveyor Geodesi", "Insinyur Sipil Jalan & Jembatan", "Kartografer SIG"),
            verifiedSource = "Badan Informasi Geospasial (BIG) / Teknik Geodesi ITB."
        ),
        homeLab = HomeLabData(
            title = "Membuat Klinometer Sederhana dari Sedotan & Busur",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 buah busur derajat plastik",
                "1 sedotan minuman lurus",
                "Benang jahit 20 cm",
                "1 buah mur logam atau baut kecil sebagai pemberat",
                "Pita perekat/selotip"
            ),
            steps = listOf(
                "Rekatkan sedotan plastik di sepanjang garis lurus dasar busur derajat (sudut 0°-180°).",
                "Ikat benang di titik tengah busur dan pasang mur logam di ujung bawah benang.",
                "Bidik puncak pohon atau atap rumah melalui lubang sedotan.",
                "Tahan benang yang menjuntai di busur lalu baca sudut kemiringannya. Kurangi dari 90° untuk mendapatkan sudut elevasi θ.",
                "Ukur jarak kakimu ke dasar pohon, lalu kalikan dengan tan(θ) untuk mengetahui tinggi pohon!"
            ),
            observationGoal = "Membuktikan bahwa tinggi pohon dapat diukur akurat hanya dengan sedotan, benang, dan tabel tangen.",
            connectionToSimulation = "Gunakan simulator segitiga siku-siku interaktif di aplikasi untuk mencocokkan sudut yang kamu ukur!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-trig-1",
                prompt = "Dimas berdiri 20 meter dari tiang bendera. Sudut elevasi puncak tiang terbaca 45°. Jika tinggi mata Dimas 1,5 meter, berapakah tinggi tiang bendera? (tan 45° = 1)",
                type = "numeric",
                correctAnswer = "21.5",
                tolerance = 0.5f,
                unit = "meter",
                hints = listOf(
                    "Tinggi puncak dari mata = Jarak × tan 45° = 20 × 1 = 20 meter.",
                    "Tambahkan tinggi mata Dimas (1,5 m)."
                ),
                explanation = "Tinggi total = (20 × tan 45°) + 1,5 = 20 + 1,5 = 21,5 meter.",
                misconception = "Lupa menambahkan tinggi mata pengamat ke hasil perhitungan."
            )
        )
    )

    // =========================================================================
    // 3. LESSON: PERSAMAAN LINEAR SATU VARIABEL (PLSV)
    // =========================================================================
    private val persamaanLinearLesson = LessonData(
        conceptId = "mat-persamaan-linear",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "ppl1",
                panelNumber = 1,
                title = "Timbangan Neraca Pasar",
                caption = "Kakek menaruh kantong terigu misterius di piringan neraca kiri, dan menaruh anak timbangan 2 kg di sampingnya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Di piringan kanan ada anak timbangan 7 kg, dan neraca ini dalam posisi SEIMBANG datar sempurna! Berapakah berat kantong terigu misterius ini?",
                sceneVisualEmoji = "⚖️",
                sceneDescription = "Timbangan neraca seimbang dengan kantong x + 2 kg di kiri dan 7 kg di kanan."
            ),
            StoryPanel(
                id = "ppl2",
                panelNumber = 2,
                title = "Menjaga Keseimbangan Aljabar",
                caption = "Kirana mengambil anak timbangan 2 kg dari piringan kiri neraca.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Supaya neraca tetap seimbang, jika piringan kiri dikurangi 2 kg, maka piringan kanan juga WAJIB dikurangi 2 kg! 7 kg dikurangi 2 kg tersisa 5 kg!",
                sceneVisualEmoji = "✨",
                sceneDescription = "Kedua piringan dikurangi 2 kg secara adil menjaga timbangan tetap seimbang."
            ),
            StoryPanel(
                id = "ppl3",
                panelNumber = 3,
                title = "Lahirnya Huruf Variabel x",
                caption = "Dimas menuliskan persamaan aljabar di kertas.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kantong misterius itu kita sebut variabel 'x'! Kalimat matematikanya: x + 2 = 7. Maka x = 7 - 2 = 5 kg! Sederhana dan elegan!",
                sceneVisualEmoji = "📝",
                sceneDescription = "Notasi aljabar persamaan linear satu variabel x + 2 = 7."
            ),
            StoryPanel(
                id = "ppl4",
                panelNumber = 4,
                title = "Operasi Berpasangan",
                caption = "Kakek mengangguk bangga melihat kedua cucunya memahami prinsip dasar aljabar.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kunci aljabar adalah operasi invers berkebalikan: tambah berpasangan dengan kurang, kali berpasangan dengan bagi. Perlakukan kedua ruas secara adil!",
                sceneVisualEmoji = "🎯",
                sceneDescription = "Simbol matematika menunjukkan kesetaraan kedua sisi tanda sama dengan."
            )
        ),
        intuitionTitle = "Filosofi Neraca: Hukum Keadilan Dua Sisi Aljabar",
        intuitionBody = "Persamaan aljabar adalah pernyataan kesetaraan matematika yang dihubungkan dengan tanda sama dengan (=).\n\n" +
                "1. Prinsip Neraca Seimbang:\n" +
                "   Apa pun yang kamu lakukan pada Ruas Kiri, kamu WAJIB melakukan hal yang sama persis pada Ruas Kanan:\n" +
                "   • Jika ruas kiri ditambah c, ruas kanan harus ditambah c.\n" +
                "   • Jika ruas kiri dikurang c, ruas kanan harus dikurang c.\n" +
                "   • Jika ruas kiri dikali c, ruas kanan harus dikali c.\n" +
                "   • Jika ruas kiri dibagi c (c ≠ 0), ruas kanan harus dibagi c.\n\n" +
                "2. Bentuk Umum PLSV:\n" +
                "   ax + b = c (dengan a ≠ 0).\n" +
                "   Langkah penyelesaian: Pindahkan suku konstanta ke kanan (ax = c - b), lalu bagi dengan koefisien variabel (x = (c - b) / a).",
        intuitionPoints = listOf(
            "Tanda sama dengan (=) adalah poros neraca yang tidak boleh goyah.",
            "Variabel x hanyalah kotak misteri yang nilainya menunggu untuk diungkap.",
            "Memindahkan suku menyeberangi tanda sama dengan berarti mengubah tandanya menjadi operasi kebalikannya (+ jadi -, × jadi ÷)."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "ax + b = c",
                equation = "x = \\frac{c - b}{a} \\quad (a \\ne 0)",
                meaning = "Solusi tunggal Persamaan Linear Satu Variabel (PLSV).",
                units = "Nilai bilangan",
                applicationNote = "Contoh: 3x + 6 = 21 ⟹ 3x = 15 ⟹ x = 5."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Analisis Titik Impas (Break-Even Point) Warung Kopi UMKM",
            context = "Dimas membantu pamannya membuka kedai kopi susu gula aren dengan biaya sewa tempat tetap Rp 1.500.000 per bulan.",
            engineeringProblem = "Biaya bahan 1 cup kopi adalah Rp 5.000 dan dijual seharga Rp 15.000. Berapa cup kopi yang harus terjual agar warung tidak rugi (Break-Even)?",
            physicalConceptUsed = "Pemodelan aljabar PLSV: Pendapatan Total = Pengeluaran Total.",
            mathematicalModel = "15.000x = 1.500.000 + 5.000x ⟹ 10.000x = 1.500.000 ⟹ x = 150 cup.",
            realWorldImpact = "Menentukan target penjualan minimum harian (5 cup per hari) yang menjamin kelangsungan hidup bisnis UMKM keluarga.",
            relatedCareers = listOf("Akuntan Manajemen Bisnis", "Wirausahawan / Manajer UMKM", "Analis Keuangan"),
            verifiedSource = "Kementerian Koperasi dan UKM RI / Modul Literasi Keuangan Praktis."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Neraca Aljabar dengan Gantungan Baju Kawat",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 buah gantungan baju kawat/plastik (hanger)",
                "2 kantong plastik kresek kecil diikat di ujung kiri dan kanan hanger",
                "Koin pecahan uang logam bernilai sama sebagai pemberat"
            ),
            steps = listOf(
                "Langkah 1: Gantungkan hanger pada paku atau gagang pintu agar bisa berayun bebas seimbang.",
                "Langkah 2: Masukkan 1 kotak korek api tertutup (variabel x misteri) dan 3 koin ke kantong kiri.",
                "Langkah 3: Masukkan 8 koin ke kantong kanan hingga kedua kantong seimbang datar.",
                "Langkah 4: Terapkan aljabar: ambil 3 koin dari kantong kiri dan serentak ambil 3 koin dari kantong kanan.",
                "Langkah 5: Buka kotak korek api di kantong kiri dan hitung isinya: tepat ada 5 koin di dalamnya (x = 8 - 3 = 5)!"
            ),
            observationGoal = "Membuktikan secara visual hukum neraca ekuivalen aljabar satu variabel.",
            connectionToSimulation = "Bandingkan neraca gantungan baju dengan simulator neraca aljabar!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-plsv-1",
                prompt = "Selesaikan persamaan linear berikut untuk mencari nilai x: 2x + 6 = 16. Berapakah nilai x?",
                type = "numeric",
                correctAnswer = "5",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Kurangkan kedua ruas dengan 6: 2x = 16 - 6 = 10.",
                    "Bagi kedua ruas dengan 2: x = 10 / 2 = ...?"
                ),
                explanation = "2x + 6 = 16 ⟹ 2x = 10 ⟹ x = 5.",
                misconception = "Lupa membagi dengan koefisien 2 setelah mengurangkan."
            )
        )
    )

    // =========================================================================
    // 4. LESSON: BILANGAN BERPANGKAT & BENTUK AKAR
    // =========================================================================
    private val pangkatAkarLesson = LessonData(
        conceptId = "mat-bilangan-pangkat-akar",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "ppa1",
                panelNumber = 1,
                title = "Ledakan Pembelahan Bakteri",
                caption = "Di laboratorium biologi, Dimas mengamati 1 sel bakteri yang membelah diri menjadi 2 setiap 20 menit.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Awalnya 1, lalu jadi 2, lalu jadi 4, lalu jadi 8, lalu jadi 16! Jumlahnya berlipat ganda luar biasa cepat!",
                sceneVisualEmoji = "🧫",
                sceneDescription = "Sel bakteri membelah berlipat ganda secara eksponensial."
            ),
            StoryPanel(
                id = "ppa2",
                panelNumber = 2,
                title = "Kekuatan Bilangan Berpangkat",
                caption = "Kakek menuliskan notasi eksponen 2 pangkat n di papan tulis.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itulah eksponen! 2⁵ artinya 2 dikalikan dirinya sendiri sebanyak 5 kali (2 × 2 × 2 × 2 × 2 = 32). Angka 2 adalah basis dan 5 adalah pangkatnya!",
                sceneVisualEmoji = "📈",
                sceneDescription = "Grafik eksponensial menanjak tajam ke atas melambangkan percepatan pangkat."
            ),
            StoryPanel(
                id = "ppa3",
                panelNumber = 3,
                title = "Akar Kuadrat: Memutar Balik Waktu",
                caption = "Kirana menggambar persegi seluas 49 cm² di kertas.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jika luas persegi adalah 49 cm², berapa panjang sisi rusuknya? Kita mencari bilangan yang jika dikuadratkan menghasilkan 49: jawabannya adalah akar kuadrat dari 49, yaitu 7 cm!",
                sceneVisualEmoji = "🟩",
                sceneDescription = "Persegi luas 49 cm² dengan sisi rusuk 7 cm mengilustrasikan akar kuadrat."
            ),
            StoryPanel(
                id = "ppa4",
                panelNumber = 4,
                title = "Pangkat Nol & Negatif",
                caption = "Kakek menjelaskan keunikan pangkat nol dan negatif.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Setiap bilangan (selain nol) jika dipangkatkan 0 selalu bernilai 1! Dan pangkat negatif membalik posisi bilangan menjadi pecahan: a⁻ⁿ = 1 / aⁿ!",
                sceneVisualEmoji = "🔄",
                sceneDescription = "Diagram inversi pangkat negatif menjadi pecahan penyebut."
            )
        ),
        intuitionTitle = "Eksponen & Radikal: Bahasa Angka Raksasa & Renik",
        intuitionBody = "Perpangkatan adalah perkalian berulang dari bilangan pokok yang sama.\n\n" +
                "1. Sifat-Sifat Operasi Pangkat Bulat:\n" +
                "   • Perkalian Basis Sama: aᵐ × aⁿ = aᵐ⁺ⁿ\n" +
                "   • Pembagian Basis Sama: aᵐ / aⁿ = aᵐ⁻ⁿ\n" +
                "   • Pangkat Dipangkatkan: (aᵐ)ⁿ = aᵐⁿ\n" +
                "   • Perkalian Dipangkatkan: (ab)ⁿ = aⁿ × bⁿ\n" +
                "   • Pangkat Nol: a⁰ = 1 (untuk a ≠ 0)\n" +
                "   • Pangkat Negatif: a⁻ⁿ = 1 / aⁿ\n\n" +
                "2. Bentuk Akar Kuadrat (Radikal):\n" +
                "   • √a = b jika dan hanya jika b² = a (dengan a, b ≥ 0).\n" +
                "   • Perkalian Akar: √(a × b) = √a × √b (contoh: √50 = √(25 × 2) = 5√2).\n" +
                "   • Merasionalkan Penyebut: Kalikan dengan akar sekawan (contoh: a / √b = (a√b) / b).",
        intuitionPoints = listOf(
            "Basis bilangan berpangkat tidak boleh dijumlahkan pangkatnya jika operasinya adalah penjumlahan (contoh: 2³ + 2² ≠ 2⁵).",
            "Akar dari bilangan negatif (seperti √-4) bukan bilangan real, melainkan bilangan imajiner (2i).",
            "Pangkat pecahan menyatakan bentuk akar: a^(m/n) = akar pangkat n dari aᵐ."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "a^m \\cdot a^n",
                equation = "a^m \\times a^n = a^{m+n} \\quad , \\quad \\frac{a^m}{a^n} = a^{m-n}",
                meaning = "Sifat dasar operasi eksponen dengan basis pokok yang sama.",
                units = "Bilangan real",
                applicationNote = "Contoh: 2³ × 2⁴ = 2⁷ = 128."
            ),
            FormulaCard(
                symbol = "\\sqrt{ab}",
                equation = "\\sqrt{a \\cdot b} = \\sqrt{a} \\cdot \\sqrt{b} \\quad (a, b \\ge 0)",
                meaning = "Sifat perkalian bentuk akar untuk menyederhanakan radikal.",
                units = "Bentuk akar",
                applicationNote = "√72 = √(36 × 2) = 6√2."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Skala Magnitudo Gempa Bumi BMKG Indonesia",
            context = "Indonesia terletak di cincin api Pasifik (Ring of Fire) yang rawan gempa tektonik lempeng Indo-Australia dan Eurasia.",
            engineeringProblem = "Energi gempa bumi membentang dari getaran mikro hingga guncangan dahsyat berkekuatan triliunan Joule yang sulit ditulis dalam angka biasa.",
            physicalConceptUsed = "Skala logaritmik eksponensial basis 10 dan 10^1,5 (Skala Richter dan Moment Magnitudo Mw).",
            mathematicalModel = "Setiap kenaikan 1 skala magnitudo gempa mewakili kenaikan amplitudo gelombang seismik 10 kali lipat dan pelepasan energi sebesar 10^1,5 ≈ 31,6 kali lipat lebih dahsyat!",
            realWorldImpact = "Memberikan peringatan dini tsunami akurat dalam 3 menit setelah gempa terjadi untuk menyelamatkan jutaan penduduk pesisir.",
            relatedCareers = listOf("Seismolog / Geofisikawan BMKG", "Insinyur Sipil Tahan Gempa", "Analis Risiko Bencana Geologi"),
            verifiedSource = "Pusat Gempa Bumi dan Tsunami BMKG Indonesia."
        ),
        homeLab = HomeLabData(
            title = "Uji Eksponensial Lipatan Selembar Kertas HVS",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("1 lembar kertas koran atau kertas HVS ukuran A4"),
            steps = listOf(
                "Langkah 1: Ambil selembar kertas HVS (ketebalan 1 lapis = 2⁰).",
                "Langkah 2: Lipat kertas menjadi dua (tebal = 2 lapis = 2¹).",
                "Langkah 3: Lipat lagi menjadi dua (tebal = 4 lapis = 2²).",
                "Langkah 4: Lipat ketiga kali (8 lapis = 2³), keempat kali (16 lapis = 2⁴), kelima kali (32 lapis = 2⁵).",
                "Langkah 5: Coba lipat hingga 7 kali (128 lapis = 2⁷). Amati betapa tebal dan kerasnya kertas itu hingga sulit dilipat lagi oleh tangan kosong!"
            ),
            observationGoal = "Menyaksikan kecepatan pertumbuhan eksponensial 2ⁿ yang berlipat ganda secara mencengangkan.",
            connectionToSimulation = "Bandingkan grafik lipatan kertas dengan simulator fungsi eksponen!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-pangkat-1",
                prompt = "Berapakah hasil dari 2³ × 2²?",
                type = "numeric",
                correctAnswer = "32",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Gunakan sifat eksponen: aᵐ × aⁿ = aᵐ⁺ⁿ.",
                    "2³⁺² = 2⁵.",
                    "2 × 2 × 2 × 2 × 2 = ...?"
                ),
                explanation = "2³ × 2² = 2³⁺² = 2⁵ = 32.",
                misconception = "Mengalikan pangkatnya menjadi 2⁶ = 64."
            ),
            QuizQuestion(
                id = "q-pangkat-2",
                prompt = "Bentuk sederhana dari √48 adalah...",
                type = "multiple_choice",
                options = listOf("4√3", "3√4", "2√12", "6√2"),
                correctAnswer = "4√3",
                hints = listOf(
                    "Cari faktor bilangan kuadrat terbesar dari 48: 48 = 16 × 3.",
                    "√48 = √(16 × 3) = √16 × √3.",
                    "Berapakah akar dari 16?"
                ),
                explanation = "√48 = √(16 × 3) = √16 × √3 = 4√3.",
                misconception = "Mengira 2√12 sudah bentuk paling sederhana padahal 12 masih bisa disederhanakan."
            )
        )
    )

    // =========================================================================
    // 5. LESSON: PERTIDAKSAMAAN LINEAR SATU VARIABEL (PtLSV)
    // =========================================================================
    private val pertidaksamaanLesson = LessonData(
        conceptId = "mat-pertidaksamaan",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "ppt1",
                panelNumber = 1,
                title = "Batas Muatan Lift Gedung",
                caption = "Kirana dan rombongan keluarga hendak naik lift di sebuah gedung perkantoran. Di pintu lift tertulis: 'KAPASITAS MAKSIMUM 600 KG'.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kakek, jika berat rata-rata 1 orang adalah 65 kg, berapa orang paling banyak yang boleh masuk lift agar tidak kelebihan muatan?",
                sceneVisualEmoji = "🛗",
                sceneDescription = "Papan peringatan kapasitas maksimum beban muatan lift gedung."
            ),
            StoryPanel(
                id = "ppt2",
                panelNumber = 2,
                title = "Tanda Ketidaksamaan",
                caption = "Kakek menuliskan lambang 'kurang dari atau sama dengan' (≤) di buku saku.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ini bukan persamaan sama dengan (=), melainkan PERTIDAKSAMAAN! Berat total harus KURANG DARI ATAU SAMA DENGAN 600 kg: 65x ≤ 600!",
                sceneVisualEmoji = "⚠️",
                sceneDescription = "Simbol pertidaksamaan linear kurang dari atau sama dengan."
            ),
            StoryPanel(
                id = "ppt3",
                panelNumber = 3,
                title = "Hati-Hati dengan Angka Negatif!",
                caption = "Dimas memperingatkan aturan emas aljabar pertidaksamaan di papan tulis.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Ingat aturan khususnya! Jika kedua ruas dikali atau dibagi dengan bilangan NEGATIF, maka tanda pertidaksamaan WAJIB DIBALIK arahnya! Lebih kecil (<) berbalik jadi lebih besar (>)!",
                sceneVisualEmoji = "🔄",
                sceneDescription = "Panah tanda pertidaksamaan berbalik arah saat dikalikan dengan bilangan negatif."
            ),
            StoryPanel(
                id = "ppt4",
                panelNumber = 4,
                title = "Garis Bilangan Selang Jawaban",
                caption = "Kirana menggambar garis bilangan dengan bulatan tertutup dan daerah arsiran ke kiri.",
                dialogueSpeaker = "Kirana",
                dialogueText = "65x ≤ 600 menghasilkan x ≤ 9,23. Karena orang tidak bisa pecahan, maka jumlah orang terbanyak yang aman adalah 9 orang!",
                sceneVisualEmoji = "👥",
                sceneDescription = "9 orang di dalam lift menunjukkan batas aman sesuai kapasitas beban."
            )
        ),
        intuitionTitle = "Daerah Solusi: Pertidaksamaan & Aturan Pembalikan Tanda",
        intuitionBody = "Pertidaksamaan menyatakan hubungan urutan antar-dua ekspresi menggunakan lambang ketidaksamaan: < (kurang dari), ≤ (kurang dari sama dengan), > (lebih dari), atau ≥ (lebih dari sama dengan).\n\n" +
                "1. Karakteristik Solusi Pertidaksamaan:\n" +
                "   Tidak menghasilkan satu nilai tunggal, melainkan DAERAH HIMPUNAN SELESAIAN (interval) yang memuat tak hingga banyak bilangan.\n\n" +
                "2. Aturan Operasi pada Pertidaksamaan:\n" +
                "   • Menambah atau mengurang kedua ruas dengan bilangan apa pun: Tanda TETAP.\n" +
                "   • Mengali atau membagi kedua ruas dengan bilangan POSITIF: Tanda TETAP.\n" +
                "   • Mengali atau membagi kedua ruas dengan bilangan NEGATIF: Tanda WAJIB BERBALIK ARAH! (< menjadi >, ≤ menjadi ≥, dst.).\n\n" +
                "   Contoh mengapa tanda berbalik: Kita tahu 2 < 5. Jika dikalikan -1, apakah -2 < -5? SALAH! Yang benar adalah -2 > -5 (karena -2 ada di sebelah kanan -5 pada garis bilangan).",
        intuitionPoints = listOf(
            "Bulatan kosong (○) pada garis bilangan berarti angka batas TIDAK termasuk solusi (< atau >).",
            "Bulatan penuh (●) berarti angka batas TERMASUK sebagai solusi (≤ atau ≥).",
            "Jangan pernah lupa membalik tanda pertidaksamaan saat membagi dengan angka negatif."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "-x < a",
                equation = "-x < a \\implies x > -a",
                meaning = "Aturan pembalikan arah tanda pertidaksamaan saat dikalikan atau dibagi bilangan negatif (-1).",
                units = "Pertidaksamaan",
                applicationNote = "Contoh: -2x ≤ 10 ⟹ x ≥ 10 / (-2) ⟹ x ≥ -5."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengawasan Truk Muatan Lebih (ODOL) Jembatan Timbang Tol Cipularang",
            context = "Kementerian Perhubungan mengoperasikan jembatan timbang Weight In Motion (WIM) sensor otomatis di gerbang Tol Cipularang Jawa Barat.",
            engineeringProblem = "Truk tronton bermuatan batu bara dan pasir melebihi daya dukung jembatan beton memicu amblasnya jalan tol dan kecelakaan maut beruntun.",
            physicalConceptUsed = "Pertidaksamaan linear batas muatan gandar aman: Beban Gandar Total W ≤ Batas Maksimum Izin (JBI 21 ton).",
            mathematicalModel = "Sensor membaca berat tiap sumbu roda truk secara dinamis. Jika W_truk > 21.000 kg, sistem otomatis menyalakan alarm merah dan menurunkan portal gerbang untuk tilang elektronik.",
            realWorldImpact = "Menghemat anggaran perbaikan aspal jalan tol hingga triliunan rupiah per tahun dan menurunkan angka fatalitas kecelakaan truk hingga 60%.",
            relatedCareers = listOf("Penguji Kendaraan Bermotor Dishub", "Insinyur Perkerasan Jalan Tol", "Spesialis Sensor Transportasi"),
            verifiedSource = "Direktorat Lalu Lintas Jalan Kementerian Perhubungan RI / PT Jasa Marga."
        ),
        homeLab = HomeLabData(
            title = "Uji Beban Maksimum Elastisitas Kantong Plastik Belanjaan",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 kantong plastik kresek belanjaan tipis",
                "Buku tulis yang sama tebalnya sebagai satuan beban",
                "Timbangan dapur (jika ada)"
            ),
            steps = listOf(
                "Langkah 1: Masukkan buku satu per satu ke dalam kantong plastik kresek sambil dijinjing.",
                "Langkah 2: Amati pegangan kantong plastik: kantong masih kuat menahan hingga buku ke-5.",
                "Langkah 3: Saat buku ke-7 dimasukkan, pegangan plastik mulai meregang melar hampir putus.",
                "Langkah 4: Tuliskan pertidaksamaan kapasitas amannya: Jumlah Buku n ≤ 6 buku (atau Beban W ≤ 1,5 kg).",
                "Langkah 5: Simpulkan bahwa batasan keamanan dalam kehidupan sehari-hari selalu dirumuskan dalam bentuk pertidaksamaan matematis!"
            ),
            observationGoal = "Memahami konsep batas ambang aman pertidaksamaan pada daya tahan material.",
            connectionToSimulation = "Bandingkan grafik batas aman ini dengan simulator pertidaksamaan!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ptlsv-1",
                prompt = "Tentukan himpunan penyelesaian dari pertidaksamaan: -3x < 12. Manakah jawaban yang benar?",
                type = "multiple_choice",
                options = listOf("x > -4", "x < -4", "x > 4", "x < 4"),
                correctAnswer = "x > -4",
                hints = listOf(
                    "Bagi kedua ruas dengan -3.",
                    "Karena dibagi bilangan negatif (-3), tanda (<) harus DIBALIK menjadi (>).",
                    "12 ÷ (-3) = -4."
                ),
                explanation = "-3x < 12 ⟹ x > 12 / (-3) ⟹ x > -4. Tanda ketidaksamaan berbalik arah karena dibagi dengan bilangan negatif.",
                misconception = "Lupa membalik tanda sehingga menjawab x < -4."
            )
        )
    )

    // =========================================================================
    // 6. LESSON: SISTEM PERSAMAAN LINEAR DUA VARIABEL (SPLDV)
    // =========================================================================
    private val spldvLesson = LessonData(
        conceptId = "mat-spldv",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "psp1",
                panelNumber = 1,
                title = "Paket Belanja di Toko Buku",
                caption = "Kirana dan Dimas membeli alat tulis di Toko Buku Merdeka. Kasir memberikan dua paket berbeda dengan harga total.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Paket 1 berisi 2 buku dan 3 pensil seharga Rp 17.000. Paket 2 berisi 3 buku dan 2 pensil seharga Rp 18.000. Berapakah harga satuan untuk 1 buku dan 1 pensil?",
                sceneVisualEmoji = "📚",
                sceneDescription = "Dua paket tumpukan buku tulis dan pensil dengan struk harga masing-masing."
            ),
            StoryPanel(
                id = "psp2",
                panelNumber = 2,
                title = "Dua Persamaan yang Bersahabat",
                caption = "Dimas memodelkan masalah belanjaan menjadi dua variabel: x untuk harga buku dan y untuk harga pensil.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Persamaan 1: 2x + 3y = 17.000. Persamaan 2: 3x + 2y = 18.000. Ini dinamakan Sistem Persamaan Linear Dua Variabel (SPLDV)!",
                sceneVisualEmoji = "✏️",
                sceneDescription = "Dua persamaan linear dua variabel ditulis berdampingan di kertas."
            ),
            StoryPanel(
                id = "psp3",
                panelNumber = 3,
                title = "Metode Eliminasi: Singkirkan Salah Satu!",
                caption = "Kakek menunjukkan trik menyamakan koefisien pensil (y) agar bisa dihilangkan (dieliminasi).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kalikan Persamaan 1 dengan 2, dan kalikan Persamaan 2 dengan 3! Jumlah pensilnya menjadi sama-sama 6y! Saat dikurangkan, variabel pensil lenyap dan kita langsung tahu harga 1 buku x = Rp 4.000!",
                sceneVisualEmoji = "🎯",
                sceneDescription = "Operasi pengurangan dua baris persamaan mengeliminasi variabel y."
            ),
            StoryPanel(
                id = "psp4",
                panelNumber = 4,
                title = "Metode Substitusi & Titik Potong",
                caption = "Kirana memasukkan harga buku x = Rp 4.000 ke dalam persamaan untuk mencari harga pensil y.",
                dialogueSpeaker = "Kirana",
                dialogueText = "2(4.000) + 3y = 17.000 ⟹ 3y = 9.000 ⟹ y = Rp 3.000 untuk 1 pensil! Jika digambar pada grafik Kartesius, kedua garis lurus ini berpotongan tepat di koordinat (4000, 3000)!",
                sceneVisualEmoji = "📍",
                sceneDescription = "Dua garis lurus berpotongan di satu titik temu pada bidang koordinat."
            )
        ),
        intuitionTitle = "Misteri Dua Variabel: Eliminasi, Substitusi & Titik Temu",
        intuitionBody = "Sistem Persamaan Linear Dua Variabel (SPLDV) terdiri dari dua persamaan linear yang memiliki dua variabel yang sama (biasanya x dan y).\n\n" +
                "Bentuk Umum:\n" +
                "a₁x + b₁y = c₁\n" +
                "a₂x + b₂y = c₂\n\n" +
                "Empat Metode Penyelesaian:\n" +
                "1. Metode Eliminasi: Menyamakan koefisien salah satu variabel melalui perkalian silang, lalu menjumlahkan atau mengurangkan kedua persamaan untuk mengeliminasi (menghilangkan) variabel tersebut.\n" +
                "2. Metode Substitusi: Menyatakan satu variabel dalam variabel lain (misal x = ...), lalu menggantikannya ke persamaan kedua.\n" +
                "3. Metode Gabungan (Campuran): Eliminasi untuk mencari variabel pertama, lalu substitusi untuk mencari variabel kedua (metode paling cepat dan praktis!).\n" +
                "4. Metode Grafik: Menggambar kedua garis lurus di koordinat Kartesius. Titik potong kedua garis (x, y) adalah solusi tunggal sistem tersebut.",
        intuitionPoints = listOf(
            "Dua persamaan linear yang sejajar tidak memiliki titik potong (tidak ada solusi / himpunan kosong).",
            "Dua persamaan linear yang saling berhimpit memiliki tak terhingga banyak solusi penyelesaian.",
            "Metode campuran eliminasi-substitusi adalah teknik yang paling sering digunakan pada soal ujian dan kompetisi sains."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{SPLDV}",
                equation = "\\begin{cases} a_1 x + b_1 y = c_1 \\\\ a_2 x + b_2 y = c_2 \\end{cases}",
                meaning = "Bentuk baku sistem dua persamaan linear dua variabel serentak.",
                units = "Sistem aljabar",
                applicationNote = "Solusi unik (x, y) ada jika a₁/a₂ ≠ b₁/b₂ (garis tidak sejajar)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Penetapan Tarif Listrik Pascabayar & Beban Daya PT PLN (Persero)",
            context = "PT PLN menghitung tagihan rekening listrik pelanggan rumah tangga berdasarkan biaya beban daya tetap ditambah tarif pemakaian per kWh.",
            engineeringProblem = "Dua rumah pelanggan memiliki daya yang sama. Rumah A memakai 100 kWh dengan tagihan Rp 175.000. Rumah B memakai 250 kWh dengan tagihan Rp 392.500. Berapakah biaya beban tetap dan tarif per kWh sebenarnya?",
            physicalConceptUsed = "Pemodelan matematika SPLDV: Tagihan = Beban Tetap (x) + Pemakaian kWh × Tarif (y).",
            mathematicalModel = "Sistem: x + 100y = 175.000 dan x + 250y = 392.500. Dengan mengeliminasi x diperoleh 150y = 217.500 ⟹ y = Rp 1.450 per kWh, dan beban tetap x = Rp 30.000.",
            realWorldImpact = "Menghasilkan transparansi rincian tagihan rekening listrik bagi lebih dari 80 juta pelanggan rumah tangga di seluruh Indonesia.",
            relatedCareers = listOf("Tariff Analyst Perusahaan Utilitas", "Aktuaris Kebijakan Energi", "Konsultan Manajemen Finansial"),
            verifiedSource = "Kementerian Energi dan Sumber Daya Mineral (ESDM) / Tarif Dasar Listrik PLN."
        ),
        homeLab = HomeLabData(
            title = "Memecahkan Harga Rahasia 1 Buah Jeruk & 1 Buah Apel",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Beberapa buah jeruk dan apel di dapur (atau benda kecil lain)",
                "Kertas catatan dan pulpen"
            ),
            steps = listOf(
                "Langkah 1: Buat dua kelompok belanjaan pura-pura di atas meja.",
                "Langkah 2: Paket A: 1 apel + 2 jeruk = 8 kancing. Paket B: 2 apel + 1 jeruk = 10 kancing.",
                "Langkah 3: Tuliskan persamaan aljabarnya: x + 2y = 8 dan 2x + y = 10.",
                "Langkah 4: Kalikan Paket A dengan 2: 2x + 4y = 16. Kurangkan dengan Paket B: 3y = 6 ⟹ y = 2 kancing (harga jeruk).",
                "Langkah 5: Masukkan nilai y ke Paket A: x + 2(2) = 8 ⟹ x = 4 kancing (harga apel)!"
            ),
            observationGoal = "Mempraktikkan penyelesaian SPLDV eliminasi-substitusi pada benda konkret nyata.",
            connectionToSimulation = "Bandingkan titik potong garis ini dengan simulator grafik Kartesius!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-spldv-1",
                prompt = "Diberikan sistem persamaan: x + y = 10 dan x - y = 4. Berapakah nilai x dan y?",
                type = "multiple_choice",
                options = listOf("x = 7, y = 3", "x = 8, y = 2", "x = 6, y = 4", "x = 5, y = 5"),
                correctAnswer = "x = 7, y = 3",
                hints = listOf(
                    "Jumlahkan kedua persamaan: (x + y) + (x - y) = 10 + 4.",
                    "2x = 14 ⟹ x = 7.",
                    "Masukkan x = 7 ke x + y = 10 ⟹ y = 10 - 7 = 3."
                ),
                explanation = "Jumlahkan kedua persamaan untuk mengeliminasi y: 2x = 14 ⟹ x = 7. Substitusikan x = 7 ke persamaan pertama: 7 + y = 10 ⟹ y = 3. Jadi solusi adalah (7, 3).",
                misconception = "Salah menjumlahkan persamaan saat mengeliminasi."
            )
        )
    )

    // =========================================================================
    // 7. LESSON: FUNGSI, KOORDINAT KARTESIUS & GRADIEN
    // =========================================================================
    private val fungsiGrafikLesson = LessonData(
        conceptId = "mat-fungsi-grafik",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pfg1",
                panelNumber = 1,
                title = "Tanjakan Maut Sitinjau Lauik",
                caption = "Keluarga Kirana melintasi tanjakan jalan raya Sitinjau Lauik di Sumatera Barat. Bus dan truk besar merayap perlahan mendaki jalan curam.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ayah, jalan ini curam sekali! Bagaimana para insinyur jalan mengukur kemiringan tanjakan gunung?",
                sceneVisualEmoji = "⛰️",
                sceneDescription = "Jalan aspal berkelok mendaki lereng gunung yang sangat curam."
            ),
            StoryPanel(
                id = "pfg2",
                panelNumber = 2,
                title = "Gradien: Rasio Tegak terhadap Datar",
                caption = "Kakek menggambar segitiga tanjakan di bidang koordinat Kartesius.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kemiringan tanjakan dalam matematika disebut GRADIEN (m)! Gradien adalah perbandingan perubahan ketinggian tegak (Δy) terhadap jarak mendatar (Δx): m = Δy / Δx!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Diagram koordinat sumbu X dan Y dengan garis lurus miring memiliki gradien m."
            ),
            StoryPanel(
                id = "pfg3",
                panelNumber = 3,
                title = "Persamaan Garis Lurus: y = mx + c",
                caption = "Dimas menunjukkan rumus terkenal persamaan garis lurus.",
                dialogueSpeaker = "Dimas",
                dialogueText = "y = mx + c! Huruf m adalah gradien kemiringan garis, dan c adalah titik potong garis di sumbu vertikal Y saat x = 0!",
                sceneVisualEmoji = "📈",
                sceneDescription = "Garis lurus y = mx + c memotong sumbu Y di titik (0, c)."
            ),
            StoryPanel(
                id = "pfg4",
                panelNumber = 4,
                title = "Konsep Relasi & Fungsi",
                caption = "Kirana tersenyum memahami mesin fungsi matematika.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Fungsi f(x) itu seperti mesin pembuat jus: masukkan satu buah apel (domain), mesin akan mengeluarkan tepat satu gelas jus apel (range). Setiap input x selalu dipasangkan dengan tepat satu output y!",
                sceneVisualEmoji = "⚙️",
                sceneDescription = "Diagram panah fungsi memetakan setiap anggota himpunan asal ke himpunan kawan."
            )
        ),
        intuitionTitle = "Peta Koordinat Kartesius: Bahasa Geometri Analitik",
        intuitionBody = "Sistem Koordinat Kartesius yang ditemukan oleh René Descartes menggabungkan aljabar dan geometri ke dalam bidang dua dimensi sumbu horizontal X dan sumbu vertikal Y.\n\n" +
                "1. Definisi Relasi & Fungsi:\n" +
                "   • Relasi: Aturan yang menghubungkan anggota himpunan A (Domain) ke himpunan B (Kodomain).\n" +
                "   • Fungsi (Pemetaan): Relasi khusus di mana SETIAP anggota Domain dipasangkan dengan TEPAT SATU anggota Kodomain.\n\n" +
                "2. Gradien Kemiringan Garis (m):\n" +
                "   • m = (Perubahan Vertikal Δy) / (Perubahan Horizontal Δx) = (y₂ - y₁) / (x₂ - x₁).\n" +
                "   • Garis menanjak ke kanan: m > 0 (positif).\n" +
                "   • Garis menurun ke kanan: m < 0 (negatif).\n" +
                "   • Garis mendatar horisontal: m = 0.\n" +
                "   • Garis tegak vertikal: m tidak terdefinisi.\n\n" +
                "3. Relasi Dua Garis:\n" +
                "   • Dua Garis Sejajar: Memiliki gradien sama persis (m₁ = m₂).\n" +
                "   • Dua Garis Tegak Lurus: Hasil kali gradiennya sama dengan -1 (m₁ × m₂ = -1 atau m₂ = -1/m₁).",
        intuitionPoints = listOf(
            "Uji Garis Vertikal (Vertical Line Test): Jika sebuah kurva dipotong oleh garis tegak vertikal lebih dari satu titik, maka kurva tersebut BUKAN fungsi.",
            "Persamaan garis melalui satu titik (x₁, y₁) dengan gradien m dirumuskan: y - y₁ = m(x - x₁).",
            "Titik potong sumbu X terjadi saat y = 0, dan titik potong sumbu Y terjadi saat x = 0."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "m",
                equation = "m = \\frac{y_2 - y_1}{x_2 - x_1} = \\frac{\\Delta y}{\\Delta x}",
                meaning = "Gradien kemiringan garis lurus melalui dua titik (x₁, y₁) dan (x₂, y₂).",
                units = "Kemiringan rasio",
                applicationNote = "Melalui (1, 2) dan (3, 6): m = (6 - 2) / (3 - 1) = 4 / 2 = 2."
            ),
            FormulaCard(
                symbol = "y = mx + c",
                equation = "y - y_1 = m(x - x_1) \\iff y = mx + c",
                meaning = "Persamaan eksplisit garis lurus dengan gradien m dan intersep sumbu Y c.",
                units = "Persamaan garis",
                applicationNote = "Persamaan garis dengan gradien 3 melalui titik (0, 4) adalah y = 3x + 4."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Rancang Bangun Kelandaian Maksimum Jalur Kereta Cepat Whoosh",
            context = "Kereta Cepat Jakarta-Bandung (Whoosh) melesat dengan kecepatan 350 km/jam melintasi pegunungan Purwakarta dan Padalarang.",
            engineeringProblem = "Roda baja kereta cepat memiliki friksi sangat rendah pada rel baja. Jika tanjakan rel terlalu curam (gradien terlalu besar), roda kereta akan selip (wheel slip) dan tidak mampu menanjak.",
            physicalConceptUsed = "Batas kelandaian gradien trase perkeretaapian standar UIC (International Union of Railways).",
            mathematicalModel = "Insinyur PT KCIC membatasi gradien tanjakan maksimum rel m ≤ 30 permil (30 mm per meter atau m ≤ 0,03). Lereng bukit yang terlalu terjal ditembus dengan membangun terowongan (tunnel) terpanjang 4,5 km di Walini.",
            realWorldImpact = "Memungkinkan kereta berkecepatan 350 km/jam melaju mulus menanjak pegunungan Bandung Barat dengan stabilitas dan keselamatan 100%.",
            relatedCareers = listOf("Insinyur Geometri Trase Jalan Rel", "Perancang Terowongan & Jembatan", "Ahli Sistem Traksi Kereta"),
            verifiedSource = "PT Kereta Cepat Indonesia China (KCIC) & Standar Teknis Ditjen Perkeretaapian Kemenhub."
        ),
        homeLab = HomeLabData(
            title = "Menghitung Gradien Kemiringan Tangga Rumah dengan Meteran",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("Pita meteran gulung atau penggaris panjang", "Kertas dan pulpen"),
            steps = listOf(
                "Langkah 1: Pergilah ke tangga rumahmu (atau tangga jalan undakan).",
                "Langkah 2: Ukur tinggi tegak satu anak tangga (Δy) dalam centimeter (misal: 18 cm).",
                "Langkah 3: Ukur panjang pijakan mendatar satu anak tangga (Δx) dalam centimeter (misal: 27 cm).",
                "Langkah 4: Hitung gradien kemiringan tangga: m = Δy / Δx = 18 / 27 = 2/3 ≈ 0,67.",
                "Langkah 5: Bandingkan dengan tangga lain di sekolah atau masjid: tangga yang lebih landai memiliki gradien m yang lebih kecil dan terasa lebih nyaman dinaiki!"
            ),
            observationGoal = "Mengukur langsung gradien kemiringan benda fisik nyata di kehidupan sehari-hari.",
            connectionToSimulation = "Bandingkan kemiringan tanggamu dengan simulator fungsi garis lurus di aplikasi!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-grad-1",
                prompt = "Berapakah gradien (m) dari garis lurus yang melalui titik A(1, 2) dan titik B(4, 8)?",
                type = "numeric",
                correctAnswer = "2",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Gunakan rumus gradien: m = (y₂ - y₁) / (x₂ - x₁).",
                    "y₂ - y₁ = 8 - 2 = 6.",
                    "x₂ - x₁ = 4 - 1 = 3.",
                    "Hitung 6 dibagi 3."
                ),
                explanation = "m = (8 - 2) / (4 - 1) = 6 / 3 = 2.",
                misconception = "Membalik rumus menjadi (x₂ - x₁) / (y₂ - y₁)."
            )
        )
    )

    // =========================================================================
    // 8. LESSON: TEOREMA PYTHAGORAS
    // =========================================================================
    private val pythagorasLesson = LessonData(
        conceptId = "mat-pythagoras",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "ppy1",
                panelNumber = 1,
                title = "Tali 12 Simpul Tukang Bangunan Kuno",
                caption = "Kakek membawa seutas tali tambang yang memiliki 12 simpul dengan jarak antar-simpul yang sama rata.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ribuan tahun lalu sebelum ada penggaris siku, para tukang bangunan Mesir kuno menarik tali ini membentuk segitiga bersisi 3 simpul, 4 simpul, dan 5 simpul untuk menciptakan sudut siku-siku 90 derajat sempurna!",
                sceneVisualEmoji = "🪢",
                sceneDescription = "Tali bersimpul membentuk segitiga siku-siku dengan rasio sisi 3, 4, dan 5."
            ),
            StoryPanel(
                id = "ppy2",
                panelNumber = 2,
                title = "Luas Persegi Pythagoras",
                caption = "Dimas menggambar tiga buah persegi yang menempel di masing-masing sisi segitiga siku-siku.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Pythagoras membuktikannya secara matematis: Luas persegi pada sisi miring sama dengan jumlah luas persegi pada kedua sisi siku-sikunya! a² + b² = c²!",
                sceneVisualEmoji = "🟩",
                sceneDescription = "Persegi 3x3 (luas 9) dan persegi 4x4 (luas 16) dijumlahkan pas menjadi persegi sisi miring 5x5 (luas 25)."
            ),
            StoryPanel(
                id = "ppy3",
                panelNumber = 3,
                title = "Keluarga Tripel Pythagoras",
                caption = "Kirana mencatat pasangan angka ajaib yang memenuhi rumus Pythagoras.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ada pasangan bilangan bulat ajaib yang disebut Tripel Pythagoras: (3, 4, 5), (5, 12, 13), (7, 24, 25), (8, 15, 17), dan kelipatannya seperti (6, 8, 10)!",
                sceneVisualEmoji = "✨",
                sceneDescription = "Daftar tripel Pythagoras yang sering muncul pada perhitungan segitiga."
            ),
            StoryPanel(
                id = "ppy4",
                panelNumber = 4,
                title = "Menghitung Jarak Dua Titik",
                caption = "Dimas menarik garis miring antara dua titik pada peta koordinat GPS.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Teorema Pythagoras juga menjadi dasar jarak garis lurus di peta koordinat: d = √[(x₂ - x₁)² + (y₂ - y₁)²]! Ajaib sekali penerapannya!",
                sceneVisualEmoji = "📍",
                sceneDescription = "Jarak miring dua titik pada bidang Kartesius dihitung menggunakan segitiga siku-siku."
            )
        ),
        intuitionTitle = "Harmoni Siku-Siku: Teorema Terpopuler Sepanjang Masa",
        intuitionBody = "Teorema Pythagoras adalah salah satu pilar geometri terpenting dalam sejarah peradaban manusia.\n\n" +
                "1. Bunyi Teorema Pythagoras:\n" +
                "   Pada setiap segitiga siku-siku, kuadrat panjang sisi miring (hipotenusa c) sama dengan jumlah kuadrat panjang kedua sisi siku-sikunya (a dan b):\n" +
                "   a² + b² = c²\n\n" +
                "2. Mencari Masing-Masing Sisi:\n" +
                "   • Mencari hipotenusa: c = √(a² + b²)\n" +
                "   • Mencari sisi siku-siku: a = √(c² - b²) atau b = √(c² - a²)\n\n" +
                "3. Kebalikan Teorema Pythagoras (Menentukan Jenis Segitiga):\n" +
                "   Diberikan sisi terpanjang c:\n" +
                "   • Jika c² = a² + b² ⟹ Segitiga SIKU-SIKU.\n" +
                "   • Jika c² < a² + b² ⟹ Segitiga LANCIP.\n" +
                "   • Jika c² > a² + b² ⟹ Segitiga TUMPUL.",
        intuitionPoints = listOf(
            "Hipotenusa (c) selalu merupakan sisi di depan sudut siku-siku 90° dan selalu sisi terpanjang.",
            "Tripel Pythagoras adalah tiga bilangan bulat positif yang memenuhi a² + b² = c² persis tanpa desimal.",
            "Rumus jarak Euclidean dua titik d = √[(Δx)² + (Δy)²] diturunkan langsung dari Teorema Pythagoras."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "a^2 + b^2 = c^2",
                equation = "c = \\sqrt{a^2 + b^2} \\quad , \\quad a = \\sqrt{c^2 - b^2}",
                meaning = "Teorema Pythagoras pada segitiga siku-siku dengan hipotenusa c.",
                units = "Satuan panjang",
                applicationNote = "Jika a = 6 dan b = 8, maka c = √(36 + 64) = √100 = 10."
            ),
            FormulaCard(
                symbol = "d_{\\text{jarak}}",
                equation = "d = \\sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}",
                meaning = "Jarak garis lurus terpendek antara dua titik pada koordinat Kartesius 2D.",
                units = "Satuan panjang",
                applicationNote = "Dasar algoritma GPS dan navigasi rute Google Maps."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Rangka Kuda-Kuda Baja Ringan Atap Rumah Joglo Nusantara",
            context = "Arsitek merancang atap limasan tradisional rumah Joglo di Yogyakarta menggunakan profil baja ringan tahan rayap dan angin kencang.",
            engineeringProblem = "Panjang bentang bentangan rumah adalah 12 meter dan tinggi puncak atap dirancang 4,5 meter. Berapa panjang batang kasau baja miring yang harus dipotong?",
            physicalConceptUsed = "Teorema Pythagoras pada segitiga siku-siku separuh bentang atap.",
            mathematicalModel = "Separuh bentang alas = 12 / 2 = 6 meter. Tinggi tiang t = 4,5 meter. Panjang kasau miring c = √(6² + 4,5²) = √(36 + 20,25) = √56,25 = 7,5 meter.",
            realWorldImpact = "Menghindari pemotongan baja ringan yang keliru, memangkas limbah material hingga 20%, dan menjamin sudut kemiringan atap ideal 37° agar air hujan deras segera mengalir tanpa bocor.",
            relatedCareers = listOf("Insinyur Sipil Perancang Rangka Atap", "Arsitek Bangunan Tropis", "Estimator Konstruksi Baja"),
            verifiedSource = "Himpunan Ahli Konstruksi Indonesia (HAKI) / Pedoman Teknis Konstruksi Rumah Tahan Gempa."
        ),
        homeLab = HomeLabData(
            title = "Membuat Sudut Siku-Siku 90° Tepat dengan Tali 12 Ruas (Tripel 3-4-5)",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Tali kasur atau benang jahit panjang 1,5 meter",
                "Spidol untuk menandai simpul",
                "Penggaris 30 cm",
                "3 buah paku payung atau paku kecil di lantai kayu/kardus"
            ),
            steps = listOf(
                "Langkah 1: Tandai tali dengan spidol setiap jarak 10 cm sebanyak 12 ruas sama panjang.",
                "Langkah 2: Sambungkan ujung awal dan ujung akhir tali menjadi lingkaran tertutup (total 12 ruas keliling).",
                "Langkah 3: Tancapkan paku pertama di titik nol. Tarik 3 ruas dan tancapkan paku kedua (panjang sisi a = 3 ruas).",
                "Langkah 4: Tarik 4 ruas berikutnya tegak lurus dan tancapkan paku ketiga (panjang sisi b = 4 ruas).",
                "Langkah 5: Rentangkan sisa 5 ruas untuk menutup segitiga ke paku pertama (panjang sisi miring c = 5 ruas).",
                "Langkah 6: Cek sudut antara sisi 3 dan 4 dengan busur derajat: sudutnya tepat 90 derajat sempurna!"
            ),
            observationGoal = "Membuktikan secara langsung bahwa tripel 3-4-5 selalu membentuk sudut siku-siku 90° sempurna.",
            connectionToSimulation = "Bandingkan segitiga talimu dengan simulator Pythagoras interaktif!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-pyth-1",
                prompt = "Sebuah segitiga siku-siku memiliki panjang sisi siku-siku a = 9 cm dan b = 12 cm. Berapakah panjang sisi miringnya (c)?",
                type = "numeric",
                correctAnswer = "15",
                tolerance = 0.1f,
                unit = "cm",
                hints = listOf(
                    "Gunakan rumus c = √(a² + b²).",
                    "a² = 9² = 81.",
                    "b² = 12² = 144.",
                    "81 + 144 = 225. Berapakah akar dari 225?"
                ),
                explanation = "c = √(9² + 12²) = √(81 + 144) = √225 = 15 cm. (Ini adalah kelipatan 3 dari tripel 3-4-5: 3×3=9, 3×4=12, 3×5=15).",
                misconception = "Menjumlahkan langsung 9 + 12 = 21 tanpa mengkuadratkannya."
            )
        )
    )

    // =========================================================================
    // 9. LESSON: KESEBANGUNAN & KEKONGRUENAN
    // =========================================================================
    private val kesebangunanLesson = LessonData(
        conceptId = "mat-kesebangunan",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pks1",
                panelNumber = 1,
                title = "Dua Pasfoto Ukuran Berbeda",
                caption = "Kirana mencetak pasfoto untuk buku rapor sekolah dalam dua ukuran: 2×3 cm dan 4×6 cm.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Wajahku di kedua foto tampak persis sama tanpa gepeng atau lonjong, padahal yang satu dua kali lebih besar dari yang satunya!",
                sceneVisualEmoji = "🖼️",
                sceneDescription = "Dua pasfoto dengan perbandingan skala ukuran yang sebangun sempurna."
            ),
            StoryPanel(
                id = "pks2",
                panelNumber = 2,
                title = "Kongruen (Kembar Identik) vs Sebangun",
                caption = "Kakek menjelaskan perbedaan dua konsep geometri ini.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kongruen artinya SAMA BENTUK dan SAMA UKURAN (seperti dua ubin keramik yang bertumpuk pas). Sebangun artinya SAMA BENTUK tetapi UKURANNYA BERBEDA secara proporsional (seperti foto 2×3 dan 4×6)!",
                sceneVisualEmoji = "📐",
                sceneDescription = "Diagram bangun kongruen (ukuran identik) dan bangun sebangun (faktor skala perbesaran)."
            ),
            StoryPanel(
                id = "pks3",
                panelNumber = 3,
                title = "Segitiga Sebangun Bayangan Tiang Bendera",
                caption = "Dimas berdiri tegak di samping tiang bendera sekolah di tengah terik matahari.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Tinggi badanku 150 cm punya bayangan 100 cm. Di saat yang sama, bayangan tiang bendera panjangnya 400 cm! Berapa tinggi tiang bendera?",
                sceneVisualEmoji = "☀️",
                sceneDescription = "Sinar matahari membentuk dua segitiga sebangun dari tubuh Dimas dan tiang bendera."
            ),
            StoryPanel(
                id = "pks4",
                panelNumber = 4,
                title = "Perbandingan Sisi yang Sebanding",
                caption = "Kirana menghitung perbandingan segitiga sebangun dengan cepat.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Tinggi tiang / Tinggi Dimas = Bayangan tiang / Bayangan Dimas! Tinggi tiang / 150 = 400 / 100 = 4! Maka tinggi tiang = 4 × 150 = 600 cm (6 meter)!",
                sceneVisualEmoji = "🚩",
                sceneDescription = "Tiang bendera setinggi 6 meter berhasil diukur lewat bayangan segitiga sebangun."
            )
        ),
        intuitionTitle = "Prinsip Proporsi Bentuk: Kesebangunan & Kekongruenan",
        intuitionBody = "Dua bangun geometri dapat memiliki hubungan kekongruenan atau kesebangunan berdasarkan bentuk dan ukurannya.\n\n" +
                "1. Kekongruenan (≅):\n" +
                "   • Dua bangun datar dikatakan kongruen jika memiliki bentuk DAN ukuran yang sama persis (dapat saling menutupi sempurna saat ditumpuk).\n" +
                "   • Syarat Segitiga Kongruen: Sisi-Sisi-Sisi (s-s-s), Sisi-Sudut-Sisi (s-sd-s), Sudut-Sisi-Sudut (sd-s-sd).\n\n" +
                "2. Kesebangunan (~):\n" +
                "   • Dua bangun datar dikatakan sebangun jika memiliki bentuk yang sama, sudut-sudut bersesuaian sama besar, dan perbandingan panjang sisi-sisi yang bersesuaian SENILAI.\n" +
                "   • Syarat Segitiga Sebangun:\n" +
                "     - Sudut-sudut yang bersesuaian sama besar (sd-sd-sd).\n" +
                "     - Sisi-sisi yang bersesuaian memiliki perbandingan yang sama (a₁/a₂ = b₁/b₂ = c₁/c₂).",
        intuitionPoints = listOf(
            "Semua lingkaran di alam semesta pasti sebangun satu sama lain.",
            "Semua persegi dan semua segitiga sama sisi pasti sebangun satu sama lain.",
            "Dua bangun yang kongruen pasti sebangun, tetapi dua bangun yang sebangun belum tentu kongruen."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Kesebangunan}",
                equation = "\\frac{a_1}{a_2} = \\frac{b_1}{b_2} = \\frac{c_1}{c_2} = k",
                meaning = "Rasio perbandingan sisi bersesuaian pada dua segitiga sebangun bernilai faktor skala k.",
                units = "Rasio skala",
                applicationNote = "Tinggi tiang / Tinggi tongkat = Bayangan tiang / Bayangan tongkat."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Fotogrametri Drone Pemetaan Batas Kadastral Tanah ATR/BPN",
            context = "Kementerian Agraria dan Tata Ruang / Badan Pertanahan Nasional (ATR/BPN) menerbangkan drone kamera untuk program Pendaftaran Tanah Sistematis Lengkap (PTSL).",
            engineeringProblem = "Bagaimana mengukur batas patok tanah sawah dan pekarangan warga seluas ribuan hektar dari foto udara tanpa harus menarik meteran fisik di lumpur sawah?",
            physicalConceptUsed = "Prinsip kesebangunan segitiga optik kamera drone (Focal Length / Altitude = Image Sensor Size / Ground Coverage).",
            mathematicalModel = "Tinggi terbang drone h = 100 m dan panjang fokus lensa f = 24 mm. Rasio kesebangunan f / h = sensor / ground footprint menghasilkan Ground Sampling Distance (GSD) 2 cm per piksel foto.",
            realWorldImpact = "Menerbitkan sertifikat tanah legal bagi jutaan masyarakat desa di pelosok Nusantara dengan batas bidang tanah yang presisi dan bebas konflik.",
            relatedCareers = listOf("Pilot Drone Pemetaan Geospasial", "Surveyor Kadastral BPN", "Insinyur Fotogrametri Digital"),
            verifiedSource = "Kementerian ATR/BPN RI / Asosiasi Pilot Drone Indonesia (APDI)."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Tinggi Tiang Lampu Jalan Memanfaatkan Tongkat Pramuka Sebangun",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("1 tongkat pramuka atau kayu lurus 1 meter", "Pita meteran gulung", "Hari cerah bersinar matahari"),
            steps = listOf(
                "Langkah 1: Berdirikan tongkat pramuka 1 meter (100 cm) tegak lurus di tanah datar saat matahari miring (pagi jam 09.00 atau sore jam 15.00).",
                "Langkah 2: Ukur panjang bayangan tongkat di tanah dengan meteran (misalnya: 50 cm).",
                "Langkah 3: Segera ukur panjang bayangan tiang lampu jalan di dekatmu (misalnya: 250 cm).",
                "Langkah 4: Hitung dengan kesebangunan segitiga bayangan: Tinggi Tiang = (Bayangan Tiang / Bayangan Tongkat) × Tinggi Tongkat = (250 / 50) × 100 cm = 5 × 100 cm = 500 cm (5 meter)!"
            ),
            observationGoal = "Menggunakan prinsip kesebangunan bayangan matahari untuk mengukur ketinggian benda nyata di luar ruangan.",
            connectionToSimulation = "Bandingkan segitiga bayangan ini dengan simulator kesebangunan geometri!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sebangun-1",
                prompt = "Sebuah tongkat setinggi 2 meter memiliki bayangan sepanjang 3 meter di tanah. Pada saat yang sama, sebuah pohon memiliki bayangan sepanjang 15 meter. Berapakah tinggi pohon tersebut?",
                type = "numeric",
                correctAnswer = "10",
                tolerance = 0.1f,
                unit = "meter",
                hints = listOf(
                    "Gunakan perbandingan segitiga sebangun: Tinggi Pohon / Tinggi Tongkat = Bayangan Pohon / Bayangan Tongkat.",
                    "Tinggi Pohon / 2 = 15 / 3 = 5.",
                    "Tinggi Pohon = 5 × 2 = ...?"
                ),
                explanation = "Tinggi Pohon = (15 / 3) × 2 meter = 5 × 2 = 10 meter.",
                misconception = "Salah memposisikan pembilang dan penyebut perbandingan."
            )
        )
    )

    // =========================================================================
    // 10. LESSON: TRANSFORMASI GEOMETRI
    // =========================================================================
    private val transformasiLesson = LessonData(
        conceptId = "mat-transformasi",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "ptg1",
                panelNumber = 1,
                title = "Keindahan Motif Batik Kawung & Parang",
                caption = "Di galeri batik Yogyakarta, Kirana dan Bu Ratna mengagumi selembar kain batik tulis klasik bermotif Kawung yang berulang simetris.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ibu, pola elips kelopak buah kawung ini berulang rapi sekali: ada yang digeser, dicerminkan, dan diputar secara teratur!",
                sceneVisualEmoji = "🎨",
                sceneDescription = "Kain batik tradisional dengan motif geometris berulang yang simetris dan indah."
            ),
            StoryPanel(
                id = "ptg2",
                panelNumber = 2,
                title = "Empat Jurus Transformasi Geometri",
                caption = "Kakek menjelaskan konsep transformasi geometri yang menjadi rahasia di balik seni batik dan grafika komputer.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ada 4 transformasi dasar: Translasi (pergeseran), Refleksi (pencerminan), Rotasi (perputaran sudut), dan Dilatasi (perbesaran/pengecilan faktor skala)!",
                sceneVisualEmoji = "🔄",
                sceneDescription = "Visualisasi 4 operasi transformasi geometri pada bidang koordinat Kartesius."
            ),
            StoryPanel(
                id = "ptg3",
                panelNumber = 3,
                title = "Refleksi Cermin & Bayangan",
                caption = "Dimas bercermin di cermin datar wastafel.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Saat aku bercermin, jarak bayanganku ke cermin sama persis dengan jarak tubuhku ke cermin! Jika dicerminkan terhadap sumbu X, titik (x, y) berubah menjadi (x, -y)!",
                sceneVisualEmoji = "🪞",
                sceneDescription = "Refleksi titik di cermin menunjukkan jarak yang sama ke garis pencerminan."
            ),
            StoryPanel(
                id = "ptg4",
                panelNumber = 4,
                title = "Dilatasi Zoom Kamera Ponsel",
                caption = "Kirana mencubit layar smartphone untuk melakukan zoom foto (perbesaran gambar).",
                dialogueSpeaker = "Kirana",
                dialogueText = "Fitur zoom 2× di kamera HP adalah Dilatasi dengan faktor skala k = 2 berpusat di tengah layar! Semua koordinat piksel dikalikan 2: (x, y) menjadi (2x, 2y)!",
                sceneVisualEmoji = "📱",
                sceneDescription = "Gerakan mencubit zoom layar smartphone mengilustrasikan dilatasi faktor skala."
            )
        ),
        intuitionTitle = "Seni Mengubah Posisi & Bentuk: Translasi, Refleksi, Rotasi & Dilatasi",
        intuitionBody = "Transformasi geometri memindahkan atau mengubah posisi/ukuran setiap titik pada bidang koordinat Kartesius ke posisi baru (x', y').\n\n" +
                "1. Translasi (Pergeseran Vektor T = [a, b]):\n" +
                "   Memindahkan setiap titik sejauh a mendatar dan b tegak tanpa memutar bentuk.\n" +
                "   (x', y') = (x + a, y + b)\n\n" +
                "2. Refleksi (Pencerminan):\n" +
                "   • Terhadap sumbu X: (x', y') = (x, -y)\n" +
                "   • Terhadap sumbu Y: (x', y') = (-x, y)\n" +
                "   • Terhadap garis y = x: (x', y') = (y, x)\n" +
                "   • Terhadap titik asal (0, 0): (x', y') = (-x, -y)\n\n" +
                "3. Rotasi (Perputaran Berpusat di (0,0)):\n" +
                "   • Rotasi +90° (berlawanan jarum jam): (x', y') = (-y, x)\n" +
                "   • Rotasi +180°: (x', y') = (-x, -y)\n" +
                "   • Rotasi +270° (atau -90°): (x', y') = (y, -x)\n\n" +
                "4. Dilatasi (Perbesaran/Pengecilan Pusat (0,0) Faktor Skala k):\n" +
                "   (x', y') = (k × x, k × y)\n" +
                "   Jika k > 1 (diperbesar), jika 0 < k < 1 (diperkecil). Luas bangun bayangan menjadi k² × luas asal!",
        intuitionPoints = listOf(
            "Translasi, Refleksi, dan Rotasi adalah Transformasi Isometri: mempertahankan bentuk dan ukuran bangun asal tetap sama (kongruen).",
            "Dilatasi mengubah ukuran bangun sehingga bayangannya sebangun dengan bangun aslinya (luas berubah sebanding k²).",
            "Sudut putaran rotasi positif berarti berlawanan arah putaran jarum jam."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Translasi}",
                equation = "\\begin{pmatrix} x' \\\\ y' \\end{pmatrix} = \\begin{pmatrix} x \\\\ y \\end{pmatrix} + \\begin{pmatrix} a \\\\ b \\end{pmatrix}",
                meaning = "Pergeseran titik (x, y) sejauh vektor translasi [a, b].",
                units = "Koordinat Kartesius",
                applicationNote = "Titik (2, 3) ditranslasikan T = [3, -1] menjadi (5, 2)."
            ),
            FormulaCard(
                symbol = "\\text{Dilatasi } [O, k]",
                equation = "(x', y') = (kx, ky) \\quad , \\quad L' = k^2 \\cdot L",
                meaning = "Perbesaran titik berpusat di titik asal O(0,0) dengan faktor skala k.",
                units = "Koordinat & Luas",
                applicationNote = "Jika segitiga seluas 10 cm² didilatasi k = 3, luas bayangannya menjadi 3² × 10 = 90 cm²."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Software Animasi 3D Studio Animasi Nusantara (KIKO & Si Unyil)",
            context = "Studio animasi komputer di Jakarta dan Bandung merender pergerakan karakter kartun animasi 3D untuk serial televisi anak Indonesia.",
            engineeringProblem = "Bagaimana menggerakkan, memutar, dan memperbesar model karakter 3D yang tersusun dari ratusan ribu poligon titik mesh secara halus 60 frame per detik?",
            physicalConceptUsed = "Matriks Transformasi Affine 4x4 (Translasi, Rotasi Euler, dan Penskalaan Dilatasi) yang diproses secara paralel oleh GPU komputer grafis.",
            mathematicalModel = "Posisi setiap simpul poligon vektor v' = M_rotasi × M_skala × v + T. Kartu grafis menghitung perkalian jutaan matriks transformasi per detik secara real-time.",
            realWorldImpact = "Menghasilkan serial animasi lokal berkualitas setara studio internasional yang digemari puluhan juta anak di seluruh Tanah Air.",
            relatedCareers = listOf("Technical Director Animasi 3D", "Game Engine Programmer", "Pengembang Grafika Komputer"),
            verifiedSource = "MNC Animation / Asosiasi Industri Animasi Indonesia (AINAKI)."
        ),
        homeLab = HomeLabData(
            title = "Membuat Pola Motif Batik Fraktal dari Kertas Lipat Cermin",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("1 lembar kertas origami bujur sangkar", "Gunting kertas (hati-hati)", "Pensil"),
            steps = listOf(
                "Langkah 1: Lipat kertas origami secara diagonal membentuk segitiga (garis refleksi cermin y = x).",
                "Langkah 2: Lipat lagi menjadi dua segitiga lebih kecil (refleksi kedua).",
                "Langkah 3: Gambar pola lengkungan motif bunga kecil di tepi kertas yang terlipat.",
                "Langkah 4: Gunting mengikuti pola garis tersebut.",
                "Langkah 5: Buka seluruh lipatan kertas: amati pola indah yang simetris 4 arah akibat perpaduan refleksi ganda dan rotasi 90 derajat!"
            ),
            observationGoal = "Memahami penerapan konkret konsep simetri lipat dan transformasi refleksi pada penciptaan seni rupa.",
            connectionToSimulation = "Bandingkan pola origami dengan simulator transformasi bidang di aplikasi!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-trans-1",
                prompt = "Titik A(3, -2) dicerminkan (refleksi) terhadap sumbu X. Koordinat bayangan titik A' adalah...",
                type = "multiple_choice",
                options = listOf("(3, 2)", "(-3, -2)", "(-3, 2)", "(2, 3)"),
                correctAnswer = "(3, 2)",
                hints = listOf(
                    "Pencerminan terhadap sumbu X mengubah nilai y menjadi lawannya: (x, y) → (x, -y).",
                    "Nilai x tetap 3, nilai y berubah dari -2 menjadi -(-2) = 2."
                ),
                explanation = "Pencerminan terhadap sumbu X: (x, y) ⟹ (x, -y). Jadi titik A(3, -2) menjadi A'(3, -(-2)) = A'(3, 2).",
                misconception = "Mengubah tanda x dan y sekaligus (menyamakan dengan pencerminan titik asal)."
            )
        )
    )

    // =========================================================================
    // 11. LESSON: PELUANG DASAR & RUANG SAMPEL
    // =========================================================================
    private val peluangDasarLesson = LessonData(
        conceptId = "mat-peluang-dasar",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "ppl-d1",
                panelNumber = 1,
                title = "Permainan Monopoli Keluarga",
                caption = "Malam minggu, Kirana dan Dimas bermain permainan papan monopoli keliling Nusantara bersama Kakek.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Aku butuh angka 6 pada dadu ini agar bisa mendarat di Hotel Borobudur! Berapa besar peluang angka 6 muncul dalam sekali lemparan dadu?",
                sceneVisualEmoji = "🎲",
                sceneDescription = "Dadu bermata 1 hingga 6 siap dilempar di atas papan monopoli."
            ),
            StoryPanel(
                id = "ppl-d2",
                panelNumber = 2,
                title = "Ruang Sampel: Semua Kemungkinan",
                caption = "Kakek mengambil dadu bermata 6 dan memperlihatkan setiap sisinya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sebuah dadu memiliki 6 sisi: {1, 2, 3, 4, 5, 6}. Himpunan semua kemungkinan hasil ini disebut Ruang Sampel S, dengan total n(S) = 6!",
                sceneVisualEmoji = "📦",
                sceneDescription = "Enam sisi dadu berjajar rapi melambangkan seluruh anggota ruang sampel S."
            ),
            StoryPanel(
                id = "ppl-d3",
                panelNumber = 3,
                title = "Rumus Peluang Teoretis P(A)",
                caption = "Kirana menghitung peluang munculnya angka 6.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Angka 6 hanya ada 1 sisi dari 6 sisi yang ada! Jadi peluangnya adalah 1 dibagi 6: P(6) = 1/6 (sekitar 16,7%)!",
                sceneVisualEmoji = "🎯",
                sceneDescription = "Pecahan 1/6 menyatakan rasio kejadian munculnya mata dadu 6 terhadap total sisi."
            ),
            StoryPanel(
                id = "ppl-d4",
                panelNumber = 4,
                title = "Peluang Pasti & Mustahil",
                caption = "Kakek tersenyum menjelaskan rentang nilai peluang.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Nilai peluang selalu berkisar antara 0 sampai 1! Peluang bernilai 0 berarti MUSTAHIL terjadi (seperti melempar dadu keluar angka 7). Peluang bernilai 1 berarti PASTI terjadi (seperti manusia bernapas membutuhkan udara)!",
                sceneVisualEmoji = "📏",
                sceneDescription = "Garis skala peluang dari angka 0 (mustahil) hingga angka 1 (pasti)."
            )
        ),
        intuitionTitle = "Matematika Ketidakpastian: Peluang, Titik Sampel & Harapan",
        intuitionBody = "Teori Peluang (Probabilitas) mengukur secara kuantitatif seberapa besar kemungkinan suatu kejadian acak akan terjadi.\n\n" +
                "1. Istilah Kunci Peluang:\n" +
                "   • Percobaan Acak: Aktivitas yang hasilnya tidak dapat dipastikan sebelumnya (contoh: melempar koin, mengocok kartu).\n" +
                "   • Ruang Sampel (S): Himpunan seluruh hasil yang mungkin terjadi dari suatu percobaan.\n" +
                "   • Titik Sampel n(S): Banyaknya anggota di dalam ruang sampel.\n" +
                "     - 1 Keping Koin: S = {Angka, Gambar} ⟹ n(S) = 2.\n" +
                "     - 1 Buah Dadu: S = {1, 2, 3, 4, 5, 6} ⟹ n(S) = 6.\n" +
                "     - 2 Keping Koin: n(S) = 2² = 4.\n" +
                "     - 2 Buah Dadu: n(S) = 6² = 36.\n\n" +
                "2. Rumus Peluang Teoretis Kejadian A:\n" +
                "   P(A) = n(A) / n(S)\n" +
                "   Rentang nilai: 0 ≤ P(A) ≤ 1.\n" +
                "   • P(A) = 0: Kejadian mustahil.\n" +
                "   • P(A) = 1: Kejadian pasti.\n\n" +
                "3. Komplemen Suatu Kejadian (Peluang Tidak Terjadi A):\n" +
                "   P(A') = 1 - P(A).\n\n" +
                "4. Frekuensi Harapan (Fh):\n" +
                "   Berapa kali suatu kejadian diharapkan muncul jika percobaan diulang sebanyak N kali:\n" +
                "   Fh = P(A) × N.",
        intuitionPoints = listOf(
            "Peluang tidak pernah bernilai negatif dan tidak pernah lebih dari 1.",
            "Jumlah total peluang semua kejadian saling lepas di ruang sampel selalu sama dengan 1.",
            "Semakin sering percobaan acak diulang (N besar), frekuensi relatif empiris akan semakin mendekati nilai peluang teoretisnya (Hukum Bilangan Besar)."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "P(A)",
                equation = "P(A) = \\frac{n(A)}{n(S)} \\quad (0 \\le P(A) \\le 1)",
                meaning = "Peluang teoretis terjadinya kejadian A dari ruang sampel S.",
                units = "Peluang murni (0..1) atau persen",
                applicationNote = "Peluang mata dadu genap {2, 4, 6}: P = 3/6 = 1/2 = 50%."
            ),
            FormulaCard(
                symbol = "F_h",
                equation = "F_h = P(A) \\times N",
                meaning = "Frekuensi harapan munculnya kejadian A dalam N kali percobaan.",
                units = "Banyaknya kali kemunculan",
                applicationNote = "Melempar koin 100 kali: Harapan muncul angka = 1/2 × 100 = 50 kali."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Analisis Probabilitas Presipitasi Prakiraan Cuaca Hujan BMKG",
            context = "Aplikasi Info BMKG menampilkan ramalan cuaca harian di kota-kota Indonesia dengan indikator 'Peluang Hujan: 70%'.",
            engineeringProblem = "Atmosfer bumi adalah sistem dinamis acak non-linear (teori chaos). Bagaimana para meteorolog menyatakan kepastian datangnya hujan?",
            physicalConceptUsed = "Probability of Precipitation (PoP) berbasis model ensemble radar cuaca Doppler dan satelit Himawari-9.",
            mathematicalModel = "PoP = C × A, di mana C adalah tingkat keyakinan meteorolog (confidence) bahwa hujan akan terbentuk di area perkiraan, dan A adalah persentase luas wilayah yang akan diguyur hujan.",
            realWorldImpact = "Membantu petani merencanakan musim tanam dan menjamin keselamatan operasional penerbangan maskapai Garuda Indonesia dari risiko turbulensi awan badai.",
            relatedCareers = listOf("Meteorolog / Prakirawan Cuaca BMKG", "Aktuaris Analis Risiko Bencana", "Spesialis Prediksi Iklim"),
            verifiedSource = "Pusat Meteorologi Penerbangan dan Publik BMKG Indonesia."
        ),
        homeLab = HomeLabData(
            title = "Uji Frekuensi Harapan dengan Melempar Koin 60 Kali",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("1 keping uang logam Rp 500 atau Rp 1.000", "Kertas catatan dan pulpen"),
            steps = listOf(
                "Langkah 1: Tentukan sisi Angka (A) dan sisi Gambar (G). Peluang teoretis masing-masing adalah P = 1/2 = 0,5.",
                "Langkah 2: Jika dilempar N = 60 kali, frekuensi harapan sisi Angka muncul adalah Fh = 1/2 × 60 = 30 kali.",
                "Langkah 3: Lemparkan koin ke atas meja sebanyak 60 kali, catat setiap hasil menggunakan tanda turus di tabel.",
                "Langkah 4: Hitung berapa kali sisi Angka benar-benar muncul (misalnya muncul 28 atau 32 kali).",
                "Langkah 5: Amati: meskipun tidak tepat 30 kali karena faktor keacakan, hasilnya akan sangat mendekati angka 30!"
            ),
            observationGoal = "Membuktikan Hukum Bilangan Besar (Law of Large Numbers) dan validitas rumus frekuensi harapan peluang.",
            connectionToSimulation = "Bandingkan lemparan koinmu dengan simulator dadu & koin peluang di aplikasi!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-pel-1",
                prompt = "Sebuah dadu bermata 6 dilempar satu kali. Berapakah peluang munculnya mata dadu BILANGAN PRIMA?",
                type = "multiple_choice",
                options = listOf("1/2", "1/3", "1/6", "2/3"),
                correctAnswer = "1/2",
                hints = listOf(
                    "Ruang sampel dadu: S = {1, 2, 3, 4, 5, 6}, n(S) = 6.",
                    "Bilangan prima pada dadu adalah: {2, 3, 5}, ada 3 angka.",
                    "Peluang = 3 / 6. Sederhanakan pecahan ini!"
                ),
                explanation = "Bilangan prima pada dadu adalah 2, 3, dan 5 (ada 3 kejadian). Maka peluangnya P = 3/6 = 1/2.",
                misconception = "Menganggap angka 1 adalah bilangan prima sehingga menghitung 4/6."
            ),
            QuizQuestion(
                id = "q-pel-2",
                prompt = "Sebuah koin dilemparkan sebanyak 80 kali. Berapakah frekuensi harapan munculnya sisi gambar?",
                type = "numeric",
                correctAnswer = "40",
                tolerance = 0.1f,
                unit = "kali",
                hints = listOf(
                    "Peluang muncul gambar pada koin adalah P = 1/2.",
                    "Frekuensi Harapan = P × N = 1/2 × 80.",
                    "Hitung separuh dari 80."
                ),
                explanation = "Fh = P(Gambar) × N = 1/2 × 80 = 40 kali.",
                misconception = "Mengalikan dengan angka 2 alih-alih 1/2."
            )
        )
    )
}

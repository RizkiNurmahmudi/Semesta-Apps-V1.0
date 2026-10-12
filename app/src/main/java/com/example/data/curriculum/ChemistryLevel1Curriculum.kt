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

object ChemistryLevel1Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "kim-materi-sifat",
            domain = Domain.KIMIA,
            topic = "Wujud & Sifat Zat",
            title = "Materi, Wujud Zat & Perubahan Kimia",
            description = "Mengenal susunan partikel padat/cair/gas, membedakan perubahan fisika vs kimia, dan hukum kekekalan massa Lavoisier.",
            level = DepthLevel.L1,
            estMinutes = 12,
            prerequisites = emptyList()
        ),
        ConceptItem(
            id = "kim-campuran-pemisahan",
            domain = Domain.KIMIA,
            topic = "Pemisahan Campuran",
            title = "Campuran, Koloid & Metode Pemisahan",
            description = "Membedakan larutan homogen, suspensi, dan koloid, serta teknik pemisahan: filtrasi, kristalisasi, distilasi, dan kromatografi kertas.",
            level = DepthLevel.L1,
            estMinutes = 13,
            prerequisites = listOf("kim-materi-sifat")
        ),
        ConceptItem(
            id = "kim-unsur-senyawa",
            domain = Domain.KIMIA,
            topic = "Blok Dasar Materi",
            title = "Unsur, Senyawa & Lambang Kimia",
            description = "Mengenal atom unsur tunggal, lambang Berzelius, molekul senyawa rumus tetap (H₂O, NaCl, CO₂), dan perbedaan molekul unsur vs molekul senyawa.",
            level = DepthLevel.L1,
            estMinutes = 12,
            prerequisites = listOf("kim-materi-sifat")
        ),
        ConceptItem(
            id = "kim-asam-basa-dasar",
            domain = Domain.KIMIA,
            topic = "Zat Rumah Tangga",
            title = "Asam, Basa & Garam Sehari-hari",
            description = "Karakteristik asam cuka/sitrun, basa sabun kapur, garam dapur, uji indikator alami kunyit/kol ungu, dan reaksi netralisasi.",
            level = DepthLevel.L1,
            estMinutes = 13,
            prerequisites = listOf("kim-campuran-pemisahan")
        ),
        ConceptItem(
            id = "kim-keselamatan-lab",
            domain = Domain.KIMIA,
            topic = "Laboratorium Sains",
            title = "Keselamatan Kerja & Alat Laboratorium",
            description = "Mengenal alat gelas standar laboratorium (tabung reaksi, erlenmeyer, buret), simbol bahaya bahan kimia GHS, APD, dan tata tertib keselamatan.",
            level = DepthLevel.L1,
            estMinutes = 11,
            prerequisites = emptyList()
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "kim-materi-sifat" -> materiSifatLesson
            "kim-campuran-pemisahan" -> campuranPemisahanLesson
            "kim-unsur-senyawa" -> unsurSenyawaLesson
            "kim-asam-basa-dasar" -> asamBasaDasarLesson
            "kim-keselamatan-lab" -> keselamatanLabLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. MATERI, WUJUD ZAT & PERUBAHAN KIMIA
    // =========================================================================
    private val materiSifatLesson = LessonData(
        conceptId = "kim-materi-sifat",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pms1",
                panelNumber = 1,
                title = "Misteri Lilin Ulang Tahun",
                caption = "Kirana dan Dimas memperhatikan lilin ulang tahun yang menyala di atas meja kue.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lihat Kakek, lilinnya meleleh jadi cairan bening di sekitar sumbu, tapi asap hitam juga membubung ke atas! Mana yang perubahan fisika dan mana yang kimia?",
                sceneVisualEmoji = "🕯️",
                sceneDescription = "Lilin menyala dengan lelehan parafin di dasar sumbu dan asap membubung."
            ),
            StoryPanel(
                id = "pms2",
                panelNumber = 2,
                title = "Partikel yang Menari",
                caption = "Kakek mengambil es batu dari gelas sirup dan meletakkannya di piring kecil.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Saat es meleleh jadi air lalu menguap jadi uap air, susunan molekul H₂O di dalamnya hanya bergerak lebih bebas tanpa berubah menjadi zat baru. Itulah Perubahan Fisika!",
                sceneVisualEmoji = "🧊",
                sceneDescription = "Es batu mencair menjadi air cair, menunjukkan perubahan wujud tanpa zat baru."
            ),
            StoryPanel(
                id = "pms3",
                panelNumber = 3,
                title = "Zat Baru Telah Lahir!",
                caption = "Dimas menunjukkan sumbu lilin yang terbakar menghitam dan menghasilkan gas karbondioksida.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Sedangkan parafin dan sumbu yang terbakar menghasilkan zat baru: gas CO₂ dan uap air yang tidak bisa dikembalikan lagi menjadi lilin utuh. Ini adalah Perubahan Kimia!",
                sceneVisualEmoji = "🔥",
                sceneDescription = "Pembakaran sumbu melepaskan gas dan panas, tanda pasti perubahan kimia."
            )
        ),
        intuitionTitle = "Dunia Partikel: Wujud Zat & Transformasi Materi",
        intuitionBody = "Segala sesuatu di alam semesta yang memiliki massa dan menempati ruang disebut MATERI.\n\n" +
                "1. Tiga Wujud Utama Materi:\n" +
                "   • Padat: Partikel tersusun sangat rapat, teratur, dan hanya bergetar di tempatnya (bentuk & volume tetap).\n" +
                "   • Cair: Partikel berdekatan tetapi dapat mengalir meluncur bebas (volume tetap, bentuk mengikuti wadah).\n" +
                "   • Gas: Partikel berjauhan, bergerak sangat cepat ke segala arah secara acak (bentuk & volume berubah mengisi seluruh ruang).\n\n" +
                "2. Perubahan Fisika vs Perubahan Kimia:\n" +
                "   • Perubahan Fisika: Perubahan wujud, ukuran, atau bentuk tanpa menghasilkan zat jenis baru (contoh: es mencair, gula larut dalam air, kayu dipotong jadi kursi).\n" +
                "   • Perubahan Kimia: Reaksi kimia yang memutus ikatan atom lama dan membentuk zat baru dengan sifat berbeda. Ciri-cirinya: timbul gas/gelembung, endapan, perubahan warna permanen, atau perubahan energi panas.",
        intuitionPoints = listOf(
            "Massa tidak pernah hilang: Menurut Hukum Lavoisier, total massa zat sebelum dan sesudah perubahan kimia selalu SAMA PERSIS.",
            "Melarutkan gula ke dalam air adalah perubahan fisika karena air gula bisa dikeringkan kembali menjadi kristal gula murni lewat penguapan.",
            "Karat pada paku besi adalah contoh perubahan kimia di mana atom besi bereaksi dengan oksigen dan air membentuk karat Fe₂O₃."
        ),
        simId = "sim-matter",
        formulas = listOf(
            FormulaCard(
                symbol = "\\rho",
                equation = "\\rho = \\frac{m}{V}",
                meaning = "Massa jenis kerapatan materi: massa per satuan volume.",
                units = "kg/m³ atau g/cm³",
                applicationNote = "Benda dengan massa jenis lebih kecil dari air (1 g/cm³) akan terapung di permukaan."
            ),
            FormulaCard(
                symbol = "\\text{Hukum Lavoisier}",
                equation = "\\sum m_{\\text{reaktan}} = \\sum m_{\\text{produk}}",
                meaning = "Hukum Kekekalan Massa dalam sistem tertutup.",
                units = "gram (g) atau kilogram (kg)",
                applicationNote = "Massa lilin + oksigen yang terbakar tepat sama dengan massa abu + gas CO₂ + uap air yang dihasilkan."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Distilasi Fraksinasi Minyak Bumi di Kilang Pertamina RU IV Cilacap",
            context = "Minyak bumi mentah (crude oil) yang dipompa dari perut bumi merupakan campuran ratusan senyawa hidrokarbon berwujud cair kental pekat.",
            engineeringProblem = "Pesawat jet membutuhkan avtur cair ringan, mobil butuh bensin, dan kapal butuh solar, namun semuanya masih tercampur menjadi satu dalam minyak mentah.",
            physicalConceptUsed = "Teknik pemisahan fisik berbasis perbedaan titik didih: Distilasi Fraksinasi bertingkat pada menara kolom fraksinasi raksasa setinggi 50 meter.",
            mathematicalModel = "Gradien suhu kolom diatur dari 350°C di bagian bawah hingga 25°C di puncak kolom. Gas elpiji keluar di puncak (<20°C), bensin terkondensasi pada 40–200°C, solar pada 250–350°C, dan residu aspal mengendap di dasar.",
            realWorldImpact = "Menyediakan 34% kebutuhan bahan bakar minyak nasional Indonesia dan 60% kebutuhan avtur di Pulau Jawa secara efisien tanpa mengubah struktur molekul minyak secara destruktif.",
            relatedCareers = listOf("Insinyur Proses Kilang Minyak", "Teknisi Operasi Kimia", "Analis Laboratorium Petrokimia"),
            verifiedSource = "PT Pertamina (Persero) Refinery Unit IV Cilacap."
        ),
        homeLab = HomeLabData(
            title = "Membedakan Perubahan Fisika (Pelarutan Gula) & Perubahan Kimia (Balon Gas Cuka)",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "2 sendok makan gula pasir dan 1 gelas air bening",
                "1 botol plastik bekas 330 ml",
                "3 sendok makan cuka dapur",
                "1 sendok makan soda kue",
                "1 buah balon karet"
            ),
            steps = listOf(
                "Percobaan 1 (Fisika): Masukkan gula pasir ke dalam air, aduk hingga larut bening. Cicipi setetes airnya: rasa manis membuktikan sifat gula tidak berubah!",
                "Percobaan 2 (Kimia): Masukkan 3 sendok cuka ke dalam botol plastik.",
                "Masukkan 1 sendok soda kue ke dalam balon karet menggunakan corong kecil.",
                "Pasang mulut balon ke bibir botol tanpa menjatuhkan soda kue terlebih dahulu.",
                "Tegakkan balon agar soda kue tumpah ke dalam cuka. Amati: timbul buih gelembung deras dan balon mengembang terisi gas CO₂ dingin!"
            ),
            observationGoal = "Menyaksikan bukti visual pembentukan zat gas baru (CO₂) pada perubahan kimia vs bertahannya sifat manis pada pelarutan fisika.",
            connectionToSimulation = "Bandingkan interaksi partikel cair dan gas pada simulator materi interaktif di Semesta!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mat-sif-1",
                prompt = "Manakah dari peristiwa berikut yang merupakan contoh Perubahan Kimia?",
                type = "multiple_choice",
                options = listOf("Es mencair di mangkuk", "Kertas terbakar menjadi abu", "Garam larut dalam kuah sup", "Lilin parafin meleleh karena panas"),
                correctAnswer = "Kertas terbakar menjadi abu",
                hints = listOf(
                    "Cari peristiwa yang menghasilkan zat baru yang tidak dapat dikembalikan ke wujud asalnya.",
                    "Pembakaran selalu menghasilkan zat kimia baru seperti gas karbondioksida dan abu."
                ),
                explanation = "Kertas terbakar adalah perubahan kimia karena selulosa kayu bereaksi dengan oksigen menghasilkan zat baru (abu karbon dan gas CO₂). Es mencair, garam larut, dan lilin meleleh adalah perubahan fisika.",
                misconception = "Mengira lilin yang meleleh adalah perubahan kimia, padahal lelehan lilin tetaplah parafin murni."
            ),
            QuizQuestion(
                id = "q-mat-sif-2",
                prompt = "Ciri-ciri manakah yang membuktikan bahwa suatu reaksi kimia telah terjadi?",
                type = "multiple_choice",
                options = listOf(
                    "Terbentuk endapan atau timbul gelembung gas baru",
                    "Hanya terjadi perubahan bentuk ukuran benda",
                    "Zat dapat kembali ke bentuk semula dengan mudah",
                    "Suhu benda selalu tetap tidak berubah"
                ),
                correctAnswer = "Terbentuk endapan atau timbul gelembung gas baru",
                hints = listOf("Pikirkan tanda-tanda saat cuka dicampur soda kue.", "Zat baru sering kali berwujud gas atau endapan padat."),
                explanation = "Reaksi kimia ditandai oleh terbentuknya zat baru yang sering disertai pelepasan gelembung gas, pembentukan endapan, perubahan warna permanen, atau perubahan suhu.",
                misconception = "Mengira setiap pemanasan selalu merupakan reaksi kimia."
            )
        )
    )

    // =========================================================================
    // 2. CAMPURAN, KOLOID & METODE PEMISAHAN
    // =========================================================================
    private val campuranPemisahanLesson = LessonData(
        conceptId = "kim-campuran-pemisahan",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pcp1",
                panelNumber = 1,
                title = "Membuat Kopi Tubruk Khas Gayo",
                caption = "Kakek menyeduh bubuk kopi tubruk Aceh Gayo dengan air mendidih di teras rumah.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kopi ini warnanya hitam pekat, tapi setelah didiamkan beberapa menit, ada ampas padat yang mengendap di dasar cangkir!",
                sceneVisualEmoji = "☕",
                sceneDescription = "Cangkir kopi tubruk dengan endapan ampas di dasar cangkir."
            ),
            StoryPanel(
                id = "pcp2",
                panelNumber = 2,
                title = "Larutan, Koloid & Suspensi",
                caption = "Kakek menyinari cangkir kopi, segelas susu, dan segelas air gula dengan senter LED.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Air gula adalah Larutan Homogen (partikelnya larut sempurna tak tampak). Kopi tubruk adalah Suspensi (partikel kasar yang cepat mengendap). Sedangkan susu adalah KOLOID: partikelnya tidak mengendap dan menghamburkan berkas sinar senter (Efek Tyndall)!",
                sceneVisualEmoji = "🔦",
                sceneDescription = "Berkas cahaya senter tampak jelas saat menembus gelas susu koloid."
            ),
            StoryPanel(
                id = "pcp3",
                panelNumber = 3,
                title = "Kromatografi Kertas Warna Spidol",
                caption = "Kirana mencelupkan ujung kertas tisu bertitik spidol hitam ke dalam mangkok air.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lihat! Tinta hitam spidol terurai menjadi warna biru, merah, dan kuning yang merambat naik di kertas tisu! Ini metode Kromatografi!",
                sceneVisualEmoji = "🎨",
                sceneDescription = "Titik tinta hitam terurai menjadi pita spektrum aneka warna di kertas tisu basah."
            )
        ),
        intuitionTitle = "Teknik Memisahkan Materi: Dari Garam Laut Hingga Kromatografi",
        intuitionBody = "Zat murni terdiri dari satu jenis zat saja, sedangkan CAMPURAN merupakan gabungan dua atau lebih zat tanpa reaksi kimia:\n\n" +
                "1. Klasifikasi Campuran Berdasarkan Ukuran Partikel:\n" +
                "   • Larutan (< 1 nm): Homogen sempurna, tidak mengendap, tidak menghamburkan cahaya (air garam, sirup).\n" +
                "   • Koloid (1 – 100 nm): Keruh homogen, tidak mengendap, menghamburkan cahaya / Efek Tyndall (susu, santan, asap, kabut).\n" +
                "   • Suspensi (> 100 nm): Heterogen kasar, mengendap jika didiamkan, bisa disaring (kopi tubruk, air lumpur).\n\n" +
                "2. Metode Pemisahan Campuran:\n" +
                "   • Filtrasi (Penyaringan): Memisahkan padatan tak larut dari cairan berdasarkan ukuran pori saringan.\n" +
                "   • Kristalisasi / Evaporasi: Menguapkan pelarut untuk mendapatkan kristal padat (pembuatan garam dapur di tambak garam Madura).\n" +
                "   • Distilasi (Penyulingan): Memisahkan cairan berdasarkan perbedaan titik didih.\n" +
                "   • Kromatografi: Memisahkan komponen zat warna berdasarkan perbedaan kecepatan rambat pada fase diam dan fase gerak.",
        intuitionPoints = listOf(
            "Efek Tyndall: Sorot lampu mobil terlihat jelas di udara berkabut di pegunungan karena partikel koloid kabur menghamburkan cahaya.",
            "Campuran SELALU mempertahankan sifat zat-zat asalnya (gula dalam air tetap manis, besi dalam pasir tetap bisa ditarik magnet).",
            "Petani garam di pesisir pantai memanfaatkan kristalisasi alami dengan bantuan panas terik sinar matahari dan angin laut."
        ),
        simId = "sim-mixtures",
        formulas = listOf(
            FormulaCard(
                symbol = "\\% (\\text{Massa})",
                equation = "\\% \\text{ massa} = \\frac{m_{\\text{zat terlarut}}}{m_{\\text{larutan total}}} \\times 100\\%",
                meaning = "Kadar konsentrasi persentase massa suatu komponen dalam campuran.",
                units = "Persen (%)",
                applicationNote = "Massa larutan total = massa zat terlarut + massa pelarut."
            ),
            FormulaCard(
                symbol = "R_f (\\text{Kromatografi})",
                equation = "R_f = \\frac{\\text{Jarak tempuh noda warna}}{\\text{Jarak tempuh garis depan pelarut}}",
                meaning = "Faktor retensi kromatografi kertas untuk identifikasi zat warna.",
                units = "Rasio tanpa satuan (0 < Rf < 1)",
                applicationNote = "Nilai Rf khas untuk setiap senyawa kimia pada pelarut tertentu."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Tambak Garam Kristalisasi Surya Tradisional di Madura Jawa Timur",
            context = "Pulau Madura dikenal sebagai 'Pulau Garam' yang memasok ratusan ribu ton garam dapur (NaCl) konsumsi dan industri setiap musim kemarau.",
            engineeringProblem = "Air laut mengandung 96,5% air tawar dan hanya 3,5% garam mineral terlarut. Bagaimana memisahkan kristal garam putih murni tanpa bahan bakar mahal?",
            physicalConceptUsed = "Metode pemisahan campuran melalui evaporasi (penguapan air) bertingkat dan kristalisasi selektif di bawah sinar matahari.",
            mathematicalModel = "Air laut dialirkan melewati petak-petak meja garam bertingkat. Saat kadar garam mencapai 25° Bé (Baumé), kalsium sulfat mengendap lebih dulu, lalu pada 29° Bé kristal NaCl murni mengkristal padat di dasar meja garam beralas terpal geomembran.",
            realWorldImpact = "Menghasilkan garam kristal berstandar SNI berkadar NaCl > 94% yang menopang ketahanan pangan dan ekonomi ribuan petani garam nusantara.",
            relatedCareers = listOf("Teknolog Kimia Industri Garam", "Agronomis Pesisir Kelautan", "Auditor Mutu Pangan SNI"),
            verifiedSource = "Pusat Riset Kelautan KKP / Profil Sentra Garam Rakyat Madura."
        ),
        homeLab = HomeLabData(
            title = "Kromatografi Kertas Sederhana Menggunakan Tisu Dapur & Spidol Hitam",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 lembar kertas tisu dapur atau kertas saring kopi (potong memanjang 3 × 12 cm)",
                "Spidol hitam berbahan dasar air (water-based marker)",
                "1 gelas bening berisi sedikit air (ketinggian air ± 1 cm)",
                "1 tusuk gigi atau pensil untuk menggantung kertas tisu"
            ),
            steps = listOf(
                "Buat titik tebal spidol hitam berjarak 2 cm dari ujung bawah potongan kertas tisu.",
                "Gantungkan kertas tisu pada pensil di atas mulut gelas sehingga ujung bawah tisu menyentuh air, TETAPI TITIK SPIDOL BERADA DI ATAS PERMUKAAN AIR (jangan sampai tercelup langsung).",
                "Perhatikan air merambat perlahan naik ke atas kertas tisu melalui kapilaritas pori serat.",
                "Amati saat air melintasi titik hitam: tinta hitam terurai menjadi pita pelangi warna-warni (biru, magenta, kuning) yang merambat dengan kecepatan berbeda!",
                "Angkat tisu dan keringkan saat garis air mendekati puncak."
            ),
            observationGoal = "Membuktikan bahwa tinta hitam sebenarnya adalah campuran dari banyak pigmen zat warna yang memiliki afinitas berbeda terhadap air dan serat kertas.",
            connectionToSimulation = "Bandingkan pita kromatografimu dengan simulator pemisahan campuran di Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-cp-1",
                prompt = "Manakah dari contoh berikut yang merupakan sistem KOLOID yang menunjukkan Efek Tyndall (menghamburkan cahaya)?",
                type = "multiple_choice",
                options = listOf("Susu sapi cair", "Air garam bening", "Air sirup jernih", "Pasir di dalam air"),
                correctAnswer = "Susu sapi cair",
                hints = listOf("Koloid tampak keruh homogen dan partikelnya tidak mengendap.", "Air garam dan sirup adalah larutan sejati."),
                explanation = "Susu cair adalah koloid emulsi lemak dalam air yang memiliki ukuran partikel 1-100 nm sehingga mampu menghamburkan berkas cahaya (Efek Tyndall).",
                misconception = "Mengira susu adalah larutan homogen sejati."
            ),
            QuizQuestion(
                id = "q-cp-2",
                prompt = "Teknik pemisahan campuran yang digunakan oleh petani garam tradisional untuk memisahkan garam dapur dari air laut adalah...",
                type = "multiple_choice",
                options = listOf("Evaporasi dan Kristalisasi", "Filtrasi (Penyaringan)", "Kromatografi", "Sublimasi"),
                correctAnswer = "Evaporasi dan Kristalisasi",
                hints = listOf("Air laut dipanaskan terik matahari hingga airnya menguap.", "Garam padat tertinggal mengkristal di dasar tambak."),
                explanation = "Petani garam memanfaatkan penguapan (evaporasi) air laut oleh panas matahari sehingga garam NaCl mengkristal padat di dasar tambak.",
                misconception = "Mengira garam disaring menggunakan saringan kain."
            )
        )
    )

    // =========================================================================
    // 3. UNSUR, SENYAWA & LAMBANG KIMIA
    // =========================================================================
    private val unsurSenyawaLesson = LessonData(
        conceptId = "kim-unsur-senyawa",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pus1",
                panelNumber = 1,
                title = "Cincin Emas Nenek",
                caption = "Kakek memperlihatkan cincin kawin emas murni milik Nenek yang berkilau kuning cerah.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Cincin ini sudah puluhan tahun tapi tidak pernah berkarat atau berubah warna sama sekali!",
                sceneVisualEmoji = "💍",
                sceneDescription = "Cincin emas murni 24 karat berkilau indah tanpa tanda perkaratan."
            ),
            StoryPanel(
                id = "pus2",
                panelNumber = 2,
                title = "Unsur: Huruf Abjad Materi Semesta",
                caption = "Kakek menjelaskan konsep unsur kimia sebagai zat tunggal paling murni.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Emas adalah UNSUR kimia dengan lambang Au (Aurum). Unsur adalah zat tunggal yang tidak bisa diuraikan lagi menjadi zat lain yang lebih sederhana lewat reaksi kimia biasa. Seperti huruf abjad A sampai Z, ada 118 unsur penyusun seluruh alam semesta!",
                sceneVisualEmoji = "🧪",
                sceneDescription = "Tabel periodik memuat lambang-lambang unsur Berzelius: H, O, C, Fe, Au."
            ),
            StoryPanel(
                id = "pus3",
                panelNumber = 3,
                title = "Senyawa: Kata yang Terangkai dari Huruf",
                caption = "Kirana memegang segelas air minum jernih dan sejumput garam dapur.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Air minum adalah SENYAWA: gabungan dua atom hidrogen dan satu atom oksigen (H₂O). Gas hidrogen mudah meledak dan gas oksigen memicu api, tetapi ketika bersenyawa menjadi H₂O, sifatnya berubah total menjadi cairan yang memadamkan api!",
                sceneVisualEmoji = "💧",
                sceneDescription = "Model molekul air H2O berbentuk huruf V dengan dua bola putih dan satu bola merah."
            )
        ),
        intuitionTitle = "Blok Bangunan Alam: Unsur Tunggal vs Senyawa Terikat",
        intuitionBody = "Materi tersusun dari partikel dasar yang dapat berupa unsur atau senyawa:\n\n" +
                "1. Unsur (Elements):\n" +
                "   • Zat tunggal yang hanya terdiri dari satu jenis atom saja.\n" +
                "   • Contoh Logam: Besi (Fe), Emas (Au), Tembaga (Cu), Aluminium (Al).\n" +
                "   • Contoh Nonlogam: Oksigen (O), Nitrogen (N), Karbon (C), Belerang (S).\n" +
                "   • Aturan Lambang Berzelius: Huruf pertama kapital (H, C, O), jika ada huruf kedua gunakan huruf kecil (He, Ca, Fe).\n\n" +
                "2. Senyawa (Compounds):\n" +
                "   • Gabungan dua atau lebih unsur berbeda yang terikat secara kimia dengan perbandingan massa tetap (Hukum Proust).\n" +
                "   • Sifat senyawa SANGAT BERBEDA dari sifat unsur-unsur pembentuknya!\n" +
                "   • Contoh: Garam dapur (NaCl) terbentuk dari logam Natrium yang sangat reaktif eksplosif dan gas Klorin yang beracun, tetapi senyawanya NaCl aman dimakan setiap hari.\n\n" +
                "3. Molekul Unsur vs Molekul Senyawa:\n" +
                "   • Molekul Unsur: Terdiri dari atom sejenis (O₂, N₂, H₂, P₄).\n" +
                "   • Molekul Senyawa: Terdiri dari atom berbeda jenis (H₂O, CO₂, CH₄, C₆H₁₂O₆).",
        intuitionPoints = listOf(
            "Air (H₂O) di bumi mana pun selalu memiliki perbandingan massa hidrogen : oksigen tetap 1 : 8.",
            "Tubuh manusia tersusun dari 6 unsur dominan utama: Oksigen (65%), Karbon (18%), Hidrogen (10%), Nitrogen (3%), Kalsium (1,5%), dan Fosfor (1%).",
            "Grafit pensil hitam dan intan berlian permata berkilau terbuat dari UNSUR YANG PERSIS SAMA, yaitu atom Karbon murni (C) dengan susunan kisi kristal berbeda!"
        ),
        simId = "sim-elements",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Air}",
                equation = "2\\text{H}_2 + \\text{O}_2 \\rightarrow 2\\text{H}_2\\text{O}",
                meaning = "Reaksi pembentukan senyawa air dari unsur gas hidrogen dan oksigen.",
                units = "Perbandingan atom 2 : 1",
                applicationNote = "Sifat air cair cair berbeda total dari sifat gas reaktannya."
            ),
            FormulaCard(
                symbol = "\\text{Garam Dapur}",
                equation = "2\\text{Na} + \\text{Cl}_2 \\rightarrow 2\\text{NaCl}",
                meaning = "Reaksi pembentukan senyawa natrium klorida (garam dapur).",
                units = "Perbandingan atom 1 : 1",
                applicationNote = "Na padatan logam reaktif + Cl2 gas racun menjadi garam dapur bumbu masak."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemurnian Bauksit Menjadi Aluminium Murni Inalum di Asahan Sumatera Utara",
            context = "PT Indonesia Asahan Aluminium (Inalum) mengoperasikan pabrik peleburan aluminium pertama di Asia Tenggara bertenaga listrik PLTA Sigura-gura.",
            engineeringProblem = "Aluminium di alam tidak pernah ditemukan sebagai unsur bebas karena sangat reaktif mengikat oksigen dalam bentuk senyawa bijih bauksit alumina (Al₂O₃). Bagaimana memutus ikatan kimia kuat ini menjadi logam aluminium murni?",
            physicalConceptUsed = "Proses reduksi kimia Hall-Héroult melalui elektrolisis lelehan alumina pada suhu 960°C menggunakan arus listrik DC 180.000 Ampere.",
            mathematicalModel = "Reaksi dekomposisi senyawa: 2 Al₂O₃ + 3 C → 4 Al + 3 CO₂. Setiap ton aluminium cair yang keluar dari tungku membutuhkan energi listrik sekitar 14.000 kWh.",
            realWorldImpact = "Menghasilkan 250.000 ton aluminium batangan berdaya tahan tinggi per tahun untuk rangka bodi pesawat, transmisi kabel listrik, dan kaleng minuman nasional.",
            relatedCareers = listOf("Insinyur Metalurgi Ekstraktif", "Operator Smelter Peleburan Logam", "Analis Spektrometri Material"),
            verifiedSource = "PT Indonesia Asahan Aluminium (Persero) / Profil Operasional Smelter Kuala Tanjung."
        ),
        homeLab = HomeLabData(
            title = "Membuat Model Molekul 3D Unsur & Senyawa dengan Plastisin / Tusuk Gigi",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Lilin plastisin warna-warni (atau buah anggur/kelereng spons): warna putih, merah, hitam, hijau",
                "1 bungkus tusuk gigi kayu (sebagai ikatan kimia antaratom)",
                "Kertas label nama"
            ),
            steps = listOf(
                "Bentuk bulatan plastisin:\n• Bola Putih kecil = Atom Hidrogen (H)\n• Bola Merah sedang = Atom Oksigen (O)\n• Bola Hitam besar = Atom Karbon (C)\n• Bola Hijau = Atom Klorin (Cl)",
                "Model 1 (Molekul Unsur O₂): Sambungkan 2 bola merah dengan 2 tusuk gigi (ikatan kovalen ganda).",
                "Model 2 (Molekul Senyawa H₂O): Tancapkan 2 bola putih ke 1 bola merah membentuk sudut miring menyerupai kepala Mickey Mouse (sudut 104,5°).",
                "Model 3 (Molekul Senyawa CO₂): Tancapkan 2 bola merah di sisi kiri dan kanan 1 bola hitam secara lurus sejajar (geometri linier 180°).",
                "Bandingkan perbedaan model molekul unsur (atom sejenis) vs molekul senyawa (atom berbeda jenis)!"
            ),
            observationGoal = "Memahami struktur spasial molekul kimia dan representasi simbol rumus molekul di alam.",
            connectionToSimulation = "Bandingkan bentuk molekul plastisinmu dengan simulator molekul 3D Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-us-1",
                prompt = "Manakah dari zat berikut yang merupakan contoh MOLEKUL SENYAWA?",
                type = "multiple_choice",
                options = listOf("Air (H₂O)", "Gas Oksigen (O₂)", "Gas Nitrogen (N₂)", "Logam Besi (Fe)"),
                correctAnswer = "Air (H₂O)",
                hints = listOf("Molekul senyawa terdiri dari DUA ATAU LEBIH jenis atom yang berbeda.", "O₂ dan N₂ hanya terdiri dari satu jenis atom (molekul unsur)."),
                explanation = "Air (H₂O) adalah molekul senyawa karena tersusun dari gabungan dua jenis unsur yang berbeda: hidrogen dan oksigen. Sedangkan O₂ dan N₂ adalah molekul unsur, dan Fe adalah unsur tunggal.",
                misconception = "Mengira gas oksigen O₂ adalah senyawa karena memiliki angka indeks 2."
            ),
            QuizQuestion(
                id = "q-us-2",
                prompt = "Lambang kimia Berzelius untuk unsur Emas dan Besi berturut-turut adalah...",
                type = "multiple_choice",
                options = listOf("Au dan Fe", "Em dan Be", "Ag dan Fe", "Au dan Bs"),
                correctAnswer = "Au dan Fe",
                hints = listOf("Lambang kimia diambil dari bahasa Latin: Aurum (emas) dan Ferrum (besi).", "Huruf pertama selalu kapital."),
                explanation = "Emas berasal dari kata Latin Aurum (Au) dan besi berasal dari kata Ferrum (Fe). Ag adalah lambang untuk perak (Argentum).",
                misconception = "Menggunakan singkatan bahasa Indonesia (Em untuk emas atau Be untuk besi, padahal Be adalah Berilium)."
            )
        )
    )

    // =========================================================================
    // 4. ASAM, BASA & GARAM SEHARI-HARI
    // =========================================================================
    private val asamBasaDasarLesson = LessonData(
        conceptId = "kim-asam-basa-dasar",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pabd1",
                panelNumber = 1,
                title = "Noda Kunyit pada Baju Putih",
                caption = "Saat makan opor ayam bersantan kuning kunyit, kuahnya menetes ke baju putih Dimas.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Aduh, bajuku kena noda kuning kunyit! Tapi begitu Ibu mengoleskan sabun cuci, noda kuningnya mendadak berubah menjadi merah kecokelatan gelap!",
                sceneVisualEmoji = "👕",
                sceneDescription = "Noda kuning kunyit pada baju berubah warna menjadi merah bata gelap saat terkena sabun cuci."
            ),
            StoryPanel(
                id = "pabd2",
                panelNumber = 2,
                title = "Indikator Asam-Basa Alami",
                caption = "Kakek menjelaskan reaksi zat pewarna kurkumin kunyit terhadap pH basa.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kunyit adalah Indikator Alami! Di lingkungan netral atau asam (seperti cuka dan jeruk), kunyit berwarna kuning cerah. Tetapi di lingkungan BASA (seperti air sabun atau kapur sirih), kurkumin berubah struktur kimia menjadi warna merah kecokelatan!",
                sceneVisualEmoji = "🌿",
                sceneDescription = "Dua tabung reaksi ekstrak kunyit berwarna kuning cerah (asam) dan merah bata (basa)."
            ),
            StoryPanel(
                id = "pabd3",
                panelNumber = 3,
                title = "Reaksi Netralisasi Obat Maag",
                caption = "Kirana mengambil tablet obat maag antasida untuk meredakan sakit perut asam lambung berlebih.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lambung kita menghasilkan asam klorida (HCl). Saat asam lambung naik, obat maag yang bersifat BASA (magnesium hidroksida) MENETRALKAN asam berlebih menjadi garam dan air!",
                sceneVisualEmoji = "💊",
                sceneDescription = "Tablet antasida basa menetralkan kelebihan asam di lambung menghasilkan rasa nyaman."
            )
        ),
        intuitionTitle = "Dunia Rasa & Ion: Mengenal Asam, Basa & Garam",
        intuitionBody = "Zat kimia di rumah dapat dikelompokkan berdasarkan sifat asam-basanya:\n\n" +
                "1. Sifat Larutan Asam:\n" +
                "   • Rasa masam di lidah (jangan mencicipi asam laboratorium!).\n" +
                "   • Bersifat korosif (dapat mengikis dan merusak logam).\n" +
                "   • Mengubah kertas lakmus biru menjadi MERAH.\n" +
                "   • Contoh di rumah: Asam asetat (cuka dapur), asam sitrat (jeruk lemon), asam karbonat (minuman soda), asam lambung (HCl).\n\n" +
                "2. Sifat Larutan Basa:\n" +
                "   • Rasa pahit dan terasa licin di kulit seperti sabun (kaustik).\n" +
                "   • Mengubah kertas lakmus merah menjadi BIRU.\n" +
                "   • Contoh di rumah: Sabun mandi, detergen, pemutih pakaian, kapur sirih (kalsium hidroksida), obat maag antasida.\n\n" +
                "3. Garam & Reaksi Netralisasi:\n" +
                "   • Terbentuk dari reaksi asam bertemu basa:\n" +
                "     Asam + Basa → Garam + Air.\n" +
                "   • Contoh: HCl (asam lambung) + NaOH (soda api) → NaCl (garam dapur netral) + H₂O.",
        intuitionPoints = listOf(
            "Indikator Alami dapat dibuat dengan mudah dari bahan dapur: ekstrak kunyit, air rebusan kol ungu, mahkota bunga kembang sepatu, atau kulit manggis.",
            "Sengatan lebah bersifat asam (dapat diredakan dengan kompres soda kue yang bersifat basa), sedangkan sengatan tawon bersifat basa (diredakan dengan cuka encer yang bersifat asam).",
            "Garam dapur (NaCl) bersifat netral (pH = 7) dan tidak mengubah warna lakmus merah maupun biru."
        ),
        simId = "sim-acid-base",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Netralisasi}",
                equation = "\\text{Asam} + \\text{Basa} \\rightarrow \\text{Garam} + \\text{Air}",
                meaning = "Persamaan umum reaksi netralisasi asam-basa.",
                units = "-",
                applicationNote = "Contoh: HCl + NaOH -> NaCl + H2O."
            ),
            FormulaCard(
                symbol = "\\text{Skala pH}",
                equation = "\\text{pH} < 7 \\text{ (Asam)} \\quad , \\quad \\text{pH} = 7 \\text{ (Netral)} \\quad , \\quad \\text{pH} > 7 \\text{ (Basa)}",
                meaning = "Skala derajat keasaman dan kebasaan larutan.",
                units = "0 sampai 14",
                applicationNote = "Semakin kecil angka pH (mendekati 0), sifat asam semakin kuat."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengapuran Tanah Gambut Masam Lahan Pertanian Riau & Kalimantan",
            context = "Lahan gambut tropis di Sumatera dan Kalimantan memiliki tingkat keasaman sangat ekstrem dengan pH 3,0 – 4,0 akibat akumulasi asam humus organik tebal.",
            engineeringProblem = "Tanaman padi dan palawija tidak dapat menyerap unsur hara fosfor dan mati keracunan aluminium terlarut jika tanah terlalu asam.",
            physicalConceptUsed = "Reaksi netralisasi asam-basa skala hektar menggunakan kapur pertanian dolomit (CaCO₃ dan MgCO₃) yang bersifat basa.",
            mathematicalModel = "Dinas Pertanian menghitung dosis kapur dolomit: penambahan 3–5 ton dolomit per hektar menetralkan ion H⁺ tanah dan menaikkan pH tanah dari 3,5 menuju pH netral ideal 6,0 – 6,5.",
            realWorldImpact = "Menyulap jutaan hektar lahan gambut masam tidak produktif menjadi lumbung padi dan sentra hortikultura nasional.",
            relatedCareers = listOf("Ahli Kimia Tanah Pertanian", "Agronomis Lahan Basah", "Penyuluh Pertanian Lapangan"),
            verifiedSource = "Balai Penelitian Pertanian Lahan Rawa (Balittra) Kementerian Pertanian RI."
        ),
        homeLab = HomeLabData(
            title = "Membuat Indikator Asam-Basa Alami Air Kol Ungu / Kunyit",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 ruas kunyit diparut dan diperas airnya (atau beberapa lembar kol ungu direbus dengan air)",
                "Cairan uji di rumah: cuka dapur (asam), perasan jeruk nipis (asam), air sabun mandi (basa), air detergen (basa), air garam dapur (netral)",
                "5 gelas plastik kecil bening dan sendok teh"
            ),
            steps = listOf(
                "Tuangkan 1 sendok teh ekstrak kunyit kuning ke dalam masing-masing 5 gelas plastik.",
                "Gelas 1: Tambahkan 1 sendok cuka dapur. Amati warna kuningnya semakin TERANG JERNIH (bukti Asam!).",
                "Gelas 2: Tambahkan perasan jeruk nipis. Amati warna tetap kuning terang.",
                "Gelas 3: Tambahkan air sabun cuci tangan. Amati seketika berubah menjadi MERAH BATA KECOKELATAN GELAP (bukti Basa!).",
                "Gelas 4: Tambahkan air detergen. Warna berubah merah tua pekat.",
                "Gelas 5: Tambahkan air garam dapur. Warna tetap kuning normal (bukti Netral!)."
            ),
            observationGoal = "Menyaksikan perubahan warna zat pigmen kurkumin sebagai detektor keasaman dan kebasaan alami.",
            connectionToSimulation = "Bandingkan perubahan warna kunyit dengan indikator universal pada simulator asam-basa Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-abd-1",
                prompt = "Jika sehelai kertas lakmus biru dicelupkan ke dalam air perasan jeruk nipis, apa yang akan terjadi pada warna kertas lakmus tersebut?",
                type = "multiple_choice",
                options = listOf("Berubah warna menjadi merah", "Tetap berwarna biru", "Berubah menjadi hijau", "Berubah menjadi bening transparan"),
                correctAnswer = "Berubah warna menjadi merah",
                hints = listOf("Jeruk nipis mengandung asam sitrat yang bersifat asam.", "Larutan asam memerahkan lakmus."),
                explanation = "Jeruk nipis bersifat asam (pH < 7). Sifat asam akan mengubah warna kertas lakmus biru menjadi merah.",
                misconception = "Mengira lakmus biru akan tetap biru dalam suasana asam."
            ),
            QuizQuestion(
                id = "q-abd-2",
                prompt = "Reaksi antara asam klorida (HCl) dan natrium hidroksida (NaOH) menghasilkan natrium klorida (garam dapur) dan air dinamakan reaksi...",
                type = "multiple_choice",
                options = listOf("Netralisasi", "Pembakaran", "Pengendapan", "Peragian (Fermentasi)"),
                correctAnswer = "Netralisasi",
                hints = listOf("Reaksi antara asam dan basa yang saling meniadakan sifat asam dan basanya.", "Menghasilkan larutan garam yang netral."),
                explanation = "Reaksi antara asam dan basa disebut reaksi netralisasi, yang menghasilkan garam dan air serta meniadakan keasaman dan kebasaan ekstrem.",
                misconception = "Menyamakan dengan reaksi pembakaran yang melibatkan gas oksigen."
            )
        )
    )

    // =========================================================================
    // 5. KESELAMATAN KERJA & ALAT LABORATORIUM
    // =========================================================================
    private val keselamatanLabLesson = LessonData(
        conceptId = "kim-keselamatan-lab",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pkl1",
                panelNumber = 1,
                title = "Kunjungan Pertama ke Laboratorium Kimia",
                caption = "Kirana dan Dimas mengenakan jas laboratorium putih berlengan panjang dan kacamata pelindung (goggles) sebelum masuk ke lab kimia sekolah.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Wah, jas lab dan kacamata ini membuat kita terlihat seperti peneliti sungguhan!",
                sceneVisualEmoji = "🥼",
                sceneDescription = "Dua siswa memakai jas laboratorium dan kacamata keselamatan di depan meja lab."
            ),
            StoryPanel(
                id = "pkl2",
                panelNumber = 2,
                title = "Alat-Alat Gelas Presisi",
                caption = "Ibu Guru Kimia memperkenalkan aneka peranti kaca tahan panas Pyrex di rak meja.",
                dialogueSpeaker = "Ibu Guru",
                dialogueText = "Ini Tabung Reaksi untuk menguji sampel kecil, Labu Erlenmeyer bermulut sempit untuk mencampur larutan tanpa tumpah, dan Gelas Ukur untuk mengukur volume cairan dengan teliti!",
                sceneVisualEmoji = "🧪",
                sceneDescription = "Deretan alat gelas kimia: tabung reaksi di rak, erlenmeyer, dan gelas ukur."
            ),
            StoryPanel(
                id = "pkl3",
                panelNumber = 3,
                title = "Membaca Simbol Bahaya GHS",
                caption = "Kakek menunjuk simbol belah ketupat merah berlogo tengkorak dan kobaran api di botol asam sulfat pekat.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jangan pernah mencium atau menyentuh bahan kimia sembarangan! Simbol api berarti mudah terbakar, simbol tengkorak berarti beracun toksik, dan simbol cairan menetes di tangan berarti KOROSIF yang bisa melukai kulit!",
                sceneVisualEmoji = "☣️",
                sceneDescription = "Simbol piktogram bahaya GHS internasional: korosif, mudah terbakar, dan toksik."
            )
        ),
        intuitionTitle = "Bekerja Aman: Budaya Keselamatan & Alat Laboratorium",
        intuitionBody = "Laboratorium kimia adalah tempat eksplorasi yang menyenangkan namun penuh potensi bahaya jika aturan keselamatan diabaikan:\n\n" +
                "1. Alat Pelindung Diri (APD) Wajib:\n" +
                "   • Jas Laboratorium: Melindungi pakaian dan kulit dari percikan cairan kimia berbahaya.\n" +
                "   • Kacamata Pengaman (Safety Goggles): Melindungi mata dari letupan cairan panas dan uap gas beracun.\n" +
                "   • Sarung Tangan Nitril / Karet: Melindungi jari tangan dari zat korosif.\n" +
                "   • Sepatu Tertutup: Mencegah cedera jika ada pecahan kaca gelas yang jatuh ke lantai.\n\n" +
                "2. Simbol Piktogram Bahaya Bahan Kimia (GHS):\n" +
                "   • Api: Mudah menyala (flammable, alkohol, bensin, aseton).\n" +
                "   • Cairan Menetes di Tangan/Logam: Korosif (asam klorida pekat, soda api NaOH).\n" +
                "   • Tengkorak & Tulang Silang: Toksik beracun mematikan (sianida, merkuri).\n" +
                "   • Pohon dan Ikan Mati: Berbahaya bagi lingkungan perairan.\n\n" +
                "3. Aturan Emas Keselamatan:\n" +
                "   • Selalu tambahkan ASAM KE DALAM AIR, BUKAN AIR KE DALAM ASAM (Air ke asam pekat memicu letupan panas eksoterm hebat!).\n" +
                "   • Cara membaui gas: Kibaskan tangan di atas mulut tabung secara perlahan ke arah hidung, dilarang menghirup langsung!",
        intuitionPoints = listOf(
            "Jika terkena percikan asam kuat di kulit, LANGKAH PERTAMA adalah segera membasuh dengan air mengalir deras selama minimal 15 menit, bukan mengoleskan salep!",
            "Erlenmeyer dirancang bermulut sempit agar larutan dapat digoyang memutar secara aman saat titrasi tanpa cipratan keluar.",
            "Lemari Asam (Fume Hood) digunakan saat mereaksikan zat yang menghasilkan uap gas beracun atau berbau menyengat."
        ),
        simId = "sim-lab-safety",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Aturan Pengenceran}",
                equation = "\\text{Tuangkan Asam ke dalam Air (AAA)}",
                meaning = "Always Add Acid to water. Jangan pernah menuang air ke asam pekat.",
                units = "-",
                applicationNote = "Mencegah cipratan akibat pelepasan kalor pelarutan eksotermik dahsyat."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sistem Pengelolaan Limbah B3 Laboratorium Biofarma Bandung",
            context = "PT Bio Farma memproduksi miliaran dosis vaksin untuk kebutuhan imunisasi nasional dan 150 negara dunia.",
            engineeringProblem = "Laboratorium kontrol mutu menghasilkan ribuan liter limbah kimia pelarut organik dan asam pekat setiap bulan yang beracun bagi sungai Citarum jika dibuang ke selokan umum.",
            physicalConceptUsed = "Protokol penanganan Bahan Berbahaya dan Beracun (B3), netralisasi limbah asam-basa, dan insinerator bersuhu 1.200°C.",
            mathematicalModel = "Limbah asam dinetralkan di bak Instalasi Pengolahan Air Limbah (IPAL) dengan penambahan kapur hingga pH mencapai 6,5–8,5 sebelum disaring lewat membran osmosis balik ultrafiltrasi.",
            realWorldImpact = "Menjaga kelestarian lingkungan Daerah Aliran Sungai Citarum dan memastikan standar keamanan vaksin kelas dunia (WHO Prequalified).",
            relatedCareers = listOf("Petugas K3 Lingkungan Laboratorium", "Analis Limbah Industri B3", "Manajer Mutu Biofarma"),
            verifiedSource = "Buku Panduan Keselamatan Kerja Laboratorium PT Bio Farma (Persero)."
        ),
        homeLab = HomeLabData(
            title = "Latihan Membaca Piktogram Simbol Bahaya pada Produk Pembersih Rumah Tangga",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "3-4 kemasan produk pembersih rumah tangga (misal: botol pembersih lantai, cairan pemutih pakaian, cairan obat nyamuk semprot, pembersih kaca)",
                "Buku catatan dan pulpen"
            ),
            steps = listOf(
                "Kumpulkan kemasan produk pembersih rumah tangga yang ada di dapur atau kamar mandi.",
                "Periksa label belakang kemasan dengan teliti: cari tanda kotak belah ketupat simbol bahaya atau tulisan peringatan bahaya.",
                "Catat pada tabel:\n• Nama produk\n• Zat aktif kimia (misal natrium hipoklorit pada pemutih, HCl pada pembersih porselen)\n• Simbol bahaya yang tertera (korosif, iritasi, mudah terbakar)\n• Petunjuk pertolongan pertama bila tertelan atau terkena mata.",
                "Amati apakah ada instruksi 'Jauhkan dari jangkauan anak-anak' atau 'Gunakan sarung tangan karet'."
            ),
            observationGoal = "Meningkatkan kewaspadaan keselamatan kimia sehari-hari dan memahami bahwa bahan kimia berbahaya ada di sekitar rumah kita.",
            connectionToSimulation = "Cocokkan simbol bahaya produk rumah tangga dengan modul keselamatan di simulator Semesta."
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kl-1",
                prompt = "Jika tanganmu tanpa sengaja terkena tumpahan zat asam kuat di laboratorium, tindakan pertolongan pertama apa yang PALING TEPAT dilakukan?",
                type = "multiple_choice",
                options = listOf(
                    "Segera basuh dengan air mengalir deras selama minimal 15 menit",
                    "Segera oleskan pasta gigi tebal ke area kulit",
                    "Bungkus tangan dengan kain rapat tanpa dicuci",
                    "Siram tangan dengan larutan basa kuat untuk menetralkannya"
                ),
                correctAnswer = "Segera basuh dengan air mengalir deras selama minimal 15 menit",
                hints = listOf("Air mengalir deras mengencerkan dan menghanyutkan asam dengan cepat.", "Jangan menambahkan zat kimia lain yang memicu panas netralisasi."),
                explanation = "Membasuh dengan air mengalir deras selama 15-20 menit adalah tindakan standar darurat untuk membilas dan mengencerkan bahan kimia sebelum mendapat pertolongan medis.",
                misconception = "Menyiram dengan basa kuat, padahal reaksi netralisasi di kulit melepaskan panas hebat yang justru memperparah luka bakar kimia."
            ),
            QuizQuestion(
                id = "q-kl-2",
                prompt = "Alat laboratorium kaca berbentuk kerucut dengan leher sempit yang digunakan untuk mencampur dan mengocok cairan tanpa risiko tumpah adalah...",
                type = "multiple_choice",
                options = listOf("Labu Erlenmeyer", "Gelas Beker (Beaker glass)", "Gelas Ukur", "Tabung Reaksi"),
                correctAnswer = "Labu Erlenmeyer",
                hints = listOf("Bentuknya menyerupai kerucut piramida terpancung.", "Dinamai sesuai penemunya, Emil Erlenmeyer."),
                explanation = "Labu Erlenmeyer memiliki leher sempit dan alas melebar, sangat ideal untuk mengocok larutan secara memutar saat titrasi atau pencampuran tanpa risiko cairan terciprat keluar.",
                misconception = "Tertukar dengan gelas beker yang mulutnya lebar terbuka."
            )
        )
    )
}

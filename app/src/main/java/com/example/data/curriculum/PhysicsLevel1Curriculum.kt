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

object PhysicsLevel1Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "fis-dorong-tarik",
            domain = Domain.FISIKA,
            topic = "Mekanika Dasar",
            title = "Dorong & Tarik",
            description = "Bagaimana dorongan dan tarikan membuat benda bergerak, berhenti, atau berbelok.",
            level = DepthLevel.L0,
            estMinutes = 8,
            prerequisites = emptyList()
        ),
        ConceptItem(
            id = "fis-besaran-satuan",
            domain = Domain.FISIKA,
            topic = "Pengukuran Sains",
            title = "Besaran, Satuan SI & Pengukuran",
            description = "Mengenal 7 besaran pokok Sistem Internasional (SI), besaran turunan, dan ketelitian alat ukur panjang/massa/waktu.",
            level = DepthLevel.L1,
            estMinutes = 12,
            prerequisites = listOf("fis-dorong-tarik")
        ),
        ConceptItem(
            id = "fis-suhu-kalor",
            domain = Domain.FISIKA,
            topic = "Termal & Panas",
            title = "Suhu, Kalor & Perpindahan Panas",
            description = "Perbedaan derajat suhu vs energi kalor, skala Celcius, serta 3 cara perpindahan panas: konduksi, konveksi, dan radiasi.",
            level = DepthLevel.L1,
            estMinutes = 14,
            prerequisites = listOf("fis-dorong-tarik")
        ),
        ConceptItem(
            id = "fis-cahaya-bunyi",
            domain = Domain.FISIKA,
            topic = "Gelombang Awal",
            title = "Cahaya Merambat Lurus & Getaran Bunyi",
            description = "Sifat cahaya merambat lurus dan bayangan, pemantulan cermin, serta bunyi yang dihasilkan dari benda bergetar.",
            level = DepthLevel.L1,
            estMinutes = 13,
            prerequisites = listOf("fis-dorong-tarik")
        ),
        ConceptItem(
            id = "fis-listrik-magnet-sederhana",
            domain = Domain.FISIKA,
            topic = "Kelistrikan & Kemagnetan",
            title = "Listrik Statis & Magnet Sederhana",
            description = "Gejala muatan listrik statis sisir plastik, rangkaian baterai lampu tertutup, konduktor-isolator, dan kutub magnet.",
            level = DepthLevel.L1,
            estMinutes = 13,
            prerequisites = listOf("fis-dorong-tarik")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "fis-dorong-tarik" -> dorongTarikLesson
            "fis-besaran-satuan" -> besaranSatuanLesson
            "fis-suhu-kalor" -> suhuKalorLesson
            "fis-cahaya-bunyi" -> cahayaBunyiLesson
            "fis-listrik-magnet-sederhana" -> listrikMagnetLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. LESSON: DORONG & TARIK (L0 — Penjelajah)
    // =========================================================================
    private val dorongTarikLesson = LessonData(
        conceptId = "fis-dorong-tarik",
        level = DepthLevel.L0,
        storyPanels = listOf(
            StoryPanel(
                id = "pdt1",
                panelNumber = 1,
                title = "Pagi di Taman Bermain",
                caption = "Kirana dan Dimas bermain di taman dekat rumah Kakek. Ada ayunan, seluncuran, dan sebuah gerobak kayu kecil berisi batu-batu.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dimas, aku mau naik ayunan tapi sudah berhenti. Bagaimana cara membuatnya bergerak kembali?",
                sceneVisualEmoji = "🛝",
                sceneDescription = "Taman bermain cerah di pagi hari dengan ayunan, seluncuran, dan gerobak kayu."
            ),
            StoryPanel(
                id = "pdt2",
                panelNumber = 2,
                title = "Mendorong Ayunan",
                caption = "Dimas mendorong punggung Kirana di atas ayunan. Ayunan mulai bergerak maju-mundur!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Lihat! Aku memberikan DORONGAN ke depan, dan ayunan mulai bergerak! Tanpa dorongan, ayunan diam saja.",
                sceneVisualEmoji = "💪",
                sceneDescription = "Dimas mendorong ayunan, panah gaya terlihat dari tangan ke punggung Kirana."
            ),
            StoryPanel(
                id = "pdt3",
                panelNumber = 3,
                title = "Menarik Gerobak",
                caption = "Kakek datang dan meminta anak-anak membantu menarik gerobak berisi batu ke pinggir taman.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Dorongan dan tarikan sama-sama disebut GAYA. Gaya bisa membuat benda diam menjadi bergerak, benda bergerak menjadi berhenti, atau benda bergerak berbelok arah!",
                sceneVisualEmoji = "🧲",
                sceneDescription = "Kakek menarik gerobak dengan tali, menunjukkan arah gaya tarikan."
            ),
            StoryPanel(
                id = "pdt4",
                panelNumber = 4,
                title = "Gaya Ada di Mana-mana!",
                caption = "Kirana menyadari bahwa gaya ada di mana-mana dalam kehidupan sehari-hari.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Wah! Ternyata saat aku melempar bola, menendang kaleng, menarik pintu, bahkan saat magnet menempel di kulkas — semua itu adalah GAYA!",
                sceneVisualEmoji = "✨",
                sceneDescription = "Berbagai contoh gaya dalam kehidupan: menendang bola, menarik pintu, magnet."
            )
        ),
        intuitionTitle = "Apa Itu Gaya? Dorongan dan Tarikan!",
        intuitionBody = "Gaya adalah dorongan atau tarikan yang dapat mengubah keadaan gerak suatu benda.\n\n" +
                "Gaya tidak bisa dilihat, tetapi efeknya bisa diamati:\n" +
                "• Benda diam menjadi bergerak (mendorong meja)\n" +
                "• Benda bergerak menjadi berhenti (mengerem sepeda)\n" +
                "• Benda berubah bentuk (meremas tanah liat)\n" +
                "• Benda berubah arah gerak (membelokkan bola)\n\n" +
                "Ada banyak jenis gaya di alam:\n" +
                "• Gaya Otot — dari tangan, kaki, badan kita\n" +
                "• Gaya Gravitasi — tarikan bumi ke bawah\n" +
                "• Gaya Gesek — menahan benda yang bergerak\n" +
                "• Gaya Magnet — tarikan dan tolakan kutub magnet\n" +
                "• Gaya Pegas — dorongan pegas yang ditekan/ditarik",
        intuitionPoints = listOf(
            "Gaya selalu memiliki ARAH dan BESAR. Dorongan ke kanan berbeda dengan dorongan ke kiri!",
            "Benda diam bukan berarti tidak ada gaya — bisa jadi gaya-gayanya saling mengimbangi (seimbang).",
            "Gravitasi bumi menarik semua benda ke bawah. Itulah mengapa bola yang dilempar ke atas selalu jatuh kembali."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "Gaya",
                equation = "\\text{Gaya} = \\text{Dorongan atau Tarikan}",
                meaning = "Gaya adalah pengaruh yang dapat mengubah kecepatan, arah, atau bentuk suatu benda.",
                units = "Newton (N)",
                applicationNote = "1 Newton kira-kira seberat menahan sebuah apel kecil di telapak tangan."
            ),
            FormulaCard(
                symbol = "Efek Gaya",
                equation = "\\text{Gaya} \\rightarrow \\text{Gerak, Diam, atau Berubah Bentuk}",
                meaning = "Gaya dapat membuat benda bergerak, berhenti, berbelok, atau berubah bentuk.",
                units = "-",
                applicationNote = "Semakin besar gaya, semakin besar pula perubahannya."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pintu Geser Otomatis di Supermarket",
            context = "Pintu geser otomatis di supermarket besar seperti Transmart dan Hypermart bergerak membuka dan menutup tanpa disentuh tangan.",
            engineeringProblem = "Bagaimana pintu bisa bergerak sendiri tanpa kita dorong atau tarik secara langsung?",
            physicalConceptUsed = "Motor listrik di atas pintu memberikan gaya dorong melalui roda gigi dan rel. Sensor inframerah mendeteksi kehadiran orang dan mengirim sinyal ke motor untuk memberikan gaya.",
            mathematicalModel = "Motor memerlukan gaya dorong F tertentu untuk menggeser pintu bermassa m kg sepanjang rel. Semakin berat pintu kaca, semakin besar gaya motor yang dibutuhkan.",
            realWorldImpact = "Pintu otomatis membantu orang yang tangannya penuh belanjaan, pengguna kursi roda, dan orang lanjut usia masuk ke toko dengan mudah dan aman.",
            relatedCareers = listOf("Teknisi Otomasi Gedung", "Insinyur Mekatronika", "Perancang Aksesibilitas"),
            verifiedSource = "Standar Aksesibilitas Bangunan Gedung Kementerian PUPR RI."
        ),
        homeLab = HomeLabData(
            title = "Eksplorasi Gaya Dorong & Tarik dengan Benda Rumah Tangga",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 buku tebal (benda berat)",
                "1 pensil atau pena (benda ringan)",
                "1 karet gelang",
                "Permukaan meja datar"
            ),
            steps = listOf(
                "Langkah 1: Letakkan pensil di atas meja. Berikan dorongan lembut dengan jari. Amati: pensil meluncur cepat dan jauh.",
                "Langkah 2: Letakkan buku tebal di atas meja. Berikan dorongan lembut yang sama. Amati: buku hampir tidak bergerak! Butuh gaya dorong yang jauh lebih kuat untuk menggerakkan benda berat.",
                "Langkah 3: Kaitkan karet gelang pada pensil lalu tarik. Perhatikan bagaimana gaya tarikan karet gelang menarik pensil bergerak ke arah tanganmu.",
                "Langkah 4: Dorong pensil ke arah kanan, lalu saat bergerak sentuh perlahan dari sisi samping. Amati: arah gerak pensil berbelok!",
                "Langkah 5: Simpulkan 3 efek gaya: membuat bergerak, membutuhkan gaya lebih besar untuk benda berat, dan dapat membelokkan arah!"
            ),
            observationGoal = "Mengamati langsung bagaimana dorongan dan tarikan memengaruhi gerak benda ringan versus benda berat.",
            connectionToSimulation = "Bandingkan dorongan tanganmu dengan panah gaya pada simulator fisika!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-dorong-1",
                prompt = "Manakah kegiatan berikut yang memanfaatkan GAYA TARIK?",
                type = "multiple_choice",
                options = listOf("Membuka laci meja ke arah tubuh", "Menendang bola ke gawang", "Mengetik tombol keyboard komputer", "Mendorong gerobak pasir"),
                correctAnswer = "Membuka laci meja ke arah tubuh",
                hints = listOf(
                    "Gaya tarik menggerakkan benda mendekati tubuh kita.",
                    "Menendang, mengetik, dan mendorong gerobak adalah gaya dorong."
                ),
                explanation = "Membuka laci meja dilakukan dengan menarik pegangan laci ke arah tubuh (gaya tarik). Menendang, mengetik, dan mendorong gerobak adalah contoh gaya dorong.",
                misconception = "Mengira semua gerakan tangan selalu disebut mendorong."
            ),
            QuizQuestion(
                id = "q-dorong-2",
                prompt = "Ketika seorang kiper sepak bola menangkap bola yang melesat kencang, efek gaya yang terjadi adalah...",
                type = "multiple_choice",
                options = listOf("Membuat benda bergerak menjadi berhenti", "Membuat benda diam menjadi bergerak", "Mengubah bentuk bola menjadi kotak", "Menghilangkan gravitasi bumi"),
                correctAnswer = "Membuat benda bergerak menjadi berhenti",
                hints = listOf(
                    "Bola awalnya bergerak kencang di udara.",
                    "Setelah ditangkap tangan kiper, bola berada dalam kondisi diam di genggaman."
                ),
                explanation = "Tangan kiper memberikan gaya berlawanan arah gerak bola sehingga bola yang semula bergerak menjadi berhenti diam.",
                misconception = "Mengira gaya hanya bisa membuat benda bergerak maju."
            )
        )
    )

    // =========================================================================
    // 2. LESSON: BESARAN, SATUAN SI & PENGUKURAN (L1 — Dasar)
    // =========================================================================
    private val besaranSatuanLesson = LessonData(
        conceptId = "fis-besaran-satuan",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pbs1",
                panelNumber = 1,
                title = "Mengukur Kain dengan Jengkal Tangan",
                caption = "Kirana dan Bu Ratna berbelanja kain batik di Pasar Klewer Solo. Pedagang mengukur panjang kain menggunakan jengkal tangannya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ibu, jengkal tangan paman pedagang ini panjang, tapi jengkal tanganku kecil! Kalau aku yang ukur, jumlah jengkalnya jadi beda jauh!",
                sceneVisualEmoji = "🖐️",
                sceneDescription = "Pengukuran kain menggunakan jengkal tangan menghasilkan ukuran yang berbeda-beda."
            ),
            StoryPanel(
                id = "pbs2",
                panelNumber = 2,
                title = "Lahirnya Satuan Baku Internasional (SI)",
                caption = "Kakek mengambil meteran kayu standar 1 meter dan meletakkannya di atas meja.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itulah sebabnya para ilmuwan sedunia sepakat menciptakan SATUAN BAKU (Sistem Internasional SI)! Satu meter di Indonesia, di Jepang, atau di Amerika panjangnya SAMA PERSIS!",
                sceneVisualEmoji = "📏",
                sceneDescription = "Meteran baku standar internasional memastikan keseragaman ukuran sedunia."
            ),
            StoryPanel(
                id = "pbs3",
                panelNumber = 3,
                title = "Tujuh Pendekar Besaran Pokok",
                caption = "Dimas memperlihatkan poster 7 besaran pokok fisika di laboratorium sekolah.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Ada 7 Besaran Pokok yang menjadi pondasi seluruh alam semesta: Panjang (meter), Massa (kg), Waktu (sekon), Suhu (Kelvin), Kuat Arus (Ampere), Intensitas Cahaya (kandela), dan Jumlah Zat (mol)!",
                sceneVisualEmoji = "⚛️",
                sceneDescription = "Tujuh besaran pokok fisika diilustrasikan dengan simbol dan alat ukur bakunya."
            ),
            StoryPanel(
                id = "pbs4",
                panelNumber = 4,
                title = "Jangka Sorong yang Presisi",
                caption = "Kakek mengajari Dimas mengukur tebal koin dan diameter pipa dengan jangka sorong nonius.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jika mistar biasa hanya teliti sampai 1 milimeter, jangka sorong bisa mengukur hingga ketelitian 0,05 milimeter! Sangat penting untuk membuat mur dan baut mesin yang pas!",
                sceneVisualEmoji = "🔬",
                sceneDescription = "Jangka sorong mengukur diameter koin logam dengan skala nonius presisi."
            )
        ),
        intuitionTitle = "Fondasi Fisika: Membandingkan Nilai dengan Standar Baku",
        intuitionBody = "Mengukur adalah membandingkan suatu besaran fisis yang diukur dengan besaran sejenis yang ditetapkan sebagai standar satuan.\n\n" +
                "1. Besaran Fisis vs Non-Fisis:\n" +
                "   • Besaran Fisis: Segala sesuatu yang DAPAT DIUKUR dengan angka pasti (panjang, massa, waktu, suhu).\n" +
                "   • Non-Fisis: Sesuatu yang bersifat kualitatif perasaan (rasa sayang, keindahan, ketakutan).\n\n" +
                "2. Tujuh Besaran Pokok SI (Jembatan keledai: 'JIWA SMP'):\n" +
                "   • Jumlah zat (mol)\n" +
                "   • Intensitas cahaya (Kandela / cd)\n" +
                "   • Waktu (Sekon / s)\n" +
                "   • Arus listrik (Ampere / A)\n" +
                "   • Suhu (Kelvin / K)\n" +
                "   • Massa (Kilogram / kg)\n" +
                "   • Panjang (Meter / m)\n\n" +
                "3. Besaran Turunan:\n" +
                "   Besaran yang diturunkan dari kombinasi besaran pokok (contoh: Luas = m², Kecepatan = m/s, Gaya Newton = kg·m/s², Tekanan Pascal = N/m²).\n\n" +
                "4. Ketelitian Alat Ukur Panjang:\n" +
                "   • Mistar / Penggaris: Ketelitian 1 mm (0,1 cm).\n" +
                "   • Jangka Sorong: Ketelitian 0,1 mm hingga 0,02 mm (mengukur diameter dalam/luar pipa & kedalaman tabung).\n" +
                "   • Mikrometer Sekrup: Ketelitian 0,01 mm (mengukur ketebalan kertas atau kawat tipis).",
        intuitionPoints = listOf(
            "Satuan tak baku seperti jengkal, depa, dan langkah kaki tidak bisa dipakai dalam sains karena ukurannya berbeda antar-orang.",
            "Satuan baku SI untuk suhu resmi adalah Kelvin (K), bukan Celcius (°C).",
            "Massa benda selalu tetap di mana pun berada, sedangkan berat (w = m·g) berubah tergantung gravitasi planet."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "v \\text{ (Kecepatan)}",
                equation = "[v] = \\frac{[L]}{[T]} = \\text{m/s}",
                meaning = "Analisis dimensi besaran turunan kecepatan: panjang dibagi waktu.",
                units = "m/s",
                applicationNote = "Dimensi membuktikan konsistensi satuan rumus fisika."
            ),
            FormulaCard(
                symbol = "F \\text{ (Gaya)}",
                equation = "[F] = [M][L][T]^{-2} = \\text{kg}\\cdot\\text{m/s}^2 = \\text{Newton}",
                meaning = "Dimensi gaya Newton dari perkalian massa dan percepatan.",
                units = "Newton (N)",
                applicationNote = "1 Newton = 1 kg·m/s²."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kalibrasi Standar Metrologi Nasional Badan Standardisasi Nasional (BSN)",
            context = "Laboratorium Metrologi BSN di Serpong Tangerang menyimpan prototipe standar massa kilogram dan frekuensi waktu atomik cesium Indonesia.",
            engineeringProblem = "Jika timbangan di pelabuhan peti kemas Tanjung Priok melenceng 1% saja, kapal kargo bermuatan 20.000 ton bisa kelebihan muatan 200 ton dan karam di laut!",
            physicalConceptUsed = "Prinsip ketertelusuran metrologi kalibrasi alat ukur industri ke Standar Satuan Internasional SI.",
            mathematicalModel = "Pengukuran kalibrasi berulang menghitung ketidakpastian baku gabungan u_c = √(s² + u_alat²). BSN menerbitkan sertifikat kalibrasi timbangan tera dengan ketidakpastian < 0,001%.",
            realWorldImpact = "Menjamin keadilan transaksi perdagangan ekspor-impor senilai ribuan triliun rupiah dan keselamatan penerbangan serta pelayaran nasional.",
            relatedCareers = listOf("Metrolog Ahli Kalibrasi BSN", "Insinyur Instrumentasi & Kontrol", "Auditor Standardisasi Mutu ISO"),
            verifiedSource = "Badan Standardisasi Nasional (BSN) / Pusat Riset Metrologi BRIN."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Ketebalan 1 Lembar Kertas Buku Menggunakan Penggaris Biasa",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf("1 buku novel atau buku tulis tebal (misal 100 lembar)", "Penggaris plastik 30 cm", "Kertas catatan dan kalkulator"),
            steps = listOf(
                "Langkah 1: Satu lembar kertas terlalu tipis untuk diukur langsung dengan penggaris biasa karena tebalnya kurang dari 1 mm.",
                "Langkah 2: Rapatkan seluruh isi buku (misalnya buku berisi tepat 100 lembar halaman kertas, jangan hitung sampul tebalnya).",
                "Langkah 3: Ukur total ketebalan 100 lembar kertas tersebut dengan penggaris secara teliti (misalnya terukur 8 mm = 0,8 cm).",
                "Langkah 4: Hitung ketebalan rata-rata 1 lembar kertas: Tebal = 8 mm ÷ 100 lembar = 0,08 mm!",
                "Langkah 5: Simpulkan bahwa dengan trik matematika pelipatgandaan, alat ukur sederhana mistar bisa mengukur benda mikroskopis yang sangat tipis!"
            ),
            observationGoal = "Memahami strategi pengukuran tak langsung untuk benda di bawah batas ketelitian alat ukur.",
            connectionToSimulation = "Bandingkan skala ketelitian jangka sorong di simulator pengukuran fisika!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-bes-1",
                prompt = "Manakah di antara besaran berikut yang merupakan BESARAN POKOK dalam Sistem Internasional (SI)?",
                type = "multiple_choice",
                options = listOf("Massa, Waktu, dan Panjang", "Kecepatan, Percepatan, dan Gaya", "Luas, Volume, dan Massa Jenis", "Energi, Daya, dan Usaha"),
                correctAnswer = "Massa, Waktu, dan Panjang",
                hints = listOf(
                    "Besaran pokok adalah besaran dasar yang satuannya telah ditetapkan lebih dulu.",
                    "Ingat hafalan 'JIWA SMP' (Jumlah zat, Intensitas, Waktu, Arus, Suhu, Massa, Panjang)."
                ),
                explanation = "Massa (kg), Waktu (s), dan Panjang (m) adalah bagian dari 7 besaran pokok SI. Kecepatan, gaya, luas, dan energi adalah besaran turunan.",
                misconception = "Mengira gaya atau energi adalah besaran pokok."
            ),
            QuizQuestion(
                id = "q-bes-2",
                prompt = "Alat ukur panjang yang paling tepat dan teliti untuk mengukur diameter luar kawat kabel tembaga tipis adalah...",
                type = "multiple_choice",
                options = listOf("Mikrometer sekrup", "Mistar plastik", "Pita meteran gulung", "Jengkal tangan"),
                correctAnswer = "Mikrometer sekrup",
                hints = listOf(
                    "Kawat kabel tembaga memiliki diameter sangat tipis di bawah 1 mm.",
                    "Cari alat ukur dengan tingkat ketelitian tertinggi (0,01 mm)."
                ),
                explanation = "Mikrometer sekrup memiliki tingkat ketelitian tertinggi (0,01 mm) sehingga sangat ideal untuk mengukur diameter benda yang sangat tipis seperti kawat atau pelat logam.",
                misconception = "Mengira mistar biasa cukup teliti untuk mengukur kawat tipis."
            )
        )
    )

    // =========================================================================
    // 3. LESSON: SUHU, KALOR & PERPINDAHAN PANAS (L1 — Dasar)
    // =========================================================================
    private val suhuKalorLesson = LessonData(
        conceptId = "fis-suhu-kalor",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "psk1",
                panelNumber = 1,
                title = "Menyeduh Teh Panas dengan Sendok Logam",
                caption = "Kirana menyeduh teh manis panas di dapur. Ia mengaduk gula memakai sendok logam stainless steel.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Aduh! Ujung pegangan sendok logam ini mendadak terasa panas sekali di tanganku, padahal yang tercelup air teh cuma bagian bawahnya!",
                sceneVisualEmoji = "🥄",
                sceneDescription = "Sendok logam dalam cangkir teh panas menghantarkan panas ke ujung pegangan."
            ),
            StoryPanel(
                id = "psk2",
                panelNumber = 2,
                title = "Tiga Cara Panas Berkelana",
                caption = "Kakek menjelaskan tiga cara energi kalor berpindah di alam semesta.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sendok panas adalah contoh KONDUKSI (rambatan panas lewat zat padat tanpa zatnya ikut berpindah). Sedangkan air mendidih yang berputar di panci adalah KONVEKSI (aliran zat cair/gas), dan kehangatan api unggun adalah RADIASI (pancaran gelombang tanpa zat perantara)!",
                sceneVisualEmoji = "🔥",
                sceneDescription = "Diagram 3 cara perpindahan kalor: konduksi sendok, konveksi air panci, dan radiasi api."
            ),
            StoryPanel(
                id = "psk3",
                panelNumber = 3,
                title = "Suhu vs Kalor: Jangan Tertukar!",
                caption = "Dimas memperlihatkan termometer air raksa dan segelas air hangat.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Suhu adalah DERAJAT panas-dinginnya suatu benda (diukur dalam derajat Celcius dengan termometer). Sedangkan KALOR adalah ENERGI panas yang mengalir dari benda bersuhu tinggi ke benda bersuhu rendah!",
                sceneVisualEmoji = "🌡️",
                sceneDescription = "Termometer menunjukkan pembacaan derajat suhu air hangat."
            ),
            StoryPanel(
                id = "psk4",
                panelNumber = 4,
                title = "Rahasia Termos Air Panas Kakek",
                caption = "Kakek membuka penutup termos air panas antik miliknya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Di dalam termos ada tabung kaca berdinding ganda dengan ruang hampa udara di tengahnya untuk menghentikan konduksi dan konveksi, serta lapisan perak mengkilap untuk memantulkan radiasi panas kembali ke dalam!",
                sceneVisualEmoji = "🏺",
                sceneDescription = "Struktur dinding kaca ganda berhampa udara di dalam termos air panas."
            )
        ),
        intuitionTitle = "Energi Termal: Derajat Suhu, Kalor & Tiga Jalur Perpindahan",
        intuitionBody = "Kalor adalah bentuk energi termal yang secara alami mengalir spontan dari benda bersuhu lebih tinggi ke benda bersuhu lebih rendah hingga tercapai kesetimbangan termal.\n\n" +
                "1. Perbedaan Mendasar Suhu dan Kalor:\n" +
                "   • Suhu: Ukuran energi kinetik rata-rata getaran partikel dalam suatu zat (satuan: °C, °F, °R, K).\n" +
                "   • Kalor (Q): Jumlah energi panas total yang berpindah (satuan: Joule atau Kalori; 1 kalori ≈ 4,2 Joule).\n\n" +
                "2. Pengaruh Kalor terhadap Benda:\n" +
                "   • Mengubah Suhu Benda: Q = m · c · ΔT (massa × kalor jenis × perubahan suhu).\n" +
                "   • Mengubah Wujud Zat: Q = m · L (massa × kalor laten lebur/uap saat suhu konstan).\n\n" +
                "3. Tiga Cara Perpindahan Kalor:\n" +
                "   • Konduksi: Perpindahan panas melalui zat padat tanpa disertai perpindahan partikel zatnya (contoh: gagang panci logam memanas, setrika).\n" +
                "   • Konveksi: Perpindahan panas yang DISERTAI perpindahan aliran partikel fluida (cair/gas). Partikel panas memuai, massa jenis mengecil dan naik ke atas (contoh: angin darat & angin laut, air mendidih bergolak, cerobong asap).\n" +
                "   • Radiasi: Perpindahan panas secara langsung melalui gelombang elektromagnetik TANPA memerlukan medium zat perantara (contoh: panas sinar matahari sampai ke bumi menembus ruang hampa antariksa, panas api unggun).",
        intuitionPoints = listOf(
            "Benda berwarna gelap/hitam adalah penyerap dan pemancar radiasi kalor yang sangat baik, sedangkan benda putih/mengkilap adalah pemantul kalor yang baik.",
            "Bahan konduktor (logam tembaga, besi, aluminium) menghantarkan kalor dengan sangat cepat, sedangkan isolator (kayu, plastik, gabus, kain) menghambat aliran kalor.",
            "Air memiliki kalor jenis (c) yang sangat tinggi (4.200 J/kg°C), sehingga air lambat panas dan lambat dingin, menjadikannya pendingin radiator mesin yang ideal."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "Q = mc\\Delta T",
                equation = "Q = m \\cdot c \\cdot \\Delta T",
                meaning = "Kalor yang dibutuhkan untuk menaikkan suhu zat bermassa m sebesar ΔT.",
                units = "Joule (J) atau Kalori (kal)",
                applicationNote = "c = kalor jenis bahan (kapasitas panas spesifik)."
            ),
            FormulaCard(
                symbol = "\\text{Asas Black}",
                equation = "Q_{\\text{lepas}} = Q_{\\text{terima}}",
                meaning = "Hukum kekekalan energi kalor: kalor yang dilepas benda panas sama dengan kalor yang diserap benda dingin.",
                units = "Joule (J)",
                applicationNote = "Digunakan saat mencampur air panas dan air dingin hingga suhu akhir seimbang."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Desain Rumah Panggung Tradisional Ramah Iklim Tropis Nusantara",
            context = "Arsitektur rumah adat panggung di Sumatera, Kalimantan, dan Sulawesi tetap sejuk nyaman di siang hari tanpa menggunakan pendingin ruangan AC bertenaga listrik.",
            engineeringProblem = "Sinar matahari khatulistiwa memancarkan radiasi panas ekstrem hingga 35°C dengan kelembapan udara tropis tinggi yang membuat gerah.",
            physicalConceptUsed = "Prinsip ventilasi silang konveksi alami udara dan sifat isolator termal kayu serta atap rumbia.",
            mathematicalModel = "Plafon atap dibuat tinggi dengan kisi-kisi ventilasi di pucuk atap. Udara panas yang massa jenisnya lebih ringan mengalir naik konvektif keluar lewat kisi atap, menarik udara sejuk segar dari kolong bawah panggung masuk ke dalam ruangan.",
            realWorldImpact = "Menghemat konsumsi listrik rumah tangga hingga 60% dan membuktikan kearifan lokal nenek moyang nusantara dalam menerapkan hukum termodinamika fisika bangunan.",
            relatedCareers = listOf("Arsitek Bangunan Hijau (Green Building)", "Insinyur Tata Udara HVAC", "Pakar Fisika Bangunan Termal"),
            verifiedSource = "Pusat Riset Pemukiman Kementerian PUPR / Ikatan Arsitek Indonesia (IAI)."
        ),
        homeLab = HomeLabData(
            title = "Uji Konduksi Panas Mentega pada Sendok Logam vs Sendok Plastik",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 cangkir air panas (didampingi orang tua)",
                "1 sendok logam stainless steel",
                "1 sendok plastik",
                "Sedikit mentega/margarin dingin",
                "2 butir manik-manik atau kacang hijau"
            ),
            steps = listOf(
                "Langkah 1: Tempelkan sebutir kacang hijau pada ujung pegangan atas sendok logam menggunakan sedikit mentega sebagai perekat.",
                "Langkah 2: Lakukan hal yang sama persis pada ujung pegangan atas sendok plastik.",
                "Langkah 3: Celupkan bagian bawah kedua sendok ke dalam cangkir berisi air panas secara bersamaan.",
                "Langkah 4: Perhatikan kacang hijau di kedua sendok: kacang hijau pada sendok logam akan segera meluncur jatuh dalam waktu 1 menit karena menteganya meleleh!",
                "Langkah 5: Kacang hijau pada sendok plastik tetap menempel kokoh berjam-jam karena plastik adalah isolator termal yang buruk menghantarkan panas!"
            ),
            observationGoal = "Menyaksikan perbedaan laju konduksi kalor antara bahan konduktor logam dan isolator plastik.",
            connectionToSimulation = "Bandingkan konduksi sendok dengan simulator perpindahan kalor!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-suhu-1",
                prompt = "Perpindahan panas sinar matahari yang melintasi ruang hampa antariksa hingga sampai menghangatkan bumi merupakan contoh dari...",
                type = "multiple_choice",
                options = listOf("Radiasi", "Konduksi", "Konveksi", "Evaporasi"),
                correctAnswer = "Radiasi",
                hints = listOf(
                    "Ruang angkasa adalah hampa udara (tidak ada partikel zat perantara).",
                    "Perpindahan panas melalui pancaran gelombang elektromagnetik disebut..."
                ),
                explanation = "Radiasi adalah perpindahan panas melalui pancaran gelombang elektromagnetik yang tidak memerlukan zat perantara materi, sehingga dapat merambat menembus ruang hampa udara.",
                misconception = "Mengira panas matahari sampai ke bumi melalui tiupan angin konveksi antariksa."
            ),
            QuizQuestion(
                id = "q-suhu-2",
                prompt = "Mengapa pada siang hari di pantai terjadi 'Angin Laut' yang bertiup sejuk dari laut menuju ke daratan?",
                type = "multiple_choice",
                options = listOf(
                    "Daratan lebih cepat panas dibanding laut, sehingga udara panas di darat naik ke atas dan digantikan udara sejuk dari laut",
                    "Air laut memantulkan seluruh sinar matahari sehingga membeku",
                    "Gravitasi bulan menarik angin pantai di siang hari",
                    "Ikan di laut berenang mendorong gelombang angin ke pantai"
                ),
                correctAnswer = "Daratan lebih cepat panas dibanding laut, sehingga udara panas di darat naik ke atas dan digantikan udara sejuk dari laut",
                hints = listOf(
                    "Daratan memiliki kalor jenis lebih kecil dibanding air laut (lebih cepat panas).",
                    "Udara panas memuai, massa jenisnya lebih ringan sehingga bergerak naik ke atas (konveksi)."
                ),
                explanation = "Di siang hari, daratan memanas lebih cepat daripada laut. Udara di atas daratan memuai dan naik ke atas (tekanan rendah), sehingga udara sejuk yang lebih padat di atas laut mengalir menggantikannya ke darat membentuk angin laut.",
                misconception = "Mengira laut lebih panas dari daratan di siang hari."
            )
        )
    )

    // =========================================================================
    // 4. LESSON: CAHAYA MERAMBAT LURUS & GETARAN BUNYI (L1 — Dasar)
    // =========================================================================
    private val cahayaBunyiLesson = LessonData(
        conceptId = "fis-cahaya-bunyi",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "pcb1",
                panelNumber = 1,
                title = "Pertunjukan Wayang Kulit Semalam Suntuk",
                caption = "Kirana dan Kakek menonton pertunjukan wayang kulit di alun-alun desa. Di belakang kelir kain putih, Ki Dalang menggerakkan wayang kulit di depan lampu blencong yang menyala terang.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lihat Kakek! Saat wayang didekatkan ke lampu, bayangan tokoh Gatotkaca di kelir kain membesar jadi raksasa gagah! Mengapa bayangan bisa terbentuk?",
                sceneVisualEmoji = "🎭",
                sceneDescription = "Lampu blencong menyinari wayang kulit menghasilkan bayangan tegas di kelir putih."
            ),
            StoryPanel(
                id = "pcb2",
                panelNumber = 2,
                title = "Cahaya Merambat Lurus",
                caption = "Kakek menyalakan lampu senter di ruangan gelap yang berdebu tipis.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Cahaya selalu MERAMBAT LURUS! Karena wayang kulit adalah benda gelap tak tembus cahaya, berkas cahaya yang terhalang tidak bisa membelok di belakangnya, sehingga terbentuklah daerah gelap bernama BAYANGAN!",
                sceneVisualEmoji = "🔦",
                sceneDescription = "Berkas sinar senter merambat lurus terhalang benda padat membentuk bayangan."
            ),
            StoryPanel(
                id = "pcb3",
                panelNumber = 3,
                title = "Gong Jawa yang Bergetar",
                caption = "Dimas memukul gong perunggu besar di panggung gamelan. Bunyi 'GOOONG...' bergema menggelegar di dada.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Saat aku sentuh bibir gong dengan jari, tanganku bergetar kesemutan! Dan begitu getaran gong kuhentikan dengan telapak tangan, bunyinya seketika lenyap diam!",
                sceneVisualEmoji = "🥁",
                sceneDescription = "Gong perunggu dipukul bergetar menghasilkan gelombang bunyi yang merambat di udara."
            ),
            StoryPanel(
                id = "pcb4",
                panelNumber = 4,
                title = "Bunyi Membutuhkan Teman: Medium Rambat",
                caption = "Kakek menjelaskan mengapa di luar angkasa sunyi senyap.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Setiap bunyi PASTI berasal dari benda yang BERGETAR! Namun bunyi butuh perantara partikel zat (udara, air, atau zat padat). Di ruang hampa antariksa tidak ada udara, jadi sekeras apa pun ledakan bintang tidak akan terdengar sama sekali!",
                sceneVisualEmoji = "🌌",
                sceneDescription = "Ruang angkasa hampa udara hening tanpa perambatan gelombang bunyi."
            )
        ),
        intuitionTitle = "Cahaya & Akustik: Foton Lurus & Gelombang Mekanik Getaran",
        intuitionBody = "Cahaya dan bunyi adalah dua fenomena gelombang fundamental yang menjadi jendela panca indera penglihatan dan pendengaran manusia.\n\n" +
                "1. Sifat-Sifat Pokok Cahaya:\n" +
                "   • Merambat Lurus: Berkas foton cahaya merambat lurus di medium homogen (menghasilkan bayangan umbra dan penumbra).\n" +
                "   • Menembus Benda Bening: Cahaya menembus kaca transparan dan air jernih, tetapi terhalang oleh benda gelap (opak).\n" +
                "   • Dapat Dipantulkan: Hukum Pemantulan (Sudut Datang i = Sudut Pantul r).\n" +
                "   • Dapat Dibiaskan (Dibelokkan): Berkas cahaya berbelok arah saat merambat melintasi dua medium dengan kerapatan optik berbeda (misal dari udara ke air).\n" +
                "   • Cepat Rambat Cahaya: Merambat sangat cepat di ruang hampa (c ≈ 300.000 km/detik)!\n\n" +
                "2. Sifat-Sifat Pokok Bunyi:\n" +
                "   • Sumber Bunyi: Selalu dihasilkan oleh benda yang bergetar bolak-balik (senar gitar, pita suara, membran drum).\n" +
                "   • Gelombang Mekanik Longitudinal: Berupa gelombang rapatan dan renggangan partikel medium.\n" +
                "   • WAJIB Membutuhkan Medium: Merambat paling cepat di zat padat (besi ~5.000 m/s), lalu zat cair (air ~1.500 m/s), dan paling lambat di udara gas (~340 m/s). TIDAK BISA merambat di ruang hampa!\n" +
                "   • Kuat-Lemah Bunyi dipengaruhi Amplitudo, Tinggi-Rendah Bunyi dipengaruhi Frekuensi.",
        intuitionPoints = listOf(
            "Kilat dan Petir terjadi bersamaan di langit, tetapi kita selalu MELIHAT KILAT terlebih dahulu baru MENDENGAR SUARA GUNTUR beberapa detik kemudian karena cahaya merambat jutaan kali lebih cepat daripada bunyi.",
            "Telinga manusia normal hanya mampu mendengar bunyi Audiosonik dengan frekuensi antara 20 Hz sampai 20.000 Hz.",
            "Hewan kelelawar dan lumba-lumba memanfaatkan pantulan bunyi Ultrasonik (>20.000 Hz) untuk navigasi ekolokasi dalam kegelapan."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "v = \\frac{s}{t}",
                equation = "v_{\\text{bunyi}} = \\frac{s}{t} \\quad , \\quad c = 3 \\times 10^8 \\text{ m/s}",
                meaning = "Cepat rambat gelombang bunyi di udara (~340 m/s) berbanding jarak tempuh dibagi waktu.",
                units = "m/s",
                applicationNote = "Jika selisih kilat dan guntur 3 detik, jarak badai s = 340 × 3 = 1.020 meter (~1 km)."
            ),
            FormulaCard(
                symbol = "i = r",
                equation = "\\theta_{\\text{datang}} = \\theta_{\\text{pantul}}",
                meaning = "Hukum Pemantulan Snellius: sudut sinar datang sama dengan sudut sinar pantul terhadap garis normal.",
                units = "derajat (°)",
                applicationNote = "Berlaku pada cermin datar, cermin cekung, dan cermin cembung."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemeriksaan USG (Ultrasonografi) Ibu Hamil di Puskesmas Nusantara",
            context = "Dokter kandungan di Puskesmas memeriksa kesehatan dan posisi janin bayi di dalam rahim ibu hamil menggunakan alat USG medis.",
            engineeringProblem = "Sinar-X rontgen berbahaya bagi janin karena radiasi ionisasi. Bagaimana melihat organ dalam janin secara aman tanpa operasi bedah?",
            physicalConceptUsed = "Prinsip pemantulan gelombang bunyi frekuensi tinggi Ultrasonik (Echocardiography frekuensi 2–5 MHz).",
            mathematicalModel = "Transduser probe memancarkan pulsa ultrasonik ke perut ibu. Saat menabrak batas jaringan organ janin, bunyi dipantulkan kembali (gema echo). Komputer menghitung kedalaman d = (v · t) / 2 dan merekonstruksi citra visual janin 3D di layar monitor.",
            realWorldImpact = "Menyelamatkan jutaan nyawa ibu dan anak melalui deteksi dini kelainan organ janin secara 100% aman tanpa radiasi berbahaya.",
            relatedCareers = listOf("Dokter Spesialis Radiologi", "Insinyur Biomedis Instrumentasi USG", "Teknisi Elektromedik Rumah Sakit"),
            verifiedSource = "Kementerian Kesehatan RI / Perkumpulan Obstetri dan Ginekologi Indonesia (POGI)."
        ),
        homeLab = HomeLabData(
            title = "Membuat Telepon Kaleng Benang Tradisional (Perambatan Bunyi Zat Padat)",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "2 buah gelas kertas/kaleng susu bekas",
                "Benang kasur atau tali kenur nilon panjang 5 meter",
                "1 buah paku kecil (didampingi orang tua untuk melubangi)",
                "2 buah tusuk gigi/korek api sebagai pasak ganjal"
            ),
            steps = listOf(
                "Langkah 1: Lubangi bagian tengah dasar kedua gelas kaleng dengan paku kecil.",
                "Langkah 2: Masukkan ujung benang ke lubang dari luar ke dalam kaleng, ikat kuat pada sepotong tusuk gigi agar benang tidak lepas tertarik.",
                "Langkah 3: Mintalah adik atau temanmu memegang satu kaleng di telinganya dan kamu memegang kaleng satu lagi di mulutmu.",
                "Langkah 4: Mundurlah hingga benang terentang LURUS DAN KENCANG (jangan kendur dan jangan menyentuh benda lain!).",
                "Langkah 5: Berbisiklah sangat pelan ke dalam kalengmu: temanmu akan mendengar suaramu dengan sangat jelas seolah kamu berbisik tepat di telinganya!",
                "Langkah 6: Sekarang buat benangnya kendur dan berbisik lagi: suaramu langsung lenyap karena getaran bunyi diredam benang kendur!"
            ),
            observationGoal = "Membuktikan secara langsung bahwa bunyi merambat lebih kuat dan jelas melalui zat padat (benang kencang) dibanding melalui udara bebas.",
            connectionToSimulation = "Bandingkan gelombang benang dengan simulator getaran gelombang bunyi!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-cah-1",
                prompt = "Mengapa astronot yang sedang berada di luar angkasa (ruang angkasa hampa udara) tidak dapat saling mendengar suara bicara secara langsung tanpa bantuan radio komunikasi?",
                type = "multiple_choice",
                options = listOf(
                    "Karena gelombang bunyi membutuhkan medium materi untuk merambat, sedangkan luar angkasa hampa udara",
                    "Karena baju astronot menyerap seluruh gelombang cahaya matahari",
                    "Karena gravitasi nol membekukan pita suara astronot",
                    "Karena suara bergerak terlalu cepat di luar angkasa"
                ),
                correctAnswer = "Karena gelombang bunyi membutuhkan medium materi untuk merambat, sedangkan luar angkasa hampa udara",
                hints = listOf(
                    "Bunyi adalah gelombang mekanik.",
                    "Gelombang mekanik mutlak memerlukan partikel zat perantara untuk merambatkan getaran."
                ),
                explanation = "Gelombang bunyi adalah gelombang mekanik yang memerlukan medium (padat, cair, atau gas) untuk merambat. Di luar angkasa hampa udara (vakum) tidak ada molekul partikel udara, sehingga getaran suara tidak dapat merambat sama sekali.",
                misconception = "Mengira suara bisa merambat menembus ruang hampa seperti cahaya."
            ),
            QuizQuestion(
                id = "q-cah-2",
                prompt = "Saat terjadi badai petir, Dimas melihat kilatan petir di langit dan mendengar suara gelegar gunturnya tepat 2 detik kemudian. Jika cepat rambat bunyi di udara adalah 340 meter per detik, berapakah perkiraan jarak kilatan petir tersebut dari tempat Dimas berdiri?",
                type = "numeric",
                correctAnswer = "680",
                tolerance = 10f,
                unit = "meter",
                hints = listOf(
                    "Cahaya kilat merambat sangat cepat sehingga dianggap sampai seketika (0 detik).",
                    "Gunakan rumus jarak: s = kecepatan bunyi × waktu.",
                    "s = 340 m/s × 2 detik = ...?"
                ),
                explanation = "Jarak petir s = v × t = 340 m/s × 2 s = 680 meter dari posisi pengamat.",
                misconception = "Membagi kecepatan dengan waktu alih-alih mengalikannya."
            )
        )
    )

    // =========================================================================
    // 5. LESSON: LISTRIK STATIS & MAGNET SEDERHANA (L1 — Dasar)
    // =========================================================================
    private val listrikMagnetLesson = LessonData(
        conceptId = "fis-listrik-magnet-sederhana",
        level = DepthLevel.L1,
        storyPanels = listOf(
            StoryPanel(
                id = "plm1",
                panelNumber = 1,
                title = "Penggaris Plastik Menarik Sobekan Kertas",
                caption = "Kirana menggosok-gosokkan penggaris plastik ke rambut keringnya berulang kali, lalu mendekatkannya ke sobekan kertas kecil di meja.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ajaib! Kertas-kertas kecil melompat ke atas dan menempel erat di penggaris seperti sulap! Mengapa bisa menempel tanpa lem?",
                sceneVisualEmoji = "🪄",
                sceneDescription = "Sobekan kertas kecil melompat menempel pada penggaris plastik bermuatan listrik statis."
            ),
            StoryPanel(
                id = "plm2",
                panelNumber = 2,
                title = "Elektron yang Berpindah Tempat",
                caption = "Kakek menjelaskan perpindahan elektron di tingkat atom.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itulah LISTRIK STATIS! Gesekan mengikis elektron dari rambutmu pindah ke penggaris plastik. Penggaris menjadi bermuatan negatif berlebih dan menarik muatan positif pada kertas!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Perpindahan muatan elektron menghasilkan gaya tarik elektrostatik."
            ),
            StoryPanel(
                id = "plm3",
                panelNumber = 3,
                title = "Misteri Dua Kutub Magnet",
                caption = "Dimas memegang dua magnet batang berlabel U (Utara) dan S (Selatan).",
                dialogueSpeaker = "Dimas",
                dialogueText = "Lihat Kakek, saat kutub Utara didekatkan ke kutub Selatan, mereka saling MENARIK kencang! Tapi saat sesama kutub Utara didekatkan, tangan kita merasa ditolak kuat seperti ada bantal tak terlihat!",
                sceneVisualEmoji = "🧲",
                sceneDescription = "Kutub sejenis tolak-menolak dan kutub berlawanan tarik-menarik."
            ),
            StoryPanel(
                id = "plm4",
                panelNumber = 4,
                title = "Jarum Kompas Penunjuk Arah",
                caption = "Kakek mengeluarkan kompas saku kuno milik pelaut.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Bumi kita sendiri adalah magnet raksasa! Jarum kompas selalu menunjuk ke arah kutub utara bumi, memandu para pelaut mengarungi samudra Nusantara tanpa tersesat!",
                sceneVisualEmoji = "🧭",
                sceneDescription = "Jarum kompas berputar di medan magnet bumi menunjuk arah utara selatan."
            )
        ),
        intuitionTitle = "Gaya Tak Kasat Mata: Muatan Listrik & Medan Magnet",
        intuitionBody = "Elektromagnetisme adalah salah satu dari empat gaya fundamental di alam semesta yang mengatur interaksi muatan partikel atom.\n\n" +
                "1. Listrik Statis (Elektrostatika):\n" +
                "   • Atom tersusun dari proton (+), elektron (-), dan neutron (netral).\n" +
                "   • Benda bermuatan sejenis akan TOLAK-MENOLAK (+ dengan +, atau - dengan -).\n" +
                "   • Benda bermuatan berlawanan akan TARIK-MENARIK (+ dengan -).\n" +
                "   • Terjadinya Petir: Gesekan antar-tetes air dan kristal es di dalam awan badai cumulonimbus memisahkan muatan listrik raksasa, yang akhirnya melepaskan kilatan loncatan elektron bertegangan jutaan volt ke bumi.\n\n" +
                "2. Magnet & Sifat Kemagnetan:\n" +
                "   • Setiap magnet SELALU memiliki 2 kutub: Kutub Utara (U) dan Kutub Selatan (S).\n" +
                "   • Tidak ada magnet berkutub tunggal (monopol): jika magnet dipotong jadi dua, setiap potongan otomatis memiliki kutub U dan S baru!\n" +
                "   • Kutub Senama TOLAK-MENOLAK (U-U atau S-S).\n" +
                "   • Kutub Tak Senama TARIK-MENARIK (U-S).\n\n" +
                "3. Bahan Magnetik vs Non-Magnetik:\n" +
                "   • Feromagnetik: Ditarik sangat kuat oleh magnet (besi, baja, nikel, kobalt).\n" +
                "   • Non-Magnetik: Tidak ditarik magnet (kayu, plastik, kaca, tembaga, emas).",
        intuitionPoints = listOf(
            "Menggosok balon karet ke baju wol lalu menempelkannya di dinding adalah contoh demonstrasi listrik statis yang sangat mudah dicoba di rumah.",
            "Kutub utara jarum kompas menunjuk ke kutub utara geografis bumi karena di sana terdapat kutub magnetik selatan bumi yang menariknya.",
            "Konduktor listrik mengalirkan arus elektron dengan lancar (kabel tembaga), sedangkan isolator menahannya (plastik pelindung kabel)."
        ),
        simId = "sim-placeholder",
        formulas = listOf(
            FormulaCard(
                symbol = "F_{\\text{Coulomb}}",
                equation = "F = k \\frac{|q_1 q_2|}{r^2}",
                meaning = "Hukum Coulomb: gaya tarik atau tolak antara dua muatan listrik q₁ dan q₂ pada jarak r.",
                units = "Newton (N)",
                applicationNote = "Semakin dekat jarak muatan, gaya tariknya meningkat kuadratis berlipat ganda."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemasangan Penangkal Petir Gedung Pencakar Langit Monas & Wisma 46 Jakarta",
            context = "Jakarta dan wilayah Bogor memiliki hari guruh tertinggi di dunia (lebih dari 200 hari petir per tahun).",
            engineeringProblem = "Gedung pencakar langit setinggi ratusan meter rawan tersambar petir bermuatan 30.000 Ampere yang dapat membakar instalasi listrik dan merobohkan gedung.",
            physicalConceptUsed = "Prinsip loncatan muatan elektrostatik batang konduktor Franklin penangkal petir berujung runcing tembaga.",
            mathematicalModel = "Ujung tembaga runcing memusatkan medan listrik ionisasi udara (efek korona discharge). Sambaran kilat ditangkap dan dialirkan langsung melalui kabel tembaga berpenampang tebal menuju sistem pentanahan (grounding) tembaga sedalam 12 meter di tanah basah berhambatan tanah R < 2 Ohm.",
            realWorldImpact = "Melindungi ribuan nyawa penghuni gedung perkantoran dan menjaga peralatan server komputer perbankan dari lonjakan arus kilat.",
            relatedCareers = listOf("Insinyur Sistem Proteksi Petir", "Electrical Safety Inspector", "Teknisi Grounding Instalasi"),
            verifiedSource = "Standar Proteksi Petir Bangunan Gedung SNI 03-7015 / PLN Indonesia."
        ),
        homeLab = HomeLabData(
            title = "Membuat Kompas Air Sederhana Menggunakan Jarum Jahit & Gabus",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 batang magnet kulkas yang kuat",
                "1 jarum jahit logam kecil (didampingi orang tua)",
                "1 tutup botol gabus gabus tipis (atau sepotong daun kecil)",
                "1 mangkuk berisi air tenang",
                "Kompas smartphone untuk pencocokan kalibrasi"
            ),
            steps = listOf(
                "Langkah 1: Gosokkan ujung jarum jahit ke kutub magnet kulkas secara SEARAH sebanyak 40–50 kali (jangan bolak-balik agar domain magnet elementer sejajar).",
                "Langkah 2: Tancapkan jarum yang sudah termagnetisasi tersebut melintang secara mendatar di atas potongan gabus tipis/daun.",
                "Langkah 3: Apungkan gabus berisi jarum di atas permukaan air mangkuk yang tenang.",
                "Langkah 4: Amati: gabus akan berputar perlahan di atas air dan berhenti menunjuk arah tertentu secara stabil!",
                "Langkah 5: Cocokkan arah ujung jarum dengan aplikasi kompas di smartphone: jarummu tepat menunjuk arah UTARA-SELATAN magnetik bumi!"
            ),
            observationGoal = "Membuktikan secara langsung bahwa jarum baja yang dimagnetisasi akan berinteraksi dengan medan magnet bumi sebagai kompas navigasi.",
            connectionToSimulation = "Bandingkan jarum airmu dengan simulator kutub magnet bumi!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mag-1",
                prompt = "Dua buah magnet batang didekatkan pada kutub-kutubnya. Jika kutub Utara (U) didekatkan dengan kutub Selatan (S), maka interaksi yang terjadi antara kedua magnet adalah...",
                type = "multiple_choice",
                options = listOf("Saling tarik-menarik", "Saling tolak-menolak", "Berputar tanpa henti", "Tidak terjadi gaya apapun"),
                correctAnswer = "Saling tarik-menarik",
                hints = listOf(
                    "Kutub tidak senama (berbeda jenis) memiliki sifat...",
                    "Utara dan Selatan adalah kutub yang berbeda jenis."
                ),
                explanation = "Dua kutub magnet yang berlainan jenis (kutub tidak senama: Utara dan Selatan) akan saling tarik-menarik. Kutub yang sejenis (Utara-Utara atau Selatan-Selatan) akan saling tolak-menolak.",
                misconception = "Mengira kutub magnet selalu tolak-menolak dalam segala situasi."
            ),
            QuizQuestion(
                id = "q-mag-2",
                prompt = "Benda-benda berikut yang DAPAT DITARIK DENGAN KUAT oleh magnet (bersifat feromagnetik) adalah...",
                type = "multiple_choice",
                options = listOf("Paku besi dan klip baja", "Kayu dan plastik", "Kaca dan kain", "Karet penghapus dan kertas"),
                correctAnswer = "Paku besi dan klip baja",
                hints = listOf(
                    "Magnet hanya menarik bahan logam tertentu yang bersifat feromagnetik.",
                    "Besi dan baja mengandung unsur logam magnetik."
                ),
                explanation = "Paku besi dan klip kertas berbahan baja adalah material feromagnetik yang ditarik kuat oleh medan magnet. Kayu, plastik, kaca, dan karet adalah material non-magnetik.",
                misconception = "Mengira semua jenis logam (seperti emas dan aluminium) ditarik kuat oleh magnet seperti besi."
            )
        )
    )
}

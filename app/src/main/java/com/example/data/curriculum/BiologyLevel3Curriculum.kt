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

object BiologyLevel3Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "bio-metode-ilmiah",
            domain = Domain.BIOLOGI,
            topic = "Metodologi Ilmiah Biologi",
            title = "Ruang Lingkup Biologi & Metode Ilmiah",
            description = "Objek studi cabang biologi, perumusan masalah, hipotesis teruji, variabel bebas, terikat, dan kontrol, serta analisis data empiris objektif.",
            level = DepthLevel.L3,
            estMinutes = 15,
            prerequisites = emptyList()
        ),
        ConceptItem(
            id = "bio-mikroorganisme-virus",
            domain = Domain.BIOLOGI,
            topic = "Mikrobiologi & Virologi",
            title = "Virus & Keanekaragaman Mikroorganisme",
            description = "Struktur aseluler virion, siklus litik vs lisogenik, bakteri Gram positif dan negatif peptidoglikan, protista, serta klasifikasi fungi.",
            level = DepthLevel.L3,
            estMinutes = 16,
            prerequisites = listOf("bio-metode-ilmiah", "bio-sel")
        ),
        ConceptItem(
            id = "bio-biomolekul",
            domain = Domain.BIOLOGI,
            topic = "Biokimia Molekuler",
            title = "Biomolekul Kehidupan: Karbohidrat, Lipid, Protein, Asam Nukleat",
            description = "Struktur polimer hayati: ikatan glikosidik polisakarida, fosfolipid dwilapis membran sel, ikatan peptida protein, dan rantai polinukleotida DNA/RNA.",
            level = DepthLevel.L3,
            estMinutes = 17,
            prerequisites = listOf("bio-sel", "kim-senyawa-karbon")
        ),
        ConceptItem(
            id = "bio-transpor-membran",
            domain = Domain.BIOLOGI,
            topic = "Fisiologi Seluler Lanjut",
            title = "Model Membran Sel & Mekanisme Transpor Seluler",
            description = "Model mosaik cair Singer-Nicolson, organel sistem endomembran, difusi, osmosis, pompa ion Na+/K+ ATPase, serta endositosis dan eksositosis.",
            level = DepthLevel.L3,
            estMinutes = 16,
            prerequisites = listOf("bio-biomolekul")
        ),
        ConceptItem(
            id = "bio-metabolisme-enzim",
            domain = Domain.BIOLOGI,
            topic = "Bioenergetika & Metabolisme",
            title = "Metabolisme Seluler: Enzim, Respirasi Aerob & Fotosintesis",
            description = "Kinetika enzim sisi aktif, 4 tahapan respirasi seluler (glikolisis, DO, siklus Krebs, fosforilasi oksidatif rantai transpor elektron), fermentasi, dan reaksi terang/gelap Calvin.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("bio-transpor-membran")
        ),
        ConceptItem(
            id = "bio-pembelahan-sel",
            domain = Domain.BIOLOGI,
            topic = "Sitogenetika",
            title = "Pembelahan Sel: Mitosis, Meiosis & Gametogenesis",
            description = "Siklus sel interfase (G1, S, G2), tahapan mitosis sel somatis diploid identik, tahapan meiosis reduksi haploid dengan pindah silang (crossing over), serta spermatogenesis dan oogenesis.",
            level = DepthLevel.L3,
            estMinutes = 17,
            prerequisites = listOf("bio-transpor-membran")
        ),
        ConceptItem(
            id = "bio-genetika-mendel",
            domain = Domain.BIOLOGI,
            topic = "Genetika Lanjut",
            title = "Hukum Mendel, Pautan Seks & Mutasi Genetik",
            description = "Hukum segregasi dan asortasi bebas persilangan dihibrid 9:3:3:1, penyimpangan semu Mendel, pautan seks kromosom X (buta warna, hemofilia), serta aberasi mutasi kromosom.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("bio-pembelahan-sel")
        ),
        ConceptItem(
            id = "bio-sintesis-protein",
            domain = Domain.BIOLOGI,
            topic = "Biologi Molekuler",
            title = "Sintesis Protein, Replikasi DNA & Dogma Sentral",
            description = "Replikasi semikonservatif untai leading dan lagging Okazaki, transkripsi mRNA oleh RNA polimerase, pematangan splicing ekson-intron, serta translasi kodon triplet ribosom.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("bio-biomolekul", "bio-genetika-mendel")
        ),
        ConceptItem(
            id = "bio-evolusi",
            domain = Domain.BIOLOGI,
            topic = "Evolusi Hayati",
            title = "Teori Evolusi Darwin, Bukti Ilmiah & Kesetimbangan Hardy-Weinberg",
            description = "Teori seleksi alam Darwin vs adaptasi Lamarck, bukti anatomi homolog/analog, biokimia molekuler DNA, hukum kesetimbangan populasi Hardy-Weinberg, dan mekanisme spesiasi alopatrik.",
            level = DepthLevel.L3,
            estMinutes = 17,
            prerequisites = listOf("bio-genetika-mendel")
        ),
        ConceptItem(
            id = "bio-keanekaragaman-hayati",
            domain = Domain.BIOLOGI,
            topic = "Biosistematika",
            title = "Keanekaragaman Hayati, Garis Wallace & Filogeni",
            description = "Tingkat keanekaragaman gen, spesies, ekosistem, persebaran biogeografi Indonesia garis Wallace-Weber, filogeni Plantae (lumut hingga spermatophyta) dan Animalia (porifera hingga chordata).",
            level = DepthLevel.L3,
            estMinutes = 16,
            prerequisites = listOf("bio-evolusi")
        ),
        ConceptItem(
            id = "bio-jaringan-tumbuhan",
            domain = Domain.BIOLOGI,
            topic = "Fisiologi Tumbuhan Lanjut",
            title = "Struktur Jaringan Tumbuhan & Fitohormon Pertumbuhan",
            description = "Jaringan meristem apikal/lateral, xilem dan floem pengangkut, teori kohesi-tensi transpirasi, fitohormon (auksin, giberelin, sitokinin, asam absisat, etilen), dan fotoperiodisme.",
            level = DepthLevel.L3,
            estMinutes = 17,
            prerequisites = listOf("bio-metabolisme-enzim")
        ),
        ConceptItem(
            id = "bio-sistem-regulasi-imun",
            domain = Domain.BIOLOGI,
            topic = "Fisiologi Manusia Lanjut",
            title = "Sistem Regulasi Saraf, Endokrin & Sistem Imun Adaptif",
            description = "Mekanisme potensial aksi akson membran -70 mV ke +30 mV, transmisi sinapsis neurotransmiter, homeostasis hormon insulin/glukagon, serta sistem imun sel T, sel B antibodi, dan memori vaksin.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("bio-transpor-membran")
        ),
        ConceptItem(
            id = "bio-ekologi-populasi",
            domain = Domain.BIOLOGI,
            topic = "Ekologi Kuantitatif",
            title = "Dinamika Populasi, Suksesi Ekologis & Siklus Biogeokimia",
            description = "Pertumbuhan populasi logistik daya dukung lingkungan (K), suksesi primer dan sekunder, serta daur biogeokimia global materi karbon, nitrogen, fosfor, dan air.",
            level = DepthLevel.L3,
            estMinutes = 16,
            prerequisites = listOf("bio-evolusi")
        ),
        ConceptItem(
            id = "bio-bioteknologi",
            domain = Domain.BIOLOGI,
            topic = "Bioteknologi Modern",
            title = "Bioteknologi Modern: Rekayasa Genetika, Kultur Jaringan & PCR",
            description = "Totipotensi sel kultur jaringan, teknologi DNA rekombinan enzim restriksi dan vektor plasmid kloning, amplifikasi DNA Polymerase Chain Reaction (PCR), serta elektroforesis gel.",
            level = DepthLevel.L3,
            estMinutes = 18,
            prerequisites = listOf("bio-sintesis-protein")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "bio-metode-ilmiah" -> metodeIlmiahLesson
            "bio-mikroorganisme-virus" -> mikroorganismeVirusLesson
            "bio-biomolekul" -> biomolekulLesson
            "bio-transpor-membran" -> transporMembranLesson
            "bio-metabolisme-enzim" -> metabolismeEnzimLesson
            "bio-pembelahan-sel" -> pembelahanSelLesson
            "bio-genetika-mendel" -> genetikaMendelLesson
            "bio-sintesis-protein" -> sintesisProteinLesson
            "bio-evolusi" -> evolusiLesson
            "bio-keanekaragaman-hayati" -> keanekaragamanHayatiLesson
            "bio-jaringan-tumbuhan" -> jaringanTumbuhanLesson
            "bio-sistem-regulasi-imun" -> sistemRegulasiImunLesson
            "bio-ekologi-populasi" -> ekologiPopulasiLesson
            "bio-bioteknologi" -> bioteknologiLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. RUANG LINGKUP BIOLOGI & METODE ILMIAH
    // =========================================================================
    private val metodeIlmiahLesson = LessonData(
        conceptId = "bio-metode-ilmiah",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pmi1",
                panelNumber = 1,
                title = "Misteri Daun Kelor di Laboratorium",
                caption = "Kirana dan Dimas diajak berkunjung ke Balai Riset Tanaman Obat BRIN di Serpong.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Masyarakat percaya seduhan daun kelor dapat menyembuhkan peradangan. Tapi sebagai calon ilmuwan, bagaimana kita membuktikannya secara sahih menurut metode ilmiah?",
                sceneVisualEmoji = "🧪",
                sceneDescription = "Laboratorium farmakologi modern dengan alat ekstraksi cairan dan spektrofotometer."
            ),
            StoryPanel(
                id = "pmi2",
                panelNumber = 2,
                title = "Perumusan Masalah & Hipotesis Teruji",
                caption = "Peneliti BRIN menerangkan alur kerja saintifik yang sistematis.",
                dialogueSpeaker = "Peneliti BRIN",
                dialogueText = "Kita mulai dari Perumusan Masalah terukur, lalu menyusun Hipotesis Nol (H0: tidak ada pengaruh) dan Hipotesis Kerja (Ha: ekstrak kelor menurunkan radang secara signifikan) yang dapat diuji secara statistik!",
                sceneVisualEmoji = "📊",
                sceneDescription = "Papan tulis memperlihatkan rancangan variabel eksperimen dan uji hipotesis."
            ),
            StoryPanel(
                id = "pmi3",
                panelNumber = 3,
                title = "Tripartit Variabel Eksperimen",
                caption = "Dimas mencatat pembagian kelompok kontrol dan kelompok perlakuan.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Variabel Bebas adalah dosis ekstrak kelor, Variabel Terikat adalah penurunan tingkat enzim radang, dan Variabel Kontrol (seperti suhu dan jenis hewan uji) dijaga persis sama agar data objektif!",
                sceneVisualEmoji = "⚖️",
                sceneDescription = "Perbandingan kelompok kontrol plasebo dan kelompok perlakuan dosis bertingkat."
            ),
            StoryPanel(
                id = "pmi4",
                panelNumber = 4,
                title = "Integritas Data & Publikasi Ilmiah",
                caption = "Kirana melihat grafik analisis korelasi regresi pada layar komputer.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Sains menuntut replikasi berulang dan taraf kepercayaan p-value < 0,05! Data empiris yang jujurlah yang menjadi dasar kemajuan ilmu pengetahuan dunia!",
                sceneVisualEmoji = "📈",
                sceneDescription = "Grafik batang hasil uji efikasi dengan simpangan baku dan tanda signifikansi p-value."
            )
        ),
        intuitionTitle = "Metode Ilmiah: Pondasi Berpikir Kritis Sains Biologi",
        intuitionBody = "Biologi adalah ilmu empiris yang mempelajari gejala-gejala alam makhluk hidup menggunakan langkah-langkah sistematis yang logis, objektif, dan dapat diulang (*replicable*).\n\n" +
                "1. Langkah Sistematis Metode Ilmiah:\n" +
                "   • Observasi Fenomena: Pengamatan cermat terhadap gejala alam (kualitatif dengan indera, kuantitatif dengan instrumen ukur).\n" +
                "   • Identifikasi & Perumusan Masalah: Pertanyaan spesifik berstruktur 'Bagaimana pengaruh variabel X terhadap variabel Y?'.\n" +
                "   • Studi Kepustakaan: Mengkaji teori dan penelitian terdahulu yang relevan.\n" +
                "   • Penyusunan Hipotesis: Jawaban sementara yang logis dan dapat diuji secara eksperimen (H₀ dan Hₐ).\n" +
                "   • Perancangan & Pelaksanaan Eksperimen: Melakukan pengujian terkontrol dengan ulangan (replikasi).\n" +
                "   • Analisis Data & Uji Statistik: Mengolah data dengan rata-rata, standar deviasi, dan uji hipotesis (uji t / ANOVA).\n" +
                "   • Penarikan Kesimpulan: Menentukan apakah data mendukung atau menolak hipotesis, diikuti publikasi ilmiah.\n\n" +
                "2. Klasifikasi Tiga Macam Variabel Eksperimen:\n" +
                "   • Variabel Bebas (Independen): Faktor yang sengaja diubah-ubah atau divariasikan oleh peneliti (misal: konsentrasi pupuk 0%, 5%, 10%, 15%).\n" +
                "   • Variabel Terikat (Dependen): Respons atau hasil yang diukur akibat perubahan variabel bebas (misal: pertambahan tinggi tanaman dalam cm).\n" +
                "   • Variabel Kontrol: Semua faktor luar yang sengaja dibuat sama dan konstan pada semua kelompok agar tidak mengacaukan hasil (misal: jenis tanah, intensitas cahaya, volume penyiraman air).",
        intuitionPoints = listOf(
            "Suatu hipotesis tidak pernah 'terbukti 100% mutlak selamanya', melainkan 'didukung oleh bukti eksperimen saat ini' hingga ada bukti baru yang membantahnya (prinsip falsifiabilitas Popper).",
            "Kelompok Kontrol adalah kelompok yang tidak diberi perlakuan variabel bebas (diberi perlakuan nol/plasebo) sebagai tolok ukur pembanding murni.",
            "Replikasi eksperimen (minimal 3 kali pengulangan) mutlak diperlukan untuk menyingkirkan kesalahan acak dan variasi biologis alami antar-spesimen."
        ),
        simId = "sim-scientific-method",
        formulas = listOf(
            FormulaCard(
                symbol = "p < \\alpha",
                equation = "p < 0{,}05 \\quad \\Rightarrow \\quad \\text{Tolak } H_0",
                meaning = "Kriteria signifikansi statistik (p-value kurang dari taraf nyata alfa 5%).",
                units = "nilai probabilitas",
                applicationNote = "Jika p < 0,05, perbedaan efek antar perlakuan dinyatakan nyata/signifikan secara statistik, bukan akibat faktor kebetulan acak."
            ),
            FormulaCard(
                symbol = "df",
                equation = "df = n - 1",
                meaning = "Derajat kebebasan (degrees of freedom) pada sampel berukuran n.",
                units = "angka bulat",
                applicationNote = "Digunakan saat menghitung nilai tabel distribusi t-Student untuk uji komparasi dua rata-rata."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Uji Efikasi Praklinis Ekstrak Daun Kelor (Moringa oleifera) sebagai Anti-Diabetes oleh FKUI & BRIN",
            context = "Kelor telah lama digunakan dalam pengobatan jamu tradisional diabetes, tetapi belum memiliki standardisasi dosis terapeutik dan pembuktian mekanisme molekuler.",
            engineeringProblem = "Merancang uji praklinis terkontrol in-vivo untuk membuktikan apakah senyawa kuersetin dan flavonoid kelor mampu menghambat enzim alfa-glukosidase.",
            physicalConceptUsed = "Desain eksperimen acak terkontrol (Randomized Controlled Trial): 25 ekor tikus model diabetes dibagi ke dalam 5 kelompok (Kontrol normal, Kontrol negatif plasebo, Dosis 150 mg/kg, Dosis 300 mg/kg, dan Kontrol positif obat glibenklamid).",
            mathematicalModel = "Analisis varians satu arah (One-Way ANOVA) dilanjutkan uji Post-Hoc Tukey HSD untuk mengukur penurunan kadar glukosa darah puasa dengan interval kepercayaan 95%.",
            realWorldImpact = "Membuktikan ekstrak 300 mg/kg kelor mampu menurunkan glukosa darah hingga 42% setara glibenklamid, menjadikannya kandidat Fitofarmaka bersertifikat BPOM.",
            relatedCareers = listOf("Farmakolog Riset Bahan Alam", "Peneliti Bioanalisis Toksikologi", "Biostatistikawan Klinis"),
            verifiedSource = "Fakultas Kedokteran Universitas Indonesia & Pusat Riset Vaksin dan Obat BRIN."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Terkontrol: Pengaruh Intensitas Cahaya terhadap Laju Kecambah Biji Kacang Hijau",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "30 butir biji kacang hijau sehat berukuran seragam",
                "3 buah wadah plastik/gelas bekas bertanda Wadah A (Terang), Wadah B (Redup), Wadah C (Gelap Total)",
                "Kapas secukupnya dan air bersih",
                "Penggaris milimeter dan buku catatan"
            ),
            steps = listOf(
                "Langkah 1: Rendam seluruh biji kacang hijau dalam air selama 2 jam, pilih 30 biji terbaik yang tenggelam.",
                "Langkah 2: Alasi masing-masing wadah dengan kapas tebal yang dibasahi air dengan volume sama (1 sendok makan air - Variabel Kontrol).",
                "Langkah 3: Letakkan 10 biji kacang di tiap wadah. Wadah A ditaruh di dekat jendela terang, Wadah B di dalam ruangan redup, dan Wadah C dimasukkan ke dalam kardus tertutup gelap total (Variabel Bebas: intensitas cahaya).",
                "Langkah 4: Amati dan ukur panjang hipokotil batang kecambah setiap hari jam 07.00 pagi selama 5 hari menggunakan penggaris (Variabel Terikat).",
                "Langkah 5: Hitung rata-rata panjang kecambah tiap wadah. Amati fenomena Etiolasi: kecambah di wadah gelap C tumbuh sangat panjang pucat karena hormon auksin tidak terurai cahaya!"
            ),
            observationGoal = "Menerapkan prinsip variabel bebas, terikat, dan kontrol dalam membuktikan pengaruh cahaya terhadap pertumbuhan batang kecambah.",
            connectionToSimulation = "Bandingkan data grafik pertumbuhan kecambahmu dengan kurva simulasi fototropisme di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ilmiah-1",
                prompt = "Dalam sebuah eksperimen menguji pengaruh konsentrasi pupuk urea terhadap pertumbuhan tinggi tanaman jagung, faktor manakah yang berkedudukan sebagai Variabel Bebas (Independen)?",
                type = "multiple_choice",
                options = listOf("Konsentrasi pupuk urea yang diberikan", "Pertambahan tinggi tanaman jagung (cm)", "Volume air penyiraman setiap hari", "Jenis benih jagung yang digunakan"),
                correctAnswer = "Konsentrasi pupuk urea yang diberikan",
                hints = listOf(
                    "Faktor yang sengaja diubah-ubah nilainya oleh peneliti.",
                    "Konsentrasi pupuk dibuat bervariasi (misal: 0%, 5%, 10%)."
                ),
                explanation = "Variabel bebas adalah variabel yang sengaja dimanipulasi atau diubah-ubah oleh peneliti untuk melihat pengaruhnya terhadap variabel terikat. Di sini, konsentrasi pupuk urea adalah variabel bebas.",
                misconception = "Menjawab pertambahan tinggi (pertambahan tinggi adalah variabel terikat yang diukur)."
            ),
            QuizQuestion(
                id = "q-ilmiah-2",
                prompt = "Mengapa kelompok kontrol mutlak diperlukan dalam suatu eksperimen ilmiah yang valid?",
                type = "multiple_choice",
                options = listOf(
                    "Sebagai pembanding objektif untuk memastikan perubahan yang terjadi murni diakibatkan oleh perlakuan variabel bebas",
                    "Agar jumlah sampel eksperimen menjadi dua kali lebih banyak",
                    "Untuk memastikan seluruh tanaman mati terkena zat kimia",
                    "Hanya sebagai formalitas laporan ilmiah tanpa fungsi analitis"
                ),
                correctAnswer = "Sebagai pembanding objektif untuk memastikan perubahan yang terjadi murni diakibatkan oleh perlakuan variabel bebas",
                hints = listOf(
                    "Kelompok ini tidak diberi perlakuan variabel bebas.",
                    "Kata kuncinya: tolok ukur pembanding."
                ),
                explanation = "Kelompok kontrol berfungsi sebagai pembanding murni untuk membuktikan bahwa perubahan respons pada kelompok perlakuan benar-benar disebabkan oleh manipulasi variabel bebas, bukan oleh faktor lingkungan lain.",
                misconception = "Mengira kelompok kontrol hanya cadangan jika tanaman kelompok uji rusak."
            )
        )
    )

    // =========================================================================
    // 2. VIRUS & KEANEKARAGAMAN MIKROORGANISME
    // =========================================================================
    private val mikroorganismeVirusLesson = LessonData(
        conceptId = "bio-mikroorganisme-virus",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pmv1",
                panelNumber = 1,
                title = "Di Batas Kehidupan: Partikel Aseluler",
                caption = "Kirana mengamati model tiga dimensi partikel virus bakteriofag T4 yang menyerupai wahana pendarat bulan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Virus ini unik sekali! Tidak punya sitoplasma, organel, maupun membran sel. Apakah virus termasuk benda hidup atau benda mati?",
                sceneVisualEmoji = "👾",
                sceneDescription = "Struktur bakteriofag dengan kepala kapsid ikosahedral, leher, dan serabut ekor menempel pada dinding bakteri."
            ),
            StoryPanel(
                id = "pmv2",
                panelNumber = 2,
                title = "Parasit Intraseluler Obligat",
                caption = "Kakek menjelaskan batas biologis virus.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Di luar sel inang, virus adalah virion kristal tak bernyawa. Namun begitu materi genetiknya (DNA atau RNA) masuk ke dalam sel hidup, virus membajak mesin ribosom inang untuk memperbanyak diri!",
                sceneVisualEmoji = "🧬",
                sceneDescription = "DNA virus disuntikkan ke dalam sitoplasma bakteri mengendalikan replikasi sel."
            ),
            StoryPanel(
                id = "pmv3",
                panelNumber = 3,
                title = "Dua Jalur Replikasi: Litik vs Lisogenik",
                caption = "Dimas membandingkan dua peta jalur replikasi virus.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Pada Siklus Litik, sel inang pecah hancur dan melepaskan ratusan virus baru! Tapi pada Siklus Lisogenik, DNA virus bersembunyi sebagai Profag menyatu dengan kromosom inang dan membelah diam-diam!",
                sceneVisualEmoji = "💥",
                sceneDescription = "Diagram perbandingan siklus litik peledakan sel vs siklus lisogenik dorman."
            ),
            StoryPanel(
                id = "pmv4",
                panelNumber = 4,
                title = "Benteng Bakteri Gram & Keajaiban Wolbachia",
                caption = "Kirana mengamati preparat mikroskop pewarnaan Gram bakteri.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Bakteri Gram-positif berdinding peptidoglikan tebal warna ungu, sedangkan Gram-negatif merah berlapis lipopolisakarida! Dan bakteri alami Wolbachia kini digunakan di Yogyakarta untuk melumpuhkan replikasi virus Dengue!",
                sceneVisualEmoji = "🦟",
                sceneDescription = "Nyamuk Aedes aegypti ber-Wolbachia mencegah penularan virus demam berdarah."
            )
        ),
        intuitionTitle = "Mikrokosmos Partikel Hayati: Virologi & Bakteriologi Terapan",
        intuitionBody = "Dunia mikroba menyajikan keanekaragaman organisme mikroskopis dan partikel aseluler yang memainkan peran vital dalam siklus biosfer serta kesehatan manusia.\n\n" +
                "1. Karakteristik Aseluler Virus:\n" +
                "   • Ukuran ultramikroskopis (20–300 nanometer), hanya dapat dilihat dengan mikroskop elektron.\n" +
                "   • Bersifat aseluler (bukan sel): tidak memiliki membran sel, sitoplasma, sitosol, maupun ribosom.\n" +
                "   • Komposisi: Materi Genetik (asam nukleat DNA atau RNA saja, untai tunggal/ganda) yang diselubungi mantel protein pelindung (kapsid).\n" +
                "   • Bersifat Parasit Intraseluler Obligat: hanya dapat bereplikasi di dalam sel hidup inang spesifik (*host-specific*).\n\n" +
                "2. Dua Siklus Replikasi Virus:\n" +
                "   • Siklus Litik (Virulen): \n" +
                "     1. Adsorpsi (penempelan reseptor) → 2. Penetrasi (injeksi genom) → 3. Sintesis/Eklifase (replikasi DNA & perakitan kapsid) → 4. Perakitan virion utuh → 5. Lisis (pemecahan membran sel inang melepaskan ratusan virus baru).\n" +
                "   • Siklus Lisogenik:\n" +
                "     Genom virus menyisip ke dalam kromosom inang membentuk Profag. Sel inang tetap hidup dan membelah normal, mewariskan profag ke sel-sel anak hingga suatu saat terinduksi sinar UV masuk ke siklus litik.\n\n" +
                "3. Bakteriologi & Pewarnaan Gram Christian Gram:\n" +
                "   • Bakteri Gram-Positif: Memiliki dinding sel peptidoglikan yang sangat tebal berlapis murein, mengikat zat warna kristal violet sehingga tampak berwarna ungu pekat di bawah mikroskop (contoh: *Staphylococcus*, *Bacillus*).\n" +
                "   • Bakteri Gram-Negatif: Memiliki dinding peptidoglikan tipis yang dilapisi membran luar ganda lipopolisakarida (LPS) kaya endotoksin; melepaskan kristal violet saat dibilas alkohol dan menyerap zat pewarna tandingan safranin sehingga tampak berwarna merah muda (contoh: *Escherichia coli*, *Salmonella*). Lebih resisten terhadap antibiotik penisilin.",
        intuitionPoints = listOf(
            "Antibiotik seperti penisilin bekerja merusak sintesis dinding peptidoglikan bakteri, sehingga antibiotik SAMA SEKALI TIDAK MEMPAN membunuh virus karena virus tidak memiliki sel dan dinding!",
            "Virus SARS-CoV-2 (COVID-19) dan HIV adalah virus RNA yang menggunakan enzim Reverse Transcriptase atau RNA Replicase yang rawan mutasi cepat.",
            "Bakteriofag adalah virus pemakan bakteri yang kini diteliti intensif sebagai terapi fag alternatif pengganti antibiotik untuk mengatasi superbug bakteri yang kebal obat."
        ),
        simId = "sim-virus",
        formulas = listOf(
            FormulaCard(
                symbol = "R_0",
                equation = "R_0 = \\beta \\times c \\times d",
                meaning = "Bilangan Reproduksi Dasar (Basic Reproduction Number) penyebaran infeksi patogen.",
                units = "individu tertular per kasus primer",
                applicationNote = "Jika R₀ > 1, penularan penyakit menular akan meluas menjadi epidemi di tengah populasi yang belum kebal."
            ),
            FormulaCard(
                symbol = "H_{\\text{imunitas}}",
                equation = "H = 1 - \\frac{1}{R_0}",
                meaning = "Ambang batas Kekebalan Komunitas (Herd Immunity Threshold) yang harus divaksin.",
                units = "% cakupan vaksinasi",
                applicationNote = "Jika campak memiliki R₀ = 15, maka herd immunity H = 1 - 1/15 = 93,3% populasi harus tervaksinasi."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Proyek Wolbachia Mengendalikan Virus Dengue di Sleman dan Yogyakarta oleh WMP & UGM",
            context = "Indonesia mencatat ratusan ribu kasus Demam Berdarah Dengue (DBD) setiap musim penghujan akibat gigitan nyamuk Aedes aegypti penyebar virus dengue.",
            engineeringProblem = "Menghentikan replikasi virus dengue di dalam tubuh nyamuk vektor tanpa membasmi populasi nyamuk menggunakan insektisida kimiawi yang mencemari lingkungan.",
            physicalConceptUsed = "Bioteknologi pengendalian hayati: memasukkan bakteri alami Wolbachia pipientis ke dalam telur nyamuk Aedes aegypti secara mikroinjeksi.",
            mathematicalModel = "Bakteri Wolbachia memblokir replikasi molekuler virus dengue dan menurunkan angka penularan melalui fenomena cytoplasmic incompatibility (jantan Wolbachia kawin dengan betina liar menghasilkan telur steril tak menetas).",
            realWorldImpact = "Menurunkan angka penularan rawat inap kasus DBD hingga 77% di Kota Yogyakarta dan kini diadopsi secara nasional di 5 kota besar Indonesia.",
            relatedCareers = listOf("Entomolog Medis", "Ahli Virologi Molekuler", "Epidemiolog Penyakit Menular"),
            verifiedSource = "World Mosquito Program (WMP) Yogyakarta & Fakultas Kedokteran, Kesehatan Masyarakat, dan Keperawatan (FK-KMK) UGM."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Suksesi Koloni Jamur & Bakteri pada Roti Tawar Terbuka",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "2 lembar roti tawar tanpa pengawet",
                "2 kantong plastik klip transparan ziplock",
                "Air bersih beberapa tetes",
                "Kaca pembesar dan spidol permanen"
            ),
            steps = listOf(
                "Langkah 1: Ambil Kantong 1, masukkan 1 lembar roti kering apa adanya lalu tutup rapat (Spesimen Kering).",
                "Langkah 2: Ambil Kantong 2, percikkan 4–5 tetes air pada permukaan roti agar lembab, lalu tutup rapat (Spesimen Lembab).",
                "Langkah 3: Letakkan kedua kantong plastik di sudut ruangan yang hangat dan gelap selama 4–6 hari.",
                "Langkah 4: Amati setiap hari dari luar plastik tanpa membukanya: perhatikan bercak bintik hitam kapang (Rhizopus) dan koloni lendir bakteri kekuningan yang tumbuh lebat di roti lembab!",
                "Langkah 5: Bandingkan dengan roti kering yang jauh lebih awet karena kelembaban air merupakan faktor pembatas mutlak pertumbuhan mikroorganisme."
            ),
            observationGoal = "Mengamati laju pertumbuhan mikroba pembusuk saprofit pada substrat organik bergizi.",
            connectionToSimulation = "Bandingkan pertumbuhan koloni rotimu dengan simulator kurva pertumbuhan bakteri di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-virus-1",
                prompt = "Mengapa virus TIDAK DAPAT dibunuh atau dimusnahkan menggunakan obat antibiotik seperti amoksisilin atau penisilin?",
                type = "multiple_choice",
                options = listOf(
                    "Karena virus bersifat aseluler dan tidak memiliki struktur dinding sel atau ribosom yang menjadi sasaran kerja antibiotik",
                    "Karena virus memiliki cangkang kaca yang kebal terhadap semua senyawa kimia",
                    "Karena virus berukuran terlalu besar sehingga antibiotik tidak mampu menembusnya",
                    "Karena antibiotik hanya bereaksi terhadap virus bertipe DNA"
                ),
                correctAnswer = "Karena virus bersifat aseluler dan tidak memiliki struktur dinding sel atau ribosom yang menjadi sasaran kerja antibiotik",
                hints = listOf(
                    "Sasaran antibiotik adalah dinding peptidoglikan atau ribosom bakteri.",
                    "Virus bukan berupa sel dan tidak memiliki metabolisme mandiri."
                ),
                explanation = "Antibiotik dirancang khusus menarget struktur seluler prokariotik bakteri (seperti biosintesis peptidoglikan dinding sel atau sintesis protein ribosom 70S). Karena virus aseluler dan tidak memiliki target tersebut, antibiotik tidak efektif melawan infeksi virus.",
                misconception = "Mengira obat antibiotik adalah obat pembunuh segala jenis bibit penyakit termasuk virus flu."
            ),
            QuizQuestion(
                id = "q-virus-2",
                prompt = "Tahapan replikasi virus di mana materi genetik virus menyisip ke dalam DNA kromosom inang membentuk profag tanpa merusak atau menghancurkan sel inang dinamakan...",
                type = "multiple_choice",
                options = listOf("Siklus Lisogenik", "Siklus Litik", "Siklus Eklifase", "Siklus Adsorpsi"),
                correctAnswer = "Siklus Lisogenik",
                hints = listOf(
                    "Sel inang tetap hidup dan membelah membawa DNA virus.",
                    "Kata dasarnya diawali dengan 'Liso-'."
                ),
                explanation = "Pada siklus lisogenik, DNA virus berintegrasi ke dalam genom sel inang membentuk profag. Virus bereplikasi bersama DNA inang secara laten tanpa melisiskan atau mematikan sel inang.",
                misconception = "Menyamakan dengan siklus litik yang langsung memecah sel inang."
            )
        )
    )

    // =========================================================================
    // 3. BIOMOLEKUL KEHIDUPAN: KARBOHIDRAT, LIPID, PROTEIN, ASAM NUKLEAT
    // =========================================================================
    private val biomolekulLesson = LessonData(
        conceptId = "bio-biomolekul",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pbm1",
                panelNumber = 1,
                title = "Arsitektur Kimiawi Sel",
                caption = "Di laboratorium biokimia, Dimas dan Kirana mempelajari struktur molekul tiga dimensi penyusun sel hidup.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Tubuh kita terdiri dari 70% air, tapi sisanya tersusun dari empat biomolekul organik raksasa: Karbohidrat, Lipid, Protein, dan Asam Nukleat!",
                sceneVisualEmoji = "🧱",
                sceneDescription = "Struktur polimer molekul biologis yang saling terhubung membentuk kompartemen sel."
            ),
            StoryPanel(
                id = "pbm2",
                panelNumber = 2,
                title = "Rantai Gula & Benteng Fosfolipid",
                caption = "Kakek menunjukkan struktur glikogen dan membran dwilapis.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Karbohidrat dihubungkan oleh ikatan glikosidik sebagai bahan bakar glukosa dan rangka selulosa! Sedangkan fosfolipid memiliki kepala fosfat hidrofilik (suka air) dan ekor asam lemak hidrofobik (takut air) penyusun membran sel!",
                sceneVisualEmoji = "🧈",
                sceneDescription = "Kepala fosfat bulat menghadap air dan ekor lipid sejajar di bagian dalam membran."
            ),
            StoryPanel(
                id = "pbm3",
                panelNumber = 3,
                title = "Pekerja Keras Kehidupan: Protein",
                caption = "Kirana memegang model untaian polipeptida dengan lipatan rumit.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Protein dirangkai oleh ikatan peptida dari 20 ragam asam amino! Lipatan struktur 3D inilah yang membuat protein bisa bertindak sebagai enzim katalisator, hemoglobin darah, maupun antibodi pelindung!",
                sceneVisualEmoji = "🥩",
                sceneDescription = "Untaian heliks alfa dan lembaran beta berlipat membentuk struktur tersier enzim globular."
            ),
            StoryPanel(
                id = "pbm4",
                panelNumber = 4,
                title = "Arsip Informasi Genetik: Asam Nukleat",
                caption = "Dimas menunjuk tangga pilin DNA.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Dan DNA/RNA tersusun dari nukleotida yang disambung ikatan fosfodiester! Pasangan basa Adenin-Timin dan Guanin-Sitosin menyimpan cetak biru seluruh kehidupan planet bumi!",
                sceneVisualEmoji = "🧬",
                sceneDescription = "Pita ganda heliks DNA dengan ikatan hidrogen di antara pasangan basa nitrogen."
            )
        ),
        intuitionTitle = "Fondasi Kimiawi Biosfer: Empat Pilar Makromolekul Organik",
        intuitionBody = "Seluruh struktur dan fungsi kehidupan diatur oleh interaksi empat kelompok makromolekul polimer hayati yang disintesis melalui reaksi kondensasi (dehidrasi) dan dipecah via hidrolisis.\n\n" +
                "1. Karbohidrat (Polisakarida):\n" +
                "   • Monomer: Monosakarida (glukosa, fruktosa, galaktosa) berikatan glikosidik.\n" +
                "   • Disakarida: Sukrosa (glukosa + fruktosa), Maltosa (glukosa + glukosa), Laktosa (glukosa + galaktosa).\n" +
                "   • Polisakarida Penyimpan Cadangan: Amilum (pada tumbuhan) dan Glikogen (pada hati dan otot hewan).\n" +
                "   • Polisakarida Struktural: Selulosa (dinding sel tumbuhan berikatan beta-1,4 tak bisa dicerna enzim manusia) dan Kitin (dinding jamur dan eksoskeleton serangga/udang).\n\n" +
                "2. Lipid (Lemak & Minyak):\n" +
                "   • Karakter: Bersifat hidrofobik (nonpolar, tidak larut air).\n" +
                "   • Trigliserida: 1 gliserol + 3 asam lemak (ikatan ester). Lemak jenuh (padat, ikatan tunggal C-C) vs Tak Jenuh (cair, ikatan rangkap cis C=C).\n" +
                "   • Fosfolipid: Molekul amfipatik (kepala gliserol-fosfat hidrofilik bermuatan + 2 ekor asam lemak hidrofobik) yang secara spontan membentuk dwilapis (*bilayer*) membran sel.\n" +
                "   • Steroid: Rangka 4 cincin karbon menyatu (kolesterol penstabil fluiditas membran dan hormon reproduksi testosteron/estrogen).\n\n" +
                "3. Protein (Polipeptida):\n" +
                "   • Monomer: 20 ragam asam amino yang dihubungkan oleh Ikatan Peptida kovalen antara gugus karboksil (-COOH) dan amino (-NH₂).\n" +
                "   • Tingkatan Struktur Protein:\n" +
                "     - Primer: Urutan sekuens linear asam amino.\n" +
                "     - Sekunder: Lipatan lokal akibat ikatan hidrogen (alfa-heliks dan beta-pleated sheet).\n" +
                "     - Tersier: Lipatan globular 3D utuh stabil berkat jembatan disulfida (S-S), interaksi hidrofobik, dan ikatan ionik.\n" +
                "     - Kuaterner: Penggabungan multi-subunit polipeptida (contoh: 4 subunit tetramer Hemoglobin).\n\n" +
                "4. Asam Nukleat (Polinukleotida):\n" +
                "   • Monomer: Nukleotida, terdiri dari 3 komponen: Gula pentosa (Ribosa pada RNA / Deoksiribosa pada DNA), Gugus Fosfat, dan Basa Nitrogen (Purin: Adenin/Guanin; Pirimidin: Timin/Sitosin/Urasil).\n" +
                "   • Rantai polimer dihubungkan oleh Ikatan Fosfodiester antara atom karbon 3' gula dan karbon 5' fosfat nukleotida berikutnya.",
        intuitionPoints = listOf(
            "Mengapa minyak dan air tidak pernah menyatu? Karena air bersifat polar dan membentuk ikatan hidrogen kuat sesamanya, menolak molekul lipid asam lemak nonpolar yang tidak bermuatan (efek hidrofobik)!",
            "Denaturasi protein adalah rusaknya struktur tersier dan sekunder protein akibat panas tinggi atau pH ekstrem, menyebabkan enzim kehilangan fungsinya secara permanen.",
            "Setiap gram lemak melepaskan 9 kkal energi metabolik saat dioksidasi, lebih dari dua kali lipat energi karbohidrat atau protein (4 kkal/gram)."
        ),
        simId = "sim-biomolecules",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Nilai Kalori}",
                equation = "E = (4 \\times m_{\\text{karbo}}) + (4 \\times m_{\\text{protein}}) + (9 \\times m_{\\text{lemak}})",
                meaning = "Hukum Atwater: perhitungan kandungan kalori metabolisme zat gizi makanan.",
                units = "kkal (kilokalori)",
                applicationNote = "10 g karbohidrat, 5 g protein, dan 2 g lemak menghasilkan (40 + 20 + 18) = 78 kkal energi tubuh."
            ),
            FormulaCard(
                symbol = "pI",
                equation = "pI = \\frac{pK_{a1} + pK_{a2}}{2}",
                meaning = "Titik Isoelektrik asam amino (kondisi zwitterion muatan netto nol).",
                units = "nilai pH",
                applicationNote = "Pada pH isoelektrik (pI), kelarutan protein berada pada titik terendah sehingga mudah mengendap."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Karakterisasi Molekuler Kurkuminoid Rimpang Temulawak Menggunakan HPLC di Balittro Bogor",
            context = "Temulawak (*Curcuma xanthorrhiza*) adalah tanaman obat unggulan Indonesia yang kaya senyawa kurkuminoid sebagai hepatoprotektor pelindung fungsi organ hati.",
            engineeringProblem = "Mengisolasi dan mengukur kadar fraksi kurkumin murni dari campuran kompleks biomolekul rimpang untuk standarisasi bahan baku industri farmasi.",
            physicalConceptUsed = "Kromatografi Cair Kinerja Tinggi (High-Performance Liquid Chromatography / HPLC) fase terbalik berbasis perbedaan kepolaran gugus fungsi molekuler terhadap kolom silika C18.",
            mathematicalModel = "Kalibrasi kurva regresi linear luas area puncak kromatogram elusi isokratis mendeteksi konsentrasi kurkumin, demetoksikurkumin, dan bisdemetoksikurkumin hingga ketelitian part-per-million (ppm).",
            realWorldImpact = "Menghasilkan standar baku mutu fitofarmaka temulawak nasional berdaya saing global untuk ekspor ke industri suplemen Jerman dan Amerika Serikat.",
            relatedCareers = listOf("Biokimiawan Analitik", "Peneliti Fitokimia Farmasi", "Kimiawan Validasi Metode HPLC"),
            verifiedSource = "Balai Penelitian Tanaman Rempah dan Obat (Balittro) Kementerian Pertanian Bogor."
        ),
        homeLab = HomeLabData(
            title = "Uji Kualitatif Amilum (Iodin Betadine) & Koagulasi Protein Asam pada Bahan Dapur",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "Sampel makanan: nasi putih, potongan kentang, tahu putih, putih telur ayam, dan mentega/minyak",
                "Cairan antiseptik obat luka povidone iodine (Betadine - sebagai reagen amilum)",
                "Cuka dapur asam asetat pekat",
                "Piring plastik putih bersekat dan sendok kecil"
            ),
            steps = listOf(
                "Langkah 1: Letakkan sedikit sampel nasi, kentang, dan tahu di piring putih.",
                "Langkah 2: Teteskan 2–3 tetes cairan Betadine pada masing-masing sampel: nasi dan kentang seketika berubah warna menjadi biru kehitaman pekat (reaksi positif amilum karbohidrat), sedangkan tahu tidak berubah warna.",
                "Langkah 3: Ambil 2 sendok makan putih telur mentah di mangkuk terpisah.",
                "Langkah 4: Teteskan 1 sendok makan cuka dapur asam ke atas putih telur dan aduk perlahan.",
                "Langkah 5: Amati: cairan putih telur yang semula bening encer seketika menggumpal putih keruh memadat (Denaturasi & Koagulasi protein albumin oleh ion asam H⁺)!"
            ),
            observationGoal = "Menguji secara kimiawi keberadaan polisakarida amilum dan mengamati fenomena denaturasi lipatan struktur protein rantai peptida.",
            connectionToSimulation = "Bandingkan struktur ikatan peptida dan glikosidik pada visualisator biomolekul di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-biomol-1",
                prompt = "Ikatan kovalen yang terbentuk menghubungkan dua asam amino melalui reaksi kondensasi gugus karboksil dan gugus amino pada sintesis protein dinamakan...",
                type = "multiple_choice",
                options = listOf("Ikatan Peptida", "Ikatan Glikosidik", "Ikatan Fosfodiester", "Ikatan Ester"),
                correctAnswer = "Ikatan Peptida",
                hints = listOf(
                    "Rantai panjang asam amino disebut polipeptida.",
                    "Kata dasarnya adalah 'Peptida'."
                ),
                explanation = "Ikatan peptida adalah ikatan kovalen antara gugus alfa-karboksil (-COOH) dari satu asam amino dengan gugus alfa-amino (-NH₂) dari asam amino berikutnya, melepaskan satu molekul air (reaksi dehidrasi).",
                misconception = "Menyamakan dengan ikatan glikosidik (ikatan antar-molekul monosakarida gula)."
            ),
            QuizQuestion(
                id = "q-biomol-2",
                prompt = "Manakah dari kelompok biomolekul berikut yang memiliki sifat dasar amfipatik (memiliki bagian kepala yang hidrofilik suka air dan ekor yang hidrofobik menolak air) sehingga menjadi penyusun utama membran sel?",
                type = "multiple_choice",
                options = listOf("Fosfolipid", "Trigliserida", "Glikogen", "Asam Deoksiribonukleat (DNA)"),
                correctAnswer = "Fosfolipid",
                hints = listOf(
                    "Komponen utama membran sel 'fosfolipid bilayer'.",
                    "Memiliki kepala fosfat polar dan ekor dua asam lemak nonpolar."
                ),
                explanation = "Fosfolipid adalah molekul lipid amfipatik yang memiliki gugus fosfat polar hidrofilik di kepalanya dan dua ekor asam lemak nonpolar hidrofobik, membentuk lapisan ganda membran sel biologi.",
                misconception = "Menjawab trigliserida (trigliserida murni hidrofobik tanpa bagian kepala hidrofilik membran)."
            )
        )
    )

    // =========================================================================
    // 4. MODEL MEMBRAN SEL & MEKANISME TRANSPOR SELULER
    // =========================================================================
    private val transporMembranLesson = LessonData(
        conceptId = "bio-transpor-membran",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "ptm1",
                panelNumber = 1,
                title = "Lautan Lemak Bergerak: Model Mosaik Cair",
                caption = "Kirana memutar simulasi komputer 3D membran plasma sel eukariotik.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Singer dan Nicolson benar! Membran sel kita bukan benteng tembok kaku, melainkan 'lautan fosfolipid yang cair' di mana pulau-pulau protein integral dan glikoprotein mengapung bebas secara dinamis!",
                sceneVisualEmoji = "🌊",
                sceneDescription = "Dwilapis fosfolipid dengan protein transmembran saluran ion yang tertanam fleksibel."
            ),
            StoryPanel(
                id = "ptm2",
                panelNumber = 2,
                title = "Gerbang Selektif Permeabel",
                caption = "Kakek menjelaskan bagaimana sel memilih zat yang boleh melintas.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Gas O₂ dan CO₂ yang kecil nonpolar bisa berdifusi bebas menembus membran. Tapi ion bermuatan seperti Na⁺ dan glukosa besar memerlukan saluran protein difusi terfasilitasi atau kanal akuaporin untuk molekul air!",
                sceneVisualEmoji = "🚪",
                sceneDescription = "Molekul air mengalir cepat melewati pori protein kanal akuaporin membran."
            ),
            StoryPanel(
                id = "ptm3",
                panelNumber = 3,
                title = "Pompa Na+/K+ ATPase Melawan Arus",
                caption = "Dimas menghitung konsumsi energi seluler saraf.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Saat memompa ion melawan gradien konsentrasi pekat, sel membakar ATP! Pompa ion Na⁺/K⁺ membuang 3 Na⁺ keluar dan memasukkan 2 K⁺ ke dalam sel, menjaga potensial istirahat sel saraf kita!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Pompa protein menghidrolisis molekul ATP memindahkan ion natrium dan kalium."
            ),
            StoryPanel(
                id = "ptm4",
                panelNumber = 4,
                title = "Fagositosis: Sel yang Memangsa",
                caption = "Kirana melihat sel darah putih makrofag menelan kuman bakteri lewat endositosis.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Membran sel meliuk menjulurkan pseudopodia merangkul partikel kuman ke dalam vesikel! Ini Transpor Massal: Endositosis untuk menelan kuman dan Eksositosis untuk mensekresi hormon!",
                sceneVisualEmoji = "🛡️",
                sceneDescription = "Makrofag menelan bakteri patogen melalui lipatan membran seluler."
            )
        ),
        intuitionTitle = "Lalu Lintas Membran: Pengendali Keseimbangan Kimia Sel",
        intuitionBody = "Membran plasma adalah struktur selektif permeabel dinamis yang memisahkan sitoplasma internal sel dari lingkungan ekstraseluler serta mengatur homeostasis materi.\n\n" +
                "1. Model Mosaik Cair (Fluid Mosaic Model Singer & Nicolson 1972):\n" +
                "   • Dwilapis Fosfolipid: Matriks cair di mana molekul fosfolipid dapat berdifusi lateral secara kilat (~2 µm/detik).\n" +
                "   • Protein Membran: Protein Integral (menembus dwilapis transmembran) dan Protein Perifer (menempel longgar di permukaan luar/dalam).\n" +
                "   • Kolesterol: Penstabil fluiditas (mencegah membran membeku di suhu dingin dan mencegah membran terlalu encer di suhu panas).\n" +
                "   • Karbohidrat Membran: Glikolipid dan Glikoprotein di permukaan luar berfungsi sebagai reseptor pengenal sel (*cell-cell recognition*).\n\n" +
                "2. Mekanisme Transpor Membran:\n" +
                "   A. Transpor Pasif (Spontan tanpa konsumsi ATP, menuruni gradien konsentrasi tinggi → rendah):\n" +
                "      • Difusi Sederhana: Molekul kecil nonpolar larut lemak (O₂, CO₂, asam lemak) meluncur menembus fosfolipid.\n" +
                "      • Difusi Terfasilitasi: Molekul polar hidrofilik (glukosa, asam amino) melintas dibantu protein saluran (*channel*) atau protein pembawa (*carrier*).\n" +
                "      • Osmosis: Difusi pelarut air melintasi membran semipermeabel dari larutan hipotonik (konsentrasi zat terlarut rendah/air banyak) menuju hipertonik (pekat zat terlarut/air sedikit) melalui kanal protein Akuaporin.\n" +
                "   B. Efek Osmosis pada Sel:\n" +
                "      • Di larutan Hipotonik: Sel hewan membengkak lalu pecah lisis; sel tumbuhan mengembang turgid (sehat ditahan dinding sel).\n" +
                "      • Di larutan Hipertonik: Sel hewan berkerut mengkerut (Krenasi); sel tumbuhan mengalami Plasmolisis (sitoplasma mengecil lepas dari dinding).\n" +
                "   C. Transpor Aktif (Memerlukan hidrolisis energi ATP, memompa zat melawan gradien konsentrasi rendah → tinggi):\n" +
                "      • Pompa Ion Na⁺/K⁺ ATPase: Setiap 1 ATP dipecah, memompa 3 ion Na⁺ keluar sel dan 2 ion K⁺ masuk ke dalam sel.\n" +
                "      • Transpor Massal: Endositosis (Fagositosis makan partikel padat, Pinositosis minum cairan) dan Eksositosis (peleburan vesikel Golgi ke membran luar membuang sekresi enzim/hormon).",
        intuitionPoints = listOf(
            "Otak kita mengonsumsi hampir 20% dari seluruh energi ATP tubuh hanya untuk mengoperasikan pompa ion Na⁺/K⁺ di miliaran membran sel saraf!",
            "Peter Agre dianugerahi Nobel Kimia tahun 2003 atas penemuan Akuaporin, kanal protein membran yang memungkinkan 3 miliar molekul air lewat per detik dalam satu baris!",
            "Transpor aktif sekunder (kotranspor) memanfaatkan gradien ion Na⁺ hasil pompa primer untuk menarik molekul glukosa masuk ke dalam sel epitel usus."
        ),
        simId = "sim-membrane-transport",
        formulas = listOf(
            FormulaCard(
                symbol = "\\Pi",
                equation = "\\Pi = i \\cdot M \\cdot R \\cdot T",
                meaning = "Persamaan Tekanan Osmotik van 't Hoff larutan melintasi membran semipermeabel.",
                units = "atm atau Pa",
                applicationNote = "i adalah faktor van 't Hoff ionisasi zat terlarut, M konsentrasi molaritas, R tetapan gas 0,08206 L·atm/(mol·K)."
            ),
            FormulaCard(
                symbol = "J",
                equation = "J = -D \\frac{dC}{dx}",
                meaning = "Hukum Pertama Fick untuk laju fluks difusi materi melalui membran.",
                units = "mol/(m²·s)",
                applicationNote = "D adalah koefisien difusi zat terlarut, dC/dx adalah kecuraman gradien konsentrasi spasial."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Desalinisasi Air Laut Berbasis Membran Reverse Osmosis (SWRO) di Kawasan Ekonomi Khusus Mandalika Lombok",
            context = "Kawasan wisata Mandalika di Lombok Nusa Tenggara Barat memiliki keterbatasan pasokan air tawar alami, sementara kebutuhan air hotel dan sirkuit internasional sangat tinggi.",
            engineeringProblem = "Menyaring garam berkadar 35.000 ppm dari air laut menjadi air minum berstandar WHO (< 500 ppm) secara hemat energi.",
            physicalConceptUsed = "Osmosis Terbalik (Reverse Osmosis): memberikan tekanan hidrostatik tinggi buatan (60–70 bar) yang melampaui tekanan osmotik alami air laut (~27 bar) pada modul membran komposit poliamida berpori 0,1 nanometer.",
            mathematicalModel = "Mengalirkan air laut dengan pompa sentrifugal tekanan tinggi melintasi susunan membran spiral wound memisahkan 45% permeate air tawar murni dan 55% konsentrat brine pekat.",
            realWorldImpact = "Menghasilkan 3.000 meter kubik air tawar bersih per hari secara mandiri tanpa menyedot air tanah warga lokal di pesisir selatan Lombok.",
            relatedCareers = listOf("Insinyur Pengolahan Air Membran", "Spesialis Operasi Pembangkit SWRO", "Ahli Kimia Air Industri"),
            verifiedSource = "PT Indonesia Tourism Development Corporation (ITDC) & Perusahaan Air Bersih Mandalika."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Osmosis Membran Sel Alami: Uji Tekstur Potongan Kentang dalam Air Garam",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 buah kentang segar berukuran besar",
                "2 buah gelas bening bertanda Gelas A (Air Murni Tawar) dan Gelas B (Air Garam Pekat)",
                "2 sendok makan garam dapur dilarutkan ke Gelas B",
                "Pisau dapur, talenan, dan penggaris milimeter (dibantu orang dewasa)"
            ),
            steps = listOf(
                "Langkah 1: Potong 2 balok kentang dengan ukuran persis sama (misal: panjang 5,0 cm, lebar 1,0 cm, tebal 1,0 cm). Rasakan tekstur awalnya yang keras dan renyah.",
                "Langkah 2: Masukkan 1 balok kentang ke dalam Gelas A berisi air tawar biasa.",
                "Langkah 3: Masukkan 1 balok kentang lainnya ke dalam Gelas B berisi air garam pekat hipertonik.",
                "Langkah 4: Rendam kedua potongan kentang selama 60–90 menit.",
                "Langkah 5: Angkat dan ukur ulang: Kentang pada Gelas A bertambah panjang montok (~5,2 cm) dan sangat kaku turgid karena air masuk ke sel. Kentang pada Gelas B menyusut (~4,6 cm), menjadi lentur lembek seperti karet dan bisa ditekuk tanpa patah karena air keluar dari sel via osmosis!"
            ),
            observationGoal = "Menyaksikan perubahan fisik dimensi dan turgiditas jaringan sel tumbuhan akibat perpindahan air melintasi membran sel.",
            connectionToSimulation = "Bandingkan kelenturan kentangmu dengan simulasi turgor dan plasmolisis di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-transpor-1",
                prompt = "Jika sel darah merah (eritrosit) manusia dimasukkan ke dalam wadah berisi larutan air murni aquades (lingkungan hipotonik ekstrem), peristiwa apakah yang akan terjadi pada sel tersebut?",
                type = "multiple_choice",
                options = listOf(
                    "Sel membengkak dan akhirnya pecah (Hemolisis)",
                    "Sel berkerut mengering dan mengkerut (Krenasi)",
                    "Sel mengalami plasmolisis lepas dari dindingnya",
                    "Sel tidak mengalami perubahan apa pun"
                ),
                correctAnswer = "Sel membengkak dan akhirnya pecah (Hemolisis)",
                hints = listOf(
                    "Air murni akan berosmosis deras masuk ke dalam sel.",
                    "Sel hewan tidak memiliki dinding sel kaku penahan tekanan turgor."
                ),
                explanation = "Karena sel hewan tidak memiliki dinding sel pelindung, masuknya molekul air secara masif dari larutan hipotonik ke sitoplasma sel hipertonik akan menyebabkan membran sel meregang melampaui batas elastisitasnya hingga pecah (Hemolisis / Lisis).",
                misconception = "Menjawab plasmolisis (plasmolisis hanya terjadi pada sel tumbuhan berdinding di larutan hipertonik pekat)."
            ),
            QuizQuestion(
                id = "q-transpor-2",
                prompt = "Pada mekanisme pompa ion Na⁺/K⁺ ATPase dalam sel saraf manusia, untuk setiap 1 molekul energi ATP yang dihidrolisis, berapakah rasio jumlah ion yang dipompa melintasi membran?",
                type = "multiple_choice",
                options = listOf(
                    "3 ion Na⁺ dipompa ke luar dan 2 ion K⁺ dipompa ke dalam",
                    "2 ion Na⁺ dipompa ke luar dan 3 ion K⁺ dipompa ke dalam",
                    "3 ion Na⁺ dipompa ke dalam dan 3 ion K⁺ dipompa ke luar",
                    "1 ion Na⁺ dipompa ke luar dan 1 ion K⁺ dipompa ke dalam"
                ),
                correctAnswer = "3 ion Na⁺ dipompa ke luar dan 2 ion K⁺ dipompa ke dalam",
                hints = listOf(
                    "Lebih banyak ion natrium yang dibuang keluar sel.",
                    "Perbandingannya adalah 3 ion Na⁺ berbanding 2 ion K⁺."
                ),
                explanation = "Pompa natrium-kalium mengonsumsi 1 molekul ATP untuk memompa 3 ion Na⁺ keluar dari sel melawan gradien konsentrasi dan memasukkan 2 ion K⁺ ke dalam sel, mempertahankan muatan listrik negatif di dalam sel istirahat.",
                misconception = "Tertukar antara jumlah ion Na⁺ yang keluar dan K⁺ yang masuk."
            )
        )
    )

    // =========================================================================
    // 5. METABOLISME SELULER: ENZIM, RESPIRASI AEROB & FOTOSINTESIS
    // =========================================================================
    private val metabolismeEnzimLesson = LessonData(
        conceptId = "bio-metabolisme-enzim",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pme1",
                panelNumber = 1,
                title = "Katalisator Biologis Kehidupan: Enzim",
                caption = "Kirana mencampurkan hidrogen peroksida beracun dengan ekstrak enzim katalase.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Busa oksigen seketika menyembur deras! Tanpa enzim katalase, reaksi ini butuh waktu berhari-hari. Enzim mempercepat reaksi kimia jutaan kali lipat dengan menurunkan energi aktivasi!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Reaksi pemecahan H2O2 menjadi gelembung gas oksigen dan air murni oleh enzim katalase."
            ),
            StoryPanel(
                id = "pme2",
                panelNumber = 2,
                title = "Empat Babak Respirasi Aerob",
                caption = "Kakek menggambarkan rute pembakaran satu molekul glukosa di dalam sel.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Glikolisis di sitoplasma menghasilkan 2 piruvat, Dekarboksilasi Oksidatif menghasilkan 2 asetil-KoA, Siklus Krebs di mitokondria memanen NADH & FADH₂, lalu Rantai Transpor Elektron memompa proton menghasilkan ~30-32 ATP!",
                sceneVisualEmoji = "🔥",
                sceneDescription = "Perjalanan glukosa melintasi sitoplasma hingga matriks mitokondria seluler."
            ),
            StoryPanel(
                id = "pme3",
                panelNumber = 3,
                title = "ATP Sintase: Dinamo Molekuler Kemiosmosis",
                caption = "Dimas terkesima melihat animasi motor protein ATP sintase yang berputar cepat.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Gradien proton H⁺ yang terkumpul di ruang antarmembran meluncur deras melewati terowongan enzim ATP Sintase! Rotor protein ini berputar seperti turbin PLTA merakit ADP dan fosfat menjadi energi ATP!",
                sceneVisualEmoji = "⚙️",
                sceneDescription = "Rotor ATP sintase berputar digerakkan aliran proton menghasilkan puluhan molekul ATP."
            ),
            StoryPanel(
                id = "pme4",
                panelNumber = 4,
                title = "Adaptasi Fotosintesis: C3, C4, & CAM",
                caption = "Kirana membandingkan daun padi C3 dengan daun jagung C4 dan kaktus CAM.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Tumbuhan C4 seperti jagung memisahkan fiksasi CO₂ di sel seludang pembuluh untuk menghindari fotorespirasi yang boros! Dan kaktus CAM hanya membuka stomata di malam hari yang dingin agar air tidak terbuang sia-sia!",
                sceneVisualEmoji = "🌽",
                sceneDescription = "Anatomi daun Kranz pada jagung C4 memaksimalkan fotosintesis di udara terik tropis."
            )
        ),
        intuitionTitle = "Dapur Termodinamika Sel: Enzim & Transformasi Energi Kimia",
        intuitionBody = "Metabolisme mencakup keseluruhan reaksi biokimia terpadu di dalam sel, terbagi menjadi Katabolisme (pemecahan molekul kompleks melepaskan energi eksergonik) dan Anabolisme (penyusunan molekul kompleks membutuhkan input energi endergonik).\n\n" +
                "1. Enzim sebagai Biokatalisator Organik:\n" +
                "   • Menurunkan Energi Aktivasi (Eₐ) tanpa mengubah kesetimbangan termodinamika reaksi (ΔG tetap).\n" +
                "   • Model Sisi Aktif: Model *Induced-Fit* (Koshland) di mana sisi aktif enzim berubah bentuk fleksibel menyesuaikan bentuk substrat saat berikatan.\n" +
                "   • Inhibitor Enzim: Kompetitif (menyerupai substrat berebut sisi aktif, dapat diatasi dengan menambah konsentrasi substrat) vs Non-Kompetitif (mengikat sisi alosterik lain, merusak bentuk sisi aktif).\n\n" +
                "2. Katabolisme Karbohidrat: Respirasi Seluler Aerobik (Total ~30–32 ATP per glukosa):\n" +
                "   • Tahap 1: Glikolisis (Sitoplasma / Tanpa O₂): 1 Glukosa (6C) → 2 Asam Piruvat (3C) + 2 NADH + 2 ATP bersih.\n" +
                "   • Tahap 2: Dekarboksilasi Oksidatif (Matriks Mitokondria): 2 Piruvat → 2 Asetil-KoA (2C) + 2 CO₂ + 2 NADH.\n" +
                "   • Tahap 3: Siklus Asam Sitrat / Siklus Krebs (Matriks Mitokondria): 2 Asetil-KoA → 4 CO₂ + 6 NADH + 2 FADH₂ + 2 ATP.\n" +
                "   • Tahap 4: Fosforilasi Oksidatif Rantai Transpor Elektron & Kemiosmosis (Krista Membran Dalam Mitokondria): Elektron dari 10 NADH dan 2 FADH₂ ditransfer melintasi kompleks protein I, II, III, IV memompa gradien proton H⁺. Proton mengalir memutar rotor enzim ATP Sintase menghasilkan ~26–28 ATP. Akseptor elektron terakhir adalah O₂ membentuk H₂O.\n\n" +
                "3. Anabolisme Fotosintesis & Jalur Karbon C3, C4, CAM:\n" +
                "   • Reaksi Terang (Membran Tilakoid): Klorofil fotosistem II (P680) & I (P700) menyerap foton, fotolisis air (H₂O → 2H⁺ + 2e⁻ + ½ O₂), fotofosforilasi menghasilkan ATP dan NADPH.\n" +
                "   • Reaksi Gelap / Siklus Calvin (Stroma): Fiksasi gas CO₂ oleh enzim RuBisCO ke RuBP (5C) → Reduksi 3-PGA menjadi G3P dengan ATP dan NADPH → Regenerasi RuBP menghasilkan 1 Glukosa.\n" +
                "   • Tumbuhan C4 (Jagung, Tebu): Menggunakan anatomi daun Kranz; enzim PEP karboksilase mengikat CO₂ di sel mesofil membentuk asam oksaloasetat (4C) lalu disuplai ke sel seludang pembuluh tempat Siklus Calvin berlangsung bebas dari gangguan fotorespirasi oksigen.\n" +
                "   • Tumbuhan CAM (Kaktus, Nanas, Lidah Buaya): Membuka stomata hanya pada malam hari yang sejuk untuk menyimpan CO₂ dalam bentuk asam malat vakuola, lalu menutup stomata rapat di siang hari untuk fotosintesis hemat air.",
        intuitionPoints = listOf(
            "Fotorespirasi adalah inefisiensi biologis di mana enzim RuBisCO keliru mengikat O₂ alih-alih CO₂, membuang hingga 25% hasil energi tanaman pada hari terik kering.",
            "Tanpa oksigen sebagai pembersih elektron terakhir di rantai transpor mitokondria, seluruh rantai macet total sehingga sel manusia terpaksa beralih ke fermentasi asam laktat yang cepat melelahkan otot.",
            "Sianida adalah racun mematikan karena mengikat kuat kompleks IV (sitokrom c oksidase) pada membran mitokondria, menghentikan produksi ATP seluler dalam hitungan menit."
        ),
        simId = "sim-metabolism",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Respirasi Bersih}",
                equation = "C_6H_{12}O_6 + 6 O_2 \\to 6 CO_2 + 6 H_2O + 30\\text{--}32 \\text{ ATP}",
                meaning = "Persamaan stoikiometri reaksi katabolisme oksidasi glukosa lengkap.",
                units = "mol dan ATP",
                applicationNote = "Setiap 1 mol glukosa murni (180 gram) melepaskan energi bebas standar ΔG° = -2870 kJ/mol."
            ),
            FormulaCard(
                symbol = "v",
                equation = "v = \\frac{V_{\\max} [S]}{K_m + [S]}",
                meaning = "Persamaan Kinetika Enzim Michaelis-Menten.",
                units = "mol/(L·s)",
                applicationNote = "Km adalah konsentrasi substrat saat laju reaksi mencapai setengah nilai kecepatan maksimum (½ Vmax)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Optimasi Bioreaktor Fermentasi Bioetanol Generasi Kedua dari Bagas Tebu PG Jatitujuh Majalengka",
            context = "Industri gula di Indonesia menghasilkan jutaan ton limbah ampas tebu (bagas lignoselulosa) yang belum termanfaatkan optimal sebagai energi terbarukan ramah lingkungan.",
            engineeringProblem = "Lignoselulosa sangat sukar dipecah oleh ragi biasa karena serat selulosa terlindungi lapisan lignin yang kokoh dan senyawa inhibitor furfural.",
            physicalConceptUsed = "Aplikasi biokimia enzimatis terpadu: perlakuan awal steam explosion, hidrolisis selulosa menggunakan enzim selulase rekombinan *Trichoderma reesei*, dilanjutkan fermentasi anaerob glukosa-xilosa secara simultan (Simultaneous Saccharification and Fermentation / SSF).",
            mathematicalModel = "Pengendalian kinetika bioreaktor pada suhu 38°C dan pH 4,8 memaksimalkan rendemen konversi glukosa menjadi etanol hingga 88% dari nilai teoritis stoichiometri Gay-Lussac.",
            realWorldImpact = "Menghasilkan bioetanol anhidrat fuel-grade (kemurnian 99,5%) sebagai campuran bahan bakar bensin ramah lingkungan E5/E10 pengganti BBM fosil impor.",
            relatedCareers = listOf("Insinyur Bioenergi Hayati", "Biokimiawan Fermentasi Industri", "Spesialis Hilirisasi Agromaterial"),
            verifiedSource = "Pusat Riset Kimia Maju BRIN & Pabrik Gula Jatitujuh PT PG Rajawali II."
        ),
        homeLab = HomeLabData(
            title = "Menguji Aktivitas Enzim Katalase Ekstrak Hati Ayam / Parutan Kentang Memecah H₂O₂",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "Larutan Hidrogen Peroksida 3% (H₂O₂ - banyak dijual di apotek untuk antiseptik luka)",
                "Sedikit hati ayam segar (atau parutan umbi kentang segar yang kaya enzim katalase)",
                "3 buah tabung reaksi atau gelas kaca kecil bening",
                "Air mendidih dan air perasan jeruk nipis (asam sitrat)",
                "Lidi dupa/tusuk sate dan korek api"
            ),
            steps = listOf(
                "Langkah 1: Haluskan hati ayam segar dengan sedikit air untuk membuat ekstrak enzim katalase aktif.",
                "Langkah 2: Siapkan 3 gelas: Gelas 1 (Ekstrak normal suhu ruang), Gelas 2 (Ekstrak yang direndam air mendidih 5 menit), Gelas 3 (Ekstrak ditambah perasan jeruk nipis masam).",
                "Langkah 3: Tuangkan 1 sendok teh cairan H₂O₂ 3% ke dalam Gelas 1: seketika terbentuk semburan busa gelembung putih yang meluap tinggi!",
                "Langkah 4: Dekatkan bara api lidi dupa ke atas mulut busa Gelas 1: bara seketika menyala terang berkobar membuktikan gelembung tersebut adalah gas oksigen murni (O₂)!",
                "Langkah 5: Tuangkan H₂O₂ ke Gelas 2 (dipanaskan) dan Gelas 3 (diasamkan): tidak timbul busa sama sekali karena enzim katalase telah mengalami Denaturasi rusak permanen!"
            ),
            observationGoal = "Membuktikan kerja enzim katalase memecah racun metabolik H₂O₂ serta mengamati pengaruh suhu ekstrem dan pH asam terhadap denaturasi enzim.",
            connectionToSimulation = "Bandingkan produksi gelembungmu dengan grafik kinetika enzim pada simulator di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-enzim-1",
                prompt = "Pada respirasi seluler aerobik, tahapan yang menghasilkan jumlah molekul ATP paling banyak melalui gradien proton kemiosmosis yang menggerakkan enzim ATP Sintase adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Fosforilasi Oksidatif Rantai Transpor Elektron",
                    "Glikolisis",
                    "Dekarboksilasi Oksidatif",
                    "Siklus Asam Sitrat (Siklus Krebs)"
                ),
                correctAnswer = "Fosforilasi Oksidatif Rantai Transpor Elektron",
                hints = listOf(
                    "Tahap terakhir yang berlangsung di krista membran dalam mitokondria.",
                    "Memanfaatkan elektron dari NADH dan FADH₂."
                ),
                explanation = "Rantai Transpor Elektron dan fosforilasi oksidatif kemiosmosis menghasilkan sekitar 26 hingga 28 molekul ATP dari total 30-32 ATP yang diproduksi pada pemecahan satu molekul glukosa secara aerob.",
                misconception = "Menjawab Siklus Krebs (Siklus Krebs hanya menghasilkan 2 ATP langsung via fosforilasi tingkat substrat)."
            ),
            QuizQuestion(
                id = "q-enzim-2",
                prompt = "Tumbuhan C4 seperti jagung dan tebu lebih efisien berfotosintesis di daerah tropis beriklim panas dibandingkan tumbuhan C3 karena tumbuhan C4...",
                type = "multiple_choice",
                options = listOf(
                    "Memisahkan penangkapan CO₂ di sel mesofil dan Siklus Calvin di sel seludang pembuluh untuk mencegah fotorespirasi",
                    "Tidak memerlukan air sama sekali untuk reaksi terang fotolisis",
                    "Hanya berfotosintesis pada malam hari",
                    "Tidak memiliki kloroplas pada daunnya"
                ),
                correctAnswer = "Memisahkan penangkapan CO₂ di sel mesofil dan Siklus Calvin di sel seludang pembuluh untuk mencegah fotorespirasi",
                hints = listOf(
                    "Memiliki susunan anatomi daun tipe Kranz.",
                    "Enzim PEP karboksilase mengikat CO₂ bebas tanpa terganggu oksigen."
                ),
                explanation = "Tumbuhan C4 menggunakan adaptasi anatomi Kranz yang memisahkan fiksasi CO₂ awal di sel mesofil oleh enzim PEP karboksilase dari Siklus Calvin di sel seludang pembuluh, meminimalkan fotorespirasi yang merugikan di suhu panas.",
                misconception = "Menyamakan tumbuhan C4 dengan tumbuhan CAM yang fotosintesisnya dipisahkan secara waktu (malam vs siang)."
            )
        )
    )

    // =========================================================================
    // 6. PEMBELAHAN SEL: MITOSIS, MEIOSIS & GAMETOGENESIS
    // =========================================================================
    private val pembelahanSelLesson = LessonData(
        conceptId = "bio-pembelahan-sel",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pps1",
                panelNumber = 1,
                title = "Regenerasi Kulit yang Terluka",
                caption = "Lutut Dimas yang lecet sehabis terjatuh dari sepeda kini telah mulus kembali tertutup lapisan kulit baru.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Luar biasa bagaimana kulitku bisa sembuh sempurna! Jutaan sel kulit membelah diri menggantikan sel-sel yang rusak dengan sel baru yang identik!",
                sceneVisualEmoji = "🩹",
                sceneDescription = "Luka pada lapisan epidermis kulit pulih rapat berkat pembelahan mitosis sel basal."
            ),
            StoryPanel(
                id = "pps2",
                panelNumber = 2,
                title = "Siklus Sel & Mitosis Sel Somatis",
                caption = "Kakek memperlihatkan diagram siklus sel interfase (G1, S, G2) dan fase M.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sebelum membelah, sel menggandakan benang DNA-nya di fase S. Pada Mitosis (Profase, Metafase, Anafase, Telofase), satu sel diploid (2n) membelah menjadi dua sel anak identik diploid (2n)!",
                sceneVisualEmoji = "🔄",
                sceneDescription = "Siklus sel berputar dari interfase penggandaan DNA menuju fase mitosis."
            ),
            StoryPanel(
                id = "pps3",
                panelNumber = 3,
                title = "Meiosis: Keajaiban Pindah Silang Kiasma",
                caption = "Kirana membedah tahap profase I meiosis pembentukan sel kelamin.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Di Meiosis I terjadi Sinapsis tetrad! Lengan kromosom homolog saling bertukar segmen pada Kiasma (Pindah Silang / Crossing Over)! Inilah yang membuat setiap anak memiliki variasi genetik unik berbeda dari saudaranya!",
                sceneVisualEmoji = "🔀",
                sceneDescription = "Kromosom homolog saling melilit bertukar fragmen genetik pada peristiwa kiasma."
            ),
            StoryPanel(
                id = "pps4",
                panelNumber = 4,
                title = "Pabrik Sel Kelamin: Gametogenesis",
                caption = "Dimas membandingkan pembentukan sperma dan sel telur.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Spermatogenesis menghasilkan 4 sel sperma haploid motil, sedangkan Oogenesis hanya menghasilkan 1 ovum matang kaya sitoplasma dan 3 badan kutub (polosit) degeneratif!",
                sceneVisualEmoji = "🥚",
                sceneDescription = "Satu sel ovum matang berukuran besar dikelilingi oleh badan kutub kecil."
            )
        ),
        intuitionTitle = "Dinamika Sitogenetika: Penggandaan Sel & Rekombinasi Genom Meiosis",
        intuitionBody = "Pembelahan sel menjamin pertumbuhan organisme multiseluler, perbaikan jaringan tubuh yang rusak, serta pewarisan informasi genetik berkesinambungan melalui sel gamet.\n\n" +
                "1. Siklus Sel Eukariotik:\n" +
                "   • Interfase (90% waktu hidup sel):\n" +
                "     - Fase G₁ (Gap 1): Pertumbuhan ukuran sel, sintesis protein, dan duplikasi organel sitoplasma.\n" +
                "     - Fase S (Sintesis): Replikasi dan penggandaan heliks DNA kromatin (materi genetik mengganda dari 2c menjadi 4c).\n" +
                "     - Fase G₂ (Gap 2): Pembentukan protein benang spindel (tubulin) dan persiapan akhir pembelahan.\n" +
                "     - Checkpoint Kontrol: Titik periksa G₁/S, G₂/M, dan Metafase Spindel yang dikendalikan oleh kompleks protein Siklin dan Cdk (Cyclin-Dependent Kinase) untuk mencegah proliferasi tumor/kanker.\n\n" +
                "2. Mitosis (Pembelahan Sel Tubuh Somatis / 2n → 2n Identik):\n" +
                "   • Profase: Kromatin memadat jadi kromosom berpasangan kromatid saudara, nukleolus dan membran inti larut, sentrosom bergerak ke kutub membentuk gelendong spindel.\n" +
                "   • Metafase: Pasangan kromatid berjajar lurus rapi di bidang ekuator (pelat metafase).\n" +
                "   • Anafase: Kinetokor memisah, kromatid saudara ditarik memisah oleh benang spindel menuju ke dua kutub berlawanan.\n" +
                "   • Telofase: Membran inti dan nukleolus terbentuk kembali di kedua kutub, kromosom mengurai menjadi benang kromatin kembali.\n" +
                "   • Sitokinesis: Pembelahan sitoplasma (cincin kontraktil mikrofilamen aktin pada sel hewan; pembentukan pelat dinding sel dari vesikel Golgi pada sel tumbuhan).\n\n" +
                "3. Meiosis (Pembelahan Reduksi Sel Gamet Kelamin / 2n → n Beragam):\n" +
                "   • Meiosis I (Pemisahan Kromosom Homolog):\n" +
                "     - Profase I (terpanjang): Leptoten → Zigoten (sinapsis kromosom homolog) → Pakiten (pembentukan tetrad) → Diploten (terjadi Pindah Silang / Crossing Over di titik Kiasma bertukar fragmen genetik) → Diakinesis.\n" +
                "     - Metafase I, Anafase I (kromosom homolog memisah ke kutub, reduksi ploiditas dari 2n menjadi n), Telofase I.\n" +
                "   • Meiosis II (Pemisahan Kromatid Saudara serupa mitosis): Menghasilkan 4 sel anak haploid (n) dengan kombinasi genetik yang berbeda-beda.",
        intuitionPoints = listOf(
            "Pindah Silang (Crossing Over) pada profase I meiosis bersama dengan asortasi bebas kromosom menghasilkan miliaran kemungkinan kombinasi unik sperma dan ovum (itulah sebabnya tidak ada dua anak kandung yang 100% identik kecuali kembar monozigot).",
            "Nondisjunction (gagal berpisah) kromosom saat anafase I atau II meiosis menyebabkan mutasi aneuploidi pada janin (contoh: trisomi 21 sindrom Down).",
            "Sel kanker adalah sel tubuh yang kehilangan fungsi pos pemeriksaan (checkpoint) siklus sel akibat mutasi gen penekan tumor p53 sehingga membelah tak terkendali."
        ),
        simId = "sim-cell-division",
        formulas = listOf(
            FormulaCard(
                symbol = "IM",
                equation = "IM = \\frac{\\sum N_{\\text{mitosis}}}{N_{\\text{total}}} \\times 100\\%",
                meaning = "Indeks Mitosis (Mitotic Index) fraksi sel yang sedang aktif membelah dalam suatu jaringan.",
                units = "%",
                applicationNote = "Jaringan meristem ujung akar memiliki IM > 20%, sedangkan jaringan tumor ganas memiliki IM yang melonjak abnormal tinggi."
            ),
            FormulaCard(
                symbol = "K_{\\text{kombinasi}}",
                equation = "K = 2^n \\quad (n = 23 \\text{ pada manusia})",
                meaning = "Jumlah kemungkinan variasi kombinasi kromosom gamet akibat pemilahan bebas meiosis.",
                units = "ragam kombinasi gamet",
                applicationNote = "2²³ ≈ 8,4 juta variasi sperma bertemu 8,4 juta variasi ovum = > 70 triliun variasi zigot tanpa menghitung pindah silang!"
            )
        ),
        caseStudy = CaseStudyData(
            title = "Analisis Sitogenetika Kariotipe Diagnosis Trisomi 21 (Sindrom Down) di RSCM FKUI Jakarta",
            context = "Ibu hamil usia di atas 35 tahun memiliki risiko tinggi mengalami nondisjunction meiosis yang menghasilkan bayi dengan kelainan aberasi jumlah kromosom.",
            engineeringProblem = "Mendeteksi secara pasti kelainan trisomi kromosom 21 dari sel janin cairan amnion (amniosentesis) sebelum persalinan.",
            physicalConceptUsed = "Sitogenetika klinis: kultur limfosit janin dihentikan pada fase metafase menggunakan zat kolkisin (penghambat benang spindel), dilanjutkan pengecatan pita G (G-banding) di bawah mikroskop perbesaran 1000×.",
            mathematicalModel = "Analisis pencitraan komputer digital menyusun peta kariotipe 23 pasang kromosom untuk mendeteksi keberadaan kromosom ke-47 (tiga salinan kromosom 21 / 47,XX,+21 atau 47,XY,+21).",
            realWorldImpact = "Memberikan diagnosis definitif akurat 99,9% bagi orang tua untuk kesiapan medis penanganan komplikasi jantung bawaan sejak dini pasca-kelahiran bayi.",
            relatedCareers = listOf("Sitogenetikawan Medis", "Konselor Genetik Klinis", "Dokter Spesialis Patologi Anatomik"),
            verifiedSource = "Laboratorium Sitogenetika Terpadu FKUI & RSUPN Dr. Cipto Mangunkusumo Jakarta."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Zona Pembelahan Sel Meristem Ujung Akar Bawang Merah",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 siung bawang merah yang ditumbuhkan akarnya di atas mulut botol berisi air selama 3 hari",
                "Kaca pembesar berkekuatan tinggi (atau mikroskop saku portabel / lensa makro smartphone)",
                "Pewarna metilen biru atau Betadine povidone iodine",
                "Silet tajam dan sendok kaca (dibantu orang dewasa)",
                "Kertas tisu dan air bersih"
            ),
            steps = listOf(
                "Langkah 1: Potong 2–3 mm ujung akar bawang merah yang masih berwarna putih segar (zona tudung akar dan meristem apikal aktif).",
                "Langkah 2: Letakkan potongan ujung akar di atas sendok, tetesi 1 tetes cuka hangat selama 2 menit untuk melunakkan dinding pektin.",
                "Langkah 3: Teteskan 1 tetes pewarna metilen biru/Betadine di atas jaringan akar selama 3 menit agar benang kromosom menyerap zat warna.",
                "Langkah 4: Tutup dengan plastik bening transparan, lalu tekan perlahan dengan jempol (metode squash/gencet) agar sel-sel meristem menyebar merata satu lapis.",
                "Langkah 5: Amati di bawah lensa perbesaran makro: cari sel-sel yang memperlihatkan gumpalan benang kromosom gelap di tengah (metafase) atau yang terbelah dua ke kutub (anafase)!"
            ),
            observationGoal = "Mengamati fase-fase pembelahan mitosis pada jaringan meristematik tumbuhan yang aktif membelah.",
            connectionToSimulation = "Bandingkan sel akar gencetanmu dengan diagram tahapan mitosis interaktif di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-belah-1",
                prompt = "Pada tahapan manakah kromatid saudara ditarik saling memisah oleh mikrotubulus benang spindel menuju ke dua kutub sel yang berlawanan pada pembelahan mitosis?",
                type = "multiple_choice",
                options = listOf("Anafase", "Metafase", "Profase", "Telofase"),
                correctAnswer = "Anafase",
                hints = listOf(
                    "Tahap ketiga dari pembelahan mitosis.",
                    "Kata dasarnya diawali dengan 'Ana-' (bergerak ke kutub)."
                ),
                explanation = "Anafase ditandai dengan pemisahan sentromer kinetokor sehingga kromatid saudara ditarik oleh depolimerisasi benang spindel menuju ke kutub sel yang berseberangan.",
                misconception = "Menyamakan dengan metafase (metafase adalah saat kromatid berjajar di bidang ekuator tengah)."
            ),
            QuizQuestion(
                id = "q-belah-2",
                prompt = "Peristiwa pertukaran fragmen genetik antara kromatid bukan saudara dari pasangan kromosom homolog yang menghasilkan variasi rekombinasi pada meiosis disebut...",
                type = "multiple_choice",
                options = listOf(
                    "Pindah Silang (Crossing Over) di titik Kiasma",
                    "Sitokinesis",
                    "Interkinesis",
                    "Gagal Berpisah (Nondisjunction)"
                ),
                correctAnswer = "Pindah Silang (Crossing Over) di titik Kiasma",
                hints = listOf(
                    "Terjadi pada fase profase I meiosis.",
                    "Menghasilkan kromatid rekombinan baru."
                ),
                explanation = "Pindah silang (crossing over) terjadi pada tahap profase I meiosis ketika kromatid non-saudara dari kromosom homolog saling bertukar segmen DNA di titik pertautan kiasma, menghasilkan kombinasi genetik baru.",
                misconception = "Mengira pindah silang terjadi pada mitosis."
            )
        )
    )

    // =========================================================================
    // 7. HUKUM MENDEL, PAUTAN SEKS & MUTASI GENETIK
    // =========================================================================
    private val genetikaMendelLesson = LessonData(
        conceptId = "bio-genetika-mendel",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pgm1",
                panelNumber = 1,
                title = "Teka-Teki Warna Rambut & Mata",
                caption = "Di ruang keluarga, Kirana menatap cermin sambil membandingkan fotonya dengan foto masa kecil Ayah dan Ibu.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kakek, mataku cokelat terang persis seperti mata Ibu, tapi rambutku ikal bergelombang seperti rambut Ayah! Bagaimana sifat-sifat ini bisa diwariskan?",
                sceneVisualEmoji = "👀",
                sceneDescription = "Kirana membandingkan foto keluarga dan sifat fisik tampak yang mirip kedua orang tuanya."
            ),
            StoryPanel(
                id = "pgm2",
                panelNumber = 2,
                title = "Kebun Biara Gregor Mendel",
                caption = "Kakek menceritakan kisah bersejarah biarawan Gregor Mendel di Austria tahun 1865.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Mendel menyilangkan ribuan tanaman kacang kapri berbunga ungu dan putih. Dia menemukan bahwa sifat tidak melebur jadi ungu pudar, melainkan diturunkan lewat 'faktor penentu' yang tidak tampak!",
                sceneVisualEmoji = "🌸",
                sceneDescription = "Kacang kapri berbunga ungu disilangkan dengan bunga putih menghasilkan keturunan generasi F1."
            ),
            StoryPanel(
                id = "pgm3",
                panelNumber = 3,
                title = "Alel Dominan, Resesif, & Pautan Seks",
                caption = "Dimas menuliskan bagan pewarisan penyakit buta warna terpaut kromosom X.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Gen tertaut kromosom X seperti buta warna dan hemofilia diwariskan secara bersilang: ibu carrier (XCXc) dapat mewariskan buta warna langsung kepada anak laki-lakinya (XcY)!",
                sceneVisualEmoji = "🧬",
                sceneDescription = "Peta silsilah pedigree pautan kromosom seks memperlihatkan pewarisan bersilang."
            ),
            StoryPanel(
                id = "pgm4",
                panelNumber = 4,
                title = "Kotak Punnett Dihibrid & Mutasi Gen",
                caption = "Kirana menggambar kotak catur persilangan dua sifat beda 4x4.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Persilangan dihibrid heterozigot (BbKk × BbKk) menghasilkan rasio klasik 9:3:3:1! Dan jika terjadi mutasi gen titik, kode asam amino bisa berubah menghasilkan variasi alel baru!",
                sceneVisualEmoji = "🎯",
                sceneDescription = "Diagram kotak Punnett 16 kotak memperlihatkan kombinasi dihibrid Mendel."
            )
        ),
        intuitionTitle = "Hukum Pewarisan Sifat Mendel: Dari Dihibrid hingga Pautan Kromosom",
        intuitionBody = "Genetika modern bertumpu pada hukum-hukum transmisi partikulat Mendel yang diperkaya dengan penemuan pautan gen, pautan seks, serta mutasi genom.\n\n" +
                "1. Hukum Mendel I & II:\n" +
                "   • Hukum I Mendel (Segregasi Bebas): Dua alel untuk suatu sifat berpisah saat pembentukan gamet meiosis (Aa membentuk gamet A dan a). Rasio fenotipe F₂ monohibrid = 3 Dominan : 1 Resesif.\n" +
                "   • Hukum II Mendel (Asortasi Bebas): Pasangan alel dari gen yang berbeda memilah secara independen (berlaku untuk gen pada kromosom berbeda). Persilangan Dihibrid BbKk × BbKk menghasilkan rasio fenotipe F₂ = 9 : 3 : 3 : 1.\n\n" +
                "2. Penyimpangan Semu Hukum Mendel:\n" +
                "   Modifikasi rasio 9:3:3:1 akibat interaksi antar-gen:\n" +
                "   • Epistasis & Hipostasis: Gen yang menutupi ekspresi gen lain non-alel. Epistasis Dominan (rasio 12 : 3 : 1); Epistasis Resesif (rasio 9 : 3 : 4 pada warna bulu anjing).\n" +
                "   • Kriptomeri: Gen dominan tersembunyi yang baru terekspresi jika bertemu gen dominan lainnya (rasio 9 : 3 : 4 pada bunga *Linaria maroccana*).\n" +
                "   • Komplementer: Dua gen saling melengkapi; ketiadaan salah satu gen membuat sifat tidak muncul (rasio 9 : 7).\n" +
                "   • Polimeri: Sifat kumulatif kuantitatif mirip poligenik (rasio 15 : 1).\n\n" +
                "3. Pautan Gen & Pautan Seks (Sex-Linkage):\n" +
                "   • Pautan Gen: Dua gen berada pada kromosom yang sama sehingga cenderung diwariskan bersama-sama kecuali terjadi pindah silang (Nilai Pindah Silang / NPS).\n" +
                "   • Pautan Kromosom X: Penyakit resesif terpaut X (Buta Warna Merah-Hijau dan Hemofilia). Laki-laki hemizigot (XᶜY) selalu menderita sakit karena hanya punya satu kromosom X; wanita (XᶜXᶜ) sakit, sedangkan (XᶜX) normal pembawa sifat (*carrier*).\n\n" +
                "4. Mutasi: Sumber Utama Variasi Genetik:\n" +
                "   • Mutasi Gen (Point Mutation): Substitusi basa (transisi/transversi) menghasilkan *silent mutation*, *missense mutation* (contoh: substitusi Valin pada hemoglobin anemia sel sabit), atau *nonsense mutation* (kodon stop prematur); serta Insersi/Delesi penyebab *frameshift mutation*.\n" +
                "   • Mutasi Kromosom (Aberasi): Perubahan struktur (delesi, duplikasi, inversi, translokasi Robertson) atau perubahan jumlah genom (Aneuploidi: monosomi 2n-1 sindrom Turner 45,X0; trisomi 2n+1 sindrom Down 47,XX/XY,+21, sindrom Klinefelter 47,XXY).",
        intuitionPoints = listOf(
            "Seorang ayah penderita hemofilia TIDAK PERNAH mewariskan hemofilia kepada anak laki-lakinya karena ayah memberikan kromosom Y kepada anak laki-lakinya, bukan kromosom X!",
            "Nilai Pindah Silang (NPS) digunakan oleh ahli genetika untuk memetakan jarak fisik antar-lokus gen pada untai kromosom (1% NPS = 1 centiMorgan / cM).",
            "Anemia Sel Sabit (Sickle Cell Anemia) dipicu hanya oleh penggantian SATU nukleotida tunggal (adenin menjadi timin) pada kodon keenam gen beta-globin rantai hemoglobin."
        ),
        simId = "sim-genetics-advanced",
        formulas = listOf(
            FormulaCard(
                symbol = "NPS",
                equation = "NPS = \\frac{\\sum \\text{Rekombinan}}{\\sum \\text{Total Keturunan}} \\times 100\\%",
                meaning = "Nilai Pindah Silang (Frekuensi Rekombinasi genetik antar-lokus tertaut).",
                units = "% (atau centiMorgan / cM)",
                applicationNote = "NPS < 50% membuktikan terjadinya pautan antar dua gen pada kromosom yang sama."
            ),
            FormulaCard(
                symbol = "\\text{Rasio Dihibrid}",
                equation = "\\text{Fenotipe } F_2 = 9 : 3 : 3 : 1",
                meaning = "Rasio fenotipe klasik keturunan persilangan dihibrid Mendel induk heterozigot (AaBb × AaBb).",
                units = "Peluang fraksi per 16 bagian",
                applicationNote = "9/16 kedua sifat dominan (A_B_), 3/16 (A_bb), 3/16 (aaB_), dan 1/16 kedua sifat resesif (aabb)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Analisis Silsilah Pedigree Kasus Hemofilia A di RSUPN Dr. Cipto Mangunkusumo Jakarta",
            context = "Hemofilia A adalah kelainan pembekuan darah akibat defisiensi Faktor VIII yang diturunkan terpaut kromosom X, di mana pendarahan luka kecil dapat berakibat fatal.",
            engineeringProblem = "Menentukan risiko probabilitas genetik kelahiran anak laki-laki penderita hemofilia dari seorang wanita yang saudara kandung laki-lakinya meninggal karena hemofilia.",
            physicalConceptUsed = "Konstruksi pohon silsilah keluarga (pedigree) 4 generasi, probabilitas kondisional Bayes, dan konfirmasi PCR mutasi inversi intron 22 gen F8.",
            mathematicalModel = "Menghitung peluang ibu adalah carrier (peluang 50%), sehingga peluang melahirkan anak laki-laki penderita hemofilia adalah ½ × ½ = ¼ (25%).",
            realWorldImpact = "Memberikan rekomendasi medis terapi profilaksis konsentrat Faktor VIII rekombinan sejak dini dan perencanaan kehamilan terpadu bagi keluarga pasien.",
            relatedCareers = listOf("Genetikawan Medis", "Dokter Hematologi-Onkologi Anak", "Konselor Genetik"),
            verifiedSource = "Himpunan Masyarakat Hemofilia Indonesia (HMHI) & Divisi Hematologi Anak FKUI/RSCM."
        ),
        homeLab = HomeLabData(
            title = "Pemeriksaan Sifat Fenotipe Buta Warna Menggunakan Kartu Uji Ishihara Sederhana",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Tabel/gambar pelat uji tes buta warna Ishihara digital (banyak tersedia resmi di situs kemenkes/optometri)",
                "Pencahayaan ruangan yang terang alami (sinar matahari siang)",
                "Anggota keluarga (Ayah, Ibu, Saudara kandung)",
                "Lembar tabel pencatatan data"
            ),
            steps = listOf(
                "Langkah 1: Tampilkan pelat lingkaran bintik-bintik warna Ishihara yang memuat angka tersembunyi dengan jarak baca 75 cm.",
                "Langkah 2: Minta setiap anggota keluarga membaca angka yang terlihat dalam waktu maksimal 3 detik per pelat.",
                "Langkah 3: Catat angka yang terbaca: orang berpenglihatan trikromat normal membaca angka dengan jelas, sedangkan penderita buta warna parsial merah-hijau (protanopia/deuteranopia) akan melihat angka yang berbeda atau tidak melihat angka sama sekali.",
                "Langkah 4: Buat pohon silsilah keluarga sederhana yang memetakan jenis kelamin dan status penglihatan warna masing-masing.",
                "Langkah 5: Analisis pola pewarisannya: buktikan apakah sifat buta warna lebih sering muncul pada pria dibandingkan wanita!"
            ),
            observationGoal = "Mengidentifikasi pola pewarisan sifat resesif terpaut kromosom X pada populasi keluarga.",
            connectionToSimulation = "Bandingkan pohon keluargamu dengan simulator silsilah pedigree di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mendel-adv-1",
                prompt = "Seorang wanita normal pembawa sifat (carrier) buta warna (XᶜX) menikah dengan seorang pria dengan penglihatan normal (XY). Berapakah persentase kemungkinan anak laki-laki mereka menderita buta warna?",
                type = "numeric",
                correctAnswer = "50",
                tolerance = 1f,
                unit = "%",
                hints = listOf(
                    "Fokuslah hanya pada keturunan anak laki-laki (XY).",
                    "Anak laki-laki mewarisi kromosom Y dari ayah dan kromosom X dari ibu.",
                    "Ibu memiliki alel X (normal) dan Xᶜ (buta warna) dengan peluang masing-masing 50%."
                ),
                explanation = "Anak laki-laki pasti menerima kromosom Y dari ayah dan menerima salah satu dari dua kromosom X dari ibu (X atau Xᶜ). Karena ibu heterozigot, peluang anak laki-laki menerima kromosom Xᶜ (menjadi XᶜY / buta warna) adalah 1 dari 2 kemungkinan = 50%.",
                misconception = "Menghitung terhadap total seluruh anak (25%) alih-alih khusus di antara anak laki-laki (50%)."
            ),
            QuizQuestion(
                id = "q-mendel-adv-2",
                prompt = "Penyimpangan semu Hukum Mendel di mana gen dominan menutupi pengaruh gen lain yang bukan alelnya dinamakan peristiwa...",
                type = "multiple_choice",
                options = listOf("Epistasis", "Kriptomeri", "Komplementer", "Pautan Gen"),
                correctAnswer = "Epistasis",
                hints = listOf(
                    "Gen yang menutupi disebut epistatis, yang tertutupi disebut hipostatis.",
                    "Contoh klasiknya menghasilkan rasio 12 : 3 : 1."
                ),
                explanation = "Epistasis adalah interaksi genetik di mana satu gen menutupi (mengalahkan) ekspresi gen lain yang menempati lokus berbeda (non-alel). Gen yang menutupi disebut epistatis.",
                misconception = "Menyamakan dengan dominan biasa (dominan menutupi alel pasangannya sendiri pada lokus yang sama)."
            )
        )
    )

    // =========================================================================
    // 8. SINTESIS PROTEIN, REPLIKASI DNA & DOGMA SENTRAL
    // =========================================================================
    private val sintesisProteinLesson = LessonData(
        conceptId = "bio-sintesis-protein",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "psp1",
                panelNumber = 1,
                title = "Membuka Untai Heliks Ganda DNA",
                caption = "Dimas mengamati replikasi semikonservatif DNA di mana untai induk memisah menjadi dua cetakan baru.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Enzim helikase membuka ritsleting heliks DNA! DNA polimerase membaca untai cetakan 3' ke 5' dan merangkai untai baru 5' ke 3' tanpa kesalahan!",
                sceneVisualEmoji = "🧬",
                sceneDescription = "Garpu replikasi DNA terbuka memperlihatkan sintesis leading dan lagging strand."
            ),
            StoryPanel(
                id = "psp2",
                panelNumber = 2,
                title = "Fragmen Okazaki pada Untai Lambat",
                caption = "Kakek menjelaskan arah sintesis yang berlawanan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Karena DNA polimerase hanya bisa bekerja searah 5' ke 3', untai lagging disintesis terputus-putus berupa Fragmen Okazaki! Enzim DNA Ligase bertindak sebagai lem molekuler yang merekatkannya!",
                sceneVisualEmoji = "🧩",
                sceneDescription = "Fragmen-fragmen pendek Okazaki disambung rapi oleh enzim DNA ligase."
            ),
            StoryPanel(
                id = "psp3",
                panelNumber = 3,
                title = "Transkripsi: Mencetak Kurir mRNA",
                caption = "Kirana menyimak proses pembacaan gen di dalam inti sel.",
                dialogueSpeaker = "Kirana",
                dialogueText = "RNA Polimerase menyalin sekuens DNA menjadi untai mRNA kurir! Sebelum keluar inti, intron yang tak terpakai dipotong dan dibuang lewat proses Splicing oleh spliceosome!",
                sceneVisualEmoji = "📜",
                sceneDescription = "Transkrip mRNA keluar dari pori nukleus menuju sitoplasma setelah proses splicing."
            ),
            StoryPanel(
                id = "psp4",
                panelNumber = 4,
                title = "Translasi: Pabrik Perakitan Ribosom",
                caption = "Dimas memperhatikan tRNA membawa asam amino ke dalam ribosom.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Ribosom membaca triplet kodon mRNA satu per satu! tRNA pembawa antikodon membawa asam amino spesifik, merangkai rantai polipeptida hingga bertemu kodon stop UAA, UAG, atau UGA!",
                sceneVisualEmoji = "🏭",
                sceneDescription = "Ribosom menerjemahkan kodon triplet mRNA merangkai asam amino menjadi rantai protein."
            )
        ),
        intuitionTitle = "Dogma Sentral Biologi Molekuler: Aliran Informasi Genetik",
        intuitionBody = "Dogma sentral biologi molekuler menjelaskan bagaimana kode sandi genetik pada DNA diwariskan melalui Replikasi, disalin menjadi pesan RNA melalui Transkripsi, dan diterjemahkan menjadi protein fungsional melalui Translasi.\n\n" +
                "1. Replikasi DNA Semikonservatif (Meselson & Stahl 1958):\n" +
                "   Setiap untai heliks ganda memisah menjadi cetakan; setiap molekul DNA anak terdiri dari 1 untai lama induk dan 1 untai baru disintesis.\n" +
                "   • Helikase: Membuka ikatan hidrogen untai ganda di titik awal replikasi (*origin of replication*).\n" +
                "   • Single-Strand Binding Protein (SSB): Mencegah untai tunggal yang terbuka menutup kembali.\n" +
                "   • Topoisomerase / Girase: Meredakan tegangan puntir superkoil di depan garpu replikasi.\n" +
                "   • Primase: Membuat primer pendek RNA sebagai titik awal perlekatan DNA polimerase.\n" +
                "   • DNA Polimerase III: Mensintesis untai DNA baru dengan arah pertumbuhan selalu dari ujung 5' menuju ujung 3'.\n" +
                "     - *Leading Strand* (Untai Maju): Disintesis secara kontinu searah pergerakan garpu replikasi.\n" +
                "     - *Lagging Strand* (Untai Lambat): Disintesis secara diskontinu berlawanan arah berupa Fragmen Okazaki.\n" +
                "   • DNA Polimerase I: Mengganti primer RNA dengan nukleotida DNA.\n" +
                "   • DNA Ligase: Menyambung celah ikatan fosfodiester antar-fragmen Okazaki.\n\n" +
                "2. Transkripsi (DNA → mRNA):\n" +
                "   Berlangsung di inti sel (eukariot). Enzim RNA Polimerase mengenali sekuens Promotor (kotak TATA), membuka untai ganda DNA, dan merangkai nukleotida pre-mRNA komplementer dari untai cetakan (DNA *antisense* / *template*) 3' → 5'. Basa Adenin pada DNA dipasangkan dengan Urasil (U) pada RNA.\n" +
                "   • Pemrosesan pascatranskripsi (Eukariot):\n" +
                "     - Penambahan 7-metilguanosin cap di ujung 5'.\n" +
                "     - Penambahan ekor poli-A (polyadenylation) di ujung 3'.\n" +
                "     - Penyambungan RNA (*RNA Splicing*): Pemotongan bagian non-pengkode (Intron) dan penyambungan bagian pengkode (Ekson) oleh kompleks enzim *spliceosome*.\n\n" +
                "3. Translasi (mRNA → Rantai Polipeptida Protein):\n" +
                "   Berlangsung pada ribosom di sitoplasma atau retikulum endoplasma kasar.\n" +
                "   • Inisiasi: Subunit kecil ribosom dan inisiator tRNA mengenali Kodon Start (AUG = Asam amino Metionin).\n" +
                "   • Elongasi: Kodon triplet mRNA dibaca berurutan di sisi A (Aminoasil), sisi P (Peptidil), dan sisi E (Exit) ribosom. Enzim peptidil transferase membentuk ikatan peptida antar-asam amino.\n" +
                "   • Terminasi: Pembacaan mencapai Kodon Stop (UAA, UAG, UGA) yang tidak mengkode asam amino mana pun; faktor pelepasan melepaskan rantai polipeptida utuh.",
        intuitionPoints = listOf(
            "Tabel kode genetik bersifat Degeneratif (Redundan): ada 64 kombinasi kodon triplet (4³), tetapi hanya mengkode 20 jenis asam amino; artinya satu asam amino dapat dikodekan oleh beberapa kodon berbeda.",
            "Kode genetik bersifat Universal: kodon AUG mengkode metionin pada bakteri, tumbuhan, gajah, hingga manusia, membuktikan seluruh makhluk hidup berasal dari nenek moyang evolusi yang sama!",
            "Koreksi pembacaan (*proofreading*) oleh fungsi eksonuklease 3'→5' DNA polimerase menekan angka kesalahan replikasi menjadi kurang dari 1 kesalahan per 1 miliar nukleotida disalin."
        ),
        simId = "sim-protein-synthesis",
        formulas = listOf(
            FormulaCard(
                symbol = "N_{\\text{kodon}}",
                equation = "4^3 = 64 \\text{ Kodon Triplet}",
                meaning = "Jumlah total permutasi kodon triplet dari 4 jenis basa nitrogen (A, U, G, C).",
                units = "ragam kodon",
                applicationNote = "61 kodon mengkode 20 jenis asam amino standar, 3 kodon bertindak sebagai sinyal terminasi Kodon Stop."
            ),
            FormulaCard(
                symbol = "\\text{Aturan Chargaff}",
                equation = "\\%A = \\%T \\quad , \\quad \\%G = \\%C \\quad \\Rightarrow \\quad \\frac{A+G}{T+C} = 1",
                meaning = "Rasio stoikiometri mol pasangan basa nitrogen pada DNA heliks ganda.",
                units = "perbandingan rasio molar",
                applicationNote = "Jika DNA mengandung 30% Adenin, maka pasti mengandung 30% Timin, 20% Guanin, dan 20% Sitosin."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengembangan Platform Vaksin mRNA Merah Putih oleh Bio Farma & BRIN",
            context = "Pandemi global membuktikan negara yang menguasai sintesis platform molekuler mRNA mampu merespons mutasi virus baru hanya dalam hitungan minggu.",
            engineeringProblem = "Merancang sekuens mRNA sintetis yang stabil dan mampu menginstruksikan ribosom sel tubuh memproduksi protein Spike SARS-CoV-2 tanpa memicu respon alergi.",
            physicalConceptUsed = "Transkripsi in-vitro (IVT): modifikasi nukleosida pseudouridin (Ψ) untuk mencegah degradasi oleh sel imun inang, penambahan tudung cap 5' analog sintetik, dan enkapsulasi dalam nanopartikel lipid (LNP).",
            mathematicalModel = "Optimasi kodon (codon optimization) menggunakan algoritma komputasi untuk meningkatkan laju translasi ribosom manusia hingga 300% lebih efisien.",
            realWorldImpact = "Membangun kemandirian kedaulatan bioteknologi vaksin mRNA pertama di Asia Tenggara yang diproduksi secara mandiri di Bandung.",
            relatedCareers = listOf("Biolog Molekuler Vaksin", "Insinyur Formulasi Nanopartikel Lipid", "Bioinformatikawan Desain Gen"),
            verifiedSource = "PT Bio Farma (Persero) & Konsorsium Riset Vaksin Merah Putih BRIN."
        ),
        homeLab = HomeLabData(
            title = "Isolasi Sederhana Benang Kasar DNA Buah Pisang Menggunakan Garam & Sabun Dapur",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "½ buah pisang matang (sumber sel kaya DNA triploid)",
                "1 sendok makan sabun cuci piring cair (pemecah membran lipid)",
                "1 sendok teh garam dapur murni (penetrasi protein histon)",
                "100 mL air putih hangat dan saringan teh kain",
                "Alkohol medis 70% yang telah didinginkan di freezer selama 2 jam",
                "1 gelas kaca bening dan tusuk gigi"
            ),
            steps = listOf(
                "Langkah 1: Lumatkan potongan pisang dalam mangkuk bersama air hangat hingga menjadi bubur halus (merusak dinding selulosa secara mekanik).",
                "Langkah 2: Campurkan 1 sendok sabun cuci piring dan 1 sendok teh garam ke dalam bubur pisang, aduk perlahan selama 5 menit tanpa menimbulkan banyak busa (sabun melisiskan dwilapis fosfolipid membran sel dan nukleus).",
                "Langkah 3: Saring bubur pisang menggunakan saringan teh ke dalam gelas kaca bening hingga diperoleh cairan filtrat bening.",
                "Langkah 4: Miringkan gelas kaca, lalu tuangkan alkohol 70% sangat dingin secara perlahan melalui dinding gelas sehingga membentuk lapisan terpisah di atas filtrat pisang.",
                "Langkah 5: Amati batas kedua cairan: serabut benang lendir putih halus akan mengendap keluar melayang ke lapisan alkohol! Pilin benang putih tersebut dengan tusuk gigi: itulah kumpulan miliaran molekul asam nukleat DNA pisang!"
            ),
            observationGoal = "Mengisolasi secara makroskopis molekul asam nukleat DNA dari sel tumbuhan menggunakan prinsip kelarutan dan lisis membran kimiawi.",
            connectionToSimulation = "Bandingkan benang lendir DNA-mu dengan visualisasi replikasi heliks ganda pada simulator di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sintesis-1",
                prompt = "Jika suatu rantai DNA cetakan (template/antisense) memiliki urutan basa 3' - TAC GGC TTA - 5', bagaimanakah urutan kodon triplet pada rantai mRNA hasil transkripsinya?",
                type = "multiple_choice",
                options = listOf(
                    "5' - AUG CCG AAU - 3'",
                    "5' - ATG CCG AAT - 3'",
                    "5' - UAC GGC UUA - 3'",
                    "3' - AUG CCG AAU - 5'"
                ),
                correctAnswer = "5' - AUG CCG AAU - 3'",
                hints = listOf(
                    "Ingat aturan pasangan basa komplementer: T berpasangan dengan A, A dengan U (karena RNA tidak punya T), C dengan G, G dengan C.",
                    "Arah sintesis mRNA berlawanan (antiparalel): dari ujung 5' ke ujung 3'."
                ),
                explanation = "Transkripsi mencetak mRNA komplementer secara antiparalel: T→A, A→U, C→G, G→C. Jadi cetakan 3'-TAC GGC TTA-5' menghasilkan kodon 5'-AUG CCG AAU-3'.",
                misconception = "Lupa bahwa RNA tidak memiliki Timin (T) melainkan Urasil (U), atau terbalik arah ujung 5' dan 3'."
            ),
            QuizQuestion(
                id = "q-sintesis-2",
                prompt = "Enzim yang bertugas menyambung celah ikatan fosfodiester antar-fragmen Okazaki pada untai lambat (lagging strand) selama proses replikasi DNA adalah...",
                type = "multiple_choice",
                options = listOf("DNA Ligase", "DNA Helikase", "RNA Polimerase", "DNA Primase"),
                correctAnswer = "DNA Ligase",
                hints = listOf(
                    "Bertindak sebagai 'lem molekuler' penyambung rantai.",
                    "Kata dasarnya berakar dari 'Ligasi' (mengikat/menyambung)."
                ),
                explanation = "DNA Ligase mengkatalisis pembentukan ikatan kovalen fosfodiester antara ujung 3'-hidroksil dan 5'-fosfat, merekatkan fragmen-fragmen Okazaki menjadi untai DNA kontinu utuh.",
                misconception = "Menyamakan dengan DNA Helikase yang bertugas membuka pilinan heliks."
            )
        )
    )

    // =========================================================================
    // 9. TEORI EVOLUSI DARWIN, BUKTI ILMIAH & KESETIMBANGAN HARDY-WEINBERG
    // =========================================================================
    private val evolusiLesson = LessonData(
        conceptId = "bio-evolusi",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pevo1",
                panelNumber = 1,
                title = "Pelayaran Bersejarah HMS Beagle",
                caption = "Kakek membuka peta kepulauan Galapagos yang dijelajahi Charles Darwin tahun 1835.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Darwin mengamati burung-burung finch di setiap pulau memiliki bentuk paruh berbeda: pematuk biji tebal, penghisap kaktus ramping, hingga penangkap serangga! Semuanya berevolusi dari satu spesies nenek moyang burung yang sama!",
                sceneVisualEmoji = "⛵",
                sceneDescription = "Kapal layar HMS Beagle berlabuh di kepulauan vulkanik Galapagos dengan burung finch aneka paruh."
            ),
            StoryPanel(
                id = "pevo2",
                panelNumber = 2,
                title = "Seleksi Alam: Darwin vs Lamarck",
                caption = "Dimas membandingkan hipotesis panjang leher jerapah.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Lamarck mengira jerapah lehernya memanjang karena terus meregangkan lehernya menggapai daun tinggi. Padahal Darwin membuktikan seleksi alam: jerapah leher panjang bertahan hidup dari kelaparan dan mewariskan gen unggulnya!",
                sceneVisualEmoji = "🦒",
                sceneDescription = "Ilustrasi perbandingan seleksi alam variasi genetik Darwin vs adaptasi didapat Lamarck."
            ),
            StoryPanel(
                id = "pevo3",
                panelNumber = 3,
                title = "Bukti Anatomi Homolog & DNA",
                caption = "Kirana membandingkan susunan tulang lengan manusia, kaki depan kucing, sirip paus, dan sayap kelelawar.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Semuanya memiliki susunan tulang yang persis sama: humerus, radius, ulna, karpal, dan metakarpal! Ini Struktur Homolog bukti radiasi adaptif dari moyang mamalia bersama!",
                sceneVisualEmoji = "🦴",
                sceneDescription = "Perbandingan anatomi komparatif tulang lengan homolog pada berbagai kelas mamalia."
            ),
            StoryPanel(
                id = "pevo4",
                panelNumber = 4,
                title = "Matematika Populasi Hardy-Weinberg",
                caption = "Dimas menuliskan rumus frekuensi alel p² + 2pq + q² = 1.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Di dalam populasi yang kawin acak tanpa mutasi dan seleksi alam, frekuensi alel tetap seimbang konstan! Hukum Hardy-Weinberg memungkinkan kita melacak laju evolusi mikro organisme!",
                sceneVisualEmoji = "🔢",
                sceneDescription = "Persamaan kuadratik kesetimbangan alel mendasari genetika populasi evolusioner."
            )
        ),
        intuitionTitle = "Dinamika Evolusi Hayati: Keturunan dengan Modifikasi & Genetika Populasi",
        intuitionBody = "Evolusi adalah perubahan frekuensi alel dan sifat-sifat terwariskan pada suatu populasi organisme dari generasi ke generasi selama rentang waktu geologis yang panjang.\n\n" +
                "1. Pokok Teori Evolusi Charles Darwin (On the Origin of Species 1859):\n" +
                "   • Variasi Terwariskan: Individu dalam suatu populasi selalu memiliki variasi genetik alami.\n" +
                "   • Potensi Reproduksi Berlebih: Setiap spesies menghasilkan keturunan lebih banyak daripada yang mampu didukung lingkungan (Malthus).\n" +
                "   • Perjuangan untuk Hidup (*Struggle for Existence*): Terjadi kompetisi sengit memperebutkan makanan, pasangan kawin, dan ruang habitat.\n" +
                "   • Kebugaran Diferensial (*Survival of the Fittest*): Individu dengan variasi yang adaptif terhadap lingkungan memiliki peluang bertahan hidup dan bereproduksi lebih tinggi, mewariskan alel adaptif tersebut kepada generasi berikutnya.\n\n" +
                "2. Pilar Bukti Ilmiah Evolusi:\n" +
                "   • Catatan Fosil: Stratigrafi batuan memperlihatkan transisi bentuk purba ke modern (contoh: fosil kuda dari *Hyracotherium* bercakar 4 menjadi *Equus* modern berkuku tunggal).\n" +
                "   • Anatomi Perbandingan:\n" +
                "     - Struktur Homolog: Organ dengan struktur anatomi embriologis sama tetapi fungsinya berbeda akibat divergensi adaptif (contoh: tangan manusia, sayap burung, sirip paus, kaki kucing).\n" +
                "     - Struktur Analog: Organ dengan fungsi sama tetapi struktur asal usulnya berbeda akibat konvergensi lingkungan serupa (contoh: sayap serangga dari kitin vs sayap burung dari tulang berbulu).\n" +
                "     - Organ Vestigial: Struktur sisa organ purba yang menyusut tanpa fungsi vital (tulang ekor manusia, usus buntu/apendiks, sisa tulang pelvis paha pada paus).\n" +
                "   • Biologi Molekuler: Kesamaan sekuens basa DNA dan urutan asam amino sitokrom c; manusia dan simpanse memiliki kemiripan genomik lebih dari 98%.\n\n" +
                "3. Hukum Kesetimbangan Hardy-Weinberg:\n" +
                "   Frekuensi alel (p dan q) dan frekuensi genotipe dalam suatu populasi akan tetap konstan dari generasi ke generasi HANYA JIKA memenuhi 5 syarat ketat:\n" +
                "   1. Ukuran populasi sangat besar (meniadakan genetic drift).\n" +
                "   2. Terjadi perkawinan acak (panmiksia).\n" +
                "   3. Tidak ada mutasi baru.\n" +
                "   4. Tidak ada migrasi (aliran gen masuk/keluar).\n" +
                "   5. Tidak ada seleksi alam (semua genotipe memiliki fitness yang sama).\n" +
                "   • Persamaan: p + q = 1  dan  p² (AA) + 2pq (Aa) + q² (aa) = 1.",
        intuitionPoints = listOf(
            "Individu tunggal TIDAK PERNAH berevolusi dalam masa hidupnya; yang berevolusi adalah POPULASI sepanjang pergantian generasi melalui perubahan frekuensi alel genomik.",
            "Spesiasi Alopatrik terjadi ketika sawar fisik geologis (seperti terbelahnya pulau oleh lautan atau terbentuknya ngarai) memisahkan dua populasi hingga akumulasi mutasi mencegah keduanya saling kawin kembali (tercapai isolasi reproduktif).",
            "Resistensi bakteri terhadap antibiotik dan resistensi hama wereng terhadap pestisida kimia adalah bukti nyata evolusi seleksi alam tercepat yang sedang berlangsung di depan mata kita!"
        ),
        simId = "sim-evolution",
        formulas = listOf(
            FormulaCard(
                symbol = "p^2 + 2pq + q^2 = 1",
                equation = "p + q = 1 \\quad \\Rightarrow \\quad p^2 + 2pq + q^2 = 1",
                meaning = "Persamaan kesetimbangan frekuensi alel dan genotipe populasi Hardy-Weinberg.",
                units = "proporsi frekuensi (0 sampai 1)",
                applicationNote = "p² = frekuensi homozigot dominan (AA), 2pq = heterozigot (Aa), q² = homozigot resesif (aa)."
            ),
            FormulaCard(
                symbol = "d",
                equation = "d = 2 \\lambda t",
                meaning = "Persamaan Jam Molekuler (Molecular Clock): jarak divergensi sekuens sebanding dengan waktu geologis.",
                units = "substitusi basa per situs",
                applicationNote = "λ adalah laju mutasi netral konstan, t adalah waktu sejak perpisahan dua garis keturunan nenek moyang bersama."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Radiasi Adaptif dan Spesiasi Burung Endemik Kepulauan Wallacea oleh Tim Ekologi BRIN",
            context = "Kepulauan Wallacea (Sulawesi, Maluku, Nusa Tenggara) terisolasi oleh palung laut dalam yang tidak pernah tersambung daratan Asia maupun Australia selama zaman es pleistosen.",
            engineeringProblem = "Melacak bagaimana satwa purba burung Maleo (*Macrocephalon maleo*) berevolusi mengembangkan adaptasi unik menimbun telur di pasir panas geotermal bumi.",
            physicalConceptUsed = "Kombinasi biogeografi pulau MacArthur-Wilson dan filogenomik jam molekuler DNA mitokondria (gen Cytochrome b) untuk merekonstruksi garis pohon silsilah spesiasi alopatrik.",
            mathematicalModel = "Analisis parsimoni maksimum filogeni molekuler membuktikan burung Maleo berdivergensi dari famili Megapodiidae Australasia sekitar 15 juta tahun lalu seiring pergeseran lempeng tektonik Sulawesi.",
            realWorldImpact = "Menetapkan zona koridor suaka hidupan liar terpadu di Taman Nasional Bogani Nani Wartabone untuk melindungi habitat peneluran panas bumi dari ancaman kepunahan.",
            relatedCareers = listOf("Biolog Evolusi", "Peneliti Filogenomik Satwa", "Ahli Biogeografi Pulau"),
            verifiedSource = "Pusat Riset Biosistematika dan Evolusi BRIN & Balai Taman Nasional Bogani Nani Wartabone."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Frekuensi Genotip Kemampuan Menekuk Lidah (Gen Dominan T) Menggunakan Model Hardy-Weinberg",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "30 orang responden (teman sekelas, tetangga, atau anggota keluarga besar)",
                "Cermin datar",
                "Kertas catatan kalkulasi statistika"
            ),
            steps = listOf(
                "Langkah 1: Minta setiap orang mencoba menggulung/menekuk sisi tepi lidahnya ke atas membentuk huruf U (tongue rolling).",
                "Langkah 2: Kemampuan menekuk lidah dikendalikan oleh alel dominan T, sedangkan yang tidak bisa menekuk lidah bergenotipe homozigot resesif tt.",
                "Langkah 3: Hitung jumlah orang yang TIDAK BISA menekuk lidah (q²). Misal: 12 orang dari 30 orang = 12/30 = 0,40 (q² = 0,40).",
                "Langkah 4: Hitung frekuensi alel resesif q = akar(0,40) ≈ 0,632. Maka frekuensi alel dominan p = 1 - q = 1 - 0,632 = 0,368.",
                "Langkah 5: Hitung persentase orang yang memiliki genotipe pembawa heterozigot (Tt) dalam populasi: 2pq = 2 × 0,368 × 0,632 ≈ 0,465 (sekitar 46,5%)!"
            ),
            observationGoal = "Mengaplikasikan rumus matematis Hardy-Weinberg dalam menghitung frekuensi alel dan genotipe tersembunyi pada populasi nyata.",
            connectionToSimulation = "Bandingkan nilai frekuensi alelmu dengan simulasi genetic drift pada simulator populasi di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-evo-1",
                prompt = "Pada suatu populasi desa terpencil berpenduduk 10.000 jiwa, terdapat 16 orang yang menderita albino (sifat resesif homozigot aa). Jika populasi berada dalam kesetimbangan Hardy-Weinberg, berapakah frekuensi alel resesif 'a' dalam populasi tersebut?",
                type = "numeric",
                correctAnswer = "0.04",
                tolerance = 0.005f,
                hints = listOf(
                    "Frekuensi albino (aa) adalah q² = 16 / 10.000 = 0,0016.",
                    "Frekuensi alel a adalah q = akar kuadrat dari q².",
                    "Hitung akar kuadrat dari 0,0016 = ...?"
                ),
                explanation = "Frekuensi genotipe aa = q² = 16 / 10.000 = 0,0016. Maka frekuensi alel resesif a = q = √0,0016 = 0,04 (atau 4%).",
                misconception = "Lupa menarik akar kuadrat dari nilai penderita (q²)."
            ),
            QuizQuestion(
                id = "q-evo-2",
                prompt = "Perbedaan paling esensial antara struktur organ homolog dan struktur organ analog adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Organ homolog memiliki asal-usul struktur embriologis sama tetapi fungsi berbeda, sedangkan organ analog memiliki fungsi sama tetapi asal-usul struktur berbeda",
                    "Organ homolog hanya ditemukan pada hewan vertebrata, sedangkan organ analog hanya pada serangga",
                    "Organ homolog membuktikan teori Lamarck, sedangkan organ analog membuktikan teori Darwin",
                    "Organ homolog tidak memiliki susunan tulang sama sekali"
                ),
                correctAnswer = "Organ homolog memiliki asal-usul struktur embriologis sama tetapi fungsi berbeda, sedangkan organ analog memiliki fungsi sama tetapi asal-usul struktur berbeda",
                hints = listOf(
                    "Homolog = homo (sama asal usul strukturnya).",
                    "Contoh homolog: tangan manusia dan sirip paus. Contoh analog: sayap burung dan sayap kupu-kupu."
                ),
                explanation = "Homologi menunjukkan hubungan kekerabatan evolusi divergen dari nenek moyang yang sama (struktur dasar embriologis sama dengan modifikasi fungsi beraneka ragam), sedangkan analogi adalah hasil evolusi konvergen adaptasi lingkungan serupa dari struktur asal usul yang berbeda.",
                misconception = "Tertukar antara pengertian organ homolog dan organ analog."
            )
        )
    )

    // =========================================================================
    // 10. KEANEKARAGAMAN HAYATI, GARIS WALLACE & FILOGENI
    // =========================================================================
    private val keanekaragamanHayatiLesson = LessonData(
        conceptId = "bio-keanekaragaman-hayati",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pkh1",
                panelNumber = 1,
                title = "Zamrud Khatulistiwa: Megabiodiversitas Dunia",
                caption = "Kakek membentangkan peta kepulauan Indonesia yang diapit dua benua dan dua samudra.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Indonesia adalah episentrum megabiodiversitas dunia! Dengan luas daratan hanya 1,3% bumi, kita memiliki 17% spesies satwa dan flora global!",
                sceneVisualEmoji = "🗺️",
                sceneDescription = "Peta Indonesia memperlihatkan sebaran hutan hujan tropis dari Sumatra hingga Papua."
            ),
            StoryPanel(
                id = "pkh2",
                panelNumber = 2,
                title = "Garis Imajiner Alfred Russel Wallace",
                caption = "Dimas menarik garis khayal membelah Selat Lombok dan Selat Makassar.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Garis Wallace memisahkan Fauna Asiatis (gajah, harimau, badak berbadan besar) dari Zona Peralihan Wallacea! Dan Garis Weber memisahkan satwa peralihan dari Fauna Australis berkantung di Papua!",
                sceneVisualEmoji = "🐅",
                sceneDescription = "Peta biogeografi memperlihatkan batas fauna Garis Wallace, Weber, dan Lydekker."
            ),
            StoryPanel(
                id = "pkh3",
                panelNumber = 3,
                title = "Pohon Filogeni Plantae: Dari Lumut ke Bunga",
                caption = "Kirana menyusun kladogram pohon kekerabatan kerajaan tumbuhan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Lumut non-vaskular berakar rizoid, berevolusi menjadi Paku vaskular berspora, lalu Gymnospermae berbiji terbuka runjung, hingga puncaknya Angiospermae berbunga dan berbiji tertutup!",
                sceneVisualEmoji = "🌿",
                sceneDescription = "Pohon evolusi filogeni tumbuhan memperlihatkan transisi dari bryophyta hingga spermatophyta."
            ),
            StoryPanel(
                id = "pkh4",
                panelNumber = 4,
                title = "Kladistika Animalia: Menuju Filum Chordata",
                caption = "Dimas menunjuk cabang evolusi simetri tubuh hewan.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Dari Porifera asimetris sederhana, Cnidaria simetri radial, hingga hewan bertulang belakang Vertebrata bersimetri bilateral dengan notokorda sejati: simfoni filogeni makhluk hidup!",
                sceneVisualEmoji = "🐋",
                sceneDescription = "Diagram kladogram filum Animalia dari invertebrata primitif hingga mamalia chordata."
            )
        ),
        intuitionTitle = "Arsitektur Pohon Kehidupan: Biogeografi Nusantara & Kladistika Hayati",
        intuitionBody = "Keanekaragaman hayati (biodiversitas) mencakup seluruh variasi kehidupan di muka bumi yang terstruktur dalam tiga tingkatan hierarkis serta pola biogeografi spasial.\n\n" +
                "1. Tiga Tingkatan Biodiversitas:\n" +
                "   • Keanekaragaman Gen: Variasi susunan basa DNA dalam satu spesies (contoh: padi varietas Ciherang, IR64, dan Inpari; kucing bulu belang, oranye, dan hitam).\n" +
                "   • Keanekaragaman Spesies: Variasi antar-spesies berbeda dalam famili atau genus yang sama (contoh: famili Felidae: kucing kampung, macan dahan, harimau sumatera, cheetah).\n" +
                "   • Keanekaragaman Ekosistem: Variasi interaksi komponen biotik dan abiotik lanskap iklim (contoh: ekosistem hutan hujan tropis Kalimantan, sabana Baluran Jawa Timur, rawa gambut Riau, terumbu karang Raja Ampat).\n\n" +
                "2. Biogeografi Persebaran Fauna Indonesia:\n" +
                "   • Zona Oriental (Asiatis / Dangkalan Sunda: Sumatra, Jawa, Kalimantan, Bali):\n" +
                "     Mamalia besar bertubuh tambun (gajah sumatera, badak jawa, orangutan, banteng), kera primata beragam, jenis burung berkicau warna teduh, ikan air tawar melimpah.\n" +
                "   • Zona Peralihan (Wallacea: Sulawesi, Kepulauan Maluku, Nusa Tenggara):\n" +
                "     Dibatasi Garis Wallace di barat dan Garis Weber di timur. Satwa endemik purba unik campuran: Anoa dataran/pegunungan, Babirusa taring melengkung, Komodo raksasa, Burung Maleo.\n" +
                "   • Zona Australis (Dangkalan Sahul: Papua dan pulau-pulau sekitarnya):\n" +
                "     Mamalia berkantung (marsupial: kuskus, kanguru pohon), burung berbulu indah mencolok warna-warni (Cenderawasih, Kasuari bertanduk, Kakaktua raja), minim ikan air tawar endemik besar.\n\n" +
                "3. Filogeni Kladistika Kingdom Plantae & Animalia:\n" +
                "   • Filogeni Plantae: \n" +
                "     Bryophyta (lumut non-vaskular tanpa xilem/floem sejati, gametofit dominan) → Pteridophyta (paku vaskular trakeofita berklorofil, sporofit dominan, berspora) → Spermatophyta berbiji (Gymnospermae berkambium runjung terbuka seperti pinus/melinjo vs Angiospermae berkantung bunga tertutup Monokotil dan Dikotil).\n" +
                "   • Filogeni Animalia:\n" +
                "     Parazoa tanpa jaringan sejati (Porifera spons) → Eumetazoa bersimetri radial diploblastik (Cnidaria ubur-ubur/anemon) → Bilateral triploblastik: Acoelomata (Platyhelminthes cacing pipih) → Pseudocoelomata (Nematoda) → Coelomata rongga tubuh sejati (Mollusca bertubuh lunak bersekresi cangkang, Annelida cincin beruas, Arthropoda eksoskeleton bersegmen, Echinodermata berduri, hingga filum tertinggi Chordata / Subfilum Vertebrata: Pisces, Amfibi, Reptil, Aves, Mamalia).",
        intuitionPoints = listOf(
            "Alfred Russel Wallace merumuskan teori evolusi independen saat terserang malaria di Pulau Ternate Maluku, menghasilkan surat bersejarah 'Surat Ternate' yang dikirimkan kepada Darwin pada tahun 1858!",
            "Tumbuhan monokotil (keping biji satu, akar serabut, berkas pembuluh tersebar, pertulangan daun sejajar) dan dikotil (keping biji dua, akar tunggang, kambium silinder melingkar, daun menyirip) merupakan cabang divergensi terbesar pada angiospermae.",
            "Metode Kladistika modern mengelompokkan taksa semata-mata berdasarkan Karakter Sinapomorfi (karakter turunan bersama) untuk membentuk Klad Monofiletik sejati."
        ),
        simId = "sim-biodiversity",
        formulas = listOf(
            FormulaCard(
                symbol = "D_{\\text{Simpson}}",
                equation = "D = 1 - \\sum_{i=1}^S \\left(\\frac{n_i}{N}\\right)^2",
                meaning = "Indeks Dominansi Keanekaragaman Hayati Simpson.",
                units = "nilai probabilitas (0 hingga 1)",
                applicationNote = "Nilai D mendekati 1 menunjukkan komunitas ekosistem hutan hujan tropis yang sangat heterogen dan sehat."
            ),
            FormulaCard(
                symbol = "R_{\\text{Margalef}}",
                equation = "R = \\frac{S - 1}{\\ln N}",
                meaning = "Indeks Kekayaan Spesies Margalef dalam suatu sampel cacah populasi ekologis.",
                units = "indeks kekayaan spesies",
                applicationNote = "S adalah jumlah total taksa spesies yang ditemukan, N adalah total seluruh individu yang disurvei."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Penyusunan Barcode DNA Keanekaragaman Hayati Terumbu Karang Karst Raja Ampat oleh BRIN",
            context = "Kepulauan Raja Ampat Papua Barat Daya dinobatkan sebagai 'Jantung Segitiga Karang Dunia' yang memiliki 75% dari seluruh spesies karang pembentuk terumbu yang ada di planet bumi.",
            engineeringProblem = "Mengidentifikasi ratusan spesies larva ikan karang dan fragmen koral secara cepat dan akurat yang secara morfologi fisik tampak identik.",
            physicalConceptUsed = "DNA Barcoding molekuler: amplifikasi sekuens standar 650 pasangan basa dari gen sitokrom c oksidase subunit I (COI mitokondria) untuk hewan dan gen rbcL/matK untuk alga karang.",
            mathematicalModel = "Pencocokan sekuens pustaka referensi GenBank dan BOLD System dengan algoritma BLAST untuk membangun pohon filogenetik filogeni parsimoni berbobot.",
            realWorldImpact = "Menemukan 14 spesies baru ikan karang endemik dan menjadi landasan ilmiah penetapan Jejaring Kawasan Konservasi Perairan Daerah (KKPD) Raja Ampat seluas 1,3 juta hektar.",
            relatedCareers = listOf("Spesialis Barcode DNA Biodiversitas", "Biolog Kelautan Oseanografi", "Konsultan Pengelola Kawasan Konservasi"),
            verifiedSource = "Pusat Riset Oseanografi BRIN & Balai Kawasan Konservasi Perairan Nasional (BKKPN) Kupang."
        ),
        homeLab = HomeLabData(
            title = "Pembuatan Koleksi Awetan Kering Herbarium Tumbuhan Paku (Pteridophyta) & Bunga Angiospermae",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "Sampel tumbuhan paku liar lengkap (akar, ental daun, dan bintik sorus spora di balik daun)",
                "Sampel ranting kecil tumbuhan berbunga (misal: bunga kembang sepatu atau daun mangga)",
                "Koran bekas atau kertas buram tebal",
                "Buku tebal atau pemberat batu untuk pengepresan",
                "Kertas karton manila putih tebal, selotip bening, dan spidol label"
            ),
            steps = listOf(
                "Langkah 1: Bersihkan sampel tumbuhan paku dan ranting bunga dari kotoran tanah dengan air mengalir secara hati-hati, lalu keringkan dengan tisu.",
                "Langkah 2: Rentangkan tanaman di atas lembaran koran bekas: buka salah satu daun paku agar permukaan bawah ber-sorus spora terlihat jelas menghadap ke atas.",
                "Langkah 3: Tutup dengan lipatan koran berlapis, lalu timpa dengan tumpukan buku-buku tebal yang berat selama 7–10 hari di tempat kering (jangan dijemur langsung di bawah terik matahari basah). Ganti koran setiap 2 hari jika lembab.",
                "Langkah 4: Setelah kering pipih kaku sempurna, tempelkan spesimen di atas karton putih menggunakan selotip bening kecil di beberapa titik batang.",
                "Langkah 5: Tuliskan etiket label ilmiah di sudut kanan bawah: Nama Spesimen, Nama Ilmiah / Takson, Lokasi Pengambilan, Tanggal, dan Nama Kolektor!"
            ),
            observationGoal = "Mempraktikkan teknik standar herbarium botani dalam mengawetkan morfologi spesimen taksonomi tumbuhan.",
            connectionToSimulation = "Bandingkan struktur daun paku herbariummu dengan pohon filogeni kingdom Plantae di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-biodiv-1",
                prompt = "Satwa khas endemik Indonesia berikut yang berada di Zona Peralihan Wallacea (antara Garis Wallace dan Garis Weber) yang memiliki ciri perpaduan karakteristik unik adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Babi Rusa dan Anoa di Sulawesi",
                    "Orangutan dan Bekantan di Kalimantan",
                    "Harimau dan Badak Bercula Satu di Jawa-Sumatra",
                    "Burung Cenderawasih dan Kanguru Pohon di Papua"
                ),
                correctAnswer = "Babi Rusa dan Anoa di Sulawesi",
                hints = listOf(
                    "Pulau Sulawesi terletak di tengah-tengah Zona Wallacea.",
                    "Satwa ini tidak ditemukan di daratan benua Asia maupun benua Australia."
                ),
                explanation = "Sulawesi adalah pulau utama di Kawasan Wallacea (Zona Peralihan) yang memiliki keanekaragaman satwa endemik purba tinggi seperti Babi Rusa (*Babyrousa*) dan Anoa (*Bubalus quarlesi*).",
                misconception = "Menjawab orangutan (orangutan adalah fauna Zona Asiatis/Sunda)."
            ),
            QuizQuestion(
                id = "q-biodiv-2",
                prompt = "Tumbuhan lumut (Bryophyta) diklasifikasikan terpisah dari tumbuhan paku (Pteridophyta) karena tumbuhan lumut...",
                type = "multiple_choice",
                options = listOf(
                    "Belum memiliki jaringan pembuluh sejati (xilem dan floem) serta fase gametofit lebih dominan",
                    "Tidak memiliki pigmen klorofil untuk berfotosintesis",
                    "Berkembang biak secara generatif menggunakan biji tertutup",
                    "Memiliki akar tunggang yang menembus tanah dalam"
                ),
                correctAnswer = "Belum memiliki jaringan pembuluh sejati (xilem dan floem) serta fase gametofit lebih dominan",
                hints = listOf(
                    "Lumut disebut tanaman non-vaskular (atrakeofita).",
                    "Tumbuhan hijau lumut yang sering kita lihat adalah fase penghasil gamet (gametofit)."
                ),
                explanation = "Lumut (Bryophyta) adalah tumbuhan darat non-vaskular (tidak memiliki berkas xilem dan floem sejati) di mana generasi gametofit (n) hidup bebas dan lebih dominan daripada generasi sporofitnya.",
                misconception = "Mengira lumut tidak bisa berfotosintesis."
            )
        )
    )

    // =========================================================================
    // 11. STRUKTUR JARINGAN TUMBUHAN & FITOHORMON PERTUMBUHAN
    // =========================================================================
    private val jaringanTumbuhanLesson = LessonData(
        conceptId = "bio-jaringan-tumbuhan",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pjt1",
                panelNumber = 1,
                title = "Misteri Air Memanjat Pohon Raksasa",
                caption = "Kirana dan Dimas menengadah menatap tajuk pohon ulin raksasa setinggi 50 meter di hutan Kalimantan.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Pohon ini tidak punya pompa listrik seperti pompa air sumur kita. Bagaimana air dan pupuk mineral dari ujung akar tanah bisa dipompa memanjat naik 50 meter ke daun teratas?",
                sceneVisualEmoji = "🌲",
                sceneDescription = "Pohon ulin raksasa menjulang tinggi dengan akar banir raksasa di lantai hutan tropis."
            ),
            StoryPanel(
                id = "pjt2",
                panelNumber = 2,
                title = "Teori Kohesi-Tensi Tarikan Transpirasi",
                caption = "Kakek memperlihatkan penampang mikroskopis pembuluh kayu xilem.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Daun di atas terus menguapkan air lewat stomata (Transpirasi)! Kehilangan air ini menciptakan daya hisap negatif (tensi) yang menarik kolom air di dalam pipa xilem ke atas berkat ikatan kohesi antar-molekul air!",
                sceneVisualEmoji = "💧",
                sceneDescription = "Molekul air membentuk untaian hidrogen kohesi berkesinambungan ditarik ke atas pipa xilem."
            ),
            StoryPanel(
                id = "pjt3",
                panelNumber = 3,
                title = "Kambium & Pertumbuhan Sekunder",
                caption = "Dimas menghitung lingkaran tahun (annual rings) pada batang kayu gelondongan yang ditebang.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kambium vaskular membelah ke dalam membentuk xilem sekunder dan membelah ke luar membentuk floem! Setiap lingkaran cincin mencatat pergantian musim penghujan dan kemarau!",
                sceneVisualEmoji = "🪵",
                sceneDescription = "Penampang melintang kayu memperlihatkan garis lingkaran tahun pertumbuhan kambium."
            ),
            StoryPanel(
                id = "pjt4",
                panelNumber = 4,
                title = "Simfoni Fitohormon Pengendali Arah",
                caption = "Kirana melihat tanaman pot yang melengkung membengkok menghadap arah datangnya sinar matahari.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Hormon Auksin menghindari cahaya dan berkumpul di sisi gelap batang! Sisi gelap memanjang lebih cepat, sehingga pucuk tanaman membengkok ke arah matahari (Fototropisme Positif)!",
                sceneVisualEmoji = "🌻",
                sceneDescription = "Pucuk batang tanaman membengkok anggun menuju cahaya matahari di jendela."
            )
        ),
        intuitionTitle = "Arsitektur & Regulasi Fisiologis Tumbuhan: Dari Jaringan ke Fitohormon",
        intuitionBody = "Tumbuhan membangun struktur tubuhnya yang kokoh dan beradaptasi terhadap gravitasi serta cahaya melalui diferensiasi jaringan dewasa dan regulasi fitohormon spesifik.\n\n" +
                "1. Struktur & Spesialisasi Jaringan Tumbuhan:\n" +
                "   • Jaringan Meristem (Sel embrional aktif mitosis):\n" +
                "     - Meristem Apikal: Ujung pucuk batang dan ujung akar penanggung jawab pertumbuhan primer (memanjang vertikal).\n" +
                "     - Meristem Lateral (Kambium Vaskular & Felogen gabus): Pada tumbuhan dikotil dan gymnospermae penanggung jawab pertumbuhan sekunder (memperbesar diameter lingkaran batang).\n" +
                "     - Meristem Interkalar: Pada buku ruas rumput-rumputan dan bambu.\n" +
                "   • Jaringan Pelindung (Epidermis): Selapis sel rapat dilapisi lilin kutikula; berdiferensiasi menjadi Stomata (mulut daun bertrikoma), Spina (duri), dan Trikoma (rambut pelindung).\n" +
                "   • Jaringan Dasar (Parenkim): Sel bersegi banyak berdinding tipis dengan vakuola besar untuk fotosintesis (klorenkim palisade/spons), penimbun cadangan pati, dan aerenkim rongga udara tanaman air.\n" +
                "   • Jaringan Penguat / Mekanik:\n" +
                "     - Kolenkim: Sel hidup dengan penebalan dinding selulosa tidak merata di sudut sel (menopang tangkai daun dan organ tanaman muda lentur).\n" +
                "     - Sklerenkim: Sel mati dengan dinding sekunder yang menebal merata diperkuat senyawa kayu Lignin kaku (serat rami dan sklereid sel batu batok kelapa).\n" +
                "   • Jaringan Vaskular Pengangkut:\n" +
                "     - Xilem (Pembuluh Kayu): Terdiri dari sel mati trakea dan trakeid berlubang; mengangkut air dan garam hara terlarut searah dari akar menuju daun.\n" +
                "     - Floem (Pembuluh Tapis): Terdiri dari sel hidup buluh tapis dan sel pengiring pendamping; mentranslokasikan hasil fotosintesis (sukrosa) dua arah dari daun (*source*) ke jaringan penyimpan (*sink*).\n\n" +
                "2. Fisiologi Transportasi Tumbuhan:\n" +
                "   • Rute Penyerapan Akar: Jalur Apoplas (merembas melintasi dinding sel dan ruang antarsel hingga tertahan pita Caspary kedap endodermis) vs Jalur Simplas (mengalir melintasi sitoplasma sel via saluran celah plasmodesmata).\n" +
                "   • Teori Kohesi-Tensi Dixon & Joly: Penguapan air di stomata (transpirasi) menciptakan gradien potensial air negatif curam (tensi) yang menarik kolom air di pembuluh xilem ke atas berkat gaya Kohesi (ikatan hidrogen kuat sesama molekul air) dan Adhesi (ikatan air dengan dinding xilem).\n\n" +
                "3. Fitohormon (Zat Pengatur Tumbuh / ZPT):\n" +
                "   • Auksin (IAA): Memicu pemanjangan sel, dominansi apikal (menghambat tunas samping), dan gerak fototropisme positif serta geotropisme.\n" +
                "   • Giberelin: Mematahkan dormansi biji (memicu sekresi enzim amilase), merangsang pembungaan dini, dan pemanjangan batang raksasa (*bolting*).\n" +
                "   • Sitokinin: Merangsang pembelahan sel sitokinesis, memicu pertumbuhan tunas lateral cabang samping, dan menunda penuaan (senesens) daun.\n" +
                "   • Asam Absisat (ABA): Hormon stres; memicu penutupan stomata saat kekurangan air dan mempertahankan dormansi biji selama musim kering.\n" +
                "   • Gas Etilen: Memicu pematangan buah klimakterik (pisang, mangga, alpukat) dan pengguguran daun/buah (absisi).",
        intuitionPoints = listOf(
            "Mengapa pohon kelapa atau palem (monokotil) batangnya bisa tinggi besar padahal tidak memiliki kambium? Karena monokotil mengalami pertumbuhan meristem penebalan primer (*primary thickening meristem*) di pucuk, bukan pertumbuhan sekunder kambium.",
            "Menaruh buah pisang matang bersama buah mangga mentah dalam kardus tertutup akan mempercepat mangga matang karena pisang melepaskan hormon gas etilen ke udara!",
            "Fotoperiodisme adalah respons pembungaan tumbuhan terhadap lamanya durasi panjang malam gelap kritis yang dideteksi oleh pigmen fotoreseptor Fitokrom (Pr dan Pfr)."
        ),
        simId = "sim-plant-tissue",
        formulas = listOf(
            FormulaCard(
                symbol = "\\Psi_w",
                equation = "\\Psi_w = \\Psi_s + \\Psi_p",
                meaning = "Potensial Air total (Water Potential) jaringan tumbuhan.",
                units = "MPa (Megapascal) atau bar",
                applicationNote = "Air selalu mengalir spontan dari daerah berpotensial air tinggi (mendekati 0 di tanah) menuju daerah berpotensial air rendah negatif (di daun dan atmosfer)."
            ),
            FormulaCard(
                symbol = "\\Delta P",
                equation = "\\text{Aliran Münch: } \\Delta P = P_{\\text{source}} - P_{\\text{sink}}",
                meaning = "Gradien tekanan hidrostatik pendorong translokasi getah floem dari daun (source) ke buah/akar (sink).",
                units = "kPa atau bar",
                applicationNote = "Pemuatan aktif sukrosa di daun menarik air via osmosis menciptakan turgor tinggi pendorong aliran massal getah."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Aplikasi Induksi Pembungaan Serentak Perkebunan Nanas Subang Menggunakan Gas Etilen Cair",
            context = "Perkebunan nanas olahan industri seluas ribuan hektar di Subang Jawa Barat memerlukan pemanenan serentak teratur untuk efisiensi kapasitas pabrik pengalengan buah.",
            engineeringProblem = "Pembungaan alami tanaman nanas berlangsung acak sepanjang tahun tergantung fluktuasi cuaca lokal sehingga pemanenan menjadi tidak seragam dan boros biaya tenaga kerja.",
            physicalConceptUsed = "Aplikasi zat pengatur tumbuh eksogen: formulasi gas etilen terlarut dalam karbon aktif mikro atau ethephon yang disemprotkan ke titik tumbuh roset daun nanas pada umur 8 bulan.",
            mathematicalModel = "Konsentrasi etilen 100 ppm menginduksi perubahan meristem vegetatif menjadi generatif serempak 98% dalam waktu 45 hari pasca-aplikasi.",
            realWorldImpact = "Meningkatkan efisiensi panen buah nanas hingga 40%, menghasilkan ukuran buah seragam standar ekspor ke 30 negara, dan menjamin pasokan bahan baku pabrik 500 ton per hari.",
            relatedCareers = listOf("Agronom Perkebunan Presisi", "Fisiolog Pascapanen Hortikultura", "Manajer Riset Budidaya Tanaman"),
            verifiedSource = "Pusat Riset Hortikultura BRIN & Balai Penelitian Tanaman Buah Tropika (Balitbu) Solok."
        ),
        homeLab = HomeLabData(
            title = "Membuktikan Fototropisme Positif Batang Kecambah dalam Kotak Kardus Berlubang Cahaya",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 pot kecil tanaman kecambah kacang hijau yang sedang tumbuh tegak berumur 3 hari",
                "1 buah kardus bekas sepatu bersekat",
                "Gunting dan selotip hitam",
                "Air untuk menyiram"
            ),
            steps = listOf(
                "Langkah 1: Siapkan kotak kardus sepatu dan pastikan seluruh celah sudut tertutup rapat tanpa kebocoran cahaya.",
                "Langkah 2: Lubangi salah satu sisi samping kardus dengan lubang bulat berdiameter 3 cm (sebagai satu-satunya sumber arah masuk cahaya).",
                "Langkah 3: Siram pot kecambah hingga lembab, lalu masukkan pot ke dalam kardus di sisi sudut yang berseberangan dengan lubang cahaya.",
                "Langkah 4: Tutup rapat kardus sepatu dan letakkan kardus di dekat jendela terang selama 3 hari berturut-turut.",
                "Langkah 5: Buka kardus pada hari ke-3: batang kecambah yang semula tegak lurus telah berbelok tajam membengkok menjulur ke arah lubang cahaya (Fototropisme Positif berkat migrasi hormon auksin ke sisi gelap batang)!"
            ),
            observationGoal = "Membuktikan pengaruh distribusi asimetris fitohormon auksin dalam memandu gerak pertumbuhan organ tumbuhan merespons stimulus arah cahaya.",
            connectionToSimulation = "Bandingkan sudut pembengkokan kecambahmu dengan kurva stimulasi auksin pada simulator fisiologi tumbuhan di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-jaringan-1",
                prompt = "Jaringan pengangkut pada tumbuhan yang tersusun dari sel-sel mati berdinding lignin kaku dan berfungsi mengangkut air serta garam mineral tanah dari akar ke daun adalah...",
                type = "multiple_choice",
                options = listOf("Xilem (Pembuluh Kayu)", "Floem (Pembuluh Tapis)", "Kambium Vaskular", "Kolenkim"),
                correctAnswer = "Xilem (Pembuluh Kayu)",
                hints = listOf(
                    "Mengalirkan air satu arah dari perakaran bawah ke daun atas.",
                    "Terdiri atas unsur trakea dan trakeid."
                ),
                explanation = "Xilem (pembuluh kayu) tersusun atas sel-sel mati berongga yang mengalami lignifikasi kaku (trakea dan trakeid) untuk menghantarkan air dan mineral dari akar ke daun.",
                misconception = "Menyamakan dengan floem (floem tersusun atas sel-sel hidup yang mengangkut sari makanan hasil fotosintesis)."
            ),
            QuizQuestion(
                id = "q-jaringan-2",
                prompt = "Fitohormon gas yang berperan utama memacu pematangan buah klimakterik (seperti pisang dan mangga) serta merangsang pengguguran daun alami pada tumbuhan adalah...",
                type = "multiple_choice",
                options = listOf("Gas Etilen", "Hormon Auksin", "Hormon Giberelin", "Asam Absisat (ABA)"),
                correctAnswer = "Gas Etilen",
                hints = listOf(
                    "Satu-satunya fitohormon berbentuk gas pada suhu ruang.",
                    "Sering digunakan untuk memeram buah mentah."
                ),
                explanation = "Gas etilen adalah fitohormon yang merangsang degradasi pektin dinding sel dan konversi pati menjadi gula selama pematangan buah serta memicu proses absisi gugurnya daun dan buah.",
                misconception = "Menjawab giberelin (giberelin mematahkan dormansi biji dan memicu perbungaan, bukan mematangkan buah)."
            )
        )
    )

    // =========================================================================
    // 12. SISTEM REGULASI SARAF, ENDOKRIN & SISTEM IMUN ADAPTIF
    // =========================================================================
    private val sistemRegulasiImunLesson = LessonData(
        conceptId = "bio-sistem-regulasi-imun",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "psri1",
                panelNumber = 1,
                title = "Kilatan Listrik Membran Saraf",
                caption = "Dimas mengamati osiloskop yang merekam potensial aksi akson sel saraf cumi-cumi raksasa.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Luar biasa! Dalam sepersekian milidetik, ion Na⁺ membanjiri masuk sel saraf melonjakkan tegangan dari -70 mV istirahat menjadi +30 mV! Gelombang listrik ini melesat cepat ke otak kita!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Grafik potensial aksi memperlihatkan fase depolarisasi kilat dan repolarisasi membran saraf."
            ),
            StoryPanel(
                id = "psri2",
                panelNumber = 2,
                title = "Jembatan Sinapsis Neurotransmiter",
                caption = "Kakek menjelaskan bagaimana impuls listrik melompati celah sinapsis.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Di ujung akson, sinyal listrik memicu eksositosis vesikel neurotransmiter asetilkolin melintasi celah sinapsis 20 nanometer untuk menempel pada reseptor dendrit neuron berikutnya!",
                sceneVisualEmoji = "🔌",
                sceneDescription = "Molekul neurotransmiter dilepaskan menyeberangi celah sinapsis kimiawi."
            ),
            StoryPanel(
                id = "psri3",
                panelNumber = 3,
                title = "Poros Keseimbangan Hormon Endokrin",
                caption = "Kirana mencatat kerja homeostasis kadar gula darah oleh pankreas.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Saat kita selesai makan kenyang, sel beta pankreas mensekresi Insulin untuk menyimpan glukosa ke hati! Dan saat kita berpuasa lapar, sel alfa mensekresi Glukagon untuk memecah glikogen kembali jadi glukosa darah!",
                sceneVisualEmoji = "⚖️",
                sceneDescription = "Homeostasis umpan balik negatif hormon insulin dan glukagon menjaga stabilitas gula darah."
            ),
            StoryPanel(
                id = "psri4",
                panelNumber = 4,
                title = "Pasukan Khusus Sel T, Sel B & Vaksinasi",
                caption = "Dimas melihat animasi antibodi menetralkan partikel virus.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Sistem Imun Adaptif kita luar biasa cerdas! Sel T Sitotoksik membunuh sel yang terinfeksi virus, Sel B memproduksi jutaan Antibodi penembak jitu, dan Sel Memori mengingat antigen patogen selama puluhan tahun berkat vaksinasi!",
                sceneVisualEmoji = "🛡️",
                sceneDescription = "Molekul antibodi berbentuk huruf Y mengunci antigen virus untuk dihancurkan makrofag."
            )
        ),
        intuitionTitle = "Integrasi Komando & Pertahanan Hayati: Neuro-Endokrin & Imunologi",
        intuitionBody = "Kelangsungan hidup organisme tingkat tinggi bergantung pada integrasi terpadu tiga sistem komunikasi dan pertahanan: Sistem Saraf (elektrokimia kilat), Sistem Endokrin (regulasi hormonal sistemik), dan Sistem Imun (benteng pertahanan spesifik).\n\n" +
                "1. Fisiologi Saraf & Konduksi Potensial Aksi:\n" +
                "   • Potensial Membran Istirahat (*Resting Potential* ~ -70 mV): Dijaga oleh pompa Na⁺/K⁺ ATPase dan kebocoran ion K⁺, muatan sitoplasma negatif relatif terhadap cairan luar.\n" +
                "   • Depolarisasi: Stimulus ambang batas (*threshold* ~ -55 mV) membuka kanal Na⁺ berpintu voltase (*voltage-gated*). Ion Na⁺ menyerbu masuk, membalikkan polaritas membran hingga memuncak di +30 mV.\n" +
                "   • Repolarisasi: Kanal Na⁺ menutup inaktif; kanal K⁺ berpintu voltase membuka sehingga ion K⁺ keluar sel, memulihkan muatan negatif.\n" +
                "   • Hiperpolarisasi & Periode Refrakter: Menjamin sinyal listrik saraf mengalir satu arah secara teratur.\n" +
                "   • Konduksi Saltatori: Selubung Mielin sel Schwann menginsulasi akson; potensial aksi melompat cepat dari satu Nodus Ranvier ke nodus berikutnya hingga kecepatan 120 m/detik.\n" +
                "   • Transmisi Sinapsis Kimiawi: Potensial aksi membuka kanal Ca²⁺ terminal akson, memicu eksositosis neurotransmiter (asetilkolin, dopamin, GABA, serotonin) ke celah sinapsis mengikat reseptor pascasinaps.\n\n" +
                "2. Sistem Hormon Endokrin (Homeostasis Tubuh):\n" +
                "   • Poros Hipotalamus - Hipofisis (Master Gland): Mengontrol kelenjar tiroid (metabolisme), adrenal (kortisol stres & adrenalin darurat), gonad reproduksi (FSH/LH), dan neurohipofisis (Oksitosin & ADH antidiuretik pengatur reabsorpsi air ginjal).\n" +
                "   • Regulasi Umpan Balik Negatif (*Negative Feedback*): Menjaga stabilitas variabel fisiologis (misal: glukosa darah 70–100 mg/dL dikendalikan duo antagonis Insulin dan Glukagon pulau Langerhans pankreas).\n\n" +
                "3. Sistem Imunitas Tubuh:\n" +
                "   A. Imunitas Bawaan Non-Spesifik (*Innate Immunity*):\n" +
                "      • Lapis 1: Kulit berlapis keratin, mukosa lendir, asam lambung HCl (pH ~2), dan enzim lisozim air mata.\n" +
                "      • Lapis 2: Sel Fagosit (Makrofag & Neutrofil), Sel Pembunuh Alami (Natural Killer / NK cell), Respons Inflamasi (pelepasan Histamin oleh sel mast melebarkan kapiler darah), dan Sistem Komplemen pelisis dinding bakteri.\n" +
                "   B. Imunitas Adaptif Spesifik (*Adaptive Immunity*):\n" +
                "      • Imunitas Seluler (Sel T / Limfosit T matang di Timus):\n" +
                "        - Sel T Helper (CD4+): Konduktor utama alarm sistemik, mensekresi sitokin interleukin untuk mengaktifkan sel B dan makrofag.\n" +
                "        - Sel T Sitotoksik (CD8+): Menghancurkan sel tubuh yang terinfeksi virus atau sel kanker dengan menyuntikkan protein perforin (melubangi membran) dan granzim (memicu apoptosis bunuh diri sel).\n" +
                "      • Imunitas Humoral (Sel B / Limfosit B matang di Sumsum Tulang):\n" +
                "        - Sel B berdiferensiasi menjadi Sel Plasma yang memproduksi jutaan molekul Antibodi (Imunoglobulin: IgG, IgM, IgA, IgE, IgD) yang mengikat antigen spesifik untuk netralisasi, aglutinasi gumpalan, dan opsonisasi penanda fagositosis.\n" +
                "      • Memori Imunologis: Membentuk Sel T Memori dan Sel B Memori yang bertahan seumur hidup. Saat terjadi infeksi sekunder, respon antibodi diproduksi kilat berlipat ganda, mendasari prinsip kerja Imunisasi Vaksin.",
        intuitionPoints = listOf(
            "Virus HIV menyerang dan menghancurkan secara spesifik Sel T Helper (CD4+); runtuhnya sel konduktor ini melumpuhkan seluruh sistem pertahanan adaptif tubuh hingga pasien menderita AIDS.",
            "Diabetes Melitus Tipe 1 adalah penyakit autoimun di mana sel limfosit tubuh keliru mengenali dan menghancurkan sel beta pankreas sendiri, sehingga tubuh berhenti memproduksi hormon insulin mutlak.",
            "Antibodi maternal IgG adalah satu-satunya imunoglobulin yang mampu menembus plasenta ibu hamil untuk memberi kekebalan pasif alami bagi bayi baru lahir selama 6 bulan pertama."
        ),
        simId = "sim-immune-neural",
        formulas = listOf(
            FormulaCard(
                symbol = "E_m",
                equation = "E_m = \\frac{RT}{F} \\ln \\left( \\frac{P_{\\text{K}}[\\text{K}^+]_{\\text{out}} + P_{\\text{Na}}[\\text{Na}^+]_{\\text{out}} + P_{\\text{Cl}}[\\text{Cl}^-]_{\\text{in}}}{P_{\\text{K}}[\\text{K}^+]_{\\text{in}} + P_{\\text{Na}}[\\text{Na}^+]_{\\text{in}} + P_{\\text{Cl}}[\\text{Cl}^-]_{\\text{out}}} \\right)",
                meaning = "Persamaan Goldman-Hodgkin-Katz (GHK) untuk potensial membran istirahat sel saraf.",
                units = "mV (milivolt)",
                applicationNote = "Pada potensial istirahat, permeabilitas membran terhadap ion kalium PK jauh lebih besar daripada PNa, menghasilkan tegangan netto -70 mV."
            ),
            FormulaCard(
                symbol = "\\text{Titer Antibodi}",
                equation = "\\log_2(\\text{Titer}) \\propto \\text{Respon Imun Sekunder} \\gg \\text{Respon Primer}",
                meaning = "Peningkatan eksponensial konsentrasi antibodi serum darah pada pajanan antigen kedua (vaksin booster).",
                units = "titer pengenceran serum",
                applicationNote = "Respon sekunder menghasilkan konsentrasi antibodi IgG hingga 100 kali lebih tinggi dengan masa bertahan jauh lebih lama."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Protokol Skrining Antibodi Netralisasi Vaksin Meningitis Meningokokus Jamaah Haji di Kemenkes RI",
            context = "Arab Saudi mewajibkan seluruh jamaah haji dan umrah internasional memiliki kekebalan aktif terhadap bakteri Neisseria meningitidis untuk mencegah epidemi meningitis selaput otak global.",
            engineeringProblem = "Memastikan vaksinasi konjugat kuadrivalen (ACYW-135) menghasilkan titer antibodi bakterisidal serum (SBA) protektif minimal 1:8 sebelum keberangkatan.",
            physicalConceptUsed = "Aplikasi imunologi adaptif: antigen polisakarida kapsul bakteri dikonjugasikan dengan protein pembawa toksoid difteri untuk menginduksi aktivasi sel T helper dan pembentukan sel B memori jangka panjang.",
            mathematicalModel = "Uji Enzyme-Linked Immunosorbent Assay (ELISA) mengukur densitas optik spektrofotometri pembacaan kompleks antigen-antibodi berlabel enzim peroksidase.",
            realWorldImpact = "Melindungi lebih dari 220.000 jamaah haji Indonesia setiap tahun dari wabah radang selaput otak mematikan dengan nol kasus fatal transmisi di tanah suci.",
            relatedCareers = listOf("Spesialis Imunologi Klinis", "Epidemiolog Kesehatan Haji Internasional", "Analis Biofarmasi Serologi"),
            verifiedSource = "Pusat Kesehatan Haji Kementerian Kesehatan RI & WHO International Travel and Health."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Waktu Reaksi Saraf Refleks Menangkap Penggaris Jatuh Bebas",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 buah penggaris panjang 30 cm dari bahan plastik kaku",
                "Teman atau anggota keluarga sebagai penguji",
                "Tabel konversi rumus fisika gerak jatuh bebas",
                "Kertas catatan catatan data"
            ),
            steps = listOf(
                "Langkah 1: Duduk tegak di kursi dengan tangan diletakkan di tepi meja, buka ibu jari dan jari telunjuk membentuk celah selebar 3 cm.",
                "Langkah 2: Teman memegang penggaris 30 cm secara vertikal tepat di atas celah jarimu dengan angka 0 cm sejajar ujung jarimu.",
                "Langkah 3: Tanpa memberi aba-aba suara, teman melepaskan penggaris jatuh bebas ke bawah; tugasmu adalah menjepit menangkap penggaris tersebut secepat mungkin!",
                "Langkah 4: Catat angka centimeter pada penggaris di mana jarimu berhasil menjepitnya (misal: d = 15 cm). Lakukan ulangan 5 kali dan hitung rata-ratanya.",
                "Langkah 5: Hitung waktu reaksi transmisi sarafmu menggunakan rumus fisika jatuh bebas: t = akar(2d / g). Dengan g = 980 cm/s², jika d = 15 cm, maka waktu refleks sarafmu t = akar(30 / 980) ≈ 0,175 detik (175 milidetik)!"
            ),
            observationGoal = "Mengukur waktu transmisi impuls elektrokimiawi mulai dari fotoreseptor retina mata melintasi saraf optik, pengolahan korteks otak, hingga perintah motorik otot jari tangan.",
            connectionToSimulation = "Bandingkan kecepatan refleksmu dengan grafik propagasi potensial aksi saraf pada simulator di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-regulasi-1",
                prompt = "Peristiwa depolarisasi pada membran akson sel saraf yang mengawali terbentuknya gelombang potensial aksi dipicu oleh...",
                type = "multiple_choice",
                options = listOf(
                    "Membukanya kanal Na⁺ berpintu voltase sehingga ion Na⁺ membanjiri masuk ke dalam sel",
                    "Keluarnya ion K⁺ secara deras meninggalkan sitoplasma sel",
                    "Berhentinya kerja enzim ATP Sintase secara total",
                    "Penebalan selubung mielin secara mendadak"
                ),
                correctAnswer = "Membukanya kanal Na⁺ berpintu voltase sehingga ion Na⁺ membanjiri masuk ke dalam sel",
                hints = listOf(
                    "Membalikkan muatan dalam sel dari negatif (-70 mV) menjadi positif (+30 mV).",
                    "Ion bermuatan positif menyerbu masuk melintasi membran."
                ),
                explanation = "Depolarisasi terjadi ketika membran mencapai potensial ambang batas, memicu pembukaan kanal ion Na⁺ berpintu voltase secara serentak sehingga ion natrium menyerbu masuk menuruni gradien konsentrasi dan elektrokimia, membalikkan potensial menjadi positif (+30 mV).",
                misconception = "Mengira depolarisasi disebabkan oleh keluarnya kalium (keluarnya kalium menyebabkan repolarisasi kembali negatif)."
            ),
            QuizQuestion(
                id = "q-regulasi-2",
                prompt = "Sel sistem imun adaptif yang bertugas secara spesifik memproduksi dan mensekresikan jutaan molekul antibodi bebas ke dalam cairan darah dan getah bening adalah...",
                type = "multiple_choice",
                options = listOf("Sel Plasma (Diferensiasi dari Sel Limfosit B)", "Sel T Sitotoksik (CD8+)", "Sel Makrofag", "Eritrosit"),
                correctAnswer = "Sel Plasma (Diferensiasi dari Sel Limfosit B)",
                hints = listOf(
                    "Merupakan pabrik penghasil molekul imunoglobulin.",
                    "Berasal dari aktivasi sel limfosit B oleh antigen."
                ),
                explanation = "Ketika limfosit B diaktifkan oleh antigen yang cocok dengan bantuan sel T helper, sel B berproliferasi dan berdiferensiasi menjadi Sel Plasma yang memproduksi ribuan molekul antibodi spesifik per detik.",
                misconception = "Menyamakan fungsi sel plasma dengan sel T sitotoksik (sel T sitotoksik membunuh sel inang secara kontak fisik langsung tanpa mensekresi antibodi)."
            )
        )
    )

    // =========================================================================
    // 13. DINAMIKA POPULASI, SUKSESI EKOLOGIS & SIKLUS BIOGEOKIMIA
    // =========================================================================
    private val ekologiPopulasiLesson = LessonData(
        conceptId = "bio-ekologi-populasi",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pep1",
                panelNumber = 1,
                title = "Kelahiran Pulau Anak Krakatau",
                caption = "Kakek menunjukkan foto sejarah letusan dahsyat Gunung Krakatau 1883 di Selat Sunda.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Letusan 1883 menyapu bersih seluruh kehidupan di pulau, meninggalkannya sebagai tumpukan batu lava steril tanpa tanah. Tapi dari batu gundul itu, alam memulai lembaran baru: Suksesi Primer!",
                sceneVisualEmoji = "🌋",
                sceneDescription = "Pulau vulkanik baru muncul dari laut dengan hamparan batu lava hitam steril."
            ),
            StoryPanel(
                id = "pep2",
                panelNumber = 2,
                title = "Pelopor Lumut Kerak & Hutan Klimaks",
                caption = "Dimas menelusuri garis waktu kolonisasi vegetasi.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Spora lumut kerak (liken) dan lumut perintis melapukkan batu jadi tanah tipis. Setelah tanah terbentuk, biji paku dan rumput tumbuh, disusul semak belukar, hingga kini menjadi Hutan Hujan Tropis Klimaks lebat!",
                sceneVisualEmoji = "🌱",
                sceneDescription = "Suksesi bertahap dari lumut perintis melapukkan batu hingga membentuk hutan lebat."
            ),
            StoryPanel(
                id = "pep3",
                panelNumber = 3,
                title = "Kurva Logistik & Batas Daya Dukung (K)",
                caption = "Kirana menggambar grafik pertumbuhan populasi rusa di padang rumput.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Awalnya populasi melonjak eksponensial (Kurva J)! Namun saat makanan dan ruang terbatas, laju pertumbuhan melambat membentuk Kurva S (Logistik) stabil tepat di garis Daya Dukung Lingkungan (K)!",
                sceneVisualEmoji = "📈",
                sceneDescription = "Grafik pertumbuhan logistik bentuk S mencapai kesetimbangan pada garis batas kapasitas K."
            ),
            StoryPanel(
                id = "pep4",
                panelNumber = 4,
                title = "Siklus Biogeokimia: Daur Abadi Karbon & Nitrogen",
                caption = "Kakek merangkum perputaran materi biosfer bumi.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Atom karbon di tubuh kita mungkin pernah menjadi bagian dari pohon purba jutaan tahun lalu! Melalui siklus biogeokimia karbon, nitrogen fiksasi bakteri, fosfor, dan air: materi di bumi abadi didaur ulang!",
                sceneVisualEmoji = "🔄",
                sceneDescription = "Bagan perputaran siklus karbon dan nitrogen menghubungkan atmosfer, tanah, dan biosfer."
            )
        ),
        intuitionTitle = "Dinamika Biosfer: Matematika Populasi & Daur Materi Global",
        intuitionBody = "Ekologi kuantitatif mempelajari interaksi dinamis antara kelimpahan populasi organisme dengan daya dukung lingkungan serta perputaran siklus materi anorganik di biosfer.\n\n" +
                "1. Model Pertumbuhan Populasi Organisme:\n" +
                "   • Pertumbuhan Eksponensial (Kurva J): Terjadi pada lingkungan ideal tanpa batas sumber daya (dN/dt = rN). Laju pertumbuhan populasi berlipat ganda secara proporsional terhadap ukuran populasi saat ini.\n" +
                "   • Pertumbuhan Logistik (Kurva S Verhulst): Terjadi di alam nyata saat sumber daya terbatas (dN/dt = rN(1 - N/K)), di mana K adalah Daya Dukung Lingkungan (*Carrying Capacity*). Populasi melambat saat N mendekati K dan mencapai kesetimbangan dinamis.\n" +
                "   • Strategi Hidup r vs K:\n" +
                "     - Seleksi r (Oportunis): Ukuran tubuh kecil, reproduksi kilat, keturunan berjumlah banyak tanpa pengasuhan induk, mortalitas anak tinggi (contoh: nyamuk, bakteri, gulma).\n" +
                "     - Seleksi K (Keseimbangan): Ukuran tubuh besar, reproduksi lambat, keturunan sedikit dengan pengasuhan intensif berumur panjang mendekati kapasitas K (contoh: gajah, orangutan, manusia).\n\n" +
                "2. Suksesi Ekologis (Perkembangan Komunitas Sepanjang Waktu):\n" +
                "   • Suksesi Primer: Dimulai dari substrat steril tandus tanpa sisa tanah kehidupan sebelumnya (contoh: pulau lava baru Gunung Anak Krakatau, tanah pasca gletser mencair). Diawali vegetasi perintis (Lichen / Lumut Kerak pemecah batu) → Lumut → Paku & Rumput → Semak herba → Pohon peneduh → Komunitas Klimaks Hutan Seimbang.\n" +
                "   • Suksesi Sekunder: Terjadi pada habitat yang mengalami kerusakan parah tetapi tanah dasarnya masih utuh dan menyimpan benang biji/rizoma (contoh: hutan bekas kebakaran hutan atau bekas ladang berpindah).\n\n" +
                "3. Siklus Biogeokimia Global:\n" +
                "   • Siklus Karbon: Fiksasi CO₂ atmosfer via fotosintesis produsen autotrof → Konsumsi rantai makanan → Respirasi seluler dan dekomposisi melepaskan kembali gas CO₂. Penimbunan materi organik purba menghasilkan batubara dan minyak bumi.\n" +
                "   • Siklus Nitrogen: \n" +
                "     1. Fiksasi Nitrogen: Pengikatan gas N₂ atmosfer yang inert oleh bakteri simbiotik (*Rhizobium* pada bintil akar polong) dan bakteri bebas (*Azotobacter*, sianobakteri) menjadi Amonium (NH₄⁺).\n" +
                "     2. Nitrifikasi: Oksidasi amonium menjadi Nitrit (NO₂⁻) oleh bakteri *Nitrosomonas*, lalu menjadi Nitrat (NO₃⁻) oleh bakteri *Nitrobacter* (bentuk ion yang diserap akar tumbuhan).\n" +
                "     3. Asimilasi & Amonifikasi: Sintesis asam amino tanaman dan penguraian jasad mati oleh dekomposer.\n" +
                "     4. Denitrifikasi: Bakteri anaerob (*Pseudomonas denitrificans*) mereduksi nitrat kembali menjadi gas N₂ ke atmosfer.",
        intuitionPoints = listOf(
            "Meskipun gas Nitrogen (N₂) menyusun 78% volume atmosfer bumi, tidak ada satu pun hewan atau tumbuhan tingkat tinggi yang mampu menghirup atau memanfaatkannya langsung tanpa bantuan bakteri penambat nitrogen!",
            "Daur Fosfor adalah satu-satunya siklus biogeokimia utama yang TIDAK MEMILIKI FASE GAS di atmosfer; fosfor murni berputar melalui pelapukan batuan sedimen fosfat di kerak bumi dan lautan.",
            "Lahan gambut tropis basah di Indonesia adalah penyimpan cadangan karbon raksasa (*carbon sink*); mengeringkan gambut memicu dekomposisi aerob yang melepaskan miliaran ton emisi gas rumah kaca ke atmosfer."
        ),
        simId = "sim-population-ecology",
        formulas = listOf(
            FormulaCard(
                symbol = "\\frac{dN}{dt}",
                equation = "\\frac{dN}{dt} = r \\cdot N \\left( 1 - \\frac{N}{K} \\right)",
                meaning = "Model Persamaan Pertumbuhan Populasi Logistik Pierre François Verhulst.",
                units = "individu / satuan waktu",
                applicationNote = "N adalah ukuran populasi, r laju pertumbuhan intrinsik per kapita, K adalah daya dukung carrying capacity lingkungan."
            ),
            FormulaCard(
                symbol = "t_{\\text{double}}",
                equation = "t_{\\text{double}} = \\frac{\\ln 2}{r} \\approx \\frac{0{,}693}{r}",
                meaning = "Waktu penggandaan populasi eksponensial (Doubling Time).",
                units = "satuan waktu (hari / tahun)",
                applicationNote = "Jika laju pertumbuhan intrinsik bakteri r = 0,0347 per menit, populasi akan mengganda setiap 20 menit."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemulihan Hidrologis dan Restorasi Karbon Lahan Gambut Tropis di Riau oleh BRGM",
            context = "Kanalisasi drainase perkebunan di lahan gambut Riau menurunkan muka air tanah drastis, memicu kebakaran hutan lahan gambut (karhutla) dan pelepasan jutaan ton emisi karbon dioksida.",
            engineeringProblem = "Mengembalikan kondisi hidrologis lahan gambut terdegradasi agar tetap basah dan mencegah oksidasi dekomposisi biomassa gambut.",
            physicalConceptUsed = "Pendekatan ekologi restorasi 3R (Rewetting, Revegetasi, Revitalisasi): pembangunan 1.200 unit sekat kanal (canal blocking) terpasang sensor telemetri pemantau tinggi muka air tanah otomatis (TMAT).",
            mathematicalModel = "Mempertahankan muka air tanah kurang dari 40 cm di bawah permukaan gambut untuk menekan laju emisi karbon dioksida hingga 70% dan menstimulasi suksesi sekunder vegetasi ramin dan jelutung rawa.",
            realWorldImpact = "Mencegah karhutla berulang di areal seluas 250.000 hektar gambut dan mengembalikan keanekaragaman hayati flora endemik rawa air hitam Sumatra.",
            relatedCareers = listOf("Spesialis Restorasi Ekologi Lahan Basah", "Insinyur Hidrologi Gambut", "Peneliti Neraca Karbon Global"),
            verifiedSource = "Badan Restorasi Gambut dan Mangrove (BRGM) RI & Balai Riset Rawa Tropis Kementerian LHK."
        ),
        homeLab = HomeLabData(
            title = "Membuat Model Miniatur Siklus Air, Karbon & Efek Rumah Kaca dalam Stoples Kaca",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "2 buah stoples kaca bening berukuran sama (Stoples A dan Stoples B)",
                "2 buah termometer ruangan kecil",
                "Tanah subur dan sedikit tanaman kecil",
                "1 cangkir air soda berkarbonasi (sumber CO₂ pekat untuk Stoples B)",
                "Lampu meja belajar 60 Watt atau sinar terik matahari"
            ),
            steps = listOf(
                "Langkah 1: Masukkan tanah subur dan 1 tanaman kecil yang sama ke dalam Stoples A dan Stoples B.",
                "Langkah 2: Letakkan 1 termometer di dalam masing-masing toples dengan posisi skala suhu menghadap keluar agar mudah dibaca.",
                "Langkah 3: Tuangkan 2 sendok makan air biasa ke Stoples A (atmosfer udara normal). Tuangkan 2 sendok makan air soda berkarbonasi ke Stoples B (simulasi atmosfer tinggi gas rumah kaca CO₂).",
                "Langkah 4: Tutup rapat kedua toples kedap udara, lalu tempatkan kedua toples berdampingan di bawah sinar lampu meja terang dari jarak 25 cm.",
                "Langkah 5: Catat suhu setiap 10 menit selama 40 menit: amati bagaimana Stoples B memerangkap panas radiasi inframerah lebih tinggi (+2 hingga +4°C lebih hangat daripada Stoples A) membuktikan efek gas rumah kaca pada neraca iklim bumi!"
            ),
            observationGoal = "Mengamati secara empiris kemampuan molekul gas rumah kaca dalam menyerap dan memerangkap radiasi panas pada sistem biosfer tertutup.",
            connectionToSimulation = "Bandingkan perubahan suhumu dengan grafik siklus biogeokimia global pada simulator di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-populasi-1",
                prompt = "Bakteri yang berperan mengoksidasi senyawa nitrit (NO₂⁻) menjadi nitrat (NO₃⁻) yang siap diserap oleh perakaran tumbuhan pada siklus nitrogen adalah...",
                type = "multiple_choice",
                options = listOf("Bakteri Nitrobacter", "Bakteri Nitrosomonas", "Bakteri Rhizobium", "Bakteri Pseudomonas denitrificans"),
                correctAnswer = "Bakteri Nitrobacter",
                hints = listOf(
                    "Tahap kedua dari proses nitrifikasi.",
                    "Nama ilmiahnya memiliki akhiran 'bacter'."
                ),
                explanation = "Bakteri *Nitrobacter* bertugas mengoksidasi nitrit (NO₂⁻) menjadi nitrat (NO₃⁻). Sebaliknya, *Nitrosomonas* bertugas mengubah amonium menjadi nitrit.",
                misconception = "Tertukar antara peran *Nitrosomonas* (pembentuk nitrit) dan *Nitrobacter* (pembentuk nitrat)."
            ),
            QuizQuestion(
                id = "q-populasi-2",
                prompt = "Pada persamaan pertumbuhan populasi logistik dN/dt = rN(1 - N/K), apakah yang akan terjadi pada laju pertumbuhan populasi ketika cacah jumlah individu (N) sudah sama persis dengan daya dukung lingkungan (K)?",
                type = "multiple_choice",
                options = listOf(
                    "Laju pertumbuhan populasi menjadi nol (dN/dt = 0) dan ukuran populasi berada pada kesetimbangan stabil",
                    "Populasi seketika punah menjadi nol",
                    "Laju pertumbuhan melonjak menjadi tak terhingga",
                    "Kapasitas daya dukung K berlipat ganda secara otomatis"
                ),
                correctAnswer = "Laju pertumbuhan populasi menjadi nol (dN/dt = 0) dan ukuran populasi berada pada kesetimbangan stabil",
                hints = listOf(
                    "Masukkan nilai N = K ke dalam rumus.",
                    "Hitung nilai dari (1 - K/K) = (1 - 1) = 0."
                ),
                explanation = "Ketika ukuran populasi N mencapai daya dukung K, nilai faktor pembatas (1 - N/K) menjadi (1 - 1) = 0, sehingga laju pertumbuhan dN/dt = 0. Artinya, jumlah kelahiran seimbang dengan jumlah kematian sehingga populasi stabil.",
                misconception = "Mengira populasi langsung punah drastis."
            )
        )
    )

    // =========================================================================
    // 14. BIOTEKNOLOGI MODERN: REKAYASA GENETIKA, KULTUR JARINGAN & PCR
    // =========================================================================
    private val bioteknologiLesson = LessonData(
        conceptId = "bio-bioteknologi",
        level = DepthLevel.L3,
        storyPanels = listOf(
            StoryPanel(
                id = "pbt1",
                panelNumber = 1,
                title = "Aroma Harum Tempe & Ragi",
                caption = "Kakek mengajak Kirana dan Dimas sarapan tempe mendoan hangat di beranda rumah.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Tempe adalah mahakarya bioteknologi asli warisan leluhur Nusantara! Bangsa kita sudah menguasai fermentasi kapang mikroba ratusan tahun sebelum istilah bioteknologi diciptakan dunia!",
                sceneVisualEmoji = "🥢",
                sceneDescription = "Tempe mendoan hangat yang diselimuti hifa putih halus kapang Rhizopus oryzae."
            ),
            StoryPanel(
                id = "pbt2",
                panelNumber = 2,
                title = "Mikroorganisme sebagai Mesin Hayati",
                caption = "Dimas menunjukkan bungkusan ragi tempe dan ragi tapai.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Pada Bioteknologi Konvensional, kita memanfaatkan kapang Rhizopus oryzae dan khamir Saccharomyces secara langsung untuk mengubah kedelai dan singkong menjadi makanan lezat bergizi tinggi!",
                sceneVisualEmoji = "🧫",
                sceneDescription = "Kultur ragi kapang dan bakteri fermentasi yang bekerja memecah nutrisi makanan."
            ),
            StoryPanel(
                id = "pbt3",
                panelNumber = 3,
                title = "Gunting & Lem Molekuler DNA",
                caption = "Kirana membaca artikel ilmiah tentang insulin manusia rekombinan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dan di Bioteknologi Modern, ilmuwan tidak hanya memakai mikroba biasa, tapi memodifikasi materi genetiknya! Gen insulin manusia disisipkan ke dalam plasmid bakteri!",
                sceneVisualEmoji = "✂️",
                sceneDescription = "Enzim restriksi memotong plasmid DNA melingkar untuk disisipi gen target terapeutik."
            ),
            StoryPanel(
                id = "pbt4",
                panelNumber = 4,
                title = "Masa Depan Kesehatan & Pangan",
                caption = "Kakek tersenyum bangga melihat antusiasme kedua cucunya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Mulai dari vaksin modern, tanaman tahan kekeringan, hingga terapi gen CRISPR: bioteknologi adalah kunci masa depan peradaban manusia yang berkelanjutan!",
                sceneVisualEmoji = "💉",
                sceneDescription = "Laboratorium bioteknologi modern menghasilkan vaksin dan bibit tanaman masa depan."
            )
        ),
        intuitionTitle = "Dua Era Bioteknologi: Dari Ragi Tempe hingga Rekayasa Genom",
        intuitionBody = "Bioteknologi adalah pemanfaatan prinsip-prinsip sains biologi, mikrobiologi, dan rekayasa genetika terhadap organisme hidup untuk menghasilkan produk bernilai guna bagi kesejahteraan manusia.\n\n" +
                "1. Bioteknologi Konvensional (Tradisional):\n" +
                "   • Menggunakan mikroorganisme utuh (bakteri, jamur/kapang, khamir) secara langsung melalui proses fermentasi biokimia.\n" +
                "   • Peralatan sederhana tanpa mengubah struktur materi genetik mikroorganisme.\n" +
                "   • Contoh Penerapan: Tempe (*Rhizopus oryzae*), Tapai & Roti (*Saccharomyces cerevisiae*), Yogurt (*Lactobacillus bulgaricus*), Nata de Coco (*Acetobacter xylinum*).\n\n" +
                "2. Bioteknologi Modern:\n" +
                "   • Melibatkan manipulasi tingkat molekuler terhadap untai DNA organisme (Rekayasa Genetika / DNA Rekombinan).\n" +
                "   • Perangkat Kunci: Enzim Restriksi Endonuklease (gunting molekuler pemotong sekuens palindrom spesifik), DNA Ligase (lem molekuler penyambung fragmen DNA), Vektor Kloning (Plasmid sirkular bakteri), dan Mesin Thermal Cycler PCR.\n" +
                "   • Contoh Penerapan:\n" +
                "     - Produksi Hormon Insulin Rekombinan: Menyisipkan gen insulin manusia ke dalam plasmid bakteri *Escherichia coli*.\n" +
                "     - Kultur Jaringan Tumbuhan: Menumbuhkan jutaan bibit klon identik dari eksplan meristem berdasarkan sifat Totipotensi Sel.\n" +
                "     - Tanaman Transgenik (GMO): Jagung Bt tahan ulat penggerek batang (mengandung gen endotoksin *Bacillus thuringiensis*) dan Padi Emas (Golden Rice) penghasil provitamin A beta-karoten.\n" +
                "     - Teknik PCR (Polymerase Chain Reaction): Melipatgandakan sekuens DNA target hingga miliaran salinan dalam 30 siklus termal (Denaturasi 95°C, Annealing penempelan primer 55°C, dan Ekstensi DNA polimerase Taq 72°C), divisualisasikan dengan elektroforesis gel agarosa.",
        intuitionPoints = listOf(
            "Enzim Taq Polimerase yang digunakan pada mesin PCR di seluruh dunia diisolasi dari bakteri termofilik *Thermus aquaticus* yang hidup di mata air panas mendidih Yellowstone!",
            "Kultur jaringan memungkinkan perbanyakan bibit tanaman bebas virus dalam ruang steril tanpa bergantung pada musim tanam konvensional.",
            "Teknologi CRISPR-Cas9 memungkinkan ilmuwan mengedit susunan nukleotida DNA dengan presisi tingkat atom mirip fungsi 'find and replace' pada pengolah kata."
        ),
        simId = "sim-biotech",
        formulas = listOf(
            FormulaCard(
                symbol = "N_t",
                equation = "N_t = N_0 \\times 2^{t/g}",
                meaning = "Pertumbuhan eksponensial populasi mikroba fermentasi (g = waktu generasi pembelahan).",
                units = "jumlah sel bakteri",
                applicationNote = "Jika waktu generasi E. coli 20 menit, 1 bakteri membelah menjadi > 1 miliar bakteri dalam waktu 10 jam."
            ),
            FormulaCard(
                symbol = "N_{\\text{PCR}}",
                equation = "N = N_0 \\times 2^n",
                meaning = "Penggandaan molekul DNA target setelah n siklus termal Polymerase Chain Reaction.",
                units = "salinan molekul DNA",
                applicationNote = "Setelah 30 siklus termal PCR (n = 30), 1 molekul DNA menghasilkan 2³⁰ ≈ 1.073.741.824 salinan murni."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Produksi Hormon Insulin Manusia Rekombinan di PT Bio Farma Bandung",
            context = "Lebih dari 19 juta penduduk Indonesia mengidap diabetes melitus dan banyak yang bergantung pada suntikan hormon insulin harian untuk bertahan hidup.",
            engineeringProblem = "Di masa lalu, insulin diekstraksi dari pankreas sapi atau babi dengan biaya mahal, pasokan terbatas, dan risiko alergi imunologis serta kendala kehalalan.",
            physicalConceptUsed = "Teknologi DNA Rekombinan: gen pengkode rantai peptida insulin manusia disintesis dan disisipkan ke dalam vektor plasmid bakteri *Escherichia coli* atau ragi *Pichia pastoris*.",
            mathematicalModel = "Bioreaktor fermentor terotomasi volume 5.000 liter mengendalikan suhu 37°C, pH 6,8, dan oksigen terlarut terukur. Bakteri transgenik memproduksi insulin identik 100% dengan insulin alami tubuh manusia.",
            realWorldImpact = "Menjamin kemandirian obat nasional, memangkas impor bahan baku farmasi hingga 70%, dan menghasilkan insulin halal bermutu tinggi dengan harga terjangkau bagi masyarakat Indonesia.",
            relatedCareers = listOf("Insinyur Bioproses Farmasi", "Peneliti Rekayasa Protein & Biologi Molekuler", "Spesialis Kontrol Kualitas Biofarmasi"),
            verifiedSource = "PT Bio Farma (Persero) & Badan Pengawas Obat dan Makanan (BPOM) RI."
        ),
        homeLab = HomeLabData(
            title = "Fermentasi Ragi Roti/Tapai: Melihat Produksi Gas Karbondioksida & Aroma Alkohol",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 bungkus ragi instan (Saccharomyces cerevisiae - sering dijual untuk bahan kue donat)",
                "2 botol plastik bekas 330 ml (Botol 1 dan Botol 2)",
                "Air hangat suam-suam kuku (sekitar 35-40°C)",
                "2 sendok makan gula pasir murni",
                "2 buah balon karet"
            ),
            steps = listOf(
                "Langkah 1: Isi Botol 1 dan Botol 2 dengan air hangat suam-suam kuku hingga setengah botol.",
                "Langkah 2: Masukkan 1 sendok teh ragi instan ke Botol 1 (hanya ragi dan air hangat tanpa gula).",
                "Langkah 3: Masukkan 1 sendok teh ragi instan DAN 2 sendok makan gula pasir ke Botol 2 (ragi + makanan gula). Kocok perlahan.",
                "Langkah 4: Pasang mulut balon karet ke masing-masing bibir botol.",
                "Langkah 5: Letakkan di tempat hangat selama 20–30 menit. Amati: Balon pada Botol 2 mengembang besar terisi gas CO₂ dan timbul busa tebal serta aroma harum tapai, sedangkan Balon 1 tetap kempis karena ragi tidak punya glukosa untuk difermentasikan!"
            ),
            observationGoal = "Membuktikan respirasi anaerob fermentasi alkohol khamir: glukosa dipecah menjadi etanol harum dan gas karbondioksida (CO₂) yang meniup balon.",
            connectionToSimulation = "Bandingkan aktivitas fermentasi ragi dengan simulator bioteknologi di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-biot-1",
                prompt = "Manakah dari produk makanan berikut yang merupakan hasil penerapan Bioteknologi Konvensional menggunakan mikroorganisme kapang Rhizopus oryzae?",
                type = "multiple_choice",
                options = listOf("Tempe", "Yogurt", "Nata de Coco", "Keju Mozzarella"),
                correctAnswer = "Tempe",
                hints = listOf(
                    "Makanan tradisional Indonesia berbahan dasar kedelai.",
                    "Kapang membentuk miselium benang putih halus yang mengikat butiran kedelai."
                ),
                explanation = "Tempe dibuat melalui proses fermentasi biji kedelai oleh kapang Rhizopus oryzae atau Rhizopus oligosporus. Yogurt menggunakan bakteri Lactobacillus, sedangkan Nata de Coco menggunakan Acetobacter xylinum.",
                misconception = "Menyamakan kapang tempe dengan khamir roti."
            ),
            QuizQuestion(
                id = "q-biot-2",
                prompt = "Perbedaan paling mendasar antara Bioteknologi Konvensional dan Bioteknologi Modern adalah...",
                type = "multiple_choice",
                options = listOf(
                    "Bioteknologi modern melibatkan rekayasa dan manipulasi materi genetik (DNA), sedangkan konvensional tidak",
                    "Bioteknologi modern tidak menggunakan mikroorganisme sama sekali",
                    "Bioteknologi konvensional hanya dilakukan di dalam rumah sakit besar",
                    "Bioteknologi modern hanya menghasilkan makanan tradisional"
                ),
                correctAnswer = "Bioteknologi modern melibatkan rekayasa dan manipulasi materi genetik (DNA), sedangkan konvensional tidak",
                hints = listOf(
                    "Fokuslah pada tingkat molekuler DNA.",
                    "Bioteknologi modern mampu menyisipkan atau menyunting gen spesifik menggunakan DNA rekombinan."
                ),
                explanation = "Bioteknologi modern ditandai dengan penggunaan rekayasa genetika dan manipulasi DNA terarah (seperti teknologi plasmid, kloning, dan CRISPR), sementara bioteknologi konvensional memanfaatkan mikroorganisme alami apa adanya tanpa modifikasi genom.",
                misconception = "Mengira bioteknologi modern tidak memakai mikroorganisme."
            )
        )
    )
}

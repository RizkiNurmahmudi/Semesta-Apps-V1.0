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

object BiologyLevel2Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "bio-sel",
            domain = Domain.BIOLOGI,
            topic = "Biologi Sel",
            title = "Struktur Sel: Unit Terkecil Kehidupan",
            description = "Perbedaan arsitektur sel tumbuhan vs hewan, membran sel, sitoplasma, inti sel (nukleus), dan mitokondria.",
            level = DepthLevel.L2,
            estMinutes = 14,
            prerequisites = listOf("bio-rantai-makanan")
        ),
        ConceptItem(
            id = "bio-taksonomi",
            domain = Domain.BIOLOGI,
            topic = "Klasifikasi Makhluk Hidup",
            title = "Klasifikasi Makhluk Hidup & Taksonomi Dasar",
            description = "Sistem lima kingdom Whittaker (Monera, Protista, Fungi, Plantae, Animalia), tingkatan takson, tata nama binomial nomenklatur, dan kunci determinasi.",
            level = DepthLevel.L2,
            estMinutes = 14,
            prerequisites = listOf("bio-sel")
        ),
        ConceptItem(
            id = "bio-sistem-organ-manusia",
            domain = Domain.BIOLOGI,
            topic = "Fisiologi Manusia",
            title = "Sistem Organ Manusia & Integrasi Fisiologis",
            description = "Mekanisme terpadu sistem gerak rangka-otot, pencernaan, pernapasan alveolus, peredaran darah ganda tertutup, ekskresi ginjal nefron, dan saraf refleks.",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("bio-sel")
        ),
        ConceptItem(
            id = "bio-fotosintesis",
            domain = Domain.BIOLOGI,
            topic = "Fisiologi Tumbuhan",
            title = "Fotosintesis & Energi Kehidupan",
            description = "Bagaimana klorofil menyerap cahaya matahari, mengubah air dan CO₂ menjadi glukosa dan oksigen.",
            level = DepthLevel.L2,
            estMinutes = 16,
            prerequisites = listOf("bio-sel", "kim-materi-sifat")
        ),
        ConceptItem(
            id = "bio-ekosistem",
            domain = Domain.BIOLOGI,
            topic = "Ekologi Menengah",
            title = "Ekosistem, Jaring Makanan & Aliran Energi",
            description = "Komponen biotik dan abiotik, hierarki individu hingga biosfer, jaring-jaring makanan kompleks, piramida energi 10%, dan siklus interaksi simbiosis.",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("bio-fotosintesis")
        ),
        ConceptItem(
            id = "bio-pewarisan-dasar",
            domain = Domain.BIOLOGI,
            topic = "Genetika Dasar",
            title = "Pewarisan Sifat Dasar: Gen & Kromosom",
            description = "DNA dan kromosom di inti sel, perbedaan fenotipe dan genotipe, sifat dominan, resesif, intermediet, serta persilangan monohibrid Hukum Mendel I.",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("bio-sel")
        ),
        ConceptItem(
            id = "bio-reproduksi",
            domain = Domain.BIOLOGI,
            topic = "Sistem Reproduksi",
            title = "Reproduksi Tumbuhan & Manusia",
            description = "Perkembangbiakan vegetatif alami/buatan dan generatif bunga pada tumbuhan, serta anatomi reproduksi manusia, siklus menstruasi, dan pembentukan zigot.",
            level = DepthLevel.L2,
            estMinutes = 15,
            prerequisites = listOf("bio-pewarisan-dasar")
        ),
        ConceptItem(
            id = "bio-adaptasi-lingkungan",
            domain = Domain.BIOLOGI,
            topic = "Evolusi & Konservasi",
            title = "Adaptasi, Seleksi Alam & Pelestarian Lingkungan",
            description = "Adaptasi morfologi, fisiologi, dan tingkah laku, prinsip seleksi alam kelangsungan hidup spesies, ancaman polusi, serta konservasi in-situ dan ex-situ.",
            level = DepthLevel.L2,
            estMinutes = 14,
            prerequisites = listOf("bio-ekosistem")
        ),
        ConceptItem(
            id = "bio-bioteknologi-dasar",
            domain = Domain.BIOLOGI,
            topic = "Bioteknologi Pangan",
            title = "Bioteknologi Sederhana & Fermentasi Pangan",
            description = "Pemanfaatan mikroorganisme alami dalam fermentasi makanan: Rhizopus pada tempe, Saccharomyces pada roti/tapai, dan Lactobacillus pada yogurt.",
            level = DepthLevel.L2,
            estMinutes = 14,
            prerequisites = listOf("bio-sel")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "bio-sel" -> selLesson
            "bio-taksonomi" -> taksonomiLesson
            "bio-sistem-organ-manusia" -> sistemOrganLesson
            "bio-fotosintesis" -> photosynthesisLesson
            "bio-ekosistem" -> ekosistemLesson
            "bio-pewarisan-dasar" -> pewarisanDasarLesson
            "bio-reproduksi" -> reproduksiLesson
            "bio-adaptasi-lingkungan" -> adaptasiLingkunganLesson
            "bio-bioteknologi-dasar" -> bioteknologiDasarLesson
            else -> null
        }
    }

    // =========================================================================
    // 1. STRUKTUR SEL: UNIT TERKECIL KEHIDUPAN
    // =========================================================================
    private val selLesson = LessonData(
        conceptId = "bio-sel",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "psl1",
                panelNumber = 1,
                title = "Menatap Lewat Lensa Mikroskop",
                caption = "Kirana dan Dimas menyayat selaput transparan umbi bawang merah lalu meletakkannya di atas kaca preparat mikroskop.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Luar biasa! Di bawah perbesaran 400 kali, bawang ini tersusun dari kotak-kotak rapi bersekat tebal seperti batu bata benteng!",
                sceneVisualEmoji = "🔬",
                sceneDescription = "Tampilan mikroskopis sel bawang merah yang tersusun rapi dengan dinding sel yang tegas."
            ),
            StoryPanel(
                id = "psl2",
                panelNumber = 2,
                title = "Kotak Kokoh Sel Tumbuhan",
                caption = "Kakek menjelaskan struktur dinding sel yang membedakan tumbuhan dari manusia dan hewan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kotak kokoh itu adalah Dinding Sel berbahan selulosa! Itu sebabnya batang pohon bisa tegak menjulang puluhan meter menantang angin tanpa memerlukan tulang seperti kita.",
                sceneVisualEmoji = "🧱",
                sceneDescription = "Arsitektur dinding selulosa kaku melindungi sel tumbuhan dan mempertahankan bentuknya."
            ),
            StoryPanel(
                id = "psl3",
                panelNumber = 3,
                title = "Pusat Komando: Nukleus & DNA",
                caption = "Dimas menunjuk bulatan gelap kecil di tengah setiap kompartemen sel bawang.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bintik gelap itu adalah Nukleus (inti sel)! Di dalamnya tersimpan kode rahasia benang DNA yang mengatur seluruh kerja metabolisme dan pembelahan sel!",
                sceneVisualEmoji = "🧬",
                sceneDescription = "Nukleus sel menyimpan kromosom dan instruksi genetik DNA makhluk hidup."
            ),
            StoryPanel(
                id = "psl4",
                panelNumber = 4,
                title = "Pabrik Energi Sel: Mitokondria",
                caption = "Kirana membandingkan sel tumbuhan berkloroplas dengan sel hewan berbadan lentur.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dan di dalam sitoplasma ada Mitokondria, pembangkit tenaga listrik yang membakar glukosa menjadi energi gerak ATP agar sel kita tetap hidup!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Mitokondria berbentuk lonjong menghasilkan energi hayati ATP bagi sel."
            )
        ),
        intuitionTitle = "Arsitektur Seluler: Mesin Mikroskopis Kehidupan",
        intuitionBody = "Sel adalah unit struktural dan fungsional terkecil dari seluruh makhluk hidup di bumi.\n\n" +
                "1. Prinsip Utama Teori Sel (Schleiden, Schwann, & Virchow):\n" +
                "   • Semua makhluk hidup tersusun dari satu sel (uniseluler) atau miliaran sel (multiseluler).\n" +
                "   • Sel adalah unit dasar kehidupan yang mampu menjalankan fungsi biologis mandiri.\n" +
                "   • Semua sel berasal dari pembelahan sel yang sudah ada sebelumnya (omnis cellula e cellula).\n\n" +
                "2. Organel Kunci Sel & Fungsinya:\n" +
                "   • Membran Plasma (Dwilapis Fosfolipid): Pengatur lalu lintas zat masuk/keluar secara selektif permeabel.\n" +
                "   • Sitoplasma: Cairan sitosol tempat organel mengapung dan terjadinya reaksi glikolisis.\n" +
                "   • Nukleus (Inti Sel): Rumah arsip genetik DNA/RNA dan pengendali utama seluruh aktivitas sel.\n" +
                "   • Mitokondria: 'Powerhouse of the cell', tempat respirasi seluler menghasilkan molekul penyimpan energi ATP.\n" +
                "   • Ribosom & Retikulum Endoplasma: Mesin perakit dan penyalur rantai asam amino protein.\n" +
                "   • Badan Golgi: Pusat pengemasan dan distribusi molekul sekretori.\n\n" +
                "3. Perbedaan Kritis Sel Hewan vs Sel Tumbuhan:\n" +
                "   • Sel Tumbuhan: Memiliki Dinding Sel (selulosa kaku), Kloroplas (fotosintesis), dan Vakuola sentral raksasa penyimpan turgor air.\n" +
                "   • Sel Hewan: Tidak punya dinding sel (fleksibel terlindung membran saja), memiliki Sentriol (pembelahan mitosis), dan Lisosom (pencernaan intraseluler).",
        intuitionPoints = listOf(
            "Mengapa ukuran sel selalu mikroskopis (~10–100 mikrometer)? Karena semakin kecil sel, semakin besar rasio luas permukaan terhadap volume (A/V), sehingga nutrisi dan oksigen berdifusi cepat ke seluruh isi sel!",
            "Tumbuhan tidak layu saat disiram air karena vakuola selnya penuh air, menciptakan Tekanan Turgor yang menekan kuat ke dinding sel.",
            "Sel Prokariotik (seperti bakteri) tidak memiliki membran inti nukleus, sedangkan Sel Eukariotik (hewan, tumbuhan, jamur) memiliki nukleus sejati bermembran."
        ),
        simId = "sim-cell",
        formulas = listOf(
            FormulaCard(
                symbol = "M_{\\text{total}}",
                equation = "M_{\\text{total}} = M_{\\text{okuler}} \\times M_{\\text{objektif}}",
                meaning = "Perbesaran total lensa mikroskop cahaya optik.",
                units = "kali perbesaran (\\times)",
                applicationNote = "Lensa okuler 10× dengan lensa objektif 40× menghasilkan perbesaran bayangan spesimen 400×."
            ),
            FormulaCard(
                symbol = "\\frac{A}{V}",
                equation = "\\frac{A}{V} = \\frac{6}{d} \\quad (\\text{pada sel kubus})",
                meaning = "Rasio luas permukaan membran terhadap volume sel berdiameter d.",
                units = "m⁻¹",
                applicationNote = "Semakin kecil ukuran sel (d kecil), rasio luas permukaan semakin besar, menjamin difusi zat berlangsung kilat."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kultur Jaringan Tanaman Kelapa Sawit Unggul di Balai Riset BRIN Cibinong",
            context = "Bibit kelapa sawit konvensional dari biji memiliki keragaman genetik acak sehingga hasil panen tandan buah segar bervariasi tajam antar-pohon.",
            engineeringProblem = "Industri sawit memerlukan jutaan bibit unggul identik yang tahan kekeringan dan berproduksi minyak 8 ton/ha/tahun dalam waktu singkat.",
            physicalConceptUsed = "Pemanfaatan sifat Totipotensi Sel tumbuhan (kemampuan setiap sel tumbuhan tunggal berdinding selulosa untuk membelah dan berkembang menjadi individu tanaman utuh yang sempurna).",
            mathematicalModel = "Eksplan sel meristem daun sawit diinduksi dalam media gel agar bernutrisi makro-mikro dengan perbandingan hormon auksin dan sitokinin 1:1 untuk memicu pembentukan kalus dan embriogenesis somatik bertingkat.",
            realWorldImpact = "Menghasilkan 100.000 klon bibit sawit unggul bersertifikat per tahun dengan produktivitas minyak 30% lebih tinggi tanpa perlu membuka lahan hutan baru.",
            relatedCareers = listOf("Bioteknolog Kultur Jaringan", "Ahli Fisiologi Seluler Tumbuhan", "Agronom Kelapa Sawit"),
            verifiedSource = "Pusat Riset Bioteknologi BRIN & Pusat Penelitian Kelapa Sawit (PPKS) Medan."
        ),
        homeLab = HomeLabData(
            title = "Mengamati Plasmolisis Sel Tumbuhan Bawang Merah dengan Air Garam",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 siung bawang merah segar",
                "Kaca pembesar (atau kamera smartphone dengan fitur lensa makro/zoom digital)",
                "1 cangkir air putih tawar",
                "1 cangkir larutan garam pekat (2 sendok makan garam dalam setengah gelas air)",
                "Pisau kecil atau cutter (dibantu orang tua) dan tisu"
            ),
            steps = listOf(
                "Langkah 1: Kupas kulit ari ungu terluar bawang merah yang sangat tipis dan transparan.",
                "Langkah 2: Letakkan selaput ungu di atas piring kaca datar, teteskan air tawar bening. Amati di bawah kamera makro: sel tampak montok dan berwarna ungu merata (keadaan turgid).",
                "Langkah 3: Teteskan larutan air garam pekat di atas selaput tersebut dan biarkan selama 5 menit.",
                "Langkah 4: Amati perubahannya: sitoplasma sel berkerut dan isi ungu mengecil menjauhi dinding sel kotak!",
                "Langkah 5: Teteskan kembali air tawar melimpah untuk membilas garam. Amati: sel kembali mengembang montok (Deplasmolisis)!"
            ),
            observationGoal = "Menyaksikan langsung peristiwa osmosis plasmolisis sel: molekul air keluar dari vakuola sel menuju larutan garam hipertonik di luar membran.",
            connectionToSimulation = "Bandingkan gerakan air membran pada simulator struktur sel di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sel-1",
                prompt = "Organel sel yang dijuluki sebagai 'Powerhouse of the Cell' karena berfungsi sebagai tempat respirasi seluler penghasil energi hayati ATP adalah...",
                type = "multiple_choice",
                options = listOf("Mitokondria", "Kloroplas", "Badan Golgi", "Ribosom"),
                correctAnswer = "Mitokondria",
                hints = listOf(
                    "Organel ini bertugas membakar glukosa menjadi energi.",
                    "Bentuknya lonjong dengan membran berlekuk cristae."
                ),
                explanation = "Mitokondria adalah organel respirasi aerobik seluler yang memecah nutrien menghasilkan adenosin trifosfat (ATP) sebagai mata uang energi sel.",
                misconception = "Menyamakan dengan kloroplas (kloroplas membuat glukosa via fotosintesis, bukan memecahnya untuk energi seluler tubuh)."
            ),
            QuizQuestion(
                id = "q-sel-2",
                prompt = "Manakah organel berikut yang HANYA dimiliki oleh sel tumbuhan dan TIDAK ditemukan pada sel hewan?",
                type = "multiple_choice",
                options = listOf("Dinding Sel dan Kloroplas", "Mitokondria dan Nukleus", "Membran Sel dan Ribosom", "Lisosom dan Sentriol"),
                correctAnswer = "Dinding Sel dan Kloroplas",
                hints = listOf(
                    "Organel ini membuat tumbuhan berkulit kaku dan mampu berfotosintesis.",
                    "Sel hewan tidak memiliki lapisan selulosa kaku di luar membrannya."
                ),
                explanation = "Dinding sel berbahan selulosa dan kloroplas berpigmen klorofil adalah ciri khas eksklusif sel tumbuhan. Hewan hanya memiliki membran sel fleksibel tanpa dinding sel.",
                misconception = "Mengira sel hewan juga memiliki dinding sel tipis."
            )
        )
    )

    // =========================================================================
    // 2. KLASIFIKASI MAKHLUK HIDUP & TAKSONOMI DASAR
    // =========================================================================
    private val taksonomiLesson = LessonData(
        conceptId = "bio-taksonomi",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "ptk1",
                panelNumber = 1,
                title = "Menjelajah Kebun Raya Bogor",
                caption = "Kakek mengajak Dimas dan Kirana berkeliling Herbarium Bogoriense melihat ribuan spesimen flora Nusantara.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kakek, di Indonesia ada jutaan jenis tumbuhan, serangga, dan hewan. Bagaimana para ilmuwan bisa mengenali dan membedakan semuanya tanpa tertukar?",
                sceneVisualEmoji = "🌿",
                sceneDescription = "Pohon-pohon raksasa berlabel papan nama ilmiah latin di Kebun Raya Bogor."
            ),
            StoryPanel(
                id = "ptk2",
                panelNumber = 2,
                title = "Lima Kerajaan Kehidupan Whittaker",
                caption = "Kakek memperlihatkan diagram pohon silsilah kehidupan Robert Whittaker.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ilmuwan membagi seluruh kehidupan menjadi 5 Kingdom: Monera (bakteri tanpa membran inti), Protista (alga & protozoa), Fungi (jamur saprofit), Plantae (tumbuhan berklorofil), dan Animalia (hewan bergerak aktif)!",
                sceneVisualEmoji = "👑",
                sceneDescription = "Bagan 5 kingdom membagi makhluk hidup berdasarkan struktur seluler dan cara memperoleh makanan."
            ),
            StoryPanel(
                id = "ptk3",
                panelNumber = 3,
                title = "Bahasa Universal Linnaeus: Binomial Nomenklatur",
                caption = "Kirana membaca plang pohon beringin yang tertulis 'Ficus benjamina'.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Carolus Linnaeus menciptakan sistem tata nama ganda! Kata pertama 'Ficus' adalah Genus dengan huruf kapital, dan kata kedua 'benjamina' adalah penunjuk spesies dengan huruf kecil miring!",
                sceneVisualEmoji = "🏷️",
                sceneDescription = "Tata nama ilmiah binomial dua kata latin berlaku seragam di seluruh dunia."
            ),
            StoryPanel(
                id = "ptk4",
                panelNumber = 4,
                title = "Kunci Determinasi Penemu Identitas",
                caption = "Dimas mencoba mencocokkan ciri daun tak dikenal menggunakan bagan dikotomi bercabang dua.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Dengan Kunci Determinasi dikotomi (1a/1b, 2a/2b), cukup ikuti opsi berpasangan hingga kita sampai pada nama famili atau spesies yang akurat!",
                sceneVisualEmoji = "🔑",
                sceneDescription = "Kunci determinasi dikotomi memandu penentuan spesies langkah demi langkah."
            )
        ),
        intuitionTitle = "Taksonomi: Menyusun Peta Silsilah Keanekaragaman Hayati",
        intuitionBody = "Taksonomi adalah cabang biologi yang bertugas mengidentifikasi, menamai, dan mengelompokkan makhluk hidup berdasarkan persamaan dan perbedaan struktur morfologi, anatomi, fisiologi, serta kekerabatan evolusi.\n\n" +
                "1. Sistem 5 Kingdom Whittaker:\n" +
                "   • Monera: Prokariotik uniseluler tanpa membran inti (bakteri, sianobakteri).\n" +
                "   • Protista: Eukariotik bersel tunggal atau koloni sederhana (Amoeba, Paramecium, alga ganggang).\n" +
                "   • Fungi (Jamur): Eukariotik heterotrof penyerap nutrisi (saprofit/parasit), dinding sel kitin (jamur tempe, ragi, jamur tiram).\n" +
                "   • Plantae (Tumbuhan): Eukariotik multiseluler autotrof berdinding sel selulosa dan berklorofil.\n" +
                "   • Animalia (Hewan): Eukariotik multiseluler heterotrof menelan makanan, bergerak aktif tanpa dinding sel.\n\n" +
                "2. Urutan Tingkatan Takson (Hierarki Taksonomi):\n" +
                "   Domain → Kingdom → Filum (hewan)/Divisi (tumbuhan) → Kelas → Ordo (bangsa) → Famili (suku) → Genus (marga) → Spesies (jenis).\n" +
                "   *Catatan:* Semakin ke bawah (mendekati spesies), persamaan sifat semakin banyak dan jumlah anggotanya semakin sedikit.\n\n" +
                "3. Aturan Tata Nama Ganda (Binomial Nomenclature Linnaeus):\n" +
                "   • Terdiri dari 2 kata bahasa Latin atau yang dilatinkan.\n" +
                "   • Kata I: Genus (diawali huruf kapital, contoh: *Oryza*).\n" +
                "   • Kata II: Penunjuk jenis / epitheton specificum (huruf kecil semua, contoh: *sativa*).\n" +
                "   • Dicetak miring (*italics*) saat diketik, atau digarisbawahi terpisah saat ditulis tangan.",
        intuitionPoints = listOf(
            "Spesies adalah unit dasar taksonomi yang didefinisikan sebagai kelompok individu yang dapat saling kawin silang menghasilkan keturunan yang fertil (subur).",
            "Harimau sumatera (*Panthera tigris sumatrae*) dan singa afrika (*Panthera leo*) memiliki genus yang sama (*Panthera*), membuktikan hubungan kekerabatan yang sangat dekat.",
            "Kunci determinasi dikotomis selalu menyajikan dua pilihan karakteristik yang saling berlawanan di setiap nomor langkah (contoh: 1a. Berspora, 1b. Berbiji)."
        ),
        simId = "sim-taxonomy",
        formulas = listOf(
            FormulaCard(
                symbol = "H'",
                equation = "H' = -\\sum_{i=1}^S p_i \\ln(p_i)",
                meaning = "Indeks Keanekaragaman Spesies Shannon-Wiener ekosistem.",
                units = "tanpa satuan (indeks ekologi)",
                applicationNote = "Nilai H' > 3 menunjukkan keanekaragaman hayati hutan primer yang sangat tinggi dan seimbang."
            ),
            FormulaCard(
                symbol = "IS",
                equation = "IS = \\frac{2C}{A + B} \\times 100\\%",
                meaning = "Indeks Kemiripan Sorensen antara dua komunitas hayati.",
                units = "%",
                applicationNote = "C adalah jumlah spesies yang sama ditemukan di habitat A dan habitat B."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Penemuan & Klasifikasi Spesies Baru Begonia Endemik di Pegunungan Meratus oleh BRIN",
            context = "Hutan hujan tropis karst Pegunungan Meratus Kalimantan Selatan menyimpan ratusan flora unik yang belum terdata dalam katalog botani dunia.",
            engineeringProblem = "Para botanis menemukan populasi tanaman herba liar dengan corak daun unik dan memerlukan pembuktian taksonomi bahwa tanaman tersebut merupakan spesies baru yang belum pernah dideskripsikan.",
            physicalConceptUsed = "Prinsip taksonomi modern: analisis morfometrik mikro daun dan bunga, pencocokan kunci determinasi Herbarium Bogoriense, serta uji sekuensing barcode DNA gen rbcL kloroplas.",
            mathematicalModel = "Mengukur variasi morfologi stomata, jumlah kelopak bunga, dan jarak genetik kladistika filogeni molekuler dengan pohon parsimoni maksimum.",
            realWorldImpact = "Dideskripsikan spesies baru *Begonia meratusensis*, menjadikannya dasar hukum penetapan zonasi kawasan konservasi perlindungan hutan adat dari ancaman tambang batubara.",
            relatedCareers = listOf("Taksonom Tumbuhan / Botanis", "Peneliti Konservasi Herbarium", "Ahli Filogeni Molekuler"),
            verifiedSource = "Pusat Riset Biosistematika dan Evolusi BRIN & Jurnal Ilmiah Reinwardtia."
        ),
        homeLab = HomeLabData(
            title = "Membuat Kunci Determinasi Sederhana Daun Tumbuhan di Pekarangan Rumah",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "5 lembar daun berbeda dari tanaman sekitar (misal: daun mangga, rumput teki, sirih, paku suplir, dan keladi)",
                "Kaca pembesar atau penggaris",
                "Kertas HVS dan spidol"
            ),
            steps = listOf(
                "Langkah 1: Kumpulkan 5 sampel daun berbeda dan beri nomor spesimen 1 sampai 5.",
                "Langkah 2: Amati susunan pertulangan daun: apakah menyirip, menjari, melengkung, atau sejajar.",
                "Langkah 3: Amati tepi daun: rata, bergerigi, atau berlekuk dalam.",
                "Langkah 4: Susun bagan dikotomi berpasangan: \n1a. Pertulangan daun sejajar/melengkung (Lanjut ke 2)\n1b. Pertulangan daun menyirip/menjari (Lanjut ke 3).",
                "Langkah 5: Teruskan percabangan hingga setiap daun teridentifikasi unik pada ujung cabang kunci determinasi!"
            ),
            observationGoal = "Melatih logika pengelompokan taksonomi berdasarkan karakteristik morfologi pembeda yang objektif.",
            connectionToSimulation = "Bandingkan kunci determinasimu dengan pohon silsilah kingdom pada simulator taksonomi!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-taks-1",
                prompt = "Berdasarkan sistem Binomial Nomenclature Linnaeus, penulisan nama ilmiah tanaman padi yang paling benar secara kaidah internasional adalah...",
                type = "multiple_choice",
                options = listOf("Oryza sativa", "oryza Sativa", "Oryza Sativa", "oryza sativa"),
                correctAnswer = "Oryza sativa",
                hints = listOf(
                    "Kata pertama adalah Genus diawali huruf kapital.",
                    "Kata kedua adalah spesies dengan huruf kecil semua.",
                    "Biasanya dicetak miring (*italics*)."
                ),
                explanation = "Aturan binomial nomenklatur mewajibkan huruf pertama kata Genus ditulis kapital (*Oryza*) dan penunjuk spesies ditulis dengan huruf kecil (*sativa*), dicetak miring atau digarisbawahi terpisah.",
                misconception = "Menulis huruf kapital pada kedua kata atau huruf kecil semua."
            ),
            QuizQuestion(
                id = "q-taks-2",
                prompt = "Jamur (Fungi) tidak dimasukkan ke dalam Kingdom Plantae (tumbuhan) melainkan dipisah ke dalam kingdom tersendiri karena jamur...",
                type = "multiple_choice",
                options = listOf(
                    "Tidak memiliki klorofil dan bersifat heterotrof penyerap nutrisi",
                    "Tidak memiliki inti sel (prokariotik)",
                    "Memiliki dinding sel dari selulosa",
                    "Mampu bergerak aktif berpindah tempat seperti hewan"
                ),
                correctAnswer = "Tidak memiliki klorofil dan bersifat heterotrof penyerap nutrisi",
                hints = listOf(
                    "Jamur tidak bisa berfotosintesis menghasilkan makanan sendiri.",
                    "Dinding sel jamur tersusun atas kitin, bukan selulosa."
                ),
                explanation = "Jamur bersifat eukariotik heterotrof tanpa klorofil, menyerap makanan dari sisa materi organik (saprofit/parasit), dan dinding selnya tersusun atas zat kitin, berbeda dari tumbuhan yang autotrof dan berdinding selulosa.",
                misconception = "Mengira jamur adalah jenis tumbuhan primitif yang bisa berfotosintesis."
            )
        )
    )

    // =========================================================================
    // 3. SISTEM ORGAN MANUSIA & INTEGRASI FISIOLOGIS
    // =========================================================================
    private val sistemOrganLesson = LessonData(
        conceptId = "bio-sistem-organ-manusia",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pso1",
                panelNumber = 1,
                title = "Detak Jantung Sehabis Berlari",
                caption = "Dimas baru saja menyelesaikan lari sprint 100 meter di lapangan sekolah. Nafasnya memburu dan dadanya berdegup kencang.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Huufft... Jantungku berdegup sangat cepat dan nafasku tersengal-sengal! Mengapa seluruh tubuhku bereaksi serempak saat aku berolahraga?",
                sceneVisualEmoji = "🏃",
                sceneDescription = "Dimas memeriksa denyut nadi pergelangan tangan sehabis berlari kencang."
            ),
            StoryPanel(
                id = "pso2",
                panelNumber = 2,
                title = "Pertukaran Gas di Alveolus Paru",
                caption = "Kakek menjelaskan bagaimana paru-paru dan darah bekerja sama memasok oksigen ke otot.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Otot kakimu membakar glukosa dan butuh oksigen melimpah! Di ujung saluran nafas, jutaan kantung alveolus tipis menyerap O₂ ke dalam hemoglobin darah dan membuang gas sisa CO₂ setiap detik!",
                sceneVisualEmoji = "🫁",
                sceneDescription = "Kantung-kantung alveolus paru diselimuti anyaman kapiler darah merah segar."
            ),
            StoryPanel(
                id = "pso3",
                panelNumber = 3,
                title = "Pompa Ganda Jantung & Jalur Pembuluh",
                caption = "Kirana menggambar bagan sirkulasi darah ganda tertutup manusia.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jantung kita memompa darah dua arah: Sirkulasi Kecil (Jantung bilik kanan → Paru-paru → Serambi kiri) dan Sirkulasi Besar (Bilik kiri → Seluruh tubuh → Serambi kanan)!",
                sceneVisualEmoji = "🫀",
                sceneDescription = "Empat ruang jantung manusia memompa darah beroksigen dan darah berkarbondioksida."
            ),
            StoryPanel(
                id = "pso4",
                panelNumber = 4,
                title = "Penyaring Ginjal & Komando Refleks Saraf",
                caption = "Kakek merangkum keterpaduan organ ekskresi dan saraf.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sisa racun urea disaring oleh 1 juta nefron di ginjal menjadi urine, sementara sistem saraf refleks melindungi tubuh kilat saat tanganmu tak sengaja menyentuh benda panas!",
                sceneVisualEmoji = "⚡",
                sceneDescription = "Sinyal listrik saraf mengalir cepat menghantarkan impuls refleks menjauhi bahaya."
            )
        ),
        intuitionTitle = "Simfoni Biologis Tubuh: Keterpaduan Sistem Organ Manusia",
        intuitionBody = "Tubuh manusia adalah mesin biologis maha rumit yang bekerja berkat kolaborasi harmonis berbagai sistem organ vital.\n\n" +
                "1. Sistem Gerak (Rangka, Sendi, Otot):\n" +
                "   • Rangka aksial (tengkorak, tulang belakang) & apendikular (anggota gerak tangan/kaki).\n" +
                "   • Sendi peluru (bahu, paha: gerak segala arah), engsel (siku, lutut: 1 arah), pelana (ibu jari), putar (leher).\n" +
                "   • Otot rangka lurik (sadar), otot polos organ dalam (tak sadar), otot jantung (ritmis tak sadar).\n\n" +
                "2. Sistem Pencernaan (Mekanik & Kimiawi):\n" +
                "   • Mulut (kunyah mekanik gigi + enzim ptialin/amilase ludah memecah pati) → Kerongkongan (gerak peristaltik) → Lambung (HCl asam membunuh kuman + pepsin memecah protein) → Usus Halus (duodenum menerima tripsin, lipase pankreas, dan empedu hati; penyerapan sari nutrisi oleh vili usus) → Usus Besar (penyerapan kembali air & pembusukan feses oleh bakteri E. coli).\n\n" +
                "3. Sistem Pernapasan:\n" +
                "   Hidung (penyaringan & penghangatan udara) → Faring → Laring → Trakea → Bronkus → Bronkiolus → Alveolus (tempat difusi gas O₂ diikat hemoglobin eritrosit dan pelepasan gas buang CO₂).\n\n" +
                "4. Sistem Peredaran Darah (Ganda & Tertutup):\n" +
                "   • Jantung 4 ruang: Serambi kanan (terima darah kotor tubuh), Bilik kanan (pompa ke paru), Serambi kiri (terima darah bersih paru), Bilik kiri berdinding tebal (pompa ke seluruh tubuh via aorta).\n" +
                "   • Pembuluh: Arteri (tebal elastis keluar jantung) vs Vena (berkatup menuju jantung) vs Kapiler mikroskopis.\n\n" +
                "5. Sistem Ekskresi (Ginjal Nefron):\n" +
                "   • 3 Tahapan Pembentukan Urine di Ginjal: \n" +
                "     1. Filtrasi di Glomerulus menghasilkan urine primer (bebas protein sel darah).\n" +
                "     2. Reabsorpsi di Tubulus Proksimal menyerap kembali glukosa & asam amino menghasilkan urine sekunder.\n" +
                "     3. Augmentasi di Tubulus Distal membuang kelebihan ion & zat racun menghasilkan urine sebenarnya.\n\n" +
                "6. Sistem Saraf & Refleks:\n" +
                "   Neuron (Dendrit penerima → Akson pengirim impuls). Lengkung refleks kilat tanpa otak: Reseptor rangsang → Saraf Sensorik → Interneuron Medula Spinalis → Saraf Motorik → Efektor otot.",
        intuitionPoints = listOf(
            "Mengapa bilik kiri jantung berdinding paling tebal dan berotot kuat? Karena bilik kiri harus menciptakan tekanan darah tinggi (tekanan sistolik ~120 mmHg) untuk mendorong darah ke seluruh tubuh hingga ujung jari dan kepala!",
            "Sel darah merah (eritrosit) mamalia tidak memiliki inti sel agar memiliki ruang maksimal untuk memuat molekul hemoglobin pengikat gas oksigen.",
            "Refleks melompat saat menginjak paku terjadi sebelum otak kita merasakan sakit, karena sinyal diproses langsung di sumsum tulang belakang demi proteksi instan."
        ),
        simId = "sim-human-organs",
        formulas = listOf(
            FormulaCard(
                symbol = "Q_{\\text{curah}}",
                equation = "Q = HR \\times SV",
                meaning = "Curah Jantung (Cardiac Output): volume darah yang dipompa bilik kiri per menit.",
                units = "L/menit",
                applicationNote = "Detak jantung (HR) 70 bpm × volume sekuncup (SV) 70 mL = curah darah ~4,9 Liter/menit saat istirahat."
            ),
            FormulaCard(
                symbol = "GFR",
                equation = "GFR = \\frac{U_{\\text{inulin}} \\times V}{P_{\\text{inulin}}} \\approx 125 \\text{ mL/min}",
                meaning = "Laju Filtrasi Glomerulus (Glomerular Filtration Rate) kedua ginjal manusia sehat.",
                units = "mL/menit (atau ~180 Liter filtrat per hari)",
                applicationNote = "Dari 180 L cairan filtrat glomerulus yang disaring per hari, 99% diserap kembali sehingga urine keluar hanya 1,5 L."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Teknologi Hemodialisis (Ginjal Buatan) pada Pasien Gagal Ginjal di RSCM Jakarta",
            context = "Pasien gagal ginjal kronis stadium akhir tidak mampu lagi memfiltrasi racun metabolik (ureum dan kreatinin) dari aliran darahnya.",
            engineeringProblem = "Merancang mesin dializer yang mampu menggantikan fungsi nefron ginjal membersihkan darah tanpa merusak sel eritrosit dan protein albumin tubuh.",
            physicalConceptUsed = "Prinsip difusi dan ultrafiltrasi gradien konsentrasi melintasi membran semipermeabel serat berongga (hollow fiber) sintetik melawan cairan dialisat steril.",
            mathematicalModel = "Pengaturan laju aliran darah (Qb 200–300 mL/menit) dan aliran dialisat (Qd 500 mL/menit) secara berlawanan arah (counter-current) untuk memaksimalkan klirens racun ureum darah.",
            realWorldImpact = "Menyelamatkan nyawa ratusan ribu pasien gagal ginjal di seluruh Indonesia melalui pembiayaan BPJS Kesehatan dengan terapi cuci darah terjadwal.",
            relatedCareers = listOf("Nefrolog (Dokter Spesialis Ginjal)", "Insinyur Biomedis (Biomedical Engineer)", "Perawat Dialisis Bersertifikat"),
            verifiedSource = "Perhimpunan Nefrologi Indonesia (PERNEFRI) & RSUPN Dr. Cipto Mangunkusumo Jakarta."
        ),
        homeLab = HomeLabData(
            title = "Mengukur Kapasitas Vital Paru-Paru Sederhana dengan Galon/Botol Berisi Air",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 botol air mineral ukuran besar (1,5 Liter atau jeriken 5 Liter bertanda mililiter)",
                "Baskom atau ember besar berisi air setengah penuh",
                "Selang plastik bening sepanjang 60–80 cm",
                "Spidol permanen dan penggaris"
            ),
            steps = listOf(
                "Langkah 1: Isi botol besar dengan air hingga penuh tumpah ke bibir botol.",
                "Langkah 2: Tutup mulut botol dengan telapak tangan, balikkan ke dalam ember berisi air, lalu lepaskan tangan (air dalam botol tidak akan tumpah karena tekanan atmosfer).",
                "Langkah 3: Masukkan salah satu ujung selang ke dalam mulut botol di bawah permukaan air ember.",
                "Langkah 4: Tarik napas sedalam-dalamnya secara maksimal, lalu hembuskan seluruh udara sekuat tenaga melalui ujung selang lainnya ke dalam botol!",
                "Langkah 5: Udara nafasmu akan mendesak air keluar botol (perpindahan air). Tandai batas kolom udara baru dan hitung volumenya: itulah Kapasitas Vital Paru-parumu!"
            ),
            observationGoal = "Mengukur volume ekspirasi udara cadangan dan udara komplementer kapasitas vital paru-paru manusia.",
            connectionToSimulation = "Bandingkan volume hembusanmu dengan grafik kapasitas pernapasan pada simulator organ di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-organ-1",
                prompt = "Pada proses pembentukan urine di nefron ginjal, tahapan penyerapan kembali zat-zat yang masih berguna bagi tubuh (seperti glukosa dan asam amino) dinamakan...",
                type = "multiple_choice",
                options = listOf("Reabsorpsi", "Filtrasi", "Augmentasi", "Defekasi"),
                correctAnswer = "Reabsorpsi",
                hints = listOf(
                    "Proses ini terjadi di tubulus kontortus proksimal.",
                    "Kata kuncinya: menyerap kembali zat bernutrisi."
                ),
                explanation = "Reabsorpsi adalah proses penyerapan kembali zat-zat esensial (glukosa, asam amino, ion natrium, air) dari urine primer di tubulus proksimal kembali ke pembuluh kapiler darah.",
                misconception = "Menyamakan dengan filtrasi (penyaringan awal darah di glomerulus)."
            ),
            QuizQuestion(
                id = "q-organ-2",
                prompt = "Ruang jantung manakah yang memiliki dinding otot paling tebal karena bertugas memompa darah kaya oksigen ke seluruh penjuru tubuh?",
                type = "multiple_choice",
                options = listOf("Bilik Kiri (Ventrikel Kiri)", "Bilik Kanan (Ventrikel Kanan)", "Serambi Kiri (Atrium Kiri)", "Serambi Kanan (Atrium Kanan)"),
                correctAnswer = "Bilik Kiri (Ventrikel Kiri)",
                hints = listOf(
                    "Bilik ini memompa darah keluar melewati pembuluh arteri utama (Aorta).",
                    "Darah harus didorong hingga ke ujung jari kaki dan otak di kepala."
                ),
                explanation = "Bilik kiri (ventrikel kiri) memiliki miokardium otot paling tebal karena harus membangkitkan tekanan hidrostatik tinggi untuk sirkulasi sistemik darah bersih ke seluruh organ tubuh.",
                misconception = "Mengira bilik kanan lebih tebal padahal bilik kanan hanya memompa jarak pendek ke paru-paru."
            )
        )
    )

    // =========================================================================
    // 4. FOTOSINTESIS & ENERGI KEHIDUPAN
    // =========================================================================
    private val photosynthesisLesson = LessonData(
        conceptId = "bio-fotosintesis",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pb1",
                panelNumber = 1,
                title = "Di Kebun Sayur Hidroponik Kakek",
                caption = "Kirana dan Dimas sedang membantu Kakek merawat instalasi pipa selada dan bayam hidroponik di pekarangan rumah.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kakek! Daun-daun selada ini hanya dialiri air dan kena sinar matahari, tapi bisa tumbuh besar, segar, dan berdaun lebat. Dari mana makanannya?",
                sceneVisualEmoji = "🌱",
                sceneDescription = "Tanaman selada segar di instalasi hidroponik bersinar terkena sinar mentari pagi."
            ),
            StoryPanel(
                id = "pb2",
                panelNumber = 2,
                title = "Kloroplas: Pabrik Tenaga Surya",
                caption = "Kakek mengambil kaca pembesar dan memperlihatkan permukaan daun yang hijau segar.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Di dalam setiap sel daun ada jutaan 'pabrik tenaga surya mikro' bernama kloroplas. Pigmen klorofil di dalamnya mampu menangkap foton sinar matahari untuk memecah air!",
                sceneVisualEmoji = "🔬",
                sceneDescription = "Tampilan mikroskopis kloroplas berbentuk lensa hijau berkilau di dalam sel tumbuhan."
            ),
            StoryPanel(
                id = "pb3",
                panelNumber = 3,
                title = "Stomata & Nafas Daun",
                caption = "Dimas menunjuk ke bagian bawah daun dan menjelaskan bagaimana gas bertukar.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Melalui lubang pori mikroskopis bernama stomata, daun menyerap gas CO₂ yang kita hembuskan, lalu meraciknya bersama air H₂O menjadi gula glukosa manis!",
                sceneVisualEmoji = "💨",
                sceneDescription = "Molekul CO2 masuk melalui pori stomata daun yang membuka."
            ),
            StoryPanel(
                id = "pb4",
                panelNumber = 4,
                title = "Oksigen Segar untuk Bumi",
                caption = "Kirana melihat gelembung udara kecil muncul di permukaan daun tanaman air dalam kolam ikan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Luar biasa! Tumbuhan tidak hanya memberi kita bahan makanan (glukosa dan karbohidrat), tapi juga melepas gas oksigen O₂ yang kita hirup setiap detik!",
                sceneVisualEmoji = "🫧",
                sceneDescription = "Gelembung oksigen O2 murni naik perlahan dari permukaan daun yang diterpa cahaya."
            )
        ),
        intuitionTitle = "Dapur Hijau Penopang Kehidupan Planet",
        intuitionBody = "Fotosintesis adalah reaksi biokimia paling penting di muka bumi, mengubah energi radiasi elektromagnetik matahari menjadi energi kimia yang tersimpan dalam ikatan molekul gula.\n\n" +
                "• Bahan Baku: 6 molekul Karbon Dioksida (CO₂) dari atmosfer + 6 molekul Air (H₂O) dari perakaran.\n" +
                "• Penggerak: Foton cahaya tampak (spektrum merah & biru diserap kuat oleh klorofil).\n" +
                "• Hasil: 1 molekul Glukosa (C₆H₁₂O₆) sebagai cadangan energi & pati + 6 molekul gas Oksigen (O₂) dilepas ke udara.\n" +
                "• Reaksi Terang: Terjadi di membran tilakoid kloroplas, menghasilkan ATP dan NADPH serta memecah air (fotolisis).\n" +
                "• Reaksi Gelap (Siklus Calvin): Terjadi di stroma, mengikat CO₂ menjadi glukosa.",
        intuitionPoints = listOf(
            "Hukum Faktor Pembatas (Liebig/Blackman): Laju fotosintesis dibatasi oleh faktor yang paling sedikit (cahaya, CO₂, atau air).",
            "Warna daun tampak hijau karena klorofil MENOLAK/MEMANTULKAN gelombang warna hijau dan MENYERAP gelombang biru dan merah.",
            "Tumbuhan adalah produsen primer (autotrof) yang menjadi fondasi seluruh rantai makanan di biosfer."
        ),
        simId = "sim-photosynthesis",
        formulas = listOf(
            FormulaCard(
                symbol = "Reaksi Bersih",
                equation = "6 CO_2 + 6 H_2O + \\text{Cahaya} \\xrightarrow{\\text{Klorofil}} C_6H_{12}O_6 + 6 O_2",
                meaning = "Persamaan stoikiometri biokimia fotosintesis tumbuhan hijau.",
                units = "Persamaan reaksi molar",
                applicationNote = "Setiap 6 mol gas CO₂ menghasilkan 1 mol glukosa murni dan 6 mol gas O₂."
            ),
            FormulaCard(
                symbol = "Laju (Blackman)",
                equation = "\\text{Laju} = \\min(I_{\\text{cahaya}} , [CO_2] , [H_2O])",
                meaning = "Laju fotosintesis dibatasi oleh faktor yang berada pada titik minimum.",
                units = "% kapasitas laju fotosintesis maksimum",
                applicationNote = "Meningkatkan cahaya tanpa menambah CO₂ tidak akan mempercepat laju fotosintesis."
            ),
            FormulaCard(
                symbol = "\\Delta G",
                equation = "\\Delta G^\\circ = +2870 \\text{ kJ/mol}",
                meaning = "Reaksi bersifat endergonik (membutuhkan input energi luar dari radiasi foton).",
                units = "kJ/mol glukosa",
                applicationNote = "Energi ini disimpan dalam bentuk pati (amilum) dan selulosa dinding sel."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pertanian Vertikal Cerdas (Smart Vertical Farming) di Ibu Kota Nusantara (IKN)",
            context = "Gedung produksi pangan dalam ruangan (indoor farming) di IKN menanam sayuran menggunakan lampu LED spektrum fotosintesis tanpa sinar matahari langsung.",
            engineeringProblem = "Sinar matahari di dalam ruangan tidak mencukupi, sementara tanaman butuh laju fotosintesis konstan 18 jam sehari agar cepat panen.",
            physicalConceptUsed = "Manipulasi spektrum gelombang foton PAR (Photosynthetically Active Radiation 400–700 nm) dan pengayaan gas CO₂ terukur.",
            mathematicalModel = "Insinyur agronomi mengatur rasio lampu LED Red-Blue (4:1) dengan PPFD 250 µmol/m²/s dan konsentrasi CO₂ 1.000 ppm (2,5 kali udara normal).",
            realWorldImpact = "Produktivitas panen selada meningkat 350% per meter persegi, menghemat 95% penggunaan air dibandingkan pertanian lahan konvensional, dan bebas pestisida.",
            relatedCareers = listOf("Insinyur Pertanian Presisi (Agroteknologi)", "Ahli Fisiologi Tumbuhan", "Arsitek Urban Farming"),
            verifiedSource = "Pusat Riset Hortikultura BRIN / Balai Penelitian Tanaman Sayuran Kementerian Pertanian."
        ),
        homeLab = HomeLabData(
            title = "Melihat Gelembung Oksigen Tanaman Air (Percobaan Ingenhousz)",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 toples kaca bening atau gelas kaca transparan",
                "Beberapa tangkai tanaman air Hydrilla (sering ada di akuarium) atau daun sirih muda bertangkai",
                "Air putih bersih",
                "1 sendok teh soda kue (sumber CO₂ terlarut - opsional)",
                "Lampu senter atau sinar matahari langsung"
            ),
            steps = listOf(
                "Langkah 1: Masukkan tanaman air Hydrilla ke dalam toples kaca berisi air dengan posisi tangkai menghadap ke atas.",
                "Langkah 2: Tambahkan sejumput kecil soda kue ke dalam air untuk menambah ketersediaan gas CO₂ terlarut.",
                "Langkah 3: Tempatkan toples di bawah sinar matahari langsung atau sorot dengan senter terang selama 5–10 menit.",
                "Langkah 4: Perhatikan ujung potongan tangkai daun: butir-butir gelembung udara kecil akan mulai bermunculan dan meluncur ke atas!",
                "Langkah 5: Pindahkan toples ke ruangan gelap atau tutup dengan kardus. Amati: produksi gelembung seketika berhenti!"
            ),
            observationGoal = "Membuktikan secara langsung bahwa fotosintesis membutuhkan cahaya matahari dan melepaskan gas oksigen murni (O₂).",
            connectionToSimulation = "Bandingkan jumlah gelembung di toples dengan gelembung biru pada simulator fotosintesis di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-bio-1",
                prompt = "Organel sel tumbuhan yang berfungsi sebagai tempat berlangsungnya proses fotosintesis adalah...",
                type = "multiple_choice",
                options = listOf("Kloroplas", "Mitokondria", "Ribosom", "Badan Golgi"),
                correctAnswer = "Kloroplas",
                hints = listOf(
                    "Organel ini mengandung pigmen hijau klorofil.",
                    "Kata dasarnya diawali dengan 'Kloro'."
                ),
                explanation = "Fotosintesis berlangsung di dalam kloroplas, tepatnya pada membran tilakoid (reaksi terang) dan stroma (reaksi gelap/Siklus Calvin).",
                misconception = "Menyamakan dengan mitokondria yang merupakan tempat respirasi/pembongkaran energi sel."
            ),
            QuizQuestion(
                id = "q-bio-2",
                prompt = "Gas apakah yang diserap oleh tumbuhan dari udara melalui stomata untuk bahan baku fotosintesis?",
                type = "multiple_choice",
                options = listOf("Karbon Dioksida (CO₂)", "Oksigen (O₂)", "Nitrogen (N₂)", "Metana (CH₄)"),
                correctAnswer = "Karbon Dioksida (CO₂)",
                hints = listOf(
                    "Gas ini dihembuskan oleh manusia dan hewan saat bernapas.",
                    "Rumus kimianya adalah CO₂."
                ),
                explanation = "Tumbuhan menyerap Karbon Dioksida (CO₂) dari atmosfer dan melepas Oksigen (O₂) ke lingkungan sebagai hasil sampingan yang bermanfaat bagi biosfer.",
                misconception = "Mengira tumbuhan hanya menyerap oksigen seperti hewan."
            )
        )
    )

    // =========================================================================
    // 5. EKOSISTEM, JARING MAKANAN & ALIRAN ENERGI
    // =========================================================================
    private val ekosistemLesson = LessonData(
        conceptId = "bio-ekosistem",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "peko1",
                panelNumber = 1,
                title = "Terumbu Karang Kepulauan Seribu",
                caption = "Dimas dan Kirana diajak snorkeling di perairan Pulau Pari, Kepulauan Seribu.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Subhanallah! Di bawah air ini ramai sekali: terumbu karang warna-warni, ikan badut berenang di antara anemon laut, dan air laut yang jernih!",
                sceneVisualEmoji = "🪸",
                sceneDescription = "Keindahan ekosistem terumbu karang tropis dengan ikan karang yang melimpah."
            ),
            StoryPanel(
                id = "peko2",
                panelNumber = 2,
                title = "Perpaduan Biotik & Abiotik",
                caption = "Kakek menjelaskan bagaimana kehidupan karang bergantung pada faktor fisik lingkungan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ekosistem adalah interaksi timbal balik antara Komponen Biotik (makhluk hidup: karang, ikan, alga) dan Komponen Abiotik (benda tak hidup: intensitas cahaya matahari, salinitas garam, pH air, dan suhu laut)!",
                sceneVisualEmoji = "🌊",
                sceneDescription = "Sinar matahari menembus kolom air laut memberi energi bagi mikroalga karang."
            ),
            StoryPanel(
                id = "peko3",
                panelNumber = 3,
                title = "Jaring-Jaring Makanan Pesisir",
                caption = "Kirana menggambar hubungan makan-memakan di laut dangkal.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Fitoplankton dimakan udang rebon, udang dimakan ikan kecil, ikan kecil dimakan ikan kerapu, dan kerapu dimakan elang laut! Hubungan rumit bercabang ini membentuk Jaring Makanan!",
                sceneVisualEmoji = "🕸️",
                sceneDescription = "Jaring-jaring makanan laut memperlihatkan keterhubungan antar tingkatan trofik."
            ),
            StoryPanel(
                id = "peko4",
                panelNumber = 4,
                title = "Piramida Energi & Simbiosis Harmonis",
                caption = "Kakek menunjuk ikan badut yang bersembunyi aman di tentakel anemon laut.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ini contoh Simbiosis Mutualisme: ikan badut terlindung dari pemangsa dan anemon mendapat sisa makanan! Serta ingat, di setiap tingkatan rantai hanya 10% energi yang berpindah ke atas.",
                sceneVisualEmoji = "🐠",
                sceneDescription = "Ikan badut dan anemon laut hidup berdampingan saling menguntungkan."
            )
        ),
        intuitionTitle = "Dinamika Ekosistem: Jalinan Kehidupan & Neraca Energi Biosfer",
        intuitionBody = "Ekosistem merupakan tatanan kesatuan utuh menyeluruh antara segenap unsur lingkungan hidup yang saling mempengaruhi satu sama lain.\n\n" +
                "1. Komponen Penyusun Ekosistem:\n" +
                "   • Komponen Biotik: Produsen autotrof (tumbuhan/alga), Konsumen heterotrof (herbivora, karnivora, omnivora), Dekomposer (jamur/bakteri), dan Detritivor (pemakan bangkai: cacing tanah, kepiting).\n" +
                "   • Komponen Abiotik: Cahaya matahari, air, tanah, udara (O₂, CO₂, N₂), suhu, pH, kelembaban, dan salinitas.\n\n" +
                "2. Satuan Organisasi Kehidupan dalam Ekosistem:\n" +
                "   Individu (1 ekor ikan) → Populasi (kelompok ikan sejenis) → Komunitas (kumpulan berbagai populasi di area sama) → Ekosistem (komunitas + faktor abiotik) → Bioma (ekosistem luas iklim serupa, misal: hutan hujan tropis) → Biosfer (seluruh lapisan bumi tempat hidup ada).\n\n" +
                "3. Interaksi Antar-Spesies (Simbiosis):\n" +
                "   • Mutualisme (+/+): Keduanya untung (anemon & ikan badut; lebah & bunga; mikoriza jamur & akar pohon).\n" +
                "   • Komensalisme (+/0): Satu untung, satu netral tidak dirugikan (ikan remora menempel pada hiu; tanaman anggrek epifit di batang pohon).\n" +
                "   • Parasitisme (+/-): Satu untung, inang dirugikan (benalu penyerap nutrisi pohon; cacing pita di usus).\n\n" +
                "4. Piramida Energi & Hukum 10%:\n" +
                "   Piramida energi selalu berbentuk segitiga tegak lurus sempurna karena energi berkurang drastis di setiap tingkatan trofik (hanya ~10% tersimpan sebagai biomassa baru, sisanya 90% hilang sebagai panas respirasi dan ekskresi).",
        intuitionPoints = listOf(
            "Piramida biomassa di ekosistem perairan kadang bisa terbalik (biomassa fitoplankton lebih kecil dari zooplankton), tapi Piramida ENERGI tidak pernah terbalik di biosfer!",
            "Spesies Kunci (Keystone Species) seperti berang-berang atau hiu menjaga keanekaragaman seluruh ekosistem; kepunahan spesies kunci memicu keruntuhan ekosistem total.",
            "Semakin beragam spesies dalam suatu jaring makanan, ekosistem tersebut semakin stabil dan tangguh (resilience) menghadapi bencana alam atau perubahan cuaca."
        ),
        simId = "sim-ecosystem",
        formulas = listOf(
            FormulaCard(
                symbol = "D",
                equation = "D = \\frac{N}{A}",
                meaning = "Kepadatan populasi organisme dalam suatu area habitat.",
                units = "individu/m² (atau individu/hektar)",
                applicationNote = "N adalah jumlah total cacah individu spesies, A adalah luas area wilayah survei."
            ),
            FormulaCard(
                symbol = "E_{\\text{trofik}}",
                equation = "E_n = E_1 \\times (0{,}10)^{n-1}",
                meaning = "Energi yang tersisa pada tingkatan trofik ke-n berdasarkan efisiensi 10%.",
                units = "kkal / kJ",
                applicationNote = "Jika produsen E₁ = 100.000 kJ, maka karnivora sekunder trofik ke-3 hanya menerima E₃ = 1.000 kJ."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Restorasi Ekosistem Terumbu Karang Wakatobi dengan Teknologi Biorock",
            context = "Terumbu karang di kawasan Taman Nasional Wakatobi Sulawesi Tenggara sempat rusak akibat penangkapan ikan ilegal dengan bom dan pemanasan global.",
            engineeringProblem = "Pertumbuhan koral alami sangat lambat (hanya 1–2 cm/tahun) dan bibit karang baru mudah lepas tersapu ombak kencang.",
            physicalConceptUsed = "Teknologi Biorock: struktur kerangka baja dialiri arus listrik searah (DC) tegangan rendah aman, memicu elektrolisis air laut yang mengendapkan kalsium karbonat mineral pelindung karang.",
            mathematicalModel = "Mengalirkan arus katodik 1,5–3 Volt memacu laju kalsifikasi kerangka karang hingga 400% lebih cepat dan meningkatkan kelangsungan hidup fragmen transplantasi hingga 95%.",
            realWorldImpact = "Memulihkan 20 hektar terumbu karang rusak, mengembalikan ribuan populasi ikan karang ekonomis, dan mendongkrak pendapatan wisata bahari masyarakat nelayan lokal.",
            relatedCareers = listOf("Biolog Kelautan (Marine Biologist)", "Spesialis Restorasi Terumbu Karang", "Petugas Konservasi Taman Nasional"),
            verifiedSource = "Balai Taman Nasional Wakatobi & Pusat Riset Oseanografi BRIN."
        ),
        homeLab = HomeLabData(
            title = "Membuat Mini-Biosfer Terarium Tertutup Mandiri dalam Stoples Kaca",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "1 stoples kaca bening kedap udara bertutup ulir",
                "Kerikil kecil atau batu hias (lapisan drainase bawah)",
                "Arang aktif (sejumput kecil untuk menyaring jamur dan bau)",
                "Tanah humus subur",
                "Tanaman lumut hijau segar dan 1 tanaman kecil sukulen/paku pekarangan",
                "Semprotan air (spray) bersih"
            ),
            steps = listOf(
                "Langkah 1: Masukkan lapisan kerikil setebal 2 cm di dasar stoples untuk menampung genangan air.",
                "Langkah 2: Taburkan sedikit bubuk arang di atas kerikil, lalu masukkan tanah humus setebal 4–5 cm.",
                "Langkah 3: Tanam lumut hijau dan tanaman kecil secara rapi dengan pinset.",
                "Langkah 4: Semprotkan sedikit air hingga tanah lembab (jangan sampai banjir becek), lalu tutup rapat toples kedap udara.",
                "Langkah 5: Letakkan di dekat jendela yang terkena sinar matahari tidak langsung. Amati: siklus air tertutup terjadi di mana uap air mengembun di dinding toples lalu jatuh menyiram tanah seperti hujan abadi!"
            ),
            observationGoal = "Menyaksikan miniatur biosfer tertutup mandiri di mana siklus oksigen, karbon, dan air berjalan seimbang tanpa intervensi luar.",
            connectionToSimulation = "Bandingkan siklus air dan energi toplesmu dengan simulator rantai ekosistem di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-eko-1",
                prompt = "Hubungan simbiosis antara anemon laut dan ikan badut (clownfish) di mana kedua organisme saling mendapatkan keuntungan disebut...",
                type = "multiple_choice",
                options = listOf("Simbiosis Mutualisme", "Simbiosis Komensalisme", "Simbiosis Parasitisme", "Predasi"),
                correctAnswer = "Simbiosis Mutualisme",
                hints = listOf(
                    "Ikan badut mendapat perlindungan dari sengat anemon, anemon mendapat pembersihan kotoran.",
                    "Kedua pihak sama-sama diuntungkan (+/+)."
                ),
                explanation = "Simbiosis mutualisme adalah interaksi antar dua spesies di mana kedua belah pihak sama-sama memperoleh keuntungan kelangsungan hidup.",
                misconception = "Menyamakan dengan komensalisme yang hanya menguntungkan sepihak tanpa merugikan pihak lain."
            ),
            QuizQuestion(
                id = "q-eko-2",
                prompt = "Jika produsen pada suatu padang lamun menghasilkan energi sebesar 40.000 kkal, menurut efisiensi energi trofik 10%, berapakah energi yang dapat dimanfaatkan oleh konsumen tingkat 2 (karnivora sekunder)?",
                type = "numeric",
                correctAnswer = "400",
                tolerance = 5f,
                unit = "kkal",
                hints = listOf(
                    "Konsumen tingkat 1 (herbivora) menerima: 10% × 40.000 = 4.000 kkal.",
                    "Konsumen tingkat 2 menerima: 10% dari konsumen tingkat 1.",
                    "10% × 4.000 = ...?"
                ),
                explanation = "Konsumen tingkat 1 menerima 10% × 40.000 kkal = 4.000 kkal. Konsumen tingkat 2 menerima 10% × 4.000 kkal = 400 kkal.",
                misconception = "Mengira langsung berkurang 10% saja (36.000 kkal)."
            )
        )
    )

    // =========================================================================
    // 6. PEWARISAN SIFAT DASAR: GEN & KROMOSOM
    // =========================================================================
    private val pewarisanDasarLesson = LessonData(
        conceptId = "bio-pewarisan-dasar",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "ppd1",
                panelNumber = 1,
                title = "Lesung Pipi Kirana & Dimas",
                caption = "Kirana dan Dimas sedang melihat album foto keluarga saat Ayah dan Ibu masih remaja.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kirana punya lesung pipi persis seperti Ibu, sedangkan aku tidak punya lesung pipi tapi punya bentuk hidung mancung persis seperti Ayah!",
                sceneVisualEmoji = "😊",
                sceneDescription = "Dimas dan Kirana membandingkan kemiripan wajah dengan kedua orang tua mereka."
            ),
            StoryPanel(
                id = "ppd2",
                panelNumber = 2,
                title = "DNA & Kromosom di Inti Sel",
                caption = "Kakek membuka buku biologi bergambar untaian heliks ganda DNA yang terpilin rapi.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Semua instruksi pembentuk tubuh kita tersimpan di dalam benang DNA yang terpilin membentuk 23 pasang (46 buah) Kromosom di dalam nukleus setiap sel!",
                sceneVisualEmoji = "🧬",
                sceneDescription = "Kromosom berbentuk huruf X menyimpan pita panjang molekul asam nukleat DNA."
            ),
            StoryPanel(
                id = "ppd3",
                panelNumber = 3,
                title = "Fenotipe Tampak vs Genotipe Kode",
                caption = "Dimas mencatat istilah genetik baru yang diajarkan Kakek.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Sifat yang tampak di cermin (mata bulat, kulit sawo matang) disebut Fenotipe! Sedangkan kode huruf gen di dalam sel (seperti BB, Bb, atau bb) disebut Genotipe!",
                sceneVisualEmoji = "📝",
                sceneDescription = "Perbedaan antara karakter fisik fenotipe yang tampak dan komposisi genotipe DNA."
            ),
            StoryPanel(
                id = "ppd4",
                panelNumber = 4,
                title = "Alel Dominan, Resesif, & Intermediet",
                caption = "Kirana menyilangkan bunga warna merah dan bunga putih di kebun.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jika alel Merah dominan penuh atas putih, keturunannya merah! Tapi jika bersifat Intermediet (sama kuat), bunganya menjadi warna merah muda cantik!",
                sceneVisualEmoji = "🌺",
                sceneDescription = "Persilangan sifat intermediet menghasilkan perpaduan warna merah muda."
            )
        ),
        intuitionTitle = "Cetak Biru Hereditas: Bagaimana Sifat Diwariskan Antar Generasi",
        intuitionBody = "Pewarisan sifat (hereditas) adalah mekanisme biologis penurunan karakteristik fisik, biokimiawi, dan fisiologis dari orang tua kepada keturunannya.\n\n" +
                "1. Struktur Materi Genetik:\n" +
                "   • Gen: Segmen spesifik DNA yang mengkode sintesis satu rantai polipeptida/protein penentu sifat.\n" +
                "   • Kromosom: Struktur benang padat kromatin yang tersusun dari DNA dan protein histon di dalam inti sel. Sel tubuh manusia memiliki 46 kromosom (22 pasang autosom + 1 pasang gonosom penentu jenis kelamin XX/XY).\n" +
                "   • Alel: Variasi alternatif dari suatu gen pada lokus kromosom homolog yang sama.\n\n" +
                "2. Istilah Inti Genetika:\n" +
                "   • Fenotipe: Sifat tampak yang dapat diamati secara fisik (contoh: rambut lurus, warna bunga ungu, golongan darah).\n" +
                "   • Genotipe: Susunan genetik molekuler individu yang disimbolkan dengan sepasang huruf (contoh: BB homozigot dominan, Bb heterozigot, bb homozigot resesif).\n" +
                "   • Dominan: Sifat gen yang selalu muncul mengalahkan/menutupi sifat alel pasangannya (huruf kapital).\n" +
                "   • Resesif: Sifat gen yang tertutupi dan hanya muncul jika berpasangan dengan sesama alel resesif (huruf kecil).\n" +
                "   • Intermediet: Kedua alel sama kuat sehingga keturunan heterozigot menampilkan sifat perantara (contoh: Merah MM × Putih mm menghasilkan Merah Muda Mm).\n\n" +
                "3. Hukum I Mendel (Segregasi Bebas) pada Persilangan Monohibrid:\n" +
                "   Pada pembentukan gamet meiosis, pasangan alel akan memisah secara bebas sehingga tiap gamet hanya membawa 1 alel.\n" +
                "   • Persilangan Induk Heterozigot (Bb × Bb):\n" +
                "     - Rasio Genotipe F2 = 1 BB : 2 Bb : 1 bb (25% : 50% : 25%)\n" +
                "     - Rasio Fenotipe F2 (Dominan Penuh) = 3 Dominan : 1 Resesif (75% : 25%)\n" +
                "     - Rasio Fenotipe F2 (Intermediet) = 1 Merah : 2 Merah Muda : 1 Putih",
        intuitionPoints = listOf(
            "Anak laki-laki mewarisi kromosom Y dari ayah dan kromosom X dari ibu, sedangkan anak perempuan mewarisi satu kromosom X dari ayah dan satu kromosom X dari ibu.",
            "Gen resesif pembawa sifat penyakit (seperti albino atau buta warna) dapat 'bersembunyi' pada orang tua pembawa sifat (carrier) tanpa membuat orang tua tersebut sakit.",
            "Lingkungan juga dapat mempengaruhi fenotipe: Fenotipe = Genotipe + Pengaruh Lingkungan."
        ),
        simId = "sim-genetics-basic",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Rasio } F_2",
                equation = "\\text{Genotipe } = 1 : 2 : 1 \\quad , \\quad \\text{Fenotipe } = 3 : 1",
                meaning = "Rasio hasil persilangan monohibrid dominan penuh induk F1 heterozigot (Aa × Aa).",
                units = "Perbandingan peluang",
                applicationNote = "Setiap kelahiran memiliki peluang 75% menghasilkan fenotipe dominan dan 25% fenotipe resesif."
            ),
            FormulaCard(
                symbol = "2n",
                equation = "2n = 46 \\quad \\text{(Sel Somatis Manusia)}",
                meaning = "Jumlah kromosom diploid (berpasangan) pada seluruh sel tubuh manusia.",
                units = "kromosom (23 pasang)",
                applicationNote = "Sel sperma dan ovum (gamet) bersifat haploid (n = 23 kromosom)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Program Skrining Thalassemia Minor Calon Pengantin di Puskesmas DKI Jakarta",
            context = "Thalassemia mayor adalah kelainan darah bawaan genetik resesif di mana eritrosit mudah hancur sehingga pasien harus transfusi darah seumur hidup.",
            engineeringProblem = "Mencegah kelahiran anak pengidap Thalassemia Mayor dari pasangan orang tua yang sama-sama pembawa sifat tanpa gejala (carrier / Thalassemia Minor).",
            physicalConceptUsed = "Hukum segregasi alel resesif autosomal (gen HBB pada kromosom 11): jika dua carrier heterozigot (Tt × Tt) menikah, ada peluang 25% melahirkan anak Thalassemia Mayor (tt).",
            mathematicalModel = "Skrining darah lengkap hematologi (MCV < 80 fL dan MCH < 27 pg) dilanjutkan analisis elektroforesis hemoglobin HbA2 (> 3,5%) mendeteksi status genotip pembawa carrier.",
            realWorldImpact = "Menurunkan angka kelahiran bayi Thalassemia Mayor di Jakarta hingga 40% dan memberikan edukasi konseling genetik pranikah bagi ribuan pasangan muda.",
            relatedCareers = listOf("Konselor Genetika Medis", "Dokter Spesialis Hematologi", "Analis Laboratorium Kesehatan"),
            verifiedSource = "Dinas Kesehatan Provinsi DKI Jakarta & Yayasan Thalassemia Indonesia (YTI)."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Kancing Genetika: Pemilahan Alel Mendel dengan Kacang Kedelai & Kacang Merah",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "50 butir kacang merah (mewakili gen dominan A)",
                "50 butir kacang kedelai/kacang hijau (mewakili gen resesif a)",
                "2 buah kantong kain atau toples plastik bertanda 'Induk Jantan' dan 'Induk Betina'",
                "Kertas catatan dan bolpoin"
            ),
            steps = listOf(
                "Langkah 1: Masukkan 25 kacang merah (A) dan 25 kacang kedelai (a) ke dalam Kantong 1. Aduk rata (Induk Jantan heterozigot Aa).",
                "Langkah 2: Masukkan 25 kacang merah (A) dan 25 kacang kedelai (a) ke dalam Kantong 2. Aduk rata (Induk Betina heterozigot Aa).",
                "Langkah 3: Tutup matamu, lalu ambil serentak 1 butir kacang dari Kantong 1 dan 1 butir kacang dari Kantong 2.",
                "Langkah 4: Catat pasangan kacang yang terambil: Merah-Merah (AA), Merah-Kedelai (Aa), atau Kedelai-Kedelai (aa). Kembalikan kacang ke kantongnya masing-masing dan aduk lagi.",
                "Langkah 5: Ulangi pengambilan acak hingga 80 kali. Jumlahkan total kemunculan AA, Aa, dan aa. Periksa rasio akhirnya: sangat dekat dengan 1 : 2 : 1!"
            ),
            observationGoal = "Membuktikan secara fisik bahwa pemisahan alel saat fertilisasi berlangsung murni acak mengikuti hukum peluang statistika.",
            connectionToSimulation = "Bandingkan hasil kacangmu dengan simulator kotak Punnett di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-pewarisan-1",
                prompt = "Jika dua tanaman bergenotipe heterozigot (Aa) disilangkan, berapakah perbandingan rasio fenotipe keturunan F2 jika sifat A dominan penuh terhadap a?",
                type = "multiple_choice",
                options = listOf("3 : 1", "1 : 2 : 1", "9 : 3 : 3 : 1", "1 : 1"),
                correctAnswer = "3 : 1",
                hints = listOf(
                    "Genotipe yang muncul: 1 AA, 2 Aa, dan 1 aa.",
                    "AA dan Aa menampilkan fenotipe dominan yang sama.",
                    "Sehingga dominan : resesif = (1 + 2) : 1 = ...?"
                ),
                explanation = "Persilangan Aa × Aa menghasilkan rasio genotipe 1 AA : 2 Aa : 1 aa. Karena A dominan penuh, baik AA maupun Aa berfenotipe sama (dominan), menghasilkan rasio fenotipe 3 Dominan : 1 Resesif.",
                misconception = "Menjawab 1:2:1 (1:2:1 adalah rasio genotipe, bukan rasio fenotipe dominan penuh)."
            ),
            QuizQuestion(
                id = "q-pewarisan-2",
                prompt = "Berapakah jumlah pasang kromosom tubuh (autosom) yang normal dimiliki oleh setiap sel tubuh manusia?",
                type = "numeric",
                correctAnswer = "22",
                tolerance = 0.1f,
                unit = "pasang",
                hints = listOf(
                    "Total kromosom manusia adalah 23 pasang (46 buah).",
                    "1 pasang di antaranya adalah kromosom seks/kelamin (gonosom XX/XY).",
                    "23 - 1 = ...?"
                ),
                explanation = "Sel somatis manusia memiliki 23 pasang kromosom, yang terdiri dari 22 pasang kromosom tubuh (autosom) dan 1 pasang kromosom seks (gonosom).",
                misconception = "Menjawab 23 pasang autosom (lupa bahwa 1 pasang adalah kromosom seks)."
            )
        )
    )

    // =========================================================================
    // 7. REPRODUKSI TUMBUHAN & MANUSIA
    // =========================================================================
    private val reproduksiLesson = LessonData(
        conceptId = "bio-reproduksi",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "prep1",
                panelNumber = 1,
                title = "Mencangkok Pohon Mangga Harum Manis",
                caption = "Kakek mengajari Dimas cara mencangkok cabang pohon mangga di halaman belakang.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Wah, kenapa kulit batangnya dikupas sampai kambiumnya bersih lalu dibungkus sabut kelapa basah, Kakek?",
                sceneVisualEmoji = "🌳",
                sceneDescription = "Batang pohon mangga dicangkok dengan media sabut kelapa untuk memicu tumbuhnya akar baru."
            ),
            StoryPanel(
                id = "prep2",
                panelNumber = 2,
                title = "Perbanyakan Vegetatif vs Generatif",
                caption = "Kakek mengikat tali cangkokan dengan kencang.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Mencangkok adalah Reproduksi Vegetatif buatan: tanaman baru tumbuh tanpa kawin dan sifat buahnya 100% manis persis induknya! Berbeda dengan biji bunga (generatif) yang merupakan percampuran sifat serbuk sari dan putik.",
                sceneVisualEmoji = "🥭",
                sceneDescription = "Bunga mangga mengalami penyerbukan generatif menghasilkan buah manis berbiji."
            ),
            StoryPanel(
                id = "prep3",
                panelNumber = 3,
                title = "Anatomi Bunga: Benang Sari & Putik",
                caption = "Kirana membelah sekuntum bunga sepatu merah melihat bagian-bagian pembiakannya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Benang sari menghasilkan butir serbuk sari sebagai sel kelamin jantan, dan putik memiliki kepala putik serta bakal biji (ovulum) sebagai sel kelamin betina!",
                sceneVisualEmoji = "🌺",
                sceneDescription = "Benang sari kuning dan kepala putik merah pada bunga sepatu terlihat jelas."
            ),
            StoryPanel(
                id = "prep4",
                panelNumber = 4,
                title = "Keajaiban Awal Mula Kehidupan Manusia",
                caption = "Kakek merangkum proses fertilisasi sel reproduksi manusia.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Pada manusia, peleburan satu sel sperma ayah dan satu sel ovum ibu di saluran tuba falopi membentuk Zigot bersel tunggal. Zigot membelah jutaan kali menjadi janin di dalam rahim ibu selama 9 bulan!",
                sceneVisualEmoji = "👶",
                sceneDescription = "Pertemuan sperma dan ovum membentuk sel zigot yang mengawali kehidupan manusia."
            )
        ),
        intuitionTitle = "Kelangsungan Hidup Generasi: Mekanisme Reproduksi Hayati",
        intuitionBody = "Reproduksi adalah kemampuan biologis organisme menghasilkan individu baru demi melestarikan keberlangsungan jenisnya agar tidak punah.\n\n" +
                "1. Reproduksi Tumbuhan:\n" +
                "   A. Reproduksi Vegetatif (Aseksual / Tanpa Kawin):\n" +
                "      • Vegetatif Alami: Tunas (pisang, bambu), Tunas adventif daun (cocor bebek), Rizoma/rimpang akar (kunyit, jahe), Stolon/geragih (stroberi, rumput teki), Umbi lapis (bawang), Umbi batang (kentang).\n" +
                "      • Vegetatif Buatan: Cangkok (menumbuhkan akar pada cabang kayu), Stek (batang singkong ditancapkan), Okulasi/menempel tunas, Sambung pucuk (enten).\n" +
                "   B. Reproduksi Generatif (Seksual / Kawin):\n" +
                "      • Terjadi melalui organ Bunga: Benang sari (alat kelamin jantan pembentuk serbuk sari) dan Putik (alat kelamin betina pembawa sel telur di bakal biji).\n" +
                "      • Penyerbukan (Polinasi): Jatuhnya serbuk sari ke kepala putik (dibantu angin/anemogami, serangga/entomogami, air, atau manusia).\n" +
                "      • Pembuahan Ganda Angiospermae: 1 sperma + ovum → Zigot (2n); 1 sperma + inti kandung lembaga sekunder → Endosperma cadangan makanan (3n).\n\n" +
                "2. Reproduksi Manusia:\n" +
                "   A. Organ Reproduksi Pria:\n" +
                "      • Testis: Penghasil jutaan sel sperma (spermatogenesis) dan hormon testosteron, berada di dalam kantung skrotum yang menjaga suhu 2–3°C lebih sejuk dari tubuh.\n" +
                "      • Saluran reproduksi: Epididimis (pematangan sperma) → Vas deferens → Uretra.\n" +
                "      • Kelenjar tambahan: Vesikula seminalis, Kelenjar prostat, dan Kelenjar Cowper (pemberi cairan semen bernutrisi basa).\n" +
                "   B. Organ Reproduksi Wanita:\n" +
                "      • Ovarium: Penghasil sel telur ovum (oogenesis) setiap bulan dan hormon estrogen-progesteron.\n" +
                "      • Tuba Falopi (Oviduk): Saluran tempat bertemunya sel sperma dan sel ovum (tempat fertilisasi pembuahan).\n" +
                "      • Uterus (Rahim): Organ berongga tebal tempat menempelnya (implantasi) dan berkembangnya janin selama masa kehamilan.\n" +
                "   C. Siklus Menstruasi & Fertilisasi:\n" +
                "      • Jika ovum tidak dibuahi sperma, kadar estrogen-progesteron anjlok, menyebabkan luruhnya lapisan dinding rahim (endometrium) bersama darah menstruasi.\n" +
                "      • Jika terjadi fertilisasi di tuba falopi, terbentuk Zigot yang membelah (morula → blastokista) lalu menempel di dinding rahim membentuk plasenta.",
        intuitionPoints = listOf(
            "Keuntungan perbanyakan vegetatif adalah sifat anak 100% identik dengan induk dan cepat berbuah, sedangkan generatif menghasilkan variasi genetik baru yang lebih tahan terhadap perubahan lingkungan.",
            "Testis manusia berada di luar rongga tubuh dalam skrotum karena pembentukan sperma normal memerlukan suhu optimal 34°C, lebih rendah daripada suhu inti tubuh (37°C).",
            "Masa ovulasi (pelepasan sel telur matang dari ovarium) umumnya terjadi pada hari ke-14 dari siklus menstruasi wanita 28 hari."
        ),
        simId = "sim-reproduction",
        formulas = listOf(
            FormulaCard(
                symbol = "T_{\\text{ovulasi}}",
                equation = "T_{\\text{ovulasi}} = H_{\\text{siklus}} - 14",
                meaning = "Estimasi hari ovulasi (pelepasan ovum) dihitung mundur 14 hari dari siklus menstruasi berikutnya.",
                units = "hari ke- dalam siklus",
                applicationNote = "Pada wanita dengan siklus rata-rata 28 hari, ovulasi terjadi sekitar hari ke-14."
            ),
            FormulaCard(
                symbol = "\\text{Pembuahan Ganda}",
                equation = "S_1 + O \\to \\text{Zigot } (2n) \\quad , \\quad S_2 + IKLS \\to \\text{Endosperma } (3n)",
                meaning = "Persamaan biologis pembuahan ganda pada tumbuhan berbiji tertutup (Angiospermae).",
                units = "Ploiditas kromosom",
                applicationNote = "Endosperma triploid (3n) berfungsi sebagai cadangan makanan (daging buah/endosperma kelapa)."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Teknologi Bayi Tabung (IVF) Program Morula di RSAB Harapan Kita Jakarta",
            context = "Pasangan suami istri mengalami infertilitas akibat sumbatan permanen kedua saluran tuba falopi sang istri sehingga sel telur tidak dapat bertemu sel sperma secara alami.",
            engineeringProblem = "Melakukan fertilisasi di luar tubuh secara in-vitro dan menumbuhkan embrio hingga fase blastokista sebelum dipindahkan kembali ke rahim.",
            physicalConceptUsed = "Aplikasi mikro-manipulasi seluler: aspirasi oosit dari ovarium dibantu USG transvaginal, injeksi sperma tunggal intrasitoplasmik (ICSI) di bawah mikroskop inversi, dan kultur inkubator terkontrol CO₂ 5%.",
            mathematicalModel = "Gradien sentrifugasi densitas memilah sperma motil terbaik (kecepatan > 25 µm/s) dan penilaian skor morfokinetik pembelahan sel embrio hari ke-5 (blastokista ekspansi penuh gradasi AA).",
            realWorldImpact = "Membantu ribuan pasangan Indonesia mewujudkan impian memiliki keturunan sehat dengan tingkat keberhasilan kehamilan mencapai 45–50%.",
            relatedCareers = listOf("Embriolog Klinis", "Dokter Spesialis Kandungan Konsultan Fertilitas", "Spesialis Andrologi"),
            verifiedSource = "RSAB Harapan Kita & Perhimpunan Fertilisasi In Vitro Indonesia (PERFITRI)."
        ),
        homeLab = HomeLabData(
            title = "Membedah Anatomi Bunga Sepatu untuk Mengamati Organ Reproduksi Tanaman",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "1 kuntum bunga sepatu (Hibiscus rosa-sinensis) mekar segar",
                "Kaca pembesar atau kamera smartphone makro",
                "Pisau cutter kecil atau silet tajam (harus dibantu orang tua)",
                "Pinset dan selotip bening",
                "Kertas putih HVS"
            ),
            steps = listOf(
                "Langkah 1: Petik bunga sepatu segar dan amati kelopak hijau (calyx) serta mahkota bunga merah terang (corolla).",
                "Langkah 2: Amati tiang panjang di tengah bunga: perhatikan puluhan tangkai benang sari kuning di sisi samping dan 5 kepala putik merah tua di pucuk teratas.",
                "Langkah 3: Sentuh benang sari kuning dengan ujung jari: serbuk sari kuning halus akan menempel di kulitmu (sel kelamin jantan).",
                "Langkah 4: Belah bagian dasar bunga yang menggembung (bakal buah) secara membujur dengan cutter hati-hati.",
                "Langkah 5: Di bawah kaca pembesar, amati butir-butir putih kecil di dalam ruang bakal buah: itulah bakal biji (ovulum) tempat sel telur berdiam!"
            ),
            observationGoal = "Mengidentifikasi bagian morfologi reproduksi generatif bunga sempurna: benang sari, putik, dan bakal biji.",
            connectionToSimulation = "Bandingkan anatomi belahan bungamu dengan diagram reproduksi tumbuhan interaktif di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-repro-1",
                prompt = "Tempat terjadinya proses fertilisasi (pembuahan sel ovum oleh sel sperma) pada sistem reproduksi wanita normal adalah di dalam...",
                type = "multiple_choice",
                options = listOf("Tuba Falopi (Oviduk)", "Uterus (Rahim)", "Ovarium", "Vagina"),
                correctAnswer = "Tuba Falopi (Oviduk)",
                hints = listOf(
                    "Saluran yang menghubungkan ovarium menuju ke rahim.",
                    "Panjangnya sekitar 10–12 cm berumbai fimbriae."
                ),
                explanation = "Fertilisasi terjadi di saluran tuba falopi (oviduk). Setelah sel ovum dibuahi membentuk zigot, zigot akan berjalan menuju rahim untuk menempel (implantasi).",
                misconception = "Mengira pembuahan terjadi di dalam rahim (rahim adalah tempat perkembangan janin, bukan tempat fertilisasi awal)."
            ),
            QuizQuestion(
                id = "q-repro-2",
                prompt = "Perkembangbiakan vegetatif alami pada tumbuhan cocor bebek yang membentuk kuncup tunas baru di tepi lekukan daunnya dinamakan...",
                type = "multiple_choice",
                options = listOf("Tunas Adventif Daun", "Rizoma", "Stolon / Geragih", "Umbi Lapis"),
                correctAnswer = "Tunas Adventif Daun",
                hints = listOf(
                    "Tunas ini tumbuh di bagian yang tidak lazim (tepi daun).",
                    "Akan tumbuh akar kecil lalu jatuh ke tanah menjadi anakan baru."
                ),
                explanation = "Cocor bebek berkembang biak melalui tunas adventif daun, yaitu tunas liar yang muncul di luar ketiak batang, tepatnya di lekukan tepi helai daun.",
                misconception = "Menyamakan dengan stolon/geragih pada tanaman stroberi."
            )
        )
    )

    // =========================================================================
    // 8. ADAPTASI, SELEKSI ALAM & PELESTARIAN LINGKUNGAN
    // =========================================================================
    private val adaptasiLingkunganLesson = LessonData(
        conceptId = "bio-adaptasi-lingkungan",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pad1",
                panelNumber = 1,
                title = "Menjumpai Komodo di Pulau Rinca",
                caption = "Dimas dan Kirana dipandu Jagawana Taman Nasional Komodo mengamati satwa purba biawak komodo yang sedang berjemur.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Lidah komodo bercabang dua selalu menjulur keluar masuk! Untuk apa lidah bercabang itu, Pak Jagawana?",
                sceneVisualEmoji = "🦎",
                sceneDescription = "Komodo raksasa menjulurkan lidah kuning bercabangnya mendeteksi mangsa di padang sabana."
            ),
            StoryPanel(
                id = "pad2",
                panelNumber = 2,
                title = "Tiga Ragam Adaptasi Makhluk Hidup",
                caption = "Jagawana menjelaskan indera penciuman tajam komodo.",
                dialogueSpeaker = "Jagawana",
                dialogueText = "Lidah itu menangkap partikel bau di udara lalu menempelkannya ke organ Jacobson di langit-langit mulut! Ini contoh Adaptasi Fisiologi dan Morfologi agar bisa mencium bau bangkai dari jarak 5 kilometer!",
                sceneVisualEmoji = "👃",
                sceneDescription = "Organ Jacobson di kepala komodo menganalisis molekul kimiawi udara secara presisi."
            ),
            StoryPanel(
                id = "pad3",
                panelNumber = 3,
                title = "Seleksi Alam: Bertahan atau Tereliminasi",
                caption = "Kakek menceritakan prinsip seleksi alam yang dirumuskan Charles Darwin dan Alfred Russel Wallace.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Di alam liar, lingkungan selalu menyeleksi: individu yang memiliki variasi sifat paling cocok (fit) dengan tantangan alam akan bertahan hidup dan beranak pinak, sedangkan yang tidak mampu beradaptasi akan punah!",
                sceneVisualEmoji = "🌍",
                sceneDescription = "Seleksi alam menyaring organisme yang paling tangguh beradaptasi dengan iklim."
            ),
            StoryPanel(
                id = "pad4",
                panelNumber = 4,
                title = "Menjaga Benteng Keanekaragaman Hayati",
                caption = "Kirana menatap plang konservasi suaka alam.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Itu sebabnya kita harus melindungi habitat asli lewat Konservasi In-Situ seperti Taman Nasional Komodo ini, serta Konservasi Ex-Situ seperti Kebun Raya dan Taman Safari untuk menyelamatkan spesies dari kepunahan!",
                sceneVisualEmoji = "🛡️",
                sceneDescription = "Kawasan konservasi alam melindungi habitat satwa liar dari perburuan liar dan kerusakan."
            )
        ),
        intuitionTitle = "Strategi Bertahan Hidup: Adaptasi, Seleksi Hayati & Konservasi Alam",
        intuitionBody = "Kehidupan di bumi terus lestari selama miliaran tahun karena makhluk hidup dianugerahi kemampuan beradaptasi menyesuaikan diri terhadap perubahan lingkungan fisik dan biologisnya.\n\n" +
                "1. Tiga Bentuk Adaptasi Organisme:\n" +
                "   • Adaptasi Morfologi (Bentuk Fisik Luar Tubuh):\n" +
                "     - Bentuk paruh burung finch/kolibri sesuai jenis makanannya (nektar, biji, serangga).\n" +
                "     - Kaktus xerofit: daun bermodifikasi menjadi duri untuk memangkas penguapan, batang berdaging tebal penyimpan air berlapisan lilin kutikula.\n" +
                "     - Tumbuhan bakau mangrove: akar napas (pneumatofor) mencuat ke udara untuk menghirup oksigen di lumpur pasang surut.\n" +
                "   • Adaptasi Fisiologi (Fungsi Kimiawi Organ Dalam):\n" +
                "     - Rayap menghasilkan enzim selulase di ususnya dibantu protozoa flagellata untuk mencerna kayu.\n" +
                "     - Orang yang tinggal di dataran tinggi Papua (pegunungan Jayawijaya) memiliki kadar hemoglobin dan eritrosit lebih banyak untuk mengikat O₂ tipis.\n" +
                "     - Ikan air laut banyak minum air dan mengeluarkan sedikit urine pekat (hiperosmotik), sedangkan ikan air tawar sedikit minum dan mengeluarkan urine encer melimpah.\n" +
                "   • Adaptasi Tingkah Laku (Perilaku Organisme):\n" +
                "     - Mimikri bunglon mengubah warna kulit mengikuti latar belakang lingkungan.\n" +
                "     - Autotomi cecak memutuskan ekornya untuk mengelabui kucing pemangsa.\n" +
                "     - Mamalia paus dan lumba-lumba muncul secara periodik ke permukaan air untuk bernapas menghirup udara.\n\n" +
                "2. Prinsip Seleksi Alam:\n" +
                "   Lingkungan alam bertindak sebagai agen seleksi. Organisme yang memiliki variasi genetik yang menguntungkan memiliki peluang bertahan hidup dan bereproduksi lebih besar (*survival of the fittest*), mewariskan alel unggul tersebut kepada generasi berikutnya.\n\n" +
                "3. Konservasi & Pelestarian Lingkungan:\n" +
                "   • Ancaman Manusia: Deforestasi, perburuan liar, pencemaran limbah, pemanasan global, dan bioakumulasi mikroplastik.\n" +
                "   • Konservasi In-Situ (Pelestarian di habitat asli):\n" +
                "     Taman Nasional (TN Ujung Kulon untuk badak jawa, TN Komodo untuk komodo, TN Tanjung Puting untuk orangutan), Cagar Alam, Suaka Margasatwa.\n" +
                "   • Konservasi Ex-Situ (Pelestarian di luar habitat asli):\n" +
                "     Kebun Binatang, Taman Safari, Kebun Raya Bogor (bank plasma nutfah flora), dan Bank Biji/Sperma Beku (Cryopreservation).",
        intuitionPoints = listOf(
            "Mengapa jerapah berleher panjang menurut teori Darwin? Bukan karena sering meregangkan leher (teori Lamarck yang keliru), melainkan karena populasi purba jerapah memiliki variasi leher pendek dan panjang; saat daun rendah habis, hanya jerapah leher panjang yang bertahan hidup dan mewariskan gen leher panjang!",
            "Konservasi in-situ selalu lebih diutamakan karena melindungi seluruh ekosistem dan jaring-jaring makanan alami secara holistik.",
            "Eutrofikasi adalah ledakan alga akibat pencemaran limbah pupuk fosfat/nitrat berlebih di danau yang mengakibatkan ikan mati massal karena kehabisan oksigen terlarut."
        ),
        simId = "sim-adaptation",
        formulas = listOf(
            FormulaCard(
                symbol = "w",
                equation = "w = 1 - s",
                meaning = "Kebugaran Biologis (Biological Fitness / w) berbanding terbalik dengan Koefisien Seleksi (s).",
                units = "nilai relatif (0 hingga 1)",
                applicationNote = "Jika alel menyebabkan kematian sebelum bereproduksi, s = 1 sehingga nilai fitness w = 0."
            ),
            FormulaCard(
                symbol = "\\text{Osmoregulasi}",
                equation = "\\Delta \\Pi = RT \\times (C_{\\text{darah}} - C_{\\text{air}})",
                meaning = "Tekanan osmotik gradien cairan tubuh ikan terhadap media air lingkungan hidup.",
                units = "atm atau kPa",
                applicationNote = "Ikan laut harus terus mengeluarkan garam aktif lewat insang untuk melawan dehidrasi osmotik."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Penyelamatan Badak Jawa (Rhinoceros sondaicus) Berbasis Radar Kamera Jebak di TN Ujung Kulon",
            context = "Badak jawa adalah salah satu mamalia darat paling terancam punah di dunia dengan populasi tersisa kurang dari 80 ekor yang hanya terkonsentrasi di Semenanjung Ujung Kulon Banten.",
            engineeringProblem = "Badak jawa sangat pemalu, hidup soliter di hutan rawa lebat, dan rentan terhadap penularan penyakit dari banteng liar serta potensi tsunami anak Krakatau.",
            physicalConceptUsed = "Konservasi in-situ modern: penyebaran 150 unit camera trap sensor inframerah gerak termal 24 jam dan analisis DNA feses (non-invasive molecular scatology).",
            mathematicalModel = "Metode Capture-Mark-Recapture Spasial (SECR) memodelkan dinamika demografi, rasio jenis kelamin jantan-betina, dan indeks keragaman genetik heterozigositas populasi.",
            realWorldImpact = "Mencegah perburuan liar hingga titik nol selama 5 tahun terakhir, mendata kelahiran 4 anak badak baru setiap tahun, dan merencanakan habitat kedua (second habitat) yang aman.",
            relatedCareers = listOf("Biolog Satwa Liar (Wildlife Biologist)", "Spesialis GIS Konservasi Alam", "Pengendali Ekosistem Hutan (PEH)"),
            verifiedSource = "Balai Taman Nasional Ujung Kulon & Yayasan Badak Indonesia (YABI)."
        ),
        homeLab = HomeLabData(
            title = "Menguji Laju Penguapan Daun Berlilin (Adaptasi Xerofit) vs Daun Biasa",
            safetyLevel = "Mandiri (Sangat Aman)",
            materials = listOf(
                "2 lembar daun tanaman yang permukaannya tebal berlilin/kutikula tebal (misal: daun keladi, talas, lidah buaya, atau daun nangka tua)",
                "2 lembar daun tipis pekarangan biasa (misal: daun bayam, selada, atau rumput lebar)",
                "Kertas tisu dan piring datar",
                "Minyak goreng atau petroleum jelly / vaselin",
                "Tempat panas di bawah terik matahari"
            ),
            steps = listOf(
                "Langkah 1: Ambil 1 daun tipis (Spesimen A) dan 1 daun tebal berlilin alami (Spesimen B). Biarkan apa adanya.",
                "Langkah 2: Ambil 1 daun tipis lagi (Spesimen C), lalu olesi seluruh permukaannya dengan lapisan tipis minyak goreng/vaselin (simulasi lapisan kutikula buatan).",
                "Langkah 3: Letakkan ketiga daun berjajar di atas piring di bawah sinar terik matahari selama 2 jam.",
                "Langkah 4: Amati kondisi daun: Daun tipis A mengering, keriput, dan layu kecokelatan karena air menguap deras lewat stomata.",
                "Langkah 5: Daun tebal B dan daun berlapis lilin C tetap segar, lentur, dan hijau montok karena lapisan lilin mencegah transpirasi kehilangan air!"
            ),
            observationGoal = "Membuktikan secara langsung fungsi adaptasi morfologi lapisan kutikula lilin daun tumbuhan dalam menahan penguapan air di lingkungan panas terik.",
            connectionToSimulation = "Bandingkan daya tahan daunmu dengan simulasi seleksi alam kaktus gurun di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-adapt-1",
                prompt = "Bentuk paruh burung kolibri yang panjang dan ramping untuk menghisap nektar di dasar kelopak bunga merupakan contoh dari adaptasi...",
                type = "multiple_choice",
                options = listOf("Adaptasi Morfologi", "Adaptasi Fisiologi", "Adaptasi Tingkah Laku", "Adaptasi Buatan"),
                correctAnswer = "Adaptasi Morfologi",
                hints = listOf(
                    "Berkaitan dengan bentuk fisik luar tubuh burung.",
                    "Kata dasarnya berkaitan dengan struktur 'bentuk'."
                ),
                explanation = "Adaptasi morfologi adalah penyesuaian bentuk luar tubuh atau struktur alat-alat tubuh makhluk hidup terhadap lingkungan tempat hidup dan jenis makanannya.",
                misconception = "Menyamakan dengan fisiologi (fisiologi berhubungan dengan kerja kimiawi organ dalam)."
            ),
            QuizQuestion(
                id = "q-adapt-2",
                prompt = "Upaya pelestarian satwa langka yang dilakukan langsung di dalam habitat alamiah aslinya (seperti Taman Nasional dan Suaka Margasatwa) disebut konservasi...",
                type = "multiple_choice",
                options = listOf("In-Situ", "Ex-Situ", "Invitro", "Transgenik"),
                correctAnswer = "In-Situ",
                hints = listOf(
                    "Kata Latin 'In-situ' berarti 'di tempat asalnya'.",
                    "Contohnya: TN Komodo melindungi komodo di Pulau Komodo."
                ),
                explanation = "Konservasi In-situ adalah metode pelestarian keanekaragaman hayati flora dan fauna yang dilakukan di dalam habitat aslinya. Pelestarian di luar habitat asli (seperti kebun binatang) disebut konservasi Ex-situ.",
                misconception = "Tertukar antara istilah in-situ (di habitat asli) dan ex-situ (di luar habitat asli)."
            )
        )
    )

    // =========================================================================
    // 9. BIOTEKNOLOGI SEDERHANA & FERMENTASI PANGAN
    // =========================================================================
    private val bioteknologiDasarLesson = LessonData(
        conceptId = "bio-bioteknologi-dasar",
        level = DepthLevel.L2,
        storyPanels = listOf(
            StoryPanel(
                id = "pbtd1",
                panelNumber = 1,
                title = "Aroma Gurih Tempe Buatan Nenek",
                caption = "Kirana dan Dimas memperhatikan Nenek yang sedang memeriksa bungkusan daun pisang berisi kedelai yang diperam di sudut dapur.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Nenek, butir-butir kedelai ini kemarin masih terpisah, tapi pagi ini sudah menyatu padat diselimuti serabut putih lembut seperti kapas! Dari mana datangnya benang putih ini?",
                sceneVisualEmoji = "🥢",
                sceneDescription = "Kedelai terikat padat oleh hifa miselium jamur tempe putih bersih di dalam daun pisang."
            ),
            StoryPanel(
                id = "pbtd2",
                panelNumber = 2,
                title = "Pasukan Kapang Rhizopus",
                caption = "Kakek tersenyum memperlihatkan bubuk ragi tempe.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Serabut putih itu adalah Miselium kapang Rhizopus oryzae! Jamur mikroskopis ini menembus kedelai dan mengeluarkan enzim protease yang memecah protein alot menjadi asam amino siap serap!",
                sceneVisualEmoji = "🧫",
                sceneDescription = "Kapang tempe Rhizopus tumbuh membentuk jaringan hifa putih yang kokoh."
            ),
            StoryPanel(
                id = "pbtd3",
                panelNumber = 3,
                title = "Ragi Roti & Fermentasi Karbondioksida",
                caption = "Dimas membantu Ibu menguleni adonan roti donat yang mengembang dua kali lipat.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Adonan donat mengembang besar karena khamir Saccharomyces cerevisiae memakan gula dan melepaskan gelembung gas CO₂ yang terperangkap di dalam gluten tepung!",
                sceneVisualEmoji = "🍞",
                sceneDescription = "Adonan roti mengembang berpori-pori halus akibat hembusan gas CO2 hasil fermentasi ragi."
            ),
            StoryPanel(
                id = "pbtd4",
                panelNumber = 4,
                title = "Bioteknologi Tradisional Kebanggaan Bangsa",
                caption = "Kakek menyajikan tempe goreng hangat bersama yogurt dingin segar.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Mulai dari tempe, tapai, kecap, hingga yogurt probiotik Lactobacillus: bioteknologi fermentasi sederhana telah menyehatkan pencernaan manusia selama ribuan tahun tanpa perlu alat laboratorium mahal!",
                sceneVisualEmoji = "🥛",
                sceneDescription = "Hidangan hasil fermentasi pangan tradisional yang lezat dan kaya nutrisi probiotik."
            )
        ),
        intuitionTitle = "Bioteknologi Fermentasi: Sihir Biokimia Mikroorganisme Pangan",
        intuitionBody = "Bioteknologi konvensional adalah pemanfaatan organisme utuh (khususnya bakteri dan fungi jamur/khamir) secara langsung melalui proses biokimia alami fermentasi untuk mengubah bahan mentah menjadi produk pangan bernilai tambah tinggi.\n\n" +
                "1. Prinsip Biokimia Fermentasi (Respirasi Anaerob):\n" +
                "   Fermentasi adalah penguraian karbohidrat dan protein dalam kondisi tanpa oksigen bebas (anaerobik) yang menghasilkan energi, asam organik, gas, dan alkohol harum.\n\n" +
                "2. Empat Pilar Fermentasi Pangan Utama:\n" +
                "   A. Tempe (Kapang *Rhizopus oryzae* & *Rhizopus oligosporus*):\n" +
                "      • Bahan: Biji kedelai rebus.\n" +
                "      • Proses: Hifa kapang tumbuh membentuk miselium putih yang merekatkan butiran kedelai menjadi blok padat. Enzim protease memecah protein kompleks kedelai menjadi peptida dan asam amino yang mudah dicerna tubuh, serta menghilangkan senyawa anti-nutrisi fitat.\n" +
                "   B. Roti & Tapai (Khamir *Saccharomyces cerevisiae*):\n" +
                "      • Bahan: Tepung terigu (roti) atau singkong/ketan (tapai).\n" +
                "      • Reaksi Fermentasi Alkohol: Glukosa dipecah menjadi Etanol (aroma harum alkohol manis) + Gas Karbondioksida (CO₂).\n" +
                "      • Pada pembuatan roti, gas CO₂ terperangkap membentuk rongga-rongga udara empuk pada roti saat dipanggang di oven.\n" +
                "   C. Yogurt & Keju (Bakteri Asam Laktat: *Lactobacillus bulgaricus* & *Streptococcus thermophilus*):\n" +
                "      • Bahan: Susu sapi murni.\n" +
                "      • Proses: Bakteri memfermentasi gula laktosa susu menjadi asam laktat. Asam laktat menurunkan pH hingga asam (~4,5), menyebabkan protein kasein susu menggumpal (koagulasi) membentuk tekstur kental lembut dan rasa asam menyegarkan yang membunuh bakteri patogen usus.\n" +
                "   D. Nata de Coco (*Acetobacter xylinum*):\n" +
                "      • Bahan: Air kelapa bergula.\n" +
                "      • Proses: Bakteri merajut serat-serat selulosa murni ekstraseluler di permukaan cairan membentuk lapisan gel putih kenyal bertekstur kenyal kaya serat pangan.\n\n" +
                "3. Keunggulan Bioteknologi Fermentasi Tradisional:\n" +
                "   • Meningkatkan nilai gizi (kandungan vitamin B12 dan asam amino esensial).\n" +
                "   • Mengawetkan makanan secara alami tanpa bahan kimia sintetis karena asam organik menghambat mikroba pembusuk.\n" +
                "   • Meningkatkan daya cerna dan menjaga kesehatan mikrobioma saluran pencernaan usus.",
        intuitionPoints = listOf(
            "Tempe adalah satu-satunya sumber vitamin B12 nabati alami yang signifikan di dunia, dihasilkan berkat aktivitas mikroorganisme selama proses fermentasi.",
            "Mengapa tapai singkong terasa manis beralkohol dan berair? Karena enzim amilase memecah pati singkong menjadi glukosa manis, lalu sebagian glukosa diubah khamir menjadi alkohol.",
            "Suhu fermentasi harus dijaga hangat stabil (~30–37°C); suhu terlalu panas mematikan ragi mikroba, sedangkan suhu dingin membekukan aktivitas enzim metabolisme."
        ),
        simId = "sim-fermentation-basic",
        formulas = listOf(
            FormulaCard(
                symbol = "\\text{Fermentasi Alkohol}",
                equation = "C_6H_{12}O_6 \\xrightarrow{\\text{Saccharomyces}} 2 C_2H_5OH + 2 CO_2 + 2 \\text{ ATP}",
                meaning = "Reaksi biokimia respirasi anaerob fermentasi alkohol dari 1 molekul glukosa.",
                units = "Persamaan reaksi biokimia molar",
                applicationNote = "Menghasilkan 2 molekul etanol, 2 gas CO₂ peniup rongga roti, dan 2 molekul energi hayati ATP."
            ),
            FormulaCard(
                symbol = "\\text{Fermentasi Laktat}",
                equation = "C_6H_{12}O_6 \\xrightarrow{\\text{Lactobacillus}} 2 CH_3CH(OH)COOH + 2 \\text{ ATP}",
                meaning = "Reaksi biokimia fermentasi asam laktat pada pembuatan yogurt dari susu.",
                units = "Persamaan reaksi biokimia molar",
                applicationNote = "Asam laktat menurunkan pH susu dan menggumpalkan protein kasein menjadi tekstur yogurt lembut."
            )
        ),
        caseStudy = CaseStudyData(
            title = "Modernisasi Produksi Tempe Higienis Standar Ekspor di Rumah Tempe Indonesia (RTI) Bogor",
            context = "Pengrajin tempe tradisional kerap terkendala mutu higienitas air sumur, inkonsistensi suhu fermentasi, dan masa simpan tempe yang pendek (hanya 2 hari).",
            engineeringProblem = "Merancang fasilitas produksi tempe semimodern bersertifikat HACCP dan ISO 22000 untuk mengekspor tempe segar beku ke Jepang dan Eropa.",
            physicalConceptUsed = "Kendali parameter fisika-biologis: sterilisasi uap bertekanan, inokulasi bibit murni galur *Rhizopus oligosporus*, serta ruang inkubasi terkontrol suhu 32°C dan kelembaban 85%.",
            mathematicalModel = "Mengatur sirkulasi aerasi oksigen konstan dan ketebalan lapisan kedelai 3 cm untuk mencegah pemanasan berlebih (over-heating akibat panas metabolisme eksotermik miselium jamur).",
            realWorldImpact = "Menghasilkan tempe premium bebas bau apek, tahan simpan 12 bulan dalam kondisi beku, dan menembus pasar swalayan Tokyo dan Amsterdam dengan harga 5 kali lipat.",
            relatedCareers = listOf("Teknolog Pangan (Food Technologist)", "Auditor Keamanan Pangan HACCP", "Mikrobiolog Industri Fermentasi"),
            verifiedSource = "Rumah Tempe Indonesia (RTI) & Forum Tempe Indonesia (FTI) Bogor."
        ),
        homeLab = HomeLabData(
            title = "Membuat Yogurt Sendiri di Rumah dari Susu UHT dan Kultur Probiotik",
            safetyLevel = "Dampingi Orang Dewasa",
            materials = listOf(
                "500 mL susu sapi cair putih UHT (plain tanpa perisa)",
                "2 sendok makan yogurt tawar komersial yang bertuliskan 'mengandung kultur bakteri hidup' (plain yogurt)",
                "Panci bersih dan sendok pengaduk",
                "Termos air panas atau toples kaca bersih bertutup rapat",
                "Handuk tebal atau kain selimut kecil"
            ),
            steps = listOf(
                "Langkah 1: Tuang susu ke dalam panci, hangatkan di atas api kecil hingga suam-suam kuku hangat (sekitar 40–45°C: terasa hangat nyaman di punggung tangan, jangan sampai mendidih!).",
                "Langkah 2: Matikan api. Masukkan 2 sendok makan yogurt tawar sebagai bibit inokulum bakteri Lactobacillus. Aduk rata perlahan.",
                "Langkah 3: Tuangkan campuran susu hangat ke dalam toples kaca atau termos bersih, lalu tutup rapat kedap udara.",
                "Langkah 4: Bungkus toples dengan handuk tebal untuk menjaga suhu hangatnya stabil, lalu simpan di tempat tenang (misal: di dalam lemari atau oven mati) selama 8–10 jam.",
                "Langkah 5: Buka toples: susu telah mengental menjadi yogurt padat beraroma asam segar yang lezat! Simpan di lemari es sebelum dinikmati."
            ),
            observationGoal = "Mengamati langsung aktivitas fermentasi bakteri asam laktat yang menggumpalkan protein susu menjadi yogurt kental.",
            connectionToSimulation = "Bandingkan perubahan pH dan keasaman susumu dengan simulator fermentasi mikroba di bawah!"
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-biot-dasar-1",
                prompt = "Mikroorganisme apakah yang berperan mengikat butiran kedelai menjadi tempe melalui pertumbuhan hifa miselium benang putihnya?",
                type = "multiple_choice",
                options = listOf("Kapang Rhizopus oryzae", "Bakteri Lactobacillus bulgaricus", "Khamir Saccharomyces cerevisiae", "Bakteri Acetobacter xylinum"),
                correctAnswer = "Kapang Rhizopus oryzae",
                hints = listOf(
                    "Termasuk jenis jamur benang/kapang tempe.",
                    "Nama ilmiahnya memiliki kata 'Rhizopus'."
                ),
                explanation = "Tempe dibuat melalui proses fermentasi biji kedelai menggunakan kapang *Rhizopus oryzae* atau *Rhizopus oligosporus* yang membentuk hifa putih penyatu kedelai.",
                misconception = "Menyamakan dengan khamir ragi roti (*Saccharomyces*)."
            ),
            QuizQuestion(
                id = "q-biot-dasar-2",
                prompt = "Pada pembuatan roti, adonan tepung terigu dapat mengembang besar dan empuk berongga akibat gas yang dilepaskan oleh ragi khamir Saccharomyces. Gas apakah itu?",
                type = "multiple_choice",
                options = listOf("Gas Karbondioksida (CO₂)", "Gas Oksigen (O₂)", "Gas Nitrogen (N₂)", "Gas Metana (CH₄)"),
                correctAnswer = "Gas Karbondioksida (CO₂)",
                hints = listOf(
                    "Gas yang sama yang dihasilkan manusia saat membuang napas.",
                    "Rumus kimianya adalah CO₂."
                ),
                explanation = "Fermentasi alkohol oleh ragi *Saccharomyces cerevisiae* memecah glukosa menghasilkan etanol dan gas Karbondioksida (CO₂). Gas CO₂ inilah yang terperangkap dalam serat gluten adonan sehingga roti mengembang empuk.",
                misconception = "Mengira adonan mengembang karena terisi gas oksigen."
            )
        )
    )
}

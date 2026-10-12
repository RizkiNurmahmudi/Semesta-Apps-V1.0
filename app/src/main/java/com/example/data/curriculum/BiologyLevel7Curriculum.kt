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

object BiologyLevel7Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "bio-scrna-seq-sel-tunggal",
            domain = Domain.BIOLOGI,
            topic = "Transkriptomik Resolusi Sel Tunggal",
            title = "Genomik Sel Tunggal: scRNA-Seq, Rekonstruksi Pseudotime & Transkriptomik Spasial",
            description = "Isolasi mikrofluida droplet berkode batang UMI, resolusi heterogenitas seluler mikro, rekonstruksi lintasan trajektori pseudotime diferensiasi, dan pemetaan transkriptomik spasial.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("bio-bioinformatika-komputasi-debruijn", "bio-mol-regulasi-transkripsi-mirna")
        ),
        ConceptItem(
            id = "bio-prime-editing-terapi-gen",
            domain = Domain.BIOLOGI,
            topic = "Rekayasa Genom Presisi & Terapi Gen",
            title = "Pengeditan Genom Presisi: Base Editing, Prime Editing & Terapi Seluler CAR-T",
            description = "Transisi nukleotida sitosin/adenin deaminasi tanpa DSB, pencarian pegpegRNA reverse transcriptase Prime Editing, terapi sel T reseptor antigen kimerik (CAR-T), dan vektor LNP.",
            level = DepthLevel.L7,
            estMinutes = 27,
            prerequisites = listOf("bio-mol-teknik-rekayasa-crispr", "bio-biologi-kanker-hallmarks")
        ),
        ConceptItem(
            id = "bio-biologi-struktural-cryo-em",
            domain = Domain.BIOLOGI,
            topic = "Biologi Struktural Resolusi Atomik",
            title = "Biologi Struktural: Cryo-EM Partikel Tunggal & Rekonstruksi 3D Makromolekul",
            description = "Vitrifikasi kriogenik etana cair bebas es kristal, mikroskop transmisi elektron Cryo-TEM, detektor elektron langsung (DDD), dan penentuan fase 3D klasifikasi partikel tunggal.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("bio-mol-transduksi-sinyal-gpcr", "fis-optik-lanjut-laser-nonlinear")
        ),
        ConceptItem(
            id = "bio-machine-learning-alphafold",
            domain = Domain.BIOLOGI,
            topic = "Kecerdasan Buatan untuk Biologi",
            title = "AI untuk Biologi: Prediksi Struktur 3D Protein AlphaFold & Model Bahasa Multi-Omik",
            description = "Arsitektur jaringan saraf perhatian ganda Evoformer AlphaFold2/3, penyelarasan multi-sekuens (MSA), representasi pasangan residu, dan model bahasa protein (pLM) ESMFold.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("bio-biologi-struktural-cryo-em", "kim-ai-ml-de-novo-design")
        ),
        ConceptItem(
            id = "bio-evo-devo-heterokroni",
            domain = Domain.BIOLOGI,
            topic = "Biologi Evolusi Perkembangan",
            title = "Evo-Devo: Heterokroni, Perangkat Genetik Pembangun & Asal Morfologi",
            description = "Evolusi melalui modifikasi perkembangan embrio, pergeseran waktu laju pertumbuhan (heterokroni pedomorfosis), mutasi elemen pengatur cis-regulatorik, dan konservasi gen Pax6/Hox.",
            level = DepthLevel.L7,
            estMinutes = 25,
            prerequisites = listOf("bio-dev-embriogenesis-gen-hox", "bio-evolusi-kladistika")
        ),
        ConceptItem(
            id = "bio-metagenomik-mikrobioma-gut-brain",
            domain = Domain.BIOLOGI,
            topic = "Metagenomik & Mikrobioma Tubuh",
            title = "Mikrobioma Manusia & Metagenomik: Poros Usus-Otak (Gut-Brain Axis)",
            description = "Sekuensing metagenomik shotgun klaster gen metabolik, produksi asam lemak rantai pendek (SCFA), pensinyalan saraf vagus poros mikrobioma usus-otak, dan disregulasi metabolik imun.",
            level = DepthLevel.L7,
            estMinutes = 25,
            prerequisites = listOf("bio-mikro-anaerob-quorum-sensing", "bio-neurosains-optogenetika")
        ),
        ConceptItem(
            id = "bio-cell-factories-asam-amino-sintetik",
            domain = Domain.BIOLOGI,
            topic = "Biologi Sintetis & Rekayasa Metabolik",
            title = "Rekayasa Sel Pabrik (Cell Factories) & Asam Amino Non-Kanonik Sintetis",
            description = "Rekayasa fluks metabolik flux-balance analysis (FBA), inaktivasi jalur kompetitor mikroba sel inang, penugasan ulang kodon henti (amber codon reassignment), dan tRNA sintetase ortogonal.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("bio-biologi-sistem-sintetis", "kim-biokimia-jalur-metabolisme-respirasi")
        ),
        ConceptItem(
            id = "bio-ekologi-perubahan-iklim-global",
            domain = Domain.BIOLOGI,
            topic = "Ekologi Biosfer Global & Perubahan Iklim",
            title = "Biologi Perubahan Iklim: Titik Kritis Biosfer (Tipping Points) & Plastisitas Fenotipik",
            description = "Pemodelan pergeseran bioma global, kurva performa termal ektoterm, ketidaksesuaian fenologis musiman, batas plastisitas genom adaptif, dan titik kritis keruntuhan hutan hujan tropis.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("bio-konservasi-fragmentasi-pva", "bio-biologi-kelautan-kemosintesis")
        ),
        ConceptItem(
            id = "bio-biofisika-koherensi-kuantum",
            domain = Domain.BIOLOGI,
            topic = "Biologi Kuantum & Biofisika Lanjut",
            title = "Biologi Kuantum: Koherensi Kuantum Fotosintesis & Kompas Kriptokrom Burung",
            description = "Transfer energi eksiton koheren kompleks Fenna-Matthews-Olson (FMO), mekanisme pasangan radikal spin terbelit kompas kriptokrom navigasi magnetik burung, dan penerowongan proton enzimatik.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("bio-biofisika-molekuler", "fis-informasi-komputasi-kuantum")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "bio-scrna-seq-sel-tunggal" -> LessonData(
                conceptId = "bio-scrna-seq-sel-tunggal",
                simId = "sim-scrna-seq-pseudotime",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, jika kita mengambil sepotong jaringan biopsi hati atau tumor kanker dan mengekstrak seluruh RNA-nya, kita hanya mendapatkan rata-rata ekspresi campuran jutaan sel. Bagaimana jika ada satu sel punca langka yang memicu kekambuhan kanker?",
                        narrativeContext = "Dimas memandangi heterogenitas mikroskopis populasi sel di dalam mikrolingkungan tumor."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Para ilmuwan beralih ke Single-Cell RNA Sequencing (scRNA-Seq), Dimas! Mikrofluida mengisolasi setiap sel tunggal ke dalam tetesan minyak mikro (droplet) bersama satu manik bermikrokode batang (barcode) dan Unique Molecular Identifier (UMI).",
                        narrativeContext = "Kakek menggambarkan enkapsulasi sel tunggal dalam droplet mikrofluida 10x Genomics."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan menggunakan algoritma analisis manifold trajektori Pseudotime (seperti Monocle), kita dapat merekonstruksi garis waktu diferensiasi sel punca menjadi sel dewasa secara kontinu dari snapshot statis jutaan sel tunggal!",
                        narrativeContext = "Kirana memperlihatkan proyeksi UMAP sel-sel yang bercabang laksana ranting pohon diferensiasi."
                    )
                ),
                intuitionBody = """
                    Genomik dan Transkriptomik Sel Tunggal (Single-Cell Omics) memecahkan keterbatasan analisis 'bulk' konvensional dengan membedah profil ekspresi gen pada tingkat resolusi satu sel individual.
                    
                    1. Teknologi Droplet-Based scRNA-Seq (10x Genomics Chromium):
                       - Enkapsulasi Mikrofluida: Sel tunggal disuspensikan dan dialirkan melalui saluran mikrofluida berpotongan silang dengan aliran minyak, menghasilkan emulsi tetesan air-dalam-minyak (droplets).
                       - Kode Batang Manik Gel (Gel Bead-in-Emulsion / GEM): Setiap droplet memuat satu manik berlapis jutaan primer penangkap poli-T yang memiliki:
                         * Cell Barcode (16 bp): Mengidentifikasi dari sel mana molekul RNA berasal.
                         * Unique Molecular Identifier (UMI, 10-12 bp): Barcode acak untuk setiap molekul transkrip tunggal asli, mengeliminasi bias duplikasi PCR amplifikasi.
                       - Transkripsi Balik & Sekuensing: Sel dilisis di dalam droplet, cDNA disintesis, digabungkan, dan disekuensing serentak pada instrumen NGS Illumina/NovaSeq.
                       
                    2. Alur Analisis Komputasi (Bioinformatika Sel Tunggal):
                       - Reduksi Dimensi: Matriks hitungan sel-versus-gen (biasanya 20.000 gen x 10.000 sel) disaring dari sel mati/mitokondria tinggi, dinormalisasi logaritma, lalu direduksi dimensinya menggunakan Analisis Komponen Utama (PCA) diikuti reduksi non-linear UMAP (Uniform Manifold Approximation and Projection) atau t-SNE.
                       - Pengelompokan Klaster (Clustering): Algoritma grafik berbasis komunitas Louvain atau Leiden mengelompokkan sel menjadi jenis sel spesifik berdasarkan gen penanda (marker genes).
                       - Rekonstruksi Lintasan Trajektori (Pseudotime Analysis): Memodelkan transisi biologis diferensiasi sel atau aktivasi imun sebagai kurva mulus satu dimensi sepanjang manifold ruang keadaan transkriptomik.
                       
                    3. Transkriptomik Spasial (Spatial Transcriptomics):
                       Mengatasi kelemahan scRNA-Seq yang kehilangan informasi letak posisi anatomi jaringan (karena sel harus didisosiasi menjadi suspensi cair).
                       Menggunakan susunan kisi koordinat kode batang spasial mikroskopis di atas kaca preparat (Visium / Xenium / MERFISH), memetakan ekspresi ribuan gen langsung pada irisan jaringan histologi utuh.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "scRNA-Seq adalah analogi membedah salad buah: alih-alih meminum jus campur (bulk), kita dapat mencicipi rasa apel, stroberi, dan anggur secara terpisah.",
                    "Kode UMI bertindak sebagai nomor seri unik cetakan molekul RNA asli, mencegah pembesaran palsu akibat siklus PCR berlebih.",
                    "Pseudotime tidak mengukur detik jam fisik riil, melainkan tingkat kematangan diferensiasi seluler sepanjang trajektori transkriptomik.",
                    "Transkriptomik spasial menyatukan patologi anatomi klasik dengan kekayaan data biologi molekuler genomik genom utuh."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Normalisasi Kedalaman Transkriptomik Sel Tunggal",
                        latex = "Y_{ig} = \\ln\\left( 1 + \\frac{X_{ig}}{\\sum_{g'} X_{ig'}} \\times 10^4 \\right)",
                        explanation = "Normalisasi hitungan transkrip gen g pada sel individual i terhadap ukuran pustaka total sel tersebut."
                    ),
                    FormulaCard(
                        title = "Jarak Geodesik Manifold Trajektori Pseudotime",
                        latex = "\\tau(x) = \\int_{x_0}^x \\|\\nabla \\Phi(s)\\|\\,ds",
                        explanation = "Waktu semu pseudotime tau dihitung sebagai panjang lintasan integral geodesik dari sel punca akar x0 ke sel diferensiasi x."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pemetaan Atlas Sel Tunggal Jaringan Paru Pasien Tuberkulosis di FKUI & Pusat Riset Vaksin BRIN",
                    scenario = "Bakteri Mycobacterium tuberculosis bersembunyi di dalam struktur granuloma paru manusia yang terdiri dari campuran kompleks berbagai macam sel imun.",
                    application = "Peneliti biomedis menerapkan scRNA-Seq dan transkriptomik spasial pada sampel biopsi jaringan granuloma paru TB. Mereka mengidentifikasi subpopulasi langka makrofag epiteloid imunosupresif dan sel T CD8+ yang mengalami kelelahan transkripsi (exhausted T-cells) yang belum pernah terdeteksi sebelumnya dengan metode sitometri alir biasa, mengungkap bagaimana bakteri membajak jalur pensinyalan seluler lokal untuk bertahan hidup.",
                    impact = "Membuka rute target terapi obat seluler pendukung antibiotik untuk mempercepat pemulihan pasien tuberkulosis paru."
                ),
                homeLab = HomeLabData(
                    title = "Analogi Pemisahan Populasi Sel Berdasarkan Ciri Jamak Menggunakan Butiran Manik Aneka Warna",
                    objective = "Memahami konsep reduksi dimensi spasial untuk mengelompokkan entitas heterogen berdasarkan kemiripan profil.",
                    materials = listOf("Campuran 50 butir kancing baju dengan variasi 3 parameter: warna (merah/biru), ukuran (besar/kecil), dan jumlah lubang (2/4)", "Kertas besar dan spidol"),
                    steps = listOf(
                        "Sebarkan kancing baju di atas meja secara acak.",
                        "Gambarkan sumbu X (Ukuran) dan sumbu Y (Jumlah Lubang) pada kertas besar.",
                        "Letakkan setiap kancing pada koordinat yang sesuai; tandai warna kancing sebagai lapisan informasi ketiga.",
                        "Amati pembentukan klaster alami di mana kancing-kancing yang memiliki sifat serupa berkumpul di kuadran yang sama.",
                        "Diskusikan bagaimana komputer bioinformatika memperluas prinsip pemetaan ini dari 3 variabel menjadi 20.000 variabel gen pada analisis UMAP scRNA-Seq."
                    ),
                    safetyNote = "Praktikum konsep klasifikasi meja kerja, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah fungsi utama dari Unique Molecular Identifier (UMI) pada protokol sekuensing RNA sel tunggal (scRNA-Seq)?",
                        options = listOf(
                            "Membedakan molekul transkrip mRNA asli individual sebelum proses amplifikasi PCR, sehingga salinan duplikasi PCR yang berulang dapat dihitung sebagai satu molekul tunggal untuk mencegah bias kuantifikasi",
                            "Memberikan warna pelangi pada sel di bawah mikroskop",
                            "Memotong DNA menjadi potongan-potongan kecil",
                            "Membunuh sel bakteri kontaminan di dalam tabung reaksi"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Sebelum siklus PCR dijalankan, setiap molekul mRNA dilekati UMI acak yang berbeda. Selama PCR, satu molekul mRNA dapat diperbanyak menjadi ribuan salinan; namun semuanya membawa UMI yang sama persis. Perangkat lunak bioinformatika hanya menghitung jumlah UMI unik, memastikan bahwa tingkat ekspresi mencerminkan jumlah transkrip asli di dalam sel tanpa distorsi amplifikasi.",
                        misconceptionAlert = "Cell Barcode memberi tahu kita sel mana asal molekul tersebut; UMI memberi tahu kita molekul transkrip individual mana yang dihitung."
                    )
                )
            )

            "bio-prime-editing-terapi-gen" -> LessonData(
                conceptId = "bio-prime-editing-terapi-gen",
                simId = "sim-prime-editing-cart",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, CRISPR-Cas9 klasik memotong kedua untai DNA (Double-Strand Break / DSB). Bukankah pemotongan untai ganda itu berbahaya karena sel bisa salah menyambung dan memicu delesi acak atau translokasi kromosom kanker?",
                        narrativeContext = "Dimas membaca tentang risiko efek off-target dan karsinogenesis pada pengeditan genom generasi pertama."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Kekhawatiranmu sangat tepat, Dimas! Karena itulah David Liu mengembangkan Prime Editing dan Base Editing! Prime Editing bertindak laksana fitur 'Cari dan Ganti' (Search-and-Replace) pengolah kata—menuliskan informasi genetik baru langsung ke DNA tanpa memotong untai ganda sama sekali!",
                        narrativeContext = "Kakek menggambarkan fusi Cas9 nikase (H840A) dengan enzim Reverse Transcriptase dan RNA pemandu pegRNA."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan dalam Terapi Sel CAR-T, sel T pasien dipersenjatai reseptor sintetis pembunuh kanker, dikemas dalam Nanopartikel Lipid (LNP) in vivo untuk menyembuhkan leukemia dan limfoma ganas!",
                        narrativeContext = "Kirana memperlihatkan sel T CAR menyerang antigen CD19 pada permukaan sel limfoma."
                    )
                ),
                intuitionBody = """
                    Pengeditan Genom Presisi dan Rekayasa Terapi Seluler membawa terapi gen dari era pemotongan acak menuju perbaikan korektif mutasi nukleotida setingkat bedah mikro molekuler bebas pemotongan untai ganda.
                    
                    1. Pengeditan Basa (Base Editing / CBE & ABE):
                       - Menggabungkan Cas9 nikase (Cas9n yang hanya memotong satu untai DNA) dengan enzim deaminase:
                         * Cytosine Base Editor (CBE): Mengubah sitosin (C) menjadi urasil (U) melalui deaminasi sitidin, yang terbaca sebagai timin (T) saat replikasi (transisi C-G -> T-A).
                         * Adenine Base Editor (ABE): Mengubah adenin (A) menjadi inosin (I) melalui deaminasi adenosin, yang terbaca sebagai guanin (G) (transisi A-T -> G-C).
                       Bekerja tanpa memicu Double-Strand Breaks (DSB) dan tanpa memerlukan cetakan donor DNA luar, efisiensi tinggi dengan pembentukan indel < 1%.
                       
                    2. Pengeditan Utama (Prime Editing / PE):
                       Dikembangkan oleh Andrew Anzalone dan David Liu (2019), mampu menuliskan sebarang transisi, transversi, insersi terarah, atau delesi presisi:
                       - Komponen Prime Editor: Fusi protein Cas9 nikase H840A dengan enzim Transkriptase Balik terkayakan (Engineered M-MLV Reverse Transcriptase).
                       - prime editing guide RNA (pegRNA): Pemandu multifungsi yang memuat urutan spacer penentu target DNA, daerah primer binding site (PBS), dan urutan cetakan transkripsi balik (RT template) yang mengkodekan urutan genetik baru yang diinginkan.
                       - Mekanisme: Cas9n memotong satu untai DNA (nicking) -> Ujung 3'-OH terpotong menempel pada PBS pegRNA -> Enzim Reverse Transcriptase menyalin langsung cetakan RT ke dalam untai DNA -> Membentuk flap 3' DNA yang membawa editan baru -> Sel memperbaiki untai komplementer non-editan melalui nicking kedua (sistem PE2/PE3).
                       
                    3. Imunoterapi Sel T Reseptor Antigen Kimerik (CAR-T Cell Therapy):
                       - Rekayasa Reseptor CAR Sintetis: Menggabungkan domain pengenal antigen ekstraseluler fragmen antibodi rantai tunggal (scFv, misal anti-CD19) dengan domain transmembran dan domain pensinyalan intraseluler sel T (CD3-zeta) serta domain ko-stimulasi kuat (4-1BB atau CD28).
                       - Vektor Penghantaran In Vivo Modern: Menggunakan Nanopartikel Lipid (Lipid Nanoparticles / LNP) terenkapsulasi mRNA untuk memprogram ulang sel T langsung di dalam peredaran darah pasien tanpa perlunya kultur sel ek vivo yang mahal.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Prime Editing menyelesaikan kelemahan terbesar CRISPR klasik: mampu melakukan semua jenis koreksi genetik tanpa pemotongan untai ganda DNA.",
                    "Base Editor mengoreksi mutasi titik tunggal transisi yang menyumbang lebih dari separuh seluruh kelainan genetik herediter manusia.",
                    "Sel CAR-T adalah 'obat hidup' mandiri: sel membelah, mengenali sel kanker target, dan membunuhnya secara spesifik di seluruh tubuh.",
                    "Formulasi LNP membawa terapi gen dari laboratorium bedah sel canggih ke dalam bentuk injeksi obat siap pakai di rumah sakit umum."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Arsitektur pegRNA Prime Editing",
                        latex = "\\text{pegRNA} = [\\text{Spacer}_{20\\,\\mathrm{nt}}] - [\\text{Scaffold}] - [\\text{RT Template}_{10-16\\,\\mathrm{nt}}] - [\\text{PBS}_{13\\,\\mathrm{nt}}]",
                        explanation = "Panduan RNA yang memuat daerah pengenal target genomik, penempelan primer 3', dan cetakan sekuens DNA baru yang disalin langsung ke genom."
                    ),
                    FormulaCard(
                        title = "Struktur Reseptor CAR-T Generasi Kedua",
                        latex = "\\mathrm{CAR} = \\mathrm{scFv}_{\\text{target}} - \\text{Hinge} - \\mathrm{TM} - [\\text{Domain Ko-stimulasi 4-1BB}] - [\\text{Domain Aktivasi } \\mathrm{CD3}\\zeta]",
                        explanation = "Reseptor kimerik fusi sintetis yang mengarahkan sitotoksisitas sel T spesifik membunuh sel tumor target."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Koreksi Mutasi Titik Gen Beta-Talasemia Sel Punca Darah Pasien Indonesia dengan Base Editing",
                    scenario = "Indonesia berada di sabuk talasemia dunia dengan prevalensi pembawa sifat beta-talasemia mencapai 3-10% populasi, menyebabkan ketergantungan transfusi darah seumur hidup.",
                    application = "Peneliti terapi gen FKUI-RSCM memanfaatkan Adenine Base Editor (ABE8e) untuk mengoreksi mutasi titik mutasi IVS1-110 (G>A) pada sel punca hematopoietik (HSC) CD34+ pasien beta-talasemia mayor. Dengan efisiensi pengeditan >80% dan tingkat indel <0.5%, ekspresi rantai beta-globin normal berhasil dipulihkan secara penuh di dalam sel darah merah hasil diferensiasi in vitro.",
                    impact = "Membuka era kuratif permanen bebas transfusi darah bagi puluhan ribu anak penderita talasemia di seluruh Indonesia."
                ),
                homeLab = HomeLabData(
                    title = "Simulasi Konsep Prime Editing Search-and-Replace Menggunakan Dua Tali Pita Bertanda Huruf",
                    objective = "Memvisualisasikan alur kerja penempelan PBS, transkripsi balik cetakan, dan penyisipan flap 3' DNA.",
                    materials = listOf("Dua utas pita kain panjang (merepresentasikan untai ganda DNA)", "Satu carik pita kertas bertuliskan huruf sekuens baru (merepresentasikan pegRNA)", "Gunting dan selotip"),
                    steps = listOf(
                        "Tuliskan sekuens asli pada kedua pita kain: 'A-T-G-C-C-A-A-T'.",
                        "Gunting hanya SATU pita pada satu sisi (nicking satu untai oleh Cas9 nikase, untai pasangan tetap utuh).",
                        "Tempelkan carik kertas pegRNA pada ujung pita yang terpotong (penempelan Primer Binding Site PBS).",
                        "Tuliskan huruf baru 'G-G' di ujung carik (penyalinan Reverse Transcriptase).",
                        "Potong bagian huruf asli lama, rekatkan bagian huruf baru 'G-G' ke dalam pita utama dengan selotip (integrasi flap 3').",
                        "Diskusikan mengapa pengeditan untai tunggal ini jauh lebih aman dibandingkan memotong kedua pita kain secara bersamaan."
                    ),
                    safetyNote = "Praktikum konsep peraga kain meja kerja, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah perbedaan paling fundamental antara Prime Editing dengan sistem pengeditan CRISPR-Cas9 generasi pertama?",
                        options = listOf(
                            "Prime Editing tidak memotong kedua untai DNA (tanpa Double-Strand Breaks / DSB) dan menyalin urutan genetik baru langsung dari cetakan pegRNA menggunakan enzim reverse transcriptase, meminimalkan mutasi indel acak",
                            "Prime Editing menggunakan laser pemanas bukan molekul biologi",
                            "CRISPR-Cas9 tidak menggunakan RNA pemandu",
                            "Prime Editing hanya bisa memotong sel bakteri dan tidak bisa bekerja pada manusia"
                        ),
                        correctOptionIndex = 0,
                        explanation = "CRISPR-Cas9 klasik mengandalkan pemotongan kedua untai ganda DNA (DSB), yang kemudian memicu mekanisme perbaikan darurat sel (NHEJ) yang seringkali menghasilkan insersi/delesi (indel) acak berbahaya atau translokasi kromosom. Prime Editing hanya memotong satu untai (nick) dan mensintesis urutan baru yang tepat sasaran secara langsung menggunakan reverse transcriptase terarah pegRNA.",
                        misconceptionAlert = "Prime Editing bukan menggantikan Cas9 dengan enzim lain, melainkan memodifikasi Cas9 menjadi nikase yang difusikan dengan enzim reverse transcriptase."
                    )
                )
            )

            "bio-biologi-struktural-cryo-em" -> LessonData(
                conceptId = "bio-biologi-struktural-cryo-em",
                simId = "sim-cryo-em-structural",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana para ilmuwan bisa menentukan struktur 3D atomik protein lonjakan (Spike) virus SARS-CoV-2 hanya dalam hitungan minggu setelah pandemi merebak, padahal kristalisasi protein biasanya butuh waktu bertahun-tahun atau bahkan mustahil?",
                        narrativeContext = "Dimas melihat model struktur resolusi tinggi 2.8 Ångström protein lonjakan virus dengan ligan glikan glikosilasinya."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu dimungkinkan oleh Revolusi Resolusi Mikroskopi Cryo-EM (Cryogenic Electron Microscopy)! Kita tidak perlu menumbuhkan kristal protein sama sekali, Dimas. Sampel larutan protein dibekukan kilat ke dalam etana cair pada suhu -180 derajat Celsius!",
                        narrativeContext = "Kakek menggambarkan pembentukan es amorf vitrifikasi transparan tanpa kisi es kristal yang merusak protein."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan kamera detektor elektron langsung (Direct Electron Detector) merekam ratusan ribu foto 2D protein dalam orientasi acak, yang kemudian direkonstruksi algoritma komputasi Bayesian menjadi kepadatan kerapatan elektron 3D beresolusi atomik!",
                        narrativeContext = "Kirana memperlihatkan perataan kelas 2D (2D class averaging) dan peta kerapatan 3D (cryo-EM density map)."
                    )
                ),
                intuitionBody = """
                    Biologi Struktural Resolusi Atomik mengungkap arsitektur tiga dimensi makromolekul hayati (protein, asam nukleat, kompleks ribosom, dan membran virus) hingga tingkat ikatan kimiawi individual.
                    
                    1. Revolusi Resolusi Cryo-EM (Hadiah Nobel Kimia 2017: Dubochet, Frank, Henderson):
                       Mengatasi dua kelemahan utama kristalografi sinar-X konvensional (kesulitan kristalisasi protein membran/kompleks besar) dan mikroskopi elektron klasik (kerusakan radiasi elektron):
                       - Vitrifikasi Kilat (Flash Freezing): Tetesan larutan protein mikroliter pada kisi mikroskop (TEM grid) dicelupkan ke dalam etana cair yang didinginkan oleh nitrogen cair (-183 C) dengan kecepatan pendinginan > 10^6 C/detik. Air membeku menjadi es vitrifikasi amorf transparan laksana kaca padat tanpa sempat membentuk kisi heksagonal kristal es yang merusak struktur protein.
                       - Pencitraan Dosis Rendah & Detektor Elektron Langsung (DED/DDD): Menggantikan film/CCD dengan sensor CMOS generasi baru yang mendeteksi elektron secara langsung dengan rasio sinyal terhadap derau (SNR) tinggi pada fraksi dosis radiasi aman (20 - 40 e-/Å^2) dan merekam film gerakan untuk koreksi gerak akibat berkas elektron (motion correction).
                       
                    2. Rekonstruksi 3D Partikel Tunggal (Single-Particle Analysis / SPA):
                       - Pemetikan Partikel (Particle Picking): Mengisolasi ratusan ribu citra proyeksi 2D molekul protein individual dari mikrograf.
                       - Perataan Kelas 2D (2D Class Averaging): Mengelompokkan partikel dengan orientasi serupa untuk meningkatkan kontras sinyal.
                       - Penentuan Orientasi Sudut Ekor & Rekonstruksi 3D: Algoritma estimasi ekspektasi maksimum Bayesian (RELION, CryoSPARC) menentukan parameter rotasi sudut Euler (alpha, beta, gamma) dan translasi tiap partikel, lalu menerapkan Teorema Proyeksi Irisan Pusat Fourier (Fourier Slice Theorem) untuk menyusun volume kerapatan 3D beresolusi sub-2 Ångström.
                       
                    3. Cryo-Electron Tomography (Cryo-ET) In Situ:
                       Memiringkan sampel irisan sel tebal bertahap di bawah berkas elektron mikroskop, memungkinkan rekonstruksi tomografi 3D arsitektur organel seluler dan kompleks makromolekul tepat di habitat aslinya di dalam sel hidup tanpa ekstraksi.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Vitrifikasi etana cair membekukan protein dalam konformasi larutan alami dinamis yang paling mirip dengan kondisi di dalam sel hidup.",
                    "Teorema Proyeksi Irisan Fourier membuktikan bahwa transformasi Fourier dari foto 2D adalah irisan bidang datar dari transformasi Fourier 3D objek aslinya.",
                    "Cryo-EM memungkinkan pemisahan keadaan konformasi ganda (heterogenitas struktural) dari sampel yang sama secara komputasi in silico.",
                    "Resolusi Cryo-EM modern kini telah menembus batas 1.2 Ångström, memungkinkan identifikasi atom hidrogen individual pada struktur protein."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Teorema Proyeksi Irisan Fourier (Central Slice Theorem)",
                        latex = "\\mathcal{F}_{2\\mathrm{D}}\\{p_\\theta(x, y)\\} = \\left. \\mathcal{F}_{3\\mathrm{D}}\\{\\rho(x, y, z)\\} \\right|_{\\text{Bidang Irisan } \\theta}",
                        explanation = "Transformasi Fourier 2D dari citra proyeksi elektron identik dengan irisan bidang tengah melalui transformasi Fourier 3D kerapatan protein."
                    ),
                    FormulaCard(
                        title = "Korelasi Cincin Fourier Resolusi Cryo-EM (FSC)",
                        latex = "\\mathrm{FSC}(r) = \\frac{\\sum_{s \\in r} F_1(s) F_2^*(s)}{\\sqrt{\\sum_{s \\in r} |F_1(s)|^2 \\sum_{s \\in r} |F_2(s)|^2}} = 0.143",
                        explanation = "Kriteria baku emas penentuan batas resolusi spasial atomik antara dua rekonstruksi independen setengah-dataset."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Elusidasi Struktur Resolusi Atomik Enzim Reverse Transcriptase HIV di Fasilitas Cryo-EM Nasional",
                    scenario = "Riset obat antiretroviral baru membutuhkan pemahaman struktural mutasi resistensi pada kompleks enzim reverse transcriptase virus HIV.",
                    application = "Tim biologi struktural membekukan larutan kompleks enzim dengan ligan obat inhibitor non-nukleosida ke dalam etana cair pada kisi emas berpori mikro (UltrAuFoil grid). Data 4.000 mikrograf film direkam pada mikroskop Cryo-TEM 300 kV Krios dengan detektor Falcon 4. Rekonstruksi 180.000 partikel tunggal menghasilkan peta kerapatan elektron resolusi 2.3 Å, memperlihatkan kantung pengikatan hidrofobik sisi aktif dan atom air terkoordinasi secara kristal.",
                    impact = "Mempercepat desain kimia medisinal molekul penghambat enzim HIV generasi baru dengan daya ikat piko-molar."
                ),
                homeLab = HomeLabData(
                    title = "Simulasi Teorema Proyeksi Irisan dan Rekonstruksi Bayangan Objek 3D Menggunakan Lampu Senter",
                    objective = "Memahami bagaimana kumpulan citra bayangan 2D dari berbagai sudut pandang merekonstruksi geometri 3 dimensi suatu objek.",
                    materials = listOf("Satu buah objek bentuk tak beraturan (misal kunci rumah atau mainan kecil)", "Lampu senter ponsel", "Layar kertas putih", "Kamera ponsel"),
                    steps = listOf(
                        "Letakkan kunci di atas meja di depan layar kertas putih.",
                        "Sorotkan senter horizontal; amati bayangan siluet proyeksi 2D kunci pada layar kertas.",
                        "Putar sudut datang senter (atau putar kunci) setiap 15 derajat mengelilingi 360 derajat.",
                        "Foto siluet bayangan 2D dari setiap sudut tersebut.",
                        "Perhatikan bahwa satu foto bayangan 2D saja tidak cukup menjelaskan ketebalan kunci, tetapi kumpulan puluhan bayangan dari semua sudut secara kolektif mengunci bentuk 3D kunci secara unik.",
                        "Diskusikan bagaimana komputer Cryo-EM menyatukan ratusan ribu bayangan elektron 2D tersebut menjadi model atomik 3D."
                    ),
                    safetyNote = "Praktikum optik siluet bayangan meja kerja yang aman dan mudah."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa pembekuan cepat (vitrifikasi) sampel protein pada mikroskopi Cryo-EM harus menggunakan etana cair dan TIDAK boleh menggunakan nitrogen cair secara langsung?",
                        options = listOf(
                            "Karena nitrogen cair memiliki titik didih rendah yang langsung mendidih dan membentuk lapisan isolator gas selubung (efek Leidenfrost) yang memperlambat pendinginan sehingga terbentuk kristal es perusak, sedangkan etana cair memiliki kapasitas termal tinggi yang membekukan air seketika menjadi es amorf tanpa mendidih",
                            "Karena nitrogen cair bereaksi meledak dengan protein",
                            "Karena etana cair rasanya manis",
                            "Karena nitrogen cair tidak bisa dibeli di toko"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Ketika benda bersuhu ruang dicelupkan ke nitrogen cair (-196 C), nitrogen mendidih seketika membentuk selubung gas di sekeliling sampel (efek Leidenfrost) yang mengisolasi perpindahan panas sehingga laju pendinginan lambat, memicu pembentukan kristal es heksagonal yang tajam dan menghancurkan struktur protein. Etana cair memiliki rentang cair-gas yang jauh lebih lebar tanpa efek mendidih masif, menghasilkan laju pendinginan ekstrem (>1.000.000 C/detik) yang membekukan air seketika menjadi es vitrifikasi kaca transparan.",
                        misconceptionAlert = "Sering dikira nitrogen cair adalah pendingin tercepat karena suhunya lebih dingin (-196 C vs etana -183 C), padahal laju transfer panas etana cair jutaan kali lebih cepat."
                    )
                )
            )

            "bio-machine-learning-alphafold" -> LessonData(
                conceptId = "bio-machine-learning-alphafold",
                simId = "sim-alphafold-ai-protein",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, selama 50 tahun para ahli biologi berjuang memecahkan 'Masalah Pelipatan Protein'—memprediksi bentuk 3D protein hanya dari untaian sekuens asam aminonya. Bagaimana AlphaFold AI bisa memecahkannya dengan akurasi setara eksperimen laboratorium?",
                        narrativeContext = "Dimas melihat model 3D struktur protein yang dihasilkan komputer dalam waktu 2 menit dibandingkan eksperimen lab 4 tahun."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "AlphaFold memadukan biologi evolusioner dan jaringan saraf perhatian mendalam (Deep Attention Networks), Dimas! Intinya adalah modul Evoformer yang menghubungkan data ko-evolusi pasangan residu asam amino di masa lalu dengan koordinat geometri rotasi 3D ruang nyata.",
                        narrativeContext = "Kakek menggambarkan mekanisme pertukaran informasi segitiga (Triangular Self-Attention) pada representasi pasangan residu."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan kini model bahasa protein (Protein Language Models seperti ESMFold) membaca sekuens asam amino laksana teks bahasa manusia menggunakan Transformer, memprediksi struktur 600 juta protein metagenomik tanpa perlu penjajaran sekuens!",
                        narrativeContext = "Kirana memperlihatkan skor akurasi pLDDT dan Predicted Aligned Error (PAE) konfidensi struktur."
                    )
                ),
                intuitionBody = """
                    Kecerdasan Buatan dan Pembelajaran Mesin merevolusi pemodelan biologis, memecahkan teka-teki 50 tahun pelipatan protein secara de novo dan membuka era desain protein sintetis terprogram (Hadiah Nobel Kimia 2024: Demis Hassabis, John Jumper, David Baker).
                    
                    1. Arsitektur AlphaFold2 (DeepMind):
                       Menerima masukan berupa urutan sekuens asam amino primer dan mencari homolog evolusioner di basis data genetik:
                       - Penyelarasan Multi-Sekuens (Multiple Sequence Alignment / MSA): Menangkap sinyal ko-evolusi (jika dua asam amino yang berjauhan pada rantai selalu bermutasi bersamaan selama jutaan tahun, kedua residu tersebut pasti saling bersentuhan fisik dalam struktur 3D terlipat).
                       - Modul Evoformer: Memproses representasi MSA dan representasi matriks pasangan residu (Pair Representation) secara dua arah (interaktif). Menggunakan mekanisme Triangular Self-Attention (memenuhi pertidaksamaan segitiga jarak geometris antar residu i, j, k).
                       - Modul Struktur (Structure Module): Memperlakukan tulang punggung polipeptida sebagai sekumpulan bingkai kaku 3D independen (rigid body orientation gas: rotasi R_i in SO(3) dan translasi t_i in R^3). Menggunakan Invariant Point Attention (IPA) untuk memutakhirkan koordinat secara ekuivarian tanpa memutus ikatan peptida, menyempurnakan sudut torsi rantai samping (chi1, chi2).
                       
                    2. Metrik Kepercayaan Struktur (Confidence Metrics):
                       - pLDDT (Predicted Local Distance Difference Test, skala 0 - 100): Mengukur kepercayaan lokal posisi residu atomik. Skor > 90 menandakan akurasi resolusi atomik tinggi; skor < 50 mencerminkan daerah protein yang secara intrinsik tidak teratur (Intrinsically Disordered Proteins / IDP).
                       - Matriks PAE (Predicted Aligned Error): Mengukur ketidakpastian posisi relatif antar domain protein.
                       
                    3. Model Bahasa Protein Skala Besar (Protein Language Models / pLM):
                       Model Transformer skala raksasa (seperti ESM-2 / ESMFold Meta AI dengan 15 miliar parameter). Dilatih pada ratusan juta sekuens protein melalui tugas pengisian kata bertopeng (masked language modeling).
                       pLM mempelajari aturan gramatika biokimia dan kontak 3D spasial secara langsung dari keteraturan bahasa sekuens tunggal tanpa memerlukan pencarian MSA yang lambat, mampu memprediksi struktur satu protein dalam hitungan 0.1 detik.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "AlphaFold belajar dari kebijaksanaan evolusi alamiah miliaran tahun yang tercatat di dalam database sekuens DNA.",
                    "Triangular attention mengajarkan AI aturan dasar geometri ruang: jarak dari A ke C dibatasi oleh jarak dari A ke B dan B ke C.",
                    "Skor pLDDT yang rendah bukan berarti model AI gagal, melainkan seringkali mengungkap daerah protein lentur alami yang tidak memiliki bentuk kaku.",
                    "Kombinasi AlphaFold dengan model generatif diffusion membuka kemampuan merancang enzim fungsional baru dari nol (De Novo Protein Design) untuk memecah limbah plastik atau mengikat racun."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Pembaruan Perhatian Segitiga Evoformer (Triangular Update)",
                        latex = "\\mathbf{z}_{ij} \\leftarrow \\mathbf{z}_{ij} + \\sum_k \\left( \\mathbf{A}_{ik} \\mathbf{z}_{ik} \\right) \\odot \\left( \\mathbf{B}_{jk} \\mathbf{z}_{jk} \\right)",
                        explanation = "Perkalian luar fitur residu perantara k yang menegakkan konsistensi geometris segitiga relasi spasial antara residu i dan j."
                    ),
                    FormulaCard(
                        title = "Fungsi Kerugian Struktur Kerangka Kaku FAPE",
                        latex = "\\mathcal{L}_{\\mathrm{FAPE}} = \\frac{1}{N^2}\\sum_{i,j} \\min\\left( d_{\\mathrm{clamp}}, \\left\\| T_i^{-1}(\\mathbf{x}_j) - T_{i,\\mathrm{true}}^{-1}(\\mathbf{x}_{j,\\mathrm{true}}) \\right\\| \\right)",
                        explanation = "Frame Aligned Point Error yang membandingkan posisi atom relatif terhadap kerangka koordinat lokal tiap residu, invarian terhadap rotasi global."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Prediksi Struktur 3D Kompleks Enzim Pendegradasi Lignoselulosa Sawit Indonesia oleh Konsorsium AI-Bio BRIN",
                    scenario = "Enzim selulase dan hemiselulase bakteri termofilik tanah gambut Sumatera sangat potensial untuk biorefineri bioetanol generasi kedua namun strukturnya belum pernah dikristalkan.",
                    application = "Bioinformatikawan Indonesia menjalankan pipeline AlphaFold2 dan ESMFold pada klaster superkomputer GPU BRIN untuk memprediksi struktur 3D 1.200 sekuens kandidat enzim karbohidrat-aktif (CAZymes). Model mengidentifikasi sisi aktif pengikat selobiosa dengan skor pLDDT > 92, memandu rekayasa mutasi titik rasional yang meningkatkan ketahanan enzim terhadap suhu 70 C hingga dua kali lipat.",
                    impact = "Mempercepat komersialisasi teknologi konversi limbah tandan kosong sawit menjadi bioetanol bahan bakar nabati mandiri."
                ),
                homeLab = HomeLabData(
                    title = "Eksplorasi Prediksi Struktur 3D Protein Melalui AlphaFold Protein Structure Database Online",
                    objective = "Mengakses basis data 200 juta struktur protein terprediksi dan menganalisis skor kepercayaan pLDDT secara interaktif.",
                    materials = listOf("Laptop/Ponsel browser internet", "Situs gratis alphafold.ebi.ac.uk"),
                    steps = listOf(
                        "Buka situs alphafold.ebi.ac.uk di browser.",
                        "Ketik nama gen protein terkenal, misalnya 'INS' (Insulin manusia) atau 'TP53' (penekan tumor).",
                        "Buka penampil model struktur 3D interaktif; putar, perbesar, dan geser molekul protein.",
                        "Perhatikan kode pewarnaan kepercayaan model: biru tua (sangat percaya diri, pLDDT > 90), biru muda (percaya diri, 70-90), kuning (rendah, 50-70), dan oranye (sangat rendah, < 50).",
                        "Identifikasi bagian heliks alfa yang kaku berwarna biru kontras dengan bagian ujung pita meliuk lentur berwarna oranye (daerah tidak teratur IDP)."
                    ),
                    safetyNote = "Praktikum bioinformatika dan visualisasi 3D online, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Dalam model AlphaFold2, apakah arti biologis dan fisis dari nilai skor kepercayaan pLDDT yang sangat rendah (< 50, diwarnai oranye pada visualisasi 3D)?",
                        options = listOf(
                            "Bagian rantai protein tersebut seringkali merupakan Daerah Tidak Teratur secara Intrinsik (Intrinsically Disordered Region / IDR) yang di dalam sel hidup memang bersifat lentur dinamis tanpa bentuk konformasi 3D kaku tunggal",
                            "Model AI mengalami kerusakan sistem memori komputer",
                            "Protein tersebut berasal dari virus alien luar angkasa",
                            "Asam amino pada daerah tersebut tidak memiliki atom karbon"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Banyak protein alami (sekitar 30% dari proteom manusia) memiliki segmen yang tidak melipat menjadi struktur kaku statis di dalam larutan, melainkan berfluktuasi lentur menyerupai tali dinamis (Intrinsically Disordered Proteins). AlphaFold secara akurat mencerminkan fleksibilitas fisik ini dengan memberikan skor pLDDT rendah, yang seringkali tumpang tindih secara tepat dengan daerah fungsional interaksi protein fleksibel.",
                        misconceptionAlert = "Skor pLDDT rendah bukan berarti prediksi AI salah perhitungan; dalam banyak kasus itu adalah konfirmasi fisis bahwa daerah tersebut memang tidak memiliki bentuk kristal tetap."
                    )
                )
            )

            "bio-evo-devo-heterokroni" -> LessonData(
                conceptId = "bio-evo-devo-heterokroni",
                simId = "sim-evodevo-heterochrony",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, salamander Axolotl Meksiko mempertahankan insang berbulu dan ekor kecebongnya hingga dewasa dan bisa berkembang biak tanpa pernah bermetamorfosis menjadi hewan darat. Bagaimana mutasi genetik bisa memodifikasi bentuk tubuh sebesar itu?",
                        narrativeContext = "Dimas mengamati akuarium salamander Axolotl yang berwajah kekanak-kanakan abadi."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu adalah fenomena Heterokroni dalam Biologi Evolusi-Perkembangan (Evo-Devo), Dimas! Perubahan laju atau waktu relatif terjadinya proses perkembangan embrio di masa pertumbuhan. Axolotl mengalami Pedomorfosis: mempertahankan sifat larva pada individu dewasa.",
                        narrativeContext = "Kakek menggambarkan pergeseran waktu onkogenik somatik vs reproduktif."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan penemuan paling spektakuler Evo-Devo adalah Konservasi Perangkat Genetik Pembangun (The Genetic Toolkit): mata lalat buah dan mata manusia dibangun oleh gen pengatur utama yang sama persis yaitu Pax6, membuktikan bahwa evolusi morfologi beroperasi melalui perombakan tombol saklar pengatur DNA (cis-regulatory elements)!",
                        narrativeContext = "Kirana memperlihatkan homologi rangkaian gen homeotik Hox pada lalat Drosophila dan embrio vertebrata."
                    )
                ),
                intuitionBody = """
                    Biologi Evolusi-Perkembangan (Evolutionary Developmental Biology / Evo-Devo) menjembatani genetika perkembangan embriologi dan makroevolusi, mengungkap bagaimana inovasi bentuk anatomi baru muncul melalui modifikasi program perkembangan purba.
                    
                    1. Konsep Heterokroni (Heterochrony):
                       Perubahan evolusioner dalam laju (rate) atau waktu permulaan/penutupan (onset/offset timing) dari peristiwa perkembangan suatu organ relatif terhadap organ lain atau kematangan seksual:
                       - Pedomorfosis (Paedomorphosis): Individu dewasa mempertahankan karakteristik moyang tahap larva/remaja:
                         * Neoteni (Neoteny): Perlambatan laju perkembangan somatik sementara pematangan reproduksi normal (misal tengkorak manusia dewasa yang mempertahankan bentuk kepala bulat juvenile kera, atau insang salamander Axolotl).
                         * Progenesis: Kematangan seksual terjadi lebih cepat sebelum perkembangan somatik tuntas.
                       - Peramorfosis (Peramorphosis): Perkembangan morfologi berlebih melampaui bentuk dewasa moyang:
                         * Hipermorfosis: Waktu penutupan pertumbuhan tertunda lebih lama (misal tanduk raksasa rusa purba Megaloceros).
                         * Akselerasi: Percepatan laju pertumbuhan organ tertentu.
                       
                    2. Heterotopi (Heterotopy):
                       Perubahan lokasi spasial ekspresi gen perkembangan (misal hilangnya sirip/tungkai pada ular, atau pembentukan jaring renang selaput jari burung air akibat penghambatan apoptosis protein BMP oleh Gremlin di sela-sela jari kaki).
                       
                    3. Konservasi Perangkat Genetik (The Deep Homology of Genetic Toolkit):
                       Morfologi hewan yang sangat beraneka ragam ternyata dibangun oleh kumpulan gen pengendali arsitektur tubuh (transcription factors dan signaling pathways) yang identik dan lestari sejak lebih dari 500 juta tahun lalu:
                       - Gen Pax6: Pengatur utama (master regulator) pembentukan mata; gen Pax6 mencit jika disisipkan ke lalat buah dapat menginduksi pembentukan mata fungsional lalat!
                       - Gen Klaster Hox: Mengatur identitas anterior-posterior tubuh bilateral dari cacing, serangga, hingga manusia dalam urutan kolinearitas kromosom yang sama.
                       
                    4. Evolusi Melalui Modifikasi Elemen Cis-Regulatorik (Enhancers):
                       Inovasi morfologi besar jarang terjadi akibat mutasi pada urutan pengkode protein pembangun (karena mutasi protein pleiotropik fatal mematikan organ lain). Sebaliknya, seleksi alam memodifikasi elemen saklar pengatur non-koding (cis-regulatory enhancers) yang menyalakan atau mematikan ekspresi gen pada waktu dan jaringan tertentu saja.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Evo-Devo membuktikan bahwa evolusi tidak menciptakan roda baru dari nol, melainkan mengutak-atik (tinkering) rangkaian saklar sirkuit lama.",
                    "Perbedaan bentuk tengkorak manusia dan simpanse sebagian besar didorong oleh neoteni: manusia mempertahankan proporsi kepala bayi sepanjang hidupnya.",
                    "Konservasi gen Pax6 membuktikan 'homologi mendalam' (deep homology) yang tak terbantahkan dari seluruh makhluk hidup bercabang bilateral.",
                    "Modifikasi enhancer adalah kunci fleksibilitas evolusi morfologi tanpa menimbulkan mutasi fatal pada organ vital lainnya."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Model Alometri Pertumbuhan Heterokroni",
                        latex = "y = b x^k \\iff \\ln y = \\ln b + k \\ln x, \\quad k = \\frac{\\alpha_y}{\\alpha_x}",
                        explanation = "Persamaan alometrik Huxley yang menghubungkan laju pertumbuhan relatif organ y terhadap ukuran tubuh total x melalui koefisien alometri k."
                    ),
                    FormulaCard(
                        title = "Gradien Morfogen Penentu Pola Spasial",
                        latex = "\\frac{\\partial C}{\\partial t} = D \\frac{\\partial^2 C}{\\partial x^2} - k C, \\quad C(x) = C_0 \\exp\\left( -x \\sqrt{\\frac{k}{D}} \\right)",
                        explanation = "Gradien konsentrasi eksponensial morfogen difusif (misal Bicoid atau Shh) yang menetapkan batas ambang batas aktivasi gen target Hox."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Evolusi Paruh Burung Finch Pemakan Biji Kepulauan Galapagos & Burung Madu Indonesia oleh Peneliti Zoologi BRIN",
                    scenario = "Variasi ketebalan dan panjang paruh burung madu dan finch menentukan spesialisasi adaptasi menghisap nektar bunga tropis yang berbeda.",
                    application = "Ornitolog dan periset genomik perkembangan mengkaji ekspresi protein morfogenetik tulang BMP4 (pengatur ketebalan paruh) dan calmodulin CaM (pengatur panjang paruh) pada embrio burung madu Nusantara. Peningkatan waktu ekspresi heterokroni gen Bmp4 menghasilkan paruh kokoh pendek untuk memecah biji keras, sedangkan ekspresi dini CaM memperpanjang paruh ramping untuk bunga tabung dalam.",
                    impact = "Mengonfirmasi secara molekuler mekanika perkembangan di balik teori seleksi alam adaptasi Darwinian di kepulauan tropis."
                ),
                homeLab = HomeLabData(
                    title = "Pengamatan Alometri Pertumbuhan Proporsi Kepala terhadap Tubuh pada Manusia Melalui Foto Keluarga",
                    objective = "Mengamati bukti neoteni dan pertumbuhan alometrik negatif kepala manusia sejak bayi hingga dewasa.",
                    materials = listOf("Foto diri saat bayi (usia 0-1 tahun)", "Foto diri saat dewasa / remaja", "Penggaris"),
                    steps = listOf(
                        "Ukur tinggi total tubuh bayi pada foto (H_bayi) dan tinggi kepala bayi (h_kepala_bayi); hitung rasio h/H (pada bayi, kepala berukuran sekitar 1/4 atau 25% dari tinggi total tubuh!).",
                        "Lakukan pengukuran yang sama pada foto dewasa (pada orang dewasa, kepala hanya berukuran sekitar 1/8 atau 12.5% dari tinggi total tubuh).",
                        "Amati bahwa tubuh dan kaki tumbuh jauh lebih cepat dibandingkan kepala (alometri negatif k < 1).",
                        "Bandingkan dengan foto simpanse dewasa di internet: simpanse mengalami peramorfosis di mana rahang moncongnya memanjang masif, sedangkan manusia mempertahankan bentuk muka datar bayi simpanse (neoteni!)."
                    ),
                    safetyNote = "Praktikum pengukuran foto keluarga meja kerja, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah yang dimaksud dengan fenomena Neoteni (Neoteny) dalam konsep heterokroni biologi evolusi-perkembangan?",
                        options = listOf(
                            "Perlambatan laju perkembangan somatik tubuh sehingga individu dewasa mempertahankan ciri-ciri fisik morfologi masa kanak-kanak/larva moyangnya saat mencapai kematangan reproduksi seksual",
                            "Hewan yang berubah menjadi fosil batu dalam waktu singkat",
                            "Pertumbuhan dua kepala pada embrio hewan",
                            "Kemampuan hewan untuk hidup di luar angkasa"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Neoteni adalah salah satu bentuk pedomorfosis di mana tempo laju diferensiasi fisik somatik melambat secara evolusioner relatif terhadap garis waktu pematangan organ reproduksi. Akibatnya, hewan dewasa yang subur secara reproduktif mempertahankan fenotipe muda/juvenil (contoh klasik: salamander Axolotl yang mempertahankan insang larva, dan manusia yang mempertahankan proporsi kepala bulat serta perilaku belajar kera muda).",
                        misconceptionAlert = "Neoteni bukan kelainan penyakit gagal tumbuh, melainkan mekanisme evolusi adaptif yang sangat sukses."
                    )
                )
            )

            "bio-metagenomik-mikrobioma-gut-brain" -> LessonData(
                conceptId = "bio-metagenomik-mikrobioma-gut-brain",
                simId = "sim-metagenomics-gut-brain",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, apakah benar bahwa di dalam usus manusia hidup triliunan mikroorganisme yang jumlahnya melebihi seluruh sel tubuh kita sendiri, dan bakteri tersebut bisa mempengaruhi suasana hati (mood), kecemasan, dan kesehatan otak kita?",
                        narrativeContext = "Dimas membaca tentang poros mikrobioma usus-otak (Gut-Brain Axis) dan peran metabolit mikrobiota."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Benar sekali, Dimas! Tubuh kita adalah 'Holobiont'—ekosistem simbiotik berjalan. Melalui sekuensing Metagenomik Shotgun, kita tahu bakteri usus memproduksi lebih dari 90% neurotransmiter Serotonin tubuh dan asam lemak rantai pendek (SCFA) yang berkomunikasi dua arah dengan otak!",
                        narrativeContext = "Kakek menggambarkan komunikasi melalui Saraf Vagus kranial X, sitokin imun, dan metabolit darah."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan saat komposisi mikrobioma mengalami ketidakseimbangan (Disbiosis) akibat pola makan junk food atau antibiotik berlebih, dinding usus menjadi bocor (leaky gut) memicu inflamasi sistemik yang memicu depresi, obesitas, hingga autoimun!",
                        narrativeContext = "Kirana memperlihatkan perbandingan keanekaragaman alfa Shannon mikrobioma usus sehat vs disbiosis."
                    )
                ),
                intuitionBody = """
                    Metagenomik dan Riset Mikrobioma mempelajari komunitas mikroorganisme utuh (bakteri, arkea, jamur, virus) yang mendiami tubuh manusia dan lingkungan tanpa memerlukan kultur laboratorium buatan.
                    
                    1. Metodologi Sekuensing Metagenomik Shotgun:
                       Ekstraksi DNA total dari sampel tinja/lingkungan tanpa pemisahan kultur mikroba:
                       - Pengurutan Sekuens Acak Utuh (Whole-Metagenome Shotgun Sequencing): Berbeda dari penanda 16S rRNA yang hanya mengidentifikasi taksonomi genera, metagenomik shotgun membaca seluruh fragmen DNA genomik komunitas.
                       - Perakitan Metagenom & Binning: Algoritma de Bruijn menyusun kontig panjang, yang kemudian dikelompokkan (binning berbasis frekuensi tetranukleotida dan kedalaman cakupan) menjadi Metagenome-Assembled Genomes (MAGs) untuk merekonstruksi genom spesies bakteri baru yang belum pernah dibiakkan.
                       - Profil Fungsional (Humann / KEGG): Mengidentifikasi kelompok gen fungsional dan jalur metabolik yang aktif (misal biosintesis vitamin, pemecahan serat resisten, degradasi xenobiotik).
                       
                    2. Poros Usus-Otak (The Gut-Brain Axis):
                       Jalur komunikasi bi-direksional yang menghubungkan sistem saraf enterik pencernaan (ENS) dan sistem saraf pusat otak (CNS) melalui tiga rute utama:
                       - Rute Saraf (Neural Route): Jalur cepat langsung melalui Saraf Vagus kranial X. Bakteri usus menstimulasi sel enteroendokrin untuk melepaskan hormon pencernaan dan neurotransmiter (GABA, dopamin, serotonin).
                       - Rute Imunologis: Mikrobiota melatih sel T regulator (Treg). Disbiosis merusak lapisan lendir mukosa, membiarkan lipopolisakarida (LPS) dinding bakteri gram-negatif bocor ke darah (endotoksemia metabolik), memicu pelepasan sitokin pro-inflamasi (TNF-alpha, IL-6) yang menembus sawar darah otak (BBB) dan mengaktifkan mikroglia otak (neuroinflamasi).
                       - Rute Metabolit Endokrin: Fermentasi serat pangan prebiotik menghasilkan Asam Lemak Rantai Pendek (Short-Chain Fatty Acids / SCFA: asetat, propionat, butirat). Butirat berfungsi sebagai bahan bakar utama sel kolonosit, memperkuat taut kedap membran usus (tight junctions claudin/occludin), serta bertindak sebagai inhibitor histon deasetilase (HDAC) yang meregulasi ekspresi gen plastisitas otak BDNF.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Metagenomik shotgun membaca buku resep genetik fungsional seluruh mikroba, bukan sekadar menghitung daftar nama taksonominya.",
                    "Saraf vagus adalah kabel serat optik biologis yang terus-menerus melaporkan status kimiawi usus ke pusat emosi otak.",
                    "Butirat adalah metabolit ajaib: ia merawat integritas dinding usus sekaligus menenangkan inflamasi di dalam otak.",
                    "Keanekaragaman mikrobioma yang tinggi berkorelasi kuat dengan ketahanan imun dan fleksibilitas metabolisme tubuh."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Indeks Keanekaragaman Alfa Shannon Mikrobioma",
                        latex = "H' = -\\sum_{i=1}^S p_i \\ln p_i",
                        explanation = "Ukuran kekayaan dan kemerataan spesies mikroba di dalam satu sampel; nilai H' tinggi menandakan ekosistem mikrobioma yang sehat dan stabil."
                    ),
                    FormulaCard(
                        title = "Jarak Beta Bray-Curtis Ketidaksamaan Komunitas",
                        latex = "BC_{jk} = 1 - \\frac{2 \\sum_{i} \\min(C_{ij}, C_{ik})}{\\sum_i C_{ij} + \\sum_i C_{ik}}",
                        explanation = "Metrik kuantitatif perbedaan komposisi taksonomi mikrobioma antar dua kelompok individu atau perlakuan klinis."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Inisiatif Genomik Mikrobioma Pangan Fermentasi Tradisional Nusantara Kemenkes BGSi & IPB",
                    scenario = "Makanan fermentasi tradisional Indonesia (tempe, tapai, dadih kerbau Minangkabau) kaya akan bakteri asam laktat probiotik unik yang belum dipetakan secara metagenomik.",
                    application = "Konsorsium peneliti mikrobioma melakukan sekuensing metagenomik shotgun pada ratusan sampel dadih dan usus sukarelawan masyarakat tradisional pedesaan. Mereka merekonstruksi MAGs strain unggul Lactobacillus plantarum dan Bifidobacterium indigenous yang memiliki klaster gen biosintesis butirat tinggi dan enzim pemecah kolesterol, yang terbukti secara klinis menurunkan inflamasi endotoksemia dan memperbaiki skor kecemasan kognitif.",
                    impact = "Mengangkat pangan warisan nusantara menjadi fitofarmaka probiotik unggulan berstandar medis internasional."
                ),
                homeLab = HomeLabData(
                    title = "Pembuatan Pangan Probiotik Alami Fermentasi Sayur (Kimchi / Sauerkraut) dan Pemantauan pH Asam",
                    objective = "Mengamati suksesi ekologis mikrobioma fermentasi anaerobik bakteri asam laktat pengawet pangan.",
                    materials = listOf("Sayur kol segar atau sawi putih (500 gram)", "Garam dapur non-iodin (2 sendok makan / sekitar 2-3% berat sayur)", "Toples kaca kedap udara bersih", "Kertas indikator pH atau kunyit sebagai indikator"),
                    steps = listOf(
                        "Iris tipis kol, remas-remas kuat bersama garam dapur selama 5 menit hingga keluar banyak cairan air sayur alami.",
                        "Padatkan kol dan seluruh air garamnya ke dalam toples kaca; pastikan semua sayur terendam di bawah permukaan air (kondisi anaerobik mutlak).",
                        "Tutup toples rapat, biarkan berfermentasi pada suhu ruang selama 3-5 hari.",
                        "Buka toples sedikit setiap hari untuk membuang gas CO2 (burping).",
                        "Amati perubahan: aroma berubah menjadi asam segar beraroma sedap khas asam laktat.",
                        "Uji pH cairan: amati penurunan drastis pH dari netral (~6.5) menjadi sangat asam (< 4.0), di mana kondisi asam ini secara selektif mematikan bakteri pembusuk patogen dan menyuburkan probiotik Lactobacillus yang menyehatkan mikrobioma usus!"
                    ),
                    safetyNote = "Pastikan sayur selalu terendam air garam agar tidak tumbuh jamur kapang beracun di permukaan."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Manakah dari metabolit fermentasi bakteri usus berikut yang merupakan asam lemak rantai pendek (SCFA) yang bertindak sebagai sumber energi utama sel epitel kolon dan membantu memperkuat taut kedap dinding usus (gut barrier)?",
                        options = listOf(
                            "Butirat (Butyrate)",
                            "Glukosa",
                            "Kolesterol jahat LDL",
                            "Asam klorida pekat"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Butirat (asam butirat) diproduksi oleh bakteri usus (seperti Faecalibacterium prausnitzii) dari fermentasi serat pangan prebiotik. Sel epitel usus (kolonosit) menggunakan butirat sebagai 70% sumber energi utamanya untuk mempertahankan lapisan lendir mukosa dan sintesis protein taut kedap (claudin/occludin), mencegah fenomena usus bocor (leaky gut) yang memicu peradangan sistemik ke otak.",
                        misconceptionAlert = "Banyak yang mengira bakteri usus hanya menghasilkan gas buangan, padahal senyawa metabolit SCFA adalah molekul pensinyalan sistemik yang vital bagi kesehatan otak dan kekebalan tubuh."
                    )
                )
            )

            "bio-cell-factories-asam-amino-sintetik" -> LessonData(
                conceptId = "bio-cell-factories-asam-amino-sintetik",
                simId = "sim-cell-factories-noncanonical",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, seluruh makhluk hidup di planet bumi dari bakteri hingga manusia hanya menggunakan 20 jenis asam amino standar yang sama untuk membangun jutaan jenis proteinnya. Apakah kita bisa menambahkan asam amino ke-21 atau ke-22 sintetis ke dalam kode genetik?",
                        narrativeContext = "Dimas kagum melihat struktur protein rekayasa yang mengandung asam amino sintetis berlabel fotoaktif."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Bisa, Dimas! Itulah puncak ekspansi kode genetik Biologi Sintetis! Dengan merekayasa pasangan ortogonal tRNA dan aminoasil-tRNA sintetase (aaRS), kodon henti Amber (UAG) yang semula memberi perintah 'berhenti' ditugaskan ulang untuk menyisipkan Asam Amino Non-Kanonik (ncAA) buatan!",
                        narrativeContext = "Kakek menggambarkan penugasan ulang kodon henti (amber codon reassignment) pada ribosom."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan sel mikroba dioptimalkan menjadi 'Pabrik Sel' (Cell Factories) menggunakan Flux Balance Analysis (FBA) komputasi genomik, mengalihkan 90% karbon gula langsung untuk memproduksi obat biopolimer dan biofuel!",
                        narrativeContext = "Kirana memperlihatkan model metabolisme skala genomik (GEM) jaringan reaksi biokimia terintegrasi."
                    )
                ),
                intuitionBody = """
                    Rekayasa Pabrik Seluler (Cell Factories) dan Ekspansi Kode Genetik memprogram ulang sel mikroba inang menjadi reaktor biosintesis molekuler berpresisi tinggi dengan kapasitas kimiawi melampaui evolusi alamiah.
                    
                    1. Rekayasa Fluks Metabolik & Flux Balance Analysis (FBA):
                       Memodelkan seluruh jejaring metabolisme seluler (ribuan reaksi biokimia) dalam keadaan tunak (quasi-steady state):
                       S * v = 0, di mana S adalah matriks stoikiometri berukuran m x n, dan v adalah vektor laju fluks metabolik reaksi.
                       Linear Programming (LP) digunakan untuk memaksimumkan fungsi tujuan tertentu (misal laju pertumbuhan biomassa atau laju sintesis metabolit target):
                       Maksimumkan z = c^T * v, terhadap kendala v_min <= v <= v_max.
                       Pendekatan OptKnock mengidentifikasi gen-gen kompetitor mana yang harus dihapus (knockout) secara presisi agar pembentukan produk target menjadi satu-satunya cara sel inang dapat bertahan hidup (growth-coupled production).
                       
                    2. Ekspansi Kode Genetik (Genetic Code Expansion):
                       Kode genetik standar memiliki 64 kodon triplet yang mengkodekan 20 asam amino kanonik dan 3 kodon henti (UAA ocre, UAG amber, UGA opal).
                       Menyisipkan Asam Amino Non-Kanonik (Unnatural / Non-Canonical Amino Acids / ncAA):
                       - Pasangan Translasi Ortogonal: Pasangan enzim aminoasil-tRNA sintetase (aaRS) dan tRNA yang direkayasa (biasanya ditransplantasikan dari arkea Methanocaldococcus jannaschii ke bakteri E. coli):
                         * Ortogonalitas: tRNA sintetis tidak mengenali 20 asam amino alami inang, dan aaRS sintetis tidak memuatkan asam amino ke tRNA alami inang.
                       - Penugasan Ulang Kodon Amber (Amber Suppression): tRNA ortogonal memiliki antikodon CUA yang mengenali kodon henti UAG, menyisipkan ncAA (seperti p-asetilfenilalanin, azidofenilalanin berlabel bioortogonal, atau asam amino foto-reaktif penangkap radikal) secara tepat sasaran pada posisi kodon yang diinginkan.
                       
                    3. Organisme Genomik Rekodifikasi Total (Genomically Recoded Organisms / GROs):
                       Strain bakteri E. coli sintetis (Syn61 / C321.DeltaA) di mana seluruh 321 kemunculan kodon henti UAG di seluruh kromosom dihapus dan diganti dengan UAA melalui pengeditan genomik skala besar. Faktor pelepasan RF1 dihapus permanen, membebaskan kodon UAG menjadi kodon kosong murni untuk sintesis protein buatan dengan resistensi mutlak terhadap seluruh infeksi virus bakteriofag alamiah!
                """.trimIndent(),
                intuitionPoints = listOf(
                    "FBA memetakan metabolisme sel laksana jaringan pipa air kota, memungkinkan insinyur mematikan pipa bocor demi mengalirkan seluruh air ke tangki produk.",
                    "Ekspansi kode genetik memperkaya gudang perkakas kimiawi protein: menambahkan fungsi optoelektronik, radioaktif, dan reaktivitas klik yang tidak dimiliki 20 asam amino alami.",
                    "Organisme rekodifikasi (GRO) menciptakan biosafety firewall mutlak: gen sintetis tidak bisa kabur ke alam liar dan virus alam tidak bisa membajak sel sintetis karena perbedaan bahasa kodon.",
                    "Pabrik sel mikroba menggantikan industri kimia petrokimia kotor dengan sintesis bioproses fermentasi bersih pada suhu ruang."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Keseimbangan Fluks Metabolik (FBA)",
                        latex = "\\mathbf{S} \\cdot \\mathbf{v} = \\mathbf{0}, \\quad \\max \\mathbf{c}^T \\mathbf{v} \\quad \\text{s.t. } \\mathbf{v}_{\\min} \\le \\mathbf{v} \\le \\mathbf{v}_{\\max}",
                        explanation = "Optimasi pemrograman linear neraca stoikiometri massa S keadaan tunak untuk memaksimalkan laju produksi metabolit v."
                    ),
                    FormulaCard(
                        title = "Supresi Kodon Amber Asam Amino Non-Kanonik",
                        latex = "\\mathrm{mRNA(5'-UAG-3')} + \\mathrm{tRNA}_{\\mathrm{CUA}}^{\\mathrm{ortogonal}}\\text{-ncAA} \\xrightarrow{\\text{Ribosom}} \\text{Protein Bertarget ncAA}",
                        explanation = "Penerjemahan kodon henti UAG menjadi asam amino sintetis melalui pasangan tRNA-aaRS ortogonal khusus."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Rekayasa Pabrik Sel Ragi Saccharomyces cerevisiae untuk Produksi Asam Suksinat Bio-based di Biofarma",
                    scenario = "Asam suksinat adalah bahan baku kimia platform bernilai tinggi untuk pembuatan bioplastik PBS terurai hayati yang biasanya disintesis dari minyak bumi.",
                    application = "Insinyur metabolik memodelkan ragi roti menggunakan FBA genom utuh, merekayasa jalur reduktif siklus TCA di sitoplasma dan mengekspresikan enzim fosfoenolpiruvat karboksikinase (PCK) heterolog. Dengan menghapus gen kompetitor fermentasi etanol (ADH1), mikroba dipaksa memproduksi asam suksinat dengan rendemen 0.78 gram per gram glukosa, mereduksi emisi karbon produksi plastik hingga 70%.",
                    impact = "Mewujudkan industri manufaktur biopolimer hijau ramah lingkungan berbasis fermentasi karbohidrat lokal."
                ),
                homeLab = HomeLabData(
                    title = "Pemodelan Penerjemahan Kode Genetik dan Penugasan Ulang Kodon Menggunakan Kartu Huruf Triplet",
                    objective = "Memahami bagaimana kodon triplet diterjemahkan oleh tRNA dan bagaimana supresi kodon henti bekerja pada ribosom.",
                    materials = listOf("Kertas karton digunting menjadi kartu-kartu bertuliskan huruf basa A, U, G, C", "Tabel kode genetik standar"),
                    steps = listOf(
                        "Susun untai mRNA buatan dari kartu: 'AUG' (Metionin/Start) - 'GAA' (Asam Glutamat) - 'UAG' (Stop) - 'UUC' (Fenilalanin).",
                        "Lakukan translasi standar: ribosom membaca AUG, GAA, lalu berhenti tepat di UAG; rantai polipeptida lepas hanya terdiri dari 2 asam amino.",
                        "Kini perkenalkan kartu 'tRNA Ortogonal CUA' yang membawa koin mainan (merepresentasikan Asam Amino Sintetis ncAA).",
                        "Jalankan kembali pembacaan: pada kodon UAG, pasangkan kartu tRNA CUA; asam amino sintetis disisipkan, translasi terus berlanjut membaca UUC!",
                        "Diskusikan bagaimana teknik ini memungkinkan insersi gugus fungsi kimia baru ke dalam protein di posisi atomik yang sangat presisi."
                    ),
                    safetyNote = "Praktikum logika kode genetik kartu meja kerja, aman dan interaktif."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah syarat mutlak yang harus dipenuhi oleh pasangan tRNA dan aminoasil-tRNA sintetase (aaRS) sintetis agar dapat digunakan untuk menyisipkan asam amino non-kanonik (ncAA) ke dalam protein tanpa merusak sel inang?",
                        options = listOf(
                            "Pasangan tersebut harus bersifat ortogonal sejati: tRNA sintetis tidak boleh dimuati oleh enzim sel inang, dan aaRS sintetis tidak boleh memuati tRNA alami sel inang maupun mengenali 20 asam amino alami",
                            "Enzim harus terbuat dari kristal berlian",
                            "tRNA harus memiliki panjang 1000 nukleotida",
                            "Suhu reaksi harus selalu berada pada titik didih air"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Prinsip ortogonalitas adalah kunci mutlak keselamatan ekspansi kode genetik. Jika aaRS sintetis memuati tRNA alami sel inang dengan ncAA, atau memuati tRNA ortogonal dengan asam amino alami, maka translasi di seluruh tubuh sel akan rusak kacau balau karena asam amino yang salah akan disisipkan di sembarang tempat. Ortogonalitas menjamin ncAA hanya dan khusus disisipkan tepat pada kodon target yang ditentukan (seperti UAG).",
                        misconceptionAlert = "Sering dikira tRNA apa saja bisa digunakan, padahal tanpa pasangan ortogonal yang teruji sel akan mengalami kematian akibat kekacauan translasi global."
                    )
                )
            )

            "bio-ekologi-perubahan-iklim-global" -> LessonData(
                conceptId = "bio-ekologi-perubahan-iklim-global",
                simId = "sim-climate-tipping-points",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, apakah kenaikan suhu rata-rata bumi sebesar 1.5 atau 2 derajat Celsius benar-benar bisa memicu keruntuhan ekosistem hutan hujan tropis Amazon dan Kalimantan menjadi sabana kering?",
                        narrativeContext = "Dimas memandangi peta proyeksi model iklim global IPCC dan deforestasi hutan tropis basah."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Bisa, Dimas! Ekosistem biosfer memiliki Titik Kritis Keruntuhan (Tipping Points)! Hutan hujan tropis menghasilkan hujan mereka sendiri melalui daur ulang evapotranspirasi air. Jika deforestasi dan pemanasan global melampaui ambang batas kritis, umpan balik positif memicu kematian massal pohon yang tak dapat dipulihkan kembali (dieback).",
                        narrativeContext = "Kakek menuliskan bifurkasi kurva ketahanan ekosistem dan fenomena perlambatan kritis (critical slowing down)."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan pada tingkat organisme, Kurva Kinerja Termal (Thermal Performance Curve) hewan ektotermik tropis membuktikan bahwa mereka hidup sangat dekat dengan batas suhu kritis mematikan (CTmax), membuat keanekaragaman hayati khatulistiwa justru paling rentan terhadap gelombang panas!",
                        narrativeContext = "Kirana memperlihatkan pergeseran fenologis musiman dan ketidaksesuaian trofik (trophic mismatch)."
                    )
                ),
                intuitionBody = """
                    Ekologi Biosfer Global dan Biologi Perubahan Iklim memodelkan respon fisiologis, evolusioner, dan dinamika lanskap keanekaragaman hayati bumi menghadapi krisis perubahan iklim antropogenik.
                    
                    1. Kurva Kinerja Termal Ektoterm (Thermal Performance Curve / TPC):
                       Kinerja biologis (laju lari, kebugaran reproduksi, fotosintesis) hewan berdarah dingin ektoterm (reptil, amfibi, serangga) mengikuti kurva asimetris terhadap suhu T:
                       - Temperatur Optimum (T_opt): Titik puncak kinerja fisiologis maksimal.
                       - Batas Kritis Maksimum (CT_max): Suhu di mana protein terdenaturasi dan fungsi fisiologis kolaps seketika.
                       - Hipotesis Kerentanan Tropis (Janzen): Meskipun pemanasan absolut di kutub lebih besar, spesies tropis beradaptasi pada variasi musiman yang sangat sempit dan telah hidup tepat di dekat T_opt mereka, sehingga kenaikan suhu 1-2 C saja sudah mendorong mereka melampaui CT_max menuju zona kepunahan termal.
                       
                    2. Ketidaksesuaian Fenologis (Phenological Mismatches):
                       Perubahan waktu musiman siklus hidup biologis (peletakan telur, pembungaan, migrasi) menanggapi pemanasan global dengan laju berbeda antar tingkat trofik:
                       Misalnya, puncak kemunculan ulat mangsa bergeser maju 3 minggu lebih awal menanggapi musim semi yang lebih hangat, sementara penetasan anak burung pemangsa serangga yang dipicu oleh panjang hari (fotoperiode) tidak bergeser, memicu kelaparan massal generasi anakan burung.
                       
                    3. Titik Kritis Biosfer (Tipping Points) & Histeresis:
                       Sistem non-linear memiliki keadaan alternatif stabil ganda (bistabilitas ekologis, misal Hutan Hujan Tropis vs Sabana Savanna):
                       - Daur Ulang Kelembaban Atmosfer: Hutan tropis luas memompa uap air melalui transpirasi kanopi membentuk awan hujan interior (sungai terbang / flying rivers).
                       - Kematian Pohon (Forest Dieback): Jika tutupan hutan berkurang di bawah 75-80% akibat kombinasi deforestasi dan kekeringan El Niño, curah hujan turun di bawah 1.500 mm/tahun, kelembaban hilang, kebakaran hutan meluas, dan ekosistem melompat seketika ke keadaan stabil baru: sabana padang rumput kering.
                       - Histeresis: Begitu titik kritis terlampaui, menanam pohon kembali tidak akan memulihkan hutan hujan karena iklim lokal telah berubah menjadi kering secara permanen.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Spesies tropis ekuator berada di garis depan resiko kepunahan termal karena memiliki rentang toleransi termal yang paling sempit di planet bumi.",
                    "Ketidaksesuaian fenologis memutus rantai jaring makanan ekologis yang telah terkoordinasi selama jutaan tahun evolusi.",
                    "Histeresis membuktikan bahwa mencegah keruntuhan ekosistem jauh lebih murah daripada mencoba memulihkan sistem yang telah melewati titik kritisnya.",
                    "Hutan hujan tropis Nusantara adalah penyerap karbon raksasa dunia yang menstabilkan sistem monsoon cuaca Indo-Pasifik."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Model Kinerja Termal Fisiologis Sharpe-Schoolfield",
                        latex = "P(T) = \\frac{P_0 \\frac{T}{T_0} \\exp\\left[ \\frac{-E}{k_B}\\left(\\frac{1}{T} - \\frac{1}{T_0}\\right) \\right]}{1 + \\exp\\left[ \\frac{E_H}{k_B}\\left(\\frac{1}{T_H} - \\frac{1}{T}\\right) \\right]}",
                        explanation = "Kurva kinerja biologis non-linear yang memadukan peningkatan kinetika enzim Arrhenius dengan inaktivasi denaturasi termal suhu tinggi."
                    ),
                    FormulaCard(
                        title = "Dinamika Sistem Non-Linear Transisi Kritis",
                        latex = "\\frac{dx}{dt} = f(x, \\mu), \\quad \\left.\\frac{\\partial f}{\\partial x}\\right|_{x^*} \\to 0 \\implies \\tau_{\\mathrm{pemulihan}} \\to \\infty",
                        explanation = "Perlambatan kritis (critical slowing down): waktu pemulihan dari gangguan berfluktuasi melambat drastis saat ekosistem mendekati titik kritis tipping point."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pemodelan Ketahanan Hutan Hujan Dataran Rendah Kalimantan Timur terhadap El Niño Ekstrem di IKN",
                    scenario = "Kawasan Ibu Kota Nusantara (IKN) dan hutan tropis Bukit Soeharto Kalimantan Timur menghadapi ancaman peningkatan intensitas anomali iklim Indian Ocean Dipole (IOD) dan El Niño kemarau berkepanjangan.",
                    application = "Ekolog hutan tropis BRIN memadukan data sensor menara fluks pusaran eddy (Eddy Covariance) kelembaban kanopi dengan citra satelit Sentinel-2 indeks vegetasi NDVI. Pemodelan sistem dinamik membuktikan bahwa hutan sekunder memiliki ambang batas kelembaban kritis evapotranspirasi 2.8 mm/hari; di bawah nilai ini pohon meranggas masif melepaskan cadangan karbon ke atmosfer. Program reboisasi multi-spesies pohon endemik Dipterocarpaceae dirancang untuk menjaga kanopi tertutup rapat demi mempertahankan mikroklimat internal.",
                    impact = "Menjaga koridor hijau keanekaragaman hayati IKN dan mencegah kebakaran hutan gambut skala besar."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Pemodelan Efek Rumah Kaca dan Retensi Panas Atmosfer dengan Dua Botol Tertutup",
                    objective = "Mengukur secara langsung peningkatan penahanan panas oleh gas karbon dioksida CO2 di bawah radiasi sinar matahari.",
                    materials = listOf("Dua buah botol plastik bening 1.5 liter bertutup", "Dua termometer ruangan digital / termometer dapur", "Baking soda dan cuka dapur (untuk memproduksi gas CO2)", "Lampu meja pijar 60 Watt atau paparan sinar matahari langsung"),
                    steps = listOf(
                        "Botol A (Kontrol Udara Biasa): masukkan termometer, tutup rapat botol.",
                        "Botol B (Simulasi Kaya CO2): masukkan 2 sendok makan baking soda dan 50 mL cuka ke dalam botol; tunggu terbentuknya gas CO2 yang memenuhi botol, masukkan termometer, tutup rapat seketika.",
                        "Letakkan kedua botol berdampingan berjarak sama persis di bawah sorotan lampu pijar atau sinar matahari terik.",
                        "Catat suhu di dalam kedua botol setiap 5 menit selama 30 menit.",
                        "Amati fenomena: suhu di dalam botol B yang kaya gas CO2 naik jauh lebih tinggi dan bertahan jauh lebih panas dibandingkan botol A (pembuktian langsung mekanisme efek rumah kaca penahan radiasi inframerah termal!)."
                    ),
                    safetyNote = "Praktikum gas CO2 dapur yang aman, jangan sampai cairan membasahi termometer elektronik."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa spesies hewan ektotermik (seperti reptil, katak, dan serangga) di hutan hujan tropis khatulistiwa justru dianggap lebih rentan punah akibat pemanasan global 2 derajat Celsius dibandingkan spesies di wilayah beriklim sedang atau kutub?",
                        options = listOf(
                            "Karena spesies tropis berevolusi di lingkungan bersuhu stabil sepanjang tahun sehingga memiliki batas toleransi termal yang sangat sempit dan saat ini telah hidup sangat dekat dengan batas suhu kritis mematikan mereka (CTmax)",
                            "Karena hewan tropis tidak memiliki kulit pelindung",
                            "Karena di daerah kutub tidak ada es lagi",
                            "Karena serangga tropis tidak memerlukan oksigen"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Spesies iklim sedang memiliki rentang toleransi termal musiman yang sangat lebar (mampu bertahan dari suhu musim dingin beku hingga musim panas terik, perbedaan 30 C). Sebaliknya, spesies tropis ekuator tidak pernah mengalami musim dingin; mereka beradaptasi pada suhu konstan sempit (rentang beberapa derajat saja). Oleh karena itu, margin keselamatan termal (thermal safety margin = CTmax - T_habitat) mereka sangat kecil, sehingga pemanasan kecil saja langsung mendorong mereka ke suhu letal denaturasi protein.",
                        misconceptionAlert = "Banyak yang mengira karena kutub menghangat lebih cepat maka hewan tropis aman; secara fisiologis hewan tropis justru memiliki margin toleransi paling rapuh."
                    )
                )
            )

            "bio-biofisika-koherensi-kuantum" -> LessonData(
                conceptId = "bio-biofisika-koherensi-kuantum",
                simId = "sim-quantum-biology-fmo",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, buku-buku fisika klasik mengatakan efek kuantum (seperti superposisi dan koherensi) hanya bisa bertahan di ruang hampa dingin mendekati nol mutlak. Bagaimana mungkin efek kuantum bisa terjadi di dalam sel daun yang basah, hangat, dan bising oleh fluktuasi termal?",
                        narrativeContext = "Dimas mengamati klorofil daun hijau yang menyerap sinar matahari dengan efisiensi transfer energi hampir 100% sempurna."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itulah keajaiban Biologi Kuantum (Quantum Biology), Dimas! Pada kompleks antena fotosintesis Fenna-Matthews-Olson (FMO), eksiton foton tidak melompat secara acak, melainkan menjelajahi seluruh rute jalur transfer energi secara superposisi kuantum koheren serentak menuju pusat reaksi!",
                        narrativeContext = "Kakek menggambarkan osilasi koherensi kuantum elektronik pada kompleks pigmen klorofil FMO."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan burung migran terbang ribuan kilometer melintasi benua menavigasi medan magnet bumi yang sangat lemah menggunakan mekanisme Pasangan Radikal Terbelit Kuantum pada fotoreseptor Kriptokrom di matanya!",
                        narrativeContext = "Kirana memperlihatkan perputaran spin singlet-triplet pasangan radikal FAD-triptofan yang dipengaruhi inklinasi medan magnet bumi."
                    )
                ),
                intuitionBody = """
                    Biologi Kuantum (Quantum Biology) meneliti bagaimana evolusi hayati memanfaatkan efek mekanika kuantum non-trivial (koherensi kuantum, penembusan terowongan gelombang, dan keterikatan pasangan spin) untuk mengoptimalkan proses kehidupan biologis.
                    
                    1. Koherensi Kuantum dalam Transfer Energi Fotosintesis (Kompleks FMO):
                       Dalam fotosintesis, foton diserap oleh pigmen antena menghasilkan eksiton (pasangan elektron-hole terikat). Energi eksiton ini harus ditransfer ke pusat reaksi fotokimia (Reaction Center) dalam waktu < 1 pikodetik sebelum hilang terbuang sebagai fluoresensi atau panas:
                       - Model Klasik Förster (FRET): Eksiton melompat acak antar molekul klorofil (incoherent hopping), memakan waktu lama dan rentan kehilangan energi.
                       - Model Koheren Kuantum (Fleming & Engel 2007): Spektroskopi elektronik 2D ultra-cepat membuktikan keberadaan ketukan kuantum (quantum beats) yang bertahan hingga ratusan femtodetik pada suhu ruang: eksiton bertindak sebagai gelombang superposisi kuantum yang menjelajahi seluruh kemungkinan rute transfer energi secara paralel, secara otomatis memilih lintasan transfer tercepat dan paling efisien (efisiensi kuantum mendekati 100%!).
                       Fluktuasi termal protein di sekitarnya tidak menghancurkan koherensi, melainkan bertindak membantu menala tingkat energi resonansi (Environment-Assisted Quantum Transport / ENAQT).
                       
                    2. Magnetoreseptor Kriptokrom Burung Migran (Mekanisme Pasangan Radikal):
                       Burung migran mampu merasakan arah garis medan magnet bumi (inklinasi kemiringan) yang berdaya sangat lemah (~50 mikroTesla), ribuan kali lebih lemah dari magnet kulkas biasa:
                       - Foton cahaya biru (450 nm) diserap oleh flavin adenin dinukleotida (FAD) pada protein fotoreseptor Kriptokrom (Cry4) di retina mata burung.
                       - Transfer elektron dari rantai residu triptofan menghasilkan sepasang radikal bebas terbelit kuantum: [FAD*(-) ... TrpH*(+)].
                       - Interkonversi Keadaan Spin Singlet-Triplet: Keadaan spin elektron berosilasi antara keadaan singlet (spin total S=0) dan triplet (S=1) di bawah pengaruh kopling hiperhalus inti atom dan medan magnet bumi eksternal.
                       - Hasil Reaksi Kimia Bergantung Sudut: Medan magnet bumi mengubah rasio produk kimiawi singlet vs triplet, memicu sinyal saraf yang dipersepsikan oleh burung sebagai modulasi pola terang-gelap pada medan pandang penglihatan matanya (kompas visual kuantum!).
                       
                    3. Penerowongan Kuantum (Quantum Tunneling) pada Enzim:
                       Reaksi transfer hidrogen dan elektron pada enzim respirasi dan fotosintesis memanfaatkan sifat gelombang partikel untuk menembus langsung penghalang potensial aktivasi (tunneling) alih-alih melompati puncaknya secara termal, dibuktikan oleh Efek Isotop Kinetik (KIE) yang sangat besar saat atom hidrogen diganti dengan deuterium yang lebih berat (KIE = k_H / k_D >> 7).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Alam semesta telah mengembangkan komputasi kuantum alami di dalam sel daun hijau ratusan juta tahun sebelum manusia menemukannya.",
                    "Lingkungan termal seluler yang hangat dan bergetar justru dirancang secara presisi untuk menopang dan memandu transportasi kuantum ENAQT.",
                    "Burung migran dosensitisasi oleh gelombang radio frekuensi tinggi karena frekuensi radio mengacaukan resonansi spin pasangan radikal kriptokrom.",
                    "Penerowongan kuantum hidrogen memungkinkan enzim mempercepat reaksi biologis vital hingga faktor triliunan kali lipat."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Hamiltonan Transfer Eksiton Kompleks FMO",
                        latex = "\\hat{H} = \\sum_i \\epsilon_i |i\\rangle\\langle i| + \\sum_{i \\neq j} J_{ij} |i\\rangle\\langle j| + \\hat{H}_{\\mathrm{vibrasi}} + \\hat{H}_{\\mathrm{kopling}}",
                        explanation = "Hamiltonan kuantum yang menggabungkan energi eksitasi lokal situs klorofil epsilon_i, kopling dipol inter-pigmen J_ij, dan interaksi fonon protein."
                    ),
                    FormulaCard(
                        title = "Interkonversi Spin Pasangan Radikal Kriptokrom",
                        latex = "\\hat{H}_{\\mathrm{spin}} = g\\mu_B \\mathbf{B} \\cdot (\\hat{\\mathbf{S}}_1 + \\hat{\\mathbf{S}}_2) + \\sum_k \\hat{\\mathbf{S}}_1 \\cdot \\mathbf{A}_{1k} \\hat{\\mathbf{I}}_{1k}",
                        explanation = "Interaksi Zeeman medan magnet bumi B dan interaksi hiperhalus inti A yang mengatur rasio hasil reaksi biokimia retina burung."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Navigasi Migrasi Burung Air Lintas Benua di Pesisir Sembilang Sumatera & Konservasi Jalur Terbang EAAF",
                    scenario = "Ratusan ribu burung pantai migran terbang non-stop dari Siberia melintasi Semenanjung Malaya dan Taman Nasional Sembilang Sumatera menuju Australia mengikuti Jalur Terbang Asia Timur-Australasia (EAAF).",
                    application = "Ornitolog dan biofisikawan meneliti navigasi magnetik spesies burung trinil dan kedidi. Pengujian perilaku orientasi burung di dalam sangkar Emlen kerucut membuktikan bahwa paparan medan magnetik radiofrekuensi lemah (1.4 MHz medan derau broadband antropogenik) mengacaukan resonansi spin pasangan radikal kriptokrom dan menghilangkan kemampuan orientasi arah utara-selatan burung, memvalidasi mekanisme kompas kuantum biologis in vivo.",
                    impact = "Menetapkan zona hening elektromagnetik pada kawasan suaka margasatwa lahan basah pesisir penting Nusantara."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Pemodelan Penyerapan Foton Fotosintesis dan Fluoresensi Klorofil Daun Menggunakan Alkohol dan Lampu UV",
                    objective = "Mengamati eksitasi optik klorofil dan pelepasan energi foton saat jalur transfer eksiton diputus dari pusat reaksi biologis.",
                    materials = listOf("Beberapa lembar daun hijau segar (bayam atau daun singkong)", "Alkohol 70% atau hand sanitizer cair bening", "Gelas bening dan sendok untuk melumatkan daun", "Senter lampu UV 395 nm atau senter LED biru terang"),
                    steps = listOf(
                        "Lumatkan daun hijau di dalam gelas berisi alkohol selama 5 menit hingga cairan berubah menjadi hijau pekat (ekstraksi pigmen klorofil bebas).",
                        "Saring cairan hijau klorofil ke dalam gelas bening.",
                        "Di bawah cahaya lampu ruangan biasa, cairan tampak berwarna hijau zamrud segar.",
                        "Bawa larutan ke ruangan gelap gulita, lalu sorotkan lampu UV/LED biru horizontal dari samping gelas.",
                        "Amati fenomena mengejutkan: cairan klorofil hijau seketika memancarkan pendaran warna MERAH DARAH menyala pekat!",
                        "Diskusikan mengapa di daun utuh warna merah ini tidak tampak (karena eksiton ditransfer secara koheren 100% ke pusat reaksi untuk membuat gula), sedangkan saat klorofil diekstraksi bebas energinya terbuang kembali sebagai fluoresensi foton merah!"
                    ),
                    safetyNote = "Praktikum ekstraksi klorofil yang aman, jangan diminum dan jauhkan alkohol dari api terbuka."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa larutan ekstrak klorofil daun memancarkan pendaran fluoresensi merah darah saat disinari cahaya UV, padahal pada daun hijau yang masih hidup di pohon pendaran merah tersebut hampir tidak pernah terlihat?",
                        options = listOf(
                            "Karena pada daun hidup, energi eksiton foton yang diserap ditransfer secara ultra-cepat dan koheren menuju pusat reaksi kimia (Reaction Center) fotosintesis untuk memecah air, sedangkan pada ekstrak daun pusat reaksi tersebut telah hancur sehingga energi eksiton terbuang kembali sebagai foton fluoresensi merah",
                            "Karena daun di pohon terbuat dari cat hijau",
                            "Karena alkohol mengubah klorofil menjadi darah manusia",
                            "Karena klorofil hidup tidak bisa menyerap cahaya matahari"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Pada daun yang masih hidup dan utuh secara biologis, efisiensi transfer energi eksiton dari antena pigmen ke pusat reaksi mencapai lebih dari 95-99% berkat koherensi kuantum dan struktur protein FMO, menyisakan kurang dari 1-2% energi yang terbuang sebagai fluoresensi. Namun saat sel daun dilisiskan ke dalam alkohol, pigmen terlepas dari kompleks protein pelindungnya sehingga energi eksitasi yang terperangkap tidak memiliki tujuan kimiawi dan dipancarkan kembali sebagai foton fluoresensi merah berenergi lebih rendah.",
                        misconceptionAlert = "Pendaran merah membuktikan bahwa klorofil sebenarnya menyerap cahaya biru dan merah serta mengemisikan fluoresensi merah; warna hijau hanyalah panjang gelombang yang dipantulkan."
                    )
                )
            )

            else -> null
        }
    }
}

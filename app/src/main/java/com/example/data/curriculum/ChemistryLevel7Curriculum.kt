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

object ChemistryLevel7Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "kim-nanomaterial-quantum-dots",
            domain = Domain.KIMIA,
            topic = "Nanomaterial & Nanoteknologi",
            title = "Nanomaterial: Pengurungan Kuantum Quantum Dots, Grafena & Nanotube",
            description = "Efek kurungan kuantum semikonduktor, pergeseran eksiton Brus, sintesis grafena eksfoliasi fase cair, karbon nanotube (CNT), dan perakitan nanopartikel terarah.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("kim-anorganik-zat-padat-kisi", "fis-fisika-zat-padat-pita")
        ),
        ConceptItem(
            id = "kim-ai-ml-de-novo-design",
            domain = Domain.KIMIA,
            topic = "AI & Pembelajaran Mesin untuk Kimia",
            title = "Kimia Komputasi AI: Graph Neural Networks & Desain Molekul De Novo",
            description = "Representasi molekul graf molekuler, model GNN prediksi sifat fisikokimia, medan gaya neural berakurasi ab-initio, dan model generatif difusi perancangan molekul baru.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("kim-kuantum-komputasi-dft", "kim-medisinal-desain-obat-docking")
        ),
        ConceptItem(
            id = "kim-aktivasi-ch-fotoredoks",
            domain = Domain.KIMIA,
            topic = "Organologam & Sintesis Modern",
            title = "Aktivasi Ikatan C-H, Katalisis Fotoredoks & Elektrosintesis",
            description = "Fungsionalisasi ikatan karbon-hidrogen langsung tanpa pra-fungsionalisasi halida, siklus transfer elektron tunggal fotoredoks ruthenium/iridium, dan elektrosintesis hijau.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("kim-organik-lanjut-kopling-silang", "kim-elektrokimia-terapan-baterai-li")
        ),
        ConceptItem(
            id = "kim-kimia-bioortogonal-click",
            domain = Domain.KIMIA,
            topic = "Biologi Kimia & Proteomik",
            title = "Kimia Bioortogonal: Reaksi Click In Vivo & Profiling Enzim ABPP",
            description = "Reaksi klik bebas tembaga strain-promoted alkyne-azide cycloaddition (SPAAC), ligasi Staudinger sel hidup, probe fluoresen metabolik, dan profiling proteomik berbasis aktivitas.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("kim-organik-lanjut-kopling-silang", "kim-supramolekul-rotaksana")
        ),
        ConceptItem(
            id = "kim-material-energi-perovskit-water-splitting",
            domain = Domain.KIMIA,
            topic = "Material Energi Terbarukan",
            title = "Material Energi: Sel Surya Perovskit & Elektrokatalisis Water Splitting",
            description = "Struktur kristal ABX3 perovskit halida hibrida organik-anorganik, rekombinasi non-radiatif cacat batas butir, elektrokatalisis evolusi hidrogen (HER) dan oksigen (OER).",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("kim-anorganik-zat-padat-kisi", "kim-katalisis-heterogen-langmuir")
        ),
        ConceptItem(
            id = "kim-nuklir-radiokimia-pet",
            domain = Domain.KIMIA,
            topic = "Kimia Nuklir & Radiokimia Medis",
            title = "Radiokimia: Kimia Aktinida, Siklus Bahan Bakar & Radiofarmaka PET",
            description = "Kompleks koordinasi aktinida (U, Pu, Th), proses ekstraksi PUREX daur ulang nuklir, sintesis radiofarmaka positron [18F]FDG, dan dosimetri terapi radiasi bertarget.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("fis-fisika-inti-partikel-standar", "kim-koordinasi-medan-kristal")
        ),
        ConceptItem(
            id = "kim-kristalografi-scxrd-xps",
            domain = Domain.KIMIA,
            topic = "Spektroskopi & Kristalografi Lanjut",
            title = "Elusidasi Struktur: Kristalografi Sinar-X SCXRD, Spektroskopi XPS & EPR",
            description = "Difraksi sinar-X kristal tunggal (SCXRD) penyelesaian fase inversi Fourier Patterson/Direct Methods, analisis keadaan kimia permukaan XPS, dan resonansi spin elektron EPR.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("kim-anorganik-zat-padat-kisi", "fis-fisika-zat-padat-pita")
        ),
        ConceptItem(
            id = "kim-teknik-reaksi-cstr-pfr",
            domain = Domain.KIMIA,
            topic = "Teknik Reaksi Kimia & Industri",
            title = "Teknik Reaksi Kimia: Pemodelan Reaktor CSTR, PFR & Integrasi Termal Pinch",
            description = "Persamaan neraca mol reaktor tangki berpengaduk kontinu (CSTR), reaktor alir pipa (PFR), dispersi non-ideal kurva RTD, keterbatasan difusi Thiele Modulus, dan analisis Pinch.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("kim-kinetika-kimia-arrhenius", "mat-ode-orde-1-2")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "kim-nanomaterial-quantum-dots" -> LessonData(
                conceptId = "kim-nanomaterial-quantum-dots",
                simId = "sim-quantum-dots-confinement",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana layar televisi Quantum Dot (QLED) bisa memancarkan warna merah, hijau, dan biru murni yang sangat tajam hanya dari bahan senyawa kimia kadmium selenida yang sama?",
                        narrativeContext = "Dimas mengamati botol-botol suspensi nanopartikel koloid yang berpendar aneka warna cemerlang di bawah lampu UV."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu adalah Efek Pengurungan Kuantum (Quantum Confinement)! Ketika ukuran kristal semikonduktor diperkecil hingga di bawah radius Bohr eksitonnya (2 hingga 10 nanometer), elektron dan hole terkurung spasial sehingga celah pita energinya melebar secara terukur.",
                        narrativeContext = "Kakek menuliskan rumus pergeseran energi Brus: celah pita berbanding terbalik dengan kuadrat radius R^2."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan pada material karbon nano 2D seperti Grafena, elektron bergerak sebagai fermion Dirac tanpa massa efektif, menghasilkan konduktivitas listrik dan kekuatan tarik 200 kali lipat lebih tangguh dari baja!",
                        narrativeContext = "Kirana memperlihatkan lembaran kisi sarang lebah heksagonal karbon sp2 setebal satu atom tunggal."
                    )
                ),
                intuitionBody = """
                    Nanomaterial dan Kimia Nanoteknologi mempelajari zat yang memiliki setidaknya satu dimensi spasial berukuran antara 1 hingga 100 nanometer, di mana efek ukuran kuantum dan rasio luas permukaan terhadap volume mendominasi total sifat fisis dan kimianya.
                    
                    1. Efek Pengurungan Kuantum (Quantum Confinement) pada Quantum Dots:
                       Dalam semikonduktor ruah (bulk), pasangan elektron-hole membentuk eksiton dengan radius Bohr terikat r_B = epsilon_r * (m_e / mu) * a_0.
                       Ketika ukuran nanopartikel kristal (R) lebih kecil dari r_B (rezim pengurungan kuat):
                       Tingkat energi kontinu berubah menjadi tingkat energi diskrit laksana atom buatan (artificial atoms).
                       Persamaan Pergeseran Brus:
                       E_gap(R) = E_gap(bulk) + (hbar^2 * pi^2 / 2*mu * R^2) - (1.786 * e^2 / 4*pi*epsilon * R).
                       - Partikel berukuran kecil (~2 nm) memancarkan cahaya biru berenergi tinggi.
                       - Partikel berukuran besar (~6 nm) memancarkan cahaya merah berenergi rendah.
                       
                    2. Alotrop Karbon Nano:
                       - Grafena: Lapisan tunggal atom karbon hibridisasi sp2 berstruktur kisi sarang lebah (honeycomb). Memiliki mobilitas elektron >200.000 cm^2/(V.s), modulus Young 1 TPa, dan transmisi optik 97.7%.
                       - Karbon Nanotube (CNT): Silinder grafena tergulung. Vektor kiralitas (n, m) menentukan sifat kelistrikannya: logam (metallic) jika (n - m) kelipatan 3, atau semikonduktor.
                       
                    3. Sintesis Koloid Kimia Terkontrol:
                       Metode injeksi panas (hot-injection synthesis): Prekursor diinjeksikan secara cepat ke dalam pelarut bertitik didih tinggi yang mengandung ligan pengkapsul (surfactant seperti asam oleat atau TOPO).
                       Pemisahan fase nukleasi cepat dari fase pertumbuhan kristal difusif lambat (mekanisme LaMer) menjamin distribusi ukuran nanopartikel yang sangat seragam (monodispersitas).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Warna pendaran Quantum Dots dapat disetel ke seluruh spektrum kasat mata hanya dengan mengubah waktu pertumbuhan ukuran kristal.",
                    "Pergeseran energi Brus membuktikan bahwa model partikel dalam kotak kuantum 3D berlaku nyata pada skala nanoteknologi.",
                    "Satu gram grafena memiliki luas permukaan teoretis mencapai 2.630 meter persegi.",
                    "Ligan permukaan organik mencegah nanopartikel menggumpal (aglomerasi) sekaligus mempasivasi cacat ikatan menggantung (dangling bonds)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Celah Pita Kuantum Brus",
                        latex = "E_g(R) = E_g^{\\mathrm{bulk}} + \\frac{\\hbar^2 \\pi^2}{2\\mu R^2} - \\frac{1.786 e^2}{4\\pi \\varepsilon_r \\varepsilon_0 R}",
                        explanation = "Celah pita energi quantum dot meningkat berbanding terbalik dengan kuadrat radius partikel R akibat pengurungan kuantum eksiton."
                    ),
                    FormulaCard(
                        title = "Vektor Kiralitas Karbon Nanotube (CNT)",
                        latex = "\\mathbf{C}_h = n \\mathbf{a}_1 + m \\mathbf{a}_2, \\quad d = \\frac{a}{\\pi}\\sqrt{n^2 + nm + m^2}",
                        explanation = "Indeks bilangan bulat (n, m) menentukan diameter d dan sifat konduksi logam atau semikonduktor nanotube silinder."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Sintesis Grafena dari Limbah Tempurung Kelapa Sawit Indonesia oleh Peneliti Kimia Material BRIN",
                    scenario = "Indonesia menghasilkan jutaan ton limbah padat biomassa cangkang sawit setiap tahun yang belum bernilai tambah tinggi.",
                    application = "Peneliti kimia material BRIN mengubah arang cangkang sawit menjadi grafena berkualitas tinggi menggunakan modifikasi metode Hummers dan pirolisis katalitik dengan katalis garam besi. Grafena berbasis limbah sawit ini diformulasikan sebagai aditif elektroda superkapasitor densitas daya tinggi dan komposit polimer antikarat cat kapal laut TNI AL.",
                    impact = "Mengubah limbah perkebunan menjadi material maju bernilai ratusan dolar per gram dan mendukung hilirisasi industri hijau nasional."
                ),
                homeLab = HomeLabData(
                    title = "Sintesis Karbon Dots (C-Dots) Fluoresen Hijau Ramah Lingkungan dari Kopi / Gula Pasir Dapur",
                    objective = "Mensintesis nanopartikel titik karbon berpendar fluoresen menggunakan pemanasan microwave rumah tangga sederhana.",
                    materials = listOf("Gula pasir dapur (1 sendok makan)", "Air bersih (50 mL)", "Satu sendok teh cuka atau air lemon", "Oven microwave dapur atau panci pemanas", "Lampu senter UV mini (atau lampu detektor uang palsu)"),
                    steps = listOf(
                        "Larutkan gula pasir dan air lemon ke dalam mangkuk tahan panas.",
                        "Panaskan di dalam microwave dengan daya tinggi selama 4-5 menit hingga cairan berubah warna menjadi cokelat karamel gelap berbusa.",
                        "Larutkan kembali karamel hitam yang terbentuk dengan 50 mL air hangat, saring melalui kertas tisu / saringan kopi halus.",
                        "Bawa larutan bening kecokelatan ke ruangan gelap dan sorotkan lampu sinar UV 365 nm.",
                        "Amati pendaran fluoresen hijau-kebiruan terang yang memukau: jutaan Carbon Quantum Dots telah terbentuk melalui proses karbonisasi dan pasivasi permukaan asam sitrat!"
                    ),
                    safetyNote = "Gunakan sarung tangan oven saat mengeluarkan mangkuk panas dari microwave."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Jika ukuran diameter suatu partikel Quantum Dot semikonduktor CdSe diperkecil dari 6 nanometer menjadi 2 nanometer, bagaimanakah perubahan warna pendaran emisi fotonnya di bawah sinar UV?",
                        options = listOf(
                            "Panjang gelombang emisi memendek (pergeseran biru / blue-shift) dari merah menjadi hijau-kebiruan, karena celah pita energi melebar",
                            "Panjang gelombang memanjang menjadi inframerah gelap",
                            "Partikel akan berhenti memancarkan cahaya sama sekali",
                            "Partikel akan berubah warna menjadi hitam pekat"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Berdasarkan rumus Brus, energi celah pita E_g bertambah besar seiring berkurangnya radius R (E ~ 1/R^2). Energi foton emisi E = h*c / lambda yang lebih tinggi berarti panjang gelombang lambda menjadi lebih pendek, menggeser warna emisi dari energi rendah (merah) ke energi lebih tinggi (hijau hingga biru).",
                        misconceptionAlert = "Banyak yang mengira warna kimiawi hanya ditentukan oleh jenis unsur penyusunnya, padahal pada skala nano ukuran fisik mengubah warna zat secara radikal."
                    )
                )
            )

            "kim-ai-ml-de-novo-design" -> LessonData(
                conceptId = "kim-ai-ml-de-novo-design",
                simId = "sim-ai-molecular-gnn",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana model kecerdasan buatan (AI) modern bisa menciptakan molekul obat dan baterai baru dari nol (de novo) yang belum pernah terpikirkan oleh kimiawan mana pun sebelumnya?",
                        narrativeContext = "Dimas melihat algoritma generative AI yang merancang struktur kimia molekul baru di layar komputer."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Molekul direpresentasikan bukan sebagai gambar atau teks, melainkan sebagai Graf Molekuler (Molecular Graphs)! Atom-atom adalah simpul (nodes) dan ikatan kimia adalah sisi (edges). Graph Neural Networks (GNN) memproses topologi koneksi ini untuk memprediksi sifat kimiawi dalam sekejap.",
                        narrativeContext = "Kakek menggambarkan arsitektur pertukaran pesan (Message Passing Neural Network / MPNN)."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan Machine Learning Potentials (MLP) mampu memprediksi energi kuantum permukaan potensial seakurat perhitungan ab-initio DFT, namun dengan kecepatan sejuta kali lebih cepat!",
                        narrativeContext = "Kirana memaparkan perancangan molekul menggunakan model difusi terarah dan autoencoder variasional (VAE)."
                    )
                ),
                intuitionBody = """
                    Kecerdasan Buatan dan Pembelajaran Mesin merevolusi kimia modern, mengubah paradigma eksperimen coba-coba (trial-and-error) menjadi desain molekuler komputasi presisi tinggi yang digerakkan oleh data.
                    
                    1. Representasi Molekul & Graph Neural Networks (GNN):
                       Molekul adalah graf teratribusi tak berarah G = (V, E):
                       - Vektor fitur simpul h_v: nomor atom, hibridisasi, muatan formal, kiralitas.
                       - Vektor fitur sisi e_{vw}: tipe ikatan kovalen (tunggal, rangkap, aromatik), stereokimia cis/trans.
                       Message Passing Neural Networks (MPNN):
                       Pada setiap lapisan komputasi, setiap atom memperbarui representasi vektornya dengan mengumpulkan 'pesan' dari atom-atom tetangganya:
                       m_v^(t+1) = sum_{w in N(v)} M_t(h_v^t, h_w^t, e_{vw}), diikuti pembaruan h_v^(t+1) = U_t(h_v^t, m_v^(t+1)).
                       Lapisan pooling menghasilkan vektor representasi global molekul untuk memprediksi kelarutan, toksisitas, dan afinitas ikatan reseptor.
                       
                    2. Medan Gaya Pembelajaran Mesin (Machine Learning Potentials / MLP):
                       Mengaproksimasi Persamaan Schrödinger keadaan dasar tanpa memecahkan matriks determinan kuantum:
                       Model invarian rotasi dan translasi (E(3)-equivariant networks, misal SchNet, PaiNN, MACE) dilatih pada jutaan titik data energi dan gaya DFT. Mampu menyimulasikan dinamika molekul skala mikrodetik untuk jutaan atom dengan akurasi setara kimia kuantum DFT murni.
                       
                    3. Perancangan Molekuler De Novo (Generative Molecular Design):
                       - Variational Autoencoders (VAE) & Generative Adversarial Networks (GAN): Memetakan molekul ke ruang laten kontinu z, lalu menginterpolasi vektor menuju sifat optimum yang diinginkan.
                       - Model Difusi Geometris 3D (Equivariant Diffusion Models): Menghasilkan koordinat 3D atom secara langsung di dalam kantung aktif protein target penyakit, menghasilkan ligan dengan afinitas nanomolar yang belum pernah tercatat di basis data mana pun.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "GNN menghormati sifat intrinsik molekul yang invarian terhadap permutasi urutan penulisan rumus atom.",
                    "Arsitektur ekuivarian menjamin bahwa rotasi atau translasi molekul dalam ruang 3D menghasilkan rotasi vektor gaya yang konsisten secara fisika.",
                    "MLP memangkas waktu komputasi mekanika kuantum dari hitungan hari pada superkomputer menjadi hitungan milidetik di kartu grafis GPU.",
                    "Model generatif AI mampu menyaring ruang kimiawi (chemical space) 10^60 molekul yang mustahil disintesis secara manual."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Pembaruan Pesan Graph Neural Network (MPNN)",
                        latex = "\\mathbf{h}_v^{(t+1)} = \\mathrm{UPDATE}\\left( \\mathbf{h}_v^{(t)}, \\sum_{w \\in \\mathcal{N}(v)} \\mathrm{MESSAGE}\\left(\\mathbf{h}_v^{(t)}, \\mathbf{h}_w^{(t)}, \\mathbf{e}_{vw}\\right) \\right)",
                        explanation = "Fungsi propagasi informasi fitur atom tetangga w melintasi ikatan e_{vw} untuk memperbarui keadaan atom v."
                    ),
                    FormulaCard(
                        title = "Invarian Energi Medan Gaya Mesin E(3)",
                        latex = "E(\\mathcal{R}\\mathbf{X} + \\mathbf{t}) = E(\\mathbf{X}), \\quad \\mathbf{F}_i = -\\nabla_{\\mathbf{r}_i} E(\\mathbf{X})",
                        explanation = "Prediksi energi skalar sistem invarian terhadap translasi t dan rotasi R, gaya atom F_i diekstrak melalui diferensiasi otomatis."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Penemuan Kandidat Katalis Sintesis Biofuel Sawit Menggunakan Model Graph AI ITB & BRIN",
                    scenario = "Perancangan katalis bimetalik paduan logam transisi untuk pemutusan ikatan C-O trigliserida sawit membutuhkan eksplorasi kombinasi jutaan variasi faset permukaan kristal.",
                    application = "Tim kimia komputasi melatih model Graph Neural Network pada basis data Open Catalyst Project (OCP). Model AI memindai 500.000 konfigurasi adsorpsi intermediat reaksi dalam waktu 48 jam di GPU server, menyaring 3 formulasi katalis paduan nikel-molibdenum-fosfida berenergi bebas adsorpsi optimal yang kemudian disintesis dan terbukti meningkatkan konversi green diesel sebesar 28%.",
                    impact = "Menghemat waktu riset eksplorasi material dari 3 tahun menjadi 2 bulan dan mempercepat inovasi transisi energi terbarukan nasional."
                ),
                homeLab = HomeLabData(
                    title = "Eksplorasi Prediksi Sifat Toksisitas Molekul Menggunakan Model AI Online RDKit",
                    objective = "Mengamati bagaimana notasi graf SMILES diproses oleh algoritma komputasi untuk mengekstrak sidik jari molekuler (molecular fingerprint).",
                    materials = listOf("Laptop/Ponsel browser internet", "Google Colab gratis atau situs web molekul online rdkit.org"),
                    steps = listOf(
                        "Buka Google Colab dan instal pustaka kimia RDKit (pip install rdkit).",
                        "Masukkan notasi SMILES molekul kafein: 'CN1C=NC2=C1C(=O)N(C(=O)N2C)C'.",
                        "Jalankan fungsi ekstraksi sidik jari Morgan Fingerprint (radius 2) yang memindai lingkungan graf atom.",
                        "Cetak vektor biner berukuran 2048-bit yang merepresentasikan keberadaan gugus-gugus sub-graf fungsional.",
                        "Diskusikan bagaimana vektor sidik jari ini diumpankan ke model jaringan saraf pembelajaran mesin untuk memprediksi sifat toksisitas LD50."
                    ),
                    safetyNote = "Praktikum pemrograman kecerdasan buatan kimiawi komputer, aman tanpa bahan kimia fisik."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa representasi graf (Graph Neural Networks) jauh lebih unggul dan tepat secara fisis dibandingkan representasi gambar 2D piksel dalam memodelkan molekul kimia?",
                        options = listOf(
                            "Karena GNN secara alami invarian terhadap permutasi urutan penomoran atom dan orientasi rotasi ruang, mencerminkan topologi ikatan kovalen sejati tanpa distorsi piksel semu",
                            "Karena molekul sebenarnya terbuat dari piksel monitor",
                            "Karena GNN tidak menggunakan matematika",
                            "Karena komputer tidak bisa membaca teks rumus kimia"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Molekul tidak memiliki urutan 'kiri-kanan' atau 'atas-bawah' yang tetap; gambar piksel membedakan orientasi yang sebenarnya merepresentasikan molekul yang sama persis. Representasi graf murni mempertahankan konektivitas ikatan topologis kimiawi dan simetri fisika invarian, mencegah bias orientasi gambar semu.",
                        misconceptionAlert = "Menggunakan Convolutional Neural Networks (CNN) pengenal gambar pada struktur kimia sering menghasilkan kekeliruan karena orientasi gambar yang diputar dianggap sebagai senyawa berbeda."
                    )
                )
            )

            "kim-aktivasi-ch-fotoredoks" -> LessonData(
                conceptId = "kim-aktivasi-ch-fotoredoks",
                simId = "sim-ch-activation-photoredox",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, ikatan karbon-hidrogen (C-H) pada senyawa hidrokarbon sangat kuat dan lembam (energi ikatan > 400 kJ/mol). Apakah mungkin menyambung gugus baru langsung pada ikatan C-H tanpa harus mengubahnya dulu menjadi senyawa halida beracun?",
                        narrativeContext = "Dimas memandangi rute sintesis panjang yang membutuhkan banyak tahapan fungsionalisasi gugus perantara."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Bisa, Dimas! Itulah impian suci kimia organik: Fungsionalisasi Ikatan C-H Langsung (C-H Activation)! Menggunakan katalis logam transisi dengan bantuan gugus pengarah (directing groups), ikatan C-H yang inert dapat diaktifkan secara selektif.",
                        narrativeContext = "Kakek menuliskan siklus aktivasi C-H berbantuan paladium/rhodium membentuk cincin metalasiklus."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan kini dipadukan dengan Katalisis Fotoredoks Cahaya Tampak (Visible-Light Photoredox)! Foton dari lampu LED biru mengeksitasi kompleks rutenium atau iridium untuk memicu Transfer Elektron Tunggal (SET) yang sangat lembut pada suhu kamar!",
                        narrativeContext = "Kirana memperlihatkan botol reaksi yang disinari cahaya lampu LED biru terang dan menghasilkan radikal bebas terkontrol."
                    )
                ),
                intuitionBody = """
                    Kimia Organologam Mutakhir merevolusi sintesis kimia dengan mengeliminasi kebutuhan pra-fungsionalisasi reaktan melalui Aktivasi Ikatan C-H langsung dan Katalisis Fotoredoks cahaya tampak.
                    
                    1. Fungsionalisasi Ikatan C-H Langsung (C-H Bond Activation):
                       Sebagian besar molekul organik dipenuhi ikatan C-H inert tak reaktif. Pendekatan konvensional memerlukan pemasukan atom halogen (Ar-Br) yang memicu limbah stoikiometris.
                       - Mekanisme Aktivasi: Logam transisi (Pd, Rh, Ir, Ru) menyisip ke dalam ikatan C-H membentuk intermediat ikatan karbon-logam (C-M):
                         * Oxidative Addition: Logam kaya elektron menyisip langsung ke ikatan C-H.
                         * Concerted Metalation-Deprotonation (CMD): Paling umum untuk Pd(II) dan karboksilat, di mana ligan basa asetat mengabstraksi proton H+ serentak saat ikatan C-Pd terbentuk.
                       - Gugus Pengarah (Directing Groups / DG): Gugus fungsi yang memiliki pasangan elektron bebas (misal piridina, amida) mengoordinasikan logam dan mengarahkannya secara selektif menyerang ikatan C-H pada posisi orto di dekatnya melalui metalasiklus beranggota 5 atau 6.
                       
                    2. Katalisis Fotoredoks Cahaya Tampak (Photoredox Catalysis):
                       Dipelopori oleh David MacMillan dan Corey Stephenson, menggunakan fotokatalis kompleks logam polipiridil (misal [Ru(bpy)3]2+ atau [Ir(dppy)2(dtbbpy)]+) atau pewarna organik akridinium.
                       - Penyerapan Foton: Foton cahaya tampak (LED biru ~450 nm) memicu eksitasi Metal-to-Ligand Charge Transfer (MLCT) menghasilkan keadaan tereksitasi triplet berumur panjang *[Ru(bpy)3]2+.
                       - Transfer Elektron Tunggal (Single-Electron Transfer / SET): *Ru(II) bersifat unik karena dapat bertindak sekaligus sebagai pengoksidasi kuat (mereduksi menjadi Ru(I)) ATAU pereduksi kuat (teroksidasi menjadi Ru(III)), membangkitkan spesies radikal bebas reaktif pada suhu ruang netral.
                       
                    3. Katalisis Ganda Terkopel (Dual Photoredox/Transition Metal Catalysis):
                       Menggabungkan fotoredoks dengan katalisis silang nikel (Ni). Fotoredoks mengendalikan transfer elektron tunggal untuk menghasilkan intermediat radikal alkil, sementara siklus nikel merakit ikatan C-C, memungkinkan penggandengan fragmen molekul yang sebelumnya mustahil disintesis.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Aktivasi C-H memangkas tahapan sintesis molekul kompleks dari belasan langkah menjadi hanya beberapa langkah langsung.",
                    "Gugus pengarah mengatasi tantangan terbesar aktivasi C-H: memilih satu ikatan C-H tertentu di antara puluhan ikatan C-H yang identik.",
                    "Katalisis fotoredoks memanfaatkan lampu LED biru berdaya rendah yang aman dan ramah lingkungan alih-alih radiasi UV merusak atau panas tinggi.",
                    "Sinergi fotoredoks dan nikel membuka pembentukan ikatan karbon sp3-sp2 yang sangat krusial dalam desain obat-obatan modern."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Mekanisme Concerted Metalation-Deprotonation (CMD)",
                        latex = "\\mathrm{Ar-H} + \\mathrm{Pd(OAc)_2} \\xrightarrow{\\mathrm{TS\\,Siklik}} [\\mathrm{Ar-Pd(OAc)}] + \\mathrm{AcOH}",
                        explanation = "Interaksi serentak pembentukan ikatan Ar-Pd dengan abstraksi proton oleh ligan asetat melalui keadaan transisi siklik 6-anggota."
                    ),
                    FormulaCard(
                        title = "Eksitasi MLCT Fotokatalis Rutenium",
                        latex = "[\\mathrm{Ru(bpy)_3}]^{2+} \\xrightarrow{h\\nu\\,(\\text{biru})} {}^*[\\mathrm{Ru(bpy)_3}]^{2+} \\xrightarrow{\\mathrm{SET}} [\\mathrm{Ru(bpy)_3}]^{3+} + e^-",
                        explanation = "Penyerapan foton tampak membangkitkan keadaan triplet fotoredoks aktif yang mentransfer elektron tunggal ke substrat."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Sintesis Ramah Lingkungan Senyawa Bioaktif Antikanker Alami di ITB & Pusat Riset Kimia BRIN",
                    scenario = "Sintesis total senyawa bahan alam bioaktif turunan alkaloid indol membutuhkan rute fungsionalisasi aromatik yang efisien dan meminimalkan limbah berbahaya.",
                    application = "Kimiawan sintetis menerapkan katalisis ganda fotoredoks cahaya tampak dan aktivasi C-H paladium. Dengan menyinari campuran reaksi menggunakan lampu LED biru 40 Watt pada suhu ruang, ikatan C-H pada posisi C-2 cincin indol berhasil digandengkan langsung dengan gugus aril triflat dalam waktu 3 jam dengan rendemen 87% tanpa memerlukan pemanasan refluks kimia atau pelarut toksik.",
                    impact = "Mempercepat sintesis pustaka analog obat antikanker dan mendukung implementasi nyata kimia hijau di Indonesia."
                ),
                homeLab = HomeLabData(
                    title = "Pengamatan Efek Transfer Energi Foton Lampu UV/Biru pada Molekul Pewarna Tonik Kina (Kinin)",
                    objective = "Mengamati absorpsi foton dan emisi transfer energi keadaan tereksitasi pada molekul kinin.",
                    materials = listOf("Satu botol minuman air tonik (Tonic Water yang mengandung perisa kinin alami)", "Lampu senter UV mini (395 nm) atau lampu LED biru", "Gelas bening"),
                    steps = listOf(
                        "Tuang air tonik ke dalam gelas bening; amati bahwa cairan tampak bening tak berwarna di bawah lampu ruangan biasa.",
                        "Matikan lampu ruangan, sorotkan senter UV/LED biru ke dalam gelas air tonik.",
                        "Amati pendaran cahaya biru fluoresen yang sangat pekat dan bercahaya di sepanjang berkas sinar.",
                        "Diskusikan proses fotofisika: foton berenergi diserap oleh cincin kuinolin molekul kinin, mengeksitasi elektron ke keadaan singlet/triplet tereksitasi yang kemudian memancarkan kembali foton tampak—mekanisme dasar eksitasi yang memicu reaksi fotoredoks."
                    ),
                    safetyNote = "Praktikum optik fluoresensi minuman komersial yang sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah fungsi utama dari 'Gugus Pengarah' (Directing Group) dalam reaksi aktivasi ikatan C-H selektif?",
                        options = listOf(
                            "Mengoordinasikan pusat logam katalis secara spasial dan membimbingnya menyerang ikatan C-H spesifik di dekatnya melalui pembentukan cincin kelat metalasiklus",
                            "Menaikkan suhu reaksi hingga ribuan derajat",
                            "Mengubah molekul organik menjadi polimer plastik",
                            "Mencegah cahaya matahari masuk ke dalam tabung reaksi"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Molekul organik memiliki banyak ikatan C-H dengan energi ikatan yang hampir sama. Gugus pengarah memiliki atom donor elektron (seperti N atau O) yang mengikat logam terlebih dahulu, memposisikan logam tepat di atas ikatan C-H sasaran dalam jarak jangkauan kelat cincin (biasanya orto), sehingga mengatasi masalah selektivitas posisi regioselektivitas.",
                        misconceptionAlert = "Tanpa gugus pengarah, reaksi aktivasi C-H akan menyerang seluruh ikatan C-H secara acak menghasilkan campuran produk tak terpisahkan."
                    )
                )
            )

            "kim-kimia-bioortogonal-click" -> LessonData(
                conceptId = "kim-kimia-bioortogonal-click",
                simId = "sim-bioorthogonal-click-chemistry",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, di dalam sel hidup ada miliaran molekul air, protein, gula, dan lipid yang sangat reaktif. Bagaimana kita bisa melakukan reaksi kimia buatan tepat di dalam sel tubuh makhluk hidup tanpa mengganggu kehidupan sel?",
                        narrativeContext = "Dimas melihat sel hidup yang glikan permukaannya menyala terang oleh molekul fluoresen yang dipasang langsung di dalam tubuh tikus."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itulah penemuan bersejarah Carolyn Bertozzi yang meraih Hadiah Nobel Kimia 2022: Kimia Bioortogonal (Bioorthogonal Chemistry)! Reaksi kimia yang berlangsung secara eksklusif dan selektif di dalam organisme hidup tanpa pernah bereaksi dengan lingkungan hayati sel.",
                        narrativeContext = "Kakek menuliskan reaksi sikloadisi azida-alkuna tanpa tembaga berbantuan regangan cincin (SPAAC)."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan dengan menghubungkannya ke probe fluoresen, teknik Activity-Based Protein Profiling (ABPP) dapat memetakan enzim-enzim mana saja yang aktif saat sel mengalami infeksi atau kanker secara langsung in vivo!",
                        narrativeContext = "Kirana memperlihatkan pemetaan profil proteomik fluoresen gel elektroforesis SDS-PAGE."
                    )
                ),
                intuitionBody = """
                    Kimia Bioortogonal dan Biologi Kimia menjembatani kimia sintetis dan biologi seluler dengan merancang reaksi kimia yang dapat berlangsung di dalam lingkungan seluler hidup tanpa mengganggu proses biokimia alami inang.
                    
                    1. Konsep & Kriteria Reaksi Bioortogonal:
                       Reaksi kimia buatan manusia yang terjadi di dalam sel hidup harus memenuhi syarat mutlak:
                       - Bioortogonalitas Sejati: Kedua gugus fungsi harus inert dan tidak bereaksi dengan air, asam amino, nukleotida, atau metabolit biologis alami.
                       - Biokompatibilitas: Berlangsung dalam larutan air pada pH fisiologis (~7.4) dan suhu 37 C tanpa reagen beracun (bebas katalis tembaga sitotoksik).
                       - Kinetika Cepat: Laju reaksi bimolekuler tinggi (k > 10^3 M^(-1) s^(-1)) pada konsentrasi mikromolar encer.
                       - Ikatan Kovalen Permanen & Stabil secara metabolik.
                       
                    2. Reaksi-Reaksi Bioortogonal Kunci:
                       - Ligasi Staudinger Bertozzi: Reaksi antara azida organik (-N3) dan fosfina termodifikasi menghasilkan ikatan amida stabil tanpa tembaga.
                       - Sikloadisi Azida-Alkuna Terkatalisis Regangan Cincin (Strain-Promoted Alkyne-Azide Cycloaddition / SPAAC): Menggunakan siklooktuna yang sangat tegang secara sudut (seperti DIFO, BCN, DBCO). Energi regangan cincin (~18 kkal/mol) menurunkan energi aktivasi sikloadisi [3+2] dengan azida secara dramatis tanpa memerlukan katalis tembaga Cu(I) yang membunuh sel.
                       - Sikloadisi Invers Diena [4+2] Tetrazina-Trans-Siklooktena (IEDDA): Reaksi tercepat dalam kimia bioortogonal (k > 10^5 M^(-1) s^(-1)) dengan pelepasan gas nitrogen N2 tak beracun sebagai produk sampingan pendorong termodinamika.
                       
                    3. Profiling Proteomik Berbasis Aktivitas (Activity-Based Protein Profiling / ABPP):
                       Menggunakan probe molekuler trifungsional:
                       - Grup Perang (Warhead): Menyerang residu katalitik sisi aktif enzim secara kovalen permanen (hanya mengikat enzim dalam keadaan aktif fungsional).
                       - Pegangan Bioortogonal (Tag Alkyne/Azide): Sebagai jangkar untuk reaksi klik berikutnya.
                       - Reporter Fluoresen / Biotin: Dipasang melalui reaksi klik in vitro untuk memvisualisasikan dan memisahkan enzim aktif menggunakan kromatografi afinitas streptavidin.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Azida adalah gugus fungsi ideal bioortogonal: tidak ada makhluk hidup di bumi yang memproduksi azida secara alami, namun ukurannya kecil dan tidak merusak fungsi biomolekul inang.",
                    "Regangan cincin pada siklooktuna menggantikan peran katalis tembaga beracun dengan energi mekanik pegas molekuler terkompresi.",
                    "Kimia bioortogonal memungkinkan visualisasi gula glikans seluler yang tidak dapat diberi kode genetik oleh protein GFP.",
                    "ABPP mengukur aktivitas fungsi enzimatik sejati, bukan sekadar kelimpahan transkrip mRNA atau protein statis."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Sikloadisi Bioortogonal SPAAC Bebas Tembaga",
                        latex = "\\mathrm{R-N_3} + \\text{Siklooktuna (DBCO)} \\xrightarrow{37^\\circ\\mathrm{C},\\,\\mathrm{pH}\\,7.4} \\text{Triazol Siklik Kovalen}",
                        explanation = "Energi regangan sudut cincin siklooktuna memicu sikloadisi [3+2] spontan dengan azida dalam sel hidup tanpa sitotoksisitas."
                    ),
                    FormulaCard(
                        title = "Kinetika Reaksi Bioortogonal IEDDA Tetrazina",
                        latex = "\\text{Tetrazina} + \\text{trans-Siklooktena} \\xrightarrow{k > 10^5\\,\\mathrm{M}^{-1}\\mathrm{s}^{-1}} \\text{Dihidropiridazina} + \\mathrm{N_2}\\uparrow",
                        explanation = "Reaksi sikloadisi invers demand Diels-Alder dengan laju kinetika ultra-cepat yang didorong oleh pelepasan gas N2."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pelabelan Bioortogonal Glikan Permukaan Sel Kanker Payudara di Pusat Riset Biomedis BRIN",
                    scenario = "Sel kanker mengekspresikan pola asam sialat glikan yang sangat padat pada permukaannya untuk mengelabui sistem imun inang.",
                    application = "Peneliti biologi kimia memberi makan kultur sel kanker dengan prekursor gula sintetis tetraasetil-N-azidoasetilmanosamin (Ac4ManNAz). Sel memproses gula tersebut dan mengekspresikan gugus azida bioortogonal pada glikoprotein permukaannya. Penambahan probe fluoresen pembawa DBCO memicu reaksi klik SPAAC in vivo dalam waktu 15 menit, memetakan kepadatan glikans ganas di bawah mikroskop konfokal tanpa merusak viabilitas sel.",
                    impact = "Membuka jalan pengembangan terapi antibodi terkonjugasi obat (Antibody-Drug Conjugates / ADC) generasi baru yang menargetkan glikan spesifik kanker."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Pemodelan Selektivitas Gembok-Kunci Kimia Bioortogonal dengan Konektor USB vs Kabel Audio",
                    objective = "Memahami konsep ortogonalitas fungsional di mana dua sistem yang beroperasi di lingkungan yang sama tidak saling mengganggu.",
                    materials = listOf("Satu kabel USB-C dengan port pasangannya", "Satu kabel audio jack 3.5 mm dengan port audionya", "Satu colokan listrik rumah"),
                    steps = listOf(
                        "Coba colokkan kabel USB-C ke soket audio 3.5 mm atau soket listrik; amati bahwa bentuk geometri tidak cocok dan tidak ada transfer sinyal yang terjadi (ortogonalitas fisik).",
                        "Colokkan kabel USB-C ke port USB-C pasangannya; koneksi langsung terhubung seketika.",
                        "Diskusikan analogi ini dengan sel hidup: molekul alami sel (seperti air dan gula glukosa) tidak cocok bereaksi dengan azida atau DBCO, sementara azida dan DBCO menemukan pasangannya secara eksklusif dan bereaksi membentuk ikatan triazol kokoh di tengah hiruk-pikuk ribuan molekul lain."
                    ),
                    safetyNote = "Jangan memasukkan kabel logam apa pun ke stopkontak listrik."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa reaksi Click Chemistry klasik CuAAC (sikloadisi azida-alkuna terkatalisis ion tembaga Cu(I)) tidak dapat digunakan secara langsung di dalam sel hewan hidup in vivo, sehingga Carolyn Bertozzi harus mengembangkan reaksi SPAAC?",
                        options = listOf(
                            "Karena ion tembaga Cu(I) bersifat sangat sitotoksik dan memicu stres oksidatif mematikan bagi sel hidup, sedangkan SPAAC memanfaatkan regangan cincin tanpa memerlukan tembaga sama sekali",
                            "Karena tembaga meledak jika terkena air",
                            "Karena tembaga membuat sel berubah warna menjadi hijau",
                            "Karena reaksi tembaga membutuhkan suhu 1000 derajat Celsius"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Ion Cu(I) mengkatalisis reaksi pembentukan Spesi Oksigen Reaktif (ROS) melalui siklus Fenton intraseluler yang merusak DNA dan membran lipid sel seketika (sitotoksisitas tinggi). Reaksi SPAAC mengatasi masalah fatal ini dengan memanfaatkan energi regangan sudut cincin siklooktuna (strain-promoted) untuk mendorong reaksi tanpa katalis logam apa pun.",
                        misconceptionAlert = "CuAAC sangat bagus dan efisien untuk tabung reaksi atau bahan mati (in vitro), namun mutlak memerlukan modifikasi bebas tembaga (SPAAC) jika diterapkan pada makhluk hidup."
                    )
                )
            )

            "kim-material-energi-perovskit-water-splitting" -> LessonData(
                conceptId = "kim-material-energi-perovskit-water-splitting",
                simId = "sim-perovskite-solar-water-split",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, sel surya silikon di atap rumah membutuhkan proses pemurnian kristal bersuhu 1400 derajat Celsius yang mahal dan rumit. Apakah ada material sel surya baru yang bisa dicetak murah seperti mencetak koran?",
                        narrativeContext = "Dimas melihat modul sel surya film tipis fleksibel berwarna gelap kecokelatan."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Ada, Dimas! Itulah Sel Surya Perovskit Halida Hibrida! Efisiensi konversi energinya melonjak fantastis dari 3.8% pada tahun 2009 menjadi di atas 26% hari ini—rekor peningkatan efisiensi tercepat dalam sejarah teknologi surya!",
                        narrativeContext = "Kakek menggambarkan struktur kristal oktahedral ABX3 kation metilamonium timbal iodida CH3NH3PbI3."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan listrik hijau yang dihasilkan dapat langsung dialirkan ke sel Pemecah Molekul Air (Water Splitting) untuk memproduksi gas Hidrogen Hijau murni bebas emisi melalui elektrokatalisis!",
                        narrativeContext = "Kirana memperlihatkan gelembung gas hidrogen dan oksigen yang memancar deras dari dua elektroda katalis."
                    )
                ),
                intuitionBody = """
                    Kimia Material Energi memimpin transisi global menuju energi bersih terbarukan melalui sel surya fotovoltaik generasi baru dan konversi energi kimiawi pemecahan air (solar-to-hydrogen).
                    
                    1. Sel Surya Perovskit Halida Hibrida (Perovskite Solar Cells):
                       Memiliki rumus struktur kristal kubus ABX3:
                       - Kation A besar di sudut kubus (organik CH3NH3+ / MA+, CH(NH2)2+ / FA+, atau Cs+).
                       - Kation logam B di pusat oktahedral (Pb2+ atau Sn2+).
                       - Anion halida X di muka kubus (I-, Br-, Cl-).
                       Karakteristik Fisikokimia Luar Biasa:
                       - Koefisien absorpsi optik sangat tinggi (lapisan 300 nm menyerap hampir seluruh cahaya tampak).
                       - Celah pita tertunai (tunable bandgap 1.2 - 2.3 eV).
                       - Panjang difusi pembawa muatan eksiton yang panjang (> 1 mikrometer) dan toleransi cacat kisi kristal yang tinggi (defect-tolerant electronic structure).
                       Tantangan Utama: Stabilitas degradasi akibat kelembaban air (hidrolisis kation organik) dan stres termal radiasi surya, diatasi melalui rekayasa batas butir 2D/3D heterostruktur dan penggantian kation anorganik Cs/FA.
                       
                    2. Elektrokatalisis Pemecahan Air (Water Splitting):
                       Mengubah air menjadi hidrogen dan oksigen: 2 H2O -> 2 H2 + O2 (Delta_G0 = +237 kJ/mol, E0_sel = 1.23 V):
                       - Reaksi Evolusi Hidrogen (HER di Katoda):
                         2 H(+) + 2 e(-) -> H2 (kinetika cepat, katalis optimal Pt, atau fosfida/sulfida logam transisi MoS2, Ni2P).
                       - Reaksi Evolusi Oksigen (OER di Anoda):
                         2 H2O -> O2 + 4 H(+) + 4 e(-) (melibatkan transfer 4 proton dan 4 elektron terkopel yang sangat lambat kinetikanya, membutuhkan overpotensial tinggi, katalis terbaik IrO2, RuO2, atau NiFe-LDH murah).
                       Efisiensi keseluruhan ditentukan oleh rancangan elektrokatalis dengan energi bebas adsorpsi intermediat mendekati nol (Puncak Kurva Vulkano Sabatier).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Perovskit halida dapat disintesis dari larutan tinta cair pada suhu rendah (< 100 C) menggunakan metode roll-to-roll printing.",
                    "Sel surya tandem Perovskit-Silikon menggabungkan penyerapan spektrum biru oleh perovskit dan spektrum inframerah oleh silikon, menembus efisiensi di atas 33%.",
                    "Reaksi OER 4-elektron adalah penghambat utama efisiensi produksi hidrogen hijau di seluruh dunia.",
                    "Kurva Vulkano Sabatier membuktikan bahwa katalis terbaik mengikat intermediat secara pas: tidak terlalu kuat dan tidak terlalu lemah."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Faktor Toleransi Goldschmidt Struktur Perovskit",
                        latex = "t = \\frac{r_A + r_X}{\\sqrt{2}(r_B + r_X)}, \\quad 0.8 \\le t \\le 1.0 \\implies \\text{Fase Kubus Perovskit Stabil}",
                        explanation = "Rasio jari-jari ionik kation A, B, dan anion X yang memprediksi kestabilan kisi kristal oktahedral 3D."
                    ),
                    FormulaCard(
                        title = "Potensial Termodinamika Elektrolisis Air Total",
                        latex = "E_{\\mathrm{sel}} = 1.23\\,\\mathrm{V} + \\eta_{\\mathrm{HER}} + \\eta_{\\mathrm{OER}} + I R_{\\mathrm{ohm}}",
                        explanation = "Tegangan listrik riil yang dibutuhkan mencakup tegangan standar 1.23V ditambah overpotensial kinetika HER/OER dan resistansi ohmik sel."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pengembangan Sel Surya Perovskit Tandem & Pembangkit Hidrogen Hijau Cirata BRIN-PLN",
                    scenario = "PLN Nusantara Power mengoperasikan PLTS Terapung Cirata Jawa Barat (192 MWp) dan membangun fasilitas produksi hidrogen hijau (Green Hydrogen Plant).",
                    application = "Periset material fotovoltaik BRIN mengembangkan lapisan perovskit halida bebas timbal (Cs2AgBiBr6) tahan kelembaban tropis untuk melapisi permukaan panel surya terapung. Listrik surplus yang dihasilkan dialirkan ke unit elektroliser air alkali berbahan katalis nanostruktur NiFe-LDH buatan lokal yang memproduksi hidrogen murni 100 kg/hari sebagai bahan bakar bus hidrogen transportasi publik.",
                    impact = "Mendorong kemandirian teknologi ekosistem energi baru terbarukan dan nol emisi karbon (Net Zero Emission 2060) Indonesia."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Elektrolisis Air Pemecah Molekul Menjadi Gelembung Gas Hidrogen dan Oksigen",
                    objective = "Mengamati pemecahan elektrokimia molekul H2O menjadi gas H2 dan O2 serta memverifikasi rasio volume stoikiometri 2:1.",
                    materials = listOf("Dua buah pensil kayu yang kedua ujungnya diraut (grafit sebagai elektroda inert)", "Baterai kotak 9 Volt", "Gelas bening berisi air hangat", "Satu sendok teh garam dapur atau baking soda (sebagai elektrolit penghantar)", "Dua kabel jepit buaya"),
                    steps = listOf(
                        "Larutkan satu sendok teh baking soda ke dalam gelas air.",
                        "Jepitkan kutub positif baterai 9V ke grafit pensil 1 (anoda), dan kutub negatif ke grafit pensil 2 (katoda).",
                        "Celupkan kedua ujung bawah grafit pensil ke dalam air berjarak 2 cm.",
                        "Amati letupan gelembung gas di kedua elektroda seketika: di katoda terbentuk gas hidrogen (H2) dan di anoda terbentuk gas oksigen (O2).",
                        "Amati secara cermat bahwa volume gelembung gas di katoda hidrogen memancar dua kali lipat lebih banyak dibandingkan di anoda oksigen, membuktikan rumus kimia H2O!"
                    ),
                    safetyNote = "Praktikum elektrolisis baterai tegangan rendah yang aman, lakukan di ruangan berventilasi baik."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Dalam proses pemecahan air (water splitting) untuk menghasilkan hidrogen hijau, mengapa reaksi di elektroda anoda (OER) selalu menjadi hambatan kinetika terbesar dibandingkan katoda (HER)?",
                        options = listOf(
                            "Karena OER memerlukan transfer 4 elektron dan 4 proton terkopel yang rumit dengan pemutusan ikatan ganda O=O, menghasilkan overpotensial kinetika yang jauh lebih tinggi",
                            "Karena gas oksigen beratnya melebihi hidrogen",
                            "Karena air tidak mengandung oksigen",
                            "Karena anoda selalu meleleh terkena air"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Reaksi evolusi hidrogen (HER) hanya melibatkan transfer 2 elektron yang berlangsung relatif cepat. Sebaliknya, reaksi evolusi oksigen (OER) adalah proses transfer 4 elektron bertahap yang melibatkan pembentukan berbagai intermediat oksigen permukaan (*OH, *O, *OOH) dengan penghalang aktivasi kinetika tinggi, menyebabkan pemborosan energi tegangan overpotensial yang signifikan.",
                        misconceptionAlert = "Banyak yang mengira memproduksi gas hidrogen itu sendiri yang paling sulit, padahal secara kinetika pelepasan gas oksigenlah yang membatasi efisiensi elektroliser."
                    )
                )
            )

            "kim-nuklir-radiokimia-pet" -> LessonData(
                conceptId = "kim-nuklir-radiokimia-pet",
                simId = "sim-radiochem-pet-imaging",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana dokter radiologi bisa memetakan tumor kanker kecil yang bersembunyi di dalam organ tubuh pasien menggunakan alat pemindai Positron Emission Tomography (PET scan)?",
                        narrativeContext = "Dimas melihat gambar citra PET-CT berwarna yang memperlihatkan titik terang menyala pada jaringan tumor."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Pasien disuntik dengan Radiofarmaka Glukosa Berlabel Positron ([18F]FDG), Dimas! Sel kanker yang sangat rakus mengkonsumsi gula (efek Warburg) menyerap molekul gula berlabel Fluor-18. Saat F-18 meluruh, ia memancarkan positron yang bertumbukan dengan elektron!",
                        narrativeContext = "Kakek menggambarkan anihilasi positron-elektron yang memancarkan sepasang sinar gamma 511 keV berlawanan arah 180 derajat."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan karena waktu paruh isotop Fluor-18 hanya 110 menit, kimiawan radiasi harus mensintesis radiofarmaka tersebut menggunakan siklotron medis otomatis dan menyuntikkannya ke pasien dalam hitungan jam sebelum luruh habis!",
                        narrativeContext = "Kirana memaparkan modul sintesis radiokimia otomatis di dalam lemari sel panas (hot cell) bertimbal tebal."
                    )
                ),
                intuitionBody = """
                    Radiokimia dan Kimia Nuklir mempelajari sifat-sifat kimiawi isotop radioaktif, kimia koordinasi aktinida dalam siklus bahan bakar nuklir, serta sintesis molekul radiofarmaka diagnosis tomografi dan terapi onkologi.
                    
                    1. Sintesis Radiofarmaka PET ([18F]-Fluorodeoksiglukosa / FDG):
                       Fluor-18 diproduksi di akselerator Siklotron medis melalui reaksi nuklir penembakan proton pada air bertanda isotop oksigen: 18O(p, n)18F.
                       - Waktu Paruh t_1/2: 109.8 menit (peluruhan beta plus / positron).
                       - Reaksi Sintesis Organik Cepat: Nukleofil [18F]-fluorida dimasukkan ke dalam prekursor manosa triflat melalui substitusi nukleofilik bimolekuler SN2 cepat, diikuti hidrolisis asam gugus pelindung ester asetil menghasilkan 2-[18F]fluoro-2-deoksi-D-glukosa ([18F]FDG).
                       - Mekanisme Seluler (Perangkap Metabolik): [18F]FDG diangkut ke dalam sel oleh transporter glukosa (GLUT1). Enzim heksokinase memfosforilasinya menjadi [18F]FDG-6-fosfat. Karena tidak memiliki gugus hidroksil 2-OH, molekul ini tidak dapat diproses lebih lanjut oleh enzim glikolisis dan terperangkap secara permanen di dalam sel kanker yang hipermetabolik.
                       
                    2. Anihilasi Positron & Deteksi Kebetulan Coincidence:
                       Positron e(+) yang dipancarkan melambat menempuh jarak sub-milimeter di jaringan, lalu bertumbukan dengan elektron e(-) jaringan tubuh:
                       e(+) + e(-) -> 2 foton sinar gamma (masing-masing berenergi persis 511 keV yang memancar berlawanan arah 180 derajat).
                       Detektor sintilator melingkar mencatat 'coincidence event' serentak, merekonstruksi koordinat posisi anatomis tumor secara 3 dimensi tomografi.
                       
                    3. Kimia Aktinida & Siklus Bahan Bakar Nuklir PUREX:
                       Unsur aktinida (Uranium, Plutonium, Torium) memiliki orbital 5f terdelokalisasi dengan variasi bilangan oksidasi yang luas (U(III) hingga U(VI)).
                       Proses PUREX (Plutonium Uranium Redox Extraction): Memisahkan uranium dan plutonium dari produk fisi limbah radioaktif tingkat tinggi bahan bakar nuklir bekas menggunakan ekstraksi cair-cair pelarut tributil fosfat (TBP) dalam minyak tanah (kerosene) memanfaatkan perbedaan kelarutan kompleks kovalen koordinasi nitrat aktinil [UO2(NO3)2(TBP)2].
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Sintesis radiofarmaka berpacu dengan waktu: setiap detik molekul meluruh secara eksponensial seiring waktu paruh 110 menit.",
                    "Perangkap metabolik [18F]FDG mengeksploitasi kelemahan biokimiawi sel kanker yang mengkonsumsi gula puluhan kali lipat lebih banyak dari sel normal.",
                    "Anihilasi positron menghasilkan dua foton gamma 511 keV yang berhamburan segaris lurus, memungkinkan lokalisasi posisi sumber tanpa perlu kolimator mekanik timbal berat.",
                    "Kimia koordinasi aktinida memungkinkan pemurnian kembali 96% bahan bakar nuklir bekas untuk digunakan kembali dalam reaktor pembiak (breeder reactors)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Hukum Peluruhan Radioaktif Eksponensial",
                        latex = "A(t) = A_0 e^{-\\lambda t} = A_0 \\left(\\frac{1}{2}\\right)^{t / t_{1/2}}, \\quad \\lambda = \\frac{\\ln 2}{t_{1/2}}",
                        explanation = "Aktivitas radioaktif A(t) berkurang eksponensial seiring waktu paruh radioisotop."
                    ),
                    FormulaCard(
                        title = "Energi Anihilasi Positron-Elektron",
                        latex = "e^+ + e^- \\to 2\\gamma, \\quad E_\\gamma = m_e c^2 = 511\\,\\mathrm{keV}",
                        explanation = "Massa diam kedua partikel berubah total 100% menjadi energi sepasang foton gamma berlawanan arah 180 derajat."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Operasional Siklotron Medis & Produksi Radiofarmaka [18F]FDG di RS Kanker Dharmais & BATAN/BRIN",
                    scenario = "RS Kanker Dharmais Jakarta mengoperasikan fasilitas siklotron proton 18 MeV untuk memproduksi radiofarmaka diagnosis dini kanker metastatik.",
                    application = "Tim radiokimiawan medis menembakkan berkas proton ke target air bertanda [18O]H2O menghasilkan cairan [18F]-fluorida. Cairan dialirkan melalui pipa kapiler mikro ke lemari steril timbal (hot cell) berisi modul sintesis otomatis FastLab. Dalam waktu 25 menit, molekul [18F]FDG disintesis dengan kemurnian radiokimia >98%, diuji sterilitas dan pirogenitasnya, lalu didistribusikan ke puluhan rumah sakit jejaring di wilayah Jabodetabek sebelum subuh.",
                    impact = "Menyediakan diagnosis staging kanker stadium dini dan evaluasi keberhasilan kemoterapi bagi ribuan pasien kanker setiap bulannya."
                ),
                homeLab = HomeLabData(
                    title = "Pemodelan Peluruhan Eksponensial Waktu Paruh Radioisotop dengan 100 Keping Koin",
                    objective = "Memahami hukum statistik peluruhan radioaktif N(t) = N0*(1/2)^(t/t1/2) secara empiris.",
                    materials = listOf("100 keping koin uang logam (atau 100 permen kecil bertanda satu sisi)", "Baskom besar", "Kertas grafik"),
                    steps = listOf(
                        "Masukkan 100 koin ke dalam baskom; hitung jumlah awal N0 = 100 (t = 0).",
                        "Kocok baskom dan tumpahkan ke meja secara merata (merepresentasikan 1 satuan waktu paruh t_1/2).",
                        "Singkirkan semua koin yang menunjukkan sisi Angka (merepresentasikan atom yang telah meluruh memancarkan radiasi).",
                        "Hitung sisa koin sisi Gambar (atom induk yang belum meluruh), catat jumlahnya N1.",
                        "Ulangi langkah mengocok dan menyingkirkan koin untuk siklus 2, 3, 4, 5, dan 6.",
                        "Plot jumlah sisa koin terhadap siklus waktu; amati kurva peluruhan eksponensial sempurna dan buktikan bahwa jumlah atom berkurang mendekati separuhnya pada setiap langkah."
                    ),
                    safetyNote = "Praktikum simulasi probabilitas meja kerja yang sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa molekul 2-[18F]fluoro-2-deoksi-D-glukosa ([18F]FDG) terperangkap secara permanen di dalam sel kanker dan tidak terurai habis seperti glukosa normal?",
                        options = listOf(
                            "Karena [18F]FDG berhasil difosforilasi oleh heksokinase menjadi FDG-6-fosfat, namun tidak memiliki gugus hidroksil pada atom karbon-2 sehingga tidak dapat diisomerisasi oleh enzim fosfoglukoisomerase untuk melanjutkan glikolisis",
                            "Karena [18F]FDG membeku menjadi batu di dalam sel",
                            "Karena sel kanker tidak memiliki membran sel",
                            "Karena [18F]FDG mematikan seluruh sel dalam waktu satu detik"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Molekul FDG memiliki atom Fluorin di posisi C-2 menggantikan gugus -OH alami glukosa. Heksokinase tetap memfosforilasinya pada posisi C-6 (memberikan muatan negatif fosfat yang menguncinya di dalam sitoplasma sel). Namun enzim langkah kedua glikolisis membutuhkan gugus 2-OH untuk mengkatalisis isomerisasi menjadi fruktosa; ketiadaan gugus ini menghentikan metabolisme sehingga molekul bermuatan terperangkap menumpuk di dalam sel kanker.",
                        misconceptionAlert = "FDG tidak meracuni atau membunuh sel kanker; ia murni menjadi penanda fluoresen radiasi (radiotracer) visual."
                    )
                )
            )

            "kim-kristalografi-scxrd-xps" -> LessonData(
                conceptId = "kim-kristalografi-scxrd-xps",
                simId = "sim-scxrd-xps-analysis",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana para kimiawan bisa yakin 100% terhadap posisi tiga dimensi setiap atom dan panjang ikatan senyawa kompleks baru yang belum pernah disintesis sebelumnya?",
                        narrativeContext = "Dimas memandangi visualisasi model kisi kristal elipsoid termal 3D hasil analisis kristalografi."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menggunakan Difraksi Sinar-X Kristal Tunggal (Single-Crystal X-ray Diffraction / SCXRD), Dimas! SCXRD adalah standar emas penentuan struktur molekul absolut. Difraksi sinar-X oleh kerapatan elektron kristal merekonstruksi peta kerapatan elektron 3D melalui Transformasi Fourier terbalik.",
                        narrativeContext = "Kakek menggambarkan pola titik-titik refleksi difraksi kisi resiprokal pada detektor area CCD/CMOS."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk mengidentifikasi keadaan kimiawi serta bilangan oksidasi unsur tepat di beberapa lapisan atom terluar permukaan material, kita menggunakan X-ray Photoelectron Spectroscopy (XPS)!",
                        narrativeContext = "Kirana memperlihatkan spektrum energi ikat elektron (Binding Energy) XPS fotolistrik kuantum."
                    )
                ),
                intuitionBody = """
                    Karakterisasi Kristalografi dan Spektroskopi Lanjut memberikan bukti empiris mutlak mengenai arsitektur geometris 3D atomik senyawa dan profil kimiawi antarmuka permukaan padatan.
                    
                    1. Kristalografi Sinar-X Kristal Tunggal (SCXRD):
                       Sinar-X monokromatik (lambda ~ 0.71 Å radiasi Mo-K_alpha atau 1.54 Å Cu-K_alpha) ditembakkan pada kristal tunggal berkualitas tinggi (ukuran ~0.1 - 0.3 mm):
                       - Hukum Bragg & Faktor Struktur: Difraksi terjadi pada sudut yang memenuhi Hukum Bragg. Intensitas setiap bintik pantulan hkl sebanding dengan kuadrat modulus Faktor Struktur: I(hkl) ~ |F(hkl)|^2.
                       - Masalah Fase (The Phase Problem): Detektor hanya mencatat intensitas |F|^2, kehilangan informasi fase kuantum phi(hkl). Dipecahkan menggunakan:
                         * Metode Patterson: Berguna jika kristal mengandung atom berat (vektor interatomik u,v,w).
                         * Metode Langsung (Direct Methods): Memanfaatkan hubungan probabilitas fase triplet Karle-Hauptman.
                       - Peta Kerapatan Elektron: rho(x, y, z) = (1/V) * sum F(hkl) * exp(-2*pi*i*(hx + ky + lz)).
                       Menentukan posisi spasial setiap atom, sudut ikatan, dan konfigurasi stereokimia kiral absolut (parameter Flack).
                       
                    2. X-ray Photoelectron Spectroscopy (XPS):
                       Berdasarkan Efek Fotolistrik kuantum Einstein di bawah vakum ultra-tinggi (UHV < 10^(-9) mbar):
                       Foton sinar-X monokromatik Al-K_alpha (h*nu = 1486.6 eV) mengeksitasi elektron kulit dalam atom permukaan:
                       Energi Kinetik terukur E_kin = h*nu - E_bind - Phi_spektrometer.
                       - Kedalaman Informasi Sangat Dangkal: Hanya elektron dari kedalaman 2 hingga 10 nm yang dapat keluar tanpa kehilangan energi (inelastic mean free path / IMFP).
                       - Pergeseran Kimiawi (Chemical Shift): Energi ikat elektron kulit dalam E_bind bergeser naik jika atom terikat pada unsur yang lebih elektronegatif (bilangan oksidasi lebih tinggi mengurangi kerapatan muatan valensi perisai, memperkuat tarikan inti). Membedakan secara tegas spesi seperti C-C, C-O, C=O, dan O-C=O pada permukaan katalis.
                       
                    3. Resonansi Paramagnetik Elektron (Electron Paramagnetic Resonance / EPR):
                       Mendeteksi spesi yang memiliki elektron tak berpasangan (radikal bebas, ion logam transisi d^n paramagnetik) melalui pemisahan tingkat energi spin Zeeman di dalam medan magnet luar B0: Delta_E = g * mu_B * B0. Resonansi gelombang mikro mendeteksi struktur hiperhalus kopling spin elektron dengan spin inti atom.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "SCXRD adalah satu-satunya teknik analitik yang dapat membuktikan stereokimia kiral absolut molekul tanpa ambigu.",
                    "Masalah fase dalam kristalografi membuktikan keterbatasan mendasar bahwa mata detektor hanya mampu melihat amplitudo kuadrat, bukan fase gelombang.",
                    "XPS adalah teknik analisis permukaan paling terpercaya untuk memantau bilangan oksidasi dan degradasi baterai serta katalis padat.",
                    "Pergeseran kimiawi XPS mencerminkan lingkungan kimiawi ikatan atom secara langsung melalui perubahan energi tarik elektrostatis inti."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Faktor Struktur Kristalografi & Kerapatan Elektron",
                        latex = "F(hkl) = \\sum_{j=1}^N f_j \\exp\\left[ 2\\pi i (h x_j + k y_j + l z_j) \\right], \\quad \\rho(\\mathbf{r}) = \\frac{1}{V} \\sum_{\\mathbf{h}} F(\\mathbf{h}) e^{-2\\pi i \\mathbf{h}\\cdot\\mathbf{r}}",
                        explanation = "Faktor struktur F(hkl) adalah transformasi Fourier diskrit dari susunan atom-atom kisi kristal."
                    ),
                    FormulaCard(
                        title = "Persamaan Energi Ikat Spektroskopi XPS",
                        latex = "E_{\\mathrm{bind}} = h\\nu - E_{\\mathrm{kin}} - \\Phi_{\\mathrm{spek}}",
                        explanation = "Energi ikat elektron kulit dalam dihitung dari energi foton eksitasi dikurangi energi kinetik elektron yang lepas dan fungsi kerja spektrometer."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Elusidasi Struktur Kristal Tunggal Senyawa Bahan Alam Hutan Tropis Kalimantan di Laboratorium Terpadu BRIN",
                    scenario = "Peneliti kimia bahan alam mengisolasi kristal bening metabolit sekunder baru dari kulit batang pohon endemik Kalimantan yang berpotensi sebagai antibiotik super.",
                    application = "Satu butir kristal berukuran 0.15 mm dipasang pada goniometer difraktometer SCXRD bersumber mikro-fokus Mo-K_alpha dengan pendingin nitrogen cair 100 Kelvin. Kumpulan data 25.000 refleksi difraksi diselesaikan menggunakan Direct Methods SHELXT, mengungkap struktur 3D absolut cincin tetrasiklik terpenoid baru dengan parameter Flack x = -0.01(2) yang mengonfirmasi konfigurasi absolut tanpa keraguan.",
                    impact = "Menghasilkan publikasi paten penemuan molekul farmasi baru Indonesia berstandar IUPAC internasional."
                ),
                homeLab = HomeLabData(
                    title = "Penumbuhan Kristal Tunggal Gula / Tawas Dapur dan Pengamatan Faset Kristal Geometris",
                    objective = "Mengamati pertumbuhan kisi kristal beraturan makroskopis dari larutan lewat jenuh.",
                    materials = listOf("Tawas dapur (Alum) atau gula pasir (200 gram)", "Air panas mendidih (100 mL)", "Gelas kaca bening dan benang jahit", "Sendok pengaduk"),
                    steps = listOf(
                        "Larutkan tawas ke dalam air panas hingga mencapai kondisi lewat jenuh (tidak ada tawas yang bisa larut lagi).",
                        "Saring cairan bening ke dalam gelas bersih, biarkan mendingin perlahan semalaman hingga terbentuk butiran kristal benih kecil di dasar.",
                        "Pilih satu butir kristal benih tawas yang paling simetris dan transparan.",
                        "Ikat kristal benih tersebut dengan seutas benang, gantungkan melayang di tengah larutan lewat jenuh yang baru.",
                        "Tutup gelas dengan tisu; biarkan selama 5-7 hari pada suhu ruang.",
                        "Amati pertumbuhan kristal tunggal tawas oktahedral yang tumbuh besar dengan faset-faset bidang datar geometris sempurna yang memantulkan cahaya laksana intan permata!"
                    ),
                    safetyNote = "Gunakan air panas dengan hati-hati saat melarutkan bahan."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Dalam spektroskopi fotoelektron sinar-X (XPS), apakah penyebab utama terjadinya pergeseran kimiawi (chemical shift) energi ikat elektron inti atom menuju nilai yang lebih tinggi?",
                        options = listOf(
                            "Atom tersebut terikat pada atom-atom yang lebih elektronegatif (keadaan oksidasi lebih tinggi), sehingga kerapatan awan elektron valensinya ditarik menjauh, mengurangi efek perisai dan meningkatkan gaya tarik inti atom terhadap elektron kulit dalam",
                            "Atom tersebut terpapar oleh magnet kulkas",
                            "Atom tersebut meleleh menjadi cairan",
                            "Suhu ruangan turun drastis"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Ketika atom kehilangan elektron valensi (teroksidasi) atau terikat pada atom yang sangat elektronegatif (seperti oksigen atau fluorin), kerapatan elektron di sekitarnya berkurang. Akibatnya, efek perisai (screening effect) berkurang dan muatan inti efektif yang dirasakan elektron kulit dalam meningkat, membutuhkan energi foton yang lebih besar untuk melepaskannya (energi ikat E_bind bergeser naik).",
                        misconceptionAlert = "Energi kinetik elektron yang lepas justru menurun saat energi ikatnya meningkat, karena E_kin = h*nu - E_bind."
                    )
                )
            )

            "kim-teknik-reaksi-cstr-pfr" -> LessonData(
                conceptId = "kim-teknik-reaksi-cstr-pfr",
                simId = "sim-chemical-reactors-cstr-pfr",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, di laboratorium kita mereaksikan bahan kimia di dalam gelas piala (beaker glass) kecil satu per satu (batch). Bagaimana pabrik petrokimia raksasa memproduksi jutaan ton pupuk urea secara terus-menerus tanpa pernah mematikan mesinnya?",
                        narrativeContext = "Dimas memandangi kawasan menara reaktor dan jaringan pipa pabrik pupuk Pupuk Kujang Cikampek."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka beralih ke Reaktor Alir Kontinu, Dimas! Reaktor Tangki Berpengaduk Kontinu (CSTR) dan Reaktor Alir Pipa (PFR). Fluida reaktan terus mengalir masuk dan produk terus mengalir keluar secara tunak mengikuti hukum neraca mol dan kinetika kimia.",
                        narrativeContext = "Kakek menuliskan persamaan neraca mol reaktor ideal V = F_{A0} * X / (-r_A)."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk menghemat energi pabrik hingga puluhan persen, Analisis Pinch mengintegrasikan jaringan penukar panas (Heat Exchanger Network) sehingga panas dari aliran buangan reaksi eksotermik langsung digunakan untuk memanaskan reaktan dingin!",
                        narrativeContext = "Kirana memperlihatkan kurva komposit panas (Composite Curves) dan titik cubit Pinch Point termal."
                    )
                ),
                intuitionBody = """
                    Teknik Reaksi Kimia (Chemical Reaction Engineering / CRE) merancang reaktor kimia industri skala besar yang aman, optimal secara termodinamika dan kinetika, serta efisien secara termal.
                    
                    1. Reaktor Kimia Ideal Alir Kontinu:
                       - Reaktor Tangki Berpengaduk Kontinu (Continuous Stirred-Tank Reactor / CSTR):
                         Fluida teraduk sempurna secara seragam seketika. Konsentrasi di dalam reaktor sama persis dengan konsentrasi aliran keluar.
                         Persamaan Desain Neraca Mol CSTR: V = F_A0 * X / (-r_A), di mana laju reaksi -r_A dievaluasi tepat pada konsentrasi produk akhir yang paling rendah. Membutuhkan volume reaktor lebih besar untuk reaksi berorde positif.
                       - Reaktor Alir Pipa (Plug Flow Reactor / PFR):
                         Fluida mengalir laksana sumbat silinder tanpa pencampuran aksial di sepanjang sumbu pipa. Konsentrasi reaktan turun secara bertahap dari masukan ke keluaran.
                         Persamaan Desain PFR: V = F_A0 * integral_0^X [ dX / (-r_A) ].
                         Untuk reaksi kinetika orde n > 0, volume PFR selalu lebih kecil daripada volume CSTR untuk mencapai konversi X yang sama.
                       
                    2. Non-Idealitas Aliran & Distribusi Waktu Tinggal (RTD):
                       Reaktor nyata mengalami korsleting aliran (bypassing), zona mati (dead zones), dan dispersi aksial. Diukur melalui injeksi pulsa perunut (tracer) untuk memperoleh fungsi densitas probabilitas waktu tinggal E(t).
                       
                    3. Keterbatasan Perpindahan Massa Heterogen (Modulus Thiele & Faktor Efektivitas):
                       Pada butiran pelet katalis padat, reaktan harus berdifusi melalui pori-pori sebelum bereaksi di sisi aktif dalam:
                       Modulus Thiele Phi = R * sqrt(k * C^(n-1) / D_eff).
                       - Jika Phi << 1: Difusi sangat cepat, reaksi dikendalikan oleh kinetika intrinsik (Faktor Efektivitas eta ~ 1).
                       - Jika Phi >> 1: Difusi sangat lambat, reaktan habis bereaksi di cangkang luar pelet sebelum sempat mencapai inti dalam katalis (reaksi terkendala transfer massa difusif).
                       
                    4. Integrasi Termal Industri: Analisis Pinch (Pinch Analysis):
                       Metodologi rekayasa proses untuk meminimalkan konsumsi energi pabrik kimia dengan memaksimalkan integrasi panas internal:
                       - Memplot Kurva Komposit Panas (aliran fluida panas yang perlu didinginkan) dan Kurva Komposit Dingin (aliran fluida dingin yang perlu dipanaskan).
                       - Titik Cubit (Pinch Point): Titik pendekatan suhu minimum Delta_T_min.
                       Kaidah Emas Pinch: Dilarang mentransfer panas melintasi Pinch Point, dilarang mendinginkan di atas Pinch, dan dilarang memanaskan di bawah Pinch!
                """.trimIndent(),
                intuitionPoints = listOf(
                    "PFR beroperasi pada konsentrasi reaktan rata-rata yang lebih tinggi daripada CSTR, membuatnya jauh lebih efisien dalam hal volume bejana.",
                    "CSTR unggul dalam pengendalian suhu reaksi yang sangat eksotermik karena pengadukan masif mencegah pembentukan titik panas (hotspot).",
                    "Modulus Thiele memberi tahu insinyur apakah membuat ukuran butir katalis lebih kecil akan melipatgandakan laju produksi atau sia-sia.",
                    "Analisis Pinch memangkas kebutuhan bahan bakar pembakar utilitas industri kimia hingga 30 - 50% murni melalui pengurutan jaringan pipa penukar panas yang cerdas."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Desain Reaktor Alir PFR vs CSTR",
                        latex = "V_{\\mathrm{PFR}} = F_{A0} \\int_0^X \\frac{dX}{-r_A}, \\quad V_{\\mathrm{CSTR}} = \\frac{F_{A0} X}{-r_A(X)}",
                        explanation = "Neraca mol keadaan tunak yang menghubungkan volume bejana reaktor V dengan laju umpan molar FA0, konversi fraksional X, dan laju reaksi rA."
                    ),
                    FormulaCard(
                        title = "Modulus Thiele dan Faktor Efektivitas Pelet Katalis",
                        latex = "\\Phi = R \\sqrt{\\frac{k}{D_e}}, \\quad \\eta = \\frac{-r_{A,\\mathrm{nyata}}}{-r_{A,\\mathrm{intrinsik}}} = \\frac{3}{\\Phi}\\left(\\frac{1}{\\tanh\\Phi} - \\frac{1}{\\Phi}\\right)",
                        explanation = "Rasio laju reaksi kimia intrinsik terhadap laju difusi fluida di dalam pori-pori pelet katalis padatan beradius R."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Optimasi Reaktor Sintesis Amonia Pabrik Pupuk Kujang Cikampek & Petrokimia Gresik",
                    scenario = "Pabrik amonia memproses gas alam menjadi amonia NH3 melalui reaksi kesetimbangan eksotermik Haber-Bosch bertekanan tinggi 150 bar.",
                    application = "Insinyur teknik kimia memodelkan konverter amonia multi-bed bertingkat dengan pendingin antar-bed (interstage cooling). Analisis kinetika heterogen Modulus Thiele pada katalis besi terpromosi digunakan untuk memilih ukuran pelet katalis 1.5 - 3 mm agar faktor efektivitas eta > 0.85. Menggunakan integrasi termal Pinch, panas reaksi eksotermik amonia dibangkitkan menjadi uap bertekanan tinggi (HP steam) yang menggerakkan turbin kompresor pabrik secara mandiri.",
                    impact = "Menghemat miliaran kaki kubik gas alam per tahun dan menjamin stabilitas pasokan pupuk bersubsidi bagi ketahanan pangan jutaan petani Indonesia."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Pemodelan Reaktor Tangki Berpengaduk Kontinu (CSTR) Menggunakan Corong dan Air Pewarna",
                    objective = "Mengamati pencampuran aliran kontinu keadaan tunak dan bagaimana laju alir menentukan konsentrasi keluaran.",
                    materials = listOf("Dua buah botol plastik bekas 1.5 liter", "Sedotan plastik / selang akuarium kecil", "Air bersih dan pewarna makanan merah pekat", "Gelas ukur dan sendok"),
                    steps = listOf(
                        "Lubangi bagian samping bawah botol plastik pertama berjarak 3 cm dari dasar, pasang sedotan sebagai saluran keluar (overflow CSTR tangki bervolume tetap V).",
                        "Isi tangki botol dengan air jernih hingga batas sedotan.",
                        "Alirkan air jernih secara kontinu dari kran air dengan debit konstan Qin.",
                        "Teteskan cairan pewarna merah dengan laju konstan ke dalam botol sambil diaduk kencang dengan sendok.",
                        "Amati warna air yang keluar dari sedotan: warna air keluar identik dengan warna air di dalam botol (karakteristik CSTR ideal pencampuran sempurna).",
                        "Ubah laju alir air kran Qin menjadi dua kali lebih deras; amati bagaimana waktu tinggal tau = V / Q memendek dan warna kesetimbangan menjadi lebih pucat."
                    ),
                    safetyNote = "Lakukan praktikum di dekat wastafel agar air luapan tidak membasahi lantai."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Untuk reaksi kimia fase cair tak reversibel berorde satu (A -> Produk, -rA = k*CA), manakah pernyataan yang benar mengenai perbandingan volume reaktor CSTR dan PFR untuk mencapai konversi reaktan yang sama persis (misalnya X = 90%)?",
                        options = listOf(
                            "Volume reaktor CSTR selalu lebih besar daripada volume PFR (V_CSTR > V_PFR), karena laju reaksi di CSTR beroperasi pada konsentrasi terendah di keluaran",
                            "Volume CSTR selalu lebih kecil daripada PFR",
                            "Volume CSTR dan PFR selalu sama persis untuk semua jenis reaksi",
                            "Reaktor CSTR tidak memerlukan volume sama sekali"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Pada reaktor PFR, konsentrasi reaktan CA tinggi di bagian awal saluran masuk sehingga laju reaksi awal sangat cepat, menghasilkan integral area Levenspiel yang lebih kecil. Sebaliknya, pada CSTR pengadukan sempurna seketika mengencerkan seluruh isi bejana ke konsentrasi keluaran yang paling rendah (CA_keluar), sehingga seluruh volume bejana beroperasi pada laju reaksi yang paling lambat, menuntut volume bejana yang jauh lebih besar.",
                        misconceptionAlert = "Untuk reaksi berorde nol (-rA = k konstan) atau reaksi autokatalitik tertentu, hubungan volume CSTR dan PFR dapat berbeda, namun untuk semua reaksi berorde positif (n > 0) volume CSTR selalu lebih besar dari PFR."
                    )
                )
            )

            else -> null
        }
    }
}

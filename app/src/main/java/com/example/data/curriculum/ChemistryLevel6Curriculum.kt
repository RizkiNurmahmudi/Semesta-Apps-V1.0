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

object ChemistryLevel6Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "kim-kuantum-komputasi-dft",
            domain = Domain.KIMIA,
            topic = "Kimia Komputasi & Kuantum",
            title = "Kimia Komputasi: Teori Fungsional Kerapatan (DFT) & Dinamika Molekuler",
            description = "Teorema Hohenberg-Kohn, persamaan Kohn-Sham DFT, aproksimasi LDA/GGA, himpunan basis orbital terpolarisasi, dan simulasi Dinamika Molekul (MD).",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("kim-fisika-kuantum-molekul-huckel", "mat-pde-persamaan-diferensial-parsial")
        ),
        ConceptItem(
            id = "kim-organik-lanjut-kopling-silang",
            domain = Domain.KIMIA,
            topic = "Sintesis Organik Lanjut",
            title = "Kopling Silang Organologam, Reaksi Perisiklik & Retrosintesis",
            description = "Kopling Suzuki-Miyaura, Heck, Sonogashira berbantuan katalis paladium, sikloadisi Diels-Alder aturan Woodward-Hoffmann, dan strategi retrosintesis bahan alam.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("kim-organik-sintesis-retrosintesis", "kim-anorganik-organologam-18-elektron")
        ),
        ConceptItem(
            id = "kim-polimer-material-lanjut",
            domain = Domain.KIMIA,
            topic = "Kimia Polimer & Material Fungsional",
            title = "Kimia Polimer: ATRP, RAFT, Katalisis Ziegler-Natta & Polimer Konduktif",
            description = "Polimerisasi radikal bebas terkontrol hidup (ATRP dan RAFT), polimerisasi koordinasi stereospesifik poliolefin, poliasetilena terkonjugasi konduktif listrik, dan biopolimer.",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("kim-organik-mekanisme-sn-e", "kim-anorganik-organologam-18-elektron")
        ),
        ConceptItem(
            id = "kim-katalisis-heterogen-langmuir",
            domain = Domain.KIMIA,
            topic = "Katalisis & Kimia Permukaan",
            title = "Katalisis Heterogen: Mekanisme Langmuir-Hinshelwood & Karakterisasi BET",
            description = "Adsorpsi fisik vs kimia, isoterm adsorpsi Brunauer-Emmett-Teller (BET), mekanisme permukaan Langmuir-Hinshelwood dan Eley-Rideal, serta analisis TEM.",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("kim-fisika-kinetika-permukaan-marcus", "kim-anorganik-zat-padat-kisi")
        ),
        ConceptItem(
            id = "kim-supramolekul-rotaksana",
            domain = Domain.KIMIA,
            topic = "Kimia Supramolekuler & Nanomesin",
            title = "Kimia Supramolekul: Interaksi Inang-Tamu, Swarakit & Mesin Molekuler",
            description = "Sintesis eter mahkota, siklodekstrin, ikatan non-kovalen terarah (ikatan hidrogen terkoordinasi, pi-stacking), arsitektur topologi katenana, dan saklar molekuler rotaksana.",
            level = DepthLevel.L6,
            estMinutes = 24,
            prerequisites = listOf("kim-organik-stereokimia-cip", "kim-koordinasi-medan-kristal")
        ),
        ConceptItem(
            id = "kim-lingkungan-kimia-hijau",
            domain = Domain.KIMIA,
            topic = "Kimia Lingkungan & Kimia Hijau",
            title = "Kimia Hijau: 12 Prinsip Green Chemistry & Advanced Oxidation Processes",
            description = "Ekonomi atom industri, fotokimia atmosfer siklus Chapman ozon dan radikal CFC, proses oksidasi lanjut AOP reagen Fenton fotokatalisis TiO2 pengolah limbah.",
            level = DepthLevel.L6,
            estMinutes = 24,
            prerequisites = listOf("kim-kinetika-kimia-arrhenius", "kim-organik-mekanisme-sn-e")
        ),
        ConceptItem(
            id = "kim-medisinal-desain-obat-docking",
            domain = Domain.KIMIA,
            topic = "Kimia Medisinal & Farmakologi Molekuler",
            title = "Kimia Medisinal: Hubungan Kuantitatif QSAR, ADMET & Penambatan Molekuler",
            description = "Analisis Hansch QSAR, parameter Lipinski Rule of 5, metabolisme sitokrom P450 profil farmakokinetik ADMET, dan simulasi penambatan molekuler (molecular docking) ligan-protein.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("kim-biokimia-kinetika-enzim", "kim-kuantum-komputasi-dft")
        ),
        ConceptItem(
            id = "kim-elektrokimia-terapan-baterai-li",
            domain = Domain.KIMIA,
            topic = "Elektrokimia Terapan & Penyimpanan Energi",
            title = "Elektrokimia Baterai Litium-Ion, Solid-State & Sel Bahan Bakar PEMFC",
            description = "Mekanisme interkalasi/deinterkalasi kation Li+, pembentukan lapisan SEI grafit, stabilitas anoda-katoda NMC/LFP, konduktor ionik padat keramik, dan elektrokatalisis reduksi oksigen.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("kim-elektrokimia-nernst", "kim-anorganik-zat-padat-kisi")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "kim-kuantum-komputasi-dft" -> LessonData(
                conceptId = "kim-kuantum-komputasi-dft",
                simId = "sim-computational-dft",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana para peneliti obat bisa mengetahui kestabilan dan panjang ikatan molekul kompleks yang terdiri dari ratusan atom sebelum disintesis di laboratorium?",
                        narrativeContext = "Dimas melihat visualisasi struktur 3D molekul dan kerapatan orbital di layar komputer kimia komputasi."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menggunakan Density Functional Theory (DFT), Dimas! Teorema Walter Kohn membuktikan bahwa energi total keadaan dasar sistem kuantum ditentukan sepenuhnya oleh fungsi kerapatan elektron 3D rho(r), bukan fungsi gelombang 3N dimensi yang terlampau rumit.",
                        narrativeContext = "Kakek menuliskan persamaan Hohenberg-Kohn dan persamaan satu elektron Kohn-Sham."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan dengan simulasi Dinamika Molekul (MD), kita dapat melacak lintasan gerak atom-atom tersebut secara dinamis terhadap waktu menggunakan integrasi hukum gerak Newton!",
                        narrativeContext = "Kirana memperlihatkan simulasi pelipatan protein yang bergetar dalam pelarut air."
                    )
                ),
                intuitionBody = """
                    Kimia Komputasi memecahkan persamaan mekanika kuantum molekuler untuk memprediksi struktur geometri stabil, energi transisi, spektrum vibrasi, dan reaktivitas kimia secara *in silico*.
                    
                    1. Teorema Hohenberg-Kohn:
                       - Teorema 1: Kerapatan elektron keadaan dasar rho(r) secara unik menentukan potensial luar v(r), dan dengan demikian menentukan secara pasti seluruh sifat sistem (termasuk Hamiltonan dan energi total E).
                       - Teorema 2: Fungsional energi E[rho] mencapai nilai minimum absolut tepat pada kerapatan elektron keadaan dasar sejati rho_0(r) (Prinsip Variasional Kerapatan).
                       
                    2. Pendekatan Kohn-Sham:
                       Memetakan sistem nyata elektron yang saling berinteraksi ke dalam sistem fiktif elektron tak-berinteraksi yang memiliki kerapatan elektron rho(r) yang sama persis:
                       [-1/2 nabla^2 + v_eff(r)] psi_i(r) = epsilon_i psi_i(r).
                       Potensial efektif: v_eff(r) = v_ext(r) + v_Hartree(r) + v_xc(r).
                       Fungsional pertukaran-korelasi (Exchange-Correlation Functional E_xc[rho]) didekati menggunakan:
                       - Local Density Approximation (LDA).
                       - Generalized Gradient Approximation (GGA, misal PBE, BLYP).
                       - Fungsional Hibrida (misal B3LYP) yang memadukan pertukaran eksak Hartree-Fock dengan fungsional DFT.
                       
                    3. Himpunan Basis Orbital (Basis Sets):
                       Orbital molekul diekspansi sebagai kombinasi linear fungsi Gaussian (GTO): STO-3G (basis minimal), Pople 6-31G(d,p) (split-valence dengan fungsi polarisasi), atau cc-pVTZ (Dunning correlation-consistent).
                       
                    4. Dinamika Molekuler (Molecular Dynamics / MD):
                       Mengintegrasikan persamaan gerak Newton F_i = m_i * a_i untuk ribuan atom menggunakan medan gaya mekanika molekuler (AMBER, CHARMM, GROMOS) atau ab initio DFT-MD (Car-Parrinello) untuk mempelajari termodinamika dan pelipatan protein.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "DFT mereduksi kompleksitas fungsi gelombang dari 3N koordinat spasial menjadi hanya 3 koordinat spasial kerapatan elektron rho(x,y,z).",
                    "Seluruh misteri fisika kuantum interaksi elektron bersembunyi di dalam fungsional pertukaran-korelasi E_xc yang terus disempurnakan.",
                    "Fungsional hibrida B3LYP menjadi standar emas kimia organik komputasi untuk menghitung energi penghalang reaksi aktivasi.",
                    "Simulasi Dinamika Molekul memungkinkan pengamatan dinamis pergerakan sisi aktif enzim dalam skala waktu femtodetik hingga mikrodetik."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Satu Elektron Kohn-Sham DFT",
                        latex = "\\left( -\\frac{1}{2}\\nabla^2 + v_{\\mathrm{ext}}(\\mathbf{r}) + \\int \\frac{\\rho(\\mathbf{r}')}{|\\mathbf{r}-\\mathbf{r}'|}\\,d\\mathbf{r}' + v_{xc}[\\rho](\\mathbf{r}) \\right) \\psi_i(\\mathbf{r}) = \\varepsilon_i \\psi_i(\\mathbf{r})",
                        explanation = "Persamaan swakonsisten satu elektron yang menentukan orbital spasial fiktif penyusun kerapatan elektron sejati rho(r)."
                    ),
                    FormulaCard(
                        title = "Kerapatan Elektron dari Orbital Kohn-Sham",
                        latex = "\\rho(\\mathbf{r}) = \\sum_{i=1}^{N_{\\mathrm{elektron}}} |\\psi_i(\\mathbf{r})|^2",
                        explanation = "Jumlah kuadrat modulus seluruh orbital occupied menghasilkan kerapatan elektron 3D molekul."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Skrining Senyawa Bioaktif Jamu Tradisional Menggunakan Kimia Komputasi DFT ITB",
                    scenario = "Pusat Riset Bioteknologi ITB meneliti potensi senyawa kurkuminoid dari temulawak dan kunyit lokal sebagai inhibitor enzim protease virus.",
                    application = "Tim kimia komputasi melakukan optimasi geometri keadaan dasar ligan kurkumin dan turunannya menggunakan perhitungan kuantum DFT (B3LYP/6-31G(d)). Dari pemetaan potensial elektrostatik molekuler (MEP) dan selisih energi celah HOMO-LUMO, diprediksi gugus fenolik mana yang paling reaktif membentuk ikatan hidrogen dengan residu protease.",
                    impact = "Mempercepat penemuan kandidat obat fitofarmaka unggulan Indonesia tanpa harus mensintesis ratusan turunan senyawa kimia mahal di laboratorium."
                ),
                homeLab = HomeLabData(
                    title = "Visualisasi Struktur 3D Molekul dan Celah Energi HOMO-LUMO Menggunakan Software Open-Source Avogadro",
                    objective = "Membangun model molekuler digital dan mengamati orbital molekul pada komputer rumah.",
                    materials = listOf("Laptop/Komputer pribadi", "Software gratis Avogadro / MolView (berbasis browser di molview.org)"),
                    steps = listOf(
                        "Buka situs web MolView atau aplikasi Avogadro.",
                        "Gambarkan struktur molekul kafein atau kurkumin pada kanvas 2D.",
                        "Klik tombol 'Clean up 3D' untuk menjalankan optimasi mekanika molekuler medan gaya MMFF94/UFF.",
                        "Putar dan ukur panjang ikatan C-C, C=O, dan sudut ikatan secara digital.",
                        "Tampilkan peta muatan parsial elektrostatik untuk melihat atom bermuatan negatif (oksigen/nitrogen) dan positif (hidrogen polar)."
                    ),
                    safetyNote = "Praktikum komputasi mandiri, aman dan tidak melibatkan reagen kimia fisik."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah perbedaan paling mendasar antara metode ab initio Hartree-Fock tradisional dengan Density Functional Theory (DFT)?",
                        options = listOf(
                            "Hartree-Fock bekerja langsung dengan fungsi gelombang banyak-elektron antisimetris, sedangkan DFT bekerja dengan kerapatan elektron spasial rho(r) sebagai variabel utama",
                            "DFT hanya berlaku untuk atom gas mulia",
                            "Hartree-Fock tidak menggunakan mekanika kuantum",
                            "DFT selalu membutuhkan eksperimen laboratorium riil setiap kali dijalankan"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Teorema Hohenberg-Kohn membuktikan bahwa seluruh energi dan sifat keadaan dasar dapat ditentukan dari kerapatan elektron 3D rho(r), membuat DFT jauh lebih efisien dalam menyertakan korelasi elektron dibandingkan metode fungsi gelombang HF murni.",
                        misconceptionAlert = "Sering dikira DFT hanyalah metode semi-empiris, padahal DFT adalah teori kuantum eksak yang satu-satunya aproksimasinya terletak pada bentuk fungsional E_xc."
                    )
                )
            )

            "kim-organik-lanjut-kopling-silang" -> LessonData(
                conceptId = "kim-organik-lanjut-kopling-silang",
                simId = "sim-cross-coupling-reactions",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, menyambungkan dua cincin benzena (ikatan C-C aril) sangat sulit karena karbon aromatik tidak mudah mengalami substitusi nukleofilik biasa. Bagaimana kimiawan modern melakukannya?",
                        narrativeContext = "Dimas memandangi struktur molekul kompleks obat antihipertensi Losartan yang memiliki cincin biaril."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menggunakan Reaksi Kopling Silang Terkatalisis Logam Transisi! Katalis Paladium (Pd) mengarahkan adisi oksidatif, transmetalasi, dan eliminasi reduktif untuk membentuk ikatan C-C secara selektif.",
                        narrativeContext = "Kakek menggambarkan siklus katalitik Suzuki-Miyaura yang menggunakan asam boronat dan basa."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk membangun cincin siklik secara serentak dalam satu langkah stereospesifik, Reaksi Sikloadisi Diels-Alder bekerja melalui interaksi orbital molekul terdepan (FMO) yang tunduk pada Aturan Woodward-Hoffmann!",
                        narrativeContext = "Kirana memperlihatkan perlapisan orbital HOMO diena dan LUMO dienofil dalam reaksi perisiklik."
                    )
                ),
                intuitionBody = """
                    Sintesis Organik Tingkat Lanjut memanfaatkan katalisis organologam dan reaksi perisiklik terkontrol simetri orbital untuk merakit kerangka karbon molekul berstruktur rumit.
                    
                    1. Reaksi Kopling Silang Paladium (Cross-Coupling):
                       Siklus katalitik umum melibatkan tiga tahapan fundamental kompleks Pd(0)/Pd(II):
                       - Adisi Oksidatif: Ar-X mengadisi Pd(0) membentuk kompleks Ar-Pd(II)-X.
                       - Transmetalasi: Nukleofil organologam mentransfer gugus R' ke paladium:
                         * Kopling Suzuki-Miyaura: menggunakan organoboron R'-B(OH)2 dengan aktivasi basa.
                         * Kopling Stille: menggunakan organotin R'-SnR3.
                         * Kopling Negishi: menggunakan organoseng R'-ZnX.
                         * Kopling Sonogashira: kopling alkunil terminal dengan aril halida dibantu kokatalis Cu(I).
                         * Reaksi Heck: kopling aril halida dengan alkena melalui adisi sin-migrasi dan eliminasi beta-hidrida.
                       - Eliminasi Reduktif: Membentuk ikatan C-C baru (Ar-R') dan meregenerasi katalis aktif Pd(0).
                       
                    2. Reaksi Perisiklik & Teori Aturan Woodward-Hoffmann:
                       Reaksi serentak (concerted) melalui keadaan transisi siklik tanpa zat antara:
                       - Sikloadisi Diels-Alder: [4pi + 2pi] antara 1,3-diena terkonjugasi (dalam konformasi s-cis) dan dienofil alkena, berlangsung secara suprafasial di bawah kendali termal membentuk cincin sikloheksena.
                       - Pergeseran Sigmatropik: [3,3]-Cope dan Claisen rearrangement.
                       - Reaksi Elektroksiklik: Pembukaan/penutupan cincin dengan rotasi konrotatori atau disrotatori bergantung pada jumlah elektron pi (4n vs 4n+2) dan mode aktivasi (termal vs fotokimia).
                       
                    3. Desain Retrosintesis Kompleks:
                       Menganalisis molekul target (TM) secara terbalik dengan diskoneksi ikatan logis menuju molekul awal komersial (sinton kationik/anionik, gugus pelindung ortogonal, dan inversion of polarity / Umpolung).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Kopling Suzuki sangat disukai industri farmasi global karena reagen asam boronat bersifat stabil di udara dan ramah lingkungan.",
                    "Siklus katalitik Pd mempertahankan keadaan stereokimia dan toleran terhadap berbagai macam gugus fungsi polar.",
                    "Aturan Woodward-Hoffmann membuktikan bahwa konservasi simetri orbital molekul mengatur apakah reaksi perisiklik diperbolehkan secara termal atau fotokimia.",
                    "Reaksi Diels-Alder selalu menghasilkan produk endo sebagai produk kendali kinetik utama akibat stabilisasi interaksi orbital sekunder."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Siklus Katalitik Kopling Silang Suzuki-Miyaura",
                        latex = "\\mathrm{Ar-X} + \\mathrm{R-B(OH)_2} \\xrightarrow{\\mathrm{Pd(0),\\,Basa}} \\mathrm{Ar-R} + \\mathrm{XB(OH)_3^-}",
                        explanation = "Tahapan adisi oksidatif Ar-X ke Pd(0), transmetalasi dengan ester boronat aktif, dan eliminasi reduktif membentuk ikatan C-C."
                    ),
                    FormulaCard(
                        title = "Sikloadisi Diels-Alder [4+2]",
                        latex = "\\text{Diena (4}\\pi\\text{)} + \\text{Dienofil (2}\\pi\\text{)} \\xrightarrow{\\Delta} \\text{Sikloheksena (}\\sigma + 2\\pi\\text{)}",
                        explanation = "Interaksi orbital HOMO diena dan LUMO dienofil suprafasial serentak membentuk dua ikatan sigma C-C baru."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Kemandirian Bahan Baku Obat Nasional: Sintesis Parasetamol & Antibiotik Kimia Farma",
                    scenario = "PT Kimia Farma Sungwun Pharmacopia di Cikarang membangun fasilitas sintesis bahan baku obat aktif (API) untuk mengurangi impor 90% bahan farmasi Indonesia.",
                    application = "Tim kimia sintetis mengoptimasi rute reaksi asilasi dan penataan ulang tanpa pelarut toksik, serta menerapkan metodologi kopling selektif untuk sintesis intermediat antibiotik fluorokuinolon. Dengan katalisis heterogen logam ramah lingkungan, rendemen sintesis ditingkatkan menjadi 94% dengan kemurnian farmasi standar BPOM.",
                    impact = "Menjamin ketersediaan obat esensial dengan harga terjangkau bagi program Jaminan Kesehatan Nasional (BPJS Kesehatan)."
                ),
                homeLab = HomeLabData(
                    title = "Pemodelan Interaksi Orbital HOMO-LUMO Reaksi Diels-Alder dengan Kertas Warna",
                    objective = "Memahami konsep kesesuaian fase orbital perisiklik dan perbedaan pendekatan endo vs ekso.",
                    materials = listOf("Kertas lipat origami dua warna (misal merah = fase positif +, biru = fase negatif -)", "Gunting dan perekat"),
                    steps = listOf(
                        "Gunting 4 lobus untuk orbital HOMO diena 1,3-butadiena dengan pola fase: Merah-Biru, Biru-Merah, Biru-Merah, Merah-Biru.",
                        "Gunting 2 lobus untuk orbital LUMO etena (dienofil) dengan pola fase berlawanan: Merah-Biru, Biru-Merah.",
                        "Sejajarkan kedua molekul secara suprafasial; amati bahwa lobus di ujung terluar (C1-C4 diena dengan C1-C2 dienofil) memiliki warna fase yang sama (terjadi tumpang tindih konstruktif yang diizinkan secara termal).",
                        "Balik salah satu molekul untuk mengamati mengapa fotokimia merubah simetri orbital transisi."
                    ),
                    safetyNote = "Praktikum analisis pemodelan konsep kertas, aman tanpa bahaya kimiawi."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Manakah dari tiga tahapan utama siklus katalitik kopling silang paladium yang secara langsung menghasilkan produk ikatan C-C target dan memulihkan kembali katalis Pd(0)?",
                        options = listOf(
                            "Eliminasi Reduktif (Reductive Elimination)",
                            "Adisi Oksidatif (Oxidative Addition)",
                            "Transmetalasi (Transmetalation)",
                            "Beta-Hidrida Eliminasi (Beta-Hydride Elimination)"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Pada tahap eliminasi reduktif, dua ligan karbon (Ar dan R) yang terikat pada pusat logam Pd(II) membentuk ikatan sigma C-C kovalen baru dan terlepas sebagai produk Ar-R, sementara bilangan oksidasi paladium tereduksi kembali dari Pd(II) menjadi Pd(0) aktif.",
                        misconceptionAlert = "Adisi oksidatif justru mengikat substrat pertama dan menaikkan bilangan oksidasi Pd(0) menjadi Pd(II)."
                    )
                )
            )

            "kim-polimer-material-lanjut" -> LessonData(
                conceptId = "kim-polimer-material-lanjut",
                simId = "sim-polymer-atrp-raft",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, mengapa plastik polietilena kantong kresek tipis sangat lentur dan mudah robek, sedangkan pipa paralon PVC atau bumper mobil sangat keras dan tahan benturan?",
                        narrativeContext = "Dimas memegang kantong kresek LDPE dan pipa air HDPE keras."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Kuncinya terletak pada arsitektur rantai molekul dan berat molekul! Polimerisasi radikal bebas biasa menghasilkan rantai bercabang liar dengan dispersitas lebar, sedangkan polimerisasi terkontrol hidup menghasilkan rantai seragam berkinerja tinggi.",
                        narrativeContext = "Kakek menjelaskan mekanisme Atom Transfer Radical Polymerization (ATRP) dan katalis Ziegler-Natta."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan bahkan ada polimer plastik yang bisa menghantarkan listrik seperti kawat logam, yaitu polimer konduktif berikatan rangkap terkonjugasi selang-seling seperti polianilin yang didoping!",
                        narrativeContext = "Kirana menyalakan lampu LED menggunakan elektroda lembaran plastik film hitam terkonduksi."
                    )
                ),
                intuitionBody = """
                    Kimia Polimer Lanjut berfokus pada pengendalian presisi massa molar (dispersitas dispersitas dispersity index D ~ 1.0), taktistas stereokimia (isotaktik, sindiotaktik, ataktik), dan arsitektur kopolimer blok fungsional.
                    
                    1. Polimerisasi Radikal Bebas Terkontrol Hidup (RDRP):
                       Pada polimerisasi radikal konvensional, terminasi bimolekuler cepat membatasi kendali panjang rantai. RDRP mempertahankan konsentrasi radikal bebas aktif sangat rendah melalui kesetimbangan dinamis dengan spesies dorman:
                       - ATRP (Atom Transfer Radical Polymerization): Menggunakan katalis kompleks logam transisi Cu(I)/L dan inisiator alkil halida (R-X). Cu(I) mengabstraksi halogen membentuk radikal bertumbuh dan Cu(II)-X (deaktivator).
                       - RAFT (Reversible Addition-Fragmentation Chain Transfer): Menggunakan agen transfer rantai tiokarboniltio (dithioester) untuk menjamin pertukaran radikal yang seragam antar seluruh rantai polimer.
                       
                    2. Polimerisasi Koordinasi Katalis Ziegler-Natta:
                       Kompleks TiCl4 dan Al(C2H5)3 mengoordinasikan monomer alfa-olefin (misal propena) pada sisi aktif logam titanium. Mekanisme Cossee-Arlman menyisipkan monomer secara stereospesifik, menghasilkan polipropilena isotaktik berkristalinitas tinggi dan titik leleh di atas 160 C.
                       
                    3. Polimer Terkonjugasi & Plastik Konduktif Listrik:
                       Poliasetilena, polianilin (PANI), dan PEDOT:PSS memiliki ikatan tunggal dan rangkap selang-seling di sepanjang tulang punggung rantai karbon. Delokalisasi elektron pi membentuk pita valensi dan konduksi.
                       Proses doping (oksidasi parsial p-doping atau reduksi n-doping) menciptakan pembawa muatan kuasi-partikel (soliton, polaron, dan bipolaron) yang memberikan konduktivitas listrik setara semikonduktor atau logam.
                       
                    4. Biopolimer Biodegradabel:
                       Poli(asam laktat) (PLA) dan polihidroksialkanoat (PHA) yang disintesis dari fermentasi biomassa pati nabati dapat terurai hayati kembali menjadi H2O dan CO2 oleh mikroorganisme pengurai tanah.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "ATRP dan RAFT memungkinkan perancangan kopolimer blok teratur A-B-A dengan sifat elastisitas dan ketangguhan mekanis terukur.",
                    "Katalisis Ziegler-Natta membuka era industri polimer modern dengan menciptakan plastik kuat yang tidak kusut bercabang.",
                    "Penemuan polimer konduktif listrik mematahkan dogma klasik bahwa plastik selalu merupakan isolator listrik sempurna.",
                    "Biopolimer PLA berbasis biomassa menawarkan solusi masa depan untuk mengatasi polusi sampah mikroplastik di lautan."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Kesetimbangan Dinamis ATRP",
                        latex = "\\mathrm{P_n-X} + \\mathrm{Cu^I(L)_m} \\underset{k_{\\mathrm{deact}}}{\\overset{k_{\\mathrm{act}}}{\\rightleftharpoons}} \\mathrm{P_n^\\bullet} + \\mathrm{X-Cu^{II}(L)_m}, \\quad K_{\\mathrm{ATRP}} = \\frac{k_{\\mathrm{act}}}{k_{\\mathrm{deact}}} \\ll 1",
                        explanation = "Laju deaktivasi yang jauh lebih tinggi daripada aktivasi menekan terminasi bimolekuler sehingga rantai tumbuh serempak."
                    ),
                    FormulaCard(
                        title = "Indeks Dispersitas Polimer (Đ)",
                        latex = "Đ = \\frac{M_w}{M_n} \\ge 1.0",
                        explanation = "Rasio berat molekul rata-rata bobot Mw terhadap rata-rata jumlah Mn; nilai mendekati 1.0 menandakan rantai berukuran seragam (monodispers)."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Inovasi Bioplastik Ramah Lingkungan Berbasis Pati Singkong & Sawit Indonesia",
                    scenario = "Indonesia menghadapi darurat sampah kantong plastik konvensional non-terurai yang mencemari perairan sungai dan laut.",
                    application = "Perusahaan bioteknologi hijau nasional (seperti Avani Eco) memformulasi resin bioplastik berbahan dasar pati singkong lokal termoplastis (TPS) yang dimodifikasi dengan poliester terurai hayati PBAT. Menggunakan penyesuaian plastisizer gliserol dan kompatibilizer maleat anhidrida, bioplastik yang dihasilkan kuat menahan beban 5 kg dan terurai 100% dalam tanah dan kompos dalam waktu 90 hari.",
                    impact = "Mengurangi timbulan sampah plastik laut dan memberikan nilai tambah tinggi bagi komoditas singkong petani Nusantara."
                ),
                homeLab = HomeLabData(
                    title = "Sintesis Bioplastik Mandiri dari Tepung Maizena / Singkong dan Gliserol Dapur",
                    objective = "Membuat lembaran film biopolimer fleksibel dan mengamati peran senyawa pemlastis (plasticizer).",
                    materials = listOf("Tepung maizena atau tepung tapioka singkong (1 sendok makan)", "Gliserol / gliserin dapur (1 sendok teh)", "Cuka dapur encer (1 sendok teh)", "Air bersih (4 sendok makan)", "Panci kecil dan kompor", "Alas plastik / aluminium foil"),
                    steps = listOf(
                        "Campurkan tepung tapioka, air, cuka (asam untuk menghidrolisis percabangan amilopektin), dan gliserol (pemlastis) ke dalam panci.",
                        "Aduk rata pada api kecil hingga campuran berubah dari keruh menjadi gel kental transparan lengket.",
                        "Tuang dan ratakan gel tipis-tipis di atas lembaran aluminium foil datar.",
                        "Biarkan mengering pada suhu ruang selama 24-48 jam.",
                        "Kupas lapisan bioplastik yang terbentuk; uji kelenturan dan elastisitasnya."
                    ),
                    safetyNote = "Gunakan api kecil dan berhati-hatilah saat mengaduk cairan gel panas."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa polimer terkonjugasi seperti poliasetilena baru dapat menghantarkan arus listrik setelah melalui proses 'doping' kimiawi?",
                        options = listOf(
                            "Karena doping menghilangkan elektron atau menambahkan elektron, menciptakan pembawa muatan terdelokalisasi (polaron/bipolaron) yang bebas bergerak melintasi ikatan pi terkonjugasi",
                            "Karena doping membuat rantai polimer meleleh menjadi logam cair",
                            "Karena doping mengubah plastik menjadi kawat tembaga",
                            "Karena doping memutus seluruh ikatan kovalen rantai karbon"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Polimer terkonjugasi netral adalah semikonduktor dengan celah pita penuh (pita valensi terisi penuh). Doping oksidasi (p-doping) mencabut elektron menciptakan 'hole' bermuatan positif (polaron) yang dapat berpindah bebas di sepanjang pita orbital pi terdelokalisasi.",
                        misconceptionAlert = "Doping pada polimer tidak sama dengan penambahan logam serbuk konduktif, melainkan reaksi redoks kimiawi pada tulang punggung rantai itu sendiri."
                    )
                )
            )

            "kim-katalisis-heterogen-langmuir" -> LessonData(
                conceptId = "kim-katalisis-heterogen-langmuir",
                simId = "sim-heterogeneous-catalysis-bet",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana knalpot mobil catalytic converter bisa mengubah gas beracun karbon monoksida (CO) dan nitrogen oksida (NOx) menjadi gas aman N2 dan CO2 hanya dalam hitungan sepersepuluh detik?",
                        narrativeContext = "Dimas mengamati struktur sarang lebah keramik catalytic converter berlapis platinum."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu adalah Katalisis Heterogen! Molekul gas teradsorpsi secara kimiawi (chemisorption) pada permukaan kisi logam platina/rodium, di mana ikatan kovalennya terlemahkan sehingga bereaksi dengan energi aktivasi yang jauh lebih rendah.",
                        narrativeContext = "Kakek menggambarkan mekanisme Langmuir-Hinshelwood pada permukaan kristal padatan."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan luas permukaan aktif material katalis berpori nano tersebut diukur secara teliti menggunakan metode Isoterm Brunauer-Emmett-Teller (BET) serapan gas nitrogen cair!",
                        narrativeContext = "Kirana menunjukkan kurva isoterm adsorpsi tipe IV dengan histeresis mesopori."
                    )
                ),
                intuitionBody = """
                    Katalisis Heterogen terjadi ketika katalis berada dalam fase yang berbeda (umumnya padatan) dengan reaktan (gas atau cairan). Reaksi kimia terkonsentrasi pada sisi aktif permukaan material.
                    
                    1. Fisisorpsi vs Kemisorpsi:
                       - Fisisorpsi: Gaya tarik van der Waals lemah (entalpi adsorpsi Delta_H < 20 kJ/mol), reversibel, non-spesifik, membentuk banyak lapisan (multilapis).
                       - Kemisorpsi: Pembentukan ikatan kovalen/ionik sejati dengan transfer elektron ke permukaan (Delta_H 80 - 400 kJ/mol), sangat spesifik, teraktivasi, dan terbatas pada satu lapisan molekul (monolayer).
                       
                    2. Isoterm Adsorpsi BET (Brunauer-Emmett-Teller):
                       Memperluas isoterm monolayer Langmuir ke adsorpsi gas multilapis pada suhu kriogenik (77 K untuk N2):
                       1 / [v * ((P0/P) - 1)] = 1/(v_m * c) + [(c - 1)/(v_m * c)] * (P/P0).
                       Plot linear memberikan volume monolayer v_m, yang dikalikan dengan luas penampang molekul nitrogen (0.162 nm^2) menghasilkan Luas Permukaan Spesifik BET (S_BET, sering mencapai 500 - 1500 m^2/gram pada zeolit dan MOF).
                       
                    3. Mekanisme Kinetika Reaksi Permukaan:
                       - Mekanisme Langmuir-Hinshelwood (LH): Kedua molekul reaktan A dan B teradsorpsi pada sisi aktif permukaan yang berdekatan, lalu bereaksi membentuk produk teradsorpsi A-B*, kemudian mengalami desorpsi. Laju reaksi r = k * theta_A * theta_B.
                       - Mekanisme Eley-Rideal (ER): Satu molekul A teradsorpsi di permukaan, lalu ditabrak langsung oleh molekul gas B dari fase ruah (bulk gas) tanpa B teradsorpsi terlebih dahulu.
                       
                    4. Karakterisasi Katalis Padat:
                       - Difraksi Sinar-X Serbuk (PXRD) untuk fasa kristalinitas kisi.
                       - Transmisi Mikroskopi Elektron Resolusi Tinggi (HR-TEM) untuk memetakan ukuran partikel nano dan faset kristal aktif.
                       - Temperature Programmed Desorption (TPD) untuk mengukur kekuatan dan jumlah situs asam/basa katalis.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Permukaan katalis padat menyediakan rute reaksi alternatif dengan keadaan transisi berelemen energi aktivasi rendah.",
                    "Satu gram zeolit berpori nano dapat memiliki luas permukaan internal yang setara dengan luas satu lapangan sepak bola penuh.",
                    "Mekanisme Langmuir-Hinshelwood mendominasi sebagian besar reaksi kimia industri gas heterogen modern.",
                    "Katalis dapat mengalami penonaktifan (deaktivasi) akibat peracunan sisi aktif (poisoning), penggumpalan termal (sintering), atau pembentukan deposit jelaga karbon (coking)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Luas Permukaan Spesifik BET",
                        latex = "\\frac{1}{v \\left[ (P_0/P) - 1 \\right]} = \\frac{1}{v_m c} + \\frac{c-1}{v_m c} \\left(\\frac{P}{P_0}\\right)",
                        explanation = "Persamaan linearisasi isoterm adsorpsi fisik nitrogen cair untuk mengekstrak volume kapasitas monolayer v_m."
                    ),
                    FormulaCard(
                        title = "Laju Reaksi Mekanisme Langmuir-Hinshelwood",
                        latex = "r = k \\theta_A \\theta_B = \\frac{k K_A K_B P_A P_B}{(1 + K_A P_A + K_B P_B)^2}",
                        explanation = "Laju reaksi bergantung pada fraksi tutupan permukaan theta_A dan theta_B dari kedua reaktan yang teradsorpsi bersama."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Katalisis 'Merah Putih' Pengolahan Minyak Sawit Mentah Menjadi Green Diesel D100 di Kilang Plaju",
                    scenario = "Pertamina berkolaborasi dengan Laboratorium Teknik Reaksi Kimia ITB mengembangkan katalis buatan dalam negeri untuk konversi CPO menjadi bahan bakar nabati.",
                    application = "Tim peneliti merancang Katalis Merah Putih berbahan dasar logam transisi NiMo dan NiW yang diemban pada zeolit alam mesopori teraktivasi. Katalis heterogen ini memfasilitasi reaksi hidrodeoksigenasi (HDO) trigliserida sawit pada suhu 350 C dan tekanan 40 bar, memotong asam lemak menjadi hidrokarbon rantai lurus alifatik setara diesel berkualitas tinggi tanpa residu oksigen.",
                    impact = "Menghasilkan Green Diesel D100 murni tanpa emisi sulfur, menghemat devisa impor solar miliaran dolar per tahun dan mewujudkan kedaulatan energi nasional."
                ),
                homeLab = HomeLabData(
                    title = "Pengamatan Dekomposisi Katalitik Hidrogen Peroksida oleh Katalis Heterogen Karbon Aktif",
                    objective = "Mengamati penurunan energi aktivasi penguraian H2O2 menggunakan katalis padat berpori.",
                    materials = listOf("Cairan hidrogen peroksida 3% (antiseptik luka di apotek)", "Tablet karbon aktif (Norit) atau arang kayu tumbuk", "Gelas bening dan sendok", "Lidi dupa / tusuk sate dan korek api"),
                    steps = listOf(
                        "Tuang 30 mL hidrogen peroksida 3% ke dalam gelas bening; amati bahwa cairan relatif tenang (reaksi dekomposisi lambat tanpa katalis).",
                        "Gerus satu butir tablet karbon aktif Norit hingga menjadi serbuk halus.",
                        "Masukkan serbuk karbon aktif ke dalam gelas cairan hidrogen peroksida.",
                        "Amati letupan gelembung gas oksigen seketika yang sangat deras membusa (efek katalitik luas permukaan pori).",
                        "Uji gas oksigen yang keluar dengan menyulut bara api lidi dupa ke mulut gelas; bara dupa akan menyala terang kembali (flame rekindle)."
                    ),
                    safetyNote = "Kenakan sarung tangan plastik dan jangan sampai cairan H2O2 mengenai mata."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Dalam mekanisme reaksi katalisis heterogen Langmuir-Hinshelwood, apakah yang terjadi jika tekanan parsial gas reaktan A ditingkatkan secara sangat ekstrem hingga mendominasi seluruh permukaan?",
                        options = listOf(
                            "Laju reaksi justru akan menurun mendekati nol, karena seluruh sisi aktif tertutup oleh molekul A sehingga reaktan B tidak memiliki ruang untuk teradsorpsi (inhibisi diri)",
                            "Laju reaksi akan melonjak menjadi tak hingga",
                            "Katalis akan meleleh seketika menjadi cairan",
                            "Molekul A akan berubah menjadi partikel alfa"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Berdasarkan penyebut (1 + K_A*P_A + K_B*P_B)^2 pada rumus Langmuir-Hinshelwood, jika P_A sangat besar, suku K_A*P_A mendominasi penyebut kuadratik sementara pembilang hanya bertambah linear, menyebabkan laju reaksi r menurun drastis akibat keracunan kompetitif tutupan permukaan.",
                        misconceptionAlert = "Banyak yang mengira penambahan reaktan selalu mempercepat reaksi, padahal dalam katalisis permukaan terjadi perebutan sisi aktif."
                    )
                )
            )

            "kim-supramolekul-rotaksana" -> LessonData(
                conceptId = "kim-supramolekul-rotaksana",
                simId = "sim-supramolecular-machines",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, apakah kita bisa membuat mesin, saklar, atau lift berukuran mikroskopis dari satu molekul tunggal?",
                        narrativeContext = "Dimas kagum membaca tentang Hadiah Nobel Kimia 2016 untuk Mesin Molekuler."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Tentu bisa, Dimas! Itulah inti dari Kimia Supramolekul—'kimia di luar molekul'. Struktur kompleks dibangun bukan dengan ikatan kovalen kaku, melainkan melalui ikatan non-kovalen terarah seperti interaksi inang-tamu (host-guest chemistry).",
                        narrativeContext = "Kakek menggambar eter mahkota (crown ether) yang mengikat ion kalium di pusat rongganya."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan arsitektur mekanis saling mengunci (mechanically interlocked) seperti Rotaksana dan Katenana memungkinkan cincin molekul bergeser bolak-balik menanggapi stimulus listrik atau pH!",
                        narrativeContext = "Kirana memperlihatkan model molekul rotaksana dengan cincin makrosiklik yang meluncur di sepanjang poros berujung penyumbat (stoppers)."
                    )
                ),
                intuitionBody = """
                    Kimia Supramolekuler (dipelopori oleh Jean-Marie Lehn, Donald Cram, dan Charles Pedersen) berfokus pada entitas molekul berorde tinggi yang disatukan oleh gaya antarmolekul non-kovalen reversibel.
                    
                    1. Pengenalan Molekuler & Kimia Inang-Tamu (Host-Guest):
                       - Eter Mahkota (Crown Ethers): Senyawa makrosiklik polieter (misal 18-crown-6) dengan rongga interior beroksigen elektronegatif yang mengikat secara selektif kation logam K+ berdasarkan kecocokan ukuran geometris rongga.
                       - Kriptan: Molekul sangkar 3D bisiklik yang mengikat ion secara lebih stabil (efek makrobisiklik).
                       - Siklodekstrin: Oligosakarida cincin berbentuk kerucut terpotong dengan rongga interior hidrofobik dan eksterior hidrofilik, mampu mengkapsulkan molekul obat hidrofobik.
                       - Calixarena dan Cucurbituril: Makrosiklus berongga sangkar kaku untuk pengenalan anion atau biomolekul kationik.
                       
                    2. Pasangan Non-Kovalen Terarah & Swarakit (Self-Assembly):
                       Swarakit spontan menghasilkan kisi nanostruktur beraturan termodinamika stabil melalui sinergi:
                       - Ikatan hidrogen multipel terarah (misal motif komplementer donor-akseptor DDAA).
                       - Interaksi penumpukan pi-pi (pi-stacking) elektrostatik quadripol antar cincin aromatik kaya vs miskin elektron.
                       - Koordinasi ligan logam terarah (metal-directed self-assembly) membentuk sangkar polihedral koordinasi nanometer.
                       
                    3. Molekul Bertautan Mekanis (Mechanically Interlocked Molecules / MIMs):
                       - Katenana: Dua atau lebih cincin makrosiklik yang saling menaut laksana mata rantai tanpa ikatan kovalen langsung (ikatan mekanis / topological bond).
                       - Rotaksana: Cincin makrosiklik yang terpasang melingkari poros molekuler linear, tertahan oleh dua gugus penyumbat besar (stoppers) di ujung poros agar tidak terlepas.
                       
                    4. Mesin & Saklar Molekuler (Molecular Machines):
                       Dengan menerapkan stimulus eksternal (cahaya, redoks elektrokimia, atau perubahan pH), cincin rotaksana dapat dipaksa melompat bolak-balik antara dua stasiun pengenal di porosnya (shuttling motion), berfungsi sebagai saklar memori komputer molekuler atau otot buatan sintetis skala nano.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Interaksi supramolekuler meniru pengenalan spesifik gembok-dan-kunci enzim-substrat di dalam tubuh makhluk hidup.",
                    "Swarakit memungkinkan fabrikasi struktur nano dari bawah ke atas (bottom-up nanotechnology) tanpa perlu manipulasi atom satu per satu.",
                    "Ikatan mekanis pada katenana dan rotaksana memberikan derajat kebebasan gerak relatif tanpa memutuskan ikatan kimia kovalen.",
                    "Mesin molekuler mengubah energi kimiawi atau foton menjadi gerakan mekanik terarah di luar kesetimbangan termal Brown."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Konstanta Pengikatan Kompleks Inang-Tamu",
                        latex = "\\mathrm{H} + \\mathrm{G} \\rightleftharpoons \\mathrm{H\\cdot G}, \\quad K_a = \\frac{[\\mathrm{H\\cdot G}]}{[\\mathrm{H}][\\mathrm{G}]}, \\quad \\Delta G^\\circ = -RT \\ln K_a",
                        explanation = "Kekuatan afinitas termodinamika pengenalan molekuler inang (H) dan tamu (G) di dalam larutan."
                    ),
                    FormulaCard(
                        title = "Topologi Rotaksana Tersumbat",
                        latex = "\\text{Poros Linear (Axle)} + \\text{Makrosiklus (Wheel)} \\xrightarrow{\\text{Stoppers}} [2]\\text{-Rotaksana}",
                        explanation = "Molekul tertaut mekanis di mana makrosiklus bebas meluncur di antara stasiun tetapi dicegah lepas oleh sumbat sterik."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Enkapsulasi Obat Kurkumin Menggunakan Supramolekul Beta-Siklodekstrin di Biofarma",
                    scenario = "Kurkumin memiliki khasiat anti-inflamasi tinggi tetapi bioavailabilitasnya sangat rendah karena kelarutan dalam air yang sangat buruk dan cepat terdegradasi.",
                    application = "Peneliti formulasi farmasi Biofarma memanfaatkan rongga hidrofobik beta-siklodekstrin untuk membentuk kompleks inklusi supramolekul 1:1 host-guest dengan kurkumin. Bagian luar siklodekstrin yang hidrofilik berikatan hidrogen dengan air, meningkatkan kelarutan kurkumin hingga 200 kali lipat dalam cairan tubuh.",
                    impact = "Meningkatkan efektivitas penyerapan obat herbal fitofarmaka di dalam saluran pencernaan pasien secara signifikan."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Pemodelan Swarakit Misel Sabun Supramolekuler dalam Air",
                    objective = "Mengamati bagaimana molekul amfifilik berswarakit menjadi agregat supramolekul bola (misel) untuk melarutkan kotoran minyak.",
                    materials = listOf("Gelas bening berisi air", "Minyak goreng (1 sendok teh)", "Sabun cuci piring cair (surfaktan)", "Sendok pengaduk"),
                    steps = listOf(
                        "Masukkan minyak goreng ke dalam air; amati pemisahan fase minyak yang mengapung di atas air.",
                        "Tambahkan beberapa tetes sabun cuci piring, lalu aduk perlahan.",
                        "Amati pembentukan emulsi susu yang keruh stabil: molekul surfaktan berswarakit membentuk kapsul misel supramolekuler.",
                        "Analisis bagaimana ekor hidrofobik mengurung tetesan minyak di dalam rongga inti, sementara kepala hidrofilik berinteraksi dengan pelarut air."
                    ),
                    safetyNote = "Gunakan sabun cuci piring biasa, jangan diminum dan hindari kontak langsung dengan mata."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah yang menyatukan cincin makrosiklik dengan poros batang pada molekul rotaksana sehingga cincin tersebut tidak dapat terlepas?",
                        options = listOf(
                            "Rintangan sterik spasial dari gugus penyumbat besar (stoppers) di ujung poros, tanpa adanya ikatan kovalen langsung (ikatan mekanis)",
                            "Ikatan kovalen rangkap tiga karbon-karbon",
                            "Gaya gravitasi bumi",
                            "Lem perekat polimer silikon"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Rotaksana adalah mechanically interlocked molecule (MIM). Cincin tidak terikat secara kovalen pada porosnya, melainkan terperangkap secara topologis karena diameter rongga cincin lebih kecil dibandingkan ukuran sterik gugus stoppers di kedua ujung poros.",
                        misconceptionAlert = "Sering dikira terdapat ikatan koordinasi logam atau kovalen permanen yang mengunci cincin, padahal murni batasan topologi ruang."
                    )
                )
            )

            "kim-lingkungan-kimia-hijau" -> LessonData(
                conceptId = "kim-lingkungan-kimia-hijau",
                simId = "sim-green-chemistry-aop",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, pabrik tekstil dan industri kimia menghasilkan air limbah berwarna pekat dengan pewarna sintetis beracun yang sulit diurai mikroba. Bagaimana kimiawan membersihkannya?",
                        narrativeContext = "Dimas melihat aliran air limbah industri yang membutuhkan pengolahan sebelum dibuang ke sungai."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menerapkan Proses Oksidasi Lanjut (Advanced Oxidation Processes / AOP)! Reaksi fotokatalitik atau reagen Fenton membangkitkan radikal hidroksil (*OH)—salah satu spesi pengoksidasi terkuat di alam semesta yang membakar polutan menjadi CO2 dan H2O.",
                        narrativeContext = "Kakek menuliskan mekanisme fotokatalisis semikonduktor TiO2 menghasilkan radikal OH."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk jangka panjang, industri kimia modern bertransformasi mengikuti 12 Prinsip Kimia Hijau (Green Chemistry)—mencegah limbah, memaksimalkan ekonomi atom, dan memakai pelarut aman terbarukan!",
                        narrativeContext = "Kirana memaparkan metrik keberlanjutan E-factor (Environmental Factor) dan efisiensi massa proses kimia."
                    )
                ),
                intuitionBody = """
                    Kimia Lingkungan mengkaji nasib, transpor, dan transformasi kimiawi zat pencemar di biosfer, sementara Kimia Hijau (Green Chemistry) merancang proses industri yang menghilangkan penggunaan bahan berbahaya sejak tahap desain.
                    
                    1. 12 Prinsip Green Chemistry (Anastas & Warner):
                       - Pencegahan limbah lebih baik daripada mengolah limbah yang sudah terbentuk.
                       - Ekonomi Atom Tinggi: Memaksimalkan persentase massa seluruh reaktan yang berakhir pada produk akhir (% AE = BM_produk / sum BM_reaktan * 100%).
                       - Sintesis kimia yang kurang berbahaya & perancangan molekul lebih aman.
                       - Pelarut dan zat penolong yang lebih aman (mengganti benzena/diklorometana dengan air, superkritis CO2, atau cairan ionik).
                       - Penggunaan bahan baku terbarukan (biomassa nabati alih-alih minyak bumi fosil).
                       - Katalisis: Katalis selektif lebih unggul dibanding reagen stoikiometris.
                       
                    2. Kimia Atmosfer & Siklus Ozon:
                       Di stratosfer, ozon terbentuk dan terurai secara alami melalui Siklus Chapman fotokimia UV:
                       O2 + h*nu -> 2 O*, O* + O2 -> O3.
                       Klorofluorokarbon (CFC) melepaskan radikal klorin Cl* di bawah radiasi UV gelombang pendek, bertindak sebagai katalis perusak yang menghancurkan hingga 100.000 molekul ozon per radikal:
                       Cl* + O3 -> ClO* + O2; ClO* + O* -> Cl* + O2.
                       
                    3. Proses Oksidasi Tingkat Lanjut (AOP) untuk Pengolahan Air Limbah:
                       AOP menghasilkan radikal hidroksil (*OH) dengan potensial reduksi standar sangat tinggi (E0 = +2.80 V):
                       - Reaksi Fenton: Fe(2+) + H2O2 -> Fe(3+) + *OH + OH(-).
                       - Fotokatalisis Semikonduktor TiO2: Foton h*nu >= E_g (3.2 eV) membangkitkan pasangan elektron-hole (e(-) + h(+)). Hole bereaksi dengan air menghasilkan *OH, sementara elektron mereduksi O2 menjadi superoksida *O2(-).
                       Polutan organik persisten terurai total (mineralisasi) menjadi gas CO2, air, dan garam anorganik tanpa meninggalkan lumpur beracun.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Ekonomi atom mengukur efisiensi hakiki reaksi kimia, berbeda dari sekadar rendemen persentase yield teoritis.",
                    "Radikal bebas di stratosfer bekerja sebagai katalis destruktif daur ulang yang mengikis lapisan pelindung sinar UV bumi.",
                    "Radikal hidroksil bereaksi non-selektif dengan laju difusi kinetika sangat cepat menghancurkan molekul aromatik persisten.",
                    "Green Chemistry beralih dari filosofi 'membersihkan cerobong asap' menjadi 'merancang proses bersih sejak awal molekuler'."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Kalkulasi Ekonomi Atom (Atom Economy / AE)",
                        latex = "\\%\\,\\mathrm{AE} = \\frac{\\text{Massa Molar Produk Target}}{\\sum \\text{Massa Molar Semua Reaktan}} \\times 100\\%",
                        explanation = "Metrik keberlanjutan proses yang mengevaluasi berapa persen massa atom reaktan yang terinkorporasi ke produk jadi."
                    ),
                    FormulaCard(
                        title = "Pembangkitan Radikal Fotokatalisis TiO2",
                        latex = "\\mathrm{TiO_2} + h\\nu \\to e_{\\mathrm{CB}}^- + h_{\\mathrm{VB}}^+, \\quad h_{\\mathrm{VB}}^+ + \\mathrm{H_2O} \\to \\mathrm{H}^+ + \\phantom{}^{\\bullet}\\mathrm{OH}",
                        explanation = "Eksitasi celah pita titanium dioksida oleh foton membangkitkan lubang valensi h+ pengoksidasi kuat molekul air."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Instalasi Pengolahan Air Limbah Industri Batik Solo dengan Fotokatalisis TiO2 BRIN",
                    scenario = "Sentra industri batik tradisional Laweyan di Solo membuang limbah pewarna azo sintetis (seperti Rhodamin-B dan Remazol) yang mencemari air sungai Bengawan Solo.",
                    application = "Peneliti kimia lingkungan BRIN mendesain reaktor fotokatalisis aliran kontinu bertenaga surya menggunakan nanomaterial TiO2 yang didoping nitrogen. Reaktor mengalirkan air limbah melewati pelat kaca berlapis fotokatalis di bawah sinar matahari tropis; radikal hidroksil yang terbentuk memutus ikatan kromofor azo dalam waktu 45 menit, mengubah air limbah pekat menjadi bening memenuhi baku mutu air lingkungan kelas II.",
                    impact = "Menyelamatkan ekosistem sungai Bengawan Solo dari pencemaran karsinogenik dan mendukung keberlanjutan warisan budaya batik nasional."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Degradasi Pewarna Makanan Menggunakan Reagen Fenton Sederhana",
                    objective = "Mengamati pemudaran cepat warna molekul organik oleh radikal hidroksil reaksi Fenton Fe(2+) dan H2O2.",
                    materials = listOf("Gelas bening berisi air", "Pewarna makanan cair merah atau biru", "Cairan hidrogen peroksida 3%", "Satu butir tablet suplemen zat besi fero sulfat FeSO4 (atau rendaman paku berkarat)", "Sendok pengaduk"),
                    steps = listOf(
                        "Teteskan 1 tetes pewarna makanan ke dalam gelas air hingga berwarna cerah merata.",
                        "Tambahkan 1 sendok teh larutan hidrogen peroksida 3%; amati bahwa warna tidak langsung memudar (H2O2 bereaksi lambat sendiri).",
                        "Gerus tablet zat besi FeSO4 dan masukkan sedikit serbuknya ke dalam gelas.",
                        "Aduk perlahan dan amati fenomena: warna pewarna makanan memudar dengan cepat dalam hitungan detik hingga hampir bening!",
                        "Diskusikan peran ion besi Fe(2+) yang mengkatalisis pemecahan H2O2 menjadi radikal bebas *OH pengoksidasi rantai zat warna."
                    ),
                    safetyNote = "Kenakan sarung tangan, cairan reaksi tidak boleh diminum atau dibuang sembarangan."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Reaksi adisi Diels-Alder antara 1,3-butadiena dan etena menghasilkan 100% sikloheksena tanpa produk sampingan apa pun. Berapakah nilai persentase Ekonomi Atom (% AE) dari reaksi ini?",
                        options = listOf(
                            "100%",
                            "50%",
                            "75%",
                            "0%"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Karena seluruh atom dari kedua molekul reaktan masuk sepenuhnya menjadi bagian dari produk target tunggal tanpa ada atom yang terbuang sebagai molekul sampingan, maka massa produk sama persis dengan total massa reaktan, menghasilkan Ekonomi Atom sempurna 100%.",
                        misconceptionAlert = "Rendemen (yield) eksperimen di laboratorium mungkin hanya 80% karena faktor kehilangan saat penyaringan, tetapi secara teoritis Ekonomi Atom reaksi adisi tetap 100%."
                    )
                )
            )

            "kim-medisinal-desain-obat-docking" -> LessonData(
                conceptId = "kim-medisinal-desain-obat-docking",
                simId = "sim-molecular-docking-qsar",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana perusahaan farmasi menemukan obat baru di antara miliaran kemungkinan molekul kimia tanpa harus mencoba satu per satu pada manusia?",
                        narrativeContext = "Dimas melihat model struktur 3D protein reseptor virus yang berinteraksi dengan molekul obat."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menggunakan Desain Obat Berbantuan Komputer (CADD)! Menggunakan Penambatan Molekuler (Molecular Docking), komputer menyimulasikan orientasi ikatan ligan pada sisi aktif enzim penyakit.",
                        narrativeContext = "Kakek menjelaskan algoritma energi pengikatan bebas Delta_G_bind dan hubungan struktur-aktivitas kuantitatif (QSAR)."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan kandidat obat harus lolos penyaringan aturan Lipinski 'Rule of 5' serta memiliki profil ADMET yang baik agar dapat diserap usus, terdistribusi ke target, dan tidak meracuni hati!",
                        narrativeContext = "Kirana memaparkan parameter farmakokinetik: Absorpsi, Distribusi, Metabolisme, Ekskresi, dan Toksisitas."
                    )
                ),
                intuitionBody = """
                    Kimia Medisinal menggabungkan kimia organik sintetis, biokimia, dan kimia komputasi untuk merancang, mengoptimasi, dan mengembangkan senyawa kimia menjadi obat terapeutik yang aman dan efektif.
                    
                    1. Hubungan Struktur-Aktivitas Kuantitatif (QSAR):
                       Model matematika memprediksi aktivitas biologis (log 1/IC50) dari parameter fisikokimia molekul:
                       Persamaan Hansch: log(1/C) = -k1*(log P)^2 + k2*(log P) + rho*sigma + delta*E_s + c.
                       - log P: Koefisien partisi oktanol/air (hidrofobisitas molekul).
                       - sigma: Parameter elektronik Hammett (efek induksi/resonansi substituen).
                       - E_s: Parameter sterik Taft (halangan ruang substituen).
                       
                    2. Aturan Lima Lipinski (Rule of Five) untuk Obat Oral:
                       Kemungkinan besar senyawa obat memiliki permeabilitas dan penyerapan oral yang baik jika tidak melanggar lebih dari satu kriteria berikut:
                       - Berat molekul <= 500 Dalton.
                       - Koefisien partisi lipofilik log P <= 5.
                       - Jumlah donor ikatan hidrogen (HBD: gugus O-H dan N-H) <= 5.
                       - Jumlah akseptor ikatan hidrogen (HBA: atom O dan N) <= 10.
                       
                    3. Profil Farmakokinetik ADMET:
                       - Absorpsi: Penyerapan di saluran cerna menembus membran enterosit usus.
                       - Distribusi: Pengikatan protein plasma albumin dan kemampuan menembus sawar darah otak (BBB).
                       - Metabolisme: Biotransformasi fase I (oksidasi oleh enzim sitokrom P450 di organ hati) dan fase II (konjugasi glukuronidasi).
                       - Ekskresi: Eliminasi metabolit melalui ginjal (urin) atau empedu (feses).
                       - Toksisitas: Efek samping penghambatan saluran ion hERG jantung (aritmia) atau hepatotoksisitas hati.
                       
                    4. Penambatan Molekuler Virtual (Molecular Docking):
                       Algoritma konformasi (Algoritma Genetik Lamarckian / Monte Carlo) menjelajahi ruang pose ikatan ligan di dalam kantung pengikatan (binding pocket) protein reseptor target.
                       Fungsi skor empiris menghitung energi bebas ikatan Delta_G_bind:
                       Delta_G = Delta_G_vdw + Delta_G_hbond + Delta_G_elec + Delta_G_desolv + Delta_G_torsional.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Molecular docking mengidentifikasi interaksi kritis (ikatan hidrogen, jembatan garam, interaksi hidrofobik) pengunci ligan.",
                    "Aturan Lipinski menyeimbangkan sifat kelarutan obat dalam cairan berair dengan kemampuannya menembus membran lipid dwilapis sel.",
                    "Penghambatan saluran hERG kalium jantung adalah uji toksisitas virtual wajib untuk mencegah resiko henti jantung mendadak.",
                    "CADD memangkas waktu penemuan obat dari 10-15 tahun menjadi separuhnya dengan menyingkirkan kandidat buruk sejak fase awal."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Analisis Hansch QSAR",
                        latex = "\\log \\left(\\frac{1}{\\mathrm{IC}_{50}}\\right) = -a (\\log P)^2 + b \\log P + \\rho \\sigma + \\delta E_s + \\mathrm{konstanta}",
                        explanation = "Model regresi multivariat yang menghubungkan potensi biologis IC50 dengan sifat lipofilik, elektronik, dan ukuran sterik senyawa."
                    ),
                    FormulaCard(
                        title = "Energi Bebas Pengikatan Penambatan Molekuler",
                        latex = "\\Delta G_{\\mathrm{bind}} = \\Delta G_{\\mathrm{vdW}} + \\Delta G_{\\mathrm{hbond}} + \\Delta G_{\\mathrm{elec}} + \\Delta G_{\\mathrm{desolv}} + \\Delta G_{\\mathrm{tor}} = -RT \\ln K_i",
                        explanation = "Skor afinitas docking yang memprediksi konstanta inhibisi Ki ligan terhadap protein target."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Desain Virtual Senyawa Anti-Malaria Turunan Artemisinin oleh FKUI & Pusat Riset Vaksin BRIN",
                    scenario = "Plasmodium falciparum parasit penyebab malaria di Papua dan NTT mulai menunjukkan resistensi terhadap obat lini pertama artemisinin.",
                    application = "Tim kimia medisinal mengunduh struktur kristal enzim target PfATP6 dari Protein Data Bank (PDB). Dengan software AutoDock Vina, mereka menambatkan serangkaian analog senyawa artemisinin baru yang dirancang secara in silico. Senyawa dengan energi binding paling negatif (-10.4 kkal/mol) dan profil ADMET aman dilanjutkan ke sintesis organik laboratorium, terbukti memiliki daya hambat nanomolar terhadap strain resisten.",
                    impact = "Membuka jalan pengembangan terapi kombinasi antimalaria generasi baru untuk percepatan eliminasi malaria di Indonesia timur."
                ),
                homeLab = HomeLabData(
                    title = "Eksplorasi Profil Obat Komersial dan Aturan Lipinski Menggunakan SwissADME Online",
                    objective = "Menghitung sifat fisikokimia obat nyata dan mengevaluasi kelayakannya sebagai sediaan oral.",
                    materials = listOf("Komputer / Ponsel dengan akses internet browser", "Situs web gratis swissadme.ch"),
                    steps = listOf(
                        "Buka situs swissadme.ch di browser.",
                        "Ketik nama obat terkenal (misalnya 'aspirin', 'paracetamol', atau 'amoxicillin') pada kolom SMILES/Name.",
                        "Klik tombol 'Run!'.",
                        "Periksa nilai Berat Molekul (MW), Log P, Donor Ikatan Hidrogen, dan Akseptor Ikatan Hidrogen pada tabel hasil.",
                        "Periksa status 'Lipinski violations' (apakah 0 atau lebih). Amati grafik radar bioavailability.",
                        "Bandingkan profil obat parasetamol dengan molekul besar seperti antibiotik vankomisin."
                    ),
                    safetyNote = "Praktikum bioinformatika dan farmakoinformatika online bebas risiko fisik."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Berdasarkan Aturan 5 Lipinski (Rule of Five), manakah dari kriteria berikut yang BUKAN merupakan syarat penyerapan oral yang baik bagi senyawa obat?",
                        options = listOf(
                            "Berat molekul harus melebihi 1000 Dalton",
                            "Berat molekul kurang dari atau sama dengan 500 Dalton",
                            "Nilai Log P kurang dari atau sama dengan 5",
                            "Jumlah donor ikatan hidrogen (HBD) kurang dari atau sama dengan 5"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Aturan Lipinski menyatakan berat molekul kandidat obat oral idealnya <= 500 Dalton. Senyawa dengan berat molekul di atas 1000 Dalton umumnya terlalu besar dan kaku untuk menembus membran sel epitel usus secara difusi pasif.",
                        misconceptionAlert = "Disebut Rule of Five bukan karena ada 5 aturan, melainkan karena angka batas ambang batasnya merupakan kelipatan lima (BM <= 500, Log P <= 5, HBD <= 5, HBA <= 10)."
                    )
                )
            )

            "kim-elektrokimia-terapan-baterai-li" -> LessonData(
                conceptId = "kim-elektrokimia-terapan-baterai-li",
                simId = "sim-li-ion-battery-pemfc",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, Indonesia memiliki cadangan bijih nikel terbesar di dunia yang kini diolah menjadi bahan baterai kendaraan listrik (EV). Bagaimana nikel menyimpan energi listrik di dalam baterai?",
                        narrativeContext = "Dimas melihat fasilitas hilirisasi nikel baterai dan sel baterai silinder 21700 di pabrik perakitan."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu bekerja melalui Kimia Interkalasi, Dimas! Nikel berfungsi sebagai material katoda berstruktur lapis (seperti LiNiMnCoO2 / NMC). Saat baterai diisi daya, kation Litium (Li+) keluar dari kisi kristal nikel dan menyusup ke sela-sela lapisan grafit anoda.",
                        narrativeContext = "Kakek menggambarkan mekanisme 'rocking-chair' pergerakan kation Li+ menembus cairan elektrolit."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan di anoda grafit, terbentuk lapisan padat pelindung SEI (Solid Electrolyte Interphase) yang sangat penting untuk mencegah dekomposisi cairan elektrolit lebih lanjut!",
                        narrativeContext = "Kirana memaparkan perbandingan performa baterai Litium NMC, Litium Besi Fosfat (LFP), dan sel bahan bakar hidrogen PEMFC."
                    )
                ),
                intuitionBody = """
                    Elektrokimia Terapan adalah inti dari transisi energi hijau global, mencakup penyimpanan elektrokimia sekunder (baterai isi ulang) dan konversi energi elektrokimia (sel bahan bakar hidrogen).
                    
                    1. Mekanisme Kerja Baterai Litium-Ion (Rocking-Chair Mechanism):
                       Reaksi berlangsung melalui interkalasi dan deinterkalasi reversibel ion Li+:
                       - Katoda (misal LFP atau NMC811): LiMO2 <-> Li_{1-x}MO2 + x Li(+) + x e(-).
                       - Anoda (Grafit berlapis): x Li(+) + x e(-) + C6 <-> Li_x C6.
                       Saat pengisian (charging), arus listrik luar memaksa elektron dan kation Li+ mengalir dari katoda ke anoda. Saat pengosongan (discharging), reaksi spontan membalik arah aliran menghasilkan arus listrik kerja.
                       
                    2. Lapisan Antarmuka Elektrolit Padat (Solid Electrolyte Interphase / SEI):
                       Pada siklus pengisian pertama, potensial anoda grafit turun di bawah jendela stabilitas termodinamika elektrolit organik (pelarut etilen karbonat EC/DMC dengan garam LiPF6). Elektrolit tereduksi membentuk lapisan pasivasi SEI nanometer (terdiri dari Li2CO3, LiF, alkilkarbonat). SEI bersifat konduktor ionik bagi Li+ tetapi isolator elektronik, mencegah elektrolit terurai terus-menerus.
                       
                    3. Baterai Masa Depan: Solid-State Batteries:
                       Mengganti cairan elektrolit yang mudah terbakar dengan elektrolit padat anorganik (keramik garnet LLZO atau sulfida argyrodite). Menghilangkan risiko thermal runaway (kebakaran baterai) dan memungkinkan pemakaian anoda litium murni berkapasitas energi dua kali lipat lebih tinggi.
                       
                    4. Sel Bahan Bakar Membran Penukar Proton (PEMFC):
                       Mengubah energi kimia gas hidrogen dan oksigen langsung menjadi listrik tanpa pembakaran:
                       - Anoda: H2 -> 2 H(+) + 2 e(-) (reaksi oksidasi hidrogen HOR katalis Pt).
                       - Katoda: 1/2 O2 + 2 H(+) + 2 e(-) -> H2O (reaksi reduksi oksigen ORR kinetika lambat).
                       Membran Nafion menghantarkan proton H+ melintasi sel, menghasilkan efisiensi termodinamika di atas 60% dengan produk sampingan murni air hangat.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Mekanisme interkalasi tidak merusak struktur kristal kisi inang, memungkinkan baterai diisi ulang ribuan siklus tanpa hancur.",
                    "Kualitas pembentukan lapisan pelindung SEI pada siklus pertama menentukan umur pakai dan retensi kapasitas baterai.",
                    "Baterai NMC berbasis nikel menawarkan densitas energi tinggi, sementara LFP menawarkan keamanan termal dan stabilitas siklus superior.",
                    "Sel bahan bakar PEMFC memproduksi air bersih murni sebagai satu-satunya emisi buangan knalpot kendaraan hidrogen."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Kapasitas Spesifik Teoritis Material Elektroda",
                        latex = "Q_{\\mathrm{teoritis}} = \\frac{n F}{3600 \\times M} \\quad (\\mathrm{mAh/g})",
                        explanation = "Kapasitas muatan listrik per gram bahan berdasarkan Hukum Faraday elektrosintesis (F = 96485 C/mol)."
                    ),
                    FormulaCard(
                        title = "Reaksi Reduksi Oksigen (ORR) Katoda PEMFC",
                        latex = "\\frac{1}{2}\\mathrm{O_2} + 2\\mathrm{H}^+ + 2e^- \\xrightarrow{\\mathrm{Pt}} \\mathrm{H_2O}, \\quad E^\\circ = +1.23\\,\\mathrm{V}",
                        explanation = "Reaksi kinetika katoda yang menentukan efisiensi voltase operasional sel bahan bakar hidrogen."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pengembangan Rantai Pasok Baterai Kendaraan Listrik PT Indonesia Battery Corporation (IBC)",
                    scenario = "Konsorsium BUMN PT IBC bersama mitra global membangun industri baterai terintegrasi dari tambang nikel Morowali hingga pabrik sel baterai di Karawang Jawa Barat.",
                    application = "Insinyur elektrokimia dan metalurgi mengekstraksi nikel dan kobalt melalui teknologi High-Pressure Acid Leach (HPAL) menghasilkan endapan Mixed Hydroxide Precipitate (MHP), lalu disintesis menjadi prekursor katoda LiNi0.8Mn0.1Co0.1O2 (NMC811). Desain katoda dikontrol ukuran butir sekundernya untuk meminimalkan keretakan mikro antarbutir selama kontraksi-ekspansi kisi saat pengisian cepat (fast charging 15 menit).",
                    impact = "Mewujudkan hilirisasi mineral bernilai tambah tinggi dan memposisikan Indonesia sebagai episentrum rantai pasok kendaraan listrik dunia."
                ),
                homeLab = HomeLabData(
                    title = "Pembuatan Sel Elektrokimia Sederhana Dua Logam Menyalakan Lampu LED",
                    objective = "Mengamati pembangkitan potensial elektrokimia spontan dari pasangan redoks dua elektroda logam dalam elektrolit asam.",
                    materials = listOf("Koin tembaga murni (elektroda positif)", "Paku besi bergalvanis seng / kawat seng (elektroda negatif)", "Jeruk nipis / lemon / cuka dapur", "Kabel jepit buaya kecil", "Satu lampu LED merah mini"),
                    steps = listOf(
                        "Tancapkan koin tembaga (Cu) dan paku seng (Zn) ke dalam buah jeruk nipis berjarak 2 cm tanpa saling bersentuhan.",
                        "Ukur beda potensial sel dengan multimeter; amati tegangan sekitar 0.9 - 1.0 Volt per buah jeruk.",
                        "Hubungkan 3 atau 4 buah jeruk secara seri (tembaga jeruk 1 ke seng jeruk 2, dst) untuk memperoleh tegangan total di atas 2.5 Volt.",
                        "Sambungkan ujung rangkaian ke lampu LED merah; amati lampu LED menyala terang!",
                        "Diskusikan transfer elektron dari oksidasi seng (anoda) ke reduksi ion hidrogen asam di permukaan tembaga (katoda)."
                    ),
                    safetyNote = "Jeruk yang digunakan untuk praktikum logam tidak boleh dikonsumsi lagi."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah fungsi utama dari pembentukan lapisan Solid Electrolyte Interphase (SEI) pada anoda grafit baterai Litium-Ion?",
                        options = listOf(
                            "Melindungi cairan elektrolit dari dekomposisi reduksi terus-menerus dengan bertindak sebagai konduktor ionik bagi Li+ sekaligus isolator elektronik bagi elektron",
                            "Mendinginkan baterai agar suhunya mencapai minus sepuluh derajat Celsius",
                            "Mengubah cairan baterai menjadi emas murni",
                            "Menghentikan seluruh aliran arus listrik secara permanen"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Lapisan SEI terbentuk dari dekomposisi awal elektrolit pada siklus pertama. Karakteristik idealnya adalah selektif permeable: ion Li+ dapat melintasinya secara lancar untuk berinterkalasi ke dalam grafit, namun elektron dicegah menembusnya sehingga reaksi dekomposisi elektrolit terhenti.",
                        misconceptionAlert = "SEI sering dianggap cacat pabrik karena mengkonsumsi sejumlah kapasitas awal Li, padahal tanpa SEI stabil baterai litium-ion tidak akan pernah bisa bertahan lebih dari beberapa siklus."
                    )
                )
            )

            else -> null
        }
    }
}

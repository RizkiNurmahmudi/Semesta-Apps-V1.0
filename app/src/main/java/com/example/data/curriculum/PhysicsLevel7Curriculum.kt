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

object PhysicsLevel7Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "fis-teori-medan-kuantum-qed",
            domain = Domain.FISIKA,
            topic = "Teori Medan Kuantum",
            title = "Teori Medan Kuantum (QFT): Kuantisasi Kanonik, Feynman & QED",
            description = "Kuantisasi kedua medan Klein-Gordon dan Dirac, perambatan foton, aturan diagram Feynman, Elektrodinamika Kuantum (QED), dan prosedur renormalisasi radiatif.",
            level = DepthLevel.L7,
            estMinutes = 27,
            prerequisites = listOf("fis-kuantum-lanjut-perturbasi", "fis-relativitas-umum-tensor")
        ),
        ConceptItem(
            id = "fis-relativitas-umum-kerr-hawking",
            domain = Domain.FISIKA,
            topic = "Gravitasi Relativistik & Lubang Hitam",
            title = "Relativitas Umum Lanjut: Metrik Kerr, Radiasi Hawking & Gelombang Gravitasi",
            description = "Geometri metrik Kerr lubang hitam berotasi, ergosfer proses Penrose, termodinamika lubang hitam Bekenstein-Hawking, dan radiasi gelombang gravitasi kuadrupol.",
            level = DepthLevel.L7,
            estMinutes = 27,
            prerequisites = listOf("fis-relativitas-umum-tensor", "fis-astrofisika-kosmologi-friedmann")
        ),
        ConceptItem(
            id = "fis-materi-terkondensasi-topologis",
            domain = Domain.FISIKA,
            topic = "Fisika Materi Terkondensasi Lanjut",
            title = "Materi Terkondensasi Lanjut: Fase Topologis & Superkonduktivitas Suhu Tinggi",
            description = "Teori cairan Fermi Landau, parameter tatanan teori Ginzburg-Landau, bilangan Chern invarian topologis, Efek Hall Kuantum integer/fraksional, dan isolator topologis.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("fis-fisika-zat-padat-pita", "mat-topologi-ruang-metrik")
        ),
        ConceptItem(
            id = "fis-teori-string-gravitasi-kuantum",
            domain = Domain.FISIKA,
            topic = "Gravitasi Kuantum & Teori String",
            title = "Gravitasi Kuantum & Teori Superstring: Polyakov, D-Brane & Korespondensi AdS/CFT",
            description = "Tindakan Polyakov dawai relativistik 1D, spektrum graviton superstring 10D, dualitas Teori-M 11D, holografi korespondensi AdS/CFT Maldacena, dan pengantar Loop Quantum Gravity.",
            level = DepthLevel.L7,
            estMinutes = 27,
            prerequisites = listOf("fis-teori-medan-kuantum-qed", "mat-geometri-diferensial-manifold")
        ),
        ConceptItem(
            id = "fis-informasi-komputasi-kuantum",
            domain = Domain.FISIKA,
            topic = "Informasi & Komputasi Kuantum",
            title = "Komputasi Kuantum: Qubit, Entanglement Bell, Gerbang Kuantum & Algoritma Shor",
            description = "Representasi bola Bloch qubit, keterikatan entanglement uji Bell-CHSH, sirkuit gerbang Hadamard/CNOT, algoritma faktorisasi Shor, pencarian Grover, dan kode koreksi galat kuantum.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("fis-kuantum-lanjut-perturbasi", "mat-aljabar-linear-spl")
        ),
        ConceptItem(
            id = "fis-partikel-energi-tinggi-bsm",
            domain = Domain.FISIKA,
            topic = "Fisika Partikel Energi Tinggi",
            title = "Fisika Partikel Lanjut: Eksperimen LHC, Osilasi Neutrino & Materi Gelap BSM",
            description = "Fenomenologi penampang hamburan kolider hadron LHC, osilasi neutrino matriks PMNS, unifikasi agung GUT, supersimetri SUSY, dan kandidat materi gelap WIMP/Axion.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("fis-fisika-inti-partikel-standar", "fis-teori-medan-kuantum-qed")
        ),
        ConceptItem(
            id = "fis-statistik-non-ekuilibrium-langevin",
            domain = Domain.FISIKA,
            topic = "Fisika Statistik Non-Ekuilibrium",
            title = "Statistik Non-Ekuilibrium: Persamaan Langevin, Fokker-Planck & Materi Aktif",
            description = "Gerak Brown stokastik fluktuasi-disipasi Einstein, persamaan diferensial stokastik Langevin, evolusi kerapatan probabilitas Fokker-Planck, teorema fluktuasi Jarzynski, dan sistem materi aktif.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("fis-fisika-statistik-ensemble", "mat-probabilitas-inferensi-regresi")
        ),
        ConceptItem(
            id = "fis-biofisika-molekuler",
            domain = Domain.FISIKA,
            topic = "Biofisika Molekuler",
            title = "Biofisika Molekuler: Pelipatan Protein, Motor Molekul & Pinset Optik",
            description = "Termodinamika lanskap corong energi pelipatan protein, motor molekuler kinesin/miosina sebagai mesin termal Brown, dan manipulasi gaya pikonewton pinset optik laser.",
            level = DepthLevel.L7,
            estMinutes = 25,
            prerequisites = listOf("fis-statistik-non-ekuilibrium-langevin", "kim-biokimia-jalur-metabolisme-respirasi")
        ),
        ConceptItem(
            id = "fis-fisika-eksperimental-detektor",
            domain = Domain.FISIKA,
            topic = "Fisika Eksperimental & Instrumentasi Detektor",
            title = "Fisika Eksperimental: Detektor Partikel Silikon, Interferometri Laser & DAQ",
            description = "Interaksi radiasi dengan materi (ionisasi Bethe-Bloch), detektor mikrostrip silikon semikonduktor, instrumentasi laser ultra-presisi isolasi seismik (LIGO), dan sistem DAQ FPGA real-time.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("fis-optik-lanjut-laser-nonlinear", "fis-fisika-inti-partikel-standar")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "fis-teori-medan-kuantum-qed" -> LessonData(
                conceptId = "fis-teori-medan-kuantum-qed",
                simId = "sim-qft-feynman-diagrams",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, mekanika kuantum biasa memperlakukan partikel sebagai gelombang tunggal dengan massa kekal. Tapi saat energi partikel sangat tinggi melebihi E = mc^2, partikel baru bisa tercipta dan musnah seketika!",
                        narrativeContext = "Dimas memandangi jejak kehancuran dan penciptaan partikel di dalam kamar kabut detektor radiasi."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Tepat sekali, Dimas! Untuk menyatukan mekanika kuantum dan relativitas khusus, entitas fundamental bukanlah partikel individual, melainkan Medan Kuantum yang mengisi seluruh ruang hampa. Partikel hanyalah riak eksitasi lokal dari medan tersebut!",
                        narrativeContext = "Kakek menuliskan operator penciptaan a^(dagger) dan pemusnahan a dari Kuantisasi Kedua kanonik."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan Richard Feynman menemukan cara menghitung interaksi partikel menggunakan Diagram Feynman grafis intuitif, di mana divergensi tak terhingga dinormalkan melalui proses Renormalisasi yang menghasilkan ketelitian 12 digit desimal pada QED!",
                        narrativeContext = "Kirana menggambarkan loop vakum polarisasi foton dan momen magnetik anomal elektron (g-2)."
                    )
                ),
                intuitionBody = """
                    Teori Medan Kuantum (Quantum Field Theory / QFT) adalah kerangka kerja teoretis paling mendasar dalam fisika modern, menyatukan mekanika kuantum, relativitas khusus, dan teori medan klasik.
                    
                    1. Kuantisasi Kanonik Kedua (Second Quantization):
                       Medan klasik phi(x, t) dipromosikan menjadi operator bernilai operator medan yang memenuhi relasi komutasi setara waktu (ETCR):
                       [phi(x), pi(y)] = i * hbar * delta^3(x - y).
                       Ekspansi modus Fourier menghasilkan operator kreasi a^dagger(p) dan anihilasi a(p):
                       Keadaan vakum |0> adalah keadaan tanpa partikel; partikel berenergi E diperoleh dari eksitasi |p> = a^dagger(p)|0>.
                       - Boson (spin bulat): Mematuhi relasi komutasi (statistik Bose-Einstein).
                       - Fermion (spin setengah): Mematuhi relasi anti-komutasi {psi(x), psi^dagger(y)} (Teorema Spin-Statistik Pauli).
                       
                    2. Elektrodinamika Kuantum (QED):
                       Lagrangian QED invarian tera lokal U(1):
                       L = psi_bar * (i * gamma^mu * D_mu - m) * psi - (1/4) * F_{mu nu} * F^{mu nu}, dengan turunan kovarian D_mu = partial_mu + i*e*A_mu.
                       Kopling interaksi elektron-foton diwakili oleh muatan elementer e.
                       
                    3. Propagator & Aturan Diagram Feynman:
                       Amplitudo hamburan matriks-S S_{fi} dihitung secara perturbatif menggunakan Teorema Wick:
                       - Garis luar fermion/foton: fungsi gelombang keadaan awal/akhir.
                       - Garis dalam (propagator): fungsi Green Feynman D_F(p) = -i / (p^2 + m^2 - i*epsilon).
                       - Simpul (vertex): interaksi lokal -i*e*gamma^mu.
                       
                    4. Renormalisasi Radiatif:
                       Loop tertutup Feynman menghasilkan integral momentum tak berhingga (divergensi ultraviolet UV). Prosedur renormalisasi (menggunakan regularisasi dimensi dan pemotongan skema MS-bar) mendefinisikan ulang massa, muatan, dan normalisasi medan telanjang menjadi parameter fisik terukur yang 'berjalan' (running coupling constant alpha(Q^2)).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Partikel identik tidak dapat dibedakan karena semuanya adalah kuanta eksitasi dari medan kuantum tunggal yang sama di seluruh alam semesta.",
                    "Ruang vakum kuantum bukanlah ruang kosong sejati, melainkan dipenuhi oleh fluktuasi partikel-antipartikel virtual yang terus-menerus muncul dan lenyap.",
                    "QED adalah teori fisika paling presisi yang pernah diciptakan manusia, memprediksi momen magnetik elektron hingga kecocokan 1 bagian dalam 1 triliun.",
                    "Renormalisasi bukanlah trik matematis menyapu ketakterhinggaan di bawah karpet, melainkan pengakuan bahwa parameter fisis bergantung pada skala energi pengukuran."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Kerapatan Lagrangian Elektrodinamika Kuantum (QED)",
                        latex = "\\mathcal{L}_{\\mathrm{QED}} = \\bar{\\psi}(i\\gamma^\\mu D_\\mu - m)\\psi - \\frac{1}{4}F_{\\mu\\nu}F^{\\mu\\nu}, \\quad D_\\mu = \\partial_\\mu + ieA_\\mu",
                        explanation = "Lagrangian invarian tera lokal U(1) yang mengatur interaksi elektromagnetik kuantum antara medan spinor Dirac elektron dan medan vektor foton."
                    ),
                    FormulaCard(
                        title = "Aturan Simpul Feynman Interaksi QED",
                        latex = "-i e \\gamma^\\mu, \\quad S_F(p) = \\frac{i(\\gamma^\\nu p_\\nu + m)}{p^2 - m^2 + i\\varepsilon}",
                        explanation = "Elemen matriks simpul pertukaran foton dengan elektron dan fungsi perambatan fermion Feynman di ruang momentum."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Partisipasi Konsorsium Fisikawan BRIN-ITB-UI dalam Eksperimen Kolaboratif ALICE / CMS CERN",
                    scenario = "Konsorsium peneliti fisika energi tinggi Indonesia bergabung dalam eksperimen kolaborasi global di Large Hadron Collider (LHC) CERN Jenewa.",
                    application = "Fisikawan Indonesia menganalisis produksi pasangan lepton muon-antimuon dari peluruhan foton virtual dan boson Z pada tumbukan proton-timbal berenergi 5.02 TeV. Menggunakan perhitungan diagram Feynman QED/QCD orde tinggi dan simulasi generator Monte Carlo Pythia, mereka mengisolasi efek koreksi radiatif elektrolemah untuk mengukur kerapatan plasma kuark-gluon primordial.",
                    impact = "Menempatkan institusi riset Indonesia di peta penemuan sains dasar partikel elementer perbatasan dunia."
                ),
                homeLab = HomeLabData(
                    title = "Analogi Efek Casimir Fluktuasi Vakum Menggunakan Dua Lempeng Kertas Mengapung",
                    objective = "Memahami bagaimana eksklusi modus gelombang di antara dua dinding pembatas menimbulkan gaya tarik bersih netto.",
                    materials = listOf("Dua carik kertas tipis berukuran 5 x 10 cm", "Benang dan gantungan pensil", "Baskom air tenang"),
                    steps = listOf(
                        "Gantungkan kedua kertas secara sejajar berjarak 2 cm di atas meja.",
                        "Tiupkan udara secara perlahan tepat di celah sempit di antara kedua kertas.",
                        "Amati fenomena: kedua kertas bergerak saling mendekat dan bertumbukan (prinsip Bernoulli)! ",
                        "Pahami analogi dengan Efek Casimir QED: di luar lempeng logam terdapat seluruh modus fluktuasi foton virtual tak terhingga, sementara di antara dua lempeng sempit hanya modus gelombang diskrit harmonik yang diizinkan, menghasilkan tekanan radiasi vakum neto yang mendorong kedua lempeng saling menarik di ruang hampa."
                    ),
                    safetyNote = "Praktikum analogi konsep fisis, aman dilakukan di rumah."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Dalam Teori Medan Kuantum, apakah konsekuensi fisik langsung dari relasi anti-komutasi {psi(x), psi^dagger(y)} = delta(x - y) pada medan Dirac elektron?",
                        options = listOf(
                            "Prinsip Eksklusi Pauli terpenuhi secara otomatis, di mana dua elektron tidak dapat menempati keadaan kuantum yang sama persis (karena (a^dagger)^2 = 0)",
                            "Elektron dapat saling bertumpukan tanpa batas",
                            "Massa elektron menjadi bernilai nol",
                            "Elektron bergerak lebih cepat daripada cahaya"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Pada operator kuantisasi fermionik, relasi antikomutasi {a^dagger, a^dagger} = 0 menghasilkan identitas (a^dagger)^2 = 0. Mencoba menciptakan dua fermion pada keadaan modus yang sama menghasilkan nol, yang merupakan bukti matematis mutlak dari Prinsip Eksklusi Pauli dalam QFT.",
                        misconceptionAlert = "Jika digunakan komutator biasa [a, a^dagger] (seperti pada foton boson), partikel tidak akan memiliki prinsip larangan Pauli dan runtuh menjadi kondensat Bose."
                    )
                )
            )

            "fis-relativitas-umum-kerr-hawking" -> LessonData(
                conceptId = "fis-relativitas-umum-kerr-hawking",
                simId = "sim-kerr-hawking-black-hole",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, lubang hitam Schwarzschild adalah lubang hitam diam yang tidak berputar. Tapi di alam nyata, bintang yang runtuh pasti berotasi kencang mempertahankan momentum sudut. Bagaimana geometri lubang hitam berotasi?",
                        narrativeContext = "Dimas melihat visualisasi piringan akresi gas membara yang berputar mengelilingi lubang hitam supermasif M87*."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu dijelaskan oleh Metrik Roy Kerr (1963)! Rotasi menyeret kain ruang-waktu di sekitarnya dalam fenomena 'Frame Dragging', menciptakan wilayah Ergosfer di luar horizon di mana tidak ada benda apa pun yang bisa diam relatif terhadap pengamat jauh.",
                        narrativeContext = "Kakek menggambarkan struktur horizon peristiwa luar dan ergosfer Proses Penrose."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan Stephen Hawking mengguncang dunia fisika dengan membuktikan bahwa lubang hitam tidak sepenuhnya hitam: efek kuantum di dekat horizon peristiwa memancarkan Radiasi Termal Hawking hingga lubang hitam menguap perlahan!",
                        narrativeContext = "Kirana menuliskan rumus temperatur Hawking T_H = hbar*c^3 / (8*pi*G*M*k_B) dan entropi area Bekenstein-Hawking S = k_B*A / (4*l_P^2)."
                    )
                ),
                intuitionBody = """
                    Relativitas Umum Lanjut mempelajari astrofisika objek kompak ekstrem (lubang hitam berotasi Kerr, bintang neutron termagnetisasi) serta termodinamika kuantum gravitasi horizon peristiwa.
                    
                    1. Metrik Kerr Lubang Hitam Berotasi:
                       Solusi vakum stasioner dengan simetri sumbu untuk massa M dan momentum sudut J = M*a. Dalam koordinat Boyer-Lindquist:
                       Horizon peristiwa luar terletak pada r_+ = M + sqrt(M^2 - a^2) (batas maksimum rotasi ekstremal a <= M).
                       - Ergosfer: Permukaan batas statis r_E(theta) = M + sqrt(M^2 - a^2 * cos^2(theta)).
                       Di dalam ergosfer (antara r_E dan r_+), vektor pembunuh translasi waktu xi^mu = (1, 0, 0, 0) menjadi spacelike. Materi dipaksa ikut berotasi bersama ruang-waktu (frame dragging / Lense-Thirring effect).
                       - Proses Penrose: Partikel yang pecah di dalam ergosfer dapat mengekstrak energi rotasi lubang hitam hingga 29% dari massa totalnya!
                       
                    2. Termodinamika Lubang Hitam & Radiasi Hawking:
                       Jacob Bekenstein dan Stephen Hawking menemukan korespondensi mendalam antara hukum mekanika lubang hitam dan termodinamika klasik:
                       - Hukum 0: Gravitasi permukaan kappa bernilai konstan di seluruh horizon (setara suhu T).
                       - Hukum 1: dM = (kappa / 8*pi) dA + Omega_H dJ + Phi dQ.
                       - Hukum 2: Luas area horizon peristiwa A tidak pernah berkurang (dA >= 0, setara peningkatan entropi).
                       - Suhu Hawking: Fluktuasi vakum kuantum QFT memisahkan pasangan partikel-antipartikel virtual di tepi horizon; satu partikel berenergi negatif diserap lubang hitam sementara partikel pasangannya lolos ke tak hingga sebagai radiasi termal benda hitam sejati dengan suhu:
                         T_H = hbar * c^3 / (8*pi * G * M * k_B).
                       - Entropi Bekenstein-Hawking: S_{BH} = (k_B * c^3 / 4*G*hbar) * A = k_B * A / (4 * l_P^2), sebanding dengan luas penampang horizon dalam satuan luas Planck l_P^2.
                       
                    3. Radiasi Gelombang Gravitasi Kuadrupol:
                       Sistem biner lubang hitam yang berputar spiral (inspiral) memancarkan riak kelengkungan metrik h_{mu nu} berkecepatan c.
                       Daya radiasi dipancarkan sebanding dengan turunan waktu orde tiga dari momen kuadrupol massa: P = (G / 5*c^5) * <Q_ddot_ddot^2>.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Metrik Kerr adalah solusi eksak relativitas umum paling penting di astrofisika karena hampir seluruh lubang hitam di alam semesta berotasi.",
                    "Di dalam ergosfer, ruang-waktu itu sendiri berputar melebihi kecepatan cahaya relatif terhadap pengamat jauh, menyeret semua materi ikut berputar.",
                    "Entropi Bekenstein-Hawking membuktikan bahwa kapasitas informasi maksimum suatu wilayah 3D dikodekan pada permukaan perbatasan 2D-nya (Prinsip Holografik).",
                    "Semakin kecil massa lubang hitam, semakin panas suhu radiasi Hawking-nya dan semakin cepat ia meledak dalam penguapan akhir."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Entropi dan Suhu Hawking Lubang Hitam",
                        latex = "S_{\\mathrm{BH}} = \\frac{k_B c^3 A}{4 G \\hbar} = \\frac{k_B A}{4 \\ell_P^2}, \\quad T_H = \\frac{\\hbar c^3}{8\\pi G M k_B}",
                        explanation = "Entropi lubang hitam sebanding dengan seperempat luas horizon peristiwa A dalam kuadrat panjang Planck l_P."
                    ),
                    FormulaCard(
                        title = "Rumus Kuadrupol Emisi Gelombang Gravitasi Einstein",
                        latex = "P_{\\mathrm{GW}} = \\frac{G}{5 c^5} \\left\\langle \\dddot{Q}_{ij} \\dddot{Q}^{ij} \\right\\rangle",
                        explanation = "Daya radiasi gelombang gravitasi terpancar sebanding dengan kuadrat turunan ketiga momen kuadrupol massa sistem."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Analisis Sinyal Penggabungan Biner Lubang Hitam GW150914 oleh Konsorsium Astrofisika Indonesia",
                    scenario = "Kolaborasi LIGO-Virgo mendeteksi gelombang gravitasi pertama dari penggabungan dua lubang hitam bermassa 36 dan 29 massa matahari sejauh 1.3 miliar tahun cahaya.",
                    application = "Astrofisikawan teoretis universitas nasional menganalisis bentuk gelombang chirp fase inspiral, merger, dan ringdown. Sinyal fase ringdown dicocokkan dengan frekuensi modus kuasi-normal (quasi-normal modes QNM) metrik Kerr berotasi untuk menguji Teorema Tanpa Rambut (No-Hair Theorem) Einstein, membuktikan pembentukan lubang hitam berotasi tunggal bermassa 62 massa matahari dengan spin parameter a = 0.67.",
                    impact = "Mengonfirmasi kebenaran mutlak Relativitas Umum Einstein pada rezim medan gravitasi terkuat di alam semesta."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Penyeretan Fluida Berputar (Analog Frame Dragging Ergosphere) dengan Madu / Sirup Kental",
                    objective = "Mengamati penyeretan medium kontinu di sekitar silinder yang berputar kencang sebagai analog efek Lense-Thirring ruang-waktu.",
                    materials = listOf("Mangkuk bening berisi madu kental atau gliserin", "Satu buah silinder kayu / pensil bulat yang diputar dengan bor tangan baterai atau jari", "Butiran bubuk merica atau pewarna makanan"),
                    steps = listOf(
                        "Taburkan butiran merica di permukaan madu kental di dalam mangkuk.",
                        "Celupkan silinder pensil di tengah madu dan putar silinder pada porosnya dengan kecepatan tinggi.",
                        "Amati gerakan butiran merica di sekitarnya: partikel merica yang tidak bersentuhan dengan pensil tetap terseret ikut berputar membentuk pusaran spiral vorteks.",
                        "Perhatikan bagaimana semakin dekat partikel ke silinder, kecepatan pusaran sudut fluida semakin besar.",
                        "Diskusikan analogi ini dengan ergosfer lubang hitam Kerr di mana materi terseret berputar oleh ruang-waktu yang melintir."
                    ),
                    safetyNote = "Gunakan kecepatan putar sedang agar cairan madu tidak memercik ke mata."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah yang terjadi pada massa dan temperatur suatu lubang hitam Schwarzschild seiring berjalannya waktu saat ia memancarkan Radiasi Hawking di ruang hampa?",
                        options = listOf(
                            "Massanya menyusut berkurang secara eksponensial sementara temperaturnya justru semakin meningkat memanas (kapasitas kalor negatif) hingga meledak di akhir hidupnya",
                            "Massanya bertambah dan temperaturnya membeku mendekati nol mutlak",
                            "Massa dan temperaturnya tetap konstan abadi",
                            "Lubang hitam berubah menjadi bintang raksasa merah"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Karena temperatur Hawking T_H berbanding terbalik dengan massa M (T ~ 1/M), ketika lubang hitam kehilangan massa akibat radiasi energi, suhunya justru naik (kapasitas panas negatif). Peningkatan suhu mempercepat laju radiasi daya Stefan-Boltzmann P ~ T^4 ~ 1/M^2, memicu siklus pelarian termal hingga menguap habis dalam ledakan radiasi berenergi tinggi.",
                        misconceptionAlert = "Benda termal biasa akan mendingin saat melepaskan energi, namun lubang hitam memiliki sifat anomali kapasitas panas negatif gravitasi."
                    )
                )
            )

            "fis-materi-terkondensasi-topologis" -> LessonData(
                conceptId = "fis-materi-terkondensasi-topologis",
                simId = "sim-topological-insulators-hall",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, ada material aneh yang di bagian dalam tubuhnya merupakan isolator listrik sempurna, tapi di seluruh permukaan kulit luarnya menghantarkan arus listrik tanpa hambatan sama sekali! Material apakah itu?",
                        narrativeContext = "Dimas membaca tentang Isolator Topologis (Topological Insulators) dan Hadiah Nobel Fisika 2016."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu adalah Fase Materi Topologis, Dimas! Berbeda dari klasifikasi fase klasik Landau yang berbasis pemecahan simetri, fase topologis dikarakterisasi oleh Invarian Topologis global (seperti Bilangan Chern) dari fungsi gelombang pita energi elektron.",
                        narrativeContext = "Kakek menggambarkan pita konduksi permukaan dengan arus terkunci spin-momentum tanpa hamburan balik."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan pada Efek Hall Kuantum, konduktansi Hall terkuantisasi secara presisi mutlak dalam kelipatan bulat e^2/h tanpa terpengaruh oleh kotoran cacat kristal bahan!",
                        narrativeContext = "Kirana memperlihatkan dataran plato konduktansi Hall kuantum sigma_xy = nu * e^2/h."
                    )
                ),
                intuitionBody = """
                    Fisika Materi Terkondensasi Lanjut melampaui paradigma teori pita konvensional dengan memasukkan efek korelasi elektron benda banyak dan topologi kuantum geometri Berry.
                    
                    1. Teori Cairan Fermi Landau:
                       Menjelaskan mengapa elektron yang berinteraksi kuat di dalam logam tetap berperilaku menyerupai gas elektron bebas: eksitasi dasar bukanlah elektron tunggal telanjang, melainkan 'Kuasi-Partikel' (quasiparticles) dengan massa efektif m* dan masa hidup tereduksi di dekat permukaan Fermi.
                       
                    2. Teori Fase Ginzburg-Landau (Superkonduktivitas):
                       Memodelkan parameter tatanan makroskopis psi(r) = |psi| e^(i*phi):
                       Kerapatan energi bebas f = f_n + alpha |psi|^2 + (beta/2) |psi|^4 + (1/2m*) |(-i*hbar*nabla - q*A) psi|^2 + B^2 / (2*mu_0).
                       - Panjang koherensi xi dan kedalaman penetrasi London lambda.
                       - Parameter Ginzburg-Landau kappa = lambda / xi membedakan Superkonduktor Tipe-I (kappa < 1/sqrt(2)) dari Superkonduktor Tipe-II (kappa > 1/sqrt(2)) yang mengizinkan kisi pusaran fluks Abrikosov terkuantisasi (vorteks Phi_0 = h/2e).
                       
                    3. Fase Topologis & Efek Hall Kuantum (QHE):
                       Dalam gas elektron 2D pada suhu rendah dan medan magnet kuat B:
                       - Tingkat Landau terkuantisasi E_n = (n + 1/2) hbar * omega_c.
                       - Konduktansi Hall melintang terkuantisasi sempurna pada plato: sigma_xy = nu * e^2 / h.
                       - Teorema TKNN (Thouless-Kohmoto-Nightingale-den Nijs): Bilangan pengisian nu identik dengan Invarian Topologis Bilangan Chern (C in Z) dari kelengkungan Berry F(k) yang diintegrasikan di atas Zona Brillouin torus.
                       
                    4. Isolator Topologis (Topological Insulators / TI):
                       Bahan dengan kopling spin-orbit kuat (seperti Bi2Se3, Bi2Te3).
                       - Di bagian ruah (bulk): memiliki celah pita isolator (bandgap).
                       - Di permukaan (edge/surface): pita energi memotong celah membentuk kerucut Dirac tunggal terlindungi oleh simetri pembalik waktu (Time-Reversal Symmetry / Z2 topological invariant).
                       - Arus permukaan terpolarisasi spin (spin-momentum locking): elektron dengan spin up hanya bisa bergerak ke kanan, elektron spin down hanya ke kiri, kebal terhadap hamburan balik non-magnetik (backscattering dissipationless transport).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Fase topologis tidak dapat diubah menjadi fase biasa tanpa menutup dan membuka kembali celah pita energi (transisi fase topologis).",
                    "Kuantisasi konduktansi Hall sangat presisi hingga 1 bagian dalam 1 miliar, dijadikan standar internasional penentuan resistansi Ohm.",
                    "Arus tepi isolator topologis bergerak tanpa hambatan karena elektron tidak bisa berbalik arah tanpa membalik arah spin-nya sendiri.",
                    "Fermion Majorana topologis pada kawat superkonduktor membuka gerbang komputasi kuantum topologis bebas galat derau decoherence."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Kuantisasi Konduktansi Hall & Bilangan Chern TKNN",
                        latex = "\\sigma_{xy} = C \\frac{e^2}{h}, \\quad C = \\frac{1}{2\\pi} \\int_{\\mathrm{BZ}} \\Omega(\\mathbf{k})\\,d^2k \\in \\mathbb{Z}",
                        explanation = "Konduktansi melintang Hall terkuantisasi secara eksak dalam kelipatan bilangan bulat Chern C dari kelengkungan Berry integral."
                    ),
                    FormulaCard(
                        title = "Flukson Vorteks Superkonduktor Terkuantisasi Abrikosov",
                        latex = "\\Phi_0 = \\frac{h}{2e} \\approx 2.07 \\times 10^{-15}\\,\\mathrm{Wb}",
                        explanation = "Kuantum fluks magnetik yang menembus inti setiap vorteks superkonduktor tipe-II."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Karakterisasi Kristal Isolator Topologis Bismuth Telluride di BRIN Serpong",
                    scenario = "Pusat Riset Material Maju BRIN menumbuhkan kristal tunggal Bismuth Telluride (Bi2Te3) menggunakan metode Bridgman untuk komponen spintronika generasi baru.",
                    application = "Fisikawan zat padat menguji mobilitas elektron tepi permukaan pada suhu kriogenik 4 Kelvin di bawah medan magnet hingga 9 Tesla. Pengukuran resistansi magnetik membuktikan keberadaan osilasi Shubnikov-de Haas dengan fase Berry pi, mengonfirmasi keberadaan fermion Dirac relativistik tak bermassa pada permukaan kristal yang terproteksi simetri pembalik waktu.",
                    impact = "Membuka rute pengembangan mikroprosesor spintronika rendah disipasi panas berkecepatan terahertz masa depan."
                ),
                homeLab = HomeLabData(
                    title = "Analogi Topologi Fase Memutar Karet Gelang & Invarian Puntiran",
                    objective = "Memahami konsep invarian topologis diskrit yang tidak berubah di bawah deformasi kontinu halus.",
                    materials = listOf("Dua buah karet gelang elastis", "Spidol"),
                    steps = listOf(
                        "Pegang karet gelang 1 tanpa dipuntir (keadaan trivial, bilangan lilitan N = 0).",
                        "Puntir karet gelang 2 satu putaran penuh 360 derajat (keadaan topologis, N = 1).",
                        "Tarik, regangkan, dan tekuk kedua karet gelang tanpa memutus atau melepas pegangan jari.",
                        "Buktikan bahwa betapapun karet diregangkan atau digoyang, karet gelang 2 tidak akan pernah bisa kembali menjadi karet gelang 1 tanpa memotongnya (transisi fase topologis).",
                        "Diskusikan analogi bilangan lilitan diskrit ini dengan bilangan Chern pada isolator topologis."
                    ),
                    safetyNote = "Gunakan karet gelang biasa dengan tarikan aman agar tidak terpelanting."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah yang menyebabkan arus listrik pada permukaan isolator topologis (topological insulators) kebal terhadap hamburan balik oleh cacat kristal non-magnetik?",
                        options = listOf(
                            "Fenomena penguncian spin-momentum (spin-momentum locking): elektron yang bergerak ke depan memiliki orientasi spin tertentu, sehingga untuk berbalik arah ke belakang spin-nya harus terbalik—sesuatu yang dilarang oleh simetri pembalik waktu (Time-Reversal Symmetry)",
                            "Karena permukaan kristal dilapisi minyak pelumas khusus",
                            "Karena elektron bergerak dengan kecepatan cahaya di udara",
                            "Karena cacat kristal menyerap seluruh muatan listrik"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Dalam isolator topologis, kopling spin-orbit mengunci arah momentum k dengan arah spin Pauli sigma. Pengotor non-magnetik tidak memecah simetri pembalik waktu (T-symmetry), sehingga hamburan balik 180 derajat (dari k ke -k) mengalami interferensi kuantum destruktif total, membuat arus listrik merambat tanpa hambatan termal.",
                        misconceptionAlert = "Jika dimasukkan pengotor magnetik (seperti atom besi atau kromium), simetri pembalik waktu terpecah dan celah permukaan terbuka sehingga sifat kebal hamburan hilang."
                    )
                )
            )

            "fis-teori-string-gravitasi-kuantum" -> LessonData(
                conceptId = "fis-teori-string-gravitasi-kuantum",
                simId = "sim-string-ads-cft-duality",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, jika mekanika kuantum dan relativitas umum digabungkan secara langsung pada jarak sangat kecil skala Planck (10^-35 m), persamaan menghasilkan probabilitas tak terhingga yang tak masuk akal. Mengapa?",
                        narrativeContext = "Dimas memikirkan gejolak kuantum busa ruang-waktu (spacetime foam) John Wheeler."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena kita memperlakukan partikel sebagai titik nol dimensi! Pada jarak Planck, interaksi titik memicu energi tak terhingga. Teori String mengganti partikel titik dengan dawai bergetar berdimensi 1 (string) sepanjang panjang Planck l_s.",
                        narrativeContext = "Kakek menggambarkan modus getaran dawai tertutup yang memunculkan partikel Graviton bermassa nol dan spin 2."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan salah satu penemuan terdahsyat fisika teori abad ke-21 adalah Korespondensi AdS/CFT Juan Maldacena: teori gravitasi kuantum di dalam ruang 5 dimensi terbukti ekuivalen persis dengan teori medan kuantum tanpa gravitasi di batas permukaan 4 dimensinya!",
                        narrativeContext = "Kirana memperlihatkan ilustrasi tabung ruang Anti-de Sitter dan batas holografik konformal."
                    )
                ),
                intuitionBody = """
                    Gravitasi Kuantum mencari unifikasi agung antara Relativitas Umum Einstein dan Mekanika Kuantum pada Skala Planck (l_P ~ 1.6 x 10^(-35) m, M_P ~ 1.2 x 10^19 GeV).
                    
                    1. Tindakan Polyakov & Spektrum Dawai (String Theory):
                       Alih-alih garis dunia partikel titik, dawai 1D menyapu lembaran dunia 2D (worldsheet) berparameter (tau, sigma).
                       Tindakan Polyakov: S = -(T / 2) * integral d^2sigma sqrt(-h) * h^{ab} * partial_a X^mu * partial_b X^nu * eta_{mu nu}.
                       Konsistensi mekanika kuantum mengharuskan pembatalan anomali konformal Weyl:
                       - Teori Dawai Bosonik menuntut ruang-waktu berdimensi D = 26.
                       - Teori Superstring (menyertakan supersimetri fermion-boson) menuntut ruang-waktu berdimensi D = 10.
                       Modus getaran dawai terbuka melahirkan foton dan boson tera tera (spin 1); modus getaran dawai tertutup secara otomatis melahirkan Graviton (spin 2 tak bermassa), membuktikan bahwa gravitasi muncul secara niscaya dalam teori dawai!
                       
                    2. Revolusi Superstring Kedua & Teori-M 11 Dimensi:
                       Edward Witten (1995) membuktikan bahwa lima teori superstring yang berbeda (Tipe I, Tipe IIA, Tipe IIB, Heterotik SO(32), dan Heterotik E8xE8) terhubung oleh jaringan dualitas kuat-lemah (S-duality) dan dualitas jari-jari besar-kecil (T-duality), bersatu di bawah satu payung agung: Teori-M dalam 11 dimensi dengan objek membran 2D (M2-brane) dan 5D (M5-brane).
                       Kompaktifikasi 6 dimensi ekstra melengkung ke dalam Manifold Calabi-Yau menentukan spektroskopi massa dan fisika partikel 4D berenergi rendah.
                       
                    3. Korespondensi AdS/CFT (Holographic Duality):
                       Dualitas antara Teori Gravitasi Superstring Tipe IIB pada latar belakang ruang Anti-de Sitter dikalikan bola (AdS_5 x S^5) dengan Teori Medan Konformal Super Yang-Mills N=4 tanpa gravitasi pada batas perbatasan 4D Minkowski:
                       Z_gravitasi[phi_batas] = < exp(integral O * phi_batas) >_CFT.
                       Dualitas kuat-lemah: masalah gravitasi kuantum yang sulit diselesaikan dengan teori medan konformal yang mudah, dan sebaliknya (analisis plasma kuark-gluon dengan viskositas minimum eta/s = hbar / (4*pi*k_B)).
                       
                    4. Loop Quantum Gravity (LQG):
                       Pendekatan alternatif non-perturbatif bebas latar belakang (background-independent). Ruang-waktu tidak diasumsikan kontinu, melainkan terkuantisasi menjadi simpul-simpul berbobot spin (Jejaring Spin / Spin Networks) dengan kuanta luas terkecil A_min ~ l_P^2 dan kuanta volume diskrit.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Teori string tidak memasukkan gravitasi secara sengaja; gravitasi muncul secara otomatis dari getaran dawai tertutup.",
                    "Panjang dawai yang berhingga menghaluskan singularitas titik, menghilangkan divergensi ultraviolet tak terhingga.",
                    "Korespondensi AdS/CFT merealisasikan Prinsip Holografik: alam semesta berdimensi lebih tinggi dapat dideskripsikan seutuhnya oleh proyeksi informasi di perbatasannya.",
                    "LQG meramalkan bahwa pada skala Planck, ruang bukanlah kain mulus melainkan anyaman diskrit simpul-simpul kuantum terkuantisasi."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Tindakan Lembaran Dunia Polyakov Teori Dawai",
                        latex = "S_P = -\\frac{T}{2} \\int d^2\\sigma \\sqrt{-h} h^{ab} \\partial_a X^\\mu \\partial_b X^\\nu g_{\\mu\\nu}(X)",
                        explanation = "Tindakan invarian difeomorfisma dan Weyl 2D yang menggambarkan dinamika dawai relativistik bertegangan T."
                    ),
                    FormulaCard(
                        title = "Batas Bawah Viskositas Geser Holografik KSS",
                        latex = "\\frac{\\eta}{s} \\ge \\frac{\\hbar}{4\\pi k_B}",
                        explanation = "Batas rasio viskositas geser terhadap kerapatan entropi (Kovtun-Son-Starinets) untuk fluida terkopel kuat turunan dari dualitas gravitasi AdS/CFT."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Aplikasi Dualitas Holografik AdS/CFT pada Viskositas Plasma Quark-Gluon Eksperimen RHIC/LHC",
                    scenario = "Fisikawan nuklir energi tinggi mengukur aliran hidrodinamika plasma kuark-gluon (QGP) cair sempurna sesaat setelah dentuman tumbukan ion berat.",
                    application = "Menggunakan korespondensi holografik AdS/CFT, fisikawan memetakan plasma fluida terkopel kuat di batas 4D ke lubang hitam AdS 5D. Perhitungan gravitasi menghasilkan rasio viskositas geser terhadap kerapatan entropi eta/s = hbar / (4*pi*k_B) = 0.08, yang cocok dengan data eksperimental RHIC bahwa plasma primordial QGP mengalir laksana fluida paling sempurna di alam semesta tanpa hambatan internal.",
                    impact = "Membuktikan kegunaan praktis teori string gravitasi kuantum dalam memecahkan masalah fisika zat pekat eksperimental nyata."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Modus Getaran Harmonik Senar Dawai Gitar sebagai Analog Partikel Elementer",
                    objective = "Mengamati bagaimana perbedaan modus gelombang berdiri pada satu dawai fisik tunggal menghasilkan frekuensi nada yang berbeda.",
                    materials = listOf("Gitar akustik atau dawai senar yang direntangkan pada papan kayu", "Aplikasi penganalisis frekuensi audio ponsel"),
                    steps = listOf(
                        "Petik senar terbuka; catat nada dasar frekuensi fundamental f1 (analog keadaan dasar partikel tachton/foton).",
                        "Sentuh lembut titik tengah senar tepat di fret 12 (node) sambil memetik; bunyikan nada harmonik kedua f2 = 2*f1.",
                        "Sentuh sepertiga senar di fret 7; bunyikan nada harmonik ketiga f3 = 3*f1.",
                        "Diskusikan analogi Teori String: dawai kuantum fundamental yang identik dapat bervibrasi dalam berbagai modus eigen Harmonik; modus vibrasi tertentu teramati oleh pengamat makroskopis sebagai elektron, modus lain sebagai foton, dan modus simetris tertutup sebagai graviton!"
                    ),
                    safetyNote = "Praktikum akustik dawai senar yang aman dan musikal."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Partikel fundamental manakah yang secara niscaya dan alami selalu muncul di dalam spektrum getaran modus tertutup (closed string) Teori Dawai?",
                        options = listOf(
                            "Graviton: boson bermassa nol dengan spin 2 yang memediasi gaya gravitasi",
                            "Proton bermuatan positif",
                            "Foton gelombang mikro",
                            "Elektron bermassa 0.511 MeV"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Kondisi invarian konformal pada kuantisasi dawai tertutup mengharuskan eksistensi keadaan simetris tak bermassa ber-spin 2 (tensor kuadrupollar h_{mu nu}). Keadaan ini secara tepat memenuhi persamaan gravitasi Einstein berenergi rendah, membuktikan bahwa teori string adalah teori gravitasi kuantum yang menyatukan gravitasi secara niscaya.",
                        misconceptionAlert = "Teori dawai terbuka hanya menghasilkan boson tera spin-1 (seperti foton), gravitasi hanya muncul ketika dawai membentuk loop tertutup."
                    )
                )
            )

            "fis-informasi-komputasi-kuantum" -> LessonData(
                conceptId = "fis-informasi-komputasi-kuantum",
                simId = "sim-quantum-computing-bloch",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, komputer super saat ini membutuhkan waktu miliaran tahun untuk memfaktorkan bilangan 2048-bit kunci enkripsi RSA. Mengapa komputer kuantum bisa menyelesaikannya dalam beberapa jam?",
                        narrativeContext = "Dimas membaca tentang komputer kuantum superkonduktor IBM dan Google Quantum AI."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena komputer kuantum memanfaatkan Superposisi Linear dan Keterikatan Kuantum (Entanglement), Dimas! Bila bit klasik hanya bernilai 0 ATAU 1, Qubit dapat berada dalam superposisi keduanya sekaligus di permukaan Bola Bloch.",
                        narrativeContext = "Kakek menggambarkan vektor keadaan |psi> = cos(theta/2)|0> + e^(i*phi)*sin(theta/2)|1>."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan Algoritma Shor mengeksploitasi Interferensi Kuantum Transformasi Fourier Kuantum (QFT) sehingga seluruh jawaban salah saling membatalkan secara destruktif, menyisakan periode eksak faktor bilangan secara konstruktif!",
                        narrativeContext = "Kirana memperlihatkan sirkuit gerbang kuantum Hadamard, CNOT, dan fase terpandu."
                    )
                ),
                intuitionBody = """
                    Informasi dan Komputasi Kuantum mempelajari pemrosesan informasi berbasis prinsip-prinsip mekanika kuantum, melahirkan lompatan eksponensial dalam daya komputasi dan kriptografi kuantum mutlak aman.
                    
                    1. Konsep Qubit & Bola Bloch:
                       Qubit adalah sistem kuantum dua tingkat: |psi> = alpha |0> + beta |1>, dengan |alpha|^2 + |beta|^2 = 1.
                       Geometris Bola Bloch: |psi> = cos(theta/2) |0> + e^(i*phi) sin(theta/2) |1>.
                       - Registri N-qubit mampu merepresentasikan 2^N keadaan kuantum secara superposisi serentak dalam ruang Hilbert berdimensi 2^N.
                       
                    2. Keterikatan Kuantum (Entanglement) & Pertidaksamaan Bell:
                       Keadaan Bell terikat maksimal (misal |Phi+> = 1/sqrt(2) (|00> + |11>)) tidak dapat difaktorisasi menjadi perkalian tensor dua partikel independen (|psi_A> (x) |psi_B>).
                       Pengukuran pada satu qubit secara instan meruntuhkan keadaan qubit pasangannya di mana pun ia berada.
                       Uji Pertidaksamaan Bell-CHSH (|S| <= 2 untuk realisme lokal klasik vs |S| = 2*sqrt(2) ~ 2.828 untuk batas Tsirelson kuantum) membuktikan bahwa alam semesta kita secara fundamental tidak bersifat realistik lokal.
                       
                    3. Gerbang Logika Kuantum & Universalitas:
                       - Gerbang Satu Qubit: Gerbang Pauli (X, Y, Z), Gerbang Hadamard H (menciptakan superposisi seimbang), Gerbang Fase S dan T.
                       - Gerbang Dua Qubit Terbelit: Gerbang Controlled-NOT (CNOT) membalik target jika kontrol bernilai 1.
                       Himpunan gerbang {H, T, CNOT} bersifat universal: dapat mengaproksimasi sebarang operasi kesatuan uniter U pada ruang Hilbert dengan presisi sebarang (Teorema Solovay-Kitaev).
                       
                    4. Algoritma Kuantum & Koreksi Galat:
                       - Algoritma Deutsch-Jozsa: Mengevaluasi sifat fungsi dalam satu evaluasi tunggal (orakel).
                       - Algoritma Shor: Memfaktorkan bilangan bulat besar N dalam waktu polinomial O((log N)^3) menggunakan Transformasi Fourier Kuantum (QFT).
                       - Algoritma Grover: Pencarian pada basis data tak terstruktur dengan percepatan kuadratik O(sqrt(N)).
                       - Teorema Tanpa Kloning (No-Cloning Theorem): Informasi kuantum yang tidak diketahui mustahil disalin secara eksak.
                       - Kode Koreksi Galat Permukaan (Surface Codes): Mengoreksi galat bit-flip (X) dan phase-flip (Z) melalui pengukuran sindrom stabilizer tanpa merusak superposisi data.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Superposisi 50 qubit memuat 2^50 ~ 1 kuadriliun bilangan secara bersamaan dalam satu keadaan kuantum terpadu.",
                    "Teorema Tanpa Kloning adalah pisau bermata dua: melindungi protokol kriptografi kuantum (QKD BB84) dari penyadapan, namun membuat koreksi galat jauh lebih rumit daripada duplikasi bit klasik.",
                    "Komputasi kuantum bukanlah mencoba semua kombinasi secara paralel membabi buta, melainkan memanfaatkan interferensi gelombang konstruktif untuk memperbesar amplitudo probabilitas jawaban yang benar.",
                    "Pemberantasan decoherence kebisingan termal lingkungan adalah rintangan teknik terbesar dalam membangun komputer kuantum skala toleran galat (fault-tolerant)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Representasi Vektor Keadaan Qubit Bola Bloch",
                        latex = "|\\psi\\rangle = \\cos\\left(\\frac{\\theta}{2}\\right)|0\\rangle + e^{i\\phi} \\sin\\left(\\frac{\\theta}{2}\\right)|1\\rangle",
                        explanation = "Memetakan sebarang keadaan qubit murni ke titik permukaan bola satuan 3D berparameter sudut polar theta dan azimut phi."
                    ),
                    FormulaCard(
                        title = "Pelanggaran Batas Pertidaksamaan Bell-CHSH",
                        latex = "S_{\\mathrm{CHSH}} = |E(a, b) - E(a, b') + E(a', b) + E(a', b')| \\le 2 \\xrightarrow{\\text{Kuantum}} 2\\sqrt{2} \\approx 2.828",
                        explanation = "Batas korelasi klasik lokal Bell bernilai 2, dilanggar secara spektakuler oleh mekanika kuantum hingga batas Tsirelson 2.828."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Inisiatif Riset Komputasi Kuantum & Distribusi Kunci Kuantum (QKD) BRIN-ITB",
                    scenario = "Badan Riset dan Inovasi Nasional (BRIN) mengembangkan sistem komunikasi kuantum aman berjarak jauh antar-pulau memanfaatkan satelit optik.",
                    application = "Tim peneliti fisika kuantum mengimplementasikan protokol Quantum Key Distribution (QKD) BB84 menggunakan pasangan foton terbelit (polarization-entangled photons). Pengujian pelanggaran pertidaksamaan Bell dilakukan di stasiun bumi untuk mendeteksi keberadaan penyadap (eavesdropper) secara real-time; setiap upaya intersepsi sinyal optik secara otomatis merusak korelasi kuantum dan membatalkan pertukaran kunci rahasia.",
                    impact = "Membangun fondasi infrastruktur keamanan siber pasca-kuantum nasional yang terlindungi dari ancaman komputasi kuantum masa depan."
                ),
                homeLab = HomeLabData(
                    title = "Eksplorasi Pemrograman Sirkuit Komputer Kuantum Nyata Menggunakan IBM Quantum Composer Cloud",
                    objective = "Merancang sirkuit Bell state kuantum pertama dan menjalankannya secara gratis pada prosesor kuantum superkonduktor IBM.",
                    materials = listOf("Komputer / Laptop dengan peramban web", "Akun gratis di quantum.ibm.com (IBM Quantum Platform)"),
                    steps = listOf(
                        "Buka platform IBM Quantum Composer di browser.",
                        "Seret gerbang Hadamard (H) ke garis Qubit 0 (membuat superposisi |0> + |1>).",
                        "Seret gerbang CNOT dengan kontrol di Qubit 0 dan target di Qubit 1 (menghasilkan keadaan terbelit Bell State |Phi+>).",
                        "Pasang simbol pengukuran pada kedua qubit.",
                        "Jalankan simulasi ideal: amati bahwa hasil pengukuran hanya menghasilkan '00' (50%) dan '11' (50%) tanpa pernah menghasilkan '01' atau '10'.",
                        "Kirim sirkuit ke prosesor kuantum nyata (QPU); amati sedikit galat derau eksperimental riil."
                    ),
                    safetyNote = "Praktikum pemrograman kuantum cloud, sepenuhnya aman dan canggih."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah yang dinyatakan oleh Teorema Tanpa Kloning (No-Cloning Theorem) dalam teori informasi kuantum?",
                        options = listOf(
                            "Mustahil menciptakan salinan persis yang identik dari suatu keadaan kuantum yang tidak diketahui secara sembarang tanpa merusak keadaan aslinya",
                            "Komputer kuantum tidak boleh memiliki dua prosesor",
                            "Kloning hewan mamalia dilarang oleh hukum fisika",
                            "Qubit hanya boleh digunakan satu kali seumur hidup"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Berdasarkan sifat linearitas operator uniter U dalam mekanika kuantum, tidak ada operator uniter U yang dapat memenuhi U(|psi>|0>) = |psi>|psi> untuk semua keadaan |psi> sembarang. Hal ini menjamin bahwa informasi kuantum unik dan tidak dapat digandakan secara sembunyi-sembunyi oleh penyadap, menjadi fondasi keamanan kriptografi kuantum.",
                        misconceptionAlert = "Keadaan kuantum orthogonal yang diketahui dapat disalin, yang dilarang adalah menyalin keadaan kuantum superposisi sebarang yang belum diketahui."
                    )
                )
            )

            "fis-partikel-energi-tinggi-bsm" -> LessonData(
                conceptId = "fis-partikel-energi-tinggi-bsm",
                simId = "sim-high-energy-bsm-neutrino",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, Model Standar fisika partikel sudah sangat sukses dan boson Higgs telah ditemukan pada tahun 2012. Mengapa para fisikawan masih mencari fisika baru 'Beyond the Standard Model' (BSM)?",
                        narrativeContext = "Dimas melihat terowongan melingkar akselerator partikel raksasa LHC sepanjang 27 km di bawah tanah."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena Model Standar menyisakan teka-teki raksasa yang belum terpecahkan, Dimas! Model Standar tidak menjelaskan apa itu Materi Gelap, tidak memuat gaya gravitasi, dan mengasumsikan massa neutrino bernilai nol—padahal eksperimen membuktikan neutrino memiliki massa!",
                        narrativeContext = "Kakek menggambarkan fenomena osilasi flavor neutrino saat melintasi bumi."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk menjelaskan massa neutrino yang sangat kecil tersebut, Mekanisme Seesaw memperkenalkan neutrino steril bermassa raksasa, sementara teori Supersimetri (SUSY) dan Teori Unifikasi Agung (GUT) memprediksi unifikasi ketiga gaya pada energi 10^16 GeV!",
                        narrativeContext = "Kirana memaparkan matriks pencampuran PMNS dan konvergensi konstanta kopling tera."
                    )
                ),
                intuitionBody = """
                    Fisika Partikel Energi Tinggi mengeksplorasi batasan Model Standar melalui eksperimen kolider hadron energi tinggi dan observatorium neutrino bawah tanah untuk mencari fisika baru di luar Model Standar (BSM).
                    
                    1. Misteri Massa & Osilasi Neutrino:
                       Dalam Model Standar murni, neutrino diasumsikan tak bermassa dan hanya memiliki helisitas kidal. Namun eksperimen Super-Kamiokande dan SNO membuktikan bahwa neutrino mengalami Osilasi Flavor (elektron, muon, tau neutrino saling bertransisi saat merambat):
                       P(nu_alpha -> nu_beta) = sin^2(2*theta) * sin^2(1.27 * Delta_m^2 * L / E).
                       Keadaan eigen flavor terhubung ke keadaan eigen massa melalui Matriks Pontecorvo-Maki-Nakagawa-Sakata (PMNS).
                       Mekanisme Seesaw (Jungkat-Jungkit Tipe I): Mengaitkan massa neutrino aktif yang sangat kecil (m_nu ~ y_nu^2 * v^2 / M_R < 0.1 eV) dengan keberadaan neutrino steril kanan bermassa sangat masif pada skala GUT (M_R ~ 10^14 GeV).
                       
                    2. Masalah Hierarki & Supersimetri (SUSY):
                       Massa boson Higgs (125 GeV) secara teoritis tidak stabil terhadap koreksi loop radiatif QFT berenergi Planck, membutuhkan penalaan halus (fine-tuning) 1 banding 10^34 (Masalah Hierarki).
                       Supersimetri mempostulatkan simetri antara fermion dan boson: setiap partikel materi memiliki pasangan super-partikel (sparticle: kuark -> skwark, elektron -> selektron, foton -> fotino). Loop boson dan fermion saling membatalkan secara eksak, menstabilkan massa Higgs.
                       Partikel Supersimetris Teringan yang Stabil (LSP / Netralino) menjadi kandidat utama materi gelap dingin (WIMP).
                       
                    3. Teori Unifikasi Agung (Grand Unified Theories / GUT):
                       Menyatukan gaya kuat SU(3), lemah SU(2), dan hipermuatan U(1) ke dalam satu grup simetri tunggal (seperti SU(5) atau SO(10)) pada skala energi 10^16 GeV. Memprediksi ketidakstabilan proton (peluruhan proton p -> e+ + pi0 dengan umur paruh > 10^34 tahun).
                       
                    4. Pencarian Kandidat Materi Gelap (Dark Matter):
                       - WIMP (Weakly Interacting Massive Particles): Massa 10 GeV - 10 TeV, dideteksi melalui hamburan balik nuklir langsung (XENONnT, LUX-ZEPLIN) dalam tangki cairan xenon di bawah gunung.
                       - Axion: Partikel boson sangat ringan (mikro-eV) yang diajukan oleh Roberto Peccei dan Helen Quinn untuk menyelesaikan Masalah CP Kuat pada QCD, dideteksi melalui konversi resonansi axion menjadi foton di dalam medan magnet kuat (eksperimen rongga gelombang mikro ADMX).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Osilasi neutrino adalah bukti eksperimental definitif pertama yang membuktikan kegagalan Model Standar murni.",
                    "Mekanisme Seesaw menjelaskan secara elegan mengapa massa neutrino satu miliar kali lebih ringan dibandingkan massa elektron.",
                    "Tanpa materi gelap non-barionik, gravitasi kosmis tidak akan cukup kuat untuk menggumpalkan materi membentuk galaksi dan tata surya kita.",
                    "Pencarian peluruhan proton dan hamburan materi gelap membutuhkan laboratorium bawah tanah terdalam untuk melindungi detektor dari derau sinar kosmik."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Probabilitas Osilasi Dua Flavor Neutrino",
                        latex = "P(\\nu_\\alpha \\to \\nu_\\beta) = \\sin^2(2\\theta) \\sin^2\\left( \\frac{\\Delta m^2 L}{4 E} \\right) \\approx \\sin^2(2\\theta) \\sin^2\\left( 1.27 \\frac{\\Delta m^2 [\\mathrm{eV}^2] L [\\mathrm{km}]}{E [\\mathrm{GeV}]} \\right)",
                        explanation = "Probabilitas transisi flavor neutrino bergantung pada sudut pencampuran theta, selisih kuadrat massa Delta_m^2, jarak L, dan energi neutrino E."
                    ),
                    FormulaCard(
                        title = "Mekanisme Seesaw Massa Neutrino",
                        latex = "m_\\nu \\approx \\frac{m_D^2}{M_R} = \\frac{(y_\\nu v)^2}{M_R}",
                        explanation = "Massa neutrino kidal m_nu tertekan menjadi sangat kecil karena berbanding terbalik dengan massa neutrino Majorana kanan M_R yang berskala sangat masif."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Eksplorasi Deteksi Neutrino Atmosfer dan Peluruhan Partikel Eksperimen Super-Kamiokande",
                    scenario = "Detektor Super-Kamiokande di Jepang (tangki berisi 50.000 ton air ultra-murni dengan 11.000 tabung pengganda foton PMT di kedalaman 1 km di bawah tambang) mendeteksi radiasi Cherenkov cincin elektron dan muon.",
                    application = "Fisikawan mendeteksi defisit fluks neutrino muon yang datang menembus bumi dari sisi belahan bumi selatan dibandingkan neutrino dari atmosfer atas langsung. Analisis data membuktikan osilasi neutrino muon menjadi neutrino tau di sepanjang diameter bumi 13.000 km, memenangkan Hadiah Nobel Fisika 2015 dan memvalidasi matriks pencampuran leptonik PMNS.",
                    impact = "Membuka era baru fisika partikel presisi dan membuka misteri dominasi materi atas anti-materi (Leptogenesis) di alam semesta."
                ),
                homeLab = HomeLabData(
                    title = "Analogi Model Osilasi Neutrino Menggunakan Dua Bandul Terkopel Pegas Lemah",
                    objective = "Mengamati transfer energi periodik bolak-balik antara dua osilator sebagai representasi transisi keadaan eigen flavor massa.",
                    materials = listOf("Dua buah bandul sederhana dengan panjang tali dan massa yang sama persis", "Satu pegas sangat lentur / karet gelang tipis yang menghubungkan kedua tali", "Penyangga meja"),
                    steps = listOf(
                        "Gantung kedua bandul berdampingan berjarak 15 cm; hubungkan kedua tali di bagian tengah dengan karet gelang tipis.",
                        "Tahan bandul B agar diam, ayunkan bandul A (analog terciptanya neutrino elektron murni pada t = 0).",
                        "Lepaskan kedua bandul dan amati ayunan keduanya terhadap waktu.",
                        "Amati fenomena transfer modulasi: amplitudo bandul A berangsur-angsur mengecil hingga berhenti total, sementara bandul B berayun maksimal (transformasi flavor 100% menjadi neutrino muon!).",
                        "Kemudian energi berpindah kembali ke bandul A; catat periode waktu osilasi transfer sebagai analogi panjang gelombang osilasi neutrino."
                    ),
                    safetyNote = "Praktikum mekanika klasik meja kerja, aman dan sangat visual."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Fakta eksperimental apakah yang membuktikan secara tak terbantahkan bahwa neutrino memiliki massa riil (meskipun sangat kecil), yang berkontradiksi dengan Model Standar murni?",
                        options = listOf(
                            "Fenomena osilasi flavor neutrino (perubahan tipe neutrino saat merambat), yang mensyaratkan adanya selisih kuadrat massa (Delta_m^2 != 0)",
                            "Neutrino dapat dilihat dengan mata telanjang di siang hari",
                            "Neutrino meledak saat terkena air",
                            "Neutrino memiliki muatan listrik positif"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Osilasi neutrino hanya dapat terjadi jika keadaan eigen massa neutrino berbeda dari keadaan eigen interaksi lemah (flavor), dan fase kuantum gelombangnya merambat dengan laju berbeda yang mensyaratkan selisih kuadrat massa Delta_m^2 = m2^2 - m1^2 != 0. Jika seluruh neutrino bermassa nol, laju rambatnya identik (kecepatan c) sehingga fase tidak pernah bergeser dan osilasi mustahil terjadi.",
                        misconceptionAlert = "Osilasi neutrino mengukur selisih kuadrat massa Delta_m^2, bukan massa absolutnya secara langsung; penentuan massa absolut dilakukan lewat peluruhan beta tritium."
                    )
                )
            )

            "fis-statistik-non-ekuilibrium-langevin" -> LessonData(
                conceptId = "fis-statistik-non-ekuilibrium-langevin",
                simId = "sim-langevin-fokker-planck",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, serbuk sari atau partikel koloid di dalam air terus-menerus bergerak zigzag secara acak tak beraturan tanpa henti. Bagaimana kita merumuskan hukum gerak mekanika partikel jika gaya tumbukannya bersifat acak?",
                        narrativeContext = "Dimas mengamati gerak Brown partikel suspensi susu di bawah mikroskop."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Paul Langevin menyelesaikannya dengan Persamaan Diferensial Stokastik! Gaya total diurai menjadi gaya gesekan viskos teratur yang mendisipasi energi, ditambah gaya fluktuasi acak Gaussian xi(t) yang dihasilkan oleh miliaran tumbukan molekul air.",
                        narrativeContext = "Kakek menuliskan Teorema Fluktuasi-Disipasi Einstein: laju difusi sebanding dengan suhu dan gesekan fluida."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan bila kita ingin melihat evolusi distribusi kerapatan probabilitas seluruh populasi partikel tersebut di dalam ruang dan waktu, kita beralih ke Persamaan Fokker-Planck!",
                        narrativeContext = "Kirana memplot penyebaran kurva probabilitas P(x, t) yang bergeser menuruni lereng potensial."
                    )
                ),
                intuitionBody = """
                    Fisika Statistik Non-Ekuilibrium mempelajari sistem termodinamika dinamis di luar kesetimbangan termal: proses transpor, dinamika stokastik partikel Brown, dan materi aktif biologis.
                    
                    1. Persamaan Langevin & Teorema Fluktuasi-Disipasi:
                       Dinamika partikel bermassa m yang mengalami gaya luar potensial F_ext, gaya gesek viskos Stokes -gamma*v, dan gaya tumbukan termal acak xi(t):
                       m * dv/dt = -gamma * v + F_ext(x) + xi(t).
                       Gaya termal xi(t) diasumsikan sebagai proses derau putih Gaussian (White Noise):
                       <xi(t)> = 0 dan <xi(t) xi(t')> = 2 * gamma * k_B * T * delta(t - t').
                       Teorema Fluktuasi-Disipasi Einstein: Besarnya intensitas fluktuasi acak termal berkaitan secara intrinsik dengan koefisien disipasi gesekan gamma pada suhu T. Koefisien difusi D = k_B * T / gamma.
                       
                    2. Persamaan Fokker-Planck:
                       Mengubah perspektif dari lintasan partikel individual stokastik (Langevin) menjadi persamaan diferensial parsial deterministik yang mengatur kerapatan probabilitas P(x, v, t):
                       partial(P)/partial(t) = -partial/partial(x) [ D1(x) P ] + partial^2/partial(x^2) [ D2(x) P ].
                       - D1(x) adalah koefisien hanyutan (drift).
                       - D2(x) adalah koefisien difusi spasial.
                       Pada keadaan tunak t -> inf, solusi mereduksi kembali menjadi distribusi kanonik Boltzmann-Gibbs P_eq ~ exp(-V(x)/k_B*T).
                       
                    3. Teorema Fluktuasi Kerja Jarzynski:
                       Salah satu hukum termodinamika non-ekuilibrium paling fundamental (1997):
                       Menghubungkan kerja non-ekuilibrium W yang dilakukan pada sistem mikroskopis yang digerakkan secara sembarang cepat dengan perbedaan energi bebas kesetimbangan Delta_F:
                       < exp(-W / k_B*T) > = exp(-Delta_F / k_B*T).
                       Melalui ketaksamaan Jensen, teorema ini secara langsung menurunkan Hukum Kedua Termodinamika klasik: <W> >= Delta_F.
                       
                    4. Sistem Materi Aktif (Active Matter):
                       Koleksi agen individual (bakteri perenang, burung terbang membentuk kawanan, motor molekuler) yang secara internal mengkonsumsi energi metabolik untuk menghasilkan gerak mandiri di luar kesetimbangan termal (self-propelled particles / model Vicsek), menunjukkan transisi fase kolektif tanpa adanya gaya koordinasi sentral.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Gaya gesek yang memperlambat partikel dan gaya acak yang mengguncangnya berasal dari satu sumber mikroskopis yang sama: tumbukan molekul medium pelarut.",
                    "Pada skala mikroskopis nanometer, fluktuasi termal begitu dahsyat sehingga hukum kedua termodinamika dapat terlanggar sesaat untuk lintasan individual tunggal, namun tetap berlaku rata-rata melalui kesetaraan Jarzynski.",
                    "Persamaan Fokker-Planck memetakan gerak acak partikel menjadi persamaan kontinuitas probabilitas kekal.",
                    "Materi aktif melanggar kesetimbangan detail termodinamika, memunculkan fenomena pusaran kolektif dan pemisahan fase yang diinduksi oleh motilitas (MIPS)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Gerak Stokastik Langevin",
                        latex = "m \\frac{dv}{dt} = -\\gamma v - \\nabla V(x) + \\xi(t), \\quad \\langle \\xi(t) \\xi(t') \\rangle = 2 \\gamma k_B T \\delta(t - t')",
                        explanation = "Persamaan diferensial stokastik Newton dengan peredaman viskos Stokes dan gaya fluktuasi termal derau putih Gaussian."
                    ),
                    FormulaCard(
                        title = "Kesetaraan Kerja Non-Ekuilibrium Jarzynski",
                        latex = "\\left\\langle e^{-W / k_B T} \\right\\rangle = e^{-\\Delta F / k_B T}",
                        explanation = "Menghubungkan rata-rata eksponensial kerja W yang diukur pada proses non-ekuilibrium cepat dengan perbedaan energi bebas kesetimbangan sejati Delta_F."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pengukuran Termodinamika Energi Bebas Pelipatan Molekul Tunggal RNA dengan Pinset Optik ITB",
                    scenario = "Laboratorium biofisika molekuler menarik seuntai molekul hairpin RNA tunggal menggunakan manik-manik polistirena yang ditahan oleh sinar laser pinset optik.",
                    application = "Peneliti menarik molekul RNA bolak-balik dengan kecepatan non-ekuilibrium tinggi (laju penarikan teratur) dan mencatat lintasan kurva gaya-perpanjangan (force-extension curve). Dengan menerapkan Teorema Kesetaraan Jarzynski pada distribusi kerja eksperimental W, mereka berhasil merekonstruksi profil energi bebas pelipatan Delta_F kesetimbangan sejati RNA secara akurat tanpa harus menunggu proses penarikan kuasi-statis yang sangat lambat.",
                    impact = "Memungkinkan pemetaan lanskap energi pelipatan riboswitch dan struktur target obat secara eksperimental pada tingkat molekul tunggal."
                ),
                homeLab = HomeLabData(
                    title = "Pengamatan Gerak Brown Partikel Suspensi Lemak Susu Menggunakan Kamera Ponsel",
                    objective = "Melihat secara langsung gerak acak stokastik partikel koloid mikroskopis yang didorong fluktuasi termal molekul air.",
                    materials = listOf("Satu tetes susu sapi segar atau santan encer", "Kaca preparat atau wadah kaca datar tipis", "Kamera ponsel dengan lensa makro klip murah / mikroskop saku"),
                    steps = listOf(
                        "Encerkan 1 tetes susu dengan 10 tetes air bersih.",
                        "Teteskan cairan pada kaca datar, tutup dengan plastik mika tipis.",
                        "Fokuskan lensa pembesar makro pada tetesan lemak susu terkecil yang terlihat sebagai titik-titik bulat mikro.",
                        "Amati gerakan partikel: butiran lemak tidak diam, melainkan terus bergetar dan melompat-lompat acak ke segala arah secara zigzag.",
                        "Catat bahwa partikel yang lebih kecil bergerak jauh lebih lincah dan cepat dibandingkan partikel yang lebih besar (konsekuensi D ~ 1/r dari relasi Stokes-Einstein)."
                    ),
                    safetyNote = "Praktikum optik mikroskop sederhana, sepenuhnya higienis dan aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Berdasarkan Teorema Fluktuasi-Disipasi Einstein D = k_B * T / (6 * pi * eta * r), apakah yang akan terjadi pada laju difusi Brown suatu partikel jika suhu absolut T sistem dinaikkan dua kali lipat?",
                        options = listOf(
                            "Koefisien difusi D akan meningkat sebanding dengan kenaikan suhu, membuat partikel berdifusi dua kali lebih cepat",
                            "Koefisien difusi akan langsung turun menjadi nol",
                            "Partikel akan berhenti bergerak sama sekali",
                            "Massa partikel akan berkurang menjadi separuhnya"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Koefisien difusi D berbanding lurus secara linear dengan energi termal k_B * T. Menaikkan suhu meningkatkan energi kinetik rata-rata molekul pelarut, menghasilkan tumbukan termal yang lebih kuat dan sering sehingga meningkatkan laju penyebaran acak partikel.",
                        misconceptionAlert = "Suhu tidak hanya mempercepat gerak teratur, melainkan secara spesifik melipatgandakan intensitas fluktuasi stokastik acak."
                    )
                )
            )

            "fis-biofisika-molekuler" -> LessonData(
                conceptId = "fis-biofisika-molekuler",
                simId = "sim-optical-tweezers-protein",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana sel otot kita bisa berkontraksi mengangkat beban berat, atau bagaimana sel sperma bisa berenang lincah menembus cairan kental?",
                        narrativeContext = "Dimas melihat video animasi motor molekuler kinesin yang melangkah di atas filamen mikrotubulus sel."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu dikerjakan oleh Motor Molekuler Biologis! Kinesin dan miosina adalah mesin termal Brown berukuran nanometer yang mengubah energi kimia hidrolisis ATP menjadi langkah gerak mekanik pikonewton.",
                        narrativeContext = "Kakek menggambarkan siklus hidrolisis ATP dan langkah diskrit 8 nanometer motor kinesin."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan Arthur Ashkin memenangkan Hadiah Nobel Fisika 2018 untuk Pinset Optik (Optical Tweezers)—memanfaatkan gaya gradien foton sinar laser terfokus tajam untuk menangkap dan mengukur gaya pikonewton satu molekul tunggal secara langsung!",
                        narrativeContext = "Kirana memperlihatkan diagram penjebakan manik dielektrik di titik fokus sinar laser berkas Gaussian."
                    )
                ),
                intuitionBody = """
                    Biofisika Molekuler menerapkan prinsip-prinsip mekanika kuantum, termodinamika statistik, dan manipulasi optik presisi untuk memahami dinamika makromolekul hayati pada skala nano.
                    
                    1. Lanskap Energi Pelipatan Protein (The Energy Landscape Funnel):
                       Paradoks Levinthal: Jika rantai polipeptida 100 asam amino harus mencoba seluruh konformasi ruang secara acak, dibutuhkan waktu 10^77 tahun untuk melipat diri (lebih tua dari umur alam semesta!). Namun di alam, protein melipat sempurna dalam milidetik.
                       Teori Lanskap Corong (Folding Funnel): Pelipatan bukanlah pencarian acak satu dimensi, melainkan penurunan di sepanjang corong energi bebas berdimensi tinggi yang kasar. Gaya dorong hidrofobik mengarahkan rantai menuruni gradien entropi dan entalpi menuju keadaan alami (native state) pada titik energi bebas terendah global.
                       
                    2. Fisika Motor Molekuler:
                       Motor biologis (kinesin, dynein, miosin, F1-ATP sintase) beroperasi di lingkungan di mana inersia sama sekali tidak berperan (bilangan Reynolds Re ~ 10^(-5), dunia overdamped) dan energi termal k_B*T mendominasi:
                       - Model Ratchet Termal Brown (Feynman-Smoluchowski Ratchet): Energi hidrolisis ATP tidak 'mendorong' motor seperti mesin uap, melainkan bertindak memutus simetri potensi penghalang secara periodik, mengubah fluktuasi acak Brown menjadi gerak terarah ke satu arah (asymmetric ratchet potential).
                       - Kinesin melangkah di sepanjang mikrotubulus dengan ukuran langkah diskrit 8 nm (panjang satu dimer tubulin) menghasilkan gaya macet (stall force) sebesar 5 - 7 pikoNewton (pN).
                       
                    3. Pinset Optik (Optical Tweezers):
                       Berkas laser inframerah difokuskan secara sangat tajam melalui lensa objektif mikroskop berapertur numerik tinggi (NA > 1.2):
                       - Gaya Hamburan (Scattering Force): Mendorong partikel searah rambatan berkas foton.
                       - Gaya Gradien (Gradient Force): Menarik partikel dielektrik berkutub (seperti manik silika atau polistirena) menuju wilayah dengan intensitas medan listrik laser paling pekat (titik fokus).
                       Jika gaya gradien mendominasi gaya hamburan, perangkap optik stabil 3D tercipta. Perangkap bertindak sebagai pegas elastis Hooke linier: F = -k_trap * Delta_x. Kalibrasi kekakuan pegas k_trap (biasanya 0.05 - 0.5 pN/nm) memungkinkan pengukuran gaya pikonewton dan pergeseran sub-nanometer secara presisi.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Di dunia skala nanometer seluler, viskositas air terasa sekental aspal pekat dan energi termal mengguncang segalanya tanpa henti.",
                    "Lanskap corong energi membuktikan bagaimana evolusi biologis merancang urutan asam amino agar jalur pelipatan meluncur mulus menuju struktur fungsional stabil.",
                    "Pinset optik bekerja murni berdasarkan transfer momentum foton cahaya yang membias saat melintasi manik dielektrik.",
                    "Motor molekuler F1-ATP sintase adalah turbin generator listrik biologis berotasi tertua dan paling efisien di bumi dengan efisiensi mendekati 100%."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Gaya Gradien Penjebakan Pinset Optik (Rezim Rayleigh)",
                        latex = "\\mathbf{F}_{\\mathrm{grad}} = \\frac{2\\pi n_{\\mathrm{med}} r^3}{c} \\left( \\frac{m^2 - 1}{m^2 + 2} \\right) \\nabla I(\\mathbf{r})",
                        explanation = "Gaya restorasi pikonewton yang menarik partikel dielektrik ke titik puncak gradien intensitas medan foton laser."
                    ),
                    FormulaCard(
                        title = "Hukum Hooke Perangkap Pinset Optik",
                        latex = "F = -k_{\\mathrm{trap}} \\Delta x, \\quad k_{\\mathrm{trap}} = \\frac{k_B T}{\\langle (\\Delta x)^2 \\rangle}",
                        explanation = "Pengukuran gaya mekanik melalui simpangan manik terkalibrasi dari fluktuasi termal kesetimbangan."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pengukuran Elastisitas Mekanik DNA Tunggal Malaria di Lembaga Biologi Molekuler Eijkman/BRIN",
                    scenario = "Plasmodium falciparum mengubah elastisitas membran sel darah merah eritrosit manusia menjadi sangat kaku sehingga menyumbat kapiler pembuluh darah kecil.",
                    application = "Peneliti biofisika menjepit kedua ujung sel darah merah yang terinfeksi dan molekul DNA menggunakan dua perangkap pinset optik ganda. Dengan meregangkan sel secara bertahap dan mencatat kurva gaya pikonewton, mereka mengukur pertambahan modulus geser membran dari 5 pN/mikrometer (sel sehat elastis) menjadi 40 pN/mikrometer (sel kaku terinfeksi), serta menguji obat yang memulihkan kelenturan sel darah.",
                    impact = "Memberikan pemahaman biofisik mekanistik dalam pengembangan terapi baru untuk mencegah komplikasi fatal malaria serebral."
                ),
                homeLab = HomeLabData(
                    title = "Simulasi Pembelokan Momentum Foton dan Pembiasan Berkas Cahaya Menggunakan Laser Saku dan Botol Air",
                    objective = "Mengamati pembiasan cahaya pada medium silinder sebagai analog transfer momentum yang mendasari gaya gradien pinset optik.",
                    materials = listOf("Pointer laser hijau atau merah kecil", "Botol kaca silinder bening berisi air penuh", "Sedikit susu (sebagai pemancar hamburan cahaya laser di air)", "Kertas putih sebagai layar"),
                    steps = listOf(
                        "Campurkan satu tetes susu ke dalam air botol agar berkas sinar laser tampak jelas melintasi air.",
                        "Sorotkan laser tepat di garis tengah botol; amati berkas sinar tembus lurus tanpa pembelokan.",
                        "Geser berkas laser sedikit ke arah tepi atas silinder botol.",
                        "Amati fenomena pembiasan: berkas laser dibelokkan ke arah bawah saat keluar dari botol silinder.",
                        "Berdasarkan Hukum Newton III (Aksi-Reaksi): Karena foton cahaya dibelokkan ke arah bawah (mendapatkan perubahan momentum ke bawah), maka botol silinder mengalami gaya reaksi dorong foton ke arah atas (menuju puncak intensitas berkas laser!). Itulah mekanisme gaya gradien penangkap pinset optik Arthur Ashkin!"
                    ),
                    safetyNote = "Jangan mengarahkan pointer laser ke mata orang atau hewan."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa pada skala nanometer di dalam sel biologis, motor molekuler seperti kinesin tidak dapat bergerak hanya dengan mengandalkan inersia (momentum lenting) seperti mobil atau mesin bensin makroskopis?",
                        options = listOf(
                            "Karena Bilangan Reynolds sangat rendah (Re << 1), di mana gaya gesek viskos fluida mendominasi total atas gaya inersia sehingga jika suplai energi berhenti motor seketika berhenti dalam hitungan pikodetik",
                            "Karena di dalam sel tidak ada gravitasi",
                            "Karena molekul kinesin terbuat dari gas",
                            "Karena kecepatan cahaya di dalam sel menjadi tak hingga"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Pada skala seluler, perbandingan inersia terhadap viskositas (Bilangan Reynolds Re) bernilai sekitar 10^-5. Inersia benar-benar tidak ada; waktu relaksasi inersia partikel berukuran nanometer kurang dari satu pikodetik, sehingga motor harus terus-menerus bekerja melawan disipasi kental menggunakan siklus hidrolisis kimia ATP.",
                        misconceptionAlert = "Di dunia mikroskopis, intuisi mekanika Newtonian kita tertipu: tidak ada benda yang meluncur bebas karena semua gerakan teredam seketika oleh fluida viskos."
                    )
                )
            )

            "fis-fisika-eksperimental-detektor" -> LessonData(
                conceptId = "fis-fisika-eksperimental-detektor",
                simId = "sim-experimental-detectors-daq",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, di eksperimen kolider partikel LHC atau detektor gelombang gravitasi LIGO, bagaimana para ilmuwan bisa mendeteksi partikel yang melesat dalam sepermiliar detik atau mendeteksi getaran cermin yang lebih kecil dari seperseribu diameter proton?",
                        narrativeContext = "Dimas melihat susunan modul detektor mikrostrip silikon bertingkat dan tabung vakum kriogenik interferometer laser."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itulah keajaiban Fisika Eksperimental dan Instrumentasi Detektor, Dimas! Detektor semikonduktor mengubah ionisasi partikel menjadi pulsa muatan listrik femtocoulomb, sedangkan interferometer laser ultra-presisi menstabilkan frekuensi foton dengan isolasi seismik bertingkat.",
                        narrativeContext = "Kakek menuliskan rumus ionisasi Bethe-Bloch dan arsitektur pemrosesan data akuisisi FPGA real-time."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan karena data mentah yang mengalir mencapai puluhan Terabit per detik, sistem pemicu (Hardware Trigger) berbasis FPGA menyeleksi 1 dari 100.000 tabrakan partikel paling langka sebelum disimpan ke penyimpanan data!",
                        narrativeContext = "Kirana memperlihatkan diagram alir data DAQ dari diskriminator analog, ADC flash, ke komputasi klaster Bayesian."
                    )
                ),
                intuitionBody = """
                    Fisika Eksperimental Lanjut mengkaji interaksi fundamental radiasi dan partikel dengan instrumen materi, desain transduser detektor resolusi tinggi, dan arsitektur pengolahan data akuisisi berkecepatan tinggi (Data Acquisition / DAQ).
                    
                    1. Interaksi Partikel Bermuatan & Foton dengan Materi:
                       - Formula Bethe-Bloch: Mengatur laju kehilangan energi rata-rata partikel bermuatan berat melalui ionisasi atom medium (-dE/dx). Menunjukkan puncak Bragg (Bragg peak) di ujung lintasan, yang sangat penting untuk terapi radiasi proton kanker.
                       - Interaksi Foton: Efek fotolistrik (dominan E < 100 keV), hamburan Compton (0.1 - 5 MeV), dan produksi pasangan elektron-positron (E > 1.022 MeV).
                       
                    2. Teknologi Detektor Semikonduktor Silikon:
                       Dioda p-n silikon dengan bias mundur tinggi (reverse-biased).
                       Zona deplesi bertindak sebagai kamar ionisasi padatan: partikel bermuatan yang melintas mengeksitasi pasangan elektron-hole (dibutuhkan hanya 3.6 eV per pasangan di Si, dibandingkan ~30 eV pada gas).
                       Muatan dikumpulkan oleh medan listrik dalam waktu beberapa nanodetik, menghasilkan resolusi spasial posisi hingga fraksi mikrometer (mikrostrip dan detektor piksel CMOS hybrid).
                       
                    3. Interferometri Laser Ultra-Presisi (Deteksi LIGO/Virgo):
                       Interferometer Michelson dengan rongga optik Fabry-Pérot sepanjang 4 km:
                       - Mengukur pergeseran regangan metrik ruang-waktu h = Delta_L / L ~ 10^(-21) (pergeseran cermin Delta_L ~ 10^(-18) m, jauh lebih kecil dari ukuran proton!).
                       - Menggunakan suspensi pendulum kuadrupel silika leburan untuk meredam kebisingan getaran seismik tanah hingga faktor 10^(-10).
                       - Cahaya perasan kuantum (Quantum Squeezed Light) untuk menembus batas derau tembakan foton kuantum standar (Standard Quantum Limit / SQL).
                       
                    4. Sistem Akuisisi Data (DAQ) & Pemicu Cepat (Hardware Trigger):
                       Pada tabrakan partikel 40 MHz di LHC (40 juta tabrakan per detik):
                       - Tingkat Pemicu 1 (Level-1 Trigger / L1T): Sirkuit logika terprogram FPGA yang mengambil keputusan terima/tolak dalam waktu 3 mikrodetik berdasarkan informasi kalorimeter dan pelacak muon, mereduksi laju data dari 40 MHz menjadi 100 kHz.
                       - High-Level Trigger (HLT): Klaster prosesor komputasi CPU/GPU yang merekonstruksi lintasan partikel lengkap, menyimpan data terpilih pada ~1.000 peristiwa per detik ke pusat data GRID global.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Detektor semikonduktor padat memiliki kerapatan atomik 1000 kali lebih padat dari gas, menghasilkan resolusi energi dan jejak spasial yang luar biasa tajam.",
                    "Puncak Bragg membuktikan bahwa partikel berat melepaskan sebagian besar dosis radiasi perusaknya tepat saat melambat berhenti di titik akhir target.",
                    "LIGO adalah instrumen pengukur paling presisi yang pernah dibuat manusia dalam sejarah peradaban.",
                    "Sistem DAQ modern harus memproses aliran data setara seluruh lalu lintas internet dunia dalam hitungan mikrodetik tanpa penundaan antrean memori."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Formula Kehilangan Energi Ionisasi Bethe-Bloch",
                        latex = "-\\left\\langle \\frac{dE}{dx} \\right\\rangle = 4\\pi N_A r_e^2 m_e c^2 z^2 \\frac{Z}{A} \\frac{1}{\\beta^2} \\left[ \\frac{1}{2} \\ln\\left( \\frac{2m_e c^2 \\beta^2 \\gamma^2 T_{\\max}}{I^2} \\right) - \\beta^2 - \\frac{\\delta(\\beta\\gamma)}{2} \\right]",
                        explanation = "Laju pengereman energi partikel bermuatan z di dalam medium materi berelemen Z/A per satuan panjang lintasan x."
                    ),
                    FormulaCard(
                        title = "Regangan Interferometri Gelombang Gravitasi LIGO",
                        latex = "h = \\frac{\\Delta L_x - \\Delta L_y}{L} = \\frac{\\Delta\\Phi}{4\\pi \\frac{L}{\\lambda}} \\sim 10^{-21}",
                        explanation = "Pengukuran perubahan panjang relatif lengan interferometer L yang memicu pergeseran fase interferensi foton Delta_Phi."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Jaringan Sensor Seismometer Laser & Akselerometer Gempa Real-Time BMKG Indonesia",
                    scenario = "BMKG mengoperasikan jaringan stasiun geofisika InaTEWS dengan ratusan sensor broadband seismometer berkecepatan tinggi di sepanjang sesar aktif busur Sunda.",
                    application = "Insinyur instrumentasi geofisika merancang sistem DAQ berbasis mikrokontroler 24-bit Sigma-Delta ADC dan transmisi satelit VSAT real-time. Dengan filter digital finite impulse response (FIR) dan algoritma pemicu rasio rata-rata jangka pendek terhadap jangka panjang (STA/LTA) terintegrasi FPGA, gelombang P gempa terdeteksi secara otonom dalam 2 detik pertama sebelum gelombang S destruktif tiba.",
                    impact = "Menyalakan sirene peringatan dini gempa dan tsunami secara otomatis, menyelamatkan ribuan nyawa warga di zona rawan bencana."
                ),
                homeLab = HomeLabData(
                    title = "Pembuatan Detektor Sinar Kosmik / Radiasi Geiger Mandiri Sederhana Menggunakan Tabung Neon Mini",
                    objective = "Memahami prinsip ionisasi gas lucutan avalanche Townsend sebagai detektor pulsa radiasi.",
                    materials = listOf("Satu buah lampu neon indikator mini (tipe NE-2)", "Baterai 9V sebanyak 10 buah dihubungkan seri (menghasilkan tegangan tinggi searah ~90 Volt)", "Resistor 10 Megaohm", "Speaker telinga / osiloskop ponsel"),
                    steps = listOf(
                        "Hubungkan lampu neon seri dengan resistor 10 Megaohm pada sumber tegangan tinggi 90V (atur sedikit di bawah tegangan lucutan tembus lampu ~95V).",
                        "Dalam keadaan normal, lampu padam karena gas neon di dalam tabung bertindak sebagai isolator.",
                        "Dekatkan sumber radiasi latar alamiah (misal batu granit atau garam kalium diet rendah natrium KCl yang mengandung radioisotop K-40).",
                        "Ketika partikel radiasi mengionisasi atom gas neon di dalam tabung, terbentuk pasangan ion-elektron yang memicu lucutan avalanche Townsend mendadak: lampu berkedip sesaat dan menghasilkan bunyi klik deteksi pada speaker!",
                        "Diskusikan prinsip kerja ini dengan detektor pencacah Geiger-Müller profesional."
                    ),
                    safetyNote = "Gunakan baterai kecil biasa secara hati-hati, hindari menyentuh terminal kabel terbuka saat terhubung 90V."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa pada terapi radiasi kanker modern (seperti terapi berkas proton), fisikawan medis lebih memilih menggunakan berkas partikel proton dibandingkan sinar foton X-ray konvensional?",
                        options = listOf(
                            "Karena proton memiliki Puncak Bragg (Bragg Peak) menurut rumus Bethe-Bloch, di mana sebagian besar energi radiasinya dilepaskan tepat di jaringan tumor sasaran tanpa merusak jaringan sehat di belakangnya",
                            "Karena proton tidak menghasilkan radiasi",
                            "Karena proton bergerak lebih lambat daripada suara",
                            "Karena sinar X-ray tidak bisa menembus kulit"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Berdasarkan formula Bethe-Bloch, laju kehilangan energi per jarak (-dE/dx) sebanding dengan 1/v^2. Saat proton bergerak cepat menembus jaringan sehat awal, ia melepaskan sedikit dosis radiasi; namun saat ia melambat tepat di lokasi kedalaman tumor, -dE/dx melonjak tajam (Puncak Bragg) menghancurkan sel kanker dan seketika berhenti total tanpa menembus jaringan sehat di belakangnya.",
                        misconceptionAlert = "Sinar X-ray konvensional melepaskan dosis maksimum tepat di permukaan kulit dan terus menembus keluar tubuh, merusak jaringan sehat di depan dan di belakang tumor."
                    )
                )
            )

            else -> null
        }
    }
}

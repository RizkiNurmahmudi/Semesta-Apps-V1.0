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

object MathLevel8Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "mat-analisis-fungsional-banach",
            domain = Domain.MATEMATIKA,
            topic = "Analisis Fungsional",
            title = "Analisis Fungsional: Ruang Banach, Ruang Hilbert & Teorema Hahn-Banach",
            description = "Ruang bernorma lengkap Banach, ruang hasil kali dalam Hilbert, Teorema Hahn-Banach, Teorema Pemetaan Terbuka, Teorema Representasi Riesz, dan teori spektral operator kompak.",
            level = DepthLevel.L8,
            estMinutes = 27,
            prerequisites = listOf("mat-analisis-real-darboux", "mat-aljabar-linear-spl", "mat-topologi-ruang-metrik")
        ),
        ConceptItem(
            id = "mat-teori-galois-polinomial",
            domain = Domain.MATEMATIKA,
            topic = "Teori Medan & Teori Galois",
            title = "Teori Galois: Perluasan Medan, Grup Galois & Teorema Abel-Ruffini",
            description = "Perluasan medan aljabar dan medan pemisahan, automorfisma medan, grup Galois, korespondensi fundamental Galois, dan pembuktian Teorema Abel-Ruffini (ketidakterlarutan polinomial kuintik).",
            level = DepthLevel.L8,
            estMinutes = 28,
            prerequisites = listOf("mat-aljabar-abstrak-grup-ring")
        ),
        ConceptItem(
            id = "mat-topologi-aljabar-homotopi",
            domain = Domain.MATEMATIKA,
            topic = "Topologi Aljabar",
            title = "Topologi Aljabar: Homotopi, Grup Fundamental & Teorema Seifert-van Kampen",
            description = "Deformasi homotopi kurva kontinu, grup fundamental pi_1, ruang penutup, Teorema Seifert-van Kampen, dan pengantar teori homologi singular.",
            level = DepthLevel.L8,
            estMinutes = 27,
            prerequisites = listOf("mat-topologi-ruang-metrik", "mat-aljabar-abstrak-grup-ring")
        ),
        ConceptItem(
            id = "mat-pde-non-linear-sobolev",
            domain = Domain.MATEMATIKA,
            topic = "Persamaan Diferensial Lanjut",
            title = "Diferensial Lanjut: Sistem Dinamik Non-Linear, Sobolev & Kestabilan Lyapunov",
            description = "Teori eksistensi Picard-Lindelöf, fungsi kestabilan Lyapunov sistem non-linear, turunan lemah distribusi Schwartz, dan formulasi lemah PDE dalam ruang Sobolev W^{k,p}.",
            level = DepthLevel.L8,
            estMinutes = 27,
            prerequisites = listOf("mat-pde-persamaan-diferensial-parsial", "mat-analisis-fungsional-banach")
        ),
        ConceptItem(
            id = "mat-teori-kontrol-lqr-chaos",
            domain = Domain.MATEMATIKA,
            topic = "Teori Kontrol & Sistem Dinamik",
            title = "Teori Kontrol Modern: State-Space, Keterkontrolan Kalman, LQR & Teori Chaos",
            description = "Representasi ruang keadaan matriks (A, B, C, D), matriks keterkontrolan dan keteramatan Kalman, perancangan optimal Linear Quadratic Regulator (LQR), dan bifurkasi kekacauan deterministik chaos.",
            level = DepthLevel.L8,
            estMinutes = 27,
            prerequisites = listOf("mat-aljabar-linear-spl", "mat-ode-orde-1-2")
        ),
        ConceptItem(
            id = "mat-proses-stokastik-ito",
            domain = Domain.MATEMATIKA,
            topic = "Proses Stokastik & Kalkulus Itô",
            title = "Proses Stokastik & Kalkulus Itô: Gerak Brown, Martingale & SDE",
            description = "Proses Wiener gerak Brown, filtrasi informasi aljabar-sigma, teori Martingale Doob, integral stokastik Itô, Lemma Itô diferensial kuadratik, dan persamaan diferensial stokastik (SDE).",
            level = DepthLevel.L8,
            estMinutes = 28,
            prerequisites = listOf("mat-teori-peluang-lebesgue", "mat-ode-orde-1-2")
        ),
        ConceptItem(
            id = "mat-matematika-ai-ml-optimasi",
            domain = Domain.MATEMATIKA,
            topic = "Fondasi Matematika AI & Pembelajaran Mesin",
            title = "Matematika untuk AI: Optimasi Konveks KKT, Teori Informasi & Inferensi Bayesian",
            description = "Optimasi konveks kondisi Karush-Kuhn-Tucker (KKT), entropi Shannon, divergensi Kullback-Leibler, inferensi Bayesian Markov Chain Monte Carlo (MCMC), dan batas generalisasi dimensi VC.",
            level = DepthLevel.L8,
            estMinutes = 27,
            prerequisites = listOf("mat-optimasi-program-linear", "mat-probabilitas-inferensi-regresi")
        ),
        ConceptItem(
            id = "mat-kriptografi-kurva-eliptik",
            domain = Domain.MATEMATIKA,
            topic = "Kriptografi & Teori Bilangan Lanjut",
            title = "Kriptografi Lanjut: Kurva Eliptik ECC, Kisi Pasca-Kuantum & Fungsi Zeta",
            description = "Aritmatika penambahan titik kurva eliptik y^2 = x^3 + ax + b di atas medan berhingga F_p, protokol tanda tangan digital ECDSA, kriptografi pasca-kuantum berbasis kekisi (Lattice-based LWE), dan Hipotesis Riemann.",
            level = DepthLevel.L8,
            estMinutes = 28,
            prerequisites = listOf("mat-aljabar-abstrak-grup-ring", "mat-teori-bilangan-modulo")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "mat-analisis-fungsional-banach" -> LessonData(
                conceptId = "mat-analisis-fungsional-banach",
                simId = "sim-functional-hilbert-riesz",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, di aljabar linear kita bekerja dengan ruang vektor berdimensi 3 atau N. Tapi bagaimana jika elemen-elemen vektor kita adalah seluruh fungsi kontinu kontinu—yang berarti memiliki tak terhingga dimensi?",
                        narrativeContext = "Dimas memikirkan ruang vektor fungsi gelombang mekanika kuantum yang berdimensi tak terhingga."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itulah ranah Analisis Fungsional, Dimas! Stefan Banach dan David Hilbert memperluas kalkulus ke Ruang Vektor Bernorma Lengkap (Ruang Banach) dan Ruang Hasil Kali Dalam Lengkap (Ruang Hilbert L^2).",
                        narrativeContext = "Kakek menuliskan Teorema Hahn-Banach tentang perluasan fungsional linear kontinu tanpa menambah norma."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan Teorema Representasi Riesz membuktikan bahwa setiap fungsional linear kontinu pada ruang Hilbert bersesuaian tepat dengan perkalian hasil kali dalam dengan satu elemen vektor unik di ruang tersebut!",
                        narrativeContext = "Kirana memaparkan bra-ket braket Dirac <phi|psi> sebagai fungsional linear kontinu."
                    )
                ),
                intuitionBody = """
                    Analisis Fungsional adalah studi tentang ruang vektor berdimensi tak hingga yang dilengkapi dengan struktur topologi norma atau hasil kali dalam, serta operator linear kontinu yang bekerja di atasnya.
                    
                    1. Ruang Banach & Ruang Hilbert:
                       - Ruang Bernorma (X, ||.||): Ruang vektor dengan norma yang memenuhi ketaksamaan segitiga.
                       - Ruang Banach: Ruang bernorma yang lengkap (setiap barisan Cauchy konvergen ke elemen di dalam ruang tersebut, misal ruang l^p dan L^p(Omega)).
                       - Ruang Hilbert (H, <., .>): Ruang bernorma lengkap di mana normanya berasal dari hasil kali dalam ||x|| = sqrt(<x, x>). Memenuhi hukum jajaran genjang ||x+y||^2 + ||x-y||^2 = 2(||x||^2 + ||y||^2). Menjamin keberadaan proyeksi ortogonal pada subruang tertutup.
                       
                    2. Tiga Pilar Teorema Fundamental Analisis Fungsional:
                       - Teorema Hahn-Banach: Menjamin bahwa fungsional linear terbatas yang didefinisikan pada subruang dapat diperluas ke seluruh ruang semesta tanpa memperbesar normanya. Menjamin ruang dual X* kaya akan fungsional linear pemisah titik.
                       - Teorema Batas Seragam (Banach-Steinhaus): Jika keluarga operator linear kontinu terbatas titik-demi-titik, maka keluarga tersebut terbatas secara seragam dalam norma.
                       - Teorema Pemetaan Terbuka (Open Mapping Theorem): Operator linear kontinu surjektif antara dua ruang Banach selalu memetakan himpunan buka ke himpunan buka (mengimplikasikan Teorema Invers Kontinu dan Teorema Grafik Tertutup).
                       
                    3. Teorema Representasi Riesz:
                       Untuk setiap fungsional linear kontinu f in H* pada ruang Hilbert H, terdapat tepat satu vektor y in H sedemikian hingga f(x) = <x, y> untuk semua x in H, dengan ||f|| = ||y||. Isomorfisma anti-linear antara H dan dualnya H*.
                       
                    4. Teori Spektral Operator Kompak:
                       Operator kompak T: H -> H memetakan bola satuan tertutup ke himpunan kompak relatif.
                       Teorema Spektral untuk Operator Self-Adjoint Kompak: T memiliki barisan nilai eigen riil lambda_n -> 0 dan basis ortonormal vektor eigen {e_n}, memungkinkan representasi deret T = sum lambda_n <., e_n> e_n (fondasi matematis persamaan Schrödinger mekanika kuantum).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Dimensi tak hingga membawa bahaya baru: bola satuan tertutup tidak lagi kompak, sehingga kekompakan harus diperiksa secara khusus.",
                    "Hukum jajaran genjang adalah uji lakmus mutlak apakah suatu norma berasal dari hasil kali dalam atau bukan.",
                    "Teorema Hahn-Banach menjamin bahwa kita selalu dapat 'melihat' elemen ruang vektor berdimensi tak hingga melalui fungsional linear pengukur.",
                    "Representasi Riesz adalah landasan matematis dari formalisme bra-ket Dirac di mana setiap bra <phi| adalah fungsional dual dari ket |phi>."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Teorema Representasi Riesz Ruang Hilbert",
                        latex = "\\forall f \\in H^*, \\; \\exists! y \\in H \\quad \\text{s.t.} \\quad f(x) = \\langle x, y \\rangle, \\quad \\|f\\|_{H^*} = \\|y\\|_H",
                        explanation = "Setiap fungsional linear kontinu pada ruang Hilbert ekuivalen persis dengan hasil kali dalam terhadap satu vektor unik y."
                    ),
                    FormulaCard(
                        title = "Teori Spektral Operator Self-Adjoint Kompak",
                        latex = "T x = \\sum_{n=1}^\\infty \\lambda_n \\langle x, e_n \\rangle e_n, \\quad \\lim_{n\\to\\infty} \\lambda_n = 0",
                        explanation = "Dekomposisi spektral operator kompak menjadi kombinasi linear proyeksi pada basis vektor eigen ortonormal."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Formulasi Ruang Hilbert L2 dalam Rekonstruksi Citra MRI RS Jantung Harapan Kita",
                    scenario = "Mesin Magnetic Resonance Imaging (MRI) 3 Tesla merekam data sinyal frekuensi radio k-space di bidang Fourier kompleks.",
                    application = "Matematikawan medis memformulasikan masalah inversi MRI sebagai operator linear terikat T pada ruang Hilbert L^2(R^2). Menggunakan dekomposisi nilai singular tergeneralisasi (SVD) dan Teorema Representasi Riesz, algoritma regularisasi Tikhonov meminimalkan fungsional energi ||Tx - y||^2 + lambda ||x||^2, menjamin rekonstruksi citra potongan anatomi pembuluh darah koroner jantung bersifat stabil (well-posed) bebas dari artefak gerak pernapasan.",
                    impact = "Menghasilkan visualisasi penyumbatan arteri koroner secara non-invasif dengan ketelitian sub-milimeter."
                ),
                homeLab = HomeLabData(
                    title = "Verifikasi Hukum Jajaran Genjang pada Vektor Bidang Datar vs Norma Bukan Hilbert",
                    objective = "Membuktikan secara aljabar dan geometris bahwa norma l2 Euclidean memenuhi hukum jajaran genjang sedangkan norma l1 (Manhattan) gagal memenuhinya.",
                    materials = listOf("Kertas berpetak dan penggaris", "Kalkulator biasa"),
                    steps = listOf(
                        "Pilih dua vektor: x = (1, 0) dan y = (0, 1).",
                        "Hitung dengan norma Euclidean l2: ||x|| = 1, ||y|| = 1, x+y = (1, 1) -> ||x+y||^2 = 2; x-y = (1, -1) -> ||x-y||^2 = 2.",
                        "Buktikan hukum jajaran genjang: ||x+y||^2 + ||x-y||^2 = 2 + 2 = 4; dan 2(||x||^2 + ||y||^2) = 2(1 + 1) = 4 (cocok sempurna!).",
                        "Sekarang hitung dengan norma l1 (|x1| + |x2|): ||x|| = 1, ||y|| = 1; ||x+y|| = |1|+|1| = 2 -> 2^2 = 4; ||x-y|| = |1|+|-1| = 2 -> 2^2 = 4.",
                        "Ruas kiri = 4 + 4 = 8, sedangkan ruas kanan = 2(1^2 + 1^2) = 4. Nilai 8 != 4 (gagal total!).",
                        "Diskusikan mengapa ruang bernorma l1 bukan ruang Hilbert karena tidak memiliki struktur hasil kali dalam ortogonal."
                    ),
                    safetyNote = "Praktikum verifikasi aljabar kertas meja, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Manakah syarat yang diperlukan dan mencukupi agar suatu norma ||.|| pada ruang bernorma X dapat diturunkan dari suatu hasil kali dalam <., .> sehingga X menjadi calon ruang Hilbert?",
                        options = listOf(
                            "Norma tersebut harus memenuhi Hukum Jajaran Genjang: ||x + y||^2 + ||x - y||^2 = 2(||x||^2 + ||y||^2) untuk semua x, y",
                            "Norma tersebut harus selalu menghasilkan bilangan prima",
                            "Norma tersebut harus bernilai nol untuk semua vektor",
                            "Ruang vektor harus berdimensi tepat 2"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Teorema Jordan-von Neumann membuktikan bahwa sebuah ruang bernorma dapat didefinisikan hasil kali dalamnya jika dan hanya jika normanya mematuhi Identitas Jajaran Genjang. Jika terpenuhi, hasil kali dalam dapat direkonstruksi melalui Identitas Polarisasi.",
                        misconceptionAlert = "Ruang Banach seperti L^p (untuk p != 2) adalah ruang bernorma lengkap yang sangat penting, tetapi mereka bukan ruang Hilbert karena melanggar hukum jajaran genjang."
                    )
                )
            )

            "mat-teori-galois-polinomial" -> LessonData(
                conceptId = "mat-teori-galois-polinomial",
                simId = "sim-galois-field-extensions",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, untuk persamaan kuadrat kita punya rumus ABC, untuk persamaan kubik ada rumus Cardano, dan derajat 4 ada rumus Ferrari. Tapi mengapa selama ratusan tahun para matematikawan gagal menemukan rumus aljabar akar untuk persamaan polinomial derajat 5 (kuintik)?",
                        narrativeContext = "Dimas memandangi persamaan x^5 - 4x + 2 = 0 yang tidak bisa diselesaikan dengan operasi akar radikal."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Bukan karena mereka kurang pintar, Dimas, melainkan karena rumus umum itu memang Mustahil Ada! Evariste Galois, pemuda jenius usia 20 tahun, memecahkannya melalui Teori Galois yang menghubungkan simetri akar persamaan dengan Teori Grup!",
                        narrativeContext = "Kakek menuliskan Korespondensi Fundamental Galois antara submedan dan subgrup Galois Gal(E/F)."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan Teorema Abel-Ruffini membuktikan bahwa polinomial dapat diselesaikan dengan radikal jika dan hanya jika Grup Galois-nya adalah Grup Terlarutkan (Solvable Group). Karena grup permutasi simetris S5 bukan grup terlarutkan, kuintik umum mustahil terpecahkan!",
                        narrativeContext = "Kirana memaparkan subgrup normal alternasi A5 yang bersifat sederhana non-Abelian (simple group)."
                    )
                ),
                intuitionBody = """
                    Teori Galois adalah salah satu mahakarya paling memukau dalam sejarah matematika, membangun jembatan elegan antara Teori Medan (Field Theory) dan Teori Grup (Group Theory).
                    
                    1. Perluasan Medan Aljabar & Medan Pemisahan:
                       Diberikan polinomial f(x) in F[x].
                       - Medan Pemisahan (Splitting Field) E: Medan perluasan terkecil dari F yang memuat seluruh akar-akar f(x).
                       - Perluasan Normal: Polinomial tak tereduksi yang memiliki satu akar di E membelah sepenuhnya di E.
                       - Perluasan Terpisahkan (Separable): Akar-akarnya tidak memiliki akar ganda (f'(x) != 0).
                       - Perluasan Galois: Perluasan yang normal dan terpisahkan. Derajat perluasan [E : F] berhingga.
                       
                    2. Grup Galois Gal(E/F):
                       Grup seluruh automorfisma medan sigma: E -> E yang menetapkan setiap elemen medan dasar F (sigma(a) = a untuk semua a in F).
                       Unsur-unsur grup Galois mempermutasikan akar-akar polinomial f(x) tanpa mengubah relasi aljabar di antara mereka.
                       Teorema: Untuk perluasan Galois berhingga, orde grup Galois sama persis dengan derajat perluasan medan: |Gal(E/F)| = [E : F].
                       
                    3. Korespondensi Fundamental Galois:
                       Terdapat bijeksi pembalikan-inklusi 1-ke-1 yang sempurna antara:
                       - Himpunan semua submedan perantara K (F subset K subset E).
                       - Himpunan semua subgrup H dari grup Galois Gal(E/F), di mana H = Gal(E/K) dan K = E^H (medan tetap).
                       Submedan K adalah perluasan normal dari F jika dan hanya jika subgrup H adalah Subgrup Normal dari G (H triangleleft G). Dalam kasus ini, Gal(K/F) isomorfis dengan grup faktor G/H!
                       
                    4. Teorema Abel-Ruffini & Ketidakterlarutan Persamaan Kuintik:
                       Suatu polinomial dapat diselesaikan dengan radikal (penjumlahan, pengurangan, perkalian, pembagian, dan penarikan akar n-akar bertingkat) jika dan hanya jika Grup Galois dari medan pemisahannya adalah Grup Terlarutkan (Solvable Group / memiliki deret komposisi dengan faktor siklik berorde prima).
                       Polinomial kuintik umum berderajat 5 memiliki grup Galois S5 (grup simetris 120 elemen).
                       Subgrup normal satu-satunya dari S5 adalah A5 (grup berorde 60). A5 adalah Grup Sederhana (Simple Group) non-Abelian, sehingga tidak memiliki deret faktor siklik (tidak terlarutkan).
                       Kesimpulan Mutlak: Persamaan polinomial berderajat n >= 5 secara umum TIDAK BISA diselesaikan dengan rumus radikal tertutup!
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Teori Galois mengubah masalah aljabar persamaan yang rumit menjadi analisis struktur simetri grup yang elegan.",
                    "Korespondensi fundamental Galois bertindak laksana cermin: inklusi medan naik K1 subset K2 bersesuaian dengan inklusi subgrup turun H2 subset H1.",
                    "Ketidakterlarutan kuintik bukanlah kegagalan manusia, melainkan hukum simetri abstrak alam semesta yang menolak rumus radikal pada S5.",
                    "Teori Galois juga memecahkan tiga teka-teki geometri Yunani Kuno: membuktikan kemustahilan melipatgandakan kubus, membagi tiga sudut sebarang, dan membuat lingkaran kuadrat hanya dengan jangka dan penggaris."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Korespondensi Fundamental Teori Galois",
                        latex = "[E : K] = |\\mathrm{Gal}(E/K)|, \\quad K \\text{ normal over } F \\iff H \\triangleleft G, \\quad \\mathrm{Gal}(K/F) \\cong G/H",
                        explanation = "Bijeksi sempurna pembalik inklusi antara kisi submedan perantara K dan kisi subgrup normal H dari grup Galois G."
                    ),
                    FormulaCard(
                        title = "Kriteria Keterlarutan Radikal Polinomial",
                        latex = "f(x) \\text{ terselesaikan dengan radikal} \\iff \\mathrm{Gal}(E/F) \\text{ adalah grup terlarutkan (solvable)}",
                        explanation = "Persamaan polinomial aljabar dapat diselesaikan dengan rumus akar jika dan hanya jika grup simetri akarnya bersifat solvable."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Desain Kode Koreksi Galat Reed-Solomon untuk Komunikasi Satelit Mikro LAPAN / BRIN",
                    scenario = "Sinyal telemetri satelit mikro Indonesia melintasi badai radiasi sabuk Van Allen yang rentan terhadap galat semburan bit (burst errors).",
                    application = "Insinyur sistem komunikasi satelit merancang pengkodean Reed-Solomon RS(255, 223) menggunakan Teori Medan Galois GF(2^8). Polinomial pesan dihitung pada elemen medan pemisahan berhingga; sifat aljabar grup siklik multiplikatif medan Galois menjamin algoritma dekoder Berlekamp-Massey dapat mengoreksi hingga 16 simbol byte galat acak dalam setiap paket data tanpa kehilangan informasi.",
                    impact = "Menjamin penerimaan citra satelit resolusi tinggi wilayah Nusantara tanpa cacat transmisi."
                ),
                homeLab = HomeLabData(
                    title = "Eksplorasi Perluasan Medan Derajat Dua Q(sqrt(2)) dan Automorfisma Galois Konjugasi",
                    objective = "Membangun medan pemisahan terkecil dan mengamati pemetaan automorfisma konjugat akar secara manual.",
                    materials = listOf("Kertas catatan dan pulpen aljabar"),
                    steps = listOf(
                        "Tinjau polinomial f(x) = x^2 - 2 pada bilangan rasional Q. Akar-akarnya adalah +sqrt(2) dan -sqrt(2).",
                        "Bentuk medan perluasan Q(sqrt(2)) = { a + b*sqrt(2) : a, b in Q }.",
                        "Definisikan dua pemetaan automorfisma: sigma_1 (identitas: memetakan sqrt(2) -> sqrt(2)) dan sigma_2 (konjugasi: memetakan sqrt(2) -> -sqrt(2)).",
                        "Buktikan bahwa sigma_2 mempertahankan perkalian: sigma_2((a + b*sqrt(2))(c + d*sqrt(2))) = sigma_2(a + b*sqrt(2)) * sigma_2(c + d*sqrt(2)).",
                        "Amati bahwa sigma_2 * sigma_2 = sigma_1 (invers diri sendiri).",
                        "Buktikan bahwa Grup Galois Gal(Q(sqrt(2))/Q) isomorfis terhadap grup siklik Z2 berorde 2, mencerminkan simetri permutasi kedua akarnya!"
                    ),
                    safetyNote = "Praktikum deduksi aljabar matematika murni, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Berdasarkan Teori Galois dan Teorema Abel-Ruffini, mengapa persamaan polinomial kuintik umum derajat 5 seperti x^5 - 6x + 3 = 0 mustahil diselesaikan dengan rumus aljabar tertutup yang hanya menggunakan operasi akar radikal (+, -, *, /, dan akar pangkat)?",
                        options = listOf(
                            "Karena grup Galois dari persamaan tersebut adalah grup simetris S5, dan subgrup alternasi A5 di dalamnya adalah grup sederhana non-Abelian sehingga S5 bukan merupakan grup terlarutkan (not solvable)",
                            "Karena angka 5 adalah bilangan prima",
                            "Karena tidak ada kalkulator yang mampu menghitung pangkat lima",
                            "Karena akar-akarnya selalu berupa bilangan imajiner tak hingga"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Keterlarutan dengan radikal menuntut grup Galois memiliki deret subgrup normal bertingkat dengan faktor abelian siklik (solvable group). Grup simetris S5 memiliki subgrup normal A5 (orde 60). Namun A5 tidak memiliki subgrup normal sejati apa pun selain dirinya sendiri dan identitas (ia adalah grup sederhana terkecil yang non-Abelian), sehingga rantai komposisi terputus dan tidak dapat dilarutkan ke faktor siklik, membuktikan rumus umum mustahil ada.",
                        misconceptionAlert = "Beberapa persamaan derajat 5 khusus (seperti x^5 - 32 = 0) dapat diselesaikan dengan akar karena grup Galois-nya siklik terlarutkan, tetapi polinomial kuintik UMUM mustahil."
                    )
                )
            )

            "mat-topologi-aljabar-homotopi" -> LessonData(
                conceptId = "mat-topologi-aljabar-homotopi",
                simId = "sim-algebraic-topology-fundamental",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana para matematikawan bisa membuktikan secara mutlak bahwa ruang 2D bidang datar (R^2) tidak pernah bisa homeomorfis dengan ruang 3D (R^3)?",
                        narrativeContext = "Dimas memikirkan mengapa membuang satu titik pada R^2 memutus keterhubungan kurva, tetapi tidak pada R^3."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menggunakan Topologi Aljabar, Dimas! Masalah bentuk ruang topologi diterjemahkan menjadi struktur grup aljabar melalui Funktor Grup Fundamental pi_1(X). Karena grup fundamental lingkaran berlubang Z tidak sama dengan grup titik trivial {0}, bentuknya terbukti berbeda mutlak!",
                        narrativeContext = "Kakek menggambarkan loop tertutup pada permukaan lingkaran S^1 dan torus T^2."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan Teorema Seifert-van Kampen memungkinkan kita menghitung grup fundamental ruang yang rumit hanya dengan menggabungkan grup fundamental bagian-bagian penyusunnya menggunakan Produk Bebas Tergabung (Amalgamated Free Product)!",
                        narrativeContext = "Kirana memaparkan presentasi grup <a, b | relasi> pada gambar angka delapan (wedge sum S^1 v S^1)."
                    )
                ),
                intuitionBody = """
                    Topologi Aljabar mengkaji ruang topologi dengan mengaitkannya secara funktorial ke struktur aljabar (Grup, Ring, Modul) yang merupakan invarian topologis.
                    
                    1. Homotopi Jalur (Path Homotopy):
                       Dua kurva kontinu f, g: [0, 1] -> X dengan titik ujung sama f(0)=g(0)=x0 dan f(1)=g(1)=x1 disebut homotopis (f ~ g) jika terdapat pemetaan kontinu H: [0, 1] x [0, 1] -> X yang mendeformasi f menjadi g secara kontinu tanpa menggerakkan titik ujung.
                       
                    2. Grup Fundamental (The Fundamental Group pi_1(X, x0)):
                       Dipelopori oleh Henri Poincaré (1895).
                       Himpunan semua kelas homotopi dari loop tertutup (kurva yang berawal dan berakhir di titik basis x0), dilengkapi operasi perkalian penjajaran loop (concatenation f * g).
                       - Operasi memenuhi aksioma grup: asosiatif, kelas lintasan konstan sebagai identitas e, dan pembalikan arah lintasan sebagai invers f^(-1).
                       - Ruang Terhubung Sederhana (Simply Connected): pi_1(X) = {0} (semua loop dapat diciutkan kontinu menjadi satu titik, misal bidang datar R^n dan bola 2-sphere S^2).
                       - Lingkaran S^1: pi_1(S^1) = Z (bilangan bulat pembungkus winding number).
                       - Torus T^2 = S^1 x S^1: pi_1(T^2) = Z x Z (grup abelian bebas berperingkat 2).
                       - Angka Delapan (Wedge Sum S^1 v S^1): pi_1 = Z * Z (Grup Bebas non-Abelian dengan 2 generator <a, b>).
                       
                    3. Teorema Seifert-van Kampen:
                       Menghitung grup fundamental dari ruang X yang merupakan gabungan dua subruang terbuka terhubung-jalur U dan V dengan irisan U cap V terhubung-jalur:
                       pi_1(X) = pi_1(U) *_{pi_1(U cap V)} pi_1(V).
                       Grup fundamental X adalah produk bebas dari pi_1(U) dan pi_1(V) yang digabungkan (amalgamated) dengan mengidentifikasi bayangan dari pi_1(U cap V).
                       
                    4. Teorema Titik Tetap Brouwer & Pengantar Homologi:
                       - Teorema Titik Tetap Brouwer: Setiap fungsi kontinu f: D^2 -> D^2 dari cakram 2D tertutup ke dirinya sendiri pasti memiliki setidaknya satu titik tetap x* sedemikian hingga f(x*) = x*. Bukti elegannya bertumpu pada kemustahilan adanya retraksi kontinu r: D^2 -> S^1 karena pi_1(D^2) = 0 sedangkan pi_1(S^1) = Z.
                       - Teori Homologi Singular H_n(X): Menggeneralisasi konsep rongga lubang berdimensi tinggi n melalui grup rantai, operator batas partial_n (dengan partial^2 = 0), dan grup siklus per batas H_n = Ker(partial_n) / Im(partial_{n+1}).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Topologi Aljabar bertindak sebagai kamus penerjemah: masalah topologi yang mustahil divisualisasikan diterjemahkan menjadi aljabar grup yang dapat dihitung secara komputasi.",
                    "Grup fundamental mendeteksi lubang 1 dimensi: seutas tali melingkar yang mengelilingi tiang tidak akan pernah bisa ditarik lepas tanpa memutus talinya.",
                    "Teorema Titik Tetap Brouwer membuktikan bahwa saat kita mengaduk secangkir kopi, selalu ada setidaknya satu partikel kopi yang berakhir tepat di koordinat semula.",
                    "Sifat funktorial menjamin jika dua ruang homeomorfis X ~ Y, maka grup fundamentalnya pasti isomorfis pi_1(X) ~ pi_1(Y)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Grup Fundamental Lingkaran",
                        latex = "\\pi_1(S^1, x_0) \\cong \\mathbb{Z}",
                        explanation = "Kelas homotopi loop pada lingkaran dicirikan secara unik oleh bilangan bulat putaran (winding number) mengelilingi pusat lubang."
                    ),
                    FormulaCard(
                        title = "Teorema Seifert-van Kampen",
                        latex = "\\pi_1(U \\cup V) \\cong \\pi_1(U) *_{\\pi_1(U \\cap V)} \\pi_1(V)",
                        explanation = "Grup fundamental gabungan dua ruang adalah produk bebas tergabung dari masing-masing grup fundamentalnya modulo relasi irisan."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Perencanaan Lintasan Robot Otonom Bebas Tabrakan Menggunakan Ruang Konfigurasi Homotopi",
                    scenario = "Robot lengan industri bergerak di antara rintangan-rintangan fisik pabrik perakitan mobil untuk memindahkan komponen tanpa menabrak halangan.",
                    application = "Insinyur robotika memetakan ruang gerak bebas rintangan (C-free space). Kelas homotopi jalur dalam grup fundamental pi_1(C-free) mempartisi lintasan menjadi rute-rute topologis yang berbeda secara kualitatif (misal melewati rintangan dari kiri vs dari kanan). Algoritma perencanaan gerak memilih kelas homotopi terpendek secara analitik sebelum mengoptimalkan profil percepatan dinamik motor servo.",
                    impact = "Mencegah tabrakan lengan robot industri dan mengoptimalkan kecepatan siklus perakitan manufaktur otomatis."
                ),
                homeLab = HomeLabData(
                    title = "Pembuktian Teorema Titik Tetap Brouwer Menggunakan Dua Lembar Kertas Identik",
                    objective = "Membuktikan secara fisik eksistensi titik tetap koordinat di bawah pemetaan kontinu sembarang pada lembaran 2D.",
                    materials = listOf("Dua lembar kertas HVS ukuran A4 identik", "Pulpen"),
                    steps = listOf(
                        "Letakkan lembar kertas A mendatar rapi di atas meja (merepresentasikan domain asli).",
                        "Ambil lembar kertas B yang identik, remas-remas kertas B menjadi bola kusut padat (peregangan dan penekukan kontinu tanpa merobek).",
                        "Letakkan bola kertas B yang kusut tersebut di mana saja di atas permukaan lembar kertas A (pastikan tidak keluar dari batas tepi kertas A).",
                        "Berdasarkan Teorema Titik Tetap Brouwer: Pasti ada setidaknya SATU titik atom serat pada kertas B kusut yang posisinya tepat tegak lurus vertikal berada di atas titik pasangannya yang identik pada kertas A!",
                        "Diskusikan mengapa kontinuitas dan kekompakan domain menjamin keberadaan titik tetap ini tanpa kecuali."
                    ),
                    safetyNote = "Praktikum konsep matematika meja kerja yang memukau dan aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Manakah di antara ruang-ruang topologi berikut yang memiliki Grup Fundamental bersifat trivial (pi_1(X) = {0}), yang berarti setiap loop tertutup di dalamnya dapat diciutkan menjadi satu titik (simply connected)?",
                        options = listOf(
                            "Bola dua dimensi (2-sphere S^2: kulit bola berongga)",
                            "Lingkaran satu dimensi (1-sphere S^1)",
                            "Torus donat kue (T^2)",
                            "Silinder tanpa tutup"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Pada permukaan bola S^2, seutas tali melingkar yang diletakkan di khatulistiwa selalu dapat digeser meluncur ke kutub utara dan diciutkan hingga menjadi satu titik tunggal tanpa terhalang lubang (karena dimensi bola adalah 2D tertutup tanpa lubang interior 1D). Sebaliknya, pada lingkaran S^1, torus T^2, dan silinder, loop yang melingkari lubang tidak dapat diciutkan tanpa merobek kurva.",
                        misconceptionAlert = "Banyak yang mengira S^2 berlubang karena memiliki ruang hampa di dalamnya; namun lubang pada S^2 adalah rongga 2D (dideteksi oleh homologi H2), bukan lubang 1D yang dideteksi oleh grup fundamental pi_1."
                    )
                )
            )

            "mat-pde-non-linear-sobolev" -> LessonData(
                conceptId = "mat-pde-non-linear-sobolev",
                simId = "sim-sobolev-lyapunov-pde",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, persamaan hidrodinamika Navier-Stokes untuk aliran fluida turbulen dan gelombang tsunami memiliki suku konveksi non-linear u * nabla(u). Mengapa persamaan non-linear ini sangat sulit dibuktikan keberadaan solusinya?",
                        narrativeContext = "Dimas membaca tentang Hadiah Millennium Clay Mathematics untuk Persamaan Navier-Stokes."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena turunan klasik Newton mensyaratkan fungsi harus mulus halus! Gelombang kejut (shock waves) fluida menghasilkan patahan diskontinuitas di mana turunan biasa tidak ada. Sergei Sobolev memecahkannya dengan Turunan Lemah (Weak Derivatives) dan Ruang Sobolev W^{k,p}!",
                        narrativeContext = "Kakek menuliskan definisi turunan lemah menggunakan fungsi uji mulus integral parsial."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk stabilitas sistem dinamik non-linear tanpa harus mencari solusi eksplisitnya, Metode Kestabilan Lyapunov membuktikan bahwa jika energi sistem V(x) selalu berkurang terhadap waktu (V_dot < 0), sistem pasti stabil asimtotik!",
                        narrativeContext = "Kirana menggambar fungsi potensial mangkuk Lyapunov V(x) dengan lintasan mengkerut menuju titik asal."
                    )
                ),
                intuitionBody = """
                    Persamaan Diferensial Lanjut membedah keberadaan, ketunggalan, keteraturan, dan stabilitas solusi persamaan diferensial parsial (PDE) non-linear melalui analisis fungsional modern dan teori ruang Sobolev.
                    
                    1. Teori Eksistensi Picard-Lindelöf & Kestabilan Lyapunov:
                       - Teorema Picard-Lindelöf: Masalah nilai awal ODE dy/dt = f(t, y) memiliki solusi lokal unik jika f kontinu dan memenuhi kondisi kontinuitas Lipschitz ||f(t, y1) - f(t, y2)|| <= L ||y1 - y2||.
                       - Teori Kestabilan Lyapunov (Sistem Non-linear dx/dt = f(x)):
                         Titik ekuilibrium x* = 0 stabil asimtotik jika terdapat fungsi skalar definit positif V(x) > 0 (fungsi Lyapunov) sedemikian hingga turunan orbit waktunya definit negatif:
                         dV/dt = grad V(x) . f(x) < 0 untuk semua x != 0.
                       
                    2. Teori Distribusi & Turunan Lemah (Weak Derivatives):
                       Fungsi lokal terintegralkan u memiliki turunan lemah v = partial^alpha u jika untuk setiap fungsi uji mulus bertumpuan kompak phi in C_c^inf(Omega):
                       integral_Omega u * partial^alpha(phi) dx = (-1)^|alpha| * integral_Omega v * phi dx.
                       Konsep ini melegitimasi kalkulus pada fungsi berundak, gelombang kejut diskontinu, dan distribusi delta Dirac.
                       
                    3. Ruang Sobolev W^{k,p}(Omega) dan H^k(Omega):
                       Ruang fungsi terukur L^p yang seluruh turunan lemahnya hingga orde k juga berada di dalam L^p:
                       Norma Sobolev: ||u||_{W^{k,p}} = ( sum_{|alpha| <= k} ||partial^alpha u||_{L^p}^p )^(1/p).
                       Untuk p = 2, ruang Sobolev H^k = W^{k,2} adalah Ruang Hilbert yang lengkap.
                       - Teorema Pembenaman Sobolev (Sobolev Embedding Theorems): Mengatur kapan fungsi di ruang Sobolev otomatis kontinu klasik (misal H^s(R^n) subset C^0 jika s > n/2).
                       - Ketaksamaan Poincaré: ||u||_{L^2} <= C * ||nabla u||_{L^2} untuk fungsi yang lenyap di perbatasan (H0^1).
                       
                    4. Formulasi Lemah & Teorema Lax-Milgram:
                       Mengubah masalah batas nilai tepi PDE eliptik -nabla.(a nabla u) = f menjadi persamaan bentuk bilinear:
                       B(u, v) = l(v) untuk semua v in H0^1.
                       Teorema Lax-Milgram menjamin eksistensi dan ketunggalan solusi lemah jika bentuk bilinear B koersif dan kontinu, menjadi fondasi teoretis mutlak dari Metode Elemen Hingga (Finite Element Method / FEM).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Turunan lemah memindahkan operasi turunan dari fungsi u yang kasar ke fungsi uji phi yang mulus tak hingga menggunakan integral parsial.",
                    "Fungsi Lyapunov membuktikan stabilitas sistem kompleks murni dari prinsip disipasi energi tanpa perlu menyelesaikan persamaan diferensialnya.",
                    "Ruang Sobolev adalah habitat alamiah di mana solusi persamaan diferensial parsial fisika nyata hidup dan bernapas.",
                    "Teorema Lax-Milgram menghubungkan geometri proyeksi ruang Hilbert Riesz dengan eksistensi solusi persamaan diferensial parsial eliptik."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Definisi Turunan Lemah Distribusi Schwartz",
                        latex = "\\int_\\Omega u \\, \\partial^\\alpha \\phi \\, dx = (-1)^{|\\alpha|} \\int_\\Omega v \\, \\phi \\, dx, \\quad \\forall \\phi \\in C_c^\\infty(\\Omega)",
                        explanation = "Fungsi v disebut turunan lemah multi-indeks alpha dari u jika memenuhi integrasi parsial terhadap semua fungsi uji mulus phi."
                    ),
                    FormulaCard(
                        title = "Teorema Kestabilan Asimtotik Lyapunov",
                        latex = "V(\\mathbf{x}) > 0, \\quad \\dot{V}(\\mathbf{x}) = \\nabla V(\\mathbf{x}) \\cdot \\mathbf{f}(\\mathbf{x}) < 0 \\implies \\lim_{t\\to\\infty} \\mathbf{x}(t) = \\mathbf{0}",
                        explanation = "Jika energi potensial Lyapunov V definit positif dan laju perubahannya terdisipasi negatif, titik ekuilibrium stabil asimtotik."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Analisis Kestabilan Jaringan Tenaga Listrik Cerdas Jam Sibuk PLN Jawa-Bali",
                    scenario = "Jaringan interkoneksi transmisi listrik 500 kV Jawa-Bali mengalami fluktuasi sudut rotor generator non-linear saat terjadi gangguan petir mendadak.",
                    application = "Insinyur sistem tenaga memodelkan dinamika frekuensi dan sudut fasa jaringan menggunakan persamaan ayunan non-linear (swing equations). Dengan mengkonstruksi Fungsi Energi Lyapunov Luré-Postnikov V(delta, omega) yang menggabungkan energi kinetik rotor dan energi potensial magnetik saluran, batas stabilitas transien kritis (Critical Clearing Time) dihitung secara real-time untuk memicu pemutus sirkuit proteksi sebelum terjadi pelepasan beban kaskade.",
                    impact = "Mencegah fenomena blackout pemadaman listrik total bagi 150 juta penduduk di Pulau Jawa dan Bali."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Kestabilan Mangkuk Lyapunov Menggunakan Kelereng dan Wadah Cekung",
                    objective = "Memvisualisasikan konsep kestabilan asimtotik Lyapunov di mana disipasi energi gesekan menstabilkan sistem ke titik minimum.",
                    materials = listOf("Mangkuk sup cekung licin (fungsi potensial V(x) = x^2/2)", "Satu butir kelereng kaca"),
                    steps = listOf(
                        "Letakkan kelereng di dasar mangkuk (titik ekuilibrium x* = 0, V(0) = 0).",
                        "Lepaskan kelereng dari tepi atas mangkuk (gangguan awal x0 != 0, V(x0) > 0).",
                        "Amati gerakan kelereng: kelereng berosilasi bolak-balik namun amplitudonya terus mengecil terdisipasi gesekan udara dan permukaan (dV/dt < 0).",
                        "Amati bagaimana kelereng pasti berhenti tepat di dasar mangkuk (kestabilan asimtotik).",
                        "Balik mangkuk menjadi cembung (V(x) = -x^2/2); letakkan kelereng di puncak; amati ketidakstabilan seketika saat dilarikan gaya gravitasi."
                    ),
                    safetyNote = "Praktikum konsep mekanika meja kerja, aman dan sangat visual."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa para matematikawan mendefinisikan 'Turunan Lemah' (Weak Derivatives) dan Ruang Sobolev dalam menyelesaikan Persamaan Diferensial Parsial fisika?",
                        options = listOf(
                            "Karena banyak fenomena fisik nyata (seperti gelombang kejut ledakan, batas fluida, dan retakan material) memiliki patahan diskontinu yang tidak memiliki turunan klasik biasa, namun memiliki turunan lemah yang terintegralkan",
                            "Karena turunan biasa terlalu sulit dihitung kalkulator",
                            "Karena Ruang Sobolev hanya berlaku untuk bilangan bulat negatif",
                            "Karena para ilmuwan ingin menghindari kalkulus integral"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Turunan klasik Newton-Leibniz menuntut limit beda diferensial ada di setiap titik (mensyaratkan fungsi mulus C^1 atau C^2). Banyak fenomena fisika seperti shock waves pada aerodinamika supersonik dan persamaan gelombang elastisitas material komposit menghasilkan solusi patah (non-differentiable secara klasik). Konsep turunan lemah Sobolev dan ruang Hilbert H^k melegitimasi kalkulus integrasi parsial pada fungsi-fungsi riil ini.",
                        misconceptionAlert = "Disebut turunan 'lemah' bukan karena tidak akurat, melainkan karena syarat kontinuitas pointwise-nya diperlemah ke tingkat integral."
                    )
                )
            )

            "mat-teori-kontrol-lqr-chaos" -> LessonData(
                conceptId = "mat-teori-kontrol-lqr-chaos",
                simId = "sim-control-lqr-chaos",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana roket Falcon 9 SpaceX atau roket pendorong satelit bisa mendarat tegak lurus kembali di atas kapal tongkang di tengah laut yang terombang-ambing ombak badai?",
                        narrativeContext = "Dimas melihat video pendaratan roket vertikal propulsif retro-propulsion yang stabil sempurna."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu dikendalikan oleh Teori Kontrol Optimal Modern, Dimas! Menggunakan Linear Quadratic Regulator (LQR) dalam formulasi Ruang Keadaan (State-Space), komputer roket menyeimbangkan deviasi kemiringan roket dengan pemakaian semprotan bahan bakar gimbal terkecil.",
                        narrativeContext = "Kakek menuliskan persamaan Riccati aljabar matriks dan kriteria keterkontrolan Kalman."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Namun jika sistem non-linear memiliki sensitivitas ekstrem terhadap kondisi awal, Teori Chaos Edward Lorenz membuktikan bahwa 'kepakan sayap kupu-kupu di Brasil dapat memicu badai tornado di Texas'—membuat prediksi cuaca jangka panjang menjadi mustahil deterministik!",
                        narrativeContext = "Kirana memperlihatkan atraktor aneh kupu-kupu Lorenz (Lorenz Strange Attractor)."
                    )
                ),
                intuitionBody = """
                    Teori Kontrol Modern dan Teori Sistem Dinamik mempelajari bagaimana mengarahkan perilaku sistem multivariabel kompleks menuju target optimal, serta memahami batasan batas prediksi akibat fenomena kekacauan deterministik (Chaos).
                    
                    1. Representasi Ruang Keadaan (State-Space Representation):
                       Sistem linear multivariabel orde tinggi dimodelkan sebagai sistem persamaan diferensial matriks orde 1:
                       dx/dt = A*x(t) + B*u(t) (persamaan keadaan).
                       y(t) = C*x(t) + D*u(t) (persamaan keluaran).
                       - Matriks Keterkontrolan Kalman (Controllability):
                         C_mat = [B | AB | A^2B | ... | A^(n-1)B]. Sistem terkontrol penuh (controllable) jika rank(C_mat) = n (input u mampu memindahkan keadaan dari sebarang titik awal ke sebarang titik akhir dalam waktu berhingga).
                       - Matriks Keteramatan Kalman (Observability):
                         O_mat = [C; CA; CA^2; ...; CA^(n-1)]. Sistem teramati penuh (observable) jika rank(O_mat) = n (seluruh keadaan internal x dapat direkonstruksi murni dari data sensor keluaran y).
                       
                    2. Pengatur Linear Kuadratik Optimal (Linear Quadratic Regulator / LQR):
                       Mencari hukum umpan balik keadaan optimal u(t) = -K * x(t) yang meminimumkan fungsi biaya kuadratik tak hingga:
                       J = integral_0^inf [ x^T * Q * x + u^T * R * u ] dt.
                       - Matriks Q >= 0: Menghukum penyimpangan status keadaan x dari titik nol.
                       - Matriks R > 0: Menghukum pemborosan energi kontrol input u.
                       Vektor penguatan optimal K = R^(-1) * B^T * P, di mana matriks simetris P definit positif diselesaikan dari Persamaan Aljabar Riccati (Algebraic Riccati Equation / ARE):
                       A^T * P + P * A - P * B * R^(-1) * B^T * P + Q = 0.
                       
                    3. Teori Kekacauan Deterministik & Atraktor Aneh (Chaos Theory):
                       Ditemukan oleh Edward Lorenz (1963) pada konveksi atmosfer 3D:
                       dx/dt = sigma*(y - x), dy/dt = x*(rho - z) - y, dz/dt = x*y - beta*z.
                       Ciri Khas Sistem Kaotik:
                       - Deterministik: Tidak mengandung unsur acak probabilitas apa pun.
                       - Sensitivitas Ekstrem terhadap Kondisi Awal (Efek Kupu-kupu): Dua lintasan dengan selisih awal delta_x0 sekecil 10^(-15) akan terpisah menjauh secara eksponensial seiring waktu: |delta_x(t)| ~ |delta_x0| * e^(lambda * t), di mana lambda > 0 adalah Eksponen Lyapunov Positif.
                       - Atraktor Aneh (Strange Attractor): Lintasan fase tidak pernah memotong dirinya sendiri dan tidak pernah berulang periodik, melainkan terperangkap pada manifold fraktal berdimensi non-bulat Hausdorff.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Formulasi ruang keadaan state-space mengubah rangkaian diagram blok kontrol frekuensi Laplace menjadi aljabar matriks multivariabel terpadu.",
                    "LQR menyeimbangkan trade-off abadi rekayasa: seberapa agresif kita ingin memperbaiki galat versus seberapa hemat energi bahan bakar aktuator.",
                    "Keterkontrolan Kalman membuktikan apakah aktuator yang kita pasang memiliki otoritas fisik untuk mengendalikan seluruh ragam gerak sistem.",
                    "Teori Chaos membuktikan bahwa determinisme tidak sama dengan prediktabilitas: masa depan dapat ditentukan secara eksak oleh hukum fisika namun tetap mustahil diprediksi jangka panjang."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Aljabar Riccati Kontrol Optimal LQR",
                        latex = "\\mathbf{A}^T \\mathbf{P} + \\mathbf{P}\\mathbf{A} - \\mathbf{P}\\mathbf{B}\\mathbf{R}^{-1}\\mathbf{B}^T\\mathbf{P} + \\mathbf{Q} = \\mathbf{0}, \\quad \\mathbf{K} = \\mathbf{R}^{-1}\\mathbf{B}^T\\mathbf{P}",
                        explanation = "Persamaan matriks kuadratik penentu matriks P yang menghasilkan matriks gain umpan balik keadaan optimal K."
                    ),
                    FormulaCard(
                        title = "Divergensi Eksponensial Eksponen Lyapunov Chaos",
                        latex = "|\\Delta \\mathbf{x}(t)| \\approx |\\Delta \\mathbf{x}_0| e^{\\lambda t}, \\quad \\lambda > 0 \\implies \\text{Sistem Kaotik Deterministik}",
                        explanation = "Eksponen Lyapunov positif lambda mengukur laju pemisahan eksponensial lintasan fase yang membatasi horison prediksi waktu."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Sistem Kendali Sikap (Attitude Control) & Pemanduan Roket Peluncur Satelit BRIN LAPAN",
                    scenario = "Roket peluncur bertingkat melesat menembus atmosfer mengalami hembusan angin geser lateral (wind shear) yang memicu ketidakstabilan orientasi sudut yaw dan pitch.",
                    application = "Insinyur kedirgantaraan memodelkan dinamika aerodinamika roket ke dalam matriks state-space 12 variabel keadaan (kecepatan sudut, sudut Euler, posisi, laju linier). Algoritma kontroler LQR adaptif onboard memproses data sensor giroskop unit pengukuran inersia (IMU) pada 500 Hz dan menggerakkan aktuator sirip aerodinamis dan gimbal nosel mesin untuk mempertahankan orientasi lintasan peluncuran presisi dengan konsumsi bahan bakar propelan minimum.",
                    impact = "Menjamin roket mencapai orbit ketinggian 500 km secara selamat dan menempatkan muatan satelit komunikasi nasional pada slot orbitnya."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Bandul Ganda (Double Pendulum) Pengamatan Transisi Menuju Kekacauan Kaotik",
                    objective = "Mengamati fenomena sensitivitas ekstrem terhadap kondisi awal pada sistem mekanika sederhana deterministik berderajat kebebasan dua.",
                    materials = listOf("Dua batang penggaris plastik berlubang", "Dua baut kecil / paku poros putar", "Papan penyangga kayu", "Kamera ponsel"),
                    steps = listOf(
                        "Rangkai kedua penggaris menjadi bandul ganda: ujung penggaris 1 dipasang ke poros statis papan, ujung bawahnya dipasangi poros penggaris 2.",
                        "Ayunkan bandul ganda dari simpangan sudut kecil (< 15 derajat); amati gerak harmonik teratur yang dapat diprediksi.",
                        "Kini angkat kedua penggaris ke sudut tinggi (> 90 derajat) dan lepaskan.",
                        "Amati gerak jungkir-balik liar yang sangat kompleks, tak terduga, dan tampak kacau balau!",
                        "Ulangi pelepasan dari sudut yang diusahakan sama persis; rekam video dan bandingkan: amati bagaimana perbedaan sudut awal sekecil 1 milimeter menghasilkan lintasan putaran yang berbeda total setelah 3 detik (efek kupu-kupu chaos!)."
                    ),
                    safetyNote = "Pastikan baut poros terpasang kuat agar penggaris tidak terlempar lepas saat berayun kencang."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah kriteria matematis mutlak yang mendefinisikan bahwa suatu sistem dinamik non-linear bersifat kaotik deterministik (deterministic chaos)?",
                        options = listOf(
                            "Sistem memiliki setidaknya satu Eksponen Lyapunov Positif (lambda > 0), yang menyebabkan dua lintasan awal yang sangat berdekatan terpisah menjauh secara eksponensial seiring waktu pada ruang fase terbatas",
                            "Sistem dikendalikan oleh generator angka acak dadu",
                            "Sistem berhenti bergerak seketika",
                            "Sistem selalu berupa garis lurus"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Sistem kaotik sepenuhnya diatur oleh persamaan diferensial deterministik tanpa faktor keacakan probabilistik (bukan acak murni). Ciri matematis intinya adalah sensitivitas eksponensial terhadap kondisi awal yang dikuantifikasi oleh eksponen Lyapunov maksimum positif (lambda > 0), yang menyebabkan ketidakpastian pengukuran awal sekecil apa pun membesar secara eksponensial hingga menghancurkan seluruh kemampuan prediksi jangka panjang.",
                        misconceptionAlert = "Kaotik (chaos) tidak sama dengan acak (random); sistem kaotik memiliki hukum deterministik presisi dan struktur fraktal yang sangat teratur di ruang fase (atraktor aneh)."
                    )
                )
            )

            "mat-proses-stokastik-ito" -> LessonData(
                conceptId = "mat-proses-stokastik-ito",
                simId = "sim-ito-calculus-stochastic",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, di kalkulus biasa turunan dari gerak x(t) adalah kecepatan dx/dt. Tapi lintasan partikel gerak Brown atau grafik harga saham berfluktuasi begitu kasar dan bergerigi di setiap titik sehingga tidak memiliki turunan di mana pun! Bagaimana kita mengintegrasikannya?",
                        narrativeContext = "Dimas memandangi lintasan fraktal gerak Brown yang kontinu di mana-mana namun tidak diferensiabel di titik mana pun."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Kiyosi Itô menciptakan Kalkulus Stokastik (Itô Calculus), Dimas! Perubahan diferensial gerak Brown kuadratik bernilai non-nol: (dB_t)^2 = dt! Suku kuadratik yang tidak bisa diabaikan ini melahirkan Lemma Itô.",
                        narrativeContext = "Kakek menuliskan aturan rantai kalkulus Itô df = f'(x) dx + 1/2 f''(x) (dx)^2."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan menggunakan Persamaan Diferensial Stokastik (SDE) Black-Scholes-Merton, seluruh industri rekayasa keuangan derivatif global dan opsi harga saham dunia dimodelkan secara matematis!",
                        narrativeContext = "Kirana memperlihatkan persamaan Black-Scholes dS = mu*S dt + sigma*S dB_t dan solusi opsi harga wajar."
                    )
                ),
                intuitionBody = """
                    Kalkulus Stokastik Itô memperluas metode diferensial dan integral kalkulus klasik ke fungsi acak non-diferensiabel kasar (proses gerak Brown Wiener dan Martingale).
                    
                    1. Proses Wiener (Gerak Brown Baku W_t atau B_t):
                       Proses stokastik kontinu waktu t >= 0 dengan sifat:
                       - W_0 = 0 hampir pasti.
                       - Kenaikan Bebas (Independent Increments): W_{t+u} - W_t independen dari riwayat masa lalu s <= t.
                       - Kenaikan Berdistribusi Normal Stasioner: W_{t+u} - W_t ~ N(0, u).
                       - Sifat Trajektori: Kontinu hampir di mana-mana, namun tidak dapat diturunkan di titik mana pun (nowhere differentiable) dengan probabilitas 1, serta memiliki variasi kuadratik terhingga non-nol: [W, W]_t = t.
                       
                    2. Integral Stokastik Itô:
                       integral_0^t f(s) dB_s didefinisikan sebagai limit jumlah Riemann yang dievaluasi tepat di titik ujung kiri interval t_i (non-anticipating / teradaptasi terhadap filtrasi F_t):
                       Sifat Fundamental: Nilai ekspektasi integral Itô selalu bernilai nol E[integral f dB] = 0 (merupakan Martingale), dan mematuhi Isometri Itô:
                       E[ (integral_0^t f(s) dB_s)^2 ] = integral_0^t E[ f(s)^2 ] ds.
                       
                    3. Aturan Rantai Lemma Itô:
                       Jika X_t mematuhi Persamaan Diferensial Stokastik (SDE): dX_t = mu_t dt + sigma_t dB_t.
                       Maka fungsi mulus f(t, X_t) mematuhi diferensial Itô dengan suku koreksi turunan kedua (Itô correction term):
                       df(t, X_t) = partial_t f dt + partial_x f dX_t + (1/2) partial_xx f (dX_t)^2.
                       Dengan aturan perkalian formal tabel Itô:
                       (dB_t)^2 = dt, dB_t * dt = 0, (dt)^2 = 0.
                       Sehingga:
                       df = [ partial_t f + mu * partial_x f + (1/2) sigma^2 partial_xx f ] dt + [ sigma * partial_x f ] dB_t.
                       
                    4. Aplikasi: Persamaan Gerak Brown Geometris Black-Scholes:
                       Harga aset finansial S_t dimodelkan: dS_t = mu * S_t dt + sigma * S_t dB_t.
                       Dengan menerapkan Lemma Itô pada fungsi f(S) = ln(S_t):
                       d(ln S_t) = (mu - 1/2 sigma^2) dt + sigma dB_t.
                       Integrasi menghasilkan solusi analitik eksak log-normal: S_t = S_0 * exp( (mu - 1/2 sigma^2) t + sigma B_t ).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Aturan kalkulus klasik df = f'(x) dx gagal total pada proses stokastik karena suku kuadratik (dB)^2 sebanding dengan dt sehingga wajib dipertahankan.",
                    "Evaluasi titik ujung kiri pada integral Itô mencegah kebocoran informasi masa depan (non-anticipative), menjamin sifat martingale bebas arbitrase.",
                    "Suku koreksi Itô -1/2*sigma^2 menjelaskan mengapa pertumbuhan rata-rata geometris selalu lebih rendah dibandingkan rata-rata aritmatika akibat volatilitas acak.",
                    "Kalkulus Itô adalah bahasa matematika resmi seluruh perbankan kuantitatif Wall Street, manajemen risiko investasi, dan fisika fluida turbulen stokastik."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Lemma Itô Diferensial Satu Dimensi",
                        latex = "df(t, X_t) = \\left( \\frac{\\partial f}{\\partial t} + \\mu \\frac{\\partial f}{\\partial x} + \\frac{1}{2} \\sigma^2 \\frac{\\partial^2 f}{\\partial x^2} \\right) dt + \\sigma \\frac{\\partial f}{\\partial x} \\, dB_t",
                        explanation = "Aturan rantai kalkulus stokastik dengan suku koreksi kelengkungan kuadratik 1/2 sigma^2 f'' akibat (dB)^2 = dt."
                    ),
                    FormulaCard(
                        title = "Solusi Gerak Brown Geometris (GBM)",
                        latex = "S_t = S_0 \\exp\\left( \\left(\\mu - \\frac{1}{2}\\sigma^2\\right) t + \\sigma B_t \\right)",
                        explanation = "Model dinamika harga aset log-normal analitik eksak dengan laju hanyutan mu dan volatilitas sigma."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Penetapan Harga Opsi Valuta Asing Hedging Nilai Tukar Rupiah-USD di Bank Indonesia",
                    scenario = "Bank Indonesia dan perbankan BUMN nasional melakukan lindung nilai (hedging) cadangan devisa terhadap volatilitas fluktuasi kurs Rupiah terhadap Dolar AS (USD/IDR).",
                    application = "Kuantitatif analis Bank Indonesia memodelkan dinamika nilai tukar menggunakan SDE Gerak Brown Geometris dengan lompatan Poisson (Jump-Diffusion). Dengan memanfaatkan Lemma Itô dan ukuran netral risiko martingal Q, persamaan diferensial parsial Black-Scholes-Merton dipecahkan untuk menghitung premi wajar kontrak opsi lindung nilai valas, memitigasi risiko lonjakan utang luar negeri saat terjadi depresiasi mendadak mata uang.",
                    impact = "Menjaga stabilitas moneter makroekonomi nasional dan ketahanan cadangan devisa Indonesia dari guncangan pasar keuangan global."
                ),
                homeLab = HomeLabData(
                    title = "Simulasi Lintasan Gerak Brown Baku dan SDE Harga Saham Menggunakan Spreadsheet Komputer",
                    objective = "Membangun satu lintasan proses Wiener W_t secara diskrit dan membuktikan bahwa variansi kuadratiknya sebanding dengan waktu t.",
                    materials = listOf("Komputer dengan Microsoft Excel / Google Sheets", "Kertas grafik"),
                    steps = listOf(
                        "Di kolom A, buat langkah waktu diskrit t = 0, 1, 2, ..., 100 dengan dt = 0.01.",
                        "Di kolom B, bangkitkan kenaikan acak normal Gaussian dW = NORM.INV(RAND(), 0, SQRT(0.01)).",
                        "Di kolom C, hitung lintasan akumulatif W_t dengan menjumlahkan baris-baris dW (W_{t+1} = W_t + dW).",
                        "Plot kurva grafik kolom C terhadap waktu; amati bentuk lintasan yang bergerigi kontinu laksana grafik harga saham riil.",
                        "Di kolom D, terapkan rumus Black-Scholes S_t = 100 * EXP((0.05 - 0.5*0.2^2)*t + 0.2*W_t); amati dinamika harga saham geometris non-negatif yang realistis.",
                        "Tekan tombol F9 (recalculate) beberapa kali; amati bagaimana setiap realisasi menghasilkan lintasan acak unik namun memiliki tren statistik yang sama."
                    ),
                    safetyNote = "Praktikum simulasi spreadsheet finansial mandiri, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Dalam kalkulus stokastik Itô, mengapakah suku diferensial kuadratik (dB_t)^2 tidak boleh diabaikan menjadi nol seperti halnya dalam kalkulus diferensial Newton biasa di mana (dt)^2 = 0?",
                        options = listOf(
                            "Karena kenaikan gerak Brown dB_t memiliki skala besaran sebanding dengan akar kuadrat waktu sqrt(dt), sehingga kuadratnya (dB_t)^2 menghasilkan besaran orde satu dt yang memiliki bobot riil terhadap suku waktu",
                            "Karena angka kuadrat selalu bernilai negatif",
                            "Karena kalkulus Itô tidak menggunakan angka nol",
                            "Karena gerak Brown bergerak mundur ke masa lalu"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Pada proses Wiener baku, variansi dari kenaikan dB_t adalah E[(dB_t)^2] = dt. Artinya, besaran tipikal dari dB_t adalah sekitar sqrt(dt). Dalam ekspansi deret Taylor, suku (dB_t)^2 menghasilkan suku berorde dt^1 (bukan dt^2 yang kecil tak berarti). Karena berorde sama dengan dt, suku turunan kedua ini wajib dipertahankan dalam aturan rantai, melahirkan suku koreksi 1/2*sigma^2*f'' pada Lemma Itô.",
                        misconceptionAlert = "Jika seseorang menerapkan aturan rantai kalkulus klasik df = f' dX pada proses gerak Brown tanpa menyertakan suku koreksi Itô, hasil perhitungannya akan salah total secara matematis dan finansial."
                    )
                )
            )

            "mat-matematika-ai-ml-optimasi" -> LessonData(
                conceptId = "mat-matematika-ai-ml-optimasi",
                simId = "sim-math-ai-kkt-information",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, model AI generatif (seperti ChatGPT atau model difusi gambar) memiliki ratusan miliar bobot parameter. Bagaimana matematika menjamin bahwa proses pelatihan gradien konvergen dan model tidak menghafal data (overfitting)?",
                        narrativeContext = "Dimas memandangi kurva penurunan fungsi kerugian (Loss Function) model deep learning saat pelatihan."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Fondasi teoritisnya dibangun di atas tiga pilar matematika murni: Optimasi Konveks (Kondisi KKT), Teori Informasi Shannon (Entropi & Divergensi KL), dan Teori Pembelajaran Statistik (Batas Dimensi VC), Dimas!",
                        narrativeContext = "Kakek menuliskan kondisi Karush-Kuhn-Tucker dan fungsi divergensi Kullback-Leibler D_KL(P || Q)."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan Inferensi Bayesian modern menggunakan rantai Markov Monte Carlo (MCMC) dan Variational Inference (VI) untuk memetakan distribusi ketidakpastian posterior bobot parameter secara terukur!",
                        narrativeContext = "Kirana memaparkan perbandingan bukti batas bawah Evidence Lower Bound (ELBO) pada model AI generatif VAE."
                    )
                ),
                intuitionBody = """
                    Fondasi Matematika Kecerdasan Buatan dan Pembelajaran Mesin (AI/ML) memadukan optimasi konveks, teori informasi, statistika Bayesian berdimensi tinggi, dan teori pembelajaran statistik.
                    
                    1. Optimasi Konveks & Kondisi Karush-Kuhn-Tucker (KKT):
                       Meminimalkan fungsi konveks f0(x) terhadap kendala pertidaksamaan f_i(x) <= 0 dan kesetaraan h_j(x) = 0:
                       Fungsi Lagrangian: L(x, lambda, nu) = f0(x) + sum lambda_i * f_i(x) + sum nu_j * h_j(x).
                       Kondisi Optimalitas KKT (perlu dan cukup untuk masalah konveks teratur Slater):
                       - Titik Stasioner: grad_x L = grad f0(x*) + sum lambda_i* grad f_i(x*) + sum nu_j* grad h_j(x*) = 0.
                       - Kelayakan Primal: f_i(x*) <= 0 dan h_j(x*) = 0.
                       - Kelayakan Dual: lambda_i* >= 0.
                       - Kelonggaran Komplementer (Complementary Slackness): lambda_i* * f_i(x*) = 0 (jika kendala tidak aktif f_i < 0, maka pengali Lagrange lambda_i harus bernilai tepat nol, membuktikan konsep vektor pendukung Support Vector pada SVM!).
                       
                    2. Teori Informasi Matematika (Shannon Information Theory):
                       - Entropi Shannon H(X) = -sum P(x) * log2 P(x): Mengukur ketidakpastian rata-rata informasi yang termuat dalam variabel acak.
                       - Entropi Silang (Cross-Entropy Loss): H(P, Q) = -sum P(x) * log Q(x), fungsi kerugian standar seluruh klasifikasi deep learning.
                       - Divergensi Kullback-Leibler (KL Divergence): D_KL(P || Q) = sum P(x) * log(P(x) / Q(x)) >= 0 (Ketaksamaan Gibbs). Mengukur jarak asimetris informasi antara distribusi sejati P dan pendekatan Q, menjadi objektif utama pelatihan model difusi dan VAE melalui pemaksimalan ELBO.
                       
                    3. Statistika Bayesian Lanjut & MCMC:
                       Teorema Bayes Posterior: p(theta | D) = p(D | theta) * p(theta) / p(D).
                       Karena bukti p(D) = integral p(D | theta) p(theta) dtheta adalah integral berdimensi tinggi yang tak terhitung analitik, metode Markov Chain Monte Carlo (MCMC: Algoritma Metropolis-Hastings dan Hamiltonian Monte Carlo) membangkitkan sampel rantai Markov yang memiliki distribusi stasioner identik dengan posterior.
                       
                    4. Teori Pembelajaran Statistik & Batas Generalisasi Vapnik-Chervonenkis (VC):
                       Menjawab mengapa model dapat memprediksi data baru yang belum pernah dilihat:
                       Dengan probabilitas 1 - delta, galat uji aktual R(h) dibatasi oleh galat latih empiris R_emp(h):
                       R(h) <= R_emp(h) + sqrt( (8 * d_VC * ln(2e*N / d_VC) + 4 * ln(4/delta)) / N ), di mana d_VC adalah Dimensi VC yang mengukur kapasitas kompleksitas ruang hipotesis model.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Kelonggaran komplementer KKT menjelaskan mengapa Support Vector Machine (SVM) hanya mengandalkan sedikit titik data tepi perbatasan untuk memisahkan kelas.",
                    "Divergensi KL mengukur inefisiensi pengkodean jika kita mengasumsikan dunia mengikuti distribusi Q padahal kenyataannya mengikuti distribusi P.",
                    "Optimasi Stochastic Gradient Descent (SGD) pada dasarnya adalah pendekatan diskrit persamaan diferensial stokastik Langevin di lanskap loss berdimensi tinggi.",
                    "Batas dimensi VC membuktikan secara matematis hukum pencegahan overfitting: jumlah data sampel N harus tumbuh sebanding dengan kapasitas kompleksitas model."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Kondisi Kelonggaran Komplementer KKT",
                        latex = "\\lambda_i^* f_i(\\mathbf{x}^*) = 0, \\quad \\lambda_i^* \\ge 0, \\quad f_i(\\mathbf{x}^*) \\le 0",
                        explanation = "Kondisi optimalitas KKT yang menjamin pengali Lagrange bernilai nol jika kendala pertidaksamaan berada di dalam daerah batas."
                    ),
                    FormulaCard(
                        title = "Divergensi Relatif Kullback-Leibler (KL)",
                        latex = "D_{\\mathrm{KL}}(P \\parallel Q) = \\sum_{x} P(x) \\ln\\left( \\frac{P(x)}{Q(x)} \\right) \\ge 0",
                        explanation = "Ukuran non-negatif perbedaan informasi relatif antara distribusi probabilitas data sejati P dan distribusi model aproksimasi Q."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Optimasi Alokasi Spektrum Pita Frekuensi Seluler 5G Kominfo Menggunakan Algoritma KKT",
                    scenario = "Kementerian Komunikasi dan Digital (Komdigi) mengoptimalkan alokasi lebar pita frekuensi gelombang mikro 5G di area metropolitan padat Jakarta untuk memaksimalkan throughput data pelanggan dengan kendala interferensi daya sinyal.",
                    application = "Tim insinyur telekomunikasi memformulasikan masalah alokasi daya Shannon-Hartley sebagai optimasi konveks multivariabel berbobot. Dengan menerapkan kondisi KKT dan algoritma water-filling dualitas Lagrange, daya pancar menara BTS dialokasikan secara adaptif ke kanal-kanal dengan rasio signal-to-noise tertinggi, melipatgandakan efisiensi spektral tanpa melanggar batas regulasi radiasi elektromagnetik.",
                    impact = "Mencegah kemacetan jaringan seluler data saat jam sibuk dan memperluas cakupan layanan internet broadband berkecepatan tinggi nasional."
                ),
                homeLab = HomeLabData(
                    title = "Perhitungan Entropi Informasi Shannon dari Teks Kalimat Bahasa Indonesia Menggunakan Kalkulator",
                    objective = "Mengukur jumlah bit ketidakpastian informasi rata-rata per karakter huruf pada teks nyata.",
                    materials = listOf("Satu kalimat teks pendek (misal: 'SEMANGAT BELAJAR SAINS INDONESIA')", "Kertas catatan dan kalkulator"),
                    steps = listOf(
                        "Hitung total jumlah huruf pada kalimat (N = 31 karakter).",
                        "Hitung frekuensi kemunculan setiap huruf unik (misal huruf A muncul 6 kali, S muncul 4 kali, E muncul 2 kali, spasi muncul 3 kali, dst).",
                        "Hitung probabilitas empiris setiap karakter: p_i = frekuensi_i / N.",
                        "Hitung kontribusi entropi tiap karakter: -p_i * log2(p_i).",
                        "Jumlahkan seluruh nilai tersebut untuk memperoleh Entropi Shannon total H(X) dalam satuan bit/karakter.",
                        "Diskusikan mengapa kalimat dengan banyak huruf bervariasi memiliki nilai entropi lebih tinggi dibandingkan kalimat berulang satu huruf (misal 'AAAAAAA' yang memiliki entropi 0 bit!)."
                    ),
                    safetyNote = "Praktikum teori informasi meja kerja, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Dalam teori optimasi konveks dengan kendala pertidaksamaan f_i(x) <= 0, apakah arti fisik dari kondisi 'Kelonggaran Komplementer' (Complementary Slackness) lambda_i * f_i(x*) = 0 pada titik optimal x*?",
                        options = listOf(
                            "Jika kendala tersebut tidak aktif di titik optimal (f_i(x*) < 0, berada di dalam batas aman), maka pengali Lagrange-nya harus bernilai nol (lambda_i* = 0); pengali hanya boleh bernilai positif jika kendala tersebut tepat menyentuh batas (f_i(x*) = 0)",
                            "Semua pengali Lagrange harus selalu bernilai minus satu",
                            "Fungsi tujuan harus bernilai tak hingga",
                            "Fungsi kerugian tidak boleh memiliki turunan"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Kondisi complementary slackness lambda_i * f_i(x*) = 0 menyatakan bahwa tidak mungkin kedua besaran tersebut non-nol secara bersamaan. Jika kendala berada di pedalaman daerah fisibel (f_i < 0, batas tidak mengikat), keberadaan kendala tersebut tidak mempengaruhi nilai minimum lokal sehingga 'harganya' nol (lambda_i = 0). Ini adalah prinsip fundamental sparsity pada Support Vector Machines.",
                        misconceptionAlert = "Sering dikira semua kendala selalu mempengaruhi nilai solusi optimal, padahal hanya kendala aktif di permukaan perbatasanlah yang memiliki pengali Lagrange non-nol."
                    )
                )
            )

            "mat-kriptografi-kurva-eliptik" -> LessonData(
                conceptId = "mat-kriptografi-kurva-eliptik",
                simId = "sim-ecc-lattice-cryptography",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana transaksi perbankan digital di aplikasi mobile banking dan enkripsi pesan WhatsApp di ponsel kita bisa diamankan secara instan hanya dengan kunci sandi berukuran 256-bit yang sangat ringkas?",
                        narrativeContext = "Dimas melihat ikon gembok enkripsi end-to-end pada percakapan pesan digitalnya."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu diamankan oleh Kriptografi Kurva Eliptik (Elliptic Curve Cryptography / ECC), Dimas! Kunci ECC 256-bit memberikan tingkat keamanan yang setara dengan kunci RSA 3072-bit raksasa, karena memecahkan Masalah Logaritma Diskrit Kurva Eliptik (ECDLP) jauh lebih sulit daripada memfaktorkan bilangan biasa!",
                        narrativeContext = "Kakek menggambarkan aturan penambahan titik geometris pada kurva kubik y^2 = x^3 + ax + b di atas medan berhingga F_p."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk mengantisipasi ancaman komputer kuantum masa depan yang dapat meretas ECC dengan algoritma Shor, Badan Siber dan Sandi Negara (BSSN) kini bersiap beralih ke Kriptografi Pasca-Kuantum Berbasis Kisi (Lattice-Based Cryptography seperti Kyber dan Dilithium) yang kebal terhadap komputer kuantum!",
                        narrativeContext = "Kirana memaparkan masalah kekisi vektor terpendek (Shortest Vector Problem / SVP) dan masalah Learning With Errors (LWE)."
                    )
                ),
                intuitionBody = """
                    Kriptografi Kunci Publik Modern dan Teori Bilangan Lanjut melindungi seluruh infrastruktur digital dunia, memadukan geometri aljabar kurva eliptik dengan kekisi berdimensi tinggi tahan kuantum.
                    
                    1. Geometri Kurva Eliptik di Atas Medan Berhingga F_p:
                       Persamaan Weierstrass: E: y^2 = x^3 + a*x + b (mod p), dengan diskriminan Delta = 4*a^3 + 27*b^2 != 0 (mod p) untuk menjamin kurva tidak memiliki titik singular cusps atau self-intersection.
                       - Hukum Grup Penambahan Titik Geometris:
                         Dua titik P dan Q pada kurva dijumlahkan dengan menarik garis lurus melalui P dan Q; garis memotong kurva di titik ketiga R, lalu titik R dicerminkan terhadap sumbu-x menghasilkan P + Q = R'.
                         Jika P = Q, ditarik garis singgung tangen (Point Doubling). Titik di tak hingga O bertindak sebagai Unsur Identitas grup (P + O = P).
                       - Teorema Hasse: Jumlah titik terhingga pada kurva eliptik di atas F_p dibatasi oleh:
                         | #E(F_p) - (p + 1) | <= 2 * sqrt(p).
                       
                    2. Protokol Kriptografi ECC (ECDH & ECDSA):
                       - Masalah Logaritma Diskrit Kurva Eliptik (ECDLP): Diberikan titik basis generator G dan titik publik Q = d * G (penjumlahan titik G sebanyak d kali), mencari skalar kunci privat d adalah masalah komputasi yang sangat sulit (kompleksitas algoritma terbaik Pollard's rho O(sqrt(n))).
                       - Kurva Standar: secp256k1 (digunakan pada jaringan blockchain dan Bitcoin) dan Curve25519 (digunakan pada protokol enkripsi Signal/WhatsApp).
                       
                    3. Kriptografi Pasca-Kuantum Berbasis Kisi (Post-Quantum Lattice-Based Cryptography):
                       Karena algoritma kuantum Shor mampu memecahkan ECDLP dan RSA dalam waktu polinomial, NIST dan lembaga sandi global menetapkan standar enkripsi pasca-kuantum berbasis kekisi geometris (Lattices):
                       - Kisi (Lattice Lambda): Himpunan kombinasi linear bilangan bulat dari basis vektor bebas linear b1, b2, ..., bn di R^n: Lambda = { sum z_i b_i : z_i in Z }.
                       - Masalah Vektor Terpendek (Shortest Vector Problem / SVP) dan Masalah Pembelajaran dengan Galat (Learning With Errors / LWE): Mencari vektor kisi terpendek dalam ruang berdimensi ribuan terbukti merupakan masalah NP-hard yang bahkan tidak dapat dipecahkan oleh komputer kuantum berkecepatan super.
                       - Standar Baru: CRYSTALS-Kyber (enkripsi kunci publik) dan CRYSTALS-Dilithium (tanda tangan digital).
                       
                    4. Hipotesis Riemann & Distribusi Bilangan Prima:
                       Fungsi Zeta Riemann zeta(s) = sum_{n=1}^inf 1 / n^s menghubungkan fungsi analitik kompleks dengan perkalian tak hingga atas seluruh bilangan prima (Identitas Euler prod 1 / (1 - p^(-s))).
                       Hipotesis Riemann mempostulatkan bahwa seluruh nol non-trivial dari fungsi zeta terletak tepat pada garis kritis Re(s) = 1/2, mengontrol fluktuasi galat sebaran bilangan prima pi(x) ~ Li(x) yang menopang seluruh fondasi keamanan kunci privat asimetris dunia.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "ECC memberikan tingkat keamanan militer tertinggi dengan panjang kunci yang sangat ringkas, menghemat daya baterai dan bandwidth komunikasi seluler.",
                    "Aturan penambahan titik garis dan cermin kurva eliptik secara mengejutkan memenuhi seluruh aksioma grup Abelian komutatif secara sempurna.",
                    "Kriptografi berbasis kisi menyembunyikan kunci di dalam kisi geometri berdimensi 1000 yang dipenuhi oleh derau galat mikro acak.",
                    "Hipotesis Riemann adalah misteri terbesar matematika yang secara langsung mengatur keteraturan sebaran blok bilangan prima pelindung enkripsi modern."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Hukum Penambahan Titik Kurva Eliptik Weierstrass",
                        latex = "x_R = \\lambda^2 - x_P - x_Q, \\quad y_R = \\lambda(x_P - x_R) - y_P, \\quad \\lambda = \\frac{y_Q - y_P}{x_Q - x_P} \\pmod p",
                        explanation = "Aritmatika modular penambahan dua titik P dan Q pada kurva eliptik untuk menghasilkan titik koordinat R = P + Q."
                    ),
                    FormulaCard(
                        title = "Masalah Pembelajaran dengan Galat Kisi LWE",
                        latex = "\\mathbf{b} = \\mathbf{A} \\mathbf{s} + \\mathbf{e} \\pmod q",
                        explanation = "Fondasi kriptografi pasca-kuantum: mendekodekan vektor rahasia s dari matriks acak A dan galat derau kecil e adalah masalah NP-hard."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Modernisasi Infrastruktur Sertifikat Digital & Kriptografi Pasca-Kuantum BSSN",
                    scenario = "Badan Siber dan Sandi Negara (BSSN) mengelola Otoritas Sertifikat Digital Nasional (Root CA Indonesia) untuk tanda tangan digital KTP elektronik dan transaksi pemerintahan SPBE.",
                    application = "Kriptografer BSSN memigrasikan standar tanda tangan digital dari RSA-2048 ke Kurva Eliptik ECDSA P-256 dan Curve25519 untuk menghemat beban komputasi chip smart-card e-KTP. Bersamaan dengan itu, BSSN menggelar uji coba percontohan algoritma pasca-kuantum berbasis kisi CRYSTALS-Dilithium untuk mengantisipasi ancaman 'Harvest Now, Decrypt Later' dari aktor spionase asing yang mengumpulkan data terenkripsi untuk didekripsi kelak saat komputer kuantum komersial tiba.",
                    impact = "Menjamin kedaulatan keamanan kriptografi dokumen rahasia negara dan identitas digital ratusan juta rakyat Indonesia hingga puluhan tahun mendatang."
                ),
                homeLab = HomeLabData(
                    title = "Penambahan Titik Geometris Sederhana pada Kurva Eliptik Riil Menggunakan Kertas Grafik",
                    objective = "Memahami hukum aljabar grup tali busur dan garis singgung (chord-and-tangent law) pada kurva y^2 = x^3 - 4x + 4.",
                    materials = listOf("Kertas berpetak / milimeter blok", "Penggaris dan pensil", "Kalkulator grafik atau manual"),
                    steps = listOf(
                        "Gambarkan kurva riil y^2 = x^3 - 4x + 4 pada kertas grafik (simetris terhadap sumbu x).",
                        "Pilih dua titik integer pada kurva: misal P = (0, 2) dan Q = (2, 2).",
                        "Tarik garis lurus menggunakan penggaris yang menghubungkan titik P dan Q.",
                        "Perhatikan di mana garis tersebut memotong kurva untuk ketiga kalinya (titik potong ketiga adalah (-2, -2)).",
                        "Cerminkan titik ketiga tersebut secara vertikal terhadap sumbu x (balikkan tanda nilai y-nya: dari y = -2 menjadi y = +2).",
                        "Titik hasil pencerminan tersebut R' = (-2, 2) adalah hasil penjumlahan grup P + Q!",
                        "Diskusikan bagaimana operasi geometris garis dan cermin sederhana ini menjadi benteng pengaman transaksi digital miliaran dolar setiap detiknya."
                    ),
                    safetyNote = "Praktikum geometri visual kertas meja kerja, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapakah Kriptografi Kurva Eliptik (ECC) dengan panjang kunci 256-bit jauh lebih disukai untuk perangkat bergerak (smartphone/IoT) dibandingkan kriptografi RSA klasik dengan kunci 2048-bit?",
                        options = listOf(
                            "Karena ECC memberikan tingkat kekuatan keamanan enkripsi yang setara dengan RSA namun dengan ukuran kunci yang jauh lebih ringkas (256-bit vs 2048-bit), menghemat memori, daya baterai, dan waktu komputasi secara drastis",
                            "Karena RSA tidak menggunakan matematika",
                            "Karena ECC diciptakan oleh perusahaan pembuat smartphone",
                            "Karena kunci RSA mudah terbakar"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Algoritma pemfaktoran bilangan komposit RSA (seperti General Number Field Sieve) memiliki kompleksitas sub-eksponensial, menuntut ukuran kunci yang sangat panjang (2048 hingga 4096 bit) untuk menjaga keamanan. Sebaliknya, pada kurva eliptik tidak ada algoritma sub-eksponensial umum klasik yang diketahui untuk memecahkan ECDLP; algoritma terbaik bekerja secara eksponensial penuh O(sqrt(n)), sehingga kunci 256-bit sudah cukup memberikan keamanan militer setara RSA-3072 bit dengan pemakaian daya komputasi minimal.",
                        misconceptionAlert = "Meskipun ECC sangat efisien terhadap komputer klasik, baik ECC maupun RSA sama-sama rentan terhadap komputer kuantum algoritma Shor, sehingga masa depan jangka panjang beralih ke kriptografi berbasis kisi (lattice)."
                    )
                )
            )

            else -> null
        }
    }
}

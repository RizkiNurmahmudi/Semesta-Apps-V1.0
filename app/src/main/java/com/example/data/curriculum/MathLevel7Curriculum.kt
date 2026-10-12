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

object MathLevel7Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "mat-analisis-real-darboux",
            domain = Domain.MATEMATIKA,
            topic = "Analisis Real Murni",
            title = "Analisis Real: Kelengkapan, Topologi Metrik & Integral Riemann-Darboux",
            description = "Aksioma kelengkapan, supremum/infimum, himpunan kompak Teorema Heine-Borel, barisan Cauchy, konvergensi seragam deret fungsi, dan kriteria integrabilitas Darboux.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("mat-kalkulus-limit-kontinu", "mat-kalkulus-integral-teknik")
        ),
        ConceptItem(
            id = "mat-aljabar-abstrak-grup-ring",
            domain = Domain.MATEMATIKA,
            topic = "Aljabar Abstrak Modern",
            title = "Aljabar Abstrak: Grup, Subgrup Normal, Ring Polinomial & Teorema Sylow",
            description = "Aksioma grup, koset teorema Lagrange, subgrup normal dan grup faktor, teorema isomorfisma fundamental Noether, ideal prima/maksimal ring komutatif, dan Teorema Sylow.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("mat-aljabar-linear-spl", "mat-induksi-matematika")
        ),
        ConceptItem(
            id = "mat-topologi-ruang-metrik",
            domain = Domain.MATEMATIKA,
            topic = "Topologi Umum",
            title = "Topologi Dasar: Ruang Topologi, Basis, Ruang Hausdorff & Homeomorfisma",
            description = "Aksioma himpunan buka/tutup, basis topologi, pemisahan ruang Hausdorff T2, kekompakan penutup terbuka, keterhubungan ruang, pemetaan kontinu, dan invarian homeomorfisma.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("mat-analisis-real-darboux", "mat-himpunan-relasi-cantor")
        ),
        ConceptItem(
            id = "mat-analisis-kompleks-residu",
            domain = Domain.MATEMATIKA,
            topic = "Analisis Kompleks",
            title = "Analisis Kompleks: Fungsi Holomorfik, Teorema Cauchy & Teorema Residu",
            description = "Persamaan Cauchy-Riemann, pemetaan konformal, Teorema Integral Cauchy-Goursat, deret Laurent singularitas kutub, dan Teorema Residu Cauchy untuk evaluasi integral tak wajar.",
            level = DepthLevel.L7,
            estMinutes = 26,
            prerequisites = listOf("mat-kalkulus-multivariabel", "mat-analisis-real-darboux")
        ),
        ConceptItem(
            id = "mat-teori-peluang-lebesgue",
            domain = Domain.MATEMATIKA,
            topic = "Teori Ukuran & Probabilitas Aksiomatik",
            title = "Teori Ukuran: Ukuran Lebesgue, Integral Lebesgue & Teorema Konvergensi",
            description = "Aljabar sigma, ukuran Lebesgue luar, fungsi terukur Borel, integral Lebesgue melampaui Riemann, Teorema Konvergensi Monoton & Dominan (LDCT), ruang Lp, dan probabilitas Kolmogorov.",
            level = DepthLevel.L7,
            estMinutes = 27,
            prerequisites = listOf("mat-analisis-real-darboux", "mat-probabilitas-inferensi-regresi")
        ),
        ConceptItem(
            id = "mat-geometri-diferensial-manifold",
            domain = Domain.MATEMATIKA,
            topic = "Geometri Diferensial",
            title = "Geometri Diferensial: Kerangka Frenet-Serret, Theorema Egregium & Manifold",
            description = "Kelengkungan dan torsi kurva ruang, bentuk fundamental permukaan Gauss, kelengkungan Gaussian intrinsik (Theorema Egregium), manifold mulus, bentuk diferensial, dan Teorema Stokes umum.",
            level = DepthLevel.L7,
            estMinutes = 27,
            prerequisites = listOf("mat-kalkulus-vektor", "mat-aljabar-linear-spl", "mat-topologi-ruang-metrik")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "mat-analisis-real-darboux" -> LessonData(
                conceptId = "mat-analisis-real-darboux",
                simId = "sim-real-analysis-darboux",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, di kalkulus kita diajarkan bahwa integral adalah luas di bawah kurva f(x). Mengapa matematikawan murni bersusah payah merumuskan definisi batas atas jumlah Darboux dengan epsilon dan delta yang begitu kaku?",
                        narrativeContext = "Dimas membaca buku teks Analisis Real pengantar pembuktian analitis yang penuh definisi formal."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena intuisi visual bisa menipu kita, Dimas! Pertimbangkan fungsi Dirichlet yang bernilai 1 jika x rasional dan 0 jika x irasional—fungsi ini tidak memiliki luas kalkulus biasa. Analisis Real membangun fondasi logis tanpa celah menggunakan Aksioma Kelengkapan bilangan real.",
                        narrativeContext = "Kakek menuliskan definisi supremum dan kriteria keterintegralan Darboux U(P, f) - L(P, f) < epsilon."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan konsep Konvergensi Seragam (Uniform Convergence) menjamin bahwa limit dari barisan fungsi kontinu tetap menghasilkan fungsi kontinu—sesuatu yang gagal dijamin oleh konvergensi titik demi titik (pointwise) biasa!",
                        narrativeContext = "Kirana menggambarkan pita batas seragam |f_n(x) - f(x)| < epsilon di sepanjang domain."
                    )
                ),
                intuitionBody = """
                    Analisis Real adalah rekonstruksi logis rigorous dari kalkulus, membuktikan sifat-sifat dasar bilangan real, kekontinuan, dan integrasi tanpa mengandalkan grafik geometris intuitif.
                    
                    1. Aksioma Kelengkapan Bilangan Real:
                       Setiap himpunan bagian tak-kosong S subset R yang terbatas ke atas memiliki batas atas terkecil (Supremum / sup S) di dalam R. Sifat inilah yang membedakan bilangan real R (kontinu tanpa celah lubang) dari bilangan rasional Q (yang berlubang pada bilangan seperti sqrt(2) atau pi).
                       
                    2. Topologi Ruang Metrik & Teorema Heine-Borel:
                       Pada garis bilangan real R dengan metrik d(x,y) = |x - y|:
                       - Titik Limit & Himpunan Tutup: Himpunan yang memuat seluruh titik limitnya.
                       - Himpunan Kompak: Setiap penutup terbuka (open cover) memiliki sub-penutup berhingga.
                       - Teorema Heine-Borel: Suatu himpunan bagian K subset R^n bersifat kompak jika dan hanya jika K tertutup dan terbatas (closed and bounded).
                       - Teorema Nilai Ekstrim: Fungsi kontinu pada himpunan kompak selalu mencapai nilai maksimum dan minimum mutlak.
                       
                    3. Barisan Cauchy & Konvergensi Seragam:
                       - Barisan Cauchy: Barisan yang jarak antar sukunya |x_n - x_m| < epsilon untuk n,m cukup besar. Di R, barisan konvergen jika dan hanya jika ia merupakan barisan Cauchy (kelengkapan metrik).
                       - Konvergensi Seragam: fn -> f secara seragam bila untuk setiap epsilon > 0 terdapat N sedemikian hingga |fn(x) - f(x)| < epsilon berlaku serentak untuk SEMUA x di domain. Menjamin integrabilitas dan turunan dapat bertukar posisi dengan tanda limit: lim integral fn = integral lim fn.
                       
                    4. Integral Riemann-Darboux:
                       Diberikan partisi P = {x0, x1, ..., xn}.
                       Jumlah atas U(P, f) = sum M_i * Delta_x_i dan jumlah bawah L(P, f) = sum m_i * Delta_x_i.
                       Kriteria Darboux: Fungsi terbatas f terintegralkan Riemann pada [a, b] jika dan hanya jika untuk setiap epsilon > 0 terdapat partisi P sedemikian hingga:
                       U(P, f) - L(P, f) < epsilon.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Aksioma kelengkapan adalah pembeda mutlak antara kontinum bilangan real dengan lubang tak terhingga bilangan rasional.",
                    "Teorema Heine-Borel menjamin bahwa sifat tak hingga dapat direduksi menjadi kardinalitas berhingga pada himpunan kompak.",
                    "Konvergensi seragam mencegah anomali di mana deret fungsi halus mulus tiba-tiba melonjak menjadi fungsi diskontinu.",
                    "Kriteria Darboux mengapit fungsi di antara tangga atas dan tangga bawah hingga celah ketidakpastian lenyap di bawah epsilon."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Kriteria Integrabilitas Riemann-Darboux",
                        latex = "\\forall \\varepsilon > 0, \\; \\exists P \\in \\mathcal{P}[a, b] \\implies U(P, f) - L(P, f) < \\varepsilon",
                        explanation = "Fungsi terbatas f terintegralkan jika selisih jumlah atas Darboux dan jumlah bawah Darboux dapat dibuat sekecil mungkin."
                    ),
                    FormulaCard(
                        title = "Uji M-Weierstrass untuk Konvergensi Seragam",
                        latex = "|f_n(x)| \\le M_n, \\quad \\sum_{n=1}^\\infty M_n < \\infty \\implies \\sum_{n=1}^\\infty f_n(x) \\text{ konvergen seragam}",
                        explanation = "Jika suku fungsi didominasi oleh deret bilangan konvergen Mn, maka deret fungsi tersebut konvergen seragam mutlak."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Verifikasi Rigorous Algoritma Perhitungan Finansial Risiko OJK dan Bursa Efek Indonesia",
                    scenario = "Sistem perdagangan algoritmik pasar modal BEI mengevaluasi stabilitas model suku bunga stokastik bebas arbitrase.",
                    application = "Matematikawan kuantitatif membuktikan bahwa fungsi imbal hasil pasar modal konvergen seragam pada interval waktu tertutup dan terbatas [0, T]. Dengan menerapkan Teorema Heine-Borel dan integrabilitas Darboux, sistem memastikan bahwa batas atas risiko modal (Value-at-Risk) terjamin mencapai nilai supremum terhingga yang unik dan stabil tanpa resiko singularitas numerik tak terduga.",
                    impact = "Menjamin kepatuhan regulasi perbankan Basel III dan mencegah keruntuhan likuiditas sistemik bursa saham nasional."
                ),
                homeLab = HomeLabData(
                    title = "Pembuktian Konvergensi Titik demi Titik vs Seragam pada Barisan Fungsi f_n(x) = x^n",
                    objective = "Mengamati kegagalan kekontinuan fungsi limit pada konvergensi pointwise barisan x^n pada interval [0, 1].",
                    materials = listOf("Kertas berpetak atau aplikasi kalkulator grafik Desmos/GeoGebra"),
                    steps = listOf(
                        "Plot fungsi f1(x) = x, f2(x) = x^2, f5(x) = x^5, f20(x) = x^20 pada rentang 0 <= x <= 1.",
                        "Amati bahwa untuk setiap x di dalam [0, 1), nilai x^n konvergen ke 0 saat n -> inf.",
                        "Namun tepat pada x = 1, nilai 1^n selalu bernilai 1 untuk semua n.",
                        "Fungsi limit f(x) adalah: 0 untuk x in [0, 1) dan 1 untuk x = 1 (fungsi diskontinu!).",
                        "Diskusikan mengapa limit dari barisan fungsi kontinu bisa menjadi fungsi diskontinu: karena konvergensinya tidak seragam di dekat x = 1."
                    ),
                    safetyNote = "Praktikum analisis grafik matematika murni tanpa risiko fisik."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Berdasarkan Teorema Heine-Borel, kondisi apakah yang diperlukan dan mencukupi agar suatu himpunan bagian dari R^n bersifat kompak?",
                        options = listOf(
                            "Himpunan tersebut harus tertutup (closed) dan terbatas (bounded)",
                            "Himpunan tersebut harus memuat semua bilangan prima",
                            "Himpunan tersebut harus berupa himpunan terbuka tanpa batas",
                            "Himpunan tersebut hanya boleh memuat sejumlah berhingga titik diskrit"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Teorema Heine-Borel klasik menyatakan bahwa di ruang Euclidean R^n, sebuah himpunan bersifat kompak (setiap penutup terbuka memiliki sub-penutup berhingga) jika dan hanya jika himpunan tersebut bersifat tertutup dan terbatas.",
                        misconceptionAlert = "Sifat ini khusus berlaku untuk ruang R^n berdimensi berhingga; di ruang Banach berdimensi tak hingga, himpunan tertutup dan terbatas belum tentu kompak."
                    )
                )
            )

            "mat-aljabar-abstrak-grup-ring" -> LessonData(
                conceptId = "mat-aljabar-abstrak-grup-ring",
                simId = "sim-abstract-algebra-groups",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, mengapa menyusun rubik kubus 3x3, memutar kristal kuarsa, dan mengacak sandi enkripsi perbankan digital semuanya dipelajari dalam satu teori matematika yang sama?",
                        narrativeContext = "Dimas memegang kubus Rubik yang teracak dan diagram simetri kristal."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena semuanya memiliki struktur simetri abstrak yang sama: Teori Grup! Matematikawan tidak lagi memedulikan apakah objeknya berupa angka, rotasi kubus, atau permutasi huruf; yang dipelajari adalah sifat operasi himpunan yang memenuhi aksioma asosiatif, identitas, dan invers.",
                        narrativeContext = "Kakek menuliskan tabel operasi Cayley dan Teorema Lagrange: orde subgrup selalu membagi habis orde grup."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan saat struktur diperkaya dengan dua operasi penjumlahan dan perkalian, kita memperoleh Ring dan Field, di mana Teorema Isomorfisma Emmy Noether mengungkap keterkaitan ideal dan ruang faktor!",
                        narrativeContext = "Kirana memaparkan diagram komutatif homomorfisma phi: G -> H dengan kernel Ker(phi)."
                    )
                ),
                intuitionBody = """
                    Aljabar Abstrak membebaskan matematika dari keterikatan pada angka konkret dengan mempelajari struktur aljabar formal (Grup, Ring, Medan/Field) yang mendasari simetri alam semesta dan kriptografi.
                    
                    1. Teori Grup (Groups):
                       Himpunan G yang dilengkapi operasi biner (*) memenuhi empat aksioma:
                       - Tertutup (closure): a * b in G.
                       - Asosiatif: (a * b) * c = a * (b * c).
                       - Unsur Identitas (e): e * a = a * e = a.
                       - Unsur Invers (a^(-1)): a * a^(-1) = a^(-1) * a = e.
                       Jika operasi komutatif (a * b = b * a), disebut Grup Abelian.
                       
                    2. Koset & Teorema Lagrange:
                       Jika H adalah subgrup dari grup berhingga G, maka koset kiri aH mempartisi G menjadi himpunan-himpunan berukuran identik.
                       Teorema Lagrange: |G| = [G : H] * |H|, membuktikan bahwa orde (jumlah unsur) subgrup H pasti membagi habis orde grup induk |G|.
                       
                    3. Subgrup Normal, Grup Faktor & Teorema Isomorfisma Noether:
                       Subgrup N disebut Normal (N triangleleft G) jika g N g^(-1) = N untuk semua g in G.
                       Hanya subgrup normal yang dapat menghasilkan Grup Faktor G/N yang konsisten.
                       Teorema Isomorfisma Pertama: Jika phi: G -> H adalah homomorfisma grup, maka kernel Ker(phi) adalah subgrup normal dari G, dan G / Ker(phi) isomorfis terhadap peta Im(phi).
                       
                    4. Teori Ring & Ideal:
                       Ring (R, +, *) memiliki grup abelian terhadap (+) dan semigrup asosiatif distributif terhadap (*).
                       - Ideal I: Subring di mana r * i in I dan i * r in I untuk semua r in R, i in I (menyerap perkalian).
                       - Ideal Maksimal: Ring faktor R/M adalah Medan (Field).
                       - Ideal Prima: Ring faktor R/P adalah Daerah Integral (Integral Domain).
                       - Teorema Sylow: Menjamin keberadaan p-subgrup Sylow untuk setiap faktor prima pembagi orde grup |G|.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Grup adalah bahasa universal simetri: rotasi poligon, permutasi kartu, hingga simetri mekanika kuantum partikel.",
                    "Teorema Lagrange menjadi pembatas paling elegan dalam aljabar: grup berorde 15 mustahil memiliki subgrup berorde 4.",
                    "Subgrup normal adalah analogi dari kernel pemetaan linear, memungkinkan pembentukan aljabar modulo modular yang konsisten.",
                    "Ideal dalam teori ring bertindak persis seperti subgrup normal dalam teori grup, menjadi pembagi pembentuk ring faktor."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Teorema Lagrange untuk Grup Berhingga",
                        latex = "|G| = [G : H] \\cdot |H| \\implies |H| \\text{ membagi habis } |G|",
                        explanation = "Orde sembarang subgrup H selalu merupakan faktor pembagi dari orde grup induk berhingga G."
                    ),
                    FormulaCard(
                        title = "Teorema Isomorfisma Pertama Noether",
                        latex = "G / \\ker(\\phi) \\cong \\mathrm{Im}(\\phi)",
                        explanation = "Grup faktor domain terhadap kernel homomorfisma selalu isomorfis (ekuivalen struktural) terhadap citra pemetaan."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Implementasi Kriptografi Sandi Blok AES-256 pada Badan Siber dan Sandi Negara (BSSN)",
                    scenario = "BSSN mengamankan jalur komunikasi data intelijen negara menggunakan standar enkripsi AES-256 (Advanced Encryption Standard).",
                    application = "Kotak substitusi (S-Box) pada AES dirancang menggunakan operasi invers perkalian pada Medan Galois Berhingga GF(2^8) modulo polinomial tak tereduksi m(x) = x^8 + x^4 + x^3 + x + 1, diikuti pemetaan afin. Matematikawan BSSN membuktikan bahwa sifat aljabar grup siklik dan ketaklinearan invers field GF(2^8) memberikan ketahanan maksimal terhadap serangan kriptanalisis diferensial dan linear.",
                    impact = "Melindungi kedaulatan informasi digital rahasia negara dari ancaman spionase dan peretasan siber global."
                ),
                homeLab = HomeLabData(
                    title = "Eksplorasi Grup Simetri Segitiga Sama Sisi D3 Menggunakan Karton Segitiga",
                    objective = "Membangun tabel Cayley grup dihedral berorde 6 (tiga rotasi dan tiga refleksi cermin) secara manual.",
                    materials = listOf("Karton segitiga sama sisi dengan sudut diberi nomor 1, 2, 3 pada kedua sisi depan-belakang", "Kertas catatan dan pulpen"),
                    steps = listOf(
                        "Tetapkan 6 operasi simetri: Identitas (e), Rotasi 120 (r), Rotasi 240 (r^2), dan tiga sumbu lipat refleksi (s1, s2, s3).",
                        "Lakukan kombinasi dua operasi berturut-turut, misalnya: lakukan rotasi r lalu balikkan secara refleksi s1.",
                        "Catat posisi sudut-sudutnya; cocokkan dengan operasi tunggal yang ekuivalen.",
                        "Buktikan bahwa r * s != s * r (operasi tidak komutatif, membuktikan D3 adalah grup non-Abelian terkecil di alam semesta berorde 6).",
                        "Lengkapi tabel Cayley 6x6 dan verifikasi bahwa setiap baris dan kolom memuat tepat satu dari keenam elemen tersebut."
                    ),
                    safetyNote = "Praktikum manipulasi geometri karton meja, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Jika G adalah sebuah grup berhingga dengan jumlah unsur (orde) |G| = 17 (suatu bilangan prima), apakah kesimpulan mutlak yang dapat ditarik tentang struktur grup G?",
                        options = listOf(
                            "G adalah grup siklik, dan karenanya pasti bersifat komutatif (Abelian)",
                            "G tidak memiliki unsur identitas",
                            "G memiliki setidaknya 5 subgrup berorde 4",
                            "G adalah grup non-Abelian dengan tak hingga unsur"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Berdasarkan Teorema Lagrange, orde sembarang subgrup H dari G harus membagi |G| = 17. Karena 17 bilangan prima, satu-satunya pembaginya adalah 1 dan 17. Oleh karena itu, sembarang elemen g != e akan membangkitkan subgrup dengan orde 17, yang berarti G = <g> adalah grup siklik, dan semua grup siklik pasti Abelian.",
                        misconceptionAlert = "Banyak yang mengira grup dengan orde ganjil selalu rumit, padahal grup berorde prima memiliki struktur paling sederhana dan kaku."
                    )
                )
            )

            "mat-topologi-ruang-metrik" -> LessonData(
                conceptId = "mat-topologi-ruang-metrik",
                simId = "sim-topology-homeomorphism",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, ada lelucon terkenal bahwa seorang topolog tidak bisa membedakan antara cangkir kopi berpegangan dengan donat kue (torus). Mengapa geometri topologi menganggap keduanya sama?",
                        narrativeContext = "Dimas mengamati gambar deformasi plastis cangkir tanah liat yang diubah perlahan menjadi bentuk donat berlubang satu."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena dalam Topologi, jarak dan sudut tidak penting, Dimas! Yang dipelajari adalah sifat-sifat ruang yang tetap bertahan (invarian) di bawah deformasi kontinu seperti peregangan, penekukan, dan pemelintiran tanpa merobek atau merekatkan.",
                        narrativeContext = "Kakek menggambarkan homeomorfisma pemetaan bijektif bikontinu antara dua ruang topologi."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan abstraksi tertingginya dirumuskan oleh Aksioma Himpunan Buka Felix Hausdorff: kita tidak membutuhkan konsep jarak meter (metrik) sama sekali untuk mendefinisikan kedekatan, kekompakan, dan keterhubungan!",
                        narrativeContext = "Kirana menuliskan aksioma topologi tau: irisan berhingga himpunan buka dan gabungan sebarang himpunan buka selalu buka."
                    )
                ),
                intuitionBody = """
                    Topologi (sering disebut 'geometri karet') mempelajari sifat-sifat intrinsik bentuk dan ruang yang tidak berubah di bawah deformasi kontinu dwiarah (homeomorfisma).
                    
                    1. Definisi Ruang Topologi Umum (X, tau):
                       Keluarga himpunan bagian tau dari himpunan semesta X disebut topologi jika:
                       - Himpunan kosong emptyset dan X sendiri berada di dalam tau.
                       - Gabungan dari SEBARANG (bisa tak hingga tak terhitung) anggota tau tetap berada di dalam tau.
                       - Irisan dari BERHINGGA anggota tau tetap berada di dalam tau.
                       Anggota tau disebut himpunan terbuka (open sets).
                       
                    2. Aksioma Pemisahan & Ruang Hausdorff (T_2):
                       Suatu ruang X disebut Hausdorff jika untuk setiap dua titik berbeda x != y, terdapat dua himpunan buka saling lepas U dan V sedemikian hingga x in U, y in V, dan U cap V = emptyset.
                       Seluruh ruang metrik bersifat Hausdorff. Pada ruang Hausdorff, barisan konvergen memiliki limit yang tunggal unik.
                       
                    3. Kekompakan & Keterhubungan:
                       - Kekompakan (Compactness): Ruang X kompak jika setiap penutup terbuka memiliki sub-penutup berhingga. Sifat kompak adalah generalisasi dari himpunan berhingga: fungsi kontinu pada ruang kompak selalu terbatas dan mencapai nilai ekstrim.
                       - Keterhubungan (Connectedness): Ruang X terhubung jika tidak dapat diurai menjadi gabungan dua himpunan buka tak-kosong yang saling lepas. Ruang terhubung lintasan (path-connected) menjamin sembarang dua titik dapat dihubungkan oleh kurva kontinu.
                       
                    4. Homeomorfisma & Invarian Topologis:
                       Pemetaan f: X -> Y disebut Homeomorfisma jika f bijektif, kontinu, dan inversnya f^(-1) juga kontinu. Dua ruang yang homeomorfis dipandang identik secara topologis.
                       Invarian topologis (sifat yang dipertahankan di bawah homeomorfisma) mencakup: kekompakan, keterhubungan, ruang Hausdorff, genus (jumlah lubang permukaan), dan grup fundamental.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Topologi mendefinisikan kekontinuan secara murni menggunakan prapeta himpunan buka: f kontinu jika f^(-1)(U) terbuka untuk setiap U terbuka.",
                    "Ruang Hausdorff menjamin bahwa titik-titik individual dapat dipisahkan secara spasial, mencegah 'keruntuhan' titik limit.",
                    "Kekompakan mempertahankan sifat keterbatasan di bawah transformasi kontinu sebarang.",
                    "Donat dan cangkir kopi bersifat homeomorfis karena keduanya adalah permukaan 2D kompak berorientasi dengan tepat satu lubang (genus g = 1)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Definisi Kekontinuan Topologis Melalui Prapeta",
                        latex = "f: X \\to Y \\text{ kontinu} \\iff \\forall U \\in \\tau_Y, \\; f^{-1}(U) \\in \\tau_X",
                        explanation = "Fungsi kontinu dicirikan oleh prapeta dari setiap himpunan terbuka di ruang sasaran selalu merupakan himpunan terbuka di domain."
                    ),
                    FormulaCard(
                        title = "Karakteristik Euler Permukaan Topologi (g-Lubang)",
                        latex = "\\chi = V - E + F = 2 - 2g",
                        explanation = "Invarian topologis bilangan Euler chi dari poliedron permukaan tertutup dengan genus g lubang."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Topological Data Analysis (TDA) Citra Tomografi Kanker Paru di RSUP Persahabatan",
                    scenario = "Dokter radiologi menganalisis pola mikrostroktur nodul paru pada citra CT-scan beresolusi tinggi untuk membedakan nodul jinak dan karsinoma invasif.",
                    application = "Ilmuwan data medis menerapkan Homologi Persisten (Persistent Homology) dari Topologi Aljabar/Komputasi. Awan titik intensitas CT-scan dimodelkan sebagai kompleks simplicial Vietoris-Rips; kelahiran dan kematian rongga topologis (lubang dimensi-0 kluster, dimensi-1 loop, dimensi-2 void) dipetakan ke dalam diagram barcode persistensi untuk mendeteksi arsitektur vaskularisasi ganas.",
                    impact = "Meningkatkan akurasi deteksi dini keganasan kanker paru stadium 1 dari 72% menjadi 91% tanpa perlunya biopsi bedah invasif berisiko tinggi."
                ),
                homeLab = HomeLabData(
                    title = "Pembuatan Pita Möbius dan Pengamatan Topologi Permukaan Satu Sisi Non-Orientabel",
                    objective = "Membuktikan secara empiris keberadaan permukaan berdimensi 2 yang hanya memiliki satu sisi muka dan satu tepi batas.",
                    materials = listOf("Satu carik kertas panjang selebar 3 cm dan panjang 30 cm", "Selotip bening", "Spidol warna", "Gunting"),
                    steps = listOf(
                        "Pegang kedua ujung carik kertas, putar salah satu ujungnya 180 derajat (satu puntiran setengah), lalu rekatkan kedua ujungnya dengan selotip.",
                        "Gunakan spidol untuk menarik garis lurus menyusuri bagian tengah pita tanpa pernah mengangkat spidol dari kertas.",
                        "Amati fenomena topologis: garis spidol menyambung kembali ke titik awal dan menutupi kedua 'sisi' kertas tanpa menyeberangi tepi (permukaan satu sisi non-orientabel!).",
                        "Gunting pita tepat di sepanjang garis spidol tengah tersebut.",
                        "Amati hasil guntingan: pita tidak terbelah menjadi dua pita terpisah, melainkan menjadi satu pita panjang yang melingkar dengan dua puntiran!"
                    ),
                    safetyNote = "Hati-hati saat menggunakan gunting."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Jika ruang topologi X kompak dan fungsi f: X -> Y bersifat kontinu dan surjektif, apakah yang dapat dipastikan tentang ruang sasaran Y?",
                        options = listOf(
                            "Ruang sasaran Y pasti bersifat kompak",
                            "Ruang Y pasti berupa garis bilangan riil tak berhingga",
                            "Ruang Y pasti tidak memiliki himpunan buka",
                            "Ruang Y pasti memiliki jumlah titik berhingga"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Kekompakan adalah sifat invarian topologis yang diawetkan oleh pemetaan kontinu. Jika {V_alpha} adalah penutup terbuka dari Y, maka {f^(-1)(V_alpha)} adalah penutup terbuka dari X. Karena X kompak, ada subpenutup berhingga {f^(-1)(V_i)}, yang petanya {V_i} membentuk subpenutup berhingga bagi Y.",
                        misconceptionAlert = "Prapeta dari ruang kompak belum tentu kompak, tetapi peta langsung (citra) dari ruang kompak di bawah fungsi kontinu selalu kompak."
                    )
                )
            )

            "mat-analisis-kompleks-residu" -> LessonData(
                conceptId = "mat-analisis-kompleks-residu",
                simId = "sim-complex-residue-cauchy",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana kita menghitung integral riil tak wajar yang sangat rumit seperti integral -tak hingga sampai tak hingga dari 1 / (1 + x^4) dx yang tidak bisa dipecahkan dengan substitusi biasa?",
                        narrativeContext = "Dimas menghadapi integral kalkulus lanjut yang buntu jika dihitung dengan antiturunan riil biasa."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Gunakan Teorema Residu Cauchy dalam bidang kompleks, Dimas! Integral riil diubah menjadi integral kontur setengah lingkaran tertutup di bidang kompleks C. Nilai integralnya cukup dihitung dari 2*pi*i dikalikan jumlah residu di dalam kutub-kutub kontur!",
                        narrativeContext = "Kakek menggambar kontur setengah lingkaran atas dan kutub singularitas z = e^(i*pi/4)."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan keajaiban fungsi holomorfik (diferensiabel kompleks) adalah: jika suatu fungsi dapat diturunkan satu kali saja, ia secara otomatis analitik—dapat diturunkan tak hingga kali dan memiliki ekspansi deret Taylor dan Laurent!",
                        narrativeContext = "Kirana menuliskan Persamaan Cauchy-Riemann u_x = v_y dan u_y = -v_x."
                    )
                ),
                intuitionBody = """
                    Analisis Kompleks mempelajari fungsi analitik (holomorfik) f(z) di mana variabel z = x + i*y berada pada bidang kompleks C. Keterdiferensialan kompleks memiliki konsekuensi geometris dan aljabar yang jauh lebih kaya dan kaku dibandingkan diferensiasi riil.
                    
                    1. Persamaan Cauchy-Riemann & Fungsi Holomorfik:
                       f(z) = u(x, y) + i * v(x, y) diferensiabel kompleks jika dan hanya jika turunan parsialnya memenuhi:
                       partial(u)/partial(x) = partial(v)/partial(y) dan partial(u)/partial(y) = -partial(v)/partial(x).
                       Implikasi Geometris:
                       - Bagian riil u dan imajiner v otomatis merupakan fungsi harmonik (nabla^2 u = 0 dan nabla^2 v = 0).
                       - Pemetaan w = f(z) bersifat Konformal: mempertahankan sudut dan orientasi antar kurva.
                       
                    2. Teorema Integral Cauchy-Goursat & Rumus Integral Cauchy:
                       - Jika f(z) analitik di dalam dan pada lintasan tertutup sederhana C, maka:
                         oint_C f(z) dz = 0.
                       - Rumus Integral Cauchy: Nilai fungsi di sembarang titik interior z0 ditentukan sepenuhnya oleh nilainya di tepi kurva pembatas:
                         f(z0) = (1 / 2*pi*i) * oint_C [ f(z) / (z - z0) ] dz.
                       - Rumus Turunan Orde-n: f^(n)(z0) = (n! / 2*pi*i) * oint_C [ f(z) / (z - z0)^(n+1) ] dz (menjamin keanalitikan tak hingga).
                       
                    3. Deret Laurent & Klasifikasi Singularitas:
                       Di sekitar titik singular terisolasi z0, f(z) dapat diekspansi menjadi deret pangkat positif dan negatif:
                       f(z) = sum_{n=0}^inf a_n (z - z0)^n + sum_{m=1}^inf b_m / (z - z0)^m.
                       - Singularitas Terhapuskan (Removable): semua b_m = 0.
                       - Kutub Orde m (Pole of order m): b_m != 0 tetapi b_k = 0 untuk semua k > m.
                       - Singularitas Esensial: jumlah tak hingga suku pangkat negatif b_m (Teorema Picard: f(z) mendekati seluruh nilai kompleks tak hingga kali di sekitar singularitas esensial).
                       
                    4. Teorema Residu Cauchy:
                       Residu adalah koefisien suku 1 / (z - z0) pada deret Laurent: Res(f, z0) = b1.
                       Teorema Residu: oint_C f(z) dz = 2*pi*i * sum_{k=1}^N Res(f, z_k).
                       Metode ini mengevaluasi integral riil tak wajar, integral trigonometri periodik, dan transformasi invers Laplace Bromwich dengan sangat elegan.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Persamaan Cauchy-Riemann menyatukan fungsi analitik dengan medan potensial elektrostatik dan aliran fluida tak termampatkan ideal.",
                    "Rumus integral Cauchy membuktikan bahwa fungsi kompleks bersifat 'holografis': informasi di perbatasan batas menentukan seluruh isi interior.",
                    "Teorema Residu mereduksi kalkulasi integral yang tampak mustahil menjadi sekadar evaluasi limit aljabar sederhana untuk mencari koefisien b1.",
                    "Teorema Liouville membuktikan bahwa fungsi analitik di seluruh bidang C yang terbatas pasti merupakan konstanta, menghasilkan bukti paling singkat Teorema Fundamental Aljabar."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Teorema Residu Cauchy",
                        latex = "\\oint_C f(z)\\,dz = 2\\pi i \\sum_{k=1}^N \\mathrm{Res}(f, z_k)",
                        explanation = "Integral kontur tertutup fungsi meromorfik sama dengan dua pi i dikalikan jumlah seluruh residu kutub yang dilingkupi kontur."
                    ),
                    FormulaCard(
                        title = "Rumus Perhitungan Residu Kutub Orde m",
                        latex = "\\mathrm{Res}(f, z_0) = \\frac{1}{(m-1)!} \\lim_{z \\to z_0} \\frac{d^{m-1}}{dz^{m-1}} \\left[ (z - z_0)^m f(z) \\right]",
                        explanation = "Formula diferensial limit untuk mengekstrak koefisien b1 dari kutub berorde m."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Transformasi Konformal Sayap Pesawat Terbang N219 PT Dirgantara Indonesia",
                    scenario = "Insinyur aerodinamika PTDI merancang profil penampang sayap (airfoil) pesawat komuter N219 Nurtanio untuk efisiensi gaya angkat pada kecepatan rendah di landasan pendek perintis.",
                    application = "Tim aerodinamika menerapkan Transformasi Joukowsky fungsi kompleks w = z + c^2 / z. Pemetaan konformal ini mentransformasikan aliran fluida potensial sederhana di sekitar silinder melingkar menjadi aliran udara realistis di sekitar penampang sayap aerodinamis asimetris bertoreh tajam, memungkinkan perhitungan gaya angkat Kutta-Joukowsky L = rho * v * Gamma secara analitik presisi sebelum uji terowongan angin.",
                    impact = "Mempercepat sertifikasi kelaikudaraan pesawat karya anak bangsa dan menghemat biaya fabrikasi prototipe fisik sayap."
                ),
                homeLab = HomeLabData(
                    title = "Eksplorasi Fraktal Himpunan Mandelbrot Kompleks Menggunakan Generator Online",
                    objective = "Mengamati keindahan dinamika iterasi kuadrat kompleks z_{n+1} = z_n^2 + c pada bidang kompleks.",
                    materials = listOf("Komputer / Ponsel browser", "Situs fraktal online (seperti fractalfoundation.org atau desmos.com)"),
                    steps = listOf(
                        "Buka visualisasi Himpunan Mandelbrot di browser.",
                        "Pahami aturan iterasi kompleks: untuk setiap titik c = a + bi, mulai dari z0 = 0, hitung z1 = c, z2 = c^2 + c, dst.",
                        "Jika modulus |z_n| tidak meledak ke tak hingga (|z_n| <= 2 untuk selamanya), maka titik c termasuk anggota himpunan (diwarnai hitam).",
                        "Perbesar (zoom in) ke perbatasan tepi fraktal hingga jutaan kali perbesaran.",
                        "Amati pola swa-serupa (self-similarity) tak hingga rumit yang muncul murni dari aljabar bilangan kompleks kuadratik sederhana."
                    ),
                    safetyNote = "Praktikum komputasi fraktal matematika yang memukau dan aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Berapakah nilai integral kontur tertutup oint_C [ 1 / (z - 3) ] dz di sepanjang lingkaran berjari-jari 5 yang berpusat di titik asal z = 0?",
                        options = listOf(
                            "2 * pi * i",
                            "0",
                            "pi * i",
                            "Tak hingga"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Fungsi f(z) = 1 / (z - 3) memiliki singularitas kutub sederhana di z = 3 dengan residu Res = 1. Karena titik z = 3 terletak di dalam lingkaran kontur berjari-jari 5 (|3| < 5), berdasarkan Teorema Residu nilainya adalah 2 * pi * i * Res = 2 * pi * i * 1 = 2 * pi * i.",
                        misconceptionAlert = "Jika titik kutub berada di LUAR kontur (misalnya kontur lingkaran berjari-jari 2), maka integralnya akan bernilai 0 berdasarkan Teorema Cauchy-Goursat."
                    )
                )
            )

            "mat-teori-peluang-lebesgue" -> LessonData(
                conceptId = "mat-teori-peluang-lebesgue",
                simId = "sim-measure-lebesgue-probability",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, mengapa integral Riemann biasa gagal mengintegrasikan fungsi sederhana seperti fungsi Dirichlet (1 jika rasional, 0 jika irasional), padahal bilangan rasional di garis bilangan itu sangat sedikit dibandingkan irasional?",
                        narrativeContext = "Dimas heran mengapa luas daerah fungsi berundak halus tidak dapat dihitung oleh kalkulus integral biasa."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena Henri Lebesgue merevolusi cara kita mengukur luas, Dimas! Integral Riemann memotong sumbu domain x (horizontal), sementara Integral Lebesgue memotong sumbu kodomain nilai fungsi y (vertikal) dan mengukurnya dengan Ukuran Lebesgue (Lebesgue Measure).",
                        narrativeContext = "Kakek menggambarkan perbandingan partisi vertikal Lebesgue vs partisi horizontal Riemann."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan inilah fondasi sejati dari Probabilitas Modern Kolmogorov: ruang peluang (Omega, F, P) adalah ruang ukuran berukuran total 1, peubah acak adalah fungsi terukur, dan nilai ekspektasi E[X] adalah integral Lebesgue!",
                        narrativeContext = "Kirana memaparkan aksioma probabilitas berbasis aljabar sigma dan Teorema Konvergensi Dominan (LDCT)."
                    )
                ),
                intuitionBody = """
                    Teori Ukuran (Measure Theory) memberikan landasan matematis yang kukuh dan umum bagi integrasi dan teori probabilitas aksiomatik modern.
                    
                    1. Aljabar-Sigma & Ukuran Lebesgue:
                       - Himpunan Semesta Omega dan Koleksi Himpunan F disebut aljabar-sigma (sigma-algebra) jika memuat himpunan kosong, tertutup terhadap komplemen, dan tertutup terhadap gabungan terhitung (countable union).
                       - Ukuran (Measure) mu: F -> [0, inf] memenuhi aditivitas terhitung (countable additivity):
                         mu(bigcup_{i=1}^inf A_i) = sum_{i=1}^inf mu(A_i) untuk himpunan-himpunan saling lepas.
                       - Ukuran Lebesgue m pada R: Memperluas konsep panjang interval m([a, b]) = b - a ke himpunan terukur sembarang. Himpunan bilangan rasional Q memiliki ukuran nol (m(Q) = 0) karena Q adalah himpunan terhitung.
                       
                    2. Fungsi Terukur & Konstruksi Integral Lebesgue:
                       Fungsi f: X -> R terukur jika prapeta f^(-1)((a, inf)) merupakan himpunan terukur untuk semua a.
                       Integral dibangun bertahap:
                       - Fungsi sederhana phi = sum a_i * 1_{A_i} -> integral phi dmu = sum a_i * mu(A_i).
                       - Fungsi tak-negatif: integral f dmu = sup { integral phi dmu : 0 <= phi <= f, phi sederhana }.
                       - Fungsi sembarang: f = f^+ - f^-.
                       Fungsi Dirichlet terintegralkan Lebesgue dengan nilai integral tepat 0, karena nilai 1 hanya terjadi pada himpunan berukuran nol.
                       
                    3. Teorema-Teorema Konvergensi Fundamental:
                       Mengizinkan pertukaran limit dan integral dalam kondisi yang jauh lebih longgar daripada konvergensi seragam:
                       - Lemma Fatou: integral liminf fn dmu <= liminf integral fn dmu.
                       - Teorema Konvergensi Monoton (MCT): Jika 0 <= f1 <= f2 <= ... dan fn -> f, maka lim integral fn dmu = integral f dmu.
                       - Teorema Konvergensi Dominan Lebesgue (LDCT): Jika fn -> f hampir di mana-mana dan |fn| <= g dengan g terintegralkan, maka lim integral fn dmu = integral f dmu.
                       
                    4. Probabilitas Aksiomatik Kolmogorov (1933) & Ruang L^p:
                       - Ruang Sampel Omega, Aljabar-sigma Kejadian F, Ukuran Peluang P dengan P(Omega) = 1.
                       - Peubah Acak X adalah fungsi terukur Borel.
                       - Ekspektasi E[X] = integral_Omega X(omega) dP(omega).
                       - Ruang L^p: Ruang fungsi terukur dengan norma ||f||_p = (integral |f|^p dmu)^(1/p) < inf (membentuk Ruang Banach dan Ruang Hilbert untuk L^2).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Integral Lebesgue mengelompokkan nilai keluaran y yang berdekatan dan mengukur ukuran himpunan masukan prapetanya, jauh lebih tangguh daripada partisi domain Riemann.",
                    "Himpunan berukuran nol (null sets) memungkinkan konsep 'berlaku hampir di mana-mana' (almost everywhere / a.e.), mengabaikan singularitas minor.",
                    "Teorema Konvergensi Dominan (LDCT) adalah alat kerja paling vital bagi matematikawan terapan untuk memvalidasi limit integral.",
                    "Peluang aksiomatik Kolmogorov menyatukan peubah acak diskrit dan kontinu dalam satu persamaan integral Lebesgue tunggal."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Teorema Konvergensi Dominan Lebesgue (LDCT)",
                        latex = "|f_n(x)| \\le g(x), \\quad \\int g\\,d\\mu < \\infty \\implies \\lim_{n\\to\\infty} \\int f_n\\,d\\mu = \\int \\left(\\lim_{n\\to\\infty} f_n\\right) d\\mu",
                        explanation = "Jika barisan fungsi terdominasi oleh fungsi integrable g, operasi limit dan integral dapat bertukar posisi secara eksak."
                    ),
                    FormulaCard(
                        title = "Definisi Ekspektasi Peubah Acak Kolmogorov",
                        latex = "\\mathbb{E}[X] = \\int_\\Omega X(\\omega)\\,dP(\\omega)",
                        explanation = "Nilai harapan peubah acak didefinisikan secara universal sebagai integral Lebesgue terhadap ukuran peluang P."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pemodelan Aktuaria Klaim Bencana Gempa BPBD dan Asuransi Nasional",
                    scenario = "Perusahaan reasuransi nasional memodelkan risiko klaim kerugian gempa megathrust yang memiliki ekor tebal (fat-tailed distributions).",
                    application = "Aktuaris memformulasikan distribusi kerugian kumulatif menggunakan Teori Ukuran Lebesgue-Stieltjes. Karena klaim gempa menggabungkan probabilitas massa diskrit (peluang nol jika tidak ada gempa) dan kerapatan kontinu pekat saat gempa terjadi, integral Lebesgue mampu menghitung premi murni dan Nilai Ekspektasi Berekor (Tail Value-at-Risk / TVaR) secara terpadu tanpa kontradiksi.",
                    impact = "Menjamin kecukupan dana cadangan solvabilitas industri asuransi bencana nasional menghadapi risiko kerugian ratusan triliun rupiah."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Pemodelan Ukuran Peluang Himpunan Saling Lepas dengan Lembaran Kertas A4",
                    objective = "Memverifikasi aksioma aditivitas ukuran Lebesgue m(A cup B) = m(A) + m(B) secara proporsional luas.",
                    materials = listOf("Satu lembar kertas A4 (luas total dianggap Omega berpeluang 1)", "Penggaris dan gunting", "Timbangan dapur digital presisi"),
                    steps = listOf(
                        "Timbang massa lembar kertas A4 utuh (misal m0 = 5.0 gram).",
                        "Gunting kertas menjadi beberapa potongan bentuk tak beraturan: A (sepertiga), B (seperempat), dan sisa C.",
                        "Timbang massa potongan A dan potongan B secara terpisah, lalu timbang gabungan keduanya bersama-sama.",
                        "Buktikan bahwa Massa(A cup B) = Massa(A) + Massa(B) dan Proporsi Massa = Proporsi Luas Ukuran Lebesgue.",
                        "Diskusikan mengapa gabungan terhitung dari himpunan titik tunggal berukuran nol menghasilkan himpunan berukuran nol."
                    ),
                    safetyNote = "Hati-hati saat menggunakan gunting."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Berapakah nilai dari integral Lebesgue dari Fungsi Dirichlet f(x) (bernilai 1 untuk x bilangan rasional dan 0 untuk x bilangan irasional) pada interval [0, 1]?",
                        options = listOf(
                            "0",
                            "1",
                            "0.5",
                            "Tidak terdefinisi"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Himpunan bilangan rasional Q pada [0, 1] adalah himpunan terhitung, sehingga ukuran Lebesguenya bernilai nol: m(Q cap [0, 1]) = 0. Sebaliknya, himpunan bilangan irasional memiliki ukuran penuh m([0, 1] \\ Q) = 1. Maka integral Lebesgue f adalah: 1 * m(rasional) + 0 * m(irasional) = 1 * 0 + 0 * 1 = 0.",
                        misconceptionAlert = "Pada integral Riemann biasa, fungsi Dirichlet tidak terintegralkan karena jumlah atasnya selalu 1 dan jumlah bawahnya selalu 0; namun pada integral Lebesgue nilainya eksak 0."
                    )
                )
            )

            "mat-geometri-diferensial-manifold" -> LessonData(
                conceptId = "mat-geometri-diferensial-manifold",
                simId = "sim-diff-geometry-manifold",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana para kartografer dan navigator kapal membuktikan bahwa mustahil membuat peta bumi datar pada selembar kertas tanpa mendistorsi jarak atau luas kepulauan Indonesia?",
                        narrativeContext = "Dimas membandingkan bentuk Pulau Greenland dan Indonesia pada peta proyeksi Mercator dengan globe bola dunia."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu dibuktikan oleh Carl Friedrich Gauss melalui Theorema Egregium ('Teorema Luar Biasa')! Kelengkungan Gaussian kurvatur K suatu permukaan bersifat intrinsik—tidak bisa diubah oleh pembengkokan apa pun tanpa merobek atau meregangkan permukaannya.",
                        narrativeContext = "Kakek menggambarkan kelengkungan permukaan bola K > 0, bidang datar K = 0, dan pelana hiperbolik K < 0."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan pada Manifold Mulus berdimensi tinggi, Teorema Stokes Umum dalam bahasa Bentuk Diferensial (Differential Forms) menyatukan Teorema Fundamental Kalkulus, Teorema Green, Divergensi Gauss, dan Stokes klasik ke dalam satu rumus agung: integral perbatasan omega = integral d(omega)!",
                        narrativeContext = "Kirana menuliskan rumus diferensial luar d dan Teorema Stokes umum pada manifold berorientasi."
                    )
                ),
                intuitionBody = """
                    Geometri Diferensial mengaplikasikan kalkulus multivariabel dan aljabar linear untuk mempelajari geometri kurva, permukaan, dan ruang melengkung berdimensi tinggi (Manifold).
                    
                    1. Teori Kurva Ruang & Kerangka Frenet-Serret:
                       Kurva ruang berparameter panjang busur s: r(s).
                       - Vektor Singgung Satuan: T(s) = r'(s).
                       - Vektor Normal Utama: N(s) = T'(s) / ||T'(s)||, dengan Kelengkungan kappa(s) = ||T'(s)||.
                       - Vektor Binormal: B(s) = T(s) x N(s), dengan Torsi tau(s) = -B'(s) . N(s) (mengukur laju kurva terpelintir keluar dari bidang osilasi).
                       Rumus Frenet-Serret merangkum laju perubahan kerangka ortonormal {T, N, B}.
                       
                    2. Teori Permukaan & Bentuk Fundamental:
                       Permukaan terparameterkan r(u, v):
                       - Bentuk Fundamental Pertama: I = E du^2 + 2F du dv + G dv^2 (mengukur panjang kurva dan luas intrinsik pada permukaan).
                       - Bentuk Fundamental Kedua: II = L du^2 + 2M du dv + N dv^2 (mengukur bagaimana permukaan melengkung di dalam ruang ambien R^3).
                       - Kelengkungan Gaussian: K = kappa1 * kappa2 = (LN - M^2) / (EG - F^2).
                       - Theorema Egregium Gauss: K dapat dihitung HANYA dari E, F, G dan turunan-turunannya! Kelengkungan Gaussian adalah invarian intrinsik yang tidak bergantung pada bagaimana permukaan dibenamkan di R^3.
                       
                    3. Manifold Mulus (Smooth Manifolds):
                       Ruang topologi Hausdorff yang secara lokal menyerupai ruang Euclidean R^n melalui kumpulan peta koordinat (atlas) yang fungsi transisinya mulus tak hingga (C^inf difeomorfisma).
                       Ruang singgung T_p(M) memuat vektor singgung di titik p sebagai operator derivasi pada fungsi mulus.
                       
                    4. Bentuk Diferensial & Teorema Stokes Umum:
                       Bentuk diferensial k-form omega dievaluasi melalui perkalian baji (wedge product ^) dan turunan luar d.
                       Teorema Stokes Umum:
                       integral_{partial M} omega = integral_M d(omega).
                       Di mana partial M adalah batas terorientasi dari manifold berdimensi (k+1). Rumus tunggal ini merangkum Teorema Dasar Kalkulus (k=0), Teorema Green (k=1, 2D), Teorema Stokes Klasik (k=1, 3D), dan Teorema Divergensi Gauss (k=2, 3D).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Theorema Egregium Gauss menjelaskan mengapa kita tidak bisa mengupas kulit jeruk bola (K > 0) menjadi bidang datar meja (K = 0) tanpa merobeknya.",
                    "Kelengkungan Gaussian intrinsik dapat diukur oleh semut yang hidup di dalam permukaan 2D tanpa harus melihat dimensi ketiga luar.",
                    "Manifold mulus menyediakan kerangka kerja matematis alami untuk seluruh fisika modern: dari mekanika Lagrange hingga Relativitas Umum Einstein.",
                    "Teorema Stokes umum adalah puncak sintesis kalkulus: mengintegrasikan turunan luar d(omega) pada volume identik dengan mengintegrasikan bentuk omega di permukaan batasnya."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Theorema Egregium Gauss",
                        latex = "K = \\kappa_1 \\kappa_2 = f(E, F, G, E_u, E_v, \\dots)",
                        explanation = "Kelengkungan Gaussian K sepenuhnya ditentukan oleh bentuk fundamental pertama intrinsik E, F, G tanpa dipengaruhi pembenaman luar."
                    ),
                    FormulaCard(
                        title = "Teorema Stokes Umum pada Manifold",
                        latex = "\\int_{\\partial M} \\omega = \\int_M d\\omega",
                        explanation = "Unifikasi agung seluruh teorema integral kalkulus: integral diferensial luar d(omega) pada manifold M sama dengan integral omega pada batas partial M."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pemetaan Geodesik Global & Sistem Informasi Geografis (SIG) Badan Informasi Geospasial (BIG)",
                    scenario = "Badan Informasi Geospasial (BIG) memetakan batas wilayah kedaulatan maritim dan darat Negara Kesatuan Republik Indonesia pada elipsoid referensi WGS84.",
                    application = "Geodesis BIG menghitung garis lintang-bujur dan jarak terpendek (kurva geodesik) menggunakan geometri diferensial permukaan elipsoid dua sumbu. Dengan memanfaatkan tensor metrik bentuk fundamental pertama dan persamaan diferensial Euler-Lagrange geodesik, batas laut teritorial 12 mil laut dan ZEE 200 mil laut dihitung secara presisi milimeter bebas dari distorsi proyeksi peta datar.",
                    impact = "Memperkuat kepastian hukum batas wilayah kedaulatan maritim Indonesia di Mahkamah Hukum Laut Internasional (ITLOS)."
                ),
                homeLab = HomeLabData(
                    title = "Pengamatan Kelengkungan Gaussian Intrinsik Menggunakan Kulit Jeruk dan Keripik Kentang Pelana",
                    objective = "Membandingkan permukaan dengan kelengkungan positif K > 0 (kulit jeruk) dan kelengkungan negatif K < 0 (keripik kentang pelana / saddle).",
                    materials = listOf("1 buah jeruk bulat segar", "Pisau dapur kecil", "Satu keping keripik kentang pelana (Pringles) atau karton yang ditekuk pelana"),
                    steps = listOf(
                        "Kupas sepotong kulit jeruk berbentuk lingkaran (permukaan bola, K > 0).",
                        "Coba tekan kulit jeruk tersebut hingga menempel rata pada permukaan meja datar (K = 0).",
                        "Amati bahwa tepi kulit jeruk pasti robek atau bagian tengahnya menekuk berkerut (pembuktian langsung Theorema Egregium: permukaan K > 0 tidak bisa dipetakan ke K = 0 tanpa distorsi).",
                        "Amati permukaan keripik kentang: di satu arah melengkung ke atas, di arah tegak lurus melengkung ke bawah (K = kappa1 * kappa2 < 0, kelengkungan Gaussian negatif).",
                        "Diskusikan mengapa jumlah sudut segitiga pada bola > 180 derajat dan pada pelana < 180 derajat (Teorema Gauss-Bonnet)."
                    ),
                    safetyNote = "Hati-hati saat mengupas kulit jeruk menggunakan pisau."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah implikasi paling mendasar dari Theorema Egregium Gauss terhadap pembuatan peta bola bumi pada selembar kertas datar?",
                        options = listOf(
                            "Mustahil membuat peta proyeksi datar dari bola bumi yang mempertahankan jarak lokal dan luas secara bersamaan tanpa distorsi (karena kelengkungan Gaussian bola K > 0 sedangkan bidang datar K = 0)",
                            "Bumi sebenarnya berbentuk segitiga",
                            "Peta kertas selalu memiliki kelengkungan tak hingga",
                            "Jarak di kutub selalu bernilai negatif"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Karena kelengkungan Gaussian K adalah invarian intrinsik permukaan di bawah isometri lokal, dan bola memiliki K = 1/R^2 > 0 sedangkan bidang kertas memiliki K = 0, maka tidak ada pemetaan isometrik lokal (pelestari jarak) dari bola ke bidang datar, membuktikan distorsi peta tak terhindarkan.",
                        misconceptionAlert = "Banyak yang mengira ada proyeksi peta sempurna yang belum ditemukan, padahal Theorema Egregium membuktikan ketidakmungkinannya secara matematis."
                    )
                )
            )

            else -> null
        }
    }
}

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

object MathLevel5Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "mat-aljabar-linear-spl",
            domain = Domain.MATEMATIKA,
            topic = "Aljabar Linear",
            title = "Sistem Persamaan Linear & Eliminasi Gauss-Jordan",
            description = "Matriks augmentasi, operasi baris elementer (OBE), eliminasi Gauss-Jordan menuju bentuk eselon baris tereduksi (RREF), dan klasifikasi solusi SPL.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("mat-matriks-determinan")
        ),
        ConceptItem(
            id = "mat-ruang-vektor-basis",
            domain = Domain.MATEMATIKA,
            topic = "Aljabar Linear",
            title = "Ruang Vektor, Basis, Dimensi & Teorema Rank-Nullity",
            description = "Aksioma ruang vektor, subruang, kombinasi linear, rentang (span), kebebasan linear, basis, dimensi, dan Teorema Rank-Nullity fundamental.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("mat-aljabar-linear-spl")
        ),
        ConceptItem(
            id = "mat-transformasi-linear-kernel",
            domain = Domain.MATEMATIKA,
            topic = "Aljabar Linear",
            title = "Transformasi Linear, Kernel, Range & Gram-Schmidt",
            description = "Pemetaan linear, representasi matriks standar, kernel dan range, isomorfisma, ruang hasil kali dalam, ortogonalitas, dan proses ortogonalisasi Gram-Schmidt.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("mat-ruang-vektor-basis")
        ),
        ConceptItem(
            id = "mat-nilai-eigen-vektor",
            domain = Domain.MATEMATIKA,
            topic = "Aljabar Linear",
            title = "Nilai Eigen, Vektor Eigen & Teorema Cayley-Hamilton",
            description = "Persamaan karakteristik det(A - lambda I) = 0, ruang eigen, multiplisitas aljabar dan geometri, serta Teorema Cayley-Hamilton.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("mat-transformasi-linear-kernel")
        ),
        ConceptItem(
            id = "mat-diagonalisasi-svd",
            domain = Domain.MATEMATIKA,
            topic = "Aljabar Linear Komputasi",
            title = "Diagonalisasi Matriks & Dekomposisi Nilai Singular (SVD)",
            description = "Syarat diagonalisasi A = PDP⁻¹, faktorisasi LU, dekomposisi QR, Dekomposisi Nilai Singular (SVD: A = U Sigma V^T), dan aproksimasi matriks peringkat rendah.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("mat-nilai-eigen-vektor")
        ),
        ConceptItem(
            id = "mat-logika-proposisi-predikat",
            domain = Domain.MATEMATIKA,
            topic = "Matematika Diskrit",
            title = "Logika Proposisi, Predikat & Inferensi Formal",
            description = "Tabel kebenaran, ekuivalensi logis, bentuk normal disjungtif/konjungtif, kuantor universal dan eksistensial, serta aturan inferensi deduktif formal.",
            level = DepthLevel.L5,
            estMinutes = 20,
            prerequisites = listOf("mat-himpunan-peluang-sma")
        ),
        ConceptItem(
            id = "mat-himpunan-relasi-cantor",
            domain = Domain.MATEMATIKA,
            topic = "Matematika Diskrit",
            title = "Teori Himpunan, Relasi Ekuivalensi & Kardinalitas Cantor",
            description = "Operasi himpunan, relasi ekuivalensi, partisi, relasi pengurutan parsial (poset), serta kardinalitas himpunan tak hingga dan argumen diagonal Cantor.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("mat-logika-proposisi-predikat")
        ),
        ConceptItem(
            id = "mat-induksi-matematika",
            domain = Domain.MATEMATIKA,
            topic = "Metode Pembuktian Matematika",
            title = "Induksi Matematika Baku, Induksi Kuat & Well-Ordering",
            description = "Prinsip induksi matematika baku, induksi kuat, prinsip urutan rapi (well-ordering principle), dan pembuktian keterbagian bilangan bulat serta relasi rekursif.",
            level = DepthLevel.L5,
            estMinutes = 20,
            prerequisites = listOf("mat-logika-proposisi-predikat")
        ),
        ConceptItem(
            id = "mat-kombinatorika-inklusif",
            domain = Domain.MATEMATIKA,
            topic = "Matematika Diskrit",
            title = "Kombinatorika Lanjut: Pigeonhole & Inklusi-Eksklusi",
            description = "Prinsip sarang burung merpati (pigeonhole principle), prinsip inklusi-eksklusi, koefisien binomial multivariat, relasi rekursi homogen, dan fungsi pembangkit.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("mat-induksi-matematika")
        ),
        ConceptItem(
            id = "mat-teori-graf-lintasan",
            domain = Domain.MATEMATIKA,
            topic = "Matematika Diskrit",
            title = "Teori Graf, Sirkuit Euler-Hamilton & Algoritma Lintasan",
            description = "Struktur graf berarah/tak berarah, graf bipartit, sirkuit Euler dan Hamilton, representasi matriks adjasensi, pohon merentang minimum (Kruskal/Prim), dan algoritma Dijkstra.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("mat-kombinatorika-inklusif")
        ),
        ConceptItem(
            id = "mat-teori-bilangan-modulo",
            domain = Domain.MATEMATIKA,
            topic = "Teori Bilangan & Kriptografi",
            title = "Teori Bilangan Modular, Algoritma Euclid & Kriptografi RSA",
            description = "Keterbagian, algoritma pembagian Euclidean, identitas Bézout, aritmetika modulo, Teorema Sisa Cina (CRT), Teorema Kecil Fermat, dan sistem kriptografi kunci publik RSA.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("mat-induksi-matematika")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "mat-aljabar-linear-spl" -> getAljabarLinearSplLesson()
            "mat-ruang-vektor-basis" -> getRuangVektorBasisLesson()
            "mat-transformasi-linear-kernel" -> getTransformasiLinearKernelLesson()
            "mat-nilai-eigen-vektor" -> getNilaiEigenVektorLesson()
            "mat-diagonalisasi-svd" -> getDiagonalisasiSvdLesson()
            "mat-logika-proposisi-predikat" -> getLogikaProposisiPredikatLesson()
            "mat-himpunan-relasi-cantor" -> getHimpunanRelasiCantorLesson()
            "mat-induksi-matematika" -> getInduksiMatematikaLesson()
            "mat-kombinatorika-inklusif" -> getKombinatorikaInklusifLesson()
            "mat-teori-graf-lintasan" -> getTeoriGrafLintasanLesson()
            "mat-teori-bilangan-modulo" -> getTeoriBilanganModuloLesson()
            else -> null
        }
    }

    private fun getAljabarLinearSplLesson(): LessonData = LessonData(
        conceptId = "mat-aljabar-linear-spl",
        storyPanels = listOf(
            StoryPanel(
                id = "p-spl-gauss-1",
                panelNumber = 1,
                title = "Jaringan Arus yang Rumit",
                caption = "Dimas diminta menganalisis jaringan distribusi listrik bertegangan tinggi dengan 10 gardu induk dan 25 loop kabel listrik yang saling bertautan.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Ada 25 persamaan linear dengan 25 variabel arus tak diketahui! Menyelesaikan substitusi satu per satu dengan tangan akan butuh waktu berminggu-minggu dan penuh risiko salah hitung!"
            ),
            StoryPanel(
                id = "p-spl-gauss-2",
                panelNumber = 2,
                title = "Kekuatan Matriks Augmentasi",
                caption = "Kakek menunjukkan bagaimana mengubah sistem raksasa tersebut ke dalam bentuk matriks augmentasi [A | b].",
                dialogueSpeaker = "Kakek",
                dialogueText = "Tuliskan koefisien dan konstanta ke dalam matriks augmentasi, Dimas. Tiga Operasi Baris Elementer (OBE) tidak pernah mengubah himpunan solusi aslinya, namun menyederhanakan sistem menjadi tangga segitiga yang jernih!"
            ),
            StoryPanel(
                id = "p-spl-gauss-3",
                panelNumber = 3,
                title = "Bentuk Eselon Baris Tereduksi (RREF)",
                caption = "Kirana memandu proses reduksi hingga setiap kolom pivot hanya berisi angka 1 dan nol di tempat lainnya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ketika matriks mencapai Reduced Row Echelon Form (RREF), klasifikasi solusi terbaca seketika: solusi tunggal (semua variabel ber-pivot), tak hingga solusi (ada variabel bebas), atau kontradiksi tanpa solusi jika muncul baris [0 0 ... 0 | 1]!"
            )
        ),
        intuition = "Eliminasi Gauss-Jordan adalah algoritma komputasi aljabar paling universal untuk menyelesaikan sembarang sistem persamaan linear (SPL). Tiga Operasi Baris Elementer (OBE)—menukar dua baris, mengalikan baris dengan skalar tak-nol, dan menambahkan kelipatan satu baris ke baris lain—menjaga ruang solusi tetap invarian. Dengan mereduksi matriks augmentasi ke Bentuk Eselon Baris Tereduksi (Reduced Row Echelon Form / RREF), kita dapat langsung mengidentifikasi variabel pivot (terikat) dan variabel bebas (bebas dipilih sebagai parameter solusi tak hingga), atau mendeteksi sistem inkonsisten tanpa solusi.",
        intuitionPoints = listOf(
            "Tiga jenis solusi SPL: Solusi tunggal unik (tidak ada variabel bebas, det(A) ≠ 0), Banyak solusi tak berhingga (ada variabel bebas parametrik), atau Tidak ada solusi (inkonsisten, rank(A) < rank([A|b])).",
            "Bentuk RREF memiliki sifat: elemen tak nol pertama tiap baris adalah 1 (leading one/pivot), setiap pivot berada lebih ke kanan dari pivot baris atasnya, dan semua elemen lain pada kolom yang memiliki pivot bernilai 0.",
            "Rank matriks menyatakan jumlah baris tak-nol dalam bentuk eselon, yang setara dengan dimensi ruang baris atau ruang kolom."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Representasi Matriks Augmentasi SPL",
                latexFormula = "A \\mathbf{x} = \\mathbf{b} \\iff [A \\mid \\mathbf{b}] = \\begin{bmatrix} a_{11} & a_{12} & \\cdots & a_{1n} & \\mid & b_1 \\\\ a_{21} & a_{22} & \\cdots & a_{2n} & \\mid & b_2 \\\\ \\vdots & \\vdots & \\ddots & \\vdots & \\mid & \\vdots \\\\ a_{m1} & a_{m2} & \\cdots & a_{mn} & \\mid & b_m \\end{bmatrix}",
                description = "Notasi matriks ringkas untuk sistem m persamaan dengan n variabel tak diketahui.",
                variableMeanings = mapOf(
                    "A" to "Matriks koefisien berukuran m x n",
                    "\\mathbf{x}" to "Vektor kolom variabel berukuran n x 1",
                    "\\mathbf{b}" to "Vektor kolom konstanta berukuran m x 1"
                )
            ),
            FormulaCard(
                title = "Kriteria Konsistensi Rouché-Capelli",
                latexFormula = "\\text{SPL Konsisten} \\iff \\text{rank}(A) = \\text{rank}([A \\mid \\mathbf{b}])",
                description = "SPL memiliki minimal satu solusi jika dan hanya jika rank matriks koefisien sama dengan rank matriks augmentasi.",
                variableMeanings = mapOf(
                    "\\text{rank}(A)" to "Peringkat matriks koefisien (jumlah baris tak-nol pada RREF)",
                    "\\text{rank}([A|b])" to "Peringkat matriks augmentasi"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Analisis Aliran Daya Jaringan Listrik Interkoneksi Jawa-Bali di PT PLN P2B Gandul",
            industry = "Teknik Tenaga Listrik & Transmisi Daya Nasional",
            context = "Pusat Pengatur Beban (P2B) PLN di Gandul, Cinere, memonitor aliran daya aktif dan reaktif pada lebih dari 500 gardu induk tegangan ekstra tinggi 500 kV se-Jawa dan Bali.",
            problem = "Bagaimana menghitung tegangan dan sudut fasa bus secara real-time setiap 4 detik untuk mengantisipasi kelebihan beban kabel transmisi tanpa memicu pemadaman meluas (blackout)?",
            solution = "Insinyur PLN merumuskan Hukum I Kirchhoff arus bus ke dalam persamaan linear aliran daya DC: B · theta = P, di mana B adalah matriks suseptansi jaringan 500x500 dan P adalah injeksi daya bersih tiap gardu. Menggunakan algoritma eliminasi Gauss dengan teknik pemfaktoran baris matriks jarang (sparse matrix factorization), komputer kontrol menyelesaikan sistem 500 persamaan ini hanya dalam waktu 15 milidetik, mendeteksi jalur transmisi kritis yang hampir mengalami lonjakan arus berlebih.",
            lessonsLearned = "Eliminasi matriks linear bukan sekadar topik kalkulasi teori, melainkan tulang punggung komputasi penjamin kestabilan pasokan listrik bagi 150 juta penduduk Pulau Jawa."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Eliminasi Gauss Menggunakan Koin dan Kertas Kolom Berpetak",
            objective = "Memahami secara visual dan taktil langkah-langkah Operasi Baris Elementer (OBE) untuk menyelesaikan sistem 3 persamaan 3 variabel.",
            materialsNeeded = listOf(
                "1 lembar kertas karton lebar digambar tabel berpetak 3 baris x 4 kolom",
                "Koin pecahan Rp500 atau Rp1.000 (total 20 keping)",
                "Kertas bertuliskan tanda plus (+) dan minus (-)",
                "Pensil dan penghapus"
            ),
            steps = listOf(
                "Tuliskan SPL sederhana: (1) x + y + z = 6; (2) 2x + y - z = 1; (3) x - y + z = 2.",
                "Letakkan koin pada kolom 1 (x), kolom 2 (y), kolom 3 (z), dan kolom 4 (konstanta b). Baris 1: [1 1 1 | 6], Baris 2: [2 1 -1 | 1], Baris 3: [1 -1 1 | 2].",
                "Lakukan OBE 1: Baris 2 baru = Baris 2 - 2*(Baris 1). Ambil koin dari Baris 2 sesuai kelipatan Baris 1. Kolom 1 Baris 2 menjadi kosong (nol).",
                "Lakukan OBE 2: Baris 3 baru = Baris 3 - Baris 1. Kolom 1 Baris 3 menjadi nol.",
                "Lanjutkan eliminasi hingga terbentuk matriks identitas [1 0 0 | x; 0 1 0 | y; 0 0 1 | z].",
                "Amati koin di kolom terakhir: Anda akan membaca solusi tepat secara mandiri: x = 1, y = 2, z = 3!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan interaktif.",
                "Simpan kembali koin setelah simulasi selesai."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-spl-gauss-1",
                prompt = "Sebuah sistem persamaan linear dengan 4 variabel tak diketahui direduksi menggunakan eliminasi Gauss-Jordan menghasilkan matriks RREF dengan 3 baris tak-nol (3 pivot). Berapakah jumlah variabel bebas dalam sistem tersebut?",
                type = "numeric",
                correctAnswer = "1",
                tolerance = 0.05f,
                unit = "variabel bebas",
                hints = listOf(
                    "Jumlah total variabel n = 4.",
                    "Jumlah variabel pivot = jumlah baris tak-nol = 3.",
                    "Jumlah variabel bebas = n - jumlah pivot = 4 - 3 = ...?"
                ),
                explanation = "Jumlah variabel bebas sama dengan selisih antara total variabel (n = 4) dengan jumlah pivot/rank matriks (r = 3). Maka jumlah variabel bebas = 4 - 3 = 1. Ini berarti sistem memiliki solusi tak berhingga yang dapat dinyatakan dalam satu parameter bebas t.",
                misconception = "Mengira jumlah baris tak nol sama dengan jumlah variabel bebas."
            ),
            QuizQuestion(
                id = "q-spl-gauss-2",
                prompt = "Kondisi baris manakah pada matriks augmentasi yang secara pasti menunjukkan bahwa suatu sistem persamaan linear TIDAK MEMILIKI SOLUSI (inkonsisten)?",
                type = "multiple_choice",
                options = listOf(
                    "Muncul baris berbentuk [0 0 0 ... 0 | k] dengan k ≠ 0",
                    "Muncul baris yang seluruh elemennya bernilai nol [0 0 0 ... 0 | 0]",
                    "Matriks koefisien memiliki determinan bernilai positif",
                    "Jumlah persamaan sama dengan jumlah variabel"
                ),
                correctAnswer = "Muncul baris berbentuk [0 0 0 ... 0 | k] dengan k ≠ 0",
                hints = listOf(
                    "Pikirkan apa arti persamaan jika koefisien sisi kiri semuanya nol.",
                    "0x1 + 0x2 + ... = k menghasilkan 0 = k yang merupakan kontradiksi mustahil."
                ),
                explanation = "Baris [0 0 0 ... 0 | k] merepresentasikan persamaan aljabar 0·x₁ + 0·x₂ + ... + 0·xₙ = k, yang ekuivalen dengan 0 = k. Jika k ≠ 0, persamaan ini merupakan kontradiksi matematis yang mustahil dipenuhi oleh nilai variabel berapapun, membuktikan bahwa sistem tidak memiliki solusi.",
                misconception = "Mengira baris semua nol [0 0 0 | 0] berarti tidak ada solusi (padahal baris semua nol hanya menandakan adanya redundansi persamaan dan menghasilkan solusi tak hingga jika konsisten)."
            )
        )
    )

    private fun getRuangVektorBasisLesson(): LessonData = LessonData(
        conceptId = "mat-ruang-vektor-basis",
        storyPanels = listOf(
            StoryPanel(
                id = "p-ruang-vektor-1",
                panelNumber = 1,
                title = "Melampaui Tiga Dimensi Panah Fisika",
                caption = "Dimas terbiasa memandang vektor sebagai anak panah 3D berarah di udara (x, y, z). Namun dosen matematikanya menyebut bahwa polinomial derajat dua dan fungsi kontinu juga merupakan vektor!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana bisa kurva fungsi f(x) = x² + 2x + 1 disebut sebagai vektor? Bukankah vektor harus punya arah mata angin dan panjang panah?"
            ),
            StoryPanel(
                id = "p-ruang-vektor-2",
                panelNumber = 2,
                title = "Aksioma Ruang Vektor Abstrak",
                caption = "Kakek menjelaskan definisi aksiomatik ruang vektor V atas lapangan skalar F.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Vektor dalam matematika modern adalah objek apa saja yang mematuhi 10 aksioma penjumlahan dan perkalian skalar, Dimas! Jika kamu bisa menjumlahkan dua fungsi dan mengalikannya dengan skalar tanpa keluar dari himpunan, maka fungsi itu adalah elemen sah dari ruang vektor!"
            ),
            StoryPanel(
                id = "p-ruang-vektor-3",
                panelNumber = 3,
                title = "Basis & Teorema Rank-Nullity",
                caption = "Kirana memperlihatkan bagaimana sekumpulan vektor bebas linear membangun ruang dimensi berhingga.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Basis adalah koordinat minimum yang merentang seluruh ruang tanpa mubazir. Dan Teorema Rank-Nullity menjamin keseimbangan absolut: dimensi domain n selalu terbagi sempurna menjadi Rank (dimensi output) ditambah Nullity (dimensi yang terpental ke nol)!"
            )
        ),
        intuition = "Ruang vektor adalah struktur aljabar fundamental yang mengabstraksikan konsep penjumlahan dan penskalaan. Himpunan vektor V atas lapangan R dikatakan independen/bebas linear jika tidak ada satu pun vektor yang dapat dituliskan sebagai kombinasi linear dari vektor lainnya (c1 v1 + ... + ck vk = 0 hanya berlaku jika seluruh c_i = 0). Himpunan pembangun yang bebas linear disebut Basis. Jumlah vektor dalam basis disebut Dimensi ruang tersebut. Teorema Rank-Nullity menghubungkan dimensi domain sebuah pemetaan linear T: V -> W dengan dimensi citra (rank) dan dimensi kernel (nullity): rank(T) + nullity(T) = dim(V).",
        intuitionPoints = listOf(
            "Kebebasan Linear (Linear Independence): tidak ada redundansi informasi dalam himpunan vektor.",
            "Rentang (Span): himpunan seluruh kemungkinan kombinasi linear dari sekumpulan vektor.",
            "Basis: himpunan vektor yang sekaligus bebas linear DAN merentang seluruh ruang vektor V.",
            "Teorema Rank-Nullity: untuk matriks m x n, Rank(A) + Nullity(A) = n (jumlah kolom / dimensi domain)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Uji Kebebasan Linear (Linear Independence)",
                latexFormula = "c_1 \\mathbf{v}_1 + c_2 \\mathbf{v}_2 + \\cdots + c_k \\mathbf{v}_k = \\mathbf{0} \\implies c_1 = c_2 = \\cdots = c_k = 0",
                description = "Vektor-vektor v1, ..., vk bebas linear jika dan hanya jika kombinasi linear menghasilkan nol hanya terpenuhi oleh solusi trivial skalar nol.",
                variableMeanings = mapOf(
                    "\\mathbf{v}_i" to "Vektor-vektor anggota himpunan",
                    "c_i" to "Koefisien skalar riil"
                )
            ),
            FormulaCard(
                title = "Teorema Rank-Nullity Fundamental",
                latexFormula = "\\text{rank}(T) + \\text{nullity}(T) = \\dim(V)",
                description = "Untuk pemetaan linear T dari ruang vektor berdimensi terhingga V ke W, jumlah dimensi range (rank) dan kernel (nullity) selalu sama dengan dimensi domain V.",
                variableMeanings = mapOf(
                    "\\text{rank}(T)" to "Dimensi Image / Range dari transformasi T",
                    "\\text{nullity}(T)" to "Dimensi Kernel / Ruang Nol dari transformasi T",
                    "\\dim(V)" to "Dimensi ruang vektor asal (domain V)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kompresi Sinyal Audio Digital di Industri Telekomunikasi Seluler Telkomsel",
            industry = "Pemrosesan Sinyal Digital & Telekomunikasi 5G",
            context = "Jaringan seluler Telkomsel mentransmisikan jutaan panggilan suara berdefinisi tinggi (VoLTE) setiap detik melalui spektrum frekuensi pita terbatas.",
            problem = "Bagaimana merepresentasikan sinyal gelombang suara kontinu berdurasi 1 detik (yang secara teoritis memiliki dimensi tak hingga) ke dalam paket data digital berukuran seringkas mungkin tanpa kehilangan kualitas artikulasi suara manusia?",
            solution = "Insinyur sinyal memproyeksikan sinyal suara ke dalam Ruang Vektor L² sinyal waktu terbatas. Karena sinyal vokal manusia terkonsentrasi pada pita frekuensi 300–3400 Hz, sinyal dapat diuraikan secara sempurna menggunakan kombinasi linear dari sejumlah berhingga vektor basis ortonormal (Transformasi Cosinus Diskrit / DCT atau Wavelet). Berdasarkan Teori Dimensi Ruang Vektor, hanya koefisien skalar dari 160 vektor basis frekuensi utama yang disimpan dan dikirimkan per bingkai 20 milidetik, memangkas kebutuhan bandwidth transmisi hingga 85% dengan kejernihan suara sempurna.",
            lessonsLearned = "Konsep basis dan dimensi ruang vektor memungkinkan kompresi informasi berdimensi raksasa menjadi representasi koordinat minimal yang efisien secara komputasi."
        ),
        homeLab = HomeLabData(
            title = "Uji Visual Kebebasan Linear 2D Menggunakan Dua Pulpen di Atas Kertas",
            objective = "Melihat secara langsung perbedaan geometris antara dua vektor yang bebas linear (merentang bidang 2D) dan bergantung linear (kolinier/satu garis).",
            materialsNeeded = listOf(
                "2 buah pulpen / pensil panjang sama",
                "1 lembar kertas HVS putih",
                "Penggaris"
            ),
            steps = listOf(
                "Posisikan pangkal kedua pulpen bertumpu di titik asal yang sama (0, 0) di pojok kertas.",
                "Kasus 1 (Bergantung Linear): Arahkan pulpen kedua sejajar lurus persis searah atau berlawanan arah dengan pulpen pertama. Coba bentuk titik di luar garis tersebut hanya dengan memperpanjang/memperpendek kedua pulpen: Anda TIDAK BISA! Keduanya kolinier dan hanya merentang garis 1D.",
                "Kasus 2 (Bebas Linear): Putar pulpen kedua sehingga membentuk sudut siku-siku atau sembarang sudut bukan 0° atau 180° terhadap pulpen pertama.",
                "Coba pilih sembarang titik acak di atas kertas HVS: Anda selalu bisa mencapai titik tersebut dengan kombinasi c1*(pulpen 1) + c2*(pulpen 2)!",
                "Simpulkan: dua vektor yang tidak segaris bersifat bebas linear dan membentuk Basis yang merentang seluruh bidang datar dua dimensi R²."
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan menggunakan alat tulis dasar."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-ruang-vektor-1",
                prompt = "Sebuah matriks A berukuran 5 x 7 memiliki rank sama dengan 3. Berapakah nullity (dimensi ruang nol / nullspace) dari matriks A tersebut?",
                type = "numeric",
                correctAnswer = "4",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "Gunakan Teorema Rank-Nullity: rank(A) + nullity(A) = n.",
                    "n adalah jumlah kolom matriks (dimensi domain) = 7.",
                    "nullity(A) = 7 - 3 = ...?"
                ),
                explanation = "Berdasarkan Teorema Rank-Nullity, untuk matriks berukuran m x n, berlaku: rank(A) + nullity(A) = n (jumlah kolom matriks). Karena n = 7 dan rank(A) = 3, maka nullity(A) = 7 - 3 = 4. Ruang nol memiliki basis yang terdiri dari 4 vektor bebas linear.",
                misconception = "Menggunakan jumlah baris (5) sebagai n sehingga salah menghitung 5 - 3 = 2."
            ),
            QuizQuestion(
                id = "q-ruang-vektor-2",
                prompt = "Manakah dari kumpulan vektor berikut di R³ yang membentuk himpunan yang BERGANTUNG LINEAR (linearly dependent)?",
                type = "multiple_choice",
                options = listOf(
                    "v1 = (1, 0, 0), v2 = (0, 2, 0), v3 = (2, 4, 0)",
                    "v1 = (1, 0, 0), v2 = (0, 1, 0), v3 = (0, 0, 1)",
                    "v1 = (1, 2, 3), v2 = (0, 1, 4), v3 = (0, 0, 5)",
                    "v1 = (2, 0, 0), v2 = (0, 3, 0), v3 = (0, 0, 4)"
                ),
                correctAnswer = "v1 = (1, 0, 0), v2 = (0, 2, 0), v3 = (2, 4, 0)",
                hints = listOf(
                    "Perhatikan hubungan antara v3 dengan v1 dan v2 pada opsi pertama.",
                    "v3 = 2*v1 + 2*v2 = (2, 0, 0) + (0, 4, 0) = (2, 4, 0)."
                ),
                explanation = "Pada opsi pertama, vektor v3 = (2, 4, 0) adalah kombinasi linear langsung dari dua vektor sebelumnya: v3 = 2·v1 + 2·v2. Karena ada vektor yang dapat dinyatakan sebagai kombinasi vektor lainnya, himpunan tersebut bersifat bergantung linear (linearly dependent). Ketiga vektor tersebut hanya terletak pada bidang xy dan tidak dapat merentang seluruh ruang 3 dimensi R³.",
                misconception = "Mengira karena ada 3 vektor di R³ maka otomatis selalu bebas linear."
            )
        )
    )

    private fun getTransformasiLinearKernelLesson(): LessonData = LessonData(
        conceptId = "mat-transformasi-linear-kernel",
        storyPanels = listOf(
            StoryPanel(
                id = "p-trans-linear-1",
                panelNumber = 1,
                title = "Pemetaan yang Mempertahankan Struktur",
                caption = "Dimas merancang animasi 3D rotasi dan penskalaan karakter permainan. Ia menyadari bahwa garis lurus selalu tetap lurus setelah diputar dan diskalakan.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Mengapa bentuk garis tidak melengkung atau rusak saat diputar dan digeser dalam ruang grafis komputer?"
            ),
            StoryPanel(
                id = "p-trans-linear-2",
                panelNumber = 2,
                title = "Prinsip Aditivitas dan Homogenitas",
                caption = "Kakek menjelaskan dua syarat suci transformasi linear T(u + v) = T(u) + T(v) dan T(c u) = c T(u).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Transformasi linear memetakan garis lurus menjadi garis lurus dan selalu mempertahankan titik asal T(0) = 0! Setiap pemetaan linear dapat direpresentasikan secara sempurna oleh perkalian matriks standar [T]."
            ),
            StoryPanel(
                id = "p-trans-linear-3",
                panelNumber = 3,
                title = "Ortogonalisasi Gram-Schmidt",
                caption = "Kirana memperlihatkan bagaimana mengubah sembarang basis miring menjadi basis tegak lurus ortonormal.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Melalui proses Gram-Schmidt, kita mengurangi komponen proyeksi pada vektor-vektor sebelumnya, menyisakan bagian yang murni tegak lurus (ortogonal). Basis ortonormal membuat perhitungan matriks menjadi semudah menghitung proyeksi bayangan!"
            )
        ),
        intuition = "Transformasi linear adalah fungsi T: V -> W antara dua ruang vektor yang mengawetkan operasi penjumlahan dan perkalian skalar. Dua ruang bagian terpenting dari T adalah Kernel (himpunan semua vektor di V yang dipetakan menjadi vektor nol di W, mengukur tingkat ketidak-injektifan) dan Range (seluruh hasil pemetaan di W, mengukur tingkat surjektifitas). Dalam ruang hasil kali dalam, Basis Ortonormal adalah basis paling ideal karena setiap pasang vektor saling tegak lurus (<u_i, u_j> = 0) dan memiliki panjang satu. Proses Gram-Schmidt menyediakan algoritma berulang untuk mengonversi sembarang basis menjadi basis ortonormal.",
        intuitionPoints = listOf(
            "Kernel ker(T) = {v in V | T(v) = 0}. Transformasi T bersifat satu-satu (injektif) jika dan hanya jika ker(T) = {0}.",
            "Range im(T) = {T(v) | v in V}. Transformasi T bersifat pada (surjektif) jika dan hanya jika im(T) = W.",
            "Proses Gram-Schmidt: u1 = v1; u2 = v2 - Proj_u1(v2); u3 = v3 - Proj_u1(v3) - Proj_u2(v3); dst.",
            "Normalisasi: membagi setiap vektor ortogonal u_i dengan panjangnya ||u_i|| menghasilkan himpunan ortonormal e_i."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Definisi Aksiomatik Transformasi Linear",
                latexFormula = "T(c_1 \\mathbf{u} + c_2 \\mathbf{v}) = c_1 T(\\mathbf{u}) + c_2 T(\\mathbf{v}) \\quad \\forall \\mathbf{u}, \\mathbf{v} \\in V, \\; c_1, c_2 \\in \\mathbb{R}",
                description = "Karakteristik linieritas yang menggabungkan prinsip aditivitas dan homogenitas.",
                variableMeanings = mapOf(
                    "T" to "Pemetaan / transformasi linear dari V ke W",
                    "\\mathbf{u}, \\mathbf{v}" to "Vektor anggota ruang asal V",
                    "c_1, c_2" to "Skalar bilangan riil"
                )
            ),
            FormulaCard(
                title = "Proses Ortogonalisasi Gram-Schmidt",
                latexFormula = "\\mathbf{u}_k = \\mathbf{v}_k - \\sum_{j=1}^{k-1} \\frac{\\langle \\mathbf{v}_k, \\mathbf{u}_j \\rangle}{\\|\\mathbf{u}_j\\|^2} \\mathbf{u}_j",
                description = "Mengurangi seluruh proyeksi vektor v_k terhadap vektor-vektor ortogonal sebelumnya u_1, ..., u_{k-1}.",
                variableMeanings = mapOf(
                    "\\mathbf{u}_k" to "Vektor ortogonal baru ke-k",
                    "\\mathbf{v}_k" to "Vektor basis asli ke-k",
                    "\\langle \\cdot, \\cdot \\rangle" to "Hasil kali dalam (inner product / dot product)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pipeline Transformasi Rendering 3D Real-Time Mesin Game di Studio Animasi Batam",
            industry = "Grafika Komputer & Animasi Digital 3D",
            context = "Studio animasi dan game di Batam merender adegan kota metropolitan dengan jutaan poligon segitiga secara real-time pada 60 frame per detik.",
            problem = "Setiap titik puncak poligon (vertex) dalam ruang model 3D harus dirotasi, diskalakan, diproyeksikan ke sudut pandang kamera, dan akhirnya dipetakan ke koordinat layar 2D monitor tanpa distorsi.",
            solution = "Pipeline grafis GPU (Graphics Processing Unit) memodelkan seluruh tahapan ini sebagai rantai perkalian matriks transformasi linear 4x4 koordinat homogen: V_layar = M_proyeksi · M_pandang · M_dunia · V_model. Dengan basis ortonormal ruang kamera yang dibangun via algoritma Gram-Schmidt (vektor depan, atas, dan samping saling tegak lurus), transformasi koordinat balik kamera (invers matriks pandang) dapat dihitung seketika hanya dengan melakukan transpos matriks (M⁻¹ = M^T), menghemat triliunan siklus komputasi per detik.",
            lessonsLearned = "Efisiensi rendering visual 3D modern pada game dan film bertumpu sepenuhnya pada aljabar linear transformasi dan sifat matriks ortogonal."
        ),
        homeLab = HomeLabData(
            title = "Proyeksi Ortogonal Bayangan Menggunakan Senter dan Dua Penggaris",
            objective = "Memvisualisasikan prinsip pemisahan vektor menjadi komponen proyeksi paralel dan komponen ortogonal (inti dari Gram-Schmidt).",
            materialsNeeded = listOf(
                "2 buah penggaris 30 cm",
                "Lampu senter smartphone",
                "1 lembar kertas putih di atas meja"
            ),
            steps = listOf(
                "Letakkan Penggaris 1 mendatar di atas kertas sebagai vektor arah u1 (vektor acuan).",
                "Letakkan Penggaris 2 membentuk sudut miring 45° terhadap Penggaris 1 sebagai vektor v2.",
                "Sorotkan senter tepat tegak lurus dari atas Penggaris 2 ke arah Penggaris 1. Amati bayangan Penggaris 2 yang jatuh tepat di sepanjang Penggaris 1: bayangan tersebut adalah Proyeksi Ortogonal Proj_u1(v2).",
                "Vektor yang tersisa dari ujung bayangan ke ujung Penggaris 2 adalah komponen tegak lurus murni u2 = v2 - Proj_u1(v2).",
                "Periksa dengan busur derajat: sudut antara Penggaris 1 (u1) dan komponen sisa (u2) membentuk sudut tepat 90° tegak lurus!",
                "Simpulkan: Prosedur ini adalah visualisasi fisik dari langkah pertama Gram-Schmidt."
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan mudah dilakukan di meja belajar."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-trans-linear-1",
                prompt = "Diberikan dua vektor basis di R²: v1 = (3, 0) dan v2 = (1, 2). Gunakan proses Gram-Schmidt untuk mencari vektor ortogonal kedua u2 yang tegak lurus terhadap u1 = v1!",
                type = "multiple_choice",
                options = listOf(
                    "u2 = (0, 2)",
                    "u2 = (1, 0)",
                    "u2 = (2, 2)",
                    "u2 = (0, -2)"
                ),
                correctAnswer = "u2 = (0, 2)",
                hints = listOf(
                    "u1 = v1 = (3, 0).",
                    "Proj_u1(v2) = [(v2 · u1) / ||u1||²] · u1 = [(1·3 + 2·0) / 3²] · (3, 0) = (3/9) · (3, 0) = (1, 0).",
                    "u2 = v2 - Proj_u1(v2) = (1, 2) - (1, 0) = ...?"
                ),
                explanation = "Langkah Gram-Schmidt: u1 = v1 = (3, 0). Proyeksi v2 pada u1 dihitung dari: Proj_u1(v2) = ((v2 · u1) / ||u1||²) u1 = ((1·3 + 2·0) / 9) (3, 0) = (3/9)(3, 0) = (1, 0). Maka vektor ortogonal kedua adalah u2 = v2 - Proj_u1(v2) = (1, 2) - (1, 0) = (0, 2). Terlihat jelas bahwa dot product u1 · u2 = 3·0 + 0·2 = 0 (saling tegak lurus).",
                misconception = "Lupa membagi dengan kuadrat norma ||u1||² saat menghitung proyeksi skalar."
            ),
            QuizQuestion(
                id = "q-trans-linear-2",
                prompt = "Sebuah transformasi linear T: R³ -> R² memiliki kernel ker(T) yang berdimensi 1 (nullity = 1). Apakah transformasi linear T tersebut bersifat surjektif (pada)?",
                type = "multiple_choice",
                options = listOf(
                    "Ya, pasti surjektif karena berdasarkan Teorema Rank-Nullity rank(T) = 3 - 1 = 2 yang sama persis dengan dimensi kodomain R²",
                    "Tidak, tidak mungkin surjektif",
                    "Transformasi linear tersebut bersifat injektif satu-satu",
                    "Tidak dapat ditentukan tanpa mengetahui rumus matriksnya"
                ),
                correctAnswer = "Ya, pasti surjektif karena berdasarkan Teorema Rank-Nullity rank(T) = 3 - 1 = 2 yang sama persis dengan dimensi kodomain R²",
                hints = listOf(
                    "Dimensi domain V = R³ adalah 3.",
                    "Teorema Rank-Nullity: rank(T) + nullity(T) = 3.",
                    "rank(T) = 3 - 1 = 2.",
                    "Dimensi kodomain W = R² adalah 2."
                ),
                explanation = "Berdasarkan Teorema Rank-Nullity, rank(T) = dim(domain) - nullity(T) = 3 - 1 = 2. Karena rank(T) = 2 sama dengan dimensi ruang kodomain (dim(R²) = 2), maka daerah hasil (image/range) transformasi T mencakup seluruh kodomain, membuktikan bahwa T bersifat surjektif.",
                misconception = "Mengira transformasi antar-ruang dimensi berbeda (3 ke 2) tidak pernah bisa surjektif."
            )
        )
    )

    private fun getNilaiEigenVektorLesson(): LessonData = LessonData(
        conceptId = "mat-nilai-eigen-vektor",
        storyPanels = listOf(
            StoryPanel(
                id = "p-eigen-1",
                panelNumber = 1,
                title = "Vektor yang Menolak Berputar",
                caption = "Dimas mengamati efek perkalian matriks deformasi pada sekumpulan panah vektor. Hampir semua panah berputar berubah arah, tetapi ada satu panah khusus yang hanya memanjang tanpa bergeser arah sama sekali!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kenapa vektor khusus ini tidak ikut berputar saat dikalikan matriks, melainkan hanya meregang memanjang searah garis aslinya?"
            ),
            StoryPanel(
                id = "p-eigen-2",
                panelNumber = 2,
                title = "Definisi Nilai Eigen dan Vektor Eigen",
                caption = "Kakek menjelaskan persamaan fundamental A v = lambda v.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itulah Vektor Eigen (vektor karakteristik)! Matriks A bertindak pada vektor eigen v semata-mata seperti perkalian skalar biasa: A v = lambda v. Arahnya invarian, dan lambda adalah faktor perpanjangannya (Nilai Eigen)!"
            ),
            StoryPanel(
                id = "p-eigen-3",
                panelNumber = 3,
                title = "Persamaan Karakteristik & Cayley-Hamilton",
                caption = "Kirana memecahkan determinan det(A - lambda I) = 0 untuk menemukan spektrum nilai eigen.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Agar ada vektor tak-nol yang memenuhi (A - lambda I) v = 0, matriks (A - lambda I) harus singular, artinya det(A - lambda I) = 0! Dan Teorema Cayley-Hamilton yang luar biasa menyatakan: Setiap matriks selalu memenuhi persamaan karakteristiknya sendiri: p(A) = 0!"
            )
        ),
        intuition = "Secara geometris, ketika matriks kuadrat A mengalikan sembarang vektor, vektor tersebut umumnya mengalami rotasi (perubahan arah) dan dilatasi (perubahan panjang). Namun, terdapat arah-arah invarian istimewa di mana matriks A bertindak murni sebagai penskalaan skalar tanpa memutar arah sama sekali: A v = lambda v. Vektor tak-nol v disebut Vektor Eigen, dan skalar lambda disebut Nilai Eigen. Nilai eigen ditemukan dari akar-akar polinomial karakteristik p(lambda) = det(A - lambda I) = 0. Teorema Cayley-Hamilton menyatakan bahwa jika p(lambda) adalah polinomial karakteristik A, maka mensubstitusikan matriks A ke dalam polinomial tersebut akan menghasilkan matriks nol: p(A) = 0.",
        intuitionPoints = listOf(
            "Persamaan Nilai Eigen: A v = lambda v ekuivalen dengan (A - lambda I) v = 0.",
            "Persamaan Karakteristik: det(A - lambda I) = 0 menghasilkan polinomial berderajat n.",
            "Jumlah semua nilai eigen sama dengan Trace (jejak) matriks: sum(lambda_i) = tr(A).",
            "Hasil kali semua nilai eigen sama dengan Determinan matriks: prod(lambda_i) = det(A).",
            "Teorema Cayley-Hamilton: memungkinkan perhitungan invers matriks A⁻¹ dan pangkat tinggi A^k secara aljabar langsung tanpa eliminasi rumit."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Persamaan Nilai Eigen & Polinomial Karakteristik",
                latexFormula = "A \\mathbf{v} = \\lambda \\mathbf{v} \\iff \\det(A - \\lambda I) = 0",
                description = "Kondisi keharusan agar ada vektor eigen tak-nol v ≠ 0.",
                variableMeanings = mapOf(
                    "A" to "Matriks bujursangkar n x n",
                    "\\mathbf{v}" to "Vektor eigen tak-nol (vektor karakteristik)",
                    "\\lambda" to "Nilai eigen (skalar nilai karakteristik)",
                    "I" to "Matriks identitas n x n"
                )
            ),
            FormulaCard(
                title = "Teorema Cayley-Hamilton",
                latexFormula = "p(\\lambda) = \\det(A - \\lambda I) = (-1)^n \\lambda^n + \\cdots + \\det(A) \\implies p(A) = O",
                description = "Setiap matriks kuadrat memenuhi persamaan polinomial karakteristiknya sendiri menghasilkan matriks nol O.",
                variableMeanings = mapOf(
                    "p(A)" to "Polinomial matriks",
                    "O" to "Matriks nol berukuran n x n"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Algoritma Pemeringkatan Halaman Web PageRank Google di Pusat Data",
            industry = "Mesin Pencari Internet & Analisis Graf Raksasa",
            context = "Mesin pencari Google memproses miliaran halaman web di internet yang saling menautkan link untuk menentukan halaman mana yang paling otoritatif dan relevan.",
            problem = "Bagaimana meranking miliaran situs web secara matematis objektif jika reputasi suatu situs ditentukan oleh jumlah dan kualitas situs lain yang menautkannya?",
            solution = "Larry Page dan Sergey Brin memodelkan penjelajah internet acak sebagai Rantai Markov dengan matriks transisi stokastik raksasa P. Skor otoritas PageRank adalah vektor probabilitas stasioner pi yang memenuhi: pi · P = pi (atau P^T pi = 1 · pi). Vektor PageRank tidak lain adalah Vektor Eigen dari matriks P yang berkorespondensi dengan Nilai Eigen lambda = 1! Menggunakan metode iterasi daya (power iteration method), server Google menghitung vektor eigen dominan ini pada matriks berukuran triliunan tautan untuk mengurutkan hasil pencarian secara instan.",
            lessonsLearned = "Konsep abstrak nilai eigen dan vektor eigen merupakan fondasi algoritma bernilai ribuan triliun rupiah di era mesin pencari dan kecerdasan buatan modern."
        ),
        homeLab = HomeLabData(
            title = "Visualisasi Sumbu Regangan Elastis Balon Menggunakan Titik Lingkaran",
            objective = "Melihat arah invarian vektor eigen secara kasat mata pada deformasi mekanik dua dimensi.",
            materialsNeeded = listOf(
                "1 buah balon tiup karet bulat pipih belum ditiup",
                "Spidol permanen",
                "Uang koin untuk menjiplak lingkaran sempurna"
            ),
            steps = listOf(
                "Bentangkan permukaan karet balon di atas meja datar.",
                "Gunakan koin dan spidol untuk menggambar lingkaran sempurna berdiameter 3 cm di permukaan karet balon. Gambar panah sumbu x horizontal dan sumbu y vertikal di dalam lingkaran.",
                "Tarik karet balon dengan kedua tangan secara kuat ke arah diagonal 45° (meregangkan sepanjang satu arah dan menyusut di arah tegak lurusnya).",
                "Amati bentuk lingkaran berubah menjadi elips!",
                "Perhatikan arah-arah vektor panah di dalam elips: panah sembarang berputar miring, TETAPI sumbu panjang elips dan sumbu pendek elips arahnya tetap lurus tidak berputar!",
                "Simpulkan: Sumbu mayor (panjang) dan minor (pendek) elips deformasi tersebut adalah sepasang Vektor Eigen ortogonal dari tensor regangan elastis, dan faktor peregangannya adalah Nilai Eigen-nya!"
            ),
            safetyNotes = listOf(
                "Jangan menarik karet balon terlalu kencang agar tidak robek."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-eigen-1",
                prompt = "Diberikan matriks A = [[4, 2], [1, 3]]. Berapakah salah satu nilai eigen (lambda) dari matriks A tersebut?",
                type = "multiple_choice",
                options = listOf(
                    "lambda = 5 (dan lambda = 2)",
                    "lambda = 4 (dan lambda = 3)",
                    "lambda = 1 (dan lambda = 6)",
                    "lambda = 7 (dan lambda = 0)"
                ),
                correctAnswer = "lambda = 5 (dan lambda = 2)",
                hints = listOf(
                    "Hitung determinan det(A - lambda I) = (4 - lambda)(3 - lambda) - (2)(1) = 0.",
                    "12 - 7 lambda + lambda² - 2 = 0 <=> lambda² - 7 lambda + 10 = 0.",
                    "Faktorkan: (lambda - 5)(lambda - 2) = 0."
                ),
                explanation = "Persamaan karakteristik det(A - lambda I) = 0: (4 - lambda)(3 - lambda) - (2)(1) = lambda² - 7 lambda + 10 = 0. Dengan memfaktorkan persamaan kuadrat ini: (lambda - 5)(lambda - 2) = 0, kita memperoleh dua nilai eigen: lambda_1 = 5 dan lambda_2 = 2. Cek: trace = 4+3 = 7 (5+2 = 7) dan det = 4·3 - 2·1 = 10 (5·2 = 10).",
                misconception = "Mengambil elemen diagonal utama langsung (4 dan 3) sebagai nilai eigen (ini hanya berlaku jika matriks sudah segitiga atau diagonal)."
            ),
            QuizQuestion(
                id = "q-eigen-2",
                prompt = "Sebuah matriks 2 x 2 memiliki polinomial karakteristik p(lambda) = lambda² - 5 lambda + 6 = 0. Berdasarkan Teorema Cayley-Hamilton, berapakah nilai dari ekspresi matriks A² - 5A?",
                type = "multiple_choice",
                options = listOf(
                    "-6 I (di mana I adalah matriks identitas)",
                    "+6 I",
                    "Matriks nol O",
                    "5 A"
                ),
                correctAnswer = "-6 I (di mana I adalah matriks identitas)",
                hints = listOf(
                    "Teorema Cayley-Hamilton: p(A) = A² - 5A + 6I = O (matriks nol).",
                    "Pindahkan konstanta 6I ke ruas kanan: A² - 5A = -6I."
                ),
                explanation = "Berdasarkan Teorema Cayley-Hamilton, setiap matriks memenuhi persamaan karakteristiknya sendiri, sehingga p(A) = A² - 5A + 6I = O, di mana O adalah matriks nol. Dengan memindahkan suku 6I ke ruas kanan, kita peroleh A² - 5A = -6I.",
                misconception = "Lupa mengalikan konstanta skalar 6 dengan matriks identitas I."
            )
        )
    )

    private fun getDiagonalisasiSvdLesson(): LessonData = LessonData(
        conceptId = "mat-diagonalisasi-svd",
        storyPanels = listOf(
            StoryPanel(
                id = "p-svd-1",
                panelNumber = 1,
                title = "Menghitung Pangkat Seribu Matriks",
                caption = "Dimas harus menghitung A¹⁰⁰⁰ untuk memprediksi dinamika populasi jangka panjang. Menghitung perkalian matriks biasa seribu kali akan membutuhkan miliaran operasi.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Apakah ada cara menghitung A¹⁰⁰⁰ dalam hitungan detik tanpa mengalikan matriksnya berulang-ulang seribu kali?"
            ),
            StoryPanel(
                id = "p-svd-2",
                panelNumber = 2,
                title = "Keajaiban Diagonalisasi A = PDP⁻¹",
                caption = "Kakek menuliskan dekomposisi matriks menggunakan basis vektor eigen.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jika A memiliki n vektor eigen bebas linear, A dapat didiagonalisasi menjadi A = P D P⁻¹ di mana D adalah matriks diagonal nilai eigen! Maka A¹⁰⁰⁰ = P D¹⁰⁰⁰ P⁻¹, dan memangkatkan matriks diagonal hanya perlu memangkatkan angka diagonalnya saja!"
            ),
            StoryPanel(
                id = "p-svd-3",
                panelNumber = 3,
                title = "Puncak Aljabar Linear: Dekomposisi SVD",
                caption = "Kirana memaparkan Singular Value Decomposition (SVD) yang berlaku untuk sembarang matriks persegi panjang.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Diagonalisasi biasa hanya untuk matriks bujursangkar tertentu. SVD A = U Sigma V^T berlaku untuk SEMBARANG matriks m x n! SVD memecah matriks data menjadi penjumlahan lapisan matriks berperingkat-1 terurut nilai singular terbesar, fondasi kompresi gambar dan AI recommender system!"
            )
        ),
        intuition = "Diagonalisasi mengubah matriks ke dalam sistem koordinat basis vektor eigennya sendiri di mana aksi matriks menjadi independen per sumbu koordinat (matriks diagonal D). Namun, tidak semua matriks dapat didiagonalisasi (harus memiliki n vektor eigen bebas linear). Dekomposisi Nilai Singular (Singular Value Decomposition / SVD) adalah mahakarya aljabar linear yang mengatasi keterbatasan ini: sembarang matriks A berukuran m x n dapat didekomposisi menjadi A = U Sigma V^T, di mana U (m x m) dan V (n x n) adalah matriks ortogonal, dan Sigma (m x n) adalah matriks diagonal semu berisi nilai-nilai singular sigma_i = sqrt(lambda_i(A^T A)) terurut mengecil.",
        intuitionPoints = listOf(
            "Diagonalisasi: A = P D P⁻¹ di mana kolom-kolom P adalah vektor eigen dan entri diagonal D adalah nilai eigen.",
            "SVD: A = U Sigma V^T. Vektor kolom U disebut vektor singular kiri (vektor eigen dari A A^T), kolom V adalah vektor singular kanan (vektor eigen dari A^T A).",
            "Teorema Eckart-Young-Mirsky: pemotongan SVD pada k nilai singular pertama (Truncated SVD) menghasilkan aproksimasi matriks peringkat-k terbaik (optimal rank-k approximation) dalam norma Frobenius.",
            "Aplikasi utama SVD: Kompresi gambar digital, Principal Component Analysis (PCA) pereduksi dimensi data, dan sistem rekomendasi matriks faktorisasi Netflix/Spotify."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Dekomposisi Nilai Singular (SVD)",
                latexFormula = "A = U \\Sigma V^T = \\sum_{i=1}^{r} \\sigma_i \\mathbf{u}_i \\mathbf{v}_i^T",
                description = "Faktorisasi sembarang matriks m x n menjadi kombinasi jumlahan matriks luar berperingkat-1 berbobot nilai singular sigma_i.",
                variableMeanings = mapOf(
                    "A" to "Matriks riil sembarang berukuran m x n",
                    "U" to "Matriks ortogonal m x m (vektor singular kiri)",
                    "\\Sigma" to "Matriks diagonal m x n berisi nilai singular sigma_1 >= sigma_2 >= ... >= 0",
                    "V^T" to "Transpos matriks ortogonal n x n (vektor singular kanan)"
                )
            ),
            FormulaCard(
                title = "Pangkat Matriks Terdiagonalisasi",
                latexFormula = "A^k = P D^k P^{-1} = P \\begin{bmatrix} \\lambda_1^k & 0 & \\cdots \\\\ 0 & \\lambda_2^k & \\cdots \\\\ \\vdots & \\vdots & \\ddots \\end{bmatrix} P^{-1}",
                description = "Metode efisien menghitung pangkat matriks kuadrat terdiagonalisasi.",
                variableMeanings = mapOf(
                    "A^k" to "Matriks A berpangkat k",
                    "D^k" to "Matriks diagonal dengan setiap elemen dipangkatkan k"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kompresi Citra Satelit Penginderaan Jauh LAPAN/BRIN Menggunakan Truncated SVD",
            industry = "Teknologi Satelit, Penginderaan Jauh & Sains Data Geospasial",
            context = "Satelit observasi bumi LAPAN-A3 merekam foto resolusi tinggi kepulauan Indonesia berukuran 4000 x 4000 piksel monokrom (16 megabita per kanal).",
            problem = "Bandwidth transmisi telemetri satelit ke stasiun bumi di Rumpin, Bogor, terbatas dan sering terganggu cuaca awan tebal. Bagaimana mengompresi ukuran citra 90% lebih kecil di prosesor satelit tanpa merusak fitur daratan pulau?",
            solution = "Komputer satelit menerapkan Truncated SVD pada matriks citra A berukuran 4000x4000. Dari 4000 nilai singular asli, energi varians citra terkonsentrasi pada 80 nilai singular terbesar (sigma_1 hingga sigma_80 memuat 98% informasi). Alih-alih menyimpan 4000x4000 = 16.000.000 angka, satelit hanya menyimpan U_80 (4000x80), Sigma_80 (80), dan V_80 (4000x80) dengan total hanya 640.080 angka! Ukuran file menyusut drastis 96% dari 16 MB menjadi 0.64 MB, ditransmisikan dalam hitungan detik, dan direkonstruksi sempurna di stasiun bumi.",
            lessonsLearned = "SVD adalah pilar utama pemadatan informasi visual di era kecerdasan buatan dan observasi antariksa modern."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Kompresi Matriks Angka Berperingkat Rendah di Kertas Berpetak",
            objective = "Memahami bagaimana matriks besar dapat diaproksimasi dengan perkalian dua vektor (prinsip rank-1 outer product SVD).",
            materialsNeeded = listOf(
                "Kertas berpetak milimeter block",
                "Pensil dan kalkulator biasa"
            ),
            steps = listOf(
                "Tulis matriks data 3x3 yang memiliki pola teratur: Baris 1: [2, 4, 6], Baris 2: [4, 8, 12], Baris 3: [6, 12, 18]. Perhatikan bahwa baris 2 dan 3 adalah kelipatan baris 1 (rank matriks ini tepat 1!).",
                "Buktikan bahwa matriks 3x3 ini (9 angka) dapat ditulis murni sebagai perkalian satu vektor kolom u dan satu vektor baris v^T: u = [1, 2, 3]^T dan v^T = [2, 4, 6].",
                "Kalikan u · v^T: baris 1 = 1*[2 4 6], baris 2 = 2*[2 4 6] = [4 8 12], baris 3 = 3*[2 4 6] = [6 12 18]! Matriks 9 angka tadi tersimpan sempurna hanya dengan 3 + 3 = 6 angka!",
                "Simpulkan: SVD memecah sembarang matriks menjadi penjumlahan suku-suku vektor luar seperti ini, menyaring informasi utama dan membuang derau (noise) kecil!"
            ),
            safetyNotes = listOf(
                "Praktikum perhitungan murni yang aman dan melatih intuisi komputasi."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-svd-1",
                prompt = "Jika suatu matriks A berukuran 3 x 3 dapat didiagonalisasi dengan A = P D P⁻¹ di mana matriks diagonal D = diag(1, 2, 3), berapakah nilai determinan dari matriks A tersebut?",
                type = "numeric",
                correctAnswer = "6",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "det(A) = det(P D P⁻¹) = det(P) · det(D) · det(P⁻¹).",
                    "det(P) · det(P⁻¹) = 1, sehingga det(A) = det(D).",
                    "Determinan matriks diagonal adalah perkalian entri diagonalnya: 1 · 2 · 3 = ...?"
                ),
                explanation = "Determinan matriks invarian di bawah transformasi keserupaan: det(A) = det(P D P⁻¹) = det(P) det(D) det(P)⁻¹ = det(D). Karena D adalah matriks diagonal dengan entri 1, 2, dan 3, maka det(D) = 1 · 2 · 3 = 6. Jadi det(A) = 6.",
                misconception = "Mengira harus mengetahui elemen-elemen matriks P terlebih dahulu untuk menghitung determinan A."
            ),
            QuizQuestion(
                id = "q-svd-2",
                prompt = "Berdasarkan Teorema Eckart-Young, metode matematis apakah yang memberikan aproksimasi matriks berperingkat k (rank-k) TERBAIK dengan galat kuadrat terkecil terkecil untuk sembarang matriks data riil?",
                type = "multiple_choice",
                options = listOf(
                    "Memotong Dekomposisi SVD (Truncated SVD) dengan hanya mempertahankan k nilai singular terbesar",
                    "Menghapus baris dan kolom terakhir matriks secara acak",
                    "Mengganti seluruh nilai eigen negatif dengan nol",
                    "Melakukan eliminasi Gauss hingga tersisa k baris"
                ),
                correctAnswer = "Memotong Dekomposisi SVD (Truncated SVD) dengan hanya mempertahankan k nilai singular terbesar",
                hints = listOf(
                    "Teorema Eckart-Young-Mirsky membuktikan optimalitas Truncated SVD.",
                    "Nilai singular sigma_i diurutkan dari yang paling besar ke yang paling kecil."
                ),
                explanation = "Teorema Eckart-Young-Mirsky menyatakan bahwa aproksimasi matriks peringkat k terbaik A_k terhadap matriks A (dalam arti meminimalkan norma Frobenius ||A - A_k||_F) diperoleh secara unik dengan mengambil penjumlahan k suku pertama dari dekomposisi SVD: A_k = sum_{i=1}^k sigma_i u_i v_i^T. Suku-suku setelah k yang memiliki nilai singular kecil dibuang karena merepresentasikan detail kecil atau derau.",
                misconception = "Mengira eliminasi Gauss biasa dapat menghasilkan aproksimasi optimal kuadrat terkecil."
            )
        )
    )

    private fun getLogikaProposisiPredikatLesson(): LessonData = LessonData(
        conceptId = "mat-logika-proposisi-predikat",
        storyPanels = listOf(
            StoryPanel(
                id = "p-logika-1",
                panelNumber = 1,
                title = "Argumen yang Menjebak",
                caption = "Dimas berdebat dengan temannya yang menyatakan: 'Jika hari hujan, maka jalanan basah. Sekarang jalanan basah, jadi pasti tadi hari hujan!'",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kedengarannya masuk akal, tapi bukankah jalanan basah bisa karena disiram mobil pemadam kebakaran atau pipa bocor? Di mana cacat logikanya?"
            ),
            StoryPanel(
                id = "p-logika-2",
                panelNumber = 2,
                title = "Sesat Pikir & Modus Ponens",
                caption = "Kakek menuliskan bentuk simbolik implikasi P -> Q dan tabel kebenarannya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Itu sesat pikir klasik 'Affirming the Consequent' (Menegaskan Akibat), Dimas! Yang sahih adalah Modus Ponens: (P -> Q dan P) menghasilkan Q, atau Modus Tollens: (P -> Q dan ~Q) menghasilkan ~P!"
            ),
            StoryPanel(
                id = "p-logika-3",
                panelNumber = 3,
                title = "Kuantor Universal & Eksistensial",
                caption = "Kirana memperluas logika proposisi ke logika predikat orde pertama dengan kuantor ∀ (untuk semua) dan ∃ (ada setidaknya satu).",
                dialogueSpeaker = "Kirana",
                dialogueText = "Hukum De Morgan untuk kuantor sangat elegan: Ingkaran dari 'Semua burung bisa terbang' [~(∀x P(x))] BUKAN 'Semua burung tidak bisa terbang', melainkan 'Ada setidaknya satu burung yang tidak bisa terbang' [∃x ~P(x)]!"
            )
        ),
        intuition = "Logika matematika formal adalah bahasa baku pembuktian ilmiah dan sirkuit digital komputer. Proposisi adalah pernyataan deklaratif yang bernilai benar (True) atau salah (False) secara mutlak. Operator logika dasar mencakup Konjungsi (AND: ∧), Disjungsi (OR: ∨), Negasi (NOT: ¬), Implikasi (IF-THEN: P -> Q, yang ekuivalen logis dengan ¬P ∨ Q), dan Bi-implikasi (IFF: P <-> Q). Logika Predikat memperkenalkan variabel dan kuantor: Kuantor Universal (∀: 'untuk setiap') dan Kuantor Eksistensial (∃: 'terdapat setidaknya satu'). Aturan inferensi deduktif formal menjamin bahwa kesimpulan pasti benar jika premis-premisnya benar.",
        intuitionPoints = listOf(
            "Implikasi P -> Q hanya bernilai SALAH jika anteseden P benar namun konsekuen Q salah (T -> F = F). Jika P salah, implikasi selalu bernilai benar secara hampa (vacuously true).",
            "Kontraposisi: (P -> Q) ekuivalen logis persis dengan (¬Q -> ¬P). Konvers (Q -> P) dan invers (¬P -> ¬Q) TIDAK ekuivalen logis dengan P -> Q.",
            "Dualitas Negasi Kuantor De Morgan: ¬(∀x P(x)) ≡ ∃x ¬P(x) dan ¬(∃x P(x)) ≡ ∀x ¬P(x).",
            "Tautologi adalah pernyataan majemuk yang selalu bernilai Benar untuk semua kemungkinan nilai kebenaran komponennya (misal: P ∨ ¬P)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Ekuivalensi Implikasi & Kontraposisi",
                latexFormula = "(P \\implies Q) \\equiv (\\neg P \\lor Q) \\equiv (\\neg Q \\implies \\neg P)",
                description = "Dasar metode pembuktian kontraposisi dalam matematika analitik.",
                variableMeanings = mapOf(
                    "P \\implies Q" to "Implikasi jika P maka Q",
                    "\\neg P \\lor Q" to "Bukan P atau Q",
                    "\\neg Q \\implies \\neg P" to "Kontraposisi: jika bukan Q maka bukan P"
                )
            ),
            FormulaCard(
                title = "Negasi Kuantor Predikat (Hukum De Morgan Kuantor)",
                latexFormula = "\\neg \\left(\\forall x \\in S, \\; P(x)\\right) \\iff \\exists x \\in S, \\; \\neg P(x)",
                description = "Membantah klaim universal cukup dengan menemukan satu contoh penyangkal (counterexample).",
                variableMeanings = mapOf(
                    "\\forall x" to "Kuantor universal (untuk setiap elemen x)",
                    "\\exists x" to "Kuantor eksistensial (ada setidaknya satu elemen x)",
                    "P(x)" to "Fungsi predikat proposisi"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Verifikasi Formal Logika Keselamatan Sistem Persinyalan Kereta Cepat Whoosh",
            industry = "Teknik Transportasi Rel Cepat & Perangkat Lunak Kritis Keselamatan",
            context = "Sistem persinyalan otomatis Kereta Cepat Jakarta-Bandung (Whoosh) mengendalikan pergerakan rangkaian kereta EMU pada kecepatan 350 km/jam dengan headway antar-rangkaian 5 menit.",
            problem = "Bug perangkat lunak sekecil apa pun pada logika sinyal blok otomatis dapat memicu tabrakan fatal. Menguji miliaran kombinasi skenario secara empiris mustahil mencakup 100% kemungkinan.",
            solution = "Insinyur sistem menggunakan Verifikasi Formal (Formal Methods) berbasis logika predikat dan model checking logika temporal (LTL). Properti keselamatan fundamental dirumuskan secara matematis: ∀t ∀k1 ∀k2 (k1 ≠ k2 -> ¬(Posisi(k1, t) ∩ Posisi(k2, t))), menyatakan bahwa pada setiap waktu t, tidak ada dua kereta berbeda yang menempati blok lintasan yang sama. Melalui pembuktian teorema deduktif berbantuan komputer, sistem memverifikasi secara matematis mutlak bahwa logika interlock persinyalan kebal dari kebuntuan (deadlock) dan bebas tubrukan.",
            lessonsLearned = "Logika predikat formal bukan sekadar pelajaran simbol filsafat, melainkan fondasi verifikasi kepastian keselamatan sistem transportasi dan kedirgantaraan modern."
        ),
        homeLab = HomeLabData(
            title = "Pembuatan Gerbang Logika NAND Universal Menggunakan Saklar Rumah Tangga",
            objective = "Membuktikan secara fisik bahwa seluruh operator logika (AND, OR, NOT) dapat dibangun murni dari gerbang logika tunggal NAND (Sheffer stroke).",
            materialsNeeded = listOf(
                "1 buah baterai kotak 9V",
                "1 buah lampu LED kecil",
                "Resistor 330 ohm",
                "2 buah saklar pencet/toggle kecil (Saklar A dan B)",
                "Kabel penghubung kecil"
            ),
            steps = listOf(
                "Rangkai sirkuit: Baterai dihubungkan seri ke resistor dan lampu LED. Pasang saklar A dan saklar B secara paralel memotong arus lampu LED (jika kedua saklar on, arus mem-bypass lampu).",
                "Uji tabel kebenaran NAND: (1) A=0, B=0 -> Arus mengalir ke LED -> LED MENYALA (Output 1); (2) A=1, B=0 -> LED MENYALA (Output 1); (3) A=0, B=1 -> LED MENYALA (Output 1); (4) A=1, B=1 -> Arus terhubung singkat lewat saklar -> LED MATI (Output 0)!",
                "Amati bahwa LED HANYA mati jika KEDUA saklar hidup (kebalikan sempurna dari gerbang AND).",
                "Simpulkan: Gerbang NAND adalah gerbang universal yang menjadi bahan dasar miliaran transistor di dalam chip prosesor komputer modern!"
            ),
            safetyNotes = listOf(
                "Gunakan baterai 9V standar yang aman dan berdaya rendah.",
                "Selalu gunakan resistor pembatas arus agar LED tidak putus."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-logika-1",
                prompt = "Manakah dari pernyataan berikut yang merupakan KASUS EKUIVALEN LOGIS (kontraposisi yang valid) dari implikasi: 'Jika bilangan n habis dibagi 4, maka n merupakan bilangan genap'?",
                type = "multiple_choice",
                options = listOf(
                    "Jika bilangan n BUKAN bilangan genap (ganjil), maka n TIDAK habis dibagi 4",
                    "Jika bilangan n merupakan bilangan genap, maka n pasti habis dibagi 4",
                    "Jika bilangan n tidak habis dibagi 4, maka n pasti ganjil",
                    "Bilangan n genap jika dan hanya jika n habis dibagi 4"
                ),
                correctAnswer = "Jika bilangan n BUKAN bilangan genap (ganjil), maka n TIDAK habis dibagi 4",
                hints = listOf(
                    "P: n habis dibagi 4; Q: n adalah bilangan genap.",
                    "Kontraposisi dari P -> Q adalah ¬Q -> ¬P."
                ),
                explanation = "Berdasarkan hukum logika formal, suatu implikasi P -> Q ekuivalen secara mutlak dengan kontraposisinya ¬Q -> ¬P. Negasi dari 'n genap' adalah 'n bukan genap (ganjil)', dan negasi dari 'n habis dibagi 4' adalah 'n tidak habis dibagi 4'. Maka kontraposisi yang sahih adalah: 'Jika n ganjil, maka n tidak habis dibagi 4'.",
                misconception = "Mengira konvers 'Jika n genap maka n habis dibagi 4' bernilai ekuivalen (padahal 6 adalah genap namun tidak habis dibagi 4)."
            ),
            QuizQuestion(
                id = "q-logika-2",
                prompt = "Apakah ingkaran (negasi) formal yang tepat dari pernyataan berkuantor: 'Semua mahasiswa di kelas ini lulus ujian kalkulus'?",
                type = "multiple_choice",
                options = listOf(
                    "Ada setidaknya satu mahasiswa di kelas ini yang TIDAK lulus ujian kalkulus",
                    "Semua mahasiswa di kelas ini tidak lulus ujian kalkulus",
                    "Tidak ada mahasiswa yang mengambil ujian kalkulus",
                    "Sebagian mahasiswa di kelas ini lulus ujian kalkulus"
                ),
                correctAnswer = "Ada setidaknya satu mahasiswa di kelas ini yang TIDAK lulus ujian kalkulus",
                hints = listOf(
                    "Hukum De Morgan untuk kuantor: ¬(∀x P(x)) ≡ ∃x ¬P(x).",
                    "Negasi dari 'semua mematuhi P' adalah 'ada setidaknya satu yang tidak mematuhi P'."
                ),
                explanation = "Pernyataan asli memiliki bentuk kuantor universal: ∀x P(x) ('Untuk setiap mahasiswa x, x lulus'). Berdasarkan hukum negasi De Morgan, ¬(∀x P(x)) ekuivalen dengan ∃x ¬P(x) ('Ada setidaknya satu mahasiswa x yang tidak lulus'). Menolak klaim universal tidak membutuhkan semua orang gagal, melainkan cukup satu contoh penyangkal.",
                misconception = "Mengira negasi dari 'semua' adalah 'semua tidak' (ekstrem terbalik)."
            )
        )
    )

    private fun getHimpunanRelasiCantorLesson(): LessonData = LessonData(
        conceptId = "mat-himpunan-relasi-cantor",
        storyPanels = listOf(
            StoryPanel(
                id = "p-cantor-1",
                panelNumber = 1,
                title = "Hotel Tak Hingga David Hilbert",
                caption = "Dimas membayangkan sebuah hotel dengan jumlah kamar tak hingga (kamar 1, 2, 3, ...) yang terisi penuh. Tiba-tiba datang satu tamu baru yang mencari kamar kosong.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika semua kamar dari 1 sampai tak hingga sudah penuh, bagaimana mungkin hotel masih bisa menampung tamu baru tanpa mengusir tamu lama?"
            ),
            StoryPanel(
                id = "p-cantor-2",
                panelNumber = 2,
                title = "Geseran Bijektif Hotel Hilbert",
                caption = "Kakek menjelaskan korespondensi satu-satu (fungsi bijektif) pada himpunan terbilang.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Cukup minta tamu di kamar n pindah ke kamar n + 1, Dimas! Tamu kamar 1 ke 2, kamar 2 ke 3, dst. Kamar 1 seketika kosong untuk tamu baru! Jumlah bilangan bulat positif genap sama banyaknya dengan seluruh bilangan bulat asli!"
            ),
            StoryPanel(
                id = "p-cantor-3",
                panelNumber = 3,
                title = "Argumen Diagonal Georg Cantor",
                caption = "Kirana membuktikan bahwa bilangan riil jauh lebih banyak dan tak terbilang dibanding bilangan bulat.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Cantor membuktikan ada berbagai tingkatan tak hingga! Bilangan rasional Q dapat dibilang (Aleph-nol), tetapi bilangan riil R tidak terbilang. Dengan argumen diagonal, kita selalu bisa membuat bilangan desimal baru yang tidak ada dalam daftar!"
            )
        ),
        intuition = "Dua himpunan A dan B memiliki kardinalitas yang sama (|A| = |B|) jika dan hanya jika terdapat fungsi bijektif (satu-satu dan pada) antara keduanya. Georg Cantor mengguncang dunia matematika dengan membuktikan bahwa konsep 'tak hingga' memiliki hierarki ukuran yang berbeda. Himpunan yang dapat dipasangkan secara bijektif dengan bilangan asli N disebut Himpunan Terbilang (Countably Infinite, berukuran Aleph-0), seperti bilangan bulat Z dan bilangan rasional Q. Namun, himpunan bilangan riil R bersifat Tak Terbilang (Uncountable, ukuran kontinu c = 2^(Aleph-0)). Argumen diagonal Cantor membuktikan bahwa himpunan kuasa P(S) selalu memiliki kardinalitas yang lebih besar dari S itu sendiri.",
        intuitionPoints = listOf(
            "Relasi Ekuivalensi: relasi biner yang memenuhi sifat Refleksif (a ~ a), Simetris (a ~ b -> b ~ a), dan Transitif (a ~ b dan b ~ c -> a ~ c). Relasi ekuivalensi mempartisi himpunan menjadi kelas-kelas ekuivalensi yang saling lepas.",
            "Poset (Partially Ordered Set): relasi yang memenuhi Refleksif, Antisimetris (a <= b dan b <= a -> a = b), dan Transitif.",
            "Teorema Cantor: untuk sembarang himpunan S, |S| < |P(S)|. Tidak ada himpunan yang memuat himpunan kuasanya sendiri secara surjektif.",
            "Argumen Diagonal Cantor: pembuktian kontradiksi bahwa interval riil (0, 1) tidak dapat didaftarkan sebagai baris berurutan."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Kardinalitas Himpunan Kuasa (Teorema Cantor)",
                latexFormula = "|\\mathcal{P}(S)| = 2^{|S|} > |S|",
                description = "Kardinalitas himpunan kuasa P(S) selalu bernilai lebih besar secara ketat dibanding himpunan asalnya S, bahkan untuk himpunan tak terhingga.",
                variableMeanings = mapOf(
                    "\\mathcal{P}(S)" to "Himpunan kuasa (himpunan semua himpunan bagian dari S)",
                    "|S|" to "Kardinalitas / jumlah anggota himpunan S"
                )
            ),
            FormulaCard(
                title = "Argumen Diagonal Cantor Konstruksi Riil Baru",
                latexFormula = "d_{\\text{baru}} = 0.d_{11}' d_{22}' d_{33}' \\cdots \\quad \\text{dengan } d_{ii}' = \\begin{cases} 4 & \\text{jika } d_{ii} \\neq 4 \\\\ 5 & \\text{jika } d_{ii} = 4 \\end{cases}",
                description = "Konstruksi bilangan riil yang berbeda di digit ke-i dari bilangan baris ke-i, membuktikan daftar bilangan riil tidak pernah lengkap.",
                variableMeanings = mapOf(
                    "d_{ii}" to "Digit ke-i dari bilangan desimal ke-i dalam daftar baris",
                    "d_baru" to "Bilangan riil baru yang terbukti tidak ada dalam daftar"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Batas Komputabilitas Masalah Halting Problem Alan Turing di Ilmu Komputer",
            industry = "Teori Komputasi & Ilmu Komputer Teoretis",
            context = "Alan Turing (1936) merumuskan model mesin komputasi abstrak (Turing Machine) yang menjadi fondasi seluruh komputer modern.",
            problem = "Apakah ada algoritma program komputer universal H(P, I) yang dapat memeriksa sembarang program P dengan input I dan menentukan apakah P akan berhenti (halt) atau mengalami loop tak hingga (hang) selamanya?",
            solution = "Alan Turing menggunakan adaptasi cerdas dari Argumen Diagonal Cantor: Jumlah seluruh kemungkinan algoritma program komputer bersifat terbilang (karena setiap kode program adalah untaian biner berhingga dari himpunan terbilang {0, 1}* berukuran Aleph-0). Namun, jumlah seluruh kemungkinan fungsi keputusan komputasi dari N ke {0, 1} bersifat tak terbilang (berukuran 2^(Aleph-0) kontinu). Karena himpunan fungsi tak terbilang jauh lebih besar dari himpunan program terbilang, maka sebagian besar masalah matematis di alam semesta secara fundamental TIDAK BISA DISELESAIKAN OLEH KOMPUTER APAPUN! Turing membuktikan Halting Problem adalah masalah undecidable pertama dalam sejarah.",
            lessonsLearned = "Teori himpunan dan kardinalitas Cantor membuktikan batas mutlak apa yang bisa dan tidak bisa dihitung oleh teknologi komputer di seluruh alam semesta."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Pembuktian Himpunan Bilangan Rasional Terbilang Berbentuk Zig-Zag",
            objective = "Memvisualisasikan metode pencacahan berurutan pasangan pecahan (p/q) karya Georg Cantor di atas kertas kotak.",
            materialsNeeded = listOf(
                "1 lembar kertas berpetak / buku kotak matematika",
                "Spidol warna"
            ),
            steps = listOf(
                "Buat matriks tabel pecahan tak hingga: Baris 1: 1/1, 1/2, 1/3, 1/4, ...; Baris 2: 2/1, 2/2, 2/3, 2/4, ...; Baris 3: 3/1, 3/2, 3/3, 3/4, ...; dst.",
                "Jika kita mencacah per baris mendatar, kita tidak akan pernah selesai di baris pertama karena kolomnya tak terhingga.",
                "Terapkan Jalur Zig-Zag Diagonal Cantor: Mulai dari (1/1) [urutan 1], lalu turun ke (2/1) [urutan 2], naik diagonal ke (1/2) [urutan 3], geser ke (1/3) [urutan 4], turun diagonal ke (2/2) [lewati karena duplikat], ke (3/1) [urutan 5], dst.",
                "Amati bahwa setiap pecahan p/q yang dapat dibayangkan di alam semesta pasti akan dilewati oleh garis zig-zag pada nomor urut bilangan asli berhingga tertentu!",
                "Simpulkan: Himpunan bilangan pecahan rasional Q terbukti bersifat terbilang (Countable) dan memiliki kardinalitas yang sama persis dengan bilangan asli N!"
            ),
            safetyNotes = listOf(
                "Aktivitas penalaran visual yang aman dan menyenangkan."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-cantor-1",
                prompt = "Manakah dari himpunan tak terhingga berikut yang memiliki kardinalitas TAK TERBILANG (Uncountable) menurut teori himpunan Cantor?",
                type = "multiple_choice",
                options = listOf(
                    "Himpunan semua bilangan riil pada interval terbuka (0, 1)",
                    "Himpunan semua bilangan bulat positif asli N",
                    "Himpunan semua bilangan bulat Z (..., -2, -1, 0, 1, 2, ...)",
                    "Himpunan semua bilangan rasional pecahan Q (p/q)"
                ),
                correctAnswer = "Himpunan semua bilangan riil pada interval terbuka (0, 1)",
                hints = listOf(
                    "N, Z, dan Q semuanya terbukti dapat didaftarkan (terbilang / countable).",
                    "Bilangan riil R memiliki kardinalitas kontinum 2^(Aleph-0)."
                ),
                explanation = "Cantor membuktikan melalui Argumen Diagonal bahwa bilangan riil pada interval (0, 1) tidak dapat dipetakan secara bijektif dengan himpunan bilangan asli N, menjadikannya himpunan tak terbilang (uncountable). Sebaliknya, himpunan bilangan asli N, himpunan bilangan bulat Z, dan himpunan bilangan pecahan rasional Q semuanya bersifat terbilang (countably infinite) dengan kardinalitas Aleph-0.",
                misconception = "Mengira bilangan rasional Q tak terbilang karena di antara dua pecahan selalu ada pecahan lain."
            ),
            QuizQuestion(
                id = "q-cantor-2",
                prompt = "Jika suatu himpunan berhingga S memiliki 5 elemen (|S| = 5), berapakah jumlah elemen dari himpunan kuasanya P(S)?",
                type = "numeric",
                correctAnswer = "32",
                tolerance = 0.05f,
                unit = "elemen",
                hints = listOf(
                    "Rumus kardinalitas himpunan kuasa adalah |P(S)| = 2^|S|.",
                    "|P(S)| = 2⁵ = ...?"
                ),
                explanation = "Kardinalitas himpunan kuasa P(S) dihitung dari rumus |P(S)| = 2^n, di mana n adalah jumlah elemen S. Untuk n = 5, |P(S)| = 2⁵ = 32 himpunan bagian (mencakup himpunan kosong dan himpunan S itu sendiri).",
                misconception = "Mengalikan dengan 2 biasa (5 x 2 = 10) bukannya memangkatkan (2⁵ = 32)."
            )
        )
    )

    private fun getInduksiMatematikaLesson(): LessonData = LessonData(
        conceptId = "mat-induksi-matematika",
        storyPanels = listOf(
            StoryPanel(
                id = "p-induksi-1",
                panelNumber = 1,
                title = "Efek Domino Tak Berujung",
                caption = "Dimas menyusun jutaan kartu domino berderet panjang dan bertanya bagaimana memastikan bahwa semua domino pasti akan runtuh hingga ujung tak terhingga.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Apakah saya harus memeriksa dan melihat keruntuhan setiap kartu domino satu per satu sampai kartu ke satu juta?"
            ),
            StoryPanel(
                id = "p-induksi-2",
                panelNumber = 2,
                title = "Dua Langkah Prinsip Induksi",
                caption = "Kakek menjelaskan dua pilar pembuktian induksi matematika.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Cukup buktikan dua hal, Dimas! Langkah Basis: Domino pertama dijatuhkan P(1) benar. Langkah Induksi: Buktikan bahwa jika domino ke-k jatuh, ia pasti mendorong domino ke-(k+1) ikut jatuh [P(k) -> P(k+1)]. Jika kedua syarat terpenuhi, seluruh domino hingga tak terhingga dijamin pasti runtuh!"
            ),
            StoryPanel(
                id = "p-induksi-3",
                panelNumber = 3,
                title = "Induksi Kuat & Well-Ordering",
                caption = "Kirana memaparkan Induksi Kuat dan Prinsip Urutan Rapi (Well-Ordering Principle).",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dalam Induksi Kuat, kita mengasumsikan P(1), P(2), ..., sampai P(k) semuanya benar untuk membuktikan P(k+1), sangat ampuh untuk membuktikan faktorisasi bilangan prima fundamental!"
            )
        ),
        intuition = "Induksi matematika adalah teknik pembuktian deduktif yang kokoh untuk menetapkan kebenaran suatu pernyataan proposisi P(n) bagi seluruh bilangan bulat n >= n0. Meskipun namanya 'induksi', secara epistemologi metode ini adalah penalaran deduktif murni yang bersandar pada Aksioma Peano dan Prinsip Urutan Rapi (Well-Ordering Principle: setiap himpunan bagian tak-kosong dari bilangan bulat non-negatif pasti memiliki elemen terkecil). Dua langkah mutlak induksi adalah: (1) Langkah Basis (membuktikan P(n0) benar) dan (2) Langkah Induktif (membuktikan bahwa implikasi P(k) -> P(k+1) berlaku untuk sembarang k >= n0).",
        intuitionPoints = listOf(
            "Langkah Basis: mengonfirmasi fondasi awal (biasanya n = 1 atau n = 0). Tanpa langkah basis, langkah induksi tidak memiliki titik pijak.",
            "Hipotesis Induksi: mengasumsikan P(k) benar untuk suatu bilangan bulat sembarang k.",
            "Langkah Induksi: membuktikan bahwa P(k+1) harus benar secara logis berdasarkan asumsi P(k).",
            "Induksi Kuat (Strong Induction): mengasumsikan P(m) benar untuk SEMUA m <= k sebagai dasar membuktikan P(k+1). Induksi kuat setara logis dengan induksi biasa.",
            "Prinsip Urutan Rapi (Well-Ordering): sering digunakan dalam pembuktian kontradiksi dengan memisalkan himpunan penyangkal memiliki elemen terkecil minimal."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Prinsip Induksi Matematika Baku",
                latexFormula = "\\left[ P(1) \\land \\forall k \\ge 1 \\left( P(k) \\implies P(k+1) \\right) \\right] \\implies \\forall n \\in \\mathbb{N}, \\; P(n)",
                description = "Struktur formal pembuktian deduktif kebenaran universal untuk seluruh bilangan asli.",
                variableMeanings = mapOf(
                    "P(1)" to "Langkah basis untuk n = 1",
                    "P(k) \\implies P(k+1)" to "Langkah induksi implikasi dari k ke k+1",
                    "\\forall n \\in \\mathbb{N}" to "Berlaku untuk seluruh bilangan asli"
                )
            ),
            FormulaCard(
                title = "Prinsip Induksi Kuat (Strong Induction)",
                latexFormula = "\\left[ P(1) \\land \\forall k \\ge 1 \\left( \\bigwedge_{j=1}^{k} P(j) \\implies P(k+1) \\right) \\right] \\implies \\forall n \\in \\mathbb{N}, \\; P(n)",
                description = "Mengasumsikan kebenaran seluruh kasus sebelumnya dari 1 hingga k untuk membuktikan kasus k+1.",
                variableMeanings = mapOf(
                    "\\bigwedge_{j=1}^{k} P(j)" to "P(1) dan P(2) dan ... dan P(k) semuanya diasumsikan benar"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pembuktian Kebenaran Algoritma Rekursif Binary Search pada Mesin Basis Data",
            industry = "Rekayasa Perangkat Lunak & Basis Data Performa Tinggi",
            context = "Mesin pencarian basis data SQL (seperti PostgreSQL) mengeksekusi pencarian rekursif pohon B-Tree (Binary Search) pada tabel yang memuat miliaran baris data transaksi keuangan.",
            problem = "Bagaimana menjamin secara matematis mutlak bahwa algoritma rekursif biner selalu menemukan kunci pencarian jika ada dan selalu berhenti (terminate) tanpa loop tak hingga pada sembarang ukuran data n?",
            solution = "Pengembang basis data membuktikan kebenaran invarian perulangan (loop invariant) algoritma menggunakan Induksi Kuat pada panjang rentang data L: (1) Basis: Untuk L = 1, algoritma membandingkan 1 elemen langsung dan berhenti dengan benar; (2) Hipotesis Induksi: Asumsikan algoritma terbukti benar untuk semua rentang berukuran k < L; (3) Langkah Induksi: Untuk rentang berukuran L, algoritma membelah rentang menjadi dua bagian berukuran paling banyak floor(L/2). Karena floor(L/2) < L, berdasarkan hipotesis induksi algoritma terbukti mengembalikan nilai yang benar dan berhenti dalam waktu logaritmik O(log n).",
            lessonsLearned = "Induksi matematika adalah instrumen standar emas para ilmuwan komputer untuk membuktikan kebenaran formal algoritma perangkat lunak misi kritis."
        ),
        homeLab = HomeLabData(
            title = "Pembuktian Fisik Rumus Penjumlahan Bilangan Asli 1+2+...+n Menggunakan Balok Lego",
            objective = "Melihat bukti visual rumus Gauss S_n = n(n+1)/2 melalui penggabungan dua tangga balok persegi.",
            materialsNeeded = listOf(
                "Balok mainan Lego / kubus dadu kecil (total 30 buah)",
                "Kertas dan spidol"
            ),
            steps = listOf(
                "Susun tangga Lego berukuran n = 4: Kolom 1 (1 balok), Kolom 2 (2 balok), Kolom 3 (3 balok), Kolom 4 (4 balok). Total balok = 1 + 2 + 3 + 4 = 10 balok.",
                "Buat susunan tangga identik kedua dengan 10 balok.",
                "Balikkan susunan tangga kedua dan gabungkan rapat ke tangga pertama: amati bahwa gabungan kedua tangga membentuk persegi panjang sempurna berukuran n x (n + 1), yaitu 4 baris x 5 kolom = 20 balok!",
                "Karena persegi panjang tersebut dibentuk oleh 2 tangga identik, maka jumlah balok satu tangga adalah tepat setengahnya: S_4 = 4 x 5 / 2 = 10 balok!",
                "Lakukan uji induksi: tambahkan kolom baru setinggi (n+1) = 5 balok. Tunjukkan bahwa luas bertambah tepat sebesar (n+1), membuktikan langkah induktif S_{k+1} = S_k + (k+1) = (k+1)(k+2)/2 berlaku untuk sembarang n!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan sangat efektif melatih pemahaman visual rumus aljabar."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-induksi-1",
                prompt = "Dalam pembuktian dengan induksi matematika untuk pernyataan: 2^n > n² untuk semua bilangan bulat n >= 5. Manakah langkah basis (base step) yang BENAR?",
                type = "multiple_choice",
                options = listOf(
                    "Membuktikan pernyataan benar untuk n = 5, yaitu 2⁵ > 5² (32 > 25 terbukti benar)",
                    "Membuktikan pernyataan benar untuk n = 1, yaitu 2¹ > 1²",
                    "Membuktikan pernyataan benar untuk n = 0, yaitu 2⁰ > 0²",
                    "Mengasumsikan bahwa 2^k > k² benar"
                ),
                correctAnswer = "Membuktikan pernyataan benar untuk n = 5, yaitu 2⁵ > 5² (32 > 25 terbukti benar)",
                hints = listOf(
                    "Perhatikan domain batasan pernyataan: 'untuk semua bilangan bulat n >= 5'.",
                    "Langkah basis harus dimulai dari nilai n terkecil dalam domain yang ditentukan."
                ),
                explanation = "Karena pernyataan dibatasi untuk n >= 5, langkah basis harus membuktikan kasus awal terkecil yaitu n = 5. Untuk n = 5: ruas kiri 2⁵ = 32, ruas kanan 5² = 25. Karena 32 > 25 benar, maka langkah basis tuntas terpenuhi. (Catatan: untuk n = 3 atau 4, pernyataan tersebut salah: 2³ < 3² dan 2⁴ = 4², sehingga basis n=1 atau n=0 tidak valid).",
                misconception = "Secara refleks selalu memasukkan n = 1 sebagai langkah basis tanpa memperhatikan domain n yang ditentukan pada soal."
            ),
            QuizQuestion(
                id = "q-induksi-2",
                prompt = "Jika diasumsikan pernyataan P(k): 5^k - 1 habis dibagi 4 adalah BENAR. Bagaimanakah cara menunjukkan bahwa P(k+1): 5^(k+1) - 1 juga habis dibagi 4 pada langkah induksi?",
                type = "multiple_choice",
                options = listOf(
                    "Menguraikan 5^(k+1) - 1 menjadi 5 · 5^k - 1 = 5(5^k - 1) + 4, di mana (5^k - 1) habis dibagi 4 berdasarkan hipotesis dan 4 habis dibagi 4",
                    "Mengalikan kedua ruas dengan 5",
                    "Menyatakan bahwa 5^(k+1) - 1 sama dengan (5 - 1)^(k+1)",
                    "Menghitung nilai numerik untuk k = 100"
                ),
                correctAnswer = "Menguraikan 5^(k+1) - 1 menjadi 5 · 5^k - 1 = 5(5^k - 1) + 4, di mana (5^k - 1) habis dibagi 4 berdasarkan hipotesis dan 4 habis dibagi 4",
                hints = listOf(
                    "Gunakan manipulasi aljabar 5^(k+1) = 5 · 5^k.",
                    "Munculkan suku (5^k - 1) dari hipotesis induksi: 5 · 5^k - 1 = 5(5^k - 1) + 5 - 1 = 5(5^k - 1) + 4."
                ),
                explanation = "Langkah induksi memanipulasi bentuk k+1: 5^(k+1) - 1 = 5 · 5^k - 1 = 5(5^k - 1) + 5 - 1 = 5(5^k - 1) + 4. Suku pertama 5(5^k - 1) habis dibagi 4 berdasarkan hipotesis induksi, dan suku kedua 4 jelas habis dibagi 4. Karena jumlahan dua kelipatan 4 adalah kelipatan 4, maka 5^(k+1) - 1 terbukti habis dibagi 4.",
                misconception = "Hanya memasukkan angka tanpa memanfaatkan hipotesis induksi P(k)."
            )
        )
    )

    private fun getKombinatorikaInklusifLesson(): LessonData = LessonData(
        conceptId = "mat-kombinatorika-inklusif",
        storyPanels = listOf(
            StoryPanel(
                id = "p-kombi-1",
                panelNumber = 1,
                title = "Menghitung Tanpa Menghitung Ganda",
                caption = "Dimas menghitung jumlah mahasiswa yang mengambil kelas Matematika atau Fisika dengan menjumlahkan siswa Matematika (100) ditambah siswa Fisika (80). Namun total siswa di jurusan hanya 150 orang!",
                dialogueSpeaker = "Dimas",
                dialogueText = "100 + 80 = 180, padahal total mahasiswa cuma 150! Kenapa hasilnya melebihi jumlah total mahasiswa yang ada?"
            ),
            StoryPanel(
                id = "p-kombi-2",
                panelNumber = 2,
                title = "Prinsip Inklusi-Eksklusi",
                caption = "Kakek menggambarkan diagram Venn dua dan tiga himpunan yang saling tumpang tindih.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kamu menghitung siswa yang mengambil kedua mata kuliah dua kali, Dimas! Prinsip Inklusi-Eksklusi menyatakan: |A ∪ B| = |A| + |B| - |A ∩ B|. Kita harus mengurangi irisan yang terhitung ganda!"
            ),
            StoryPanel(
                id = "p-kombi-3",
                panelNumber = 3,
                title = "Kekuatan Prinsip Pigeonhole & Derangement",
                caption = "Kirana memaparkan Pigeonhole Principle (Prinsip Sarang Burung Merpati) dan masalah permutasi tanpa titik tetap (derangement).",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jika ada n+1 merpati masuk ke n sarang, PASTI ada minimal satu sarang yang memuat minimal 2 merpati! Prinsip sederhana ini dapat membuktikan teorema-teorema matematika terdalam tentang keteraturan pola tersembunyi!"
            )
        ),
        intuition = "Kombinatorika modern melampaui permutasi dan kombinasi sederhana untuk memecahkan masalah pencacahan kompleks dengan tumpang tindih terstruktur. Prinsip Inklusi-Eksklusi (PIE) menggeneralisasi perhitungan ukuran gabungan n himpunan dengan menjumlahkan ukuran himpunan tunggal, mengurangkan seluruh irisan pasangan, menambahkan kembali irisan tiga himpunan, dan seterusnya secara bergantian tanda (+ - + -). Prinsip Sarang Burung Merpati (Pigeonhole Principle / Dirichlet) menyatakan bahwa jika k objek ditempatkan ke dalam n kotak dengan k > n, maka minimal ada satu kotak yang memuat setidaknya ceil(k/n) objek.",
        intuitionPoints = listOf(
            "Prinsip Inklusi-Eksklusi untuk 2 himpunan: |A ∪ B| = |A| + |B| - |A ∩ B|.",
            "Prinsip Inklusi-Eksklusi untuk 3 himpunan: |A ∪ B ∪ C| = (|A|+|B|+|C|) - (|A∩B|+|A∩C|+|B∩C|) + |A∩B∩C|.",
            "Derangement D_n: jumlah permutasi n elemen di mana tidak ada satu pun elemen yang menempati posisi aslinya (dihitung via PIE: D_n = n! sum_{k=0}^n (-1)^k / k! ≈ n! / e).",
            "Prinsip Pigeonhole Tergeneralisasi: jika N objek dimasukkan ke k wadah, maka minimal ada satu wadah yang memuat setidaknya ceil(N/k) objek."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Prinsip Inklusi-Eksklusi Umum",
                latexFormula = "\\left| \\bigcup_{i=1}^{n} A_i \\right| = \\sum_{k=1}^{n} (-1)^{k-1} \\sum_{1 \\le i_1 < \\cdots < i_k \\le n} \\left| A_{i_1} \\cap \\cdots \\cap A_{i_k} \\right|",
                description = "Rumus eksak menghitung kardinalitas gabungan n himpunan dengan koreksi tumpang tindih bergantian tanda.",
                variableMeanings = mapOf(
                    "\\bigcup A_i" to "Gabungan seluruh n himpunan",
                    "\\left| A_{i_1} \\cap \\cdots \\cap A_{i_k} \\right|" to "Kardinalitas irisan k himpunan sekaligus"
                )
            ),
            FormulaCard(
                title = "Jumlah Permutasi Tanpa Titik Tetap (Derangement)",
                latexFormula = "D_n = n! \\sum_{k=0}^{n} \\frac{(-1)^k}{k!} = n! \\left( 1 - \\frac{1}{1!} + \\frac{1}{2!} - \\frac{1}{3!} + \\cdots + \\frac{(-1)^n}{n!} \\right)",
                description = "Jumlah susunan n benda di mana tidak ada benda yang kembali ke posisi awalnya.",
                variableMeanings = mapOf(
                    "D_n" to "Subfaktorial !n / jumlah derangement",
                    "n!" to "Faktorial n"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pencegahan Tabrakan Alokasi Kanal Frekuensi Seluler di Jaringan Smartfren",
            industry = "Teknik Telekomunikasi & Alokasi Spektrum Nirkabel",
            context = "PT Smartfren Telecom mengalokasikan pita frekuensi radio seluler untuk ratusan menara pemancar BTS di kawasan padat Jabodetabek.",
            problem = "Jika dua menara BTS yang bertetangga menggunakan kanal frekuensi yang sama, terjadi interferensi gelombang destruktif yang memutus panggilan telepon pelanggan. Berapa jumlah minimum kanal frekuensi berbeda yang dibutuhkan agar tidak ada dua BTS bertetangga yang bertabrakan?",
            solution = "Insinyur jaringan memodelkan masalah ini sebagai Pewarnaan Graf (Graph Coloring) dan menerapkan Prinsip Inklusi-Eksklusi untuk menghitung Polinomial Kromatik P(G, k). Dengan menghitung P(G, k) > 0, tim membuktikan batas minimum spektrum frekuensi yang aman dan menggunakan Prinsip Pigeonhole untuk membuktikan bahwa di kawasan padat dengan 7 BTS yang saling bertetangga penuh (graf lengkap K_7), mustahil mengalokasikan kurang dari 7 kanal tanpa tabrakan interferensi frekuensi.",
            lessonsLearned = "Kombinatorika inklusi-eksklusi adalah instrumen matematika vital dalam optimasi alokasi spektrum frekuensi telekomunikasi nirkabel modern."
        ),
        homeLab = HomeLabData(
            title = "Pembuktian Prinsip Pigeonhole Menggunakan Kaus Kaki dan Laci Lemari",
            objective = "Membuktikan secara tak terbantahkan prinsip sarang burung merpati dalam kehidupan nyata.",
            materialsNeeded = listOf(
                "10 pasang kaus kaki (10 buah berwarna hitam dan 10 buah berwarna putih yang dicampur acak dalam kantong gelap)",
                "Penutup mata"
            ),
            steps = listOf(
                "Kocok seluruh 20 kaus kaki di dalam kantong gelap.",
                "Tantangan: Berapa jumlah minimum kaus kaki yang harus diambil secara acak dengan mata tertutup untuk MENJAMIN 100% PASTI diperoleh setidaknya SATU pasang kaus kaki berwarna sama?",
                "Terapkan Prinsip Pigeonhole: Ada n = 2 'sarang' warna (Hitam dan Putih).",
                "Jika Anda mengambil 2 kaus kaki, bisa jadi 1 hitam dan 1 putih (belum tentu sepasang).",
                "Tetapi jika Anda mengambil k = 3 kaus kaki (k > n): Berdasarkan Pigeonhole Principle, karena 3 > 2, PASTI ada minimal satu warna yang terambil minimal 2 buah (sepasang)!",
                "Ambil 3 kaus kaki dengan mata tertutup dan buktikan: Anda selalu dijamin mendapatkan sepasang kaus kaki sewarna tanpa pernah gagal sekalipun!"
            ),
            safetyNotes = listOf(
                "Aktivitas sederhana, menyenangkan, dan membuktikan kepastian logika matematis."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kombi-1",
                prompt = "Di sebuah kelas terdapat 40 mahasiswa. Berdasarkan Prinsip Pigeonhole Tergeneralisasi, berapakah jumlah MINIMUM mahasiswa yang dijamin pasti merayakan hari ulang tahunnya pada BULAN yang sama?",
                type = "numeric",
                correctAnswer = "4",
                tolerance = 0.05f,
                unit = "mahasiswa",
                hints = listOf(
                    "Jumlah objek (merpati) N = 40 mahasiswa.",
                    "Jumlah wadah (sarang) k = 12 bulan dalam setahun.",
                    "Rumus: ceil(N / k) = ceil(40 / 12) = ceil(3.33) = ...?"
                ),
                explanation = "Berdasarkan Generalized Pigeonhole Principle, jika N objek dimasukkan ke k wadah, pasti ada minimal satu wadah yang memuat setidaknya ceil(N / k) objek. Di sini N = 40 mahasiswa dan k = 12 bulan. ceil(40 / 12) = ceil(3.333) = 4. Jadi dijamin pasti ada minimal satu bulan di mana setidaknya 4 mahasiswa berulang tahun.",
                misconception = "Membulatkan ke bawah menjadi 3 (jika setiap bulan maksimal 3 orang, maka total mahasiswa paling banyak 3 x 12 = 36 orang, kontradiksi dengan total 40 orang)."
            ),
            QuizQuestion(
                id = "q-kombi-2",
                prompt = "Dari 100 siswa, 50 siswa menyukai Matematika, 40 siswa menyukai Fisika, dan 20 siswa menyukai keduanya. Berapakah jumlah siswa yang TIDAK menyukai Matematika maupun Fisika?",
                type = "numeric",
                correctAnswer = "30",
                tolerance = 0.05f,
                unit = "siswa",
                hints = listOf(
                    "Gunakan Prinsip Inklusi-Eksklusi: |M ∪ F| = |M| + |F| - |M ∩ F|.",
                    "|M ∪ F| = 50 + 40 - 20 = 70 siswa menyukai minimal satu pelajaran.",
                    "Siswa yang tidak menyukai keduanya = Total - |M ∪ F| = 100 - 70 = ...?"
                ),
                explanation = "Berdasarkan Prinsip Inklusi-Eksklusi: Jumlah siswa yang menyukai Matematika atau Fisika adalah |M ∪ F| = |M| + |F| - |M ∩ F| = 50 + 40 - 20 = 70 siswa. Jumlah siswa yang tidak menyukai keduanya adalah komplemennya: 100 - 70 = 30 siswa.",
                misconception = "Lupa mengurangkan irisan 20 sehingga salah menghitung 100 - (50+40) = 10."
            )
        )
    )

    private fun getTeoriGrafLintasanLesson(): LessonData = LessonData(
        conceptId = "mat-teori-graf-lintasan",
        storyPanels = listOf(
            StoryPanel(
                id = "p-graf-1",
                panelNumber = 1,
                title = "Tujuh Jembatan Königsberg",
                caption = "Dimas membaca teka-teki abad ke-18 di kota Königsberg: Bisakah seseorang berjalan melintasi ketujuh jembatan kota tepat satu kali dan kembali ke tempat semula?",
                dialogueSpeaker = "Dimas",
                dialogueText = "Semua orang mencoba ratusan rute jalan kaki tapi selalu gagal melintasi semua jembatan tepat satu kali. Apakah memang ada jalur rahasia yang belum dicoba?"
            ),
            StoryPanel(
                id = "p-graf-2",
                panelNumber = 2,
                title = "Kelahiran Teori Graf oleh Leonhard Euler",
                caption = "Kakek menjelaskan bagaimana Leonhard Euler pada tahun 1736 menyederhanakan peta menjadi simpul (titik) dan sisi (garis).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Euler membuktikan jalan-jalan itu mustahil, Dimas! Setiap kali kamu masuk dan keluar suatu pulau, kamu memakai 2 jembatan. Sirkuit Euler hanya mungkin jika SEMUA simpul berderajat genap! Di Königsberg, keempat pulaunya berderajat ganjil!"
            ),
            StoryPanel(
                id = "p-graf-3",
                panelNumber = 3,
                title = "Algoritma Lintasan Terpendek Dijkstra",
                caption = "Kirana memperlihatkan bagaimana Google Maps dan GPS menemukan rute jalan tercepat menggunakan Algoritma Dijkstra dan pohon merentang minimum.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dengan merepresentasikan jalanan sebagai graf berbobot, algoritma Dijkstra mencari lintasan terpendek secara rakus (greedy) dengan jaminan optimalitas, menjelajahi jutaan persimpangan hanya dalam beberapa milidetik!"
            )
        ),
        intuition = "Teori Graf adalah studi tentang relasi jaringan antara objek-objek diskrit. Graf G = (V, E) terdiri dari himpunan simpul (vertices V) dan sisi penghubung (edges E). Derajat simpul deg(v) adalah jumlah sisi yang terhubung dengannya (Lemma Jabat Tangan: sum deg(v) = 2|E|). Lintasan Euler melintasi setiap sisi tepat satu kali (syarat: terhubung dan memiliki 0 atau 2 simpul berderajat ganjil). Lintasan Hamilton mengunjungi setiap simpul tepat satu kali (masalah NP-Complete). Pohon (Tree) adalah graf terhubung tanpa siklus dengan sifat mendasar |E| = |V| - 1. Algoritma Dijkstra dan Kruskal/Prim adalah algoritma graf klasik untuk optimasi jaringan.",
        intuitionPoints = listOf(
            "Lemma Jabat Tangan (Handshaking Lemma): jumlah derajat semua simpul selalu sama dengan dua kali jumlah sisi: sum deg(v) = 2|E|. Akibatnya, jumlah simpul berderajat ganjil selalu genap.",
            "Teorema Euler: Graf terhubung memiliki Sirkuit Euler (kembali ke awal) jika dan hanya jika seluruh simpulnya berderajat genap. Memiliki Lintasan Euler (beda awal-akhir) jika dan hanya jika tepat ada 2 simpul berderajat ganjil.",
            "Pohon Merentang Minimum (Minimum Spanning Tree / MST): subgraf pohon yang menghubungkan semua simpul dengan total bobot sisi seminimal mungkin (Algoritma Kruskal dan Prim).",
            "Algoritma Dijkstra: menemukan lintasan terpendek dari satu simpul sumber ke seluruh simpul lain pada graf berbobot non-negatif dengan kompleksitas O((V + E) log V)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Lemma Jabat Tangan (Handshaking Lemma)",
                latexFormula = "\\sum_{v \\in V} \\deg(v) = 2 |E|",
                description = "Jumlah derajat seluruh simpul graf selalu sama dengan dua kali jumlah sisi graf.",
                variableMeanings = mapOf(
                    "\\deg(v)" to "Derajat simpul v (jumlah sisi yang melekat)",
                    "|E|" to "Jumlah total sisi graf"
                )
            ),
            FormulaCard(
                title = "Sifat Pohon Terhubung (Tree)",
                latexFormula = "G = (V, E) \\text{ adalah Pohon} \\iff G \\text{ terhubung dan } |E| = |V| - 1",
                description = "Karakteristik invarian graf pohon tanpa siklus dengan V simpul dan E sisi.",
                variableMeanings = mapOf(
                    "|V|" to "Jumlah simpul (vertices)",
                    "|E|" to "Jumlah sisi (edges)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Optimasi Rute Armada Pengiriman Logistik J&T Express Menggunakan Algoritma Dijkstra",
            industry = "Logistik Rantai Pasok & Navigasi Transportasi Cerdas",
            context = "Perusahaan logistik nasional J&T Express mendistribusikan lebih dari 5 juta paket barang per hari di seluruh wilayah Indonesia melalui ribuan pusat sortir (drop point).",
            problem = "Bagaimana merutekan armada truk antar-kota dengan konsumsi bahan bakar dan waktu tempuh minimum ketika menghadapi ribuan pilihan persimpangan jalan tol dan jalur arteri?",
            solution = "Sistem navigasi pusat memodelkan peta jalan raya Indonesia sebagai graf berarah berbobot dengan 50.000 simpul persimpangan dan 120.000 sisi segmen jalan, di mana bobot sisi adalah waktu tempuh dinamis berdasarkan data kemacetan lalu lintas real-time. Menggunakan Algoritma Dijkstra dengan struktur data priority queue Fibonacci heap, server pusat menghitung rute optimal dari gudang Marunda ke seluruh drop point se-Jabodetabek hanya dalam 80 milidetik, menghemat biaya bahan bakar solar hingga 14% per armada.",
            lessonsLearned = "Teori graf adalah fondasi matematika paling krusial di balik seluruh industri logistik, navigasi GPS, jejaring sosial, dan perutean paket data internet dunia."
        ),
        homeLab = HomeLabData(
            title = "Tantangan Menggambar Gambar Sekali Gores (Sirkuit Euler) Tanpa Mengangkat Pensil",
            objective = "Membuktikan secara visual hukum Euler tentang simpul berderajat ganjil dan genap pada gambar teka-teki.",
            materialsNeeded = listOf(
                "Kertas HVS dan spidol",
                "Penggaris"
            ),
            steps = listOf(
                "Gambar 1 (Rumah dengan atap segitiga dan silang X di dalamnya): Hitung derajat tiap simpul (titik sudut). Ada 2 titik berderajat ganjil (3) di pojok bawah, dan titik lainnya berderajat genap (4).",
                "Tantangan: Coba gambar rumah tersebut dalam satu goresan pensil tanpa mengangkat pensil dan tanpa menimpa garis dua kali!",
                "Aturan Euler: Karena ada tepat 2 titik berderajat ganjil, Anda HARUS memulai goresan dari salah satu titik ganjil tersebut dan Anda dijamin PASTI akan berakhir di titik ganjil satunya! Buktikan keberhasilannya!",
                "Gambar 2 (Amplop bertutup yang ditambahi satu garis bawah ganda sehingga ada 4 titik ganjil): Coba gores sekali jalan. Anda PASTI GAGAL karena jumlah titik ganjil lebih dari 2!",
                "Simpulkan: Teorema Euler memberikan kepastian matematika mutlak apakah suatu bentuk bisa digambar sekali jalan atau mustahil!"
            ),
            safetyNotes = listOf(
                "Aktivitas penalaran graf yang sangat menyenangkan untuk semua usia."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-graf-1",
                prompt = "Sebuah graf sederhana terhubung memiliki 10 simpul (vertices) dan merupakan sebuah pohon (tree). Berapakah jumlah sisi (edges) yang dimiliki oleh graf tersebut?",
                type = "numeric",
                correctAnswer = "9",
                tolerance = 0.05f,
                unit = "sisi",
                hints = listOf(
                    "Sifat fundamental sebuah pohon dengan |V| simpul adalah |E| = |V| - 1.",
                    "|E| = 10 - 1 = ...?"
                ),
                explanation = "Berdasarkan definisi dan teorema dasar teori graf, sebuah graf terhubung tanpa siklus (pohon / tree) dengan n simpul selalu memiliki tepat n - 1 sisi. Karena graf memiliki |V| = 10 simpul, maka jumlah sisinya adalah |E| = 10 - 1 = 9 sisi.",
                misconception = "Mengira jumlah sisi sama dengan jumlah simpul (10 sisi akan membentuk setidaknya satu siklus)."
            ),
            QuizQuestion(
                id = "q-graf-2",
                prompt = "Berdasarkan Teorema Euler, kapankah suatu graf terhubung memiliki SIRKUIT EULER (lintasan tertutup yang melintasi setiap sisi tepat satu kali dan kembali ke simpul awal)?",
                type = "multiple_choice",
                options = listOf(
                    "Ketika SEMUA simpul pada graf tersebut memiliki derajat genap",
                    "Ketika graf memiliki tepat dua simpul berderajat ganjil",
                    "Ketika semua simpul berderajat ganjil",
                    "Ketika jumlah simpul sama dengan jumlah sisi"
                ),
                correctAnswer = "Ketika SEMUA simpul pada graf tersebut memiliki derajat genap",
                hints = listOf(
                    "Jika kembali ke titik awal (sirkuit), setiap kunjungan ke simpul membutuhkan 1 sisi masuk dan 1 sisi keluar (kelipatan 2).",
                    "Tepat 2 simpul ganjil menghasilkan LINTASAN Euler (awal ≠ akhir), bukan SIRKUIT Euler."
                ),
                explanation = "Teorema Euler menetapkan bahwa graf terhubung memiliki Sirkuit Euler (kembali ke simpul keberangkatan) jika dan hanya jika setiap simpul memiliki derajat genap (tidak ada simpul berderajat ganjil). Jika ada tepat 2 simpul berderajat ganjil, graf hanya memiliki Lintasan Euler terbuka yang bermula di satu simpul ganjil dan berakhir di simpul ganjil lainnya.",
                misconception = "Tertukar antara syarat Sirkuit Euler (0 simpul ganjil) dan Lintasan Euler terbuka (2 simpul ganjil)."
            )
        )
    )

    private fun getTeoriBilanganModuloLesson(): LessonData = LessonData(
        conceptId = "mat-teori-bilangan-modulo",
        storyPanels = listOf(
            StoryPanel(
                id = "p-bilangan-mod-1",
                panelNumber = 1,
                title = "Aritmetika Jam Dinding & Rahasia Kriptografi",
                caption = "Dimas mengamati jarum jam dinding: Jika sekarang jam 9 pagi, maka 5 jam lagi adalah jam 2 siang (bukan jam 14). Dan bagaimana transaksi belanja online diamankan di internet?",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana sebuah angka bisa 'berputar' kembali ke awal seperti jam dinding, dan mengapa aritmetika berputar ini menjadi kunci keamanan enkripsi internet?"
            ),
            StoryPanel(
                id = "p-bilangan-mod-2",
                panelNumber = 2,
                title = "Algoritma Pembagian Euclid & Identitas Bézout",
                caption = "Kakek menuliskan Algoritma Euclid untuk mencari Faktor Persekutuan Terbesar (FPB) dari dua bilangan raksasa.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Algoritma Euclid adalah algoritma tertua di dunia, Dimas! Dengan membagi bertingkat a = q·b + r, FPB(a, b) = FPB(b, r). Dan Identitas Bézout menjamin ada bilangan bulat x dan y sedemikian hingga ax + by = FPB(a, b), kunci mencari invers modulo!"
            ),
            StoryPanel(
                id = "p-bilangan-mod-3",
                panelNumber = 3,
                title = "Kriptografi Kunci Publik RSA",
                caption = "Kirana memaparkan Teorema Kecil Fermat dan enkripsi RSA yang melindungi perbankan dunia.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Teorema Kecil Fermat a^(p-1) ≡ 1 (mod p) memungkinkan sistem RSA membuat kunci publik (e, n) yang mudah mengunci pesan c = m^e mod n, namun mustahil dibuka tanpa kunci privat d = e⁻¹ mod phi(n) kecuali peretas mampu memfaktorkan perkalian dua bilangan prima raksasa 2048-bit!"
            )
        ),
        intuition = "Aritmetika modulo adalah studi tentang kesisaan bilangan bulat dalam siklus tetap modulus m: a ≡ b (mod m) berarti m membagi habis (a - b). Algoritma Euclidean menemukan FPB(a, b) dalam waktu logaritmik, dan Algoritma Euclidean Terluas menghasilkan kombinasi linear Bézout ax + by = FPB(a, b) yang memungkinkan pencarian invers multiplikatif modulo. Teorema Kecil Fermat (a^(p-1) ≡ 1 mod p untuk prima p) dan Teorema Euler (a^phi(n) ≡ 1 mod n) memberikan fondasi komputasi eksponensiasi modular cepat. Teorema Sisa Cina (Chinese Remainder Theorem / CRT) memecahkan sistem kongruensi simultan dengan modulus saling prima.",
        intuitionPoints = listOf(
            "Kongruensi Modulo: a ≡ b (mod m) jika dan hanya jika a mod m = b mod m.",
            "Invers Modulo: bilangan a memiliki invers perkalian a⁻¹ modulo m jika dan hanya jika FPB(a, m) = 1 (saling prima).",
            "Teorema Kecil Fermat: jika p adalah bilangan prima dan FPB(a, p) = 1, maka a^(p-1) ≡ 1 (mod p).",
            "Kriptografi RSA: bersandar pada asimetri komputasi fungsi satu-arah (one-way function): mengalikan dua bilangan prima raksasa p dan q sangat mudah, namun memfaktorkan n = p·q kembali menjadi faktor primanya membutuhkan waktu miliaran tahun komputer super."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Teorema Kecil Fermat & Teorema Euler",
                latexFormula = "a^{p-1} \\equiv 1 \\pmod p \\quad ; \\quad a^{\\phi(n)} \\equiv 1 \\pmod n",
                description = "Sifat eksponensial modulo dengan p bilangan prima dan phi(n) fungsi totient Euler.",
                variableMeanings = mapOf(
                    "p" to "Bilangan prima (FPB(a, p) = 1)",
                    "\\phi(n)" to "Fungsi Totient Euler (jumlah bilangan < n yang saling prima dengan n)"
                )
            ),
            FormulaCard(
                title = "Enkripsi & Dekripsi Kriptografi Kunci Publik RSA",
                latexFormula = "c = m^e \\pmod n \\quad ; \\quad m = c^d \\pmod n",
                description = "m adalah pesan asli, c adalah teks sandi (ciphertext), e kunci publik, d kunci privat (e·d ≡ 1 mod phi(n)).",
                variableMeanings = mapOf(
                    "n = p \\cdot q" to "Modulus RSA hasil kali dua bilangan prima raksasa",
                    "e" to "Eksponen enkripsi kunci publik",
                    "d" to "Eksponen dekripsi kunci privat rahasia"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengamanan Transaksi Pembayaran QRIS Bank Indonesia Menggunakan Sertifikat Kriptografi RSA",
            industry = "Keamanan Siber Finansial & Perbankan Digital Nasional",
            context = "Sistem pembayaran digital QRIS (Quick Response Code Indonesian Standard) Bank Indonesia memproses puluhan juta transaksi pembayaran nontunai setiap hari bernilai ratusan triliun rupiah.",
            problem = "Bagaimana memastikan bahwa kode QR pedagang dan instruksi transfer saldo nasabah tidak dapat dipalsukan atau diubah di tengah jalan oleh peretas (man-in-the-middle attack)?",
            solution = "Bank Indonesia dan Penyedia Jasa Pembayaran (PJP) menerapkan Tanda Tangan Digital (Digital Signature) berbasis algoritma RSA 2048-bit dengan fungsi hash SHA-256. Setiap pesan transaksi di-hash dan dienkripsi menggunakan kunci privat perbankan: S = Hash(Transaksi)^d mod n. Setiap terminal smartphone nasabah memverifikasi keaslian tanda tangan digital ini menggunakan kunci publik resmi Bank Indonesia: Hash_terverifikasi = S^e mod n. Karena memfaktorkan modulus n 2048-bit membutuhkan komputasi lebih dari umur alam semesta, integritas dan keaslian transaksi QRIS terlindungi secara mutlak.",
            lessonsLearned = "Teori bilangan modular murni karya Euclid dan Fermat adalah pilar pertahanan terkuat yang mengamankan seluruh kedaulatan sistem keuangan digital nasional."
        ),
        homeLab = HomeLabData(
            title = "Enkripsi dan Dekripsi Pesan Rahasia Sandi Caesar Modulo 26",
            objective = "Mempraktikkan secara langsung aritmetika modulo 26 untuk enkripsi dan dekripsi pesan teks.",
            materialsNeeded = listOf(
                "Kertas dan pensil",
                "Tabel konversi huruf ke angka (A=0, B=1, C=2, ..., Z=25)"
            ),
            steps = listOf(
                "Buat kunci pergeseran rahasia: k = 7.",
                "Pilih pesan rahasia: 'SEMESTA'.",
                "Ubah huruf ke angka: S=18, E=4, M=12, E=4, S=18, T=19, A=0.",
                "Terapkan Enkripsi Modulo: C = (P + k) mod 26: S: (18+7) mod 26 = 25 (Z); E: (4+7) mod 26 = 11 (L); M: (12+7) mod 26 = 19 (T); E: (4+7) mod 26 = 11 (L); S: (18+7) mod 26 = 25 (Z); T: (19+7) mod 26 = 26 mod 26 = 0 (A); A: (0+7) mod 26 = 7 (H).",
                "Pesan tersandi (Ciphertext): 'ZLT LZAH'.",
                "Lakukan Dekripsi: P = (C - k) mod 26 (atau C + 19 mod 26): Ubah kembali angka tersandi dan buktikan pesan kembali menjadi 'SEMESTA' sempurna!"
            ),
            safetyNotes = listOf(
                "Aktivitas kriptografi klasik yang mendidik dan mengasah ketelitian logika."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-bilangan-mod-1",
                prompt = "Berdasarkan Teorema Kecil Fermat, berapakah sisa pembagian dari 3¹⁶ dibagi oleh bilangan prima 17 (yaitu nilai dari 3¹⁶ mod 17)?",
                type = "numeric",
                correctAnswer = "1",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "Bilangan 17 adalah bilangan prima (p = 17).",
                    "FPB(3, 17) = 1 (saling prima).",
                    "Teorema Kecil Fermat menyatakan a^(p-1) ≡ 1 (mod p).",
                    "Di sini a = 3 dan p - 1 = 17 - 1 = 16."
                ),
                explanation = "Berdasarkan Teorema Kecil Fermat: jika p adalah bilangan prima dan FPB(a, p) = 1, maka a^(p-1) ≡ 1 (mod p). Karena p = 17 adalah bilangan prima dan a = 3 saling prima dengan 17, maka 3^(17-1) = 3¹⁶ ≡ 1 (mod 17). Sisa pembagiannya adalah tepat 1.",
                misconception = "Mencoba menghitung 3¹⁶ secara manual (43.046.721) lalu membaginya dengan 17 (padahal Teorema Fermat menjawab seketika bernilai 1)."
            ),
            QuizQuestion(
                id = "q-bilangan-mod-2",
                prompt = "Berapakah invers perkalian modulo dari angka 3 terhadap modulus 7 (yaitu mencari nilai x sedemikian hingga 3x ≡ 1 mod 7)?",
                type = "numeric",
                correctAnswer = "5",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "Uji nilai x bulat dari 1 sampai 6:",
                    "3 · 1 = 3 (mod 7).",
                    "3 · 2 = 6 (mod 7).",
                    "3 · 3 = 9 ≡ 2 (mod 7).",
                    "3 · 4 = 12 ≡ 5 (mod 7).",
                    "3 · 5 = 15 = 2 · 7 + 1 ≡ ... (mod 7)?"
                ),
                explanation = "Kita mencari x sedemikian hingga 3x ≡ 1 (mod 7). Menguji nilai: 3 · 5 = 15. Karena 15 dibagi 7 menghasilkan 2 dengan sisa 1 (15 = 2 · 7 + 1), maka 3 · 5 ≡ 1 (mod 7). Jadi invers perkalian modulo dari 3 modulo 7 adalah 5.",
                misconception = "Mengira invers modulo adalah pecahan 1/3 (dalam aritmetika modulo, invers selalu merupakan bilangan bulat bulat positif)."
            )
        )
    )
}

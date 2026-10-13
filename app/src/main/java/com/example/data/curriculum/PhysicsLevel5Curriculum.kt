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

object PhysicsLevel5Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "fis-mekanika-lagrange-hamilton",
            domain = Domain.FISIKA,
            topic = "Mekanika Klasik Teoretis",
            title = "Mekanika Analitis: Formulasi Lagrange & Hamilton",
            description = "Prinsip aksi terkecil Hamilton, koordinat tergeneralisasi, persamaan gerak Euler-Lagrange, Teorema Noether simetri-kekekalan, dan mekanika kanonik Hamilton.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("fis-kerja-energi-potensial", "mat-kalkulus-multivariabel")
        ),
        ConceptItem(
            id = "fis-elektrodinamika-maxwell-larmor",
            domain = Domain.FISIKA,
            topic = "Elektrodinamika Lanjut",
            title = "Elektrodinamika Klasik: Potensial Tera, Pandu Gelombang & Radiasi Larmor",
            description = "Potensial skalar dan vektor, invariansi tera Coulomb dan Lorenz, penjalaran gelombang dalam pandu gelombang (waveguides), dan radiasi muatan terakselerasi Larmor.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("fis-medan-elektromagnetik-maxwell-dasar", "mat-kalkulus-vektor")
        ),
        ConceptItem(
            id = "fis-mekanika-kuantum-schrodinger-spin",
            domain = Domain.FISIKA,
            topic = "Mekanika Kuantum Teoretis",
            title = "Mekanika Kuantum Formal: Ruang Hilbert & Matriks Spin Pauli",
            description = "Formalisme ruang Hilbert, notasi Bra-Ket Dirac, operator Hermite, komutator posisi-momentum, osilator harmonik kuantum operator tangga, dan aljabar spin Pauli.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("fis-pengantar-kuantum-schrodinger", "mat-ruang-vektor-basis", "mat-nilai-eigen-vektor")
        ),
        ConceptItem(
            id = "fis-fisika-statistik-ensemble",
            domain = Domain.FISIKA,
            topic = "Fisika Termal & Statistik",
            title = "Fisika Statistik: Ensemble Gibbs, Statistik Fermi-Dirac & Bose-Einstein",
            description = "Ruang fase klasik dan Teorema Liouville, ensemble mikrokanonik, kanonik, dan agung, fungsi partisi Z, statistik kuantum gas elektron Fermi-Dirac dan foton Bose-Einstein.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("fis-termodinamika-statistik-dasar", "kim-termodinamika-kimia-dasar")
        ),
        ConceptItem(
            id = "fis-metode-matematika-fisika",
            domain = Domain.FISIKA,
            topic = "Matematika Fisika Lanjut",
            title = "Metode Matematika Fisika: Teori Sturm-Liouville & Fungsi Khusus",
            description = "Teori Sturm-Liouville operator diferensial, ortogonalitas fungsi khusus (Bessel, Legendre, Hermite), solusi PDE koordinat bola dan silinder, serta integrasi kontur Green.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("mat-kalkulus-multivariabel")
        ),
        ConceptItem(
            id = "fis-fisika-komputasi-monte-carlo",
            domain = Domain.FISIKA,
            topic = "Fisika Komputasi",
            title = "Fisika Komputasi: Integrator Dinamika Molekul & Monte Carlo Ising",
            description = "Metode komputasi numerik fisika, integrator Verlet/Leapfrog dinamika molekuler, algoritma Monte Carlo Metropolis model spin Ising, dan solusi diferensial hingga Schrödinger.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("fis-mekanika-vektor", "mat-aljabar-linear-spl")
        ),
        ConceptItem(
            id = "fis-optik-lanjut-laser-nonlinear",
            domain = Domain.FISIKA,
            topic = "Fotonika & Optik Modern",
            title = "Optik Lanjut: Resonator Laser, Berkas Gaussian & Optik Non-Linear SHG",
            description = "Rongga resonator optik Fabry-Perot, propagasi berkas Gaussian berkonsentrasi paraksial, sifat optik kristal anisotropik bias ganda, dan fenomena pembangkitan harmonik kedua (SHG).",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("fis-optik-fisis-interferometer", "fis-gelombang-em-poynting")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "fis-mekanika-lagrange-hamilton" -> getMekanikaLagrangeHamiltonLesson()
            "fis-elektrodinamika-maxwell-larmor" -> getElektrodinamikaMaxwellLarmorLesson()
            "fis-mekanika-kuantum-schrodinger-spin" -> getMekanikaKuantumSchrodingerSpinLesson()
            "fis-fisika-statistik-ensemble" -> getFisikaStatistikEnsembleLesson()
            "fis-metode-matematika-fisika" -> getMetodeMatematikaFisikaLesson()
            "fis-fisika-komputasi-monte-carlo" -> getFisikaKomputasiMonteCarloLesson()
            "fis-optik-lanjut-laser-nonlinear" -> getOptikLanjutLaserNonlinearLesson()
            else -> null
        }
    }

    private fun getMekanikaLagrangeHamiltonLesson(): LessonData = LessonData(
        conceptId = "fis-mekanika-lagrange-hamilton",
        storyPanels = listOf(
            StoryPanel(
                id = "p-lagrange-1",
                panelNumber = 1,
                title = "Kekacauan Gaya Kontak & Kendala Fisik",
                caption = "Dimas mencoba menurunkan persamaan gerak bandul ganda dan manik-manik yang meluncur di kawat spiral. Diagram benda bebas Newton dipenuhi gaya normal dan gaya tegangan tali tak dikenal yang sangat rumit.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Gaya-gaya kontak kendala ini selalu berubah arah di setiap detik. Bisakah kita menurunkan dinamika gerak tanpa harus menghitung gaya kendala yang memusingkan ini?"
            ),
            StoryPanel(
                id = "p-lagrange-2",
                panelNumber = 2,
                title = "Prinsip Aksi Terkecil & Lagrangian L = T - V",
                caption = "Kakek memperkenalkan Prinsip Hamilton: Alam semesta selalu memilih lintasan di mana integral aksi S stasioner (delta S = 0).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Joseph-Louis Lagrange mengubah fisika dari gaya vektor menjadi energi skalar, Dimas! Lagrangian L = T - V hanya membutuhkan energi kinetik dan potensial dalam koordinat bebas apa saja. Persamaan Euler-Lagrange melenyapkan seluruh gaya kendala secara otomatis!"
            ),
            StoryPanel(
                id = "p-lagrange-3",
                panelNumber = 3,
                title = "Teorema Noether & Formulasi Hamilton",
                caption = "Kirana menghubungkan simetri alam semesta dengan hukum kekekalan absolut.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Emmy Noether membuktikan: setiap simetri kontinu Lagrangian menghasilkan hukum kekekalan! Simetri translasi waktu menghasilkan kekekalan Energi, simetri translasi spasial menghasilkan kekekalan Momentum! Dan William Rowan Hamilton mengubahnya menjadi persamaan fase kanonik yang kelak melahirkan mekanika kuantum!"
            )
        ),
        intuition = "Hukum Newton bertumpu pada besaran vektor gaya F = ma yang bergantung pada kerangka koordinat inersia dan memerlukan perhitungan eksplisit gaya-gaya kendala (constraint forces). Formulasi Lagrange dan Hamilton merevolusi mekanika dengan menggunakan besaran skalar energi dalam sembarang koordinat tergeneralisasi (q_i, \\dot{q}_i). Berdasarkan Prinsip Aksi Terkecil Hamilton, lintasan gerak nyata partikel adalah lintasan yang membuat variasi integral aksi S = int L dt bernilai stasioner (delta S = 0), menghasilkan persamaan diferensial Euler-Lagrange. Teorema Noether menegaskan bahwa hukum-hukum kekekalan fundamental fisika (energi, momentum linear, momentum sudut) bukan kebetulan empiris, melainkan konsekuensi matematis niscaya dari simetri ruang dan waktu.",
        intuitionPoints = listOf(
            "Lagrangian didefinisikan sebagai selisih energi kinetik dan potensial: L = T - V.",
            "Persamaan Euler-Lagrange: d/dt (dL/d\\dot{q}_i) - dL/dq_i = 0 untuk setiap koordinat tergeneralisasi q_i.",
            "Momentum konjugat kanonik p_i = dL/d\\dot{q}_i. Jika L tidak bergantung eksplisit pada koordinat q_i (koordinat siklik), maka p_i kekal konstan.",
            "Hamiltonian H(q, p, t) = sum(p_i \\dot{q}_i) - L menyatakan total energi sistem. Persamaan kanonik Hamilton: \\dot{q}_i = dH/dp_i dan \\dot{p}_i = -dH/dq_i.",
            "Teorema Noether: Simetri translasi waktu -> Kekekalan Energi; Simetri translasi ruang -> Kekekalan Momentum Linear; Simetri rotasi -> Kekekalan Momentum Sudut."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Persamaan Gerak Euler-Lagrange",
                latexFormula = "\\frac{d}{dt}\\left(\\frac{\\partial L}{\\partial \\dot{q}_i}\\right) - \\frac{\\partial L}{\\partial q_i} = 0",
                description = "Persamaan diferensial gerak untuk setiap derajat kebebasan koordinat tergeneralisasi q_i.",
                variableMeanings = mapOf(
                    "L = T - V" to "Fungsi Lagrangian (Energi Kinetik T dikurangi Energi Potensial V)",
                    "q_i" to "Koordinat tergeneralisasi (panjang, sudut, dll.)",
                    "\\dot{q}_i" to "Kecepatan tergeneralisasi (dq_i/dt)"
                )
            ),
            FormulaCard(
                title = "Persamaan Kanonik Hamilton",
                latexFormula = "\\dot{q}_i = \\frac{\\partial H}{\\partial p_i} \\quad ; \\quad \\dot{p}_i = -\\frac{\\partial H}{\\partial q_i}",
                description = "Sistem persamaan diferensial orde 1 simetris dalam ruang fase koordinat dan momentum kanonik.",
                variableMeanings = mapOf(
                    "H" to "Fungsi Hamiltonian (energi total sistem T + V)",
                    "p_i" to "Momentum tergeneralisasi kanonik konjugat terhadap q_i"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kontrol Dinamika Sikap Satelit Mikro LAPAN-A3/IPB di Pusat Riset Antariksa BRIN",
            industry = "Teknologi Kedirgantaraan & Dinamika Satelit Orbit Rendah",
            context = "Satelit mikro LAPAN-A3 mengorbit bumi pada ketinggian 500 km dengan misi pemotretan pertanian multispektral yang membutuhkan kestabilan orientasi kamera presisi tinggi.",
            problem = "Gerak rotasi 3D satelit di luar angkasa mengalami torsi gravitasi gradien dan gaya hambat atmosfer sisa. Memodelkan dinamika rotasi menggunakan sudut Euler dan hukum Newton menghasilkan singularitas matematis (gimbal lock) dan persamaan torsi yang sangat rumit.",
            solution = "Insinyur dinamika satelit BRIN memodelkan orientasi satelit menggunakan koordinat kuaternion tergeneralisasi q dalam formulasi mekanika analitis Lagrange: L = 1/2 omega^T I omega - V_gravitasi. Persamaan Euler-Lagrange secara langsung menghasilkan persamaan gerak rotasi Euler tegar tanpa harus menyelesaikan gaya reaksi internal reaction wheels. Kontroler proporsional-turunan (PD) berbasis Hamiltonian diimplementasikan pada komputer on-board untuk mengatur motor reaction wheel tiga sumbu, menjaga orientasi pemotretan stabil dengan akurasi 0.05 derajat.",
            lessonsLearned = "Formulasi analitis Lagrange dan Hamilton merupakan bahasa matematika universal yang digunakan oleh seluruh perancang wahana antariksa dan robotika modern."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Gerak Chaos Non-Linear Pendulum Ganda",
            objective = "Melihat secara langsung fenomena sensitivitas ekstrem sistem mekanika multi-koordinat yang hanya dapat dimodelkan secara elegan melalui persamaan Euler-Lagrange.",
            materialsNeeded = listOf(
                "2 buah penggaris plastik 30 cm",
                "2 buah baut kecil ber-mur dan ring washer (sebagai poros engsel tanpa gesekan)",
                "Papan kayu atau tepi meja untuk menjepit poros atas",
                "Kamera smartphone perekam gerakan lambat (slow-motion)"
            ),
            steps = listOf(
                "Lubangi ujung penggaris 1 dan ujung penggaris 2.",
                "Pasang poros baut pertama di tepi meja menjepit ujung atas penggaris 1 (dapat berayun bebas).",
                "Pasang baut kedua menghubungkan ujung bawah penggaris 1 dengan ujung atas penggaris 2 (membentuk pendulum ganda bertingkat dua derajat kebebasan theta_1 dan theta_2).",
                "Simpangkan pendulum kedua pada sudut kecil (misal theta_1 = 10°, theta_2 = 10°) lalu lepaskan: amati osilasi harmonik teratur yang tenang.",
                "Sekarang lepaskan dari sudut besar (misal theta_1 = 90°, theta_2 = 90°): rekam dengan slow motion smartphone!",
                "Amati gerakan yang terjadi: ayunan mendadak berputar balik tak terduga, meliuk-liuk liar secara chaos deterministik! Gerakan ini adalah solusi non-linear dari dua persamaan Euler-Lagrange berpasangan yang terkenal mustahil diselesaikan secara analitis tertutup."
            ),
            safetyNotes = listOf(
                "Pastikan baut terpasang pas sehingga penggaris tidak lepas dan terpental saat berayun kencang.",
                "Jauhkan wajah dari radius putaran pendulum ganda."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-lagrange-1",
                prompt = "Sebuah partikel bermassa m bergerak bebas dalam bidang 2D di bawah pengaruh medan potensial sentral V(r) yang hanya bergantung pada jarak radial r (tidak bergantung sudut theta). Koordinat tergeneralisasi manakah yang merupakan KOORDINAT SIKLIK (tidak muncul dalam Lagrangian L) dan besaran fisika apa yang kekal?",
                type = "multiple_choice",
                options = listOf(
                    "Koordinat sudut theta adalah koordinat siklik, sehingga momentum sudut p_theta = m r² dtheta/dt kekal konstan",
                    "Koordinat radial r adalah koordinat siklik, sehingga momentum linear radial kekal",
                    "Waktu t adalah koordinat siklik, sehingga kecepatan partikel kekal nol",
                    "Tidak ada koordinat siklik dalam sistem gaya sentral"
                ),
                correctAnswer = "Koordinat sudut theta adalah koordinat siklik, sehingga momentum sudut p_theta = m r² dtheta/dt kekal konstan",
                hints = listOf(
                    "T = 1/2 m (dr/dt)² + 1/2 m r² (dtheta/dt)².",
                    "L = T - V(r). Perhatikan apakah ada variabel sudut theta (tanpa titik) di dalam rumus L?",
                    "Jika dL/dtheta = 0, maka d/dt(dL/d\\dot{theta}) = 0."
                ),
                explanation = "Lagrangian dalam koordinat polar adalah L = 1/2 m (\\dot{r}² + r² \\dot{theta}²) - V(r). Terlihat bahwa variabel posisi sudut theta tidak muncul secara eksplisit dalam L (dL/dtheta = 0), sehingga theta adalah koordinat siklik. Berdasarkan persamaan Euler-Lagrange, d/dt (dL/d\\dot{theta}) = 0, yang berarti momentum konjugat p_theta = dL/d\\dot{theta} = m r² \\dot{theta} (momentum sudut) bernilai kekal konstan sepanjang waktu.",
                misconception = "Mengira koordinat r yang siklik padahal fungsi potensial V(r) bergantung langsung pada r."
            ),
            QuizQuestion(
                id = "q-lagrange-2",
                prompt = "Berdasarkan Teorema Noether, hukum kekekalan fisika fundamental apakah yang merupakan konsekuensi langsung dari invariansi Lagrangian terhadap TRANSLASI WAKTU (artinya Lagrangian L tidak bergantung secara eksplisit pada waktu t: dL/dt = 0)?",
                type = "multiple_choice",
                options = listOf(
                    "Hukum Kekekalan Energi Total",
                    "Hukum Kekekalan Momentum Linear",
                    "Hukum Kekekalan Momentum Sudut",
                    "Hukum Kekekalan Muatan Listrik"
                ),
                correctAnswer = "Hukum Kekekalan Energi Total",
                hints = listOf(
                    "Jika sistem fisika berperilaku sama hari ini, besok, dan kemarin (simetri waktu).",
                    "Generator translasi waktu dalam mekanika kuantum maupun klasik berkaitan dengan energi."
                ),
                explanation = "Teorema Noether menetapkan hubungan satu-satu antara simetri kontinu dan hukum kekekalan. Invariansi Lagrangian terhadap translasi waktu (artinya hukum fisika tidak berubah seiring waktu) menghasilkan kekekalan fungsi Hamiltonian H, yang merepresentasikan Energi Total sistem. Simetri translasi ruang menghasilkan kekekalan momentum linear, dan simetri rotasi ruang menghasilkan kekekalan momentum sudut.",
                misconception = "Mengira hukum kekekalan energi adalah aksioma empiris terpisah tanpa kaitan dengan simetri ruang-waktu."
            )
        )
    )

    private fun getElektrodinamikaMaxwellLarmorLesson(): LessonData = LessonData(
        conceptId = "fis-elektrodinamika-maxwell-larmor",
        storyPanels = listOf(
            StoryPanel(
                id = "p-elmag-lanjut-1",
                panelNumber = 1,
                title = "Di Balik Tabir Medan E dan B",
                caption = "Dimas menghitung gelombang elektromagnetik yang terpancar dari antena pemancar radio dan menyadari bahwa memecahkan medan vektor E dan B secara simultan menghasilkan persamaan diferensial vektor orde dua berpasangan yang sangat rumit.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Medan E dan B saling terkait erat lewat curl Maxwell. Bisakah kita menggabungkan keempat persamaan medan ini ke dalam satu potensial yang lebih mendasar?"
            ),
            StoryPanel(
                id = "p-elmag-lanjut-2",
                panelNumber = 2,
                title = "Potensial Tera Lorenz & Coulomb",
                caption = "Kakek mendefinisikan potensial skalar Phi dan potensial vektor A sedemikian hingga B = curl A dan E = -grad Phi - dA/dt.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Potensial memiliki kebebasan tera (gauge freedom), Dimas! Dengan memilih Tera Lorenz (div A + (1/c²) dPhi/dt = 0), persamaan Maxwell yang rumit terurai sempurna menjadi dua persamaan gelombang d'Alembert yang independen dan simetris secara relativistik!"
            ),
            StoryPanel(
                id = "p-elmag-lanjut-3",
                panelNumber = 3,
                title = "Radiasi Muatan & Rumus Larmor",
                caption = "Kirana memperlihatkan bagaimana muatan titik yang dipercepat memancarkan energi gelombang foton ke ruang hampa.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Muatan yang diam atau bergerak lurus berkecepatan konstan TIDAK PERNAH memancarkan radiasi! Namun begitu muatan mengalami percepatan a, medan listriknya 'tertekuk' dan melepaskan riak gelombang transversal dengan daya radiasi Larmor P = q² a² / (6 pi epsilon_0 c³)!"
            )
        ),
        intuition = "Persamaan Maxwell klasik dapat disederhanakan secara dramatis dengan menyatakan medan fisis E dan B dalam bentuk potensial skalar Phi dan potensial vektor A. Karena medan fisis tidak berubah di bawah transformasi tera A' = A + grad(Lambda) dan Phi' = Phi - dLambda/dt (Invariansi Tera), kita dapat memilih kondisi tera yang paling menyederhanakan perhitungan (seperti Tera Coulomb div A = 0 untuk elektrostatika, atau Tera Lorenz untuk elektrodinamika gelombang kovarian). Ketika muatan titik mengalami percepatan a, medan Coulomb statis tidak dapat menyesuaikan diri secara instan (terkendala batas kecepatan cahaya c), menciptakan gelombang radiasi transversal yang merambat menjauh dengan daya radiasi yang dirumuskan oleh Joseph Larmor.",
        intuitionPoints = listOf(
            "Hubungan medan dan potensial: B = rot(A) dan E = -grad(Phi) - dA/dt.",
            "Kondisi Tera Lorenz: div(A) + (1/c²) dPhi/dt = 0. Menghasilkan persamaan gelombang terpisah: Box(Phi) = -rho/epsilon_0 dan Box(A) = -mu_0 J.",
            "Gelombang dalam Pandu Gelombang (Waveguide): gelombang elektromagnetik yang terkurung di dalam pipa logam hanya dapat merambat jika frekuensinya di atas frekuensi cutoff f_c. Modus perambatan terbagi menjadi Transverse Electric (TE, E_z = 0) dan Transverse Magnetic (TM, B_z = 0).",
            "Rumus Daya Radiasi Larmor: P = q² a² / (6 pi epsilon_0 c³). Muatan memancarkan energi elektromagnetik HANYA saat mengalami percepatan (a ≠ 0)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Rumus Daya Radiasi Larmor",
                latexFormula = "P = \\frac{q^2 a^2}{6 \\pi \\epsilon_0 c^3}",
                description = "Total daya energi elektromagnetik yang dipancarkan ke segala arah oleh partikel bermuatan q yang mengalami percepatan a (non-relativistik).",
                variableMeanings = mapOf(
                    "P" to "Daya radiasi yang dipancarkan (Watt)",
                    "q" to "Muatan listrik partikel (Coulomb)",
                    "a" to "Percepatan partikel (m/s²)",
                    "c" to "Kecepatan cahaya (3 x 10⁸ m/s)",
                    "\\epsilon_0" to "Permitivitas ruang hampa"
                )
            ),
            FormulaCard(
                title = "Frekuensi Cutoff Pandu Gelombang Persegi (Modus TE_10)",
                latexFormula = "f_{c, 10} = \\frac{c}{2 a}",
                description = "Frekuensi minimum gelombang elektromagnetik yang diizinkan merambat di dalam pandu gelombang berdimensi lebar penampang a.",
                variableMeanings = mapOf(
                    "f_{c, 10}" to "Frekuensi cutoff modus dominan TE10 (Hz)",
                    "a" to "Lebar penampang bagian dalam pipa pandu gelombang (meter)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Desain Pandu Gelombang Radar Navigasi Maritim Selat Malaka oleh Balai Riset Navigasi",
            industry = "Teknologi Radar Maritim & Pertahanan Wilayah Laut",
            context = "Stasiun radar pantai di Batam memantau ribuan kapal tanker yang melintasi Selat Malaka menggunakan pemancar radar gelombang mikro X-Band pada frekuensi 9.4 GHz berdaya puncak 25 kW.",
            problem = "Kabel koaksial tembaga biasa mengalami atenuasi dielektrik sangat tinggi pada frekuensi 9.4 GHz (kehilangan 70% daya radar sebelum mencapai antena berputar di puncak menara).",
            solution = "Insinyur radar mengganti kabel koaksial dengan Pandu Gelombang Persegi (Rectangular Waveguide WR-90) berbahan tembaga berlapis perak berukuran dalam a = 22.86 mm dan b = 10.16 mm. Berdasarkan rumus cutoff elektrodinamika, frekuensi cutoff modus dominan TE10 adalah f_c = c / (2a) = (3x10⁸) / (2 x 0.02286) = 6.56 GHz. Karena frekuensi sinyal radar (9.4 GHz) jauh berada di atas cutoff (9.4 GHz > 6.56 GHz), gelombang mikro merambat tanpa dielektrik di rongga udara hampa dengan rugi-rugi redaman mendekati nol (kurang dari 0.1 dB/meter), mentransmisikan 98% daya elektromagnetik secara utuh ke antena pemancar.",
            lessonsLearned = "Teori elektrodinamika medan Maxwell dan pandu gelombang merupakan pondasi perangkat keras telekomunikasi gelombang mikro, radar pertahanan, dan akselerator partikel medis."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Sangkar Faraday & Redaman Sinyal Gelombang Mikro Smartphone",
            objective = "Membuktikan secara fisik sifat batas medan elektromagnetik pada konduktor dan prinsip pandu gelombang di bawah cutoff.",
            materialsNeeded = listOf(
                "2 unit smartphone aktif",
                "1 buah kaleng biskuit logam tertutup rapat (tanpa lubang)",
                "Lembaran kertas aluminium foil dapur"
            ),
            steps = listOf(
                "Nyalakan smartphone 1 (pastikan sinyal seluler dan WiFi menyala penuh). Lakukan panggilan telepon dari smartphone 2: panggilan masuk dengan lancar.",
                "Masukkan smartphone 1 ke dalam kaleng biskuit logam, lalu tutup rapat kaleng dengan penutup logamnya.",
                "Lakukan panggilan telepon kembali dari smartphone 2 ke smartphone 1.",
                "Dengarkan operator: panggilan langsung gagal dan dialihkan ke kotak suara ('Nomor yang Anda tuju sedang tidak aktif / berada di luar jangkauan')!",
                "Penjelasan: Dinding logam kaleng bertindak sebagai Sangkar Faraday. Muatan bebas di permukaan logam mengatur ulang posisinya seketika untuk meniadakan medan elektromagnetik di dalam rongga. Celah kecil pada bibir kaleng bertindak sebagai pandu gelombang dengan frekuensi cutoff yang jauh lebih tinggi daripada frekuensi sinyal seluler (900 MHz - 2.4 GHz), sehingga gelombang teredam eksponensial dan sinyal padam total!"
            ),
            safetyNotes = listOf(
                "Eksperimen aman dan tidak merusak perangkat smartphone."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-elmag-lanjut-1",
                prompt = "Berdasarkan rumus radiasi Larmor P = q² a² / (6 pi epsilon_0 c³), apa yang terjadi dengan daya radiasi gelombang elektromagnetik jika percepatan partikel bermuatan (a) dilipatgandakan menjadi 3 kali semula?",
                type = "numeric",
                correctAnswer = "9",
                tolerance = 0.1f,
                unit = "kali lipat",
                hints = listOf(
                    "Perhatikan hubungan antara P dan a pada rumus Larmor.",
                    "P sebanding dengan kuadrat percepatan: P ∝ a².",
                    "Jika a menjadi 3a, maka P baru ∝ (3a)² = ...?"
                ),
                explanation = "Daya radiasi Larmor sebanding secara kuadratik dengan percepatan partikel bermuatan (P ∝ a²). Jika percepatan dilipatgandakan menjadi 3 kali semula (a' = 3a), maka daya radiasi yang dipancarkan meningkat sebesar 3² = 9 kali lipat dari daya radiasi awal.",
                misconception = "Mengira daya berbanding lurus linear dengan percepatan sehingga menjawab 3 kali lipat."
            ),
            QuizQuestion(
                id = "q-elmag-lanjut-2",
                prompt = "Sebuah partikel elektron bergerak dalam ruang hampa dengan kecepatan konstan mendekati kecepatan cahaya (v = 0.9 c) pada lintasan lurus tanpa gaya luar. Berapakah daya radiasi gelombang elektromagnetik yang dipancarkannya?",
                type = "numeric",
                correctAnswer = "0",
                tolerance = 0.01f,
                unit = "Watt",
                hints = listOf(
                    "Partikel bergerak dengan kecepatan konstan pada lintasan lurus.",
                    "Berapakah percepatan partikel jika kecepatannya konstan?",
                    "a = dv/dt = 0. Substitusikan a = 0 ke rumus Larmor P = q² a² / (6 pi epsilon_0 c³)."
                ),
                explanation = "Karena partikel bergerak dengan kecepatan konstan dalam lintasan lurus, percepatannya bernilai nol (a = 0). Berdasarkan elektrodinamika klasik dan rumus Larmor, muatan yang tidak mengalami percepatan (a = 0) sama sekali tidak memancarkan radiasi elektromagnetik (P = 0 Watt), terlepas dari seberapa besar kecepatannya.",
                misconception = "Mengira partikel berkecepatan tinggi mendekati kecepatan cahaya selalu memancarkan radiasi meskipun tidak mengalami percepatan."
            )
        )
    )

    private fun getMekanikaKuantumSchrodingerSpinLesson(): LessonData = LessonData(
        conceptId = "fis-mekanika-kuantum-schrodinger-spin",
        storyPanels = listOf(
            StoryPanel(
                id = "p-kuantum-formal-1",
                panelNumber = 1,
                title = "Bahasa Notasi Bra-Ket Paul Dirac",
                caption = "Dimas bingung membaca artikel komputasi kuantum yang menuliskan keadaan partikel sebagai |psi> dan operasi pengukuran sebagai <phi|A|psi>.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Apa makna tanda kurung runcing |ket> dan <bra| ini? Bukankah keadaan partikel kuantum adalah fungsi gelombang psi(x)?"
            ),
            StoryPanel(
                id = "p-kuantum-formal-2",
                panelNumber = 2,
                title = "Vektor Keadaan dalam Ruang Hilbert",
                caption = "Kakek menjelaskan formalisme ruang vektor abstrak Hilbert karya Paul Dirac dan John von Neumann.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Fungsi gelombang psi(x) hanyalah salah satu representasi koordinat posisi dari vektor keadaan murni |psi> di Ruang Hilbert, Dimas! Ket |psi> adalah vektor kolom, Bra <psi| adalah konjugat transpose, dan besaran fisis teramati adalah Operator Hermite yang selalu menjamin nilai eigen riil!"
            ),
            StoryPanel(
                id = "p-kuantum-formal-3",
                panelNumber = 3,
                title = "Aljabar Spin Pauli & Matriks Dua Tingkat",
                caption = "Kirana memaparkan eksperimen Stern-Gerlach yang mengungkap momentum sudut intrinsik spin 1/2.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Elektron memiliki derajat kebebasan dua dimensi intrinsik: spin Up |↑> dan Down |↓> yang diatur oleh tiga matriks spin Pauli sigma_x, sigma_y, sigma_z. Matriks Pauli ini adalah dasar matematika qubit komputer kuantum!"
            )
        ),
        intuition = "Mekanika kuantum modern dirumuskan secara elegan dalam formalisme Ruang Hilbert kompleks berdimensi tak terhingga. Keadaan fisik suatu sistem dinyatakan oleh vektor keadaan ternormalisasi |psi>. Besaran fisik yang dapat diukur (observabel, seperti energi, posisi, momentum) direpresentasikan oleh Operator Hermite A = A†, yang memastikan seluruh nilai pengukurannya (nilai eigen) selalu berupa bilangan riil. Ketidakpastian Heisenberg timbul dari non-komutatifnya operator: [x, p] = i hbar. Spin adalah momentum sudut intrinsik partikel elementer yang tidak berasal dari perputaran fisik di ruang nyata, direpresentasikan pada elektron oleh matriks Pauli 2x2.",
        intuitionPoints = listOf(
            "Notasi Bra-Ket Dirac: perkalian dalam <phi|psi> menyatakan amplitudo probabilitas tumpang tindih; nilai ekspektasi observabel dinyatakan oleh <psi|A|psi>.",
            "Operator Hermite (Self-Adjoint): A† = A menjamin bahwa seluruh nilai eigen adalah bilangan riil dan vektor-vektor eigen dari nilai eigen berbeda saling ortogonal.",
            "Hubungan Komutasi Kanonik: [x, p_x] = x p_x - p_x x = i hbar I. Jika dua operator tidak komut ([A, B] ≠ 0), kedua besaran tidak dapat diukur secara simultan dengan kepastian mutlak (Prinsip Ketidakpastian Umum Robertson).",
            "Osilator Harmonik Kuantum: dapat diselesaikan secara aljabar murni tanpa kalkulus menggunakan operator tangga (annihilation a dan creation a†), di mana tingkat energi terkuantisasi E_n = (n + 1/2) hbar omega.",
            "Tiga Matriks Spin Pauli: sigma_x = [[0, 1], [1, 0]], sigma_y = [[0, -i], [i, 0]], sigma_z = [[1, 0], [0, -1]]. Memenuhi relasi aljabar Lie [sigma_i, sigma_j] = 2i epsilon_ijk sigma_k."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Persamaan Komutasi Kanonik Heisenberg",
                latexFormula = "[\\hat{x}, \\hat{p}] = \\hat{x}\\hat{p} - \\hat{p}\\hat{x} = i \\hbar \\hat{I}",
                description = "Dasar non-komutatif mekanika kuantum yang melahirkan hubungan ketidakpastian posisi dan momentum.",
                variableMeanings = mapOf(
                    "\\hat{x}" to "Operator posisi",
                    "\\hat{p}" to "Operator momentum linear (-i hbar d/dx)",
                    "\\hbar" to "Konstanta Planck tereduksi (h / 2pi)",
                    "\\hat{I}" to "Operator identitas"
                )
            ),
            FormulaCard(
                title = "Aljabar Operator Tangga Osilator Harmonik Kuantum",
                latexFormula = "\\hat{H} = \\hbar \\omega \\left(\\hat{a}^\\dagger \\hat{a} + \\frac{1}{2}\\right) \\quad ; \\quad E_n = \\left(n + \\frac{1}{2}\\right) \\hbar \\omega",
                description = "Energi terkuantisasi osilator harmonik dengan energi titik nol (zero-point energy) 1/2 hbar omega.",
                variableMeanings = mapOf(
                    "\\hat{a}" to "Operator pemusnah (annihilation operator)",
                    "\\hat{a}^\\dagger" to "Operator pencipta (creation operator)",
                    "n" to "Bilangan bulat non-negatif 0, 1, 2, ..."
                )
            ),
            FormulaCard(
                title = "Tiga Matriks Spin Pauli Elektron",
                latexFormula = "\\sigma_x = \\begin{bmatrix} 0 & 1 \\\\ 1 & 0 \\end{bmatrix}, \\quad \\sigma_y = \\begin{bmatrix} 0 & -i \\\\ i & 0 \\end{bmatrix}, \\quad \\sigma_z = \\begin{bmatrix} 1 & 0 \\\\ 0 & -1 \\end{bmatrix}",
                description = "Operator spin 1/2 tereduksi S = (hbar / 2) sigma yang mengatur dinamika dua tingkat keadaan kuantum (qubit).",
                variableMeanings = mapOf(
                    "\\sigma_x, \\sigma_y, \\sigma_z" to "Matriks spin Pauli 2x2 Hermite dan uniter",
                    "i" to "Unit imajiner sqrt(-1)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sensor Pembaca Magnetoresistansi Raksasa (GMR) Hard Disk di Kawasan Industri Batam",
            industry = "Industri Fabrikasi Semikonduktor & Penyimpanan Data Magnetik",
            context = "Fasilitas perakitan media penyimpanan magnetik di Pulau Batam memproduksi kepala baca hard disk berkapasitas terabita menggunakan sensor Spin Valve Giant Magnetoresistance (GMR).",
            problem = "Bagaimana mendeteksi medan magnetik bocoran yang sangat lemah dari bit data berukuran 10 nanometer pada piringan hard disk yang berputar dengan kecepatan 7200 RPM?",
            solution = "Sensor GMR memanfaatkan sifat spin kuantum elektron. Struktur sensor terdiri dari dua lapisan tipis feromagnetik yang dipisahkan oleh lapisan non-magnetik setebal 1 nanometer. Ketika arah magnetisasi kedua lapisan sejajar, elektron dengan spin Up melewati antarmuka dengan hambatan listrik rendah (scattering minimal). Ketika arah magnetisasi berlawanan, kedua keadaan spin elektron (Up dan Down) mengalami hambatan hamburan spin kuat berdasarkan matriks Pauli, melipatgandakan hambatan listrik sebesar 50%. Perubahan resistansi drastis berbasis orientasi spin kuantum ini mengubah medan magnetik nano menjadi sinyal tegangan listrik yang jernih.",
            lessonsLearned = "Konsep abstrak matriks spin Pauli mekanika kuantum adalah teknologi inti yang melipatgandakan kapasitas penyimpanan data digital dunia hingga jutaan kali lipat."
        ),
        homeLab = HomeLabData(
            title = "Model Polarisasi Tiga Filter Menggunakan Tiga Lembar Kacamata 3D Polarizer",
            objective = "Membuktikan paradoks kuantum pengukuran dan superposisi keadaan menggunakan filter polarisasi cahaya (analog sistem spin Pauli kuantum).",
            materialsNeeded = listOf(
                "3 lembar film polarisator plastik (atau 3 kacamata bioskop 3D / kacamata hitam polarized)",
                "Lampu senter atau layar smartphone putih"
            ),
            steps = listOf(
                "Tumpuk Filter 1 (polarisasi vertikal 0°) dan Filter 2 (polarisasi horizontal 90°): amati bahwa cahaya terblokir total dan menjadi gelap gulita (karena <Vertikal|Horizontal> = 0 ortogonal).",
                "Sekarang siapkan Filter 3 dengan sudut diagonal 45°.",
                "Tantangan Paradoks: Jika Filter 3 disisipkan DI ANTARA Filter 1 dan Filter 2, apakah cahaya tetap gelap atau justru menjadi terang kembali?",
                "Sisipkan Filter 3 (45°) di tengah: Keajaiban terjadi! Cahaya yang tadinya padam total seketika MUNCUL KEMBALI menembus ketiga filter!",
                "Penjelasan Kuantum: Filter 1 memproyeksikan foton ke keadaan |Vertikal>. Filter 3 di tengah mengukur foton pada basis diagonal 45°, memproyeksikan foton ke keadaan superposisi |45°> = (1/sqrt(2))(|V> + |H>) dengan probabilitas 50%. Foton |45°> ini sekarang memiliki komponen horizontal, sehingga saat tiba di Filter 2, ada 50% foton yang lolos! Penambahan filter ketiga di tengah justru merestorasi foton, demonstrasi visual sempurna dari postulat pengukuran kuantum!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan merupakan salah satu eksperimen analog kuantum paling terkenal di dunia."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kuantum-formal-1",
                prompt = "Berapakah energi keadaan dasar (keadaan vakum / ground state n = 0) dari osilator harmonik satu dimensi kuantum dengan frekuensi sudut omega?",
                type = "multiple_choice",
                options = listOf(
                    "E_0 = 1/2 hbar omega",
                    "E_0 = 0 (energi nol)",
                    "E_0 = hbar omega",
                    "E_0 = 3/2 hbar omega"
                ),
                correctAnswer = "E_0 = 1/2 hbar omega",
                hints = listOf(
                    "Gunakan rumus tingkat energi osilator kuantum: E_n = (n + 1/2) hbar omega.",
                    "Masukkan n = 0 untuk keadaan dasar."
                ),
                explanation = "Tingkat energi osilator harmonik kuantum diberikan oleh E_n = (n + 1/2) hbar omega. Untuk n = 0 (keadaan dasar), energi tidak bernilai nol, melainkan E_0 = 1/2 hbar omega. Energi sisa ini disebut Energi Titik Nol (Zero-Point Energy), konsekuensi langsung dari Prinsip Ketidakpastian Heisenberg bahwa partikel kuantum tidak pernah bisa diam mutlak di dasar sumur potensial.",
                misconception = "Mengira keadaan dasar partikel kuantum memiliki energi nol seperti partikel klasik yang berhenti di dasar lembah."
            ),
            QuizQuestion(
                id = "q-kuantum-formal-2",
                prompt = "Diberikan matriks spin Pauli sigma_z = [[1, 0], [0, -1]]. Berapakah dua nilai eigen dari matriks sigma_z tersebut?",
                type = "multiple_choice",
                options = listOf(
                    "+1 dan -1",
                    "0 dan 1",
                    "+i dan -i",
                    "+1/2 dan -1/2"
                ),
                correctAnswer = "+1 dan -1",
                hints = listOf(
                    "sigma_z adalah matriks diagonal dengan entri 1 dan -1.",
                    "Nilai eigen matriks diagonal adalah entri diagonalnya sendiri."
                ),
                explanation = "Karena matriks sigma_z = [[1, 0], [0, -1]] sudah dalam bentuk diagonal, nilai-nilai eigennya adalah entri diagonal utamanya, yaitu lambda_1 = +1 (berkorespondensi dengan keadaan spin Up |↑> = [1, 0]^T) dan lambda_2 = -1 (berkorespondensi dengan keadaan spin Down |↓> = [0, 1]^T).",
                misconception = "Menjawab +1/2 dan -1/2 (itu adalah nilai eigen dari operator momentum sudut spin S_z = (hbar/2) sigma_z, sedangkan matriks Pauli sigma_z murni memiliki nilai eigen +1 dan -1)."
            )
        )
    )

    private fun getFisikaStatistikEnsembleLesson(): LessonData = LessonData(
        conceptId = "fis-fisika-statistik-ensemble",
        storyPanels = listOf(
            StoryPanel(
                id = "p-stat-ens-1",
                panelNumber = 1,
                title = "Jembatan dari Atom ke Termodinamika",
                caption = "Dimas menghitung bahwa satu mol gas berisi 6 x 10²³ molekul yang bergerak acak. Menuliskan hukum Newton untuk setiap partikel mustahil dilakukan oleh komputer tercanggih sekalipun.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana mungkin kita menghubungkan dinamika triliunan atom mikroskopis yang bergerak serampangan menjadi besaran makroskopis yang tenang seperti suhu dan tekanan?"
            ),
            StoryPanel(
                id = "p-stat-ens-2",
                panelNumber = 2,
                title = "Konsep Ensemble & Fungsi Partisi Z",
                caption = "Kakek menjelaskan konsep Ensemble Gibbs: kumpulan imajiner dari sejumlah raksasa sistem mikroskopis identik.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ludwig Boltzmann dan Josiah Willard Gibbs menciptakan Fisika Statistik! Seluruh sifat termodinamika makroskopis terkunci di dalam Fungsi Partisi Kanonik Z = sum exp(-E_i / k_B T). Dari turunan ln Z, kita bisa menurunkan energi dalam, entropi, dan kapasitas kalor secara presisi!"
            ),
            StoryPanel(
                id = "p-stat-ens-3",
                panelNumber = 3,
                title = "Fermion vs Boson: Dua Wajah Kuantum",
                caption = "Kirana memaparkan statistik kuantum partikel identik tak terbedakan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Partikel kuantum terbagi dua: Fermion (spin pecahan, mematuhi larangan Pauli dan statistik Fermi-Dirac, membentuk materi padat dan elektron logam) serta Boson (spin bulat, statistik Bose-Einstein, dapat berkumpul tanpa batas di tingkat energi terendah membentuk foton laser dan Kondensasi Bose-Einstein)!"
            )
        ),
        intuition = "Fisika Statistik menyediakan fondasi mikroskopis bagi hukum-hukum termodinamika makroskopis. Karena melacak setiap partikel secara deterministik mustahil, kita menggunakan konsep Ensemble (koleksi statistik sistem berkeadaan makroskopis sama): Ensemble Mikrokanonik (N, V, E konstan), Ensemble Kanonik (N, V, T konstan, sistem bertukar energi dengan reservoir panas), dan Ensemble Agung (mu, V, T konstan, sistem bertukar energi dan partikel). Fungsi Partisi Kanonik Z mengukur jumlah keadaan termal efektif yang dapat diakses sistem pada suhu T. Pada skala kuantum, ketidakterbedaan partikel membagi materi menjadi Statistik Fermi-Dirac (untuk elektron dan kuark) dan Statistik Bose-Einstein (untuk foton dan helium-4).",
        intuitionPoints = listOf(
            "Entropi Boltzmann: S = k_B ln Omega, menghubungkan konsep makroskopis entropi S dengan jumlah keadaan mikro Omega yang mungkin secara kuantum.",
            "Faktor Boltzmann: P(E_i) = exp(-beta E_i) / Z, di mana beta = 1 / (k_B T). Keadaan berenergi tinggi memiliki probabilitas eksponensial lebih kecil untuk terisi pada suhu rendah.",
            "Fungsi Partisi Kanonik: Z = sum exp(-beta E_i). Energi rata-rata: <E> = -d(ln Z) / d(beta); Energi bebas Helmholtz: F = -k_B T ln Z.",
            "Distribusi Fermi-Dirac: f(E) = 1 / [exp((E - mu)/k_BT) + 1]. Pada T = 0 K, fungsi berupa tangga tegas: semua keadaan di bawah Energi Fermi E_F terisi penuh (f=1) dan di atas E_F kosong total (f=0).",
            "Distribusi Bose-Einstein: n(E) = 1 / [exp((E - mu)/k_BT) - 1]. Pada suhu sangat rendah di bawah suhu kritis T_c, terjadi Kondensasi Bose-Einstein (BEC) di mana fraksi makroskopis partikel jatuh ke keadaan dasar kuantum tunggal n = 0."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Fungsi Partisi Kanonik Gibbs",
                latexFormula = "Z = \\sum_{i} e^{-\\beta E_i} \\quad ; \\quad \\beta = \\frac{1}{k_B T}",
                description = "Jumlah bobot statistik Boltzmann dari seluruh keadaan mikro i sistem berenergi E_i.",
                variableMeanings = mapOf(
                    "Z" to "Fungsi partisi kanonik (partition function)",
                    "k_B" to "Konstanta Boltzmann (1.38 x 10⁻²³ J/K)",
                    "T" to "Suhu mutlak (Kelvin)",
                    "E_i" to "Energi tingkat keadaan mikro ke-i"
                )
            ),
            FormulaCard(
                title = "Distribusi Kuantum Fermi-Dirac & Bose-Einstein",
                latexFormula = "\\langle n(E) \\rangle = \\frac{1}{e^{\\frac{E - \\mu}{k_B T}} \\pm 1}",
                description = "Rata-rata populasi keadaan berenergi E: tanda (+) untuk Fermion (Fermi-Dirac) dan tanda (-) untuk Boson (Bose-Einstein).",
                variableMeanings = mapOf(
                    "\\mu" to "Potensial kimia sistem",
                    "+ 1" to "Statistik Fermi-Dirac (mematuhi larangan Pauli, max 1 partikel per keadaan)",
                    "- 1" to "Statistik Bose-Einstein (tidak ada larangan Pauli, kondensasi BEC)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Karakterisasi Gas Elektron Bebas Logam & Silikon Sel Surya di BRIN Serpong",
            industry = "Fisika Zat Padat & Rekayasa Sel Surya Fotovoltaik",
            context = "Pusat Riset Fisika BRIN di Kawasan Sains Terpadu Serpong meneliti efisiensi semikonduktor silikon sel surya dan konduktivitas kontak logam perak.",
            problem = "Mengapa elektron bebas dalam logam penghantar (seperti tembaga atau perak) hampir tidak memberikan kontribusi pada kapasitas kalor logam pada suhu ruang, padahal menurut teori kinetik klasik gas monoatomik elektron seharusnya menyumbang 3/2 R?",
            solution = "Fisika statistik klasik gagal menjelaskan anomali ini karena menganggap semua elektron menyerap kalor secara bebas. Berdasarkan statistik Fermi-Dirac kuantum, elektron adalah fermion dengan Energi Fermi sangat tinggi E_F ≈ 7 eV (setara dengan suhu Fermi T_F ≈ 80.000 K). Pada suhu ruang (300 K), hampir seluruh elektron terkunci rapat di bawah permukaan Fermi dan dilarang menyerap energi termal kecil karena keadaan energi di atasnya sudah penuh terisi (larangan Pauli). Hanya sebagian kecil elektron di lapisan terluar permukaan Fermi (fraksi sekitar T / T_F ≈ 300 / 80.000 ≈ 0.4%) yang dapat tereksitasi secara termal! Perhitungan kapasitas kalor elektron C_v = (pi² / 2) (k_B T / E_F) k_B N cocok sempurna dengan data eksperimen kriogenik laboratorium BRIN.",
            lessonsLearned = "Statistik kuantum Fermi-Dirac adalah satu-satunya kunci yang berhasil memecahkan teka-teki kapasitas kalor zat padat dan menjadi dasar perancangan semikonduktor modern."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Munculnya Distribusi Eksponensial Boltzmann Menggunakan 20 Koin",
            objective = "Melihat secara langsung bagaimana pertukaran acak energi antar-partikel menghasilkan distribusi probabilitas eksponensial Boltzmann secara alami.",
            materialsNeeded = listOf(
                "20 keping koin (sebagai 20 partikel)",
                "Kertas bertuliskan kolom tingkat energi: Tingkat 0, Tingkat 1, Tingkat 2, Tingkat 3, Tingkat 4",
                "1 buah dadu biasa atau aplikasi acak angka di smartphone"
            ),
            steps = listOf(
                "Keadaan Awal: Letakkan semua 20 koin di Tingkat Energi 1 (seluruh partikel memiliki energi rata-rata sama). Total energi = 20 satuan.",
                "Simulasikan Tumbukan Termal: Lempar dadu dua kali: lemparan 1 memilih koin donor, lemparan 2 memilih koin penerima. Koin donor turun 1 tingkat energi, koin penerima naik 1 tingkat energi (energi total tetap kekal 20 satuan). Jika koin sudah di Tingkat 0, ia tidak bisa turun lagi.",
                "Ulangi proses pertukaran energi acak ini sebanyak 50 kali tumbukan.",
                "Hitung populasi koin di masing-masing tingkat energi: Anda akan melihat Tingkat 0 memiliki koin paling banyak (sekitar 10 koin), Tingkat 1 lebih sedikit (sekitar 5 koin), Tingkat 2 (sekitar 3 koin), Tingkat 3 (1-2 koin), dan Tingkat 4 hampir kosong!",
                "Grafik batang populasi koin membentuk kurva eksponensial menurun sempurna P(E) ~ exp(-E / kT), membuktikan hukum distribusi Boltzmann muncul murni dari hukum probabilitas statistik!"
            ),
            safetyNotes = listOf(
                "Aktivitas penalaran statistik yang aman dan mendidik."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-stat-ens-1",
                prompt = "Pada suhu nol mutlak (T = 0 Kelvin), bagaimanakah bentuk kurva probabilitas keterisian f(E) fungsi distribusi Fermi-Dirac untuk elektron di dalam logam?",
                type = "multiple_choice",
                options = listOf(
                    "f(E) = 1 (terisi penuh 100%) untuk seluruh energi E < E_F, dan f(E) = 0 (kosong total) untuk seluruh energi E > E_F",
                    "f(E) = 0 untuk seluruh tingkat energi",
                    "f(E) terdistribusi merata 50% di semua tingkat energi",
                    "f(E) mengikuti kurva lonceng distribusi normal Gauss"
                ),
                correctAnswer = "f(E) = 1 (terisi penuh 100%) untuk seluruh energi E < E_F, dan f(E) = 0 (kosong total) untuk seluruh energi E > E_F",
                hints = listOf(
                    "Ingat konsep 'Laut Fermi' (Fermi sea).",
                    "Pada T = 0 K, tidak ada eksitasi termal sama sekali.",
                    "Fungsi berbentuk fungsi tangga Heaviside terbalik."
                ),
                explanation = "Pada suhu nol mutlak T = 0 K, partikel fermion mengisi seluruh tingkat energi kuantum serendah mungkin sesuai larangan Pauli. Semua tingkat energi dari 0 hingga Energi Fermi E_F terisi penuh dengan probabilitas f(E) = 1. Di atas Energi Fermi E_F, tidak ada satu pun elektron yang dapat terisi (f(E) = 0). Kurva ini membentuk fungsi tangga tajam sempurna.",
                misconception = "Mengira pada T = 0 K seluruh elektron jatuh ke tingkat energi paling dasar E = 0 (ini hanya terjadi pada partikel boson, sedangkan fermion dilarang berkumpul di tingkat yang sama oleh larangan Pauli)."
            ),
            QuizQuestion(
                id = "q-stat-ens-2",
                prompt = "Diberikan sebuah sistem kuantum dengan dua tingkat energi diskrit: keadaan dasar E_1 = 0 dan keadaan tereksitasi E_2 = epsilon. Berapakah fungsi partisi kanonik Z dari sistem tersebut pada suhu T?",
                type = "multiple_choice",
                options = listOf(
                    "Z = 1 + exp(-epsilon / k_B T)",
                    "Z = exp(-epsilon / k_B T)",
                    "Z = 1 - exp(-epsilon / k_B T)",
                    "Z = 2 exp(-epsilon / k_B T)"
                ),
                correctAnswer = "Z = 1 + exp(-epsilon / k_B T)",
                hints = listOf(
                    "Fungsi partisi Z = sum exp(-beta E_i).",
                    "Suku 1: exp(-beta · 0) = exp(0) = 1.",
                    "Suku 2: exp(-beta · epsilon) = exp(-epsilon / k_B T).",
                    "Z = 1 + exp(-epsilon / k_B T)."
                ),
                explanation = "Berdasarkan definisi fungsi partisi kanonik Z = sum_i exp(-E_i / k_B T): untuk keadaan 1 dengan E_1 = 0, suku partisinya adalah exp(-0 / k_B T) = exp(0) = 1. Untuk keadaan 2 dengan E_2 = epsilon, suku partisinya adalah exp(-epsilon / k_B T). Menjumlahkan kedua suku menghasilkan Z = 1 + exp(-epsilon / k_B T).",
                misconception = "Lupa bahwa exp(0) bernilai 1 (bukan 0)."
            )
        )
    )

    private fun getMetodeMatematikaFisikaLesson(): LessonData = LessonData(
        conceptId = "fis-metode-matematika-fisika",
        storyPanels = listOf(
            StoryPanel(
                id = "p-mat-fis-1",
                panelNumber = 1,
                title = "Gelombang Simetris Silinder dan Bola",
                caption = "Dimas memecahkan persamaan gelombang pada membran drum bundar dan distribusi medan potensial di sekitar bola bermuatan. Koordinat Kartesius x, y, z menghasilkan pemisahan variabel yang buntu.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kenapa persamaan gelombang pada membran drum bundar tidak bisa diselesaikan dengan fungsi sinus dan cosinus biasa?"
            ),
            StoryPanel(
                id = "p-mat-fis-2",
                panelNumber = 2,
                title = "Keluarga Fungsi Ortogonal Khusus",
                caption = "Kakek memperkenalkan fungsi khusus fisika matematika: Fungsi Bessel, Polinomial Legendre, dan Polinomial Hermite.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Fungsi sinus dan cosinus adalah solusi simetri datar Kartesius, Dimas! Untuk simetri silinder melingkar, alam berbicara dengan Fungsi Bessel J_n(x). Untuk simetri bola 3D, solusinya adalah Polinomial Legendre P_l(cos theta) dan Harmonisa Bola Y_lm!"
            ),
            StoryPanel(
                id = "p-mat-fis-3",
                panelNumber = 3,
                title = "Teori Sturm-Liouville yang Universal",
                caption = "Kirana menyatukan seluruh fungsi khusus di bawah satu kerangka operator diferensial Sturm-Liouville.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jacques Sturm dan Joseph Liouville membuktikan bahwa semua persamaan diferensial ini adalah persamaan nilai eigen operator Hermite diferensial L[y] = lambda w(x) y! Nilai eigennya selalu riil dan fungsi-fungsi eigennya selalu ortogonal, memungkinkan ekspansi deret Fourier umum!"
            )
        ),
        intuition = "Persamaan diferensial parsial (PDE) dalam fisika—seperti persamaan gelombang, persamaan difusi panas, persamaan Laplace, dan persamaan Schrödinger—sering diselesaikan menggunakan metode pemisahan variabel dalam sistem koordinat yang sesuai dengan simetri fisik masalah. Teori Sturm-Liouville membuktikan bahwa operator diferensial linier bentuk swa-damping (self-adjoint) L[y] = [p(x) y']' + q(x) y = -lambda w(x) y menghasilkan nilai eigen riil dan keluarga fungsi eigen ortogonal terhadap fungsi bobot w(x). Ini menjelaskan mengapa Fungsi Bessel J_n (koordinat silinder), Polinomial Legendre P_l (koordinat bola), dan Polinomial Hermite H_n (osilator kuantum) dapat bertindak sebagai basis ortogonal untuk memperluas sembarang fungsi fisika layaknya deret Fourier.",
        intuitionPoints = listOf(
            "Bentuk Baku Persamaan Sturm-Liouville: d/dx [p(x) dy/dx] + q(x) y + lambda w(x) y = 0, dengan fungsi bobot positif w(x) > 0.",
            "Ortogonalitas Fungsi Eigen: int_a^b y_m(x) y_n(x) w(x) dx = 0 untuk m ≠ n.",
            "Fungsi Bessel J_n(kr): solusi persamaan radial Helmholtz pada koordinat silinder; nol-nol fungsi Bessel menentukan frekuensi getaran membran melingkar drum.",
            "Polinomial Legendre P_l(x): solusi persamaan sudut koordinat bola; harmonisa bola Y_lm(theta, phi) menentukan bentuk orbital atom s, p, d, f.",
            "Metode Fungsi Green: menyelesaikan persamaan diferensial tak-homogen L[y] = f(x) dengan mencari respon impuls terhadap fungsi delta Dirac L[G(x, x')] = delta(x - x')."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Persamaan Diferensial Sturm-Liouville Baku",
                latexFormula = "\\frac{d}{dx}\\left[p(x) \\frac{dy}{dx}\\right] + q(x) y + \\lambda w(x) y = 0",
                description = "Persamaan diferensial linear orde dua tergeneralisasi penjamin sifat ortogonalitas fungsi khusus.",
                variableMeanings = mapOf(
                    "p(x), q(x)" to "Fungsi koefisien kontinu riil",
                    "w(x) > 0" to "Fungsi bobot ortogonalitas (weight function)",
                    "\\lambda" to "Nilai eigen real",
                    "y(x)" to "Fungsi eigen ortogonal"
                )
            ),
            FormulaCard(
                title = "Relasi Ortogonalitas Polinomial Legendre",
                latexFormula = "\\int_{-1}^{1} P_l(x) P_m(x) \\, dx = \\frac{2}{2l + 1} \\, \\delta_{lm}",
                description = "Integral tumpang tindih Polinomial Legendre pada domain [-1, 1] di mana delta_lm adalah delta Kronecker.",
                variableMeanings = mapOf(
                    "P_l(x)" to "Polinomial Legendre derajat l",
                    "\\delta_{lm}" to "Delta Kronecker (bernilai 1 jika l = m, bernilai 0 jika l ≠ m)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemodelan Akustik Resonansi Ruang Konser Aula Simfonia Jakarta",
            industry = "Teknik Akustik Arsitektural & Desain Audio Hall",
            context = "Aula Simfonia Jakarta di Kemayoran dirancang khusus untuk pertunjukan musik orkestra simfoni klasik tanpa pengeras suara elektronik dengan waktu dengung optimal T_60 = 2.0 detik.",
            problem = "Bagaimana merancang bentuk lengkungan kubah langit-langit dan dinding cekung agar tidak terjadi penumpukan gelombang berdiri (acoustic focal points) yang memekakkan telinga penonton di kursi tertentu?",
            solution = "Konsultan akustik memodelkan persamaan Helmholtz gelombang suara 3D div² p + k² p = 0 di dalam aula menggunakan ekspansi harmonisa bola dan fungsi Bessel Teori Sturm-Liouville. Dengan menghitung frekuensi resonansi eigen dan bentuk modus spasial gelombang suara di ruang 3D, insinyur memasang panel difuser kayu berigi di sepanjang dinding lengkung untuk memecah simetri fokus gelombang, menghasilkan distribusi medan tekanan suara yang seragam dan kaya harmonik di seluruh 1.200 kursi penonton.",
            lessonsLearned = "Teori Sturm-Liouville dan fungsi ortogonal khusus adalah bahasa baku perancangan akustik arsitektur ruang konser kelas dunia."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Pola Garis Simpul Gelombang Chladni pada Piringan Seng",
            objective = "Melihat secara langsung bentuk visual garis simpul dua dimensi dari fungsi eigen gelombang Bessel dan Fourier.",
            materialsNeeded = listOf(
                "1 piringan seng/loyang logam bundar datar tipis (atau penutup toples logam lebar)",
                "Garam dapur halus atau bubuk tepung terigu",
                "Speaker bluetooth smartphone atau speaker kecil",
                "Aplikasi Tone Generator pada smartphone (pembangkit frekuensi audio murni)"
            ),
            steps = listOf(
                "Topang bagian tengah piringan logam tepat di atas speaker smartphone.",
                "Taburkan selapis tipis garam dapur halus secara merata di atas permukaan piringan logam.",
                "Nyalakan aplikasi Tone Generator dan mainkan nada frekuensi audio murni (mulai dari 200 Hz, perlahan naikkan ke 400 Hz, 800 Hz, 1200 Hz).",
                "Amati fenomena yang terjadi pada frekuensi resonansi tertentu: butiran garam melonjak-lonjak menjauhi bagian bergetar dan berkumpul rapi di garis-garis yang diam (garis simpul / nodal lines)!",
                "Perhatikan pola geometris yang terbentuk: lingkaran konsentris dan jari-jari simetris yang sangat indah! Lingkaran-lingkaran konsentris tersebut adalah representasi fisik dari titik-titik nol Fungsi Bessel J_0(kr) = 0!",
                "Ubah frekuensi nada untuk melihat lompatan ke modus fungsi eigen berikutnya dengan jumlah lingkaran simpul yang lebih banyak."
            ),
            safetyNotes = listOf(
                "Gunakan volume suara yang nyaman dan jangan mendekatkan telinga terlalu dekat ke speaker berkekuatan tinggi."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mat-fis-1",
                prompt = "Berdasarkan sifat ortogonalitas Polinomial Legendre pada domain [-1, 1], berapakah nilai integral dari perkalian P_1(x) · P_2(x) dx dari x = -1 sampai x = 1 (di mana P_1(x) = x dan P_2(x) = 1/2(3x² - 1))?",
                type = "numeric",
                correctAnswer = "0",
                tolerance = 0.01f,
                unit = "",
                hints = listOf(
                    "Gunakan Teorema Ortogonalitas: int_{-1}^{1} P_l(x) P_m(x) dx = [2 / (2l + 1)] · delta_{lm}.",
                    "Di sini l = 1 dan m = 2 (derajat berbeda l ≠ m).",
                    "Jika l ≠ m, maka delta_{1, 2} = ...?"
                ),
                explanation = "Berdasarkan Teorema Ortogonalitas Sturm-Liouville untuk Polinomial Legendre, dua polinomial Legendre berderajat berbeda (l ≠ m) selalu saling ortogonal pada interval [-1, 1] dengan fungsi bobot w(x) = 1. Karena l = 1 dan m = 2 (1 ≠ 2), maka integral int_{-1}^{1} P_1(x) P_2(x) dx = 0 secara eksak.",
                misconception = "Mencoba menghitung integral polinom manual (meskipun hasilnya tetap nol, ini menghabiskan waktu karena ortogonalitas menjamin nilainya nol)."
            ),
            QuizQuestion(
                id = "q-mat-fis-2",
                prompt = "Mengapa persamaan getaran membran drum melingkar dua dimensi menghasilkan Fungsi Bessel J_n(kr), sedangkan dawai gitar satu dimensi menghasilkan fungsi sinus dan cosinus biasa?",
                type = "multiple_choice",
                options = listOf(
                    "Karena membran drum memiliki geometri simetri silinder melingkar r, di mana operator Laplace memiliki suku turunan 1/r d/dr yang menghasilkan persamaan diferensial Bessel",
                    "Karena bahan kulit drum terbuat dari logam khusus",
                    "Karena drum dipukul menggunakan stik kayu bukannya dipetik",
                    "Karena getaran drum tidak mematuhi hukum kekekalan energi"
                ),
                correctAnswer = "Karena membran drum memiliki geometri simetri silinder melingkar r, di mana operator Laplace memiliki suku turunan 1/r d/dr yang menghasilkan persamaan diferensial Bessel",
                hints = listOf(
                    "Perhatikan bentuk operator Laplace dalam koordinat polar: div² = d²/dr² + (1/r) d/dr + (1/r²) d²/dtheta².",
                    "Suku (1/r) d/dr mengubah persamaan diferensial menjadi bentuk kanonik persamaan Bessel."
                ),
                explanation = "Dalam koordinat Kartesius 1D (dawai gitar), operator Laplace adalah d²/dx² yang langsung menghasilkan solusi harmonik sinus dan cosinus. Namun pada membran melingkar 2D, simetri alami menuntut koordinat polar (r, theta) di mana operator Laplace memiliki suku radial (1/r) d/dr. Pemisahan variabel pada persamaan diferensial ini menghasilkan persamaan diferensial Bessel, yang solusinya secara unik didefinisikan oleh Fungsi Bessel J_n(kr).",
                misconception = "Mengira fungsi Bessel adalah perkiraan semata (Fungsi Bessel adalah solusi analitis eksak dari persamaan gelombang dalam koordinat silinder)."
            )
        )
    )

    private fun getFisikaKomputasiMonteCarloLesson(): LessonData = LessonData(
        conceptId = "fis-fisika-komputasi-monte-carlo",
        storyPanels = listOf(
            StoryPanel(
                id = "p-komputasi-1",
                panelNumber = 1,
                title = "Ketika Persamaan Tak Dapat Diintegralkan",
                caption = "Dimas mencoba memodelkan interaksi seribu atom gas argon yang bertumbukan di dalam wadah menggunakan potensial Lennard-Jones. Persamaan diferensial analitisnya sama sekali tidak memiliki solusi tertutup di atas kertas.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika integral analitisnya tidak bisa dipecahkan dengan tangan, bagaimana para ilmuwan bisa mengetahui sifat termal dan struktur cairan riil?"
            ),
            StoryPanel(
                id = "p-komputasi-2",
                panelNumber = 2,
                title = "Integrator Dinamika Molekul Verlet",
                caption = "Kakek menjelaskan metode Dinamika Molekuler (Molecular Dynamics / MD) menggunakan algoritma integrasi Verlet dan Leapfrog.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Komputer menghitung lintasan langkah demi langkah waktu kecil dt, Dimas! Algoritma Velocity-Verlet mengawetkan energi dan ruang fase (simpletik), mengintegrasikan posisi dan kecepatan atom stabil tanpa akumulasi galat liar!"
            ),
            StoryPanel(
                id = "p-komputasi-3",
                panelNumber = 3,
                title = "Algoritma Metropolis & Model Ising",
                caption = "Kirana memaparkan metode Monte Carlo rantai Markov (MCMC) untuk mensimulasikan transisi fase magnetik feromagnet.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Nicholas Metropolis menciptakan algoritma sampling acak cerdas: balikkan satu spin kisi; jika energi turun (dE < 0), terima pembalikan; jika energi naik (dE > 0), terima dengan probabilitas exp(-dE / k_B T). Dengan ini, komputer dapat mensimulasikan transisi fase Curie feromagnetik secara spektakuler!"
            )
        ),
        intuition = "Fisika komputasi adalah pilar ketiga sains modern bersama fisika teoretis dan eksperimen. Dalam Dinamika Molekul (MD), hukum Newton F_i = m_i a_i diselesaikan secara numerik untuk N partikel yang berinteraksi. Integrator Velocity-Verlet adalah algoritma standar emas karena bersifat simpletik (mengawetkan volume ruang fase dan stabilitas energi jangka panjang). Dalam Fisika Statistik, pengambilan sampel ruang fase yang sangat luas diselesaikan melalui Metode Monte Carlo Metropolis (MCMC): sebuah rantai Markov acak yang mengeksplorasi konfigurasi kisi (seperti Model Spin Ising) dengan bobot Boltzmann exp(-E / k_BT) untuk menghitung besaran rata-rata makroskopis magnetisasi dan kapasitas kalor.",
        intuitionPoints = listOf(
            "Algoritma Velocity-Verlet: x(t + dt) = x(t) + v(t) dt + 1/2 a(t) dt² dan v(t + dt) = v(t) + 1/2 [a(t) + a(t + dt)] dt. Memiliki galat lokal O(dt⁴) dan menjaga kekekalan energi jangka panjang.",
            "Model Kisi Ising: Hamiltonian energi magnetik H = -J sum_{<ij>} s_i s_j - h sum_i s_i, di mana s_i = ±1 adalah spin kisi dan <ij> pasangan tetangga terdekat.",
            "Kriteria Penerimaan Metropolis: probabilitas transisi P = min(1, exp(-beta delta E)). Jika perubahan menurunkan energi (delta E <= 0), mutasi selalu diterima. Jika menaikkan energi, mutasi diterima dengan peluang termal exp(-delta E / k_B T).",
            "Transisi Fase Curie Model Ising 2D: memiliki suhu kritis analitis Onsager k_B T_c / J = 2 / ln(1 + sqrt(2)) ≈ 2.269, di mana magnetisasi spontan mendadak lenyap pada T > T_c."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Algoritma Integrator Velocity-Verlet MD",
                latexFormula = "\\mathbf{r}(t + \\Delta t) = \\mathbf{r}(t) + \\mathbf{v}(t) \\Delta t + \\frac{1}{2} \\mathbf{a}(t) \\Delta t^2",
                description = "Pembaruan posisi partikel berorde tinggi yang stabil dan dapat dibalik waktu (time-reversible).",
                variableMeanings = mapOf(
                    "\\mathbf{r}(t)" to "Vektor posisi partikel pada waktu t",
                    "\\mathbf{v}(t)" to "Vektor kecepatan partikel",
                    "\\mathbf{a}(t)" to "Percepatan dari resultan gaya antaraksi F/m",
                    "\\Delta t" to "Langkah waktu integrasi numerik (biasanya 1–2 femtodetik)"
                )
            ),
            FormulaCard(
                title = "Kriteria Penerimaan Metropolis-Hastings (MCMC)",
                latexFormula = "P_{\\text{terima}} = \\min\\left(1, \\; e^{-\\frac{\\Delta E}{k_B T}}\\right)",
                description = "Probabilitas menerima konfigurasi mikro baru dengan perubahan energi delta E pada suhu T.",
                variableMeanings = mapOf(
                    "\\Delta E = E_{\\text{baru}} - E_{\\text{lama}}" to "Perubahan energi sistem akibat pergeseran acak",
                    "k_B T" to "Energi termal karakteristik lingkungan"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Simulasi Dinamika Molekul Pelelehan Katalis Nikel pada Reaktor Metana PT Pupuk Kujang",
            industry = "Industri Pupuk Kimia & Desain Katalis Komputasional",
            context = "PT Pupuk Kujang Cikampek mengoperasikan reaktor steam reforming metana menggunakan pelet katalis nikel berpori yang bekerja pada suhu ekstrem 850°C dan tekanan 30 bar.",
            problem = "Pada suhu 850°C, nanopartikel nikel mengalami fenomena sintering (pelelehan permukaan dan penggumpalan partikel kecil menjadi besar), menyebabkan penurunan drastis luas permukaan aktif katalis dan pemborosan miliaran rupiah per siklus penggantian.",
            solution = "Peneliti komputasi memodelkan sistem 500.000 atom nikel menggunakan perangkat lunak Dinamika Molekul LAMMPS dengan medan gaya Embedded Atom Method (EAM) dan integrator Verlet pada timestep dt = 1 femtodetik. Simulasi mengungkap bahwa pelelehan diawali dari dislokasi atom pada faset kristal Ni(111) di permukaan terluar. Dengan menguji secara komputasi penambahan 2% atom promotor zirkonia (ZrO₂), simulasi membuktikan energi ambang migrasi atom nikel naik sebesar 45%, menghambat laju sintering dan memperpanjang umur pakai katalis industri hingga dua kali lipat.",
            lessonsLearned = "Fisika komputasi dinamika molekul memungkinkan pengujian material bersuhu tinggi secara presisi di komputer sebelum diaplikasikan pada reaktor industri raksasa."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Monte Carlo Estimasi Nilai Pi Menggunakan Pelemparan Jarum Buffon",
            objective = "Membuktikan bagaimana bilangan acak murni dapat menyelesaikan konstanta matematika transendental (Pi) melalui metode Monte Carlo eksperimental.",
            materialsNeeded = listOf(
                "1 lembar karton putih lebar",
                "Spidol dan penggaris",
                "50 buah tusuk gigi berukuran panjang sama L = 5 cm"
            ),
            steps = listOf(
                "Gambar garis-garis sejajar berjarak D = 5 cm (jarak garis D persis sama dengan panjang tusuk gigi L) pada karton.",
                "Pegang 50 tusuk gigi pada ketinggian 50 cm di atas karton, lalu jatuhkan secara acak ke atas kertas.",
                "Hitung jumlah total tusuk gigi yang jatuh (N_total = 50).",
                "Hitung jumlah tusuk gigi yang posisinya MENYEBERANGI / MEMOTONG garis sejajar (N_potong).",
                "Rumus Eksperimen Jarum Buffon Monte Carlo: Pi ≈ (2 · N_total) / N_potong.",
                "Hitung nilai estimasi Pi Anda! (Misal dari 50 tusuk gigi, ada 32 yang memotong garis: Pi ≈ (2 · 50) / 32 = 3.125, mendekati nilai riil 3.14159!).",
                "Simpulkan: Ini adalah demonstrasi fisik metode Monte Carlo yang digunakan oleh fisikawan untuk mengintegralkan persamaan kompleks."
            ),
            safetyNotes = listOf(
                "Hati-hati ujung tusuk gigi runcing tidak mengenai mata saat dijatuhkan."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-komputasi-1",
                prompt = "Mengapa integrator Velocity-Verlet lebih disukai dalam simulasi Dinamika Molekuler (MD) dibandingkan metode Runge-Kutta orde 4 (RK4) biasa, meskipun RK4 memiliki ketelitian per langkah yang lebih tinggi?",
                type = "multiple_choice",
                options = listOf(
                    "Karena integrator Verlet bersifat simpletik dan dapat dibalik waktu (time-reversible), menjamin kekekalan energi jangka panjang tanpa pergeseran energi kumulatif (energy drift)",
                    "Karena integrator Verlet tidak memerlukan perhitungan percepatan sama sekali",
                    "Karena metode RK4 hanya dapat digunakan untuk partikel bermuatan negatif",
                    "Karena metode Verlet bekerja lebih lambat dari metode Euler"
                ),
                correctAnswer = "Karena integrator Verlet bersifat simpletik dan dapat dibalik waktu (time-reversible), menjamin kekekalan energi jangka panjang tanpa pergeseran energi kumulatif (energy drift)",
                hints = listOf(
                    "Simulasi MD berjalan selama jutaan hingga miliaran langkah waktu (timestep).",
                    "Metode non-simpletik seperti RK4 mengalami 'energy drift' (energi total terus bertambah atau berkurang seiring waktu)."
                ),
                explanation = "Dalam simulasi Dinamika Molekul yang melibatkan jutaan langkah waktu, sifat simpletik (mengawetkan volume ruang fase Poincaré) dan reversibilitas waktu sangat krusial. Integrator Velocity-Verlet bersifat simpletik, sehingga energi total sistem berosilasi stabil di sekitar nilai rata-rata tanpa mengalami kebocoran energi kumulatif (energy drift). Sebaliknya, metode standar RK4 tidak simpletik dan akan menyebabkan sistem mengalami disipasi atau ledakan energi buatan dalam simulasi jangka panjang.",
                misconception = "Mengira algoritma dengan orde kesalahan lokal terkecil selalu otomatis menjadi algoritma terbaik untuk simulasi jangka panjang."
            ),
            QuizQuestion(
                id = "q-komputasi-2",
                prompt = "Dalam algoritma Monte Carlo Metropolis pada suhu T, sebuah pembalikan spin acak diuji dan menghasilkan perubahan energi delta E = +2.0 x 10⁻²¹ J (energi sistem bertambah). Jika nilai k_B T = 2.0 x 10⁻²¹ J, berapakah probabilitas diterimanya konfigurasi baru tersebut?",
                type = "numeric",
                correctAnswer = "0.368",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "Rumus probabilitas penerimaan Metropolis jika delta E > 0: P = exp(-delta E / k_B T).",
                    "delta E / k_B T = 2.0 / 2.0 = 1.0.",
                    "P = exp(-1.0) = 1 / e ≈ 1 / 2.718 = ...?"
                ),
                explanation = "Berdasarkan kriteria Metropolis: jika delta E > 0, perubahan diterima dengan probabilitas P = exp(-delta E / k_B T). Di sini delta E / k_B T = 1.0. Maka P = exp(-1.0) ≈ 0.367879 (atau sekitar 36.8%). Ada peluang sebesar 36.8% bahwa pembalikan spin berenergi lebih tinggi ini diterima, memungkinkan sistem keluar dari jebakan minimum lokal.",
                misconception = "Mengira jika delta E positif (energi naik) maka probabilitasnya langsung ditolak nol (penolakan 100% hanya terjadi pada T = 0 K)."
            )
        )
    )

    private fun getOptikLanjutLaserNonlinearLesson(): LessonData = LessonData(
        conceptId = "fis-optik-lanjut-laser-nonlinear",
        storyPanels = listOf(
            StoryPanel(
                id = "p-laser-nonlin-1",
                panelNumber = 1,
                title = "Misteri Pointer Laser Hijau",
                caption = "Dimas membongkar sebuah pena pointer laser hijau murah dan heran menemukan bahwa dioda semikonduktor di dalamnya sebenarnya memancarkan sinar inframerah tak kasat mata 1064 nm!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Dioda pemancarnya inframerah tak terlihat, tapi kenapa cahaya yang keluar dari ujung laser berwarna hijau terang 532 nm? Dari mana datangnya warna hijau ini?"
            ),
            StoryPanel(
                id = "p-laser-nonlin-2",
                panelNumber = 2,
                title = "Pembangkitan Harmonik Kedua (SHG)",
                caption = "Kakek menjelaskan kristal optik non-linear Potassium Titanyl Phosphate (KTP).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Pada intensitas medan listrik sangat tinggi, respon polarisasi bahan menjadi non-linear P = epsilon_0 (chi^(1) E + chi^(2) E²)! Suku chi^(2) pada kristal KTP menggabungkan dua foton inframerah 1064 nm menjadi satu foton hijau berenergi dua kali lipat dengan panjang gelombang tepat separuhnya: 532 nm (Second Harmonic Generation)!"
            ),
            StoryPanel(
                id = "p-laser-nonlin-3",
                panelNumber = 3,
                title = "Berkas Laser Gaussian & Resonator Optik",
                caption = "Kirana menggambar profil berkas laser Gaussian dengan pinggang berkas w_0 dan jarak Rayleigh z_R.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Laser bukanlah gelombang bidang tak hingga, melainkan berkas Gaussian paraksial! Berkas laser memiliki pinggang terkecil w_0 di fokus resonator Fabry-Perot dan perlahan melebar hiperbolik dengan divergensi sudut terkecil yang diizinkan oleh batas difraksi kuantum!"
            )
        ),
        intuition = "Pada intensitas cahaya rendah (optik linier), polarisasi medium dielektrik sebanding linear dengan medan listrik P = epsilon_0 chi E, di mana frekuensi cahaya yang keluar sama persis dengan yang masuk. Namun ketika intensitas laser sangat tinggi (medan listrik cahaya sebanding dengan medan listrik atomik ~10⁸ V/m), medium merespons secara non-linear: P = epsilon_0 (chi^(1) E + chi^(2) E² + chi^(3) E³ + ...). Kerentanan non-linear orde kedua chi^(2) (hanya ada pada kristal non-sentrosimetris) memungkinkan fenomena Pembangkitan Harmonik Kedua (Second Harmonic Generation / SHG) di mana dua foton berfrekuensi omega bergabung menghasilkan foton baru berfrekuensi 2omega (panjang gelombang terbelah dua). Berkas laser diatur oleh rongga resonator Fabry-Perot dan merambat sebagai Berkas Gaussian dengan profil intensitas lonceng.",
        intuitionPoints = listOf(
            "Profil Berkas Gaussian: lebar berkas w(z) = w_0 sqrt(1 + (z/z_R)²), di mana w_0 adalah pinggang berkas (beam waist) dan z_R = pi w_0² / lambda adalah Jarak Rayleigh.",
            "Divergensi sudut jauh berkas laser: theta = lambda / (pi w_0). Semakin sempit fokus pinggang berkas w_0, semakin cepat berkas menyebar melebar di kejauhan.",
            "Pembangkitan Harmonik Kedua (SHG): proses parametrik non-linear orde dua yang menggandakan frekuensi optik: omega + omega -> 2omega (contoh: inframerah 1064 nm -> hijau 532 nm).",
            "Pencocokan Fase (Phase Matching): agar konversi frekuensi non-linear efisien, kecepatan fase gelombang fundamental dan harmonik kedua harus identik (n(omega) = n(2omega)), dicapai memanfaatkan sifat bias ganda (birefringence) kristal anisotropik.",
            "Efek Kerr Optik (chi^(3)): indeks bias bergantung intensitas cahaya n = n_0 + n_2 I, mendasari fenomena self-focusing dan penguncian modus laser ultra-cepat femtosekon."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Profil Pelebaran Berkas Laser Gaussian",
                latexFormula = "w(z) = w_0 \\sqrt{1 + \\left(\\frac{z}{z_R}\\right)^2} \\quad ; \\quad z_R = \\frac{\\pi w_0^2}{\\lambda}",
                description = "Radius berkas laser Gaussian w(z) sebagai fungsi jarak perambatan z dari titik pinggang fokus w_0.",
                variableMeanings = mapOf(
                    "w(z)" to "Radius berkas pada jarak z (intensitas turun ke 1/e²)",
                    "w_0" to "Radius pinggang berkas minimum di titik fokus (beam waist)",
                    "z_R" to "Jarak Rayleigh (panjang kolimasi fokus berkas)",
                    "\\lambda" to "Panjang gelombang cahaya laser"
                )
            ),
            FormulaCard(
                title = "Polarisasi Dielektrik Non-Linear Orde Dua (SHG)",
                latexFormula = "P_{\\text{NL}} = \\epsilon_0 \\chi^{(2)} E(t)^2 = \\frac{1}{2} \\epsilon_0 \\chi^{(2)} E_0^2 \\left(1 + \\cos(2\\omega t)\\right)",
                description = "Munculnya komponen frekuensi ganda 2omega akibat respon kuadratik medan listrik cahaya kuat.",
                variableMeanings = mapOf(
                    "P_NL" to "Polarisasi non-linear medium kristal",
                    "\\chi^{(2)}" to "Suseptibilitas / kerentanan optik non-linear orde dua",
                    "\\omega" to "Frekuensi sudut berkas laser fundamental",
                    "2\\omega" to "Frekuensi harmonik kedua yang dibangkitkan"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Aplikasi Laser Pulsa Femtosekon untuk Bedah Mata Refraktif LASIK di Jakarta Eye Center",
            industry = "Teknologi Fotonika Medis & Bedah Refraktif Oftalmologi",
            context = "Klinik bedah mata Jakarta Eye Center (JEC) menggunakan sistem Femtosecond Laser untuk memotong flap kornea mata pada operasi koreksi mata minus (LASIK) dengan presisi mikrometer.",
            problem = "Laser kontinu konvensional memotong jaringan dengan panas termal (fototermal), yang dapat menyebabkan luka bakar jaringan kornea halus di sekitarnya dan memicu kebutaan.",
            solution = "Dokter menggunakan laser titanium-sapphire mode-locked yang menghasilkan pulsa laser berdurasi 100 femtosekon (10⁻¹³ detik) pada panjang gelombang 1053 nm. Karena durasi pulsa ultra-singkat, daya puncaknya mencapai megawatt sehingga intensitas medan listrik di titik fokus melampaui ambang non-linear kornea, memicu ionisasi multi-foton non-linear dan foto-disrupsi plasma murni (optical breakdown) tanpa ada panas termal yang merambat ke jaringan sekitarnya. Potongan flap kornea terbentuk dengan akurasi 1 mikron dalam hitungan 10 detik tanpa rasa sakit.",
            lessonsLearned = "Optik non-linear dan teknologi laser ultra-cepat telah merevolusi dunia kedokteran modern dari pembedahan mekanis kasar menjadi rekayasa fotonika presisi atomik."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Profil Berkas Laser dan Pengukuran Divergensi Sudut Laser Pointer",
            objective = "Mengukur pelebaran berkas laser terhadap jarak dan menghitung divergensi sudut paraksial berkas Gaussian.",
            materialsNeeded = listOf(
                "1 buah pena laser pointer (merah atau hijau)",
                "Pita ukur meteran gulung",
                "Kertas milimeter berpetak",
                "Ruangan panjang atau koridor rumah (jarak 1 meter dan 10 meter)"
            ),
            steps = listOf(
                "Posisikan laser pointer pada posisi kokoh di atas meja.",
                "Tembakkan laser ke kertas milimeter berpetak pada jarak z1 = 1 meter dari laser. Ukur diameter bintik cahaya laser d1 (misal d1 = 2 mm).",
                "Pindahkan kertas milimeter berpetak ke jarak z2 = 10 meter dari laser. Tembakkan laser ke titik yang sama.",
                "Ukur diameter bintik cahaya laser yang baru d2: amati bahwa bintik laser membesar menjadi d2 (misal d2 = 11 mm)!",
                "Hitung sudut divergensi berkas laser theta = (d2 - d1) / (z2 - z1) = (11 mm - 2 mm) / 9000 mm = 9 / 9000 = 0.001 radian (1 miliradian).",
                "Simpulkan: Meskipun laser tampak lurus, berkas laser tetap memiliki divergensi sudut Gaussian alami akibat batas difraksi gelombang elektromagnetik!"
            ),
            safetyNotes = listOf(
                "JANGAN PERNAH mengarahkan sinar laser langsung ke mata manusia atau hewan peliharaan.",
                "Hindari pantulan cermin kaca langsung."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-laser-nonlin-1",
                prompt = "Sebuah berkas laser inframerah berpanjang gelombang 1064 nm dilewatkan ke dalam kristal non-linear KTP yang memicu Pembangkitan Harmonik Kedua (Second Harmonic Generation / SHG). Berapakah panjang gelombang foton cahaya baru yang keluar dari kristal tersebut?",
                type = "numeric",
                correctAnswer = "532",
                tolerance = 1f,
                unit = "nm",
                hints = listOf(
                    "SHG menggandakan frekuensi optik: f_baru = 2 · f_awal.",
                    "Panjang gelombang berbanding terbalik dengan frekuensi: lambda = c / f.",
                    "Maka lambda_baru = lambda_awal / 2 = 1064 / 2 = ...?"
                ),
                explanation = "Dalam proses Pembangkitan Harmonik Kedua (SHG), dua foton fundamental berfrekuensi f bergabung membentuk satu foton baru dengan frekuensi ganda 2f. Karena panjang gelombang berbanding terbalik dengan frekuensi (lambda = c/f), panjang gelombang foton hasil konversi terbelah menjadi tepat separuh dari panjang gelombang awal: lambda_SHG = 1064 nm / 2 = 532 nm (cahaya hijau terang).",
                misconception = "Mengira panjang gelombang berlipat ganda menjadi 2128 nm (frekuensinya yang berlipat ganda, sehingga panjang gelombangnya justru menjadi separuhnya)."
            ),
            QuizQuestion(
                id = "q-laser-nonlin-2",
                prompt = "Pada jarak berapakah dari titik pinggang fokus (z = z_R, Jarak Rayleigh) luas penampang berkas laser Gaussian membesar menjadi TEPAT DUA KALI LIPAT dari luas penampang pinggang fokus minimumnya?",
                type = "multiple_choice",
                options = listOf(
                    "Pada jarak z = z_R (Jarak Rayleigh)",
                    "Pada jarak z = 2 z_R",
                    "Pada jarak z = 0 (tepat di fokus)",
                    "Pada jarak tak hingga z = tak hingga"
                ),
                correctAnswer = "Pada jarak z = z_R (Jarak Rayleigh)",
                hints = listOf(
                    "Rumus radius berkas: w(z) = w_0 sqrt(1 + (z/z_R)²).",
                    "Luas penampang berkas A sebanding dengan kuadrat radius: A ∝ w².",
                    "Pada z = z_R: w(z_R) = w_0 sqrt(1 + 1) = w_0 sqrt(2).",
                    "Luas A(z_R) = pi w(z_R)² = 2 pi w_0² = 2 A_0."
                ),
                explanation = "Berdasarkan definisi Jarak Rayleigh z_R, pada posisi z = z_R radius berkas membesar menjadi w(z_R) = w_0 sqrt(1 + (z_R/z_R)²) = w_0 sqrt(2). Karena luas area penampang berkas sebanding dengan kuadrat radius (Area = pi w²), maka luas area pada z = z_R adalah Area = pi (w_0 sqrt(2))² = 2 pi w_0², tepat dua kali lipat dari luas area pinggang minimum di titik fokus.",
                misconception = "Mengira radiusnya yang berlipat ganda dua kali lipat (radiusnya hanya membesar sebesar sqrt(2) ≈ 1.414 kali)."
            )
        )
    )
}

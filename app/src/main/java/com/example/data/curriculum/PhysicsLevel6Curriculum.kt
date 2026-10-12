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

object PhysicsLevel6Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "fis-kuantum-lanjut-perturbasi",
            domain = Domain.FISIKA,
            topic = "Mekanika Kuantum Lanjut",
            title = "Teori Perturbasi, Efek Stark/Zeeman & Teori Hamburan",
            description = "Perturbasi bebas waktu non-degenerasi/degenerasi, Aturan Emas Fermi (transisi waktu), efek Stark dan Zeeman, aproksimasi Born dan analisis gelombang parsial hamburan.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("fis-mekanika-kuantum-schrodinger-spin", "mat-aljabar-linear-spl")
        ),
        ConceptItem(
            id = "fis-relativitas-umum-tensor",
            domain = Domain.FISIKA,
            topic = "Relativitas & Gravitasi",
            title = "Relativitas Tensor 4-Dimensi & Persamaan Medan Einstein",
            description = "Metrik Minkowski, tensor Faraday F^{mu nu}, derivatif kovarian ruang waktu melengkung, simbol Christoffel, kelengkungan Riemann/Ricci, dan Persamaan Medan Einstein.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("fis-elektrodinamika-maxwell-larmor", "mat-kalkulus-vektor")
        ),
        ConceptItem(
            id = "fis-fisika-zat-padat-pita",
            domain = Domain.FISIKA,
            topic = "Fisika Zat Padat & Material",
            title = "Kisi Kristal, Fonon, Teorema Bloch & Superkonduktivitas",
            description = "Kisi resiprokal dan difraksi Bragg, kuantisasi getaran kisi fonon, kapasitas kalor Debye, Teorema Bloch struktur pita elektron, celah pita energi, dan efek Meissner superkonduktor.",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("fis-fisika-statistik-ensemble", "kim-anorganik-zat-padat-kisi")
        ),
        ConceptItem(
            id = "fis-fisika-atom-molekul-hartree",
            domain = Domain.FISIKA,
            topic = "Fisika Atom & Molekuler",
            title = "Fisika Atom Multi-Elektron, Hartree-Fock & Spektroskopi Molekul",
            description = "Medan swakonsisten Hartree-Fock, aturan Hund, kopling Russell-Saunders (L-S), aproksimasi Born-Oppenheimer, kurva potensial Morse, dan spektrum vibrasi-rotasi molekuler.",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("fis-kuantum-lanjut-perturbasi", "kim-teori-orbital-molekul")
        ),
        ConceptItem(
            id = "fis-fisika-inti-partikel-standar",
            domain = Domain.FISIKA,
            topic = "Fisika Nuklir & Partikel Elementer",
            title = "Fisika Inti, Model Kulit & Model Standar Partikel",
            description = "Energi ikat rumus massa semi-empiris Weizsäcker, bilangan magis model kulit inti, klasifikasi hadron/lepton/boson tera, model quark Gell-Mann, dan mekanisme Higgs.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("fis-kuantum-lanjut-perturbasi", "fis-relativitas-umum-tensor")
        ),
        ConceptItem(
            id = "fis-astrofisika-kosmologi-friedmann",
            domain = Domain.FISIKA,
            topic = "Astrofisika & Kosmologi",
            title = "Evolusi Bintang, Batas Chandrasekhar & Kosmologi Friedmann",
            description = "Siklus fusi hidrostatik bintang, degenerasi elektron katai putih, batas Chandrasekhar, bintang neutron, metrik FLRW, persamaan dinamika Friedmann, dan model Lambda-CDM.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("fis-relativitas-umum-tensor", "fis-fisika-statistik-ensemble")
        ),
        ConceptItem(
            id = "fis-fisika-plasma-mhd",
            domain = Domain.FISIKA,
            topic = "Fisika Plasma & Fusi Nuklir",
            title = "Fisika Plasma & Magnetohidrodinamika (MHD)",
            description = "Panjang perisai Debye, frekuensi osilasi plasma, hanyutan gerak partikel bermuatan (E x B drift), fluida konduktif MHD, gelombang Alfvén, dan kurungan fusi magnetik Tokamak.",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("fis-elektrodinamika-maxwell-larmor", "mat-pde-persamaan-diferensial-parsial")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "fis-kuantum-lanjut-perturbasi" -> LessonData(
                conceptId = "fis-kuantum-lanjut-perturbasi",
                simId = "sim-quantum-perturbation",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, persamaan Schrödinger untuk atom hidrogen bisa diselesaikan secara eksak. Tapi bagaimana jika atom hidrogen itu berada di dalam medan listrik atau medan magnet luar?",
                        narrativeContext = "Dimas memandangi diagram pergeseran garis spektrum emisi gas hidrogen."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Di situlah Teori Perturbasi berperan! Medan luar diperlakukan sebagai gangguan kecil H' terhadap Hamiltonan tak terganggu H0. Garis spektrum yang semula tunggal akan terbelah, yang kita kenal sebagai Efek Stark dan Efek Zeeman.",
                        narrativeContext = "Kakek menuliskan ekspansi koreksi energi orde satu E_n^(1) = <n0|H'|n0>."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan bila gangguannya berubah terhadap waktu, Aturan Emas Fermi (Fermi's Golden Rule) menghitung laju transisi probabilitas elektron per satuan detik!",
                        narrativeContext = "Kirana menggambar transisi kuantum antara tingkat energi terputus dan keadaan kontinum."
                    )
                ),
                intuitionBody = """
                    Dalam sistem fisika kuantum nyata, Hamiltonan H = H0 + lambda * H' hampir tidak pernah memiliki solusi eksak analitik tertutup. Teory Perturbasi memberikan aproksimasi sistematis melalui deret pangkat parameter gangguan lambda.
                    
                    1. Perturbasi Bebas Waktu Non-Degenerasi:
                       - Koreksi energi orde satu: E_n^(1) = <psi_n^(0) | H' | psi_n^(0)>.
                       - Koreksi fungsi gelombang orde satu: |psi_n^(1)> = sum_{m != n} [ <psi_m^(0) | H' | psi_n^(0)> / (E_n^(0) - E_m^(0)) ] |psi_m^(0)>.
                       - Koreksi energi orde dua: E_n^(2) = sum_{m != n} |<psi_m^(0) | H' | psi_n^(0)>|^2 / (E_n^(0) - E_m^(0)).
                       
                    2. Perturbasi Terdegenerasi & Pembelahan Spektral:
                       Bila beberapa keadaan memiliki energi dasar yang sama, matriks perturbasi W_ij = <i|H'|j> didiagonalkan dalam subruang degenerat.
                       - Efek Stark: Terbelahnya tingkat energi akibat medan listrik eksternal statis.
                       - Efek Zeeman: Terbelahnya tingkat energi akibat interaksi medan magnet dengan momen dipol magnetik spin dan orbital (H' = -mu . B).
                       
                    3. Perturbasi Bergantung Waktu & Aturan Emas Fermi:
                       Untuk gangguan periodik V(t) = V0 * e^(i*omega*t), laju transisi kuantum per satuan waktu w_i->f dirumuskan oleh Aturan Emas Fermi:
                       Gamma = (2*pi / hbar) * |<f | V0 | i>|^2 * rho(E_f), di mana rho(E_f) adalah kerapatan keadaan akhir.
                       
                    4. Teori Hamburan Kuantum:
                       Analisis gelombang terhambur pada jarak jauh f(theta, phi). Aproksimasi Born berlaku untuk potensial hamburan lemah berenergi tinggi, sedangkan metode pergeseran fase gelombang parsial (partial wave phase shifts delta_l) digunakan untuk energi rendah.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Koreksi energi orde satu hanyalah nilai ekspektasi operator gangguan H' pada keadaan dasar yang tidak terganggu.",
                    "Keadaan degenerasi terpecah ketika operator gangguan membedakan orientasi simetri spasial atau spin elektron.",
                    "Aturan Emas Fermi menjelaskan mekanisme fundamental emisi terstimulasi foton pada laser dan peluruhan nuklir beta.",
                    "Aproksimasi Born menghubungkan amplitudo hamburan kuantum secara langsung dengan transformasi Fourier potensial interaksi V(r)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Koreksi Energi Teori Perturbasi Bebas Waktu",
                        latex = "E_n^{(1)} = \\langle \\psi_n^{(0)} | H' | \\psi_n^{(0)} \\rangle, \\quad E_n^{(2)} = \\sum_{m \\neq n} \\frac{|\\langle \\psi_m^{(0)} | H' | \\psi_n^{(0)} \\rangle|^2}{E_n^{(0)} - E_m^{(0)}}",
                        explanation = "Koreksi orde 1 adalah ekspektasi gangguan, sedangkan koreksi orde 2 mempertimbangkan percampuran dengan seluruh keadaan tereksitasi lainnya."
                    ),
                    FormulaCard(
                        title = "Aturan Emas Fermi (Fermi's Golden Rule)",
                        latex = "\\Gamma_{i \\to f} = \\frac{2\\pi}{\\hbar} |\\langle f | H' | i \\rangle|^2 \\rho(E_f)",
                        explanation = "Laju transisi probabilitas kuantum per satuan waktu sebanding dengan kuadrat elemen matriks transisi dikalikan kerapatan keadaan akhir."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Kalibrasi Jam Atom Sesium Puslit Metrologi BRIN Serpong",
                    scenario = "Standar frekuensi waktu nasional di Indonesia dikelola menggunakan transisi hiperhalus jam atom Sesium-133 pada 9.192.631.770 Hz.",
                    application = "Fisikawan metrologi BRIN harus memperhitungkan Efek Zeeman sekunder dan Efek Stark akibat medan radiasi termal benda hitam lingkungan (blackbody radiation shift). Dengan menghitung koreksi energi orde dua teori perturbasi, pergeseran frekuensi mikro dapat dikompensasi hingga ketelitian 1 detik dalam 100 juta tahun.",
                    impact = "Menjamin sinkronisasi waktu presisi ultra-tinggi untuk jaringan radar pertahanan udara, perbankan finansial, dan navigasi satelit nasional."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Polarisasi & Analog Pembelahan Keadaan Kuantum Menggunakan Tiga Filter Polaroid",
                    objective = "Mengamati pemulihan transmisi intensitas cahaya oleh filter perantara sebagai analog perturbasi percampuran keadaan kuantum.",
                    materials = listOf("3 lembar film polarisator cahaya (atau kacamata hitam polaroid)", "Lampu senter ponsel", "Sensor cahaya ponsel (aplikasi lux meter)"),
                    steps = listOf(
                        "Silangkan dua polaroid pada sudut 90 derajat; amati bahwa transmisi cahaya menjadi nol total (keadaan ortogonal).",
                        "Sisipkan polaroid ketiga di antara keduanya pada sudut 45 derajat.",
                        "Amati fenomena mengejutkan: cahaya kembali tembus dengan intensitas I = I0/8!",
                        "Analisis analogi matriks kuantum proyeksi: penyisipan operator baru merotasi basis keadaan sehingga overlap proyektor tidak lagi nol."
                    ),
                    safetyNote = "Jangan menatap langsung lampu senter berdaya tinggi tanpa penyaring cahaya."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa pada koreksi energi orde dua E_n^(2) penyebutnya selalu berupa selisih (E_n^(0) - E_m^(0))?",
                        options = listOf(
                            "Karena tingkat energi yang berdekatan memberikan kontribusi perturbasi percampuran yang paling dominan",
                            "Karena energi total sistem harus selalu bernilai nol",
                            "Karena medan perturbasi selalu memiliki frekuensi nol",
                            "Karena massa partikel berubah saat berpindah keadaan"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Dalam ekspansi deret perturbasi, semakin dekat selisih energi antara dua tingkat (|E_n - E_m| kecil), semakin besar pengaruh interaksi gangguan H' dalam mencampur kedua fungsi gelombang tersebut.",
                        misconceptionAlert = "Jika E_n^(0) = E_m^(0) (degenerasi), rumus non-degenerasi ini menghasilkan penyebut nol sehingga wajib digunakan teori perturbasi degenerasi."
                    )
                )
            )

            "fis-relativitas-umum-tensor" -> LessonData(
                conceptId = "fis-relativitas-umum-tensor",
                simId = "sim-general-relativity-metric",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, mengapa jam pada satelit navigasi GPS berjalan lebih cepat sekitar 45 mikrodetik per hari dibandingkan jam di permukaan bumi?",
                        narrativeContext = "Dimas mempelajari perbedaan waktu akurasi pelacakan koordinat peta digital di ponselnya."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu adalah bukti nyata Relativitas Umum Einstein, Dimas! Massa bumi melengkungkan ruang-waktu di sekitarnya. Di tempat dengan potensial gravitasi lebih dangkal di orbit, waktu mengalir lebih cepat.",
                        narrativeContext = "Kakek menggambarkan kain ruang-waktu melengkung yang tertekan oleh bola massa bumi."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan John Wheeler merangkumnya dengan puitis: 'Materi memberi tahu ruang-waktu cara melengkung, dan ruang-waktu memberi tahu materi cara bergerak' melalui Persamaan Medan Einstein!",
                        narrativeContext = "Kirana menuliskan tensor Einstein G_{mu nu} = (8*pi*G / c^4) * T_{mu nu}."
                    )
                ),
                intuitionBody = """
                    Teori Relativitas Umum merumuskan gravitasi bukan sebagai gaya tarik menarik Newtonian, melainkan sebagai manifestasi kelengkungan ruang-waktu empat dimensi (pseudo-Riemannian manifold).
                    
                    1. Formulasi Tensor 4-Dimensi Relativitas Khusus:
                       Vektor-4 posisi x^mu = (ct, x, y, z). Interval invarian ds^2 = eta_{mu nu} dx^mu dx^nu, dengan tensor metrik Minkowski eta = diag(-1, +1, +1, +1).
                       Tensor medan elektromagnetik Faraday F^{mu nu} merangkum medan listrik E dan magnet B dalam satu kesatuan tensor antisimetris kovarian.
                       
                    2. Ruang-Waktu Melengkung & Derivatif Kovarian:
                       Derivatif parsial biasa tidak mempertahankan sifat tensor pada koordinat melengkung. Derivatif kovarian memperkenalkan Simbol Christoffel (koneksi afin Gamma^lambda_{mu nu}):
                       nabla_mu V^nu = partial_mu V^nu + Gamma^nu_{mu lambda} V^lambda.
                       
                    3. Tensor Kelengkungan Riemann & Ricci:
                       Kelengkungan ruang-waktu diukur dari ketidaktukaran derivatif kovarian: [nabla_mu, nabla_nu] V^lambda = R^lambda_{sigma mu nu} V^sigma.
                       Kontraksi tensor Riemann menghasilkan Tensor Ricci R_{mu nu} dan Skalar Kelengkungan Ricci R = g^{mu nu} R_{mu nu}.
                       
                    4. Persamaan Medan Einstein (Einstein Field Equations / EFE):
                       G_{mu nu} = R_{mu nu} - 1/2 g_{mu nu} R = (8*pi*G / c^4) T_{mu nu}.
                       Ruas kiri mewakili geometri kelengkungan ruang-waktu, ruas kanan mewakili tensor energi-momentum materi/radiasi.
                       Solusi vakum Schwarzschild di luar massa sferis memprediksi presesi perihelion Merkurius, pembelokan cahaya gravitasi, dan horizon peristiwa lubang hitam pada r_s = 2GM/c^2.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Prinsip Ekuivalensi menyatakan bahwa percepatan inersia lokal tidak dapat dibedakan dari medan gravitasi seragam.",
                    "Benda yang jatuh bebas bergerak di sepanjang lintasan terpendek (geodesik) dalam ruang-waktu yang melengkung.",
                    "Simbol Christoffel merepresentasikan gaya semu inersia dan kelengkungan sistem koordinat lokal.",
                    "Persamaan medan Einstein secara mulus mereduksi kembali menjadi persamaan gravitasi Poisson Newtonian pada batas medan lemah dan kecepatan rendah."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Medan Einstein (EFE)",
                        latex = "G_{\\mu\\nu} \\equiv R_{\\mu\\nu} - \\frac{1}{2} g_{\\mu\\nu} R = \\frac{8\\pi G}{c^4} T_{\\mu\\nu}",
                        explanation = "Menghubungkan tensor kelengkungan ruang-waktu Einstein G_{mu nu} dengan distribusi materi dan energi T_{mu nu}."
                    ),
                    FormulaCard(
                        title = "Metrik Schwarzschild Lubang Hitam",
                        latex = "ds^2 = -\\left(1 - \\frac{2GM}{c^2 r}\\right) c^2 dt^2 + \\left(1 - \\frac{2GM}{c^2 r}\\right)^{-1} dr^2 + r^2 d\\Omega^2",
                        explanation = "Solusi statis bola simetris medan gravitasi luar yang mendefinisikan radius horizon peristiwa Schwarzschild r_s = 2GM/c^2."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Koreksi Relativitas Waktu Satelit Navigasi GNSS di Wilayah Kepulauan Indonesia",
                    scenario = "Sistem navigasi kapal feri antarpulau ASDP Indonesia mengandalkan sinyal konstelasi satelit GNSS untuk menentukan posisi alur pelayaran sempit Selat Sunda.",
                    application = "Satelit berada di ketinggian 20.200 km melaju 14.000 km/jam. Relativitas khusus memperlambat jam satelit sebesar 7 mikrodetik/hari (dilatasi waktu Lorentz), namun kelengkungan gravitasi bumi yang lebih lemah mempercepat jam sebesar 45 mikrodetik/hari (dilatasi gravitasi Schwarzschild). Hasil neto +38 mikrodetik/hari harus dikompensasi pemancar frekuensi satelit; tanpa koreksi ini, galat akumulasi posisi peta bertambah 11 km per hari!",
                    impact = "Memastikan akurasi navigasi kapal feri hingga skala meter, mencegah tabrakan di perairan karang dangkal dan lintasan kapal tanker internasional."
                ),
                homeLab = HomeLabData(
                    title = "Visualisasi Lintasan Geodesik Ruang Melengkung Menggunakan Lembaran Karet Elastis",
                    objective = "Mengamati pembelokan lintasan partikel dan pembentukan orbit mengelilingi massa berat pada lembaran melengkung 2D.",
                    materials = listOf("Kain spandeks elastis atau lembaran karet balon besar", "Baskom atau simpai hula-hoop sebagai rangka penegang", "Bola bowling/besi berat (massa pusat)", "Kelereng kecil (partikel uji)"),
                    steps = listOf(
                        "Bentangkan kain elastis secara tegang pada simpai hula-hoop.",
                        "Letakkan bola besi berat di tengah kain untuk menciptakan lekukan geometri ruang-waktu.",
                        "Gulingkan kelereng lurus melintasi tepi lekukan; amati bagaimana lintasannya berbelok (lensa gravitasi).",
                        "Gulingkan kelereng dengan kecepatan tangensial tertentu hingga kelereng mengorbit bola pusat dalam lintasan elips terpresesi."
                    ),
                    safetyNote = "Pastikan rangka baskom/hula-hoop kokoh agar bola berat tidak jatuh ke lantai."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Jika matahari runtuh menjadi lubang hitam dengan massa yang sama persis, apakah yang akan terjadi pada orbit bumi?",
                        options = listOf(
                            "Orbit bumi tetap stabil tidak berubah, karena metrik gravitasi di luar radius matahari tidak mengalami perubahan massa total M",
                            "Bumi akan seketika tersedot jatuh ke dalam horizon peristiwa lubang hitam",
                            "Bumi akan terlempar keluar dari tata surya menuju ruang hampa antarbintang",
                            "Waktu di bumi akan berhenti mengalir seketika"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Metrik Schwarzschild hanya bergantung pada massa total M. Pada jarak r = 1 AU (150 juta km), potensial gravitasi di luar benda bermassa M adalah identik, sehingga lintasan orbit bumi tetap mengitari massa tersebut seperti sedia kala.",
                        misconceptionAlert = "Banyak yang mengira lubang hitam menyedot segala sesuatu di sekitarnya seperti penyedot debu raksasa, padahal gaya gravitasi luar hanya bergantung pada jarak r dan massa M."
                    )
                )
            )

            "fis-fisika-zat-padat-pita" -> LessonData(
                conceptId = "fis-fisika-zat-padat-pita",
                simId = "sim-solid-state-band",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, tembaga dan silikon sama-sama padatan kristal atom, tapi mengapa tembaga bisa menghantarkan listrik miliaran kali lebih baik daripada silikon?",
                        narrativeContext = "Dimas memegang kabel tembaga dan sebuah chip semikonduktor prosesor komputer."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Perbedaan itu ditentukan oleh Struktur Pita Energi Elektron! Teorema Felix Bloch membuktikan bahwa elektron di dalam potensial kisi kristal periodik membentuk pita valensi dan pita konduksi.",
                        narrativeContext = "Kakek menggambarkan diagram pita energi logam, semikonduktor celah sempit, dan isolator celah lebar."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan getaran elastis kisi kristal itu sendiri terkuantisasi menjadi partikel kuasi yang disebut Fonon, yang pada suhu kriogenik memediasi pasangan Cooper superkonduktor!",
                        narrativeContext = "Kirana memperlihatkan efek levitasi magnetik Meissner dari piringan superkonduktor YBCO."
                    )
                ),
                intuitionBody = """
                    Fisika Zat Padat mempelajari bagaimana keteraturan susunan periodik atom-atom dalam kristal melahirkan sifat elektrik, termal, optik, dan magnetik materi terkondensasi.
                    
                    1. Kisi Kristal & Kisi Resiprokal:
                       Kisi kristal riil didefinisikan oleh vektor translasi R = n1*a1 + n2*a2 + n3*a3.
                       Kisi resiprokal didefinisikan oleh b_i . a_j = 2*pi*delta_ij. Difraksi sinar-X atau elektron memenuhi Hukum Bragg 2d*sin(theta) = n*lambda atau kondisi Laue Delta_k = G.
                       Zona Brillouin Pertama adalah sel Wigner-Seitz dari kisi resiprokal.
                       
                    2. Kuantisasi Getaran Kisi (Fonon):
                       Gelombang getaran elastis kisi terkuantisasi menjadi fonon dengan energi hbar*omega(k).
                       - Cabang Akustik: Frekuensi omega -> 0 saat k -> 0 (rambatan suara).
                       - Cabang Optik: Frekuensi terpisah oleh celah pada k=0 (gerak berlawanan ion positif dan negatif).
                       - Model Kapasitas Kalor Debye: Menjelaskan ketergantungan kapasitas kalor C_V ~ T^3 pada temperatur rendah ekstrem.
                       
                    3. Teorema Bloch & Teori Pita Energi:
                       Fungsi gelombang elektron dalam potensial periodik V(r + R) = V(r) memenuhi:
                       psi_{n,k}(r) = e^(i*k.r) * u_{n,k}(r), di mana u_{n,k} periodik terhadap kisi.
                       - Logam: Pita konduksi terisi sebagian atau tumpang tindih dengan pita valensi (energi Fermi E_F berada di dalam pita).
                       - Semikonduktor: Celah pita (bandgap E_g) kecil (< 3 eV) sehingga eksitasi termal dapat melompatkan elektron ke pita konduksi.
                       - Isolator: Celah pita sangat lebar (> 5 eV).
                       
                    4. Superkonduktivitas & Efek Meissner:
                       Di bawah temperatur kritis T_c, hambatan listrik drop seketika menjadi nol total dan medan magnet internal ditolak sempurna dari dalam bahan (efek Meissner diamagnetik sempurna, B = 0).
                       Teori BCS menjelaskan bahwa interaksi tarik-menarik elektron melalui pertukaran fonon kisi membentuk Pasangan Cooper (boson) yang mengalami kondensasi kuantum makroskopis.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Kisi resiprokal adalah transformasi Fourier dari kisi kristal nyata, menjadi ruang kerja alami untuk difraksi dan vektor gelombang elektron.",
                    "Teorema Bloch membuktikan bahwa elektron tidak bertumbukan dengan atom kisi periodik sempurna, melainkan merambat bebas sebagai gelombang modulasi.",
                    "Celah pita energi (bandgap) muncul akibat interferensi destruktif gelombang elektron Bragg pada batas Zona Brillouin.",
                    "Efek Meissner membuktikan bahwa superkonduktor bukan sekadar konduktor sempurna, melainkan fase termodinamika kuantum yang baru."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Teorema Bloch",
                        latex = "\\psi_{n,\\mathbf{k}}(\\mathbf{r}) = e^{i\\mathbf{k}\\cdot\\mathbf{r}} u_{n,\\mathbf{k}}(\\mathbf{r}), \\quad u_{n,\\mathbf{k}}(\\mathbf{r} + \\mathbf{R}) = u_{n,\\mathbf{k}}(\\mathbf{r})",
                        explanation = "Fungsi keadaan elektron dalam kisi periodik adalah gelombang datar termodulasi oleh fungsi periodik kisi u(r)."
                    ),
                    FormulaCard(
                        title = "Hukum T^3 Debye untuk Kapasitas Kalor Kisi",
                        latex = "C_V = \\frac{12\\pi^4}{5} N k_B \\left( \\frac{T}{\\Theta_D} \\right)^3 \\quad (T \\ll \\Theta_D)",
                        explanation = "Pada temperatur mendekati nol mutlak, kapasitas kalor zat padat didominasi oleh eksitasi fonon akustik 3D sebanding dengan T kubik."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Rekayasa Celah Pita Sel Surya Silikon Monokristalin Industri Batam",
                    scenario = "Pabrik modul fotovoltaik di Batam memproduksi wafer silikon surya monokristalin efisiensi tinggi untuk pasar energi terbarukan ASEAN.",
                    application = "Insinyur material mengendalikan tingkat doping boron (tipe-p) dan fosfor (tipe-n) untuk merekayasa celah pita silikon tak langsung (indirect bandgap E_g = 1.12 eV). Dengan menumbuhkan lapisan passivasi nanometer silikon oksida/nitrida pada permukaan, rekombinasi elektron-hole akibat cacat kisi diminimalkan sehingga efisiensi konversi mencapai 23.5%.",
                    impact = "Mendukung transisi energi surya nasional dan kemandirian rantai pasok komponen fotovoltaik berstandar global."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Karakteristik Koefisien Suhu Hambatan Logam vs Termistor Semikonduktor",
                    objective = "Membandingkan koefisien temperatur hambatan positif (PTC pada logam) dengan koefisien negatif (NTC pada semikonduktor).",
                    materials = listOf("Multimeter digital pengukur hambatan Ohm", "Kawat tembaga tipis gulungan", "Satu buah termistor NTC (tersedia di toko elektronik murah)", "Secangkir air hangat dan air es"),
                    steps = listOf(
                        "Ukur hambatan kawat tembaga pada suhu ruang, lalu celupkan ke dalam air hangat; amati hambatan bertambah sedikit (PTC akibat hamburan fonon meningkat).",
                        "Ukur hambatan termistor NTC pada suhu ruang, lalu celupkan ke air hangat; amati hambatan justru turun drastis (NTC akibat eksitasi elektron melompati celah pita bandgap).",
                        "Plot grafik hambatan R terhadap suhu T untuk kedua bahan.",
                        "Diskusikan mengapa kenaikan suhu menghasilkan efek berlawanan pada logam dan semikonduktor berdasarkan teori pita energi."
                    ),
                    safetyNote = "Pastikan air tidak membasahi multimeter digital saat melakukan pengukuran."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa superkonduktor berbeda dari konduktor sempurna biasa saat didinginkan melewati temperatur kritis Tc di dalam medan magnet luar?",
                        options = listOf(
                            "Superkonduktor secara aktif menolak medan magnet keluar dari tubuhnya (Efek Meissner), sedangkan konduktor sempurna hanya memerangkap fluks magnet yang sudah ada di dalamnya",
                            "Superkonduktor berubah warna menjadi putih berkilau",
                            "Superkonduktor memancarkan radiasi sinar gamma berenergi tinggi",
                            "Hambatan listrik superkonduktor meningkat menjadi tak hingga"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Konduktor hipotetis sempurna hanya mempertahankan fluks magnet konstan (dPhi/dt = 0). Sebaliknya, superkonduktor selalu menolak medan magnet internal (B = 0) terlepas dari apakah medan diterapkan sebelum atau sesudah pendinginan, membuktikan transisi fase termodinamika sejati.",
                        misconceptionAlert = "Banyak yang mengira efek Meissner hanya konsekuensi hukum Faraday dPhi/dt=0, padahal itu adalah sifat diamagnetik kesetimbangan termodinamika."
                    )
                )
            )

            "fis-fisika-atom-molekul-hartree" -> LessonData(
                conceptId = "fis-fisika-atom-molekul-hartree",
                simId = "sim-hartree-fock-atoms",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, di atom hidrogen kita hanya punya satu elektron. Tapi pada atom karbon atau besi dengan puluhan elektron yang saling tolak-menolak, bagaimana kita menghitung fungsi gelombangnya?",
                        narrativeContext = "Dimas menunjuk tabel periodik unsur dengan konfigurasi elektron yang bertumpuk."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Fisikawan menggunakan metode medan swakonsisten Hartree-Fock! Tiap elektron diasumsikan bergerak dalam potensial rata-rata yang dihasilkan oleh inti atom dan awan seluruh elektron lainnya.",
                        narrativeContext = "Kakek menuliskan determinan Slater fungsi gelombang fermionik antisimetris."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk molekul, pendekatan Born-Oppenheimer memisahkan gerak inti yang lambat dari gerak elektron yang cepat, melahirkan spektrum vibrasi dan rotasi spektroskopi!",
                        narrativeContext = "Kirana memperlihatkan pita serapan inframerah spektrofotometer FTIR."
                    )
                ),
                intuitionBody = """
                    Fisika atom dan molekul berelektron banyak mengkaji interaksi Coulomb multi-benda, simetri pertukaran Pauli, dan dinamika rotasi-vibrasi ikatan kimia.
                    
                    1. Metode Medan Swakonsisten Hartree-Fock (Self-Consistent Field / SCF):
                       Fungsi gelombang N-elektron dibangun sebagai Determinan Slater tunggal untuk menjamin prinsip eksklusi Pauli (antisimetri terhadap pertukaran koordinat dua elektron).
                       Persamaan Hartree-Fock mengurai interaksi menjadi:
                       - Operator Coulomb langsung J_j (tolakan muatan rata-rata elektron).
                       - Operator pertukaran K_j (interaksi pertukaran non-lokal murni mekanika kuantum).
                       Solusi diperoleh secara iteratif berulang hingga medan potensial konvergen swakonsisten.
                       
                    2. Kopling Momentum Sudut Atomik:
                       - Kopling Russell-Saunders (L-S coupling): Dominan untuk atom ringan (Z rendah), L = sum l_i, S = sum s_i, J = L + S. Simbol suku atomik: ^(2S+1)L_J.
                       - Aturan Hund: Menentukan keadaan dasar multi-elektron (maksimalkan S, lalu maksimalkan L, lalu pilih J minimum/maksimum berdasarkan keterisian subkulit).
                       - Kopling j-j: Dominan untuk atom berat (Z tinggi), di mana interaksi spin-orbit elektron individual j_i = l_i + s_i lebih kuat daripada tolakan residual elektrostatik.
                       
                    3. Aproksimasi Born-Oppenheimer:
                       Karena massa proton/neutron inti ~1836 kali lebih berat dari elektron, elektron bergerak jauh lebih cepat. Posisi inti dianggap diam seketika (fixed nuclei), sehingga fungsi gelombang total terfaktorisasi:
                       Psi_total = psi_elektronik(r; R) * phi_nuklir(R).
                       
                    4. Spektroskopi Molekuler (Rotasi & Vibrasi):
                       - Spektrum Rotasi Murni: E_rot = B * J(J + 1), aktif pada gelombang mikro untuk molekul dengan dipol permanen.
                       - Spektrum Vibrasi: Osilator harmonik terkuantisasi E_vib = (v + 1/2)*hbar*omega, aktif pada inframerah (IR). Kurva potensial Morse memperhitungkan disosiasi ikatan pada tingkat vibrasi tinggi.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Determinan Slater secara otomatis memenuhi prinsip larangan Pauli bahwa dua elektron tidak boleh memiliki keempat bilangan kuantum yang sama.",
                    "Energi pertukaran (exchange energy) menurunkan energi total atom ketika spin elektron paralel (Aturan Hund Pertama).",
                    "Aproksimasi Born-Oppenheimer adalah fondasi mutlak yang memungkinkan konsep 'bentuk molekul' dan 'panjang ikatan' ada secara fisis.",
                    "Tingkat energi rotasi berjarak jauh lebih rapat daripada tingkat energi vibrasi, yang pada gilirannya jauh lebih rapat daripada tingkat elektronik."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Hartree-Fock",
                        latex = "\\hat{F} |\\chi_i\\rangle = \\epsilon_i |\\chi_i\\rangle, \\quad \\hat{F} = \\hat{h}_1 + \\sum_{j=1}^N (\\hat{J}_j - \\hat{K}_j)",
                        explanation = "Operator Fock F memadukan energi kinetik elektron tunggal, tarikan inti h1, tolakan langsung Coulomb J, dan interaksi pertukaran Pauli K."
                    ),
                    FormulaCard(
                        title = "Tingkat Energi Vibrasi-Rotasi Molekul Diatomik",
                        latex = "E(v, J) = \\hbar\\omega\\left(v + \\frac{1}{2}\\right) + B J(J+1) - D_e [J(J+1)]^2",
                        explanation = "Energi molekul merupakan gabungan getaran harmonik terkuantisasi v dan rotasi kaku benda tegar J dengan koreksi distorsi sentrifugal."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Deteksi Gas Rumah Kaca Metana dan CO2 dengan Spektroskopi Laser Sensor BRIN",
                    scenario = "Lahan gambut tropis di Riau dan Kalimantan melepaskan fluktuasi gas metana (CH4) dan karbon dioksida (CO2) yang harus dipantau emisi karbonnya.",
                    application = "Peneliti fisika laser BRIN menggunakan spektroskopi serapan laser dioda tertunai (TDLAS) pada daerah inframerah gelombang pendek (1.65 mikrometer). Garis serapan rotasi-vibrasi transisi kuantum khas molekul metana dipindai dengan resolusi ultra-sempit, mendeteksi konsentrasi gas hingga fraksi bagian per miliar (ppb) tanpa terganggu oleh uap air.",
                    impact = "Menyediakan data ilmiah akurat bagi perdagangan karbon internasional dan mitigasi kebakaran hutan lahan gambut Indonesia."
                ),
                homeLab = HomeLabData(
                    title = "Analisis Garis Spektrum Emisi Tabung Fluoresen Lampu Rumah Menggunakan Spektroskop CD",
                    objective = "Mengamati spektrum garis atomik diskrit dari uap merkuri (Hg) pada lampu hemat energi.",
                    materials = listOf("Kepingan keping CD/DVD bekas (kisi difraksi transmisi/refleksi)", "Kotak kardus bekas kecil", "Pisau cutter dan selotip", "Lampu neon / CFL rumah"),
                    steps = listOf(
                        "Kupas lapisan logam tipis keping CD dengan selotip untuk memperoleh kisi plastik transparan bergaris mikro.",
                        "Buat celah sempit (slit selebar 0.5 mm) pada salah satu sisi kotak kardus, pasang potongan kisi CD pada sisi berlawanan sebagai jendela intip.",
                        "Arahkan celah ke lampu tabung fluoresen kamar.",
                        "Amati garis-garis emisi terang diskrit (garis hijau 546 nm, biru 436 nm, dan violet 405 nm uap raksa Hg) yang terpisah tegas di atas pendaran fosfor kontinu."
                    ),
                    safetyNote = "Hati-hati saat menggunakan pisau cutter untuk mengupas keping CD."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Berdasarkan Aturan Hund, mengapa konfigurasi elektron dengan spin total S maksimum selalu memiliki energi yang lebih rendah pada atom berelektron banyak?",
                        options = listOf(
                            "Karena elektron dengan spin sejajar memiliki fungsi gelombang koordinat ruang antisimetris, menjauhkan jarak antar elektron dan mengurangi energi tolakan Coulomb langsung (energi pertukaran)",
                            "Karena spin sejajar menarik elektron lebih dekat ke inti atom",
                            "Karena medan magnet spin saling meniadakan secara gravitasi",
                            "Karena elektron dengan spin sejajar berputar lebih lambat mengelilingi inti"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Prinsip Pauli menuntut fungsi gelombang total berkarakter antisimetris. Jika bagian spin simetris (spin sejajar S maksimum), bagian ruang harus antisimetris. Ini berarti probabilitas menemukan dua elektron di posisi yang sama bernilai nol (Pauli hole), memperkecil tolakan elektrostatik rata-rata.",
                        misconceptionAlert = "Banyak yang mengira Aturan Hund disebabkan gaya tarik magnet antar spin, padahal murni efek elektrostatik akibat simetri pertukaran mekanika kuantum."
                    )
                )
            )

            "fis-fisika-inti-partikel-standar" -> LessonData(
                conceptId = "fis-fisika-inti-partikel-standar",
                simId = "sim-nuclear-standard-model",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, di dalam inti atom helium ada dua proton bermuatan positif yang berjarak sangat dekat. Mengapa gaya tolak Coulomb yang luar biasa kuat itu tidak meledakkan inti atom?",
                        narrativeContext = "Dimas memikirkan kerapatan materi nuklir yang mencapai ratusan juta ton per sentimeter kubik."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena ada Gaya Nuklir Kuat, Dimas! Diperantarai oleh gluon antar-quark dan meson pi antar-nukleon, gaya ini jauh lebih kuat daripada gaya elektrostatik pada jarak sub-femtometer.",
                        narrativeContext = "Kakek menggambarkan struktur quark proton (uud) dan neutron (udd) yang terikat rapat."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan seluruh blok pembangun alam semesta dirangkum dalam Model Standar: 6 quark, 6 lepton, dan boson pengantara gaya terunifikasi dengan mekanisme Higgs yang memberi mereka massa!",
                        narrativeContext = "Kirana memperlihatkan bagan berkala partikel elementer fisika modern."
                    )
                ),
                intuitionBody = """
                    Fisika inti dan fisika partikel menjelajahi struktur materi pada skala subatomik (10^(-15) m hingga 10^(-18) m) serta interaksi fundamental yang mengaturnya.
                    
                    1. Sifat Inti & Model Massa Semi-Empiris Weizsäcker (Bethe-Weizsäcker):
                       Energi ikat inti B(A, Z) dimodelkan sebagai tetesan cairan bermuatan (Liquid Drop Model):
                       B = a_V*A - a_S*A^(2/3) - a_C*Z(Z-1)/A^(1/3) - a_A*(A - 2Z)^2/A +- delta(A, Z).
                       - Suku volume a_V*A (interaksi saturasi nuklir kuat).
                       - Suku permukaan -a_S*A^(2/3) (nukleon di tepi permukaan memiliki tetangga lebih sedikit).
                       - Suku Coulomb -a_C (tolakan elektrostatik proton).
                       - Suku asimetri (prinsip eksklusi Pauli memfavoritkan N = Z).
                       - Suku perpasangan delta (nukleon berpasangan genap-genap lebih stabil).
                       
                    2. Model Kulit Inti & Bilangan Magis:
                       Inti dengan jumlah proton atau neutron 2, 8, 20, 28, 50, 82, 126 memiliki kestabilan luar biasa (bilangan magis). Model ini dijelaskan oleh potensial osilator harmonik tereduksi dengan kopling spin-orbit kuat (L . S coupling nuklir Maria Goeppert Mayer).
                       
                    3. Model Partikel Standar (The Standard Model):
                       - Materi Fermion (spin 1/2):
                         * 6 Quark: Up, Down, Charm, Strange, Top, Bottom (memiliki muatan warna SU(3)_c).
                         * 6 Lepton: Elektron, Muon, Tau, beserta 3 neutrino terkait (e_nu, mu_nu, tau_nu).
                       - Boson Tera Pengantara Gaya (spin 1):
                         * Foton (Elektromagnetik U(1)_Y).
                         * Boson W+, W-, Z0 (Gaya Lemah SU(2)_L, memediasi peluruhan beta).
                         * 8 Gluon (Gaya Kuat SU(3)_C, kurungan warna kuantum).
                       - Boson Skalar Higgs (spin 0): Memecah simetri elektrolemah secara spontan (SSB) dan memberikan massa inersia pada boson W/Z dan materi fermion melalui interaksi Yukawa.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Kurva energi ikat per nukleon memuncak pada Besi-56 dan Nikel-62, menjelaskan mengapa fusi melepaskan energi untuk inti ringan dan fisi melepaskan energi untuk inti berat.",
                    "Kopling spin-orbit nuklir memiliki tanda terbalik dibandingkan atomik, membelah tingkat energi dan melahirkan bilangan magis stabilitas nuklir.",
                    "Quark tidak pernah dapat diisolasi secara tunggal di alam akibat fenomena kurungan warna (color confinement) gaya kuat kromodinamika.",
                    "Simetri diskrit CPT (Charge, Parity, Time Reversal) adalah simetri mutlak yang tak terlanggar dalam seluruh teori medan kuantum relativistik."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Rumus Massa Semi-Empiris Weizsäcker",
                        latex = "B(A, Z) = a_V A - a_S A^{2/3} - a_C \\frac{Z(Z-1)}{A^{1/3}} - a_A \\frac{(A - 2Z)^2}{A} + \\delta(A, Z)",
                        explanation = "Model tetes cairan inti atom yang memprediksi energi ikat inti nuklir secara makroskopis presisi tinggi."
                    ),
                    FormulaCard(
                        title = "Kovarian Interaksi Arus Lemah Peluruhan Beta",
                        latex = "n \\to p + e^- + \\bar{\\nu}_e, \\quad d \\to u + W^- \\to u + e^- + \\bar{\\nu}_e",
                        explanation = "Gaya lemah mengubah flavor quark down menjadi quark up melalui perantaraan boson W- berenergi tinggi."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Operasional Reaktor Riset Nuklir Serpong RSG-GAS BATAN/BRIN",
                    scenario = "Reaktor Riset Serba Guna G.A. Siwabessy (RSG-GAS) berdaya 30 MW di Kawasan Sains Puspiptek Serpong memproduksi radioisotop medis untuk rumah sakit nasional.",
                    application = "Fisikawan nuklir BRIN menghitung fraksi neutron kasip (delayed neutrons beta_eff), koefisien reaktivitas suhu bahan bakar U3Si2-Al, dan fluks neutron termal menggunakan model difusi neutron multi-kelompok. Hal ini menjamin reaktor beroperasi subkritis terkendali pada keadaan tunak dan menghasilkan radioisotop Molibdenum-99 / Teknesium-99m untuk deteksi kanker.",
                    impact = "Menjamin pasokan radiofarmaka diagnosis tomografi bagi ribuan pasien kanker di rumah sakit seluruh Indonesia setiap pekannya."
                ),
                homeLab = HomeLabData(
                    title = "Pembuatan Kamar Kabut Difusi (Diffusion Cloud Chamber) Sederhana",
                    objective = "Melihat secara langsung jejak visual partikel radiasi alfa dan sinar kosmik latar belakang.",
                    materials = listOf("Toples kaca bening kedap udara", "Pelat logam dicat hitam untuk dasar toples", "Es kering (dry ice / CO2 padat) sebagai pendingin alas", "Alkohol isopropil murni 99%", "Lampu senter terang"),
                    steps = listOf(
                        "Rendam spons di bagian atas toples dengan alkohol isopropil untuk menciptakan uap jenuh.",
                        "Letakkan toples terbalik dengan pelat logam dasar menempel langsung pada bongkahan es kering.",
                        "Tunggu 10 menit hingga terbentuk lapisan uap alkohol lewat jenuh (supersaturated vapor) di dekat dasar pelat hitam.",
                        "Sorotkan lampu senter horizontal melintasi lapisan uap; matikan lampu ruangan.",
                        "Amati jejak kabut putih tebal pendek (partikel alfa dari radon udara) dan jejak lurus panjang tipis (muon sinar kosmik yang menembus atmosfer)."
                    ),
                    safetyNote = "Gunakan sarung tangan tebal isolator saat menangani es kering untuk mencegah radang dingin (frostbite)."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Partikel manakah di dalam Model Standar yang bertanggung jawab memberikan massa kepada boson pengantara gaya elektrolemah (W dan Z) melalui pemecahan simetri spontan?",
                        options = listOf(
                            "Boson Higgs",
                            "Foton",
                            "Gluon",
                            "Neutrino"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Mekanisme Higgs memperkenalkan medan skalar dengan nilai ekspektasi vakum non-nol yang memecah simetri tera elektrolemah SU(2)xU(1). Boson tera W+, W-, dan Z0 menyerap komponen medan Goldstone dan memperoleh massa longitudinal yang terukur.",
                        misconceptionAlert = "Massa materi biasa (seperti kita) 99% berasal dari energi pengikat gaya kuat dinamis quark-gluon (E=mc^2 QCD), bukan murni dari massa Higgs quark."
                    )
                )
            )

            "fis-astrofisika-kosmologi-friedmann" -> LessonData(
                conceptId = "fis-astrofisika-kosmologi-friedmann",
                simId = "sim-friedmann-cosmology",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, jika alam semesta ini mengembang seperti yang ditemukan Edwin Hubble, apakah gravitasi miliaran galaksi pada akhirnya akan menghentikan ekspansi itu atau alam semesta akan mengembang selamanya?",
                        narrativeContext = "Dimas memandang langit malam berbintang di pedesaan yang cerah."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Nasib akhir kosmos ditentukan oleh Persamaan Friedmann, Dimas! Persamaan ini menurunkan dinamika faktor skala a(t) dari Persamaan Medan Einstein metrik FLRW.",
                        narrativeContext = "Kakek menggambar kurva evolusi alam semesta terbuka, tertutup, dan datar."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan yang paling mencengangkan, pengamatan supernova 1998 membuktikan ekspansi kosmos justru sedang dipercepat oleh Energi Gelap (Konstanta Kosmologis Lambda)!",
                        narrativeContext = "Kirana memperlihatkan diagram komposisi kosmos Lambda-CDM: 68% Energi Gelap, 27% Materi Gelap, dan hanya 5% materi atom biasa."
                    )
                ),
                intuitionBody = """
                    Astrofisika dan kosmologi mempelajari struktur evolusi bintang serta asal-usul, dinamika, dan nasib akhir alam semesta secara keseluruhan.
                    
                    1. Struktur Bintang & Batas Massa Katai Putih (Batas Chandrasekhar):
                       Bintang berada dalam kesetimbangan hidrostatik: dP/dr = -G*M(r)*rho(r) / r^2.
                       Setelah bahan bakar nuklir habis, bintang runtuh gravitasi hingga ditahan oleh Tekanan Degenerasi Elektron fermion kuantum.
                       Bila massa sisa inti melebihi batas Chandrasekhar (~1.44 Massa Matahari), elektron menjadi relativistik ekstrem dan tekanan degenerasi tak lagi mampu menahan gravitasi, meruntuhkannya menjadi Bintang Neutron (batas Tolman-Oppenheimer-Volkoff ~2.2 M_sun) atau Lubang Hitam.
                       
                    2. Geometri Kosmologis Metrik FLRW:
                       Berdasarkan Prinsip Kosmologi (alam semesta homogen dan isotropik pada skala besar), metrik ruang-waktu dirumuskan oleh Friedmann-Lemaître-Robertson-Walker (FLRW):
                       ds^2 = -c^2 dt^2 + a(t)^2 [ dr^2 / (1 - k*r^2) + r^2 dOmega^2 ], di mana k = +1 (tertutup), 0 (datar), atau -1 (terbuka).
                       
                    3. Persamaan Friedmann & Parameter Kerapatan:
                       - Persamaan Friedmann Pertama: H^2 = (a_dot / a)^2 = (8*pi*G / 3)*rho - k*c^2 / a^2 + Lambda / 3.
                       - Kerapatan Kritis: rho_crit = 3*H^2 / (8*pi*G).
                       - Parameter kerapatan total Omega_tot = Omega_m + Omega_rad + Omega_Lambda.
                       
                    4. Model Konkordansi Standar (Lambda-CDM):
                       Pengamatan fluktuasi Radiasi Latar Gelombang Mikro Kosmis (Cosmic Microwave Background / CMB) oleh satelit Planck membuktikan bahwa geometri alam semesta datar (Omega_tot = 1.000 +- 0.005), berusia 13.8 miliar tahun, dan mengalami percepatan ekspansi dipicu energi gelap bertekanan negatif P = -rho*c^2.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Batas Chandrasekhar adalah konsekuensi langsung dari gabungan mekanika kuantum relativistik dan tarikan gravitasi newtonian.",
                    "Ekspansi alam semesta bukanlah galaksi-galaksi yang bergerak menembus ruang hampa yang diam, melainkan kain ruang-waktu itu sendiri yang meregang seiring faktor skala a(t).",
                    "Pergeseran merah kosmologis z membuktikan bahwa panjang gelombang foton ikut teregang secara langsung sebanding dengan pertambahan skala kosmos: 1 + z = a_sekarang / a_emisi.",
                    "Energi gelap memiliki persamaan keadaan w = -1, menghasilkan gravitasi repulsif tolak-menolak yang mempercepat laju pemuaian alam semesta."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Friedmann Pertama",
                        latex = "H^2 \\equiv \\left(\\frac{\\dot{a}}{a}\\right)^2 = \\frac{8\\pi G}{3}\\rho - \\frac{k c^2}{a^2} + \\frac{\\Lambda c^2}{3}",
                        explanation = "Menghubungkan parameter laju ekspansi Hubble H dengan kerapatan massa-energi total rho, kelengkungan spasial k, dan konstanta kosmologis Lambda."
                    ),
                    FormulaCard(
                        title = "Batas Massa Katai Putih Chandrasekhar",
                        latex = "M_{\\mathrm{Ch}} \\approx \\frac{\\omega_3^0 \\sqrt{3\\pi}}{2} \\left( \\frac{\\hbar c}{G} \\right)^{3/2} \\left( \\frac{1}{\\mu_e m_u} \\right)^2 \\approx 1.44 M_\\odot",
                        explanation = "Batas massa maksimum teoritis yang dapat ditopang oleh tekanan degenerasi elektron relativistik sebelum runtuh total."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Observatorium Nasional Timau NTT untuk Pengamatan Survei Kosmologi Langit Selatan",
                    scenario = "Pemerintah Indonesia melalui BRIN membangun Observatorium Nasional Timau di Kabupaten Kupang, Nusa Tenggara Timur, dengan teleskop optik cermin 3.8 meter.",
                    application = "Lokasi Timau yang memiliki tingkat kegelapan langit malam terbaik dan langit kering bebas awan 70% per tahun dipilih untuk survei fotometri supernova tipe Ia dan pemetaan galaksi ekuator selatan. Data spektrum pergeseran merah Doppler-Hubble dikorelasikan dengan persamaan Friedmann untuk menguji variasi konstanta kosmologis energi gelap di belahan bumi selatan.",
                    impact = "Menempatkan Indonesia di garis depan riset astronomi dan astrofisika observasional dunia di kawasan khatulistiwa."
                ),
                homeLab = HomeLabData(
                    title = "Analogi Model Balon Bertitik untuk Ekspansi Kosmologis dan Hukum Hubble",
                    objective = "Memvisualisasikan bagaimana pemuaian permukaan homogen menghasilkan hukum kecepatan resesi berbanding lurus dengan jarak (v = H0 * d).",
                    materials = listOf("Satu buah balon tiup karet besar", "Spidol permanen", "Pita ukur fleksibel atau benang dan penggaris"),
                    steps = listOf(
                        "Tiup balon hingga berukuran sedang, ikat simpul sementara.",
                        "Gambar 5 titik di permukaan balon, beri label galaksi A, B, C, D, E.",
                        "Ukur jarak antara galaksi A ke setiap galaksi lainnya menggunakan pita ukur.",
                        "Tiup balon lebih besar (merepresentasikan pemuaian faktor skala kosmos a(t)).",
                        "Ukur kembali jarak dari titik A ke galaksi-galaksi lainnya; hitung pertambahan jarak Delta_d per unit waktu.",
                        "Buktikan bahwa galaksi yang awalnya berjarak dua kali lebih jauh dari A mengalami pertambahan jarak dua kali lebih besar (Hukum Hubble v ~ d)."
                    ),
                    safetyNote = "Jangan meniup balon melewati batas elastisitasnya agar tidak meletus mendadak."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah yang menyebabkan laju ekspansi alam semesta saat ini teramati mengalami percepatan (accelerating expansion)?",
                        options = listOf(
                            "Energi Gelap (Dark Energy) yang memiliki tekanan negatif dan kerapatan energi konstan persatuan volume ruang",
                            "Materi Gelap yang bertabrakan dengan materi biasa",
                            "Gaya tarik gravitasi dari lubang hitam supermasif di pusat galaksi",
                            "Ledakan supernova yang memancarkan angin bintang raksasa"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Berdasarkan persamaan percepatan Friedmann (a_ddot / a = -4piG/3 * (rho + 3P/c^2)), jika fluida materi memiliki persamaan keadaan P = -rho*c^2 (seperti Energi Gelap), maka suku (rho + 3P/c^2) = -2rho < 0, yang mengubah perlambatan gravitasi menjadi percepatan repulsif positif.",
                        misconceptionAlert = "Materi gelap (Dark Matter) memiliki gravitasi tarik menarik yang memperlambat ekspansi; yang mempercepat ekspansi adalah Energi Gelap (Dark Energy)."
                    )
                )
            )

            "fis-fisika-plasma-mhd" -> LessonData(
                conceptId = "fis-fisika-plasma-mhd",
                simId = "sim-plasma-mhd-tokamak",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, di dalam reaktor fusi nuklir Tokamak atau di mahkota matahari, gas dipanaskan hingga puluhan juta derajat Celsius. Mengapa gas tersebut tidak bisa lagi diperlakukan sebagai gas ideal biasa?",
                        narrativeContext = "Dimas melihat video semburan lidah api korona matahari dan reaktor fusi magnetik."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena gas itu telah bertransformasi menjadi Wujud Materi Keempat: Plasma! Elektron telah terlepas dari intinya, menghasilkan fluida ionik bermuatan yang berinteraksi secara kolektif dengan medan elektromagnetik.",
                        narrativeContext = "Kakek menggambarkan perisai Debye dan osilasi frekuensi plasma omega_p."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan dinamikanya dijelaskan oleh Magnetohidrodinamika (MHD), di mana garis medan magnet 'membeku' di dalam fluida plasma konduktif ideal dan merambatkan Gelombang Alfvén!",
                        narrativeContext = "Kirana menunjukkan kurungan medan magnetik heliks berbentuk donat (torus) pada reaktor Tokamak."
                    )
                ),
                intuitionBody = """
                    Fisika Plasma mempelajari gas terionisasi yang menunjukkan perilaku kolektif akibat interaksi gaya Coulomb jarak jauh antara ion positif dan elektron bebas.
                    
                    1. Kriteria Fundamental Plasma:
                       - Perisai Debye: Muatan uji di dalam plasma dinetralkan secara eksponensial dalam radius panjang Debye lambda_D = sqrt(epsilon_0 * k_B * T_e / (n_e * e^2)).
                       - Parameter Plasma N_D: Jumlah partikel di dalam bola Debye harus sangat besar (N_D = (4/3)*pi*n_e*lambda_D^3 >> 1), menjamin interaksi kolektif mendominasi tumbukan biner individual.
                       - Kuasi-netralitas: Pada skala panjang L >> lambda_D, kerapatan muatan neto mendekati nol (n_e ~ n_i).
                       - Osilasi Frekuensi Plasma: Elektron berosilasi menanggapi gangguan muatan dengan frekuensi alami omega_pe = sqrt(n_e * e^2 / (m_e * epsilon_0)).
                       
                    2. Gerak Partikel Tunggal & Hanyutan Medan (Drifts):
                       Partikel bermuatan melingkar mengelilingi garis medan magnet B dengan frekuensi siklotron omega_c = qB/m dan jari-jari Larmor r_L = v_perp / omega_c.
                       Bila terdapat medan luar tambahan:
                       - Hanyutan E x B: v_E = (E x B) / B^2 (arah hanyutan independen dari muatan partikel q).
                       - Hanyutan Gradien Medan (grad-B drift) dan Hanyutan Kelengkungan (curvature drift): memicu pemisahan muatan ion dan elektron.
                       
                    3. Teori Magnetohidrodinamika (MHD):
                       Mengkombinasikan persamaan mekanika fluida Navier-Stokes dengan Persamaan Maxwell:
                       rho * (dv/dt) = -nabla(P) + J x B + rho * g.
                       Persamaan Induksi Magnetik: partial(B)/partial(t) = curl(v x B) + eta/(mu_0) * nabla^2(B).
                       Teorema Alfvén (Flux Freezing): Dalam plasma konduktor ideal (hambatan jenis eta -> 0), garis-garis gaya magnetik 'terbekukan' dan bergerak bersama-sama dengan fluida materi.
                       
                    4. Gelombang Alfvén & Kurungan Fusi Magnetik:
                       - Gelombang Alfvén: Gelombang elastis transversal medan magnetik dengan kecepatan v_A = B / sqrt(mu_0 * rho).
                       - Tokamak: Mengurung plasma fusi D-T pada suhu 150 juta Kelvin menggunakan kombinasi medan magnet toroid (kumparan luar) dan medan poloid (arus plasma internal) untuk mencegah kehilangan partikel akibat hanyutan drift.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Panjang Debye menetapkan batas skala di mana fenomena elektrostatik mikroskopis bertransisi menjadi perilaku kuasi-netral makroskopis.",
                    "Hanyutan E x B menggerakkan ion positif dan elektron ke arah yang sama persis dengan kelajuan yang identik.",
                    "Teorema pembekuan fluks Alfvén membuktikan bahwa materi plasma terikat erat pada garis medan magnet laksana manik-manik pada dawai baja.",
                    "Kriteria Lawson menyatakan bahwa daya fusi bersih tercapai jika hasil kali kerapatan n, suhu T, dan waktu kurungan tau melebihi batas tripel fusi."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Panjang Perisai Debye & Frekuensi Plasma",
                        latex = "\\lambda_D = \\sqrt{\\frac{\\varepsilon_0 k_B T_e}{n_e e^2}}, \\quad \\omega_{pe} = \\sqrt{\\frac{n_e e^2}{m_e \\varepsilon_0}}",
                        explanation = "Dua skala kuantitatif fundamental yang mengkarakterisasi batas spasial perisai muatan dan respons frekuensi alami plasma."
                    ),
                    FormulaCard(
                        title = "Kecepatan Gelombang Alfvén MHD",
                        latex = "v_A = \\frac{B}{\\sqrt{\\mu_0 \\rho}}",
                        explanation = "Kecepatan rambat gelombang tegangan transversal medan magnet fluida plasma konduktif ideal."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Riset Fusi Plasma dan Sistem Pemanas ECRH Reaktor Riset BRIN",
                    scenario = "Pusat Riset Teknologi Akselerator dan Proses Bahan BRIN di Yogyakarta mengoperasikan fasilitas plasma lucutan cincin magnetik.",
                    application = "Peneliti plasma memanfaatkan gelombang elektromagnetik frekuensi resonansi siklotron elektron (ECRH 2.45 GHz) untuk memanaskan plasma gas hidrogen ke kerapatan n_e = 10^18 m^-3. Analisis kestabilan MHD digunakan untuk mengendalikan ketidakstabilan kink dan tearing mode pada batas dinding bejana vakum reaktor.",
                    impact = "Membangun kapasitas riset sumber daya manusia nasional dalam penguasaan sains fusi nuklir masa depan."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Interaksi Api Lilin Konduktif Terionisasi dengan Medan Listrik Statis",
                    objective = "Mengamati sifat kelistrikan nyala api sebagai plasma lemah bertemperatur rendah yang dibelokkan medan listrik.",
                    materials = listOf("Satu buah lilin menyala", "Penggaris plastik atau pipa PVC", "Kain wol untuk menggosok", "Korek api"),
                    steps = listOf(
                        "Nyalakan lilin di tempat yang tenang tanpa hembusan angin.",
                        "Gosok penggaris plastik dengan kain wol kering selama 30 detik untuk mengumpulkan muatan listrik statis negatif yang kuat.",
                        "Dekatkan perlahan ujung penggaris berjarak 2-3 cm dari tepi nyala api lilin (jangan sampai menyentuh api).",
                        "Amati fenomena defleksi: lidah api tertarik dan meliuk ke arah penggaris bermuatan!",
                        "Diskusikan mengapa ion-ion C+ dan radikal bebas di dalam nyala api terionisasi merespons gaya elektrostatik medan luar."
                    ),
                    safetyNote = "Jauhkan bahan mudah terbakar dan lakukan eksperimen dengan pengawasan orang dewasa."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah yang dimaksud dengan Teorema Alfvén (Frozen-in Flux) dalam magnetohidrodinamika plasma ideal?",
                        options = listOf(
                            "Garis-garis medan magnet melekat erat dan bergerak bersama fluida plasma seolah-olah membeku di dalamnya, karena resistivitas listrik plasma bernilai nol",
                            "Suhu plasma seketika turun membeku menjadi es padat saat terkena medan magnet",
                            "Medan magnet plasma lenyap total saat fluida mengalir",
                            "Kecepatan suara di dalam plasma menjadi bernilai nol"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Dalam limit MHD ideal (resistivitas eta -> 0), persamaan induksi mereduksi menjadi partial(B)/partial(t) = curl(v x B). Hal ini secara matematis mengimplikasikan bahwa fluks magnetik yang menembus sembarang kontur tertutup yang bergerak bersama fluida plasma bersifat invarian kekal.",
                        misconceptionAlert = "Teorema ini runtuh bila terjadi rekoneksi magnetik (magnetic reconnection), di mana resistivitas kecil memutus dan menyambung ulang garis medan magnet sambil melepaskan energi raksasa."
                    )
                )
            )

            else -> null
        }
    }
}

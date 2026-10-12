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

object ChemistryLevel5Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "kim-organik-stereokimia-cip",
            domain = Domain.KIMIA,
            topic = "Kimia Organik",
            title = "Stereokimia & Konfigurasi Mutlak Cahn-Ingold-Prelog (R/S)",
            description = "Kiralitas molekuler, tata nama stereoisomer Cahn-Ingold-Prelog (R/S), enantiomer, diastereomer, pemutaran cahaya terpolarisasi, dan konformasi kursi sikloheksana.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("kim-senyawa-karbon-sma")
        ),
        ConceptItem(
            id = "kim-organik-mekanisme-sn-e",
            domain = Domain.KIMIA,
            topic = "Kimia Organik",
            title = "Mekanisme Reaksi Organik: Substitusi (SN1/SN2) & Eliminasi (E1/E2)",
            description = "Kinetika dan stereokimia substitusi nukleofilik SN1 (karbokation) vs SN2 (inversi Walden), kompetisi eliminasi E1 vs E2, aturan selektivitas Zaitsev dan Hofmann.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("kim-organik-stereokimia-cip")
        ),
        ConceptItem(
            id = "kim-organik-spektroskopi-nmr-ir",
            domain = Domain.KIMIA,
            topic = "Kimia Organik",
            title = "Spektroskopi Organik: FT-IR, ¹H/¹³C-NMR & Spektrometri Massa",
            description = "Identifikasi getaran gugus fungsi FT-IR, resonansi magnetik inti ¹H dan ¹³C NMR (pergeseran kimia, integrasi, pemecahan kopling spin J), dan elusidasi struktur molekul.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("kim-organik-mekanisme-sn-e")
        ),
        ConceptItem(
            id = "kim-organik-sintesis-retrosintesis",
            domain = Domain.KIMIA,
            topic = "Kimia Organik",
            title = "Strategi Sintesis Organik, Retrosintesis & Reaksi Perisiklik",
            description = "Analisis retrosintesis diskoneksi sinton, gugus pelindung kimiawi, pembentukan ikatan C-C (enolat, reaksi Wittig, adisi Michael), dan reaksi sikloadisi Diels-Alder.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("kim-organik-spektroskopi-nmr-ir")
        ),
        ConceptItem(
            id = "kim-anorganik-medan-ligan-tanabe",
            domain = Domain.KIMIA,
            topic = "Kimia Anorganik",
            title = "Teori Medan Ligan (LFT), Diagram Tanabe-Sugano & Efek Jahn-Teller",
            description = "Teori Medan Ligan (LFT), ikatan balik pi (pi-backbonding), diagram Tanabe-Sugano transisi elektronik d-d, deret nefelauxetik, dan distorsi geometris Jahn-Teller.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("kim-koordinasi-medan-kristal")
        ),
        ConceptItem(
            id = "kim-anorganik-organologam-18-elektron",
            domain = Domain.KIMIA,
            topic = "Kimia Anorganik",
            title = "Kimia Organologam, Aturan 18 Elektron & Katalisis Homogen",
            description = "Struktur kompleks organologam, aturan 18 elektron, ligan siklopentadienil (ferosena) dan karbonil, reaksi adisi oksidatif, eliminasi reduktif, dan siklus katalisis homogen.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("kim-anorganik-medan-ligan-tanabe")
        ),
        ConceptItem(
            id = "kim-anorganik-zat-padat-kisi",
            domain = Domain.KIMIA,
            topic = "Kimia Anorganik",
            title = "Kimia Zat Padat: Kisi Kristal, Cacat Kisi & Kerangka Logam-Organik (MOF)",
            description = "Struktur kisi kristal anorganik (NaCl, ZnS, perovskit), energi kisi Kapustinskii, cacat stoikiometris Schottky dan Frenkel, serta material berpori zeolit dan MOF.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("kim-anorganik-organologam-18-elektron")
        ),
        ConceptItem(
            id = "kim-fisika-termodinamika-statistik",
            domain = Domain.KIMIA,
            topic = "Kimia Fisika",
            title = "Termodinamika Statistik Molekuler Kimia: Fungsi Partisi & Kesetimbangan",
            description = "Fungsi partisi molekuler translasi, rotasi, vibrasi, dan elektronik, derivasi besaran termodinamika kimia murni (U, H, S, G), dan perhitungan konstanta kesetimbangan.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("kim-termodinamika-kimia-dasar", "fis-fisika-statistik-ensemble")
        ),
        ConceptItem(
            id = "kim-fisika-kuantum-molekul-huckel",
            domain = Domain.KIMIA,
            topic = "Kimia Fisika",
            title = "Kimia Kuantum Molekuler: Teori Variasional & Teori Orbital Hückel",
            description = "Metode variasional kuantum, teori medan swakonsisten Hartree-Fock, teori orbital molekul pi Hückel sistem terkonjugasi aromatik benzena, dan kestabilan aromatisitas.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("kim-teori-orbital-molekul", "mat-nilai-eigen-vektor")
        ),
        ConceptItem(
            id = "kim-fisika-kinetika-permukaan-marcus",
            domain = Domain.KIMIA,
            topic = "Kimia Fisika",
            title = "Kinetika Reaksi Heterogen, Teori Transfer Elektron Marcus & Plot Tafel",
            description = "Teori transfer elektron Marcus di luar bola koordinasi, daerah inversi Marcus, kinetika antarmuka elektroda persamaan Butler-Volmer, dan plot Tafel elektrokatalisis.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("kim-kinetika-kimia-arrhenius", "kim-elektrokimia-nernst")
        ),
        ConceptItem(
            id = "kim-analitik-validasi-kromatografi",
            domain = Domain.KIMIA,
            topic = "Kimia Analitik",
            title = "Kromatografi Lanjut: Persamaan van Deemter & HPLC Fase Terbalik",
            description = "Teori pemisahan kromatografi, persamaan laju van Deemter, resolusi pemisahan Rs, faktor kapasitas, Kromatografi Gas (GC), dan High Performance Liquid Chromatography (HPLC).",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("kim-kesetimbangan-larutan-riil")
        ),
        ConceptItem(
            id = "kim-analitik-spektrometri-aas-icp",
            domain = Domain.KIMIA,
            topic = "Kimia Analitik",
            title = "Spektrometri Analitik Modern: AAS, ICP-MS & Voltametri Siklik",
            description = "Spektrometri Serapan Atom (AAS nyala dan grafit), Inductively Coupled Plasma Mass Spectrometry (ICP-MS) analisis jejak logam ppb, dan karakterisasi redoks voltametri siklik.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("kim-analitik-validasi-kromatografi")
        ),
        ConceptItem(
            id = "kim-biokimia-kinetika-enzim",
            domain = Domain.KIMIA,
            topic = "Biokimia",
            title = "Kinetika Enzim Michaelis-Menten, Inhibisi & Alosterik",
            description = "Struktur protein kuaterner, persamaan laju Michaelis-Menten (Km, Vmax, kcat), plot Lineweaver-Burk, mekanisme inhibisi kompetitif, unkompetitif, non-kompetitif, dan alosterik.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("kim-kinetika-kimia-arrhenius")
        ),
        ConceptItem(
            id = "kim-biokimia-jalur-metabolisme-respirasi",
            domain = Domain.KIMIA,
            topic = "Biokimia",
            title = "Bioenergetika Terpadu: Rantai Transpor Elektron & Kemiosmosis Mitokondria",
            description = "Jalur glikolisis 10 tahap, siklus asam sitrat Krebs, kompleks transpor elektron mitokondria I-IV, gradien gaya gerak proton Peter Mitchell, dan sintesis ATP rotasi F0F1.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("kim-biokimia-kinetika-enzim", "kim-termodinamika-kimia-dasar")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "kim-organik-stereokimia-cip" -> getOrganikStereokimiaCipLesson()
            "kim-organik-mekanisme-sn-e" -> getOrganikMekanismeSnELesson()
            "kim-organik-spektroskopi-nmr-ir" -> getOrganikSpektroskopiNmrIrLesson()
            "kim-organik-sintesis-retrosintesis" -> getOrganikSintesisRetrosintesisLesson()
            "kim-anorganik-medan-ligan-tanabe" -> getAnorganikMedanLiganTanabeLesson()
            "kim-anorganik-organologam-18-elektron" -> getAnorganikOrganologam18ElektronLesson()
            "kim-anorganik-zat-padat-kisi" -> getAnorganikZatPadatKisiLesson()
            "kim-fisika-termodinamika-statistik" -> getFisikaTermodinamikaStatistikLesson()
            "kim-fisika-kuantum-molekul-huckel" -> getFisikaKuantumMolekulHuckelLesson()
            "kim-fisika-kinetika-permukaan-marcus" -> getFisikaKinetikaPermukaanMarcusLesson()
            "kim-analitik-validasi-kromatografi" -> getAnalitikValidasiKromatografiLesson()
            "kim-analitik-spektrometri-aas-icp" -> getAnalitikSpektrometriAasIcpLesson()
            "kim-biokimia-kinetika-enzim" -> getBiokimiaKinetikaEnzimLesson()
            "kim-biokimia-jalur-metabolisme-respirasi" -> getBiokimiaJalurMetabolismeRespirasiLesson()
            else -> null
        }
    }

    private fun getOrganikStereokimiaCipLesson(): LessonData = LessonData(
        conceptId = "kim-organik-stereokimia-cip",
        storyPanels = listOf(
            StoryPanel(
                id = "p-stereo-1",
                panelNumber = 1,
                title = "Tragedi Dua Bayangan Cermin",
                caption = "Dimas membaca sejarah farmasi tentang Talidomid pada tahun 1960-an: Satu molekul enantiomer menyembuhkan mual kehamilan, namun bayangan cerminnya menyebabkan cacat janin parah.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kedua molekul memiliki rumus atom yang persis sama dan terhubung ke atom yang sama. Bagaimana bisa bayangan cerminnya memiliki efek biologis yang bertolak belakang bagai siang dan malam?"
            ),
            StoryPanel(
                id = "p-stereo-2",
                panelNumber = 2,
                title = "Aturan Prioritas Cahn-Ingold-Prelog (CIP)",
                caption = "Kakek menjelaskan aturan konfigurasi mutlak R (Rectus / searah jarum jam) dan S (Sinister / berlawanan jarum jam).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Reseptor protein di dalam tubuh kita bersifat kiral seperti sarung tangan kanan, Dimas! Tangan kanan pas di sarung tangan kanan tapi menolak tangan kiri. Aturan CIP mengurutkan prioritas berdasarkan nomor atom Z untuk menetapkan konfigurasi 3D mutlak R atau S secara universal!"
            ),
            StoryPanel(
                id = "p-stereo-3",
                panelNumber = 3,
                title = "Konformasi Kursi Sikloheksana",
                caption = "Kirana menggambar konformasi kursi sikloheksana dengan posisi aksial dan ekuatorial.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Cincin karbon siklik tidak datar! Konformasi kursi membebaskan regangan torsi, dan gugus substituen besar selalu memilih posisi ekuatorial untuk menghindari interaksi sterik 1,3-diaksial yang menekan energi!"
            )
        ),
        intuition = "Stereokimia mempelajari susunan tiga dimensi atom-atom dalam molekul. Molekul yang tidak dapat ditumpuk secara identik pada bayangan cerminnya disebut Kiral (memiliki pusat stereogenik karbon sp³ dengan 4 gugus berbeda). Sepasang stereoisomer bayangan cermin non-superimposable disebut Enantiomer, yang memiliki sifat fisik identik (titik leleh, titik didih) kecuali arah pemutaran bidang cahaya terpolarisasi (dekstrorotatori (+) vs levorotatori (-)). Aturan Cahn-Ingold-Prelog (CIP) menentukan konfigurasi mutlak (R atau S) berdasarkan prioritas nomor atom. Pada senyawa siklik, konformasi kursi sikloheksana adalah geometri paling stabil di mana substituen ekuatorial meminimalkan interaksi sterik 1,3-diaksial.",
        intuitionPoints = listOf(
            "Aturan CIP: Prioritas gugus ditentukan oleh nomor atom (Z) tertinggi dari atom yang terikat langsung ke pusat kiral. Jika identik, bandingkan atom-atom pada lapisan ikatan berikutnya.",
            "Penentuan R/S: Posisikan gugus berprioritas terendah (4) menjauhi pengamat (garis putus-putus). Jika urutan prioritas 1 -> 2 -> 3 berputar searah jarum jam, konfigurasinya adalah R (Rectus); jika berlawanan, adalah S (Sinister).",
            "Campuran Rasemat: campuran 50:50 enantiomer R dan S yang tidak memutar cahaya terpolarisasi (kelebihan enantiomer ee = 0%).",
            "Konformasi kursi sikloheksana: substituen besar di posisi ekuatorial lebih stabil secara termodinamika dibanding posisi aksial karena ketiadaan tolakan sterik 1,3-diaksial."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Rotasi Jenis Spesifik & Hukum Biot",
                latexFormula = "[\\alpha]_D^T = \\frac{\\alpha}{l \\cdot c}",
                description = "Karakteristik optik spesifik larutan kiral pada panjang gelombang garis D natrium (589 nm) dan suhu T.",
                variableMeanings = mapOf(
                    "[\\alpha]_D^T" to "Rotasi optik spesifik (°·mL/(dm·g))",
                    "\\alpha" to "Sudut putaran teramati pada polarimeter (derajat)",
                    "l" to "Panjang tabung sampel (desimeter, dm)",
                    "c" to "Konsentrasi larutan sampel (g/mL)"
                )
            ),
            FormulaCard(
                title = "Kelebihan Enantiomer (Enantiomeric Excess / ee)",
                latexFormula = "\\% ee = \\frac{|[R] - [S]|}{[R] + [S]} \\times 100\\% = \\frac{[\\alpha]_{\\text{campuran}}}{[\\alpha]_{\\text{murni}}} \\times 100\\%",
                description = "Kemurnian optik campuran enantiomer dalam sintesis asimetris.",
                variableMeanings = mapOf(
                    "\\% ee" to "Persentase kelebihan enantiomer",
                    "[R], [S]" to "Konsentrasi enantiomer R dan S"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sintesis Enantiomurni S-Ibuprofen di Industri Farmasi Kimia Farma",
            industry = "Industri Biofarmasi & Sintesis Obat Kiral",
            context = "Obat antiinflamasi analgesik populer Ibuprofen memiliki satu pusat kiral pada rantai asam propionatnya.",
            problem = "Hanya enantiomer (S)-Ibuprofen yang aktif secara biologis menghambat enzim siklooksigenase (COX-2) pereda nyeri, sedangkan (R)-Ibuprofen tidak aktif dan membebani metabolisme ginjal.",
            solution = "Pabrik sintesis bahan baku obat PT Kimia Farma menerapkan resolusi optik kiral bertingkat menggunakan garam diastereomerik dengan basa kiral alami (seperti L-lisin). Garam diastereomer (S)-Ibuprofen·L-lisin memiliki kelarutan yang jauh lebih rendah dalam pelarut isopropanol dibanding pasangannya, sehingga mengkristal keluar sebagai padatan murni dengan kemurnian optik > 99% ee. Kristal kemudian diasamkan kembali menghasilkan (S)-Ibuprofen enantiomurni berkekuatan dua kali lipat dengan efek samping minimal.",
            lessonsLearned = "Penguasaan stereokimia kiralitas adalah pembeda antara obat penyelamat hidup berkemurnian tinggi dan senyawa beracun mematikan dalam industri kimia farmasi modern."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Polarisasi Optik Larutan Sirup Gula Tebu Menggunakan Dua Filter Polarizer",
            objective = "Membuktikan fenomena aktivitas optik molekul kiral gula alami (D-sukrosa) yang memutar bidang polarisasi cahaya.",
            materialsNeeded = listOf(
                "2 pasang kacamata hitam polarized (atau layar laptop/smartphone + 1 kacamata polarized)",
                "1 botol kaca bening berbentuk persegi transparan",
                "Air hangat (200 mL)",
                "Gula pasir tebu (sukrosa pekat, 10 sendok makan)"
            ),
            steps = listOf(
                "Larutkan 10 sendok makan gula pasir ke dalam 200 mL air hangat hingga jenuh dan bening (D-sukrosa adalah molekul kiral alami dekstrorotatori).",
                "Posisikan layar smartphone yang menampilkan layar putih bersih sebagai sumber cahaya terpolarisasi linier.",
                "Lihat layar smartphone melalui kacamata polarized, putar kacamata hingga layar tampak gelap gulita (filter silang 90°).",
                "Sisipkan botol kaca berisi larutan gula pekat di antara layar smartphone dan kacamata polarized.",
                "Amati melalui kacamata: layar yang tadinya gelap gulita seketika MENJADI TERANG KEMBALI dan memancarkan spektrum warna-warni yang indah!",
                "Putar kacamata searah jarum jam (ke kanan) beberapa derajat untuk membuatnya gelap kembali: sudut putaran tersebut adalah bukti langsung pemutaran bidang polarisasi optik oleh molekul kiral sukrosa!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan menggunakan bahan konsumsi dapur."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-stereo-1",
                prompt = "Berdasarkan aturan Cahn-Ingold-Prelog (CIP), manakah urutan prioritas yang BENAR dari keempat gugus berikut yang terikat pada karbon kiral: -OH, -CH3, -COOH, -H?",
                type = "multiple_choice",
                options = listOf(
                    "-OH (1) > -COOH (2) > -CH3 (3) > -H (4)",
                    "-COOH (1) > -OH (2) > -CH3 (3) > -H (4)",
                    "-OH (1) > -CH3 (2) > -COOH (3) > -H (4)",
                    "-H (1) > -CH3 (2) > -COOH (3) > -OH (4)"
                ),
                correctAnswer = "-OH (1) > -COOH (2) > -CH3 (3) > -H (4)",
                hints = listOf(
                    "Bandingkan nomor atom (Z) dari atom yang terikat langsung ke karbon pusat: O (Z=8), C (Z=6), C (Z=6), H (Z=1).",
                    "Atom oksigen (Z=8) memiliki nomor atom terbesar sehingga -OH prioritas 1.",
                    "Untuk -COOH vs -CH3, bandingkan atom pada lapisan berikutnya: C pada -COOH terikat ke (O, O, O) sedangkan C pada -CH3 terikat ke (H, H, H)."
                ),
                explanation = "Berdasarkan aturan CIP: (1) Atom Oksigen pada -OH memiliki nomor atom Z = 8 (prioritas tertinggi 1); (2) Pada -COOH dan -CH3, atom pertama sama-sama Karbon (Z = 6), kita bandingkan atom tetangganya: C pada -COOH mengikat atom Oksigen (dianggap mengikat 3 atom O karena ikatan rangkap dua C=O dan C-OH), sedangkan C pada -CH3 hanya mengikat 3 atom Hidrogen (Z = 1), sehingga -COOH berprioritas lebih tinggi (prioritas 2); (3) -CH3 prioritas 3; (4) Hidrogen (Z = 1) selalu berprioritas terendah (prioritas 4). Urutannya: -OH > -COOH > -CH3 > -H.",
                misconception = "Mengira -COOH memiliki prioritas lebih tinggi dari -OH karena massa molekul -COOH (45) lebih besar dari -OH (17) (CIP mengurutkan nomor atom lapisan pertama, bukan massa molekul total)."
            ),
            QuizQuestion(
                id = "q-stereo-2",
                prompt = "Pada konformasi kursi sikloheksana tersubstitusi tunggal (misalnya metilsikloheksana), mengapa konformer dengan gugus metil pada posisi EKUATORIAL jauh lebih stabil dibandingkan posisi AKSIAL?",
                type = "multiple_choice",
                options = listOf(
                    "Karena pada posisi aksial gugus metil mengalami tolakan sterik 1,3-diaksial dengan atom hidrogen aksial pada cincin",
                    "Karena pada posisi ekuatorial molekul menjadi tidak kiral",
                    "Karena pada posisi aksial ikatan karbon-karbon terputus",
                    "Karena posisi ekuatorial selalu bermuatan negatif"
                ),
                correctAnswer = "Karena pada posisi aksial gugus metil mengalami tolakan sterik 1,3-diaksial dengan atom hidrogen aksial pada cincin",
                hints = listOf(
                    "Perhatikan jarak spasial antara gugus di posisi aksial dengan hidrogen pada posisi C3 dan C5.",
                    "Interaksi 1,3-diaksial ekuivalen dengan interaksi sterik gauche-butana."
                ),
                explanation = "Pada posisi aksial, gugus metil menonjol tegak lurus bidang cincin dan berada sangat dekat secara spasial dengan atom-atom hidrogen aksial pada atom karbon nomor 3 dan nomor 5 (interaksi 1,3-diaksial). Tolakan sterik Van der Waals ini meningkatkan energi potensial sistem sebesar sekitar 7.3 kJ/mol. Pada posisi ekuatorial, gugus metil menjulur mendatar ke ruang bebas, membebaskan regangan sterik dan menjadikannya sekitar 95% dominan pada kesetimbangan suhu ruang.",
                misconception = "Mengira posisi aksial dan ekuatorial memiliki energi yang sama persis."
            )
        )
    )

    private fun getOrganikMekanismeSnELesson(): LessonData = LessonData(
        conceptId = "kim-organik-mekanisme-sn-e",
        storyPanels = listOf(
            StoryPanel(
                id = "p-sn-e-1",
                panelNumber = 1,
                title = "Dua Jalur Reaksi yang Bersaing",
                caption = "Dimas mereaksikan 2-bromobutana dengan ion hidroksida (OH⁻). Bukannya hanya mendapatkan alkohol, ia malah mendapati campuran alkohol dan gas butena!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kenapa satu reaktan yang sama bisa menghasilkan produk penggantian (substitusi) sekaligus produk ikatan rangkap (eliminasi) secara bersamaan?"
            ),
            StoryPanel(
                id = "p-sn-e-2",
                panelNumber = 2,
                title = "Spektrum SN1, SN2, E1, dan E2",
                caption = "Kakek menjelaskan faktor penentu persaingan: struktur substrat, kekuatan nukleofil/basa, pelarut, dan suhu.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Nukleofil kuat dan tak-ruah pada substrat primer menyukai SN2 dengan inversi Walden payung terbalik! Basa kuat dan pemanasan tinggi memicu eliminasi E2 aturan Zaitsev! Substrat tersier membentuk karbokation stabil memicu jalur lambat SN1/E1!"
            ),
            StoryPanel(
                id = "p-sn-e-3",
                panelNumber = 3,
                title = "Geometri Antiperiplanar E2",
                caption = "Kirana menggambar proyeksi Newman untuk menunjukkan syarat stereoelektronik eliminasi E2.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Reaksi E2 membutuhkan konformasi antiperiplanar: proton H dan gugus pergi X harus berada pada sudut dihedral 180° berlawanan arah agar tumpang tindih orbital sigma dan sigma* dapat langsung membentuk ikatan pi!"
            )
        ),
        intuition = "Reaksi substitusi nukleofilik alifatik terbagi menjadi dua mekanisme ekstrim: SN2 (Substitusi Nukleofilik Bimolekuler, reaksi satu tahap serentak di mana nukleofil menyerang dari sisi belakang menyebabkan Inversi Walden konfigurasi, laju v = k [RX][Nu], disukai substrat primer 1° dan pelarut polar aprotik) dan SN1 (Substitusi Nukleofilik Unimolekuler, pembentukan karbokation planar intermediet lambat diikuti serangan nukleofil dari kedua sisi menghasilkan rasemisasi, laju v = k [RX], disukai substrat tersier 3° dan pelarut polar protik). Eliminasi E2 bersaing dengan SN2 ketika reagen bertindak sebagai basa Brønsted kuat, menghasilkan alkena paling stabil tersubstitusi banyak (Aturan Zaitsev) atau alkena kurang tersubstitusi jika menggunakan basa ruah besar terhalang sterik seperti kalium tert-butoksida (Aturan Hofmann).",
        intuitionPoints = listOf(
            "Reaktivitas substrat SN2: Metil > 1° > 2° >> 3° (terhalang sterik total).",
            "Reaktivitas substrat SN1: 3° > 2° >> 1° (ditentukan oleh kestabilan karbokation via hiperkonjugasi dan induksi).",
            "Stereokimia SN2: inversi konfigurasi 100% mutlak (inversi Walden payung terbalik).",
            "Karbokation pada SN1 dan E1 rentan mengalami penataan ulang (rearrangement via pergeseran hidrida atau metil 1,2) menuju karbokation yang lebih stabil.",
            "Eliminasi E2 membutuhkan geometri anti-koplanar / antiperiplanar (sudut dihedral H-C-C-X tepat 180°)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Hukum Laju Reaksi Substitusi SN1 vs SN2",
                latexFormula = "v_{\\text{SN2}} = k_2 [\\text{R-X}][\\text{Nu}^-] \\quad ; \\quad v_{\\text{SN1}} = k_1 [\\text{R-X}]",
                description = "Kinetika orde dua serentak pada SN2 vs kinetika orde satu unimolekuler bertahap pada SN1.",
                variableMeanings = mapOf(
                    "[\\text{R-X}]" to "Konsentrasi substrat alkil halida",
                    "[\\text{Nu}^-]" to "Konsentrasi pereaksi nukleofil",
                    "k_1, k_2" to "Konstanta laju reaksi orde satu dan dua"
                )
            ),
            FormulaCard(
                title = "Regioselektivitas Eliminasi Zaitsev vs Hofmann",
                latexFormula = "\\text{Basa Kecil (EtO}^-\\text{)} \\to \\text{Alkena Zaitsev (Substitusi Max)} \\quad ; \\quad \\text{Basa Ruah (}t\\text{-BuO}^-\\text{)} \\to \\text{Alkena Hofmann}",
                description = "Pengaruh rintangan sterik basa terhadap deprotonasi regioselektif pembentukan ikatan rangkap.",
                variableMeanings = mapOf(
                    "Zaitsev" to "Alkena lebih stabil berenergi lebih rendah (termodinamika)",
                    "Hofmann" to "Alkena terbentuk dari proton paling mudah diakses di ujung (kinetika)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Optimasi Reaksi Sintesis Resin Polimer Epoksi di Kawasan Industri Kimia Cilegon",
            industry = "Industri Polimer, Perekat Dirgantara & Petrokimia",
            context = "Pabrik resin petrokimia di Cilegon memproduksi monomer Bisphenol A Diglycidyl Ether (DGEBA) melalui reaksi antara Bisfenol-A dan Epiklorohidrin dalam suasana basa NaOH.",
            problem = "Jika kondisi reaksi tidak dikontrol presisi, terjadi reaksi samping hidrolisis dan eliminasi yang menghasilkan pengotor terklorinasi yang merusak daya rekat resin pesawat terbang.",
            solution = "Insinyur kimia mengoptimalkan jalur substitusi SN2 cincin oksiran: Ion fenoksida Bisfenol-A bertindak sebagai nukleofil kuat menyerang karbon terminal epiklorohidrin melalui mekanisme SN2 cincin terbuka, diikuti penutupan cincin intramolekuler yang cepat. Pelarut aprotik polar (seperti aseton kering) digunakan untuk memaksimalkan nukleofilisitas anion fenoksida (tanpa pelarutan ikatan hidrogen penghalang) dan suhu dijaga di bawah 65°C untuk menekan kompetisi eliminasi E2. Konversi monomer DGEBA kemurnian tinggi mencapai 98.5%.",
            lessonsLearned = "Memahami kinetika kompetisi SN2 dan E2 memungkinkan insinyur mengendalikan selektivitas sintesis polimer industri raksasa bernilai jutaan dolar."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Pengaruh Kepolaran Pelarut pada Laju Reaksi Kimia Dapur",
            objective = "Memahami konsep efek pelarut (protik vs aprotik) terhadap reaktivitas ion dalam mekanisme reaksi.",
            materialsNeeded = listOf(
                "2 gelas kaca bening transparan",
                "Tablet effervescent vitamin C (atau campuran soda kue + asam sitrat bubuk)",
                "Air murni (pelarut protik berikatan hidrogen kuat)",
                "Minyak goreng atau alkohol isopropil 70%",
                "Stopwatch"
            ),
            steps = listOf(
                "Isi Gelas 1 dengan 100 mL air murni.",
                "Isi Gelas 2 dengan campuran 50 mL air dan 50 mL alkohol pembersih.",
                "Masukkan separuh tablet effervescent ke dalam Gelas 1: amati laju pembentukan gelembung gas CO2 yang sangat cepat dan reaktif (pelarut air mendisosiasi ion seketika).",
                "Masukkan separuh tablet ke Gelas 2: amati bahwa laju reaksi melambat drastis karena pelarut organik menurunkan konstanta dielektrik dan memperlambat mobilitas transfer ion.",
                "Simpulkan: Pelarut bukan sekadar wadah pasif, melainkan partisipan aktif yang dapat mempercepat atau memperlambat laju mekanisme reaksi hingga ribuan kali lipat!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan menggunakan bahan konsumsi/pembersih."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sn-e-1",
                prompt = "Reaksi antara (R)-2-bromobutana murni dengan natrium sianida (NaCN) dalam pelarut dimetil sulfoksida (DMSO) menghasilkan 2-metilbutananitril. Bagaimanakah stereokimia dari produk yang dihasilkan?",
                type = "multiple_choice",
                options = listOf(
                    "Terjadi inversi konfigurasi 100% menghasilkan (S)-2-metilbutananitril (Inversi Walden melalui mekanisme SN2 murni)",
                    "Terjadi rasemisasi menghasilkan campuran 50% R dan 50% S melalui mekanisme SN1",
                    "Konfigurasi tetap (R) tanpa perubahan stereokimia",
                    "Produk yang terbentuk tidak memiliki pusat kiral"
                ),
                correctAnswer = "Terjadi inversi konfigurasi 100% menghasilkan (S)-2-metilbutananitril (Inversi Walden melalui mekanisme SN2 murni)",
                hints = listOf(
                    "Substrat 2-bromobutana adalah alkil halida sekunder 2°.",
                    "Sianida (CN⁻) adalah nukleofil kuat.",
                    "DMSO adalah pelarut aprotik polar.",
                    "Kombinasi nukleofil kuat + pelarut aprotik polar memicu mekanisme SN2."
                ),
                explanation = "Ion sianida (CN⁻) adalah nukleofil kuat dan pelarut DMSO adalah pelarut polar aprotik yang tidak mengsolvasi anion nukleofil secara kuat, sangat mengunggulkan mekanisme SN2. Reaksi SN2 berlangsung serentak dengan serangan nukleofil dari sisi belakang berlawanan arah dengan gugus pergi bromida, menyebabkan inversi konfigurasi 100% (Inversi Walden). Pusat kiral (R) berubah sempurna menjadi konfigurasi (S).",
                misconception = "Mengira reaksi selalu menghasilkan campuran rasemik (rasemisasi hanya terjadi pada mekanisme SN1 yang melalui karbokation planar)."
            ),
            QuizQuestion(
                id = "q-sn-e-2",
                prompt = "Ketika 2-bromo-2-metilbutana direaksikan dengan basa ruah berpenghalang sterik kalium tert-butoksida (t-BuOK) dengan pemanasan, produk alkena eliminasi manakah yang menjadi PRODUK UTAMA?",
                type = "multiple_choice",
                options = listOf(
                    "2-metil-1-butena (Produk Hofmann alkena kurang tersubstitusi)",
                    "2-metil-2-butena (Produk Zaitsev alkena lebih tersubstitusi)",
                    "2-metil-2-butanol (Produk substitusi)",
                    "1-butena"
                ),
                correctAnswer = "2-metil-1-butena (Produk Hofmann alkena kurang tersubstitusi)",
                hints = listOf(
                    "Kalium tert-butoksida adalah basa yang sangat besar dan ruah (bulky base).",
                    "Basa ruah terhalang secara sterik untuk mengambil proton internal.",
                    "Basa ruah lebih mudah mengambil proton terminal di ujung molekul."
                ),
                explanation = "Meskipun aturan Zaitsev memprediksi alkena lebih tersubstitusi (2-metil-2-butena) lebih stabil secara termodinamika, penggunaan basa yang sangat ruah seperti ion tert-butoksida (t-BuO⁻) terhalang secara sterik untuk menjangkau hidrogen pada karbon sekunder di dalam molekul. Basa ini secara selektif menyerang hidrogen terminal yang bebas hambatan sterik pada gugus metil luar, menghasilkan alkena kurang tersubstitusi 2-metil-1-butena sebagai produk utama kinetik (Aturan Eliminasi Hofmann).",
                misconception = "Secara refleks selalu memilih produk Zaitsev tanpa melihat bahwa basa yang digunakan adalah basa ruah tert-butoksida."
            )
        )
    )

    private fun getOrganikSpektroskopiNmrIrLesson(): LessonData = LessonData(
        conceptId = "kim-organik-spektroskopi-nmr-ir",
        storyPanels = listOf(
            StoryPanel(
                id = "p-spektro-org-1",
                panelNumber = 1,
                title = "Misteri Bubuk Kristal Putih Misterius",
                caption = "Dimas menemukan botol kristal putih tanpa label di laboratorium. Uji titik leleh hanya memberi tahu angka suhu, tetapi tidak dapat memberitahukan rumus bangun 3D molekulnya.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana para kimiawan bisa melihat struktur arsitektur atom karbon dan hidrogen di dalam suatu molekul yang ukurannya sepersejuta milimeter?"
            ),
            StoryPanel(
                id = "p-spektro-org-2",
                panelNumber = 2,
                title = "Sidik Jari Inframerah & Detak Frekuensi Inti",
                caption = "Kakek menjelaskan instrumen spektroskopi Fourier Transform Infrared (FT-IR) dan Resonansi Magnetik Inti (NMR).",
                dialogueSpeaker = "Kakek",
                dialogueText = "FT-IR mendengarkan getaran regangan ikatan: puncak tajam di 1715 cm⁻¹ adalah tanda pasti gugus karbonil C=O, sedangkan serapan lebar di 3300 cm⁻¹ adalah ikatan hidrogen alkohol O-H! Dan NMR adalah mata batin kimia: ia menghitung jumlah tetangga hidrogen dari pemecahan spin N+1!"
            ),
            StoryPanel(
                id = "p-spektro-org-3",
                panelNumber = 3,
                title = "Elusidasi Struktur Terpadu",
                caption = "Kirana menggabungkan data Spektrometri Massa (MS), IR, ¹H-NMR, dan ¹³C-NMR menjadi satu kesatuan puzzle molekuler yang kokoh.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Spektrometri massa memberikan berat molekul pasti dan pola fragmentasi. NMR memberikan jumlah lingkungan kimia dan konektivitas atom. Dengan menggabungkan keempat spektrum ini, kita bisa merekonstruksi struktur molekul murni tanpa keraguan!"
            )
        ),
        intuition = "Spektroskopi organik adalah perangkat utama untuk elusidasi (pengungkapan) struktur senyawa kimia murni. Spektroskopi Inframerah (FT-IR) mendeteksi transisi vibrasi ikatan molekul yang menyerap foton IR dengan bilangan gelombang karakteristik gugus fungsi (fingerprint region dan functional group region). Spektroskopi Resonansi Magnetik Inti (¹H dan ¹³C NMR) mengukur penyerapan frekuensi radio oleh inti atom berspin 1/2 dalam medan magnet kuat B0. Pergeseran kimia (chemical shift delta dalam ppm) mengungkapkan lingkungan elektronik (deshielding / downfield vs shielding / upfield). Luas area integrasi puncak menunjukkan rasio jumlah atom hidrogen. Pemecahan spin-spin kopling skalar mengikuti Aturan Multiplisitas N+1, mengidentifikasi jumlah tetangga hidrogen langsung pada atom karbon bersebelahan.",
        intuitionPoints = listOf(
            "Serapan karakteristik FT-IR: O-H alkohol (3200–3600 cm⁻¹ lebar), N-H amina (3300–3500 cm⁻¹ tajam), C=O karbonil (1680–1750 cm⁻¹ puncak tajam sangat kuat), C=C alkena (1640–1680 cm⁻¹), C≡C / C≡N (2200 cm⁻¹).",
            "Pergeseran Kimia ¹H-NMR: Tetrametilsilana (TMS) sebagai standar acuan 0 ppm; R-CH3 alifatik (0.9–1.5 ppm); R-CH2-X elektronegatif (3.0–4.5 ppm); C=C-H alkena (4.5–6.5 ppm); cincin aromatik benzena (6.5–8.5 ppm); aldehida -CHO (9–10 ppm); asam karboksilat -COOH (10–12 ppm).",
            "Aturan Multiplisitas Pemecahan Spin N+1: Jika suatu proton memiliki N proton tetangga ekivalen pada atom karbon yang berdekatan, puncaknya akan terpecah menjadi N + 1 puncak (singlet N=0, doublet N=1, triplet N=2, quartet N=3, dst) dengan rasio intensitas Segitiga Pascal.",
            "Spektrometri Massa (MS): mengionisasi molekul dan mengukur rasio massa terhadap muatan (m/z) dari ion molekular [M]⁺ dan fragmen-fragmennya."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Bilangan Gelombang Getaran Harmonik Inframerah",
                latexFormula = "\\tilde{\\nu} = \\frac{1}{2\\pi c} \\sqrt{\\frac{k}{\\mu}} \\quad ; \\quad \\mu = \\frac{m_1 m_2}{m_1 + m_2}",
                description = "Frekuensi serapan vibrasi IR bergantung langsung pada konstanta pegas kekuatan ikatan k dan massa tereduksi atom mu.",
                variableMeanings = mapOf(
                    "\\tilde{\\nu}" to "Bilangan gelombang serapan IR (cm⁻¹)",
                    "c" to "Kecepatan cahaya (cm/s)",
                    "k" to "Konstanta gaya ikatan (N/m, ikatan rangkap tiga > rangkap dua > tunggal)",
                    "\\mu" to "Massa tereduksi dari kedua atom yang berikatan"
                )
            ),
            FormulaCard(
                title = "Pergeseran Kimia Resonansi Magnetik Inti (NMR)",
                latexFormula = "\\delta = \\frac{\\nu_{\\text{sampel}} - \\nu_{\\text{TMS}}}{\\nu_{\\text{spektrometer}}} \\times 10^6 \\text{ (ppm)}",
                description = "Pergeseran frekuensi resonansi kimiawi yang dinormalisasi tidak bergantung pada kuat medan magnet alat NMR.",
                variableMeanings = mapOf(
                    "\\delta" to "Pergeseran kimia (parts per million / ppm)",
                    "\\nu_\\text{sampel}" to "Frekuensi resonansi inti sampel (Hz)",
                    "\\nu_\\text{TMS}" to "Frekuensi referensi standar tetrametilsilana (Hz)",
                    "\\nu_\\text{spektrometer}" to "Frekuensi operasi osilator NMR (misal 400 MHz atau 500 MHz)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Elusidasi Struktur Alfa-Mangostin dari Kulit Manggis di Balai Riset Tanaman Obat Tawangmangu",
            industry = "Kimia Bahan Alam Tradisional & Industri Fitofarmaka",
            context = "Balai Besar Penelitian Tanaman Obat dan Obat Tradisional (B2P2TOOT) Tawangmangu mengisolasi kristal senyawa aktif kuning dari ekstrak kulit buah manggis (*Garcinia mangostana*) yang memiliki bioaktivitas antioksidan dan antikanker tinggi.",
            problem = "Bagaimana membuktikan bahwa kristal yang dimurnikan benar-benar senyawa santon Alfa-Mangostin murni dengan posisi gugus prenil dan hidroksil yang tepat pada cincin aromatik?",
            solution = "Peneliti menganalisis kristal menggunakan spektroskopi terpadu: (1) HR-ESI-MS menunjukkan puncak ion molekular [M+H]⁺ pada m/z 411.1802 mengonfirmasi rumus molekul C₂₄H₂₆O₆; (2) Spektrum FT-IR menunjukkan serapan kuat ikatan hidrogen fenolik pada 3420 cm⁻¹ dan karbonil santon terkonjugasi pada 1645 cm⁻¹; (3) Spektrum ¹H-NMR menunjukkan sinyal proton kelat asam C1-OH yang khas pada delta 13.78 ppm (terikat ikatan hidrogen kuat intramolekuler ke C=O), dua proton aromatik terisolasi sebagai singlet pada delta 6.82 dan 6.37 ppm, serta sinyal gugus prenil (dua doublet proton alilik pada 3.34 dan 4.08 ppm); (4) Spektrum ¹³C-NMR dan HMBC 2D mengonfirmasi konektivitas atom karbon tanpa cacat, membuktikan kemurnian 99.8% Alfa-Mangostin.",
            lessonsLearned = "Spektroskopi organik NMR dan IR adalah instrumen mutlak pembuktian identitas kimiawi dalam komersialisasi obat bahan alam Indonesia ke panggung internasional."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Pemecahan Multiplisitas Spin N+1 Menggunakan Magnet Kulkas",
            objective = "Memahami secara visual bagaimana orientasi spin magnetik inti tetangga memecah sinyal resonansi menjadi doublet, triplet, dan quartet.",
            materialsNeeded = listOf(
                "4 buah magnet kulkas identik berlabel kutub Utara (U) dan Selatan (S)",
                "Kertas dan spidol"
            ),
            steps = listOf(
                "Model 1 Tetangga (N = 1, Kasus Doublet): Proton yang kita amati dipengaruhi oleh 1 tetangga. Magnet tetangga hanya memiliki 2 kemungkinan orientasi: Searah medan (U) atau Berlawanan medan (S) dengan peluang sama 50:50. Hasil: sinyal terpecah menjadi 2 puncak sama tinggi (Doublet rasio 1:1, N+1 = 2)!",
                "Model 2 Tetangga (N = 2, Kasus Triplet): Proton dipengaruhi oleh 2 tetangga. Ada 4 kemungkinan kombinasi: (U, U) [1 cara]; (U, S) dan (S, U) [2 cara]; (S, S) [1 cara]. Hasil: sinyal terpecah menjadi 3 puncak dengan rasio intensitas 1:2:1 (Triplet, N+1 = 3)!",
                "Model 3 Tetangga (N = 3, Kasus Quartet): Proton dipengaruhi 3 tetangga. Kombinasinya: 1 cara (UUU), 3 cara (UUS, USU, SUU), 3 cara (SSU, SUS, USS), 1 cara (SSS). Hasil: terbentuk Quartet dengan rasio intensitas 1:3:3:1 (N+1 = 4)!",
                "Simpulkan: Pemecahan spin NMR mengikuti Segitiga Pascal murni yang muncul dari permutasi kuantum orientasi spin magnetik inti!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan sangat efektif menjelaskan konsep pembelahan spin NMR."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-spektro-org-1",
                prompt = "Pada spektrum ¹H-NMR dari senyawa bromoetana (CH3-CH2-Br), bagaimanakah bentuk multiplisitas pemecahan sinyal puncak untuk kelompok proton metilen (-CH2-) dan kelompok proton metil (-CH3-)?",
                type = "multiple_choice",
                options = listOf(
                    "-CH2- terpecah menjadi KUARTET (4 puncak) dan -CH3- terpecah menjadi TRIPLET (3 puncak)",
                    "-CH2- terpecah menjadi TRIPLET dan -CH3- terpecah menjadi KUARTET",
                    "Keduanya sama-sama terpecah menjadi DOUBLET",
                    "Keduanya muncul sebagai SINGLET tunggal tanpa pemecahan"
                ),
                correctAnswer = "-CH2- terpecah menjadi KUARTET (4 puncak) dan -CH3- terpecah menjadi TRIPLET (3 puncak)",
                hints = listOf(
                    "Gunakan Aturan Multiplisitas N + 1 di mana N adalah jumlah proton tetangga pada karbon sebelah.",
                    "Proton -CH2- bersebelahan dengan gugus -CH3 (ada N = 3 tetangga). N + 1 = 3 + 1 = 4 (Kuartet).",
                    "Proton -CH3 bersebelahan dengan gugus -CH2- (ada N = 2 tetangga). N + 1 = 2 + 1 = 3 (Triplet)."
                ),
                explanation = "Berdasarkan aturan kopling spin N + 1: Proton pada gugus -CH2- bertetangga langsung dengan 3 proton pada gugus -CH3 (N = 3), sehingga sinyalnya terpecah menjadi 3 + 1 = 4 puncak (Kuartet). Sebaliknya, ketiga proton pada gugus -CH3 bertetangga langsung dengan 2 proton pada gugus -CH2- (N = 2), sehingga sinyalnya terpecah menjadi 2 + 1 = 3 puncak (Triplet). Pasangan triplet-kuartet ini adalah tanda khas keberadaan gugus etil (-CH2CH3) dalam spektroskopi NMR.",
                misconception = "Menghitung jumlah proton pada gugus itu sendiri bukannya menghitung jumlah proton tetangga."
            ),
            QuizQuestion(
                id = "q-spektro-org-2",
                prompt = "Sebuah senyawa organik tak dikenal memberikan serapan pita tajam sangat kuat pada bilangan gelombang 1715 cm⁻¹ pada spektrum FT-IR dan tidak menunjukkan serapan lebar di atas 3200 cm⁻¹. Gugus fungsi apakah yang secara pasti terdapat dalam molekul tersebut?",
                type = "multiple_choice",
                options = listOf(
                    "Gugus Karbonil (C=O, seperti keton atau aldehida)",
                    "Gugus Alkohol (O-H)",
                    "Gugus Alkuna (C≡C)",
                    "Gugus Amina Primer (-NH2)"
                ),
                correctAnswer = "Gugus Karbonil (C=O, seperti keton atau aldehida)",
                hints = listOf(
                    "Puncak tajam dan kuat di daerah 1680–1750 cm⁻¹ adalah ciri khas regangan ikatan rangkap dua karbon-oksigen.",
                    "Tidak adanya serapan di atas 3200 cm⁻¹ menyingkirkan kemungkinan gugus O-H atau N-H."
                ),
                explanation = "Serapan tajam sangat kuat di rentang 1700–1720 cm⁻¹ (khususnya 1715 cm⁻¹) adalah 'sidik jari diagnostik' utama dari getaran regangan ikatan rangkap dua karbonil C=O (khas pada keton alifatik). Ketiadaan serapan lebar di atas 3200 cm⁻¹ memastikan tidak adanya gugus alkohol O-H atau asam karboksilat.",
                misconception = "Mengira serapan tajam 1715 cm⁻¹ adalah ikatan rangkap alkena C=C (alkena C=C menyerap lebih lemah di daerah 1640–1680 cm⁻¹)."
            )
        )
    )

    private fun getOrganikSintesisRetrosintesisLesson(): LessonData = LessonData(
        conceptId = "kim-organik-sintesis-retrosintesis",
        storyPanels = listOf(
            StoryPanel(
                id = "p-sintesis-retro-1",
                panelNumber = 1,
                title = "Merancang Arsitektur Molekuler Terbalik",
                caption = "Dimas ditugaskan merancang jalur sintesis molekul obat kompleks dengan 5 cincin karbon dan 8 pusat kiral dari bahan kimia sederhana yang tersedia di katalog toko.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana kimiawan organik merancang jalur reaksi yang terdiri dari 15 langkah tanpa tersesat di tengah jalan?"
            ),
            StoryPanel(
                id = "p-sintesis-retro-2",
                panelNumber = 2,
                title = "Analisis Retrosintesis E.J. Corey",
                caption = "Kakek memperkenalkan metode retrosintesis pemenang Hadiah Nobel Elias James Corey.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Jangan berpikir maju dari bahan awal, Dimas! Berpikirlah MUNDUR dari molekul target (panah ganda =>)! Putuskan ikatan-ikatan strategis (diskoneksi) menjadi fragmen konseptual bermuatan (Sinton) dan cari ekuivalen sintetik kimianya!"
            ),
            StoryPanel(
                id = "p-sintesis-retro-3",
                panelNumber = 3,
                title = "Reaksi Pembentukan C-C & Perisiklik",
                caption = "Kirana memaparkan reaksi pembentukan ikatan karbon-karbon utama: Reaksi Wittig, Kondensasi Aldol, dan Sikloadisi Diels-Alder.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Reaksi Diels-Alder [4+2] menggabungkan diena terkonjugasi dan dienofil membentuk cincin sikloheksena dengan stereokimia endo sempurna dalam satu langkah! Ini adalah senjata pamungkas sintesis total bahan alam!"
            )
        ),
        intuition = "Analisis retrosintesis adalah metodologi sistematis perencanaan sintesis organik dengan memecah molekul target (Target Molecule / TM) secara mundur langkah demi langkah hingga diperoleh bahan awal komersial yang sederhana dan murah. Operasi dasar retrosintesis meliputi: Diskoneksi (pemutusan ikatan imajiner menghasilkan Sinton bermuatan positif atau negatif yang kemudian diasosiasikan dengan Ekuivalen Sintetis reagen nyata) dan Interkonversi Gugus Fungsi (FGI). Senjata terpenting dalam sintesis organik adalah reaksi pembentukan ikatan C-C (seperti alkilasi enolat, adisi Michael, reaksi Wittig pembentuk alkena dari fosfonium ilida) dan Reaksi Perisiklik (seperti sikloadisi Diels-Alder [4+2] yang diatur oleh simetri orbital molekul aturan Woodward-Hoffmann).",
        intuitionPoints = listOf(
            "Panah Retrosintesis (=>): melambangkan transformasi analitis mundur ('dapat dibuat dari').",
            "Sinton: fragmen molekuler teridealisasi bermuatan hipotetis yang dihasilkan dari diskoneksi (contoh: sinton elektrofilik R⁺ memiliki ekuivalen sintetis alkil halida R-Br; sinton nukleofilik d¹ C⁻ memiliki ekuivalen sintetis reagen Grignard R-MgBr atau enolat).",
            "Gugus Pelindung (Protecting Group): memodifikasi sementara gugus fungsi sensitif agar tidak bereaksi dengan reagen lain, lalu dilepas kembali di akhir (contoh: silil eter TBS untuk melindungi alkohol, asetal untuk melindungi aldehida/keton).",
            "Reaksi Sikloadisi Diels-Alder: reaksi perisiklik antara diena terkonjugasi (4 elektron pi) dan dienofil (2 elektron pi) membentuk cincin sikloheksena 6-anggota dengan stereospesifisitas cis-endo tinggi.",
            "Reaksi Wittig: reaksi antara fosfonium ilida (Ph3P=CR2) dan aldehida/keton menghasilkan alkena secara regioselektif sempurna tanpa isomerisasi ikatan rangkap."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Sikloadisi Diels-Alder [4+2]",
                latexFormula = "\\text{Diena (4}\\pi\\text{)} + \\text{Dienofil (2}\\pi\\text{)} \\xrightarrow{\\Delta} \\text{Sikloheksena (Cincin 6 Anggota)}",
                description = "Reaksi perisiklik serentak satu tahap yang membentuk dua ikatan C-C baru dan satu ikatan pi dalam satu siklus tertutup.",
                variableMeanings = mapOf(
                    "\\text{Diena}" to "1,3-diena berkonformasi s-cis",
                    "\\text{Dienofil}" to "Alkena teraktivasi gugus penarik elektron (EWG)",
                    "\\Delta" to "Aktivasi termal"
                )
            ),
            FormulaCard(
                title = "Reaksi Pembentukan Alkena Wittig",
                latexFormula = "R_2C=O + Ph_3P=CR'_2 \\xrightarrow{} R_2C=CR'_2 + Ph_3P=O",
                description = "Konversi selektif gugus karbonil menjadi alkena dengan produk samping trifenilfosfina oksida berenergi kisi sangat stabil.",
                variableMeanings = mapOf(
                    "R_2C=O" to "Aldehida atau keton",
                    "Ph_3P=CR'_2" to "Fosfonium ilida (reagen Wittig)",
                    "Ph_3P=O" to "Trifenilfosfina oksida"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Total Sintesis Parsial Molekul Antimalaria Artemisinin di PT Bio Farma & ITB",
            industry = "Industri Biofarmasi & Sintesis Kimia Medisinal",
            context = "Artemisinin adalah obat antimalaria standar WHO yang memiliki cincin endoperoksida unik 1,2,4-trioksana yang sangat tidak stabil terhadap panas dan asam.",
            problem = "Pasokan artemisinin dari isolasi tanaman herba lokal *Artemisia annua* sangat fluktuatif bergantung musim panen. Bagaimana mensintesis molekul kiral kompleks ini dari prekursor melimpah asam artemisat?",
            solution = "Konsorsium peneliti ITB dan Bio Farma merancang jalur semi-sintesis retrosintesis 3 langkah: Asam artemisat direduksi diastereoselektif menjadi asam dihidroartemisat. Langkah kunci berikutnya adalah fotooksigenasi menggunakan oksigen singlet (¹O₂) yang dibangkitkan oleh pewarna fotosensitizer di bawah sinar tampak, diikuti penataan ulang perisiklik berantai yang dikatalisis asam trifluoroasetat untuk menutup cincin endoperoksida secara stereospesifik tanpa meledakkan cincin peroksida. Hasil konversi mencapai 62%, mengamankan kemandirian pasokan obat antimalaria nasional.",
            lessonsLearned = "Analisis retrosintesis memungkinkan kimiawan memetakan rute pembuatan molekul obat paling rapuh di dunia menjadi urutan reaksi yang aman dan berdaya hasil tinggi."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Sintesis Ester Aroma Buah Pisang (Isoamil Asetat) Skala Dapur",
            objective = "Mempraktikkan prinsip sintesis organik pembentukan ikatan ester (reaksi kondensasi Fischer) dan pengujian aroma produk.",
            materialsNeeded = listOf(
                "Minyak aroma pisang / isoamil alkohol (tersedia di toko bahan kimia/kue)",
                "Asam cuka dapur pekat (asam asetat 25% atau 50%)",
                "Beberapa tetes asam sitrat pekat atau air aki murni (sebagai katalis asam, H+)",
                "1 tabung kaca tahan panas / cangkir stainless steel kecil",
                "Wadah air panas mendidih (water bath pemanas)"
            ),
            steps = listOf(
                "Campurkan 1 sendok teh isoamil alkohol dengan 2 sendok teh asam cuka pekat ke dalam wadah stainless steel.",
                "Tambahkan 2 tetes katalis asam pengering.",
                "Tempatkan wadah stainless steel di dalam mangkuk berisi air mendidih (water bath) selama 10 menit sambil diaduk perlahan (jangan dipanaskan langsung di atas api!).",
                "Setelah 10 menit, angkat wadah dan tuangkan campuran ke dalam segelas air dingin.",
                "Lapisan ester organik yang tidak larut akan mengapung di permukaan air.",
                "Kibaskan uapnya ke hidung dengan tangan secara hati-hati: aroma asam cuka yang menyengat lenyap dan berganti menjadi aroma manis pisang ambon harum yang sangat kuat (Isoamil Asetat / Minyak Pisang)!",
                "Reaksi: CH3COOH + (CH3)2CHCH2CH2OH <=> CH3COOCH2CH2CH(CH3)2 + H2O."
            ),
            safetyNotes = listOf(
                "Lakukan di ruangan berventilasi baik.",
                "Kibaskan uap ke arah hidung dengan tangan, jangan menghirup langsung dari mulut wadah.",
                "Jangan mengonsumsi hasil sintesis."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sintesis-retro-1",
                prompt = "Dalam analisis retrosintesis, diskoneksi ikatan karbon-karbon pada molekul target menghasilkan fragmen hipotetis bermuatan yang disebut sebagai 'Sinton'. Apakah ekuivalen sintetis reagen nyata yang paling umum untuk sinton nukleofilik alkil R⁻ (karbanion)?",
                type = "multiple_choice",
                options = listOf(
                    "Reagen Grignard (R-MgBr) atau reagen organolitium (R-Li)",
                    "Alkil halida (R-Br)",
                    "Alkohol alifatik (R-OH)",
                    "Alkana jenuh (R-H)"
                ),
                correctAnswer = "Reagen Grignard (R-MgBr) atau reagen organolitium (R-Li)",
                hints = listOf(
                    "Sinton R⁻ bertindak sebagai nukleofil yang menyerang pusat elektrofilik positif.",
                    "Logam elektropositif (seperti Magnesium atau Litium) mempolarisasi ikatan C-M sehingga karbon bermuatan parsial negatif delta minus."
                ),
                explanation = "Sinton nukleofilik R⁻ merepresentasikan atom karbon bermuatan negatif (karbanion). Dalam laboratorium nyata, sumber reagen pembawa karbanion yang paling umum adalah Reagen Grignard (R-MgX) atau senyawa organolitium (R-Li), di mana perbedaan keelektronegatifan antara karbon dan logam membuat atom karbon bersifat sangat nukleofilik. Sebaliknya, alkil halida R-Br adalah ekuivalen sintetis untuk sinton elektrofilik R⁺.",
                misconception = "Tertukar antara sinton nukleofilik (R⁻) dan sinton elektrofilik (R⁺)."
            ),
            QuizQuestion(
                id = "q-sintesis-retro-2",
                prompt = "Berdasarkan stereokimia reaksi sikloadisi Diels-Alder [4+2], bagaimanakah hubungan stereokimia gugus-gugus pada dienofil setelah bereaksi membentuk cincin sikloheksena?",
                type = "multiple_choice",
                options = listOf(
                    "Stereospesifik sempurna: gugus yang awalnya berposisi cis pada dienofil akan tetap berposisi cis pada cincin, dan gugus trans akan tetap trans",
                    "Selalu menghasilkan campuran rasemik 50% cis dan 50% trans tanpa mempedulikan struktur awal dienofil",
                    "Gugus cis selalu berubah menjadi trans akibat tolakan sterik",
                    "Semua ikatan kovalen terurai menjadi radikal bebas acak"
                ),
                correctAnswer = "Stereospesifik sempurna: gugus yang awalnya berposisi cis pada dienofil akan tetap berposisi cis pada cincin, dan gugus trans akan tetap trans",
                hints = listOf(
                    "Reaksi Diels-Alder berlangsung melalui mekanisme serentak (concerted mechanism) satu tahap.",
                    "Tidak ada zat antara (intermediet) karbokation atau radikal bebas yang dapat berotasi bebas."
                ),
                explanation = "Reaksi Diels-Alder adalah reaksi perisiklik serentak satu tahap (concerted mechanism) di mana pembentukan kedua ikatan C-C terjadi secara bersamaan tanpa pembentukan zat antara. Akibatnya, tidak ada waktu bagi ikatan untuk berotasi. Geometri substituen pada dienofil terawetkan secara stereospesifik mutlak: dienofil cis (seperti dimetil maleat) menghasilkan produk cincin dengan gugus berposisi cis, sedangkan dienofil trans (seperti dimetil fumarat) menghasilkan produk dengan gugus berposisi trans.",
                misconception = "Mengira ikatan C-C pada alkena sempat berputar bebas selama reaksi berlangsung."
            )
        )
    )

    private fun getAnorganikMedanLiganTanabeLesson(): LessonData = LessonData(
        conceptId = "kim-anorganik-medan-ligan-tanabe",
        storyPanels = listOf(
            StoryPanel(
                id = "p-lft-tanabe-1",
                panelNumber = 1,
                title = "Kelemahan Teori Medan Kristal Murni",
                caption = "Dimas mempelajari Teori Medan Kristal (CFT) yang menganggap ligan semata-mata sebagai muatan titik elektrostatik negatif. Namun ligan netral tak bermuatan seperti Karbon Monoksida (CO) justru memicu pemisahan orbital d yang paling besar di seluruh deret spektrokimia!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Ligan CO bermuatan nol dan tidak memiliki pasangan ion negatif, kenapa pemisahan medan ligan CO jauh lebih kuat dibanding ion iodida I⁻ yang bermuatan negatif penuh?"
            ),
            StoryPanel(
                id = "p-lft-tanabe-2",
                panelNumber = 2,
                title = "Ikatan Balik Pi (Pi-Backbonding) & LFT",
                caption = "Kakek menjelaskan Teori Medan Ligan (Ligand Field Theory / LFT): perpaduan kuantum CFT dengan Teori Orbital Molekul.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Ligan CO bukan muatan titik pasif, Dimas! Ia mendonasikan pasangan elektron sigma ke logam, dan orbital d_pi logam mendonasikan balik elektron ke orbital anti-ikatan pi* kosong milik CO (pi-backbonding)! Ikatan sinergis ganda ini menstabilkan t_2g dan memperbesar Delta_o secara masif!"
            ),
            StoryPanel(
                id = "p-lft-tanabe-3",
                panelNumber = 3,
                title = "Diagram Tanabe-Sugano & Efek Jahn-Teller",
                caption = "Kirana memaparkan diagram energi kuantum Tanabe-Sugano dan fenomena distorsi geometri Jahn-Teller.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Diagram Tanabe-Sugano memetakan seluruh pita transisi elektronik spektroskopi UV-Vis untuk sembarang konfigurasi d^n! Dan pada kompleks d⁹ seperti Cu²⁺, Teorema Jahn-Teller mendistorsi oktahedral menjadi memanjang di sumbu z untuk menghilangkan degenerasi orbital e_g!"
            )
        ),
        intuition = "Teori Medan Ligan (Ligand Field Theory / LFT) menyempurnakan kelemahan Teori Medan Kristal elektrostatik dengan memperhitungkan tumpang tindih kovalen orbital antara logam transisi dan ligan. Deret spektrokimia dijelaskan secara elegan oleh interaksi orbital pi: Ligan donor-pi (seperti I⁻, Cl⁻) menaikkan energi orbital t_2g dan memperkecil Delta_o; ligan akseptor-pi (seperti CN⁻, CO) menstabilkan t_2g melalui ikatan balik pi (pi-backbonding) dan memperbesar Delta_o secara raksasa. Diagram Tanabe-Sugano menyajikan grafik tingkat energi tereksitasi relatif E/B terhadap kekuatan medan ligan Delta/B untuk menginterpretasikan spektrum elektronik UV-Vis. Teorema Jahn-Teller membuktikan bahwa sembarang sistem nonlinear berkeadaan dasar elektronik degenerat (seperti kompleks oktahedral Cu²⁺ d⁹: t_2g⁶ e_g³) akan mengalami distorsi geometris spontan (perpanjangan aksial sumbu z) untuk menurunkan simetri dan menstabilkan energi sistem.",
        intuitionPoints = listOf(
            "Ikatan Balik Pi (Pi-Backbonding): transfer kerapatan elektron dari orbital d terisi logam ke orbital pi* kosong ligan (akseptor pi), memperkuat ikatan Logam-Karbon dan memperlemah ikatan C≡O (menggeser serapan vibrasi IR C=O ke bilangan gelombang lebih rendah).",
            "Diagram Tanabe-Sugano: sumbu-x adalah kekuatan medan ligan Delta/B (di mana B adalah parameter repulsi antar-elektron Racah), sumbu-y adalah energi transisi E/B. Garis vertikal putus-putus menandai batas transisi dari kompleks spin-tinggi ke spin-rendah.",
            "Teorema Jahn-Teller: sistem molekuler nonlinear dengan keadaan dasar terdegenerasi secara orbital tidak stabil dan akan mengalami distorsi geometris untuk menurunkan simetri dan memecah degenerasi.",
            "Distorsi Jahn-Teller Kuat terjadi pada konfigurasi oktahedral dengan keterisian asimetris pada orbital e_g yang mengarah langsung ke ligan: d⁹ (Cu²⁺), d⁴ spin tinggi (Cr²⁺, Mn³⁺), dan d⁷ spin rendah (Co²⁺, Ni³⁺)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Parameter Repulsi Antar-Elektron Racah (Deret Nefelauxetik)",
                latexFormula = "\\beta = \\frac{B_{\\text{kompleks}}}{B_{\\text{ion bebas}}} < 1",
                description = "Rasio nefelauxetik beta mengukur tingkat delokalisasi kovalen awan elektron d logam ke arah ligan (semakin kecil beta, semakin kovalen ikatannya).",
                variableMeanings = mapOf(
                    "\\beta" to "Parameter reduksi nefelauxetik (cloud-expanding ratio)",
                    "B_kompleks" to "Parameter Racah repulsi interelektronik dalam kompleks",
                    "B_ion bebas" to "Parameter Racah pada kation gas bebas"
                )
            ),
            FormulaCard(
                title = "Pemisahan Orbital d Akibat Distorsi Jahn-Teller Tetragona",
                latexFormula = "e_g \\xrightarrow{\\text{distorsi}} \\begin{cases} d_{x^2 - y^2} & (+\\frac{1}{2}\\delta_1) \\\\ d_{z^2} & (-\\frac{1}{2}\\delta_1) \\end{cases} \\quad ; \\quad t_{2g} \\xrightarrow{} \\begin{cases} d_{xy} & (+ \\frac{2}{3}\\delta_2) \\\\ d_{xz}, d_{yz} & (-\\frac{1}{3}\\delta_2) \\end{cases}",
                description = "Pemecahan degenerasi orbital d pada distorsi perpanjangan oktahedral sepanjang sumbu z (z-out).",
                variableMeanings = mapOf(
                    "\\delta_1" to "Pemisahan energi orbital e_g",
                    "\\delta_2" to "Pemisahan energi orbital t_2g",
                    "d_{z^2}" to "Energi turun karena ligan pada sumbu z menjauh"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengembangan Pewarna Kompleks Rutenium untuk Sel Surya Tersensitisasi Pewarna (DSSC) di BRIN Bandung",
            industry = "Teknologi Sel Surya Generasi Baru & Kimia Anorganik Fotonika",
            context = "Pusat Riset Fotonika BRIN di Bandung mengembangkan sel surya Dye-Sensitized Solar Cell (DSSC) berbiaya rendah berbasis semikonduktor TiO₂ mesopori.",
            problem = "Molekul pewarna organik biasa mudah terdegradasi oleh fotobleaching sinar matahari dan hanya menyerap spektrum sempit cahaya tampak (efisiensi konversi rendah < 4%).",
            solution = "Peneliti merancang kompleks koordinasi heteroleptik rutenium(II) [Ru(dcbpy)₂(NCS)₂] (dikenal sebagai Pewarna N3). Berdasarkan Teori Medan Ligan dan Diagram Tanabe-Sugano d⁶ spin rendah, ligan bipiridin bertindak sebagai akseptor-pi kuat yang menurunkan tingkat orbital pi* molekuler tepat di atas orbital t_2g Ru²⁺. Hal ini memicu pita serapan transfer muatan logam-ke-ligan (Metal-to-Ligand Charge Transfer / MLCT) berintensitas masif di seluruh spektrum cahaya tampak hingga inframerah dekat (400–750 nm). Elektron yang tereksitasi ke ligan bipiridin diinjeksikan secara ultra-cepat dalam waktu 20 femtosekon ke pita konduksi TiO₂, melonjakkan efisiensi sel surya DSSC hingga 11.2%.",
            lessonsLearned = "Teori Medan Ligan dan rekayasa transfer muatan orbital kuantum adalah kunci terdepan perancangan material fotovoltaik dan fotokatalisis hidrogen masa depan."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Spektroskopi Visual Perubahan Warna Kompleks Kobalt(II) Klorida Termokromik",
            objective = "Mengamati langsung pergeseran kesetimbangan medan ligan oktahedral vs tetrahedral dan perubahan pemisahan orbital d akibat suhu.",
            materialsNeeded = listOf(
                "Kristal Kobalt(II) Klorida heksahidrat (CoCl2·6H2O) atau kertas indikator kelembaban kobalt klorida",
                "Alkohol isopropil 70% atau etanol (50 mL)",
                "Air keran (5 mL)",
                "2 wadah kaca (satu berisi air es dingin, satu berisi air panas)",
                "Tabung reaksi atau botol kaca kecil"
            ),
            steps = listOf(
                "Larutkan sedikit kristal CoCl2 ke dalam 30 mL alkohol yang ditambahkan beberapa tetes air hingga larutan berwarna ungu kemerahan pada suhu ruang.",
                "Pada suhu ruang, terjadi kesetimbangan antara kompleks oktahedral merah muda [Co(H2O)6]²⁺ dan kompleks tetrahedral biru pekat [CoCl4]²⁻.",
                "Celupkan botol ke dalam wadah air es dingin: amati perubahan warna seketika menjadi MERAH MUDA terang! (Suhu rendah menggeser kesetimbangan ke kompleks oktahedral medan kuat eksotermik).",
                "Pindahkan botol ke dalam wadah air panas (70°C): amati perubahan dramatis seketika larutan berubah warna menjadi BIRU TUA PEKAT! (Suhu tinggi menggeser kesetimbangan ke kompleks tetrahedral medan lemah endotermik).",
                "Simpulkan: Perubahan geometri dari oktahedral ke tetrahedral memperkecil pemisahan medan orbital d (Delta_t = 4/9 Delta_o), menggeser serapan cahaya dari hijau ke merah, mengubah warna tampak dari merah muda ke biru pekat!"
            ),
            safetyNotes = listOf(
                "Senyawa kobalt tidak boleh tertelan dan hindari kontak kulit langsung.",
                "Gunakan sarung tangan dan cuci tangan setelah praktikum."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-lft-tanabe-1",
                prompt = "Mengapa ligan karbon monoksida (CO) dan sianida (CN⁻) berada di urutan paling kanan (paling kuat) dalam deret spektrokimia pemisahan orbital d, jauh melampaui anion halida seperti I⁻ dan Br⁻?",
                type = "multiple_choice",
                options = listOf(
                    "Karena ligan CO dan CN⁻ bertindak sebagai akseptor-pi yang menerima kerapatan elektron dari orbital d logam (pi-backbonding), menstabilkan orbital t_2g dan memperbesar selisih energi Delta_o",
                    "Karena molekul CO memiliki massa molekul yang paling berat",
                    "Karena gas CO tidak dapat bereaksi dengan oksigen",
                    "Karena ligan halida bermuatan netral sedangkan CO bermuatan negatif empat"
                ),
                correctAnswer = "Karena ligan CO dan CN⁻ bertindak sebagai akseptor-pi yang menerima kerapatan elektron dari orbital d logam (pi-backbonding), menstabilkan orbital t_2g dan memperbesar selisih energi Delta_o",
                hints = listOf(
                    "Tinjau orbital molekul pi* kosong pada molekul CO.",
                    "Ikatan balik pi menurunkan energi orbital t_2g ikatan, sehingga jaraknya ke e_g (Delta_o) semakin lebar."
                ),
                explanation = "Berdasarkan Teori Medan Ligan (LFT), ligan CO dan CN⁻ adalah ligan akseptor-pi yang kuat. Ligan ini memiliki orbital molekul anti-ikatan pi* kosong yang memiliki energi dan simetri yang sesuai untuk bertumpang-tindih dengan orbital t_2g terisi milik logam transisi. Interaksi ikatan balik pi (pi-backbonding) ini menurunkan energi orbital t_2g, yang secara drastis memperlebar selisih energi pemisahan medan ligan Delta_o antara t_2g dan e_g*, menempatkannya di puncak deret spektrokimia.",
                misconception = "Mengira kekuatan pemisahan ligan ditentukan murni oleh muatan elektrostatik ionik (padahal menurut elektrostatik murni anion I⁻ seharusnya lebih kuat dari molekul netral CO, yang bertentangan dengan fakta eksperimen)."
            ),
            QuizQuestion(
                id = "q-lft-tanabe-2",
                prompt = "Ion logam transisi oktahedral manakah di bawah ini yang akan mengalami DISTORSI JAHN-TELLER PALING KUAT pada suhu ruang?",
                type = "multiple_choice",
                options = listOf(
                    "Tembaga(II), Cu²⁺ (konfigurasi d⁹)",
                    "Kromium(III), Cr³⁺ (konfigurasi d³)",
                    "Besi(III), Fe³⁺ spin tinggi (konfigurasi d⁵)",
                    "Nikel(II), Ni²⁺ (konfigurasi d⁸)"
                ),
                correctAnswer = "Tembaga(II), Cu²⁺ (konfigurasi d⁹)",
                hints = listOf(
                    "Distorsi Jahn-Teller kuat terjadi jika orbital e_g terisi secara asimetris (memiliki 1 atau 3 elektron).",
                    "Cu²⁺ memiliki konfigurasi t_2g⁶ e_g³ (orbital e_g terisi asimetris 3 elektron).",
                    "Cr³⁺ (t_2g³), Fe³⁺ (t_2g³ e_g²), dan Ni²⁺ (t_2g⁶ e_g²) semuanya memiliki keterisian simetris."
                ),
                explanation = "Teorema Jahn-Teller memprediksi distorsi geometris kuat jika orbital e_g terisi secara tidak simetris, karena cuping orbital e_g mengarah tepat menabrak ligan. Ion Cu²⁺ (d⁹) memiliki konfigurasi t_2g⁶ e_g³ di mana orbital e_g memiliki 3 elektron (satu orbital e_g berpasangan dan satu orbital e_g berisi elektron tunggal). Ketidaksetaraan tolakan elektron ini menyebabkan dua ligan pada sumbu z menjauh memanjang (z-out tetragonally distorted), menghasilkan distorsi Jahn-Teller yang sangat besar. Sebaliknya, d³ (t_2g³), d⁵ high-spin (t_2g³ e_g²), dan d⁸ (t_2g⁶ e_g²) terisi simetris sehingga tidak mengalami distorsi Jahn-Teller.",
                misconception = "Mengira semua kompleks logam transisi mengalami distorsi Jahn-Teller dalam derajat yang sama."
            )
        )
    )

    private fun getAnorganikOrganologam18ElektronLesson(): LessonData = LessonData(
        conceptId = "kim-anorganik-organologam-18-elektron",
        storyPanels = listOf(
            StoryPanel(
                id = "p-organologam-1",
                panelNumber = 1,
                title = "Keajaiban Senyawa Sandwich Ferosena",
                caption = "Dimas membaca penemuan spektakuler Ferosena Fe(C₅H₅)₂ pada tahun 1951: sebuah atom besi dijepit di antara dua cincin hidrokarbon aromatik datar membentuk struktur roti lapis (sandwich) yang stabil hingga suhu 400°C!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana bisa atom logam besi terikat stabil di antara dua cincin karbon organik tanpa terurai atau teroksidasi oleh udara?"
            ),
            StoryPanel(
                id = "p-organologam-2",
                panelNumber = 2,
                title = "Aturan Emas 18 Elektron",
                caption = "Kakek menjelaskan aturan kestabilan konfigurasi gas mulia untuk senyawa organologam blok-d.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Atom gas mulia stabil dengan 8 elektron oktet (s² p⁶). Logam transisi memiliki tambahan 5 orbital d, sehingga kulit valensi penuhnya membutuhkan 2 + 6 + 10 = 18 elektron! Ferosena memiliki Fe²⁺ (6e⁻) ditambah dua cincin Cp⁻ (masing-masing donor 6e⁻): total tepat 18 elektron!"
            ),
            StoryPanel(
                id = "p-organologam-3",
                panelNumber = 3,
                title = "Siklus Reaksi Katalisis Industri",
                caption = "Kirana memaparkan empat tahap dasar siklus katalisis homogen: adisi oksidatif, insersi migratori, eliminasi reduktif, dan transfer beta-hidrida.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kompleks organologam bertindak seperti mesin molekuler! Katalis bergantian antara keadaan 16 elektron dan 18 elektron untuk memotong ikatan hidrogen H-H dan menggabungkannya ke alkena melalui Katalis Wilkinson!"
            )
        ),
        intuition = "Kimia Organologam mempelajari senyawa yang memiliki ikatan langsung antara atom logam dan atom karbon organik (ikatan M-C). Senyawa organologam blok-d yang stabil umumnya mematuhi Aturan 18 Elektron (ekivalen aturan oktet untuk blok-d, memenuhi konfigurasi orbital s + 3p + 5d = 9 orbital = 18 elektron valensi). Ligan organologam diklasifikasikan berdasarkan jumlah elektron yang didonasikan: ligan karbonil CO (donor 2e⁻), ligan fosfina PPh3 (donor 2e⁻), ligan hidrida H⁻ (donor 2e⁻ ionik), dan ligan aromatik siklopentadienil eta⁵-Cp (donor 6e⁻). Dinamika siklus katalisis homogen bertumpu pada empat reaksi elementer: (1) Adisi Oksidatif (logam naik 2 biloks, n+2 elektron); (2) Insersi Migratori; (3) Eliminasi Beta-Hidrida; dan (4) Eliminasi Reduktif (logam turun 2 biloks, regenerasi katalis aktif).",
        intuitionPoints = listOf(
            "Aturan 18 Elektron: Jumlah elektron valensi logam netral + elektron yang didonasikan seluruh ligan - muatan kompleks = 18.",
            "Ligan Karbonil M-CO: bersifat donor sigma dari pasangan elektron bebas karbon dan akseptor pi kuat dari orbital d terisi logam (pi-backbonding sinergis).",
            "Haptisitas (eta^n): menyatakan jumlah atom karbon dari ligan yang terikat secara simultan ke pusat logam (contoh: eta⁵-Cp terikat melalui seluruh 5 atom karbon cincin).",
            "Adisi Oksidatif: substrat A-B memutus ikatannya dan berikatan ke logam: bilangan oksidasi logam bertambah +2, bilangan koordinasi bertambah +2, jumlah elektron valensi bertambah +2.",
            "Eliminasi Reduktif: kebalikan adisi oksidatif, menggabungkan dua ligan membentuk produk ikatan C-C atau C-H baru dan meregenerasi kompleks 16-elektron katalis aktif."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Penghitungan Elektron Valensi Kompleks Organologam",
                latexFormula = "\\text{Jumlah Elektron} = e^-_{\\text{valensi Logam Netral}} + \\sum e^-_{\\text{Ligan Netral}} - q_{\\text{kompleks}} = 18",
                description = "Metode atom netral (metode kovalen) untuk memprediksi kestabilan termodinamika kompleks organologam.",
                variableMeanings = mapOf(
                    "e^-_{valensi}" to "Nomor golongan logam transisi (Fe = 8, Ni = 10, Rh = 9)",
                    "e^-_{Ligan}" to "Jumlah elektron donasi ligan netral (CO = 2, PR3 = 2, H = 1, CH3 = 1, Cp = 5)",
                    "q" to "Muatan total kompleks"
                )
            ),
            FormulaCard(
                title = "Tahap Kunci Siklus Katalisis Wilkinson",
                latexFormula = "[\\text{Rh}^\\text{I}\\text{Cl(PPh}_3\\text{)}_2] \\xrightarrow{+\\text{H}_2 \\text{ (Adisi Oksidatif)}} [\\text{Rh}^\\text{III}\\text{H}_2\\text{Cl(PPh}_3\\text{)}_2] \\xrightarrow{+\\text{Alkena}} \\cdots \\xrightarrow{\\text{Eliminasi Reduktif}} \\text{Alkana} + [\\text{Rh}^\\text{I}]",
                description = "Siklus katalisis hidrogenasi alkena yang melibatkan perubahan bilangan oksidasi Rh(I) <-> Rh(III).",
                variableMeanings = mapOf(
                    "[\\text{Rh}^\\text{I}]" to "Katalis aktif 14/16 elektron planar persegi",
                    "[\\text{Rh}^\\text{III}]" to "Intermediet dihidrida 18 elektron oktahedral"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Proses Polimerisasi Etilena Katalis Koordinasi Ziegler-Natta di PT Chandra Asri Cilegon",
            industry = "Industri Petrokimia Polimer & Plastik Polietilena",
            context = "PT Chandra Asri Petrochemical di Cilegon memproduksi jutaan ton plastik polietilena berdensitas tinggi (HDPE) untuk pipa air dan kemasan medis steril.",
            problem = "Polimerisasi radikal bebas konvensional menghasilkan polimer bercabang lunak (LDPE). Bagaimana membuat polietilena rantai lurus linier berkekuatan mekanik tinggi tanpa cabang pada suhu dan tekanan rendah?",
            solution = "Pabrik menggunakan sistem katalis koordinasi organologam Ziegler-Natta berbasis kompleks Titanium(IV) klorida (TiCl₄) dan kokatalis alkilaluminium (Al(C₂H₅)₃). Atom titanium memiliki satu sisi koordinasi kosong (14 elektron). Molekul gas etilena terkoordinasi ke pusat Ti melalui ikatan pi-kompleks, lalu mengalami reaksi Insersi Migratori ke dalam ikatan Ti-alkil yang sedang tumbuh secara berulang-ulang ribuan kali per detik. Karena geometri sisi aktif organologam kaku dan terarah, rantai polimer tumbuh lurus tanpa percabangan acak, menghasilkan plastik HDPE berkristalinitas tinggi dan tahan benturan.",
            lessonsLearned = "Kimia organologam koordinasi mengubah industri manufaktur material dunia, memungkinkan perancangan arsitektur polimer dengan presisi molekuler."
        ),
        homeLab = HomeLabData(
            title = "Model Analog Mekanisme Siklus Katalisis Menggunakan Klip Kertas dan Magnet",
            objective = "Memvisualisasikan bagaimana katalis organologam memfasilitasi reaksi penggabungan dua molekul dan melepaskannya kembali tanpa terkonsumsi.",
            materialsNeeded = listOf(
                "1 buah magnet silinder kuat (mewakili pusat Logam Transisi)",
                "2 buah klip kertas logam kecil (mewakili molekul Reaktan A dan B)",
                "1 karet gelang kecil"
            ),
            steps = listOf(
                "Keadaan Awal: Reaktan A dan Reaktan B terpisah dan tidak bereaksi karena penghalang energi aktivasi tumbukan terlalu tinggi.",
                "Tahap 1 (Koordinasi / Adisi): Tempelkan klip kertas A dan klip kertas B ke kutub magnet. Keduanya sekarang terikat erat berdampingan pada pusat logam (analog pembentukan kompleks 18 elektron).",
                "Tahap 2 (Insersi Migratori): Pasang karet gelang melingkari kedua klip kertas yang sedang menempel pada magnet. Kehadiran pusat magnet menahan kedua reaktan pada jarak dan orientasi geometri yang tepat sehingga ikatan baru mudah terbentuk!",
                "Tahap 3 (Eliminasi Reduktif): Tarik gabungan klip kertas berkaret (Produk Baru A-B) menjauh dari magnet. Produk terlepas utuh ke larutan.",
                "Amati keadaan magnet di akhir siklus: Magnet kembali bersih, utuh, dan siap mengikat pasangan klip kertas berikutnya!",
                "Simpulkan: Ini adalah representasi mekanis dari siklus katalisis organologam di mana katalis menurunkan energi aktivasi dengan memegang reaktan dalam orientasi spasial optimal."
            ),
            safetyNotes = listOf(
                "Aktivitas penalaran visual yang aman dan mendidik."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-organologam-1",
                prompt = "Berapakah jumlah total elektron valensi pada kompleks organologam Kromium heksakarbonil, Cr(CO)₆, berdasarkan aturan 18 elektron (metode atom netral: Cr golongan 6, ligan CO mendonasikan 2 elektron)?",
                type = "numeric",
                correctAnswer = "18",
                tolerance = 0.05f,
                unit = "elektron",
                hints = listOf(
                    "Atom Kromium netral (Cr) memiliki 6 elektron valensi (golongan 6).",
                    "Setiap ligan karbonil (CO) mendonasikan 2 elektron.",
                    "Ada 6 ligan CO: 6 · 2 = 12 elektron.",
                    "Total elektron = 6 + 12 = ...?"
                ),
                explanation = "Berdasarkan metode penghitungan elektron atom netral: Logam Kromium (Cr) berada di golongan 6 tabel periodik sehingga menyumbang 6 elektron valensi. Terdapat 6 ligan karbonil (CO), di mana masing-masing ligan CO mendonasikan 2 elektron (total 6 · 2 = 12 elektron). Total elektron valensi = 6 + 12 = 18 elektron. Kompleks ini mematuhi Aturan 18 Elektron secara sempurna, menjadikannya senyawa padat putih yang sangat stabil dan inert.",
                misconception = "Lupa mengalikan jumlah ligan CO dengan 2 elektron per ligan."
            ),
            QuizQuestion(
                id = "q-organologam-2",
                prompt = "Pada tahap reaksi elementer Adisi Oksidatif (Oxidative Addition) dalam siklus katalisis organologam, apa yang terjadi dengan bilangan oksidasi logam dan jumlah elektron valensi kompleks?",
                type = "multiple_choice",
                options = listOf(
                    "Bilangan oksidasi logam BERTAMBAH +2 dan jumlah elektron valensi kompleks BERTAMBAH +2 elektron",
                    "Bilangan oksidasi logam BERKURANG -2 dan jumlah elektron berkurang",
                    "Bilangan oksidasi logam tetap tidak berubah",
                    "Jumlah elektron valensi kompleks selalu berkurang menjadi nol"
                ),
                correctAnswer = "Bilangan oksidasi logam BERTAMBAH +2 dan jumlah elektron valensi kompleks BERTAMBAH +2 elektron",
                hints = listOf(
                    "Contoh: [Rh(I)Cl(PPh3)2] (14 elektron) bereaksi dengan H2 menghasilkan [Rh(III)H2Cl(PPh3)2] (16/18 elektron).",
                    "Dua ikatan baru ke ligan terbentuk, logam dioksidasi."
                ),
                explanation = "Dalam reaksi Adisi Oksidatif, sebuah molekul netral A-B memutus ikatannya dan kedua fragmen (A dan B) berikatan langsung ke pusat logam sebagai dua ligan baru. Akibatnya, bilangan oksidasi logam teroksidasi naik +2 (misalnya dari Logam(0) menjadi Logam(II), atau Rh(I) menjadi Rh(III)), bilangan koordinasi bertambah +2, dan jumlah total elektron valensi kompleks bertambah +2 elektron (misalnya dari kompleks 16-elektron menjadi 18-elektron).",
                misconception = "Mengira adisi oksidatif menurunkan bilangan oksidasi (oksidasi selalu berarti kenaikan bilangan oksidasi)."
            )
        )
    )

    private fun getAnorganikZatPadatKisiLesson(): LessonData = LessonData(
        conceptId = "kim-anorganik-zat-padat-kisi",
        storyPanels = listOf(
            StoryPanel(
                id = "p-kisi-padat-1",
                panelNumber = 1,
                title = "Di Balik Kesempurnaan Kristal Garam",
                caption = "Dimas mengamati sebutir kristal garam dapur di bawah lup pembesar: bentuknya kubus sempurna dengan permukaan kaca mengkilap. Namun dosen fisika zat padat menyebut bahwa kristal yang 100% sempurna tidak akan pernah menghantarkan ion listrik sama sekali!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika kristal garam kubus tersusun rapat tanpa celah, bagaimana ion listrik bisa bergerak di dalam baterai zat padat?"
            ),
            StoryPanel(
                id = "p-kisi-padat-2",
                panelNumber = 2,
                title = "Cacat Kisi Schottky dan Frenkel",
                caption = "Kakek menjelaskan termodinamika cacat titik kristal riil.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Pada suhu di atas nol mutlak, entropi menuntut adanya ketidaksempurnaan kristal, Dimas! Cacat Schottky meninggalkan kekosongan sepasang kation dan anion. Cacat Frenkel memindahkan ion ke celah interstisial. Cacat-cacat inilah yang memungkinkan ion melompat dan menghantarkan listrik!"
            ),
            StoryPanel(
                id = "p-kisi-padat-3",
                panelNumber = 3,
                title = "Spons Molekuler Kerangka Logam-Organik (MOF)",
                caption = "Kirana memperlihatkan kristal Metal-Organic Frameworks (MOF) dengan luas permukaan internal ribuan meter persegi per gram.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dengan menghubungkan kation logam dan ligan organik kaku, kita menciptakan kristal berpori raksasa! Satu gram kristal MOF memiliki luas permukaan internal setara satu lapangan sepak bola, mampu menyerap gas beracun dan menangkap karbon dioksida langsung dari udara!"
            )
        ),
        intuition = "Kimia zat padat mempelajari struktur, ikatan, dan sifat fisik kristal anorganik. Kisi kristal terbentuk dari susunan berulang sel satuan periodik (seperti struktur NaCl kisi kubus berpusat muka FCC, ZnS sfalerit, TiO2 rutil, dan CaTiO3 perovskit). Energi kisi (Lattice Energy) dihitung secara empiris melalui Siklus Born-Haber atau dirumuskan secara analitis oleh Persamaan Kapustinskii. Pada kristal nyata, ketidakteraturan termal menciptakan Cacat Titik Intrinsik: Cacat Schottky (kekosongan stoikiometris kation dan anion berpasangan yang menurunkan densitas kristal) dan Cacat Frenkel (ion berukuran kecil melompat ke posisi interstisial tanpa mengubah densitas). Material modern mencakup padatan berpori seperti Zeolit dan Kerangka Logam-Organik (Metal-Organic Frameworks / MOF) yang memiliki luas permukaan spesifik raksasa.",
        intuitionPoints = listOf(
            "Difraksi Sinar-X (Hukum Bragg): n lambda = 2 d sin theta, memungkinkan penentuan jarak antar-bidang kisi kristal d secara atomik.",
            "Persamaan Kapustinskii: menghitung energi kisi U_kisi tanpa mengetahui struktur kristal eksak, hanya berdasarkan jumlah ion nu, muatan z+ dan z-, serta jari-jari ion termokimia r+ dan r-.",
            "Cacat Schottky: vakansi kation dan anion seimbang, menurunkan massa jenis kristal (umum pada senyawa berkoordinasi tinggi dengan ukuran ion mirip, misal NaCl, KCl, CsCl).",
            "Cacat Frenkel: ion (biasanya kation kecil) keluar dari posisi kisi normal dan menempati celah interstisial, tidak mengubah massa jenis (umum pada senyawa berkoordinasi rendah dengan selisih ukuran kation-anion besar, misal AgCl, ZnS).",
            "Kerangka Logam-Organik (MOF): material hibrida berpori kristalin yang dibangun dari simpul klaster ion logam (Secondary Building Units / SBU) dan ligan organik penghubung (linkers)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Hukum Difraksi Sinar-X Kristal Bragg",
                latexFormula = "n \\lambda = 2 d_{hkl} \\sin \\theta",
                description = "Kondisi interferensi konstruktif pantulan sinar-X monokromatik pada bidang kisi kristal (hkl).",
                variableMeanings = mapOf(
                    "n" to "Orde difraksi (1, 2, 3, ...)",
                    "\\lambda" to "Panjang gelombang sinar-X (biasanya Cu K-alfa = 0.154 nm)",
                    "d_{hkl}" to "Jarak antar-bidang kristal (meter atau Angstrom)",
                    "\\theta" to "Sudut datang berkas sinar-X terhadap bidang kristal"
                )
            ),
            FormulaCard(
                title = "Persamaan Energi Kisi Kapustinskii",
                latexFormula = "U_{\\text{kisi}} = \\frac{1.202 \\times 10^5 \\cdot \\nu \\cdot |z_+ z_-|}{r_+ + r_-} \\left(1 - \\frac{34.5}{r_+ + r_-}\\right) \\text{ kJ/mol}",
                description = "Aproksimasi energi kisi senyawa ionik sembarang dari jari-jari ion dalam satuan pikometer (pm).",
                variableMeanings = mapOf(
                    "\\nu" to "Jumlah total ion per unit formula (misal NaCl: nu = 2, CaCl2: nu = 3)",
                    "z_+, z_-" to "Valensi muatan kation dan anion",
                    "r_+, r_-" to "Jari-jari ionik kation dan anion (pikometer, pm)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Aplikasi Metal-Organic Framework MOF-74 untuk Penangkapan Emisi CO2 di PLTU Suralaya",
            industry = "Teknologi Penangkapan Karbon (Carbon Capture) & Pengendalian Emisi",
            context = "Pembangkit Listrik Tenaga Uap (PLTU) Suralaya di Banten menghasilkan gas buang cerobong pembakaran batubara yang mengandung 14% gas karbon dioksida (CO₂).",
            problem = "Teknologi absorbsi kimia menggunakan larutan amina cair konvensional (MEA) memerlukan energi regenerasi termal yang sangat boros dan menimbulkan limbah amina korosif beracun.",
            solution = "Pusat Riset Material Maju BRIN menguji material padatan kristal berpori Magnesium-MOF-74 [Mg₂(DOBDC)]. Struktur kristal MOF-74 memiliki saluran pori heksagonal 1D berdiameter 1.2 nm dengan dinding yang dipenuhi sisi kation logam Mg²⁺ terbuka (open metal sites). Momen kuadrupol gas CO₂ berinteraksi kuat secara elektrostatik dengan kation Mg²⁺ terbuka, memungkinkan penyerapan selektif CO₂ hingga 8.6 mmol per gram MOF pada tekanan parsial 0.15 bar, 5 kali lebih tinggi dibanding zeolit 13X. Pelepasan gas CO₂ murni dapat dilakukan murni dengan penurunan tekanan vakum (Vacuum Swing Adsorption) tanpa pemanasan boros energi.",
            lessonsLearned = "Rekayasa kisi kristal zat padat dan sintesis material berpori MOF adalah garda terdepan teknologi dekarbonisasi global dalam mengatasi krisis perubahan iklim."
        ),
        homeLab = HomeLabData(
            title = "Penumbuhan Kristal Tunggal Tawas Oktahedral Raksasa di Rumah",
            objective = "Mengamati pembentukan kisi kristal makroskopis dan faset permukaan kristal oktahedral dari larutan lewat jenuh.",
            materialsNeeded = listOf(
                "Bubuk tawas putih (Kalium Aluminium Sulfat, KAl(SO4)2·12H2O) - 100 gram (tersedia di apotek/pasar)",
                "Air mendidih (300 mL)",
                "2 gelas kaca bening tahan panas",
                "Benang jahit dan pensil"
            ),
            steps = listOf(
                "Larutkan 100 gram bubuk tawas ke dalam 300 mL air mendidih sedikit demi sedikit sambil diaduk hingga tidak ada lagi tawas yang bisa larut (larutan jenuh panas).",
                "Saring larutan panas ke dalam gelas bersih kedua dan biarkan dingin perlahan semalaman di tempat tenang tanpa guncangan.",
                "Keesokan harinya, amati dasar gelas: telah terbentuk beberapa kristal bening kecil berwujud oktahedron (seperti dua piramida yang dasarnya menempel).",
                "Pilih satu kristal kecil yang paling sempurna bentuknya sebagai 'bibit kristal' (seed crystal).",
                "Ikat bibit kristal dengan benang jahit tipis, lalu gantungkan tepat di tengah larutan tawas jenuh menggunakan pensil sebagai penopang di mulut gelas.",
                "Biarkan selama 5–7 hari: amati bibit kristal tumbuh membesar menjadi kristal tunggal oktahedral transparan seukuran ibu jari yang sangat indah dengan sudut faset tajam sempurna!",
                "Simpulkan: Bentuk makroskopis kristal oktahedron tersebut mencerminkan langsung susunan simetri kisi kristal kubus mikroskopis ion K⁺, Al³⁺, dan SO₄²⁻!"
            ),
            safetyNotes = listOf(
                "Gunakan air panas dengan hati-hati.",
                "Tawas aman disentuh tetapi tidak untuk dimakan."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kisi-padat-1",
                prompt = "Apakah perbedaan utama antara Cacat Schottky dan Cacat Frenkel pada kristal ionik?",
                type = "multiple_choice",
                options = listOf(
                    "Cacat Schottky merupakan kekosongan pasangan kation-anion stoikiometris yang menurunkan massa jenis kristal, sedangkan Cacat Frenkel merupakan perpindahan ion ke celah interstisial tanpa mengubah massa jenis kristal",
                    "Cacat Schottky hanya terjadi pada kristal cair sedangkan cacat Frenkel terjadi pada gas",
                    "Cacat Schottky selalu mengubah warna kristal menjadi hitam",
                    "Cacat Frenkel melipatgandakan massa total kristal menjadi dua kali lipat"
                ),
                correctAnswer = "Cacat Schottky merupakan kekosongan pasangan kation-anion stoikiometris yang menurunkan massa jenis kristal, sedangkan Cacat Frenkel merupakan perpindahan ion ke celah interstisial tanpa mengubah massa jenis kristal",
                hints = listOf(
                    "Schottky = kekosongan (vakansi kation dan anion seimbang).",
                    "Frenkel = ion berpindah posisi (vakansi + interstisial).",
                    "Pikirkan apa yang terjadi pada volume dan massa total kristal."
                ),
                explanation = "Cacat Schottky terjadi ketika sejumlah pasangan kation dan anion yang setara secara stoikiometris hilang dari posisi kisinya, menciptakan ruang kosong di dalam kristal; karena volume kristal tetap tetapi atom berkurang, massa jenis kristal menurun. Sebaliknya, Cacat Frenkel terjadi ketika suatu ion (biasanya kation berukuran lebih kecil) terdislokasi dari posisi kisi normalnya menuju ke ruang celah interstisial di sekitarnya; karena tidak ada atom yang meninggalkan kristal, massa jenis kristal tetap tidak berubah.",
                misconception = "Mengira cacat kisi adalah kerusakan yang merugikan (padahal cacat kisi sengaja diciptakan untuk membuat semikonduktor dan elektrolit baterai padat)."
            ),
            QuizQuestion(
                id = "q-kisi-padat-2",
                prompt = "Berdasarkan Hukum Difraksi Sinar-X Bragg n lambda = 2 d sin theta, pada sudut pantul theta berapakah puncak difraksi orde pertama (n = 1) teramati jika jarak antar-bidang kristal d = 0.154 nm dan panjang gelombang sinar-X yang digunakan lambda = 0.154 nm?",
                type = "numeric",
                correctAnswer = "30",
                tolerance = 0.5f,
                unit = "derajat",
                hints = listOf(
                    "Gunakan n lambda = 2 d sin theta.",
                    "1 · (0.154 nm) = 2 · (0.154 nm) · sin theta.",
                    "sin theta = 0.154 / (2 · 0.154) = 1/2.",
                    "Sudut theta berapakah yang memiliki nilai sin theta = 0.5?"
                ),
                explanation = "Berdasarkan Hukum Bragg: n lambda = 2 d sin theta. Substitusikan nilai: 1 · (0.154 nm) = 2 · (0.154 nm) sin theta <=> 1 = 2 sin theta <=> sin theta = 1/2 = 0.5. Sudut yang memenuhi sin theta = 0.5 adalah theta = 30° (atau 2 theta = 60° pada sudut difraktometer XRD).",
                misconception = "Lupa membagi dengan angka 2 pada persamaan Bragg sehingga mengira sin theta = 1 (theta = 90°)."
            )
        )
    )

    private fun getFisikaTermodinamikaStatistikLesson(): LessonData = LessonData(
        conceptId = "kim-fisika-termodinamika-statistik",
        storyPanels = listOf(
            StoryPanel(
                id = "p-termo-stat-kim-1",
                panelNumber = 1,
                title = "Menghitung Kesetimbangan dari Frekuensi Spektrum",
                caption = "Dimas heran melihat fisikawan kimia dapat memprediksi konstanta kesetimbangan reaksi fasa gas K_p pada suhu 1000 K tanpa pernah melakukan reaksi kimia di laboratorium sama sekali!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana mungkin kita menghitung konstanta kesetimbangan K murni dari data jarak ikatan dan frekuensi getaran molekul hasil spektroskopi?"
            ),
            StoryPanel(
                id = "p-termo-stat-kim-2",
                panelNumber = 2,
                title = "Fungsi Partisi Molekuler Terfaktor",
                caption = "Kakek menjelaskan bagaimana energi molekuler terurai menjadi 4 derajat kebebasan independen.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Energi molekul adalah penjumlahan independen: E = E_trans + E_rot + E_vib + E_elek! Oleh karena itu fungsi partisi molekuler terfaktor sempurna menjadi perkalian q = q_trans · q_rot · q_vib · q_elek!"
            ),
            StoryPanel(
                id = "p-termo-stat-kim-3",
                panelNumber = 3,
                title = "Derivasi Sifat Termodinamika Murni",
                caption = "Kirana menghubungkan fungsi partisi total Q dengan fungsi termodinamika makroskopis.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dari ln Q, seluruh sifat makroskopis diturunkan secara analitis kalkulus: Energi dalam U = k_B T² d(ln Q)/dT, Entropi S = k_B ln Q + U/T, dan Energi Bebas Gibbs G = -k_B T ln(Q/N!). Kesetimbangan kimia terbukti murni berasal dari hukum mekanika kuantum statistik!"
            )
        ),
        intuition = "Termodinamika statistik kimia adalah jembatan kuantum yang menurunkan seluruh sifat termodinamika makroskopis (entalpi, entropi, energi bebas Gibbs, dan konstanta kesetimbangan) murni dari parameter mikroskopis molekul terisolasi (massa atom, momen inersia rotasi, frekuensi vibrasi spektroskopi, dan tingkat energi elektronik). Karena derajat kebebasan molekul gas bersifat mendekati independen, fungsi partisi molekuler q terfaktor menjadi perkalian empat kontribusi: q = q_trans · q_rot · q_vib · q_elek. Konstanta kesetimbangan reaksi kimia K_p dapat dihitung secara teoritis dengan presisi tinggi melalui rasio fungsi partisi standar dikalikan faktor energi keadaan dasar Bolztmann exp(-delta E_0 / RT).",
        intuitionPoints = listOf(
            "Fungsi Partisi Translasi: q_trans = (2 pi m k_B T / h²)^(3/2) · V, mendominasi nilai numerik q (~10²⁸–10³⁰).",
            "Fungsi Partisi Rotasi: q_rot = k_B T / (sigma h B) untuk molekul diatomik linier (di mana sigma adalah bilangan simetri dan B konstanta rotasi).",
            "Fungsi Partisi Vibrasi: q_vib = prod 1 / (1 - exp(-h nu_i / k_B T)), di mana setiap modus vibrasi bertindak sebagai osilator harmonik.",
            "Fungsi Partisi Elektronik: q_elek = g_0 exp(-E_0 / k_B T), di mana g_0 adalah degenerasi keadaan dasar elektronik (g_0 = 1 untuk molekul tertutup, g_0 = 3 untuk O₂ triplet).",
            "Relasi Kesetimbangan Kimia: K_c(T) = prod (q_i / V)^nu_i · exp(-delta E_0 / k_B T)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Faktorisasi Fungsi Partisi Molekuler",
                latexFormula = "q(V, T) = q_{\\text{trans}} \\cdot q_{\\text{rot}} \\cdot q_{\\text{vib}} \\cdot q_{\\text{elek}}",
                description = "Pemisahan derajat kebebasan independen molekul gas ideal.",
                variableMeanings = mapOf(
                    "q_trans" to "Fungsi partisi gerak translasi ruang 3D",
                    "q_rot" to "Fungsi partisi rotasi orientasi molekul",
                    "q_vib" to "Fungsi partisi getaran ikatan intramolekuler",
                    "q_elek" to "Fungsi partisi eksitasi tingkat elektronik"
                )
            ),
            FormulaCard(
                title = "Konstanta Kesetimbangan dari Fungsi Partisi",
                latexFormula = "K_c(T) = \\left( \\prod_{j} \\left( \\frac{q_j^\\circ}{V} \\right)^{\\nu_j} \\right) e^{-\\frac{\\Delta E_0}{R T}}",
                description = "Perhitungan konstanta kesetimbangan kimia teoretis eksak dari data spektroskopi kuantum murni.",
                variableMeanings = mapOf(
                    "q_j^\\circ / V" to "Fungsi partisi standar per satuan volume dari spesies j",
                    "\\nu_j" to "Koefisien stoikiometri spesies j (positif untuk produk, negatif untuk reaktan)",
                    "\\Delta E_0" to "Perbedaan energi titik nol reaksi kuantum pada 0 K"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Perhitungan Termodinamika Statistik Pirolisis Biomassa Sawit di Pusat Riset BRIN",
            industry = "Teknologi Energi Terbarukan & Pemodelan Termokimia Gasifikasi",
            context = "Pusat Riset Sistem Produksi Berkelanjutan BRIN merancang reaktor pirolisis gasifikasi tandan kosong kelapa sawit untuk memproduksi gas sintesis (syngas: CO dan H₂) pada suhu 700–1000°C.",
            problem = "Pada suhu 900°C, reaksi kesetimbangan gas air (Water-Gas Shift: CO + H₂O ⇌ CO₂ + H₂) berlangsung sangat cepat. Data entalpi eksperimen pada suhu setinggi itu sulit diukur dan penuh galat kalorimetri.",
            solution = "Peneliti kimia komputasi BRIN menghitung konstanta kesetimbangan K_p(T) dari fungsi partisi termodinamika statistik molekuler menggunakan data spektroskopi inframerah dan konstanta rotasi NIST. Nilai q_trans, q_rot, dan q_vib untuk CO, H₂O, CO₂, dan H₂ dihitung per kenaikan 50 K. Hasil perhitungan analitis menunjukkan bahwa nilai K_p bergeser dari 1.52 pada 700°C menjadi 0.71 pada 950°C. Data ini memungkinkan insinyur mendesain rasio injeksi uap air yang presisi untuk memaksimalkan produksi gas hidrogen bersih sebesar 64% volume.",
            lessonsLearned = "Termodinamika statistik molekuler memungkinkan prediksi reaksi kimia pada suhu dan tekanan ekstrem industri tanpa memerlukan eksperimen fisik berbahaya."
        ),
        homeLab = HomeLabData(
            title = "Model Analog Pengaktifan Derajat Kebebasan Molekul Menggunakan Balok Kayu",
            objective = "Memahami mengapa derajat kebebasan translasi aktif pada suhu rendah, rotasi pada suhu sedang, dan vibrasi baru aktif pada suhu tinggi.",
            materialsNeeded = listOf(
                "1 buah balok kayu kecil (mewakili molekul diatomik)",
                "Nampan plastik lebar",
                "Kelereng atau bola bekel kecil (sebagai partikel tumbukan termal)"
            ),
            steps = listOf(
                "Suhu Sangat Rendah (Energi Rendah): Dorong kelereng sangat pelan ke arah balok kayu. Balok kayu hanya bergeser lurus mendatar (Translasi aktif! q_trans > 1, namun energi belum cukup untuk memutar balok).",
                "Suhu Sedang (Energi Menengah): Lempar kelereng dengan kecepatan sedang. Balok kayu mulai berputar-putar menggelinding di atas nampan (Rotasi aktif! q_rot mulai berkontribusi pada kapasitas kalor).",
                "Suhu Tinggi: Bayangkan dua balok kayu yang dihubungkan pegas baja kaku. Hanya pada tumbukan berenergi sangat tinggi pegas tersebut mulai memendek dan memanjang bergetar (Vibrasi aktif! h nu >> kT).",
                "Simpulkan: Tingkat energi kuantum menentukan bahwa kapasitas kalor gas meningkat bertahap seiring teraktivasinya derajat kebebasan translasi (3/2 R), rotasi (5/2 R), dan akhirnya vibrasi (7/2 R)!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan menggunakan alat peraga sederhana."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-termo-stat-kim-1",
                prompt = "Berapakah nilai fungsi partisi vibrasi q_vib untuk sebuah modus vibrasi molekul pada batas suhu mendekati nol mutlak (T -> 0 Kelvin), di mana k_B T << h nu?",
                type = "numeric",
                correctAnswer = "1",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "Rumus fungsi partisi osilator vibrasi: q_vib = 1 / (1 - exp(-h nu / k_B T)).",
                    "Ketika T -> 0, penyebut pecahan eksponen -h nu / k_B T -> -tak hingga.",
                    "exp(-tak hingga) = 0.",
                    "q_vib = 1 / (1 - 0) = ...?"
                ),
                explanation = "Fungsi partisi osilator harmonik vibrasi adalah q_vib = 1 / [1 - exp(-h nu / k_B T)]. Ketika suhu T mendekati nol mutlak (T -> 0 K), suku h nu / k_B T menjadi sangat besar mendekati tak terhingga, sehingga exp(-h nu / k_B T) mendekati nol. Maka q_vib = 1 / (1 - 0) = 1. Nilai 1 ini menunjukkan bahwa pada suhu nol mutlak, hanya ada tepat satu keadaan mikro yang dapat diakses oleh molekul, yaitu keadaan dasar vibrasi n = 0 (semua molekul terkunci di ground state).",
                misconception = "Mengira fungsi partisi bernilai nol pada T = 0 K (fungsi partisi mengukur jumlah keadaan, sehingga bernilai minimal 1 untuk keadaan dasar)."
            ),
            QuizQuestion(
                id = "q-termo-stat-kim-2",
                prompt = "Mengapa pada suhu ruang (300 K) sebagian besar molekul gas diatomik (seperti N₂ dan O₂) memiliki kontribusi kapasitas kalor vibrasi yang hampir nol, sedangkan kontribusi translasi dan rotasinya aktif penuh?",
                type = "multiple_choice",
                options = listOf(
                    "Karena jarak pemisahan tingkat energi kuantum vibrasi (h nu) jauh lebih besar daripada energi termal rata-rata suhu ruang (k_B T), sehingga molekul tidak mampu tereksitasi ke tingkat vibrasi yang lebih tinggi",
                    "Karena molekul gas diatomik tidak memiliki ikatan kimia yang dapat bergetar",
                    "Karena getaran molekul dilarang oleh hukum kekekalan momentum",
                    "Karena pada suhu ruang kecepatan gerak gas selalu melebihi kecepatan cahaya"
                ),
                correctAnswer = "Karena jarak pemisahan tingkat energi kuantum vibrasi (h nu) jauh lebih besar daripada energi termal rata-rata suhu ruang (k_B T), sehingga molekul tidak mampu tereksitasi ke tingkat vibrasi yang lebih tinggi",
                hints = listOf(
                    "Jarak energi translasi ~ 10⁻³⁷ J; rotasi ~ 10⁻²² J; vibrasi ~ 10⁻²⁰ J.",
                    "Energi termal k_B T pada 300 K adalah sekitar 4.1 x 10⁻²¹ J.",
                    "Bandingkan energi k_B T dengan energi pemisahan vibrasi h nu."
                ),
                explanation = "Tingkat energi kuantum vibrasi molekul diatomik berikatan kuat (seperti N₂ dengan ikatan rangkap tiga yang kaku) memiliki frekuensi getaran sangat tinggi, sehingga kuanta energi vibrasinya h nu (sekitar 4.7 x 10⁻²⁰ J) jauh melampaui energi termal lingkungan k_B T pada 300 K (sekitar 4.1 x 10⁻²¹ J). Probabilitas eksitasi termal Boltzmann exp(-h nu / k_B T) sangat kecil (~ 10⁻⁵), sehingga derajat kebebasan vibrasi 'terbekukan' (frozen out) secara kuantum dan tidak menyerap kalor pada suhu ruang.",
                misconception = "Mengira fisika klasik berlaku di mana semua derajat kebebasan selalu menyerap energi termal secara merata (Teorema Ekipartisi klasik gagal menjelaskan fenomena pembekuan kapasitas kalor ini)."
            )
        )
    )

    private fun getFisikaKuantumMolekulHuckelLesson(): LessonData = LessonData(
        conceptId = "kim-fisika-kuantum-molekul-huckel",
        storyPanels = listOf(
            StoryPanel(
                id = "p-huckel-1",
                panelNumber = 1,
                title = "Misteri Kestabilan Cincin Benzena",
                caption = "Dimas menghitung kalor hidrogenasi benzena C₆H₆ dan menemukan bahwa benzena 152 kJ/mol jauh lebih stabil dan enggan mengalami reaksi adisi dibanding senyawa triena siklik hipotetis.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kenapa tiga ikatan rangkap pada benzena begitu kokoh dan menolak bereaksi seperti alkena biasa?"
            ),
            StoryPanel(
                id = "p-huckel-2",
                panelNumber = 2,
                title = "Penyederhanaan Teori Orbital Pi Hückel",
                caption = "Kakek menjelaskan metode Hückel Molecular Orbital (HMO) karya Erich Hückel (1931).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Hückel memisahkan kerangka sigma dari sistem elektron pi terdelokalisasi! Dengan menetapkan integral Coulomb alpha dan integral resonansi beta, determinan sekuler disederhanakan menjadi matriks aljabar murni yang menghasilkan orbital molekul pi terdelokalisasi!"
            ),
            StoryPanel(
                id = "p-huckel-3",
                panelNumber = 3,
                title = "Aturan Aromatisitas 4n+2 Hückel",
                caption = "Kirana menggambar diagram Frost lingkaran Hückel untuk memprediksi stabilitas aromatik.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Tulis poligon di dalam lingkaran: benzena memiliki 6 elektron pi yang mengisi penuh 3 orbital ikatan berenergi rendah tanpa menyisakan elektron anti-ikatan! Inilah dasar pembuktian kuantum Aturan Hückel 4n+2!"
            )
        ),
        intuition = "Teori Orbital Molekul Hückel (Hückel Molecular Orbital / HMO) adalah metode aproksimasi mekanika kuantum semi-empiris yang sangat brilian untuk menganalisis sistem molekul hidrokarbon terkonjugasi planar. Hückel memisahkan elektron sigma (kerangka kaku) dan elektron pi (terdelokalisasi bebas di atas dan di bawah bidang cincin). Dengan asumsi penyederhanaan: seluruh integral Coulomb bernilai sama (H_ii = alpha), integral resonansi hanya ada antar-atom bersebelahan (H_ij = beta jika terikat, 0 jika tidak), dan integral tumpang tindih S_ij = delta_ij, persamaan Schrödinger terurai menjadi Determinan Sekuler Aljabar. Dari solusi nilai eigen Hückel, energi resonansi kestabilan benzena terbukti bernilai 2 beta (sekitar 152 kJ/mol), membuktikan Aturan Aromatisitas Hückel (4n + 2 elektron pi).",
        intuitionPoints = listOf(
            "Integral Coulomb alpha: energi elektron pi pada orbital p atom karbon terisolasi (bernilai negatif).",
            "Integral Resonansi beta: energi stabilisasi tumpang tindih orbital p antar-dua atom karbon bersebelahan (bernilai negatif).",
            "Determinan Sekuler Hückel: membagi determinan matriks Hamilton dengan beta dan memisalkan x = (alpha - E) / beta.",
            "Tingkat energi orbital pi benzena: E_1 = alpha + 2beta (terendah), E_2 = E_3 = alpha + beta (terdegenerasi), E_4 = E_5 = alpha - beta, E_6 = alpha - 2beta (tertinggi).",
            "Diagram Lingkaran Frost: poligon bersisi n digambar di dalam lingkaran berjejari 2|beta| dengan salah satu sudut menunjuk tepat ke bawah; posisi sudut-sudut poligon langsung memetakan tingkat energi orbital molekul pi secara visual."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Determinan Sekuler Hückel untuk Etilena",
                latexFormula = "\\begin{vmatrix} \\alpha - E & \\beta \\\\ \\beta & \\alpha - E \\end{vmatrix} = 0 \\iff \\begin{vmatrix} x & 1 \\\\ 1 & x \\end{vmatrix} = x^2 - 1 = 0",
                description = "Persamaan nilai eigen Hückel molekul etilena yang menghasilkan dua tingkat energi E = alpha ± beta.",
                variableMeanings = mapOf(
                    "\\alpha" to "Integral Coulomb (energi orbital p terisolasi)",
                    "\\beta" to "Integral resonansi ikatan pi (< 0)",
                    "x = (\\alpha - E)/\\beta" to "Variabel tanpa dimensi aljabar Hückel"
                )
            ),
            FormulaCard(
                title = "Energi Delokalisasi Resonansi Benzena",
                latexFormula = "E_\\pi(\\text{Benzena}) = 2(\\alpha + 2\\beta) + 4(\\alpha + \\beta) = 6\\alpha + 8\\beta \\quad ; \\quad E_{\\text{delokalisasi}} = 2\\beta",
                description = "Kelebihan kestabilan aromatik benzena dibandingkan 3 molekul etilena terisolasi (3 x (2alpha + 2beta) = 6alpha + 6beta).",
                variableMeanings = mapOf(
                    "6\\alpha + 8\\beta" to "Energi total 6 elektron pi dalam sistem delokalisasi benzena",
                    "2\\beta" to "Energi stabilisasi aromatik resonansi benzena (~152 kJ/mol)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sintesis Material Semikonduktor Polianilin Konduktif untuk Layar OLED di Serpong",
            industry = "Elektronika Organik & Polimer Semikonduktor Konduktif",
            context = "Pusat Riset Elektronika BRIN di Serpong memfabrikasi polimer konduktif polianilin (PANI) dan poliasetilena terkonjugasi untuk elektroda transparan fleksibel layar Organic LED (OLED).",
            problem = "Polimer plastik murni adalah isolator listrik sempurna. Bagaimana membuat rantai plastik organik menghantarkan listrik layaknya logam tembaga?",
            solution = "Peneliti merancang delokalisasi elektron pi orbital Hückel sepanjang rantai utama polimer. Berdasarkan teori Hückel untuk rantai tak hingga, tumpang tindih orbital p menghasilkan pita energi terisi penuh (Highest Occupied Molecular Orbital / HOMO / pita valensi) dan pita kosong (Lowest Unoccupied Molecular Orbital / LUMO / pita konduksi) dengan celah pita semikonduktor. Ketika polianilin didoping secara kimiawi dengan uap asam atau iodin, elektron diambil dari pita HOMO menciptakan pembawa muatan kuantum (polaron dan bipolaron) yang bebas bergerak tanpa halangan di sepanjang sistem orbital pi delokalisasi, melipatgandakan konduktivitas listrik hingga 10¹² kali lipat mendekati konduktivitas logam tembaga.",
            lessonsLearned = "Teori kuantum orbital Hückel yang awalnya dirumuskan untuk benzena sederhana kini menjadi fondasi revolusi elektronika organik dan panel surya polimer fleksibel dunia."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Fluoresensi Delokalisasi Elektron Pi Kina pada Air Minum Tonik",
            objective = "Melihat secara kasat mata eksitasi dan relaksasi optik sistem elektron pi terkonjugasi aromatik pada molekul alkaloid kinina.",
            materialsNeeded = listOf(
                "1 botol air minum tonik (Tonic Water yang mengandung perisa kinina / quinine)",
                "Lampu senter ultraviolet (UV blacklight 365–395 nm) atau lampu detektor uang palsu",
                "1 gelas kaca bening transparan",
                "Air putih biasa (sebagai pembanding kontrol)"
            ),
            steps = listOf(
                "Tuangkan 100 mL air tonik ke Gelas A, dan 100 mL air putih biasa ke Gelas B.",
                "Di bawah lampu ruangan biasa, kedua cairan tampak jernih transparan identik.",
                "Matikan lampu ruangan hingga gelap.",
                "Sorotkan lampu senter UV ke Gelas B (air putih): air tetap gelap tanpa reaksi apa pun.",
                "Sekarang sorotkan senter UV ke Gelas A (air tonik): Keajaiban terjadi! Seluruh cairan seketika berpendar memancarkan cahaya biru neon terang benderang yang spektakuler!",
                "Penjelasan Kuantum: Molekul kinina memiliki cincin aromatik kuinolina dengan sistem elektron pi terdelokalisasi Hückel yang luas. Elektron pi menyerap foton UV energi tinggi tak kasat mata (eksitasi HOMO ke LUMO), lalu saat kembali ke keadaan dasar melepaskan sebagian energi sebagai getaran dan memancarkan sisa energi sebagai foton cahaya tampak biru (fluoresensi)!",
                "Simpulkan: Pendaran biru neon ini adalah bukti langsung eksistensi orbital molekul pi terdelokalisasi!"
            ),
            safetyNotes = listOf(
                "Jangan menatap lampu senter UV secara langsung ke mata.",
                "Air tonik aman dan merupakan minuman komersial biasa."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-huckel-1",
                prompt = "Berdasarkan Teori Hückel, molekul benzena memiliki total energi elektron pi sebesar E_pi = 6 alpha + 8 beta. Jika tiga molekul etilena terisolasi memiliki energi total 3 · (2 alpha + 2 beta) = 6 alpha + 6 beta, berapakah energi stabilisasi delokalisasi resonansi benzena?",
                type = "multiple_choice",
                options = listOf(
                    "2 beta (bernilai negatif sekitar -152 kJ/mol)",
                    "8 beta",
                    "0 (tidak ada stabilisasi)",
                    "6 alpha"
                ),
                correctAnswer = "2 beta (bernilai negatif sekitar -152 kJ/mol)",
                hints = listOf(
                    "Energi delokalisasi = E_pi(benzena) - E_pi(3 etilena terisolasi).",
                    "(6 alpha + 8 beta) - (6 alpha + 6 beta) = ...?"
                ),
                explanation = "Energi delokalisasi resonansi dihitung dari selisih energi sistem terdelokalisasi benzena dengan sistem terlokalisasi tiga ikatan rangkap etilena terpisah: E_delokalisasi = (6 alpha + 8 beta) - (6 alpha + 6 beta) = 2 beta. Karena integral resonansi beta bernilai negatif (sekitar -76 kJ/mol per beta), maka 2 beta bernilai sekitar -152 kJ/mol energi yang lebih rendah, menjelaskan kestabilan termodinamika luar biasa dari cincin aromatik benzena.",
                misconception = "Mengira energi stabilisasi adalah 8 beta (8 beta adalah total kontribusi beta pada benzena, bukan selisih stabilisasinya)."
            ),
            QuizQuestion(
                id = "q-huckel-2",
                prompt = "Berdasarkan Aturan Hückel untuk aromatisitas (4n + 2 elektron pi terdelokalisasi pada cincin planar), manakah dari spesi kimia berikut yang bersifat AROMATIK STABIL?",
                type = "multiple_choice",
                options = listOf(
                    "Anion Siklopentadienil, C5H5⁻ (memiliki 6 elektron pi, n = 1)",
                    "Siklobutadiena, C4H4 (memiliki 4 elektron pi, n = tidak memenuhi)",
                    "Kation Sikloheptatrienil, C7H7⁺ (memiliki 7 elektron pi)",
                    "Siklooktatetraena, C8H8 (memiliki 8 elektron pi)"
                ),
                correctAnswer = "Anion Siklopentadienil, C5H5⁻ (memiliki 6 elektron pi, n = 1)",
                hints = listOf(
                    "Aturan Hückel mensyaratkan 4n + 2 elektron pi (yaitu 2, 6, 10, 14, ... elektron pi).",
                    "Anion siklopentadienil memiliki 2 ikatan rangkap (4 elektron) + 1 pasangan elektron bebas pada karbon bermuatan negatif (2 elektron) = total 6 elektron pi (4(1) + 2 = 6)."
                ),
                explanation = "Anion Siklopentadienil (C5H5⁻) adalah cincin planar beranggota 5 yang memiliki dua ikatan rangkap (4 elektron pi) dan satu pasang elektron bebas pada atom karbon karbanion terdelokalisasi (2 elektron pi), memberikan total tepat 6 elektron pi. Karena 6 = 4(1) + 2 memenuhi aturan Hückel 4n + 2 secara sempurna, anion ini sangat stabil dan bersifat aromatik sejati (seperti pada Ferosena). Sebaliknya, C4H4 (4 elektron pi) dan C8H8 (8 elektron pi) memiliki 4n elektron pi dan bersifat anti-aromatik / non-aromatik.",
                misconception = "Mengira senyawa aromatik harus selalu memiliki cincin 6 atom karbon seperti benzena (cincin 5 atau 7 atom karbon juga bisa aromatik jika memenuhi aturan 4n+2 elektron pi)."
            )
        )
    )

    private fun getFisikaKinetikaPermukaanMarcusLesson(): LessonData = LessonData(
        conceptId = "kim-fisika-kinetika-permukaan-marcus",
        storyPanels = listOf(
            StoryPanel(
                id = "p-marcus-tafel-1",
                panelNumber = 1,
                title = "Paradoks Reaksi Lebih Eksotermik Malah Melambat",
                caption = "Dimas mempelajari reaksi transfer elektron redoks dan menemukan anomali yang membingungkan: Ketika energi bebas reaksi delta G° dibuat semakin sangat negatif (sangat spontan), laju reaksi transfer elektron bukannya makin cepat, melainkan mendadak anjlok drastis!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana mungkin reaksi yang jauh lebih spontan dan melepaskan energi raksasa justru berjalan jauh lebih lambat?"
            ),
            StoryPanel(
                id = "p-marcus-tafel-2",
                panelNumber = 2,
                title = "Teori Transfer Elektron Rudolph Marcus",
                caption = "Kakek menggambarkan kurva parabola energi potensial keadaan reaktan dan produk.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Rudolph Marcus memenangkan Hadiah Nobel untuk penemuan ini! Transfer elektron terjadi begitu cepat (prinsip Franck-Condon) sehingga inti atom tidak sempat bergerak. Jika delta G° terlalu negatif melampaui energi reorganisasi pelarut lambda (-delta G° > lambda), titik potong kurva parabola berpindah ke wilayah terbalik (Marcus Inverted Region), menaikkan kembali energi aktivasi!"
            ),
            StoryPanel(
                id = "p-marcus-tafel-3",
                panelNumber = 3,
                title = "Kinetika Elektroda Butler-Volmer & Tafel",
                caption = "Kirana memaparkan kinetika transfer elektron pada permukaan antarmuka elektroda.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Pada permukaan elektroda, overpotensial listrik eta menggeser tinggi penghalang aktivasi secara langsung! Persamaan Butler-Volmer dan Plot Tafel kemiringan b = 2.303 RT / alpha F menjadi kunci memilih elektrokatalis terbaik untuk produksi hidrogen hijau!"
            )
        ),
        intuition = "Teori Transfer Elektron Marcus (1956) menjelaskan laju reaksi redoks di mana elektron melompat antar-spesies kimia tanpa pemutusan ikatan kovalen (transfer elektron bola luar). Energi aktivasi Marcus delta G^‡ = (lambda + delta G°)^2 / (4 lambda) ditentukan oleh kompromi antara energi bebas termodinamika delta G° dan Energi Reorganisasi lambda (energi yang dibutuhkan untuk merestrukturasi lingkungan bola koordinasi dan pelarut sebelum elektron melompat). Teori ini memprediksi secara spektakuler Daerah Terbalik Marcus (Inverted Region): jika -delta G° > lambda, laju reaksi justru menurun saat kespontanan meningkat. Pada antarmuka elektroda logam-larutan, kinetika transfer muatan diatur oleh Persamaan Butler-Volmer yang menyederhanakan menjadi Persamaan Garis Lurus Tafel pada overpotensial tinggi (eta = a + b log j), penentu efisiensi elektrokatalis baterai dan elektroliser.",
        intuitionPoints = listOf(
            "Prinsip Franck-Condon: transfer elektron kuantum terjadi dalam skala waktu 10⁻¹⁵ detik (attodetik–femtodetik), jauh lebih cepat daripada gerakan getaran inti atom pelarut (10⁻¹³ detik), mengharuskan konfigurasi pelarut mengalami fluktuasi reorganisasi sebelum elektron melompat.",
            "Rumus Energi Aktivasi Marcus: delta G^‡ = (lambda + delta G°)^2 / (4 lambda).",
            "Tiga Daerah Kinetika Marcus: (1) Normal Region (-delta G° < lambda, laju naik seiring kenaikan kespontanan); (2) Laju Maksimum Tanpa Aktivasi (-delta G° = lambda, delta G^‡ = 0); (3) Inverted Region (-delta G° > lambda, laju menurun drastis).",
            "Persamaan Butler-Volmer: menghubungkan kerapatan arus bersih j dengan overpotensial elektroda eta: j = j0 [exp(alpha F eta / RT) - exp(-(1-alpha) F eta / RT)].",
            "Kemiringan Tafel (Tafel Slope): b = 2.303 RT / (alpha F). Semakin kecil nilai b (misal 30–40 mV/dekade), semakin efisien elektrokatalis tersebut menghasilkan arus listrik dengan overpotensial minimum."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Energi Aktivasi Transfer Elektron Marcus",
                latexFormula = "\\Delta G^\\ddagger = \\frac{(\\lambda + \\Delta G^\\circ)^2}{4 \\lambda}",
                description = "Menghitung energi aktivasi transfer elektron dari energi bebas reaksi delta G° dan energi reorganisasi pelarut lambda.",
                variableMeanings = mapOf(
                    "\\Delta G^\\ddagger" to "Energi aktivasi penghalang transfer elektron",
                    "\\lambda" to "Energi reorganisasi total (koordinasi dalam + pelarut luar)",
                    "\\Delta G^\\circ" to "Perubahan energi bebas standar reaksi redoks"
                )
            ),
            FormulaCard(
                title = "Persamaan Garis Lurus Tafel Elektroda",
                latexFormula = "\\eta = a + b \\log_{10} j \\quad ; \\quad b = \\frac{2.303 R T}{\\alpha F}",
                description = "Hubungan linear logaritmik antara overpotensial aktivasi eta dan rapat arus j pada overpotensial tinggi.",
                variableMeanings = mapOf(
                    "\\eta" to "Overpotensial elektroda (Volt)",
                    "j" to "Kerapatan arus transfer muatan (A/cm²)",
                    "b" to "Kemiringan Tafel (Tafel slope, V/dekade)",
                    "\\alpha" to "Koefisien transfer muatan (biasanya ~0.5)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Elektrokatalis Pemecahan Air (Water Splitting) untuk Hidrogen Hijau di PT Dirgantara Indonesia",
            industry = "Teknologi Energi Hidrogen Hijau & Elektrokatalisis Terdepan",
            context = "Konsorsium riset kedirgantaraan menguji elektroliser air PEM (Proton Exchange Membrane) untuk memproduksi bahan bakar hidrogen murni bagi pesawat terbang nirawak bertenaga sel bahan bakar.",
            problem = "Reaksi evolusi oksigen (Oxygen Evolution Reaction / OER) di anoda memiliki kinetika transfer 4 elektron yang sangat lambat dan membutuhkan overpotensial sangat tinggi (eta > 450 mV), memboroskan 35% energi listrik masukan.",
            solution = "Insinyur elektrokatalisis mensintesis nanopartikel oksida rutenium-iridium berpori (IrO₂-RuO₂) dan mengkarakterisasi kinetikanya menggunakan Plot Tafel. Katalis baru menurunkan kemiringan Tafel drastis dari 120 mV/dekade (pada elektroda nikel biasa) menjadi hanya 38 mV/dekade! Berdasarkan Teori Marcus dan Butler-Volmer, penurunan nilai b dan kenaikan kerapatan arus pertukaran j0 ini membuktikan penurunan drastis energi reorganisasi pada antarmuka katalis-air, memungkinkan elektroliser menghasilkan hidrogen dengan overpotensial sangat rendah eta = 210 mV pada rapat arus 1 A/cm², meningkatkan efisiensi energi keseluruhan sistem hingga 84%.",
            lessonsLearned = "Teori Marcus dan analisis kinetika Tafel adalah parameter acuan utama dalam perlombaan dunia mengembangkan elektrokatalis hidrogen hijau berbiaya rendah."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Efek Overpotensial Elektrolisis Air Menggunakan Elektroda Pensil Grafit",
            objective = "Melihat secara langsung bagaimana beda potensial dan jenis material elektroda mengontrol laju transfer elektron pembentukan gelembung gas hidrogen.",
            materialsNeeded = listOf(
                "1 buah baterai kotak 9V",
                "2 batang isi pensil grafit 2B tebal (sebagai elektroda inert karbon)",
                "2 buah kabel penjepit buaya",
                "1 gelas kaca bening berisi air keran + 1 sendok makan garam dapur (sebagai elektrolit)",
                "Paku besi biasa (sebagai elektroda pembanding)"
            ),
            steps = listOf(
                "Hubungkan kedua isi pensil grafit ke kutub positif (+) dan kutub negatif (-) baterai 9V menggunakan kabel penjepit buaya.",
                "Celupkan kedua ujung pensil grafit ke dalam larutan air garam tanpa saling bersentuhan.",
                "Amati gelembung gas yang terbentuk seketika: pada kutub negatif (katoda), gas hidrogen (H2) memancar deras dan cepat; pada kutub positif (anoda), gas klorin/oksigen terbentuk lebih lambat.",
                "Ganti elektroda katoda pensil dengan paku besi biasa: amati laju pembentukan gelembung gas hidrogen melambat dibanding saat menggunakan pensil grafit!",
                "Penjelasan: Bahan grafit karbon memiliki overpotensial evolusi hidrogen yang berbeda dibanding besi. Laju transfer elektron antar-muka elektroda diatur secara kuantitatif oleh kerapatan arus pertukaran j0 dan overpotensial Butler-Volmer!",
                "Simpulkan: Gelembung gas yang Anda amati adalah hasil nyata dari transfer elektron kuantum antarmuka padat-cair."
            ),
            safetyNotes = listOf(
                "Lakukan di ruangan berventilasi baik.",
                "Gunakan baterai 9V standar, jangan gunakan sumber listrik PLN."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-marcus-tafel-1",
                prompt = "Berdasarkan Teori Transfer Elektron Marcus, apakah fenomena unik yang terjadi pada 'Daerah Terbalik Marcus' (Marcus Inverted Region) ketika perubahan energi bebas reaksi (-delta G°) melampaui besarnya energi reorganisasi pelarut (-delta G° > lambda)?",
                type = "multiple_choice",
                options = listOf(
                    "Laju reaksi transfer elektron justru MENURUN secara tak terduga meskipun reaksi semakin sangat spontan secara termodinamika",
                    "Laju reaksi menjadi bernilai tak terhingga",
                    "Arah transfer elektron berbalik dari produk kembali ke reaktan secara spontan",
                    "Suhu larutan seketika turun ke nol mutlak"
                ),
                correctAnswer = "Laju reaksi transfer elektron justru MENURUN secara tak terduga meskipun reaksi semakin sangat spontan secara termodinamika",
                hints = listOf(
                    "Rumus energi aktivasi Marcus: delta G^‡ = (lambda + delta G°)^2 / (4 lambda).",
                    "Jika -delta G° > lambda, suku kuadrat pembilang membesar kembali.",
                    "Energi aktivasi yang membesar menyebabkan laju reaksi eksponensial menurun."
                ),
                explanation = "Dalam Teori Marcus, rumus energi aktivasi adalah delta G^‡ = (lambda + delta G°)^2 / (4 lambda). Pada 'Marcus Inverted Region' di mana reaksi sangat eksotermik (-delta G° > lambda), titik potong kedua parabola energi potensial bergeser ke wilayah di mana penghalang aktivasi delta G^‡ justru membesar kembali seiring semakin negatifnya delta G°. Akibatnya, laju reaksi melambat drastis meskipun reaksi secara termodinamika semakin sangat spontan, sebuah prediksi teoretis brilian yang terbukti sempurna secara eksperimen.",
                misconception = "Mengira hukum kinetika konvensional selalu berlaku di mana reaksi yang semakin spontan pasti selalu berlangsung semakin cepat."
            ),
            QuizQuestion(
                id = "q-marcus-tafel-2",
                prompt = "Dalam karakterisasi elektrokatalis untuk produksi gas hidrogen, seorang peneliti membandingkan dua katalis. Katalis A memiliki kemiringan Tafel b = 40 mV/dekade, sedangkan Katalis B memiliki b = 120 mV/dekade. Katalis manakah yang memiliki kinerja elektrokatalisis LEBIH UNGGUL dan efisien?",
                type = "multiple_choice",
                options = listOf(
                    "Katalis A (karena hanya membutuhkan kenaikan overpotensial 40 mV untuk menaikkan arus sebesar 10 kali lipat, jauh lebih efisien hemat energi dibanding Katalis B)",
                    "Katalis B (karena memiliki angka kemiringan yang lebih besar)",
                    "Keduanya memiliki kinerja yang persis sama",
                    "Kinerja katalis tidak dapat ditentukan dari kemiringan Tafel"
                ),
                correctAnswer = "Katalis A (karena hanya membutuhkan kenaikan overpotensial 40 mV untuk menaikkan arus sebesar 10 kali lipat, jauh lebih efisien hemat energi dibanding Katalis B)",
                hints = listOf(
                    "Kemiringan Tafel b menyatakan berapa milivolt overpotensial tambahan yang dibutuhkan untuk melipatgandakan arus reaksi (j) sebesar satu dekade (10 kali lipat).",
                    "Overpotensial adalah energi pemborosan (kehilangan tegangan). Nilai overpotensial yang lebih kecil berarti efisiensi lebih tinggi."
                ),
                explanation = "Kemiringan Tafel b menyatakan besarnya overpotensial tambahan (tegangan pemborosan) yang harus diberikan untuk menaikkan kerapatan arus listrik sebesar satu dekade (faktor 10 kali lipat). Katalis A dengan b = 40 mV/dekade jauh lebih unggul karena hanya membutuhkan tambahan tegangan 40 mV untuk memproduksi 10 kali lebih banyak hidrogen, sedangkan Katalis B membutuhkan tambahan tegangan 120 mV (3 kali lebih boros listrik) untuk kenaikan arus yang sama.",
                misconception = "Mengira nilai kemiringan Tafel yang lebih besar menunjukkan kinerja yang lebih baik."
            )
        )
    )

    private fun getAnalitikValidasiKromatografiLesson(): LessonData = LessonData(
        conceptId = "kim-analitik-validasi-kromatografi",
        storyPanels = listOf(
            StoryPanel(
                id = "p-kromatografi-lanjut-1",
                panelNumber = 1,
                title = "Dua Puncak yang Saling Tumpang Tindih",
                caption = "Dimas memisahkan campuran kafein dan parasetamol pada instrumen HPLC. Pada kromatogram, kedua senyawa keluar hampir bersamaan dan puncaknya melebar saling bertumpuk sehingga kadarnya tidak bisa dihitung.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kedua puncak senyawa ini saling tumpang tindih dan sangat lebar. Bagaimana cara mempertajam puncak kromatogram agar kedua zat terpisah bersih sempurna?"
            ),
            StoryPanel(
                id = "p-kromatografi-lanjut-2",
                panelNumber = 2,
                title = "Persamaan Kecepatan van Deemter",
                caption = "Kakek menjelaskan Persamaan van Deemter H = A + B/u + C u yang menghubungkan efisiensi kolom dengan laju alir eluen u.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Pelebaran puncak disebabkan oleh 3 fenomena fisika, Dimas: Difusi eddy (A), difusi longitudinal (B/u), dan resistensi transfer massa (C u)! Terdapat laju alir optimal u_opt di mana tinggi pelat teoritis H minimum dan jumlah pelat N maksimum!"
            ),
            StoryPanel(
                id = "p-kromatografi-lanjut-3",
                panelNumber = 3,
                title = "HPLC Fase Terbalik C18 & Resolusi Rs >= 1.5",
                caption = "Kirana memaparkan parameter resolusi kromatografi standar analitik.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Pada HPLC fase terbalik, fase diam bersifat non-polar (silika C18) dan fase gerak polar (air-asetonitril). Pemisahan analitik dikatakan tuntas sempurna (baseline separation) jika Resolusi Rs >= 1.5!"
            )
        ),
        intuition = "Kromatografi adalah teknik pemisahan fisik multikomponen yang bersandar pada perbedaan distribusi analit antara fase diam dan fase gerak. Efisiensi kolom kromatografi dinyatakan oleh jumlah pelat teoritis N = 16 (t_R / w)² atau tinggi pelat ekivalen HETP = L / N. Jan van Deemter merumuskan persamaan fundamental H = A + B/u + C u yang memetakan pelebaran pita puncak: suku A (difusi pusaran / eddy diffusion akibat variasi jalur partikel), suku B/u (difusi molekuler longitudinal searah aliran), dan suku C u (resistensi transfer massa antar-fase). Plot kurva van Deemter memiliki titik minimum yang menentukan laju alir linier optimum u_opt. Resolusi pemisahan Rs mengukur derajat pemisahan dua puncak berdekatan (Rs >= 1.5 menjamin pemisahan garis dasar / baseline separation 99.7%).",
        intuitionPoints = listOf(
            "Persamaan van Deemter: H = A + B/u + C u. Nilai H kecil berarti kolom sangat efisien (puncak tajam sempit).",
            "Kromatografi Fase Terbalik (Reversed-Phase HPLC / RP-HPLC): fase diam non-polar (misal silika terikat rantai oktadesil C18) dan fase gerak polar (campuran air, metanol, asetonitril). Senyawa paling polar keluar pertama (elusi awal), senyawa non-polar tertahan kuat dan keluar terakhir.",
            "Faktor Retensi (Kapasitas) k' = (t_R - t_0) / t_0, di mana t_R adalah waktu retensi analit dan t_0 adalah waktu retensi pelarut tak-tertahan (void time). Nilai k' ideal untuk analisis adalah 2 <= k' <= 10.",
            "Faktor Selektivitas alpha = k'2 / k'1 >= 1.05.",
            "Resolusi Puncak Rs = 2(t_R2 - t_R1) / (w1 + w2). Syarat pemisahan baseline kuantitatif sempurna menurut farmakope adalah Rs >= 1.5."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Persamaan Laju Alir Kolom van Deemter",
                latexFormula = "H = A + \\frac{B}{u} + C \\cdot u \\quad ; \\quad u_{\\text{opt}} = \\sqrt{\\frac{B}{C}}",
                description = "H adalah tinggi pelat teoritis (HETP), u adalah kecepatan linier fase gerak.",
                variableMeanings = mapOf(
                    "H" to "Tinggi pelat teoritis ekivalen (Height Equivalent to Theoretical Plate / HETP)",
                    "A" to "Konstanta difusi eddy (bergantung keseragaman pengepakan partikel)",
                    "B" to "Konstanta difusi molekuler longitudinal",
                    "C" to "Konstanta resistensi transfer massa kinetik",
                    "u_\\text{opt}" to "Kecepatan alir optimum di mana efisiensi kolom maksimal (H minimum)"
                )
            ),
            FormulaCard(
                title = "Resolusi Kromatografi Puncak (Peak Resolution)",
                latexFormula = "R_s = \\frac{2 (t_{R2} - t_{R1})}{w_1 + w_2} = \\frac{1}{4} \\sqrt{N} \\left(\\frac{\\alpha - 1}{\\alpha}\\right) \\left(\\frac{k'_2}{1 + k'_2}\\right)",
                description = "Persamaan Purnell menghubungkan resolusi langsung dengan efisiensi pelat N, selektivitas alpha, dan kapasitas k'.",
                variableMeanings = mapOf(
                    "R_s" to "Resolusi pemisahan (Rs >= 1.5 = pemisahan garis dasar tuntas)",
                    "t_{R1}, t_{R2}" to "Waktu retensi puncak analit 1 dan 2",
                    "w_1, w_2" to "Lebar dasar puncak kromatogram",
                    "N" to "Jumlah pelat teoritis kolom"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengujian Residu Pestisida Klorpirifos pada Ekspor Teh Hitam di Balai Karantina Pertanian",
            industry = "Pengujian Keamanan Pangan Ekspor & Kimia Analitik Regulatori",
            context = "Balai Besar Uji Standar Karantina Pertanian di Tanjung Priok menguji sertifikasi ekspor komoditas teh hitam Indonesia ke Uni Eropa yang menetapkan Batas Maksimum Residu (BMR) pestisida klorpirifos sangat ketat sebesar 0.01 mg/kg (10 ppb).",
            problem = "Matriks ekstrak daun teh sangat rumit kaya kafein, katekin, dan tanin pekat yang sering kali mengelusi bersamaan dengan residu pestisida pada kolom HPLC biasa, menghasilkan interferensi positif palsu.",
            solution = "Laboratorium analitik mengoptimalkan metode Ultra-High Performance Liquid Chromatography (UHPLC) fase terbalik menggunakan kolom sub-2 mikron C18 (partikel 1.8 mikrometer). Berdasarkan persamaan van Deemter, partikel sub-2 mikron memperkecil suku difusi eddy A dan suku transfer massa C secara drastis, memungkinkan laju alir tinggi tanpa kehilangan efisiensi pelat (N melonjak hingga 45.000 pelat). Digabungkan dengan elusi gradien air-asetonitril dan detektor spektrometri massa tandem triple-quadrupole (LC-MS/MS), puncak analit klorpirifos terpisah bersih dengan resolusi Rs = 2.8 dari matriks teh dalam waktu hanya 4.5 menit, mencapai batas deteksi LOD 0.5 ppb.",
            lessonsLearned = "Teori efisiensi kolom kromatografi van Deemter menjamin keabsahan sertifikasi mutu ekspor produk pertanian nasional bernilai triliunan rupiah."
        ),
        homeLab = HomeLabData(
            title = "Kromatografi Lapis Tipis Kapur Tulis Pemisahan Pigmen Daun Hijau",
            objective = "Memahami prinsip pemisahan senyawa analitik antara fase diam padat dan fase gerak cair.",
            materialsNeeded = listOf(
                "1 batang kapur tulis putih polos (sebagai fase diam silika/kalsium karbonat)",
                "Ekstrak daun bayam atau pandan pekat (ditumbuk halus dengan sedikit alkohol)",
                "1 gelas kaca bening kecil",
                "Alkohol pembersih luka 70% atau cairan pembersih kutek (aseton) sebagai fase gerak",
                "Plastik penutup gelas"
            ),
            steps = listOf(
                "Buat garis pensil tipis berjarak 1.5 cm dari ujung bawah kapur tulis.",
                "Teteskan 1 tetes ekstrak daun hijau pekat tepat di tengah garis pensil kapur, biarkan mengering (ulangi 3 kali agar pekat).",
                "Tuangkan alkohol 70% setinggi 0.5 cm ke dasar gelas (jangan sampai merendam titik ekstrak).",
                "Berdirikan batang kapur tulis di dalam gelas dan tutup mulut gelas dengan plastik.",
                "Amati kapilaritas cairan alkohol yang merambat naik perlahan di sepanjang kapur: cairan membawa pigmen daun dan memisahkannya menjadi pita warna berbeda!",
                "Amati pita yang terbentuk: pita kuning (xantofil/karotenoid) merambat paling cepat di bagian atas (afinitas kuat ke fase gerak), sedangkan pita hijau tua (klorofil a dan b) tertahan lebih kuat di bagian bawah kapur (afinitas kuat ke fase diam kapur)!",
                "Ukur jarak tempuh masing-masing pita dan hitung nilai Rf = Jarak analit / Jarak pelarut!"
            ),
            safetyNotes = listOf(
                "Lakukan di tempat berventilasi baik.",
                "Jauhkan alkohol dari api terbuka."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kromatografi-lanjut-1",
                prompt = "Berdasarkan Persamaan van Deemter H = A + B/u + C u, modifikasi fisik kolom apakah yang secara efektif dapat MEMPERKECIL nilai suku A (difusi eddy) dan suku C (resistensi transfer massa) sehingga menghasilkan pelat teoritis yang jauh lebih banyak dan puncak yang sangat tajam?",
                type = "multiple_choice",
                options = listOf(
                    "Mengurangi diameter ukuran partikel pengisi kolom (misal menggunakan partikel silika sub-2 mikron pada UHPLC) dan mengepak kolom secara sangat seragam",
                    "Memperpanjang pipa kolom menjadi 10 kilometer",
                    "Menaikkan suhu kolom hingga pelarut mendidih",
                    "Menggunakan kolom kosong tanpa partikel pengisi sama sekali"
                ),
                correctAnswer = "Mengurangi diameter ukuran partikel pengisi kolom (misal menggunakan partikel silika sub-2 mikron pada UHPLC) dan mengepak kolom secara sangat seragam",
                hints = listOf(
                    "Suku A sebanding dengan diameter partikel d_p (A = 2 lambda d_p).",
                    "Suku C sebanding dengan kuadrat diameter partikel d_p².",
                    "Memperkecil ukuran partikel partikel membuat jalur elusi lebih seragam dan jarak difusi analit ke pori sangat pendek."
                ),
                explanation = "Suku A (difusi eddy) sebanding dengan diameter partikel (A ∝ d_p) dan suku C (resistensi transfer massa) sebanding dengan kuadrat diameter partikel (C ∝ d_p²). Dengan memperkecil ukuran diameter partikel kemasan kolom dari 5 mikrometer menjadi sub-2 mikrometer (seperti pada teknologi UHPLC modern), nilai A dan C anjlok drastis. Akibatnya, tinggi pelat H berkurang tajam, jumlah pelat teoritis N melonjak tinggi, dan puncak kromatogram menjadi luar biasa tajam dan efisien.",
                misconception = "Mengira efisiensi kolom hanya bisa dinaikkan dengan membuat tabung kolom semakin panjang (kolom yang terlalu panjang justru memperbesar waktu retensi dan tekanan pompa secara berlebihan)."
            ),
            QuizQuestion(
                id = "q-kromatografi-lanjut-2",
                prompt = "Dua senyawa analit terelusi pada kromatogram HPLC dengan waktu retensi t_R1 = 5.0 menit dan t_R2 = 6.0 menit. Lebar dasar kedua puncak adalah w_1 = 0.4 menit dan w_2 = 0.6 menit. Berapakah nilai Resolusi (Rs) pemisahan kedua puncak tersebut, dan apakah pemisahannya memenuhi kriteria baseline separation?",
                type = "multiple_choice",
                options = listOf(
                    "Rs = 2.0 (Memenuhi kriteria baseline separation karena Rs >= 1.5)",
                    "Rs = 1.0 (Tidak memenuhi baseline separation)",
                    "Rs = 0.5 (Puncak tumpang tindih parah)",
                    "Rs = 4.0"
                ),
                correctAnswer = "Rs = 2.0 (Memenuhi kriteria baseline separation karena Rs >= 1.5)",
                hints = listOf(
                    "Rumus Resolusi: Rs = 2 (t_R2 - t_R1) / (w1 + w2).",
                    "Pembilang: 2 · (6.0 - 5.0) = 2 · 1.0 = 2.0.",
                    "Penyebut: w1 + w2 = 0.4 + 0.6 = 1.0.",
                    "Rs = 2.0 / 1.0 = ...?"
                ),
                explanation = "Berdasarkan rumus resolusi kromatografi: Rs = 2(t_R2 - t_R1) / (w1 + w2) = 2(6.0 - 5.0) / (0.4 + 0.6) = 2(1.0) / 1.0 = 2.0. Nilai Rs = 2.0 melampaui batas ambang minimum standar farmakope Rs >= 1.5, yang membuktikan bahwa kedua puncak terpisah sempurna dari garis dasar (baseline separation) dengan kemurnian kuantitatif > 99.9%.",
                misconception = "Lupa mengalikan selisih waktu retensi dengan angka 2 pada pembilang rumus resolusi."
            )
        )
    )

    private fun getAnalitikSpektrometriAasIcpLesson(): LessonData = LessonData(
        conceptId = "kim-analitik-spektrometri-aas-icp",
        storyPanels = listOf(
            StoryPanel(
                id = "p-spektro-instrumen-1",
                panelNumber = 1,
                title = "Mendeteksi Sebutir Garam di Danau Raksasa",
                caption = "Dimas membaca regulasi air minum dari Kementerian Kesehatan yang menetapkan kadar logam berat timbal (Pb) tidak boleh melebihi 10 bagian per miliar (10 ppb / 10 mikrogram per liter).",
                dialogueSpeaker = "Dimas",
                dialogueText = "10 ppb setara dengan melarutkan satu sendok teh garam ke dalam danau air raksasa! Instrumen kimia apa yang sanggup mendeteksi konsentrasi renik sekecil itu?"
            ),
            StoryPanel(
                id = "p-spektro-instrumen-2",
                panelNumber = 2,
                title = "Dari Nyala Api AAS ke Plasma Suhu Matahari ICP-MS",
                caption = "Kakek menjelaskan evolusi spektrometri serapan atom (AAS) menuju plasma induktif ICP-MS.",
                dialogueSpeaker = "Kakek",
                dialogueText = "AAS membakar sampel di nyala api 2500°C dengan lampu katoda berongga spesifik untuk menyerap foton resonansi atom bebas. Namun ICP-MS membakar sampel dalam plasma argon bersuhu 8.000 Kelvin—lebih panas dari permukaan matahari—mengionisasi seluruh unsur simultan hingga batas deteksi part per trillion (ppt)!"
            ),
            StoryPanel(
                id = "p-spektro-instrumen-3",
                panelNumber = 3,
                title = "Karakterisasi Mekanisme Redoks Voltametri Siklik",
                caption = "Kirana menggambar kurva voltametri siklik berbentuk 'bebek' (duck-shaped voltammogram).",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dengan menyapu potensial bolak-balik pada elektroda kerja, voltametri siklik merekam puncak arus anodik dan katodik. Persamaan Randles-Sevcik mengukur apakah transfer elektron reversibel, quasi-reversibel, atau ireversibel!"
            )
        ),
        intuition = "Spektrometri analitik instrumental modern dirancang untuk mendeteksi unsur renik (trace elements) pada konsentrasi ekstrim rendah (ppm, ppb, hingga ppt). Atomic Absorption Spectrometry (AAS) menggunakan lampu katoda berongga (Hollow Cathode Lamp / HCL) yang memancarkan garis spektrum tajam khas unsur analit yang kemudian diserap oleh uap atom bebas dalam nyala api atau tungku grafit (Hukum Lambert-Beer). Inductively Coupled Plasma Mass Spectrometry (ICP-MS) menggunakan plasma gas argon berfrekuensi radio bersuhu 6000–8000 K untuk mengatomisasi dan mengionisasi hampir seluruh tabel periodik secara simultan, lalu memisahkan kation unsur berdasarkan rasio massa terhadap muatan (m/z) pada filter kuadrupol dengan sensitivitas sub-ppb. Dalam elektroanalisis, Voltametri Siklik (CV) memetakan mekanisme kinetika redoks dan koefisien difusi melalui sapuan potensial linier siklik bolak-balik.",
        intuitionPoints = listOf(
            "Prinsip AAS: uap atom netral keadaan dasar menyerap radiasi resonansi elektromagnetik spesifik. Konsentrasi dihitung via Hukum Lambert-Beer A = epsilon b c dari kurva kalibrasi standar.",
            "AAS Tungku Grafit (GFAAS): menguapkan sampel dalam tabung grafit elektrotermal tertutup, meningkatkan sensitivitas hingga 1000 kali lebih peka dibanding AAS nyala api biasa (mencapai rentang sub-ppb).",
            "Keunggulan ICP-MS: batas deteksi sangat rendah (ppt / part-per-trillion = 10⁻¹²), jangkauan linier dinamis hingga 9 orde magnitudo, dan kemampuan analisis multielemen simultan lebih dari 70 unsur sekaligus dalam hitungan detik.",
            "Voltametri Siklik (Cyclic Voltammetry / CV): menyapu potensial maju (reduksi) dan mundur (oksidasi). Untuk sistem reversibel sempurna, selisih potensial puncak delta E_p = E_pa - E_pc = 59 mV / n pada 25°C dan rasio arus puncak I_pa / I_pc = 1.0.",
            "Persamaan Randles-Sevcik: arus puncak I_p sebanding dengan akar laju sapuan potensial v^(1/2) membuktikan proses dikendalikan oleh difusi massal analit murni."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Hukum Spektrometri Lambert-Beer",
                latexFormula = "A = -\\log_{10}\\left(\\frac{I}{I_0}\\right) = \\epsilon \\cdot b \\cdot c",
                description = "Absorbansi optik A berbanding lurus linear dengan konsentrasi analit c dan tebal media serapan b.",
                variableMeanings = mapOf(
                    "A" to "Absorbansi tanpa dimensi",
                    "\\epsilon" to "Absorptivitas molar spesifik analit (L/(mol·cm))",
                    "b" to "Panjang lintasan optik nyala atau kuvet (cm)",
                    "c" to "Konsentrasi molar analit (mol/L)"
                )
            ),
            FormulaCard(
                title = "Persamaan Randles-Sevcik Voltametri Siklik Reversibel",
                latexFormula = "I_p = \\left(2.69 \\times 10^5\\right) n^{3/2} A D^{1/2} C v^{1/2}",
                description = "Arus puncak I_p pada voltametri siklik sistem reversibel pada suhu 298 K.",
                variableMeanings = mapOf(
                    "I_p" to "Arus puncak anodik atau katodik (Ampere)",
                    "n" to "Jumlah elektron yang ditransfer dalam reaksi redoks",
                    "A" to "Luas permukaan elektroda kerja (cm²)",
                    "D" to "Koefisien difusi analit dalam larutan (cm²/s)",
                    "C" to "Konsentrasi analit ruah (mol/cm³)",
                    "v" to "Laju sapuan potensial elektroda (scan rate, V/s)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Analisis Jejak Logam Berat Merkuri (Hg) di Teluk Jakarta oleh Pusat Riset Oseanografi BRIN",
            industry = "Oseanografi Lingkungan Maritim & Pemantauan Polusi Pesisir",
            context = "Pusat Riset Oseanografi BRIN di Ancol memantau bioakumulasi logam berat sangat beracun merkuri (Hg), timbal (Pb), dan kadmium (Cd) pada sedimen laut dan ikan konsumsi di perairan Teluk Jakarta.",
            problem = "Kadar merkuri terlarut dalam air laut sangat rendah (< 0.1 ppb) namun sangat mudah terbiometilasi menjadi metilmerkuri neurotoksik yang terakumulasi di rantai makanan. Instrumen spektrometri biasa tidak mampu mengukur kadar sub-ppb di tengah matriks garam air laut yang sangat pekat (salinitas 32 ppt NaCl).",
            solution = "Laboratorium mengaplikasikan instrumen ICP-MS resolusi tinggi yang dilengkapi sistem sel reaksi tabrakan (Collision/Reaction Cell dengan gas Helium/Oksigen) untuk menghilangkan gangguan interferensi poliatomik isobar (seperti ⁴⁰Ar³⁵Cl⁺ yang mengganggu deteksi ⁷⁵As). Sampel air laut diencerkan secara inline dan dideteksi dengan batas kuantifikasi LOQ mencapai 0.005 ppb (5 ppt). Data pemantauan ICP-MS membuktikan konsentrasi merkuri di muara Muara Angke melampaui baku mutu lingkungan, memicu diterbitkannya kebijakan penutupan tambak kerang hijau di zona tercemar untuk melindungi kesehatan masyarakat DKI Jakarta.",
            lessonsLearned = "Spektrometri analitik mutakhir ICP-MS menyediakan dasar ilmiah berkekuatan hukum tertinggi dalam penegakan regulasi perlindungan lingkungan hidup nasional."
        ),
        homeLab = HomeLabData(
            title = "Spektrofotometri Transmisi Smartphone Sederhana Menentukan Kepekatan Larutan Teh",
            objective = "Membuktikan secara kuantitatif Hukum Lambert-Beer A = epsilon b c menggunakan kamera dan sensor cahaya smartphone.",
            materialsNeeded = listOf(
                "1 unit smartphone yang memiliki aplikasi Lux Meter (pengukur intensitas cahaya)",
                "Lampu senter kecil konstan",
                "4 gelas kaca bening identik berpenampang datar",
                "1 kantong teh celup pekat",
                "Air minum bersih dan penggaris"
            ),
            steps = listOf(
                "Buat larutan teh pekat dalam 100 mL air mendidih sebagai larutan stok (Konsentrasi 100%).",
                "Buat deret pengenceran kalibrasi di 3 gelas: Gelas 1 (Teh 25% + 75% air), Gelas 2 (Teh 50% + 50% air), Gelas 3 (Teh 100% murni). Gelas 0 diisi air murni sebagai 'Blangko' (Konsentrasi 0%).",
                "Posisikan sensor cahaya smartphone di belakang gelas dan lampu senter di depan gelas pada jarak tetap 10 cm.",
                "Ukur intensitas cahaya yang menembus Gelas 0 (Air murni, I_0). Catat angka Lux (misal I_0 = 1000 Lux).",
                "Ukur intensitas cahaya yang menembus Gelas 1, 2, dan 3 (I_transmisi).",
                "Hitung Absorbansi: A = -log10(I / I_0) untuk masing-masing gelas.",
                "Plot grafik Absorbansi A terhadap Konsentrasi (%): Anda akan melihat titik-titik membentuk garis lurus linier sempurna yang memotong titik nol!",
                "Simpulkan: Eksperimen dapur ini adalah replika prinsip kerja spektrofotometer serapan atom dan UV-Vis laboratorium seharga miliaran rupiah!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan higienis."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-spektro-instrumen-1",
                prompt = "Suatu larutan analit dalam kuvet spektrofotometer dengan panjang lintasan optik b = 1.0 cm mentransmisikan cahaya sebesar 10% dari intensitas cahaya awal (Transmitansi T = 0.10 atau I/I_0 = 0.10). Berapakah nilai Absorbansi (A) larutan tersebut?",
                type = "numeric",
                correctAnswer = "1",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "Rumus hubungan Absorbansi dan Transmitansi: A = -log10(T) = -log10(I / I_0).",
                    "T = 0.10 = 10⁻¹.",
                    "A = -log10(10⁻¹) = -(-1) = ...?"
                ),
                explanation = "Berdasarkan definisi absorbansi pada Hukum Lambert-Beer: A = -log10(T) = -log10(I / I_0). Karena larutan meneruskan 10% cahaya (T = 0.10 = 10⁻¹), maka Absorbansi A = -log10(0.10) = -(-1) = 1.0. Jika larutan meneruskan 1% cahaya (T = 0.01 = 10⁻²), maka A = 2.0.",
                misconception = "Mengira absorbansi adalah persentase (menjawab 90 atau 0.90)."
            ),
            QuizQuestion(
                id = "q-spektro-instrumen-2",
                prompt = "Mengapa instrumen Inductively Coupled Plasma Mass Spectrometry (ICP-MS) memiliki batas deteksi yang jauh lebih sensitif (hingga skala ppt / part per trillion) dan kemampuan multielemen yang lebih unggul dibandingkan Flame Atomic Absorption Spectrometry (AAS nyala)?",
                type = "multiple_choice",
                options = listOf(
                    "Karena plasma argon ICP bersuhu sangat tinggi (6000–8000 K) mengionisasi hampir seluruh atom secara efisien dan spektrometer massa mendeteksi ion analit secara langsung dengan selektivitas rasio m/z yang sangat tinggi",
                    "Karena ICP-MS menggunakan bahan bakar bensin",
                    "Karena nyala api AAS membakar seluruh atom hingga hancur berkeping-keping",
                    "Karena instrumen ICP-MS tidak memerlukan listrik"
                ),
                correctAnswer = "Karena plasma argon ICP bersuhu sangat tinggi (6000–8000 K) mengionisasi hampir seluruh atom secara efisien dan spektrometer massa mendeteksi ion analit secara langsung dengan selektivitas rasio m/z yang sangat tinggi",
                hints = listOf(
                    "Suhu plasma argon (6000–8000 K) jauh melampaui nyala api asetilena AAS (~2500 K).",
                    "Detektor massa menghitung ion secara langsung per rasio massa/muatan alih-alih mengukur serapan foton cahaya optik."
                ),
                explanation = "Sumber plasma argon pada ICP beroperasi pada suhu ekstrem 6000–8000 K (mendekati suhu permukaan matahari), yang mampu menguapkan, mengatomisasi, dan mengionisasi hampir 100% atom dari sampel cair secara serentak tanpa gangguan matriks termal. Ion-ion positif yang terbentuk kemudian diekstraksi ke dalam spektrometer massa vakum tinggi, di mana ion dihitung secara langsung satu per satu berdasarkan rasio massa terhadap muatan (m/z), memberikan sensitivitas luar biasa hingga skala ppt dan kemampuan analisis simultan lebih dari 70 unsur sekaligus.",
                misconception = "Mengira ICP-MS adalah teknik optik serapan cahaya biasa seperti AAS."
            )
        )
    )

    private fun getBiokimiaKinetikaEnzimLesson(): LessonData = LessonData(
        conceptId = "kim-biokimia-kinetika-enzim",
        storyPanels = listOf(
            StoryPanel(
                id = "p-enzim-kinetika-1",
                panelNumber = 1,
                title = "Katalis Hayati dengan Efisiensi Maksimal",
                caption = "Dimas mengamati reaksi penguraian hidrogen peroksida: Tanpa katalis reaksi butuh waktu berminggu-minggu, namun penambahan setetes enzim katalase mengubah 40 juta molekul racun H₂O₂ menjadi air dan oksigen hanya dalam satu detik!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana enzim protein bisa mempercepat reaksi kimia hingga bermiliar-miliar kali lipat lebih cepat daripada katalis industri tercanggih?"
            ),
            StoryPanel(
                id = "p-enzim-kinetika-2",
                panelNumber = 2,
                title = "Model Leonor Michaelis & Maud Menten",
                caption = "Kakek menjelaskan pembentukan kompleks Enzim-Substrat [ES] reversibel menuju produk.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Pada konsentrasi substrat rendah, laju reaksi linear terhadap [S]. Namun pada substrat tinggi, seluruh sisi aktif enzim jenuh dan laju mencapai kecepatan maksimum konstan V_max! Konstanta Michaelis K_m mengukur afinitas: semakin kecil K_m, semakin kuat enzim mencengkeram substratnya!"
            ),
            StoryPanel(
                id = "p-enzim-kinetika-3",
                panelNumber = 3,
                title = "Plot Lineweaver-Burk & Desain Obat Inhibitor",
                caption = "Kirana menggambar plot linier timbal balik 1/v terhadap 1/[S] untuk membedakan jenis inhibisi obat.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Inhibitor kompetitif bersaing memperebutkan sisi aktif (V_max tetap, K_m naik). Inhibitor non-kompetitif mengikat sisi alosterik (V_max turun, K_m tetap). Dengan plot Lineweaver-Burk, industri farmasi merancang molekul obat inhibitor presisi tinggi!"
            )
        ),
        intuition = "Enzim adalah biokatalis protein yang mempercepat reaksi biokimia hingga 10⁶–10¹⁷ kali lipat dengan menurunkan energi bebas aktivasi delta G^‡ secara drastis melalui stabilisasi keadaan transisi. Kinetika enzim satu-substrat dimodelkan secara matematis oleh Persamaan Michaelis-Menten v = (V_max [S]) / (K_m + [S]). Konstanta Michaelis K_m adalah konsentrasi substrat di mana laju reaksi mencapai tepat setengah dari kecepatan maksimum (v = 1/2 V_max); K_m merupakan ukuran afinitas enzim terhadap substrat (nilai K_m rendah menunjukkan afinitas tinggi). Bilangan pergantian (turnover number k_cat = V_max / [E]_total) mengukur jumlah molekul substrat yang diubah per detik per sisi aktif. Rasio k_cat / K_m mengukur efisiensi katalitik spesifisitas enzim (dibatasi oleh laju batas difusi 10⁸–10⁹ M⁻¹ s⁻¹).",
        intuitionPoints = listOf(
            "Persamaan Michaelis-Menten: v = V_max [S] / (K_m + [S]). Pada [S] << K_m berlaku kinetika orde satu (v ≈ (V_max / K_m) [S]); pada [S] >> K_m berlaku kinetika orde nol jenuh (v ≈ V_max).",
            "Plot Lineweaver-Burk (Double Reciprocal): 1/v = (K_m / V_max) (1/[S]) + 1/V_max. Kemiringan garis = K_m / V_max, titik potong sumbu-y = 1 / V_max, titik potong sumbu-x = -1 / K_m.",
            "Inhibisi Kompetitif: molekul inhibitor menyerupai substrat dan bersaing merebut sisi aktif. Efek: V_max tetap tidak berubah (dapat diatasi dengan menambah substrat berlebih), K_m semu meningkat.",
            "Inhibisi Non-Kompetitif: inhibitor mengikat sisi alosterik terpisah (mengikat enzim bebas maupun kompleks ES dengan afinitas sama). Efek: V_max menurun, K_m tetap tidak berubah.",
            "Inhibisi Unkompetitif: inhibitor HANYA mengikat kompleks ES yang sudah terbentuk. Efek: V_max dan K_m kedua-duanya menurun dengan rasio yang sama."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Persamaan Kinetika Enzim Michaelis-Menten",
                latexFormula = "v = \\frac{V_{\\max} [S]}{K_m + [S]} \\quad ; \\quad K_m = \\frac{k_{-1} + k_2}{k_1}",
                description = "Laju reaksi pembentukan produk v sebagai fungsi konsentrasi substrat [S].",
                variableMeanings = mapOf(
                    "v" to "Kecepatan laju reaksi enzimatik awal (mol/(L·s))",
                    "V_\\max" to "Kecepatan reaksi maksimum saat seluruh enzim jenuh",
                    "[S]" to "Konsentrasi substrat (Molar)",
                    "K_m" to "Konstanta Michaelis (konsentrasi substrat saat v = 0.5 V_max)"
                )
            ),
            FormulaCard(
                title = "Persamaan Linier Lineweaver-Burk",
                latexFormula = "\\frac{1}{v} = \\frac{K_m}{V_{\\max}} \\cdot \\frac{1}{[S]} + \\frac{1}{V_{\\max}}",
                description = "Transformasi timbal-balik linier y = m x + c untuk mengekstraksi nilai parameter Km dan Vmax.",
                variableMeanings = mapOf(
                    "1/v" to "Sumbu y (kebalikan laju reaksi)",
                    "1/[S]" to "Sumbu x (kebalikan konsentrasi substrat)",
                    "1/V_\\max" to "Titik potong garis pada sumbu y (intersep y)",
                    "-1/K_m" to "Titik potong garis pada sumbu x (intersep x)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Desain Obat Inhibitor Enzim Protease HIV-1 di PT Kalbe Farma Research",
            industry = "Industri Biofarmasi & Desain Obat Rasional Berbantuan Struktur",
            context = "Virus HIV penyebab AIDS memerlukan enzim HIV-1 Protease untuk memotong poliprotein prekursor Gag-Pol menjadi protein virus matang yang menular.",
            problem = "Bagaimana merancang molekul obat penghambat enzim yang mampu mematikan HIV-1 Protease pada konsentrasi nanomolar tanpa mengganggu enzim protease alami tubuh manusia?",
            solution = "Tim kimia medisinal merancang molekul inhibitor Ritonavir dan Darunavir yang meniru struktur keadaan transisi tetrahedral (transition-state mimetic) dari ikatan peptida Phe-Pro yang dipotong oleh protease. Pada uji kinetika enzimatik, plot Lineweaver-Burk menunjukkan garis-garis bertumpu pada titik potong sumbu-y yang sama persis (1/V_max konstan) sementara titik potong sumbu-x bergeser mendekati nol, membuktikan mekanisme Inhibisi Kompetitif murni dengan konstanta inhibisi pikomolar sangat kuat K_i = 4.5 x 10⁻¹² M. Obat ini mengunci sisi aktif enzim secara sangat ketat, melumpuhkan replikasi virus HIV hingga 99.9% pada pasien.",
            lessonsLearned = "Analisis kuantitatif kinetika enzim Michaelis-Menten dan Lineweaver-Burk merupakan pilar utama di balik keberhasilan penemuan seluruh obat modern dunia."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Kinetika Enzim Katalase Air Liur / Ekstrak Ragi Memecah Kanji",
            objective = "Mengamati secara visual bagaimana konsentrasi enzim dan penambahan inhibitor asam cuka mengontrol laju reaksi enzimatik.",
            materialsNeeded = listOf(
                "Tepung kanji / maizena (1 sendok teh dilarutkan dalam 200 mL air hangat jernih)",
                "Larutan antiseptik povidon iodin (Betadine)",
                "Air liur segar (mengandung enzim alfa-amilase) atau ragi instan",
                "Asam cuka dapur (sebagai inhibitor denaturasi)",
                "3 gelas kaca bening transparan"
            ),
            steps = listOf(
                "Bagi larutan kanji cair ke dalam 3 gelas (Gelas A, B, C) masing-masing 50 mL.",
                "Teteskan 3 tetes Betadine ke masing-masing gelas: amati seluruh larutan seketika berubah warna menjadi biru tua kehitaman pekat (kompleks iodin-amilosa).",
                "Gelas A (Kontrol): Tidak ditambahkan enzim (warna biru tetap pekat berjam-jam).",
                "Gelas B (Reaksi Enzimatis Normal): Tambahkan 1 sendok teh air liur (amilase). Aduk perlahan dan nyalakan stopwatch: amati warna biru tua perlahan memudar dan berubah menjadi bening transparan sempurna dalam waktu 2–3 menit karena amilase memotong pati menjadi maltosa!",
                "Gelas C (Inhibisi Denaturasi Asam): Tambahkan 2 sendok makan asam cuka pekat terlebih dahulu, lalu tambahkan 1 sendok teh air liur: amati bahwa larutan TETAP berwarna biru kehitaman dan tidak memudar!",
                "Penjelasan: Asam cuka menurunkan pH drastis ke 3.0, mendenaturasi struktur tersier enzim amilase sehingga sisi aktifnya rusak dan kehilangan kemampuan katalitiknya!",
                "Simpulkan: Aktivitas enzimatik bekerja optimal pada pH fisiologis dan dapat dilumpuhkan oleh denaturasi lingkungan."
            ),
            safetyNotes = listOf(
                "Aktivitas biokimia dapur yang aman dan higienis.",
                "Cuci peralatan dengan sabun setelah selesai."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-enzim-kinetika-1",
                prompt = "Sebuah enzim mematuhi kinetika Michaelis-Menten dengan kecepatan maksimum V_max = 100 mikromol/(L·menit) dan konstanta Michaelis K_m = 2.0 mM. Berapakah kecepatan reaksi (v) ketika konsentrasi substrat [S] diberikan tepat sebesar 2.0 mM?",
                type = "numeric",
                correctAnswer = "50",
                tolerance = 0.5f,
                unit = "mikromol/(L·menit)",
                hints = listOf(
                    "Gunakan definisi mendasar dari konstanta Michaelis K_m.",
                    "K_m adalah konsentrasi substrat di mana kecepatan reaksi v mencapai tepat setengah dari V_max (v = 0.5 · V_max).",
                    "Di sini [S] = K_m = 2.0 mM. Maka v = 100 / 2 = ...?"
                ),
                explanation = "Berdasarkan definisi fundamental persamaan Michaelis-Menten: v = V_max [S] / (K_m + [S]). Ketika konsentrasi substrat [S] tepat sama dengan K_m ([S] = K_m), maka v = V_max K_m / (K_m + K_m) = V_max K_m / (2 K_m) = V_max / 2. Karena V_max = 100 mikromol/(L·menit), maka kecepatan reaksi adalah tepat v = 100 / 2 = 50 mikromol/(L·menit).",
                misconception = "Mencoba menghitung rumus rumit tanpa menyadari bahwa kondisi [S] = K_m secara definisi selalu menghasilkan v = 1/2 V_max."
            ),
            QuizQuestion(
                id = "q-enzim-kinetika-2",
                prompt = "Pada analisis plot ganda timbal balik Lineweaver-Burk, penambahan suatu molekul obat inhibitor menyebabkan garis grafik berputar naik di mana titik potong sumbu-y TETAP TIDAK BERUBAH (1/V_max konstan), namun titik potong sumbu-x bergeser mendekati nol (K_m semu membesar). Jenis inhibisi enzim apakah ini?",
                type = "multiple_choice",
                options = listOf(
                    "Inhibisi Kompetitif (Competitive Inhibition)",
                    "Inhibisi Non-Kompetitif (Non-competitive Inhibition)",
                    "Inhibisi Unkompetitif (Uncompetitive Inhibition)",
                    "Aktivasi Alosterik Positif"
                ),
                correctAnswer = "Inhibisi Kompetitif (Competitive Inhibition)",
                hints = listOf(
                    "Titik potong sumbu-y adalah 1 / V_max. Jika titik potong sumbu-y tetap, berarti V_max tidak berubah.",
                    "Titik potong sumbu-x adalah -1 / K_m. Jika bergeser mendekati nol, berarti nilai K_m semu membesar.",
                    "Inhibitor yang bersaing memperebutkan sisi aktif memiliki ciri khas V_max tetap dan K_m naik."
                ),
                explanation = "Ciri diagnostik utama dari Inhibisi Kompetitif pada plot Lineweaver-Burk adalah titik potong sumbu-y (1/V_max) yang tidak berubah, karena pada konsentrasi substrat yang sangat tinggi tak hingga, substrat akan mendesak keluar inhibitor dari sisi aktif sehingga V_max tetap dapat tercapai. Namun karena adanya persaingan, dibutuhkan konsentrasi substrat yang lebih tinggi untuk mencapai setengah V_max, menyebabkan nilai K_m semu meningkat (titik potong sumbu-x -1/K_m bergeser ke kanan mendekati nol).",
                misconception = "Tertukar dengan inhibisi non-kompetitif (pada non-kompetitif titik potong sumbu-y yang naik karena V_max turun, sedangkan titik potong sumbu-x tetap)."
            )
        )
    )

    private fun getBiokimiaJalurMetabolismeRespirasiLesson(): LessonData = LessonData(
        conceptId = "kim-biokimia-jalur-metabolisme-respirasi",
        storyPanels = listOf(
            StoryPanel(
                id = "p-metabol-respirasi-1",
                panelNumber = 1,
                title = "Pembangkit Listrik di Dalam Sel",
                caption = "Dimas menghitung bahwa satu molekul glukosa menghasilkan 32 molekul ATP melalui respirasi aerob mitokondria, namun hanya menghasilkan 2 ATP pada fermentasi anaerob.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana mitokondria melipatgandakan efisiensi pemanenan energi glukosa hingga 16 kali lipat lebih banyak daripada glikolisis sitoplasma?"
            ),
            StoryPanel(
                id = "p-metabol-respirasi-2",
                panelNumber = 2,
                title = "Kemiosmosis Peter Mitchell & Gradien Proton",
                caption = "Kakek menjelaskan hipotesis kemiosmosis pemenang Hadiah Nobel Peter Mitchell (1961).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Elektron dari NADH mengalir melalui Kompleks I, III, dan IV, melepaskan energi untuk memompa proton H⁺ keluar ke ruang antarmembran! Ini menciptakan gaya gerak proton (Proton Motive Force) berupa beda potensial listrik dan gradien pH seperti waduk bendungan air PLTA!"
            ),
            StoryPanel(
                id = "p-metabol-respirasi-3",
                panelNumber = 3,
                title = "Turbin Molekuler ATP Sintase F0F1",
                caption = "Kirana memperlihatkan struktur motor rotasi biologis nano ATP Sintase.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Proton mengalir kembali ke matriks menuruni gradien osmotik melalui rotor F0, memutar tangkai pusat gamma dengan kecepatan 8000 RPM! Putaran mekanik ini mengubah konformasi subunit beta F1 untuk mengikat ADP dan Pi menjadi ATP, mesin nano terhebat di alam semesta!"
            )
        ),
        intuition = "Respirasi seluler aerob adalah proses katabolisme terpadu di mana energi kimia ikatan C-C glukosa diekstraksi secara bertahap melalui empat tahap utama: (1) Glikolisis di sitosol (10 tahap enzimatik mengubah glukosa menjadi 2 piruvat, menghasilkan bersih 2 ATP dan 2 NADH); (2) Dekarboksilasi Oksidatif Piruvat menjadi Asetil-KoA di matriks mitokondria; (3) Siklus Asam Sitrat Krebs (8 reaksi membebaskan CO2 dan memanen 6 NADH, 2 FADH2, dan 2 GTP); dan (4) Fosforilasi Oksidatif pada membran dalam mitokondria. Teori Kemiosmosis Peter Mitchell membuktikan bahwa transfer elektron melalui Kompleks I, III, IV ke akseptor akhir oksigen (O2 + 4H⁺ + 4e⁻ -> 2 H2O) memompa proton ke ruang antarmembran, menciptakan Gaya Gerak Proton (Proton-Motive Force Delta-p = Delta-Psi - 59 Delta-pH). Aliran balik proton melalui motor nano rotasi ATP Sintase menggerakkan sintesis 30–32 ATP.",
        intuitionPoints = listOf(
            "Empat Kompleks Rantai Transpor Elektron: Kompleks I (NADH dehidrogenase, memompa 4 H⁺); Kompleks II (Suksinat dehidrogenase, tidak memompa H⁺); Kompleks III (Sitokrom bc1, memompa 4 H⁺); Kompleks IV (Sitokrom c Oksidase, memompa 2 H⁺ per pasang elektron).",
            "Gaya Gerak Proton (Proton-Motive Force / PMF): gabungan gradien potensial listrik membran (Delta-Psi ≈ 160–180 mV) dan gradien kimiawi pH (Delta-pH ≈ 0.5–1.0 unit), menghasilkan Delta-p ≈ 200–220 mV.",
            "Rasio P/O (ATP per pasang elektron): 1 NADH memompa total 10 H⁺ menghasilkan ~2.5 ATP; 1 FADH2 memompa 6 H⁺ menghasilkan ~1.5 ATP.",
            "Racun Respirasi: Rotenon menghambat Kompleks I; Karbon Monoksida (CO) dan Sianida (CN⁻) mengikat ion besi hema Kompleks IV (Sitokrom a3) mematikan transfer elektron ke oksigen seketika; Oligomisin memblokir kanal rotor F0 ATP Sintase; DNP (2,4-dinitrofenol) bertindak sebagai uncoupler yang membocorkan gradien proton menghasilkan panas tanpa ATP."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Gaya Gerak Proton Kemiosmosis (Proton-Motive Force / PMF)",
                latexFormula = "\\Delta p = \\Delta \\Psi - \\frac{2.303 R T}{F} \\Delta \\text{pH} \\approx \\Delta \\Psi - 0.059 \\, \\Delta \\text{pH}",
                description = "Potensial termodinamika total gradien proton melintasi membran dalam mitokondria pada 25°C.",
                variableMeanings = mapOf(
                    "\\Delta p" to "Gaya gerak proton (Proton-Motive Force / Volt)",
                    "\\Delta \\Psi" to "Potensial membran listrik melintasi membran (Volt, negatif di matriks)",
                    "\\Delta \\text{pH}" to "Selisih pH (pH_matriks - pH_antarmembran)"
                )
            ),
            FormulaCard(
                title = "Stoikiometri Bioenergetika Respirasi Glukosa Aerobik Total",
                latexFormula = "\\text{C}_6\\text{H}_{12}\\text{O}_6 + 6\\text{O}_2 + 32\\text{ADP} + 32\\text{P}_i \\xrightarrow{} 6\\text{CO}_2 + 6\\text{H}_2\\text{O} + 32\\text{ATP}",
                description = "Neraca energi teoretis respirasi seluler lengkap per molekul glukosa via ulang-alik malat-aspartat.",
                variableMeanings = mapOf(
                    "32 \\text{ ATP}" to "Hasil bersih energi biologis (setara efisiensi termodinamika ~34%)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Penyelidikan Toksikologi Forensik Keracunan Sianida di Puslabfor Bareskrim Polri",
            industry = "Toksikologi Forensik & Biokimia Medis Kriminalitas",
            context = "Pusat Laboratorium Forensik (Puslabfor) Bareskrim Polri menangani kasus keracunan sianida pada kasus pembunuhan racun minuman.",
            problem = "Korban meninggal dunia mendadak dalam hitungan menit dengan kadar saturasi oksigen darah vena tetap tinggi berwarna merah terang (vena merah menyala layaknya darah arteri). Mengapa korban mati lemas kehabisan oksigen (asfiksia seluler) padahal darahnya dipenuhi oksigen melimpah?",
            solution = "Toksikolog forensik menjelaskan mekanisme biokimiawi tingkat molekuler: Ion sianida (CN⁻) menembus mitokondria dan berikatan dengan afinitas pikomolar sangat kuat ke ion besi Fe³⁺ pada hema a3 Kompleks IV (Sitokrom c Oksidase) dari rantai transpor elektron. Pengikatan ini memblokir tahap akhir transfer elektron ke molekul oksigen. Rantai transpor elektron macet total seketika, pemompaan proton terhenti, gradien gaya gerak proton runtuh, dan sintesis ATP oleh ATP Sintase berhenti total. Karena sel tubuh tidak dapat lagi menggunakan oksigen yang ada di darah, oksigen tetap berada di hemoglobin dan kembali ke pembuluh vena tanpa terkonsumsi (menghasilkan darah vena merah terang khas keracunan sianida). Sel otak dan jantung mati lemas akibat kegagalan bioenergetika total dalam hitungan 3–5 menit.",
            lessonsLearned = "Penguasaan rantai transpor elektron mitokondria adalah landasan esensial dalam toksikologi forensik dan pengembangan antidotum medis darurat (seperti hidroksokobalamin)."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Kerja Rantai Respirasi Seluler Ragi Menggunakan Pewarna Metilen Biru",
            objective = "Melihat secara langsung aliran transfer elektron metabolik menggunakan indikator redoks donor-akseptor elektron.",
            materialsNeeded = listOf(
                "Ragi roti instan (khamir Saccharomyces cerevisiae) - 1 sachet",
                "Gula pasir (1 sendok makan)",
                "Larutan antiseptik Metilen Biru (Methylene Blue / obat biru ikan hias) - 2 tetes",
                "Air hangat suam kuku 40°C (100 mL)",
                "2 tabung reaksi atau 2 botol kaca kecil transparan bertutup rapat",
                "Minyak goreng (1 sendok makan sebagai penyekat oksigen udara)"
            ),
            steps = listOf(
                "Larutkan ragi instan dan gula pasir ke dalam 100 mL air hangat: biarkan 10 menit hingga mulai berbusa aktif melakukan metabolisme respirasi.",
                "Tuangkan 30 mL suspensi ragi aktif ke Botol 1 dan Botol 2.",
                "Teteskan 2 tetes larutan Metilen Biru ke masing-masing botol hingga cairan berwarna biru muda homogen (Metilen Biru berwarna biru dalam keadaan teroksidasi).",
                "Pada Botol 1: Tuangkan 1 sendok makan minyak goreng di atas permukaan larutan untuk menutup kontak oksigen dari udara, lalu tutup botol rapat-rapat.",
                "Pada Botol 2: Biarkan botol terbuka dan kocok terus menerus dengan udara bebas.",
                "Letakkan kedua botol di tempat hangat selama 15 menit.",
                "Amati perbedaannya: Di Botol 1 (tanpa oksigen luar), warna biru tua perlahan-lahan MEMUDAR dan MENJADI BENING PUTIH SEMPURNA! Enzim dehidrogenase ragi mentransfer elektron metabolik dari glukosa ke metilen biru, mereduksinya menjadi Leuco-Methylene Blue yang tidak berwarna!",
                "Sekarang buka tutup Botol 1 dan kocok kuat-kuat dengan udara: seketika warna biru muncul kembali karena teroksidasi oleh oksigen atmosfer!",
                "Simpulkan: Eksperimen ini adalah visualisasi langsung aliran transfer elektron metabolik sel hidup!"
            ),
            safetyNotes = listOf(
                "Metilen biru pewarna ikan aman digunakan dalam jumlah kecil (tetesan).",
                "Jangan diminum dan bersihkan noda biru pada meja."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-metabol-respirasi-1",
                prompt = "Berdasarkan Teori Kemiosmosis Peter Mitchell, apakah fungsi langsung dari energi yang dilepaskan selama aliran elektron melalui Kompleks I, III, dan IV pada rantai transpor elektron mitokondria?",
                type = "multiple_choice",
                options = listOf(
                    "Memompa ion proton (H⁺) secara aktif dari matriks mitokondria keluar ke ruang antarmembran untuk membangun gradien elektrokimiawi gaya gerak proton (PMF)",
                    "Memecah molekul glukosa menjadi asam piruvat",
                    "Memanaskan suhu inti sel tubuh hingga 100°C",
                    "Membuat mitokondria membelah diri menjadi dua"
                ),
                correctAnswer = "Memompa ion proton (H⁺) secara aktif dari matriks mitokondria keluar ke ruang antarmembran untuk membangun gradien elektrokimiawi gaya gerak proton (PMF)",
                hints = listOf(
                    "Aliran elektron menghasilkan energi bebas yang digunakan oleh pompa proton.",
                    "Proton terkumpul di ruang antarmembran (intermembrane space).",
                    "Gradien ini yang kemudian menggerakkan turbin ATP Sintase."
                ),
                explanation = "Energi bebas yang dilepaskan secara bertahap saat elektron mengalir menuruni potensial redoks melalui Kompleks I, III, dan IV digunakan secara langsung oleh kompleks-kompleks tersebut sebagai pompa proton aktif. Kompleks ini memompa ion H⁺ dari matriks melintasi membran dalam ke ruang antarmembran (total 10 H⁺ per pasang elektron dari NADH), menciptakan Gaya Gerak Proton (Proton-Motive Force) yang menggerakkan motor nano rotasi ATP Sintase.",
                misconception = "Mengira transfer elektron menghasilkan ATP secara kimiawi langsung tanpa perantara gradien proton (hipotesis senyawa intermediet fosfat berenergi tinggi klasik telah terbukti salah oleh teori kemiosmosis)."
            ),
            QuizQuestion(
                id = "q-metabol-respirasi-2",
                prompt = "Bagaimanakah mekanisme kerja racun mematikan Kalium Sianida (KCN) dalam melumpuhkan respirasi seluler aerobik makhluk hidup?",
                type = "multiple_choice",
                options = listOf(
                    "Mengikat secara ireversibel kofaktor ion besi Fe³⁺ pada hema Sitokrom a3 di Kompleks IV (Sitokrom c Oksidase), memblokir transfer elektron terakhir ke molekul oksigen dan menghentikan seluruh rantai transpor elektron",
                    "Menghancurkan seluruh membran luar mitokondria secara fisik",
                    "Mengubah semua molekul glukosa menjadi lemak",
                    "Mencegah pelepasan hormon insulin oleh pankreas"
                ),
                correctAnswer = "Mengikat secara ireversibel kofaktor ion besi Fe³⁺ pada hema Sitokrom a3 di Kompleks IV (Sitokrom c Oksidase), memblokir transfer elektron terakhir ke molekul oksigen dan menghentikan seluruh rantai transpor elektron",
                hints = listOf(
                    "Kompleks IV adalah Kompleks Sitokrom c Oksidase yang mengalirkan elektron ke akseptor akhir O2.",
                    "Sianida mengikat ion besi hema a3 dengan afinitas sangat kuat."
                ),
                explanation = "Ion sianida (CN⁻) adalah inhibitor pernapasan seluler yang sangat mematikan karena ia mengikat secara spesifik ion besi Fe³⁺ pada hema a3 di sisi aktif Kompleks IV (Sitokrom c Oksidase). Akibatnya, elektron tidak dapat ditransfer ke molekul oksigen, menyebabkan seluruh rantai transpor elektron macet total, gradien proton hilang, dan sintesis ATP seluler padam seketika, menyebabkan kematian seluler asfiksia dalam waktu sangat singkat.",
                misconception = "Mengira sianida menyerang hemoglobin darah paru-paru (sianida menyerang langsung enzim sitokrom oksidase di dalam mitokondria sel)."
            )
        )
    )
}

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

object BiologyLevel4Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "bio-biologi-sel-molekuler-dasar",
            domain = Domain.BIOLOGI,
            topic = "Biologi Sel Lanjut",
            title = "Transpor Vesikuler, Sorting Protein & Apoptosis Sel",
            description = "Transpor vesikuler berlapis klatrin/COP, sinyal sorting protein terarah, sambungan seluler (tight/gap junctions), dan kaskade kaspase apoptosis seluler terprogram.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("bio-sel-organel", "kim-biomolekul")
        ),
        ConceptItem(
            id = "bio-genetika-klasik-epigenetika",
            domain = Domain.BIOLOGI,
            topic = "Genetika Molekuler Lanjut",
            title = "Genetika Bakteri, Epigenetika & Regulasi Operon",
            description = "Pemetaan rekombinasi kromosom, transfer gen horizontal bakteri (konyugasi, transduksi), modifikasi epigenetika metilasi/asetilasi, dan regulasi Operon Lac & Trp.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("bio-genetika-mendel", "bio-sintesis-protein")
        ),
        ConceptItem(
            id = "bio-biokimia-metabolik",
            domain = Domain.BIOLOGI,
            topic = "Biokimia Metabolik",
            title = "Termodinamika Fosfat ATP, Sinyal Fosforilasi & Siklus Urea",
            description = "Termodinamika transfer gugus fosfat ATP, kaskade transduksi sinyal kinase-fosfatase, biosintesis lipid, serta katabolisme asam amino dan siklus urea hewan.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("bio-metabolisme-sel", "kim-termodinamika-kimia-dasar")
        ),
        ConceptItem(
            id = "bio-mikrobiologi-kurva-pertumbuhan",
            domain = Domain.BIOLOGI,
            topic = "Mikrobiologi Umum",
            title = "Kinetika Pertumbuhan Mikroba & Resistensi Antibiotik",
            description = "Kinetika kurva pertumbuhan bakteri kultur tumpak (batch), waktu generasi g dan laju spesifik mu, metode hitungan CFU dan turbiditas, serta mekanisme resistensi antibiotik.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("bio-virus-mikroba", "mat-kalkulus-turunan-lanjut")
        ),
        ConceptItem(
            id = "bio-fisiologi-komparatif-dasar",
            domain = Domain.BIOLOGI,
            topic = "Fisiologi Hewan & Tumbuhan",
            title = "Fisiologi Komparatif: Respirasi Arus Berlawanan & Osmoregulasi",
            description = "Pertukaran gas arus berlawanan pada insang ikan, sistem pernapasan kantung udara burung, mekanisme pengganda arus bolak-balik medula ginjal, dan osmoregulasi.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("bio-organ-hewan-manusia", "bio-jaringan-tumbuhan")
        ),
        ConceptItem(
            id = "bio-evolusi-kladistika",
            domain = Domain.BIOLOGI,
            topic = "Evolusi & Sistematika Modern",
            title = "Kladistika Filogenetik, Prinsip Parsimoni & Konsep Spesies",
            description = "Karakter sinapomorfi, rekonstruksi pohon filogenetik berbasis prinsip parsimoni maksimum DNA, klad monofiletik vs parafiletik, dan batas konsep spesies biologis.",
            level = DepthLevel.L4,
            estMinutes = 20,
            prerequisites = listOf("bio-evolusi-seleksi", "bio-keanekaragaman-hayati")
        ),
        ConceptItem(
            id = "bio-ekologi-umum-relung",
            domain = Domain.BIOLOGI,
            topic = "Ekologi Umum Kuantitatif",
            title = "Relung Ekologis, Eksklusi Kompetitif & Biogeografi Pulau",
            description = "Relung fundamental vs terealisasi, prinsip eksklusi kompetitif Gause, neraca produktivitas primer GPP/NPP, dan Teori Biogeografi Kepulauan MacArthur-Wilson.",
            level = DepthLevel.L4,
            estMinutes = 20,
            prerequisites = listOf("bio-ekologi-ekosistem", "mat-kalkulus-integral-teknik")
        ),
        ConceptItem(
            id = "bio-desain-eksperimen-anova",
            domain = Domain.BIOLOGI,
            topic = "Biostatistika & Desain Riset",
            title = "Desain Eksperimen Biologis RAL & Uji ANOVA Multivariabel",
            description = "Rancangan Acak Lengkap (RAL) dan Faktorial, Analisis Varians (ANOVA) satu dan dua arah, uji lanjut pembeda rata-rata (Duncan/Tukey), serta inferensi biometrik.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("mat-statistika-peluang", "bio-metode-ilmiah")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "bio-biologi-sel-molekuler-dasar" -> getBiologiSelMolekulerDasarLesson()
            "bio-genetika-klasik-epigenetika" -> getGenetikaKlasikEpigenetikaLesson()
            "bio-biokimia-metabolik" -> getBiokimiaMetabolikLesson()
            "bio-mikrobiologi-kurva-pertumbuhan" -> getMikrobiologiKurvaPertumbuhanLesson()
            "bio-fisiologi-komparatif-dasar" -> getFisiologiKomparatifDasarLesson()
            "bio-evolusi-kladistika" -> getEvolusiKladistikaLesson()
            "bio-ekologi-umum-relung" -> getEkologiUmumRelungLesson()
            "bio-desain-eksperimen-anova" -> getDesainEksperimenAnovaLesson()
            else -> null
        }
    }

    private fun getBiologiSelMolekulerDasarLesson(): LessonData = LessonData(
        conceptId = "bio-biologi-sel-molekuler-dasar",
        storyPanels = listOf(
            StoryPanel(
                id = "p-sel-mol-1",
                panelNumber = 1,
                title = "Sistem Pos di Dalam Sel",
                caption = "Dimas mengamati mikrograf elektron sel pankreas dan bertanya bagaimana ribuan enzim pencernaan yang disintesis di sitoplasma bisa tahu persis harus masuk ke vesikel sekretori dan tidak nyasar ke mitokondria.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana sel membungkus dan mengalamatkan protein ke organel yang tepat tanpa salah kirim ke bagian lain?"
            ),
            StoryPanel(
                id = "p-sel-mol-2",
                panelNumber = 2,
                title = "Kode Pos Peptida Sinyal & Mantel Vesikel",
                caption = "Kakek menjelaskan mekanisme penandaan peptida sinyal dan pembentukan vesikel berlapis protein mantel.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Setiap protein membawa 'kode pos' berupa urutan peptida sinyal spesifik. Vesikel dilapisi protein mantel: COP-II membawa kargo dari RE ke Golgi, COP-I untuk transpor balik, dan Klatrin mengontrol endositosis serta sekresi terarah!"
            ),
            StoryPanel(
                id = "p-sel-mol-3",
                panelNumber = 3,
                title = "Kematian Sel yang Tertib: Apoptosis",
                caption = "Kirana memperlihatkan bagaimana sel yang mengalami kerusakan DNA parah mengaktifkan bunuh diri terprogram tanpa merusak jaringan sekitarnya.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ketika sel tak lagi dapat memperbaiki mutasi, mitokondria melepaskan Sitokrom c, memicu aktivasi kaskade kaspase 9 dan 3. Sel menciut dan dimakan rapi oleh makrofag tanpa peradangan!"
            )
        ),
        intuition = "Sel bukan kantong sup enzim acak, melainkan pabrik berorganisasi tinggi dengan kompartementalisasi ketat. Protein yang disintesis di ribosom memiliki urutan peptida sinyal penentu tujuan. Transpor antar-kompartemen endomembran dimediasi oleh tunas vesikel yang diselubungi protein mantel khusus (Klatrin, COP-I, COP-II) yang kemudian dikenali oleh protein penambat SNARE di membran sasaran. Jika sel mengalami stres atau kerusakan genomik berat, sel mengaktifkan program kematian sel rapi (apoptosis) yang dieksekusi oleh enzim protease kaspase, berbeda dari nekrosis yang meledak dan memicu inflamasi.",
        intuitionPoints = listOf(
            "Jalur sekresi terarah: Retikulum Endoplasma Kasar -> Vesikel COP-II -> Aparatus Golgi -> Vesikel Klatrin -> Membran Plasma / Lisosom.",
            "Protein SNARE (v-SNARE pada vesikel dan t-SNARE pada membran target) memutar dan menekan lapisan lipid hingga terjadi fusi membran spontan.",
            "Jalur apoptosis intrinsik dikontrol oleh mitokondria: permeabilisasi membran luar mitokondria (MOMP) membebaskan Sitokrom c, membentuk apoptosom, dan mengaktifkan kaspase eksekutor 3 dan 7."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Kaskade Aktivasi Protease Kaspase",
                latexFormula = "\\text{Sinyal Kematian} \\xrightarrow{} \\text{Kaspase Inisiator (8, 9)} \\xrightarrow{} \\text{Kaspase Eksekutor (3, 7)} \\xrightarrow{} \\text{Lisis Protein Sel}",
                description = "Urutan amplifikasi enzimatik ireversibel pada apoptosis terprogram.",
                variableMeanings = mapOf(
                    "Kaspase 8" to "Inisiator jalur ekstrinsik (reseptor kematian FAS/TNF)",
                    "Kaspase 9" to "Inisiator jalur intrinsik (kebocoran mitokondria)",
                    "Kaspase 3" to "Protease eksekutor utama pemecah sitoskeleton dan DNA"
                )
            ),
            FormulaCard(
                title = "Keseimbangan Protein Keluarga Bcl-2",
                latexFormula = "\\text{Kecenderungan Apoptosis} \\propto \\frac{[\\text{Pro-apoptotik: Bax, Bak, Bad}]}{[\\text{Anti-apoptotik: Bcl-2, Bcl-xL}]}",
                description = "Penentu ambang permeabilitas membran luar mitokondria.",
                variableMeanings = mapOf(
                    "Bax, Bak" to "Protein pembentuk pori di membran mitokondria",
                    "Bcl-2" to "Protein penjaga keutuhan membran mitokondria"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Terapi Terarah Leukemia Limfositik Kronis di RS Kanker Dharmais Jakarta",
            industry = "Onkologi Klinis & Biofarmasi Molekuler",
            context = "Pasien Leukemia Limfositik Kronis (CLL) di RS Kanker Dharmais mengalami penumpukan sel limfosit B abnormal yang menolak mati dan resisten terhadap kemoterapi konvensional.",
            problem = "Sel kanker limfosit B memproduksi protein anti-apoptosis Bcl-2 dalam jumlah masif sehingga menghalangi aktivasi Bax/Bak dan mencegah apoptosis alami.",
            solution = "Tim onkologi molekuler menerapkan terapi inhibitor molekul kecil Venetoclax (BH3 mimetic). Obat ini meniru domain BH3 dari protein pro-apoptotik dan mengikat ceruk hidrofobik Bcl-2 dengan afinitas pikomolar tinggi, melepaskan protein Bax dan Bak yang sebelumnya disandera. Bax dan Bak bebas segera beroligomerisasi membentuk pori di membran mitokondria, memicu kebocoran Sitokrom c dan mengaktifkan kaspase-3. Dalam waktu 24 jam, jutaan sel kanker leukemia mati secara apoptosis terprogram tanpa melukai sel jaringan normal sekitarnya.",
            lessonsLearned = "Memahami jalur molekuler apoptosis sel memungkinkan perancangan obat antikanker presisi tinggi yang secara cerdas merestorasi mekanisme bunuh diri alami sel tubuh."
        ),
        homeLab = HomeLabData(
            title = "Model Analog Fusi Membran Vesikel & Lisis Lemak Menggunakan Deterjen Rumah Tangga",
            objective = "Memvisualisasikan prinsip fusi membran fosfolipid dwilapis dan pengaruh deterjen pada integritas seluler.",
            materialsNeeded = listOf(
                "1 piring datar berwarna putih",
                "Susu sapi cair full-cream (kaya globula lemak dan membran fosfolipid)",
                "3 jenis pewarna makanan cair berbeda warna (merah, biru, hijau)",
                "Sabun cuci piring cair",
                "Cotton bud / tusuk gigi"
            ),
            steps = listOf(
                "Tuangkan susu cair full-cream ke atas piring hingga menutupi dasar setebal 0.5 cm dan biarkan tenang.",
                "Teteskan masing-masing 1 tetes pewarna makanan di titik yang berdekatan di tengah piring (jangan diaduk).",
                "Celupkan ujung cotton bud ke sabun cuci piring cair.",
                "Sentuhkan ujung cotton bud berbusa sabun tepat di tengah tetesan pewarna di permukaan susu.",
                "Amati ledakan warna spektakuler yang terjadi seketika: globula lemak susu yang dilapisi membran fosfolipid pecah dan berfusi secara dinamis ke segala arah!",
                "Penjelasan: Molekul deterjen bersifat amfifilik (sama seperti fosfolipid membran sel). Deterjen menyisip ke dalam lapisan lipid, menurunkan tegangan antarmuka, dan memicu lisis membran mirip kerja enzim pemecah fosfolipid seluler."
            ),
            safetyNotes = listOf(
                "Praktikum sepenuhnya aman dan ramah anak.",
                "Gunakan susu yang sudah kadaluarsa jika ada untuk menghemat bahan."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sel-mol-1",
                prompt = "Protein mantel manakah yang bertanggung jawab membungkus vesikel transpor dari Retikulum Endoplasma menuju Aparatus Golgi (arah anterograd)?",
                type = "multiple_choice",
                options = listOf(
                    "COP-II",
                    "COP-I",
                    "Klatrin",
                    "Aktin"
                ),
                correctAnswer = "COP-II",
                hints = listOf(
                    "COP-I bertanggung jawab untuk transpor balik (retrograd dari Golgi ke RE).",
                    "COP-II bertanggung jawab untuk jalur maju awal (RE ke Golgi)."
                ),
                explanation = "Vesikel berlapis COP-II (Coat Protein II) memediasi transpor anterograd (maju) yang membawa protein hasil sintesis dari Retikulum Endoplasma menuju jaringan cis-Golgi. Sebaliknya, COP-I membawa kargo retrograd (mundur) kembali ke RE.",
                misconception = "Tertukar antara COP-I dan COP-II, atau mengira klatrin yang bertugas di seluruh bagian organel."
            ),
            QuizQuestion(
                id = "q-sel-mol-2",
                prompt = "Apa perbedaan biologis paling fundamental antara kematian sel secara Apoptosis dibandingkan Nekrosis?",
                type = "multiple_choice",
                options = listOf(
                    "Apoptosis adalah kematian sel terprogram yang rapi tanpa lisis membran mendadak dan tidak memicu inflamasi, sedangkan nekrosis adalah lisis sel traumatis yang melepaskan isi sel dan memicu inflamasi jaringan",
                    "Apoptosis selalu disebabkan oleh infeksi bakteri patogen sedangkan nekrosis disebabkan oleh penuaan alami",
                    "Apoptosis menyebabkan pembengkakan sel raksasa hingga pecah, sedangkan nekrosis menyusutkan sel",
                    "Apoptosis hanya terjadi pada sel tumbuhan sedangkan nekrosis hanya terjadi pada hewan"
                ),
                correctAnswer = "Apoptosis adalah kematian sel terprogram yang rapi tanpa lisis membran mendadak dan tidak memicu inflamasi, sedangkan nekrosis adalah lisis sel traumatis yang melepaskan isi sel dan memicu inflamasi jaringan",
                hints = listOf(
                    "Perhatikan respon sistem imun terhadap tumpahan isi sel.",
                    "Apoptosis membentuk badan apoptosis rapi yang difagositosis oleh makrofag."
                ),
                explanation = "Apoptosis adalah bunuh diri seluler teratur di mana sel menciut, kromatin memadat, dan sel memecah menjadi badan apoptosis terbungkus membran tanpa menumpahkan isinya, sehingga tidak memicu reaksi radang (inflamasi). Sebaliknya, nekrosis adalah kematian akibat trauma fisik/racun di mana integritas membran hilang, sel membengkak dan meledak, memicu peradangan hebat di jaringan sekitarnya.",
                misconception = "Mengira semua bentuk kematian sel selalu merusak dan memicu nanah/peradangan."
            )
        )
    )

    private fun getGenetikaKlasikEpigenetikaLesson(): LessonData = LessonData(
        conceptId = "bio-genetika-klasik-epigenetika",
        storyPanels = listOf(
            StoryPanel(
                id = "p-gen-epi-1",
                panelNumber = 1,
                title = "Kembar Identik dengan Takdir Berbeda",
                caption = "Dimas membaca jurnal kedokteran tentang sepasang anak kembar monozigot yang memiliki sekuens DNA 100% identik, namun saat dewasa hanya satu orang yang menderita diabetes melitus dan asma.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika urutan kode nukleotida DNA mereka persis sama dari lahir, bagaimana mungkin kondisi kesehatan mereka bisa sangat berbeda saat dewasa?"
            ),
            StoryPanel(
                id = "p-gen-epi-2",
                panelNumber = 2,
                title = "Tanda Epigenetika di Atas DNA",
                caption = "Kakek menjelaskan konsep epigenetika: lapisan instruksi kimiawi di luar sekuens dasar gen.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sekuens DNA adalah buku teksnya, Dimas, tapi epigenetika adalah stabilo dan catatan pinggirnya! Metilasi gugus sitosin (CpG) membungkam gen, sedangkan asetilasi ekor histon melonggarkan gulungan kromatin sehingga gen dapat dibaca oleh RNA polimerase."
            ),
            StoryPanel(
                id = "p-gen-epi-3",
                panelNumber = 3,
                title = "Logika Operon Bakteri",
                caption = "Kirana menggambar sirkuit Operon Lak pada Escherichia coli, memperlihatkan logika komputasi biologis sederhana.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Bakteri sudah memiliki kecerdasan komputasi sejak miliaran tahun lalu! Operon Lak bekerja seperti gerbang logika AND: Gen pencerna laktosa HANYA menyala jika (Laktosa ADA) DAN (Glukosa TIDAK ADA) melalui kombinasi represor LacI dan aktivator CAP-cAMP!"
            )
        ),
        intuition = "Epigenetika merujuk pada perubahan ekspresi gen yang dapat diwariskan secara mitosis/meiosis tanpa mengubah urutan basa nitrogen DNA itu sendiri. Metilasi DNA (penambahan gugus -CH3 pada karbon ke-5 cincin sitosin) umumnya mematikan ekspresi gen dengan menghalangi faktor transkripsi. Modifikasi pascatranslasi histon (asetilasi oleh HAT dan deasetilasi oleh HDAC) mengatur peralihan antara eukromatin longgar yang aktif dan heterokromatin rapat yang diam. Pada prokariot, efisiensi metabolisme dikendalikan melalui sistem Operon—klaster gen struktural di bawah kendali satu promotor dan operator tunggal.",
        intuitionPoints = listOf(
            "Metilasi pulau CpG pada promotor gen biasanya menyebabkan peredaman transkripsi (gene silencing) jangka panjang.",
            "Asetilasi lisin pada histon menetralkan muatan positifnya, mengurangi daya ikat ke tulang punggung DNA yang bermuatan negatif, membuka kromatin (eukromatin) untuk transkripsi aktif.",
            "Operon Lac menunjukkan regulasi negatif (oleh represor LacI yang dilepaskan oleh allolaktosa) dan regulasi positif (oleh protein aktivator katabolit CAP yang diaktifkan oleh cAMP saat glukosa langka)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Frekuensi Rekombinasi Genetik (Peta Morgan)",
                latexFormula = "\\text{RF} = \\frac{\\text{Jumlah Individu Rekombinan}}{\\text{Total Jumlah Keturunan}} \\times 100\\%",
                description = "Jarak gen pada kromosom dinyatakan dalam satuan centimorgan (cM), di mana 1% rekombinasi = 1 cM.",
                variableMeanings = mapOf(
                    "\\text{RF}" to "Frekuensi Rekombinasi (%)",
                    "cM" to "Centimorgan (satuan jarak peta genetik)"
                )
            ),
            FormulaCard(
                title = "Status Ekspresi Operon Lac Prokariotik",
                latexFormula = "\\text{Transkripsi Aktif} \\iff [\\text{Laktosa}] > 0 \\quad \\text{DAN} \\quad [\\text{Glukosa}] \\approx 0",
                description = "Kondisi ganda yang diperlukan untuk ekspresi maksimal enzim beta-galaktosidase.",
                variableMeanings = mapOf(
                    "[Laktosa] > 0" to "Allolaktosa berikatan dengan LacI (melepaskan represor dari operator)",
                    "[Glukosa] rendah" to "cAMP tinggi -> kompleks CAP-cAMP mengikat promotor untuk menarik RNA Polimerase"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemuliaan Padi Varietas Unggul Toleran Kekeringan di BBPadi Sukamandi",
            industry = "Bioteknologi Pertanian & Ketahanan Pangan Nasional",
            context = "Balai Besar Penelitian Tanaman Padi (BBPadi) Sukamandi, Jawa Barat, meneliti mekanisme adaptasi tanaman padi (*Oryza sativa*) terhadap stres kekeringan akibat fenomena El Niño.",
            problem = "Mengapa tanaman padi yang pernah mengalami stres kekeringan ringan di fase bibit menunjukkan ketahanan kekeringan yang jauh lebih kokoh pada fase bunting dibanding tanaman kontrol yang belum pernah terpapar, padahal tidak ada mutasi gen baru?",
            solution = "Fenomena ini adalah memori stres epigenetika (epigenetic stress memory). Ketika bibit mengalami kekeringan, terjadi demetilasi sitosin pada promotor gen *OsDREB1* (gen pengatur respon dehidrasi) serta hiperasetilasi histon H3K9 pada lokus tersebut. Tanda epigenetika ini tetap bertahan setelah bibit disiram kembali. Ketika kekeringan ekstrem melanda pada fase bunting, gen *OsDREB1* yang kromatinnya sudah dalam keadaan 'siaga terbuka' langsung ditranskripsi 5 kali lebih cepat dan melimpah, menginduksi sintesis prolin dan penutupan stomata dengan cepat, mencegah kematian tanaman.",
            lessonsLearned = "Modifikasi epigenetika memungkinkan organisme merespons dan mengingat fluktuasi lingkungan secara adaptif tanpa harus menunggu seleksi mutasi genetik acak selama ratusan generasi."
        ),
        homeLab = HomeLabData(
            title = "Model Simulasi Saklar Komputasi Operon Lac Menggunakan Magnet Kulkas",
            objective = "Memahami interaksi antara represor, operator, aktivator, dan promotor dalam regulasi gen bakteri.",
            materialsNeeded = listOf(
                "1 lembar karton / kertas gambar tebal",
                "Spidol warna-warni",
                "3 buah magnet kulkas kecil",
                "Klip kertas logam",
                "Label kertas tempel (sticky notes)"
            ),
            steps = listOf(
                "Gambar garis panjang di karton merepresentasikan DNA dengan segmen berurutan: [Gen Regulator lacI] - [Situs CAP] - [Promotor] - [Operator] - [Gen lacZ-lacY-lacA].",
                "Beri label magnet 1 sebagai 'Represor LacI' dan magnet 2 sebagai 'Induser Allolaktosa'.",
                "Simulasikan kondisi Glukosa Tinggi, Laktosa Rendah: Pasang magnet 'Represor' di atas kotak 'Operator' menggunakan klip kertas. Tempelkan mobil-mobilan kecil / tutup botol sebagai 'RNA Polimerase' di Promotor: jalannya terhalang oleh magnet Represor di Operator! Transkripsi = OFF.",
                "Simulasikan Laktosa Hadir: Rekatkan magnet 'Allolaktosa' ke magnet 'Represor', menyebabkan Represor terlepas dari Operator.",
                "Simulasikan Glukosa Rendah: Pasang magnet 3 ('CAP-cAMP') di situs CAP. Sekarang jalur terbuka bersih dan RNA polimerase meluncur lancar mentranskripsi seluruh gen lacZ! Transkripsi = ON MAKSIMAL!"
            ),
            safetyNotes = listOf(
                "Jauhkan magnet kecil dari jangkauan anak balita.",
                "Simpan peralatan setelah simulasi selesai."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-gen-epi-1",
                prompt = "Apa dampak langsung dari penambahan gugus asetil (-COCH₃) pada residu asam amino lisin di ekor protein histon oleh enzim Histone Acetyltransferase (HAT)?",
                type = "multiple_choice",
                options = listOf(
                    "Menetralkan muatan positif histon, melonggarkan ikatan histon dengan DNA bermuatan negatif, dan mengaktifkan transkripsi gen",
                    "Memotong untai ganda DNA secara permanen",
                    "Memadatkan kromatin menjadi heterokromatin rapat sehingga gen mati",
                    "Menghapus seluruh sekuens basa nitrogen sitosin di dalam gen"
                ),
                correctAnswer = "Menetralkan muatan positif histon, melonggarkan ikatan histon dengan DNA bermuatan negatif, dan mengaktifkan transkripsi gen",
                hints = listOf(
                    "DNA bermuatan negatif karena gugus fosfat pada tulang punggungnya.",
                    "Lisin pada histon bermuatan positif menarik DNA dengan kuat.",
                    "Asetilasi menetralkan muatan positif ini."
                ),
                explanation = "Ekor protein histon kaya akan asam amino lisin yang bermuatan positif, yang menarik tulang punggung DNA bermuatan negatif secara kuat. Enzim HAT mentransfer gugus asetil ke lisin, menetralkan muatannya. Tarikan elektrostatik melemah, gulungan nukleosom melonggar menjadi eukromatin terbuka, memberi akses bagi RNA polimerase dan faktor transkripsi untuk membaca gen.",
                misconception = "Mengira modifikasi histon mengubah urutan basa adenin, timin, guanin, dan sitosin."
            ),
            QuizQuestion(
                id = "q-gen-epi-2",
                prompt = "Dalam eksperimen persilangan uji (test cross) pada Drosophila melanogaster, dari 1.000 keturunan yang diperoleh, ditemukan 80 lalat bertipe rekombinan. Berapakah jarak genetik antara kedua gen tersebut?",
                type = "numeric",
                correctAnswer = "8",
                tolerance = 0.1f,
                unit = "cM",
                hints = listOf(
                    "Gunakan rumus Frekuensi Rekombinasi: RF = (Rekombinan / Total) · 100%.",
                    "RF = (80 / 1000) · 100% = ...%",
                    "1% rekombinasi setara dengan 1 centimorgan (cM)."
                ),
                explanation = "Frekuensi rekombinasi RF = (80 / 1000) · 100% = 8.0%. Karena 1% frekuensi pindah silang didefinisikan setara dengan 1 centimorgan (cM) jarak peta genetik, maka jarak kedua gen pada kromosom lalat adalah 8 cM.",
                misconception = "Lupa mengalikan 100% sehingga menjawab 0.08 cM."
            )
        )
    )

    private fun getBiokimiaMetabolikLesson(): LessonData = LessonData(
        conceptId = "bio-biokimia-metabolik",
        storyPanels = listOf(
            StoryPanel(
                id = "p-biokim-1",
                panelNumber = 1,
                title = "Mata Uang Energi Semesta",
                caption = "Dimas memegang botol suplemen dan berpikir mengapa sel makhluk hidup di seluruh bumi selalu menggunakan molekul yang sama—Adenosin Trifosfat (ATP)—sebagai pembawa energi universal.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kenapa sel selalu memakai ATP untuk memompa ion, kontraksi otot, dan berpikir? Apa rahasia kimia di balik ikatan fosfatnya?"
            ),
            StoryPanel(
                id = "p-biokim-2",
                panelNumber = 2,
                title = "Tolakan Muatan & Stabilisasi Resonansi",
                caption = "Kakek menggambarkan struktur tiga gugus fosfat yang berderet pada molekul ATP.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Lihat empat muatan negatif yang berdesakan pada rantai trifosfat itu, Dimas! Tolakan elektrostatiknya luar biasa besar seperti pegas baja yang dipadatkan. Ketika ikatan fosfoanhidrida terputus menghasilkan ADP dan Pi, muatan terlepas, dan produknya distabilkan oleh resonansi kuantum dengan pelepasan delta G° = -30.5 kJ/mol!"
            ),
            StoryPanel(
                id = "p-biokim-3",
                panelNumber = 3,
                title = "Pembersihan Racun Siklus Urea",
                caption = "Kirana memaparkan bagaimana hati membuang gugus amina beracun dari katabolisme protein.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Saat asam amino dibongkar menjadi energi, amonia (NH₄⁺) beracun dibebaskan. Hati menjalankan Siklus Urea di mitokondria dan sitosol untuk mengubah racun saraf amonia menjadi urea netral yang aman dibuang lewat urine!"
            )
        ),
        intuition = "ATP adalah mata uang energi biologis karena memiliki potensi transfer gugus fosfat menengah yang ideal—cukup tinggi untuk menggerakkan reaksi endergonik tetapi cukup rendah untuk dapat diregenerasi oleh metabolit berenergi lebih tinggi (seperti fosfoenolpiruvat dan 1,3-bisfosfogliserat). Transduksi sinyal intraseluler dikontrol oleh penambahan gugus fosfat oleh protein kinase dan pelepasannya oleh fosfatase. Pada metabolisme nitrogen, pemecahan asam amino menghasilkan amonia neurotoksik yang harus segera diubah menjadi urea melalui Siklus Urea hepatosit yang memerlukan koordinasi mitokondria-sitosol.",
        intuitionPoints = listOf(
            "Hidrolisis ATP -> ADP + Pi membebaskan energi bebas standar delta G'° = -30.5 kJ/mol (pada kondisi seluler nyata bahkan mencapai -50 kJ/mol).",
            "Prinsip penggandengan reaksi (reaction coupling): reaksi tidak spontan (delta G > 0) digabungkan dengan hidrolisis ATP (delta G < 0) sehingga delta G total < 0.",
            "Siklus Urea dimulai di matriks mitokondria (pembentukan karbamoil fosfat oleh CPS-1) dan diselesaikan di sitosol (arginin dihidrolisis arginase menghasilkan urea)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Termodinamika Hidrolisis ATP",
                latexFormula = "\\text{ATP} + \\text{H}_2\\text{O} \\rightleftharpoons \\text{ADP} + \\text{P}_i \\quad (\\Delta G'^\circ = -30.5 \\text{ kJ/mol})",
                description = "Pelepasan energi bebas akibat pemutusan ikatan fosfoanhidrida berenergi tinggi.",
                variableMeanings = mapOf(
                    "\\Delta G'^\\circ" to "Perubahan energi bebas Gibbs standar biologis (pH 7, 25°C)",
                    "P_i" to "Fosfat anorganik bebas (HPO₄²⁻ / H₂PO₄⁻)"
                )
            ),
            FormulaCard(
                title = "Reaksi Stoikiometri Siklus Urea Total",
                latexFormula = "\\text{NH}_4^+ + \\text{HCO}_3^- + \\text{Aspartat} + 3\\text{ATP} \\xrightarrow{} \\text{Urea} + \\text{Fumarat} + 2\\text{ADP} + \\text{AMP} + 4\\text{P}_i",
                description = "Pengeluaran energi metabolik 4 ikatan fosfat ekuivalen untuk mengikat dua atom nitrogen ke dalam satu molekul urea.",
                variableMeanings = mapOf(
                    "\\text{Urea}" to "Senyawa buangan nitrogen netral CO(NH₂)₂",
                    "\\text{Aspartat}" to "Asam amino donor atom nitrogen kedua",
                    "\\text{Fumarat}" to "Produk samping yang masuk kembali ke siklus asam sitrat"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Penanganan Hiperamonemia Koma Hepatik di RSUPN Dr. Cipto Mangunkusumo (RSCM)",
            industry = "Hepatologi Klinis & Kedokteran Metabolik",
            context = "Pasien sirosis hati dekompensata di RSCM Jakarta mengalami penurunan kesadaran akut (ensefalopati hepatik) dengan kadar amonia plasma melonjak di atas 200 mikromol/L (normal < 50 mikromol/L).",
            problem = "Kerusakan masif parenkim hati melumpuhkan enzim Karbamoil Fosfat Sintetase 1 (CPS-1) dan Siklus Urea. Amonia yang lolos ke peredaran darah menembus sawar darah-otak, menyebabkan pembengkakan astrosit dan edema serebral yang mengancam jiwa.",
            solution = "Tim medis RSCM segera memberikan terapi kombinasional: (1) L-ornitin L-aspartat (LOLA) intravena untuk menyediakan substrat antara pendorong sisa enzim siklus urea dan sintesis glutamin; (2) Laktulosa oral untuk mengasamkan lumen usus (mengubah amonia difusibel NH₃ menjadi ion amonium tak terserap NH₄⁺); dan (3) Natrium benzoat intravena yang bereaksi dengan glisin membentuk hipurat untuk jalur ekskresi nitrogen alternatif lewat ginjal tanpa melalui siklus urea yang rusak.",
            lessonsLearned = "Penguasaan jalur biokimiawi Siklus Urea dan metabolisme nitrogen merupakan landasan kritis dalam menyelamatkan nyawa pasien kritis penyakit hati di rumah sakit rujukan nasional."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Metabolisme Bioenergetik Fermentasi Ragi pada Berbagai Substrat",
            objective = "Mengukur laju konversi energi metabolik gula menjadi gas CO2 dan energi seluler secara semi-kuantitatif.",
            materialsNeeded = listOf(
                "3 botol plastik bekas 330 mL atau 500 mL yang bersih",
                "3 buah balon karet tiup",
                "Ragi roti instan (khamir Saccharomyces cerevisiae) - 3 sachet",
                "Air hangat suam kuku 40°C (300 mL)",
                "Gula pasir putih (sukrosa)",
                "Tepung terigu (pati kompleks)",
                "Penggaris atau pita ukur jahit"
            ),
            steps = listOf(
                "Beri label ketiga botol: Botol A (Gula pasir 2 sendok teh), Botol B (Tepung terigu 2 sendok teh), Botol C (Kontrol tanpa gula).",
                "Masukkan 1 sachet ragi instan ke masing-masing botol.",
                "Tuangkan 100 mL air hangat suam kuku ke dalam setiap botol, lalu kocok perlahan hingga homogen.",
                "Segera pasang balon karet di mulut masing-masing botol dengan rapat.",
                "Letakkan ketiga botol di tempat hangat dan nyalakan stopwatch. Amati pembesaran balon setiap 10 menit selama 40 menit.",
                "Hasil: Balon pada Botol A (gula sederhana) mengembang paling cepat dan besar karena sukrosa dihidrolisis cepat menghasilkan ATP melimpah dan gas CO2 sampingan. Botol B mengembang sangat lambat karena pemecahan pati kompleks membutuhkan waktu hidrolisis enzimatis bertahap. Balon C tidak mengembang karena kekurangan substrat karbon!"
            ),
            safetyNotes = listOf(
                "Jangan gunakan air mendidih karena akan membunuh sel ragi hidup.",
                "Pastikan balon terpasang kencang agar tidak terlepas saat gas CO2 terbentuk."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-biokim-1",
                prompt = "Mengapa hidrolisis ATP menghasilkan pelepasan energi bebas Gibbs yang sangat besar (sangat negatif, delta G'° = -30.5 kJ/mol)?",
                type = "multiple_choice",
                options = listOf(
                    "Karena mengurangi tolakan elektrostatik antar-muatan negatif gugus fosfat dan produknya (ADP + Pi) mengalami stabilisasi resonansi yang jauh lebih besar",
                    "Karena ikatan fosfat mengandung atom radioaktif yang meluruh saat terhidrolisis",
                    "Karena reaksi tersebut melepaskan molekul gas hidrogen dalam jumlah besar",
                    "Karena molekul adenosin terpecah menjadi nukleotida terpisah"
                ),
                correctAnswer = "Karena mengurangi tolakan elektrostatik antar-muatan negatif gugus fosfat dan produknya (ADP + Pi) mengalami stabilisasi resonansi yang jauh lebih besar",
                hints = listOf(
                    "Tinjau muatan negatif pada keempat atom oksigen di rantai trifosfat.",
                    "Fosfat anorganik bebas (Pi) memiliki banyak bentuk struktur resonansi."
                ),
                explanation = "Tingginya pelepasan energi pada hidrolisis ATP didorong oleh: (1) Pelepasan tegangan tolakan elektrostatik antara 4 muatan negatif yang berdesakan pada rantai trifosfat; (2) Produk hidrolisis (terutama fosfat anorganik Pi) memiliki bentuk hibrida resonansi yang jauh lebih stabil dibanding saat terikat dalam rantai ATP; dan (3) Peningkatan hidrasi ionik produk oleh molekul air pelarut.",
                misconception = "Mengira ikatan kimia menyimpan energi seperti bahan peledak yang meledak sendiri saat diputus (pemutusan ikatan selalu membutuhkan energi; pelepasan energi terjadi karena pembentukan produk baru yang jauh lebih stabil)."
            ),
            QuizQuestion(
                id = "q-biokim-2",
                prompt = "Berapakah jumlah ekuivalen ikatan fosfat berenergi tinggi dari ATP yang dikonsumsi oleh hepatosit untuk mensintesis satu molekul urea dalam Siklus Urea?",
                type = "numeric",
                correctAnswer = "4",
                tolerance = 0.1f,
                unit = "ikatan fosfat",
                hints = listOf(
                    "Tahap Karbamoil Fosfat Sintetase 1 mengonsumsi 2 ATP -> 2 ADP (2 ikatan fosfat).",
                    "Tahap Argininosuksinat Sintetase mengonsumsi 1 ATP -> AMP + PPi (setara dengan konsumsi 2 ikatan fosfat karena PPi dihidrolisis menjadi 2 Pi).",
                    "Total ekuivalen ikatan = 2 + 2 = ...?"
                ),
                explanation = "Sintesis satu molekul urea mengonsumsi 3 molekul ATP, namun satu ATP dihidrolisis menjadi AMP dan pirofosfat (PPi). Pirofosfat kemudian dihidrolisis lebih lanjut menjadi 2 Pi oleh pirofosfatase anorganik. Dengan demikian, secara termodinamika total energi metabolik yang dikonsumsi adalah setara dengan 4 ikatan fosfat berenergi tinggi.",
                misconception = "Hanya menghitung 3 molekul ATP tanpa memperhitungkan hidrolisis pirofosfat (PPi) pada pembentukan argininosuksinat."
            )
        )
    )

    private fun getMikrobiologiKurvaPertumbuhanLesson(): LessonData = LessonData(
        conceptId = "bio-mikrobiologi-kurva-pertumbuhan",
        storyPanels = listOf(
            StoryPanel(
                id = "p-mikro-1",
                panelNumber = 1,
                title = "Ledakan Koloni Tak Kasat Mata",
                caption = "Dimas lupa memasukkan semangkuk sup ayam ke dalam lemari es semalaman. Di pagi hari, sup tersebut sudah berbusa keruh dan berbau masam menyengat.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kemarin malam sup ini bersih dan baru mendidih, bagaimana bisa hanya dalam 8 jam jumlah bakteri meledak hingga miliaran sel?"
            ),
            StoryPanel(
                id = "p-mikro-2",
                panelNumber = 2,
                title = "Empat Fase Kurva Pertumbuhan",
                caption = "Kakek menggambarkan kurva pertumbuhan mikroba kultur tertutup (batch culture) pada sumbu logaritmik.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Bakteri berkembang biak dengan pembelahan biner eksponensial N = N_0 · 2^(t/g). Kurvanya terbagi 4 fase: Fase Lag (adaptasi enzim), Fase Log / Eksponensial (pembelahan masif), Fase Stasioner (nutrisi menipis, racun menumpuk), dan Fase Kematian!"
            ),
            StoryPanel(
                id = "p-mikro-3",
                panelNumber = 3,
                title = "Ancaman Superbug Kebal Antibiotik",
                caption = "Kirana memaparkan bahaya bakteri resisten antibiotik yang memproduksi enzim beta-laktamase dan pompa efluks.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Penggunaan antibiotik yang serampangan menyeleksi mutan kebal. Bakteri mutan memproduksi beta-laktamase yang memotong cincin penisilin, atau menyalakan pompa efluks yang membuang obat keluar sel sebelum sempat bekerja!"
            )
        ),
        intuition = "Pertumbuhan bakteri dalam sistem tertutup mengikuti kurva pertumbuhan sigmoid khas pada skala logaritmik. Waktu generasi (g) atau waktu penggandaan (doubling time) adalah waktu yang dibutuhkan populasi untuk melipatgandakan jumlah selnya selama fase log. Dalam fase eksponensial, laju pertumbuhan spesifik mu dihitung dari kemiringan plot log natural jumlah sel terhadap waktu. Pengetahuan kinetika ini krusial untuk industri fermentasi bioproses serta pengendalian resistensi antibiotik di mana dosis harus mempertahankan kadar obat di atas Konsentrasi Hambat Minimum (MIC).",
        intuitionPoints = listOf(
            "Persamaan pembelahan eksponensial: N_t = N_0 · 2^n, di mana n = t / g adalah jumlah generasi pembelahan.",
            "Laju pertumbuhan spesifik mu = (ln N_2 - ln N_1) / (t_2 - t_1) dan hubungan waktu generasi: g = ln(2) / mu ≈ 0.693 / mu.",
            "Tiga mekanisme utama resistensi antibiotik mikroba: (1) Inaktivasi enzimatik (misal beta-laktamase memotong cincin beta-laktam penisilin); (2) Modifikasi target reseptor obat (misal mutasi PBP atau ribosom); (3) Pompa efluks aktif yang memompa keluar molekul antibiotik dari sitoplasma.",
            "CFU (Colony Forming Units) mengukur sel mikroba hidup viabel, sedangkan spektrofotometri Optical Density (OD_600) mengukur biomassa total (sel hidup + mati)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Kinetika Pembelahan Eksponensial Mikroba",
                latexFormula = "N_t = N_0 \\cdot e^{\\mu t} \\quad ; \\quad g = \\frac{\\ln 2}{\\mu}",
                description = "Menghitung pertambahan populasi sel mikroba selama fase log eksponensial.",
                variableMeanings = mapOf(
                    "N_t" to "Jumlah populasi mikroba pada waktu t",
                    "N_0" to "Jumlah populasi mikroba awal",
                    "\\mu" to "Laju pertumbuhan spesifik (jam⁻¹)",
                    "g" to "Waktu generasi / doubling time (jam)"
                )
            ),
            FormulaCard(
                title = "Perhitungan Waktu Generasi (Doubling Time)",
                latexFormula = "g = \\frac{t}{n} = \\frac{t}{\\frac{\\log N_t - \\log N_0}{\\log 2}}",
                description = "Menghitung waktu yang dibutuhkan untuk satu siklus pembelahan biner dari data jumlah sel awal dan akhir.",
                variableMeanings = mapOf(
                    "t" to "Durasi waktu pembelahan total",
                    "n" to "Jumlah generasi pembelahan sel"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Surveilans Infeksi Bakteri Multi-Resisten Acinetobacter baumannii di ICU RS Dr. Soetomo Surabaya",
            industry = "Mikrobiologi Medis & Pengendalian Infeksi Rumah Sakit",
            context = "Ruang Intensive Care Unit (ICU) RSUD Dr. Soetomo menghadapi lonjakan kasus pneumonia nosokomial akibat isolat *Acinetobacter baumannii* resisten karbapenem (CRAB).",
            problem = "Bakteri patogen ini kebal terhadap hampir seluruh antibiotik lini pertama dan kedua (penisilin, sefalosporin, karbapenem). Bagaimana menentukan rejimen terapi efektif berbasis farmakokinetika/farmakodinamika (PK/PD)?",
            solution = "Laboratorium mikrobiologi klinik menguji nilai Konsentrasi Hambat Minimum (Minimum Inhibitory Concentration / MIC) isolat pasien menggunakan metode mikrodilusi kaldu. Hasil menunjukkan MIC meropenem melonjak menjadi 32 mg/L (resisten tinggi akibat produksi enzim karbapenemase OXA-23), namun MIC kolistin masih sensitif (0.5 mg/L). Berdasarkan kurva waktu bunuh kuman (time-kill curve), kolistin memiliki sifat bakterisidal bergantung konsentrasi. Dokter spesialis mikrobiologi merekomendasikan terapi kombinasi kolistin dosis tinggi dengan meropenem infus kontinu berdurasi 4 jam untuk memaksimalkan waktu kadar obat di atas MIC (T > MIC), berhasil mengeradikasi infeksi dan menurunkan mortalitas sepsis pasien.",
            lessonsLearned = "Analisis kuantitatif kinetika mikroba dan MIC merupakan instrumen penyelamat paling vital dalam melawan krisis resistensi antibiotik global."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Kualitatif Fase Kekeruhan Pertumbuhan Mikroba Kaldu Dapur",
            objective = "Mengamati perkembangan fase pertumbuhan mikroba secara visual melalui perubahan turbiditas (kekeruhan kaldu).",
            materialsNeeded = listOf(
                "1 bungkus kaldu ayam bubuk",
                "Air mendidih (300 mL)",
                "3 botol kaca selai transparan bersih bertutup",
                "Lampu senter smartphone",
                "Spidol permanen untuk menandai botol"
            ),
            steps = listOf(
                "Larutkan 1 sendok teh kaldu bubuk ke dalam 300 mL air mendidih untuk membuat media pertumbuhan cair bening kaya nutrisi.",
                "Tuangkan masing-masing 100 mL kaldu mendidih ke dalam 3 botol (Botol A, B, C).",
                "Tutup rapat Botol A saat masih panas mendidih dan simpan di kulkas (sebagai kontrol steril dingin).",
                "Biarkan Botol B terbuka di udara dapur selama 2 jam agar mikroba udara masuk, lalu tutup rapat dan letakkan di suhu ruang (28–30°C).",
                "Biarkan Botol C terbuka terus-menerus di dekat tempat sampah dapur.",
                "Amati kejernihan larutan setiap 6 jam menggunakan sorotan lampu senter dari belakang botol: amati transisi dari jernih sempurna (fase lag) menjadi berkabut keruh (fase log, pembelahan mikroba masif), hingga terbentuk lapisan lendir keruh tebal di permukaan (fase stasioner)."
            ),
            safetyNotes = listOf(
                "Jangan membuka tutup botol setelah cairan menjadi keruh dan berbau busuk.",
                "Buang cairan keruh langsung ke saluran pembuangan toilet dan cuci botol dengan pemutih/sabun."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mikro-1",
                prompt = "Sebuah kultur bakteri Escherichia coli memiliki populasi awal N_0 = 1.000 sel. Jika waktu generasi bakteri tersebut pada suhu 37°C adalah g = 20 menit, berapakah jumlah populasi bakteri setelah tumbuh selama 2 jam (120 menit) dalam fase eksponensial?",
                type = "numeric",
                correctAnswer = "64000",
                tolerance = 100f,
                unit = "sel",
                hints = listOf(
                    "Hitung jumlah generasi n = t / g = 120 menit / 20 menit = 6 generasi.",
                    "Gunakan rumus N_t = N_0 · 2^n = 1.000 · 2⁶.",
                    "2⁶ = 64. N_t = 1.000 · 64 = ...?"
                ),
                explanation = "Jumlah generasi pembelahan n = total waktu / waktu generasi = 120 menit / 20 menit = 6 generasi. Populasi akhir N_t = N_0 · 2^n = 1.000 · 2⁶ = 1.000 · 64 = 64.000 sel.",
                misconception = "Salah menghitung n dengan membagi 2 jam langsung tanpa mengonversi jam ke menit (menghitung 2/20 bukannya 120/20)."
            ),
            QuizQuestion(
                id = "q-mikro-2",
                prompt = "Bagaimana mekanisme kerja enzim beta-laktamase yang diproduksi oleh bakteri 'Superbug' dalam melumpuhkan antibiotik golongan penisilin dan sefalosporin?",
                type = "multiple_choice",
                options = listOf(
                    "Menghidrolisis secara spesifik ikatan amida pada cincin inti empat-anggota beta-laktam sehingga antibiotik kehilangan kemampuan mengikat protein PBP dinding sel",
                    "Memotong untai DNA plasmid bakteri itu sendiri",
                    "Mengubah membran sel bakteri menjadi dinding berlapis lilin tebal",
                    "Mencegah antibiotik larut di dalam air"
                ),
                correctAnswer = "Menghidrolisis secara spesifik ikatan amida pada cincin inti empat-anggota beta-laktam sehingga antibiotik kehilangan kemampuan mengikat protein PBP dinding sel",
                hints = listOf(
                    "Cincin beta-laktam adalah struktur inti peniru substrat D-Ala-D-Ala.",
                    "Enzim beta-laktamase membuka cincin tersebut melalui hidrolisis."
                ),
                explanation = "Antibiotik golongan penisilin dan sefalosporin bekerja dengan meniru rantai D-Ala-D-Ala untuk mengikat dan melumpuhkan Penicillin-Binding Proteins (PBP) pembuat dinding sel. Bakteri resisten menghasilkan enzim beta-laktamase yang memutus cincin amida empat anggota beta-laktam menjadi bentuk terbuka inaktif, sehingga antibiotik tidak lagi dapat berikatan dengan targetnya.",
                misconception = "Mengira antibiotik dirusak oleh asam lambung bakteri bukannya oleh enzim spesifik."
            )
        )
    )

    private fun getFisiologiKomparatifDasarLesson(): LessonData = LessonData(
        conceptId = "bio-fisiologi-komparatif-dasar",
        storyPanels = listOf(
            StoryPanel(
                id = "p-fisiologi-1",
                panelNumber = 1,
                title = "Efisiensi Napas di Bawah Air",
                caption = "Dimas heran mengetahui bahwa air laut hanya mengandung oksigen terlarut kurang dari 1% (dibandingkan udara atmosfer yang mengandung 21% O₂), namun ikan todak dapat berenang lincah dengan kecepatan 100 km/jam.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Air laut sangat miskin oksigen dan kental. Bagaimana insang ikan bisa mengekstraksi oksigen dari air dengan efisiensi mendekati 85%?"
            ),
            StoryPanel(
                id = "p-fisiologi-2",
                panelNumber = 2,
                title = "Pertukaran Arus Berlawanan (Countercurrent)",
                caption = "Kakek menggambarkan arah aliran darah di kapiler lamela insang yang berlawanan arah dengan aliran air laut di atasnya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kuncinya adalah sistem Countercurrent Exchange! Jika darah dan air mengalir searah, difusi berhenti di tengah jalan saat kadar mencapai 50%. Tapi karena darah mengalir berlawanan arah dengan air, gradien konsentrasi selalu terjaga di sepanjang kapiler, menyerap hingga 85% oksigen!"
            ),
            StoryPanel(
                id = "p-fisiologi-3",
                panelNumber = 3,
                title = "Pemekatan Urin di Medula Ginjal",
                caption = "Kirana memaparkan prinsip pengali arus bolak-balik (Countercurrent Multiplier) pada lengkung Henle nefron mamalia.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Prinsip serupa dipakai ginjal kita! Lengkung Henle yang menjulur dalam ke medula ginjal memompa garam untuk menciptakan gradien osmotik dari 300 hingga 1200 mOsm/L, memungkinkan saluran pengumpul menyerap kembali 99% air tubuh!"
            )
        ),
        intuition = "Fisiologi komparatif mengungkap bagaimana berbagai garis keturunan hewan menyelesaikan tantangan fisika-kimia yang sama melalui adaptasi anatomi dan transport fluida yang brilian. Prinsip pertukaran arus berlawanan (Countercurrent Exchange) adalah solusi rekayasa biofisika terhebat di alam: dengan mengalirkan dua fluida dalam arah berlawanan secara bersebelahan, gradien difusi (baik untuk panas, oksigen, maupun ion) dipertahankan konstan di sepanjang lintasan, menghasilkan efisiensi transfer yang jauh melampaui sistem searah (cocurrent).",
        intuitionPoints = listOf(
            "Insang ikan: aliran air dan aliran darah kapiler lamela berlawanan arah, memaksimalkan ekstraksi oksigen hingga >80% (sistem searah teoritis maksimal hanya 50%).",
            "Paru-paru burung: memiliki sistem kantung udara (air sacs) yang menghasilkan aliran udara satu arah kontinu (unidirectional flow) melewati parabronkus, memungkinkan pertukaran gas terjadi baik saat inspirasi MAUPUN ekspirasi.",
            "Lengkung Henle mamalia: bertindak sebagai pengali arus bolak-balik (Countercurrent Multiplier) yang memompa Na⁺/Cl⁻ di ansa asenden tebal, memekatkan medula ginjal hingga 1.200 mOsm/L untuk memicu reabsorpsi air osmotik di duktus kolektivus.",
            "Hewan gurun (seperti tikus kanguru) memiliki lengkung Henle yang luar biasa panjang di medula ginjal, memungkinkannya memproduksi urin pekat 4.000 mOsm/L dan hidup seumur hidup tanpa meminum setetes air pun."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Efisiensi Ekstraksi Difusi Arus Berlawanan",
                latexFormula = "\\frac{d C}{d x} = -k \\left(C_{\\text{air}}(x) - C_{\\text{darah}}(x)\\right) \\quad \\text{dengan } C_{\\text{air}}(x) > C_{\\text{darah}}(x) \\; \\forall x",
                description = "Gradien konsentrasi positif selalu terjaga di seluruh panjang kontak lamela insang x dari 0 sampai L.",
                variableMeanings = mapOf(
                    "C_air(x)" to "Konsentrasi oksigen dalam air pada posisi x",
                    "C_darah(x)" to "Konsentrasi oksigen dalam darah pada posisi x",
                    "k" to "Koefisien permeabilitas difusi Fick"
                )
            ),
            FormulaCard(
                title = "Gradien Osmolalitas Ginjal Mamalia",
                latexFormula = "\\text{Osmolalitas Medula} = \\text{Osmolalitas Korteks} \\times 2^{n} \\quad (300 \\to 1.200 \\text{ mOsm/kg})",
                description = "Peningkatan tekanan osmotik medula ginjal akibat aksi pompa ion countercurrent multiplier lengkung Henle.",
                variableMeanings = mapOf(
                    "Osmolalitas Korteks" to "Kira-kira 300 mOsm/kg (isotonik dengan plasma darah)",
                    "Osmolalitas Medula Papila" to "Mencapai 1.200–1.400 mOsm/kg pada manusia"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Adaptasi Fisiologis Menyelam Mamalia Laut Paus Sperma di Selat Alor, NTT",
            industry = "Fisiologi Kelautan & Konservasi Satwa Liar Maritim",
            context = "Perairan dalam Selat Alor dan Laut Sawu di Nusa Tenggara Timur merupakan koridor migrasi paus sperma (*Physeter macrocephalus*) yang menyelam mencari cumi-cumi raksasa hingga kedalaman 2.000 meter selama lebih dari 90 menit tanpa bernapas.",
            problem = "Pada kedalaman 2.000 meter, tekanan hidrostatik mencapai 200 atmosfer (20 MPa), suhu air mendekati 2°C, dan tidak ada akses ke udara atmosfer. Mengapa paus tidak mengalami penyakit dekompresi ('the bends') atau mati lemas hipoksia?",
            solution = "Paus sperma memiliki adaptasi fisiologis komparatif ekstrem: (1) Menolak menyimpan udara di paru-paru: rongga dada dan alveolus sengaja dikolaps (kempis) pada kedalaman 100 m untuk mencegah penyerapan gas nitrogen ke dalam darah (mencegah penyakit dekompresi); (2) Penyimpanan O₂ dialihkan ke mioglobin otot yang sangat pekat (otot berwarna hitam pekat kaya zat besi dan bermuatan listrik positif tinggi mencegah agregasi protein); (3) Refleks menyelam ekstrem: denyut jantung anjlok (bradikardia) dari 60 menjadi hanya 4 denyut per menit, dan sirkulasi darah diputus total ke otot dan saluran cerna via vasokonstriksi selektif, mengalirkan darah beroksigen murni hanya ke otak dan jantung.",
            lessonsLearned = "Fisiologi komparatif membuktikan bagaimana hukum fisika fluida dan biokimia tekanan ekstrem dapat ditaklukkan oleh evolusi adaptif jaringan tubuh mamalia."
        ),
        homeLab = HomeLabData(
            title = "Model Demonstrasi Pertukaran Kalor Arus Searah vs Arus Berlawanan",
            objective = "Membuktikan secara fisik bahwa aliran arus berlawanan menghasilkan perpindahan panas yang jauh lebih tuntas dan efisien dibanding aliran searah.",
            materialsNeeded = listOf(
                "2 buah sedotan plastik panjang lentur",
                "Selotip tahan air bening",
                "2 wadah cangkir air (satu berisi air es dingin berwarna biru, satu berisi air hangat berwarna merah)",
                "2 buah spuit jarum suntik plastik tanpa jarum (ukuran 20 mL atau 50 mL)",
                "Termometer atau jari tangan untuk merasakan suhu ujung sedotan"
            ),
            steps = listOf(
                "Tempelkan kedua sedotan secara bersisian sejajar menggunakan selotip tahan air sepanjang 15 cm.",
                "Uji Aliran Searah (Cocurrent): Hubungkan kedua spuit di ujung yang sama. Tekan spuit secara bersamaan sehingga air hangat (merah) dan air dingin (biru) mengalir ke arah yang sama. Rasakan suhu air yang keluar di ujung satunya: kedua aliran keluar dengan suhu hangat suam-suam kuku yang sama (suhu rata-rata campuran).",
                "Uji Aliran Berlawanan (Countercurrent): Balikkan satu sedotan sehingga cairan dialirkan dari arah berlawanan (air hangat masuk dari kiri ke kanan, air dingin ditekan dari kanan ke kiri).",
                "Rasakan suhu air di kedua ujung keluar: air dingin yang keluar dari ujung kanan menjadi jauh lebih hangat mendekati suhu air panas yang baru masuk, dan air panas yang keluar di ujung kiri menjadi dingin mendekati es!",
                "Simpulkan: Arus berlawanan berhasil mentransfer hampir seluruh kalor dari satu aliran ke aliran lainnya, prinsip yang sama persis digunakan oleh insang ikan todak dan ginjal manusia!"
            ),
            safetyNotes = listOf(
                "Gunakan air hangat yang nyaman di kulit (jangan gunakan air mendidih).",
                "Lakukan di atas nampan agar tidak membasahi lantai."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-fisiologi-1",
                prompt = "Mengapa sistem pertukaran arus berlawanan (countercurrent exchange) pada insang ikan jauh lebih unggul dibandingkan sistem aliran searah (cocurrent)?",
                type = "multiple_choice",
                options = listOf(
                    "Karena gradien konsentrasi oksigen antara air dan darah selalu terjaga di sepanjang lintasan kapiler sehingga transfer oksigen dapat mencapai lebih dari 80%",
                    "Karena aliran searah menyebabkan air membeku di dalam insang",
                    "Karena darah di insang mengalir dua kali lebih cepat dari kecepatan renang ikan",
                    "Karena aliran searah membutuhkan lebih banyak organ jantung tambahan"
                ),
                correctAnswer = "Karena gradien konsentrasi oksigen antara air dan darah selalu terjaga di sepanjang lintasan kapiler sehingga transfer oksigen dapat mencapai lebih dari 80%",
                hints = listOf(
                    "Pada aliran searah, begitu konsentrasi seimbang (50%-50%), difusi berhenti.",
                    "Pada arus berlawanan, darah yang paling miskin O2 bertemu air yang sudah diambil sebagian O2-nya, dan darah yang paling kaya O2 bertemu air segar yang baru masuk."
                ),
                explanation = "Dalam sistem pertukaran arus berlawanan, air kaya oksigen pertama kali bersentuhan dengan darah yang sudah hampir jenuh oksigen, sehingga difusi tetap terjadi. Saat air bergerak keluar dengan sisa oksigen rendah, ia bersentuhan dengan darah yang baru datang dari tubuh dengan kadar oksigen sangat rendah, menjaga gradien difusi tetap positif di seluruh panjang lamela, mencapai efisiensi penyerapan hingga 80–85%.",
                misconception = "Mengira aliran searah lebih baik karena arah aliran darah searah dengan arah berenang ikan."
            ),
            QuizQuestion(
                id = "q-fisiologi-2",
                prompt = "Bagian manakah dari nefron ginjal mamalia yang bertanggung jawab secara aktif memompa ion Na⁺ dan Cl⁻ ke ruang interstisial medula tanpa permeabilitas air, menciptakan gradien osmotik hipertonik medula?",
                type = "multiple_choice",
                options = listOf(
                    "Ansa asenden tebal lengkung Henle (Thick Ascending Limb)",
                    "Ansa desenden tipis lengkung Henle",
                    "Kapsula Bowman",
                    "Glomerulus"
                ),
                correctAnswer = "Ansa asenden tebal lengkung Henle (Thick Ascending Limb)",
                hints = listOf(
                    "Ansa desenden permeable terhadap air tetapi impermeable terhadap garam.",
                    "Ansa asenden tebal memiliki kotransporter Na-K-2Cl aktif dan kedap air."
                ),
                explanation = "Ansa asenden tebal lengkung Henle (Thick Ascending Limb) memiliki pompa transpor aktif kotransporter Na⁺-K⁺-2Cl⁻ (NKCC2) yang memompa garam ke dalam cairan interstisial medula, dan membran segmen ini kedap air (impermeabel terhadap air). Akibatnya, garam keluar tanpa diikuti air, menciptakan lingkungan interstisial medula yang sangat hipertonik.",
                misconception = "Mengira ansa desenden yang memompa garam (ansa desenden pasif mereabsorpsi air melalui kanal akuaporin)."
            )
        )
    )

    private fun getEvolusiKladistikaLesson(): LessonData = LessonData(
        conceptId = "bio-evolusi-kladistika",
        storyPanels = listOf(
            StoryPanel(
                id = "p-klad-1",
                panelNumber = 1,
                title = "Dilema Buaya, Burung, dan Kadal",
                caption = "Dimas terkejut membaca buku teks biologi modern yang menyatakan bahwa secara filogenetik, buaya berkerabat jauh lebih dekat dengan burung merpati daripada dengan kadal atau kura-kura!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Buaya dan kadal sama-sama melata, berkulit sisik keras, dan berdarah dingin. Bagaimana mungkin buaya dikatakan lebih berkerabat dekat dengan burung berbulu yang terbang di udara?"
            ),
            StoryPanel(
                id = "p-klad-2",
                panelNumber = 2,
                title = "Karakter Turunan Bersama (Sinapomorfi)",
                caption = "Kakek menjelaskan revolusi sistematika filogenetika yang dipelopori oleh Willi Hennig.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Kemiripan sisik dan berdarah dingin pada buaya dan kadal adalah karakter purba primitif leluhur (simpleisiomorfi), Dimas! Buaya dan burung berbagi karakter turunan baru (sinapomorfi) seperti jantung 4 ruang sempurna, sarang telur terjaga, dan lubang tengkorak Archosauria yang tidak dimiliki kadal!"
            ),
            StoryPanel(
                id = "p-klad-3",
                panelNumber = 3,
                title = "Klad Monofiletik & Parsimoni DNA",
                caption = "Kirana menyusun pohon kladogram DNA menggunakan prinsip Parsimoni Maksimum (Occam's Razor).",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kelompok takson sejati haruslah Monofiletik: mencakup satu leluhur bersama dan SEMUA keturunannya. Kelas 'Reptilia' tradisional yang membuang burung adalah kelompok Parafiletik yang tidak valid secara filogenetika!"
            )
        ),
        intuition = "Kladistika adalah metode klasifikasi biologis modern yang mengelompokkan organisme semata-mata berdasarkan garis keturunan evolusioner bersama (genealogi), bukan berdasarkan kesamaan fisik permukaan atau adaptasi ekologis konvergen. Fondasi kladistika bertumpu pada identifikasi sinapomorfi (karakter turunan bersama yang diturunkan dari nenek moyang bersama terdekat). Pohon filogenetik terbaik dipilih menggunakan Prinsip Parsimoni Maksimum (Maximum Parsimony), yaitu hipotesis pohon yang memerlukan jumlah mutasi/perubahan evolusioner paling sedikit (Occam's razor).",
        intuitionPoints = listOf(
            "Monofiletik (Klad Sejati): kelompok yang terdiri dari satu nenek moyang bersama dan SELURUH keturunannya (contoh: Mammalia, Aves, Archosauria).",
            "Parafiletik: kelompok yang mencakup nenek moyang bersama tetapi MENGECUALIKAN sebagian keturunannya (contoh: 'Reptilia' klasik jika tidak memasukkan burung; 'Pisces' jika tidak memasukkan Tetrapoda).",
            "Polifiletik: kelompok yang anggotanya berasal dari nenek moyang yang berbeda akibat kemiripan analogi/konvergensi (contoh: kelompok 'hewan berdarah panas' yang menggabungkan mamalia dan burung tanpa reptil).",
            "Prinsip Parsimoni: pohon dengan total panjang langkah mutasi karakter (tree length) paling pendek adalah hipotesis filogenetik yang paling didukung."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Skor Parsimoni Panjang Pohon Filogenetik",
                latexFormula = "L = \\sum_{i=1}^{M} l_i \\quad ; \\quad \\text{Pohon Terbaik} = \\arg\\min(L)",
                description = "L adalah total jumlah langkah perubahan karakter evolusioner di seluruh cabang pohon filogenetik.",
                variableMeanings = mapOf(
                    "L" to "Total panjang pohon (tree length / skor parsimoni)",
                    "l_i" to "Jumlah perubahan untuk karakter ke-i",
                    "M" to "Jumlah total karakter (morfologi atau posisi basa DNA)"
                )
            ),
            FormulaCard(
                title = "Indeks Konsistensi Karakter (Consistency Index)",
                latexFormula = "CI = \\frac{m}{s}",
                description = "Mengukur tingkat homoplasi (konvergensi/pembalikan karakter). CI = 1 berarti tidak ada homoplasi sama sekali.",
                variableMeanings = mapOf(
                    "m" to "Jumlah minimum perubahan teoritis yang mungkin",
                    "s" to "Jumlah perubahan aktual yang diobservasi pada pohon"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Resolusi Filogenetik & Taksonomi Komodo di Pusat Riset Biosistematika BRIN Cibinong",
            industry = "Biosistematika Molekuler & Konservasi Biodiversitas",
            context = "Pusat Riset Biosistematika dan Evolusi BRIN menganalisis genom mitokondria dan lokus nuklir biawak Komodo (*Varanus komodoensis*) dan spesies biawak kepulauan Indo-Australia.",
            problem = "Ukuran tubuh raksasa Komodo (hingga 3 meter) selama puluhan tahun diperdebatkan: apakah Komodo mengalami fenomena gigantisme pulau (island gigantism) dari leluhur berukuran kecil, atau merupakan sisa populasi purba megafauna benua Australia yang bermigrasi?",
            solution = "Peneliti BRIN menyusun matriks sekuens DNA dari 15 spesies genus *Varanus* menggunakan parsimoni maksimum dan analisis Bayesian. Pohon filogeni monofiletik yang dihasilkan menempatkan Komodo dalam satu klad bersama biawak raksasa Australia yang telah punah (*Varanus priscus* / Megalania berukuran 6 meter). Analisis jam molekuler membuktikan bahwa Komodo bukan hasil gigantisme lokal di Flores/Rinca, melainkan berasal dari radiasi garis keturunan purba benua Australia sekitar 3.8 juta tahun lalu yang menyeberangi jembatan darat zaman es ke Paparan Sunda/Wallacea sebelum akhirnya punah di Australia dan terisolasi di Nusa Tenggara.",
            lessonsLearned = "Analisis kladistika molekuler mampu membongkar sejarah biogeografi purba yang tidak dapat diungkap hanya dari morfologi fisik kasat mata."
        ),
        homeLab = HomeLabData(
            title = "Konstruksi Pohon Kladogram Filogenetik Sederhana dari Matriks Buah-buahan",
            objective = "Mempraktikkan langsung penyusunan kladogram berbasis karakter turunan bersama (sinapomorfi) dan prinsip parsimoni.",
            materialsNeeded = listOf(
                "5 jenis buah/tumbuhan nyata di dapur: Lumut hati/lumut daun (outgroup), Paku-pakuan, Pinus/cemara, Mangga, Pisang",
                "Lembar kertas HVS dan penggaris",
                "Spidol warna"
            ),
            steps = listOf(
                "Buat tabel matriks karakter (0 = karakter primitif leluhur, 1 = karakter turunan baru).",
                "Karakter 1: Jaringan vaskular sejati (Xilem & Floem) -> Lumut (0), Paku (1), Pinus (1), Mangga (1), Pisang (1).",
                "Karakter 2: Menghasilkan biji -> Lumut (0), Paku (0), Pinus (1), Mangga (1), Pisang (1).",
                "Karakter 3: Memiliki bunga dan buah tertutup (Angiospermae) -> Lumut (0), Paku (0), Pinus (0), Mangga (1), Pisang (1).",
                "Karakter 4: Biji berkeping satu (Monokotil) -> Lumut (0), Paku (0), Pinus (0), Mangga (0), Pisang (1).",
                "Gambar kladogram bertingkat: Tarik garis pangkal dari Lumut, lalu cabang pertama muncul Paku (sinapomorfi: vaskular), cabang berikutnya Pinus (sinapomorfi: biji), cabang berikutnya memisahkan Mangga (Eudikotil) dan Pisang (sinapomorfi: monokotil).",
                "Amati bagaimana setiap titik percabangan (node) didefinisikan secara tegas oleh kemunculan sinapomorfi baru!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan menggunakan bahan dapur/taman.",
                "Dapat digantikan dengan gambar atau foto jika spesimen asli tidak tersedia."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-klad-1",
                prompt = "Mengapa kelompok tradisional 'Pisces' (ikan) yang mencakup hiu, ikan mas, dan ikan paru-paru dianggap sebagai takson PARAFILETIK dalam kladistika modern?",
                type = "multiple_choice",
                options = listOf(
                    "Karena mencakup nenek moyang vertebrata berahang purba tetapi MENGECUALIKAN kelompok Tetrapoda (amfibi, reptil, burung, mamalia) yang berevolusi dari ikan bersirip daging",
                    "Karena ikan tidak memiliki materi genetik DNA",
                    "Karena hiu bukan hewan bertulang belakang",
                    "Karena semua ikan hidup di air tawar"
                ),
                correctAnswer = "Karena mencakup nenek moyang vertebrata berahang purba tetapi MENGECUALIKAN kelompok Tetrapoda (amfibi, reptil, burung, mamalia) yang berevolusi dari ikan bersirip daging",
                hints = listOf(
                    "Ingat definisi kelompok parafiletik: mencakup leluhur bersama tetapi membuang sebagian keturunannya.",
                    "Tetrapoda (termasuk manusia) secara evolusioner berkerabat lebih dekat dengan ikan paru-paru (lungfish) dibanding ikan mas."
                ),
                explanation = "Dalam sejarah evolusi, Tetrapoda (hewan berkaki empat: amfibi, reptil, mamalia) diturunkan langsung dari ikan bersirip cuping (Sarcopterygii). Jika kita membuat kelompok 'ikan' yang hanya mencakup ikan air dan membuang hewan darat tetrapoda, maka kelompok tersebut mengecualikan sebagian keturunan dari nenek moyang bersama yang sama, sehingga menjadikannya kelompok parafiletik yang tidak sah dalam kladistika murni.",
                misconception = "Mengira pengelompokan biologis hanya didasarkan pada habitat (di air vs di darat)."
            ),
            QuizQuestion(
                id = "q-klad-2",
                prompt = "Berdasarkan prinsip Parsimoni Maksimum (Maximum Parsimony), pohon filogenetik manakah yang dipilih oleh para ilmuwan sebagai hipotesis terbaik?",
                type = "multiple_choice",
                options = listOf(
                    "Pohon yang memerlukan jumlah total langkah mutasi / perubahan karakter paling sedikit",
                    "Pohon yang memiliki cabang paling banyak dan rumit",
                    "Pohon yang menempatkan manusia di puncak tertinggi",
                    "Pohon yang mengabaikan data sekuens DNA"
                ),
                correctAnswer = "Pohon yang memerlukan jumlah total langkah mutasi / perubahan karakter paling sedikit",
                hints = listOf(
                    "Prinsip parsimoni adalah penerapan pisau cukur Occam (Occam's razor).",
                    "Hipotesis yang paling sederhana dan minim asumsi perubahan mutasi adalah yang paling mungkin benar."
                ),
                explanation = "Prinsip Parsimoni Maksimum memilih pohon filogenetik yang meminimalkan jumlah total perubahan evolusioner (mutasi nukleotida atau perubahan morfologi) yang diperlukan untuk menjelaskan data. Ini didasarkan pada prinsip Occam's razor bahwa penjelasan yang paling sederhana dengan asumsi kejadian konvergensi minimal adalah hipotesis kerja yang paling kuat.",
                misconception = "Mengira pohon dengan langkah perubahan paling banyak yang paling disukai karena dianggap lebih dinamis."
            )
        )
    )

    private fun getEkologiUmumRelungLesson(): LessonData = LessonData(
        conceptId = "bio-ekologi-umum-relung",
        storyPanels = listOf(
            StoryPanel(
                id = "p-relung-1",
                panelNumber = 1,
                title = "Eksperimen Dua Paramecium Georgy Gause",
                caption = "Dimas membaca percobaan klasik Georgy Gause (1934): Ketika Paramecium aurelia dan Paramecium caudatum dibiakkan terpisah, keduanya tumbuh subur. Namun saat dicampur dalam satu tabung yang sama, P. caudatum selalu punah dalam 16 hari!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kedua spesies paramecium sama-sama sehat dan makan bakteri yang sama. Mengapa mereka tidak bisa berbagi makanan dan hidup berdampingan secara damai di tabung yang sama?"
            ),
            StoryPanel(
                id = "p-relung-2",
                panelNumber = 2,
                title = "Prinsip Eksklusi Kompetitif",
                caption = "Kakek menjelaskan Prinsip Eksklusi Kompetitif (Hukum Gause) dan konsep relung ekologis Hutchinson.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Dua spesies dengan relung ekologis yang identik tidak dapat hidup berdampingan tanpa batas jika sumber daya terbatas! Salah satu pasti sedikit lebih efisien dan menyingkirkan yang lain, kecuali terjadi pembagian sumber daya (resource partitioning)."
            ),
            StoryPanel(
                id = "p-relung-3",
                panelNumber = 3,
                title = "Keseimbangan Dinamis Biogeografi Pulau",
                caption = "Kirana menggambar grafik kesetimbangan MacArthur-Wilson yang menghubungkan laju imigrasi dan laju kepunahan spesies di pulau.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Kekayaan spesies pulau S* adalah titik potong dinamis antara laju imigrasi (dipengaruhi jarak pulau ke daratan utama) dan laju kepunahan (dipengaruhi luas area pulau)!"
            )
        ),
        intuition = "Relung ekologis (ecological niche) bukan sekadar tempat tinggal fisik (habitat), melainkan peranan fungsional total dan rentang kondisi multivariat n-dimensi (suhu, kelembapan, ukuran mangsa) di mana spesies dapat bertahan hidup dan bereproduksi. G. Evelyn Hutchinson membedakan Relung Fundamental (seluruh kondisi potensial di mana spesies dapat hidup tanpa kompetitor) dan Relung Terealisasi (kondisi nyata yang lebih sempit akibat kehadiran predator dan kompetitor). Model Biogeografi Kepulauan MacArthur-Wilson memprediksi jumlah spesies seimbang S* di pulau berdasarkan kompromi ukuran luas pulau dan jarak isolasinya.",
        intuitionPoints = listOf(
            "Prinsip Eksklusi Kompetitif Gause: jika dua spesies bersaing memperebutkan sumber daya pembatas yang persis sama, spesies dengan keunggulan kompetitif sekecil apa pun akan mendominasi dan menyingkirkan spesies lain hingga punah secara lokal.",
            "Relung Terealisasi (Realized Niche) hampir selalu lebih sempit atau sama dengan Relung Fundamental (Fundamental Niche) karena hambatan interaksi biotik (kompetisi, predasi).",
            "Teori Biogeografi Kepulauan: Pulau besar dan dekat daratan memiliki keanekaragaman spesies tertinggi; pulau kecil dan terpencil memiliki keanekaragaman terendah."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Persamaan Kompetisi Lotka-Volterra",
                latexFormula = "\\frac{d N_1}{d t} = r_1 N_1 \\left(\\frac{K_1 - N_1 - \\alpha_{12} N_2}{K_1}\\right)",
                description = "Pertumbuhan logistik spesies 1 dengan pengaruh kompetisi dari populasi spesies 2 (alpha_12 adalah koefisien kompetisi).",
                variableMeanings = mapOf(
                    "N_1, N_2" to "Populasi spesies 1 dan spesies 2",
                    "K_1" to "Daya dukung lingkungan (carrying capacity) spesies 1",
                    "\\alpha_{12}" to "Pengaruh kompetitif individu spesies 2 terhadap spesies 1"
                )
            ),
            FormulaCard(
                title = "Model Keseimbangan Biogeografi Pulau (MacArthur-Wilson)",
                latexFormula = "S^* = \\frac{I_0 \\cdot A}{k \\cdot D}",
                description = "Jumlah spesies seimbang S* berbanding lurus dengan luas pulau A dan berbanding terbalik dengan jarak pulau D dari daratan sumber.",
                variableMeanings = mapOf(
                    "S^*" to "Jumlah spesies pada kesetimbangan dinamis",
                    "I_0" to "Laju imigrasi maksimum",
                    "A" to "Luas pulau (area)",
                    "D" to "Jarak pulau dari daratan utama (distance)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Rekolonisasi Ekologis & Suksesi Biodiversitas di Kepulauan Krakatau Pasca-Letusan 1883",
            industry = "Ekologi Lanskap & Biologi Konservasi Kepulauan",
            context = "Letusan dahsyat Gunung Krakatau pada Agustus 1883 memusnahkan 100% kehidupan di Pulau Rakata, menjadikannya laboratorium alam raksasa untuk menguji Teori Biogeografi Kepulauan.",
            problem = "Bagaimana laju kolonisasi flora dan fauna di pulau yang steril total tersebut berkembang selama 140 tahun berikutnya, dan faktor apa yang membatasi kapasitas tampung keanekaragaman hayatinya?",
            solution = "Data sensus berkala selama lebih dari satu abad mendokumentasikan model MacArthur-Wilson secara nyata: (1) Gelombang pertama (1883–1900) didominasi oleh organisme perintis dengan daya dispersi angin tinggi (spora lumut, paku-pakuan, dan laba-laba penjelajah udara); (2) Gelombang kedua (1900–1930) menghadirkan burung pemakan biji dan reptil terapung (biawak dan ular sanca); (3) Pada dekade 1980-an, jumlah spesies burung menetap di angka sekitar 35–40 spesies, di mana laju kedatangan spesies baru diimbangi persis oleh laju kepunahan spesies lokal akibat saturasi relung dan kompetisi kanopi hutan lebat.",
            lessonsLearned = "Teori Biogeografi Kepulauan terbukti akurat memprediksi dinamika suksesi dan menjadi fondasi utama dalam perancangan ukuran kawasan taman nasional dan koridor suaka margasatwa."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Kompetisi Eksklusi & Pembagian Relung Menggunakan Alat Makan",
            objective = "Memperagakan secara langsung fenomena eksklusi kompetitif dan bagaimana pembagian relung (niche partitioning) menyelamatkan spesies dari kepunahan.",
            materialsNeeded = listOf(
                "1 nampan plastik besar",
                "Campuran 50 butir kelereng/kacang tanah besar dan 200 butir beras/biji wijen kecil",
                "Alat pengumpul Spesies A: Sendok makan besar",
                "Alat pengumpul Spesies B: Pinset / penjepit baju kayu",
                "Wadah cangkir untuk menampung mangsa",
                "Stopwatch (durasi 30 detik per putaran)"
            ),
            steps = listOf(
                "Babak 1: Kompetisi Terbuka (Relung Tumpang Tindih Penuh). Sebarkan kelereng dan beras di nampan. Dua orang (satu memegang sendok, satu memegang pinset) berlomba mengumpulkan makanan sebanyak-banyaknya dalam 30 detik. Hitung hasil: Pemegang sendok mengumpulkan biomassa jauh lebih banyak dan menyingkirkan pemegang pinset (Eksklusi kompetitif!).",
                "Babak 2: Pembagian Relung (Niche Partitioning). Atur aturan morfologi: Pemegang sendok HANYA boleh mengambil kelereng besar, sedangkan pemegang pinset HANYA boleh mengambil butiran beras kecil.",
                "Ulangi kompetisi selama 30 detik: Amati bahwa kedua spesies sekarang berhasil mengumpulkan makanan melimpah tanpa saling berebut dan dapat hidup berdampingan secara stabil!",
                "Simpulkan: Spesiasi dan pembagian relung morfologis memungkinkan koeksistensi spesies di ekosistem alam."
            ),
            safetyNotes = listOf(
                "Lakukan dengan tertib agar biji-bijian tidak berserakan di lantai.",
                "Gunakan wadah bersih agar biji dapat digunakan kembali."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-relung-1",
                prompt = "Berdasarkan Teori Biogeografi Kepulauan MacArthur-Wilson, pulau dengan karakteristik manakah yang akan memiliki jumlah keanekaragaman spesies kesetimbangan (S*) PALING TINGGI?",
                type = "multiple_choice",
                options = listOf(
                    "Pulau yang BERUKURAN BESAR dan BERJARAK DEKAT dengan daratan utama",
                    "Pulau yang berukuran kecil dan berjarak sangat jauh terpencil",
                    "Pulau yang berukuran kecil tapi berjarak dekat",
                    "Pulau yang berukuran besar tapi berjarak ribuan kilometer terpencil"
                ),
                correctAnswer = "Pulau yang BERUKURAN BESAR dan BERJARAK DEKAT dengan daratan utama",
                hints = listOf(
                    "Pulau dekat daratan memiliki laju imigrasi tinggi.",
                    "Pulau berukuran besar memiliki relung banyak dan laju kepunahan rendah."
                ),
                explanation = "Berdasarkan model MacArthur-Wilson, pulau yang dekat daratan utama memiliki laju imigrasi spesies baru yang tinggi (karena mudah dicapai), sedangkan pulau yang berukuran besar menyediakan habitat luas serta populasi besar sehingga laju kepunahannya sangat rendah. Kombinasi imigrasi tinggi dan kepunahan rendah menghasilkan titik potong kesetimbangan keanekaragaman spesies tertinggi (S* maksimal).",
                misconception = "Mengira pulau terpencil memiliki spesies terbanyak (pulau terpencil memiliki endemisme tinggi, tetapi total kekayaan spesiesnya jauh lebih rendah)."
            ),
            QuizQuestion(
                id = "q-relung-2",
                prompt = "Apa perbedaan mendasar antara Relung Fundamental (Fundamental Niche) dan Relung Terealisasi (Realized Niche) suatu spesies organisme?",
                type = "multiple_choice",
                options = listOf(
                    "Relung fundamental adalah seluruh rentang kondisi abiotik teoritis di mana organisme dapat bertahan hidup tanpa kompetisi, sedangkan relung terealisasi adalah bagian relung aktual yang benar-benar ditempati akibat adanya kompetitor dan predator",
                    "Relung fundamental adalah tempat hewan tidur sedangkan relung terealisasi adalah tempat mencari makan",
                    "Relung fundamental hanya berlaku di laut sedangkan relung terealisasi hanya berlaku di darat",
                    "Relung terealisasi selalu jauh lebih luas daripada relung fundamental"
                ),
                correctAnswer = "Relung fundamental adalah seluruh rentang kondisi abiotik teoritis di mana organisme dapat bertahan hidup tanpa kompetisi, sedangkan relung terealisasi adalah bagian relung aktual yang benar-benar ditempati akibat adanya kompetitor dan predator",
                hints = listOf(
                    "Perhatikan eksperimen teritip Chthamalus dan Balanus di zona pasang surut karya Connell.",
                    "Kompetisi membatasi ruang hidup aktual organisme."
                ),
                explanation = "Relung fundamental adalah potensi fisiologis penuh suatu spesies dalam mentoleransi faktor lingkungan abiotik tanpa keberadaan kompetitor. Relung terealisasi adalah spektrum peran dan ruang hidup yang benar-benar ditempati oleh spesies tersebut di alam nyata setelah dibatasi oleh interaksi biotik seperti kompetisi interspesifik dan predasi.",
                misconception = "Mengira relung terealisasi bisa lebih luas daripada relung fundamental (relung terealisasi selalu merupakan subset dari relung fundamental)."
            )
        )
    )

    private fun getDesainEksperimenAnovaLesson(): LessonData = LessonData(
        conceptId = "bio-desain-eksperimen-anova",
        storyPanels = listOf(
            StoryPanel(
                id = "p-anova-1",
                panelNumber = 1,
                title = "Bahaya Mengulang Uji-t Berkali-kali",
                caption = "Dimas menguji pengaruh 5 jenis konsentrasi pupuk berbeda terhadap pertumbuhan tanaman tomat dan berencana membandingkan kelima perlakuan dengan melakukan uji-t Student berulang sebanyak 10 kali.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Saya punya 5 kelompok perlakuan pupuk. Kalau saya bandingkan satu per satu dengan uji-t sebanyak 10 pasang perbandingan, bukankah hasilnya sudah valid?"
            ),
            StoryPanel(
                id = "p-anova-2",
                panelNumber = 2,
                title = "Inflasi Galat Tipe I & Solusi Ronald Fisher",
                caption = "Kakek mengingatkan bahaya akumulasi galat positif palsu (Tipe I error inflation).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sangat berbahaya, Dimas! Jika kamu melakukan 10 kali uji-t independen pada taraf alpha 5%, probabilitas melakukan kesalahan positif palsu melonjak menjadi 1 - (0.95)¹⁰ ≈ 40%! Sir Ronald Fisher menciptakan Analisis Varians (ANOVA) untuk menguji seluruh perlakuan sekaligus dalam satu uji F global yang elegan!"
            ),
            StoryPanel(
                id = "p-anova-3",
                panelNumber = 3,
                title = "Rancangan Percobaan & Uji Lanjut Tukey",
                caption = "Kirana menjelaskan dekomposisi varians total menjadi varians antar-perlakuan dan varians galat acak dalam Rancangan Acak Lengkap (RAL).",
                dialogueSpeaker = "Kirana",
                dialogueText = "ANOVA membandingkan variasi antar perlakuan terhadap variasi galat acak di dalam kelompok F = KT_P / KT_G. Jika F signifikan, kita lanjutkan dengan uji beda nyata jujur Tukey HSD untuk mengetahui pasangan pupuk mana yang secara statistik benar-benar unggul!"
            )
        ),
        intuition = "Dalam riset biologi eksperimental, variabilitas biologis acak antar-individu organisme tidak dapat dihindari. Rancangan Acak Lengkap (RAL / Completely Randomized Design) mengalokasikan perlakuan secara acak ke unit percobaan homogen untuk mencegah bias sistematik. Analisis Varians (ANOVA) memecah keragaman total (Total Sum of Squares) menjadi dua komponen: keragaman akibat perlakuan eksperimen (Treatment SS) dan keragaman akibat galat acak tak terkontrol (Error SS). Rasio varians ini menghasilkan statistik F = KT_Perlakuan / KT_Galat. Jika F_hitung > F_tabel, kita menolak hipotesis nol (H0) dan menyimpulkan bahwa minimal ada satu perlakuan yang memberikan respon berbeda nyata.",
        intuitionPoints = listOf(
            "Tiga prinsip dasar desain eksperimen: Pengacakan (Randomization), Pengulangan (Replication), dan Kontrol Lokal (Local Control).",
            "Model linier aditif RAL: y_ij = mu + tau_i + epsilon_ij, di mana mu adalah rata-rata umum, tau_i efek perlakuan ke-i, dan epsilon_ij galat acak terdistribusi normal.",
            "Derajat bebas: db_Total = N - 1, db_Perlakuan = k - 1, db_Galat = N - k (di mana k adalah jumlah perlakuan dan N adalah total unit percobaan).",
            "Uji Lanjut (Post-Hoc Test seperti Tukey HSD atau Duncan) HANYA boleh dilakukan jika uji F ANOVA awal terbukti signifikan secara statistik (p < 0.05)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Statistik Uji F Analisis Varians (ANOVA)",
                latexFormula = "F = \\frac{KT_{\\text{Perlakuan}}}{KT_{\\text{Galat}}} = \\frac{\\frac{JKP}{k - 1}}{\\frac{JKG}{N - k}}",
                description = "Rasio kuadrat tengah perlakuan terhadap kuadrat tengah galat untuk menguji hipotesis kesamaan rata-rata antar-kelompok perlakuan.",
                variableMeanings = mapOf(
                    "F" to "Nilai statistik uji rasio F Fisher",
                    "JKP" to "Jumlah Kuadrat Perlakuan (Treatment Sum of Squares)",
                    "JKG" to "Jumlah Kuadrat Galat (Error Sum of Squares)",
                    "k" to "Jumlah kelompok perlakuan",
                    "N" to "Jumlah total seluruh sampel pengamatan"
                )
            ),
            FormulaCard(
                title = "Uji Beda Nyata Jujur Tukey HSD",
                latexFormula = "\\text{HSD} = q_{\\alpha}(k, \\nu) \\cdot \\sqrt{\\frac{KT_{\\text{Galat}}}{n}}",
                description = "Nilai ambang batas perbedaan minimum rata-rata dua kelompok agar dinyatakan berbeda signifikan secara statistik.",
                variableMeanings = mapOf(
                    "\\text{HSD}" to "Honestly Significant Difference ambang batas",
                    "q_\\alpha" to "Nilai kritis rentang terstandarisasi studentized range",
                    "n" to "Jumlah ulangan per kelompok perlakuan"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Uji Efikasi Konsorsium Mikoriza & Bakteri Endofit pada Kelapa Sawit di PPKS Medan",
            industry = "Riset Agroteknologi & Perkebunan Kelapa Sawit Nasional",
            context = "Pusat Penelitian Kelapa Sawit (PPKS) Medan menguji efikasi inokulasi jamur mikoriza arbuskular dan bakteri endofit pemfiksasi nitrogen terhadap pertambahan bobot biomassa bibit sawit di pembibitan utama (main nursery).",
            problem = "Peneliti menguji 4 formulasi pupuk hayati (P0=Kontrol, P1=Mikoriza saja, P2=Bakteri saja, P3=Konsorsium Mikoriza+Bakteri) dengan 6 ulangan tanaman (total 24 polibag). Bagaimana membuktikan bahwa kombinasi P3 benar-benar sinergis dan bukan sekadar kebetulan variasi acak tanaman?",
            solution = "Peneliti menyusun data ke dalam ANOVA Rancangan Acak Lengkap 1-arah: Dari perhitungan, JKP = 148.5 (db=3, KT_P = 49.5) dan JKG = 40.0 (db=20, KT_G = 2.0). Nilai rasio F dihitung: F_hitung = 49.5 / 2.0 = 24.75. Nilai F_tabel(3, 20) pada alpha 0.01 adalah 4.94. Karena F_hitung (24.75) >> F_tabel (4.94), hipotesis nol ditolak dengan p < 0.001. Uji lanjut Tukey HSD menunjukkan selisih rata-rata P3 terhadap P0 dan P1 melampaui nilai kritis HSD = 2.34 kg, membuktikan secara ilmiah tak terbantahkan bahwa konsorsium sinergis mikoriza dan bakteri endofit secara signifikan meningkatkan serapan hara fosfor dan pertumbuhan sawit hingga 48%.",
            lessonsLearned = "Desain eksperimen yang ketat dan analisis ANOVA kuantitatif menjamin bahwa inovasi agroteknologi yang dirilis ke petani memiliki kepastian ilmiah empiris berkekuatan hukum statistik."
        ),
        homeLab = HomeLabData(
            title = "Desain Eksperimen Mini RAL: Uji Konsentrasi Air Cucian Beras pada Kecambah Kacang Hijau",
            objective = "Mempraktikkan prinsip pengacakan, pengulangan, kontrol, dan pencatatan data eksperimen biologi berbasis Rancangan Acak Lengkap (RAL).",
            materialsNeeded = listOf(
                "24 butir biji kacang hijau seragam",
                "12 wadah gelas plastik kecil (sebagai unit percobaan)",
                "Kapas gulung putih sebagai media tumbuh",
                "Air cucian beras segar (larutan stok 100%)",
                "Air keran bersih (0% kontrol)",
                "Penggaris milimeter dan spidol label"
            ),
            steps = listOf(
                "Tentukan 4 perlakuan: P0 (0% air biasa), P1 (25% air beras), P2 (50% air beras), P3 (100% air beras murni). Masing-masing memiliki 3 ulangan (total 12 gelas).",
                "Terapkan Prinsip Pengacakan (Randomization): Kocok kertas nomor 1–12 untuk menentukan posisi peletakan gelas di nampan agar tidak ada bias pencahayaan.",
                "Letakkan kapas tebal yang dibasahi larutan masing-masing perlakuan di dasar gelas.",
                "Tanam 2 butir biji kacang hijau di tiap gelas.",
                "Pelihara selama 5 hari dengan menambahkan 1 sendok teh larutan yang sama setiap pagi.",
                "Pada hari ke-5, ukur panjang hipokotil kecambah dalam milimeter.",
                "Hitung nilai rata-rata perlakuan dan amati penyebaran variansnya: bandingkan apakah perbedaan antar-kelompok perlakuan lebih besar dibanding perbedaan antar-gelas dalam kelompok yang sama!"
            ),
            safetyNotes = listOf(
                "Praktikum higienis dan menggunakan bahan dapur non-toksik.",
                "Jaga kelembaban kapas agar tidak membusuk atau ditumbuhi jamur liar."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-anova-1",
                prompt = "Mengapa kita TIDAK diperbolehkan melakukan uji-t Student berulang kali secara berpasangan ketika membandingkan lebih dari dua kelompok perlakuan (misalnya membandingkan 5 kelompok), melainkan harus menggunakan uji ANOVA terlebih dahulu?",
                type = "multiple_choice",
                options = listOf(
                    "Karena pengujian uji-t berulang melipatgandakan peluang terjadinya Galat Tipe I (positif palsu) secara kumulatif hingga mencapai tingkat kesalahan yang tidak dapat diterima",
                    "Karena uji-t hanya dapat digunakan untuk data yang dihitung dalam satuan gram",
                    "Karena uji-t selalu menghasilkan nilai yang negatif",
                    "Karena uji ANOVA tidak memerlukan pengulangan sampel sama sekali"
                ),
                correctAnswer = "Karena pengujian uji-t berulang melipatgandakan peluang terjadinya Galat Tipe I (positif palsu) secara kumulatif hingga mencapai tingkat kesalahan yang tidak dapat diterima",
                hints = listOf(
                    "Galat Tipe I adalah menolak H0 padahal H0 benar (positif palsu).",
                    "alpha_kumulatif = 1 - (1 - alpha)^C di mana C adalah jumlah kombinasi pasangan."
                ),
                explanation = "Setiap kali melakukan uji-t pada alpha = 0.05, ada risiko 5% melakukan galat positif palsu (Galat Tipe I). Jika membandingkan 5 kelompok (ada 10 pasang perbandingan), risiko kumulatif melakukan minimal satu positif palsu melonjak menjadi 1 - (0.95)¹⁰ ≈ 40.1%! ANOVA mengatasi masalah ini dengan melakukan satu uji F omnibus simultan pada seluruh kelompok sekaligus, menjaga laju galat tetap terkendali pada 5%.",
                misconception = "Mengira uji-t berulang kali justru membuat kesimpulan semakin teliti dan kuat."
            ),
            QuizQuestion(
                id = "q-anova-2",
                prompt = "Dalam sebuah percobaan Rancangan Acak Lengkap (RAL) dengan 4 perlakuan dan 5 ulangan per perlakuan (total N = 20 unit pengamatan), berapakah derajat bebas galat (db Galat) untuk analisis tabel ANOVA-nya?",
                type = "numeric",
                correctAnswer = "16",
                tolerance = 0.1f,
                unit = "",
                hints = listOf(
                    "Jumlah perlakuan k = 4.",
                    "Total unit percobaan N = 4 · 5 = 20.",
                    "Rumus db Galat = N - k = 20 - 4 = ...?"
                ),
                explanation = "Derajat bebas untuk Rancangan Acak Lengkap dihitung dari: db Total = N - 1 = 20 - 1 = 19; db Perlakuan = k - 1 = 4 - 1 = 3; db Galat = N - k = 20 - 4 = 16. Nilai 16 ini menjadi penyebut dalam penentuan nilai kritis F pada tabel distribusi F Fisher.",
                misconception = "Mengira db galat adalah jumlah ulangan dikurangi satu (5 - 1 = 4)."
            )
        )
    )
}

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

object BiologyLevel5Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "bio-mol-regulasi-transkripsi-mirna",
            domain = Domain.BIOLOGI,
            topic = "Biologi Molekuler dan Seluler",
            title = "Regulasi Transkripsi Eukariotik & RNA Interferensi (miRNA/siRNA)",
            description = "Kompleks pre-inisiasi transkripsi, faktor transkripsi enhancer/silencer, remodeling kromatin SWI/SNF, dan peredaman pascatranskripsi oleh microRNA (miRNA) via kompleks RISC.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("bio-genetika-klasik-epigenetika", "bio-sintesis-protein")
        ),
        ConceptItem(
            id = "bio-mol-transduksi-sinyal-gpcr",
            domain = Domain.BIOLOGI,
            topic = "Biologi Molekuler dan Seluler",
            title = "Transduksi Sinyal GPCR, Jalur RTK-MAPK & Pos Pemeriksaan Siklus Sel p53",
            description = "Transduksi sinyal reseptor terkopel protein G (GPCR, cAMP/PKA, PLC/IP3/DAG), jalur tirosin kinase RTK-Ras-MAPK, dan pos pemeriksaan siklus seluler p53/Rb.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("bio-biologi-sel-molekuler-dasar")
        ),
        ConceptItem(
            id = "bio-mol-teknik-rekayasa-crispr",
            domain = Domain.BIOLOGI,
            topic = "Biologi Molekuler dan Seluler",
            title = "Rekayasa Genom Terarah CRISPR-Cas9 & Analisis Kuantitatif RT-qPCR",
            description = "Sistem pengeditan genom terarah CRISPR-Cas9 (sgRNA, PAM, NHEJ/HDR), kuantifikasi ekspresi gen Real-Time RT-qPCR metode 2^(-ddCt), dan Western Blotting.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("bio-bioteknologi-pcr-dna")
        ),
        ConceptItem(
            id = "bio-gen-populasi-kuantitatif",
            domain = Domain.BIOLOGI,
            topic = "Genetika dan Genomik",
            title = "Genetika Populasi, Kesetimbangan Hardy-Weinberg & Pemetaan QTL",
            description = "Dinamika frekuensi alel populasi, laju mutasi dan seleksi alam, analisis sifat poligenik kuantitatif kontinu, heritabilitas (h²), dan pemetaan Quantitative Trait Loci (QTL).",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("bio-genetika-mendel", "mat-probabilitas-inferensi-regresi")
        ),
        ConceptItem(
            id = "bio-genomik-bioinformatika-blast",
            domain = Domain.BIOLOGI,
            topic = "Genetika dan Genomik",
            title = "Genomik Komparatif, Transkriptomik RNA-Seq & Algoritma BLAST",
            description = "Arsitektur genom eukariotik, profil ekspresi global RNA-Seq, algoritma penyejajaran sekuens DNA/protein Smith-Waterman dan BLAST (BLASTN/BLASTP).",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("bio-mol-teknik-rekayasa-crispr")
        ),
        ConceptItem(
            id = "bio-mikro-anaerob-quorum-sensing",
            domain = Domain.BIOLOGI,
            topic = "Mikrobiologi dan Imunologi",
            title = "Fisiologi Mikroba Ekstrem, Biofilm & Komunikasi Quorum Sensing",
            description = "Metabolisme respirasi anaerob akseptor nitrat/sulfat, sistem transduksi sinyal dua-komponen, komunikasi antar-sel bakteri Quorum Sensing, dan arsitektur biofilm.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("bio-mikrobiologi-kurva-pertumbuhan")
        ),
        ConceptItem(
            id = "bio-imun-mhc-rekombinasi-vdj",
            domain = Domain.BIOLOGI,
            topic = "Mikrobiologi dan Imunologi",
            title = "Imunologi Lanjut: Rekombinasi V(D)J, Kompleks MHC & Platform Vaksin mRNA",
            description = "Presentasi antigen oleh molekul MHC Kelas I dan II, rekombinasi somatik V(D)J pembentuk jutaan ragam antibodi/TCR, seleksi timus, dan platform vaksin mRNA.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("bio-organ-hewan-manusia")
        ),
        ConceptItem(
            id = "bio-neuro-hodgkin-huxley-ltp",
            domain = Domain.BIOLOGI,
            topic = "Fisiologi dan Neurobiologi",
            title = "Neurobiologi Kuantitatif: Persamaan Hodgkin-Huxley & Plastisitas LTP",
            description = "Biofisika membran akson persamaan Hodgkin-Huxley konduktansi Na/K voltase, plastisitas sinaptik Long-Term Potentiation (LTP) reseptor NMDA/AMPA pembentuk memori otak.",
            level = DepthLevel.L5,
            estMinutes = 24,
            prerequisites = listOf("bio-organ-hewan-manusia", "mat-ode-orde-1-2")
        ),
        ConceptItem(
            id = "bio-endo-aksis-hipotalamus-hormon",
            domain = Domain.BIOLOGI,
            topic = "Fisiologi dan Neurobiologi",
            title = "Endokrinologi Terpadu: Sumbu Hipotalamus-Hipofisis & Reseptor Nuklear",
            description = "Poros neuroendokrin hipotalamus-hipofisis (HPA, HPG, HPT), regulasi umpan balik negatif ganda, mekanisme intraseluler hormon peptida vs reseptor transkripsi steroid.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("bio-organ-hewan-manusia")
        ),
        ConceptItem(
            id = "bio-dev-embriogenesis-gen-hox",
            domain = Domain.BIOLOGI,
            topic = "Biologi Perkembangan",
            title = "Biologi Perkembangan: Morfogenesis Embrio & Klaster Gen Arsitek Hox",
            description = "Gastrulasi tiga lapis germinal embrio, gradien morfogen penentu sumbu polaritas tubuh, klaster gen arsitek homeoboks (Hox genes), dan diferensiasi sel punca pluripoten.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("bio-biologi-sel-molekuler-dasar")
        ),
        ConceptItem(
            id = "bio-eko-dinamika-lotka-volterra",
            domain = Domain.BIOLOGI,
            topic = "Ekologi dan Evolusi",
            title = "Ekologi Dinamis: Model Predator-Mangsa Lotka-Volterra & Efek Top-Down",
            description = "Dinamika populasi persamaan diferensial Lotka-Volterra, isoline ekuilibrium, kaskade trofik, peran pengendali predator kunci (keystone predator), dan biomagnifikasi.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("bio-ekologi-umum-relung", "mat-ode-orde-1-2")
        ),
        ConceptItem(
            id = "bio-konservasi-fragmentasi-pva",
            domain = Domain.BIOLOGI,
            topic = "Ekologi dan Evolusi",
            title = "Biologi Konservasi: Fragmentasi Habitat, Efek Tepi & Analisis Kelangsungan Populasi (PVA)",
            description = "Ukuran populasi efektif (Ne), dinamika depresi inbreeding, fragmentasi habitat koridor satwa liar, efek tepi hutan, dan Population Viability Analysis (PVA) status IUCN.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("bio-ekologi-umum-relung", "bio-gen-populasi-kuantitatif")
        ),
        ConceptItem(
            id = "bio-botani-fisiologi-stomata-aba",
            domain = Domain.BIOLOGI,
            topic = "Botani dan Fisiologi Tanaman",
            title = "Fisiologi Tumbuhan Lanjut: Dinamika Membran Stomata & Kaskade ABA",
            description = "Fisiologi potensial air, regulasi pompa proton H+-ATPase membran sel penjaga stomata, jalur pensinyalan hormon asam absisat (ABA) menghadapi kekeringan, dan metabolit sekunder.",
            level = DepthLevel.L5,
            estMinutes = 22,
            prerequisites = listOf("bio-jaringan-tumbuhan", "bio-fisiologi-komparatif-dasar")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "bio-mol-regulasi-transkripsi-mirna" -> getMolRegulasiTranskripsiMirnaLesson()
            "bio-mol-transduksi-sinyal-gpcr" -> getMolTransduksiSinyalGpcrLesson()
            "bio-mol-teknik-rekayasa-crispr" -> getMolTeknikRekayasaCrisprLesson()
            "bio-gen-populasi-kuantitatif" -> getGenPopulasiKuantitatifLesson()
            "bio-genomik-bioinformatika-blast" -> getGenomikBioinformatikaBlastLesson()
            "bio-mikro-anaerob-quorum-sensing" -> getMikroAnaerobQuorumSensingLesson()
            "bio-imun-mhc-rekombinasi-vdj" -> getImunMhcRekombinasiVdjLesson()
            "bio-neuro-hodgkin-huxley-ltp" -> getNeuroHodgkinHuxleyLtpLesson()
            "bio-endo-aksis-hipotalamus-hormon" -> getEndoAksisHipotalamusHormonLesson()
            "bio-dev-embriogenesis-gen-hox" -> getDevEmbriogenesisGenHoxLesson()
            "bio-eko-dinamika-lotka-volterra" -> getEkoDinamikaLotkaVolterraLesson()
            "bio-konservasi-fragmentasi-pva" -> getKonservasiFragmentasiPvaLesson()
            "bio-botani-fisiologi-stomata-aba" -> getBotaniFisiologiStomataAbaLesson()
            else -> null
        }
    }

    private fun getMolRegulasiTranskripsiMirnaLesson(): LessonData = LessonData(
        conceptId = "bio-mol-regulasi-transkripsi-mirna",
        storyPanels = listOf(
            StoryPanel(
                id = "p-mirna-reg-1",
                panelNumber = 1,
                title = "Di Luar Dogma Sentral Klasik",
                caption = "Dimas mempelajari bahwa 98% genom manusia tidak mengkode protein (dulu dijuluki 'junk DNA'). Namun mutasi pada wilayah non-coding ini memicu penyakit kanker dan autoimun berat.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika 98% DNA kita tidak membuat protein, untuk apa miliaran huruf genetik itu disimpan di dalam inti sel kita?"
            ),
            StoryPanel(
                id = "p-mirna-reg-2",
                panelNumber = 2,
                title = "Pengendali Bayangan: microRNA & siRNA",
                caption = "Kakek menjelaskan dunia RNA non-coding fungsional: microRNA (miRNA) dan siRNA.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Wilayah itu menghasilkan RNA pengatur, Dimas! Molekul microRNA pendek (21–23 nukleotida) dimuat ke dalam kompleks protein RISC, mencari mRNA target yang komplementer di sitoplasma, lalu memotongnya atau memblokir ribosom agar protein tidak disintesis!"
            ),
            StoryPanel(
                id = "p-mirna-reg-3",
                panelNumber = 3,
                title = "Kompleks Pre-Inisiasi & Enhancer Jarak Jauh",
                caption = "Kirana menggambar pelipatan DNA kromatin yang mempertemukan sekuens Enhancer sejauh 100.000 pasang basa dengan Promotor gen.",
                dialogueSpeaker = "Kirana",
                dialogueText = "DNA melengkung membentuk loop raksasa dengan bantuan kompleks Mediator! Faktor transkripsi yang mengikat Enhancer di kejauhan langsung bersentuhan fisik dengan RNA Polimerase II di promotor, menyalakan transkripsi secara presisi!"
            )
        ),
        intuition = "Regulasi ekspresi gen eukariotik bersifat multitahap dan sangat canggih. Pada tingkat transkripsi, gen dikendalikan oleh interaksi antara sekuens DNA regulatoris cis (Promotor inti, Enhancer, Silencer) dengan protein faktor transkripsi trans-acting. DNA melipat membentuk lengkungan (looping) yang dimediasi oleh protein kohesin dan kompleks Mediator multi-subunit, memungkinkan enhancer yang berjarak ratusan kilobasa mengaktifkan RNA Polimerase II di promotor inti. Pada tingkat pascatranskripsi, ekspresi gen disetel halus oleh mekanisme RNA Interferensi (RNAi): molekul RNA kecil beruntai tunggal (miRNA dan siRNA) memandu kompleks efektor RISC (RNA-Induced Silencing Complex) yang berpusat pada protein endonuklease Argonaute untuk mendegradasi mRNA target atau membungkam translasi ribosom.",
        intuitionPoints = listOf(
            "Promotor Inti Eukariotik: memuat kotak TATA (TATA box) yang dikenali oleh TBP (TATA-Binding Protein) dari faktor transkripsi umum TFIID untuk menambatkan RNA Polimerase II.",
            "Enhancer & Silencer: sekuens DNA yang dapat berada ribuan pasang basa di hulu, hilir, atau di dalam intron, berfungsi secara independen terhadap orientasi arah sekuens.",
            "Biogenesis miRNA: transkripsi pri-miRNA di nukleus -> diproses oleh kompleks Drosha-DGCR8 menjadi pre-miRNA berstruktur jepit rambut (hairpin) -> diekspor ke sitoplasma via Eksportin-5 -> dipotong oleh enzim Dicer menjadi dupleks miRNA 21–23 nt.",
            "Kompleks RISC: untai pemandu (guide strand) miRNA dimuat ke protein inti Argonaute (Ago). Jika komplementaritas sempurna (khas pada siRNA), mRNA target dipotong; jika komplementaritas parsial (khas pada miRNA hewan pada 3' UTR), terjadi represi translasi dan deadenilasi mRNA.",
            "lncRNA (long non-coding RNA): RNA non-coding berukuran > 200 nukleotida, seperti Xist yang memicu inaktivasi satu kromosom X secara epigenetik pada mamalia betina."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Mekanisme Pemotongan mRNA oleh Kompleks RISC (RNAi)",
                latexFormula = "\\text{miRNA/siRNA} + \\text{Argonaute} \\xrightarrow{} \\text{RISC} \\xrightarrow{+\\text{mRNA Target}} \\begin{cases} \\text{Pemotongan mRNA} & (\\text{Komplementer Sempurna}) \\\\ \\text{Represi Translasi} & (\\text{Komplementer Parsial 3' UTR}) \\end{cases}",
                description = "Jalur peredaman ekspresi gen pascatranskripsi yang sangat spesifik.",
                variableMeanings = mapOf(
                    "RISC" to "RNA-Induced Silencing Complex",
                    "Argonaute" to "Protein katalitik endonuklease inti pemotong mRNA",
                    "3' UTR" to "Wilayah tak tertranslasi di ujung 3' molekul mRNA"
                )
            ),
            FormulaCard(
                title = "Efisiensi Transkripsi Loop Enhancer-Promotor",
                latexFormula = "\\text{Laju Transkripsi} \\propto [\\text{TF}_{\\text{aktivator}}] \\cdot P_{\\text{looping}}(d) \\quad ; \\quad P_{\\text{looping}} \\propto d^{-3/2}",
                description = "Probabilitas pertemuan fisik enhancer dan promotor akibat fleksibilitas polimer kromatin berjarak genomik d.",
                variableMeanings = mapOf(
                    "d" to "Jarak fisik linear antara enhancer dan promotor pada rantai DNA",
                    "TF" to "Konsentrasi faktor transkripsi aktivator aktif"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Aplikasi Terapi RNA Interferensi (siRNA Patisiran) Amiloidosis di RSCM Jakarta",
            industry = "Terapi Gen Molekuler & Kedokteran Presisi RNA",
            context = "Pasien amiloidosis herediter transthyretin (hATTR) di RSUPN Dr. Cipto Mangunkusumo mengalami penumpukan protein transthyretin (TTR) abnormal yang merusak saraf tepi dan jantung secara fatal.",
            problem = "Obat molekul kecil konvensional tidak mampu menghambat produksi protein TTR mutan yang diproduksi secara terus menerus oleh sel hepatosit hati.",
            solution = "Tim dokter spesialis menerapkan terapi revolusioner Patisiran (Onpattro)—obat berbasis RNA interferensi (siRNA) pertama di dunia yang disetujui FDA. Patisiran diformulasikan dalam lipid nanopartikel (LNP) yang secara spesifik menargetkan reseptor hepatosit hati. Di dalam sitoplasma sel hati, molekul siRNA beruntai ganda dilepaskan dan untai pemandunya dimuat ke kompleks RISC. Kompleks RISC mengikat secara komplementer 100% pada sekuens mRNA TTR dan memotongnya hingga hancur. Hasilnya, sintesis protein TTR beracun anjlok drastis hingga 85% dalam waktu 14 hari, menghentikan progresi kerusakan saraf pasien secara dramatis.",
            lessonsLearned = "Memahami mekanisme RNA interferensi mengubah konsep pengobatan kedokteran modern dari sekadar menghambat protein menjadi membungkam produksi pesan mRNA di hulunya."
        ),
        homeLab = HomeLabData(
            title = "Model Analog Peredaman Translasi miRNA Menggunakan Resleting Pakaian",
            objective = "Memvisualisasikan bagaimana penempelan fragmen kecil komplementer dapat memblokir jalannya mesin pembaca translasi (ribosom).",
            materialsNeeded = listOf(
                "1 buah jaket atau celana ber-resleting panjang (mewakili molekul mRNA)",
                "Kepala resleting penarik (mewakili Ribosom yang bergerak mentranslasi)",
                "Potongan kecil selotip kertas tebal atau klip penjepit kertas (mewakili kompleks miRNA-RISC)"
            ),
            steps = listOf(
                "Translasi Normal: Gerakkan kepala resleting dari ujung bawah ke ujung atas dengan lancar (merepresentasikan ribosom yang membaca mRNA menghasilkan protein lengkap).",
                "Peredaman Pascatranskripsi (RNAi): Pasang selotip kertas atau jepitkan klip kertas di salah satu gigi resleting di tengah lintasan (merepresentasikan miRNA yang menempel komplementer pada sekuens sasaran).",
                "Coba tarik kepala resleting ke atas: Kepala resleting macet total dan terhenti saat menabrak selotip, tidak bisa mencapai ujung!",
                "Simpulkan: Penempelan fragmen pendek miRNA bertindak sebagai penghalang fisik yang menggugurkan ribosom sebelum sintesis protein selesai, mekanisme persis bagaimana sel tubuh kita menyetel kadar ribuan protein penting!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan menggunakan pakaian sehari-hari."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mirna-reg-1",
                prompt = "Protein inti manakah di dalam kompleks RISC (RNA-Induced Silencing Complex) yang bertindak sebagai enzim endonuklease pemotong untai mRNA sasaran pada mekanisme RNA interferensi (RNAi)?",
                type = "multiple_choice",
                options = listOf(
                    "Argonaute (khususnya Ago2)",
                    "Dicer",
                    "Drosha",
                    "RNA Polimerase II"
                ),
                correctAnswer = "Argonaute (khususnya Ago2)",
                hints = listOf(
                    "Dicer dan Drosha bertugas memotong prekursor RNA menjadi dupleks pendek di awal biogenesis.",
                    "Argonaute adalah protein efektor katalitik pemotong mRNA di dalam kompleks RISC."
                ),
                explanation = "Protein dari keluarga Argonaute (khususnya Argonaute-2 / Ago2 pada mamalia) adalah komponen protein inti katalitik dari kompleks RISC. Domain PIWI dari protein Argonaute memiliki struktur lipatan yang mirip dengan enzim RNase H, yang memotong ikatan fosfodiester pada molekul mRNA target tepat di seberang nukleotida ke-10 dan ke-11 dari untai pemandu siRNA.",
                misconception = "Tertukar dengan Dicer (Dicer bertugas memotong pre-miRNA menjadi fragmen pendek sebelum dimuat ke RISC, bukan pemotong mRNA akhir di RISC)."
            ),
            QuizQuestion(
                id = "q-mirna-reg-2",
                prompt = "Bagaimanakah sekuens DNA Enhancer yang berjarak lebih dari 50.000 pasang basa dari gen target dapat meningkatkan laju transkripsi promotor gen tersebut secara fisik?",
                type = "multiple_choice",
                options = listOf(
                    "Untai DNA melipat membentuk lengkungan loop besar dengan bantuan kompleks protein Mediator dan kohesin, sehingga protein faktor transkripsi aktivator pada enhancer bersentuhan langsung dengan kompleks RNA Polimerase II di promotor",
                    "Enhancer terlepas dari kromosom dan berenang di sitoplasma sebagai molekul bebas",
                    "Enhancer mengubah seluruh urutan basa DNA menjadi urutan asam amino",
                    "Enhancer menghancurkan seluruh histon di dalam inti sel"
                ),
                correctAnswer = "Untai DNA melipat membentuk lengkungan loop besar dengan bantuan kompleks protein Mediator dan kohesin, sehingga protein faktor transkripsi aktivator pada enhancer bersentuhan langsung dengan kompleks RNA Polimerase II di promotor",
                hints = listOf(
                    "DNA eukariotik sangat lentur dan dikemas dalam arsitektur 3 dimensi kromatin.",
                    "Kompleks Mediator menjembatani aktivator jarak jauh dengan enzim transkripsi."
                ),
                explanation = "Meskipun enhancer berjarak linear sangat jauh pada peta untai DNA, serat kromatin bersifat fleksibel dan dapat melipat membentuk lengkungan 3 dimensi (DNA looping) yang distabilkan oleh kompleks protein kohesin dan faktor arsitektural CTCF. Pelipatan ini mempertemukan faktor transkripsi aktivator yang terikat pada enhancer dengan kompleks ko-aktivator Mediator raksasa, yang kemudian berinteraksi langsung merangsang perakitan kompleks pre-inisiasi RNA Polimerase II di promotor inti.",
                misconception = "Mengira sinyal aktivasi merambat seperti arus listrik di sepanjang untai DNA tanpa kontak fisik antar-protein."
            )
        )
    )

    private fun getMolTransduksiSinyalGpcrLesson(): LessonData = LessonData(
        conceptId = "bio-mol-transduksi-sinyal-gpcr",
        storyPanels = listOf(
            StoryPanel(
                id = "p-sinyal-gpcr-1",
                panelNumber = 1,
                title = "Satu Molekul Hormon, Satu Juta Respon",
                caption = "Dimas terkejut saat mengetahui bahwa pelepasan hanya beberapa pikogram hormon adrenalin ke dalam darah saat ketakutan dapat memicu pelepasan miliaran molekul glukosa dari hati hanya dalam 5 detik.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana satu molekul hormon kecil di luar sel bisa memicu respon seluler yang begitu raksasa dan cepat di dalam sitoplasma?"
            ),
            StoryPanel(
                id = "p-sinyal-gpcr-2",
                panelNumber = 2,
                title = "Kaskade Penguat Amplifikasi GPCR",
                caption = "Kakek menjelaskan reseptor 7-transmembran GPCR dan pembawa pesan kedua (second messenger).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Reseptor GPCR adalah gerbang penguat sinyal, Dimas! Pengikatan hormon mengaktifkan Protein G (G_alpha-GTP), yang menyalakan Adenilat Siklase untuk memproduksi ribuan molekul cAMP. cAMP mengaktifkan Protein Kinase A, memicu kaskade fosforilasi berantai yang mengamplifikasi sinyal hingga sejuta kali lipat!"
            ),
            StoryPanel(
                id = "p-sinyal-gpcr-3",
                panelNumber = 3,
                title = "Penjaga Genom p53 & Pos Pemeriksaan Siklus Sel",
                caption = "Kirana memaparkan pos pemeriksaan siklus seluler G1/S dan protein penekan tumor TP53.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Jalur RTK-Ras-MAPK memicu pembelahan sel, namun protein p53—'Penjaga Genom'—mengawasi keutuhan DNA! Jika ada kerusakan mutasi, p53 menginduksi p21 untuk menghambat kompleks Siklin-CDK, menghentikan siklus sel di G1 agar DNA diperbaiki, atau memicu apoptosis jika kerusakan tak tertolong!"
            )
        ),
        intuition = "Komunikasi seluler memungkinkan sel merespons rangsangan lingkungan melalui jalur transduksi sinyal beramplifikasi tinggi. Keluarga terbesar adalah G-Protein Coupled Receptors (GPCR, protein 7-transmembran) yang mentransduksikan sinyal melalui protein G heterotrimerik (alfa, beta, gamma). Pertukaran GDP menjadi GTP pada subunit alfa mengaktifkan efektor seperti Adenilat Siklase (menghasilkan second messenger cAMP yang mengaktifkan PKA) atau Fosfolipase C (PLC, memotong PIP2 menjadi IP3 pemicu pelepasan Ca²⁺ intraseluler dan DAG pengaktif PKC). Jalur Reseptor Tirosin Kinase (RTK) memediasi sinyal faktor pertumbuhan via autofosforilasi silang, mengaktifkan protein saklar kecil Ras-GTP yang memicu kaskade kinase MAPK (Raf-MEK-ERK) pendorong pembelahan sel. Siklus sel dikontrol secara ketat oleh kompleks Siklin-CDK dan pos pemeriksaan (checkpoints) yang dipimpin oleh protein penekan tumor TP53 dan Retinoblastoma (Rb).",
        intuitionPoints = listOf(
            "Jalur GPCR-cAMP: Ligan -> GPCR -> G_alpha_s-GTP -> Adenilat Siklase -> cAMP -> Aktivasi Protein Kinase A (PKA) -> Fosforilasi enzim metabolik dan faktor transkripsi CREB.",
            "Jalur GPCR-IP3/DAG: G_alpha_q-GTP -> Fosfolipase C-beta (PLC) -> Hidrolisis PIP2 -> Inositol 1,4,5-trifosfat (IP3) membuka kanal Ca²⁺ pada Retikulum Endoplasma + Diasilgliserol (DAG) mengaktifkan Protein Kinase C (PKC).",
            "Jalur RTK-Ras-MAPK: Faktor pertumbuhan -> Dimerisasi RTK -> Autofosforilasi tirosin -> Rekrutmen adaptor Grb2-Sos -> Pertukaran GDP-GTP pada Ras -> Aktivasi kaskade kinase Raf (MAPKKK) -> MEK (MAPKK) -> ERK (MAPK) -> Proliferasi sel.",
            "Pos Pemeriksaan G1/S: Kompleks Cyclin D-CDK4/6 memfosforilasi protein Rb, melepaskan faktor transkripsi E2F untuk memulai sintesis DNA fase S.",
            "Protein Penekan Tumor p53: diaktivasi oleh kinase ATM/ATR saat kerusakan DNA; p53 mentranskripsi inhibitor CDK p21 (CIP1/WAF1) yang membekukan siklus sel di G1. Mutasi inaktivasi TP53 ditemukan pada lebih dari 50% seluruh kasus kanker manusia."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Kaskade Amplifikasi Sinyal Enzimatik",
                latexFormula = "1 \\text{ Hormon} \\to 10^2 \\text{ G}_\\alpha\\text{-GTP} \\to 10^4 \\text{ cAMP} \\to 10^5 \\text{ PKA Aktif} \\to 10^6 \\text{ Glukosa Bebas}",
                description = "Faktor perbesaran amplifikasi sinyal biologis bertingkat pada hepatosit hati.",
                variableMeanings = mapOf(
                    "G_\\alpha" to "Subunit alfa protein G heterotrimerik pengikat GTP",
                    "cAMP" to "Siklik Adenosin Monofosfat (second messenger)",
                    "PKA" to "Protein Kinase A pengkatalisis transfer gugus fosfat"
                )
            ),
            FormulaCard(
                title = "Regulasi Pos Pemeriksaan G1/S Siklus Seluler",
                latexFormula = "\\text{DNA Rusak} \\xrightarrow{} \\text{Aktivasi p53} \\xrightarrow{} \\uparrow [\\text{p21}] \\xrightarrow{} \\text{Inhibisi Cyclin E/CDK2} \\xrightarrow{} \\text{Rb Tetap Mengikat E2F} \\xrightarrow{} \\text{Henti G}_1",
                description = "Mekanisme molekuler pencegahan replikasi DNA yang rusak sebelum memasuki fase S.",
                variableMeanings = mapOf(
                    "p53" to "Faktor transkripsi penekan tumor (Guardian of the Genome)",
                    "p21" to "Protein inhibitor kinase bergantung siklin (CKI)",
                    "Rb" to "Protein retinoblastoma penahan progresi siklus sel"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Terapi Presisi Kanker Paru Mutasi Reseptor Tirosin Kinase EGFR di RS Kanker Dharmais",
            industry = "Onkologi Presisi Molekuler & Terapi Target Biofarmasi",
            context = "Pasien Kanker Paru Bukan Sel Kecil (NSCLC) stadium lanjut di RS Kanker Dharmais Jakarta menunjukkan resistensi terhadap kemoterapi sitotoksik konvensional.",
            problem = "Biopsi jaringan mengungkap adanya mutasi delesi ekson 19 pada reseptor Epidermal Growth Factor Receptor (EGFR), yang menyebabkan domain tirosin kinase intraseluler aktif secara konstitutif terus menerus tanpa memerlukan ligan, memicu pembelahan sel liar tak terkendali via jalur Ras-Raf-MEK-ERK.",
            solution = "Tim onkologi molekuler memberikan terapi molekul kecil Penghambat Tirosin Kinase (EGFR-TKI generasi ketiga: Osimertinib). Molekul obat ini menyisip secara spesifik ke dalam kantong pengikat ATP domain kinase EGFR yang termutasi dan membentuk ikatan kovalen ireversibel dengan residu Cys797. Sinyal autofosforilasi intraseluler terputus total seketika, menghentikan kaskade MAPK dan PI3K-Akt. Sel kanker paru kehilangan sinyal kelangsungan hidup dan mengaktifkan kaspase apoptosis terprogram. Tumor primer mengecil hingga 70% dalam 8 minggu tanpa efek samping kerontokan rambut kemoterapi biasa.",
            lessonsLearned = "Memahami jalur transduksi sinyal molekuler seluler memungkinkan perancangan terapi obat terarah presisi tinggi yang secara cerdas mematikan sel kanker pada akarnya."
        ),
        homeLab = HomeLabData(
            title = "Model Analog Kaskade Amplifikasi Sinyal Menggunakan Domino Piramida Bertingkat",
            objective = "Memvisualisasikan prinsip amplifikasi bertingkat di mana satu pemicu tunggal menghasilkan respon masif eksponensial.",
            materialsNeeded = listOf(
                "15–20 kartu domino atau balok kayu mainan seukuran sama",
                "Meja datar beralas karpet/kain tipis"
            ),
            steps = listOf(
                "Susun domino membentuk piramida bercabang: Tingkat 1 (1 domino mewakili 1 molekul hormon ligan ekstraseluler).",
                "Tingkat 2 (2 domino berdampingan di belakangnya, mewakili Adenilat Siklase).",
                "Tingkat 3 (4 domino di belakangnya, mewakili cAMP).",
                "Tingkat 4 (8 domino di baris paling belakang, mewakili enzim glikogen fosforilase yang membebaskan glukosa).",
                "Sentuh dengan jari pelan-pelan domino Tingkat 1 hingga roboh: amati bagaimana dorongan infinitesimal 1 domino memicu keruntuhan berantai seketika dari seluruh 15 domino di belakangnya!",
                "Simpulkan: Ini adalah demonstrasi mekanik dari amplifikasi sinyal biokimiawi di mana satu molekul hormon kecil dapat memobilisasi jutaan molekul enzim di dalam sel hanya dalam hitungan detik!"
            ),
            safetyNotes = listOf(
                "Aktivitas penalaran visual yang aman dan menyenangkan."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-sinyal-gpcr-1",
                prompt = "Ketika hormon adrenalin berikatan dengan reseptor beta-adrenergik (sebuah GPCR terkopel protein G_alpha_s), apakah peristiwa biokimiawi pertama yang terjadi pada subunit protein G_alpha?",
                type = "multiple_choice",
                options = listOf(
                    "Pelepasan molekul GDP yang terikat dan digantikan oleh pengikatan molekul GTP, menyebabkan subunit G_alpha aktif dan terdisosiasi dari dimer beta-gamma",
                    "Fosforilasi langsung seluruh molekul DNA di dalam inti sel",
                    "Subunit G_alpha langsung dimakan oleh lisosom",
                    "Molekul ATP dihidrolisis menjadi AMP"
                ),
                correctAnswer = "Pelepasan molekul GDP yang terikat dan digantikan oleh pengikatan molekul GTP, menyebabkan subunit G_alpha aktif dan terdisosiasi dari dimer beta-gamma",
                hints = listOf(
                    "Protein G adalah saklar molekuler pengikat nukleotida guanin (Guanine nucleotide-binding protein).",
                    "Keadaan tidak aktif terikat GDP; keadaan aktif terikat GTP.",
                    "Reseptor GPCR bertindak sebagai GEF (Guanine nucleotide Exchange Factor)."
                ),
                explanation = "Reseptor GPCR yang terikat ligan mengalami perubahan konformasi dan bertindak sebagai Guanine Nucleotide Exchange Factor (GEF) bagi protein G heterotrimerik. Reseptor memicu subunit G_alpha untuk melepaskan molekul GDP yang terikat dan mengikat molekul GTP yang melimpah di sitoplasma. Pengikatan GTP mengaktifkan G_alpha dan menyebabkannya terdisosiasi dari kompleks dimer beta-gamma untuk kemudian berdifusi di membran dan mengaktifkan enzim efektor Adenilat Siklase.",
                misconception = "Mengira GDP difosforilasi langsung menjadi GTP di dalam protein G (kenyataannya GDP dilepas dan molekul GTP baru dari sitoplasma yang masuk mengikat)."
            ),
            QuizQuestion(
                id = "q-sinyal-gpcr-2",
                prompt = "Mengapa mutasi inaktivasi pada gen penekan tumor TP53 (yang mengkode protein p53) ditemukan pada lebih dari 50% dari seluruh jenis kanker ganas pada manusia?",
                type = "multiple_choice",
                options = listOf(
                    "Karena hilangnya fungsi p53 melumpuhkan pos pemeriksaan siklus sel (G1/S checkpoint) dan respon apoptosis, sehingga sel dengan mutasi DNA berbahaya tetap dibiarkan membelah terus menerus",
                    "Karena p53 adalah protein yang memproduksi racun sel",
                    "Karena mutasi p53 mengubah semua sel tubuh menjadi sel sperma",
                    "Karena p53 menghentikan aliran darah ke seluruh tubuh"
                ),
                correctAnswer = "Karena hilangnya fungsi p53 melumpuhkan pos pemeriksaan siklus sel (G1/S checkpoint) dan respon apoptosis, sehingga sel dengan mutasi DNA berbahaya tetap dibiarkan membelah terus menerus",
                hints = listOf(
                    "p53 dikenal sebagai 'Guardian of the Genome' (Penjaga Genom).",
                    "Tugas utama p53 adalah menghentikan siklus sel (melalui p21) saat DNA rusak atau memicu apoptosis jika kerusakan tak tertolong."
                ),
                explanation = "Protein p53 adalah faktor transkripsi penekan tumor paling vital yang memantau integritas genom sel. Jika terjadi kerusakan DNA atau stres onkogenik, p53 menginduksi ekspresi inhibitor CDK p21 untuk menghentikan siklus sel di pos pemeriksaan G1/S agar DNA dapat diperbaiki, atau menginduksi protein pro-apoptotik (PUMA, Bax) untuk membunuh sel jika mutasi terlalu parah. Kehilangan fungsi p53 akibat mutasi melumpuhkan sistem pengawasan ini, memungkinkan sel abnormal yang membawa mutasi genomik berbahaya terus membelah tanpa kendali, mengakumulasi mutasi tambahan, dan berkembang menjadi tumor ganas kanker.",
                misconception = "Mengira p53 adalah onkogen yang memicu kanker (p53 adalah gen penekan tumor penangkal kanker; kankernya muncul ketika p53 dirusak atau bermutasi)."
            )
        )
    )

    private fun getMolTeknikRekayasaCrisprLesson(): LessonData = LessonData(
        conceptId = "bio-mol-teknik-rekayasa-crispr",
        storyPanels = listOf(
            StoryPanel(
                id = "p-crispr-pcr-1",
                panelNumber = 1,
                title = "Gunting Genom dengan Presisi Satu Nukleotida",
                caption = "Dimas membaca teknik rekayasa genetika lama yang memasukkan gen baru secara acak ke kromosom dan sering merusak gen penting lain di sekitarnya.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Apakah kita bisa memotong dan mengedit satu huruf genetik spesifik di antara 3 miliar pasang basa genom manusia tanpa melukai huruf lainnya?"
            ),
            StoryPanel(
                id = "p-crispr-pcr-2",
                panelNumber = 2,
                title = "Revolusi CRISPR-Cas9 Emmanuelle & Jennifer",
                caption = "Kakek menjelaskan sistem kekebalan adaptif bakteri CRISPR-Cas9 yang diadaptasi menjadi teknologi pengeditan genom presisi.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sistem CRISPR-Cas9 hanya butuh panduan RNA pendek (single guide RNA / sgRNA) 20 huruf yang komplementer dengan target, Dimas! Enzim nuklease Cas9 dipandu tepat ke koordinat target, mengenali motif PAM, dan memotong untai ganda DNA secara bedah mikro!"
            ),
            StoryPanel(
                id = "p-crispr-pcr-3",
                panelNumber = 3,
                title = "Kuantifikasi Ekspresi RT-qPCR Metode 2^(-ddCt)",
                caption = "Kirana memaparkan metode kuantifikasi ekspresi gen Real-Time Quantitative PCR (RT-qPCR).",
                dialogueSpeaker = "Kirana",
                dialogueText = "Untuk membuktikan apakah gen yang diedit benar-benar aktif, kita mengukur amplifikasi fluoresensinya secara real-time! Melalui nilai ambang siklus C_T dan rumus 2^(-ddCt) Livak, kita menghitung perubahan lipat ekspresi gen secara kuantitatif absolut!"
            )
        ),
        intuition = "Teknologi pengeditan genom CRISPR-Cas9 (Clustered Regularly Interspaced Short Palindromic Repeats) merevolusi bioteknologi modern dengan memungkinkan pemotongan terarah DNA pada lokasi spesifik genom sembarang organisme hidup. Sistem ini terdiri dari dua komponen kunci: enzim endonuklease Cas9 dan molekul penuntun single-guide RNA (sgRNA). Sekuens 20 nukleotida pada ujung 5' sgRNA berpasangan komplementer dengan urutan target genom tepat di hulu motif Protospacer Adjacent Motif (PAM, sekuens 5'-NGG-3' untuk SpCas9). Pemotongan menghasilkan kerusakan untai ganda (Double-Strand Break / DSB) yang memicu perbaikan seluler: Non-Homologous End Joining (NHEJ, rawan galat insersi/delesi indel untuk mematikan gen / gene knockout) atau Homology-Directed Repair (HDR, perbaikan presisi tinggi menggunakan donor DNA cetakan untuk menyisipkan sekuens baru / gene knock-in). Kuantifikasi ekspresi gen diverifikasi secara presisi menggunakan Real-Time Quantitative Reverse Transcription PCR (RT-qPCR) metode perbandingan ambang siklus Livak 2^(-ddCt).",
        intuitionPoints = listOf(
            "Komponen CRISPR-Cas9: Enzim Cas9 (memiliki domain nuklease RuvC dan HNH pemotong masing-masing untai DNA) + sgRNA (memuat sekuens pengarah 20 nt + perancah scaffold).",
            "Syarat Pengikatan PAM: Cas9 TIDAK AKAN memotong jika tidak ada motif PAM (5'-NGG-3' pada untai non-target) tepat bersebelahan dengan sekuens target, mencegah Cas9 memotong DNA bakteri pemiliknya sendiri.",
            "NHEJ vs HDR: NHEJ aktif sepanjang siklus sel dan menyambung ujung DNA secara kasar menghasilkan frameshift indel; HDR hanya aktif pada fase S/G2 saat kromatid saudari atau donor cetakan homolog tersedia.",
            "RT-qPCR Ambang Siklus (Threshold Cycle / C_T): jumlah siklus PCR saat sinyal fluoresensi detektor pertama kali melampaui garis ambang latar belakang. Nilai C_T berbanding terbalik secara logaritmik dengan jumlah cetakan awal (semakin kecil C_T, semakin melimpah cetakan gen awal).",
            "Metode Komparatif 2^(-ddCt) Livak: Delta C_T = C_T(gen target) - C_T(gen acuan housekeeping misal GAPDH); Delta-Delta C_T = Delta C_T(perlakuan) - Delta C_T(kontrol); Lipat Perubahan Ekspresi (Fold Change) = 2^(-ddCt)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Kalkulasi Perubahan Lipat Ekspresi Gen RT-qPCR (Metode Livak)",
                latexFormula = "\\text{Fold Change} = 2^{-\\Delta\\Delta C_T} \\quad ; \\quad \\Delta\\Delta C_T = (C_{T,\\text{target}} - C_{T,\\text{ref}})_{\\text{uji}} - (C_{T,\\text{target}} - C_{T,\\text{ref}})_{\\text{kontrol}}",
                description = "Metode normalisasi kuantitatif ekspresi gen terhadap gen pembanding housekeeping yang stabil.",
                variableMeanings = mapOf(
                    "C_T" to "Threshold Cycle (siklus saat fluoresensi melampaui garis ambang)",
                    "\\text{ref}" to "Gen referensi internal kontrol (housekeeping gene seperti GAPDH atau ACTB)",
                    "2^{-\\Delta\\Delta C_T}" to "Rasio perubahan ekspresi relatif terhadap kelompok kontrol (asumsi efisiensi PCR 100%)"
                )
            ),
            FormulaCard(
                title = "Targeting Rekayasa Genomik CRISPR-Cas9",
                latexFormula = "\\text{Situs Potong} = 3 \\text{ pasang basa di hulu dari motif PAM (5'-NGG-3')}",
                description = "Posisi presisi pemotongan untai ganda DNA oleh domain nuklease Cas9.",
                variableMeanings = mapOf(
                    "PAM" to "Protospacer Adjacent Motif (urutan 5'-NGG-3' yang wajib ada)",
                    "DSB" to "Double-Strand Break (pemutusan kedua untai heliks DNA)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengembangan Kedelai Mutan Bebas Alergen Menggunakan CRISPR-Cas9 di BB Biogen Bogor",
            industry = "Bioteknologi Pertanian Presisi & Pemuliaan Tanaman Mutakhir",
            context = "Balai Besar Penelitian Bioteknologi dan Sumber Daya Genetik Pertanian (BB Biogen) di Cimanggu, Bogor, merekayasa varietas kedelai lokal (*Glycine max*) untuk mengeliminasi protein alergen pemicu syok anafilaksis pada anak-anak.",
            problem = "Gen *Gly m Bd 30K* (P34) mengkode protein imunogenik utama penyebab alergi kedelai. Mematikan gen ini melalui pemuliaan mutasi radiasi konvensional merusak ribuan gen lain secara acak dan menurunkan hasil panen.",
            solution = "Peneliti merancang sgRNA 20 nukleotida yang secara spesifik menargetkan ekson 1 dari gen *Gly m Bd 30K* tepat di depan sekuens PAM 5'-TGG-3'. Konstruk Cas9/sgRNA ditransformasikan ke kalus sel kedelai via *Agrobacterium tumefaciens*. Perbaikan DNA seluler melalui jalur NHEJ menghasilkan delesi 4 pasang basa frameshift mutlak yang memunculkan kodon stop prematur, melumpuhkan sintesis protein alergen secara total (gene knockout). Analisis kuantitatif RT-qPCR metode 2^(-ddCt) membuktikan ekspresi mRNA alergen anjlok hingga 0.001 kali lipat (berkurang 99.9%), menghasilkan varietas bibit kedelai hipoalergenik pertama di Indonesia dengan produktivitas biji yang tetap unggul.",
            lessonsLearned = "Teknologi pengeditan genom CRISPR-Cas9 memungkinkan modifikasi genetik bedah mikro tingkat nukleotida tunggal tanpa menyisipkan materi genetik asing dari spesies lain (non-transgenik / cisgenik)."
        ),
        homeLab = HomeLabData(
            title = "Model Analog Spesifisitas Pasangan Basa CRISPR sgRNA Menggunakan Kertas Kode Basa",
            objective = "Memahami bagaimana urutan panduan sgRNA sepanjang 20 huruf mengenali satu target unik di antara ribuan huruf genomik.",
            materialsNeeded = listOf(
                "1 lembar kertas koran bekas bertulisan teks panjang padat (mewakili 3 miliar huruf genom DNA)",
                "Kertas label tempel warna merah terang berukuran kecil (mewakili sgRNA)",
                "Spidol dan gunting kecil (mewakili enzim Cas9)"
            ),
            steps = listOf(
                "Pilih satu kata spesifik yang jarang muncul di koran (misal kata: 'BIOTEKNOLOGI', mewakili 20 huruf target protospacer).",
                "Tuliskan kata 'BIOTEKNOLOGI' pada kertas label merah sgRNA.",
                "Tantangan Pengenalan: Telusuri seluruh kolom koran baris demi baris menggunakan kertas label penuntun sgRNA.",
                "Ketika Anda menemukan kata 'BIOTEKNOLOGI' yang cocok 100% huruf demi huruf dan diikuti oleh tanda baca titik (mewakili motif PAM NGG), tempelkan label di titik tersebut.",
                "Ambil gunting (Cas9) dan potong tepat 3 huruf di depan tanda baca titik tersebut!",
                "Amati: Dari puluhan ribu kata di lembar koran, Anda hanya memotong tepat di satu koordinat spesifik tanpa merusak teks lainnya!",
                "Simpulkan: Ini adalah representasi mekanis dari bagaimana enzim CRISPR-Cas9 menavigasi lautan genom sel hidup untuk memotong gen sasaran dengan akurasi 100%!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan menggunakan alat tulis kantor."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-crispr-pcr-1",
                prompt = "Pada pengujian ekspresi gen menggunakan Real-Time RT-qPCR, kelompok perlakuan memiliki nilai Delta C_T = 2.0 (selisih terhadap gen housekeeping), sedangkan kelompok kontrol memiliki nilai Delta C_T = 5.0. Berdasarkan metode komparatif 2^(-ddCt) Livak, berapa kali lipatkah (Fold Change) peningkatan ekspresi gen target pada kelompok perlakuan dibanding kontrol?",
                type = "numeric",
                correctAnswer = "8",
                tolerance = 0.1f,
                unit = "kali lipat",
                hints = listOf(
                    "Hitung Delta-Delta C_T = Delta C_T(perlakuan) - Delta C_T(kontrol).",
                    "Delta-Delta C_T = 2.0 - 5.0 = -3.0.",
                    "Fold Change = 2^(-ddCt) = 2^(-(-3.0)) = 2^(+3) = ...?"
                ),
                explanation = "Berdasarkan metode Livak: Delta-Delta C_T = Delta C_T(perlakuan) - Delta C_T(kontrol) = 2.0 - 5.0 = -3.0. Maka perubahan lipat ekspresi gen (Fold Change) dihitung dari: 2^(-ddCt) = 2^(-(-3.0)) = 2³ = 8 kali lipat. Kelompok perlakuan mengekspresikan mRNA target 8 kali lebih melimpah dibandingkan kelompok kontrol.",
                misconception = "Lupa tanda minus ganda pada eksponen rumus 2^(-ddCt) sehingga salah menghitung 2^(-3) = 0.125 kali."
            ),
            QuizQuestion(
                id = "q-crispr-pcr-2",
                prompt = "Apakah fungsi biologis mutlak dari motif PAM (Protospacer Adjacent Motif, sekuens 5'-NGG-3') dalam sistem pengeditan genom Streptococcus pyogenes Cas9 (SpCas9)?",
                type = "multiple_choice",
                options = listOf(
                    "Sebagai tanda pengenal awal yang wajib diikat oleh Cas9 sebelum mencairkan heliks DNA dan menguji komplementaritas sgRNA, serta mencegah Cas9 memotong lokus CRISPR pada genom bakteri itu sendiri",
                    "Sebagai sumber energi ATP untuk memotong ikatan fosfodiester",
                    "Sebagai penutup ujung telomer kromosom agar tidak memendek",
                    "Sebagai zat pewarna fluoresensi pada mikroskop elektron"
                ),
                correctAnswer = "Sebagai tanda pengenal awal yang wajib diikat oleh Cas9 sebelum mencairkan heliks DNA dan menguji komplementaritas sgRNA, serta mencegah Cas9 memotong lokus CRISPR pada genom bakteri itu sendiri",
                hints = listOf(
                    "Tanpa motif PAM, enzim Cas9 tidak akan menempel dan tidak akan membuka untai DNA.",
                    "Lokus CRISPR pada bakteri memuat spacer target yang sama tetapi sengaja TIDAK memiliki motif PAM agar tidak bunuh diri."
                ),
                explanation = "Motif PAM (5'-NGG-3' untuk SpCas9) adalah sekuens pengenal wajib berjarak pendek pada DNA sasaran. Enzim Cas9 pertama kali berdifusi dan berikatan secara spasial dengan motif PAM; pengikatan ini memicu perubahan konformasi Cas9 untuk mencairkan heliks ganda DNA di sekitarnya dan menguji kecocokan pasangan basa dengan pemandu sgRNA. Selain itu, ketiadaan PAM pada susunan ulangan CRISPR genom bakteri mencegah enzim Cas9 memotong DNA bakteri pemiliknya sendiri (mekanisme pembeda self vs non-self).",
                misconception = "Mengira sekuens PAM adalah bagian dari molekul sgRNA (PAM berada pada untai DNA target yang sedang diincar, bukan di dalam sgRNA)."
            )
        )
    )

    private fun getGenPopulasiKuantitatifLesson(): LessonData = LessonData(
        conceptId = "bio-gen-populasi-kuantitatif",
        storyPanels = listOf(
            StoryPanel(
                id = "p-gen-pop-1",
                panelNumber = 1,
                title = "Misteri Dominasi Alel yang Tidak Menguasai Populasi",
                caption = "Dimas bertanya mengapa alel dominan polidaktili (jari tangan berjari enam, dominan P) tidak bertambah banyak dari generasi ke generasi hingga menggantikan alel resesif berjari lima normal (p).",
                dialogueSpeaker = "Dimas",
                dialogueText = "Jika suatu alel bersifat dominan terhadap alel resesif, bukankah alel dominan seharusnya otomatis meningkat jumlahnya dan menyingkirkan alel resesif dalam populasi?"
            ),
            StoryPanel(
                id = "p-gen-pop-2",
                panelNumber = 2,
                title = "Hukum Kesetimbangan Hardy-Weinberg",
                caption = "Kakek menjelaskan prinsip kesetimbangan frekuensi alel G.H. Hardy dan Wilhelm Weinberg (1908).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sifat dominansi tidak ada hubungannya dengan frekuensi populasi, Dimas! Dalam populasi ideal yang kawin acak tanpa seleksi, mutasi, migrasi, dan hanyutan genetik, frekuensi alel p dan q tetap konstan abadi: p² + 2pq + q² = 1!"
            ),
            StoryPanel(
                id = "p-gen-pop-3",
                panelNumber = 3,
                title = "Sifat Kuantitatif Kontinu & Pemetaan QTL",
                caption = "Kirana menggambar kurva distribusi lonceng normal untuk sifat poligenik tinggi badan dan berat gabah padi.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Sifat penting seperti produksi panen dan kecerdasan bukan sifat tunggal Mendel, melainkan Sifat Kuantitatif Kontinu yang dikendalikan oleh ratusan lokus (Quantitative Trait Loci / QTL). Melalui estimasi heritabilitas h² = V_A / V_P, kita bisa memprediksi respon seleksi bibit unggul!"
            )
        ),
        intuition = "Genetika populasi mempelajari dinamika frekuensi alel dan genotipe dalam suatu kumpulan perkawinan (gene pool) sepanjang generasi. Hukum Kesetimbangan Hardy-Weinberg membuktikan bahwa reproduksi seksual semata tidak mengubah frekuensi alel dari generasi ke generasi pada populasi ideal (p + q = 1 dan p² + 2pq + q² = 1). Kekuatan evolusi nyata yang mengubah frekuensi alel adalah: Mutasi, Migrasi (Aliran Gen), Hanyutan Genetik Acak (Genetic Drift pada populasi kecil), Perkawinan Tak Acak, dan Seleksi Alam. Pada Genetika Kuantitatif, sifat-sifat fenotipe kontinu (seperti tinggi badan, hasil panen, bobot ternak) dipengaruhi oleh aksi aditif banyak gen (poligenik) dan faktor lingkungan. Nilai Heritabilitas arti sempit (narrow-sense heritability h² = V_A / V_P) mengukur proporsi variansi fenotipe yang disebabkan oleh variansi genetik aditif yang dapat diwariskan, menjadi fondasi penentu Respon Seleksi pemuliaan tanaman/hewan (Persamaan Peternak: R = h² · S).",
        intuitionPoints = listOf(
            "Asumsi Kesetimbangan Hardy-Weinberg: (1) Populasi berukuran sangat besar tak hingga (tidak ada genetic drift); (2) Perkawinan berlangsung acak (panmiksia); (3) Tidak ada mutasi baru; (4) Tidak ada migrasi (tertutup); (5) Tidak ada seleksi alam (semua genotipe memiliki kebugaran reproduksi yang sama).",
            "Frekuensi Genotipe Hardy-Weinberg: p² (homozigot dominan AA), 2pq (heterozigot Aa), q² (homozigot resesif aa).",
            "Hanyutan Genetik Acak (Genetic Drift): fluktuasi acak frekuensi alel akibat pengambilan sampel gamet terbatas pada populasi berukuran kecil, dapat memicu fiksasi alel atau hilangnya alel tanpa kaitan dengan nilai adaptifnya (contoh: Efek Pendiri / Founder Effect dan Efek Leher Botol / Bottleneck Effect).",
            "Dekomposisi Variansi Fenotipe: V_P = V_G + V_E = (V_A + V_D + V_I) + V_E, di mana V_A adalah variansi genetik aditif, V_D variansi dominansi, dan V_E variansi lingkungan.",
            "Persamaan Pemuliaan Seleksi (Breeder's Equation): R = h² · S, di mana R adalah respon seleksi rata-rata generasi anak dan S adalah diferensial seleksi rata-rata tetua terpilih."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Persamaan Kesetimbangan Hardy-Weinberg",
                latexFormula = "p + q = 1 \\quad \\implies \\quad p^2 + 2pq + q^2 = 1",
                description = "Distribusi frekuensi alel p dan q serta frekuensi genotipe dalam populasi diploid kawin acak.",
                variableMeanings = mapOf(
                    "p, q" to "Frekuensi alel dominan (A) dan alel resesif (a)",
                    "p^2" to "Frekuensi genotipe homozigot dominan (AA)",
                    "2pq" to "Frekuensi genotipe heterozigot (Aa)",
                    "q^2" to "Frekuensi genotipe homozigot resesif (aa)"
                )
            ),
            FormulaCard(
                title = "Persamaan Pemuliaan Respon Seleksi (Breeder's Equation)",
                latexFormula = "R = h^2 \\cdot S \\quad ; \\quad h^2 = \\frac{V_A}{V_P}",
                description = "Memprediksi pertambahan nilai sifat fenotipe unggul pada generasi keturunan hasil seleksi buatan.",
                variableMeanings = mapOf(
                    "R" to "Respon seleksi (selisih rata-rata populasi keturunan terhadap populasi awal)",
                    "h^2" to "Heritabilitas arti sempit (rasio variansi aditif V_A terhadap variansi fenotipe total V_P)",
                    "S" to "Diferensial seleksi (selisih rata-rata tetua terpilih terhadap populasi awal)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemuliaan Padi Varietas Inpari Beras Kaya Seng (Biofortifikasi Zn) di BBPadi Sukamandi",
            industry = "Pemuliaan Tanaman Pangan & Genetika Kuantitatif Pertanian",
            context = "Balai Besar Penelitian Tanaman Padi (BBPadi) Sukamandi mengembangkan varietas padi Inpari 46 Nutri Zinc untuk mengatasi masalah stunting gizi buruk balita Indonesia.",
            problem = "Kandungan mineral seng (Zn) pada beras pecah kulit merupakan sifat kuantitatif kontinu poligenik yang sangat dipengaruhi oleh kadar hara tanah lingkungan (variansi lingkungan V_E tinggi). Bagaimana memilih galur pemuliaan yang menghasilkan akumulasi Zn stabil secara genetik?",
            solution = "Pemulia tanaman mengukur heritabilitas arti sempit akumulasi Zn pada populasi silang balik dan menemukan nilai h² = 0.58 (heritabilitas tinggi). Menggunakan pemetaan Quantitative Trait Loci (QTL) berbasis penanda marka molekuler SNP, tim mengidentifikasi lokus mayor *qZn-12* pada kromosom 12 yang mengkode transporter logam nicotianamine sintase. Menggunakan Persamaan Pemuliaan R = h² · S dengan diferensial seleksi S = 12 ppm Zn, generasi keturunan terpilih menunjukkan respon seleksi R = 0.58 · 12 = 7.0 ppm Zn lebih tinggi dibanding padi biasa. Padi Inpari Nutri Zinc berhasil dirilis secara nasional dengan kadar seng rata-rata 34.5 ppm stabil.",
            lessonsLearned = "Genetika populasi dan pemodelan kuantitatif heritabilitas memungkinkan rekayasa pangan presisi yang menyelamatkan jutaan anak bangsa dari gizi buruk stunting."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Hanyutan Genetik Acak (Genetic Drift) Menggunakan Kancing Baju Dua Warna",
            objective = "Membuktikan secara empiris bahwa populasi kecil mengalami kehilangan variasi genetik secara acak jauh lebih cepat dibanding populasi besar.",
            materialsNeeded = listOf(
                "100 buah kancing baju (50 merah sebagai alel A, 50 putih sebagai alel a)",
                "2 kantong kain gelap (Kantong Populasi Kecil dan Kantong Populasi Besar)"
            ),
            steps = listOf(
                "Eksperimen 1: Populasi Kecil (N = 10 alel): Masukkan 5 kancing merah dan 5 kancing putih ke kantong (frekuensi awal p = 0.5, q = 0.5).",
                "Kocok kantong, ambil 10 kancing secara acak satu per satu dengan pengembalian (sampling generasi baru). Hitung jumlah kancing merah (misal terambil 7 merah dan 3 putih, frekuensi bergeser menjadi p = 0.7).",
                "Ganti isi kantong sesuai komposisi baru (7 merah, 3 putih), lalu ulangi sampling untuk 5 generasi berikutnya.",
                "Amati hasilnya: Hanya dalam 3–5 generasi, salah satu warna kancing PASTI menjadi 100% (fiksasi alel) dan warna lainnya punah 0% (hanyutan genetik ekstrem)!",
                "Eksperimen 2: Populasi Besar (N = 80 alel): Ulangi prosedur yang sama dengan mengambil 80 kancing dari populasi 40 merah dan 40 putih.",
                "Amati hasilnya: Frekuensi alel merah dan putih tetap stabil berfluktuasi sangat dekat di sekitar 0.50 (hanyutan genetik hampir tidak berpengaruh pada populasi besar)!",
                "Simpulkan: Ukuran populasi kecil adalah penyebab utama lenyapnya keanekaragaman genetik satwa langka yang terancam punah."
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan interaktif."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-gen-pop-1",
                prompt = "Dalam suatu populasi manusia yang berada dalam kesetimbangan Hardy-Weinberg, frekuensi individu penderita albino (homozigot resesif aa) adalah 1 dari 10.000 kelahiran (q² = 0.0001). Berapakah persentase individu dalam populasi tersebut yang merupakan PEMBAWA SIFAT HETEROZIGOT (carrier, Aa)?",
                type = "numeric",
                correctAnswer = "1.98",
                tolerance = 0.05f,
                unit = "%",
                hints = listOf(
                    "q² = 0.0001, maka frekuensi alel resesif q = sqrt(0.0001) = 0.01.",
                    "Frekuensi alel dominan p = 1 - q = 1 - 0.01 = 0.99.",
                    "Frekuensi heterozigot 2pq = 2 · (0.99) · (0.01) = 0.0198.",
                    "Ubah ke persentase: 0.0198 · 100% = ...%?"
                ),
                explanation = "Dari data homozigot resesif q² = 0.0001, frekuensi alel resesif q = sqrt(0.0001) = 0.01 (1%). Frekuensi alel dominan p = 1 - q = 1 - 0.01 = 0.99 (99%). Frekuensi individu pembawa sifat heterozigot (carrier) dihitung dari suku 2pq = 2 · 0.99 · 0.01 = 0.0198 atau setara dengan 1.98% (hampir 2% dari seluruh populasi adalah carrier sehat). Ini membuktikan bahwa sebagian besar alel penyakit resesif tersembunyi aman pada individu heterozigot.",
                misconception = "Mengira frekuensi heterozigot sama dengan q (0.01) tanpa mengalikan dengan 2p."
            ),
            QuizQuestion(
                id = "q-gen-pop-2",
                prompt = "Pada program pemuliaan sapi potong, nilai heritabilitas arti sempit bobot badan sapi adalah h² = 0.40. Rata-rata bobot populasi awal adalah 400 kg. Peternak memilih kelompok sapi tetua unggul dengan rata-rata bobot 450 kg (diferensial seleksi S = 50 kg). Berdasarkan Persamaan Pemuliaan (Breeder's Equation R = h² · S), berapakah taksiran rata-rata bobot badan generasi anak sapi hasil seleksi?",
                type = "numeric",
                correctAnswer = "420",
                tolerance = 1f,
                unit = "kg",
                hints = listOf(
                    "Respon seleksi R = h² · S = 0.40 · 50 kg = 20 kg.",
                    "Rata-rata bobot generasi anak = Rata-rata populasi awal + Respon seleksi (R).",
                    "Rata-rata anak = 400 kg + 20 kg = ... kg?"
                ),
                explanation = "Berdasarkan Persamaan Pemuliaan (Breeder's Equation): Respon seleksi R = h² · S = 0.40 · (450 kg - 400 kg) = 0.40 · 50 kg = 20 kg. Maka rata-rata bobot badan populasi generasi anak sapi hasil seleksi adalah: Rata-rata awal + R = 400 kg + 20 kg = 420 kg.",
                misconception = "Mengira generasi anak langsung memiliki bobot 450 kg sama persis dengan induk tetuanya (hanya 40% dari keunggulan tetua yang diwariskan secara genetik aditif, 60% sisanya adalah variasi lingkungan non-heritabel)."
            )
        )
    )

    private fun getGenomikBioinformatikaBlastLesson(): LessonData = LessonData(
        conceptId = "bio-genomik-bioinformatika-blast",
        storyPanels = listOf(
            StoryPanel(
                id = "p-bioinfo-blast-1",
                panelNumber = 1,
                title = "Jarum di Tumpukan Jerami Triliunan Huruf DNA",
                caption = "Dimas mengisolasi sekuens DNA sepanjang 500 nukleotida dari bakteri tanah misterius. Pangkalan data genom GenBank memuat lebih dari 3 triliun huruf DNA dari jutaan spesies.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana mungkin kita mencocokkan sekuens 500 huruf kita ke dalam pangkalan data raksasa 3 triliun huruf hanya dalam waktu 2 detik di komputer?"
            ),
            StoryPanel(
                id = "p-bioinfo-blast-2",
                panelNumber = 2,
                title = "Algoritma Pencarian Heuristik BLAST",
                caption = "Kakek menjelaskan algoritma Basic Local Alignment Search Tool (BLAST) karya Stephen Altschul (1990).",
                dialogueSpeaker = "Kakek",
                dialogueText = "BLAST tidak membandingkan huruf demi huruf secara lambat, Dimas! Ia memotong sekuens query menjadi 'kata-kata' pendek (k-mers / words), mencari kecocokan benih (seeds) di basis data secara instan, lalu memperluas penyejajaran lokal menggunakan matriks skor substitusi BLOSUM62!"
            ),
            StoryPanel(
                id = "p-bioinfo-blast-3",
                panelNumber = 3,
                title = "Statistika Signifikansi E-Value & Transkriptomik",
                caption = "Kirana memaparkan interpretasi nilai E-value BLAST dan kuantifikasi sekuensing RNA global (RNA-Seq).",
                dialogueSpeaker = "Kirana",
                dialogueText = "E-value (Expect value) menghitung probabilitas kebetulan acak: E-value < 10⁻¹⁰ menjamin kemiripan tersebut adalah homologi evolusioner sejati! Dan teknologi RNA-Seq mengurutkan seluruh transkrip aktif seluler dalam satuan standar TPM!"
            )
        ),
        intuition = "Bioinformatika adalah konvergensi biologi molekuler dengan ilmu komputer dan statistika algoritma untuk menganalisis data omik skala genomik. Algoritma penyejajaran sekuens (sequence alignment) terbagi menjadi penyejajaran global eksak (Needleman-Wunsch), penyejajaran lokal eksak (Smith-Waterman), dan algoritma heuristik ultra-cepat BLAST (Basic Local Alignment Search Tool). BLAST memindai bank data dengan mencocokkan kata benih (word seeds) berbobot skor di atas ambang ambang batas T pada matriks substitusi asam amino BLOSUM62 (untuk protein berkerabat dekat) atau PAM250. Nilai statistik E-Value (Expect Value) mengukur berapa banyak kecocokan acak yang diharapkan terjadi murni secara kebetulan; semakin mendekati nol nilai E-value, semakin pasti hubungan homologi evolusionernya. Dalam transkriptomik global RNA-Seq, jutaan sekuens pendek (reads) dipetakan ke genom acuan dan dinormalisasi menjadi TPM (Transcripts Per Million) untuk membandingkan tingkat ekspresi gen antar-jaringan.",
        intuitionPoints = listOf(
            "Varian Program BLAST: BLASTN (DNA query ke database DNA), BLASTP (Protein query ke database Protein), BLASTX (DNA query diterjemahkan 6-frame ke database Protein), TBLASTN (Protein query ke database DNA terjemahan).",
            "Matriks Substitusi BLOSUM62: matriks log-odds yang menghitung probabilitas penggantian asam amino biologis nyata; mutasi asam amino dengan sifat kimia serupa (misal Leusin ke Isoleusin) diberi skor positif tinggi, mutasi radikal diberi penalti negatif besar.",
            "E-Value (Expectation Value): E = K · m · n · exp(-lambda · S). E-value < 10⁻⁵ umumnya dianggap batas ambang kemiripan biologis yang signifikan secara statistik.",
            "Normalisasi RNA-Seq TPM (Transcripts Per Million): mengoreksi bias panjang gen dan bias kedalaman pembacaan sekuensing (sequencing depth), menjamin total jumlah TPM seluruh gen di setiap sampel selalu konstan 1.000.000.",
            "Synteny Genomik: pelestarian urutan urutan blok gen yang sama pada kromosom spesies berbeda membuktikan kekerabatan garis evolusi bersama."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Statistika Nilai E-Value BLAST (Karlin-Altschul)",
                latexFormula = "E = K \\cdot m \\cdot n \\cdot e^{-\\lambda S}",
                description = "Jumlah kecocokan acak palsu yang diharapkan muncul murni karena kebetulan dalam pencarian pangkalan data.",
                variableMeanings = mapOf(
                    "E" to "Expect value (semakin kecil mendekati 0, semakin signifikan homologi)",
                    "m" to "Panjang sekuens query pencarian",
                    "n" to "Ukuran total seluruh pangkalan data genom",
                    "S" to "Skor penyejajaran mentah (raw alignment score)",
                    "K, \\lambda" to "Parameter skala statistik sistem skoring"
                )
            ),
            FormulaCard(
                title = "Normalisasi Kelimpahan Transkrip RNA-Seq (TPM)",
                latexFormula = "\\text{TPM}_i = \\frac{\\frac{\\text{Reads}_i}{\\text{Panjang Gen}_i (\\text{kb})}}{\\sum_j \\left(\\frac{\\text{Reads}_j}{\\text{Panjang Gen}_j (\\text{kb})}\\right)} \\times 10^6",
                description = "Transcripts Per Million: satuan baku kuantifikasi kelimpahan relatif transkriptomik komparatif.",
                variableMeanings = mapOf(
                    "\\text{Reads}_i" to "Jumlah potongan sekuens yang memetakan ke gen i",
                    "\\text{Panjang Gen}" to "Panjang wilayah ekson gen i dalam kilobasa (kb)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Surveilans Genomik Pelacakan Mutasi Varian Virus Patogen di GISAID Indonesia & BRIN",
            industry = "Bioinformatika Epidemiologi Genomik & Kesehatan Masyarakat Global",
            context = "Pusat Riset Vaksin dan Obat BRIN bersama jejaring laboratorium mikrobiologi nasional mengurutkan ribuan sampel Whole Genome Sequencing (WGS) virus pernapasan di Indonesia.",
            problem = "Muncul lonjakan kasus infeksi baru di rumah sakit rujukan. Bagaimana menentukan dalam waktu 24 jam apakah wabah disebabkan oleh varian mutan lolos-imun baru (seperti rekombinan XBB) atau virus lama?",
            solution = "Pipa komputasi bioinformatika memproses data mentah gigabita hasil sekuenser Illumina: (1) Trimming kualitas adaptif fastp; (2) Pemetaan ke sekuens acuan Wuhan-Hu-1 menggunakan algoritma penyejajaran FM-index BWA-MEM; (3) Panggilan varian mutasi (variant calling) mendeteksi mutasi substitusi spesifik pada gen glikoprotein Spike; (4) Penelusuran pohon filogenetik maksimum likelihood menggunakan program Nextstrain dan pencarian database global BLASTN memverifikasi keberadaan mutasi lolos-antibodi F486S pada domain RBD. Temuan dilaporkan seketika ke Kementerian Kesehatan untuk pemutakhiran formulasi vaksin booster nasional.",
            lessonsLearned = "Bioinformatika genomik komparatif dan algoritma penyejajaran sekuens adalah radar pertahanan biosekuriti paling krusial dalam mendeteksi ancaman pandemi global."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Bioinformatika Online Mandiri Menggunakan Program BLAST NCBI Gratis",
            objective = "Mempraktikkan secara langsung pencarian identitas sekuens DNA tak dikenal ke dalam pangkalan data genomik dunia GenBank.",
            materialsNeeded = listOf(
                "Komputer laptop / smartphone dengan koneksi internet",
                "Browser web mengakses situs resmi NCBI BLAST (blast.ncbi.nlm.nih.gov)"
            ),
            steps = listOf(
                "Buka situs web: blast.ncbi.nlm.nih.gov lalu pilih 'Nucleotide BLAST' (blastn).",
                "Salin dan tempelkan sekuens DNA misterius berikut ke dalam kotak query: 'ATGGCTTCCTCCACTTACCCTGCCACCATGATTGGCGCCAGCATCGTTGAAGGCATCATCGTCGCC'.",
                "Biarkan database default 'Standard databases (nr/nt)' dan klik tombol biru besar 'BLAST'.",
                "Tunggu 5–10 detik: algoritma Karlin-Altschul memindai triliunan pasang basa genomik dunia!",
                "Periksa tabel hasil: Amati kolom Identitas (Per. Ident = 100%) dan nilai E-value (E = 2e-25).",
                "Baca nama organisme teratas: Anda akan menemukan identitas pemilik sekuens tersebut adalah gen klorofil tumbuhan padi *Oryza sativa*!",
                "Simpulkan: Anda baru saja menjalankan algoritma bioinformatika paling terkenal di dunia sains secara langsung!"
            ),
            safetyNotes = listOf(
                "Aktivitas komputasi online yang sepenuhnya aman dan gratis."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-bioinfo-blast-1",
                prompt = "Dalam analisis hasil pencarian penyejajaran sekuens protein menggunakan BLASTP, hasil kecocokan manakah yang menunjukkan hubungan homologi evolusioner PALING SIGNIFIKAN secara meyakinkan?",
                type = "multiple_choice",
                options = listOf(
                    "E-value = 1e-85 (10⁻⁸⁵, mendekati nol)",
                    "E-value = 0.5",
                    "E-value = 10",
                    "E-value = 100"
                ),
                correctAnswer = "E-value = 1e-85 (10⁻⁸⁵, mendekati nol)",
                hints = listOf(
                    "E-value (Expect value) adalah jumlah kecocokan acak palsu yang diharapkan muncul murni karena kebetulan acak.",
                    "Semakin kecil nilai E-value mendekati nol, semakin mustahil kemiripan tersebut terjadi karena kebetulan."
                ),
                explanation = "Nilai E-value (Expect Value) mengukur probabilitas terjadinya penyejajaran acak murni karena kebetulan dalam pangkalan data seukuran tertentu. Nilai E-value sebesar 1e-85 (10⁻⁸⁵) berarti probabilitas kemiripan tersebut terjadi secara kebetulan adalah 1 banding 10⁸⁵ (praktis nol mutlak), menjamin kepastian 100% bahwa kedua protein memiliki hubungan kekerabatan homologi evolusioner yang nyata dari nenek moyang bersama.",
                misconception = "Mengira nilai E-value yang lebih besar menunjukkan skor kecocokan yang lebih baik (skor bit yang besar bagus, tetapi E-value yang kecil mendekati nol yang paling bagus)."
            ),
            QuizQuestion(
                id = "q-bioinfo-blast-2",
                prompt = "Mengapa matriks substitusi BLOSUM62 memberikan skor positif yang tinggi jika asam amino Leusin (Leu) bermutasi menjadi Isoleusin (Ile), tetapi memberikan skor negatif yang sangat besar jika Leusin bermutasi menjadi Triptofan (Trp) atau Arginin (Arg)?",
                type = "multiple_choice",
                options = listOf(
                    "Karena Leusin dan Isoleusin memiliki sifat fisikokimia yang sangat mirip (keduanya asam amino hidrofobik alifatik non-polar berukuran serupa), sehingga mutasi tersebut jarang merusak struktur lipatan 3D protein",
                    "Karena huruf depan Leusin dan Isoleusin sama-sama huruf konsonan",
                    "Karena Isoleusin adalah racun bagi sel tubuh",
                    "Karena asam amino Leusin tidak memiliki kodon genetika"
                ),
                correctAnswer = "Karena Leusin dan Isoleusin memiliki sifat fisikokimia yang sangat mirip (keduanya asam amino hidrofobik alifatik non-polar berukuran serupa), sehingga mutasi tersebut jarang merusak struktur lipatan 3D protein",
                hints = listOf(
                    "Matriks BLOSUM dihitung dari frekuensi substitusi asam amino yang teramati pada blok protein alami fungsional yang lestari.",
                    "Substitusi konservatif (antara asam amino dengan sifat kimia mirip) ditoleransi oleh seleksi alam."
                ),
                explanation = "Matriks substitusi BLOSUM62 (BLOcks SUbstitution Matrix) disusun berdasarkan analisis statistik frekuensi mutasi yang lolos seleksi alam pada keluarga protein homolog. Leusin dan Isoleusin adalah isomer yang sama-sama bersifat hidrofobik non-polar dan memiliki ukuran rantai samping mirip (substitusi konservatif), sehingga penggantian ini tidak mengganggu konformasi pelipatan protein dan sering terjadi di alam (skor positif +2). Sebaliknya, mengganti Leusin dengan Arginin (yang bermuatan positif hidrofilik) adalah mutasi radikal yang dapat merusak inti hidrofobik protein, sehingga diberi penalti skor negatif besar (-2).",
                misconception = "Mengira penentuan skor substitusi didasarkan pada kemiripan ejaan huruf asam amino."
            )
        )
    )

    private fun getMikroAnaerobQuorumSensingLesson(): LessonData = LessonData(
        conceptId = "bio-mikro-anaerob-quorum-sensing",
        storyPanels = listOf(
            StoryPanel(
                id = "p-quorum-sensing-1",
                panelNumber = 1,
                title = "Bakteri yang Berbicara Satu Sama Lain",
                caption = "Dimas mengamati bakteri laut *Vibrio fischeri*: Saat hidup menyendiri secara encer di laut lepas, bakteri ini sama sekali tidak bercahaya. Namun saat berkumpul padat di organ cahaya cumi-cumi, seluruh koloni serentak menyala biru kehijauan!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana bakteri bersel tunggal bisa tahu berapa banyak teman di sekitarnya dan serentak menyalakan cahaya pada waktu yang persis bersamaan?"
            ),
            StoryPanel(
                id = "p-quorum-sensing-2",
                panelNumber = 2,
                title = "Sinyal Kimiawi Quorum Sensing",
                caption = "Kakek menjelaskan fenomena komunikasi antar-sel bakteri Quorum Sensing (QS) yang dipelopori Bonnie Bassler.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Bakteri melepaskan molekul sinyal feromon mikroba (Autoinduser, seperti Acyl-Homoserine Lactone / AHL)! Pada kepadatan sel tinggi, konsentrasi autoinduser melampaui batas ambang kritis, berikatan dengan reseptor transkripsi, dan serentak menyalakan gen bioluminesensi atau gen virulensi penyakit!"
            ),
            StoryPanel(
                id = "p-quorum-sensing-3",
                panelNumber = 3,
                title = "Benteng Biofilm & Pernapasan Tanpa Oksigen",
                caption = "Kirana memaparkan pembentukan matriks biofilm dan respirasi anaerob akseptor nitrat/sulfat.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Quorum sensing memicu bakteri membangun Biofilm—kota mikroba terlindung lendir polisakarida EPS yang 1000 kali lebih kebal antibiotik! Dan di lingkungan tanpa udara dasar rawa, bakteri bernapas menggunakan akseptor elektron nitrat atau sulfat!"
            )
        ),
        intuition = "Bakteri bukanlah organisme soliter yang bertindak mandiri, melainkan populasi sosial terkoordinasi yang berkomunikasi menggunakan bahasa kimiawi bernama Quorum Sensing (QS). Setiap bakteri terus menerus memproduksi dan mensekresikan molekul sinyal berbobot molekul rendah yang disebut Autoinduser (seperti Acyl-Homoserine Lactone / AHL pada bakteri Gram-negatif, oligopeptida pada Gram-positif, dan Autoinducer-2 / AI-2 universal). Ketika kepadatan populasi bakteri mencapai ambang batas kuorum (quorum), konsentrasi autoinduser intraseluler cukup tinggi untuk mengikat protein reseptor regulatoris, mengaktifkan kaskade transkripsi terkoordinasi serentak (seperti sintesis toksin virulensi, motilitas, bioluminesensi, dan pembentukan Biofilm). Biofilm adalah komunitas mikroba terstruktur yang melekat pada permukaan dan terbungkus oleh matriks zat polimer ekstraseluler (EPS) pelindung. Di zona anaerob tanpa oksigen, mikroba melakukan respirasi anaerob dengan memanfaatkan rantai transpor elektron yang berujung pada akseptor alternatif berpotensial redoks tinggi seperti Nitrat (NO3⁻), Sulfat (SO4²⁻), atau Fumarat.",
        intuitionPoints = listOf(
            "Rangkaian Regulasi LuxI/LuxR: LuxI adalah enzim pensintesis autoinduser AHL; LuxR adalah protein reseptor sitoplasma pengikat AHL yang mengaktifkan operon lux pemicu emisi cahaya.",
            "Biofilm: terdiri dari sel mikroba (10–20%) yang terbenam di dalam matriks EPS (80–90% terdiri dari polisakarida, protein, lipid, dan eDNA); sangat kebal terhadap antibiotik dan sistem imun fagositosis.",
            "Quorum Quenching: strategi terapi modern yang melumpuhkan patogen bukan dengan membunuhnya (sehingga tidak memicu resistensi antibiotik), melainkan dengan mendegradasi enzimatis molekul autoinduser (misal enzim laktonase memecah cincin AHL) untuk membungkam virulensi bakteri.",
            "Denitrifikasi (Respirasi Anaerob Nitrat): NO3⁻ -> NO2⁻ -> NO -> N2O -> N2, menghasilkan energi ATP melalui gradien kemiosmosis proton meskipun tanpa gas oksigen O2.",
            "Metanogenesis Archaea: reduksi karbon dioksida oleh gas hidrogen menjadi gas metana (CO2 + 4H2 -> CH4 + 2H2O), proses respirasi anaerob obligat purba penghasil biogas rawa."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Termodinamika Respirasi Anaerobik Denitrifikasi",
                latexFormula = "2 \\text{NO}_3^- + 10 e^- + 12 \\text{H}^+ \\xrightarrow{} \\text{N}_2 + 6 \\text{H}_2\\text{O} \\quad (E^\\circ = +0.75 \\text{ V})",
                description = "Potensial reduksi standar akseptor nitrat yang sangat positif, mendekati oksigen (+0.82 V), menghasilkan rendemen ATP tinggi tanpa O2.",
                variableMeanings = mapOf(
                    "\\text{NO}_3^-" to "Ion nitrat sebagai akseptor elektron terminal alternatif",
                    "E^\\circ" to "Potensial reduksi standar respirasi anaerob"
                )
            ),
            FormulaCard(
                title = "Kinetika Aktivasi Saklar Quorum Sensing",
                latexFormula = "\\text{Laju Transkripsi Gen Virulensi} = V_{\\max} \\frac{[\\text{AI}]^n}{K_A^n + [\\text{AI}]^n}",
                description = "Fungsi Hill sigmoid kooperatif: ekspresi gen mendadak melonjak tajam saat konsentrasi autoinduser [AI] melampaui ambang KA.",
                variableMeanings = mapOf(
                    "[\\text{AI}]" to "Konsentrasi molekul autoinduser feromon mikroba di lingkungan",
                    "K_A" to "Konsentrasi ambang batas aktivasi kuorum",
                    "n > 1" to "Koefisien Hill kooperativitas saklar biologis"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Penanganan Infeksi Biofilm Kronis Pseudomonas aeruginosa pada Pasien ICU RSUP Persahabatan",
            industry = "Mikrobiologi Medis Klinis & Terapi Anti-Biofilm",
            context = "Pasien rawat intensif dengan ventilator mekanik di RSUP Persahabatan Jakarta mengalami infeksi paru pneumonia nosokomial persisten akibat bakteri *Pseudomonas aeruginosa*.",
            problem = "Uji laboratorium menunjukkan isolat bakteri peka terhadap antibiotik siprofloksasin secara in vitro, namun saat diberikan ke pasien, bakteri kebal dan tidak merespons pengobatan sama sekali karena membentuk lapisan lendir biofilm tebal pada selang ventilator endotrakeal.",
            solution = "Tim mikrobiolog klinik mengombinasikan antibiotik dengan agen Quorum Quenching (enzim laktonase rekombinan) dan N-asetilsistein (mukolitik pemutus ikatan disulfida matriks EPS biofilm). Laktonase mendegradasi molekul autoinduser 3-oxo-C12-HSL bakteri, membungkam sistem quorum sensing LasI/LasR dan mencegah pembentukan matriks alginat baru. Struktur biofilm melonggar dan sel-sel bakteri planktonik yang terlepas kini terpapar langsung oleh siprofloksasin, berhasil mengeradikasi koloni bakteri dan menyelamatkan fungsi paru pasien.",
            lessonsLearned = "Memahami komunikasi quorum sensing bakteri membuka paradigma terapi medis baru: alih-alih meracuni bakteri, kita dapat membungkam komunikasinya untuk melucuti senjata virulensinya."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Pembentukan Lapisan Lendir Biofilm Bakteri pada Permukaan Benda",
            objective = "Mengamati secara visual pembentukan matriks zat polimer ekstraseluler (biofilm) alami pada wadah air tergenang.",
            materialsNeeded = listOf(
                "1 buah wadah mangkuk plastik kecil berisi air keran bersih",
                "Beberapa butir kerikil bersih atau potongan sendok plastik",
                "Sedikit air cucian beras (sebagai nutrisi organik mikroba)",
                "Pewarna makanan merah"
            ),
            steps = listOf(
                "Masukkan kerikil ke dalam mangkuk berisi air yang ditambahkan 1 sendok teh air cucian beras.",
                "Letakkan di sudut ruangan hangat selama 4–5 hari tanpa diganggu.",
                "Setelah 5 hari, raba permukaan kerikil atau dinding mangkuk dengan jari tangan: rasakan sensasi lapisan lendir licin tebal yang melekat kuat (itulah matriks EPS Biofilm mikroba!).",
                "Coba bilas dengan kucuran air keran biasa: lapisan lendir tersebut TIDAK HANYUT karena merekat sangat kuat pada permukaan benda!",
                "Teteskan 1 tetes pewarna makanan merah: amati bagaimana pewarna terserap dan terperangkap pekat di dalam lapisan lendir biofilm.",
                "Simpulkan: Lapisan lendir licin ini adalah kota biofilm mikroba terkoordinasi quorum sensing yang melindungi koloni bakteri dari lingkungan luar!"
            ),
            safetyNotes = listOf(
                "Cuci tangan dengan sabun setelah meraba lapisan biofilm.",
                "Buang air ke saluran pembuangan toilet setelah pengamatan."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-quorum-sensing-1",
                prompt = "Bagaimanakah mekanisme kerja strategi terapi medis modern 'Quorum Quenching' dalam melawan bakteri patogen resisten?",
                type = "multiple_choice",
                options = listOf(
                    "Mendegradasi atau memblokir molekul sinyal autoinduser secara enzimatik sehingga bakteri tidak dapat mendeteksi kepadatan populasinya dan gagal mengaktifkan gen toksin virulensi dan biofilm",
                    "Memanaskan tubuh pasien hingga suhu mendidih",
                    "Menghancurkan seluruh sel darah putih pasien",
                    "Mengubah bakteri menjadi virus"
                ),
                correctAnswer = "Mendegradasi atau memblokir molekul sinyal autoinduser secara enzimatik sehingga bakteri tidak dapat mendeteksi kepadatan populasinya dan gagal mengaktifkan gen toksin virulensi dan biofilm",
                hints = listOf(
                    "Quorum = kuorum kepadatan bakteri; Quenching = memadamkan/meredam sinyal.",
                    "Terapi ini tidak membunuh bakteri secara langsung (sehingga tidak memicu tekanan seleksi mutasi resistensi), melainkan hanya melucuti senjatanya."
                ),
                explanation = "Quorum Quenching adalah strategi terapi antimikroba cerdas yang menargetkan sistem komunikasi kimiawi bakteri tanpa membunuh sel bakteri secara langsung (antivirulence therapy). Dengan menggunakan enzim pengurai autoinduser (seperti laktonase atau asilase) atau antagonis reseptor, molekul autoinduser dihancurkan sebelum mencapai ambang kuorum. Akibatnya, bakteri tetap berada dalam mode 'soliter jinak', tidak memproduksi toksin perusak jaringan, dan gagal membentuk benteng biofilm, sehingga mudah dibersihkan secara alami oleh sistem imun inang tanpa memicu resistensi obat.",
                misconception = "Mengira quorum quenching adalah jenis antibiotik racun pembunuh dinding sel biasa."
            ),
            QuizQuestion(
                id = "q-quorum-sensing-2",
                prompt = "Bakteri denitrifikasi di tanah dasar rawa yang miskin gas oksigen (O2) mampu menghasilkan energi ATP melalui rantai transpor elektron respirasi anaerobik dengan menggunakan senyawa apakah sebagai akseptor elektron terminal terakhir?",
                type = "multiple_choice",
                options = listOf(
                    "Ion Nitrat (NO3⁻)",
                    "Gas Oksigen (O2)",
                    "Molekul Glukosa",
                    "Gas Nitrogen (N2)"
                ),
                correctAnswer = "Ion Nitrat (NO3⁻)",
                hints = listOf(
                    "Lingkungan bersifat anaerob (tanpa O2).",
                    "Bakteri denitrifikasi mereduksi nitrat menjadi gas nitrogen.",
                    "Akseptor elektron yang direduksi adalah nitrat."
                ),
                explanation = "Dalam lingkungan anaerob tanpa oksigen, bakteri denitrifikasi (seperti *Pseudomonas stutzeri*) memanfaatkan ion Nitrat (NO3⁻) sebagai akseptor elektron terminal alternatif pada ujung rantai transpor elektron pernapasan. Ion nitrat memiliki potensial reduksi standar yang cukup tinggi (E° = +0.75 V, mendekati O2 yang bernilai +0.82 V), memungkinkan pemompaan proton melintasi membran dan sintesis ATP melalui kemiosmosis dengan efisiensi tinggi, mereduksi nitrat bertahap menjadi gas nitrogen bebas (N2).",
                misconception = "Mengira tanpa oksigen mikroba hanya bisa melakukan fermentasi (respirasi anaerob berbeda dari fermentasi karena respirasi anaerob tetap menggunakan rantai transpor elektron membran dan menghasilkan jauh lebih banyak ATP)."
            )
        )
    )

    private fun getImunMhcRekombinasiVdjLesson(): LessonData = LessonData(
        conceptId = "bio-imun-mhc-rekombinasi-vdj",
        storyPanels = listOf(
            StoryPanel(
                id = "p-imun-mhc-1",
                panelNumber = 1,
                title = "Miliaran Kunci untuk Gembok yang Belum Dikenal",
                caption = "Dimas menghitung bahwa genom manusia hanya memiliki sekitar 20.000 gen pengkode protein. Namun sistem imun adaptif kita mampu memproduksi lebih dari 10 triliun (10¹³) ragam antibodi yang berbeda!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana mungkin 20.000 gen bisa memproduksi triliunan bentuk antibodi berbeda untuk mengenali virus yang bahkan belum pernah berevolusi di bumi?"
            ),
            StoryPanel(
                id = "p-imun-mhc-2",
                panelNumber = 2,
                title = "Rekombinasi Somatik V(D)J Susumu Tonegawa",
                caption = "Kakek menjelaskan penemuan Hadiah Nobel Susumu Tonegawa: pemotongan dan penyambungan acak segmen gen DNA pada sel limfosit yang sedang berkembang.",
                dialogueSpeaker = "Kakek",
                dialogueText = "DNA sel imun dipotong dan diacak secara sengaja, Dimas! Enzim RAG-1 dan RAG-2 memotong segmen gen Variable (V), Diversity (D), dan Joining (J) secara acak layaknya mengocok kartu remi, menghasilkan variasi kombinasi tak berhingga!"
            ),
            StoryPanel(
                id = "p-imun-mhc-3",
                panelNumber = 3,
                title = "Presentasi Antigen MHC & Platform Vaksin mRNA",
                caption = "Kirana memaparkan peran molekul Major Histocompatibility Complex (MHC) dan mekanisme vaksin mRNA.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Sel T tidak bisa melihat antigen telanjang! MHC Kelas I memajang peptida intraseluler ke sel T CD8+ sitotoksik, sedangkan MHC Kelas II memajang patogen ke sel T CD4+ pembantu. Vaksin mRNA memanfaatkan sel tubuh kita sendiri untuk memproduksi antigen spike dan memajangnya di MHC, membangkitkan antibodi netralisasi dan sel T memori seumur hidup!"
            )
        ),
        intuition = "Sistem imun adaptif mamalia memiliki kemampuan luar biasa untuk mengenali antigen patogenik asing yang hampir tak terbatas. Keragaman repertoar reseptor sel B (Antibodi / Imunoglobulin) dan Reseptor Sel T (TCR) dibangkitkan melalui Rekombinasi Somatik V(D)J yang dikatalisis oleh kompleks endonuklease RAG-1 dan RAG-2 selama pematangan limfosit di sumsum tulang dan timus. Enzim TdT (Terminal deoxynucleotidyl transferase) menambahkan nukleotida junctional N secara acak, melipatgandakan keragaman teoritis hingga > 10¹⁵ variasi. Pengenalan antigen oleh sel T membutuhkan presentasi oleh molekul Major Histocompatibility Complex (MHC / HLA pada manusia): MHC Kelas I (diekspresikan oleh semua sel berinti, mempresentasikan peptida endogen sitosolik ke sel T CD8+ sitotoksik pembunuh) dan MHC Kelas II (diekspresikan oleh sel penyaji antigen profesional / APC seperti sel dendritik dan makrofag, mempresentasikan peptida eksogen ke sel T CD4+ penolong).",
        intuitionPoints = listOf(
            "Segmen Gen V(D)J: Rantai berat antibodi (IgH) tersusun dari segmen V, D, dan J; rantai ringan (IgL) hanya tersusun dari segmen V dan J. Rekombinasi kombinatorial dan junctional membangkitkan wilayah penentu komplementaritas CDR3 (titik sentral pengikatan antigen).",
            "MHC Kelas I: mengikat peptida pendek (8–10 asam amino) hasil degradasi proteasom sitoplasma via transporter TAP; berinteraksi dengan koreseptor CD8 pada sel T sitotoksik (CTL) untuk melisiskan sel terinfeksi virus atau sel kanker.",
            "MHC Kelas II: mengikat peptida lebih panjang (13–25 asam amino) hasil pencernaan endosom/lisosom; berinteraksi dengan koreseptor CD4 pada sel T helper (Th) untuk mengaktivasi sel B memproduksi antibodi.",
            "Seleksi Positif dan Negatif Timus: memastikan sel T mengenali MHC sendiri (seleksi positif) dan mengeliminasi sel T yang bereaksi kuat terhadap autoantigen tubuh sendiri (seleksi negatif / toleransi sentral penangkal autoimun).",
            "Vaksin mRNA: mRNA sintetis terenkapsulasi lipid nanopartikel (LNP) ditranslasikan di sitosol sel inang, antigen yang dihasilkan diproses dan dipresentasikan serentak pada MHC Kelas I dan MHC Kelas II, membangkitkan imunitas humoral antibodi dan imunitas seluler sel T memori secara simultan."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Kombinatorika Keragaman Repertoar Antibodi V(D)J",
                latexFormula = "\\text{Keragaman Total} = \\left(N_V \\times N_D \\times N_J\\right)_{\\text{Rantai Berat}} \\times \\left(N_V \\times N_J\\right)_{\\text{Rantai Ringan}} \\times 10^{\\text{Diversitas Junctional}} > 10^{14}",
                description = "Multiplikasi kombinatorial segmen gen dan penambahan nukleotida junctional N oleh enzim TdT.",
                variableMeanings = mapOf(
                    "N_V, N_D, N_J" to "Jumlah segmen gen variabel, diversitas, dan joining pada lokus genom",
                    "\\text{Diversitas Junctional}" to "Penambahan/pemotongan acak basa nitrogen pada titik sambungan"
                )
            ),
            FormulaCard(
                title = "Aturan Pengenalan Restriksi MHC (MHC Restriction)",
                latexFormula = "\\text{MHC Kelas I} + \\text{Peptida Endogen (8-10 aa)} \\iff \\text{Sel T CD8}^+ \\quad ; \\quad \\text{MHC Kelas II} + \\text{Peptida Eksogen} \\iff \\text{Sel T CD4}^+",
                description = "Pembagian peran fungsional presentasi antigen sel T sitotoksik pembunuh vs sel T penolong pembantu.",
                variableMeanings = mapOf(
                    "\\text{CD8}^+" to "Limfosit T sitotoksik pembunuh sel terinfeksi/kanker",
                    "\\text{CD4}^+" to "Limfosit T helper pengkoordinasi sistem imun adaptif"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengembangan Platform Vaksin mRNA Merah Putih di PT Bio Farma Bandung",
            industry = "Industri Vaksin Rekombinan & Imunologi Molekuler Lanjut",
            context = "Konsorsium Riset Vaksin Nasional di Bandung merancang platform mandiri vaksin mRNA terlindung lipid nanopartikel untuk menghadapi potensi pandemi penyakit virus menular baru.",
            problem = "Vaksin subunit protein konvensional memicu respon antibodi humoral yang baik namun sangat lemah dalam mengaktifkan sel T sitotoksik CD8+ pembunuh sel terinfeksi virus intraseluler.",
            solution = "Peneliti merancang untai mRNA yang mengkode protein antigen dengan modifikasi nukleosida N1-metilpseudouridin (m1Psi) untuk menghindari respon inflamasi berlebihan reseptor TLR bawaan. Di dalam sel inang, mRNA ditranslasikan secara efisien di sitosol. Sebagian protein antigen disekresikan keluar dan ditangkap oleh sel dendritik untuk dipresentasikan pada MHC Kelas II (mengaktifkan sel T CD4+ dan sel B penghasil antibodi netralisasi IgG), sementara sebagian protein di dalam sitosol didegradasi oleh proteasom dan dipresentasikan pada MHC Kelas I (mengaktifkan respon sel T pembunuh CD8+). Hasil uji imunogenisitas menunjukkan titer antibodi netralisasi 10 kali lebih tinggi dan kekebalan seluler memori jangka panjang yang protektif.",
            lessonsLearned = "Penguasaan molekuler sistem presentasi MHC dan rekombinasi somatik imunologi adalah landasan penentu kedaulatan teknologi vaksin dan kemandirian kesehatan nasional."
        ),
        homeLab = HomeLabData(
            title = "Model Simulasi Keragaman Kombinatorika V(D)J Menggunakan 3 Tumpukan Kartu Remi",
            objective = "Memahami bagaimana penggabungan acak sejumlah kecil segmen gen dapat menghasilkan triliunan kombinasi struktur antibodi berbeda.",
            materialsNeeded = listOf(
                "3 tumpukan kartu kertas berbeda warna:",
                "Tumpukan Merah (Segmen V): 10 kartu bernomor V1 sampai V10",
                "Tumpukan Kuning (Segmen D): 4 kartu bernomor D1 sampai D4",
                "Tumpukan Biru (Segmen J): 6 kartu bernomor J1 sampai J6"
            ),
            steps = listOf(
                "Kocok masing-masing tumpukan kartu secara terpisah.",
                "Simulasikan Pematangan Sel B 1: Ambil 1 kartu dari tumpukan Merah, 1 dari Kuning, dan 1 dari Biru. Catat kodenya (misal: V3-D2-J5). Ini adalah antibodi unik Sel B pertama!",
                "Kembalikan kartu, kocok ulang, dan ambil kembali untuk Sel B 2 (misal: V8-D1-J4).",
                "Hitung matematika kombinatorial: Hanya dari 10 kartu V, 4 kartu D, dan 6 kartu J, ada 10 x 4 x 6 = 240 ragam rantai berat!",
                "Jika rantai berat ini dipasangkan dengan tumpukan rantai ringan (10 V x 6 J = 60 ragam), total kombinasi melonjak menjadi 240 x 60 = 14.400 ragam antibodi berbeda hanya dari 36 kartu!",
                "Bayangkan jika ditambahkan mutasi acak pada titik sambungan (nukleotida junctional): kombinasinya melonjak melampaui triliunan ragam!",
                "Simpulkan: Ini adalah mekanisme rekombinasi somatik V(D)J yang dijalankan tubuh kita setiap hari di sumsum tulang!"
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan interaktif."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-imun-mhc-1",
                prompt = "Molekul presentasi antigen manakah yang diekspresikan oleh SELURUH SEL BERINTI di tubuh manusia dan bertugas mempresentasikan peptida endogen sitosolik kepada sel T sitotoksik CD8⁺?",
                type = "multiple_choice",
                options = listOf(
                    "MHC Kelas I (HLA-A, HLA-B, HLA-C pada manusia)",
                    "MHC Kelas II (HLA-DP, HLA-DQ, HLA-DR)",
                    "Antibodi Imunoglobulin E (IgE)",
                    "Molekul Komplemen C3b"
                ),
                correctAnswer = "MHC Kelas I (HLA-A, HLA-B, HLA-C pada manusia)",
                hints = listOf(
                    "MHC Kelas I ada di semua sel berinti (kecuali sel darah merah yang tidak berinti).",
                    "MHC Kelas I berinteraksi dengan koreseptor CD8 (ingat aturan perkalian 8: Kelas I x CD8 = 8; Kelas II x CD4 = 8)."
                ),
                explanation = "Molekul MHC Kelas I diekspresikan pada permukaan hampir seluruh sel berinti di dalam tubuh manusia. Molekul ini berfungsi seperti 'jendela inspeksi' bagi sistem imun: ia memajang fragmen peptida pendek hasil degradasi protein internal sitosol oleh proteasom. Jika sel terinfeksi virus atau bermutasi menjadi sel kanker, peptida abnormal akan dipajang pada celah MHC Kelas I, yang dikenali oleh sel T sitotoksik CD8⁺ untuk menghancurkan sel abnormal tersebut sebelum menyebar.",
                misconception = "Tertukar antara MHC Kelas I (pada seluruh sel berinti) dan MHC Kelas II (hanya pada sel penyaji antigen profesional seperti sel dendritik, makrofag, dan sel B)."
            ),
            QuizQuestion(
                id = "q-imun-mhc-2",
                prompt = "Apakah peran enzimatik utama dari kompleks protein RAG-1 dan RAG-2 (Recombination Activating Genes) selama proses pematangan sel limfosit B dan sel limfosit T?",
                type = "multiple_choice",
                options = listOf(
                    "Mengenali sekuens sinyal rekombinasi (RSS) dan memotong untai ganda DNA secara presisi untuk menggabungkan segmen gen V, D, dan J dalam pembentukan reseptor antigen",
                    "Memotong molekul glukosa menjadi asam laktat",
                    "Menyintesis molekul lipid membran sel",
                    "Menghancurkan bakteri patogen di dalam usus besar"
                ),
                correctAnswer = "Mengenali sekuens sinyal rekombinasi (RSS) dan memotong untai ganda DNA secara presisi untuk menggabungkan segmen gen V, D, dan J dalam pembentukan reseptor antigen",
                hints = listOf(
                    "RAG adalah enzim endonuklease spesifik limfosit.",
                    "Mutasi yang merusak gen RAG menyebabkan defisiensi imun kombinasi parah (SCID / Severe Combined Immunodeficiency)."
                ),
                explanation = "Enzim RAG-1 dan RAG-2 adalah endonuklease mutlak yang memicu proses Rekombinasi Somatik V(D)J. Enzim ini secara spesifik mengenali sekuens sinyal rekombinasi (Recombination Signal Sequences / RSS) yang mengapit segmen gen V, D, dan J, lalu memotong kedua untai heliks DNA dan membentuk struktur hairpin. Segmen-segmen DNA terpilih kemudian disambungkan kembali oleh enzim DNA ligase IV, menghasilkan keragaman genetik reseptor antibodi dan TCR yang unik pada setiap sel limfosit.",
                misconception = "Mengira antibodi disintesis secara seragam tanpa pemotongan dan penyusunan ulang DNA kromosom."
            )
        )
    )

    private fun getNeuroHodgkinHuxleyLtpLesson(): LessonData = LessonData(
        conceptId = "bio-neuro-hodgkin-huxley-ltp",
        storyPanels = listOf(
            StoryPanel(
                id = "p-neuro-hh-1",
                panelNumber = 1,
                title = "Kabel Listrik Hayati Akson Raksasa Cumi-cumi",
                caption = "Dimas mempelajari konduksi impuls saraf otak: Sinyal listrik pikiran manusia merambat bukan melalui aliran elektron bebas di kawat tembaga, melainkan melalui gelombang pergeseran ion melintasi membran sel saraf.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana membran sel saraf lipid yang tipis bisa menghasilkan lonjakan potensial aksi listrik tajam sebesar 100 milivolt dalam waktu hanya 1 milidetik?"
            ),
            StoryPanel(
                id = "p-neuro-hh-2",
                panelNumber = 2,
                title = "Persamaan Biofisika Hodgkin-Huxley",
                caption = "Kakek menjelaskan model sirkuit listrik kuantitatif Alan Hodgkin dan Andrew Huxley (Hadiah Nobel 1963).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Membran akson bertindak sebagai sirkuit listrik dinamis! Kapasitor lipid C_m paralel dengan tiga baterai kanal ion: pembukaan kanal Na⁺ bergerbang voltase memicu lonjakan depolarisasi, diikuti pembukaan kanal K⁺ yang memulihkan repolarisasi, dirumuskan dalam 4 persamaan diferensial non-linear Hodgkin-Huxley!"
            ),
            StoryPanel(
                id = "p-neuro-hh-3",
                panelNumber = 3,
                title = "Basis Seluler Memori: Long-Term Potentiation (LTP)",
                caption = "Kirana memaparkan mekanisme plastisitas sinaptik di hipokampus otak.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Belajar dan mengingat adalah perubahan fisik nyata pada sinapsis! Stimulasi frekuensi tinggi mendepak sumbatan ion Mg²⁺ dari reseptor NMDA, memicu influks kalsium yang menyisipkan reseptor AMPA tambahan ke membran pascasinaps. Sinapsis menjadi permanen lebih kuat—itulah jejak fisik Memori Otak (LTP)!"
            )
        ),
        intuition = "Sistem saraf memproses dan mentransmisikan informasi melalui sinyal elektrokimiawi impuls potensial aksi (Action Potential). Model Hodgkin-Huxley (1952) memodelkan membran akson sebagai sirkuit listrik paralel: arus membran I_m = C_m (dV/dt) + I_Na + I_K + I_L. Gerbang kanal ion diatur oleh probabilitas keterbukaan non-linear bergantung voltase: aktivasi cepat kanal Na+ (m³ h) memicu depolarisasi mendadak all-or-none (+40 mV), diikuti inaktivasi Na+ dan aktivasi lambat kanal K+ (n⁴) yang merepolarisasi membran kembali ke potensial istirahat (-70 mV). Pada tingkat sinapsis, plastisitas sinaptik merupakan dasar seluler memori dan pembelajaran: Long-Term Potentiation (LTP) pada neuron piramidal hipokampus dipicu oleh koinsidensi temporal aktivasi reseptor glutamat AMPA dan reseptor koinsidensi NMDA (yang porinya tersumbat ion Mg²⁺ pada potensial istirahat dan baru terbuka saat depolarisasi kuat). Influks Ca²⁺ melalui NMDA mengaktifkan kinase CaMKII yang menyisipkan reseptor AMPA tambahan ke membran pascasinaps, memperkuat transmisi sinaptik dalam jangka panjang.",
        intuitionPoints = listOf(
            "Potensial Istirahat Membran: sekitar -70 mV, dipertahankan oleh pompa Na⁺/K⁺-ATPase (3 Na⁺ keluar, 2 K⁺ masuk) dan kanal bocor K⁺ (permeabilitas membran terhadap K⁺ jauh lebih tinggi dibanding Na⁺).",
            "Fase Potensial Aksi: (1) Ambang batas tercapai (-55 mV) -> (2) Depolarisasi tajam lonjakan masuk ion Na⁺ -> (3) Puncak potensial (+30 hingga +40 mV) -> (4) Repolarisasi keluar ion K⁺ -> (5) Hiperpolarisasi bawah (-80 mV, periode refrakter) -> (6) Restorasi potensial istirahat.",
            "Periode Refrakter Mutlak: gerbang inaktivasi kanal Na⁺ (gerbang h) tertutup rapat dan tidak dapat dibuka oleh stimulus sebesar apa pun, menjamin perambatan potensial aksi selalu satu arah maju.",
            "Reseptor NMDA sebagai Detektor Koinsidensi Molekuler: membutuhkan pengikatan ligan glutamat DAN depolarisasi membran serentak untuk mendepak ion Mg²⁺ penghalang pori kanal.",
            "Penguatan Sinapsis LTP: influks Ca²⁺ memicu penambahan reseptor AMPA baru ke membran pascasinaps, memperbesar sensitivitas respon eksitasi EPSP terhadap pelepasan neurotransmiter berikutnya (hukum Hebb: 'Neurons that fire together, wire together')."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Persamaan Diferensial Sirkuit Membran Hodgkin-Huxley",
                latexFormula = "C_m \\frac{dV}{dt} = I_{\\text{injeksi}} - \\bar{g}_{Na} m^3 h (V - E_{Na}) - \\bar{g}_K n^4 (V - E_K) - g_L (V - E_L)",
                description = "Persamaan diferensial non-linear biofisika membran penentu pembentukan potensial aksi.",
                variableMeanings = mapOf(
                    "C_m" to "Kapasitansi spesifik membran lipid bilayer (~1 mikrofarad/cm²)",
                    "V" to "Potensial membran akson terhadap cairan luar (Volt)",
                    "\\bar{g}_{Na}, \\bar{g}_K" to "Konduktansi maksimum kanal ion Na⁺ dan K⁺",
                    "m, h, n" to "Variabel probabilitas pembukaan gerbang ionik (0 sampai 1)",
                    "E_{Na}, E_K" to "Potensial pembalikan Nernst ionik (+60 mV untuk Na, -90 mV untuk K)"
                )
            ),
            FormulaCard(
                title = "Potensial Kesetimbangan Nernst Ionik Membran",
                latexFormula = "E_{\\text{ion}} = \\frac{R T}{z F} \\ln\\left(\\frac{[\\text{Ion}]_{\\text{luar}}}{[\\text{Ion}]_{\\text{dalam}}}\\right) \\approx \\frac{61.5}{z} \\log_{10}\\left(\\frac{[\\text{Ion}]_{\\text{luar}}}{[\\text{Ion}]_{\\text{dalam}}}\\right) \\text{ (mV pada 37°C)}",
                description = "Potensial listrik membran saat gradien konsentrasi kimiawi tepat diimbangi oleh gradien elektrostatik.",
                variableMeanings = mapOf(
                    "E_\\text{ion}" to "Potensial kesetimbangan Nernst (milivolt)",
                    "z" to "Valensi muatan ion (+1 untuk Na⁺ dan K⁺, +2 untuk Ca²⁺, -1 untuk Cl⁻)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Stimulasi Otak Dalam (DBS) & Rehabilitasi Plastisitas Pasca-Stroke di RS Pusat Otak Nasional",
            industry = "Neurosains Klinis & Rekayasa Neuroteknologi Kedokteran",
            context = "Rumah Sakit Pusat Otak Nasional (RS PON) Prof. Dr. dr. Mahar Mardjono Jakarta menangani pasien pemulihan hemiparesis pasca-stroke iskemik dan tremor penyakit Parkinson.",
            problem = "Kematian neuron korteks motorik akibat stroke memutus sirkuit transmisi sinaptik. Bagaimana memicu sisa neuron yang masih hidup di sekitar lesi untuk membentuk koneksi sinapsis fungsional baru?",
            solution = "Tim neurosaintis menerapkan terapi stimulasi magnetik transkranial berulang (rTMS frekuensi tinggi 10 Hz) yang dipadukan dengan latihan motorik intensif. Berdasarkan model biofisika Hodgkin-Huxley dan prinsip plastisitas Long-Term Potentiation (LTP), pulsa magnetik frekuensi tinggi menginduksi depolarisasi membran ritmis berulang pada neuron korteks motorik, membuka hambatan kanal NMDA dan memicu influks kalsium intraseluler. Kaskade LTP meningkatkan ekspresi faktor neurotropik BDNF dan menyisipkan jutaan reseptor AMPA baru pada celah pascasinaps sirkuit motorik alternatif, memulihkan kemampuan gerak tangan pasien hingga 65% dalam 12 minggu rehabilitasi terarah.",
            lessonsLearned = "Persamaan biofisika Hodgkin-Huxley dan plastisitas sinaptik LTP membuktikan bahwa otak dewasa bersifat dinamis dan dapat diprogram ulang melalui rekayasa neuroteknologi presisi."
        ),
        homeLab = HomeLabData(
            title = "Model Perambatan Potensial Aksi & Periode Refrakter Menggunakan Deretan Korek Api",
            objective = "Memahami secara visual mengapa impuls saraf merambat tanpa pengurangan amplitudo (all-or-none) dan selalu merambat satu arah maju akibat periode refrakter.",
            materialsNeeded = listOf(
                "1 kotak korek api kayu biasa",
                "1 lembar karton tebal beralas abu/pasir tipis",
                "Sedikit plastisin / lilin mainan untuk menegakkan korek api berbaris"
            ),
            steps = listOf(
                "Tancapkan 15 batang korek api tegak lurus berbaris lurus dengan jarak rapat 0.8 cm antar-batang (mewakili segmen-segmen akson saraf).",
                "Bakar kepala korek api nomor 1 di ujung kiri (mewakili rangsangan stimulus ambang batas di bukit akson / axon hillock).",
                "Amati perambatan api: Begitu kepala korek api 1 terbakar, nyala apinya langsung menyulut kepala korek api 2, yang menyulut korek api 3, dan api merambat cepat ke ujung kanan dengan besar nyala api yang PERSIS SAMA BESAR dari ujung ke ujung!",
                "Perhatikan bagian belakang yang sudah terbakar: Kepala korek api yang sudah menjadi arang hitam mati dan TIDAK BISA MENYALA LAGI saat disentuh api (analog Periode Refrakter Mutlak kanal Na⁺ terinaktivasi)!",
                "Karena bagian belakang menjadi arang refrakter, api HANYA BISA MERAMBAT SATU ARAH MAJU ke arah depan!",
                "Simpulkan: Perambatan api korek api ini adalah model analog fisik sempurna dari perambatan potensial aksi saraf all-or-none dan periode refrakter!"
            ),
            safetyNotes = listOf(
                "Lakukan di luar ruangan atau di atas permukaan tahan api.",
                "Sediakan segelas air di dekat Anda untuk memadamkan puntung korek setelah selesai."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-neuro-hh-1",
                prompt = "Mengapa reseptor glutamat NMDA pada sinapsis neuron hipokampus otak disebut sebagai 'Detektor Koinsidensi Molekuler' (Molecular Coincidence Detector) dalam proses pembentukan memori Long-Term Potentiation (LTP)?",
                type = "multiple_choice",
                options = listOf(
                    "Karena kanal ion NMDA hanya akan terbuka jika DUA syarat terpenuhi secara serentak: pengikatan ligan neurotransmiter glutamat DAN depolarisasi membran yang cukup kuat untuk mendepak ion Mg²⁺ yang menyumbat pori kanal",
                    "Karena reseptor NMDA hanya bekerja saat suhu tubuh mencapai 100°C",
                    "Karena reseptor NMDA mengikat molekul insulin dan glukosa secara bersamaan",
                    "Karena reseptor NMDA membelah sel saraf menjadi dua"
                ),
                correctAnswer = "Karena kanal ion NMDA hanya akan terbuka jika DUA syarat terpenuhi secara serentak: pengikatan ligan neurotransmiter glutamat DAN depolarisasi membran yang cukup kuat untuk mendepak ion Mg²⁺ yang menyumbat pori kanal",
                hints = listOf(
                    "Pada potensial istirahat (-70 mV), ion Magnesium (Mg²⁺) tersangkut menyumbat pori kanal reseptor NMDA.",
                    "Hanya depolarisasi membran (yang dipicu oleh reseptor AMPA tetangganya) yang dapat menolak ion Mg²⁺ bermuatan positif keluar dari pori.",
                    "Dua peristiwa harus terjadi pada waktu bersamaan (koinsidensi)."
                ),
                explanation = "Reseptor NMDA memiliki sifat unik di mana pada potensial membran istirahat (-70 mV), ion Magnesium ekstraseluler (Mg²⁺) tertarik ke dalam pori kanal oleh muatan negatif intraseluler dan menyumbat kanal secara elektrostatik. Agar kanal dapat membuka dan mengalirkan kalsium, dua peristiwa harus terjadi bertepatan (koinsidensi): (1) Ligan glutamat harus terikat pada reseptor, DAN (2) Membran pascasinaps harus terdepolarisasi kuat (oleh aktivitas reseptor AMPA) untuk menolak muatan positif ion Mg²⁺ keluar dari pori. Kemampuan mendeteksi dua sinyal simultan inilah yang mendasari asosiasi memori Hebbian.",
                misconception = "Mengira reseptor NMDA bekerja murni sebagai kanal bergerbang ligan biasa tanpa ketergantungan voltase."
            ),
            QuizQuestion(
                id = "q-neuro-hh-2",
                prompt = "Berdasarkan Model Sirkuit Biofisika Hodgkin-Huxley, peristiwa molekuler manakah yang bertanggung jawab secara langsung atas fase DEPOLARISASI CEPAT (lonjakan potensial membran dari -55 mV menuju +40 mV) pada pembentukan potensial aksi akson?",
                type = "multiple_choice",
                options = listOf(
                    "Pembukaan cepat kanal ion Natrium (Na⁺) bergerbang voltase, memicu influks deras ion Na⁺ masuk ke dalam sel menuruni gradien konsentrasi dan gradien listrik",
                    "Pembukaan lambat kanal ion Kalium (K⁺) yang mengeluarkan ion K⁺",
                    "Aktivitas pompa Na⁺/K⁺-ATPase mematikan seluruh aliran listrik",
                    "Penyerapan molekul kalsium oleh mitokondria"
                ),
                correctAnswer = "Pembukaan cepat kanal ion Natrium (Na⁺) bergerbang voltase, memicu influks deras ion Na⁺ masuk ke dalam sel menuruni gradien konsentrasi dan gradien listrik",
                hints = listOf(
                    "Konsentrasi ion Na⁺ jauh lebih tinggi di luar sel dibanding di dalam sel.",
                    "Ion Na⁺ bermuatan positif; masuknya ion positif membuat interior sel menjadi positif (depolarisasi).",
                    "Variabel aktivasi gerbang m meningkat tajam saat voltase melampaui ambang batas."
                ),
                explanation = "Ketika potensial membran mencapai ambang batas letupan (sekitar -55 mV), medan listrik memicu perubahan konformasi cepat pada sensor voltase kanal Na⁺ (domain S4), menyebabkan gerbang aktivasi terbuka seketika. Karena konsentrasi Na⁺ di luar sel jauh lebih pekat (~145 mM luar vs 15 mM dalam) dan interior sel bermuatan negatif, ion Na⁺ membanjiri masuk ke dalam sitoplasma akson secara masif, mendorong potensial membran melesat positif mendekati potensial kesetimbangan Nernst Na⁺ (+60 mV).",
                misconception = "Tertukar antara peran ion Natrium (pemicu depolarisasi naik) dan ion Kalium (pemicu repolarisasi turun)."
            )
        )
    )

    private fun getEndoAksisHipotalamusHormonLesson(): LessonData = LessonData(
        conceptId = "bio-endo-aksis-hipotalamus-hormon",
        storyPanels = listOf(
            StoryPanel(
                id = "p-endo-aksis-1",
                panelNumber = 1,
                title = "Konduktor Orkestra Kimiawi Tubuh",
                caption = "Dimas merasa lapar, lelah, dan detak jantungnya meningkat saat menghadapi ujian. Kelenjar tiroid, adrenal, dan gonad di berbagai pelosok tubuh merespons serentak dengan harmonis.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana otak mengorkestrasi belasan kelenjar hormon di seluruh penjuru tubuh agar tidak saling bertubrukan dan menjaga keseimbangan homeostasis?"
            ),
            StoryPanel(
                id = "p-endo-aksis-2",
                panelNumber = 2,
                title = "Sumbu Hipotalamus-Hipofisis Poros Komando",
                caption = "Kakek menjelaskan sistem komando hierarkis Sumbu HPA, HPT, dan HPG.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Hipotalamus adalah jenderal komandonya, Dimas! Ia melepaskan hormon pelepas (Releasing Hormones) ke sistem vena porta hipofisis. Hipofisis anterior memproduksi hormon tropik (ACTH, TSH, LH/FSH) yang memerintahkan kelenjar target memproduksi hormon efektor akhir!"
            ),
            StoryPanel(
                id = "p-endo-aksis-3",
                panelNumber = 3,
                title = "Umpan Balik Negatif & Reseptor Nuklear",
                caption = "Kirana memaparkan mekanisme umpan balik loop panjang dan aksi hormon steroid.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Sistem ini memiliki thermostat pintar: jika kadar hormon target (seperti Kortisol atau Tiroksin) sudah cukup tinggi, ia mengirim umpan balik negatif ke hipotalamus dan hipofisis untuk mematikan sekresi! Dan hormon steroid menembus membran langsung ke inti sel mengaktifkan gen!"
            )
        ),
        intuition = "Sistem endokrin beroperasi melalui sumbu poros neuroendokrin berjenjang yang menghubungkan sistem saraf pusat dengan kelenjar perifer melalui Hipotalamus dan Kelenjar Hipofisis (Pituitari). Tiga poros utama adalah: (1) Sumbu HPA (Hipotalamus-Hipofisis-Adrenal: CRH -> ACTH -> Kortisol respons stres); (2) Sumbu HPT (Hipotalamus-Hipofisis-Tiroid: TRH -> TSH -> T3/T4 pengatur laju metabolisme basal); dan (3) Sumbu HPG (Hipotalamus-Hipofisis-Gonad: GnRH -> LH/FSH -> Estrogen/Testosteron pengatur reproduksi). Homeostasis dipertahankan melalui mekanisme Loop Umpan Balik Negatif (Negative Feedback Loops) bertingkat. Berdasarkan sifat kelarutannya, hormon terbagi menjadi: Hormon Peptida/Protein hidrofilik (mengikat reseptor membran permukaan, transduksi via second messenger cAMP/Ca²⁺ berkecepatan detik–menit) dan Hormon Steroid/Tiroid lipofilik (menembus membran sel, berikatan dengan Reseptor Nuklear di sitoplasma/nukleus, bertindak sebagai faktor transkripsi dimer yang mengikat Hormone Response Elements / HRE pada DNA berkecepatan jam–hari).",
        intuitionPoints = listOf(
            "Sistem Portal Hipofisis-Hipotalamus: jaringan kapiler darah khusus yang membawa hormon releasing/inhibiting hipotalamus berkonsentrasi tinggi langsung ke hipofisis anterior tanpa terencerkan oleh sirkulasi sistemik umum.",
            "Loop Umpan Balik Panjang (Long-Loop Negative Feedback): hormon dari kelenjar target akhir (seperti kortisol atau tiroksin) menghambat pelepasan hormon di hipofisis anterior DAN hipotalamus sekaligus.",
            "Mekanisme Reseptor Nuklear Hormon Steroid: hormon steroid berdifusi melintasi membran fosfolipid -> mengikat reseptor sitoplasma terikat heat-shock protein (HSP90) -> pelepasan HSP90 dan dimerisasi reseptor -> translokasi ke nukleus -> mengikat sekuens HRE (Hormone Response Element) pada promotor DNA -> transkripsi mRNA.",
            "Irama Sirkadian Hormon: sekresi kortisol memuncak di pagi hari sesaat sebelum bangun tidur (Cortisol Awakening Response) dan menurun di malam hari, diatur oleh jam master nukleus suprakiasmatik (SCN) hipotalamus.",
            "Regulasi Endokrin Non-Hipofisis: kadar glukosa darah diatur langsung oleh sel pulau Langerhans pankreas (Insulin sel beta vs Glukagon sel alfa) tanpa melalui poros hipofisis."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Model Matematika Umpan Balik Negatif Sumbu HPA",
                latexFormula = "\\frac{d[\\text{Kortisol}]}{dt} = k_{\\text{sintesis}} [\\text{ACTH}] - k_{\\text{eliminasi}} [\\text{Kortisol}] \\quad ; \\quad [\\text{ACTH}] \\propto \\frac{1}{1 + \\left(\\frac{[\\text{Kortisol}]}{K_i}\\right)^n}",
                description = "Penurunan sekresi ACTH dan CRH secara umpan balik non-linear oleh konsentrasi kortisol plasma.",
                variableMeanings = mapOf(
                    "[\\text{Kortisol}]" to "Konsentrasi hormon glukokortikoid aktif dalam darah",
                    "[\\text{ACTH}]" to "Hormon adrenokortikotropik dari hipofisis anterior",
                    "K_i" to "Konstanta afinitas hambatan umpan balik reseptor glukokortikoid"
                )
            ),
            FormulaCard(
                title = "Persamaan Klirens Metabolik Hormon Plasma",
                latexFormula = "\\text{Laju Sekresi} = \\text{MCR} \\times [\\text{Hormon}]_\\text{plasma}",
                description = "Keseimbangan homeostasis laju sekresi kelenjar terhadap Metabolic Clearance Rate (MCR) hati dan ginjal.",
                variableMeanings = mapOf(
                    "\\text{MCR}" to "Laju klirens metabolisme hormon (Volume plasma yang dibersihkan per menit)",
                    "[\\text{Hormon}]" to "Kadar hormon terukur dalam sirkulasi darah"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Diferensiasi Diagnosis Sindrom Cushing di RSUP Dr. Kariadi Semarang",
            industry = "Endokrinologi Klinis & Kedokteran Metabolik Rumah Sakit",
            context = "Pasien wanita berusia 35 tahun di RSUP Dr. Kariadi Semarang mengalami obesitas sentral punuk kerbau (buffalo hump), wajah bulat membengkak (moon face), hipertensi, dan memar kulit mudah robek.",
            problem = "Kadar hormon kortisol bebas urin 24 jam melonjak sangat tinggi (> 300 mikrogram/hari). Bagaimana membedakan apakah kelebihan kortisol ini disebabkan oleh tumor adenoma hipofisis anterior penghasil ACTH (Penyakit Cushing) atau tumor otonom kelenjar adrenal itu sendiri?",
            solution = "Dokter spesialis endokrinologi melakukan Uji Supresi Deksametason Dosis Tinggi (High-Dose Dexamethasone Suppression Test / 8 mg malam hari). Deksametason adalah glukokortikoid sintetis sangat kuat. Pada pasien dengan adenoma hipofisis (Penyakit Cushing), sel tumor masih mempertahankan sisa kepekaan umpan balik negatif parsial, sehingga pemberian deksametason dosis tinggi berhasil menekan sekresi ACTH dan menurunkan kadar kortisol plasma lebih dari 50%. Sebaliknya, jika tumor berada di kelenjar adrenal yang mensekresi kortisol secara otonom liar, kadar ACTH sudah tersupresi nol sejak awal dan deksametason tidak menurunkan kadar kortisol sama sekali. Uji supresi berhasil membuktikan tumor berasal dari adenoma hipofisis, mengarahkan dokter bedah saraf mengangkat mikroadenoma via endoskopi transfenoidal dengan kesembuhan total.",
            lessonsLearned = "Penguasaan mekanisme fisiologis loop umpan balik negatif sumbu neuroendokrin adalah instrumen diagnostik paling elegan dalam memecahkan teka-teki penyakit endokrin yang kompleks."
        ),
        homeLab = HomeLabData(
            title = "Model Analog Homeostasis Umpan Balik Negatif Menggunakan Dispenser Air Panas",
            objective = "Memahami prinsip regulasi loop tertutup umpan balik negatif pemelihara kestabilan nilai patokan (set-point).",
            materialsNeeded = listOf(
                "1 unit dispenser air minum berpemanas otomatis (atau setrika listrik)",
                "Lampu indikator pemanas dispenser",
                "Stopwatch"
            ),
            steps = listOf(
                "Amati lampu indikator pemanas dispenser air (lampu merah menyala = elemen pemanas bekerja; lampu mati = suhu mencapai set-point).",
                "Ketika dispenser mencapai suhu target 90°C (set-point), termostat memutus aliran listrik secara otomatis (analog: hormon target Kortisol/T3 menghambat hipotalamus dan hipofisis mematikan sekresi hormon tropik).",
                "Keluarkan 1 gelas air panas dari dispenser dan ganti dengan air dingin (memberikan gangguan / stres lingkungan).",
                "Amati seketika: begitu suhu air turun di bawah set-point, termostat segera menyalakan kembali elemen pemanas (analog: penurunan hormon target melepaskan hambatan umpan balik, memicu hipotalamus mensekresi hormon releasing kembali!).",
                "Simpulkan: Kelenjar hormon tubuh kita bekerja persis seperti loop tertutup termostat ini selama 24 jam sehari untuk menjaga kestabilan parameter fisiologis tubuh!"
            ),
            safetyNotes = listOf(
                "Hati-hati terhadap air panas dispenser, jangan sampai menyiram kulit."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-endo-aksis-1",
                prompt = "Pada sumbu hormonal Hipotalamus-Hipofisis-Tiroid (Sumbu HPT), apa yang akan terjadi dengan kadar hormon TSH (Thyroid-Stimulating Hormone) dari hipofisis anterior jika seseorang menderita Penyakit Hipotiroidisme Primer (di mana kelenjar tiroid rusak dan gagal memproduksi hormon tiroksin T3 dan T4)?",
                type = "multiple_choice",
                options = listOf(
                    "Kadar TSH darah akan MELONJAK SANGAT TINGGI akibat hilangnya mekanisme umpan balik negatif oleh hormon T3 dan T4 terhadap hipofisis dan hipotalamus",
                    "Kadar TSH darah akan turun menjadi nol",
                    "Kadar TSH darah tetap tidak berubah sama sekali",
                    "Kelenjar hipofisis anterior akan langsung berhenti memproduksi seluruh hormon"
                ),
                correctAnswer = "Kadar TSH darah akan MELONJAK SANGAT TINGGI akibat hilangnya mekanisme umpan balik negatif oleh hormon T3 dan T4 terhadap hipofisis dan hipotalamus",
                hints = listOf(
                    "Hormon T3 dan T4 berfungsi memberikan sinyal 'rem' (umpan balik negatif) ke hipofisis.",
                    "Jika kelenjar tiroid rusak, produksi T3/T4 anjlok rendah (rem blong).",
                    "Tanpa adanya rem penghambat, hipofisis memacu sekresi TSH secara maksimal."
                ),
                explanation = "Dalam keadaan normal, hormon tiroksin (T3 dan T4) menjalankan fungsi umpan balik negatif (negative feedback) ke hipofisis anterior untuk menekan produksi TSH. Pada hipotiroidisme primer, kelenjar tiroid mengalami kegagalan fungsi sehingga kadar T3 dan T4 dalam sirkulasi sangat rendah. Ketiadaan hormon T3/T4 melepaskan rem umpan balik negatif pada hipofisis anterior dan hipotalamus, menyebabkan hipofisis anterior mensekresi TSH secara berlebihan dalam jumlah sangat tinggi (hipersekresi TSH kompensatorik) untuk berusaha merangsang tiroid yang rusak.",
                misconception = "Mengira kerusakan tiroid menyebabkan seluruh hormon termasuk TSH ikut menurun (penurunan hormon perifer justru memicu lonjakan hormon tropik hipofisis)."
            ),
            QuizQuestion(
                id = "q-endo-aksis-2",
                prompt = "Mengapa hormon-hormon steroid (seperti Kortisol, Aldosteron, Estrogen, dan Testosteron) memiliki masa kerja yang lebih lambat (membutuhkan waktu berjam-jam hingga berhari-hari) dibanding hormon peptida seperti Adrenalin atau Insulin yang bekerja dalam hitungan detik?",
                type = "multiple_choice",
                options = listOf(
                    "Karena hormon steroid bekerja dengan menembus membran sel, mengikat reseptor nuklear, dan mengubah transkripsi genetik DNA menjadi sintesis protein baru, proses biologis yang membutuhkan waktu jauh lebih lama dibanding aktivasi enzim sitoplasma oleh second messenger",
                    "Karena hormon steroid bergerak di dalam darah dengan kecepatan yang sangat lambat",
                    "Karena hormon steroid berukuran 1000 kali lebih besar dari sel darah",
                    "Karena hormon steroid selalu dirusak oleh lambung"
                ),
                correctAnswer = "Karena hormon steroid bekerja dengan menembus membran sel, mengikat reseptor nuklear, dan mengubah transkripsi genetik DNA menjadi sintesis protein baru, proses biologis yang membutuhkan waktu jauh lebih lama dibanding aktivasi enzim sitoplasma oleh second messenger",
                hints = listOf(
                    "Hormon peptida mengikat reseptor permukaan dan memicu kaskade fosforilasi enzim yang sudah siap di sitoplasma (cepat).",
                    "Hormon steroid memprogram ulang transkripsi gen DNA dan translasi mRNA (lambat)."
                ),
                explanation = "Hormon peptida dan amina (seperti adrenalin) bekerja melalui reseptor membran permukaan yang memicu kaskade fosforilasi enzim yang sudah ada di sitoplasma via second messenger, menghasilkan respon cepat dalam hitungan milidetik hingga menit. Sebaliknya, hormon steroid bersifat lipofilik dan menembus membran untuk mengikat reseptor nuklear intraseluler yang bertindak langsung sebagai faktor transkripsi. Responnya memerlukan transkripsi gen baru dari DNA menjadi mRNA dan translasi menjadi molekul protein baru pada ribosom, proses sintesis biologis yang membutuhkan waktu beberapa jam hingga berhari-hari untuk memanifestasikan efek fisiologisnya.",
                misconception = "Mengira semua hormon bekerja melalui mekanisme saklar membran yang sama."
            )
        )
    )

    private fun getDevEmbriogenesisGenHoxLesson(): LessonData = LessonData(
        conceptId = "bio-dev-embriogenesis-gen-hox",
        storyPanels = listOf(
            StoryPanel(
                id = "p-dev-hox-1",
                panelNumber = 1,
                title = "Lalat dengan Kaki Tumbuh di Kepala",
                caption = "Dimas melihat foto mikroskop mutan lalat buah *Antennapedia*: bukannya memiliki sepasang antena di kepala, lalat tersebut justru menumbuhkan sepasang kaki berjalan lengkap tepat di rongga matanya!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Hanya karena satu mutasi gen tunggal, bagaimana bisa sebuah organ kaki yang begitu rumit salah tumbuh di kepala menggantikan antena?"
            ),
            StoryPanel(
                id = "p-dev-hox-2",
                panelNumber = 2,
                title = "Gen Arsitek Homeoboks (Hox Genes)",
                caption = "Kakek menjelaskan klaster gen arsitek Homeoboks karya Edward B. Lewis (Hadiah Nobel 1995).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Gen Hox adalah manajer arsitek tubuh embrio, Dimas! Gen Hox tidak membangun sel kaki secara langsung, melainkan memberikan 'identitas koordinat wilayah tubuh'. Mutasi Antennapedia membuat sel kepala salah mengira dirinya adalah segmen dada toraks, sehingga mengaktifkan seluruh program genetik pembangun kaki!"
            ),
            StoryPanel(
                id = "p-dev-hox-3",
                panelNumber = 3,
                title = "Prinsip Kolinieritas & Gradien Morfogen",
                caption = "Kirana memaparkan sifat kolinieritas spasial gen Hox dan gradien konsentrasi morfogen.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Urutan letak gen Hox pada kromosom dari ujung 3' ke 5' mencerminkan secara persis urutan segmen tubuh dari kepala ke ekor! Dan gradien konsentrasi morfogen seperti Bicoid dan Shh memberi tahu sel posisinya sesuai Model Bendera Prancis Wolpert!"
            )
        ),
        intuition = "Biologi perkembangan mempelajari proses teratur transformasi zigot bersel tunggal menjadi organisme multiseluler kompleks melalui pembelahan sel, diferensiasi, dan morfogenesis. Embriogenesis diawali oleh pembelahan (cleavage), pembentukan blastula, dan Gastrulasi—peristiwa paling penting dalam hidup yang mereorganisasi sel-sel embrio menjadi Tiga Lapisan Germinal Dasar: Ektoderm (membentuk epidermis kulit dan sistem saraf), Mesoderm (membentuk otot, rangka, darah, dan sistem kardiovaskular), dan Endoderm (membentuk saluran pencernaan dan pernapasan). Penentuan pola sumbu tubuh (anterior-posterior dan dorsal-ventral) dipandu oleh gradien konsentrasi molekul pensinyal terlarut yang disebut Morfogen (Model Bendera Prancis Lewis Wolpert). Identitas spesifik masing-masing segmen anatomi tubuh di sepanjang sumbu anterior-posterior ditentukan oleh Klaster Gen Homeoboks (Hox Genes) yang memiliki motif pengikat DNA lestari sepanjang 180 pasang basa (homeodomain). Klaster gen Hox menunjukkan Kolinieritas Spasial dan Temporal: urutan lokus gen pada kromosom dari 3' ke 5' mencerminkan secara tepat urutan ekspresi segmen anatomi tubuh dari anterior (kepala) ke posterior (ekor).",
        intuitionPoints = listOf(
            "Tiga Lapisan Germinal Gastrulasi: Ektoderm (saraf, otak, kulit luar); Mesoderm (tulang, otot, jantung, ginjal, darah); Endoderm (epitel usus, paru-paru, hati, pankreas).",
            "Model Bendera Prancis Wolpert: sel merespons konsentrasi ambang batas morfogen (threshold concentrations): konsentrasi tinggi memicu diferensiasi tipe sel 'Biru', konsentrasi sedang memicu 'Putih', konsentrasi rendah memicu 'Merah'.",
            "Prinsip Kolinieritas Gen Hox: gen pada ujung 3' klaster kromosom diekspresikan paling awal pada wilayah paling anterior (kepala/leher); gen pada ujung 5' diekspresikan paling akhir pada wilayah posterior (ekor/tulang ekor).",
            "Mutasi Homeotik (Homeotic Transformations): mutasi gen Hox yang mengubah satu bagian tubuh menjadi bagian tubuh lain secara utuh (contoh: *Antennapedia* menumbuhkan kaki di kepala; mutasi *Bithorax* menumbuhkan sepasang sayap ekstra kedua menggantikan halter penyeimbang).",
            "Sel Punca Pluripoten Terinduksi (iPSC): sel somatik dewasa yang diprogram ulang kembali ke keadaan pluripoten seperti embrio melalui ekspresi 4 faktor transkripsi Yamanaka (Oct4, Sox2, Klf4, c-Myc)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Gradien Difusi Konsentrasi Morfogen (Model Wolpert)",
                latexFormula = "C(x) = C_0 \\cdot e^{-\\frac{x}{\\lambda}} \\quad ; \\quad \\lambda = \\sqrt{\\frac{D}{k}}",
                description = "Profil konsentrasi morfogen eksponensial menurun dari sumber sekresi C0 di sepanjang posisi spasial x (D = koefisien difusi, k = laju degradasi).",
                variableMeanings = mapOf(
                    "C(x)" to "Konsentrasi morfogen pada jarak x dari sumber penghasil",
                    "\\lambda" to "Panjang karakteristik peluruhan gradien morfogen",
                    "x" to "Posisi spasial sel pada sumbu embrio"
                )
            ),
            FormulaCard(
                title = "Kolinieritas Genomik Klaster Gen Hox",
                latexFormula = "\\text{Kromosom: } 5' \\text{ --- } [\\text{Hox13}] \\text{ -- } [\\text{Hox9}] \\text{ -- } [\\text{Hox4}] \\text{ -- } [\\text{Hox1}] \\text{ --- } 3' \\iff \\text{Tubuh: } [\\text{Ekor}] \\leftarrow [\\text{Posterior}] \\leftarrow [\\text{Toraks}] \\leftarrow [\\text{Kepala}]",
                description = "Kesesuaian topologi 1-ke-1 antara urutan fisik gen pada kromosom dan sumbu tubuh anterior-posterior organisme.",
                variableMeanings = mapOf(
                    "3'" to "Diekspresikan paling anterior (kepala/leher)",
                    "5'" to "Diekspresikan paling posterior (ekor/kaki belakang)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Diferensiasi Sel Punca Pluripoten (iPSC) untuk Terapi Kerusakan Sel Beta Pankreas di BRIN Cibinong",
            industry = "Kedokteran Regeneratif & Biologi Sel Punca Diferensiasi Terarah",
            context = "Pusat Riset Biomedis BRIN di Cibinong meneliti rekayasa sel punca untuk menghasilkan sel beta pankreas penghasil insulin bagi pengobatan diabetes melitus tipe 1.",
            problem = "Sel punca pluripoten (iPSC) memiliki potensi berubah menjadi ratusan jenis sel tubuh acak. Bagaimana memandu diferensiasinya agar 100% spesifik menjadi sel beta pankreas tanpa membentuk tumor teratoma berbahaya?",
            solution = "Peneliti merekapitulasi tahapan embriogenesis alami di cawan petri langkah demi langkah: (1) Hari 1–3: Pemberian morfogen Aktivin A konsentrasi tinggi meniru gastrulasi untuk menginduksi lapisan Endoderm Definitif; (2) Hari 4–7: Pemberian inhibitor BMP dan FGF10 memandu sel menjadi tabung usus primitif posterior; (3) Hari 8–12: Penambahan asam retinoat mengaktifkan gen homeoboks master pankreas *PDX1* (Pancreatic and Duodenal Homeobox 1); (4) Hari 13–20: Penambahan molekul kecil penstabil faktor neurogenin-3 (Ngn3) memicu diferensiasi menjadi kelompok pulau sel beta penghasil insulin fungsional yang responsif terhadap glukosa. Transplantasi sel pada model hewan percobaan merestorasi kadar gula darah normal.",
            lessonsLearned = "Memahami jalur molekuler embriogenesis gastrulasi dan gen arsitek homeoboks memungkinkan rekonstruksi organ tubuh manusia secara terarah di laboratorium kedokteran regeneratif."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Embriogenesis Telur Ayam Kampung Melalui Teknik Peneropongan Lilin (Candling)",
            objective = "Melihat secara langsung perkembangan pembuluh darah mesoderm dan detak jantung embrio hidup tanpa memecahkan cangkang telur.",
            materialsNeeded = listOf(
                "3 butir telur ayam kampung fertil yang dierami induk atau inkubator selama 4–6 hari",
                "Lampu senter smartphone berintensitas terang",
                "Corong karton hitam kecil penutup lampu senter",
                "Ruangan gelap gulita"
            ),
            steps = listOf(
                "Masuk ke dalam ruangan yang gelap gulita.",
                "Posisikan lampu senter smartphone menghadap ke atas, tutup dengan corong karton hitam yang memiliki lubang seukuran telur.",
                "Letakkan ujung tumpul telur ayam fertil tepat di atas lubang cahaya senter.",
                "Amati cahaya yang menembus cangkang telur transparan: Pada hari ke-4 hingga ke-5 pengeraman, Anda akan melihat pemandangan menakjubkan layaknya jaring laba-laba merah di dalam telur!",
                "Perhatikan dengan seksama di tengah jaringan pembuluh darah merah: tampak bintik gelap kecil yang berdenyut ritmis tanpa henti! Bintik tersebut adalah jantung embrio awal (berasal dari lapisan mesoderm) yang sudah aktif memompa darah merah sejak hari ke-3!",
                "Amati pula rongga kantung udara (air cell) di ujung tumpul telur.",
                "Kembalikan telur segera ke inkubator/induknya agar suhunya tetap hangat 38°C.",
                "Simpulkan: Anda baru saja menyaksikan proses nyata embriogenesis pembentukan organ awal makhluk hidup vertebrata!"
            ),
            safetyNotes = listOf(
                "Lakukan peneropongan secara cepat (kurang dari 2 menit) agar telur tidak kedinginan.",
                "Pegang telur dengan hati-hati agar tidak jatuh dan pecah."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-dev-hox-1",
                prompt = "Lapisan germinal embrionik manakah yang terbentuk pada fase Gastrulasi yang kelak akan berdiferensiasi membentuk seluruh sistem saraf pusat (otak dan medula spinalis) serta lapisan epidermis kulit luar tubuh manusia?",
                type = "multiple_choice",
                options = listOf(
                    "Ektoderm",
                    "Mesoderm",
                    "Endoderm",
                    "Kantung Kuning Telur (Yolk sac)"
                ),
                correctAnswer = "Ektoderm",
                hints = listOf(
                    "Ekto = luar; Meso = tengah; Endo = dalam.",
                    "Sistem saraf dan otak berkembang dari bumbung saraf (neural tube) yang melipat dari lapisan paling luar."
                ),
                explanation = "Lapisan Ektoderm adalah lapisan germinal paling luar dari tiga lapisan yang dibentuk saat proses gastrulasi. Selama proses neurulasi berikutnya, bagian dorsal ektoderm melipat membentuk lempeng saraf dan bumbung saraf (neural tube) yang berkembang menjadi otak dan medula spinalis (sistem saraf pusat), sedangkan bagian ektoderm sisanya membentuk epidermis kulit luar, kuku, rambut, dan lensa mata. Sebaliknya, Mesoderm membentuk otot, tulang, dan darah; Endoderm membentuk saluran pencernaan dan organ pernapasan.",
                misconception = "Mengira sistem saraf berasal dari lapisan tengah mesoderm karena letak anatomi otak berada di dalam tengkorak."
            ),
            QuizQuestion(
                id = "q-dev-hox-2",
                prompt = "Fenomena biologis apakah yang ditunjukkan oleh mutasi gen homeotik Antennapedia pada lalat buah Drosophila melanogaster, di mana sepasang kaki berjalan sempurna tumbuh di kepalanya menggantikan antena?",
                type = "multiple_choice",
                options = listOf(
                    "Mutasi homeotik yang mengubah identitas segmen perkembangan suatu wilayah anatomi tubuh menjadi identitas segmen tubuh lainnya secara utuh",
                    "Infeksi bakteri yang menyebabkan pembengkakan jaringan",
                    "Lalat tersebut mengalami patah tulang antena",
                    "Keracunan zat kimia insektisida organofosfat"
                ),
                correctAnswer = "Mutasi homeotik yang mengubah identitas segmen perkembangan suatu wilayah anatomi tubuh menjadi identitas segmen tubuh lainnya secara utuh",
                hints = listOf(
                    "Gen Hox berfungsi sebagai manajer identitas regional segmen tubuh.",
                    "Mutasi 'homeotik' adalah transformasi satu struktur tubuh menjadi struktur tubuh lain."
                ),
                explanation = "Mutasi Antennapedia adalah contoh klasik dari Mutasi Homeotik pada klaster gen Hox. Gen *Antennapedia* normalnya bertugas menetapkan identitas segmen toraks (dada) tempat tumbuhnya kaki berjalan. Akibat mutasi penataan ulang promotor regulatoris, gen *Antennapedia* diekspresikan secara keliru di sel-sel cakram imajinal kepala (ekspresi ektopik). Karena sel-sel kepala menerima sinyal identitas toraks, seluruh program genetik hilir pembangun kaki diaktifkan di lokasi tersebut, menghasilkan sepasang kaki berjalan lengkap yang tumbuh di kepala menggantikan antena.",
                misconception = "Mengira mutasi ini terjadi karena gen pembangun antena rusak (gen antenanya normal, tetapi programnya digantikan total oleh program pembangun kaki akibat kesalahan gen pengatur Hox)."
            )
        )
    )

    private fun getEkoDinamikaLotkaVolterraLesson(): LessonData = LessonData(
        conceptId = "bio-eko-dinamika-lotka-volterra",
        storyPanels = listOf(
            StoryPanel(
                id = "p-lotka-volterra-1",
                panelNumber = 1,
                title = "Fluktuasi Siklik Serigala dan Rusa",
                caption = "Dimas menganalisis data sensus populasi satwa liar selama 60 tahun di Pulau Isle Royale: Populasi rusa kutub melonjak, lalu diikuti ledakan populasi serigala beberapa tahun kemudian. Begitu rusa habis, serigala kelaparan dan anjlok drastis, memicu populasi rusa melonjak kembali!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kenapa populasi predator dan mangsa tidak pernah menetap pada satu angka konstan yang tenang, melainkan berosilasi naik turun terus menerus dalam siklus berulang?"
            ),
            StoryPanel(
                id = "p-lotka-volterra-2",
                panelNumber = 2,
                title = "Persamaan Matematika Lotka-Volterra",
                caption = "Kakek menuliskan sistem persamaan diferensial non-linear Alfred Lotka dan Vito Volterra (1925).",
                dialogueSpeaker = "Kakek",
                dialogueText = "Laju pertumbuhan mangsa dN/dt = r N - a N P dan predator dP/dt = b a N P - m P, Dimas! Pertumbuhan mangsa dihambat oleh laju pemangsaan, sedangkan kelangsungan hidup predator bergantung pada biomassa mangsa yang dimakan! Solusinya membentuk kurva orbit tertutup di ruang fase!"
            ),
            StoryPanel(
                id = "p-lotka-volterra-3",
                panelNumber = 3,
                title = "Spesies Kunci & Kaskade Trofik Robert Paine",
                caption = "Kirana memaparkan eksperimen klasik Robert Paine menyingkirkan bintang laut Pisaster dari pantai pasang surut.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Ketika bintang laut predator disingkirkan, kerang remis monopoli berkembang liar dan menyingkirkan semua spesies lain hingga keanekaragaman anjlok dari 15 menjadi 1 spesies! Bintang laut adalah Spesies Kunci (Keystone Species) yang mengontrol komunitas dari atas ke bawah (Top-Down Control)!"
            )
        ),
        intuition = "Dinamika populasi dalam komunitas ekologi diatur oleh interaksi biotik antar-spesies. Model Klasik Predator-Mangsa Lotka-Volterra menggunakan sistem persamaan diferensial non-linear berpasangan untuk memodelkan interaksi trofik: Populasi Mangsa N tumbuh secara eksponensial tanpa predator dan berkurang sebanding dengan laju pertemuan pemangsaan (a N P); Populasi Predator P mati secara alami dengan laju kematian m dan bertambah dari efisiensi konversi mangsa yang dimakan (b a N P). Solusi model ini menghasilkan osilasi periodik tertutup di ruang fase (phase plane) dengan pergeseran fase (fase puncak predator tertinggal 1/4 siklus di belakang fase puncak mangsa). Dalam struktur komunitas, beberapa predator bertindak sebagai Spesies Kunci (Keystone Species) yang memiliki pengaruh ekologis raksasa yang tidak sebanding dengan kelimpahan biomassanya. Menghilangkan predator kunci memicu Kaskade Trofik (Trophic Cascade) top-down yang meruntuhkan keanekaragaman ekosistem.",
        intuitionPoints = listOf(
            "Persamaan Mangsa: dN/dt = r N - a N P, di mana r adalah laju pertumbuhan intrinsik mangsa dan a adalah koefisien efisiensi penyerangan predator.",
            "Persamaan Predator: dP/dt = (b a N) P - m P, di mana b adalah efisiensi konversi mangsa menjadi keturunan predator dan m adalah laju mortalitas alami predator.",
            "Titik Isoklin Ekuilibrium: Mangsa seimbang (dN/dt = 0) saat P* = r / a; Predator seimbang (dP/dt = 0) saat N* = m / (b a).",
            "Kaskade Trofik (Trophic Cascade): efek domino tidak langsung yang merambat ke bawah melintasi berbagai tingkatan trofik akibat perubahan populasi predator puncak (apex predator) (contoh: reintroduksi serigala di Taman Nasional Yellowstone mengurangi populasi rusa, memulihkan kanopi pohon aspen, dan menstabilkan erosi tepi sungai).",
            "Biomagnifikasi: akumulasi dan peningkatan konsentrasi polutan toksik non-biodegradabel yang larut lemak (seperti merkuri atau insektisida DDT) pada setiap tingkatan trofik rantai makanan hingga mencapai kadar mematikan di predator puncak."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Model Persamaan Diferensial Predator-Mangsa Lotka-Volterra",
                latexFormula = "\\frac{dN}{dt} = r N - a N P \\quad ; \\quad \\frac{dP}{dt} = b a N P - m P",
                description = "Sistem persamaan diferensial non-linear pemodelan interaksi trofik predator (P) dan mangsa (N).",
                variableMeanings = mapOf(
                    "N" to "Populasi mangsa (Prey)",
                    "P" to "Populasi pemangsa (Predator)",
                    "r" to "Laju pertumbuhan intrinsik mangsa",
                    "a" to "Laju penyerangan / efisiensi predasi",
                    "b" to "Efisiensi konversi energi mangsa menjadi kelahiran predator",
                    "m" to "Laju kematian alami predator"
                )
            ),
            FormulaCard(
                title = "Kondisi Ekuilibrium Isoklin Nol (Zero-Isoclines)",
                latexFormula = "N^* = \\frac{m}{b a} \\quad ; \\quad P^* = \\frac{r}{a}",
                description = "Kepadatan populasi mangsa N* dan predator P* pada titik pusat ekuilibrium stabil marginal.",
                variableMeanings = mapOf(
                    "N^*" to "Jumlah mangsa minimum yang dibutuhkan untuk menopang populasi predator",
                    "P^*" to "Jumlah predator maksimum yang dapat ditoleransi populasi mangsa"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Dinamika Populasi Predator Harimau Sumatera di Taman Nasional Bukit Barisan Selatan",
            industry = "Ekologi Satwa Liar, Biologi Populasi & Konservasi Karnivora Puncak",
            context = "Taman Nasional Bukit Barisan Selatan (TNBBS) di Lampung dan Bengkulu memantau populasi Harimau Sumatera (*Panthera tigris sumatrae*) yang terancam punah menggunakan kamera jebak (camera traps).",
            problem = "Perburuan liar terhadap mangsa utama harimau (babi hutan *Sus scrofa* dan rusa sambar *Rusa unicolor*) menyebabkan kelaparan predator dan meningkatnya konflik harimau masuk ke perkebunan warga.",
            solution = "Peneliti ekologi memodelkan daya dukung harimau menggunakan persamaan Lotka-Volterra dengan kapasitas tampung mangsa logistik: dN/dt = r N (1 - N/K) - a N P. Simulasi mengungkap bahwa jika biomassa mangsa ungulata turun di bawah ambang batas kritis N* = 120 individu per 100 km², populasi harimau akan mengalami keruntuhan eksponensial (dP/dt < 0) dalam waktu kurang dari 8 tahun. Berdasarkan hasil pemodelan ini, balai taman nasional dan aparat penegak hukum memfokuskan patroli SMART (Spatial Monitoring and Reporting Tool) untuk memberantas jerat pemburu babi hutan dan rusa, berhasil memulihkan populasi mangsa dan menjaga kestabilan populasi harimau pada 1.8 individu per 100 km² tanpa insiden konflik warga.",
            lessonsLearned = "Dinamika matematika predator-mangsa membuktikan bahwa menyelamatkan karnivora puncak mustahil dilakukan tanpa melindungi kelimpahan biomassa mangsa dasarnya di ekosistem."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Diskrit Siklus Fluktuasi Predator-Mangsa Menggunakan Biji Kacang dan Gelas",
            objective = "Melihat secara langsung munculnya gelombang osilasi naik-turun berkala populasi predator dan mangsa dalam model diskrit sederhana.",
            materialsNeeded = listOf(
                "100 butir biji kacang hijau / beras (sebagai populasi Mangsa N)",
                "10 buah koin logam / kelereng (sebagai populasi Predator P)",
                "1 lembar nampan beralas kertas",
                "Kertas grafik untuk mencatat populasi per generasi ronde"
            ),
            steps = listOf(
                "Ronde 1 (Kondisi Awal): Tebarkan 20 butir kacang di nampan (N = 20). Masukkan 2 koin predator (P = 2).",
                "Aturan Berburu: Lempar 1 koin predator ke nampan dari ketinggian 10 cm. Ambil semua kacang yang tertindih/tersentuh koin (setiap 3 kacang yang dimakan menghasilkan 1 kelahiran koin predator baru; jika predator makan kurang dari 2 kacang, predator tersebut mati kelaparan!).",
                "Aturan Reproduksi Mangsa: Sisa kacang yang selamat menggandakan diri (setiap 1 kacang selamat bertambah 1 kacang baru, maksimal kapasitas 60 kacang).",
                "Catat jumlah N (mangsa) dan P (predator) pada kertas tabel.",
                "Ulangi aturan yang sama selama 10 ronde berturut-turut.",
                "Plot grafik jumlah N dan P terhadap waktu ronde: Amati kurva yang terbentuk! Anda akan melihat kurva berosilasi naik turun periodik di mana lonjakan populasi mangsa selalu disusul oleh lonjakan predator, persis seperti kurva matematis Lotka-Volterra!",
                "Simpulkan: Keterkaitan rantai trofik secara alami menciptakan dinamika osilasi periodik dalam ekosistem."
            ),
            safetyNotes = listOf(
                "Aktivitas aman dan menggunakan bahan dapur/alat tulis."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-lotka-volterra-1",
                prompt = "Berdasarkan persamaan model mangsa Lotka-Volterra dN/dt = r N - a N P, berapakah jumlah populasi predator (P*) yang tepat menjaga laju pertumbuhan populasi mangsa pada titik ekuilibrium konstan (dN/dt = 0)?",
                type = "multiple_choice",
                options = listOf(
                    "P* = r / a",
                    "P* = 0 (tanpa predator)",
                    "P* = a / r",
                    "P* = r · a · N"
                ),
                correctAnswer = "P* = r / a",
                hints = listOf(
                    "Atur dN/dt = 0.",
                    "r N - a N P = 0 <=> N (r - a P) = 0.",
                    "Untuk populasi mangsa N ≠ 0, maka r - a P = 0 <=> a P = r.",
                    "P = ...?"
                ),
                explanation = "Untuk mencari isoklin nol populasi mangsa, kita menetapkan dN/dt = 0: r N - a N P = 0 <=> N (r - a P) = 0. Dengan asumsi populasi mangsa hidup (N ≠ 0), maka persamaan mensyaratkan r - a P = 0, yang menghasilkan kepadatan predator ekuilibrium P* = r / a. Jika jumlah predator tepat sama dengan r / a, laju kelahiran mangsa diimbangi persis oleh laju pemangsaan, sehingga jumlah mangsa stabil tidak bertambah dan tidak berkurang.",
                misconception = "Mengira jumlah predator ekuilibrium bergantung pada jumlah mangsa N (pada model Lotka-Volterra klasik, P* murni ditentukan oleh rasio laju pertumbuhan intrinsik mangsa r terhadap efisiensi predasi a)."
            ),
            QuizQuestion(
                id = "q-lotka-volterra-2",
                prompt = "Apakah definisi ekologis yang tepat dari 'Spesies Kunci' (Keystone Species) dalam suatu komunitas ekosistem?",
                type = "multiple_choice",
                options = listOf(
                    "Spesies yang memiliki pengaruh kontrol ekologis sangat besar terhadap struktur dan keanekaragaman komunitas, di mana pengaruhnya jauh melampaui kelimpahan biomassa populasinya yang relatif sedikit",
                    "Spesies yang memiliki populasi paling banyak dan biomassa paling besar di dalam hutan",
                    "Spesies tumbuhan penghasil kayu yang paling keras",
                    "Spesies hewan yang hanya memakan tumbuhan rumput"
                ),
                correctAnswer = "Spesies yang memiliki pengaruh kontrol ekologis sangat besar terhadap struktur dan keanekaragaman komunitas, di mana pengaruhnya jauh melampaui kelimpahan biomassa populasinya yang relatif sedikit",
                hints = listOf(
                    "Contoh klasik: Bintang laut Pisaster pada zona pasang surut karya Robert Paine, atau Berang-berang laut di hutan kelp.",
                    "Kelimpahannya sedikit, namun jika disingkirkan seluruh ekosistem akan runtuh."
                ),
                explanation = "Konsep Spesies Kunci (Keystone Species) yang diajukan oleh Robert Paine merujuk pada spesies yang memainkan peranan vital yang sangat menentukan kelangsungan struktur dan keanekaragaman komunitas ekosistem, di mana dampak pengaruhnya jauh melampaui kelimpahan fisik atau proporsi biomassanya yang seringkali relatif sedikit. Jika spesies kunci disingkirkan, terjadi efek kaskade trofik yang drastis, seringkali menyebabkan hilangnya banyak spesies lain dan perubahan total pada arsitektur ekosistem.",
                misconception = "Menyamakan spesies kunci dengan spesies dominan (spesies dominan berpengaruh besar karena jumlah individunya paling melimpah, sedangkan spesies kunci berpengaruh besar meskipun jumlah individunya sedikit)."
            )
        )
    )

    private fun getKonservasiFragmentasiPvaLesson(): LessonData = LessonData(
        conceptId = "bio-konservasi-fragmentasi-pva",
        storyPanels = listOf(
            StoryPanel(
                id = "p-konservasi-pva-1",
                panelNumber = 1,
                title = "Hutan yang Terbelah Menjadi Pulau-Pulau",
                caption = "Dimas mengamati citra satelit deforestasi hutan tropis: Pembangunan jalan raya dan perkebunan membelah bentang hutan utuh menjadi pulau-pulau hutan kecil yang terisolasi.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Meskipun total luas hutan yang tersisa masih 10.000 hektar, mengapa satwa langka seperti Orangutan dan Gajah tetap punah jika hutannya terbelah-belah menjadi petak-petak kecil?"
            ),
            StoryPanel(
                id = "p-konservasi-pva-2",
                panelNumber = 2,
                title = "Efek Tepi & Ukuran Populasi Efektif (Ne)",
                caption = "Kakek menjelaskan dinamika Efek Tepi (Edge Effects) dan Ukuran Populasi Efektif Ne.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Tepi fragmen hutan mengalami penetrasi angin kencang, kekeringan, dan perburuan liar hingga ratusan meter ke dalam! Dan satwa yang terisolasi dalam kelompok kecil mengalami perkawinan sedarah (inbreeding depression) karena ukuran populasi efektif Ne anjlok drastis!"
            ),
            StoryPanel(
                id = "p-konservasi-pva-3",
                panelNumber = 3,
                title = "Analisis Kelangsungan Hidup Populasi (PVA)",
                caption = "Kirana memaparkan model simulasi stokastik Population Viability Analysis (PVA) status keterancaman IUCN.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dengan memasukkan stokastisitas demografi dan ancaman bencana alam, simulasi PVA memprediksi probabilitas kepunahan suatu spesies dalam 100 tahun ke depan, menjadi acuan penetapan status Kritis (Critically Endangered) IUCN Red List!"
            )
        ),
        intuition = "Biologi Konservasi adalah disiplin sains terapan berbasis krisis yang bertujuan melestarikan keanekaragaman hayati dan proses evolusioner alam. Fragmentasi habitat membagi habitat luas kontinu menjadi petak-petak pulau kecil terisolasi, meningkatkan rasio batas keliling terhadap luas area dan memicu Efek Tepi (Edge Effects: perubahan mikroklimat lebih panas/kering, invasi spesies asing, dan kerentanan perburuan yang menembus ratusan meter ke interior hutan). Isolasi populasi kecil memicu Pusaran Kepunahan (Extinction Vortex) akibat hilangnya keragaman genetik dan Depresi Perkawinan Sedarah (Inbreeding Depression). Ukuran Populasi Efektif (Ne) mengukur jumlah individu ideal yang menyumbangkan materi genetik ke generasi berikutnya. Population Viability Analysis (PVA) adalah pemodelan komputer kuantitatif stokastik yang memproyeksikan lintasan populasi di bawah pengaruh stokastisitas demografis, variabilitas lingkungan acak, dan bencana katastropik untuk menghitung Populasi Minimum yang Layak Hidup (Minimum Viable Population / MVP) guna memenuhi kriteria Kategori Keterancaman IUCN Red List.",
        intuitionPoints = listOf(
            "Efek Tepi (Edge Effects): degradasi kualitas fisik dan biotik habitat di sepanjang batas tepi fragmen; luas interior habitat sejati (core habitat) menyusut jauh lebih cepat daripada penyusutan total luas tutupan hutan.",
            "Ukuran Populasi Efektif Ne: untuk rasio jenis kelamin jantan (N_m) dan betina (N_f) yang tidak seimbang: Ne = (4 N_m N_f) / (N_m + N_f). Jika jantan hanya ada sedikit (misal 1 jantan dan 99 betina), Ne anjlok mendekati hanya 4 individu!",
            "Aturan Praktis Franklin 50/500: Ne >= 50 dibutuhkan untuk mencegah depresi inbreeding jangka pendek; Ne >= 500 dibutuhkan untuk mempertahankan potensi variasi genetik evolusioner jangka panjang.",
            "Koridor Satwa Liar (Wildlife Corridors): jalur vegetasi penghubung antar-fragmen yang memulihkan aliran gen (gene flow), migrasi, dan mengubah metapopulasi terisolasi menjadi populasi lestari.",
            "Kriteria Keterancaman IUCN Red List: Kritis (Critically Endangered / CR, risiko kepunahan >= 50% dalam 10 tahun atau 3 generasi); Genting (Endangered / EN, risiko >= 20% dalam 20 tahun); Rentan (Vulnerable / VU, risiko >= 10% dalam 100 tahun)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Ukuran Populasi Genetik Efektif (Ne) Rasio Kelamin Tak Seimbang",
                latexFormula = "N_e = \\frac{4 N_m N_f}{N_m + N_f}",
                description = "Menghitung ukuran populasi efektif genetik aktual dari jumlah jantan kawin (Nm) dan betina kawin (Nf).",
                variableMeanings = mapOf(
                    "N_e" to "Ukuran populasi efektif (Effective Population Size)",
                    "N_m" to "Jumlah individu jantan yang bereproduksi",
                    "N_f" to "Jumlah individu betina yang bereproduksi"
                )
            ),
            FormulaCard(
                title = "Laju Kehilangan Heterozigositas Genetik per Generasi",
                latexFormula = "\\Delta H = \\frac{1}{2 N_e} \\quad ; \\quad H_t = H_0 \\left(1 - \\frac{1}{2 N_e}\\right)^t",
                description = "Erosi variasi genetik akibat hanyutan genetik (drift) dan inbreeding pada populasi berukuran Ne setelah t generasi.",
                variableMeanings = mapOf(
                    "H_t" to "Heterozigositas genetik pada generasi ke-t",
                    "H_0" to "Heterozigositas awal populasi",
                    "t" to "Jumlah generasi"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Analisis Kelangsungan Hidup (PVA) Badak Jawa di Semenanjung Ujung Kulon",
            industry = "Biologi Konservasi Spesies Kritis & Manajemen Suaka Margasatwa",
            context = "Semenanjung Taman Nasional Ujung Kulon di Banten adalah benteng pertahanan terakhir di muka bumi bagi populasi Badak Jawa (*Rhinoceros sondaicus*) yang tersisa sekitar 75–80 individu.",
            problem = "Seluruh populasi dunia terkonsentrasi di satu semenanjung tunggal yang rawan terdampak tsunami letusan Gunung Anak Krakatau dan penyakit menular ternak. Berapakah risiko kepunahan populasi ini jika tidak segera dibangun habitat kedua (second habitat)?",
            solution = "Konsorsium peneliti konservasi BRIN dan WWF memodelkan populasi Badak Jawa menggunakan simulasi stokastik PVA perangkat lunak VORTEX selama proyeksi 100 tahun. Data demografi riil (kelahiran 4 anak/tahun, mortalitas 2 dewasa/tahun, Ne ≈ 40) dikombinasikan dengan probabilitas katastropik tsunami Krakatau (peluang 1.5% per tahun). Hasil simulasi PVA menunjukkan bahwa meskipun populasi saat ini tampak stabil bertambah perlahan, risiko kepunahan katastropik dalam 100 tahun mencapai 42% jika hanya berada di satu lokasi semenanjung! Sebaliknya, jika 10 individu badak ditranslokasikan untuk membentuk populasi kedua (second population) di suaka margasatwa lain, risiko kepunahan anjlok menjadi kurang dari 1.5%. Data empiris PVA ini mendasari keputusan strategis pembentukan Suaka Badak Jawa kedua di Sumatera.",
            lessonsLearned = "Analisis kelangsungan populasi (PVA) memberikan bukti kuantitatif ilmiah yang memaksa pembuat kebijakan mengambil tindakan penyelamatan spesies sebelum terlambat."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Pengaruh Efek Tepi (Edge Effects) pada Mikroklimat Tanah",
            objective = "Mengukur secara langsung bagaimana perubahan kondisi lingkungan tepi vegetasi menembus ke dalam area terlindung.",
            materialsNeeded = listOf(
                "1 buah termometer ruangan digital atau termometer tanah",
                "Pita ukur meteran gulung 10 meter",
                "Taman kota atau pekarangan rumah yang memiliki kanopi rumpun pohon lebat berbatasan langsung dengan lapangan rumput terbuka beraspal"
            ),
            steps = listOf(
                "Pilih batas tepi antara area terbuka terik matahari dan area di bawah kanopi rindang pepohonan lebat.",
                "Tentukan 4 titik ukur: Titik 1 (Area terbuka 5 meter dari tepi pohon); Titik 2 (Tepat di batas tepi tajuk kanopi pohon 0 meter); Titik 3 (Masuk 3 meter ke dalam naungan pohon); Titik 4 (Masuk 10 meter ke bagian tengah interior hutan/rumpun pohon).",
                "Pada siang hari terik (pukul 12.00–13.00), ukur suhu udara setinggi 10 cm dari permukaan tanah di keempat titik tersebut.",
                "Amati perbedaannya: Anda akan melihat penurunan suhu bertahap dari Titik 1 (misal 35°C), Titik 2 tepi (32°C), Titik 3 (29°C), hingga Titik 4 interior (26°C lebih sejuk dan lembab)!",
                "Amati juga kelembapan tanah dan jenis tanaman herba: tanaman herba hutan hanya mampu bertahan hidup di Titik 4 interior di mana efek tepi terik matahari tidak lagi menembus!",
                "Simpulkan: Fragmentasi hutan memotong habitat interior sejuk dan menggantikannya dengan kondisi tepi yang kering dan panas, mengusir satwa dan flora spesialis hutan dalam!"
            ),
            safetyNotes = listOf(
                "Gunakan topi pelindung dari sinar matahari saat mengukur di area terbuka."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-konservasi-pva-1",
                prompt = "Di sebuah suaka margasatwa yang terisolasi, populasi harimau yang tersisa terdiri dari 2 ekor jantan dewasa yang kawin (N_m = 2) dan 18 ekor betina dewasa (N_f = 18). Berapakah Ukuran Populasi Genetik Efektif (N_e) dari kawanan harimau tersebut?",
                type = "numeric",
                correctAnswer = "7.2",
                tolerance = 0.1f,
                unit = "individu",
                hints = listOf(
                    "Gunakan rumus N_e = (4 · N_m · N_f) / (N_m + N_f).",
                    "N_m = 2, N_f = 18.",
                    "Pembilang: 4 · 2 · 18 = 144.",
                    "Penyebut: 2 + 18 = 20.",
                    "N_e = 144 / 20 = ...?"
                ),
                explanation = "Berdasarkan rumus ukuran populasi efektif akibat ketidakseimbangan rasio kelamin: N_e = (4 · N_m · N_f) / (N_m + N_f) = (4 · 2 · 18) / (2 + 18) = 144 / 20 = 7.2 individu. Meskipun jumlah total sensus fisik harimau adalah 20 ekor, secara genetik populasi tersebut berperilaku rapuh layaknya populasi yang hanya beranggotakan 7 ekor saja, menyebabkan laju perkawinan sedarah dan erosi variasi genetik terjadi dengan sangat cepat.",
                misconception = "Mengira ukuran populasi efektif sama dengan jumlah total sensus fisik (2 + 18 = 20 ekor)."
            ),
            QuizQuestion(
                id = "q-konservasi-pva-2",
                prompt = "Berdasarkan kriteria evaluasi status keterancaman IUCN Red List (Kategori Kritis / Critically Endangered), berapakah ambang batas probabilitas kepunahan yang dihitung melalui pemodelan Population Viability Analysis (PVA) dalam jangka waktu 10 tahun atau 3 generasi?",
                type = "multiple_choice",
                options = listOf(
                    "Probabilitas kepunahan di alam liar minimal 50% dalam 10 tahun atau 3 generasi",
                    "Probabilitas kepunahan minimal 5% dalam 100 tahun",
                    "Probabilitas kepunahan 100% dalam waktu 24 jam",
                    "Tidak ada kriteria probabilitas kuantitatif dalam status IUCN"
                ),
                correctAnswer = "Probabilitas kepunahan di alam liar minimal 50% dalam 10 tahun atau 3 generasi",
                hints = listOf(
                    "Kategori Kritis (CR) adalah status keterancaman tertinggi sebelum dinyatakan punah di alam liar (EW/EX).",
                    "Kriteria E kuantitatif IUCN mensyaratkan risiko kepunahan >= 50% dalam 10 tahun atau 3 generasi."
                ),
                explanation = "Berdasarkan Kriteria E (Analisis Kuantitatif Risiko Kepunahan) dari pedoman resmi IUCN Red List Categories and Criteria, suatu takson diklasifikasikan berstatus Kritis (Critically Endangered / CR) jika analisis kuantitatif (seperti PVA) menunjukkan bahwa probabilitas kepunahan spesies tersebut di alam liar mencapai minimal 50% dalam kurun waktu 10 tahun atau 3 generasi (mana yang lebih lama, hingga maksimum 100 tahun). Status Genting (Endangered) mensyaratkan risiko minimal 20% dalam 20 tahun, dan Rentan (Vulnerable) mensyaratkan minimal 10% dalam 100 tahun.",
                misconception = "Mengira penetapan status IUCN hanya didasarkan pada perkiraan kualitatif tanpa angka probabilitas matematis kuantitatif yang ketat."
            )
        )
    )

    private fun getBotaniFisiologiStomataAbaLesson(): LessonData = LessonData(
        conceptId = "bio-botani-fisiologi-stomata-aba",
        storyPanels = listOf(
            StoryPanel(
                id = "p-stomata-aba-1",
                panelNumber = 1,
                title = "Katup Pengatur Kehidupan Tumbuhan",
                caption = "Dimas mengamati sebatang pohon beringin di siang hari terik: Pohon membutuhkan stomata terbuka untuk menyerap gas CO₂ fotosintesis, namun stomata terbuka membuat pohon kehilangan ratusan liter air per hari lewat transpirasi.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana daun mengatur katup stomata agar bisa menyerap karbon dioksida tanpa mati kekeringan kehabisan air saat musim kemarau?"
            ),
            StoryPanel(
                id = "p-stomata-aba-2",
                panelNumber = 2,
                title = "Tekanan Turgor & Pompa Proton H+-ATPase",
                caption = "Kakek menjelaskan fisiologi sel penjaga (guard cells) stomata dan potensial air.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Pembukaan stomata diatur oleh tekanan turgor, Dimas! Di pagi hari, cahaya biru mengaktifkan pompa proton H⁺-ATPase, menyedot ion Kalium (K⁺) dan Klorida (Cl⁻) masuk ke sel penjaga. Potensial solut anjlok, air masuk secara osmotik, dan sel penjaga membengkak melengkung membuka celah stomata!"
            ),
            StoryPanel(
                id = "p-stomata-aba-3",
                panelNumber = 3,
                title = "Hormon Darurat Kekeringan: Asam Absisat (ABA)",
                caption = "Kirana memaparkan kaskade penutupan stomata oleh hormon asam absisat (ABA).",
                dialogueSpeaker = "Kirana",
                dialogueText = "Saat tanah mengering, akar mengirim sinyal hormon Asam Absisat (ABA) ke daun! ABA mengikat reseptor PYR/RCAR, membuka kanal anion SLAC1 dan membuang ion K⁺ keluar. Sel penjaga mengempis dan stomata tertutup rapat dalam waktu 5 menit untuk menyelamatkan tanaman dari kematian!"
            )
        ),
        intuition = "Stomata adalah pori mikroskopis pada epidermis daun yang dikelilingi oleh sepasang sel penjaga (guard cells) khusus yang mengatur pertukaran gas fotosintesis (asimilasi CO2) dan transpirasi air. Pembukaan dan penutupan stomata dikendalikan oleh perubahan tekanan turgor osmotik sel penjaga (potensial air Psi_w = Psi_s + Psi_p). Mekanisme pembukaan stomata (dirangsang oleh cahaya matahari): Pompa proton H+-ATPase membran plasma aktif memompa ion H+ keluar sel -> membran terhiperpolarisasi (-120 mV) -> membuka kanal masuk Kalium ke dalam sel (KAT1) dan penumpukan ion Cl- serta malat²⁻ -> potensial solut Psi_s turun drastis -> air masuk secara osmotik menuruni gradien potensial air -> sel penjaga membengkak turgid. Karena dinding sel bagian dalam lebih tebal dan diperkuat oleh mikrofibril selulosa radial, pembengkakan memaksa sel melengkung keluar, membuka celah stomata. Sebaliknya, saat cekaman kekeringan, hormon Asam Absisat (ABA) memicu kaskade pembuangan ion ionik (efflux K+ dan Cl- via kanal anion lambat SLAC1), menyebabkan sel penjaga kehilangan air dan mengempis flaksid, menutup celah stomata seketika.",
        intuitionPoints = listOf(
            "Persamaan Potensial Air Tumbuhan: Psi_w = Psi_s + Psi_p (di mana Psi_s adalah potensial solut/osmotik bernilai negatif, dan Psi_p adalah tekanan turgor fisik bernilai positif). Air selalu mengalir dari potensial air tinggi ke potensial air lebih rendah.",
            "Anatomi Sel Penjaga: mikrofibril selulosa tersusun secara radial (seperti jari-jari roda sepeda) dan dinding sel bagian dalam yang menghadap pori jauh lebih tebal dibanding dinding luar, memastikan turgor menghasilkan pembukaan celah melengkung.",
            "Kaskade Pensinyalan ABA: Cekaman kekeringan -> Sintesis ABA di akar dan daun -> ABA mengikat reseptor PYR/PYL/RCAR -> Inhibisi fosfatase PP2C -> Aktivasi protein kinase SnRK2 -> Fosforilasi kanal anion lambat SLAC1 dan pembukaan kanal Ca²⁺ -> Depolarisasi membran membuka kanal keluar Kalium (GORK) -> Efflux masif ion K⁺ dan Cl⁻ -> Kehilangan turgor osmotik -> Penutupan stomata.",
            "Metabolit Sekunder Pertahanan Tumbuhan: selain adaptasi stomata, tumbuhan mensintesis metabolit sekunder untuk bertahan hidup: Terpenoid (minyak atsiri atsiri pengusir serangga), Fenolik (flavonoid tabir surya UV dan lignin penguat dinding), dan Alkaloid (kafein, nikotin, morfin racun saraf herbivora).",
            "Adaptasi Fotosintesis CAM (Crassulacean Acid Metabolism): tumbuhan gurun (seperti kaktus dan nanas) membuka stomata HANYA di malam hari untuk mengikat CO₂ menjadi asam malat di vakuola, dan menutup stomata rapat-rapat sepanjang siang hari yang terik untuk mencegah transpirasi."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Persamaan Potensial Air Sel Tumbuhan",
                latexFormula = "\\Psi_w = \\Psi_s + \\Psi_p \\quad ; \\quad \\Psi_s = -i M R T",
                description = "Potensial air total Psi_w diatur oleh potensial solut osmotik van 't Hoff Psi_s dan tekanan turgor dinding sel Psi_p.",
                variableMeanings = mapOf(
                    "\\Psi_w" to "Potensial air total (MegaPascal / MPa)",
                    "\\Psi_s" to "Potensial solut / osmotik (bernilai <= 0 MPa)",
                    "\\Psi_p" to "Tekanan turgor hidrostatik sel (bernilai >= 0 MPa)",
                    "i, M" to "Faktor ionisasi van 't Hoff dan konsentrasi molar larutan"
                )
            ),
            FormulaCard(
                title = "Kaskade Molekuler Penutupan Stomata oleh ABA",
                latexFormula = "\\text{ABA} + \\text{PYR/RCAR} \\xrightarrow{} \\dashv \\text{PP2C} \\xrightarrow{} \\text{SnRK2 Aktif} \\xrightarrow{} \\text{Aktivasi SLAC1} \\to \\text{Efflux K}^+ \\& \\text{ Cl}^- \\to \\text{Stomata Menutup}",
                description = "Jalur transduksi sinyal hormonal terarah penutupan pori stomata sel penjaga.",
                variableMeanings = mapOf(
                    "PYR/RCAR" to "Reseptor intraseluler asam absisat (ABA)",
                    "PP2C" to "Protein fosfatase 2C (regulator negatif yang diinaktivasi oleh ABA)",
                    "SnRK2" to "Protein kinase kunci aktivator kanal anion",
                    "SLAC1" to "Slow Anion Channel 1 membran plasma sel penjaga"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Seleksi Kerapatan Stomata Kelapa Sawit Toleran El Niño di PPKS Marihat",
            industry = "Agroteknologi Perkebunan Kelapa Sawit & Fisiologi Ketahanan Cekaman",
            context = "Pusat Penelitian Kelapa Sawit (PPKS) Unit Riset Marihat di Pematang Siantar menguji kerentanan tanaman kelapa sawit terhadap fenomena kekeringan berkepanjangan El Niño yang memangkas produksi buah tandan segar hingga 30%.",
            problem = "Varietas sawit komersial biasa lambat merespons cekaman air: stomata tetap terbuka saat kelembapan udara anjlok, menyebabkan daun patah layu (frond fracture) dan gagal menghasilkan tandan bunga betina.",
            solution = "Fisiolog tumbuhan meneliti variabilitas fenotipe stomata pada bibit silangan dura x pisifera menggunakan mikroskopi replika kutikula dan porosimeter stomata. Ditemukan bahwa galur toleran kekeringan (Marihat DxD Seri 3) memiliki kerapatan stomata 25% lebih rendah dan akumulasi hormon ABA daun yang 3 kali lebih responsif terhadap penurunan potensial air tanah. Begitu potensial air tanah turun di bawah -0.5 MPa, kaskade SnRK2-SLAC1 menutup stomata dalam 15 menit, memangkas laju konduktansi stomata dari 0.45 menjadi 0.04 mol/(m²·s), menghemat 60% cadangan air internal batang tanpa merusak jaringan meristem pucuk. Galur ini menjadi varietas unggul tahan kemarau nasional.",
            lessonsLearned = "Fisiologi membran stomata dan jalur biokimia hormon ABA adalah parameter mutlak dalam perancangan tanaman perkebunan adaptif perubahan iklim masa depan."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Stomata dan Plasmolisis Sel Penjaga Daun Rhoeo discolor di Bawah Mikroskop",
            objective = "Melihat secara langsung bentuk anatomis sel penjaga stomata dan fenomena pengempisan turgor (plasmolisis) saat terpapar larutan hipertonik.",
            materialsNeeded = listOf(
                "1 helai daun tanaman Adam Hawa (Rhoeo discolor / Tradescantia spathacea yang memiliki permukaan bawah berwarna ungu pekat)",
                "Mikroskop optik sekolah / mikroskop mini smartphone 60x",
                "Kaca preparat dan kaca penutup",
                "Air murni (larutan hipotonik) dan Larutan garam dapur pekat 10% (larutan hipertonik)",
                "Pipet tetes dan kertas tisu"
            ),
            steps = listOf(
                "Kupas selapis sangat tipis epidermis bawah daun Rhoeo discolor yang berwarna ungu menggunakan kuku atau silet secara hati-hati (harus transparan 1 lapis sel).",
                "Letakkan lapisan epidermis ungu di atas kaca preparat, tetesi 1 tetes air murni, tutup dengan kaca penutup.",
                "Amati di bawah mikroskop perbesaran 100x–400x: Anda akan melihat lapangan sel berpigmen ungu indah diselingi oleh sepasang sel berbentuk ginjal yang tidak berpigmen ungu—itulah Sel Penjaga Stomata dengan kloroplas hijau di dalamnya dan celah stomata yang terbuka turgid!",
                "Sekarang teteskan larutan garam pekat 10% di tepi kaca penutup, serap air di sisi berlawanan menggunakan kertas tisu agar cairan garam masuk menggantikan air.",
                "Amati secara real-time di bawah mikroskop: Keajaiban fisiologi terjadi! Dalam waktu 1–2 menit, air tertarik keluar dari sel menuruni gradien potensial air (plasmolisis osmotik). Sitoplasma sel ungu menciut, sel penjaga kehilangan tekanan turgor, dan celah stomata seketika MENGUNCUP TERTUTUP RAPAT!",
                "Simpulkan: Anda baru saja mengamati secara langsung mekanisme biofisika penutupan stomata berbasis tekanan turgor dan potensial air!"
            ),
            safetyNotes = listOf(
                "Hati-hati saat mengupas epidermis daun, gunakan silet dengan pengawasan orang dewasa jika perlu.",
                "Bahan daun dan garam dapur sepenuhnya aman dan non-toksik."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-stomata-aba-1",
                prompt = "Berdasarkan fisiologi membran sel tumbuhan, peristiwa ionik manakah yang secara langsung memicu PEMBUKAAN celah stomata pada pagi hari saat terkena paparan cahaya matahari?",
                type = "multiple_choice",
                options = listOf(
                    "Aktivasi pompa proton H⁺-ATPase membran plasma yang memompa ion H⁺ keluar, memicu hiperpolarisasi membran yang membuka kanal masuk kation Kalium (K⁺) dan anion Cl⁻ ke dalam sel penjaga, menurunkan potensial solut sehingga air masuk secara osmotik membengkakkan sel penjaga",
                    "Pelepasan seluruh air dari sel penjaga keluar daun",
                    "Pecahnya dinding selulosa sel penjaga",
                    "Pembentukan kristal garam padat di celah stomata"
                ),
                correctAnswer = "Aktivasi pompa proton H⁺-ATPase membran plasma yang memompa ion H⁺ keluar, memicu hiperpolarisasi membran yang membuka kanal masuk kation Kalium (K⁺) dan anion Cl⁻ ke dalam sel penjaga, menurunkan potensial solut sehingga air masuk secara osmotik membengkakkan sel penjaga",
                hints = listOf(
                    "Stomata membuka saat sel penjaga membengkak turgid (air masuk).",
                    "Air masuk karena potensial solut Psi_s turun (konsentrasi ion di dalam sel meningkat).",
                    "Ion Kalium (K⁺) adalah osmolit utama yang disedot masuk ke dalam sel penjaga."
                ),
                explanation = "Pembukaan stomata di pagi hari diawali oleh penyerapan cahaya biru oleh fotoreseptor fototropin yang mengaktifkan pompa proton H⁺-ATPase pada membran plasma sel penjaga. Pemompaan proton H⁺ keluar sel menciptakan gradien elektrokimiawi hiperpolarisasi membran (-120 hingga -140 mV). Potensial negatif ini memicu pembukaan kanal masuk Kalium teraktivasi voltase (KAT1), menyedot kation K⁺ dan anion Cl⁻/malat²⁻ dalam jumlah masif ke dalam vakuola sel penjaga. Penumpukan ion ini menurunkan potensial solut (Psi_s sangat negatif), memaksa air dari sel tetangga masuk secara osmotik menuruni gradien potensial air, membengkakkan sel penjaga menjadi turgid melengkung dan membuka celah stomata.",
                misconception = "Mengira stomata membuka karena air menguap keluar (penguapan air justru membuat sel flaksid dan menutup stomata)."
            ),
            QuizQuestion(
                id = "q-stomata-aba-2",
                prompt = "Ketika tanaman mengalami cekaman kekeringan di musim kemarau, hormon Asam Absisat (ABA) mengikat reseptor PYR/RCAR di sel penjaga. Apakah aksi fisiologis hilir dari kaskade kinase SnRK2 yang menyebabkan PENUTUPAN stomata secara cepat?",
                type = "multiple_choice",
                options = listOf(
                    "Mengaktivasi kanal anion lambat SLAC1 dan kanal keluar Kalium (GORK) sehingga ion Cl⁻ dan K⁺ keluar dari sel penjaga, menyebabkan air keluar secara osmotik dan sel penjaga mengempis menutup stomata",
                    "Memompa lebih banyak air masuk ke dalam daun",
                    "Membuat daun langsung berguguran dalam 1 detik",
                    "Mengubah seluruh klorofil menjadi zat gula"
                ),
                correctAnswer = "Mengaktivasi kanal anion lambat SLAC1 dan kanal keluar Kalium (GORK) sehingga ion Cl⁻ dan K⁺ keluar dari sel penjaga, menyebabkan air keluar secara osmotik dan sel penjaga mengempis menutup stomata",
                hints = listOf(
                    "Penutupan stomata membutuhkan pengempisan sel penjaga (kehilangan turgor).",
                    "Agar air keluar, ion-ion osmotik (K⁺ dan Cl⁻) harus dibuang keluar dari sel terlebih dahulu.",
                    "Kanal anion SLAC1 mendepolarisasi membran yang kemudian membuka kanal keluar Kalium GORK."
                ),
                explanation = "Saat terjadi kekeringan, hormon Asam Absisat (ABA) mengikat reseptor intraseluler PYR/RCAR, yang menginaktivasi fosfatase PP2C dan membebaskan kinase SnRK2. SnRK2 aktif memfosforilasi dan membuka kanal anion lambat SLAC1 pada membran plasma, memicu keluarnya anion Cl⁻ dan malat. Pengeluaran anion ini mendepolarisasi membran sel penjaga, yang memicu pembukaan kanal keluar Kalium (GORK / Guard cell Outward Rectifying K+ channel). Efflux masif ion K⁺ dan Cl⁻ ke ruang apoplas menaikkan potensial solut Psi_s di dalam sel penjaga di atas potensial air apoplas, memaksa air keluar dari sel secara osmotik. Sel penjaga kehilangan tekanan turgor, mengempis menjadi flaksid, dan celah stomata menutup rapat dalam waktu beberapa menit untuk mencegah transpirasi mematikan.",
                misconception = "Mengira hormon ABA menutup stomata dengan membentuk lapisan lem perekat fisik di atas pori daun."
            )
        )
    )
}

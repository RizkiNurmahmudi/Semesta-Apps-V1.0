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

object BiologyLevel6Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "bio-bioinformatika-komputasi-debruijn",
            domain = Domain.BIOLOGI,
            topic = "Bioinformatika & Genomik Komputasi",
            title = "Bioinformatika: Perakitan Genom de novo Graf de Bruijn & Analisis RNA-Seq",
            description = "Algoritma graf de Bruijn dari sekuensing k-mer throughput tinggi, pemodelan homologi 3D protein, analisis diferensial transkriptomik RNA-Seq, dan pengayaan jalur metabolik KEGG.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("bio-genomik-bioinformatika-blast", "mat-teori-graf-lintasan")
        ),
        ConceptItem(
            id = "bio-biologi-sistem-sintetis",
            domain = Domain.BIOLOGI,
            topic = "Biologi Sistem & Biologi Sintetis",
            title = "Biologi Sistem & Sintetis: Sirkuit Genetik Bistabil & Genom Minimal",
            description = "Pemodelan matematika ODE jaringan reaksi biokimia seluler, rekayasa sirkuit genetika sintetis saklar toggle switch, osilator genetik repressilator, dan perakitan genom minimalis.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("bio-mol-regulasi-transkripsi-mirna", "mat-ode-orde-1-2")
        ),
        ConceptItem(
            id = "bio-neurosains-optogenetika",
            domain = Domain.BIOLOGI,
            topic = "Neurosains & Neurobiologi Molekuler",
            title = "Neurosains: Pemetaan Konektom Otak & Manipulasi Optogenetika",
            description = "Pemetaan konektom sinapsis saraf, aktivasi kanal ion rhodopsin berbasis cahaya (optogenetika), neuroplastisitas sinaptik, dan patologi agregasi protein Alzheimer.",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("bio-neuro-hodgkin-huxley-ltp", "bio-mol-transduksi-sinyal-gpcr")
        ),
        ConceptItem(
            id = "bio-biologi-kanker-hallmarks",
            domain = Domain.BIOLOGI,
            topic = "Biologi Kanker & Imuno-Onkologi",
            title = "Biologi Kanker: Karakteristik Tumor, Onkogen & Imunoterapi Checkpoint",
            description = "Hallmarks of cancer, mutasi pemicu onkogen (Ras, Myc) dan supresor tumor TP53, angiogenesis VEGF, metastasis, serta imunoterapi antibodi pos pemeriksaan (anti-PD-1/CTLA-4).",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("bio-mol-regulasi-transkripsi-mirna", "bio-imun-mhc-rekombinasi-vdj")
        ),
        ConceptItem(
            id = "bio-ekologi-molekuler-edna",
            domain = Domain.BIOLOGI,
            topic = "Ekologi Molekuler & Evolusioner",
            title = "Ekologi Molekuler: DNA Lingkungan (eDNA) & Kaidah Hamilton",
            description = "Sensus keanekaragaman hayati air dan tanah melalui metabarcoding eDNA tanpa tangkap spesimen, filogeografi molekuler, dan seleksi kerabat evolusi perilaku sosial altruisme.",
            level = DepthLevel.L6,
            estMinutes = 24,
            prerequisites = listOf("bio-gen-populasi-kuantitatif", "bio-konservasi-fragmentasi-pva")
        ),
        ConceptItem(
            id = "bio-bioteknologi-lanjut-directed-evolution",
            domain = Domain.BIOLOGI,
            topic = "Bioteknologi Industri & Bioproses",
            title = "Bioteknologi Lanjut: Evolusi Terarah Enzim & Kinetika Bioreaktor",
            description = "Metodologi Directed Evolution enzim melalui error-prone PCR dan seleksi high-throughput, kinetika pertumbuhan bioreaktor kaskade kontinu, aerasi kLa, dan pemurnian kromatografi hilir.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("bio-mikro-anaerob-quorum-sensing", "kim-biokimia-kinetika-enzim")
        ),
        ConceptItem(
            id = "bio-biologi-kelautan-kemosintesis",
            domain = Domain.BIOLOGI,
            topic = "Biologi Kelautan & Oseanografi Biologi",
            title = "Biologi Kelautan: Pompa Karbon Fitoplankton, Pemutihan Karang & Ventilasi Hidrotermal",
            description = "Dinamika fitoplankton laut pengikat karbon atmosfer, simbiosis alga zooxanthellae dan stres termal pemutihan terumbu karang, serta ekosistem kemosintesis belerang laut dalam.",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("bio-eko-dinamika-lotka-volterra", "kim-kesetimbangan-larutan-riil")
        ),
        ConceptItem(
            id = "bio-epidemiologi-seir-r0",
            domain = Domain.BIOLOGI,
            topic = "Epidemiologi & Kesehatan Masyarakat",
            title = "Epidemiologi Matematika: Model Kompartemen SEIR & Surveilans Genomik",
            description = "Model kompartemen dinamik penularan Susceptible-Exposed-Infectious-Recovered (SEIR), perhitungan bilangan reproduksi dasar (R0), herd immunity, dan pelacakan mutasi patogen real-time.",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("mat-ode-orde-1-2", "bio-genomik-bioinformatika-blast")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "bio-bioinformatika-komputasi-debruijn" -> LessonData(
                conceptId = "bio-bioinformatika-komputasi-debruijn",
                simId = "sim-debruijn-genome-assembly",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, mesin pengurut DNA modern (Next-Generation Sequencing) hanya bisa membaca potongan fragmen pendek 150 huruf basa. Bagaimana ilmuwan menyusun miliaran potongan acak itu kembali menjadi genom lengkap manusia?",
                        narrativeContext = "Dimas memandangi jutaan baris data sekuens FASTQ dari mesin NGS Illumina."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menggunakan algoritma Graf de Bruijn, Dimas! Tiap potongan dipecah menjadi fragmen berukuran k (k-mers). Sisi graf menghubungkan k-mer yang tumpang tindih (k-1 basa), lalu komputer mencari Lintasan Eulerian untuk menyusun genom de novo.",
                        narrativeContext = "Kakek menggambar graf berarah dengan simpul (k-1)-mer dan sisi k-mer."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk transkriptomik sel, analisis RNA-Seq mengkuantifikasi kelimpahan ekspresi mRNA (TPM/FPKM) menggunakan pemodelan distribusi binomial negatif DESeq2 untuk menemukan gen pemicu penyakit!",
                        narrativeContext = "Kirana memperlihatkan plot gunung berapi (volcano plot) gen yang teregulasi naik (up-regulated) dan turun (down-regulated)."
                    )
                ),
                intuitionBody = """
                    Bioinformatika Lanjut mengkombinasikan sains komputasi, teori graf, dan statistika matematis untuk merakit, menganalisis, dan menafsirkan data biologis skala omika raksasa.
                    
                    1. Perakitan Genom de novo Menggunakan Graf de Bruijn:
                       Berbeda dari algoritma Overlap-Layout-Consensus (OLC) yang lambat O(N^2), pendekatan de Bruijn memecah seluruh pembacaan (reads) menjadi potongan kata sepanjang k (k-mer).
                       - Simpul (Nodes): Mewakili prefiks dan sufiks sepanjang (k - 1) nukleotida.
                       - Sisi Berarah (Edges): Mewakili k-mer unik yang menghubungkan (k-1)-mer awal ke (k-1)-mer tujuan.
                       Perakitan sekuens kromosom direduksi menjadi penemuan Lintasan Eulerian (mengunjungi setiap sisi tepat satu kali) yang dapat dipecahkan dalam waktu linear O(E). Tantangan utama berupa daerah basa berulang (repetitive repeats) diselesaikan dengan pembacaan molekul panjang (Long-Reads PacBio / Oxford Nanopore).
                       
                    2. Analisis Transkriptomik Kuantitatif RNA-Seq:
                       - Penyelarasan (Alignment): Menyelaraskan jutaan reads cDNA ke genom rujukan (menggunakan HISAT2 atau STAR yang mampu menangani penyambungan intron/splicing).
                       - Normalisasi Data Hitungan: Mengatasi bias kedalaman sekuensing dan panjang transkrip menggunakan metrik TPM (Transcripts Per Million) atau normalisasi median-rasio DESeq2.
                       - Analisis Ekspresi Gen Diferensial (DEG): Karena data hitungan biologis memiliki overdispersi (variansi lebih besar dari rata-rata), pemodelan menggunakan Distribusi Binomial Negatif dengan koreksi uji majemuk FDR (Benjamini-Hochberg False Discovery Rate).
                       
                    3. Pengayaan Fungsional Jalur Biologis (Enrichment Analysis):
                       Mengidentifikasi apakah kelompok gen DEG terkonsentrasi secara signifikan pada istilah Gene Ontology (GO) atau jalur metabolisme dan pensinyalan terkurasi Kyoto Encyclopedia of Genes and Genomes (KEGG) menggunakan uji eksak Fisher atau GSEA (Gene Set Enrichment Analysis).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Graf de Bruijn mengatasi masalah redundansi pembacaan sekuensing dengan memampatkan miliaran reads menjadi graf k-mer unik.",
                    "Panjang parameter k adalah trade-off krusial: k terlalu kecil menimbulkan cabang ambiguitas, k terlalu besar memutus kontinuitas sambungan akibat galat sekuensing.",
                    "Distribusi Binomial Negatif wajib digunakan dalam RNA-Seq karena data biologis memiliki variabilitas jauh lebih tinggi daripada distribusi Poisson murni.",
                    "Analisis pengayaan KEGG mengubah daftar ratusan nama gen yang membingungkan menjadi pemahaman gambaran besar jalur biologis yang terganggu."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Lintasan Eulerian Graf de Bruijn",
                        latex = "V = \\{ (k-1)\\text{-mers} \\}, \\quad E = \\{ k\\text{-mers} \\}, \\quad \\deg^+(v) = \\deg^-(v)",
                        explanation = "Syarat eksistensi lintasan Eulerian yang merekonstruksi untai genom kontig dengan mengunjungi tiap k-mer tepat satu kali."
                    ),
                    FormulaCard(
                        title = "Model Binomial Negatif Transkriptomik RNA-Seq",
                        latex = "K_{ij} \\sim \\mathrm{NB}(\\mu_{ij}, \\alpha_i), \\quad \\mathrm{Var}(K_{ij}) = \\mu_{ij} + \\alpha_i \\mu_{ij}^2",
                        explanation = "Variansi hitungan ekspresi gen menggabungkan variasi teknis Poisson mu dan variasi biologis overdispersi alfa."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Surveilans Genomik & Perakitan Genom Patogen Balitbangkes / Bio Farma",
                    scenario = "Kementerian Kesehatan RI melalui jaringan laboratorium BGSi (Biomedical & Genome Science Initiative) melakukan sekuensing genom utuh ribuan sampel klinis tuberkulosis dan virus saluran napas.",
                    application = "Bioinformatikawan Indonesia menjalankan pipeline perakitan genom otomatis menggunakan graf de Bruijn (SPAdes/Unicycler) yang menggabungkan data Illumina short-reads dan Oxford Nanopore long-reads. Analisis filogenomik dan deteksi mutasi SNP resistensi obat mutakhir (seperti mutasi rpoB pada Mycobacterium tuberculosis resisten rifampisin) dipetakan secara real-time.",
                    impact = "Menentukan regimen pengobatan antibiotik yang tepat sasaran bagi pasien TB paru resisten obat ganda (MDR-TB) dan mencegah wabah patogen baru."
                ),
                homeLab = HomeLabData(
                    title = "Simulasi Perakitan Fragmen DNA Sederhana Berbasis Kertas Graf de Bruijn",
                    objective = "Memahami secara intuitif bagaimana memecah sekuens menjadi k-mer dan menyusunnya kembali menjadi kontig genom.",
                    materials = listOf("Kertas bergaris dan pulpen warna", "Gunting"),
                    steps = listOf(
                        "Tulis sekuens target buatan sepanjang 12 huruf: 'ATGGCGTGCAAT'.",
                        "Pecah sekuens menjadi potongan reads pendek acak 5 huruf.",
                        "Tetapkan nilai k = 4. Tulis semua 4-mer yang ada (misal: 'ATGG', 'TGGC', 'GGCG', 'GCGT', dst).",
                        "Tulis simpul awal 3-mer (k-1) dan simpul akhir 3-mer untuk tiap 4-mer (contoh: ATG -> TGG untuk 'ATGG').",
                        "Hubungkan panah antar simpul untuk membangun graf berarah de Bruijn.",
                        "Telusuri panah dari simpul awal ke simpul akhir; buktikan bahwa pembacaan graf menghasilkan kembali sekuens asli 12 huruf secara sempurna."
                    ),
                    safetyNote = "Praktikum teori graf dan algoritma biologis tanpa risiko fisik."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa analisis ekspresi diferensial RNA-Seq (seperti DESeq2) memodelkan data hitungan menggunakan Distribusi Binomial Negatif dan bukan Distribusi Poisson?",
                        options = listOf(
                            "Karena data biologi memiliki variabilitas biologis antar replika (overdispersi) di mana variansi jauh lebih besar daripada nilai rata-ratanya",
                            "Karena Distribusi Poisson hanya berlaku untuk bilangan bulat ganjil",
                            "Karena DNA memiliki struktur untai ganda",
                            "Karena mesin NGS tidak bisa menghitung data di atas angka 100"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Distribusi Poisson mensyaratkan bahwa variansi harus sama persis dengan rata-rata (Var = Mean). Pada data transkriptomik nyata, variasi biologis antar individu organisme menyebabkan fenomena overdispersi (Var > Mean), yang secara akurat dimodelkan oleh Binomial Negatif dengan parameter dispersi alfa.",
                        misconceptionAlert = "Menggunakan uji-t biasa atau Poisson pada data hitungan RNA-Seq mentah akan menghasilkan banyak positif palsu (false positives) karena meremehkan ketidakpastian variansi."
                    )
                )
            )

            "bio-biologi-sistem-sintetis" -> LessonData(
                conceptId = "bio-biologi-sistem-sintetis",
                simId = "sim-synthetic-toggle-switch",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, apakah kita bisa memprogram sel bakteri hidup agar bekerja seperti sirkuit komputer digital—misalnya menyimpan memori 1 bit atau berkedip seperti lampu osilator?",
                        narrativeContext = "Dimas kagum melihat kultur bakteri E. coli sintetis yang berpendar hijau berkedip secara periodik."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Bisa, Dimas! Itulah inti dari Biologi Sintetis dan Biologi Sistem! Bagian biologis standar (BioBricks) seperti promotor, represor, dan gen reporter dirangkai menjadi sirkuit genetika terencana.",
                        narrativeContext = "Kakek menggambarkan diagram sirkuit saklar bistabil (Toggle Switch Collins) dengan dua represor saling menghambat."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan dinamika kimianya diprediksi menggunakan sistem persamaan diferensial non-linear (ODE) dengan fungsi Hill, membuktikan keberadaan dua titik ekuilibrium stabil dalam analisis bifurkasi!",
                        narrativeContext = "Kirana memplot potret fase ruang konsentrasi protein represor u vs v."
                    )
                ),
                intuitionBody = """
                    Biologi Sistem memandang sel hidup sebagai jejaring interaksi biokimia terintegrasi yang kompleks, sedangkan Biologi Sintetis menerapkan prinsip-prinsip teknik rekayasa (standardisasi, modularitas, abstraksi) untuk merancang fungsi biologis baru yang tidak ada di alam.
                    
                    1. Saklar Genetik Bistabil Sintetis (The Genetic Toggle Switch):
                       Diciptakan oleh Gardner, Cantor, dan Collins (2000), sirkuit ini terdiri dari dua gen represor (Represor 1 dan Represor 2) yang saling menekan transkripsi promotor satu sama lain secara silang (mutual repression):
                       - Kondisi A: Represor 1 aktif tinggi, menekan Represor 2 -> Keadaan Stabil 'ON' (sel memproduksi GFP hijau).
                       - Kondisi B: Represor 2 aktif tinggi, menekan Represor 1 -> Keadaan Stabil 'OFF'.
                       Sirkuit memiliki dua titik tetap stabil (bistabilitas) dan satu titik pelana tak-stabil. Pemberian sinyal kimiawi penginduksi (IPTG atau pulsa termal) membalik status saklar secara permanen, bertindak sebagai elemen memori biologis seluler 1-bit.
                       
                    2. Osilator Genetik Sintetis (The Repressilator):
                       Dirancang oleh Elowitz dan Leibler (2000), sirkuit loop tertutup tiga gen represor (LacI, TetR, cI) yang saling menekan secara siklik:
                       LacI menekan TetR -> TetR menekan cI -> cI menekan LacI.
                       Dengan penundaan transkripsi-translasi dan degradasi protein yang terkalibrasi, sistem menghasilkan osilasi konsentrasi protein limit cycle periodik berkesinambungan (sel berkedip berpendar laksana jam biologis).
                       
                    3. Pemodelan Kinetika Non-Linear Fungsi Hill:
                       Laju sintesis protein yang ditekan represor kooperatif dimodelkan dengan fungsi Hill:
                       Laju = alpha / (1 + (R / K)^n).
                       Koefisien Hill n > 1 (kooperativitas pengikatan oligomer) adalah prasyarat mutlak yang menciptakan ketidaklinearan untuk memunculkan bistabilitas atau osilasi stabil.
                       
                    4. Genom Sintetis Minimalis (Minimal Genome / JCVI-syn3.0):
                       Institut J. Craig Venter merancang dan merakit genom buatan sintetik berbasis kimia murni Mycoplasma mycoides dengan hanya menyisakan 473 gen esensial penopang kehidupan otonom paling minimal di bumi.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Sirkuit biologis sintetis memperlakukan materi genetik sebagai perangkat keras logika terprogram (AND, OR, NOT gates).",
                    "Kooperativitas fungsi Hill (n > 1) menciptakan respons non-linear sigmoidal curam yang memungkinkan perilaku bistabil seperti saklar mekanik.",
                    "Repressilator membuktikan bahwa ritme sirkadian jam biologis alami dapat ditiru secara artifisial murni dari susunan komponen DNA buatan.",
                    "Genom minimalis menjawab pertanyaan filosofis dan ilmiah paling mendasar: berapa jumlah set gen minimum mutlak untuk mendefinisikan suatu kehidupan."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Dinamika Toggle Switch Sintetis",
                        latex = "\\frac{du}{dt} = \\frac{\\alpha_1}{1 + v^n} - d_1 u, \\quad \\frac{dv}{dt} = \\frac{\\alpha_2}{1 + (u / (1 + [\\mathrm{IPTG}]/K))^m} - d_2 v",
                        explanation = "Sistem ODE dua variabel konsentrasi protein represor u dan v dengan inhibisi timbal balik kinetika Hill dan degradasi linear."
                    ),
                    FormulaCard(
                        title = "Fungsi Hill Represi Transkripsi Kooperatif",
                        latex = "f(R) = \\frac{\\alpha}{1 + \\left(\\frac{R}{K_d}\\right)^n}",
                        explanation = "Fungsi Hill non-linear di mana koefisien kooperativitas n > 1 menghasilkan kurva peralihan curam penentu bistabilitas."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Biosensor Sel Hidup Pendeteksi Kontaminasi Logam Berat Merkuri Sungai Citarum",
                    scenario = "Sungai Citarum Jawa Barat tercemar limbah industri kimia termasuk kation logam berat merkuri (Hg2+) yang berbahaya bagi rantai makanan.",
                    application = "Tim mahasiswa biologi sintetis universitas nasional merancang strain bakteri E. coli yang disisipi sirkuit logika sintetis promotor MerR terinduksi merkuri yang digabungkan dengan gen fluoresen sfGFP. Ketika terpapar ion merkuri sekecil 5 ppb, represor MerR berubah konformasi mengaktifkan sintesis GFP, menghasilkan pendaran hijau yang intensitasnya sebanding dengan konsentrasi polutan.",
                    impact = "Menyediakan alat uji deteksi dini pencemaran air lingkungan lapangan yang murah, portabel, dan langsung terbaca dalam hitungan menit."
                ),
                homeLab = HomeLabData(
                    title = "Simulasi Model Saklar Logika Bistabil dengan Saklar Lampu Dua Arah Rumah",
                    objective = "Memahami konsep sistem dua keadaan stabil dan bagaimana gangguan eksternal memicu peralihan keadaan.",
                    materials = listOf("Saklar lampu dinding rumah tipe toggle dua arah", "Kertas catatan dan diagram keadaan"),
                    steps = listOf(
                        "Gambarkan diagram keadaan dua sumbu: Keadaan 0 (Mati / Bawah) dan Keadaan 1 (Hidup / Atas).",
                        "Amati bahwa saklar tidak pernah stabil di posisi tengah (kemiringan tak-stabil / saddle point); gaya pegas mekanik selalu mendorongnya ke salah satu posisi ekstrem.",
                        "Berikan dorongan jari kecil (gangguan sub-ambang batas); saklar kembali ke keadaan semula (kestabilan lokal).",
                        "Berikan dorongan melewati ambang batas aktivasi; saklar melompat seketika ke keadaan seberang dan menetap di sana (bistabilitas memori).",
                        "Bandingkan perilaku fisik ini dengan kurva energi potensial dua sumur (double-well potential) pada toggle switch biologi sintetis."
                    ),
                    safetyNote = "Amati saklar lampu fisik biasa dengan tangan kering dan aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Dalam pemodelan matematika sirkuit saklar genetik bistabil (Toggle Switch), apakah parameter esensial pada fungsi Hill yang harus bernilai lebih dari 1 (n > 1) agar sistem mampu memunculkan dua keadaan stabil permanen?",
                        options = listOf(
                            "Koefisien kooperativitas Hill (Hill coefficient n), yang mencerminkan ikatan represor multimerik non-linear",
                            "Suhu ruangan dalam derajat Fahrenheit",
                            "Panjang kromosom plasmid bakteri",
                            "Jumlah koloni bakteri pada cawan petri"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Jika koefisien Hill n = 1 (kinetika hiperbolik Michaelis-Menten tanpa kooperativitas), kurva pembatalan (nullclines) hanya berpotongan di satu titik tetap tunggal (monostabil). Nilai n > 1 memberikan kurva sigmoidal curam yang memungkinkan terciptanya tiga titik potong: dua titik ekuilibrium stabil dipisahkan oleh satu titik pelana tak-stabil.",
                        misconceptionAlert = "Banyak yang mengira laju transkripsi alpha yang tinggi sudah cukup untuk menciptakan bistabilitas, padahal tanpa ketaklinearan kooperatif (n > 1) bistabilitas matematis tidak mungkin terjadi."
                    )
                )
            )

            "bio-neurosains-optogenetika" -> LessonData(
                conceptId = "bio-neurosains-optogenetika",
                simId = "sim-optogenetics-connectome",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana para ilmuwan bisa mengetahui dengan pasti sirkuit neuron otak mana yang memicu rasa lapar, takut, atau ingatan memori pada hewan tanpa merusak sel saraf lainnya?",
                        narrativeContext = "Dimas melihat tikus lab yang aktif bergerak seketika setelah serat optik tipis di kepalanya memancarkan seberkas cahaya biru."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu adalah revolusi Optogenetika, Dimas! Gen fotoreseptor alga (Channelrhodopsin-2) disisipkan secara spesifik hanya ke populasi neuron tertentu. Saat disinari cahaya biru, kanal ion terbuka seketika dan memicu penembakan potensial aksi dalam skala milidetik!",
                        narrativeContext = "Kakek menggambarkan influks kation Na+ menembus membran neuron yang mengekspresikan ChR2."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan pemetaan menyeluruh dari seluruh kabel sinapsis miliaran neuron ini disebut Konektom (Connectome)—peta sirkuit listrik biologis terlengkap di alam semesta!",
                        narrativeContext = "Kirana memaparkan rekonstruksi 3D jaringan serabut aksonal otak menggunakan mikroskopi elektron serial."
                    )
                ),
                intuitionBody = """
                    Neurosains Lanjut membedah bagaimana komputasi saraf, plastisitas sinaptik, dan interkoneksi sirkuit melahirkan kognisi, memori, serta bagaimana kerusakannya memicu penyakit neurodegeneratif.
                    
                    1. Revolusi Alat Manipulasi Saraf: Optogenetika:
                       Dipelopori oleh Karl Deisseroth dan Ed Boyden (2005), menggabungkan rekayasa genetika dan optik presisi:
                       - Aktivasi Neuron Eksitatori: Mengekspresikan opsin Channelrhodopsin-2 (ChR2 dari alga Chlamydomonas). Penyinaran cahaya biru (470 nm) membuka kanal non-spesifik kation kation (Na+, Ca2+), mendepolarisasi membran memicu potensial aksi presisi milidetik.
                       - Inhibisi Neuron Inhibitori: Mengekspresikan Halorhodopsin (NpHR dari arkea). Cahaya kuning (580 nm) mengaktifkan pompa klorida ke dalam sel, menghiperpolarisasi membran menekan penembakan neuron.
                       Penggunaan promotor spesifik tipe sel (misal promotor CaMKIIa atau PV-Cre) menjamin kontrol hanya pada subset neuron target tanpa mengganggu sel tetangga.
                       
                    2. Rekonstruksi Konektom Otak (Connectomics):
                       Memetakan arsitektur diagram pengkabelan komputasi otak melalui mikroskopi elektron pemindaian resolusi tinggi serial (serial section SEM) yang disegmentasi algoritma AI deep learning, serta pemindaian traktografi traktus berkas akson Diffuse Tensor Imaging (DTI) makroskopis.
                       
                    3. Plastisitas Sinaptik & Formasi Memori Jejak Engram:
                       Penguatan sinapsis jangka panjang (LTP) dan pelemahan jangka panjang (LTD) melalui insersi dan internalisasi reseptor AMPA di membran post-sinaptik di bawah kendali kalsium reseptor NMDA. Sekumpulan neuron yang teraktivasi serentak selama pembelajaran membentuk sel engram memori fisik.
                       
                    4. Patofisiologi Penyakit Neurodegeneratif:
                       - Penyakit Alzheimer: Salah lipat dan agregasi ekstraseluler peptida beta-amiloid (A-beta42) membentuk plak senilis, serta hiperfosforilasi protein tau mikrotubulus membentuk kekusutan neurofibriler intraseluler (NFT), memicu apoptosis neuron kolinergik hipokampus.
                       - Penyakit Parkinson: Akumulasi agregat protein alfa-sinuklein (Lewy bodies) yang merusak neuron dopaminergik di substansia nigra.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Optogenetika memberikan resolusi temporal milidetik dan spesifisitas tipe sel yang mustahil dicapai oleh obat farmakologis atau elektroda listrik konvensional.",
                    "Hanya dengan menyalakan lampu LED biru, ilmuwan dapat mengaktifkan kembali memori ketakutan atau memicu perilaku makan secara instan.",
                    "Sirkuit konektom membuktikan bahwa fungsi otak muncul dari topologi jaringan koneksi sinaptik berulang, bukan sekadar sel individual.",
                    "Agregasi protein salah-lipat (prion-like spreading) merupakan benang merah patologi bersama pada sebagian besar penyakit neurodegeneratif."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Arus Fotokonduktansi Kanal Opsin ChR2",
                        latex = "I_{\\mathrm{ChR2}}(t, V) = g_{\\mathrm{ChR2}}(t) \\cdot (V - E_{\\mathrm{ChR2}}), \\quad E_{\\mathrm{ChR2}} \\approx 0\\,\\mathrm{mV}",
                        explanation = "Arus depolarisasi foton yang mengalir sebanding dengan fotokonduktansi g(t) dan selisih potensial membran terhadap potensial pembalik."
                    ),
                    FormulaCard(
                        title = "Kaidah Plastisitas Hebbian Sinapsis",
                        latex = "\\Delta w_{ij} = \\eta \\cdot x_i(t) \\cdot y_j(t)",
                        explanation = "'Neurons that fire together, wire together': bobot kekuatan sinapsis w_ij menguat saat neuron pra dan pasca-sinapsis aktif bersamaan."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Riset Deteksi Dini Biomarker Protein Tau & Beta-Amiloid Alzheimer RS Cipto Mangunkusumo",
                    scenario = "Prevalensi demensia Alzheimer meningkat pesat di kalangan populasi lansia Indonesia, seringkali baru terdiagnosis saat kerusakan otak sudah parah.",
                    application = "Tim dokter spesialis saraf FKUI-RSCM berkolaborasi dengan peneliti biomolekuler mengembangkan deteksi dini berbasis biomarker cairan serebrospinal dan plasma darah (A-beta42/A-beta40 ratio dan fosfo-Tau217). Menggunakan platform immunoassay digital ultrasensitif SIMOA, plak amiloid dapat terdeteksi 15 tahun sebelum gejala klinis kepikunan pertama kali muncul pada pasien.",
                    impact = "Memungkinkan intervensi terapi antibodi monoklonal tepat waktu sebelum kematian masif neuron korteks serebral."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Pemetaan Refleks Pupil Mata & Waktu Laten Jalur Saraf Optik",
                    objective = "Mengukur kecepatan respons sirkuit refleks pupil parasimpatis menanggapi stimulasi foton cahaya.",
                    materials = listOf("Ponsel berkamera dengan fitur slow-motion video", "Lampu senter kecil", "Cermin"),
                    steps = listOf(
                        "Duduk di ruangan agak temaram selama 3 menit agar pupil mata membesar (midriasis).",
                        "Nyalakan kamera video ponsel dalam mode perekaman gerakan lambat (slow-motion 120/240 fps) menyorot mata di cermin.",
                        "Nyalakan lampu senter ke arah mata dari samping secara mendadak.",
                        "Putar ulang video slow-motion; hitung jumlah bingkai (frame) dari saat cahaya pertama kali menyala hingga pupil mulai menciut (miosis).",
                        "Hitung waktu tunda transmisi saraf (waktu laten respons ~200 milidetik melintasi saraf optik kranial II, nukleus Edinger-Westphal, dan saraf kranial III)."
                    ),
                    safetyNote = "Gunakan senter redup dan jangan menyorot mata secara langsung terlalu lama."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa opsin Channelrhodopsin-2 (ChR2) menyebabkan neuron menembakkan potensial aksi ketika disinari cahaya biru?",
                        options = listOf(
                            "Karena ChR2 adalah kanal kation berpintu cahaya yang membiarkan ion Na+ masuk ke dalam sel saraf, mendepolarisasi membran melewati ambang batas batas penembakan",
                            "Karena ChR2 membakar membran sel dengan panas",
                            "Karena ChR2 memompa ion kalium keluar dari sel hingga membran hiperpolarisasi",
                            "Karena ChR2 menghentikan respirasi mitokondria"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Kanal ChR2 teraktivasi oleh foton biru (~470 nm), memicu isomerisasi retinal yang membuka pori kanal ion. Masuknya ion natrium (Na+) menuruni gradien konsentrasi elektrokimia mendepolarisasi membran sel saraf melampaui nilai ambang batas (-55 mV), memicu pelepasan potensial aksi Hodgkin-Huxley.",
                        misconceptionAlert = "Halorhodopsin (NpHR) bekerja sebaliknya: memompa ion klorida Cl- negatif ke dalam sel untuk menghambat (mematikan) penembakan neuron."
                    )
                )
            )

            "bio-biologi-kanker-hallmarks" -> LessonData(
                conceptId = "bio-biologi-kanker-hallmarks",
                simId = "sim-cancer-hallmarks-checkpoint",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, sel tubuh kita normalnya membelah dengan sangat teratur dan mati jika rusak. Mengapa sel kanker bisa membelah tanpa kendali dan menolak untuk mati?",
                        narrativeContext = "Dimas mengamati preparat histologi biopsi jaringan tumor ganas di bawah mikroskop."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Karena sel kanker telah mengakumulasi serangkaian mutasi DNA yang memberinya Karakteristik Kanker (Hallmarks of Cancer), Dimas! Onkogen seperti Ras terus-menerus mengirim sinyal pembelahan palsu, sementara gen penjaga genom penekan tumor TP53 dinonaktifkan.",
                        narrativeContext = "Kakek menunjukkan diagram 10 karakteristik mutasi fundamental tumor menurut Hanahan dan Weinberg."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan sel kanker menipu sel imun pembunuh (sel T) dengan mengibarkan molekul 'bendera peredam' PD-L1. Imunoterapi modern menggunakan antibodi anti-PD-1 untuk memutus kamuflase tersebut, melepaskan sel T menyerang tumor!",
                        narrativeContext = "Kirana memperlihatkan mekanisme pos pemeriksaan kekebalan imun (immune checkpoint inhibitors)."
                    )
                ),
                intuitionBody = """
                    Biologi Kanker mengkaji transformasi molekuler sel somatik normal menjadi sel neoplastik ganas melalui evolusi klonal mutasi genetik dan epigenetik bertahap.
                    
                    1. Karakteristik Kanker (Hallmarks of Cancer - Douglas Hanahan & Robert Weinberg):
                       - Mempertahankan pensinyalan proliferasi terus-menerus (sinyal pembelahan otonom).
                       - Menghindari penekan pertumbuhan (inaktivasi rem siklus sel Rb dan p53).
                       - Menolak kematian sel terprogram (apoptosis terhambat lewat ekspresi berlebih Bcl-2).
                       - Memungkinkan keabadian replikatif (reaktivasi enzim telomerase memelihara telomer DNA).
                       - Menginduksi pembentukan pembuluh darah baru (angiogenesis tumor dipicu sekresi VEGF).
                       - Mengaktifkan invasi jaringan dan metastasis (kehilangan E-cadherin transisi epitel-mesenkimal EMT).
                       - Memprogram ulang metabolisme energi seluler (Efek Warburg: fermentasi glikolisis aerobik).
                       - Menghindari penghancuran oleh sistem imun (imunosupresi mikrolingkungan tumor).
                       - Ketidakstabilan genomik dan mutasi pendorong (driver mutations vs passenger mutations).
                       - Inflamasi mikro-lingkungan yang mendorong perkembangan tumor.
                       
                    2. Onkogen vs Gen Supresor Tumor:
                       - Proto-onkogen menjadi Onkogen aktif: Cukup satu alel termutasi (gain-of-function dominan, mutasi titik Ras memblokir aktivitas GTPase, amplifikasi gen HER2/neu, translokasi fusi kromosom BCR-ABL).
                       - Gen Penekan Tumor (Tumor Suppressor Genes): Membutuhkan mutasi kedua alel (Knudson's Two-Hit Hypothesis loss-of-function). TP53 (penjaga genom menghentikan siklus sel atau memicu apoptosis saat DNA rusak) termutasi pada >50% seluruh kanker manusia.
                       
                    3. Imunoterapi Pos Pemeriksaan Imun (Immune Checkpoint Inhibitors):
                       Sel tumor memanfaatkan ligan PD-L1 untuk berikatan dengan reseptor PD-1 pada permukaan sel T sitotoksik CD8+, mematikan aktivitas pembunuhan sel T.
                       Antibodi monoklonal terapeutik anti-PD-1 (seperti Pembrolizumab) atau anti-CTLA-4 memblokir interaksi inhibisi ini, melepaskan rem sistem kekebalan tubuh pasien sendiri untuk mengenali neoantigen tumor dan menghancurkan massa kanker secara spesifik.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Kanker bukan satu penyakit tunggal, melainkan evolusi klonal Darwinian mikroskopis sel somatik di dalam tubuh inang.",
                    "Gen penekan tumor p53 bertindak sebagai rem darurat sel; kerusakannya membiarkan mutasi lain menumpuk tanpa kendali.",
                    "Efek Warburg memperlihatkan bahwa sel kanker menyukai glikolisis cepat daripada fosforilasi oksidatif demi memproduksi blok biomassa sel anak.",
                    "Imunoterapi pos pemeriksaan memicu paradigma baru onkologi: mengobati sistem kekebalan tubuh pasien alih-alih meracuni tumor secara membabi buta dengan kemoterapi."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Hipotesis Dua Pukulan Knudson (Two-Hit Hypothesis)",
                        latex = "P(\\text{Tumor}) = 1 - e^{-\\mu_1 \\mu_2 t^2}, \\quad \\text{Inaktivasi Alel 1} + \\text{Inaktivasi Alel 2} \\implies \\text{Hilangnya Fungsi TSG}",
                        explanation = "Kanker familial berawal dari satu alel inaktif bawaan garis germinal, membutuhkan satu mutasi somatik tambahan pada alel homolog untuk mencetuskan karsinogenesis."
                    ),
                    FormulaCard(
                        title = "Blokade Pos Pemeriksaan Imun Anti-PD-1",
                        latex = "\\mathrm{Sel\\,T(PD\\text{-}1)} + \\mathrm{Tumor(PD\\text{-}L1)} \\xrightarrow{\\mathrm{mAb\\,Anti\\text{-}PD1}} \\mathrm{Reaktivasi\\,Sitotoksik\\,Granzim/Perforin}",
                        explanation = "Antibodi terapeutik mencegah ikatan ligan imunosupresif sehingga sel T kembali menyuntikkan enzim perforin pelisis sel tumor."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Skrining Kanker Serviks DNA HPV Berbasis PCR & Imunoterapi RS Kanker Dharmais Jakarta",
                    scenario = "Kanker leher rahim (serviks) merupakan penyebab kematian kanker perempuan nomor dua tertinggi di Indonesia, disebabkan oleh infeksi onkogenik Human Papillomavirus (HPV tipe 16 & 18).",
                    application = "RS Kanker Dharmais menerapkan pengujian molekuler DNA HPV throughput tinggi untuk mendeteksi onkoprotein virus E6 (pengurai protein p53 sel inang) dan E7 (pengikat pRb). Pasien stadium lanjut diobati dengan kombinasi kemoradiasi dan imunoterapi antibodi pos pemeriksaan anti-PD-1, melipatgandakan angka kelangsungan hidup bebas progresi (PFS).",
                    impact = "Menyelamatkan ribuan nyawa perempuan Indonesia dan mendukung program vaksinasi nasional HPV preventif anak usia sekolah."
                ),
                homeLab = HomeLabData(
                    title = "Analogi Pemodelan Mutasi Akumulatif Karsinogenesis Menggunakan Menara Balok Jenga",
                    objective = "Memahami konsep akumulasi mutasi genetik pendorong (driver mutations) hingga tercapainya instabilitas genomik fatal.",
                    materials = listOf("Satu set balok permainan Jenga (atau tumpukan balok kayu serupa)", "Spidol untuk menandai"),
                    steps = listOf(
                        "Susun menara balok Jenga secara utuh (merepresentasikan genom sel normal yang stabil).",
                        "Tandai beberapa balok sebagai 'Onkogen' (pemicu pembelahan), 'p53' (perbaikan DNA), 'VEGF' (pembuluh darah), dan 'Telomerase'.",
                        "Tarik balok-balok non-kritis satu per satu (mutasi netral penumpang / passenger mutations); menara tetap berdiri kokoh.",
                        "Tarik balok yang bertanda 'p53' dan 'Rb' (hilangnya gen supresor tumor); menara mulai miring goyah.",
                        "Lanjutkan menarik 2-3 balok lagi hingga seluruh menara runtuh total (transformasi ganas menjadi sel kanker sejati).",
                        "Diskusikan mengapa penuaan usia berkorelasi eksponensial dengan insidensi kanker akibat akumulasi mutasi sepanjang hayat."
                    ),
                    safetyNote = "Praktikum konsep analogi fisik meja kerja, sepenuhnya aman."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Manakah dari mekanisme berikut yang menjelaskan bagaimana antibodi monoklonal inhibitor pos pemeriksaan imun (seperti anti-PD-1) membantu membasmi sel kanker?",
                        options = listOf(
                            "Mencegah interaksi penghambatan antara reseptor PD-1 pada sel T dengan ligan PD-L1 pada sel kanker, sehingga memulihkan kemampuan sitotoksik sel T untuk membunuh sel tumor",
                            "Meracuni seluruh sel tubuh dengan radiasi nuklir",
                            "Menurunkan kadar gula darah pasien hingga nol",
                            "Menghentikan sintesis DNA di dalam sel bakteri usus"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Sel tumor menghindari pengawasan imun dengan mengekspresikan ligan PD-L1 yang mematikan sel T. Antibodi terapeutik anti-PD-1 mengikat reseptor PD-1, menghalangi interaksi penonaktifan ini, sehingga sel T tetap aktif dan melepaskan perforin dan granzim untuk menghancurkan sel tumor.",
                        misconceptionAlert = "Obat ini tidak membunuh sel kanker secara langsung seperti racun kemoterapi klasik, melainkan melatih dan memberdayakan sistem imun tubuh pasien sendiri."
                    )
                )
            )

            "bio-ekologi-molekuler-edna" -> LessonData(
                conceptId = "bio-ekologi-molekuler-edna",
                simId = "sim-edna-metabarcoding",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana para peneliti Taman Nasional bisa mengetahui keberadaan populasi Badak Jawa yang sangat langka di hutan lebat Ujung Kulon tanpa pernah melihat atau menangkap badak itu secara langsung?",
                        narrativeContext = "Dimas memandangi foto hutan belantara Semenanjung Ujung Kulon yang rapat dan berkabut."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menggunakan DNA Lingkungan (environmental DNA / eDNA), Dimas! Setiap makhluk hidup melepaskan serpihan sel kulit, lendir, atau kotoran ke air sungai dan tanah. Kita cukup menyaring sampel satu botol air sungai untuk membaca kode genetiknya!",
                        narrativeContext = "Kakek memegang filter membran mikro dan tabung reaksi sampel air sungai."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk memahami evolusi perilaku sosial hewan di alam liar, W.D. Hamilton merumuskan Kaidah Altruisme Seleksi Kerabat: gen pengorbanan diri akan berkembang jika r*B > C!",
                        narrativeContext = "Kirana menuliskan koefisien kekerabatan r dan persamaan seleksi kerabat Hamilton."
                    )
                ),
                intuitionBody = """
                    Ekologi Molekuler mengintegrasikan metode genetika populasi dan biologi molekuler ke dalam studi ekologi lapangan, konservasi spesies terancam, dan evolusi perilaku.
                    
                    1. Teknologi DNA Lingkungan (eDNA) & Metabarcoding:
                       Organisme secara alami melepaskan materi genetik ke lingkungan (air tawar, laut, tanah, bahkan udara) melalui deskuamasi sel epitel, feses, mukus, dan gamet.
                       - Protokol Alur Kerja: Pengambilan sampel air -> Filtrasi melalui membran pori 0.22 - 0.45 mikrometer -> Ekstraksi DNA total -> Amplifikasi PCR lokus marka barkode universal (misal 12S rRNA untuk vertebrata/ikan, COI untuk avertebrata, rbcl/matK untuk tumbuhan) -> Sekuensing throughput tinggi (Metabarcoding NGS) -> Pencocokan basis data taksonomi (NCBI/BOLD).
                       - Keunggulan: Non-invasif (tanpa menangkap atau mengganggu satwa liar), sensitivitas luar biasa tinggi, mendeteksi spesies kriptik, langka, atau invasif pada kerapatan sangat rendah.
                       
                    2. Filogeografi Molekuler & Garis Wallace:
                       Mempelajari prinsip spasial dan temporal yang membentuk garis keturunan genealogis populasi dalam konteks sejarah geografis geologi masa lampau (seperti peristiwa Zaman Es Pleistosen dan Paparan Sunda-Sahul di Nusantara).
                       
                    3. Evolusi Sosial & Kaidah Seleksi Kerabat Hamilton (Kin Selection):
                       Mengapa individu rela berkorban demi anggota kelompoknya (altruisme biologis)?
                       Kaidah Hamilton (Hamilton's Rule): Perilaku altruistik disukai oleh seleksi alam jika:
                       r * B > C.
                       - r (koefisien kekerabatan genetik): probabilitas alel yang sama diwarisi dari leluhur bersama (r = 0.5 untuk saudara kandung/anak, r = 0.25 untuk keponakan, r = 0.125 untuk sepupu).
                       - B (Benefit): Manfaat peningkatan kebugaran reproduksi bagi penerima pertolongan.
                       - C (Cost): Biaya kerugian kebugaran reproduksi yang ditanggung oleh pelaku altruisme.
                       Kebugaran Inklusif (Inclusive Fitness) menggabungkan kebugaran langsung (keturunan sendiri) dan kebugaran tidak langsung (keturunan kerabat yang membawa gen yang sama).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Satu botol air sungai tropis menyimpan informasi sidik jari genetik seluruh komunitas fauna yang hidup di hulu aliran air tersebut.",
                    "eDNA mendegradasi secara alami dalam 1-2 minggu akibat radiasi UV dan aktivitas mikroba, mencerminkan kehadiran spesies yang baru terjadi.",
                    "Kaidah Hamilton membuktikan secara matematis bahwa altruisme bukanlah penolakan terhadap teori evolusi Darwin, melainkan wujud egoisme gen memperbanyak salinannya melalui kerabat.",
                    "Sistem penentuan jenis kelamin haplodiploid pada semut dan lebah menghasilkan r = 0.75 antar saudara betina, menjelaskan lahirnya masyarakat sosial kasta pekerja mandul (eusosialitas)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Kaidah Hamilton untuk Seleksi Kerabat",
                        latex = "r \\cdot B > C, \\quad W_{\\mathrm{inklusif}} = W_{\\mathrm{langsung}} + \\sum r_i B_i",
                        explanation = "Gen perilaku altruistik akan menyebar dalam populasi jika manfaat bagi kerabat dikalikan koefisien kekerabatan melebihi biaya pengorbanan diri."
                    ),
                    FormulaCard(
                        title = "Degradasi Konsentrasi eDNA Lingkungan",
                        latex = "C(t) = C_0 e^{-\\lambda t}, \\quad t_{1/2} = \\frac{\\ln 2}{\\lambda} \\approx 24 - 48\\,\\text{jam}",
                        explanation = "Peluruhan eksponensial molekul DNA bebas di perairan alami akibat degradasi nuklease bakteri dan fotolisis surya."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Inventarisasi Spesies Hiu Langka & Pari Manta di Perairan Raja Ampat Berbasis eDNA",
                    scenario = "Kawasan Konservasi Perairan Kepulauan Raja Ampat Papua Barat memiliki luas jutaan hektar yang sulit disensus hanya dengan penyelaman visual scuba.",
                    application = "Balai Konservasi Sumber Daya Alam bersama periset oseanografi menggunakan metode eDNA metabarcoding air laut permukaan. Dengan menyaring 2 liter air laut di setiap titik terumbu karang dan mengamplifikasi lokus mitokondria 12S rRNA, mereka berhasil memetakan rute migrasi hiu paus (Rhincodon typus), pari manta oseanik, dan mendeteksi kehadiran spesies hiu martil langka tanpa perlu memancing atau menyakiti satu ekor pun satwa laut.",
                    impact = "Memperkuat penegakan hukum zona larang-tangkap (no-take zone) dan melindungi keanekaragaman hayati laut terkaya di planet bumi."
                ),
                homeLab = HomeLabData(
                    title = "Isolasi DNA Makroskopis Sederhana dari Buah Stroberi / Pisang Dapur",
                    objective = "Melihat secara kasat mata gumpalan molekul DNA yang diekstraksi dari jaringan hidup menggunakan bahan rumah tangga.",
                    materials = listOf("1 buah stroberi segar atau 1/2 buah pisang", "Plastik zip-lock bening", "Deterjen cair / sabun cuci piring (pelisis membran lipid)", "Garam dapur (1/2 sendok teh)", "Alkohol 70% atau 96% yang sudah didinginkan di freezer", "Saringan teh dan gelas bening", "Tusuk gigi"),
                    steps = listOf(
                        "Masukkan stroberi, sedikit air, garam dapur, dan 1 sendok teh sabun cair ke dalam plastik zip-lock.",
                        "Remas-remas plastik hingga stroberi lumat total (merusak dinding sel dan melisis membran sel/nukleus).",
                        "Saring cairan merah bubur stroberi melalui saringan teh ke dalam gelas bening.",
                        "Miringkan gelas, tuangkan perlahan alkohol dingin membeku menyusuri dinding gelas agar membentuk lapisan bening di atas cairan merah.",
                        "Tunggu 2 menit; amati benang-benang putih berlendir yang mengendap dan naik ke lapisan alkohol: itu adalah jutaan untai polimer DNA stroberi!",
                        "Kaitkan gumpalan lendir DNA putih tersebut menggunakan ujung tusuk gigi."
                    ),
                    safetyNote = "Jangan meminum alkohol atau ekstrak bahan kimia praktikum."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Berdasarkan Kaidah Hamilton r*B > C, jika seorang individu mengorbankan nyawanya (C = 1) untuk menyelamatkan saudara kandungnya (r = 0.5), berapakah jumlah minimum saudara kandung yang harus diselamatkan agar perilaku altruistik tersebut disukai secara evolusi genetik?",
                        options = listOf(
                            "Minimal 3 orang saudara kandung (karena 0.5 * 3 = 1.5 > 1)",
                            "Hanya butuh 1 orang saudara",
                            "Minimal 10 orang saudara",
                            "Perilaku pengorbanan diri tidak pernah disukai secara evolusi"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Dengan koefisien kekerabatan saudara kandung r = 0.5, jika menyelamatkan 2 saudara, maka r*B = 0.5*2 = 1.0 (tepat impas dengan biaya C = 1). Maka agar pertidaksamaan r*B > C terpenuhi murni (> 1), dibutuhkan minimal 3 saudara kandung (0.5 * 3 = 1.5 > 1), sebagaimana ungkapan terkenal ahli genetika J.B.S. Haldane: 'Saya rela mati demi 2 saudara kandung atau 8 sepupu'.",
                        misconceptionAlert = "Sering dikira evolusi hanya mengukur keselamatan individu tunggal, padahal seleksi genetik mengukur transmisi salinan gen lintas kerabat (kebugaran inklusif)."
                    )
                )
            )

            "bio-bioteknologi-lanjut-directed-evolution" -> LessonData(
                conceptId = "bio-bioteknologi-lanjut-directed-evolution",
                simId = "sim-directed-evolution-bioreactor",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana para bioteknolog bisa menciptakan enzim deterjen yang tahan air panas 80 derajat atau enzim pemakan sampah botol plastik PET yang di alam tidak pernah ada?",
                        narrativeContext = "Dimas memegang botol enzim pembersih industri ramah lingkungan."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menggunakan Evolusi Terarah (Directed Evolution), teknik peraih Nobel Kimia Frances Arnold! Kita mempercepat evolusi jutaan tahun di alam menjadi hanya beberapa minggu di dalam tabung reaksi laboratorium melalui siklus mutasi acak dan seleksi buatan.",
                        narrativeContext = "Kakek menggambarkan siklus: Mutagenesis PCR -> Pustaka Varian Gen -> Skrining Aktivitas -> Enzim Unggul Terpilih."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk memproduksi enzim tersebut dalam skala ribuan liter, bioreaktor industri mengontrol laju transfer oksigen volumetrik (kLa) dan pengenceran nutrisi kontinu (chemostat)!",
                        narrativeContext = "Kirana memperlihatkan bioreaktor stainless steel fermentasi mikroba berkapasitas 10.000 liter."
                    )
                ),
                intuitionBody = """
                    Bioteknologi Lanjut memadukan rekayasa protein de novo dan teknik bioproses hilir untuk memproduksi bioproduk bernilai tinggi secara ekonomis dan berkelanjutan.
                    
                    1. Metodologi Evolusi Terarah (Directed Evolution):
                       Meniru seleksi alamiah Darwinian di laboratorium tanpa harus mengetahui secara detail struktur 3D enzim sebelumnya:
                       - Langkah 1 (Diversifikasi Gen): Membuat jutaan mutan varian acak gen target menggunakan Error-Prone PCR (memanfaatkan enzim polimerase rendah kesetiaan Taq dengan ion Mn2+ atau rasio dNTP timpang) atau DNA Shuffling (rekombinasi homolog in vitro fragmen gen enzim terkait).
                       - Langkah 2 (Pengekspresian Pustaka): Mentransformasikan pustaka gen ke sel inang bakteri atau ragi.
                       - Langkah 3 (Skrining / Seleksi Throughput Tinggi): Menguji varian menggunakan lempeng 96/384-well plate mikrofluida untuk mendeteksi peningkatan aktivitas katalitik, stabilitas termal, atau toleransi pelarut organik.
                       - Langkah 4 (Iterasi): Gen varian terbaik diisolasi dan dijadikan cetakan awal untuk putaran mutasi dan seleksi siklus berikutnya.
                       
                    2. Kinetika Bioreaktor Industri:
                       - Model Pertumbuhan Mikroba Monod: mu = mu_max * S / (K_s + S).
                       - Bioreaktor Kultur Kontinu (Chemostat): Menjaga mikroba dalam fase eksponensial tunak dengan laju pengenceran D = F / V yang sama dengan laju pertumbuhan spesifik mu.
                       - Koefisien Transfer Massa Oksigen Volumetrik (k_L*a): Oksigen terlarut sering menjadi reaktan pembatas kinetika aerobik; laju suplai OTR = k_L*a * (C* - C_L) harus mengimbangi laju konsumsi mikroba OUR = q_O2 * X.
                       
                    3. Pemrosesan Hilir (Downstream Processing):
                       Pemisahan biomassa seluler (sentrifugasi kontinu atau filtrasi aliran silang microfiltration), lisis sel jika produk intraseluler, kromatografi afinitas kolom protein A / His-tag, penukar ion, dan formulasi liofilisasi pengeringan beku (freeze-drying).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Evolusi terarah membuktikan bahwa kecerdasan rekayasa manusia dapat memanfaatkan kekuatan seleksi alam acak untuk menghasilkan katalis yang melampaui alam.",
                    "Koefisien kLa adalah parameter teknik paling kritis yang menentukan apakah kultur mikroba di dalam bioreaktor mengalami mati lemas hipoksia.",
                    "Chemostat memungkinkan pemanenan biomassa dan metabolit secara kontinu tanpa jeda waktu henti pembersihan tangki fermentor batch.",
                    "Hilirisasi (downstream purification) menyumbang hingga 70-80% dari total biaya produksi bioteknologi farmasi (seperti antibodi dan vaksin)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Kinetika Pertumbuhan Mikroba Model Monod",
                        latex = "\\mu = \\mu_{\\max} \\frac{S}{K_s + S}, \\quad \\frac{dX}{dt} = (\\mu - D) X",
                        explanation = "Laju pertumbuhan spesifik biomassa mu bergantung pada konsentrasi substrat pembatas S dan laju pengenceran bioreaktor D."
                    ),
                    FormulaCard(
                        title = "Laju Transfer Oksigen Volumetrik Bioreaktor",
                        latex = "\\mathrm{OTR} = k_L a (C^* - C_L) = \\mathrm{OUR} = q_{\\mathrm{O}_2} X",
                        explanation = "Keseimbangan perpindahan massa oksigen gas-cair kLa terhadap laju konsumsi respirasi seluler mikroba."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Kemandirian Fasilitas Bioproses Produksi Vaksin Rekombinan PT Bio Farma Bandung",
                    scenario = "PT Bio Farma memproduksi vaksin rekombinan Hepatitis B dan vaksin konjugat pneumonia untuk kebutuhan imunisasi dasar jutaan bayi di Indonesia dan ekspor global.",
                    application = "Insinyur bioproses mengoptimalkan profil fed-batch kultur ragi Pichia pastoris berkapasitas 3.000 liter. Parameter koefisien aerasi kLa, laju penambahan metanol penginduksi promotor AOX1, dan suhu dikendalikan otomatis oleh sensor kendali digital distributed control system (DCS). Tahapan kromatografi kolom hidrofobik hilir menghasilkan rendemen antigen murni 99.8% bebas pirogen.",
                    impact = "Menjamin pasokan vaksin mandiri bersertifikat WHO bagi program imunisasi nasional dan memasok kebutuhan vaksin di lebih dari 150 negara."
                ),
                homeLab = HomeLabData(
                    title = "Simulasi Fermentasi Bioproses & Kinetika Produksi Gas Ragi Roti Dapur",
                    objective = "Mengukur laju respirasi dan fermentasi ragi Saccharomyces cerevisiae pada berbagai konsentrasi gula substrat.",
                    materials = listOf("3 buah botol plastik air mineral 330 mL", "3 buah balon karet tiup", "Ragi instan roti (Fermipan)", "Gula pasir dapur", "Air hangat kuku (sekitar 37-40 C)", "Penggaris dan spidol"),
                    steps = listOf(
                        "Beri label ketiga botol: A (tanpa gula), B (1 sendok teh gula), C (3 sendok makan gula).",
                        "Masukkan 1 sendok teh ragi instan ke masing-masing botol.",
                        "Tuang 100 mL air hangat kuku ke tiap botol, aduk hingga ragi dan gula larut merata.",
                        "Pasang balon karet menutup rapat mulut tiap botol.",
                        "Ukur tinggi diameter balon karet setiap 10 menit selama 40 menit seiring akumulasi produksi gas CO2.",
                        "Plot grafik pembengkakan balon terhadap waktu; amati perbedaan laju fermentasi akibat kelimpahan substrat karbon S."
                    ),
                    safetyNote = "Gunakan air hangat biasa, jangan gunakan air mendidih karena akan mematikan sel ragi."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah keunggulan utama dari metode Evolusi Terarah (Directed Evolution) dibandingkan dengan metode Desain Rasional murni (Rational Design) dalam rekayasa enzim?",
                        options = listOf(
                            "Evolusi Terarah tidak membutuhkan pemahaman menyeluruh terhadap struktur kristal 3D atau mekanisme kompleks enzim untuk menemukan mutasi unggul yang meningkatkan performa",
                            "Evolusi Terarah tidak menggunakan molekul DNA",
                            "Evolusi Terarah selalu berhasil 100% pada percobaan pertama tanpa perlu penyaringan",
                            "Evolusi Terarah dapat dilakukan tanpa menggunakan sel hidup atau tabung reaksi"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Desain rasional mengharuskan para ilmuwan memahami hubungan struktur-aktivitas atomik secara presisi (yang seringkali terlalu rumit diprediksi). Evolusi terarah melewati batasan ketidaktahuan ini dengan menghasilkan variasi mutasi acak berskala besar dan membiarkan seleksi throughput tinggi menyaring varian dengan sifat unggul yang diinginkan.",
                        misconceptionAlert = "Evolusi terarah bukan berarti mutasi terjadi secara terarah (mutasi tetap acak), melainkan seleksi buatannyalah yang diarahkan oleh peneliti menuju target tertentu."
                    )
                )
            )

            "bio-biologi-kelautan-kemosintesis" -> LessonData(
                conceptId = "bio-biologi-kelautan-kemosintesis",
                simId = "sim-marine-carbon-pump",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, di dasar laut terdalam palung samudra yang gelap gulita tanpa sinar matahari sedikit pun dan bertekanan ratusan atmosfer, bagaimana bisa ada cacing tabung raksasa dan kepiting yang hidup subur?",
                        narrativeContext = "Dimas melihat rekaman video kapal selam riset laut dalam di lubang ventilasi hidrotermal (hydrothermal vent)."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Dasar rantai makanan di sana tidak bergantung pada fotosintesis, melainkan Kemosintesis! Bakteri simbion mengoksidasi gas hidrogen sulfida (H2S) yang menyembur dari kerak bumi untuk memfiksasi karbon menjadi glukosa.",
                        narrativeContext = "Kakek menggambarkan reaksi kemosintesis bakteri belerang di dalam organ trofosom cacing Riftia pachyptila."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan di perairan dangkal tropis, terumbu karang kita menghadapi ancaman Pemutihan Karang (Coral Bleaching), di mana kenaikan suhu laut memicu stres foto-oksidatif yang memaksa polip karang mengusir alga simbiotik Zooxanthellae!",
                        narrativeContext = "Kirana memperlihatkan foto karang sehat berwarna-warni kontras dengan karang putih pucat yang mati terpanggang gelombang panas laut."
                    )
                ),
                intuitionBody = """
                    Biologi Kelautan dan Oseanografi Hayati mempelajari adaptasi kehidupan laut, siklus biogeokimia global samudra, serta dinamika ekosistem perairan dari terumbu karang tropis hingga palung samudra abisal.
                    
                    1. Pompa Biologis Karbon Samudra (Biological Carbon Pump):
                       Fitoplankton di zona fotik menyerap miliaran ton CO2 atmosfer melalui fotosintesis, menyumbang >50% oksigen biosfer bumi.
                       Kematian fitoplankton dan feses zooplankton membentuk 'Salju Laut' (Marine Snow) partikulat karbon organik yang tenggelam melintasi termoklin menuju laut dalam. Karbon ini terkubur ribuan tahun di sedimen dasar samudra, berfungsi sebagai penyerap karbon (carbon sink) global vital pendingin iklim bumi.
                       
                    2. Simbiosis Karang & Fenomena Pemutihan (Coral Bleaching):
                       Polip karang batu (ordo Scleractinia) hidup bersimbiosis mutualisme obligat dengan dinoflagellata bersel tunggal fotosintetik (Zooxanthellae / famili Symbiodiniaceae). Zooxanthellae menyuplai hingga 90% kebutuhan energi polip dalam bentuk glukosa dan gliserol, sementara polip memberikan perlindungan dan nutrisi anorganik (N, P).
                       Ketika suhu laut naik hanya 1 - 2 C di atas ambang batas musiman normal (marine heatwaves), fotosistem II zooxanthellae rusak dan memproduksi Spesi Oksigen Reaktif (ROS) beracun. Untuk mempertahankan diri dari stres oksidatif, sel polip karang terpaksa mengeluarkan (mengusir) zooxanthellae, menyebabkan kerangka kalsium karbonat putih karang tampak telanjang (bleaching). Bila suhu tidak segera turun, koloni karang akan mati kelaparan.
                       
                    3. Ekosistem Ventilasi Hidrotermal Laut Dalam & Kemosintesis:
                       Di batas lempeng tektonik laut dalam (mid-ocean ridges), cairan hidrotermal kaya mineral dan sulfida menyembur pada suhu >350 C.
                       Kemosintesis Bakteri: 6 CO2 + 6 H2O + 3 H2S -> C6H12O6 + 3 H2SO4.
                       Cacing tabung raksasa (Riftia pachyptila) tidak memiliki mulut atau saluran pencernaan; tubuhnya memiliki organ trofosom khusus yang menampung miliaran bakteri kemosintetik pengoksidasi belerang yang menyuplai nutrisi makanan langsung ke dalam darahnya.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Laut menyerap sekitar 30% emisi karbon dioksida antropogenik dunia, terutama diperantarai oleh pompa biologis fitoplankton.",
                    "Ekosistem kemosintesis membuktikan bahwa kehidupan organik dapat bertahan dan berkembang tanpa memerlukan sinar matahari sama sekali.",
                    "Pemutihan karang bukan sekadar perubahan warna estetik, melainkan kondisi darurat kelaparan fatal bagi koloni polip karang.",
                    "Kawasan Segitiga Terumbu Karang (Coral Triangle) Indonesia adalah pusat episentrum keanekaragaman hayati laut dunia dengan lebih dari 500 spesies karang pembangun terumbu."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Reaksi Kemosintesis Oksidasi Hidrogen Sulfida",
                        latex = "6\\mathrm{CO_2} + 6\\mathrm{H_2O} + 3\\mathrm{H_2S} \\xrightarrow{\\text{Bakteri}} \\mathrm{C_6H_{12}O_6} + 3\\mathrm{H_2SO_4}",
                        explanation = "Fiksasi karbon anorganik menjadi materi organik menggunakan energi kimiawi oksidasi sulfur oleh mikroba ekstremofil."
                    ),
                    FormulaCard(
                        title = "Indeks Tingkat Derajat Pemanasan Karang (DHW)",
                        latex = "\\mathrm{DHW} = \\sum_{i=1}^{12\\,\\text{minggu}} (\\mathrm{SST}_i - \\mathrm{MMM}), \\quad (\\text{bila } \\mathrm{SST}_i - \\mathrm{MMM} \\ge 1^\\circ\\mathrm{C})",
                        explanation = "Akumulasi stres termal laut Degree Heating Weeks; nilai DHW >= 4 memicu pemutihan karang signifikan, DHW >= 8 memicu kematian massal karang."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pemantauan Ketahanan Terumbu Karang Segitiga Karang Wakatobi & Bunaken oleh BRIN",
                    scenario = "Perairan karang Sulawesi Tenggara dan Utara mengalami anomali pemanasan suhu permukaan laut El Niño berkepanjangan.",
                    application = "Oseanografer dan biologi kelautan BRIN memadukan citra satelit suhu muka laut (NOAA Coral Reef Watch) dengan sensus transek bawah air. Mereka meneliti klad zooxanthellae toleran panas (Durusdinium trenchii) yang mampu bertahan pada suhu lebih tinggi tanpa memicu produksi ROS, serta mengembangkan transplantasi fragmen karang mikro (micro-fragmentation coral nursery) untuk merehabilitasi zona karang yang terdampak pemutihan.",
                    impact = "Menjaga kelestarian habitat pemijahan ikan karang nasional yang menopang ketahanan pangan protein dan mata pencaharian jutaan nelayan pesisir Nusantara."
                ),
                homeLab = HomeLabData(
                    title = "Pengamatan Pengaruh Pengasaman Air terhadap Cangkang Kerang Berbasis Kalsium Karbonat",
                    objective = "Mengamati dampak pengasaman samudra (ocean acidification) akibat disolusi CO2 pada organisme bercangkang kapur.",
                    materials = listOf("Dua buah cangkang kerang laut atau kulit telur ayam bersih", "Satu gelas air tawar biasa (kontrol)", "Satu gelas cuka dapur asam asetat (simulasi pengasaman ekstrem)"),
                    steps = listOf(
                        "Letakkan satu cangkang kerang di gelas air tawar dan cangkang lainnya di gelas cuka dapur.",
                        "Amati segera reaksi di gelas cuka: terbentuk gelembung-gelembung gas CO2 yang sangat banyak di permukaan cangkang kerang (CaCO3 + 2 H+ -> Ca2+ + H2O + CO2).",
                        "Biarkan terendam selama 24 jam.",
                        "Keluarkan kedua cangkang, keringkan, dan raba teksturnya.",
                        "Amati bahwa cangkang yang direndam cuka menjadi sangat tipis, rapuh, berpori, dan mudah hancur diremas jari.",
                        "Diskusikan ancaman pengasaman air laut dunia terhadap plankton foraminifera, pteropoda, dan kerangka terumbu karang."
                    ),
                    safetyNote = "Cuka dapur aman untuk praktikum rumah, hindari terkena mata."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Apakah penyebab langsung mengapa koloni terumbu karang tampak memutih (coral bleaching) saat suhu permukaan air laut mengalami kenaikan berkepanjangan?",
                        options = listOf(
                            "Polip karang mengalami stres foto-oksidatif dan terpaksa mengeluarkan alga simbion fotosintetik Zooxanthellae yang memberi warna dan nutrisi bagi karang",
                            "Air laut berubah menjadi susu kapur putih",
                            "Ikan-ikan karang memakan habis seluruh kulit karang",
                            "Polip karang tertutup oleh salju dasar laut"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Kenaikan suhu menyebabkan kerusakan aparatus fotosintesis zooxanthellae, menghasilkan radikal bebas oksigen reaktif (ROS) yang meracuni sel inang karang. Sebagai mekanisme pertahanan darurat, polip karang mengusir alga simbiotik tersebut, menyingkap kerangka kalsium karbonat putih di bawah jaringan transparan polip.",
                        misconceptionAlert = "Karang yang memutih belum tentu mati seketika; jika suhu air kembali normal dalam waktu beberapa minggu, polip karang dapat menyerap kembali zooxanthellae dan pulih kembali."
                    )
                )
            )

            "bio-epidemiologi-seir-r0" -> LessonData(
                conceptId = "bio-epidemiologi-seir-r0",
                simId = "sim-seir-epidemic-model",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, saat wabah flu baru atau pandemi melanda, bagaimana pemerintah dan ahli kesehatan bisa memprediksi puncak lonjakan kasus dan menentukan kapan pembatasan sosial harus diterapkan?",
                        narrativeContext = "Dimas melihat grafik kurva epidemiologi dan kalkulasi nilai bilangan reproduksi R0 di televisi."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka memodelkannya menggunakan Model Kompartemen Matematika SEIR, Dimas! Populasi dibagi menjadi kelompok Rentan (S), Terpapar masa inkubasi (E), Menular terinfeksi (I), dan Sembuh kebal (R).",
                        narrativeContext = "Kakek menuliskan sistem persamaan diferensial non-linear Kermack-McKendrick di papan tulis."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan parameter kunci penentu kepunahan atau ledakan wabah adalah Bilangan Reproduksi Dasar (R0). Jika intervensi vaksinasi dan masker berhasil menurunkan angka efektif Rt di bawah 1, rantai penularan pasti padam!",
                        narrativeContext = "Kirana memaparkan ambang batas kekebalan kelompok (herd immunity threshold H = 1 - 1/R0)."
                    )
                ),
                intuitionBody = """
                    Epidemiologi Kuantitatif dan Matematika Biologi memodelkan dinamika penularan penyakit menular dalam populasi untuk merancang intervensi kebijakan kesehatan masyarakat berbasis bukti.
                    
                    1. Model Kompartemen Klasik SEIR:
                       Populasi N = S + E + I + R diasumsikan konstan dalam jangka pendek:
                       - dS/dt = -beta * S * I / N (individu rentan tertular laju kontak transmisi beta).
                       - dE/dt = beta * S * I / N - sigma * E (individu terpapar dalam masa inkubasi tanpa gejala laten, bertransisi dengan laju 1/sigma).
                       - dI/dt = sigma * E - gamma * I (individu aktif menularkan gejala, pulih dengan laju pemulihan gamma = 1/durasi_infeksi).
                       - dR/dt = gamma * I (individu sembuh dengan imunitas atau meninggal).
                       
                    2. Bilangan Reproduksi Dasar (Basic Reproduction Number / R0):
                       Didefinisikan sebagai jumlah rata-rata kasus sekunder yang dihasilkan oleh satu individu terinfeksi tunggal dalam populasi yang sepenuhnya rentan:
                       R0 = beta / gamma = (Laju Kontak Transmisi) * (Rata-rata Durasi Periode Menular).
                       - Jika R0 > 1: Penyakit menyebar secara eksponensial menjadi epidemi/pandemi.
                       - Jika R0 = 1: Penyakit menjadi endemik stabil.
                       - Jika R0 < 1: Wabah meluruh dan akhirnya punah.
                       
                    3. Bilangan Reproduksi Efektif (Rt) & Ambang Kekebalan Kelompok (Herd Immunity):
                       Ketika sebagian populasi telah kebal (fraksi p):
                       R_t = R_0 * (S / N) = R_0 * (1 - p).
                       Wabah terkendali saat R_t < 1, yang mendefinisikan Ambang Batas Kekebalan Kelompok (Herd Immunity Threshold / HIT):
                       p_c = 1 - 1 / R_0.
                       
                    4. Surveilans Genomik Patogen Real-Time:
                       Mengintegrasikan data filogenetika molekuler dari sekuensing RNA virus secara berkala. Jam molekuler mutasi (molecular clock) memungkinkan estimasi laju transmisi varian baru dan pelacakan klaster penularan lintas wilayah secara presisi.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Model SEIR memperhitungkan masa inkubasi laten penyakit (E), yang sangat penting untuk penyakit seperti COVID-19 atau campak.",
                    "Nilai R0 bukan konstanta biologis mutlak suatu mikroba, melainkan fungsi dari patogenisitas mikroba DAN perilaku sosial interaksi populasi manusia.",
                    "Makin tinggi nilai R0 patogen (misal campak R0 ~ 15), makin tinggi persentase cakupan vaksinasi yang diwajibkan untuk mencapai herd immunity (p_c > 93%).",
                    "Surveilans genomik memungkinkan deteksi dini varian mutan yang lolos dari antibodi vaksin (immune escape variants)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Sistem Persamaan Diferensial Kompartemen SEIR",
                        latex = "\\frac{dS}{dt} = -\\frac{\\beta S I}{N}, \\quad \\frac{dE}{dt} = \\frac{\\beta S I}{N} - \\sigma E, \\quad \\frac{dI}{dt} = \\sigma E - \\gamma I, \\quad \\frac{dR}{dt} = \\gamma I",
                        explanation = "Model dinamika populasi kontinu yang melacak alur perpindahan individu antar kompartemen infeksi terhadap waktu."
                    ),
                    FormulaCard(
                        title = "Ambang Batas Kekebalan Kelompok (Herd Immunity Threshold)",
                        latex = "p_c = 1 - \\frac{1}{R_0}, \\quad R_t = R_0 (1 - p) < 1",
                        explanation = "Fraksi minimum populasi yang harus memiliki imunitas (melalui vaksinasi atau infeksi alami) untuk memutus penularan komunitas."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pemodelan Kurva Epidemiologi & Vaksinasi Nasional COVID-19 Kemenkes RI",
                    scenario = "Satgas Penanganan COVID-19 dan Kementerian Kesehatan RI membutuhkan proyeksi kebutuhan tempat tidur rumah sakit (BOR) dan target cakupan vaksinasi nasional.",
                    application = "Tim epidemiolog matematikawan universitas nasional dan Kemenkes memodelkan skenario intervensi menggunakan model SEIR termodifikasi bertingkat usia dan mobilitas antarpulau Google Mobility. Proyeksi nilai Rt mingguan digunakan untuk menentukan status level PPKM daerah dan menghitung target minimal 70% cakupan vaksinasi dosis ganda untuk mencapai ambang batas herd immunity terhadap varian awal.",
                    impact = "Mencegah kolapsnya fasilitas instalasi gawat darurat rumah sakit nasional dan memandu pelonggaran aktivitas ekonomi secara bertahap dan terukur."
                ),
                homeLab = HomeLabData(
                    title = "Simulasi Model Penyebaran Infeksi dan R0 Sederhana Berbasis Dadu Meja",
                    objective = "Memvisualisasikan dinamika penularan penyakit menular dan efek laju kontak terhadap angka reproduksi kasus.",
                    materials = listOf("Kertas berpetak atau 50 koin/kancing kecil (sebagai populasi rentan)", "Satu buah dadu", "Buku catatan"),
                    steps = listOf(
                        "Sebarkan 30 koin menghadap gambar (simbol kelompok Rentan / S).",
                        "Tetapkan 1 koin menghadap angka (Pasien Nol Terinfeksi / I_0).",
                        "Putaran 1: Pasien terinfeksi melempar dadu. Jika dadu menunjukkan angka 1, 2, atau 3 (probabilitas penularan 50%), ubah 1 koin S di sebelahnya menjadi terinfeksi I. Lakukan 3 kali kontak per giliran.",
                        "Koin yang sudah menularkan selama 1 putaran dipindahkan ke kelompok Sembuh (R).",
                        "Ulangi untuk putaran berikutnya dengan menghitung jumlah kasus baru I_t yang muncul.",
                        "Bandingkan skenario penularan bebas vs skenario di mana 15 koin sudah 'divaksinasi' sejak awal (koin ditandai stiker tidak bisa tertular). Amati bagaimana rantai penularan padam jauh lebih cepat."
                    ),
                    safetyNote = "Praktikum simulasi permainan papan matematika, bebas risiko fisik."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Jika suatu penyakit menular baru memiliki nilai Bilangan Reproduksi Dasar R0 = 4, berapakah persentase minimum populasi yang harus memiliki imunitas (misalnya melalui vaksinasi efektif) agar tercapai kondisi kekebalan kelompok (herd immunity)?",
                        options = listOf(
                            "75%",
                            "50%",
                            "25%",
                            "100%"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Berdasarkan rumus ambang batas kekebalan kelompok pc = 1 - 1/R0: untuk R0 = 4, maka pc = 1 - 1/4 = 1 - 0.25 = 0.75 atau 75%. Dengan 75% populasi kebal, nilai Rt efektif menjadi R0 * (1 - 0.75) = 4 * 0.25 = 1, di mana setiap penularan selanjutnya rata-rata hanya menghasilkan kurang dari 1 kasus baru sehingga wabah menyusut.",
                        misconceptionAlert = "Banyak yang mengira herd immunity membutuhkan 100% populasi kebal; rumus membuktikan bahwa kekebalan kelompok melindungi sisa populasi yang rentan tanpa harus semua orang terinfeksi."
                    )
                )
            )

            else -> null
        }
    }
}

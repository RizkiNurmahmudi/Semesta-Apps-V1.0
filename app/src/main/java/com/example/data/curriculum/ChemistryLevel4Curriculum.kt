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

object ChemistryLevel4Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "kim-atom-kuantum-slater",
            domain = Domain.KIMIA,
            topic = "Kuantum Kimia Lanjut",
            title = "Struktur Atom Kuantum & Aturan Perisai Slater",
            description = "Persamaan Schrödinger atom hidrogenik, fungsi gelombang radial dan sudut, muatan inti efektif Slater (Z_eff), dan kerapatan probabilitas elektron.",
            level = DepthLevel.L4,
            estMinutes = 20,
            prerequisites = listOf("kim-kuantum-atom", "mat-kalkulus-turunan-lanjut")
        ),
        ConceptItem(
            id = "kim-termodinamika-kimia-dasar",
            domain = Domain.KIMIA,
            topic = "Termodinamika Kimia",
            title = "Termodinamika Kimia, Energi Bebas Gibbs & van 't Hoff",
            description = "Fungsi keadaan diferensial, entropi semesta, kriteria spontanitas energi bebas Gibbs, relasi delta G° = -RT ln K, dan persamaan van 't Hoff pengaruh suhu.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("kim-termokimia", "kim-kesetimbangan")
        ),
        ConceptItem(
            id = "kim-kesetimbangan-larutan-riil",
            domain = Domain.KIMIA,
            topic = "Kimia Larutan Lanjut",
            title = "Aktivitas Debye-Hückel & Kesetimbangan Ionik Simultan",
            description = "Aktivitas ionik larutan riil, kekuatan ionik dan koefisien aktivitas Debye-Hückel, kesetimbangan sistem asam poliprotik, serta kompleksasi-kelarutan simultan.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("kim-asam-basa-lanjut", "kim-kelarutan-ksp")
        ),
        ConceptItem(
            id = "kim-kinetika-kimia-arrhenius",
            domain = Domain.KIMIA,
            topic = "Kinetika Reaksi Formal",
            title = "Hukum Laju Terintegrasi, Steady-State & Persamaan Arrhenius",
            description = "Hukum laju terintegrasi orde 0, 1, 2, waktu paruh reaksi, mekanisme reaksi bertahap, pendekatan keadaan tunak (steady-state), dan teori laju Arrhenius-Eyring.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("kim-laju-reaksi", "mat-kalkulus-integral-teknik")
        ),
        ConceptItem(
            id = "kim-elektrokimia-nernst",
            domain = Domain.KIMIA,
            topic = "Elektrokimia Formal",
            title = "Termodinamika Elektrokimia & Persamaan Nernst",
            description = "Relasi termodinamika delta G = -nFE, persamaan Nernst untuk konsentrasi non-standar, sel konsentrasi, dan penentuan parameter termodinamika dari potensial sel.",
            level = DepthLevel.L4,
            estMinutes = 20,
            prerequisites = listOf("kim-redoks-elektrokimia", "kim-termodinamika-kimia-dasar")
        ),
        ConceptItem(
            id = "kim-teori-orbital-molekul",
            domain = Domain.KIMIA,
            topic = "Struktur & Ikatan Molekuler",
            title = "Teori Orbital Molekul LCAO-MO & Paramagnetisme O2",
            description = "Teori Orbital Molekul LCAO-MO, diagram tingkat energi molekul diatomik homonuklir dan heteronuklir, orde ikatan, serta dasar kuantum paramagnetisme O2.",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("kim-ikatan-kimia", "kim-atom-kuantum-slater")
        ),
        ConceptItem(
            id = "kim-koordinasi-medan-kristal",
            domain = Domain.KIMIA,
            topic = "Kimia Anorganik Koordinasi",
            title = "Kimia Koordinasi, Teori Medan Kristal & CFSE",
            description = "Prinsip HSAB Pearson, Teori Medan Kristal (CFT) pemisahan orbital d oktahedral dan tetrahedral, kompleks spin tinggi/rendah, dan Crystal Field Stabilization Energy (CFSE).",
            level = DepthLevel.L4,
            estMinutes = 22,
            prerequisites = listOf("kim-kimia-unsur", "kim-teori-orbital-molekul")
        ),
        ConceptItem(
            id = "kim-anorganik-periodik-lanjut",
            domain = Domain.KIMIA,
            topic = "Kimia Anorganik Terpadu",
            title = "Kimia Anorganik Periodik, Diagram Latimer-Frost & Kontraksi Lantanida",
            description = "Termodinamika redoks diagram Latimer dan Frost, disproporsionasi dan komproporsionasi, efek pasangan inert unsur berat, dan kontraksi lantanida.",
            level = DepthLevel.L4,
            estMinutes = 20,
            prerequisites = listOf("kim-elektrokimia-nernst", "kim-koordinasi-medan-kristal")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "kim-atom-kuantum-slater" -> getAtomKuantumSlaterLesson()
            "kim-termodinamika-kimia-dasar" -> getTermodinamikaKimiaDasarLesson()
            "kim-kesetimbangan-larutan-riil" -> getKesetimbanganLarutanRiilLesson()
            "kim-kinetika-kimia-arrhenius" -> getKinetikaKimiaArrheniusLesson()
            "kim-elektrokimia-nernst" -> getElektrokimiaNernstLesson()
            "kim-teori-orbital-molekul" -> getTeoriOrbitalMolekulLesson()
            "kim-koordinasi-medan-kristal" -> getKoordinasiMedanKristalLesson()
            "kim-anorganik-periodik-lanjut" -> getAnorganikPeriodikLanjutLesson()
            else -> null
        }
    }

    private fun getAtomKuantumSlaterLesson(): LessonData = LessonData(
        conceptId = "kim-atom-kuantum-slater",
        storyPanels = listOf(
            StoryPanel(
                id = "p-slater-1",
                panelNumber = 1,
                title = "Di Balik Selubung Inti",
                caption = "Dimas mengamati tabel energi ionisasi dan bingung mengapa elektron terluar atom seng (Zn) tidak ditarik oleh kekuatan penuh 30 proton di inti.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Atom seng punya muatan inti +30, tapi kenapa elektron 4s terluarnya begitu mudah lepas dibandingkan jika ia ditarik oleh muatan penuh +30?"
            ),
            StoryPanel(
                id = "p-slater-2",
                panelNumber = 2,
                title = "Efek Pemerisaian Kuantum",
                caption = "Kakek tersenyum dan mengambil diagram awan probabilitas elektron dari jurnal kimia fisikanya.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Elektron-elektron di kulit dalam membentuk 'tabir pelindung' awan muatan negatif. Elektron terluar hanya merasakan muatan inti efektif Z_eff = Z - S, di mana S dihitung dengan aturan Slater."
            ),
            StoryPanel(
                id = "p-slater-3",
                panelNumber = 3,
                title = "Penyelesaian Persamaan Gelombang",
                caption = "Kirana menuliskan fungsi gelombang radial R(r) dan sudut Y(theta, phi) hasil pemisahan variabel persamaan Schrödinger atom hidrogen.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Bentuk orbital s, p, d bukan lintasan lintasan rel, melainkan fungsi densitas peluang kuantum |psi|² dV. Orbital s mampu berpenetrasi mendekati inti, menembus perisai elektron kulit dalam!"
            )
        ),
        intuition = "Dalam atom berelektron banyak, tolakan antar-elektron mengurangi tarikan langsung dari proton di inti atom. Elektron di kulit dalam 'memerintangi' atau menyaring tarikan elektrostatik inti terhadap elektron di kulit terluar. Akibatnya, elektron valensi hanya merasakan muatan inti efektif Z_eff = Z - S, di mana S adalah konstanta perisai (screening constant) yang dirumuskan oleh John C. Slater. Penetrasi orbital juga menentukan stabilitas: orbital s lebih dekat ke inti dibanding p, d, dan f pada bilangan kuantum utama yang sama.",
        intuitionPoints = listOf(
            "Elektron kulit lebih dalam (n-1, n-2) memberikan kontribusi perisai terbesar terhadap elektron terluar.",
            "Muatan inti efektif Z_eff meningkat dari kiri ke kanan dalam satu periode karena penambahan muatan inti (+1 per unsur) tidak diimbangi perisai sempurna oleh elektron di kulit yang sama (kontribusi hanya 0.35).",
            "Fungsi gelombang psi_nlm(r, theta, phi) terbagi menjadi bagian radial R_nl(r) penentu ukuran dan simpul radial, serta harmonisa bola Y_lm(theta, phi) penentu bentuk geometris orbital."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Muatan Inti Efektif Slater",
                latexFormula = "Z_{\\text{eff}} = Z - S",
                description = "Z adalah nomor atom asli dan S adalah konstanta pemerisaian yang dihitung berdasarkan kelompok orbital Slater [1s][2s,2p][3s,3p][3d][4s,4p]...",
                variableMeanings = mapOf(
                    "Z_eff" to "Muatan inti efektif yang dirasakan elektron",
                    "Z" to "Nomor atom / jumlah proton di inti",
                    "S" to "Konstanta pemerisaian (screening constant)"
                )
            ),
            FormulaCard(
                title = "Energi Orbital Hidrogenik",
                latexFormula = "E_n = -13.6 \\cdot \\frac{Z_{\\text{eff}}^2}{n^2} \\text{ eV}",
                description = "Aproksimasi energi tingkat n elektron dengan memperhitungkan muatan inti efektif Slater.",
                variableMeanings = mapOf(
                    "E_n" to "Energi tingkat n (eV)",
                    "n" to "Bilangan kuantum utama",
                    "Z_eff" to "Muatan inti efektif"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Rekayasa Pelapisan Logam Titanium Nitrida (TiN) pada Bilah Turbin PT Dirgantara Indonesia",
            industry = "Teknologi Kedirgantaraan & Material Tingkat Lanjut",
            context = "Bilah turbin pesawat terbang di PT Dirgantara Indonesia mengalami temperatur tinggi dan keausan abrasif ekstrem. Lapisan keramik Titanium Nitrida (TiN) dideposisikan menggunakan metode Physical Vapor Deposition (PVD).",
            problem = "Mengapa atom Titanium (Ti, Z=22, [Ar] 3d² 4s²) lebih mudah melepaskan elektron 4s terlebih dahulu saat terionisasi membentuk Ti²⁺ dan Ti⁴⁺ padahal saat pengisian konfigurasi elektron orbital 4s terisi sebelum 3d?",
            solution = "Berdasarkan aturan Slater, untuk elektron 4s pada konfigurasi [1s²][2s² 2p⁶][3s² 3p⁶][3d²][4s²]: S = (1 · 0.35) + (10 · 0.85) + (10 · 1.0) = 0.35 + 8.5 + 10 = 18.85, sehingga Z_eff(4s) = 22 - 18.85 = 3.15. Sementara untuk elektron 3d pada [3d²]: elektron 4s di luar tidak memerisai (kontribusi 0), sehingga S(3d) = (1 · 0.35) + (18 · 1.0) = 18.35, menghasilkan Z_eff(3d) = 22 - 18.35 = 3.65. Karena Z_eff(3d) > Z_eff(4s), orbital 3d ditarik lebih kuat oleh inti dan memiliki energi lebih rendah daripada 4s ketika terisi. Oleh karena itu, elektron 4s berada pada energi potensial lebih tinggi dan terlepas pertama kali saat ionisasi.",
            lessonsLearned = "Aturan pengisian Aufbau hanya berlaku untuk atom netral sebelum elektron masuk. Setelah orbital 3d mulai terisi, muatan inti efektif Z_eff untuk elektron 3d menjadi lebih besar daripada 4s, menjelaskan stabilitas kimiawi kation logam transisi."
        ),
        homeLab = HomeLabData(
            title = "Simulasi Probabilitas Radial Orbital Kuantum Menggunakan Pelemparan Titik Acak",
            objective = "Memvisualisasikan konsep kerapatan probabilitas elektron |psi|² dan fungsi distribusi radial 4pi r² |R(r)|² secara empiris.",
            materialsNeeded = listOf(
                "1 lembar kertas HVS putih ukuran A4",
                "Jangka dan pensil",
                "Penggaris 30 cm",
                "Dadu biasa 6 sisi",
                "Spidol berwarna"
            ),
            steps = listOf(
                "Gambar titik pusat hitam pekat di tengah kertas sebagai representasi inti atom.",
                "Buat 5 lingkaran konsentris dengan radius r = 2 cm, 4 cm, 6 cm, 8 cm, dan 10 cm dari pusat inti.",
                "Lakukan 'penembakan' titik pensil secara acak dari ketinggian 30 cm sebanyak 100 kali ke arah kertas.",
                "Hitung jumlah titik yang jatuh di setiap cincin cincin area (cincin 1: 0–2 cm, cincin 2: 2–4 cm, cincin 3: 4–6 cm, dst).",
                "Bagi jumlah titik di setiap cincin dengan luas cincin tersebut untuk mendapatkan kerapatan probabilitas |psi|², lalu amati bagaimana jumlah total titik di cincin (fungsi distribusi radial) memuncak pada jarak tertentu r_maks."
            ),
            safetyNotes = listOf(
                "Aktivitas sepenuhnya aman dilakukan di atas meja belajar.",
                "Gunakan alas karton di bawah kertas agar mata pensil tidak merusak permukaan meja."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-slater-1",
                prompt = "Berdasarkan aturan Slater, mengapa muatan inti efektif Z_eff meningkat drastis saat bergerak dari kiri ke kanan dalam satu periode tabel periodik?",
                type = "multiple_choice",
                options = listOf(
                    "Karena setiap penambahan satu proton hanya diimbangi penambahan elektron di kulit yang sama yang saling memerisai secara tidak sempurna (faktor 0.35)",
                    "Karena elektron di kulit dalam terus menghilang seiring bertambahnya nomor atom",
                    "Karena jari-jari atom membesar sehingga tarikan inti makin kuat",
                    "Karena konstanta perisai S bernilai konstan untuk semua unsur dalam satu periode"
                ),
                correctAnswer = "Karena setiap penambahan satu proton hanya diimbangi penambahan elektron di kulit yang sama yang saling memerisai secara tidak sempurna (faktor 0.35)",
                hints = listOf(
                    "Pertimbangkan kontribusi perisai antar sesama elektron pada kulit kuantum utama yang sama.",
                    "Faktor perisai elektron sesama kelompok n bernilai 0.35, sedangkan proton bertambah +1.0."
                ),
                explanation = "Setiap kali berpindah satu unsur ke kanan, muatan inti Z bertambah +1.0, namun elektron tambahan masuk ke kulit yang sama dan hanya menyumbang faktor perisai S sebesar 0.35. Akibatnya, muatan inti efektif netto bertambah sebesar 1.0 - 0.35 = +0.65 per unsur, menarik awan elektron lebih rapat ke inti.",
                misconception = "Mengira elektron pada kulit yang sama dapat saling menutupi muatan inti secara 100% sempurna."
            ),
            QuizQuestion(
                id = "q-slater-2",
                prompt = "Untuk atom Oksigen (Z = 8, konfigurasi [1s²][2s² 2p⁴]), berapakah konstanta pemerisaian S untuk salah satu elektron valensi di kulit n=2 menurut aturan Slater?",
                type = "numeric",
                correctAnswer = "3.45",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "Di kulit valensi n=2 ada total 6 elektron (2s² 2p⁴). Satu elektron ditinjau, tersisa 5 elektron lain dengan faktor 0.35.",
                    "Di kulit dalam n=1 ada 2 elektron (1s²) dengan faktor perisai 0.85.",
                    "S = (5 · 0.35) + (2 · 0.85) = ...?"
                ),
                explanation = "Konstanta perisai Slater dihitung dari: 5 elektron lain di kelompok yang sama (2s,2p) menyumbang 5 · 0.35 = 1.75; 2 elektron di kelompok (1s) menyumbang 2 · 0.85 = 1.70. Total S = 1.75 + 1.70 = 3.45. Muatan inti efektifnya adalah Z_eff = 8 - 3.45 = 4.55.",
                misconception = "Menghitung seluruh 6 elektron valensi tanpa mengurangi 1 elektron yang sedang ditinjau."
            )
        )
    )

    private fun getTermodinamikaKimiaDasarLesson(): LessonData = LessonData(
        conceptId = "kim-termodinamika-kimia-dasar",
        storyPanels = listOf(
            StoryPanel(
                id = "p-termo-kim-1",
                panelNumber = 1,
                title = "Misteri Reaksi Endotermik Spontan",
                caption = "Dimas mencampurkan padatan barium hidroksida oktahidrat dengan amonium tiosianat di atas papan kayu basah. Suhu turun drastis hingga air membeku, namun reaksi berjalan sangat spontan!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Reaksi ini menyerap kalor sangat banyak (delta H > 0) sampai air di papan membeku jadi es. Kalau endotermik, kenapa reaksinya bisa berlangsung spontan tanpa dipaksa?"
            ),
            StoryPanel(
                id = "p-termo-kim-2",
                panelNumber = 2,
                title = "Kekuatan Penggerak Entropi",
                caption = "Kakek menjelaskan konsep energi bebas Gibbs dan hukum kedua termodinamika.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Spontanitas tidak ditentukan oleh entalpi semata, Dimas, melainkan oleh perubahan energi bebas Gibbs delta G = delta H - T delta S. Reaksi ini mengubah padatan padat menjadi cairan dan gas amonia bebas, menciptakan lonjakan entropi delta S yang sangat besar!"
            ),
            StoryPanel(
                id = "p-termo-kim-3",
                panelNumber = 3,
                title = "Jembatan van 't Hoff ke Kesetimbangan",
                caption = "Kirana menuliskan hubungan fundamental antara termodinamika murni dan konstanta kesetimbangan kimia K.",
                dialogueSpeaker = "Kirana",
                dialogueText = "delta G° = -RT ln K! Artinya, dari pengukuran kalorimetri murni, kita bisa memprediksi seberapa jauh reaksi akan bergeser pada kesetimbangan dan bagaimana konstanta K berubah terhadap suhu melalui persamaan van 't Hoff."
            )
        ),
        intuition = "Energi bebas Gibbs (G) adalah potensi termodinamika yang mengukur kerja non-PV maksimum yang dapat dihasilkan oleh sistem pada suhu dan tekanan konstan. Kriteria kespontanan proses alami adalah penurunan energi bebas Gibbs semesta (delta G < 0). Hubungan delta G° = -RT ln K menghubungkan energi kimia standar dengan posisi kesetimbangan K. Persamaan van 't Hoff memperlihatkan bahwa reaksi endotermik (delta H° > 0) memiliki nilai K yang meningkat seiring kenaikan suhu, sedangkan reaksi eksotermik (delta H° < 0) nilai K-nya justru menurun saat dipanaskan.",
        intuitionPoints = listOf(
            "delta G = delta H - T delta S: reaksi spontan jika delta G < 0. Pada suhu tinggi, suku entropi (-T delta S) mendominasi.",
            "Keadaan kesetimbangan tercapai saat delta G = 0, di mana gradien potensial kimia reaktan sama persis dengan produk.",
            "Persamaan van 't Hoff d(ln K)/dT = delta H° / (R T²) menjelaskan arah pergeseran kesetimbangan Le Chatelier secara kuantitatif kalkulus."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Energi Bebas Gibbs & Kespontanan",
                latexFormula = "\\Delta G = \\Delta H - T\\Delta S",
                description = "Kriteria termodinamika spontanitas pada suhu T dan tekanan P konstan: delta G < 0 (spontan), delta G = 0 (kesetimbangan), delta G > 0 (tidak spontan).",
                variableMeanings = mapOf(
                    "\\Delta G" to "Perubahan energi bebas Gibbs (J atau kJ)",
                    "\\Delta H" to "Perubahan entalpi reaksi (J)",
                    "T" to "Suhu mutlak sistem (Kelvin)",
                    "\\Delta S" to "Perubahan entropi sistem (J/K)"
                )
            ),
            FormulaCard(
                title = "Hubungan Gibbs Standar & Tetapan Kesetimbangan",
                latexFormula = "\\Delta G^\\circ = -RT \\ln K",
                description = "Menghubungkan energi bebas standar reaksi dengan konstanta kesetimbangan termodinamika K.",
                variableMeanings = mapOf(
                    "\\Delta G^\\circ" to "Energi bebas Gibbs standar reaksi (J/mol)",
                    "R" to "Konstanta gas universal (8.314 J/(mol·K))",
                    "K" to "Konstanta kesetimbangan reaksi"
                )
            ),
            FormulaCard(
                title = "Persamaan Terintegrasi van 't Hoff",
                latexFormula = "\\ln\\left(\\frac{K_2}{K_1}\\right) = -\\frac{\\Delta H^\\circ}{R}\\left(\\frac{1}{T_2} - \\frac{1}{T_1}\\right)",
                description = "Menghitung perubahan tetapan kesetimbangan kimia K dari suhu T1 ke T2 dengan asumsi delta H° konstan.",
                variableMeanings = mapOf(
                    "K_1, K_2" to "Konstanta kesetimbangan pada suhu T1 dan T2",
                    "\\Delta H^\\circ" to "Entalpi reaksi standar (J/mol)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Optimasi Termodinamika Sintesis Urea di PT Pupuk Sriwidjaja (Pusri) Palembang",
            industry = "Industri Pupuk & Petrokimia Nasional",
            context = "PT Pusri memproduksi jutaan ton pupuk urea setiap tahun dari amonia dan karbon dioksida melalui dua tahap reaksi di dalam reaktor sintesis bertekanan 150-200 bar.",
            problem = "Tahap 1 (pembentukan amonium karbamat: 2NH₃ + CO₂ ⇌ NH₂COONH₄) bersifat sangat eksotermik (delta H° = -117 kJ/mol), sedangkan Tahap 2 (dehidrasi karbamat menjadi urea: NH₂COONH₄ ⇌ CO(NH₂)₂ + H₂O) bersifat endotermik (delta H° = +15.5 kJ/mol). Berapa kompromi suhu optimal reaktor agar konversi urea maksimum tercapai?",
            solution = "Berdasarkan persamaan van 't Hoff, pada Tahap 1, kenaikan suhu menurunkan K_1 karena delta H° < 0. Namun pada Tahap 2, kenaikan suhu menaikkan K_2 karena delta H° > 0. Selain itu, kinetika reaksi dehidrasi sangat lambat pada suhu rendah. Insinyur PT Pusri mengoperasikan reaktor pada suhu kompromi 185–190°C dengan tekanan 150–200 bar. Tekanan sangat tinggi diterapkan untuk memaksa kesetimbangan Tahap 1 tetap ke kanan (karena delta n gas = -3), sementara suhu 185°C memastikan dehidrasi karbamat berjalan cepat dan spontan secara entropi.",
            lessonsLearned = "Desain reaktor kimia industri skala raksasa memerlukan optimasi simultan antara termodinamika kesetimbangan (Gibbs dan van 't Hoff) dengan batasan kinetika reaksi nyata."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Termodinamika Spontanitas Pelarutan Pupuk Urea vs Garam Dapur",
            objective = "Mengamati fenomena penyerapan kalor endotermik yang didorong oleh kenaikan entropi pelarutan padatan kristal.",
            materialsNeeded = listOf(
                "2 gelas kaca bening transparan",
                "Air keran suhu ruang (100 mL per gelas)",
                "Termometer digital dapur (atau pengamatan sentuhan tangan)",
                "3 sendok makan pupuk urea (atau es instan cold-pack)",
                "3 sendok makan garam dapur (NaCl)"
            ),
            steps = listOf(
                "Tuangkan 100 mL air pada suhu ruang ke dalam masing-masing gelas, catat suhu awal (misal 28°C).",
                "Masukkan 3 sendok makan garam dapur ke gelas 1, aduk hingga larut. Ukur dan catat suhunya (perubahan suhu sangat kecil, hampir netral).",
                "Masukkan 3 sendok makan urea ke gelas 2, aduk cepat. Amati dinding luar gelas dan ukur suhunya dengan termometer.",
                "Perhatikan bahwa suhu gelas urea turun drastis (hingga 15–18°C) dan dinding luar berembun dingin.",
                "Simpulkan: meskipun proses pelarutan urea menyerap kalor (delta H > 0, endotermik), pelarutan tetap spontan karena struktur kisi kristal padat terurai menjadi molekul bebas dalam air (delta S >> 0), sehingga delta G = delta H - T delta S bernilai negatif!"
            ),
            safetyNotes = listOf(
                "Gunakan sendok terpisah dan jangan meminum larutan pupuk urea.",
                "Cuci tangan dengan sabun setelah selesai praktikum."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-termo-kim-1",
                prompt = "Sebuah reaksi memiliki perubahan entalpi standar delta H° = +40 kJ/mol dan perubahan entropi standar delta S° = +100 J/(mol·K). Pada rentang suhu berapakah reaksi tersebut berlangsung secara spontan (delta G° < 0)?",
                type = "multiple_choice",
                options = listOf(
                    "Pada suhu T > 400 K",
                    "Pada suhu T < 400 K",
                    "Reaksi tidak akan pernah spontan pada suhu berapapun",
                    "Reaksi selalu spontan pada semua suhu"
                ),
                correctAnswer = "Pada suhu T > 400 K",
                hints = listOf(
                    "Syarat spontan: delta G = delta H - T delta S < 0.",
                    "Perhatikan satuan: delta H = 40.000 J/mol, delta S = 100 J/(mol·K).",
                    "40.000 - T(100) < 0 => T > 40.000 / 100."
                ),
                explanation = "delta G = delta H - T delta S < 0 <=> 40.000 J/mol - T(100 J/(mol·K)) < 0 <=> 100 T > 40.000 <=> T > 400 K (atau 127°C). Pada suhu di atas 400 K, suku entropi -T delta S menjadi lebih besar secara negatif daripada delta H positif, menjadikan delta G < 0.",
                misconception = "Lupa mengonversi satuan kJ ke J sehingga salah membagi 40 dengan 100 menghasilkan 0.4 K."
            ),
            QuizQuestion(
                id = "q-termo-kim-2",
                prompt = "Jika suatu reaksi kimia memiliki delta G° = 0 pada suhu 300 K, berapakah nilai konstanta kesetimbangan K reaksi tersebut?",
                type = "numeric",
                correctAnswer = "1",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "Gunakan rumus delta G° = -RT ln K.",
                    "Jika delta G° = 0, maka -RT ln K = 0.",
                    "ln K = 0 <=> K = e⁰ = ...?"
                ),
                explanation = "Dari relasi delta G° = -RT ln K, jika delta G° = 0, maka ln K = 0. Bilangan yang logaritma naturalnya bernilai nol adalah K = e⁰ = 1. Ini berarti pada keadaan standar, reaktan dan produk berada pada posisi kesetimbangan sempurna dengan aktivitas sama.",
                misconception = "Mengira jika delta G° = 0 maka konstanta kesetimbangan K = 0 (padahal K = 1)."
            )
        )
    )

    private fun getKesetimbanganLarutanRiilLesson(): LessonData = LessonData(
        conceptId = "kim-kesetimbangan-larutan-riil",
        storyPanels = listOf(
            StoryPanel(
                id = "p-larutan-riil-1",
                panelNumber = 1,
                title = "Anomali Larutan Elektrolit Pekat",
                caption = "Dimas menghitung pH larutan HCl 0.1 M menggunakan rumus standar SMA dan mendapatkan pH = 1.0. Namun elektroda pH-meter laboratorium yang terkalibrasi menunjukkan angka 1.10!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kenapa pH terukur berbeda 0.1 unit dari perhitungan konsentrasi molar teoritis? Apakah alat ukurnya yang rusak?"
            ),
            StoryPanel(
                id = "p-larutan-riil-2",
                panelNumber = 2,
                title = "Aktivitas Kimia & Efek Debye-Hückel",
                caption = "Kakek menjelaskan bahwa pada konsentrasi nyata, ion-ion saling berinteraksi secara elektrostatik membentuk 'atmosfer ion'.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Dalam larutan riil, ion tidak bergerak bebas sepenuhnya, Dimas. Tarikan ion berlawanan menurunkan konsentrasi efektif yang aktif secara termodinamika. Kita harus menggunakan aktivitas a = gamma · C, bukan konsentrasi C langsung!"
            ),
            StoryPanel(
                id = "p-larutan-riil-3",
                panelNumber = 3,
                title = "Kekuatan Ionik & Keseimbangan Simultan",
                caption = "Kirana memodelkan kesetimbangan asam poliprotik dan kelarutan simultan di bawah pengaruh kekuatan ionik I.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Hukum pembatas Debye-Hückel menghitung koefisien aktivitas gamma dari kekuatan ionik larutan I = 1/2 sum(c_i z_i²). Dengan ini, kita bisa memecahkan sistem kompleks seperti presipitasi selektif limbah tambang!"
            )
        ),
        intuition = "Pada larutan ideal yang sangat encer, ion-ion dianggap tidak berinteraksi satu sama lain. Namun pada larutan riil, setiap kation dikelilingi oleh awan anion (atmosfer ionik), dan sebaliknya. Interaksi elektrostatik ini menstabilkan ion dan menurunkan reaktivitasnya, sehingga 'konsentrasi efektif' atau aktivitasnya a = gamma · C lebih kecil dari konsentrasi analitiknya (koefisien aktivitas gamma < 1). Peter Debye dan Erich Hückel merumuskan persamaan untuk memprediksi koefisien aktivitas dari muatan ion dan kekuatan ionik larutan I.",
        intuitionPoints = listOf(
            "Aktivitas a_i = gamma_i · [C_i] adalah besaran termodinamika sejati yang menentukan pH, potensial elektroda, dan kesetimbangan kimia.",
            "Kekuatan ionik I = 0.5 sum(c_i z_i²) memperhitungkan seluruh ion terlarut, termasuk ion asing yang tidak terlibat langsung dalam reaksi.",
            "Penambahan garam netral (seperti NaNO₃) meningkatkan kekuatan ionik I, menurunkan koefisien gamma, dan akibatnya justru dapat MENINGKATKAN kelarutan endapan garam sedikit larut (efek garam asing / salt-in effect)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Kekuatan Ionik Larutan (Ionic Strength)",
                latexFormula = "I = \\frac{1}{2} \\sum_{i} c_i z_i^2",
                description = "Mengukur total konsentrasi muatan ion dalam larutan, di mana c_i adalah konsentrasi ion i dan z_i adalah valensi muatan ion tersebut.",
                variableMeanings = mapOf(
                    "I" to "Kekuatan ionik (mol/L atau M)",
                    "c_i" to "Konsentrasi molar ion ke-i",
                    "z_i" to "Bilangan muatan ion ke-i"
                )
            ),
            FormulaCard(
                title = "Hukum Pembatas Debye-Hückel (Air pada 25°C)",
                latexFormula = "\\log \\gamma_i = -0.509 \\cdot z_i^2 \\sqrt{I}",
                description = "Menghitung koefisien aktivitas ion tunggal gamma_i pada larutan encer (I < 0.01 M).",
                variableMeanings = mapOf(
                    "\\gamma_i" to "Koefisien aktivitas ion ke-i",
                    "z_i" to "Muatan ion ke-i",
                    "I" to "Kekuatan ionik larutan (M)"
                )
            ),
            FormulaCard(
                title = "Koefisien Aktivitas Rata-rata Garam",
                latexFormula = "\\log \\gamma_\\pm = -0.509 \\cdot |z_+ z_-| \\sqrt{I}",
                description = "Koefisien aktivitas rata-rata termodinamika untuk elektrolit simetris maupun tak simetris.",
                variableMeanings = mapOf(
                    "\\gamma_\\pm" to "Koefisien aktivitas ionik rata-rata",
                    "z_+, z_-" to "Muatan kation dan anion"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengelolaan Air Asam Tambang & Presipitasi Selektif di PT Bukit Asam",
            industry = "Industri Pertambangan & Pengolahan Lingkungan",
            context = "Air asam tambang (Acid Mine Drainage / AMD) di area penambangan batubara mengandung sulfat pekat serta kation terlarut Fe²⁺, Fe³⁺, Al³⁺, dan Ca²⁺ dengan kekuatan ionik tinggi I > 0.1 M.",
            problem = "Jika insinyur menggunakan rumus Ksp ideal untuk memprediksi pH pengendapan Fe(OH)₃ dan Al(OH)₃ dengan kapur tohor (CaO), pengendapan tidak terjadi pada pH yang dihitung dan banyak logam berat tetap lolos ke sungai.",
            solution = "Pada kekuatan ionik tinggi (I = 0.15 M), koefisien aktivitas ion multivalen Fe³⁺ dan Al³⁺ turun drastis menjadi gamma ≈ 0.18 akibat penarikan kuat oleh anion sulfat SO₄²⁻. Agar hasil kali aktivitas (a_Fe³⁺ · (a_OH⁻)³) melampaui Ksp termodinamika murni, konsentrasi analitik ion OH⁻ harus ditingkatkan sekitar 3–5 kali lipat lebih tinggi daripada perhitungan ideal. Insinyur PT Bukit Asam memasukkan koreksi Debye-Hückel terperluas ke dalam sistem kontrol otomatis injeksi kapur, menjaga pH air olahan presisi pada 7.5–8.2 sehingga 99.8% logam berat berhasil diendapkan sempurna.",
            lessonsLearned = "Mengabaikan koefisien aktivitas pada larutan elektrolit pekat akan menyebabkan galat prediksi konsentrasi hingga beberapa ratus persen dalam teknik lingkungan industri."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Efek Kekuatan Ionik Garam Asing pada Kelarutan Kalsium Sulfat",
            objective = "Mengamati peningkatan kelarutan garam sedikit larut (efek garam asing / salt-in) akibat kenaikan kekuatan ionik larutan.",
            materialsNeeded = listOf(
                "Bubuk gips (kalsium sulfat, CaSO4) - tersedia di toko bangunan atau bahan prakarya (2 sendok teh)",
                "2 gelas kaca bening transparan berukuran sama",
                "Air minum murni / demineral (200 mL)",
                "Garam dapur murni (NaCl) tanpa yodium (2 sendok makan)",
                "Sendok pengaduk dan saringan teh"
            ),
            steps = listOf(
                "Isi gelas A dengan 100 mL air murni, dan gelas B dengan 100 mL air murni yang telah dilarutkan 2 sendok makan garam dapur (NaCl pekat sehingga kekuatan ionik I tinggi).",
                "Tambahkan masing-masing 1 sendok teh bubuk gips (CaSO4) ke dalam gelas A dan gelas B.",
                "Aduk kedua gelas dengan kecepatan dan durasi yang sama (selama 3 menit penuh), lalu biarkan mengendap selama 10 menit.",
                "Amati kejernihan larutan di atas endapan dan tinggi endapan di dasar gelas.",
                "Hasil: Gelas B yang mengandung NaCl menunjukkan bahwa lebih banyak CaSO4 yang larut (endapan di dasar lebih sedikit) dibanding gelas A! Ion Na⁺ dan Cl⁻ membungkus ion Ca²⁺ dan SO₄²⁻, menurunkan koefisien aktivitas gamma, sehingga lebih banyak CaSO4 padat yang harus larut untuk mencapai Ksp."
            ),
            safetyNotes = listOf(
                "Hindari menghirup debu bubuk gips kering.",
                "Eksperimen menggunakan bahan rumah tangga non-toksik."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-larutan-riil-1",
                prompt = "Berapakah kekuatan ionik (I) dari larutan Kalsium Klorida (CaCl₂) dengan konsentrasi 0.02 M jika terdisosiasi sempurna menjadi Ca²⁺ dan 2Cl⁻?",
                type = "numeric",
                correctAnswer = "0.06",
                tolerance = 0.005f,
                unit = "M",
                hints = listOf(
                    "Gunakan rumus I = 0.5 · sum(c_i · z_i²).",
                    "c(Ca²⁺) = 0.02 M dengan z = +2 (z² = 4).",
                    "c(Cl⁻) = 0.04 M dengan z = -1 (z² = 1).",
                    "I = 0.5 · [0.02(4) + 0.04(1)] = ...?"
                ),
                explanation = "I = 0.5 · [c(Ca²⁺) · (+2)² + c(Cl⁻) · (-1)²] = 0.5 · [0.02 · 4 + 0.04 · 1] = 0.5 · [0.08 + 0.04] = 0.5 · 0.12 = 0.06 M.",
                misconception = "Lupa mengalikan konsentrasi klorida dengan 2 (karena menghasilkan 2 ion Cl⁻ per molekul CaCl₂)."
            ),
            QuizQuestion(
                id = "q-larutan-riil-2",
                prompt = "Mengapa penambahan garam netral yang tidak memiliki ion sejenis (misalnya menambahkan KNO₃ ke dalam larutan jenuh AgCl) dapat sedikit MENINGKATKAN kelarutan AgCl?",
                type = "multiple_choice",
                options = listOf(
                    "Karena kekuatan ionik larutan meningkat, sehingga koefisien aktivitas ion Ag⁺ dan Cl⁻ menurun dan butuh konsentrasi molar lebih tinggi untuk mencapai nilai Ksp aktivitas",
                    "Karena ion K⁺ bereaksi membentuk endapan baru dengan ion Cl⁻",
                    "Karena penambahan KNO₃ menaikkan suhu larutan secara drastis",
                    "Karena terjadi reaksi redoks antara perak dan ion nitrat"
                ),
                correctAnswer = "Karena kekuatan ionik larutan meningkat, sehingga koefisien aktivitas ion Ag⁺ dan Cl⁻ menurun dan butuh konsentrasi molar lebih tinggi untuk mencapai nilai Ksp aktivitas",
                hints = listOf(
                    "Ingat relasi Ksp = a(Ag⁺) · a(Cl⁻) = [Ag⁺]·gamma · [Cl⁻]·gamma.",
                    "Jika koefisien gamma mengecil di bawah 1, maka perkalian [Ag⁺][Cl⁻] harus membesar agar nilainya tetap sama dengan Ksp."
                ),
                explanation = "Penambahan ion K⁺ dan NO₃⁻ menaikkan kekuatan ionik I, yang berdasarkan hukum Debye-Hückel menurunkan koefisien aktivitas gamma ion Ag⁺ dan Cl⁻. Karena Ksp = gamma_Ag · [Ag⁺] · gamma_Cl · [Cl⁻] bernilai konstan, penurunan gamma mengharuskan konsentrasi analitik [Ag⁺] dan [Cl⁻] meningkat, yang berarti kelarutan garam meningkat (efek garam asing).",
                misconception = "Menyamakan efek garam asing dengan efek ion senama (efek ion senama selalu MENURUNKAN kelarutan, sedangkan efek garam asing MENAIKKAN kelarutan)."
            )
        )
    )

    private fun getKinetikaKimiaArrheniusLesson(): LessonData = LessonData(
        conceptId = "kim-kinetika-kimia-arrhenius",
        storyPanels = listOf(
            StoryPanel(
                id = "p-kinetika-lanjut-1",
                panelNumber = 1,
                title = "Misteri Reaksi Bertahap",
                caption = "Dimas heran melihat reaksi 2NO + 2H₂ -> N₂ + 2H₂O memiliki persamaan laju v = k [NO]² [H₂], bukan [NO]² [H₂]² seperti koefisien stoikiometrinya.",
                dialogueSpeaker = "Dimas",
                dialogueText = "Kenapa orde reaksi terhadap H₂ hanya satu, padahal koefisien reaksinya dua? Bukankah seharusnya tumbukannya melibatkan dua molekul H₂?"
            ),
            StoryPanel(
                id = "p-kinetika-lanjut-2",
                panelNumber = 2,
                title = "Pendekatan Keadaan Tunak (Steady-State)",
                caption = "Kakek menuliskan mekanisme reaksi multitahap yang melibatkan zat antara (intermediet) N₂O₂.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Reaksi kimia jarang terjadi melalui tumbukan 4 molekul sekaligus! Reaksi berlangsung lewat beberapa tahap elementer. Karena zat antara N₂O₂ sangat reaktif dan berumur pendek, laju pembentukan dan penguraiannya sama: d[N₂O₂]/dt ≈ 0 (Steady-State Approximation)."
            ),
            StoryPanel(
                id = "p-kinetika-lanjut-3",
                panelNumber = 3,
                title = "Grafik Arrhenius & Energi Aktivasi",
                caption = "Kirana menggambar plot ln k terhadap 1/T dan menunjukkan bagaimana kemiringan garis lurus mengungkap energi aktivasi Ea.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Persamaan Arrhenius k = A exp(-Ea / RT) menunjukkan bahwa fraksi molekul yang memiliki energi cukup untuk melintasi puncak keadaan transisi bertambah secara eksponensial terhadap suhu!"
            )
        ),
        intuition = "Hukum laju reaksi ditentukan oleh mekanisme reaksi tahap demi tahap, di mana tahap paling lambat bertindak sebagai tahap penentu laju (rate-determining step / RDS). Untuk mekanisme kompleks dengan beberapa tahap reversibel, kita menggunakan Pendekatan Keadaan Tunak (Steady-State Approximation / SSA), yang mengasumsikan konsentrasi zat antara (intermediet) reaktif bernilai sangat kecil dan konstan terhadap waktu (d[Intermediet]/dt = 0). Persamaan Arrhenius dan Teori Keadaan Transisi Eyring menghubungkan konstanta laju k dengan penghalang energi bebas aktivasi delta G^‡.",
        intuitionPoints = listOf(
            "Hukum laju terintegrasi: Orde 0 ([A] = [A]0 - kt), Orde 1 (ln[A] = ln[A]0 - kt), Orde 2 (1/[A] = 1/[A]0 + kt).",
            "Waktu paruh t_1/2 reaksi orde 1 bersifat konstan tidak bergantung konsentrasi awal: t_1/2 = ln(2)/k.",
            "Plot Arrhenius: grafik ln k versus 1/T menghasilkan garis lurus dengan kemiringan -Ea/R dan titik potong sumbu-y sebesar ln A."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Hukum Laju Terintegrasi Orde 1 & 2",
                latexFormula = "\\ln\\left(\\frac{[A]_0}{[A]_t}\\right) = k t \\quad ; \\quad \\frac{1}{[A]_t} - \\frac{1}{[A]_0} = k t",
                description = "Persamaan linierisasi perubahan konsentrasi terhadap waktu untuk orde 1 dan orde 2.",
                variableMeanings = mapOf(
                    "[A]_0, [A]_t" to "Konsentrasi reaktan pada t=0 dan t waktu tertentu (M)",
                    "k" to "Konstanta laju reaksi",
                    "t" to "Waktu reaksi (s)"
                )
            ),
            FormulaCard(
                title = "Persamaan Arrhenius Terintegrasi",
                latexFormula = "\\ln\\left(\\frac{k_2}{k_1}\\right) = -\\frac{E_a}{R}\\left(\\frac{1}{T_2} - \\frac{1}{T_1}\\right)",
                description = "Menghitung energi aktivasi Ea atau konstanta laju k pada suhu berbeda.",
                variableMeanings = mapOf(
                    "k_1, k_2" to "Konstanta laju reaksi pada suhu T1 dan T2",
                    "E_a" to "Energi aktivasi reaksi (J/mol)",
                    "R" to "Konstanta gas universal (8.314 J/(mol·K))",
                    "T_1, T_2" to "Suhu mutlak (Kelvin)"
                )
            ),
            FormulaCard(
                title = "Pendekatan Keadaan Tunak (SSA)",
                latexFormula = "\\frac{d[I]}{dt} = \\sum r_{\\text{pembentukan}} - \\sum r_{\\text{konsumsi}} \\approx 0",
                description = "Asumsi untuk intermediet reaktif I berumur sangat pendek dalam mekanisme multitahap.",
                variableMeanings = mapOf(
                    "[I]" to "Konsentrasi zat antara / intermediet reaksi",
                    "r" to "Laju pembentukan dan konsumsi intermediet"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Kinetika Perengkahan Katalitik Termal (FCC) di Kilang Pertamina RU IV Cilacap",
            industry = "Kilang Pengolahan Minyak Bumi & Petrokimia",
            context = "Fluid Catalytic Cracking (FCC) di Pertamina Cilacap memutus rantai hidrokarbon berat (gasoil vakum) menjadi fraksi bensin beroktan tinggi dan LPG menggunakan katalis zeolit berpori.",
            problem = "Reaksi perengkahan termal tanpa katalis memiliki energi aktivasi sangat tinggi Ea = 250 kJ/mol dan menghasilkan banyak arang kokas tak berguna. Bagaimana katalis zeolit memodifikasi jalur keadaan transisi?",
            solution = "Dengan adanya katalis zeolit asam padat, mekanisme reaksi berpindah dari mekanisme radikal bebas energi tinggi ke mekanisme pembentukan ion karbokation pada sisi aktif asam Brønsted zeolit. Energi aktivasi turun drastis dari 250 kJ/mol menjadi 85 kJ/mol. Menggunakan persamaan Arrhenius pada suhu operasi 520°C (793 K), penurunan Ea sebesar 165 kJ/mol ini meningkatkan konstanta laju reaksi sebesar faktor exp((165.000)/(8.314 · 793)) ≈ exp(25) ≈ 7 × 10¹⁰ kali lipat! Hasilnya, reaktor riser FCC dapat memproses minyak mentah hanya dalam waktu kontak 2–4 detik.",
            lessonsLearned = "Katalis tidak mengubah termodinamika delta G keseluruhan reaksi, melainkan menyediakan jalur reaksi baru dengan energi aktivasi Ea yang jauh lebih rendah."
        ),
        homeLab = HomeLabData(
            title = "Pengamatan Kinetika Dekolorisasi Iodin oleh Vitamin C pada Berbagai Suhu",
            objective = "Mengukur laju reaksi redoks pada berbagai suhu untuk mengamati peningkatan laju reaksi secara eksponensial (prinsip Arrhenius).",
            materialsNeeded = listOf(
                "Larutan antiseptik iodin (Betadine) 1 botol kecil",
                "Tablet vitamin C (asam askorbat) 500 mg, dihaluskan",
                "3 gelas kaca bening",
                "Air es (5°C), air suhu ruang (28°C), dan air hangat suam kuku (50°C)",
                "Stopwatch pada smartphone"
            ),
            steps = listOf(
                "Larutkan 1 tablet vitamin C halus ke dalam 100 mL air untuk membuat larutan stok vitamin C.",
                "Siapkan 3 gelas: Gelas A (50 mL air es), Gelas B (50 mL air suhu ruang), dan Gelas C (50 mL air hangat).",
                "Teteskan 10 tetes Betadine ke masing-masing gelas hingga air berwarna cokelat kemerahan homogen.",
                "Tambahkan 1 sendok teh larutan vitamin C ke Gelas A sambil menyalakan stopwatch. Catat waktu hingga warna cokelat iodin tepat berubah menjadi bening sempurna.",
                "Ulangi prosedur yang sama untuk Gelas B dan Gelas C.",
                "Bandingkan waktu reaksi: Gelas C (air hangat) bereaksi paling cepat (hanya beberapa detik), sedangkan Gelas A (air es) membutuhkan waktu paling lama. Plot perkiraan laju (1/waktu) terhadap suhu menunjukkan peningkatan laju non-linear sesuai kurva Arrhenius!"
            ),
            safetyNotes = listOf(
                "Gunakan air hangat yang aman disentuh (maksimum 50°C), jangan gunakan air mendidih.",
                "Jauhkan larutan Betadine dari pakaian agar tidak meninggalkan noda permanen."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-kinetika-lanjut-1",
                prompt = "Suatu reaksi penguraian obat farmasi mengikuti kinetika orde 1 dengan konstanta laju k = 0.0231 hari⁻¹. Berapakah waktu paruh (t_1/2) dari obat tersebut?",
                type = "numeric",
                correctAnswer = "30",
                tolerance = 0.5f,
                unit = "hari",
                hints = listOf(
                    "Untuk reaksi orde 1, rumus waktu paruh adalah t_1/2 = ln(2) / k.",
                    "ln(2) ≈ 0.693.",
                    "t_1/2 = 0.693 / 0.0231 = ...?"
                ),
                explanation = "Waktu paruh reaksi orde 1: t_1/2 = ln(2) / k = 0.69315 / 0.0231 hari⁻¹ = 30 hari. Konsentrasi obat akan berkurang menjadi separuh dari kadar awal setiap 30 hari penyimpanan.",
                misconception = "Menggunakan rumus t_1/2 = [A]0 / (2k) yang merupakan rumus untuk reaksi orde nol, bukan orde satu."
            ),
            QuizQuestion(
                id = "q-kinetika-lanjut-2",
                prompt = "Berdasarkan Teori Keadaan Transisi Eyring dan persamaan Arrhenius, apa yang secara langsung menentukan nilai faktor pra-eksponensial A?",
                type = "multiple_choice",
                options = listOf(
                    "Frekuensi tumbukan molekul dan entropi aktivasi (orientasi spasial tumbukan yang tepat)",
                    "Besarnya energi aktivasi reaksi Ea",
                    "Suhu mutlak lingkungan reaksi",
                    "Tekanan atmosfer tempat percobaan dilakukan"
                ),
                correctAnswer = "Frekuensi tumbukan molekul dan entropi aktivasi (orientasi spasial tumbukan yang tepat)",
                hints = listOf(
                    "Faktor A sering disebut faktor frekuensi tumbukan / sterik.",
                    "A = (k_B T / h) · exp(delta S^‡ / R)."
                ),
                explanation = "Faktor frekuensi Arrhenius A mencakup frekuensi tumbukan antar-molekul reaktan serta faktor orientasi spasial (faktor sterik). Dalam teori Eyring, ini dinyatakan sebagai fungsi dari entropi aktivasi delta S^‡: semakin rumit orientasi geometri yang dibutuhkan untuk membentuk kompleks teraktivasi, semakin rendah entropi aktivasi dan semakin kecil nilai A.",
                misconception = "Mengira faktor A semata-mata tetapan sembarang tanpa dasar fisis struktural."
            )
        )
    )

    private fun getElektrokimiaNernstLesson(): LessonData = LessonData(
        conceptId = "kim-elektrokimia-nernst",
        storyPanels = listOf(
            StoryPanel(
                id = "p-nernst-1",
                panelNumber = 1,
                title = "Voltmeter di Luar Keadaan Standar",
                caption = "Dimas merakit sel Daniell Zn-Cu di laboratorium dengan larutan Cu²⁺ 0.001 M dan Zn²⁺ 1.0 M. Voltmeter terbaca 1.01 V, bukan 1.10 V seperti tabel potensial standar!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Tabel buku teks menuliskan E° sel Daniell adalah 1.10 V. Kenapa voltmeternya cuma membaca 1.01 V? Apakah elektroda saya kotor?"
            ),
            StoryPanel(
                id = "p-nernst-2",
                panelNumber = 2,
                title = "Hukum Walther Nernst",
                caption = "Kakek menunjukkan hubungan antara energi bebas termodinamika reaksi redoks dan potensial sel listrik.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Potensial standar E° hanya berlaku jika semua konsentrasi tepat 1.0 M dan tekanan 1 atm, Dimas! Karena delta G = -nFE dan delta G = delta G° + RT ln Q, maka E = E° - (RT/nF) ln Q. Persamaan Nernst ini mengatur seluruh sel elektrokimia nyata!"
            ),
            StoryPanel(
                id = "p-nernst-3",
                panelNumber = 3,
                title = "Keajaiban Sel Konsentrasi",
                caption = "Kirana memperlihatkan bahwa dua elektroda tembaga yang identik pun dapat menghasilkan arus listrik jika konsentrasi larutannya berbeda.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Bahkan dengan dua kawat tembaga identik tanpa logam lain, kita bisa menghasilkan tegangan listrik murni dari gradien konsentrasi: E = -(0.0592/n) log([Cu²⁺]_encer / [Cu²⁺]_pekat). Ini adalah prinsip dasar sensor ion dan impuls saraf biologis!"
            )
        ),
        intuition = "Potensial sel listrik (E) adalah manifestasi langsung dari perbedaan energi bebas Gibbs per mol elektron yang ditransfer: delta G = -nFE. Ketika reaksi berlangsung, reaktan terkonsumsi dan produk bertambah, sehingga kuosien reaksi Q meningkat. Berdasarkan persamaan Nernst, bertambahnya Q menurunkan potensial sel E hingga akhirnya E = 0 ketika reaksi mencapai kesetimbangan (baterai habis / mati). Sel konsentrasi membuktikan bahwa gaya gerak listrik dapat dihasilkan semata-mata dari kecenderungan entropis larutan pekat untuk berdifusi menjadi encer.",
        intuitionPoints = listOf(
            "delta G = -nFE: potensial sel positif (E > 0) menandakan reaksi redoks berlangsung spontan (delta G < 0).",
            "Persamaan Nernst pada 298 K: E = E° - (0.0592 / n) log Q.",
            "Saat baterai mencapai kesetimbangan sempurna: E = 0 dan Q = K, sehingga E° = (0.0592 / n) log K, memberikan cara eksperimental paling presisi untuk mengukur konstanta kesetimbangan kimia K yang sangat besar atau sangat kecil."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Relasi Termodinamika Elektrokimia",
                latexFormula = "\\Delta G = -n F E \\quad ; \\quad \\Delta G^\\circ = -n F E^\\circ",
                description = "Menghubungkan kerja listrik reversibel maksimum dengan perubahan energi bebas Gibbs.",
                variableMeanings = mapOf(
                    "\\Delta G" to "Energi bebas Gibbs reaksi (J/mol)",
                    "n" to "Jumlah elektron yang ditransfer dalam persamaan redoks",
                    "F" to "Konstanta Faraday (96.485 C/mol elektron)",
                    "E" to "Potensial sel elektrokimia (Volt)"
                )
            ),
            FormulaCard(
                title = "Persamaan Nernst (pada 25°C / 298 K)",
                latexFormula = "E = E^\\circ - \\frac{0.0592}{n} \\log_{10} Q",
                description = "Menghitung potensial sel pada konsentrasi dan tekanan non-standar.",
                variableMeanings = mapOf(
                    "E" to "Potensial sel nyata (Volt)",
                    "E^\\circ" to "Potensial sel standar (Volt)",
                    "n" to "Jumlah elektron yang terlibat",
                    "Q" to "Kuosien reaksi ([Produk]^koef / [Reaktan]^koef)"
                )
            ),
            FormulaCard(
                title = "Potensial Sel Konsentrasi",
                latexFormula = "E_{\\text{sel}} = -\\frac{0.0592}{n} \\log_{10}\\left(\\frac{[M^{n+}]_{\\text{encer}}}{[M^{n+}]_{\\text{pekat}}}\\right)",
                description = "Tegangan yang dihasilkan oleh sel dengan elektroda identik karena perbedaan konsentrasi larutan.",
                variableMeanings = mapOf(
                    "E_sel" to "Potensial sel konsentrasi (selalu > 0 jika encer < pekat)",
                    "[M^n+]_encer" to "Konsentrasi larutan di anoda (oksidasi)",
                    "[M^n+]_pekat" to "Konsentrasi larutan di katoda (reduksi)"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Sistem Proteksi Katodik Arus Terkesan (ICCP) Pipa Gas Bawah Laut PGN Natuna",
            industry = "Industri Minyak, Gas Bumi & Rekayasa Korosi Maritim",
            context = "PT Perusahaan Gas Negara (PGN) mengoperasikan pipa baja transmisi gas bawah laut di Laut Natuna yang terus-menerus terpapar air laut dengan salinitas dan oksigen terlarut tinggi.",
            problem = "Potensial reduksi standar besi Fe²⁺/Fe adalah -0.44 V terhadap SHE. Dalam air laut bersalinitas tinggi dan konsentrasi ion Fe²⁺ sangat rendah di sekitar permukaan pipa, berapa potensial proteksi katodik yang harus diterapkan agar korosi besi terhenti sepenuhnya?",
            solution = "Berdasarkan persamaan Nernst untuk Fe²⁺ + 2e⁻ -> Fe: E = E° - (0.0592/2) log(1 / [Fe²⁺]). Untuk mencegah pelarutan besi bahkan ketika konsentrasi ion Fe²⁺ serendah 10⁻⁶ M di batas permukaan mikro, potensial kesetimbangan Nernst bergeser ke: E = -0.44 - 0.0296 log(10⁶) = -0.44 - 0.178 = -0.618 V vs SHE (setara dengan -0.850 V terhadap elektroda referensi Cu/CuSO₄ jenuh). Insinyur korosi PGN memasang sistem Impressed Current Cathodic Protection (ICCP) dengan memancarkan arus DC kontinu sehingga potensial pipa selalu berada di bawah -0.850 V vs Cu/CuSO₄, memaksa besi bertindak sebagai katoda permanen yang tidak dapat teroksidasi.",
            lessonsLearned = "Persamaan Nernst menentukan kriteria kuantitatif tegangan proteksi korosi pada seluruh infrastruktur energi bawah laut dunia."
        ),
        homeLab = HomeLabData(
            title = "Pembuatan Sel Konsentrasi Tembaga Menggunakan Multimeter Digital",
            objective = "Membuktikan pembangkitan tegangan listrik dari gradien konsentrasi ion tembaga tanpa menggunakan dua jenis logam yang berbeda.",
            materialsNeeded = listOf(
                "2 potongan kawat tembaga murni (Cu) berukuran sama (panjang 10 cm)",
                "2 gelas plastik kecil",
                "Kristal tembaga sulfat (CuSO4 / terusi) - 1 sendok makan",
                "Air murni (100 mL)",
                "Kertas tisu basah yang direndam larutan garam dapur jenuh (sebagai jembatan garam)",
                "Multimeter digital DC Volt rentang 200 mV atau 2 V"
            ),
            steps = listOf(
                "Larutkan 1 sendok makan CuSO4 dalam 50 mL air pada gelas 1 untuk membuat larutan pekat [Cu²⁺] ≈ 1.0 M.",
                "Ambil 1 tetes larutan pekat tersebut dan campurkan ke dalam 50 mL air pada gelas 2 untuk membuat larutan encer [Cu²⁺] ≈ 0.001 M.",
                "Hubungkan kedua gelas dengan jembatan garam kertas tisu basah bergaram.",
                "Celupkan kawat tembaga 1 ke gelas pekat dan kawat tembaga 2 ke gelas encer.",
                "Hubungkan probe positif multimeter ke kawat di gelas pekat dan probe negatif ke kawat di gelas encer.",
                "Baca display multimeter: jarum/angka menunjukkan tegangan positif sekitar 80–90 mV! Tegangan ini murni timbul dari gaya gerak termodinamika Nernst untuk menyamakan konsentrasi ion di kedua gelas."
            ),
            safetyNotes = listOf(
                "Tembaga sulfat (terusi) dapat mengiritasi kulit; jangan ditelan dan cuci tangan setelah praktikum.",
                "Jangan membuang sisa larutan tembaga ke tanaman hias."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-nernst-1",
                prompt = "Suatu sel volta memiliki reaksi: Zn(s) + Cu²⁺(aq) -> Zn²⁺(aq) + Cu(s) dengan E° = +1.10 V. Jika konsentrasi [Cu²⁺] dinaikkan menjadi 10 M sedangkan [Zn²⁺] diturunkan menjadi 0.001 M pada 298 K, berapakah potensial sel E yang terukur?",
                type = "numeric",
                correctAnswer = "1.218",
                tolerance = 0.02f,
                unit = "V",
                hints = listOf(
                    "Kuosien reaksi Q = [Zn²⁺] / [Cu²⁺] = 0.001 / 10 = 10⁻⁴.",
                    "n = 2 (dua elektron ditransfer).",
                    "E = E° - (0.0592 / 2) · log(10⁻⁴) = 1.10 - 0.0296 · (-4) = ...?"
                ),
                explanation = "Q = [Zn²⁺] / [Cu²⁺] = 10⁻³ / 10¹ = 10⁻⁴. Berdasarkan persamaan Nernst: E = E° - (0.0592 / 2) log(10⁻⁴) = 1.10 - (0.0296)(-4) = 1.10 + 0.1184 = 1.2184 V.",
                misconception = "Lupa tanda minus pada log(10⁻⁴) sehingga malah mengurangi tegangan bukannya menambah."
            ),
            QuizQuestion(
                id = "q-nernst-2",
                prompt = "Apa yang terjadi dengan potensial sel (E) dan kuosien reaksi (Q) ketika sebuah baterai aki atau baterai ponsel telah habis (mati sepenuhnya)?",
                type = "multiple_choice",
                options = listOf(
                    "Potensial sel E = 0 Volt dan kuosien reaksi Q sama dengan konstanta kesetimbangan K (Q = K)",
                    "Potensial sel E = E° dan kuosien reaksi Q = 0",
                    "Potensial sel E menjadi bernilai negatif tak hingga dan reaksi berhenti",
                    "Kuosien reaksi Q bernilai 1.0 dan tegangan baterai tetap konstan"
                ),
                correctAnswer = "Potensial sel E = 0 Volt dan kuosien reaksi Q sama dengan konstanta kesetimbangan K (Q = K)",
                hints = listOf(
                    "Baterai mati berarti sistem mencapai kesetimbangan termodinamika.",
                    "Pada kesetimbangan, tidak ada lagi perbedaan energi bebas (delta G = 0)."
                ),
                explanation = "Ketika baterai habis total, reaksi kimia di dalamnya telah mencapai kesetimbangan termodinamika (delta G = 0). Karena delta G = -nFE, maka potensial sel E = 0 Volt. Pada kondisi ini, kuosien reaksi Q tepat sama dengan tetapan kesetimbangan reaksi (Q = K).",
                misconception = "Mengira baterai habis karena reaktan benar-benar 0% habis lenyap tak bersisa (padahal reaksinya hanya berhenti menghasilkan tegangan karena mencapai kesetimbangan)."
            )
        )
    )

    private fun getTeoriOrbitalMolekulLesson(): LessonData = LessonData(
        conceptId = "kim-teori-orbital-molekul",
        storyPanels = listOf(
            StoryPanel(
                id = "p-mo-1",
                panelNumber = 1,
                title = "Misteri Cairan Oksigen Biru",
                caption = "Dimas menonton video demonstrasi di mana cairan oksigen (O₂) dituangkan di antara dua kutub magnet super kuat Neodimium. Alih-alih mengalir lurus ke bawah, cairan oksigen tertahan melayang di antara kedua kutub magnet!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Teori Lewis dan Ikatan Valensi menuliskan struktur Oksigen sebagai :O=O: di mana semua elektronnya berpasangan. Kenapa oksigen cair bersifat paramagnetik dan tertarik kuat oleh magnet?"
            ),
            StoryPanel(
                id = "p-mo-2",
                panelNumber = 2,
                title = "Kelemahan Teori Valensi & Solusi MO",
                caption = "Kakek tersenyum dan menggambar kombinasi linear orbital atom (LCAO) membentuk orbital molekul ikatan dan anti-ikatan.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Teori Lewis dan ikatan valensi gagal menjelaskan oksigen, Dimas! Dalam Teori Orbital Molekul (Molecular Orbital / MO Theory), elektron tidak dimiliki oleh satu atom saja, melainkan tersebar di seluruh molekul dalam orbital molekul berenergi baru: ikatan (sigma, pi) dan anti-ikatan (sigma*, pi*)."
            ),
            StoryPanel(
                id = "p-mo-3",
                panelNumber = 3,
                title = "Dua Elektron Tak Berpasangan",
                caption = "Kirana menyusun 12 elektron valensi O₂ ke dalam diagram tingkat energi orbital molekul.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dua elektron terakhir O₂ masuk ke orbital degenerasi anti-ikatan pi*2px dan pi*2py. Sesuai aturan Hund, kedua elektron ini mengisi orbital terpisah dengan spin paralel sejajar! Dua elektron tak berpasangan inilah penyebab pasti paramagnetisme oksigen!"
            )
        ),
        intuition = "Teori Orbital Molekul menganggap molekul sebagai sekumpulan inti atom dengan orbital terdelokalisasi di seluruh molekul, yang dibentuk melalui Kombinasi Linear Orbital Atom (Linear Combination of Atomic Orbitals / LCAO). Dua orbital atom yang tumpang tindih secara sefase (interferensi konstruktif) menghasilkan Orbital Ikatan (Bonding MO, energi lebih rendah, kerapatan elektron terkonsentrasi di antara inti). Tumpang tindih berlawanan fase (interferensi destruktif) menghasilkan Orbital Anti-Ikatan (Antibonding MO, energi lebih tinggi, terdapat bidang simpul nodal di antara inti). Orde ikatan dihitung dari setengah selisih jumlah elektron ikatan dan anti-ikatan.",
        intuitionPoints = listOf(
            "Orde Ikatan = 0.5 · (Jumlah elektron ikatan - Jumlah elektron anti-ikatan). Semakin tinggi orde ikatan, semakin pendek dan kuat ikatan tersebut.",
            "Molekul dengan elektron tak berpasangan bersifat paramagnetik (ditarik magnet), sedangkan molekul dengan seluruh elektron berpasangan bersifat diamagnetik (sedikit ditolak magnet).",
            "Pencampuran s-p (s-p mixing) terjadi pada molekul B2, C2, dan N2 sehingga tingkat energi pi_2p berada di bawah sigma_2p. Pada O2 dan F2, perbedaan energi orbital 2s dan 2p terlalu besar sehingga tidak terjadi pencampuran (sigma_2p berada di bawah pi_2p)."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Orde Ikatan (Bond Order)",
                latexFormula = "\\text{Bond Order} = \\frac{N_b - N_a}{2}",
                description = "N_b adalah jumlah elektron dalam orbital molekul ikatan (bonding), N_a adalah jumlah elektron dalam orbital anti-ikatan (antibonding).",
                variableMeanings = mapOf(
                    "\\text{Bond Order}" to "Orde ikatan (1 = tunggal, 2 = rangkap dua, 3 = rangkap tiga)",
                    "N_b" to "Jumlah elektron dalam orbital ikatan (sigma, pi)",
                    "N_a" to "Jumlah elektron dalam orbital anti-ikatan (sigma*, pi*)"
                )
            ),
            FormulaCard(
                title = "Kombinasi Linear Orbital Atom (LCAO)",
                latexFormula = "\\psi_{\\text{MO}} = c_A \\phi_A \\pm c_B \\phi_B",
                description = "Pembentukan orbital molekul ikatan (+) dan anti-ikatan (-) dari fungsi gelombang orbital atom phi_A dan phi_B.",
                variableMeanings = mapOf(
                    "\\psi_MO" to "Fungsi gelombang orbital molekul",
                    "\\phi_A, \\phi_B" to "Orbital atom asal atom A dan atom B",
                    "c_A, c_B" to "Koefisien kontribusi orbital"
                )
            ),
            FormulaCard(
                title = "Momen Magnetik Spin Efektif",
                latexFormula = "\\mu_{\\text{eff}} = \\sqrt{n(n + 2)} \\; \\mu_B",
                description = "Menghitung momen magnetik senyawa paramagnetik murni dari jumlah elektron tak berpasangan n (mu_B = magneton Bohr).",
                variableMeanings = mapOf(
                    "\\mu_eff" to "Momen magnetik efektif (Bohr Magneton, BM)",
                    "n" to "Jumlah elektron tak berpasangan"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pengembangan Material Membran Pertukaran Proton Fuel Cell Hidrogen di BRIN",
            industry = "Teknologi Energi Bersih & Material Kuantum",
            context = "Peneliti Badan Riset dan Inovasi Nasional (BRIN) merancang membran polimer konduktif untuk fuel cell hidrogen yang tahan terhadap serangan degradasi spesies oksigen reaktif (Reactive Oxygen Species / ROS).",
            problem = "Mengapa molekul O₂ triplet (keadaan dasar paramagnetik) bereaksi lambat dengan bahan bakar organik non-radikal pada suhu ruang, namun jika tereksitasi menjadi O₂ singlet (diamagnetik), ia menjadi sangat reaktif dan merusak membran polimer?",
            solution = "Berdasarkan Teori MO, O₂ pada keadaan dasar memiliki konfigurasi triplet (³Sigma_g⁻) dengan dua elektron ber-spin paralel (S = 1) pada orbital pi*2px dan pi*2py. Sebagian besar molekul organik bersifat singlet (S = 0, semua elektron berpasangan). Reaksi langsung antara molekul triplet dan molekul singlet 'terlarang secara spin' (spin-forbidden) berdasarkan mekanika kuantum karena kekekalan momentum sudut spin. Ketika O₂ menyerap energi dan berpindah ke keadaan singlet (¹Delta_g, kedua elektron berpasangan dalam satu orbital pi*), aturan larangan spin gugur dan molekul ini bereaksi secara eksplosif dengan membran. Pemahaman diagram MO ini memungkinkan peneliti BRIN menambahkan pemadam singlet oksigen (quencher) cerdas ke dalam struktur polimer membran.",
            lessonsLearned = "Teori Orbital Molekul tidak hanya menjelaskan struktur ikatan statis, tetapi juga menjadi kunci utama memahami kinetika reaksi fotokimia dan larangan spin dalam reaksi kimiawi."
        ),
        homeLab = HomeLabData(
            title = "Demonstrasi Analog Interferensi Gelombang Orbital Ikatan dan Anti-Ikatan",
            objective = "Memvisualisasikan prinsip pembentukan orbital ikatan (konstruktif) dan anti-ikatan (destruktif / simpul nodal) menggunakan riak gelombang air.",
            materialsNeeded = listOf(
                "1 wadah baskom plastik lebar berisi air tenang sedalam 3 cm",
                "2 buah pensil berujung tumpul (sebagai sumber gelombang atom A dan B)",
                "Lampu senter atau lampu smartphone untuk menyinari permukaan air",
                "Kertas putih di bawah baskom transparan untuk melihat pola bayangan gelombang"
            ),
            steps = listOf(
                "Celupkan kedua ujung pensil secara bersamaan (sefase: turun bersamaan) ke permukaan air dengan jarak 5 cm.",
                "Amati pola gelombang di antara kedua pensil: gelombang saling memperkuat di wilayah tengah (analog orbital ikatan sigma, kerapatan elektron tinggi di antara dua inti atom).",
                "Sekarang gerakkan kedua pensil berlawanan fase (satu turun saat yang lain naik).",
                "Amati garis tenang di tengah antara kedua pensil di mana air sama sekali tidak bergerak (garis nodal / simpul, analog orbital anti-ikatan sigma* di mana kerapatan elektron bernilai nol).",
                "Simpulkan: orbital molekul adalah hasil interferensi gelombang elektron kuantum yang sama persis perilakunya dengan superposisi gelombang mekanik!"
            ),
            safetyNotes = listOf(
                "Lakukan di tempat yang kering dan bersihkan tumpahan air.",
                "Jauhkan perangkat elektronik dari baskom air."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-mo-1",
                prompt = "Berapakah orde ikatan (bond order) dari molekul nitrogen (N₂) jika konfigurasi elektron valensi MO-nya adalah: (sigma_2s)² (sigma*_2s)² (pi_2p)⁴ (sigma_2p)²?",
                type = "numeric",
                correctAnswer = "3",
                tolerance = 0.05f,
                unit = "",
                hints = listOf(
                    "Hitung jumlah elektron ikatan Nb: dari sigma_2s (2), pi_2p (4), dan sigma_2p (2).",
                    "Hitung jumlah elektron anti-ikatan Na: dari sigma*_2s (2).",
                    "Bond Order = (Nb - Na) / 2 = (8 - 2) / 2 = ...?"
                ),
                explanation = "Elektron dalam orbital ikatan Nb = 2 + 4 + 2 = 8 elektron. Elektron dalam orbital anti-ikatan Na = 2 elektron (sigma*_2s). Orde ikatan = (8 - 2) / 2 = 3. Nilai 3 ini menunjukkan ikatan kovalen rangkap tiga yang luar biasa kuat dan stabil pada molekul gas nitrogen.",
                misconception = "Lupa memasukkan elektron 2s dan hanya menghitung elektron dari orbital 2p."
            ),
            QuizQuestion(
                id = "q-mo-2",
                prompt = "Mengapa ion superoksida (O₂⁻) memiliki panjang ikatan yang LEBIH PANJANG dan energi ikatan yang LEBIH LEMAH dibandingkan molekul oksigen netral (O₂)?",
                type = "multiple_choice",
                options = listOf(
                    "Karena elektron tambahan pada O₂⁻ masuk ke orbital anti-ikatan (pi*), sehingga menurunkan orde ikatan dari 2 menjadi 1.5",
                    "Karena ion superoksida kehilangan dua proton di inti atomnya",
                    "Karena elektron tambahan masuk ke orbital ikatan sigma sehingga terjadi tolakan elektrostatik",
                    "Karena orbital molekul O₂⁻ mengalami distorsi geometri tetrahedral"
                ),
                correctAnswer = "Karena elektron tambahan pada O₂⁻ masuk ke orbital anti-ikatan (pi*), sehingga menurunkan orde ikatan dari 2 menjadi 1.5",
                hints = listOf(
                    "Konfigurasi O2 memiliki 2 elektron di orbital pi* (Orde Ikatan = (8-4)/2 = 2).",
                    "O2⁻ memiliki 3 elektron di orbital anti-ikatan pi* (Orde Ikatan = (8-5)/2 = 1.5)."
                ),
                explanation = "Molekul O₂ memiliki orde ikatan (8 - 4)/2 = 2. Ketika satu elektron ditambahkan membentuk anion O₂⁻, elektron tersebut harus mengisi orbital anti-ikatan pi* (karena orbital ikatan sudah penuh). Jumlah elektron anti-ikatan bertambah menjadi 5, sehingga orde ikatan turun menjadi (8 - 5)/2 = 1.5. Penurunan orde ikatan menyebabkan ikatan melemah dan jarak antar-inti memanjang.",
                misconception = "Mengira penambahan elektron selalu memperkuat ikatan kimia (penambahan elektron ke orbital anti-ikatan justru selalu memperlemah ikatan)."
            )
        )
    )

    private fun getKoordinasiMedanKristalLesson(): LessonData = LessonData(
        conceptId = "kim-koordinasi-medan-kristal",
        storyPanels = listOf(
            StoryPanel(
                id = "p-cft-1",
                panelNumber = 1,
                title = "Pesona Warna Ruby dan Zamrud",
                caption = "Dimas kagum melihat batu permata ruby berwarna merah menyala dan batu zamrud (emerald) berwarna hijau cerah. Yang mengejutkan, kedua batu tersebut mendapatkan warnanya dari ion logam yang sama persis: Cr³⁺!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Bagaimana bisa ion Cr³⁺ yang sama menghasilkan warna merah menyala pada ruby dan warna hijau tua pada zamrud? Apakah elektronnya berubah?"
            ),
            StoryPanel(
                id = "p-cft-2",
                panelNumber = 2,
                title = "Pemisahan Orbital d oleh Medan Ligan",
                caption = "Kakek menjelaskan Teori Medan Kristal (Crystal Field Theory / CFT) yang diajukan oleh Hans Bethe.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Pada ion bebas, kelima orbital d memiliki energi sama (degenerat). Namun saat dikelilingi oleh 6 ligan oktahedral, tolakan elektrostatik membelah orbital d menjadi dua kelompok: t_2g (energi turun) dan e_g (energi naik) dengan selisih energi Delta_o!"
            ),
            StoryPanel(
                id = "p-cft-3",
                panelNumber = 3,
                title = "Transisi Elektron d-d & Spektrokimia",
                caption = "Kirana menunjukkan bahwa energi foton cahaya tampak yang diserap elektron untuk melompat dari t_2g ke e_g menentukan warna komplementer yang diteruskan.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Pada ruby, jarak matriks Al₂O₃ membuat Delta_o menyerap warna hijau-kuning sehingga meneruskan warna merah. Pada zamrud (Be₃Al₂Si₆O₁₈), ligan sedikit lebih renggang sehingga Delta_o menyerap merah dan meneruskan hijau!"
            )
        ),
        intuition = "Teori Medan Kristal memodelkan interaksi antara kation logam transisi pusat dan ligan sebagai interaksi elektrostatik murni (muatan titik negatif). Dalam geometri oktahedral, ligan mendekati ion logam dari sepanjang sumbu Kartesius (x, y, z). Akibatnya, orbital d yang cupingnya berada tepat di sepanjang sumbu (d_x²-y² dan d_z², disebut kelompok e_g) mengalami tolakan elektrostatik paling kuat dan terangkat energinya sebesar +0.6 Delta_o. Tiga orbital d lainnya yang cupingnya berada di antara sumbu (d_xy, d_xz, d_yz, disebut kelompok t_2g) mengalami tolakan lebih sedikit dan energinya turun sebesar -0.4 Delta_o.",
        intuitionPoints = listOf(
            "Pemisahan energi medan oktahedral Delta_o (atau 10 Dq) bergantung pada posisi ligan dalam deret spektrokimia: I⁻ < Br⁻ < Cl⁻ < F⁻ < OH⁻ < H₂O < NH₃ < en < CN⁻ < CO.",
            "Ligan medan lemah (Delta_o kecil < energi perpasangan elektron P) menghasilkan kompleks spin tinggi (high-spin, elektron mengisi e_g sebelum berpasangan di t_2g).",
            "Ligan medan kuat (Delta_o besar > P) menghasilkan kompleks spin rendah (low-spin, seluruh elektron berpasangan di t_2g sebelum mengisi e_g).",
            "Dalam geometri tetrahedral, pemisahan terbalik (e di bawah, t_2 di atas) dengan besar pemisahan lebih kecil: Delta_t = 4/9 Delta_o."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Energi Stabilisasi Medan Kristal (CFSE Oktahedral)",
                latexFormula = "\\text{CFSE} = \\left(-0.4 \\cdot n_{t_{2g}} + 0.6 \\cdot n_{e_g}\\right)\\Delta_o + m P",
                description = "Menghitung kestabilan elektronik kompleks oktahedral relatif terhadap medan sferis rata-rata (m = jumlah pasangan elektron baru, P = energi perpasangan).",
                variableMeanings = mapOf(
                    "\\text{CFSE}" to "Crystal Field Stabilization Energy",
                    "n_{t_{2g}}" to "Jumlah elektron di orbital t_2g",
                    "n_{e_g}" to "Jumlah elektron di orbital e_g",
                    "\\Delta_o" to "Parameter pemisahan medan oktahedral",
                    "P" to "Energi perpasangan elektron (pairing energy)"
                )
            ),
            FormulaCard(
                title = "Hubungan Medan Tetrahedral & Oktahedral",
                latexFormula = "\\Delta_t = \\frac{4}{9} \\Delta_o",
                description = "Pemisahan orbital d pada kompleks tetrahedral selalu jauh lebih kecil daripada oktahedral karena jumlah ligan lebih sedikit (4 vs 6) dan orientasi tidak tepat menabrak orbital d.",
                variableMeanings = mapOf(
                    "\\Delta_t" to "Pemisahan medan kristal tetrahedral",
                    "\\Delta_o" to "Pemisahan medan kristal oktahedral"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Ekstraksi Hidrometalurgi HPAL Nikel Laterit di Kawasan Industri Morowali",
            industry = "Industri Pemurnian Nikel & Baterai Kendaraan Listrik",
            context = "Pabrik High Pressure Acid Leach (HPAL) di Morowali, Sulawesi Tengah, mengekstraksi ion nikel (Ni²⁺) dan kobalt (Co²⁺) dari bijih laterit limonit menggunakan asam sulfat pada suhu 250°C dan tekanan 40 bar.",
            problem = "Larutan hasil pelindian mengandung campuran ion Ni²⁺ (d⁸) dan pengotor konsentrasi tinggi Fe³⁺ (d⁵). Bagaimana memanfaatkan sifat kimia koordinasi dan CFSE untuk memisahkan besi dari nikel secara selektif?",
            solution = "Ion Fe³⁺ (d⁵) dalam larutan sulfat asam membentuk kompleks oktahedral spin tinggi [Fe(H₂O)₆]³⁺ dengan konfigurasi t_2g³ e_g². CFSE-nya bernilai tepat nol: CFSE = (-0.4 · 3 + 0.6 · 2) Delta_o = 0! Sebaliknya, ion Ni²⁺ (d⁸) memiliki konfigurasi t_2g⁶ e_g² dengan CFSE sangat stabil sebesar (-0.4 · 6 + 0.6 · 2) Delta_o = -1.2 Delta_o. Karena Fe³⁺ tidak memiliki stabilisasi medan kristal sama sekali, ikatan koordinasinya jauh lebih labil dan ia sangat mudah dihidrolisis menjadi endapan jarosit padat [NaFe₃(SO₄)₂(OH)₆] pada pH 2.0–2.5, sementara ion Ni²⁺ yang stabil tetap bertahan larut dalam fasa cair untuk kemudian diendapkan sebagai Mixed Hydroxide Precipitate (MHP).",
            lessonsLearned = "Teori Medan Kristal dan CFSE menjadi landasan termodinamika mendasar dalam pemisahan selektif logam strategis di industri hidrometalurgi nikel baterai nasional."
        ),
        homeLab = HomeLabData(
            title = "Pergeseran Deret Spektrokimia Ligan pada Kompleks Tembaga(II)",
            objective = "Mengamati langsung perubahan pemisahan medan kristal Delta_o dan perubahan warna larutan akibat penggantian ligan H₂O oleh ligan amonia NH₃.",
            materialsNeeded = listOf(
                "Kristal tembaga(II) sulfat pentahidrat (CuSO4·5H2O) - 1 sendok teh",
                "Air murni (50 mL)",
                "Cairan amonia pembersih rumah tangga (atau larutan amonium hidroksida encer)",
                "2 gelas kaca bening",
                "Pipet tetes plastik"
            ),
            steps = listOf(
                "Larutkan kristal CuSO4 dalam 50 mL air pada gelas 1 hingga menghasilkan larutan berwarna biru muda transparan (terbentuk kompleks [Cu(H₂O)₆]²⁺).",
                "Bagi larutan menjadi dua di gelas A dan gelas B (gelas A sebagai kontrol pembanding).",
                "Teteskan cairan amonia ke gelas B tetes demi tetes secara perlahan.",
                "Amati perubahan awal: mula-mula terbentuk endapan biru pucat Cu(OH)2.",
                "Lanjutkan meneteskan amonia sambil diaduk hingga endapan larut kembali: warna larutan seketika berubah dramatis menjadi biru tua / biru violet pekat yang sangat cantik!",
                "Penjelasan: Ligan NH₃ berada lebih tinggi dalam deret spektrokimia dibanding H₂O. Pembentukan kompleks tetraaminatembaga(II) [Cu(NH₃)₄(H₂O)₂]²⁺ memperbesar nilai Delta_o, menggeser serapan cahaya dari merah ke kuning, sehingga warna komplementer yang diteruskan bergeser ke biru tua keunguan pekat!"
            ),
            safetyNotes = listOf(
                "Gunakan larutan amonia di ruangan berventilasi baik (jangan menghirup uapnya langsung).",
                "Gunakan sarung tangan karet dan kacamata pelindung."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-cft-1",
                prompt = "Berapakah nilai CFSE (dalam satuan Delta_o, abaikan energi perpasangan) untuk kompleks oktahedral spin rendah (low-spin) d⁶, misalnya [Fe(CN)₆]⁴⁻?",
                type = "numeric",
                correctAnswer = "-2.4",
                tolerance = 0.05f,
                unit = "Delta_o",
                hints = listOf(
                    "Ligan CN⁻ adalah ligan medan kuat sehingga kompleks berbentuk low-spin.",
                    "Ke-6 elektron mengisi penuh orbital t_2g, sedangkan e_g kosong (t_2g⁶ e_g⁰).",
                    "CFSE = (-0.4 · 6 + 0.6 · 0) Delta_o = ...?"
                ),
                explanation = "Pada kompleks oktahedral d⁶ spin rendah, seluruh 6 elektron berpasangan mengisi orbital t_2g, meninggalkan e_g kosong (konfigurasi t_2g⁶ e_g⁰). CFSE = (-0.4 · 6 + 0.6 · 0) Delta_o = -2.4 Delta_o. Ini adalah stabilisasi medan kristal terbesar di antara seluruh konfigurasi d, menjadikan kompleks ini luar biasa stabil dan inert secara kinetik.",
                misconception = "Mengasumsikan kompleks high-spin (t_2g⁴ e_g²) yang hanya menghasilkan CFSE sebesar -0.4 Delta_o."
            ),
            QuizQuestion(
                id = "q-cft-2",
                prompt = "Mengapa kompleks logam transisi dengan geometri tetrahedral hampir selalu berkonfigurasi spin tinggi (high-spin)?",
                type = "multiple_choice",
                options = listOf(
                    "Karena nilai pemisahan medan tetrahedral Delta_t sangat kecil (hanya sekitar 4/9 dari Delta_o), sehingga selalu lebih kecil dari energi perpasangan elektron P",
                    "Karena kompleks tetrahedral tidak memiliki elektron dalam orbital d",
                    "Karena ligan tetrahedral selalu berupa molekul gas mulia",
                    "Karena energi perpasangan elektron pada geometri tetrahedral bernilai nol"
                ),
                correctAnswer = "Karena nilai pemisahan medan tetrahedral Delta_t sangat kecil (hanya sekitar 4/9 dari Delta_o), sehingga selalu lebih kecil dari energi perpasangan elektron P",
                hints = listOf(
                    "Bandingkan Delta_t dengan Delta_o: Delta_t = 4/9 Delta_o.",
                    "Agar terbentuk low-spin, pemisahan medan harus lebih besar dari energi pairing P (Delta > P)."
                ),
                explanation = "Pemisahan medan kristal tetrahedral Delta_t bernilai sangat kecil (Delta_t = 4/9 Delta_o) karena hanya ada 4 ligan dan tidak ada ligan yang mengarah tepat menabrak orbital d. Akibatnya, nilai Delta_t praktis selalu lebih kecil daripada energi perpasangan elektron P (Delta_t < P), sehingga elektron lebih memilih menempati orbital berenergi lebih tinggi dengan spin paralel daripada berpasangan.",
                misconception = "Mengira geometri tetrahedral memiliki pemisahan energi yang sama besarnya dengan oktahedral."
            )
        )
    )

    private fun getAnorganikPeriodikLanjutLesson(): LessonData = LessonData(
        conceptId = "kim-anorganik-periodik-lanjut",
        storyPanels = listOf(
            StoryPanel(
                id = "p-anorganik-lanjut-1",
                panelNumber = 1,
                title = "Kemiripan Ganjil Zirkonium dan Hafnium",
                caption = "Dimas mempelajari tabel periodik dan menemukan fakta mengejutkan: Zirkonium (Zr, periode 5, Z=40) dan Hafnium (Hf, periode 6, Z=72) memiliki jari-jari atom yang hampir identik persis (159 pm vs 158 pm)!",
                dialogueSpeaker = "Dimas",
                dialogueText = "Hafnium memiliki 32 proton dan satu kulit elektron lebih banyak dibanding Zirkonium, kenapa jari-jari atomnya malah tidak membesar sama sekali?"
            ),
            StoryPanel(
                id = "p-anorganik-lanjut-2",
                panelNumber = 2,
                title = "Kontraksi Lantanida & Pasangan Inert",
                caption = "Kakek menjelaskan fenomena kontraksi lantanida dan efek relativistik pasangan inert.",
                dialogueSpeaker = "Kakek",
                dialogueText = "Sebelum Hafnium, ada 14 unsur deret Lantanida di mana elektron mengisi orbital 4f. Karena orbital f menyebar luas dan daya perisainya sangat buruk, muatan inti efektif Z_eff melonjak tinggi, menarik seluruh awan elektron menyusut drastis! Itulah Kontraksi Lantanida."
            ),
            StoryPanel(
                id = "p-anorganik-lanjut-3",
                panelNumber = 3,
                title = "Diagram Latimer dan Frost",
                caption = "Kirana menggambar diagram Frost untuk mangan dan nitrogen, memetakan stabilitas termodinamika berbagai tingkat bilangan oksidasi.",
                dialogueSpeaker = "Kirana",
                dialogueText = "Dengan diagram Frost Delta G°/F terhadap bilangan oksidasi, spesies yang terletak di puncak cembung akan mengalami disproporsionasi spontan, sedangkan spesies di lembah cekung adalah spesies termodinamika paling stabil!"
            )
        ),
        intuition = "Sifat unsur berat (periode 5 dan 6) sangat dipengaruhi oleh dua fenomena kuantum utama: Kontraksi Lantanida dan Efek Pasangan Inert. Pengisian orbital 4f yang memiliki kemampuan perisai sangat buruk menyebabkan jari-jari atom unsur transisi periode 6 menyusut mendekati ukuran unsur periode 5 di atasnya, menjadikan pemisahan kimiawi pasangan unsur seperti Zr/Hf dan Nb/Ta sangat sulit. Sementara itu, kestabilan termodinamika berbagai keadaan oksidasi divisualisasikan secara elegan melalui Diagram Latimer (potensial reduksi antar-tahap) dan Diagram Frost (energi bebas relatif terhadap bilangan oksidasi).",
        intuitionPoints = listOf(
            "Kontraksi Lantanida: penurunan jari-jari atom/ion yang mantap sepanjang deret Ce (Z=58) hingga Lu (Z=71), mengakibatkan kemiripan ukuran dan sifat kimiawi luar biasa antara logam transisi 4d dan 5d.",
            "Efek Pasangan Inert: keengganan pasangan elektron s valensi untuk berikatan pada unsur-unsur berat golongan utama p (seperti Tl⁺ lebih stabil dari Tl³⁺, Pb²⁺ lebih stabil dari Pb⁴⁺, Bi³⁺ lebih stabil dari Bi⁵⁺) akibat stabilisasi relativistik orbital 6s.",
            "Diagram Frost: spesies yang berada di atas garis hubung dua tetangganya (kurva cembung) tidak stabil terhadap disproporsionasi; spesies di bawah garis hubung stabil terhadap komproporsionasi."
        ),
        formulaCards = listOf(
            FormulaCard(
                title = "Potensial Reduksi Tak Langsung (Diagram Latimer)",
                latexFormula = "E_{13}^\\circ = \\frac{n_{12} E_{12}^\\circ + n_{23} E_{23}^\\circ}{n_{12} + n_{23}}",
                description = "Menghitung potensial reduksi standar total dari tahap-tahap antara menggunakan kekekalan energi bebas Gibbs (delta G° = -nFE°).",
                variableMeanings = mapOf(
                    "E_{13}^\\circ" to "Potensial standar dari spesi 1 langsung ke spesi 3 (V)",
                    "n_{12}, n_{23}" to "Jumlah elektron pada tahap 1->2 dan tahap 2->3",
                    "E_{12}^\\circ, E_{23}^\\circ" to "Potensial reduksi tahap parsial"
                )
            ),
            FormulaCard(
                title = "Fungsi Energi Bebas Diagram Frost",
                latexFormula = "\\frac{\\Delta G^\\circ}{F} = -n E^\\circ(M^{n+} / M^0)",
                description = "Plot sumbu-y diagram Frost (volt) terhadap sumbu-x bilangan oksidasi N.",
                variableMeanings = mapOf(
                    "\\Delta G^\\circ / F" to "Energi bebas standar relatif terhadap unsur murni (Volt)",
                    "n" to "Bilangan oksidasi unsur",
                    "E^\\circ" to "Potensial reduksi dari bilangan oksidasi n menuju unsur nol"
                )
            )
        ),
        caseStudy = CaseStudyData(
            title = "Pemisahan Unsur Tanah Jarang (Neodimium & Disprosium) dari Residu Tambang Timah Bangka",
            industry = "Industri Mineral Strategis & Logam Tanah Jarang (LTJ)",
            context = "PT Timah Tbk dan BRIN mengolah pasir monasit dan senotim hasil samping penambangan timah di Kepulauan Bangka Belitung untuk mengekstraksi Unsur Tanah Jarang (Rare Earth Elements / REE) yang krusial untuk magnet turbin angin dan motor mobil listrik.",
            problem = "Semua 14 unsur lantanida memiliki bilangan oksidasi dominan +3 dan sifat kimia yang hampir identik. Bagaimana memisahkan Neodimium (Nd) dan Disprosium (Dy) dengan kemurnian 99.9%?",
            solution = "Pemisahan lantanida bersandar sepenuhnya pada perbedaan infinitesimal jari-jari ion akibat Kontraksi Lantanida. Dari La³⁺ (103 pm) hingga Lu³⁺ (86 pm), jari-jari kation menyusut secara bertahap, menyebabkan densitas muatan dan kekuatan asam Lewis kation meningkat secara sistematis. Dalam proses ekstraksi cair-cair bertingkat (solvent extraction) menggunakan ligan organofosfat TBP (tributyl phosphate), kestabilan kompleks koordinasi meningkat secara bertahap seiring menyusutnya ukuran kation. Dengan mengatur ratusan tahap mixer-settler otomatis, insinyur memanfaatkan selisih koefisien distribusi kecil ini untuk memisahkan Nd dan Dy secara murni.",
            lessonsLearned = "Kontraksi Lantanida yang awalnya merupakan teori anomali struktur atom kuantum kini menjadi basis teknologi industri pengolahan mineral tanah jarang bernilai triliunan rupiah."
        ),
        homeLab = HomeLabData(
            title = "Eksperimen Disproporsionasi Termodinamika Hidrogen Peroksida",
            objective = "Mengamati fenomena disproporsionasi (reaksi autoredoks) di mana suatu unsur pada bilangan oksidasi intermediet mengoksidasi dan mereduksi dirinya sendiri secara simultan.",
            materialsNeeded = listOf(
                "Larutan Hidrogen Peroksida (H2O2) 3% (tersedia di apotek)",
                "Potongan kecil kentang segar atau hati ayam (mengandung enzim katalase alami)",
                "Gelas kaca bening transparan",
                "Lidi kayu dan korek api (untuk uji bara oksigen)"
            ),
            steps = listOf(
                "Tuangkan 50 mL larutan H2O2 3% ke dalam gelas kaca. Amati bahwa larutan tampak stabil pada suhu ruang tanpa ada gelembung yang terlihat.",
                "Tinjau bilangan oksidasi oksigen dalam H2O2 adalah -1 (keadaan oksidasi antara dari O2 [0] dan H2O [-2]). Berdasarkan diagram Frost, H2O2 berada pada puncak cembung yang tidak stabil terhadap disproporsionasi.",
                "Masukkan potongan kecil kentang segar ke dalam gelas.",
                "Amati reaksi hebat yang terjadi seketika: busa gelembung gas melimpah keluar dari permukaan kentang!",
                "Nyalakan lidi kayu, tiup apinya hingga menyisakan bara merah, lalu dekatkan bara lidi ke atas gelembung busa di mulut gelas: bara lidi seketika menyala kembali berkobar terang membuktikan gas yang dihasilkan adalah oksigen murni (O₂)!",
                "Reaksi: 2 H₂O₂ (oksigen biloks -1) -> 2 H₂O (oksigen biloks -2, reduksi) + O₂ (oksigen biloks 0, oksidasi)."
            ),
            safetyNotes = listOf(
                "H2O2 3% aman untuk kulit normal, namun hindari terkena mata.",
                "Lakukan uji bara api dengan hati-hati dan sediakan air pemadam di dekat Anda."
            )
        ),
        quizQuestions = listOf(
            QuizQuestion(
                id = "q-anorganik-lanjut-1",
                prompt = "Berdasarkan diagram Latimer di media asam: ClO₃⁻ --(+0.33 V)--> ClO₂ --(+1.07 V)--> HClO₂. Berapakah potensial reduksi langsung dari ClO₃⁻ menjadi HClO₂ (melibatkan total transfer 2 elektron)?",
                type = "numeric",
                correctAnswer = "0.7",
                tolerance = 0.05f,
                unit = "V",
                hints = listOf(
                    "Tahap 1: ClO₃⁻ -> ClO₂ melibatkan 1 elektron (n1 = 1, E1 = 0.33 V).",
                    "Tahap 2: ClO₂ -> HClO₂ melibatkan 1 elektron (n2 = 1, E2 = 1.07 V).",
                    "E total = (1 · 0.33 + 1 · 1.07) / (1 + 1) = 1.40 / 2 = ...?"
                ),
                explanation = "Berdasarkan kekekalan energi bebas delta G° = -nFE°, E° total = (n1·E1° + n2·E2°) / (n1 + n2) = (1 · 0.33 V + 1 · 1.07 V) / 2 = 1.40 V / 2 = 0.70 V.",
                misconception = "Menjumlahkan langsung potensial tanpa membagi jumlah total elektron (menjawab 1.40 V)."
            ),
            QuizQuestion(
                id = "q-anorganik-lanjut-2",
                prompt = "Mengapa Timbal(II) oksida (PbO) jauh lebih stabil daripada Timbal(IV) oksida (PbO₂), padahal karbon dan silikon pada golongan yang sama lebih stabil pada tingkat oksidasi +4?",
                type = "multiple_choice",
                options = listOf(
                    "Karena efek pasangan inert: pasangan elektron 6s² pada timbal mengalami kontraksi relativistik kuat sehingga enggan terlibat dalam ikatan kimia",
                    "Karena timbal bukan merupakan unsur golongan karbon",
                    "Karena orbital d pada timbal semuanya kosong",
                    "Karena PbO memiliki ikatan kovalen rangkap tiga"
                ),
                correctAnswer = "Karena efek pasangan inert: pasangan elektron 6s² pada timbal mengalami kontraksi relativistik kuat sehingga enggan terlibat dalam ikatan kimia",
                hints = listOf(
                    "Perhatikan fenomena 'Inert Pair Effect' pada unsur-unsur berat blok-p (Tl, Pb, Bi).",
                    "Efek relativistik menstabilkan orbital s yang dekat dengan inti atom ber-Z tinggi."
                ),
                explanation = "Pada unsur-unsur berat periode 6 seperti Timbal (Z=82), kecepatan gerak elektron kulit dalam mendekati kecepatan cahaya, menyebabkan massa relativistik elektron bertambah dan orbital s (khususnya 6s) berkontraksi mendekati inti. Akibatnya, pasangan elektron 6s² terikat sangat kuat dan enggan terlibat dalam pembentukan ikatan (efek pasangan inert). Oleh karena itu, tingkat oksidasi +2 jauh lebih stabil daripada +4 pada timbal.",
                misconception = "Mengira semua unsur dalam satu golongan golongan IVA selalu memiliki kestabilan tingkat oksidasi yang persis sama."
            )
        )
    )
}

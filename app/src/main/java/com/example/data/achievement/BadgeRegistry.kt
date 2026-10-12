package com.example.data.achievement

import com.example.data.model.BadgeItem

enum class BadgeCategory(val title: String) {
    SPECIAL("Pencapaian Spesial"),
    PHYSICS("Pilar Fisika ⚛️"),
    MATH("Pilar Matematika 📐"),
    CHEMISTRY("Pilar Kimia 🧪"),
    BIOLOGY("Pilar Biologi 🌿"),
    MASTERY("Mastery & Kuis 🏆"),
    CONSISTENCY("Konsistensi Belajar 🔥")
}

data class DetailedBadge(
    val item: BadgeItem,
    val category: BadgeCategory,
    val requirementDescription: String
)

object BadgeRegistry {

    val allDetailedBadges: List<DetailedBadge> = listOf(
        // --- 1. SPESIAL & LANGKAH AWAL ---
        DetailedBadge(
            item = BadgeItem(
                id = "badge-scientist-first",
                title = "Langkah Pertama Sains",
                iconEmoji = "🚀",
                description = "Menyelesaikan modul pembelajaran dan kuis pertama Anda."
            ),
            category = BadgeCategory.SPECIAL,
            requirementDescription = "Selesaikan 1 modul materi apa saja."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-home-lab-champion",
                title = "Laboran Rumahan Sejati",
                iconEmoji = "🥼",
                description = "Mencatat dan memverifikasi hasil eksperimen praktikum rumahan (Home Lab)."
            ),
            category = BadgeCategory.SPECIAL,
            requirementDescription = "Lakukan verifikasi observasi pada menu Home Lab."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-scholar-5",
                title = "Cendekiawan Muda",
                iconEmoji = "🎓",
                description = "Menuntaskan 5 konsep materi sains dengan hasil memuaskan."
            ),
            category = BadgeCategory.SPECIAL,
            requirementDescription = "Tuntaskan minimal 5 konsep materi."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-diagnostic-tested",
                title = "Pemeta Jalur Semesta",
                iconEmoji = "🧭",
                description = "Menyelesaikan Placement Test diagnostik adaptif untuk memetakan level awal pemahaman sains."
            ),
            category = BadgeCategory.SPECIAL,
            requirementDescription = "Selesaikan tes diagnostik adaptif."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-polymath-10",
                title = "Polimatik Semesta",
                iconEmoji = "🌟",
                description = "Menguasai materi dari seluruh 4 pilar sains (Fisika, Matematika, Kimia, Biologi)."
            ),
            category = BadgeCategory.SPECIAL,
            requirementDescription = "Selesaikan minimal 1 materi dari masing-masing ke-4 pilar sains."
        ),

        // --- 2. PILAR FISIKA ---
        DetailedBadge(
            item = BadgeItem(
                id = "badge-parabola",
                title = "Pemburu Parabola",
                iconEmoji = "🎯",
                description = "Menguasai konsep lintasan gerak parabola 2D dan sudut elevasi."
            ),
            category = BadgeCategory.PHYSICS,
            requirementDescription = "Selesaikan modul Gerak Parabola dengan skor kuis ≥ 75%."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-newton",
                title = "Penunggang Inersia",
                iconEmoji = "🛷",
                description = "Menguasai Hukum Newton tentang gerak, gaya normal, dan gesekan."
            ),
            category = BadgeCategory.PHYSICS,
            requirementDescription = "Selesaikan modul Hukum Gerak Newton."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-circuit",
                title = "Pakar Arus Listrik",
                iconEmoji = "⚡",
                description = "Menuntaskan prinsip Hukum Ohm, hambatan, dan rangkaian tertutup."
            ),
            category = BadgeCategory.PHYSICS,
            requirementDescription = "Selesaikan materi Rangkaian Listrik / Hukum Ohm."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-quantum-phys",
                title = "Fisikawan Kuantum",
                iconEmoji = "🌌",
                description = "Menjelajahi mekanika kuantum, relativitas, dan fisika modern."
            ),
            category = BadgeCategory.PHYSICS,
            requirementDescription = "Selesaikan materi Fisika Modern / Kuantum."
        ),

        // --- 3. PILAR MATEMATIKA ---
        DetailedBadge(
            item = BadgeItem(
                id = "badge-fraction",
                title = "Master Pecahan",
                iconEmoji = "🍕",
                description = "Menguasai operasi bilangan pecahan, rasio perbandingan, dan desimal."
            ),
            category = BadgeCategory.MATH,
            requirementDescription = "Selesaikan materi Pecahan & Rasio."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-math-wizard",
                title = "Pakar Trigonometri",
                iconEmoji = "📐",
                description = "Menguasai sinus, cosinus, tangen, dan geometri segitiga siku-siku."
            ),
            category = BadgeCategory.MATH,
            requirementDescription = "Selesaikan modul Trigonometri Dasar."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-calculus",
                title = "Penjelajah Garis Singgung",
                iconEmoji = "📈",
                description = "Memahami konsep limit, gradien turunan fungsi, dan integral."
            ),
            category = BadgeCategory.MATH,
            requirementDescription = "Selesaikan modul Kalkulus / Limit & Turunan."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-matrix",
                title = "Arsitek Vektor & Matriks",
                iconEmoji = "🧊",
                description = "Menguasai operasi matriks transformasi dan aljabar linear ruang."
            ),
            category = BadgeCategory.MATH,
            requirementDescription = "Selesaikan materi Matriks / Aljabar Linear."
        ),

        // --- 4. PILAR KIMIA ---
        DetailedBadge(
            item = BadgeItem(
                id = "badge-alchemist",
                title = "Alkemis pH Seimbang",
                iconEmoji = "🧪",
                description = "Menuntaskan eksperimen larutan asam-basa dan skala pH."
            ),
            category = BadgeCategory.CHEMISTRY,
            requirementDescription = "Selesaikan materi Asam Basa & Titrasi."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-stoichiometry",
                title = "Penyeimbang Reaksi",
                iconEmoji = "⚖️",
                description = "Berhasil menyetarakan koefisien reaksi kimia dan konsep mol."
            ),
            category = BadgeCategory.CHEMISTRY,
            requirementDescription = "Selesaikan materi Stoikiometri & Penyetaraan Reaksi."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-bohr-atom",
                title = "Penembak Foton Kuantum",
                iconEmoji = "⚛️",
                description = "Memahami tingkat energi atom Bohr dan transisi foton spektroskopi."
            ),
            category = BadgeCategory.CHEMISTRY,
            requirementDescription = "Selesaikan materi Struktur Atom Bohr / Kuantum."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-gas-laws",
                title = "Penguasa Tekanan Gas",
                iconEmoji = "💨",
                description = "Memahami kinetika gas ideal PV=nRT dan kesetimbangan termodinamika."
            ),
            category = BadgeCategory.CHEMISTRY,
            requirementDescription = "Selesaikan materi Hukum Gas Ideal / Termokimia."
        ),

        // --- 5. PILAR BIOLOGI ---
        DetailedBadge(
            item = BadgeItem(
                id = "badge-bio-botanist",
                title = "Pakar Fotosintesis",
                iconEmoji = "🌿",
                description = "Menguasai biokimia kloroplas daun dan konversi energi cahaya."
            ),
            category = BadgeCategory.BIOLOGY,
            requirementDescription = "Selesaikan materi Fotosintesis & Kloroplas."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-mendel",
                title = "Ahli Genetika Mendel",
                iconEmoji = "🧬",
                description = "Menguasai pewarisan sifat monohibrid dan hukum segregasi Mendel."
            ),
            category = BadgeCategory.BIOLOGY,
            requirementDescription = "Selesaikan materi Genetika & Persilangan Mendel."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-ecology",
                title = "Penjaga Ekosistem",
                iconEmoji = "🌍",
                description = "Memahami siklus biogeokimia, jaring makanan, dan carrying capacity."
            ),
            category = BadgeCategory.BIOLOGY,
            requirementDescription = "Selesaikan modul Ekologi & Dinamika Populasi."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-bio-molecular",
                title = "Peneliti DNA & Sel",
                iconEmoji = "🔬",
                description = "Menjelajahi struktur sel mikroskopis dan dogma sentral molekuler."
            ),
            category = BadgeCategory.BIOLOGY,
            requirementDescription = "Selesaikan modul Biologi Sel / Genetika Molekuler."
        ),

        // --- 6. MASTERY & KUIS ---
        DetailedBadge(
            item = BadgeItem(
                id = "badge-perfect-score",
                title = "Akurasi Sempurna 100%",
                iconEmoji = "🏆",
                description = "Menjawab seluruh pertanyaan kuis dengan benar tanpa satupun kesalahan."
            ),
            category = BadgeCategory.MASTERY,
            requirementDescription = "Raih skor 100% pada evaluasi kuis topik apa saja."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-independent-thinker",
                title = "Penalar Mandiri",
                iconEmoji = "💡",
                description = "Menuntaskan kuis formatif tanpa membuka petunjuk bantuan (hints)."
            ),
            category = BadgeCategory.MASTERY,
            requirementDescription = "Selesaikan kuis dengan lulus tanpa memakai hint."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-mastery-3",
                title = "Ksatria Konsep",
                iconEmoji = "⭐",
                description = "Menguasai 3 konsep materi dengan tingkat pemahaman di atas 80%."
            ),
            category = BadgeCategory.MASTERY,
            requirementDescription = "Capai tingkat penguasaan ≥ 80% pada 3 materi."
        ),

        // --- 7. KONSISTENSI & STREAK ---
        DetailedBadge(
            item = BadgeItem(
                id = "badge-streak-3",
                title = "Pelajar Konsisten 3 Hari",
                iconEmoji = "🔥",
                description = "Membuka dan belajar di Semesta selama 3 hari berturut-turut."
            ),
            category = BadgeCategory.CONSISTENCY,
            requirementDescription = "Capai streak belajar minimal 3 hari."
        ),
        DetailedBadge(
            item = BadgeItem(
                id = "badge-streak-7",
                title = "Penjelajah 7 Hari",
                iconEmoji = "⚡",
                description = "Konsisten mengasah ilmu selama 7 hari berturut-turut tanpa putus."
            ),
            category = BadgeCategory.CONSISTENCY,
            requirementDescription = "Capai streak belajar minimal 7 hari."
        )
    )

    val allBadges: List<BadgeItem> = allDetailedBadges.map { it.item }

    fun getBadgeById(id: String): BadgeItem? {
        return allBadges.find { it.id == id }
    }
}

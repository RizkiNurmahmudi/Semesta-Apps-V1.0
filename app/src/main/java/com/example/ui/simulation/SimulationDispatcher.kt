package com.example.ui.simulation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.data.model.Domain
import com.example.data.model.LessonData

/**
 * Dispatcher Simulasi Interaktif Semesta (Arsitektur 3 Tingkat):
 * Secara cerdas memetakan setiap simId konsep ke simulator visual khusus atau
 * mengaktifkan Universal Interactive Formula Sandbox sehingga 100% dari 261 konsep
 * memiliki laboratorium visual yang relevan secara saintifik.
 */
@Composable
fun SimulationDispatcher(
    lesson: LessonData,
    domain: Domain,
    conceptTitle: String,
    modifier: Modifier = Modifier
) {
    val simId = lesson.simId.lowercase()

    when {
        // --- 1. TINGKAT 1 & 2: DEDICATED VISUAL LABS & DOMAIN ENGINES ---

        // Fisika: Gerak Parabola
        simId == "sim-projectile" || simId.contains("parabola") -> {
            ProjectileSimulation(modifier = modifier)
        }

        // Fisika: Newton, Gaya & Gesekan
        simId.contains("newton") || simId.contains("motion") || simId.contains("force") ||
                simId.contains("gesek") || simId.contains("dorong-tarik") || simId.contains("momentum") -> {
            NewtonMotionSimulation(modifier = modifier)
        }

        // Fisika: Rangkaian Listrik & Hukum Ohm
        simId.contains("circuit") || simId.contains("ohm") || simId.contains("listrik-dinamis") ||
                simId.contains("listrik-ohm") || simId.contains("rlc") || simId.contains("listrik-statis") -> {
            CircuitSimulation(modifier = modifier)
        }

        // Fisika: Gelombang & Osilasi Harmonik
        simId.contains("wave") || simId.contains("getaran") || simId.contains("gelombang") ||
                simId.contains("bunyi") || simId.contains("osilasi") || simId.contains("doppler") ||
                simId.contains("cahaya") -> {
            WaveOscillationSimulation(modifier = modifier)
        }

        // Matematika: Pecahan & Rasio
        simId == "sim-fraction" || simId.contains("pecahan") || simId.contains("rasio") -> {
            FractionSimulation(modifier = modifier)
        }

        // Matematika: Trigonometri Segitiga Siku-Siku
        simId == "sim-trigonometry" || simId.contains("trigonometri") || simId.contains("pythagoras") -> {
            TrigonometrySimulation(modifier = modifier)
        }

        // Matematika: Kalkulus, Kurva Fungsi, Turunan & Integral
        simId.contains("calculus") || simId.contains("limit") || simId.contains("turunan") ||
                simId.contains("integral") || simId.contains("fungsi") || simId.contains("polinomial") ||
                simId.contains("pde") || simId.contains("ode") || simId.contains("grafik") -> {
            CalculusPlotterSimulation(modifier = modifier)
        }

        // Matematika: Vektor & Transformasi Matriks 2D
        simId.contains("vector") || simId.contains("matrix") || simId.contains("matriks") ||
                simId.contains("vektor") || simId.contains("aljabar-linear") || simId.contains("transformasi") -> {
            VectorMatrixSimulation(modifier = modifier)
        }

        // Kimia: Asam Basa & Titrasi pH
        simId == "sim-acid-base" || simId.contains("acid") || simId.contains("asam-basa") -> {
            AcidBaseSimulation(modifier = modifier)
        }

        // Kimia: Penyetaraan Reaksi & Neraca Stoikiometri
        simId.contains("reaction") || simId.contains("stoichiometry") || simId.contains("balancer") ||
                simId.contains("stoikiometri") || simId.contains("persamaan-reaksi") || simId.contains("redoks") -> {
            ReactionBalancerSimulation(modifier = modifier)
        }

        // Kimia / Fisika: Model Atom Bohr & Transisi Kuantum
        simId.contains("atom") || simId.contains("bohr") || simId.contains("kuantum-atom") ||
                simId.contains("struktur-atom") || simId.contains("orbital") -> {
            BohrAtomSimulation(modifier = modifier)
        }

        // Kimia / Fisika: Gas Ideal, Piston Silinder & Kesetimbangan
        simId.contains("gas") || simId.contains("termo") || simId.contains("equilibrium") ||
                simId.contains("kesetimbangan") || simId.contains("tekanan") || simId.contains("fluida") -> {
            GasEquilibriumSimulation(modifier = modifier)
        }

        // Biologi: Kloroplas & Fotosintesis
        simId == "sim-photosynthesis" || simId.contains("fotosintesis") || simId.contains("kloroplas") -> {
            PhotosynthesisSimulation(modifier = modifier)
        }

        // Biologi: Genetika Mendel & Punnett Square
        simId.contains("mendel") || simId.contains("genetika") || simId.contains("pewarisan") ||
                simId.contains("punnett") || simId.contains("dna") || simId.contains("alel") -> {
            PunnettSquareSimulation(modifier = modifier)
        }

        // Biologi: Pertumbuhan Populasi Logistik & Ekologi
        simId.contains("population") || simId.contains("ekologi") || simId.contains("pertumbuhan") ||
                simId.contains("seir") || simId.contains("daur-hidup") || simId.contains("ekosistem") -> {
            PopulationGrowthSimulation(modifier = modifier)
        }

        // --- 2. TINGKAT 3: UNIVERSAL INTERACTIVE FORMULA SANDBOX ---
        // Menjamin 100% konsep tingkat lanjut memiliki pengalaman lab dinamis
        else -> {
            UniversalFormulaSandbox(
                conceptTitle = conceptTitle,
                domain = domain,
                formulas = lesson.formulas,
                modifier = modifier
            )
        }
    }
}

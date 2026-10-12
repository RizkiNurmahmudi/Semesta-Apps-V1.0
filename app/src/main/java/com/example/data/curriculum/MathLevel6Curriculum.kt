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

object MathLevel6Curriculum {

    val concepts: List<ConceptItem> = listOf(
        ConceptItem(
            id = "mat-ode-orde-1-2",
            domain = Domain.MATEMATIKA,
            topic = "Persamaan Diferensial Biasa",
            title = "Persamaan Diferensial Biasa (ODE) Orde 1 & 2",
            description = "Metode variabel terpisah, faktor pengintegralisasi, persamaan Bernoulli, ODE linear orde 2 homogen/non-homogen, variasi parameter, dan analisis potret fase.",
            level = DepthLevel.L6,
            estMinutes = 24,
            prerequisites = listOf("mat-kalkulus-turunan-lanjut", "mat-kalkulus-integral-teknik")
        ),
        ConceptItem(
            id = "mat-transformasi-laplace",
            domain = Domain.MATEMATIKA,
            topic = "Analisis Transformasi",
            title = "Transformasi Laplace, Teorema Konvolusi & Solusi IVP",
            description = "Definisi integral transformasi Laplace, sifat pergeseran frekuensi dan waktu, fungsi tangga Heaviside, delta Dirac, teorema konvolusi, dan solusi masalah nilai awal.",
            level = DepthLevel.L6,
            estMinutes = 24,
            prerequisites = listOf("mat-ode-orde-1-2")
        ),
        ConceptItem(
            id = "mat-fourier-analisis",
            domain = Domain.MATEMATIKA,
            topic = "Analisis Harmonik & Spektral",
            title = "Deret dan Transformasi Fourier Kontinu",
            description = "Ortogonalitas fungsi trigonometri, koefisien Euler-Fourier, fenomena Gibbs, identitas Parseval, pasangan transformasi Fourier kontinu, dan representasi spektrum frekuensi.",
            level = DepthLevel.L6,
            estMinutes = 24,
            prerequisites = listOf("mat-kalkulus-deret-taylor", "mat-ode-orde-1-2")
        ),
        ConceptItem(
            id = "mat-pde-persamaan-diferensial-parsial",
            domain = Domain.MATEMATIKA,
            topic = "Persamaan Diferensial Parsial",
            title = "Persamaan Diferensial Parsial (PDE): Gelombang, Panas & Laplace",
            description = "Klasifikasi orde dua (eliptik, parabolik, hiperbolik), metode pemisahan variabel, syarat batas Dirichlet dan Neumann, solusi d'Alembert, serta fungsi ortogonal Bessel dan Legendre.",
            level = DepthLevel.L6,
            estMinutes = 26,
            prerequisites = listOf("mat-fourier-analisis", "mat-kalkulus-multivariabel")
        ),
        ConceptItem(
            id = "mat-probabilitas-inferensi-regresi",
            domain = Domain.MATEMATIKA,
            topic = "Statistika Matematika & Inferensi",
            title = "Probabilitas Multivariat, CLT, Estimasi MLE & Regresi Linear",
            description = "Peubah acak kontinu multivariat, matriks kovariansi, Teorema Batas Pusat (CLT), estimasi kemungkinan maksimum (MLE), uji hipotesis ANOVA, dan formulasi matriks regresi berganda.",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("mat-aljabar-linear-spl", "mat-kalkulus-multivariabel")
        ),
        ConceptItem(
            id = "mat-metode-numerik-komputasi",
            domain = Domain.MATEMATIKA,
            topic = "Komputasi & Metode Numerik",
            title = "Metode Numerik: Akar Persamaan, Spline, Kuadratur Gauss & RK4",
            description = "Konvergensi Newton-Raphson, interpolasi spline kubik terikat, integrasi numerik kuadratur Gauss-Legendre, dan penyelesaian ODE dengan integrator Runge-Kutta orde 4 (RK4).",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("mat-ode-orde-1-2", "mat-aljabar-linear-spl")
        ),
        ConceptItem(
            id = "mat-optimasi-program-linear",
            domain = Domain.MATEMATIKA,
            topic = "Optimasi Matematika",
            title = "Optimasi: Pemrograman Linear Simpleks, Dualitas & Gradient Descent",
            description = "Formulasi kanonik programa linear, metode Simpleks tabel baku, teorema dualitas kuat/lemah, analisis sensitivitas shadow price, dan optimasi tak berkendala metode penurunan gradien.",
            level = DepthLevel.L6,
            estMinutes = 25,
            prerequisites = listOf("mat-aljabar-linear-spl", "mat-kalkulus-multivariabel")
        )
    )

    fun getLesson(conceptId: String): LessonData? {
        return when (conceptId) {
            "mat-ode-orde-1-2" -> LessonData(
                conceptId = "mat-ode-orde-1-2",
                simId = "sim-ode-solvers",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, kenapa redaman suspensi bus antar-kota di jalan berlubang pantura bisa cepat stabil tanpa memantul terus-menerus?",
                        narrativeContext = "Dimas mengamati getaran sasis kendaraan berat saat melintasi jalur pantura Jawa yang bergelombang."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu karena insinyur otomotif mendesain pegas dan peredam hidrolik mengikuti persamaan diferensial biasa orde dua m*y'' + c*y' + k*y = 0 dengan redaman kritis (c^2 = 4mk).",
                        narrativeContext = "Kakek menuliskan persamaan diferensial linear homogen orde dua pada papan tulis mekanika."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan bila kita ubah bentuknya menjadi sistem variabel keadaan y1 = y, y2 = y', kita bisa memetakan seluruh trayektori kestabilan sistem dalam diagram potret fase!",
                        narrativeContext = "Kirana menggambar bidang fase (y vs y') yang memperlihatkan titik ekuilibrium spiral stabil."
                    )
                ),
                intuitionBody = """
                    Persamaan Diferensial Biasa (Ordinary Differential Equation / ODE) menghubungkan suatu fungsi tak dikenal dengan satu atau lebih turunannya terhadap satu variabel bebas.
                    
                    1. ODE Orde Satu Linear:
                       Bentuk standar dy/dx + P(x)y = Q(x) diselesaikan menggunakan faktor pengintegralisasi:
                       mu(x) = exp(integral P(x) dx), sehingga d/dx [mu(x)*y] = mu(x)*Q(x).
                       Untuk persamaan Bernoulli dy/dx + P(x)y = Q(x)*y^n, substitusi v = y^(1-n) mereduksinya menjadi persamaan linear.
                       
                    2. ODE Linear Orde Dua Homogen Koefisien Konstan:
                       a*y'' + b*y' + c*y = 0 dengan persamaan karakteristik a*r^2 + b*r + c = 0.
                       - Dua akar riil berbeda (D > 0, overdamped): y(x) = c1*e^(r1*x) + c2*e^(r2*x).
                       - Akar kembar (D = 0, critically damped): y(x) = (c1 + c2*x)*e^(r*x).
                       - Akar kompleks konjugat r = alpha +- i*beta (D < 0, underdamped): y(x) = e^(alpha*x) * [c1*cos(beta*x) + c2*sin(beta*x)].
                       
                    3. ODE Non-Homogen:
                       Solusi umum y(x) = y_h(x) + y_p(x). Solusi partikular y_p dicari menggunakan metode koefisien tak tentu atau variasi parameter melalui determinan Wronskian W(y1, y2).
                       
                    4. Potret Fase Sistem Dinamik:
                       Sistem linear 2D dx/dt = Ax diklasifikasikan berdasarkan jejak (trace) dan determinan matriks A menjadi simpul (node), pelana (saddle), pusat (center), atau fokus spiral (spiral point).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Faktor pengintegralisasi mengubah penjumlahan turunan menjadi turunan perkalian tunggal d/dx [mu*y].",
                    "Diskriminan persamaan karakteristik menentukan apakah sistem berosilasi bebas, teredam kritis, atau teredam lebih.",
                    "Metode variasi parameter berlaku universal untuk sebarang fungsi pemaksa non-homogen f(x) menggunakan determinan Wronskian.",
                    "Potret fase memetakan stabilitas asimtotik sistem tanpa harus menghitung solusi eksplisit terhadap waktu secara analitik."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Faktor Pengintegralisasi Orde 1",
                        latex = "\\mu(x) = \\exp\\left(\\int P(x)\\,dx\\right), \\quad y(x) = \\frac{1}{\\mu(x)} \\left( \\int \\mu(x) Q(x)\\,dx + C \\right)",
                        explanation = "Faktor mu(x) mengalikan kedua ruas sehingga ruas kiri menjadi turunan produk d(mu*y)/dx."
                    ),
                    FormulaCard(
                        title = "Metode Variasi Parameter & Wronskian",
                        latex = "y_p(x) = -y_1(x)\\int \\frac{y_2(x) g(x)}{W(y_1, y_2)}\\,dx + y_2(x)\\int \\frac{y_1(x) g(x)}{W(y_1, y_2)}\\,dx",
                        explanation = "Determinan Wronskian W(y1, y2) = y1*y2' - y1'*y2 menjamin kebebasan linear dari himpunan solusi fundamental basis."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Analisis Getaran Peredam Suspensi Kereta Cepat Jakarta-Bandung (Whoosh)",
                    scenario = "Kereta Cepat Whoosh melaju pada kecepatan 350 km/jam di jalur layang dengan getaran rel periodik frekuensi tinggi.",
                    application = "Insinyur PT KCIC memodelkan osilasi bogie kereta menggunakan sistem ODE orde dua terkopel dengan peredam kejut hidrolik yaw damper. Dengan menyetel koefisien redaman c agar bernilai sedikit di bawah redaman kritis, kereta meredam guncangan lateral tanpa menimbulkan ketidaknyamanan hentakan keras bagi penumpang.",
                    impact = "Menjamin stabilitas dinamis bogie terhadap fenomena hunting oscillation pada kecepatan ultra-tinggi dan mencegah resiko anjlok di belokan tajam."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Bandul Teredam Cairan & Penentuan Koefisien Atenuasi",
                    objective = "Mengukur laju peluruhan eksponensial amplitudo bandul sederhana dalam medium udara dan air.",
                    materials = listOf("Tali 1 meter dan pemberat logam", "Wadah berisi air atau minyak goreng", "Penggaris atau busur derajat", "Kamera ponsel untuk merekam osilasi"),
                    steps = listOf(
                        "Ayunkan bandul di udara dengan sudut simpangan awal 10 derajat, catat amplitudo tiap puncak osilasi selama 20 periode.",
                        "Ulangi osilasi dengan pemberat tercelup sebagian dalam wadah air.",
                        "Plot logaritma natural amplitudo ln(theta_n) terhadap waktu t untuk membuktikan peluruhan linear ln(theta) = -lambda*t.",
                        "Hitung faktor kualitas Q dan koefisien redaman c medium."
                    ),
                    safetyNote = "Pastikan wadah stabil agar air tidak tumpah ke perangkat elektronik saat merekam ayunan."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Jika persamaan karakteristik ODE linear orde 2 memiliki akar kembar r1 = r2 = -3, bagaimanakah bentuk solusi umumnya?",
                        options = listOf(
                            "y(x) = (c1 + c2*x) * e^(-3x)",
                            "y(x) = c1*e^(-3x) + c2*e^(3x)",
                            "y(x) = c1*cos(3x) + c2*sin(3x)",
                            "y(x) = c1*e^(-3x) + c2*x^2*e^(-3x)"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Untuk akar karakteristik kembar r, basis solusi bebas linear kedua diperoleh dengan mengalikan solusi pertama dengan x, menghasilkan (c1 + c2*x)*e^(r*x).",
                        misconceptionAlert = "Seringkali pembelajar lupa mengalikan solusi kedua dengan x, yang akan membuat kedua konstanta c1 dan c2 tereduksi menjadi satu konstanta tunggal."
                    )
                )
            )

            "mat-transformasi-laplace" -> LessonData(
                conceptId = "mat-transformasi-laplace",
                simId = "sim-laplace-transfer",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana cara insinyur elektro menganalisis arus sirkuit yang tiba-tiba diberi tegangan saklar kotak berdenyut?",
                        narrativeContext = "Dimas bingung menyelesaikan persamaan diferensial rangkaian RLC bila tegangan masukan tidak kontinu."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menggunakan Transformasi Laplace, Dimas! Operasi turunan dan integral waktu yang rumit diubah menjadi perkalian aljabar biasa dalam domain frekuensi kompleks s.",
                        narrativeContext = "Kakek menuliskan definisi integral Laplace L{f(t)} = integral 0 sampai tak hingga e^(-st) f(t) dt."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan fungsi tangga Heaviside u(t-c) atau impuls Dirac delta(t) dapat ditangani secara elegan tanpa harus memecah persamaan menjadi banyak interval terpisah!",
                        narrativeContext = "Kirana menunjuk grafik fungsi transfer rasional H(s) dan invers Laplace menggunakan pecahan parsial."
                    )
                ),
                intuitionBody = """
                    Transformasi Laplace adalah operator integral integral integral yang memetakan fungsi waktu f(t) untuk t >= 0 ke dalam fungsi domain frekuensi kompleks F(s) = L{f(t)}.
                    
                    1. Definisi Integral Laplace:
                       F(s) = integral_0^inf e^(-st) f(t) dt, konvergen untuk Re(s) > s0 (daerah konvergensi / ROC).
                       
                    2. Sifat-Sifat Aljabar Fundamental:
                       - Turunan pertama: L{f'(t)} = s*F(s) - f(0).
                       - Turunan kedua: L{f''(t)} = s^2*F(s) - s*f(0) - f'(0).
                       - Sifat pergeseran frekuensi (First Shift): L{e^(at)*f(t)} = F(s - a).
                       - Sifat pergeseran waktu (Second Shift): L{f(t - c)*u(t - c)} = e^(-cs)*F(s), di mana u(t - c) adalah fungsi tangga Heaviside.
                       
                    3. Fungsi Impuls Dirac & Teorema Konvolusi:
                       - Impuls delta Dirac: L{delta(t - t0)} = e^(-s*t0), dan L{delta(t)} = 1.
                       - Konvolusi waktu f(t) * g(t) = integral_0^t f(tau) g(t - tau) dtau dipetakan menjadi perkalian aljabar murni: L{f * g} = F(s) * G(s).
                       
                    4. Invers Laplace:
                       f(t) = L^(-1){F(s)} dihitung melalui dekomposisi pecahan parsial (partial fraction expansion) atau integral kontur Bromwich.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Mengubah masalah nilai awal (IVP) diferensial orde tinggi menjadi persamaan aljabar linear sederhana dalam variabel s.",
                    "Kondisi awal f(0) dan f'(0) terintegrasi langsung secara otomatis sejak langkah transformasi pertama.",
                    "Operasi konvolusi domain waktu yang rumit dipetakan menjadi perkalian skalar sederhana F(s) * G(s).",
                    "Mampu memodelkan gaya tumbukan sesaat (impuls delta) dan peralihan saklar diskontinu (Heaviside step function)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Transformasi Turunan Laplace",
                        latex = "\\mathcal{L}\\{f''(t)\\} = s^2 F(s) - s f(0) - f'(0)",
                        explanation = "Turunan waktu orde n dipetakan menjadi suku polinomial s^n dikalikan F(s) dikurangi kondisi awal sistem pada t=0."
                    ),
                    FormulaCard(
                        title = "Teorema Konvolusi Laplace",
                        latex = "\\mathcal{L}\\{(f * g)(t)\\} = \\mathcal{L}\\left\\{ \\int_0^t f(\\tau) g(t - \\tau)\\,d\\tau \\right\\} = F(s) \\cdot G(s)",
                        explanation = "Respon sistem linear terhadap sebarang masukan adalah hasil kali konvolusi impuls respons g(t) dengan sinyal masukan f(t)."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Analisis Lonjakan Tegangan Sambaran Petir Gardu Induk PLN Cawang",
                    scenario = "Gardu Induk PLN bertegangan ekstra tinggi 500 kV mengalami sambaran petir mendadak yang memicu lonjakan impuls tegangan sesaat.",
                    application = "Insinyur sistem tenaga memodelkan gelombang sambaran petir sebagai fungsi impuls Dirac dan eksponensial ganda V(t) = V0*(e^(-at) - e^(-bt)). Dengan transformasi Laplace, respon transien rangkaian transformator dan penangkap petir (surge arrester) dianalisis dalam domain s untuk memastikan tegangan isolasi tidak tertembus breakdown.",
                    impact = "Mencegah ledakan transformator daya bernilai miliaran rupiah dan menghindari pemadaman listrik total (blackout) di area metropolitan Jakarta."
                ),
                homeLab = HomeLabData(
                    title = "Simulasi Numerik Respon Langkah (Step Response) Sirkuit RC",
                    objective = "Memverifikasi respon pengisian muatan kapasitor terhadap tegangan undak Heaviside menggunakan perkalian aljabar s.",
                    materials = listOf("Komputer / Kalkulator Python atau spreadsheet", "Buku catatan analisis matematika"),
                    steps = listOf(
                        "Tulis persamaan sirkuit R*dq/dt + q/C = V0*u(t) dengan kondisi awal q(0) = 0.",
                        "Terapkan transformasi Laplace: Q(s) = (V0/s) / (R*(s + 1/RC)).",
                        "Uraikan pecahan parsial: Q(s) = C*V0 * [1/s - 1/(s + 1/RC)].",
                        "Lakukan invers Laplace untuk mendapatkan q(t) = C*V0*(1 - e^(-t/RC)) dan plot kurva kenaikan muatan terhadap konstanta waktu tau = RC."
                    ),
                    safetyNote = "Latihan pemodelan berbasis analisis analitis dan komputasi, aman dilakukan di meja kerja."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Berapakah hasil transformasi Laplace dari f(t) = e^(4t) * sin(3t)?",
                        options = listOf(
                            "3 / ((s - 4)^2 + 9)",
                            "3 / ((s + 4)^2 + 9)",
                            "(s - 4) / ((s - 4)^2 + 9)",
                            "9 / ((s - 4)^2 + 9)"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Karena L{sin(3t)} = 3 / (s^2 + 9), berdasarkan teorema pergeseran pertama L{e^(at)*g(t)} = G(s - a), kita ganti s dengan (s - 4) sehingga menghasilkan 3 / ((s - 4)^2 + 9).",
                        misconceptionAlert = "Sering tertukar antara pembilang fungsi sinus (konstanta omega = 3) dengan fungsi kosinus (variabel s)."
                    )
                )
            )

            "mat-fourier-analisis" -> LessonData(
                conceptId = "mat-fourier-analisis",
                simId = "sim-fourier-series",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Kek, saat rekaman musik gamelan dikompres menjadi file MP3, bagaimana komputer mengenali nada-nada individual di antara denting perunggu yang rumit?",
                        narrativeContext = "Kirana mendengarkan rekaman gamelan Bali dan melihat tampilan equalizer spektrum audio di layarnya."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itulah keajaiban Jean-Baptiste Fourier! Sinyal gelombang periodik seaneh apa pun selalu dapat diurai menjadi penjumlahan gelombang sinus dan kosinus harmonik murni.",
                        narrativeContext = "Kakek mengilustrasikan rekonstruksi gelombang kotak dari deret gelombang harmonik ganjil."
                    ),
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Dan untuk gelombang non-periodik berdurasi tak hingga, deret berubah menjadi Transformasi Fourier kontinu, di mana Teorema Parseval menjamin energi sinyal tetap utuh!",
                        narrativeContext = "Dimas menuliskan integral transformasi Fourier F(omega) dan kaitannya dengan algoritma Fast Fourier Transform (FFT)."
                    )
                ),
                intuitionBody = """
                    Analisis Fourier adalah jembatan matematis antara domain waktu f(t) dan domain frekuensi F(omega).
                    
                    1. Deret Fourier untuk Fungsi Periodik T = 2L:
                       f(t) = a0/2 + sum_{n=1}^inf [an * cos(n*pi*t / L) + bn * sin(n*pi*t / L)].
                       Koefisien Euler-Fourier dihitung memanfaatkan sifat ortogonalitas fungsi sinus dan kosinus pada interval [-L, L]:
                       - a0 = (1/L) * integral_{-L}^L f(t) dt.
                       - an = (1/L) * integral_{-L}^L f(t) * cos(n*pi*t / L) dt.
                       - bn = (1/L) * integral_{-L}^L f(t) * sin(n*pi*t / L) dt.
                       
                    2. Bentuk Eksponensial Kompleks:
                       f(t) = sum_{n=-inf}^inf cn * e^(i*n*omega0*t), di mana cn = (1/T) * integral_{-T/2}^{T/2} f(t) * e^(-i*n*omega0*t) dt.
                       
                    3. Fenomena Gibbs & Konvergensi:
                       Pada titik diskontinuitas lonjakan fungsi, jumlah parsial deret Fourier selalu menghasilkan overshoot konstan sekitar 8.9% (fenomena Gibbs) yang tidak hilang meskipun n mendekati tak hingga.
                       
                    4. Transformasi Fourier Kontinu & Teorema Parseval:
                       - F(omega) = integral_{-inf}^inf f(t) * e^(-i*omega*t) dt.
                       - f(t) = (1 / 2*pi) * integral_{-inf}^inf F(omega) * e^(i*omega*t) domega.
                       - Teorema Parseval (Konservasi Energi): integral_{-inf}^inf |f(t)|^2 dt = (1 / 2*pi) * integral_{-inf}^inf |F(omega)|^2 domega.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Ortogonalitas gelombang harmonik memungkinkan kita mengekstrak kontribusi amplitudo tiap frekuensi secara independen.",
                    "Bentuk eksponensial kompleks menyatukan sinus dan kosinus menjadi e^(i*omega*t) dengan kalkulasi integral yang jauh lebih ringkas.",
                    "Fenomena Gibbs membuktikan batas matematis rekonstruksi fungsi diskontinu menggunakan basis fungsi analitik kontinu halus.",
                    "Teorema Parseval membuktikan bahwa total energi sinyal pada domain waktu identik dengan total energi pada spektrum frekuensinya."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Pasangan Transformasi Fourier Kontinu",
                        latex = "\\mathcal{F}\\{f(t)\\} = F(\\omega) = \\int_{-\\infty}^{\\infty} f(t) e^{-i\\omega t}\\,dt, \\quad f(t) = \\frac{1}{2\\pi}\\int_{-\\infty}^{\\infty} F(\\omega) e^{i\\omega t}\\,d\\omega",
                        explanation = "Memetakan fungsi kontinu dari domain waktu ke spektrum densitas frekuensi kontinum omega."
                    ),
                    FormulaCard(
                        title = "Teorema Parseval (Plancherel)",
                        latex = "\\int_{-\\infty}^{\\infty} |f(t)|^2\\,dt = \\frac{1}{2\\pi} \\int_{-\\infty}^{\\infty} |F(\\omega)|^2\\,d\\omega",
                        explanation = "Energi total gelombang terkonservasi sempurna saat ditransformasikan ke domain frekuensi."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pemrosesan Sinyal Seismik BMKG untuk Peringatan Dini Gempa Megathrust",
                    scenario = "Jaringan seismograf BMKG merekam getaran mikroseismik frekuensi tinggi dan gelombang Rayleigh periode panjang saat gempa laut dalam.",
                    application = "Sistem komputasi BMKG menerapkan Fast Fourier Transform (FFT) pada sinyal getaran seismik tanah untuk memisahkan gelombang primer (P-wave frekuensi tinggi) dari noise gemuruh ombak laut. Analisis spektrum Fourier memungkinkan penentuan magnitudo dan kedalaman hiposenter dalam hitungan 3 menit.",
                    impact = "Mengirimkan peringatan dini tsunami ke masyarakat pesisir pantai sebelum gelombang tsunami tiba di daratan."
                ),
                homeLab = HomeLabData(
                    title = "Analisis Spektrum Audio Frekuensi Instrumen Musik dengan FFT Ponsel",
                    objective = "Mengidentifikasi deret harmonik nada dasar dan overtone menggunakan aplikasi penganalisis spektrum audio.",
                    materials = listOf("Ponsel dengan aplikasi Spectrum Analyzer (misal Spectroid / Audacity di laptop)", "Alat musik (gitar, suling, atau peluit)"),
                    steps = listOf(
                        "Buka aplikasi visualisasi spektrum FFT dan bunyikan senar gitar nada A (440 Hz).",
                        "Amati puncak-puncak frekuensi yang muncul pada grafik spektrum.",
                        "Catat apakah puncak-puncak tersebut membentuk kelipatan bulat: 440 Hz, 880 Hz, 1320 Hz, 1760 Hz.",
                        "Bandingkan spektrum instrumen berdawai dengan peluit untuk membedakan deret harmonik kaya vs gelombang hampir murni."
                    ),
                    safetyNote = "Lakukan pengujian pada volume sedang agar tidak merusak pendengaran atau mikrofon ponsel."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Jika suatu fungsi periodik f(t) adalah fungsi ganjil simetris (f(-t) = -f(t)), bagaimanakah nilai koefisien Fourier an dan bn?",
                        options = listOf(
                            "Semua an = 0, hanya suku sinus bn yang ada",
                            "Semua bn = 0, hanya suku kosinus an yang ada",
                            "Semua an dan bn bernilai nol",
                            "a0 = 1 dan bn = 0"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Fungsi ganjil hanya terdiri dari komponen harmonik ganjil sinus. Karena cos(n*pi*t) adalah fungsi genap, perkalian f(t)*cos(...) menghasilkan fungsi ganjil yang integralnya pada [-L, L] bernilai 0 (an = 0).",
                        misconceptionAlert = "Sering mengira bahwa fungsi ganjil menghilangkan suku sinus bn, padahal sinus adalah fungsi ganjil sin(-x) = -sin(x)."
                    )
                )
            )

            "mat-pde-persamaan-diferensial-parsial" -> LessonData(
                conceptId = "mat-pde-persamaan-diferensial-parsial",
                simId = "sim-pde-heat-wave",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana para ahli geofisika memodelkan aliran panas bumi dari magma perut bumi menuju permukaan PLTP Dieng?",
                        narrativeContext = "Dimas melihat pipa uap geotermal di dataran tinggi Dieng yang mengalirkan panas stabil."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Mereka menggunakan Persamaan Diferensial Parsial (PDE) Difusi Panas: turunan waktu orde satu sebanding dengan Laplacian spasial orde dua: u_t = alpha * nabla^2(u).",
                        narrativeContext = "Kakek menggambarkan penampang kerak bumi dengan gradien suhu isotermal."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan kita menyelesaikannya dengan metode pemisahan variabel u(x,t) = X(x)*T(t), di mana syarat batas Dirichlet atau Neumann menghasilkan nilai eigen dan deret Fourier!",
                        narrativeContext = "Kirana menurunkan persamaan Sturm-Liouville dan fungsi ortogonal pada papan tulis matematika."
                    )
                ),
                intuitionBody = """
                    Persamaan Diferensial Parsial (PDE) melibatkan fungsi multivariabel beserta turunan-turunan parsialnya terhadap ruang dan waktu.
                    
                    1. Tiga Tipe PDE Linear Orde Dua Kanonik:
                       A*u_xx + B*u_xy + C*u_yy + ... = 0 diklasifikasikan berdasarkan diskriminan Delta = B^2 - 4AC:
                       - Hiperbolik (Delta > 0): Persamaan Gelombang u_tt = c^2 * u_xx (rambatan gelombang tanpa disipasi).
                       - Parabolik (Delta = 0): Persamaan Panas / Difusi u_t = alpha * u_xx (proses disipatif tak reversibel).
                       - Eliptik (Delta < 0): Persamaan Laplace nabla^2(u) = 0 dan Poisson nabla^2(u) = -rho (keadaan tunak / medan potensial).
                       
                    2. Metode Pemisahan Variabel:
                       Misalkan u(x,t) = X(x) * T(t). Substitusi ke PDE menghasilkan dua ODE terpisah dengan konstanta pemisah -lambda:
                       X''(x) + lambda*X(x) = 0 dan T'(t) + alpha*lambda*T(t) = 0.
                       Syarat batas menentukan nilai eigen lambda_n dan fungsi eigen X_n(x).
                       
                    3. Solusi d'Alembert untuk Gelombang 1D:
                       Untuk tali tak hingga: u(x,t) = 1/2 [f(x - ct) + f(x + ct)] + (1/2c) * integral_{x-ct}^{x+ct} g(s) ds.
                       Gelombang terurai menjadi gelombang maju f(x - ct) dan gelombang mundur f(x + ct).
                       
                    4. Koordinat Silinder dan Bola (Fungsi Khusus):
                       - Koordinat polar/silinder menghasilkan Persamaan Bessel: solusinya adalah fungsi Bessel J_m(x) dan Y_m(x).
                       - Koordinat bola menghasilkan Persamaan Legendre: solusinya adalah polinomial Legendre P_l(cos theta).
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Klasifikasi eliptik, parabolik, dan hiperbolik menentukan sifat fisik perambatan informasi (gelombang berkecepatan c vs difusi seketika).",
                    "Pemisahan variabel mengubah satu PDE multivariabel menjadi beberapa ODE univariat terkopel melalui nilai eigen lambda.",
                    "Syarat batas Dirichlet menetapkan nilai fungsi di perbatasan, sedangkan Neumann menetapkan fluks gradien turunan normal.",
                    "Geometri simetri silinder dan bola memunculkan fungsi ortogonal khusus (Bessel dan Legendre) sebagai basis ekspansi."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Persamaan Gelombang 1D & Solusi d'Alembert",
                        latex = "\\frac{\\partial^2 u}{\\partial t^2} = c^2 \\frac{\\partial^2 u}{\\partial x^2}, \\quad u(x,t) = \\phi(x - ct) + \\psi(x + ct)",
                        explanation = "Solusi umum gelombang 1D merupakan superposisi gelombang sembarang yang merambat ke kanan dan ke kiri dengan kecepatan c."
                    ),
                    FormulaCard(
                        title = "Pemisahan Variabel Persamaan Panas 1D",
                        latex = "u(x,t) = \\sum_{n=1}^{\\infty} B_n \\sin\\left(\\frac{n\\pi x}{L}\\right) \\exp\\left( -\\alpha \\left(\\frac{n\\pi}{L}\\right)^2 t \\right)",
                        explanation = "Harmonik spasial frekuensi tinggi meluruh secara eksponensial jauh lebih cepat seiring bertambahnya waktu t."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Pemodelan Distribusi Suhu Beton Bendungan Jatigede Jawa Barat",
                    scenario = "Pengecoran blok beton masif jutaan meter kubik pada Bendungan Jatigede menghasilkan panas hidrasi semen yang sangat tinggi di bagian inti.",
                    application = "Insinyur sipil hidroteknik memecahkan persamaan panas 3D dengan konduksi difusif dan sumber panas internal q(t). Dengan menghitung gradien suhu menggunakan solusi numerik PDE, insinyur merancang jaringan pipa pendingin air dingin di dalam beton guna mencegah timbulnya retakan termal struktural.",
                    impact = "Menjamin integritas struktural bendungan setinggi 110 meter dan menahan volume waduk sebesar 980 juta meter kubik air secara aman."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Difusi Termal 1D pada Batang Logam dengan Termometer Sensor",
                    objective = "Mengamati peluruhan gradien suhu non-tunak menuju keadaan tunak linear pada batang konduktor.",
                    materials = listOf("Batang sendok logam panjang / pipa tembaga kecil", "Secangkir air mendidih", "Secangkir air es batu", "Dua termometer dapur digital"),
                    steps = listOf(
                        "Rendam ujung kiri batang di dalam air mendidih (100 C) dan ujung kanan di air es (0 C).",
                        "Catat suhu di titik tengah batang (x = L/2) setiap 15 detik selama 5 menit.",
                        "Amati bagaimana kurva kenaikan suhu mendekati nilai tunak teoretis linear u(L/2) = (100 + 0) / 2 = 50 C.",
                        "Bandingkan laju pendekatan terhadap solusi deret Fourier analitis."
                    ),
                    safetyNote = "Gunakan sarung tangan isolator panas saat memegang logam yang dipanaskan air mendidih."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Manakah di antara persamaan berikut yang termasuk dalam klasifikasi PDE bertipe eliptik?",
                        options = listOf(
                            "Persamaan Laplace: u_xx + u_yy = 0",
                            "Persamaan Gelombang: u_tt - c^2*u_xx = 0",
                            "Persamaan Panas: u_t - alpha*u_xx = 0",
                            "Persamaan Adveksi: u_t + v*u_x = 0"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Pada persamaan Laplace u_xx + u_yy = 0, koefisien A=1, B=0, C=1, sehingga diskriminan B^2 - 4AC = 0 - 4(1)(1) = -4 < 0, yang secara definitif merupakan PDE tipe eliptik.",
                        misconceptionAlert = "Jangan keliru antara eliptik (keadaan tunak tanpa turunan waktu) dengan parabolik (difusi dengan turunan waktu orde 1)."
                    )
                )
            )

            "mat-probabilitas-inferensi-regresi" -> LessonData(
                conceptId = "mat-probabilitas-inferensi-regresi",
                simId = "sim-stats-inference",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana lembaga survei pemilu atau BPS bisa memprediksi rata-rata pendapatan jutaan keluarga hanya dari beberapa ribu sampel acak?",
                        narrativeContext = "Dimas membaca rilis data statistik sensus ekonomi nasional Badan Pusat Statistik (BPS)."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Itu bertumpu pada Teorema Batas Pusat (CLT)! Berapapun bentuk distribusi populasi aslinya, rata-rata dari sampel acak berukuran cukup besar selalu berdistribusi Normal.",
                        narrativeContext = "Kakek menggambar kurva lonceng Gaussian distribusi sampling rata-rata."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk mengestimasi parameter tak diketahui, kita memaksimumkan fungsi Likelihood (MLE) atau memecahkan regresi berganda menggunakan proyeksi matriks ortogonal!",
                        narrativeContext = "Kirana menunjukkan formulasi matriks beta = (X^T * X)^(-1) * X^T * y."
                    )
                ),
                intuitionBody = """
                    Probabilitas dan statistika tingkat sarjana memperluas statistika deskriptif menjadi inferensi matematis formal dan regresi linear multivariat.
                    
                    1. Peubah Acak Multivariat & Matriks Kovariansi:
                       Vektor acak X = [X1, X2, ..., Xp]^T memiliki vektor nilai harapan mu = E[X] dan matriks variansi-kovariansi Sigma = E[(X - mu)(X - mu)^T]. Matriks Sigma selalu simetris dan semi-definit positif.
                       
                    2. Teorema Batas Pusat (Central Limit Theorem / CLT):
                       Jika X1, X2, ..., Xn adalah peubah acak bebas dan berdistribusi identik (i.i.d.) dengan rata-rata mu dan variansi sigma^2 terhingga, maka saat n -> inf:
                       Z_n = (X_bar - mu) / (sigma / sqrt(n)) konvergen dalam distribusi ke N(0, 1).
                       
                    3. Estimasi Titik Maximum Likelihood Estimation (MLE):
                       Fungsi likelihood L(theta; x) = prod f(xi; theta). Parameter penduga theta_hat diperoleh dengan mencari titik stasioner turunan log-likelihood:
                       d/d(theta) [ ln L(theta; x) ] = 0. Penduga MLE bersifat konsisten dan asimtotik efisien (mencapai Batas Bawah Cramér-Rao).
                       
                    4. Regresi Linear Berganda Formulasi Matriks:
                       Model: y = X*beta + epsilon, dengan asumsi E[epsilon] = 0 dan Var(epsilon) = sigma^2 * I.
                       Penduga Kuadrat Terkecil Biasa (OLS):
                       beta_hat = (X^T * X)^(-1) * X^T * y.
                       Residual e = y - X*beta_hat tegak lurus (ortogonal) terhadap ruang kolom matriks X.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "CLT membuktikan mengapa distribusi normal Gaussian menjadi fondasi alamiah hampir seluruh metode inferensi statistik modern.",
                    "Metode MLE mencari parameter populasi yang memaksimalkan probabilitas teramatinya data sampel yang diperoleh.",
                    "Regresi OLS secara geometris adalah proyeksi ortogonal vektor respons y ke dalam subruang kolom matriks prediktor X.",
                    "Uji hipotesis statistik membandingkan variansi antar-perlakuan dengan variansi dalam-kelompok (rasio F ANOVA)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Penduga Kuadrat Terkecil Matriks (OLS)",
                        latex = "\\hat{\\boldsymbol{\\beta}} = (\\mathbf{X}^T \\mathbf{X})^{-1} \\mathbf{X}^T \\mathbf{y}, \\quad \\mathrm{Cov}(\\hat{\\boldsymbol{\\beta}}) = \\sigma^2 (\\mathbf{X}^T \\mathbf{X})^{-1}",
                        explanation = "Persamaan normal Gauss-Markov yang menghasilkan penduga linear tak-bias terbaik (BLUE) untuk vektor koefisien regresi."
                    ),
                    FormulaCard(
                        title = "Fungsi Log-Likelihood & Penduga MLE",
                        latex = "\\ell(\\boldsymbol{\\theta}) = \\sum_{i=1}^n \\ln f(x_i; \\boldsymbol{\\theta}), \\quad \\nabla_{\\boldsymbol{\\theta}} \\ell(\\hat{\\boldsymbol{\\theta}}) = \\mathbf{0}",
                        explanation = "Memaksimalkan logaritma dari fungsi probabilitas bersama untuk mengestimasi parameter populasi."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Prediksi Hasil Panen Padi Nasional Menggunakan Regresi Multivariat BMKG & Kementan",
                    scenario = "Kementerian Pertanian ingin memprediksi fluktuasi produksi beras di Karawang dan Subang berdasarkan anomali curah hujan dan radiasi matahari.",
                    application = "Tim data saintifik memodelkan produksi gabah kering giling (y) terhadap matriks variabel bebas X (curah hujan bulanan, suhu muka laut El Niño SOI, dosis pupuk urea, luas panen). Menggunakan penduga OLS dan uji signifikansi F-test/t-test multivariat, model memberikan akurasi prediksi R^2 sebesar 89% tiga bulan sebelum masa panen.",
                    impact = "Memungkinkan pemerintah mengambil kebijakan impor atau stabilisasi stok beras Bulog secara tepat waktu demi menjaga ketahanan pangan nasional."
                ),
                homeLab = HomeLabData(
                    title = "Eksperimen Pembuktian Teorema Batas Pusat (CLT) dengan Lemparan Dadu",
                    objective = "Mengamati transformasi distribusi seragam diskrit dadu menjadi kurva normal seiring penambahan ukuran sampel n.",
                    materials = listOf("Dua hingga lima buah dadu (atau generator angka acak 1-6 di spreadsheet)", "Kertas grafik atau Google Sheets"),
                    steps = listOf(
                        "Lempar 1 dadu sebanyak 100 kali, buat histogram frekuensi nilainya (distribusi seragam datar).",
                        "Lempar sepasang dadu (n=2), hitung rata-ratanya, ulangi 100 kali dan plot histogramnya (distribusi segitiga).",
                        "Lempar 5 dadu (n=5), hitung rata-rata tiap lemparan, ulangi 100 kali dan plot hasilnya.",
                        "Perhatikan bagaimana histogram n=5 membentuk kurva lonceng simetris Gaussian berpusat di mu = 3.5."
                    ),
                    safetyNote = "Eksperimen berbasis probabilitas mandiri, aman dan edukatif untuk dikerjakan di rumah."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Dalam regresi linear berganda y = X*beta + epsilon, apakah syarat utama pada matriks X agar penduga OLS beta_hat = (X^T * X)^(-1) * X^T * y dapat dihitung secara unik?",
                        options = listOf(
                            "Matriks X harus memiliki rank kolom penuh (full column rank), sehingga X^T * X memiliki invers",
                            "Matriks X harus berupa matriks bujur sangkar simetris",
                            "Jumlah observasi data harus sama persis dengan jumlah variabel prediktor",
                            "Determinan matriks X harus bernilai nol"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Jika kolom-kolom matriks X bebas linear (full column rank), maka matriks perkalian X^T * X berukuran p x p bersifat nonsingular (memiliki determinan != 0) sehingga dapat dibalik (invertible).",
                        misconceptionAlert = "Jika terjadi multikolinearitas sempurna (kolom saling bergantungan), X^T * X tidak dapat dibalik dan estimator OLS gagal dihitung."
                    )
                )
            )

            "mat-metode-numerik-komputasi" -> LessonData(
                conceptId = "mat-metode-numerik-komputasi",
                simId = "sim-numeric-methods",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, persamaan non-linear seperti x^5 - 3x + 1 = 0 atau orbit satelit tidak memiliki rumus analitis tertutup seperti rumus kuadrat ABC. Bagaimana komputer menyelesaikannya?",
                        narrativeContext = "Dimas mencoba memecahkan persamaan polinomial derajat tinggi secara eksak."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Insinyur komputasi beralih ke Metode Numerik! Dengan algoritma iteratif seperti Newton-Raphson atau Runge-Kutta, kita bisa mendekati solusi sejati dengan presisi setinggi yang diinginkan.",
                        narrativeContext = "Kakek menggambar garis singgung tangen pada kurva f(x) yang memotong sumbu-x."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan untuk integrasi numerik yang sangat presisi, Kuadratur Gauss-Legendre memilih titik-titik evaluasi optimal sehingga polinomial derajat tinggi terintegrasi eksak hanya dari beberapa titik sampel!",
                        narrativeContext = "Kirana membandingkan efisiensi aturan trapesium, aturan Simpson, dan kuadratur Gauss."
                    )
                ),
                intuitionBody = """
                    Metode Numerik adalah algoritma diskrit untuk memecahkan masalah matematika kontinu (persamaan non-linear, interpolasi kurva, integrasi, dan ODE) menggunakan operasi aritmatika komputer.
                    
                    1. Pencarian Akar Persamaan Non-Linear:
                       - Metode Biseksi: Berdasarkan Teorema Nilai Antara, konvergen linear lambat namun selalu stabil (brute-force dividing interval).
                       - Metode Newton-Raphson: x_{k+1} = x_k - f(x_k) / f'(x_k). Memiliki laju konvergensi kuadratik (galat e_{k+1} ~ C * e_k^2) di dekat akar sederhana.
                       
                    2. Interpolasi Polinomial & Spline Kubik:
                       Interpolasi Lagrange derajat tinggi rentan terhadap osilasi liar di ujung interval (fenomena Runge).
                       Spline Kubik memecahkan masalah ini dengan menghubungkan titik-titik data menggunakan potongan kurva polinomial derajat 3 yang kontinu hingga turunan kedua (C^2 continuity).
                       
                    3. Integrasi Numerik (Kuadratur):
                       - Aturan Simpson 1/3: Mengaproksimasi integran dengan parabola lokal berderajat 2.
                       - Kuadratur Gauss-Legendre: Mengoptimalkan penempatan titik evaluasi x_i (akar polinomial Legendre P_n(x)) dan bobot w_i, mampu mengintegrasikan secara eksak polinomial berderajat hingga 2n - 1.
                       
                    4. Solusi Numerik ODE (Integrator Runge-Kutta RK4):
                       Metode Euler orde satu y_{n+1} = y_n + h*f(t_n, y_n) memiliki galat pemotongan lokal O(h^2) dan akumulasi galat global O(h).
                       Metode Klasik Runge-Kutta Orde Empat (RK4) menghitung empat kemiringan sampel (k1, k2, k3, k4) menghasilkan galat global O(h^4) dengan stabilitas numerik yang luar biasa tinggi.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Konvergensi kuadratik Newton-Raphson melipatgandakan jumlah digit presisi yang benar pada setiap langkah iterasi.",
                    "Spline kubik mencegah osilasi fenomena Runge dengan menjamin kontinuitas kelengkungan (turunan kedua) di setiap simpul sambungan.",
                    "Kuadratur Gauss-Legendre memaksimalkan derajat ketelitian polinomial tanpa menambah jumlah titik komputasi secara sia-sia.",
                    "Integrator RK4 menyeimbangkan kompleksitas komputasi dengan stabilitas trayektori dinamik sistem ODE."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Iterasi Newton-Raphson",
                        latex = "x_{n+1} = x_n - \\frac{f(x_n)}{f'(x_n)}, \\quad |e_{n+1}| \\le M |e_n|^2",
                        explanation = "Mencari perpotongan garis singgung kurva dengan sumbu x menuju akar f(x)=0 dengan laju konvergensi kuadratik."
                    ),
                    FormulaCard(
                        title = "Integrator Runge-Kutta Orde 4 (RK4)",
                        latex = "y_{n+1} = y_n + \\frac{h}{6}(k_1 + 2k_2 + 2k_3 + k_4)",
                        explanation = "Rata-rata berbobot dari 4 kemiringan coba untuk melangkah sejauh interval h dengan galat lokal O(h^5)."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Integrasi Lintasan Orbit Satelit LAPAN-A3 / IPB dengan Integrator RK4",
                    scenario = "Satelit mikro LAPAN-A3 mengorbit bumi pada ketinggian 500 km dengan gaya gravitasi non-sferis bumi (anomali medan J2) dan gesekan atmosfer atas.",
                    application = "Pusat Teknologi Satelit BRIN menggunakan algoritma integrator numerik RK4 dengan adaptasi ukuran langkah waktu (adaptive step-size) untuk memprediksi posisi orbit satelit selama 30 hari ke depan, memastikan antena stasiun bumi di Rumpin Bogor selalu mengunci sinyal komunikasi satelit secara presisi.",
                    impact = "Menghindari tabrakan dengan puing luar angkasa (space debris) dan menjamin stabilitas misi pemantauan wilayah pertanian dan maritim Nusantara."
                ),
                homeLab = HomeLabData(
                    title = "Implementasi Algoritma Newton-Raphson Sederhana pada Kalkulator",
                    objective = "Menghitung nilai akar kuadrat sqrt(7) secara manual menggunakan iterasi Newton-Raphson f(x) = x^2 - 7.",
                    materials = listOf("Kalkulator biasa atau ponsel", "Kertas catatan dan pulpen"),
                    steps = listOf(
                        "Rumuskan fungsi f(x) = x^2 - 7 dan turunannya f'(x) = 2x.",
                        "Tulis rumus iterasi: x_{k+1} = x_k - (x_k^2 - 7)/(2*x_k) = (x_k + 7/x_k) / 2.",
                        "Pilih tebakan awal x0 = 3. Hitung x1 = (3 + 7/3) / 2 = 2.666667.",
                        "Hitung x2 = (2.666667 + 7/2.666667) / 2 = 2.645833.",
                        "Bandingkan dengan nilai kalkulator sqrt(7) = 2.645751; perhatikan akurasi luar biasa hanya dalam 2 langkah!"
                    ),
                    safetyNote = "Eksperimen komputasi aritmatika tanpa risiko fisik."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Mengapa metode spline kubik lebih disukai daripada interpolasi polinomial tunggal berderajat tinggi saat menghubungkan banyak titik data?",
                        options = listOf(
                            "Untuk menghindari fenomena Runge (osilasi liar pada tepi rentang data) dan menjaga kontinuitas kelengkungan kurva",
                            "Karena spline kubik selalu menghasilkan garis lurus",
                            "Karena interpolasi polinomial tunggal tidak pernah bisa melewati titik data",
                            "Karena metode spline kubik tidak memerlukan perhitungan turunan"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Polinomial derajat tinggi sering mengalami osilasi ekstrem di dekat batas interval (fenomena Runge). Spline kubik membagi kurva menjadi segmen kubik lokal dengan transisi mulus kontinu hingga turunan kedua, menghasilkan kurva stabil dan realistis.",
                        misconceptionAlert = "Sering dikira derajat polinomial yang makin tinggi otomatis menghasilkan kurva interpolasi yang selalu lebih baik secara fisik."
                    )
                )
            )

            "mat-optimasi-program-linear" -> LessonData(
                conceptId = "mat-optimasi-program-linear",
                simId = "sim-linear-programming",
                storyPanels = listOf(
                    StoryPanel(
                        speaker = "Dimas",
                        dialogue = "Kek, bagaimana perusahaan kapal logistik PT Pelni menentukan jadwal dan kapasitas muatan peti kemas antarpulau agar keuntungan maksimal tapi bahan bakar kapal tetap efisien?",
                        narrativeContext = "Dimas melihat kesibukan bongkar muat peti kemas di Pelabuhan Tanjung Perak Surabaya."
                    ),
                    StoryPanel(
                        speaker = "Kakek",
                        dialogue = "Masalah itu dimodelkan menggunakan Pemrograman Linear (Linear Programming)! Wilayah solusi feasible membentuk polihedron cembung berdimensi banyak.",
                        narrativeContext = "Kakek menggambar daerah penyelesaian fisibel poligon pada diagram koordinat."
                    ),
                    StoryPanel(
                        speaker = "Kirana",
                        dialogue = "Dan algoritma Simpleks George Dantzig bergerak cerdas menyusuri titik-titik sudut ekstrim (verteks) polihedron hingga menemukan nilai optimum global dalam sekejap!",
                        narrativeContext = "Kirana menjelaskan transformasi tabel Simpleks dan analisis dualitas harga bayangan (shadow price)."
                    )
                ),
                intuitionBody = """
                    Optimasi matematika mencari nilai variabel keputusan x yang memaksimumkan atau meminimumkan fungsi tujuan f(x) dengan mematuhi kendala-kendala kesetaraan maupun ketaksamaan.
                    
                    1. Formulasi Kanonik Linear Programming (LP):
                       Maksimumkan z = c^T * x
                       terhadap kendala A*x <= b dan x >= 0.
                       Himpunan semua titik yang memenuhi kendala membentuk himpunan cembung (convex polyhedron). Teorema Fundamental LP menyatakan bahwa jika solusi optimal ada, maka solusi tersebut pasti terletak pada setidaknya satu titik sudut (ekstrim) polihedron.
                       
                    2. Metode Simpleks Baku:
                       Mengubah ketaksamaan menjadi kesetaraan menggunakan variabel kelonggaran (slack variables s_i >= 0).
                       Iterasi berpindah dari satu Solusi Fisibel Basis (BFS) ke BFS tetangga yang berdekatan dengan memilih variabel masuk (koefisien tereduksi paling negatif) dan variabel keluar (rasio minimum b_i / a_ik).
                       
                    3. Teorema Dualitas & Analisis Sensitivitas:
                       Setiap masalah Primal memiliki masalah Dual yang bersesuaian:
                       - Primal: Maksimumkan c^T * x s.t. Ax <= b, x >= 0.
                       - Dual: Minimumkan b^T * y s.t. A^T * y >= c, y >= 0.
                       - Teorema Dualitas Kuat: Nilai optimum fungsi tujuan primal dan dual adalah sama persis (c^T * x* = b^T * y*).
                       - Nilai optimal variabel dual y_i* mewakili harga bayangan (shadow price): laju pertambahan keuntungan jika kapasitas sumber daya b_i dinaikkan satu satuan.
                       
                    4. Optimasi Tak Berkendala & Penurunan Gradien (Gradient Descent):
                       Untuk fungsi objektif non-linear mulus f(x), iterasi bergerak berlawanan arah vektor gradien:
                       x_{k+1} = x_k - alpha * grad f(x_k), dengan laju pembelajaran alpha > 0.
                """.trimIndent(),
                intuitionPoints = listOf(
                    "Daerah fisibel berbentuk cembung menjamin bahwa titik optimum lokal selalu merupakan titik optimum global.",
                    "Algoritma Simpleks tidak perlu memeriksa seluruh isi polihedron, melainkan hanya melompati titik-titik sudut verteksnya.",
                    "Teorema dualitas memberikan wawasan ekonomis bernilai tinggi melalui harga bayangan (shadow price) sumber daya yang terbatas.",
                    "Metode Gradient Descent menjadi fondasi inti optimasi seluruh algoritma pembelajaran mesin dan jaringan saraf tiruan (AI)."
                ),
                formulaCards = listOf(
                    FormulaCard(
                        title = "Formulasi Masalah Primal dan Dual LP",
                        latex = "\\text{Primal: } \\max \\mathbf{c}^T \\mathbf{x} \\quad \\text{s.t. } \\mathbf{A}\\mathbf{x} \\le \\mathbf{b}, \\mathbf{x} \\ge \\mathbf{0} \\iff \\text{Dual: } \\min \\mathbf{b}^T \\mathbf{y} \\quad \\text{s.t. } \\mathbf{A}^T \\mathbf{y} \\ge \\mathbf{c}, \\mathbf{y} \\ge \\mathbf{0}",
                        explanation = "Teorema dualitas kuat menjamin nilai optimum kedua formulasi bernilai sama persis pada titik kesetimbangan."
                    ),
                    FormulaCard(
                        title = "Pembaruan Gradient Descent",
                        latex = "\\mathbf{x}_{k+1} = \\mathbf{x}_k - \\alpha \\nabla f(\\mathbf{x}_k)",
                        explanation = "Melangkah menyusuri arah penurunan gradien paling curam untuk meminimumkan fungsi objektif non-linear f(x)."
                    )
                ),
                caseStudy = CaseStudyData(
                    title = "Optimasi Rute dan Pasokan BBM Kilang Pertamina Balongan",
                    scenario = "Kilang minyak Pertamina Balongan memproses minyak mentah menjadi avtur, bensin pertamax, dan solar untuk disalurkan ke depot BBM Jawa bagian barat.",
                    application = "Tim perencana operasi Pertamina memformulasikan masalah pencampuran (blending problem) dan distribusi logistik menggunakan Linear Programming dengan ratusan kendala kapasitas pipa, tangki penyimpanan, dan spesifikasi oktan RON. Menggunakan solver Simpleks, optimasi menghemat biaya operasional miliaran rupiah per hari.",
                    impact = "Mencegah kelangkaan BBM di wilayah padat penduduk sekaligus memaksimalkan margin laba pengolahan minyak mentah nasional."
                ),
                homeLab = HomeLabData(
                    title = "Optimasi Anggaran Belanja Nutrisi Harian Berbasis Grafik Manual",
                    objective = "Menemukan kombinasi dua menu makanan berbiaya minimum yang memenuhi target protein dan kalori harian.",
                    materials = listOf("Kertas milimeter blok / berpetak", "Penggaris dan pensil warna", "Tabel informasi gizi kemasan (misal tempe dan telur)"),
                    steps = listOf(
                        "Tentukan variabel: x1 = porsi tempe (harga Rp 3000), x2 = butir telur (harga Rp 2500).",
                        "Fungsi tujuan: Minimumkan Biaya Z = 3000*x1 + 2500*x2.",
                        "Kendala: Protein (10*x1 + 6*x2 >= 40 gram), Kalori (150*x1 + 80*x2 >= 500 kkal), x1, x2 >= 0.",
                        "Gambar garis-garis kendala pada kertas grafik dan arsir daerah penyelesaian fisibel.",
                        "Evaluasi nilai biaya Z pada setiap titik sudut verteks untuk menemukan kombinasi porsi paling ekonomis."
                    ),
                    safetyNote = "Latihan optimasi grafis matematika yang sepenuhnya aman dan aplikatif."
                ),
                quizQuestions = listOf(
                    QuizQuestion(
                        question = "Dalam teori dualitas programa linear, apakah arti dari 'shadow price' (harga bayangan) dari suatu kendala sumber daya kapasitas?",
                        options = listOf(
                            "Besarnya peningkatan nilai fungsi tujuan optimum jika kapasitas batas sumber daya tersebut dinaikkan sebesar satu satuan",
                            "Harga diskon barang yang dijual di pasar gelap",
                            "Biaya tambahan tak terduga akibat kegagalan komputasi algoritma Simpleks",
                            "Selisih harga jual produk terhadap biaya produksi variabel"
                        ),
                        correctOptionIndex = 0,
                        explanation = "Shadow price adalah nilai optimal variabel dual y_i*. Ini menunjukkan laju perubahan sensitivitas nilai fungsi objektif maksimum per unit penambahan kendala sumber daya ruas kanan b_i.",
                        misconceptionAlert = "Sering disalahartikan sebagai biaya kerugian riil, padahal merupakan nilai marjinal valuasi internal sumber daya."
                    )
                )
            )

            else -> null
        }
    }
}

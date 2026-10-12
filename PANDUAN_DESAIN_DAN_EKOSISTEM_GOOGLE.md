# 🌌 PANDUAN DESAIN UI/UX & STRATEGI EKOSISTEM GOOGLE (NANO BANANA)
**Proyek**: Semesta — Kosmos Edukasi Sains & Matematika Interaktif  
**Repositori Acuan Desain**: [Desain-Semesta-Mobile (GitHub)](https://github.com/RizkiNurmahmudi/Desain-Semesta-Mobile.git)  
**Pendekatan**: 100% Efisien Biaya (*Zero Subscription Cost*), Menggunakan Desain TypeScript Buatan Pengembang & AI Generatif Ekosistem Google / Nano Banana.

---

## 📌 1. Latar Belakang & Perubahan Strategis

Pengembangan Semesta Versi 1 difokuskan untuk **segera meluncur secara resmi di Google Play Store** dengan efisiensi biaya maksimal:
- **Penyesuaian Biaya**: Menghindari langganan berbayar (ChatGPT Plus & Higgsfield MCP).
- **Ekosistem Google & Nano Banana**: Pembuatan aset gambar, ilustrasi materi, dan icon memanfaatkan model AI Image Generation dari keluarga Google/Gemini (ekosistem Nano Banana / Imagen) langsung di dalam lingkungan Antigravity melalui tool `generate_image`. Jika terkena kuota batas harian/menit (*rate limit*), kita cukup menunggu *cooldown* tanpa mengeluarkan biaya tambahan.
- **Blueprint Desain Resmi**: Desain antarmuka yang telah dibangun di repositori GitHub [Desain-Semesta-Mobile](https://github.com/RizkiNurmahmudi/Desain-Semesta-Mobile.git) (React + TypeScript) menjadi **panduan visual utama 1-ke-1** untuk diimplementasikan ke dalam Android Jetpack Compose.
- **Rencana Skalabilitas Mendatang**: Setelah Versi 1 terbit di Play Store dan menghasilkan pendapatan (*monetisasi*), kualitas estetika, video, dan audio dapat ditingkatkan lebih lanjut dengan alat premium di Versi 2.0.

---

## 🎨 2. Analisis Blueprint Desain (`Desain-Semesta-Mobile`)

Repositori GitHub pengembang telah dianalisis dan memiliki fondasi UI/UX yang sangat matang:

### A. Palet Warna & Identitas Merek
| Elemen | Kode Warna | Penggunaan |
| :--- | :--- | :--- |
| **Deep Blue (Kosmik Utama)** | `#1E6FB8` | Latar kartu utama, tombol primer, logo |
| **Baby Blue (Aksen Langit)** | `#89CFF0` | Glow, border orbit atom, secondary highlight |
| **Warm Amber (Energi Bintang)** | `#FFC53D` / `#F59E0B` | Inti atom, XP, streak harian, badge emas |
| **Emerald Success** | `#22C55E` / `#10B981` | Status materi dikuasai, jawaban kuis benar |
| **Slate Dark (Kontras Teks)** | `#0B0F19` / `#1E293B` | Latar dark mode, tipografi utama |

### B. Desain Logo Vektor (`SemestaAtomLogo`)
Logo berbentuk lambang atom bersudut lengkung (*squircle*) dengan orbit elips bersudut rotasi $\pm 32^\circ$, elektron melayang warna kuning hangat & putih, serta inti atom bercahaya. Logo ini siap dikonversi ke **Vector Asset XML Android** (`res/drawable/ic_semesta_atom_logo.xml`).

### C. Karakter Avatar Edukasi Keluarga
Empat karakter lokal Indonesia dengan identitas visual khas:
1. **Kirana (9 tahun)**: Anak penjelajah cilik, rambut kuncir dua dengan jepit bintang (`#E1F4FD`).
2. **Dimas (14 tahun)**: Remaja pelajar SMP, rambut ikal modern, antusias eksperimen (`#FEF3C7`).
3. **Bu Ratna (38 tahun)**: Orang tua / pendamping belajar, kacamata elegan (`#F3E8FF`).
4. **Kak Arya (19 tahun)**: Mahasiswa teknik, analitis dan fokus kalkulus (`#DCFCE7`).

### D. Struktur 11 Layar Acuan
1. **Splash Screen**: Logo atom bercahaya + tombol masuk petualangan sains.
2. **Profile Picker Screen**: Pilihan anggota keluarga dengan kartu avatar karakter, streak harian, dan XP.
3. **Home Catalog Screen**: Header pencarian, chip level (L0-L5) & domain (Fisika, Matematika, Kimia, Biologi), kartu materi dengan cincin progres SVG (*Progress Ring*).
4. **Concept Detail Screen**: Tab switcher (Cerita Bergambar, Simulasi Interaktif, Jurnal Home Lab, Studi Kasus), formula card interaktif, dan quick note taking.
5. **Story Viewer Screen**: Komik edukasi 6 panel dengan dialog balon speaker kontekstual.
6. **Simulation Screen**: Kanvas interaktif dengan slider parameter fisika/matematika real-time.
7. **Formative Quiz Screen**: Kuis berjenjang dengan petunjuk bantuan (*hints*) dan progress bar.
8. **Quiz Result Screen**: Skor akurasi, bintang evaluasi, perolehan XP, dan rekomendasi langkah berikutnya.
9. **Skill Map Screen**: Pohon visual prasyarat materi sains (*prerequisite tree*).
10. **Progress Dashboard Screen**: Grafik konsistensi 7 hari, akumulasi XP, dan tingkat penguasaan topik.
11. **Profile Settings Screen**: Pengaturan mode UI (Penjelajah / Pelajar / Ahli), ekspor raport/sertifikat PDF, dan cadangan offline.

---

## 🤖 3. Pemanfaatan AI Generatif Ekosistem Google (Nano Banana)

Seluruh kebutuhan aset gambar diproduksi langsung melalui tool `generate_image` bawaan lingkungan Antigravity (berbasis Google Imagen/Gemini Visual Family):

### A. Alur Kerja Generasi Gambar:
1. **Prompt Spesifik**: Menggunakan parameter gaya visual konsisten (*flat vector illustration with gentle 3D depth, cosmic sci-fi theme, harmonious palette* `#1E6FB8`, `#89CFF0`, `#FFC53D`).
2. **Penyimpanan Lokal Otomatis**: Berkas disimpan ke `app/src/main/res/drawable/`.
3. **Strategi Cooldown**: Jika sistem mencapai batas kuota request (*rate limit*), proses dilanjutkan setelah jeda cooldown selesai tanpa beban finansial.

### B. Daftar Kebutuhan Aset Gambar untuk Play Store:
- [x] **App Launcher Icon** (512x512 PNG): Lambang atom Semesta bercahaya di latar kosmik.
- [x] **Feature Graphic Play Store** (1024x500 PNG): Banner panorama siswa menjelajah orbit tata surya dan rumus matematika interaktif.
- [ ] **Cover Ilustrasi 4 Pilar Sains**: Banner pembuka untuk Fisika, Matematika, Kimia, dan Biologi.
- [ ] **Badge Icons 25 Lencana**: Medali penghargaan untuk galeri profil.

---

## 🔊 4. Strategi Audio & Haptik Bebas Biaya (Fase 5)

Tanpa perlu generator audio berbayar, kita mengimplementasikan:
1. **Sintesis Audio & Efek Suara Native**:
   - Memanfaatkan Android `SoundPool` dengan file audio sound effect open-source berdurasi sangat singkat (< 1 detik).
   - Efek klik halus (*click tick*), nada sukses kuis (*success chime*), dan denting penghargaan lencana.
2. **Umpan Balik Taktil (Haptics)**:
   - Memanfaatkan native Android `VibrationEffect` (`VibrationEffect.createPredefined(EFFECT_TICK)` untuk geseran slider dan `createWaveform` untuk kuis berhasil).
   - 100% instan, tanpa latensi, dan tanpa biaya.

---

## 📱 5. Rencana Penerjemahan Desain ke Jetpack Compose (Fase 6)

| Komponen di TypeScript (`Desain-Semesta-Mobile`) | Ekivalen di Jetpack Compose (`Semesta Android`) |
| :--- | :--- |
| `SemestaAtomLogo` (SVG) | `Canvas` atau `VectorDrawable` XML |
| `ProfileAvatar` (SVG Character) | `Canvas` composable dengan caching vector |
| `ProgressRing` (SVG Circle Dash) | `CircularProgressIndicator` kustom dengan `strokeCap = StrokeCap.Round` |
| `BottomNav` | `NavigationBar` / `NavigationBarItem` Material 3 dengan warna tema `#1E6FB8` |
| Glassmorphic Cards | `Card` dengan `SurfaceVariant`, border `0.15f` putih, dan bayangan elevasi |
| Dynamic Tab Switcher | `ScrollableTabRow` atau `FilterChip` dengan animasi `AnimatedContent` |

---

## 🚀 6. Checklist Eksekusi Menuju Rilis Play Store

- [x] **Fase 1**: 261 Kurikulum Sains & Simulasi 3-Tier + Home Lab Notebook (✅ Selesai).
- [x] **Fase 2**: Gamifikasi & Badges Engine 25 Lencana (✅ Selesai).
- [x] **Fase 3**: Placement Test & Diagnostik Adaptif 20 Soal (✅ Selesai).
- [x] **Fase 4**: Generator PDF Raport & Sertifikat Kelulusan Resmi (✅ Selesai).
- [ ] **Fase 5**: Implementasi Audio SoundPool & Haptics Android Native (🔄 Sedang Berjalan).
- [ ] **Fase 6**: Translasi UI/UX dari repositori `Desain-Semesta-Mobile` ke Jetpack Compose.
- [ ] **Fase 7**: Pengujian Otomatis QA & Build Stability.
- [ ] **Fase 8**: Persiapan Rilis Play Store (App Icon 512x512, Feature Graphic 1024x500, Signed AAB).

---
*Dokumen resmi strategi desain dan implementasi Semesta Mobile Versi 1.0.*

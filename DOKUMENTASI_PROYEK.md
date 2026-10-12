# DOKUMENTASI PROYEK & PANDUAN PENGEMBANGAN SEMESTA
**Aplikasi Pembelajaran Sains & Matematika Terpadu: Dari Nol Sampai Mahir**

---

## 1. Ringkasan Proyek & Arsitektur Utama

**Semesta** adalah aplikasi edukasi sains interdisipliner modern berbasis Android (Kotlin & Jetpack Compose). Filosofi intinya adalah **menghubungkan konsep dasar hingga mahir** melintasi empat pilar ilmu pengetahuan (**Fisika, Matematika, Kimia, dan Biologi**) menggunakan simulasi visual interaktif, cerita bergambar, intuisi konsep, studi kasus industri nyata Indonesia, praktikum rumahan mandiri, serta kuis mastery tanpa rasa takut salah.

### Tech Stack:
- **Bahasa Pemrograman:** Kotlin 100%
- **UI Toolkit:** Jetpack Compose (Material Design 3 - M3)
- **Arsitektur:** Clean Architecture + MVVM (Model-View-ViewModel)
- **Asinkron & Reaktivitas:** Kotlin Coroutines & StateFlow / SharedFlow
- **Basis Data Lokal:** Room Database v2.6+ (dengan KSP)
- **Komponen Grafis & Simulasi:** Jetpack Compose Canvas (rendering vektor dinamis 60 FPS)
- **Rangkaian Pengujian:** JUnit 4 + Robolectric (pengujian JVM lokal untuk Room DAO dan ViewModel)

---

## 2. Fitur & Komponen yang Telah Selesai Dikerjakan

### A. Empat Domain Sains Lengkap (`Domain`)
1. **⚛️ Fisika (`FISIKA`):**
   - Gerak Lurus (GLB & GLBB)
   - Gerak Parabola (Kinematika 2D)
   - Hukum Gerak Newton & Gravitasi
2. **📐 Matematika (`MATEMATIKA`):**
   - Pecahan & Rasio
   - Trigonometri Dasar (Sinus, Cosinus, Tangen)
   - Persamaan Linear
3. **🧪 Kimia (`KIMIA`):**
   - Materi, Campuran & Perubahan Kimia
   - Asam, Basa & Skala pH
   - Struktur Atom & Tabel Periodik
   - Stoikiometri & Konsep Mol
   - Ikatan Kimia (Ion & Kovalen)
4. **🌿 Biologi (`BIOLOGI`):**
   - Ciri Makhluk Hidup & Rantai Makanan
   - Struktur Sel Tumbuhan & Hewan
   - Fotosintesis & Kloroplas
   - Genetika & Hukum Pewarisan Sifat Mendel
   - Bioteknologi Konvensional & Modern

### B. 7 Siklus Pembelajaran Terstruktur (Setiap Modul)
Setiap topik pelajaran dilengkapi alur pedagogi 7 tahap:
1. **Cerita Bergambar (4 Panel Komik):** Petualangan kontekstual Kirana, Dimas, dan Kakek di kehidupan sehari-hari (lapangan basket, dapur, instalasi hidroponik, danau).
2. **Intuisi Konsep:** Penjelasan visual tanpa jargon berat yang membangun pemahaman mendasar sebelum rumus formal.
3. **Simulasi Interaktif Canvas Real-time:** Laboratorium virtual langsung di dalam aplikasi.
4. **Rumus & Formulasi Presisi:** Persamaan matematika/sains lengkap dengan makna fisis, satuan SI, dan catatan aplikasinya.
5. **Studi Kasus Industri Nyata (Indonesia):** Menghubungkan materi dengan proyek nyata (misal: Kereta Cepat Whoosh Jakarta-Bandung, IPAL Sungai Citarum, Pertanian Vertikal Cerdas IKN, Sistem Irigasi Subak Bali).
6. **Praktikum Rumahan Mandiri (Aman):** Eksperimen rumah tangga yang dapat dilakukan siswa tanpa bahan kimia berbahaya (misal: Uji pH indikator kunyit, percobaan gelembung Ingenhousz pada tanaman air).
7. **Kuis Mastery & Refleksi:** Evaluasi formatif dengan petunjuk bertahap (*hints*), penjelasan jawaban komprehensif, dan pendeteksi miskonsepsi umum siswa.

### C. 5 Lab Simulasi Interaktif Canvas (Real-time 60 FPS)
1. **`ProjectileSimulation` (Gerak Parabola):**
   - Slider sudut elevasi ($\theta$) dan kecepatan awal ($v_0$).
   - Lintasan parabola trajektori real-time dengan target ring basket pada jarak $40{,}8\text{ m}$.
2. **`FractionSimulation` (Pecahan & Rasio):**
   - Visualisasi potongan pizza interaktif dengan slider pembilang ($a$) dan penyebut ($b$).
   - Konversi langsung pecahan biasa, desimal, dan persentase.
3. **`TrigonometrySimulation` (Trigonometri & Segitiga Siku-siku):**
   - Penyesuaian sudut $\theta$ dengan visualisasi sisi depan (*opposite*), samping (*adjacent*), dan miring (*hypotenuse*).
   - Nilai $\sin\theta$, $\cos\theta$, dan $\tan\theta$ diperbarui secara dinamis.
4. **`AcidBaseSimulation` (Titrimetri Larutan Asam-Basa & pH):**
   - Bejana kimia digital dengan gradasi warna larutan dari Merah Tua (pH 0) $\rightarrow$ Hijau Zamrud (Netral pH 7) $\rightarrow$ Ungu Pekat (pH 14).
   - Tombol pipet tetes asam $\text{HCl}$, basa $\text{NaOH}$, serta tombol netralisasi.
5. **`PhotosynthesisSimulation` (Kloroplas & Fotosintesis Daun):**
   - Ruang reaksi daun dan kloroplas dengan slider intensitas cahaya matahari, kadar $CO_2$, dan ketersediaan air $H_2O$.
   - Animasi partikel gelembung gas oksigen ($O_2$) dan pengukur laju sintesis glukosa berdasarkan Hukum Faktor Pembatas Blackman.

### D. Komponen Hierarki `LessonTreeView` & Peta Keterampilan
- **`LessonTreeView.kt`:**
  - Pengelompokan materi berjenjang dari **L0 (Penjelajah)**, **L1 (Dasar)**, **L2 (Menengah)**, hingga **L3 (Lanjut)**.
  - Fitur **Expand/Collapse** per level secara individual atau sekaligus ("Buka Semua" / "Tutup Semua").
  - Filter chip multi-subjek (**Semua**, **Fisika ⚛️**, **Matematika 📐**, **Kimia 🧪**, **Biologi 🌿**).
  - **Dynamic Progress Bar:** `LinearProgressIndicator` di setiap header Level yang membaca langsung status penyelesaian (`completedLessons`) dari basis data Room secara reaktif.
  - Kartu modul anak dilengkapi lencana `"✓ Selesai"` dan persentase penguasaan.
- **`SkillMapScreen.kt`:**
  - Tab mode ganda: Tampilan **Pohon Berjenjang** (`LessonTreeView`) dan **Jalur Subjek** (*Graph Path View*).
  - Modal Bottom Sheet untuk prasyarat materi sebelum membuka pelajaran.

### E. Integrasi Room Database Lokal & Uji Otomatis
- **Entities:** `UserProfileEntity`, `ConceptProgressEntity`, `LessonProgressEntity`, `UserBadgeEntity`.
- **DAOs:** `UserProfileDao`, `ConceptProgressDao`, `LessonProgressDao`, `UserBadgeDao`.
- **Repository:** `SemestaRepository` menyediakan aliran `Flow` reaktif ke ViewModel.
- **Unit & Robolectric Tests:** Berhasil lulus 100% (`BUILD SUCCESSFUL`) pada:
  - `LessonProgressDaoTest` (CRUD progres pelajaran dan skor kuis)
  - `LessonTreeViewTest` (Kalkulasi hierarki, rasio penyelesaian per level, dan 4 domain)

---

## 3. Hal yang Perlu Diperbarui / Direfaktor oleh AntiGravity

Saat tim atau agen AntiGravity melanjutkan pengembangan, fokuskan pada pembaruan arsitektural berikut:

1. **Modularisasi Data Kurikulum (`CurriculumData.kt`):**
   - *Kondisi Saat Ini:* `CurriculumData.kt` telah menampung ribuan baris data pelajaran, soal kuis, dan teks narasi.
   - *Yang Harus Diperbarui:* Pecah objek statis ini menjadi file terpisah per domain (misal: `PhysicsCurriculum.kt`, `MathCurriculum.kt`, `ChemistryCurriculum.kt`, `BiologyCurriculum.kt`) atau gunakan format berkas aset lokal **JSON/AssetPack** dengan `kotlinx.serialization` agar kode lebih bersih dan mudah dikelola tim konten.

2. **Ekspansi Pelajaran Detail untuk Topik L3–L5:**
   - *Kondisi Saat Ini:* Topik-topik utama (Parabola, Pecahan, Trigonometri, Asam Basa, Fotosintesis) telah memiliki siklus 7 langkah penuh. Modul lain seperti `fis-newton`, `kim-stoikiometri`, `bio-genetika-mendel`, dan `mat-persamaan-linear` saat ini masih menggunakan fallback pelajaran terdekat.
   - *Yang Harus Diperbarui:* Tulis data pelajaran spesifik (`LessonData`) untuk masing-masing topik tersebut beserta simulasi pendukungnya (misalnya: simulasi hukum persilangan Mendel / Punnett Square untuk Biologi, simulasi neraca massa molekul untuk Kimia).

3. **Manajemen Audio & Haptik:**
   - Tambahkan sound effects lembut (click feedback, success sound saat target tercapai di simulasi atau saat kuis dijawab benar) menggunakan `SoundPool` atau Jetpack Compose `LocalHapticFeedback`.

4. **Dukungan Dark Mode & Dynamic Theme:**
   - Pastikan seluruh warna kanvas simulasi (terutama warna teks rumus di dalam bejana/simulasi) membaca kontras tema secara otomatis (`MaterialTheme.colorScheme.onSurface`).

---

## 4. Hal yang Belum Selesai (Pending Tasks)

Berikut daftar tugas fungsional yang belum terselesaikan sebelum tahap rilis:

| Prioritas | Fitur / Komponen | Keterangan & Rencana Implementasi |
| :--- | :--- | :--- |
| **Tinggi** | **Simulasi Tambahan untuk L3** | 1) *Punnett Square Simulator* (Genetika Mendel), 2) *Newton Motion Simulator* (Gaya Gesek & Gravitasi), 3) *Molecule Balancer* (Penyetaraan Reaksi Kimia). |
| **Tinggi** | **Ekspor Raport / Sertifikat Belajar** | Fitur menghasilkan berkas PDF sertifikat kelulusan modul berbasis Android `PdfDocument` atau canvas snapshot untuk dibagikan ke orang tua/guru. |
| **Sedang** | **Backup & Sinkronisasi Cloud (Opsional)** | Integrasi Firebase Authentication / Cloud Firestore untuk menyimpan progres jika pengguna mengganti perangkat HP/Tablet. |
| **Sedang** | **Pencarian Materi Terpadu (Global Search)** | Search bar di Katalog untuk mencari topik berdasarkan kata kunci rumus, konsep, atau nama industri terkait. |
| **Rendah** | **Audio Narasi / Text-to-Speech (TTS)** | Pembacaan otomatis teks komik untuk anak usia dini (Level L0). |

---

## 5. Checklist Lengkap Menuju Deploy Google Play Store

Ikuti langkah-langkah berikut secara berurutan saat mempersiapkan aplikasi untuk diterbitkan di Google Play Console:

### Tahap 1: Konfigurasi Identitas & Build Gradle
- [ ] **Application ID Unik:** Pastikan `applicationId` pada `app/build.gradle.kts` sudah unik (misal: `com.semesta.edusains.id`). *Catatan: `namespace` tetap `com.example`*.
- [ ] **Versi Aplikasi:**
  - `versionCode = 1`
  - `versionName = "1.0.0"`
- [ ] **Target SDK:** Pastikan `compileSdk = 35` dan `targetSdk = 35` (memenuhi syarat wajib Google Play untuk Android 15/14).
- [ ] **Min SDK:** Pertahankan `minSdk = 26` (Android 8.0 Oreo ke atas, mencakup >95% perangkat aktif).
- [ ] **Nama Aplikasi di `strings.xml` & `metadata.json`:** Pastikan string `app_name` bertuliskan `"Semesta"` (panjang judul $\le 30$ karakter sesuai kebijakan Play Store metadata).

### Tahap 2: Keystore & Signing Config Produksi
- [ ] **Generate Release Keystore (JKS / PKCS12):**
  ```bash
  keytool -genkey -v -keystore semesta-release.jks -keyalg RSA -keysize 2048 -validity 10000 -alias semesta-key
  ```
- [ ] **Konfigurasi Signing di `build.gradle.kts`:**
  Gunakan environment variables atau secrets panel untuk menyimpan password keystore, jangan hardcode password di repositori publik.
- [ ] **Build Android App Bundle (`.aab`):**
  Jalankan perintah:
  ```bash
  gradle :app:bundleRelease
  ```
  Berkas hasil rilis berada di: `app/build/outputs/bundle/release/app-release.aab`.

### Tahap 3: Kepatuhan Google Play Policy (Families & Education Policy)
Karena Semesta adalah aplikasi edukasi yang dapat digunakan oleh anak-anak:
- [ ] **Target Audience & Families Policy:**
  - Pada Play Console, tentukan rentang usia target (misal: *Age 9-12, 13-17, 18+*).
  - Jika menargetkan anak di bawah 13 tahun, pastikan aplikasi patuh terhadap aturan **COPPA** (tidak mengumpulkan data identitas pribadi atau periklanan bertarget).
- [ ] **Permissions Minim:** Aplikasi Semesta tidak memerlukan dangerous permissions (tidak butuh kamera, lokasi GPS, maupun SMS/kontak). Pastikan `AndroidManifest.xml` bersih dari izin yang tidak terpakai.
- [ ] **Kebijakan Privasi (Privacy Policy URL):** Siapkan halaman web statis publik (misal via GitHub Pages) yang menjelaskan bahwa Semesta menyimpan data progres belajar secara lokal pada perangkat pengguna.

### Tahap 4: Aset Visual Play Store (Graphic Assets)
Siapkan aset visual berkualitas tinggi:
- [ ] **App Icon:** Ukuran $512 \times 512\text{ px}$ (Format PNG 32-bit).
- [ ] **Feature Graphic (Banner Utama):** Ukuran $1024 \times 500\text{ px}$ (Format PNG/JPEG).
- [ ] **Tangkapan Layar (Screenshots):**
  - Minimum 4 screenshot untuk HP (Rasio 16:9 atau 18:9, resolusi rekomendasi $1080 \times 2400\text{ px}$).
  - Minimum 1 screenshot untuk Tablet 7 inci.
  - Minimum 1 screenshot untuk Tablet 10 inci.
  - *Konten screenshot disarankan menampilkan:* Lab Simulasi Interaktif, Cerita Bergambar Komik, Pohon Keterampilan (`LessonTreeView`), dan Studi Kasus Industri Indonesia.

### Tahap 5: Peluncuran di Google Play Console
1. **Buat Aplikasi Baru** di [Google Play Console](https://play.google.com/console).
2. **Isi Formulir Kuesioner Rating Konten (IARC):** Kategori Edukasi (biasanya mendapatkan rating `Semua Umur / PEGI 3 / Everyone`).
3. **Data Safety Form:** Deklarasikan bahwa aplikasi tidak mengumpulkan data pribadi ke server eksternal (data progres tersimpan offline di Room Database).
4. **Closed Testing (Internal / Closed Track):**
   - Unggah berkas `app-release.aab`.
   - Lakukan pengujian closed test bersama minimal 20 tester selama 14 hari (persyaratan wajib akun personal Google Play).
5. **Promote to Production:** Setelah masa pengujian tertutup selesai dan stabil, ajukan rilis produksi ke tim peninjau Google Play.

---

*Dokumen ini disusun untuk panduan alih kelola proyek Semesta kepada pengembang lanjutan dan AntiGravity.*

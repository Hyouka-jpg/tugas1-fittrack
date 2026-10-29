# FitTrack - Sistem Keanggotaan Gym

## Judul & Identitas
- **Nama Tugas**: Remedial UTS / Tugas 1 - Sistem Keanggotaan Gym
- **Nama**: Ahmad Damanhuri
- **NPM**: 250810701100046
- **Kelas**: Praktikum PBO A

## Deskripsi Singkat
Sistem pendataan member berbasis Java console untuk gym FitTrack. Aplikasi ini menggantikan pencatatan manual di buku tulis guna meminimalisir kesalahan input data (seperti nomor telepon salah format) dan memastikan seluruh data member yang masuk selalu valid sebelum disimpan.

## Fitur Utama
- **Pendaftaran Member Fleksibel**: Mendukung pendaftaran member dengan paket khusus maupun otomatis mendapatkan paket default (`Basic`).
- **Validasi Otomatis Data Member**: Menolak input nama kosong, nomor telepon tidak standar, dan tanggal daftar yang tidak valid.
- **Pencegahan Data Rusak**: Jika terjadi kesalahan input pada *setter*, sistem menolak nilai baru dan tetap mempertahankan data lama yang valid.
- **Auto-Formatting Teks**: Nama member otomatis dikapitalisasi setiap awal kata, dan paket `VIP` selalu tersimpan dalam format huruf kapital penuh.

## Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan | Alasan Penerapan |
| :--- | :--- | :--- |
| **Encapsulation** | Class `Member` (`private` attributes, `getter`, `setter`) | Menyembunyikan akses atribut secara langsung dari luar class serta memusatkan kontrol logika validasi di dalam *setter*. |
| **Constructor Overloading** | Class `Member` (`Member(...)` 4 param & 3 param) | Menyediakan opsi pendaftaran member dengan paket khusus atau tanpa paket (otomatis `Basic`). |
| **Method Overriding** | Method `toString()` di Class `Member` | Mengubah perilaku bawaan `Object.toString()` agar menghasilkan format cetak data member yang rapi dan berlabel. |
| **DRY (Don't Repeat Yourself)** | Constructor memanggil *setter* (`setNama()`, dll.) | Memusatkan seluruh pemeriksaan validasi hanya pada satu tempat (*setter*) tanpa mengulang kodenya di constructor. |

## Struktur Proyek

```text
tugas1-fittrack/
├── 📁 src
│   ├── ☕ Member.java
│   └── ☕ TesFitTrack.java
├── ⚙️ .gitignore
└── 📝 README.md
```

## Nilai Default Validasi

| Atribut | Kriteria Validasi | Nilai Default |
| :--- | :--- | :--- |
| **Nama Member** | Tidak boleh `null`, kosong, atau hanya berisi spasi | `"Unknown Member"` |
| **No Telepon** | Wajib diawali angka `0` dan minimal 10 digit | `"0000000000"` |
| **Tanggal Daftar** | Wajib berformat ketat `dd-MM-yyyy` | `"01-01-2026"` |
| **Jenis Paket** | Hanya menerima paket: `Basic`, `Premium`, atau `VIP` | `"Basic"` |

## Cara Menjalankan Program

### 1. Melalui Command Line (Terminal)
1. Clone Repository ini:
```bash
git clone [https://github.com/Hyouka-jpg/tugas1-fittrack.git](https://github.com/Hyouka-jpg/tugas1-fittrack.git)
Lalu:
cd tugas1-fittrack
```

Kompilasi program Java:

```Bash
javac src/*.java
```

Jalankan Program:
```Bash
java -cp src TesFitTrack
```

2. Melalui IntelliJ IDEA
Buka aplikasi IntelliJ IDEA.
Pilih Open lalu arahkan ke folder proyek tugas1-fittrack.
Pastikan project SDK sudah diatur ke Java 21.
Buka file src/TesFitTrack.java.
Klik ikon Run (segitiga hijau) di sebelah method main atau tekan Shift + F10.

## Contoh Output (keluaran)

```
======================================
 SISTEM KEANGGOTAAN GYM FITTRACK
======================================

=== UJI CONSTRUCTOR TIDAK VALID ===
Nomor telepon harus berupa angka, dimulai dengan 0, dan minimal 10 digit.
Jenis paket harus Basic, Premium, atau VIP.

=== UJI SETTER TIDAK VALID ===
Nomor sebelum diubah: 081234567890
Nomor telepon harus berupa angka, dimulai dengan 0, dan minimal 10 digit.
Nomor setelah ditolak: 081234567890
Nama tidak boleh kosong atau hanya berisi spasi.
Tanggal harus menggunakan format dd-MM-yyyy.
Jenis paket harus Basic, Premium, atau VIP.

=== DAFTAR MEMBER VALID ===
1. Nama: Ahmad, No. Telepon: 081234567890, Tanggal Daftar: 15-10-2026, Jenis Paket: Basic
2. Nama: Budi, No. Telepon: 082345678901, Tanggal Daftar: 14-10-2026, Jenis Paket: Premium
3. Nama: Citra, No. Telepon: 083456789012, Tanggal Daftar: 13-10-2026, Jenis Paket: VIP
4. Nama: Dina, No. Telepon: 084567890123, Tanggal Daftar: 12-10-2026, Jenis Paket: Basic
5. Nama: Eka, No. Telepon: 0000000000, Tanggal Daftar: 10-10-2026, Jenis Paket: Basic

=== PENGUJIAN TAHAP 1 SELESAI ===
```
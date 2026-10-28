# FitTrack - Sistem Keanggotaan Gym

Proyek ini adalah sistem pengelolaan keanggotaan gym sederhana berbasis Java yang dilengkapi dengan validasi data internal dan pengujian komprehensif.

## Fitur Utama

- **Atribut Member**: Nama, Nomor Telepon, Tanggal Daftar, dan Jenis Paket.
- **Validasi Data**:
  - **Nama**: Tidak boleh kosong atau hanya berisi spasi.
  - **No. Telepon**: Harus berupa angka, diawali dengan `0`, dan minimal 10 digit.
  - **Tanggal Daftar**: Menggunakan format `dd-MM-yyyy`.
  - **Jenis Paket**: Hanya menerima paket `Basic`, `Premium`, atau `VIP`.
- **Constructor Overloading**:
  - 4 Parameter: `(nama, noTelepon, tanggalDaftar, jenisPaket)`
  - 3 Parameter: `(nama, noTelepon, tanggalDaftar)` dengan default paket `Basic`.
- **Format Output**: Override method `toString()` untuk menampilkan informasi berlabel.

## Cara Menjalankan

1. Kompilasi seluruh file Java:
   ```bash
   javac src/*.java
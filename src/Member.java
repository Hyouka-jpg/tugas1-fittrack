/**
 * Merepresentasikan data member gym FitTrack.
 * Class ini menyimpan dan memvalidasi data keanggotaan.
 */
public class Member {

    private String nama = "";
    private String noTelepon = "0000000000";
    private String tanggalDaftar = "-";
    private String jenisPaket = "Basic";

    private static final int MIN_PANJANG_TELEPON = 10;

    /**
     * Membuat member dengan seluruh data.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket jenis paket keanggotaan
     */
    public Member(String nama, String noTelepon,
                  String tanggalDaftar, String jenisPaket) {
        // DIPANGGIL LEWAT SETTER SESUAI ATURAN MODUL
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Mengambil nama member.
     *
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengubah nama jika tidak kosong.
     *
     * @param nama nama baru member
     */
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println(
                "Nama tidak boleh kosong atau hanya berisi spasi."
            );
        }
    }

    /**
     * Mengambil nomor telepon member.
     *
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengubah nomor telepon jika memenuhi ketentuan.
     *
     * @param noTelepon nomor telepon baru member
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null
                && noTelepon.matches("[0-9]+")
                && noTelepon.startsWith("0")
                && noTelepon.length() >= MIN_PANJANG_TELEPON) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println(
                "Nomor telepon harus berupa angka, dimulai dengan 0, "
                + "dan minimal 10 digit."
            );
        }
    }

    /**
     * Mengambil tanggal pendaftaran member.
     *
     * @return tanggal pendaftaran member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengubah tanggal pendaftaran.
     *
     * @param tanggalDaftar tanggal pendaftaran baru
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null
                && tanggalDaftar.matches("\\d{2}-\\d{2}-\\d{4}")) {
            this.tanggalDaftar = tanggalDaftar;
        } else {
            System.out.println(
                "Tanggal harus menggunakan format dd-MM-yyyy."
            );
        }
    }

    /**
     * Mengambil jenis paket member.
     *
     * @return jenis paket member
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah jenis paket member.
     *
     * @param jenisPaket jenis paket baru
     */
    public void setJenisPaket(String jenisPaket) {
        this.jenisPaket = jenisPaket;
    }

}

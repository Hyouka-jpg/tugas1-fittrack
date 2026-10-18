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
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.tanggalDaftar = tanggalDaftar;
        this.jenisPaket = jenisPaket;
    }
}

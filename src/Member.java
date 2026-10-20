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

}

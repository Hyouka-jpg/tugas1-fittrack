/**
 * Menguji fitur dasar objek Member pada sistem keanggotaan gym FitTrack.
 */
public class TesFitTrack {

    /**
     * Menjalankan pengujian objek Member.
     *
     * @param args argumen dari command line
     */
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" SISTEM KEANGGOTAAN GYM FITTRACK");
        System.out.println("======================================");

        // Membuat member menggunakan constructor 4 parameter
        Member member1 = new Member(
            "Ahmad", "081234567890", "15-10-2026", "Basic"
        );

        Member member2 = new Member(
            "Budi", "082345678901", "14-10-2026", "Premium"
        );

        Member member3 = new Member(
            "Citra", "083456789012", "13-10-2026", "VIP"
        );

        // Menggunakan constructor 3 parameter (paket otomatis Basic)
        Member member4 = new Member(
            "Dina", "084567890123", "12-10-2026"
        );

        System.out.println("\n=== DAFTAR MEMBER VALID ===");

        Member[] daftarMember = {
            member1, member2, member3, member4
        };

        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println(
                (i + 1) + ". " + daftarMember[i]
            );
        }

        System.out.println("\n=== PENGUJIAN TAHAP 1 SELESAI ===");
    }
}

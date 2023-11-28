public class PasanganMarmutRekursif {

    // Fungsi rekursif untuk menghitung jumlah pasangan marmut pada bulan ke-n
    static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1; // Basis kasus: pada bulan pertama dan kedua, hanya ada 1 pasangan
        } else {
            // Panggil rekursif untuk bulan sebelumnya dan bulan sebelumnya dari bulan sebelumnya
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        int bulanKe12 = 12;

        // Panggil fungsi rekursif untuk menghitung jumlah pasangan marmut pada bulan ke-12
        int jumlahPasangan = hitungPasanganMarmut(bulanKe12);

        // Tampilkan hasil
        System.out.println("Pada akhir bulan ke-" + bulanKe12 + ", jumlah pasangan marmut adalah: " + jumlahPasangan);
    }
}

import java.util.Scanner;

public class PenjumlahanRekursif {
    // Fungsi rekursif untuk menghitung penjumlahan bilangan dari 1 hingga n
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1; // Basis kasus: 1 + 0 = 1
        } else {
            return n + penjumlahanRekursif(n - 1); // Panggil diri sendiri dengan n yang berkurang
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        // Panggil fungsi rekursif untuk menghitung penjumlahan
        int hasil = penjumlahanRekursif(n);

        // Tampilkan hasil penjumlahan
        System.out.println("Penjumlahan dari 1 sampai " + n + " adalah: " + hasil);

        sc.close();
    }
}


import java.util.Scanner;

public class CekPrimaRekursif {

    // Fungsi rekursif untuk mengecek apakah suatu bilangan prima atau bukan
    static boolean cekPrimaRekursif(int n, int i) {
        if (n <= 1) {
            return false; // Angka kurang dari atau sama dengan 1 bukan prima
        } else if (i == 1) {
            return true; // Basis kasus: angka habis dibagi hanya oleh 1
        } else {
            if (n % i == 0) {
                return false; // Jika n habis dibagi oleh i, bukan prima
            } else {
                return cekPrimaRekursif(n, i - 1); // Panggil rekursif dengan i yang berkurang
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        // Panggil fungsi rekursif untuk mengecek apakah n prima atau bukan
        boolean hasil = cekPrimaRekursif(n, n / 2);

        // Tampilkan hasil pengecekan
        if (hasil) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }

        sc.close();
    }
}

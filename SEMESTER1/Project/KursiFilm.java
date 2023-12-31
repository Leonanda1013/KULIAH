package Project;
import java.util.Scanner;

public class KursiFilm {
    public static void main(String[] args) {
        int[][] theater = new int[5][10]; // Teater dengan 5 baris dan 10 kursi

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Pilih Film");
            System.out.println("2. Pilih Kursi");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Daftar Film:");
                System.out.println("1. Film Luthfi dan Nabhan Bersatu");
                System.out.println("2. Film Luthfi vs Nabhan");
                System.out.print("Pilih film (1 atau 2): ");
                int filmChoice = scanner.nextInt();

                if (filmChoice == 1) {
                    System.out.println("Anda telah memilih Film Luthfi dan Naban Bersatu.");
                } else if (filmChoice == 2) {
                    System.out.println("Anda telah memilih Luthfi vs Nabhan.");
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } else if (choice == 2) {
                System.out.println("Teater:");

                for (int i = 0; i < theater.length; i++) {
                    for (int j = 0; j < theater[i].length; j++) {
                        if (theater[i][j] == 0) {
                            System.out.print("O "); // Kursi kosong
                        } else {
                            System.out.print("X "); // Kursi terisi
                        }
                    }
                    System.out.println();
                }

                System.out.print("Pilih baris (1-5): ");
                int row = scanner.nextInt() - 1;

                System.out.print("Pilih kursi (1-10): ");
                int seat = scanner.nextInt() - 1;

                if (row >= 0 && row < theater.length && seat >= 0 && seat < theater[row].length) {
                    if (theater[row][seat] == 0) {
                        theater[row][seat] = 1;
                        System.out.println("Kursi berhasil dipilih!");
                    } else {
                        System.out.println("Kursi sudah terisi. Pilih kursi lain.");
                    }
                } else {
                    System.out.println("Baris atau kursi tidak valid.");
                }
            } else if (choice == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}

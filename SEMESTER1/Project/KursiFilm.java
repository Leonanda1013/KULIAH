package Project;
 import java.util.Scanner;
public class KursiFilm {
   
    public static void main(String[] args) {
        int totalSeats = 50; // Jumlah total kursi
        int[] theater = new int[totalSeats]; // Array satu dimensi untuk melacak kursi

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
                System.out.println("1. Film A");
                System.out.println("2. Film B");
                System.out.print("Pilih film (1 atau 2): ");
                int filmChoice = scanner.nextInt();

                if (filmChoice == 1) {
                    System.out.println("Anda telah memilih Film A.");
                } else if (filmChoice == 2) {
                    System.out.println("Anda telah memilih Film B.");
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } else if (choice == 2) {
                System.out.println("Kursi Tersedia:");

                for (int i = 0; i < theater.length; i++) {
                    if (theater[i] == 0) {
                        System.out.print((i + 1) + " "); // Menampilkan kursi yang tersedia
                    }
                }

                System.out.println();
                System.out.print("Pilih kursi (1-" + totalSeats + "): ");
                int seat = scanner.nextInt() - 1;

                if (seat >= 0 && seat < totalSeats && theater[seat] == 0) {
                    theater[seat] = 1;
                    System.out.println("Kursi " + (seat + 1) + " berhasil dipilih!");
                } else {
                    System.out.println("Kursi tidak tersedia atau tidak valid. Pilih kursi lain.");
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
    


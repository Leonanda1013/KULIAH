package Project;

import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        Scanner sc292 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        int menu;
        String terisi = "Tidak Tersedia";
        

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc29.nextInt();
            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc292.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc29.nextInt();
                    if (baris < 1 || baris > 4) {
                        System.out.println("Baris invalid. Pilih nomor baris antara 1 dan 4.");
                        continue; // Minta input baris kembali
                    }
                    System.out.print("Masukkan kolom: ");
                    kolom = sc29.nextInt();
                    if (kolom < 1 || kolom > 2) {
                        System.out.println("Kolom invalid. Pilih nomor kolom antara 1 dan 2.");
                        continue; // Minta input kolom kembali
                    }
                    sc29.nextLine();
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Maaf, kursi sudah ditempati oleh penonton lain.");
                        continue; // Minta input baris dan kolom kembali
                    }

                    penonton[baris - 1][kolom - 1] = terisi;
                    System.out.println("Penonton berhasil ditambahkan ke kursi " + baris + "-" + kolom);

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc29.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Penonton pada baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.print(penonton[i][j]);
                        } else {
                            System.out.print("Tersedia");
                        }
                        if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}

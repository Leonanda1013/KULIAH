package Praktikum_11;

import java.util.Scanner;

public class Individu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("N harus minimal 3.");
        } else {
            // Mencetak baris pertama
            for (int j = 1; j <= N; j++) {
                System.out.print(N);
            }
            System.out.println();

            // Mencetak baris tengah dengan spasi di tengah
            for (int i = 2; i <= N - 1; i++) {
                System.out.print(N); // Cetak angka di sisi kiri
                for (int j = 2; j <= N - 1; j++) {
                    System.out.print(" "); // Cetak spasi di tengah
                }
                System.out.println(N); // Cetak angka di sisi kanan
            }

            // Mencetak baris terakhir
            for (int j = 1; j <= N; j++) {
                System.out.print(N);
            }
            System.out.println();
        }

        scanner.close();
    }
}

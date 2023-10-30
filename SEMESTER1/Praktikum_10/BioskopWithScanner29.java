package Praktikum_10;

import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        //Ini mendefinisikan beberapa variabel, yaitu baris, kolom, nama, dan next yang akan digunakan dalam program.
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];
        //Ini mendefinisikan array dua dimensi penonton dengan 4 baris dan 2 kolom untuk menyimpan data nama penonton.

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc29.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc29.nextInt();
            System.out.print("masukkan kolom: ");
            kolom = sc29.nextInt();
            sc29.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Inpuut penonton lainnya? (y/n): ");
            next= sc29.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}

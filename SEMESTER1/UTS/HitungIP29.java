package SEMESTER1.UTS;

import java.util.Scanner;

public class HitungIP29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        String lanjut;
        Double ip = 0.0;
        Double jmlNilaiSks = 0.0;
        Double jmlMatkul = 0.0;
        Double jmlRemed = 0.0;
        Double jmlSKS = 0.0;

        while (true) {
            System.out.println("Masukkan nama: ");
            String nama = sc29.nextLine();
            String nama1 = nama; // Simpan nama untuk cetak hasil

            while (true) {
                System.out.println("Nama mata kuliah: ");
                String matkul = sc29.nextLine();
                System.out.println("Nilai (A, B+, B, C+, C, D, E): ");
                String nilai = sc29.next();
                System.out.println("Masukkan jumlah SKS: ");
                Double sks = sc29.nextDouble();

                // Hitung konversi nilai ke angka
                Double konversi = 0.0;
                if (nilai.equalsIgnoreCase("A")) {
                    konversi = 4.0;
                } else if (nilai.equalsIgnoreCase("B+")) {
                    konversi = 3.5;
                } else if (nilai.equalsIgnoreCase("B")) {
                    konversi = 3.0;
                } else if (nilai.equalsIgnoreCase("C+")) {
                    konversi = 2.5;
                } else if (nilai.equalsIgnoreCase("C")) {
                    konversi = 2.0;
                } else if (nilai.equalsIgnoreCase("D")) {
                    konversi = 1.0;
                    jmlRemed += 1;
                } else if (nilai.equalsIgnoreCase("E")) {
                    konversi = 0.0;
                    jmlRemed += 1;
                }

                jmlNilaiSks += konversi * sks;
                jmlMatkul += 1;
                jmlSKS += sks;

                System.out.println("Apakah lanjut input nilai(Y/N): ");
                lanjut = sc29.next();
                sc29.nextLine();

                if (lanjut.equalsIgnoreCase("n")) {
                    break; // Keluar dari loop input mata kuliah
                }
            }

            ip = jmlNilaiSks / jmlSKS;

            System.out.println("------- HASIL PENGHITUNGAN IP -------");
            System.out.println("Nama: " + nama1);
            System.out.println("Index Prestasi (IP): " + ip);
            System.out.println("Jumlah mata kuliah: " + jmlMatkul);
            System.out.println("Jumlah SKS: " + jmlSKS);
            System.out.println("Jumlah MK yang harus perbaikan/remidi: " + jmlRemed);

            System.out.println("Apakah ingin menghitung IP lagi (Y/N): ");
            lanjut = sc29.next();
            sc29.nextLine(); 

            if (lanjut.equalsIgnoreCase("n")) {
                break; // Keluar dari loop perhitungan IP
            }
        }
        sc29.close();
    }
}

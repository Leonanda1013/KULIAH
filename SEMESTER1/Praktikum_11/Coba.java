package Praktikum_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mendefinisikan kelas Atlet
        class Atlet {
            String cabang;
            String nama;
            String politeknik;

            Atlet(String cabang, String nama, String politeknik) {
                this.cabang = cabang;
                this.nama = nama;
                this.politeknik = politeknik;
            }
        }

        // Membuat ArrayList untuk menyimpan data atlet
        ArrayList<Atlet> dataAtlet = new ArrayList<>();

        // Menambahkan data atlet ke dalam ArrayList
        tambahDataAtlet(dataAtlet, "Badminton", sc);
        tambahDataAtlet(dataAtlet, "Tenis Meja", sc);
        tambahDataAtlet(dataAtlet, "Basket", sc);
        tambahDataAtlet(dataAtlet, "Bola Voly", sc);

        // Mengurutkan data atlet berdasarkan nama
        Collections.sort(dataAtlet, Comparator.comparing(atlet -> atlet.nama));

        // Menampilkan informasi atlet yang sudah diurutkan
        System.out.println("Data atlet setelah diurutkan berdasarkan nama:");
        for (Atlet atlet : dataAtlet) {
            System.out.println("Cabang: " + atlet.cabang + ", Nama: " + atlet.nama + ", Politeknik: " + atlet.politeknik);
        }
    }

    // Fungsi untuk tambah data atlet
    private static void tambahDataAtlet(ArrayList<Atlet> dataAtlet, String cabang, Scanner sc) {
        System.out.println("Masukkan data atlet untuk cabang " + cabang);
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nama atlet ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("Politeknik: ");
            String politeknik = sc.next();
            dataAtlet.add(new Atlet(cabang, nama, politeknik));
        }
    }
}

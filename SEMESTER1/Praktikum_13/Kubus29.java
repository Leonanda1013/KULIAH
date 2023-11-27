package Praktikum_13;
import java.util.Scanner;

public class Kubus29 {
    static final int JUMLAH_MAHASISWA = 5;
    static final int JUMLAH_MINGGU = 7;

    public static void main(String[] args) {
        int[][] nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];
        String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

        // Mengisi array 2 dimensi dengan nilai tugas lima mahasiswa
        inputNilaiMahasiswa(nilaiMahasiswa, namaMahasiswa);

        // Menampilkan seluruh nilai mahasiswa
        tampilkanNilaiMahasiswa(nilaiMahasiswa, namaMahasiswa);

        // Mencari hari dengan nilai tertinggi
        int hariTertinggi = cariHariTertinggi(nilaiMahasiswa);
        System.out.println("Hari dengan nilai tertinggi adalah Minggu ke-" + (hariTertinggi + 1));

        // Menampilkan mahasiswa dengan nilai tertinggi dan keterangan nilai
        tampilkanMahasiswaNilaiTertinggi(nilaiMahasiswa, namaMahasiswa, hariTertinggi);
    }

    // Fungsi untuk meninputkan data nilai mahasiswa
    static void inputNilaiMahasiswa(int[][] nilaiMahasiswa, String[] namaMahasiswa) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.println("Input nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }

        scanner.close();
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    static void tampilkanNilaiMahasiswa(int[][] nilaiMahasiswa, String[] namaMahasiswa) {
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari hari dengan nilai tertinggi
    static int cariHariTertinggi(int[][] nilaiMahasiswa) {
        int hariTertinggi = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int j = 1; j < JUMLAH_MINGGU; j++) {
            int totalNilaiHari = 0;
            for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
                totalNilaiHari += nilaiMahasiswa[i][j];
            }

            if (totalNilaiHari > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHari;
                hariTertinggi = j;
            }
        }

        return hariTertinggi;
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi dan keterangan nilai
    static void tampilkanMahasiswaNilaiTertinggi(int[][] nilaiMahasiswa, String[] namaMahasiswa, int hariTertinggi) {
        System.out.println("\nMahasiswa dengan Nilai Tertinggi:");

        int nilaiTertinggi = nilaiMahasiswa[0][hariTertinggi];
        String mahasiswaTertinggi = namaMahasiswa[0];

        for (int i = 1; i < JUMLAH_MAHASISWA; i++) {
            if (nilaiMahasiswa[i][hariTertinggi] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][hariTertinggi];
                mahasiswaTertinggi = namaMahasiswa[i];
            }
        }

        System.out.println("Mahasiswa: " + mahasiswaTertinggi);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Keterangan Nilai:");

        for (int i = 0; i < JUMLAH_MINGGU; i++) {
            System.out.println("Minggu ke-" + (i + 1) + ": " + nilaiMahasiswa[getIndexMahasiswa(namaMahasiswa, mahasiswaTertinggi)][i]);
        }
    }

    // Fungsi untuk mendapatkan indeks mahasiswa berdasarkan nama
    static int getIndexMahasiswa(String[] namaMahasiswa, String mahasiswa) {
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            if (namaMahasiswa[i].equals(mahasiswa)) {
                return i;
            }
        }
        return -1; // Return -1 jika tidak ditemukan (seharusnya tidak terjadi)
    }
}

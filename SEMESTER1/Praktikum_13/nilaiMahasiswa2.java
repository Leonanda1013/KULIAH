
import java.util.Scanner;

public class nilaiMahasiswa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah minggu/tugas: ");
        int jumlahMinggu = scanner.nextInt();

        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];
        String[] namaMahasiswa = new String[jumlahMahasiswa];

        // Mengisi array 2 dimensi dengan nilai tugas lima mahasiswa
        inputNilaiMahasiswa(nilaiMahasiswa, namaMahasiswa, scanner);

        // Menampilkan seluruh nilai mahasiswa
        tampilkanNilaiMahasiswa(nilaiMahasiswa, namaMahasiswa);

        // Mencari hari dengan nilai tertinggi
        int hariTertinggi = cariHariTertinggi(nilaiMahasiswa);
        System.out.println("Hari dengan nilai tertinggi adalah Minggu ke-" + (hariTertinggi + 1));

        // Menampilkan mahasiswa dengan nilai tertinggi dan keterangan nilai
        tampilkanMahasiswaNilaiTertinggi(nilaiMahasiswa, namaMahasiswa, hariTertinggi);

        scanner.close();
    }

    // Fungsi untuk meninputkan data nilai mahasiswa
    static void inputNilaiMahasiswa(int[][] nilaiMahasiswa, String[] namaMahasiswa, Scanner scanner) {
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.next();

            System.out.println("Input nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    static void tampilkanNilaiMahasiswa(int[][] nilaiMahasiswa, String[] namaMahasiswa) {
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari hari dengan nilai tertinggi
    static int cariHariTertinggi(int[][] nilaiMahasiswa) {
        int hariTertinggi = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int j = 1; j < nilaiMahasiswa[0].length; j++) {
            int totalNilaiHari = 0;
            for (int i = 0; i < nilaiMahasiswa.length; i++) {
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

        for (int i = 1; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i][hariTertinggi] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][hariTertinggi];
                mahasiswaTertinggi = namaMahasiswa[i];
            }
        }

        System.out.println("Mahasiswa: " + mahasiswaTertinggi);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Keterangan Nilai:");

        for (int i = 0; i < nilaiMahasiswa[0].length; i++) {
            System.out.println("Minggu ke-" + (i + 1) + ": " + nilaiMahasiswa[getIndexMahasiswa(namaMahasiswa, mahasiswaTertinggi)][i]);
        }
    }

    // Fungsi untuk mendapatkan indeks mahasiswa berdasarkan nama
    static int getIndexMahasiswa(String[] namaMahasiswa, String mahasiswa) {
        for (int i = 0; i < namaMahasiswa.length; i++) {
            if (namaMahasiswa[i].equals(mahasiswa)) {
                return i;
            }
        }
        return -1; // Return -1 jika tidak ditemukan (seharusnya tidak terjadi)
    }
}



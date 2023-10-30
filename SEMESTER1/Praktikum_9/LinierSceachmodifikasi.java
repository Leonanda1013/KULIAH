import java.util.Scanner;

public class LinierScearchmodifikasi{
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");
        int n = input17.nextInt();

        // Funsgi ini adalah Membaca elemen-elemen array dari user
        int[] arrayInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            arrayInt[i] = input29.nextInt();
        }
        System.out.print("Masukkan key yang ingin anda dicari: ");
        int key = input17.nextInt();

        int hasil = -1; // Inisialisasi hasil dengan -1, yang menandakan jika key tidak ditemukan.

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada didalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan dalam array.");
        }

        input29.close();
    }
} 
    


package Praktikum_11;

import java.util.Scanner;

public class Piramid {
        public static void main(String[] args) {
            Scanner sc29 = new Scanner(System.in);
            int rows;
            System.out.print("Masukkan N:");
            rows=sc29.nextInt();

    
            for (int i = 1; i <= rows; i++) {
                // Loop untuk cetak spasi sebelum bintang
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
    
                // Loop untuk cetak bintang
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
    
                System.out.println(); // Pindah ke baris berikutnya setelah selesai dengan satu baris
            }
        }
    }
    


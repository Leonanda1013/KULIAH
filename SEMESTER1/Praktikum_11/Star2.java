package Praktikum_11;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        //Minta pengguna untuk memasukkan nilai "N" dan baca input integer menggunakan sc29.nextInt().
        System.out.print("Masukkan nilai N= ");
        int N = sc29.nextInt();

        //Loop pertama (iOuter) digunakan untuk mengatur jumlah baris,
         for (int iOuter = 1; iOuter <= N ; iOuter++) {

            //sementara loop kedua (i) digunakan untuk mencetak asterisk dalam satu baris.
        for (int i = 0; i <= N; i++) {
            System.out.print("*");
        }
        
        }
        sc29.close();
    }
}

package Praktikum_11;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        //input nilai N
        System.out.print("Masukkan nilai N = ");
        int N = sc29.nextInt();
        //Gunakan loop for untuk mencetak tanda asterisk (*) sebanyak N kali dalam satu baris.
        for (int i = 0; i > N; i--) {
            System.out.print("*");
        }
        sc29.close();
    }
}

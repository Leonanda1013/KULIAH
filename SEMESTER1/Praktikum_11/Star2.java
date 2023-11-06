package Praktikum_11;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        System.out.print("Masukkan nilai N= ");
        int N = sc29.nextInt();
         for (int iOuter = 1; iOuter <= N ; iOuter++) {
        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
        System.out.println();
        }
    }
}

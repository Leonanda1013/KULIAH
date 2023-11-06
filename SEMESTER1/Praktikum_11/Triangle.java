package Praktikum_11;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc29.nextInt();
        int i = 0;
        while(i<=N){
            int j = 0;
            while(j<i){
                System.err.print("*");
                j++;
            }
            i++;
        }
    }
}

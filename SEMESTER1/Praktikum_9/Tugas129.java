package SEMESTER1.Jobsheet_9;

import java.util.Scanner;

public class Tugas129 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        int elemen, temp, terendah, tertinggi, total=0;
        double rata2;

        System.out.println("Masukkan banyak elemen");
        elemen = sc29.nextInt();

        int[] nilai = new int[elemen];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai "+(i+1)+" : " );
            nilai[i] = sc29.nextInt();
            total += nilai [i];
        }

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai.length-i; j++) {
                
                if (nilai [j-1]<nilai[j]){
                    temp = nilai[j];
                    nilai[j]= nilai[j-1];
                    nilai[j-1]= temp;
                }
            }
        }
        System.out.println();
        System.out.println("Hasil penginputan : ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]+" ");
        }
        System.out.println();
        tertinggi = nilai[0];
        terendah = nilai[nilai.length-1];
        rata2=total/nilai.length;

        System.out.println();
        System.out.println("Nilai tertinggi :"+ tertinggi);
        System.out.println("Nilai terendah :"+terendah);
        System.out.println("Rata rata nilai: "+rata2);
    }
}

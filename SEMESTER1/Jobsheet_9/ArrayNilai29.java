package SEMESTER1.Jobsheet_9;

import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        
        int[] nilaiAkhir = new int[10]; //ini merupakan inisialisasi dan delklarasi array bertie data integer yang memiliki 10 nilai
        // int [10] menandandakan 10 nilai, dan bukan nilainya 10 
       
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc29.nextInt(); 
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i]>70){
                System.out.println("Mahasiswa ke-"+i+" lulus!");
            } else{
                System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
            }
        }

    }

}

package SEMESTER1.Jobsheet_9;

import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        
        int[] nilaiAkhir = new int[10]; //ini merupakan inisialisasi dan delklarasi array bertie data integer yang memiliki 10 nilai
        // int [10] menandandakan 10 nilai, dan bukan nilainya 10 
       
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc29.nextInt(); //ini merupakan perulangan pertama dalam program ini
            //dalam perulangan ini dilakukan pemberian nilai pada variable nilai akhir dan akan di outputkan pada perulangan kedua
        }
    for (int i = 0; i < 10; i++) {
        System.out.println("Nilai akhir ke-"+i+" adalah "+ nilaiAkhir[i]);
        //ini merupakan perulangan kedua dalam program ini
        //ini digunakan hanya untuk mengeluarkan output yang varible sebelumnya sudah diberi nilai pada perulangan sebelumnya
    }

    }

}

package SEMESTER1.Jobsheet_9;

import java.util.Scanner;

public class ArrayRataNilai29 {
public static void main(String[] args) {
    

    Scanner sc29 = new Scanner(System.in);
    int[] nilaiMhs = new int[10]; //ini merupakan daklarasi array bertipe integer dengan 10 kali array
    double total = 0; //ini merupakan drklarasi dan pemberian nilai pada variable total
                    //mengapa harus ada nilai 0? karena tipe data double
    double rata2;// ini tidak ada nilainya karena harus ada oprasi dibawah

    for (int i = 0; i<nilaiMhs.length;i++){
        System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i]=sc29.nextInt(); // ini merupakan perulangan untuk memasukkan nilai variable nilaiMhs

    }

    for (int i = 0; i < nilaiMhs.length; i++) {
        total +=nilaiMhs[i]; //ini merupakan perulangan untuk proses penentuan nilai total dari nilai mahasiswa
                            //setiap nilai mahasiswa yang diinputkan akan diproses pada perulangan ini
    }
    rata2= total/nilaiMhs.length; //ini merupakan proses penentuan nilai dari rata rata

    System.out.println("Rata-rata nilai = "+rata2); //ini merupakan suatu perintah untuk print yanga akan muncul pada output 
}
}

package SEMESTER1.Jobsheet_9;

import java.util.Scanner;

public class ArrayRataNilai29 {
public static void main(String[] args) {
    

    Scanner sc29 = new Scanner(System.in);
    
    
    double total = 0; //ini merupakan drklarasi dan pemberian nilai pada variable total
                    //mengapa harus ada nilai 0? karena tipe data double
    double rata2;// ini tidak ada nilainya karena harus ada oprasi dibawah
    double totaltdklulus=0;
    double ratatdklulus;
    int tdklulus = 0;

    System.out.print("Masukkan jumlah mahasiswa: ");
    int jmlMhs = sc29.nextInt();

    int[] nilaiMhs = new int[jmlMhs]; //ini merupakan daklarasi array bertipe integer dengan 10 kali array
    

    for (int i = 0; i<nilaiMhs.length;i++){
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i]=sc29.nextInt(); // ini merupakan perulangan untuk memasukkan nilai variable nilaiMhs

    }

    for (int i = 0; i < nilaiMhs.length; i++) {
        total +=nilaiMhs[i]; //ini merupakan perulangan untuk proses penentuan nilai total dari nilai mahasiswa
                            //setiap nilai mahasiswa yang diinputkan akan diproses pada perulangan ini

    }

    for (int i = 0; i < nilaiMhs.length; i++) {
        if (nilaiMhs[i]<=70) {
            totaltdklulus +=nilaiMhs[i];
            tdklulus++;
        }
    }
    rata2= total/nilaiMhs.length; //ini merupakan proses penentuan nilai dari rata rata
    ratatdklulus = totaltdklulus/tdklulus;
    
    System.out.println("Rata-rata nilai = "+rata2); //ini merupakan suatu perintah untuk print yanga akan muncul pada output
    System.out.println("Rata-rata nilai tidak lulus "+ratatdklulus); 
    
}
}

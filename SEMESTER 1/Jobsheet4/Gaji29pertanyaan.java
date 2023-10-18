import java.util.Scanner;

public class Gaji29pertanyaan {

    public static void main(String[] args){

        Scanner input =new Scanner(System.in);
        //pekerjaan Vincentius

        int jmlMasuk, JmlTdkMasuk, TotGaji, potGaji, gaji;
    
        //pekerjaan Vincentius

        System.out.println("Masukkan Besaran Gaji Anda ");
        gaji=input.nextInt();
        System.out.println("Masukkan Potongan Gaji Anda ");
        potGaji=input.nextInt();
        //pekerjaan Vincentius

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();
        //pekerjaan Vincentius

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        //pekerjaan Vincentius

        System.out.println("Gaji yang anda terima adalah " + TotGaji);
        //pekerjaan Vincentius
    }

}


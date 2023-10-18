import java.util.Scanner;

public class Gaji29 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        //pekerjaan Vincentius

        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji=40000, potGaji=25000;
        //pekerjaan Vincentius

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();
        //pekerjaan Vincentius

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        //pekerjaan Vincentius

        System.out.println("Gaji yang anda terima adalah " + TotGaji);
        //pekerjaan Vincentius10
    }

}

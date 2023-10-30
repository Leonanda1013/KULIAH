import java.util.Scanner;

public class Kursi {

    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        String[] status = {"Tersedia", "Tidak Tersedia", "Tersedia"};
        int jmlKursi;
        int kursi;

        System.out.println("Masukkan jumlah kursi: ");
        jmlKursi = sc29.nextInt();
        sc29.nextLine();

        for (int i = 0; i <= jmlKursi; i++) {
            System.out.println("========"+(i+1)+"=========");
            System.out.print("Masukkan kursi: ");
            kursi =sc29.nextInt();
            System.out.println("Status kursi : "+status[kursi-1]);
            System.out.println("=======================");
            System.out.println("");
            System.out.println("");
        }
       

    }
}
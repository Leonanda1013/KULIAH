import java.util.Scanner;

public class HargaBayar29II {
    public static void main(String[] args){
    
        Scanner input =new Scanner(System.in);
        int harga, jumlah;
        double dis, total, bayar, jmlDis;
        String merkBuku;
        int jmlHalamnBuku;
        System.out.println("Masukkan merk barang yang ingin dibeli");
        merkBuku=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku");
        jmlHalamnBuku=input.nextInt();
        System.out.println("Masukkan jumlah diskon");
        dis=input.nextDouble();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);

    }

}

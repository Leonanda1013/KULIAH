import java.util.Scanner;

public class ForKelipatan29 {
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);
        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        double mean;
        //modifikasi dengan menambahkan variable rata rata
        
        // buat system input untuk bilangan kelipatan 
        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan29.nextInt();

        // gunakan perintah perulangan for
        // masukkan inisialisasi i=1
        // masukkan kondisi i <=50. Dalam hal ini, system akan berjalan jika kondisi belum memenuhi.
        // masukkan update i++. Jika kondisi belum memenuhi i akan ditambah satu pada seiap perulangan.
        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;

            }
        }
        mean = jumlah / counter; // modifikasi untuk program rata rata

        System.out.println("Banyaknya bilangan "+kelipatan+" dari 1 sampai 50 adalah "+counter);
        System.out.println("Total bilangan kelipatan "+kelipatan+" dari 1 sampai 50 adalah "+jumlah);
        System.out.println("Rata rata dari seluruh bilangan yang ditentukan "+ mean);

    }
}
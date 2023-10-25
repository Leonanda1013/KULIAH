import java.util.Scanner;

public class WhileKelipatan29 {

    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);
        int kelipatan;
        int jumlah = 0;
        int counter = 0;
        double mean;
        
        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan29.nextInt();
        int i=1;//pada while inisialisasi dilakukan disini
        while (i <= 50){ //yang ada pada kurung hanya kondisi
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;

            }
            i++; //update dilakukan di akhir berbeda pada perlangan for
        }
        mean = jumlah / counter; 

        System.out.println("Banyaknya bilangan "+kelipatan+" dari 1 sampai 50 adalah "+counter);
        System.out.println("Total bilangan kelipatan "+kelipatan+" dari 1 sampai 50 adalah "+jumlah);
        System.out.println("Rata rata dari seluruh bilangan yang ditentukan "+ mean);

    }
}
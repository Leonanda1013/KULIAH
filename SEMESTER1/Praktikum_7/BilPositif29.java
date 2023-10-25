import java.util.Scanner;

public class BilPositif29 {
    
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        int jumlah = 0, counter = 0, angka;
        float rata = 0;
        do {
            System.out.println("Masukkan integer posiif (-1 untuk berhenti): ");
            angka = sc29.nextInt();
            if (angka >= 0){
                jumlah += angka;
                ++counter;

            }
        }while (angka != -1);
        rata = jumlah / counter;
        System.out.printf("Jumlah dari %d angka adalah %d\n", counter, jumlah); //%d digunakan untuk memasukkan variable sama seperti +
        // %d\n digunakan untuk memberi jarak satu baris untuk print selanjutnnya
        System.out.printf("Rata-rata dari %d angka adalah %.3f\n", counter, rata);//printf digunakan untuk print jika didalamnya terdapaat suatu format

    }
}

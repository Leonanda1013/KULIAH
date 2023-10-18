import java.util.Scanner;

public class Pemilihan2Percobaan129 {
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);

        System.out.println("Masukkan Tahun");
        int tahun = scan29.nextInt();

        if ((tahun % 4) == 0 ){
        
            if((tahun % 100)!= 0)
            System.out.println("Tahun Kabisat");

        }else
        System.out.println("Bukan Tahun Kabisat");
    }
}
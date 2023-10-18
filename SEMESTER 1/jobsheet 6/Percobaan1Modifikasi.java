import java.util.Scanner;

public class Percobaan1Modifikasi {
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);

        System.out.println("Masukkan Tahun");
        int tahun = scan29.nextInt();

        if ((tahun % 4) == 0 ){
            if((tahun % 100)!= 0){
                if ((tahun % 400)== 0) {
                    
                }
            System.out.println("Tahun Kabisat");
            }else 
            System.out.println("Bukan tahun kabisat");
                
        }else
        System.out.println("Bukan Tahun Kabisat");
    }

}

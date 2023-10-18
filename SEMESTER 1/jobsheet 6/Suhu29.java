import java.util.Scanner;

public class Suhu29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

      int suhu;
      char hujan;
      
      System.out.println("Berapa suhu hari ini ");
      suhu = sc29.nextInt();
        System.out.println("Apakah hari ini hujan? (y or n)");
        hujan = sc29.next().charAt(0);

        if (suhu>27){
            System.out.println("Memakai dress");
            if (hujan == 'y') {
                System.out.println("Membawa Payung");

            }else
            System.out.println("Memakai Sun Screen");
        }else
        System.out.println("Memakai Celana Panjang");
    }
}

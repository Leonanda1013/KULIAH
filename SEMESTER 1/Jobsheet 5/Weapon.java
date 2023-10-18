import java.util.Scanner;
public class Weapon {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    

        System.out.println("Jarak musuh: ");
        int jarak = scan.nextInt();
        if (jarak <= 5){
            System.out.println("Menggunakan melee weapon");
        }else{
            System.out.println("Menggunakan range weapon");

        }
    }
}
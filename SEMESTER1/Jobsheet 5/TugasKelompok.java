import java.util.Scanner;

public class TugasKelompok {
    public static void main(String[] args){
        Scanner input29 = new Scanner(System.in);

        int kursi;
        System.out.println("1 2 3 4");
        System.out.println("5 6 7 8");
        System.out.println("Pilih kursi :");
        kursi = input29.nextInt();

        switch(kursi){
            case 1:
            System.out.println("tersedia");
            break;
            case 3:
            System.out.println("tersedia");
            break;
            case 5:
            System.out.println("tersedia");
            break;
            case 7:
            System.out.println("tersedia");
            break;
            default:
        System.out.println("maaf kursi ini sudah dipesan");

        }

}
}

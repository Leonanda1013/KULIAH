import java.util.Scanner;

public class Lingkaran29 {

    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        //pekerjaan Vincentius

        int r;
        double keliling, luas;
        double phi= 3.14;
    

        //pekerjaan Vincentius

        System.out.println("Masukkan jari-jari lingkaran: ");
        r=input.nextInt();
        //pekerjaan Vincentius

        keliling= 2*phi*r;
        luas=phi*r*r;
        //pekerjaan Vincentius

        System.out.println(keliling);
        System.out.println(luas);
        //pekerjaan Vincentius
        
    }
}
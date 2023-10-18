import java.util.Scanner;

public class PemilihanPercobaan129 {
    public static void main(String[] args){
    Scanner input00 = new Scanner(System.in);
    
    System.out.print("Masukkan angka: ");
    int angka = input00.nextInt();
    
    String hasil= (angka % 2 == 0) ? "Angka "+angka+" bilanan genap" : "Angka "+angka+" bilangan ganjil";
    System.out.println(hasil);
    System.out.println("haloo tio");

    System.out.println("PEKERJAAN TIO");


}
}
import java.util.Scanner;

public class LinearScearch29 {
 public static void main(String[] args) {
    Scanner sc29 = new Scanner(System.in);
    int[] arrayInt = {12,18,-6,10,6,15,11,9};
    int key = 10;
    int hasil = 0;
    int dicari = 0;
    int elemen = 0;

    for (int i = 0; i < arrayInt.length; i++) {
        if (arrayInt[i] == key) {
            hasil = i;
            break;
        }
    }

    for (int i = 0; i < arrayInt.length; i++) {
        System.out.println("Masukkan Elemen Array ke- "+(i+i)+" : ");
        elemen = sc29.nextInt();
    }

    System.out.println("Masukkan Key Yang Ingin Dicari : ");
    dicari = sc29.nextInt();
    System.out.println("Key ada dalam array, pada posisi indeks ke-"+hasil);
    
 }   
}

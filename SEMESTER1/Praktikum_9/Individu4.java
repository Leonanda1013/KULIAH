import java.util.Scanner;

public class Individu4 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        int[] nilai = new int[8];
        int banyak = 0;
        int jumlah = 0;
        double rata2;

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai ke-"+(i+1));
            nilai[i]= sc29.nextInt();
        }

        for (int j = 0; j < nilai.length; j++) {
            banyak++; 
            jumlah += nilai[j];
        }

        rata2 = jumlah/banyak;
        System.out.println("Rata-rata nilai adalah "+rata2);
        System.out.println(jumlah);
        System.out.println(banyak);
    }
}

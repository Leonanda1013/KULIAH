package Praktikum_11;
import java.util.Scanner;
public class Individu1 {
    
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc29.nextInt();

        if (N < 3) {
            System.out.println("N harus minimal 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Membuat spasi di sebelah kiri
                for (int k = 1; k <= (N-i) ; k++) {
                    System.out.print(" ");
                }

                // Mencetak angka dari 1 hingga i
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        sc29.close();
    }
}



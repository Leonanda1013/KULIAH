import java.util.Scanner;

public class Individu3 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        int[] angkaBulan = new int[12];

        for (int i = 0; i < bulan.length; i++) {
            System.out.println("Maukkan angka bulan: ");
            angkaBulan[i] = sc29.nextInt();
        }

        for (int i = 0; i < bulan.length; i++) {
            System.out.println("Bulan ke-"+angkaBulan[i]+" adalah "+bulan[angkaBulan[i]-1]);
        }
    }
}

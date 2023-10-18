import java.util.Scanner;

public class Percobaan3Modifikasi {
    public static void main(String[] args) {
        Scanner noAbsen = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = noAbsen.nextLine();
        System.out.print("Masukkan Bearnya Penghasilan : ");
        penghasilan = noAbsen.nextInt();

        if (kategori.equals("pekerja")){
            if(penghasilan <= 2000000) 
            pajak = 0.1;
            else if (penghasilan <= 300000000)
            pajak = 0.15;
            else
            pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);

        }else if (kategori.equals("pebisnis")){
            if (penghasilan <= 2500000)
            pajak = 0.15;
            else if (penghasilan <= 3500000)
            pajak = 0.2;
            else
            pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : "+ gajiBersih);

        }else
        System.out.println("Masukkan Kategori Salah");
    }
}

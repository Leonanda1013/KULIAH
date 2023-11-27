import java.util.*;

public class kubus29{
  
    public static int volumeKubus (int sisi){
        return sisi*sisi*sisi;
    }
    public static int luasPermukaan (int sisi){
        return 6*sisi*sisi;
    }
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        int sisi;
        System.out.print("Masukan Sisi Kubus: ");
        sisi = input29.nextInt();

        int volume = volumeKubus(sisi);
        System.out.println("Volume kubus adalah " + volume);
        int luas = luasPermukaan(sisi);
        System.out.println("Luas Permukaan kubus adalah " +luas);
        
    }
}


import java.util.Scanner;
public class UcapanTerimakasih_29 {

public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTambahan(String pesanTambahan) {
        System.out.println("Ucapan Tambahan: " + pesanTambahan);
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You inspire in me a love for learning and made me feel like I could ask you anything.");
        
        // Memanggil fungsi UcapanTambahan dengan parameter
        UcapanTambahan("Terima kasih atas dedikasi Anda dalam mengajar!");
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
    }
}

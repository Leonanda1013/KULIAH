import java.util.Scanner;

public class tes {
    public static void main(String[] args){
        Scanner sc17 = new Scanner(System.in);
        int fitur, pilihFilm;
        int tiket = 0;
        String nama;

        System.out.println("====================================");
        System.out.println("  Selamat Datang Di Bioskop VNL 1B  ");
        System.out.println("====================================");
        System.out.println("1. Masukkan Nama");
        System.out.println("2. Pilih Film");
        System.out.println("3. Pilih Posisi Kursi");
        System.out.println("4. Jenis Ticket");
        System.out.println("====================================");
        System.out.print("Masukkan Pilihan Anda : ");
        fitur = sc17.nextInt();

        System.out.print("Masukkan Nama Anda : ");
        nama = sc17.next();

        System.out.println("====================================");
        System.out.println("1. Masukkan Nama");
        System.out.println("2. Pilih Film");
        System.out.println("3. Pilih Posisi Kursi");
        System.out.println("4. Jenis Ticket");
        System.out.println("====================================");
        System.out.print("Masukkan Pilihan Anda : ");
        fitur = sc17.nextInt();

        System.out.println("====================================");

        System.out.println("Silakan pilih film yang ingin Anda tonton:");
        System.out.println("1. Spiderman : No Way Home");
        System.out.println("2. Spiderman : Far From Home");
        System.out.println("3. Spiderman : Homecomming");
        System.out.println("====================================");
        System.out.print("Masukkan Pilihan Anda : ");
        pilihFilm = sc17.nextInt();
        
        System.out.println("====================================");

        switch (pilihFilm) {
            case 1:
                System.out.println("Anda memilih Spiderman : No Way Home");
                break;
            case 2:
                System.out.println("Anda memilih Spiderman : Far From home");
                break;
            case 3:
                System.out.println("Anda memilih Spiderman : Homecomming");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("====================================");
        System.out.println("1. Masukkan Nama");
        System.out.println("2. Pilih Film");
        System.out.println("3. Pilih Posisi Kursi");
        System.out.println("4. Jenis Ticket");
        System.out.println("====================================");
        System.out.print("Masukkan Pilihan Anda : ");
        fitur = sc17.nextInt();

        System.out.println("====================================");

        for (int i = 0; i < tiket; i++) {
            System.out.print("Masukkan nomor kursi yang dinginkan : ");
            System.out.println("A1 A2 A3 A4 A5 A6");
            System.out.println("A1 A2 A3 A4 A5 A6");
            System.out.println("C1 C2 C3 C4 A5 A6");
            String nomorKursi = input.next();
             baris = Integer.parseInt(nomorKursi.substring(0, 1));
            int kolom = Integer.parseInt(nomorKursi.substring(1, 2));

            if (kursi[baris][kolom] == null) {
                kursi[baris][kolom] = "X";
                totalHarga += hargaTiket;
            } else {
                System.out.println("Maaf, kursi tersebut sudah dipesan.");
                i--;
            }
        }
    }
}
package Project;
import java.util.Scanner;

public class Pembayaran {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Pemesanan Tiket Bioskop!");

        // Pemilihan tanggal dan film
        // ...

        // Pemilihan kursi
        // ...

        // Harga tiket (di sini kita mengasumsikan harga tetap)
        double ticketPrice = 25000;

        // Jumlah tiket yang dibeli
        System.out.print("Masukkan jumlah tiket yang dibeli: ");
        int numberOfTickets = scanner.nextInt();

        // Total harga
        double totalPrice = ticketPrice * numberOfTickets;

        System.out.println("Total Harga Tiket: RP" + totalPrice);

        // Metode pembayaran (contoh sederhana)
        System.out.print("Pilih metode pembayaran (1: Kartu Kredit, 2: Uang Tunai): ");
        int paymentMethod = scanner.nextInt();

        if (paymentMethod == 1) {
            // Pembayaran dengan kartu kredit
            System.out.print("Masukkan nomor kartu kredit: ");
            String creditCardNumber = scanner.next();

            // Proses pembayaran dengan kartu kredit
            // ...

            System.out.println("Pembayaran dengan kartu kredit berhasil.");
        } else if (paymentMethod == 2) {
            // Pembayaran dengan uang tunai
            System.out.print("Masukkan jumlah uang tunai: Rp");
            double cashAmount = scanner.nextDouble();

            if (cashAmount >= totalPrice) {
                // Proses pembayaran dengan uang tunai
                // ...

                System.out.println("Pembayaran dengan uang tunai berhasil.");
            } else {
                System.out.println("Jumlah uang tunai tidak mencukupi.");
            }
        } else {
            System.out.println("Metode pembayaran tidak valid.");
        }

        // Tiket berhasil dipesan
        System.out.println("Tiket Anda telah berhasil dipesan!");

        // Lanjutkan dengan konfirmasi, cetak tiket, atau logika bisnis lainnya
        // ...
    }
}



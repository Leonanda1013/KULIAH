package SEMESTER1.UTS;

import java.util.Scanner;

public class Toko29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc29.nextLine();

        double totalHargaSebelumDiskon = 0;
        double totalDiskon = 0;
        int totalItem = 0;

        while (true) {
            System.out.print("Masukkan nama produk: ");
            String namaProduk = sc29.nextLine();

            System.out.print("Masukkan kuantitas produk: ");
            int kuantitas = sc29.nextInt();

            System.out.print("Masukkan harga satuan produk: ");
            double hargaSatuan = sc29.nextDouble();

            System.out.print("Apakah ada diskon untuk produk ini (%)? ");
            double diskonProduk = sc29.nextDouble();

            double totalHargaProduk = kuantitas * hargaSatuan;
            double diskon = (diskonProduk / 100) * totalHargaProduk;

            totalHargaSebelumDiskon += totalHargaProduk;
            totalDiskon += diskon;
            totalItem += kuantitas;

            System.out.print("Apakah ingin menginputkan produk lagi (Y/N)? ");
            String lanjut = sc29.next();
            sc29.nextLine(); 

            if (lanjut.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.print("Apakah pelanggan adalah member (Y/N)? ");
        String memberStatus = sc29.nextLine();
        boolean isMember = memberStatus.equalsIgnoreCase("Y");


        double diskonMember = isMember ? (totalHargaSebelumDiskon >= 200000 ? 0.1 : 0.05) * totalHargaSebelumDiskon : 0;
        double totalHargaAkhir = totalHargaSebelumDiskon - diskonMember;

        System.out.println("------- TOTAL HARGA -------");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Tipe Pelanggan: " + (isMember ? "Member" : "Bukan Member"));
        System.out.println("Total Item: " + totalItem);
        System.out.println("Total Harga Sebelum Diskon: Rp " + totalHargaSebelumDiskon);
        System.out.println("Total Diskon: Rp " + totalDiskon);
        System.out.println("Total Yang Harus dibayar: Rp " + totalHargaAkhir);

        sc29.close();
    }
}

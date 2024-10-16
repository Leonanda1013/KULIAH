package tugas;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Sejahtera", "Jl. Kemerdekaan No.1");

        // Tambah beberapa kamar
        Kamar kamar1 = new Kamar("101", "Single", 500000);
        Kamar kamar2 = new Kamar("102", "Double", 750000);

        // Masukkan ke dalam hotel
        hotel.addKamar(kamar1);
        hotel.addKamar(kamar2);

        // Tampilkan info hotel
        System.out.println(hotel.infoHotel());
    }
}

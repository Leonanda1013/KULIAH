package tugas;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nama;
    private String alamat;
    private List<Kamar> daftarKamar;

    public Hotel(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.daftarKamar = new ArrayList<>();
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void addKamar(Kamar kamar) {
        daftarKamar.add(kamar); // Memasukkan objek Kamar ke dalam list daftarKamar
    }

    public String getAlamat() {
        return alamat;
    }

    public List<Kamar> getDaftarKamar() { // Mengembalikan daftar kamar
        return daftarKamar;
    }

    public String getNama() {
        return nama;
    }

    public String infoHotel() {
        String info = "Nama Hotel: " + this.nama + "\n";
        info += "Alamat: " + this.alamat + "\n";
        info += "Daftar Kamar: \n";

        for (Kamar kamar : daftarKamar) {
            info += kamar.infoKamar() + "\n"; // Menampilkan info setiap kamar
        }

        return info;
    }
}

package percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    // Constructor
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];  // Inisialisasi array kursi
        this.initKursi();  // Memanggil method untuk inisialisasi kursi
    }

    // Method untuk inisialisasi kursi
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));  // Nomor kursi dari 1 hingga jumlah kursi
        }
    }

    // Getter dan Setter
    public String getKode() {
        return this.kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getArrayKursi() {
        return this.arrayKursi;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if (nomor > 0 && nomor <= arrayKursi.length) {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);  // Menetapkan penumpang pada kursi yang ditentukan
        } else {
            System.out.println("Nomor kursi tidak valid.");
        }
    }

    // Method untuk menampilkan informasi gerbong dan kursinya
    public String info() {
        String info = "Kode Gerbong: " + this.kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info() + "\n";
        }
        return info;
    }
}

package tugas;

import java.time.LocalDate;

public class Reservasi {
    private Tamu tamu; // Objek Tamu yang melakukan reservasi
    private Kamar kamar; // Objek Kamar yang dipesan
    private LocalDate tanggalCheckIn; // Tanggal check-in
    private LocalDate tanggalCheckOut; // Tanggal check-out

    // Constructor untuk inisialisasi reservasi dengan tamu, kamar, dan tanggal
    public Reservasi(Tamu tamu, Kamar kamar, LocalDate tanggalCheckIn, LocalDate tanggalCheckOut) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.tanggalCheckIn = tanggalCheckIn;
        this.tanggalCheckOut = tanggalCheckOut;
    }

    // Getter untuk tamu
    public Tamu getTamu() {
        return tamu;
    }

    // Setter untuk tamu
    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    // Getter untuk kamar
    public Kamar getKamar() {
        return kamar;
    }

    // Setter untuk kamar
    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    // Getter untuk tanggal check-in
    public LocalDate getTanggalCheckIn() {
        return tanggalCheckIn;
    }

    // Setter untuk tanggal check-in
    public void setTanggalCheckIn(LocalDate tanggalCheckIn) {
        this.tanggalCheckIn = tanggalCheckIn;
    }

    // Getter untuk tanggal check-out
    public LocalDate getTanggalCheckOut() {
        return tanggalCheckOut;
    }

    // Setter untuk tanggal check-out
    public void setTanggalCheckOut(LocalDate tanggalCheckOut) {
        this.tanggalCheckOut = tanggalCheckOut;
    }

    // Method untuk menampilkan informasi reservasi
    public String infoReservasi() {
        String info = "Reservasi:\n";
        info += tamu.infoTamu() + "\n";
        info += "Kamar: " + kamar.getNomorKamar() + " (" + kamar.getTipeKamar() + ")\n";
        info += "Tanggal Check-In: " + tanggalCheckIn + "\n";
        info += "Tanggal Check-Out: " + tanggalCheckOut + "\n";
        return info;
    }
}

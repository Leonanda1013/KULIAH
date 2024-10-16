package tugas;

public class Tamu {
    private String nama;
    private String identitas;

    // Constructor untuk inisialisasi tamu dengan nama dan identitas
    public Tamu(String nama, String identitas) {
        this.nama = nama;
        this.identitas = identitas;
    }

    // Getter untuk nama tamu
    public String getNama() {
        return nama;
    }

    // Setter untuk nama tamu
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk identitas tamu
    public String getIdentitas() {
        return identitas;
    }

    // Setter untuk identitas tamu
    public void setIdentitas(String identitas) {
        this.identitas = identitas;
    }

    // Method untuk menampilkan informasi tamu
    public String infoTamu() {
        return "Nama Tamu: " + this.nama + ", Identitas: " + this.identitas;
    }
}

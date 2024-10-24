public class Dokter28 extends Orang28 {
    private int id;
    private String spesialisasi;

    public Dokter28(int id, String nama, Boolean jenisKelamin, String alamat, String noTelp, String spesialisasi) {
        super(nama, jenisKelamin, alamat, noTelp);
        this.id = id;
        this.spesialisasi = spesialisasi;
    }

    // Overriding method getNama() dari class Orang28
    @Override
    public String getNama() {
        return "Dr. " + super.getNama();
    }

    public int getId() {
        return id;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }
}

public class Pasien28 extends Orang28 {
    private int id;
    private RekamMedik28 rekamMedik;

    public Pasien28(int id, String nama, Boolean jenisKelamin, String alamat, String noTelp) {
        super(nama, jenisKelamin, alamat, noTelp);
        this.id = id;
    }

    // Overriding method getNama() dari class Orang28
    @Override
    public String getNama() {
        return "Pasien: " + super.getNama();
    }

    public int getId() {
        return id;
    }

    public RekamMedik28 getRekamMedik() {
        return rekamMedik;
    }

    public void setRekamMedik(RekamMedik28 rekamMedik) {
        this.rekamMedik = rekamMedik;
    }
}

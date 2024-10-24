import java.util.Date;

public class Pemeriksaan28 {
    private int id;
    private Date tanggalPemeriksaan;
    private String keluhan;
    private String diagnosa;
    private String tindakan;
    private String obat;
    private Dokter28 dokter;

    public Pemeriksaan28(int id, Date tanggalPemeriksaan, String keluhan,
            String diagnosa, String tindakan, String obat, Dokter28 dokter) {
        this.id = id;
        this.tanggalPemeriksaan = tanggalPemeriksaan;
        this.keluhan = keluhan;
        this.diagnosa = diagnosa;
        this.tindakan = tindakan;
        this.obat = obat;
        this.dokter = dokter;
    }

    public int getId() {
        return id;
    }

    public Date getTanggalPemeriksaan() {
        return tanggalPemeriksaan;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public String getTindakan() {
        return tindakan;
    }

    public String getObat() {
        return obat;
    }

    public Dokter28 getDokter() {
        return dokter;
    }

}
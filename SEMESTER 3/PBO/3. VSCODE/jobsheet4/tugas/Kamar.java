package tugas;

public class Kamar {
    private String nomorKamar;
    private String tipeKamar;
    private int hargaPermalam;
    private boolean terisi;
    private Tamu tamu;

    public Kamar(String nomorKamar, String tipeKamar, int hargaPermalam) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPermalam = hargaPermalam;
        this.terisi = false; // default-nya kamar kosong
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public void setHargaPermalam(int hargaPermalam) {
        this.hargaPermalam = hargaPermalam;
    }

    public int getHargaPermalam() {
        return hargaPermalam;
    }

    public void setTamu(Tamu tamu) {
        if (!this.terisi) {
            this.tamu = tamu;
            this.terisi = true;
        } else {
            System.out.println("Kamar ini sudah terisi!");
        }
    }

    public void kosongkanKamar() {
        this.tamu = null;
        this.terisi = false;
    }

    public String infoKamar() {
        String info = "Nomor Kamar: " + this.nomorKamar + "\n";
        info += "Tipe Kamar: " + this.tipeKamar + "\n";
        info += "Harga per Malam: " + this.hargaPermalam + "\n";
        if (terisi) {
            info += "Tamu: " + tamu.infoTamu() + "\n";
        } else {
            info += "Status: Kosong\n";
        }
        return info;
    }
}

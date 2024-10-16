
package percobaan3;

public class Pegawai {
    private String nip;
    private String nama;
    public Pegawai(){}
    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    public String getNIP(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public void setNIP(String nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String info() { String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}

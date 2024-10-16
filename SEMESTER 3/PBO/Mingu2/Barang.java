package Mingu2;

public class Barang {
    public String namaBrg;
    public int stok;
    public String jenisBrg;

    public void tampilBarang() {
        System.out.println("Nama : " + namaBrg);
        System.out.println("Stok : " + stok);
        System.out.println("Jenis : " + jenisBrg);
    }

    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
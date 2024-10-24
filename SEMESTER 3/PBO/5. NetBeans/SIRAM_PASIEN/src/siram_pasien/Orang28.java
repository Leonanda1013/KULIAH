/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siram_pasien;

/**
 *
 * @author ASUS
 */
public class Orang28 {
    private String nama;
    private boolean jenisKelamin;
    private String alamat;
    private String noTelp;

    public Orang28() {

    }

    public Orang28(String nama, Boolean jenisKelamin, String alamat, String noTelp) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public Orang28(String nama, Boolean jenisKelamin, String alamat) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    public Orang28(String nama, Boolean jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

}

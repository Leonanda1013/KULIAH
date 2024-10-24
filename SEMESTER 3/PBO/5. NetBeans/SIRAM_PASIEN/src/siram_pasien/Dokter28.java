/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siram_pasien;

/**
 *
 * @author ASUS
 */
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

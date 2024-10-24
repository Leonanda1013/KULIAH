/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siram_pasien;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class RekamMedik28 {
    private int id;
    private Pasien28 pasien;
    private List<Pemeriksaan28> daftarPemeriksaan;

    public RekamMedik28(int id, Pasien28 pasien) {
        this.id = id;
        this.pasien = pasien;
        this.daftarPemeriksaan = new ArrayList<>();
    }

    public void tambahPemeriksaan(Pemeriksaan28 pemeriksaan) {
        if (daftarPemeriksaan == null) {
            daftarPemeriksaan = new ArrayList<>();
        }
        daftarPemeriksaan.add(pemeriksaan);
    }

    public void setDaftarPemeriksaan(List<Pemeriksaan28> daftarPemeriksaan) {
        this.daftarPemeriksaan = daftarPemeriksaan;
    }

    public List<Pemeriksaan28> getDaftarPemeriksaan() {
        return daftarPemeriksaan; // Mengembalikan referensi ke list
    }
}

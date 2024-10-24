/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloadingoverriding;

/**
 *
 * @author ASUS
 */
// Subclass: Meja (extends Kayu)
class Meja extends Kayu {
    String ukuran;

    // Constructor
    public Meja(String jenis, int usia, String kualitas, String ukuran) {
        super(jenis, usia, kualitas);
        this.ukuran = ukuran;
    }

    // Method Overriding
    @Override
    public void potong() {
        System.out.println("Kayu diolah menjadi meja ukuran " + ukuran);
    }

    public void taruhBarang() {
        System.out.println("Meja ukuran " + ukuran + " digunakan untuk menaruh barang.");
    }
}

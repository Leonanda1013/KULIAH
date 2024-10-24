/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloadingoverriding;

/**
 *
 * @author ASUS
 */


// Demo Class untuk Overriding dan Overloading
public class OverloadingOverriding {
    public static void main(String[] args) {
        // Tumbuhan dengan Overloading Constructor
        Tumbuhan tumbuhan = new Tumbuhan("Pohon Jati", 5);
        tumbuhan.tumbuh(); // Overriding method dari superclass Tumbuhan
        tumbuhan.tumbuh(3); // Overloading method dengan parameter tahun

        // Kayu dengan Overriding Method
        Kayu kayu = new Kayu("Pohon Mahoni", 10, "Tinggi");
        kayu.tumbuh(); // Overriding method di Kayu
        kayu.potong(); // Memanggil method potong() dari Kayu

        // Kursi dengan Overriding Method
        Kursi kursi = new Kursi("Pohon Oak", 8, "Sedang", "Minimalis");
        kursi.tumbuh(); // Overriding method di Kayu
        kursi.potong(); // Overriding method di Kursi
        kursi.duduk();  // Method dari kelas Kursi

        // Meja dengan Overriding Method
        Meja meja = new Meja("Pohon Pinus", 6, "Rendah", "Besar");
        meja.tumbuh(); // Overriding method di Kayu
        meja.potong(); // Overriding method di Meja
        meja.taruhBarang(); // Method dari kelas Meja
    }
}


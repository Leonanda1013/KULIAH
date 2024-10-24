/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloadingoverriding;

/**
 *
 * @author ASUS
 */
// Superclass: Tumbuhan
class Tumbuhan {
    String jenis;
    int usia;

    // Constructor Overloading
    public Tumbuhan(String jenis) {
        this.jenis = jenis;
        this.usia = 0; // default usia
    }

    public Tumbuhan(String jenis, int usia) {
        this.jenis = jenis;
        this.usia = usia;
    }

    // Method Overriding Example
    public void tumbuh() {
        System.out.println(jenis + " sedang tumbuh.");
    }

    // Method Overloading
    public void tumbuh(int tahun) {
        this.usia += tahun;
        System.out.println(jenis + " tumbuh selama " + tahun + " tahun.");
    }
}


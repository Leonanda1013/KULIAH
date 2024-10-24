/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloadingoverriding;

/**
 *
 * @author ASUS
 */
// Subclass: Kayu (extends Tumbuhan)
class Kayu extends Tumbuhan {
    String kualitas;

    // Constructor Overloading
    public Kayu(String jenis, int usia, String kualitas) {
        super(jenis, usia); // panggil constructor superclass
        this.kualitas = kualitas;
    }

    // Method Overriding
    @Override
    public void tumbuh() {
        System.out.println("Kayu berkualitas " + kualitas + " dari jenis " + jenis + " sedang tumbuh.");
    }

    public void potong() {
        System.out.println("Kayu dari " + jenis + " dipotong.");
    }
}



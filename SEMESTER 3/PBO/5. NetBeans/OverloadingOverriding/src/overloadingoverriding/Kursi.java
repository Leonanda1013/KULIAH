/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloadingoverriding;

/**
 *
 * @author ASUS
 */
// Subclass: Kursi (extends Kayu)
class Kursi extends Kayu {
    String model;

    // Constructor
    public Kursi(String jenis, int usia, String kualitas, String model) {
        super(jenis, usia, kualitas);
        this.model = model;
    }

    // Method Overriding
    @Override
    public void potong() {
        System.out.println("Kayu diolah menjadi kursi model " + model);
    }

    public void duduk() {
        System.out.println("Kursi model " + model + " digunakan untuk duduk.");
    }
}



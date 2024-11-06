/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacelatihan;

/**
 *
 * @author ASUS
 */
public class Mahasiswa implements ICumlaude{
    protected String nama;
    
    public Mahasiswa(String nama){
    this.nama = nama;
    
    }
    
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
    
    @Override
    public void lulus(){
        System.out.println("Aku Mahasiswa lulus");
    }
    
    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku Tinggi");
    }
    
    
}

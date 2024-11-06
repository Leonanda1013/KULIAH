/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacelatihan;

/**
 *
 * @author ASUS
 */
public class Program {
    public static void main(String[]args){
        Rektor pakRektor = new Rektor();
        
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
       // pakRektor.berSertifikatCumlaude(mahasiswaBiasa);
       // pakRektor.berSertifikatCumlaude(sarjanaCumlaude);
       // pakRektor.berSertifikatCumlaude(masterCumlaude);
       
       
       pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
       pakRektor.beriSertifikatMawapres(masterCumlaude);
}
}

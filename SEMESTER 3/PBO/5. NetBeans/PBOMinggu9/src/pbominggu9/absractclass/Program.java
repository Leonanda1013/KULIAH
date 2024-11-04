/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbominggu9.absractclass;

/**
 *
 * @author ASUS
 */
public class Program {
    public static void main(String[] args){
    Kucing kucingKampung = new Kucing();
    Ikan lumbaLumba = new Ikan();
    
    Orang ani = new Orang("Ani");
    Orang budi = new Orang("Budi");
    
    ani.peliharaanHewan(kucingKampung);
    budi.peliharaanHewan(lumbaLumba);
    
    ani.ajakPeliharaanJalanJalan();
    budi.ajakPeliharaanJalanJalan();
    }
}

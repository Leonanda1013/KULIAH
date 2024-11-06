/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacelatihan;

/**
 *
 * @author ASUS
 */
public class Rektor {
    public void berSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda");
        if(mahasiswa instanceof Mahasiswa){
            ((Mahasiswa) mahasiswa).kuliahDiKampus();
        } else if(mahasiswa instanceof Sarjana){
            ((Sarjana) mahasiswa).kuliahDiKampus();
        }
        
    
        
        System.out.println("Aku Berkuliah di Kampus");
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("-------------------------------------------------");
    }
    
    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("-----------------------------------");
    }
}


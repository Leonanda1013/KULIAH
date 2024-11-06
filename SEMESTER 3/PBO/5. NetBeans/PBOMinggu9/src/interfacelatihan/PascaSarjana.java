/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacelatihan;

/**
 *
 * @author ASUS
 */
public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi{
    public PascaSarjana(String nama){
        super(nama);
    }
    
    @Override
    public void lulus(){
        System.out.println("Aku sudah menyelesaikan TESIS");
    }
    
    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebih dari 3,71");
    }
    
    @Override
    public void menjuaraiKompetisi(){
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
                
    }
    
    @Override
    public void membuatPublikasiIlmiah(){
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorencapulation;

/**
 *
 * @author ASUS
 */
public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;
    
    public void printStatus(){
        if(kontakOn == true){
            System.out.orintln("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}

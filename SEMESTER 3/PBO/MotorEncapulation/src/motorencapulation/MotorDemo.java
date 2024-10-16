/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorencapulation;

/**
 *
 * @author ASUS
 */
public class MotorDemo {
   public static void main(String[] args){
       Motor motor = new Motor();
       motor.printStatus();
       motor.kecepatan = 50;
       motor.printStatus();
   } 
}

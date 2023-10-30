package LatihanMandiri;

import java.util.Scanner;



public class Ujian {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Float ipk;
    Float nilai;
    

System.out.println("maukkan nilai: ");
    nilai = sc.nextFloat();

    if (nilai>=90) {
        System.out.println("A");
    }else if (nilai>=95) {
            System.out.println("A+");
            
     } else {
            System.out.println("A-");
        }
        

    

    }
}

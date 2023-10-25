import java.util.Scanner;

public class ForVar229 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        int bil;
        boolean berhenti = false;
        for (; !berhenti ;){
            System.out.println("Masukkan bilangan: ");
            bil = sc29.nextInt();
            System.out.println("Bilangan yang Anda masukkan "+bil);
            if(bil == 0){
                berhenti = true;
            }
        }
        System.out.println("Program berakhir");
    }
}

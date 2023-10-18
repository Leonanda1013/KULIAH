import java.util.Scanner;

public class Login29 {
    public static void main(String[] args) {

        String user = "admin";
        String pass = "12345";

        Scanner scan = new Scanner (System.in);
        System.out.println("Username: ");
        String username = scan.nextLine();
        System.out.println("password: ");
        String password = scan.nextLine();

        if(username.equals(user) && password.equals(pass)){
            System.out.println("Selamat datang");

        }else{
            System.out.println("Username dan Password salah");
        }

        
    }
}

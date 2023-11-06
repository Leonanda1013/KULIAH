package Praktikum_10;
import java.util.Scanner;
public class Login {
    


    public static void main(String[] args) {
        // Data login pengguna (username dan password)
        String[][] userCredentials = {
            {"Nabhan", "pass1"},
            {"Vincentius", "pass2"},
            {"Luthfi", "pass3"}
        };

        Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = false;

        System.out.println("Selamat datang!");
        
        while (!isLoggedIn) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();
            
            isLoggedIn = checkCredentials(userCredentials, username, password);
            
            if (!isLoggedIn) {
                System.out.println("Login gagal. Coba lagi.");
            } else {
                System.out.println("Login berhasil. Selamat datang, " + username + "!");
            }
        }
    }

    public static boolean checkCredentials(String[][] userCredentials, String username, String password) {
        for (String[] user : userCredentials) {
            if (user[0].equals(username) && user[1].equals(password)) {
                return true; // Login berhasil
            }
        }
        return false; // Login gagal
    }
}



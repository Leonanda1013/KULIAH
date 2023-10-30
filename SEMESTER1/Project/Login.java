package Project;

import java.util.Scanner;

public class Login{
    public static void main(String[] args) {
        String[] usernames = new String[100]; // Maksimal 100 pengguna
        String[] passwords = new String[100];
        int userCount = 0; // Jumlah pengguna yang terdaftar

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Login");
            System.out.println("2. Registrasi");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter baru dari input

            if (choice == 1) {
                System.out.print("Masukkan nama pengguna: ");
                String inputUsername = scanner.nextLine();
                System.out.print("Masukkan kata sandi: ");
                String inputPassword = scanner.nextLine();

                boolean isAuthenticated = false;

                for (int i = 0; i < userCount; i++) {
                    if (inputUsername.equals(usernames[i]) && inputPassword.equals(passwords[i])) {
                        isAuthenticated = true;
                        break;
                    }
                }

                if (isAuthenticated) {
                    System.out.println("Login berhasil!");
                } else {
                    System.out.println("Login gagal. Nama pengguna atau kata sandi salah.");
                }
            } else if (choice == 2) {
                if (userCount < usernames.length) {
                    System.out.print("Masukkan nama pengguna baru: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Masukkan kata sandi baru: ");
                    String newPassword = scanner.nextLine();

                    usernames[userCount] = newUsername;
                    passwords[userCount] = newPassword;
                    userCount++;

                    System.out.println("Registrasi berhasil!");
                } else {
                    System.out.println("Batas maksimum pengguna tercapai. Tidak dapat mendaftar lebih banyak.");
                }
            } else if (choice == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}

import java.util.Scanner;

public class kelasperempuan {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        String nama;
        String kelamin;

        

        for(int i=1; i<=30;i++){
        System.out.print("Nama : ");
        nama = sc29.nextLine();
        System.out.print("Kelamin (pr/lk) :");
        kelamin = sc29.nextLine();

            if (kelamin.equalsIgnoreCase("pr")) {
                System.out.println(nama);
                System.out.println("");
            }else {
                continue;
            }
        }
        System.out.println("Program Berhenti");
        

    }
}

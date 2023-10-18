import java.util.Scanner;

public class Latihan2Individu29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        String jenisBuku;
        int jmlBuku;
        int harga;
        int totHarga;

        

        System.out.println("Buku apa yang ingin anda beli?");
        jenisBuku = sc29.nextLine();
        System.out.println("Berapa buku yang ingin anda beli?");
        jmlBuku = sc29.nextInt();
        System.out.println("Berapa harga 1 buku tersebut?");
        harga = sc29.nextInt();

        totHarga = harga*jmlBuku;

        if ((jenisBuku.equals("kamus") && jmlBuku <= 2)) {
             System.out.println("Harga "+jmlBuku+" " +jenisBuku + " adalah "+totHarga);
            System.out.println("Diskon = 10%");
            System.out.println("Diskon = "+totHarga*0.1);
            System.out.println("Anda Harus membayar" + (totHarga-totHarga*0.1) );
        
        } else if (jenisBuku.equals("kamus") && jmlBuku > 2){
            System.out.println("Harga "+jmlBuku+" " +jenisBuku + " adalah "+totHarga);
            System.out.println("Diskon = 12%");
            System.out.println("Diskon = "+totHarga*0.12);
            System.out.println("Anda harus membayar" + (totHarga-(totHarga*12/100)));
            
        }else if (jenisBuku.equals("novel") && jmlBuku == 1){
            System.out.println("Harga "+jmlBuku+" " +jenisBuku + " adalah "+totHarga);
            System.out.println("Diskon = 7%");
            System.out.println("Diskon = "+totHarga*0.07);
            System.out.println("Anda harus membayar"+ (totHarga-totHarga*0.07));
            
        }else if (jenisBuku.equals("novel") && jmlBuku <= 3){
            System.out.println("Harga "+jmlBuku+" " +jenisBuku + " adalah "+totHarga);
            System.out.println("Diskon = 8%");
            System.out.println("Diskon = "+totHarga*0.08);
            System.out.println("Anda harus membayar"+ (totHarga-totHarga*0.08));

        }else if (jenisBuku.equals("novel") && jmlBuku > 3){
            System.out.println("Harga "+jmlBuku+" " +jenisBuku + " adalah "+totHarga);
            System.out.println("Diskon = 9%");
            System.out.println("Diskon = "+totHarga*0.09);
            System.out.println("Anda harus membayar"+ (totHarga-totHarga*0.09));

        }else if (jmlBuku > 3){
            System.out.println("Harga "+jmlBuku+" " +jenisBuku + " adalah "+totHarga);
            System.out.println("Diskon = 5%");
            System.out.println("Diskon = "+totHarga*0.05);
            System.out.println("Anda harus membayar"+ (totHarga-totHarga*0.05));

          }else if (jmlBuku <= 3){
            System.out.println("Harga "+jmlBuku+" " +jenisBuku + " adalah "+totHarga);
            System.out.println("Anda harus membayar"+ totHarga);
    }
}
}


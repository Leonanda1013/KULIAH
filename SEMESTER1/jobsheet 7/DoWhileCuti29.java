import java.util.Scanner;

public class DoWhileCuti29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        int jatahCuti, jmlHari;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti = sc29.nextInt();

        do{
            System.out.println("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc29.next();
            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.println("Jumlah hari ");
                jmlHari = sc29.nextInt();

                if (jmlHari <= jatahCuti) {
                    jatahCuti -= jmlHari;
                    System.out.println("Sisa jatah cuti "+ jatahCuti);
                    

                }else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    continue;//ini merupakan modifikasi
                }
            } else{
                konfirmasi.equalsIgnoreCase("t");
                break;//break akan memberhentikan system 
            }
        }while (jatahCuti > 0);
    }
}

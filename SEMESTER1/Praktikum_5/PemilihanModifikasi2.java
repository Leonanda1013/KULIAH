import java.util.Scanner;

public class PemilihanModifikasi2 {
    public static void main(String[] args){

        Scanner input29 = new Scanner(System.in);

        System.out.print("Nilai uas         : ");
        float uas = input29.nextFloat();
        System.out.print("Nilai uts         : ");
        float uts = input29.nextFloat();
        System.out.print("Nilai kuis        : ");
        float kuis = input29.nextFloat();
        System.out.print("Nilai tugas       : ");
        float tugas = input29.nextFloat();


        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);


        String message = total < 65 ? "Remidi" : "Tidak remidi";


        System.out.println("Nilai akhir = " + total + " sehingga " + message );

        if (total>80 && total <= 100)
            System.out.println("A");
        else if (total>73 && total <=80)
            System.out.println("B+");
        else if (total <=73 && total >65)
            System.out.println("B");
        else if (total <=65 && total >60)
            System.out.println("C+"); 
        else if (total <=60 && total >50)
            System.out.println("C");
        else if (total <=50 && total>39)
            System.out.println("D");
        else if (total <=39)
            System.out.println("E");

        System.out.println("PEKERJAAN TIO");
    }
}

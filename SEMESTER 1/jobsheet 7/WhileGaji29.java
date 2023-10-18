import java.util.Scanner;

public class WhileGaji29{
    public static void main(String[] args) {
        Scanner scan29 = new Scanner(System.in);
        int jmlKaryawan;
        int jmlJamLembur;
        double gajiLembur = 0;
        double totGajiLembur = 0;
        String jabatan;
        System.out.println("Masukkan jumlah karyawan: ");
        jmlKaryawan = scan29.nextInt();
    

        int i = 0;//ini merupakan inisialisasi pada loop  while
        while (i < jmlKaryawan) { // yang terdapat pada kurung hanya kondisi
            System.out.println("Pilihan jabatan - Direktur, Manager, Karyawan");
            System.out.println("Masukkan jabatan karyawan ke-"+(i+1)+": ");
            jabatan = scan29.next();
            System.out.println("Masukkan jumlah jam lembur: ");
            jmlJamLembur = scan29.nextInt();
            ;

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            }else if(jabatan.equalsIgnoreCase("manager")){
                gajiLembur = jmlJamLembur * 100000;

            }else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jmlJamLembur * 75000;
            }else {
                System.out.println("Jabatan Invalid"); //ini merupakan modifikasi 
                gajiLembur = 0;
                i--;//ini merupakan update pada loop while
            }
            totGajiLembur += gajiLembur;

        }
        System.out.println("Total gaji lembur: "+ totGajiLembur);

    }
}
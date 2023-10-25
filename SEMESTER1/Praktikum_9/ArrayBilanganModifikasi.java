package SEMESTER1.Jobsheet_9;

public class ArrayBilanganModifikasi {
    public static void main(String[] args) {
        double[] bil = new double[4];
        bil[0]= 5.0; //akan terjadi eror karena harusnnya double
        bil[1]= 12867;
        bil[2]= 7.5;
        bil[3]= 2000000;

       for (int i = 0; i <= 4; i++) {
         System.out.println(bil[i]); //ini merupakan perulangan untuk print bilangan pada varible bil tanpa menuliskan print satu per satu
       }
    }
}

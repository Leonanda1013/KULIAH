package SEMESTER1.Jobsheet_9;

public class ArrayBilanganModifikasi {
    public static void main(String[] args) {
        int[] bil = new int[4];
        bil[0]= 5.0; //akan terjadi eror karena harusnnya double
        bil[1]= 12867;
        bil[2]= 7.5;
        bil[3]= 2000000;

        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);
    }
}

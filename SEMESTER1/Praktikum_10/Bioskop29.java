package Praktikum_10;

public class Bioskop29 {
    public static void main(String[] args) {
        //identifikasi array dua dimensi yang memiliki 4 baris dan 2 kolom. Ini digunakan untuk menyimpan daftar nama penonton.
        String[][] penonton = new String[4][2];


        penonton[0][0] = "Amin";//Ini mengisi elemen di baris pertama, kolom pertama dengan nilai "Amin".
        penonton[0][1] = "Bena";//Ini mengisi elemen di baris pertama, kolom kedua dengan nilai "Bena".
        penonton[1][0] = "Candra";//Seterusnya, kode serupa digunakan untuk mengisi daftar penonton hingga baris keempat.
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana"; //tambahan


        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        System.out.println(penonton.length);

        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: "+ barisPenonton.length);
        }
    }
}

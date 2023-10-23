package SEMESTER1.Jobsheet_9;

public class BubbleSortExample29 {
    public static void main(String[] args) {
        
        int[] intData = {34, 18, 87, 72, 32, 54, 43}; //ini merupkan deklarasi dan inisialisasi dari array bertipe int
        int temp = 0;
        for (int i = 0; i < intData.length; i++) { //ini merupakan perulakan pertama
            for (int j = 1; j < intData.length-i; j++) { //Setiap iterasi mengurangi jumlah elemen yang masih belum terurut sebanyak 1 (karena elemen terbesar akan "mengapung" ke posisinya yang benar setiap kali iterasi).
                
            
                if (intData[j-1]>intData[j]) { //digunakan untuk membandingkan pasangan elemen berturut-turut dan menukar mereka jika elemen sebelumnya lebih besar dari elemen saat ini. Ini adalah langkah inti dari algoritma pengurutan gelembung.
                    //swap elemen
                    temp = intData[j];
                    intData[j]=intData[j-1];
                    intData[j-1]=temp;
                }
            }
        }

        System.out.println("Hasil pengurutan:");
        for (int i = 0; i < intData.length; i++) {
            System.out.println(intData[i]);
            
        }
    }
}

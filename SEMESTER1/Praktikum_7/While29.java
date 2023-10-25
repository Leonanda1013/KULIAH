public class While29 {
    public static void main(String[] args) {
        int i = 1; //ini adalah inisialisasi dari system while
        while (i<= 10){ //yang berada pada kurung adalah kondisi while
          if(i % 2 == 0){

           System.out.println("Angka " +i+ " adalah bilangan genap");

        } else {
            System.out.println("Angka "+i+ " adalah bilangan ganjil");

        }
        i++; //ini merupakan update pada while. variable i akan di tambah 1 jika terjadi pengulangan
    }
    }
}

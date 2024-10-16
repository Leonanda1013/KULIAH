package percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {
        // Deklarasi dan instansiasi objek Processor dengan merk "Intel i5" dan cache 3
        Processor p = new Processor("Intel i5", 3.0);

        // Deklarasi dan instansiasi objek Laptop dengan merk "Thinkpad" dan objek
        // Processor p
        Laptop L = new Laptop("Thinkpad", p);

        // Memanggil method info() dari objek Laptop L
        L.info();

        // Deklarasi dan instansiasi objek Processor p1 menggunakan setter
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setChace(4.0);

        // Deklarasi dan instansiasi objek Laptop L1 menggunakan setter
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);

        // Memanggil method info() dari objek Laptop L1
        L1.info();
    }
}

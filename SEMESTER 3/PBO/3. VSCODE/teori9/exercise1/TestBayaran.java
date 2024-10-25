public class TestBayaran {
    public static void main(String[] args) {
        Manajer man = new Manajer("agus", 800, 50);
        Programmer prog = new Programmer("budi", 600, 30);
        Bayaran hr = new Bayaran();

        System.out.println("Bayaran manager: " + hr.hitungBayaran(man));
        System.out.println("Bayaran programmer: " + hr.hitungBayaran(prog));
    }
}

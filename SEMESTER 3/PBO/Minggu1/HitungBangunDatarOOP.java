public class HitungBangunDatarOOP {
    public static void main(String[] args) {
        double panjangPersegiPanjang = 5;
        double lebarPersegiPanjang = 3;
        double jariJariLingkaran = 3.5;

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
        Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);

        // Tampilkan hasil perhitungan
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling()); 
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
    }
}

class PersegiPanjang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}


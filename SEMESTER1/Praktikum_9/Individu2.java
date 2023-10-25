public class Individu2 {
    public static void main(String[] args) {
        int[] nilai = new int[10];

        for (int i = 0; i < nilai.length; i++) {
            nilai[i]=i;
    }
    for (int j = nilai.length; j > 0; j--) {
        System.out.println(nilai[j - 1]);
    }
}
}
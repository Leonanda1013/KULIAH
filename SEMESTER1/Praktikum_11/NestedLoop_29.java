package Praktikum_11;

import java.util.Scanner;

public class NestedLoop_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            double sum = 0.0;
            for (double temperature : temps[i]) {
                System.out.print(temperature + " ");
                sum += temperature;
            }
            double average = sum / temps[i].length;
            System.out.println("Rata-rata: " + average);
        }

        scanner.close();
    }
}

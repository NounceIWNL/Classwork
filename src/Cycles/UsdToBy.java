package Cycles;

import java.util.Scanner;

public class UsdToBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input change rate.");
        double rate = scanner.nextDouble();

        for (int i = 1; i <= 20; i++)
            System.out.printf("%d USD = %.2f BYN\n", i, i * rate);
    }
}

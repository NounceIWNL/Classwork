package Cycles;

import java.util.Scanner;

public class Summary {
    public static void main(String[] args) {
//        сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры;
//        b a).

        Scanner scannerA = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scannerA.nextInt();
        Scanner scannerB = new Scanner(System.in);
        System.out.println("Input b: ");
        int b = scannerB.nextInt();

        int summary = 0;

        for (int i = 0; i <= b; i++)
            summary+= i;
        System.out.println(summary);


    }
}

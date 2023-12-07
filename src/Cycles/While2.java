package Cycles;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        //Вводить натуральные числа с клавиатуры.
        // Признаком окончания ввода будет ненатуральное число
        solve2();


    }

    private static void solve1() {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        while (n > 0) {
            System.out.println("Input number: ");
            n = scanner.nextInt();
//            System.out.println(n);
        }

    }

    private static void solve2() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Input number: ");
            n = scanner.nextInt();
        }
        while (n > 0);
    }
}


package Math_Tasks;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of the month: ");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1, 2, 3 -> System.out.println("Winter");
            case 4, 5, 6 -> System.out.println("Spring");
            case 7, 8, 9 -> System.out.println("Summer");
            case 10, 11, 12 -> System.out.println("Autumn");
            default -> System.out.println("Wrong number. Please try again.");

        }
    }
}

package Math_Tasks;

import java.util.Scanner;

public class HomeworkTask06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            System.out.println("Leap year");
        else
            System.out.println("Not leap one");
        if (year < 1)
            System.out.println("Wrong number. Try again.");





    }
}

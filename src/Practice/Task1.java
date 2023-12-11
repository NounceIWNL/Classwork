package Practice;

public class Task1 {
    public static void main(String[] args) {
        //Sample 1
        // Сколько раз выполнится цикл?
        for (int i = 0; i < 5; i++)
            System.out.print(i);
        System.out.println();

        //Sample 2
        //Какое число выведет первым и какое вторым?
        for (int i = 0; i <= 10; i = i + 2)
            System.out.print(i++);
        System.out.println();

        //Sample 3
        // Сколько раз выполнится цикл?
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++)
                System.out.print(i + " " + j + "  ");
        System.out.println();

        //Sample 4
        // Сколько раз выполнится цикл?
        for (int i = 1; i <= 3; i++)
            for (int j = 3; j >= i; j--)
                System.out.print("* ");
        System.out.println();

        //Sample 5
        // Сколько раз выполнится цикл?
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2)
                    break;
                System.out.print(i + " " + j + "  ");
            }
        System.out.println();
    }
}

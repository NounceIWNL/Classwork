package Practice;

public class Task2 {
    public static void main(String[] args) {
        // Сколько раз выполнится цикл?
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++)
                System.out.print(i + " " + j);
            if (i == 2)
                break;
        }
        System.out.println();

        //Sample 7
        // Сколько раз выполнится цикл?
        aa:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.print(i + " " + j);
            }
        }
        System.out.println();

        //Sample 8
        // Сколько раз выполнится цикл?

        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break bb;
                }
                System.out.print(i + " " + j);
            }
        }
        System.out.println();

        //Sample 9
        // Сколько раз выполнится цикл?
        int i = 0;
        while (i <= 3)
            System.out.print(i++);
        System.out.println();

        //Sample 10
        // Сколько раз выполнится цикл?
        i = 0;
        do
            System.out.print(i++);
        while (i <= 3);
        System.out.println();
    }
}

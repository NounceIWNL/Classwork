package Practice;

public class Task3 {
    public static void main(String[] args) {
        // Сколько раз выполнится цикл?
        int i = 0;
        while (i <= 3)
            System.out.print(++i);
        System.out.println();

        //Sample 12
        // Сколько раз выполнится цикл?
        i = 0;
        do
            System.out.print(++i);
        while (i <= 3);
        System.out.println();

        //Sample 13
        // Сколько раз выполнится цикл?
        i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3)
                System.out.print(j++);
            i++;
        }
        System.out.println();

        //Sample 14
        // Чему равна сумма?
        int x = 1, sum = 0;
        while (x <= 3)
            sum += x++;
        System.out.println("Summation: " + sum);

        //Sample 15
        x = 1;
        sum = 0;
        do
            sum += x++;
        while (x <= 3);
        System.out.println("Summation: " + sum);
    }
}

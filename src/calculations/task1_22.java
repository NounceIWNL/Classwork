package calculations;

public class task1_22 {
    public static void main(String[] args) {
        /*
        1. Решение задач
        2. Чтение книг
        3. Посмотреть разбор конкретной темы на YT
         */
        int x = 2;
        double y = 7*Math.pow(x,2) - 3 * x + 6;
        System.out.println("y = " + y);

        int z = 4;
        double w = Math.sqrt(z);
        System.out.println(w);

        double h = 2, r = 6350_000;
        double l = Math.sqrt((r+h)*(r+h)-r*r);
        System.out.println(l);
    }
}


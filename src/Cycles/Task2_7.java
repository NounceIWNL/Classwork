package Cycles;

public class Task2_7 {
    public static void main(String[] args) {
        double a = 2. / 3;
        double summary = a;
        for (int i = 2; i < 5; i++) {
            a *= 2 * i / (2 * i + 1);
            summary += a;
            System.out.println(a);
        }
        System.out.println(summary);
    }
}

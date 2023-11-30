package Math_Tasks;

public class PracticeIf {
    public static void main(String[] args) {
        double x = 1, y;

        if (x > 0) {
            y = Math.sin(x) * Math.sin(x);
        } else y = 1 - 2 * Math.sin(x * x);
        System.out.println(y);
    }
}

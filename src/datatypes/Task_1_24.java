package datatypes;

// (2a + sin|3a|) / 3.56

public class Task_1_24 {
    public static void main(String[] args) {
        double a = 2;
        double b = (2 * a + (Math.sin(3 * a))) / 3.56;
        double x = Math.sqrt(b);
        System.out.println(x);
    }
}

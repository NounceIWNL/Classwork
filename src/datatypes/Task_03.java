package datatypes;

public class Task_03 {
    public static void main(String[] args) {
        // a - true, b - false , b false
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println(!(a && b));
        System.out.println(a || !b);
        System.out.println(a && b || c);

    }
}

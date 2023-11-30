package datatypes;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x, y;
        System.out.println("1st");
        x = 1; y = x++;
        System.out.println(x + " " + y);
        x = 1; y = ++x;
        System.out.println(x + " " + y);
        x = 1; y = --x;
        System.out.println(x + " " + y);
        x = 1; y = x--;
        System.out.println(x + " " + y);

        System.out.println("2nd");
        x = 1; y = 0; y = ++x+x++;
        System.out.println(x + " " + y);
        x = 1; y = 0; y = --x+x--;
        System.out.println(x + " " + y);
        x = 1; y = 0; y = ++x- --x;
        System.out.println(x + " " + y);
        x = 1; y = 0; y = x++ - x--;
        System.out.println(x + " " + y);
        x = 1; y = 0; y = x-- - --x;
        System.out.println(x + " " + y);
        x = 1; y = 0; y = x++ - ++x;
        System.out.println(x + " " + y);

        System.out.println("3rd");
        x = 1; y = 0; y+=++x;
        System.out.println(x + " " + y);
        x = 4; y = 0; y+=x+++x;
        System.out.println(x + " " + y);
        x = 4; y = 0; y+=--x+x++;
        System.out.println(x + " " + y);
        x = 4; y = 0; y+=++x+ ++x;
        System.out.println(x + " " + y);
    }
}

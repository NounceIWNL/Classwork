package Math_Tasks;

public class PlusMinus {
    public static void main(String[] args) {
        double t = 1.0;
        String answer = t > 0 ? "above zero": "below zero"; // Ternary operator
        System.out.println(answer);
        // дано двухзначное число, равны ли его цифры
        int number = 12;
        System.out.println(number / 10 == number %10 ? true : false);

        //how rook moves
        int x1 = 1, y1 = 1, x2 = 1, y2 = 1;
        System.out.println((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2) ? "can move" : "can't move");

    }
}

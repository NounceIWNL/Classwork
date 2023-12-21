package ArraysNew;
//5. Проверить, содержит ли массив два заданных числа.
public class Practice5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 0, 5};
        int a = 3, b = 2;
        boolean firstWasFound = false;
        boolean secondWasFound = false;

        for (int elem:arr) {
            if (elem == a) {
                firstWasFound = true;
            }
            if (elem == b) {
                secondWasFound = true;
            }
        }
        if (firstWasFound && secondWasFound) System.out.println("Success!");
        else System.out.println("Failure.");

    }
}

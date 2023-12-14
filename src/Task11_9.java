
public class Task11_9 {
    private static final int SIZE = 5;
    static int[] arr = new int[SIZE];



    public static void main(String[] args) {
        fillArithmetic(1, 2);
        print();
    }


    static void fillArithmetic(int a, int p) {
        for (int i = 0; i < SIZE; i++)
            arr[i] = a + p * i;
    }

    static void print() {
        for (int i = 0; i < SIZE; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

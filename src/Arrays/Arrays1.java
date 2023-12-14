package Arrays;


import java.util.Random;

public class Arrays1 {
    //Поля (переменные члены класса)
    private static final int SIZE = 5;
    static int[] arr = new int[SIZE];


//методы
    public static void main(String[] args) {
        //demo();
        fillOrder();
//        fillRandom();
        print();
//        System.out.println(sum());
//        System.out.println(min(true));
//        swap(0, 4);
        reverse();
        print();


    }

    //создание и инициализация
    static void demo(){
        int[] arr0 = {3, 1, 2};
        arr0[0]=4;
        System.out.println(arr0[2]);
        System.out.println(arr0.length);
        int[] arr1 = new int[4];
    }

    static void fillOrder(){
        for (int i = 0; i < SIZE; i++)
            arr[i] = i+1;
    }

    static void print(){
        for (int i = 0; i < SIZE; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    static void fillRevers() {
        for (int i = 0; i < SIZE; i++)
               arr[i] = SIZE - i;
    }
    static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++)
            arr[i] = random.nextInt(90) + 10;
    }

    //нахождение суммы
    static int sum() {
        int sum = 0;
        for (int i = 0; i < SIZE; i++)
          sum+= arr[i];
        return sum;
    }

    static int min() {
        int min = arr[0];
        for (int i = 0; i < SIZE; i++)
            if(min > arr[i]) min = arr[i];
        return min;
    }
    static int min(boolean b){
        int min = arr[0];
        for (int i = 0; i < SIZE; i++)
            if (min>arr[i]) min=arr[i];
        if (b) System.out.println(min);
        return min;
    }

    static void reverse() {
        for (int i = 0; i < SIZE; i++)
            swap(i, SIZE - i - 1);


    }

    static void swap(int i, int j) { //i-1, j-2, temp-3
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

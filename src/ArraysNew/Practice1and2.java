package ArraysNew;

//Дана последовательность целых чисел.
//        1. Проверить, является ли она возрастающей
//        2. Проверить, является ли она неубывающей.
//        3. Найти максимальный из локальных минимумов.
//        4. Проверить, является ли она арифметической прогрессией.
//        5. Проверить, содержит ли массив два заданных числа.
public class Practice1and2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 6};

        boolean flag = true;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= arr[i - 1]) {
                flag = false;
                break;
            }
        System.out.println(flag);
    }
}


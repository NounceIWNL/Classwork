package ArraysNew;

//Дана последовательность целых чисел.
//        1. Проверить, является ли она возрастающей
//        2. Проверить, является ли она неубывающей.
//        3. Найти максимальный из локальных минимумов.
//        4. Проверить, является ли она арифметической прогрессией.
//        5. Проверить, содержит ли массив два заданных числа.
public class Practice3 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 4, 2, 5, 6};
        int max = arr[0];
        for (int elem : arr)
            if (max > elem) max = elem;
//        System.out.println(max);
        //является ли первая точка локальным минимумом
        if (arr[0] < arr[1] && arr[0] > max)
            max = arr[0];
// ялвяется ли последняя точка локальным минимумом
        int n = arr.length;
        if (arr[n - 1] < arr[n - 2] && arr[n - 1] > max)
            max = arr[n - 1];
//проверка остальных локальных минимумов
        for (int i = 1; i < n - 1; i++)
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1] && arr[i] > max)
                max = arr[i];
        System.out.println(max);

    }
}


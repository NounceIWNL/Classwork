package ArraysNew;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Сгенерировать возрастающую последовательность.
//        Сгенерировать последовательность в интервале 1..9 и перемешать ее.
//        Найти общие элементы в двух целочисленных массивах.
//        Удалить повторяющиеся элементы из массива.
//        Найти второй (после максимального) по величине элемент массива.
//        Найти все пары элементов массива, чья сумма равна заданному числу.
//        Дано два массива, элементы которых неупорядочены. Сравнить эти два массива.
//        Найти отсутствующее в массиве число.
//        Переместить все нулевые элементы в конец массива, не изменяя при этом порядок остальных элементов.
//        Вывести самую длинную последовательность чисел в массиве, в которой каждый последующий элемент больше
//        предыдущего на единицу. Исходный массив не отсортирован.
//        Найти мажоритарный элемент массива. Мажоритарным назовем такой элемент, число повторений которого в массиве
//        равно n/2, где n - длина массива.
//        Вывести все элементы-лидеры в массиве. Лидером назовем такой элемент, который больше всех элементов справа от него.
public class Practice {
    public static void main(String[] args) {

        // Сгенерировать возрастающую последовательность.
        /*int n = 10;
        int[] arr = new int[n]; //array with n length
        Random random = new Random();
        arr[0] = random.nextInt(5) + 1; //1..5
        for (int i = 1; i < arr.length; i++)
            arr[i] = arr[i - 1] + random.nextInt(5) + 1;
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.stream(arr).max().orElse(0));

        int max = arr[0];
        for (int elem : arr)
            if (max < elem)
                max = elem;
        System.out.println(max);
    }
}
*/

        //Сгенерировать последовательность в интервале 1..9 и перемешать ее.
        /*int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        System.out.println(Arrays.toString(arr));

        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            swap(arr, random.nextInt(arr.length), random.nextInt(arr.length));
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
} */

        //Удалить повторяющиеся элементы из массива.

        int[] arr = {1, 1, 2, 1, 3, 0, 0};
        int length = 1;
        for (int i = 1; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++)
                if (arr[i] == arr[j]) isUnique = false;
            if (isUnique) length++;
        }
        //Определить длину результирующего массива
        System.out.println(length);
        int[] res = new int[length];

        int index = 1;
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++)
                if (arr[i] == arr[j]) isUnique = false;
            if (isUnique)
                res[index++] = arr[i];
        }

        System.out.println(Arrays.toString(res));
    }
}


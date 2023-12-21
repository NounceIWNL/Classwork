package ArraysNew;

import java.util.Arrays;

//найти положительную подпоследовательность наибольшей длины
//поместить результат в массив
public class Task4_7 {
    public static void main(String[] args) {
        //объявление массива и его инициализация
        int[] arr = {-1, 1, 0, 3, 2, -4, -5, 6, 7, 8};
        int count = 0; //Количество положительных элементов в подпоследовательности
        //Найти все положительные числа
        //for (int elem:arr)
        //    if (elem>0) System.out.println(elem);

        int countMax = 0; //Длина подпоследовательности max length
        int index = 0; //Индекс, которым закончилась подпоследовательность
        //Найдя положительное число, исследовать массив дальше
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                count++;
            if (arr[i] <= 0) {
                if (count > countMax) {
                    countMax = count;
                    index = i - 1;
                }
                count = 0;
            }
            if (i == arr.length - 1)
                if (count > countMax) {
                    countMax = count;
                    index = i;
                }
        }

//System.out.println(count);

        System.out.println(countMax);
        System.out.println(index);

        int[] seq = new int[countMax];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = arr[index - countMax + i + 1];
            System.out.println(Arrays.toString(seq));
        }
    }
}


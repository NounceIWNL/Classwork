package datatypes;
/*
Даны 3 целых числа. Программа выводит результат логических выражений в виде true или false:
1. Первые два числа равны между собой и не равны третьему;
2. Второе или третье число больше первого;
3. Первое не меньше второго, а второе не больше третьего;
4. Все числа разные;
5. Первое - четное, второе - нечетное, третье - отрицательное;
 */

public class Logical_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 3;
        System.out.println((a == b) && (a != c));
        System.out.println((c > a) || (b > a));
        System.out.println((a >= b) && ( b <= c));
        System.out.println((a != b) && ( a != c) && (b != c));
        System.out.println((a % 2 == 0) && (b % 2 == 1) && (c < 0));





    }
}

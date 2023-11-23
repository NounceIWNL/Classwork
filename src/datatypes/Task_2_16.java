package datatypes;
//Дано трехзначное число. Найти число, полученное при перестановке первой и
//        второй цифр заданного числа.

public class Task_2_16 {
    public static void main(String[] args) {
        int number = 123;
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int finalNumber = tens * 100 + hundreds * 10 + ones;
        System.out.println(finalNumber);
    }
}

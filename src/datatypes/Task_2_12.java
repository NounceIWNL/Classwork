package datatypes;
//Дано трехзначное число. Найти:
//а) число единиц в нем;
//б) число десятков в нем;
//в) сумму его цифр;
//г) произведение его цифр.

public class Task_2_12 {
    public static void main(String[] args) {
        int number = 123;
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100;
        int multiplication = ones * tens * hundreds;
        int summary = ones + tens + hundreds;
        System.out.println(multiplication + " and " + summary);
    }
}

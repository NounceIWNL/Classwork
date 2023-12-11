package Cycles;

public class Year2023 {
    public static void main(String[] args) {
        for (int year = 0x1; year <= 0x7; year++) {

            int j = 2 * year;
            int n = year * 256 + j * 16 + year;
            System.out.println(n + " " + Integer.toHexString(n));
        }
    }
}

package Cycles;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Input the name: ");
            name = scanner.nextLine();
        } while (name.isBlank());
        System.out.println("The name is " + name);
        //name.equal("")
        //name.isEmpty
        //name.isBlank




    }
}

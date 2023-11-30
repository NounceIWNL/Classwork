package Math_Tasks;

import java.util.Scanner;

public class WaterCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру воды: ");
        double waterTemperature = scanner.nextDouble();

        if (waterTemperature >= 100)
            System.out.println("Вода находится в газообразном состоянии.");
        else if (waterTemperature < 100 && waterTemperature >= 0)
            System.out.println("Вода находится в жидком состоянии.");
        else if (waterTemperature < 0)
                System.out.println("Вода находится в твердом состоянии.");
        else System.out.println("Введите другое значение.");
        }
    }


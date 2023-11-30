package Math_Tasks;

public class CalendarTwo {
    public static void main(String[] args) {


    int month = 12;
    int day = 0;
    switch (month)    {
        case 1:
            if (day <= 20)
                System.out.println("Козерог");
            else
                System.out.println("Водолей");

            break;

        case 2:
            if (day<=19)
                System.out.println("Водолей");
            else
                System.out.println("Рыба");
            break;

        case 3:
            if (day<=20)
                System.out.println("Рыба");
            else
                System.out.println("Овен");
            break;

        case 4:
            if (day<=20)
                System.out.println("Овен");
            else
                System.out.println("Телец");
            break;

        case 5:
            if (day<=20)
                System.out.println("Телец");
            else
                System.out.println("Близнецы");
            break;

        case 6:
            if (day<=21)
                System.out.println("Близнецы");
            else
                System.out.println("Рак");
            break;

        case 7:
            if (day<=22)
                System.out.println("Рак");
            else
                System.out.println("Лев");
            break;

        case 8:
            if (day<=23)
                System.out.println("Лев");
            else
                System.out.println("Дева");
            break;

        case 9:
            if (day<=23)
                System.out.println("Дева");
            else
                System.out.println("Весы");
            break;

        case 10:
            if (day<=23)
                System.out.println("Весы");
            else
                System.out.println("Скорпион");
            break;

        case 11:
            if (day<=22)
                System.out.println("Скорпион");
            else
                System.out.println("Стрелец");
            break;

        case 12:
            if (day<=21)
                System.out.println("Стрелец");
            else
                System.out.println("Козерок");
            break;

    }
}
}

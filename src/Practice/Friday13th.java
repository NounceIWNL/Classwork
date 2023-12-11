package Practice;

public class Friday13th {
    public static void main(String[] args) {
        /*
Будет ли в 2024 г. пятница, 13-е? Известно, что 1 января - это понедельник.
 */
        int year = 2024;
        int dayOfWeek = 5; //Первая пятница приходится на 5-е января
        int day = 13;
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};

        for (int i = 5; i <= 366; i+= 7) {
            int month = 0;
            int currentDay = i;
            while (currentDay > 0)
                currentDay-=days[month++];
            currentDay+=days[month-1];
            if (currentDay == day)
                System.out.println(month);
        }
    }
}

package Math_Tasks;

public class Calendar {
    public static void main(String[] args) {
        String[] yearsName ={"Крыса","Бык","Тигр","Кролик","Дракон","Змея","Лошадь","Овца","Обезьяна","Петух","Собака","Свинья"};
        int yearStart = 2020;
        int year = 2015;
        int index;
        if (year>=yearStart){
            index = (year-yearStart)%12;
        }
        else {
            index = 12-(yearStart-year)%12;
        }
        System.out.println(yearsName[index]);
    }
}

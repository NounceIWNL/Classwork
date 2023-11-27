package datatypes;
//Записать условие, которое является истинным, когда:
//а) каждое из чисел X и Y нечетное;
//б) только одно из чисел X и Y меньше 20;
//в) хотя бы одно из чисел X и Y равно нулю;
//г) каждое из чисел X, Y, Z отрицательное;
//д) только одно из чисел X, Y и Z кратно пяти;
//е) хотя бы одно из чисел X, Y, Z больше 100


public class Task_3_29 {
    public static void main(String[] args) {
        int x = 1, y = 3;
        boolean b1 = (x %2 == 1) && (y %2 == 1);
        System.out.println(b1);
        boolean b2 = (x < 20) ^ (y < 20);
        boolean b3 = ((x < 20) && !(y < 20) || (y < 20) && !(x < 20));
        System.out.println(b3);
        boolean b4 = (x == 0) && (y == 0);

        System.out.println("Hello\u0020world");
        double a = 1.0;
        if (a%1==0)
            System.out.println("не является дробным");
        else System.out.println("является дробным");

        if (a==Math.round(a))
            System.out.println("не является дробным");
        else System.out.println("является дробным");

        int seconds = 4000;
        int days = seconds/(24*60*60);
        int hours = seconds%(24*60*60)/(60*60);
        int minutes = seconds%(24*60*60)%(60*60)/60;
        int seconds2 = seconds%(24*60*60)%(60*60)%60;
        System.out.println(days+" "+hours+ " "+minutes+" "+seconds2);



    }
}

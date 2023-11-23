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



    }
}

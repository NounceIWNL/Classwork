package Practice;

public class Spree {
    public static void main(String[] args) {
        int fact = 1;
        int n = 5;
        //find 5! = 1 * 2 * 3 * 4 * 5
        double summ = 1;
        double a = 1.;
        for (int i = 0; i < 10; i++){
            a*= (i + 1);
            summ+= 1. / a;
        }
        System.out.println(summ);

//        for (int i = 1; i <= n; i++)
//            fact*= i;
//        System.out.println(fact);

    }
}

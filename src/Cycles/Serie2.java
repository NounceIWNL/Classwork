package Cycles;


public class Serie2 {
    public static void main(String[] args) {


        double sum = 1;
        double a = 1.;
        double eps = 1e-5;
        int i = 0;
        while (a > eps) {
            a /= (i + 1);
            sum += a;
            i++;
        }
        System.out.println(sum);
        System.out.println(Math.exp(1));
    }
}


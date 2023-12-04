package Class04_12_2023;

public class Practice1 {
    public static void main(String[] args) {
        /*
Фишки. Имеется квадратная доска nxn, на крайние поля которой выставлены фишки.
Дано k - количество фишек.
Можно ли разместить все эти фишки, чтобы они заняли все крайние поля доски?
Например, на доску 2x2 можно выставить 4 фишки, а на доску 5x5 - 16.
 */
        int n1 = 7, n2 = n1;
        int k = 20;
        int edgeFields = (n1 + n1) + ((n2 - 2) * 2);
        if (edgeFields == k)
            System.out.println(true);
        else
            System.out.println(false);

        /*
Для трех чисел известна их четность. Определить, будет ли сумма четной.
 */


    }
}

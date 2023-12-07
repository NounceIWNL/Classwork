package Cycles;

import java.util.Random;
import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {

        for (int i = 9; i >= 1 ; i-- )
            System.out.println("Floor number " + i);

        for (int i = 0, j = 0; i <11 ; i++) {
            System.out.println("Floor number " + (i));
            i+=j;
            j++;
        }
        for (int i = 0; i <9 ; i++) {
            if ( i == 4) continue;
            System.out.println("Floor number " + (i + 1));

        }
        for (int i = 0; i <9 ; i++) {
            if ( i == 5) break;
            System.out.println("Floor number " + (i + 1));

        }
        Scanner scanner = new Scanner(System.in);

        Random random = new Random(); //Java Random class vs Math.random()
        for (int i=0; i<9; i++)
            System.out.print((random.nextInt(18) + 3) + " "); //[0; 9)
        for (int i = 0; i < 9; i++) {
            System.out.print("1st: " + (i + 1));
            System.out.println("  2nd: " + (9 - i));

        }
        for (int i = 0, j = 0; i < 9 && j < 9; i++, j+=2){
            System.out.println(i + " " + j);

        }
        for (int i = 0; i < 9; i++, i++) {
            System.out.println(i);
            i-=i;



        }




    }
    }



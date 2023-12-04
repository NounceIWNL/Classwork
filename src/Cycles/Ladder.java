package Cycles;

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

    }
}

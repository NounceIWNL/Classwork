package Practice;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter rook(r), paper(p) or scissors(s)");
            char answer = scanner.nextLine().charAt(0);

        int iAnswer = 0;
        int rand = (int) (Math.random() * 3);
        switch (answer) {
            case 'r':
                iAnswer = 0;
                break;
            case 'p':
                iAnswer = 1;
                break;
            case 's':
                iAnswer = 2;
                break;
        }
            String srand = "";
            switch (rand) {
                case 0:
                    srand = "rook";
                    break;
                case 1:
                    srand = "paper";
                    break;
                case 2:
                    srand = "scissors";
                    break;
            }
            System.out.println("Computer move: " + srand);

            if (iAnswer == rand)
                System.out.println("Draw");
            if (iAnswer == 0 && rand == 1)
                System.out.println("You lost");
            if (iAnswer == 0 && rand == 2)
                System.out.println("You won");
            if (iAnswer == 1 && rand == 0)
                System.out.println("You won");
            if (iAnswer == 1 && rand == 2)
                System.out.println("You lost");
            if (iAnswer == 2 && rand == 0)
                System.out.println("You lost");
            if (iAnswer == 2 && rand == 1)
                System.out.println("You won");
        }
    }
}

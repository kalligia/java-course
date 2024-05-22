package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Bingo app με while .. do
 */
public class NewBingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 30;
        int num = 0;

        while(true) {
            System.out.println("Please insert a num and guess the secret");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo!!!");
                break; //stamata tin ektelesi tou loop
            }
            //kalyteri ylopoiisi prota ta break oste na apofeygo perittous elegxoys!!!!
            System.out.println("Try again"); //efoson iparxei to break de xreiazetai na mpei s else, gt an petixo bingo tha stamatisei to loop etsi k allios

        }

        System.out.println("Thank you for playing the game");
    }
}

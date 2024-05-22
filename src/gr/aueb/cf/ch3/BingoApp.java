package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης μαντεύει ένα μυστικό
 * αριθμό (secret)
 */
public class BingoApp {

    public static void main(String[] args) {
        final int SECRET = 12;
        int num = 0;
        boolean isBingo = false; //flag
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Please insert a num and guess the secret");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo!");
                isBingo = true;
            } else {
                System.out.println("Try again!");
            }
        } while (!isBingo);
    }
}

package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας ακέραιος είναι άρτιος
 * ή περιττός με την χρήση μεθόδων
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;

        System.out.println("Give me a");
        a = in.nextInt();

        System.out.println(isEven(a));
    }

    /**
     * Evaluates if an input is even,
     *
     * @param a   the input int
     * @return    true, if is even, else false
     */
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}

package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n
 * με την χρήση της μεθόδου facto(n)
 * n! = 1*2*3*...*n
 */

public class FactorialPowApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int a = 2;
        int b = 10;

        System.out.println("Give me n");
        n = in.nextInt();

        System.out.println(facto(n));
        System.out.println(pow(a,b));

    }

    /**
     * Iterative version of n!
     * @param n  the input number n
     * @return   the factorial of n
     */

    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Power a^b
     * @param a    the base
     * @param b    the power
     * @return     the power of a^b
     */

    public static int pow(int a, int b) {
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}

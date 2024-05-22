package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογίζει το παραγοντικό του n
 * δηλαδή n! = 1*2*3*...*n
 */

public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 1;
        int result = 1;

        System.out.println("Give me n");
        n = in.nextInt();

        while (i <= n) {
            result *= n;
            i++;
        }

        System.out.println("Result is " + result);
    }
}

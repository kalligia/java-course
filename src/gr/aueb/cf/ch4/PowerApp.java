package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογίζει το a^b.
 */
public class PowerApp {

    public static void main(String[] args) {
        int a = 0;
        int b  =0;
        int result = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Give me a, b");
        a = in.nextInt();
        b = in.nextInt();

        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(result);
    }
}

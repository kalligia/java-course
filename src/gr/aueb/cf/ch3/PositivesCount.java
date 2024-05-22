package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * μετράει τους θετικους αριθμούς που δίνει ο χρήστης
 * μέχρι να δώσει αρνητικό
 */
public class PositivesCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int count = 0;

        System.out.println("Give me a number");
      //  n = in.nextInt();

        while ((n = in.nextInt()) >= 0) {
            count++;
            System.out.println("Give me a number");
            n = in.nextInt();
        }
        System.out.println(count);
    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επιλέγει τον μικρότερο / μεγαλύτερο ακέραιο
 * μεταξύ δύο ακεραίων που εισάγει ο χρήστης
 */

public class MinMaxApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int min = 0;
        int max = 0;
        boolean equal = false;

        System.out.println("Give me num1, num2");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 > num2) {
            min = num2;
            max = num1;
        } else if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            System.out.println("Numbers ase equal");
            equal = true;
        }

        if (!equal) {
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }
}

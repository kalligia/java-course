package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εισάγει ο χρήστης έναν ακέραιο και
 * εκτυπώνει το απόλυτό του.
 */
public class AbsoluteApp {
    public static void main(String[] args) {

        int num = 0;
        int abs = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Insert a num");
        num = in.nextInt();

        abs = (num >= 0) ? num : -num;
        System.out.println("Absolute: " +abs);
    }
}

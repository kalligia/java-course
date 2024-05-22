package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν ένα έτος είναι δίσεκτο
 */
public class YearsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Give me a year");
        year = in.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
            System.out.println("Year is leap");
        } else {
            System.out.println("Year is not leap");
        }
    }
}

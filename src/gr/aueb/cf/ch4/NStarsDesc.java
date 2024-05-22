package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει από το n έως το 1 *
 */
public class NStarsDesc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me n");
        int n = in.nextInt();

        for (int i = 1 ; i <= n; i++ ) {
            for (int j = i; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
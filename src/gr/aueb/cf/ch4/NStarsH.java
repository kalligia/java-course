package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει n οριζόντια *
 */
public class NStarsH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me n");
        int n = in.nextInt();

        for (int i = 1 ; i <= n; i++ ) {
            System.out.print("*");
        }

    }
}

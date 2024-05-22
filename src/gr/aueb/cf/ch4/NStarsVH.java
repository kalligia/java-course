package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει n καθετα και οριζόντια *
 */
public class NStarsVH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me n");
        int n = in.nextInt();

        for (int i = 1 ; i <= n; i++ ) {
            for (int j =1; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
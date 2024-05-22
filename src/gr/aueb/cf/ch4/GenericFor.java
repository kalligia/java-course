package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Generic for.
 */
public class GenericFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iteration = 0;

        System.out.println("Give me start value, end value, step");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i =i + step) {
            iteration++;
            System.out.println("i = " + i + " ");
        }
        System.out.println("Iterations: " + iteration);
    }
}

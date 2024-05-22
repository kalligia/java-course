package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Συνεχίζει το διαβασμα μέχρι να δοθεί
 * μία ειδικη τιμη (sentinel) έστω -1
 *
 */
public class SentinelApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int iterations = 0;

        System.out.println("Give me a number");
        //  n = in.nextInt();

        while ((n = in.nextInt()) != -1) {
            iterations++;
            System.out.println("Give me a number");
            n = in.nextInt();
        }
        System.out.println(iterations);
    }
}

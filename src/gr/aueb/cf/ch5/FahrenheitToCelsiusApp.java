package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * μετατρέπει βαθμούς fahrenheit το κελσίου
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        for (int i = -100; i <= 100; i+=10) {
            System.out.printf("%4d\u2109\t=\t%6.2f\u2103\n", i, getCFromF(i) );
        }


    }

    /**
     * Μετατρέπει βαθμούς φαρενάιτ σε κελσίου
     * @param FDegrees   η είσοδος
     * @return
     */
    public static double getCFromF(double FDegrees) {
        return (FDegrees - 32) * 5 / 9;
    }
}

package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingArithmException {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Insert num and denom");
        numerator = in.nextInt();
        denominator = in.nextInt();

        if (denominator == 0) {
            System.out.println("Error- denom cannot be zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.println(result);
        System.out.println("Thanks for using the app");
    }
}

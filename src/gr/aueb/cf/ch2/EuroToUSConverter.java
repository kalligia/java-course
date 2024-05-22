package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη έναν ακέραιο π συμβολίζει 'ένα ποσό σε ευρω
 * και το μετατρέπει με βάση κάποια ισοτιμία σε USD και US cents
 */
public class EuroToUSConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int euros = 0;
        int dollars = 0;
        int totalCents = 0;
        int remainingCents = 0;
        final int US_PARITY = 99; //orizo stathera, giati 1 euro = 99 cents dol.
        //tin isotimia protimo na tin oriso me stathera k oxi karfota ston kodika

        System.out.println("Please insert the amount in euro");
        euros = input.nextInt();

        totalCents = euros * US_PARITY;
        dollars = totalCents / 100;
        remainingCents = totalCents % 100;

        System.out.printf("%,d euros = %,d total cents = %,d dollars and %,d cents ",
                euros, totalCents, dollars, remainingCents );

    }
}

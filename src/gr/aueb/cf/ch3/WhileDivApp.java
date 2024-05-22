package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει 2 ακεραίους μέχρι
 * ο αριθμητης να είναι μηδέν.
 * Το πρόγραμμα ελέγχει αν ο παρονομαστής είναι 0
 * κ αν είναι, δίνει στο χρήστη τη δυνατότητα να συνεχίσει
 * δίνοντας παρονομαστη διάφορο του 0
 */
public class WhileDivApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while(true) {
            System.out.println("Insert two integers for division");
            numerator = in.nextInt();
            denominator = in.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero");
                break;
            }

            if (denominator == 0) {
                System.out.println("Denominator should not be zero");
                continue; //i continue synexizei to iteration xoris na ektelesei o,ti vrisketai apo kato tis, to xekinaei ap tin arxi
            }

            result = numerator/denominator;
            System.out.println(result);
        }
        System.out.println("Thanks for using our app");
    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μία απλή διαίρεση. Διαίρεση με 0 απαγορεύεται
 * στους ακεραίους της Java. Δίνει error.
 *
 * SOS για ποιότητα κώδικα!!! προσπαθω να κανω τα προγραμματα linear. Ta σφαλματα τα ελεγχω
 * ψηλα στον κωδικα για να τελειωνω με αυτα και να σταματα το προγραμμα αν σφάλμα.
 * Ο κωδικας οσο γινεται γραμμικος και να αποφεγω διακλαδωσεισ οπωσ if/else
 *
 * Ελεγχω τα error conditions στην αρχή του κωδικα με if όσο το δυνατόν περισσοτερο!
 * Αν υπάρχει κάποιο σφάλμα σταματω εκτελεση κωδικα, αλλιβσ συνεχίζει κανονικά. Έτσι ο
 * κώδικασ είναι πιο απλός και γραμμικός. Σωστο τα λάθη να τα ελέγχω ένα-ένα και να δινω
 * το αναλογο μνμ.
 *
 * exit px me break or system.exit()
 */
public class DivApp {

    public static void main(String[] args) {
        int numerator = 0; //arithmitis
        int denominator = 0; //paronomastis
        int result = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert numerator, denominator");
        numerator = in.nextInt();
        denominator = in.nextInt();

        //Error conditions
        if (numerator == 0) {
            System.out.println("Error. Denominator cannot be zero");
            System.exit(1);
        }
        if (denominator == 0) {
            System.out.println("Error. Denominator cannot be zero");
            System.exit(1);
        }

        result = numerator/denominator;
        System.out.println("Result: " + result);
    }
}

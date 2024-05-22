package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενου επιλογων με do/while.
 * Η do/while εκτελείται οπωσδήποτε μία φορά.
 * Εδώ το μενού θελω να εμφανιστεί σίγουρα μία φορά
 */
public class MenuApp {
    public static void main(String[] args) {

        int choice = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω: (0 για έξοδο)");
            System.out.println("1. Εισαγωγή (insert) προϊόντος");
            System.out.println("2. Ενημέρωση (update) προϊόντος");
            System.out.println("3. Διαγραφή (delete) προϊόντος");
            System.out.println("4. Αναζήτηση (select) προϊόντος");
            choice = in.nextInt();
        } while (choice != 0);
    }

}

package gr.aueb.cf.ch3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NewMenuApp {
    public static void main(String[] args) {
        int choice = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            System.out.println("Δώστε επιλογή");
            choice = in.nextInt();

            if (choice <= 0 || choice > 5) {
                System.out.println("Παρακαλώ επιλέξτε από 1 έως 5");
            } else if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            }
        }
        while (choice != 5);
        System.out.println("Έξοδος");
    }

}
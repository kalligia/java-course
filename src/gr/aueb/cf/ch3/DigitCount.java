package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου
 * με do/while. Πχ αν ο χρήστης δώσει 259, τότε
 * το πλήθος των ψηφίων είναι 3. (count)
 * Επίσης μετρά το άθροισμα των ψηφίων του (digit, sumOfDigits)
 */

public class DigitCount {
    public static void main(String[] args) {
        int num = 0;
        int copyOfNum = 0; //επειδή στην πορεία το num θα αλλάξει κ θα το χάσω
        int count = 0;
        int sumOfDigits = 0;
        int digit = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an int");
        num = in.nextInt();
        copyOfNum = num;

        do {
            count++;
            digit = copyOfNum % 10; //κρατώ το τελευταίο ψηφίο για να το βάλω στην πρόσθεση
            sumOfDigits += digit;
            copyOfNum = copyOfNum / 10; //με την ακέραια διαίρεση αφαιρώ το τελευταίο ψηφίο
        } while (copyOfNum != 0);

        System.out.println(sumOfDigits);
        System.out.println(count);
    }
}

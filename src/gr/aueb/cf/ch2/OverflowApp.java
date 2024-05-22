package gr.aueb.cf.ch2;

/**
 * Ελέγχει την υπερχείληση στην περίπτωση
 * που συμβεί
 */
public class OverflowApp {

    public static void main(String[] args) {
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        result = num1 + num2;

        System.out.println("Το αποτέλεσμα είναι " + result);
    }
}

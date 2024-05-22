package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίουσ από το standard input (stdin)
 * τους προσθέτει και εκτυπώνει το αποτέλεσμα
 */
public class ScannerAddApp {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num1= 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please insert two integers");
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        sum = num1 + num2;

        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
}

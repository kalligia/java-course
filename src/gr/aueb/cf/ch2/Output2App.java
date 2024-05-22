package gr.aueb.cf.ch2;

/**
 * Template for programming
 * Πολλαπλασιάζει δυο ακεραίουσ και εκτυπωνει
 * το αποτέλεσμα στην κονσόλα
 */

public class Output2App {

    public static void main(String[] args) {

        int price = 100;
        int quantity = 500;
        int totalPrice = 0;

        totalPrice = price * quantity;

        System.out.printf("Price: %3d, Quantity: %d, Total Price: %,d\n", price, quantity, totalPrice);



    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει true/false
 * από το st in για δυο δεξαμενές. Αν και οι δυο έχουν καυσιμα <1/4
 * τότε  ανάβει κόκκινη ένδειξη. Αν η μία από τις δυο έχει <1/4 τότε
 * ανάβει πορτοκαλί ένδειξη.  ----XOR----
 */

public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Enter if tank1 is less than 1/4");
        isEmptyTank1 = in.nextBoolean();

        System.out.println("Enter if tank2 is less than 1/4");
        isEmptyTank2 = in.nextBoolean();

        isOrange = isEmptyTank2 ^ isEmptyTank1; //XOR.....PROSOXI!!! edo an kai ta dyo itan <1/4 tha m evgaine T! G auto vazo XOR
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("One tank is less than 1/4: " + isOrange);
        System.out.println("Both tanks are less than 1/4: " + isRed);
    }
}

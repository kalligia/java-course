package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν βρέχει
 * και ταυτόχρονα είτε είναι σκοτάδι ή τρέχουμε
 * με ταχύτητα υψηλή. Ο χρήστης εισαγει τα τρία
 * παραπάνω στοιχεία και το πρόγραμμα εκτυπώνει
 * αν τα φώτα ανάβουν ή οχι.
 */

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int speed = 0;
        boolean isDark = false;
        boolean isRaining = false;
        boolean isRunning = false;
        final int MAX_SPEED = 100;
        boolean lightsOn = false;

        System.out.println("Give me Speed");
        speed = in.nextInt();
        isRunning = speed >= MAX_SPEED;

        System.out.println("Is it dark?");
        isDark= in.nextBoolean();

        System.out.println("Is it raining?");
        isRaining = in.nextBoolean();

        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on: " + lightsOn);

    }
}

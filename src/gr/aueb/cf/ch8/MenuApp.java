package gr.aueb.cf.ch8;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getChoice();
            try {
                printChoice(choice);
                if (choice == 5) System.exit(1);
            } catch (IllegalArgumentException e) {
                System.out.println("Please select between 1 and 5.");
            }
        }
    }

    public static void printMenu() {
            System.out.println("1. ...");
            System.out.println("2. ...");
            System.out.println("3. ...");
            System.out.println("4. ...");
            System.out.println("5. Exit");
    }

    public static int getChoice() {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Give me a choice.");

        if (in.hasNextInt()) {
            choice = in.nextInt();
        } else {
            System.out.println("Please insert an integer.");
            in.nextLine();
        }
        return choice;
    }

    public static void printChoice(int choice) throws IllegalArgumentException {
        if (choice >0 && choice < 6 ) {
            System.out.println("Your choice is: " + choice);
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}

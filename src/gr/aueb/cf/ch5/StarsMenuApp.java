package gr.aueb.cf.ch5;

import java.util.Scanner;

public class StarsMenuApp {

    public static void main(String[] args) {
        int choice = 0;
        int stars = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 - n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n - 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
            System.out.println("Δώσε επιλογή: ");

            choice = in.nextInt();

            if (choice < 6) {
            System.out.println("Δώσε αριθμό για αστεράκια: ");
            stars = in.nextInt(); }

            switch (choice) {
                case 1:
                    showHorizontal(stars);
                    break;
                case 2:
                    showVertical(stars);
                    break;
                case 3:
                    showVH(stars);
                    break;
                case 4:
                    showAsc(stars);
                    break;
                case 5:
                    showDesc(stars);
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Δώσε έγκυρο αριθμό.");
            }
        }
        while (choice != 6);
    }

    public static void showHorizontal(int a){
        for (int i = 1; i <= a; i++) {
            System.out.print("*"); }
    }

    public static  void showVertical(int a){
        for (int i = 1; i <= a; i++) {
            System.out.println("*");
        }
    }

    public static void showVH(int a) {
        for (int i = 1; i <= a; i++) {
            showHorizontal(a);
            System.out.println("");
        }
    }

    public static void showAsc(int a) {
        for (int i = 1; i <= a; i++) {
            showHorizontal(i);
            System.out.println("");
        }
    }

    public static void showDesc(int a) {
        for (int i = a; i >= 1; i--) {
            showHorizontal(i);
            System.out.println("");
        }
    }
}

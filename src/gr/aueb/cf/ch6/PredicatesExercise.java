package gr.aueb.cf.ch6;

import java.util.Scanner;

public class PredicatesExercise {

    public static void main(String[] args) {

        while (true) {
            int[] numbers = getNumbers();

            if (!checkNumbers(numbers)) {
                System.out.println("Ένας ή περισσότεροι αριθμοί που εισάγατε είναι εκτός ορίων.\n");
                continue;
            }
            System.out.println("Έχει λιγότερους από 3 άρτιους: " + hasLessThanThreeEvens(numbers));
            System.out.println("Έχει λιγότερους από 3 περιττούς: " + hasLessThanThreeOdds(numbers));
            System.out.println("Έχει λιγότερους από 3 συνεχόμενους: " + hasLessThanThreeCont(numbers));
            System.out.println("Έχει λιγότερους από 3 αριθμούς με τον ίδιο λήγοντα: " + hasLTThreeSameEndings(numbers));
            System.out.println("Έχει λιγότερους από 3 αριθμούς στην ίδια δεκάδα: " + hasLTThreeInTheSameGroupOfTen(numbers));}
    }

    /**
     * Παίρνει τους αριθμούς από τον χρήστη.
     * @return
     */
    public static int[] getNumbers() {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.println("Εισάγετε 6 ακέραιους αριθμούς από το 1 έως το 49");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        return numbers;
    }

    /**
     * Ελέγχει αν είναι μεταξύ 1 και 49.
     * @param arr
     * @return
     */
    public static boolean checkNumbers(int[]arr) {
        boolean cont = true;

        for (int item : arr) {
            if (item < 1 || item > 49) {
                cont = false;
                break;
            }
        }
        return cont;
    }

    /**
     * Ελέγχει αν έχει λιγότερους από 3 άρτιους.
     * @param arr
     * @return
     */
    public static boolean hasLessThanThreeEvens(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) count++;
        }
        return count < 3;
    }

    /**
     * Ελέγχει αν έχει λιγότερους από 3 περιττούς.
     * @param arr
     * @return
     */
    public static boolean hasLessThanThreeOdds(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) count++;
        }
        return count < 3;
    }

    /**
     * Ελέγχει αν έχει λιγότερους από 3 συνεχόμενους.
     * @param arr
     * @return
     */
    public static boolean hasLessThanThreeCont(int[]arr) {
        int count = 0;

        for (int i = 0; i < arr.length-2; i++) {
            if ((arr[i] == arr[i+1]-1) && (arr[i] == arr[i+2]-2 )) count++;
        }
        return count < 3 ;
    }

    /**
     * Ελέγχει αν έχει λιγότερους από 3 με τον ίδιο λήγοντα.
     * @param arr
     * @return
     */
    public static boolean hasLTThreeSameEndings(int[] arr) {
        int count = 0;
        int[] endings = new int[arr.length];
        boolean hasSameEndings = false;

        for (int i = 0; i < arr.length; i++) {
            endings[i] = arr[i] % 10;
        }

        for (int item : endings) {
            if (item < 3) {
                hasSameEndings = true;
                break;
            }
        }
        return hasSameEndings;
    }

    /**
     * Ελέγχει αν έχει λιγότερους από 3 αριθμούς στην ίδια δεκάδα.
     * @param arr
     * @return
     */
    public static boolean hasLTThreeInTheSameGroupOfTen(int[]arr) {
        int count = 0;
        int[] tens = new int[arr.length];
        boolean sameGroup = false;

        for (int i = 0; i < arr.length; i++) {
            tens[i] = arr[i] / 10;
        }

        for (int item : tens) {
            if (item < 3) {
                sameGroup = true;
                break;
            }
        }
        return sameGroup;
    }
}

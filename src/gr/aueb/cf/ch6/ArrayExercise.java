package gr.aueb.cf.ch6;

public class ArrayExercise {


    public static void main(String[] args) {
        int[] arr = {5, 90, 58, 2, 4, 63, 8};
        checkArr(arr);

        if (findItem(arr) == -1) {
            System.out.println("Item not found");
        }
        else {
            System.out.printf("Item found in position: %d \n", findItem(arr)+1);
        }

        filterEven(arr);
        System.out.println();

        traverse(getDouble(arr));
        System.out.println();

        if (thereIsPositive(arr)) {
            System.out.println("There is at least one positive");
        }
        else {
            System.out.println("There are not any positives in the array");
        }

        if (areAllPositive(arr)) {
            System.out.println("All numbers positive");
        }
        else {
            System.out.println("There are negatives in the array");
        }
    }

    public static void checkArr(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("O πίνακας είναι κενός");
            System.exit(1);
        }
    }

    /**
     * Αναζήτηση στοιχείου στον πίνακα.
     * @param arr
     * @return
     */
    public static int findItem (int[] arr) {
        int item = 90;
        int position = -1;

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == item) {
                position = i;
                break;
            }
        }
        return position;
    }

    /**
     * Φιλτράρει τους ζυγούς του πινακα.
     * @param arr
     */
    public static void filterEven(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) count++;
        }

        int[] evenArr = new int[count];
        count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                evenArr[count] = item;
                count++;
            }
        }
        traverse(evenArr);
    }

    /**
     * Εκτυπώνει τα στοιχεία του πίνακα.
     * @param arr
     */
    public static void traverse(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    /**
     * Αντικαθιστά κάθε στοιχείο του πίνακα με το διπλάσιο.
     * @param arr
     * @return
     */
    public static int[] getDouble(int[] arr) {
        int[] doubleArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            doubleArr[i] = arr[i] * 2;
        }
        return doubleArr;
    }

    /**
     * Ελέγχει αν υπάρχει τουλάχιστον ένας θετικός αριθμός.
     * @param arr
     * @return
     */
    public static boolean thereIsPositive(int[] arr) {
        boolean positive = false;

        for (int item : arr) {
            if (item > 0) {
                positive = true;
                break;
            }
        }
        return positive;
    }

    /**
     * Ελέγχει αν είναι όλα τα στοιχεία θετικά.
     * @param arr
     * @return
     */
    public static boolean areAllPositive(int[] arr) {
        boolean positive = false;
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }
}

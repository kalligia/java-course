package gr.aueb.cf.ch6;

/**
 * Εύρεση του δεύτερου μικρότερου στοιχείου ενός πίνακα.
 */
public class SecondMinApp {
    public static void main(String[] args) {
        int[] arr = {10, 2, 30, 5, 105, -9, -100, 0};
      //  int[] arr = {10};
        checkArr(arr);
        swap(arr, findMin(arr));
        System.out.println("Το δεύτερο μικρότερο στοιχείο είναι ο αριθμός: " + findSecondMin(arr));
    }

    public static void checkArr (int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            System.out.println("Ο πίνακας πρέπει να έχει τουλάχιστον δύο στοιχεία.");
            System.exit(1);
        }
    }

    /**
     * Βρίσκει το μικρότερο στοιχείο.
     * @param arr
     * @return
     */
    public static int findMin (int[] arr) {
        int min = arr[0];
        int minPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPos = i;
            }
        }
        return minPos;
    }

    /**
     * Τοποθετεί το μικρότερο στοιχείο στην θέση [0] του πινακα.
     * @param arr
     * @param minPos
     */
    public static void swap(int[] arr, int minPos) {
        int tmp = arr[0];
        arr[0] = arr[minPos];
        arr[minPos] = tmp;
    }

    /**
     * Βρίσκει το μικρότερο στοιχείο του πίνακα ξεκινώντας από την θέση [1].
     * @param arr
     * @return
     */
    public static int findSecondMin (int[] arr) {
        int secMin = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < secMin) {
                secMin = arr[i];
            }
        }
        return secMin;
    }
}


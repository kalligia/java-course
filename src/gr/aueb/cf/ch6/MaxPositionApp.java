package gr.aueb.cf.ch6;

/**
 * Εύρεση του μέγιστου ενός πίνακα
 */
public class MaxPositionApp {

    public static void main(String[] args) {
        int[] arr = {10, 2, 30, 5, 105, 1305};
        int n = arr.length;
        System.out.printf("Max is found at position: %d " , getMaxPosition(arr, 0, n - 1)+1);
    }

    /**
     * Γενική μέθοδος εύρεσης του μέγιστου ενός πίνακα.
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int position = low;
        int max = arr[low];

        for (int i = low; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                position = i;
            }
        }
        return position;
    }
}




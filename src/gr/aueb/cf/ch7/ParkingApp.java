package gr.aueb.cf.ch7;

public class ParkingApp {

    public static void main(String[] args) {
        int[][] arr= {{1012, 1136}, {1317,1417},{1015,1020},{1327,1400}, {1013,1130}};
        int newArr[][] = insertArrivalDep(arr);
        traverse(newArr);
        System.out.println(" ");
        selectionSort(newArr);
        traverse(newArr);
    }

    /**
     * Δημιουργεί έναν νέο πίνακα με βάση τον αρχικό, με τις ώρες άφιξης/ αναχώρησης
     * και αντίστοιχα στη δεύτερη στήλη το 1/0. Στο πρώτο loop εισάγονται οι αφίξεις
     * και στο δευτερο οι αναχωρήσεις.
     *
     * @param arr
     * @return
     */
    public static int[][] insertArrivalDep(int[][] arr) {
        int[][] newArr = new int[arr.length*2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //αφιξη
                newArr[i][0] = arr[i][0];
                newArr[i][j] = 1;
            }
        }

        int q = 0;
        for (int i = arr.length ; i < (arr.length *2); i++) {
           // int q = 0;
            for (int j = 0; j < arr[q].length ; j++) {
                //αναχωρηση
                newArr[i][0] = arr[q][j];
                newArr[i][j] = 0;
            } q++;
        }
        return newArr;
    }

    /**
     * Ταξινομεί τον νέο πίνακα με βάση τη στήλη της ώρας.
     *
     * @param arr
     */
    public static void selectionSort(int[][] arr) {
        if (arr == null) return;
        int min;
        int minPosition;

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            min = arr[i][0];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][0] < min) {
                    min = arr[j][0];
                    minPosition = j;
                }
            }
            swap(arr, i, minPosition);
        }
    }

    /**
     * Χρησιμποιείται στη μέθοδο της ταξινόμησης.
     * @param arr
     * @param i
     * @param j
     */
    public static void swap (int[][] arr, int i, int j) {
        int tmp = arr[i][0];
        int tmp2 = arr[i][1];
        arr[i][0] = arr[j][0];
        arr[i][1] = arr[j][1];
        arr[j][0] = tmp;
        arr[j][1] = tmp2;
    }

    public static void traverse (int[][]arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

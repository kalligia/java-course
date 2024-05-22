package gr.aueb.cf.ch6;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,6,6,2,22,10,88,3};
        //selectionSort(arr);
        Arrays.sort(arr);
        traverseArray(arr);
    }

    /**
     * Sorting based on selection sort.
     * Time-complexity: 0(n^2)
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        if (arr == null) return;
        int min;
        int minPosition;

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }
            swap(arr, i, minPosition);
        }
    }

    public static void swap (int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void traverseArray(int[] arr){
        for (int element : arr) {
            System.out.println(element + " ");
        }
    }
}

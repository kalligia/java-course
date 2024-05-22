package gr.aueb.cf.ch6;

/**
 * Arrays demo.
 * Populate = insert initial values
 */

public class PopulateArray {

    public static void main(String[] args) {

        int[] arr = new int[5];

        //Populate
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 60;
        arr[4] = 30;

        //Unsized Initialization
        int[] arr2 = {1 ,2, 3, 4, 5, 6, 7};
        System.out.println(arr2[0]);
        System.out.println(arr2[6]);

        //Array Initializer
        int[] arr3 = new int[] {1, 3, 5, 7};
    }
}
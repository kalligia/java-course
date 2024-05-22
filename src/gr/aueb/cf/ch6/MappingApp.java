package gr.aueb.cf.ch6;

public class MappingApp {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] mappedArray = mapDouble(arr);
        traverse(mappedArray);
    }

    /**
     * Double the value of each item of the array.
     *
     * @param arr
     * @return
     */
    public static int[] mapDouble(int[] arr) {
        int[] returnedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            returnedArray[i] = arr[i] * 2;
        }
        return returnedArray;
    }

    public static void traverse(int[] arr){
        for (int element : arr) {
            System.out.println(element + " ");
        }
    }
}

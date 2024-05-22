package gr.aueb.cf.ch6;

public class MinArray {

    public static void main(String[] args) {

        int[] arr = {18,5,8,6,20,82,1,999};
        int minPosition;

        minPosition = findMin(arr);
        System.out.println(minPosition);
        System.out.println(arr[minPosition]);
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minPos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPos = i;
            }
        }
        return minPos;
    }
}

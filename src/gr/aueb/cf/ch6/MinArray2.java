package gr.aueb.cf.ch6;

public class MinArray2 {

    public static void main(String[] args) {
        int[] arr = {18,5,8,6,20,82,1,999};
        int minPosition;

        minPosition = getMinPosition(arr);
        System.out.println(minPosition);
        System.out.println(arr[minPosition]);

    }
    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int minPos = 0;
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPos = i;
            }
        }
        return minPos;
    }
}

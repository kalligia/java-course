package gr.aueb.cf.ch7;

import java.util.Scanner;

public class LowAndHighApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 0;
        int[] arr = {0,1,4,4,4,6,7,8,8,8,8,8};
        int[] positions = new int[2];

        System.out.println("Give me key");
        key = in.nextInt();

        positions = getLowAndHighIndexOf(arr,key);

        for (int i = 0; i < positions.length; i++) {
            System.out.println(positions[i]);
        }
    }

    public static int[] getLowAndHighIndexOf(int[]arr, int key) {
        int lowPos = 0;
        int count = 0;
        int[] pos = new int[2];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                pos[0] = i;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) count++;
                    pos[1] = pos[0] + count;
                }
                break;
            }
        }
        return pos;
    }
}

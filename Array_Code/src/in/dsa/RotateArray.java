package in.dsa;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2;

        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}


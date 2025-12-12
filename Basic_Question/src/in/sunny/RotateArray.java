package in.sunny;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int first = arr[0];
		int second = arr[1];
		for (int k = 0; k < arr.length - 2; k++) {
			arr[k] = arr[k + 2];
		}
		arr[arr.length - 1] = first;
		arr[arr.length - 2] = second;
		System.out.println(Arrays.toString(arr));
	}

}

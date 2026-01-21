package in.sort.striver;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 14, 9, 15, 12, 6, 8, 13 };
		int[] sort = sort(arr);
		System.out.println(Arrays.toString(sort));
	}

	public static int[] sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}

		return arr;
	}

}

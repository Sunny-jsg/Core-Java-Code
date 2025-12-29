package in.sa;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 5, 4 };
		int[] sort = sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int smallestIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[smallestIndex]) {
					smallestIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = temp;
		}
		return arr;
	}

}

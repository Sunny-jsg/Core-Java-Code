package in.sort;

import java.util.Arrays;

public class B_Sort {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 3, 5 };
		int[] sort = sort(arr);
		System.out.println(Arrays.toString(sort));
	}

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

}

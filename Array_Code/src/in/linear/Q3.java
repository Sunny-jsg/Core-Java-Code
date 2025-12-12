package in.linear;

import java.util.Arrays;

public class Q3 {
	public static void main(String[] args) {
		int[][] arr = { { 12, 26, 54, 23, 98 }, { 74, 43, 76, 18, 96 }, { 30, 65, 87, 32, 12 } };
		int target = 87;
		int[] ans = search(arr, target);

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(ans));
	}

	static int[] search(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}

		}
		return new int[] { -1, -1 };
	}
}

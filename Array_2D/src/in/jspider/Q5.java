package in.jspider;

import java.util.Arrays;

public class Q5 {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = new int[arr1.length][arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr2[j][i] = arr1[i][j];
			}
		}
		for (int[] temp : arr2) {
			System.out.println(Arrays.toString(temp));
		}

	}

}

package in.jspider;

import java.util.Arrays;

public class Q9 {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] order = {0, 2, 1}; // required row order

        for (int i : order) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

	}
	}



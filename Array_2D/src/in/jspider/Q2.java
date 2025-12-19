package in.jspider;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row Value ::");
		int row = sc.nextInt();
		System.out.println("Enter Col Value ::");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for (int a = 0; a < arr.length; a++) {
			System.out.println("Enter row value " + a + " index");
			for (int b = 0; b < arr[a].length; b++) {
				arr[a][b] = sc.nextInt();
			}

		}
		for (int[] temp : arr) {
			for (int n : temp) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}

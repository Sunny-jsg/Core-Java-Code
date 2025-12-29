package in.sa;

public class Pascal {
	public static void main(String[] args) {
		int size = 5;
		int[][] pascal = pascal(size);
		for (int i = 0; i < pascal.length; i++) {

			// Print spaces for center alignment
			for (int space = 0; space < size - i - 1; space++) {
				System.out.print(" ");
			}

			// Print numbers
			for (int j = 0; j < pascal[i].length; j++) {
				System.out.print(pascal[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] pascal(int size) {
		int[][] a = new int[size][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
			for (int j = 0; j < a[i].length; j++) {
				if (j == 0 || i == j) {
					a[i][j] = 1;
				} else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
				}
			}
		}

		return a;

	}

}

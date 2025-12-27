package in.jspider;

public class Q11 {
	public static void main(String[] args) {
		int[][] a = { { 5, 6 }, { 7, 8 } };
		int[][] b = { { 1, 2 }, { 3, 4 } };

		int[][] add = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				add[i][j] = a[i][j] * b[i][j];
			}
		}
		for (int[] row : add) {
			for (int x : row)
				System.out.print(x + " ");
			System.out.println();
		}

	}

}

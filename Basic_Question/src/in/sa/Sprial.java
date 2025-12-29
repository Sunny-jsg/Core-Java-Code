package in.sa;

public class Sprial {
	public static void main(String[] args) {
		int size = 5;
		int[][] arr = sprial(size);
		for (int[] n : arr) {
			for (int j : n) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] sprial(int size) {
		int[][] a = new int[size][size];
		int r = 0, c = -1;
		char dir = 'r';
		for (int i = 1; i <= size * size; i++) {
			switch (dir) {
			case 'r':
				a[r][++c] = i;
				if (c == size - 1 - r)
					dir = 'd';
				break;
			case 'd':
				a[++r][c] = i;
				if (c == r)
					dir = 'l';
				break;
			case 'l':
				a[r][--c] = i;
				if (c == size - 1 - r)
					dir = 'u';
				break;
			case 'u':
				a[--r][c] = i;
				if (r == c + 1)
					dir = 'r';
			}
		}
		return a;
	}

}
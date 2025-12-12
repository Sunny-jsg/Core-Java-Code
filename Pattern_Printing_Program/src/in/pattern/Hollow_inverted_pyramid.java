package in.pattern;

public class Hollow_inverted_pyramid {
	public static void main(String[] args) {
		int row = 5;
		for (int i = row; i >= 1; i--) {
			for (int k = row; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1  || j == (2 * i - 1 )|| i == row) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}

	}

}

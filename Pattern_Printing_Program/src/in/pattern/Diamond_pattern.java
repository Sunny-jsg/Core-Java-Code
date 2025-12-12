package in.pattern;

public class Diamond_pattern {
	public static void main(String[] args) {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = i; j < row; j++) { 
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || k == (2 * i - 1) || i == row) {
					System.out.print("*");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for (int i = row-1; i >= 1; i--) {
			for (int k = row; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1  || j == (2 * i - 1)) {
					System.out.print("*");

				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
	}

}
}

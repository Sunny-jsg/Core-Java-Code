package in.pattern;

public class Sandglass {
	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print("*");
			}
			for (int l = i; l >= 1; l--) {
				System.out.print("*");
			}
			for (int m = 5; m > i; m--) {
				System.out.print(" ");
			}
			System.out.println();

		}
		for (int n = 1; n <= 5; n++) {
			for (int o = 5; o > n; o--) {
				System.out.print(" ");
			}
			for (int p = n; p >= 1; p--) {
				System.out.print("*");
			}
			for (int q = n; q >= 1; q--) {
				System.out.print("*");
			}
			for (int r = 5; r > n; r--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}

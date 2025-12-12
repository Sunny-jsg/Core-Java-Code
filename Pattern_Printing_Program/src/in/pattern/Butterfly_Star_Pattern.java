package in.pattern;

public class Butterfly_Star_Pattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for (int l = 5; l > i; l--) {
				System.out.print(" ");
			}
			for (int m = i; m >= 1; m--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int n = 5; n >= 1; n--) {
			for (int o = n; o >= 1; o--) {
				System.out.print("*");
			}
			for (int q = 5; q > n; q--) {
				System.out.print(" ");
			}
			for (int r = 5; r > n; r--) {
				System.out.print(" ");
			}

			for (int p = n; p >= 1; p--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}

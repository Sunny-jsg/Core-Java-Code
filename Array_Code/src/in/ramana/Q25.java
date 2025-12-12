package in.ramana;

public class Q25 {

	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 1 };
		int[] b = { 2, 3, 5, 6, 7, 8, 9 };
		int maxlength = Math.max(a.length, b.length);
		int minlength = Math.min(a.length, b.length);
		int[] res = new int[maxlength];
		for (int i = 0; i < minlength; i++) {
			res[i] = a[i] + b[i];
		}
		if (a.length > b.length) {
			for (int i = minlength; i < maxlength; i++) {
				res[i] = a[i];
			}
		} else {
			for (int i = minlength; i < maxlength; i++) {
				res[i] = b[i];
			}
		}
		for (int x : res) {
			System.out.print(x + " ");
		}

	}

}

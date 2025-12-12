package in.sy;

public class Q7 {
	public static void main(String[] args) {
		int num = 6;
		int i = 5;
		int ans = perfect(num, i);
		if (ans == num) {
			System.out.println(ans + " perfectNo");
		} else {
			System.out.println(ans + "not perfect");
		}
	}

	static int perfect(int n, int i) {
		if (i == 0)
			return 0;
		if (n % i == 0)
			return i + perfect(n, i - 1);
		return perfect(n, i - 1);
	}

}

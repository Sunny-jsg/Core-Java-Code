package in.sy;

public class Q6 {
	public static void main(String[] args) {
		int num = 145;
		int ans = sumStrongNo(num);
		if (ans == num) {
			System.out.println(ans + " is StrongNo");
		} else {
			System.out.println(ans + " not a StrongNo");
		}
	}

	static int fact(int n) {
		if (n <= 1)
			return 1;
		return n * fact(n - 1);
	}

	static int sumStrongNo(int num) {
		if (num == 0)
			return 0;
		int d = num % 10;
		return fact(d) + sumStrongNo(num / 10);
	}

}

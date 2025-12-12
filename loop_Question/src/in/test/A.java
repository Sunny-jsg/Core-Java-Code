package in.test;

public class A {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 200; i++) {
			if (isPrime(i)) {
				count++;

				if (count % 2 != 0)
					System.out.print(i + "  ");

			}
		}

	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}

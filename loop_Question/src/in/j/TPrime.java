package in.j;

public class TPrime {
	public static void main(String[] args) {
		int count = 0;
		for (int n = 10; n <= 100; n++) {
			if (isPrime(n)) {
				count++;

				if (count % 2 != 0) {
					System.out.println(n + " ");
				}
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

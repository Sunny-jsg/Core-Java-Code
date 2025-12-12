package in.code;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int n = sc.nextInt();
		boolean found = false;

		for (int i = 2; i <= n / 2; i++) {
			if (isPrime(i) && isPrime(n - i)) {
				System.out.println(n + " = " + i + " + " + (n - i));
				found = true;
			}
		}

		if (!found) {
			System.out.println(n + " cannot be expressed as sum of two prime numbers.");
		}
	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;

		}
		return true;

	}

}

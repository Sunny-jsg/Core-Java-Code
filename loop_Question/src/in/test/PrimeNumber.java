package in.test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int n = sc.nextInt();
		if (prime(n)) {
			System.out.println(n + " is prime");
		} else {
			System.out.println(n + " not prime");
		}
	}

	public static boolean prime(int a) {
		if (a < 2) {
			return false;
		}

		for (int j = 2; j <= Math.sqrt(a); j++) {
			if (a % j == 0) {
				return false;

			}
		}

		return true;
	}

}

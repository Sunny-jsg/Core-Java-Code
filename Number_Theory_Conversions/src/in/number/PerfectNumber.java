package in.number;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start NUmber::");
		int num1 = sc.nextInt();
		System.out.println("Enter End Number ::");
		int num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			if (isPerfect(i)) {
				System.out.println(i + " is Perfect Number");
			}
		}

	}

	public static boolean isPerfect(int n) {
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;

			}

		}
		return sum == n;

	}

}

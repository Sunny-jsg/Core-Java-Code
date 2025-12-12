package in.j;

import java.util.Scanner;

public class APrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Range ::");
		int start = sc.nextInt();
		System.out.println("Enter End Range ::");
		int end = sc.nextInt();

		System.out.println("Choose Option ::");
		System.out.println("1. Print All Prime Numbers");
		System.out.println("2. Print Alternate Prime Numbers");
		System.out.println("3. Count Total Prime Numbers");
		int choice = sc.nextInt();

		int count = 0;
		System.out.println("-------------------------------------------");
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				count++;
				if (choice == 1) {
					System.out.println(i + " ");
				} else if (choice == 2 && count % 2 != 0) {
					System.out.println(i + " ");
				}

			}

		}
		if (choice == 3) {
			System.out.println("Total Prime Numbers between " + start + " and " + end + " = " + count);
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

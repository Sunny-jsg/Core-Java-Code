package in.loop;

import java.util.Scanner;

public class NumberProblemsInRange {

	// 1. Armstrong number check
	static boolean isArmstrong(int n) {
		int temp = n, sum = 0, digits = 0;
		while (temp > 0) {
			digits++;
			temp /= 10;
		}
		temp = n;
		while (temp > 0) {
			int d = temp % 10;
			sum += Math.pow(d, digits);
			temp /= 10;
		}
		return sum == n;
	}

	// 2. Perfect number check
	static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum == n;
	}

	// 3. Automorphic check
	static boolean isAutomorphic(int n) {
		int sq = n * n;
		return String.valueOf(sq).endsWith(String.valueOf(n));
	}

	// 4. Prime check
	static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// 5. Fibonacci in range
	static void fibonacciInRange(int limit) {
		int a = 0, b = 1;
		while (a <= limit) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println();
	}

	// 6. Tribonacci series
	static void tribonacci(int n) {
		int a = 0, b = 1, c = 1;
		System.out.print(a + " " + b + " " + c + " ");
		for (int i = 4; i <= n; i++) {
			int d = a + b + c;
			System.out.print(d + " ");
			a = b;
			b = c;
			c = d;
		}
		System.out.println();
	}

	// 7. HCF
	static int hcf(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	// 8. LCM
	static int lcm(int a, int b) {
		return (a * b) / hcf(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n===== MENU =====");
			System.out.println("1. Armstrong Numbers in Range");
			System.out.println("2. Perfect Numbers in Range");
			System.out.println("3. Automorphic Numbers in Range");
			System.out.println("4. Prime Numbers in Range");
			System.out.println("5. Fibonacci in Range");
			System.out.println("6. Tribonacci Series");
			System.out.println("7. HCF of Two Numbers");
			System.out.println("8. LCM of Two Numbers");
			System.out.println("9. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter range start : ");
				int a1 = sc.nextInt();
				System.out.println("Enter range End :");
				int b1 = sc.nextInt();
				System.out.println("Armstrong Numbers:");
				for (int i = a1; i <= b1; i++) {
					if (isArmstrong(i))
						System.out.print(i + " ");
				}
				System.out.println();
				break;

			case 2:
				System.out.print("Enter range (start end): ");
				int a2 = sc.nextInt(), b2 = sc.nextInt();
				System.out.println("Perfect Numbers:");
				for (int i = a2; i <= b2; i++) {
					if (isPerfect(i))
						System.out.print(i + " ");
				}
				System.out.println();
				break;

			case 3:
				System.out.print("Enter range (start end): ");
				int a3 = sc.nextInt(), b3 = sc.nextInt();
				System.out.println("Automorphic Numbers:");
				for (int i = a3; i <= b3; i++) {
					if (isAutomorphic(i))
						System.out.print(i + " ");
				}
				System.out.println();
				break;

			case 4:
				System.out.print("Enter range (start end): ");
				int a4 = sc.nextInt(), b4 = sc.nextInt();
				System.out.println("Prime Numbers:");
				for (int i = a4; i <= b4; i++) {
					if (isPrime(i))
						System.out.print(i + " ");
				}
				System.out.println();
				break;

			case 5:
				System.out.print("Enter limit: ");
				int limit = sc.nextInt();
				System.out.println("Fibonacci numbers up to " + limit + ":");
				fibonacciInRange(limit);
				break;

			case 6:
				System.out.print("Enter number of terms: ");
				int n = sc.nextInt();
				System.out.println("Tribonacci Series:");
				tribonacci(n);
				break;

			case 7:
				System.out.print("Enter two numbers: ");
				int h1 = sc.nextInt(), h2 = sc.nextInt();
				System.out.println("HCF = " + hcf(h1, h2));
				break;

			case 8:
				System.out.print("Enter two numbers: ");
				int l1 = sc.nextInt(), l2 = sc.nextInt();
				System.out.println("LCM = " + lcm(l1, l2));
				break;

			case 9:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 9);

		sc.close();
	}
}

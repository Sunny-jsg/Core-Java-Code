package in.j;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start value::");
		int a = sc.nextInt();
		System.out.println("Enter End Value ::");
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			if (armStrong(i)) {
				System.out.println(i + " is a armstrong number::");
			}
		}

	}

	public static boolean armStrong(int n) {
		int count = 0;
		int temp = n;
		int sum = 0;

		while (n > 0) {

			count++;
			n /= 10;
		}
		n = temp;
		while (n > 0) {
			int f = n % 10;
			sum += Math.pow(f, count);
			n /= 10;
		}
		return sum == temp;
	}

}

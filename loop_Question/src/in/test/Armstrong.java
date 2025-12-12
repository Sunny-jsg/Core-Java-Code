package in.test;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int num = sc.nextInt();
		if (armStrong(num)) {
			System.out.println(num + " Armstrong Number::");
		} else {
			System.out.println(num + " Not ArmStrong Number::");
		}

	}

	public static boolean armStrong(int n) {
		int count = 0;
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			count++;
			n /= 10;
		}
		n = temp;
		while (n > 0) {
			int f = n % 10;
			sum += Math.pow(f, count);
			n /= 10;
		}
		return (temp == sum);
	}

}

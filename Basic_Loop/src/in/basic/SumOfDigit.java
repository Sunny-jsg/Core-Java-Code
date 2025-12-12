package in.basic;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int n = sc.nextInt();
		while (n > 0) {
			int d = n % 10;
			sum += d;
			n /= 10;

		}
		System.out.println(sum);
	}

}

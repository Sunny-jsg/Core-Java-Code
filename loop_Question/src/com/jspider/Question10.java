package com.jspider;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();

		System.out.println("Prime numbers up to " + num + " are:");

		for (int i = 2; i <= num; i++) { // check each number up to num
			boolean isPrime = true;

			// check divisibility of current number i
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}

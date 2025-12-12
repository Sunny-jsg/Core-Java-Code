package com.loop;

import java.util.Scanner;

public class Question18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter low range:");
		int low = sc.nextInt();
		System.out.println("Enter high range:");
		int high = sc.nextInt();
		boolean found = false;
		if (low < 2) {
			low = 2;
		}
		for (int i = low; i <= high; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {

					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
				found = true;
				break;
			}
			
		}
		if (!found) {
			System.out.println("No prime number found in the given range.");
		}
	}

}

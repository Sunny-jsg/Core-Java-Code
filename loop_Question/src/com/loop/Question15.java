package com.loop;

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range ::");
		int num = sc.nextInt();

		for (int i = 100; i <= num; i++) {
			int count = 0;

			int temp = i;
			int t = temp;
			while (t > 0) {
				int d = t % 10;
				count++;
				t /= 10;

			}
			t = temp;
			int sum = 0;
			while (t > 0) {
				int f = t % 10;
				sum += Math.pow(f, count);
				t /= 10;
			}
			if (temp == sum) {
				System.out.println(sum + " is a armstrong Number:");
			}
		}

	}

}

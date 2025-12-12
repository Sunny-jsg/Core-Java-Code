package com.loop;

import java.util.Scanner;

public class Question20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int num = sc.nextInt();
		int a = 0, b = 1;
		for (int i = 1; i <= num; i++) {

			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}

	}

}

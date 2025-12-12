package com.in;

import java.util.Scanner;

public class ProductOfTwoNumber {

	static public int product(int a, int b) {
		if (a < b)
			return product(b, a);
		else if (b != 0)
			return a + product(a, b - 1);
		else
			return 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'a' Value ::");
		int a = sc.nextInt();
		System.out.println("Enter 'b' Value ::");
		int b = sc.nextInt();
		System.out.println(product(a, b));

	}

}

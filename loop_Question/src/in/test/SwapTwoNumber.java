package in.test;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println("Before Swaping :: a: " + a + " b: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swaping :: a: " + a + " b: " + b);

	}

}

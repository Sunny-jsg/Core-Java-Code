package com.jspider;
//Factorial of a number (n=5).
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int num = sc.nextInt();
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac *= i;
		}
		System.out.println("Factorial of " + num + " = " + fac);

	}

}

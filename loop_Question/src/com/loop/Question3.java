package com.loop;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int num = sc.nextInt();
		int digits = 3;
		for (int i = 1; i <= num; i++) {
			int cube = (int) Math.pow(i, digits);
			System.out.println("Number is :" + i + " and cube of the " + i + " is : " + cube);
		}
	}

}

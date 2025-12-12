package com.loop;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int table = num * i;
			System.out.println(num + " * " + i + " = " + table);
		}
	}

}

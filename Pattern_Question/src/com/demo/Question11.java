package com.demo;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j == i || j == (2 * n - 2 - i) || i == 0) {
                    System.out.print("x ");
                } else if (j < i || j > (2 * n - 2 - i)) {
                    System.out.print("x ");
                } else {
                    System.out.print("  ");
                }
            }
		System.out.println();
	}
	}
}

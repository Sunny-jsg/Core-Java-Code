package com.demo;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int n = sc.nextInt();
		int spaces = n - 1;
		int stars = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			//for (int j = 1; j <= stars; j++) {
			//	System.out.print("X");
			//}
			for(int j=1;j<=stars;j++) {
				if(j==1||j==stars||i==n) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			spaces--;
			stars += 2;

		}
	}

}

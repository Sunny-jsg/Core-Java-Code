package com.demo;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||j==n+1-i||j==n||j==1) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}

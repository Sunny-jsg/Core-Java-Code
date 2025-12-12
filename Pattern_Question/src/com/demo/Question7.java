package com.demo;
import java.util.Scanner;
public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==1||i==n) {
				for(int j=1;j<=n;j++) {
					System.out.print("X");
				}
			}else {
				System.out.print("X");
				for(int k=1;k<=n-2;k++) {
					System.out.print(" ");
				}
				System.out.print("X");
			}
			System.out.println();
		}
	}

}

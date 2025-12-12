package com.loop;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();
		int sum =0;
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				System.out.println("The Odd numbers are :: "+ i);
				sum +=i;
			}
		}
		System.out.println("The Sum of odd number:"+ sum);
	}

}

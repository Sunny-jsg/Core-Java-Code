package com.loop;

import java.util.Scanner;

public class Question21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lowest number::");
		int low = sc.nextInt();
		System.out.println("Enter Highest Number::");
		int high = sc.nextInt();
		int sum=0;
		 System.out.println("Numbers between 100 and 200, divisible by 9:");
		for(int i=low;i<=high;i++) {
			if(i%9==0) {
				System.out.print(i + " ");
				sum +=i;
			}
		}
		System.out.println();
		System.out.println("The Sum ::" + sum);
	}

}

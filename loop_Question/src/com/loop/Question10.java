package com.loop;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number::");
		int num = sc.nextInt();
		int digits =2;
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			sum+=Math.pow(i, digits);
		
		}
		System.out.println(sum);
	}

}

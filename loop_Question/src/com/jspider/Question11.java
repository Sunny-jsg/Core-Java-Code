package com.jspider;

import java.util.Scanner;
//11. Find sum of digits of a number (n=987).
public class Question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();
		int sum=0;
		while(num>0) {
			sum += num%10;
			num/=10;
		}
		System.out.println("Sum of Digit ::" +sum);
	}

}

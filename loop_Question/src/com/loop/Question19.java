package com.loop;

import java.util.Scanner;

public class Question19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int num = sc.nextInt();
		int rev=0;
		int temp=num;
		while(num >0) {
			rev =10*rev+num%10;
			num/=10;
		}
		System.out.println(rev);
	}

}

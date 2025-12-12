package com.loop;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int n = sc.nextInt();
		int term=0;
		int sum=0;
		for(int i=1;i<=n;i++) {
			term =term*10+1;
			sum +=term;
		}
		System.out.println("The Sum is :"+ sum);
	}

}

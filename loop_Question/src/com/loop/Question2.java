package com.loop;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();
		int sum =0;
		double count=10.0;
		for(int i=1;i<=num;i++) {
			sum +=i;
		}
		double average=sum/count;
		System.out.println("Sum ::" + sum);
		System.out.println("Average :: "+ average);
	}

}

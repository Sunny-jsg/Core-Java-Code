package com.loop;

import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int num = sc.nextInt();
		int count =0;
		int sum=0;
		int temp=num;
		while(num >0) {
			int d =num%10;
			count++;
			num/=10;
		}
		num=temp;
		while(num>0) {
			int f= num%10;
			sum += Math.pow(f, count);
			num/=10;
		}
		
		if(sum==temp) {
			System.out.println(sum +" is a Armstong Number::");
		}
	}

}

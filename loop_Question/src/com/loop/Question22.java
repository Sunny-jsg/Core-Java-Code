package com.loop;

import java.util.Scanner;

public class Question22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number::");
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while(num>0) {
			int reminder=num%2;
			sb.append(reminder);
			num/=2;
			
			
		}
		sb.reverse();
		System.out.println(sb.toString());
	}

}

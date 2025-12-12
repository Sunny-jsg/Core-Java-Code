package com.loop;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int num = sc.nextInt();
		for(int i=1;i<=8;i++) {
			int mul = num*i;
			System.out.print(num +"*"+ i +"=" + mul + ","+" ");
		}
	}

}

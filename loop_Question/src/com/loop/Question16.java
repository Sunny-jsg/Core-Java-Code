package com.loop;

import java.util.Scanner;

public class Question16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary Number ::");
		String binaryNum = sc.nextLine();
		int l = binaryNum.length();
		int power=0;
		int manualDecimal=0;
		for(int i=l-1;i>=0;i--) {
			char ch = binaryNum.charAt(i);
			if(ch =='1') {
				manualDecimal += Math.pow(2, power);
			}
			power++;
		}
		System.out.println(manualDecimal);
	}

}

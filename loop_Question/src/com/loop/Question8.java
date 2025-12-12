package com.loop;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print(" ");
			}for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

package com.loop;

import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range:");
		int n = sc.nextInt();	
		for(int i=1;i<=n;i++) {
			int sum =0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum +=j;
				}
				
			}
			//System.out.println(sum);
			if(i == sum) {
				System.out.println(i +" perfect Number");
			}
		}
		
		
	}

}

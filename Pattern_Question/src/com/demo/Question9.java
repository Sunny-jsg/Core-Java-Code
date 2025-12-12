package com.demo;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				int x= ((i-1)*n)+1;
				for(int j=1;j<=n;j++) {
					System.out.print(x+"\t");
					x++;
				}
			}else {
				int y =i*n;
				for(int k=1;k<=n;k++) {
					System.out.print(y+"\t");
					y--;
				}
			}
			System.out.println();
		}
	}

}

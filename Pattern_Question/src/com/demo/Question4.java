package com.demo;

public class Question4 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i-1;j++)
				System.out.print(" ");
			for(int k=5;k>=i;k--)
				System.out.print(k);
			System.out.println();
		}
	}

}

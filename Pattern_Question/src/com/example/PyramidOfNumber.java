package com.example;

public class PyramidOfNumber {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print(k);
			for(int k=i-1;k>=1;k--)
				System.out.print(k);
			System.out.println();
		}
	}

}

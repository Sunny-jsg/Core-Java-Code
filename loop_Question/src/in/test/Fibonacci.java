package in.test;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int n = sc.nextInt();
		int a =0;
		int b=1;
		int c;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" \t");
			c=a+b;
			a=b;
			b=c;
		}
	}

}

package in.test;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int a = sc.nextInt();
		System.out.println("Factorial of "+ a +" :: "+ fac(a));
	}
	
	public static int fac(int n) {
		int fac =1;
		for(int i=1;i<=n;i++) {
			 fac *=i;
		}
		return fac;
	}

}

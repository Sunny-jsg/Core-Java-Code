package in.basic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fac=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int n = sc.nextInt();
		for(int i =n ;i>=1;i--) {
			fac*=i;
		}
		System.out.println(fac);
	}

}

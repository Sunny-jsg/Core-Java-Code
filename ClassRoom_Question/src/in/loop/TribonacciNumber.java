package in.loop;

import java.util.Scanner;

public class TribonacciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		int c=2;
		int d=0;
		for(int i=1;i<=num;i++) {
			System.out.print(a +" ");
			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
	}

}

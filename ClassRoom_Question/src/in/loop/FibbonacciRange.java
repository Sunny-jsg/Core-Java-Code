package in.loop;

import java.util.Scanner;

public class FibbonacciRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		int num1 = sc.nextInt();
		
		int a=0;
		int b=1;
		while(a<=100) {
			if(a >=20)
			System.out.println(a +" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
}

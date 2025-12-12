package in.loop;

import java.util.Scanner;

public class TribonacciNumberRange {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number ::");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		int c=2;
		while(a<=num) {
			if(a>=20)
			System.out.print(a + " ");
			int d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
	}

}

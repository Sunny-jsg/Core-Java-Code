package in.loop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ::");
		int num = sc.nextInt();
		int fac=1;
		for(int i=1;i<=num;i++) {
			fac *=i;
		}
		System.out.println("Factorial of " + num + " = " + fac );
	}

}

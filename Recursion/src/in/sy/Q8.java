package in.sy;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter end number");
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
		String str = String.valueOf(i);
		int count = str.length();
		if(i ==palindrome(i, count) && isPrime(i, i/2)) {
			System.out.println(i + " is prime Palindrome");
		}
		}

	}

	static int palindrome(int n, int pow) {
		if (n == 0)
			return 0;
		return (n % 10) * (int) Math.pow(10, pow - 1) + palindrome(n / 10, pow - 1);
	}

	static boolean isPrime(int n, int i) {
		if (i == 1)
			return true;
		if(n%i==0)
			return false;
		return isPrime(n, i-1);
	}
}

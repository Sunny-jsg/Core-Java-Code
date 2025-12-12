package in.test;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int n = sc.nextInt();
		System.out.println(rev(n));

	}

	public static int rev(int num) {
		int rev = 0;

		int absNum = Math.abs(num);
		while (absNum > 0) {
			int d = absNum % 10;
			rev = rev * 10 + d;
			absNum /= 10;
		}
		return (num < 0) ? -rev : rev;
	}

}

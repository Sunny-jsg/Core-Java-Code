package in.number;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number ::");
		int a = sc.nextInt();
		System.out.println("Enter Second Number::");
		int b = sc.nextInt();
		for(int i=a;i <=b;i++) {
			if(isPrimeNum(i)) {
				System.out.println(i + " is Prime");
			}
		}

	}

	public static boolean isPrimeNum(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}

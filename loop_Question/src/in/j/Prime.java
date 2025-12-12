package in.j;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ::");
		int i = sc.nextInt();
		boolean isPrime = prime(i);
		if(isPrime) {
			System.out.println(i+ " it is a prime no. ");
		}else {
			System.out.println(i + " it is Not a prime no.");
		}
		

	}

	public static boolean prime(int i) {
		if (i < 2)
			return false;
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}

}

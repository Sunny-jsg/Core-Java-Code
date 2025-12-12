package in.test;

import java.util.ArrayList;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		int x = sc.nextInt();
		System.out.println("End");
		int y = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = x; i <= y; i++) {
			if (isPrime(i)) 
				al.add(i);
		}
			System.out.print("First 3 Prime Numbers: ");
			for (int i = 0; i < 3 && i < al.size(); i++) {
				System.out.println(al.get(i) + " ");
		
		}
	}

	public static boolean isPrime(int i) {
		if (i < 2)
			return false;
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}

}

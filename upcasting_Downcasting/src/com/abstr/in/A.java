package com.abstr.in;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Number::");
		int n = sc.nextInt();
		System.out.println("Enter the last Number::");
		int m = sc.nextInt();
		int count = 0;
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = n; i <= m; i++) {
			if (isPrime(i)) {
				//al.add(i);
				System.out.println(i);

			}
		
			
			
		}
		/*
		 * for(int j=al.size()-3;j < al.size();j++) { System.out.println(al.get(j)); }
		 */
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

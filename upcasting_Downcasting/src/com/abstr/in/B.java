package com.abstr.in;

import java.util.ArrayList;
import java.util.Scanner;

public class B extends A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number::");
		int start = sc.nextInt();
		System.out.println("Enter End Number");
		int end = sc.nextInt();
		ArrayList< Integer> al = new ArrayList<>();

		for (int i = start; i <= end; i++) {
			if (isArmstrong(i)) {
				System.out.println(i);
				al.add(i);
			}
		}
		System.out.println("First 3 Number ");
		for(int k=0;k<3;k++) {
			System.out.println(al.get(k));
		}
		System.out.println("Last 3 Number");
		for(int l=al.size()-3; l<al.size();l++) {
			System.out.println(al.get(l));
		}
	}

	public static boolean isArmstrong(int n) {
		int sum = 0;
		int temp = n;
		
		if (n < 0)
			return false;
		
		int count = String.valueOf(n).length();
		while (n > 0) {
			int d = n % 10;
			sum += Math.pow(d, count);
			n /= 10;
		}
		return sum == temp;
	}
}

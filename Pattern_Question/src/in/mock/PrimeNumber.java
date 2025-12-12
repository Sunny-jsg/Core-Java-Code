package in.mock;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start number:");
		int a = sc.nextInt();
		System.out.println("Enter End number:");
		int b = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =a;i<=b;i++) {
			if(isPrime(i)) {
				al.add(i);
			}
			
		}
		System.out.println(al);
		Integer secondHighest = al.get(al.size()-2);
		System.out.println(secondHighest);
	}
	
	public static boolean isPrime(int num) {
		if(num <2)
			return false;
		for(int i =2;i<=Math.sqrt(num);i++) {
			if(num %i ==0) {
				return false;
			}
		}
		return true;
	}

}

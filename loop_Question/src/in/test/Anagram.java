package in.test;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		System.out.println(isAnagram(num1, num2) ? num1 + " and " + num2 + " are anagram numbers."
				: num1 + " and " + num2 + " are NOT anagram numbers.");

	}

	public static boolean isAnagram(int n1, int n2) {
		int countn1 = 0;
		int countn2 = 0;
		while (n1 > 0) {
			int d = n1 % 10;
			countn1 += d;
			n1 /= 10;
		}
		while (n2 > 0) {
			int f = n2 % 10;
			countn2 += f;
			n2 /= 10;
		}
		if (countn1 != countn2)
			return false;

		int[] count = new int[10];
		while (n1 > 0) {
			count[n1 % 10]++;
			n1 /= 10;

		}
		while (n2 > 0) {
			count[n2 % 10]--;
			n2 /= 10;
		}
		for (int c : count) {
			if (c != 0)
				return false;
		}
		return true;
	}

}

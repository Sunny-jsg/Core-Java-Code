package in.test;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first word: ");
		String str1 = sc.nextLine();
		System.out.print("Enter second word: ");
		String str2 = sc.nextLine();

		if (isAnagram(str1, str2))
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		else
			System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
	}

	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceFirst("\\s", "").toLowerCase();
		if (s1.length() != s2.length())
			return false;
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}
}

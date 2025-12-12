package in.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String::");
		String a = sc.next();
		System.out.println("Enter Second String::");
		String b = sc.next();
		boolean anagram = isAnagram(a, b);
		System.out.println(anagram);

	}

	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", " ").toLowerCase();
		s2 = s2.replaceAll("\\s", " ").toLowerCase();
		if (s1.length() != s2.length()) {
			return false;
			}
		else{
			char[] ch1 = s1.toCharArray();
		
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);
		}
	}
}

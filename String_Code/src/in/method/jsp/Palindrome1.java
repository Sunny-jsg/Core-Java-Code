package in.method.jsp;

import java.util.Scanner;

public class Palindrome1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Value:");
		String s1 = sc.next();
		for (int i = 0; i < s1.length() - 1; i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (isPalindrome(s1, i, j)) {
					System.out.println(s1.substring(i, j + 1));
				}
			}
		}

	}

	public static boolean isPalindrome(String s, int a, int b) {
		char[] ch = s.toLowerCase().toCharArray();
		int i = a;
		int j = b;
		while (i < j) {
			if (ch[i] != ch[j])
				return false;
			i++;
			j--;
		}
		return true;
	}

}

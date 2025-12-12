package in.method.jsp;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write String Value :");
		String s1 = sc.next();
		System.out.println(isPalindrone(s1));

	}

	public static boolean isPalindrone(String s) {
		char[] ch = s.toLowerCase().toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			if (ch[i] != ch[j])
				return false;
			i++;
			j--;

		}
		return true;
	}

}

package in.ramana;

import java.util.Arrays;

public class Q42 {
	public static void main(String[] args) {
		String s1 = "keep";
		String s2 = "peek";
         boolean ans = anagram(s1, s2);
         System.out.println(ans);
	}

	public static boolean anagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		char[] a = sort(ch1);
		char[] b = sort(ch2);
		if (Arrays.equals(a, b)) {
			return true;
		}
		return false;

	}

	public static char[] sort(char[] c) {
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = 0; j < c.length - 1 - i; j++) {
				if (c[j] > c[j + 1]) {
					char temp = c[j + 1];
					c[j + 1] = c[j];
					c[j] = temp;
				}
			}
		}
		return c;
	}

}

package in.method.jsp;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "silence";
		String s2 = "lisence";
		if(s1.length() != s2.length()) {
			System.out.println("Not a Anagram ");
		}
		char[] a = sort(s1);
		char[] b = sort(s2);
		if(Arrays.equals(a, b)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

	public static char[] sort(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			for (int j = 0; j < ch.length - 1 - i; j++) {
				if (ch[j] > ch[j + 1]) {
					char temp = ch[j + 1];
					ch[j + 1] = ch[j];
					ch[j] = temp;

				}
			}
		}
		return ch;
	}

}

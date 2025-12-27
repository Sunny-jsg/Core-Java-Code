package in.ramana;

import java.util.Arrays;

public class Q21 {
	public static void main(String[] args) {
		String s = "ccaabbd";

		char[] ch = sort(s);
		//System.out.println("" + Arrays.toString(ch));
		for(char c : ch) {
			System.out.print(c +"");
		}
	}

	public static char[] sort(String s) {
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {
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

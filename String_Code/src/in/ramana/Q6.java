package in.ramana;

import java.util.Arrays;

public class Q6 {
	public static void main(String[] args) {
		String s = "sunny";
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}

		System.out.print(Arrays.toString(ch) + " ");
	}

}

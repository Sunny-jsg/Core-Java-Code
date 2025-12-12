package in.comparator;

import java.util.Arrays;

public class Q1 {
	public static void main(String[] args) {
		String[] str = { "abc", "ab", "a", "abcd" };
		Arrays.sort(str, new Demo_Q1());
		for (String s : str) {
			System.out.println(s);
		}
	}

}

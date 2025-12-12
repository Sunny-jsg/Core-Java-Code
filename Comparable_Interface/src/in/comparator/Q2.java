package in.comparator;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		String[] str = { "Java", "sql", "html", "abcd" };
		Arrays.sort(str, new DemoQ2());
		for (String s : str) {
			System.out.println(s);
		}
	}

}

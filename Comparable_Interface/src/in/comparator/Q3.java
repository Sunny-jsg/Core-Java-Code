package in.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Q3 {
	public static void main(String[] args) {
		String[] str = { "C", "B", "A" };
		Arrays.sort(str, new DemoQ3());
		for (String s : str) {
			System.out.println(s);
		}
	}

}

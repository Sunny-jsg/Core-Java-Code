package in.j_Spider;

import java.util.function.Predicate;

public class A {
	public static void main(String[] args) {
		String[] str = { "Anushka", "Anupama", "Kajol", "Deepika", "Aliya" };
		Predicate<String> p = (i) -> i.charAt(0) == 'A';
		for (String s : str) {
			if (p.test(s)) {
				System.out.println(s);
			}
		}
	}

}

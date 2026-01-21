package in.j_Spider;

import java.util.function.Predicate;

public class CheckNumber {
	public static void main(String[] args) {
		Predicate<Integer> p = (i) -> i > 10;
		boolean p1 = p.test(5);
		boolean p2 = p.test(15);
		System.out.println(p1);
		System.out.println(p2);
	}

}

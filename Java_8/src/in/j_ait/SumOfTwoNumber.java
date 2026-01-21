package in.j_ait;

import java.util.function.BiFunction;

public class SumOfTwoNumber {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f = (i, j) -> i + j;
		Integer s = f.apply(10, 20);
		System.out.println(s);

	}

}

package in.j_Spider;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EvenOrNot {
	int i;

	public EvenOrNot(int i) {
		this.i = i;
	}

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(5));
		System.out.println(p.test(4));
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(5));
		Consumer<String> c = i -> System.out.println("My Name is " + i);
		c.accept("Sunny");
		c.accept("Radha");
		Supplier<EvenOrNot> s = () -> new EvenOrNot(new Scanner(System.in).nextInt());
		EvenOrNot a1 = s.get();
		EvenOrNot a2 = s.get();
		System.out.println(a1.i);
		System.out.println(a2.i);

	}

}

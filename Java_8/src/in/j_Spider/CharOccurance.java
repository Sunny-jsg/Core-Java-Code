package in.j_Spider;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CharOccurance {
	public static void main(String[] args) {
		String s = "sunnyyadav";
		s.chars().mapToObj(i -> (char) i).distinct().forEach(i -> System.out.println(i ));

		System.out.println("============================================================");
		LinkedHashMap<Character, Long> c = s.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(i -> i, () -> new LinkedHashMap<>(), Collectors.counting()));
		c.forEach((i, j) -> System.out.print(i + " = " + j));

	}

}

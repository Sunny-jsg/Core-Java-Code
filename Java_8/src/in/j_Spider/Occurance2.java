package in.j_Spider;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Occurance2 {
	public static void main(String[] args) {
		String s = "java is very very easy easy lang lang";
		String[] split = s.split(" ");
		List<String> l = Arrays.asList(split);
		l.stream().distinct().forEach(i -> System.out.println(i));
		System.out.println("=========================================");
		LinkedHashMap<String, Long> c = l.stream()
				.collect(Collectors.groupingBy(i -> i, () -> new LinkedHashMap<>(), Collectors.counting()));
		c.forEach((i, j) -> System.out.println(i + " = " + j));
	}

}

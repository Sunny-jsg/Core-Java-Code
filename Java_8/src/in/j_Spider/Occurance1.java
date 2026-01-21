package in.j_Spider;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Occurance1 {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("java", "is", "very", "very", "easy");
		Map<String, Long> map = l.stream()
				.collect(Collectors.groupingBy(i -> i, () -> new LinkedHashMap<>(), Collectors.counting()));
		map.forEach((i, j) -> System.out.println(i + " = " + j));

	}

}

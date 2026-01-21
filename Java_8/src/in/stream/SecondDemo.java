package in.stream;

import java.util.Arrays;
import java.util.List;

public class SecondDemo {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("Ashok","Anil","Radha","Akash","Ankita","Mohan","Rani");
		l.stream().filter(i -> i.startsWith("A")).map(i -> i + "-" + i.length())
		.forEach(i -> System.out.println(i));
	}

}

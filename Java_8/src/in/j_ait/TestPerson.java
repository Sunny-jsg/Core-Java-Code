package in.j_ait;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("Sunny", 23);
		Person p2 = new Person("Mohan", 13);
		Person p3 = new Person("Sita", 18);
		Person p4 = new Person("Radha", 20);
		Person p5 = new Person("Geeta", 19);
		List<Person> l = Arrays.asList(p1, p2, p3, p4, p5);
		Predicate<Person> p = i -> i.age >= 18;
		for (Person p8 : l) {
			if (p.test(p8)) {
				System.out.println(p8.name);
			}
		}

	}

}

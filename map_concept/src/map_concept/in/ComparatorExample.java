package map_concept.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Student2> list = new ArrayList<>();
		list.add(new Student2(3, "Charlie"));
		list.add(new Student2(1, "Alice"));
		list.add(new Student2(6, "Bob"));
		Comparator<Student2> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name);
		Collections.sort(list, nameComparator);
		System.out.println("Sorted by name: " + list);
		Comparator<Student2> idComparator = (s1, s2) -> s1.id - s2.id;
		Collections.sort(list, idComparator);
		System.out.println("Sorted by id: " + list);

	}
}
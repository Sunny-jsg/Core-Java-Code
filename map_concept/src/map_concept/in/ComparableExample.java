package map_concept.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Charlie"));
        list.add(new Student(1, "Alice"));
        list.add(new Student(2, "Bob"));

        Collections.sort(list); // uses compareTo()
        System.out.println(list);
    }

}

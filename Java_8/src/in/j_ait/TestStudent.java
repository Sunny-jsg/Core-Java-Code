package in.j_ait;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Sunny", "ECE");
		Student s2 = new Student(102, "Mohan", "ME");
		Student s3 = new Student(103, "Ram", "CSE");
		Student s4 = new Student(104, "Radha", "ECE");
		Student s5 = new Student(105, "Sita", "CSE");
		List<Student> l = Arrays.asList(s1, s2, s3, s4, s5);
		Function<Integer, Student> getStudentById = id -> {
			for (Student s : l) {
				if (s.id == id) {
					return s;
				}
			}
			return null;
		};

		Student result = getStudentById.apply(103);

		System.out.println(result);
	}

}

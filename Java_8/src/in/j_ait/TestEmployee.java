package in.j_ait;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Sunny", "Hyd", "Software-Team");
		Employee e2 = new Employee("Shivam", "Bangalore", "DB-Team");
		Employee e3 = new Employee("Mohan", "Hyd", "Fronted-Team");
		Employee e4 = new Employee("Sita", "Hyd", "DB-Team");
		Employee e5 = new Employee("Radha", "Bangalore", "Software-Team");
		List<Employee> l = Arrays.asList(e1, e2, e3, e4, e5);
		Predicate<Employee> p1 = (i) -> i.location.equals("Hyd");
		Predicate<Employee> p2 = (i) -> i.dept.equals("DB-Team");
		Predicate<Employee> p = p1.and(p2);
		for (Employee e6 : l) {
			if (p.test(e6)) {
				System.out.println(e6.name + "- " + e6.dept + " - " + e6.location);

			}
		}
	}

}

package in.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStream {
	public static void main(String[] args) {
		Employee e1 = new Employee("Sunny", 45000, 24,"BIHAR");
		Employee e2 = new Employee("Rahul", 52000, 26,"ODISHA");
		Employee e3 = new Employee("Priya", 48000, 25,"WEST BENGAL");
		Employee e4 = new Employee("Amit", 60000, 28,"MP");
		Employee e5 = new Employee("Neha", 47000, 23,"BIHAR");
		Employee e6 = new Employee("Rohit", 55000, 27,"UP");
		Employee e7 = new Employee("Kavya", 50000, 24,"ODISHA");
		Employee e8 = new Employee("Arjun", 65000, 30,"UP");
		Employee e9 = new Employee("Pooja", 49000, 25,"BIHAR");
		Employee e10 = new Employee("Vikas", 53000, 26,"ODISHA");
		List<Employee> l = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);

		l.stream().filter(i -> i.salary > 50000.0).map(i -> i.name + "-" + i.age + " -" + i.salary)
				.forEach(i -> System.out.println(i));

		Optional<Employee> max = l.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		if (max.isPresent()) {
			Employee e = max.get();
			System.out.println("Max Salary ::" + e.salary);
		}

		Optional<Employee> min = l.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		if (min.isPresent()) {
			Employee emp = min.get();
			System.out.println("Min Salary :: " + emp.salary);
		}

		Double d = l.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("Average Salary :: " + d);
		
		Map<String, List<Employee>> map = l.stream().collect(Collectors.groupingBy(e -> e.loc));
		System.out.println(map );

	}

}

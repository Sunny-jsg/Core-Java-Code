package in.stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee1Stream {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0);
		Employee1 e2 = new Employee1(2, "Smith", 25, "Male", "Sales", 2015, 13500.0);
		Employee1 e3 = new Employee1(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0);
		Employee1 e4 = new Employee1(4, "Orlen", 28, "Male", "Development", 2014, 32500.0);
		Employee1 e5 = new Employee1(5, "Charles", 27, "Male", "HR", 2013, 22700.0);
		Employee1 e6 = new Employee1(6, "Cathy", 43, "Male", "Security", 2016, 10500.0);
		Employee1 e7 = new Employee1(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0);
		Employee1 e8 = new Employee1(8, "Suresh", 31, "Male", "Development", 2015, 34500.0);
		Employee1 e9 = new Employee1(9, "Gita", 24, "Female", "Sales", 2016, 11500.0);
		Employee1 e10 = new Employee1(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5);
		Employee1 e11 = new Employee1(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0);
		Employee1 e12 = new Employee1(12, "Nithin", 25, "Male", "Development", 2016, 28200.0);
		Employee1 e13 = new Employee1(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0);
		Employee1 e14 = new Employee1(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5);
		Employee1 e15 = new Employee1(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0);
		Employee1 e16 = new Employee1(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0);
		List<Employee1> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16);

		// Question 1 : - How many male and female employees are there in organization ?
		/*
		 * Map<String, Long> emp =
		 * list.stream().collect(Collectors.groupingBy(Employee1::getGender
		 * ,Collectors.counting())); System.out.println(emp);
		 */
		// Question 2 : - print the name of all departments in the organization ?
		/*
		 * Stream<String> dept = list.stream().map(i -> i.department).distinct();
		 * dept.forEach(i -> System.out.println(i));
		 */
		// Question 3 : - what is the average age of male and female employee ?
		/*
		 * Map<String, Double> emp = list.stream()
		 * .collect(Collectors.groupingBy(Employee1::getGender,
		 * Collectors.averagingDouble(Employee1::getAge))); System.out.println(emp);
		 */
		// Question 4 : - Get the details of highest paid employee in the organization ?
		/*
		 * Optional<Employee1> emp =
		 * list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee1::
		 * getSalary))); if(emp.isPresent()) { Employee1 emp1 = emp.get();
		 * System.out.println(emp1); }
		 */
		// Question 5 :- Get the names of all the employees who have joined after 2015 ?
		/*
		 * List<Employee1> emp = list.stream().filter(i -> i.yearOfJoining >
		 * 2015).collect(Collectors.toList()); emp.forEach(i -> System.out.println(i));
		 */
		// Question 6 :- Count the number of employee in each department ?
		/*
		 * Map<String, Long> emp = list.stream()
		 * .collect(Collectors.groupingBy(Employee1::getDepartment,
		 * Collectors.counting())); System.out.println(emp);
		 */
		// Question 7 :- What is the Average salary of each Department ?
		/*
		 * Map<String, Double> emp = list.stream().collect(
		 * Collectors.groupingBy(Employee1::getDepartment,
		 * Collectors.averagingDouble(Employee1::getSalary))); System.out.println(emp);
		 */
		// Question 8 :- Get the details of youngest male employee in the development
		// department?
		/*
		 * Optional<Employee1> emp = list.stream().filter(i ->
		 * i.department.equals("Development")).collect(Collectors.minBy(Comparator.
		 * comparing(Employee1::getAge))); System.out.println(emp.get());
		 */
		// Question 9 :- Who has the most working experience in the organization ?
		/*
		 * Optional<Employee1> emp =
		 * list.stream().collect(Collectors.minBy(Comparator.comparing(Employee1::
		 * getYearOfJoining))); System.out.println(emp.get());
		 */
		// Question 10 :- How many male and female employee are there in sales
		// department ?
		/*
		 * Map<String, Long> emp = list.stream().filter(i ->
		 * i.department.equals("Sales")).collect(Collectors.groupingBy(Employee1::
		 * getGender,Collectors.counting())); System.out.println(emp);
		 */
		// Question 11 :- what is the average salary of male and female employee ?
		/*
		 * Map<String, Double> emp =
		 * list.stream().collect(Collectors.groupingBy(Employee1::getGender,Collectors.
		 * averagingDouble(Employee1::getSalary))); System.out.println(emp);
		 */
		// Question 12 :- List down all the employees in each department?
		/*
		 * Map<String, List<String>> emp =
		 * list.stream().collect(Collectors.groupingBy(Employee1::getDepartment
		 * ,Collectors.mapping(Employee1::getName, Collectors.toList())));
		 * System.out.println(emp);
		 */
		// Question 13 :- What is the average salary and total salary of the whole
		// organization ?
		/*
		 * DoubleSummaryStatistics stats =
		 * list.stream().collect(Collectors.summarizingDouble(Employee1::getSalary));
		 * System.out.println("Toatal Salary :: " + stats.getSum());
		 * System.out.println("Average Salary :: " + stats.getAverage());
		 */
		// Question 14 : - Separate the employees who are younger or equals to 25 years
		// from those employees who are older than 25 year ?
		// partitioningBy() → always produces 2 groups (true / false)
		// groupingBy() → can produce multiple groups

		/*
		 * Map<Boolean, List<String>> result = list.stream() .collect(Collectors
		 * .partitioningBy(e -> e.getAge() <= 25,Collectors.mapping(Employee1::getName,
		 * Collectors.toList()))); System.out.println(result );
		 */
		// Question 15 :- Who is the oldest employee in the organization ? what is his
		// age and which department he belong to ?
		list.stream()
	    .max(Comparator.comparing(Employee1::getAge))
	    .ifPresent(e ->
	        System.out.println(
	            "Oldest Employee : " + e.getName() +
	            " | Department : " + e.getDepartment() +
	            " | Age : " + e.getAge()
	        )
	    );

	}

}

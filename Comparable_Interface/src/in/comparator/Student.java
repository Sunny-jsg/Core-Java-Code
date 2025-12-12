package in.comparator;

public class Student {
	int id;
	String name;
	double marks;
	String branch;
	static int count = 101;

	public Student(String name, double marks, String branch) {
		super();
		this.name = name;
		this.marks = marks;
		this.branch = branch;
		id = count++;
	}

	public static void main(String[] args) {

		Student[] students = new Student[10];

		students[0] = new Student("Aman", 85.5, "CSE");
		students[1] = new Student("Sonu", 75.0, "ECE");
		students[2] = new Student("Kiran", 91.2, "ME");
		students[3] = new Student("Sonu", 84.0, "CIVIL");
		students[4] = new Student("Neha", 95.0, "IT");
		students[5] = new Student("Sonu", 72.0, "EEE");
		students[6] = new Student("Priya", 89.9, "CSE");
		students[7] = new Student("Arjun", 67.1, "ECE");
		students[8] = new Student("Simran", 93.5, "IT");
		students[9] = new Student("Rahul", 80.4, "ME");
		Sort.sort(students, new StudentComparator());
		for (Student s : students) {
			System.out.println(s.id + " " + s.name + " " + s.marks + " " + s.branch);
		}
	}
}

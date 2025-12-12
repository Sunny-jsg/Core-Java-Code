package in.demo;

import java.util.Arrays;

public class Student {
	int id;
	String sname;
	String marks;
	String gender;
	Long phno;

	public Student(int id, String sname, String marks, String gender, Long phno) {
		this.id = id;
		this.sname = sname;
		this.marks = marks;
		this.gender = gender;
		this.phno = phno;
	}

	public static void main(String[] args) {
		Student[] student = new Student[10];
		student[0] = new Student(1, "Rahul", "85", "Male", 9876543210L);
		student[1] = new Student(2, "Priya", "90", "Female", 9876543211L);
		student[2] = new Student(3, "Karan", "78", "Male", 9876543212L);
		student[3] = new Student(4, "Neha", "88", "Female", 9876543213L);
		student[4] = new Student(5, "Amit", "92", "Male", 9876543214L);
		student[5] = new Student(6, "Sonia", "80", "Female", 9876543215L);
		student[6] = new Student(7, "Deepak", "74", "Male", 9876543216L);
		student[7] = new Student(8, "Meena", "89", "Female", 9876543217L);
		student[8] = new Student(9, "Ravi", "95", "Male", 9876543218L);
		student[9] = new Student(10, "Anjali", "84", "Female", 9876543219L);
           Arrays.sort(student, new DemoComparator());
		for (Student s : student) {
			System.out.println(s.id + " " + s.sname + " " + s.marks + " " + s.gender + " " + s.phno);
		}
	}

}

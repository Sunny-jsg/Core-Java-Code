package com.in.obj;

public class Student1_Impl {
	String name;
	double marks;

	public Student1_Impl(String name, double marks) {
		this.name = name;
		this.marks = marks;
	}

	public static void main(String[] args) {
		Student1_Impl s1 = new Student1_Impl("Sunny", 80);
		Student1 s = new Student1();
		Student1_Impl updated = s.addBonusMarks(s1);
		System.out.println(s1.marks);
		System.out.println(updated.marks);
	}

}

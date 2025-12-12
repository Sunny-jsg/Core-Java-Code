package com.in.obj;

public class F {
	String name;
	long phno;
	static int count;

	public F(String name, long phno) {
		this.name = name;
		this.phno = phno;
		count++;

	}

	void display() {
		System.out.println("Name =" + name + "\t"+ "Phno =" + phno);
		System.out.println();
	}

}

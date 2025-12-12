package com.in.obj;

public class C {
	
	int i;
	void m1() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
		c1.i=20;
		c2.i=30;
		c1.m1();
		c2.m1();
	}

}

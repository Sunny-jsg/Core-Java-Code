package com.in.obj;

public class ETest {
	public static void main(String[] args) {
		E e1 = new E();
		E e2 = new E();
		e1.i = 10;
		e1.j = 20;
		
		e2.i = 30;
		e2.j = 40;

		e1.m1(); // calls methods using e1
		e2.m1(); // calls methods using e2
	}

}

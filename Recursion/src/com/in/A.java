package com.in;

public class A {
	public static void main(String[] args) {
		m1(1);
	}

	static void m1(int i) {
		System.out.println(i + " ");
		if (i >= 4)
			return;
		m1(i + 1);

		
	}

}

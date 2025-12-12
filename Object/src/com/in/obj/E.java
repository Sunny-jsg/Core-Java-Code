package com.in.obj;

public class E {
	int i;
	int j;

	void m1() {
        System.out.println("Inside m1() of object: " + this);
        System.out.println("i = " + this.i);
        this.m2();
    }

    void m2() {
        System.out.println("Inside m2() of object: " + this);
        System.out.println("j = " + this.j);
        System.out.println("-------------------");
	}

}

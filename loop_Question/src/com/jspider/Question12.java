package com.jspider;
//Fibonacci series up to 10 terms.
public class Question12 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for(int i=1;i<=10;i++) {
			System.out.print(a + " ");
			int next = a+b;
			a=b;
			b=next;
		}

	}

}

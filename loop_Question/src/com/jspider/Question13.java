package com.jspider;
//tribonacci series up to 10 terms.
public class Question13 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=2;
		for(int i=1;i<=10;i++) {
			System.out.print(a + " ");
			int next = a+b+c;
			a=b;
			b=c;
			c=next;
		}
	}

}

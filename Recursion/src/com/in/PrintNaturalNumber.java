package com.in;

public class PrintNaturalNumber {
	public static void main(String[] args) {
		System.out.println(print(1));
	}

	static int print(int a) {
		if(a > 9)
			return a;
		System.out.println(a);
		return  print(a+1);
	}
	
	
	
	
	
}

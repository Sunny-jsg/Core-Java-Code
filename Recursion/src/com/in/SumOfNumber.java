package com.in;

public class SumOfNumber {
	public static void main(String[] args) {
     sum(20);
	}

	static void sum(int a) {
		if(a>=1) {
			System.out.print(a +" ");
		
		sum(a-1);
	
		System.out.print(a +" ");
	}
	}
}

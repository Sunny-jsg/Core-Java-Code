package com.in.obj;

public class FTest {
	public static void main(String[] args) {
		F f1 = new F("Sunny", 8574636373l);
		F f2 = new F("Radha", 9746654773l);
		System.out.println("Count ::" + F.count);
		f1.display();
		f2.display();
		
	}

}

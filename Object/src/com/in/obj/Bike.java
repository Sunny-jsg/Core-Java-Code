package com.in.obj;

public class Bike {
	int regNum;
	String color;
	private static int count =1000;
	Bike(String color){
		this.color=color;
		regNum =count;
		count++;
	}
	void display() {
		System.out.println(" Reg.Num :: " + regNum + " ::"+" Color :: "+ color);
		System.out.println("=============================================");
	}
	public static void main(String[] args) {
		Bike b1 = new Bike("Black");
		b1.display();
	}

}

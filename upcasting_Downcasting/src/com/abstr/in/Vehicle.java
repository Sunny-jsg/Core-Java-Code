package com.abstr.in;

public abstract class Vehicle {
	protected int wheels;
	protected String type;

	public Vehicle(int wheels, String type) {
		this.wheels = wheels;
		this.type = type;
		System.out.println("Vehicle Constructor Called::");
	}

	public abstract void drive();

	public void displayInfo() {
		System.out.println("Type : " + type + " , Wheels :  " + wheels);
	}

}

package com.abstr.in;

public class Car extends Vehicle {
	
	public Car() {
		super(4,"Car");
		
	}

	@Override
	public void drive() {
         System.out.println("Driving the car on "+ wheels +" wheels.");

		
	}

}

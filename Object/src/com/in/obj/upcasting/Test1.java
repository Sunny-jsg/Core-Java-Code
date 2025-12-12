package com.in.obj.upcasting;

public class Test1 {
	public static void main(String[] args) {
		Benz b1 = new Benz();
		Audi a1 = new Audi();
		Driver d = new Driver();
		d.drive(b1);
		d.drive(a1);
	}

}

class Car {
	void startEngine() {
	}

	void stopEngine() {
	}
}

class Benz extends Car {
	void startEngine() {
		System.out.println("Benz engine start");
		
	}
	void stopEngine() {
		System.out.println("Benz engine stop");
	}
}

class Audi extends Car {
	void startEngine() {
		System.out.println("Audi engine start");
	}
	void stopEngine() {
		System.out.println("Audi engine stop");
	}
}

class Driver {
	void drive(Car c) {
		c.startEngine();
		System.out.println("Driving...");
		c.stopEngine();
		System.out.println("stop driving...");
	}
}

package com.oops;

public class Test {
	public static void main(String[] args) {
		Zomato z1 = new Veg();
		System.out.println(z1.gmail);
		System.out.println(z1.password);
		z1.login("sunny@123gmail.com", "sunny@123");
		System.out.println("==============================================");
		Veg v1 = (Veg) z1;
		System.out.println(v1.gmail);
		System.out.println(v1.password);
		v1.login("sunny@123gmail.com", "sunny@123");
		System.out.println("=============================================");
		System.out.println(v1.resturent);
		v1.dish();
		System.out.println("==============================================");
		Zomato z2 = new Non_Veg();
		System.out.println(z2.gmail);
		System.out.println(z2.password);
		z2.login("sunny@123gmail.com", "sunny@123");
		System.out.println("==================================================");
		Non_Veg v2 = (Non_Veg) z2;
		System.out.println(v2.gmail);
		System.out.println(v2.password);
		v2.login("sunny@123gmail.com", "sunny@123");
		System.out.println("==================================================");
		System.out.println(v2.resturent);
		v2.dish();
	}

}

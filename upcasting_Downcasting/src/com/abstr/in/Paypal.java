package com.abstr.in;

public  class Paypal  extends OnlinePayment{
	
	  Paypal() { 
		 super("PayPal Gateway");
		 }

	    public void processPayment(double amount) {
	        connectToGateway();
	        System.out.println("Processing $" + amount + " via PayPal");
	    }

}

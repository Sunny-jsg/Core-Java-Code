package com.abstr.in;

public class ECommerce {
	
	public static void main(String[] args) {
        Payment payment = new Paypal(); // Upcasting
        payment.processPayment(2500);
    }

}

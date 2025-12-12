package com.abstr.in;

public abstract class OnlinePayment implements Payment {

	String gatewayName;

	OnlinePayment(String gatewayName) {
		this.gatewayName = gatewayName;
	}

	void connectToGateway() {
		System.out.println("Connecting to " + gatewayName);
	}

	
}

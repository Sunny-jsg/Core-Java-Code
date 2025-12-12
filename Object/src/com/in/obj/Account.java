package com.in.obj;

public class Account {
	double balance;

	Account(double balance) {
		this.balance = balance;
	}

	void deposit(double amount) {
		this.balance += amount;
	}

	Account withdraw(double amount) {
		this.balance -= amount;
		return this;
	}
}


package com.in.obj;

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account(1000);

        a1.deposit(500);               // passing primitive
        a1.withdraw(200).deposit(300); // returning same object -> chain
        System.out.println(a1.balance);
    }
}
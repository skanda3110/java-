package com.xworkz.exception2;

public class Atm {
int balance;
int withdraw;

public void check(int balance , int withdraw) throws Atmexception {
	this.balance=balance;
	this.withdraw=withdraw;
	if (withdraw>balance) {
		throw new Atmexception();
	}
	else {
		System.out.println(withdraw+" is removed from account");
	}
}
}

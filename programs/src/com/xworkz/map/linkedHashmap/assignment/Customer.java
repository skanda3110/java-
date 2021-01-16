package com.xworkz.map.linkedHashmap.assignment;

public class Customer  {
	int accNo;
	double balance;
	public Customer(int accNo, double balance) {
		
		this.accNo = accNo;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	
	
}

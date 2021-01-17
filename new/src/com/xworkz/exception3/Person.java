package com.xworkz.exception3;

public class Person {
public static void main(String[] args) {
	
	int amount = 50;
	Atm atm = new Atm();
	try {
		atm.draw(amount);
	} catch (AtmException e) {
		if (amount>50000 || amount<100) {
			System.out.println(e);
		}
		else {
			System.out.println(e.getMessage());
		}
	}
}
}

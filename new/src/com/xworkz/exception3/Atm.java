package com.xworkz.exception3;

public class Atm {

	void draw(int amount) throws AtmException {
		if (amount<100 || amount>50000 || amount%100!=0) {
			AtmException atmException = new AtmException();
			throw atmException;
		}
		else {
			System.out.println("Plese collect the cash..");
		}
	}
}

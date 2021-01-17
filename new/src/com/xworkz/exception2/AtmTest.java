package com.xworkz.exception2;

public class AtmTest {
public static void main(String[] args) {
	Atm atm = new Atm();
	
	try {
		atm.check(1000, 5000);
	} catch (Atmexception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}

package com.xworkz.exception;

public class Customer {
public static void main(String[] args) throws DmartException  {
	
	Dmart dmart = new Dmart();
	
	try {
		dmart.findItem("fruits");
	} catch (DmartException de) {
		System.out.println(de);
	}
}
}

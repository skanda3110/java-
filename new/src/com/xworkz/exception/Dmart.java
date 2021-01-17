package com.xworkz.exception;

public class Dmart {
	String fruits;
	String vegetables;
	String clothes;
	boolean isServerUp = true;
	public void findItem(String itemName) throws DmartException {
		if(itemName.equalsIgnoreCase(clothes) || 
				itemName.equalsIgnoreCase(vegetables) ||
				itemName.equalsIgnoreCase(fruits)) {
			System.out.println("Item found ..");
			
		}
		else {
			DmartException de = new DmartException();
			throw de;
		}
	}
	
	void payBill(int amount) throws DmartException {
		if(isServerUp) {
			System.out.println("thanks visit again");
		}
		else {
			DmartException de = new DmartException();
			throw de;
		}
	}
}

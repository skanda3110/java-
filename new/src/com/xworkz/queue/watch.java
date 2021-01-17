package com.xworkz.queue;

public class watch implements Comparable {

	String brand;
	String type;
	double price;
	public watch(String brand, String type, double price) {
		
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	@Override
	public int compareTo(Object o) {
		watch w = (watch)o;
		Double price1 = this.price;
		Double price2 = w.price;
		return price1.compareTo(price2);
	}
	@Override
	public String toString() {
		return "watch [brand=" + brand + ", type=" + type + ", price=" + price + "]";
	}
	
	
}

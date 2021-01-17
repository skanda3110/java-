package com.xworkz.map.treeMap;

public class Book implements Comparable {

	String name;
	Double price;
	
	public Book(String name ,Double price ) {
		
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		Double price1 = this.price;
		Double price2 = ((Book)o).price;
		
		return price1.compareTo(price2);
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
}

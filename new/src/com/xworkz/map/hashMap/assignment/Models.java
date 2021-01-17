package com.xworkz.map.hashMap.assignment;

public class Models {
String name;
double price;

public Models(String name, double price) {
	this.name = name;
	this.price = price;
}

@Override
public String toString() {
	return "Models [name=" + name + ", price=" + price + "]";
}

}

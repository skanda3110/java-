package com.xworkz.collection_demo.vector;

public class Metro {
String number;
int noOfCars;
double price;
public Metro(String number, int noOfCars, double price) {
	
	this.number = number;
	this.noOfCars = noOfCars;
	this.price = price;
}
@Override
public String toString() {
	return "Metro [number=" + number + ", noOfCars=" + noOfCars + ", price=" + price + "]";
}


}

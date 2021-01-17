package com.xworkz.collection_demo.linked_list;

public class Flight {
String color;
int capacity;
String name;
public Flight(String color, int capacity, String name) {
	
	this.color = color;
	this.capacity = capacity;
	this.name = name;
}
@Override
public String toString() {
	return "Flight [color=" + color + ", capacity=" + capacity + ", name=" + name + "]";
}

}

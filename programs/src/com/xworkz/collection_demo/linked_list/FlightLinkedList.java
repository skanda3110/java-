package com.xworkz.collection_demo.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class FlightLinkedList {
public static void main(String[] args) {
	LinkedList<Flight> flights = new LinkedList<Flight>();
	
	Flight flight1 = new Flight("white", 100, "Indigo");
	Flight flight2 = new Flight("blue", 200, "KingFisher");
	Flight flight3 = new Flight("white", 150, "Air India");
	
	flights.add(flight1);
	flights.add(flight2);
	flights.add(flight3);
	
	for (Flight fl : flights) {
		if (fl.name.matches("KingFisher")) {
			System.out.println(fl);
		}
	}
	
	
}
}

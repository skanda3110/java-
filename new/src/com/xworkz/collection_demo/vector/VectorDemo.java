package com.xworkz.collection_demo.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	
	Vector<Metro> metros = new Vector<Metro>();
	
	Metro metro1 = new Metro("1", 3, 20.0);
	Metro metro2 = new Metro("2", 5, 30.0);
	Metro metro3 = new Metro("3", 2, 50.0);
	
	metros.add(metro1);
	metros.add(metro2);
	metros.add(metro3);
	
	Enumeration<Metro> e = metros.elements();
	
	while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
		
	}
}
}

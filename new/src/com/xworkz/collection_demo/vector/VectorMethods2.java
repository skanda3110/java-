package com.xworkz.collection_demo.vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class VectorMethods2 {
public static void main(String[] args) {
	
	Collection<String> c = new ArrayList<>();
	c.add("a");
	c.add("b");
	c.add("c");
	
	Vector<String> v = new Vector<String>(c);
	v.add("d");
	v.add("e");
	v.add("f");
	
	System.out.println(c);
	System.out.println(v);
	
}
}









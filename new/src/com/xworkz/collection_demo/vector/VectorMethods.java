package com.xworkz.collection_demo.vector;

import java.util.Collection;
import java.util.Vector;

public class VectorMethods {
public static void main(String[] args) {
	Vector<String> v = new Vector<String>();
	
	v.add("vector");
	Collection<String> c = new Vector<String>();
	c.add("a");
	c.add("b");
	c.add("c");
	c.add("d");
	
	v.addAll(c);
	System.out.println(v);
	
	System.out.println(v.capacity());
	
	Object v2 = v.clone();
	System.out.println(v2);
	
	v.trimToSize();
	System.out.println(v.size());
}
}

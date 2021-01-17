package com.xworkz.collection_demo.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(1);
	al.add("hi");
	al.add('a');
	al.add(true);
	
	/*
	 * Iterator i = al.iterator();
	 * 
	 * while (i.hasNext()) { System.out.println(i.next());
	 * 
	 * }
	 * 
	 * for (int j = 0; j < al.size(); j++) { System.out.println(al.get(j)); }
	 */
	
	for (Object object : al) {
		System.out.println(object);
	}
	
	System.out.println(al);
	
}
}

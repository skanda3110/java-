package com.xworkz.set.hashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
	
	linkedHashSet.add("book");
	linkedHashSet.add("dress");
	linkedHashSet.add("pen");
	linkedHashSet.add("book");
	linkedHashSet.add(null);
	
	for (String string : linkedHashSet) {
		System.out.println(string);
	}
	
}
}

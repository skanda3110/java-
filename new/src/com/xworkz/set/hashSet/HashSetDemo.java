package com.xworkz.set.hashSet;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	
	HashSet<Integer> hs = new HashSet<Integer>();
	
	hs.add(1);
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(null);
	
	
	System.out.println(hs);
}
}

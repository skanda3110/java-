package com.xworkz.map.hashMap;

import java.util.HashMap;

import java.util.Map;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	
	hm.put(1, 1);
	hm.put(2, 4);
	hm.put(3, 9);
	hm.put(4, 16);
	hm.put(5, 25);
	
	System.out.println("key set "+hm.keySet());
	System.out.println();
	System.out.println("value set "+hm.entrySet());
	
	for (Map.Entry<Integer, Integer> me : hm.entrySet()) {
		System.out.println("square of "+me.getKey()+" is "+me.getValue());
	}
	
}
}

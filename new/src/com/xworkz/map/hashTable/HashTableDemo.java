package com.xworkz.map.hashTable;

import java.util.Hashtable;

public class HashTableDemo {
public static void main(String[] args) {
	Hashtable<String, String> ht = new Hashtable<>();
	
	ht.put("India", "New Delhi");
	ht.put("USA", "Washington DC");
	ht.put("England", "London");
	ht.put("Nepal", "Katmandu");
	ht.put("Japan", "Tokya");
//	ht.put(key, value);
	ht.put("England", "London");
	
	System.out.println(ht);
}
}

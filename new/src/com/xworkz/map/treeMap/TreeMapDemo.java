package com.xworkz.map.treeMap;

import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap<String,String> tm = new TreeMap<>();
	tm.put("KGF", "yash");
	tm.put("Bahubali", "prabhas");
	tm.put("Robert", "sudeep");
	tm.put("Master", "Vijay");
	
	System.out.println(tm);
}
}

package com.xworkz.map.hashMap.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashmapDemo2 {
public static void main(String[] args) {
	Company c1 = new Company("oneplus");
	Company c2 = new Company("realme");
	Company c3 = new Company("apple");
	
	Models m1 = new Models("oneplus 8t", 45000);
	Models m2 = new Models("oneplus 8pro", 46000);
	Models m3 = new Models("realme 7pro", 20000);
	Models m4 = new Models("realme 6", 15000);
	Models m5 = new Models("iphone12", 85000);
	Models m6 = new Models("iphone11", 55000);
	
	ArrayList<Models> oneplus = new ArrayList<>();
	oneplus.add(m1);
	oneplus.add(m2);
	
	ArrayList<Models> realme = new ArrayList<>();
	realme.add(m3);
	realme.add(m4);
	
	ArrayList<Models> apple = new ArrayList<>();
	apple.add(m5);
	apple.add(m6);
	
	HashMap<Company, ArrayList<Models>> hm = new HashMap<>();
	hm.put(c1, oneplus);
	hm.put(c2, realme);
	hm.put(c3, apple);
	
	for(Map.Entry<Company, ArrayList<Models>> entry : hm.entrySet()) {
		if (entry.getKey().name.equals("realme")) {
			for (Models models : entry.getValue()) {
				System.out.println(models);
			}
		}
	}
	
	
}
}

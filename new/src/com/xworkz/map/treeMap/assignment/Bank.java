package com.xworkz.map.treeMap.assignment;

public class Bank implements Comparable {

	String name;

	public Bank(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		String name1 = this.name;
		String name2 = ((Bank)o).name;
		return name1.compareTo(name2);
	}
	
	
}

package com.xworkz.set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet<>(new MyComparator2());
		
		ts.add("asha");
		ts.add("supriya");
		ts.add("mamata");
		ts.add("suhel");
		ts.add("soubhagya");
		ts.add("ratish");
		ts.add("prathima");
		
		System.out.println(ts);
	}
}

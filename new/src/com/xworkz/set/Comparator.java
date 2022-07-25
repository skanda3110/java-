package com.xworkz.set;

import java.util.TreeSet;

public class Comparator {
public static void main(String[] args) {
	TreeSet ts = new TreeSet<>(new MyComaprator());
		ts.add(5);
		ts.add(4);
		ts.add(3);
		ts.add(2);
		ts.add(1);
		System.out.println(ts);
}
}

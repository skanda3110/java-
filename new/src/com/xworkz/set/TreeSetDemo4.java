package com.xworkz.set;

import java.util.TreeSet;

public class TreeSetDemo4 {
public static void main(String[] args) {
	TreeSet ts = new TreeSet(new MyComparator4());
	ts.add("black");
	ts.add("white");
	ts.add("pink");
	ts.add("blue");
	ts.add("violet");
	ts.add("orange");
	ts.add("yellow");
	ts.add(new StringBuffer("red"));
	ts.add("hi");
	
	System.out.println(ts);
}
}

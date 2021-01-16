package com.xworkz.set;

import java.util.TreeSet;

public class TreeSetDemo3 {
public static void main(String[] args) {
	TreeSet ts = new TreeSet(new MyComparator3());
	
	ts.add(new StringBuffer("wonder land"));
	ts.add(new StringBuffer("Disney world"));
	ts.add(new StringBuffer("fairytal "));
	ts.add(new StringBuffer("Black thunder"));
	ts.add(new StringBuffer("marvels"));
	ts.add(new StringBuffer("star wars"));
	System.out.println(ts);
}
}

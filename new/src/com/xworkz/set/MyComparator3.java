package com.xworkz.set;

import java.util.Comparator;

public class MyComparator3 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
//		return s1.compareTo(s2);
	}

}

package com.xworkz.set;

import java.util.Comparator;

public class MyComaprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 =(Integer)o1;
		Integer i2 = (Integer)o2;
	return i2.compareTo(i1);
		
	}

}

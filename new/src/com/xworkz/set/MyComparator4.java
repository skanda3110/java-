package com.xworkz.set;

import java.util.Comparator;

public class MyComparator4 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		Integer l1 = s1.length();
		Integer l2 = s2.length();
		
		if (l1<l2) {
			return -1;
			
		}
		else if (l1>l2) {
			return 1;
		}
		else {
			return s1.compareTo(s2);
		}
	}

}

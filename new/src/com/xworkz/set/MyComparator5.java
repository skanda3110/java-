package com.xworkz.set;

import java.util.Comparator;

public class MyComparator5 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student student1 = (Student)o1;
		Student student2 = (Student)o2;
		
		String s1 = student1.name;
		String s2 = student2.name;
		return s1.compareTo(s2);
		
	}
}

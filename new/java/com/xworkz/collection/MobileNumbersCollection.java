package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumbersCollection {
	
	public static void main(String[] args) {
		
		Collection<Long> monileNo = new ArrayList<>();
		
		monileNo.add(8532147568l);
		monileNo.add(8532147567l);
		monileNo.add(8532147568l);
		monileNo.add(5234785641l);
		monileNo.add(8532147562l);
		monileNo.add(8532147568l);
		monileNo.add(8532147563l);
		monileNo.add(8532147568l);
		monileNo.add(8532147561l);
		monileNo.add(8532147568l);
		
		Iterator<Long> iterator = monileNo.iterator();
	    while (iterator.hasNext()) {
	    	long num = iterator.next();
			if (num%10 > 3) {
				System.out.println(num);
			}
			
		}
		
	}

}

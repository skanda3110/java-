package com.xworkz.apti_programs;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemovingDuplicatesFromArray {

	public static void main(String[] args) {
		
		Integer[] num = new Integer[] {1,2,5,2,3,5};
		System.out.println(Arrays.toString(num));
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(Arrays.asList(num));
		
		Integer[] numWithotDupkicate = lhs.toArray(new Integer[] {});
		System.out.println(Arrays.toString(numWithotDupkicate));
		
	}
}

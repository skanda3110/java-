package com.xworkz.apti_programs;

import java.util.HashSet;

public class ArrayDupSorting {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,5,4,5};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		
		for (Integer integer : hs) {
			System.out.print(integer+",");
		}
	}
}

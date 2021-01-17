package com.xworkz.apti_programs;

public class RemEleFromArray {
public static void main(String[] args) {
	int[] arr = {1,2,3,5,6,4,8};
	int index = 0;
	
	int[] arr1 = new int[arr.length-1];
	
	for (int i = 0 , k = 0; i < arr1.length; i++) {
		
		if (i == index) {
			continue;
			
		}
		arr1[k] = arr[i];
		k++;
		
	}
	
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]+" ");
	}
}
}

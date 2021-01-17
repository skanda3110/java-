package com.xworkz.apti_programs;

public class ConcatinationArray {
public static void main(String[] args) {
	
	int[] arr1 = {1,2,3,4,5,9};
	int[] arr2 = {5,6,7,8};
	int[] result = new int[arr1.length+arr2.length];
	int i=0;
	int k= 0;
	for (; i < arr1.length && i < arr2.length; i++) {
		result[k]=arr1[i];
		k++;
		result[k] = arr2[i];
		k++;
	}
	for (; i < arr1.length; i++) {
		result[k]=arr1[i];
		k++;
	}
	for (; i < arr2.length; i++) {
		result[k]=arr2[i];
		k++;
	}
	for (int j = 0; j < result.length; j++) {
		System.out.print(result[j]);
	}
}
}

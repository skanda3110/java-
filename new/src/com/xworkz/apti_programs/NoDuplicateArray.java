package com.xworkz.apti_programs;

public class NoDuplicateArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,1,3,4,5,2};
		int[] arr2 = new int[arr1.length];
		int m=0;
		int n = arr1.length;
		
		for (int i = 0; i < arr1.length; i++) {
			int count=0;
			for (int j = i+1; j < arr2.length; j++) {
				if (arr1[i] != arr1[j]) {
					continue;
				}
				count++;
			}
			if (count==0) {
				arr2[m] = arr1[i];
				m++;
			}
			else {
				n--;
			}
		}
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
		int[] arr3 = new int[n];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr2[i];
			
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+",");
		}
	}
}

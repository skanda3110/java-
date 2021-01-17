package com.xworkz.apti_programs;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {1,5,5,3,1,8,9,4};
		int temp = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j+1] < arr[j]) {
					temp = arr[j+1];
					 arr[j+1] =  arr[j] ;
					arr[j] = temp;
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}

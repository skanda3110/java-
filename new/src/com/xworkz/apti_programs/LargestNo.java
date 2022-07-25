package com.xworkz.apti_programs;

public class LargestNo {
public static void main(String[] args) {
	int[] arr = {100,90,40,50,88,66,42};
	int first ,second , third;
	first = second = third = Integer.MIN_VALUE;
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>first) {
			third= second;
			second=first;
			first=arr[i];
		}
		else if (arr[i]>second) {
			third=second;
			second=arr[i];
		}
		else if (arr[i]>third) {
			third=arr[i];
		}
		
	}
	System.out.println(first);
	System.out.println(second);
	System.out.println(third);
}
}

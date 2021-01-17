package com.xworkz.apti_programs;

public class BiggestElement {
public static void main(String[] args) {
	
	int[] arr =  {100,0,5,25,23,66,44};
	int firstbig = arr[0];
	int secbig = arr[1];
	
	for (int i = 0; i < arr.length; i++) {
		if (firstbig<arr[i]) {
			
			secbig=firstbig;
			firstbig=arr[i];
		}
		else if (secbig<arr[i] && arr[i]!=firstbig) {
			secbig=arr[i];
		}
		
	}
	System.out.println(firstbig);
	System.out.println(secbig);
}
}

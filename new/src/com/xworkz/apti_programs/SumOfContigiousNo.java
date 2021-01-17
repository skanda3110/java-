package com.xworkz.apti_programs;

public class SumOfContigiousNo {
public static void main(String[] args) {
	int[] arr = {1,12,5,-33,6,8};
	int sum = 0;
	int totalsum = 0;
    int j=0 , k = 0;	
	
	for (int i = 1; i < arr.length; i++) {
		 
			sum = arr[i-1]+arr[i];
			if (sum>totalsum) {
				totalsum = sum;
				j = i-1;
				k = i;
			}
}
	System.out.println("Largest contiguous sum is "+totalsum+" at index "+j+" and "+k);
}
}

package com.xworkz.apti_programs;

import java.util.Iterator;

public class FibonacciNum {

	public static void main(String[] args) {
		int n= 20;
		
	    for (int i = 1; i <=n; i++) {
	    	
	    	System.out.print(fib(i)+",");
			
		}
		
	}

	private static int fib(int n) {
		if (n==1 ) {
			return 0;
			
		}
		else if (n==2) {
			return 1;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
		
		
	}
}

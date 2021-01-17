package com.xworkz.apti_programs;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double temp = 0;
		
		double sr = num/2;
		
		do {
			temp = sr;
			
			sr = (temp+(num/temp))/2; // newton's method for square root
		} while ((temp-sr) != 0);
		
		System.out.println(sr);
		
	}
}

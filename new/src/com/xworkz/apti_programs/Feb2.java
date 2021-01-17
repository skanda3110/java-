package com.xworkz.apti_programs;

public class Feb2 {

	public static void main(String[] args) {
		int n = 10;
		int feb1 = 0 , feb2 =1;
		int temp = 0;
		
		
		for (int i = 0; i <= n; i++) {
			temp =feb1+feb2;
			feb1=feb2;
			feb2=temp;
			System.out.println(temp);
		}	
	}
}

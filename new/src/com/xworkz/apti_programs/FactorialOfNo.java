package com.xworkz.apti_programs;

import java.util.Scanner;

public class FactorialOfNo{
	static int fact(int n) {
		if (n==0) {
			return 1;
		}
		else
			return n*fact(n-1);
	}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number :");
	int num = sc.nextInt();
	int fact = fact(num);
	System.out.println("Factorial of "+num+" is "+fact);
}

}


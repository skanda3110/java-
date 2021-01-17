package com.xworkz.apti_programs;

public class Pattarn2 {
public static void main(String[] args) {
	
	String name = "suhel";
	
	for (int i = 1; i <= name.length(); i++) {
		for (int j = name.length()-1; j >= i; j--) {
			System.out.print(" ");
			
		}
		for (int k = 0; k < i ; k++) {
			System.out.print(name.charAt(k)+" ");
		}
		System.out.println();
	}
}
}

package com.xworkz.apti_programs;

public class Pattern3 {
public static void main(String[] args) {
	
	int NoOfLines = 6;
	int space = NoOfLines-1;
	int collength=1;
	
	for (int i = 0; i <NoOfLines; i++) {
		int x = 1;
		for (int j = 0; j < space; j++) {
			System.out.print(" ");
		}
		for (int k = 0; k < collength; k++) {
			if (!(k%2 == 0)) {
				System.out.print("*");
			}
			else {
				System.out.print(x);
				x++;
			}
		}
		collength+=2;
		space--;
		System.out.println();
	}
}
}

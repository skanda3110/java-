package com.xworkz.uncheckedException3;

import java.util.Scanner;

public class Explorer extends Copy {
public static void main(String[] args) {
	File file1 = new File();
	file1.fileName="GTA5";
	file1.size=90.00;
	file1.dateOfCreation="18-12-2020";
	
	File file2 = new File();
	file2.fileName="Fortnite";
	file2.size=60.00;
	file2.dateOfCreation="18-12-2020";
	
	System.out.println("enter the file to be copy");
	System.out.println("1) GTA");
	System.out.println("2) Fortnite");
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	
	try {
		if (s==1) {
			copy(file1);
		}
		else if (s==2) {
			copy(file2);
		}
		else {
			throw new FileDoesNotExistEXception("file does not exist");
		}
	} catch (RuntimeException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}
}

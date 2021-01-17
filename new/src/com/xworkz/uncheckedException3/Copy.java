package com.xworkz.uncheckedException3;

import java.util.Scanner;

public class Copy {
static void copy(File f) {
	System.out.println("select the destination drive");
	System.out.println("drive D");
	System.out.println("drive E");
	Scanner sc = new Scanner(System.in);
	
	String s = sc.nextLine();
	switch (s) {
	case "d":{
		if (f.size<50.00) {
			System.out.println(f.fileName+"copied successfully");
			break;
		}
		else {
			throw new InsufficiantStorageException("Insufficient Storage");
		}
	}
	case "e":{
		if (f.size<100.00) {
			System.out.println(f.fileName+" copied successfully");
			break;
		}
		else {
			throw new InsufficiantStorageException("Insufficient Storage");
		}
	}
		
		
	default:{
		System.out.println("folder does not exist");
		copy(f);
		
	}
	}
}
}

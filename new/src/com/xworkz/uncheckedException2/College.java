package com.xworkz.uncheckedException2;

import java.awt.FontFormatException;
import java.util.Scanner;

public class College {
	static void options(Student s) {
		System.out.println("Please select a valid course");
		System.out.println("1)Course A");
		System.out.println("2)Course B");
		System.out.println("3)Course C");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		switch (i) {
		case 1:{
			if(s.marksub1>40)
			{
				System.out.println("Congratulations!! "+s.name+" You have been succefully enrolled to the Course A");
				break;
			}
			else {
				throw new notEligibleForTheCourseException("Sorry!! You are not eligible for the course");
			}
		}
		case 2:{
			if(s.marksub2>35)  {
				System.out.println("Congratulations!! "+s.name+" You have been succefully enrolled to the Course B");
				break;
			}
			else {
				throw new notEligibleForTheCourseException("Sorry!! You are not eligible for the course");
			}
		}
		case 3:{
			if(s.marksub1 > 50 && s.marksub2>50 && s.marksub3>50) {
				System.out.println("Congratulations!! "+s.name+" You have been succefully enrolled to the Course C");
			break;
			}
			else {
				throw new notEligibleForTheCourseException("Sorry!! You are not eligible for the course");
			}
		}

		default:{
			System.out.println("Sorry the course does not exist");
			options(s);
		}
		}
		
	}
	

}

package com.xworkz.uncheckedException2;

import java.util.Scanner;

public class CollegeWebsite extends College{

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "SUHEL PASHA";
		student1.rollNo = 10001;
		student1.marksub1 = 40;
		student1.marksub2 = 50;
		student1.marksub3 =60;
		
		Student student2 = new Student();
		student2.name = "SKANDA B";
		student2.rollNo = 10002;
		student2.marksub1 = 60;
		student2.marksub2 = 80;
		student2.marksub3 =70;
		
		System.out.println("Welcome!!");
		System.out.println("Eligibility Criteria:");
		System.out.println("Course A:Candidate must have more than 40 Marks in subject 1");
		System.out.println("Course B:Candidate must have more than 35 Marks in subject 2");
		System.out.println("Course C:Candidate must have cleared all subjects with 50 marks and above");
		System.out.println("Please enter your roll no");
		Scanner scanner = new Scanner(System.in);
		int rno = scanner.nextInt();
		
		try {
			if(rno == student1.rollNo)
				options(student1);
			else if(rno == student2.rollNo)
				options(student2);
			else {
				throw new invalidRollnoException("The Rollno does not exist!!");
			}
			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			
		}
		

	}

}

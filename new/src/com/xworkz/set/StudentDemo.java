package com.xworkz.set;

import java.util.TreeSet;

public class StudentDemo {
public static void main(String[] args) {
	
	Student student1 = new Student(1001, "suhel");
	Student student2 = new Student(1002, "srinivas");
	Student student3 = new Student(1003, "saranu");
	Student student4 = new Student(1004, "suma");
	Student student5 = new Student(1005, "sathya");
	Student student6 = new Student(1006, "naheeda");
	
	TreeSet<Student> studentSet = new TreeSet<Student>(new MyComparator5());
	studentSet.add(student6);
	studentSet.add(student5);
	studentSet.add(student4);
	studentSet.add(student3);
	studentSet.add(student2);
	studentSet.add(student1);
	
	for (Student s : studentSet) {
		System.out.println(s.id+" "+s.name);
	}
}
}

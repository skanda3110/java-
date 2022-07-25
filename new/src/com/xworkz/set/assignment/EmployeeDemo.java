package com.xworkz.set.assignment;

import java.util.TreeSet;

public class EmployeeDemo {
public static void main(String[] args) {
	
	Employee employee1 = new Employee("skanda", 001);
	Employee employee2 = new Employee("suhel", 002);
	Employee employee3 = new Employee("pasha", 003);
	
	TreeSet<Employee> ts = new TreeSet<Employee>(new MyComparator());
	ts.add(employee1);
	ts.add(employee2);
	ts.add(employee3);
	
	for (Employee employee : ts) {
		System.out.println(employee.id+" "+employee.name);
	}
	
}
}

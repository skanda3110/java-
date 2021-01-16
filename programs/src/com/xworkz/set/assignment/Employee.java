package com.xworkz.set.assignment;

public class Employee implements Comparable {
String name;
int id;
public Employee(String name, int id) {
	
	this.name = name;
	this.id = id;
	
	
}
@Override
public int compareTo(Object o) {
	Employee e = (Employee)o;
	int id1 = this.id;
	int id2 = e.id;
	if (id1>id2) {
		return 1;
	}
	else if (id1<id2) {
		return -1;
	}
	else {
		return 0;
	}
	
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + "]";
}

}

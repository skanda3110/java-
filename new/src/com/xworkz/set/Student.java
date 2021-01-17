package com.xworkz.set;

public class Student implements Comparable {
int id;
String name;
public Student(int id, String name) {
	
	this.id = id;
	this.name = name;
	
}
@Override
public int compareTo(Object o) {
	Student s = (Student)o;
	int sid1 = this.id;
	int sid2 = s.id;
	if (sid1>sid2) {
		return 1;
	}
	else if (sid1<sid2) {
		return -1;
	}
	else {
		return 0;
	}
	
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}


}

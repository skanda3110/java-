package com.xworkz.collection_demo.list;

public class Calander {
	int year;
	int month;
	int day;
	
	public Calander(int year,int month,int day) {
		// TODO Auto-generated constructor stub
		this.year=year;
		this.month=month;
		this.day=day;
		
	}

	@Override
	public String toString() {
		return "Calander [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
}


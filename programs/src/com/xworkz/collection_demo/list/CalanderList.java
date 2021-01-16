package com.xworkz.collection_demo.list;

import java.util.ArrayList;

public class CalanderList {
public static void main(String[] args) {
	
	ArrayList<Calander> listOfCalander = new ArrayList<Calander>();
	
	Calander calander1 = new Calander(2020, 01, 01);
	Calander calander2 = new Calander(2021, 01, 01);
	Calander calander3 = new Calander(2022, 01, 01);
	Calander calander4 = new Calander(2023, 01, 01);
	
	listOfCalander.add(calander1);
	listOfCalander.add(calander2);
	listOfCalander.add(calander3);
	listOfCalander.add(calander4);
	
	for (Calander c1 : listOfCalander) {
		System.out.println(c1);
	}
}
}

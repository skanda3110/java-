package com.xworkz.map.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyMangement {
public static void main(String[] args) {
	Company c1 = new Company("TCS");
	Company c2 = new Company("Infosys");
	Company c3 = new Company("Google");
	Company c4 = new Company("Apple");
	Company c5 = new Company("Cognizant");
	
	Employees e1 = new Employees("prathima");
	Employees e2 = new Employees("nithya");
	Employees e3 = new Employees("skanda");
	Employees e4 = new Employees("supriya");
	Employees e5 = new Employees("soubhagya");
	Employees e6 = new Employees("suma");
	Employees e7 = new Employees("naheeda");
	Employees e8 = new Employees("asha");
	Employees e9 = new Employees("sharanu");
	Employees e10 = new Employees("mamatha");
	Employees e11 = new Employees("rathish");
	Employees e12 = new Employees("suhel");
	Employees e13 = new Employees("srinivas");
	
	List<Employees> tcsEmployeeList = new ArrayList<Employees>();
	tcsEmployeeList.add(e1);
	tcsEmployeeList.add(e2);
	tcsEmployeeList.add(e3);
	
	List<Employees> infosysemployeeList = new ArrayList<Employees>();
	infosysemployeeList.add(e4);
	infosysemployeeList.add(e5);
	infosysemployeeList.add(e6);
	
	List<Employees> googleEmployeeList = new ArrayList<Employees>();
	googleEmployeeList.add(e7);
	googleEmployeeList.add(e8);
	googleEmployeeList.add(e9);
	
	List<Employees> appleEmployeesList = new ArrayList<Employees>();
	appleEmployeesList.add(e10);
	appleEmployeesList.add(e11);
	
	List<Employees> cognizantEmployeesList = new ArrayList<Employees>();
	cognizantEmployeesList.add(e12);
	cognizantEmployeesList.add(e13);
	
	HashMap<Company, List<Employees>> map = new HashMap<Company, List<Employees>>();
	map.put(c1, tcsEmployeeList);
	map.put(c2, infosysemployeeList);
	map.put(c3, googleEmployeeList);
	map.put(c4, appleEmployeesList);
	map.put(c5, cognizantEmployeesList);
	
	for (Map.Entry<Company, List<Employees>> entry : map.entrySet()) {
		Company company = entry.getKey();
		if (company.name.equals("Google")) {
			for (Employees employees : entry.getValue()) {
				System.out.println(employees.name);
			}
		}
	}
}
}

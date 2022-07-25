package com.xworkz.map.treeMap.assignment;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Bank b1 = new Bank("SBI");
		Bank b2 = new Bank("karnataka bank");
		Bank b3 = new Bank("paytm bank");
		
		Customer c1 = new Customer(101, 500.0);
		Customer c2 = new Customer(102, 200.0);
		Customer c3 = new Customer(103, 1000.0);
		
		Customer c4 = new Customer(201, 500.0);
		Customer c5 = new Customer(202, 200.0);
		Customer c6 = new Customer(203, 1000.0);
		
		Customer c7 = new Customer(301, 500.0);
		Customer c8 = new Customer(302, 200.0);
		Customer c9 = new Customer(303, 1000.0);
		
		ArrayList<Customer> sbiCustomers = new ArrayList<>();
		sbiCustomers.add(c1);
		sbiCustomers.add(c2);
		sbiCustomers.add(c3);
		
		ArrayList<Customer> karbankCustomers = new ArrayList<>();
	    karbankCustomers.add(c4);
	    karbankCustomers.add(c5);
	    karbankCustomers.add(c6);
	    
	    ArrayList<Customer> paytmCustomers = new ArrayList<>();
	    paytmCustomers.add(c7);
	    paytmCustomers.add(c8);
	    paytmCustomers.add(c9);
	    
	    TreeMap<Bank, ArrayList<Customer>> treeMap = new TreeMap<>();
	    treeMap.put(b1, sbiCustomers);
	    treeMap.put(b2, karbankCustomers);
	    treeMap.put(b3, paytmCustomers);
	    
	    
	    for (Map.Entry<Bank, ArrayList<Customer>> customer : treeMap.entrySet()) {
			if (customer.getKey().name.equals("SBI")) {
				for (Customer customer2 : customer.getValue()) {
					System.out.println(customer2);
				}
			}
		}
				
				
				
				
				
	}
}

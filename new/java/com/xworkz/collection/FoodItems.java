package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import com.sun.java.util.jar.pack.Instruction.Switch;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class FoodItems {
	
	public static void main(String[] args) {
		
		Collection<String> foodItems = new ArrayList<>();
		
		String f1 = "apple";
		String f2 = "ice cream";
		String f3 = "cake";
		String f4 = "pizza";
		String f5 = "rice";
		
		foodItems.add(f1);
		foodItems.add(f2);
		foodItems.add(f3);
		foodItems.add(f4);
		foodItems.add(f5);
		
		System.out.println("select the food item");
  		
		Iterator<String> iterator = foodItems.iterator();
		
		int num = 1;
		while (iterator.hasNext()) {
			System.out.println(num +" "+ iterator.next());
			num++;
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch (n) {
		case 1:
			System.out.println(f1);
			break;
		case 2:
			System.out.println(f2);
			break;
		case 3:
			System.out.println(f3);
			break;
		case 4:
			System.out.println(f4);
			break;
		case 5:
			System.out.println(f5);
			break;
		default:
			System.out.println("Item not found");
			break;
		}
		
	}
	


}

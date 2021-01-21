package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator; 
public class EmailsCollection {
	
	public static void main(String[] args) {
		
		Collection<String> emails = new ArrayList<>();

		emails.add("rsteiner@gmail.com");
		emails.add("rsteiner@gmail.com");
		emails.add("fatelk@yahoo.ca");
		emails.add("mrdvt@optonline.net");
		emails.add("ajohnson@aol.com");
		emails.add("flavell@yahoo.ca");
		emails.add("fatelk@yahoo.ca");
		emails.add("skythe@hotmail.com");
		emails.add("shrapnull@verizon.net");
		emails.add("peoplesr@me.com");
		emails.add("elmer@comcast.net");
		emails.add("oster@msn.com");
		emails.add("shrapnull@verizon.net");
		emails.add("doormat@yahoo.com");
		emails.add("peoplesr@me.com");
		emails.add("kingma@gmail.com");
		emails.add("mrdvt@optonline.net");
		
		
		HashSet<String> hashSet = new HashSet<>(emails);
		for (String string : hashSet) {
			System.out.println(string);
		}
		
		
		
		
		
//		
//		String[] arr = emails.toArray(new String[0]);
//		for (int i = 0; i < arr.length; i++) {
//			String email = arr[i];
//			System.out.println(email);
//			
//
//		}
//		
//		
	 
		
//		Iterator<String> iterator = emails.iterator();
//		
//		while (iterator.hasNext()) {
//			String s = iterator.next();
//			if (iterator.hasNext()) {
//				String s2 = iterator.next();
//				if (s2.equals(s)) {
//					System.out.println(s);
//				}
//				else {
//					System.out.println(s2);
//				}
//			}
//			
//		}
	    	
		
		
		
//		Iterator<String> iterator = emails.iterator();
//	    while (iterator.hasNext()) {
//			
//	    	String s = iterator.next();
//	    	iterator.hasNext();
//	    	String s1 = iterator.next();
//	    	
//	    	if (s.equals(s1)) {
//				System.out.println("s1 " +s1);
//			}
//	    	else {
//				System.out.println("s " +s);
//		}
//		}	
//	    	
		
		
		
		
		
		}
		
	}













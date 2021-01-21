package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MailsCollection {
	
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
		
		Iterator<String> iterator = emails.iterator();
		
		Collection<String> CopyOfEmails = new ArrayList<>();
		
		while (iterator.hasNext()) {
			String s = iterator.next();
			Iterator<String> iterator2 = emails.iterator();
			int count = 0;
			while (iterator2.hasNext()) {
				String s1 = iterator2.next();
				if (s.equals(s1)) {
					count++;
				}
				
			}
			if (count > 1) {
				if(!CopyOfEmails.contains(s)) {
				CopyOfEmails.add(s);
				}
			}
			
		}
		Iterator<String> iterator3 = CopyOfEmails.iterator();
		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
			
		}
	}

}

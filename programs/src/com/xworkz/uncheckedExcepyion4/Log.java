package com.xworkz.uncheckedExcepyion4;

import java.util.Scanner;

public class Log extends Password {
public static void main(String[] args) {
	User user1 = new User();
	user1.username="skanda";
	user1.Password="p01";
	
	User user2 = new User();
	user2.username="suhel";
	user2.Password="p02";
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the username :");
	String s = sc.nextLine();
	
	try {
		if (s.equals(user1.username)) {
			password(user1);
		}
		else if (s.equals(user2.username)) {
			password(user2);
		}
		else {
			throw new UserNotFoundException("user not found..");
		}
			
	} catch (RuntimeException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	
}
}

package com.xworkz.collection_demo.stack;

import java.util.Stack;

public class StackMethods {
public static void main(String[] args) {
	
	Stack<String> s = new Stack<String>();
	
	s.push("name");
	s.push("name2");
	System.out.println(s);//Pushes an item onto the top of this stack.
	
	s.pop();/**Removes the object at the top of this stack and returns that
     object as the value of this function. */
	
	s.peek();/**Looks at the object at the top of this stack without removing it
      from the stack.@return  the object at the top of this stack (the last item
      of the {@code Vector} object).*/
	
	s.empty();//Tests if this stack is empty.
	
	s.search("name");  //Returns the 1-based position where an object is on this stack.

	
}
}

package com.col;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s=new Stack();
		
		s.add(90);
		
		s.add(34);
		s.add(45);
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		System.out.println(s);
		
		s.push(67);
		System.out.println(s);
		
		s.push(34);
		
		System.out.println(s.search(34));
		

	}

}

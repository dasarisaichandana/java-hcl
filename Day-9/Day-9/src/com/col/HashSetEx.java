package com.col;


import java.util.LinkedHashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs=new LinkedHashSet();
		
		System.out.println(hs.add(10)); 
		hs.add(20);
		System.out.println(hs.add(10));
		
		hs.add(45);
		hs.add(23);
		
		System.out.println(hs);
		
		
	}

}

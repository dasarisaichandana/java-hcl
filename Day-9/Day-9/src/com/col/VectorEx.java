package com.col;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v=new Vector();
		
		
		v.add(10);
		v.add(34);
		v.add(15);
		v.add(67);
		
		System.out.println(v);
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());		
		
		}
		
		Iterator it=v.iterator();
		
		ListIterator lit=v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(it.getClass().getName());
		System.out.println(lit.getClass().getName());
		
		
		
		
		
		

	}

}

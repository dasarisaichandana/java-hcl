package com.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraListEx {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(10.9);
		al.add("shiva");		
		System.out.println(al);		
		al.add("shiva");		
		System.out.println(al);		
		ArrayList al1=new ArrayList();		
		al1.add(5.6);
		al1.add(23);		
		al.addAll(al1);
		System.out.println(al);
		
		System.out.println(al1);
		al1.clear();
		System.out.println(al1);		
		System.out.println(al.contains("shiva"));
		System.out.println(al.size());	
		Object o[]=al.toArray();
		
		ArrayList al2=new ArrayList();
		
		al2.add(12);
		al2.add(56);
		al2.add(43);
		al2.add(56);
		al2.add(89);
		
		Iterator it=al2.iterator();	
		
		while(it.hasNext())
		{
			Integer n=(Integer) it.next();
			if(n%2==0)
			{
				System.out.println(n);
			}
			else
			{
				it.remove();
			}
			
		}
		
		System.out.println(al2);
		
		
		ListIterator lit=al2.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		

	}

}

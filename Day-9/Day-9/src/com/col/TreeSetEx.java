package com.col;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts=new TreeSet();
		
		ts.add(45);
		ts.add(67);
		ts.add(23);
		ts.add(41);
		ts.add(2);
		ts.add(95);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts);		
		System.out.println(ts.headSet(44));		
		System.out.println(ts.tailSet(45));		
		System.out.println(ts.subSet(23, 67));
		
		System.out.println(ts.ceiling(50));//67		
		System.out.println(ts.floor(45));//45		
		System.out.println(ts.higher(50));//67		
		System.out.println(ts.lower(45));//41		
		System.out.println(ts.headSet(41,true));//2,23,41
		System.out.println(ts.tailSet(45,false));//45,67,95
		
		System.out.println(ts.subSet(23,false, 45,true));//41,45
		
		
		System.out.println(ts);
		
		ts.pollFirst();
		
		System.out.println(ts);
		
		ts.pollLast();
		System.out.println(ts);
		
		Iterator it=ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
	}

}

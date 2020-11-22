package com.col;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
		if(s1.sid<s2.sid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
		
	}

}

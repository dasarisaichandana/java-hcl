package com.col;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		
		
		TreeSet ts=new TreeSet(new MyComparator());
		
		
		Student s1=new Student(420,"rajesh","nellore");
		Student s2=new Student(840,"shiva","hyd");
		
		Student s3=new Student(333,"vigni","madhurai");
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.println(ts);
		
		
		

	}

}

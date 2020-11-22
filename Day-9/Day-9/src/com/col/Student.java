package com.col;

public class Student implements Comparable{
	
	int sid;
	String sname;
	String sadd;
	public Student(int sid, String sname, String sadd) {
		
		this.sid = sid;
		this.sname = sname;
		this.sadd = sadd;
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		if(this.sid<s.sid)//s2.sid < s1.sid
		{
			return -1;
		}
		else
		{
			return 1;
		}
		
		
		
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + "]";
	}
	
	
	

}

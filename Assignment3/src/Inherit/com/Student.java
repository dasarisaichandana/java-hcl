package Inherit.com;
//parentclass
public class Student {
	String name;
	int rollno;
	int marks;
	}
//child class
class Myrecord extends Student{
	double percentage;
	public void display() {
		System.out.println(name+" -"+rollno+"-"+marks+"-"+percentage);
		
	}

	

public static void main(String[]args) {
	Myrecord m=new Myrecord();
	m.name="sai";
	m.rollno=124;
	m.marks=50;
	m.percentage=90.5;
	
	m.display();
	
	
}
}
	


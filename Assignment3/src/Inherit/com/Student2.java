package Inherit.com;
//parent class
public class Student2 {
	String name;
	int rollno;
	int marks;
	}
//child class
class Details extends Student2{
	String address;
	public void display() {
		System.out.println(name+" -"+rollno+"-"+marks+"-"+address);
		}
		
	

	

public static void main(String[]args) {
	Details m=new Details();
	m.name="sai chandana";
	m.rollno=124;
	m.marks=50;
	m.address="some where";
	
	m.display();


}
	}

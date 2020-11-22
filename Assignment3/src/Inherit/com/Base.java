package Inherit.com;
import java.util.Scanner;

//parent class
public class Base {

	static Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
	public Base(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
 Base(){
	
}
	
	
	}
//Derived class

class Derived extends Base{


	
	/*public Derived(int a, int b) {
	super(a, b);
	
	
	}*/
	public void dispmax(int a,int b) {
		
			System.out.println( "max num is"+Math.max(a,b));
}
public void dispmin(int a,int b) {
	System.out.println("min num is"+Math.min(a, b));
		
		
	}

//main class
	

public static void main(String[]args) {
	Derived d=new Derived();
	
	d.dispmax(d.a,d.b);
	d.dispmin(d.a,d.b);
	
}
}

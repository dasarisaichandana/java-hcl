package Inter.com;

import Inter.com.University.Electronics.Computer;
import Inter.com.University.Electronics.Computer.Mechanical;


public class Government {
	

	public static void main(String[] args) {
		System.out.println("government close");
		University u=new University();
		u.close();
		University.Electronics e=new University.Electronics();
		e.close();
		University.Electronics.Computer c= new University.Electronics.Computer();
		c.close();
		University.Electronics.Computer.Mechanical m= new University.Electronics.Computer.Mechanical();
		m.close();

	}
	//University some=new University() {
	void close1() {
	}
	
}




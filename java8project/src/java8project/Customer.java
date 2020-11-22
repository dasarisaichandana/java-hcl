package java8project;
import java.util.Scanner;

public class Customer {
	public static void main(String[]args) {
	
	 Scanner s=new Scanner(System.in);
	Display d[]= new Display[2];
	for(int i=0;i<d.length;i++) {
		
	d[i].custid=s.nextInt();
	
	d[i].name=s.next();
	d[i]. mobile=s.nextInt();
	d[i]. emailid=s. next();
	d[i]. address=s.next();
	d[i]. accno=s.nextInt();
	
	}	
	/*public Customer(int custid, String name, int mobile, String emailid, String address, int accno) {
		super();
		this.custid = custid;
		this.name = name;
		this.mobile = mobile;
		this.emailid = emailid;
		this.address = address;
		this.accno = accno;
	}*/
	

 
}
}

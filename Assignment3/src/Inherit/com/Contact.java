package Inherit.com;

public class Contact {
	String contactperson;
	int mobile;
	String email;
	
	
	public Contact(String contactperson, int mobile, String email) {
		super();
		this.contactperson = contactperson;
		this.mobile = mobile;
		this.email = email;
	}


	public void PrintContact() {
		System.out.println(contactperson);
	}

}
class CompanyContact extends Contact{
  String companyname;
  String website;
  String depart;
  int countrycode;
  String address;
  int pin;
  
  public CompanyContact(String contactperson, int mobile, String email, String companyname, String website, String depart,
		int countrycode, String address, int pin) {
	super(contactperson, mobile, email);
	this.companyname = companyname;
	this.website = website;
	this.depart = depart;
	this.countrycode = countrycode;
	this.address = address;
	this.pin = pin;
}

public void PrintContact() {
		System.out.println("");
	}
  }
class EmployeContact extends Contact{
	
	String city;
	String Country;
	int pin;
	String designation;
	
	public EmployeContact(String contactperson, int mobile, String email, String city, String country, int pin,
			String designation) {
		super(contactperson,mobile,email);
		this.city = city;
		this.Country = country;
		this.pin = pin;
		this.designation = designation;
	}

	public void PrintContact() {
		System.out.println("fgfgf");
	}
	
}
 class MainContact{
	public static void main(String[]args) {
		
	

		CompanyContact e=new CompanyContact(null, 0, null, null, null, null, 0, null, 0);
		e.contactperson="sam";
		e.mobile=999999;
		e.email="sai@yahoo.com";
		e.companyname="hcl";
		  e. website="https//hcl.com";
		  e.depart="software";
		  e. countrycode=1234;
		  e. address="somewhere";
		  e. pin=1234;
		
		  e.PrintContact();
	}
}

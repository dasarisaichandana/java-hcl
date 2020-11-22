package Inherit.com;

public class Human {
	String name;
	String gender;
	public Human(String name, String gender) {
		
		this.name = name;
		this.gender = gender;
	}
	public void find(Man m,Woman w) {
		if(m.age1>w.age2) {
			System.out.println("man is elder");
		}
		else  {
			System.out.println(" woman is younger");
		}
		
		
	}
	
	

}
class Man extends Human{
	 int age1;

	public Man(String name, String gender, int age) {
		super(name, gender);
		this.age1=age;
		
	}

	//int age;
	
}
class Woman extends Human{
	 int age2;

	public Woman(String name, String gender, int age) {
		super(name, gender);
		this.age2=age;
		
	
	}
}
	//int age;
	
class Mainhuman{
public static void main(String[]args) {
	Man m=new Man("Kumar","m",45);
	Woman w=new Woman("rani","f",22);
	//Human h=new Man("kumar","M",24);
	//Human h1=new Woman("rani","f",45);
	m.find(m,w);
	
}
}

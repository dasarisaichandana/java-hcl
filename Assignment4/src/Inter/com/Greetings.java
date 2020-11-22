package Inter.com;

public interface Greetings {
	public abstract void Morning();
	public abstract void Afternoon();
	public abstract void Evening() ;
	public abstract void Night();
		
}
class  English implements Greetings{
	public void Morning() {
		System.out.println("good morning");
	}
	public  void Afternoon() {
		System.out.println("good afternoon");
	}
	public  void Evening() {
		System.out.println("good even");
	}
	public  void Night() {
		System.out.println("good night");
		
	}
	
	
}
class  Hindi implements Greetings{
	public void Morning() {
		System.out.println("sunhoday");
	}
	public  void Afternoon() {
		System.out.println("subhpada");
	}
	public  void Evening() {
		System.out.println("subhshyam");
	}
	public  void Night() {
		System.out.println("subhrathri");
		
	}
	
	
}
class Telugu  implements Greetings{
	public void Morning() {
		System.out.println("subhodayamu");
	}
	public  void Afternoon() {
		System.out.println("madhyanam");
	}
	public  void Evening() {
		System.out.println("sayanthram");
	}
	public  void Night() {
		System.out.println("rathri");
		
	}
	
	
}

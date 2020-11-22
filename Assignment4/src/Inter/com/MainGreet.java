package Inter.com;

public class MainGreet {

	public static void main(String[] args) {
		Greetings g=new English();
		g.Morning();
		g.Afternoon();
		g.Evening();
		g.Night();
		g=new Hindi();
		g.Morning();
		g.Afternoon();
		g.Evening();
		g.Night();
		g=new Telugu();
		g.Morning();
		g.Afternoon();
		g.Evening();
		g.Night();

	}

}

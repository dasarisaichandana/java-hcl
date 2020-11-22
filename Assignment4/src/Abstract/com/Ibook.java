package Abstract.com;

public interface Ibook {
	 //static Scanner s= new Scanner(System.in);

	    public  int daysOverDue(int day);
		public  boolean isOverDue(int overdue);
		public  void computerFine(int day);
		
}
	class Book implements Ibook{
	String title;
	String author;
	int dayTaken;
	

		
		public Book(String title, String author, int dayTaken) {
		super();
		this.title = title;
		this.author = author;
		this.dayTaken = dayTaken;
	}
		@Override
		public int daysOverDue(int day) {
			System.out.println("enter the day"+dayTaken);
			int dueDate=14;
			int b=dueDate-day;
			if(b<0) {
				return b;
			}
				else{
				System.out.println("no over due");
				return 0;
			}
			
			}
		@Override
		public boolean isOverDue(int overdue) {
			if(overdue<0) {
				return true;
				}
			else {
				return false;
			}
		
	
		}
	

		@Override
		public void computerFine(int day) {
			int c=daysOverDue(day);
			boolean s=isOverDue(c);
			int f=0;
			int borrow=dayTaken-day;
			if(s==true&&borrow>14) {
				f=c*10;
				
				
			}
			System.out.println("fine"+f);
		    }

			
	}
	class RefiBook implements Ibook{
		String title;
		int dayTaken;
		
        public RefiBook(String title, int dayTaken) {
			super();
			this.title = title;
			this.dayTaken = dayTaken;
		}

		@Override
		public int daysOverDue(int day) {
        	int dueDate=14;
			int b=dueDate-day;
			if(b<0) {
				return b;
			}
			else{
				System.out.println("no over due");
				return 0;
			}
}

		@Override
		public boolean isOverDue(int overdue) {
			if(overdue>0) {
				return true;
			}
			else {
			return false;
			}
		}
		@Override
		public void computerFine(int day){
			
			int c=daysOverDue(day);
			boolean s=isOverDue(c);
			int f=0;
			int borrow=dayTaken-day;
			if(s==true&&borrow>14) {
				f=c*20;
				
				
			}
			System.out.println("fine"+f);
		    }
			
		}
		
	
	class AudioBook implements Ibook{
		String title;
		String author;
		int dayTaken;
		
        public AudioBook(String title, String author, int dayTaken) {
			super();
			this.title = title;
			this.author = author;
			this.dayTaken = dayTaken;
		}

		@Override
		public int daysOverDue(int day) {
        	int dueDate=14;
			int b=dueDate-day;
			if(b<0) {
				return b;
			}
			else{
				System.out.println("no over due");
				return 0;
			}
			
			
		}

		@Override
		public boolean isOverDue(int overdue) {
			if(overdue>0) {
				return true;
			}
			else {
			return false;
			}
			
			
		}

		@Override
		public void computerFine(int day) {
			int c=daysOverDue(day);
			boolean s=isOverDue(c);
			int f=0;
			int borrow=dayTaken-day;
			if(s==true&&borrow>14) {
				f=c*20;
				
				
			}
			System.out.println("fine"+f);
		    }
			
		}
		
	




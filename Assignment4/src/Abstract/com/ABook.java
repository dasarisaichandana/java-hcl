package Abstract.com;

abstract class ABook implements Ibook{

	public static void main(String[] args) {
		Ibook ib=new Book("where is done","shakespere",5);
		ib.computerFine(16);
		ib=new RefiBook("cindrella",6);
		ib.computerFine(15);
		ib=new AudioBook("snow world","disnep",7);
		ib.computerFine(14);
	

	}

}

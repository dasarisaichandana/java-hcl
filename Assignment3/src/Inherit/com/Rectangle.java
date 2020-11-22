package Inherit.com;

public class Rectangle {
	double length;
	double width;
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
	}
	
	
	}
class Box extends Rectangle{
	//double depth;
	public Box(double length, double width) {
		super(length, width);
		}

	 ;
	public void Area(double depth) {
		System.out.println(depth=length*width);
	 
	}
}
	class MainRectangle{
	public static void main(String[]args) {
		Box b= new Box(22, 45);
		b.Area(0);
}
	}

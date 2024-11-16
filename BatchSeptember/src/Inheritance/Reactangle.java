package Inheritance;

public class Reactangle extends Shape{
	
	public int getArea() {
		int length = 50;
		int width = 50;
		int area_of_rectangle = length*width;
		System.out.println(area_of_rectangle);
		return area_of_rectangle;
		
	}
	public  static void main(String[] args) {
		Reactangle obj = new Reactangle();
		obj.getArea();
	}

}

package Inheritance;

public class Son{
	
	final int age = 50;
	
	void display() {
		
		System.out.println(age);
	}
	public static void main(String [] args) {
		Son s = new Son();
		
		s.display();
	}
	
}

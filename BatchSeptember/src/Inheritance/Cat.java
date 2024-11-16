package Inheritance;

public class Cat extends Animal {
	String name3 = "cat";
	void eat() {
		System.out.println("cat is eating");
	}

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.eat();
		
		

	}

}

package Inheritance;

public class Dog extends Animal {
	String name = "Dog";
	void eat() {
		System.out.println(super.name);
		System.out.println("dog is eating");
		super.eat();
	}
	public Dog() {
		super();
		System.out.println("child class constrcutor");
		
	}

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.eat();
		System.out.println(obj.name);
		

	}

}

package Inheritance;

public class Baby_Dog extends Dog {
	String name2 = "Babydog";
	void eat2() {
		System.out.println("Baby dog is eating");
	}

	public static void main(String[] args) {
		Baby_Dog obj = new Baby_Dog();
		
		obj.eat();
		obj.eat2();

	}

}
 
package methodconcept;

public class MethodOverriding2 extends MethodOverriding1 {
	
	String name = "arcus";

	public void add(int a,int b) {     //Method overriding
		int c =a+b;
		System.out.println(c);
		System.out.println("child class method");
	}
	public static void main(String[] args) {
		MethodOverriding1 obj = new MethodOverriding2();    
		obj.add(20, 30);

	}

}

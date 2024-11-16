package abstraction;



public class TestMultipleInheritance implements Parent1,Parent2 {
	
	 public void add() {
		System.out.println("multiple inheritance example");
	}

	public static void main(String[] args) {
		
		TestMultipleInheritance obj = new TestMultipleInheritance();
		obj.add();

	}

}

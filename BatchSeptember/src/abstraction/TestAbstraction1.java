package abstraction;

public class TestAbstraction1 implements AbstractionEx {

	public static void main(String[] args) {
		TestAbstraction1 obj = new TestAbstraction1();
		obj.add();
		obj.subtract();
		

	}

	@Override
	public void add() {
		System.out.println("This is abtract method implementation");
		
	}

	@Override
	public void subtract() {
		System.out.println("This is abtract method implementation1");
		
	}

}

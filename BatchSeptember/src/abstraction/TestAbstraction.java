package abstraction;

public class TestAbstraction extends AbstractEx {
	void code() {
		System.out.println("This is abstract method implementation");
	}
	void work() {
		System.out.println("working");
	}

	public static void main(String[] args) {
		TestAbstraction obj = new TestAbstraction();
		obj.code();
		obj.display();
		System.out.println(obj.result);
		obj.work();
		

	}

}

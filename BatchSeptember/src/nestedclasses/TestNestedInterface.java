package nestedclasses;

public class TestNestedInterface implements Parent.Child {
	 
	public void son() {
		System.out.println("inner interface method block");
	}

	public static void main(String[] args) {
		TestNestedInterface obj = new TestNestedInterface();
		obj.son();
	

	}

}

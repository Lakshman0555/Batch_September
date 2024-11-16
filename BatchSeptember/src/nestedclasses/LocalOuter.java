package nestedclasses;

public class LocalOuter {
	
	String name = "Outer class variable";
	
	void display() {
		int result = 200;
		
		class LocalInner
		{
			void execute() {
				System.out.println("outer class local variable"+result);
				System.out.println("outer class instance variable"+name);
			}
		}
		LocalInner obj = new LocalInner();
		obj.execute();
		
	}

	public static void main(String[] args) {
		LocalOuter obj = new LocalOuter();
		obj.display();
		

	}

}

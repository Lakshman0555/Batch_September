package constructor;

public class ConstructorEx {
	
	
	public ConstructorEx() {
		int a = 10,b=20;
		int c = a+b;
		System.out.println("constructor1 logic  "+c);
	}
	
	
	public ConstructorEx(int a ,int b) {
		int c = a+b;
		System.out.println("constructor2 logic   "+c);
	}
	
	public ConstructorEx(int a ,int b ,int c) {
		int d = a+b+c;
		System.out.println("constructor3 logic   "+d);
	}
	
	

	public static void main(String[] args) {
		ConstructorEx obj = new ConstructorEx();
		ConstructorEx obj1 = new ConstructorEx(500,600);
		ConstructorEx obj2 = new ConstructorEx(500,600,800);
		
		

	}

}

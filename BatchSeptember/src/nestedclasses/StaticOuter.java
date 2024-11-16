package nestedclasses;

public  class StaticOuter {
  
	static String data = "static variable";
	
	static void display() {
		System.out.println("outer class method block");
	}
	static class StaticInner{
		
		static int details = 476464;
		
		static void print() {
			System.out.println("inner class method block ");
			display();
			System.out.println(data);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		StaticOuter.StaticInner obj = new StaticOuter.StaticInner();
		obj.print();
		System.out.println(obj.details);
	display();
	System.out.println(data);
	
	StaticOuter.StaticInner.print();
	System.out.println(StaticOuter.StaticInner.details);
		
		
	

	}

}

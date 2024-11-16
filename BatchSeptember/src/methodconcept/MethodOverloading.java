package methodconcept;

public class MethodOverloading {
	
	void ravi(String son) {
		System.out.println("ravi son name is:"+son);
	}
	void ravi(String son , String daughter) {
		System.out.println("ravi son name is:" + son);
		System.out.println("ravi daughter name is:"+daughter);
	}

	public static void main(String[] args) {
		 MethodOverloading obj = new  MethodOverloading();
		 obj.ravi("raj","rekha");
		 obj.ravi("raj");
		 
		

	}

}

package methodconcept;

public class MethodExample {
	
	
	int addition() {
		int a = 30 , b =50;
		int c = a+b;
		return c;
		}
	
	int addition(int a1 ,int b1) {
		int c = a1+b1;
		return c;
	}
	int addition(int a1,int b1 ,int c1) {
		int d1 = a1+b1+c1;
		System.out.println(d1);
		return d1;
	}

	public static void main(String[] args) {
		MethodExample obj = new MethodExample();
		System.out.println(obj.addition());
		System.out.println(obj.addition(30, 40));
		System.out.println(obj.addition());
		System.out.println(obj.addition(1200, 1500));
		obj.addition(45,60, 100);
		
	

	}

}

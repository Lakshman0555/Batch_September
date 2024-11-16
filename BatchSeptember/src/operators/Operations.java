package operators;

public class Operations {
	int add(int a ,int b) {
		int c = a+b;
		System.out.println(c);
		return a;
	}
	int division(int a ,int b) {
		int c = a/b;
		System.out.println(c);
		return c;
		
	}

	public static void main(String[] args) {
		Operations obj = new Operations();
		obj.add(20, 30);
        obj.division(45, 5);
		
		
		
		

	}

}

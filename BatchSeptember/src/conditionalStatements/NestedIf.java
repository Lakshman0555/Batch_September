package conditionalStatements;

public class NestedIf {

	public static void main(String[] args) {
		int a = 5544,b=4456;
		if(a<=b) {
			System.out.println("a value is greater than b value");
			if(b>=a) {
				System.out.println("b value is lesser than a value");
			}
			else {
				System.out.println("inner else block statement");
			}
		}else {
			System.out.println("outer else block statement");
		}
		
		

	}

}

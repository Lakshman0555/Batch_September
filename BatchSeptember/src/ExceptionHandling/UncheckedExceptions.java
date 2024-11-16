package ExceptionHandling;

public class UncheckedExceptions {

	public static void main(String[] args) {
	int arr[] = new int[4];
	
	try {
	arr[4]  = 99/0;      
	System.out.println(arr[4]);
	}
	catch(NullPointerException e){
		System.out.println(e);
	}
	catch(StringIndexOutOfBoundsException e1) {
		System.out.println(e1);
	}
	catch(Exception e2) {
		System.out.println(e2);
	}
	finally {
		System.out.println("important stmtns");
	}
	
	
	System.out.println("rest of the program");
	System.out.println("rest of the program");
	System.out.println("rest of the program");
	System.out.println("rest of the program");
	System.out.println("rest of the program");
	

	}

}

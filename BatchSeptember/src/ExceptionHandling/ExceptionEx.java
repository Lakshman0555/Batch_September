package ExceptionHandling;

public class ExceptionEx {

	public static void main(String[] args) {
		float arr[] = new float[5];
		try {
			 String s1 = null;
			 System.out.println(s1.length());
			 }
		finally{
			System.out.println("important statements");
		}
		
		
		System.out.println("rest of stmtns");

	}

}

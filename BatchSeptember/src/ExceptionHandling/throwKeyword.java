package ExceptionHandling;

public class throwKeyword {
public static void validateAge(String name) {
		
		if(name== "arcus") {
			throw new NullPointerException("The student name is:"+name);
		}
		else {
			System.out.println("The student name is not correct");
		}
		}

	public static void main(String[] args) {
		
		validateAge("arcus");

	}

}

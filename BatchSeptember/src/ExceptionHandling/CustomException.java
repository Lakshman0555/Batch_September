package ExceptionHandling;

public class CustomException {
	
	public static void donateBlood(int weight) {
		if(weight>70) {
			 throw new  ArithmeticException("the person is eligible to donate blood");
		}
		else {
			throw new ArithmeticException("the person  is not eligible to donate bloood");
		}
	}

	public static void main(String[] args) {
		donateBlood(35);

	}

}

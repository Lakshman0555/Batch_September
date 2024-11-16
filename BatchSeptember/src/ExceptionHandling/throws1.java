package ExceptionHandling;

import java.io.IOException;

public class throws1 {
	void display() throws IOException{
		throw new IOException("Something went ");
		
	}

	public static void main(String[] args) throws IOException {
		throws1 obj = new throws1();
		obj.display();
		

	}

}

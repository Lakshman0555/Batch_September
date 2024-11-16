package conditionalStatements;

public class IfElseIf {

	public static void main(String[] args) {
		int marks  = 07;
		if(marks>=50&&marks<=60) {
			System.out.println("The student got D grade");
		}
		else if(marks>=61&&marks<=70) {
			System.out.println("The student got C grade");
		}
		else if(marks>=71&&marks<=80) {
			System.out.println("The student got B grade");
		}
		else if(marks>=81&&marks<=90) {
			System.out.println("the Student got A grade");
		}
		else if(marks>=91&&marks<=100) {
			System.out.println("The student got A+ grade");
		}
		else if(marks<50){
			System.out.println("Student got failed");
			
		}
		else {
			System.out.println("Invalid input details");
		}

	}

}

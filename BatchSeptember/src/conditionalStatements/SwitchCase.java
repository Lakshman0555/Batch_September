package conditionalStatements;

public class SwitchCase {

	public static void main(String[] args) {
              int marks = 60;
              switch(marks) {
              case 50:
            	  System.out.println("the student got 50 marks");
            	  System.out.println("This is case 1 block");
            	  break;
              case 60:
            	  System.out.println("the student got 60 marks");
            	  System.out.println("This is case 2 block");
            	  break;
              case 70:
            	  System.out.println("the student got 70 marks");
            	  break;
              case 80:
            	  System.out.println("the student got 80 marks");
            	  break;
              case 90:
            	  System.out.println("the student got 90 marks");
            	  break;
              case 100:
            	  System.out.println("the student got 100 marks");
            	  break;
            	  default:
            		  System.out.println("something went wrong");
            		  break;
              }

	}

}

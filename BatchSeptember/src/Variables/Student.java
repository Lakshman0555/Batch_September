package Variables;

public class Student {
	String name = "Akash";
	int age = 12;
	float percentage = 90.6f;     ///instance variables
	static  char gender = 'M'; //static variable

	
	void studying() {
		String school_name = "bhasyam";      //local variable
		System.out.println(school_name);
		System.out.println("The student is studying in the class");
		
	}
	void read() {
		
		System.out.println("The student is reading");
	}

	public static void main(String[] args) {
		int student_marks = 90;     //global variable
		Student obj = new Student(); 
		obj.studying();
		obj.read();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(gender);
		System.out.println(obj.percentage);
		System.out.println(student_marks);
		
		
		

	}

}

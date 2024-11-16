package operators;

public class Student {
	
	String student_name = "charan";
	int student_id = 55;
	float student_percentage = 90.08f;
	
	void play() {
		System.out.println("The student is playing in the ground");
	}
	void eat() {
		System.out.println("The student is eating in the class");
	}
	
	int add() {
		int a = 90 ,b =90;
		int c = a+b;
		System.out.println(c);
		return b;
	}
	
	int add(int a , int b) {
		int c = a+b;
		System.out.println("the addition of two numbers:"+c);
		return c;
	}
	int subtract() {
		int c =67,d = 87;
		int f = d-c;
		System.out.println("The subtraction of two numbers :  "+f);
		return c;
	}

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.student_name);
		System.out.println(obj.student_id);
		System.out.println(obj.student_percentage);
		obj.play();
		obj.eat();
		obj.add();
		obj.subtract();
		obj.add();
		obj.add();
		obj.add();
		obj.add(200, 300);
		System.out.println(obj.add(900, 550));
		System.out.println(obj.add(4444,5555));

	}

}

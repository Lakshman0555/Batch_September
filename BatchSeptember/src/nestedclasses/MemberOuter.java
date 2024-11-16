package nestedclasses;

public class MemberOuter {
	String school = "Don bosco";
	int count_of_students = 500;
	
	void display() {
		System.out.println("outer class method");
	}
	
	class MemberInner{
		float school_fees = 20000;
		void print() {
			display();
			System.out.println("Innner class variable:"+school_fees);
			System.out.println("outer class variable:" +school);
			System.out.println("outer class variable:"+count_of_students);
		}
		
		
	}

	public static void main(String[] args) {
		MemberOuter obj = new MemberOuter();
		MemberOuter.MemberInner obj1 = obj.new MemberInner();
		obj1.print();
		obj.display();
		
		

	}

}

package constructor;

public class Student1 {
	int age;int rollno;
	float percentage;
	String name ;
	String color;
	
	

	public Student1(int age, int rollno, float percentage, String name, String color) {
		
		this.age = age;
		
		this.rollno = rollno;
		this.percentage = percentage;
		this.name = name;
		this.color = color;
	}
void display() {
	System.out.println(name+" "+age+" "+percentage+" "+color+" "+rollno);
}


	public static void main(String[] args) {
		Student1 obj1 = new Student1(12,5555,95.06f,"karthik","white");
		obj1.display();
		Student1 obj2 = new Student1(11,5566,90.06f,"kumar","white");
		obj2.display();
		
		

	}

}

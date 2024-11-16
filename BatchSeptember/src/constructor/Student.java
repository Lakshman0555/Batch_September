package constructor;

public class Student {
	String name ;
	int age ;
	float height;
	char gender;
	
	
	Student(String name1 ,int age1,float height1,char gender1){
		name = name1;
		age = age1;
		height = height1;
		gender = gender1;
		
	}
	void display() {
		System.out.println(name+" "+age+" "+height+" "+gender);
	}
	

	public static void main(String[] args) {
		Student student1 = new Student("sai",5,4.5f,'m');
		student1.display();
		Student student2 = new Student("kumar",6,4.7f,'m');
		student2.display();
		Student student3 = new Student("kumari",6,4.7f,'f');
		student3.display();
		student1.display();
	

	}

}

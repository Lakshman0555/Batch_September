package operators;

public class Person {
	
	String person_name = "adhitya";
	int person_Age = 34;
	String color = "white";
	float height = 6.0f;
	int weight = 60;
	
	void working() {
		System.out.println("The person is working in the garden");
	}
	
	String motherDetails(String mother_name,int mother_age) {
		System.out.println("The person mother name is:"+mother_name);
		System.out.println("the person mother age is: "+mother_age);
		return mother_name;
	}

	public static void main(String[] args) {
		Person obj = new Person();
		obj.working();
		obj.motherDetails("lakshmi", 45);
		obj.motherDetails("raani", 40);
		obj.motherDetails("vaishanvi", 50);
		

	}

}

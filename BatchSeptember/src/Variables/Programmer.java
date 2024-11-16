package Variables;

public class Programmer {
	float Salary=50000f;
	String Position="Developer";
	String Company_nam="Arcus Infotech";
	static int Id=111;
	public static void main(String[] args) {
		Programmer obj=new Programmer();
		//obj.id();
		System.out.println("Company :"+obj.Company_nam);
		System.out.println("ID :"+Id);
		System.out.println("Salary :"+obj.Salary);
		System.out.println("Role :"+obj.Position);
	}

}

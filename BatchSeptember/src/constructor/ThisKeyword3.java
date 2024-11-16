package constructor;

public class ThisKeyword3 {
	 String name3 ;   //instance variable
	public ThisKeyword3(String name ) {
		System.out.println("First constructor block");
		System.out.println(name);
	}
	public ThisKeyword3(String name,String name1 ) {
		System.out.println("second constructor block");
		System.out.println(name + " "+name1);
       
	}
	public ThisKeyword3(String name,String name1,String name2 ) {
		System.out.println("Third constructor block");
		System.out.println(name+" "+name1+" "+name2);
		
	}
	public ThisKeyword3(String name,String name1,String name2,String name3 ) {
		this.name3 = name3;
		System.out.println("Four constructor block");
		System.out.println(name+" "+name1+" "+name2);
	}
	

	public static void main(String[] args) {
		ThisKeyword3 obj = new ThisKeyword3("arcus");
		ThisKeyword3 obj1 = new ThisKeyword3("arcus","infotech");
		ThisKeyword3 obj2 = new ThisKeyword3("arcus","infotech","ameerpet");
		ThisKeyword3 obj3 = new ThisKeyword3("arcus","infotech","ameerpet","hyderabad");
		System.out.println(obj3.name3 +"    instance variable value");
	
		
		

	}

}

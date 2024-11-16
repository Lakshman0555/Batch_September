package accessmodifiers1;

public  class First {
	
	public String name = "arcus";
	
	public  void sample() {
		System.out.println("First class method");
	}

	public static void main(String[] args) {
		First obj = new First();
		obj.sample();
		System.out.println(obj.name);

	}

}

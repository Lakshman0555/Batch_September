package Variables;

public class Keywords {
      
        void add(int a ,int b) {
           int c = a+b;
        	System.out.println(c);
        }
        String display(String name ,String age) {
        	System.out.println(name);
        	System.out.println(age);
        	return age;
        }
	

	public static void  main(String[] args) {
		Keywords obj = new Keywords();
		obj.add(30,20);
		obj.add(60,80);
		obj.add(120,150);
		obj.add(300,500);
		System.out.println("-------------------------------");
		obj.display("arcus", "15");
		

	}

}

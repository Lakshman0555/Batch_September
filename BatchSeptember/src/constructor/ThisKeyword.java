package constructor;

public class ThisKeyword {
	
	String company = "Deloitte";    //instance
	float share = 5000000f;        //instance
    int age = 50;       //instance
    
    void companyAudit() {
    	float share = 6000000f;   
    	String company = "Deloitte1";   
    	System.out.println(company);
    	System.out.println(this.company);
    	System.out.println(share);
    	System.out.println(this.share);
    }
    void display(int a ,int b) {
    	System.out.println(a+b);
    	System.out.println("this is a display method1");
    	this.companyAudit();
    }
    void display() {
    	System.out.println("this is display method2");
    	this.display(100, 200);
    }
//    public ThisKeyword() {
//    	int age = 60;
//    	System.out.println("age , local variable value:"+age);
//    	System.out.println("age , instance variable value:"+this.age);
//    }
//	
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		obj.display();
		
		
		

	}

}

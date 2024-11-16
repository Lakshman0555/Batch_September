package string;

public class StringObject {

	public static void main(String[] args) {
		String s1 = new String("rakesh");    //new keyword
		String s2 = "rakesh";               //literal method
		System.out.println(s1);
		System.out.println(s2);
		char arr1[] = {'a','r','c','u','s'};
		String s3 = new String(arr1);
		System.out.println(s3);
		String s4 = "Sachin";   //m1
		System.out.println(s4.charAt(1));
		System.out.println(s4.toUpperCase());    //concat()
		s4.concat("tendulkar");
		System.out.println(s4);
		String s5 = s4.concat("tendulkar");   //m2
		System.out.println(s5);
		String s6 = "    adithya  ";
//		System.out.println(s6.contains("hiit"));
//		System.out.println(s6.endsWith("tya"));
//		System.out.println(s6.indexOf('a'));
		System.out.println(s6.isEmpty());
        System.out.println(s6.length());
        System.out.println(s6.substring(4));
        System.out.println(s6.trim());
    
        String n1 = "sachin";
        n1.concat("tendulkar");
        System.out.println(n1);
        String n2 = n1.concat("tendulkar");    //n2  sachin tendulkar
        
        StringBuilder obj = new StringBuilder("sachin");
        obj.append("tendulkar");
        System.out.println(obj);
        
        StringBuffer obj1 = new StringBuffer("arcus");
        obj1.append("infotech");
        System.out.println(obj1);
        
       int Array[] = {1,2,3,4,5};
       for(int i:Array) {
    	   System.out.println(i);
    	   
       }
       for(int i=0;i<5;i++) {
    	   System.out.println(Array[i]);
       }
       
	}

}

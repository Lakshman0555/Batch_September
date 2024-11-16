package conditionalStatements;

public class Operators {

	public static void main(String[] args) {
		int a = 500 ,b = 400;
		System.out.println(a++);   //a = a+1   //a = 500+1  //a = 501  //500
		System.out.println("Post increment value:"+a);      //501
System.out.println(b--);   //b = b-1
System.out.println("post decrement value"+b);    //399
System.out.println("pre increment value"+ ++a);   //a = a+1   //a = 501+1  //502
System.out.println("pre decrement value"+ --b);   //b = b-1  // b= 399 - 1  //b = 398
System.out.println(~a);
System.out.println("Arithmetic Operators---------------------------------------");
System.out.println(a+b);
System.out.println(a - b);
System.out.println(a *b);
System.out.println(a/b);
int c = 25 ,d = 5;
System.out.println(c/d);
System.out.println(c%d);
System.out.println(a%b);
System.out.println("-------------Assginment operators------------------");
System.out.println(c+=50);    //c = c+50;   //c = 25 + 50;  //c = 75
System.out.println(c -= 100);     //c = c-100  //c = -25
System.out.println(c *= 5);   c = c*5;
System.out.println(~c);
System.out.println(d %=   100);    //d = d%100
System.out.println("---------------------bitwise operators---------------");
int k = 35 , l = 45, m =67;
System.out.println((k>l)&(m>l));
System.out.println((k>l)|(m>l));
System.out.println("---------------------logical operators---------------");
System.out.println((k>l)&&(m>l));
System.out.println((k>l)||(m>l));
System.out.println("---------------------relational operators---------------");
System.out.println(m>l);
System.out.println(m>=l);
System.out.println(k<l);  //true
System.out.println(k<=l);  //true
System.out.println(k == l);   //35 ==  45  //false
System.out.println(k != l);  //true
System.out.println("---------------------shift operators---------------");
int s = 10, t = 40;
System.out.println(s<<2);   //10*2^2     40
System.out.println(s>>2);    //10/2^2   2
System.out.println(s>>2);
System.out.println("---------------------ternary operators---------------");
System.out.println((s<t)?t:s);
	}

}

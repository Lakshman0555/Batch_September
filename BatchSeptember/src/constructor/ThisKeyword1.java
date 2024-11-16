package constructor;

public class ThisKeyword1 {
	void add(int a ,int b) {
		int c = a+b;
		System.out.println(c +"First method");
	}
	void add(int a ,int b,int c) {
		int d = a+b+c;
		System.out.println(d + "second method");
		this.add(20, 10);
	}
	void add(int a ,int b,int c,int d) {
		int e = a+b+c+d;
		System.out.println(e +"Third method");
		this.add(22,33,44);
	}

	public static void main(String[] args) {
		ThisKeyword1  obj = new ThisKeyword1();
		obj.add(44, 55, 66,77);
		

	}

}

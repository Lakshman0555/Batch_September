package nestedclasses;
public class TestAnonymousNestedClass {

	public static void main(String[] args) {
		Sample obj = new Sample(){    //name less
			void eat() {
				System.out.println("abstract class method1");
			}
			void work() {
				System.out.println("abstract class method2");
			}
			
		};
		obj.eat();
		obj.work();

	}

}




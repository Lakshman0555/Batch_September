package encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Doctor obj = new Doctor();
		obj.setDoctor_id(5665);
		obj.getDoctor_id();
		obj.setDoctor_name("ankith");
		obj.getDoctor_name();
		Doctor obj1 = new Doctor();
		obj1.setDoctor_id(6677);
		obj1.getDoctor_id();
		obj1.setDoctor_name("rohith");
		obj1.getDoctor_name();

	}

}

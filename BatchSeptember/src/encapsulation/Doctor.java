package encapsulation;

public class Doctor {
	
	private int doctor_id;
	private String doctor_name;
	private float doctor_salary;
	private char doctor_gender;
	private String doctor_specialist;
	private int working_hours;
	
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;    
	}
	public int getDoctor_id() {
		System.out.println(doctor_id);
		return doctor_id;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getDoctor_name() {
		System.out.println(doctor_name);
		return doctor_name;
	}
	public float getDoctor_salary() {
		return doctor_salary;
	}
	public void setDoctor_salary(float doctor_salary) {
		this.doctor_salary = doctor_salary;
	}
	public char getDoctor_gender() {
		return doctor_gender;
	}
	public void setDoctor_gender(char doctor_gender) {
		this.doctor_gender = doctor_gender;
	}
	public String getDoctor_specialist() {
		return doctor_specialist;
	}
	public void setDoctor_specialist(String doctor_specialist) {
		this.doctor_specialist = doctor_specialist;
	}
	public int getWorking_hours() {
		return working_hours;
	}
	public void setWorking_hours(int working_hours) {
		this.working_hours = working_hours;
	}
	
	

}

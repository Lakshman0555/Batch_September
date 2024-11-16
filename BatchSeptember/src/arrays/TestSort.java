package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(101,"vijay",23));
		s.add(new Student(102,"kumar",24));
		s.add(new Student(103,"lakshmi",25));
		
		Collections.sort(s);
		for(Student st:s) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}

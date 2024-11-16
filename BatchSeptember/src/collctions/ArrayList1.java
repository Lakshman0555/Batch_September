package collctions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("javascript");
		list.add("spring");
		list.add("springboot");
		list.add("react");
		list.add("python");
		list.add("python");
		list.add("java");
		
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("manual testing");
		list1.add("automation testing");
		list1.add("html");
		list1.add("css");
		list.addAll(list1);
		list1.remove(3);
		list1.remove(list1);
		
		System.out.println(list1);
		

	}

}

package collctions;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Ravi");
		list.add("raju");
		list.add("rajesh");
		list.add("ramesh");
		list.add("rupesh");   //
		list.add("raju");
		list.add(null);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Ravi");
		list1.add("555");
		list1.add("666");
		list1.add("777");
		list1.add("9999");
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		list.add(4, "ranganath");
		System.out.println(list);
		list.remove(9);
		System.out.println(list);

	}

}

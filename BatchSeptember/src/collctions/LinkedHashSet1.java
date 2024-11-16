package collctions;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		set.add("naresh");
//		set.add("naren");
//		set.add("naresh");
//		set.add("niroop");
//		set.add("nagendaer");
//		set.add(null);
//		System.out.println(set);
//		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		System.out.println("--------------------------------------");
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(555);
		tree.add(666);
		tree.add(777);
		tree.add(333);
		tree.add(111);
		tree.add(222);
		tree.add(555);
		//tree.add(null);
		Iterator itr1 = tree.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
		

	}

}

package collctions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(555);
		list.add(555);
		list.add(666);
		list.add(777);
		list.add(888);
		list.add(null);
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	Vector<Integer> vector = new Vector<Integer>();
  
	
	
	
	

}

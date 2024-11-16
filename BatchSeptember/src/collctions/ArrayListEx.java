package collctions;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple"); //0
		list.add("apple"); //1
		list.add("ball");  //2
		list.add("cat");  //3
		list.add("dog");
		list.add("ball");
		list.add(null);
		System.out.println(list);
		list.add(7, "carrot");
		System.out.println(list);
		list.add(3,"grapes");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
	}

}

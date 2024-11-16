package collctions;

import java.util.HashSet;
import java.util.Stack;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();	
				vec.add("nani");
				vec.add("naresh");
				vec.add("nazeer");
				vec.add("nani");
				vec.add(null);
				System.out.println(vec);
				
				Stack<Long> stack = new Stack<Long>();
				stack.push(65464767L);
				stack.push(65464767L);
				stack.push(65464767L);
				stack.push(65464767L);
				stack.push(null);
				System.out.println(stack);
				HashSet<String>  set = new HashSet<String>();
				set.add("apple");
				set.add("apple");
				set.add("ball");
				set.add("carrot");
				set.add(null);
				set.add("dog");
				System.out.println(set);
	
	}

}

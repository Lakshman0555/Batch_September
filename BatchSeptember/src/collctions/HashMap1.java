package collctions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(1, "apple");
	map.put(2, "banana");
	map.put(3, "carrot");
	map.put(5, "apple");
	System.out.println(map);
	
	Set set = map.entrySet();
	Iterator itr = set.iterator();
	while(itr.hasNext()) {
		Map.Entry entry =(Entry) itr.next();
		System.out.println(entry.getKey()+"-"+entry.getValue());
	}

	}

}

package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class TestIterators {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("TG");
		list.add("AP");
		list.add("TN");
		System.out.println(list);
		
		//list iterator 
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("TG", "Hyderabad");
		map.put("AP", "Vijayawada");
		map.put("TN", "Chennai");
		System.out.println(map);
		
		//hashmap iterator
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Capitol of "+key+" is "+map.get(key));
			
		}

	}

}

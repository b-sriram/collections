package collections;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> states = new ArrayList<String>();
		states.add("Telangana");
		states.add("AP");
		states.add("Karnataka");
		
		System.out.println(states);
		System.out.println("States Count: " + states.size());
		
		states.add("TamilNadu");
		System.out.println(states);
		
		states.remove(0);
		System.out.println(states);
		
		String name = states.get(1);
		System.out.println("State at 2nd position is : " + name);
		
		int pos = states.indexOf("TamilNadu");
		System.out.println("Tamil Nadu is at position: " + (pos+1));
		
		

	}

}

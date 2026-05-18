package org.example.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		
		name.add("Ashok");
		name.add("Amit");
		name.add("Arun");
		name.add("Shreya");
		name.add("Ayansh");
		
		System.out.println(name);
		
		//sort element
		Collections.sort(name);
		
		//sort element in reversed
//		Collections.sort(name.reversed());
		System.out.println(name);
		
		//retrieve by index wise
		System.out.println(name.get(2));
		
		//remove based on index
		//System.out.println(name.remove(4));
		
		//change value
		System.out.println(name.set(4, "Shradha"));
		
		System.out.println(name);
	}
}
